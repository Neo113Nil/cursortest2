package com.yandex.plus.core.graphql.type.adapter;

import com.connectsdk.discovery.provider.ssdp.SSDPDeviceDescriptionParser;
import com.yandex.plus.core.graphql.type.b0;
import com.yandex.plus.core.graphql.type.e0;
import com.yandex.plus.core.graphql.type.f0;
import com.yandex.plus.core.graphql.type.g0;
import com.yandex.plus.core.graphql.type.h;
import com.yandex.plus.core.graphql.type.h0;
import com.yandex.plus.core.graphql.type.j0;
import com.yandex.plus.core.graphql.type.k0;
import com.yandex.plus.core.graphql.type.l;
import com.yandex.plus.core.graphql.type.l0;
import com.yandex.plus.core.graphql.type.m;
import com.yandex.plus.core.graphql.type.m0;
import com.yandex.plus.core.graphql.type.n;
import com.yandex.plus.core.graphql.type.n0;
import com.yandex.plus.core.graphql.type.o;
import com.yandex.plus.core.graphql.type.o0;
import com.yandex.plus.core.graphql.type.p;
import com.yandex.plus.core.graphql.type.p0;
import com.yandex.plus.core.graphql.type.r0;
import com.yandex.plus.core.graphql.type.t;
import com.yandex.plus.core.graphql.type.t0;
import com.yandex.plus.core.graphql.type.v0;
import com.yandex.plus.core.graphql.type.w;
import com.yandex.plus.core.graphql.type.w0;
import com.yandex.plus.core.graphql.type.x;
import com.yandex.plus.core.graphql.type.z;
import com.yandex.plus.core.graphql.type.z0;
import defpackage.a7f;
import defpackage.fx6;
import defpackage.j8g;
import defpackage.kwj;
import defpackage.ouj;
import defpackage.pj;
import defpackage.q7g;
import defpackage.qhj;
import defpackage.r7f;
import defpackage.tj;
import defpackage.uj;
import defpackage.vgj;
import io.appmetrica.analytics.rtm.internal.Constants;
import java.math.BigDecimal;
import java.util.ArrayList;

/* loaded from: classes4.dex */
public final class a implements pj {
    public final /* synthetic */ int a;
    public static final a b = new a(0);
    public static final a c = new a(1);
    public static final a d = new a(2);
    public static final a e = new a(3);
    public static final a f = new a(4);
    public static final a g = new a(5);
    public static final a h = new a(6);
    public static final a i = new a(7);
    public static final a j = new a(8);
    public static final a k = new a(9);
    public static final a l = new a(10);
    public static final a m = new a(11);
    public static final a n = new a(12);
    public static final a o = new a(13);
    public static final a p = new a(14);
    public static final a q = new a(15);
    public static final a r = new a(16);
    public static final a s = new a(17);
    public static final a t = new a(18);
    public static final a u = new a(19);
    public static final a v = new a(20);
    public static final a w = new a(21);
    public static final a x = new a(22);
    public static final a y = new a(23);
    public static final a z = new a(24);
    public static final a A = new a(25);
    public static final a B = new a(26);
    public static final a C = new a(27);
    public static final a D = new a(28);

    public /* synthetic */ a(int i2) {
        this.a = i2;
    }

    @Override // defpackage.pj
    public final void a(r7f r7fVar, fx6 fx6Var, Object obj) {
        switch (this.a) {
            case 0:
                h hVar = (h) obj;
                r7fVar.getClass();
                fx6Var.getClass();
                hVar.getClass();
                r7fVar.m0(hVar.a);
                return;
            case 1:
                l lVar = (l) obj;
                r7fVar.getClass();
                fx6Var.getClass();
                lVar.getClass();
                r7fVar.Z("isSelected");
                uj.f.a(r7fVar, fx6Var, Boolean.valueOf(lVar.a));
                r7fVar.Z("offerName");
                fx6Var.e(z.d).a(r7fVar, fx6Var, lVar.b);
                r7fVar.Z("offersBatchId");
                tj tjVar = uj.a;
                tjVar.a(r7fVar, fx6Var, lVar.c);
                r7fVar.Z("positionId");
                tjVar.a(r7fVar, fx6Var, lVar.d);
                r7fVar.Z("upsaleStep");
                r7fVar.m0(lVar.e.a);
                return;
            case 2:
                m mVar = (m) obj;
                r7fVar.getClass();
                fx6Var.getClass();
                mVar.getClass();
                q7g q7gVar = mVar.a;
                q7g q7gVar2 = mVar.b;
                if (q7gVar instanceof kwj) {
                    r7fVar.Z("offers");
                    tj tjVar2 = uj.a;
                    j8g j8gVar = new j8g(new qhj(c, false), 0);
                    Object obj2 = ((kwj) q7gVar).f;
                    if (obj2 == null) {
                        r7fVar.B0();
                    } else {
                        j8gVar.a(r7fVar, fx6Var, obj2);
                    }
                }
                if (q7gVar2 instanceof kwj) {
                    r7fVar.Z("passedUpsaleSteps");
                    tj tjVar3 = uj.a;
                    j8g j8gVar2 = new j8g(B, 0);
                    Object obj3 = ((kwj) q7gVar2).f;
                    if (obj3 == null) {
                        r7fVar.B0();
                        return;
                    } else {
                        j8gVar2.a(r7fVar, fx6Var, obj3);
                        return;
                    }
                }
                return;
            case 3:
                n nVar = (n) obj;
                r7fVar.getClass();
                fx6Var.getClass();
                nVar.getClass();
                r7fVar.Z("offerName");
                fx6Var.e(z.d).a(r7fVar, fx6Var, nVar.a);
                r7fVar.Z("offersBatchId");
                tj tjVar4 = uj.a;
                tjVar4.a(r7fVar, fx6Var, nVar.b);
                r7fVar.Z("positionId");
                tjVar4.a(r7fVar, fx6Var, nVar.c);
                return;
            case 4:
                o oVar = (o) obj;
                r7fVar.getClass();
                fx6Var.getClass();
                oVar.getClass();
                q7g q7gVar3 = oVar.a;
                if (q7gVar3 instanceof kwj) {
                    r7fVar.Z("offers");
                    tj tjVar5 = uj.a;
                    j8g j8gVar3 = new j8g(new qhj(e, false), 0);
                    Object obj4 = ((kwj) q7gVar3).f;
                    if (obj4 == null) {
                        r7fVar.B0();
                        return;
                    } else {
                        j8gVar3.a(r7fVar, fx6Var, obj4);
                        return;
                    }
                }
                return;
            case 5:
                p pVar = (p) obj;
                r7fVar.getClass();
                fx6Var.getClass();
                pVar.getClass();
                r7fVar.m0(pVar.a);
                return;
            case 6:
                if (obj != null) {
                    throw new ClassCastException();
                }
                r7fVar.getClass();
                fx6Var.getClass();
                throw null;
            case 7:
                t tVar = (t) obj;
                r7fVar.getClass();
                fx6Var.getClass();
                tVar.getClass();
                r7fVar.m0(tVar.a);
                return;
            case 8:
                w wVar = (w) obj;
                r7fVar.getClass();
                fx6Var.getClass();
                wVar.getClass();
                r7fVar.m0(wVar.a);
                return;
            case 9:
                x xVar = (x) obj;
                r7fVar.getClass();
                fx6Var.getClass();
                xVar.getClass();
                r7fVar.Z("orderId");
                tj tjVar6 = uj.a;
                tjVar6.a(r7fVar, fx6Var, xVar.a);
                r7fVar.Z("productId");
                tjVar6.a(r7fVar, fx6Var, xVar.b);
                r7fVar.Z("purchaseToken");
                tjVar6.a(r7fVar, fx6Var, xVar.c);
                return;
            case 10:
                if (obj != null) {
                    throw new ClassCastException();
                }
                r7fVar.getClass();
                fx6Var.getClass();
                throw null;
            case 11:
                if (obj != null) {
                    throw new ClassCastException();
                }
                r7fVar.getClass();
                fx6Var.getClass();
                throw null;
            case 12:
                b0 b0Var = (b0) obj;
                r7fVar.getClass();
                fx6Var.getClass();
                b0Var.getClass();
                r7fVar.m0(b0Var.a);
                return;
            case 13:
                e0 e0Var = (e0) obj;
                r7fVar.getClass();
                fx6Var.getClass();
                e0Var.getClass();
                r7fVar.m0(e0Var.a);
                return;
            case 14:
                f0 f0Var = (f0) obj;
                r7fVar.getClass();
                fx6Var.getClass();
                f0Var.getClass();
                r7fVar.Z("amount");
                BigDecimal bigDecimal = f0Var.a;
                bigDecimal.getClass();
                String bigDecimal2 = bigDecimal.toString();
                bigDecimal2.getClass();
                r7fVar.m0(bigDecimal2);
                r7fVar.Z("currency");
                uj.g.a(r7fVar, fx6Var, f0Var.b);
                return;
            case 15:
                g0 g0Var = (g0) obj;
                r7fVar.getClass();
                fx6Var.getClass();
                g0Var.getClass();
                r7fVar.Z("commonPeriodDuration");
                uj.g.a(r7fVar, fx6Var, g0Var.a);
                r7fVar.Z("commonPrice");
                f0 f0Var2 = g0Var.b;
                r7fVar.j();
                p.a(r7fVar, fx6Var, f0Var2);
                r7fVar.p();
                q7g q7gVar4 = g0Var.c;
                if (q7gVar4 instanceof kwj) {
                    r7fVar.Z("quantity");
                    uj.b(uj.k).d(r7fVar, fx6Var, (kwj) q7gVar4);
                    return;
                }
                return;
            case 16:
                h0 h0Var = (h0) obj;
                r7fVar.getClass();
                fx6Var.getClass();
                h0Var.getClass();
                r7fVar.m0(h0Var.a);
                return;
            case 17:
                j0 j0Var = (j0) obj;
                r7fVar.getClass();
                fx6Var.getClass();
                j0Var.getClass();
                r7fVar.m0(j0Var.a);
                return;
            case 18:
                k0 k0Var = (k0) obj;
                r7fVar.getClass();
                fx6Var.getClass();
                k0Var.getClass();
                r7fVar.Z("offerName");
                fx6Var.e(z.d).a(r7fVar, fx6Var, k0Var.a);
                r7fVar.Z("purchasePlans");
                tj tjVar7 = uj.a;
                qhj qhjVar = new qhj(q, false);
                ArrayList arrayList = k0Var.b;
                r7fVar.m();
                for (Object obj5 : arrayList) {
                    if (obj5 == null) {
                        r7fVar.B0();
                    } else {
                        qhjVar.a(r7fVar, fx6Var, obj5);
                    }
                }
                r7fVar.l();
                return;
            case 19:
                l0 l0Var = (l0) obj;
                r7fVar.getClass();
                fx6Var.getClass();
                l0Var.getClass();
                q7g q7gVar5 = l0Var.a;
                if (q7gVar5 instanceof kwj) {
                    r7fVar.Z("inAppPurchases");
                    tj tjVar8 = uj.a;
                    j8g j8gVar4 = new j8g(new vgj(new qhj(k, false)), 0);
                    Object obj6 = ((kwj) q7gVar5).f;
                    if (obj6 == null) {
                        r7fVar.B0();
                    } else {
                        j8gVar4.a(r7fVar, fx6Var, obj6);
                    }
                }
                r7fVar.Z("storeOffers");
                tj tjVar9 = uj.a;
                qhj qhjVar2 = new qhj(t, false);
                ArrayList arrayList2 = l0Var.b;
                r7fVar.m();
                for (Object obj7 : arrayList2) {
                    if (obj7 == null) {
                        r7fVar.B0();
                    } else {
                        qhjVar2.a(r7fVar, fx6Var, obj7);
                    }
                }
                r7fVar.l();
                return;
            case 20:
                m0 m0Var = (m0) obj;
                r7fVar.getClass();
                fx6Var.getClass();
                m0Var.getClass();
                r7fVar.m0(m0Var.a);
                return;
            case 21:
                n0 n0Var = (n0) obj;
                r7fVar.getClass();
                fx6Var.getClass();
                n0Var.getClass();
                r7fVar.m0(n0Var.a);
                return;
            case 22:
                o0 o0Var = (o0) obj;
                r7fVar.getClass();
                fx6Var.getClass();
                o0Var.getClass();
                r7fVar.m0(o0Var.a);
                return;
            case 23:
                r7fVar.getClass();
                fx6Var.getClass();
                ((p0) obj).getClass();
                r7fVar.Z("type");
                tj tjVar10 = uj.a;
                throw null;
            case 24:
                r0 r0Var = (r0) obj;
                r7fVar.getClass();
                fx6Var.getClass();
                r0Var.getClass();
                r7fVar.m0(r0Var.a);
                return;
            case 25:
                t0 t0Var = (t0) obj;
                r7fVar.getClass();
                fx6Var.getClass();
                t0Var.getClass();
                q7g q7gVar6 = t0Var.B;
                q7g q7gVar7 = t0Var.A;
                q7g q7gVar8 = t0Var.z;
                q7g q7gVar9 = t0Var.y;
                q7g q7gVar10 = t0Var.w;
                q7g q7gVar11 = t0Var.v;
                q7g q7gVar12 = t0Var.a;
                q7g q7gVar13 = t0Var.u;
                q7g q7gVar14 = t0Var.t;
                q7g q7gVar15 = t0Var.s;
                q7g q7gVar16 = t0Var.r;
                q7g q7gVar17 = t0Var.q;
                q7g q7gVar18 = t0Var.p;
                q7g q7gVar19 = t0Var.o;
                q7g q7gVar20 = t0Var.n;
                q7g q7gVar21 = t0Var.m;
                q7g q7gVar22 = t0Var.l;
                q7g q7gVar23 = t0Var.j;
                q7g q7gVar24 = t0Var.i;
                q7g q7gVar25 = t0Var.h;
                q7g q7gVar26 = t0Var.g;
                q7g q7gVar27 = t0Var.f;
                q7g q7gVar28 = t0Var.e;
                q7g q7gVar29 = t0Var.d;
                q7g q7gVar30 = t0Var.c;
                q7g q7gVar31 = t0Var.b;
                if (q7gVar12 instanceof kwj) {
                    r7fVar.Z("appMetricaUUID");
                    uj.b(uj.i).d(r7fVar, fx6Var, (kwj) q7gVar12);
                }
                if (q7gVar31 instanceof kwj) {
                    r7fVar.Z("appVersion");
                    uj.b(uj.i).d(r7fVar, fx6Var, (kwj) q7gVar31);
                }
                if (q7gVar30 instanceof kwj) {
                    r7fVar.Z("consumer");
                    uj.b(uj.i).d(r7fVar, fx6Var, (kwj) q7gVar30);
                }
                if (q7gVar29 instanceof kwj) {
                    r7fVar.Z("consumerType");
                    tj tjVar11 = uj.a;
                    a aVar = b;
                    Object obj8 = ((kwj) q7gVar29).f;
                    if (obj8 == null) {
                        r7fVar.B0();
                    } else {
                        aVar.a(r7fVar, fx6Var, obj8);
                    }
                }
                if (q7gVar28 instanceof kwj) {
                    r7fVar.Z("device");
                    tj tjVar12 = uj.a;
                    a aVar2 = g;
                    Object obj9 = ((kwj) q7gVar28).f;
                    if (obj9 == null) {
                        r7fVar.B0();
                    } else {
                        aVar2.a(r7fVar, fx6Var, obj9);
                    }
                }
                if (q7gVar27 instanceof kwj) {
                    r7fVar.Z("featureNames");
                    j8g j8gVar5 = new j8g(uj.a, 0);
                    Object obj10 = ((kwj) q7gVar27).f;
                    if (obj10 == null) {
                        r7fVar.B0();
                    } else {
                        j8gVar5.a(r7fVar, fx6Var, obj10);
                    }
                }
                if (q7gVar26 instanceof kwj) {
                    r7fVar.Z("flags");
                    j8g j8gVar6 = new j8g(uj.a, 0);
                    Object obj11 = ((kwj) q7gVar26).f;
                    if (obj11 == null) {
                        r7fVar.B0();
                    } else {
                        j8gVar6.a(r7fVar, fx6Var, obj11);
                    }
                }
                if (q7gVar25 instanceof kwj) {
                    r7fVar.Z("geoId");
                    uj.b(uj.k).d(r7fVar, fx6Var, (kwj) q7gVar25);
                }
                if (q7gVar24 instanceof kwj) {
                    r7fVar.Z("inappCountryCode");
                    uj.b(uj.i).d(r7fVar, fx6Var, (kwj) q7gVar24);
                }
                if (q7gVar23 instanceof kwj) {
                    r7fVar.Z("isNativePaymentAvailable");
                    uj.b(uj.l).d(r7fVar, fx6Var, (kwj) q7gVar23);
                }
                r7fVar.Z("language");
                tj tjVar13 = uj.a;
                tjVar13.a(r7fVar, fx6Var, t0Var.k);
                if (q7gVar22 instanceof kwj) {
                    r7fVar.Z("layoutId");
                    uj.b(uj.k).d(r7fVar, fx6Var, (kwj) q7gVar22);
                }
                if (q7gVar21 instanceof kwj) {
                    r7fVar.Z(SSDPDeviceDescriptionParser.TAG_LOCATION);
                    qhj qhjVar3 = new qhj(l, false);
                    Object obj12 = ((kwj) q7gVar21).f;
                    if (obj12 == null) {
                        r7fVar.B0();
                    } else {
                        qhjVar3.a(r7fVar, fx6Var, obj12);
                    }
                }
                if (q7gVar20 instanceof kwj) {
                    r7fVar.Z("loyaltyInfo");
                    j8g j8gVar7 = new j8g(new qhj(m, false), 0);
                    Object obj13 = ((kwj) q7gVar20).f;
                    if (obj13 == null) {
                        r7fVar.B0();
                    } else {
                        j8gVar7.a(r7fVar, fx6Var, obj13);
                    }
                }
                if (q7gVar19 instanceof kwj) {
                    r7fVar.Z(Constants.KEY_MESSAGE);
                    uj.b(uj.i).d(r7fVar, fx6Var, (kwj) q7gVar19);
                }
                if (q7gVar18 instanceof kwj) {
                    r7fVar.Z("overrideStartTime");
                    uj.b(uj.m).d(r7fVar, fx6Var, (kwj) q7gVar18);
                }
                if (q7gVar17 instanceof kwj) {
                    r7fVar.Z("overrideStopTime");
                    uj.b(uj.m).d(r7fVar, fx6Var, (kwj) q7gVar17);
                }
                if (q7gVar16 instanceof kwj) {
                    r7fVar.Z("place");
                    uj.b(uj.i).d(r7fVar, fx6Var, (kwj) q7gVar16);
                }
                if (q7gVar15 instanceof kwj) {
                    r7fVar.Z("platform");
                    a aVar3 = o;
                    Object obj14 = ((kwj) q7gVar15).f;
                    if (obj14 == null) {
                        r7fVar.B0();
                    } else {
                        aVar3.a(r7fVar, fx6Var, obj14);
                    }
                }
                if (q7gVar14 instanceof kwj) {
                    r7fVar.Z("plus");
                    uj.b(uj.l).d(r7fVar, fx6Var, (kwj) q7gVar14);
                }
                if (q7gVar13 instanceof kwj) {
                    r7fVar.Z("restrictionMode");
                    a aVar4 = r;
                    Object obj15 = ((kwj) q7gVar13).f;
                    if (obj15 == null) {
                        r7fVar.B0();
                    } else {
                        aVar4.a(r7fVar, fx6Var, obj15);
                    }
                }
                if (q7gVar11 instanceof kwj) {
                    r7fVar.Z("sdkVersion");
                    uj.b(uj.i).d(r7fVar, fx6Var, (kwj) q7gVar11);
                }
                if (q7gVar10 instanceof kwj) {
                    r7fVar.Z("segment");
                    uj.b(uj.i).d(r7fVar, fx6Var, (kwj) q7gVar10);
                }
                r7fVar.Z("service");
                tjVar13.a(r7fVar, fx6Var, t0Var.x);
                if (q7gVar9 instanceof kwj) {
                    r7fVar.Z("subscriptionResumed");
                    uj.b(uj.l).d(r7fVar, fx6Var, (kwj) q7gVar9);
                }
                if (q7gVar8 instanceof kwj) {
                    r7fVar.Z("target");
                    uj.b(uj.i).d(r7fVar, fx6Var, (kwj) q7gVar8);
                }
                if (q7gVar7 instanceof kwj) {
                    r7fVar.Z("testIds");
                    j8g j8gVar8 = new j8g(fx6Var.e(z.a), 0);
                    Object obj16 = ((kwj) q7gVar7).f;
                    if (obj16 == null) {
                        r7fVar.B0();
                    } else {
                        j8gVar8.a(r7fVar, fx6Var, obj16);
                    }
                }
                if (q7gVar6 instanceof kwj) {
                    r7fVar.Z("theme");
                    a aVar5 = z;
                    Object obj17 = ((kwj) q7gVar6).f;
                    if (obj17 == null) {
                        r7fVar.B0();
                        return;
                    } else {
                        aVar5.a(r7fVar, fx6Var, obj17);
                        return;
                    }
                }
                return;
            case 26:
                v0 v0Var = (v0) obj;
                r7fVar.getClass();
                fx6Var.getClass();
                v0Var.getClass();
                r7fVar.m0(v0Var.a);
                return;
            case 27:
                w0 w0Var = (w0) obj;
                r7fVar.getClass();
                fx6Var.getClass();
                w0Var.getClass();
                r7fVar.m0(w0Var.a);
                return;
            default:
                z0 z0Var = (z0) obj;
                r7fVar.getClass();
                fx6Var.getClass();
                z0Var.getClass();
                r7fVar.m0(z0Var.a);
                return;
        }
    }

    @Override // defpackage.pj
    public final Object b(a7f a7fVar, fx6 fx6Var) {
        h hVar;
        p pVar;
        t tVar;
        w wVar;
        b0 b0Var;
        e0 e0Var;
        h0 h0Var;
        j0 j0Var;
        m0 m0Var;
        n0 n0Var;
        o0 o0Var;
        r0 r0Var;
        v0 v0Var;
        w0 w0Var;
        z0 z0Var;
        switch (this.a) {
            case 0:
                String l2 = ouj.l(a7fVar, fx6Var);
                h.b.getClass();
                h[] values = h.values();
                int length = values.length;
                int i2 = 0;
                while (true) {
                    if (i2 < length) {
                        hVar = values[i2];
                        if (!hVar.a.equals(l2)) {
                            i2++;
                        }
                    } else {
                        hVar = null;
                    }
                }
                return hVar == null ? h.UNKNOWN__ : hVar;
            case 1:
                throw ouj.h(a7fVar, fx6Var, "Input type used in output position");
            case 2:
                throw ouj.h(a7fVar, fx6Var, "Input type used in output position");
            case 3:
                throw ouj.h(a7fVar, fx6Var, "Input type used in output position");
            case 4:
                throw ouj.h(a7fVar, fx6Var, "Input type used in output position");
            case 5:
                String l3 = ouj.l(a7fVar, fx6Var);
                p.b.getClass();
                p[] values2 = p.values();
                int length2 = values2.length;
                int i3 = 0;
                while (true) {
                    if (i3 < length2) {
                        pVar = values2[i3];
                        if (!pVar.a.equals(l3)) {
                            i3++;
                        }
                    } else {
                        pVar = null;
                    }
                }
                return pVar == null ? p.UNKNOWN__ : pVar;
            case 6:
                throw ouj.h(a7fVar, fx6Var, "Input type used in output position");
            case 7:
                String l4 = ouj.l(a7fVar, fx6Var);
                t.b.getClass();
                t[] values3 = t.values();
                int length3 = values3.length;
                int i4 = 0;
                while (true) {
                    if (i4 < length3) {
                        tVar = values3[i4];
                        if (!tVar.a.equals(l4)) {
                            i4++;
                        }
                    } else {
                        tVar = null;
                    }
                }
                return tVar == null ? t.UNKNOWN__ : tVar;
            case 8:
                String l5 = ouj.l(a7fVar, fx6Var);
                w.b.getClass();
                w[] values4 = w.values();
                int length4 = values4.length;
                int i5 = 0;
                while (true) {
                    if (i5 < length4) {
                        wVar = values4[i5];
                        if (!wVar.a.equals(l5)) {
                            i5++;
                        }
                    } else {
                        wVar = null;
                    }
                }
                return wVar == null ? w.UNKNOWN__ : wVar;
            case 9:
                throw ouj.h(a7fVar, fx6Var, "Input type used in output position");
            case 10:
                throw ouj.h(a7fVar, fx6Var, "Input type used in output position");
            case 11:
                throw ouj.h(a7fVar, fx6Var, "Input type used in output position");
            case 12:
                String l6 = ouj.l(a7fVar, fx6Var);
                b0.b.getClass();
                b0[] values5 = b0.values();
                int length5 = values5.length;
                int i6 = 0;
                while (true) {
                    if (i6 < length5) {
                        b0Var = values5[i6];
                        if (!b0Var.a.equals(l6)) {
                            i6++;
                        }
                    } else {
                        b0Var = null;
                    }
                }
                return b0Var == null ? b0.UNKNOWN__ : b0Var;
            case 13:
                String l7 = ouj.l(a7fVar, fx6Var);
                e0.b.getClass();
                e0[] values6 = e0.values();
                int length6 = values6.length;
                int i7 = 0;
                while (true) {
                    if (i7 < length6) {
                        e0Var = values6[i7];
                        if (!e0Var.a.equals(l7)) {
                            i7++;
                        }
                    } else {
                        e0Var = null;
                    }
                }
                return e0Var == null ? e0.UNKNOWN__ : e0Var;
            case 14:
                throw ouj.h(a7fVar, fx6Var, "Input type used in output position");
            case 15:
                throw ouj.h(a7fVar, fx6Var, "Input type used in output position");
            case 16:
                String l8 = ouj.l(a7fVar, fx6Var);
                h0.b.getClass();
                h0[] values7 = h0.values();
                int length7 = values7.length;
                int i8 = 0;
                while (true) {
                    if (i8 < length7) {
                        h0Var = values7[i8];
                        if (!h0Var.a.equals(l8)) {
                            i8++;
                        }
                    } else {
                        h0Var = null;
                    }
                }
                return h0Var == null ? h0.UNKNOWN__ : h0Var;
            case 17:
                String l9 = ouj.l(a7fVar, fx6Var);
                j0.b.getClass();
                j0[] values8 = j0.values();
                int length8 = values8.length;
                int i9 = 0;
                while (true) {
                    if (i9 < length8) {
                        j0Var = values8[i9];
                        if (!j0Var.a.equals(l9)) {
                            i9++;
                        }
                    } else {
                        j0Var = null;
                    }
                }
                return j0Var == null ? j0.UNKNOWN__ : j0Var;
            case 18:
                throw ouj.h(a7fVar, fx6Var, "Input type used in output position");
            case 19:
                throw ouj.h(a7fVar, fx6Var, "Input type used in output position");
            case 20:
                String l10 = ouj.l(a7fVar, fx6Var);
                m0.b.getClass();
                m0[] values9 = m0.values();
                int length9 = values9.length;
                int i10 = 0;
                while (true) {
                    if (i10 < length9) {
                        m0Var = values9[i10];
                        if (!m0Var.a.equals(l10)) {
                            i10++;
                        }
                    } else {
                        m0Var = null;
                    }
                }
                return m0Var == null ? m0.UNKNOWN__ : m0Var;
            case 21:
                String l11 = ouj.l(a7fVar, fx6Var);
                n0.b.getClass();
                n0[] values10 = n0.values();
                int length10 = values10.length;
                int i11 = 0;
                while (true) {
                    if (i11 < length10) {
                        n0Var = values10[i11];
                        if (!n0Var.a.equals(l11)) {
                            i11++;
                        }
                    } else {
                        n0Var = null;
                    }
                }
                return n0Var == null ? n0.UNKNOWN__ : n0Var;
            case 22:
                String l12 = ouj.l(a7fVar, fx6Var);
                o0.b.getClass();
                o0[] values11 = o0.values();
                int length11 = values11.length;
                int i12 = 0;
                while (true) {
                    if (i12 < length11) {
                        o0Var = values11[i12];
                        if (!o0Var.a.equals(l12)) {
                            i12++;
                        }
                    } else {
                        o0Var = null;
                    }
                }
                return o0Var == null ? o0.UNKNOWN__ : o0Var;
            case 23:
                throw ouj.h(a7fVar, fx6Var, "Input type used in output position");
            case 24:
                String l13 = ouj.l(a7fVar, fx6Var);
                r0.b.getClass();
                r0[] values12 = r0.values();
                int length12 = values12.length;
                int i13 = 0;
                while (true) {
                    if (i13 < length12) {
                        r0Var = values12[i13];
                        if (!r0Var.a.equals(l13)) {
                            i13++;
                        }
                    } else {
                        r0Var = null;
                    }
                }
                return r0Var == null ? r0.UNKNOWN__ : r0Var;
            case 25:
                throw ouj.h(a7fVar, fx6Var, "Input type used in output position");
            case 26:
                String l14 = ouj.l(a7fVar, fx6Var);
                v0.b.getClass();
                v0[] values13 = v0.values();
                int length13 = values13.length;
                int i14 = 0;
                while (true) {
                    if (i14 < length13) {
                        v0Var = values13[i14];
                        if (!v0Var.a.equals(l14)) {
                            i14++;
                        }
                    } else {
                        v0Var = null;
                    }
                }
                return v0Var == null ? v0.UNKNOWN__ : v0Var;
            case 27:
                String l15 = ouj.l(a7fVar, fx6Var);
                w0.b.getClass();
                w0[] values14 = w0.values();
                int length14 = values14.length;
                int i15 = 0;
                while (true) {
                    if (i15 < length14) {
                        w0Var = values14[i15];
                        if (!w0Var.a.equals(l15)) {
                            i15++;
                        }
                    } else {
                        w0Var = null;
                    }
                }
                return w0Var == null ? w0.UNKNOWN__ : w0Var;
            default:
                String l16 = ouj.l(a7fVar, fx6Var);
                z0.b.getClass();
                z0[] values15 = z0.values();
                int length15 = values15.length;
                int i16 = 0;
                while (true) {
                    if (i16 < length15) {
                        z0Var = values15[i16];
                        if (!z0Var.a.equals(l16)) {
                            i16++;
                        }
                    } else {
                        z0Var = null;
                    }
                }
                return z0Var == null ? z0.UNKNOWN__ : z0Var;
        }
    }
}
