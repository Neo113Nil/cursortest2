package com.yandex.passport.sloth.command.performers;

import android.content.Context;
import android.os.Build;
import android.os.VibrationEffect;
import android.os.Vibrator;
import android.os.VibratorManager;
import defpackage.l2b;
import defpackage.v75;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.KotlinVersion;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class r implements com.yandex.passport.sloth.command.r {
    public final Context a;

    public r(Context context) {
        context.getClass();
        this.a = context;
    }

    @Override // com.yandex.passport.sloth.command.r
    public final Object n(Object obj, com.yandex.passport.sloth.command.f fVar) {
        Vibrator vibrator;
        com.yandex.passport.sloth.command.data.d0 d0Var = (com.yandex.passport.sloth.command.data.d0) obj;
        int i = Build.VERSION.SDK_INT;
        Context context = this.a;
        if (i >= 31) {
            Object systemService = context.getSystemService("vibrator_manager");
            VibratorManager vibratorManager = systemService instanceof VibratorManager ? (VibratorManager) systemService : null;
            if (vibratorManager != null) {
                vibrator = vibratorManager.getDefaultVibrator();
            }
            vibrator = null;
        } else {
            Object systemService2 = context.getSystemService("vibrator");
            if (systemService2 instanceof Vibrator) {
                vibrator = (Vibrator) systemService2;
            }
            vibrator = null;
        }
        Boolean valueOf = vibrator != null ? Boolean.valueOf(vibrator.hasVibrator()) : null;
        List list = d0Var.a;
        list.getClass();
        int size = list.size();
        long[] jArr = new long[size];
        Iterator it = list.iterator();
        boolean z = false;
        int i2 = 0;
        while (it.hasNext()) {
            jArr[i2] = ((Number) it.next()).longValue();
            i2++;
        }
        List list2 = d0Var.b;
        if (!Intrinsics.d(valueOf, Boolean.TRUE) || size == 0 || size != list2.size()) {
            if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                com.yandex.passport.common.logger.a.c(com.yandex.passport.common.logger.b.b, null, "Vibration is not possible: hasVibrator = " + valueOf + ", vibrationPattern = " + jArr + ", vibrationAmplitude = " + list2, 8);
            }
            return new l2b(new com.yandex.passport.sloth.command.a(false));
        }
        try {
            if (i >= 26) {
                List list3 = list2;
                ArrayList arrayList = new ArrayList(v75.o(list3, 10));
                Iterator it2 = list3.iterator();
                while (it2.hasNext()) {
                    arrayList.add(Integer.valueOf((int) (((Number) it2.next()).floatValue() * KotlinVersion.MAX_COMPONENT_VALUE)));
                }
                vibrator.vibrate(VibrationEffect.createWaveform(jArr, CollectionsKt.v0(arrayList), -1));
            } else {
                vibrator.vibrate(jArr, -1);
            }
            if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                com.yandex.passport.common.logger.a.c(com.yandex.passport.common.logger.b.b, null, "Successful performVibration", 8);
            }
            z = true;
        } catch (Exception e) {
            com.yandex.passport.common.logger.d dVar = com.yandex.passport.common.logger.a.a;
            if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                com.yandex.passport.common.logger.a.b(com.yandex.passport.common.logger.b.c, null, "Failed performVibration", e);
            }
        }
        return new l2b(new com.yandex.passport.sloth.command.a(z));
    }
}
