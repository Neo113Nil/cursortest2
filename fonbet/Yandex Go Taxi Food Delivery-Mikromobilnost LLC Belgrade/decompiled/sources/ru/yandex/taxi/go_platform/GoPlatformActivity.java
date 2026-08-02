package ru.yandex.taxi.go_platform;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.yandex.go.platform.di.InternalActivityComponent;
import com.yandex.go.platform.ui.components.InitialState;
import com.yandex.taxi.go_platform.delegates.a;
import com.yandex.taxi.go_platform.delegates.b;
import defpackage.ckf0;
import defpackage.cne0;
import defpackage.d5c;
import defpackage.ep90;
import defpackage.evx;
import defpackage.fn6;
import defpackage.gqt;
import defpackage.h6r;
import defpackage.hqe;
import defpackage.j5z;
import defpackage.jl40;
import defpackage.jqt;
import defpackage.jxi;
import defpackage.kgx;
import defpackage.ku11;
import defpackage.lm;
import defpackage.ln90;
import defpackage.lx4;
import defpackage.m03;
import defpackage.mb20;
import defpackage.mrj0;
import defpackage.ny61;
import defpackage.o3h;
import defpackage.pho;
import defpackage.pj;
import defpackage.pqt;
import defpackage.pux0;
import defpackage.qme0;
import defpackage.qtb1;
import defpackage.tt2;
import defpackage.u02;
import defpackage.uqt;
import defpackage.vg10;
import defpackage.wnt;
import defpackage.wwg;
import defpackage.xvf0;
import defpackage.y50;
import defpackage.zzf;
import io.appmetrica.analytics.rtm.internal.Constants;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import ru.yandex.taxi.am.e;
import ru.yandex.taxi.am.f;
import ru.yandex.taxi.am.g;
import ru.yandex.taxi.am.k;
import ru.yandex.taxi.am.m;
import ru.yandex.taxi.am.s0;
import ru.yandex.taxi.startup.launch.c;

@Metadata(d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0015\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0006\u0010\u0004J\u0019\u0010\t\u001a\u00020\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\r\u001a\u00020\u00052\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0014¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u000f\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0014¢\u0006\u0004\b\u000f\u0010\nJ-\u0010\u0017\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u00102\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J)\u0010\u001b\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0019\u001a\u00020\u00102\b\u0010\u001a\u001a\u0004\u0018\u00010\u0007H\u0014¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u0005H\u0017¢\u0006\u0004\b\u001d\u0010\u0004J\u000f\u0010\u001e\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u001e\u0010\u0004J\r\u0010 \u001a\u00020\u001f¢\u0006\u0004\b \u0010!R\u0018\u0010\"\u001a\u0004\u0018\u00010\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010#R\u0018\u0010%\u001a\u0004\u0018\u00010$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010&R\"\u0010(\u001a\u00020'8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R\"\u0010/\u001a\u00020.8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b/\u00100\u001a\u0004\b1\u00102\"\u0004\b3\u00104R\"\u00106\u001a\u0002058\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b6\u00107\u001a\u0004\b8\u00109\"\u0004\b:\u0010;R\"\u0010=\u001a\u00020<8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b=\u0010>\u001a\u0004\b?\u0010@\"\u0004\bA\u0010BR\"\u0010D\u001a\u00020C8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\bD\u0010E\u001a\u0004\bF\u0010G\"\u0004\bH\u0010IR\"\u0010K\u001a\u00020J8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\bK\u0010L\u001a\u0004\bM\u0010N\"\u0004\bO\u0010PR\u0013\u0010R\u001a\u0004\u0018\u00010\u001f8F¢\u0006\u0006\u001a\u0004\bQ\u0010!¨\u0006S"}, d2 = {"Lru/yandex/taxi/go_platform/GoPlatformActivity;", "Landroidx/fragment/app/FragmentActivity;", "Ld5c;", "<init>", "()V", "Lzy11;", "initActivityComponent", "Landroid/content/Intent;", "intent", "processDeeplink", "(Landroid/content/Intent;)V", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "onNewIntent", "", "requestCode", "", "", "permissions", "", "grantResults", "onRequestPermissionsResult", "(I[Ljava/lang/String;[I)V", "resultCode", Constants.KEY_DATA, "onActivityResult", "(IILandroid/content/Intent;)V", "onBackPressed", "onClose", "Lpqt;", "requireComponent", "()Lpqt;", "goPlatformInitActivityComponent", "Lpqt;", "Lgqt;", "activityComponent", "Lgqt;", "Lcom/yandex/taxi/go_platform/delegates/a;", "accountDelegate", "Lcom/yandex/taxi/go_platform/delegates/a;", "getAccountDelegate", "()Lcom/yandex/taxi/go_platform/delegates/a;", "setAccountDelegate", "(Lcom/yandex/taxi/go_platform/delegates/a;)V", "Lcom/yandex/taxi/go_platform/delegates/b;", "inAppReviewDelegate", "Lcom/yandex/taxi/go_platform/delegates/b;", "getInAppReviewDelegate", "()Lcom/yandex/taxi/go_platform/delegates/b;", "setInAppReviewDelegate", "(Lcom/yandex/taxi/go_platform/delegates/b;)V", "Ljqt;", "deeplinkHandler", "Ljqt;", "getDeeplinkHandler", "()Ljqt;", "setDeeplinkHandler", "(Ljqt;)V", "Lm03;", "applicationRestartRouter", "Lm03;", "getApplicationRestartRouter", "()Lm03;", "setApplicationRestartRouter", "(Lm03;)V", "Lmb20;", "metricaDelegate", "Lmb20;", "getMetricaDelegate", "()Lmb20;", "setMetricaDelegate", "(Lmb20;)V", "Lln90;", "passportApiDelegate", "Lln90;", "getPassportApiDelegate", "()Lln90;", "setPassportApiDelegate", "(Lln90;)V", "getComponent", "component", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class GoPlatformActivity extends FragmentActivity implements d5c {
    public a accountDelegate;
    private gqt activityComponent;
    public m03 applicationRestartRouter;
    public jqt deeplinkHandler;
    private pqt goPlatformInitActivityComponent;
    public b inAppReviewDelegate;
    public mb20 metricaDelegate;
    public ln90 passportApiDelegate;

    private final void initActivityComponent() {
        com.yandex.go.platform.payments.a aVar = new com.yandex.go.platform.payments.a(getAccountDelegate());
        com.yandex.go.platform.di.b bVar = com.yandex.go.platform.sdk.a.a;
        new InternalActivityComponent.a();
        a accountDelegate = getAccountDelegate();
        this.activityComponent = new InternalActivityComponent(this, this, getPassportApiDelegate(), accountDelegate, aVar, getInAppReviewDelegate(), getMetricaDelegate(), InitialState.Spinner, null, null, null, null, EmptyList.a, qtb1.E);
    }

    private final void processDeeplink(Intent intent) {
        if (intent != null) {
            jqt deeplinkHandler = getDeeplinkHandler();
            deeplinkHandler.getClass();
            Uri data = intent.getData();
            boolean z = false;
            if (data != null) {
                ((pux0) deeplinkHandler.a).getClass();
                boolean z2 = kotlin.collections.a.G(pux0.b, data.getScheme()) && jl40.l(data.getAuthority(), "disableGPModeInTaxiApp");
                if (z2) {
                    uqt uqtVar = deeplinkHandler.b.a;
                    qme0 qme0Var = uqtVar.c;
                    kgx[] kgxVarArr = uqt.x;
                    qme0Var.setValue(uqtVar, kgxVarArr[0], Boolean.FALSE);
                    uqtVar.w.setValue(uqtVar, kgxVarArr[1], "");
                    ((cne0) uqtVar.b).b();
                }
                z = z2;
            }
            if (z) {
                getApplicationRestartRouter().a(this);
                return;
            }
        }
        gqt gqtVar = this.activityComponent;
        if (gqtVar != null) {
            gqtVar.processOnNewIntent(intent);
        }
    }

    public final a getAccountDelegate() {
        a aVar = this.accountDelegate;
        if (aVar != null) {
            return aVar;
        }
        return null;
    }

    public final m03 getApplicationRestartRouter() {
        m03 m03Var = this.applicationRestartRouter;
        if (m03Var != null) {
            return m03Var;
        }
        return null;
    }

    /* renamed from: getComponent, reason: from getter */
    public final pqt getGoPlatformInitActivityComponent() {
        return this.goPlatformInitActivityComponent;
    }

    public final jqt getDeeplinkHandler() {
        jqt jqtVar = this.deeplinkHandler;
        if (jqtVar != null) {
            return jqtVar;
        }
        return null;
    }

    public final b getInAppReviewDelegate() {
        b bVar = this.inAppReviewDelegate;
        if (bVar != null) {
            return bVar;
        }
        return null;
    }

    public final mb20 getMetricaDelegate() {
        mb20 mb20Var = this.metricaDelegate;
        if (mb20Var != null) {
            return mb20Var;
        }
        return null;
    }

    public final ln90 getPassportApiDelegate() {
        ln90 ln90Var = this.passportApiDelegate;
        if (ln90Var != null) {
            return ln90Var;
        }
        return null;
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        gqt gqtVar = this.activityComponent;
        if (gqtVar != null) {
            gqtVar.processActivityResult(requestCode, resultCode, data);
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    @jxi
    public void onBackPressed() {
        gqt gqtVar = this.activityComponent;
        if (gqtVar != null ? gqtVar.processOnBackPressed() : false) {
            return;
        }
        super.onBackPressed();
    }

    @Override // defpackage.d5c
    public void onClose() {
        finish();
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (this.goPlatformInitActivityComponent == null) {
            this.goPlatformInitActivityComponent = new fn6(((zzf) ((h6r) wwg.e(this, h6r.class))).b, this);
        }
        fn6 fn6Var = (fn6) requireComponent();
        zzf zzfVar = (zzf) fn6Var.a;
        this.accountDelegate = new a((g) zzfVar.W0.get(), (ru.yandex.taxi.am.token.a) zzfVar.C3.get(), (e) ((xvf0) fn6Var.i).get(), (f) ((xvf0) fn6Var.j).get(), new s0((Context) ((xvf0) fn6Var.k).get(), (u02) zzfVar.M0.get(), (k) zzfVar.L0.get(), (hqe) zzfVar.O0.get(), new ru.yandex.taxi.am.internal.b(zzfVar.a, (k) zzfVar.L0.get(), (j5z) zzfVar.f0.get(), (mrj0) zzfVar.p7.get(), (m) zzfVar.r1.get(), (ru.yandex.taxi.am.token.a) zzfVar.C3.get()), (ep90) zzfVar.S0.get(), (g) zzfVar.J7.get(), (y50) ((xvf0) fn6Var.b).get(), (lm) zzfVar.Qi.get(), (ru.yandex.taxi.activity.g) ((xvf0) fn6Var.g).get(), (c) zzfVar.n5.get(), new ckf0((Activity) ((xvf0) fn6Var.e).get()), new evx((g) zzfVar.W0.get(), (ru.yandex.taxi.am.token.a) zzfVar.C3.get()), (tt2) zzfVar.n.get(), new pj((pho) zzfVar.d0.get())));
        this.inAppReviewDelegate = new b(((ku11) ((xvf0) fn6Var.l).get()).a());
        this.deeplinkHandler = new jqt((o3h) zzfVar.K.get(), zzfVar.w());
        this.applicationRestartRouter = (m03) zzfVar.e0.get();
        this.metricaDelegate = new mb20((lx4) zzfVar.Y.get(), (wnt) zzfVar.q.get());
        this.passportApiDelegate = new ln90((ep90) zzfVar.S0.get());
        initActivityComponent();
        gqt gqtVar = this.activityComponent;
        if (gqtVar == null) {
            ny61.r("Required value was null.");
        } else {
            setContentView(gqtVar.getPlatformView());
            processDeeplink(getIntent());
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        processDeeplink(intent);
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onRequestPermissionsResult(int requestCode, String[] permissions, int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        gqt gqtVar = this.activityComponent;
        if (gqtVar != null) {
            gqtVar.processPermissionsResult(requestCode, permissions, grantResults);
        }
    }

    public final pqt requireComponent() {
        pqt pqtVar = this.goPlatformInitActivityComponent;
        if (pqtVar != null) {
            return pqtVar;
        }
        vg10.p("Activity ", this, " not created");
        return null;
    }

    public final void setAccountDelegate(a aVar) {
        this.accountDelegate = aVar;
    }

    public final void setApplicationRestartRouter(m03 m03Var) {
        this.applicationRestartRouter = m03Var;
    }

    public final void setDeeplinkHandler(jqt jqtVar) {
        this.deeplinkHandler = jqtVar;
    }

    public final void setInAppReviewDelegate(b bVar) {
        this.inAppReviewDelegate = bVar;
    }

    public final void setMetricaDelegate(mb20 mb20Var) {
        this.metricaDelegate = mb20Var;
    }

    public final void setPassportApiDelegate(ln90 ln90Var) {
        this.passportApiDelegate = ln90Var;
    }
}
