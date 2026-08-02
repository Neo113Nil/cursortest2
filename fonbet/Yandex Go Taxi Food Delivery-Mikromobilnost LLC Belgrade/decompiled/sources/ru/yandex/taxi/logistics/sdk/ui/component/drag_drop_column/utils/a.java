package ru.yandex.taxi.logistics.sdk.ui.component.drag_drop_column.utils;

import defpackage.f0j0;
import defpackage.oz40;
import defpackage.s9m;
import defpackage.tje;
import defpackage.tls;
import defpackage.tse;
import defpackage.wu60;
import defpackage.zx40;
import defpackage.zy11;

/* loaded from: classes5.dex */
public final /* synthetic */ class a implements tls {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ tls b;
    public final /* synthetic */ oz40 c;
    public final /* synthetic */ tse w;
    public final /* synthetic */ oz40 x;
    public final /* synthetic */ Object y;

    public /* synthetic */ a(tse tseVar, tls tlsVar, f0j0 f0j0Var, oz40 oz40Var, oz40 oz40Var2) {
        this.w = tseVar;
        this.b = tlsVar;
        this.y = f0j0Var;
        this.c = oz40Var;
        this.x = oz40Var2;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        oz40 oz40Var = this.x;
        Object obj2 = this.y;
        tse tseVar = this.w;
        oz40 oz40Var2 = this.c;
        tls tlsVar = this.b;
        switch (i) {
            case 0:
                tje.N(tseVar, null, null, new ReorderableCollectionItemScopeImpl$draggableHandle$1$2$1$1((f0j0) obj2, oz40Var2, oz40Var, null), 3);
                tlsVar.invoke((wu60) obj);
                break;
            default:
                oz40Var2.setValue(Boolean.TRUE);
                s9m s9mVar = new s9m();
                tje.N(tseVar, null, null, new UtilKt$draggable$3$2$1$1$1$1((zx40) obj2, s9mVar, null), 3);
                oz40Var.setValue(s9mVar);
                tlsVar.invoke((wu60) obj);
                break;
        }
        return zy11Var;
    }

    public /* synthetic */ a(tls tlsVar, oz40 oz40Var, tse tseVar, zx40 zx40Var, oz40 oz40Var2) {
        this.b = tlsVar;
        this.c = oz40Var;
        this.w = tseVar;
        this.y = zx40Var;
        this.x = oz40Var2;
    }
}
