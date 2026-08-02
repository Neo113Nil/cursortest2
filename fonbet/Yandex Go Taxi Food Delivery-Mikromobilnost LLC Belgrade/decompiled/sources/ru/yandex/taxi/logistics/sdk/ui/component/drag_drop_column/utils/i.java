package ru.yandex.taxi.logistics.sdk.ui.component.drag_drop_column.utils;

import defpackage.i1k;
import defpackage.oz40;
import defpackage.s9m;
import defpackage.sls;
import defpackage.tje;
import defpackage.tse;
import defpackage.zx40;

/* loaded from: classes5.dex */
public final class i implements i1k {
    public final /* synthetic */ sls a;
    public final /* synthetic */ oz40 b;
    public final /* synthetic */ oz40 c;
    public final /* synthetic */ tse d;
    public final /* synthetic */ zx40 e;

    public i(sls slsVar, oz40 oz40Var, oz40 oz40Var2, tse tseVar, zx40 zx40Var) {
        this.a = slsVar;
        this.b = oz40Var;
        this.c = oz40Var2;
        this.d = tseVar;
        this.e = zx40Var;
    }

    @Override // defpackage.i1k
    public final void dispose() {
        oz40 oz40Var = this.b;
        if (((Boolean) oz40Var.getValue()).booleanValue()) {
            s9m s9mVar = (s9m) this.c.getValue();
            if (s9mVar != null) {
                tje.N(this.d, null, null, new UtilKt$draggable$3$1$1$1$1$1(this.e, s9mVar, null), 3);
            }
            if (((Boolean) oz40Var.getValue()).booleanValue()) {
                this.a.invoke();
            }
            oz40Var.setValue(Boolean.FALSE);
        }
    }
}
