package kotlin.coroutines;

import defpackage.dfi;
import defpackage.fp5;
import defpackage.ib5;
import defpackage.m32;
import defpackage.t83;
import defpackage.vqn;
import defpackage.xq0;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class c implements CoroutineContext, Serializable {
    public final CoroutineContext a;
    public final CoroutineContext.Element b;

    public c(CoroutineContext.Element element, CoroutineContext coroutineContext) {
        coroutineContext.getClass();
        element.getClass();
        this.a = coroutineContext;
        this.b = element;
    }

    private final void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization is supported via proxy only");
    }

    private final Object writeReplace() {
        int c = c();
        CoroutineContext[] coroutineContextArr = new CoroutineContext[c];
        vqn vqnVar = new vqn();
        fold(Unit.a, new m32(25, coroutineContextArr, vqnVar));
        if (vqnVar.a == c) {
            return new ib5(coroutineContextArr);
        }
        xq0.q("Check failed.");
        return null;
    }

    public final int c() {
        int i = 2;
        c cVar = this;
        while (true) {
            CoroutineContext coroutineContext = cVar.a;
            cVar = coroutineContext instanceof c ? (c) coroutineContext : null;
            if (cVar == null) {
                return i;
            }
            i++;
        }
    }

    public final boolean equals(Object obj) {
        boolean z;
        if (this == obj) {
            return true;
        }
        if (obj instanceof c) {
            c cVar = (c) obj;
            if (cVar.c() == c()) {
                c cVar2 = this;
                while (true) {
                    CoroutineContext.Element element = cVar2.b;
                    if (!Intrinsics.d(cVar.get(element.getKey()), element)) {
                        z = false;
                        break;
                    }
                    CoroutineContext coroutineContext = cVar2.a;
                    if (!(coroutineContext instanceof c)) {
                        coroutineContext.getClass();
                        CoroutineContext.Element element2 = (CoroutineContext.Element) coroutineContext;
                        z = Intrinsics.d(cVar.get(element2.getKey()), element2);
                        break;
                    }
                    cVar2 = (c) coroutineContext;
                }
                if (z) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final Object fold(Object obj, Function2 function2) {
        return function2.invoke(this.a.fold(obj, function2), this.b);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final CoroutineContext.Element get(f fVar) {
        fVar.getClass();
        c cVar = this;
        while (true) {
            CoroutineContext.Element element = cVar.b.get(fVar);
            if (element != null) {
                return element;
            }
            CoroutineContext coroutineContext = cVar.a;
            if (!(coroutineContext instanceof c)) {
                return coroutineContext.get(fVar);
            }
            cVar = (c) coroutineContext;
        }
    }

    public final int hashCode() {
        return this.b.hashCode() + this.a.hashCode();
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final CoroutineContext minusKey(f fVar) {
        fVar.getClass();
        CoroutineContext.Element element = this.b;
        CoroutineContext.Element element2 = element.get(fVar);
        CoroutineContext coroutineContext = this.a;
        if (element2 != null) {
            return coroutineContext;
        }
        CoroutineContext minusKey = coroutineContext.minusKey(fVar);
        return minusKey == coroutineContext ? this : minusKey == g.a ? element : new c(element, minusKey);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final CoroutineContext plus(CoroutineContext coroutineContext) {
        coroutineContext.getClass();
        return coroutineContext == g.a ? this : (CoroutineContext) coroutineContext.fold(this, new fp5(11));
    }

    public final String toString() {
        return dfi.i(new StringBuilder("["), (String) fold("", new t83(16)), ']');
    }
}
