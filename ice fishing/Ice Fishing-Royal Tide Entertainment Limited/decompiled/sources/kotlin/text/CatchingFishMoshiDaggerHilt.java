package kotlin.text;

import android.graphics.Matrix;
import android.graphics.Paint;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class CatchingFishMoshiDaggerHilt extends CatchingFishGsonGoogleMaps {
    public String CatchingFishCloudMessaging;
    public float CatchingFishCoroutine;
    public float CatchingFishDaggerWebsocket;
    public final Matrix CatchingFishFragmentHandler;
    public float CatchingFishLayout;
    public final Matrix CatchingFishParcelableFAB;
    public float CatchingFishReduxKtor;
    public final ArrayList CatchingFishSnackbar;
    public float CatchingFishViewModelFAB;
    public float CatchingFishViewModelScope;
    public float CatchingFishWorkManager;

    public CatchingFishMoshiDaggerHilt() {
        this.CatchingFishParcelableFAB = new Matrix();
        this.CatchingFishSnackbar = new ArrayList();
        this.CatchingFishCoroutine = 0.0f;
        this.CatchingFishReduxKtor = 0.0f;
        this.CatchingFishDaggerWebsocket = 0.0f;
        this.CatchingFishWorkManager = 1.0f;
        this.CatchingFishViewModelScope = 1.0f;
        this.CatchingFishViewModelFAB = 0.0f;
        this.CatchingFishLayout = 0.0f;
        this.CatchingFishFragmentHandler = new Matrix();
        this.CatchingFishCloudMessaging = null;
    }

    public final void CatchingFishCoroutine() {
        Matrix matrix = this.CatchingFishFragmentHandler;
        matrix.reset();
        matrix.postTranslate(-this.CatchingFishReduxKtor, -this.CatchingFishDaggerWebsocket);
        matrix.postScale(this.CatchingFishWorkManager, this.CatchingFishViewModelScope);
        matrix.postRotate(this.CatchingFishCoroutine, 0.0f, 0.0f);
        matrix.postTranslate(this.CatchingFishViewModelFAB + this.CatchingFishReduxKtor, this.CatchingFishLayout + this.CatchingFishDaggerWebsocket);
    }

    @Override // kotlin.text.CatchingFishGsonGoogleMaps
    public final boolean CatchingFishParcelableFAB() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.CatchingFishSnackbar;
            if (i >= arrayList.size()) {
                return false;
            }
            if (((CatchingFishGsonGoogleMaps) arrayList.get(i)).CatchingFishParcelableFAB()) {
                return true;
            }
            i++;
        }
    }

    @Override // kotlin.text.CatchingFishGsonGoogleMaps
    public final boolean CatchingFishSnackbar(int[] iArr) {
        int i = 0;
        boolean z = false;
        while (true) {
            ArrayList arrayList = this.CatchingFishSnackbar;
            if (i >= arrayList.size()) {
                return z;
            }
            z |= ((CatchingFishGsonGoogleMaps) arrayList.get(i)).CatchingFishSnackbar(iArr);
            i++;
        }
    }

    public String getGroupName() {
        return this.CatchingFishCloudMessaging;
    }

    public Matrix getLocalMatrix() {
        return this.CatchingFishFragmentHandler;
    }

    public float getPivotX() {
        return this.CatchingFishReduxKtor;
    }

    public float getPivotY() {
        return this.CatchingFishDaggerWebsocket;
    }

    public float getRotation() {
        return this.CatchingFishCoroutine;
    }

    public float getScaleX() {
        return this.CatchingFishWorkManager;
    }

    public float getScaleY() {
        return this.CatchingFishViewModelScope;
    }

    public float getTranslateX() {
        return this.CatchingFishViewModelFAB;
    }

    public float getTranslateY() {
        return this.CatchingFishLayout;
    }

    public void setPivotX(float f) {
        if (f != this.CatchingFishReduxKtor) {
            this.CatchingFishReduxKtor = f;
            CatchingFishCoroutine();
        }
    }

    public void setPivotY(float f) {
        if (f != this.CatchingFishDaggerWebsocket) {
            this.CatchingFishDaggerWebsocket = f;
            CatchingFishCoroutine();
        }
    }

    public void setRotation(float f) {
        if (f != this.CatchingFishCoroutine) {
            this.CatchingFishCoroutine = f;
            CatchingFishCoroutine();
        }
    }

    public void setScaleX(float f) {
        if (f != this.CatchingFishWorkManager) {
            this.CatchingFishWorkManager = f;
            CatchingFishCoroutine();
        }
    }

    public void setScaleY(float f) {
        if (f != this.CatchingFishViewModelScope) {
            this.CatchingFishViewModelScope = f;
            CatchingFishCoroutine();
        }
    }

    public void setTranslateX(float f) {
        if (f != this.CatchingFishViewModelFAB) {
            this.CatchingFishViewModelFAB = f;
            CatchingFishCoroutine();
        }
    }

    public void setTranslateY(float f) {
        if (f != this.CatchingFishLayout) {
            this.CatchingFishLayout = f;
            CatchingFishCoroutine();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public CatchingFishMoshiDaggerHilt(CatchingFishMoshiDaggerHilt catchingFishMoshiDaggerHilt, CatchingFishCameraXRetrofit catchingFishCameraXRetrofit) {
        CatchingFishToolbarRoomFlux catchingFishToolbarRoomFlux;
        this.CatchingFishParcelableFAB = new Matrix();
        this.CatchingFishSnackbar = new ArrayList();
        this.CatchingFishCoroutine = 0.0f;
        this.CatchingFishReduxKtor = 0.0f;
        this.CatchingFishDaggerWebsocket = 0.0f;
        this.CatchingFishWorkManager = 1.0f;
        this.CatchingFishViewModelScope = 1.0f;
        this.CatchingFishViewModelFAB = 0.0f;
        this.CatchingFishLayout = 0.0f;
        Matrix matrix = new Matrix();
        this.CatchingFishFragmentHandler = matrix;
        this.CatchingFishCloudMessaging = null;
        this.CatchingFishCoroutine = catchingFishMoshiDaggerHilt.CatchingFishCoroutine;
        this.CatchingFishReduxKtor = catchingFishMoshiDaggerHilt.CatchingFishReduxKtor;
        this.CatchingFishDaggerWebsocket = catchingFishMoshiDaggerHilt.CatchingFishDaggerWebsocket;
        this.CatchingFishWorkManager = catchingFishMoshiDaggerHilt.CatchingFishWorkManager;
        this.CatchingFishViewModelScope = catchingFishMoshiDaggerHilt.CatchingFishViewModelScope;
        this.CatchingFishViewModelFAB = catchingFishMoshiDaggerHilt.CatchingFishViewModelFAB;
        this.CatchingFishLayout = catchingFishMoshiDaggerHilt.CatchingFishLayout;
        String str = catchingFishMoshiDaggerHilt.CatchingFishCloudMessaging;
        this.CatchingFishCloudMessaging = str;
        if (str != null) {
            catchingFishCameraXRetrofit.put(str, this);
        }
        matrix.set(catchingFishMoshiDaggerHilt.CatchingFishFragmentHandler);
        ArrayList arrayList = catchingFishMoshiDaggerHilt.CatchingFishSnackbar;
        for (int i = 0; i < arrayList.size(); i++) {
            Object obj = arrayList.get(i);
            if (obj instanceof CatchingFishMoshiDaggerHilt) {
                this.CatchingFishSnackbar.add(new CatchingFishMoshiDaggerHilt((CatchingFishMoshiDaggerHilt) obj, catchingFishCameraXRetrofit));
            } else {
                if (obj instanceof CatchingFishCameraXKtor) {
                    CatchingFishCameraXKtor catchingFishCameraXKtor = (CatchingFishCameraXKtor) obj;
                    CatchingFishCameraXKtor catchingFishCameraXKtor2 = new CatchingFishCameraXKtor(catchingFishCameraXKtor);
                    catchingFishCameraXKtor2.CatchingFishDaggerWebsocket = 0.0f;
                    catchingFishCameraXKtor2.CatchingFishViewModelScope = 1.0f;
                    catchingFishCameraXKtor2.CatchingFishViewModelFAB = 1.0f;
                    catchingFishCameraXKtor2.CatchingFishLayout = 0.0f;
                    catchingFishCameraXKtor2.CatchingFishFragmentHandler = 1.0f;
                    catchingFishCameraXKtor2.CatchingFishCloudMessaging = 0.0f;
                    catchingFishCameraXKtor2.CatchingFishEspressoTesting = Paint.Cap.BUTT;
                    catchingFishCameraXKtor2.CatchingFishOkHttp = Paint.Join.MITER;
                    catchingFishCameraXKtor2.CatchingFishUnitTesting = 4.0f;
                    catchingFishCameraXKtor2.CatchingFishReduxKtor = catchingFishCameraXKtor.CatchingFishReduxKtor;
                    catchingFishCameraXKtor2.CatchingFishDaggerWebsocket = catchingFishCameraXKtor.CatchingFishDaggerWebsocket;
                    catchingFishCameraXKtor2.CatchingFishViewModelScope = catchingFishCameraXKtor.CatchingFishViewModelScope;
                    catchingFishCameraXKtor2.CatchingFishWorkManager = catchingFishCameraXKtor.CatchingFishWorkManager;
                    catchingFishCameraXKtor2.CatchingFishCoroutine = catchingFishCameraXKtor.CatchingFishCoroutine;
                    catchingFishCameraXKtor2.CatchingFishViewModelFAB = catchingFishCameraXKtor.CatchingFishViewModelFAB;
                    catchingFishCameraXKtor2.CatchingFishLayout = catchingFishCameraXKtor.CatchingFishLayout;
                    catchingFishCameraXKtor2.CatchingFishFragmentHandler = catchingFishCameraXKtor.CatchingFishFragmentHandler;
                    catchingFishCameraXKtor2.CatchingFishCloudMessaging = catchingFishCameraXKtor.CatchingFishCloudMessaging;
                    catchingFishCameraXKtor2.CatchingFishEspressoTesting = catchingFishCameraXKtor.CatchingFishEspressoTesting;
                    catchingFishCameraXKtor2.CatchingFishOkHttp = catchingFishCameraXKtor.CatchingFishOkHttp;
                    catchingFishCameraXKtor2.CatchingFishUnitTesting = catchingFishCameraXKtor.CatchingFishUnitTesting;
                    catchingFishToolbarRoomFlux = catchingFishCameraXKtor2;
                } else if (obj instanceof CatchingFishToolbarRoomFlux) {
                    catchingFishToolbarRoomFlux = new CatchingFishToolbarRoomFlux((CatchingFishToolbarRoomFlux) obj);
                } else {
                    throw new IllegalStateException("Unknown object in the tree!");
                }
                this.CatchingFishSnackbar.add(catchingFishToolbarRoomFlux);
                Object obj2 = catchingFishToolbarRoomFlux.CatchingFishSnackbar;
                if (obj2 != null) {
                    catchingFishCameraXRetrofit.put(obj2, catchingFishToolbarRoomFlux);
                }
            }
        }
    }
}
