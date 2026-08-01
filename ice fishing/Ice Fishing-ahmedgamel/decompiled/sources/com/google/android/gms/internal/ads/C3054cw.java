package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Date;
import java.util.Iterator;

/* renamed from: com.google.android.gms.internal.ads.cw, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3054cw implements InterfaceC3215fw {

    /* renamed from: e, reason: collision with root package name */
    public static final C3054cw f29643e = new C3054cw(new C3269gw());

    /* renamed from: a, reason: collision with root package name */
    public boolean f29644a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f29645b;

    /* renamed from: c, reason: collision with root package name */
    public Object f29646c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f29647d;

    public C3054cw(C3269gw c3269gw) {
        this.f29647d = c3269gw;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3215fw
    public void a(boolean z3) {
        if (!this.f29645b && z3) {
            Date date = new Date();
            Date date2 = (Date) this.f29646c;
            if (date2 == null || date.after(date2)) {
                this.f29646c = date;
                if (this.f29644a) {
                    Iterator it = Collections.unmodifiableCollection(C3161ew.f30001c.f30003b).iterator();
                    while (it.hasNext()) {
                        AbstractC3645nw abstractC3645nw = ((Uv) it.next()).f28039d;
                        Date date3 = (Date) this.f29646c;
                        abstractC3645nw.f(date3 != null ? (Date) date3.clone() : null);
                    }
                }
            }
        }
        this.f29645b = z3;
    }

    public C3054cw(C4274ze c4274ze, C4178xq c4178xq, C3804qt c3804qt) {
        this.f29644a = false;
        this.f29645b = false;
        this.f29646c = c3804qt;
        N3.a B9 = ((C3694or) c4178xq.f35055u).B(c3804qt.f33431b, c3804qt.f33430a, null);
        C3196fd c3196fd = new C3196fd(this, c4178xq, c4274ze, c3804qt, 5);
        RD rd = c3804qt.f33434e;
        this.f29647d = QC.r(QC.t(B9, c3196fd, rd), Exception.class, new C4164xc(this, c4178xq), rd);
    }
}
