package defpackage;

import android.content.Context;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraManager;
import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.Pair;
import kotlin.collections.b;

/* loaded from: classes4.dex */
public final class zcm implements tsr, ca20 {
    public ea20 a;
    public Context b;

    public final Map a(int i) {
        Context context = this.b;
        Object systemService = context != null ? context.getSystemService("camera") : null;
        CameraManager cameraManager = systemService instanceof CameraManager ? (CameraManager) systemService : null;
        if (cameraManager == null) {
            ny61.r("CameraManager is not available");
            return null;
        }
        String[] cameraIdList = cameraManager.getCameraIdList();
        if (i < 0 || i >= cameraIdList.length) {
            ny61.g(oyr.h(i, cameraIdList.length, "Invalid camera index: ", ". Available cameras: "));
            return null;
        }
        CameraCharacteristics cameraCharacteristics = cameraManager.getCameraCharacteristics(cameraIdList[i]);
        Double valueOf = Double.valueOf(1.0d);
        try {
            Context context2 = this.b;
            Object systemService2 = context2 != null ? context2.getSystemService("camera") : null;
            CameraManager cameraManager2 = systemService2 instanceof CameraManager ? (CameraManager) systemService2 : null;
            if (cameraManager2 == null) {
                throw new IllegalStateException("CameraManager is not available");
            }
            String[] cameraIdList2 = cameraManager2.getCameraIdList();
            if (cameraIdList2.length == 0) {
                throw new IllegalStateException("Available cameras empty");
            }
            ArrayList arrayList = new ArrayList();
            for (String str : cameraIdList2) {
                Integer num = (Integer) cameraManager2.getCameraCharacteristics(str).get(CameraCharacteristics.LENS_FACING);
                if (num != null && num.intValue() == 1) {
                    arrayList.add(str);
                }
            }
            if (arrayList.size() <= 1) {
                return b.i(new Pair("type", "wide"), new Pair("zoom", valueOf));
            }
            CameraCharacteristics cameraCharacteristics2 = cameraManager2.getCameraCharacteristics(cameraIdList2[0]);
            CameraCharacteristics.Key key = CameraCharacteristics.LENS_INFO_AVAILABLE_FOCAL_LENGTHS;
            float[] fArr = (float[]) cameraCharacteristics2.get(key);
            if (fArr != null && fArr.length != 0) {
                Float R = j73.R(fArr);
                float floatValue = R != null ? R.floatValue() : fArr[0];
                float[] fArr2 = (float[]) cameraCharacteristics.get(key);
                if (fArr2 != null && fArr2.length != 0) {
                    Float R2 = j73.R(fArr2);
                    double floatValue2 = (R2 != null ? R2.floatValue() : fArr2[0]) / floatValue;
                    double d = floatValue2 < 0.55d ? 0.5d : floatValue2 < 0.65d ? 0.6d : floatValue2 < 0.85d ? 0.7d : 1.0d;
                    return b.i(new Pair("type", d < 1.0d ? "ultraWide" : "wide"), new Pair("zoom", Double.valueOf(d)));
                }
                return b.i(new Pair("type", "wide"), new Pair("zoom", valueOf));
            }
            return b.i(new Pair("type", "wide"), new Pair("zoom", valueOf));
        } catch (Exception e) {
            ny61.h(g8e.o("Failed to determine lens type: ", e.getMessage()), e);
            return null;
        }
    }

    public final boolean b() {
        Float R;
        try {
            Context context = this.b;
            Object systemService = context != null ? context.getSystemService("camera") : null;
            CameraManager cameraManager = systemService instanceof CameraManager ? (CameraManager) systemService : null;
            if (cameraManager == null) {
                return false;
            }
            for (String str : cameraManager.getCameraIdList()) {
                float[] fArr = (float[]) cameraManager.getCameraCharacteristics(str).get(CameraCharacteristics.LENS_INFO_AVAILABLE_FOCAL_LENGTHS);
                if (fArr != null) {
                    if (!(fArr.length == 0) && (R = j73.R(fArr)) != null && R.floatValue() < 1.9f) {
                        return true;
                    }
                }
            }
            return false;
        } catch (Exception e) {
            ny61.r(g8e.o("Failed to check wide angle camera availability: ", e.getMessage()));
            return false;
        }
    }

    @Override // defpackage.tsr
    public final void onAttachedToEngine(ssr ssrVar) {
        this.b = ssrVar.a;
        ea20 ea20Var = new ea20(ssrVar.c, "drive_camera_type_detector");
        this.a = ea20Var;
        ea20Var.b(this);
    }

    @Override // defpackage.tsr
    public final void onDetachedFromEngine(ssr ssrVar) {
        ea20 ea20Var = this.a;
        if (ea20Var == null) {
            ea20Var = null;
        }
        ea20Var.b(null);
        this.b = null;
    }

    @Override // defpackage.ca20
    public final void onMethodCall(x920 x920Var, da20 da20Var) {
        String str = x920Var.a;
        if (!jl40.l(str, "getLensType")) {
            if (!jl40.l(str, "isWideAngleCameraAvailable")) {
                ((ba20) da20Var).notImplemented();
                return;
            }
            try {
                ((ba20) da20Var).success(Boolean.valueOf(b()));
                return;
            } catch (CancellationException e) {
                throw e;
            } catch (Exception e2) {
                ((ba20) da20Var).error("WIDE_ANGLE_CHECK_ERROR", g8e.o("Error checking wide angle camera: ", e2.getMessage()), null);
                return;
            }
        }
        try {
            Integer num = (Integer) x920Var.b;
            if (num == null) {
                ((ba20) da20Var).error("INVALID_ARGUMENT", "cameraId is null", null);
            } else {
                ((ba20) da20Var).success(a(num.intValue()));
            }
        } catch (CancellationException e3) {
            throw e3;
        } catch (Exception e4) {
            ((ba20) da20Var).error("LENS_TYPE_ERROR", g8e.o("Error getting lens type: ", e4.getMessage()), null);
        }
    }
}
