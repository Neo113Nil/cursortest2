package com.google.android.gms.internal.ads;

import android.os.Handler;
import java.util.HashMap;
import java.util.Iterator;

/* renamed from: com.google.android.gms.internal.ads.bQ, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC2978bQ extends XP {
    public final HashMap i = new HashMap();

    /* renamed from: j, reason: collision with root package name */
    public Handler f29294j;

    @Override // com.google.android.gms.internal.ads.XP
    public final void g() {
        for (C2924aQ c2924aQ : this.i.values()) {
            c2924aQ.f29055a.o(c2924aQ.f29056b);
        }
    }

    @Override // com.google.android.gms.internal.ads.XP
    public final void i() {
        for (C2924aQ c2924aQ : this.i.values()) {
            c2924aQ.f29055a.p(c2924aQ.f29056b);
        }
    }

    @Override // com.google.android.gms.internal.ads.XP
    public void j() {
        HashMap hashMap = this.i;
        for (C2924aQ c2924aQ : hashMap.values()) {
            XP xp = c2924aQ.f29055a;
            xp.q(c2924aQ.f29056b);
            ZP zp = c2924aQ.f29057c;
            xp.l(zp);
            xp.m(zp);
        }
        hashMap.clear();
    }

    @Override // com.google.android.gms.internal.ads.XP
    public void r() {
        Iterator it = this.i.values().iterator();
        while (it.hasNext()) {
            ((C2924aQ) it.next()).f29055a.r();
        }
    }

    public abstract void s(Integer num, XP xp, AbstractC3604n8 abstractC3604n8);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [com.google.android.gms.internal.ads.YP, com.google.android.gms.internal.ads.pQ] */
    public final void t(final Integer num, XP xp) {
        HashMap hashMap = this.i;
        AbstractC2772Sd.i(!hashMap.containsKey(num));
        ?? r12 = new InterfaceC3730pQ() { // from class: com.google.android.gms.internal.ads.YP
            @Override // com.google.android.gms.internal.ads.InterfaceC3730pQ
            public final /* synthetic */ void a(XP xp2, AbstractC3604n8 abstractC3604n8) {
                AbstractC2978bQ.this.s(num, xp2, abstractC3604n8);
            }
        };
        ZP zp = new ZP(this, num);
        hashMap.put(num, new C2924aQ(xp, r12, zp));
        Handler handler = this.f29294j;
        handler.getClass();
        AP ap = xp.f28526c;
        ap.getClass();
        ap.f23676b.add(new C3784qQ(handler, zp));
        this.f29294j.getClass();
        AP ap2 = xp.f28527d;
        ap2.getClass();
        ap2.f23676b.add(new C4268zP(zp));
        IO io = this.f28530g;
        io.getClass();
        InterfaceC4188y interfaceC4188y = this.f28531h;
        interfaceC4188y.getClass();
        xp.n(r12, io, interfaceC4188y);
        if (this.f28525b.isEmpty()) {
            xp.p(r12);
        }
    }

    public abstract C3676oQ v(Integer num, C3676oQ c3676oQ);

    public void u(Integer num) {
    }

    public void w(Integer num, long j6) {
    }
}
