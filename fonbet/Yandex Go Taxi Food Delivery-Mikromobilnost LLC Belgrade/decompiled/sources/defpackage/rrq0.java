package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.BaseContinuationImpl;

/* loaded from: classes9.dex */
public final class rrq0 extends srq0 implements Iterator, Continuation, xfx {
    public int a;
    public Object b;
    public Iterator c;
    public Continuation w;

    @Override // defpackage.srq0
    public final CoroutineSingletons a(Object obj, Continuation continuation) {
        this.b = obj;
        this.a = 3;
        this.w = continuation;
        return CoroutineSingletons.COROUTINE_SUSPENDED;
    }

    @Override // defpackage.srq0
    public final Object d(Iterator it, BaseContinuationImpl baseContinuationImpl) {
        if (!it.hasNext()) {
            return zy11.a;
        }
        this.c = it;
        this.a = 2;
        this.w = baseContinuationImpl;
        return CoroutineSingletons.COROUTINE_SUSPENDED;
    }

    public final RuntimeException e() {
        int i = this.a;
        if (i == 4) {
            return new NoSuchElementException();
        }
        if (i == 5) {
            return new IllegalStateException("Iterator has failed.");
        }
        return new IllegalStateException("Unexpected state of the iterator: " + this.a);
    }

    @Override // kotlin.coroutines.Continuation
    /* renamed from: getContext */
    public final fse get_context() {
        return EmptyCoroutineContext.a;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        while (true) {
            int i = this.a;
            if (i != 0) {
                if (i != 1) {
                    if (i == 2 || i == 3) {
                        return true;
                    }
                    if (i == 4) {
                        return false;
                    }
                    throw e();
                }
                if (this.c.hasNext()) {
                    this.a = 2;
                    return true;
                }
                this.c = null;
            }
            this.a = 5;
            Continuation continuation = this.w;
            this.w = null;
            continuation.resumeWith(zy11.a);
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.a;
        if (i == 0 || i == 1) {
            if (hasNext()) {
                return next();
            }
            ny61.p();
            return null;
        }
        if (i == 2) {
            this.a = 1;
            return this.c.next();
        }
        if (i != 3) {
            throw e();
        }
        this.a = 0;
        Object obj = this.b;
        this.b = null;
        return obj;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // kotlin.coroutines.Continuation
    public final void resumeWith(Object obj) {
        b.b(obj);
        this.a = 4;
    }
}
