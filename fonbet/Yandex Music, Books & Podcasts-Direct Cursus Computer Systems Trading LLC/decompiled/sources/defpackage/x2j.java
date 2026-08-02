package defpackage;

import android.os.Bundle;

/* loaded from: classes4.dex */
public final class x2j extends ifu implements gfu {
    public final uoo a;
    public final nyf b;
    public final Bundle c;
    public final sdk d;
    public final hek e;
    public final z03 f;
    public final osh g;

    public x2j(sdk sdkVar, hek hekVar, z03 z03Var, osh oshVar, woo wooVar, Bundle bundle) {
        sdkVar.getClass();
        hekVar.getClass();
        z03Var.getClass();
        oshVar.getClass();
        this.a = wooVar.getSavedStateRegistry();
        this.b = wooVar.getLifecycle();
        this.c = bundle;
        this.d = sdkVar;
        this.e = hekVar;
        this.f = z03Var;
        this.g = oshVar;
    }

    @Override // defpackage.gfu
    public final bfu b(Class cls) {
        String canonicalName = cls.getCanonicalName();
        if (canonicalName == null) {
            xq0.x("Local and anonymous classes can not be ViewModels");
            return null;
        }
        nyf nyfVar = this.b;
        if (nyfVar == null) {
            qq6.d("AbstractSavedStateViewModelFactory constructed with empty constructor supports only calls to create(modelClass: Class<T>, extras: CreationExtras).");
            return null;
        }
        uoo uooVar = this.a;
        uooVar.getClass();
        nyfVar.getClass();
        ooo q = ywf.q(uooVar, nyfVar, canonicalName, this.c);
        noo nooVar = q.b;
        f3j f3jVar = new f3j(this.d, this.e, this.f, this.g, nooVar);
        f3jVar.addCloseable("androidx.lifecycle.savedstate.vm.tag", q);
        return f3jVar;
    }

    @Override // defpackage.gfu
    public final bfu c(Class cls, is6 is6Var) {
        is6Var.getClass();
        String str = (String) is6Var.a(bnd.d);
        if (str == null) {
            xq0.q("VIEW_MODEL_KEY must always be provided by ViewModelProvider");
            return null;
        }
        uoo uooVar = this.a;
        if (uooVar == null) {
            noo l = q6k.l(is6Var);
            return new f3j(this.d, this.e, this.f, this.g, l);
        }
        uooVar.getClass();
        nyf nyfVar = this.b;
        nyfVar.getClass();
        ooo q = ywf.q(uooVar, nyfVar, str, this.c);
        noo nooVar = q.b;
        f3j f3jVar = new f3j(this.d, this.e, this.f, this.g, nooVar);
        f3jVar.addCloseable("androidx.lifecycle.savedstate.vm.tag", q);
        return f3jVar;
    }

    @Override // defpackage.ifu
    public final void d(bfu bfuVar) {
        uoo uooVar = this.a;
        if (uooVar != null) {
            nyf nyfVar = this.b;
            nyfVar.getClass();
            ywf.m(bfuVar, uooVar, nyfVar);
        }
    }
}
