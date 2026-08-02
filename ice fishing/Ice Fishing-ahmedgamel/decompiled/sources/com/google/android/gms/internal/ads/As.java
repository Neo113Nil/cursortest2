package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import com.google.android.gms.internal.consent_sdk.C4323b;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class As {

    /* renamed from: a, reason: collision with root package name */
    public final int f24529a;

    /* renamed from: b, reason: collision with root package name */
    public Object f24530b;

    /* renamed from: c, reason: collision with root package name */
    public int f24531c;

    /* renamed from: d, reason: collision with root package name */
    public int f24532d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f24533e;

    /* renamed from: f, reason: collision with root package name */
    public long f24534f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ C4323b f24535g;

    public As(C4323b c4323b, int i) {
        Objects.requireNonNull(c4323b);
        this.f24535g = c4323b;
        this.f24529a = i;
    }

    public final void a() {
        long l22;
        C4323b c4323b = this.f24535g;
        AbstractC3627n8 F12 = ((PN) c4323b.f36417a).F1();
        boolean g9 = F12.g();
        PN pn = (PN) c4323b.f36417a;
        Object f2 = g9 ? null : F12.f(pn.k2());
        int o02 = pn.o0();
        int q22 = pn.q2();
        long m22 = pn.m2();
        if (f2 == null || o02 != -1) {
            l22 = o02 != -1 ? pn.l2() : com.anythink.basead.exoplayer.b.f7168b;
        } else {
            K7 k72 = (K7) c4323b.f36420d;
            F12.o(f2, k72);
            m22 -= AbstractC3182eu.t(0L);
            l22 = AbstractC3182eu.t(k72.f26620d);
            o02 = -1;
        }
        boolean z6 = pn.u1() == 3 && pn.A1() && pn.w1() == 0;
        C3235ft c3235ft = (C3235ft) c4323b.f36421e;
        if (!z6 || l22 == com.anythink.basead.exoplayer.b.f7168b || m22 < l22) {
            c3235ft.d(3);
            if (z6 && l22 != com.anythink.basead.exoplayer.b.f7168b) {
                pn.O0();
                c3235ft.f31231a.sendEmptyMessageDelayed(3, (int) Math.ceil((l22 - m22) / pn.f27592y0.f32741o.f35002a));
            }
            this.f24533e = false;
            return;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        boolean z9 = this.f24533e;
        int i = this.f24529a;
        if (z9 && Objects.equals(f2, this.f24530b) && o02 == this.f24531c && q22 == this.f24532d) {
            if (elapsedRealtime - this.f24534f >= i) {
                Us us = new Us(3, i);
                HN hn = (HN) c4323b.f36419c;
                hn.getClass();
                hn.f26036n.W1(new DN(2, us, 1003));
                return;
            }
            return;
        }
        this.f24533e = true;
        this.f24534f = elapsedRealtime;
        this.f24530b = f2;
        this.f24531c = o02;
        this.f24532d = q22;
        c3235ft.d(3);
        c3235ft.f31231a.sendEmptyMessageDelayed(3, i);
    }
}
