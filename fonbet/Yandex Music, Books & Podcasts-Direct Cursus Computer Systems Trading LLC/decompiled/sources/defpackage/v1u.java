package defpackage;

import android.content.Context;
import android.os.Build;
import android.os.VibrationEffect;
import android.os.Vibrator;
import android.os.VibratorManager;

/* loaded from: classes3.dex */
public final class v1u {
    public final Context a;
    public final jyr b = btf.b(new wfs(15, this));

    public v1u(Context context) {
        this.a = context;
    }

    public static Vibrator a(v1u v1uVar) {
        int i = Build.VERSION.SDK_INT;
        Context context = v1uVar.a;
        if (i >= 31) {
            Object systemService = context.getSystemService("vibrator_manager");
            VibratorManager vibratorManager = systemService instanceof VibratorManager ? (VibratorManager) systemService : null;
            if (vibratorManager != null) {
                return vibratorManager.getDefaultVibrator();
            }
        } else {
            Object systemService2 = context.getSystemService("vibrator");
            if (systemService2 instanceof Vibrator) {
                return (Vibrator) systemService2;
            }
        }
        return null;
    }

    public final void b(long j) {
        jyr jyrVar = this.b;
        Vibrator vibrator = (Vibrator) jyrVar.getValue();
        if (vibrator == null || !vibrator.hasVibrator()) {
            return;
        }
        if (Build.VERSION.SDK_INT < 26) {
            Vibrator vibrator2 = (Vibrator) jyrVar.getValue();
            if (vibrator2 != null) {
                vibrator2.vibrate(j);
                return;
            }
            return;
        }
        VibrationEffect createOneShot = VibrationEffect.createOneShot(j, -1);
        Vibrator vibrator3 = (Vibrator) jyrVar.getValue();
        if (vibrator3 != null) {
            vibrator3.vibrate(createOneShot);
        }
    }
}
