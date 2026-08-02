package ru.yandex.taxi.logistics.care.impl.router;

import android.content.Context;
import androidx.compose.ui.platform.ComposeView;
import defpackage.amh;
import defpackage.at8;
import defpackage.avj0;
import defpackage.bvf0;
import defpackage.c2x0;
import defpackage.cu8;
import defpackage.dab1;
import defpackage.dt8;
import defpackage.et41;
import defpackage.ft8;
import defpackage.geh;
import defpackage.gt41;
import defpackage.gt8;
import defpackage.gw00;
import defpackage.h2b1;
import defpackage.h2t;
import defpackage.h3y;
import defpackage.ht8;
import defpackage.i3y;
import defpackage.jl40;
import defpackage.jt8;
import defpackage.jwh;
import defpackage.kb20;
import defpackage.kwh;
import defpackage.ls8;
import defpackage.m8h;
import defpackage.me0;
import defpackage.mo21;
import defpackage.n3w;
import defpackage.nwh;
import defpackage.ny61;
import defpackage.po21;
import defpackage.pwy0;
import defpackage.pzt0;
import defpackage.q5z;
import defpackage.qje;
import defpackage.qnh;
import defpackage.rxh0;
import defpackage.s0k0;
import defpackage.sbx;
import defpackage.tj21;
import defpackage.tse;
import defpackage.txh;
import defpackage.ut2;
import defpackage.v7j0;
import defpackage.vt2;
import defpackage.w030;
import defpackage.w511;
import defpackage.wg10;
import defpackage.wly0;
import defpackage.wt2;
import defpackage.xt2;
import defpackage.xx8;
import defpackage.ys8;
import defpackage.zgf;
import defpackage.zuj0;
import java.util.LinkedHashMap;
import kotlin.Pair;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.text.Regex;
import okhttp3.OkHttpClient;
import ru.yandex.logistics.care.data.CarePhotoApi;

/* loaded from: classes5.dex */
public final class f extends com.yandex.go.navigation.modals.coroutines.a {
    public final zuj0 F;
    public final nwh G;
    public final ru.yandex.taxi.logistics.care.impl.auth.a H;
    public final ru.yandex.taxi.logistics.care.impl.experiments.a I;
    public final v7j0 J;
    public final ru.yandex.taxi.fragment.common.b K;
    public final h3y L;
    public final h3y M;
    public final kb20 N;
    public final tse O;
    public final Context P;
    public final w030 Q;
    public final c2x0 R;
    public final po21 S;
    public final tj21 T;
    public final pwy0 U;
    public pzt0 V;
    public pzt0 W;

    public f(zuj0 zuj0Var, nwh nwhVar, ru.yandex.taxi.logistics.care.impl.auth.a aVar, ru.yandex.taxi.logistics.care.impl.experiments.a aVar2, v7j0 v7j0Var, ru.yandex.taxi.fragment.common.b bVar, h3y h3yVar, h3y h3yVar2, kb20 kb20Var, tse tseVar, Context context, w030 w030Var, c2x0 c2x0Var, po21 po21Var, tj21 tj21Var, pwy0 pwy0Var) {
        super(null);
        this.F = zuj0Var;
        this.G = nwhVar;
        this.H = aVar;
        this.I = aVar2;
        this.J = v7j0Var;
        this.K = bVar;
        this.L = h3yVar;
        this.M = h3yVar2;
        this.N = kb20Var;
        this.O = tseVar;
        this.P = context;
        this.Q = w030Var;
        this.R = c2x0Var;
        this.S = po21Var;
        this.T = tj21Var;
        this.U = pwy0Var;
    }

    @Override // com.yandex.go.navigation.modals.coroutines.a, defpackage.h55
    public final void H(Object obj) {
        super.H((txh) obj);
        pzt0 pzt0Var = this.V;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        pzt0 pzt0Var2 = this.W;
        if (pzt0Var2 != null) {
            pzt0Var2.a(null);
        }
    }

    @Override // com.yandex.go.navigation.modals.coroutines.a
    public final w030 P() {
        return this.Q;
    }

    @Override // com.yandex.go.navigation.modals.coroutines.a
    public final boolean Q() {
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object T(txh txhVar, ContinuationImpl continuationImpl) {
        DeliveryCareRouterImpl$createWebViewArgs$1 deliveryCareRouterImpl$createWebViewArgs$1;
        int i;
        if (continuationImpl instanceof DeliveryCareRouterImpl$createWebViewArgs$1) {
            deliveryCareRouterImpl$createWebViewArgs$1 = (DeliveryCareRouterImpl$createWebViewArgs$1) continuationImpl;
            int i2 = deliveryCareRouterImpl$createWebViewArgs$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                deliveryCareRouterImpl$createWebViewArgs$1.label = i2 - Integer.MIN_VALUE;
                Object obj = deliveryCareRouterImpl$createWebViewArgs$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = deliveryCareRouterImpl$createWebViewArgs$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    deliveryCareRouterImpl$createWebViewArgs$1.L$0 = txhVar;
                    deliveryCareRouterImpl$createWebViewArgs$1.label = 1;
                    obj = ((ru.yandex.taxi.preorder.source.userposition.e) this.S).h(deliveryCareRouterImpl$createWebViewArgs$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    txhVar = (txh) deliveryCareRouterImpl$createWebViewArgs$1.L$0;
                    kotlin.b.b(obj);
                }
                mo21 mo21Var = (mo21) obj;
                LinkedHashMap n = kotlin.collections.b.n(txhVar.b, gw00.e(new Pair("coordinates", mo21Var.b + "," + mo21Var.a)));
                String str = txhVar.a;
                LinkedHashMap linkedHashMap = new LinkedHashMap(this.G.b.a());
                int i3 = rxh0.delivery_unknown_error_dialog_title;
                avj0 avj0Var = (avj0) this.F;
                ft8 ft8Var = new ft8(avj0Var.h(i3), avj0Var.h(rxh0.delivery_unknown_error_dialog_message), avj0Var.h(rxh0.delivery_unknown_error_dialog_positive_button), avj0Var.h(rxh0.logistics_retry_button));
                tj21 tj21Var = this.T;
                tj21Var.b.getClass();
                return new at8(str, linkedHashMap, n, ft8Var, tj21Var.b());
            }
        }
        deliveryCareRouterImpl$createWebViewArgs$1 = new DeliveryCareRouterImpl$createWebViewArgs$1(this, continuationImpl);
        Object obj2 = deliveryCareRouterImpl$createWebViewArgs$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = deliveryCareRouterImpl$createWebViewArgs$1.label;
        if (i != 0) {
        }
        mo21 mo21Var2 = (mo21) obj2;
        LinkedHashMap n2 = kotlin.collections.b.n(txhVar.b, gw00.e(new Pair("coordinates", mo21Var2.b + "," + mo21Var2.a)));
        String str2 = txhVar.a;
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(this.G.b.a());
        int i32 = rxh0.delivery_unknown_error_dialog_title;
        avj0 avj0Var2 = (avj0) this.F;
        ft8 ft8Var2 = new ft8(avj0Var2.h(i32), avj0Var2.h(rxh0.delivery_unknown_error_dialog_message), avj0Var2.h(rxh0.delivery_unknown_error_dialog_positive_button), avj0Var2.h(rxh0.logistics_retry_button));
        tj21 tj21Var2 = this.T;
        tj21Var2.b.getClass();
        return new at8(str2, linkedHashMap2, n2, ft8Var2, tj21Var2.b());
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x0065, code lost:
    
        if (r4 == r3) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    @Override // com.yandex.go.navigation.modals.coroutines.a
    /* renamed from: U, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object S(txh txhVar, ContinuationImpl continuationImpl) {
        DeliveryCareRouterImpl$provideModalView$1 deliveryCareRouterImpl$provideModalView$1;
        Object obj;
        int i;
        txh txhVar2;
        Object a;
        Object T;
        txh txhVar3;
        boolean z;
        Context context;
        ht8 ht8Var;
        Context context2;
        kwh kwhVar;
        xt2 ut2Var;
        xt2 xt2Var;
        if (continuationImpl instanceof DeliveryCareRouterImpl$provideModalView$1) {
            deliveryCareRouterImpl$provideModalView$1 = (DeliveryCareRouterImpl$provideModalView$1) continuationImpl;
            int i2 = deliveryCareRouterImpl$provideModalView$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                deliveryCareRouterImpl$provideModalView$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = deliveryCareRouterImpl$provideModalView$1.result;
                obj = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = deliveryCareRouterImpl$provideModalView$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    txhVar2 = txhVar;
                    deliveryCareRouterImpl$provideModalView$1.L$0 = txhVar2;
                    deliveryCareRouterImpl$provideModalView$1.label = 1;
                    a = this.I.a(deliveryCareRouterImpl$provideModalView$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        z = deliveryCareRouterImpl$provideModalView$1.Z$0;
                        Context context3 = (Context) deliveryCareRouterImpl$provideModalView$1.L$3;
                        ht8Var = (ht8) deliveryCareRouterImpl$provideModalView$1.L$2;
                        Context context4 = (Context) deliveryCareRouterImpl$provideModalView$1.L$1;
                        txhVar3 = (txh) deliveryCareRouterImpl$provideModalView$1.L$0;
                        kotlin.b.b(obj2);
                        context2 = context3;
                        context = context4;
                        at8 at8Var = (at8) obj2;
                        kwhVar = txhVar3.c;
                        if (!jl40.l(kwhVar, h2b1.B)) {
                            xt2Var = vt2.a;
                        } else {
                            if (!jl40.l(kwhVar, dab1.B)) {
                                if (kwhVar == null) {
                                    w511.b();
                                    return null;
                                }
                                ut2Var = new ut2(kwhVar.a);
                                a aVar = new a(this, txhVar3);
                                b bVar = z ? new b(this) : null;
                                cu8 cu8Var = new cu8(this);
                                qnh qnhVar = new qnh(this);
                                OkHttpClient okHttpClient = (OkHttpClient) this.M.get();
                                jwh jwhVar = (jwh) this.L.get();
                                zgf zgfVar = new zgf(29, this);
                                e eVar = new e(this, z);
                                geh gehVar = new geh();
                                ht8Var.getClass();
                                gt8 gt8Var = new gt8(at8Var, new dt8(cu8Var, gehVar, ut2Var, aVar, bVar, okHttpClient, new m8h(jwhVar), zgfVar), eVar);
                                et41 et41Var = (et41) n3w.a(new et41(gt41.a)).a;
                                new ls8();
                                wly0 wly0Var = new wly0();
                                me0 me0Var = new me0(context2, (byte) 0);
                                i3y i3yVar = ys8.a;
                                sbx sbxVar = (sbx) i3yVar.getValue();
                                q5z.i(sbxVar);
                                h2t h2tVar = new h2t(sbxVar);
                                Regex regex = wg10.e;
                                wg10 o = qje.o("application/json");
                                s0k0 s0k0Var = new s0k0();
                                s0k0Var.a = okHttpClient;
                                s0k0Var.b("https://localhost/");
                                s0k0Var.a(bvf0.o((sbx) i3yVar.getValue(), o));
                                ru.yandex.logistics.care.domain.a aVar2 = new ru.yandex.logistics.care.domain.a((CarePhotoApi) s0k0Var.c().b(CarePhotoApi.class));
                                sbx sbxVar2 = (sbx) i3yVar.getValue();
                                q5z.i(sbxVar2);
                                Context context5 = context2;
                                jt8 jt8Var = new jt8(et41Var, gt8Var, context5, wly0Var, aVar2, me0Var, h2tVar, new ru.yandex.logistics.care.ui.b(sbxVar2));
                                ComposeView composeView = new ComposeView(context5, null, 0, 6, null);
                                composeView.setContent(new androidx.compose.runtime.internal.a(-358285328, new xx8(25, jt8Var, qnhVar, composeView), true));
                                return new DeliveryCareSlideableView(context, composeView, this.R, new amh(6, this));
                            }
                            xt2Var = wt2.a;
                        }
                        ut2Var = xt2Var;
                        a aVar3 = new a(this, txhVar3);
                        b bVar2 = z ? new b(this) : null;
                        cu8 cu8Var2 = new cu8(this);
                        qnh qnhVar2 = new qnh(this);
                        OkHttpClient okHttpClient2 = (OkHttpClient) this.M.get();
                        jwh jwhVar2 = (jwh) this.L.get();
                        zgf zgfVar2 = new zgf(29, this);
                        e eVar2 = new e(this, z);
                        geh gehVar2 = new geh();
                        ht8Var.getClass();
                        gt8 gt8Var2 = new gt8(at8Var, new dt8(cu8Var2, gehVar2, ut2Var, aVar3, bVar2, okHttpClient2, new m8h(jwhVar2), zgfVar2), eVar2);
                        et41 et41Var2 = (et41) n3w.a(new et41(gt41.a)).a;
                        new ls8();
                        wly0 wly0Var2 = new wly0();
                        me0 me0Var2 = new me0(context2, (byte) 0);
                        i3y i3yVar2 = ys8.a;
                        sbx sbxVar3 = (sbx) i3yVar2.getValue();
                        q5z.i(sbxVar3);
                        h2t h2tVar2 = new h2t(sbxVar3);
                        Regex regex2 = wg10.e;
                        wg10 o2 = qje.o("application/json");
                        s0k0 s0k0Var2 = new s0k0();
                        s0k0Var2.a = okHttpClient2;
                        s0k0Var2.b("https://localhost/");
                        s0k0Var2.a(bvf0.o((sbx) i3yVar2.getValue(), o2));
                        ru.yandex.logistics.care.domain.a aVar22 = new ru.yandex.logistics.care.domain.a((CarePhotoApi) s0k0Var2.c().b(CarePhotoApi.class));
                        sbx sbxVar22 = (sbx) i3yVar2.getValue();
                        q5z.i(sbxVar22);
                        Context context52 = context2;
                        jt8 jt8Var2 = new jt8(et41Var2, gt8Var2, context52, wly0Var2, aVar22, me0Var2, h2tVar2, new ru.yandex.logistics.care.ui.b(sbxVar22));
                        ComposeView composeView2 = new ComposeView(context52, null, 0, 6, null);
                        composeView2.setContent(new androidx.compose.runtime.internal.a(-358285328, new xx8(25, jt8Var2, qnhVar2, composeView2), true));
                        return new DeliveryCareSlideableView(context, composeView2, this.R, new amh(6, this));
                    }
                    txh txhVar4 = (txh) deliveryCareRouterImpl$provideModalView$1.L$0;
                    kotlin.b.b(obj2);
                    a = obj2;
                    txhVar2 = txhVar4;
                }
                boolean booleanValue = ((Boolean) a).booleanValue();
                deliveryCareRouterImpl$provideModalView$1.L$0 = txhVar2;
                Context context6 = this.P;
                deliveryCareRouterImpl$provideModalView$1.L$1 = context6;
                ht8 ht8Var2 = ht8.a;
                deliveryCareRouterImpl$provideModalView$1.L$2 = ht8Var2;
                deliveryCareRouterImpl$provideModalView$1.L$3 = context6;
                deliveryCareRouterImpl$provideModalView$1.Z$0 = booleanValue;
                deliveryCareRouterImpl$provideModalView$1.label = 2;
                T = T(txhVar2, deliveryCareRouterImpl$provideModalView$1);
                if (T != obj) {
                    txhVar3 = txhVar2;
                    obj2 = T;
                    z = booleanValue;
                    context = context6;
                    ht8Var = ht8Var2;
                    context2 = context;
                    at8 at8Var2 = (at8) obj2;
                    kwhVar = txhVar3.c;
                    if (!jl40.l(kwhVar, h2b1.B)) {
                    }
                    ut2Var = xt2Var;
                    a aVar32 = new a(this, txhVar3);
                    b bVar22 = z ? new b(this) : null;
                    cu8 cu8Var22 = new cu8(this);
                    qnh qnhVar22 = new qnh(this);
                    OkHttpClient okHttpClient22 = (OkHttpClient) this.M.get();
                    jwh jwhVar22 = (jwh) this.L.get();
                    zgf zgfVar22 = new zgf(29, this);
                    e eVar22 = new e(this, z);
                    geh gehVar22 = new geh();
                    ht8Var.getClass();
                    gt8 gt8Var22 = new gt8(at8Var2, new dt8(cu8Var22, gehVar22, ut2Var, aVar32, bVar22, okHttpClient22, new m8h(jwhVar22), zgfVar22), eVar22);
                    et41 et41Var22 = (et41) n3w.a(new et41(gt41.a)).a;
                    new ls8();
                    wly0 wly0Var22 = new wly0();
                    me0 me0Var22 = new me0(context2, (byte) 0);
                    i3y i3yVar22 = ys8.a;
                    sbx sbxVar32 = (sbx) i3yVar22.getValue();
                    q5z.i(sbxVar32);
                    h2t h2tVar22 = new h2t(sbxVar32);
                    Regex regex22 = wg10.e;
                    wg10 o22 = qje.o("application/json");
                    s0k0 s0k0Var22 = new s0k0();
                    s0k0Var22.a = okHttpClient22;
                    s0k0Var22.b("https://localhost/");
                    s0k0Var22.a(bvf0.o((sbx) i3yVar22.getValue(), o22));
                    ru.yandex.logistics.care.domain.a aVar222 = new ru.yandex.logistics.care.domain.a((CarePhotoApi) s0k0Var22.c().b(CarePhotoApi.class));
                    sbx sbxVar222 = (sbx) i3yVar22.getValue();
                    q5z.i(sbxVar222);
                    Context context522 = context2;
                    jt8 jt8Var22 = new jt8(et41Var22, gt8Var22, context522, wly0Var22, aVar222, me0Var22, h2tVar22, new ru.yandex.logistics.care.ui.b(sbxVar222));
                    ComposeView composeView22 = new ComposeView(context522, null, 0, 6, null);
                    composeView22.setContent(new androidx.compose.runtime.internal.a(-358285328, new xx8(25, jt8Var22, qnhVar22, composeView22), true));
                    return new DeliveryCareSlideableView(context, composeView22, this.R, new amh(6, this));
                }
                return obj;
            }
        }
        deliveryCareRouterImpl$provideModalView$1 = new DeliveryCareRouterImpl$provideModalView$1(this, continuationImpl);
        Object obj22 = deliveryCareRouterImpl$provideModalView$1.result;
        obj = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = deliveryCareRouterImpl$provideModalView$1.label;
        if (i != 0) {
        }
        boolean booleanValue2 = ((Boolean) a).booleanValue();
        deliveryCareRouterImpl$provideModalView$1.L$0 = txhVar2;
        Context context62 = this.P;
        deliveryCareRouterImpl$provideModalView$1.L$1 = context62;
        ht8 ht8Var22 = ht8.a;
        deliveryCareRouterImpl$provideModalView$1.L$2 = ht8Var22;
        deliveryCareRouterImpl$provideModalView$1.L$3 = context62;
        deliveryCareRouterImpl$provideModalView$1.Z$0 = booleanValue2;
        deliveryCareRouterImpl$provideModalView$1.label = 2;
        T = T(txhVar2, deliveryCareRouterImpl$provideModalView$1);
        if (T != obj) {
        }
        return obj;
    }
}
