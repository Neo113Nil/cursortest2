package ru.yandex.taxi.masstransit.geopayment.linkcard;

import defpackage.hn30;
import defpackage.in30;
import defpackage.je30;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.w511;
import defpackage.wls;
import defpackage.yky;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.masstransit.geopayment.checkout.u;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lyky;", "response", "Lzy11;", "<anonymous>", "(Lyky;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.masstransit.geopayment.linkcard.MtLinkCardInteractor$startPolling$1", f = "MtLinkCardInteractor.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class MtLinkCardInteractor$startPolling$1 extends SuspendLambda implements wls {
    final /* synthetic */ in30 $navigator;
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MtLinkCardInteractor$startPolling$1(a aVar, in30 in30Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$navigator = in30Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        MtLinkCardInteractor$startPolling$1 mtLinkCardInteractor$startPolling$1 = new MtLinkCardInteractor$startPolling$1(this.this$0, this.$navigator, continuation);
        mtLinkCardInteractor$startPolling$1.L$0 = obj;
        return mtLinkCardInteractor$startPolling$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        MtLinkCardInteractor$startPolling$1 mtLinkCardInteractor$startPolling$1 = (MtLinkCardInteractor$startPolling$1) create((yky) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        mtLinkCardInteractor$startPolling$1.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        yky ykyVar = (yky) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        int i = hn30.a[ykyVar.a.ordinal()];
        if (i == 1) {
            this.this$0.f();
            this.this$0.c = null;
            ((u) this.$navigator).b();
        } else if (i == 2) {
            this.this$0.f();
            this.this$0.c = null;
            ((u) this.$navigator).a();
        } else if (i == 3) {
            this.this$0.f();
            this.this$0.c = null;
            je30 je30Var = ((u) this.$navigator).a;
            je30Var.S.f(false);
            b bVar = je30Var.W;
            if (bVar != null) {
                bVar.i();
            }
            je30Var.W = null;
        } else if (i != 4) {
            w511.b();
            return null;
        }
        return zy11.a;
    }
}
