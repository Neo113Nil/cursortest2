package ru.yandex.taxi.communications.stepsinstructions.interactor;

import com.yandex.go.design.compose.colors.AppColor$Palette;
import defpackage.bdc;
import defpackage.ebu0;
import defpackage.fbu0;
import defpackage.gbu0;
import defpackage.hbu0;
import defpackage.ibu0;
import defpackage.j37;
import defpackage.jbu0;
import defpackage.jl40;
import defpackage.kdc;
import defpackage.my6;
import defpackage.oxu0;
import defpackage.pdc;
import defpackage.pwy0;
import defpackage.q47;
import defpackage.qbu0;
import defpackage.qos0;
import defpackage.rau0;
import defpackage.sau0;
import defpackage.scc;
import defpackage.tau0;
import defpackage.tcc;
import defpackage.uau0;
import defpackage.ufu;
import defpackage.vau0;
import defpackage.w511;
import defpackage.xng0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlinx.coroutines.flow.n;
import ru.yandex.taxi.common_models.ui.ButtonOrientation;
import ru.yandex.taxi.common_models.ui.TextStyle;
import ru.yandex.taxi.communications.model.widgets.ActionButton;
import ru.yandex.taxi.communications.model.widgets.d;
import ru.yandex.taxi.communications.model.widgets.e0;
import ru.yandex.taxi.communications.model.widgets.l0;
import ru.yandex.taxi.communications.model.widgets.m0;
import ru.yandex.taxi.communications.model.widgets.n0;
import ru.yandex.taxi.communications.model.widgets.q;
import ru.yandex.taxi.communications.model.widgets.x;
import ru.yandex.taxi.styling.ButtonType;
import ru.yandex.taxi.styling.g;
import ru.yandex.taxi.widget.utils.e;

/* loaded from: classes5.dex */
public final class c {
    public final e a;
    public final pdc b;
    public final pwy0 c;
    public final oxu0 d;

    public c(e eVar, pdc pdcVar, pwy0 pwy0Var, oxu0 oxu0Var) {
        this.a = eVar;
        this.b = pdcVar;
        this.c = pwy0Var;
        this.d = oxu0Var;
    }

    public static final List a(c cVar, ibu0 ibu0Var) {
        cVar.getClass();
        if (!(ibu0Var instanceof hbu0)) {
            if (ibu0Var instanceof gbu0) {
                qos0 qos0Var = ((gbu0) ibu0Var).a;
                String str = qos0Var.b;
                String str2 = qos0Var.c;
                uau0 d = d(qos0Var.a);
                j37 a = ((g) cVar.d).a().a.a(ButtonType.DEFAULT);
                j37 j37Var = new j37(new bdc(xng0.controlMain), new bdc(xng0.textOnControl), AppColor$Palette.Control, AppColor$Palette.TextOnControl);
                if (a == null) {
                    a = j37Var;
                }
                return Collections.singletonList(new qbu0(str, str2, d, a));
            }
            if (ibu0Var instanceof ebu0) {
                List list = ((ebu0) ibu0Var).a;
                pdc pdcVar = cVar.b;
                List list2 = list;
                ArrayList arrayList = new ArrayList(tcc.n(list2, 10));
                int i = 0;
                for (Object obj : list2) {
                    int i2 = i + 1;
                    if (i < 0) {
                        scc.m();
                        throw null;
                    }
                    ActionButton actionButton = (ActionButton) obj;
                    boolean z = i == list.size() - 1;
                    ufu ufuVar = (ufu) pdcVar;
                    arrayList.add(new vau0(actionButton.b, ufuVar.h(z ? new bdc(xng0.textOnControl) : new bdc(xng0.textOnControlMinor), actionButton.d), ufuVar.d(z ? new bdc(xng0.controlMain) : new bdc(xng0.controlMinor), actionButton.c), d(actionButton.e), i == 0, actionButton.f == ActionButton.ButtonTextStyle.ACCENT));
                    i = i2;
                }
                return arrayList;
            }
            if (!ibu0Var.equals(fbu0.a)) {
                w511.b();
                return null;
            }
        }
        return EmptyList.a;
    }

    public static final q47 b(c cVar, ibu0 ibu0Var) {
        pdc pdcVar = cVar.b;
        if (!(ibu0Var instanceof hbu0)) {
            return null;
        }
        List<ActionButton> list = ((hbu0) ibu0Var).a;
        ArrayList arrayList = new ArrayList(tcc.n(list, 10));
        for (ActionButton actionButton : list) {
            ufu ufuVar = (ufu) pdcVar;
            kdc h = ufuVar.h(new bdc(xng0.textOnControlMinor), actionButton.d);
            kdc d = ufuVar.d(new bdc(xng0.controlMinor), actionButton.c);
            arrayList.add(new my6(actionButton.b, h, d, actionButton.f == ActionButton.ButtonTextStyle.ACCENT ? TextStyle.ACCENT : TextStyle.DEFAULT, d(actionButton.e), null, null, false, false, 16292));
        }
        return new q47(ButtonOrientation.VERTICAL, arrayList);
    }

    public static uau0 d(ru.yandex.taxi.communications.model.widgets.b bVar) {
        if (bVar instanceof e0) {
            return tau0.a;
        }
        if (bVar instanceof ActionButton.d) {
            return new rau0(((ActionButton.d) bVar).a);
        }
        boolean z = bVar instanceof x;
        sau0 sau0Var = sau0.a;
        if (z || jl40.l(bVar, d.INSTANCE) || (bVar instanceof ActionButton.a) || (bVar instanceof ActionButton.f) || (bVar instanceof ActionButton.g) || (bVar instanceof ActionButton.h) || (bVar instanceof ActionButton.j) || (bVar instanceof ActionButton.k) || (bVar instanceof ActionButton.i) || (bVar instanceof ActionButton.l) || (bVar instanceof ActionButton.c) || (bVar instanceof ActionButton.b) || jl40.l(bVar, q.INSTANCE) || jl40.l(bVar, l0.INSTANCE) || jl40.l(bVar, n0.INSTANCE) || jl40.l(bVar, m0.INSTANCE) || bVar == null) {
            return sau0Var;
        }
        w511.b();
        return null;
    }

    public final n c(jbu0 jbu0Var) {
        return new n(new b(this.c.a(), jbu0Var, this), new StepsInstructionsInteractor$stateFlow$3(jbu0Var, this, null));
    }
}
