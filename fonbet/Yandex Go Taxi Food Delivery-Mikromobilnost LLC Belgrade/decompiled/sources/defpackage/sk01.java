package defpackage;

import com.ybsdk.core.utils.text.Text;
import com.ybsdk.widgets.common.YbButtonViewGroup;
import java.util.ArrayList;
import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class sk01 {
    public final rbv a;
    public final vty0 b;
    public final vty0 c;
    public final stz0 d;
    public final qc70 e;
    public final Text f;
    public final List g;
    public final x49 h;
    public final String i;
    public final boolean j;
    public final YbButtonViewGroup.b k;
    public final rr51 l;
    public final ArrayList m;

    public sk01(rbv rbvVar, vty0 vty0Var, vty0 vty0Var2, stz0 stz0Var, qc70 qc70Var, Text.Constant constant, List list, x49 x49Var, String str, boolean z, YbButtonViewGroup.b bVar, rr51 rr51Var, ArrayList arrayList) {
        this.a = rbvVar;
        this.b = vty0Var;
        this.c = vty0Var2;
        this.d = stz0Var;
        this.e = qc70Var;
        this.f = constant;
        this.g = list;
        this.h = x49Var;
        this.i = str;
        this.j = z;
        this.k = bVar;
        this.l = rr51Var;
        this.m = arrayList;
    }

    public final YbButtonViewGroup.b a() {
        return this.k;
    }

    public final x49 b() {
        return this.h;
    }

    public final Text c() {
        return this.f;
    }

    public final vty0 d() {
        return this.c;
    }

    public final List e() {
        return this.g;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sk01)) {
            return false;
        }
        sk01 sk01Var = (sk01) obj;
        return this.a.equals(sk01Var.a) && this.b.equals(sk01Var.b) && jl40.l(this.c, sk01Var.c) && this.d.equals(sk01Var.d) && this.e.equals(sk01Var.e) && jl40.l(this.f, sk01Var.f) && this.g.equals(sk01Var.g) && jl40.l(this.h, sk01Var.h) && jl40.l(this.i, sk01Var.i) && this.j == sk01Var.j && this.k.equals(sk01Var.k) && jl40.l(this.l, sk01Var.l) && this.m.equals(sk01Var.m);
    }

    public final rr51 f() {
        return this.l;
    }

    public final rbv g() {
        return this.a;
    }

    public final boolean h() {
        return this.j;
    }

    public final int hashCode() {
        int hashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        vty0 vty0Var = this.c;
        int hashCode2 = (this.e.hashCode() + ((this.d.hashCode() + ((hashCode + (vty0Var == null ? 0 : vty0Var.hashCode())) * 31)) * 31)) * 31;
        Text text = this.f;
        int c = unr0.c((hashCode2 + (text == null ? 0 : text.hashCode())) * 31, 31, this.g);
        x49 x49Var = this.h;
        int hashCode3 = (c + (x49Var == null ? 0 : x49Var.hashCode())) * 31;
        String str = this.i;
        int hashCode4 = (this.k.hashCode() + unr0.e((hashCode3 + (str == null ? 0 : str.hashCode())) * 31, 31, this.j)) * 31;
        rr51 rr51Var = this.l;
        return this.m.hashCode() + ((hashCode4 + (rr51Var != null ? rr51Var.hashCode() : 0)) * 31);
    }

    public final List i() {
        return this.m;
    }

    public final qc70 j() {
        return this.e;
    }

    public final vty0 k() {
        return this.b;
    }

    public final stz0 l() {
        return this.d;
    }

    public final String m() {
        return this.i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TransferMainResultViewState(image=");
        sb.append(this.a);
        sb.append(", title=");
        sb.append(this.b);
        sb.append(", description=");
        sb.append(this.c);
        sb.append(", toolbarViewState=");
        sb.append(this.d);
        sb.append(", statusViewState=");
        sb.append(this.e);
        sb.append(", comment=");
        sb.append(this.f);
        sb.append(", divKitWidgets=");
        sb.append(this.g);
        sb.append(", cashback=");
        sb.append(this.h);
        sb.append(", urlFor3ds=");
        tse0.y(this.i, ", pageReady=", ", buttonGroupState=", sb, this.j);
        sb.append(this.k);
        sb.append(", divkitWidgetUnderAmount=");
        sb.append(this.l);
        sb.append(", quickActions=");
        return b64.n(Extension.C_BRAKE, sb, this.m);
    }
}
