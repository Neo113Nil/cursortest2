package defpackage;

import android.app.Activity;
import com.squareup.moshi.Moshi;
import com.yandex.messaging.internal.avatar.b;
import com.yandex.messaging.profile.d;
import com.ybsdk.core.analytics.generated.AppAnalyticsReporter;
import ru.yandex.taxi.deeplinks.ExternalSchemesInteractor;

/* loaded from: classes8.dex */
public final class zd51 implements v7p {
    public final /* synthetic */ int a;
    public final xvf0 b;

    public zd51(gj51 gj51Var, xvf0 xvf0Var) {
        this.a = 3;
        this.b = xvf0Var;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        int i2 = 2;
        xvf0 xvf0Var = this.b;
        switch (i) {
            case 0:
                return new yd51((rqo) xvf0Var.get());
            case 1:
                return new se51((pho) xvf0Var.get());
            case 2:
                return new te51((pho) xvf0Var.get());
            case 3:
                return new jzz();
            case 4:
                return new ij51((h6r) xvf0Var.get());
            case 5:
                return new vj51((Moshi) xvf0Var.get());
            case 6:
                return new ik51((x22) xvf0Var.get());
            case 7:
                return new jc4((pho) xvf0Var.get());
            case 8:
                return new rx2((pho) xvf0Var.get());
            case 9:
                return new wrz((lx4) xvf0Var.get());
            case 10:
                return new hr51((Activity) xvf0Var.get());
            case 11:
                return new lr51((ExternalSchemesInteractor) xvf0Var.get());
            case 12:
                return new as51((rqo) xvf0Var.get());
            case 13:
                return is51.a((i6r) xvf0Var.get());
            case 14:
                dv51 b = is51.b((ycg) xvf0Var.get());
                q5z.i(b);
                return b;
            case 15:
                return new ht51((ij51) xvf0Var.get());
            case 16:
                return new st51((AppAnalyticsReporter) xvf0Var.get());
            case 17:
                return new oa1((lx4) xvf0Var.get());
            case 18:
                return new aj31(17, (hu51) xvf0Var.get());
            case 19:
                return new o7r0((pho) xvf0Var.get());
            case 20:
                return new ufm(i2, (mt51) xvf0Var.get());
            case 21:
                return new iy51((i4a0) xvf0Var.get());
            case 22:
                return new zy51((fga0) xvf0Var.get());
            case 23:
                return new sjp((rqo) xvf0Var.get(), 2);
            case 24:
                return new b((d) xvf0Var.get());
            case 25:
                return new rx2((pho) xvf0Var.get());
            case 26:
                return new zf((pho) xvf0Var.get());
            case 27:
                return new t61((pho) xvf0Var.get());
            case 28:
                return new rfw0((dne0) xvf0Var.get());
            default:
                return new ed61((wnt) xvf0Var.get());
        }
    }

    public /* synthetic */ zd51(xvf0 xvf0Var, int i) {
        this.a = i;
        this.b = xvf0Var;
    }
}
