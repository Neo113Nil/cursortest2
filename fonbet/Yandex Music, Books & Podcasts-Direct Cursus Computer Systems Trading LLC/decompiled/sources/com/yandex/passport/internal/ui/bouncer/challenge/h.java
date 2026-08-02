package com.yandex.passport.internal.ui.bouncer.challenge;

import com.yandex.passport.internal.ui.challenge.c0;
import defpackage.b6e;
import defpackage.cg6;
import defpackage.gm5;
import defpackage.nm6;
import defpackage.qgg;
import defpackage.xq0;
import kotlin.Unit;

/* loaded from: classes4.dex */
public final class h extends com.yandex.passport.common.mvi.h {
    public final c0 c;

    public h(c0 c0Var) {
        c0Var.getClass();
        this.c = c0Var;
    }

    @Override // com.yandex.passport.common.mvi.h
    public final Object c(Object obj, com.yandex.passport.common.mvi.g gVar) {
        if (!((f) obj).equals(f.a)) {
            b6e.s();
            return null;
        }
        c0 c0Var = this.c;
        c0Var.getClass();
        a(new j(new com.yandex.passport.internal.ui.challenge.webview.i(c0Var.c, c0Var.d, c0Var.e)));
        return Unit.a;
    }

    @Override // com.yandex.passport.common.mvi.h
    public final Object d(Object obj, com.yandex.passport.common.mvi.g gVar) {
        Object i = i(((q) obj).a, gVar);
        return i == nm6.a ? i : Unit.a;
    }

    @Override // com.yandex.passport.common.mvi.h
    public final Unit f(Throwable th) {
        this.c.b.U(Boolean.FALSE);
        return Unit.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object i(String str, cg6 cg6Var) {
        g gVar;
        int i;
        if (cg6Var instanceof g) {
            gVar = (g) cg6Var;
            int i2 = gVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                gVar.l = i2 - Integer.MIN_VALUE;
                Object obj = gVar.j;
                nm6 nm6Var = nm6.a;
                i = gVar.l;
                if (i != 0) {
                    qgg.h0(obj);
                    a(new j(null));
                    c0 c0Var = this.c;
                    c0Var.a(str);
                    gm5 gm5Var = c0Var.b;
                    gVar.l = 1;
                    obj = gm5Var.s(gVar);
                    if (obj == nm6Var) {
                        return nm6Var;
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                a(new i(new n(((Boolean) obj).booleanValue())));
                return Unit.a;
            }
        }
        gVar = new g(this, cg6Var);
        Object obj2 = gVar.j;
        nm6 nm6Var2 = nm6.a;
        i = gVar.l;
        if (i != 0) {
        }
        a(new i(new n(((Boolean) obj2).booleanValue())));
        return Unit.a;
    }
}
