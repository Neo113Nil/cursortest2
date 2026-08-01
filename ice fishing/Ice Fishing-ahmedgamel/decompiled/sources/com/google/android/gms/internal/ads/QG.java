package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public abstract class QG {

    /* renamed from: a, reason: collision with root package name */
    public static final LG f27012a;

    /* renamed from: b, reason: collision with root package name */
    public static final LG f27013b;

    /* renamed from: c, reason: collision with root package name */
    public static final GG f27014c;

    static {
        try {
            ME me = new ME(2);
            me.a(32);
            me.d(16);
            FE fe = FE.f24763F;
            me.f26273e = fe;
            KG kg = KG.f25892d;
            me.f26272d = kg;
            f27012a = me.j();
            try {
                ME me2 = new ME(2);
                me2.a(32);
                me2.d(32);
                me2.f26273e = fe;
                me2.f26272d = kg;
                me2.j();
                try {
                    ME me3 = new ME(2);
                    me3.a(64);
                    me3.d(32);
                    me3.f26273e = fe;
                    KG kg2 = KG.f25894f;
                    me3.f26272d = kg2;
                    me3.j();
                    try {
                        ME me4 = new ME(2);
                        me4.a(64);
                        me4.d(64);
                        me4.f26273e = fe;
                        me4.f26272d = kg2;
                        f27013b = me4.j();
                        try {
                            C3481ku c3481ku = new C3481ku(21);
                            c3481ku.h(32);
                            c3481ku.l(16);
                            c3481ku.f31665w = C3933tE.f34243r;
                            f27014c = c3481ku.w();
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
        } catch (Exception e13) {
            throw new B0.c(e13);
        }
    }
}
