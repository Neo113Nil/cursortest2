package ru.yandex.taxi.surge.interactor;

import android.graphics.drawable.Drawable;
import com.yandex.go.design.compose.colors.AppColor$Palette;
import com.yandex.go.zone.dto.objects.ServiceLevelWidget$SurgeBalance;
import com.yandex.go.zone.dto.objects.SurgeBalanceContent;
import defpackage.drv0;
import defpackage.dse;
import defpackage.ev4;
import defpackage.hlx0;
import defpackage.mja1;
import defpackage.mvg;
import defpackage.n4v;
import defpackage.noh;
import defpackage.ny61;
import defpackage.orv0;
import defpackage.ovi0;
import defpackage.q5z;
import defpackage.qje;
import defpackage.qoh;
import defpackage.tcc;
import defpackage.tje;
import defpackage.trv0;
import defpackage.tse;
import defpackage.wls;
import defpackage.wp2;
import defpackage.xng0;
import defpackage.y6i0;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lorv0;", "<anonymous>", "(Ltse;)Lorv0;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.surge.interactor.SummaryWidgetStateInteractor$mapBalanceContent$2", f = "SummaryWidgetStateInteractor.kt", l = {154, HProv.PP_HANDLE_COUNT, 164, 165, HProv.PP_EXPORT_CSP}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class SummaryWidgetStateInteractor$mapBalanceContent$2 extends SuspendLambda implements wls {
    final /* synthetic */ ServiceLevelWidget$SurgeBalance $balance;
    float F$0;
    int I$0;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$10;
    Object L$11;
    Object L$12;
    Object L$13;
    Object L$14;
    Object L$15;
    Object L$16;
    Object L$17;
    Object L$18;
    Object L$19;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    Object L$7;
    Object L$8;
    Object L$9;
    int label;
    final /* synthetic */ trv0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SummaryWidgetStateInteractor$mapBalanceContent$2(trv0 trv0Var, ServiceLevelWidget$SurgeBalance serviceLevelWidget$SurgeBalance, Continuation continuation) {
        super(2, continuation);
        this.$balance = serviceLevelWidget$SurgeBalance;
        this.this$0 = trv0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        SummaryWidgetStateInteractor$mapBalanceContent$2 summaryWidgetStateInteractor$mapBalanceContent$2 = new SummaryWidgetStateInteractor$mapBalanceContent$2(this.this$0, this.$balance, continuation);
        summaryWidgetStateInteractor$mapBalanceContent$2.L$0 = obj;
        return summaryWidgetStateInteractor$mapBalanceContent$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((SummaryWidgetStateInteractor$mapBalanceContent$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x02ad, code lost:
    
        if (r1 == r2) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0254, code lost:
    
        if (r4 == r2) goto L57;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0278  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x02b9  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0222  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0260  */
    /* JADX WARN: Type inference failed for: r6v16, types: [noh] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x02ad -> B:16:0x02b1). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:41:0x0254 -> B:36:0x0258). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object h;
        Object s;
        dse dseVar;
        noh nohVar;
        qoh qohVar;
        n4v n4vVar;
        Object k;
        Collection collection;
        List list;
        noh nohVar2;
        String str;
        List list2;
        List list3;
        n4v n4vVar2;
        noh nohVar3;
        List list4;
        Drawable drawable;
        Iterator it;
        Collection collection2;
        String str2;
        Drawable drawable2;
        Iterator it2;
        List list5;
        String str3;
        Collection collection3;
        List list6;
        Object k2;
        float f;
        String str4;
        Drawable drawable3;
        wp2 wp2Var;
        ovi0 ovi0Var;
        int i;
        tse tseVar = (tse) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = this.label;
        if (i2 == 0) {
            kotlin.b.b(obj);
            h = tje.h(tseVar, null, null, new SummaryWidgetStateInteractor$mapBalanceContent$2$leadIcon$1(this.this$0, this.$balance, null), 3);
            dse h2 = tje.h(tseVar, null, null, new SummaryWidgetStateInteractor$mapBalanceContent$2$trailIcon$1(this.this$0, this.$balance, null), 3);
            qoh h3 = tje.h(tseVar, null, null, new SummaryWidgetStateInteractor$mapBalanceContent$2$valueIcon$1(this.this$0, this.$balance, null), 3);
            qoh h4 = tje.h(tseVar, null, null, new SummaryWidgetStateInteractor$mapBalanceContent$2$widgetBackground$1(this.this$0, null), 3);
            this.L$0 = tseVar;
            this.L$1 = h;
            this.L$2 = h2;
            this.L$3 = h3;
            this.L$4 = h4;
            this.label = 1;
            s = h3.s(this);
            if (s != coroutineSingletons) {
                dseVar = h2;
                nohVar = h4;
                qohVar = h3;
            }
            return coroutineSingletons;
        }
        if (i2 == 1) {
            nohVar = (noh) this.L$4;
            ?? r6 = (noh) this.L$3;
            dse dseVar2 = (noh) this.L$2;
            h = (noh) this.L$1;
            kotlin.b.b(obj);
            qohVar = r6;
            dseVar = dseVar2;
            s = obj;
        } else if (i2 == 2) {
            list = (List) this.L$9;
            Collection collection4 = (List) this.L$8;
            str = (String) this.L$7;
            list2 = (List) this.L$6;
            n4vVar = (n4v) this.L$5;
            nohVar2 = (noh) this.L$3;
            kotlin.b.b(obj);
            collection = collection4;
            k = obj;
            ArrayList arrayList = new ArrayList();
            list3 = list2;
            n4vVar2 = n4vVar;
            nohVar3 = nohVar2;
            list4 = list;
            drawable = (Drawable) k;
            it = collection.iterator();
            collection2 = arrayList;
            str2 = str;
            if (!it.hasNext()) {
            }
        } else {
            if (i2 != 3) {
                if (i2 != 4) {
                    if (i2 != 5) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    int i3 = this.I$0;
                    float f2 = this.F$0;
                    list6 = (List) this.L$14;
                    list5 = (List) this.L$13;
                    Drawable drawable4 = (Drawable) this.L$12;
                    wp2 wp2Var2 = (wp2) this.L$11;
                    ovi0 ovi0Var2 = (ovi0) this.L$10;
                    String str5 = (String) this.L$7;
                    List list7 = (List) this.L$6;
                    kotlin.b.b(obj);
                    k2 = obj;
                    drawable3 = drawable4;
                    wp2Var = wp2Var2;
                    ovi0Var = ovi0Var2;
                    list3 = list7;
                    i = i3;
                    str4 = str5;
                    f = f2;
                    hlx0 hlx0Var = new hlx0(drawable3, list5, list6, new ev4(wp2Var, ovi0Var, i, f, (n4v) k2), String.valueOf(qje.t(xng0.bgMain, this.this$0.f)), 12);
                    String a = trv0.a(this.this$0, this.$balance.b);
                    ServiceLevelWidget$SurgeBalance serviceLevelWidget$SurgeBalance = this.$balance;
                    return new orv0(hlx0Var, a, serviceLevelWidget$SurgeBalance.b.c, new drv0(str4, y6i0.d(serviceLevelWidget$SurgeBalance.a.b.e, 0, 100), list3), null);
                }
                List list8 = (List) this.L$19;
                Drawable drawable5 = (Drawable) this.L$18;
                it2 = (Iterator) this.L$14;
                collection3 = (Collection) this.L$12;
                str3 = (String) this.L$7;
                List list9 = (List) this.L$6;
                n4v n4vVar3 = (n4v) this.L$5;
                noh nohVar4 = (noh) this.L$3;
                kotlin.b.b(obj);
                drawable2 = drawable5;
                list5 = list8;
                nohVar3 = nohVar4;
                Object k3 = obj;
                n4vVar2 = n4vVar3;
                list3 = list9;
                n4v n4vVar4 = (n4v) k3;
                if (n4vVar4 != null) {
                    collection3.add(n4vVar4);
                }
                if (it2.hasNext()) {
                    list6 = (List) collection3;
                    float d = y6i0.d(this.$balance.a.b.e, 0, 100) / 100.0f;
                    ovi0 a2 = n4vVar2 != null ? mja1.a(n4vVar2.b, null, 6) : null;
                    wp2 a3 = this.this$0.h.a(str3, AppColor$Palette.ControlMinor);
                    Integer S = q5z.S(str3);
                    int intValue = S != null ? S.intValue() : qje.t(xng0.controlMinor, this.this$0.f);
                    this.L$0 = null;
                    this.L$1 = null;
                    this.L$2 = null;
                    this.L$3 = null;
                    this.L$4 = null;
                    this.L$5 = null;
                    this.L$6 = list3;
                    this.L$7 = str3;
                    this.L$8 = null;
                    this.L$9 = null;
                    this.L$10 = a2;
                    this.L$11 = a3;
                    this.L$12 = drawable2;
                    this.L$13 = list5;
                    this.L$14 = list6;
                    this.L$15 = null;
                    this.L$16 = null;
                    this.L$17 = null;
                    this.L$18 = null;
                    this.L$19 = null;
                    this.F$0 = d;
                    this.I$0 = intValue;
                    this.label = 5;
                    k2 = nohVar3.k(this);
                    if (k2 != coroutineSingletons) {
                        String str6 = str3;
                        f = d;
                        str4 = str6;
                        drawable3 = drawable2;
                        wp2Var = a3;
                        ovi0Var = a2;
                        i = intValue;
                        hlx0 hlx0Var2 = new hlx0(drawable3, list5, list6, new ev4(wp2Var, ovi0Var, i, f, (n4v) k2), String.valueOf(qje.t(xng0.bgMain, this.this$0.f)), 12);
                        String a4 = trv0.a(this.this$0, this.$balance.b);
                        ServiceLevelWidget$SurgeBalance serviceLevelWidget$SurgeBalance2 = this.$balance;
                        return new orv0(hlx0Var2, a4, serviceLevelWidget$SurgeBalance2.b.c, new drv0(str4, y6i0.d(serviceLevelWidget$SurgeBalance2.a.b.e, 0, 100), list3), null);
                    }
                } else {
                    noh nohVar5 = (noh) it2.next();
                    this.L$0 = null;
                    this.L$1 = null;
                    this.L$2 = null;
                    this.L$3 = nohVar3;
                    this.L$4 = null;
                    this.L$5 = n4vVar2;
                    this.L$6 = list3;
                    this.L$7 = str3;
                    this.L$8 = null;
                    this.L$9 = null;
                    this.L$10 = null;
                    this.L$11 = null;
                    this.L$12 = collection3;
                    this.L$13 = null;
                    this.L$14 = it2;
                    this.L$15 = null;
                    this.L$16 = null;
                    this.L$17 = null;
                    this.L$18 = drawable2;
                    this.L$19 = list5;
                    this.label = 4;
                    k3 = nohVar5.k(this);
                }
                return coroutineSingletons;
            }
            drawable = (Drawable) this.L$18;
            it = (Iterator) this.L$14;
            collection2 = (Collection) this.L$12;
            list4 = (List) this.L$9;
            str2 = (String) this.L$7;
            list3 = (List) this.L$6;
            n4vVar2 = (n4v) this.L$5;
            nohVar3 = (noh) this.L$3;
            kotlin.b.b(obj);
            Object k4 = obj;
            n4v n4vVar5 = (n4v) k4;
            if (n4vVar5 != null) {
                collection2.add(n4vVar5);
            }
            if (!it.hasNext()) {
                ArrayList arrayList2 = new ArrayList();
                drawable2 = drawable;
                it2 = list4.iterator();
                list5 = (List) collection2;
                str3 = str2;
                collection3 = arrayList2;
                if (it2.hasNext()) {
                }
                return coroutineSingletons;
            }
            noh nohVar6 = (noh) it.next();
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = null;
            this.L$3 = nohVar3;
            this.L$4 = null;
            this.L$5 = n4vVar2;
            this.L$6 = list3;
            this.L$7 = str2;
            this.L$8 = null;
            this.L$9 = list4;
            this.L$10 = null;
            this.L$11 = null;
            this.L$12 = collection2;
            this.L$13 = null;
            this.L$14 = it;
            this.L$15 = null;
            this.L$16 = null;
            this.L$17 = null;
            this.L$18 = drawable;
            this.label = 3;
            k4 = nohVar6.k(this);
        }
        n4vVar = (n4v) s;
        SurgeBalanceContent surgeBalanceContent = this.$balance.a;
        List list10 = surgeBalanceContent.a;
        String str7 = surgeBalanceContent.b.d;
        List list11 = list10;
        trv0 trv0Var = this.this$0;
        ArrayList arrayList3 = new ArrayList(tcc.n(list11, 10));
        for (Iterator it3 = list11.iterator(); it3.hasNext(); it3 = it3) {
            arrayList3.add(tje.h(tseVar, null, null, new SummaryWidgetStateInteractor$mapBalanceContent$2$leadIcons$1$1(trv0Var, (String) it3.next(), null), 3));
        }
        Collection o0 = kotlin.collections.a.o0(arrayList3, h);
        List singletonList = Collections.singletonList(dseVar);
        this.L$0 = null;
        this.L$1 = null;
        this.L$2 = null;
        this.L$3 = qohVar;
        this.L$4 = null;
        this.L$5 = n4vVar;
        this.L$6 = list10;
        this.L$7 = str7;
        this.L$8 = o0;
        this.L$9 = singletonList;
        this.label = 2;
        k = nohVar.k(this);
        if (k != coroutineSingletons) {
            collection = o0;
            list = singletonList;
            nohVar2 = qohVar;
            str = str7;
            list2 = list10;
            ArrayList arrayList4 = new ArrayList();
            list3 = list2;
            n4vVar2 = n4vVar;
            nohVar3 = nohVar2;
            list4 = list;
            drawable = (Drawable) k;
            it = collection.iterator();
            collection2 = arrayList4;
            str2 = str;
            if (!it.hasNext()) {
            }
        }
        return coroutineSingletons;
    }
}
