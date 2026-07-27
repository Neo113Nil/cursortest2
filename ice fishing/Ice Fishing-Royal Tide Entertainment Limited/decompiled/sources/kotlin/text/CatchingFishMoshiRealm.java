package kotlin.text;

import android.graphics.Path;
import android.graphics.RectF;

/* loaded from: classes.dex */
public final class CatchingFishMoshiRealm {
    public float[] CatchingFishCoroutine;
    public final Path CatchingFishParcelableFAB = new Path();
    public RectF CatchingFishSnackbar;

    public static void CatchingFishParcelableFAB(CatchingFishMoshiRealm catchingFishMoshiRealm, CatchingFishMVIServiceFlux catchingFishMVIServiceFlux) {
        Path.Direction direction;
        if (catchingFishMoshiRealm.CatchingFishSnackbar == null) {
            catchingFishMoshiRealm.CatchingFishSnackbar = new RectF();
        }
        RectF rectF = catchingFishMoshiRealm.CatchingFishSnackbar;
        CatchingFishFirebaseDagger.CatchingFishAnimationMockk(rectF);
        float f = catchingFishMVIServiceFlux.CatchingFishParcelableFAB;
        long j = catchingFishMVIServiceFlux.CatchingFishViewModelFAB;
        long j2 = catchingFishMVIServiceFlux.CatchingFishViewModelScope;
        long j3 = catchingFishMVIServiceFlux.CatchingFishWorkManager;
        long j4 = catchingFishMVIServiceFlux.CatchingFishDaggerWebsocket;
        rectF.set(f, catchingFishMVIServiceFlux.CatchingFishSnackbar, catchingFishMVIServiceFlux.CatchingFishCoroutine, catchingFishMVIServiceFlux.CatchingFishReduxKtor);
        if (catchingFishMoshiRealm.CatchingFishCoroutine == null) {
            catchingFishMoshiRealm.CatchingFishCoroutine = new float[8];
        }
        float[] fArr = catchingFishMoshiRealm.CatchingFishCoroutine;
        CatchingFishFirebaseDagger.CatchingFishAnimationMockk(fArr);
        fArr[0] = Float.intBitsToFloat((int) (j4 >> 32));
        fArr[1] = Float.intBitsToFloat((int) (j4 & 4294967295L));
        fArr[2] = Float.intBitsToFloat((int) (j3 >> 32));
        fArr[3] = Float.intBitsToFloat((int) (j3 & 4294967295L));
        fArr[4] = Float.intBitsToFloat((int) (j2 >> 32));
        fArr[5] = Float.intBitsToFloat((int) (j2 & 4294967295L));
        fArr[6] = Float.intBitsToFloat((int) (j >> 32));
        fArr[7] = Float.intBitsToFloat((int) (j & 4294967295L));
        Path path = catchingFishMoshiRealm.CatchingFishParcelableFAB;
        RectF rectF2 = catchingFishMoshiRealm.CatchingFishSnackbar;
        CatchingFishFirebaseDagger.CatchingFishAnimationMockk(rectF2);
        float[] fArr2 = catchingFishMoshiRealm.CatchingFishCoroutine;
        CatchingFishFirebaseDagger.CatchingFishAnimationMockk(fArr2);
        int ordinal = CatchingFishLayoutMVIOkHttp.CatchingFishReduxKtor.ordinal();
        if (ordinal == 0) {
            direction = Path.Direction.CCW;
        } else {
            if (ordinal != 1) {
                throw new CatchingFishBiometricView();
            }
            direction = Path.Direction.CW;
        }
        path.addRoundRect(rectF2, fArr2, direction);
    }
}
