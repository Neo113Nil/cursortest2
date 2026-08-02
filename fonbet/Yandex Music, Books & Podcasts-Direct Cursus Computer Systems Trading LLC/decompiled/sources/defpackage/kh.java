package defpackage;

import com.yandex.pulse.histogram.ComponentHistograms;

/* loaded from: classes5.dex */
public final class kh {
    public static final lyd a;
    public static final lyd b;
    public static final lyd c;

    static {
        Object obj = ComponentHistograms.b;
        a = xee.B().b("ApplicationForegroundStateSeconds", 0, 10800, 100);
        b = xee.B().b("ApplicationBackgroundStateSeconds", 0, 10800, 100);
        c = xee.B().b("ApplicationStateSwitchPerHour", 0, 1000, 50);
    }
}
