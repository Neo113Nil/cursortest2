package kotlin.text;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.BitSet;

/* loaded from: classes.dex */
public final class CatchingFishFABRoom {
    public final CatchingFishGradleBiometric[] CatchingFishParcelableFAB = new CatchingFishGradleBiometric[4];
    public final Matrix[] CatchingFishSnackbar = new Matrix[4];
    public final Matrix[] CatchingFishCoroutine = new Matrix[4];
    public final PointF CatchingFishReduxKtor = new PointF();
    public final Path CatchingFishDaggerWebsocket = new Path();
    public final Path CatchingFishWorkManager = new Path();
    public final CatchingFishGradleBiometric CatchingFishViewModelScope = new CatchingFishGradleBiometric();
    public final float[] CatchingFishViewModelFAB = new float[2];
    public final float[] CatchingFishLayout = new float[2];
    public final Path CatchingFishFragmentHandler = new Path();
    public final Path CatchingFishCloudMessaging = new Path();
    public final boolean CatchingFishEspressoTesting = true;

    public CatchingFishFABRoom() {
        for (int i = 0; i < 4; i++) {
            this.CatchingFishParcelableFAB[i] = new CatchingFishGradleBiometric();
            this.CatchingFishSnackbar[i] = new Matrix();
            this.CatchingFishCoroutine[i] = new Matrix();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r16v0 */
    /* JADX WARN: Type inference failed for: r16v1 */
    /* JADX WARN: Type inference failed for: r16v5 */
    public final void CatchingFishParcelableFAB(CatchingFishFragmentMVVM catchingFishFragmentMVVM, float[] fArr, float f, RectF rectF, CatchingFishCustomViewMoshi catchingFishCustomViewMoshi, Path path) {
        Matrix[] matrixArr;
        float[] fArr2;
        int i;
        CatchingFishGradleBiometric[] catchingFishGradleBiometricArr;
        Matrix[] matrixArr2;
        boolean z;
        float f2;
        boolean z2;
        int i2;
        path.rewind();
        Path path2 = this.CatchingFishDaggerWebsocket;
        path2.rewind();
        Path path3 = this.CatchingFishWorkManager;
        path3.rewind();
        path3.addRect(rectF, Path.Direction.CW);
        int i3 = 0;
        while (true) {
            matrixArr = this.CatchingFishCoroutine;
            fArr2 = this.CatchingFishViewModelFAB;
            catchingFishGradleBiometricArr = this.CatchingFishParcelableFAB;
            matrixArr2 = this.CatchingFishSnackbar;
            z = 0;
            if (i3 >= 4) {
                break;
            }
            CatchingFishCameraXGradle catchingFishDaggerView = fArr == null ? i3 != 1 ? i3 != 2 ? i3 != 3 ? catchingFishFragmentMVVM.CatchingFishWorkManager : catchingFishFragmentMVVM.CatchingFishDaggerWebsocket : catchingFishFragmentMVVM.CatchingFishViewModelFAB : catchingFishFragmentMVVM.CatchingFishViewModelScope : new CatchingFishDaggerView(fArr[i3]);
            CatchingFishLayoutRoomFAB catchingFishLayoutRoomFAB = i3 != 1 ? i3 != 2 ? i3 != 3 ? catchingFishFragmentMVVM.CatchingFishSnackbar : catchingFishFragmentMVVM.CatchingFishParcelableFAB : catchingFishFragmentMVVM.CatchingFishReduxKtor : catchingFishFragmentMVVM.CatchingFishCoroutine;
            CatchingFishGradleBiometric catchingFishGradleBiometric = catchingFishGradleBiometricArr[i3];
            catchingFishLayoutRoomFAB.getClass();
            catchingFishLayoutRoomFAB.CatchingFishMVPRobolectric(catchingFishGradleBiometric, f, catchingFishDaggerView.CatchingFishParcelableFAB(rectF));
            int i4 = i3 + 1;
            float f3 = (i4 % 4) * 90;
            matrixArr2[i3].reset();
            PointF pointF = this.CatchingFishReduxKtor;
            if (i3 == 1) {
                i2 = i3;
                pointF.set(rectF.right, rectF.bottom);
            } else if (i3 == 2) {
                i2 = i3;
                pointF.set(rectF.left, rectF.bottom);
            } else if (i3 != 3) {
                i2 = i3;
                pointF.set(rectF.right, rectF.top);
            } else {
                i2 = i3;
                pointF.set(rectF.left, rectF.top);
            }
            matrixArr2[i2].setTranslate(pointF.x, pointF.y);
            matrixArr2[i2].preRotate(f3);
            CatchingFishGradleBiometric catchingFishGradleBiometric2 = catchingFishGradleBiometricArr[i2];
            fArr2[0] = catchingFishGradleBiometric2.CatchingFishSnackbar;
            fArr2[1] = catchingFishGradleBiometric2.CatchingFishCoroutine;
            matrixArr2[i2].mapPoints(fArr2);
            matrixArr[i2].reset();
            matrixArr[i2].setTranslate(fArr2[0], fArr2[1]);
            matrixArr[i2].preRotate(f3);
            i3 = i4;
        }
        int i5 = 0;
        for (i = 4; i5 < i; i = 4) {
            CatchingFishGradleBiometric catchingFishGradleBiometric3 = catchingFishGradleBiometricArr[i5];
            catchingFishGradleBiometric3.getClass();
            fArr2[z] = 0.0f;
            fArr2[1] = catchingFishGradleBiometric3.CatchingFishParcelableFAB;
            matrixArr2[i5].mapPoints(fArr2);
            if (i5 == 0) {
                path.moveTo(fArr2[z], fArr2[1]);
            } else {
                path.lineTo(fArr2[z], fArr2[1]);
            }
            catchingFishGradleBiometricArr[i5].CatchingFishSnackbar(matrixArr2[i5], path);
            if (catchingFishCustomViewMoshi != null) {
                CatchingFishGradleBiometric catchingFishGradleBiometric4 = catchingFishGradleBiometricArr[i5];
                Matrix matrix = matrixArr2[i5];
                CatchingFishContextGraphQL catchingFishContextGraphQL = catchingFishCustomViewMoshi.CatchingFishParcelableFAB;
                f2 = 0.0f;
                BitSet bitSet = catchingFishContextGraphQL.CatchingFishViewModelFAB;
                catchingFishGradleBiometric4.getClass();
                bitSet.set(i5, z);
                CatchingFishLifecycleGson[] catchingFishLifecycleGsonArr = catchingFishContextGraphQL.CatchingFishWorkManager;
                catchingFishGradleBiometric4.CatchingFishParcelableFAB(catchingFishGradleBiometric4.CatchingFishDaggerWebsocket);
                catchingFishLifecycleGsonArr[i5] = new CatchingFishGlideBundle(new ArrayList(catchingFishGradleBiometric4.CatchingFishViewModelScope), new Matrix(matrix));
            } else {
                f2 = 0.0f;
            }
            int i6 = i5 + 1;
            int i7 = i6 % 4;
            CatchingFishGradleBiometric catchingFishGradleBiometric5 = catchingFishGradleBiometricArr[i5];
            fArr2[0] = catchingFishGradleBiometric5.CatchingFishSnackbar;
            fArr2[1] = catchingFishGradleBiometric5.CatchingFishCoroutine;
            matrixArr2[i5].mapPoints(fArr2);
            CatchingFishGradleBiometric catchingFishGradleBiometric6 = catchingFishGradleBiometricArr[i7];
            catchingFishGradleBiometric6.getClass();
            float[] fArr3 = this.CatchingFishLayout;
            fArr3[0] = f2;
            fArr3[1] = catchingFishGradleBiometric6.CatchingFishParcelableFAB;
            matrixArr2[i7].mapPoints(fArr3);
            Matrix[] matrixArr3 = matrixArr;
            CatchingFishGradleBiometric[] catchingFishGradleBiometricArr2 = catchingFishGradleBiometricArr;
            float max = Math.max(((float) Math.hypot(fArr2[0] - fArr3[0], fArr2[1] - fArr3[1])) - 0.001f, f2);
            CatchingFishGradleBiometric catchingFishGradleBiometric7 = catchingFishGradleBiometricArr2[i5];
            fArr2[0] = catchingFishGradleBiometric7.CatchingFishSnackbar;
            fArr2[1] = catchingFishGradleBiometric7.CatchingFishCoroutine;
            matrixArr2[i5].mapPoints(fArr2);
            if (i5 == 1 || i5 == 3) {
                Math.abs(rectF.centerX() - fArr2[0]);
            } else {
                Math.abs(rectF.centerY() - fArr2[1]);
            }
            CatchingFishGradleBiometric catchingFishGradleBiometric8 = this.CatchingFishViewModelScope;
            catchingFishGradleBiometric8.CatchingFishReduxKtor(0.0f, 270.0f, 0.0f);
            (i5 != 1 ? i5 != 2 ? i5 != 3 ? catchingFishFragmentMVVM.CatchingFishFragmentHandler : catchingFishFragmentMVVM.CatchingFishLayout : catchingFishFragmentMVVM.CatchingFishEspressoTesting : catchingFishFragmentMVVM.CatchingFishCloudMessaging).getClass();
            catchingFishGradleBiometric8.CatchingFishCoroutine(max, 0.0f);
            Path path4 = this.CatchingFishFragmentHandler;
            path4.reset();
            catchingFishGradleBiometric8.CatchingFishSnackbar(matrixArr3[i5], path4);
            if (this.CatchingFishEspressoTesting && (CatchingFishSnackbar(path4, i5) || CatchingFishSnackbar(path4, i7))) {
                path4.op(path4, path3, Path.Op.DIFFERENCE);
                fArr2[0] = 0.0f;
                fArr2[1] = catchingFishGradleBiometric8.CatchingFishParcelableFAB;
                matrixArr3[i5].mapPoints(fArr2);
                path2.moveTo(fArr2[0], fArr2[1]);
                catchingFishGradleBiometric8.CatchingFishSnackbar(matrixArr3[i5], path2);
            } else {
                catchingFishGradleBiometric8.CatchingFishSnackbar(matrixArr3[i5], path);
            }
            if (catchingFishCustomViewMoshi != null) {
                Matrix matrix2 = matrixArr3[i5];
                CatchingFishContextGraphQL catchingFishContextGraphQL2 = catchingFishCustomViewMoshi.CatchingFishParcelableFAB;
                z2 = false;
                catchingFishContextGraphQL2.CatchingFishViewModelFAB.set(i5 + 4, false);
                CatchingFishLifecycleGson[] catchingFishLifecycleGsonArr2 = catchingFishContextGraphQL2.CatchingFishViewModelScope;
                catchingFishGradleBiometric8.CatchingFishParcelableFAB(catchingFishGradleBiometric8.CatchingFishDaggerWebsocket);
                catchingFishLifecycleGsonArr2[i5] = new CatchingFishGlideBundle(new ArrayList(catchingFishGradleBiometric8.CatchingFishViewModelScope), new Matrix(matrix2));
            } else {
                z2 = false;
            }
            matrixArr = matrixArr3;
            i5 = i6;
            z = z2;
            catchingFishGradleBiometricArr = catchingFishGradleBiometricArr2;
        }
        path.close();
        path2.close();
        if (path2.isEmpty()) {
            return;
        }
        path.op(path2, Path.Op.UNION);
    }

    public final boolean CatchingFishSnackbar(Path path, int i) {
        Path path2 = this.CatchingFishCloudMessaging;
        path2.reset();
        this.CatchingFishParcelableFAB[i].CatchingFishSnackbar(this.CatchingFishSnackbar[i], path2);
        RectF rectF = new RectF();
        path.computeBounds(rectF, true);
        path2.computeBounds(rectF, true);
        path.op(path2, Path.Op.INTERSECT);
        path.computeBounds(rectF, true);
        return !rectF.isEmpty() || (rectF.width() > 1.0f && rectF.height() > 1.0f);
    }
}
