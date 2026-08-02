package com.google.android.gms.internal.ads;

import android.media.AudioAttributes;
import android.os.Build;

/* renamed from: com.google.android.gms.internal.ads.Qj, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2764Qj {

    /* renamed from: b, reason: collision with root package name */
    public static final C2764Qj f27843b = new C2764Qj();

    /* renamed from: a, reason: collision with root package name */
    public AudioAttributes f27844a;

    static {
        String str = AbstractC3182eu.f30782a;
        Integer.toString(0, 36);
        Integer.toString(1, 36);
        Integer.toString(2, 36);
        Integer.toString(3, 36);
        Integer.toString(4, 36);
        Integer.toString(5, 36);
        Integer.toString(6, 36);
    }

    public final AudioAttributes a() {
        if (this.f27844a == null) {
            AudioAttributes.Builder usage = new AudioAttributes.Builder().setContentType(0).setFlags(0).setUsage(1);
            int i = Build.VERSION.SDK_INT;
            if (i >= 29) {
                usage.setAllowedCapturePolicy(1);
                usage.setHapticChannelsMuted(true);
            }
            if (i >= 32) {
                usage.setSpatializationBehavior(0);
                usage.setIsContentSpatialized(false);
            }
            this.f27844a = usage.build();
        }
        return this.f27844a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C2764Qj.class != obj.getClass()) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return -436042064;
    }
}
