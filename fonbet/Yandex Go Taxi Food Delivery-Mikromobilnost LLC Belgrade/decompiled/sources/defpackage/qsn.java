package defpackage;

import com.yandex.go.flex.common.facade.a;
import com.yandex.go.flex.main_screen.experiments.j;
import java.util.List;
import ru.yandex.taxi.communications.c;
import ru.yandex.taxi.communications.d;
import ru.yandex.taxi.communications.data.b;

/* loaded from: classes.dex */
public final class qsn implements v7p {
    public final /* synthetic */ int a;
    public final xvf0 b;

    public qsn(w8r w8rVar, im21 im21Var) {
        this.a = 15;
        this.b = im21Var;
    }

    public static List a(irj0 irj0Var) {
        return scc.g(new r6x0(), new mvu(), new tvn(), irj0Var, new kog());
    }

    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        xvf0 xvf0Var = this.b;
        switch (i) {
            case 0:
                return new psn((yhr) ((cer) xvf0Var).get());
            case 1:
                return new l3o((r3o) ((kgn) xvf0Var).get());
            case 2:
                ((m2g) xvf0Var).get();
                return new tao();
            case 3:
                return new wuo((o61) ((hro) xvf0Var).get());
            case 4:
                return new mxo((cug) ((hro) xvf0Var).get());
            case 5:
                return new j0p((kdf0) ((npe0) xvf0Var).get());
            case 6:
                return new y8p(i5m.a((hro) xvf0Var));
            case 7:
                return new jb7((zuj0) ((lag) xvf0Var).get());
            case 8:
                return new n9p((j) ((a3g) xvf0Var).get());
            case 9:
                return new ebp((y9p) ((p9p) xvf0Var).get());
            case 10:
                return new ogp((t17) ((fn5) xvf0Var).get());
            case 11:
                return new ujp((tst) ((y5g) xvf0Var).get());
            case 12:
                return new znq(0, (aoq) ((y2g) xvf0Var).get());
            case 13:
                return new znq(1, (woq) ((y2g) xvf0Var).get());
            case 14:
                return new znq(2, (dpq) ((y2g) xvf0Var).get());
            case 15:
                ((im21) xvf0Var).get();
                return new s8r();
            case 16:
                return (a) ((vd) xvf0Var).get();
            case 17:
                return (cux0) ((abx0) xvf0Var).get();
            case 18:
                return a((irj0) ((xpj0) xvf0Var).get());
            case 19:
                zzf zzfVar = (zzf) ((gp50) ((b0g) xvf0Var).get()).b;
                i0g i0gVar = new i0g();
                i0gVar.a = i5m.b(new zlf0(i5m.b(qei0.a), zzfVar.he, 17));
                return new elr(i0gVar);
            case 20:
                return new czr((x770) ((p7w0) xvf0Var).get());
            case 21:
                return new l1s((m1s) ((cuo) xvf0Var).get());
            case 22:
                return new ru.yandex.logistics.cargo_form.async.impl.data.a(i5m.a((wnw) xvf0Var));
            case 23:
                return new ru.yandex.logistics.cargo_form.send_event.impl.job.a((ru.yandex.logistics.cargo_form.send_event.impl.data.a) ((g3p) xvf0Var).get());
            case 24:
                return new i6s((f6s) ((cer) xvf0Var).get());
            case 25:
                return new hct((dxf0) ((abx0) xvf0Var).get());
            case 26:
                return new rit((gen) ((upj) xvf0Var).get());
            case 27:
                return new wjt((u1n) ((g3p) xvf0Var).get());
            case 28:
                return new c((s66) ((qzb) xvf0Var).get());
            default:
                return new d((b) ((x2b) xvf0Var).get());
        }
    }

    public /* synthetic */ qsn(xvf0 xvf0Var, int i) {
        this.a = i;
        this.b = xvf0Var;
    }
}
