package t0;

import D1.i;
import J1.j;
import java.math.BigInteger;
import t1.h;

/* loaded from: classes.dex */
public final class f implements Comparable {

    /* renamed from: f, reason: collision with root package name */
    public static final f f4371f;

    /* renamed from: a, reason: collision with root package name */
    public final int f4372a;

    /* renamed from: b, reason: collision with root package name */
    public final int f4373b;

    /* renamed from: c, reason: collision with root package name */
    public final int f4374c;

    /* renamed from: d, reason: collision with root package name */
    public final String f4375d;
    public final h e = new h(new j(6, this));

    static {
        new f(0, 0, 0, "");
        f4371f = new f(0, 1, 0, "");
        new f(1, 0, 0, "");
    }

    public f(int i, int i2, int i3, String str) {
        this.f4372a = i;
        this.f4373b = i2;
        this.f4374c = i3;
        this.f4375d = str;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        f fVar = (f) obj;
        i.e(fVar, "other");
        Object value = this.e.getValue();
        i.d(value, "<get-bigInteger>(...)");
        Object value2 = fVar.e.getValue();
        i.d(value2, "<get-bigInteger>(...)");
        return ((BigInteger) value).compareTo((BigInteger) value2);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return this.f4372a == fVar.f4372a && this.f4373b == fVar.f4373b && this.f4374c == fVar.f4374c;
    }

    public final int hashCode() {
        return ((((527 + this.f4372a) * 31) + this.f4373b) * 31) + this.f4374c;
    }

    public final String toString() {
        String str = this.f4375d;
        return this.f4372a + '.' + this.f4373b + '.' + this.f4374c + (!K1.d.k0(str) ? i.h(str, "-") : "");
    }
}
