package defpackage;

import android.app.Application;
import android.os.Bundle;
import java.lang.reflect.Constructor;

/* loaded from: classes.dex */
public final class xoo extends ifu implements gfu {
    public final Application a;
    public final ffu b;
    public final Bundle c;
    public final nyf d;
    public final uoo e;

    public xoo(Application application, woo wooVar, Bundle bundle) {
        ffu ffuVar;
        this.e = wooVar.getSavedStateRegistry();
        this.d = wooVar.getLifecycle();
        this.c = bundle;
        this.a = application;
        if (application != null) {
            if (ffu.c == null) {
                ffu.c = new ffu(application);
            }
            ffuVar = ffu.c;
            ffuVar.getClass();
        } else {
            ffuVar = new ffu(null);
        }
        this.b = ffuVar;
    }

    @Override // defpackage.gfu
    public final bfu a(f9f f9fVar, is6 is6Var) {
        f9fVar.getClass();
        return c(leu.P(f9fVar), is6Var);
    }

    @Override // defpackage.gfu
    public final bfu b(Class cls) {
        String canonicalName = cls.getCanonicalName();
        if (canonicalName != null) {
            return e(canonicalName, cls);
        }
        xq0.x("Local and anonymous classes can not be ViewModels");
        return null;
    }

    @Override // defpackage.gfu
    public final bfu c(Class cls, is6 is6Var) {
        is6Var.getClass();
        String str = (String) is6Var.a(bnd.d);
        if (str == null) {
            xq0.q("VIEW_MODEL_KEY must always be provided by ViewModelProvider");
            return null;
        }
        if (is6Var.a(q6k.h) == null || is6Var.a(q6k.i) == null) {
            if (this.d != null) {
                return e(str, cls);
            }
            xq0.q("SAVED_STATE_REGISTRY_OWNER_KEY andVIEW_MODEL_STORE_OWNER_KEY must be provided in the creation extras tosuccessfully create a ViewModel.");
            return null;
        }
        Application application = (Application) is6Var.a(ffu.d);
        boolean isAssignableFrom = qj0.class.isAssignableFrom(cls);
        Constructor a = (!isAssignableFrom || application == null) ? yoo.a(cls, yoo.b) : yoo.a(cls, yoo.a);
        return a == null ? this.b.c(cls, is6Var) : (!isAssignableFrom || application == null) ? yoo.b(cls, a, q6k.l(is6Var)) : yoo.b(cls, a, application, q6k.l(is6Var));
    }

    @Override // defpackage.ifu
    public final void d(bfu bfuVar) {
        nyf nyfVar = this.d;
        if (nyfVar != null) {
            uoo uooVar = this.e;
            uooVar.getClass();
            ywf.m(bfuVar, uooVar, nyfVar);
        }
    }

    public final bfu e(String str, Class cls) {
        nyf nyfVar = this.d;
        if (nyfVar == null) {
            qq6.d("SavedStateViewModelFactory constructed with empty constructor supports only calls to create(modelClass: Class<T>, extras: CreationExtras).");
            return null;
        }
        boolean isAssignableFrom = qj0.class.isAssignableFrom(cls);
        Application application = this.a;
        Constructor a = (!isAssignableFrom || application == null) ? yoo.a(cls, yoo.b) : yoo.a(cls, yoo.a);
        if (a == null) {
            if (application != null) {
                return this.b.b(cls);
            }
            if (hfu.a == null) {
                hfu.a = new hfu();
            }
            hfu.a.getClass();
            return n7w.F(cls);
        }
        uoo uooVar = this.e;
        uooVar.getClass();
        ooo q = ywf.q(uooVar, nyfVar, str, this.c);
        noo nooVar = q.b;
        bfu b = (!isAssignableFrom || application == null) ? yoo.b(cls, a, nooVar) : yoo.b(cls, a, application, nooVar);
        b.addCloseable("androidx.lifecycle.savedstate.vm.tag", q);
        return b;
    }
}
