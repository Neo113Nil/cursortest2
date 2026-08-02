package defpackage;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Looper;
import android.os.RemoteException;
import android.os.StrictMode;
import android.os.SystemClock;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.appcompat.view.menu.MenuBuilder;
import androidx.appcompat.widget.d;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.internal.zact;
import com.google.android.gms.common.internal.IAccountAccessor;
import com.google.android.gms.internal.measurement.zzcu;
import com.google.android.gms.measurement.internal.j;
import com.google.android.gms.measurement.internal.zzgb;
import com.google.android.gms.measurement.internal.zzjk;
import com.google.android.gms.measurement.internal.zzoh;
import com.google.android.gms.measurement.internal.zzr;
import com.google.android.gms.signin.internal.zak;
import com.yandex.div.core.view2.debugview.b;
import com.yandex.go.chargers.design.components.ChargersOrderTabsView;
import com.yandex.go.chargers.order.active.ChargersActiveOrderModalView;
import com.yandex.go.lifecycle.processor.e;
import com.yandex.go.navigation.screen.c;
import com.yandex.go.scooters.offers.v2.components.tariffs.ui.v2.ScootersTariffItemViewImplV2;
import com.yandex.go.superapp.order.multi.old.provider.g;
import com.yandex.go.taxi.summary.mobilityhub.verticalhub.v1.ui.VerticalHubV1ModalView;
import com.yandex.go.taxi.summary.mobilityhub.verticalhub.v1.ui.a;
import com.yandex.messaging.internal.ServerMessageRef;
import com.ybsdk.screens.registration.phoneconfirmation.presentation.PhoneConfirmationViewState$PhoneMode;
import defpackage.feb0;
import defpackage.lcb1;
import java.lang.ref.ReferenceQueue;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import ru.CryptoPro.JCSP.tools.common.window.ipc.RemoteBioParameters;
import ru.yandex.taxi.delivery.contacts.DeliveryContactsModalView;
import ru.yandex.taxi.perf.Milestone;
import ru.yandex.taxi.perf.screen.ElementPerformanceState;
import ru.yandex.taxi.scooters.presentation.ontheway.completion.completion_acceptance.ScootersCompletionAcceptanceModalView;
import ru.yandex.taxi.shortcuts.ui.shortcutview.ShortcutsView;
import ru.yandex.taxi.shortcuts.ui.shortcutview.f;
import yads.t52;
import yads.yl2;

/* loaded from: classes11.dex */
public final class tqs implements Runnable {
    public final /* synthetic */ int a;
    public final Object b;
    public final Object c;

    public tqs(j jVar, zzcu zzcuVar) {
        this.a = 26;
        this.b = zzcuVar;
        Objects.requireNonNull(jVar);
        this.c = jVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x019a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        Throwable b;
        View content;
        View content2;
        Integer num;
        k3s0 k3s0Var;
        ms2 ms2Var;
        f fVar;
        jx70 jx70Var;
        a aVar;
        xb31 binding;
        Map map;
        IAccountAccessor iAccountAccessor;
        Long valueOf;
        boolean contains;
        int i = 1;
        fa51 fa51Var = null;
        switch (this.a) {
            case 0:
                hqs hqsVar = (hqs) this.c;
                Future future = (Future) this.b;
                if ((future instanceof x7) && (b = ((x7) future).b()) != null) {
                    hqsVar.onFailure(b);
                    return;
                }
                try {
                    hqsVar.onSuccess(vqs.e(future));
                    return;
                } catch (ExecutionException e) {
                    hqsVar.onFailure(e.getCause());
                    return;
                } catch (Throwable th) {
                    hqsVar.onFailure(th);
                    return;
                }
            case 1:
                qw qwVar = (qw) this.b;
                d dVar = (d) this.c;
                MenuBuilder menuBuilder = dVar.c;
                if (menuBuilder != null) {
                    menuBuilder.changeMenuMode();
                }
                View view = (View) dVar.A;
                if (view != null && view.getWindowToken() != null) {
                    if (!qwVar.c()) {
                        if (qwVar.f != null) {
                            qwVar.g(0, 0, false, false);
                        }
                    }
                    dVar.M = qwVar;
                }
                dVar.O = null;
                return;
            case 2:
                ((i00) ((b00) this.b).j.getValue()).a(new vwi0((String) this.c));
                return;
            case 3:
                ((gj5) this.b).d0((yi5) this.c);
                return;
            case 4:
                ChargersOrderTabsView chargersOrderTabsView = (ChargersOrderTabsView) this.b;
                content = ((ChargersActiveOrderModalView) this.c).getContent();
                chargersOrderTabsView.setLayoutParams(new LinearLayout.LayoutParams(content.getWidth() - (tje.u(64, chargersOrderTabsView.getContext()) * 2), tje.u(48, chargersOrderTabsView.getContext())));
                xw31.E(chargersOrderTabsView, 0, 0, 0, Integer.valueOf(tje.u(8, chargersOrderTabsView.getContext())));
                return;
            case 5:
                b bVar = (b) this.b;
                if (jl40.l(bVar.n.c, (wsu) this.c)) {
                    return;
                }
                bVar.d(h3u0.a(bVar.n, false, false, (wsu) this.c, null, null, 27));
                return;
            case 6:
                ConstraintLayout constraintLayout = (ConstraintLayout) this.b;
                ViewGroup.LayoutParams layoutParams = constraintLayout.getLayoutParams();
                content2 = ((DeliveryContactsModalView) this.c).getContent();
                layoutParams.height = content2.getMeasuredHeight();
                constraintLayout.setLayoutParams(layoutParams);
                return;
            case 7:
                ((com.yandex.div.core.tooltip.b) this.b).d(((gil) this.c).h);
                return;
            case 8:
                ((gh00) ((com.yandex.go.layers.domain.a) this.b).b).u((fz1) this.c);
                return;
            case 9:
                xht xhtVar = (xht) this.c;
                if (xhtVar.d) {
                    StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder().detectNetwork().penaltyDeath().build());
                }
                try {
                    ((Runnable) this.b).run();
                    return;
                } catch (Throwable th2) {
                    xhtVar.c.getClass();
                    if (Log.isLoggable("GlideExecutor", 6)) {
                        Log.e("GlideExecutor", "Request threw uncaught throwable", th2);
                        return;
                    }
                    return;
                }
            case 10:
                ((jhv) this.b).q("ACTION_DELETE", (ServerMessageRef) this.c);
                return;
            case 11:
                t1s t1sVar = (t1s) this.c;
                gj10 gj10Var = (gj10) t1sVar.c;
                if (t1sVar.b && jl40.l(gj10Var.c, t1sVar)) {
                    gj10Var.b.c("qm_suggest_drawn", RemoteBioParameters.TIME, Long.valueOf(SystemClock.elapsedRealtime() - t1sVar.a));
                    gj10Var.c = null;
                    return;
                }
                return;
            case 12:
                final feb0 feb0Var = (feb0) this.b;
                AnimatorSet animatorSet = feb0Var.d;
                if (animatorSet != null) {
                    animatorSet.removeAllListeners();
                    animatorSet.cancel();
                }
                feb0Var.d = null;
                final PhoneConfirmationViewState$PhoneMode phoneConfirmationViewState$PhoneMode = (PhoneConfirmationViewState$PhoneMode) this.c;
                if (phoneConfirmationViewState$PhoneMode == feb0Var.e || phoneConfirmationViewState$PhoneMode == PhoneConfirmationViewState$PhoneMode.DO_NOT_SHOW) {
                    return;
                }
                feb0Var.d = null;
                boolean z = feb0Var.e == null;
                AnimatorSet animatorSet2 = new AnimatorSet();
                View view2 = feb0Var.a;
                PhoneConfirmationViewState$PhoneMode phoneConfirmationViewState$PhoneMode2 = PhoneConfirmationViewState$PhoneMode.PREDEFINED;
                ObjectAnimator a = feb0.a(z ? 0L : 300L, view2, phoneConfirmationViewState$PhoneMode == phoneConfirmationViewState$PhoneMode2);
                View view3 = feb0Var.b;
                PhoneConfirmationViewState$PhoneMode phoneConfirmationViewState$PhoneMode3 = PhoneConfirmationViewState$PhoneMode.EDIT;
                ObjectAnimator a2 = feb0.a(z ? 0L : 300L, view3, phoneConfirmationViewState$PhoneMode == phoneConfirmationViewState$PhoneMode3);
                a2.addListener(new Animator.AnimatorListener() { // from class: com.ybsdk.screens.registration.phoneconfirmation.presentation.PhoneConfirmationFragment$PhoneModeAnimator$createRootAnimator$lambda$5$lambda$3$$inlined$doOnStart$1
                    @Override // android.animation.Animator.AnimatorListener
                    public void onAnimationCancel(Animator animator) {
                    }

                    @Override // android.animation.Animator.AnimatorListener
                    public void onAnimationEnd(Animator animator) {
                    }

                    @Override // android.animation.Animator.AnimatorListener
                    public void onAnimationRepeat(Animator animator) {
                    }

                    @Override // android.animation.Animator.AnimatorListener
                    public void onAnimationStart(Animator animator) {
                        if (PhoneConfirmationViewState$PhoneMode.this == PhoneConfirmationViewState$PhoneMode.PREDEFINED) {
                            lcb1.d(feb0Var.b);
                        }
                    }
                });
                a2.addListener(new Animator.AnimatorListener() { // from class: com.ybsdk.screens.registration.phoneconfirmation.presentation.PhoneConfirmationFragment$PhoneModeAnimator$createRootAnimator$lambda$5$lambda$3$$inlined$doOnEnd$1
                    @Override // android.animation.Animator.AnimatorListener
                    public void onAnimationCancel(Animator animator) {
                    }

                    @Override // android.animation.Animator.AnimatorListener
                    public void onAnimationEnd(Animator animator) {
                        if (PhoneConfirmationViewState$PhoneMode.this == PhoneConfirmationViewState$PhoneMode.EDIT) {
                            View view4 = feb0Var.b;
                            view4.requestFocus();
                            lcb1.f(view4);
                        }
                    }

                    @Override // android.animation.Animator.AnimatorListener
                    public void onAnimationRepeat(Animator animator) {
                    }

                    @Override // android.animation.Animator.AnimatorListener
                    public void onAnimationStart(Animator animator) {
                    }
                });
                View view4 = feb0Var.c;
                boolean z2 = phoneConfirmationViewState$PhoneMode == phoneConfirmationViewState$PhoneMode2;
                if (feb0Var.f == null) {
                    feb0Var.f = Integer.valueOf(view4.getHeight());
                }
                ValueAnimator ofInt = ValueAnimator.ofInt(z2 ? 0 : view4.getHeight(), (!z2 || (num = feb0Var.f) == null) ? 0 : num.intValue());
                ofInt.setDuration(z ? 0L : 300L);
                ofInt.addUpdateListener(new wd2(view4, 8));
                ObjectAnimator a3 = feb0.a(z ? 0L : 150L, view4, z2);
                AnimatorSet animatorSet3 = new AnimatorSet();
                animatorSet3.playTogether(ofInt, a3);
                ObjectAnimator objectAnimator = phoneConfirmationViewState$PhoneMode == phoneConfirmationViewState$PhoneMode3 ? a : a2;
                if (phoneConfirmationViewState$PhoneMode == phoneConfirmationViewState$PhoneMode3) {
                    a = a2;
                }
                animatorSet2.addListener(new Animator.AnimatorListener() { // from class: com.ybsdk.screens.registration.phoneconfirmation.presentation.PhoneConfirmationFragment$PhoneModeAnimator$createRootAnimator$lambda$5$$inlined$doOnEnd$1
                    @Override // android.animation.Animator.AnimatorListener
                    public void onAnimationCancel(Animator animator) {
                    }

                    @Override // android.animation.Animator.AnimatorListener
                    public void onAnimationEnd(Animator animator) {
                        feb0.this.e = phoneConfirmationViewState$PhoneMode;
                    }

                    @Override // android.animation.Animator.AnimatorListener
                    public void onAnimationRepeat(Animator animator) {
                    }

                    @Override // android.animation.Animator.AnimatorListener
                    public void onAnimationStart(Animator animator) {
                    }
                });
                animatorSet2.play(animatorSet3).with(objectAnimator);
                animatorSet2.play(a).after(z ? 0L : 250L).after(objectAnimator);
                animatorSet2.start();
                feb0Var.d = animatorSet2;
                return;
            case 13:
                ((j18) this.c).G((zko) this.b, zy11.a);
                return;
            case 14:
                ((ScootersCompletionAcceptanceModalView) this.c).forceApplyInsets();
                return;
            case 15:
                boolean z3 = ((i5p0) this.b).c;
                ScootersTariffItemViewImplV2 scootersTariffItemViewImplV2 = (ScootersTariffItemViewImplV2) this.c;
                if (z3) {
                    scootersTariffItemViewImplV2.transitionToEnd();
                    return;
                } else {
                    scootersTariffItemViewImplV2.transitionToStart();
                    return;
                }
            case 16:
                ShortcutsView shortcutsView = (ShortcutsView) this.b;
                k3s0Var = shortcutsView.shortcutsOnPreDrawTracker;
                int i2 = k3s0Var.c - 1;
                k3s0Var.c = i2;
                if (i2 <= 0) {
                    k3s0Var.a.g(zy11.a);
                }
                if (jl40.l((f1z) this.c, d1z.a)) {
                    ms2Var = shortcutsView.appCreateAnalytics;
                    ms2Var.a(Milestone.ShortcutsRender);
                    fVar = shortcutsView.presenter;
                    fVar.J.i(new gwx0(ElementPerformanceState.LARGEST_CONTENTFUL_PAINT));
                    if (!fVar.Z) {
                        fVar.Z = true;
                        ((e) fVar.Q.get()).c();
                    }
                    jx70Var = shortcutsView.orderInconsistencyCheckInteractor;
                    nmx nmxVar = jx70Var.c;
                    g gVar = jx70Var.a;
                    c cVar = jx70Var.b;
                    if (cVar.f()) {
                        if (!gVar.d()) {
                            xby.l(jst.e, "ORDER_INCONSISTENCY:ORDER_SCREEN_WITHOUT_ACTIVE_ORDERS", null, null, "OrderScreen opened without active orders to show, known orders = " + nmxVar.a(), 6);
                        }
                    } else if (cVar.h() && gVar.d()) {
                        gVar.a();
                        xby.l(jst.e, "ORDER_INCONSISTENCY:MAIN_SCREEN_WITH_ACTIVE_ORDERS", null, null, "MainScreen opened with active orders, known orders = " + nmxVar.a(), 6);
                    }
                }
                shortcutsView.notifyShortcutsVisibilityListener();
                return;
            case 17:
                r6f0 r6f0Var = ((y2x0) this.c).a.f;
                String str = (String) this.b;
                synchronized (r6f0Var.k) {
                    try {
                        androidx.work.impl.d c = r6f0Var.c(str);
                        if (c != null) {
                            fa51Var = c.a;
                        }
                    } finally {
                    }
                }
                if (fa51Var == null || jl40.l(k8e.j, fa51Var.j)) {
                    return;
                }
                synchronized (((y2x0) this.c).c) {
                    ((y2x0) this.c).y.put(udq0.q(fa51Var), fa51Var);
                    y2x0 y2x0Var = (y2x0) this.c;
                    ((y2x0) this.c).z.put(udq0.q(fa51Var), androidx.work.impl.constraints.d.a(y2x0Var.A, fa51Var, ((t951) y2x0Var.b).b, y2x0Var));
                }
                return;
            case 18:
                VerticalHubV1ModalView verticalHubV1ModalView = (VerticalHubV1ModalView) this.b;
                aVar = verticalHubV1ModalView.shownItemsDelegate;
                binding = verticalHubV1ModalView.getBinding();
                aVar.a(binding.d);
                ((sls) this.c).invoke();
                return;
            case 19:
                xd51 xd51Var = (xd51) this.b;
                zj41 zj41Var = (zj41) this.c;
                z83.g(null, xd51Var.w.getLooper(), Looper.myLooper());
                z83.g(null, zj41Var, xd51Var.C);
                ydi0 ydi0Var = (ydi0) zj41Var;
                ydi0Var.a();
                xd51Var.C = null;
                je51 je51Var = xd51Var.a;
                je51Var.b(ydi0Var);
                if (je51Var.a()) {
                    xd51Var.h();
                    return;
                }
                return;
            case 20:
                ((t52) this.b).b.setVisibility(4);
                ((yl2) this.c).a.setVisibility(0);
                return;
            case 21:
                ConnectionResult connectionResult = (ConnectionResult) this.b;
                ly81 ly81Var = (ly81) this.c;
                om2 om2Var = ly81Var.a;
                map = ly81Var.f.zan;
                jy81 jy81Var = (jy81) map.get(ly81Var.b);
                if (jy81Var == null) {
                    return;
                }
                if (!connectionResult.isSuccess()) {
                    jy81Var.o(connectionResult, null);
                    return;
                }
                ly81Var.e = true;
                if (om2Var.requiresSignIn()) {
                    if (!ly81Var.e || (iAccountAccessor = ly81Var.c) == null) {
                        return;
                    }
                    om2Var.getRemoteService(iAccountAccessor, ly81Var.d);
                    return;
                }
                try {
                    om2Var.getRemoteService(null, om2Var.getScopesForConnectionlessNonSignIn());
                    return;
                } catch (SecurityException e2) {
                    Log.e("GoogleApiManager", "Failed to get service from broker. ", e2);
                    om2Var.disconnect("Failed to get service from broker.");
                    jy81Var.o(new ConnectionResult(10), null);
                    return;
                }
            case 22:
                zact.zad((zact) this.c, (zak) this.b);
                return;
            case 23:
                com.android.billingclient.api.a aVar2 = (com.android.billingclient.api.a) this.b;
                fs5 fs5Var = (fs5) this.c;
                ns5 ns5Var = fe91.l;
                aVar2.B(24, 4, ns5Var);
                fs5Var.c(ns5Var);
                return;
            case 24:
                ReferenceQueue referenceQueue = (ReferenceQueue) this.b;
                while (!((Set) this.c).isEmpty()) {
                    try {
                        tg91 tg91Var = (tg91) referenceQueue.remove();
                        if (tg91Var.a.remove(tg91Var)) {
                            tg91Var.clear();
                            tg91Var.b.getClass();
                        }
                    } catch (InterruptedException unused) {
                    }
                }
                return;
            case 25:
                new StringBuilder(String.valueOf(((Intent) this.b).getAction()).length() + 61);
                ((bx91) this.c).a();
                return;
            case 26:
                zzcu zzcuVar = (zzcu) this.b;
                j jVar = (j) this.c;
                com.google.android.gms.measurement.internal.g gVar2 = (com.google.android.gms.measurement.internal.g) jVar.b;
                com.google.android.gms.measurement.internal.g gVar3 = (com.google.android.gms.measurement.internal.g) jVar.b;
                m8b1 m8b1Var = gVar2.A;
                com.google.android.gms.measurement.internal.g.f(m8b1Var);
                com.google.android.gms.measurement.internal.g gVar4 = (com.google.android.gms.measurement.internal.g) m8b1Var.b;
                o5a1 o5a1Var = gVar4.x;
                com.google.android.gms.measurement.internal.g.e(o5a1Var);
                if (o5a1Var.Ng().i(zzjk.ANALYTICS_STORAGE)) {
                    com.google.android.gms.measurement.internal.g.e(o5a1Var);
                    u4a1 u4a1Var = o5a1Var.K;
                    gVar4.D.getClass();
                    if (!o5a1Var.Qg(System.currentTimeMillis()) && u4a1Var.a() != 0) {
                        valueOf = Long.valueOf(u4a1Var.a());
                        if (valueOf == null) {
                            ieb1 ieb1Var = gVar3.B;
                            com.google.android.gms.measurement.internal.g.e(ieb1Var);
                            ieb1Var.oh(zzcuVar, valueOf.longValue());
                            return;
                        } else {
                            try {
                                zzcuVar.zzb(null);
                                return;
                            } catch (RemoteException e3) {
                                y1a1 y1a1Var = gVar3.y;
                                com.google.android.gms.measurement.internal.g.g(y1a1Var);
                                y1a1Var.z.b(e3, "getSessionId failed with exception");
                                return;
                            }
                        }
                    }
                } else {
                    y1a1 y1a1Var2 = gVar4.y;
                    com.google.android.gms.measurement.internal.g.g(y1a1Var2);
                    y1a1Var2.E.a("Analytics storage consent denied; will not get session id");
                }
                valueOf = null;
                if (valueOf == null) {
                }
                break;
            case 27:
                j jVar2 = (j) this.c;
                com.google.android.gms.measurement.internal.g gVar5 = (com.google.android.gms.measurement.internal.g) jVar2.b;
                o5a1 o5a1Var2 = gVar5.x;
                y1a1 y1a1Var3 = gVar5.y;
                com.google.android.gms.measurement.internal.g.e(o5a1Var2);
                o5a1Var2.Gg();
                o5a1Var2.Gg();
                x791 b2 = x791.b(o5a1Var2.Kg().getString("dma_consent_settings", null));
                x791 x791Var = (x791) this.b;
                int i3 = x791Var.a;
                if (!wia1.l(i3, b2.a)) {
                    com.google.android.gms.measurement.internal.g.g(y1a1Var3);
                    y1a1Var3.F.b(Integer.valueOf(i3), "Lower precedence consent source ignored, proposed source");
                    return;
                }
                SharedPreferences.Editor edit = o5a1Var2.Kg().edit();
                edit.putString("dma_consent_settings", x791Var.b);
                edit.apply();
                com.google.android.gms.measurement.internal.g.g(y1a1Var3);
                y1a1Var3.H.b(x791Var, "Setting DMA consent(FE)");
                com.google.android.gms.measurement.internal.g gVar6 = (com.google.android.gms.measurement.internal.g) jVar2.b;
                if (gVar6.j().Qg()) {
                    j5b1 j = gVar6.j();
                    j.Gg();
                    j.Hg();
                    j.Ug(new b4b1(j, i));
                    return;
                }
                j5b1 j2 = gVar6.j();
                j2.Gg();
                j2.Hg();
                if (j2.Pg()) {
                    j2.Ug(new oza1(j2, j2.Wg(false), 1));
                    return;
                }
                return;
            case 28:
                j jVar3 = (j) this.b;
                jVar3.Gg();
                if (Build.VERSION.SDK_INT < 30) {
                    return;
                }
                List<zzoh> list = (List) this.c;
                o5a1 o5a1Var3 = ((com.google.android.gms.measurement.internal.g) jVar3.b).x;
                com.google.android.gms.measurement.internal.g.e(o5a1Var3);
                SparseArray Mg = o5a1Var3.Mg();
                for (zzoh zzohVar : list) {
                    int i4 = zzohVar.zzc;
                    contains = Mg.contains(i4);
                    if (!contains || ((Long) Mg.get(i4)).longValue() < zzohVar.zzb) {
                        jVar3.eh().add(zzohVar);
                    }
                }
                jVar3.fh();
                return;
            default:
                j5b1 j5b1Var = (j5b1) this.c;
                zzgb zzgbVar = j5b1Var.x;
                com.google.android.gms.measurement.internal.g gVar7 = (com.google.android.gms.measurement.internal.g) j5b1Var.b;
                if (zzgbVar == null) {
                    y1a1 y1a1Var4 = gVar7.y;
                    com.google.android.gms.measurement.internal.g.g(y1a1Var4);
                    y1a1Var4.z.a("Failed to send measurementEnabled to service");
                    return;
                }
                try {
                    zzgbVar.zzi((zzr) this.b);
                    j5b1Var.Tg();
                    return;
                } catch (RemoteException e4) {
                    y1a1 y1a1Var5 = gVar7.y;
                    com.google.android.gms.measurement.internal.g.g(y1a1Var5);
                    y1a1Var5.z.b(e4, "Failed to send measurementEnabled to the service");
                    return;
                }
        }
    }

    public String toString() {
        switch (this.a) {
            case 0:
                e100 e100Var = new e100(tqs.class.getSimpleName());
                hqs hqsVar = (hqs) this.c;
                ht10 ht10Var = new ht10();
                ((ht10) e100Var.w).c = ht10Var;
                e100Var.w = ht10Var;
                ht10Var.b = hqsVar;
                return e100Var.toString();
            default:
                return super.toString();
        }
    }

    public /* synthetic */ tqs(int i, Object obj, Object obj2, Object obj3) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    public /* synthetic */ tqs(ViewGroup viewGroup, Object obj, ViewGroup viewGroup2, int i) {
        this.a = i;
        this.b = obj;
        this.c = viewGroup2;
    }

    public /* synthetic */ tqs(Object obj, Object obj2, boolean z, int i) {
        this.a = i;
        this.c = obj;
        this.b = obj2;
    }

    public /* synthetic */ tqs(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }
}
