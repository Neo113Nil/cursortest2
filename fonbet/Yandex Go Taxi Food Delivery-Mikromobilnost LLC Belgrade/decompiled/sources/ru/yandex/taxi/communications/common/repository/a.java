package ru.yandex.taxi.communications.common.repository;

import com.yandex.go.address.models.Address;
import com.yandex.go.zone.repository.r;
import defpackage.atf0;
import defpackage.bkx0;
import defpackage.cb8;
import defpackage.ck;
import defpackage.cmt;
import defpackage.fmu0;
import defpackage.fuc;
import defpackage.hi2;
import defpackage.i3y;
import defpackage.isf0;
import defpackage.jux0;
import defpackage.mo21;
import defpackage.ny61;
import defpackage.ofp0;
import defpackage.olf0;
import defpackage.on2;
import defpackage.ouc;
import defpackage.pf10;
import defpackage.pnf0;
import defpackage.rvj0;
import defpackage.sa7;
import defpackage.ssf0;
import defpackage.tcc;
import defpackage.utc;
import defpackage.vng;
import defpackage.w511;
import defpackage.x6v;
import defpackage.zzs;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.rt.ebs.cryptosdk.core.metadata.entities.MetaDataField;
import ru.yandex.taxi.communications.api.dto.RetryPolicy;
import ru.yandex.taxi.communications.common.network.api.CommunicationsApi;
import ru.yandex.taxi.promotions.model.Promotion;

/* loaded from: classes9.dex */
public final class a implements fuc {
    public final sa7 a;
    public final r b;
    public final ru.yandex.taxi.communications.data.b c;
    public final i3y d;

    public a(on2 on2Var, sa7 sa7Var, r rVar, ru.yandex.taxi.communications.data.b bVar) {
        this.a = sa7Var;
        this.b = rVar;
        this.c = bVar;
        this.d = kotlin.a.a(new ck(on2Var, 26));
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String str, ContinuationImpl continuationImpl) {
        TaxiCommunicationsRepository$getFile$1 taxiCommunicationsRepository$getFile$1;
        int i;
        if (continuationImpl instanceof TaxiCommunicationsRepository$getFile$1) {
            taxiCommunicationsRepository$getFile$1 = (TaxiCommunicationsRepository$getFile$1) continuationImpl;
            int i2 = taxiCommunicationsRepository$getFile$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                taxiCommunicationsRepository$getFile$1.label = i2 - Integer.MIN_VALUE;
                Object obj = taxiCommunicationsRepository$getFile$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = taxiCommunicationsRepository$getFile$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    cmt<rvj0> a = ((CommunicationsApi) this.d.getValue()).a(str, x6v.a);
                    bkx0 bkx0Var = new bkx0(14);
                    taxiCommunicationsRepository$getFile$1.L$0 = null;
                    taxiCommunicationsRepository$getFile$1.label = 1;
                    obj = ru.yandex.taxi.network.api.a.a(a, bkx0Var, taxiCommunicationsRepository$getFile$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                return ((rvj0) obj).byteStream();
            }
        }
        taxiCommunicationsRepository$getFile$1 = new TaxiCommunicationsRepository$getFile$1(this, continuationImpl);
        Object obj2 = taxiCommunicationsRepository$getFile$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = taxiCommunicationsRepository$getFile$1.label;
        if (i != 0) {
        }
        return ((rvj0) obj2).byteStream();
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x00bd, code lost:
    
        if (r10 == r1) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0074, code lost:
    
        if (r10 == r1) goto L37;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(ssf0 ssf0Var, RetryPolicy retryPolicy, ContinuationImpl continuationImpl) {
        TaxiCommunicationsRepository$getPromotion$1 taxiCommunicationsRepository$getPromotion$1;
        int i;
        int i2;
        if (continuationImpl instanceof TaxiCommunicationsRepository$getPromotion$1) {
            taxiCommunicationsRepository$getPromotion$1 = (TaxiCommunicationsRepository$getPromotion$1) continuationImpl;
            int i3 = taxiCommunicationsRepository$getPromotion$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                taxiCommunicationsRepository$getPromotion$1.label = i3 - Integer.MIN_VALUE;
                Object obj = taxiCommunicationsRepository$getPromotion$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = taxiCommunicationsRepository$getPromotion$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    taxiCommunicationsRepository$getPromotion$1.L$0 = ssf0Var;
                    taxiCommunicationsRepository$getPromotion$1.L$1 = retryPolicy;
                    taxiCommunicationsRepository$getPromotion$1.label = 1;
                    obj = this.c.a(taxiCommunicationsRepository$getPromotion$1);
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            kotlin.b.b(obj);
                            return (Promotion) obj;
                        }
                        if (i != 3) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.b.b(obj);
                        return obj;
                    }
                    retryPolicy = (RetryPolicy) taxiCommunicationsRepository$getPromotion$1.L$1;
                    ssf0Var = (ssf0) taxiCommunicationsRepository$getPromotion$1.L$0;
                    kotlin.b.b(obj);
                }
                mo21 mo21Var = (mo21) obj;
                cmt<Promotion> b = ((CommunicationsApi) this.d.getValue()).b(mo21Var == null ? vng.e(mo21Var) : null, ssf0Var);
                i2 = jux0.a[retryPolicy.ordinal()];
                if (i2 != 1) {
                    taxiCommunicationsRepository$getPromotion$1.L$0 = null;
                    taxiCommunicationsRepository$getPromotion$1.L$1 = null;
                    taxiCommunicationsRepository$getPromotion$1.L$2 = null;
                    taxiCommunicationsRepository$getPromotion$1.L$3 = null;
                    taxiCommunicationsRepository$getPromotion$1.label = 2;
                    obj = ru.yandex.taxi.network.api.a.a(b, null, taxiCommunicationsRepository$getPromotion$1);
                } else {
                    if (i2 != 2) {
                        w511.b();
                        return null;
                    }
                    taxiCommunicationsRepository$getPromotion$1.L$0 = null;
                    taxiCommunicationsRepository$getPromotion$1.L$1 = null;
                    taxiCommunicationsRepository$getPromotion$1.L$2 = null;
                    taxiCommunicationsRepository$getPromotion$1.L$3 = null;
                    taxiCommunicationsRepository$getPromotion$1.label = 3;
                    Object d = ru.yandex.taxi.network.api.a.d(b, taxiCommunicationsRepository$getPromotion$1);
                    if (d != coroutineSingletons) {
                        return d;
                    }
                }
                return coroutineSingletons;
            }
        }
        taxiCommunicationsRepository$getPromotion$1 = new TaxiCommunicationsRepository$getPromotion$1(this, continuationImpl);
        Object obj2 = taxiCommunicationsRepository$getPromotion$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = taxiCommunicationsRepository$getPromotion$1.label;
        if (i != 0) {
        }
        mo21 mo21Var2 = (mo21) obj2;
        cmt<Promotion> b2 = ((CommunicationsApi) this.d.getValue()).b(mo21Var2 == null ? vng.e(mo21Var2) : null, ssf0Var);
        i2 = jux0.a[retryPolicy.ordinal()];
        if (i2 != 1) {
        }
        return coroutineSingletons2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x0071, code lost:
    
        if (r15 != r1) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0073, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x004e, code lost:
    
        if (r15 == r1) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(ssf0 ssf0Var, ContinuationImpl continuationImpl) {
        TaxiCommunicationsRepository$getPromotions$1 taxiCommunicationsRepository$getPromotions$1;
        int i;
        if (continuationImpl instanceof TaxiCommunicationsRepository$getPromotions$1) {
            taxiCommunicationsRepository$getPromotions$1 = (TaxiCommunicationsRepository$getPromotions$1) continuationImpl;
            int i2 = taxiCommunicationsRepository$getPromotions$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                taxiCommunicationsRepository$getPromotions$1.label = i2 - Integer.MIN_VALUE;
                Object obj = taxiCommunicationsRepository$getPromotions$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = taxiCommunicationsRepository$getPromotions$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    taxiCommunicationsRepository$getPromotions$1.L$0 = ssf0Var;
                    taxiCommunicationsRepository$getPromotions$1.label = 1;
                    obj = this.c.a(taxiCommunicationsRepository$getPromotions$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.b.b(obj);
                        atf0 atf0Var = (atf0) obj;
                        olf0 olf0Var = (olf0) atf0Var.b(olf0.class);
                        if (olf0Var != null) {
                            Set set = olf0Var.b;
                        }
                        pnf0 pnf0Var = (pnf0) atf0Var.b(pnf0.class);
                        List<cb8> list = atf0Var.b;
                        for (cb8 cb8Var : list) {
                            if (pnf0Var != null) {
                                hi2 hi2Var = !pnf0Var.b ? null : (hi2) pnf0Var.c.get(cb8Var.b);
                                if (hi2Var != null) {
                                    cb8Var.u = hi2Var;
                                }
                            }
                        }
                        return new isf0(atf0Var.a, list, atf0Var.c, atf0Var.d, atf0Var.e, atf0Var.f);
                    }
                    ssf0Var = (ssf0) taxiCommunicationsRepository$getPromotions$1.L$0;
                    kotlin.b.b(obj);
                }
                mo21 mo21Var = (mo21) obj;
                cmt<atf0> c = ((CommunicationsApi) this.d.getValue()).c(mo21Var == null ? vng.e(mo21Var) : null, ssf0Var);
                taxiCommunicationsRepository$getPromotions$1.L$0 = null;
                taxiCommunicationsRepository$getPromotions$1.L$1 = null;
                taxiCommunicationsRepository$getPromotions$1.label = 2;
                obj = ru.yandex.taxi.network.api.a.a(c, null, taxiCommunicationsRepository$getPromotions$1);
            }
        }
        taxiCommunicationsRepository$getPromotions$1 = new TaxiCommunicationsRepository$getPromotions$1(this, continuationImpl);
        Object obj2 = taxiCommunicationsRepository$getPromotions$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = taxiCommunicationsRepository$getPromotions$1.label;
        if (i != 0) {
        }
        mo21 mo21Var2 = (mo21) obj2;
        cmt<atf0> c2 = ((CommunicationsApi) this.d.getValue()).c(mo21Var2 == null ? vng.e(mo21Var2) : null, ssf0Var);
        taxiCommunicationsRepository$getPromotions$1.L$0 = null;
        taxiCommunicationsRepository$getPromotions$1.L$1 = null;
        taxiCommunicationsRepository$getPromotions$1.label = 2;
        obj2 = ru.yandex.taxi.network.api.a.a(c2, null, taxiCommunicationsRepository$getPromotions$1);
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x0187, code lost:
    
        if (r1 != r3) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00de, code lost:
    
        if (defpackage.jl40.l(r8, defpackage.zzs.f) == false) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:35:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(ArrayList arrayList, String str, Double d, Double d2, Integer num, String str2, ContinuationImpl continuationImpl) {
        TaxiCommunicationsRepository$getStoriesDiff$1 taxiCommunicationsRepository$getStoriesDiff$1;
        int i;
        zzs zzsVar;
        CommunicationsApi communicationsApi;
        utc utcVar;
        if (continuationImpl instanceof TaxiCommunicationsRepository$getStoriesDiff$1) {
            taxiCommunicationsRepository$getStoriesDiff$1 = (TaxiCommunicationsRepository$getStoriesDiff$1) continuationImpl;
            int i2 = taxiCommunicationsRepository$getStoriesDiff$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                taxiCommunicationsRepository$getStoriesDiff$1.label = i2 - Integer.MIN_VALUE;
                Object obj = taxiCommunicationsRepository$getStoriesDiff$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = taxiCommunicationsRepository$getStoriesDiff$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    zzs zzsVar2 = (d == null || d2 == null) ? null : new zzs(d.doubleValue(), d2.doubleValue(), 0, null, null, 28);
                    pf10 pf10Var = new pf10(ofp0.c, ofp0.b, ofp0.a);
                    ru.yandex.taxi.communications.data.b bVar = this.c;
                    Address h = bVar.b.c().h();
                    if (h != null) {
                        zzsVar = h.B();
                    }
                    zzsVar = null;
                    utc utcVar2 = new utc(arrayList, pf10Var, new utc.a(num, zzsVar2, zzsVar != null ? new utc.a.b(zzsVar.a, zzsVar.b) : null, this.b.a(), str2, !"#none#".equals(str) ? str : null, 1656), Collections.singletonList(MetaDataField.SCREEN_FIELD), 48);
                    communicationsApi = (CommunicationsApi) this.d.getValue();
                    taxiCommunicationsRepository$getStoriesDiff$1.L$0 = null;
                    taxiCommunicationsRepository$getStoriesDiff$1.L$1 = null;
                    taxiCommunicationsRepository$getStoriesDiff$1.L$2 = null;
                    taxiCommunicationsRepository$getStoriesDiff$1.L$3 = null;
                    taxiCommunicationsRepository$getStoriesDiff$1.L$4 = null;
                    taxiCommunicationsRepository$getStoriesDiff$1.L$5 = null;
                    taxiCommunicationsRepository$getStoriesDiff$1.L$6 = null;
                    taxiCommunicationsRepository$getStoriesDiff$1.L$7 = null;
                    taxiCommunicationsRepository$getStoriesDiff$1.L$8 = null;
                    taxiCommunicationsRepository$getStoriesDiff$1.L$9 = null;
                    taxiCommunicationsRepository$getStoriesDiff$1.L$10 = null;
                    taxiCommunicationsRepository$getStoriesDiff$1.L$11 = utcVar2;
                    taxiCommunicationsRepository$getStoriesDiff$1.L$12 = communicationsApi;
                    taxiCommunicationsRepository$getStoriesDiff$1.label = 1;
                    Object a = bVar.a(taxiCommunicationsRepository$getStoriesDiff$1);
                    if (a != coroutineSingletons) {
                        utcVar = utcVar2;
                        obj = a;
                    }
                    return coroutineSingletons;
                }
                if (i != 1) {
                    if (i != 2) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                    ouc oucVar = (ouc) obj;
                    List b = oucVar.getB();
                    ArrayList arrayList2 = new ArrayList();
                    for (Object obj2 : b) {
                        if (((ouc.a) obj2).getB() == Promotion.Type.STORY) {
                            arrayList2.add(obj2);
                        }
                    }
                    ArrayList arrayList3 = new ArrayList(tcc.n(arrayList2, 10));
                    Iterator it = arrayList2.iterator();
                    while (it.hasNext()) {
                        arrayList3.add(((ouc.a) it.next()).getA());
                    }
                    return new fmu0(arrayList3, oucVar.getA());
                }
                communicationsApi = (CommunicationsApi) taxiCommunicationsRepository$getStoriesDiff$1.L$12;
                utcVar = (utc) taxiCommunicationsRepository$getStoriesDiff$1.L$11;
                kotlin.b.b(obj);
                mo21 mo21Var = (mo21) obj;
                cmt<ouc> d3 = communicationsApi.d(mo21Var == null ? vng.e(mo21Var) : null, utcVar);
                taxiCommunicationsRepository$getStoriesDiff$1.L$0 = null;
                taxiCommunicationsRepository$getStoriesDiff$1.L$1 = null;
                taxiCommunicationsRepository$getStoriesDiff$1.L$2 = null;
                taxiCommunicationsRepository$getStoriesDiff$1.L$3 = null;
                taxiCommunicationsRepository$getStoriesDiff$1.L$4 = null;
                taxiCommunicationsRepository$getStoriesDiff$1.L$5 = null;
                taxiCommunicationsRepository$getStoriesDiff$1.L$6 = null;
                taxiCommunicationsRepository$getStoriesDiff$1.L$7 = null;
                taxiCommunicationsRepository$getStoriesDiff$1.L$8 = null;
                taxiCommunicationsRepository$getStoriesDiff$1.L$9 = null;
                taxiCommunicationsRepository$getStoriesDiff$1.L$10 = null;
                taxiCommunicationsRepository$getStoriesDiff$1.L$11 = null;
                taxiCommunicationsRepository$getStoriesDiff$1.L$12 = null;
                taxiCommunicationsRepository$getStoriesDiff$1.label = 2;
                obj = ru.yandex.taxi.network.api.a.a(d3, null, taxiCommunicationsRepository$getStoriesDiff$1);
            }
        }
        taxiCommunicationsRepository$getStoriesDiff$1 = new TaxiCommunicationsRepository$getStoriesDiff$1(this, continuationImpl);
        Object obj3 = taxiCommunicationsRepository$getStoriesDiff$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = taxiCommunicationsRepository$getStoriesDiff$1.label;
        if (i != 0) {
        }
        mo21 mo21Var2 = (mo21) obj3;
        cmt<ouc> d32 = communicationsApi.d(mo21Var2 == null ? vng.e(mo21Var2) : null, utcVar);
        taxiCommunicationsRepository$getStoriesDiff$1.L$0 = null;
        taxiCommunicationsRepository$getStoriesDiff$1.L$1 = null;
        taxiCommunicationsRepository$getStoriesDiff$1.L$2 = null;
        taxiCommunicationsRepository$getStoriesDiff$1.L$3 = null;
        taxiCommunicationsRepository$getStoriesDiff$1.L$4 = null;
        taxiCommunicationsRepository$getStoriesDiff$1.L$5 = null;
        taxiCommunicationsRepository$getStoriesDiff$1.L$6 = null;
        taxiCommunicationsRepository$getStoriesDiff$1.L$7 = null;
        taxiCommunicationsRepository$getStoriesDiff$1.L$8 = null;
        taxiCommunicationsRepository$getStoriesDiff$1.L$9 = null;
        taxiCommunicationsRepository$getStoriesDiff$1.L$10 = null;
        taxiCommunicationsRepository$getStoriesDiff$1.L$11 = null;
        taxiCommunicationsRepository$getStoriesDiff$1.L$12 = null;
        taxiCommunicationsRepository$getStoriesDiff$1.label = 2;
        obj3 = ru.yandex.taxi.network.api.a.a(d32, null, taxiCommunicationsRepository$getStoriesDiff$1);
    }
}
