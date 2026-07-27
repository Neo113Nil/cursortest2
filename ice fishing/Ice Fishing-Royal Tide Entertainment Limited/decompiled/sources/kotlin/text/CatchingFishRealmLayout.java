package kotlin.text;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import com.android.installreferrer.api.InstallReferrerClient;
import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final /* synthetic */ class CatchingFishRealmLayout implements CatchingFishGsonToast, CatchingFishHandlerJUnit {
    public final /* synthetic */ Object CatchingFishDaggerWebsocket;
    public final /* synthetic */ int CatchingFishReduxKtor;
    public final /* synthetic */ Object CatchingFishViewModelFAB;
    public final /* synthetic */ Object CatchingFishViewModelScope;
    public final /* synthetic */ long CatchingFishWorkManager;

    public /* synthetic */ CatchingFishRealmLayout(CatchingFishBundleStateFlow catchingFishBundleStateFlow, Object obj, long j, TimeUnit timeUnit, int i) {
        this.CatchingFishReduxKtor = i;
        this.CatchingFishDaggerWebsocket = catchingFishBundleStateFlow;
        this.CatchingFishViewModelFAB = obj;
        this.CatchingFishWorkManager = j;
        this.CatchingFishViewModelScope = timeUnit;
    }

    @Override // kotlin.text.CatchingFishHandlerJUnit
    public Object CatchingFishParcelableFAB() {
        CatchingFishGsonRetrofit catchingFishGsonRetrofit = (CatchingFishGsonRetrofit) this.CatchingFishDaggerWebsocket;
        Iterable iterable = (Iterable) this.CatchingFishViewModelFAB;
        CatchingFishBundleMVIHilt catchingFishBundleMVIHilt = (CatchingFishBundleMVIHilt) this.CatchingFishViewModelScope;
        CatchingFishMVIView catchingFishMVIView = (CatchingFishMVIView) catchingFishGsonRetrofit.CatchingFishCoroutine;
        catchingFishMVIView.getClass();
        if (iterable.iterator().hasNext()) {
            String str = "UPDATE events SET num_attempts = num_attempts + 1 WHERE _id in " + CatchingFishMVIView.CatchingFishOkHttp(iterable);
            SQLiteDatabase CatchingFishSnackbar = catchingFishMVIView.CatchingFishSnackbar();
            CatchingFishSnackbar.beginTransaction();
            try {
                CatchingFishSnackbar.compileStatement(str).execute();
                Cursor rawQuery = CatchingFishSnackbar.rawQuery("SELECT COUNT(*), transport_name FROM events WHERE num_attempts >= 16 GROUP BY transport_name", null);
                while (rawQuery.moveToNext()) {
                    try {
                        catchingFishMVIView.CatchingFishLayout(rawQuery.getInt(0), CatchingFishGsonService.MAX_RETRIES_REACHED, rawQuery.getString(1));
                    } catch (Throwable th) {
                        rawQuery.close();
                        throw th;
                    }
                }
                rawQuery.close();
                CatchingFishSnackbar.compileStatement("DELETE FROM events WHERE num_attempts >= 16").execute();
                CatchingFishSnackbar.setTransactionSuccessful();
            } finally {
                CatchingFishSnackbar.endTransaction();
            }
        }
        catchingFishMVIView.CatchingFishReduxKtor(new CatchingFishBiometricJUnit(catchingFishGsonRetrofit.CatchingFishViewModelScope.CatchingFishParcelableFAB() + this.CatchingFishWorkManager, catchingFishBundleMVIHilt));
        return null;
    }

    @Override // kotlin.text.CatchingFishGsonToast
    public ScheduledFuture CatchingFishSnackbar(final CatchingFishViewPagerMockk catchingFishViewPagerMockk) {
        switch (this.CatchingFishReduxKtor) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                CatchingFishBundleStateFlow catchingFishBundleStateFlow = (CatchingFishBundleStateFlow) this.CatchingFishDaggerWebsocket;
                Runnable runnable = (Runnable) this.CatchingFishViewModelFAB;
                return catchingFishBundleStateFlow.CatchingFishDaggerWebsocket.schedule(new CatchingFishDaggerXMLLayout(catchingFishBundleStateFlow, runnable, catchingFishViewPagerMockk, 1), this.CatchingFishWorkManager, (TimeUnit) this.CatchingFishViewModelScope);
            default:
                final CatchingFishBundleStateFlow catchingFishBundleStateFlow2 = (CatchingFishBundleStateFlow) this.CatchingFishDaggerWebsocket;
                final Callable callable = (Callable) this.CatchingFishViewModelFAB;
                return catchingFishBundleStateFlow2.CatchingFishDaggerWebsocket.schedule(new Callable() { // from class: kotlin.text.CatchingFishCardViewContext
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        return CatchingFishBundleStateFlow.this.CatchingFishReduxKtor.submit(new CatchingFishEspressoFlux(8, callable, catchingFishViewPagerMockk));
                    }
                }, this.CatchingFishWorkManager, (TimeUnit) this.CatchingFishViewModelScope);
        }
    }

    public /* synthetic */ CatchingFishRealmLayout(CatchingFishGsonRetrofit catchingFishGsonRetrofit, Iterable iterable, CatchingFishBundleMVIHilt catchingFishBundleMVIHilt, long j) {
        this.CatchingFishReduxKtor = 2;
        this.CatchingFishDaggerWebsocket = catchingFishGsonRetrofit;
        this.CatchingFishViewModelFAB = iterable;
        this.CatchingFishViewModelScope = catchingFishBundleMVIHilt;
        this.CatchingFishWorkManager = j;
    }
}
