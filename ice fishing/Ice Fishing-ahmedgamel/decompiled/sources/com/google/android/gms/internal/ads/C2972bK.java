package com.google.android.gms.internal.ads;

import java.util.Arrays;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: com.google.android.gms.internal.ads.bK, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2972bK implements InterfaceC3772qE {

    /* renamed from: e, reason: collision with root package name */
    public static final byte[] f29284e = {0};

    /* renamed from: a, reason: collision with root package name */
    public final YG f29285a;

    /* renamed from: b, reason: collision with root package name */
    public final int f29286b;

    /* renamed from: c, reason: collision with root package name */
    public final byte[] f29287c;

    /* renamed from: d, reason: collision with root package name */
    public final byte[] f29288d;

    public C2972bK(EG eg) {
        this.f29285a = C2921aN.k(WG.i(XG.b(eg.f24574b.f24961a), eg.f24575c));
        GG gg = eg.f24574b;
        this.f29286b = gg.f24962b;
        this.f29287c = eg.f24576d.b();
        if (gg.f24963c.equals(C3933tE.f34245t)) {
            this.f29288d = Arrays.copyOf(f29284e, 1);
        } else {
            this.f29288d = new byte[0];
        }
    }

    public C2972bK(IG ig) {
        String valueOf = String.valueOf(ig.f25476b.f26090d);
        this.f29285a = new R5("HMAC".concat(valueOf), new SecretKeySpec(((C3240gK) ig.f25477c.f29859u).b(), "HMAC"));
        LG lg = ig.f25476b;
        this.f29286b = lg.f26088b;
        this.f29287c = ig.f25478d.b();
        if (lg.f26089c.equals(FE.f24765H)) {
            this.f29288d = Arrays.copyOf(f29284e, 1);
        } else {
            this.f29288d = new byte[0];
        }
    }

    public C2972bK(R5 r52, int i) {
        this.f29285a = r52;
        this.f29286b = i;
        this.f29287c = new byte[0];
        this.f29288d = new byte[0];
        r52.d(i, new byte[0]);
    }
}
