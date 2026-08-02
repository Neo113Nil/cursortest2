package ru.yandex.taxi.preorder.source.domain;

import defpackage.jst;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tls;
import defpackage.zy11;
import java.io.Serializable;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lzy11;", "<anonymous>", "()V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.preorder.source.domain.SourceAddressOrFallbackInteractor$doWithSourceAddress$1", f = "SourceAddressOrFallbackInteractor.kt", l = {32}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class SourceAddressOrFallbackInteractor$doWithSourceAddress$1 extends SuspendLambda implements tls {
    final /* synthetic */ tls $block;
    Object L$0;
    int label;
    final /* synthetic */ q this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SourceAddressOrFallbackInteractor$doWithSourceAddress$1(tls tlsVar, q qVar, Continuation continuation) {
        super(1, continuation);
        this.$block = tlsVar;
        this.this$0 = qVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new SourceAddressOrFallbackInteractor$doWithSourceAddress$1(this.$block, this.this$0, continuation);
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        return ((SourceAddressOrFallbackInteractor$doWithSourceAddress$1) create((Continuation) obj)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        tls tlsVar;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        try {
            if (i == 0) {
                kotlin.b.b(obj);
                tls tlsVar2 = this.$block;
                q qVar = this.this$0;
                this.L$0 = tlsVar2;
                this.label = 1;
                Serializable b = qVar.b(this);
                if (b == coroutineSingletons) {
                    return coroutineSingletons;
                }
                obj = b;
                tlsVar = tlsVar2;
            } else {
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                tlsVar = (tls) this.L$0;
                kotlin.b.b(obj);
            }
            tlsVar.invoke(obj);
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            jst.e.k(th, "Failed to show source address picker with fallback address");
        }
        return zy11.a;
    }
}
