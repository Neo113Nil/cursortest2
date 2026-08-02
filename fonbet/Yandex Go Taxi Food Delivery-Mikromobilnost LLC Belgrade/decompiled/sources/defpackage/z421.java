package defpackage;

import com.yandex.go.taxi.tariffs.internal.repository.k;
import defpackage.tje;
import defpackage.z421;
import java.util.ArrayList;
import ru.yandex.taxi.widget.dialog.AlertDialog;

/* loaded from: classes13.dex */
public final class z421 extends v96 {
    public final tse a;
    public final w3r0 b;
    public final ol3 c;
    public final vqv0 d;
    public final ore e;

    public z421(tse tseVar, w3r0 w3r0Var, ol3 ol3Var, vqv0 vqv0Var, ore oreVar) {
        this.a = tseVar;
        this.b = w3r0Var;
        this.c = ol3Var;
        this.d = vqv0Var;
        this.e = oreVar;
    }

    @Override // defpackage.v96
    public final boolean b() {
        ore oreVar = this.e;
        if (!oreVar.a(((k) oreVar.b).m())) {
            return false;
        }
        w3r0.b(this.b, new ArrayList(), null, null, null, 14);
        Runnable runnable = new Runnable() { // from class: com.yandex.go.requirements.order.b
            @Override // java.lang.Runnable
            public final void run() {
                z421 z421Var = z421.this;
                tje.N(z421Var.a, null, null, new UnsupportedRequirementsOrderPart$showSelectedRequirementsNotSupportedError$1$1(z421Var, null), 3);
            }
        };
        ol3 ol3Var = this.c;
        ol3Var.getClass();
        new AlertDialog(ol3Var.a).setMessage(kyh0.summary_error_requirements_not_supported).setCancelable(true).setCancelableOnTouchOutside(true).setPositiveButton(kyh0.common_ok).setDismissListener(runnable).show();
        return true;
    }
}
