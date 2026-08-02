package m7;

import java.util.concurrent.atomic.AtomicInteger;
import o7.C4814i;
import w.AbstractC5128c;

/* renamed from: m7.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4755a {

    /* renamed from: c, reason: collision with root package name */
    public static final AtomicInteger f39475c = new AtomicInteger(1);

    /* renamed from: a, reason: collision with root package name */
    public final int f39476a = f39475c.incrementAndGet();

    /* renamed from: b, reason: collision with root package name */
    public final C4814i f39477b;

    public C4755a(C4814i c4814i) {
        this.f39477b = c4814i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C4755a) {
            return this.f39476a == ((C4755a) obj).f39476a;
        }
        return false;
    }

    public final int hashCode() {
        return this.f39476a;
    }

    public final String toString() {
        return AbstractC5128c.e(this.f39476a, "}", new StringBuilder("RegisteredReader{"));
    }
}
