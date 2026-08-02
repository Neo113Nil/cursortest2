package defpackage;

import com.yandex.go.design.compose.colors.AppColor$Palette;
import java.util.Calendar;
import java.util.List;
import java.util.Set;
import kotlin.collections.EmptyList;
import kotlin.collections.EmptySet;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.communications.api.dto.ticket.TicketMode;
import ru.yandex.taxi.communications.api.dto.ticket.TicketTopAsset;

/* loaded from: classes5.dex */
public final class x3z0 {
    public final u2z0 a;
    public final u2z0 b;
    public final u2z0 c;
    public final TicketTopAsset d;
    public final f4z0 e;
    public final boolean f;
    public final wp2 g;
    public final Set h;
    public final List i;
    public final iqx j;
    public final Calendar k;
    public final List l;
    public final TicketMode m;
    public final nsz n;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ x3z0(int i) {
        this(r1, r2, r3, r4, null, true, r7, r8, r9, null, null, r9, r13, null);
        int i2 = 0;
        u2z0 u2z0Var = new u2z0(i2);
        u2z0 u2z0Var2 = new u2z0(i2);
        u2z0 u2z0Var3 = new u2z0(i2);
        TicketTopAsset ticketTopAsset = new TicketTopAsset(0);
        AppColor$Palette appColor$Palette = AppColor$Palette.BgMinor;
        EmptySet emptySet = EmptySet.a;
        TicketMode ticketMode = TicketMode.TICKET;
        EmptyList emptyList = EmptyList.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x3z0)) {
            return false;
        }
        x3z0 x3z0Var = (x3z0) obj;
        return jl40.l(this.a, x3z0Var.a) && jl40.l(this.b, x3z0Var.b) && jl40.l(this.c, x3z0Var.c) && jl40.l(this.d, x3z0Var.d) && jl40.l(this.e, x3z0Var.e) && this.f == x3z0Var.f && jl40.l(this.g, x3z0Var.g) && jl40.l(this.h, x3z0Var.h) && jl40.l(this.i, x3z0Var.i) && jl40.l(this.j, x3z0Var.j) && jl40.l(this.k, x3z0Var.k) && jl40.l(this.l, x3z0Var.l) && this.m == x3z0Var.m && jl40.l(this.n, x3z0Var.n);
    }

    public final int hashCode() {
        int hashCode = (this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31)) * 31;
        f4z0 f4z0Var = this.e;
        int c = unr0.c(g8e.e(this.h, n.b(this.g, unr0.e((hashCode + (f4z0Var == null ? 0 : f4z0Var.hashCode())) * 31, 31, this.f), 31), 31), 31, this.i);
        iqx iqxVar = this.j;
        int hashCode2 = (c + (iqxVar == null ? 0 : iqxVar.hashCode())) * 31;
        Calendar calendar = this.k;
        int hashCode3 = (this.m.hashCode() + unr0.c((hashCode2 + (calendar == null ? 0 : calendar.hashCode())) * 31, 31, this.l)) * 31;
        nsz nszVar = this.n;
        return hashCode3 + (nszVar != null ? nszVar.hashCode() : 0);
    }

    public final String toString() {
        return "TicketUiState(title=" + this.a + ", subtitle=" + this.b + ", policyText=" + this.c + ", topAsset=" + this.d + ", timer=" + this.e + ", allowBackwardAction=" + this.f + ", background=" + this.g + ", onShowFeatures=" + this.h + ", buttons=" + this.i + ", label=" + this.j + ", endDate=" + this.k + ", bottomButtons=" + this.l + ", mode=" + this.m + ", confettiComposition=" + this.n + Extension.C_BRAKE;
    }

    public x3z0(u2z0 u2z0Var, u2z0 u2z0Var2, u2z0 u2z0Var3, TicketTopAsset ticketTopAsset, f4z0 f4z0Var, boolean z, wp2 wp2Var, Set set, List list, iqx iqxVar, Calendar calendar, List list2, TicketMode ticketMode, nsz nszVar) {
        this.a = u2z0Var;
        this.b = u2z0Var2;
        this.c = u2z0Var3;
        this.d = ticketTopAsset;
        this.e = f4z0Var;
        this.f = z;
        this.g = wp2Var;
        this.h = set;
        this.i = list;
        this.j = iqxVar;
        this.k = calendar;
        this.l = list2;
        this.m = ticketMode;
        this.n = nszVar;
    }

    public x3z0() {
        this(0);
    }
}
