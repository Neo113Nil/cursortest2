package defpackage;

import com.yandex.go.analytics.AccountType;
import com.yandex.go.taxi.order.domain.repositories.e0;
import java.util.List;
import ru.yandex.taxi.am.f0;
import ru.yandex.taxi.object.DriveState;
import ru.yandex.taxi.startup.launch.h;

/* loaded from: classes.dex */
public final class w8h {
    public final h a;
    public final h3y b;
    public final h3y c;
    public final f0 d;
    public final rqd0 e;
    public final k42 f;
    public final w9w0 g;

    public w8h(h hVar, h3y h3yVar, h3y h3yVar2, f0 f0Var, rqd0 rqd0Var, k42 k42Var, w9w0 w9w0Var) {
        this.a = hVar;
        this.b = h3yVar;
        this.c = h3yVar2;
        this.d = f0Var;
        this.e = rqd0Var;
        this.f = k42Var;
        this.g = w9w0Var;
    }

    public final au50 a() {
        o2y0 o2y0Var;
        DriveState c;
        String name;
        h hVar = this.a;
        String Hg = hVar.Hg();
        String str = Hg == null ? "" : Hg;
        String l = ((cne0) hVar.b).l("phone_id", null);
        if (l == null) {
            l = "";
        }
        String Jg = hVar.Jg();
        String str2 = Jg == null ? "" : Jg;
        List a = ((nmx) this.c.get()).a();
        e0 e0Var = (e0) ((p2y0) this.b.get());
        String str3 = (!((Boolean) e0Var.e.getValue()).booleanValue() || (o2y0Var = (o2y0) e0Var.g.getValue()) == null || (c = o2y0Var.c()) == null || (name = c.name()) == null) ? "" : name;
        f0 f0Var = this.d;
        kj Ig = f0Var.a.Ig();
        long j = Ig != null ? Ig.a : 0L;
        AccountType d = wwg.d(f0Var.a.Ig());
        boolean z = ((qqd0) this.e.a.getValue()).b;
        String analyticsName = this.f.a.getAnalyticsName();
        String a2 = this.g.a();
        String str4 = a2 != null ? a2 : null;
        return new au50(str, l, str2, str3, j, analyticsName, str4 == null ? "" : str4, a, d, z);
    }
}
