package defpackage;

import android.graphics.Rect;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.TotalCaptureResult;
import android.os.Build;
import android.util.Range;
import androidx.camera.core.CameraControl$OperationCanceledException;
import androidx.camera.core.impl.Config$OptionPriority;
import androidx.concurrent.futures.b;

/* loaded from: classes10.dex */
public final class xb2 implements ye61 {
    public final ep7 a;
    public final Range b;
    public b w;
    public final boolean y;
    public float c = 1.0f;
    public float x = 1.0f;

    public xb2(ep7 ep7Var) {
        CameraCharacteristics.Key key;
        CameraCharacteristics.Key key2;
        boolean z = false;
        this.y = false;
        this.a = ep7Var;
        key = CameraCharacteristics.CONTROL_ZOOM_RATIO_RANGE;
        this.b = (Range) ep7Var.a(key);
        if (Build.VERSION.SDK_INT >= 34) {
            sr4 sr4Var = ep7Var.b;
            key2 = CameraCharacteristics.CONTROL_AVAILABLE_SETTINGS_OVERRIDES;
            int[] iArr = (int[]) ((CameraCharacteristics) sr4Var.b).get(key2);
            if (iArr != null) {
                int length = iArr.length;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        break;
                    }
                    if (iArr[i] == 1) {
                        z = true;
                        break;
                    }
                    i++;
                }
            }
        }
        this.y = z;
    }

    @Override // defpackage.ye61
    public final void b(TotalCaptureResult totalCaptureResult) {
        CaptureRequest.Key key;
        Float f;
        if (this.w != null) {
            CaptureRequest request = totalCaptureResult.getRequest();
            if (request == null) {
                f = null;
            } else {
                key = CaptureRequest.CONTROL_ZOOM_RATIO;
                f = (Float) request.get(key);
            }
            if (f == null) {
                return;
            }
            if (this.x == f.floatValue()) {
                this.w.b(null);
                this.w = null;
            }
        }
    }

    @Override // defpackage.ye61
    public final void d(float f, b bVar) {
        this.c = f;
        b bVar2 = this.w;
        if (bVar2 != null) {
            bVar2.d(new CameraControl$OperationCanceledException("There is a new zoomRatio being set"));
        }
        this.x = this.c;
        this.w = bVar;
    }

    @Override // defpackage.ye61
    public final void f(vn7 vn7Var) {
        CaptureRequest.Key key;
        CaptureRequest.Key key2;
        key = CaptureRequest.CONTROL_ZOOM_RATIO;
        Float valueOf = Float.valueOf(this.c);
        Config$OptionPriority config$OptionPriority = Config$OptionPriority.REQUIRED;
        vn7Var.c(key, valueOf, config$OptionPriority);
        if (!this.y || Build.VERSION.SDK_INT < 34) {
            return;
        }
        key2 = CaptureRequest.CONTROL_SETTINGS_OVERRIDE;
        vn7Var.c(key2, 1, config$OptionPriority);
    }

    @Override // defpackage.ye61
    public final float getMaxZoom() {
        return ((Float) this.b.getUpper()).floatValue();
    }

    @Override // defpackage.ye61
    public final float getMinZoom() {
        return ((Float) this.b.getLower()).floatValue();
    }

    @Override // defpackage.ye61
    public final void i() {
        this.c = 1.0f;
        b bVar = this.w;
        if (bVar != null) {
            bVar.d(new CameraControl$OperationCanceledException("Camera is not active."));
            this.w = null;
        }
    }

    @Override // defpackage.ye61
    public final Rect j() {
        Rect rect = (Rect) this.a.a(CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE);
        rect.getClass();
        return rect;
    }
}
