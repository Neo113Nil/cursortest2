package com.google.android.gms.internal.ads;

import android.os.Handler;
import java.util.HashMap;
import java.util.Iterator;

/* renamed from: com.google.android.gms.internal.ads.eQ, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC3161eQ extends AbstractC2947aQ {
    public final HashMap i = new HashMap();

    /* renamed from: j, reason: collision with root package name */
    public Handler f30724j;

    @Override // com.google.android.gms.internal.ads.AbstractC2947aQ
    public final void g() {
        for (C3108dQ c3108dQ : this.i.values()) {
            c3108dQ.f30549a.o(c3108dQ.f30550b);
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2947aQ
    public final void i() {
        for (C3108dQ c3108dQ : this.i.values()) {
            c3108dQ.f30549a.p(c3108dQ.f30550b);
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2947aQ
    public void j() {
        HashMap hashMap = this.i;
        for (C3108dQ c3108dQ : hashMap.values()) {
            AbstractC2947aQ abstractC2947aQ = c3108dQ.f30549a;
            abstractC2947aQ.q(c3108dQ.f30550b);
            C3054cQ c3054cQ = c3108dQ.f30551c;
            abstractC2947aQ.l(c3054cQ);
            abstractC2947aQ.m(c3054cQ);
        }
        hashMap.clear();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2947aQ
    public void r() {
        Iterator it = this.i.values().iterator();
        while (it.hasNext()) {
            ((C3108dQ) it.next()).f30549a.r();
        }
    }

    public abstract void s(Integer num, AbstractC2947aQ abstractC2947aQ, AbstractC3627n8 abstractC3627n8);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [com.google.android.gms.internal.ads.bQ, com.google.android.gms.internal.ads.sQ] */
    public final void t(final Integer num, AbstractC2947aQ abstractC2947aQ) {
        HashMap hashMap = this.i;
        AbstractC2792Sd.i(!hashMap.containsKey(num));
        ?? r1 = new InterfaceC3914sQ() { // from class: com.google.android.gms.internal.ads.bQ
            @Override // com.google.android.gms.internal.ads.InterfaceC3914sQ
            public final /* synthetic */ void a(AbstractC2947aQ abstractC2947aQ2, AbstractC3627n8 abstractC3627n8) {
                AbstractC3161eQ.this.s(num, abstractC2947aQ2, abstractC3627n8);
            }
        };
        C3054cQ c3054cQ = new C3054cQ(this, num);
        hashMap.put(num, new C3108dQ(abstractC2947aQ, r1, c3054cQ));
        Handler handler = this.f30724j;
        handler.getClass();
        AP ap = abstractC2947aQ.f29827c;
        ap.getClass();
        ap.f24456b.add(new C3968tQ(handler, c3054cQ));
        this.f30724j.getClass();
        AP ap2 = abstractC2947aQ.f29828d;
        ap2.getClass();
        ap2.f24456b.add(new C4291zP(c3054cQ));
        IO io = this.f29831g;
        io.getClass();
        InterfaceC4211y interfaceC4211y = this.f29832h;
        interfaceC4211y.getClass();
        abstractC2947aQ.n(r1, io, interfaceC4211y);
        if (this.f29826b.isEmpty()) {
            abstractC2947aQ.p(r1);
        }
    }

    public abstract C3860rQ v(Integer num, C3860rQ c3860rQ);

    public void u(Integer num) {
    }

    public void w(Integer num, long j6) {
    }
}
