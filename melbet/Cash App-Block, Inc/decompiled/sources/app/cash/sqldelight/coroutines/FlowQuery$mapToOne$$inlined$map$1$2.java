package app.cash.sqldelight.coroutines;

import app.cash.sqldelight.Query;
import bo.app.a$$ExternalSyntheticBUOutline0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.flow.FlowCollector;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* loaded from: classes.dex */
public final class FlowQuery$mapToOne$$inlined$map$1$2 implements FlowCollector {
    public final /* synthetic */ CoroutineContext $context$inlined;
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ FlowCollector $this_unsafeFlow;

    /* renamed from: app.cash.sqldelight.coroutines.FlowQuery$mapToOne$$inlined$map$1$2$1, reason: invalid class name */
    public final class AnonymousClass1 extends ContinuationImpl {
        public int I$0;
        public FlowCollector L$4;
        public int label;
        public /* synthetic */ Object result;

        public AnonymousClass1(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= PKIFailureInfo.systemUnavail;
            return FlowQuery$mapToOne$$inlined$map$1$2.this.emit(null, this);
        }
    }

    public /* synthetic */ FlowQuery$mapToOne$$inlined$map$1$2(FlowCollector flowCollector, CoroutineContext coroutineContext, int i) {
        this.$r8$classId = i;
        this.$this_unsafeFlow = flowCollector;
        this.$context$inlined = coroutineContext;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0065, code lost:
    
        if (r2.emit(r11, r0) != r13) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0058, code lost:
    
        if (r11 == r13) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00c1, code lost:
    
        if (r2.emit(r11, r0) == r13) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00b2, code lost:
    
        if (r11 == r13) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x011b, code lost:
    
        if (r2.emit(r11, r0) != r13) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x010e, code lost:
    
        if (r11 == r13) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0175, code lost:
    
        if (r2.emit(r11, r0) != r13) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x0168, code lost:
    
        if (r11 == r13) goto L86;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0154  */
    @Override // kotlinx.coroutines.flow.FlowCollector
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        AnonymousClass1 anonymousClass1;
        int i;
        FlowQuery$mapToList$$inlined$map$1$2$1 flowQuery$mapToList$$inlined$map$1$2$1;
        int i2;
        FlowQuery$mapToOneNotNull$$inlined$mapNotNull$1$2$1 flowQuery$mapToOneNotNull$$inlined$mapNotNull$1$2$1;
        Object obj2;
        int i3;
        FlowQuery$mapToOneOrNull$$inlined$map$1$2$1 flowQuery$mapToOneOrNull$$inlined$map$1$2$1;
        int i4;
        int i5 = this.$r8$classId;
        CoroutineContext coroutineContext = this.$context$inlined;
        FlowCollector flowCollector = this.$this_unsafeFlow;
        int i6 = 1;
        int i7 = 2;
        int i8 = 0;
        Continuation continuation2 = null;
        switch (i5) {
            case 0:
                if (continuation instanceof AnonymousClass1) {
                    anonymousClass1 = (AnonymousClass1) continuation;
                    int i9 = anonymousClass1.label;
                    if ((i9 & PKIFailureInfo.systemUnavail) != 0) {
                        anonymousClass1.label = i9 - PKIFailureInfo.systemUnavail;
                        Object obj3 = anonymousClass1.result;
                        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i = anonymousClass1.label;
                        if (i != 0) {
                            SafeTrace.throwOnFailure(obj3);
                            FlowQuery$mapToOne$1$1 flowQuery$mapToOne$1$1 = new FlowQuery$mapToOne$1$1((Query) obj, continuation2, i8);
                            anonymousClass1.L$4 = flowCollector;
                            anonymousClass1.I$0 = 0;
                            anonymousClass1.label = 1;
                            obj3 = JobKt.withContext(coroutineContext, flowQuery$mapToOne$1$1, anonymousClass1);
                            break;
                        } else if (i == 1) {
                            i8 = anonymousClass1.I$0;
                            flowCollector = anonymousClass1.L$4;
                            SafeTrace.throwOnFailure(obj3);
                        } else if (i != 2) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            SafeTrace.throwOnFailure(obj3);
                            break;
                        }
                        anonymousClass1.L$4 = null;
                        anonymousClass1.I$0 = i8;
                        anonymousClass1.label = 2;
                        break;
                    }
                }
                anonymousClass1 = new AnonymousClass1(continuation);
                Object obj32 = anonymousClass1.result;
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = anonymousClass1.label;
                if (i != 0) {
                }
                anonymousClass1.L$4 = null;
                anonymousClass1.I$0 = i8;
                anonymousClass1.label = 2;
            case 1:
                if (continuation instanceof FlowQuery$mapToList$$inlined$map$1$2$1) {
                    flowQuery$mapToList$$inlined$map$1$2$1 = (FlowQuery$mapToList$$inlined$map$1$2$1) continuation;
                    int i10 = flowQuery$mapToList$$inlined$map$1$2$1.label;
                    if ((i10 & PKIFailureInfo.systemUnavail) != 0) {
                        flowQuery$mapToList$$inlined$map$1$2$1.label = i10 - PKIFailureInfo.systemUnavail;
                        Object obj4 = flowQuery$mapToList$$inlined$map$1$2$1.result;
                        CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i2 = flowQuery$mapToList$$inlined$map$1$2$1.label;
                        if (i2 != 0) {
                            SafeTrace.throwOnFailure(obj4);
                            FlowQuery$mapToOne$1$1 flowQuery$mapToOne$1$12 = new FlowQuery$mapToOne$1$1((Query) obj, continuation2, i6);
                            flowQuery$mapToList$$inlined$map$1$2$1.L$4 = flowCollector;
                            flowQuery$mapToList$$inlined$map$1$2$1.I$0 = 0;
                            flowQuery$mapToList$$inlined$map$1$2$1.label = 1;
                            obj4 = JobKt.withContext(coroutineContext, flowQuery$mapToOne$1$12, flowQuery$mapToList$$inlined$map$1$2$1);
                            break;
                        } else if (i2 == 1) {
                            i8 = flowQuery$mapToList$$inlined$map$1$2$1.I$0;
                            flowCollector = flowQuery$mapToList$$inlined$map$1$2$1.L$4;
                            SafeTrace.throwOnFailure(obj4);
                        } else if (i2 != 2) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            SafeTrace.throwOnFailure(obj4);
                            break;
                        }
                        flowQuery$mapToList$$inlined$map$1$2$1.L$4 = null;
                        flowQuery$mapToList$$inlined$map$1$2$1.I$0 = i8;
                        flowQuery$mapToList$$inlined$map$1$2$1.label = 2;
                        break;
                    }
                }
                flowQuery$mapToList$$inlined$map$1$2$1 = new FlowQuery$mapToList$$inlined$map$1$2$1(this, continuation);
                Object obj42 = flowQuery$mapToList$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons32 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i2 = flowQuery$mapToList$$inlined$map$1$2$1.label;
                if (i2 != 0) {
                }
                flowQuery$mapToList$$inlined$map$1$2$1.L$4 = null;
                flowQuery$mapToList$$inlined$map$1$2$1.I$0 = i8;
                flowQuery$mapToList$$inlined$map$1$2$1.label = 2;
            case 2:
                if (continuation instanceof FlowQuery$mapToOneNotNull$$inlined$mapNotNull$1$2$1) {
                    flowQuery$mapToOneNotNull$$inlined$mapNotNull$1$2$1 = (FlowQuery$mapToOneNotNull$$inlined$mapNotNull$1$2$1) continuation;
                    int i11 = flowQuery$mapToOneNotNull$$inlined$mapNotNull$1$2$1.label;
                    if ((i11 & PKIFailureInfo.systemUnavail) != 0) {
                        flowQuery$mapToOneNotNull$$inlined$mapNotNull$1$2$1.label = i11 - PKIFailureInfo.systemUnavail;
                        obj2 = flowQuery$mapToOneNotNull$$inlined$mapNotNull$1$2$1.result;
                        CoroutineSingletons coroutineSingletons4 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i3 = flowQuery$mapToOneNotNull$$inlined$mapNotNull$1$2$1.label;
                        if (i3 != 0) {
                            SafeTrace.throwOnFailure(obj2);
                            FlowQuery$mapToOne$1$1 flowQuery$mapToOne$1$13 = new FlowQuery$mapToOne$1$1((Query) obj, continuation2, i7);
                            flowQuery$mapToOneNotNull$$inlined$mapNotNull$1$2$1.L$3 = flowCollector;
                            flowQuery$mapToOneNotNull$$inlined$mapNotNull$1$2$1.I$0 = 0;
                            flowQuery$mapToOneNotNull$$inlined$mapNotNull$1$2$1.label = 1;
                            obj2 = JobKt.withContext(coroutineContext, flowQuery$mapToOne$1$13, flowQuery$mapToOneNotNull$$inlined$mapNotNull$1$2$1);
                            break;
                        } else if (i3 == 1) {
                            i8 = flowQuery$mapToOneNotNull$$inlined$mapNotNull$1$2$1.I$0;
                            flowCollector = flowQuery$mapToOneNotNull$$inlined$mapNotNull$1$2$1.L$3;
                            SafeTrace.throwOnFailure(obj2);
                        } else if (i3 != 2) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            SafeTrace.throwOnFailure(obj2);
                            break;
                        }
                        if (obj2 != null) {
                            flowQuery$mapToOneNotNull$$inlined$mapNotNull$1$2$1.L$3 = null;
                            flowQuery$mapToOneNotNull$$inlined$mapNotNull$1$2$1.I$0 = i8;
                            flowQuery$mapToOneNotNull$$inlined$mapNotNull$1$2$1.label = 2;
                            break;
                        }
                    }
                }
                flowQuery$mapToOneNotNull$$inlined$mapNotNull$1$2$1 = new FlowQuery$mapToOneNotNull$$inlined$mapNotNull$1$2$1(this, continuation);
                obj2 = flowQuery$mapToOneNotNull$$inlined$mapNotNull$1$2$1.result;
                CoroutineSingletons coroutineSingletons42 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i3 = flowQuery$mapToOneNotNull$$inlined$mapNotNull$1$2$1.label;
                if (i3 != 0) {
                }
                if (obj2 != null) {
                }
            default:
                if (continuation instanceof FlowQuery$mapToOneOrNull$$inlined$map$1$2$1) {
                    flowQuery$mapToOneOrNull$$inlined$map$1$2$1 = (FlowQuery$mapToOneOrNull$$inlined$map$1$2$1) continuation;
                    int i12 = flowQuery$mapToOneOrNull$$inlined$map$1$2$1.label;
                    if ((i12 & PKIFailureInfo.systemUnavail) != 0) {
                        flowQuery$mapToOneOrNull$$inlined$map$1$2$1.label = i12 - PKIFailureInfo.systemUnavail;
                        Object obj5 = flowQuery$mapToOneOrNull$$inlined$map$1$2$1.result;
                        CoroutineSingletons coroutineSingletons5 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i4 = flowQuery$mapToOneOrNull$$inlined$map$1$2$1.label;
                        if (i4 != 0) {
                            SafeTrace.throwOnFailure(obj5);
                            FlowQuery$mapToOne$1$1 flowQuery$mapToOne$1$14 = new FlowQuery$mapToOne$1$1((Query) obj, continuation2, 3);
                            flowQuery$mapToOneOrNull$$inlined$map$1$2$1.L$4 = flowCollector;
                            flowQuery$mapToOneOrNull$$inlined$map$1$2$1.I$0 = 0;
                            flowQuery$mapToOneOrNull$$inlined$map$1$2$1.label = 1;
                            obj5 = JobKt.withContext(coroutineContext, flowQuery$mapToOne$1$14, flowQuery$mapToOneOrNull$$inlined$map$1$2$1);
                            break;
                        } else if (i4 == 1) {
                            i8 = flowQuery$mapToOneOrNull$$inlined$map$1$2$1.I$0;
                            flowCollector = flowQuery$mapToOneOrNull$$inlined$map$1$2$1.L$4;
                            SafeTrace.throwOnFailure(obj5);
                        } else if (i4 != 2) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            SafeTrace.throwOnFailure(obj5);
                            break;
                        }
                        flowQuery$mapToOneOrNull$$inlined$map$1$2$1.L$4 = null;
                        flowQuery$mapToOneOrNull$$inlined$map$1$2$1.I$0 = i8;
                        flowQuery$mapToOneOrNull$$inlined$map$1$2$1.label = 2;
                        break;
                    }
                }
                flowQuery$mapToOneOrNull$$inlined$map$1$2$1 = new FlowQuery$mapToOneOrNull$$inlined$map$1$2$1(this, continuation);
                Object obj52 = flowQuery$mapToOneOrNull$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons52 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i4 = flowQuery$mapToOneOrNull$$inlined$map$1$2$1.label;
                if (i4 != 0) {
                }
                flowQuery$mapToOneOrNull$$inlined$map$1$2$1.L$4 = null;
                flowQuery$mapToOneOrNull$$inlined$map$1$2$1.I$0 = i8;
                flowQuery$mapToOneOrNull$$inlined$map$1$2$1.label = 2;
        }
        return Unit.INSTANCE;
    }
}
