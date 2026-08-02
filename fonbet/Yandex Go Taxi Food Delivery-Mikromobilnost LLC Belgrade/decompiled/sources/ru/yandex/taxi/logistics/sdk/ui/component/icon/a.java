package ru.yandex.taxi.logistics.sdk.ui.component.icon;

import defpackage.pzt0;
import defpackage.tje;
import defpackage.tse;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;

/* loaded from: classes5.dex */
public final class a implements vpr {
    public final /* synthetic */ b a;
    public final /* synthetic */ tse b;

    public a(b bVar, tse tseVar) {
        this.a = bVar;
        this.b = tseVar;
    }

    @Override // defpackage.vpr
    public final Object emit(Object obj, Continuation continuation) {
        String str = (String) obj;
        b bVar = this.a;
        pzt0 pzt0Var = bVar.B;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        bVar.B = tje.N(this.b, null, null, new AsyncPainter$loadImage$1(bVar, str, null), 3);
        return zy11.a;
    }
}
