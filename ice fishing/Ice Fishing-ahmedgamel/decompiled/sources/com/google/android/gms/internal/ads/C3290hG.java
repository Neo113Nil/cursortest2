package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.gms.internal.ads.hG, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3290hG {

    /* renamed from: b, reason: collision with root package name */
    public static final C3290hG f30754b;

    /* renamed from: a, reason: collision with root package name */
    public final AtomicReference f30755a = new AtomicReference(new CG(new ME(1)));

    static {
        try {
            C3290hG c3290hG = new C3290hG();
            c3290hG.a(new TF(ZF.class, C3880sF.f33933E));
            f30754b = c3290hG;
        } catch (Exception e9) {
            throw new B0.c(e9);
        }
    }

    public final synchronized void a(TF tf) {
        AtomicReference atomicReference = this.f30755a;
        ME me = new ME((CG) atomicReference.get());
        me.b(tf);
        atomicReference.set(new CG(me));
    }

    public final synchronized void b(RF rf) {
        AtomicReference atomicReference = this.f30755a;
        ME me = new ME((CG) atomicReference.get());
        me.e(rf);
        atomicReference.set(new CG(me));
    }

    public final synchronized void c(C3504lG c3504lG) {
        AtomicReference atomicReference = this.f30755a;
        ME me = new ME((CG) atomicReference.get());
        me.g(c3504lG);
        atomicReference.set(new CG(me));
    }

    public final synchronized void d(C3396jG c3396jG) {
        AtomicReference atomicReference = this.f30755a;
        ME me = new ME((CG) atomicReference.get());
        me.h(c3396jG);
        atomicReference.set(new CG(me));
    }

    public final WC e(C4097wG c4097wG) {
        CG cg = (CG) this.f30755a.get();
        cg.getClass();
        AG ag = new AG(C4097wG.class, c4097wG.f34819b);
        HashMap hashMap = cg.f24085b;
        if (hashMap.containsKey(ag)) {
            return ((RF) hashMap.get(ag)).f27186b.d(c4097wG);
        }
        String ag2 = ag.toString();
        throw new GeneralSecurityException(D.y.s(new StringBuilder(ag2.length() + 47), "No Key Parser for requested key type ", ag2, " available"));
    }

    public final InterfaceC4259zG f(WC wc) {
        CG cg = (CG) this.f30755a.get();
        cg.getClass();
        BG bg = new BG(wc.getClass(), C4097wG.class);
        HashMap hashMap = cg.f24084a;
        if (hashMap.containsKey(bg)) {
            return ((TF) hashMap.get(bg)).f27711b.b(wc);
        }
        String bg2 = bg.toString();
        throw new GeneralSecurityException(D.y.s(new StringBuilder(bg2.length() + 32), "No Key serializer for ", bg2, " available"));
    }

    public final AbstractC3825rE g(C4151xG c4151xG) {
        CG cg = (CG) this.f30755a.get();
        cg.getClass();
        AG ag = new AG(C4151xG.class, c4151xG.f34968a);
        HashMap hashMap = cg.f24087d;
        if (hashMap.containsKey(ag)) {
            return ((C3396jG) hashMap.get(ag)).f31223b.c(c4151xG);
        }
        String ag2 = ag.toString();
        throw new GeneralSecurityException(D.y.s(new StringBuilder(ag2.length() + 54), "No Parameters Parser for requested key type ", ag2, " available"));
    }

    public final InterfaceC4259zG h(AbstractC3825rE abstractC3825rE) {
        CG cg = (CG) this.f30755a.get();
        cg.getClass();
        BG bg = new BG(abstractC3825rE.getClass(), C4151xG.class);
        HashMap hashMap = cg.f24086c;
        if (hashMap.containsKey(bg)) {
            return ((C3504lG) hashMap.get(bg)).f31755b.a(abstractC3825rE);
        }
        String bg2 = bg.toString();
        throw new GeneralSecurityException(D.y.s(new StringBuilder(bg2.length() + 39), "No Key Format serializer for ", bg2, " available"));
    }
}
