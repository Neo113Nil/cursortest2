package defpackage;

import android.content.Context;
import com.yandex.fintechsdk.entities.environment.DefaultEnvironment;
import com.yandex.fintechsdk.entities.region.Region;

/* loaded from: classes12.dex */
public final class twf implements xvf0 {
    public final /* synthetic */ int a;
    public final sg5 b;

    public /* synthetic */ twf(sg5 sg5Var, int i) {
        this.a = i;
        this.b = sg5Var;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        sg5 sg5Var = this.b;
        switch (i) {
            case 0:
                z22 analytics = sg5Var.getAnalytics();
                q5z.h(analytics);
                return analytics;
            case 1:
                Context applicationContext = sg5Var.getApplicationContext();
                q5z.h(applicationContext);
                return applicationContext;
            case 2:
                hk3 a = sg5Var.a();
                q5z.h(a);
                return a;
            case 3:
                return sg5Var.H();
            case 4:
                return sg5Var.e();
            case 5:
                return sg5Var.E();
            case 6:
                return sg5Var.g();
            case 7:
                return sg5Var.q();
            case 8:
                return sg5Var.z();
            case 9:
                DefaultEnvironment environment = sg5Var.getEnvironment();
                q5z.h(environment);
                return environment;
            case 10:
                return sg5Var.m();
            case 11:
                return sg5Var.D();
            case 12:
                return sg5Var.P();
            case 13:
                return sg5Var.b();
            case 14:
                sg5Var.j();
                return null;
            case 15:
                Region O = sg5Var.O();
                q5z.h(O);
                return O;
            case 16:
                return sg5Var.I();
            default:
                return sg5Var.N();
        }
    }
}
