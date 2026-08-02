package kotlin.coroutines.jvm.internal;

import defpackage.fse;
import defpackage.j18;
import defpackage.jse;
import defpackage.pyj;
import defpackage.szc;
import defpackage.x4c;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b!\u0018\u00002\u00020\u0001J\u0015\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u0007\u0010\bR\u0016\u0010\n\u001a\u0004\u0018\u00010\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR \u0010\u0004\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0004\u0010\fR\u0014\u0010\u000f\u001a\u00020\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000e¨\u0006\u0010"}, d2 = {"Lkotlin/coroutines/jvm/internal/ContinuationImpl;", "Lkotlin/coroutines/jvm/internal/BaseContinuationImpl;", "Lkotlin/coroutines/Continuation;", "", "intercepted", "()Lkotlin/coroutines/Continuation;", "Lzy11;", "releaseIntercepted", "()V", "Lfse;", "_context", "Lfse;", "Lkotlin/coroutines/Continuation;", "getContext", "()Lfse;", "context", "kotlin-stdlib"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes9.dex */
public abstract class ContinuationImpl extends BaseContinuationImpl {
    private final fse _context;
    private transient Continuation<Object> intercepted;

    public ContinuationImpl(Continuation continuation) {
        this(continuation != null ? continuation.get_context() : null, continuation);
    }

    @Override // kotlin.coroutines.Continuation
    /* renamed from: getContext, reason: from getter */
    public fse get_context() {
        return this._context;
    }

    public final Continuation<Object> intercepted() {
        Continuation<Object> continuation = this.intercepted;
        if (continuation != null) {
            return continuation;
        }
        jse jseVar = (jse) get_context().get(x4c.K);
        Continuation<Object> pyjVar = jseVar != null ? new pyj(jseVar, this) : this;
        this.intercepted = pyjVar;
        return pyjVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public void releaseIntercepted() {
        Continuation<Object> continuation = this.intercepted;
        if (continuation != null && continuation != this) {
            pyj pyjVar = (pyj) continuation;
            pyjVar.i();
            j18 l = pyjVar.l();
            if (l != null) {
                l.n();
            }
        }
        this.intercepted = szc.b;
    }

    public ContinuationImpl(fse fseVar, Continuation continuation) {
        super(continuation);
        this._context = fseVar;
    }
}
