package defpackage;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.q;
import androidx.lifecycle.t;
import com.yandex.go.feedsdk.lifecycle.b;
import defpackage.g18;
import defpackage.hst;
import defpackage.jst;
import defpackage.pey;
import defpackage.v0j;

/* loaded from: classes.dex */
public final class v0j extends Lifecycle {
    public final b A;
    public final Lifecycle b;
    public final tls c;
    public boolean w;
    public final b7 x = new b7(19, this);
    public g18 y = g18.u1;
    public final t z;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1, types: [com.yandex.go.feedsdk.lifecycle.b, oey] */
    public v0j(Lifecycle lifecycle, w0j w0jVar, tls tlsVar) {
        this.b = lifecycle;
        this.c = tlsVar;
        this.z = new t(w0jVar, true);
        ?? r3 = new q() { // from class: com.yandex.go.feedsdk.lifecycle.b
            @Override // androidx.lifecycle.q
            public final void M1(pey peyVar, Lifecycle.Event event) {
                Lifecycle.State a = event.a();
                Lifecycle.State state = Lifecycle.State.DESTROYED;
                v0j v0jVar = v0j.this;
                if (a == state) {
                    hst hstVar = jst.e;
                    v0jVar.e((g18) ((DelayedDestroyEventLifecycleExtensionsKt$attachDetachEventLifecycle$1) v0jVar.c).invoke(v0jVar.x));
                    return;
                }
                v0jVar.e(g18.u1);
                if (v0jVar.w) {
                    return;
                }
                v0jVar.z.g(event);
            }
        };
        this.A = r3;
        lifecycle.a(r3);
    }

    @Override // androidx.lifecycle.Lifecycle
    public final void a(oey oeyVar) {
        this.z.a(oeyVar);
    }

    @Override // androidx.lifecycle.Lifecycle
    public final Lifecycle.State b() {
        return this.z.w;
    }

    @Override // androidx.lifecycle.Lifecycle
    public final void d(oey oeyVar) {
        this.z.d(oeyVar);
    }

    public final void e(g18 g18Var) {
        if (jl40.l(this.y, g18Var)) {
            return;
        }
        this.y.cancel();
        this.y = g18Var;
    }
}
