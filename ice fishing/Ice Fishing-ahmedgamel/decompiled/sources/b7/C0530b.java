package b7;

import w.AbstractC5128c;

/* renamed from: b7.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0530b {

    /* renamed from: b, reason: collision with root package name */
    public static final C0530b f5573b = new C0530b(Integer.MAX_VALUE);

    /* renamed from: a, reason: collision with root package name */
    public final int f5574a;

    public C0530b(int i) {
        this.f5574a = i;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0530b)) {
            return false;
        }
        C0530b c0530b = (C0530b) obj;
        c0530b.getClass();
        return this.f5574a == c0530b.f5574a;
    }

    public final int hashCode() {
        return (-593379575) ^ this.f5574a;
    }

    public final String toString() {
        return AbstractC5128c.e(this.f5574a, "}", new StringBuilder("LogLimits{maxNumberOfAttributes=128, maxAttributeValueLength="));
    }
}
