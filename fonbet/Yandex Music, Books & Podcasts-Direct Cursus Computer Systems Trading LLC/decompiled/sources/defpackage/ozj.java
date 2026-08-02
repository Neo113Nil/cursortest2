package defpackage;

import androidx.fragment.app.t;
import kotlin.text.c;

/* loaded from: classes4.dex */
public final class ozj implements nzj {
    public final qzj a;
    public final wnd b;

    public ozj(qzj qzjVar, wnd wndVar) {
        this.a = qzjVar;
        this.b = wndVar;
    }

    @Override // defpackage.nzj
    public final void a(String str, boolean z) {
        str.getClass();
        qzj qzjVar = this.a;
        q43 q43Var = qzjVar.b;
        mzj mzjVar = qzjVar.a;
        String str2 = mzjVar.a.a;
        c70 c70Var = c70.j;
        String str3 = mzjVar.b;
        if (str3 == null) {
            str3 = "";
        }
        q43Var.h(new d70(str2, c70Var, str3, 0, str), z);
    }

    @Override // defpackage.nzj
    public final void b() {
        qzj qzjVar = this.a;
        mzj mzjVar = qzjVar.a;
        String str = mzjVar.b;
        String str2 = mzjVar.c;
        q43 q43Var = qzjVar.b;
        String str3 = q43Var.b.b.d.a;
        str3.getClass();
        t tVar = (t) vq2.R(this.b.b);
        if (tVar != null) {
            new xdh(tVar, str, str2, new avo(pkb.Genre, c.r(str3, "tag_", "", false))).M();
        }
        String str4 = mzjVar.a.a;
        c70 c70Var = c70.j;
        String str5 = mzjVar.b;
        d70 d70Var = new d70(str4, c70Var, str5 == null ? "" : str5, 0, "");
        b70 b70Var = q43Var.c;
        if (b70Var != null) {
            q43Var.b.a(b70Var, d70Var, i70.a);
        }
    }
}
