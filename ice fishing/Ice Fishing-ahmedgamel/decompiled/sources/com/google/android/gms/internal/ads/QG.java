package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public abstract class QG {

    /* renamed from: a, reason: collision with root package name */
    public static final LG f27799a;

    /* renamed from: b, reason: collision with root package name */
    public static final LG f27800b;

    /* renamed from: c, reason: collision with root package name */
    public static final GG f27801c;

    static {
        try {
            ME me = new ME(2);
            me.a(32);
            me.d(16);
            FE fe = FE.f25519F;
            me.f27064e = fe;
            KG kg = KG.f26644d;
            me.f27063d = kg;
            f27799a = me.j();
            try {
                ME me2 = new ME(2);
                me2.a(32);
                me2.d(32);
                me2.f27064e = fe;
                me2.f27063d = kg;
                me2.j();
                try {
                    ME me3 = new ME(2);
                    me3.a(64);
                    me3.d(32);
                    me3.f27064e = fe;
                    KG kg2 = KG.f26646f;
                    me3.f27063d = kg2;
                    me3.j();
                    try {
                        ME me4 = new ME(2);
                        me4.a(64);
                        me4.d(64);
                        me4.f27064e = fe;
                        me4.f27063d = kg2;
                        f27800b = me4.j();
                        try {
                            C3504ku c3504ku = new C3504ku(21);
                            c3504ku.h(32);
                            c3504ku.l(16);
                            c3504ku.f32447w = C3956tE.f35029r;
                            f27801c = c3504ku.v();
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
