package com.instagram.common.viewpoint.core;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Nullable;

/* renamed from: com.facebook.ads.redexgen.X.fq, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C1786fq {
    public float A00;
    public EnumC1064Lr A01;
    public Map<String, String> A02;

    public C1786fq(EnumC1064Lr enumC1064Lr) {
        this(enumC1064Lr, 0.0f);
    }

    public C1786fq(EnumC1064Lr enumC1064Lr, float f3) {
        this(enumC1064Lr, f3, null);
    }

    public C1786fq(@Nullable EnumC1064Lr enumC1064Lr, float f3, Map<String, String> windowParams) {
        this.A01 = enumC1064Lr;
        this.A00 = f3;
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

    public final EnumC1064Lr A02() {
        return this.A01;
    }

    public final Map<String, String> A03() {
        return this.A02;
    }

    public final boolean A04() {
        return this.A01 == EnumC1064Lr.A0I;
    }
}
