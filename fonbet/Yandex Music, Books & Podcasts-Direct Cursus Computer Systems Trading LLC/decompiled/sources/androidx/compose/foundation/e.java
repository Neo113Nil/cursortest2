package androidx.compose.foundation;

import defpackage.agr;
import defpackage.cje;
import defpackage.grb;
import defpackage.uoi;
import defpackage.vnj;
import defpackage.yci;
import defpackage.yie;
import defpackage.yl0;

/* loaded from: classes.dex */
public abstract class e {
    public static final agr a = new agr(grb.E);

    public static final yci a(yci yciVar, uoi uoiVar, yie yieVar) {
        return yieVar == null ? yciVar : yieVar instanceof cje ? yciVar.f(new IndicationModifierElement(uoiVar, (cje) yieVar)) : vnj.q(yciVar, new yl0(6, yieVar, uoiVar));
    }
}
