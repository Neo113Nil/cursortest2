package K0;

import java.util.concurrent.CancellationException;

/* renamed from: K0.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0037m {

    /* renamed from: a, reason: collision with root package name */
    public final Object f517a;

    /* renamed from: b, reason: collision with root package name */
    public final E f518b;

    /* renamed from: c, reason: collision with root package name */
    public final D0.l f519c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f520d;

    /* renamed from: e, reason: collision with root package name */
    public final Throwable f521e;

    public C0037m(Object obj, E e2, D0.l lVar, Object obj2, Throwable th) {
        this.f517a = obj;
        this.f518b = e2;
        this.f519c = lVar;
        this.f520d = obj2;
        this.f521e = th;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v2, types: [java.lang.Throwable] */
    public static C0037m a(C0037m c0037m, E e2, CancellationException cancellationException, int i2) {
        Object obj = c0037m.f517a;
        if ((i2 & 2) != 0) {
            e2 = c0037m.f518b;
        }
        E e3 = e2;
        D0.l lVar = c0037m.f519c;
        Object obj2 = c0037m.f520d;
        CancellationException cancellationException2 = cancellationException;
        if ((i2 & 16) != 0) {
            cancellationException2 = c0037m.f521e;
        }
        c0037m.getClass();
        return new C0037m(obj, e3, lVar, obj2, cancellationException2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0037m)) {
            return false;
        }
        C0037m c0037m = (C0037m) obj;
        return E0.i.a(this.f517a, c0037m.f517a) && E0.i.a(this.f518b, c0037m.f518b) && E0.i.a(this.f519c, c0037m.f519c) && E0.i.a(this.f520d, c0037m.f520d) && E0.i.a(this.f521e, c0037m.f521e);
    }

    public final int hashCode() {
        Object obj = this.f517a;
        int hashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        E e2 = this.f518b;
        int hashCode2 = (hashCode + (e2 == null ? 0 : e2.hashCode())) * 31;
        D0.l lVar = this.f519c;
        int hashCode3 = (hashCode2 + (lVar == null ? 0 : lVar.hashCode())) * 31;
        Object obj2 = this.f520d;
        int hashCode4 = (hashCode3 + (obj2 == null ? 0 : obj2.hashCode())) * 31;
        Throwable th = this.f521e;
        return hashCode4 + (th != null ? th.hashCode() : 0);
    }

    public final String toString() {
        return "CompletedContinuation(result=" + this.f517a + ", cancelHandler=" + this.f518b + ", onCancellation=" + this.f519c + ", idempotentResume=" + this.f520d + ", cancelCause=" + this.f521e + ')';
    }

    public /* synthetic */ C0037m(Object obj, E e2, D0.l lVar, CancellationException cancellationException, int i2) {
        this(obj, (i2 & 2) != 0 ? null : e2, (i2 & 4) != 0 ? null : lVar, (Object) null, (i2 & 16) != 0 ? null : cancellationException);
    }
}
