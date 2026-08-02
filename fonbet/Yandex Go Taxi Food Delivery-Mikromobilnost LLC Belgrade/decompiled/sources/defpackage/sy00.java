package defpackage;

import kotlin.jvm.internal.MutablePropertyReference1Impl;
import ru.yandex.taxi.analytics.j;

/* loaded from: classes12.dex */
public final class sy00 {
    public static final /* synthetic */ kgx[] h = {new MutablePropertyReference1Impl("lastTrackedCommonEventsTime", 0, "getLastTrackedCommonEventsTime()J", sy00.class), new MutablePropertyReference1Impl("lastTrackedDeepActionEventTime", 0, "getLastTrackedDeepActionEventTime()J", sy00.class), new MutablePropertyReference1Impl("lastTrackedMainShownEventTime", 0, "getLastTrackedMainShownEventTime()J", sy00.class), new MutablePropertyReference1Impl("lastTrackedVerticalShownEventTime", 0, "getLastTrackedVerticalShownEventTime()J", sy00.class)};
    public final lx4 a;
    public final ma1 b;
    public final sme0 c;
    public final sme0 d;
    public final sme0 e;
    public final sme0 f;
    public final cm9 g;

    public sy00(ma1 ma1Var, lx4 lx4Var, dne0 dne0Var) {
        this.a = lx4Var;
        this.b = ma1Var;
        cne0 a = dne0Var.a("mt_adjust_event_tracker_preferences");
        int i = 0;
        this.c = new sme0(i, a, a, "last_tracked_event_time");
        this.d = new sme0(i, a, a, "last_tracked_deep_action_event_time");
        this.e = new sme0(i, a, a, "last_tracked_main_shown_event_time");
        this.f = new sme0(i, a, a, "last_tracked_vertical_shown_event_time");
        this.g = new cm9(1, this);
    }

    public final void a() {
        ((na1) this.b).getClass();
        String R = as6.R();
        kgx[] kgxVarArr = h;
        kgx kgxVar = kgxVarArr[3];
        sme0 sme0Var = this.f;
        long longValue = ((Number) sme0Var.getValue(this, kgxVar)).longValue();
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis < longValue + 1800000) {
            return;
        }
        ((j) this.a).v(R);
        sme0Var.setValue(this, kgxVarArr[3], Long.valueOf(currentTimeMillis));
    }
}
