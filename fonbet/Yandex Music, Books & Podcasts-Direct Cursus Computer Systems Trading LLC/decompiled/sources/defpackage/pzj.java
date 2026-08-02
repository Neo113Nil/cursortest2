package defpackage;

import android.view.View;
import androidx.fragment.app.t;

/* loaded from: classes3.dex */
public final class pzj implements nzj {
    public final q5i a;
    public final g8c b;
    public final j1p c;

    public pzj(q5i q5iVar, g8c g8cVar, j1p j1pVar) {
        q5iVar.getClass();
        g8cVar.getClass();
        this.a = q5iVar;
        this.b = g8cVar;
        this.c = j1pVar;
    }

    @Override // defpackage.nzj
    public final void a(String str, boolean z) {
        str.getClass();
        this.c.invoke(Boolean.valueOf(z), str);
    }

    @Override // defpackage.nzj
    public final void b() {
        q5i q5iVar = this.a;
        String str = (String) q5iVar.c;
        String str2 = (String) q5iVar.d;
        g8c g8cVar = this.b;
        g8cVar.getClass();
        t tVar = (t) g8cVar.a;
        tVar.getClass();
        View currentFocus = tVar.getCurrentFocus();
        if (currentFocus != null) {
            c3x.B(currentFocus);
        }
        avo avoVar = avo.c;
        avoVar.getClass();
        new xdh(tVar, str, str2, avoVar).M();
    }
}
