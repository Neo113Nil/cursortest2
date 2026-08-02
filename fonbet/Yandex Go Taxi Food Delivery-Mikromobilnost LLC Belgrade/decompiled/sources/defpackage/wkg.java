package defpackage;

import android.net.Uri;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import com.ybsdk.rconfig.b;
import com.ybsdk.rconfig.configs.DashboardV3Feature;
import com.ybsdk.rconfig.configs.DefaultProductForDashboardSchema;
import com.ybsdk.screens.initial.deeplink.DeeplinkAction;
import com.ybsdk.screens.initial.deeplink.SdkUri$QueryParam;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes9.dex */
public final class wkg {
    public final b a;
    public final JsonAdapter b;

    public wkg(b bVar, Moshi moshi) {
        this.a = bVar;
        this.b = moshi.adapter(DeeplinkAction.DashboardDeeplinkParams.class);
    }

    public final DeeplinkAction.DashboardAction a(Uri uri) {
        JsonAdapter jsonAdapter;
        String o = bzk0.o(uri, SdkUri$QueryParam.PRODUCT_ID);
        String o2 = bzk0.o(uri, SdkUri$QueryParam.AGREEMENT_ID);
        List<String> m = bzk0.m(uri, SdkUri$QueryParam.PRODUCT_ITEM);
        b bVar = this.a;
        bVar.getClass();
        List<String> products = ((DashboardV3Feature) bVar.d(jr51.a).getData()).getProducts();
        ArrayList arrayList = new ArrayList();
        for (String str : m) {
            DeeplinkAction.DashboardDeeplinkParams dashboardDeeplinkParams = null;
            if (str != null && (jsonAdapter = this.b) != null) {
                dashboardDeeplinkParams = (DeeplinkAction.DashboardDeeplinkParams) jsonAdapter.fromJson(str);
            }
            if (dashboardDeeplinkParams != null) {
                arrayList.add(dashboardDeeplinkParams);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (products.contains(((DeeplinkAction.DashboardDeeplinkParams) next).getProductId())) {
                arrayList2.add(next);
            }
        }
        String o3 = bzk0.o(uri, SdkUri$QueryParam.PRODUCT_TYPE);
        String productId = ((DefaultProductForDashboardSchema) bVar.d(lih.a).getData()).getProduct().getProductId();
        if (o == null) {
            o = productId;
        }
        return new DeeplinkAction.DashboardAction(o, o2, o3, arrayList2);
    }
}
