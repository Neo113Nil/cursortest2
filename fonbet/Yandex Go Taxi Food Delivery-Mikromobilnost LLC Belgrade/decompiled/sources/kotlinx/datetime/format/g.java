package kotlinx.datetime.format;

import defpackage.e421;
import defpackage.ntf0;

/* loaded from: classes9.dex */
public abstract class g {
    public static final e421 a;
    public static final e421 b;
    public static final e421 c;

    static {
        f fVar = new f();
        OffsetFields$totalHoursAbs$1 offsetFields$totalHoursAbs$1 = OffsetFields$totalHoursAbs$1.b;
        a = new e421(new ntf0(offsetFields$totalHoursAbs$1, offsetFields$totalHoursAbs$1.getName()), 0, 18, fVar, 8);
        OffsetFields$minutesOfHour$1 offsetFields$minutesOfHour$1 = OffsetFields$minutesOfHour$1.b;
        b = new e421(new ntf0(offsetFields$minutesOfHour$1, offsetFields$minutesOfHour$1.getName()), 0, 59, fVar, 8);
        OffsetFields$secondsOfMinute$1 offsetFields$secondsOfMinute$1 = OffsetFields$secondsOfMinute$1.b;
        c = new e421(new ntf0(offsetFields$secondsOfMinute$1, offsetFields$secondsOfMinute$1.getName()), 0, 59, fVar, 8);
    }
}
