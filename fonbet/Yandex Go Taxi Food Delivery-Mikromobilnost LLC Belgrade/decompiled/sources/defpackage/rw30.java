package defpackage;

import java.util.Map;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.masstransit.experiment.f;
import ru.yandex.taxi.masstransit.geopayment.tickets.model.a;
import ru.yandex.taxi.theme.ThemeType;

/* loaded from: classes6.dex */
public final class rw30 {
    public final su30 a;
    public final Map b;
    public final ThemeType c;
    public final fc30 d;
    public final f e;
    public final pd01 f;
    public final String g;
    public final a h;

    public rw30(su30 su30Var, Map map, ThemeType themeType, fc30 fc30Var, f fVar, pd01 pd01Var, String str, a aVar) {
        this.a = su30Var;
        this.b = map;
        this.c = themeType;
        this.d = fc30Var;
        this.e = fVar;
        this.f = pd01Var;
        this.g = str;
        this.h = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rw30)) {
            return false;
        }
        rw30 rw30Var = (rw30) obj;
        return jl40.l(this.a, rw30Var.a) && jl40.l(this.b, rw30Var.b) && this.c == rw30Var.c && jl40.l(this.d, rw30Var.d) && jl40.l(this.e, rw30Var.e) && jl40.l(this.f, rw30Var.f) && this.g.equals(rw30Var.g) && jl40.l(this.h, rw30Var.h);
    }

    public final int hashCode() {
        int hashCode = (this.d.hashCode() + ((this.c.hashCode() + unr0.d(this.a.hashCode() * 31, 31, this.b)) * 31)) * 31;
        f fVar = this.e;
        return this.h.a.hashCode() + unr0.b((this.f.hashCode() + ((hashCode + (fVar == null ? 0 : fVar.hashCode())) * 31)) * 31, 31, this.g);
    }

    public final String toString() {
        return "MtRouteState(route=" + this.a + ", schedules=" + this.b + ", themeType=" + this.c + ", addressIcons=" + this.d + ", transportOnSummaryConfig=" + this.e + ", trainsFlowConfig=" + this.f + ", intermediatePointText=" + this.g + ", paymentTickets=" + this.h + Extension.C_BRAKE;
    }
}
