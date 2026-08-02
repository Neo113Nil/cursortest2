package com.google.android.gms.internal.ads;

import java.util.Arrays;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: com.google.android.gms.internal.ads.bK, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2995bK implements InterfaceC3795qE {

    /* renamed from: e, reason: collision with root package name */
    public static final byte[] f30072e = {0};

    /* renamed from: a, reason: collision with root package name */
    public final YG f30073a;

    /* renamed from: b, reason: collision with root package name */
    public final int f30074b;

    /* renamed from: c, reason: collision with root package name */
    public final byte[] f30075c;

    /* renamed from: d, reason: collision with root package name */
    public final byte[] f30076d;

    public C2995bK(EG eg) {
        this.f30073a = C2944aN.k(WG.i(XG.b(eg.f25335b.f25751a), eg.f25336c));
        GG gg = eg.f25335b;
        this.f30074b = gg.f25752b;
        this.f30075c = eg.f25337d.b();
        if (gg.f25753c.equals(C3956tE.f35031t)) {
            this.f30076d = Arrays.copyOf(f30072e, 1);
        } else {
            this.f30076d = new byte[0];
        }
    }

    public C2995bK(IG ig) {
        String valueOf = String.valueOf(ig.f26219b.f26890d);
        this.f30073a = new R5("HMAC".concat(valueOf), new SecretKeySpec(((C3263gK) ig.f26220c.f30647u).b(), "HMAC"));
        LG lg = ig.f26219b;
        this.f30074b = lg.f26888b;
        this.f30075c = ig.f26221d.b();
        if (lg.f26889c.equals(FE.f25521H)) {
            this.f30076d = Arrays.copyOf(f30072e, 1);
        } else {
            this.f30076d = new byte[0];
        }
    }

    public C2995bK(R5 r52, int i) {
        this.f30073a = r52;
        this.f30074b = i;
        this.f30075c = new byte[0];
        this.f30076d = new byte[0];
        r52.d(i, new byte[0]);
    }
}
