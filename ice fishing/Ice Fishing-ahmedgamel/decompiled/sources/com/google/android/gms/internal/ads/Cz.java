package com.google.android.gms.internal.ads;

import com.facebook.ads.AdError;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class Cz {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC3307hA f25025a;

    /* renamed from: b, reason: collision with root package name */
    public final Rz f25026b;

    /* renamed from: c, reason: collision with root package name */
    public final Yz f25027c;

    /* renamed from: d, reason: collision with root package name */
    public final C4006uA f25028d;

    /* renamed from: e, reason: collision with root package name */
    public final InterfaceC3832qy f25029e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f25030f;

    /* renamed from: g, reason: collision with root package name */
    public final long f25031g;

    /* renamed from: h, reason: collision with root package name */
    public final long f25032h;

    public Cz(InterfaceC3307hA interfaceC3307hA, Rz rz, Yz yz, C4006uA c4006uA, InterfaceC3832qy interfaceC3832qy, boolean z6, long j6, long j9) {
        this.f25025a = interfaceC3307hA;
        this.f25026b = rz;
        this.f25027c = yz;
        this.f25028d = c4006uA;
        this.f25029e = interfaceC3832qy;
        this.f25030f = z6;
        this.f25031g = j6;
        this.f25032h = j9;
    }

    public final ID a() {
        ID s9 = ID.s(this.f25027c.f());
        L2 l22 = L2.f26842x;
        GD gd = GD.f25742n;
        YC q8 = QC.q(s9, Throwable.class, l22, gd);
        InterfaceC3307hA interfaceC3307hA = this.f25025a;
        Objects.requireNonNull(interfaceC3307hA);
        return QC.t(QC.u(q8, new C2742Pe(10, interfaceC3307hA), gd), new C4318zz(this, 0), gd);
    }

    public final ID b(final int i) {
        ID s9 = ID.s(this.f25026b.c());
        C2742Pe c2742Pe = new C2742Pe(11, this);
        GD gd = GD.f25742n;
        YC q8 = QC.q(QC.q(QC.q(QC.u(QC.t(QC.u(s9, c2742Pe, gd), new C4318zz(this, 1), gd), L2.f26843y, gd), C4210xz.class, L2.f26844z, gd), C4264yz.class, L2.f26818A, gd), C4156wz.class, new UA() { // from class: com.google.android.gms.internal.ads.Az
            @Override // com.google.android.gms.internal.ads.UA
            public final /* synthetic */ Object apply(Object obj) {
                Cz cz = Cz.this;
                if (cz.f25030f) {
                    int i4 = i;
                    if (i4 < cz.f25031g) {
                        cz.f25029e.a(new L.a(cz, i4, 9), cz.f25032h * ((long) Math.pow(2.0d, i4)));
                    }
                }
                return Bz.f24763y;
            }
        }, gd);
        this.f25028d.e(AdError.LOAD_TOO_FREQUENTLY_ERROR_CODE, q8);
        return q8;
    }
}
