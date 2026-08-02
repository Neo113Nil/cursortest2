package defpackage;

import com.yandex.go.navigator.permission.NavigatorPermissionRequestRouter$ExitListener$State;
import java.util.HashMap;

/* loaded from: classes12.dex */
public final class ua50 implements ce50 {
    public final /* synthetic */ va50 a;
    public final /* synthetic */ ud50 b;

    public ua50(va50 va50Var, ud50 ud50Var) {
        this.a = va50Var;
        this.b = ud50Var;
    }

    @Override // defpackage.ce50
    public final void I0(NavigatorPermissionRequestRouter$ExitListener$State navigatorPermissionRequestRouter$ExitListener$State) {
        int i = ta50.a[navigatorPermissionRequestRouter$ExitListener$State.ordinal()];
        va50 va50Var = this.a;
        if (i == 1) {
            i650 i650Var = va50Var.Q().b().a;
            i650Var.a.a("navigation.permissions.geolocation.allow", n.u(i650Var), 1, new HashMap());
            va50Var.R(this.b);
            return;
        }
        if (i != 2) {
            w511.b();
            return;
        }
        i650 i650Var2 = va50Var.Q().b().a;
        i650Var2.a.a("navigation.permissions.geolocation.deny", n.u(i650Var2), 1, new HashMap());
        va50Var.r(new qu(9));
    }

    @Override // defpackage.sy60
    public final void a() {
        va50 va50Var = this.a;
        i650 i650Var = va50Var.Q().b().a;
        i650Var.a.a("navigation.permissions.geolocation.back_to_main", n.u(i650Var), 1, new HashMap());
        va50Var.r(new qu(9));
    }
}
