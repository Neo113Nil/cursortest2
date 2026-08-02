package defpackage;

import android.content.SharedPreferences;
import android.hardware.camera2.CaptureResult;
import android.os.Handler;
import android.os.SystemClock;
import androidx.camera.core.impl.CameraCaptureMetaData$AeState;
import androidx.camera.core.impl.CameraCaptureMetaData$AfState;
import androidx.camera.core.impl.CameraCaptureMetaData$AwbState;
import androidx.camera.core.impl.CameraCaptureMetaData$FlashState;
import androidx.camera.core.impl.utils.ExifData$WhiteBalanceMode;
import com.google.android.gms.internal.mlkit_vision_subject_segmentation.zznz;
import com.google.android.gms.internal.mlkit_vision_subject_segmentation.zzoa;
import java.nio.BufferUnderflowException;
import java.util.ArrayList;
import java.util.Map;
import ru.cprocsp.ACSP.tools.config.ConfigConstants;

/* loaded from: classes10.dex */
public final class vjx implements ap7, mrb1 {
    public long a;
    public final Object b;
    public final Object c;

    public vjx(Handler handler, SharedPreferences sharedPreferences) {
        this.b = handler;
        this.c = sharedPreferences;
        this.a = sharedPreferences.getLong("push_settings_last_sent", -1L);
    }

    @Override // defpackage.ap7
    public void a(ilo iloVar) {
        ArrayList arrayList = iloVar.a;
        Map map = (Map) this.b;
        super.a(iloVar);
        try {
            Integer num = (Integer) map.get(CaptureResult.JPEG_ORIENTATION);
            if (num != null) {
                iloVar.f(num.intValue());
            }
        } catch (BufferUnderflowException unused) {
            sgb1.g(5, "KeyValueMapCameraCaptureResult");
        }
        if (((Long) map.get(CaptureResult.SENSOR_EXPOSURE_TIME)) != null) {
            iloVar.c("ExposureTime", String.valueOf(r6.longValue() / 1.0E9d), arrayList);
        }
        Float f = (Float) map.get(CaptureResult.LENS_APERTURE);
        if (f != null) {
            iloVar.c("FNumber", String.valueOf(f.floatValue()), arrayList);
        }
        Integer num2 = (Integer) map.get(CaptureResult.SENSOR_SENSITIVITY);
        if (num2 != null) {
            if (((Integer) map.get(CaptureResult.CONTROL_POST_RAW_SENSITIVITY_BOOST)) != null) {
                num2 = Integer.valueOf(num2.intValue() * ((int) (r0.intValue() / 100.0f)));
            }
            iloVar.e(num2.intValue());
        }
        Float f2 = (Float) map.get(CaptureResult.LENS_FOCAL_LENGTH);
        if (f2 != null) {
            iloVar.d(f2.floatValue());
        }
        Integer num3 = (Integer) map.get(CaptureResult.CONTROL_AWB_MODE);
        if (num3 != null) {
            ExifData$WhiteBalanceMode exifData$WhiteBalanceMode = ExifData$WhiteBalanceMode.AUTO;
            if (num3.intValue() == 0) {
                exifData$WhiteBalanceMode = ExifData$WhiteBalanceMode.MANUAL;
            }
            iloVar.g(exifData$WhiteBalanceMode);
        }
    }

    @Override // defpackage.ap7
    public q6x0 b() {
        return (q6x0) this.c;
    }

    @Override // defpackage.mrb1
    public o3 c() {
        bga1 bga1Var = (bga1) this.b;
        zzoa zzoaVar = (zzoa) this.c;
        long j = this.a;
        l8b1 l8b1Var = new l8b1();
        l8b1Var.c = zznz.TYPE_THIN;
        fkb1 fkb1Var = new fkb1();
        fkb1Var.c = bga1Var.e.a();
        fkb1Var.a = zzoaVar;
        fkb1Var.b = Long.valueOf((SystemClock.elapsedRealtime() - j) & ConfigConstants.VAL_WARNING_2001_VALUE_DISABLED);
        l8b1Var.e = new kkb1(fkb1Var);
        return new o3(l8b1Var, 0);
    }

    @Override // defpackage.ap7
    public CameraCaptureMetaData$FlashState d() {
        Integer num = (Integer) ((Map) this.b).get(CaptureResult.FLASH_STATE);
        if (num == null) {
            return CameraCaptureMetaData$FlashState.UNKNOWN;
        }
        int intValue = num.intValue();
        if (intValue == 0 || intValue == 1) {
            return CameraCaptureMetaData$FlashState.NONE;
        }
        if (intValue == 2) {
            return CameraCaptureMetaData$FlashState.READY;
        }
        if (intValue == 3 || intValue == 4) {
            return CameraCaptureMetaData$FlashState.FIRED;
        }
        sgb1.d("KeyValueMapCameraCaptureResult", "Undefined flash state: " + num);
        return CameraCaptureMetaData$FlashState.UNKNOWN;
    }

    @Override // defpackage.ap7
    public CameraCaptureMetaData$AfState f() {
        Integer num = (Integer) ((Map) this.b).get(CaptureResult.CONTROL_AF_STATE);
        if (num == null) {
            return CameraCaptureMetaData$AfState.UNKNOWN;
        }
        switch (num.intValue()) {
            case 0:
                break;
            case 1:
            case 3:
                break;
            case 2:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            default:
                sgb1.d("KeyValueMapCameraCaptureResult", "Undefined af state: " + num);
                break;
        }
        return CameraCaptureMetaData$AfState.UNKNOWN;
    }

    @Override // defpackage.ap7
    public long getTimestamp() {
        return this.a;
    }

    @Override // defpackage.ap7
    public CameraCaptureMetaData$AwbState i() {
        Integer num = (Integer) ((Map) this.b).get(CaptureResult.CONTROL_AWB_STATE);
        if (num == null) {
            return CameraCaptureMetaData$AwbState.UNKNOWN;
        }
        int intValue = num.intValue();
        if (intValue == 0) {
            return CameraCaptureMetaData$AwbState.INACTIVE;
        }
        if (intValue == 1) {
            return CameraCaptureMetaData$AwbState.METERING;
        }
        if (intValue == 2) {
            return CameraCaptureMetaData$AwbState.CONVERGED;
        }
        if (intValue == 3) {
            return CameraCaptureMetaData$AwbState.LOCKED;
        }
        sgb1.d("KeyValueMapCameraCaptureResult", "Undefined awb state: " + num);
        return CameraCaptureMetaData$AwbState.UNKNOWN;
    }

    @Override // defpackage.ap7
    public CameraCaptureMetaData$AeState l() {
        Integer num = (Integer) ((Map) this.b).get(CaptureResult.CONTROL_AE_STATE);
        if (num == null) {
            return CameraCaptureMetaData$AeState.UNKNOWN;
        }
        int intValue = num.intValue();
        if (intValue == 0) {
            return CameraCaptureMetaData$AeState.INACTIVE;
        }
        if (intValue != 1) {
            if (intValue == 2) {
                return CameraCaptureMetaData$AeState.CONVERGED;
            }
            if (intValue == 3) {
                return CameraCaptureMetaData$AeState.LOCKED;
            }
            if (intValue == 4) {
                return CameraCaptureMetaData$AeState.FLASH_REQUIRED;
            }
            if (intValue != 5) {
                sgb1.d("KeyValueMapCameraCaptureResult", "Undefined ae state: " + num);
                return CameraCaptureMetaData$AeState.UNKNOWN;
            }
        }
        return CameraCaptureMetaData$AeState.SEARCHING;
    }

    @Override // defpackage.ap7
    public CaptureResult m() {
        return null;
    }

    public vjx(long j, q6x0 q6x0Var, Map map) {
        this.b = map;
        this.c = q6x0Var;
        this.a = j;
    }

    public /* synthetic */ vjx(long j, Object obj, Object obj2) {
        this.b = obj;
        this.c = obj2;
        this.a = j;
    }
}
