package defpackage;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import org.bouncycastle.cms.CMSException;

/* loaded from: classes4.dex */
public final class u87 {
    public static final y87 e = y87.a;
    public static final fah f = new fah();
    public ubs0 a;
    public ige b;
    public z87 c;
    public bcs0 d;

    public u87(ige igeVar) {
        this.b = igeVar;
        ubs0 a = a();
        this.a = a;
        ige igeVar2 = a.c;
        a2 a2Var = igeVar2.b;
        if (a2Var == null) {
            this.c = null;
            return;
        }
        boolean z = a2Var instanceof w2;
        u2 u2Var = igeVar2.a;
        if (!z) {
            this.c = new nw70(u2Var, a2Var);
        } else {
            this.c = new md6(6, u2Var, ((w2) a2Var).a);
        }
    }

    public static u87 c(u87 u87Var, ncc nccVar, ncc nccVar2, ncc nccVar3) {
        u87 u87Var2 = new u87(u87Var);
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(b97.f(nccVar));
        arrayList.addAll(b97.d(nccVar2));
        rd4 c = b97.c(arrayList);
        rd4 rd4Var = c.a.length != 0 ? c : null;
        rd4 c2 = b97.c(b97.e(nccVar3));
        rd4 rd4Var2 = c2.a.length != 0 ? c2 : null;
        ubs0 ubs0Var = u87Var.a;
        ubs0 ubs0Var2 = new ubs0(ubs0Var.b, ubs0Var.c, rd4Var, rd4Var2, ubs0Var.w);
        u87Var2.a = ubs0Var2;
        u87Var2.b = new ige(u87Var2.b.a, ubs0Var2);
        return u87Var2;
    }

    public static u87 d(u87 u87Var, bcs0 bcs0Var) {
        u87 u87Var2 = new u87(u87Var);
        u87Var2.d = bcs0Var;
        HashSet hashSet = new HashSet();
        ArrayList a = bcs0Var.a();
        c2 c2Var = new c2(a.size());
        Iterator it = a.iterator();
        while (it.hasNext()) {
            acs0 acs0Var = (acs0) it.next();
            b97.a(hashSet, acs0Var, f);
            c2Var.a(acs0Var.toASN1Structure());
        }
        int i = b97.a;
        zvf zvfVar = new zvf((xr1[]) hashSet.toArray(new xr1[hashSet.size()]), false);
        zvfVar.w = -1;
        zvf zvfVar2 = new zvf(c2Var);
        i3 i3Var = (i3) u87Var.a.toASN1Primitive();
        c2 c2Var2 = new c2(i3Var.size());
        c2Var2.a(i3Var.A(0));
        c2Var2.a(zvfVar);
        for (int i2 = 2; i2 != i3Var.size() - 1; i2++) {
            c2Var2.a(i3Var.A(i2));
        }
        c2Var2.a(zvfVar2);
        ubs0 ubs0Var = new ubs0(i3.z(new nd4(c2Var2)));
        u87Var2.a = ubs0Var;
        u87Var2.b = new ige(u87Var2.b.a, ubs0Var);
        return u87Var2;
    }

    public final ubs0 a() {
        try {
            a2 a2Var = this.b.b;
            l2 l2Var = ubs0.D;
            if (a2Var instanceof ubs0) {
                return (ubs0) a2Var;
            }
            if (a2Var != null) {
                return new ubs0(i3.z(a2Var));
            }
            return null;
        } catch (ClassCastException e2) {
            throw new CMSException("Malformed content.", e2);
        } catch (IllegalArgumentException e3) {
            throw new CMSException("Malformed content.", e3);
        }
    }

    public final bcs0 b() {
        if (this.d == null) {
            m3 m3Var = this.a.w;
            ArrayList arrayList = new ArrayList();
            int i = 0;
            while (true) {
                a2[] a2VarArr = m3Var.a;
                if (i == a2VarArr.length) {
                    break;
                }
                arrayList.add(new acs0(ybs0.m(a2VarArr[i]), this.a.c.a, this.c, null));
                i++;
            }
            this.d = new bcs0(arrayList);
        }
        return this.d;
    }

    public u87(u87 u87Var) {
        this.a = u87Var.a;
        this.b = u87Var.b;
        this.c = u87Var.c;
        this.d = u87Var.d;
    }

    public u87(byte[] bArr) {
        this(b97.h(bArr));
    }
}
