package defpackage;

import com.google.common.collect.ImmutableMap;
import com.ybsdk.core.analytics.generated.AppAnalyticsReporter;
import com.ybsdk.di.modules.features.x;
import com.ybsdk.feature.webview.internal.a;
import com.ybsdk.feature.webview.internal.presentation.WebViewFragment;
import com.ybsdk.feature.webview.internal.utils.b;

/* loaded from: classes3.dex */
public final class up41 implements v7p {
    public final /* synthetic */ int a;
    public final xvf0 b;

    public up41(tp41 tp41Var, n3w n3wVar) {
        this.a = 0;
        this.b = n3wVar;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        xvf0 xvf0Var = this.b;
        switch (i) {
            case 0:
                tw51 tw51Var = (tw51) xvf0Var.get();
                rbg rbgVar = new rbg(tw51Var, 5);
                rbg rbgVar2 = new rbg(tw51Var, 18);
                rbg rbgVar3 = new rbg(tw51Var, 14);
                int i2 = 11;
                rbg rbgVar4 = new rbg(tw51Var, i2);
                rbg rbgVar5 = new rbg(tw51Var, 10);
                int i3 = 17;
                rbg rbgVar6 = new rbg(tw51Var, i3);
                xvf0 b = i5m.b(new f241(new rbg(tw51Var, 9), i5m.b(new tw11(rbgVar3, i3)), rbgVar5, rbgVar3, 4));
                qd21 qd21Var = new qd21(rbgVar5, rbgVar, rbgVar6, rbgVar3, b, 7);
                rbg rbgVar7 = new rbg(tw51Var, 4);
                rbg rbgVar8 = new rbg(tw51Var, 7);
                int i4 = 12;
                sk21 sk21Var = new sk21(rbgVar7, rbgVar3, new kxb0(rbgVar8, i2), i4);
                rbg rbgVar9 = new rbg(tw51Var, i4);
                rbg rbgVar10 = new rbg(tw51Var, 15);
                e641 e641Var = new e641(rbgVar3, rbgVar10, 2);
                rbg rbgVar11 = new rbg(tw51Var, 13);
                rbg rbgVar12 = new rbg(tw51Var, 8);
                rbg rbgVar13 = new rbg(tw51Var, 16);
                rbg rbgVar14 = new rbg(tw51Var, 6);
                h0l0 h0l0Var = new h0l0(rbgVar, rbgVar2, rbgVar3, n3w.a(new kv41(new jv41(rbgVar4, qd21Var, b, sk21Var, rbgVar7, rbgVar5, rbgVar9, rbgVar3, e641Var, rbgVar11, rbgVar12, rbgVar13, rbgVar14))), n3w.a(new nv41(new jv41(rbgVar4, qd21Var, b, sk21Var, rbgVar7, rbgVar9, rbgVar3, e641Var, rbgVar11, rbgVar5, rbgVar12, rbgVar13, rbgVar14))), new rbg(tw51Var, 20), rbgVar5, rbgVar10, new rbg(tw51Var, 19), n3w.a(new s450(new at20(rbgVar8, rbgVar5))), 25);
                h9g h9gVar = (h9g) tw51Var;
                x8g x8gVar = h9gVar.v;
                vop0 vop0Var = (vop0) x8gVar.H0.get();
                q5z.h(vop0Var);
                h9gVar.A();
                jt41 jt41Var = new jt41();
                if8 A = h9gVar.A();
                x B = h9gVar.B();
                AppAnalyticsReporter r = h9gVar.r();
                q5z.h(r);
                if8 A2 = h9gVar.A();
                q5z.h((dj51) x8gVar.P1.get());
                return new a(vop0Var, jt41Var, A, B, r, new b(A2), ImmutableMap.g(WebViewFragment.class, h0l0Var));
            case 1:
                return new rr41((x22) xvf0Var.get());
            case 2:
                return (fp51) ((t70) xvf0Var.get()).a(fp51.class, "com.yandex.fintechsdk.adapters.yb.sdk.impl.YbAdapterFactory");
            case 3:
                return (fp51) ((t70) xvf0Var.get()).a(fp51.class, "com.yandex.fintechsdk.adapters.yb.sdk.impl.YbAdapterFactory");
            case 4:
                return ((ng51) ((mg51) xvf0Var.get())).b;
            default:
                return new oe61((ah00) xvf0Var.get());
        }
    }

    public /* synthetic */ up41(xvf0 xvf0Var, int i) {
        this.a = i;
        this.b = xvf0Var;
    }
}
