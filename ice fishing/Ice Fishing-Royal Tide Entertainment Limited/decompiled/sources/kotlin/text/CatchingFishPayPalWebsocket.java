package kotlin.text;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import com.android.installreferrer.api.InstallReferrerClient;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;

/* loaded from: classes.dex */
public final class CatchingFishPayPalWebsocket implements CatchingFishFluxContext {
    public final /* synthetic */ int CatchingFishParcelableFAB;
    public final Object CatchingFishSnackbar;

    public CatchingFishPayPalWebsocket(CatchingFishViewModelIntent catchingFishViewModelIntent) {
        this.CatchingFishParcelableFAB = 1;
        this.CatchingFishSnackbar = new LinkedHashSet();
        catchingFishViewModelIntent.CatchingFishCardViewRealm("androidx.savedstate.Restarter", this);
    }

    @Override // kotlin.text.CatchingFishFluxContext
    public final Bundle CatchingFishParcelableFAB() {
        switch (this.CatchingFishParcelableFAB) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                Bundle bundle = new Bundle();
                ((AppCompatActivity) this.CatchingFishSnackbar).CatchingFishOkHttp().getClass();
                return bundle;
            default:
                Bundle CatchingFishFragmentHandler = CatchingFishGsonCardView.CatchingFishFragmentHandler((CatchingFishGsonWorkManager[]) Arrays.copyOf(new CatchingFishGsonWorkManager[0], 0));
                List CatchingFishRedux = CatchingFishCameraXCameraX.CatchingFishRedux((LinkedHashSet) this.CatchingFishSnackbar);
                CatchingFishFragmentHandler.putStringArrayList("classes_to_restore", CatchingFishRedux instanceof ArrayList ? (ArrayList) CatchingFishRedux : new ArrayList<>(CatchingFishRedux));
                return CatchingFishFragmentHandler;
        }
    }

    public CatchingFishPayPalWebsocket(AppCompatActivity appCompatActivity) {
        this.CatchingFishParcelableFAB = 0;
        this.CatchingFishSnackbar = appCompatActivity;
    }
}
