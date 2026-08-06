package io.appmetrica.analytics.profile;

import io.appmetrica.analytics.impl.Bi;
import io.appmetrica.analytics.impl.C0272a8;
import io.appmetrica.analytics.impl.C0733s4;
import io.appmetrica.analytics.impl.C0761t6;
import io.appmetrica.analytics.impl.C0906yl;
import io.appmetrica.analytics.impl.InterfaceC0391eo;
import io.appmetrica.analytics.impl.J2;
import io.appmetrica.analytics.impl.Xk;
import io.appmetrica.analytics.impl.Ym;
import io.appmetrica.analytics.impl.Z7;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;

/* loaded from: classes.dex */
public class BirthDateAttribute {

    /* renamed from: a, reason: collision with root package name */
    private final C0761t6 f7545a = new C0761t6("appmetrica_birth_date", new C0272a8(), new C0906yl());

    public final UserProfileUpdate a(Calendar calendar, String str, J2 j2) {
        return new UserProfileUpdate(new Ym(this.f7545a.f6936c, new SimpleDateFormat(str).format(calendar.getTime()), new Z7(), new C0272a8(), j2));
    }

    public UserProfileUpdate<? extends InterfaceC0391eo> withAge(int i2) {
        int i3 = Calendar.getInstance(Locale.US).get(1) - i2;
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        gregorianCalendar.set(1, i3);
        return a(gregorianCalendar, "yyyy", new C0733s4(this.f7545a.f6935b));
    }

    public UserProfileUpdate<? extends InterfaceC0391eo> withAgeIfUndefined(int i2) {
        int i3 = Calendar.getInstance(Locale.US).get(1) - i2;
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        gregorianCalendar.set(1, i3);
        return a(gregorianCalendar, "yyyy", new Xk(this.f7545a.f6935b));
    }

    public UserProfileUpdate<? extends InterfaceC0391eo> withBirthDate(Calendar calendar) {
        return a(calendar, "yyyy-MM-dd", new C0733s4(this.f7545a.f6935b));
    }

    public UserProfileUpdate<? extends InterfaceC0391eo> withBirthDateIfUndefined(Calendar calendar) {
        return a(calendar, "yyyy-MM-dd", new Xk(this.f7545a.f6935b));
    }

    public UserProfileUpdate<? extends InterfaceC0391eo> withValueReset() {
        return new UserProfileUpdate<>(new Bi(0, this.f7545a.f6936c, new C0272a8(), new C0906yl()));
    }

    public UserProfileUpdate<? extends InterfaceC0391eo> withBirthDate(int i2) {
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        gregorianCalendar.set(1, i2);
        return a(gregorianCalendar, "yyyy", new C0733s4(this.f7545a.f6935b));
    }

    public UserProfileUpdate<? extends InterfaceC0391eo> withBirthDateIfUndefined(int i2) {
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        gregorianCalendar.set(1, i2);
        return a(gregorianCalendar, "yyyy", new Xk(this.f7545a.f6935b));
    }

    public UserProfileUpdate<? extends InterfaceC0391eo> withBirthDate(int i2, int i3) {
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        gregorianCalendar.set(1, i2);
        gregorianCalendar.set(2, i3 - 1);
        gregorianCalendar.set(5, 1);
        return a(gregorianCalendar, "yyyy-MM", new C0733s4(this.f7545a.f6935b));
    }

    public UserProfileUpdate<? extends InterfaceC0391eo> withBirthDateIfUndefined(int i2, int i3) {
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        gregorianCalendar.set(1, i2);
        gregorianCalendar.set(2, i3 - 1);
        gregorianCalendar.set(5, 1);
        return a(gregorianCalendar, "yyyy-MM", new Xk(this.f7545a.f6935b));
    }

    public UserProfileUpdate<? extends InterfaceC0391eo> withBirthDate(int i2, int i3, int i4) {
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        gregorianCalendar.set(1, i2);
        gregorianCalendar.set(2, i3 - 1);
        gregorianCalendar.set(5, i4);
        return a(gregorianCalendar, "yyyy-MM-dd", new C0733s4(this.f7545a.f6935b));
    }

    public UserProfileUpdate<? extends InterfaceC0391eo> withBirthDateIfUndefined(int i2, int i3, int i4) {
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        gregorianCalendar.set(1, i2);
        gregorianCalendar.set(2, i3 - 1);
        gregorianCalendar.set(5, i4);
        return a(gregorianCalendar, "yyyy-MM-dd", new Xk(this.f7545a.f6935b));
    }
}
