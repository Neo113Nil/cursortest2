package ru.yandex.taxi.view;

import defpackage.l91;
import defpackage.pzt0;
import defpackage.tje;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;

/* loaded from: classes6.dex */
public final class a implements vpr {
    public final /* synthetic */ c a;

    public a(c cVar) {
        this.a = cVar;
    }

    @Override // defpackage.vpr
    public final Object emit(Object obj, Continuation continuation) {
        l91 l91Var = (l91) obj;
        if (l91Var != null) {
            c cVar = this.a;
            pzt0 pzt0Var = cVar.N;
            if (pzt0Var != null) {
                pzt0Var.a(null);
            }
            cVar.N = tje.N(cVar.Jg(), null, null, new AddFavoritesModalViewPresenter$setAddress$1(cVar, l91Var, null), 3);
        }
        return zy11.a;
    }
}
