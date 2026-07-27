package kotlin.text;

import android.graphics.Rect;
import android.view.View;

/* loaded from: classes.dex */
public abstract class CatchingFishIntentJUnit {
    public final Object CatchingFishCoroutine;
    public int CatchingFishParcelableFAB;
    public final Object CatchingFishSnackbar;

    public CatchingFishIntentJUnit(CatchingFishKtorDataStore catchingFishKtorDataStore) {
        this.CatchingFishParcelableFAB = Integer.MIN_VALUE;
        this.CatchingFishCoroutine = new Rect();
        this.CatchingFishSnackbar = catchingFishKtorDataStore;
    }

    public static CatchingFishIntentJUnit CatchingFishParcelableFAB(CatchingFishKtorDataStore catchingFishKtorDataStore, int i) {
        if (i == 0) {
            return new CatchingFishStateFlowFABMVP(catchingFishKtorDataStore, 0);
        }
        if (i == 1) {
            return new CatchingFishStateFlowFABMVP(catchingFishKtorDataStore, 1);
        }
        throw new IllegalArgumentException("invalid orientation");
    }

    public abstract void CatchingFishAnimationMockk(int i);

    public abstract int CatchingFishCloudMessaging();

    public abstract int CatchingFishCoroutine(View view);

    public abstract int CatchingFishDaggerWebsocket(View view);

    public abstract int CatchingFishEspressoTesting();

    public abstract int CatchingFishFragmentHandler();

    public abstract int CatchingFishLayout();

    public abstract int CatchingFishOkHttp(View view);

    public abstract int CatchingFishReduxKtor(View view);

    public abstract int CatchingFishSnackbar(View view);

    public abstract int CatchingFishUnitTesting(View view);

    public abstract int CatchingFishViewModelFAB();

    public abstract int CatchingFishViewModelScope();

    public abstract int CatchingFishWorkManager();

    public CatchingFishIntentJUnit(CatchingFishViewModelRealm catchingFishViewModelRealm) {
        this.CatchingFishParcelableFAB = 0;
        this.CatchingFishCoroutine = new CatchingFishRoomDatabaseMVI();
        this.CatchingFishSnackbar = catchingFishViewModelRealm;
    }
}
