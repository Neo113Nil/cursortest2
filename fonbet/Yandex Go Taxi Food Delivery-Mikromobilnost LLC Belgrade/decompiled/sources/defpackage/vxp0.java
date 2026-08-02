package defpackage;

import android.content.Context;
import com.yandex.go.design.view.GoFrameLayout;

/* loaded from: classes14.dex */
public final class vxp0 {
    public final Context a;
    public final GoFrameLayout b;
    public final pav c;
    public final v66 d;
    public final tls e;
    public final iyv0 f;
    public final tls g;
    public krl0 h;
    public c5w0 i;
    public Boolean j;
    public int k;

    public vxp0(Context context, GoFrameLayout goFrameLayout, pav pavVar, v66 v66Var, tls tlsVar, iyv0 iyv0Var, tls tlsVar2) {
        this.a = context;
        this.b = goFrameLayout;
        this.c = pavVar;
        this.d = v66Var;
        this.e = tlsVar;
        this.f = iyv0Var;
        this.g = tlsVar2;
    }

    public final void a() {
        krl0 krl0Var = this.h;
        if (krl0Var == null) {
            return;
        }
        Boolean bool = this.j;
        Boolean bool2 = Boolean.FALSE;
        if (jl40.l(bool, bool2)) {
            return;
        }
        this.j = bool2;
        ((zxv0) krl0Var.b).a(false);
        this.g.invoke(Integer.valueOf(this.k));
    }

    public final void b(boolean z) {
        if (this.i == null) {
            return;
        }
        if (!z) {
            a();
            return;
        }
        krl0 krl0Var = this.h;
        if (krl0Var == null) {
            return;
        }
        Boolean bool = this.j;
        Boolean bool2 = Boolean.TRUE;
        if (jl40.l(bool, bool2)) {
            return;
        }
        this.j = bool2;
        ((zxv0) krl0Var.b).a(true);
        this.g.invoke(0);
    }
}
