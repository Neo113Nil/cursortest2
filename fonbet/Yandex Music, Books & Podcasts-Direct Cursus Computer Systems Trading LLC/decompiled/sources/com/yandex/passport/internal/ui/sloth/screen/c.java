package com.yandex.passport.internal.ui.sloth.screen;

import android.content.Context;
import com.yandex.passport.internal.sloth.k;
import com.yandex.passport.sloth.d1;
import com.yandex.passport.sloth.data.m;
import com.yandex.passport.sloth.data.o0;
import defpackage.a4g;
import defpackage.rzm;

/* loaded from: classes4.dex */
public final class c implements rzm {
    public final /* synthetic */ int a;
    public final b b;
    public final rzm c;

    public /* synthetic */ c(b bVar, rzm rzmVar, int i) {
        this.a = i;
        this.b = bVar;
        this.c = rzmVar;
    }

    @Override // defpackage.szm
    public final Object get() {
        switch (this.a) {
            case 0:
                k kVar = (k) this.c.get();
                this.b.getClass();
                kVar.getClass();
                return kVar.a();
            case 1:
                Context context = (Context) this.c.get();
                this.b.getClass();
                context.getClass();
                return new com.yandex.passport.internal.ui.sloth.e(context);
            case 2:
                d1 d1Var = (d1) this.c.get();
                this.b.getClass();
                d1Var.getClass();
                return d1Var.j;
            case 3:
                com.yandex.passport.sloth.dependencies.b bVar = (com.yandex.passport.sloth.dependencies.b) this.c.get();
                this.b.getClass();
                bVar.getClass();
                com.yandex.passport.sloth.dependencies.i iVar = bVar.d;
                a4g.t(iVar);
                return iVar;
            default:
                m mVar = (m) this.c.get();
                this.b.getClass();
                mVar.getClass();
                o0 o0Var = mVar.a;
                a4g.t(o0Var);
                return o0Var;
        }
    }
}
