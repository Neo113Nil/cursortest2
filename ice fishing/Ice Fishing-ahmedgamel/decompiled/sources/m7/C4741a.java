package m7;

import java.util.concurrent.atomic.AtomicInteger;
import o7.C4810i;
import u1.h;

/* renamed from: m7.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4741a {

    /* renamed from: c, reason: collision with root package name */
    public static final AtomicInteger f39316c = new AtomicInteger(1);

    /* renamed from: a, reason: collision with root package name */
    public final int f39317a = f39316c.incrementAndGet();

    /* renamed from: b, reason: collision with root package name */
    public final C4810i f39318b;

    public C4741a(C4810i c4810i) {
        this.f39318b = c4810i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C4741a) {
            return this.f39317a == ((C4741a) obj).f39317a;
        }
        return false;
    }

    public final int hashCode() {
        return this.f39317a;
    }

    public final String toString() {
        return h.e(this.f39317a, "}", new StringBuilder("RegisteredReader{"));
    }
}
