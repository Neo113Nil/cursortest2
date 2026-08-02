package defpackage;

import android.graphics.Bitmap;
import android.net.Uri;
import androidx.camera.video.g;
import androidx.camera.video.internal.encoder.j;
import androidx.camera.video.k;
import coil.memory.MemoryCache$Key;
import com.yandex.fintechsdk.entities.environment.PayEnvironment;
import com.yandex.go.address.models.Address;
import com.yandex.go.feedback_common.data.model.QuestionInfo;
import com.yandex.go.taxi.order.details.v2.ui.view.recycler.adapter.holder.a0;
import com.yandex.go.taxi.order.details.v2.ui.view.recycler.adapter.holder.n;
import com.yandex.messaging.core.net.entities.Bucket;
import com.yandex.messaging.core.net.entities.RestrictionsBucket;
import com.yandex.plus.home.plaque.plugin.api.typeface.PlusPlaqueFontStyle;
import com.yandex.plus.home.plaque.plugin.api.typeface.PlusPlaqueFontWeight;
import com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.TarifficatorScenarioActivity;
import com.ybsdk.core.analytics.generated.AppAnalyticsReporter;
import com.ybsdk.core.analytics.generated.delegates.QrPaymentEvents$QrPaymentCheckLoadedResult;
import com.ybsdk.core.analytics.generated.delegates.QrPaymentEvents$QrPaymentCheckLoadedState;
import com.ybsdk.core.analytics.generated.delegates.QrPaymentEvents$QrPaymentInfoLoadedQrcType;
import com.ybsdk.core.analytics.generated.delegates.QrPaymentEvents$QrPaymentInfoLoadedResult;
import com.ybsdk.core.analytics.generated.delegates.QrPaymentEvents$QrPaymentInfoLoadedVersion;
import com.ybsdk.feature.qr.api.QrScannerPreviewDependencies;
import com.ybsdk.feature.qr.payments.api.data.BoostStrategy;
import com.ybsdk.feature.qr.payments.api.data.ProductType;
import com.ybsdk.rconfig.YbCommonUrlsImpl;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import kotlinx.coroutines.flow.r0;
import ru.CryptoPro.reprov.x509.CRLReasonCodeExtension;
import ru.yandex.common.clid.ClidProvider;

/* loaded from: classes13.dex */
public final class yxf0 implements QrScannerPreviewDependencies, izn, mvu0, iqs, gr51, eo3, wtq, jkz0, fdl0 {
    public Object a;
    public Object b;

    public yxf0(rys rysVar) {
        this.a = rysVar;
        ArrayList arrayList = new ArrayList();
        this.b = arrayList;
        arrayList.add(new sys(rysVar, new int[]{1}));
    }

    public static void r(yxf0 yxf0Var, a1v0 a1v0Var, v1a0 v1a0Var, int i) {
        a1v0 a1v0Var2 = (i & 1) != 0 ? null : a1v0Var;
        v1a0 v1a0Var2 = (i & 2) == 0 ? v1a0Var : null;
        AppAnalyticsReporter appAnalyticsReporter = (AppAnalyticsReporter) yxf0Var.a;
        if (v1a0Var2 != null) {
            rt1.z(appAnalyticsReporter.Y, null, QrPaymentEvents$QrPaymentInfoLoadedVersion.CREDLIM, QrPaymentEvents$QrPaymentInfoLoadedResult.OK, QrPaymentEvents$QrPaymentInfoLoadedQrcType.PAYMENT, null, (String) yxf0Var.b, v1a0Var2.h, 49);
        } else if (a1v0Var2 != null) {
            rt1.z(appAnalyticsReporter.Y, null, QrPaymentEvents$QrPaymentInfoLoadedVersion.CREDLIM, QrPaymentEvents$QrPaymentInfoLoadedResult.OK, QrPaymentEvents$QrPaymentInfoLoadedQrcType.SUBSCRIPTION, null, (String) yxf0Var.b, a1v0Var2.c, 49);
        }
    }

    public static String x(ProductType productType, BoostStrategy boostStrategy) {
        int i = productType == null ? -1 : r8g0.c[productType.ordinal()];
        if (i == -1) {
            return null;
        }
        if (i == 1) {
            return boostStrategy == BoostStrategy.BOOST ? b64.j(productType.name(), "_ULTRA") : productType.name();
        }
        if (i == 2 || i == 3 || i == 4) {
            return productType.name();
        }
        w511.b();
        return null;
    }

    @Override // defpackage.mvu0
    public void a(int i) {
        int i2;
        t5e t5eVar = (t5e) this.b;
        if (i >= 40) {
            t5eVar.h(-1);
            return;
        }
        if (10 > i || i >= 20) {
            return;
        }
        synchronized (t5eVar.c) {
            i2 = t5eVar.d;
        }
        t5eVar.h(i2 / 2);
    }

    @Override // defpackage.mvu0
    public ki10 b(MemoryCache$Key memoryCache$Key) {
        ldi0 ldi0Var = (ldi0) ((t5e) this.b).c(memoryCache$Key);
        if (ldi0Var != null) {
            return new ki10(ldi0Var.a, ldi0Var.b);
        }
        return null;
    }

    @Override // defpackage.mvu0
    public void c(MemoryCache$Key memoryCache$Key, Bitmap bitmap, Map map) {
        int i;
        int c = mga1.c(bitmap);
        t5e t5eVar = (t5e) this.b;
        synchronized (t5eVar.c) {
            i = t5eVar.a;
        }
        t5e t5eVar2 = (t5e) this.b;
        if (c <= i) {
            t5eVar2.d(memoryCache$Key, new ldi0(bitmap, map, c));
        } else {
            t5eVar2.e(memoryCache$Key);
            ((w941) this.a).c(memoryCache$Key, bitmap, map, c);
        }
    }

    @Override // defpackage.eo3
    public void d() {
        ((sxj0) this.b).d = wfz.z;
    }

    @Override // defpackage.wtq
    public void e(QuestionInfo questionInfo) {
        String str = questionInfo.a;
        String str2 = questionInfo.b;
        q9k0 q9k0Var = new q9k0(str, str2);
        p9y0 p9y0Var = ((n) this.a).S;
        akk0 akk0Var = ((tik0) this.b).d;
        akk0Var.c.put("question_id", str);
        akk0Var.c.put("answer_id", str2);
        p9y0Var.a(q9k0Var, akk0Var);
    }

    public void f(int i, int[] iArr) {
        rys rysVar = (rys) this.a;
        if (i == 0) {
            ny61.g("No error correction bytes");
            return;
        }
        int length = iArr.length - i;
        if (length <= 0) {
            ny61.g("No data bytes provided");
            return;
        }
        ArrayList arrayList = (ArrayList) this.b;
        if (i >= arrayList.size()) {
            sys sysVar = (sys) unr0.k(1, arrayList);
            for (int size = arrayList.size(); size <= i; size++) {
                sysVar = sysVar.g(new sys(rysVar, new int[]{1, rysVar.a[(size - 1) + rysVar.g]}));
                arrayList.add(sysVar);
            }
        }
        sys sysVar2 = (sys) arrayList.get(i);
        int[] iArr2 = new int[length];
        System.arraycopy(iArr, 0, iArr2, 0, length);
        if (length == 0) {
            w511.q();
            return;
        }
        if (length > 1 && iArr2[0] == 0) {
            int i2 = 1;
            while (i2 < length && iArr2[i2] == 0) {
                i2++;
            }
            if (i2 == length) {
                iArr2 = new int[]{0};
            } else {
                int i3 = length - i2;
                int[] iArr3 = new int[i3];
                System.arraycopy(iArr2, i2, iArr3, 0, i3);
                iArr2 = iArr3;
            }
        }
        if (i < 0) {
            w511.q();
            return;
        }
        int length2 = iArr2.length;
        int[] iArr4 = new int[length2 + i];
        for (int i4 = 0; i4 < length2; i4++) {
            iArr4[i4] = rysVar.c(iArr2[i4], 1);
        }
        sys sysVar3 = new sys(rysVar, iArr4);
        if (!rysVar.equals(sysVar2.a)) {
            ny61.g("GenericGFPolys do not have same GenericGF field");
            return;
        }
        if (sysVar2.e()) {
            ny61.g("Divide by 0");
            return;
        }
        sys sysVar4 = rysVar.c;
        int b = rysVar.b(sysVar2.c(sysVar2.d()));
        while (sysVar3.d() >= sysVar2.d() && !sysVar3.e()) {
            int d = sysVar3.d() - sysVar2.d();
            int c = rysVar.c(sysVar3.c(sysVar3.d()), b);
            sys h = sysVar2.h(d, c);
            sysVar4 = sysVar4.a(rysVar.a(d, c));
            sysVar3 = sysVar3.a(h);
        }
        int[] iArr5 = new sys[]{sysVar4, sysVar3}[1].b;
        int length3 = i - iArr5.length;
        for (int i5 = 0; i5 < length3; i5++) {
            iArr[length + i5] = 0;
        }
        System.arraycopy(iArr5, 0, iArr, length + length3, iArr5.length);
    }

    public PlusPlaqueFontStyle g() {
        return (PlusPlaqueFontStyle) this.b;
    }

    @Override // defpackage.gr51
    public String getTaxServiceUrl() {
        String taxServiceUrl = ((YbCommonUrlsImpl) this.a).getTaxServiceUrl();
        return taxServiceUrl.length() == 0 ? ((YbCommonUrlsImpl) this.b).getTaxServiceUrl() : taxServiceUrl;
    }

    public PlusPlaqueFontWeight h() {
        return (PlusPlaqueFontWeight) this.a;
    }

    public mzn i(int i) {
        HashMap hashMap = (HashMap) this.b;
        return (hashMap == null || !hashMap.containsKey(Integer.valueOf(i))) ? ((izn) this.a).o(i) : (mzn) hashMap.get(Integer.valueOf(i));
    }

    @Override // defpackage.eo3
    public void j(Bucket bucket) {
        ((sxj0) this.b).b((RestrictionsBucket) bucket);
    }

    @Override // defpackage.eo3
    public void k() {
        ((sxj0) this.b).a(1, (String) this.a);
    }

    public Uri l() {
        String str;
        int i = h0k0.a[((PayEnvironment) this.a).ordinal()];
        if (i == 1) {
            str = "test.pay.yandex.ru";
        } else if (i == 2) {
            str = "sandbox.pay.yandex.ru";
        } else {
            if (i != 3) {
                w511.b();
                return null;
            }
            str = "pay.yandex.ru";
        }
        return Uri.parse(String.format("https://%s.merchant.applink.%s/payment-result", Arrays.copyOf(new Object[]{"com.yandex.fintechsdk.redirect.client.id", str}, 2)));
    }

    @Override // defpackage.jkz0
    public void m(pkz0 pkz0Var) {
        ((a0) this.a).S.a(((fpk0) pkz0Var).e, (wrs0) this.b);
    }

    public void n(ifl0 ifl0Var) {
        if (ifl0Var instanceof hfl0) {
            re50 re50Var = (re50) this.a;
            re50Var.b.l(((hfl0) ifl0Var).a);
        } else {
            if (!(ifl0Var instanceof gfl0)) {
                w511.b();
                return;
            }
            o8g0 o8g0Var = ((gfl0) ifl0Var).a;
            c8l0 c8l0Var = (c8l0) o8g0Var.a;
            Address address = (Address) o8g0Var.b;
            if (c8l0Var.equals(a8l0.a)) {
                p(address);
            } else if (c8l0Var instanceof b8l0) {
                q(((b8l0) ((c8l0) o8g0Var.a)).a, address);
            } else {
                w511.b();
            }
        }
    }

    @Override // defpackage.izn
    public mzn o(int i) {
        return i(i);
    }

    @Override // defpackage.iqs
    public void onFailure(Throwable th) {
        sgb1.g(3, "Recorder");
    }

    @Override // defpackage.iqs
    public void onSuccess(Object obj) {
        j jVar;
        j jVar2 = (j) obj;
        g gVar = (g) this.b;
        Objects.toString(jVar2);
        sgb1.g(3, "Recorder");
        if (jVar2 == null) {
            return;
        }
        ScheduledFuture scheduledFuture = gVar.c0;
        if (scheduledFuture != null && scheduledFuture.cancel(false) && (jVar = gVar.G) != null && jVar == jVar2) {
            g.r(jVar);
        }
        gVar.g0 = (k) this.a;
        gVar.B(null);
        gVar.v(gVar.o());
    }

    public void p(Address address) {
        ((re50) this.a).b(new oe50(address));
        ((lg50) this.b).e = true;
    }

    public void q(whu0 whu0Var, Address address) {
        Object value;
        pe50 pe50Var;
        re50 re50Var = (re50) this.a;
        if (!(whu0Var instanceof vhu0)) {
            if (!(whu0Var instanceof uhu0)) {
                w511.b();
                return;
            }
            ne50 ne50Var = new ne50(address);
            xgu0 xgu0Var = ((uhu0) whu0Var).a;
            re50Var.a(ne50Var, xgu0Var != null ? Integer.valueOf(v(xgu0Var)) : null);
            return;
        }
        int v = v(((vhu0) whu0Var).a);
        ne50 ne50Var2 = new ne50(address);
        r0 r0Var = re50Var.b;
        do {
            value = r0Var.getValue();
            pe50 pe50Var2 = (pe50) value;
            if (pe50Var2 != null) {
                List list = pe50Var2.b;
                ArrayList arrayList = new ArrayList(list);
                if (scc.f(list) < v || v < 0) {
                    pe50Var = pe50Var2.b(ne50Var2, null);
                } else {
                    arrayList.set(v, ne50Var2);
                    pe50Var = pe50.a(pe50Var2, null, arrayList, 1);
                }
            } else {
                pe50Var = null;
            }
        } while (!r0Var.k(value, pe50Var));
    }

    @Override // defpackage.izn
    public boolean s(int i) {
        return i(i) != null;
    }

    public void t(QrPaymentEvents$QrPaymentCheckLoadedState qrPaymentEvents$QrPaymentCheckLoadedState, String str, ProductType productType, BoostStrategy boostStrategy, QrPaymentEvents$QrPaymentCheckLoadedResult qrPaymentEvents$QrPaymentCheckLoadedResult) {
        rt1 rt1Var = ((AppAnalyticsReporter) this.a).Y;
        String x = x(productType, boostStrategy);
        LinkedHashMap linkedHashMap = new LinkedHashMap(4);
        linkedHashMap.put(ClidProvider.STATE, qrPaymentEvents$QrPaymentCheckLoadedState.getOriginalValue());
        if (str != null) {
            linkedHashMap.put(CRLReasonCodeExtension.REASON, str);
        }
        if (x != null) {
            linkedHashMap.put("product_type", x);
        }
        if (qrPaymentEvents$QrPaymentCheckLoadedResult != null) {
            linkedHashMap.put(TarifficatorScenarioActivity.RESULT_KEY, qrPaymentEvents$QrPaymentCheckLoadedResult.getOriginalValue());
        }
        rt1Var.a.a("qr.payment.check.loaded", linkedHashMap);
    }

    public b3l0 u(su30 su30Var) {
        int i;
        zuj0 zuj0Var = (zuj0) this.b;
        avj0 avj0Var = (avj0) zuj0Var;
        String h = avj0Var.h(kyh0.mt_text_separator);
        String obj = su30Var.c.b.toString();
        String str = su30Var.f.b;
        if (obj.length() > 0) {
            obj = String.format(h, Arrays.copyOf(new Object[]{obj, str}, 2));
        } else if (obj.length() <= 0) {
            obj = "";
        }
        String i2 = avj0Var.i(kyh0.mt_route_details_v2_walking_time, t7s.g(zuj0Var, TimeUnit.MINUTES.toMillis(su30Var.d.a)));
        List list = su30Var.a;
        if ((list instanceof Collection) && list.isEmpty()) {
            i = 0;
        } else {
            Iterator it = list.iterator();
            i = 0;
            while (it.hasNext()) {
                if ((((hz30) it.next()) instanceof fj40) && (i = i + 1) < 0) {
                    scc.l();
                    throw null;
                }
            }
        }
        int i3 = i - 1;
        int i4 = i3 >= 0 ? i3 : 0;
        String format = i4 > 0 ? String.format(avj0Var.f(dwh0.mt_route_details_v2_transfers_count, i4), Arrays.copyOf(new Object[]{Integer.valueOf(i4)}, 1)) : null;
        if (format != null) {
            i2 = String.format(h, Arrays.copyOf(new Object[]{i2, format}, 2));
        }
        return new b3l0(obj, i2);
    }

    public int v(xgu0 xgu0Var) {
        List list;
        int f;
        pe50 c = ((re50) this.a).c();
        if (xgu0Var instanceof vgu0) {
            return ((vgu0) xgu0Var).a;
        }
        if (!jl40.l(xgu0Var, wgu0.a)) {
            w511.b();
            return 0;
        }
        if (c == null || (list = c.b) == null || (f = scc.f(list)) < 0) {
            return 0;
        }
        return f;
    }

    public void w() {
        ArrayList arrayList = (ArrayList) this.b;
        if (((yj70) this.a) == null) {
            return;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            boolean z = next instanceof clg0;
            yj70 yj70Var = (yj70) this.a;
            if (z) {
                ((yeo) yj70Var.a).error("VideoError", ((clg0) next).a, null);
            } else {
                ((yeo) yj70Var.a).success((mwc0) next);
            }
        }
        arrayList.clear();
    }

    public /* synthetic */ yxf0(Object obj, Object obj2, boolean z) {
        this.b = obj;
        this.a = obj2;
    }

    public /* synthetic */ yxf0(Object obj, Object obj2) {
        this.a = obj;
        this.b = obj2;
    }
}
