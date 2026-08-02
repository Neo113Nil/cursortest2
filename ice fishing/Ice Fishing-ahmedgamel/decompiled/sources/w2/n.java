package w2;

import com.google.android.gms.internal.ads.C3067cm;
import com.onesignal.notifications.internal.badges.impl.shortcutbadger.impl.NewHtcHomeBadger;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public final String f41689a;

    /* renamed from: b, reason: collision with root package name */
    public final double f41690b;

    /* renamed from: c, reason: collision with root package name */
    public final double f41691c;

    /* renamed from: d, reason: collision with root package name */
    public final double f41692d;

    /* renamed from: e, reason: collision with root package name */
    public final int f41693e;

    public n(String str, double d9, double d10, double d11, int i) {
        this.f41689a = str;
        this.f41691c = d9;
        this.f41690b = d10;
        this.f41692d = d11;
        this.f41693e = i;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return R2.w.l(this.f41689a, nVar.f41689a) && this.f41690b == nVar.f41690b && this.f41691c == nVar.f41691c && this.f41693e == nVar.f41693e && Double.compare(this.f41692d, nVar.f41692d) == 0;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f41689a, Double.valueOf(this.f41690b), Double.valueOf(this.f41691c), Double.valueOf(this.f41692d), Integer.valueOf(this.f41693e)});
    }

    public final String toString() {
        C3067cm c3067cm = new C3067cm(this);
        c3067cm.B(this.f41689a, "name");
        c3067cm.B(Double.valueOf(this.f41691c), "minBound");
        c3067cm.B(Double.valueOf(this.f41690b), "maxBound");
        c3067cm.B(Double.valueOf(this.f41692d), "percent");
        c3067cm.B(Integer.valueOf(this.f41693e), NewHtcHomeBadger.COUNT);
        return c3067cm.toString();
    }
}
