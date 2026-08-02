package com.yandex.passport.sloth.ui;

import android.app.Activity;
import defpackage.b6e;
import defpackage.o30;
import defpackage.p30;
import defpackage.wyf;
import defpackage.x97;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* loaded from: classes4.dex */
public final /* synthetic */ class s implements Function1 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ b0 b;
    public final /* synthetic */ a1 c;

    public /* synthetic */ s(b0 b0Var, a1 a1Var) {
        this.b = b0Var;
        this.c = a1Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                b0 b0Var = this.b;
                d2 d2Var = b0Var.p;
                String str = (String) obj;
                str.getClass();
                com.yandex.passport.sloth.c1 c1Var = (com.yandex.passport.sloth.c1) this.c;
                com.yandex.passport.sloth.url.y a = c1Var.a(str);
                if (a instanceof com.yandex.passport.sloth.url.d0) {
                    b0Var.t.a(new com.yandex.passport.sloth.n0(str, 1));
                }
                Activity activity = b0Var.l;
                boolean z = false;
                if (!a.equals(com.yandex.passport.sloth.url.c0.b)) {
                    if (a.equals(com.yandex.passport.sloth.url.d0.b)) {
                        b0Var.r.D(b0Var, c1Var, com.yandex.passport.sloth.ui.webview.a.a);
                    } else {
                        Continuation continuation = null;
                        if (a instanceof com.yandex.passport.sloth.url.f0) {
                            x97.y(wyf.F(b0Var.r()), null, null, new j(b0Var, c1Var, continuation, 1), 3);
                        } else if (a instanceof com.yandex.passport.sloth.url.e0) {
                            com.yandex.passport.sloth.url.e0 e0Var = (com.yandex.passport.sloth.url.e0) a;
                            x97.y(b0Var, null, null, new w(b0Var, e0Var.b, continuation, 0), 3);
                            if (e0Var.c) {
                                d2Var.a(e1.b);
                            }
                        } else if (a.equals(com.yandex.passport.sloth.url.c0.c)) {
                            d2Var.a(e1.b);
                        } else if (a instanceof com.yandex.passport.sloth.url.g0) {
                            String str2 = ((com.yandex.passport.sloth.url.g0) a).b;
                            activity.getClass();
                            o30 o30Var = new o30(activity);
                            com.yandex.passport.internal.ui.sloth.g gVar = (com.yandex.passport.internal.ui.sloth.g) b0Var.o;
                            o30Var.b(gVar.a(com.yandex.passport.sloth.ui.string.a.e));
                            com.yandex.passport.internal.ui.e eVar = gVar.a;
                            if (str2 == null) {
                                str2 = "unknown error";
                            }
                            o30Var.a(eVar.b(str2));
                            o30Var.a.m = false;
                            o30Var.setPositiveButton(gVar.a(com.yandex.passport.sloth.ui.string.a.f), new com.yandex.passport.internal.ui.sloth.o(5, b0Var));
                            p30 create = o30Var.create();
                            create.getClass();
                            create.show();
                        } else if (a.equals(com.yandex.passport.sloth.url.c0.e)) {
                            s0 s0Var = b0Var.m;
                            s0Var.getClass();
                            s0Var.b(q0.c);
                        } else {
                            if (!a.equals(com.yandex.passport.sloth.url.c0.d)) {
                                b6e.s();
                                return null;
                            }
                            activity.setResult(17121);
                            activity.finish();
                        }
                    }
                    z = true;
                }
                return Boolean.valueOf(z);
            default:
                com.yandex.passport.sloth.ui.webview.f fVar = (com.yandex.passport.sloth.ui.webview.f) obj;
                fVar.getClass();
                b0 b0Var2 = this.b;
                b0Var2.r.D(b0Var2, this.c, fVar);
                return Unit.a;
        }
    }

    public /* synthetic */ s(a1 a1Var, b0 b0Var) {
        this.c = a1Var;
        this.b = b0Var;
    }
}
