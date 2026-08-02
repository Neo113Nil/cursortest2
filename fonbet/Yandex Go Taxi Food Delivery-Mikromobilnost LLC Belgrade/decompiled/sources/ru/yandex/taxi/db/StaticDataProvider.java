package ru.yandex.taxi.db;

import android.content.ContentProvider;
import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteQueryBuilder;
import android.net.Uri;
import com.yandex.go.sql.DatabaseHelper;
import com.ybsdk.feature.webview.internal.browser.LaunchBrowserActivity;
import defpackage.c3u0;
import defpackage.h6r;
import defpackage.i3y;
import defpackage.ny61;
import defpackage.qie;
import defpackage.rie;
import defpackage.unr0;
import defpackage.wwg;
import defpackage.zzf;
import kotlin.Metadata;
import kotlin.a;
import kotlin.text.Regex;

@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ1\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u000f\u001a\u0004\u0018\u00010\u00062\u000e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0015\u0010\bJ!\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJK\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u0005\u001a\u00020\u00042\u000e\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u00062\u000e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00102\b\u0010\u001c\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ;\u0010 \u001a\u00020\u00122\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00062\u000e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0010H\u0016¢\u0006\u0004\b \u0010!R\u0018\u0010#\u001a\u0004\u0018\u00010\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010$R\u001b\u0010*\u001a\u00020%8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R\u0014\u0010.\u001a\u00020+8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b,\u0010-R\u0014\u00102\u001a\u00020/8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b0\u00101¨\u00063"}, d2 = {"Lru/yandex/taxi/db/StaticDataProvider;", "Landroid/content/ContentProvider;", "<init>", "()V", "Landroid/net/Uri;", LaunchBrowserActivity.KEY_URI, "", "getTableName", "(Landroid/net/Uri;)Ljava/lang/String;", "table", "Landroid/content/ContentValues;", "values", "", "insertRow", "(Ljava/lang/String;Landroid/content/ContentValues;)J", "selection", "", "selectionArgs", "", "delete", "(Landroid/net/Uri;Ljava/lang/String;[Ljava/lang/String;)I", "getType", "insert", "(Landroid/net/Uri;Landroid/content/ContentValues;)Landroid/net/Uri;", "", "onCreate", "()Z", "projection", "sortOrder", "Landroid/database/Cursor;", "query", "(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;", "update", "(Landroid/net/Uri;Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I", "Lcom/yandex/go/sql/DatabaseHelper;", "openHelper", "Lcom/yandex/go/sql/DatabaseHelper;", "Lkotlin/text/Regex;", "nonDigitRegex$delegate", "Li3y;", "getNonDigitRegex", "()Lkotlin/text/Regex;", "nonDigitRegex", "Landroid/content/ContentResolver;", "getContentResolver", "()Landroid/content/ContentResolver;", "contentResolver", "Lqie;", "getContentUriRepository", "()Lqie;", "contentUriRepository", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class StaticDataProvider extends ContentProvider {

    /* renamed from: nonDigitRegex$delegate, reason: from kotlin metadata */
    private final i3y nonDigitRegex = a.a(new c3u0(4));
    private DatabaseHelper openHelper;

    private final ContentResolver getContentResolver() {
        Context context = getContext();
        if (context != null) {
            return context.getContentResolver();
        }
        ny61.r("Try to access to content resolver without attached context");
        return null;
    }

    private final qie getContentUriRepository() {
        Context context = getContext();
        if (context != null) {
            return (qie) ((zzf) ((h6r) wwg.e(context, h6r.class))).p0.get();
        }
        ny61.r("Try to access content uri repository without attached context");
        return null;
    }

    private final Regex getNonDigitRegex() {
        return (Regex) this.nonDigitRegex.getValue();
    }

    private final String getTableName(Uri uri) {
        int match = ((rie) getContentUriRepository()).d.match(uri);
        if (match == 17) {
            return "excluded_parks";
        }
        switch (match) {
            case 25:
                return "geofences_v2";
            case 26:
                return "orderchat";
            case 27:
                return "orderchat_pending";
            case 28:
                return "geofences_bans";
            case 29:
                return "brandings";
            case 30:
                return "zero_km";
            default:
                ny61.g(unr0.n(uri, "Unknown URI "));
                return null;
        }
    }

    private final long insertRow(String table, ContentValues values) {
        SQLiteDatabase writableDatabase;
        DatabaseHelper databaseHelper = this.openHelper;
        if (databaseHelper != null && (writableDatabase = databaseHelper.getWritableDatabase()) != null) {
            return writableDatabase.insert(table, table, values);
        }
        ny61.r("DatabaseHelper not initialized");
        return 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Regex nonDigitRegex_delegate$lambda$0() {
        return new Regex("\\D*");
    }

    @Override // android.content.ContentProvider
    public int delete(Uri uri, String selection, String[] selectionArgs) {
        SQLiteDatabase writableDatabase;
        DatabaseHelper databaseHelper = this.openHelper;
        if (databaseHelper == null || (writableDatabase = databaseHelper.getWritableDatabase()) == null) {
            ny61.r("DatabaseHelper not initialized");
            return 0;
        }
        int delete = writableDatabase.delete(getTableName(uri), selection, selectionArgs);
        getContentResolver().notifyChange(uri, null);
        return delete;
    }

    @Override // android.content.ContentProvider
    public String getType(Uri uri) {
        return null;
    }

    @Override // android.content.ContentProvider
    public Uri insert(Uri uri, ContentValues values) {
        if (values == null) {
            values = new ContentValues();
        }
        long insertRow = insertRow(getTableName(uri), values);
        if (insertRow == -1) {
            throw new SQLException(unr0.n(uri, "Failed to insert row into "));
        }
        return Uri.parse("/" + insertRow);
    }

    @Override // android.content.ContentProvider
    public boolean onCreate() {
        Context context = getContext();
        if (context != null) {
            this.openHelper = new DatabaseHelper(context);
            return true;
        }
        ny61.r("ContentProvider created without context");
        return false;
    }

    @Override // android.content.ContentProvider
    public Cursor query(Uri uri, String[] projection, String selection, String[] selectionArgs, String sortOrder) {
        SQLiteDatabase readableDatabase;
        DatabaseHelper databaseHelper = this.openHelper;
        if (databaseHelper == null || (readableDatabase = databaseHelper.getReadableDatabase()) == null) {
            ny61.r("DatabaseHelper not initialized");
            return null;
        }
        SQLiteQueryBuilder sQLiteQueryBuilder = new SQLiteQueryBuilder();
        String queryParameter = uri.getQueryParameter("limit");
        String j = queryParameter != null ? getNonDigitRegex().j(queryParameter, "") : "";
        sQLiteQueryBuilder.setTables(getTableName(uri));
        Cursor query = sQLiteQueryBuilder.query(readableDatabase, projection, selection, selectionArgs, null, null, sortOrder, j);
        query.setNotificationUri(getContentResolver(), uri);
        return query;
    }

    @Override // android.content.ContentProvider
    public int update(Uri uri, ContentValues values, String selection, String[] selectionArgs) {
        SQLiteDatabase writableDatabase;
        DatabaseHelper databaseHelper = this.openHelper;
        if (databaseHelper == null || (writableDatabase = databaseHelper.getWritableDatabase()) == null) {
            ny61.r("DatabaseHelper not initialized");
            return 0;
        }
        int update = writableDatabase.update(getTableName(uri), values, selection, selectionArgs);
        getContentResolver().notifyChange(uri, null);
        return update;
    }
}
