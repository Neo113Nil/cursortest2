package defpackage;

import android.webkit.WebView;
import com.yandex.passport.common.logger.b;
import com.yandex.passport.internal.di.a;
import com.yandex.passport.internal.flags.experiments.p;
import com.yandex.passport.internal.ui.challenge.vpn.a0;
import com.yandex.passport.internal.ui.challenge.vpn.y;
import com.yandex.plus.home.feature.webviews.internal.purchase.button.section.e;
import com.yandex.plus.home.feature.webviews.internal.purchase.subscription.composite.f;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final /* synthetic */ class v4w implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ String b;

    public /* synthetic */ v4w(String str, int i) {
        this.a = i;
        this.b = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        cko D0;
        int i = this.a;
        String str = this.b;
        switch (i) {
            case 0:
                xjo xjoVar = (xjo) obj;
                xjoVar.getClass();
                D0 = xjoVar.D0("SELECT id FROM workspec WHERE state NOT IN (2, 3, 5) AND id IN (SELECT work_spec_id FROM workname WHERE name=?)");
                try {
                    D0.E(1, str);
                    ArrayList arrayList = new ArrayList();
                    while (D0.q()) {
                        arrayList.add(D0.x0(0));
                    }
                    return arrayList;
                } finally {
                }
            case 1:
                xjo xjoVar2 = (xjo) obj;
                xjoVar2.getClass();
                D0 = xjoVar2.D0("UPDATE workspec SET stop_reason = CASE WHEN state=1 THEN 1 ELSE -256 END, state=5 WHERE id=?");
                try {
                    D0.E(1, str);
                    D0.q();
                    int L = gut.L(xjoVar2);
                    D0.close();
                    return Integer.valueOf(L);
                } finally {
                }
            case 2:
                xjo xjoVar3 = (xjo) obj;
                xjoVar3.getClass();
                D0 = xjoVar3.D0("UPDATE workspec SET run_attempt_count=0 WHERE id=?");
                try {
                    D0.E(1, str);
                    D0.q();
                    int L2 = gut.L(xjoVar3);
                    D0.close();
                    return Integer.valueOf(L2);
                } finally {
                }
            case 3:
                xjo xjoVar4 = (xjo) obj;
                xjoVar4.getClass();
                D0 = xjoVar4.D0("UPDATE workspec SET period_count=period_count+1 WHERE id=?");
                try {
                    D0.E(1, str);
                    D0.q();
                    D0.close();
                    return Unit.a;
                } finally {
                }
            case 4:
                xjo xjoVar5 = (xjo) obj;
                xjoVar5.getClass();
                D0 = xjoVar5.D0("SELECT output FROM workspec WHERE id IN\n             (SELECT prerequisite_id FROM dependency WHERE work_spec_id=?)");
                try {
                    D0.E(1, str);
                    ArrayList arrayList2 = new ArrayList();
                    while (D0.q()) {
                        byte[] blob = D0.getBlob(0);
                        q97 q97Var = q97.b;
                        arrayList2.add(cxb.Q(blob));
                    }
                    return arrayList2;
                } finally {
                }
            case 5:
                xjo xjoVar6 = (xjo) obj;
                xjoVar6.getClass();
                D0 = xjoVar6.D0("UPDATE workspec SET run_attempt_count=run_attempt_count+1 WHERE id=?");
                try {
                    D0.E(1, str);
                    D0.q();
                    int L3 = gut.L(xjoVar6);
                    D0.close();
                    return Integer.valueOf(L3);
                } finally {
                }
            case 6:
                xjo xjoVar7 = (xjo) obj;
                xjoVar7.getClass();
                D0 = xjoVar7.D0("DELETE FROM workspec WHERE id=?");
                try {
                    D0.E(1, str);
                    D0.q();
                    D0.close();
                    return Unit.a;
                } finally {
                }
            case 7:
                xjo xjoVar8 = (xjo) obj;
                xjoVar8.getClass();
                D0 = xjoVar8.D0("SELECT id, state FROM workspec WHERE id IN (SELECT work_spec_id FROM workname WHERE name=?)");
                try {
                    D0.E(1, str);
                    ArrayList arrayList3 = new ArrayList();
                    while (D0.q()) {
                        String x0 = D0.x0(0);
                        c4w I = ezf.I((int) D0.getLong(1));
                        x0.getClass();
                        r4w r4wVar = new r4w();
                        r4wVar.a = x0;
                        r4wVar.b = I;
                        arrayList3.add(r4wVar);
                    }
                    return arrayList3;
                } finally {
                }
            case 8:
                xjo xjoVar9 = (xjo) obj;
                xjoVar9.getClass();
                D0 = xjoVar9.D0("SELECT DISTINCT tag FROM worktag WHERE work_spec_id=?");
                try {
                    D0.E(1, str);
                    ArrayList arrayList4 = new ArrayList();
                    while (D0.q()) {
                        arrayList4.add(D0.x0(0));
                    }
                    return arrayList4;
                } finally {
                }
            case 9:
                xjo xjoVar10 = (xjo) obj;
                xjoVar10.getClass();
                D0 = xjoVar10.D0("DELETE FROM worktag WHERE work_spec_id=?");
                try {
                    D0.E(1, str);
                    D0.q();
                    D0.close();
                    return Unit.a;
                } finally {
                }
            case 10:
                jfp jfpVar = (jfp) obj;
                jfpVar.getClass();
                wfp.o(jfpVar, str);
                return Unit.a;
            case 11:
                ((is6) obj).getClass();
                return new y((p) ((a0) a.a().getVpnChallengeViewModelFactory()).a.a.get(), str);
            case 12:
                WebView webView = (WebView) obj;
                webView.getClass();
                if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                    com.yandex.passport.common.logger.a.c(b.b, null, ouj.k(')', "execJsAsync(", str), 8);
                }
                webView.evaluateJavascript(str, null);
                return Unit.a;
            default:
                e eVar = (e) obj;
                eVar.getClass();
                return Boolean.valueOf(Intrinsics.d(((f) eVar.b()).d, str));
        }
    }
}
