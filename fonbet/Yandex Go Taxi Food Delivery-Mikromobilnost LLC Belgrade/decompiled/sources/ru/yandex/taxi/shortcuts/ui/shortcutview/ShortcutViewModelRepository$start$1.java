package ru.yandex.taxi.shortcuts.ui.shortcutview;

import com.yandex.go.shortcuts.view.adapter.model.HeaderService$Type;
import com.yandex.pulse.metrics.SystemProfileProtos$SystemProfileProto;
import defpackage.d4s0;
import defpackage.e6v;
import defpackage.ebu;
import defpackage.gwk0;
import defpackage.h1p;
import defpackage.jbh;
import defpackage.jl40;
import defpackage.jqr;
import defpackage.jst;
import defpackage.mvg;
import defpackage.ndl0;
import defpackage.ny61;
import defpackage.pqv;
import defpackage.rqo;
import defpackage.szv0;
import defpackage.tbu;
import defpackage.tpo0;
import defpackage.tpr;
import defpackage.tse;
import defpackage.uwq0;
import defpackage.wls;
import defpackage.yaf0;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AdaptedFunctionReference;
import kotlinx.coroutines.flow.n0;
import kotlinx.coroutines.flow.o;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.shortcuts.ui.shortcutview.ShortcutViewModelRepository$start$1", f = "ShortcutViewModelRepository.kt", l = {SystemProfileProtos$SystemProfileProto.ComponentId.SODA_DE_DE_VALUE}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class ShortcutViewModelRepository$start$1 extends SuspendLambda implements wls {
    final /* synthetic */ yaf0 $screenType;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ a this$0;

    @Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
    /* renamed from: ru.yandex.taxi.shortcuts.ui.shortcutview.ShortcutViewModelRepository$start$1$2, reason: invalid class name */
    /* loaded from: classes13.dex */
    final /* synthetic */ class AnonymousClass2 extends AdaptedFunctionReference implements wls {
        @Override // defpackage.wls
        public final Object invoke(Object obj, Object obj2) {
            pqv pqvVar = (pqv) this.receiver;
            pqvVar.getClass();
            for (e6v e6vVar : ((d4s0) obj).d) {
                if (e6vVar instanceof ebu) {
                    tbu tbuVar = ((ebu) e6vVar).e;
                    if (tbuVar == HeaderService$Type.TAXI || tbuVar == HeaderService$Type.MASSTRANSIT || tbuVar == HeaderService$Type.DELIVERY || tbuVar == HeaderService$Type.DRIVE) {
                        break;
                    }
                    ndl0 ndl0Var = pqvVar.a;
                    String serviceName = tbuVar.getServiceName();
                    h1p r = gwk0.r(serviceName);
                    uwq0 uwq0Var = null;
                    if (r != null) {
                        rqo rqoVar = (rqo) ndl0Var.b;
                        szv0 szv0Var = szv0.m;
                        szv0 szv0Var2 = (szv0) ((jbh) rqoVar).e(szv0Var).c();
                        if (!jl40.l(szv0Var2, szv0Var)) {
                            szv0Var2.getClass();
                            uwq0Var = szv0Var2.a(r.getValue());
                        }
                    }
                    if (uwq0Var != null) {
                        String str = uwq0Var.e;
                        r0 = !(str == null || str.length() == 0);
                    }
                    if (!r0) {
                        jst.e.n("Shortcuts.Inconsistency.Action.Show:MissedServiceParams[" + serviceName + "]");
                    }
                }
            }
            return zy11.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShortcutViewModelRepository$start$1(a aVar, yaf0 yaf0Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$screenType = yaf0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ShortcutViewModelRepository$start$1(this.this$0, this.$screenType, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ShortcutViewModelRepository$start$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            tpr t = kotlinx.coroutines.flow.e.t(com.yandex.go.coroutines.b.d(this.this$0.c.b(this.$screenType), new ShortcutViewModelRepository$start$1$invokeSuspend$$inlined$start$1(null, this.this$0)));
            a aVar = this.this$0;
            jqr jqrVar = new jqr(t, new AnonymousClass2(2, aVar.d, pqv.class, "reportIfInconsistency", "reportIfInconsistency(Lcom/yandex/go/shortcuts/view/adapter/model/ShortcutsViewModel;)V", 4), 3);
            n0 n0Var = aVar.e;
            o oVar = new o(jqrVar, new ShortcutViewModelRepository$start$1$invokeSuspend$$inlined$safeCollect$1(com.yandex.go.coroutines.b.e(), null));
            tpo0 tpo0Var = new tpo0(14, n0Var);
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = null;
            this.label = 1;
            if (oVar.collect(tpo0Var, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        return zy11.a;
    }
}
