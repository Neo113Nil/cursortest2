package defpackage;

import com.yandex.go.navigator.notifications.NavigationBackgroundServiceController$startService$$inlined$safeCollectIn$1;

/* loaded from: classes12.dex */
public final class za50 {
    public final j650 a;

    public za50(j650 j650Var) {
        this.a = j650Var;
    }

    public final void a(boolean z) {
        j650 j650Var = this.a;
        if (!z) {
            j650Var.e.a(zy11.a);
            md50 md50Var = j650Var.c;
            if (md50Var.c != null) {
                md50Var.a.c.i.a(172332, null);
            }
            md50Var.c = null;
            return;
        }
        j650Var.getClass();
        try {
            if (j650Var.b.a) {
                j650Var.a(j650Var.b.a);
                return;
            }
            pzt0 pzt0Var = j650Var.f;
            if (pzt0Var != null) {
                pzt0Var.a(null);
            }
            j650Var.f = tje.N(j650Var.d.a, null, null, new NavigationBackgroundServiceController$startService$$inlined$safeCollectIn$1(j650Var.b.i(), null, j650Var), 3);
        } catch (Exception unused) {
            md50 md50Var2 = j650Var.c;
            if (md50Var2.c != null) {
                md50Var2.a.c.i.a(172332, null);
            }
            md50Var2.c = null;
        }
    }
}
