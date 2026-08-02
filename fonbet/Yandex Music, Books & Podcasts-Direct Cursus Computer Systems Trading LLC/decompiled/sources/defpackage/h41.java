package defpackage;

import j$.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.List;
import ru.yandex.music.data.stores.WebPath$Storage;

/* loaded from: classes3.dex */
public final class h41 implements d41 {
    public final xdr a;

    public h41(t41 t41Var) {
        t41 t41Var2;
        Integer num = 15;
        if (t41Var == null) {
            int i = 12;
            ArrayList arrayList = new ArrayList(12);
            boolean z = false;
            int i2 = 0;
            while (i2 < i) {
                String concat = "City ".concat("1");
                String concat2 = "Place ".concat("1");
                ZonedDateTime parse = ZonedDateTime.parse("2018-06-01T20:00:00-00:00");
                parse.getClass();
                List c = t75.c(new jcv("https://avatars.yandex.net/get-music-content/9837405/427d593a.p.5007577/1000x1000", WebPath$Storage.AVATARS));
                uy5 uy5Var = new uy5(15000, "RUB", "₽");
                int i3 = i;
                int i4 = i2;
                c5b c5bVar = c5b.a;
                Integer num2 = num;
                ArrayList arrayList2 = arrayList;
                us5 us5Var = new us5("1", c5bVar, "Concert 1", c, uy5Var, "Со скидончиком", num2, parse, concat, concat2, "Ekaterinburg", "18+", c5bVar, "stub", null, null, ru5.b);
                String valueOf = String.valueOf(i4);
                ru5 ru5Var = new ru5("concert");
                valueOf.getClass();
                num = num2;
                arrayList2.add(new r21(us5Var, new pw5("Паста и Баста", ru5Var, "12+", "feb", valueOf, "fri", "Budapest", "Danube Arena", "20:00", "from 50€", null, "Cashback 30%", num, "7th of february, friday", "Cashback -5%")));
                i2 = i4 + 1;
                arrayList = arrayList2;
                i = i3;
                z = false;
            }
            t41Var2 = new r41("Молодой Планктон", arrayList, false);
        } else {
            t41Var2 = t41Var;
        }
        this.a = ydr.a(t41Var2);
    }

    @Override // defpackage.d41
    public final boolean b() {
        return false;
    }

    @Override // defpackage.d41
    public final void d(us5 us5Var, int i, boolean z, String str) {
        str.getClass();
    }

    @Override // defpackage.d41
    public final jmj e(hq5 hq5Var) {
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.Z(1114528350);
        imj imjVar = new imj();
        oq5Var.p(false);
        return imjVar;
    }

    @Override // defpackage.d41
    public final nw5 f(r21 r21Var, int i) {
        r21Var.getClass();
        return new mw5(r21Var.b);
    }

    @Override // defpackage.d41
    public final vdr getState() {
        return this.a;
    }

    @Override // defpackage.d41
    public final void c() {
    }
}
