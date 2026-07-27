package io.flutter.plugin.platform;

import L.Q;
import android.os.Build;
import android.view.Window;
import c0.AbstractActivityC0104f;
import w.T;
import w.U;
import w.W;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final AbstractActivityC0104f f2446a;

    /* renamed from: b, reason: collision with root package name */
    public final Q f2447b;

    /* renamed from: c, reason: collision with root package name */
    public final AbstractActivityC0104f f2448c;

    /* renamed from: d, reason: collision with root package name */
    public l0.f f2449d;

    /* renamed from: e, reason: collision with root package name */
    public int f2450e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f2451f = false;

    public e(AbstractActivityC0104f abstractActivityC0104f, Q q2, AbstractActivityC0104f abstractActivityC0104f2) {
        A.j jVar = new A.j(25, this);
        this.f2446a = abstractActivityC0104f;
        this.f2447b = q2;
        q2.f598h = jVar;
        this.f2448c = abstractActivityC0104f2;
        this.f2450e = 1280;
    }

    public final void a(l0.f fVar) {
        Window window = this.f2446a.getWindow();
        window.getDecorView();
        int i2 = Build.VERSION.SDK_INT;
        o.g w2 = i2 >= 30 ? new W(window) : i2 >= 26 ? new U(window) : new T(window);
        int i3 = Build.VERSION.SDK_INT;
        if (i3 < 30) {
            window.addFlags(Integer.MIN_VALUE);
            window.clearFlags(201326592);
        }
        int i4 = fVar.f2698b;
        if (i4 != 0) {
            int b2 = F.j.b(i4);
            if (b2 == 0) {
                w2.A(false);
            } else if (b2 == 1) {
                w2.A(true);
            }
        }
        Integer num = fVar.f2697a;
        if (num != null && i3 < 35) {
            window.setStatusBarColor(num.intValue());
        }
        Boolean bool = fVar.f2699c;
        if (bool != null && i3 >= 29) {
            window.setStatusBarContrastEnforced(bool.booleanValue());
        }
        if (i3 >= 26) {
            int i5 = fVar.f2701e;
            if (i5 != 0) {
                int b3 = F.j.b(i5);
                if (b3 == 0) {
                    w2.z(false);
                } else if (b3 == 1) {
                    w2.z(true);
                }
            }
            Integer num2 = fVar.f2700d;
            if (num2 != null && i3 < 35) {
                window.setNavigationBarColor(num2.intValue());
            }
        }
        Integer num3 = fVar.f2702f;
        if (num3 != null && i3 >= 28 && i3 < 35) {
            window.setNavigationBarDividerColor(num3.intValue());
        }
        Boolean bool2 = fVar.f2703g;
        if (bool2 != null && i3 >= 29) {
            window.setNavigationBarContrastEnforced(bool2.booleanValue());
        }
        this.f2449d = fVar;
    }

    public final void b() {
        boolean z2 = this.f2451f;
        AbstractActivityC0104f abstractActivityC0104f = this.f2446a;
        if (z2) {
            o.g.B(abstractActivityC0104f.getWindow(), false);
        } else {
            abstractActivityC0104f.getWindow().getDecorView().setSystemUiVisibility(this.f2450e);
        }
        l0.f fVar = this.f2449d;
        if (fVar != null) {
            a(fVar);
        }
    }
}
