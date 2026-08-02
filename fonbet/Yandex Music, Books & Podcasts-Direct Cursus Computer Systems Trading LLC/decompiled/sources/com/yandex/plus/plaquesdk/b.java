package com.yandex.plus.plaquesdk;

import android.content.Context;
import android.os.Build;
import android.os.VibrationEffect;
import android.os.Vibrator;
import android.os.VibratorManager;

/* loaded from: classes5.dex */
public abstract class b {
    public static long a = -1;
    public static Vibrator b;

    public static final void a(Context context) {
        boolean hasAmplitudeControl;
        Vibrator vibrator;
        context.getClass();
        a aVar = a.TICK;
        if (b == null) {
            if (Build.VERSION.SDK_INT >= 31) {
                Object systemService = context.getSystemService("vibrator_manager");
                systemService.getClass();
                vibrator = ((VibratorManager) systemService).getDefaultVibrator();
            } else {
                Object systemService2 = context.getSystemService("vibrator");
                systemService2.getClass();
                vibrator = (Vibrator) systemService2;
            }
            b = vibrator;
        }
        Vibrator vibrator2 = b;
        Vibrator vibrator3 = (vibrator2 == null || !vibrator2.hasVibrator()) ? null : b;
        if (vibrator3 == null) {
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        long j = a;
        if (j == -1 || (currentTimeMillis - j) - 100 >= 0) {
            a = currentTimeMillis;
            if (Build.VERSION.SDK_INT < 26 || !(hasAmplitudeControl = vibrator3.hasAmplitudeControl())) {
                return;
            }
            if (aVar.d == null) {
                aVar.d = hasAmplitudeControl ? VibrationEffect.createWaveform(aVar.a, aVar.b, -1) : VibrationEffect.createOneShot(aVar.c[0], -1);
            }
            Object obj = aVar.d;
            obj.getClass();
            vibrator3.vibrate((VibrationEffect) obj);
        }
    }
}
