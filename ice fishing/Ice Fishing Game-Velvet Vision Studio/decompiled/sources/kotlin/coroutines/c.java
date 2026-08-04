package kotlin.coroutines;

import com.gamericefishpro.space.r2.u;
import com.gamericefishpro.space.t0.y0;
import java.io.Serializable;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class c implements CoroutineContext, Serializable {
    public final CoroutineContext d;
    public final CoroutineContext.Element e;

    public c(CoroutineContext.Element element, CoroutineContext left) {
        Intrinsics.checkNotNullParameter(left, "left");
        Intrinsics.checkNotNullParameter(element, "element");
        this.d = left;
        this.e = element;
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final CoroutineContext K(f key) {
        Intrinsics.checkNotNullParameter(key, "key");
        CoroutineContext.Element element = this.e;
        CoroutineContext.Element elementJ = element.j(key);
        CoroutineContext coroutineContext = this.d;
        if (elementJ != null) {
            return coroutineContext;
        }
        CoroutineContext coroutineContextK = coroutineContext.K(key);
        if (coroutineContextK == coroutineContext) {
            return this;
        }
        return coroutineContextK == g.d ? element : new c(element, coroutineContextK);
    }

    public final boolean equals(Object obj) {
        boolean zA;
        if (this == obj) {
            return true;
        }
        if (obj instanceof c) {
            c cVar = (c) obj;
            int i = 2;
            c cVar2 = cVar;
            int i2 = 2;
            while (true) {
                CoroutineContext coroutineContext = cVar2.d;
                cVar2 = coroutineContext instanceof c ? (c) coroutineContext : null;
                if (cVar2 == null) {
                    break;
                }
                i2++;
            }
            c cVar3 = this;
            while (true) {
                CoroutineContext coroutineContext2 = cVar3.d;
                cVar3 = coroutineContext2 instanceof c ? (c) coroutineContext2 : null;
                if (cVar3 == null) {
                    break;
                }
                i++;
            }
            if (i2 == i) {
                c cVar4 = this;
                while (true) {
                    CoroutineContext.Element element = cVar4.e;
                    if (!Intrinsics.a(cVar.j(element.getKey()), element)) {
                        zA = false;
                        break;
                    }
                    CoroutineContext coroutineContext3 = cVar4.d;
                    if (!(coroutineContext3 instanceof c)) {
                        Intrinsics.c(coroutineContext3, "null cannot be cast to non-null type kotlin.coroutines.CoroutineContext.Element");
                        CoroutineContext.Element element2 = (CoroutineContext.Element) coroutineContext3;
                        zA = Intrinsics.a(cVar.j(element2.getKey()), element2);
                        break;
                    }
                    cVar4 = (c) coroutineContext3;
                }
                if (zA) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.e.hashCode() + this.d.hashCode();
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final CoroutineContext.Element j(f key) {
        Intrinsics.checkNotNullParameter(key, "key");
        c cVar = this;
        while (true) {
            CoroutineContext.Element elementJ = cVar.e.j(key);
            if (elementJ != null) {
                return elementJ;
            }
            CoroutineContext coroutineContext = cVar.d;
            if (!(coroutineContext instanceof c)) {
                return coroutineContext.j(key);
            }
            cVar = (c) coroutineContext;
        }
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final CoroutineContext o(CoroutineContext context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return context == g.d ? this : (CoroutineContext) context.w(this, new u(20));
    }

    public final String toString() {
        return y0.i(new StringBuilder("["), (String) w("", new u(19)), ']');
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final Object w(Object obj, Function2 operation) {
        Intrinsics.checkNotNullParameter(operation, "operation");
        return operation.invoke(this.d.w(obj, operation), this.e);
    }
}
