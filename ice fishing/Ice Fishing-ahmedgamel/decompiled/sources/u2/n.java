package u2;

import com.onesignal.notifications.internal.badges.impl.shortcutbadger.impl.NewHtcHomeBadger;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public final String f41299a;

    /* renamed from: b, reason: collision with root package name */
    public final double f41300b;

    /* renamed from: c, reason: collision with root package name */
    public final double f41301c;

    /* renamed from: d, reason: collision with root package name */
    public final double f41302d;

    /* renamed from: e, reason: collision with root package name */
    public final int f41303e;

    public n(String str, double d2, double d9, double d10, int i) {
        this.f41299a = str;
        this.f41301c = d2;
        this.f41300b = d9;
        this.f41302d = d10;
        this.f41303e = i;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return P2.w.l(this.f41299a, nVar.f41299a) && this.f41300b == nVar.f41300b && this.f41301c == nVar.f41301c && this.f41303e == nVar.f41303e && Double.compare(this.f41302d, nVar.f41302d) == 0;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f41299a, Double.valueOf(this.f41300b), Double.valueOf(this.f41301c), Double.valueOf(this.f41302d), Integer.valueOf(this.f41303e)});
    }

    public final String toString() {
        S0.s sVar = new S0.s(this);
        sVar.f(this.f41299a, "name");
        sVar.f(Double.valueOf(this.f41301c), "minBound");
        sVar.f(Double.valueOf(this.f41300b), "maxBound");
        sVar.f(Double.valueOf(this.f41302d), "percent");
        sVar.f(Integer.valueOf(this.f41303e), NewHtcHomeBadger.COUNT);
        return sVar.toString();
    }
}
