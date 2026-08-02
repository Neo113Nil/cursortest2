package kotlinx.coroutines.flow.internal;

import defpackage.fse;
import defpackage.jid;
import defpackage.jl40;
import defpackage.szc;
import defpackage.vg10;
import defpackage.vpr;
import defpackage.vuu0;
import defpackage.wse;
import defpackage.x7m;
import defpackage.yk;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\u00020\u00032\u00020\u0004R\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00028\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\u000b\u001a\u00020\n8\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0018\u0010\r\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\tR\u001e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lkotlinx/coroutines/flow/internal/SafeCollector;", "T", "Lvpr;", "Lkotlin/coroutines/jvm/internal/ContinuationImpl;", "Lwse;", "collector", "Lvpr;", "Lfse;", "collectContext", "Lfse;", "", "collectContextSize", CA20Status.STATUS_USER_I, "lastEmissionContext", "Lkotlin/coroutines/Continuation;", "Lzy11;", "completion_", "Lkotlin/coroutines/Continuation;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class SafeCollector<T> extends ContinuationImpl implements vpr {
    public final fse collectContext;
    public final int collectContextSize;
    public final vpr collector;
    private Continuation<? super zy11> completion_;
    private fse lastEmissionContext;

    public SafeCollector(vpr vprVar, fse fseVar) {
        super(EmptyCoroutineContext.a, szc.c);
        this.collector = vprVar;
        this.collectContext = fseVar;
        this.collectContextSize = ((Number) fseVar.fold(0, new yk(27))).intValue();
    }

    @Override // defpackage.vpr
    public final Object emit(Object obj, Continuation continuation) {
        try {
            Object i = i(continuation, obj);
            return i == CoroutineSingletons.COROUTINE_SUSPENDED ? i : zy11.a;
        } catch (Throwable th) {
            this.lastEmissionContext = new x7m(continuation.get_context(), th);
            throw th;
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl, defpackage.wse
    public final wse getCallerFrame() {
        Continuation<? super zy11> continuation = this.completion_;
        if (continuation instanceof wse) {
            return (wse) continuation;
        }
        return null;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl, kotlin.coroutines.Continuation
    /* renamed from: getContext */
    public final fse get_context() {
        fse fseVar = this.lastEmissionContext;
        return fseVar == null ? EmptyCoroutineContext.a : fseVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final StackTraceElement getStackTraceElement() {
        return null;
    }

    public final Object i(Continuation continuation, Object obj) {
        fse fseVar = continuation.get_context();
        kotlinx.coroutines.a.k(fseVar);
        fse fseVar2 = this.lastEmissionContext;
        if (fseVar2 != fseVar) {
            if (fseVar2 instanceof x7m) {
                vg10.d(vuu0.c("\n            Flow exception transparency is violated:\n                Previous 'emit' call has thrown exception " + ((x7m) fseVar2).b + ", but then emission attempt of value '" + obj + "' has been detected.\n                Emissions from 'catch' blocks are prohibited in order to avoid unspecified behaviour, 'Flow.catch' operator can be used instead.\n                For a more detailed explanation, please refer to Flow documentation.\n            "));
                return null;
            }
            if (((Number) fseVar.fold(0, new jid(5, this))).intValue() != this.collectContextSize) {
                throw new IllegalStateException(("Flow invariant is violated:\n\t\tFlow was collected in " + this.collectContext + ",\n\t\tbut emission happened in " + fseVar + ".\n\t\tPlease refer to 'flow' documentation or use 'flowOn' instead").toString());
            }
            this.lastEmissionContext = fseVar;
        }
        this.completion_ = continuation;
        Object invoke = l.a.invoke(this.collector, obj, this);
        if (!jl40.l(invoke, CoroutineSingletons.COROUTINE_SUSPENDED)) {
            this.completion_ = null;
        }
        return invoke;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Throwable a = Result.a(obj);
        if (a != null) {
            this.lastEmissionContext = new x7m(get_context(), a);
        }
        Continuation<? super zy11> continuation = this.completion_;
        if (continuation != null) {
            continuation.resumeWith(obj);
        }
        return CoroutineSingletons.COROUTINE_SUSPENDED;
    }
}
