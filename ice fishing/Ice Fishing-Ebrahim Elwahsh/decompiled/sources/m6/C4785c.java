package m6;

import java.lang.ref.WeakReference;

/* renamed from: m6.c, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4785c extends WeakReference {

    /* renamed from: a, reason: collision with root package name */
    public final int f39575a;

    public C4785c(Object obj, AbstractRunnableC4786d abstractRunnableC4786d) {
        super(obj, abstractRunnableC4786d);
        this.f39575a = System.identityHashCode(obj);
    }

    public final boolean equals(Object obj) {
        return obj instanceof C4785c ? ((C4785c) obj).get() == get() : obj.equals(this);
    }

    public final int hashCode() {
        return this.f39575a;
    }

    public final String toString() {
        return String.valueOf(get());
    }
}
