package androidx.paging.compose;

import androidx.paging.PageFetcher$flow$1;
import bo.app.a$$ExternalSyntheticBUOutline0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import papa.SafeTrace;

/* loaded from: classes3.dex */
public final class LazyPagingItemsKt$collectAsLazyPagingItems$1$1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ CoroutineContext $context;
    public final /* synthetic */ LazyPagingItems $lazyPagingItems;
    public final /* synthetic */ int $r8$classId;
    public int label;

    /* renamed from: androidx.paging.compose.LazyPagingItemsKt$collectAsLazyPagingItems$1$1$1, reason: invalid class name */
    public final class AnonymousClass1 extends SuspendLambda implements Function2 {
        public final /* synthetic */ LazyPagingItems $lazyPagingItems;
        public final /* synthetic */ int $r8$classId;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ AnonymousClass1(LazyPagingItems lazyPagingItems, Continuation continuation, int i) {
            super(2, continuation);
            this.$r8$classId = i;
            this.$lazyPagingItems = lazyPagingItems;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            switch (this.$r8$classId) {
                case 0:
                    return new AnonymousClass1(this.$lazyPagingItems, continuation, 0);
                default:
                    return new AnonymousClass1(this.$lazyPagingItems, continuation, 1);
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            CoroutineScope coroutineScope = (CoroutineScope) obj;
            Continuation continuation = (Continuation) obj2;
            switch (this.$r8$classId) {
            }
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            int i = this.$r8$classId;
            LazyPagingItems lazyPagingItems = this.$lazyPagingItems;
            Continuation continuation = null;
            switch (i) {
                case 0:
                    Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i2 = this.label;
                    if (i2 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        this.label = 1;
                        Object collectLatest = FlowKt.collectLatest(lazyPagingItems.flow, new PageFetcher$flow$1(lazyPagingItems, continuation, 28), this);
                        if (collectLatest != obj2) {
                            collectLatest = Unit.INSTANCE;
                        }
                        if (collectLatest == obj2) {
                            break;
                        }
                    } else if (i2 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        break;
                    } else {
                        SafeTrace.throwOnFailure(obj);
                    }
                    break;
                default:
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i3 = this.label;
                    if (i3 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        this.label = 1;
                        if (lazyPagingItems.collectLoadState$paging_compose(this) == coroutineSingletons) {
                            break;
                        }
                    } else if (i3 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        break;
                    } else {
                        SafeTrace.throwOnFailure(obj);
                    }
                    break;
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ LazyPagingItemsKt$collectAsLazyPagingItems$1$1(CoroutineContext coroutineContext, LazyPagingItems lazyPagingItems, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.$context = coroutineContext;
        this.$lazyPagingItems = lazyPagingItems;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.$r8$classId) {
            case 0:
                return new LazyPagingItemsKt$collectAsLazyPagingItems$1$1(this.$context, this.$lazyPagingItems, continuation, 0);
            default:
                return new LazyPagingItemsKt$collectAsLazyPagingItems$1$1(this.$context, this.$lazyPagingItems, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        CoroutineScope coroutineScope = (CoroutineScope) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.$r8$classId) {
        }
        return ((LazyPagingItemsKt$collectAsLazyPagingItems$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0032, code lost:
    
        if (r4.collectLoadState$paging_compose(r8) == r0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0040, code lost:
    
        if (kotlinx.coroutines.JobKt.withContext(r3, r9, r8) == r0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0079, code lost:
    
        if (r8 == r0) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0088, code lost:
    
        if (kotlinx.coroutines.JobKt.withContext(r3, r9, r8) == r0) goto L38;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        int i = this.$r8$classId;
        CoroutineContext coroutineContext = this.$context;
        LazyPagingItems lazyPagingItems = this.$lazyPagingItems;
        int i2 = 1;
        Continuation continuation = null;
        switch (i) {
            case 0:
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i3 = this.label;
                if (i3 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    if (!Intrinsics.areEqual(coroutineContext, EmptyCoroutineContext.INSTANCE)) {
                        AnonymousClass1 anonymousClass1 = new AnonymousClass1(lazyPagingItems, continuation, 0);
                        this.label = 2;
                        break;
                    } else {
                        this.label = 1;
                        Object collectLatest = FlowKt.collectLatest(lazyPagingItems.flow, new PageFetcher$flow$1(lazyPagingItems, continuation, 28), this);
                        if (collectLatest != obj2) {
                            collectLatest = Unit.INSTANCE;
                            break;
                        }
                    }
                } else if (i3 != 1 && i3 != 2) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            default:
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i4 = this.label;
                if (i4 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    if (!Intrinsics.areEqual(coroutineContext, EmptyCoroutineContext.INSTANCE)) {
                        AnonymousClass1 anonymousClass12 = new AnonymousClass1(lazyPagingItems, continuation, i2);
                        this.label = 2;
                        break;
                    } else {
                        this.label = 1;
                        break;
                    }
                } else if (i4 != 1 && i4 != 2) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
