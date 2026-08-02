package io.appmetrica.analytics.profile;

import io.appmetrica.analytics.impl.AbstractC0871y3;
import io.appmetrica.analytics.impl.C0555n5;
import io.appmetrica.analytics.impl.C0559n9;
import io.appmetrica.analytics.impl.C0588o9;
import io.appmetrica.analytics.impl.C0672r7;
import io.appmetrica.analytics.impl.C0744tl;
import io.appmetrica.analytics.impl.C0776uo;
import io.appmetrica.analytics.impl.C0778uq;
import io.appmetrica.analytics.impl.Hr;
import io.appmetrica.analytics.impl.To;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;

/* loaded from: classes4.dex */
public class BirthDateAttribute {
    private final C0672r7 a = new C0672r7("appmetrica_birth_date", new C0588o9(), new To());

    public final UserProfileUpdate a(Calendar calendar, String str, AbstractC0871y3 abstractC0871y3) {
        return new UserProfileUpdate(new C0778uq(this.a.c, new SimpleDateFormat(str).format(calendar.getTime()), new C0559n9(), new C0588o9(), abstractC0871y3));
    }

    public UserProfileUpdate<? extends Hr> withAge(int i) {
        int i2 = Calendar.getInstance(Locale.US).get(1) - i;
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        gregorianCalendar.set(1, i2);
        return a(gregorianCalendar, "yyyy", new C0555n5(this.a.b));
    }

    public UserProfileUpdate<? extends Hr> withAgeIfUndefined(int i) {
        int i2 = Calendar.getInstance(Locale.US).get(1) - i;
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        gregorianCalendar.set(1, i2);
        return a(gregorianCalendar, "yyyy", new C0776uo(this.a.b));
    }

    public UserProfileUpdate<? extends Hr> withBirthDate(int i, int i2) {
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        gregorianCalendar.set(1, i);
        gregorianCalendar.set(2, i2 - 1);
        gregorianCalendar.set(5, 1);
        return a(gregorianCalendar, "yyyy-MM", new C0555n5(this.a.b));
    }

    public UserProfileUpdate<? extends Hr> withBirthDateIfUndefined(int i, int i2) {
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        gregorianCalendar.set(1, i);
        gregorianCalendar.set(2, i2 - 1);
        gregorianCalendar.set(5, 1);
        return a(gregorianCalendar, "yyyy-MM", new C0776uo(this.a.b));
    }

    public UserProfileUpdate<? extends Hr> withValueReset() {
        return new UserProfileUpdate<>(new C0744tl(0, this.a.c, new C0588o9(), new To()));
    }

    public UserProfileUpdate<? extends Hr> withBirthDate(int i) {
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        gregorianCalendar.set(1, i);
        return a(gregorianCalendar, "yyyy", new C0555n5(this.a.b));
    }

    public UserProfileUpdate<? extends Hr> withBirthDateIfUndefined(int i) {
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        gregorianCalendar.set(1, i);
        return a(gregorianCalendar, "yyyy", new C0776uo(this.a.b));
    }

    public UserProfileUpdate<? extends Hr> withBirthDate(Calendar calendar) {
        return a(calendar, "yyyy-MM-dd", new C0555n5(this.a.b));
    }

    public UserProfileUpdate<? extends Hr> withBirthDateIfUndefined(Calendar calendar) {
        return a(calendar, "yyyy-MM-dd", new C0776uo(this.a.b));
    }

    public UserProfileUpdate<? extends Hr> withBirthDate(int i, int i2, int i3) {
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        gregorianCalendar.set(1, i);
        gregorianCalendar.set(2, i2 - 1);
        gregorianCalendar.set(5, i3);
        return a(gregorianCalendar, "yyyy-MM-dd", new C0555n5(this.a.b));
    }

    public UserProfileUpdate<? extends Hr> withBirthDateIfUndefined(int i, int i2, int i3) {
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        gregorianCalendar.set(1, i);
        gregorianCalendar.set(2, i2 - 1);
        gregorianCalendar.set(5, i3);
        return a(gregorianCalendar, "yyyy-MM-dd", new C0776uo(this.a.b));
    }
}
