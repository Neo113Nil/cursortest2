package kotlinx.datetime.format;

import defpackage.hrg;
import defpackage.jqv;
import defpackage.lqv;
import defpackage.o430;
import defpackage.oqv;
import defpackage.pb61;
import defpackage.qoi0;
import defpackage.vng;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.time.Instant;
import kotlinx.datetime.DateTimeFormatException;
import kotlinx.datetime.LocalTime;
import kotlinx.datetime.UtcOffset;

/* loaded from: classes9.dex */
public final class b {
    public static final o430 b;
    public final hrg a;

    static {
        qoi0.b(new MutablePropertyReference1Impl("monthNumber", 0, "getMonthNumber()Ljava/lang/Integer;", b.class));
        qoi0.b(new MutablePropertyReference1Impl("day", 0, "getDay()Ljava/lang/Integer;", b.class));
        qoi0.b(new MutablePropertyReference1Impl("dayOfMonth", 0, "getDayOfMonth()Ljava/lang/Integer;", b.class));
        qoi0.b(new MutablePropertyReference1Impl("dayOfYear", 0, "getDayOfYear()Ljava/lang/Integer;", b.class));
        qoi0.b(new MutablePropertyReference1Impl("hour", 0, "getHour()Ljava/lang/Integer;", b.class));
        qoi0.b(new MutablePropertyReference1Impl("hourOfAmPm", 0, "getHourOfAmPm()Ljava/lang/Integer;", b.class));
        qoi0.b(new MutablePropertyReference1Impl("minute", 0, "getMinute()Ljava/lang/Integer;", b.class));
        qoi0.b(new MutablePropertyReference1Impl("second", 0, "getSecond()Ljava/lang/Integer;", b.class));
        qoi0.b(new MutablePropertyReference1Impl("offsetHours", 0, "getOffsetHours()Ljava/lang/Integer;", b.class));
        qoi0.b(new MutablePropertyReference1Impl("offsetMinutesOfHour", 0, "getOffsetMinutesOfHour()Ljava/lang/Integer;", b.class));
        qoi0.b(new MutablePropertyReference1Impl("offsetSecondsOfMinute", 0, "getOffsetSecondsOfMinute()Ljava/lang/Integer;", b.class));
        b = new o430(21);
    }

    public b(hrg hrgVar) {
        this.a = hrgVar;
    }

    public static Instant a(b bVar) {
        hrg hrgVar = bVar.a;
        UtcOffset b2 = hrgVar.c.b();
        lqv lqvVar = hrgVar.b;
        LocalTime b3 = lqvVar.b();
        jqv copy = hrgVar.a.copy();
        oqv oqvVar = copy.a;
        Integer num = oqvVar.a;
        pb61.a(num, "year");
        oqvVar.a = Integer.valueOf(num.intValue() % 10000);
        try {
            long addExact = Math.addExact(Math.multiplyExact(r11.a.a.intValue() / 10000, 315569520000L), ((copy.c().h() * 86400) + b3.c()) - b2.a());
            Instant instant = Instant.a;
            Integer num2 = lqvVar.f;
            Instant m = vng.m(num2 != null ? num2.intValue() : 0, addExact);
            if (m.getEpochSeconds() == addExact) {
                return m;
            }
            throw new DateTimeFormatException("The parsed date is outside the range representable by Instant");
        } catch (ArithmeticException e) {
            throw new DateTimeFormatException("The parsed date is outside the range representable by Instant", e);
        }
    }

    public b() {
        this(new hrg(0));
    }
}
