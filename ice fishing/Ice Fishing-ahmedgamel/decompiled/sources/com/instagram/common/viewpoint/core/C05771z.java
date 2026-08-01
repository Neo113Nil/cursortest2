package com.instagram.common.viewpoint.core;

import android.media.AudioAttributes;

/* renamed from: com.facebook.ads.redexgen.X.1z, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C05771z {
    public final AudioAttributes A00;

    public C05771z(C2406qQ c2406qQ) {
        AudioAttributes.Builder usage = new AudioAttributes.Builder().setContentType(c2406qQ.A02).setFlags(c2406qQ.A03).setUsage(c2406qQ.A05);
        if (C5C.A02 >= 29) {
            C05751x.A00(usage, c2406qQ.A01);
        }
        if (C5C.A02 >= 32) {
            C05761y.A00(usage, c2406qQ.A04);
        }
        this.A00 = usage.build();
    }
}
