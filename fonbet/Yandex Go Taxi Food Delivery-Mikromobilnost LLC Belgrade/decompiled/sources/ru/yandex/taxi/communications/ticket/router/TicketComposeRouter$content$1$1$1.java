package ru.yandex.taxi.communications.ticket.router;

import defpackage.a2z0;
import defpackage.agd;
import defpackage.cay0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.o2z0;
import defpackage.q3z0;
import defpackage.s2z0;
import defpackage.tse;
import defpackage.wls;
import defpackage.yfd;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.communications.ticket.router.TicketComposeRouter$content$1$1$1", f = "TicketComposeRouter.kt", l = {HProv.ALG_SID_SHA3_384}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
final class TicketComposeRouter$content$1$1$1 extends SuspendLambda implements wls {
    final /* synthetic */ q3z0 $action;
    final /* synthetic */ s2z0 $navigator;
    final /* synthetic */ yfd $this_buildContent;
    int label;
    final /* synthetic */ a2z0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TicketComposeRouter$content$1$1$1(a2z0 a2z0Var, q3z0 q3z0Var, s2z0 s2z0Var, yfd yfdVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = a2z0Var;
        this.$action = q3z0Var;
        this.$navigator = s2z0Var;
        this.$this_buildContent = yfdVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new TicketComposeRouter$content$1$1$1(this.this$0, this.$action, this.$navigator, this.$this_buildContent, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((TicketComposeRouter$content$1$1$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            a2z0 a2z0Var = this.this$0;
            ru.yandex.taxi.communications.ticket.domain.a aVar = a2z0Var.R;
            q3z0 q3z0Var = this.$action;
            s2z0 s2z0Var = this.$navigator;
            o2z0 o2z0Var = (o2z0) ((agd) this.$this_buildContent).a;
            String b = ((cay0) a2z0Var.L).b();
            this.label = 1;
            if (aVar.a(q3z0Var, s2z0Var, o2z0Var, b, this) == coroutineSingletons) {
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
