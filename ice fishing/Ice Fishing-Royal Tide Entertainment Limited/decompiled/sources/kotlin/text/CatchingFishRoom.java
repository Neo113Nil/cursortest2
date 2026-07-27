package kotlin.text;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Region;

/* loaded from: classes.dex */
public final class CatchingFishRoom implements CatchingFishOkHttpHandler {
    public Rect CatchingFishCoroutine;
    public Canvas CatchingFishParcelableFAB = CatchingFishLayout.CatchingFishParcelableFAB;
    public Rect CatchingFishSnackbar;

    @Override // kotlin.text.CatchingFishOkHttpHandler
    public final void CatchingFishAnimationMockk(float[] fArr) {
        if (CatchingFishViewMVIMVVM.CatchingFishAnimationMockk(fArr)) {
            return;
        }
        Matrix matrix = new Matrix();
        float f = fArr[0];
        float f2 = fArr[1];
        float f3 = fArr[2];
        float f4 = fArr[3];
        float f5 = fArr[4];
        float f6 = fArr[5];
        float f7 = fArr[6];
        float f8 = fArr[7];
        float f9 = fArr[8];
        float f10 = fArr[12];
        float f11 = fArr[13];
        float f12 = fArr[15];
        fArr[0] = f;
        fArr[1] = f5;
        fArr[2] = f10;
        fArr[3] = f2;
        fArr[4] = f6;
        fArr[5] = f11;
        fArr[6] = f4;
        fArr[7] = f8;
        fArr[8] = f12;
        matrix.setValues(fArr);
        fArr[0] = f;
        fArr[1] = f2;
        fArr[2] = f3;
        fArr[3] = f4;
        fArr[4] = f5;
        fArr[5] = f6;
        fArr[6] = f7;
        fArr[7] = f8;
        fArr[8] = f9;
        this.CatchingFishParcelableFAB.concat(matrix);
    }

    @Override // kotlin.text.CatchingFishOkHttpHandler
    public final void CatchingFishCloudMessaging() {
        this.CatchingFishParcelableFAB.save();
    }

    @Override // kotlin.text.CatchingFishOkHttpHandler
    public final void CatchingFishCoroutine(long j, long j2, CatchingFishFluxFirebase catchingFishFluxFirebase) {
        this.CatchingFishParcelableFAB.drawLine(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)), Float.intBitsToFloat((int) (j2 >> 32)), Float.intBitsToFloat((int) (j2 & 4294967295L)), (Paint) catchingFishFluxFirebase.CatchingFishSnackbar);
    }

    @Override // kotlin.text.CatchingFishOkHttpHandler
    public final void CatchingFishDaggerWebsocket(float f, float f2, float f3, float f4, float f5, float f6, CatchingFishFluxFirebase catchingFishFluxFirebase) {
        this.CatchingFishParcelableFAB.drawRoundRect(f, f2, f3, f4, f5, f6, (Paint) catchingFishFluxFirebase.CatchingFishSnackbar);
    }

    @Override // kotlin.text.CatchingFishOkHttpHandler
    public final void CatchingFishEspressoTesting() {
        CatchingFishBiometricBundle.CatchingFishUnitTesting(this.CatchingFishParcelableFAB, false);
    }

    @Override // kotlin.text.CatchingFishOkHttpHandler
    public final void CatchingFishFragmentHandler(float f, long j, CatchingFishFluxFirebase catchingFishFluxFirebase) {
        this.CatchingFishParcelableFAB.drawCircle(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)), f, (Paint) catchingFishFluxFirebase.CatchingFishSnackbar);
    }

    @Override // kotlin.text.CatchingFishOkHttpHandler
    public final void CatchingFishLayout() {
        this.CatchingFishParcelableFAB.restore();
    }

    @Override // kotlin.text.CatchingFishOkHttpHandler
    public final void CatchingFishOkHttp(CatchingFishMoshiRealm catchingFishMoshiRealm, CatchingFishFluxFirebase catchingFishFluxFirebase) {
        Canvas canvas = this.CatchingFishParcelableFAB;
        if (!(catchingFishMoshiRealm instanceof CatchingFishMoshiRealm)) {
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        canvas.drawPath(catchingFishMoshiRealm.CatchingFishParcelableFAB, (Paint) catchingFishFluxFirebase.CatchingFishSnackbar);
    }

    @Override // kotlin.text.CatchingFishOkHttpHandler
    public final void CatchingFishParcelableFAB(float f, float f2, float f3, float f4, CatchingFishFluxFirebase catchingFishFluxFirebase) {
        this.CatchingFishParcelableFAB.drawRect(f, f2, f3, f4, (Paint) catchingFishFluxFirebase.CatchingFishSnackbar);
    }

    @Override // kotlin.text.CatchingFishOkHttpHandler
    public final void CatchingFishReduxKtor(CatchingFishFluxExoPlayer catchingFishFluxExoPlayer, CatchingFishFluxFirebase catchingFishFluxFirebase) {
        this.CatchingFishParcelableFAB.saveLayer(catchingFishFluxExoPlayer.CatchingFishParcelableFAB, catchingFishFluxExoPlayer.CatchingFishSnackbar, catchingFishFluxExoPlayer.CatchingFishCoroutine, catchingFishFluxExoPlayer.CatchingFishReduxKtor, (Paint) catchingFishFluxFirebase.CatchingFishSnackbar, 31);
    }

    @Override // kotlin.text.CatchingFishOkHttpHandler
    public final void CatchingFishSnackbar(float f, float f2) {
        this.CatchingFishParcelableFAB.scale(f, f2);
    }

    @Override // kotlin.text.CatchingFishOkHttpHandler
    public final void CatchingFishStateLiveData() {
        CatchingFishBiometricBundle.CatchingFishUnitTesting(this.CatchingFishParcelableFAB, true);
    }

    @Override // kotlin.text.CatchingFishOkHttpHandler
    public final void CatchingFishUnitTesting(float f, float f2, float f3, float f4) {
        this.CatchingFishParcelableFAB.clipRect(f, f2, f3, f4, Region.Op.INTERSECT);
    }

    @Override // kotlin.text.CatchingFishOkHttpHandler
    public final void CatchingFishViewModelFAB(float f, float f2) {
        this.CatchingFishParcelableFAB.translate(f, f2);
    }

    @Override // kotlin.text.CatchingFishOkHttpHandler
    public final void CatchingFishViewModelScope(CatchingFishWidgetWebSocket catchingFishWidgetWebSocket, long j, long j2, long j3, CatchingFishFluxFirebase catchingFishFluxFirebase) {
        if (this.CatchingFishSnackbar == null) {
            this.CatchingFishSnackbar = new Rect();
            this.CatchingFishCoroutine = new Rect();
        }
        Canvas canvas = this.CatchingFishParcelableFAB;
        if (!(catchingFishWidgetWebSocket instanceof CatchingFishWidgetWebSocket)) {
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Bitmap");
        }
        Bitmap bitmap = catchingFishWidgetWebSocket.CatchingFishParcelableFAB;
        Rect rect = this.CatchingFishSnackbar;
        CatchingFishFirebaseDagger.CatchingFishAnimationMockk(rect);
        int i = (int) (j >> 32);
        rect.left = i;
        int i2 = (int) (j & 4294967295L);
        rect.top = i2;
        rect.right = i + ((int) (j2 >> 32));
        rect.bottom = i2 + ((int) (j2 & 4294967295L));
        Rect rect2 = this.CatchingFishCoroutine;
        CatchingFishFirebaseDagger.CatchingFishAnimationMockk(rect2);
        int i3 = (int) 0;
        rect2.left = i3;
        int i4 = (int) 0;
        rect2.top = i4;
        rect2.right = i3 + ((int) (j3 >> 32));
        rect2.bottom = i4 + ((int) (4294967295L & j3));
        canvas.drawBitmap(bitmap, rect, rect2, (Paint) catchingFishFluxFirebase.CatchingFishSnackbar);
    }

    @Override // kotlin.text.CatchingFishOkHttpHandler
    public final void CatchingFishWorkManager(CatchingFishMoshiRealm catchingFishMoshiRealm) {
        Canvas canvas = this.CatchingFishParcelableFAB;
        if (!(catchingFishMoshiRealm instanceof CatchingFishMoshiRealm)) {
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        canvas.clipPath(catchingFishMoshiRealm.CatchingFishParcelableFAB, Region.Op.INTERSECT);
    }
}
