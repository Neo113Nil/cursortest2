package androidx.core.app;

import android.app.Activity;
import android.app.Application;
import android.content.BroadcastReceiver;
import android.graphics.Rect;
import android.os.Build;
import android.os.Handler;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.widget.FrameLayout;
import com.appsflyer.AFLogger;
import com.google.android.gms.common.api.Scope;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.yandex.passport.internal.core.announcing.PackageRemovedReceiver;
import com.yandex.passport.internal.social.GoogleNativeSocialAuthActivity;
import com.yandex.passport.internal.ui.browser.SocialBrowserActivity;
import com.yandex.passport.internal.widget.TemporaryErrorView;
import com.yandex.plus.bdui.plus.checkout.content.serializer.dto.r1;
import defpackage.c7g;
import defpackage.qpj;
import defpackage.xe3;
import defpackage.ze3;
import io.appmetrica.analytics.impl.C0215e;
import io.appmetrica.analytics.locationinternal.impl.v2;
import java.lang.reflect.Method;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import ru.kinopoisk.sdk.easylogin.internal.C1159o2;
import ru.yandex.music.R;

/* loaded from: classes.dex */
public final /* synthetic */ class a implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ a(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v4, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v6 */
    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        d dVar;
        Application application;
        BottomSheetBehavior from;
        qpj onBackPressedDispatcher;
        qpj onBackPressedDispatcher2;
        int i = this.a;
        int i2 = 0;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                Activity activity = (Activity) obj2;
                if (activity.isFinishing()) {
                    return;
                }
                Handler handler = e.g;
                Method method = e.f;
                int i3 = Build.VERSION.SDK_INT;
                if (i3 >= 28) {
                    activity.recreate();
                    return;
                }
                ?? r6 = 27;
                ?? r7 = 26;
                if (((i3 != 26 && i3 != 27) || method != null) && (e.e != null || e.d != null)) {
                    try {
                        Object obj3 = e.c.get(activity);
                        if (obj3 != null && (obj = e.b.get(activity)) != null) {
                            Application application2 = activity.getApplication();
                            d dVar2 = new d(activity);
                            application2.registerActivityLifecycleCallbacks(dVar2);
                            handler.post(new c(0, dVar2, obj3));
                            int i4 = (i3 == 26 || i3 == 27) ? 1 : 0;
                            try {
                                if (i4 != 0) {
                                    i4 = 1;
                                    try {
                                        Boolean bool = Boolean.FALSE;
                                        r6 = application2;
                                        r7 = dVar2;
                                        method.invoke(obj, obj3, null, null, 0, bool, null, null, bool, bool);
                                    } catch (Throwable th) {
                                        th = th;
                                        application = application2;
                                        dVar = dVar2;
                                        handler.post(new c(application, dVar, false, i4));
                                        throw th;
                                    }
                                } else {
                                    r6 = application2;
                                    r7 = dVar2;
                                    i4 = 1;
                                    activity.recreate();
                                }
                                handler.post(new c(r6, r7, false, i4));
                                return;
                            } catch (Throwable th2) {
                                th = th2;
                                application = r6;
                                dVar = r7;
                            }
                        }
                    } catch (Throwable unused) {
                    }
                }
                activity.recreate();
                return;
            case 1:
                AFLogger.getCurrencyIso4217Code((Function1) obj2);
                return;
            case 2:
                throw ((IllegalStateException) obj2);
            case 3:
                BroadcastReceiver.PendingResult pendingResult = (BroadcastReceiver.PendingResult) obj2;
                int i5 = PackageRemovedReceiver.a;
                try {
                    try {
                        com.yandex.passport.internal.di.a.a().getAccountsBackuper().d("android.intent.action.PACKAGE_FULLY_REMOVED");
                        com.yandex.passport.internal.di.a.a().getAccountTracker().a();
                    } catch (Exception e) {
                        com.yandex.passport.legacy.a.d(e);
                    }
                    return;
                } finally {
                    pendingResult.finish();
                }
            case 4:
                Scope scope = GoogleNativeSocialAuthActivity.k;
                ((GoogleNativeSocialAuthActivity) obj2).j();
                return;
            case 5:
                com.yandex.passport.internal.ui.authsdk.k kVar = (com.yandex.passport.internal.ui.authsdk.k) obj2;
                while (true) {
                    kVar.q.m(new com.yandex.passport.internal.ui.authsdk.j(i2, kVar.v.D()));
                    com.yandex.passport.internal.ui.authsdk.p a = kVar.v.a(kVar);
                    if (a == null) {
                        return;
                    } else {
                        kVar.v = a;
                    }
                }
            case 6:
                com.yandex.passport.internal.ui.base.b bVar = (com.yandex.passport.internal.ui.base.b) obj2;
                ze3 ze3Var = (ze3) bVar.getDialog();
                if (ze3Var == null) {
                    from = null;
                } else {
                    FrameLayout frameLayout = (FrameLayout) ze3Var.findViewById(R.id.design_bottom_sheet);
                    frameLayout.getClass();
                    from = BottomSheetBehavior.from(frameLayout);
                }
                if (from == null) {
                    return;
                }
                from.setState(3);
                from.setBottomSheetCallback(new xe3(7, bVar));
                return;
            case 7:
                ((c7g) obj2).setVisibility(0);
                return;
            case 8:
                SocialBrowserActivity socialBrowserActivity = (SocialBrowserActivity) obj2;
                com.yandex.passport.internal.analytics.q0 q0Var = socialBrowserActivity.a;
                q0Var.getClass();
                q0Var.a(com.yandex.passport.internal.analytics.t.j, new Pair("task_id", String.valueOf(socialBrowserActivity.getTaskId())));
                socialBrowserActivity.setResult(0);
                socialBrowserActivity.finish();
                return;
            case 9:
                com.yandex.passport.internal.ui.domik.base.a aVar = (com.yandex.passport.internal.ui.domik.base.a) obj2;
                aVar.n.smoothScrollTo(0, aVar.k.getBottom());
                return;
            case 10:
                androidx.fragment.app.t l = ((com.yandex.passport.internal.ui.social.j) obj2).l();
                if (l == null || (onBackPressedDispatcher = l.getOnBackPressedDispatcher()) == null) {
                    return;
                }
                onBackPressedDispatcher.d();
                return;
            case 11:
                String str = com.yandex.passport.internal.ui.social.o.k;
                androidx.fragment.app.t l2 = ((com.yandex.passport.internal.ui.social.o) obj2).l();
                if (l2 == null || (onBackPressedDispatcher2 = l2.getOnBackPressedDispatcher()) == null) {
                    return;
                }
                onBackPressedDispatcher2.d();
                return;
            case 12:
                int i6 = TemporaryErrorView.s;
                ((TemporaryErrorView) obj2).p();
                return;
            case 13:
                ((com.yandex.plus.home.feature.webviews.internal.overlap.e) obj2).a(com.yandex.plus.home.feature.webviews.internal.overlap.b.a);
                return;
            case 14:
                com.yandex.plus.home.feature.webviews.internal.purchase.pay.g gVar = (com.yandex.plus.home.feature.webviews.internal.purchase.pay.g) obj2;
                gVar.a.setAlpha(0.0f);
                View view = gVar.a;
                view.setVisibility(0);
                view.setY(view.getY() + 100.0f);
                view.animate().setStartDelay(500L).alpha(1.0f).translationY(0.0f).setDuration(500L).start();
                return;
            case 15:
                com.yandex.plus.home.feature.webviews.internal.stories.p.w((com.yandex.plus.home.feature.webviews.internal.stories.p) obj2);
                return;
            case 16:
                com.yandex.plus.pay.ui.core.internal.tarifficator.ui.checkout.j jVar = (com.yandex.plus.pay.ui.core.internal.tarifficator.ui.checkout.j) obj2;
                ViewParent parent = jVar.b().getParent();
                parent.getClass();
                Rect rect = new Rect();
                int k = r1.k(R.dimen.pay_sdk_checkout_agreements_checkbox_extra_area_size, jVar.a);
                jVar.b().getHitRect(rect);
                rect.left -= k;
                rect.top -= k;
                rect.right += k;
                rect.bottom += k;
                ((ViewGroup) parent).setTouchDelegate(new TouchDelegate(rect, jVar.b()));
                return;
            case 17:
                ((C0215e) obj2).a();
                return;
            case 18:
                C1159o2.a((Window) obj2);
                return;
            default:
                v2.a((v2) obj2);
                return;
        }
    }
}
