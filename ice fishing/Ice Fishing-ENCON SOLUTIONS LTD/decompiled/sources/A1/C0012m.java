package A1;

import java.util.concurrent.CancellationException;

/* renamed from: A1.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0012m {

    /* renamed from: a, reason: collision with root package name */
    public final Object f55a;

    /* renamed from: b, reason: collision with root package name */
    public final F f56b;

    /* renamed from: c, reason: collision with root package name */
    public final t1.l f57c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f58d;

    /* renamed from: e, reason: collision with root package name */
    public final Throwable f59e;

    public C0012m(Object obj, F f2, t1.l lVar, Object obj2, Throwable th) {
        this.f55a = obj;
        this.f56b = f2;
        this.f57c = lVar;
        this.f58d = obj2;
        this.f59e = th;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v2, types: [java.lang.Throwable] */
    public static C0012m a(C0012m c0012m, F f2, CancellationException cancellationException, int i2) {
        Object obj = c0012m.f55a;
        if ((i2 & 2) != 0) {
            f2 = c0012m.f56b;
        }
        F f3 = f2;
        t1.l lVar = c0012m.f57c;
        Object obj2 = c0012m.f58d;
        CancellationException cancellationException2 = cancellationException;
        if ((i2 & 16) != 0) {
            cancellationException2 = c0012m.f59e;
        }
        c0012m.getClass();
        return new C0012m(obj, f3, lVar, obj2, cancellationException2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0012m)) {
            return false;
        }
        C0012m c0012m = (C0012m) obj;
        return kotlin.jvm.internal.i.a(this.f55a, c0012m.f55a) && kotlin.jvm.internal.i.a(this.f56b, c0012m.f56b) && kotlin.jvm.internal.i.a(this.f57c, c0012m.f57c) && kotlin.jvm.internal.i.a(this.f58d, c0012m.f58d) && kotlin.jvm.internal.i.a(this.f59e, c0012m.f59e);
    }

    public final int hashCode() {
        Object obj = this.f55a;
        int hashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        F f2 = this.f56b;
        int hashCode2 = (hashCode + (f2 == null ? 0 : f2.hashCode())) * 31;
        t1.l lVar = this.f57c;
        int hashCode3 = (hashCode2 + (lVar == null ? 0 : lVar.hashCode())) * 31;
        Object obj2 = this.f58d;
        int hashCode4 = (hashCode3 + (obj2 == null ? 0 : obj2.hashCode())) * 31;
        Throwable th = this.f59e;
        return hashCode4 + (th != null ? th.hashCode() : 0);
    }

    public final String toString() {
        return "CompletedContinuation(result=" + this.f55a + ", cancelHandler=" + this.f56b + ", onCancellation=" + this.f57c + ", idempotentResume=" + this.f58d + ", cancelCause=" + this.f59e + ')';
    }

    public /* synthetic */ C0012m(Object obj, F f2, t1.l lVar, CancellationException cancellationException, int i2) {
        this(obj, (i2 & 2) != 0 ? null : f2, (i2 & 4) != 0 ? null : lVar, (Object) null, (i2 & 16) != 0 ? null : cancellationException);
    }
}
