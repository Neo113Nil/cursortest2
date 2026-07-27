package w;

import android.view.WindowInsets;
import p.C0224c;

/* loaded from: classes.dex */
public class G extends I {

    /* renamed from: a, reason: collision with root package name */
    public final WindowInsets.Builder f3021a = io.flutter.plugin.platform.i.c();

    @Override // w.I
    public S b() {
        WindowInsets build;
        a();
        build = this.f3021a.build();
        S a2 = S.a(build, null);
        a2.f3039a.n(null);
        return a2;
    }

    @Override // w.I
    public void c(C0224c c0224c) {
        this.f3021a.setStableInsets(c0224c.c());
    }

    @Override // w.I
    public void d(C0224c c0224c) {
        this.f3021a.setSystemWindowInsets(c0224c.c());
    }
}
