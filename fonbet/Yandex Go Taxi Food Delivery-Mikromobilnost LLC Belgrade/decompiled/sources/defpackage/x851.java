package defpackage;

import com.yandex.go.navigation.screen.c;
import com.yandex.messaging.MessengerEnvironment;

/* loaded from: classes15.dex */
public final class x851 implements v7p {
    public final /* synthetic */ int a;
    public final xvf0 b;
    public final xvf0 c;

    public x851(mj31 mj31Var, xvf0 xvf0Var, xvf0 xvf0Var2) {
        this.a = 1;
        this.b = xvf0Var;
        this.c = xvf0Var2;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        xvf0 xvf0Var = this.c;
        xvf0 xvf0Var2 = this.b;
        switch (i) {
            case 0:
                return new w851((axm) xvf0Var2.get(), (rqo) xvf0Var.get());
            case 1:
                return new wly0();
            case 2:
                return new fe51((MessengerEnvironment) xvf0Var2.get(), (rz10) xvf0Var.get());
            case 3:
                return new pe51((MessengerEnvironment) xvf0Var2.get(), (b220) xvf0Var.get());
            default:
                return new od61((c) xvf0Var2.get(), (dqe0) xvf0Var.get());
        }
    }

    public /* synthetic */ x851(xvf0 xvf0Var, xvf0 xvf0Var2, int i) {
        this.a = i;
        this.b = xvf0Var;
        this.c = xvf0Var2;
    }
}
