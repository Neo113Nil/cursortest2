package kotlin.text;

import android.graphics.Rect;
import java.util.List;

/* loaded from: classes.dex */
public abstract class CatchingFishManifestFABMVI {
    public final Rect[][] CatchingFishCoroutine;
    public final CatchingFishKtorPicassoMVVM CatchingFishParcelableFAB;
    public final Rect[][] CatchingFishReduxKtor;
    public CatchingFishReduxPayPal[] CatchingFishSnackbar;

    public CatchingFishManifestFABMVI() {
        this(new CatchingFishKtorPicassoMVVM((CatchingFishKtorPicassoMVVM) null));
    }

    public void CatchingFishCoroutine(CatchingFishKtorPicassoMVVM catchingFishKtorPicassoMVVM) {
        for (int i = 1; i <= 512; i <<= 1) {
            List<Rect> CatchingFishWorkManager = catchingFishKtorPicassoMVVM.CatchingFishParcelableFAB.CatchingFishWorkManager(i);
            int CatchingFishCoroutineFlow = CatchingFishLayoutRoom.CatchingFishCoroutineFlow(i);
            this.CatchingFishCoroutine[CatchingFishCoroutineFlow] = (Rect[]) CatchingFishWorkManager.toArray(new Rect[CatchingFishWorkManager.size()]);
            if (i != 8) {
                List<Rect> CatchingFishViewModelScope = catchingFishKtorPicassoMVVM.CatchingFishParcelableFAB.CatchingFishViewModelScope(i);
                this.CatchingFishReduxKtor[CatchingFishCoroutineFlow] = (Rect[]) CatchingFishViewModelScope.toArray(new Rect[CatchingFishViewModelScope.size()]);
            }
        }
    }

    public final void CatchingFishParcelableFAB() {
        CatchingFishReduxPayPal[] catchingFishReduxPayPalArr = this.CatchingFishSnackbar;
        if (catchingFishReduxPayPalArr != null) {
            CatchingFishReduxPayPal catchingFishReduxPayPal = catchingFishReduxPayPalArr[0];
            CatchingFishReduxPayPal catchingFishReduxPayPal2 = catchingFishReduxPayPalArr[1];
            CatchingFishKtorPicassoMVVM catchingFishKtorPicassoMVVM = this.CatchingFishParcelableFAB;
            if (catchingFishReduxPayPal2 == null) {
                catchingFishReduxPayPal2 = catchingFishKtorPicassoMVVM.CatchingFishParcelableFAB.CatchingFishLayout(2);
            }
            if (catchingFishReduxPayPal == null) {
                catchingFishReduxPayPal = catchingFishKtorPicassoMVVM.CatchingFishParcelableFAB.CatchingFishLayout(1);
            }
            CatchingFishViewModelFAB(CatchingFishReduxPayPal.CatchingFishParcelableFAB(catchingFishReduxPayPal, catchingFishReduxPayPal2));
            CatchingFishReduxPayPal catchingFishReduxPayPal3 = this.CatchingFishSnackbar[CatchingFishLayoutRoom.CatchingFishCoroutineFlow(16)];
            if (catchingFishReduxPayPal3 != null) {
                CatchingFishViewModelScope(catchingFishReduxPayPal3);
            }
            CatchingFishReduxPayPal catchingFishReduxPayPal4 = this.CatchingFishSnackbar[CatchingFishLayoutRoom.CatchingFishCoroutineFlow(32)];
            if (catchingFishReduxPayPal4 != null) {
                CatchingFishDaggerWebsocket(catchingFishReduxPayPal4);
            }
            CatchingFishReduxPayPal catchingFishReduxPayPal5 = this.CatchingFishSnackbar[CatchingFishLayoutRoom.CatchingFishCoroutineFlow(64)];
            if (catchingFishReduxPayPal5 != null) {
                CatchingFishLayout(catchingFishReduxPayPal5);
            }
        }
    }

    public void CatchingFishReduxKtor(int i, CatchingFishReduxPayPal catchingFishReduxPayPal) {
        if (this.CatchingFishSnackbar == null) {
            this.CatchingFishSnackbar = new CatchingFishReduxPayPal[10];
        }
        for (int i2 = 1; i2 <= 512; i2 <<= 1) {
            if ((i & i2) != 0) {
                this.CatchingFishSnackbar[CatchingFishLayoutRoom.CatchingFishCoroutineFlow(i2)] = catchingFishReduxPayPal;
            }
        }
    }

    public abstract CatchingFishKtorPicassoMVVM CatchingFishSnackbar();

    public abstract void CatchingFishViewModelFAB(CatchingFishReduxPayPal catchingFishReduxPayPal);

    public abstract void CatchingFishWorkManager(CatchingFishReduxPayPal catchingFishReduxPayPal);

    public CatchingFishManifestFABMVI(CatchingFishKtorPicassoMVVM catchingFishKtorPicassoMVVM) {
        this.CatchingFishCoroutine = new Rect[10][];
        this.CatchingFishReduxKtor = new Rect[10][];
        this.CatchingFishParcelableFAB = catchingFishKtorPicassoMVVM;
        CatchingFishCoroutine(catchingFishKtorPicassoMVVM);
    }

    public void CatchingFishDaggerWebsocket(CatchingFishReduxPayPal catchingFishReduxPayPal) {
    }

    public void CatchingFishLayout(CatchingFishReduxPayPal catchingFishReduxPayPal) {
    }

    public void CatchingFishViewModelScope(CatchingFishReduxPayPal catchingFishReduxPayPal) {
    }
}
