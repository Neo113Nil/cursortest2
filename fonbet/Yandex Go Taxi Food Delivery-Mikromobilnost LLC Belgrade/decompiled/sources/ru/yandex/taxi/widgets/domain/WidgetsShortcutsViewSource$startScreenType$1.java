package ru.yandex.taxi.widgets.domain;

import defpackage.jst;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.yaf0;
import defpackage.zls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lvpr;", "", "", "it", "Lzy11;", "<anonymous>", "(Lvpr;Ljava/lang/Throwable;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.widgets.domain.WidgetsShortcutsViewSource$startScreenType$1", f = "WidgetsShortcutsViewSource.kt", l = {82}, m = "invokeSuspend", v = 2)
/* loaded from: classes10.dex */
final class WidgetsShortcutsViewSource$startScreenType$1 extends SuspendLambda implements zls {
    final /* synthetic */ yaf0 $screenType;
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;
    final /* synthetic */ m this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WidgetsShortcutsViewSource$startScreenType$1(yaf0 yaf0Var, Continuation continuation, m mVar) {
        super(3, continuation);
        this.$screenType = yaf0Var;
        this.this$0 = mVar;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        WidgetsShortcutsViewSource$startScreenType$1 widgetsShortcutsViewSource$startScreenType$1 = new WidgetsShortcutsViewSource$startScreenType$1(this.$screenType, (Continuation) obj3, this.this$0);
        widgetsShortcutsViewSource$startScreenType$1.L$0 = (vpr) obj;
        widgetsShortcutsViewSource$startScreenType$1.L$1 = (Throwable) obj2;
        return widgetsShortcutsViewSource$startScreenType$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        vpr vprVar = (vpr) this.L$0;
        Throwable th = (Throwable) this.L$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            jst.e.k(th, "Failed to request widgets");
            if (!kotlin.collections.a.G(m.l, this.$screenType.a())) {
                m.j = false;
                tpr b = this.this$0.c.b(this.$screenType);
                this.L$0 = null;
                this.L$1 = null;
                this.label = 1;
                if (kotlinx.coroutines.flow.e.u(b, vprVar, this) == coroutineSingletons) {
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
