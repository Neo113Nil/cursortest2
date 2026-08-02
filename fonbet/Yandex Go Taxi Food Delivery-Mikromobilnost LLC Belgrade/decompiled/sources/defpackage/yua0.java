package defpackage;

import java.util.List;
import ru.yandex.taxi.perf.screen.PerformanceScreenName;
import ru.yandex.taxi.perf.screen.ScreenPerformanceState;

/* loaded from: classes6.dex */
public final class yua0 implements zua0 {
    public final PerformanceScreenName a;
    public final String b;
    public final dwa0 c;
    public final String d;
    public final long e;
    public final Long f;
    public final long g;
    public final ScreenPerformanceState h;
    public final List i;
    public final boolean j;

    public yua0(PerformanceScreenName performanceScreenName, String str, dwa0 dwa0Var, String str2, long j, Long l, long j2, ScreenPerformanceState screenPerformanceState, List list, boolean z) {
        this.a = performanceScreenName;
        this.b = str;
        this.c = dwa0Var;
        this.d = str2;
        this.e = j;
        this.f = l;
        this.g = j2;
        this.h = screenPerformanceState;
        this.i = list;
        this.j = z;
    }

    public final String a() {
        return this.d;
    }

    public final dwa0 b() {
        return this.c;
    }

    public final String c() {
        return this.b;
    }

    public final PerformanceScreenName d() {
        return this.a;
    }

    public final ScreenPerformanceState e() {
        return this.h;
    }
}
