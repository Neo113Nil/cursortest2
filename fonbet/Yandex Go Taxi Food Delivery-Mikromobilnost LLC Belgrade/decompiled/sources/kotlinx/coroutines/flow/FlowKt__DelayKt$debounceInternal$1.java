package kotlinx.coroutines.flow;

import defpackage.jb20;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tfi0;
import defpackage.tls;
import defpackage.tpr;
import defpackage.tse;
import defpackage.vez0;
import defpackage.vpr;
import defpackage.x6f0;
import defpackage.zls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$LongRef;
import kotlin.jvm.internal.Ref$ObjectRef;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "Ltse;", "Lvpr;", "downstream", "Lzy11;", "<anonymous>", "(Ltse;Lvpr;)V"}, k = 3, mv = {2, 2, 0})
@mvg(c = "kotlinx.coroutines.flow.FlowKt__DelayKt$debounceInternal$1", f = "Delay.kt", l = {215, 415}, m = "invokeSuspend", v = 1)
/* loaded from: classes9.dex */
final class FlowKt__DelayKt$debounceInternal$1 extends SuspendLambda implements zls {
    final /* synthetic */ tpr $this_debounceInternal;
    final /* synthetic */ tls $timeoutMillisSelector;
    int I$0;
    int I$1;
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlowKt__DelayKt$debounceInternal$1(tpr tprVar, tls tlsVar, Continuation continuation) {
        super(3, continuation);
        this.$timeoutMillisSelector = tlsVar;
        this.$this_debounceInternal = tprVar;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        tls tlsVar = this.$timeoutMillisSelector;
        FlowKt__DelayKt$debounceInternal$1 flowKt__DelayKt$debounceInternal$1 = new FlowKt__DelayKt$debounceInternal$1(this.$this_debounceInternal, tlsVar, (Continuation) obj3);
        flowKt__DelayKt$debounceInternal$1.L$0 = (tse) obj;
        flowKt__DelayKt$debounceInternal$1.L$1 = (vpr) obj2;
        return flowKt__DelayKt$debounceInternal$1.invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x009a, code lost:
    
        if (r2.emit(r10, r16) == r3) goto L37;
     */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x005f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x00e6 -> B:6:0x002c). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Ref$ObjectRef ref$ObjectRef;
        tfi0 tfi0Var;
        Ref$LongRef ref$LongRef;
        Ref$ObjectRef ref$ObjectRef2;
        kotlinx.coroutines.selects.b bVar;
        tse tseVar = (tse) this.L$0;
        vpr vprVar = (vpr) this.L$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            x6f0 b = kotlinx.coroutines.channels.b.b(tseVar, 0, new FlowKt__DelayKt$debounceInternal$1$values$1(this.$this_debounceInternal, null), 3);
            ref$ObjectRef = new Ref$ObjectRef();
            tfi0Var = b;
            if (ref$ObjectRef.element != vez0.d) {
            }
        } else {
            if (i == 1) {
                ref$LongRef = (Ref$LongRef) this.L$4;
                ref$ObjectRef = (Ref$ObjectRef) this.L$3;
                tfi0Var = (tfi0) this.L$2;
                kotlin.b.b(obj);
                ref$ObjectRef.element = null;
                vpr vprVar2 = vprVar;
                Ref$LongRef ref$LongRef2 = ref$LongRef;
                ref$ObjectRef2 = ref$ObjectRef;
                bVar = new kotlinx.coroutines.selects.b(get_context());
                if (ref$ObjectRef2.element != 0) {
                }
                bVar.h(tfi0Var.f(), new FlowKt__DelayKt$debounceInternal$1$3$2(vprVar2, null, ref$ObjectRef2));
                this.L$0 = null;
                this.L$1 = vprVar2;
                this.L$2 = tfi0Var;
                this.L$3 = ref$ObjectRef2;
                this.L$4 = null;
                this.L$5 = null;
                this.I$0 = 0;
                this.I$1 = 0;
                this.label = 2;
                if (bVar.e(this) != coroutineSingletons) {
                }
                return coroutineSingletons;
            }
            if (i != 2) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ref$ObjectRef2 = (Ref$ObjectRef) this.L$3;
            tfi0 tfi0Var2 = (tfi0) this.L$2;
            kotlin.b.b(obj);
            tfi0Var = tfi0Var2;
            ref$ObjectRef = ref$ObjectRef2;
            if (ref$ObjectRef.element != vez0.d) {
                ref$LongRef = new Ref$LongRef();
                Object obj2 = ref$ObjectRef.element;
                if (obj2 != null) {
                    tls tlsVar = this.$timeoutMillisSelector;
                    jb20 jb20Var = vez0.b;
                    if (obj2 == jb20Var) {
                        obj2 = null;
                    }
                    long longValue = ((Number) tlsVar.invoke(obj2)).longValue();
                    ref$LongRef.element = longValue;
                    if (longValue < 0) {
                        ny61.g("Debounce timeout should not be negative");
                        return null;
                    }
                    if (longValue == 0) {
                        Object obj3 = ref$ObjectRef.element;
                        if (obj3 == jb20Var) {
                            obj3 = null;
                        }
                        this.L$0 = null;
                        this.L$1 = vprVar;
                        this.L$2 = tfi0Var;
                        this.L$3 = ref$ObjectRef;
                        this.L$4 = ref$LongRef;
                        this.L$5 = null;
                        this.label = 1;
                    }
                }
                vpr vprVar22 = vprVar;
                Ref$LongRef ref$LongRef22 = ref$LongRef;
                ref$ObjectRef2 = ref$ObjectRef;
                bVar = new kotlinx.coroutines.selects.b(get_context());
                if (ref$ObjectRef2.element != 0) {
                    kotlinx.coroutines.selects.a.a(bVar, ref$LongRef22.element, new FlowKt__DelayKt$debounceInternal$1$3$1(vprVar22, null, ref$ObjectRef2));
                }
                bVar.h(tfi0Var.f(), new FlowKt__DelayKt$debounceInternal$1$3$2(vprVar22, null, ref$ObjectRef2));
                this.L$0 = null;
                this.L$1 = vprVar22;
                this.L$2 = tfi0Var;
                this.L$3 = ref$ObjectRef2;
                this.L$4 = null;
                this.L$5 = null;
                this.I$0 = 0;
                this.I$1 = 0;
                this.label = 2;
                if (bVar.e(this) != coroutineSingletons) {
                    vprVar = vprVar22;
                    ref$ObjectRef = ref$ObjectRef2;
                    if (ref$ObjectRef.element != vez0.d) {
                        return zy11.a;
                    }
                }
                return coroutineSingletons;
            }
        }
    }
}
