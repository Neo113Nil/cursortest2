package io.grpc.internal;

import defpackage.aeg;
import defpackage.ceg;
import defpackage.ime;
import defpackage.ldg;
import defpackage.lwe;
import defpackage.owd;
import defpackage.r76;
import defpackage.reb;
import defpackage.s76;
import defpackage.sgr;
import defpackage.t1f;
import defpackage.vrk;
import defpackage.wdg;
import defpackage.wrk;
import defpackage.xdg;
import defpackage.xrk;
import defpackage.xu1;
import defpackage.ydg;
import defpackage.yrk;
import defpackage.zdg;
import java.net.SocketAddress;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Logger;

/* loaded from: classes5.dex */
public final class a extends ceg {
    public static final Logger l = Logger.getLogger(a.class.getName());
    public final wdg g;
    public final HashMap h;
    public lwe i;
    public r76 j;
    public r76 k;

    public a(wdg wdgVar) {
        super(0);
        this.h = new HashMap();
        r76 r76Var = r76.d;
        this.j = r76Var;
        this.k = r76Var;
        this.g = wdgVar;
    }

    public final void A(r76 r76Var, aeg aegVar) {
        if (r76Var == this.k && (r76Var == r76.d || r76Var == r76.a)) {
            return;
        }
        this.k = r76Var;
        this.g.Z(r76Var, aegVar);
    }

    public final void B(yrk yrkVar) {
        r76 r76Var = yrkVar.b;
        r76 r76Var2 = r76.b;
        if (r76Var != r76Var2) {
            return;
        }
        s76 s76Var = yrkVar.c.a;
        r76 r76Var3 = s76Var.a;
        if (r76Var3 == r76Var2) {
            A(r76Var2, new wrk(xdg.b(yrkVar.a, null), 1));
            return;
        }
        r76 r76Var4 = r76.c;
        if (r76Var3 == r76Var4) {
            A(r76Var4, new wrk(xdg.a(s76Var.b), 0));
        } else if (this.k != r76Var4) {
            A(r76Var3, new wrk(xdg.e, 0));
        }
    }

    @Override // defpackage.ceg
    public final sgr a(ydg ydgVar) {
        r76 r76Var;
        List list = ydgVar.a;
        xu1 xu1Var = ydgVar.b;
        if (list.isEmpty()) {
            sgr i = sgr.o.i("NameResolver returned no usable address. addrs=" + list + ", attrs=" + xu1Var);
            p(i);
            return i;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (((reb) it.next()) == null) {
                sgr i2 = sgr.o.i("NameResolver returned address list with null endpoint. addrs=" + list + ", attrs=" + xu1Var);
                p(i2);
                return i2;
            }
        }
        List unmodifiableList = Collections.unmodifiableList(new ArrayList(list));
        lwe lweVar = this.i;
        r76 r76Var2 = r76.b;
        if (lweVar == null) {
            lwe lweVar2 = new lwe();
            lweVar2.a = unmodifiableList;
            this.i = lweVar2;
        } else if (this.j == r76Var2) {
            SocketAddress a = lweVar.a();
            lwe lweVar3 = this.i;
            lweVar3.a = unmodifiableList;
            lweVar3.b = 0;
            lweVar3.c = 0;
            if (lweVar3.e(a)) {
                return sgr.e;
            }
            lwe lweVar4 = this.i;
            lweVar4.b = 0;
            lweVar4.c = 0;
        } else {
            lweVar.a = unmodifiableList;
            lweVar.b = 0;
            lweVar.c = 0;
        }
        HashMap hashMap = this.h;
        HashSet hashSet = new HashSet(hashMap.keySet());
        HashSet hashSet2 = new HashSet();
        Iterator it2 = unmodifiableList.iterator();
        while (it2.hasNext()) {
            for (SocketAddress socketAddress : ((reb) it2.next()).a) {
                hashSet2.add(socketAddress);
                if (!hashMap.containsKey(socketAddress)) {
                    z(socketAddress);
                }
            }
        }
        Iterator it3 = hashSet.iterator();
        while (it3.hasNext()) {
            SocketAddress socketAddress2 = (SocketAddress) it3.next();
            if (!hashSet2.contains(socketAddress2)) {
                ((yrk) hashMap.get(socketAddress2)).a.F();
                hashMap.remove(socketAddress2);
            }
        }
        int size = hashSet.size();
        r76 r76Var3 = r76.a;
        if (size == 0 || (r76Var = this.j) == r76Var3 || r76Var == r76Var2) {
            this.j = r76Var3;
            A(r76Var3, new wrk(xdg.e, 0));
            x();
        } else {
            r76 r76Var4 = r76.d;
            if (r76Var == r76Var4) {
                A(r76Var4, new xrk(this, this));
            } else if (r76Var == r76.c) {
                x();
            }
        }
        return sgr.e;
    }

    @Override // defpackage.ceg
    public final void p(sgr sgrVar) {
        HashMap hashMap = this.h;
        Iterator it = hashMap.values().iterator();
        while (it.hasNext()) {
            ((yrk) it.next()).a.F();
        }
        hashMap.clear();
        A(r76.c, new wrk(xdg.a(sgrVar), 0));
    }

    @Override // defpackage.ceg
    public final void x() {
        HashMap hashMap = this.h;
        if (hashMap.size() != 0 && this.i.c()) {
            boolean containsKey = hashMap.containsKey(this.i.a());
            lwe lweVar = this.i;
            zdg z = containsKey ? ((yrk) hashMap.get(lweVar.a())).a : z(lweVar.a());
            r76 r76Var = ((yrk) hashMap.get(this.i.a())).b;
            if (r76Var == r76.d) {
                z.D();
            } else if (r76Var == r76.a || r76Var == r76.c) {
                this.i.b();
                x();
            }
        }
    }

    @Override // defpackage.ceg
    public final void y() {
        HashMap hashMap = this.h;
        Iterator it = hashMap.values().iterator();
        while (it.hasNext()) {
            ((yrk) it.next()).a.F();
        }
        hashMap.clear();
    }

    public final zdg z(SocketAddress socketAddress) {
        vrk vrkVar = new vrk(this);
        t1f C = ime.C();
        C.U(ldg.z(new reb(socketAddress)));
        C.o(vrkVar);
        zdg K = this.g.K(new ime((List) C.b, (xu1) C.c, (Object[][]) C.d));
        yrk yrkVar = new yrk(K, vrkVar);
        vrkVar.b = yrkVar;
        this.h.put(socketAddress, yrkVar);
        xu1 u = K.u();
        if (u.a.get(ceg.e) == null) {
            vrkVar.a = s76.a(r76.b);
        }
        K.H(new owd(2, this, K));
        return K;
    }
}
