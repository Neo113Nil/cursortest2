package com.yandex.plus.pay.graphql.offers;

import android.graphics.Color;
import android.os.Parcelable;
import com.yandex.plus.core.data.common.b0;
import com.yandex.plus.core.data.common.v;
import com.yandex.plus.core.graphql.fragment.a0;
import com.yandex.plus.core.graphql.fragment.bm;
import com.yandex.plus.core.graphql.fragment.em;
import com.yandex.plus.core.graphql.fragment.hm;
import com.yandex.plus.core.graphql.fragment.im;
import com.yandex.plus.core.graphql.fragment.jm;
import com.yandex.plus.core.graphql.fragment.km;
import com.yandex.plus.core.graphql.fragment.lm;
import com.yandex.plus.core.graphql.fragment.mb;
import com.yandex.plus.core.graphql.fragment.mm;
import com.yandex.plus.core.graphql.fragment.nb;
import com.yandex.plus.core.graphql.fragment.ob;
import com.yandex.plus.core.graphql.fragment.oo;
import com.yandex.plus.core.graphql.fragment.po;
import com.yandex.plus.core.graphql.fragment.qn;
import com.yandex.plus.core.graphql.fragment.ro;
import com.yandex.plus.core.graphql.fragment.sb;
import com.yandex.plus.core.graphql.fragment.tb;
import com.yandex.plus.core.graphql.fragment.ua;
import com.yandex.plus.core.graphql.fragment.ub;
import com.yandex.plus.core.graphql.fragment.vb;
import com.yandex.plus.core.graphql.fragment.wa;
import com.yandex.plus.core.graphql.fragment.xl;
import com.yandex.plus.core.graphql.fragment.yl;
import com.yandex.plus.core.graphql.fragment.z1;
import com.yandex.plus.core.graphql.q;
import com.yandex.plus.core.graphql.r;
import com.yandex.plus.core.graphql.s;
import com.yandex.plus.core.graphql.type.w0;
import com.yandex.plus.core.graphql.w;
import com.yandex.plus.core.graphql.x;
import com.yandex.plus.core.graphql.y;
import com.yandex.plus.core.graphql.z;
import com.yandex.plus.pay.repository.api.model.offers.a1;
import com.yandex.plus.pay.repository.api.model.offers.d1;
import com.yandex.plus.pay.repository.api.model.offers.g1;
import com.yandex.plus.pay.repository.api.model.offers.i1;
import com.yandex.plus.pay.repository.api.model.offers.l1;
import com.yandex.plus.pay.repository.api.model.offers.m0;
import com.yandex.plus.pay.repository.api.model.offers.m1;
import com.yandex.plus.pay.repository.api.model.offers.t0;
import com.yandex.plus.pay.repository.api.model.offers.x0;
import defpackage.b6e;
import defpackage.c5b;
import defpackage.r7o;
import defpackage.t7o;
import defpackage.v75;
import defpackage.z7o;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes5.dex */
public final class b {
    public final n a;
    public final a b;
    public final o c;
    public final p d;

    public b(n nVar, a aVar, o oVar, p pVar) {
        nVar.getClass();
        aVar.getClass();
        oVar.getClass();
        pVar.getClass();
        this.a = nVar;
        this.b = aVar;
        this.c = oVar;
        this.d = pVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v6, types: [c5b] */
    /* JADX WARN: Type inference failed for: r3v7, types: [java.util.ArrayList] */
    public static com.yandex.plus.pay.repository.api.model.offers.b a(com.yandex.plus.core.graphql.g gVar) {
        List list;
        String str;
        m0 m0Var;
        m1 m1Var;
        String str2 = gVar.a;
        String str3 = gVar.d;
        ArrayList arrayList = gVar.b;
        ArrayList arrayList2 = new ArrayList(v75.o(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            com.yandex.plus.core.graphql.fragment.i iVar = ((com.yandex.plus.core.graphql.l) it.next()).b;
            String str4 = iVar.g;
            String str5 = iVar.h;
            String str6 = iVar.j;
            String str7 = iVar.l;
            String str8 = iVar.k;
            String str9 = iVar.a;
            ArrayList<com.yandex.plus.core.graphql.fragment.g> arrayList3 = iVar.b;
            ArrayList arrayList4 = new ArrayList();
            for (com.yandex.plus.core.graphql.fragment.g gVar2 : arrayList3) {
                String str10 = gVar2 != null ? gVar2.a : null;
                if (str10 != null) {
                    arrayList4.add(str10);
                }
            }
            String str11 = iVar.c;
            Map map = iVar.d;
            boolean z = iVar.e;
            String str12 = str2;
            boolean z2 = iVar.f;
            ArrayList arrayList5 = iVar.i;
            l1 Q = com.yandex.plus.bdui.plus.analytics.b.Q(iVar.m);
            int ordinal = iVar.n.ordinal();
            if (ordinal != 0) {
                str = str3;
                if (ordinal != 1) {
                    if (ordinal == 2) {
                        throw new com.yandex.plus.core.graphql.exception.d("Unexpected UPSALE_TYPE_VIEW value", null);
                    }
                    b6e.s();
                    return null;
                }
                m0Var = null;
                m1Var = m1.b;
            } else {
                str = str3;
                m0Var = null;
                m1Var = m1.a;
            }
            m1 m1Var2 = m1Var;
            com.yandex.plus.core.graphql.fragment.h hVar = iVar.o;
            if (hVar != null) {
                m0Var = new m0(hVar.a, hVar.b);
            }
            arrayList2.add(new com.yandex.plus.pay.repository.api.model.offers.a(str4, str5, str6, str7, str8, str9, arrayList4, str11, map, z, z2, arrayList5, Q, m1Var2, m0Var));
            str2 = str12;
            str3 = str;
        }
        String str13 = str2;
        String str14 = str3;
        List list2 = gVar.c;
        if (list2 != null) {
            List list3 = list2;
            list = new ArrayList(v75.o(list3, 10));
            Iterator it2 = list3.iterator();
            while (it2.hasNext()) {
                list.add(com.yandex.plus.bdui.plus.analytics.b.Q((w0) it2.next()));
            }
        } else {
            list = 0;
        }
        if (list == 0) {
            list = c5b.a;
        }
        com.yandex.plus.core.graphql.m mVar = gVar.e;
        return new com.yandex.plus.pay.repository.api.model.offers.b(str13, str14, arrayList2, list, mVar != null ? new m0(mVar.a, mVar.b) : null);
    }

    public static /* synthetic */ com.yandex.plus.pay.repository.api.model.offers.i f(b bVar, vb vbVar, com.yandex.plus.pay.repository.api.model.offers.h hVar, b0 b0Var, com.yandex.plus.pay.repository.api.model.widget.c cVar, int i) {
        if ((i & 4) != 0) {
            b0Var = null;
        }
        return bVar.c(vbVar, hVar, null, b0Var, (i & 8) != 0 ? null : cVar);
    }

    public static int h(String str) {
        Object t7oVar;
        try {
            r7o r7oVar = z7o.b;
            t7oVar = Integer.valueOf(Color.parseColor(str));
        } catch (Throwable th) {
            r7o r7oVar2 = z7o.b;
            t7oVar = new t7o(th);
        }
        Throwable a = z7o.a(t7oVar);
        if (a == null) {
            return ((Number) t7oVar).intValue();
        }
        throw new com.yandex.plus.core.graphql.exception.d("Couldn't parse color: ".concat(str), a);
    }

    public final com.yandex.plus.pay.repository.api.model.offers.i b(s sVar) {
        com.yandex.plus.pay.repository.api.model.offers.i iVar;
        com.yandex.plus.core.graphql.o oVar = sVar.b;
        if (oVar != null) {
            return f(this, oVar.b, com.yandex.plus.pay.repository.api.model.offers.h.a, null, null, 14);
        }
        com.yandex.plus.core.graphql.p pVar = sVar.c;
        if (pVar != null) {
            return f(this, pVar.b, com.yandex.plus.pay.repository.api.model.offers.h.c, null, null, 14);
        }
        q qVar = sVar.f;
        if (qVar != null) {
            vb vbVar = qVar.c;
            com.yandex.plus.pay.repository.api.model.offers.h hVar = com.yandex.plus.pay.repository.api.model.offers.h.b;
            w wVar = qVar.b;
            b0 b0Var = new b0(wVar.a, wVar.b);
            x xVar = wVar.c;
            iVar = f(this, vbVar, hVar, b0Var, new com.yandex.plus.pay.repository.api.model.widget.c(xVar != null ? Long.valueOf(xVar.b) : null, xVar != null ? Long.valueOf(xVar.a) : null), 2);
        } else {
            iVar = null;
        }
        if (iVar == null) {
            com.yandex.plus.core.graphql.n nVar = sVar.d;
            if (nVar != null) {
                vb vbVar2 = nVar.d;
                com.yandex.plus.pay.repository.api.model.offers.h hVar2 = com.yandex.plus.pay.repository.api.model.offers.h.d;
                String str = nVar.b;
                z zVar = nVar.c;
                b0 b0Var2 = new b0(zVar != null ? zVar.a : null, zVar != null ? zVar.b : null);
                y yVar = zVar != null ? zVar.c : null;
                iVar = c(vbVar2, hVar2, str, b0Var2, new com.yandex.plus.pay.repository.api.model.widget.c(yVar != null ? Long.valueOf(yVar.b) : null, yVar != null ? Long.valueOf(yVar.a) : null));
            } else {
                iVar = null;
            }
            if (iVar == null) {
                r rVar = sVar.e;
                if (rVar != null) {
                    return f(this, rVar.b, com.yandex.plus.pay.repository.api.model.offers.h.e, null, null, 14);
                }
                return null;
            }
        }
        return iVar;
    }

    public final com.yandex.plus.pay.repository.api.model.offers.i c(vb vbVar, com.yandex.plus.pay.repository.api.model.offers.h hVar, String str, b0 b0Var, com.yandex.plus.pay.repository.api.model.widget.c cVar) {
        com.yandex.plus.pay.repository.api.model.offers.g gVar;
        String str2 = vbVar.a;
        String str3 = vbVar.b;
        ub ubVar = vbVar.c;
        String str4 = ubVar.b;
        tb tbVar = vbVar.d;
        com.yandex.plus.core.data.common.y yVar = new com.yandex.plus.core.data.common.y(str4, tbVar.b);
        v vVar = new v(new com.yandex.plus.core.data.common.f(h(ubVar.c)), new com.yandex.plus.core.data.common.f(h(tbVar.c)));
        v vVar2 = new v(new com.yandex.plus.core.data.common.f(h(ubVar.a)), new com.yandex.plus.core.data.common.f(h(tbVar.a)));
        sb sbVar = vbVar.e;
        if (sbVar != null) {
            ob obVar = sbVar.b;
            mb mbVar = obVar.a;
            i1 g = mbVar != null ? g(mbVar.b) : null;
            nb nbVar = obVar.b;
            gVar = new com.yandex.plus.pay.repository.api.model.offers.g(g, nbVar != null ? g(nbVar.b) : null);
        } else {
            gVar = null;
        }
        return new com.yandex.plus.pay.repository.api.model.offers.i(str2, hVar, str, str3, yVar, vVar, vVar2, gVar, b0Var, cVar);
    }

    public final com.yandex.plus.pay.repository.api.model.offers.n d(ro roVar) {
        com.yandex.plus.core.data.common.k kVar;
        String str = roVar.a;
        String str2 = roVar.b;
        String str3 = roVar.c;
        String str4 = roVar.d;
        Map map = roVar.e;
        Map map2 = roVar.f;
        String str5 = roVar.g;
        String str6 = roVar.h.a;
        oo ooVar = roVar.i;
        com.yandex.plus.pay.repository.api.model.offers.v vVar = null;
        if (ooVar != null) {
            a0 a0Var = ooVar.b;
            String str7 = a0Var.a;
            List list = a0Var.b;
            this.b.getClass();
            kVar = a.a(str7, list);
        } else {
            kVar = null;
        }
        po poVar = roVar.j;
        if (poVar != null) {
            qn qnVar = poVar.b;
            this.d.getClass();
            vVar = p.a(qnVar);
        }
        return new com.yandex.plus.pay.repository.api.model.offers.n(str, str2, str3, str4, map, map2, str5, str6, kVar, vVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1, types: [com.yandex.plus.pay.repository.api.model.offers.f] */
    public final List e(List list) {
        if (list == null) {
            return c5b.a;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            z1 z1Var = (z1) it.next();
            com.yandex.plus.core.data.common.k kVar = null;
            if (z1Var != null) {
                wa waVar = z1Var.b;
                String str = waVar.a;
                String str2 = waVar.b;
                String str3 = waVar.c;
                String str4 = waVar.d;
                Map map = waVar.e;
                Map map2 = waVar.f;
                String str5 = waVar.g;
                String str6 = waVar.h.a;
                ua uaVar = waVar.i;
                if (uaVar != null) {
                    a0 a0Var = uaVar.b;
                    String str7 = a0Var.a;
                    List list2 = a0Var.b;
                    this.b.getClass();
                    kVar = a.a(str7, list2);
                }
                kVar = new com.yandex.plus.pay.repository.api.model.offers.f(str, str2, str3, str4, map, map2, str5, str6, kVar);
            }
            if (kVar != null) {
                arrayList.add(kVar);
            }
        }
        return arrayList;
    }

    public final i1 g(yl ylVar) {
        Parcelable parcelable;
        String str = ylVar.a;
        ArrayList arrayList = ylVar.b;
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            mm mmVar = ((xl) it.next()).b;
            km kmVar = mmVar.g;
            String str2 = mmVar.c;
            String str3 = mmVar.b;
            if (kmVar != null) {
                parcelable = new a1(str3, str2, kmVar.a, kmVar.b);
            } else {
                lm lmVar = mmVar.h;
                if (lmVar != null) {
                    parcelable = new d1(str3, str2, lmVar.a);
                } else {
                    im imVar = mmVar.e;
                    Parcelable t0Var = imVar != null ? new t0(str3, str2, imVar.a) : null;
                    if (t0Var == null) {
                        jm jmVar = mmVar.f;
                        if (jmVar != null) {
                            em emVar = jmVar.a;
                            t0Var = new x0(str3, str2, null, new com.yandex.plus.core.data.common.y(emVar.a.a, emVar.b.a));
                        } else {
                            t0Var = null;
                        }
                        if (t0Var == null) {
                            hm hmVar = mmVar.d;
                            if (hmVar != null) {
                                String str4 = hmVar.a;
                                bm bmVar = hmVar.b;
                                this.c.getClass();
                                parcelable = new g1(str3, str2, str4, new v(o.b(bmVar.a.b), o.b(bmVar.b.b)));
                            } else {
                                parcelable = null;
                            }
                        }
                    }
                    parcelable = t0Var;
                }
            }
            if (parcelable != null) {
                arrayList2.add(parcelable);
            }
        }
        return new i1(str, arrayList2);
    }
}
