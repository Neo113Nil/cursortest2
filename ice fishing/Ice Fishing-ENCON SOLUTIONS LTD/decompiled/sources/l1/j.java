package l1;

import java.io.Serializable;
import t1.p;

/* loaded from: classes.dex */
public final class j implements i, Serializable {

    /* renamed from: a, reason: collision with root package name */
    public static final j f8138a = new j();

    @Override // l1.i
    public final i c(h key) {
        kotlin.jvm.internal.i.e(key, "key");
        return this;
    }

    public final int hashCode() {
        return 0;
    }

    @Override // l1.i
    public final i l(i context) {
        kotlin.jvm.internal.i.e(context, "context");
        return context;
    }

    @Override // l1.i
    public final g m(h key) {
        kotlin.jvm.internal.i.e(key, "key");
        return null;
    }

    public final String toString() {
        return "EmptyCoroutineContext";
    }

    @Override // l1.i
    public final Object k(Object obj, p pVar) {
        return obj;
    }
}
