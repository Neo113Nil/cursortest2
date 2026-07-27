package kotlin.text;

import android.view.LayoutInflater;
import androidx.activity.ComponentActivity;
import androidx.appcompat.app.AppCompatActivity;

/* loaded from: classes.dex */
public final class CatchingFishAdMobGsonPayPal implements CatchingFishViewPagerMVI {
    public final /* synthetic */ AppCompatActivity CatchingFishParcelableFAB;

    public CatchingFishAdMobGsonPayPal(AppCompatActivity appCompatActivity) {
        this.CatchingFishParcelableFAB = appCompatActivity;
    }

    @Override // kotlin.text.CatchingFishViewPagerMVI
    public final void CatchingFishParcelableFAB(ComponentActivity componentActivity) {
        AppCompatActivity appCompatActivity = this.CatchingFishParcelableFAB;
        CatchingFishBundleDagger CatchingFishOkHttp = appCompatActivity.CatchingFishOkHttp();
        CatchingFishMockkWidgetKtor catchingFishMockkWidgetKtor = (CatchingFishMockkWidgetKtor) CatchingFishOkHttp;
        LayoutInflater from = LayoutInflater.from(catchingFishMockkWidgetKtor.CatchingFishUnitTesting);
        if (from.getFactory() == null) {
            from.setFactory2(catchingFishMockkWidgetKtor);
        } else {
            from.getFactory2();
        }
        ((CatchingFishViewModelIntent) appCompatActivity.CatchingFishViewModelScope.CatchingFishWorkManager).CatchingFishDaggerWebsocket("androidx:appcompat");
        CatchingFishOkHttp.CatchingFishSnackbar();
    }
}
