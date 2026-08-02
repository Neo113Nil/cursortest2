package defpackage;

import java.util.Calendar;
import ru.yandex.taxi.common_models.net.NotificationParams;

/* loaded from: classes13.dex */
public final class sq1 {
    public final jtq0 a;
    public final cne0 b;
    public int c;
    public int d;
    public Calendar e;

    public sq1(jtq0 jtq0Var, cne0 cne0Var) {
        this.a = jtq0Var;
        this.b = cne0Var;
        this.d = cne0Var.i("ALERT_COUNT", 0);
        long j = cne0Var.j("DUE_TIMER", 0L);
        if (j > 0) {
            Calendar calendar = Calendar.getInstance();
            calendar.setTimeInMillis(j);
            this.e = calendar;
        }
    }

    public final void a() {
        vez0.h0();
        this.c++;
        int i = this.d + 1;
        this.d = i;
        this.b.p(i, "ALERT_COUNT");
    }

    public final boolean b(NotificationParams notificationParams) {
        Calendar calendar = notificationParams.c;
        this.e = calendar;
        long timeInMillis = calendar != null ? calendar.getTimeInMillis() : 0L;
        cne0 cne0Var = this.b;
        cne0Var.q(timeInMillis, "DUE_TIMER");
        if (this.e != null && this.a.b(null).after(this.e)) {
            vez0.h0();
            this.c = 0;
            vez0.h0();
            this.d = 0;
            cne0Var.a();
            this.e = null;
        }
        return this.d < notificationParams.b && this.c < notificationParams.a;
    }
}
