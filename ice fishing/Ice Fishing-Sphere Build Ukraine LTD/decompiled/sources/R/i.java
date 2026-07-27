package R;

import D.W;
import java.math.BigInteger;
import t0.C0250e;

/* loaded from: classes.dex */
public final class i implements Comparable {

    /* renamed from: j, reason: collision with root package name */
    public static final i f939j;

    /* renamed from: e, reason: collision with root package name */
    public final int f940e;

    /* renamed from: f, reason: collision with root package name */
    public final int f941f;

    /* renamed from: g, reason: collision with root package name */
    public final int f942g;

    /* renamed from: h, reason: collision with root package name */
    public final String f943h;

    /* renamed from: i, reason: collision with root package name */
    public final C0250e f944i = new C0250e(new W(3, this));

    static {
        new i(0, 0, 0, "");
        f939j = new i(0, 1, 0, "");
        new i(1, 0, 0, "");
    }

    public i(int i2, int i3, int i4, String str) {
        this.f940e = i2;
        this.f941f = i3;
        this.f942g = i4;
        this.f943h = str;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        i iVar = (i) obj;
        E0.i.e(iVar, "other");
        Object a2 = this.f944i.a();
        E0.i.d(a2, "<get-bigInteger>(...)");
        Object a3 = iVar.f944i.a();
        E0.i.d(a3, "<get-bigInteger>(...)");
        return ((BigInteger) a2).compareTo((BigInteger) a3);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return this.f940e == iVar.f940e && this.f941f == iVar.f941f && this.f942g == iVar.f942g;
    }

    public final int hashCode() {
        return ((((527 + this.f940e) * 31) + this.f941f) * 31) + this.f942g;
    }

    public final String toString() {
        String str;
        String str2 = this.f943h;
        if (K0.h.Q(str2)) {
            str = "";
        } else {
            str = "-" + str2;
        }
        return this.f940e + '.' + this.f941f + '.' + this.f942g + str;
    }
}
