package ru.yandex.taxi.linked_order.focus;

import defpackage.eci0;
import defpackage.ffx;
import defpackage.kly;
import defpackage.n6w0;
import defpackage.pzt0;
import defpackage.tje;
import defpackage.tse;
import defpackage.zy11;
import java.util.HashMap;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.k;
import kotlinx.coroutines.flow.n0;
import kotlinx.coroutines.flow.r0;
import ru.yandex.taxi.linked_order.interactor.f0;
import ru.yandex.taxi.linked_order.map.d;

/* loaded from: classes5.dex */
public final class a implements kly {
    public final tse a;
    public final n6w0 b;
    public final HashMap c = new HashMap();
    public final n0 d;
    public pzt0 e;

    public a(tse tseVar, n6w0 n6w0Var) {
        this.a = tseVar;
        this.b = n6w0Var;
        n0 b = ffx.b(1, 0, BufferOverflow.DROP_OLDEST);
        b.g(zy11.a);
        this.d = b;
    }

    @Override // defpackage.kly
    public final pzt0 a(String str, f0 f0Var, r0 r0Var, eci0 eci0Var, eci0 eci0Var2, d dVar) {
        pzt0 pzt0Var = this.e;
        tse tseVar = this.a;
        if (pzt0Var == null || !pzt0Var.isActive()) {
            this.e = tje.N(tseVar, null, null, new LinkedFocusCoordinatorExternal$listenFocusPoints$$inlined$safeCollectIn$1(this.d, null, this), 3);
        }
        return tje.N(tseVar, null, null, new LinkedFocusCoordinatorExternal$listenFocusPoints$$inlined$safeCollectIn$2(new k(f0Var.c(r0Var, eci0Var, eci0Var2, dVar), new LinkedFocusCoordinatorExternal$listenFocusPoints$2(this, str, null)), null, this, str), 3);
    }
}
