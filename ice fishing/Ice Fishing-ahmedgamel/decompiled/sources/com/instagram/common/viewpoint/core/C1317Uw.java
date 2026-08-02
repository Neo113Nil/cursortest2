package com.instagram.common.viewpoint.core;

import android.view.View;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.facebook.ads.redexgen.X.Uw, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C1317Uw {
    public final View A00;
    public final C1856ge A01;
    public final VA A02;
    public final String A03;
    public final HashMap<String, String> A04 = new HashMap<>();
    public final boolean A05;
    public final boolean A06;

    public C1317Uw(C1856ge c1856ge, View view, String str, boolean z6, boolean z9) {
        this.A03 = str;
        this.A01 = c1856ge;
        this.A02 = c1856ge.A0A();
        this.A00 = view;
        this.A05 = z9;
        this.A06 = z6;
    }

    public final View A00() {
        return this.A00;
    }

    public final C1856ge A01() {
        return this.A01;
    }

    public final VA A02() {
        return this.A02;
    }

    public final String A03() {
        return this.A03;
    }

    public final Map<String, String> A04() {
        return Collections.unmodifiableMap(this.A04);
    }

    public final boolean A05() {
        return this.A05;
    }

    public final boolean A06() {
        return this.A06;
    }
}
