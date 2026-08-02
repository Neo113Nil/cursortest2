package defpackage;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class lhk extends bfu {
    public final String k;
    public final gs8 l;
    public final String m;
    public final String n;
    public final jyr o;
    public final jyr p;
    public final jyr q;
    public final jyr r;
    public rdk s;
    public final xdr t;
    public final xdr u;
    public final xdr v;
    public final j0q w;
    public rar x;
    public final fkn y;

    public lhk(String str, gs8 gs8Var, String str2, String str3) {
        gs8Var.getClass();
        this.k = str;
        this.l = gs8Var;
        this.m = str2;
        this.n = str3;
        bdt I = hag.I(oek.class);
        l18 l18Var = l18.b;
        this.o = l18Var.b(I, true);
        this.p = l18Var.b(hag.I(skr.class), true);
        this.q = l18Var.b(hag.I(wrt.class), true);
        jyr b = l18Var.b(hag.I(z66.class), true);
        this.r = l18Var.b(hag.I(yx2.class), true);
        xdr a = ydr.a(Boolean.FALSE);
        this.t = a;
        xdr a2 = ydr.a(null);
        this.u = a2;
        xdr a3 = ydr.a(null);
        this.v = a3;
        this.w = new j0q();
        this.y = lg3.u0(zsd.P(new bca(a2, 18), a3, ((z66) b.getValue()).c(), a, new r1e(5, this, lhk.class, "prepareOneTapState", "prepareOneTapState(Lcom/yandex/music/bdu/communication/divcommunication/ui/div/DivCustomPaymentButton;Lcom/yandex/music/shared/plus/acquisition/api/offers/data/OfferRequestResult;Lcom/yandex/music/shared/utils/network/connectivity/ConnectivityInfo;Z)Lcom/yandex/music/bdu/communication/divcommunication/data/PaymentState;", 4, 1)), ot0.F(this), ahk.a);
    }

    public static bve G(ukj ukjVar) {
        if (ukjVar instanceof skj) {
            return null;
        }
        if (!(ukjVar instanceof tkj)) {
            b6e.s();
            return null;
        }
        Map.Entry entry = (Map.Entry) CollectionsKt.R(((tkj) ukjVar).a.b.entrySet());
        if (entry != null) {
            return (bve) entry.getValue();
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0035  */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9, types: [java.util.concurrent.CancellationException, kotlin.coroutines.Continuation, kotlin.coroutines.CoroutineContext, pm6] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(lhk lhkVar, bve bveVar, boolean z, cg6 cg6Var) {
        jhk jhkVar;
        int i;
        int i2;
        x3n x3nVar;
        sgk sgkVar;
        rdk rdkVar;
        wlb wlbVar;
        ?? r4;
        if (cg6Var instanceof jhk) {
            jhkVar = (jhk) cg6Var;
            int i3 = jhkVar.l;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                jhkVar.l = i3 - Integer.MIN_VALUE;
                Object obj = jhkVar.j;
                nm6 nm6Var = nm6.a;
                i = jhkVar.l;
                if (i != 0) {
                    qgg.h0(obj);
                    ssg.a(4, "PaymentViewModelImpl", "start purchase, isOneClickAvailable=" + z, null);
                    rdk rdkVar2 = lhkVar.s;
                    if (rdkVar2 == null || (x3nVar = (x3n) rdkVar2.e) == null) {
                        i2 = 1;
                    } else {
                        nmb d0 = x3nVar.d0();
                        wkj wkjVar = (wkj) x3nVar.d;
                        String R = x3n.R(wkjVar.a);
                        String R2 = x3n.R(wkjVar.b);
                        String R3 = x3n.R(wkjVar.c);
                        String str = (String) x3nVar.a;
                        d0.getClass();
                        str.getClass();
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        linkedHashMap.put("offersBatchId", R);
                        linkedHashMap.put("offersPositionIds", R2);
                        linkedHashMap.put("billingProductIds", R3);
                        i2 = 1;
                        dfi.p(1, "communication_id", str, "_meta", linkedHashMap);
                        d0.C("PurchaseFullscreen.PlusSDK.Opened", linkedHashMap);
                    }
                    oek oekVar = (oek) lhkVar.o.getValue();
                    jhkVar.l = i2;
                    obj = ((k5m) oekVar.a.getValue()).c().a(new zfk(bveVar, z), jhkVar);
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
                sgkVar = (sgk) obj;
                if (sgkVar instanceof rgk) {
                    Continuation continuation = null;
                    if (sgkVar instanceof qgk) {
                        lgb lgbVar = ((qgk) sgkVar).a;
                        ssg.a(4, "PaymentViewModelImpl", "purchase error: " + lgbVar, null);
                        rdk rdkVar3 = lhkVar.s;
                        if (rdkVar3 != null) {
                            nek v0 = lg3.v0(lgbVar);
                            String str2 = lgbVar.b;
                            x3n x3nVar2 = (x3n) rdkVar3.e;
                            if (x3nVar2 != null) {
                                nmb d02 = x3nVar2.d0();
                                wkj wkjVar2 = (wkj) x3nVar2.d;
                                String R4 = x3n.R(wkjVar2.a);
                                String R5 = x3n.R(wkjVar2.b);
                                String R6 = x3n.R(wkjVar2.c);
                                String str3 = (String) x3nVar2.a;
                                String E = avf.E(((r18) ((jyr) x3nVar2.c).getValue()).b);
                                int ordinal = v0.ordinal();
                                if (ordinal != 0) {
                                    if (ordinal != 1) {
                                        if (ordinal == 2) {
                                            wlbVar = wlb.Store;
                                        } else if (ordinal != 3) {
                                            b6e.s();
                                            return null;
                                        }
                                    }
                                    wlbVar = wlb.Other;
                                } else {
                                    wlbVar = wlb.Network;
                                }
                                String str4 = str2 == null ? "" : str2;
                                d02.getClass();
                                str3.getClass();
                                rdkVar = rdkVar3;
                                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                                linkedHashMap2.put("offersBatchId", R4);
                                linkedHashMap2.put("offersPositionIds", R5);
                                linkedHashMap2.put("billingProductIds", R6);
                                linkedHashMap2.put("communication_id", str3);
                                linkedHashMap2.put("device_name", E);
                                linkedHashMap2.put("error_type", wlbVar.a);
                                dfi.p(1, "error_message", str4, "_meta", linkedHashMap2);
                                d02.C("PurchaseFullscreen.PlusSDK.ErrorRaised", linkedHashMap2);
                            } else {
                                rdkVar = rdkVar3;
                            }
                            v3n v3nVar = (v3n) rdkVar.D();
                            v3nVar.getClass();
                            x97.y(v3nVar.b, null, null, new c5l(v3nVar, w3n.e, v0 + ". " + str2, (Continuation) null, 17), 3);
                        }
                    } else {
                        if (!Intrinsics.d(sgkVar, pgk.a)) {
                            b6e.s();
                            return null;
                        }
                        ssg.a(4, "PaymentViewModelImpl", "purchase cancel", null);
                        rdk rdkVar4 = lhkVar.s;
                        if (rdkVar4 != null) {
                            x3n x3nVar3 = (x3n) rdkVar4.e;
                            if (x3nVar3 != null) {
                                nmb d03 = x3nVar3.d0();
                                wkj wkjVar3 = (wkj) x3nVar3.d;
                                String R7 = x3n.R(wkjVar3.a);
                                String R8 = x3n.R(wkjVar3.b);
                                String R9 = x3n.R(wkjVar3.c);
                                String str5 = (String) x3nVar3.a;
                                d03.getClass();
                                str5.getClass();
                                LinkedHashMap linkedHashMap3 = new LinkedHashMap();
                                linkedHashMap3.put("offersBatchId", R7);
                                linkedHashMap3.put("offersPositionIds", R8);
                                linkedHashMap3.put("billingProductIds", R9);
                                dfi.p(1, "communication_id", str5, "_meta", linkedHashMap3);
                                d03.C("PurchaseFullscreen.PlusSDK.Canceled", linkedHashMap3);
                            }
                            v3n v3nVar2 = (v3n) rdkVar4.D();
                            v3nVar2.getClass();
                            x97.y(v3nVar2.b, null, null, new c5l(v3nVar2, w3n.d, continuation, continuation, 17), 3);
                        }
                    }
                } else {
                    ssg.a(4, "PaymentViewModelImpl", "purchase success", null);
                    rdk rdkVar5 = lhkVar.s;
                    if (rdkVar5 != null) {
                        x3n x3nVar4 = (x3n) rdkVar5.e;
                        if (x3nVar4 != null) {
                            nmb d04 = x3nVar4.d0();
                            wkj wkjVar4 = (wkj) x3nVar4.d;
                            String R10 = x3n.R(wkjVar4.a);
                            String R11 = x3n.R(wkjVar4.b);
                            String R12 = x3n.R(wkjVar4.c);
                            String str6 = (String) x3nVar4.a;
                            d04.getClass();
                            str6.getClass();
                            LinkedHashMap linkedHashMap4 = new LinkedHashMap();
                            linkedHashMap4.put("offersBatchId", R10);
                            linkedHashMap4.put("offersPositionIds", R11);
                            linkedHashMap4.put("billingProductIds", R12);
                            dfi.p(1, "communication_id", str6, "_meta", linkedHashMap4);
                            d04.C("PurchaseFullscreen.PlusSDK.Succeeded", linkedHashMap4);
                        }
                        udk udkVar = (udk) rdkVar5.f;
                        if (udkVar != null) {
                            udkVar.a();
                        }
                        v3n v3nVar3 = (v3n) rdkVar5.D();
                        v3nVar3.getClass();
                        Continuation continuation2 = null;
                        r4 = 0;
                        x97.y(v3nVar3.b, null, null, new c5l(v3nVar3, w3n.f, continuation2, continuation2, 17), 3);
                    } else {
                        r4 = 0;
                    }
                    rar rarVar = lhkVar.x;
                    if (rarVar != 0) {
                        rarVar.g(r4);
                    }
                    lhkVar.x = x97.y(ot0.F(lhkVar), r4, r4, new khk(lhkVar, r4, 0), 3);
                }
                return Unit.a;
            }
        }
        jhkVar = new jhk(lhkVar, cg6Var);
        Object obj2 = jhkVar.j;
        nm6 nm6Var2 = nm6.a;
        i = jhkVar.l;
        if (i != 0) {
        }
        sgkVar = (sgk) obj2;
        if (sgkVar instanceof rgk) {
        }
        return Unit.a;
    }

    public final void H() {
        rdk rdkVar = this.s;
        if (rdkVar == null || ((bve) rdkVar.g) == null) {
            return;
        }
        x3n x3nVar = (x3n) rdkVar.e;
        if (x3nVar != null) {
            nmb d0 = x3nVar.d0();
            wkj wkjVar = (wkj) x3nVar.d;
            String R = x3n.R(wkjVar.a);
            String R2 = x3n.R(wkjVar.b);
            String R3 = x3n.R(wkjVar.c);
            String str = (String) x3nVar.a;
            ikb[] ikbVarArr = ikb.a;
            d0.getClass();
            str.getClass();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("offersBatchId", R);
            linkedHashMap.put("offersPositionIds", R2);
            linkedHashMap.put("billingProductIds", R3);
            linkedHashMap.put("communication_id", str);
            dfi.p(1, "closed_by", "cross", "_meta", linkedHashMap);
            d0.C("PurchaseFullscreen.Closed", linkedHashMap);
        }
        v3n v3nVar = (v3n) rdkVar.D();
        v3nVar.getClass();
        v3n.c(v3nVar, r3n.l);
    }
}
