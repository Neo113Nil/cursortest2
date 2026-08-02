package defpackage;

import com.yandex.plus.analytics.dwh.a;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes8.dex */
public final class s4n implements ped0 {
    public final /* synthetic */ int a = 0;
    public final Object b;

    public s4n(a aVar, asd asdVar, ead0 ead0Var) {
        this.b = scc.g(new bc20(new xrd(asdVar), new ka20(1, asdVar), new wrd(asdVar), new va20(1, asdVar)), new dil0(new zrd(asdVar), new yrd(asdVar), ead0Var), new s4n(aVar));
    }

    private final void c() {
    }

    @Override // defpackage.ped0
    public final void a() {
        switch (this.a) {
            case 0:
                break;
            default:
                Iterator it = ((List) this.b).iterator();
                while (it.hasNext()) {
                    ((ped0) it.next()).a();
                }
                break;
        }
    }

    @Override // defpackage.ped0
    public final void b(tbd0 tbd0Var) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                a aVar = (a) obj;
                String str = tbd0Var.b;
                int i2 = r4n.a[tbd0Var.a.ordinal()];
                if (i2 == 1) {
                    sbd0 sbd0Var = tbd0Var.c;
                    if (!(sbd0Var instanceof qbd0)) {
                        if (!(sbd0Var instanceof rbd0)) {
                            w511.b();
                            break;
                        } else {
                            aVar.a(str, null);
                            break;
                        }
                    } else {
                        aVar.a(str, ((qbd0) sbd0Var).a);
                        break;
                    }
                } else if (i2 != 2 && i2 != 3 && i2 != 4 && i2 != 5) {
                    w511.b();
                    break;
                }
                break;
            default:
                Iterator it = ((List) obj).iterator();
                while (it.hasNext()) {
                    ((ped0) it.next()).b(tbd0Var);
                }
                break;
        }
    }

    public s4n(a aVar) {
        this.b = aVar;
    }
}
