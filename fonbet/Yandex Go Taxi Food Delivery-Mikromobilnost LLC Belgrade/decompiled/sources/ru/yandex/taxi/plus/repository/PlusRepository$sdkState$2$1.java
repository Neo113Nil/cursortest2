package ru.yandex.taxi.plus.repository;

import com.yandex.plus.log.api.LogPriority;
import defpackage.aa6;
import defpackage.acr0;
import defpackage.aqp0;
import defpackage.bfy0;
import defpackage.bo10;
import defpackage.cmt;
import defpackage.dk10;
import defpackage.dkd0;
import defpackage.dsp0;
import defpackage.e841;
import defpackage.ea6;
import defpackage.eo10;
import defpackage.exf0;
import defpackage.f521;
import defpackage.fo10;
import defpackage.fze;
import defpackage.g4u0;
import defpackage.gw00;
import defpackage.imo;
import defpackage.k7r0;
import defpackage.l0v0;
import defpackage.l4u0;
import defpackage.l5r0;
import defpackage.ls;
import defpackage.mvg;
import defpackage.ntq0;
import defpackage.ny61;
import defpackage.o0v0;
import defpackage.ok10;
import defpackage.pgz;
import defpackage.pzt0;
import defpackage.q5r0;
import defpackage.qqd0;
import defpackage.r5d0;
import defpackage.ro11;
import defpackage.rqd0;
import defpackage.tcc;
import defpackage.tje;
import defpackage.tse;
import defpackage.u7r0;
import defpackage.uyi;
import defpackage.vhu;
import defpackage.w511;
import defpackage.weu;
import defpackage.wk60;
import defpackage.wls;
import defpackage.xjd0;
import defpackage.y8r0;
import defpackage.yn11;
import defpackage.z1d0;
import defpackage.znp0;
import defpackage.zrp0;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.r0;
import ru.yandex.taxi.cashback.l;
import ru.yandex.taxi.plus.api.dto.MenuType;
import ru.yandex.taxi.plus.api.dto.menu.button.ButtonAction;
import ru.yandex.taxi.plus.api.dto.state.plaque.e0;
import ru.yandex.taxi.plus.api.dto.state.subscription.SubscriptionStatusDto;
import ru.yandex.taxi.plus.purchase.domain.PurchaseStatus;
import ru.yandex.taxi.plus.purchase.domain.UpgradeStatus;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lznp0;", "<anonymous>", "(Ltse;)Lznp0;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.plus.repository.PlusRepository$sdkState$2$1", f = "PlusRepository.kt", l = {104}, m = "invokeSuspend", v = 2)
/* loaded from: classes9.dex */
final class PlusRepository$sdkState$2$1 extends SuspendLambda implements wls {
    final /* synthetic */ zrp0 $param;
    final /* synthetic */ String $visibilityMode;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ c this$0;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
    @mvg(c = "ru.yandex.taxi.plus.repository.PlusRepository$sdkState$2$1$1", f = "PlusRepository.kt", l = {100, 101}, m = "invokeSuspend", v = 2)
    /* renamed from: ru.yandex.taxi.plus.repository.PlusRepository$sdkState$2$1$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements wls {
        int label;
        final /* synthetic */ c this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(c cVar, Continuation continuation) {
            super(2, continuation);
            this.this$0 = cVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new AnonymousClass1(this.this$0, continuation);
        }

        @Override // defpackage.wls
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:27:0x002a, code lost:
        
            if (r8 == r0) goto L29;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Object obj2;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            zy11 zy11Var = zy11.a;
            if (i == 0) {
                kotlin.b.b(obj);
                l lVar = this.this$0.m;
                this.label = 1;
                obj = lVar.c(this);
            } else {
                if (i != 1) {
                    if (i == 2) {
                        kotlin.b.b(obj);
                        return zy11Var;
                    }
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
            }
            if (((Boolean) obj).booleanValue()) {
                exf0 exf0Var = (exf0) this.this$0.n.invoke();
                this.label = 2;
                com.yandex.plus.home.plaque.feature.internal.b bVar = (com.yandex.plus.home.plaque.feature.internal.b) exf0Var.a.getValue();
                pgz pgzVar = bVar.f;
                LogPriority logPriority = LogPriority.INFO;
                if (pgzVar.e(logPriority)) {
                    pgzVar.a(logPriority, "PlaqueFeatureImpl", "update()");
                }
                pzt0 b = bVar.b(true);
                if (b == null || (obj2 = b.u0(this)) != coroutineSingletons) {
                    obj2 = zy11Var;
                }
                if (obj2 != coroutineSingletons) {
                    obj2 = zy11Var;
                }
                if (obj2 == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
            return zy11Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlusRepository$sdkState$2$1(c cVar, zrp0 zrp0Var, String str, Continuation continuation) {
        super(2, continuation);
        this.this$0 = cVar;
        this.$param = zrp0Var;
        this.$visibilityMode = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        PlusRepository$sdkState$2$1 plusRepository$sdkState$2$1 = new PlusRepository$sdkState$2$1(this.this$0, this.$param, this.$visibilityMode, continuation);
        plusRepository$sdkState$2$1.L$0 = obj;
        return plusRepository$sdkState$2$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((PlusRepository$sdkState$2$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0434  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0478  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x0487  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x0491  */
    /* JADX WARN: Type inference failed for: r13v1 */
    /* JADX WARN: Type inference failed for: r13v2, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r13v6 */
    /* JADX WARN: Type inference failed for: r16v0, types: [aa6] */
    /* JADX WARN: Type inference failed for: r16v1 */
    /* JADX WARN: Type inference failed for: r16v2, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r16v4 */
    /* JADX WARN: Type inference failed for: r17v1 */
    /* JADX WARN: Type inference failed for: r17v2, types: [vr41] */
    /* JADX WARN: Type inference failed for: r17v4 */
    /* JADX WARN: Type inference failed for: r25v0 */
    /* JADX WARN: Type inference failed for: r25v1, types: [bo10] */
    /* JADX WARN: Type inference failed for: r25v2 */
    /* JADX WARN: Type inference failed for: r26v0 */
    /* JADX WARN: Type inference failed for: r26v1, types: [g4u0] */
    /* JADX WARN: Type inference failed for: r26v2 */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v13, types: [wk60] */
    /* JADX WARN: Type inference failed for: r4v26 */
    /* JADX WARN: Type inference failed for: r4v27, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r4v38 */
    /* JADX WARN: Type inference failed for: r4v39 */
    /* JADX WARN: Type inference failed for: r5v16 */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v7, types: [vhu] */
    /* JADX WARN: Type inference failed for: r6v11, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v12, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r8v29 */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v2, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r9v9 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object a;
        List list;
        dkd0 dkd0Var;
        Map map;
        SubscriptionStatusDto subscriptionStatusDto;
        PurchaseStatus purchaseStatus;
        f521 f521Var;
        y8r0 y8r0Var;
        f521 f521Var2;
        f521 f521Var3;
        ButtonAction buttonAction;
        dk10 dk10Var;
        ?? r26;
        g4u0 g4u0Var;
        eo10 eo10Var;
        ?? r25;
        yn11 yn11Var;
        List list2;
        Integer num;
        o0v0 o0v0Var;
        o0v0 o0v0Var2;
        o0v0 o0v0Var3;
        ls lsVar;
        o0v0 o0v0Var4;
        o0v0 o0v0Var5;
        SubscriptionStatusDto subscriptionStatusDto2;
        e841 e841Var;
        tse tseVar = (tse) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        f521 f521Var4 = null;
        if (i == 0) {
            kotlin.b.b(obj);
            tje.N(tseVar, null, null, new AnonymousClass1(this.this$0, null), 3);
            cmt<dsp0> a2 = this.this$0.p.a(this.$param, this.$visibilityMode);
            weu weuVar = new weu(27, this.this$0);
            this.L$0 = null;
            this.label = 1;
            a = ru.yandex.taxi.network.api.a.a(a2, weuVar, this);
            if (a == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
            a = obj;
        }
        dsp0 dsp0Var = (dsp0) a;
        l4u0 l4u0Var = dsp0Var.b;
        if (l4u0Var == null) {
            ny61.r("sdkState.state");
            return null;
        }
        if (l4u0Var.a == null) {
            ny61.r("sdkState.state.wallets");
            return null;
        }
        if (l4u0Var.b == null) {
            ny61.r("sdkState.state.subscription");
            return null;
        }
        if (l4u0Var.c == null) {
            ny61.r("sdkState.state.settings");
            return null;
        }
        if (l4u0Var.d == null) {
            ny61.r("sdkState.state.notifications");
            return null;
        }
        c cVar = this.this$0;
        EmptyList emptyList = EmptyList.a;
        ru.yandex.taxi.plus.sdk.existing_screens.c cVar2 = cVar.f;
        ro11 ro11Var = dsp0Var.g;
        if (ro11Var == null || (list = ro11Var.b) == null) {
            list = emptyList;
        }
        cVar2.getClass();
        if (!list.isEmpty()) {
            HashMap hashMap = new HashMap(cVar2.b());
            Iterator it = list.iterator();
            while (it.hasNext()) {
                hashMap.remove((String) it.next());
            }
            r0 r0Var = cVar2.b;
            ArrayList arrayList = new ArrayList(hashMap.size());
            for (Map.Entry entry : hashMap.entrySet()) {
                arrayList.add(new imo((String) entry.getKey(), (String) entry.getValue()));
            }
            r0Var.getClass();
            r0Var.m(null, arrayList);
            cVar2.c(hashMap);
        }
        l4u0 l4u0Var2 = dsp0Var.b;
        wk60 wk60Var = l4u0Var2 != null ? l4u0Var2.d : null;
        z1d0 z1d0Var = cVar.b;
        if ((wk60Var != null ? wk60Var.a : null) != null) {
            int i2 = z1d0Var.a.getInt("ru.yandex.taxi.plus.counter.CounterPreferences.FIELD_COUNTER_VALUE", 0);
            Integer num2 = wk60Var.a;
            if (num2 == null || i2 != num2.intValue()) {
                z1d0Var.a.edit().putInt("ru.yandex.taxi.plus.counter.CounterPreferences.FIELD_COUNTER_VALUE", num2.intValue()).apply();
            }
            if (!cVar.g.a.isEmpty()) {
                z1d0Var.a.edit().putInt("ru.yandex.taxi.plus.counter.CounterPreferences.FIELD_LAST_OPENED_VALUE", num2.intValue()).apply();
            }
        }
        ntq0 ntq0Var = dsp0Var.h;
        Calendar b = cVar.i.b(ntq0Var != null ? ntq0Var.getA() : null);
        cVar.h.a.edit().putLong("time_delta", b != null ? b.getTimeInMillis() - Calendar.getInstance().getTimeInMillis() : 0L).apply();
        aqp0 aqp0Var = cVar.j;
        ro11 ro11Var2 = dsp0Var.g;
        if (ro11Var2 == null) {
            ro11.Companion.getClass();
            ro11Var2 = ro11.d;
        }
        aqp0Var.a.l(ro11Var2);
        aqp0 aqp0Var2 = cVar.j;
        e0 e0Var = dsp0Var.c;
        if (e0Var == null) {
            e0.Companion.getClass();
            e0Var = e0.f;
        }
        aqp0Var2.c.l(e0Var);
        l4u0 l4u0Var3 = dsp0Var.b;
        if (l4u0Var3 != null) {
            List list3 = l4u0Var3.a;
            String str = (list3 == null || (e841Var = (e841) kotlin.collections.a.R(list3)) == null) ? null : e841Var.c;
            o0v0 o0v0Var6 = l4u0Var3.b;
            if (o0v0Var6 == null || (subscriptionStatusDto2 = o0v0Var6.b) == null) {
                subscriptionStatusDto2 = SubscriptionStatusDto.UNRECOGNIZED;
            }
            dkd0Var = new dkd0(str, subscriptionStatusDto2);
        } else {
            dkd0Var = dkd0.c;
        }
        cVar.k.a.l(dkd0Var);
        rqd0 rqd0Var = cVar.o;
        qqd0 qqd0Var = new qqd0(dkd0Var.a, dkd0Var.b == SubscriptionStatusDto.ACTIVE);
        r0 r0Var2 = rqd0Var.a;
        r0Var2.getClass();
        r0Var2.m(null, qqd0Var);
        aqp0 aqp0Var3 = cVar.j;
        l4u0 l4u0Var4 = dsp0Var.b;
        if (l4u0Var4 != null) {
            List list4 = l4u0Var4.f;
            if (list4 != null) {
                List<bfy0> list5 = list4;
                int d = gw00.d(tcc.n(list5, 10));
                if (d < 16) {
                    d = 16;
                }
                map = new LinkedHashMap(d);
                for (bfy0 bfy0Var : list5) {
                    Pair pair = new Pair(bfy0Var.getA(), bfy0Var.getB());
                    map.put(pair.c(), pair.f());
                }
            } else {
                map = kotlin.collections.b.f();
            }
        } else {
            map = null;
        }
        if (map == null) {
            map = kotlin.collections.b.f();
        }
        r0 r0Var3 = aqp0Var3.e;
        r0Var3.getClass();
        r0Var3.m(null, map);
        l4u0 l4u0Var5 = dsp0Var.b;
        UpgradeStatus upgradeStatus = (l4u0Var5 == null || (o0v0Var5 = l4u0Var5.b) == null) ? false : o0v0Var5.c ? UpgradeStatus.UPGRADE_AVAILABLE : UpgradeStatus.UPGRADE_UNAVAILABLE;
        if (l4u0Var5 == null || (o0v0Var4 = l4u0Var5.b) == null || (subscriptionStatusDto = o0v0Var4.b) == null) {
            subscriptionStatusDto = SubscriptionStatusDto.UNRECOGNIZED;
        }
        int i3 = xjd0.a[subscriptionStatusDto.ordinal()];
        if (i3 == 1) {
            purchaseStatus = PurchaseStatus.PURCHASE_AVAILABLE;
        } else if (i3 == 2) {
            purchaseStatus = PurchaseStatus.IN_PROGRESS;
        } else if (i3 == 3) {
            purchaseStatus = PurchaseStatus.PURCHASED;
        } else if (i3 == 4) {
            purchaseStatus = PurchaseStatus.PURCHASE_UNAVAILABLE;
        } else {
            if (i3 != 5) {
                w511.b();
                return null;
            }
            purchaseStatus = PurchaseStatus.NETWORK_OR_SERVER_ERROR;
        }
        PurchaseStatus purchaseStatus2 = purchaseStatus;
        k7r0 k7r0Var = cVar.c;
        l4u0 l4u0Var6 = dsp0Var.b;
        u7r0 u7r0Var = l4u0Var6 != null ? l4u0Var6.c : null;
        k7r0Var.getClass();
        if (u7r0Var == null) {
            y8r0Var = y8r0.b;
            f521Var = null;
        } else {
            List<q5r0> list6 = u7r0Var.a;
            ArrayList arrayList2 = new ArrayList();
            for (q5r0 q5r0Var : list6) {
                if (q5r0Var == null) {
                    f521Var3 = f521Var4;
                    f521Var2 = f521Var3;
                } else {
                    if (q5r0Var.getD()) {
                        r5d0 r5d0Var = k7r0Var.a;
                        String a3 = q5r0Var.getA();
                        if (a3 == null) {
                            a3 = "";
                        }
                        r5d0Var.getClass();
                        if (!"composite_payment.enabled".equals(a3)) {
                            f521Var3 = new f521();
                            f521Var2 = f521Var4;
                        }
                    }
                    if (q5r0Var instanceof ea6) {
                        ea6 ea6Var = (ea6) q5r0Var;
                        f521Var2 = f521Var4;
                        f521Var3 = new aa6(ea6Var.a, ea6Var.b, ea6Var.c, ea6Var.d, ea6Var.e);
                    } else {
                        f521Var2 = f521Var4;
                        f521Var3 = new f521();
                    }
                }
                if (f521Var3 != null) {
                    arrayList2.add(f521Var3);
                }
                f521Var4 = f521Var2;
            }
            f521Var = f521Var4;
            y8r0Var = new y8r0(arrayList2);
        }
        acr0 acr0Var = cVar.d;
        acr0Var.getClass();
        List<l5r0> list7 = y8r0Var.a;
        ArrayList arrayList3 = new ArrayList(tcc.n(list7, 10));
        for (l5r0 l5r0Var : list7) {
            r5d0 r5d0Var2 = acr0Var.a;
            if (l5r0Var instanceof aa6) {
                aa6 aa6Var = (aa6) l5r0Var;
                String str2 = aa6Var.a;
                boolean z = aa6Var.e;
                boolean z2 = aa6Var.c;
                if (str2 != null && str2.length() != 0 && aa6Var.d) {
                    z = r5d0Var2.b(str2);
                    z2 = r5d0Var2.a(str2);
                }
                l5r0Var = new aa6(aa6Var.a, aa6Var.b, z2, aa6Var.d, z);
            }
            arrayList3.add(l5r0Var);
        }
        y8r0 y8r0Var2 = new y8r0(arrayList3);
        ok10 ok10Var = dsp0Var.a;
        if (ok10Var == null || (lsVar = ok10Var.a) == null || (buttonAction = lsVar.c) == null) {
            buttonAction = ButtonAction.UNSUPPORTED;
        }
        ButtonAction buttonAction2 = buttonAction;
        l4u0 l4u0Var7 = dsp0Var.b;
        l0v0 l0v0Var = new l0v0(buttonAction2, (l4u0Var7 == null || (o0v0Var3 = l4u0Var7.b) == null) ? f521Var : o0v0Var3.a, purchaseStatus2, upgradeStatus, (l4u0Var7 == null || (o0v0Var2 = l4u0Var7.b) == null) ? f521Var : o0v0Var2.d, (l4u0Var7 == null || (o0v0Var = l4u0Var7.b) == null) ? f521Var : o0v0Var.e);
        ?? r4 = l4u0Var7 != null ? l4u0Var7.d : f521Var;
        fze fzeVar = new fze((r4 == 0 || (num = r4.a) == null) ? cVar.b.a.getInt("ru.yandex.taxi.plus.counter.CounterPreferences.FIELD_COUNTER_VALUE", 0) : num.intValue(), cVar.g.a.isEmpty());
        ok10 ok10Var2 = dsp0Var.a;
        if (ok10Var2 != null) {
            ls lsVar2 = ok10Var2.a;
            ?? r8 = lsVar2 != null ? lsVar2.a : f521Var;
            ?? r9 = lsVar2 != null ? lsVar2.b : f521Var;
            if (lsVar2 == null || (list2 = lsVar2.d) == null) {
                list2 = emptyList;
            }
            dk10Var = new dk10(r8, r9, list2, ok10Var2.b);
        } else {
            znp0 znp0Var = cVar.a.a;
            dk10Var = znp0Var != null ? znp0Var.a : dk10.e;
        }
        dk10 dk10Var2 = dk10Var;
        l4u0 l4u0Var8 = dsp0Var.b;
        if (l4u0Var8 != null) {
            ?? r6 = l4u0Var8.a;
            g4u0Var = new g4u0(r6 == 0 ? emptyList : r6, l4u0Var8.b, l4u0Var8.c, l4u0Var8.d, l4u0Var8.e);
        } else {
            znp0 znp0Var2 = cVar.a.a;
            if (znp0Var2 == null) {
                r26 = f521Var;
                fo10 fo10Var = cVar.e;
                uyi uyiVar = fo10Var.b;
                fo10Var.a.a.getClass();
                eo10Var = dsp0Var.e;
                if (eo10Var != null) {
                    boolean z3 = eo10Var.b;
                    String str3 = eo10Var.a;
                    if (dsp0Var.d == MenuType.WEB_VIEW && str3 != null && str3.length() != 0) {
                        r25 = new bo10(str3, z3 ? (String) uyiVar.get() : f521Var, z3);
                        yn11Var = dsp0Var.f;
                        znp0 znp0Var3 = new znp0(dk10Var2, r25, r26, l0v0Var, y8r0Var2, fzeVar, yn11Var);
                        cVar.a.c(znp0Var3);
                        ru.yandex.taxi.plus.sdk.cache.c cVar3 = cVar.a;
                        if (yn11Var != null) {
                        }
                        cVar3.getClass();
                        cVar.a.b = yn11Var != null ? (vhu) yn11Var.a(vhu.class) : f521Var;
                        return znp0Var3;
                    }
                }
                r25 = f521Var;
                yn11Var = dsp0Var.f;
                znp0 znp0Var32 = new znp0(dk10Var2, r25, r26, l0v0Var, y8r0Var2, fzeVar, yn11Var);
                cVar.a.c(znp0Var32);
                ru.yandex.taxi.plus.sdk.cache.c cVar32 = cVar.a;
                if (yn11Var != null) {
                }
                cVar32.getClass();
                cVar.a.b = yn11Var != null ? (vhu) yn11Var.a(vhu.class) : f521Var;
                return znp0Var32;
            }
            g4u0Var = znp0Var2.c;
        }
        r26 = g4u0Var;
        fo10 fo10Var2 = cVar.e;
        uyi uyiVar2 = fo10Var2.b;
        fo10Var2.a.a.getClass();
        eo10Var = dsp0Var.e;
        if (eo10Var != null) {
        }
        r25 = f521Var;
        yn11Var = dsp0Var.f;
        znp0 znp0Var322 = new znp0(dk10Var2, r25, r26, l0v0Var, y8r0Var2, fzeVar, yn11Var);
        cVar.a.c(znp0Var322);
        ru.yandex.taxi.plus.sdk.cache.c cVar322 = cVar.a;
        if (yn11Var != null) {
        }
        cVar322.getClass();
        cVar.a.b = yn11Var != null ? (vhu) yn11Var.a(vhu.class) : f521Var;
        return znp0Var322;
    }
}
