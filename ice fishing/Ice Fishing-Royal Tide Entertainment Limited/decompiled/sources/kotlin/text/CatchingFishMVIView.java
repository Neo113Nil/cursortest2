package kotlin.text;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.os.SystemClock;
import android.util.Base64;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Objects;

/* loaded from: classes.dex */
public final class CatchingFishMVIView implements CatchingFishOkHttpFirebase, CatchingFishGsonCameraX, CatchingFishEspressoAdMob {
    public static final CatchingFishBiometricIntent CatchingFishLayout = new CatchingFishBiometricIntent("proto");
    public final CatchingFishMVIWorkManager CatchingFishDaggerWebsocket;
    public final CatchingFishWebsocketHilt CatchingFishReduxKtor;
    public final CatchingFishHandlerMVP CatchingFishViewModelFAB;
    public final CatchingFishViewEspresso CatchingFishViewModelScope;
    public final CatchingFishMVIWorkManager CatchingFishWorkManager;

    public CatchingFishMVIView(CatchingFishMVIWorkManager catchingFishMVIWorkManager, CatchingFishMVIWorkManager catchingFishMVIWorkManager2, CatchingFishViewEspresso catchingFishViewEspresso, CatchingFishWebsocketHilt catchingFishWebsocketHilt, CatchingFishHandlerMVP catchingFishHandlerMVP) {
        this.CatchingFishReduxKtor = catchingFishWebsocketHilt;
        this.CatchingFishDaggerWebsocket = catchingFishMVIWorkManager;
        this.CatchingFishWorkManager = catchingFishMVIWorkManager2;
        this.CatchingFishViewModelScope = catchingFishViewEspresso;
        this.CatchingFishViewModelFAB = catchingFishHandlerMVP;
    }

    public static Object CatchingFishAnimationMockk(Cursor cursor, CatchingFishRealmXMLLayout catchingFishRealmXMLLayout) {
        try {
            return catchingFishRealmXMLLayout.apply(cursor);
        } finally {
            cursor.close();
        }
    }

    public static Long CatchingFishCoroutine(SQLiteDatabase sQLiteDatabase, CatchingFishBundleMVIHilt catchingFishBundleMVIHilt) {
        StringBuilder sb = new StringBuilder("backend_name = ? and priority = ?");
        ArrayList arrayList = new ArrayList(Arrays.asList(catchingFishBundleMVIHilt.CatchingFishParcelableFAB, String.valueOf(CatchingFishRoomGlide.CatchingFishParcelableFAB(catchingFishBundleMVIHilt.CatchingFishCoroutine))));
        byte[] bArr = catchingFishBundleMVIHilt.CatchingFishSnackbar;
        if (bArr != null) {
            sb.append(" and extras = ?");
            arrayList.add(Base64.encodeToString(bArr, 0));
        } else {
            sb.append(" and extras is null");
        }
        Cursor query = sQLiteDatabase.query("transport_contexts", new String[]{"_id"}, sb.toString(), (String[]) arrayList.toArray(new String[0]), null, null, null);
        try {
            return !query.moveToNext() ? null : Long.valueOf(query.getLong(0));
        } finally {
            query.close();
        }
    }

    public static String CatchingFishOkHttp(Iterable iterable) {
        StringBuilder sb = new StringBuilder("(");
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            sb.append(((CatchingFishHiltIntent) it.next()).CatchingFishParcelableFAB);
            if (it.hasNext()) {
                sb.append(',');
            }
        }
        sb.append(')');
        return sb.toString();
    }

    public final ArrayList CatchingFishDaggerWebsocket(SQLiteDatabase sQLiteDatabase, CatchingFishBundleMVIHilt catchingFishBundleMVIHilt, int i) {
        ArrayList arrayList = new ArrayList();
        Long CatchingFishCoroutine = CatchingFishCoroutine(sQLiteDatabase, catchingFishBundleMVIHilt);
        if (CatchingFishCoroutine == null) {
            return arrayList;
        }
        CatchingFishAnimationMockk(sQLiteDatabase.query("events", new String[]{"_id", "transport_name", "timestamp_ms", "uptime_ms", "payload_encoding", "payload", "code", "inline"}, "context_id = ?", new String[]{CatchingFishCoroutine.toString()}, null, null, null, String.valueOf(i)), new CatchingFishDataStoreHilt(this, (Object) arrayList, catchingFishBundleMVIHilt, 2));
        return arrayList;
    }

    public final Object CatchingFishEspressoTesting(CatchingFishHandlerJUnit catchingFishHandlerJUnit) {
        SQLiteDatabase CatchingFishSnackbar = CatchingFishSnackbar();
        CatchingFishMVIWorkManager catchingFishMVIWorkManager = this.CatchingFishWorkManager;
        long CatchingFishParcelableFAB = catchingFishMVIWorkManager.CatchingFishParcelableFAB();
        while (true) {
            try {
                CatchingFishSnackbar.beginTransaction();
                try {
                    Object CatchingFishParcelableFAB2 = catchingFishHandlerJUnit.CatchingFishParcelableFAB();
                    CatchingFishSnackbar.setTransactionSuccessful();
                    return CatchingFishParcelableFAB2;
                } finally {
                    CatchingFishSnackbar.endTransaction();
                }
            } catch (SQLiteDatabaseLockedException e) {
                if (catchingFishMVIWorkManager.CatchingFishParcelableFAB() >= this.CatchingFishViewModelScope.CatchingFishCoroutine + CatchingFishParcelableFAB) {
                    throw new CatchingFishKtorHandler("Timed out while trying to acquire the lock.", e);
                }
                SystemClock.sleep(50L);
            }
        }
    }

    public final void CatchingFishLayout(long j, CatchingFishGsonService catchingFishGsonService, String str) {
        CatchingFishReduxKtor(new CatchingFishRealmRealm(j, str, catchingFishGsonService));
    }

    public final Object CatchingFishReduxKtor(CatchingFishRealmXMLLayout catchingFishRealmXMLLayout) {
        SQLiteDatabase CatchingFishSnackbar = CatchingFishSnackbar();
        CatchingFishSnackbar.beginTransaction();
        try {
            Object apply = catchingFishRealmXMLLayout.apply(CatchingFishSnackbar);
            CatchingFishSnackbar.setTransactionSuccessful();
            return apply;
        } finally {
            CatchingFishSnackbar.endTransaction();
        }
    }

    public final SQLiteDatabase CatchingFishSnackbar() {
        CatchingFishWebsocketHilt catchingFishWebsocketHilt = this.CatchingFishReduxKtor;
        Objects.requireNonNull(catchingFishWebsocketHilt);
        CatchingFishMVIWorkManager catchingFishMVIWorkManager = this.CatchingFishWorkManager;
        long CatchingFishParcelableFAB = catchingFishMVIWorkManager.CatchingFishParcelableFAB();
        while (true) {
            try {
                return catchingFishWebsocketHilt.getWritableDatabase();
            } catch (SQLiteDatabaseLockedException e) {
                if (catchingFishMVIWorkManager.CatchingFishParcelableFAB() >= this.CatchingFishViewModelScope.CatchingFishCoroutine + CatchingFishParcelableFAB) {
                    throw new CatchingFishKtorHandler("Timed out while trying to open db.", e);
                }
                SystemClock.sleep(50L);
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.CatchingFishReduxKtor.close();
    }
}
