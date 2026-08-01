package b7;

/* renamed from: b7.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0522b {

    /* renamed from: b, reason: collision with root package name */
    public static final C0522b f5423b = new C0522b(Integer.MAX_VALUE);

    /* renamed from: a, reason: collision with root package name */
    public final int f5424a;

    public C0522b(int i) {
        this.f5424a = i;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0522b)) {
            return false;
        }
        C0522b c0522b = (C0522b) obj;
        c0522b.getClass();
        return this.f5424a == c0522b.f5424a;
    }

    public final int hashCode() {
        return (-593379575) ^ this.f5424a;
    }

    public final String toString() {
        return u1.h.e(this.f5424a, "}", new StringBuilder("LogLimits{maxNumberOfAttributes=128, maxAttributeValueLength="));
    }
}
