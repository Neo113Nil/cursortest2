package u2;

import com.onesignal.notifications.internal.badges.impl.shortcutbadger.impl.NewHtcHomeBadger;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public final String f41296a;

    /* renamed from: b, reason: collision with root package name */
    public final double f41297b;

    /* renamed from: c, reason: collision with root package name */
    public final double f41298c;

    /* renamed from: d, reason: collision with root package name */
    public final double f41299d;

    /* renamed from: e, reason: collision with root package name */
    public final int f41300e;

    public n(String str, double d2, double d9, double d10, int i) {
        this.f41296a = str;
        this.f41298c = d2;
        this.f41297b = d9;
        this.f41299d = d10;
        this.f41300e = i;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return P2.w.l(this.f41296a, nVar.f41296a) && this.f41297b == nVar.f41297b && this.f41298c == nVar.f41298c && this.f41300e == nVar.f41300e && Double.compare(this.f41299d, nVar.f41299d) == 0;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f41296a, Double.valueOf(this.f41297b), Double.valueOf(this.f41298c), Double.valueOf(this.f41299d), Integer.valueOf(this.f41300e)});
    }

    public final String toString() {
        S0.s sVar = new S0.s(this);
        sVar.f(this.f41296a, "name");
        sVar.f(Double.valueOf(this.f41298c), "minBound");
        sVar.f(Double.valueOf(this.f41297b), "maxBound");
        sVar.f(Double.valueOf(this.f41299d), "percent");
        sVar.f(Integer.valueOf(this.f41300e), NewHtcHomeBadger.COUNT);
        return sVar.toString();
    }
}
