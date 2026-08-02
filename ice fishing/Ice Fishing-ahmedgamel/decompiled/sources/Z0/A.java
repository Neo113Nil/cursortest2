package Z0;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class A {

    /* renamed from: a, reason: collision with root package name */
    public final i f3927a;

    /* renamed from: b, reason: collision with root package name */
    public final Throwable f3928b;

    public A(i iVar) {
        this.f3927a = iVar;
        this.f3928b = null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof A)) {
            return false;
        }
        A a9 = (A) obj;
        i iVar = this.f3927a;
        if (iVar != null && iVar.equals(a9.f3927a)) {
            return true;
        }
        Throwable th = this.f3928b;
        if (th == null || a9.f3928b == null) {
            return false;
        }
        return th.toString().equals(th.toString());
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f3927a, this.f3928b});
    }

    public A(Throwable th) {
        this.f3928b = th;
        this.f3927a = null;
    }
}
