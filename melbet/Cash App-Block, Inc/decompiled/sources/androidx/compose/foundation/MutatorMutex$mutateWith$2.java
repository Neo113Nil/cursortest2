package androidx.compose.foundation;

import android.content.ContentResolver;
import android.net.Uri;
import androidx.compose.foundation.MutatorMutex;
import androidx.cursoradapter.widget.CursorAdapter;
import app.cash.copper.ContentResolverQuery;
import app.cash.copper.flow.FlowContentResolver;
import bo.app.a$$ExternalSyntheticBUOutline0;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.channels.BufferedChannel;
import kotlinx.coroutines.channels.BufferedChannel.BufferedChannelIterator;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.sync.Mutex;
import kotlinx.coroutines.sync.MutexImpl;
import papa.PapaEvent;
import papa.SafeTrace;

/* loaded from: classes.dex */
public final class MutatorMutex$mutateWith$2 extends SuspendLambda implements Function2 {
    public final /* synthetic */ Object $block;
    public final /* synthetic */ Object $priority;
    public final /* synthetic */ int $r8$classId = 1;
    public Object $receiver;
    public Object L$0;
    public Object L$1;
    public Object L$2;
    public Object L$3;
    public Object L$4;
    public int label;
    public final /* synthetic */ Object this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MutatorMutex$mutateWith$2(MutatePriority mutatePriority, MutatorMutex mutatorMutex, Function2 function2, Object obj, Continuation continuation) {
        super(2, continuation);
        this.$priority = mutatePriority;
        this.this$0 = mutatorMutex;
        this.$block = function2;
        this.$receiver = obj;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        int i = this.$r8$classId;
        Object obj2 = this.$block;
        Object obj3 = this.$priority;
        Object obj4 = this.this$0;
        switch (i) {
            case 0:
                MutatorMutex$mutateWith$2 mutatorMutex$mutateWith$2 = new MutatorMutex$mutateWith$2((MutatePriority) obj3, (MutatorMutex) obj4, (Function2) obj2, this.$receiver, continuation);
                mutatorMutex$mutateWith$2.L$0 = obj;
                return mutatorMutex$mutateWith$2;
            default:
                continuation.getClass();
                MutatorMutex$mutateWith$2 mutatorMutex$mutateWith$22 = new MutatorMutex$mutateWith$2((ContentResolver) obj4, (ContentResolverQuery) obj3, (Uri) obj2, continuation);
                mutatorMutex$mutateWith$22.L$1 = (FlowCollector) obj;
                return mutatorMutex$mutateWith$22;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.$r8$classId) {
            case 0:
                return ((MutatorMutex$mutateWith$2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            default:
                return ((MutatorMutex$mutateWith$2) create(obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x00bf, code lost:
    
        if (r7.emit(r5, r11) == r0) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0070, code lost:
    
        if (r2.emit(r5, r11) == r0) goto L32;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00a9 A[Catch: all -> 0x003c, TRY_LEAVE, TryCatch #4 {all -> 0x003c, blocks: (B:10:0x0035, B:15:0x00a1, B:17:0x00a9, B:33:0x0054), top: B:4:0x0019 }] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00c3  */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlinx.coroutines.sync.Mutex] */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11, types: [android.database.ContentObserver] */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v16, types: [android.database.ContentObserver, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v31 */
    /* JADX WARN: Type inference failed for: r3v7, types: [android.content.ContentResolver] */
    /* JADX WARN: Type inference failed for: r4v16, types: [kotlinx.coroutines.channels.Channel] */
    /* JADX WARN: Type inference failed for: r4v18, types: [kotlinx.coroutines.channels.Channel] */
    /* JADX WARN: Type inference failed for: r4v5, types: [kotlinx.coroutines.sync.Mutex] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x00bf -> B:11:0x0038). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        MutatorMutex.Mutator mutator;
        MutexImpl mutexImpl;
        MutatorMutex mutatorMutex;
        Function2 function2;
        Object obj2;
        MutatorMutex mutatorMutex2;
        Throwable th;
        MutatorMutex.Mutator mutator2;
        Mutex mutex;
        AtomicReference atomicReference;
        AtomicReference atomicReference2;
        FlowCollector flowCollector;
        BufferedChannel Channel$default;
        CursorAdapter.ChangeObserver changeObserver;
        BufferedChannel.BufferedChannelIterator bufferedChannelIterator;
        FlowCollector flowCollector2;
        BufferedChannel bufferedChannel;
        Object hasNext;
        int i = this.$r8$classId;
        ?? r1 = this.$block;
        ?? r2 = "call to 'resume' before 'invoke' with coroutine";
        Object obj3 = this.this$0;
        Object obj4 = this.$priority;
        switch (i) {
            case 0:
                MutatorMutex mutatorMutex3 = (MutatorMutex) obj3;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i2 = this.label;
                try {
                    try {
                        if (i2 == 0) {
                            SafeTrace.throwOnFailure(obj);
                            CoroutineContext.Element element = ((CoroutineScope) this.L$0).getCoroutineContext().get(Job.Key.$$INSTANCE);
                            element.getClass();
                            mutator = new MutatorMutex.Mutator((MutatePriority) obj4, (Job) element);
                            MutatorMutex.access$tryMutateOrCancel(mutatorMutex3, mutator);
                            mutexImpl = mutatorMutex3.mutex;
                            Function2 function22 = (Function2) r1;
                            Object obj5 = this.$receiver;
                            this.L$0 = mutator;
                            this.L$1 = mutexImpl;
                            this.L$2 = function22;
                            this.L$3 = obj5;
                            this.L$4 = mutatorMutex3;
                            this.label = 1;
                            if (mutexImpl.lock(this) != coroutineSingletons) {
                                mutatorMutex = mutatorMutex3;
                                function2 = function22;
                                obj2 = obj5;
                            }
                            return coroutineSingletons;
                        }
                        if (i2 != 1) {
                            if (i2 != 2) {
                                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            mutatorMutex2 = (MutatorMutex) this.L$2;
                            mutex = (Mutex) this.L$1;
                            mutator2 = (MutatorMutex.Mutator) this.L$0;
                            try {
                                SafeTrace.throwOnFailure(obj);
                                atomicReference2 = mutatorMutex2.currentMutator;
                                while (!atomicReference2.compareAndSet(mutator2, null) && atomicReference2.get() == mutator2) {
                                }
                                mutex.unlock(null);
                                return obj;
                            } catch (Throwable th2) {
                                th = th2;
                                atomicReference = mutatorMutex2.currentMutator;
                                while (!atomicReference.compareAndSet(mutator2, null)) {
                                }
                                throw th;
                            }
                        }
                        MutatorMutex mutatorMutex4 = (MutatorMutex) this.L$4;
                        obj2 = this.L$3;
                        Function2 function23 = (Function2) this.L$2;
                        ?? r4 = (Mutex) this.L$1;
                        MutatorMutex.Mutator mutator3 = (MutatorMutex.Mutator) this.L$0;
                        SafeTrace.throwOnFailure(obj);
                        mutexImpl = r4;
                        mutatorMutex = mutatorMutex4;
                        function2 = function23;
                        mutator = mutator3;
                        this.L$0 = mutator;
                        this.L$1 = mutexImpl;
                        this.L$2 = mutatorMutex;
                        this.L$3 = null;
                        this.L$4 = null;
                        this.label = 2;
                        Object invoke = function2.invoke(obj2, this);
                        if (invoke != coroutineSingletons) {
                            mutex = mutexImpl;
                            mutatorMutex2 = mutatorMutex;
                            obj = invoke;
                            mutator2 = mutator;
                            atomicReference2 = mutatorMutex2.currentMutator;
                            while (!atomicReference2.compareAndSet(mutator2, null)) {
                            }
                            mutex.unlock(null);
                            return obj;
                        }
                        return coroutineSingletons;
                    } catch (Throwable th3) {
                        mutatorMutex2 = mutatorMutex;
                        th = th3;
                        mutator2 = mutator;
                        atomicReference = mutatorMutex2.currentMutator;
                        while (!atomicReference.compareAndSet(mutator2, null) && atomicReference.get() == mutator2) {
                        }
                        throw th;
                    }
                } catch (Throwable th4) {
                    r1.unlock(null);
                    throw th4;
                }
            default:
                ContentResolverQuery contentResolverQuery = (ContentResolverQuery) obj4;
                ?? r3 = (ContentResolver) obj3;
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i3 = this.label;
                try {
                    try {
                        if (i3 == 0) {
                            SafeTrace.throwOnFailure(obj);
                            flowCollector = (FlowCollector) this.L$1;
                            this.L$3 = flowCollector;
                            this.label = 1;
                            break;
                        } else if (i3 == 1) {
                            flowCollector = (FlowCollector) this.L$3;
                            SafeTrace.throwOnFailure(obj);
                        } else {
                            if (i3 != 2) {
                                if (i3 != 3) {
                                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                    return null;
                                }
                                bufferedChannelIterator = (BufferedChannel.BufferedChannelIterator) this.L$4;
                                CursorAdapter.ChangeObserver changeObserver2 = (CursorAdapter.ChangeObserver) this.$receiver;
                                ?? r42 = (Channel) this.L$0;
                                flowCollector2 = (FlowCollector) this.L$3;
                                SafeTrace.throwOnFailure(obj);
                                CursorAdapter.ChangeObserver changeObserver3 = changeObserver2;
                                BufferedChannel bufferedChannel2 = r42;
                                Channel$default = bufferedChannel2;
                                changeObserver = changeObserver3;
                                flowCollector = flowCollector2;
                                this.L$3 = flowCollector;
                                this.L$0 = Channel$default;
                                this.$receiver = changeObserver;
                                this.L$2 = bufferedChannelIterator;
                                this.label = 2;
                                hasNext = bufferedChannelIterator.hasNext(this);
                                if (hasNext != coroutineSingletons2) {
                                    CursorAdapter.ChangeObserver changeObserver4 = changeObserver;
                                    bufferedChannel = Channel$default;
                                    obj = hasNext;
                                    flowCollector2 = flowCollector;
                                    r2 = changeObserver4;
                                    if (!((Boolean) obj).booleanValue()) {
                                        Unit unit = (Unit) bufferedChannelIterator.next();
                                        this.L$3 = flowCollector2;
                                        this.L$0 = bufferedChannel;
                                        this.$receiver = r2;
                                        this.L$2 = unit;
                                        this.L$4 = bufferedChannelIterator;
                                        this.label = 3;
                                        changeObserver3 = r2;
                                        bufferedChannel2 = bufferedChannel;
                                        break;
                                    } else {
                                        r3.unregisterContentObserver(r2);
                                        return Unit.INSTANCE;
                                    }
                                }
                                return coroutineSingletons2;
                            }
                            bufferedChannelIterator = (BufferedChannel.BufferedChannelIterator) this.L$2;
                            CursorAdapter.ChangeObserver changeObserver5 = (CursorAdapter.ChangeObserver) this.$receiver;
                            ?? r43 = (Channel) this.L$0;
                            flowCollector2 = (FlowCollector) this.L$3;
                            SafeTrace.throwOnFailure(obj);
                            r2 = changeObserver5;
                            bufferedChannel = r43;
                            if (!((Boolean) obj).booleanValue()) {
                            }
                        }
                        bufferedChannelIterator = Channel$default.new BufferedChannelIterator();
                        this.L$3 = flowCollector;
                        this.L$0 = Channel$default;
                        this.$receiver = changeObserver;
                        this.L$2 = bufferedChannelIterator;
                        this.label = 2;
                        hasNext = bufferedChannelIterator.hasNext(this);
                        if (hasNext != coroutineSingletons2) {
                        }
                        return coroutineSingletons2;
                    } catch (Throwable th5) {
                        th = th5;
                        r2 = changeObserver;
                        r3.unregisterContentObserver(r2);
                        throw th;
                    }
                    Channel$default = PapaEvent.Channel$default(-1, null, null, 6);
                    changeObserver = new CursorAdapter.ChangeObserver(Channel$default, FlowContentResolver.mainThread, 2);
                    r3.registerContentObserver((Uri) r1, false, changeObserver);
                } catch (Throwable th6) {
                    th = th6;
                }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MutatorMutex$mutateWith$2(ContentResolver contentResolver, ContentResolverQuery contentResolverQuery, Uri uri, Continuation continuation) {
        super(2, continuation);
        this.this$0 = contentResolver;
        this.$priority = contentResolverQuery;
        this.$block = uri;
    }
}
