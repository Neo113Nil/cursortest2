package W;

import F.U;
import h1.C0237g;
import java.math.BigInteger;

/* loaded from: classes.dex */
public final class i implements Comparable {

    /* renamed from: f, reason: collision with root package name */
    public static final i f1849f;

    /* renamed from: a, reason: collision with root package name */
    public final int f1850a;

    /* renamed from: b, reason: collision with root package name */
    public final int f1851b;

    /* renamed from: c, reason: collision with root package name */
    public final int f1852c;

    /* renamed from: d, reason: collision with root package name */
    public final String f1853d;

    /* renamed from: e, reason: collision with root package name */
    public final C0237g f1854e = R1.d.y(new U(5, this));

    static {
        new i(0, 0, 0, "");
        f1849f = new i(0, 1, 0, "");
        new i(1, 0, 0, "");
    }

    public i(int i2, int i3, int i4, String str) {
        this.f1850a = i2;
        this.f1851b = i3;
        this.f1852c = i4;
        this.f1853d = str;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        i other = (i) obj;
        kotlin.jvm.internal.i.e(other, "other");
        Object a2 = this.f1854e.a();
        kotlin.jvm.internal.i.d(a2, "<get-bigInteger>(...)");
        Object a3 = other.f1854e.a();
        kotlin.jvm.internal.i.d(a3, "<get-bigInteger>(...)");
        return ((BigInteger) a2).compareTo((BigInteger) a3);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return this.f1850a == iVar.f1850a && this.f1851b == iVar.f1851b && this.f1852c == iVar.f1852c;
    }

    public final int hashCode() {
        return ((((527 + this.f1850a) * 31) + this.f1851b) * 31) + this.f1852c;
    }

    public final String toString() {
        String str;
        String str2 = this.f1853d;
        if (z1.g.a0(str2)) {
            str = "";
        } else {
            str = "-" + str2;
        }
        return this.f1850a + '.' + this.f1851b + '.' + this.f1852c + str;
    }
}
