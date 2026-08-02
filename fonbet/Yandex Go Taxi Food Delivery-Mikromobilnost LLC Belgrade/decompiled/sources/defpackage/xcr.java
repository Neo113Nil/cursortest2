package defpackage;

import com.google.firebase.sessions.SessionsActivityLifecycleCallbacks;
import com.google.firebase.sessions.a;
import com.google.firebase.sessions.settings.b;

/* loaded from: classes.dex */
public final class xcr implements wvf0 {
    public final m3w a;
    public final yvf0 b;
    public final yvf0 c;
    public final wvf0 d;

    public xcr(m3w m3wVar, wvf0 wvf0Var, m3w m3wVar2, wvf0 wvf0Var2) {
        this.a = m3wVar;
        this.b = wvf0Var;
        this.c = m3wVar2;
        this.d = wvf0Var2;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        return new a((com.google.firebase.a) this.a.b, (b) this.b.get(), (fse) this.c.get(), (SessionsActivityLifecycleCallbacks) this.d.get());
    }
}
