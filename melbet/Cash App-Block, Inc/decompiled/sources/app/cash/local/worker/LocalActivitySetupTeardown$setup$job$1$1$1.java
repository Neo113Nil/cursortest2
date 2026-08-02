package app.cash.local.worker;

import com.squareup.protos.cash.local.client.app.v1.account.LocalAccount;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function3;
import papa.SafeTrace;

/* loaded from: classes.dex */
public final class LocalActivitySetupTeardown$setup$job$1$1$1 extends SuspendLambda implements Function3 {
    public /* synthetic */ LocalAccount L$0;

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        LocalActivitySetupTeardown$setup$job$1$1$1 localActivitySetupTeardown$setup$job$1$1$1 = new LocalActivitySetupTeardown$setup$job$1$1$1(3, (Continuation) obj3);
        localActivitySetupTeardown$setup$job$1$1$1.L$0 = (LocalAccount) obj;
        return localActivitySetupTeardown$setup$job$1$1$1.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        List list;
        LocalAccount localAccount = this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        SafeTrace.throwOnFailure(obj);
        if (localAccount == null || (list = localAccount.auto_display_shortlink_keys) == null) {
            return null;
        }
        return (String) CollectionsKt.firstOrNull(list);
    }
}
