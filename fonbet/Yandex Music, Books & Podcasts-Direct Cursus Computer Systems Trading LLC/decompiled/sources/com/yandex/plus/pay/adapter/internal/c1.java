package com.yandex.plus.pay.adapter.internal;

import com.yandex.plus.pay.api.model.PlusPayCompositeOffers;
import com.yandex.plus.pay.api.model.PlusPayGoogleBillingConfig;
import defpackage.b6e;
import defpackage.btf;
import defpackage.buu;
import defpackage.cg6;
import defpackage.e5b;
import defpackage.h4d;
import defpackage.hld;
import defpackage.hv0;
import defpackage.jyr;
import defpackage.k32;
import defpackage.nm6;
import defpackage.q5b;
import defpackage.qgg;
import defpackage.xq0;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.collections.CollectionsKt;

/* loaded from: classes5.dex */
public final class c1 implements com.yandex.plus.pay.adapter.api.g0 {
    public final jyr a;
    public final com.yandex.plus.home.common.utils.f b;

    public c1(h4d h4dVar, hv0 hv0Var) {
        this.a = btf.b(new com.yandex.plus.home.feature.panel.internal.shortcuts.daily.animation.a(14, h4dVar));
        this.b = new com.yandex.plus.home.common.utils.f(hld.j(), new AtomicBoolean(false), new buu(hv0Var, null, 4));
    }

    public static PlusPayCompositeOffers.Offer a(com.yandex.plus.pay.adapter.api.j jVar) {
        PlusPayCompositeOffers.Offer offer;
        i iVar = jVar instanceof i ? (i) jVar : null;
        if (iVar != null && (offer = iVar.a) != null) {
            return offer;
        }
        xq0.x("Offer must be of type CompositeOfferImpl");
        return null;
    }

    public final com.yandex.plus.core.strings.a b() {
        com.yandex.plus.pay.a aVar = (com.yandex.plus.pay.a) this.a.getValue();
        aVar.getClass();
        return ((com.yandex.plus.pay.internal.g) aVar).c().h;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(String str, List list, com.yandex.passport.internal.ui.bouncer.roundabout.k kVar, cg6 cg6Var) {
        z0 z0Var;
        int i;
        if (cg6Var instanceof z0) {
            z0Var = (z0) cg6Var;
            int i2 = z0Var.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                z0Var.l = i2 - Integer.MIN_VALUE;
                z0 z0Var2 = z0Var;
                Object obj = z0Var2.j;
                nm6 nm6Var = nm6.a;
                i = z0Var2.l;
                if (i != 0) {
                    qgg.h0(obj);
                    com.yandex.plus.pay.api.feature.offers.b bVar = (com.yandex.plus.pay.api.feature.offers.b) ((com.yandex.plus.pay.internal.g) ((com.yandex.plus.pay.a) this.a.getValue())).e.getValue();
                    com.yandex.plus.pay.api.analytics.c cVar = new com.yandex.plus.pay.api.analytics.c(null, null, null, null, null, new LinkedHashMap());
                    List list2 = list;
                    list2.getClass();
                    com.yandex.plus.pay.api.feature.offers.a aVar = new com.yandex.plus.pay.api.feature.offers.a(CollectionsKt.A0(list2));
                    k32 k32Var = new k32(13, kVar);
                    z0Var2.l = 1;
                    obj = ((com.yandex.plus.pay.internal.feature.offers.x) bVar).b(str, cVar, aVar, k32Var, z0Var2);
                    if (obj == nm6Var) {
                        return nm6Var;
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                PlusPayCompositeOffers plusPayCompositeOffers = (PlusPayCompositeOffers) obj;
                plusPayCompositeOffers.getClass();
                return new o(plusPayCompositeOffers);
            }
        }
        z0Var = new z0(this, cg6Var);
        z0 z0Var22 = z0Var;
        Object obj2 = z0Var22.j;
        nm6 nm6Var2 = nm6.a;
        i = z0Var22.l;
        if (i != 0) {
        }
        PlusPayCompositeOffers plusPayCompositeOffers2 = (PlusPayCompositeOffers) obj2;
        plusPayCompositeOffers2.getClass();
        return new o(plusPayCompositeOffers2);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0060 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(cg6 cg6Var) {
        a1 a1Var;
        int i;
        PlusPayGoogleBillingConfig plusPayGoogleBillingConfig;
        if (cg6Var instanceof a1) {
            a1Var = (a1) cg6Var;
            int i2 = a1Var.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                a1Var.l = i2 - Integer.MIN_VALUE;
                Object obj = a1Var.j;
                nm6 nm6Var = nm6.a;
                i = a1Var.l;
                if (i != 0) {
                    qgg.h0(obj);
                    com.yandex.plus.pay.internal.feature.payment.inapp.google.e eVar = (com.yandex.plus.pay.internal.feature.payment.inapp.google.e) ((com.yandex.plus.pay.internal.g) ((com.yandex.plus.pay.a) this.a.getValue())).f.getValue();
                    a1Var.l = 1;
                    obj = eVar.a.b(a1Var);
                    if (obj == nm6Var) {
                        return nm6Var;
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                plusPayGoogleBillingConfig = (PlusPayGoogleBillingConfig) obj;
                if (plusPayGoogleBillingConfig == null) {
                    return new com.yandex.plus.pay.adapter.api.r(plusPayGoogleBillingConfig.getGoogleCountryCode(), plusPayGoogleBillingConfig.isNativePaymentAllowed());
                }
                return null;
            }
        }
        a1Var = new a1(this, cg6Var);
        Object obj2 = a1Var.j;
        nm6 nm6Var2 = nm6.a;
        i = a1Var.l;
        if (i != 0) {
        }
        plusPayGoogleBillingConfig = (PlusPayGoogleBillingConfig) obj2;
        if (plusPayGoogleBillingConfig == null) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:77:0x00a5, code lost:
    
        if (r13 != r1) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x00a7, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x005f, code lost:
    
        if (r13 == r1) goto L31;
     */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(com.yandex.plus.pay.adapter.api.j jVar, com.yandex.plus.pay.adapter.api.h0 h0Var, Map map, boolean z, cg6 cg6Var) {
        b1 b1Var;
        int i;
        PlusPayCompositeOffers.Offer a;
        String str;
        com.yandex.plus.pay.adapter.api.d0 zVar;
        com.yandex.plus.pay.adapter.api.f0 f0Var;
        if (cg6Var instanceof b1) {
            b1Var = (b1) cg6Var;
            int i2 = b1Var.p;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                b1Var.p = i2 - Integer.MIN_VALUE;
                Object obj = b1Var.n;
                nm6 nm6Var = nm6.a;
                i = b1Var.p;
                if (i != 0) {
                    qgg.h0(obj);
                    a = a(jVar);
                    b1Var.j = h0Var;
                    b1Var.k = map;
                    b1Var.l = a;
                    b1Var.m = z;
                    b1Var.p = 1;
                    obj = this.b.H(b1Var);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        Map map2 = b1Var.k;
                        qgg.h0(obj);
                        com.yandex.plus.pay.ui.core.api.tarifficator.d dVar = (com.yandex.plus.pay.ui.core.api.tarifficator.d) obj;
                        dVar.getClass();
                        if (dVar instanceof com.yandex.plus.pay.ui.core.api.tarifficator.c) {
                            return com.yandex.plus.pay.adapter.api.n.a;
                        }
                        if (dVar instanceof com.yandex.plus.pay.ui.core.api.tarifficator.a) {
                            return com.yandex.plus.pay.adapter.api.l.a;
                        }
                        if (!(dVar instanceof com.yandex.plus.pay.ui.core.api.tarifficator.b)) {
                            b6e.s();
                            return null;
                        }
                        com.yandex.plus.pay.ui.api.feature.payment.g gVar = ((com.yandex.plus.pay.ui.core.api.tarifficator.b) dVar).a;
                        if (gVar instanceof com.yandex.plus.pay.ui.api.feature.payment.a) {
                            switch (((com.yandex.plus.pay.ui.api.feature.payment.a) gVar).a.ordinal()) {
                                case 0:
                                    f0Var = com.yandex.plus.pay.adapter.api.f0.a;
                                    break;
                                case 1:
                                    f0Var = com.yandex.plus.pay.adapter.api.f0.b;
                                    break;
                                case 2:
                                    f0Var = com.yandex.plus.pay.adapter.api.f0.c;
                                    break;
                                case 3:
                                    f0Var = com.yandex.plus.pay.adapter.api.f0.d;
                                    break;
                                case 4:
                                    f0Var = com.yandex.plus.pay.adapter.api.f0.e;
                                    break;
                                case 5:
                                    f0Var = com.yandex.plus.pay.adapter.api.f0.f;
                                    break;
                                case 6:
                                    f0Var = com.yandex.plus.pay.adapter.api.f0.g;
                                    break;
                                case 7:
                                    f0Var = com.yandex.plus.pay.adapter.api.f0.h;
                                    break;
                                case 8:
                                    f0Var = com.yandex.plus.pay.adapter.api.f0.i;
                                    break;
                                case 9:
                                    f0Var = com.yandex.plus.pay.adapter.api.f0.j;
                                    break;
                                case 10:
                                    f0Var = com.yandex.plus.pay.adapter.api.f0.k;
                                    break;
                                case 11:
                                    f0Var = com.yandex.plus.pay.adapter.api.f0.l;
                                    break;
                                case 12:
                                    f0Var = com.yandex.plus.pay.adapter.api.f0.m;
                                    break;
                                case 13:
                                    f0Var = com.yandex.plus.pay.adapter.api.f0.n;
                                    break;
                                case 14:
                                    f0Var = com.yandex.plus.pay.adapter.api.f0.o;
                                    break;
                                default:
                                    b6e.s();
                                    return null;
                            }
                            zVar = new com.yandex.plus.pay.adapter.api.u(f0Var);
                        } else if (gVar instanceof com.yandex.plus.pay.ui.api.feature.payment.c) {
                            zVar = com.yandex.plus.pay.adapter.api.c0.INSTANCE;
                        } else if (gVar instanceof com.yandex.plus.pay.ui.api.feature.payment.f) {
                            zVar = com.yandex.plus.pay.adapter.api.c0.INSTANCE;
                        } else if (gVar instanceof com.yandex.plus.pay.ui.api.feature.payment.b) {
                            zVar = com.yandex.plus.pay.adapter.api.w.INSTANCE;
                        } else if (gVar instanceof com.yandex.plus.pay.ui.api.feature.payment.e) {
                            zVar = com.yandex.plus.pay.adapter.api.a0.INSTANCE;
                        } else {
                            if (!(gVar instanceof com.yandex.plus.pay.ui.api.feature.payment.d)) {
                                b6e.s();
                                return null;
                            }
                            zVar = new com.yandex.plus.pay.adapter.api.z(((com.yandex.plus.pay.ui.api.feature.payment.d) gVar).a);
                        }
                        return new com.yandex.plus.pay.adapter.api.m(zVar);
                    }
                    z = b1Var.m;
                    a = b1Var.l;
                    map = b1Var.k;
                    h0Var = b1Var.j;
                    qgg.h0(obj);
                }
                com.yandex.plus.pay.ui.tarifficator.api.e C = com.yandex.plus.bdui.flex.ui.a.C((com.yandex.plus.pay.ui.core.internal.a) obj);
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                str = h0Var.b;
                if (str == null) {
                    str = null;
                }
                com.yandex.plus.pay.api.analytics.d dVar2 = new com.yandex.plus.pay.api.analytics.d(h0Var.c, "purchase_button", str, linkedHashMap);
                q5b q5bVar = q5b.a;
                com.yandex.plus.pay.ui.tarifficator.api.a aVar = com.yandex.plus.pay.ui.tarifficator.api.a.b;
                e5b e5bVar = e5b.a;
                e5bVar.getClass();
                if (z) {
                    aVar = com.yandex.plus.pay.ui.tarifficator.api.a.a;
                }
                if (map == null) {
                    e5bVar.getClass();
                    map = e5bVar;
                }
                com.yandex.plus.pay.ui.tarifficator.api.b bVar = new com.yandex.plus.pay.ui.tarifficator.api.b(q5bVar, aVar, map);
                b1Var.j = null;
                b1Var.k = null;
                b1Var.l = null;
                b1Var.m = z;
                b1Var.p = 2;
                obj = ((com.yandex.plus.pay.ui.tarifficator.mobile.bdui.internal.e) C).a(a, dVar2, bVar, b1Var);
            }
        }
        b1Var = new b1(this, cg6Var);
        Object obj2 = b1Var.n;
        nm6 nm6Var2 = nm6.a;
        i = b1Var.p;
        if (i != 0) {
        }
        com.yandex.plus.pay.ui.tarifficator.api.e C2 = com.yandex.plus.bdui.flex.ui.a.C((com.yandex.plus.pay.ui.core.internal.a) obj2);
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        str = h0Var.b;
        if (str == null) {
        }
        com.yandex.plus.pay.api.analytics.d dVar22 = new com.yandex.plus.pay.api.analytics.d(h0Var.c, "purchase_button", str, linkedHashMap2);
        q5b q5bVar2 = q5b.a;
        com.yandex.plus.pay.ui.tarifficator.api.a aVar2 = com.yandex.plus.pay.ui.tarifficator.api.a.b;
        e5b e5bVar2 = e5b.a;
        e5bVar2.getClass();
        if (z) {
        }
        if (map == null) {
        }
        com.yandex.plus.pay.ui.tarifficator.api.b bVar2 = new com.yandex.plus.pay.ui.tarifficator.api.b(q5bVar2, aVar2, map);
        b1Var.j = null;
        b1Var.k = null;
        b1Var.l = null;
        b1Var.m = z;
        b1Var.p = 2;
        obj2 = ((com.yandex.plus.pay.ui.tarifficator.mobile.bdui.internal.e) C2).a(a, dVar22, bVar2, b1Var);
    }
}
