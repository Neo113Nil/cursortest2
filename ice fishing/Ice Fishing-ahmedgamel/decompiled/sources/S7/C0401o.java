package S7;

import java.util.concurrent.CancellationException;

/* renamed from: S7.o, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0401o {

    /* renamed from: a, reason: collision with root package name */
    public final Object f3060a;

    /* renamed from: b, reason: collision with root package name */
    public final C0391e f3061b;

    /* renamed from: c, reason: collision with root package name */
    public final I7.l f3062c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f3063d;

    /* renamed from: e, reason: collision with root package name */
    public final Throwable f3064e;

    public C0401o(Object obj, C0391e c0391e, I7.l lVar, Object obj2, Throwable th) {
        this.f3060a = obj;
        this.f3061b = c0391e;
        this.f3062c = lVar;
        this.f3063d = obj2;
        this.f3064e = th;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v2, types: [java.lang.Throwable] */
    public static C0401o a(C0401o c0401o, C0391e c0391e, CancellationException cancellationException, int i) {
        Object obj = c0401o.f3060a;
        if ((i & 2) != 0) {
            c0391e = c0401o.f3061b;
        }
        C0391e c0391e2 = c0391e;
        I7.l lVar = c0401o.f3062c;
        Object obj2 = c0401o.f3063d;
        CancellationException cancellationException2 = cancellationException;
        if ((i & 16) != 0) {
            cancellationException2 = c0401o.f3064e;
        }
        c0401o.getClass();
        return new C0401o(obj, c0391e2, lVar, obj2, cancellationException2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0401o)) {
            return false;
        }
        C0401o c0401o = (C0401o) obj;
        return kotlin.jvm.internal.h.a(this.f3060a, c0401o.f3060a) && kotlin.jvm.internal.h.a(this.f3061b, c0401o.f3061b) && kotlin.jvm.internal.h.a(this.f3062c, c0401o.f3062c) && kotlin.jvm.internal.h.a(this.f3063d, c0401o.f3063d) && kotlin.jvm.internal.h.a(this.f3064e, c0401o.f3064e);
    }

    public final int hashCode() {
        Object obj = this.f3060a;
        int hashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        C0391e c0391e = this.f3061b;
        int hashCode2 = (hashCode + (c0391e == null ? 0 : c0391e.hashCode())) * 31;
        I7.l lVar = this.f3062c;
        int hashCode3 = (hashCode2 + (lVar == null ? 0 : lVar.hashCode())) * 31;
        Object obj2 = this.f3063d;
        int hashCode4 = (hashCode3 + (obj2 == null ? 0 : obj2.hashCode())) * 31;
        Throwable th = this.f3064e;
        return hashCode4 + (th != null ? th.hashCode() : 0);
    }

    public final String toString() {
        return "CompletedContinuation(result=" + this.f3060a + ", cancelHandler=" + this.f3061b + ", onCancellation=" + this.f3062c + ", idempotentResume=" + this.f3063d + ", cancelCause=" + this.f3064e + ')';
    }

    public /* synthetic */ C0401o(Object obj, C0391e c0391e, I7.l lVar, CancellationException cancellationException, int i) {
        this(obj, (i & 2) != 0 ? null : c0391e, (i & 4) != 0 ? null : lVar, (Object) null, (i & 16) != 0 ? null : cancellationException);
    }
}
