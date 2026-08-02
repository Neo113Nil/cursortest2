package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.gms.internal.ads.hG, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3313hG {

    /* renamed from: b, reason: collision with root package name */
    public static final C3313hG f31520b;

    /* renamed from: a, reason: collision with root package name */
    public final AtomicReference f31521a = new AtomicReference(new CG(new ME(1)));

    static {
        try {
            C3313hG c3313hG = new C3313hG();
            c3313hG.a(new TF(ZF.class, C3903sF.f34701E));
            f31520b = c3313hG;
        } catch (Exception e9) {
            throw new B0.c(e9);
        }
    }

    public final synchronized void a(TF tf) {
        AtomicReference atomicReference = this.f31521a;
        ME me = new ME((CG) atomicReference.get());
        me.b(tf);
        atomicReference.set(new CG(me));
    }

    public final synchronized void b(RF rf) {
        AtomicReference atomicReference = this.f31521a;
        ME me = new ME((CG) atomicReference.get());
        me.e(rf);
        atomicReference.set(new CG(me));
    }

    public final synchronized void c(C3527lG c3527lG) {
        AtomicReference atomicReference = this.f31521a;
        ME me = new ME((CG) atomicReference.get());
        me.g(c3527lG);
        atomicReference.set(new CG(me));
    }

    public final synchronized void d(C3419jG c3419jG) {
        AtomicReference atomicReference = this.f31521a;
        ME me = new ME((CG) atomicReference.get());
        me.h(c3419jG);
        atomicReference.set(new CG(me));
    }

    public final WC e(C4120wG c4120wG) {
        CG cg = (CG) this.f31521a.get();
        cg.getClass();
        AG ag = new AG(C4120wG.class, c4120wG.f35588b);
        HashMap hashMap = cg.f24848b;
        if (hashMap.containsKey(ag)) {
            return ((RF) hashMap.get(ag)).f27942b.d(c4120wG);
        }
        String ag2 = ag.toString();
        throw new GeneralSecurityException(D.x.p(new StringBuilder(ag2.length() + 47), "No Key Parser for requested key type ", ag2, " available"));
    }

    public final InterfaceC4282zG f(WC wc) {
        CG cg = (CG) this.f31521a.get();
        cg.getClass();
        BG bg = new BG(wc.getClass(), C4120wG.class);
        HashMap hashMap = cg.f24847a;
        if (hashMap.containsKey(bg)) {
            return ((TF) hashMap.get(bg)).f28494b.b(wc);
        }
        String bg2 = bg.toString();
        throw new GeneralSecurityException(D.x.p(new StringBuilder(bg2.length() + 32), "No Key serializer for ", bg2, " available"));
    }

    public final AbstractC3848rE g(C4174xG c4174xG) {
        CG cg = (CG) this.f31521a.get();
        cg.getClass();
        AG ag = new AG(C4174xG.class, c4174xG.f35749a);
        HashMap hashMap = cg.f24850d;
        if (hashMap.containsKey(ag)) {
            return ((C3419jG) hashMap.get(ag)).f32010b.c(c4174xG);
        }
        String ag2 = ag.toString();
        throw new GeneralSecurityException(D.x.p(new StringBuilder(ag2.length() + 54), "No Parameters Parser for requested key type ", ag2, " available"));
    }

    public final InterfaceC4282zG h(AbstractC3848rE abstractC3848rE) {
        CG cg = (CG) this.f31521a.get();
        cg.getClass();
        BG bg = new BG(abstractC3848rE.getClass(), C4174xG.class);
        HashMap hashMap = cg.f24849c;
        if (hashMap.containsKey(bg)) {
            return ((C3527lG) hashMap.get(bg)).f32535b.a(abstractC3848rE);
        }
        String bg2 = bg.toString();
        throw new GeneralSecurityException(D.x.p(new StringBuilder(bg2.length() + 39), "No Key Format serializer for ", bg2, " available"));
    }
}
