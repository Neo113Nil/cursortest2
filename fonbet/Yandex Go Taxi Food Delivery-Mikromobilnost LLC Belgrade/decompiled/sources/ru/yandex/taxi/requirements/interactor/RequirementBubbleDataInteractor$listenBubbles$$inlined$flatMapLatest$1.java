package ru.yandex.taxi.requirements.interactor;

import defpackage.e9w;
import defpackage.g92;
import defpackage.kdj0;
import defpackage.ldj0;
import defpackage.mth;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.zls;
import defpackage.zy11;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, d2 = {"R", "T", "Lvpr;", "it", "Lzy11;", "<anonymous>"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.requirements.interactor.RequirementBubbleDataInteractor$listenBubbles$$inlined$flatMapLatest$1", f = "RequirementBubbleDataInteractor.kt", l = {189}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
public final class RequirementBubbleDataInteractor$listenBubbles$$inlined$flatMapLatest$1 extends SuspendLambda implements zls {
    final /* synthetic */ String $tariffClass$inlined;
    final /* synthetic */ String $verticalId$inlined;
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ ldj0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RequirementBubbleDataInteractor$listenBubbles$$inlined$flatMapLatest$1(Continuation continuation, ldj0 ldj0Var, String str, String str2) {
        super(3, continuation);
        this.this$0 = ldj0Var;
        this.$tariffClass$inlined = str;
        this.$verticalId$inlined = str2;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        RequirementBubbleDataInteractor$listenBubbles$$inlined$flatMapLatest$1 requirementBubbleDataInteractor$listenBubbles$$inlined$flatMapLatest$1 = new RequirementBubbleDataInteractor$listenBubbles$$inlined$flatMapLatest$1((Continuation) obj3, this.this$0, this.$tariffClass$inlined, this.$verticalId$inlined);
        requirementBubbleDataInteractor$listenBubbles$$inlined$flatMapLatest$1.L$0 = (vpr) obj;
        requirementBubbleDataInteractor$listenBubbles$$inlined$flatMapLatest$1.L$1 = obj2;
        return requirementBubbleDataInteractor$listenBubbles$$inlined$flatMapLatest$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i;
        Object obj2;
        tpr tVar;
        vpr vprVar = (vpr) this.L$0;
        Object obj3 = this.L$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = this.label;
        if (i2 == 0) {
            kotlin.b.b(obj);
            ru.yandex.taxi.requirements.models.net.experiment.c cVar = (ru.yandex.taxi.requirements.models.net.experiment.c) obj3;
            ldj0 ldj0Var = this.this$0;
            String str = this.$tariffClass$inlined;
            String str2 = this.$verticalId$inlined;
            ldj0Var.getClass();
            if (cVar.b) {
                i = 1;
                obj2 = null;
                tVar = new t(new b(kotlinx.coroutines.flow.e.X(kotlinx.coroutines.flow.e.t(new r(((com.yandex.go.taxi.tariffs.internal.repository.k) ldj0Var.a).e(), ldj0Var, str2, str)), new RequirementBubbleDataInteractor$listenBubbles$$inlined$flatMapLatest$2(null, ldj0Var, kotlinx.coroutines.flow.e.K((tpr[]) Arrays.copyOf(new tpr[]{new d(new mth(ldj0Var.c.b, 4)), new f(new mth(ldj0Var.d.b, 4)), new h(new mth(ldj0Var.e.b, 4)), new j(new mth(((e9w) ldj0Var.h).d, 4)), new l(new mth(ldj0Var.g.f, 4)), new n(new mth(ldj0Var.i.d, 4)), new p(new mth(ldj0Var.j.b, 4))}, 7)))), str, ldj0Var), cVar, str, ldj0Var, str2);
            } else {
                tVar = new g92(2, kdj0.c);
                i = 1;
                obj2 = null;
            }
            this.L$0 = obj2;
            this.L$1 = obj2;
            this.label = i;
            if (kotlinx.coroutines.flow.e.u(tVar, vprVar, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        return zy11.a;
    }
}
