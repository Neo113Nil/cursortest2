package q6;

import java.lang.ref.WeakReference;

/* renamed from: q6.c, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4930c extends WeakReference {

    /* renamed from: a, reason: collision with root package name */
    public final int f40246a;

    public C4930c(Object obj, AbstractRunnableC4931d abstractRunnableC4931d) {
        super(obj, abstractRunnableC4931d);
        this.f40246a = System.identityHashCode(obj);
    }

    public final boolean equals(Object obj) {
        return obj instanceof C4930c ? ((C4930c) obj).get() == get() : obj.equals(this);
    }

    public final int hashCode() {
        return this.f40246a;
    }

    public final String toString() {
        return String.valueOf(get());
    }
}
