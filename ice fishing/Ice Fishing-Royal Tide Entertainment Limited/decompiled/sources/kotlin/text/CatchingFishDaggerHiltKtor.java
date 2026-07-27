package kotlin.text;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.Shader;

/* loaded from: classes.dex */
public final class CatchingFishDaggerHiltKtor extends CatchingFishLifecycleGson {
    public final CatchingFishGradleStateFlow CatchingFishCoroutine;

    public CatchingFishDaggerHiltKtor(CatchingFishGradleStateFlow catchingFishGradleStateFlow) {
        this.CatchingFishCoroutine = catchingFishGradleStateFlow;
    }

    @Override // kotlin.text.CatchingFishLifecycleGson
    public final void CatchingFishParcelableFAB(Matrix matrix, CatchingFishAsyncTaskFAB catchingFishAsyncTaskFAB, int i, Canvas canvas) {
        float f;
        CatchingFishGradleStateFlow catchingFishGradleStateFlow = this.CatchingFishCoroutine;
        float f2 = catchingFishGradleStateFlow.CatchingFishWorkManager;
        float f3 = catchingFishGradleStateFlow.CatchingFishViewModelScope;
        RectF rectF = new RectF(catchingFishGradleStateFlow.CatchingFishSnackbar, catchingFishGradleStateFlow.CatchingFishCoroutine, catchingFishGradleStateFlow.CatchingFishReduxKtor, catchingFishGradleStateFlow.CatchingFishDaggerWebsocket);
        Paint paint = catchingFishAsyncTaskFAB.CatchingFishSnackbar;
        boolean z = f3 < 0.0f;
        Path path = catchingFishAsyncTaskFAB.CatchingFishViewModelScope;
        int[] iArr = CatchingFishAsyncTaskFAB.CatchingFishCloudMessaging;
        if (z) {
            iArr[0] = 0;
            iArr[1] = catchingFishAsyncTaskFAB.CatchingFishWorkManager;
            iArr[2] = catchingFishAsyncTaskFAB.CatchingFishDaggerWebsocket;
            iArr[3] = catchingFishAsyncTaskFAB.CatchingFishReduxKtor;
            f = 0.0f;
        } else {
            path.rewind();
            f = 0.0f;
            path.moveTo(rectF.centerX(), rectF.centerY());
            path.arcTo(rectF, f2, f3);
            path.close();
            float f4 = -i;
            rectF.inset(f4, f4);
            iArr[0] = 0;
            iArr[1] = catchingFishAsyncTaskFAB.CatchingFishReduxKtor;
            iArr[2] = catchingFishAsyncTaskFAB.CatchingFishDaggerWebsocket;
            iArr[3] = catchingFishAsyncTaskFAB.CatchingFishWorkManager;
        }
        float width = rectF.width() / 2.0f;
        if (width <= f) {
            return;
        }
        float f5 = 1.0f - (i / width);
        float[] fArr = CatchingFishAsyncTaskFAB.CatchingFishEspressoTesting;
        fArr[1] = f5;
        fArr[2] = ((1.0f - f5) / 2.0f) + f5;
        paint.setShader(new RadialGradient(rectF.centerX(), rectF.centerY(), width, iArr, fArr, Shader.TileMode.CLAMP));
        canvas.save();
        canvas.concat(matrix);
        canvas.scale(1.0f, rectF.height() / rectF.width());
        if (!z) {
            canvas.clipPath(path, Region.Op.DIFFERENCE);
            canvas.drawPath(path, catchingFishAsyncTaskFAB.CatchingFishViewModelFAB);
        }
        canvas.drawArc(rectF, f2, f3, true, paint);
        canvas.restore();
    }
}
