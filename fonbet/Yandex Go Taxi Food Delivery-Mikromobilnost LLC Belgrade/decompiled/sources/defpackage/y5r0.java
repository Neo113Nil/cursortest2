package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.settings.api.dto.settings.types.MenuItemElementType;

/* loaded from: classes6.dex */
public final class y5r0 extends z5r0 {
    public final ul10 a;
    public final ul10 b;
    public final String c;
    public final MenuItemElementType d;
    public final ul10 e;
    public final ul10 f;
    public final String g;
    public final MenuItemElementType h;
    public final boolean i;
    public final z0g0 j;
    public final boolean k;
    public final String l;

    public y5r0(ul10 ul10Var, ul10 ul10Var2, String str, MenuItemElementType menuItemElementType, ul10 ul10Var3, ul10 ul10Var4, String str2, MenuItemElementType menuItemElementType2, boolean z, z0g0 z0g0Var, boolean z2) {
        this.a = ul10Var;
        this.b = ul10Var2;
        this.c = str;
        this.d = menuItemElementType;
        this.e = ul10Var3;
        this.f = ul10Var4;
        this.g = str2;
        this.h = menuItemElementType2;
        this.i = z;
        this.j = z0g0Var;
        this.k = z2;
        this.l = ul10Var.a;
    }

    public static y5r0 b(y5r0 y5r0Var, boolean z) {
        ul10 ul10Var = y5r0Var.a;
        ul10 ul10Var2 = y5r0Var.b;
        String str = y5r0Var.c;
        MenuItemElementType menuItemElementType = y5r0Var.d;
        ul10 ul10Var3 = y5r0Var.e;
        ul10 ul10Var4 = y5r0Var.f;
        String str2 = y5r0Var.g;
        MenuItemElementType menuItemElementType2 = y5r0Var.h;
        z0g0 z0g0Var = y5r0Var.j;
        boolean z2 = y5r0Var.k;
        y5r0Var.getClass();
        return new y5r0(ul10Var, ul10Var2, str, menuItemElementType, ul10Var3, ul10Var4, str2, menuItemElementType2, z, z0g0Var, z2);
    }

    @Override // defpackage.z5r0
    public final String a() {
        return this.l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof y5r0) {
            y5r0 y5r0Var = (y5r0) obj;
            if (jl40.l(this.a, y5r0Var.a) && jl40.l(this.b, y5r0Var.b) && jl40.l(this.c, y5r0Var.c) && this.d == y5r0Var.d && jl40.l(this.e, y5r0Var.e) && jl40.l(this.f, y5r0Var.f) && jl40.l(this.g, y5r0Var.g) && this.h == y5r0Var.h && this.i == y5r0Var.i && this.j == y5r0Var.j && this.k == y5r0Var.k) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        String str = this.c;
        int hashCode2 = (this.f.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + ((hashCode + (str == null ? 0 : str.hashCode())) * 31)) * 31)) * 31)) * 31;
        String str2 = this.g;
        return Boolean.hashCode(this.k) + ((this.j.hashCode() + unr0.e((this.h.hashCode() + ((hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31)) * 31, 31, this.i)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SettingItemModel(leadTitle=");
        sb.append(this.a);
        sb.append(", leadSubtitle=");
        sb.append(this.b);
        sb.append(", leadIconUrl=");
        sb.append(this.c);
        sb.append(", leadType=");
        sb.append(this.d);
        sb.append(", trailTitle=");
        sb.append(this.e);
        sb.append(", trailSubtitle=");
        sb.append(this.f);
        sb.append(", trailIconUrl=");
        sb.append(this.g);
        sb.append(", trailType=");
        sb.append(this.h);
        sb.append(", isToggled=");
        sb.append(this.i);
        sb.append(", channelModel=");
        sb.append(this.j);
        sb.append(", shouldDrawDivider=");
        return x4e.i(sb, this.k, Extension.C_BRAKE);
    }
}
