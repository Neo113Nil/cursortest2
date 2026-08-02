package defpackage;

import com.yandex.go.taxi.intercity.dashboard.impl.presentation.state.IntercityDashboardButtons$IntercityDashboardButton$DashboardButtonStyle;

/* loaded from: classes14.dex */
public final class vaw {
    public static final vaw g = new vaw("", "", IntercityDashboardButtons$IntercityDashboardButton$DashboardButtonStyle.UNSUPPORTED, saw.a, uaw.e, false);
    public final String a;
    public final String b;
    public final IntercityDashboardButtons$IntercityDashboardButton$DashboardButtonStyle c;
    public final taw d;
    public final uaw e;
    public final boolean f;

    public vaw(String str, String str2, IntercityDashboardButtons$IntercityDashboardButton$DashboardButtonStyle intercityDashboardButtons$IntercityDashboardButton$DashboardButtonStyle, taw tawVar, uaw uawVar, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = intercityDashboardButtons$IntercityDashboardButton$DashboardButtonStyle;
        this.d = tawVar;
        this.e = uawVar;
        this.f = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vaw)) {
            return false;
        }
        vaw vawVar = (vaw) obj;
        return jl40.l(this.a, vawVar.a) && jl40.l(this.b, vawVar.b) && this.c == vawVar.c && this.d.equals(vawVar.d) && this.e.equals(vawVar.e) && this.f == vawVar.f;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f) + ((this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + unr0.b(this.a.hashCode() * 31, 31, this.b)) * 31)) * 31)) * 31);
    }
}
