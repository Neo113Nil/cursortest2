package com.instagram.common.viewpoint.core;

import android.media.AudioAttributes;

/* renamed from: com.facebook.ads.redexgen.X.1z, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C05971z {
    public final AudioAttributes A00;

    public C05971z(C2426qQ c2426qQ) {
        AudioAttributes.Builder usage = new AudioAttributes.Builder().setContentType(c2426qQ.A02).setFlags(c2426qQ.A03).setUsage(c2426qQ.A05);
        if (C5C.A02 >= 29) {
            C05951x.A00(usage, c2426qQ.A01);
        }
        if (C5C.A02 >= 32) {
            C05961y.A00(usage, c2426qQ.A04);
        }
        this.A00 = usage.build();
    }
}
