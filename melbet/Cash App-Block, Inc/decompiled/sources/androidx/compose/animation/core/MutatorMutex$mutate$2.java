package androidx.compose.animation.core;

import android.app.Application;
import androidx.compose.runtime.MutableState;
import app.cash.util.leakdetector.api.LeakDetector;
import com.squareup.cash.CashApp;
import com.squareup.cash.blockers.presenters.RegisterAliasPresenter;
import com.squareup.cash.boost.db.Reward$Adapter;
import com.squareup.cash.clientsync.CustomerStreamingSubscriber;
import com.squareup.cash.clientsync.syncer.RealClientSyncer;
import com.squareup.util.coroutines.CompositeSetupTeardown;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.CompletableDeferredImpl;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.JobImpl;
import kotlinx.coroutines.channels.ProducerCoroutine;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import papa.internal.LaunchTracker;

/* loaded from: classes.dex */
public final class MutatorMutex$mutate$2 extends SuspendLambda implements Function2 {
    public final /* synthetic */ Object $block;
    public final /* synthetic */ int $r8$classId;
    public /* synthetic */ Object L$0;
    public Object L$1;
    public Object L$2;
    public Object L$3;
    public int label;
    public Object this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MutatorMutex$mutate$2(ProducerCoroutine producerCoroutine, FlowCollector flowCollector, Function3 function3, Object obj, JobImpl jobImpl, Continuation continuation) {
        super(2, continuation);
        this.$r8$classId = 7;
        this.L$0 = producerCoroutine;
        this.L$3 = flowCollector;
        this.this$0 = function3;
        this.L$2 = obj;
        this.$block = jobImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        int i = this.$r8$classId;
        Object obj2 = this.$block;
        switch (i) {
            case 0:
                MutatePriority mutatePriority = MutatePriority.Default;
                MutatorMutex$mutate$2 mutatorMutex$mutate$2 = new MutatorMutex$mutate$2((MutatorMutex) this.this$0, (Function1) obj2, continuation);
                mutatorMutex$mutate$2.L$0 = obj;
                return mutatorMutex$mutate$2;
            case 1:
                MutatorMutex$mutate$2 mutatorMutex$mutate$22 = new MutatorMutex$mutate$2((List) this.this$0, (ArrayList) obj2, continuation);
                mutatorMutex$mutate$22.L$0 = obj;
                return mutatorMutex$mutate$22;
            case 2:
                MutatorMutex$mutate$2 mutatorMutex$mutate$23 = new MutatorMutex$mutate$2((CompletableDeferredImpl) this.L$0, (CashApp) this.L$3, (LeakDetector) this.this$0, (Application) obj2, continuation, 2);
                mutatorMutex$mutate$23.L$2 = obj;
                return mutatorMutex$mutate$23;
            case 3:
                MutatorMutex$mutate$2 mutatorMutex$mutate$24 = new MutatorMutex$mutate$2((Flow) this.L$1, continuation, (RegisterAliasPresenter) this.L$0, (Function1) obj2, (MutableState) this.L$3, (MutableState) this.this$0);
                mutatorMutex$mutate$24.L$2 = obj;
                return mutatorMutex$mutate$24;
            case 4:
                MutatorMutex$mutate$2 mutatorMutex$mutate$25 = new MutatorMutex$mutate$2((Reward$Adapter) this.L$0, (CustomerStreamingSubscriber) this.L$3, (Map) this.this$0, (RealClientSyncer) obj2, continuation, 4);
                mutatorMutex$mutate$25.L$2 = obj;
                return mutatorMutex$mutate$25;
            case 5:
                MutatorMutex$mutate$2 mutatorMutex$mutate$26 = new MutatorMutex$mutate$2((CompositeSetupTeardown) obj2, this.L$0, continuation);
                mutatorMutex$mutate$26.L$2 = obj;
                return mutatorMutex$mutate$26;
            case 6:
                MutatorMutex$mutate$2 mutatorMutex$mutate$27 = new MutatorMutex$mutate$2((LaunchTracker) this.L$3, (Ref$ObjectRef) this.this$0, (Function3) obj2, continuation);
                mutatorMutex$mutate$27.L$0 = obj;
                return mutatorMutex$mutate$27;
            default:
                return new MutatorMutex$mutate$2((ProducerCoroutine) this.L$0, (FlowCollector) this.L$3, (Function3) this.this$0, this.L$2, (JobImpl) obj2, continuation);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.$r8$classId) {
            case 0:
                return ((MutatorMutex$mutate$2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 1:
                return ((MutatorMutex$mutate$2) create(obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 2:
                return ((MutatorMutex$mutate$2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 3:
                return ((MutatorMutex$mutate$2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 4:
                return ((MutatorMutex$mutate$2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 5:
                ((MutatorMutex$mutate$2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
                return CoroutineSingletons.COROUTINE_SUSPENDED;
            case 6:
                return ((MutatorMutex$mutate$2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            default:
                return ((MutatorMutex$mutate$2) create((Unit) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ConstInlineVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected instance arg in invoke
        	at jadx.core.dex.visitors.ConstInlineVisitor.addExplicitCast(ConstInlineVisitor.java:285)
        	at jadx.core.dex.visitors.ConstInlineVisitor.replaceArg(ConstInlineVisitor.java:267)
        	at jadx.core.dex.visitors.ConstInlineVisitor.replaceConst(ConstInlineVisitor.java:177)
        	at jadx.core.dex.visitors.ConstInlineVisitor.checkInsn(ConstInlineVisitor.java:110)
        	at jadx.core.dex.visitors.ConstInlineVisitor.process(ConstInlineVisitor.java:55)
        	at jadx.core.dex.visitors.ConstInlineVisitor.visit(ConstInlineVisitor.java:47)
        */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:128:0x0349 -> B:123:0x0326). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:130:0x0373 -> B:123:0x0326). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:86:0x01f3 -> B:80:0x01f7). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object r18) {
        /*
            Method dump skipped, instructions count: 1150
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.animation.core.MutatorMutex$mutate$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MutatorMutex$mutate$2(CompositeSetupTeardown compositeSetupTeardown, Object obj, Continuation continuation) {
        super(2, continuation);
        this.$r8$classId = 5;
        this.$block = compositeSetupTeardown;
        this.L$0 = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ MutatorMutex$mutate$2(Object obj, Object obj2, Object obj3, Object obj4, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.L$0 = obj;
        this.L$3 = obj2;
        this.this$0 = obj3;
        this.$block = obj4;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MutatorMutex$mutate$2(List list, ArrayList arrayList, Continuation continuation) {
        super(2, continuation);
        this.$r8$classId = 1;
        this.this$0 = list;
        this.$block = arrayList;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MutatorMutex$mutate$2(MutatorMutex mutatorMutex, Function1 function1, Continuation continuation) {
        super(2, continuation);
        this.$r8$classId = 0;
        MutatePriority mutatePriority = MutatePriority.Default;
        this.this$0 = mutatorMutex;
        this.$block = function1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MutatorMutex$mutate$2(Flow flow, Continuation continuation, RegisterAliasPresenter registerAliasPresenter, Function1 function1, MutableState mutableState, MutableState mutableState2) {
        super(2, continuation);
        this.$r8$classId = 3;
        this.L$1 = flow;
        this.L$0 = registerAliasPresenter;
        this.$block = function1;
        this.L$3 = mutableState;
        this.this$0 = mutableState2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MutatorMutex$mutate$2(LaunchTracker launchTracker, Ref$ObjectRef ref$ObjectRef, Function3 function3, Continuation continuation) {
        super(2, continuation);
        this.$r8$classId = 6;
        this.L$3 = launchTracker;
        this.this$0 = ref$ObjectRef;
        this.$block = function3;
    }
}
