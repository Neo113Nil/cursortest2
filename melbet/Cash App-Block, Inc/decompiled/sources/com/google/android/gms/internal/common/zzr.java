package com.google.android.gms.internal.common;

import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.colorspace.ColorSpaces;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.android.gms.tasks.zzw;
import com.stripe.android.googlepaylauncher.DirectExecutor;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.rx3.RxAwaitKt$await$5$1;

/* loaded from: classes4.dex */
public abstract class zzr {
    public static Object awaitTask$default(zzw zzwVar, ContinuationImpl continuationImpl) {
        if (zzwVar.isComplete()) {
            return zzwVar;
        }
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(1, IntrinsicsKt__IntrinsicsJvmKt.intercepted(continuationImpl));
        cancellableContinuationImpl.initCancellability();
        zzwVar.addOnCompleteListener(DirectExecutor.INSTANCE, new RxAwaitKt$await$5$1(cancellableContinuationImpl, 4));
        Object result = cancellableContinuationImpl.getResult();
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        return result;
    }

    /* renamed from: lerpColors-jxsXWHM, reason: not valid java name */
    public static final long m2005lerpColorsjxsXWHM(float f, long j, long j2) {
        long Color;
        float f2 = 1.0f - f;
        Color = ColorKt.Color((Color.m681getRedimpl(j2) * f) + (Color.m681getRedimpl(j) * f2), (Color.m680getGreenimpl(j2) * f) + (Color.m680getGreenimpl(j) * f2), (Color.m678getBlueimpl(j2) * f) + (Color.m678getBlueimpl(j) * f2), 1.0f, ColorSpaces.Srgb);
        return Color;
    }

    public static void zzb(int i, int i2) {
        String zza;
        if (i < 0 || i >= i2) {
            if (i < 0) {
                zza = zzx.zza("%s (%s) must not be negative", "index", Integer.valueOf(i));
            } else {
                if (i2 < 0) {
                    a$$ExternalSyntheticBUOutline0.m$3(Boxes$$ExternalSyntheticOutline1.m(i2, "negative size: ", new StringBuilder(String.valueOf(i2).length() + 15)));
                    return;
                }
                zza = zzx.zza("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i), Integer.valueOf(i2));
            }
            throw new IndexOutOfBoundsException(zza);
        }
    }

    public static void zzd(int i, int i2, int i3) {
        if (i < 0 || i2 < i || i2 > i3) {
            throw new IndexOutOfBoundsException((i < 0 || i > i3) ? zze(i, i3, "start index") : (i2 < 0 || i2 > i3) ? zze(i2, i3, "end index") : zzx.zza("end index (%s) must not be less than start index (%s)", Integer.valueOf(i2), Integer.valueOf(i)));
        }
    }

    public static String zze(int i, int i2, String str) {
        if (i < 0) {
            return zzx.zza("%s (%s) must not be negative", str, Integer.valueOf(i));
        }
        if (i2 >= 0) {
            return zzx.zza("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i), Integer.valueOf(i2));
        }
        a$$ExternalSyntheticBUOutline0.m$3(Boxes$$ExternalSyntheticOutline1.m(i2, "negative size: ", new StringBuilder(String.valueOf(i2).length() + 15)));
        return null;
    }
}
