package com.instagram.common.viewpoint.core;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Nullable;

/* renamed from: com.facebook.ads.redexgen.X.fq, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C1806fq {
    public float A00;
    public EnumC1084Lr A01;
    public Map<String, String> A02;

    public C1806fq(EnumC1084Lr enumC1084Lr) {
        this(enumC1084Lr, 0.0f);
    }

    public C1806fq(EnumC1084Lr enumC1084Lr, float f2) {
        this(enumC1084Lr, f2, null);
    }

    public C1806fq(@Nullable EnumC1084Lr enumC1084Lr, float f2, Map<String, String> windowParams) {
        this.A01 = enumC1084Lr;
        this.A00 = f2;
        if (windowParams != null) {
            this.A02 = windowParams;
        } else {
            this.A02 = new HashMap();
        }
    }

    public final float A00() {
        return this.A00;
    }

    public final int A01() {
        return this.A01.A03();
    }

    public final EnumC1084Lr A02() {
        return this.A01;
    }

    public final Map<String, String> A03() {
        return this.A02;
    }

    public final boolean A04() {
        return this.A01 == EnumC1084Lr.A0I;
    }
}
