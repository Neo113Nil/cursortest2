package w;

import android.view.WindowInsets;
import p.C0225c;

/* loaded from: classes.dex */
public class G extends I {

    /* renamed from: a, reason: collision with root package name */
    public final WindowInsets.Builder f3026a = io.flutter.plugin.platform.i.c();

    @Override // w.I
    public S b() {
        WindowInsets build;
        a();
        build = this.f3026a.build();
        S a2 = S.a(build, null);
        a2.f3044a.n(null);
        return a2;
    }

    @Override // w.I
    public void c(C0225c c0225c) {
        this.f3026a.setStableInsets(c0225c.c());
    }

    @Override // w.I
    public void d(C0225c c0225c) {
        this.f3026a.setSystemWindowInsets(c0225c.c());
    }
}
