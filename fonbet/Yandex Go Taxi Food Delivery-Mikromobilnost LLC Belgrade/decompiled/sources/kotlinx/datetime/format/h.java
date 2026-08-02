package kotlinx.datetime.format;

import defpackage.e421;
import defpackage.ntf0;
import defpackage.nys;
import defpackage.qxg;

/* loaded from: classes9.dex */
public abstract class h {
    public static final e421 a;
    public static final e421 b;
    public static final e421 c;
    public static final nys d;

    static {
        TimeFields$hour$1 timeFields$hour$1 = TimeFields$hour$1.b;
        a = new e421(new ntf0(timeFields$hour$1, timeFields$hour$1.getName()), 0, 23, null, 56);
        TimeFields$minute$1 timeFields$minute$1 = TimeFields$minute$1.b;
        b = new e421(new ntf0(timeFields$minute$1, timeFields$minute$1.getName()), 0, 59, null, 56);
        TimeFields$second$1 timeFields$second$1 = TimeFields$second$1.b;
        c = new e421(new ntf0(timeFields$second$1, timeFields$second$1.getName()), 0, 59, null, 40);
        d = new nys(new ntf0(TimeFields$fractionOfSecond$1.b, "nanosecond"), new qxg(0, 9), 10);
        TimeFields$amPm$1 timeFields$amPm$1 = TimeFields$amPm$1.b;
        new nys(new ntf0(timeFields$amPm$1, timeFields$amPm$1.getName()), null, 14);
        TimeFields$hourOfAmPm$1 timeFields$hourOfAmPm$1 = TimeFields$hourOfAmPm$1.b;
        new e421(new ntf0(timeFields$hourOfAmPm$1, timeFields$hourOfAmPm$1.getName()), 1, 12, null, 56);
    }
}
