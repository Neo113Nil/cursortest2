package com.gamericefishpro.space.n9;

import com.android.installreferrer.api.InstallReferrerClient;
import com.gamericefishpro.space.i9.w7;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class v4 {
    public final String a;
    public final boolean b;
    public final com.gamericefishpro.space.i9.l3 c;
    public final BitSet d;
    public final BitSet e;
    public final com.gamericefishpro.space.t.e f;
    public final com.gamericefishpro.space.t.e g;
    public final /* synthetic */ c h;

    public v4(c cVar, String str, com.gamericefishpro.space.i9.l3 l3Var, BitSet bitSet, BitSet bitSet2, com.gamericefishpro.space.t.e eVar, com.gamericefishpro.space.t.e eVar2) {
        this.h = cVar;
        this.a = str;
        this.d = bitSet;
        this.e = bitSet2;
        this.f = eVar;
        this.g = new com.gamericefishpro.space.t.e(0);
        for (Integer num : (com.gamericefishpro.space.t.b) eVar2.keySet()) {
            ArrayList arrayList = new ArrayList();
            arrayList.add((Long) eVar2.get(num));
            this.g.put(num, arrayList);
        }
        this.b = false;
        this.c = l3Var;
    }

    public final void a(b bVar) {
        int iQ;
        boolean z;
        boolean zV;
        switch (bVar.g) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                iQ = ((com.gamericefishpro.space.i9.n1) bVar.i).q();
                break;
            default:
                iQ = ((com.gamericefishpro.space.i9.u1) bVar.i).q();
                break;
        }
        if (bVar.c != null) {
            this.e.set(iQ, true);
        }
        Boolean bool = bVar.d;
        if (bool != null) {
            this.d.set(iQ, bool.booleanValue());
        }
        if (bVar.e != null) {
            Integer numValueOf = Integer.valueOf(iQ);
            com.gamericefishpro.space.t.e eVar = this.f;
            Long l = (Long) eVar.get(numValueOf);
            long jLongValue = bVar.e.longValue() / 1000;
            if (l == null || jLongValue > l.longValue()) {
                eVar.put(numValueOf, Long.valueOf(jLongValue));
            }
        }
        if (bVar.f != null) {
            Integer numValueOf2 = Integer.valueOf(iQ);
            com.gamericefishpro.space.t.e eVar2 = this.g;
            List arrayList = (List) eVar2.get(numValueOf2);
            if (arrayList == null) {
                arrayList = new ArrayList();
                eVar2.put(numValueOf2, arrayList);
            }
            switch (bVar.g) {
                case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                    z = false;
                    break;
                default:
                    z = true;
                    break;
            }
            if (z) {
                arrayList.clear();
            }
            w7.a();
            r1 r1Var = (r1) this.h.d;
            g gVar = r1Var.v;
            d0 d0Var = e0.F0;
            String str = this.a;
            if (gVar.B(str, d0Var)) {
                switch (bVar.g) {
                    case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                        zV = ((com.gamericefishpro.space.i9.n1) bVar.i).v();
                        break;
                    default:
                        zV = false;
                        break;
                }
                if (zV) {
                    arrayList.clear();
                }
            }
            w7.a();
            if (!r1Var.v.B(str, d0Var)) {
                arrayList.add(Long.valueOf(bVar.f.longValue() / 1000));
                return;
            }
            Long lValueOf = Long.valueOf(bVar.f.longValue() / 1000);
            if (arrayList.contains(lValueOf)) {
                return;
            }
            arrayList.add(lValueOf);
        }
    }

    public final com.gamericefishpro.space.i9.s2 b(int i) {
        ArrayList arrayList;
        List list;
        com.gamericefishpro.space.i9.r2 r2VarW = com.gamericefishpro.space.i9.s2.w();
        r2VarW.b();
        ((com.gamericefishpro.space.i9.s2) r2VarW.e).x(i);
        r2VarW.b();
        ((com.gamericefishpro.space.i9.s2) r2VarW.e).A(this.b);
        com.gamericefishpro.space.i9.l3 l3Var = this.c;
        if (l3Var != null) {
            r2VarW.b();
            ((com.gamericefishpro.space.i9.s2) r2VarW.e).z(l3Var);
        }
        com.gamericefishpro.space.i9.k3 k3VarX = com.gamericefishpro.space.i9.l3.x();
        ArrayList arrayListZ = z0.Z(this.d);
        k3VarX.b();
        ((com.gamericefishpro.space.i9.l3) k3VarX.e).B(arrayListZ);
        ArrayList arrayListZ2 = z0.Z(this.e);
        k3VarX.b();
        ((com.gamericefishpro.space.i9.l3) k3VarX.e).z(arrayListZ2);
        com.gamericefishpro.space.t.e eVar = this.f;
        if (eVar == null) {
            arrayList = null;
        } else {
            ArrayList arrayList2 = new ArrayList(eVar.i);
            for (Integer num : (com.gamericefishpro.space.t.b) eVar.keySet()) {
                int iIntValue = num.intValue();
                Long l = (Long) eVar.get(num);
                if (l != null) {
                    com.gamericefishpro.space.i9.x2 x2VarT = com.gamericefishpro.space.i9.y2.t();
                    x2VarT.b();
                    ((com.gamericefishpro.space.i9.y2) x2VarT.e).u(iIntValue);
                    long jLongValue = l.longValue();
                    x2VarT.b();
                    ((com.gamericefishpro.space.i9.y2) x2VarT.e).v(jLongValue);
                    arrayList2.add((com.gamericefishpro.space.i9.y2) x2VarT.e());
                }
            }
            arrayList = arrayList2;
        }
        if (arrayList != null) {
            k3VarX.b();
            ((com.gamericefishpro.space.i9.l3) k3VarX.e).D(arrayList);
        }
        com.gamericefishpro.space.t.e eVar2 = this.g;
        if (eVar2 == null) {
            list = Collections.EMPTY_LIST;
        } else {
            ArrayList arrayList3 = new ArrayList(eVar2.i);
            for (Integer num2 : (com.gamericefishpro.space.t.b) eVar2.keySet()) {
                com.gamericefishpro.space.i9.m3 m3VarU = com.gamericefishpro.space.i9.n3.u();
                int iIntValue2 = num2.intValue();
                m3VarU.b();
                ((com.gamericefishpro.space.i9.n3) m3VarU.e).v(iIntValue2);
                List list2 = (List) eVar2.get(num2);
                if (list2 != null) {
                    Collections.sort(list2);
                    m3VarU.b();
                    ((com.gamericefishpro.space.i9.n3) m3VarU.e).w(list2);
                }
                arrayList3.add((com.gamericefishpro.space.i9.n3) m3VarU.e());
            }
            list = arrayList3;
        }
        k3VarX.b();
        ((com.gamericefishpro.space.i9.l3) k3VarX.e).F(list);
        r2VarW.b();
        ((com.gamericefishpro.space.i9.s2) r2VarW.e).y((com.gamericefishpro.space.i9.l3) k3VarX.e());
        return (com.gamericefishpro.space.i9.s2) r2VarW.e();
    }

    public v4(c cVar, String str) {
        this.h = cVar;
        this.a = str;
        this.b = true;
        this.d = new BitSet();
        this.e = new BitSet();
        this.f = new com.gamericefishpro.space.t.e(0);
        this.g = new com.gamericefishpro.space.t.e(0);
    }
}
