package defpackage;

import android.content.Context;
import ru.kinopoisk.sdk.easylogin.api.EasyLoginApi;

/* loaded from: classes3.dex */
public final class a0b implements zza {
    public final oq7 a;
    public final uya b;
    public final jyr c;

    public a0b(Context context, o oVar, frt frtVar, k0b k0bVar, oq7 oq7Var, rwd rwdVar) {
        this.a = oq7Var;
        this.b = new uya(context, oVar, frtVar);
        this.c = btf.b(new zya(1, k0bVar, this));
    }

    @Override // defpackage.zza
    public final es6 a(hn5 hn5Var) {
        hn5Var.getClass();
        p0b p0bVar = (p0b) this.c.getValue();
        uya uyaVar = this.b;
        uyaVar.getClass();
        hn5Var.getClass();
        p0bVar.getClass();
        es6 es6Var = new es6();
        es6Var.a = uyaVar;
        es6Var.b = hn5Var;
        es6Var.c = p0bVar;
        return es6Var;
    }

    @Override // defpackage.zza
    public final h0b b(hn5 hn5Var) {
        f0b f0bVar = f0b.a;
        l18 l18Var = l18.b;
        bdt I = hag.I(byb.class);
        qdc qdcVar = l18Var.a;
        qdcVar.getClass();
        if (!((yya) ((byb) qdcVar.C(I)).b(yya.class)).h()) {
            return f0bVar;
        }
        if (hn5Var.getLifecycle().b().compareTo(lyf.d) >= 0) {
            ssg.a(7, "EasyLoginHelperFactoryImpl", "registerEasyLoginLauncher called when activity is already started", null);
            return f0bVar;
        }
        zh registerForActivityResult = hn5Var.registerForActivityResult(((EasyLoginApi) this.b.b.getValue()).startEasyLoginActivity(), new gi(4, this));
        registerForActivityResult.getClass();
        return new g0b(registerForActivityResult);
    }

    @Override // defpackage.zza
    public final void c() {
        EasyLoginApi easyLoginApi = (EasyLoginApi) this.b.b.getValue();
        ssg.a(3, "EasyLoginApiImpl", "ensureInitialized api=".concat(easyLoginApi.getClass().getSimpleName() + "(" + System.identityHashCode(easyLoginApi) + ")"), null);
    }
}
