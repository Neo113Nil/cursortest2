package ru.yandex.taxi.linked_order.provider;

import defpackage.hc00;
import defpackage.ic00;
import defpackage.jc00;
import defpackage.jqr;
import defpackage.kc00;
import defpackage.nly;
import defpackage.ny61;
import defpackage.ply;
import defpackage.qoy;
import defpackage.s10;
import defpackage.sly;
import defpackage.sny;
import defpackage.tly;
import defpackage.y7u;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.o;

/* loaded from: classes9.dex */
public final class d {
    public final s10 a;
    public final qoy b;
    public final y7u c;
    public final jc00 d;
    public final e e;

    public d(s10 s10Var, qoy qoyVar, y7u y7uVar, jc00 jc00Var, e eVar) {
        this.a = s10Var;
        this.b = qoyVar;
        this.c = y7uVar;
        this.d = jc00Var;
        this.e = eVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0074, code lost:
    
        if (((java.lang.Boolean) r7).booleanValue() != false) goto L34;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(d dVar, sly slyVar, ContinuationImpl continuationImpl) {
        ActiveLinkedOrderRepository$showUntilOrderDeactivated$1 activeLinkedOrderRepository$showUntilOrderDeactivated$1;
        int i;
        sny e;
        dVar.getClass();
        if (continuationImpl instanceof ActiveLinkedOrderRepository$showUntilOrderDeactivated$1) {
            activeLinkedOrderRepository$showUntilOrderDeactivated$1 = (ActiveLinkedOrderRepository$showUntilOrderDeactivated$1) continuationImpl;
            int i2 = activeLinkedOrderRepository$showUntilOrderDeactivated$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                activeLinkedOrderRepository$showUntilOrderDeactivated$1.label = i2 - Integer.MIN_VALUE;
                Object obj = activeLinkedOrderRepository$showUntilOrderDeactivated$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = activeLinkedOrderRepository$showUntilOrderDeactivated$1.label;
                boolean z = true;
                if (i != 0) {
                    kotlin.b.b(obj);
                    ic00 ic00Var = ((kc00) dVar.d).a;
                    ic00Var.getClass();
                    if ((ic00Var instanceof hc00) && ((slyVar instanceof nly) || (slyVar instanceof ply))) {
                        e eVar = dVar.e;
                        tly a = slyVar.a();
                        String str = (a == null || (e = a.e()) == null) ? null : e.a;
                        if (str == null) {
                            str = "";
                        }
                        activeLinkedOrderRepository$showUntilOrderDeactivated$1.L$0 = null;
                        activeLinkedOrderRepository$showUntilOrderDeactivated$1.label = 1;
                        obj = eVar.c(str, activeLinkedOrderRepository$showUntilOrderDeactivated$1);
                        if (obj == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    }
                    z = false;
                    return Boolean.valueOf(z);
                }
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
            }
        }
        activeLinkedOrderRepository$showUntilOrderDeactivated$1 = new ActiveLinkedOrderRepository$showUntilOrderDeactivated$1(dVar, continuationImpl);
        Object obj2 = activeLinkedOrderRepository$showUntilOrderDeactivated$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = activeLinkedOrderRepository$showUntilOrderDeactivated$1.label;
        boolean z2 = true;
        if (i != 0) {
        }
    }

    public final o b() {
        return new o(new jqr(new b(kotlinx.coroutines.flow.e.X(kotlinx.coroutines.flow.e.t(this.a.a), new ActiveLinkedOrderRepository$activeOrdersFlow$$inlined$flatMapLatest$1(null, this)), this), new ActiveLinkedOrderRepository$activeOrdersFlow$3(null, this), 3), new ActiveLinkedOrderRepository$activeOrdersFlow$4(3, null));
    }
}
