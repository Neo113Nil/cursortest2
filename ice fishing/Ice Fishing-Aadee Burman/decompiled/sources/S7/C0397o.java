package S7;

import java.util.concurrent.CancellationException;

/* renamed from: S7.o, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0397o {

    /* renamed from: a, reason: collision with root package name */
    public final Object f2977a;

    /* renamed from: b, reason: collision with root package name */
    public final C0387e f2978b;

    /* renamed from: c, reason: collision with root package name */
    public final I7.l f2979c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f2980d;

    /* renamed from: e, reason: collision with root package name */
    public final Throwable f2981e;

    public C0397o(Object obj, C0387e c0387e, I7.l lVar, Object obj2, Throwable th) {
        this.f2977a = obj;
        this.f2978b = c0387e;
        this.f2979c = lVar;
        this.f2980d = obj2;
        this.f2981e = th;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v2, types: [java.lang.Throwable] */
    public static C0397o a(C0397o c0397o, C0387e c0387e, CancellationException cancellationException, int i) {
        Object obj = c0397o.f2977a;
        if ((i & 2) != 0) {
            c0387e = c0397o.f2978b;
        }
        C0387e c0387e2 = c0387e;
        I7.l lVar = c0397o.f2979c;
        Object obj2 = c0397o.f2980d;
        CancellationException cancellationException2 = cancellationException;
        if ((i & 16) != 0) {
            cancellationException2 = c0397o.f2981e;
        }
        c0397o.getClass();
        return new C0397o(obj, c0387e2, lVar, obj2, cancellationException2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0397o)) {
            return false;
        }
        C0397o c0397o = (C0397o) obj;
        return kotlin.jvm.internal.h.a(this.f2977a, c0397o.f2977a) && kotlin.jvm.internal.h.a(this.f2978b, c0397o.f2978b) && kotlin.jvm.internal.h.a(this.f2979c, c0397o.f2979c) && kotlin.jvm.internal.h.a(this.f2980d, c0397o.f2980d) && kotlin.jvm.internal.h.a(this.f2981e, c0397o.f2981e);
    }

    public final int hashCode() {
        Object obj = this.f2977a;
        int hashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        C0387e c0387e = this.f2978b;
        int hashCode2 = (hashCode + (c0387e == null ? 0 : c0387e.hashCode())) * 31;
        I7.l lVar = this.f2979c;
        int hashCode3 = (hashCode2 + (lVar == null ? 0 : lVar.hashCode())) * 31;
        Object obj2 = this.f2980d;
        int hashCode4 = (hashCode3 + (obj2 == null ? 0 : obj2.hashCode())) * 31;
        Throwable th = this.f2981e;
        return hashCode4 + (th != null ? th.hashCode() : 0);
    }

    public final String toString() {
        return "CompletedContinuation(result=" + this.f2977a + ", cancelHandler=" + this.f2978b + ", onCancellation=" + this.f2979c + ", idempotentResume=" + this.f2980d + ", cancelCause=" + this.f2981e + ')';
    }

    public /* synthetic */ C0397o(Object obj, C0387e c0387e, I7.l lVar, CancellationException cancellationException, int i) {
        this(obj, (i & 2) != 0 ? null : c0387e, (i & 4) != 0 ? null : lVar, (Object) null, (i & 16) != 0 ? null : cancellationException);
    }
}
