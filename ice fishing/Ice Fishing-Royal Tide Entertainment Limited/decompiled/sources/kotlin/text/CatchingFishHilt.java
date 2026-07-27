package kotlin.text;

import android.graphics.Paint;
import android.graphics.Shader;

/* loaded from: classes.dex */
public final class CatchingFishHilt extends CatchingFishRobolectricHilt {
    public long CatchingFishCoroutineFlow = 9205357640488583168L;
    public final /* synthetic */ Shader CatchingFishDaggerHiltFAB;
    public CatchingFishEspressoPayPal CatchingFishJetpackCompose;

    public CatchingFishHilt(Shader shader) {
        this.CatchingFishDaggerHiltFAB = shader;
    }

    @Override // kotlin.text.CatchingFishRobolectricHilt
    public final void CatchingFishFragmentHandler(float f, long j, CatchingFishFluxFirebase catchingFishFluxFirebase) {
        CatchingFishEspressoPayPal catchingFishEspressoPayPal = this.CatchingFishJetpackCompose;
        if (catchingFishEspressoPayPal == null || !CatchingFishMVPCameraX.CatchingFishParcelableFAB(this.CatchingFishCoroutineFlow, j)) {
            if (((j == 9205357640488583168L) | (Float.intBitsToFloat((int) (j >> 32)) <= 0.0f)) || (Float.intBitsToFloat((int) (4294967295L & j)) <= 0.0f)) {
                this.CatchingFishJetpackCompose = null;
                this.CatchingFishCoroutineFlow = 9205357640488583168L;
                catchingFishEspressoPayPal = null;
            } else {
                catchingFishEspressoPayPal = this.CatchingFishJetpackCompose;
                if (catchingFishEspressoPayPal == null) {
                    catchingFishEspressoPayPal = new CatchingFishEspressoPayPal(10, false);
                    this.CatchingFishJetpackCompose = catchingFishEspressoPayPal;
                }
                catchingFishEspressoPayPal.CatchingFishDaggerWebsocket = this.CatchingFishDaggerHiltFAB;
                this.CatchingFishJetpackCompose = catchingFishEspressoPayPal;
                this.CatchingFishCoroutineFlow = j;
            }
        }
        long CatchingFishSnackbar = CatchingFishFirebaseDagger.CatchingFishSnackbar(((Paint) catchingFishFluxFirebase.CatchingFishSnackbar).getColor());
        long j2 = CatchingFishToastFragment.CatchingFishSnackbar;
        if (!CatchingFishToastFragment.CatchingFishCoroutine(CatchingFishSnackbar, j2)) {
            catchingFishFluxFirebase.CatchingFishDaggerWebsocket(j2);
        }
        if (!CatchingFishFirebaseDagger.CatchingFishOkHttp((Shader) catchingFishFluxFirebase.CatchingFishCoroutine, catchingFishEspressoPayPal != null ? (Shader) catchingFishEspressoPayPal.CatchingFishDaggerWebsocket : null)) {
            Shader shader = catchingFishEspressoPayPal != null ? (Shader) catchingFishEspressoPayPal.CatchingFishDaggerWebsocket : null;
            catchingFishFluxFirebase.CatchingFishCoroutine = shader;
            ((Paint) catchingFishFluxFirebase.CatchingFishSnackbar).setShader(shader);
        }
        if (((Paint) catchingFishFluxFirebase.CatchingFishSnackbar).getAlpha() / 255.0f == f) {
            return;
        }
        catchingFishFluxFirebase.CatchingFishCoroutine(f);
    }
}
