package q6;

import java.lang.ref.WeakReference;

/* renamed from: q6.c, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4879c extends WeakReference {

    /* renamed from: a, reason: collision with root package name */
    public final int f40060a;

    public C4879c(Object obj, AbstractRunnableC4880d abstractRunnableC4880d) {
        super(obj, abstractRunnableC4880d);
        this.f40060a = System.identityHashCode(obj);
    }

    public final boolean equals(Object obj) {
        return obj instanceof C4879c ? ((C4879c) obj).get() == get() : obj.equals(this);
    }

    public final int hashCode() {
        return this.f40060a;
    }

    public final String toString() {
        return String.valueOf(get());
    }
}
