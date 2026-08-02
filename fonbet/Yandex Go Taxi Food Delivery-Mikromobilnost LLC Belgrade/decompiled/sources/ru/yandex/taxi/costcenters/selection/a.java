package ru.yandex.taxi.costcenters.selection;

import defpackage.pzt0;
import defpackage.tje;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;

/* loaded from: classes5.dex */
public final class a implements vpr {
    public final /* synthetic */ b a;

    public a(b bVar) {
        this.a = bVar;
    }

    @Override // defpackage.vpr
    public final Object emit(Object obj, Continuation continuation) {
        String str = (String) obj;
        b bVar = this.a;
        pzt0 pzt0Var = bVar.D;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        bVar.D = tje.N(bVar.Jg(), null, null, new CostCenterSelectionPresenter$loadFilteredItems$1(bVar, str, null), 3);
        return zy11.a;
    }
}
