package Q2;

import com.google.android.gms.internal.ads.C3067cm;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class D {

    /* renamed from: a, reason: collision with root package name */
    public final C0356a f2496a;

    /* renamed from: b, reason: collision with root package name */
    public final O2.d f2497b;

    public /* synthetic */ D(C0356a c0356a, O2.d dVar) {
        this.f2496a = c0356a;
        this.f2497b = dVar;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof D)) {
            D d9 = (D) obj;
            if (R2.w.l(this.f2496a, d9.f2496a) && R2.w.l(this.f2497b, d9.f2497b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f2496a, this.f2497b});
    }

    public final String toString() {
        C3067cm c3067cm = new C3067cm(this);
        c3067cm.B(this.f2496a, "key");
        c3067cm.B(this.f2497b, "feature");
        return c3067cm.toString();
    }
}
