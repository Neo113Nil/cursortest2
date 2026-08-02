package defpackage;

import com.yandex.go.analytics.view_tracking.ViewVisibilityTracker$SingleState;
import com.yandex.go.analytics.view_tracking.polling.a;
import java.util.ArrayList;
import java.util.WeakHashMap;
import kotlin.time.DurationUnit;

/* loaded from: classes12.dex */
public final class ypf0 extends a {
    public static final fei0 k;
    public final WeakHashMap j;

    static {
        o430 o430Var = e3n.b;
        k = new fei0(0.5f, kp50.T(0.5d, DurationUnit.SECONDS));
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ypf0(gei0 gei0Var, tt2 tt2Var) {
        super(r6, ViewVisibilityTracker$SingleState.Initial, tt2Var);
        fei0 a = ((hei0) gei0Var).a();
        a = a == null ? k : a;
        double e = 1.0d / (e3n.e(a.b) / 1000.0d);
        this.i = e == 0.0d ? e3n.c : kp50.T(1.0d / e, DurationUnit.SECONDS);
        new ArrayList();
        this.j = new WeakHashMap();
    }
}
