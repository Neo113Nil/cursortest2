package defpackage;

import android.view.View;
import androidx.camera.core.ProcessingException;
import androidx.camera.core.processing.concurrent.DualSurfaceProcessor;
import androidx.compose.ui.platform.ComposeView;
import com.yandex.go.promocodes.base.impl.discounts.domain.analytics.ErrorType;
import com.yandex.go.promocodes.base.impl.discounts.domain.analytics.PromoState;
import com.yandex.go.zone.model.Zone;
import com.yandex.messaging.ChatRequest;
import com.yandex.messaging.internal.g;
import com.yandex.payment.sdk.core.data.PaymentKitError;
import com.yandex.payment.sdk.core.data.PaymentPollingResult;
import com.ybsdk.core.analytics.generated.AppAnalyticsReporter;
import com.ybsdk.core.analytics.generated.delegates.DeeplinkEvents$DeeplinkOpenHandler;
import com.ybsdk.feature.deeplink.api.BaseDeeplinkAction;
import com.ybsdk.feature.deeplink.api.Deeplink;
import com.ybsdk.screens.initial.deeplink.DeeplinkAction;
import java.lang.reflect.Constructor;
import java.lang.reflect.Type;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.collections.EmptyList;
import kotlin.collections.a;
import kotlinx.coroutines.flow.r0;
import org.json.JSONException;
import org.json.JSONObject;
import ru.yandex.taxi.contacts.SelectedFrom;
import ru.yandex.taxi.delivery.extracted_form_common_data.extra.DeliverySelectedFrom;
import ru.yandex.taxi.design.utils.c;
import ru.yandex.taxi.logistics.explicit_comment_courier.requirement.common.DeliveryCommentRequirementType;
import ru.yandex.taxi.logistics.explicit_comment_courier.requirement.courier.DeliveryExplicitCommentCourierRequirementView;
import ru.yandex.taxi.requirements.models.net.RequirementsParam;
import ru.yandex.taxi.tariffs.model.TariffOrderFlow;

/* loaded from: classes5.dex */
public final class xjg implements ag7, ryj0, j190, rdq0, wni, ggi0, xog, d4x, ifm, iqs {
    public final /* synthetic */ int a;
    public Object b;
    public final Object c;

    /* JADX WARN: Removed duplicated region for block: B:33:0x007e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x007f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public xjg(JSONObject jSONObject, int i) {
        x3k x3kVar;
        String j;
        JSONObject optJSONObject;
        this.a = i;
        Integer num = null;
        switch (i) {
            case 23:
                quz quzVar = quz.c;
                try {
                    optJSONObject = jSONObject.optJSONObject("action");
                } catch (JSONException e) {
                    quzVar.e(e);
                }
                if (optJSONObject != null) {
                    x3kVar = new x3k(optJSONObject, quzVar);
                    this.b = x3kVar;
                    j = b4x.j("text", jSONObject);
                    this.c = j;
                    if (j.length() < 1) {
                        return;
                    }
                    z3k.c("text does not meet condition text.length() >= 1");
                    throw null;
                }
                x3kVar = null;
                this.b = x3kVar;
                j = b4x.j("text", jSONObject);
                this.c = j;
                if (j.length() < 1) {
                }
            default:
                try {
                    num = b4x.c("color", jSONObject);
                } catch (JSONException e2) {
                    if (ydz.a.a()) {
                        ydz.c("ParsingErrorLogger", "An error occurred during parsing process", e2);
                    }
                }
                this.b = num;
                String j2 = b4x.j("style", jSONObject);
                if ("border".equals(j2)) {
                    this.c = "border";
                    return;
                } else if ("shadow".equals(j2)) {
                    this.c = "shadow";
                    return;
                } else {
                    if (!"only_round_corners".equals(j2)) {
                        throw new JSONException(j2.concat(" is not a valid value of style"));
                    }
                    this.c = "only_round_corners";
                    return;
                }
        }
    }

    @Override // defpackage.rdq0
    public void B0() {
    }

    @Override // defpackage.rdq0
    public void I(bgq0 bgq0Var) {
        ((tls) this.b).invoke(bgq0Var);
        SelectedFrom selectedFrom = bgq0Var.c;
        if (selectedFrom == SelectedFrom.MANUAL || selectedFrom == SelectedFrom.CONTACTS) {
            uci uciVar = ((iai) this.c).a;
            r0i e = e991.e(bgq0Var);
            uciVar.a.f.add(new r0i(e.a, e.b, DeliverySelectedFrom.LAST_CONTACTS));
        }
    }

    public void a(String str, TariffOrderFlow tariffOrderFlow) {
        Object value;
        List f;
        int i;
        w8i w8iVar = (w8i) ((xvf0) ((wwf) this.c).b).get();
        boolean z = false;
        boolean z2 = tariffOrderFlow == TariffOrderFlow.DELIVERY_FLOW;
        w8iVar.getClass();
        if (d9i.a[DeliveryCommentRequirementType.COURIER.ordinal()] != 1) {
            w511.b();
            return;
        }
        mi31 d = b8r.d(w8iVar.A, str == null ? "" : str, null, 6);
        pex0 pex0Var = d != null ? d.a : null;
        if (pex0Var != null && (f = pex0Var.f()) != null) {
            List<lmw0> list = f;
            if ((list instanceof Collection) && list.isEmpty()) {
                i = 0;
            } else {
                i = 0;
                for (lmw0 lmw0Var : list) {
                    if (!w8iVar.B.a(lmw0Var, str == null ? "" : str)) {
                        w8iVar.C.getClass();
                        if (!lmw0Var.f() && (i = i + 1) < 0) {
                            scc.l();
                            throw null;
                        }
                    }
                }
            }
            if (i == 0) {
                z = true;
            }
        }
        boolean z3 = !z;
        r0 r0Var = w8iVar.D;
        do {
            value = r0Var.getValue();
            ((oex0) value).getClass();
        } while (!r0Var.k(value, new oex0(str, z2, z3)));
    }

    public void b(String str, String str2) {
        HashMap hashMap = (HashMap) this.c;
        if (hashMap.containsKey(str)) {
            Iterator it = ((List) hashMap.get(str)).iterator();
            while (it.hasNext()) {
                ((da20) it.next()).error("DeferredComponent Install failure", str2, null);
            }
            ((List) hashMap.get(str)).clear();
        }
    }

    public b5p c(Object... objArr) {
        Constructor a;
        synchronized (((AtomicBoolean) this.c)) {
            if (!((AtomicBoolean) this.c).get()) {
                try {
                    a = ((x8e) this.b).a();
                } catch (ClassNotFoundException unused) {
                    ((AtomicBoolean) this.c).set(true);
                } catch (Exception e) {
                    throw new RuntimeException("Error instantiating extension", e);
                }
            }
            a = null;
        }
        if (a == null) {
            return null;
        }
        try {
            return (b5p) a.newInstance(objArr);
        } catch (Exception e2) {
            ny61.h("Unexpected error creating extractor", e2);
            return null;
        }
    }

    public List d(b580 b580Var) {
        Zone c = ((dqe0) this.b).c();
        if (c == null) {
            return EmptyList.a;
        }
        bte0 bte0Var = (bte0) this.c;
        List list = ((dqe0) this.b).a.x;
        if (b580Var != null) {
            list = a.o0(list, b580Var);
        }
        LinkedHashMap c2 = bte0Var.c(c, list);
        ArrayList arrayList = new ArrayList(c2.size());
        for (Map.Entry entry : c2.entrySet()) {
            String str = (String) entry.getKey();
            List list2 = (List) entry.getValue();
            RequirementsParam.Companion.getClass();
            arrayList.add(new kmx0(str, rpj0.a(null, list2)));
        }
        return arrayList;
    }

    public void e(String str) {
        fxj fxjVar;
        synchronized (this) {
            try {
                Object obj = ((HashMap) this.b).get(str);
                z2a1.e(obj, "Argument must not be null");
                fxjVar = (fxj) obj;
                int i = fxjVar.b;
                if (i < 1) {
                    throw new IllegalStateException("Cannot release a lock that is not held, safeKey: " + str + ", interestedThreads: " + fxjVar.b);
                }
                int i2 = i - 1;
                fxjVar.b = i2;
                if (i2 == 0) {
                    fxj fxjVar2 = (fxj) ((HashMap) this.b).remove(str);
                    if (!fxjVar2.equals(fxjVar)) {
                        throw new IllegalStateException("Removed the wrong lock, expected to remove: " + fxjVar + ", but actually removed: " + fxjVar2 + ", safeKey: " + str);
                    }
                    qnh qnhVar = (qnh) this.c;
                    synchronized (((ArrayDeque) qnhVar.a)) {
                        try {
                            if (((ArrayDeque) qnhVar.a).size() < 10) {
                                ((ArrayDeque) qnhVar.a).offer(fxjVar2);
                            }
                        } finally {
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        fxjVar.a.unlock();
    }

    @Override // defpackage.ggi0
    public void f(fi6 fi6Var, List list) {
        int a = ((cr00) this.c).a();
        ((nz2) this.b).a(fi6Var);
        nz2.c(fi6Var, a);
    }

    @Override // defpackage.xog
    public e1k g(h3t0 h3t0Var, zog zogVar) {
        g gVar = ((azj) this.c).b;
        ChatRequest chatRequest = (ChatRequest) this.b;
        k9b k9bVar = new k9b(3, zogVar);
        gVar.getClass();
        return gVar.c(new v4t(chatRequest, h3t0Var), k9bVar);
    }

    public void h(String str, String str2, PromoState promoState, ErrorType errorType) {
        ((o61) this.c).d(str, str2, promoState != null ? promoState.getValue() : null, errorType != null ? errorType.getValue() : null);
    }

    @Override // defpackage.ryj0
    public void i(Object obj) {
        px90.h((px90) this.c, null);
        ((ryj0) this.b).i((PaymentKitError) obj);
    }

    public void j(Deeplink deeplink, DeeplinkEvents$DeeplinkOpenHandler deeplinkEvents$DeeplinkOpenHandler) {
        String uri = deeplink.getParsedUri().buildUpon().clearQuery().build().toString();
        Map d = sd90.d(deeplink.getParsedUri());
        m501 m501Var = (m501) this.c;
        BaseDeeplinkAction action = deeplink.getAction();
        m501Var.getClass();
        if (action instanceof DeeplinkAction.SendAnalytics) {
            return;
        }
        z94 z94Var = ((AppAnalyticsReporter) this.b).t;
        LinkedHashMap t = x4e.t(4, "url", uri, "source", deeplink.getSource().name());
        t.put("params", d);
        if (deeplinkEvents$DeeplinkOpenHandler != null) {
            t.put("handler", deeplinkEvents$DeeplinkOpenHandler.getOriginalValue());
        }
        z94Var.a.a("deeplink.open", t);
    }

    public void k(String str, Map map) {
        LinkedHashMap linkedHashMap = map != null ? new LinkedHashMap(map) : new LinkedHashMap();
        linkedHashMap.put("lib_version", "378.0.7");
        ((pfm) this.c).g(str, linkedHashMap);
    }

    public void l() {
        this.b = null;
    }

    @Override // defpackage.wni
    public ComposeView m(uni uniVar, vni vniVar) {
        ComposeView composeView = new ComposeView(((y30) this.b).a(), null, 0, 6, null);
        composeView.setContent(new androidx.compose.runtime.internal.a(1705379748, new mjf(13, this, composeView), true));
        return composeView;
    }

    @Override // defpackage.ag7
    public Type n() {
        return (Type) this.b;
    }

    @Override // defpackage.iqs
    public void onFailure(Throwable th) {
        int i = ((enw0) this.b).f;
        if (i == 2 && (th instanceof CancellationException)) {
            sgb1.g(3, "DualSurfaceProcessorNode");
        } else {
            nkb1.a(i);
            sgb1.g(5, "DualSurfaceProcessorNode");
        }
    }

    @Override // defpackage.j190
    public void onHide() {
        ((gjh) this.b).y.evictOverlay((String) this.c);
    }

    @Override // defpackage.j190
    public void onShow() {
    }

    @Override // defpackage.ryj0
    public void onSuccess(Object obj) {
        int i = this.a;
        Object obj2 = this.c;
        switch (i) {
            case 5:
                px90.h((px90) obj2, null);
                ((ryj0) this.b).onSuccess(new nm0((PaymentPollingResult) obj));
                break;
            default:
                qnw0 qnw0Var = (qnw0) obj;
                qnw0Var.getClass();
                try {
                    ((DualSurfaceProcessor) ((q4g) obj2).b).onOutputSurface(qnw0Var);
                    break;
                } catch (ProcessingException e) {
                    sgb1.e("DualSurfaceProcessorNode", "Failed to send SurfaceOutput to SurfaceProcessor.", e);
                }
        }
    }

    @Override // defpackage.ag7
    public Object r(yv60 yv60Var) {
        Executor executor = (Executor) this.c;
        return executor == null ? yv60Var : new q7h(executor, yv60Var);
    }

    public String toString() {
        int i = this.a;
        Object obj = this.c;
        switch (i) {
            case 22:
                tjz0 tjz0Var = new tjz0();
                tjz0Var.a((Integer) this.b, "color");
                tjz0Var.a((String) obj, "style");
                return tjz0Var.a.toString();
            case 23:
                tjz0 tjz0Var2 = new tjz0();
                tjz0Var2.a((x3k) this.b, "action");
                tjz0Var2.a((String) obj, "text");
                return tjz0Var2.a.toString();
            default:
                return super.toString();
        }
    }

    public /* synthetic */ xjg(Object obj, Object obj2, boolean z, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    public xjg(c9i c9iVar, View view) {
        this.a = 12;
        this.b = c9iVar;
        c9iVar.getClass();
        wwf wwfVar = new wwf();
        wwfVar.a = new myf(c9iVar, 1);
        int i = 5;
        xvf0 b = i5m.b(new epf(new fwc(new myf(c9iVar, 2), new myf(c9iVar, 3), 10), new myf(c9iVar, 7), new rwh(new myf(c9iVar, 0), i), new myf(c9iVar, 6), new myf(c9iVar, i), x15.a, new myf(c9iVar, 4)));
        wwfVar.b = b;
        xvf0 b2 = i5m.b(new fwc((myf) wwfVar.a, b, 9));
        wwfVar.c = b2;
        this.c = wwfVar;
        if (view != null) {
            c.w(view, (DeliveryExplicitCommentCourierRequirementView) b2.get());
        }
    }

    public xjg() {
        this.a = 20;
        this.b = new HashMap();
        this.c = new qnh(21);
    }

    public /* synthetic */ xjg(int i, Object obj, Object obj2) {
        this.a = i;
        this.c = obj;
        this.b = obj2;
    }

    public xjg(ufg ufgVar) {
        this.a = 8;
        new ea20(ufgVar, "flutter/deferredcomponent", wzt0.b, null).b(new zch(this));
        this.b = jsr.d().b;
        this.c = new HashMap();
    }

    public xjg(mnh mnhVar) {
        this.a = 7;
        this.c = mnhVar;
    }

    public xjg(x8e x8eVar) {
        this.a = 4;
        this.b = x8eVar;
        this.c = new AtomicBoolean(false);
    }
}
