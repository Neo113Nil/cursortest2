package defpackage;

import com.yandex.go.summary.interactor.expanded.action.c;
import java.util.Iterator;
import ru.yandex.taxi.tariffs.model.SelectionOrigin;
import ru.yandex.taxi.tariffs.model.b;

/* loaded from: classes14.dex */
public final class ylj0 implements ioi {
    public final /* synthetic */ c a;
    public final /* synthetic */ String b;
    public final /* synthetic */ String c;

    public ylj0(c cVar, String str, String str2) {
        this.a = cVar;
        this.b = str;
        this.c = str2;
    }

    @Override // defpackage.ioi
    public final void T(String str) {
        pex0 b;
        Object obj;
        c cVar = this.a;
        b8r b8rVar = cVar.f;
        String str2 = this.b;
        String str3 = this.c;
        mi31 d = b8r.d(b8rVar, str2, str3, 4);
        if (d == null || (b = d.a.b()) == null) {
            return;
        }
        Iterator it = b.b(b).iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (jl40.l(((nu1) obj).b, str)) {
                    break;
                }
            }
        }
        nu1 nu1Var = (nu1) obj;
        if (nu1Var != null) {
            cVar.j.a(nu1Var.b, str2);
            cVar.e.d(SelectionOrigin.USER, nu1Var.a.J0, str3, true);
            cVar.k.f = false;
        }
    }

    @Override // defpackage.sy60
    public final void a() {
        this.a.k.f = false;
    }

    @Override // defpackage.ioi
    public final void n0() {
        this.a.k.f = false;
    }
}
