package io.flutter.plugin.platform;

import L.Q;
import android.os.Build;
import android.view.Window;
import c0.AbstractActivityC0104f;
import l0.C0203f;
import w.T;
import w.U;
import w.W;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final AbstractActivityC0104f f2454a;

    /* renamed from: b, reason: collision with root package name */
    public final Q f2455b;

    /* renamed from: c, reason: collision with root package name */
    public final AbstractActivityC0104f f2456c;

    /* renamed from: d, reason: collision with root package name */
    public C0203f f2457d;

    /* renamed from: e, reason: collision with root package name */
    public int f2458e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f2459f = false;

    public e(AbstractActivityC0104f abstractActivityC0104f, Q q2, AbstractActivityC0104f abstractActivityC0104f2) {
        A.j jVar = new A.j(25, this);
        this.f2454a = abstractActivityC0104f;
        this.f2455b = q2;
        q2.f520g = jVar;
        this.f2456c = abstractActivityC0104f2;
        this.f2458e = 1280;
    }

    public final void a(C0203f c0203f) {
        Window window = this.f2454a.getWindow();
        window.getDecorView();
        int i2 = Build.VERSION.SDK_INT;
        o.g w2 = i2 >= 30 ? new W(window) : i2 >= 26 ? new U(window) : new T(window);
        int i3 = Build.VERSION.SDK_INT;
        if (i3 < 30) {
            window.addFlags(Integer.MIN_VALUE);
            window.clearFlags(201326592);
        }
        int i4 = c0203f.f2706b;
        if (i4 != 0) {
            int b2 = F.j.b(i4);
            if (b2 == 0) {
                w2.x(false);
            } else if (b2 == 1) {
                w2.x(true);
            }
        }
        Integer num = c0203f.f2705a;
        if (num != null && i3 < 35) {
            window.setStatusBarColor(num.intValue());
        }
        Boolean bool = c0203f.f2707c;
        if (bool != null && i3 >= 29) {
            window.setStatusBarContrastEnforced(bool.booleanValue());
        }
        if (i3 >= 26) {
            int i5 = c0203f.f2709e;
            if (i5 != 0) {
                int b3 = F.j.b(i5);
                if (b3 == 0) {
                    w2.w(false);
                } else if (b3 == 1) {
                    w2.w(true);
                }
            }
            Integer num2 = c0203f.f2708d;
            if (num2 != null && i3 < 35) {
                window.setNavigationBarColor(num2.intValue());
            }
        }
        Integer num3 = c0203f.f2710f;
        if (num3 != null && i3 >= 28 && i3 < 35) {
            window.setNavigationBarDividerColor(num3.intValue());
        }
        Boolean bool2 = c0203f.f2711g;
        if (bool2 != null && i3 >= 29) {
            window.setNavigationBarContrastEnforced(bool2.booleanValue());
        }
        this.f2457d = c0203f;
    }

    public final void b() {
        boolean z2 = this.f2459f;
        AbstractActivityC0104f abstractActivityC0104f = this.f2454a;
        if (z2) {
            o.g.y(abstractActivityC0104f.getWindow(), false);
        } else {
            abstractActivityC0104f.getWindow().getDecorView().setSystemUiVisibility(this.f2458e);
        }
        C0203f c0203f = this.f2457d;
        if (c0203f != null) {
            a(c0203f);
        }
    }
}
