package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public abstract class WG {

    /* renamed from: a, reason: collision with root package name */
    public static final RG f28376a;

    /* renamed from: b, reason: collision with root package name */
    public static final RG f28377b;

    /* renamed from: c, reason: collision with root package name */
    public static final LG f28378c;

    static {
        try {
            PE pe = new PE(2);
            pe.a(32);
            pe.d(16);
            QG qg = QG.f27132b;
            pe.f26885e = qg;
            PG pg = PG.f26895d;
            pe.f26884d = pg;
            f28376a = pe.j();
            try {
                PE pe2 = new PE(2);
                pe2.a(32);
                pe2.d(32);
                pe2.f26885e = qg;
                pe2.f26884d = pg;
                pe2.j();
                try {
                    PE pe3 = new PE(2);
                    pe3.a(64);
                    pe3.d(32);
                    pe3.f26885e = qg;
                    PG pg2 = PG.f26897f;
                    pe3.f26884d = pg2;
                    pe3.j();
                    try {
                        PE pe4 = new PE(2);
                        pe4.a(64);
                        pe4.d(64);
                        pe4.f26885e = qg;
                        pe4.f26884d = pg2;
                        f28377b = pe4.j();
                        try {
                            C3602mu c3602mu = new C3602mu(21);
                            c3602mu.f(32);
                            c3602mu.r(16);
                            c3602mu.f32776w = C3731pE.f33360H;
                            f28378c = c3602mu.x();
                        } catch (Exception e6) {
                            throw new B0.c(e6);
                        }
                    } catch (Exception e9) {
                        throw new B0.c(e9);
                    }
                } catch (Exception e10) {
                    throw new B0.c(e10);
                }
            } catch (Exception e11) {
                throw new B0.c(e11);
            }
        } catch (Exception e12) {
            throw new B0.c(e12);
        }
    }
}
