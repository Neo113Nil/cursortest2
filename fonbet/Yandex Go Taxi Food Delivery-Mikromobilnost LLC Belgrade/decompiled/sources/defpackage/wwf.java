package defpackage;

import android.content.Context;
import android.net.Uri;
import androidx.compose.ui.platform.ComposeView;
import com.yandex.delivery.libs.imageupload.impl.domain.b;
import com.yandex.fintechsdk.adapters.flex.sdk.api.FlexAdapter;
import com.yandex.go.address.models.Address;
import com.yandex.plus.acquisition.sdk.pay.common.api.PlusAcquisitionSmartOffer;
import com.yandex.xplat.common.FileSystemError;
import com.ybsdk.core.analytics.generated.AppAnalyticsReporter;
import com.ybsdk.feature.deeplink.api.Deeplink;
import com.ybsdk.rconfig.configs.DeeplinksOverridesConfig;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import ru.yandex.taxi.common_models.object.GeoObjectType;
import ru.yandex.taxi.delivery.ui.requirement.DeliverySelectRequirementDialog;
import ru.yandex.taxi.linked_order.interactor.h;
import ru.yandex.taxi.logistics.photocomment.c;
import ru.yandex.taxi.logistics.sdk.photocomments.domain.a;
import ru.yandex.taxi.preorder.tollroad.data.e;
import ru.yandex.taxi.preorder.tollroad.o;

/* loaded from: classes12.dex */
public final class wwf implements gw6, vni, af70, wni, jg5 {
    public Object a;
    public Object b;
    public Object c;

    public wwf(Context context) {
        this.a = context.getFilesDir().getAbsolutePath();
        context.getCacheDir().getAbsolutePath();
        this.b = new wh6(new q7x0(m83.c("com.yandex.infra.".concat("FileSystemExecutor")), 1), 0);
        this.c = new xh6(0);
    }

    public static FileSystemError a(String str) {
        File parentFile = new File(str).getParentFile();
        try {
            if (parentFile.exists()) {
                if (!parentFile.isDirectory()) {
                    return new FileSystemError("Received unexpected error when accessing file item at path: '" + parentFile.getAbsolutePath() + "'", null);
                }
            } else if (!parentFile.mkdirs()) {
                return new FileSystemError("Received unexpected error when accessing file item at path: '" + parentFile.getAbsolutePath() + "'", null);
            }
            return null;
        } catch (Throwable th) {
            return new FileSystemError(oyr.p("Received unexpected error when accessing file item at path: '", parentFile.getAbsolutePath(), "'"), th);
        }
    }

    public static String b(Address address, String str) {
        return !evu0.J(str) ? g8e.p(str, " • ", q5z.F(address)) : q5z.F(address);
    }

    public static boolean f(Address address) {
        return (address != null ? address.g0() : null) == GeoObjectType.DELIVERY_PICKUP_POINT;
    }

    public a c() {
        y4a0 y4a0Var = (y4a0) this.a;
        c cVar = (c) y4a0Var.c;
        pzf pzfVar = (pzf) this.b;
        fza0 fza0Var = (fza0) pzfVar.c;
        q5z.h(fza0Var);
        ds7 ds7Var = (ds7) pzfVar.g;
        q5z.h(ds7Var);
        elb0 elb0Var = (elb0) y4a0Var.b;
        vr vrVar = (vr) pzfVar.h;
        q5z.h(vrVar);
        st2 st2Var = (st2) pzfVar.e;
        q5z.h(st2Var);
        l3z l3zVar = (l3z) pzfVar.f;
        q5z.h(l3zVar);
        b bVar = (b) pzfVar.a;
        q5z.h(bVar);
        y30 y30Var = (y30) pzfVar.j;
        q5z.h(y30Var);
        hwy0 hwy0Var = (hwy0) pzfVar.k;
        q5z.h(hwy0Var);
        dci dciVar = (dci) pzfVar.m;
        q5z.h(dciVar);
        htg htgVar = (htg) pzfVar.l;
        q5z.h(htgVar);
        qcp0 qcp0Var = (qcp0) pzfVar.b;
        q5z.h(qcp0Var);
        jln jlnVar = new jln(8, new q4g(y30Var, hwy0Var, dciVar, htgVar, qcp0Var, 16));
        ekb0 ekb0Var = (ekb0) this.c;
        ru.yandex.taxi.logistics.sdk.photocomments.domain.b bVar2 = new ru.yandex.taxi.logistics.sdk.photocomments.domain.b(elb0Var, vrVar, st2Var, l3zVar, bVar, new zrm(12, jlnVar, ekb0Var));
        yuj0 yuj0Var = (yuj0) pzfVar.d;
        q5z.h(yuj0Var);
        com.yandex.delivery.utils.dialogmanager.impl.b bVar3 = (com.yandex.delivery.utils.dialogmanager.impl.b) pzfVar.i;
        q5z.h(bVar3);
        return new a(cVar, fza0Var, ds7Var, bVar2, yuj0Var, bVar3, y30Var, new e100(6, bVar3, yuj0Var, ekb0Var), st2Var);
    }

    public void close() {
        ((czh) this.a).dismiss();
    }

    @Override // defpackage.af70
    public void d(int i, int i2, String str) {
        if (i2 == i) {
            return;
        }
        yzh yzhVar = (yzh) ((vu8) this.a).J;
        String str2 = (String) this.b;
        boolean z = i2 == 1;
        pj pjVar = (pj) yzhVar.a;
        Map e = gw00.e(new Pair(str, Boolean.valueOf(z)));
        pjVar.getClass();
        HashMap hashMap = new HashMap();
        hashMap.put(PlusAcquisitionSmartOffer.Texts.TARIFF_PREFIX, str2);
        hashMap.putAll(e);
        pjVar.a.a("DeliverySelectorDialog.OptionSelect.Tapped", hashMap, 1, new HashMap());
    }

    @Override // defpackage.af70
    public void e(String str, String str2, boolean z) {
        DeliverySelectRequirementDialog deliverySelectRequirementDialog = (DeliverySelectRequirementDialog) this.c;
        if (z) {
            deliverySelectRequirementDialog.setNextButtonEnable(true);
            d(0, 1, str2);
        } else {
            deliverySelectRequirementDialog.setNextButtonEnable(false);
            d(1, 0, str2);
        }
    }

    public boolean g() {
        com.yandex.go.route.interactor.c cVar = (com.yandex.go.route.interactor.c) this.b;
        List b = cVar.b();
        if (!(b instanceof Collection) || !b.isEmpty()) {
            Iterator it = b.iterator();
            while (it.hasNext()) {
                String q0 = ((Address) it.next()).q0();
                if (q0 == null || q0.length() == 0) {
                    return false;
                }
            }
        }
        List b2 = cVar.b();
        HashSet hashSet = new HashSet();
        ArrayList arrayList = new ArrayList();
        for (Object obj : b2) {
            if (hashSet.add(((Address) obj).q0())) {
                arrayList.add(obj);
            }
        }
        return arrayList.size() > 1;
    }

    public h i() {
        mf1 mf1Var = (mf1) this.b;
        zly zlyVar = (zly) this.a;
        qoy qoyVar = zlyVar.i;
        q5z.h(qoyVar);
        tt2 tt2Var = zlyVar.h;
        q5z.h(tt2Var);
        o8a0 o8a0Var = zlyVar.m;
        q5z.h(o8a0Var);
        ru.yandex.taxi.linked_order.mapper.a aVar = new ru.yandex.taxi.linked_order.mapper.a(o8a0Var);
        o22 o22Var = zlyVar.j;
        q5z.h(o22Var);
        ul00 ul00Var = zlyVar.k;
        q5z.h(ul00Var);
        return new h(mf1Var, qoyVar, tt2Var, aVar, o22Var, ul00Var);
    }

    public Deeplink j(Deeplink deeplink) {
        Deeplink e;
        String str = ((DeeplinksOverridesConfig) ((tv3) this.a).a.d(h4h.a).getData()).getOverrides().get(b64.j(deeplink.getParsedUri().getHost(), deeplink.getParsedUri().getPath()));
        if (str == null || (e = w691.e((a3h) this.b, Uri.parse(str), true, null, false, 12)) == null) {
            return deeplink;
        }
        ((AppAnalyticsReporter) this.c).m0.a.a("tech.deeplink.overrided", x4e.t(2, "from", deeplink.getParsedUri().toString(), "to", e.getParsedUri().toString()));
        return Deeplink.copy$default(deeplink, e.getAction(), null, null, null, null, null, false, false, 254, null);
    }

    public o k() {
        itc itcVar = (itc) this.a;
        mqz0 mqz0Var = (mqz0) itcVar.d;
        q5z.h(mqz0Var);
        e eVar = (e) itcVar.c;
        q5z.h(eVar);
        opz0 opz0Var = (opz0) ((xvf0) this.b).get();
        ru.yandex.taxi.preorder.tollroad.a aVar = (ru.yandex.taxi.preorder.tollroad.a) itcVar.n;
        q5z.h(aVar);
        wiq0 wiq0Var = (wiq0) itcVar.h;
        q5z.h(wiq0Var);
        xdf xdfVar = (xdf) itcVar.o;
        q5z.h(xdfVar);
        h3y a = i5m.a((ebg) this.c);
        ru.yandex.taxi.widget.c cVar = (ru.yandex.taxi.widget.c) itcVar.q;
        q5z.h(cVar);
        return new o(mqz0Var, eVar, opz0Var, aVar, wiq0Var, xdfVar, a, cVar);
    }

    @Override // defpackage.wni
    public ComposeView m(uni uniVar, vni vniVar) {
        ComposeView composeView = new ComposeView((Context) this.a, null, 0, 6, null);
        composeView.setContent(new androidx.compose.runtime.internal.a(-1868586889, new r8j(this, 0), true));
        return composeView;
    }

    @Override // defpackage.jg5
    public void y(ig5 ig5Var, jh5 jh5Var) {
        FlexAdapter flexAdapter;
        sh5 stateManager;
        wm50 wm50Var = jh5Var.a;
        if (ig5Var instanceof kaj) {
            String publicKey = ((qbj) this.b).getPublicKey();
            if (publicKey == null || publicKey.length() == 0) {
                vm50 vm50Var = ((kaj) ig5Var).b;
                if (vm50Var != null) {
                    wm50Var.dispatch(vm50Var);
                    return;
                }
                return;
            }
            z22 z22Var = (z22) this.a;
            kaj kajVar = (kaj) ig5Var;
            Map map = kajVar.a;
            if (map == null) {
                map = kotlin.collections.b.f();
            }
            ((com.yandex.fintechsdk.core.analytics.impl.internal.a) z22Var).a(new mz5(map, publicKey));
            List list = kajVar.c;
            List list2 = list;
            if (list2 != null && !list2.isEmpty() && (flexAdapter = (FlexAdapter) this.c) != null && (stateManager = flexAdapter.getStateManager()) != null) {
                bia1.j(stateManager, list, publicKey);
            }
            vm50 vm50Var2 = kajVar.b;
            if (vm50Var2 != null) {
                wm50Var.dispatch(vm50Var2);
            }
        }
    }

    public /* synthetic */ wwf(Object obj, Object obj2, Object obj3) {
        this.a = obj;
        this.b = obj2;
        this.c = obj3;
    }

    public wwf(pzf pzfVar, y4a0 y4a0Var, ekb0 ekb0Var) {
        this.a = y4a0Var;
        this.b = pzfVar;
        this.c = ekb0Var;
    }
}
