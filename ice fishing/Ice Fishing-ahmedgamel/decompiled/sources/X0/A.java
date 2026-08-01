package X0;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class A {

    /* renamed from: a, reason: collision with root package name */
    public final i f3575a;

    /* renamed from: b, reason: collision with root package name */
    public final Throwable f3576b;

    public A(i iVar) {
        this.f3575a = iVar;
        this.f3576b = null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof A)) {
            return false;
        }
        A a9 = (A) obj;
        i iVar = this.f3575a;
        if (iVar != null && iVar.equals(a9.f3575a)) {
            return true;
        }
        Throwable th = this.f3576b;
        if (th == null || a9.f3576b == null) {
            return false;
        }
        return th.toString().equals(th.toString());
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f3575a, this.f3576b});
    }

    public A(Throwable th) {
        this.f3576b = th;
        this.f3575a = null;
    }
}
