package com.instagram.common.viewpoint.core;

import android.content.SharedPreferences;

/* renamed from: com.facebook.ads.redexgen.X.iC, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C1928iC implements InterfaceC1134Ol {
    public final SharedPreferences.Editor A00;

    public C1928iC(SharedPreferences.Editor editor) {
        this.A00 = editor;
    }

    public final C1928iC A00(String str, long j9) {
        this.A00.putLong(str, j9);
        return this;
    }

    public final C1928iC A01(String str, String str2) {
        this.A00.putString(str, str2);
        return this;
    }

    public final void A02() {
        this.A00.apply();
    }
}
