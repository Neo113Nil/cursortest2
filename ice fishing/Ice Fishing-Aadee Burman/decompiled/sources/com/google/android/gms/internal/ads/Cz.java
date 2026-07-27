package com.google.android.gms.internal.ads;

import com.facebook.ads.AdError;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class Cz {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC3284hA f24280a;

    /* renamed from: b, reason: collision with root package name */
    public final Rz f24281b;

    /* renamed from: c, reason: collision with root package name */
    public final Yz f24282c;

    /* renamed from: d, reason: collision with root package name */
    public final C3983uA f24283d;

    /* renamed from: e, reason: collision with root package name */
    public final InterfaceC3809qy f24284e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f24285f;

    /* renamed from: g, reason: collision with root package name */
    public final long f24286g;

    /* renamed from: h, reason: collision with root package name */
    public final long f24287h;

    public Cz(InterfaceC3284hA interfaceC3284hA, Rz rz, Yz yz, C3983uA c3983uA, InterfaceC3809qy interfaceC3809qy, boolean z3, long j6, long j9) {
        this.f24280a = interfaceC3284hA;
        this.f24281b = rz;
        this.f24282c = yz;
        this.f24283d = c3983uA;
        this.f24284e = interfaceC3809qy;
        this.f24285f = z3;
        this.f24286g = j6;
        this.f24287h = j9;
    }

    public final ID a() {
        ID s9 = ID.s(this.f24282c.f());
        L2 l22 = L2.f26042x;
        GD gd = GD.f24952n;
        YC q8 = QC.q(s9, Throwable.class, l22, gd);
        InterfaceC3284hA interfaceC3284hA = this.f24280a;
        Objects.requireNonNull(interfaceC3284hA);
        return QC.t(QC.u(q8, new C2722Pe(10, interfaceC3284hA), gd), new C4295zz(this, 0), gd);
    }

    public final ID b(final int i) {
        ID s9 = ID.s(this.f24281b.c());
        C2722Pe c2722Pe = new C2722Pe(11, this);
        GD gd = GD.f24952n;
        YC q8 = QC.q(QC.q(QC.q(QC.u(QC.t(QC.u(s9, c2722Pe, gd), new C4295zz(this, 1), gd), L2.f26043y, gd), C4187xz.class, L2.f26044z, gd), C4241yz.class, L2.f26018A, gd), C4133wz.class, new UA() { // from class: com.google.android.gms.internal.ads.Az
            @Override // com.google.android.gms.internal.ads.UA
            public final /* synthetic */ Object apply(Object obj) {
                Cz cz = Cz.this;
                if (cz.f24285f) {
                    int i6 = i;
                    if (i6 < cz.f24286g) {
                        cz.f24284e.a(new L.a(cz, i6, 9), cz.f24287h * ((long) Math.pow(2.0d, i6)));
                    }
                }
                return Bz.f24000y;
            }
        }, gd);
        this.f24283d.e(AdError.LOAD_TOO_FREQUENTLY_ERROR_CODE, q8);
        return q8;
    }
}
