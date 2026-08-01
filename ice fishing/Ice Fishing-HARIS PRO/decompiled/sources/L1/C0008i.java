package L1;

import java.util.concurrent.CancellationException;

/* renamed from: L1.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0008i {

    /* renamed from: a, reason: collision with root package name */
    public final Object f560a;

    /* renamed from: b, reason: collision with root package name */
    public final A f561b;

    /* renamed from: c, reason: collision with root package name */
    public final C1.l f562c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f563d;
    public final Throwable e;

    public C0008i(Object obj, A a2, C1.l lVar, Object obj2, Throwable th) {
        this.f560a = obj;
        this.f561b = a2;
        this.f562c = lVar;
        this.f563d = obj2;
        this.e = th;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v2, types: [java.lang.Throwable] */
    public static C0008i a(C0008i c0008i, A a2, CancellationException cancellationException, int i) {
        Object obj = c0008i.f560a;
        if ((i & 2) != 0) {
            a2 = c0008i.f561b;
        }
        A a3 = a2;
        C1.l lVar = c0008i.f562c;
        Object obj2 = c0008i.f563d;
        CancellationException cancellationException2 = cancellationException;
        if ((i & 16) != 0) {
            cancellationException2 = c0008i.e;
        }
        c0008i.getClass();
        return new C0008i(obj, a3, lVar, obj2, cancellationException2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0008i)) {
            return false;
        }
        C0008i c0008i = (C0008i) obj;
        return D1.i.a(this.f560a, c0008i.f560a) && D1.i.a(this.f561b, c0008i.f561b) && D1.i.a(this.f562c, c0008i.f562c) && D1.i.a(this.f563d, c0008i.f563d) && D1.i.a(this.e, c0008i.e);
    }

    public final int hashCode() {
        Object obj = this.f560a;
        int hashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        A a2 = this.f561b;
        int hashCode2 = (hashCode + (a2 == null ? 0 : a2.hashCode())) * 31;
        C1.l lVar = this.f562c;
        int hashCode3 = (hashCode2 + (lVar == null ? 0 : lVar.hashCode())) * 31;
        Object obj2 = this.f563d;
        int hashCode4 = (hashCode3 + (obj2 == null ? 0 : obj2.hashCode())) * 31;
        Throwable th = this.e;
        return hashCode4 + (th != null ? th.hashCode() : 0);
    }

    public final String toString() {
        return "CompletedContinuation(result=" + this.f560a + ", cancelHandler=" + this.f561b + ", onCancellation=" + this.f562c + ", idempotentResume=" + this.f563d + ", cancelCause=" + this.e + ')';
    }

    public /* synthetic */ C0008i(Object obj, A a2, C1.l lVar, CancellationException cancellationException, int i) {
        this(obj, (i & 2) != 0 ? null : a2, (i & 4) != 0 ? null : lVar, (Object) null, (i & 16) != 0 ? null : cancellationException);
    }
}
