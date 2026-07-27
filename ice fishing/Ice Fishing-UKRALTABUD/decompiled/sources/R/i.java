package R;

import D.W;
import java.math.BigInteger;

/* loaded from: classes.dex */
public final class i implements Comparable {

    /* renamed from: k, reason: collision with root package name */
    public static final i f931k;

    /* renamed from: f, reason: collision with root package name */
    public final int f932f;

    /* renamed from: g, reason: collision with root package name */
    public final int f933g;

    /* renamed from: h, reason: collision with root package name */
    public final int f934h;

    /* renamed from: i, reason: collision with root package name */
    public final String f935i;

    /* renamed from: j, reason: collision with root package name */
    public final t0.e f936j = new t0.e(new W(3, this));

    static {
        new i(0, 0, 0, "");
        f931k = new i(0, 1, 0, "");
        new i(1, 0, 0, "");
    }

    public i(int i2, int i3, int i4, String str) {
        this.f932f = i2;
        this.f933g = i3;
        this.f934h = i4;
        this.f935i = str;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        i iVar = (i) obj;
        E0.i.e(iVar, "other");
        Object a2 = this.f936j.a();
        E0.i.d(a2, "<get-bigInteger>(...)");
        Object a3 = iVar.f936j.a();
        E0.i.d(a3, "<get-bigInteger>(...)");
        return ((BigInteger) a2).compareTo((BigInteger) a3);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return this.f932f == iVar.f932f && this.f933g == iVar.f933g && this.f934h == iVar.f934h;
    }

    public final int hashCode() {
        return ((((527 + this.f932f) * 31) + this.f933g) * 31) + this.f934h;
    }

    public final String toString() {
        String str;
        String str2 = this.f935i;
        if (J0.h.Q(str2)) {
            str = "";
        } else {
            str = "-" + str2;
        }
        return this.f932f + '.' + this.f933g + '.' + this.f934h + str;
    }
}
