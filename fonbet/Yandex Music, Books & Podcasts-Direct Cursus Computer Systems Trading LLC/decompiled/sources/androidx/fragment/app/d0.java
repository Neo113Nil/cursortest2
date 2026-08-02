package androidx.fragment.app;

import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import defpackage.b6n;
import defpackage.bnh;
import defpackage.ffu;
import defpackage.gfu;
import defpackage.gzf;
import defpackage.is6;
import defpackage.jfu;
import defpackage.kfu;
import defpackage.kyf;
import defpackage.noi;
import defpackage.nyf;
import defpackage.q6k;
import defpackage.ssd;
import defpackage.uoo;
import defpackage.voo;
import defpackage.woo;
import defpackage.xoo;
import java.util.LinkedHashMap;

/* loaded from: classes.dex */
public final class d0 implements ssd, woo, kfu {
    public final o a;
    public final jfu b;
    public final j c;
    public gfu d;
    public gzf e = null;
    public voo f = null;

    public d0(o oVar, jfu jfuVar, j jVar) {
        this.a = oVar;
        this.b = jfuVar;
        this.c = jVar;
    }

    public final void a(kyf kyfVar) {
        this.e.g(kyfVar);
    }

    public final void b() {
        if (this.e == null) {
            this.e = new gzf(this);
            bnh bnhVar = new bnh(this, new b6n(28, this));
            this.f = new voo(bnhVar);
            bnhVar.a();
            this.c.run();
        }
    }

    @Override // defpackage.ssd
    public final is6 getDefaultViewModelCreationExtras() {
        Application application;
        o oVar = this.a;
        Context applicationContext = oVar.requireContext().getApplicationContext();
        while (true) {
            if (!(applicationContext instanceof ContextWrapper)) {
                application = null;
                break;
            }
            if (applicationContext instanceof Application) {
                application = (Application) applicationContext;
                break;
            }
            applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
        }
        noi noiVar = new noi(0);
        LinkedHashMap linkedHashMap = noiVar.a;
        if (application != null) {
            linkedHashMap.put(ffu.d, application);
        }
        linkedHashMap.put(q6k.h, oVar);
        linkedHashMap.put(q6k.i, this);
        if (oVar.getArguments() != null) {
            linkedHashMap.put(q6k.j, oVar.getArguments());
        }
        return noiVar;
    }

    @Override // defpackage.ssd
    public final gfu getDefaultViewModelProviderFactory() {
        Application application;
        o oVar = this.a;
        gfu defaultViewModelProviderFactory = oVar.getDefaultViewModelProviderFactory();
        if (!defaultViewModelProviderFactory.equals(oVar.mDefaultFactory)) {
            this.d = defaultViewModelProviderFactory;
            return defaultViewModelProviderFactory;
        }
        if (this.d == null) {
            Context applicationContext = oVar.requireContext().getApplicationContext();
            while (true) {
                if (!(applicationContext instanceof ContextWrapper)) {
                    application = null;
                    break;
                }
                if (applicationContext instanceof Application) {
                    application = (Application) applicationContext;
                    break;
                }
                applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
            }
            this.d = new xoo(application, oVar, oVar.getArguments());
        }
        return this.d;
    }

    @Override // defpackage.dzf
    public final nyf getLifecycle() {
        b();
        return this.e;
    }

    @Override // defpackage.woo
    public final uoo getSavedStateRegistry() {
        b();
        return this.f.b;
    }

    @Override // defpackage.kfu
    public final jfu getViewModelStore() {
        b();
        return this.b;
    }
}
