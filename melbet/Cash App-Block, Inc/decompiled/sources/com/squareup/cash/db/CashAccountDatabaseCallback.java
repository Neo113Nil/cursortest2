package com.squareup.cash.db;

import android.app.ActivityManager;
import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDiskIOException;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import androidx.sqlite.db.framework.FrameworkSQLiteDatabase;
import app.cash.local.primitives.BrandCollectionDataKt;
import app.cash.sqldelight.db.AfterVersion;
import app.cash.sqldelight.db.SqlDriver;
import app.cash.sqldelight.driver.android.AndroidSqliteDriver;
import app.cash.zipline.CallResult;
import com.jakewharton.processphoenix.ProcessPhoenix;
import com.squareup.cash.clientsync.EntitySyncerKt;
import com.squareup.cash.db.db.CashAccountDatabaseImpl;
import com.squareup.cash.db.db.CashAppDatabaseImpl;
import com.squareup.cash.db2.InstrumentQueries$$ExternalSyntheticLambda0;
import com.squareup.cash.observability.types.ErrorFeature;
import com.squareup.cash.observability.types.ErrorReporter;
import com.squareup.cash.pools.views.PoolGoalMetKt$$ExternalSyntheticLambda6;
import com.squareup.protos.cash.aegis.sync_values.Dependent;
import com.squareup.protos.cash.aegis.sync_values.FamilyAccount;
import com.squareup.protos.cash.aegis.sync_values.FamilyAccount$Type$Dependent;
import com.squareup.protos.cash.aegis.sync_values.FamilyAccount$Type$Sponsor;
import com.squareup.protos.cash.aegis.sync_values.Sponsor;
import com.squareup.protos.cash.aegis.sync_values.UiFamilyAccount;
import com.squareup.protos.cash.discover.api.app.v1.model.Text;
import com.squareup.protos.cash.discover.api.app.v1.model.TextDecoration;
import com.squareup.protos.cash.discover.api.app.v1.model.TextStyle;
import com.squareup.protos.cash.ui.Color;
import com.squareup.protos.cash.ui.Image;
import com.squareup.protos.common.CurrencyCode;
import com.squareup.protos.common.Money;
import com.squareup.protos.franklin.common.SyncCustomer;
import com.squareup.protos.franklin.common.SyncEntity;
import com.squareup.protos.franklin.ui.MerchantData;
import com.squareup.protos.franklin.ui.UiCustomer;
import com.squareup.util.android.StrictModes;
import com.squareup.util.cash.ColorsKt;
import com.squareup.wire.ProtoAdapter;
import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.MapsKt__MapsJVMKt;
import kotlin.collections.SetsKt__SetsJVMKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.text.StringsKt__IndentKt;
import okio.Utf8;
import timber.log.Timber;

/* loaded from: classes.dex */
public final class CashAccountDatabaseCallback extends SupportSQLiteOpenHelper.Callback {
    public final Context context;
    public final ErrorReporter errorReporter;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CashAccountDatabaseCallback(Context context, ErrorReporter errorReporter) {
        super(863);
        Reflection.factory.getOrCreateKotlinClass(CashAccountDatabaseImpl.class);
        this.context = context;
        this.errorReporter = errorReporter;
    }

    public static void createColumnIfNotExists(SupportSQLiteDatabase supportSQLiteDatabase, String str, String str2, String str3, String str4) {
        Cursor query = supportSQLiteDatabase.query("SELECT * FROM " + str + " LIMIT 1");
        try {
            if (query.getColumnIndex(str2) < 0) {
                StringBuilder sb = new StringBuilder();
                sb.append("ALTER TABLE " + str + " ADD COLUMN " + str2 + " " + str3);
                if (str4 != null && str4.length() != 0) {
                    sb.append(" DEFAULT ".concat(str4));
                }
                sb.append(';');
                supportSQLiteDatabase.execSQL(sb.toString());
            }
            query.close();
        } finally {
        }
    }

    public static void migrateUnhandledEntities(FrameworkSQLiteDatabase frameworkSQLiteDatabase) {
        Cursor query = frameworkSQLiteDatabase.query(new CallResult("SELECT entity_id, entity, entity_processor_version FROM unhandled_sync_entity"));
        while (query.moveToNext()) {
            try {
                String string2 = query.getString(0);
                byte[] blob = query.getBlob(1);
                ProtoAdapter protoAdapter = SyncEntity.ADAPTER;
                blob.getClass();
                frameworkSQLiteDatabase.delegate.execSQL("INSERT OR REPLACE INTO new_unhandled_sync_entity\nVALUES (?, ?, ?, ?);", new Serializable[]{string2, Long.valueOf(EntitySyncerKt.rawEntityType((SyncEntity) protoAdapter.decode(blob))), blob, Long.valueOf(query.getLong(2))});
            } finally {
            }
        }
        query.close();
    }

    public static void restoreEntityProcessorVersionColumn(FrameworkSQLiteDatabase frameworkSQLiteDatabase) {
        boolean z;
        SQLiteDatabase sQLiteDatabase = frameworkSQLiteDatabase.delegate;
        Cursor query = frameworkSQLiteDatabase.query(new CallResult("PRAGMA table_info(\"sync_entity\")"));
        while (true) {
            try {
                if (!query.moveToNext()) {
                    z = false;
                    break;
                } else {
                    z = true;
                    if (Intrinsics.areEqual(query.getString(1), "entity_processor_version")) {
                        break;
                    }
                }
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    Utf8.closeFinally(query, th);
                    throw th2;
                }
            }
        }
        query.close();
        if (z) {
            return;
        }
        sQLiteDatabase.execSQL("CREATE TABLE sync_entity_temp (\n  entity_id TEXT NOT NULL,\n  type INTEGER NOT NULL,\n  entity BLOB NOT NULL,\n  entity_processor_version INTEGER DEFAULT 0,\n  sync_value_type INTEGER DEFAULT NULL,\n  sync_entity_version INTEGER DEFAULT NULL,\n  PRIMARY KEY (entity_id, type)\n);");
        sQLiteDatabase.execSQL("INSERT INTO sync_entity_temp (entity_id, type, entity, entity_processor_version, sync_value_type, sync_entity_version)\nSELECT entity_id, type, entity, NULL, sync_value_type, sync_entity_version\nFROM sync_entity;");
        sQLiteDatabase.execSQL("DROP INDEX IF EXISTS sync_value_types;");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS sync_entity;");
        sQLiteDatabase.execSQL("ALTER TABLE sync_entity_temp RENAME TO sync_entity;");
        sQLiteDatabase.execSQL("CREATE INDEX IF NOT EXISTS entity_processor_version_index ON sync_entity (entity_processor_version);");
        sQLiteDatabase.execSQL("CREATE INDEX IF NOT EXISTS sync_value_types ON sync_entity (sync_value_type);");
    }

    public final void clearDataAndRestart() {
        this.errorReporter.report(new DatabaseError(new UnsupportedOperationException("Clearing data and restarting.")), ErrorReporter.DefaultSamplingStrategy.INSTANCE);
        Context context = this.context;
        Object systemService = context.getSystemService("activity");
        systemService.getClass();
        ((ActivityManager) systemService).clearApplicationUserData();
        ProcessPhoenix.triggerRebirth(context);
    }

    @Override // androidx.sqlite.db.SupportSQLiteOpenHelper.Callback
    public final void onCreate(FrameworkSQLiteDatabase frameworkSQLiteDatabase) {
        CashAppDatabaseImpl.Schema schema = CashAppDatabaseImpl.Schema.INSTANCE$1;
        try {
            AndroidSqliteDriver androidSqliteDriver = new AndroidSqliteDriver(frameworkSQLiteDatabase, 0);
            Reflection.factory.getOrCreateKotlinClass(CashAccountDatabaseImpl.class);
            schema.m3520create0iQ1z0(androidSqliteDriver);
        } catch (Throwable th) {
            DatabaseError databaseError = new DatabaseError("Failed to create database", th);
            this.errorReporter.report(databaseError, ErrorReporter.DefaultSamplingStrategy.INSTANCE);
            throw databaseError;
        }
    }

    @Override // androidx.sqlite.db.SupportSQLiteOpenHelper.Callback
    public final void onOpen(FrameworkSQLiteDatabase frameworkSQLiteDatabase) {
        frameworkSQLiteDatabase.delegate.execSQL("PRAGMA foreign_keys = ON;");
        try {
            frameworkSQLiteDatabase.enableWriteAheadLogging();
        } catch (SQLiteDiskIOException unused) {
        }
    }

    @Override // androidx.sqlite.db.SupportSQLiteOpenHelper.Callback
    public final void onUpgrade(final FrameworkSQLiteDatabase frameworkSQLiteDatabase, final int i, final int i2) {
        final CashAccountDatabaseCallback cashAccountDatabaseCallback = this;
        final int i3 = i;
        int i4 = i2;
        SQLiteDatabase sQLiteDatabase = frameworkSQLiteDatabase.delegate;
        CashAppDatabaseImpl.Schema schema = CashAppDatabaseImpl.Schema.INSTANCE$1;
        try {
            if (i3 < 86) {
                CashAccountDatabaseCallbackKt.access$blowAwayDb(frameworkSQLiteDatabase);
                onCreate(frameworkSQLiteDatabase);
                return;
            }
            final int i5 = 1;
            final int i6 = 0;
            if (i3 == 833) {
                Cursor query = frameworkSQLiteDatabase.query(new CallResult("SELECT name FROM sqlite_master WHERE type = 'table' AND name IN ('popupMessage', 'inlineMessage')"));
                try {
                    boolean z = query.getCount() < 2;
                    query.close();
                    if (z) {
                        CashAccountDatabaseCallbackKt.access$blowAwayDb(frameworkSQLiteDatabase);
                        onCreate(frameworkSQLiteDatabase);
                        return;
                    }
                } finally {
                }
            }
            sQLiteDatabase.execSQL("PRAGMA legacy_alter_table=ON;");
            AndroidSqliteDriver androidSqliteDriver = new AndroidSqliteDriver(frameworkSQLiteDatabase, 0);
            Reflection.factory.getOrCreateKotlinClass(CashAccountDatabaseImpl.class);
            long j = i3;
            long j2 = i4;
            AfterVersion afterVersion = new AfterVersion(128L, new Function1(cashAccountDatabaseCallback) { // from class: com.squareup.cash.db.CashAccountDatabaseCallback$$ExternalSyntheticLambda0
                /* JADX WARN: Code restructure failed: missing block: B:290:0x03f0, code lost:
                
                    if (r3 == null) goto L386;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:302:0x03f2, code lost:
                
                    r1.execSQL("UPDATE new_customer \nSET \n  photo = ?\nWHERE customer_id = ?", new java.io.Serializable[]{com.squareup.protos.cash.ui.Image.ADAPTER.encode(new com.squareup.protos.cash.ui.Image(r3, r3, 4)), java.lang.Integer.valueOf(r0)});
                 */
                /* JADX WARN: Finally extract failed */
                @Override // kotlin.jvm.functions.Function1
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object invoke(Object obj) {
                    Cursor query2;
                    String str;
                    String str2;
                    String name;
                    Sponsor sponsor;
                    Dependent dependent;
                    SyncEntity syncEntity;
                    SyncEntity syncEntity2;
                    SyncEntity syncEntity3;
                    SyncEntity syncEntity4;
                    SyncCustomer syncCustomer;
                    UiCustomer uiCustomer;
                    int i7 = i6;
                    FrameworkSQLiteDatabase frameworkSQLiteDatabase2 = frameworkSQLiteDatabase;
                    switch (i7) {
                        case 0:
                            ((SqlDriver) obj).getClass();
                            query2 = frameworkSQLiteDatabase2.query(new CallResult("SELECT customer_id, merchant_data FROM customer"));
                            while (query2.moveToNext()) {
                                try {
                                    String string2 = query2.getString(0);
                                    byte[] blob = query2.isNull(1) ? null : query2.getBlob(1);
                                    if (blob != null) {
                                        String str3 = ((MerchantData) MerchantData.ADAPTER.decode(blob)).category;
                                        if (str3 != null) {
                                            str = "'" + str3 + "'";
                                        } else {
                                            str = null;
                                        }
                                        frameworkSQLiteDatabase2.delegate.execSQL(StringsKt__IndentKt.replaceIndent("\n              |UPDATE customer\n              |SET category = " + str + "\n              |WHERE customer_id = '" + string2 + "'\n            "));
                                    }
                                } catch (Throwable th) {
                                    try {
                                        throw th;
                                    } finally {
                                    }
                                }
                            }
                            query2.close();
                            return Unit.INSTANCE;
                        case 1:
                            ((SqlDriver) obj).getClass();
                            query2 = frameworkSQLiteDatabase2.query(new CallResult("SELECT _id, amount FROM payment"));
                            while (query2.moveToNext()) {
                                try {
                                    int i8 = query2.getInt(0);
                                    byte[] blob2 = query2.isNull(1) ? null : query2.getBlob(1);
                                    if (blob2 != null) {
                                        Money money = (Money) Money.ADAPTER.decode(blob2);
                                        Long l = money.amount;
                                        CurrencyCode currencyCode = money.currency_code;
                                        if (currencyCode == null || (name = currencyCode.name()) == null) {
                                            str2 = null;
                                        } else {
                                            str2 = "'" + name + "'";
                                        }
                                        frameworkSQLiteDatabase2.delegate.execSQL(StringsKt__IndentKt.trimMargin$default("\n            |UPDATE new_payment \n            |SET \n            |  amount = " + l + ", \n            |  amount_currency = " + str2 + "\n            |WHERE _id = " + i8 + "\n            "));
                                    }
                                } catch (Throwable th2) {
                                    try {
                                        throw th2;
                                    } finally {
                                    }
                                }
                            }
                            query2.close();
                            return Unit.INSTANCE;
                        case 2:
                            SQLiteDatabase sQLiteDatabase2 = frameworkSQLiteDatabase2.delegate;
                            ((SqlDriver) obj).getClass();
                            query2 = frameworkSQLiteDatabase2.query(new CallResult("SELECT customer_id, photo_url, photo, accent_color, themed_accent_color FROM customer"));
                            while (query2.moveToNext()) {
                                try {
                                    int i9 = query2.getInt(0);
                                    String string3 = query2.isNull(1) ? null : query2.getString(1);
                                    byte[] blob3 = query2.isNull(2) ? null : query2.getBlob(2);
                                    Image image = blob3 != null ? (Image) Image.ADAPTER.decode(blob3) : null;
                                    String string4 = query2.isNull(3) ? null : query2.getString(3);
                                    byte[] blob4 = query2.isNull(4) ? null : query2.getBlob(4);
                                    Color color = blob4 != null ? (Color) Color.ADAPTER.decode(blob4) : null;
                                    if (image == null && string3 != null && color == null && string4 != null) {
                                        sQLiteDatabase2.execSQL("UPDATE new_customer \nSET \n  photo = ?,\n  themed_accent_color = ?\nWHERE customer_id = ?", new Serializable[]{Image.ADAPTER.encode(new Image(string3, string3, 4)), Color.ADAPTER.encode(ColorsKt.toColor(string4)), Integer.valueOf(i9)});
                                    } else if (color == null && string4 != null) {
                                        sQLiteDatabase2.execSQL("UPDATE new_customer \nSET \n  themed_accent_color = ?\nWHERE customer_id = ?", new Serializable[]{Color.ADAPTER.encode(ColorsKt.toColor(string4)), Integer.valueOf(i9)});
                                    }
                                } catch (Throwable th22) {
                                    try {
                                        throw th22;
                                    } finally {
                                    }
                                }
                            }
                            query2.close();
                            return Unit.INSTANCE;
                        case 3:
                            ((SqlDriver) obj).getClass();
                            CashAccountDatabaseCallback.createColumnIfNotExists(frameworkSQLiteDatabase2, "creditLine", "lending_product", "TEXT", null);
                            CashAccountDatabaseCallback.createColumnIfNotExists(frameworkSQLiteDatabase2, "loan", "lending_product", "TEXT", null);
                            CashAccountDatabaseCallback.createColumnIfNotExists(frameworkSQLiteDatabase2, "loanTransaction", "lending_product", "TEXT", null);
                            CashAccountDatabaseCallback.createColumnIfNotExists(frameworkSQLiteDatabase2, "payment", "lending_loan_token", "TEXT", "NULL");
                            CashAccountDatabaseCallback.createColumnIfNotExists(frameworkSQLiteDatabase2, "loan", "bnpl_data", "BLOB", null);
                            return Unit.INSTANCE;
                        case 4:
                            ((SqlDriver) obj).getClass();
                            query2 = frameworkSQLiteDatabase2.query(new CallResult("SELECT count(*) FROM paperDepositBarcodeInfo"));
                            try {
                                query2.moveToNext();
                                if (query2.getInt(0) == 0) {
                                    frameworkSQLiteDatabase2.delegate.execSQL("INSERT INTO paperDepositBarcodeInfo DEFAULT VALUES;");
                                }
                                query2.close();
                                return Unit.INSTANCE;
                            } finally {
                                try {
                                    throw th22;
                                } finally {
                                }
                            }
                        case 5:
                            ((SqlDriver) obj).getClass();
                            query2 = frameworkSQLiteDatabase2.query(new CallResult("SELECT * FROM profileDirectorySection"));
                            while (query2.moveToNext()) {
                                try {
                                    int i10 = query2.getInt(0);
                                    String string5 = query2.isNull(1) ? null : query2.getString(1);
                                    if (string5 != null) {
                                        frameworkSQLiteDatabase2.delegate.execSQL(StringsKt__IndentKt.trimMargin$default("\n            |UPDATE profileDirectorySection\n            |SET \n            |  text_title = ?\n            |WHERE id = " + i10 + "\n            "), new byte[][]{Text.ADAPTER.encode(new Text(string5, (TextStyle) null, (TextDecoration) null, (Color) null, (Image) null, 62))});
                                    }
                                } finally {
                                    try {
                                        throw th22;
                                    } finally {
                                    }
                                }
                            }
                            query2.close();
                            return Unit.INSTANCE;
                        case 6:
                            ((SqlDriver) obj).getClass();
                            query2 = frameworkSQLiteDatabase2.query(new CallResult("SELECT entity_id, customer_token, family_account FROM familyAccount"));
                            while (query2.moveToNext()) {
                                try {
                                    String string6 = query2.getString(0);
                                    byte[] blob5 = query2.isNull(2) ? null : query2.getBlob(2);
                                    if (blob5 != null) {
                                        UiFamilyAccount uiFamilyAccount = (UiFamilyAccount) UiFamilyAccount.ADAPTER.decode(blob5);
                                        Object[] objArr = new Serializable[3];
                                        objArr[0] = string6;
                                        FamilyAccount familyAccount = uiFamilyAccount.family_account;
                                        BrandCollectionDataKt brandCollectionDataKt = familyAccount != null ? familyAccount.f1246type : null;
                                        FamilyAccount$Type$Dependent familyAccount$Type$Dependent = brandCollectionDataKt instanceof FamilyAccount$Type$Dependent ? (FamilyAccount$Type$Dependent) brandCollectionDataKt : null;
                                        objArr[1] = (familyAccount$Type$Dependent == null || (dependent = familyAccount$Type$Dependent.value) == null) ? null : Dependent.ADAPTER.encode(dependent);
                                        FamilyAccount familyAccount2 = uiFamilyAccount.family_account;
                                        BrandCollectionDataKt brandCollectionDataKt2 = familyAccount2 != null ? familyAccount2.f1246type : null;
                                        FamilyAccount$Type$Sponsor familyAccount$Type$Sponsor = brandCollectionDataKt2 instanceof FamilyAccount$Type$Sponsor ? (FamilyAccount$Type$Sponsor) brandCollectionDataKt2 : null;
                                        objArr[2] = (familyAccount$Type$Sponsor == null || (sponsor = familyAccount$Type$Sponsor.value) == null) ? null : Sponsor.ADAPTER.encode(sponsor);
                                        frameworkSQLiteDatabase2.delegate.execSQL("INSERT INTO family_account(entity_id, dependent, sponsor)\nVALUES (?, ?, ?)", objArr);
                                    }
                                } catch (Throwable th222) {
                                    try {
                                        throw th222;
                                    } finally {
                                    }
                                }
                            }
                            query2.close();
                            return Unit.INSTANCE;
                        case 7:
                            ((SqlDriver) obj).getClass();
                            CashAccountDatabaseCallback.createColumnIfNotExists(frameworkSQLiteDatabase2, "inAppNotificationMessage", "avatar", "BLOB", null);
                            return Unit.INSTANCE;
                        case 8:
                            SQLiteDatabase sQLiteDatabase3 = frameworkSQLiteDatabase2.delegate;
                            ((SqlDriver) obj).getClass();
                            query2 = frameworkSQLiteDatabase2.query(new CallResult("SELECT entity_id, entity FROM sync_entity"));
                            while (query2.moveToNext()) {
                                try {
                                    String string7 = query2.getString(0);
                                    byte[] blob6 = query2.isNull(1) ? null : query2.getBlob(1);
                                    if (blob6 != null && (syncEntity = (SyncEntity) SyncEntity.ADAPTER.decode(blob6)) != null) {
                                        Long l2 = syncEntity.version;
                                        sQLiteDatabase3.execSQL("UPDATE sync_entity \nSET \n  sync_entity_version = ?\nWHERE entity_id = ?", new Object[]{l2, string7});
                                        if (syncEntity.payment != null) {
                                            sQLiteDatabase3.execSQL("UPDATE payment\nSET \n  sync_entity_version = ?\nWHERE entity_id = ?", new Object[]{l2, string7});
                                        }
                                    }
                                } finally {
                                    try {
                                        throw th222;
                                    } finally {
                                    }
                                }
                            }
                            query2.close();
                            return Unit.INSTANCE;
                        case 9:
                            ((SqlDriver) obj).getClass();
                            query2 = frameworkSQLiteDatabase2.query(new CallResult("SELECT entity_id, entity_type, entity FROM unhandled_sync_entity"));
                            while (query2.moveToNext()) {
                                try {
                                    String string8 = query2.getString(0);
                                    int i11 = query2.getInt(1);
                                    byte[] blob7 = query2.isNull(2) ? null : query2.getBlob(2);
                                    if (blob7 != null && (syncEntity2 = (SyncEntity) SyncEntity.ADAPTER.decode(blob7)) != null) {
                                        frameworkSQLiteDatabase2.delegate.execSQL("UPDATE unhandled_sync_entity\nSET\n  entity_version = ?\nWHERE entity_id = ? AND entity_type = ?", new Object[]{syncEntity2.version, string8, Integer.valueOf(i11)});
                                    }
                                } finally {
                                    try {
                                        throw th222;
                                    } finally {
                                    }
                                }
                            }
                            query2.close();
                            return Unit.INSTANCE;
                        case 10:
                            ((SqlDriver) obj).getClass();
                            query2 = frameworkSQLiteDatabase2.query(new CallResult("SELECT entity_id, entity, entity_processor_version, sync_value_type, sync_entity_version\nFROM sync_entity"));
                            while (query2.moveToNext()) {
                                try {
                                    String string9 = query2.getString(0);
                                    byte[] blob8 = query2.isNull(1) ? null : query2.getBlob(1);
                                    if (blob8 != null && (syncEntity3 = (SyncEntity) SyncEntity.ADAPTER.decode(blob8)) != null) {
                                        frameworkSQLiteDatabase2.delegate.execSQL("INSERT OR REPLACE INTO new_sync_entity\nVALUES (?, ?, ?, ?, ?, ?);", new Serializable[]{string9, Long.valueOf(EntitySyncerKt.rawEntityType(syncEntity3)), blob8, query2.isNull(2) ? null : Long.valueOf(query2.getLong(2)), query2.isNull(3) ? null : Long.valueOf(query2.getLong(3)), query2.isNull(4) ? null : Long.valueOf(query2.getLong(4))});
                                    }
                                } finally {
                                    try {
                                        throw th222;
                                    } finally {
                                    }
                                }
                            }
                            query2.close();
                            return Unit.INSTANCE;
                        case 11:
                            ((SqlDriver) obj).getClass();
                            CashAccountDatabaseCallback.restoreEntityProcessorVersionColumn(frameworkSQLiteDatabase2);
                            return Unit.INSTANCE;
                        case 12:
                            ((SqlDriver) obj).getClass();
                            CashAccountDatabaseCallback.restoreEntityProcessorVersionColumn(frameworkSQLiteDatabase2);
                            return Unit.INSTANCE;
                        default:
                            ((SqlDriver) obj).getClass();
                            query2 = frameworkSQLiteDatabase2.query(new CallResult("SELECT entity_id, entity FROM sync_entity WHERE type = 2"));
                            while (query2.moveToNext()) {
                                try {
                                    byte[] blob9 = query2.isNull(1) ? null : query2.getBlob(1);
                                    if (blob9 != null && (syncEntity4 = (SyncEntity) SyncEntity.ADAPTER.decode(blob9)) != null && (syncCustomer = syncEntity4.customer) != null && (uiCustomer = syncCustomer.customer) != null) {
                                        frameworkSQLiteDatabase2.delegate.execSQL("UPDATE customer SET is_special_customer = ? WHERE customer_id = ?", new Object[]{Long.valueOf(Intrinsics.areEqual(uiCustomer.is_special_customer, Boolean.TRUE) ? 1L : 0L), uiCustomer.id});
                                    }
                                } finally {
                                }
                            }
                            query2.close();
                            return Unit.INSTANCE;
                    }
                }
            });
            try {
                AfterVersion afterVersion2 = new AfterVersion(432L, new Function1(cashAccountDatabaseCallback) { // from class: com.squareup.cash.db.CashAccountDatabaseCallback$$ExternalSyntheticLambda0
                    /* JADX WARN: Code restructure failed: missing block: B:290:0x03f0, code lost:
                    
                        if (r3 == null) goto L386;
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:302:0x03f2, code lost:
                    
                        r1.execSQL("UPDATE new_customer \nSET \n  photo = ?\nWHERE customer_id = ?", new java.io.Serializable[]{com.squareup.protos.cash.ui.Image.ADAPTER.encode(new com.squareup.protos.cash.ui.Image(r3, r3, 4)), java.lang.Integer.valueOf(r0)});
                     */
                    /* JADX WARN: Finally extract failed */
                    @Override // kotlin.jvm.functions.Function1
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                    */
                    public final Object invoke(Object obj) {
                        Cursor query2;
                        String str;
                        String str2;
                        String name;
                        Sponsor sponsor;
                        Dependent dependent;
                        SyncEntity syncEntity;
                        SyncEntity syncEntity2;
                        SyncEntity syncEntity3;
                        SyncEntity syncEntity4;
                        SyncCustomer syncCustomer;
                        UiCustomer uiCustomer;
                        int i7 = i5;
                        FrameworkSQLiteDatabase frameworkSQLiteDatabase2 = frameworkSQLiteDatabase;
                        switch (i7) {
                            case 0:
                                ((SqlDriver) obj).getClass();
                                query2 = frameworkSQLiteDatabase2.query(new CallResult("SELECT customer_id, merchant_data FROM customer"));
                                while (query2.moveToNext()) {
                                    try {
                                        String string2 = query2.getString(0);
                                        byte[] blob = query2.isNull(1) ? null : query2.getBlob(1);
                                        if (blob != null) {
                                            String str3 = ((MerchantData) MerchantData.ADAPTER.decode(blob)).category;
                                            if (str3 != null) {
                                                str = "'" + str3 + "'";
                                            } else {
                                                str = null;
                                            }
                                            frameworkSQLiteDatabase2.delegate.execSQL(StringsKt__IndentKt.replaceIndent("\n              |UPDATE customer\n              |SET category = " + str + "\n              |WHERE customer_id = '" + string2 + "'\n            "));
                                        }
                                    } catch (Throwable th222) {
                                        try {
                                            throw th222;
                                        } finally {
                                        }
                                    }
                                }
                                query2.close();
                                return Unit.INSTANCE;
                            case 1:
                                ((SqlDriver) obj).getClass();
                                query2 = frameworkSQLiteDatabase2.query(new CallResult("SELECT _id, amount FROM payment"));
                                while (query2.moveToNext()) {
                                    try {
                                        int i8 = query2.getInt(0);
                                        byte[] blob2 = query2.isNull(1) ? null : query2.getBlob(1);
                                        if (blob2 != null) {
                                            Money money = (Money) Money.ADAPTER.decode(blob2);
                                            Long l = money.amount;
                                            CurrencyCode currencyCode = money.currency_code;
                                            if (currencyCode == null || (name = currencyCode.name()) == null) {
                                                str2 = null;
                                            } else {
                                                str2 = "'" + name + "'";
                                            }
                                            frameworkSQLiteDatabase2.delegate.execSQL(StringsKt__IndentKt.trimMargin$default("\n            |UPDATE new_payment \n            |SET \n            |  amount = " + l + ", \n            |  amount_currency = " + str2 + "\n            |WHERE _id = " + i8 + "\n            "));
                                        }
                                    } catch (Throwable th2222) {
                                        try {
                                            throw th2222;
                                        } finally {
                                        }
                                    }
                                }
                                query2.close();
                                return Unit.INSTANCE;
                            case 2:
                                SQLiteDatabase sQLiteDatabase2 = frameworkSQLiteDatabase2.delegate;
                                ((SqlDriver) obj).getClass();
                                query2 = frameworkSQLiteDatabase2.query(new CallResult("SELECT customer_id, photo_url, photo, accent_color, themed_accent_color FROM customer"));
                                while (query2.moveToNext()) {
                                    try {
                                        int i9 = query2.getInt(0);
                                        String string3 = query2.isNull(1) ? null : query2.getString(1);
                                        byte[] blob3 = query2.isNull(2) ? null : query2.getBlob(2);
                                        Image image = blob3 != null ? (Image) Image.ADAPTER.decode(blob3) : null;
                                        String string4 = query2.isNull(3) ? null : query2.getString(3);
                                        byte[] blob4 = query2.isNull(4) ? null : query2.getBlob(4);
                                        Color color = blob4 != null ? (Color) Color.ADAPTER.decode(blob4) : null;
                                        if (image == null && string3 != null && color == null && string4 != null) {
                                            sQLiteDatabase2.execSQL("UPDATE new_customer \nSET \n  photo = ?,\n  themed_accent_color = ?\nWHERE customer_id = ?", new Serializable[]{Image.ADAPTER.encode(new Image(string3, string3, 4)), Color.ADAPTER.encode(ColorsKt.toColor(string4)), Integer.valueOf(i9)});
                                        } else if (color == null && string4 != null) {
                                            sQLiteDatabase2.execSQL("UPDATE new_customer \nSET \n  themed_accent_color = ?\nWHERE customer_id = ?", new Serializable[]{Color.ADAPTER.encode(ColorsKt.toColor(string4)), Integer.valueOf(i9)});
                                        }
                                    } catch (Throwable th22222) {
                                        try {
                                            throw th22222;
                                        } finally {
                                        }
                                    }
                                }
                                query2.close();
                                return Unit.INSTANCE;
                            case 3:
                                ((SqlDriver) obj).getClass();
                                CashAccountDatabaseCallback.createColumnIfNotExists(frameworkSQLiteDatabase2, "creditLine", "lending_product", "TEXT", null);
                                CashAccountDatabaseCallback.createColumnIfNotExists(frameworkSQLiteDatabase2, "loan", "lending_product", "TEXT", null);
                                CashAccountDatabaseCallback.createColumnIfNotExists(frameworkSQLiteDatabase2, "loanTransaction", "lending_product", "TEXT", null);
                                CashAccountDatabaseCallback.createColumnIfNotExists(frameworkSQLiteDatabase2, "payment", "lending_loan_token", "TEXT", "NULL");
                                CashAccountDatabaseCallback.createColumnIfNotExists(frameworkSQLiteDatabase2, "loan", "bnpl_data", "BLOB", null);
                                return Unit.INSTANCE;
                            case 4:
                                ((SqlDriver) obj).getClass();
                                query2 = frameworkSQLiteDatabase2.query(new CallResult("SELECT count(*) FROM paperDepositBarcodeInfo"));
                                try {
                                    query2.moveToNext();
                                    if (query2.getInt(0) == 0) {
                                        frameworkSQLiteDatabase2.delegate.execSQL("INSERT INTO paperDepositBarcodeInfo DEFAULT VALUES;");
                                    }
                                    query2.close();
                                    return Unit.INSTANCE;
                                } finally {
                                    try {
                                        throw th22222;
                                    } finally {
                                    }
                                }
                            case 5:
                                ((SqlDriver) obj).getClass();
                                query2 = frameworkSQLiteDatabase2.query(new CallResult("SELECT * FROM profileDirectorySection"));
                                while (query2.moveToNext()) {
                                    try {
                                        int i10 = query2.getInt(0);
                                        String string5 = query2.isNull(1) ? null : query2.getString(1);
                                        if (string5 != null) {
                                            frameworkSQLiteDatabase2.delegate.execSQL(StringsKt__IndentKt.trimMargin$default("\n            |UPDATE profileDirectorySection\n            |SET \n            |  text_title = ?\n            |WHERE id = " + i10 + "\n            "), new byte[][]{Text.ADAPTER.encode(new Text(string5, (TextStyle) null, (TextDecoration) null, (Color) null, (Image) null, 62))});
                                        }
                                    } finally {
                                        try {
                                            throw th22222;
                                        } finally {
                                        }
                                    }
                                }
                                query2.close();
                                return Unit.INSTANCE;
                            case 6:
                                ((SqlDriver) obj).getClass();
                                query2 = frameworkSQLiteDatabase2.query(new CallResult("SELECT entity_id, customer_token, family_account FROM familyAccount"));
                                while (query2.moveToNext()) {
                                    try {
                                        String string6 = query2.getString(0);
                                        byte[] blob5 = query2.isNull(2) ? null : query2.getBlob(2);
                                        if (blob5 != null) {
                                            UiFamilyAccount uiFamilyAccount = (UiFamilyAccount) UiFamilyAccount.ADAPTER.decode(blob5);
                                            Object[] objArr = new Serializable[3];
                                            objArr[0] = string6;
                                            FamilyAccount familyAccount = uiFamilyAccount.family_account;
                                            BrandCollectionDataKt brandCollectionDataKt = familyAccount != null ? familyAccount.f1246type : null;
                                            FamilyAccount$Type$Dependent familyAccount$Type$Dependent = brandCollectionDataKt instanceof FamilyAccount$Type$Dependent ? (FamilyAccount$Type$Dependent) brandCollectionDataKt : null;
                                            objArr[1] = (familyAccount$Type$Dependent == null || (dependent = familyAccount$Type$Dependent.value) == null) ? null : Dependent.ADAPTER.encode(dependent);
                                            FamilyAccount familyAccount2 = uiFamilyAccount.family_account;
                                            BrandCollectionDataKt brandCollectionDataKt2 = familyAccount2 != null ? familyAccount2.f1246type : null;
                                            FamilyAccount$Type$Sponsor familyAccount$Type$Sponsor = brandCollectionDataKt2 instanceof FamilyAccount$Type$Sponsor ? (FamilyAccount$Type$Sponsor) brandCollectionDataKt2 : null;
                                            objArr[2] = (familyAccount$Type$Sponsor == null || (sponsor = familyAccount$Type$Sponsor.value) == null) ? null : Sponsor.ADAPTER.encode(sponsor);
                                            frameworkSQLiteDatabase2.delegate.execSQL("INSERT INTO family_account(entity_id, dependent, sponsor)\nVALUES (?, ?, ?)", objArr);
                                        }
                                    } catch (Throwable th222222) {
                                        try {
                                            throw th222222;
                                        } finally {
                                        }
                                    }
                                }
                                query2.close();
                                return Unit.INSTANCE;
                            case 7:
                                ((SqlDriver) obj).getClass();
                                CashAccountDatabaseCallback.createColumnIfNotExists(frameworkSQLiteDatabase2, "inAppNotificationMessage", "avatar", "BLOB", null);
                                return Unit.INSTANCE;
                            case 8:
                                SQLiteDatabase sQLiteDatabase3 = frameworkSQLiteDatabase2.delegate;
                                ((SqlDriver) obj).getClass();
                                query2 = frameworkSQLiteDatabase2.query(new CallResult("SELECT entity_id, entity FROM sync_entity"));
                                while (query2.moveToNext()) {
                                    try {
                                        String string7 = query2.getString(0);
                                        byte[] blob6 = query2.isNull(1) ? null : query2.getBlob(1);
                                        if (blob6 != null && (syncEntity = (SyncEntity) SyncEntity.ADAPTER.decode(blob6)) != null) {
                                            Long l2 = syncEntity.version;
                                            sQLiteDatabase3.execSQL("UPDATE sync_entity \nSET \n  sync_entity_version = ?\nWHERE entity_id = ?", new Object[]{l2, string7});
                                            if (syncEntity.payment != null) {
                                                sQLiteDatabase3.execSQL("UPDATE payment\nSET \n  sync_entity_version = ?\nWHERE entity_id = ?", new Object[]{l2, string7});
                                            }
                                        }
                                    } finally {
                                        try {
                                            throw th222222;
                                        } finally {
                                        }
                                    }
                                }
                                query2.close();
                                return Unit.INSTANCE;
                            case 9:
                                ((SqlDriver) obj).getClass();
                                query2 = frameworkSQLiteDatabase2.query(new CallResult("SELECT entity_id, entity_type, entity FROM unhandled_sync_entity"));
                                while (query2.moveToNext()) {
                                    try {
                                        String string8 = query2.getString(0);
                                        int i11 = query2.getInt(1);
                                        byte[] blob7 = query2.isNull(2) ? null : query2.getBlob(2);
                                        if (blob7 != null && (syncEntity2 = (SyncEntity) SyncEntity.ADAPTER.decode(blob7)) != null) {
                                            frameworkSQLiteDatabase2.delegate.execSQL("UPDATE unhandled_sync_entity\nSET\n  entity_version = ?\nWHERE entity_id = ? AND entity_type = ?", new Object[]{syncEntity2.version, string8, Integer.valueOf(i11)});
                                        }
                                    } finally {
                                        try {
                                            throw th222222;
                                        } finally {
                                        }
                                    }
                                }
                                query2.close();
                                return Unit.INSTANCE;
                            case 10:
                                ((SqlDriver) obj).getClass();
                                query2 = frameworkSQLiteDatabase2.query(new CallResult("SELECT entity_id, entity, entity_processor_version, sync_value_type, sync_entity_version\nFROM sync_entity"));
                                while (query2.moveToNext()) {
                                    try {
                                        String string9 = query2.getString(0);
                                        byte[] blob8 = query2.isNull(1) ? null : query2.getBlob(1);
                                        if (blob8 != null && (syncEntity3 = (SyncEntity) SyncEntity.ADAPTER.decode(blob8)) != null) {
                                            frameworkSQLiteDatabase2.delegate.execSQL("INSERT OR REPLACE INTO new_sync_entity\nVALUES (?, ?, ?, ?, ?, ?);", new Serializable[]{string9, Long.valueOf(EntitySyncerKt.rawEntityType(syncEntity3)), blob8, query2.isNull(2) ? null : Long.valueOf(query2.getLong(2)), query2.isNull(3) ? null : Long.valueOf(query2.getLong(3)), query2.isNull(4) ? null : Long.valueOf(query2.getLong(4))});
                                        }
                                    } finally {
                                        try {
                                            throw th222222;
                                        } finally {
                                        }
                                    }
                                }
                                query2.close();
                                return Unit.INSTANCE;
                            case 11:
                                ((SqlDriver) obj).getClass();
                                CashAccountDatabaseCallback.restoreEntityProcessorVersionColumn(frameworkSQLiteDatabase2);
                                return Unit.INSTANCE;
                            case 12:
                                ((SqlDriver) obj).getClass();
                                CashAccountDatabaseCallback.restoreEntityProcessorVersionColumn(frameworkSQLiteDatabase2);
                                return Unit.INSTANCE;
                            default:
                                ((SqlDriver) obj).getClass();
                                query2 = frameworkSQLiteDatabase2.query(new CallResult("SELECT entity_id, entity FROM sync_entity WHERE type = 2"));
                                while (query2.moveToNext()) {
                                    try {
                                        byte[] blob9 = query2.isNull(1) ? null : query2.getBlob(1);
                                        if (blob9 != null && (syncEntity4 = (SyncEntity) SyncEntity.ADAPTER.decode(blob9)) != null && (syncCustomer = syncEntity4.customer) != null && (uiCustomer = syncCustomer.customer) != null) {
                                            frameworkSQLiteDatabase2.delegate.execSQL("UPDATE customer SET is_special_customer = ? WHERE customer_id = ?", new Object[]{Long.valueOf(Intrinsics.areEqual(uiCustomer.is_special_customer, Boolean.TRUE) ? 1L : 0L), uiCustomer.id});
                                        }
                                    } finally {
                                    }
                                }
                                query2.close();
                                return Unit.INSTANCE;
                        }
                    }
                });
                final int i7 = 2;
                AfterVersion afterVersion3 = new AfterVersion(436L, new Function1(cashAccountDatabaseCallback) { // from class: com.squareup.cash.db.CashAccountDatabaseCallback$$ExternalSyntheticLambda0
                    /* JADX WARN: Code restructure failed: missing block: B:290:0x03f0, code lost:
                    
                        if (r3 == null) goto L386;
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:302:0x03f2, code lost:
                    
                        r1.execSQL("UPDATE new_customer \nSET \n  photo = ?\nWHERE customer_id = ?", new java.io.Serializable[]{com.squareup.protos.cash.ui.Image.ADAPTER.encode(new com.squareup.protos.cash.ui.Image(r3, r3, 4)), java.lang.Integer.valueOf(r0)});
                     */
                    /* JADX WARN: Finally extract failed */
                    @Override // kotlin.jvm.functions.Function1
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                    */
                    public final Object invoke(Object obj) {
                        Cursor query2;
                        String str;
                        String str2;
                        String name;
                        Sponsor sponsor;
                        Dependent dependent;
                        SyncEntity syncEntity;
                        SyncEntity syncEntity2;
                        SyncEntity syncEntity3;
                        SyncEntity syncEntity4;
                        SyncCustomer syncCustomer;
                        UiCustomer uiCustomer;
                        int i72 = i7;
                        FrameworkSQLiteDatabase frameworkSQLiteDatabase2 = frameworkSQLiteDatabase;
                        switch (i72) {
                            case 0:
                                ((SqlDriver) obj).getClass();
                                query2 = frameworkSQLiteDatabase2.query(new CallResult("SELECT customer_id, merchant_data FROM customer"));
                                while (query2.moveToNext()) {
                                    try {
                                        String string2 = query2.getString(0);
                                        byte[] blob = query2.isNull(1) ? null : query2.getBlob(1);
                                        if (blob != null) {
                                            String str3 = ((MerchantData) MerchantData.ADAPTER.decode(blob)).category;
                                            if (str3 != null) {
                                                str = "'" + str3 + "'";
                                            } else {
                                                str = null;
                                            }
                                            frameworkSQLiteDatabase2.delegate.execSQL(StringsKt__IndentKt.replaceIndent("\n              |UPDATE customer\n              |SET category = " + str + "\n              |WHERE customer_id = '" + string2 + "'\n            "));
                                        }
                                    } catch (Throwable th222222) {
                                        try {
                                            throw th222222;
                                        } finally {
                                        }
                                    }
                                }
                                query2.close();
                                return Unit.INSTANCE;
                            case 1:
                                ((SqlDriver) obj).getClass();
                                query2 = frameworkSQLiteDatabase2.query(new CallResult("SELECT _id, amount FROM payment"));
                                while (query2.moveToNext()) {
                                    try {
                                        int i8 = query2.getInt(0);
                                        byte[] blob2 = query2.isNull(1) ? null : query2.getBlob(1);
                                        if (blob2 != null) {
                                            Money money = (Money) Money.ADAPTER.decode(blob2);
                                            Long l = money.amount;
                                            CurrencyCode currencyCode = money.currency_code;
                                            if (currencyCode == null || (name = currencyCode.name()) == null) {
                                                str2 = null;
                                            } else {
                                                str2 = "'" + name + "'";
                                            }
                                            frameworkSQLiteDatabase2.delegate.execSQL(StringsKt__IndentKt.trimMargin$default("\n            |UPDATE new_payment \n            |SET \n            |  amount = " + l + ", \n            |  amount_currency = " + str2 + "\n            |WHERE _id = " + i8 + "\n            "));
                                        }
                                    } catch (Throwable th2222222) {
                                        try {
                                            throw th2222222;
                                        } finally {
                                        }
                                    }
                                }
                                query2.close();
                                return Unit.INSTANCE;
                            case 2:
                                SQLiteDatabase sQLiteDatabase2 = frameworkSQLiteDatabase2.delegate;
                                ((SqlDriver) obj).getClass();
                                query2 = frameworkSQLiteDatabase2.query(new CallResult("SELECT customer_id, photo_url, photo, accent_color, themed_accent_color FROM customer"));
                                while (query2.moveToNext()) {
                                    try {
                                        int i9 = query2.getInt(0);
                                        String string3 = query2.isNull(1) ? null : query2.getString(1);
                                        byte[] blob3 = query2.isNull(2) ? null : query2.getBlob(2);
                                        Image image = blob3 != null ? (Image) Image.ADAPTER.decode(blob3) : null;
                                        String string4 = query2.isNull(3) ? null : query2.getString(3);
                                        byte[] blob4 = query2.isNull(4) ? null : query2.getBlob(4);
                                        Color color = blob4 != null ? (Color) Color.ADAPTER.decode(blob4) : null;
                                        if (image == null && string3 != null && color == null && string4 != null) {
                                            sQLiteDatabase2.execSQL("UPDATE new_customer \nSET \n  photo = ?,\n  themed_accent_color = ?\nWHERE customer_id = ?", new Serializable[]{Image.ADAPTER.encode(new Image(string3, string3, 4)), Color.ADAPTER.encode(ColorsKt.toColor(string4)), Integer.valueOf(i9)});
                                        } else if (color == null && string4 != null) {
                                            sQLiteDatabase2.execSQL("UPDATE new_customer \nSET \n  themed_accent_color = ?\nWHERE customer_id = ?", new Serializable[]{Color.ADAPTER.encode(ColorsKt.toColor(string4)), Integer.valueOf(i9)});
                                        }
                                    } catch (Throwable th22222222) {
                                        try {
                                            throw th22222222;
                                        } finally {
                                        }
                                    }
                                }
                                query2.close();
                                return Unit.INSTANCE;
                            case 3:
                                ((SqlDriver) obj).getClass();
                                CashAccountDatabaseCallback.createColumnIfNotExists(frameworkSQLiteDatabase2, "creditLine", "lending_product", "TEXT", null);
                                CashAccountDatabaseCallback.createColumnIfNotExists(frameworkSQLiteDatabase2, "loan", "lending_product", "TEXT", null);
                                CashAccountDatabaseCallback.createColumnIfNotExists(frameworkSQLiteDatabase2, "loanTransaction", "lending_product", "TEXT", null);
                                CashAccountDatabaseCallback.createColumnIfNotExists(frameworkSQLiteDatabase2, "payment", "lending_loan_token", "TEXT", "NULL");
                                CashAccountDatabaseCallback.createColumnIfNotExists(frameworkSQLiteDatabase2, "loan", "bnpl_data", "BLOB", null);
                                return Unit.INSTANCE;
                            case 4:
                                ((SqlDriver) obj).getClass();
                                query2 = frameworkSQLiteDatabase2.query(new CallResult("SELECT count(*) FROM paperDepositBarcodeInfo"));
                                try {
                                    query2.moveToNext();
                                    if (query2.getInt(0) == 0) {
                                        frameworkSQLiteDatabase2.delegate.execSQL("INSERT INTO paperDepositBarcodeInfo DEFAULT VALUES;");
                                    }
                                    query2.close();
                                    return Unit.INSTANCE;
                                } finally {
                                    try {
                                        throw th22222222;
                                    } finally {
                                    }
                                }
                            case 5:
                                ((SqlDriver) obj).getClass();
                                query2 = frameworkSQLiteDatabase2.query(new CallResult("SELECT * FROM profileDirectorySection"));
                                while (query2.moveToNext()) {
                                    try {
                                        int i10 = query2.getInt(0);
                                        String string5 = query2.isNull(1) ? null : query2.getString(1);
                                        if (string5 != null) {
                                            frameworkSQLiteDatabase2.delegate.execSQL(StringsKt__IndentKt.trimMargin$default("\n            |UPDATE profileDirectorySection\n            |SET \n            |  text_title = ?\n            |WHERE id = " + i10 + "\n            "), new byte[][]{Text.ADAPTER.encode(new Text(string5, (TextStyle) null, (TextDecoration) null, (Color) null, (Image) null, 62))});
                                        }
                                    } finally {
                                        try {
                                            throw th22222222;
                                        } finally {
                                        }
                                    }
                                }
                                query2.close();
                                return Unit.INSTANCE;
                            case 6:
                                ((SqlDriver) obj).getClass();
                                query2 = frameworkSQLiteDatabase2.query(new CallResult("SELECT entity_id, customer_token, family_account FROM familyAccount"));
                                while (query2.moveToNext()) {
                                    try {
                                        String string6 = query2.getString(0);
                                        byte[] blob5 = query2.isNull(2) ? null : query2.getBlob(2);
                                        if (blob5 != null) {
                                            UiFamilyAccount uiFamilyAccount = (UiFamilyAccount) UiFamilyAccount.ADAPTER.decode(blob5);
                                            Object[] objArr = new Serializable[3];
                                            objArr[0] = string6;
                                            FamilyAccount familyAccount = uiFamilyAccount.family_account;
                                            BrandCollectionDataKt brandCollectionDataKt = familyAccount != null ? familyAccount.f1246type : null;
                                            FamilyAccount$Type$Dependent familyAccount$Type$Dependent = brandCollectionDataKt instanceof FamilyAccount$Type$Dependent ? (FamilyAccount$Type$Dependent) brandCollectionDataKt : null;
                                            objArr[1] = (familyAccount$Type$Dependent == null || (dependent = familyAccount$Type$Dependent.value) == null) ? null : Dependent.ADAPTER.encode(dependent);
                                            FamilyAccount familyAccount2 = uiFamilyAccount.family_account;
                                            BrandCollectionDataKt brandCollectionDataKt2 = familyAccount2 != null ? familyAccount2.f1246type : null;
                                            FamilyAccount$Type$Sponsor familyAccount$Type$Sponsor = brandCollectionDataKt2 instanceof FamilyAccount$Type$Sponsor ? (FamilyAccount$Type$Sponsor) brandCollectionDataKt2 : null;
                                            objArr[2] = (familyAccount$Type$Sponsor == null || (sponsor = familyAccount$Type$Sponsor.value) == null) ? null : Sponsor.ADAPTER.encode(sponsor);
                                            frameworkSQLiteDatabase2.delegate.execSQL("INSERT INTO family_account(entity_id, dependent, sponsor)\nVALUES (?, ?, ?)", objArr);
                                        }
                                    } catch (Throwable th222222222) {
                                        try {
                                            throw th222222222;
                                        } finally {
                                        }
                                    }
                                }
                                query2.close();
                                return Unit.INSTANCE;
                            case 7:
                                ((SqlDriver) obj).getClass();
                                CashAccountDatabaseCallback.createColumnIfNotExists(frameworkSQLiteDatabase2, "inAppNotificationMessage", "avatar", "BLOB", null);
                                return Unit.INSTANCE;
                            case 8:
                                SQLiteDatabase sQLiteDatabase3 = frameworkSQLiteDatabase2.delegate;
                                ((SqlDriver) obj).getClass();
                                query2 = frameworkSQLiteDatabase2.query(new CallResult("SELECT entity_id, entity FROM sync_entity"));
                                while (query2.moveToNext()) {
                                    try {
                                        String string7 = query2.getString(0);
                                        byte[] blob6 = query2.isNull(1) ? null : query2.getBlob(1);
                                        if (blob6 != null && (syncEntity = (SyncEntity) SyncEntity.ADAPTER.decode(blob6)) != null) {
                                            Long l2 = syncEntity.version;
                                            sQLiteDatabase3.execSQL("UPDATE sync_entity \nSET \n  sync_entity_version = ?\nWHERE entity_id = ?", new Object[]{l2, string7});
                                            if (syncEntity.payment != null) {
                                                sQLiteDatabase3.execSQL("UPDATE payment\nSET \n  sync_entity_version = ?\nWHERE entity_id = ?", new Object[]{l2, string7});
                                            }
                                        }
                                    } finally {
                                        try {
                                            throw th222222222;
                                        } finally {
                                        }
                                    }
                                }
                                query2.close();
                                return Unit.INSTANCE;
                            case 9:
                                ((SqlDriver) obj).getClass();
                                query2 = frameworkSQLiteDatabase2.query(new CallResult("SELECT entity_id, entity_type, entity FROM unhandled_sync_entity"));
                                while (query2.moveToNext()) {
                                    try {
                                        String string8 = query2.getString(0);
                                        int i11 = query2.getInt(1);
                                        byte[] blob7 = query2.isNull(2) ? null : query2.getBlob(2);
                                        if (blob7 != null && (syncEntity2 = (SyncEntity) SyncEntity.ADAPTER.decode(blob7)) != null) {
                                            frameworkSQLiteDatabase2.delegate.execSQL("UPDATE unhandled_sync_entity\nSET\n  entity_version = ?\nWHERE entity_id = ? AND entity_type = ?", new Object[]{syncEntity2.version, string8, Integer.valueOf(i11)});
                                        }
                                    } finally {
                                        try {
                                            throw th222222222;
                                        } finally {
                                        }
                                    }
                                }
                                query2.close();
                                return Unit.INSTANCE;
                            case 10:
                                ((SqlDriver) obj).getClass();
                                query2 = frameworkSQLiteDatabase2.query(new CallResult("SELECT entity_id, entity, entity_processor_version, sync_value_type, sync_entity_version\nFROM sync_entity"));
                                while (query2.moveToNext()) {
                                    try {
                                        String string9 = query2.getString(0);
                                        byte[] blob8 = query2.isNull(1) ? null : query2.getBlob(1);
                                        if (blob8 != null && (syncEntity3 = (SyncEntity) SyncEntity.ADAPTER.decode(blob8)) != null) {
                                            frameworkSQLiteDatabase2.delegate.execSQL("INSERT OR REPLACE INTO new_sync_entity\nVALUES (?, ?, ?, ?, ?, ?);", new Serializable[]{string9, Long.valueOf(EntitySyncerKt.rawEntityType(syncEntity3)), blob8, query2.isNull(2) ? null : Long.valueOf(query2.getLong(2)), query2.isNull(3) ? null : Long.valueOf(query2.getLong(3)), query2.isNull(4) ? null : Long.valueOf(query2.getLong(4))});
                                        }
                                    } finally {
                                        try {
                                            throw th222222222;
                                        } finally {
                                        }
                                    }
                                }
                                query2.close();
                                return Unit.INSTANCE;
                            case 11:
                                ((SqlDriver) obj).getClass();
                                CashAccountDatabaseCallback.restoreEntityProcessorVersionColumn(frameworkSQLiteDatabase2);
                                return Unit.INSTANCE;
                            case 12:
                                ((SqlDriver) obj).getClass();
                                CashAccountDatabaseCallback.restoreEntityProcessorVersionColumn(frameworkSQLiteDatabase2);
                                return Unit.INSTANCE;
                            default:
                                ((SqlDriver) obj).getClass();
                                query2 = frameworkSQLiteDatabase2.query(new CallResult("SELECT entity_id, entity FROM sync_entity WHERE type = 2"));
                                while (query2.moveToNext()) {
                                    try {
                                        byte[] blob9 = query2.isNull(1) ? null : query2.getBlob(1);
                                        if (blob9 != null && (syncEntity4 = (SyncEntity) SyncEntity.ADAPTER.decode(blob9)) != null && (syncCustomer = syncEntity4.customer) != null && (uiCustomer = syncCustomer.customer) != null) {
                                            frameworkSQLiteDatabase2.delegate.execSQL("UPDATE customer SET is_special_customer = ? WHERE customer_id = ?", new Object[]{Long.valueOf(Intrinsics.areEqual(uiCustomer.is_special_customer, Boolean.TRUE) ? 1L : 0L), uiCustomer.id});
                                        }
                                    } finally {
                                    }
                                }
                                query2.close();
                                return Unit.INSTANCE;
                        }
                    }
                });
                AfterVersion afterVersion4 = new AfterVersion(456L, new PoolGoalMetKt$$ExternalSyntheticLambda6(cashAccountDatabaseCallback, frameworkSQLiteDatabase, i3, 10));
                final int i8 = 3;
                AfterVersion afterVersion5 = new AfterVersion(459L, new Function1(cashAccountDatabaseCallback) { // from class: com.squareup.cash.db.CashAccountDatabaseCallback$$ExternalSyntheticLambda0
                    /* JADX WARN: Code restructure failed: missing block: B:290:0x03f0, code lost:
                    
                        if (r3 == null) goto L386;
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:302:0x03f2, code lost:
                    
                        r1.execSQL("UPDATE new_customer \nSET \n  photo = ?\nWHERE customer_id = ?", new java.io.Serializable[]{com.squareup.protos.cash.ui.Image.ADAPTER.encode(new com.squareup.protos.cash.ui.Image(r3, r3, 4)), java.lang.Integer.valueOf(r0)});
                     */
                    /* JADX WARN: Finally extract failed */
                    @Override // kotlin.jvm.functions.Function1
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                    */
                    public final Object invoke(Object obj) {
                        Cursor query2;
                        String str;
                        String str2;
                        String name;
                        Sponsor sponsor;
                        Dependent dependent;
                        SyncEntity syncEntity;
                        SyncEntity syncEntity2;
                        SyncEntity syncEntity3;
                        SyncEntity syncEntity4;
                        SyncCustomer syncCustomer;
                        UiCustomer uiCustomer;
                        int i72 = i8;
                        FrameworkSQLiteDatabase frameworkSQLiteDatabase2 = frameworkSQLiteDatabase;
                        switch (i72) {
                            case 0:
                                ((SqlDriver) obj).getClass();
                                query2 = frameworkSQLiteDatabase2.query(new CallResult("SELECT customer_id, merchant_data FROM customer"));
                                while (query2.moveToNext()) {
                                    try {
                                        String string2 = query2.getString(0);
                                        byte[] blob = query2.isNull(1) ? null : query2.getBlob(1);
                                        if (blob != null) {
                                            String str3 = ((MerchantData) MerchantData.ADAPTER.decode(blob)).category;
                                            if (str3 != null) {
                                                str = "'" + str3 + "'";
                                            } else {
                                                str = null;
                                            }
                                            frameworkSQLiteDatabase2.delegate.execSQL(StringsKt__IndentKt.replaceIndent("\n              |UPDATE customer\n              |SET category = " + str + "\n              |WHERE customer_id = '" + string2 + "'\n            "));
                                        }
                                    } catch (Throwable th222222222) {
                                        try {
                                            throw th222222222;
                                        } finally {
                                        }
                                    }
                                }
                                query2.close();
                                return Unit.INSTANCE;
                            case 1:
                                ((SqlDriver) obj).getClass();
                                query2 = frameworkSQLiteDatabase2.query(new CallResult("SELECT _id, amount FROM payment"));
                                while (query2.moveToNext()) {
                                    try {
                                        int i82 = query2.getInt(0);
                                        byte[] blob2 = query2.isNull(1) ? null : query2.getBlob(1);
                                        if (blob2 != null) {
                                            Money money = (Money) Money.ADAPTER.decode(blob2);
                                            Long l = money.amount;
                                            CurrencyCode currencyCode = money.currency_code;
                                            if (currencyCode == null || (name = currencyCode.name()) == null) {
                                                str2 = null;
                                            } else {
                                                str2 = "'" + name + "'";
                                            }
                                            frameworkSQLiteDatabase2.delegate.execSQL(StringsKt__IndentKt.trimMargin$default("\n            |UPDATE new_payment \n            |SET \n            |  amount = " + l + ", \n            |  amount_currency = " + str2 + "\n            |WHERE _id = " + i82 + "\n            "));
                                        }
                                    } catch (Throwable th2222222222) {
                                        try {
                                            throw th2222222222;
                                        } finally {
                                        }
                                    }
                                }
                                query2.close();
                                return Unit.INSTANCE;
                            case 2:
                                SQLiteDatabase sQLiteDatabase2 = frameworkSQLiteDatabase2.delegate;
                                ((SqlDriver) obj).getClass();
                                query2 = frameworkSQLiteDatabase2.query(new CallResult("SELECT customer_id, photo_url, photo, accent_color, themed_accent_color FROM customer"));
                                while (query2.moveToNext()) {
                                    try {
                                        int i9 = query2.getInt(0);
                                        String string3 = query2.isNull(1) ? null : query2.getString(1);
                                        byte[] blob3 = query2.isNull(2) ? null : query2.getBlob(2);
                                        Image image = blob3 != null ? (Image) Image.ADAPTER.decode(blob3) : null;
                                        String string4 = query2.isNull(3) ? null : query2.getString(3);
                                        byte[] blob4 = query2.isNull(4) ? null : query2.getBlob(4);
                                        Color color = blob4 != null ? (Color) Color.ADAPTER.decode(blob4) : null;
                                        if (image == null && string3 != null && color == null && string4 != null) {
                                            sQLiteDatabase2.execSQL("UPDATE new_customer \nSET \n  photo = ?,\n  themed_accent_color = ?\nWHERE customer_id = ?", new Serializable[]{Image.ADAPTER.encode(new Image(string3, string3, 4)), Color.ADAPTER.encode(ColorsKt.toColor(string4)), Integer.valueOf(i9)});
                                        } else if (color == null && string4 != null) {
                                            sQLiteDatabase2.execSQL("UPDATE new_customer \nSET \n  themed_accent_color = ?\nWHERE customer_id = ?", new Serializable[]{Color.ADAPTER.encode(ColorsKt.toColor(string4)), Integer.valueOf(i9)});
                                        }
                                    } catch (Throwable th22222222222) {
                                        try {
                                            throw th22222222222;
                                        } finally {
                                        }
                                    }
                                }
                                query2.close();
                                return Unit.INSTANCE;
                            case 3:
                                ((SqlDriver) obj).getClass();
                                CashAccountDatabaseCallback.createColumnIfNotExists(frameworkSQLiteDatabase2, "creditLine", "lending_product", "TEXT", null);
                                CashAccountDatabaseCallback.createColumnIfNotExists(frameworkSQLiteDatabase2, "loan", "lending_product", "TEXT", null);
                                CashAccountDatabaseCallback.createColumnIfNotExists(frameworkSQLiteDatabase2, "loanTransaction", "lending_product", "TEXT", null);
                                CashAccountDatabaseCallback.createColumnIfNotExists(frameworkSQLiteDatabase2, "payment", "lending_loan_token", "TEXT", "NULL");
                                CashAccountDatabaseCallback.createColumnIfNotExists(frameworkSQLiteDatabase2, "loan", "bnpl_data", "BLOB", null);
                                return Unit.INSTANCE;
                            case 4:
                                ((SqlDriver) obj).getClass();
                                query2 = frameworkSQLiteDatabase2.query(new CallResult("SELECT count(*) FROM paperDepositBarcodeInfo"));
                                try {
                                    query2.moveToNext();
                                    if (query2.getInt(0) == 0) {
                                        frameworkSQLiteDatabase2.delegate.execSQL("INSERT INTO paperDepositBarcodeInfo DEFAULT VALUES;");
                                    }
                                    query2.close();
                                    return Unit.INSTANCE;
                                } finally {
                                    try {
                                        throw th22222222222;
                                    } finally {
                                    }
                                }
                            case 5:
                                ((SqlDriver) obj).getClass();
                                query2 = frameworkSQLiteDatabase2.query(new CallResult("SELECT * FROM profileDirectorySection"));
                                while (query2.moveToNext()) {
                                    try {
                                        int i10 = query2.getInt(0);
                                        String string5 = query2.isNull(1) ? null : query2.getString(1);
                                        if (string5 != null) {
                                            frameworkSQLiteDatabase2.delegate.execSQL(StringsKt__IndentKt.trimMargin$default("\n            |UPDATE profileDirectorySection\n            |SET \n            |  text_title = ?\n            |WHERE id = " + i10 + "\n            "), new byte[][]{Text.ADAPTER.encode(new Text(string5, (TextStyle) null, (TextDecoration) null, (Color) null, (Image) null, 62))});
                                        }
                                    } finally {
                                        try {
                                            throw th22222222222;
                                        } finally {
                                        }
                                    }
                                }
                                query2.close();
                                return Unit.INSTANCE;
                            case 6:
                                ((SqlDriver) obj).getClass();
                                query2 = frameworkSQLiteDatabase2.query(new CallResult("SELECT entity_id, customer_token, family_account FROM familyAccount"));
                                while (query2.moveToNext()) {
                                    try {
                                        String string6 = query2.getString(0);
                                        byte[] blob5 = query2.isNull(2) ? null : query2.getBlob(2);
                                        if (blob5 != null) {
                                            UiFamilyAccount uiFamilyAccount = (UiFamilyAccount) UiFamilyAccount.ADAPTER.decode(blob5);
                                            Object[] objArr = new Serializable[3];
                                            objArr[0] = string6;
                                            FamilyAccount familyAccount = uiFamilyAccount.family_account;
                                            BrandCollectionDataKt brandCollectionDataKt = familyAccount != null ? familyAccount.f1246type : null;
                                            FamilyAccount$Type$Dependent familyAccount$Type$Dependent = brandCollectionDataKt instanceof FamilyAccount$Type$Dependent ? (FamilyAccount$Type$Dependent) brandCollectionDataKt : null;
                                            objArr[1] = (familyAccount$Type$Dependent == null || (dependent = familyAccount$Type$Dependent.value) == null) ? null : Dependent.ADAPTER.encode(dependent);
                                            FamilyAccount familyAccount2 = uiFamilyAccount.family_account;
                                            BrandCollectionDataKt brandCollectionDataKt2 = familyAccount2 != null ? familyAccount2.f1246type : null;
                                            FamilyAccount$Type$Sponsor familyAccount$Type$Sponsor = brandCollectionDataKt2 instanceof FamilyAccount$Type$Sponsor ? (FamilyAccount$Type$Sponsor) brandCollectionDataKt2 : null;
                                            objArr[2] = (familyAccount$Type$Sponsor == null || (sponsor = familyAccount$Type$Sponsor.value) == null) ? null : Sponsor.ADAPTER.encode(sponsor);
                                            frameworkSQLiteDatabase2.delegate.execSQL("INSERT INTO family_account(entity_id, dependent, sponsor)\nVALUES (?, ?, ?)", objArr);
                                        }
                                    } catch (Throwable th222222222222) {
                                        try {
                                            throw th222222222222;
                                        } finally {
                                        }
                                    }
                                }
                                query2.close();
                                return Unit.INSTANCE;
                            case 7:
                                ((SqlDriver) obj).getClass();
                                CashAccountDatabaseCallback.createColumnIfNotExists(frameworkSQLiteDatabase2, "inAppNotificationMessage", "avatar", "BLOB", null);
                                return Unit.INSTANCE;
                            case 8:
                                SQLiteDatabase sQLiteDatabase3 = frameworkSQLiteDatabase2.delegate;
                                ((SqlDriver) obj).getClass();
                                query2 = frameworkSQLiteDatabase2.query(new CallResult("SELECT entity_id, entity FROM sync_entity"));
                                while (query2.moveToNext()) {
                                    try {
                                        String string7 = query2.getString(0);
                                        byte[] blob6 = query2.isNull(1) ? null : query2.getBlob(1);
                                        if (blob6 != null && (syncEntity = (SyncEntity) SyncEntity.ADAPTER.decode(blob6)) != null) {
                                            Long l2 = syncEntity.version;
                                            sQLiteDatabase3.execSQL("UPDATE sync_entity \nSET \n  sync_entity_version = ?\nWHERE entity_id = ?", new Object[]{l2, string7});
                                            if (syncEntity.payment != null) {
                                                sQLiteDatabase3.execSQL("UPDATE payment\nSET \n  sync_entity_version = ?\nWHERE entity_id = ?", new Object[]{l2, string7});
                                            }
                                        }
                                    } finally {
                                        try {
                                            throw th222222222222;
                                        } finally {
                                        }
                                    }
                                }
                                query2.close();
                                return Unit.INSTANCE;
                            case 9:
                                ((SqlDriver) obj).getClass();
                                query2 = frameworkSQLiteDatabase2.query(new CallResult("SELECT entity_id, entity_type, entity FROM unhandled_sync_entity"));
                                while (query2.moveToNext()) {
                                    try {
                                        String string8 = query2.getString(0);
                                        int i11 = query2.getInt(1);
                                        byte[] blob7 = query2.isNull(2) ? null : query2.getBlob(2);
                                        if (blob7 != null && (syncEntity2 = (SyncEntity) SyncEntity.ADAPTER.decode(blob7)) != null) {
                                            frameworkSQLiteDatabase2.delegate.execSQL("UPDATE unhandled_sync_entity\nSET\n  entity_version = ?\nWHERE entity_id = ? AND entity_type = ?", new Object[]{syncEntity2.version, string8, Integer.valueOf(i11)});
                                        }
                                    } finally {
                                        try {
                                            throw th222222222222;
                                        } finally {
                                        }
                                    }
                                }
                                query2.close();
                                return Unit.INSTANCE;
                            case 10:
                                ((SqlDriver) obj).getClass();
                                query2 = frameworkSQLiteDatabase2.query(new CallResult("SELECT entity_id, entity, entity_processor_version, sync_value_type, sync_entity_version\nFROM sync_entity"));
                                while (query2.moveToNext()) {
                                    try {
                                        String string9 = query2.getString(0);
                                        byte[] blob8 = query2.isNull(1) ? null : query2.getBlob(1);
                                        if (blob8 != null && (syncEntity3 = (SyncEntity) SyncEntity.ADAPTER.decode(blob8)) != null) {
                                            frameworkSQLiteDatabase2.delegate.execSQL("INSERT OR REPLACE INTO new_sync_entity\nVALUES (?, ?, ?, ?, ?, ?);", new Serializable[]{string9, Long.valueOf(EntitySyncerKt.rawEntityType(syncEntity3)), blob8, query2.isNull(2) ? null : Long.valueOf(query2.getLong(2)), query2.isNull(3) ? null : Long.valueOf(query2.getLong(3)), query2.isNull(4) ? null : Long.valueOf(query2.getLong(4))});
                                        }
                                    } finally {
                                        try {
                                            throw th222222222222;
                                        } finally {
                                        }
                                    }
                                }
                                query2.close();
                                return Unit.INSTANCE;
                            case 11:
                                ((SqlDriver) obj).getClass();
                                CashAccountDatabaseCallback.restoreEntityProcessorVersionColumn(frameworkSQLiteDatabase2);
                                return Unit.INSTANCE;
                            case 12:
                                ((SqlDriver) obj).getClass();
                                CashAccountDatabaseCallback.restoreEntityProcessorVersionColumn(frameworkSQLiteDatabase2);
                                return Unit.INSTANCE;
                            default:
                                ((SqlDriver) obj).getClass();
                                query2 = frameworkSQLiteDatabase2.query(new CallResult("SELECT entity_id, entity FROM sync_entity WHERE type = 2"));
                                while (query2.moveToNext()) {
                                    try {
                                        byte[] blob9 = query2.isNull(1) ? null : query2.getBlob(1);
                                        if (blob9 != null && (syncEntity4 = (SyncEntity) SyncEntity.ADAPTER.decode(blob9)) != null && (syncCustomer = syncEntity4.customer) != null && (uiCustomer = syncCustomer.customer) != null) {
                                            frameworkSQLiteDatabase2.delegate.execSQL("UPDATE customer SET is_special_customer = ? WHERE customer_id = ?", new Object[]{Long.valueOf(Intrinsics.areEqual(uiCustomer.is_special_customer, Boolean.TRUE) ? 1L : 0L), uiCustomer.id});
                                        }
                                    } finally {
                                    }
                                }
                                query2.close();
                                return Unit.INSTANCE;
                        }
                    }
                });
                final int i9 = 4;
                AfterVersion afterVersion6 = new AfterVersion(461L, new Function1(cashAccountDatabaseCallback) { // from class: com.squareup.cash.db.CashAccountDatabaseCallback$$ExternalSyntheticLambda0
                    /* JADX WARN: Code restructure failed: missing block: B:290:0x03f0, code lost:
                    
                        if (r3 == null) goto L386;
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:302:0x03f2, code lost:
                    
                        r1.execSQL("UPDATE new_customer \nSET \n  photo = ?\nWHERE customer_id = ?", new java.io.Serializable[]{com.squareup.protos.cash.ui.Image.ADAPTER.encode(new com.squareup.protos.cash.ui.Image(r3, r3, 4)), java.lang.Integer.valueOf(r0)});
                     */
                    /* JADX WARN: Finally extract failed */
                    @Override // kotlin.jvm.functions.Function1
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                    */
                    public final Object invoke(Object obj) {
                        Cursor query2;
                        String str;
                        String str2;
                        String name;
                        Sponsor sponsor;
                        Dependent dependent;
                        SyncEntity syncEntity;
                        SyncEntity syncEntity2;
                        SyncEntity syncEntity3;
                        SyncEntity syncEntity4;
                        SyncCustomer syncCustomer;
                        UiCustomer uiCustomer;
                        int i72 = i9;
                        FrameworkSQLiteDatabase frameworkSQLiteDatabase2 = frameworkSQLiteDatabase;
                        switch (i72) {
                            case 0:
                                ((SqlDriver) obj).getClass();
                                query2 = frameworkSQLiteDatabase2.query(new CallResult("SELECT customer_id, merchant_data FROM customer"));
                                while (query2.moveToNext()) {
                                    try {
                                        String string2 = query2.getString(0);
                                        byte[] blob = query2.isNull(1) ? null : query2.getBlob(1);
                                        if (blob != null) {
                                            String str3 = ((MerchantData) MerchantData.ADAPTER.decode(blob)).category;
                                            if (str3 != null) {
                                                str = "'" + str3 + "'";
                                            } else {
                                                str = null;
                                            }
                                            frameworkSQLiteDatabase2.delegate.execSQL(StringsKt__IndentKt.replaceIndent("\n              |UPDATE customer\n              |SET category = " + str + "\n              |WHERE customer_id = '" + string2 + "'\n            "));
                                        }
                                    } catch (Throwable th222222222222) {
                                        try {
                                            throw th222222222222;
                                        } finally {
                                        }
                                    }
                                }
                                query2.close();
                                return Unit.INSTANCE;
                            case 1:
                                ((SqlDriver) obj).getClass();
                                query2 = frameworkSQLiteDatabase2.query(new CallResult("SELECT _id, amount FROM payment"));
                                while (query2.moveToNext()) {
                                    try {
                                        int i82 = query2.getInt(0);
                                        byte[] blob2 = query2.isNull(1) ? null : query2.getBlob(1);
                                        if (blob2 != null) {
                                            Money money = (Money) Money.ADAPTER.decode(blob2);
                                            Long l = money.amount;
                                            CurrencyCode currencyCode = money.currency_code;
                                            if (currencyCode == null || (name = currencyCode.name()) == null) {
                                                str2 = null;
                                            } else {
                                                str2 = "'" + name + "'";
                                            }
                                            frameworkSQLiteDatabase2.delegate.execSQL(StringsKt__IndentKt.trimMargin$default("\n            |UPDATE new_payment \n            |SET \n            |  amount = " + l + ", \n            |  amount_currency = " + str2 + "\n            |WHERE _id = " + i82 + "\n            "));
                                        }
                                    } catch (Throwable th2222222222222) {
                                        try {
                                            throw th2222222222222;
                                        } finally {
                                        }
                                    }
                                }
                                query2.close();
                                return Unit.INSTANCE;
                            case 2:
                                SQLiteDatabase sQLiteDatabase2 = frameworkSQLiteDatabase2.delegate;
                                ((SqlDriver) obj).getClass();
                                query2 = frameworkSQLiteDatabase2.query(new CallResult("SELECT customer_id, photo_url, photo, accent_color, themed_accent_color FROM customer"));
                                while (query2.moveToNext()) {
                                    try {
                                        int i92 = query2.getInt(0);
                                        String string3 = query2.isNull(1) ? null : query2.getString(1);
                                        byte[] blob3 = query2.isNull(2) ? null : query2.getBlob(2);
                                        Image image = blob3 != null ? (Image) Image.ADAPTER.decode(blob3) : null;
                                        String string4 = query2.isNull(3) ? null : query2.getString(3);
                                        byte[] blob4 = query2.isNull(4) ? null : query2.getBlob(4);
                                        Color color = blob4 != null ? (Color) Color.ADAPTER.decode(blob4) : null;
                                        if (image == null && string3 != null && color == null && string4 != null) {
                                            sQLiteDatabase2.execSQL("UPDATE new_customer \nSET \n  photo = ?,\n  themed_accent_color = ?\nWHERE customer_id = ?", new Serializable[]{Image.ADAPTER.encode(new Image(string3, string3, 4)), Color.ADAPTER.encode(ColorsKt.toColor(string4)), Integer.valueOf(i92)});
                                        } else if (color == null && string4 != null) {
                                            sQLiteDatabase2.execSQL("UPDATE new_customer \nSET \n  themed_accent_color = ?\nWHERE customer_id = ?", new Serializable[]{Color.ADAPTER.encode(ColorsKt.toColor(string4)), Integer.valueOf(i92)});
                                        }
                                    } catch (Throwable th22222222222222) {
                                        try {
                                            throw th22222222222222;
                                        } finally {
                                        }
                                    }
                                }
                                query2.close();
                                return Unit.INSTANCE;
                            case 3:
                                ((SqlDriver) obj).getClass();
                                CashAccountDatabaseCallback.createColumnIfNotExists(frameworkSQLiteDatabase2, "creditLine", "lending_product", "TEXT", null);
                                CashAccountDatabaseCallback.createColumnIfNotExists(frameworkSQLiteDatabase2, "loan", "lending_product", "TEXT", null);
                                CashAccountDatabaseCallback.createColumnIfNotExists(frameworkSQLiteDatabase2, "loanTransaction", "lending_product", "TEXT", null);
                                CashAccountDatabaseCallback.createColumnIfNotExists(frameworkSQLiteDatabase2, "payment", "lending_loan_token", "TEXT", "NULL");
                                CashAccountDatabaseCallback.createColumnIfNotExists(frameworkSQLiteDatabase2, "loan", "bnpl_data", "BLOB", null);
                                return Unit.INSTANCE;
                            case 4:
                                ((SqlDriver) obj).getClass();
                                query2 = frameworkSQLiteDatabase2.query(new CallResult("SELECT count(*) FROM paperDepositBarcodeInfo"));
                                try {
                                    query2.moveToNext();
                                    if (query2.getInt(0) == 0) {
                                        frameworkSQLiteDatabase2.delegate.execSQL("INSERT INTO paperDepositBarcodeInfo DEFAULT VALUES;");
                                    }
                                    query2.close();
                                    return Unit.INSTANCE;
                                } finally {
                                    try {
                                        throw th22222222222222;
                                    } finally {
                                    }
                                }
                            case 5:
                                ((SqlDriver) obj).getClass();
                                query2 = frameworkSQLiteDatabase2.query(new CallResult("SELECT * FROM profileDirectorySection"));
                                while (query2.moveToNext()) {
                                    try {
                                        int i10 = query2.getInt(0);
                                        String string5 = query2.isNull(1) ? null : query2.getString(1);
                                        if (string5 != null) {
                                            frameworkSQLiteDatabase2.delegate.execSQL(StringsKt__IndentKt.trimMargin$default("\n            |UPDATE profileDirectorySection\n            |SET \n            |  text_title = ?\n            |WHERE id = " + i10 + "\n            "), new byte[][]{Text.ADAPTER.encode(new Text(string5, (TextStyle) null, (TextDecoration) null, (Color) null, (Image) null, 62))});
                                        }
                                    } finally {
                                        try {
                                            throw th22222222222222;
                                        } finally {
                                        }
                                    }
                                }
                                query2.close();
                                return Unit.INSTANCE;
                            case 6:
                                ((SqlDriver) obj).getClass();
                                query2 = frameworkSQLiteDatabase2.query(new CallResult("SELECT entity_id, customer_token, family_account FROM familyAccount"));
                                while (query2.moveToNext()) {
                                    try {
                                        String string6 = query2.getString(0);
                                        byte[] blob5 = query2.isNull(2) ? null : query2.getBlob(2);
                                        if (blob5 != null) {
                                            UiFamilyAccount uiFamilyAccount = (UiFamilyAccount) UiFamilyAccount.ADAPTER.decode(blob5);
                                            Object[] objArr = new Serializable[3];
                                            objArr[0] = string6;
                                            FamilyAccount familyAccount = uiFamilyAccount.family_account;
                                            BrandCollectionDataKt brandCollectionDataKt = familyAccount != null ? familyAccount.f1246type : null;
                                            FamilyAccount$Type$Dependent familyAccount$Type$Dependent = brandCollectionDataKt instanceof FamilyAccount$Type$Dependent ? (FamilyAccount$Type$Dependent) brandCollectionDataKt : null;
                                            objArr[1] = (familyAccount$Type$Dependent == null || (dependent = familyAccount$Type$Dependent.value) == null) ? null : Dependent.ADAPTER.encode(dependent);
                                            FamilyAccount familyAccount2 = uiFamilyAccount.family_account;
                                            BrandCollectionDataKt brandCollectionDataKt2 = familyAccount2 != null ? familyAccount2.f1246type : null;
                                            FamilyAccount$Type$Sponsor familyAccount$Type$Sponsor = brandCollectionDataKt2 instanceof FamilyAccount$Type$Sponsor ? (FamilyAccount$Type$Sponsor) brandCollectionDataKt2 : null;
                                            objArr[2] = (familyAccount$Type$Sponsor == null || (sponsor = familyAccount$Type$Sponsor.value) == null) ? null : Sponsor.ADAPTER.encode(sponsor);
                                            frameworkSQLiteDatabase2.delegate.execSQL("INSERT INTO family_account(entity_id, dependent, sponsor)\nVALUES (?, ?, ?)", objArr);
                                        }
                                    } catch (Throwable th222222222222222) {
                                        try {
                                            throw th222222222222222;
                                        } finally {
                                        }
                                    }
                                }
                                query2.close();
                                return Unit.INSTANCE;
                            case 7:
                                ((SqlDriver) obj).getClass();
                                CashAccountDatabaseCallback.createColumnIfNotExists(frameworkSQLiteDatabase2, "inAppNotificationMessage", "avatar", "BLOB", null);
                                return Unit.INSTANCE;
                            case 8:
                                SQLiteDatabase sQLiteDatabase3 = frameworkSQLiteDatabase2.delegate;
                                ((SqlDriver) obj).getClass();
                                query2 = frameworkSQLiteDatabase2.query(new CallResult("SELECT entity_id, entity FROM sync_entity"));
                                while (query2.moveToNext()) {
                                    try {
                                        String string7 = query2.getString(0);
                                        byte[] blob6 = query2.isNull(1) ? null : query2.getBlob(1);
                                        if (blob6 != null && (syncEntity = (SyncEntity) SyncEntity.ADAPTER.decode(blob6)) != null) {
                                            Long l2 = syncEntity.version;
                                            sQLiteDatabase3.execSQL("UPDATE sync_entity \nSET \n  sync_entity_version = ?\nWHERE entity_id = ?", new Object[]{l2, string7});
                                            if (syncEntity.payment != null) {
                                                sQLiteDatabase3.execSQL("UPDATE payment\nSET \n  sync_entity_version = ?\nWHERE entity_id = ?", new Object[]{l2, string7});
                                            }
                                        }
                                    } finally {
                                        try {
                                            throw th222222222222222;
                                        } finally {
                                        }
                                    }
                                }
                                query2.close();
                                return Unit.INSTANCE;
                            case 9:
                                ((SqlDriver) obj).getClass();
                                query2 = frameworkSQLiteDatabase2.query(new CallResult("SELECT entity_id, entity_type, entity FROM unhandled_sync_entity"));
                                while (query2.moveToNext()) {
                                    try {
                                        String string8 = query2.getString(0);
                                        int i11 = query2.getInt(1);
                                        byte[] blob7 = query2.isNull(2) ? null : query2.getBlob(2);
                                        if (blob7 != null && (syncEntity2 = (SyncEntity) SyncEntity.ADAPTER.decode(blob7)) != null) {
                                            frameworkSQLiteDatabase2.delegate.execSQL("UPDATE unhandled_sync_entity\nSET\n  entity_version = ?\nWHERE entity_id = ? AND entity_type = ?", new Object[]{syncEntity2.version, string8, Integer.valueOf(i11)});
                                        }
                                    } finally {
                                        try {
                                            throw th222222222222222;
                                        } finally {
                                        }
                                    }
                                }
                                query2.close();
                                return Unit.INSTANCE;
                            case 10:
                                ((SqlDriver) obj).getClass();
                                query2 = frameworkSQLiteDatabase2.query(new CallResult("SELECT entity_id, entity, entity_processor_version, sync_value_type, sync_entity_version\nFROM sync_entity"));
                                while (query2.moveToNext()) {
                                    try {
                                        String string9 = query2.getString(0);
                                        byte[] blob8 = query2.isNull(1) ? null : query2.getBlob(1);
                                        if (blob8 != null && (syncEntity3 = (SyncEntity) SyncEntity.ADAPTER.decode(blob8)) != null) {
                                            frameworkSQLiteDatabase2.delegate.execSQL("INSERT OR REPLACE INTO new_sync_entity\nVALUES (?, ?, ?, ?, ?, ?);", new Serializable[]{string9, Long.valueOf(EntitySyncerKt.rawEntityType(syncEntity3)), blob8, query2.isNull(2) ? null : Long.valueOf(query2.getLong(2)), query2.isNull(3) ? null : Long.valueOf(query2.getLong(3)), query2.isNull(4) ? null : Long.valueOf(query2.getLong(4))});
                                        }
                                    } finally {
                                        try {
                                            throw th222222222222222;
                                        } finally {
                                        }
                                    }
                                }
                                query2.close();
                                return Unit.INSTANCE;
                            case 11:
                                ((SqlDriver) obj).getClass();
                                CashAccountDatabaseCallback.restoreEntityProcessorVersionColumn(frameworkSQLiteDatabase2);
                                return Unit.INSTANCE;
                            case 12:
                                ((SqlDriver) obj).getClass();
                                CashAccountDatabaseCallback.restoreEntityProcessorVersionColumn(frameworkSQLiteDatabase2);
                                return Unit.INSTANCE;
                            default:
                                ((SqlDriver) obj).getClass();
                                query2 = frameworkSQLiteDatabase2.query(new CallResult("SELECT entity_id, entity FROM sync_entity WHERE type = 2"));
                                while (query2.moveToNext()) {
                                    try {
                                        byte[] blob9 = query2.isNull(1) ? null : query2.getBlob(1);
                                        if (blob9 != null && (syncEntity4 = (SyncEntity) SyncEntity.ADAPTER.decode(blob9)) != null && (syncCustomer = syncEntity4.customer) != null && (uiCustomer = syncCustomer.customer) != null) {
                                            frameworkSQLiteDatabase2.delegate.execSQL("UPDATE customer SET is_special_customer = ? WHERE customer_id = ?", new Object[]{Long.valueOf(Intrinsics.areEqual(uiCustomer.is_special_customer, Boolean.TRUE) ? 1L : 0L), uiCustomer.id});
                                        }
                                    } finally {
                                    }
                                }
                                query2.close();
                                return Unit.INSTANCE;
                        }
                    }
                });
                AfterVersion afterVersion7 = new AfterVersion(462L, new InstrumentQueries$$ExternalSyntheticLambda0(6, cashAccountDatabaseCallback, frameworkSQLiteDatabase));
                final int i10 = 5;
                AfterVersion afterVersion8 = new AfterVersion(500L, new Function1(cashAccountDatabaseCallback) { // from class: com.squareup.cash.db.CashAccountDatabaseCallback$$ExternalSyntheticLambda0
                    /* JADX WARN: Code restructure failed: missing block: B:290:0x03f0, code lost:
                    
                        if (r3 == null) goto L386;
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:302:0x03f2, code lost:
                    
                        r1.execSQL("UPDATE new_customer \nSET \n  photo = ?\nWHERE customer_id = ?", new java.io.Serializable[]{com.squareup.protos.cash.ui.Image.ADAPTER.encode(new com.squareup.protos.cash.ui.Image(r3, r3, 4)), java.lang.Integer.valueOf(r0)});
                     */
                    /* JADX WARN: Finally extract failed */
                    @Override // kotlin.jvm.functions.Function1
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                    */
                    public final Object invoke(Object obj) {
                        Cursor query2;
                        String str;
                        String str2;
                        String name;
                        Sponsor sponsor;
                        Dependent dependent;
                        SyncEntity syncEntity;
                        SyncEntity syncEntity2;
                        SyncEntity syncEntity3;
                        SyncEntity syncEntity4;
                        SyncCustomer syncCustomer;
                        UiCustomer uiCustomer;
                        int i72 = i10;
                        FrameworkSQLiteDatabase frameworkSQLiteDatabase2 = frameworkSQLiteDatabase;
                        switch (i72) {
                            case 0:
                                ((SqlDriver) obj).getClass();
                                query2 = frameworkSQLiteDatabase2.query(new CallResult("SELECT customer_id, merchant_data FROM customer"));
                                while (query2.moveToNext()) {
                                    try {
                                        String string2 = query2.getString(0);
                                        byte[] blob = query2.isNull(1) ? null : query2.getBlob(1);
                                        if (blob != null) {
                                            String str3 = ((MerchantData) MerchantData.ADAPTER.decode(blob)).category;
                                            if (str3 != null) {
                                                str = "'" + str3 + "'";
                                            } else {
                                                str = null;
                                            }
                                            frameworkSQLiteDatabase2.delegate.execSQL(StringsKt__IndentKt.replaceIndent("\n              |UPDATE customer\n              |SET category = " + str + "\n              |WHERE customer_id = '" + string2 + "'\n            "));
                                        }
                                    } catch (Throwable th222222222222222) {
                                        try {
                                            throw th222222222222222;
                                        } finally {
                                        }
                                    }
                                }
                                query2.close();
                                return Unit.INSTANCE;
                            case 1:
                                ((SqlDriver) obj).getClass();
                                query2 = frameworkSQLiteDatabase2.query(new CallResult("SELECT _id, amount FROM payment"));
                                while (query2.moveToNext()) {
                                    try {
                                        int i82 = query2.getInt(0);
                                        byte[] blob2 = query2.isNull(1) ? null : query2.getBlob(1);
                                        if (blob2 != null) {
                                            Money money = (Money) Money.ADAPTER.decode(blob2);
                                            Long l = money.amount;
                                            CurrencyCode currencyCode = money.currency_code;
                                            if (currencyCode == null || (name = currencyCode.name()) == null) {
                                                str2 = null;
                                            } else {
                                                str2 = "'" + name + "'";
                                            }
                                            frameworkSQLiteDatabase2.delegate.execSQL(StringsKt__IndentKt.trimMargin$default("\n            |UPDATE new_payment \n            |SET \n            |  amount = " + l + ", \n            |  amount_currency = " + str2 + "\n            |WHERE _id = " + i82 + "\n            "));
                                        }
                                    } catch (Throwable th2222222222222222) {
                                        try {
                                            throw th2222222222222222;
                                        } finally {
                                        }
                                    }
                                }
                                query2.close();
                                return Unit.INSTANCE;
                            case 2:
                                SQLiteDatabase sQLiteDatabase2 = frameworkSQLiteDatabase2.delegate;
                                ((SqlDriver) obj).getClass();
                                query2 = frameworkSQLiteDatabase2.query(new CallResult("SELECT customer_id, photo_url, photo, accent_color, themed_accent_color FROM customer"));
                                while (query2.moveToNext()) {
                                    try {
                                        int i92 = query2.getInt(0);
                                        String string3 = query2.isNull(1) ? null : query2.getString(1);
                                        byte[] blob3 = query2.isNull(2) ? null : query2.getBlob(2);
                                        Image image = blob3 != null ? (Image) Image.ADAPTER.decode(blob3) : null;
                                        String string4 = query2.isNull(3) ? null : query2.getString(3);
                                        byte[] blob4 = query2.isNull(4) ? null : query2.getBlob(4);
                                        Color color = blob4 != null ? (Color) Color.ADAPTER.decode(blob4) : null;
                                        if (image == null && string3 != null && color == null && string4 != null) {
                                            sQLiteDatabase2.execSQL("UPDATE new_customer \nSET \n  photo = ?,\n  themed_accent_color = ?\nWHERE customer_id = ?", new Serializable[]{Image.ADAPTER.encode(new Image(string3, string3, 4)), Color.ADAPTER.encode(ColorsKt.toColor(string4)), Integer.valueOf(i92)});
                                        } else if (color == null && string4 != null) {
                                            sQLiteDatabase2.execSQL("UPDATE new_customer \nSET \n  themed_accent_color = ?\nWHERE customer_id = ?", new Serializable[]{Color.ADAPTER.encode(ColorsKt.toColor(string4)), Integer.valueOf(i92)});
                                        }
                                    } catch (Throwable th22222222222222222) {
                                        try {
                                            throw th22222222222222222;
                                        } finally {
                                        }
                                    }
                                }
                                query2.close();
                                return Unit.INSTANCE;
                            case 3:
                                ((SqlDriver) obj).getClass();
                                CashAccountDatabaseCallback.createColumnIfNotExists(frameworkSQLiteDatabase2, "creditLine", "lending_product", "TEXT", null);
                                CashAccountDatabaseCallback.createColumnIfNotExists(frameworkSQLiteDatabase2, "loan", "lending_product", "TEXT", null);
                                CashAccountDatabaseCallback.createColumnIfNotExists(frameworkSQLiteDatabase2, "loanTransaction", "lending_product", "TEXT", null);
                                CashAccountDatabaseCallback.createColumnIfNotExists(frameworkSQLiteDatabase2, "payment", "lending_loan_token", "TEXT", "NULL");
                                CashAccountDatabaseCallback.createColumnIfNotExists(frameworkSQLiteDatabase2, "loan", "bnpl_data", "BLOB", null);
                                return Unit.INSTANCE;
                            case 4:
                                ((SqlDriver) obj).getClass();
                                query2 = frameworkSQLiteDatabase2.query(new CallResult("SELECT count(*) FROM paperDepositBarcodeInfo"));
                                try {
                                    query2.moveToNext();
                                    if (query2.getInt(0) == 0) {
                                        frameworkSQLiteDatabase2.delegate.execSQL("INSERT INTO paperDepositBarcodeInfo DEFAULT VALUES;");
                                    }
                                    query2.close();
                                    return Unit.INSTANCE;
                                } finally {
                                    try {
                                        throw th22222222222222222;
                                    } finally {
                                    }
                                }
                            case 5:
                                ((SqlDriver) obj).getClass();
                                query2 = frameworkSQLiteDatabase2.query(new CallResult("SELECT * FROM profileDirectorySection"));
                                while (query2.moveToNext()) {
                                    try {
                                        int i102 = query2.getInt(0);
                                        String string5 = query2.isNull(1) ? null : query2.getString(1);
                                        if (string5 != null) {
                                            frameworkSQLiteDatabase2.delegate.execSQL(StringsKt__IndentKt.trimMargin$default("\n            |UPDATE profileDirectorySection\n            |SET \n            |  text_title = ?\n            |WHERE id = " + i102 + "\n            "), new byte[][]{Text.ADAPTER.encode(new Text(string5, (TextStyle) null, (TextDecoration) null, (Color) null, (Image) null, 62))});
                                        }
                                    } finally {
                                        try {
                                            throw th22222222222222222;
                                        } finally {
                                        }
                                    }
                                }
                                query2.close();
                                return Unit.INSTANCE;
                            case 6:
                                ((SqlDriver) obj).getClass();
                                query2 = frameworkSQLiteDatabase2.query(new CallResult("SELECT entity_id, customer_token, family_account FROM familyAccount"));
                                while (query2.moveToNext()) {
                                    try {
                                        String string6 = query2.getString(0);
                                        byte[] blob5 = query2.isNull(2) ? null : query2.getBlob(2);
                                        if (blob5 != null) {
                                            UiFamilyAccount uiFamilyAccount = (UiFamilyAccount) UiFamilyAccount.ADAPTER.decode(blob5);
                                            Object[] objArr = new Serializable[3];
                                            objArr[0] = string6;
                                            FamilyAccount familyAccount = uiFamilyAccount.family_account;
                                            BrandCollectionDataKt brandCollectionDataKt = familyAccount != null ? familyAccount.f1246type : null;
                                            FamilyAccount$Type$Dependent familyAccount$Type$Dependent = brandCollectionDataKt instanceof FamilyAccount$Type$Dependent ? (FamilyAccount$Type$Dependent) brandCollectionDataKt : null;
                                            objArr[1] = (familyAccount$Type$Dependent == null || (dependent = familyAccount$Type$Dependent.value) == null) ? null : Dependent.ADAPTER.encode(dependent);
                                            FamilyAccount familyAccount2 = uiFamilyAccount.family_account;
                                            BrandCollectionDataKt brandCollectionDataKt2 = familyAccount2 != null ? familyAccount2.f1246type : null;
                                            FamilyAccount$Type$Sponsor familyAccount$Type$Sponsor = brandCollectionDataKt2 instanceof FamilyAccount$Type$Sponsor ? (FamilyAccount$Type$Sponsor) brandCollectionDataKt2 : null;
                                            objArr[2] = (familyAccount$Type$Sponsor == null || (sponsor = familyAccount$Type$Sponsor.value) == null) ? null : Sponsor.ADAPTER.encode(sponsor);
                                            frameworkSQLiteDatabase2.delegate.execSQL("INSERT INTO family_account(entity_id, dependent, sponsor)\nVALUES (?, ?, ?)", objArr);
                                        }
                                    } catch (Throwable th222222222222222222) {
                                        try {
                                            throw th222222222222222222;
                                        } finally {
                                        }
                                    }
                                }
                                query2.close();
                                return Unit.INSTANCE;
                            case 7:
                                ((SqlDriver) obj).getClass();
                                CashAccountDatabaseCallback.createColumnIfNotExists(frameworkSQLiteDatabase2, "inAppNotificationMessage", "avatar", "BLOB", null);
                                return Unit.INSTANCE;
                            case 8:
                                SQLiteDatabase sQLiteDatabase3 = frameworkSQLiteDatabase2.delegate;
                                ((SqlDriver) obj).getClass();
                                query2 = frameworkSQLiteDatabase2.query(new CallResult("SELECT entity_id, entity FROM sync_entity"));
                                while (query2.moveToNext()) {
                                    try {
                                        String string7 = query2.getString(0);
                                        byte[] blob6 = query2.isNull(1) ? null : query2.getBlob(1);
                                        if (blob6 != null && (syncEntity = (SyncEntity) SyncEntity.ADAPTER.decode(blob6)) != null) {
                                            Long l2 = syncEntity.version;
                                            sQLiteDatabase3.execSQL("UPDATE sync_entity \nSET \n  sync_entity_version = ?\nWHERE entity_id = ?", new Object[]{l2, string7});
                                            if (syncEntity.payment != null) {
                                                sQLiteDatabase3.execSQL("UPDATE payment\nSET \n  sync_entity_version = ?\nWHERE entity_id = ?", new Object[]{l2, string7});
                                            }
                                        }
                                    } finally {
                                        try {
                                            throw th222222222222222222;
                                        } finally {
                                        }
                                    }
                                }
                                query2.close();
                                return Unit.INSTANCE;
                            case 9:
                                ((SqlDriver) obj).getClass();
                                query2 = frameworkSQLiteDatabase2.query(new CallResult("SELECT entity_id, entity_type, entity FROM unhandled_sync_entity"));
                                while (query2.moveToNext()) {
                                    try {
                                        String string8 = query2.getString(0);
                                        int i11 = query2.getInt(1);
                                        byte[] blob7 = query2.isNull(2) ? null : query2.getBlob(2);
                                        if (blob7 != null && (syncEntity2 = (SyncEntity) SyncEntity.ADAPTER.decode(blob7)) != null) {
                                            frameworkSQLiteDatabase2.delegate.execSQL("UPDATE unhandled_sync_entity\nSET\n  entity_version = ?\nWHERE entity_id = ? AND entity_type = ?", new Object[]{syncEntity2.version, string8, Integer.valueOf(i11)});
                                        }
                                    } finally {
                                        try {
                                            throw th222222222222222222;
                                        } finally {
                                        }
                                    }
                                }
                                query2.close();
                                return Unit.INSTANCE;
                            case 10:
                                ((SqlDriver) obj).getClass();
                                query2 = frameworkSQLiteDatabase2.query(new CallResult("SELECT entity_id, entity, entity_processor_version, sync_value_type, sync_entity_version\nFROM sync_entity"));
                                while (query2.moveToNext()) {
                                    try {
                                        String string9 = query2.getString(0);
                                        byte[] blob8 = query2.isNull(1) ? null : query2.getBlob(1);
                                        if (blob8 != null && (syncEntity3 = (SyncEntity) SyncEntity.ADAPTER.decode(blob8)) != null) {
                                            frameworkSQLiteDatabase2.delegate.execSQL("INSERT OR REPLACE INTO new_sync_entity\nVALUES (?, ?, ?, ?, ?, ?);", new Serializable[]{string9, Long.valueOf(EntitySyncerKt.rawEntityType(syncEntity3)), blob8, query2.isNull(2) ? null : Long.valueOf(query2.getLong(2)), query2.isNull(3) ? null : Long.valueOf(query2.getLong(3)), query2.isNull(4) ? null : Long.valueOf(query2.getLong(4))});
                                        }
                                    } finally {
                                        try {
                                            throw th222222222222222222;
                                        } finally {
                                        }
                                    }
                                }
                                query2.close();
                                return Unit.INSTANCE;
                            case 11:
                                ((SqlDriver) obj).getClass();
                                CashAccountDatabaseCallback.restoreEntityProcessorVersionColumn(frameworkSQLiteDatabase2);
                                return Unit.INSTANCE;
                            case 12:
                                ((SqlDriver) obj).getClass();
                                CashAccountDatabaseCallback.restoreEntityProcessorVersionColumn(frameworkSQLiteDatabase2);
                                return Unit.INSTANCE;
                            default:
                                ((SqlDriver) obj).getClass();
                                query2 = frameworkSQLiteDatabase2.query(new CallResult("SELECT entity_id, entity FROM sync_entity WHERE type = 2"));
                                while (query2.moveToNext()) {
                                    try {
                                        byte[] blob9 = query2.isNull(1) ? null : query2.getBlob(1);
                                        if (blob9 != null && (syncEntity4 = (SyncEntity) SyncEntity.ADAPTER.decode(blob9)) != null && (syncCustomer = syncEntity4.customer) != null && (uiCustomer = syncCustomer.customer) != null) {
                                            frameworkSQLiteDatabase2.delegate.execSQL("UPDATE customer SET is_special_customer = ? WHERE customer_id = ?", new Object[]{Long.valueOf(Intrinsics.areEqual(uiCustomer.is_special_customer, Boolean.TRUE) ? 1L : 0L), uiCustomer.id});
                                        }
                                    } finally {
                                    }
                                }
                                query2.close();
                                return Unit.INSTANCE;
                        }
                    }
                });
                final int i11 = 6;
                AfterVersion afterVersion9 = new AfterVersion(571L, new Function1(cashAccountDatabaseCallback) { // from class: com.squareup.cash.db.CashAccountDatabaseCallback$$ExternalSyntheticLambda0
                    /* JADX WARN: Code restructure failed: missing block: B:290:0x03f0, code lost:
                    
                        if (r3 == null) goto L386;
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:302:0x03f2, code lost:
                    
                        r1.execSQL("UPDATE new_customer \nSET \n  photo = ?\nWHERE customer_id = ?", new java.io.Serializable[]{com.squareup.protos.cash.ui.Image.ADAPTER.encode(new com.squareup.protos.cash.ui.Image(r3, r3, 4)), java.lang.Integer.valueOf(r0)});
                     */
                    /* JADX WARN: Finally extract failed */
                    @Override // kotlin.jvm.functions.Function1
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                    */
                    public final Object invoke(Object obj) {
                        Cursor query2;
                        String str;
                        String str2;
                        String name;
                        Sponsor sponsor;
                        Dependent dependent;
                        SyncEntity syncEntity;
                        SyncEntity syncEntity2;
                        SyncEntity syncEntity3;
                        SyncEntity syncEntity4;
                        SyncCustomer syncCustomer;
                        UiCustomer uiCustomer;
                        int i72 = i11;
                        FrameworkSQLiteDatabase frameworkSQLiteDatabase2 = frameworkSQLiteDatabase;
                        switch (i72) {
                            case 0:
                                ((SqlDriver) obj).getClass();
                                query2 = frameworkSQLiteDatabase2.query(new CallResult("SELECT customer_id, merchant_data FROM customer"));
                                while (query2.moveToNext()) {
                                    try {
                                        String string2 = query2.getString(0);
                                        byte[] blob = query2.isNull(1) ? null : query2.getBlob(1);
                                        if (blob != null) {
                                            String str3 = ((MerchantData) MerchantData.ADAPTER.decode(blob)).category;
                                            if (str3 != null) {
                                                str = "'" + str3 + "'";
                                            } else {
                                                str = null;
                                            }
                                            frameworkSQLiteDatabase2.delegate.execSQL(StringsKt__IndentKt.replaceIndent("\n              |UPDATE customer\n              |SET category = " + str + "\n              |WHERE customer_id = '" + string2 + "'\n            "));
                                        }
                                    } catch (Throwable th222222222222222222) {
                                        try {
                                            throw th222222222222222222;
                                        } finally {
                                        }
                                    }
                                }
                                query2.close();
                                return Unit.INSTANCE;
                            case 1:
                                ((SqlDriver) obj).getClass();
                                query2 = frameworkSQLiteDatabase2.query(new CallResult("SELECT _id, amount FROM payment"));
                                while (query2.moveToNext()) {
                                    try {
                                        int i82 = query2.getInt(0);
                                        byte[] blob2 = query2.isNull(1) ? null : query2.getBlob(1);
                                        if (blob2 != null) {
                                            Money money = (Money) Money.ADAPTER.decode(blob2);
                                            Long l = money.amount;
                                            CurrencyCode currencyCode = money.currency_code;
                                            if (currencyCode == null || (name = currencyCode.name()) == null) {
                                                str2 = null;
                                            } else {
                                                str2 = "'" + name + "'";
                                            }
                                            frameworkSQLiteDatabase2.delegate.execSQL(StringsKt__IndentKt.trimMargin$default("\n            |UPDATE new_payment \n            |SET \n            |  amount = " + l + ", \n            |  amount_currency = " + str2 + "\n            |WHERE _id = " + i82 + "\n            "));
                                        }
                                    } catch (Throwable th2222222222222222222) {
                                        try {
                                            throw th2222222222222222222;
                                        } finally {
                                        }
                                    }
                                }
                                query2.close();
                                return Unit.INSTANCE;
                            case 2:
                                SQLiteDatabase sQLiteDatabase2 = frameworkSQLiteDatabase2.delegate;
                                ((SqlDriver) obj).getClass();
                                query2 = frameworkSQLiteDatabase2.query(new CallResult("SELECT customer_id, photo_url, photo, accent_color, themed_accent_color FROM customer"));
                                while (query2.moveToNext()) {
                                    try {
                                        int i92 = query2.getInt(0);
                                        String string3 = query2.isNull(1) ? null : query2.getString(1);
                                        byte[] blob3 = query2.isNull(2) ? null : query2.getBlob(2);
                                        Image image = blob3 != null ? (Image) Image.ADAPTER.decode(blob3) : null;
                                        String string4 = query2.isNull(3) ? null : query2.getString(3);
                                        byte[] blob4 = query2.isNull(4) ? null : query2.getBlob(4);
                                        Color color = blob4 != null ? (Color) Color.ADAPTER.decode(blob4) : null;
                                        if (image == null && string3 != null && color == null && string4 != null) {
                                            sQLiteDatabase2.execSQL("UPDATE new_customer \nSET \n  photo = ?,\n  themed_accent_color = ?\nWHERE customer_id = ?", new Serializable[]{Image.ADAPTER.encode(new Image(string3, string3, 4)), Color.ADAPTER.encode(ColorsKt.toColor(string4)), Integer.valueOf(i92)});
                                        } else if (color == null && string4 != null) {
                                            sQLiteDatabase2.execSQL("UPDATE new_customer \nSET \n  themed_accent_color = ?\nWHERE customer_id = ?", new Serializable[]{Color.ADAPTER.encode(ColorsKt.toColor(string4)), Integer.valueOf(i92)});
                                        }
                                    } catch (Throwable th22222222222222222222) {
                                        try {
                                            throw th22222222222222222222;
                                        } finally {
                                        }
                                    }
                                }
                                query2.close();
                                return Unit.INSTANCE;
                            case 3:
                                ((SqlDriver) obj).getClass();
                                CashAccountDatabaseCallback.createColumnIfNotExists(frameworkSQLiteDatabase2, "creditLine", "lending_product", "TEXT", null);
                                CashAccountDatabaseCallback.createColumnIfNotExists(frameworkSQLiteDatabase2, "loan", "lending_product", "TEXT", null);
                                CashAccountDatabaseCallback.createColumnIfNotExists(frameworkSQLiteDatabase2, "loanTransaction", "lending_product", "TEXT", null);
                                CashAccountDatabaseCallback.createColumnIfNotExists(frameworkSQLiteDatabase2, "payment", "lending_loan_token", "TEXT", "NULL");
                                CashAccountDatabaseCallback.createColumnIfNotExists(frameworkSQLiteDatabase2, "loan", "bnpl_data", "BLOB", null);
                                return Unit.INSTANCE;
                            case 4:
                                ((SqlDriver) obj).getClass();
                                query2 = frameworkSQLiteDatabase2.query(new CallResult("SELECT count(*) FROM paperDepositBarcodeInfo"));
                                try {
                                    query2.moveToNext();
                                    if (query2.getInt(0) == 0) {
                                        frameworkSQLiteDatabase2.delegate.execSQL("INSERT INTO paperDepositBarcodeInfo DEFAULT VALUES;");
                                    }
                                    query2.close();
                                    return Unit.INSTANCE;
                                } finally {
                                    try {
                                        throw th22222222222222222222;
                                    } finally {
                                    }
                                }
                            case 5:
                                ((SqlDriver) obj).getClass();
                                query2 = frameworkSQLiteDatabase2.query(new CallResult("SELECT * FROM profileDirectorySection"));
                                while (query2.moveToNext()) {
                                    try {
                                        int i102 = query2.getInt(0);
                                        String string5 = query2.isNull(1) ? null : query2.getString(1);
                                        if (string5 != null) {
                                            frameworkSQLiteDatabase2.delegate.execSQL(StringsKt__IndentKt.trimMargin$default("\n            |UPDATE profileDirectorySection\n            |SET \n            |  text_title = ?\n            |WHERE id = " + i102 + "\n            "), new byte[][]{Text.ADAPTER.encode(new Text(string5, (TextStyle) null, (TextDecoration) null, (Color) null, (Image) null, 62))});
                                        }
                                    } finally {
                                        try {
                                            throw th22222222222222222222;
                                        } finally {
                                        }
                                    }
                                }
                                query2.close();
                                return Unit.INSTANCE;
                            case 6:
                                ((SqlDriver) obj).getClass();
                                query2 = frameworkSQLiteDatabase2.query(new CallResult("SELECT entity_id, customer_token, family_account FROM familyAccount"));
                                while (query2.moveToNext()) {
                                    try {
                                        String string6 = query2.getString(0);
                                        byte[] blob5 = query2.isNull(2) ? null : query2.getBlob(2);
                                        if (blob5 != null) {
                                            UiFamilyAccount uiFamilyAccount = (UiFamilyAccount) UiFamilyAccount.ADAPTER.decode(blob5);
                                            Object[] objArr = new Serializable[3];
                                            objArr[0] = string6;
                                            FamilyAccount familyAccount = uiFamilyAccount.family_account;
                                            BrandCollectionDataKt brandCollectionDataKt = familyAccount != null ? familyAccount.f1246type : null;
                                            FamilyAccount$Type$Dependent familyAccount$Type$Dependent = brandCollectionDataKt instanceof FamilyAccount$Type$Dependent ? (FamilyAccount$Type$Dependent) brandCollectionDataKt : null;
                                            objArr[1] = (familyAccount$Type$Dependent == null || (dependent = familyAccount$Type$Dependent.value) == null) ? null : Dependent.ADAPTER.encode(dependent);
                                            FamilyAccount familyAccount2 = uiFamilyAccount.family_account;
                                            BrandCollectionDataKt brandCollectionDataKt2 = familyAccount2 != null ? familyAccount2.f1246type : null;
                                            FamilyAccount$Type$Sponsor familyAccount$Type$Sponsor = brandCollectionDataKt2 instanceof FamilyAccount$Type$Sponsor ? (FamilyAccount$Type$Sponsor) brandCollectionDataKt2 : null;
                                            objArr[2] = (familyAccount$Type$Sponsor == null || (sponsor = familyAccount$Type$Sponsor.value) == null) ? null : Sponsor.ADAPTER.encode(sponsor);
                                            frameworkSQLiteDatabase2.delegate.execSQL("INSERT INTO family_account(entity_id, dependent, sponsor)\nVALUES (?, ?, ?)", objArr);
                                        }
                                    } catch (Throwable th222222222222222222222) {
                                        try {
                                            throw th222222222222222222222;
                                        } finally {
                                        }
                                    }
                                }
                                query2.close();
                                return Unit.INSTANCE;
                            case 7:
                                ((SqlDriver) obj).getClass();
                                CashAccountDatabaseCallback.createColumnIfNotExists(frameworkSQLiteDatabase2, "inAppNotificationMessage", "avatar", "BLOB", null);
                                return Unit.INSTANCE;
                            case 8:
                                SQLiteDatabase sQLiteDatabase3 = frameworkSQLiteDatabase2.delegate;
                                ((SqlDriver) obj).getClass();
                                query2 = frameworkSQLiteDatabase2.query(new CallResult("SELECT entity_id, entity FROM sync_entity"));
                                while (query2.moveToNext()) {
                                    try {
                                        String string7 = query2.getString(0);
                                        byte[] blob6 = query2.isNull(1) ? null : query2.getBlob(1);
                                        if (blob6 != null && (syncEntity = (SyncEntity) SyncEntity.ADAPTER.decode(blob6)) != null) {
                                            Long l2 = syncEntity.version;
                                            sQLiteDatabase3.execSQL("UPDATE sync_entity \nSET \n  sync_entity_version = ?\nWHERE entity_id = ?", new Object[]{l2, string7});
                                            if (syncEntity.payment != null) {
                                                sQLiteDatabase3.execSQL("UPDATE payment\nSET \n  sync_entity_version = ?\nWHERE entity_id = ?", new Object[]{l2, string7});
                                            }
                                        }
                                    } finally {
                                        try {
                                            throw th222222222222222222222;
                                        } finally {
                                        }
                                    }
                                }
                                query2.close();
                                return Unit.INSTANCE;
                            case 9:
                                ((SqlDriver) obj).getClass();
                                query2 = frameworkSQLiteDatabase2.query(new CallResult("SELECT entity_id, entity_type, entity FROM unhandled_sync_entity"));
                                while (query2.moveToNext()) {
                                    try {
                                        String string8 = query2.getString(0);
                                        int i112 = query2.getInt(1);
                                        byte[] blob7 = query2.isNull(2) ? null : query2.getBlob(2);
                                        if (blob7 != null && (syncEntity2 = (SyncEntity) SyncEntity.ADAPTER.decode(blob7)) != null) {
                                            frameworkSQLiteDatabase2.delegate.execSQL("UPDATE unhandled_sync_entity\nSET\n  entity_version = ?\nWHERE entity_id = ? AND entity_type = ?", new Object[]{syncEntity2.version, string8, Integer.valueOf(i112)});
                                        }
                                    } finally {
                                        try {
                                            throw th222222222222222222222;
                                        } finally {
                                        }
                                    }
                                }
                                query2.close();
                                return Unit.INSTANCE;
                            case 10:
                                ((SqlDriver) obj).getClass();
                                query2 = frameworkSQLiteDatabase2.query(new CallResult("SELECT entity_id, entity, entity_processor_version, sync_value_type, sync_entity_version\nFROM sync_entity"));
                                while (query2.moveToNext()) {
                                    try {
                                        String string9 = query2.getString(0);
                                        byte[] blob8 = query2.isNull(1) ? null : query2.getBlob(1);
                                        if (blob8 != null && (syncEntity3 = (SyncEntity) SyncEntity.ADAPTER.decode(blob8)) != null) {
                                            frameworkSQLiteDatabase2.delegate.execSQL("INSERT OR REPLACE INTO new_sync_entity\nVALUES (?, ?, ?, ?, ?, ?);", new Serializable[]{string9, Long.valueOf(EntitySyncerKt.rawEntityType(syncEntity3)), blob8, query2.isNull(2) ? null : Long.valueOf(query2.getLong(2)), query2.isNull(3) ? null : Long.valueOf(query2.getLong(3)), query2.isNull(4) ? null : Long.valueOf(query2.getLong(4))});
                                        }
                                    } finally {
                                        try {
                                            throw th222222222222222222222;
                                        } finally {
                                        }
                                    }
                                }
                                query2.close();
                                return Unit.INSTANCE;
                            case 11:
                                ((SqlDriver) obj).getClass();
                                CashAccountDatabaseCallback.restoreEntityProcessorVersionColumn(frameworkSQLiteDatabase2);
                                return Unit.INSTANCE;
                            case 12:
                                ((SqlDriver) obj).getClass();
                                CashAccountDatabaseCallback.restoreEntityProcessorVersionColumn(frameworkSQLiteDatabase2);
                                return Unit.INSTANCE;
                            default:
                                ((SqlDriver) obj).getClass();
                                query2 = frameworkSQLiteDatabase2.query(new CallResult("SELECT entity_id, entity FROM sync_entity WHERE type = 2"));
                                while (query2.moveToNext()) {
                                    try {
                                        byte[] blob9 = query2.isNull(1) ? null : query2.getBlob(1);
                                        if (blob9 != null && (syncEntity4 = (SyncEntity) SyncEntity.ADAPTER.decode(blob9)) != null && (syncCustomer = syncEntity4.customer) != null && (uiCustomer = syncCustomer.customer) != null) {
                                            frameworkSQLiteDatabase2.delegate.execSQL("UPDATE customer SET is_special_customer = ? WHERE customer_id = ?", new Object[]{Long.valueOf(Intrinsics.areEqual(uiCustomer.is_special_customer, Boolean.TRUE) ? 1L : 0L), uiCustomer.id});
                                        }
                                    } finally {
                                    }
                                }
                                query2.close();
                                return Unit.INSTANCE;
                        }
                    }
                });
                final int i12 = 7;
                AfterVersion afterVersion10 = new AfterVersion(580L, new Function1(cashAccountDatabaseCallback) { // from class: com.squareup.cash.db.CashAccountDatabaseCallback$$ExternalSyntheticLambda0
                    /* JADX WARN: Code restructure failed: missing block: B:290:0x03f0, code lost:
                    
                        if (r3 == null) goto L386;
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:302:0x03f2, code lost:
                    
                        r1.execSQL("UPDATE new_customer \nSET \n  photo = ?\nWHERE customer_id = ?", new java.io.Serializable[]{com.squareup.protos.cash.ui.Image.ADAPTER.encode(new com.squareup.protos.cash.ui.Image(r3, r3, 4)), java.lang.Integer.valueOf(r0)});
                     */
                    /* JADX WARN: Finally extract failed */
                    @Override // kotlin.jvm.functions.Function1
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                    */
                    public final Object invoke(Object obj) {
                        Cursor query2;
                        String str;
                        String str2;
                        String name;
                        Sponsor sponsor;
                        Dependent dependent;
                        SyncEntity syncEntity;
                        SyncEntity syncEntity2;
                        SyncEntity syncEntity3;
                        SyncEntity syncEntity4;
                        SyncCustomer syncCustomer;
                        UiCustomer uiCustomer;
                        int i72 = i12;
                        FrameworkSQLiteDatabase frameworkSQLiteDatabase2 = frameworkSQLiteDatabase;
                        switch (i72) {
                            case 0:
                                ((SqlDriver) obj).getClass();
                                query2 = frameworkSQLiteDatabase2.query(new CallResult("SELECT customer_id, merchant_data FROM customer"));
                                while (query2.moveToNext()) {
                                    try {
                                        String string2 = query2.getString(0);
                                        byte[] blob = query2.isNull(1) ? null : query2.getBlob(1);
                                        if (blob != null) {
                                            String str3 = ((MerchantData) MerchantData.ADAPTER.decode(blob)).category;
                                            if (str3 != null) {
                                                str = "'" + str3 + "'";
                                            } else {
                                                str = null;
                                            }
                                            frameworkSQLiteDatabase2.delegate.execSQL(StringsKt__IndentKt.replaceIndent("\n              |UPDATE customer\n              |SET category = " + str + "\n              |WHERE customer_id = '" + string2 + "'\n            "));
                                        }
                                    } catch (Throwable th222222222222222222222) {
                                        try {
                                            throw th222222222222222222222;
                                        } finally {
                                        }
                                    }
                                }
                                query2.close();
                                return Unit.INSTANCE;
                            case 1:
                                ((SqlDriver) obj).getClass();
                                query2 = frameworkSQLiteDatabase2.query(new CallResult("SELECT _id, amount FROM payment"));
                                while (query2.moveToNext()) {
                                    try {
                                        int i82 = query2.getInt(0);
                                        byte[] blob2 = query2.isNull(1) ? null : query2.getBlob(1);
                                        if (blob2 != null) {
                                            Money money = (Money) Money.ADAPTER.decode(blob2);
                                            Long l = money.amount;
                                            CurrencyCode currencyCode = money.currency_code;
                                            if (currencyCode == null || (name = currencyCode.name()) == null) {
                                                str2 = null;
                                            } else {
                                                str2 = "'" + name + "'";
                                            }
                                            frameworkSQLiteDatabase2.delegate.execSQL(StringsKt__IndentKt.trimMargin$default("\n            |UPDATE new_payment \n            |SET \n            |  amount = " + l + ", \n            |  amount_currency = " + str2 + "\n            |WHERE _id = " + i82 + "\n            "));
                                        }
                                    } catch (Throwable th2222222222222222222222) {
                                        try {
                                            throw th2222222222222222222222;
                                        } finally {
                                        }
                                    }
                                }
                                query2.close();
                                return Unit.INSTANCE;
                            case 2:
                                SQLiteDatabase sQLiteDatabase2 = frameworkSQLiteDatabase2.delegate;
                                ((SqlDriver) obj).getClass();
                                query2 = frameworkSQLiteDatabase2.query(new CallResult("SELECT customer_id, photo_url, photo, accent_color, themed_accent_color FROM customer"));
                                while (query2.moveToNext()) {
                                    try {
                                        int i92 = query2.getInt(0);
                                        String string3 = query2.isNull(1) ? null : query2.getString(1);
                                        byte[] blob3 = query2.isNull(2) ? null : query2.getBlob(2);
                                        Image image = blob3 != null ? (Image) Image.ADAPTER.decode(blob3) : null;
                                        String string4 = query2.isNull(3) ? null : query2.getString(3);
                                        byte[] blob4 = query2.isNull(4) ? null : query2.getBlob(4);
                                        Color color = blob4 != null ? (Color) Color.ADAPTER.decode(blob4) : null;
                                        if (image == null && string3 != null && color == null && string4 != null) {
                                            sQLiteDatabase2.execSQL("UPDATE new_customer \nSET \n  photo = ?,\n  themed_accent_color = ?\nWHERE customer_id = ?", new Serializable[]{Image.ADAPTER.encode(new Image(string3, string3, 4)), Color.ADAPTER.encode(ColorsKt.toColor(string4)), Integer.valueOf(i92)});
                                        } else if (color == null && string4 != null) {
                                            sQLiteDatabase2.execSQL("UPDATE new_customer \nSET \n  themed_accent_color = ?\nWHERE customer_id = ?", new Serializable[]{Color.ADAPTER.encode(ColorsKt.toColor(string4)), Integer.valueOf(i92)});
                                        }
                                    } catch (Throwable th22222222222222222222222) {
                                        try {
                                            throw th22222222222222222222222;
                                        } finally {
                                        }
                                    }
                                }
                                query2.close();
                                return Unit.INSTANCE;
                            case 3:
                                ((SqlDriver) obj).getClass();
                                CashAccountDatabaseCallback.createColumnIfNotExists(frameworkSQLiteDatabase2, "creditLine", "lending_product", "TEXT", null);
                                CashAccountDatabaseCallback.createColumnIfNotExists(frameworkSQLiteDatabase2, "loan", "lending_product", "TEXT", null);
                                CashAccountDatabaseCallback.createColumnIfNotExists(frameworkSQLiteDatabase2, "loanTransaction", "lending_product", "TEXT", null);
                                CashAccountDatabaseCallback.createColumnIfNotExists(frameworkSQLiteDatabase2, "payment", "lending_loan_token", "TEXT", "NULL");
                                CashAccountDatabaseCallback.createColumnIfNotExists(frameworkSQLiteDatabase2, "loan", "bnpl_data", "BLOB", null);
                                return Unit.INSTANCE;
                            case 4:
                                ((SqlDriver) obj).getClass();
                                query2 = frameworkSQLiteDatabase2.query(new CallResult("SELECT count(*) FROM paperDepositBarcodeInfo"));
                                try {
                                    query2.moveToNext();
                                    if (query2.getInt(0) == 0) {
                                        frameworkSQLiteDatabase2.delegate.execSQL("INSERT INTO paperDepositBarcodeInfo DEFAULT VALUES;");
                                    }
                                    query2.close();
                                    return Unit.INSTANCE;
                                } finally {
                                    try {
                                        throw th22222222222222222222222;
                                    } finally {
                                    }
                                }
                            case 5:
                                ((SqlDriver) obj).getClass();
                                query2 = frameworkSQLiteDatabase2.query(new CallResult("SELECT * FROM profileDirectorySection"));
                                while (query2.moveToNext()) {
                                    try {
                                        int i102 = query2.getInt(0);
                                        String string5 = query2.isNull(1) ? null : query2.getString(1);
                                        if (string5 != null) {
                                            frameworkSQLiteDatabase2.delegate.execSQL(StringsKt__IndentKt.trimMargin$default("\n            |UPDATE profileDirectorySection\n            |SET \n            |  text_title = ?\n            |WHERE id = " + i102 + "\n            "), new byte[][]{Text.ADAPTER.encode(new Text(string5, (TextStyle) null, (TextDecoration) null, (Color) null, (Image) null, 62))});
                                        }
                                    } finally {
                                        try {
                                            throw th22222222222222222222222;
                                        } finally {
                                        }
                                    }
                                }
                                query2.close();
                                return Unit.INSTANCE;
                            case 6:
                                ((SqlDriver) obj).getClass();
                                query2 = frameworkSQLiteDatabase2.query(new CallResult("SELECT entity_id, customer_token, family_account FROM familyAccount"));
                                while (query2.moveToNext()) {
                                    try {
                                        String string6 = query2.getString(0);
                                        byte[] blob5 = query2.isNull(2) ? null : query2.getBlob(2);
                                        if (blob5 != null) {
                                            UiFamilyAccount uiFamilyAccount = (UiFamilyAccount) UiFamilyAccount.ADAPTER.decode(blob5);
                                            Object[] objArr = new Serializable[3];
                                            objArr[0] = string6;
                                            FamilyAccount familyAccount = uiFamilyAccount.family_account;
                                            BrandCollectionDataKt brandCollectionDataKt = familyAccount != null ? familyAccount.f1246type : null;
                                            FamilyAccount$Type$Dependent familyAccount$Type$Dependent = brandCollectionDataKt instanceof FamilyAccount$Type$Dependent ? (FamilyAccount$Type$Dependent) brandCollectionDataKt : null;
                                            objArr[1] = (familyAccount$Type$Dependent == null || (dependent = familyAccount$Type$Dependent.value) == null) ? null : Dependent.ADAPTER.encode(dependent);
                                            FamilyAccount familyAccount2 = uiFamilyAccount.family_account;
                                            BrandCollectionDataKt brandCollectionDataKt2 = familyAccount2 != null ? familyAccount2.f1246type : null;
                                            FamilyAccount$Type$Sponsor familyAccount$Type$Sponsor = brandCollectionDataKt2 instanceof FamilyAccount$Type$Sponsor ? (FamilyAccount$Type$Sponsor) brandCollectionDataKt2 : null;
                                            objArr[2] = (familyAccount$Type$Sponsor == null || (sponsor = familyAccount$Type$Sponsor.value) == null) ? null : Sponsor.ADAPTER.encode(sponsor);
                                            frameworkSQLiteDatabase2.delegate.execSQL("INSERT INTO family_account(entity_id, dependent, sponsor)\nVALUES (?, ?, ?)", objArr);
                                        }
                                    } catch (Throwable th222222222222222222222222) {
                                        try {
                                            throw th222222222222222222222222;
                                        } finally {
                                        }
                                    }
                                }
                                query2.close();
                                return Unit.INSTANCE;
                            case 7:
                                ((SqlDriver) obj).getClass();
                                CashAccountDatabaseCallback.createColumnIfNotExists(frameworkSQLiteDatabase2, "inAppNotificationMessage", "avatar", "BLOB", null);
                                return Unit.INSTANCE;
                            case 8:
                                SQLiteDatabase sQLiteDatabase3 = frameworkSQLiteDatabase2.delegate;
                                ((SqlDriver) obj).getClass();
                                query2 = frameworkSQLiteDatabase2.query(new CallResult("SELECT entity_id, entity FROM sync_entity"));
                                while (query2.moveToNext()) {
                                    try {
                                        String string7 = query2.getString(0);
                                        byte[] blob6 = query2.isNull(1) ? null : query2.getBlob(1);
                                        if (blob6 != null && (syncEntity = (SyncEntity) SyncEntity.ADAPTER.decode(blob6)) != null) {
                                            Long l2 = syncEntity.version;
                                            sQLiteDatabase3.execSQL("UPDATE sync_entity \nSET \n  sync_entity_version = ?\nWHERE entity_id = ?", new Object[]{l2, string7});
                                            if (syncEntity.payment != null) {
                                                sQLiteDatabase3.execSQL("UPDATE payment\nSET \n  sync_entity_version = ?\nWHERE entity_id = ?", new Object[]{l2, string7});
                                            }
                                        }
                                    } finally {
                                        try {
                                            throw th222222222222222222222222;
                                        } finally {
                                        }
                                    }
                                }
                                query2.close();
                                return Unit.INSTANCE;
                            case 9:
                                ((SqlDriver) obj).getClass();
                                query2 = frameworkSQLiteDatabase2.query(new CallResult("SELECT entity_id, entity_type, entity FROM unhandled_sync_entity"));
                                while (query2.moveToNext()) {
                                    try {
                                        String string8 = query2.getString(0);
                                        int i112 = query2.getInt(1);
                                        byte[] blob7 = query2.isNull(2) ? null : query2.getBlob(2);
                                        if (blob7 != null && (syncEntity2 = (SyncEntity) SyncEntity.ADAPTER.decode(blob7)) != null) {
                                            frameworkSQLiteDatabase2.delegate.execSQL("UPDATE unhandled_sync_entity\nSET\n  entity_version = ?\nWHERE entity_id = ? AND entity_type = ?", new Object[]{syncEntity2.version, string8, Integer.valueOf(i112)});
                                        }
                                    } finally {
                                        try {
                                            throw th222222222222222222222222;
                                        } finally {
                                        }
                                    }
                                }
                                query2.close();
                                return Unit.INSTANCE;
                            case 10:
                                ((SqlDriver) obj).getClass();
                                query2 = frameworkSQLiteDatabase2.query(new CallResult("SELECT entity_id, entity, entity_processor_version, sync_value_type, sync_entity_version\nFROM sync_entity"));
                                while (query2.moveToNext()) {
                                    try {
                                        String string9 = query2.getString(0);
                                        byte[] blob8 = query2.isNull(1) ? null : query2.getBlob(1);
                                        if (blob8 != null && (syncEntity3 = (SyncEntity) SyncEntity.ADAPTER.decode(blob8)) != null) {
                                            frameworkSQLiteDatabase2.delegate.execSQL("INSERT OR REPLACE INTO new_sync_entity\nVALUES (?, ?, ?, ?, ?, ?);", new Serializable[]{string9, Long.valueOf(EntitySyncerKt.rawEntityType(syncEntity3)), blob8, query2.isNull(2) ? null : Long.valueOf(query2.getLong(2)), query2.isNull(3) ? null : Long.valueOf(query2.getLong(3)), query2.isNull(4) ? null : Long.valueOf(query2.getLong(4))});
                                        }
                                    } finally {
                                        try {
                                            throw th222222222222222222222222;
                                        } finally {
                                        }
                                    }
                                }
                                query2.close();
                                return Unit.INSTANCE;
                            case 11:
                                ((SqlDriver) obj).getClass();
                                CashAccountDatabaseCallback.restoreEntityProcessorVersionColumn(frameworkSQLiteDatabase2);
                                return Unit.INSTANCE;
                            case 12:
                                ((SqlDriver) obj).getClass();
                                CashAccountDatabaseCallback.restoreEntityProcessorVersionColumn(frameworkSQLiteDatabase2);
                                return Unit.INSTANCE;
                            default:
                                ((SqlDriver) obj).getClass();
                                query2 = frameworkSQLiteDatabase2.query(new CallResult("SELECT entity_id, entity FROM sync_entity WHERE type = 2"));
                                while (query2.moveToNext()) {
                                    try {
                                        byte[] blob9 = query2.isNull(1) ? null : query2.getBlob(1);
                                        if (blob9 != null && (syncEntity4 = (SyncEntity) SyncEntity.ADAPTER.decode(blob9)) != null && (syncCustomer = syncEntity4.customer) != null && (uiCustomer = syncCustomer.customer) != null) {
                                            frameworkSQLiteDatabase2.delegate.execSQL("UPDATE customer SET is_special_customer = ? WHERE customer_id = ?", new Object[]{Long.valueOf(Intrinsics.areEqual(uiCustomer.is_special_customer, Boolean.TRUE) ? 1L : 0L), uiCustomer.id});
                                        }
                                    } finally {
                                    }
                                }
                                query2.close();
                                return Unit.INSTANCE;
                        }
                    }
                });
                final int i13 = 8;
                AfterVersion afterVersion11 = new AfterVersion(627L, new Function1(cashAccountDatabaseCallback) { // from class: com.squareup.cash.db.CashAccountDatabaseCallback$$ExternalSyntheticLambda0
                    /* JADX WARN: Code restructure failed: missing block: B:290:0x03f0, code lost:
                    
                        if (r3 == null) goto L386;
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:302:0x03f2, code lost:
                    
                        r1.execSQL("UPDATE new_customer \nSET \n  photo = ?\nWHERE customer_id = ?", new java.io.Serializable[]{com.squareup.protos.cash.ui.Image.ADAPTER.encode(new com.squareup.protos.cash.ui.Image(r3, r3, 4)), java.lang.Integer.valueOf(r0)});
                     */
                    /* JADX WARN: Finally extract failed */
                    @Override // kotlin.jvm.functions.Function1
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                    */
                    public final Object invoke(Object obj) {
                        Cursor query2;
                        String str;
                        String str2;
                        String name;
                        Sponsor sponsor;
                        Dependent dependent;
                        SyncEntity syncEntity;
                        SyncEntity syncEntity2;
                        SyncEntity syncEntity3;
                        SyncEntity syncEntity4;
                        SyncCustomer syncCustomer;
                        UiCustomer uiCustomer;
                        int i72 = i13;
                        FrameworkSQLiteDatabase frameworkSQLiteDatabase2 = frameworkSQLiteDatabase;
                        switch (i72) {
                            case 0:
                                ((SqlDriver) obj).getClass();
                                query2 = frameworkSQLiteDatabase2.query(new CallResult("SELECT customer_id, merchant_data FROM customer"));
                                while (query2.moveToNext()) {
                                    try {
                                        String string2 = query2.getString(0);
                                        byte[] blob = query2.isNull(1) ? null : query2.getBlob(1);
                                        if (blob != null) {
                                            String str3 = ((MerchantData) MerchantData.ADAPTER.decode(blob)).category;
                                            if (str3 != null) {
                                                str = "'" + str3 + "'";
                                            } else {
                                                str = null;
                                            }
                                            frameworkSQLiteDatabase2.delegate.execSQL(StringsKt__IndentKt.replaceIndent("\n              |UPDATE customer\n              |SET category = " + str + "\n              |WHERE customer_id = '" + string2 + "'\n            "));
                                        }
                                    } catch (Throwable th222222222222222222222222) {
                                        try {
                                            throw th222222222222222222222222;
                                        } finally {
                                        }
                                    }
                                }
                                query2.close();
                                return Unit.INSTANCE;
                            case 1:
                                ((SqlDriver) obj).getClass();
                                query2 = frameworkSQLiteDatabase2.query(new CallResult("SELECT _id, amount FROM payment"));
                                while (query2.moveToNext()) {
                                    try {
                                        int i82 = query2.getInt(0);
                                        byte[] blob2 = query2.isNull(1) ? null : query2.getBlob(1);
                                        if (blob2 != null) {
                                            Money money = (Money) Money.ADAPTER.decode(blob2);
                                            Long l = money.amount;
                                            CurrencyCode currencyCode = money.currency_code;
                                            if (currencyCode == null || (name = currencyCode.name()) == null) {
                                                str2 = null;
                                            } else {
                                                str2 = "'" + name + "'";
                                            }
                                            frameworkSQLiteDatabase2.delegate.execSQL(StringsKt__IndentKt.trimMargin$default("\n            |UPDATE new_payment \n            |SET \n            |  amount = " + l + ", \n            |  amount_currency = " + str2 + "\n            |WHERE _id = " + i82 + "\n            "));
                                        }
                                    } catch (Throwable th2222222222222222222222222) {
                                        try {
                                            throw th2222222222222222222222222;
                                        } finally {
                                        }
                                    }
                                }
                                query2.close();
                                return Unit.INSTANCE;
                            case 2:
                                SQLiteDatabase sQLiteDatabase2 = frameworkSQLiteDatabase2.delegate;
                                ((SqlDriver) obj).getClass();
                                query2 = frameworkSQLiteDatabase2.query(new CallResult("SELECT customer_id, photo_url, photo, accent_color, themed_accent_color FROM customer"));
                                while (query2.moveToNext()) {
                                    try {
                                        int i92 = query2.getInt(0);
                                        String string3 = query2.isNull(1) ? null : query2.getString(1);
                                        byte[] blob3 = query2.isNull(2) ? null : query2.getBlob(2);
                                        Image image = blob3 != null ? (Image) Image.ADAPTER.decode(blob3) : null;
                                        String string4 = query2.isNull(3) ? null : query2.getString(3);
                                        byte[] blob4 = query2.isNull(4) ? null : query2.getBlob(4);
                                        Color color = blob4 != null ? (Color) Color.ADAPTER.decode(blob4) : null;
                                        if (image == null && string3 != null && color == null && string4 != null) {
                                            sQLiteDatabase2.execSQL("UPDATE new_customer \nSET \n  photo = ?,\n  themed_accent_color = ?\nWHERE customer_id = ?", new Serializable[]{Image.ADAPTER.encode(new Image(string3, string3, 4)), Color.ADAPTER.encode(ColorsKt.toColor(string4)), Integer.valueOf(i92)});
                                        } else if (color == null && string4 != null) {
                                            sQLiteDatabase2.execSQL("UPDATE new_customer \nSET \n  themed_accent_color = ?\nWHERE customer_id = ?", new Serializable[]{Color.ADAPTER.encode(ColorsKt.toColor(string4)), Integer.valueOf(i92)});
                                        }
                                    } catch (Throwable th22222222222222222222222222) {
                                        try {
                                            throw th22222222222222222222222222;
                                        } finally {
                                        }
                                    }
                                }
                                query2.close();
                                return Unit.INSTANCE;
                            case 3:
                                ((SqlDriver) obj).getClass();
                                CashAccountDatabaseCallback.createColumnIfNotExists(frameworkSQLiteDatabase2, "creditLine", "lending_product", "TEXT", null);
                                CashAccountDatabaseCallback.createColumnIfNotExists(frameworkSQLiteDatabase2, "loan", "lending_product", "TEXT", null);
                                CashAccountDatabaseCallback.createColumnIfNotExists(frameworkSQLiteDatabase2, "loanTransaction", "lending_product", "TEXT", null);
                                CashAccountDatabaseCallback.createColumnIfNotExists(frameworkSQLiteDatabase2, "payment", "lending_loan_token", "TEXT", "NULL");
                                CashAccountDatabaseCallback.createColumnIfNotExists(frameworkSQLiteDatabase2, "loan", "bnpl_data", "BLOB", null);
                                return Unit.INSTANCE;
                            case 4:
                                ((SqlDriver) obj).getClass();
                                query2 = frameworkSQLiteDatabase2.query(new CallResult("SELECT count(*) FROM paperDepositBarcodeInfo"));
                                try {
                                    query2.moveToNext();
                                    if (query2.getInt(0) == 0) {
                                        frameworkSQLiteDatabase2.delegate.execSQL("INSERT INTO paperDepositBarcodeInfo DEFAULT VALUES;");
                                    }
                                    query2.close();
                                    return Unit.INSTANCE;
                                } finally {
                                    try {
                                        throw th22222222222222222222222222;
                                    } finally {
                                    }
                                }
                            case 5:
                                ((SqlDriver) obj).getClass();
                                query2 = frameworkSQLiteDatabase2.query(new CallResult("SELECT * FROM profileDirectorySection"));
                                while (query2.moveToNext()) {
                                    try {
                                        int i102 = query2.getInt(0);
                                        String string5 = query2.isNull(1) ? null : query2.getString(1);
                                        if (string5 != null) {
                                            frameworkSQLiteDatabase2.delegate.execSQL(StringsKt__IndentKt.trimMargin$default("\n            |UPDATE profileDirectorySection\n            |SET \n            |  text_title = ?\n            |WHERE id = " + i102 + "\n            "), new byte[][]{Text.ADAPTER.encode(new Text(string5, (TextStyle) null, (TextDecoration) null, (Color) null, (Image) null, 62))});
                                        }
                                    } finally {
                                        try {
                                            throw th22222222222222222222222222;
                                        } finally {
                                        }
                                    }
                                }
                                query2.close();
                                return Unit.INSTANCE;
                            case 6:
                                ((SqlDriver) obj).getClass();
                                query2 = frameworkSQLiteDatabase2.query(new CallResult("SELECT entity_id, customer_token, family_account FROM familyAccount"));
                                while (query2.moveToNext()) {
                                    try {
                                        String string6 = query2.getString(0);
                                        byte[] blob5 = query2.isNull(2) ? null : query2.getBlob(2);
                                        if (blob5 != null) {
                                            UiFamilyAccount uiFamilyAccount = (UiFamilyAccount) UiFamilyAccount.ADAPTER.decode(blob5);
                                            Object[] objArr = new Serializable[3];
                                            objArr[0] = string6;
                                            FamilyAccount familyAccount = uiFamilyAccount.family_account;
                                            BrandCollectionDataKt brandCollectionDataKt = familyAccount != null ? familyAccount.f1246type : null;
                                            FamilyAccount$Type$Dependent familyAccount$Type$Dependent = brandCollectionDataKt instanceof FamilyAccount$Type$Dependent ? (FamilyAccount$Type$Dependent) brandCollectionDataKt : null;
                                            objArr[1] = (familyAccount$Type$Dependent == null || (dependent = familyAccount$Type$Dependent.value) == null) ? null : Dependent.ADAPTER.encode(dependent);
                                            FamilyAccount familyAccount2 = uiFamilyAccount.family_account;
                                            BrandCollectionDataKt brandCollectionDataKt2 = familyAccount2 != null ? familyAccount2.f1246type : null;
                                            FamilyAccount$Type$Sponsor familyAccount$Type$Sponsor = brandCollectionDataKt2 instanceof FamilyAccount$Type$Sponsor ? (FamilyAccount$Type$Sponsor) brandCollectionDataKt2 : null;
                                            objArr[2] = (familyAccount$Type$Sponsor == null || (sponsor = familyAccount$Type$Sponsor.value) == null) ? null : Sponsor.ADAPTER.encode(sponsor);
                                            frameworkSQLiteDatabase2.delegate.execSQL("INSERT INTO family_account(entity_id, dependent, sponsor)\nVALUES (?, ?, ?)", objArr);
                                        }
                                    } catch (Throwable th222222222222222222222222222) {
                                        try {
                                            throw th222222222222222222222222222;
                                        } finally {
                                        }
                                    }
                                }
                                query2.close();
                                return Unit.INSTANCE;
                            case 7:
                                ((SqlDriver) obj).getClass();
                                CashAccountDatabaseCallback.createColumnIfNotExists(frameworkSQLiteDatabase2, "inAppNotificationMessage", "avatar", "BLOB", null);
                                return Unit.INSTANCE;
                            case 8:
                                SQLiteDatabase sQLiteDatabase3 = frameworkSQLiteDatabase2.delegate;
                                ((SqlDriver) obj).getClass();
                                query2 = frameworkSQLiteDatabase2.query(new CallResult("SELECT entity_id, entity FROM sync_entity"));
                                while (query2.moveToNext()) {
                                    try {
                                        String string7 = query2.getString(0);
                                        byte[] blob6 = query2.isNull(1) ? null : query2.getBlob(1);
                                        if (blob6 != null && (syncEntity = (SyncEntity) SyncEntity.ADAPTER.decode(blob6)) != null) {
                                            Long l2 = syncEntity.version;
                                            sQLiteDatabase3.execSQL("UPDATE sync_entity \nSET \n  sync_entity_version = ?\nWHERE entity_id = ?", new Object[]{l2, string7});
                                            if (syncEntity.payment != null) {
                                                sQLiteDatabase3.execSQL("UPDATE payment\nSET \n  sync_entity_version = ?\nWHERE entity_id = ?", new Object[]{l2, string7});
                                            }
                                        }
                                    } finally {
                                        try {
                                            throw th222222222222222222222222222;
                                        } finally {
                                        }
                                    }
                                }
                                query2.close();
                                return Unit.INSTANCE;
                            case 9:
                                ((SqlDriver) obj).getClass();
                                query2 = frameworkSQLiteDatabase2.query(new CallResult("SELECT entity_id, entity_type, entity FROM unhandled_sync_entity"));
                                while (query2.moveToNext()) {
                                    try {
                                        String string8 = query2.getString(0);
                                        int i112 = query2.getInt(1);
                                        byte[] blob7 = query2.isNull(2) ? null : query2.getBlob(2);
                                        if (blob7 != null && (syncEntity2 = (SyncEntity) SyncEntity.ADAPTER.decode(blob7)) != null) {
                                            frameworkSQLiteDatabase2.delegate.execSQL("UPDATE unhandled_sync_entity\nSET\n  entity_version = ?\nWHERE entity_id = ? AND entity_type = ?", new Object[]{syncEntity2.version, string8, Integer.valueOf(i112)});
                                        }
                                    } finally {
                                        try {
                                            throw th222222222222222222222222222;
                                        } finally {
                                        }
                                    }
                                }
                                query2.close();
                                return Unit.INSTANCE;
                            case 10:
                                ((SqlDriver) obj).getClass();
                                query2 = frameworkSQLiteDatabase2.query(new CallResult("SELECT entity_id, entity, entity_processor_version, sync_value_type, sync_entity_version\nFROM sync_entity"));
                                while (query2.moveToNext()) {
                                    try {
                                        String string9 = query2.getString(0);
                                        byte[] blob8 = query2.isNull(1) ? null : query2.getBlob(1);
                                        if (blob8 != null && (syncEntity3 = (SyncEntity) SyncEntity.ADAPTER.decode(blob8)) != null) {
                                            frameworkSQLiteDatabase2.delegate.execSQL("INSERT OR REPLACE INTO new_sync_entity\nVALUES (?, ?, ?, ?, ?, ?);", new Serializable[]{string9, Long.valueOf(EntitySyncerKt.rawEntityType(syncEntity3)), blob8, query2.isNull(2) ? null : Long.valueOf(query2.getLong(2)), query2.isNull(3) ? null : Long.valueOf(query2.getLong(3)), query2.isNull(4) ? null : Long.valueOf(query2.getLong(4))});
                                        }
                                    } finally {
                                        try {
                                            throw th222222222222222222222222222;
                                        } finally {
                                        }
                                    }
                                }
                                query2.close();
                                return Unit.INSTANCE;
                            case 11:
                                ((SqlDriver) obj).getClass();
                                CashAccountDatabaseCallback.restoreEntityProcessorVersionColumn(frameworkSQLiteDatabase2);
                                return Unit.INSTANCE;
                            case 12:
                                ((SqlDriver) obj).getClass();
                                CashAccountDatabaseCallback.restoreEntityProcessorVersionColumn(frameworkSQLiteDatabase2);
                                return Unit.INSTANCE;
                            default:
                                ((SqlDriver) obj).getClass();
                                query2 = frameworkSQLiteDatabase2.query(new CallResult("SELECT entity_id, entity FROM sync_entity WHERE type = 2"));
                                while (query2.moveToNext()) {
                                    try {
                                        byte[] blob9 = query2.isNull(1) ? null : query2.getBlob(1);
                                        if (blob9 != null && (syncEntity4 = (SyncEntity) SyncEntity.ADAPTER.decode(blob9)) != null && (syncCustomer = syncEntity4.customer) != null && (uiCustomer = syncCustomer.customer) != null) {
                                            frameworkSQLiteDatabase2.delegate.execSQL("UPDATE customer SET is_special_customer = ? WHERE customer_id = ?", new Object[]{Long.valueOf(Intrinsics.areEqual(uiCustomer.is_special_customer, Boolean.TRUE) ? 1L : 0L), uiCustomer.id});
                                        }
                                    } finally {
                                    }
                                }
                                query2.close();
                                return Unit.INSTANCE;
                        }
                    }
                });
                final int i14 = 9;
                AfterVersion afterVersion12 = new AfterVersion(761L, new Function1(cashAccountDatabaseCallback) { // from class: com.squareup.cash.db.CashAccountDatabaseCallback$$ExternalSyntheticLambda0
                    /* JADX WARN: Code restructure failed: missing block: B:290:0x03f0, code lost:
                    
                        if (r3 == null) goto L386;
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:302:0x03f2, code lost:
                    
                        r1.execSQL("UPDATE new_customer \nSET \n  photo = ?\nWHERE customer_id = ?", new java.io.Serializable[]{com.squareup.protos.cash.ui.Image.ADAPTER.encode(new com.squareup.protos.cash.ui.Image(r3, r3, 4)), java.lang.Integer.valueOf(r0)});
                     */
                    /* JADX WARN: Finally extract failed */
                    @Override // kotlin.jvm.functions.Function1
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                    */
                    public final Object invoke(Object obj) {
                        Cursor query2;
                        String str;
                        String str2;
                        String name;
                        Sponsor sponsor;
                        Dependent dependent;
                        SyncEntity syncEntity;
                        SyncEntity syncEntity2;
                        SyncEntity syncEntity3;
                        SyncEntity syncEntity4;
                        SyncCustomer syncCustomer;
                        UiCustomer uiCustomer;
                        int i72 = i14;
                        FrameworkSQLiteDatabase frameworkSQLiteDatabase2 = frameworkSQLiteDatabase;
                        switch (i72) {
                            case 0:
                                ((SqlDriver) obj).getClass();
                                query2 = frameworkSQLiteDatabase2.query(new CallResult("SELECT customer_id, merchant_data FROM customer"));
                                while (query2.moveToNext()) {
                                    try {
                                        String string2 = query2.getString(0);
                                        byte[] blob = query2.isNull(1) ? null : query2.getBlob(1);
                                        if (blob != null) {
                                            String str3 = ((MerchantData) MerchantData.ADAPTER.decode(blob)).category;
                                            if (str3 != null) {
                                                str = "'" + str3 + "'";
                                            } else {
                                                str = null;
                                            }
                                            frameworkSQLiteDatabase2.delegate.execSQL(StringsKt__IndentKt.replaceIndent("\n              |UPDATE customer\n              |SET category = " + str + "\n              |WHERE customer_id = '" + string2 + "'\n            "));
                                        }
                                    } catch (Throwable th222222222222222222222222222) {
                                        try {
                                            throw th222222222222222222222222222;
                                        } finally {
                                        }
                                    }
                                }
                                query2.close();
                                return Unit.INSTANCE;
                            case 1:
                                ((SqlDriver) obj).getClass();
                                query2 = frameworkSQLiteDatabase2.query(new CallResult("SELECT _id, amount FROM payment"));
                                while (query2.moveToNext()) {
                                    try {
                                        int i82 = query2.getInt(0);
                                        byte[] blob2 = query2.isNull(1) ? null : query2.getBlob(1);
                                        if (blob2 != null) {
                                            Money money = (Money) Money.ADAPTER.decode(blob2);
                                            Long l = money.amount;
                                            CurrencyCode currencyCode = money.currency_code;
                                            if (currencyCode == null || (name = currencyCode.name()) == null) {
                                                str2 = null;
                                            } else {
                                                str2 = "'" + name + "'";
                                            }
                                            frameworkSQLiteDatabase2.delegate.execSQL(StringsKt__IndentKt.trimMargin$default("\n            |UPDATE new_payment \n            |SET \n            |  amount = " + l + ", \n            |  amount_currency = " + str2 + "\n            |WHERE _id = " + i82 + "\n            "));
                                        }
                                    } catch (Throwable th2222222222222222222222222222) {
                                        try {
                                            throw th2222222222222222222222222222;
                                        } finally {
                                        }
                                    }
                                }
                                query2.close();
                                return Unit.INSTANCE;
                            case 2:
                                SQLiteDatabase sQLiteDatabase2 = frameworkSQLiteDatabase2.delegate;
                                ((SqlDriver) obj).getClass();
                                query2 = frameworkSQLiteDatabase2.query(new CallResult("SELECT customer_id, photo_url, photo, accent_color, themed_accent_color FROM customer"));
                                while (query2.moveToNext()) {
                                    try {
                                        int i92 = query2.getInt(0);
                                        String string3 = query2.isNull(1) ? null : query2.getString(1);
                                        byte[] blob3 = query2.isNull(2) ? null : query2.getBlob(2);
                                        Image image = blob3 != null ? (Image) Image.ADAPTER.decode(blob3) : null;
                                        String string4 = query2.isNull(3) ? null : query2.getString(3);
                                        byte[] blob4 = query2.isNull(4) ? null : query2.getBlob(4);
                                        Color color = blob4 != null ? (Color) Color.ADAPTER.decode(blob4) : null;
                                        if (image == null && string3 != null && color == null && string4 != null) {
                                            sQLiteDatabase2.execSQL("UPDATE new_customer \nSET \n  photo = ?,\n  themed_accent_color = ?\nWHERE customer_id = ?", new Serializable[]{Image.ADAPTER.encode(new Image(string3, string3, 4)), Color.ADAPTER.encode(ColorsKt.toColor(string4)), Integer.valueOf(i92)});
                                        } else if (color == null && string4 != null) {
                                            sQLiteDatabase2.execSQL("UPDATE new_customer \nSET \n  themed_accent_color = ?\nWHERE customer_id = ?", new Serializable[]{Color.ADAPTER.encode(ColorsKt.toColor(string4)), Integer.valueOf(i92)});
                                        }
                                    } catch (Throwable th22222222222222222222222222222) {
                                        try {
                                            throw th22222222222222222222222222222;
                                        } finally {
                                        }
                                    }
                                }
                                query2.close();
                                return Unit.INSTANCE;
                            case 3:
                                ((SqlDriver) obj).getClass();
                                CashAccountDatabaseCallback.createColumnIfNotExists(frameworkSQLiteDatabase2, "creditLine", "lending_product", "TEXT", null);
                                CashAccountDatabaseCallback.createColumnIfNotExists(frameworkSQLiteDatabase2, "loan", "lending_product", "TEXT", null);
                                CashAccountDatabaseCallback.createColumnIfNotExists(frameworkSQLiteDatabase2, "loanTransaction", "lending_product", "TEXT", null);
                                CashAccountDatabaseCallback.createColumnIfNotExists(frameworkSQLiteDatabase2, "payment", "lending_loan_token", "TEXT", "NULL");
                                CashAccountDatabaseCallback.createColumnIfNotExists(frameworkSQLiteDatabase2, "loan", "bnpl_data", "BLOB", null);
                                return Unit.INSTANCE;
                            case 4:
                                ((SqlDriver) obj).getClass();
                                query2 = frameworkSQLiteDatabase2.query(new CallResult("SELECT count(*) FROM paperDepositBarcodeInfo"));
                                try {
                                    query2.moveToNext();
                                    if (query2.getInt(0) == 0) {
                                        frameworkSQLiteDatabase2.delegate.execSQL("INSERT INTO paperDepositBarcodeInfo DEFAULT VALUES;");
                                    }
                                    query2.close();
                                    return Unit.INSTANCE;
                                } finally {
                                    try {
                                        throw th22222222222222222222222222222;
                                    } finally {
                                    }
                                }
                            case 5:
                                ((SqlDriver) obj).getClass();
                                query2 = frameworkSQLiteDatabase2.query(new CallResult("SELECT * FROM profileDirectorySection"));
                                while (query2.moveToNext()) {
                                    try {
                                        int i102 = query2.getInt(0);
                                        String string5 = query2.isNull(1) ? null : query2.getString(1);
                                        if (string5 != null) {
                                            frameworkSQLiteDatabase2.delegate.execSQL(StringsKt__IndentKt.trimMargin$default("\n            |UPDATE profileDirectorySection\n            |SET \n            |  text_title = ?\n            |WHERE id = " + i102 + "\n            "), new byte[][]{Text.ADAPTER.encode(new Text(string5, (TextStyle) null, (TextDecoration) null, (Color) null, (Image) null, 62))});
                                        }
                                    } finally {
                                        try {
                                            throw th22222222222222222222222222222;
                                        } finally {
                                        }
                                    }
                                }
                                query2.close();
                                return Unit.INSTANCE;
                            case 6:
                                ((SqlDriver) obj).getClass();
                                query2 = frameworkSQLiteDatabase2.query(new CallResult("SELECT entity_id, customer_token, family_account FROM familyAccount"));
                                while (query2.moveToNext()) {
                                    try {
                                        String string6 = query2.getString(0);
                                        byte[] blob5 = query2.isNull(2) ? null : query2.getBlob(2);
                                        if (blob5 != null) {
                                            UiFamilyAccount uiFamilyAccount = (UiFamilyAccount) UiFamilyAccount.ADAPTER.decode(blob5);
                                            Object[] objArr = new Serializable[3];
                                            objArr[0] = string6;
                                            FamilyAccount familyAccount = uiFamilyAccount.family_account;
                                            BrandCollectionDataKt brandCollectionDataKt = familyAccount != null ? familyAccount.f1246type : null;
                                            FamilyAccount$Type$Dependent familyAccount$Type$Dependent = brandCollectionDataKt instanceof FamilyAccount$Type$Dependent ? (FamilyAccount$Type$Dependent) brandCollectionDataKt : null;
                                            objArr[1] = (familyAccount$Type$Dependent == null || (dependent = familyAccount$Type$Dependent.value) == null) ? null : Dependent.ADAPTER.encode(dependent);
                                            FamilyAccount familyAccount2 = uiFamilyAccount.family_account;
                                            BrandCollectionDataKt brandCollectionDataKt2 = familyAccount2 != null ? familyAccount2.f1246type : null;
                                            FamilyAccount$Type$Sponsor familyAccount$Type$Sponsor = brandCollectionDataKt2 instanceof FamilyAccount$Type$Sponsor ? (FamilyAccount$Type$Sponsor) brandCollectionDataKt2 : null;
                                            objArr[2] = (familyAccount$Type$Sponsor == null || (sponsor = familyAccount$Type$Sponsor.value) == null) ? null : Sponsor.ADAPTER.encode(sponsor);
                                            frameworkSQLiteDatabase2.delegate.execSQL("INSERT INTO family_account(entity_id, dependent, sponsor)\nVALUES (?, ?, ?)", objArr);
                                        }
                                    } catch (Throwable th222222222222222222222222222222) {
                                        try {
                                            throw th222222222222222222222222222222;
                                        } finally {
                                        }
                                    }
                                }
                                query2.close();
                                return Unit.INSTANCE;
                            case 7:
                                ((SqlDriver) obj).getClass();
                                CashAccountDatabaseCallback.createColumnIfNotExists(frameworkSQLiteDatabase2, "inAppNotificationMessage", "avatar", "BLOB", null);
                                return Unit.INSTANCE;
                            case 8:
                                SQLiteDatabase sQLiteDatabase3 = frameworkSQLiteDatabase2.delegate;
                                ((SqlDriver) obj).getClass();
                                query2 = frameworkSQLiteDatabase2.query(new CallResult("SELECT entity_id, entity FROM sync_entity"));
                                while (query2.moveToNext()) {
                                    try {
                                        String string7 = query2.getString(0);
                                        byte[] blob6 = query2.isNull(1) ? null : query2.getBlob(1);
                                        if (blob6 != null && (syncEntity = (SyncEntity) SyncEntity.ADAPTER.decode(blob6)) != null) {
                                            Long l2 = syncEntity.version;
                                            sQLiteDatabase3.execSQL("UPDATE sync_entity \nSET \n  sync_entity_version = ?\nWHERE entity_id = ?", new Object[]{l2, string7});
                                            if (syncEntity.payment != null) {
                                                sQLiteDatabase3.execSQL("UPDATE payment\nSET \n  sync_entity_version = ?\nWHERE entity_id = ?", new Object[]{l2, string7});
                                            }
                                        }
                                    } finally {
                                        try {
                                            throw th222222222222222222222222222222;
                                        } finally {
                                        }
                                    }
                                }
                                query2.close();
                                return Unit.INSTANCE;
                            case 9:
                                ((SqlDriver) obj).getClass();
                                query2 = frameworkSQLiteDatabase2.query(new CallResult("SELECT entity_id, entity_type, entity FROM unhandled_sync_entity"));
                                while (query2.moveToNext()) {
                                    try {
                                        String string8 = query2.getString(0);
                                        int i112 = query2.getInt(1);
                                        byte[] blob7 = query2.isNull(2) ? null : query2.getBlob(2);
                                        if (blob7 != null && (syncEntity2 = (SyncEntity) SyncEntity.ADAPTER.decode(blob7)) != null) {
                                            frameworkSQLiteDatabase2.delegate.execSQL("UPDATE unhandled_sync_entity\nSET\n  entity_version = ?\nWHERE entity_id = ? AND entity_type = ?", new Object[]{syncEntity2.version, string8, Integer.valueOf(i112)});
                                        }
                                    } finally {
                                        try {
                                            throw th222222222222222222222222222222;
                                        } finally {
                                        }
                                    }
                                }
                                query2.close();
                                return Unit.INSTANCE;
                            case 10:
                                ((SqlDriver) obj).getClass();
                                query2 = frameworkSQLiteDatabase2.query(new CallResult("SELECT entity_id, entity, entity_processor_version, sync_value_type, sync_entity_version\nFROM sync_entity"));
                                while (query2.moveToNext()) {
                                    try {
                                        String string9 = query2.getString(0);
                                        byte[] blob8 = query2.isNull(1) ? null : query2.getBlob(1);
                                        if (blob8 != null && (syncEntity3 = (SyncEntity) SyncEntity.ADAPTER.decode(blob8)) != null) {
                                            frameworkSQLiteDatabase2.delegate.execSQL("INSERT OR REPLACE INTO new_sync_entity\nVALUES (?, ?, ?, ?, ?, ?);", new Serializable[]{string9, Long.valueOf(EntitySyncerKt.rawEntityType(syncEntity3)), blob8, query2.isNull(2) ? null : Long.valueOf(query2.getLong(2)), query2.isNull(3) ? null : Long.valueOf(query2.getLong(3)), query2.isNull(4) ? null : Long.valueOf(query2.getLong(4))});
                                        }
                                    } finally {
                                        try {
                                            throw th222222222222222222222222222222;
                                        } finally {
                                        }
                                    }
                                }
                                query2.close();
                                return Unit.INSTANCE;
                            case 11:
                                ((SqlDriver) obj).getClass();
                                CashAccountDatabaseCallback.restoreEntityProcessorVersionColumn(frameworkSQLiteDatabase2);
                                return Unit.INSTANCE;
                            case 12:
                                ((SqlDriver) obj).getClass();
                                CashAccountDatabaseCallback.restoreEntityProcessorVersionColumn(frameworkSQLiteDatabase2);
                                return Unit.INSTANCE;
                            default:
                                ((SqlDriver) obj).getClass();
                                query2 = frameworkSQLiteDatabase2.query(new CallResult("SELECT entity_id, entity FROM sync_entity WHERE type = 2"));
                                while (query2.moveToNext()) {
                                    try {
                                        byte[] blob9 = query2.isNull(1) ? null : query2.getBlob(1);
                                        if (blob9 != null && (syncEntity4 = (SyncEntity) SyncEntity.ADAPTER.decode(blob9)) != null && (syncCustomer = syncEntity4.customer) != null && (uiCustomer = syncCustomer.customer) != null) {
                                            frameworkSQLiteDatabase2.delegate.execSQL("UPDATE customer SET is_special_customer = ? WHERE customer_id = ?", new Object[]{Long.valueOf(Intrinsics.areEqual(uiCustomer.is_special_customer, Boolean.TRUE) ? 1L : 0L), uiCustomer.id});
                                        }
                                    } finally {
                                    }
                                }
                                query2.close();
                                return Unit.INSTANCE;
                        }
                    }
                });
                final int i15 = 10;
                try {
                    AfterVersion afterVersion13 = new AfterVersion(762L, new Function1(cashAccountDatabaseCallback) { // from class: com.squareup.cash.db.CashAccountDatabaseCallback$$ExternalSyntheticLambda0
                        /* JADX WARN: Code restructure failed: missing block: B:290:0x03f0, code lost:
                        
                            if (r3 == null) goto L386;
                         */
                        /* JADX WARN: Code restructure failed: missing block: B:302:0x03f2, code lost:
                        
                            r1.execSQL("UPDATE new_customer \nSET \n  photo = ?\nWHERE customer_id = ?", new java.io.Serializable[]{com.squareup.protos.cash.ui.Image.ADAPTER.encode(new com.squareup.protos.cash.ui.Image(r3, r3, 4)), java.lang.Integer.valueOf(r0)});
                         */
                        /* JADX WARN: Finally extract failed */
                        @Override // kotlin.jvm.functions.Function1
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                        */
                        public final Object invoke(Object obj) {
                            Cursor query2;
                            String str;
                            String str2;
                            String name;
                            Sponsor sponsor;
                            Dependent dependent;
                            SyncEntity syncEntity;
                            SyncEntity syncEntity2;
                            SyncEntity syncEntity3;
                            SyncEntity syncEntity4;
                            SyncCustomer syncCustomer;
                            UiCustomer uiCustomer;
                            int i72 = i15;
                            FrameworkSQLiteDatabase frameworkSQLiteDatabase2 = frameworkSQLiteDatabase;
                            switch (i72) {
                                case 0:
                                    ((SqlDriver) obj).getClass();
                                    query2 = frameworkSQLiteDatabase2.query(new CallResult("SELECT customer_id, merchant_data FROM customer"));
                                    while (query2.moveToNext()) {
                                        try {
                                            String string2 = query2.getString(0);
                                            byte[] blob = query2.isNull(1) ? null : query2.getBlob(1);
                                            if (blob != null) {
                                                String str3 = ((MerchantData) MerchantData.ADAPTER.decode(blob)).category;
                                                if (str3 != null) {
                                                    str = "'" + str3 + "'";
                                                } else {
                                                    str = null;
                                                }
                                                frameworkSQLiteDatabase2.delegate.execSQL(StringsKt__IndentKt.replaceIndent("\n              |UPDATE customer\n              |SET category = " + str + "\n              |WHERE customer_id = '" + string2 + "'\n            "));
                                            }
                                        } catch (Throwable th222222222222222222222222222222) {
                                            try {
                                                throw th222222222222222222222222222222;
                                            } finally {
                                            }
                                        }
                                    }
                                    query2.close();
                                    return Unit.INSTANCE;
                                case 1:
                                    ((SqlDriver) obj).getClass();
                                    query2 = frameworkSQLiteDatabase2.query(new CallResult("SELECT _id, amount FROM payment"));
                                    while (query2.moveToNext()) {
                                        try {
                                            int i82 = query2.getInt(0);
                                            byte[] blob2 = query2.isNull(1) ? null : query2.getBlob(1);
                                            if (blob2 != null) {
                                                Money money = (Money) Money.ADAPTER.decode(blob2);
                                                Long l = money.amount;
                                                CurrencyCode currencyCode = money.currency_code;
                                                if (currencyCode == null || (name = currencyCode.name()) == null) {
                                                    str2 = null;
                                                } else {
                                                    str2 = "'" + name + "'";
                                                }
                                                frameworkSQLiteDatabase2.delegate.execSQL(StringsKt__IndentKt.trimMargin$default("\n            |UPDATE new_payment \n            |SET \n            |  amount = " + l + ", \n            |  amount_currency = " + str2 + "\n            |WHERE _id = " + i82 + "\n            "));
                                            }
                                        } catch (Throwable th2222222222222222222222222222222) {
                                            try {
                                                throw th2222222222222222222222222222222;
                                            } finally {
                                            }
                                        }
                                    }
                                    query2.close();
                                    return Unit.INSTANCE;
                                case 2:
                                    SQLiteDatabase sQLiteDatabase2 = frameworkSQLiteDatabase2.delegate;
                                    ((SqlDriver) obj).getClass();
                                    query2 = frameworkSQLiteDatabase2.query(new CallResult("SELECT customer_id, photo_url, photo, accent_color, themed_accent_color FROM customer"));
                                    while (query2.moveToNext()) {
                                        try {
                                            int i92 = query2.getInt(0);
                                            String string3 = query2.isNull(1) ? null : query2.getString(1);
                                            byte[] blob3 = query2.isNull(2) ? null : query2.getBlob(2);
                                            Image image = blob3 != null ? (Image) Image.ADAPTER.decode(blob3) : null;
                                            String string4 = query2.isNull(3) ? null : query2.getString(3);
                                            byte[] blob4 = query2.isNull(4) ? null : query2.getBlob(4);
                                            Color color = blob4 != null ? (Color) Color.ADAPTER.decode(blob4) : null;
                                            if (image == null && string3 != null && color == null && string4 != null) {
                                                sQLiteDatabase2.execSQL("UPDATE new_customer \nSET \n  photo = ?,\n  themed_accent_color = ?\nWHERE customer_id = ?", new Serializable[]{Image.ADAPTER.encode(new Image(string3, string3, 4)), Color.ADAPTER.encode(ColorsKt.toColor(string4)), Integer.valueOf(i92)});
                                            } else if (color == null && string4 != null) {
                                                sQLiteDatabase2.execSQL("UPDATE new_customer \nSET \n  themed_accent_color = ?\nWHERE customer_id = ?", new Serializable[]{Color.ADAPTER.encode(ColorsKt.toColor(string4)), Integer.valueOf(i92)});
                                            }
                                        } catch (Throwable th22222222222222222222222222222222) {
                                            try {
                                                throw th22222222222222222222222222222222;
                                            } finally {
                                            }
                                        }
                                    }
                                    query2.close();
                                    return Unit.INSTANCE;
                                case 3:
                                    ((SqlDriver) obj).getClass();
                                    CashAccountDatabaseCallback.createColumnIfNotExists(frameworkSQLiteDatabase2, "creditLine", "lending_product", "TEXT", null);
                                    CashAccountDatabaseCallback.createColumnIfNotExists(frameworkSQLiteDatabase2, "loan", "lending_product", "TEXT", null);
                                    CashAccountDatabaseCallback.createColumnIfNotExists(frameworkSQLiteDatabase2, "loanTransaction", "lending_product", "TEXT", null);
                                    CashAccountDatabaseCallback.createColumnIfNotExists(frameworkSQLiteDatabase2, "payment", "lending_loan_token", "TEXT", "NULL");
                                    CashAccountDatabaseCallback.createColumnIfNotExists(frameworkSQLiteDatabase2, "loan", "bnpl_data", "BLOB", null);
                                    return Unit.INSTANCE;
                                case 4:
                                    ((SqlDriver) obj).getClass();
                                    query2 = frameworkSQLiteDatabase2.query(new CallResult("SELECT count(*) FROM paperDepositBarcodeInfo"));
                                    try {
                                        query2.moveToNext();
                                        if (query2.getInt(0) == 0) {
                                            frameworkSQLiteDatabase2.delegate.execSQL("INSERT INTO paperDepositBarcodeInfo DEFAULT VALUES;");
                                        }
                                        query2.close();
                                        return Unit.INSTANCE;
                                    } finally {
                                        try {
                                            throw th22222222222222222222222222222222;
                                        } finally {
                                        }
                                    }
                                case 5:
                                    ((SqlDriver) obj).getClass();
                                    query2 = frameworkSQLiteDatabase2.query(new CallResult("SELECT * FROM profileDirectorySection"));
                                    while (query2.moveToNext()) {
                                        try {
                                            int i102 = query2.getInt(0);
                                            String string5 = query2.isNull(1) ? null : query2.getString(1);
                                            if (string5 != null) {
                                                frameworkSQLiteDatabase2.delegate.execSQL(StringsKt__IndentKt.trimMargin$default("\n            |UPDATE profileDirectorySection\n            |SET \n            |  text_title = ?\n            |WHERE id = " + i102 + "\n            "), new byte[][]{Text.ADAPTER.encode(new Text(string5, (TextStyle) null, (TextDecoration) null, (Color) null, (Image) null, 62))});
                                            }
                                        } finally {
                                            try {
                                                throw th22222222222222222222222222222222;
                                            } finally {
                                            }
                                        }
                                    }
                                    query2.close();
                                    return Unit.INSTANCE;
                                case 6:
                                    ((SqlDriver) obj).getClass();
                                    query2 = frameworkSQLiteDatabase2.query(new CallResult("SELECT entity_id, customer_token, family_account FROM familyAccount"));
                                    while (query2.moveToNext()) {
                                        try {
                                            String string6 = query2.getString(0);
                                            byte[] blob5 = query2.isNull(2) ? null : query2.getBlob(2);
                                            if (blob5 != null) {
                                                UiFamilyAccount uiFamilyAccount = (UiFamilyAccount) UiFamilyAccount.ADAPTER.decode(blob5);
                                                Object[] objArr = new Serializable[3];
                                                objArr[0] = string6;
                                                FamilyAccount familyAccount = uiFamilyAccount.family_account;
                                                BrandCollectionDataKt brandCollectionDataKt = familyAccount != null ? familyAccount.f1246type : null;
                                                FamilyAccount$Type$Dependent familyAccount$Type$Dependent = brandCollectionDataKt instanceof FamilyAccount$Type$Dependent ? (FamilyAccount$Type$Dependent) brandCollectionDataKt : null;
                                                objArr[1] = (familyAccount$Type$Dependent == null || (dependent = familyAccount$Type$Dependent.value) == null) ? null : Dependent.ADAPTER.encode(dependent);
                                                FamilyAccount familyAccount2 = uiFamilyAccount.family_account;
                                                BrandCollectionDataKt brandCollectionDataKt2 = familyAccount2 != null ? familyAccount2.f1246type : null;
                                                FamilyAccount$Type$Sponsor familyAccount$Type$Sponsor = brandCollectionDataKt2 instanceof FamilyAccount$Type$Sponsor ? (FamilyAccount$Type$Sponsor) brandCollectionDataKt2 : null;
                                                objArr[2] = (familyAccount$Type$Sponsor == null || (sponsor = familyAccount$Type$Sponsor.value) == null) ? null : Sponsor.ADAPTER.encode(sponsor);
                                                frameworkSQLiteDatabase2.delegate.execSQL("INSERT INTO family_account(entity_id, dependent, sponsor)\nVALUES (?, ?, ?)", objArr);
                                            }
                                        } catch (Throwable th222222222222222222222222222222222) {
                                            try {
                                                throw th222222222222222222222222222222222;
                                            } finally {
                                            }
                                        }
                                    }
                                    query2.close();
                                    return Unit.INSTANCE;
                                case 7:
                                    ((SqlDriver) obj).getClass();
                                    CashAccountDatabaseCallback.createColumnIfNotExists(frameworkSQLiteDatabase2, "inAppNotificationMessage", "avatar", "BLOB", null);
                                    return Unit.INSTANCE;
                                case 8:
                                    SQLiteDatabase sQLiteDatabase3 = frameworkSQLiteDatabase2.delegate;
                                    ((SqlDriver) obj).getClass();
                                    query2 = frameworkSQLiteDatabase2.query(new CallResult("SELECT entity_id, entity FROM sync_entity"));
                                    while (query2.moveToNext()) {
                                        try {
                                            String string7 = query2.getString(0);
                                            byte[] blob6 = query2.isNull(1) ? null : query2.getBlob(1);
                                            if (blob6 != null && (syncEntity = (SyncEntity) SyncEntity.ADAPTER.decode(blob6)) != null) {
                                                Long l2 = syncEntity.version;
                                                sQLiteDatabase3.execSQL("UPDATE sync_entity \nSET \n  sync_entity_version = ?\nWHERE entity_id = ?", new Object[]{l2, string7});
                                                if (syncEntity.payment != null) {
                                                    sQLiteDatabase3.execSQL("UPDATE payment\nSET \n  sync_entity_version = ?\nWHERE entity_id = ?", new Object[]{l2, string7});
                                                }
                                            }
                                        } finally {
                                            try {
                                                throw th222222222222222222222222222222222;
                                            } finally {
                                            }
                                        }
                                    }
                                    query2.close();
                                    return Unit.INSTANCE;
                                case 9:
                                    ((SqlDriver) obj).getClass();
                                    query2 = frameworkSQLiteDatabase2.query(new CallResult("SELECT entity_id, entity_type, entity FROM unhandled_sync_entity"));
                                    while (query2.moveToNext()) {
                                        try {
                                            String string8 = query2.getString(0);
                                            int i112 = query2.getInt(1);
                                            byte[] blob7 = query2.isNull(2) ? null : query2.getBlob(2);
                                            if (blob7 != null && (syncEntity2 = (SyncEntity) SyncEntity.ADAPTER.decode(blob7)) != null) {
                                                frameworkSQLiteDatabase2.delegate.execSQL("UPDATE unhandled_sync_entity\nSET\n  entity_version = ?\nWHERE entity_id = ? AND entity_type = ?", new Object[]{syncEntity2.version, string8, Integer.valueOf(i112)});
                                            }
                                        } finally {
                                            try {
                                                throw th222222222222222222222222222222222;
                                            } finally {
                                            }
                                        }
                                    }
                                    query2.close();
                                    return Unit.INSTANCE;
                                case 10:
                                    ((SqlDriver) obj).getClass();
                                    query2 = frameworkSQLiteDatabase2.query(new CallResult("SELECT entity_id, entity, entity_processor_version, sync_value_type, sync_entity_version\nFROM sync_entity"));
                                    while (query2.moveToNext()) {
                                        try {
                                            String string9 = query2.getString(0);
                                            byte[] blob8 = query2.isNull(1) ? null : query2.getBlob(1);
                                            if (blob8 != null && (syncEntity3 = (SyncEntity) SyncEntity.ADAPTER.decode(blob8)) != null) {
                                                frameworkSQLiteDatabase2.delegate.execSQL("INSERT OR REPLACE INTO new_sync_entity\nVALUES (?, ?, ?, ?, ?, ?);", new Serializable[]{string9, Long.valueOf(EntitySyncerKt.rawEntityType(syncEntity3)), blob8, query2.isNull(2) ? null : Long.valueOf(query2.getLong(2)), query2.isNull(3) ? null : Long.valueOf(query2.getLong(3)), query2.isNull(4) ? null : Long.valueOf(query2.getLong(4))});
                                            }
                                        } finally {
                                            try {
                                                throw th222222222222222222222222222222222;
                                            } finally {
                                            }
                                        }
                                    }
                                    query2.close();
                                    return Unit.INSTANCE;
                                case 11:
                                    ((SqlDriver) obj).getClass();
                                    CashAccountDatabaseCallback.restoreEntityProcessorVersionColumn(frameworkSQLiteDatabase2);
                                    return Unit.INSTANCE;
                                case 12:
                                    ((SqlDriver) obj).getClass();
                                    CashAccountDatabaseCallback.restoreEntityProcessorVersionColumn(frameworkSQLiteDatabase2);
                                    return Unit.INSTANCE;
                                default:
                                    ((SqlDriver) obj).getClass();
                                    query2 = frameworkSQLiteDatabase2.query(new CallResult("SELECT entity_id, entity FROM sync_entity WHERE type = 2"));
                                    while (query2.moveToNext()) {
                                        try {
                                            byte[] blob9 = query2.isNull(1) ? null : query2.getBlob(1);
                                            if (blob9 != null && (syncEntity4 = (SyncEntity) SyncEntity.ADAPTER.decode(blob9)) != null && (syncCustomer = syncEntity4.customer) != null && (uiCustomer = syncCustomer.customer) != null) {
                                                frameworkSQLiteDatabase2.delegate.execSQL("UPDATE customer SET is_special_customer = ? WHERE customer_id = ?", new Object[]{Long.valueOf(Intrinsics.areEqual(uiCustomer.is_special_customer, Boolean.TRUE) ? 1L : 0L), uiCustomer.id});
                                            }
                                        } finally {
                                        }
                                    }
                                    query2.close();
                                    return Unit.INSTANCE;
                            }
                        }
                    });
                    final int i16 = 0;
                    try {
                        AfterVersion afterVersion14 = new AfterVersion(767L, new Function1(this) { // from class: com.squareup.cash.db.CashAccountDatabaseCallback$$ExternalSyntheticLambda4
                            public final /* synthetic */ CashAccountDatabaseCallback f$0;

                            {
                                this.f$0 = this;
                            }

                            /* JADX WARN: Finally extract failed */
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                Cursor query2;
                                String str;
                                SyncEntity syncEntity;
                                ErrorFeature.ClientSync clientSync;
                                ErrorFeature.Persistence persistence;
                                int i17;
                                int i18;
                                Throwable th;
                                int i19;
                                int i20;
                                SyncEntity syncEntity2;
                                int i21 = i16;
                                ErrorFeature.Persistence persistence2 = ErrorFeature.Persistence.INSTANCE;
                                String str2 = "entityId=";
                                ErrorReporter.DefaultSamplingStrategy defaultSamplingStrategy = ErrorReporter.DefaultSamplingStrategy.INSTANCE;
                                ErrorFeature.ClientSync clientSync2 = ErrorFeature.ClientSync.INSTANCE;
                                FrameworkSQLiteDatabase frameworkSQLiteDatabase2 = frameworkSQLiteDatabase;
                                CashAccountDatabaseCallback cashAccountDatabaseCallback2 = this.f$0;
                                int i22 = 2;
                                int i23 = 1;
                                int i24 = 0;
                                switch (i21) {
                                    case 0:
                                        SQLiteDatabase sQLiteDatabase2 = frameworkSQLiteDatabase2.delegate;
                                        ((SqlDriver) obj).getClass();
                                        ErrorReporter errorReporter = cashAccountDatabaseCallback2.errorReporter;
                                        try {
                                            sQLiteDatabase2.execSQL("INSERT INTO sync_entity (entity_id, type, entity, sync_entity_version, sync_value_type, entity_processor_version)\nSELECT entity_id, entity_type, entity, entity_version, NULL, entity_processor_version\nFROM unhandled_sync_entity");
                                        } catch (SQLException e) {
                                            e = e;
                                            Timber.Forest forest = Timber.Forest;
                                            int i25 = i3;
                                            int i26 = i2;
                                            forest.e(Recorder$$ExternalSyntheticOutline2.m(i25, i26, "Failure migrating from ", " to ", " at `migrateUnhandledEntitiesToHandledEntitiesTable`"), new Object[0], e);
                                            try {
                                                LinkedHashMap linkedHashMap = new LinkedHashMap();
                                                query2 = frameworkSQLiteDatabase2.query(new CallResult("SELECT entity_id, entity_type, entity_version, entity_processor_version\nFROM unhandled_sync_entity"));
                                                int i27 = 0;
                                                while (query2.moveToNext()) {
                                                    try {
                                                        String string2 = query2.getString(0);
                                                        Long valueOf = query2.isNull(1) ? null : Long.valueOf(query2.getLong(1));
                                                        Long valueOf2 = query2.isNull(2) ? null : Long.valueOf(query2.getLong(2));
                                                        Long valueOf3 = query2.isNull(3) ? null : Long.valueOf(query2.getLong(3));
                                                        String valueOf4 = String.valueOf(i27);
                                                        StringBuilder sb = new StringBuilder();
                                                        SQLException sQLException = e;
                                                        sb.append("ID:");
                                                        sb.append(string2);
                                                        sb.append(" Type: ");
                                                        sb.append(valueOf);
                                                        sb.append("; Version: ");
                                                        sb.append(valueOf2);
                                                        sb.append(" ProcessorVersion: ");
                                                        sb.append(valueOf3);
                                                        linkedHashMap.put(valueOf4, sb.toString());
                                                        i27++;
                                                        e = sQLException;
                                                    } finally {
                                                    }
                                                }
                                                SQLException sQLException2 = e;
                                                query2.close();
                                                errorReporter.report(new DatabaseMigrationError(i25, i26, "migrateUnhandledEntitiesToHandledEntitiesTable", sQLException2, MapsKt__MapsJVMKt.mapOf(new Pair("Client Sync", linkedHashMap)), ArraysKt___ArraysKt.toSet(new ErrorFeature[]{persistence2, clientSync2}), 64), defaultSamplingStrategy);
                                                sQLiteDatabase2.execSQL("INSERT OR IGNORE INTO sync_entity (entity_id, type, entity, sync_entity_version, sync_value_type, entity_processor_version)\nSELECT entity_id, entity_type, entity, entity_version, NULL, entity_processor_version\nFROM unhandled_sync_entity");
                                            } catch (Throwable th2) {
                                                errorReporter.report(new DatabaseError(th2.getMessage(), th2), defaultSamplingStrategy);
                                            }
                                        }
                                        return Unit.INSTANCE;
                                    case 1:
                                        String str3 = "entityId=";
                                        int i28 = i3;
                                        int i29 = i2;
                                        ((SqlDriver) obj).getClass();
                                        query2 = frameworkSQLiteDatabase2.query(new CallResult("SELECT entity_id, entity\nFROM sync_entity\nWHERE type == 14 AND sync_value_type IS NULL;"));
                                        try {
                                            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                                            while (query2.moveToNext()) {
                                                String string3 = query2.getString(0);
                                                byte[] blob = query2.isNull(1) ? null : query2.getBlob(1);
                                                if (blob == null || (syncEntity = (SyncEntity) SyncEntity.ADAPTER.decode(blob)) == null) {
                                                    str = str3;
                                                } else {
                                                    frameworkSQLiteDatabase2.delegate.execSQL("UPDATE sync_entity\nSET sync_value_type = ?\nWHERE entity_id = ?;", new Object[]{StrictModes.getSyncValueTypeAsInt(syncEntity), string3});
                                                    StringBuilder sb2 = new StringBuilder();
                                                    str = str3;
                                                    sb2.append(str);
                                                    sb2.append(string3);
                                                    linkedHashMap2.put(string3, CollectionsKt.joinToString$default(CollectionsKt__CollectionsKt.listOf((Object[]) new String[]{sb2.toString(), "valueType=" + StrictModes.getSyncValueTypeAsInt(syncEntity)}), null, null, null, 0, null, null, 63));
                                                }
                                                str3 = str;
                                            }
                                            if (!linkedHashMap2.isEmpty()) {
                                                cashAccountDatabaseCallback2.errorReporter.report(new DatabaseMigrationError(i28, i29, "repairSyncValueType", (Throwable) null, MapsKt__MapsJVMKt.mapOf(new Pair("Client Sync", linkedHashMap2)), SetsKt__SetsJVMKt.setOf(clientSync2), "Repaired entities with missing sync value types"), defaultSamplingStrategy);
                                            }
                                            query2.close();
                                            return Unit.INSTANCE;
                                        } catch (Throwable th3) {
                                            try {
                                                throw th3;
                                            } finally {
                                            }
                                        }
                                    case 2:
                                        int i30 = i3;
                                        int i31 = i2;
                                        ((SqlDriver) obj).getClass();
                                        ErrorReporter errorReporter2 = cashAccountDatabaseCallback2.errorReporter;
                                        try {
                                            try {
                                                Cursor query3 = frameworkSQLiteDatabase2.query(new CallResult("SELECT entity_id, type, sync_value_type, sync_entity_version, entity_processor_version\nFROM sync_entity\nWHERE entity_processor_version IS NULL OR entity_processor_version != 31;"));
                                                try {
                                                    if (query3.getCount() > 0) {
                                                        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
                                                        int i32 = 0;
                                                        while (query3.moveToNext()) {
                                                            String string4 = query3.getString(0);
                                                            Long valueOf5 = query3.isNull(1) ? null : Long.valueOf(query3.getLong(1));
                                                            persistence = persistence2;
                                                            try {
                                                                Long valueOf6 = query3.isNull(2) ? null : Long.valueOf(query3.getLong(2));
                                                                i18 = i30;
                                                                try {
                                                                    Long valueOf7 = query3.isNull(3) ? null : Long.valueOf(query3.getLong(3));
                                                                    clientSync = clientSync2;
                                                                    try {
                                                                        Long valueOf8 = query3.isNull(4) ? null : Long.valueOf(query3.getLong(4));
                                                                        int i33 = i32 + 1;
                                                                        String valueOf9 = String.valueOf(i32);
                                                                        i17 = i31;
                                                                        try {
                                                                            String str4 = str2 + string4;
                                                                            StringBuilder sb3 = new StringBuilder();
                                                                            String str5 = str2;
                                                                            sb3.append("entityType=");
                                                                            sb3.append(valueOf5);
                                                                            linkedHashMap3.put(valueOf9, CollectionsKt.joinToString$default(CollectionsKt__CollectionsKt.listOf((Object[]) new String[]{str4, sb3.toString(), "valueType=" + valueOf6, "entityVersion=" + valueOf7, "processorVersion=" + valueOf8}), null, null, null, 0, null, null, 63));
                                                                            i32 = i33;
                                                                            i30 = i18;
                                                                            i31 = i17;
                                                                            str2 = str5;
                                                                            persistence2 = persistence;
                                                                            clientSync2 = clientSync;
                                                                        } catch (Throwable th4) {
                                                                            th = th4;
                                                                            th = th;
                                                                            try {
                                                                                throw th;
                                                                            } catch (Throwable th5) {
                                                                                Utf8.closeFinally(query3, th);
                                                                                throw th5;
                                                                            }
                                                                        }
                                                                    } catch (Throwable th6) {
                                                                        th = th6;
                                                                        i17 = i31;
                                                                        th = th;
                                                                        throw th;
                                                                    }
                                                                } catch (Throwable th7) {
                                                                    th = th7;
                                                                    clientSync = clientSync2;
                                                                    i17 = i31;
                                                                    th = th;
                                                                    throw th;
                                                                }
                                                            } catch (Throwable th8) {
                                                                th = th8;
                                                                i18 = i30;
                                                                clientSync = clientSync2;
                                                                i17 = i31;
                                                                th = th;
                                                                throw th;
                                                            }
                                                        }
                                                        persistence = persistence2;
                                                        i18 = i30;
                                                        clientSync = clientSync2;
                                                        i17 = i31;
                                                        errorReporter2.report(new DatabaseMigrationError(i18, i17, "detectMisprocessedEntities", (Throwable) null, MapsKt__MapsJVMKt.mapOf(new Pair("Client Sync", linkedHashMap3)), SetsKt__SetsJVMKt.setOf(clientSync), "Detected handled entities with invalid processor versions"), defaultSamplingStrategy);
                                                    }
                                                    query3.close();
                                                } catch (Throwable th9) {
                                                    th = th9;
                                                    persistence = persistence2;
                                                }
                                            } catch (Throwable th10) {
                                                th = th10;
                                                persistence = persistence2;
                                                i18 = i30;
                                                clientSync = clientSync2;
                                                i17 = i31;
                                                errorReporter2.report(new DatabaseMigrationError(i18, i17, "detectMisprocessedEntities", th, (Map) null, ArraysKt___ArraysKt.toSet(new ErrorFeature[]{clientSync, persistence}), 16), defaultSamplingStrategy);
                                                return Unit.INSTANCE;
                                            }
                                        } catch (Throwable th11) {
                                            th = th11;
                                            errorReporter2.report(new DatabaseMigrationError(i18, i17, "detectMisprocessedEntities", th, (Map) null, ArraysKt___ArraysKt.toSet(new ErrorFeature[]{clientSync, persistence}), 16), defaultSamplingStrategy);
                                            return Unit.INSTANCE;
                                        }
                                        return Unit.INSTANCE;
                                    default:
                                        int i34 = i3;
                                        int i35 = i2;
                                        ((SqlDriver) obj).getClass();
                                        query2 = frameworkSQLiteDatabase2.query(new CallResult("SELECT entity_id, entity, sync_entity_version, entity_processor_version\nFROM sync_entity;"));
                                        try {
                                            LinkedHashMap linkedHashMap4 = new LinkedHashMap();
                                            while (query2.moveToNext()) {
                                                String string5 = query2.getString(i24);
                                                byte[] blob2 = query2.isNull(i23) ? null : query2.getBlob(i23);
                                                if (blob2 == null || (syncEntity2 = (SyncEntity) SyncEntity.ADAPTER.decode(blob2)) == null) {
                                                    i19 = i34;
                                                    i20 = i35;
                                                } else {
                                                    Long l = syncEntity2.version;
                                                    Long valueOf10 = query2.isNull(i22) ? null : Long.valueOf(query2.getLong(i22));
                                                    Long valueOf11 = query2.isNull(3) ? null : Long.valueOf(query2.getLong(3));
                                                    if (Intrinsics.areEqual(l, valueOf10)) {
                                                        i24 = 0;
                                                        i22 = 2;
                                                        i23 = 1;
                                                    } else {
                                                        i19 = i34;
                                                        i20 = i35;
                                                        frameworkSQLiteDatabase2.delegate.execSQL("UPDATE sync_entity\nSET sync_entity_version = ?, entity_processor_version = ?\nWHERE entity_id = ?;", new Object[]{l, valueOf10, string5});
                                                        linkedHashMap4.put(string5, CollectionsKt.joinToString$default(CollectionsKt__CollectionsKt.listOf((Object[]) new String[]{"entityId=" + string5, "entityVersion=" + valueOf10, "processorVersion=" + valueOf11}), null, null, null, 0, null, null, 63));
                                                    }
                                                }
                                                i34 = i19;
                                                i35 = i20;
                                                i24 = 0;
                                                i22 = 2;
                                                i23 = 1;
                                            }
                                            int i36 = i34;
                                            int i37 = i35;
                                            if (!linkedHashMap4.isEmpty()) {
                                                cashAccountDatabaseCallback2.errorReporter.report(new DatabaseMigrationError(i36, i37, "repairEntityAndProcessorVersions", (Throwable) null, MapsKt__MapsJVMKt.mapOf(new Pair("Client Sync", linkedHashMap4)), SetsKt__SetsJVMKt.setOf(clientSync2), "Repaired entities with incorrect entity and processor versions"), defaultSamplingStrategy);
                                            }
                                            query2.close();
                                            return Unit.INSTANCE;
                                        } finally {
                                        }
                                }
                            }
                        });
                        final int i17 = 2;
                        cashAccountDatabaseCallback = this;
                        try {
                            AfterVersion afterVersion15 = new AfterVersion(770L, new Function1(cashAccountDatabaseCallback) { // from class: com.squareup.cash.db.CashAccountDatabaseCallback$$ExternalSyntheticLambda4
                                public final /* synthetic */ CashAccountDatabaseCallback f$0;

                                {
                                    this.f$0 = cashAccountDatabaseCallback;
                                }

                                /* JADX WARN: Finally extract failed */
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    Cursor query2;
                                    String str;
                                    SyncEntity syncEntity;
                                    ErrorFeature.ClientSync clientSync;
                                    ErrorFeature.Persistence persistence;
                                    int i172;
                                    int i18;
                                    Throwable th;
                                    int i19;
                                    int i20;
                                    SyncEntity syncEntity2;
                                    int i21 = i17;
                                    ErrorFeature.Persistence persistence2 = ErrorFeature.Persistence.INSTANCE;
                                    String str2 = "entityId=";
                                    ErrorReporter.DefaultSamplingStrategy defaultSamplingStrategy = ErrorReporter.DefaultSamplingStrategy.INSTANCE;
                                    ErrorFeature.ClientSync clientSync2 = ErrorFeature.ClientSync.INSTANCE;
                                    FrameworkSQLiteDatabase frameworkSQLiteDatabase2 = frameworkSQLiteDatabase;
                                    CashAccountDatabaseCallback cashAccountDatabaseCallback2 = this.f$0;
                                    int i22 = 2;
                                    int i23 = 1;
                                    int i24 = 0;
                                    switch (i21) {
                                        case 0:
                                            SQLiteDatabase sQLiteDatabase2 = frameworkSQLiteDatabase2.delegate;
                                            ((SqlDriver) obj).getClass();
                                            ErrorReporter errorReporter = cashAccountDatabaseCallback2.errorReporter;
                                            try {
                                                sQLiteDatabase2.execSQL("INSERT INTO sync_entity (entity_id, type, entity, sync_entity_version, sync_value_type, entity_processor_version)\nSELECT entity_id, entity_type, entity, entity_version, NULL, entity_processor_version\nFROM unhandled_sync_entity");
                                            } catch (SQLException e) {
                                                e = e;
                                                Timber.Forest forest = Timber.Forest;
                                                int i25 = i;
                                                int i26 = i2;
                                                forest.e(Recorder$$ExternalSyntheticOutline2.m(i25, i26, "Failure migrating from ", " to ", " at `migrateUnhandledEntitiesToHandledEntitiesTable`"), new Object[0], e);
                                                try {
                                                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                                                    query2 = frameworkSQLiteDatabase2.query(new CallResult("SELECT entity_id, entity_type, entity_version, entity_processor_version\nFROM unhandled_sync_entity"));
                                                    int i27 = 0;
                                                    while (query2.moveToNext()) {
                                                        try {
                                                            String string2 = query2.getString(0);
                                                            Long valueOf = query2.isNull(1) ? null : Long.valueOf(query2.getLong(1));
                                                            Long valueOf2 = query2.isNull(2) ? null : Long.valueOf(query2.getLong(2));
                                                            Long valueOf3 = query2.isNull(3) ? null : Long.valueOf(query2.getLong(3));
                                                            String valueOf4 = String.valueOf(i27);
                                                            StringBuilder sb = new StringBuilder();
                                                            SQLException sQLException = e;
                                                            sb.append("ID:");
                                                            sb.append(string2);
                                                            sb.append(" Type: ");
                                                            sb.append(valueOf);
                                                            sb.append("; Version: ");
                                                            sb.append(valueOf2);
                                                            sb.append(" ProcessorVersion: ");
                                                            sb.append(valueOf3);
                                                            linkedHashMap.put(valueOf4, sb.toString());
                                                            i27++;
                                                            e = sQLException;
                                                        } finally {
                                                        }
                                                    }
                                                    SQLException sQLException2 = e;
                                                    query2.close();
                                                    errorReporter.report(new DatabaseMigrationError(i25, i26, "migrateUnhandledEntitiesToHandledEntitiesTable", sQLException2, MapsKt__MapsJVMKt.mapOf(new Pair("Client Sync", linkedHashMap)), ArraysKt___ArraysKt.toSet(new ErrorFeature[]{persistence2, clientSync2}), 64), defaultSamplingStrategy);
                                                    sQLiteDatabase2.execSQL("INSERT OR IGNORE INTO sync_entity (entity_id, type, entity, sync_entity_version, sync_value_type, entity_processor_version)\nSELECT entity_id, entity_type, entity, entity_version, NULL, entity_processor_version\nFROM unhandled_sync_entity");
                                                } catch (Throwable th2) {
                                                    errorReporter.report(new DatabaseError(th2.getMessage(), th2), defaultSamplingStrategy);
                                                }
                                            }
                                            return Unit.INSTANCE;
                                        case 1:
                                            String str3 = "entityId=";
                                            int i28 = i;
                                            int i29 = i2;
                                            ((SqlDriver) obj).getClass();
                                            query2 = frameworkSQLiteDatabase2.query(new CallResult("SELECT entity_id, entity\nFROM sync_entity\nWHERE type == 14 AND sync_value_type IS NULL;"));
                                            try {
                                                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                                                while (query2.moveToNext()) {
                                                    String string3 = query2.getString(0);
                                                    byte[] blob = query2.isNull(1) ? null : query2.getBlob(1);
                                                    if (blob == null || (syncEntity = (SyncEntity) SyncEntity.ADAPTER.decode(blob)) == null) {
                                                        str = str3;
                                                    } else {
                                                        frameworkSQLiteDatabase2.delegate.execSQL("UPDATE sync_entity\nSET sync_value_type = ?\nWHERE entity_id = ?;", new Object[]{StrictModes.getSyncValueTypeAsInt(syncEntity), string3});
                                                        StringBuilder sb2 = new StringBuilder();
                                                        str = str3;
                                                        sb2.append(str);
                                                        sb2.append(string3);
                                                        linkedHashMap2.put(string3, CollectionsKt.joinToString$default(CollectionsKt__CollectionsKt.listOf((Object[]) new String[]{sb2.toString(), "valueType=" + StrictModes.getSyncValueTypeAsInt(syncEntity)}), null, null, null, 0, null, null, 63));
                                                    }
                                                    str3 = str;
                                                }
                                                if (!linkedHashMap2.isEmpty()) {
                                                    cashAccountDatabaseCallback2.errorReporter.report(new DatabaseMigrationError(i28, i29, "repairSyncValueType", (Throwable) null, MapsKt__MapsJVMKt.mapOf(new Pair("Client Sync", linkedHashMap2)), SetsKt__SetsJVMKt.setOf(clientSync2), "Repaired entities with missing sync value types"), defaultSamplingStrategy);
                                                }
                                                query2.close();
                                                return Unit.INSTANCE;
                                            } catch (Throwable th3) {
                                                try {
                                                    throw th3;
                                                } finally {
                                                }
                                            }
                                        case 2:
                                            int i30 = i;
                                            int i31 = i2;
                                            ((SqlDriver) obj).getClass();
                                            ErrorReporter errorReporter2 = cashAccountDatabaseCallback2.errorReporter;
                                            try {
                                                try {
                                                    Cursor query3 = frameworkSQLiteDatabase2.query(new CallResult("SELECT entity_id, type, sync_value_type, sync_entity_version, entity_processor_version\nFROM sync_entity\nWHERE entity_processor_version IS NULL OR entity_processor_version != 31;"));
                                                    try {
                                                        if (query3.getCount() > 0) {
                                                            LinkedHashMap linkedHashMap3 = new LinkedHashMap();
                                                            int i32 = 0;
                                                            while (query3.moveToNext()) {
                                                                String string4 = query3.getString(0);
                                                                Long valueOf5 = query3.isNull(1) ? null : Long.valueOf(query3.getLong(1));
                                                                persistence = persistence2;
                                                                try {
                                                                    Long valueOf6 = query3.isNull(2) ? null : Long.valueOf(query3.getLong(2));
                                                                    i18 = i30;
                                                                    try {
                                                                        Long valueOf7 = query3.isNull(3) ? null : Long.valueOf(query3.getLong(3));
                                                                        clientSync = clientSync2;
                                                                        try {
                                                                            Long valueOf8 = query3.isNull(4) ? null : Long.valueOf(query3.getLong(4));
                                                                            int i33 = i32 + 1;
                                                                            String valueOf9 = String.valueOf(i32);
                                                                            i172 = i31;
                                                                            try {
                                                                                String str4 = str2 + string4;
                                                                                StringBuilder sb3 = new StringBuilder();
                                                                                String str5 = str2;
                                                                                sb3.append("entityType=");
                                                                                sb3.append(valueOf5);
                                                                                linkedHashMap3.put(valueOf9, CollectionsKt.joinToString$default(CollectionsKt__CollectionsKt.listOf((Object[]) new String[]{str4, sb3.toString(), "valueType=" + valueOf6, "entityVersion=" + valueOf7, "processorVersion=" + valueOf8}), null, null, null, 0, null, null, 63));
                                                                                i32 = i33;
                                                                                i30 = i18;
                                                                                i31 = i172;
                                                                                str2 = str5;
                                                                                persistence2 = persistence;
                                                                                clientSync2 = clientSync;
                                                                            } catch (Throwable th4) {
                                                                                th = th4;
                                                                                th = th;
                                                                                try {
                                                                                    throw th;
                                                                                } catch (Throwable th5) {
                                                                                    Utf8.closeFinally(query3, th);
                                                                                    throw th5;
                                                                                }
                                                                            }
                                                                        } catch (Throwable th6) {
                                                                            th = th6;
                                                                            i172 = i31;
                                                                            th = th;
                                                                            throw th;
                                                                        }
                                                                    } catch (Throwable th7) {
                                                                        th = th7;
                                                                        clientSync = clientSync2;
                                                                        i172 = i31;
                                                                        th = th;
                                                                        throw th;
                                                                    }
                                                                } catch (Throwable th8) {
                                                                    th = th8;
                                                                    i18 = i30;
                                                                    clientSync = clientSync2;
                                                                    i172 = i31;
                                                                    th = th;
                                                                    throw th;
                                                                }
                                                            }
                                                            persistence = persistence2;
                                                            i18 = i30;
                                                            clientSync = clientSync2;
                                                            i172 = i31;
                                                            errorReporter2.report(new DatabaseMigrationError(i18, i172, "detectMisprocessedEntities", (Throwable) null, MapsKt__MapsJVMKt.mapOf(new Pair("Client Sync", linkedHashMap3)), SetsKt__SetsJVMKt.setOf(clientSync), "Detected handled entities with invalid processor versions"), defaultSamplingStrategy);
                                                        }
                                                        query3.close();
                                                    } catch (Throwable th9) {
                                                        th = th9;
                                                        persistence = persistence2;
                                                    }
                                                } catch (Throwable th10) {
                                                    th = th10;
                                                    persistence = persistence2;
                                                    i18 = i30;
                                                    clientSync = clientSync2;
                                                    i172 = i31;
                                                    errorReporter2.report(new DatabaseMigrationError(i18, i172, "detectMisprocessedEntities", th, (Map) null, ArraysKt___ArraysKt.toSet(new ErrorFeature[]{clientSync, persistence}), 16), defaultSamplingStrategy);
                                                    return Unit.INSTANCE;
                                                }
                                            } catch (Throwable th11) {
                                                th = th11;
                                                errorReporter2.report(new DatabaseMigrationError(i18, i172, "detectMisprocessedEntities", th, (Map) null, ArraysKt___ArraysKt.toSet(new ErrorFeature[]{clientSync, persistence}), 16), defaultSamplingStrategy);
                                                return Unit.INSTANCE;
                                            }
                                            return Unit.INSTANCE;
                                        default:
                                            int i34 = i;
                                            int i35 = i2;
                                            ((SqlDriver) obj).getClass();
                                            query2 = frameworkSQLiteDatabase2.query(new CallResult("SELECT entity_id, entity, sync_entity_version, entity_processor_version\nFROM sync_entity;"));
                                            try {
                                                LinkedHashMap linkedHashMap4 = new LinkedHashMap();
                                                while (query2.moveToNext()) {
                                                    String string5 = query2.getString(i24);
                                                    byte[] blob2 = query2.isNull(i23) ? null : query2.getBlob(i23);
                                                    if (blob2 == null || (syncEntity2 = (SyncEntity) SyncEntity.ADAPTER.decode(blob2)) == null) {
                                                        i19 = i34;
                                                        i20 = i35;
                                                    } else {
                                                        Long l = syncEntity2.version;
                                                        Long valueOf10 = query2.isNull(i22) ? null : Long.valueOf(query2.getLong(i22));
                                                        Long valueOf11 = query2.isNull(3) ? null : Long.valueOf(query2.getLong(3));
                                                        if (Intrinsics.areEqual(l, valueOf10)) {
                                                            i24 = 0;
                                                            i22 = 2;
                                                            i23 = 1;
                                                        } else {
                                                            i19 = i34;
                                                            i20 = i35;
                                                            frameworkSQLiteDatabase2.delegate.execSQL("UPDATE sync_entity\nSET sync_entity_version = ?, entity_processor_version = ?\nWHERE entity_id = ?;", new Object[]{l, valueOf10, string5});
                                                            linkedHashMap4.put(string5, CollectionsKt.joinToString$default(CollectionsKt__CollectionsKt.listOf((Object[]) new String[]{"entityId=" + string5, "entityVersion=" + valueOf10, "processorVersion=" + valueOf11}), null, null, null, 0, null, null, 63));
                                                        }
                                                    }
                                                    i34 = i19;
                                                    i35 = i20;
                                                    i24 = 0;
                                                    i22 = 2;
                                                    i23 = 1;
                                                }
                                                int i36 = i34;
                                                int i37 = i35;
                                                if (!linkedHashMap4.isEmpty()) {
                                                    cashAccountDatabaseCallback2.errorReporter.report(new DatabaseMigrationError(i36, i37, "repairEntityAndProcessorVersions", (Throwable) null, MapsKt__MapsJVMKt.mapOf(new Pair("Client Sync", linkedHashMap4)), SetsKt__SetsJVMKt.setOf(clientSync2), "Repaired entities with incorrect entity and processor versions"), defaultSamplingStrategy);
                                                }
                                                query2.close();
                                                return Unit.INSTANCE;
                                            } finally {
                                            }
                                    }
                                }
                            });
                            final int i18 = 11;
                            AfterVersion afterVersion16 = new AfterVersion(775L, new Function1(cashAccountDatabaseCallback) { // from class: com.squareup.cash.db.CashAccountDatabaseCallback$$ExternalSyntheticLambda0
                                /* JADX WARN: Code restructure failed: missing block: B:290:0x03f0, code lost:
                                
                                    if (r3 == null) goto L386;
                                 */
                                /* JADX WARN: Code restructure failed: missing block: B:302:0x03f2, code lost:
                                
                                    r1.execSQL("UPDATE new_customer \nSET \n  photo = ?\nWHERE customer_id = ?", new java.io.Serializable[]{com.squareup.protos.cash.ui.Image.ADAPTER.encode(new com.squareup.protos.cash.ui.Image(r3, r3, 4)), java.lang.Integer.valueOf(r0)});
                                 */
                                /* JADX WARN: Finally extract failed */
                                @Override // kotlin.jvm.functions.Function1
                                /*
                                    Code decompiled incorrectly, please refer to instructions dump.
                                */
                                public final Object invoke(Object obj) {
                                    Cursor query2;
                                    String str;
                                    String str2;
                                    String name;
                                    Sponsor sponsor;
                                    Dependent dependent;
                                    SyncEntity syncEntity;
                                    SyncEntity syncEntity2;
                                    SyncEntity syncEntity3;
                                    SyncEntity syncEntity4;
                                    SyncCustomer syncCustomer;
                                    UiCustomer uiCustomer;
                                    int i72 = i18;
                                    FrameworkSQLiteDatabase frameworkSQLiteDatabase2 = frameworkSQLiteDatabase;
                                    switch (i72) {
                                        case 0:
                                            ((SqlDriver) obj).getClass();
                                            query2 = frameworkSQLiteDatabase2.query(new CallResult("SELECT customer_id, merchant_data FROM customer"));
                                            while (query2.moveToNext()) {
                                                try {
                                                    String string2 = query2.getString(0);
                                                    byte[] blob = query2.isNull(1) ? null : query2.getBlob(1);
                                                    if (blob != null) {
                                                        String str3 = ((MerchantData) MerchantData.ADAPTER.decode(blob)).category;
                                                        if (str3 != null) {
                                                            str = "'" + str3 + "'";
                                                        } else {
                                                            str = null;
                                                        }
                                                        frameworkSQLiteDatabase2.delegate.execSQL(StringsKt__IndentKt.replaceIndent("\n              |UPDATE customer\n              |SET category = " + str + "\n              |WHERE customer_id = '" + string2 + "'\n            "));
                                                    }
                                                } catch (Throwable th222222222222222222222222222222222) {
                                                    try {
                                                        throw th222222222222222222222222222222222;
                                                    } finally {
                                                    }
                                                }
                                            }
                                            query2.close();
                                            return Unit.INSTANCE;
                                        case 1:
                                            ((SqlDriver) obj).getClass();
                                            query2 = frameworkSQLiteDatabase2.query(new CallResult("SELECT _id, amount FROM payment"));
                                            while (query2.moveToNext()) {
                                                try {
                                                    int i82 = query2.getInt(0);
                                                    byte[] blob2 = query2.isNull(1) ? null : query2.getBlob(1);
                                                    if (blob2 != null) {
                                                        Money money = (Money) Money.ADAPTER.decode(blob2);
                                                        Long l = money.amount;
                                                        CurrencyCode currencyCode = money.currency_code;
                                                        if (currencyCode == null || (name = currencyCode.name()) == null) {
                                                            str2 = null;
                                                        } else {
                                                            str2 = "'" + name + "'";
                                                        }
                                                        frameworkSQLiteDatabase2.delegate.execSQL(StringsKt__IndentKt.trimMargin$default("\n            |UPDATE new_payment \n            |SET \n            |  amount = " + l + ", \n            |  amount_currency = " + str2 + "\n            |WHERE _id = " + i82 + "\n            "));
                                                    }
                                                } catch (Throwable th2222222222222222222222222222222222) {
                                                    try {
                                                        throw th2222222222222222222222222222222222;
                                                    } finally {
                                                    }
                                                }
                                            }
                                            query2.close();
                                            return Unit.INSTANCE;
                                        case 2:
                                            SQLiteDatabase sQLiteDatabase2 = frameworkSQLiteDatabase2.delegate;
                                            ((SqlDriver) obj).getClass();
                                            query2 = frameworkSQLiteDatabase2.query(new CallResult("SELECT customer_id, photo_url, photo, accent_color, themed_accent_color FROM customer"));
                                            while (query2.moveToNext()) {
                                                try {
                                                    int i92 = query2.getInt(0);
                                                    String string3 = query2.isNull(1) ? null : query2.getString(1);
                                                    byte[] blob3 = query2.isNull(2) ? null : query2.getBlob(2);
                                                    Image image = blob3 != null ? (Image) Image.ADAPTER.decode(blob3) : null;
                                                    String string4 = query2.isNull(3) ? null : query2.getString(3);
                                                    byte[] blob4 = query2.isNull(4) ? null : query2.getBlob(4);
                                                    Color color = blob4 != null ? (Color) Color.ADAPTER.decode(blob4) : null;
                                                    if (image == null && string3 != null && color == null && string4 != null) {
                                                        sQLiteDatabase2.execSQL("UPDATE new_customer \nSET \n  photo = ?,\n  themed_accent_color = ?\nWHERE customer_id = ?", new Serializable[]{Image.ADAPTER.encode(new Image(string3, string3, 4)), Color.ADAPTER.encode(ColorsKt.toColor(string4)), Integer.valueOf(i92)});
                                                    } else if (color == null && string4 != null) {
                                                        sQLiteDatabase2.execSQL("UPDATE new_customer \nSET \n  themed_accent_color = ?\nWHERE customer_id = ?", new Serializable[]{Color.ADAPTER.encode(ColorsKt.toColor(string4)), Integer.valueOf(i92)});
                                                    }
                                                } catch (Throwable th22222222222222222222222222222222222) {
                                                    try {
                                                        throw th22222222222222222222222222222222222;
                                                    } finally {
                                                    }
                                                }
                                            }
                                            query2.close();
                                            return Unit.INSTANCE;
                                        case 3:
                                            ((SqlDriver) obj).getClass();
                                            CashAccountDatabaseCallback.createColumnIfNotExists(frameworkSQLiteDatabase2, "creditLine", "lending_product", "TEXT", null);
                                            CashAccountDatabaseCallback.createColumnIfNotExists(frameworkSQLiteDatabase2, "loan", "lending_product", "TEXT", null);
                                            CashAccountDatabaseCallback.createColumnIfNotExists(frameworkSQLiteDatabase2, "loanTransaction", "lending_product", "TEXT", null);
                                            CashAccountDatabaseCallback.createColumnIfNotExists(frameworkSQLiteDatabase2, "payment", "lending_loan_token", "TEXT", "NULL");
                                            CashAccountDatabaseCallback.createColumnIfNotExists(frameworkSQLiteDatabase2, "loan", "bnpl_data", "BLOB", null);
                                            return Unit.INSTANCE;
                                        case 4:
                                            ((SqlDriver) obj).getClass();
                                            query2 = frameworkSQLiteDatabase2.query(new CallResult("SELECT count(*) FROM paperDepositBarcodeInfo"));
                                            try {
                                                query2.moveToNext();
                                                if (query2.getInt(0) == 0) {
                                                    frameworkSQLiteDatabase2.delegate.execSQL("INSERT INTO paperDepositBarcodeInfo DEFAULT VALUES;");
                                                }
                                                query2.close();
                                                return Unit.INSTANCE;
                                            } finally {
                                                try {
                                                    throw th22222222222222222222222222222222222;
                                                } finally {
                                                }
                                            }
                                        case 5:
                                            ((SqlDriver) obj).getClass();
                                            query2 = frameworkSQLiteDatabase2.query(new CallResult("SELECT * FROM profileDirectorySection"));
                                            while (query2.moveToNext()) {
                                                try {
                                                    int i102 = query2.getInt(0);
                                                    String string5 = query2.isNull(1) ? null : query2.getString(1);
                                                    if (string5 != null) {
                                                        frameworkSQLiteDatabase2.delegate.execSQL(StringsKt__IndentKt.trimMargin$default("\n            |UPDATE profileDirectorySection\n            |SET \n            |  text_title = ?\n            |WHERE id = " + i102 + "\n            "), new byte[][]{Text.ADAPTER.encode(new Text(string5, (TextStyle) null, (TextDecoration) null, (Color) null, (Image) null, 62))});
                                                    }
                                                } finally {
                                                    try {
                                                        throw th22222222222222222222222222222222222;
                                                    } finally {
                                                    }
                                                }
                                            }
                                            query2.close();
                                            return Unit.INSTANCE;
                                        case 6:
                                            ((SqlDriver) obj).getClass();
                                            query2 = frameworkSQLiteDatabase2.query(new CallResult("SELECT entity_id, customer_token, family_account FROM familyAccount"));
                                            while (query2.moveToNext()) {
                                                try {
                                                    String string6 = query2.getString(0);
                                                    byte[] blob5 = query2.isNull(2) ? null : query2.getBlob(2);
                                                    if (blob5 != null) {
                                                        UiFamilyAccount uiFamilyAccount = (UiFamilyAccount) UiFamilyAccount.ADAPTER.decode(blob5);
                                                        Object[] objArr = new Serializable[3];
                                                        objArr[0] = string6;
                                                        FamilyAccount familyAccount = uiFamilyAccount.family_account;
                                                        BrandCollectionDataKt brandCollectionDataKt = familyAccount != null ? familyAccount.f1246type : null;
                                                        FamilyAccount$Type$Dependent familyAccount$Type$Dependent = brandCollectionDataKt instanceof FamilyAccount$Type$Dependent ? (FamilyAccount$Type$Dependent) brandCollectionDataKt : null;
                                                        objArr[1] = (familyAccount$Type$Dependent == null || (dependent = familyAccount$Type$Dependent.value) == null) ? null : Dependent.ADAPTER.encode(dependent);
                                                        FamilyAccount familyAccount2 = uiFamilyAccount.family_account;
                                                        BrandCollectionDataKt brandCollectionDataKt2 = familyAccount2 != null ? familyAccount2.f1246type : null;
                                                        FamilyAccount$Type$Sponsor familyAccount$Type$Sponsor = brandCollectionDataKt2 instanceof FamilyAccount$Type$Sponsor ? (FamilyAccount$Type$Sponsor) brandCollectionDataKt2 : null;
                                                        objArr[2] = (familyAccount$Type$Sponsor == null || (sponsor = familyAccount$Type$Sponsor.value) == null) ? null : Sponsor.ADAPTER.encode(sponsor);
                                                        frameworkSQLiteDatabase2.delegate.execSQL("INSERT INTO family_account(entity_id, dependent, sponsor)\nVALUES (?, ?, ?)", objArr);
                                                    }
                                                } catch (Throwable th222222222222222222222222222222222222) {
                                                    try {
                                                        throw th222222222222222222222222222222222222;
                                                    } finally {
                                                    }
                                                }
                                            }
                                            query2.close();
                                            return Unit.INSTANCE;
                                        case 7:
                                            ((SqlDriver) obj).getClass();
                                            CashAccountDatabaseCallback.createColumnIfNotExists(frameworkSQLiteDatabase2, "inAppNotificationMessage", "avatar", "BLOB", null);
                                            return Unit.INSTANCE;
                                        case 8:
                                            SQLiteDatabase sQLiteDatabase3 = frameworkSQLiteDatabase2.delegate;
                                            ((SqlDriver) obj).getClass();
                                            query2 = frameworkSQLiteDatabase2.query(new CallResult("SELECT entity_id, entity FROM sync_entity"));
                                            while (query2.moveToNext()) {
                                                try {
                                                    String string7 = query2.getString(0);
                                                    byte[] blob6 = query2.isNull(1) ? null : query2.getBlob(1);
                                                    if (blob6 != null && (syncEntity = (SyncEntity) SyncEntity.ADAPTER.decode(blob6)) != null) {
                                                        Long l2 = syncEntity.version;
                                                        sQLiteDatabase3.execSQL("UPDATE sync_entity \nSET \n  sync_entity_version = ?\nWHERE entity_id = ?", new Object[]{l2, string7});
                                                        if (syncEntity.payment != null) {
                                                            sQLiteDatabase3.execSQL("UPDATE payment\nSET \n  sync_entity_version = ?\nWHERE entity_id = ?", new Object[]{l2, string7});
                                                        }
                                                    }
                                                } finally {
                                                    try {
                                                        throw th222222222222222222222222222222222222;
                                                    } finally {
                                                    }
                                                }
                                            }
                                            query2.close();
                                            return Unit.INSTANCE;
                                        case 9:
                                            ((SqlDriver) obj).getClass();
                                            query2 = frameworkSQLiteDatabase2.query(new CallResult("SELECT entity_id, entity_type, entity FROM unhandled_sync_entity"));
                                            while (query2.moveToNext()) {
                                                try {
                                                    String string8 = query2.getString(0);
                                                    int i112 = query2.getInt(1);
                                                    byte[] blob7 = query2.isNull(2) ? null : query2.getBlob(2);
                                                    if (blob7 != null && (syncEntity2 = (SyncEntity) SyncEntity.ADAPTER.decode(blob7)) != null) {
                                                        frameworkSQLiteDatabase2.delegate.execSQL("UPDATE unhandled_sync_entity\nSET\n  entity_version = ?\nWHERE entity_id = ? AND entity_type = ?", new Object[]{syncEntity2.version, string8, Integer.valueOf(i112)});
                                                    }
                                                } finally {
                                                    try {
                                                        throw th222222222222222222222222222222222222;
                                                    } finally {
                                                    }
                                                }
                                            }
                                            query2.close();
                                            return Unit.INSTANCE;
                                        case 10:
                                            ((SqlDriver) obj).getClass();
                                            query2 = frameworkSQLiteDatabase2.query(new CallResult("SELECT entity_id, entity, entity_processor_version, sync_value_type, sync_entity_version\nFROM sync_entity"));
                                            while (query2.moveToNext()) {
                                                try {
                                                    String string9 = query2.getString(0);
                                                    byte[] blob8 = query2.isNull(1) ? null : query2.getBlob(1);
                                                    if (blob8 != null && (syncEntity3 = (SyncEntity) SyncEntity.ADAPTER.decode(blob8)) != null) {
                                                        frameworkSQLiteDatabase2.delegate.execSQL("INSERT OR REPLACE INTO new_sync_entity\nVALUES (?, ?, ?, ?, ?, ?);", new Serializable[]{string9, Long.valueOf(EntitySyncerKt.rawEntityType(syncEntity3)), blob8, query2.isNull(2) ? null : Long.valueOf(query2.getLong(2)), query2.isNull(3) ? null : Long.valueOf(query2.getLong(3)), query2.isNull(4) ? null : Long.valueOf(query2.getLong(4))});
                                                    }
                                                } finally {
                                                    try {
                                                        throw th222222222222222222222222222222222222;
                                                    } finally {
                                                    }
                                                }
                                            }
                                            query2.close();
                                            return Unit.INSTANCE;
                                        case 11:
                                            ((SqlDriver) obj).getClass();
                                            CashAccountDatabaseCallback.restoreEntityProcessorVersionColumn(frameworkSQLiteDatabase2);
                                            return Unit.INSTANCE;
                                        case 12:
                                            ((SqlDriver) obj).getClass();
                                            CashAccountDatabaseCallback.restoreEntityProcessorVersionColumn(frameworkSQLiteDatabase2);
                                            return Unit.INSTANCE;
                                        default:
                                            ((SqlDriver) obj).getClass();
                                            query2 = frameworkSQLiteDatabase2.query(new CallResult("SELECT entity_id, entity FROM sync_entity WHERE type = 2"));
                                            while (query2.moveToNext()) {
                                                try {
                                                    byte[] blob9 = query2.isNull(1) ? null : query2.getBlob(1);
                                                    if (blob9 != null && (syncEntity4 = (SyncEntity) SyncEntity.ADAPTER.decode(blob9)) != null && (syncCustomer = syncEntity4.customer) != null && (uiCustomer = syncCustomer.customer) != null) {
                                                        frameworkSQLiteDatabase2.delegate.execSQL("UPDATE customer SET is_special_customer = ? WHERE customer_id = ?", new Object[]{Long.valueOf(Intrinsics.areEqual(uiCustomer.is_special_customer, Boolean.TRUE) ? 1L : 0L), uiCustomer.id});
                                                    }
                                                } finally {
                                                }
                                            }
                                            query2.close();
                                            return Unit.INSTANCE;
                                    }
                                }
                            });
                            final int i19 = 12;
                            AfterVersion afterVersion17 = new AfterVersion(778L, new Function1(cashAccountDatabaseCallback) { // from class: com.squareup.cash.db.CashAccountDatabaseCallback$$ExternalSyntheticLambda0
                                /* JADX WARN: Code restructure failed: missing block: B:290:0x03f0, code lost:
                                
                                    if (r3 == null) goto L386;
                                 */
                                /* JADX WARN: Code restructure failed: missing block: B:302:0x03f2, code lost:
                                
                                    r1.execSQL("UPDATE new_customer \nSET \n  photo = ?\nWHERE customer_id = ?", new java.io.Serializable[]{com.squareup.protos.cash.ui.Image.ADAPTER.encode(new com.squareup.protos.cash.ui.Image(r3, r3, 4)), java.lang.Integer.valueOf(r0)});
                                 */
                                /* JADX WARN: Finally extract failed */
                                @Override // kotlin.jvm.functions.Function1
                                /*
                                    Code decompiled incorrectly, please refer to instructions dump.
                                */
                                public final Object invoke(Object obj) {
                                    Cursor query2;
                                    String str;
                                    String str2;
                                    String name;
                                    Sponsor sponsor;
                                    Dependent dependent;
                                    SyncEntity syncEntity;
                                    SyncEntity syncEntity2;
                                    SyncEntity syncEntity3;
                                    SyncEntity syncEntity4;
                                    SyncCustomer syncCustomer;
                                    UiCustomer uiCustomer;
                                    int i72 = i19;
                                    FrameworkSQLiteDatabase frameworkSQLiteDatabase2 = frameworkSQLiteDatabase;
                                    switch (i72) {
                                        case 0:
                                            ((SqlDriver) obj).getClass();
                                            query2 = frameworkSQLiteDatabase2.query(new CallResult("SELECT customer_id, merchant_data FROM customer"));
                                            while (query2.moveToNext()) {
                                                try {
                                                    String string2 = query2.getString(0);
                                                    byte[] blob = query2.isNull(1) ? null : query2.getBlob(1);
                                                    if (blob != null) {
                                                        String str3 = ((MerchantData) MerchantData.ADAPTER.decode(blob)).category;
                                                        if (str3 != null) {
                                                            str = "'" + str3 + "'";
                                                        } else {
                                                            str = null;
                                                        }
                                                        frameworkSQLiteDatabase2.delegate.execSQL(StringsKt__IndentKt.replaceIndent("\n              |UPDATE customer\n              |SET category = " + str + "\n              |WHERE customer_id = '" + string2 + "'\n            "));
                                                    }
                                                } catch (Throwable th222222222222222222222222222222222222) {
                                                    try {
                                                        throw th222222222222222222222222222222222222;
                                                    } finally {
                                                    }
                                                }
                                            }
                                            query2.close();
                                            return Unit.INSTANCE;
                                        case 1:
                                            ((SqlDriver) obj).getClass();
                                            query2 = frameworkSQLiteDatabase2.query(new CallResult("SELECT _id, amount FROM payment"));
                                            while (query2.moveToNext()) {
                                                try {
                                                    int i82 = query2.getInt(0);
                                                    byte[] blob2 = query2.isNull(1) ? null : query2.getBlob(1);
                                                    if (blob2 != null) {
                                                        Money money = (Money) Money.ADAPTER.decode(blob2);
                                                        Long l = money.amount;
                                                        CurrencyCode currencyCode = money.currency_code;
                                                        if (currencyCode == null || (name = currencyCode.name()) == null) {
                                                            str2 = null;
                                                        } else {
                                                            str2 = "'" + name + "'";
                                                        }
                                                        frameworkSQLiteDatabase2.delegate.execSQL(StringsKt__IndentKt.trimMargin$default("\n            |UPDATE new_payment \n            |SET \n            |  amount = " + l + ", \n            |  amount_currency = " + str2 + "\n            |WHERE _id = " + i82 + "\n            "));
                                                    }
                                                } catch (Throwable th2222222222222222222222222222222222222) {
                                                    try {
                                                        throw th2222222222222222222222222222222222222;
                                                    } finally {
                                                    }
                                                }
                                            }
                                            query2.close();
                                            return Unit.INSTANCE;
                                        case 2:
                                            SQLiteDatabase sQLiteDatabase2 = frameworkSQLiteDatabase2.delegate;
                                            ((SqlDriver) obj).getClass();
                                            query2 = frameworkSQLiteDatabase2.query(new CallResult("SELECT customer_id, photo_url, photo, accent_color, themed_accent_color FROM customer"));
                                            while (query2.moveToNext()) {
                                                try {
                                                    int i92 = query2.getInt(0);
                                                    String string3 = query2.isNull(1) ? null : query2.getString(1);
                                                    byte[] blob3 = query2.isNull(2) ? null : query2.getBlob(2);
                                                    Image image = blob3 != null ? (Image) Image.ADAPTER.decode(blob3) : null;
                                                    String string4 = query2.isNull(3) ? null : query2.getString(3);
                                                    byte[] blob4 = query2.isNull(4) ? null : query2.getBlob(4);
                                                    Color color = blob4 != null ? (Color) Color.ADAPTER.decode(blob4) : null;
                                                    if (image == null && string3 != null && color == null && string4 != null) {
                                                        sQLiteDatabase2.execSQL("UPDATE new_customer \nSET \n  photo = ?,\n  themed_accent_color = ?\nWHERE customer_id = ?", new Serializable[]{Image.ADAPTER.encode(new Image(string3, string3, 4)), Color.ADAPTER.encode(ColorsKt.toColor(string4)), Integer.valueOf(i92)});
                                                    } else if (color == null && string4 != null) {
                                                        sQLiteDatabase2.execSQL("UPDATE new_customer \nSET \n  themed_accent_color = ?\nWHERE customer_id = ?", new Serializable[]{Color.ADAPTER.encode(ColorsKt.toColor(string4)), Integer.valueOf(i92)});
                                                    }
                                                } catch (Throwable th22222222222222222222222222222222222222) {
                                                    try {
                                                        throw th22222222222222222222222222222222222222;
                                                    } finally {
                                                    }
                                                }
                                            }
                                            query2.close();
                                            return Unit.INSTANCE;
                                        case 3:
                                            ((SqlDriver) obj).getClass();
                                            CashAccountDatabaseCallback.createColumnIfNotExists(frameworkSQLiteDatabase2, "creditLine", "lending_product", "TEXT", null);
                                            CashAccountDatabaseCallback.createColumnIfNotExists(frameworkSQLiteDatabase2, "loan", "lending_product", "TEXT", null);
                                            CashAccountDatabaseCallback.createColumnIfNotExists(frameworkSQLiteDatabase2, "loanTransaction", "lending_product", "TEXT", null);
                                            CashAccountDatabaseCallback.createColumnIfNotExists(frameworkSQLiteDatabase2, "payment", "lending_loan_token", "TEXT", "NULL");
                                            CashAccountDatabaseCallback.createColumnIfNotExists(frameworkSQLiteDatabase2, "loan", "bnpl_data", "BLOB", null);
                                            return Unit.INSTANCE;
                                        case 4:
                                            ((SqlDriver) obj).getClass();
                                            query2 = frameworkSQLiteDatabase2.query(new CallResult("SELECT count(*) FROM paperDepositBarcodeInfo"));
                                            try {
                                                query2.moveToNext();
                                                if (query2.getInt(0) == 0) {
                                                    frameworkSQLiteDatabase2.delegate.execSQL("INSERT INTO paperDepositBarcodeInfo DEFAULT VALUES;");
                                                }
                                                query2.close();
                                                return Unit.INSTANCE;
                                            } finally {
                                                try {
                                                    throw th22222222222222222222222222222222222222;
                                                } finally {
                                                }
                                            }
                                        case 5:
                                            ((SqlDriver) obj).getClass();
                                            query2 = frameworkSQLiteDatabase2.query(new CallResult("SELECT * FROM profileDirectorySection"));
                                            while (query2.moveToNext()) {
                                                try {
                                                    int i102 = query2.getInt(0);
                                                    String string5 = query2.isNull(1) ? null : query2.getString(1);
                                                    if (string5 != null) {
                                                        frameworkSQLiteDatabase2.delegate.execSQL(StringsKt__IndentKt.trimMargin$default("\n            |UPDATE profileDirectorySection\n            |SET \n            |  text_title = ?\n            |WHERE id = " + i102 + "\n            "), new byte[][]{Text.ADAPTER.encode(new Text(string5, (TextStyle) null, (TextDecoration) null, (Color) null, (Image) null, 62))});
                                                    }
                                                } finally {
                                                    try {
                                                        throw th22222222222222222222222222222222222222;
                                                    } finally {
                                                    }
                                                }
                                            }
                                            query2.close();
                                            return Unit.INSTANCE;
                                        case 6:
                                            ((SqlDriver) obj).getClass();
                                            query2 = frameworkSQLiteDatabase2.query(new CallResult("SELECT entity_id, customer_token, family_account FROM familyAccount"));
                                            while (query2.moveToNext()) {
                                                try {
                                                    String string6 = query2.getString(0);
                                                    byte[] blob5 = query2.isNull(2) ? null : query2.getBlob(2);
                                                    if (blob5 != null) {
                                                        UiFamilyAccount uiFamilyAccount = (UiFamilyAccount) UiFamilyAccount.ADAPTER.decode(blob5);
                                                        Object[] objArr = new Serializable[3];
                                                        objArr[0] = string6;
                                                        FamilyAccount familyAccount = uiFamilyAccount.family_account;
                                                        BrandCollectionDataKt brandCollectionDataKt = familyAccount != null ? familyAccount.f1246type : null;
                                                        FamilyAccount$Type$Dependent familyAccount$Type$Dependent = brandCollectionDataKt instanceof FamilyAccount$Type$Dependent ? (FamilyAccount$Type$Dependent) brandCollectionDataKt : null;
                                                        objArr[1] = (familyAccount$Type$Dependent == null || (dependent = familyAccount$Type$Dependent.value) == null) ? null : Dependent.ADAPTER.encode(dependent);
                                                        FamilyAccount familyAccount2 = uiFamilyAccount.family_account;
                                                        BrandCollectionDataKt brandCollectionDataKt2 = familyAccount2 != null ? familyAccount2.f1246type : null;
                                                        FamilyAccount$Type$Sponsor familyAccount$Type$Sponsor = brandCollectionDataKt2 instanceof FamilyAccount$Type$Sponsor ? (FamilyAccount$Type$Sponsor) brandCollectionDataKt2 : null;
                                                        objArr[2] = (familyAccount$Type$Sponsor == null || (sponsor = familyAccount$Type$Sponsor.value) == null) ? null : Sponsor.ADAPTER.encode(sponsor);
                                                        frameworkSQLiteDatabase2.delegate.execSQL("INSERT INTO family_account(entity_id, dependent, sponsor)\nVALUES (?, ?, ?)", objArr);
                                                    }
                                                } catch (Throwable th222222222222222222222222222222222222222) {
                                                    try {
                                                        throw th222222222222222222222222222222222222222;
                                                    } finally {
                                                    }
                                                }
                                            }
                                            query2.close();
                                            return Unit.INSTANCE;
                                        case 7:
                                            ((SqlDriver) obj).getClass();
                                            CashAccountDatabaseCallback.createColumnIfNotExists(frameworkSQLiteDatabase2, "inAppNotificationMessage", "avatar", "BLOB", null);
                                            return Unit.INSTANCE;
                                        case 8:
                                            SQLiteDatabase sQLiteDatabase3 = frameworkSQLiteDatabase2.delegate;
                                            ((SqlDriver) obj).getClass();
                                            query2 = frameworkSQLiteDatabase2.query(new CallResult("SELECT entity_id, entity FROM sync_entity"));
                                            while (query2.moveToNext()) {
                                                try {
                                                    String string7 = query2.getString(0);
                                                    byte[] blob6 = query2.isNull(1) ? null : query2.getBlob(1);
                                                    if (blob6 != null && (syncEntity = (SyncEntity) SyncEntity.ADAPTER.decode(blob6)) != null) {
                                                        Long l2 = syncEntity.version;
                                                        sQLiteDatabase3.execSQL("UPDATE sync_entity \nSET \n  sync_entity_version = ?\nWHERE entity_id = ?", new Object[]{l2, string7});
                                                        if (syncEntity.payment != null) {
                                                            sQLiteDatabase3.execSQL("UPDATE payment\nSET \n  sync_entity_version = ?\nWHERE entity_id = ?", new Object[]{l2, string7});
                                                        }
                                                    }
                                                } finally {
                                                    try {
                                                        throw th222222222222222222222222222222222222222;
                                                    } finally {
                                                    }
                                                }
                                            }
                                            query2.close();
                                            return Unit.INSTANCE;
                                        case 9:
                                            ((SqlDriver) obj).getClass();
                                            query2 = frameworkSQLiteDatabase2.query(new CallResult("SELECT entity_id, entity_type, entity FROM unhandled_sync_entity"));
                                            while (query2.moveToNext()) {
                                                try {
                                                    String string8 = query2.getString(0);
                                                    int i112 = query2.getInt(1);
                                                    byte[] blob7 = query2.isNull(2) ? null : query2.getBlob(2);
                                                    if (blob7 != null && (syncEntity2 = (SyncEntity) SyncEntity.ADAPTER.decode(blob7)) != null) {
                                                        frameworkSQLiteDatabase2.delegate.execSQL("UPDATE unhandled_sync_entity\nSET\n  entity_version = ?\nWHERE entity_id = ? AND entity_type = ?", new Object[]{syncEntity2.version, string8, Integer.valueOf(i112)});
                                                    }
                                                } finally {
                                                    try {
                                                        throw th222222222222222222222222222222222222222;
                                                    } finally {
                                                    }
                                                }
                                            }
                                            query2.close();
                                            return Unit.INSTANCE;
                                        case 10:
                                            ((SqlDriver) obj).getClass();
                                            query2 = frameworkSQLiteDatabase2.query(new CallResult("SELECT entity_id, entity, entity_processor_version, sync_value_type, sync_entity_version\nFROM sync_entity"));
                                            while (query2.moveToNext()) {
                                                try {
                                                    String string9 = query2.getString(0);
                                                    byte[] blob8 = query2.isNull(1) ? null : query2.getBlob(1);
                                                    if (blob8 != null && (syncEntity3 = (SyncEntity) SyncEntity.ADAPTER.decode(blob8)) != null) {
                                                        frameworkSQLiteDatabase2.delegate.execSQL("INSERT OR REPLACE INTO new_sync_entity\nVALUES (?, ?, ?, ?, ?, ?);", new Serializable[]{string9, Long.valueOf(EntitySyncerKt.rawEntityType(syncEntity3)), blob8, query2.isNull(2) ? null : Long.valueOf(query2.getLong(2)), query2.isNull(3) ? null : Long.valueOf(query2.getLong(3)), query2.isNull(4) ? null : Long.valueOf(query2.getLong(4))});
                                                    }
                                                } finally {
                                                    try {
                                                        throw th222222222222222222222222222222222222222;
                                                    } finally {
                                                    }
                                                }
                                            }
                                            query2.close();
                                            return Unit.INSTANCE;
                                        case 11:
                                            ((SqlDriver) obj).getClass();
                                            CashAccountDatabaseCallback.restoreEntityProcessorVersionColumn(frameworkSQLiteDatabase2);
                                            return Unit.INSTANCE;
                                        case 12:
                                            ((SqlDriver) obj).getClass();
                                            CashAccountDatabaseCallback.restoreEntityProcessorVersionColumn(frameworkSQLiteDatabase2);
                                            return Unit.INSTANCE;
                                        default:
                                            ((SqlDriver) obj).getClass();
                                            query2 = frameworkSQLiteDatabase2.query(new CallResult("SELECT entity_id, entity FROM sync_entity WHERE type = 2"));
                                            while (query2.moveToNext()) {
                                                try {
                                                    byte[] blob9 = query2.isNull(1) ? null : query2.getBlob(1);
                                                    if (blob9 != null && (syncEntity4 = (SyncEntity) SyncEntity.ADAPTER.decode(blob9)) != null && (syncCustomer = syncEntity4.customer) != null && (uiCustomer = syncCustomer.customer) != null) {
                                                        frameworkSQLiteDatabase2.delegate.execSQL("UPDATE customer SET is_special_customer = ? WHERE customer_id = ?", new Object[]{Long.valueOf(Intrinsics.areEqual(uiCustomer.is_special_customer, Boolean.TRUE) ? 1L : 0L), uiCustomer.id});
                                                    }
                                                } finally {
                                                }
                                            }
                                            query2.close();
                                            return Unit.INSTANCE;
                                    }
                                }
                            });
                            final int i20 = 13;
                            AfterVersion afterVersion18 = new AfterVersion(781L, new Function1(cashAccountDatabaseCallback) { // from class: com.squareup.cash.db.CashAccountDatabaseCallback$$ExternalSyntheticLambda0
                                /* JADX WARN: Code restructure failed: missing block: B:290:0x03f0, code lost:
                                
                                    if (r3 == null) goto L386;
                                 */
                                /* JADX WARN: Code restructure failed: missing block: B:302:0x03f2, code lost:
                                
                                    r1.execSQL("UPDATE new_customer \nSET \n  photo = ?\nWHERE customer_id = ?", new java.io.Serializable[]{com.squareup.protos.cash.ui.Image.ADAPTER.encode(new com.squareup.protos.cash.ui.Image(r3, r3, 4)), java.lang.Integer.valueOf(r0)});
                                 */
                                /* JADX WARN: Finally extract failed */
                                @Override // kotlin.jvm.functions.Function1
                                /*
                                    Code decompiled incorrectly, please refer to instructions dump.
                                */
                                public final Object invoke(Object obj) {
                                    Cursor query2;
                                    String str;
                                    String str2;
                                    String name;
                                    Sponsor sponsor;
                                    Dependent dependent;
                                    SyncEntity syncEntity;
                                    SyncEntity syncEntity2;
                                    SyncEntity syncEntity3;
                                    SyncEntity syncEntity4;
                                    SyncCustomer syncCustomer;
                                    UiCustomer uiCustomer;
                                    int i72 = i20;
                                    FrameworkSQLiteDatabase frameworkSQLiteDatabase2 = frameworkSQLiteDatabase;
                                    switch (i72) {
                                        case 0:
                                            ((SqlDriver) obj).getClass();
                                            query2 = frameworkSQLiteDatabase2.query(new CallResult("SELECT customer_id, merchant_data FROM customer"));
                                            while (query2.moveToNext()) {
                                                try {
                                                    String string2 = query2.getString(0);
                                                    byte[] blob = query2.isNull(1) ? null : query2.getBlob(1);
                                                    if (blob != null) {
                                                        String str3 = ((MerchantData) MerchantData.ADAPTER.decode(blob)).category;
                                                        if (str3 != null) {
                                                            str = "'" + str3 + "'";
                                                        } else {
                                                            str = null;
                                                        }
                                                        frameworkSQLiteDatabase2.delegate.execSQL(StringsKt__IndentKt.replaceIndent("\n              |UPDATE customer\n              |SET category = " + str + "\n              |WHERE customer_id = '" + string2 + "'\n            "));
                                                    }
                                                } catch (Throwable th222222222222222222222222222222222222222) {
                                                    try {
                                                        throw th222222222222222222222222222222222222222;
                                                    } finally {
                                                    }
                                                }
                                            }
                                            query2.close();
                                            return Unit.INSTANCE;
                                        case 1:
                                            ((SqlDriver) obj).getClass();
                                            query2 = frameworkSQLiteDatabase2.query(new CallResult("SELECT _id, amount FROM payment"));
                                            while (query2.moveToNext()) {
                                                try {
                                                    int i82 = query2.getInt(0);
                                                    byte[] blob2 = query2.isNull(1) ? null : query2.getBlob(1);
                                                    if (blob2 != null) {
                                                        Money money = (Money) Money.ADAPTER.decode(blob2);
                                                        Long l = money.amount;
                                                        CurrencyCode currencyCode = money.currency_code;
                                                        if (currencyCode == null || (name = currencyCode.name()) == null) {
                                                            str2 = null;
                                                        } else {
                                                            str2 = "'" + name + "'";
                                                        }
                                                        frameworkSQLiteDatabase2.delegate.execSQL(StringsKt__IndentKt.trimMargin$default("\n            |UPDATE new_payment \n            |SET \n            |  amount = " + l + ", \n            |  amount_currency = " + str2 + "\n            |WHERE _id = " + i82 + "\n            "));
                                                    }
                                                } catch (Throwable th2222222222222222222222222222222222222222) {
                                                    try {
                                                        throw th2222222222222222222222222222222222222222;
                                                    } finally {
                                                    }
                                                }
                                            }
                                            query2.close();
                                            return Unit.INSTANCE;
                                        case 2:
                                            SQLiteDatabase sQLiteDatabase2 = frameworkSQLiteDatabase2.delegate;
                                            ((SqlDriver) obj).getClass();
                                            query2 = frameworkSQLiteDatabase2.query(new CallResult("SELECT customer_id, photo_url, photo, accent_color, themed_accent_color FROM customer"));
                                            while (query2.moveToNext()) {
                                                try {
                                                    int i92 = query2.getInt(0);
                                                    String string3 = query2.isNull(1) ? null : query2.getString(1);
                                                    byte[] blob3 = query2.isNull(2) ? null : query2.getBlob(2);
                                                    Image image = blob3 != null ? (Image) Image.ADAPTER.decode(blob3) : null;
                                                    String string4 = query2.isNull(3) ? null : query2.getString(3);
                                                    byte[] blob4 = query2.isNull(4) ? null : query2.getBlob(4);
                                                    Color color = blob4 != null ? (Color) Color.ADAPTER.decode(blob4) : null;
                                                    if (image == null && string3 != null && color == null && string4 != null) {
                                                        sQLiteDatabase2.execSQL("UPDATE new_customer \nSET \n  photo = ?,\n  themed_accent_color = ?\nWHERE customer_id = ?", new Serializable[]{Image.ADAPTER.encode(new Image(string3, string3, 4)), Color.ADAPTER.encode(ColorsKt.toColor(string4)), Integer.valueOf(i92)});
                                                    } else if (color == null && string4 != null) {
                                                        sQLiteDatabase2.execSQL("UPDATE new_customer \nSET \n  themed_accent_color = ?\nWHERE customer_id = ?", new Serializable[]{Color.ADAPTER.encode(ColorsKt.toColor(string4)), Integer.valueOf(i92)});
                                                    }
                                                } catch (Throwable th22222222222222222222222222222222222222222) {
                                                    try {
                                                        throw th22222222222222222222222222222222222222222;
                                                    } finally {
                                                    }
                                                }
                                            }
                                            query2.close();
                                            return Unit.INSTANCE;
                                        case 3:
                                            ((SqlDriver) obj).getClass();
                                            CashAccountDatabaseCallback.createColumnIfNotExists(frameworkSQLiteDatabase2, "creditLine", "lending_product", "TEXT", null);
                                            CashAccountDatabaseCallback.createColumnIfNotExists(frameworkSQLiteDatabase2, "loan", "lending_product", "TEXT", null);
                                            CashAccountDatabaseCallback.createColumnIfNotExists(frameworkSQLiteDatabase2, "loanTransaction", "lending_product", "TEXT", null);
                                            CashAccountDatabaseCallback.createColumnIfNotExists(frameworkSQLiteDatabase2, "payment", "lending_loan_token", "TEXT", "NULL");
                                            CashAccountDatabaseCallback.createColumnIfNotExists(frameworkSQLiteDatabase2, "loan", "bnpl_data", "BLOB", null);
                                            return Unit.INSTANCE;
                                        case 4:
                                            ((SqlDriver) obj).getClass();
                                            query2 = frameworkSQLiteDatabase2.query(new CallResult("SELECT count(*) FROM paperDepositBarcodeInfo"));
                                            try {
                                                query2.moveToNext();
                                                if (query2.getInt(0) == 0) {
                                                    frameworkSQLiteDatabase2.delegate.execSQL("INSERT INTO paperDepositBarcodeInfo DEFAULT VALUES;");
                                                }
                                                query2.close();
                                                return Unit.INSTANCE;
                                            } finally {
                                                try {
                                                    throw th22222222222222222222222222222222222222222;
                                                } finally {
                                                }
                                            }
                                        case 5:
                                            ((SqlDriver) obj).getClass();
                                            query2 = frameworkSQLiteDatabase2.query(new CallResult("SELECT * FROM profileDirectorySection"));
                                            while (query2.moveToNext()) {
                                                try {
                                                    int i102 = query2.getInt(0);
                                                    String string5 = query2.isNull(1) ? null : query2.getString(1);
                                                    if (string5 != null) {
                                                        frameworkSQLiteDatabase2.delegate.execSQL(StringsKt__IndentKt.trimMargin$default("\n            |UPDATE profileDirectorySection\n            |SET \n            |  text_title = ?\n            |WHERE id = " + i102 + "\n            "), new byte[][]{Text.ADAPTER.encode(new Text(string5, (TextStyle) null, (TextDecoration) null, (Color) null, (Image) null, 62))});
                                                    }
                                                } finally {
                                                    try {
                                                        throw th22222222222222222222222222222222222222222;
                                                    } finally {
                                                    }
                                                }
                                            }
                                            query2.close();
                                            return Unit.INSTANCE;
                                        case 6:
                                            ((SqlDriver) obj).getClass();
                                            query2 = frameworkSQLiteDatabase2.query(new CallResult("SELECT entity_id, customer_token, family_account FROM familyAccount"));
                                            while (query2.moveToNext()) {
                                                try {
                                                    String string6 = query2.getString(0);
                                                    byte[] blob5 = query2.isNull(2) ? null : query2.getBlob(2);
                                                    if (blob5 != null) {
                                                        UiFamilyAccount uiFamilyAccount = (UiFamilyAccount) UiFamilyAccount.ADAPTER.decode(blob5);
                                                        Object[] objArr = new Serializable[3];
                                                        objArr[0] = string6;
                                                        FamilyAccount familyAccount = uiFamilyAccount.family_account;
                                                        BrandCollectionDataKt brandCollectionDataKt = familyAccount != null ? familyAccount.f1246type : null;
                                                        FamilyAccount$Type$Dependent familyAccount$Type$Dependent = brandCollectionDataKt instanceof FamilyAccount$Type$Dependent ? (FamilyAccount$Type$Dependent) brandCollectionDataKt : null;
                                                        objArr[1] = (familyAccount$Type$Dependent == null || (dependent = familyAccount$Type$Dependent.value) == null) ? null : Dependent.ADAPTER.encode(dependent);
                                                        FamilyAccount familyAccount2 = uiFamilyAccount.family_account;
                                                        BrandCollectionDataKt brandCollectionDataKt2 = familyAccount2 != null ? familyAccount2.f1246type : null;
                                                        FamilyAccount$Type$Sponsor familyAccount$Type$Sponsor = brandCollectionDataKt2 instanceof FamilyAccount$Type$Sponsor ? (FamilyAccount$Type$Sponsor) brandCollectionDataKt2 : null;
                                                        objArr[2] = (familyAccount$Type$Sponsor == null || (sponsor = familyAccount$Type$Sponsor.value) == null) ? null : Sponsor.ADAPTER.encode(sponsor);
                                                        frameworkSQLiteDatabase2.delegate.execSQL("INSERT INTO family_account(entity_id, dependent, sponsor)\nVALUES (?, ?, ?)", objArr);
                                                    }
                                                } catch (Throwable th222222222222222222222222222222222222222222) {
                                                    try {
                                                        throw th222222222222222222222222222222222222222222;
                                                    } finally {
                                                    }
                                                }
                                            }
                                            query2.close();
                                            return Unit.INSTANCE;
                                        case 7:
                                            ((SqlDriver) obj).getClass();
                                            CashAccountDatabaseCallback.createColumnIfNotExists(frameworkSQLiteDatabase2, "inAppNotificationMessage", "avatar", "BLOB", null);
                                            return Unit.INSTANCE;
                                        case 8:
                                            SQLiteDatabase sQLiteDatabase3 = frameworkSQLiteDatabase2.delegate;
                                            ((SqlDriver) obj).getClass();
                                            query2 = frameworkSQLiteDatabase2.query(new CallResult("SELECT entity_id, entity FROM sync_entity"));
                                            while (query2.moveToNext()) {
                                                try {
                                                    String string7 = query2.getString(0);
                                                    byte[] blob6 = query2.isNull(1) ? null : query2.getBlob(1);
                                                    if (blob6 != null && (syncEntity = (SyncEntity) SyncEntity.ADAPTER.decode(blob6)) != null) {
                                                        Long l2 = syncEntity.version;
                                                        sQLiteDatabase3.execSQL("UPDATE sync_entity \nSET \n  sync_entity_version = ?\nWHERE entity_id = ?", new Object[]{l2, string7});
                                                        if (syncEntity.payment != null) {
                                                            sQLiteDatabase3.execSQL("UPDATE payment\nSET \n  sync_entity_version = ?\nWHERE entity_id = ?", new Object[]{l2, string7});
                                                        }
                                                    }
                                                } finally {
                                                    try {
                                                        throw th222222222222222222222222222222222222222222;
                                                    } finally {
                                                    }
                                                }
                                            }
                                            query2.close();
                                            return Unit.INSTANCE;
                                        case 9:
                                            ((SqlDriver) obj).getClass();
                                            query2 = frameworkSQLiteDatabase2.query(new CallResult("SELECT entity_id, entity_type, entity FROM unhandled_sync_entity"));
                                            while (query2.moveToNext()) {
                                                try {
                                                    String string8 = query2.getString(0);
                                                    int i112 = query2.getInt(1);
                                                    byte[] blob7 = query2.isNull(2) ? null : query2.getBlob(2);
                                                    if (blob7 != null && (syncEntity2 = (SyncEntity) SyncEntity.ADAPTER.decode(blob7)) != null) {
                                                        frameworkSQLiteDatabase2.delegate.execSQL("UPDATE unhandled_sync_entity\nSET\n  entity_version = ?\nWHERE entity_id = ? AND entity_type = ?", new Object[]{syncEntity2.version, string8, Integer.valueOf(i112)});
                                                    }
                                                } finally {
                                                    try {
                                                        throw th222222222222222222222222222222222222222222;
                                                    } finally {
                                                    }
                                                }
                                            }
                                            query2.close();
                                            return Unit.INSTANCE;
                                        case 10:
                                            ((SqlDriver) obj).getClass();
                                            query2 = frameworkSQLiteDatabase2.query(new CallResult("SELECT entity_id, entity, entity_processor_version, sync_value_type, sync_entity_version\nFROM sync_entity"));
                                            while (query2.moveToNext()) {
                                                try {
                                                    String string9 = query2.getString(0);
                                                    byte[] blob8 = query2.isNull(1) ? null : query2.getBlob(1);
                                                    if (blob8 != null && (syncEntity3 = (SyncEntity) SyncEntity.ADAPTER.decode(blob8)) != null) {
                                                        frameworkSQLiteDatabase2.delegate.execSQL("INSERT OR REPLACE INTO new_sync_entity\nVALUES (?, ?, ?, ?, ?, ?);", new Serializable[]{string9, Long.valueOf(EntitySyncerKt.rawEntityType(syncEntity3)), blob8, query2.isNull(2) ? null : Long.valueOf(query2.getLong(2)), query2.isNull(3) ? null : Long.valueOf(query2.getLong(3)), query2.isNull(4) ? null : Long.valueOf(query2.getLong(4))});
                                                    }
                                                } finally {
                                                    try {
                                                        throw th222222222222222222222222222222222222222222;
                                                    } finally {
                                                    }
                                                }
                                            }
                                            query2.close();
                                            return Unit.INSTANCE;
                                        case 11:
                                            ((SqlDriver) obj).getClass();
                                            CashAccountDatabaseCallback.restoreEntityProcessorVersionColumn(frameworkSQLiteDatabase2);
                                            return Unit.INSTANCE;
                                        case 12:
                                            ((SqlDriver) obj).getClass();
                                            CashAccountDatabaseCallback.restoreEntityProcessorVersionColumn(frameworkSQLiteDatabase2);
                                            return Unit.INSTANCE;
                                        default:
                                            ((SqlDriver) obj).getClass();
                                            query2 = frameworkSQLiteDatabase2.query(new CallResult("SELECT entity_id, entity FROM sync_entity WHERE type = 2"));
                                            while (query2.moveToNext()) {
                                                try {
                                                    byte[] blob9 = query2.isNull(1) ? null : query2.getBlob(1);
                                                    if (blob9 != null && (syncEntity4 = (SyncEntity) SyncEntity.ADAPTER.decode(blob9)) != null && (syncCustomer = syncEntity4.customer) != null && (uiCustomer = syncCustomer.customer) != null) {
                                                        frameworkSQLiteDatabase2.delegate.execSQL("UPDATE customer SET is_special_customer = ? WHERE customer_id = ?", new Object[]{Long.valueOf(Intrinsics.areEqual(uiCustomer.is_special_customer, Boolean.TRUE) ? 1L : 0L), uiCustomer.id});
                                                    }
                                                } finally {
                                                }
                                            }
                                            query2.close();
                                            return Unit.INSTANCE;
                                    }
                                }
                            });
                            final int i21 = 3;
                            AfterVersion afterVersion19 = new AfterVersion(782L, new Function1(this) { // from class: com.squareup.cash.db.CashAccountDatabaseCallback$$ExternalSyntheticLambda4
                                public final /* synthetic */ CashAccountDatabaseCallback f$0;

                                {
                                    this.f$0 = this;
                                }

                                /* JADX WARN: Finally extract failed */
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    Cursor query2;
                                    String str;
                                    SyncEntity syncEntity;
                                    ErrorFeature.ClientSync clientSync;
                                    ErrorFeature.Persistence persistence;
                                    int i172;
                                    int i182;
                                    Throwable th;
                                    int i192;
                                    int i202;
                                    SyncEntity syncEntity2;
                                    int i212 = i21;
                                    ErrorFeature.Persistence persistence2 = ErrorFeature.Persistence.INSTANCE;
                                    String str2 = "entityId=";
                                    ErrorReporter.DefaultSamplingStrategy defaultSamplingStrategy = ErrorReporter.DefaultSamplingStrategy.INSTANCE;
                                    ErrorFeature.ClientSync clientSync2 = ErrorFeature.ClientSync.INSTANCE;
                                    FrameworkSQLiteDatabase frameworkSQLiteDatabase2 = frameworkSQLiteDatabase;
                                    CashAccountDatabaseCallback cashAccountDatabaseCallback2 = this.f$0;
                                    int i22 = 2;
                                    int i23 = 1;
                                    int i24 = 0;
                                    switch (i212) {
                                        case 0:
                                            SQLiteDatabase sQLiteDatabase2 = frameworkSQLiteDatabase2.delegate;
                                            ((SqlDriver) obj).getClass();
                                            ErrorReporter errorReporter = cashAccountDatabaseCallback2.errorReporter;
                                            try {
                                                sQLiteDatabase2.execSQL("INSERT INTO sync_entity (entity_id, type, entity, sync_entity_version, sync_value_type, entity_processor_version)\nSELECT entity_id, entity_type, entity, entity_version, NULL, entity_processor_version\nFROM unhandled_sync_entity");
                                            } catch (SQLException e) {
                                                e = e;
                                                Timber.Forest forest = Timber.Forest;
                                                int i25 = i;
                                                int i26 = i2;
                                                forest.e(Recorder$$ExternalSyntheticOutline2.m(i25, i26, "Failure migrating from ", " to ", " at `migrateUnhandledEntitiesToHandledEntitiesTable`"), new Object[0], e);
                                                try {
                                                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                                                    query2 = frameworkSQLiteDatabase2.query(new CallResult("SELECT entity_id, entity_type, entity_version, entity_processor_version\nFROM unhandled_sync_entity"));
                                                    int i27 = 0;
                                                    while (query2.moveToNext()) {
                                                        try {
                                                            String string2 = query2.getString(0);
                                                            Long valueOf = query2.isNull(1) ? null : Long.valueOf(query2.getLong(1));
                                                            Long valueOf2 = query2.isNull(2) ? null : Long.valueOf(query2.getLong(2));
                                                            Long valueOf3 = query2.isNull(3) ? null : Long.valueOf(query2.getLong(3));
                                                            String valueOf4 = String.valueOf(i27);
                                                            StringBuilder sb = new StringBuilder();
                                                            SQLException sQLException = e;
                                                            sb.append("ID:");
                                                            sb.append(string2);
                                                            sb.append(" Type: ");
                                                            sb.append(valueOf);
                                                            sb.append("; Version: ");
                                                            sb.append(valueOf2);
                                                            sb.append(" ProcessorVersion: ");
                                                            sb.append(valueOf3);
                                                            linkedHashMap.put(valueOf4, sb.toString());
                                                            i27++;
                                                            e = sQLException;
                                                        } finally {
                                                        }
                                                    }
                                                    SQLException sQLException2 = e;
                                                    query2.close();
                                                    errorReporter.report(new DatabaseMigrationError(i25, i26, "migrateUnhandledEntitiesToHandledEntitiesTable", sQLException2, MapsKt__MapsJVMKt.mapOf(new Pair("Client Sync", linkedHashMap)), ArraysKt___ArraysKt.toSet(new ErrorFeature[]{persistence2, clientSync2}), 64), defaultSamplingStrategy);
                                                    sQLiteDatabase2.execSQL("INSERT OR IGNORE INTO sync_entity (entity_id, type, entity, sync_entity_version, sync_value_type, entity_processor_version)\nSELECT entity_id, entity_type, entity, entity_version, NULL, entity_processor_version\nFROM unhandled_sync_entity");
                                                } catch (Throwable th2) {
                                                    errorReporter.report(new DatabaseError(th2.getMessage(), th2), defaultSamplingStrategy);
                                                }
                                            }
                                            return Unit.INSTANCE;
                                        case 1:
                                            String str3 = "entityId=";
                                            int i28 = i;
                                            int i29 = i2;
                                            ((SqlDriver) obj).getClass();
                                            query2 = frameworkSQLiteDatabase2.query(new CallResult("SELECT entity_id, entity\nFROM sync_entity\nWHERE type == 14 AND sync_value_type IS NULL;"));
                                            try {
                                                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                                                while (query2.moveToNext()) {
                                                    String string3 = query2.getString(0);
                                                    byte[] blob = query2.isNull(1) ? null : query2.getBlob(1);
                                                    if (blob == null || (syncEntity = (SyncEntity) SyncEntity.ADAPTER.decode(blob)) == null) {
                                                        str = str3;
                                                    } else {
                                                        frameworkSQLiteDatabase2.delegate.execSQL("UPDATE sync_entity\nSET sync_value_type = ?\nWHERE entity_id = ?;", new Object[]{StrictModes.getSyncValueTypeAsInt(syncEntity), string3});
                                                        StringBuilder sb2 = new StringBuilder();
                                                        str = str3;
                                                        sb2.append(str);
                                                        sb2.append(string3);
                                                        linkedHashMap2.put(string3, CollectionsKt.joinToString$default(CollectionsKt__CollectionsKt.listOf((Object[]) new String[]{sb2.toString(), "valueType=" + StrictModes.getSyncValueTypeAsInt(syncEntity)}), null, null, null, 0, null, null, 63));
                                                    }
                                                    str3 = str;
                                                }
                                                if (!linkedHashMap2.isEmpty()) {
                                                    cashAccountDatabaseCallback2.errorReporter.report(new DatabaseMigrationError(i28, i29, "repairSyncValueType", (Throwable) null, MapsKt__MapsJVMKt.mapOf(new Pair("Client Sync", linkedHashMap2)), SetsKt__SetsJVMKt.setOf(clientSync2), "Repaired entities with missing sync value types"), defaultSamplingStrategy);
                                                }
                                                query2.close();
                                                return Unit.INSTANCE;
                                            } catch (Throwable th3) {
                                                try {
                                                    throw th3;
                                                } finally {
                                                }
                                            }
                                        case 2:
                                            int i30 = i;
                                            int i31 = i2;
                                            ((SqlDriver) obj).getClass();
                                            ErrorReporter errorReporter2 = cashAccountDatabaseCallback2.errorReporter;
                                            try {
                                                try {
                                                    Cursor query3 = frameworkSQLiteDatabase2.query(new CallResult("SELECT entity_id, type, sync_value_type, sync_entity_version, entity_processor_version\nFROM sync_entity\nWHERE entity_processor_version IS NULL OR entity_processor_version != 31;"));
                                                    try {
                                                        if (query3.getCount() > 0) {
                                                            LinkedHashMap linkedHashMap3 = new LinkedHashMap();
                                                            int i32 = 0;
                                                            while (query3.moveToNext()) {
                                                                String string4 = query3.getString(0);
                                                                Long valueOf5 = query3.isNull(1) ? null : Long.valueOf(query3.getLong(1));
                                                                persistence = persistence2;
                                                                try {
                                                                    Long valueOf6 = query3.isNull(2) ? null : Long.valueOf(query3.getLong(2));
                                                                    i182 = i30;
                                                                    try {
                                                                        Long valueOf7 = query3.isNull(3) ? null : Long.valueOf(query3.getLong(3));
                                                                        clientSync = clientSync2;
                                                                        try {
                                                                            Long valueOf8 = query3.isNull(4) ? null : Long.valueOf(query3.getLong(4));
                                                                            int i33 = i32 + 1;
                                                                            String valueOf9 = String.valueOf(i32);
                                                                            i172 = i31;
                                                                            try {
                                                                                String str4 = str2 + string4;
                                                                                StringBuilder sb3 = new StringBuilder();
                                                                                String str5 = str2;
                                                                                sb3.append("entityType=");
                                                                                sb3.append(valueOf5);
                                                                                linkedHashMap3.put(valueOf9, CollectionsKt.joinToString$default(CollectionsKt__CollectionsKt.listOf((Object[]) new String[]{str4, sb3.toString(), "valueType=" + valueOf6, "entityVersion=" + valueOf7, "processorVersion=" + valueOf8}), null, null, null, 0, null, null, 63));
                                                                                i32 = i33;
                                                                                i30 = i182;
                                                                                i31 = i172;
                                                                                str2 = str5;
                                                                                persistence2 = persistence;
                                                                                clientSync2 = clientSync;
                                                                            } catch (Throwable th4) {
                                                                                th = th4;
                                                                                th = th;
                                                                                try {
                                                                                    throw th;
                                                                                } catch (Throwable th5) {
                                                                                    Utf8.closeFinally(query3, th);
                                                                                    throw th5;
                                                                                }
                                                                            }
                                                                        } catch (Throwable th6) {
                                                                            th = th6;
                                                                            i172 = i31;
                                                                            th = th;
                                                                            throw th;
                                                                        }
                                                                    } catch (Throwable th7) {
                                                                        th = th7;
                                                                        clientSync = clientSync2;
                                                                        i172 = i31;
                                                                        th = th;
                                                                        throw th;
                                                                    }
                                                                } catch (Throwable th8) {
                                                                    th = th8;
                                                                    i182 = i30;
                                                                    clientSync = clientSync2;
                                                                    i172 = i31;
                                                                    th = th;
                                                                    throw th;
                                                                }
                                                            }
                                                            persistence = persistence2;
                                                            i182 = i30;
                                                            clientSync = clientSync2;
                                                            i172 = i31;
                                                            errorReporter2.report(new DatabaseMigrationError(i182, i172, "detectMisprocessedEntities", (Throwable) null, MapsKt__MapsJVMKt.mapOf(new Pair("Client Sync", linkedHashMap3)), SetsKt__SetsJVMKt.setOf(clientSync), "Detected handled entities with invalid processor versions"), defaultSamplingStrategy);
                                                        }
                                                        query3.close();
                                                    } catch (Throwable th9) {
                                                        th = th9;
                                                        persistence = persistence2;
                                                    }
                                                } catch (Throwable th10) {
                                                    th = th10;
                                                    persistence = persistence2;
                                                    i182 = i30;
                                                    clientSync = clientSync2;
                                                    i172 = i31;
                                                    errorReporter2.report(new DatabaseMigrationError(i182, i172, "detectMisprocessedEntities", th, (Map) null, ArraysKt___ArraysKt.toSet(new ErrorFeature[]{clientSync, persistence}), 16), defaultSamplingStrategy);
                                                    return Unit.INSTANCE;
                                                }
                                            } catch (Throwable th11) {
                                                th = th11;
                                                errorReporter2.report(new DatabaseMigrationError(i182, i172, "detectMisprocessedEntities", th, (Map) null, ArraysKt___ArraysKt.toSet(new ErrorFeature[]{clientSync, persistence}), 16), defaultSamplingStrategy);
                                                return Unit.INSTANCE;
                                            }
                                            return Unit.INSTANCE;
                                        default:
                                            int i34 = i;
                                            int i35 = i2;
                                            ((SqlDriver) obj).getClass();
                                            query2 = frameworkSQLiteDatabase2.query(new CallResult("SELECT entity_id, entity, sync_entity_version, entity_processor_version\nFROM sync_entity;"));
                                            try {
                                                LinkedHashMap linkedHashMap4 = new LinkedHashMap();
                                                while (query2.moveToNext()) {
                                                    String string5 = query2.getString(i24);
                                                    byte[] blob2 = query2.isNull(i23) ? null : query2.getBlob(i23);
                                                    if (blob2 == null || (syncEntity2 = (SyncEntity) SyncEntity.ADAPTER.decode(blob2)) == null) {
                                                        i192 = i34;
                                                        i202 = i35;
                                                    } else {
                                                        Long l = syncEntity2.version;
                                                        Long valueOf10 = query2.isNull(i22) ? null : Long.valueOf(query2.getLong(i22));
                                                        Long valueOf11 = query2.isNull(3) ? null : Long.valueOf(query2.getLong(3));
                                                        if (Intrinsics.areEqual(l, valueOf10)) {
                                                            i24 = 0;
                                                            i22 = 2;
                                                            i23 = 1;
                                                        } else {
                                                            i192 = i34;
                                                            i202 = i35;
                                                            frameworkSQLiteDatabase2.delegate.execSQL("UPDATE sync_entity\nSET sync_entity_version = ?, entity_processor_version = ?\nWHERE entity_id = ?;", new Object[]{l, valueOf10, string5});
                                                            linkedHashMap4.put(string5, CollectionsKt.joinToString$default(CollectionsKt__CollectionsKt.listOf((Object[]) new String[]{"entityId=" + string5, "entityVersion=" + valueOf10, "processorVersion=" + valueOf11}), null, null, null, 0, null, null, 63));
                                                        }
                                                    }
                                                    i34 = i192;
                                                    i35 = i202;
                                                    i24 = 0;
                                                    i22 = 2;
                                                    i23 = 1;
                                                }
                                                int i36 = i34;
                                                int i37 = i35;
                                                if (!linkedHashMap4.isEmpty()) {
                                                    cashAccountDatabaseCallback2.errorReporter.report(new DatabaseMigrationError(i36, i37, "repairEntityAndProcessorVersions", (Throwable) null, MapsKt__MapsJVMKt.mapOf(new Pair("Client Sync", linkedHashMap4)), SetsKt__SetsJVMKt.setOf(clientSync2), "Repaired entities with incorrect entity and processor versions"), defaultSamplingStrategy);
                                                }
                                                query2.close();
                                                return Unit.INSTANCE;
                                            } finally {
                                            }
                                    }
                                }
                            });
                            final int i22 = 1;
                            schema.migrate(androidSqliteDriver, j, j2, new AfterVersion[]{afterVersion, afterVersion2, afterVersion3, afterVersion4, afterVersion5, afterVersion6, afterVersion7, afterVersion8, afterVersion9, afterVersion10, afterVersion11, afterVersion12, afterVersion13, afterVersion14, afterVersion15, afterVersion16, afterVersion17, afterVersion18, afterVersion19, new AfterVersion(783L, new Function1(this) { // from class: com.squareup.cash.db.CashAccountDatabaseCallback$$ExternalSyntheticLambda4
                                public final /* synthetic */ CashAccountDatabaseCallback f$0;

                                {
                                    this.f$0 = this;
                                }

                                /* JADX WARN: Finally extract failed */
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    Cursor query2;
                                    String str;
                                    SyncEntity syncEntity;
                                    ErrorFeature.ClientSync clientSync;
                                    ErrorFeature.Persistence persistence;
                                    int i172;
                                    int i182;
                                    Throwable th;
                                    int i192;
                                    int i202;
                                    SyncEntity syncEntity2;
                                    int i212 = i22;
                                    ErrorFeature.Persistence persistence2 = ErrorFeature.Persistence.INSTANCE;
                                    String str2 = "entityId=";
                                    ErrorReporter.DefaultSamplingStrategy defaultSamplingStrategy = ErrorReporter.DefaultSamplingStrategy.INSTANCE;
                                    ErrorFeature.ClientSync clientSync2 = ErrorFeature.ClientSync.INSTANCE;
                                    FrameworkSQLiteDatabase frameworkSQLiteDatabase2 = frameworkSQLiteDatabase;
                                    CashAccountDatabaseCallback cashAccountDatabaseCallback2 = this.f$0;
                                    int i222 = 2;
                                    int i23 = 1;
                                    int i24 = 0;
                                    switch (i212) {
                                        case 0:
                                            SQLiteDatabase sQLiteDatabase2 = frameworkSQLiteDatabase2.delegate;
                                            ((SqlDriver) obj).getClass();
                                            ErrorReporter errorReporter = cashAccountDatabaseCallback2.errorReporter;
                                            try {
                                                sQLiteDatabase2.execSQL("INSERT INTO sync_entity (entity_id, type, entity, sync_entity_version, sync_value_type, entity_processor_version)\nSELECT entity_id, entity_type, entity, entity_version, NULL, entity_processor_version\nFROM unhandled_sync_entity");
                                            } catch (SQLException e) {
                                                e = e;
                                                Timber.Forest forest = Timber.Forest;
                                                int i25 = i;
                                                int i26 = i2;
                                                forest.e(Recorder$$ExternalSyntheticOutline2.m(i25, i26, "Failure migrating from ", " to ", " at `migrateUnhandledEntitiesToHandledEntitiesTable`"), new Object[0], e);
                                                try {
                                                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                                                    query2 = frameworkSQLiteDatabase2.query(new CallResult("SELECT entity_id, entity_type, entity_version, entity_processor_version\nFROM unhandled_sync_entity"));
                                                    int i27 = 0;
                                                    while (query2.moveToNext()) {
                                                        try {
                                                            String string2 = query2.getString(0);
                                                            Long valueOf = query2.isNull(1) ? null : Long.valueOf(query2.getLong(1));
                                                            Long valueOf2 = query2.isNull(2) ? null : Long.valueOf(query2.getLong(2));
                                                            Long valueOf3 = query2.isNull(3) ? null : Long.valueOf(query2.getLong(3));
                                                            String valueOf4 = String.valueOf(i27);
                                                            StringBuilder sb = new StringBuilder();
                                                            SQLException sQLException = e;
                                                            sb.append("ID:");
                                                            sb.append(string2);
                                                            sb.append(" Type: ");
                                                            sb.append(valueOf);
                                                            sb.append("; Version: ");
                                                            sb.append(valueOf2);
                                                            sb.append(" ProcessorVersion: ");
                                                            sb.append(valueOf3);
                                                            linkedHashMap.put(valueOf4, sb.toString());
                                                            i27++;
                                                            e = sQLException;
                                                        } finally {
                                                        }
                                                    }
                                                    SQLException sQLException2 = e;
                                                    query2.close();
                                                    errorReporter.report(new DatabaseMigrationError(i25, i26, "migrateUnhandledEntitiesToHandledEntitiesTable", sQLException2, MapsKt__MapsJVMKt.mapOf(new Pair("Client Sync", linkedHashMap)), ArraysKt___ArraysKt.toSet(new ErrorFeature[]{persistence2, clientSync2}), 64), defaultSamplingStrategy);
                                                    sQLiteDatabase2.execSQL("INSERT OR IGNORE INTO sync_entity (entity_id, type, entity, sync_entity_version, sync_value_type, entity_processor_version)\nSELECT entity_id, entity_type, entity, entity_version, NULL, entity_processor_version\nFROM unhandled_sync_entity");
                                                } catch (Throwable th2) {
                                                    errorReporter.report(new DatabaseError(th2.getMessage(), th2), defaultSamplingStrategy);
                                                }
                                            }
                                            return Unit.INSTANCE;
                                        case 1:
                                            String str3 = "entityId=";
                                            int i28 = i;
                                            int i29 = i2;
                                            ((SqlDriver) obj).getClass();
                                            query2 = frameworkSQLiteDatabase2.query(new CallResult("SELECT entity_id, entity\nFROM sync_entity\nWHERE type == 14 AND sync_value_type IS NULL;"));
                                            try {
                                                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                                                while (query2.moveToNext()) {
                                                    String string3 = query2.getString(0);
                                                    byte[] blob = query2.isNull(1) ? null : query2.getBlob(1);
                                                    if (blob == null || (syncEntity = (SyncEntity) SyncEntity.ADAPTER.decode(blob)) == null) {
                                                        str = str3;
                                                    } else {
                                                        frameworkSQLiteDatabase2.delegate.execSQL("UPDATE sync_entity\nSET sync_value_type = ?\nWHERE entity_id = ?;", new Object[]{StrictModes.getSyncValueTypeAsInt(syncEntity), string3});
                                                        StringBuilder sb2 = new StringBuilder();
                                                        str = str3;
                                                        sb2.append(str);
                                                        sb2.append(string3);
                                                        linkedHashMap2.put(string3, CollectionsKt.joinToString$default(CollectionsKt__CollectionsKt.listOf((Object[]) new String[]{sb2.toString(), "valueType=" + StrictModes.getSyncValueTypeAsInt(syncEntity)}), null, null, null, 0, null, null, 63));
                                                    }
                                                    str3 = str;
                                                }
                                                if (!linkedHashMap2.isEmpty()) {
                                                    cashAccountDatabaseCallback2.errorReporter.report(new DatabaseMigrationError(i28, i29, "repairSyncValueType", (Throwable) null, MapsKt__MapsJVMKt.mapOf(new Pair("Client Sync", linkedHashMap2)), SetsKt__SetsJVMKt.setOf(clientSync2), "Repaired entities with missing sync value types"), defaultSamplingStrategy);
                                                }
                                                query2.close();
                                                return Unit.INSTANCE;
                                            } catch (Throwable th3) {
                                                try {
                                                    throw th3;
                                                } finally {
                                                }
                                            }
                                        case 2:
                                            int i30 = i;
                                            int i31 = i2;
                                            ((SqlDriver) obj).getClass();
                                            ErrorReporter errorReporter2 = cashAccountDatabaseCallback2.errorReporter;
                                            try {
                                                try {
                                                    Cursor query3 = frameworkSQLiteDatabase2.query(new CallResult("SELECT entity_id, type, sync_value_type, sync_entity_version, entity_processor_version\nFROM sync_entity\nWHERE entity_processor_version IS NULL OR entity_processor_version != 31;"));
                                                    try {
                                                        if (query3.getCount() > 0) {
                                                            LinkedHashMap linkedHashMap3 = new LinkedHashMap();
                                                            int i32 = 0;
                                                            while (query3.moveToNext()) {
                                                                String string4 = query3.getString(0);
                                                                Long valueOf5 = query3.isNull(1) ? null : Long.valueOf(query3.getLong(1));
                                                                persistence = persistence2;
                                                                try {
                                                                    Long valueOf6 = query3.isNull(2) ? null : Long.valueOf(query3.getLong(2));
                                                                    i182 = i30;
                                                                    try {
                                                                        Long valueOf7 = query3.isNull(3) ? null : Long.valueOf(query3.getLong(3));
                                                                        clientSync = clientSync2;
                                                                        try {
                                                                            Long valueOf8 = query3.isNull(4) ? null : Long.valueOf(query3.getLong(4));
                                                                            int i33 = i32 + 1;
                                                                            String valueOf9 = String.valueOf(i32);
                                                                            i172 = i31;
                                                                            try {
                                                                                String str4 = str2 + string4;
                                                                                StringBuilder sb3 = new StringBuilder();
                                                                                String str5 = str2;
                                                                                sb3.append("entityType=");
                                                                                sb3.append(valueOf5);
                                                                                linkedHashMap3.put(valueOf9, CollectionsKt.joinToString$default(CollectionsKt__CollectionsKt.listOf((Object[]) new String[]{str4, sb3.toString(), "valueType=" + valueOf6, "entityVersion=" + valueOf7, "processorVersion=" + valueOf8}), null, null, null, 0, null, null, 63));
                                                                                i32 = i33;
                                                                                i30 = i182;
                                                                                i31 = i172;
                                                                                str2 = str5;
                                                                                persistence2 = persistence;
                                                                                clientSync2 = clientSync;
                                                                            } catch (Throwable th4) {
                                                                                th = th4;
                                                                                th = th;
                                                                                try {
                                                                                    throw th;
                                                                                } catch (Throwable th5) {
                                                                                    Utf8.closeFinally(query3, th);
                                                                                    throw th5;
                                                                                }
                                                                            }
                                                                        } catch (Throwable th6) {
                                                                            th = th6;
                                                                            i172 = i31;
                                                                            th = th;
                                                                            throw th;
                                                                        }
                                                                    } catch (Throwable th7) {
                                                                        th = th7;
                                                                        clientSync = clientSync2;
                                                                        i172 = i31;
                                                                        th = th;
                                                                        throw th;
                                                                    }
                                                                } catch (Throwable th8) {
                                                                    th = th8;
                                                                    i182 = i30;
                                                                    clientSync = clientSync2;
                                                                    i172 = i31;
                                                                    th = th;
                                                                    throw th;
                                                                }
                                                            }
                                                            persistence = persistence2;
                                                            i182 = i30;
                                                            clientSync = clientSync2;
                                                            i172 = i31;
                                                            errorReporter2.report(new DatabaseMigrationError(i182, i172, "detectMisprocessedEntities", (Throwable) null, MapsKt__MapsJVMKt.mapOf(new Pair("Client Sync", linkedHashMap3)), SetsKt__SetsJVMKt.setOf(clientSync), "Detected handled entities with invalid processor versions"), defaultSamplingStrategy);
                                                        }
                                                        query3.close();
                                                    } catch (Throwable th9) {
                                                        th = th9;
                                                        persistence = persistence2;
                                                    }
                                                } catch (Throwable th10) {
                                                    th = th10;
                                                    persistence = persistence2;
                                                    i182 = i30;
                                                    clientSync = clientSync2;
                                                    i172 = i31;
                                                    errorReporter2.report(new DatabaseMigrationError(i182, i172, "detectMisprocessedEntities", th, (Map) null, ArraysKt___ArraysKt.toSet(new ErrorFeature[]{clientSync, persistence}), 16), defaultSamplingStrategy);
                                                    return Unit.INSTANCE;
                                                }
                                            } catch (Throwable th11) {
                                                th = th11;
                                                errorReporter2.report(new DatabaseMigrationError(i182, i172, "detectMisprocessedEntities", th, (Map) null, ArraysKt___ArraysKt.toSet(new ErrorFeature[]{clientSync, persistence}), 16), defaultSamplingStrategy);
                                                return Unit.INSTANCE;
                                            }
                                            return Unit.INSTANCE;
                                        default:
                                            int i34 = i;
                                            int i35 = i2;
                                            ((SqlDriver) obj).getClass();
                                            query2 = frameworkSQLiteDatabase2.query(new CallResult("SELECT entity_id, entity, sync_entity_version, entity_processor_version\nFROM sync_entity;"));
                                            try {
                                                LinkedHashMap linkedHashMap4 = new LinkedHashMap();
                                                while (query2.moveToNext()) {
                                                    String string5 = query2.getString(i24);
                                                    byte[] blob2 = query2.isNull(i23) ? null : query2.getBlob(i23);
                                                    if (blob2 == null || (syncEntity2 = (SyncEntity) SyncEntity.ADAPTER.decode(blob2)) == null) {
                                                        i192 = i34;
                                                        i202 = i35;
                                                    } else {
                                                        Long l = syncEntity2.version;
                                                        Long valueOf10 = query2.isNull(i222) ? null : Long.valueOf(query2.getLong(i222));
                                                        Long valueOf11 = query2.isNull(3) ? null : Long.valueOf(query2.getLong(3));
                                                        if (Intrinsics.areEqual(l, valueOf10)) {
                                                            i24 = 0;
                                                            i222 = 2;
                                                            i23 = 1;
                                                        } else {
                                                            i192 = i34;
                                                            i202 = i35;
                                                            frameworkSQLiteDatabase2.delegate.execSQL("UPDATE sync_entity\nSET sync_entity_version = ?, entity_processor_version = ?\nWHERE entity_id = ?;", new Object[]{l, valueOf10, string5});
                                                            linkedHashMap4.put(string5, CollectionsKt.joinToString$default(CollectionsKt__CollectionsKt.listOf((Object[]) new String[]{"entityId=" + string5, "entityVersion=" + valueOf10, "processorVersion=" + valueOf11}), null, null, null, 0, null, null, 63));
                                                        }
                                                    }
                                                    i34 = i192;
                                                    i35 = i202;
                                                    i24 = 0;
                                                    i222 = 2;
                                                    i23 = 1;
                                                }
                                                int i36 = i34;
                                                int i37 = i35;
                                                if (!linkedHashMap4.isEmpty()) {
                                                    cashAccountDatabaseCallback2.errorReporter.report(new DatabaseMigrationError(i36, i37, "repairEntityAndProcessorVersions", (Throwable) null, MapsKt__MapsJVMKt.mapOf(new Pair("Client Sync", linkedHashMap4)), SetsKt__SetsJVMKt.setOf(clientSync2), "Repaired entities with incorrect entity and processor versions"), defaultSamplingStrategy);
                                                }
                                                query2.close();
                                                return Unit.INSTANCE;
                                            } finally {
                                            }
                                    }
                                }
                            })});
                            sQLiteDatabase.execSQL("PRAGMA legacy_alter_table=OFF;");
                        } catch (Throwable th) {
                            th = th;
                            i3 = i;
                            i4 = i2;
                            cashAccountDatabaseCallback.errorReporter.report(new DatabaseError(Recorder$$ExternalSyntheticOutline2.m("Failed to upgrade database from ", i3, i4, " to "), th), ErrorReporter.DefaultSamplingStrategy.INSTANCE);
                            throw th;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        cashAccountDatabaseCallback = this;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    cashAccountDatabaseCallback = this;
                }
            } catch (Throwable th4) {
                th = th4;
            }
        } catch (Throwable th5) {
            th = th5;
            cashAccountDatabaseCallback.errorReporter.report(new DatabaseError(Recorder$$ExternalSyntheticOutline2.m("Failed to upgrade database from ", i3, i4, " to "), th), ErrorReporter.DefaultSamplingStrategy.INSTANCE);
            throw th;
        }
    }
}
