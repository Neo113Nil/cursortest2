package defpackage;

import ru.yandex.taxi.perf.screen.PerformanceScreenName;

/* loaded from: classes6.dex */
public final class wes implements xes {
    public final PerformanceScreenName a;
    public final String b;
    public final String c;
    public final String d;

    public wes(PerformanceScreenName performanceScreenName, String str, String str2, String str3) {
        this.a = performanceScreenName;
        this.b = str;
        this.c = str2;
        this.d = str3;
    }

    public final String a() {
        return this.c;
    }

    public final String b() {
        return this.d;
    }

    @Override // defpackage.xes
    public final PerformanceScreenName c() {
        return this.a;
    }

    public final String d() {
        return this.b;
    }
}
