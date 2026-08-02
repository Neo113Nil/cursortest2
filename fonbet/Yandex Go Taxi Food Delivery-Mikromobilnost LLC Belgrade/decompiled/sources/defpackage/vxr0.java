package defpackage;

import com.yandex.go.shortcuts.impl.analytic.ShortcutAnalyticsImpl$Type;
import java.util.ArrayList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class vxr0 {
    public ShortcutAnalyticsImpl$Type a;
    public yyr0 b;
    public String c;
    public String d;
    public String e;
    public b52 f;
    public final ArrayList g;
    public final ArrayList h;
    public final ArrayList i;
    public String j;
    public String k;

    public vxr0(int i) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        this.a = null;
        this.b = null;
        this.c = null;
        this.d = null;
        this.e = null;
        this.f = null;
        this.g = arrayList;
        this.h = arrayList2;
        this.i = arrayList3;
        this.j = null;
        this.k = null;
    }

    public final st0 a() {
        return new st0(this.a, this.b, this.f, this.c, this.d, this.e, this.g, this.h, this.i, this.j, this.k);
    }

    public final void b(String str) {
        this.k = str;
    }

    public final void c(String str) {
        this.e = str;
    }

    public final void d(String str) {
        this.j = str;
    }

    public final void e(String str) {
        this.d = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vxr0)) {
            return false;
        }
        vxr0 vxr0Var = (vxr0) obj;
        return this.a == vxr0Var.a && jl40.l(this.b, vxr0Var.b) && jl40.l(this.c, vxr0Var.c) && jl40.l(this.d, vxr0Var.d) && jl40.l(this.e, vxr0Var.e) && jl40.l(this.f, vxr0Var.f) && jl40.l(this.g, vxr0Var.g) && jl40.l(this.h, vxr0Var.h) && jl40.l(this.i, vxr0Var.i) && jl40.l(this.j, vxr0Var.j) && jl40.l(this.k, vxr0Var.k);
    }

    public final void f(yyr0 yyr0Var) {
        this.b = yyr0Var;
    }

    public final void g(b52 b52Var) {
        this.f = b52Var;
    }

    public final void h(String str) {
        this.c = str;
    }

    public final int hashCode() {
        ShortcutAnalyticsImpl$Type shortcutAnalyticsImpl$Type = this.a;
        int hashCode = (shortcutAnalyticsImpl$Type == null ? 0 : shortcutAnalyticsImpl$Type.hashCode()) * 31;
        yyr0 yyr0Var = this.b;
        int hashCode2 = (hashCode + (yyr0Var == null ? 0 : yyr0Var.hashCode())) * 31;
        String str = this.c;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.e;
        int hashCode5 = (hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 961;
        b52 b52Var = this.f;
        int b = ly3.b(ly3.b(ly3.b((hashCode5 + (b52Var == null ? 0 : b52Var.hashCode())) * 31, 31, this.g), 31, this.h), 31, this.i);
        String str4 = this.j;
        int hashCode6 = (b + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.k;
        return hashCode6 + (str5 != null ? str5.hashCode() : 0);
    }

    public final void i(ShortcutAnalyticsImpl$Type shortcutAnalyticsImpl$Type) {
        this.a = shortcutAnalyticsImpl$Type;
    }

    public final String toString() {
        ShortcutAnalyticsImpl$Type shortcutAnalyticsImpl$Type = this.a;
        yyr0 yyr0Var = this.b;
        String str = this.c;
        String str2 = this.d;
        String str3 = this.e;
        b52 b52Var = this.f;
        String str4 = this.j;
        String str5 = this.k;
        StringBuilder sb = new StringBuilder("Builder(type=");
        sb.append(shortcutAnalyticsImpl$Type);
        sb.append(", modelForPosition=");
        sb.append(yyr0Var);
        sb.append(", shortcutId=");
        g8e.D(sb, str, ", gridId=", str2, ", deeplink=");
        sb.append(str3);
        sb.append(", cardMode=null, service=");
        sb.append(b52Var);
        sb.append(", items=");
        sb.append(this.g);
        sb.append(", headers=");
        sb.append(this.h);
        sb.append(", shortcutsDisplay=");
        sb.append(this.i);
        sb.append(", eventPayload=");
        sb.append(str4);
        sb.append(", action=");
        return oyr.t(sb, str5, Extension.C_BRAKE);
    }

    public vxr0() {
        this(0);
    }
}
