package ru.yandex.taxi.widgets.domain;

import defpackage.d4s0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.wls;
import defpackage.yaf0;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lvpr;", "Ld4s0;", "Lzy11;", "<anonymous>", "(Lvpr;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.widgets.domain.WidgetsShortcutsViewSource$startScreenType$listenWidgetsFlow$3", f = "WidgetsShortcutsViewSource.kt", l = {HProv.ALG_SID_GR3410_12_256}, m = "invokeSuspend", v = 2)
/* loaded from: classes10.dex */
final class WidgetsShortcutsViewSource$startScreenType$listenWidgetsFlow$3 extends SuspendLambda implements wls {
    final /* synthetic */ yaf0 $screenType;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ m this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WidgetsShortcutsViewSource$startScreenType$listenWidgetsFlow$3(yaf0 yaf0Var, Continuation continuation, m mVar) {
        super(2, continuation);
        this.$screenType = yaf0Var;
        this.this$0 = mVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        WidgetsShortcutsViewSource$startScreenType$listenWidgetsFlow$3 widgetsShortcutsViewSource$startScreenType$listenWidgetsFlow$3 = new WidgetsShortcutsViewSource$startScreenType$listenWidgetsFlow$3(this.$screenType, continuation, this.this$0);
        widgetsShortcutsViewSource$startScreenType$listenWidgetsFlow$3.L$0 = obj;
        return widgetsShortcutsViewSource$startScreenType$listenWidgetsFlow$3;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((WidgetsShortcutsViewSource$startScreenType$listenWidgetsFlow$3) create((vpr) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        vpr vprVar = (vpr) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            if (!kotlin.collections.a.G(m.l, this.$screenType.a())) {
                d4s0 a = this.this$0.f.a();
                this.L$0 = null;
                this.label = 1;
                if (vprVar.emit(a, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
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
