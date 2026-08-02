package ru.yandex.taxi.maas.impl.deeplink;

import com.yandex.go.address.models.ZoneAddress;
import com.yandex.go.taxi.order.models.api.preorder.Preorder;
import defpackage.avu0;
import defpackage.c0l0;
import defpackage.cse0;
import defpackage.hre0;
import defpackage.hxx;
import defpackage.j000;
import defpackage.jl40;
import defpackage.jst;
import defpackage.l000;
import defpackage.m000;
import defpackage.m950;
import defpackage.n000;
import defpackage.ny61;
import defpackage.o000;
import defpackage.oep0;
import defpackage.pep0;
import defpackage.v100;
import defpackage.v770;
import defpackage.vpe0;
import defpackage.w511;
import defpackage.xpb1;
import defpackage.yvf0;
import defpackage.zy11;
import defpackage.zzs;
import java.util.Iterator;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.deeplinks.DeeplinkSource;
import ru.yandex.taxi.maas.api.analytics.MultiTransportChooseStationCardAnalytics$OpenReasonV2;
import ru.yandex.taxi.maas.api.deeplink.MaasMode;

/* loaded from: classes9.dex */
public final class a extends o000 {
    public final com.yandex.go.lifecycle.a b;
    public final yvf0 c;
    public final ru.yandex.taxi.superapp.orders.multi.a d;
    public final yvf0 e;

    public a(com.yandex.go.lifecycle.a aVar, yvf0 yvf0Var, ru.yandex.taxi.superapp.orders.multi.a aVar2, yvf0 yvf0Var2) {
        this.b = aVar;
        this.c = yvf0Var;
        this.d = aVar2;
        this.e = yvf0Var2;
    }

    @Override // com.yandex.go.deeplinks.typed.a
    public final boolean b() {
        return false;
    }

    @Override // com.yandex.go.deeplinks.typed.a
    public final /* bridge */ /* synthetic */ Object c(oep0 oep0Var, Object obj, v770 v770Var, DeeplinkSource deeplinkSource, Continuation continuation) {
        return d(oep0Var, (l000) obj, (ContinuationImpl) continuation);
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x00be, code lost:
    
        if (r10 == null) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x01db, code lost:
    
        if (r25.b.a(r3) == r4) goto L92;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(oep0 oep0Var, l000 l000Var, ContinuationImpl continuationImpl) {
        MaasDeeplinkHandler$handleDeeplink$1 maasDeeplinkHandler$handleDeeplink$1;
        Object obj;
        CoroutineSingletons coroutineSingletons;
        int i;
        MultiTransportChooseStationCardAnalytics$OpenReasonV2 multiTransportChooseStationCardAnalytics$OpenReasonV2;
        m000 m000Var;
        Object obj2;
        oep0 oep0Var2;
        m000 m000Var2;
        oep0 oep0Var3 = oep0Var;
        if (continuationImpl instanceof MaasDeeplinkHandler$handleDeeplink$1) {
            maasDeeplinkHandler$handleDeeplink$1 = (MaasDeeplinkHandler$handleDeeplink$1) continuationImpl;
            int i2 = maasDeeplinkHandler$handleDeeplink$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                maasDeeplinkHandler$handleDeeplink$1.label = i2 - Integer.MIN_VALUE;
                obj = maasDeeplinkHandler$handleDeeplink$1.result;
                coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = maasDeeplinkHandler$handleDeeplink$1.label;
                zy11 zy11Var = zy11.a;
                if (i != 0) {
                    b.b(obj);
                    v100 v100Var = MaasMode.Companion;
                    String f = l000Var.f();
                    v100Var.getClass();
                    MaasMode a = v100.a(f);
                    if (a != null) {
                        String g = l000Var.g();
                        if (g != null) {
                            Iterator<E> it = MultiTransportChooseStationCardAnalytics$OpenReasonV2.a().iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    obj2 = null;
                                    break;
                                }
                                obj2 = it.next();
                                if (jl40.l(((MultiTransportChooseStationCardAnalytics$OpenReasonV2) obj2).getEventValue(), g)) {
                                    break;
                                }
                            }
                            multiTransportChooseStationCardAnalytics$OpenReasonV2 = (MultiTransportChooseStationCardAnalytics$OpenReasonV2) obj2;
                        }
                        multiTransportChooseStationCardAnalytics$OpenReasonV2 = MultiTransportChooseStationCardAnalytics$OpenReasonV2.ShortcutsMain;
                        MultiTransportChooseStationCardAnalytics$OpenReasonV2 multiTransportChooseStationCardAnalytics$OpenReasonV22 = multiTransportChooseStationCardAnalytics$OpenReasonV2;
                        String b = l000Var.b();
                        Double i3 = b != null ? avu0.i(b) : null;
                        String d = l000Var.d();
                        Double i4 = d != null ? avu0.i(d) : null;
                        String c = l000Var.c();
                        Double i5 = c != null ? avu0.i(c) : null;
                        String e = l000Var.e();
                        Double i6 = e != null ? avu0.i(e) : null;
                        c0l0 c0l0Var = (i3 == null || i4 == null || i5 == null || i6 == null) ? null : new c0l0(new zzs(i3.doubleValue(), i4.doubleValue(), 0, null, null, 28), new zzs(i5.doubleValue(), i6.doubleValue(), 0, null, null, 28));
                        String h = l000Var.h();
                        String str = h == null ? "" : h;
                        String a2 = l000Var.a();
                        m000Var = new m000(a, str, a2 == null ? "" : a2, multiTransportChooseStationCardAnalytics$OpenReasonV22, c0l0Var);
                        if (m000Var.b() == MaasMode.ACCOUNT || m000Var.e().length() != 0) {
                            MaasMode b2 = m000Var.b();
                            MaasMode maasMode = MaasMode.ROUTE;
                            if (b2 == maasMode && m000Var.d() == null) {
                                jst.e.x(new IllegalArgumentException(), "'" + maasMode + "' maas-ride deeplink must contain route points coordinates");
                            }
                            if (m000Var != null) {
                                int i7 = n000.a[a.ordinal()];
                                if (i7 != 1 && i7 != 2 && i7 != 3) {
                                    if (i7 == 4) {
                                        ((pep0) oep0Var3).f((m950) this.c.get(), new j000(m000Var.c()), hxx.a);
                                        return zy11Var;
                                    }
                                    w511.b();
                                    return null;
                                }
                                maasDeeplinkHandler$handleDeeplink$1.L$0 = oep0Var3;
                                maasDeeplinkHandler$handleDeeplink$1.L$1 = null;
                                maasDeeplinkHandler$handleDeeplink$1.L$2 = null;
                                maasDeeplinkHandler$handleDeeplink$1.L$3 = null;
                                maasDeeplinkHandler$handleDeeplink$1.L$4 = null;
                                maasDeeplinkHandler$handleDeeplink$1.L$5 = null;
                                maasDeeplinkHandler$handleDeeplink$1.L$6 = null;
                                maasDeeplinkHandler$handleDeeplink$1.L$7 = m000Var;
                                maasDeeplinkHandler$handleDeeplink$1.label = 1;
                            }
                        } else {
                            jst.e.x(new IllegalArgumentException(), "maas-ride deeplink must contain vertical ID");
                        }
                        m000Var = null;
                        if (m000Var != null) {
                        }
                    }
                    return zy11Var;
                }
                if (i != 1) {
                    if (i != 2) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    m000Var2 = (m000) maasDeeplinkHandler$handleDeeplink$1.L$7;
                    oep0Var2 = (oep0) maasDeeplinkHandler$handleDeeplink$1.L$0;
                    b.b(obj);
                    Preorder preorder = new Preorder(0);
                    preorder.o((ZoneAddress) obj);
                    ((pep0) oep0Var2).f((m950) this.e.get(), new hre0(new vpe0(preorder), new cse0(m000Var2), "open MaaS", false, xpb1.c), hxx.a);
                    return zy11Var;
                }
                m000 m000Var3 = (m000) maasDeeplinkHandler$handleDeeplink$1.L$7;
                oep0 oep0Var4 = (oep0) maasDeeplinkHandler$handleDeeplink$1.L$0;
                b.b(obj);
                m000Var = m000Var3;
                oep0Var3 = oep0Var4;
                maasDeeplinkHandler$handleDeeplink$1.L$0 = oep0Var3;
                maasDeeplinkHandler$handleDeeplink$1.L$1 = null;
                maasDeeplinkHandler$handleDeeplink$1.L$2 = null;
                maasDeeplinkHandler$handleDeeplink$1.L$3 = null;
                maasDeeplinkHandler$handleDeeplink$1.L$4 = null;
                maasDeeplinkHandler$handleDeeplink$1.L$5 = null;
                maasDeeplinkHandler$handleDeeplink$1.L$6 = null;
                maasDeeplinkHandler$handleDeeplink$1.L$7 = m000Var;
                maasDeeplinkHandler$handleDeeplink$1.label = 2;
                obj = this.d.a(maasDeeplinkHandler$handleDeeplink$1);
                if (obj != coroutineSingletons) {
                    oep0Var2 = oep0Var3;
                    m000Var2 = m000Var;
                    Preorder preorder2 = new Preorder(0);
                    preorder2.o((ZoneAddress) obj);
                    ((pep0) oep0Var2).f((m950) this.e.get(), new hre0(new vpe0(preorder2), new cse0(m000Var2), "open MaaS", false, xpb1.c), hxx.a);
                    return zy11Var;
                }
                return coroutineSingletons;
            }
        }
        maasDeeplinkHandler$handleDeeplink$1 = new MaasDeeplinkHandler$handleDeeplink$1(this, continuationImpl);
        obj = maasDeeplinkHandler$handleDeeplink$1.result;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = maasDeeplinkHandler$handleDeeplink$1.label;
        zy11 zy11Var2 = zy11.a;
        if (i != 0) {
        }
        maasDeeplinkHandler$handleDeeplink$1.L$0 = oep0Var3;
        maasDeeplinkHandler$handleDeeplink$1.L$1 = null;
        maasDeeplinkHandler$handleDeeplink$1.L$2 = null;
        maasDeeplinkHandler$handleDeeplink$1.L$3 = null;
        maasDeeplinkHandler$handleDeeplink$1.L$4 = null;
        maasDeeplinkHandler$handleDeeplink$1.L$5 = null;
        maasDeeplinkHandler$handleDeeplink$1.L$6 = null;
        maasDeeplinkHandler$handleDeeplink$1.L$7 = m000Var;
        maasDeeplinkHandler$handleDeeplink$1.label = 2;
        obj = this.d.a(maasDeeplinkHandler$handleDeeplink$1);
        if (obj != coroutineSingletons) {
        }
        return coroutineSingletons;
    }
}
