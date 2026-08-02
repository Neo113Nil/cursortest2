package io.grpc.internal;

import defpackage.bw1;
import defpackage.ch7;
import defpackage.ee0;
import defpackage.ezf;
import defpackage.fs7;
import defpackage.gao;
import defpackage.gjp;
import defpackage.kkp;
import defpackage.ljp;
import defpackage.lte;
import defpackage.mjp;
import defpackage.njp;
import defpackage.nue;
import defpackage.o2g;
import defpackage.oue;
import defpackage.pjp;
import defpackage.pue;
import defpackage.sjp;
import defpackage.sue;
import defpackage.tip;
import defpackage.we6;
import defpackage.xhj;
import defpackage.yde;
import defpackage.z0j;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.logging.Logger;

/* loaded from: classes5.dex */
public final class b extends tip implements pue {
    public static final Logger w = Logger.getLogger(b.class.getName());
    public static final gjp x = new gjp();
    public final sue b;
    public final xhj c;
    public Executor d;
    public final oue e;
    public final ljp f;
    public final List g;
    public final njp[] h;
    public final long i;
    public boolean j;
    public boolean k;
    public boolean l;
    public boolean m;
    public final bw1 n;
    public boolean p;
    public final we6 r;
    public final ch7 s;
    public final lte t;
    public final kkp u;
    public final fs7 v;
    public final Object o = new Object();
    public final HashSet q = new HashSet();

    public b(mjp mjpVar, bw1 bw1Var, we6 we6Var) {
        List unmodifiableList;
        gao gaoVar = mjpVar.g;
        o2g.O(gaoVar, "executorPool");
        this.c = gaoVar;
        nue nueVar = mjpVar.a;
        nueVar.getClass();
        HashMap hashMap = new HashMap();
        LinkedHashMap linkedHashMap = nueVar.a;
        Iterator it = linkedHashMap.values().iterator();
        while (it.hasNext()) {
            for (pjp pjpVar : ((sjp) it.next()).a.values()) {
                hashMap.put(pjpVar.a.b, pjpVar);
            }
        }
        Collections.unmodifiableList(new ArrayList(linkedHashMap.values()));
        this.e = new oue(Collections.unmodifiableMap(hashMap));
        ljp ljpVar = mjpVar.f;
        o2g.O(ljpVar, "fallbackRegistry");
        this.f = ljpVar;
        this.n = bw1Var;
        synchronized (this.o) {
            unmodifiableList = Collections.unmodifiableList(yde.y((ee0) bw1Var.e));
        }
        sue sueVar = new sue(sue.d.incrementAndGet(), "Server", String.valueOf(unmodifiableList));
        this.b = sueVar;
        o2g.O(we6Var, "rootContext");
        this.r = new we6(we6Var.b, we6Var.c + 1);
        this.s = mjpVar.h;
        this.g = Collections.unmodifiableList(new ArrayList(mjpVar.b));
        ArrayList arrayList = mjpVar.c;
        this.h = (njp[]) arrayList.toArray(new njp[arrayList.size()]);
        this.i = mjpVar.j;
        lte lteVar = mjpVar.p;
        this.t = lteVar;
        mjpVar.q.getClass();
        this.u = new kkp(2);
        fs7 fs7Var = mjpVar.k;
        o2g.O(fs7Var, "ticker");
        this.v = fs7Var;
        lte.a(lteVar.a, this);
    }

    @Override // defpackage.pue
    public final sue a() {
        return this.b;
    }

    public final void e() {
        synchronized (this.o) {
            try {
                if (this.k && this.q.isEmpty() && this.p) {
                    if (this.m) {
                        throw new AssertionError("Server already terminated");
                    }
                    this.m = true;
                    lte lteVar = this.t;
                    lte.b(lteVar.a, this);
                    Executor executor = this.d;
                    if (executor != null) {
                        this.c.K(executor);
                        this.d = null;
                    }
                    this.o.notifyAll();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final String toString() {
        z0j Y = ezf.Y(this);
        Y.n(this.b.c, "logId");
        Y.q(this.n, "transportServer");
        return Y.toString();
    }
}
