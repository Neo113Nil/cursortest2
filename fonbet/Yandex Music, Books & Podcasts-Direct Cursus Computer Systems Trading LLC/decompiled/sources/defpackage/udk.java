package defpackage;

import android.content.Context;
import com.appsflyer.AFInAppEventParameterName;
import com.appsflyer.AppsFlyerLib;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;

/* loaded from: classes3.dex */
public final class udk {
    public final bve a;
    public final Context b;
    public final jyr c;
    public final jyr d;

    public udk(bve bveVar, Context context, jyr jyrVar, jyr jyrVar2) {
        bveVar.getClass();
        this.a = bveVar;
        this.b = context;
        this.c = jyrVar;
        this.d = jyrVar2;
    }

    public final void a() {
        AppsFlyerLib appsFlyerLib = (AppsFlyerLib) this.c.getValue();
        String str = (String) CollectionsKt.firstOrNull(this.a.p.c);
        if (str == null) {
            str = "";
        }
        appsFlyerLib.logEvent(this.b, "Funnel_PurchaseAlert_PurchaseCompleted", uah.e(new Pair(AFInAppEventParameterName.CONTENT_ID, str), new Pair("puid", ((frt) this.d.getValue()).c().a)));
    }
}
