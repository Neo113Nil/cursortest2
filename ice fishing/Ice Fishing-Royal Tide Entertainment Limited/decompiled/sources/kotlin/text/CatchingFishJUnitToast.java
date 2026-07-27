package kotlin.text;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;

/* loaded from: classes.dex */
public final class CatchingFishJUnitToast extends CatchingFishLifecycleGson {
    public final CatchingFishReduxFluxJUnit CatchingFishCoroutine;
    public final float CatchingFishDaggerWebsocket;
    public final float CatchingFishReduxKtor;

    public CatchingFishJUnitToast(CatchingFishReduxFluxJUnit catchingFishReduxFluxJUnit, float f, float f2) {
        this.CatchingFishCoroutine = catchingFishReduxFluxJUnit;
        this.CatchingFishReduxKtor = f;
        this.CatchingFishDaggerWebsocket = f2;
    }

    @Override // kotlin.text.CatchingFishLifecycleGson
    public final void CatchingFishParcelableFAB(Matrix matrix, CatchingFishAsyncTaskFAB catchingFishAsyncTaskFAB, int i, Canvas canvas) {
        CatchingFishReduxFluxJUnit catchingFishReduxFluxJUnit = this.CatchingFishCoroutine;
        float f = catchingFishReduxFluxJUnit.CatchingFishCoroutine;
        float f2 = this.CatchingFishDaggerWebsocket;
        float f3 = catchingFishReduxFluxJUnit.CatchingFishSnackbar;
        float f4 = this.CatchingFishReduxKtor;
        RectF rectF = new RectF(0.0f, 0.0f, (float) Math.hypot(f - f2, f3 - f4), 0.0f);
        Matrix matrix2 = this.CatchingFishParcelableFAB;
        matrix2.set(matrix);
        matrix2.preTranslate(f4, f2);
        matrix2.preRotate(CatchingFishSnackbar());
        catchingFishAsyncTaskFAB.getClass();
        rectF.bottom += i;
        rectF.offset(0.0f, -i);
        int i2 = catchingFishAsyncTaskFAB.CatchingFishWorkManager;
        int[] iArr = CatchingFishAsyncTaskFAB.CatchingFishLayout;
        iArr[0] = i2;
        iArr[1] = catchingFishAsyncTaskFAB.CatchingFishDaggerWebsocket;
        iArr[2] = catchingFishAsyncTaskFAB.CatchingFishReduxKtor;
        Paint paint = catchingFishAsyncTaskFAB.CatchingFishCoroutine;
        float f5 = rectF.left;
        paint.setShader(new LinearGradient(f5, rectF.top, f5, rectF.bottom, iArr, CatchingFishAsyncTaskFAB.CatchingFishFragmentHandler, Shader.TileMode.CLAMP));
        canvas.save();
        canvas.concat(matrix2);
        canvas.drawRect(rectF, paint);
        canvas.restore();
    }

    public final float CatchingFishSnackbar() {
        CatchingFishReduxFluxJUnit catchingFishReduxFluxJUnit = this.CatchingFishCoroutine;
        return (float) Math.toDegrees(Math.atan((catchingFishReduxFluxJUnit.CatchingFishCoroutine - this.CatchingFishDaggerWebsocket) / (catchingFishReduxFluxJUnit.CatchingFishSnackbar - this.CatchingFishReduxKtor)));
    }
}
