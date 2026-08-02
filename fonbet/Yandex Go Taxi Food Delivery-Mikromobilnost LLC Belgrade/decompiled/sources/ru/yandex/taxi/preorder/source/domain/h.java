package ru.yandex.taxi.preorder.source.domain;

import defpackage.h3y;
import defpackage.mth;
import defpackage.po21;
import defpackage.rol0;

/* loaded from: classes6.dex */
public final class h {
    public final po21 a;
    public final h3y b;

    public h(po21 po21Var, h3y h3yVar) {
        this.a = po21Var;
        this.b = h3yVar;
    }

    public static mth a(h hVar) {
        hVar.getClass();
        return kotlinx.coroutines.flow.e.B(new rol0(new InitialLocationInteractor$makeInitialUserLocationRequest$1(null, hVar, false)), new InitialLocationInteractor$makeInitialUserLocationRequest$$inlined$flatMapConcat$1(null, hVar, true));
    }
}
