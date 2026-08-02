package defpackage;

import java.util.ArrayList;
import ru.yandex.taxi.common_models.ui.ButtonOrientation;
import ru.yandex.taxi.common_models.ui.TextStyle;

/* loaded from: classes6.dex */
public final class u57 extends dy4 {
    public static final /* synthetic */ int V = 0;
    public final txc T;
    public final c57 U;

    public u57(jy20 jy20Var, txc txcVar) {
        super(jy20Var, 1);
        this.T = txcVar;
        this.U = jy20Var.b.buttonsContract();
    }

    @Override // defpackage.wys
    public final boolean X() {
        return false;
    }

    @Override // defpackage.dy4, defpackage.wys
    public final void c(Object obj) {
        ButtonOrientation buttonOrientation = ButtonOrientation.VERTICAL;
        ArrayList<u7e0> arrayList = ((v7e0) obj).b;
        ArrayList arrayList2 = new ArrayList(tcc.n(arrayList, 10));
        for (u7e0 u7e0Var : arrayList) {
            CharSequence charSequence = u7e0Var.c;
            boolean z = u7e0Var.f;
            String obj2 = charSequence.toString();
            bdc bdcVar = new bdc(z ? xng0.controlMain : xng0.controlMinor);
            TextStyle textStyle = z ? TextStyle.ACCENT : TextStyle.DEFAULT;
            arrayList2.add(new my6(obj2, new bdc(z ? xng0.textOnControl : xng0.textOnControlMinor), bdcVar, textStyle, new t57(u7e0Var), u7e0Var.d.toString(), new bdc(z ? xng0.textOnControl : xng0.textMinor), false, false, 15908));
        }
        q47 q47Var = new q47(buttonOrientation, arrayList2);
        pm5 pm5Var = (pm5) this.U;
        pm5Var.d(q47Var);
        pm5Var.f(new s57(0, this));
    }
}
