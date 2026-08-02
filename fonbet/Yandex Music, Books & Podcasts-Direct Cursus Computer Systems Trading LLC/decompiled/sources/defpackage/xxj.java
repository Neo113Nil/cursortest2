package defpackage;

import io.grpc.util.b;
import java.lang.reflect.Array;
import java.net.SocketAddress;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes5.dex */
public final class xxj extends zsc {
    public final zdg b;
    public qxj c;
    public boolean d;
    public s76 e;
    public beg f;
    public final zc4 g;
    public final /* synthetic */ b h;

    public xxj(b bVar, ime imeVar, qwd qwdVar) {
        super(0);
        this.h = bVar;
        beg begVar = (beg) imeVar.u();
        if (begVar != null) {
            this.f = begVar;
            owd owdVar = new owd(1, this, begVar);
            t1f C = ime.C();
            C.U((List) imeVar.b);
            xu1 xu1Var = (xu1) imeVar.c;
            o2g.O(xu1Var, "attrs");
            C.c = xu1Var;
            Object[][] objArr = (Object[][]) imeVar.d;
            Object[][] objArr2 = (Object[][]) Array.newInstance((Class<?>) Object.class, objArr.length, 2);
            C.d = objArr2;
            System.arraycopy(objArr, 0, objArr2, 0, objArr.length);
            C.o(owdVar);
            this.b = qwdVar.K(new ime((List) C.b, (xu1) C.c, (Object[][]) C.d));
        } else {
            this.b = qwdVar.K(imeVar);
        }
        this.g = this.b.v();
    }

    @Override // defpackage.zsc, defpackage.zdg
    public final void F() {
        qxj qxjVar = this.c;
        if (qxjVar != null) {
            this.c = null;
            qxjVar.f.remove(this);
        }
        super.F();
    }

    @Override // defpackage.zdg
    public final void H(beg begVar) {
        if (this.f != null) {
            S().H(begVar);
            return;
        }
        this.f = begVar;
        S().H(new owd(1, this, begVar));
    }

    @Override // defpackage.zsc, defpackage.zdg
    public final void Q(List list) {
        b bVar = this.h;
        if (b.z(t()) && b.z(list)) {
            if (bVar.g.containsValue(this.c)) {
                qxj qxjVar = this.c;
                qxjVar.getClass();
                this.c = null;
                qxjVar.f.remove(this);
            }
            SocketAddress socketAddress = (SocketAddress) ((reb) list.get(0)).a.get(0);
            if (bVar.g.containsKey(socketAddress)) {
                ((qxj) bVar.g.get(socketAddress)).a(this);
            }
        } else if (!b.z(t()) || b.z(list)) {
            if (!b.z(t()) && b.z(list)) {
                SocketAddress socketAddress2 = (SocketAddress) ((reb) list.get(0)).a.get(0);
                if (bVar.g.containsKey(socketAddress2)) {
                    ((qxj) bVar.g.get(socketAddress2)).a(this);
                }
            }
        } else if (bVar.g.containsKey(s().a.get(0))) {
            qxj qxjVar2 = (qxj) bVar.g.get(s().a.get(0));
            qxjVar2.getClass();
            this.c = null;
            qxjVar2.f.remove(this);
            aqd aqdVar = qxjVar2.b;
            ((AtomicLong) aqdVar.b).set(0L);
            ((AtomicLong) aqdVar.c).set(0L);
            aqd aqdVar2 = qxjVar2.c;
            ((AtomicLong) aqdVar2.b).set(0L);
            ((AtomicLong) aqdVar2.c).set(0L);
        }
        this.b.Q(list);
    }

    @Override // defpackage.zsc
    public final zdg S() {
        return this.b;
    }

    public final void T() {
        this.d = true;
        beg begVar = this.f;
        sgr sgrVar = sgr.o;
        o2g.J("The error status must not be OK", true ^ sgrVar.g());
        begVar.a(new s76(r76.c, sgrVar));
        this.g.J(2, "Subchannel ejected: {0}", this);
    }

    @Override // defpackage.zsc, defpackage.zdg
    public final String toString() {
        return "OutlierDetectionSubchannel{addresses=" + this.b.t() + '}';
    }

    @Override // defpackage.zdg
    public final xu1 u() {
        qxj qxjVar = this.c;
        zdg zdgVar = this.b;
        if (qxjVar == null) {
            return zdgVar.u();
        }
        xu1 u = zdgVar.u();
        u.getClass();
        qxj qxjVar2 = this.c;
        IdentityHashMap identityHashMap = new IdentityHashMap(1);
        identityHashMap.put(b.o, qxjVar2);
        for (Map.Entry entry : u.a.entrySet()) {
            if (!identityHashMap.containsKey(entry.getKey())) {
                identityHashMap.put((wu1) entry.getKey(), entry.getValue());
            }
        }
        return new xu1(identityHashMap);
    }
}
