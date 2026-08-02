package defpackage;

import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.a;
import kotlin.text.StringsKt;

/* loaded from: classes5.dex */
public final class hm6 extends a implements mfs {
    public static final gos d = new gos(18);
    public final long c;

    public hm6(long j) {
        super(d);
        this.c = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hm6) && this.c == ((hm6) obj).c;
    }

    public final int hashCode() {
        return Long.hashCode(this.c);
    }

    @Override // defpackage.mfs
    public final void restoreThreadContext(CoroutineContext coroutineContext, Object obj) {
        Thread.currentThread().setName((String) obj);
    }

    public final String toString() {
        return eta.g(new StringBuilder("CoroutineId("), this.c, ')');
    }

    @Override // defpackage.mfs
    public final Object updateThreadContext(CoroutineContext coroutineContext) {
        String str;
        im6 im6Var = (im6) coroutineContext.get(im6.d);
        if (im6Var == null || (str = im6Var.c) == null) {
            str = "coroutine";
        }
        Thread currentThread = Thread.currentThread();
        String name = currentThread.getName();
        int V = StringsKt.V(6, name, " @");
        if (V < 0) {
            V = name.length();
        }
        StringBuilder sb = new StringBuilder(str.length() + V + 10);
        eta.k(0, V, name, " @", sb);
        sb.append(str);
        sb.append('#');
        sb.append(this.c);
        currentThread.setName(sb.toString());
        return name;
    }
}
