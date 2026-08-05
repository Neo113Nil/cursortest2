package androidx.wear.remote.interactions;

import java.util.concurrent.Executor;
import java.util.function.Consumer;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.channels.ProduceKt;
import kotlinx.coroutines.channels.ProducerScope;

/* compiled from: RemoteActivityHelper.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/channels/ProducerScope;", ""}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "androidx.wear.remote.interactions.RemoteActivityHelper$getRemoteActivityHelperStatusInternal$1", f = "RemoteActivityHelper.kt", i = {}, l = {232}, m = "invokeSuspend", n = {}, s = {}, v = 1)
/* loaded from: classes.dex */
final class RemoteActivityHelper$getRemoteActivityHelperStatusInternal$1 extends SuspendLambda implements Function2<ProducerScope<? super Integer>, Continuation<? super Unit>, Object> {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ RemoteActivityHelper this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RemoteActivityHelper$getRemoteActivityHelperStatusInternal$1(RemoteActivityHelper remoteActivityHelper, Continuation<? super RemoteActivityHelper$getRemoteActivityHelperStatusInternal$1> continuation) {
        super(2, continuation);
        this.this$0 = remoteActivityHelper;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        RemoteActivityHelper$getRemoteActivityHelperStatusInternal$1 remoteActivityHelper$getRemoteActivityHelperStatusInternal$1 = new RemoteActivityHelper$getRemoteActivityHelperStatusInternal$1(this.this$0, continuation);
        remoteActivityHelper$getRemoteActivityHelperStatusInternal$1.L$0 = obj;
        return remoteActivityHelper$getRemoteActivityHelperStatusInternal$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ProducerScope<? super Integer> producerScope, Continuation<? super Unit> continuation) {
        return ((RemoteActivityHelper$getRemoteActivityHelperStatusInternal$1) create(producerScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [androidx.wear.remote.interactions.RemoteActivityHelper$getRemoteActivityHelperStatusInternal$1$callback$1] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Executor executor;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            final ProducerScope producerScope = (ProducerScope) this.L$0;
            final ?? r1 = new Consumer<Integer>() { // from class: androidx.wear.remote.interactions.RemoteActivityHelper$getRemoteActivityHelperStatusInternal$1$callback$1
                @Override // java.util.function.Consumer
                public /* bridge */ /* synthetic */ void accept(Integer num) {
                    accept(num.intValue());
                }

                public void accept(int value) {
                    producerScope.mo1785trySendJP2dKIU(Integer.valueOf(value));
                }
            };
            IRemoteInteractionsManager remoteInteractionsManager = this.this$0.getRemoteInteractionsManager();
            executor = this.this$0.executor;
            remoteInteractionsManager.registerRemoteActivityHelperStatusListener(executor, (Consumer) r1);
            final RemoteActivityHelper remoteActivityHelper = this.this$0;
            this.label = 1;
            if (ProduceKt.awaitClose(producerScope, new Function0() { // from class: androidx.wear.remote.interactions.RemoteActivityHelper$getRemoteActivityHelperStatusInternal$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit invokeSuspend$lambda$0;
                    invokeSuspend$lambda$0 = RemoteActivityHelper$getRemoteActivityHelperStatusInternal$1.invokeSuspend$lambda$0(RemoteActivityHelper.this, r1);
                    return invokeSuspend$lambda$0;
                }
            }, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$0(RemoteActivityHelper remoteActivityHelper, RemoteActivityHelper$getRemoteActivityHelperStatusInternal$1$callback$1 remoteActivityHelper$getRemoteActivityHelperStatusInternal$1$callback$1) {
        remoteActivityHelper.getRemoteInteractionsManager().unregisterRemoteActivityHelperStatusListener(remoteActivityHelper$getRemoteActivityHelperStatusInternal$1$callback$1);
        return Unit.INSTANCE;
    }
}
