package io.flutter.plugin.platform;

import P0.AbstractActivityC0072e;
import android.os.Build;
import android.view.Window;
import y.S;
import y.T;
import y.V;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final AbstractActivityC0072e f7837a;

    /* renamed from: b, reason: collision with root package name */
    public final x0.e f7838b;

    /* renamed from: c, reason: collision with root package name */
    public final AbstractActivityC0072e f7839c;

    /* renamed from: d, reason: collision with root package name */
    public Z0.e f7840d;

    /* renamed from: e, reason: collision with root package name */
    public int f7841e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f7842f = false;

    public e(AbstractActivityC0072e abstractActivityC0072e, x0.e eVar, AbstractActivityC0072e abstractActivityC0072e2) {
        Z0.i iVar = new Z0.i(22, this);
        this.f7837a = abstractActivityC0072e;
        this.f7838b = eVar;
        eVar.f8531c = iVar;
        this.f7839c = abstractActivityC0072e2;
        this.f7841e = 1280;
    }

    public final void a(Z0.e eVar) {
        Window window = this.f7837a.getWindow();
        window.getDecorView();
        int i2 = Build.VERSION.SDK_INT;
        R1.l v2 = i2 >= 30 ? new V(window) : i2 >= 26 ? new T(window) : new S(window);
        int i3 = Build.VERSION.SDK_INT;
        if (i3 < 30) {
            window.addFlags(Integer.MIN_VALUE);
            window.clearFlags(201326592);
        }
        int i4 = eVar.f1962b;
        if (i4 != 0) {
            int b2 = H.j.b(i4);
            if (b2 == 0) {
                v2.B(false);
            } else if (b2 == 1) {
                v2.B(true);
            }
        }
        Integer num = eVar.f1961a;
        if (num != null && i3 < 35) {
            window.setStatusBarColor(num.intValue());
        }
        Boolean bool = eVar.f1963c;
        if (bool != null && i3 >= 29) {
            window.setStatusBarContrastEnforced(bool.booleanValue());
        }
        if (i3 >= 26) {
            int i5 = eVar.f1965e;
            if (i5 != 0) {
                int b3 = H.j.b(i5);
                if (b3 == 0) {
                    v2.A(false);
                } else if (b3 == 1) {
                    v2.A(true);
                }
            }
            Integer num2 = eVar.f1964d;
            if (num2 != null && i3 < 35) {
                window.setNavigationBarColor(num2.intValue());
            }
        }
        Integer num3 = eVar.f1966f;
        if (num3 != null && i3 >= 28 && i3 < 35) {
            window.setNavigationBarDividerColor(num3.intValue());
        }
        Boolean bool2 = eVar.f1967g;
        if (bool2 != null && i3 >= 29) {
            window.setNavigationBarContrastEnforced(bool2.booleanValue());
        }
        this.f7840d = eVar;
    }

    public final void b() {
        boolean z2 = this.f7842f;
        AbstractActivityC0072e abstractActivityC0072e = this.f7837a;
        if (z2) {
            R1.d.E(abstractActivityC0072e.getWindow(), false);
        } else {
            abstractActivityC0072e.getWindow().getDecorView().setSystemUiVisibility(this.f7841e);
        }
        Z0.e eVar = this.f7840d;
        if (eVar != null) {
            a(eVar);
        }
    }
}
