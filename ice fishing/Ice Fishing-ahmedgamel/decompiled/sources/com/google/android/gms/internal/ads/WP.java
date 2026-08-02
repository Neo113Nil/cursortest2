package com.google.android.gms.internal.ads;

import O.C0349t;
import android.content.Context;
import android.graphics.Rect;
import androidx.cardview.widget.CardView;
import d2.InterfaceC4460b;
import i2.C4587a;
import java.util.HashMap;
import r2.C4906k;
import t0.AbstractC5000P;
import t7.InterfaceC5045a;
import u1.InterfaceC5066e;
import w2.HandlerC5139A;
import x1.C5184b;
import y1.C5204e;

/* loaded from: classes2.dex */
public final /* synthetic */ class WP implements XP, InterfaceC4460b, y8.w, x2.c {

    /* renamed from: n, reason: collision with root package name */
    public Object f29152n;

    /* renamed from: u, reason: collision with root package name */
    public final Object f29153u;

    public /* synthetic */ WP(Object obj, Object obj2) {
        this.f29152n = obj;
        this.f29153u = obj2;
    }

    @Override // com.google.android.gms.internal.ads.XP
    public int a(Object obj) {
        PP pp = (PP) obj;
        HashMap hashMap = ZP.f29665a;
        pp.getClass();
        DP dp = (DP) this.f29153u;
        String str = dp.f25176o;
        String str2 = pp.f27598b;
        return ((str2.equals(str) || str2.equals(ZP.d(dp))) && pp.f((Context) this.f29152n, dp, false) && pp.g(dp)) ? 1 : 0;
    }

    @Override // x2.c
    public x2.k b(String str) {
        HandlerC5139A handlerC5139A = w2.D.f41627l;
        w2.D d9 = C4906k.f40186C.f40191c;
        new w2.u((Context) this.f29152n, (String) this.f29153u, str, null).l();
        return x2.k.f41872n;
    }

    public void c(AbstractC5000P abstractC5000P, C0349t c0349t) {
        s.k kVar = (s.k) this.f29152n;
        t0.Z z6 = (t0.Z) kVar.getOrDefault(abstractC5000P, null);
        if (z6 == null) {
            z6 = t0.Z.a();
            kVar.put(abstractC5000P, z6);
        }
        z6.f40694c = c0349t;
        z6.f40692a |= 8;
    }

    @Override // y8.w
    public y8.x d() {
        return (m8.h) this.f29153u;
    }

    public String e(InterfaceC5066e interfaceC5066e) {
        String str;
        synchronized (((P1.l) this.f29152n)) {
            str = (String) ((P1.l) this.f29152n).a(interfaceC5066e);
        }
        if (str == null) {
            C5204e c5204e = (C5204e) ((b3.e) this.f29153u).k();
            try {
                interfaceC5066e.b(c5204e.f41897n);
                byte[] digest = c5204e.f41897n.digest();
                char[] cArr = P1.p.f2377b;
                synchronized (cArr) {
                    for (int i = 0; i < digest.length; i++) {
                        byte b9 = digest[i];
                        int i4 = i * 2;
                        char[] cArr2 = P1.p.f2376a;
                        cArr[i4] = cArr2[(b9 & 255) >>> 4];
                        cArr[i4 + 1] = cArr2[b9 & 15];
                    }
                    str = new String(cArr);
                }
            } finally {
                ((b3.e) this.f29153u).D(c5204e);
            }
        }
        synchronized (((P1.l) this.f29152n)) {
            ((P1.l) this.f29152n).f(interfaceC5066e, str);
        }
        return str;
    }

    public C0349t f(AbstractC5000P abstractC5000P, int i) {
        t0.Z z6;
        C0349t c0349t;
        s.k kVar = (s.k) this.f29152n;
        int e9 = kVar.e(abstractC5000P);
        if (e9 >= 0 && (z6 = (t0.Z) kVar.l(e9)) != null) {
            int i4 = z6.f40692a;
            if ((i4 & i) != 0) {
                int i6 = i4 & (~i);
                z6.f40692a = i6;
                if (i == 4) {
                    c0349t = z6.f40693b;
                } else {
                    if (i != 8) {
                        throw new IllegalArgumentException("Must provide flag PRE or POST");
                    }
                    c0349t = z6.f40694c;
                }
                if ((i6 & 12) == 0) {
                    kVar.j(e9);
                    z6.f40692a = 0;
                    z6.f40693b = null;
                    z6.f40694c = null;
                    t0.Z.f40691d.c(z6);
                }
                return c0349t;
            }
        }
        return null;
    }

    @Override // y8.w
    public y8.v g() {
        return (m8.g) this.f29152n;
    }

    @Override // t7.InterfaceC5045a
    public Object get() {
        return new i2.h(new O2.i(21), new G3.e(21), C4587a.f38155f, (i2.j) ((I0.j) this.f29152n).get(), (InterfaceC5045a) this.f29153u);
    }

    public void h(AbstractC5000P abstractC5000P) {
        t0.Z z6 = (t0.Z) ((s.k) this.f29152n).getOrDefault(abstractC5000P, null);
        if (z6 == null) {
            return;
        }
        z6.f40692a &= -2;
    }

    public void i(AbstractC5000P abstractC5000P) {
        s.e eVar = (s.e) this.f29153u;
        int l9 = eVar.l() - 1;
        while (true) {
            if (l9 < 0) {
                break;
            }
            if (abstractC5000P == eVar.m(l9)) {
                Object[] objArr = eVar.f40253v;
                Object obj = objArr[l9];
                Object obj2 = s.e.f40250x;
                if (obj != obj2) {
                    objArr[l9] = obj2;
                    eVar.f40251n = true;
                }
            } else {
                l9--;
            }
        }
        t0.Z z6 = (t0.Z) ((s.k) this.f29152n).remove(abstractC5000P);
        if (z6 != null) {
            z6.f40692a = 0;
            z6.f40693b = null;
            z6.f40694c = null;
            t0.Z.f40691d.c(z6);
        }
    }

    public void j(int i, int i4, int i6, int i9) {
        CardView cardView = (CardView) this.f29153u;
        cardView.f4608w.set(i, i4, i6, i9);
        Rect rect = cardView.f4607v;
        super/*android.view.View*/.setPadding(i + rect.left, i4 + rect.top, i6 + rect.right, i9 + rect.bottom);
    }

    public WP(int i) {
        switch (i) {
            case 7:
                this.f29152n = new P1.l(1000L, 0);
                this.f29153u = Q1.d.a(10, new C5184b());
                break;
            default:
                this.f29152n = new s.k();
                this.f29153u = new s.e();
                break;
        }
    }

    public WP(C3451jv c3451jv) {
        this.f29152n = new m8.g(c3451jv, ((n8.f) c3451jv.f32128x).i().g(), -1L);
        this.f29153u = new m8.h(c3451jv, ((n8.f) c3451jv.f32128x).i().d(), -1L);
    }

    public WP(CardView cardView) {
        this.f29153u = cardView;
    }
}
