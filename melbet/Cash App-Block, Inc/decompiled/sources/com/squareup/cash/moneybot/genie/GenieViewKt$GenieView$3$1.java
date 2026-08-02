package com.squareup.cash.moneybot.genie;

import com.squareup.cash.genie.backend.real.GenieLogger;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import papa.SafeTrace;
import xyz.block.genie.GenieLogLevel;

/* loaded from: classes6.dex */
public final class GenieViewKt$GenieView$3$1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ boolean $hasViewNode;
    public final /* synthetic */ GenieLogger $logger;
    public final /* synthetic */ int $r8$classId;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ GenieViewKt$GenieView$3$1(boolean z, GenieLogger genieLogger, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.$hasViewNode = z;
        this.$logger = genieLogger;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.$r8$classId) {
            case 0:
                return new GenieViewKt$GenieView$3$1(this.$hasViewNode, this.$logger, continuation, 0);
            case 1:
                return new GenieViewKt$GenieView$3$1(this.$hasViewNode, this.$logger, continuation, 1);
            default:
                return new GenieViewKt$GenieView$3$1(this.$hasViewNode, this.$logger, continuation, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        CoroutineScope coroutineScope = (CoroutineScope) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.$r8$classId) {
        }
        return ((GenieViewKt$GenieView$3$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = this.$r8$classId;
        GenieLogger genieLogger = this.$logger;
        boolean z = this.$hasViewNode;
        switch (i) {
            case 0:
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                if (!z && genieLogger != null) {
                    GenieLogger.log(GenieLogLevel.ERROR, "ViewSpec.view_node is missing or empty. Nothing will be rendered.");
                }
                break;
            case 1:
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                if (z && genieLogger != null) {
                    GenieLogger.log(GenieLogLevel.WARNING, "Modifier passed to GenieForEachView was discarded. ForEach emits siblings, not a single layout, so external modifiers cannot be applied. Wrap the ForEach in a Row/Column/Box if you need to position it.");
                }
                break;
            default:
                CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                if (z && genieLogger != null) {
                    GenieLogger.log(GenieLogLevel.ERROR, "GenieActionHandler not found in environment. Actions will not be executed.");
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
