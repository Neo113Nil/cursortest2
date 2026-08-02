package ru.yandex.taxi.discovery;

import defpackage.ah00;
import defpackage.apf;
import defpackage.avj0;
import defpackage.azf;
import defpackage.byx;
import defpackage.cyx;
import defpackage.gh00;
import defpackage.l9;
import defpackage.lcw;
import defpackage.msj;
import defpackage.mvg;
import defpackage.mwj;
import defpackage.n3w;
import defpackage.ny61;
import defpackage.rs0;
import defpackage.sw80;
import defpackage.swj;
import defpackage.sy60;
import defpackage.tje;
import defpackage.tse;
import defpackage.w030;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.widget.ModalView;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.discovery.DiscoveryRouterImpl$launch$launchJob$1", f = "DiscoveryRouterImpl.kt", l = {49}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
final class DiscoveryRouterImpl$launch$launchJob$1 extends SuspendLambda implements wls {
    final /* synthetic */ mwj $discoveryParams;
    final /* synthetic */ sy60 $onInsideExitListener;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DiscoveryRouterImpl$launch$launchJob$1(b bVar, mwj mwjVar, sy60 sy60Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = bVar;
        this.$discoveryParams = mwjVar;
        this.$onInsideExitListener = sy60Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new DiscoveryRouterImpl$launch$launchJob$1(this.this$0, this.$discoveryParams, this.$onInsideExitListener, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((DiscoveryRouterImpl$launch$launchJob$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            ru.yandex.taxi.layers.b bVar = this.this$0.B;
            this.label = 1;
            if (bVar.a(this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        mwj mwjVar = this.$discoveryParams;
        sw80 sw80Var = mwjVar.d;
        byx byxVar = mwjVar.c;
        b bVar2 = this.this$0;
        sy60 sy60Var = this.$onInsideExitListener;
        sw80Var.getClass();
        swj swjVar = sw80Var.b;
        msj msjVar = (msj) bVar2.x.get();
        w030 w030Var = bVar2.z;
        lcw lcwVar = bVar2.C;
        if (lcwVar == null) {
            ny61.g("Required value was null.");
            return null;
        }
        ru.yandex.taxi.layers.presentation.optimalview.c cVar = (ru.yandex.taxi.layers.presentation.optimalview.c) lcwVar.get();
        msjVar.getClass();
        w030Var.getClass();
        apf apfVar = new apf();
        apfVar.b = new azf(msjVar, 6);
        n3w.a(mwjVar);
        apfVar.c = new rs0(new azf(msjVar, 5), (azf) apfVar.b, new azf(msjVar, 4), new azf(msjVar, 7), new azf(msjVar, 2), 23);
        apfVar.w = n3w.a(cVar);
        apfVar.x = new azf(msjVar, 1);
        ModalView a = swjVar.a(apfVar);
        a.setDismissOnTouchOutside(false);
        a.setDismissOnBackPressed(false);
        a.setOnBackPressedListener(new l9(bVar2, mwjVar, a, sy60Var, 10));
        bVar2.D = a;
        w030Var.s(a, false);
        bVar2.c.Td(tje.u(24, ((avj0) bVar2.b).a), bVar2);
        ((gh00) ((ah00) bVar2.a.get())).L(null);
        if (byxVar != null) {
            ((cyx) bVar2.y.get()).b(byxVar);
        }
        return zy11.a;
    }
}
