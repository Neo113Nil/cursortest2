package ru.yandex.yandexmaps.multiplatform.pin.war;

import defpackage.mvg;
import defpackage.mwb0;
import defpackage.ny61;
import defpackage.tls;
import defpackage.zy11;
import java.util.Collection;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.MSException;
import ru.yandex.yandexmaps.multiplatform.pin.war.callback.PinInvalidationReason;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lzy11;", "<anonymous>", "()V"}, k = 3, mv = {2, 2, 0})
@mvg(c = "ru.yandex.yandexmaps.multiplatform.pin.war.PinWar$redraw$1", f = "PinWar.kt", l = {MSException.ERROR_BUSY}, m = "invokeSuspend", v = 1)
/* loaded from: classes7.dex */
final class PinWar$redraw$1 extends SuspendLambda implements tls {
    final /* synthetic */ Collection<mwb0> $ids;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PinWar$redraw$1(b bVar, Collection collection, Continuation continuation) {
        super(1, continuation);
        this.this$0 = bVar;
        this.$ids = collection;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new PinWar$redraw$1(this.this$0, this.$ids, continuation);
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        return ((PinWar$redraw$1) create((Continuation) obj)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            if (this.this$0.f.j(this.$ids)) {
                this.this$0.c();
                b bVar = this.this$0;
                PinInvalidationReason pinInvalidationReason = PinInvalidationReason.REDRAW;
                this.label = 1;
                if (bVar.r(true, pinInvalidationReason, this) == coroutineSingletons) {
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
