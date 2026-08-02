package defpackage;

import android.animation.ValueAnimator;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.view.animation.LinearInterpolator;
import com.yandex.go.inapp_calls.repository.defaultoutgoingcall.DefaultOutgoingCallTypeSettingsInteractorImpl$defaultOutgoingCallTypeUiStateFlow_delegate$lambda$0$$inlined$flatMapLatest$1;
import com.yandex.go.pickup_from_photo.navigation.c;
import com.yandex.messaging.domain.statuses.b;
import com.yandex.payment.divkit.select.n;
import com.yandex.plus.core.config.Environment;
import com.yandex.plus.core.debug.panel.internal.presentation.view.DebugPanelContainer;
import com.yandex.plus.home.feature.webviews.internal.error.DefaultHomeErrorView;
import com.ybsdk.feature.dashboard.internal.ui.dashboard3.d;
import java.net.URL;
import java.security.cert.X509Certificate;
import java.text.SimpleDateFormat;
import java.util.Collection;
import java.util.Iterator;
import kotlinx.coroutines.flow.e;
import ru.rt.ebs.cryptosdk.core.security.entities.exceptions.CertificateSecurityEbsException;
import ru.yandex.taxi.requirements.glued.ui.image.i;
import ru.yandex.taxi.search.router.a;

/* loaded from: classes2.dex */
public final /* synthetic */ class ybf implements sls {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ybf(ddf ddfVar, k4x0 k4x0Var) {
        this.a = 2;
        this.b = k4x0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v48, types: [nsg] */
    @Override // defpackage.sls
    public final Object invoke() {
        String str;
        zy11 backCallback$lambda$0;
        zy11 zy11Var;
        int i = this.a;
        boolean z = true;
        int i2 = 0;
        zy11 zy11Var2 = zy11.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                x4b0 A = ((k020) obj).A();
                if (A == null || (str = A.a) == null) {
                    return null;
                }
                String a = n8u.a(str);
                return a == null ? str : a;
            case 1:
                return g8e.o("com.yandex.messaging.calls.ACTION_ONLINE_REQUEST.meow.", (String) ((zbf) obj).e.getValue());
            case 2:
                try {
                    Iterator it = ((k4x0) obj).b.iterator();
                    while (it.hasNext()) {
                        ddf.j((X509Certificate) it.next());
                    }
                    return zy11Var2;
                } catch (Exception e) {
                    if (e instanceof CertificateSecurityEbsException) {
                        throw e;
                    }
                    throw new CertificateSecurityEbsException(e);
                }
            case 3:
                return (c) ((a) obj).J.get();
            case 4:
                return (com.yandex.go.mainscreen.superapp.impl.currentaddress.c) ((pw) obj).get();
            case 5:
                return bvf0.c(((b) obj).a.s());
            case 6:
                aia0 aia0Var = ((com.yandex.payment.divkit.sbp.a) obj).b.a.k;
                if (aia0Var != null) {
                    aia0Var.a();
                }
                return zy11Var2;
            case 7:
                return ((n) obj).c0;
            case 8:
                return new qu5(((kvf) obj).b);
            case 9:
                ddg ddgVar = (ddg) obj;
                float f = ddgVar.b;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(f, ddgVar.c, f);
                ofFloat.setDuration(3000L);
                ofFloat.setInterpolator(new LinearInterpolator());
                ofFloat.setRepeatCount(-1);
                return ofFloat;
            case 10:
                d.g0((d) obj);
                return zy11Var2;
            case 11:
                wog wogVar = (wog) obj;
                if (wogVar.b.b != Environment.TESTING) {
                    Object value = wogVar.g.h.getValue();
                    hj hjVar = value instanceof hj ? (hj) value : null;
                    if (!(hjVar != null ? hjVar.c : false)) {
                        z = false;
                    }
                }
                return Boolean.valueOf(z);
            case 12:
                psg psgVar = (psg) obj;
                int E = psgVar.E();
                if (E != -1) {
                    mjf mjfVar = (mjf) psgVar.T;
                    Integer valueOf = Integer.valueOf(E);
                    ?? r6 = (nsg) psgVar.W;
                    mjfVar.invoke(valueOf, r6 != 0 ? r6 : null);
                }
                return zy11Var2;
            case 13:
                return "order ids: ".concat(kotlin.collections.a.X((Collection) obj, null, null, null, null, 63));
            case 14:
                return Boolean.valueOf(((otg) obj).f);
            case 15:
                backCallback$lambda$0 = DebugPanelContainer.backCallback$lambda$0((DebugPanelContainer) obj);
                return backCallback$lambda$0;
            case 16:
                return new SimpleDateFormat("dd-MM-yy_HH:mm:ss", ((com.yandex.plus.home.feature.webviews.internalapi.factory.a) ((el11) obj).b).a.q.getLocale());
            case 17:
                return g8e.o("invalid deeplink, communication id: ", ((kpf0) obj).a.a);
            case 18:
                v920 v920Var = (v920) obj;
                return v920Var.l(new Uri.Builder().scheme((String) v920Var.a).authority("plus-home-sdk").path("home").build(), cmm0.b(), false, null);
            case 19:
                ((f3h) obj).a.getClass();
                return zy11Var2;
            case 20:
                i3h i3hVar = (i3h) obj;
                return new com.yandex.go.places.common.flex.actions.deeplink.a(i3hVar.a, i3hVar.b, i3hVar.c, i3hVar.d, i3hVar.e);
            case 21:
                ((i) obj).q.invoke();
                return zy11Var2;
            case 22:
                ((ryj0) ((sae) obj).b).onSuccess(tm0.a);
                return zy11Var2;
            case 23:
                return new sy4(((u8h) obj).a, new ny4());
            case 24:
                final Looper looper = (Looper) obj;
                return new Handler(looper) { // from class: com.yandex.plus.home.common.utils.DefaultDebouncer$handler$2$1
                    @Override // android.os.Handler
                    public void handleMessage(Message msg) {
                        try {
                            if (msg.what == 1) {
                                Object obj2 = msg.obj;
                                Runnable runnable = obj2 instanceof Runnable ? (Runnable) obj2 : null;
                                if (runnable != null) {
                                    runnable.run();
                                }
                            }
                            try {
                                msg.recycle();
                            } catch (IllegalStateException unused) {
                                removeMessages(msg.what);
                            }
                        } catch (Throwable th) {
                            try {
                                msg.recycle();
                            } catch (IllegalStateException unused2) {
                                removeMessages(msg.what);
                            }
                            throw th;
                        }
                    }
                };
            case 25:
                return ((d0m) ((w9h) obj).a.getValue()).a(new c0m(i2));
            case 26:
                return ((ar7) ((apf) obj).b).r(34);
            case 27:
                zy11Var = DefaultHomeErrorView.setupRetryButton$lambda$0((DefaultHomeErrorView) obj);
                return zy11Var;
            case 28:
                return (URL) obj;
            default:
                pgh pghVar = (pgh) obj;
                return e.X(e.t(new com.yandex.go.inapp_calls.repository.defaultoutgoingcall.b(ru.yandex.taxi.experiments.d.b(pghVar.b.d), pghVar)), new DefaultOutgoingCallTypeSettingsInteractorImpl$defaultOutgoingCallTypeUiStateFlow_delegate$lambda$0$$inlined$flatMapLatest$1(null, pghVar));
        }
    }

    public /* synthetic */ ybf(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }
}
