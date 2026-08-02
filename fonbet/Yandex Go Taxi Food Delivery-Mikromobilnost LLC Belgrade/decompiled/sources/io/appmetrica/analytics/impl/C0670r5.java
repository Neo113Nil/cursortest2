package io.appmetrica.analytics.impl;

import android.content.Context;
import android.os.ResultReceiver;
import defpackage.bc61;
import io.appmetrica.analytics.internal.CounterConfigurationReporterType;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* renamed from: io.appmetrica.analytics.impl.r5, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C0670r5 implements InterfaceC0302ec, InterfaceC0517lp, InterfaceC0389hc {
    public final Context a;
    public final K5 b;
    public final Wp c;
    public final C0541mk d;
    public final C0873y5 e;
    public final Gq f;
    public ArrayList g;
    public final L5 h;
    public final N4 i;
    public final Yi j;
    public final Object k;

    public C0670r5(Context context, C0258cp c0258cp, K5 k5, C0468k5 c0468k5, C0541mk c0541mk, L5 l5, C0728t5 c0728t5) {
        this.g = new ArrayList();
        this.k = new Object();
        Context applicationContext = context.getApplicationContext();
        this.a = applicationContext;
        this.b = k5;
        this.d = c0541mk;
        this.h = l5;
        this.e = C0728t5.a(this);
        b(c0468k5);
        Wp a = c0258cp.a(applicationContext, k5, c0468k5.a);
        this.c = a;
        this.i = O4.a(a, Jb.k().c());
        this.f = c0728t5.a(this, a);
        Yi u = Jb.k().u();
        this.j = u;
        u.a();
        c0258cp.a(k5, this);
    }

    public static void b(C0468k5 c0468k5) {
        Jb.I.c().b(!Boolean.FALSE.equals(c0468k5.b.n));
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0517lp
    public final void a(Bp bp) {
        synchronized (this.k) {
            try {
                Iterator it = this.h.a.iterator();
                while (it.hasNext()) {
                    C0613p5 c0613p5 = (C0613p5) it.next();
                    ResultReceiverC0904z7.a(c0613p5.c, this.i.a(AbstractC0230bq.a(bp.m)));
                }
                ArrayList arrayList = new ArrayList();
                Iterator it2 = this.g.iterator();
                while (it2.hasNext()) {
                    C0822wc c0822wc = (C0822wc) it2.next();
                    if (AbstractC0893yp.a(bp, c0822wc.b, c0822wc.c, new C0764uc())) {
                        ResultReceiverC0904z7.a(c0822wc.a, this.i.a(c0822wc.c));
                    } else {
                        arrayList.add(c0822wc);
                    }
                }
                this.g = new ArrayList(arrayList);
                if (!arrayList.isEmpty()) {
                    this.f.c();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0302ec
    public final CounterConfigurationReporterType c() {
        return CounterConfigurationReporterType.COMMUTATION;
    }

    public final N4 e() {
        return this.i;
    }

    public final C0439j5 f() {
        return this.d.a;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0302ec
    public final Context getContext() {
        return this.a;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0302ec
    public final void b() {
    }

    public final synchronized void b(C0613p5 c0613p5) {
        this.h.a.remove(c0613p5);
    }

    public C0670r5(Context context, C0258cp c0258cp, K5 k5, C0468k5 c0468k5) {
        this(context, c0258cp, k5, c0468k5, new C0541mk(c0468k5.b), new L5(), new C0728t5());
    }

    public final synchronized void a(C0613p5 c0613p5) {
        this.h.a.add(c0613p5);
        ResultReceiverC0904z7.a(c0613p5.c, this.i.a(AbstractC0230bq.a(this.c.e().m)));
    }

    public final void a(K6 k6, C0613p5 c0613p5) {
        C0873y5 c0873y5 = this.e;
        c0873y5.getClass();
        c0873y5.a(k6, new C0844x5(c0613p5));
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0302ec
    public final K5 a() {
        return this.b;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0517lp
    public final void a(EnumC0315ep enumC0315ep, Bp bp) {
        synchronized (this.k) {
            try {
                Iterator it = this.g.iterator();
                while (it.hasNext()) {
                    C0822wc c0822wc = (C0822wc) it.next();
                    ResultReceiverC0904z7.a(c0822wc.a, enumC0315ep, this.i.a(c0822wc.c));
                }
                this.g.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0302ec, io.appmetrica.analytics.impl.InterfaceC0360gc, io.appmetrica.analytics.impl.InterfaceC0562nc
    public final void a(C0439j5 c0439j5) {
        C0541mk c0541mk = this.d;
        c0541mk.a = c0541mk.a.mergeFrom(c0439j5);
    }

    public final void a(C0822wc c0822wc) {
        ResultReceiver resultReceiver;
        HashMap hashMap;
        List<String> list;
        HashMap hashMap2 = new HashMap();
        if (c0822wc != null) {
            list = c0822wc.b;
            resultReceiver = c0822wc.a;
            hashMap = c0822wc.c;
        } else {
            resultReceiver = null;
            hashMap = hashMap2;
            list = null;
        }
        boolean a = this.c.a(list, hashMap);
        if (!a) {
            ResultReceiverC0904z7.a(resultReceiver, this.i.a(hashMap));
        }
        if (!this.c.g()) {
            if (a) {
                ResultReceiverC0904z7.a(resultReceiver, this.i.a(hashMap));
                return;
            }
            return;
        }
        synchronized (this.k) {
            if (a && c0822wc != null) {
                try {
                    this.g.add(c0822wc);
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        this.f.c();
    }

    public final void a(ResultReceiver resultReceiver) {
        Yi yi = this.j;
        bc61 bc61Var = new bc61(1, resultReceiver);
        yi.getClass();
        yi.a.a(new C0284dm(bc61Var));
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0389hc
    public final void a(C0468k5 c0468k5) {
        this.c.a(c0468k5.a);
        a(c0468k5.b);
    }
}
