package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import androidx.concurrent.futures.b;
import androidx.work.impl.d;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.wallet.CardRequirements;
import com.google.android.gms.wallet.PaymentDataRequest;
import com.google.firebase.crashlytics.internal.common.a;
import com.yandex.go.fragment.router.ScreenStackRootFragment;
import com.yandex.go.navigation.api.router.BaseRootNavigationRouter;
import com.yandex.go.navigation.api.router.FragmentAnimation$TransitionType;
import com.yandex.go.navigation.screen.api.Screen;
import com.yandex.go.overdraft.data.model.DebtFlowHeader;
import com.yandex.go.payments.addmethod.analytics.PaymentMethodsAnalytics$PlatformPayAction;
import com.yandex.go.payments.addmethod.analytics.PaymentMethodsAnalytics$PlatformPayProvider;
import com.yandex.go.payments.api.GooglePayInteractor$GooglePayTokenResult;
import com.yandex.go.payments.googlepay.domain.e;
import io.appmetrica.analytics.AppMetricaConfig;
import io.appmetrica.analytics.AppMetricaLibraryAdapterConfig;
import io.appmetrica.analytics.impl.C0377h0;
import io.appmetrica.analytics.impl.J1;
import io.appmetrica.analytics.impl.K6;
import io.appmetrica.analytics.impl.X8;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.collections.EmptyList;
import ru.yandex.taxi.activity.MainActivity;
import ru.yandex.taxi.banners.c;
import ru.yandex.taxi.location.lbs.gsm.GsmCellsInteractorImpl$requestCellInfos$2$callback$1;
import ru.yandex.taxi.promotions.model.Promotion;

/* loaded from: classes9.dex */
public final /* synthetic */ class r94 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object w;

    public /* synthetic */ r94(AtomicBoolean atomicBoolean, b bVar, sls slsVar) {
        this.a = 9;
        this.b = atomicBoolean;
        this.w = bVar;
        this.c = slsVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        u1m u1mVar;
        String str;
        r631 r631Var;
        ConcurrentHashMap concurrentHashMap;
        PaymentDataRequest paymentDataRequest;
        xbs wbsVar;
        boolean z = true;
        switch (this.a) {
            case 0:
                Runnable runnable = (Runnable) this.b;
                sls slsVar = (sls) this.c;
                View view = (View) this.w;
                runnable.run();
                String str2 = (String) slsVar.invoke();
                if (str2 == null || evu0.J(str2)) {
                    return;
                }
                udq0.N(view, str2);
                return;
            case 1:
                String str3 = (String) this.b;
                c cVar = (c) this.c;
                Promotion promotion = (Promotion) this.w;
                esc escVar = new esc(0);
                jr4 jr4Var = kr4.a;
                if (str3 == null) {
                    str3 = ((cay0) cVar.e).b();
                }
                cVar.k(promotion, "open_screen", jr4Var, escVar, str3);
                return;
            case 2:
                v2f v2fVar = (v2f) this.b;
                String str4 = (String) this.c;
                String str5 = (String) this.w;
                a aVar = v2fVar.h;
                aVar.getClass();
                try {
                    aVar.d.d.n(str4, str5);
                    return;
                } catch (IllegalArgumentException e) {
                    Context context = aVar.a;
                    if (context != null && (context.getApplicationInfo().flags & 2) != 0) {
                        throw e;
                    }
                    Log.e("FirebaseCrashlytics", "Attempting to set custom attribute with null key, ignoring.", null);
                    return;
                }
            case 3:
                ((com.yandex.go.overdraft.ui.c) this.b).accept(((DebtFlowHeader) this.c).e, (Screen) this.w);
                return;
            case 4:
                flex.engine.a aVar2 = (flex.engine.a) this.b;
                d3m d3mVar = (d3m) this.c;
                gfe gfeVar = (gfe) this.w;
                m631 m631Var = (m631) d3mVar.b.a.c.b(qoi0.a(m631.class));
                Map map = m631Var != null ? m631Var.a : null;
                if (jl40.l(map != null ? (String) map.get("headRequest") : null, "true") && (u1mVar = d3mVar.c) != null && (str = u1mVar.a) != null && (r631Var = aVar2.B) != null && (concurrentHashMap = (ConcurrentHashMap) ((ConcurrentHashMap) r631Var.a.w).get(new q690(str))) != null) {
                    concurrentHashMap.clear();
                }
                gfeVar.e(new ou(13, aVar2, d3mVar));
                return;
            case 5:
                ((bys) this.c).x.b((List) this.w, (Runnable) this.b);
                return;
            case 6:
                e eVar = (e) this.b;
                MainActivity mainActivity = (MainActivity) this.c;
                Status a = kt3.a((Intent) this.w);
                String str6 = "Google Pay card select error: " + a;
                String e2 = a != null ? hwa1.e(a.getStatusCode()) : null;
                if (a == null || a.getStatusCode() != 8 || (paymentDataRequest = eVar.w) == null || paymentDataRequest.isUiRequired()) {
                    xby.l(jst.e, g8e.o("GOOGLE_PAY.TOKEN_ERROR:", e2), null, new RuntimeException(str6), "Google Pay card select error", 2);
                    eVar.v = uut.e;
                    eVar.s.g(GooglePayInteractor$GooglePayTokenResult.ERROR);
                    ((g9a0) eVar.k.get()).g(PaymentMethodsAnalytics$PlatformPayProvider.GooglePay, PaymentMethodsAnalytics$PlatformPayAction.SelectError, eVar.u, a != null ? String.valueOf(a.getStatusCode()) : null);
                    return;
                }
                xby.l(jst.e, g8e.o("GOOGLE_PAY.RESOLVABLE_TOKEN_ERROR:", e2), null, new RuntimeException(str6), "Google Pay card select error", 2);
                com.google.android.gms.wallet.c newBuilder = PaymentDataRequest.newBuilder();
                newBuilder.e(paymentDataRequest.getTransactionInfo());
                newBuilder.a(paymentDataRequest.getAllowedPaymentMethods());
                newBuilder.d(paymentDataRequest.getPaymentMethodTokenizationParameters());
                newBuilder.f(paymentDataRequest.isUiRequired());
                CardRequirements cardRequirements = paymentDataRequest.getCardRequirements();
                if (cardRequirements != null) {
                    newBuilder.c(cardRequirements);
                }
                newBuilder.f(true);
                eVar.i(mainActivity, newBuilder.b());
                return;
            case 7:
                Runnable runnable2 = (Runnable) this.b;
                n3u n3uVar = (n3u) this.c;
                k3f k3fVar = (k3f) this.w;
                try {
                    runnable2.run();
                    return;
                } catch (NullPointerException unused) {
                    q7y q7yVar = n3uVar.c;
                    IllegalStateException illegalStateException = new IllegalStateException();
                    q7yVar.getClass();
                    q7y.a(illegalStateException, "Gsm: exception in the executor while requesting cell info update");
                    ((GsmCellsInteractorImpl$requestCellInfos$2$callback$1) k3fVar.c).onCellInfo(EmptyList.a);
                    return;
                }
            case 8:
                ((J1) this.b).b((Context) this.c, (AppMetricaConfig) this.w);
                return;
            case 9:
                AtomicBoolean atomicBoolean = (AtomicBoolean) this.b;
                b bVar = (b) this.w;
                sls slsVar2 = (sls) this.c;
                if (atomicBoolean.get()) {
                    return;
                }
                try {
                    bVar.b(slsVar2.invoke());
                    return;
                } catch (Throwable th) {
                    bVar.d(th);
                    return;
                }
            case 10:
                r6f0 r6f0Var = (r6f0) this.b;
                gl7 gl7Var = (gl7) this.c;
                d dVar = (d) this.w;
                r6f0Var.getClass();
                try {
                    z = ((Boolean) gl7Var.b.get()).booleanValue();
                } catch (InterruptedException | ExecutionException unused2) {
                }
                synchronized (r6f0Var.k) {
                    try {
                        n951 q = udq0.q(dVar.a);
                        String str7 = q.a;
                        if (r6f0Var.c(str7) == dVar) {
                            r6f0Var.b(str7);
                        }
                        hgz.g().getClass();
                        Iterator it = r6f0Var.j.iterator();
                        while (it.hasNext()) {
                            ((uko) it.next()).onExecuted(q, z);
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                return;
            case 11:
                pep0 pep0Var = (pep0) this.b;
                lwk0 lwk0Var = (lwk0) this.c;
                ddf ddfVar = (ddf) this.w;
                com.yandex.go.mainscreen.superapp.impl.fragment.a aVar3 = (com.yandex.go.mainscreen.superapp.impl.fragment.a) pep0Var.c.get();
                qep0 qep0Var = ScreenStackRootFragment.Companion;
                BaseRootNavigationRouter baseRootNavigationRouter = (BaseRootNavigationRouter) lwk0Var;
                Screen screen = baseRootNavigationRouter.P().a;
                BaseRootNavigationRouter.Background background = baseRootNavigationRouter.P().b;
                qep0Var.getClass();
                ScreenStackRootFragment screenStackRootFragment = new ScreenStackRootFragment();
                Bundle bundle = new Bundle(2);
                bundle.putInt("arg_background", background.ordinal());
                bundle.putInt("arg_screen", screen.ordinal());
                screenStackRootFragment.setArguments(bundle);
                BaseRootNavigationRouter.AnimationType animationType = baseRootNavigationRouter.P().c;
                FragmentAnimation$TransitionType fragmentAnimation$TransitionType = (FragmentAnimation$TransitionType) ddfVar.b;
                if (fragmentAnimation$TransitionType == null) {
                    fragmentAnimation$TransitionType = FragmentAnimation$TransitionType.ENTER;
                }
                int i = com.yandex.go.navigation.api.router.a.a[animationType.ordinal()];
                if (i == 1) {
                    wbsVar = new wbs(fragmentAnimation$TransitionType);
                } else if (i == 2) {
                    wbsVar = new vbs(fragmentAnimation$TransitionType);
                } else {
                    if (i != 3) {
                        w511.b();
                        return;
                    }
                    wbsVar = ubs.a;
                }
                aVar3.d(screenStackRootFragment, wbsVar);
                ddfVar.b = null;
                return;
            case 12:
                X8.a((X8) this.b, (Bundle) this.c, (K6) this.w);
                return;
            default:
                C0377h0.a((C0377h0) this.b, (Context) this.c, (AppMetricaLibraryAdapterConfig) this.w);
                return;
        }
    }

    public /* synthetic */ r94(bys bysVar, List list, Runnable runnable) {
        this.a = 5;
        this.c = bysVar;
        this.w = list;
        this.b = runnable;
    }

    public /* synthetic */ r94(int i, Object obj, Object obj2, Object obj3) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.w = obj3;
    }
}
