package L0;

import java.util.concurrent.CancellationException;

/* renamed from: L0.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0055m {

    /* renamed from: a, reason: collision with root package name */
    public final Object f665a;

    /* renamed from: b, reason: collision with root package name */
    public final E f666b;

    /* renamed from: c, reason: collision with root package name */
    public final D0.l f667c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f668d;

    /* renamed from: e, reason: collision with root package name */
    public final Throwable f669e;

    public C0055m(Object obj, E e2, D0.l lVar, Object obj2, Throwable th) {
        this.f665a = obj;
        this.f666b = e2;
        this.f667c = lVar;
        this.f668d = obj2;
        this.f669e = th;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v2, types: [java.lang.Throwable] */
    public static C0055m a(C0055m c0055m, E e2, CancellationException cancellationException, int i2) {
        Object obj = c0055m.f665a;
        if ((i2 & 2) != 0) {
            e2 = c0055m.f666b;
        }
        E e3 = e2;
        D0.l lVar = c0055m.f667c;
        Object obj2 = c0055m.f668d;
        CancellationException cancellationException2 = cancellationException;
        if ((i2 & 16) != 0) {
            cancellationException2 = c0055m.f669e;
        }
        c0055m.getClass();
        return new C0055m(obj, e3, lVar, obj2, cancellationException2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0055m)) {
            return false;
        }
        C0055m c0055m = (C0055m) obj;
        return E0.i.a(this.f665a, c0055m.f665a) && E0.i.a(this.f666b, c0055m.f666b) && E0.i.a(this.f667c, c0055m.f667c) && E0.i.a(this.f668d, c0055m.f668d) && E0.i.a(this.f669e, c0055m.f669e);
    }

    public final int hashCode() {
        Object obj = this.f665a;
        int hashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        E e2 = this.f666b;
        int hashCode2 = (hashCode + (e2 == null ? 0 : e2.hashCode())) * 31;
        D0.l lVar = this.f667c;
        int hashCode3 = (hashCode2 + (lVar == null ? 0 : lVar.hashCode())) * 31;
        Object obj2 = this.f668d;
        int hashCode4 = (hashCode3 + (obj2 == null ? 0 : obj2.hashCode())) * 31;
        Throwable th = this.f669e;
        return hashCode4 + (th != null ? th.hashCode() : 0);
    }

    public final String toString() {
        return "CompletedContinuation(result=" + this.f665a + ", cancelHandler=" + this.f666b + ", onCancellation=" + this.f667c + ", idempotentResume=" + this.f668d + ", cancelCause=" + this.f669e + ')';
    }

    public /* synthetic */ C0055m(Object obj, E e2, D0.l lVar, CancellationException cancellationException, int i2) {
        this(obj, (i2 & 2) != 0 ? null : e2, (i2 & 4) != 0 ? null : lVar, (Object) null, (i2 & 16) != 0 ? null : cancellationException);
    }
}
