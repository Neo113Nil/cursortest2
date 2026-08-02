package defpackage;

import com.yandex.go.superapp.web.modal.WebModalViewContent;
import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.eatskit.dto.ServiceHeaderMode;

/* loaded from: classes14.dex */
public final class uh41 {
    public final WebModalViewContent a;
    public final String b;
    public final boolean c;
    public final boolean d;
    public final j7w0 e;
    public final int f;
    public final boolean g;
    public final zw60 h;
    public final fen i;
    public final ert0 j;
    public final String k;
    public final List l;
    public final ServiceHeaderMode m;

    public uh41(WebModalViewContent webModalViewContent, String str, boolean z, boolean z2, j7w0 j7w0Var, int i, boolean z3, zw60 zw60Var, fen fenVar, ert0 ert0Var, String str2, List list, ServiceHeaderMode serviceHeaderMode) {
        this.a = webModalViewContent;
        this.b = str;
        this.c = z;
        this.d = z2;
        this.e = j7w0Var;
        this.f = i;
        this.g = z3;
        this.h = zw60Var;
        this.i = fenVar;
        this.j = ert0Var;
        this.k = str2;
        this.l = list;
        this.m = serviceHeaderMode;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof uh41) {
            uh41 uh41Var = (uh41) obj;
            if (this.a == uh41Var.a && jl40.l(this.b, uh41Var.b) && this.c == uh41Var.c && this.d == uh41Var.d && jl40.l(this.e, uh41Var.e) && this.f == uh41Var.f && this.g == uh41Var.g && jl40.l(this.h, uh41Var.h) && jl40.l(this.i, uh41Var.i) && jl40.l(this.j, uh41Var.j) && jl40.l(this.k, uh41Var.k) && jl40.l(this.l, uh41Var.l) && this.m == uh41Var.m) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int e = unr0.e(unr0.e(unr0.b(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
        j7w0 j7w0Var = this.e;
        int e2 = unr0.e(oyr.b(this.f, (e + (j7w0Var == null ? 0 : j7w0Var.hashCode())) * 31, 31), 31, this.g);
        zw60 zw60Var = this.h;
        int hashCode = (this.i.hashCode() + ((e2 + (zw60Var == null ? 0 : zw60Var.hashCode())) * 31)) * 31;
        ert0 ert0Var = this.j;
        return this.m.hashCode() + unr0.c(unr0.b((hashCode + (ert0Var != null ? ert0Var.hashCode() : 0)) * 31, 31, this.k), 31, this.l);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("InitParams(contentView=");
        sb.append(this.a);
        sb.append(", url=");
        sb.append(this.b);
        sb.append(", isSuperappMode=");
        nnm.v(", useTransparentEatsKitContent=", ", loadCallbacks=", sb, this.c, this.d);
        sb.append(this.e);
        sb.append(", initState=");
        sb.append(this.f);
        sb.append(", isFullscreen=");
        sb.append(this.g);
        sb.append(", onAppearingListenerAdapter=");
        sb.append(this.h);
        sb.append(", splash=");
        sb.append(this.i);
        sb.append(", placeHolderProvider=");
        sb.append(this.j);
        sb.append(", userAgent=");
        tse0.x(this.k, ", methods=", ", serviceHeaderMode=", sb, this.l);
        sb.append(this.m);
        sb.append(Extension.C_BRAKE);
        return sb.toString();
    }
}
