package kotlin.text;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PorterDuff;
import android.graphics.Shader;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class CatchingFishKtorPicasso {
    public static final Matrix CatchingFishStateLiveData = new Matrix();
    public final CatchingFishCameraXRetrofit CatchingFishAnimationMockk;
    public float CatchingFishCloudMessaging;
    public final Matrix CatchingFishCoroutine;
    public Paint CatchingFishDaggerWebsocket;
    public int CatchingFishEspressoTesting;
    public float CatchingFishFragmentHandler;
    public float CatchingFishLayout;
    public String CatchingFishOkHttp;
    public final Path CatchingFishParcelableFAB;
    public Paint CatchingFishReduxKtor;
    public final Path CatchingFishSnackbar;
    public Boolean CatchingFishUnitTesting;
    public float CatchingFishViewModelFAB;
    public final CatchingFishMoshiDaggerHilt CatchingFishViewModelScope;
    public PathMeasure CatchingFishWorkManager;

    public CatchingFishKtorPicasso() {
        this.CatchingFishCoroutine = new Matrix();
        this.CatchingFishViewModelFAB = 0.0f;
        this.CatchingFishLayout = 0.0f;
        this.CatchingFishFragmentHandler = 0.0f;
        this.CatchingFishCloudMessaging = 0.0f;
        this.CatchingFishEspressoTesting = 255;
        this.CatchingFishOkHttp = null;
        this.CatchingFishUnitTesting = null;
        this.CatchingFishAnimationMockk = new CatchingFishCameraXRetrofit(0);
        this.CatchingFishViewModelScope = new CatchingFishMoshiDaggerHilt();
        this.CatchingFishParcelableFAB = new Path();
        this.CatchingFishSnackbar = new Path();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void CatchingFishParcelableFAB(CatchingFishMoshiDaggerHilt catchingFishMoshiDaggerHilt, Matrix matrix, Canvas canvas, int i, int i2) {
        int i3;
        float f;
        int i4;
        float f2;
        Matrix matrix2 = catchingFishMoshiDaggerHilt.CatchingFishParcelableFAB;
        ArrayList arrayList = catchingFishMoshiDaggerHilt.CatchingFishSnackbar;
        matrix2.set(matrix);
        Matrix matrix3 = catchingFishMoshiDaggerHilt.CatchingFishParcelableFAB;
        matrix3.preConcat(catchingFishMoshiDaggerHilt.CatchingFishFragmentHandler);
        canvas.save();
        char c = 0;
        int i5 = 0;
        while (i5 < arrayList.size()) {
            CatchingFishGsonGoogleMaps catchingFishGsonGoogleMaps = (CatchingFishGsonGoogleMaps) arrayList.get(i5);
            if (catchingFishGsonGoogleMaps instanceof CatchingFishMoshiDaggerHilt) {
                CatchingFishParcelableFAB((CatchingFishMoshiDaggerHilt) catchingFishGsonGoogleMaps, matrix3, canvas, i, i2);
            } else if (catchingFishGsonGoogleMaps instanceof CatchingFishFragmentLayout) {
                CatchingFishFragmentLayout catchingFishFragmentLayout = (CatchingFishFragmentLayout) catchingFishGsonGoogleMaps;
                float f3 = i / this.CatchingFishFragmentHandler;
                float f4 = i2 / this.CatchingFishCloudMessaging;
                float min = Math.min(f3, f4);
                Matrix matrix4 = this.CatchingFishCoroutine;
                matrix4.set(matrix3);
                matrix4.postScale(f3, f4);
                float[] fArr = {0.0f, 1.0f, 1.0f, 0.0f};
                matrix3.mapVectors(fArr);
                float hypot = (float) Math.hypot(fArr[c], fArr[1]);
                boolean z = c;
                i3 = i5;
                float hypot2 = (float) Math.hypot(fArr[2], fArr[3]);
                float f5 = (fArr[z ? 1 : 0] * fArr[3]) - (fArr[1] * fArr[2]);
                float max = Math.max(hypot, hypot2);
                float abs = max > 0.0f ? Math.abs(f5) / max : 0.0f;
                if (abs != 0.0f) {
                    catchingFishFragmentLayout.getClass();
                    Path path = this.CatchingFishParcelableFAB;
                    path.reset();
                    CatchingFishPayPalFragment[] catchingFishPayPalFragmentArr = catchingFishFragmentLayout.CatchingFishParcelableFAB;
                    if (catchingFishPayPalFragmentArr != null) {
                        CatchingFishPayPalFragment.CatchingFishSnackbar(catchingFishPayPalFragmentArr, path);
                    }
                    Path path2 = this.CatchingFishSnackbar;
                    path2.reset();
                    if (catchingFishFragmentLayout instanceof CatchingFishToolbarRoomFlux) {
                        path2.setFillType(catchingFishFragmentLayout.CatchingFishCoroutine == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                        path2.addPath(path, matrix4);
                        canvas.clipPath(path2);
                    } else {
                        CatchingFishCameraXKtor catchingFishCameraXKtor = (CatchingFishCameraXKtor) catchingFishFragmentLayout;
                        float f6 = catchingFishCameraXKtor.CatchingFishLayout;
                        if (f6 != 0.0f || catchingFishCameraXKtor.CatchingFishFragmentHandler != 1.0f) {
                            float f7 = catchingFishCameraXKtor.CatchingFishCloudMessaging;
                            float f8 = (f6 + f7) % 1.0f;
                            float f9 = (catchingFishCameraXKtor.CatchingFishFragmentHandler + f7) % 1.0f;
                            if (this.CatchingFishWorkManager == null) {
                                this.CatchingFishWorkManager = new PathMeasure();
                            }
                            this.CatchingFishWorkManager.setPath(path, z);
                            float length = this.CatchingFishWorkManager.getLength();
                            float f10 = f8 * length;
                            float f11 = f9 * length;
                            path.reset();
                            if (f10 > f11) {
                                this.CatchingFishWorkManager.getSegment(f10, length, path, true);
                                f = 0.0f;
                                this.CatchingFishWorkManager.getSegment(0.0f, f11, path, true);
                            } else {
                                f = 0.0f;
                                this.CatchingFishWorkManager.getSegment(f10, f11, path, true);
                            }
                            path.rLineTo(f, f);
                        }
                        path2.addPath(path, matrix4);
                        CatchingFishGsonWebSocket catchingFishGsonWebSocket = catchingFishCameraXKtor.CatchingFishWorkManager;
                        if (((Shader) catchingFishGsonWebSocket.CatchingFishCoroutine) == null && catchingFishGsonWebSocket.CatchingFishSnackbar == 0) {
                            f2 = 255.0f;
                            i4 = 16777215;
                        } else {
                            if (this.CatchingFishDaggerWebsocket == null) {
                                i4 = 16777215;
                                Paint paint = new Paint(1);
                                this.CatchingFishDaggerWebsocket = paint;
                                paint.setStyle(Paint.Style.FILL);
                            } else {
                                i4 = 16777215;
                            }
                            Paint paint2 = this.CatchingFishDaggerWebsocket;
                            Shader shader = (Shader) catchingFishGsonWebSocket.CatchingFishCoroutine;
                            if (shader != null) {
                                shader.setLocalMatrix(matrix4);
                                paint2.setShader(shader);
                                paint2.setAlpha(Math.round(catchingFishCameraXKtor.CatchingFishViewModelFAB * 255.0f));
                                f2 = 255.0f;
                            } else {
                                paint2.setShader(null);
                                paint2.setAlpha(255);
                                int i6 = catchingFishGsonWebSocket.CatchingFishSnackbar;
                                float f12 = catchingFishCameraXKtor.CatchingFishViewModelFAB;
                                PorterDuff.Mode mode = CatchingFishPayPalRoomFlux.CatchingFishOkHttp;
                                f2 = 255.0f;
                                paint2.setColor((i6 & i4) | (((int) (Color.alpha(i6) * f12)) << 24));
                            }
                            paint2.setColorFilter(null);
                            path2.setFillType(catchingFishCameraXKtor.CatchingFishCoroutine == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                            canvas.drawPath(path2, paint2);
                        }
                        CatchingFishGsonWebSocket catchingFishGsonWebSocket2 = catchingFishCameraXKtor.CatchingFishReduxKtor;
                        if (((Shader) catchingFishGsonWebSocket2.CatchingFishCoroutine) != null || catchingFishGsonWebSocket2.CatchingFishSnackbar != 0) {
                            if (this.CatchingFishReduxKtor == null) {
                                Paint paint3 = new Paint(1);
                                this.CatchingFishReduxKtor = paint3;
                                paint3.setStyle(Paint.Style.STROKE);
                            }
                            Paint paint4 = this.CatchingFishReduxKtor;
                            Paint.Join join = catchingFishCameraXKtor.CatchingFishOkHttp;
                            if (join != null) {
                                paint4.setStrokeJoin(join);
                            }
                            Paint.Cap cap = catchingFishCameraXKtor.CatchingFishEspressoTesting;
                            if (cap != null) {
                                paint4.setStrokeCap(cap);
                            }
                            paint4.setStrokeMiter(catchingFishCameraXKtor.CatchingFishUnitTesting);
                            Shader shader2 = (Shader) catchingFishGsonWebSocket2.CatchingFishCoroutine;
                            if (shader2 != null) {
                                shader2.setLocalMatrix(matrix4);
                                paint4.setShader(shader2);
                                paint4.setAlpha(Math.round(catchingFishCameraXKtor.CatchingFishViewModelScope * f2));
                            } else {
                                paint4.setShader(null);
                                paint4.setAlpha(255);
                                int i7 = catchingFishGsonWebSocket2.CatchingFishSnackbar;
                                float f13 = catchingFishCameraXKtor.CatchingFishViewModelScope;
                                PorterDuff.Mode mode2 = CatchingFishPayPalRoomFlux.CatchingFishOkHttp;
                                paint4.setColor((i7 & i4) | (((int) (Color.alpha(i7) * f13)) << 24));
                            }
                            paint4.setColorFilter(null);
                            paint4.setStrokeWidth(catchingFishCameraXKtor.CatchingFishDaggerWebsocket * min * abs);
                            canvas.drawPath(path2, paint4);
                        }
                    }
                }
                i5 = i3 + 1;
                c = 0;
            }
            i3 = i5;
            i5 = i3 + 1;
            c = 0;
        }
        canvas.restore();
    }

    public float getAlpha() {
        return getRootAlpha() / 255.0f;
    }

    public int getRootAlpha() {
        return this.CatchingFishEspressoTesting;
    }

    public void setAlpha(float f) {
        setRootAlpha((int) (f * 255.0f));
    }

    public void setRootAlpha(int i) {
        this.CatchingFishEspressoTesting = i;
    }

    public CatchingFishKtorPicasso(CatchingFishKtorPicasso catchingFishKtorPicasso) {
        this.CatchingFishCoroutine = new Matrix();
        this.CatchingFishViewModelFAB = 0.0f;
        this.CatchingFishLayout = 0.0f;
        this.CatchingFishFragmentHandler = 0.0f;
        this.CatchingFishCloudMessaging = 0.0f;
        this.CatchingFishEspressoTesting = 255;
        this.CatchingFishOkHttp = null;
        this.CatchingFishUnitTesting = null;
        CatchingFishCameraXRetrofit catchingFishCameraXRetrofit = new CatchingFishCameraXRetrofit(0);
        this.CatchingFishAnimationMockk = catchingFishCameraXRetrofit;
        this.CatchingFishViewModelScope = new CatchingFishMoshiDaggerHilt(catchingFishKtorPicasso.CatchingFishViewModelScope, catchingFishCameraXRetrofit);
        this.CatchingFishParcelableFAB = new Path(catchingFishKtorPicasso.CatchingFishParcelableFAB);
        this.CatchingFishSnackbar = new Path(catchingFishKtorPicasso.CatchingFishSnackbar);
        this.CatchingFishViewModelFAB = catchingFishKtorPicasso.CatchingFishViewModelFAB;
        this.CatchingFishLayout = catchingFishKtorPicasso.CatchingFishLayout;
        this.CatchingFishFragmentHandler = catchingFishKtorPicasso.CatchingFishFragmentHandler;
        this.CatchingFishCloudMessaging = catchingFishKtorPicasso.CatchingFishCloudMessaging;
        this.CatchingFishEspressoTesting = catchingFishKtorPicasso.CatchingFishEspressoTesting;
        this.CatchingFishOkHttp = catchingFishKtorPicasso.CatchingFishOkHttp;
        String str = catchingFishKtorPicasso.CatchingFishOkHttp;
        if (str != null) {
            catchingFishCameraXRetrofit.put(str, this);
        }
        this.CatchingFishUnitTesting = catchingFishKtorPicasso.CatchingFishUnitTesting;
    }
}
