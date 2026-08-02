package ru.yandex.taxi.superapp.shortcuts;

import com.yandex.go.shortcuts.impl.interactors.ProductsScreenInteractorImpl$screenProductsFlow$$inlined$flatMapLatest$1;
import com.yandex.go.shortcuts.impl.interactors.v;
import com.yandex.go.shortcuts.impl.interactors.w;
import com.yandex.go.shortcuts.impl.interactors.x;
import defpackage.arm0;
import defpackage.e4s0;
import defpackage.f4s0;
import defpackage.faf0;
import defpackage.mdh;
import defpackage.ny61;
import defpackage.qaf0;
import defpackage.raf0;
import defpackage.s721;
import defpackage.sjh;
import defpackage.tpr;
import defpackage.tt2;
import defpackage.uyj;
import defpackage.waf0;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.internal.g;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes13.dex */
public final class b {
    public final s721 a;
    public final w b;
    public final tt2 c;
    public final x d;
    public final com.yandex.go.shortcuts.impl.view.adapter.model.a e;

    public b(s721 s721Var, w wVar, tt2 tt2Var, x xVar, com.yandex.go.shortcuts.impl.view.adapter.model.a aVar) {
        this.a = s721Var;
        this.b = wVar;
        this.c = tt2Var;
        this.d = xVar;
        this.e = aVar;
    }

    public final Object a(waf0 waf0Var, faf0 faf0Var, boolean z, Continuation continuation) {
        raf0 raf0Var;
        qaf0 qaf0Var = new qaf0(waf0Var, hashCode());
        w wVar = this.b;
        r0 r0Var = wVar.h;
        if (!qaf0Var.equals(((raf0) r0Var.getValue()).a)) {
            raf0 raf0Var2 = wVar.i;
            if (raf0Var2 == null || !qaf0Var.equals(raf0Var2.a)) {
                raf0Var = new raf0(qaf0Var);
            } else {
                raf0Var = wVar.i;
                if (raf0Var == null) {
                    ny61.g("Required value was null.");
                    return null;
                }
                wVar.i = null;
            }
            r0Var.m(null, raf0Var);
        }
        return e.k(e.s(faf0Var.a(), new arm0(14)), new ScreensViewModelInteractor$fetchScreenProducts$3(this, qaf0Var, waf0Var, z, null), continuation);
    }

    public final tpr b(waf0 waf0Var, e4s0 e4s0Var, f4s0 f4s0Var) {
        g X = e.X(e.X(new v(this.b.h, waf0Var), new ProductsScreenInteractorImpl$screenProductsFlow$$inlined$flatMapLatest$1(3, null)), new ScreensViewModelInteractor$getViewModelFlow$$inlined$flatMapLatest$1(null, this, e4s0Var, f4s0Var, waf0Var));
        this.c.getClass();
        sjh sjhVar = uyj.a;
        return e.F(X, mdh.b);
    }
}
