package defpackage;

import j$.time.ZonedDateTime;
import ru.yandex.music.R;

/* loaded from: classes5.dex */
public final class sv5 {
    public final dn9 a;
    public q26 b;
    public n c;
    public us5 d;

    public sv5(dn9 dn9Var) {
        this.a = dn9Var;
    }

    public final void a(us5 us5Var) {
        this.d = us5Var;
        q26 q26Var = this.b;
        if (q26Var == null) {
            return;
        }
        q26Var.v(new v13(3, this, us5Var));
        fu5 b = ((fw5) sk3.I(fw5.class)).b();
        uu5 uu5Var = b.b;
        wy5 wy5Var = new wy5(R.string.artist_concert_screen_buy_from, R.string.buy_ticket, R.string.buy_ticket);
        String b2 = b.b(us5Var);
        ZonedDateTime zonedDateTime = us5Var.h;
        String a = uu5Var.a(us5Var.e, wy5Var);
        q26 q26Var2 = this.b;
        zonedDateTime.getClass();
        String I = ((sld) uu5Var.f).I(zonedDateTime);
        zonedDateTime.getClass();
        ((ju5) uu5Var.d).getClass();
        String valueOf = String.valueOf(zonedDateTime.getDayOfMonth());
        zonedDateTime.getClass();
        q26Var2.y(I, valueOf, ((sld) uu5Var.g).I(zonedDateTime), us5Var.c, b2, us5Var.f, ((sld) uu5Var.j).I(zonedDateTime), a);
        this.b.l(!y7g.G(us5Var.n));
    }
}
