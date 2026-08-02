package io.appmetrica.analytics.impl;

import android.content.Context;
import android.os.ResultReceiver;
import androidx.annotation.NonNull;
import io.appmetrica.analytics.internal.CounterConfigurationReporterType;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* renamed from: io.appmetrica.analytics.impl.o5, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C0510o5 implements Pb, To, Sb {
    public final Context a;
    public final H5 b;
    public final Ep c;
    public final C0179ck d;
    public final C0712v5 e;
    public final C0560pq f;
    public ArrayList g;
    public final I5 h;
    public final Oi i;
    public final J4 j;
    public final Ti k;
    public final Object l;

    public C0510o5(Context context, Ko ko, H5 h5, C0279g5 c0279g5, C0179ck c0179ck, Oi oi, I5 i5, C0568q5 c0568q5, Ti ti) {
        this.g = new ArrayList();
        this.l = new Object();
        Context applicationContext = context.getApplicationContext();
        this.a = applicationContext;
        this.b = h5;
        this.d = c0179ck;
        this.h = i5;
        this.e = C0568q5.a(this);
        b(c0279g5);
        Ep a = ko.a(applicationContext, h5, c0279g5.a);
        this.c = a;
        this.j = K4.a(a, C0747wb.k().c());
        this.f = c0568q5.a(this, a);
        this.i = oi;
        this.k = ti;
        ko.a(h5, this);
    }

    public static void b(C0279g5 c0279g5) {
        C0747wb.I.c().b(!Boolean.FALSE.equals(c0279g5.b.n));
    }

    @Override // io.appmetrica.analytics.impl.To
    public final void a(@NonNull C0385jp c0385jp) {
        synchronized (this.l) {
            try {
                Iterator it = this.h.a.iterator();
                while (it.hasNext()) {
                    C0423l5 c0423l5 = (C0423l5) it.next();
                    ResultReceiverC0685u7.a(c0423l5.c, this.j.a(Jp.a(c0385jp.m)));
                }
                ArrayList arrayList = new ArrayList();
                Iterator it2 = this.g.iterator();
                while (it2.hasNext()) {
                    C0401kc c0401kc = (C0401kc) it2.next();
                    if (AbstractC0299gp.a(c0385jp, c0401kc.b, c0401kc.c, new C0344ic())) {
                        ResultReceiverC0685u7.a(c0401kc.a, this.j.a(c0401kc.c));
                    } else {
                        arrayList.add(c0401kc);
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

    @Override // io.appmetrica.analytics.impl.Pb
    @NonNull
    public final CounterConfigurationReporterType c() {
        return CounterConfigurationReporterType.COMMUTATION;
    }

    @NonNull
    public final C0250f5 e() {
        return this.d.a;
    }

    @NonNull
    public final Oi f() {
        return this.i;
    }

    @Override // io.appmetrica.analytics.impl.Pb
    @NonNull
    public final Context getContext() {
        return this.a;
    }

    public final synchronized void b(@NonNull C0423l5 c0423l5) {
        this.h.a.remove(c0423l5);
    }

    @Override // io.appmetrica.analytics.impl.Pb
    @NonNull
    public final H5 b() {
        return this.b;
    }

    public C0510o5(@NonNull Context context, @NonNull Ko ko, @NonNull H5 h5, @NonNull C0279g5 c0279g5, @NonNull Oi oi) {
        this(context, ko, h5, c0279g5, new C0179ck(c0279g5.b), oi, new I5(), new C0568q5(), new Ti());
    }

    public final synchronized void a(@NonNull C0423l5 c0423l5) {
        this.h.a.add(c0423l5);
        ResultReceiverC0685u7.a(c0423l5.c, this.j.a(Jp.a(this.c.e().m)));
    }

    public final void a(@NonNull H6 h6, @NonNull C0423l5 c0423l5) {
        C0712v5 c0712v5 = this.e;
        c0712v5.getClass();
        c0712v5.a(h6, new C0683u5(c0423l5));
    }

    @Override // io.appmetrica.analytics.impl.To
    public final void a(@NonNull Mo mo, C0385jp c0385jp) {
        synchronized (this.l) {
            try {
                Iterator it = this.g.iterator();
                while (it.hasNext()) {
                    C0401kc c0401kc = (C0401kc) it.next();
                    ResultReceiverC0685u7.a(c0401kc.a, mo, this.j.a(c0401kc.c));
                }
                this.g.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // io.appmetrica.analytics.impl.Pb, io.appmetrica.analytics.impl.Rb, io.appmetrica.analytics.impl.InterfaceC0171cc
    public final void a(@NonNull C0250f5 c0250f5) {
        C0179ck c0179ck = this.d;
        c0179ck.a = c0179ck.a.mergeFrom(c0250f5);
    }

    public final void a(C0401kc c0401kc) {
        ResultReceiver resultReceiver;
        HashMap hashMap;
        List<String> list;
        HashMap hashMap2 = new HashMap();
        if (c0401kc != null) {
            list = c0401kc.b;
            resultReceiver = c0401kc.a;
            hashMap = c0401kc.c;
        } else {
            resultReceiver = null;
            hashMap = hashMap2;
            list = null;
        }
        boolean a = this.c.a(list, hashMap);
        if (!a) {
            ResultReceiverC0685u7.a(resultReceiver, this.j.a(hashMap));
        }
        if (!this.c.g()) {
            if (a) {
                ResultReceiverC0685u7.a(resultReceiver, this.j.a(hashMap));
                return;
            }
            return;
        }
        synchronized (this.l) {
            if (a && c0401kc != null) {
                try {
                    this.g.add(c0401kc);
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        this.f.c();
    }

    public final void a(ResultReceiver resultReceiver) {
        this.k.a(new C0481n5(resultReceiver));
    }

    @NonNull
    public final J4 a() {
        return this.j;
    }

    @Override // io.appmetrica.analytics.impl.Sb
    public final void a(@NonNull C0279g5 c0279g5) {
        this.c.a(c0279g5.a);
        a(c0279g5.b);
    }
}
