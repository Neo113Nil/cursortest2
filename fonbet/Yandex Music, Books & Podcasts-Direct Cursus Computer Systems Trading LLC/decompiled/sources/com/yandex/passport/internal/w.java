package com.yandex.passport.internal;

import defpackage.b6e;
import defpackage.bfu;
import defpackage.bjt;
import defpackage.ern;
import defpackage.gfu;
import defpackage.gs6;
import defpackage.hq0;
import defpackage.jfu;
import defpackage.lm4;
import defpackage.tn3;
import defpackage.xq0;
import java.util.concurrent.Callable;

/* loaded from: classes4.dex */
public final class w implements gfu {
    public final Class a;
    public final Callable b;

    public w(Class cls, Callable callable) {
        this.a = cls;
        this.b = callable;
    }

    public static com.yandex.passport.internal.ui.base.h d(hq0 hq0Var, Class cls, Callable callable) {
        w wVar = new w(cls, callable);
        jfu viewModelStore = hq0Var.getViewModelStore();
        viewModelStore.getClass();
        gs6 gs6Var = gs6.b;
        gs6Var.getClass();
        bjt bjtVar = new bjt(viewModelStore, wVar, gs6Var);
        lm4 a = ern.a(cls);
        String f = a.f();
        if (f != null) {
            return (com.yandex.passport.internal.ui.base.h) bjtVar.j(a, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(f));
        }
        xq0.x("Local and anonymous classes can not be ViewModels");
        return null;
    }

    public static com.yandex.passport.internal.ui.base.h e(androidx.fragment.app.o oVar, Callable callable) {
        try {
            com.yandex.passport.internal.ui.base.h hVar = (com.yandex.passport.internal.ui.base.h) callable.call();
            Class<?> cls = hVar.getClass();
            w wVar = new w(cls, new tn3(5, hVar));
            jfu viewModelStore = oVar.getViewModelStore();
            viewModelStore.getClass();
            gs6 gs6Var = gs6.b;
            gs6Var.getClass();
            bjt bjtVar = new bjt(viewModelStore, wVar, gs6Var);
            lm4 a = ern.a(cls);
            String f = a.f();
            if (f != null) {
                return (com.yandex.passport.internal.ui.base.h) bjtVar.j(a, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(f));
            }
            xq0.x("Local and anonymous classes can not be ViewModels");
            return null;
        } catch (Exception e) {
            b6e.q(e);
            return null;
        }
    }

    @Override // defpackage.gfu
    public final bfu b(Class cls) {
        if (cls != this.a) {
            xq0.q("Unknown ViewModel class");
            return null;
        }
        try {
            return (bfu) this.b.call();
        } catch (RuntimeException e) {
            throw e;
        } catch (Exception e2) {
            b6e.q(e2);
            return null;
        }
    }
}
