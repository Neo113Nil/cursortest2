package kotlin.text;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

/* loaded from: classes.dex */
public final /* synthetic */ class CatchingFishRealmRealm implements CatchingFishRealmXMLLayout, CatchingFishHandlerJUnit {
    public final /* synthetic */ Object CatchingFishDaggerWebsocket;
    public final /* synthetic */ long CatchingFishReduxKtor;
    public final /* synthetic */ Object CatchingFishWorkManager;

    public /* synthetic */ CatchingFishRealmRealm(long j, Object obj, Object obj2) {
        this.CatchingFishDaggerWebsocket = obj;
        this.CatchingFishWorkManager = obj2;
        this.CatchingFishReduxKtor = j;
    }

    @Override // kotlin.text.CatchingFishHandlerJUnit
    public Object CatchingFishParcelableFAB() {
        CatchingFishGsonRetrofit catchingFishGsonRetrofit = (CatchingFishGsonRetrofit) this.CatchingFishDaggerWebsocket;
        CatchingFishBundleMVIHilt catchingFishBundleMVIHilt = (CatchingFishBundleMVIHilt) this.CatchingFishWorkManager;
        CatchingFishOkHttpFirebase catchingFishOkHttpFirebase = catchingFishGsonRetrofit.CatchingFishCoroutine;
        long CatchingFishParcelableFAB = catchingFishGsonRetrofit.CatchingFishViewModelScope.CatchingFishParcelableFAB() + this.CatchingFishReduxKtor;
        CatchingFishMVIView catchingFishMVIView = (CatchingFishMVIView) catchingFishOkHttpFirebase;
        catchingFishMVIView.getClass();
        catchingFishMVIView.CatchingFishReduxKtor(new CatchingFishBiometricJUnit(CatchingFishParcelableFAB, catchingFishBundleMVIHilt));
        return null;
    }

    @Override // kotlin.text.CatchingFishRealmXMLLayout
    public Object apply(Object obj) {
        String str = (String) this.CatchingFishDaggerWebsocket;
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        int i = ((CatchingFishGsonService) this.CatchingFishWorkManager).CatchingFishReduxKtor;
        Cursor rawQuery = sQLiteDatabase.rawQuery("SELECT 1 FROM log_event_dropped WHERE log_source = ? AND reason = ?", new String[]{str, Integer.toString(i)});
        try {
            boolean z = rawQuery.getCount() > 0;
            rawQuery.close();
            long j = this.CatchingFishReduxKtor;
            if (z) {
                sQLiteDatabase.execSQL("UPDATE log_event_dropped SET events_dropped_count = events_dropped_count + " + j + " WHERE log_source = ? AND reason = ?", new String[]{str, Integer.toString(i)});
                return null;
            }
            ContentValues contentValues = new ContentValues();
            contentValues.put("log_source", str);
            contentValues.put("reason", Integer.valueOf(i));
            contentValues.put("events_dropped_count", Long.valueOf(j));
            sQLiteDatabase.insert("log_event_dropped", null, contentValues);
            return null;
        } catch (Throwable th) {
            rawQuery.close();
            throw th;
        }
    }
}
