package y;

import android.view.WindowInsets;

/* loaded from: classes.dex */
public class G extends I {

    /* renamed from: a, reason: collision with root package name */
    public final WindowInsets.Builder f8548a = io.flutter.plugin.platform.i.g();

    @Override // y.I
    public Q b() {
        WindowInsets build;
        a();
        build = this.f8548a.build();
        Q a2 = Q.a(build, null);
        a2.f8566a.n(null);
        return a2;
    }

    @Override // y.I
    public void c(r.c cVar) {
        this.f8548a.setStableInsets(cVar.c());
    }

    @Override // y.I
    public void d(r.c cVar) {
        this.f8548a.setSystemWindowInsets(cVar.c());
    }
}
