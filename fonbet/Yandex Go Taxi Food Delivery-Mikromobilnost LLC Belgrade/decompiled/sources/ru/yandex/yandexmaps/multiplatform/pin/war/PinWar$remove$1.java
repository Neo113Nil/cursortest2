package ru.yandex.yandexmaps.multiplatform.pin.war;

import defpackage.mvg;
import defpackage.mwb0;
import defpackage.ny61;
import defpackage.tls;
import defpackage.wrr;
import defpackage.wub0;
import defpackage.zy11;
import java.util.Collection;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.yandex.yandexmaps.multiplatform.pin.war.callback.PinInvalidationReason;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lzy11;", "<anonymous>", "()V"}, k = 3, mv = {2, 2, 0})
@mvg(c = "ru.yandex.yandexmaps.multiplatform.pin.war.PinWar$remove$1", f = "PinWar.kt", l = {HProv.PP_NK_SYNC}, m = "invokeSuspend", v = 1)
/* loaded from: classes7.dex */
final class PinWar$remove$1 extends SuspendLambda implements tls {
    final /* synthetic */ Collection<mwb0> $ids;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PinWar$remove$1(b bVar, Collection collection, Continuation continuation) {
        super(1, continuation);
        this.this$0 = bVar;
        this.$ids = collection;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new PinWar$remove$1(this.this$0, this.$ids, continuation);
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        return ((PinWar$remove$1) create((Continuation) obj)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            wrr wrrVar = this.this$0.f;
            Collection<mwb0> collection = this.$ids;
            wrrVar.getClass();
            for (mwb0 mwb0Var : collection) {
                ((wub0) wrrVar.z).b(mwb0Var, mwb0Var);
                ((wub0) wrrVar.A).b(mwb0Var, mwb0Var);
            }
            b bVar = this.this$0;
            PinInvalidationReason pinInvalidationReason = PinInvalidationReason.REMOVE;
            this.label = 1;
            if (bVar.r(true, pinInvalidationReason, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        if (((wub0) this.this$0.f.b).b.isEmpty()) {
            b.a(this.this$0);
        }
        return zy11.a;
    }
}
