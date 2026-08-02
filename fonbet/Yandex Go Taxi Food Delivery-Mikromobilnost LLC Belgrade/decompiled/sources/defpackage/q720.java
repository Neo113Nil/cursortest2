package defpackage;

import android.app.Activity;
import android.content.Context;
import com.yandex.feedsdk.di.FeedSdkComponent;
import com.yandex.go.navigator.safe.a;
import com.ybsdk.feature.transfer.version2.internal.network.Transfer2Api;

/* loaded from: classes15.dex */
public final class q720 implements v7p {
    public final /* synthetic */ int a;
    public final xvf0 b;

    public /* synthetic */ q720(p720 p720Var, eqh eqhVar, int i) {
        this.a = i;
        this.b = eqhVar;
    }

    public static q720 a(eqh eqhVar) {
        return new q720(eqhVar, 26);
    }

    public static q720 b(eqh eqhVar) {
        return new q720(eqhVar, 27);
    }

    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        xvf0 xvf0Var = this.b;
        switch (i) {
            case 0:
                az10 B = ((at2) xvf0Var.get()).B();
                q5z.i(B);
                return B;
            case 1:
                tg90 s0 = ((at2) xvf0Var.get()).s0();
                q5z.i(s0);
                return s0;
            case 2:
                q5b0 W = ((at2) xvf0Var.get()).W();
                q5z.i(W);
                return W;
            case 3:
                t5b0 H = ((at2) xvf0Var.get()).H();
                q5z.i(H);
                return H;
            case 4:
                y7b0 k0 = ((at2) xvf0Var.get()).k0();
                q5z.i(k0);
                return k0;
            case 5:
                s2c0 L = ((at2) xvf0Var.get()).L();
                q5z.i(L);
                return L;
            case 6:
                x2c0 D = ((at2) xvf0Var.get()).D();
                q5z.i(D);
                return D;
            case 7:
                t3f0 k = ((at2) xvf0Var.get()).k();
                q5z.i(k);
                return k;
            case 8:
                uxj0 C = ((at2) xvf0Var.get()).C();
                q5z.i(C);
                return C;
            case 9:
                u2k0 A = ((at2) xvf0Var.get()).A();
                q5z.i(A);
                return A;
            case 10:
                fqr0 O = ((at2) xvf0Var.get()).O();
                q5z.i(O);
                return O;
            case 11:
                kl21 Q = ((at2) xvf0Var.get()).Q();
                q5z.i(Q);
                return Q;
            case 12:
                vl21 I = ((at2) xvf0Var.get()).I();
                q5z.i(I);
                return I;
            case 13:
                kp21 y = ((at2) xvf0Var.get()).y();
                q5z.i(y);
                return y;
            case 14:
                ot21 F = ((at2) xvf0Var.get()).F();
                q5z.i(F);
                return F;
            case 15:
                bv21 a = ((at2) xvf0Var.get()).a();
                q5z.i(a);
                return a;
            case 16:
                mv21 d = ((at2) xvf0Var.get()).d();
                q5z.i(d);
                return d;
            case 17:
                return new bg1((Context) xvf0Var.get());
            case 18:
                return new mf1((Context) xvf0Var.get());
            case 19:
                return new vr((Context) xvf0Var.get(), (char) 0);
            case 20:
                return new vh20((Activity) xvf0Var.get());
            case 21:
                return new a((dj20) xvf0Var.get());
            case 22:
                return new com.ybsdk.feature.transfer.version2.internal.screens.mobilepayments.screens.selectcontact.data.a((Transfer2Api) xvf0Var.get());
            case 23:
                return new com.ybsdk.feature.transfer.version2.internal.screens.mobilepayments.screens.providers.data.a((Transfer2Api) xvf0Var.get());
            case 24:
                return new wy20(i5m.a(xvf0Var));
            case 25:
                return new epz((dne0) xvf0Var.get(), 1);
            case 26:
                return new ps21((pho) xvf0Var.get());
            case 27:
                return new mb30((pho) xvf0Var.get());
            case 28:
                flex.engine.a engine = ((FeedSdkComponent) xvf0Var.get()).getEngine();
                q5z.i(engine);
                return engine;
            default:
                pvy0 themeController = ((FeedSdkComponent) xvf0Var.get()).getThemeController();
                q5z.i(themeController);
                return themeController;
        }
    }

    public /* synthetic */ q720(xvf0 xvf0Var, int i) {
        this.a = i;
        this.b = xvf0Var;
    }
}
