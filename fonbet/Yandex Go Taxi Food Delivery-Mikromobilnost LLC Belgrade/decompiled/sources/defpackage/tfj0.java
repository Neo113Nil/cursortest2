package defpackage;

import ru.yandex.taxi.requirements.repository.e;
import ru.yandex.taxi.widget.dialog.AlertDialog;

/* loaded from: classes6.dex */
public final class tfj0 extends ad5 {
    public final uq1 A;
    public final i130 B;
    public final zuj0 C;
    public final String x;
    public final ggj0 y;
    public final e z;

    public tfj0(String str, ggj0 ggj0Var, e eVar, uq1 uq1Var, i130 i130Var, zuj0 zuj0Var) {
        super(sfj0.class);
        this.x = str;
        this.y = ggj0Var;
        this.z = eVar;
        this.A = uq1Var;
        this.B = i130Var;
        this.C = zuj0Var;
    }

    public static final void Kg(tfj0 tfj0Var) {
        AlertDialog cancelable = tfj0Var.A.a().setCancelable(false);
        avj0 avj0Var = (avj0) tfj0Var.C;
        cancelable.setMessage(avj0Var.h(kyh0.requirement_address_details_fetch_error_message)).setPositiveButton(avj0Var.h(kyh0.requirement_address_details_fetch_error_ok_button_title), new qfj0(tfj0Var, 1)).show();
    }
}
