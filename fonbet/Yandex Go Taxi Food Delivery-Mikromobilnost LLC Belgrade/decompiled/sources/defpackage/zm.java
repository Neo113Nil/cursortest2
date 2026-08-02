package defpackage;

import android.content.Context;
import com.yandex.plus.experiments.impl.providers.a;
import com.yandex.plus.paywall.sdk.analytics.impl.evgen.analytics.AcquisitionEvgenDeviceType;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import io.appmetrica.analytics.rtm.internal.Constants;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlin.Pair;
import kotlin.Result;
import kotlin.collections.b;
import ru.yandex.video.m3.ott.data.local.db.DatabaseHelper;

/* loaded from: classes2.dex */
public final class zm {
    public final g191 a;
    public final b42 b;
    public final y42 c;

    public zm(g191 g191Var, b42 b42Var, y42 y42Var) {
        this.a = g191Var;
        this.b = b42Var;
        this.c = y42Var;
    }

    public static HashMap a(HashMap hashMap) {
        HashMap hashMap2 = new HashMap();
        HashMap hashMap3 = new HashMap();
        hashMap3.put("version", 1);
        hashMap2.put(DatabaseHelper.OttTrackingTable.COLUMN_EVENT, hashMap3);
        hashMap2.put("interfaces", hashMap);
        return hashMap2;
    }

    public final void b(String str, LinkedHashMap linkedHashMap) {
        HashMap hashMap = new HashMap();
        hashMap.putAll(linkedHashMap);
        b42 b42Var = this.b;
        oo2 oo2Var = b42Var.a;
        ru2 ru2Var = (ru2) oo2Var.a;
        Context context = (Context) ru2Var.g;
        Object h = ((a) b42Var.b.e.getValue()).h();
        if (h instanceof Result.Failure) {
            h = null;
        }
        k2d0 k2d0Var = (k2d0) h;
        String str2 = k2d0Var != null ? k2d0Var.a : null;
        String str3 = k2d0Var != null ? k2d0Var.b : null;
        Long id = ((lj) ((com.yandex.plus.domain.auth.impl.a) ((i3y) oo2Var.c).getValue()).h.getValue()).getId();
        String l = id != null ? id.toString() : null;
        i3y i3yVar = skd0.a;
        String uuid = skd0.d().toString();
        String language = context.getResources().getConfiguration().getLocales().get(0).getLanguage();
        String format = b42Var.c.format(Float.valueOf(vng.r(context)));
        AcquisitionEvgenDeviceType acquisitionEvgenDeviceType = context.getPackageManager().hasSystemFeature("android.software.leanback") ? AcquisitionEvgenDeviceType.Tv : (context.getResources().getConfiguration().screenLayout & 15) >= 3 ? AcquisitionEvgenDeviceType.Pad : AcquisitionEvgenDeviceType.Phone;
        String str4 = (String) ru2Var.e;
        String str5 = (String) ru2Var.d;
        String str6 = (String) ru2Var.a;
        if (str2 == null) {
            str2 = "no_value";
        }
        if (l == null) {
            l = "no_value";
        }
        if (str3 == null) {
            str3 = "no_value";
        }
        hashMap.putAll(b.i(new Pair("client_app_package", str4), new Pair("client_app_version", str5), new Pair(Constants.KEY_SERVICE, str6), new Pair("sdk_version", "110.0.2"), new Pair("testids", str2), new Pair("puid", l), new Pair("log_session_id", uuid), new Pair("triggered_testids", str3), new Pair("device_language", language), new Pair("device_screen_size", format), new Pair(CommonUrlParts.DEVICE_TYPE, acquisitionEvgenDeviceType.getEventValue())));
        hashMap.putAll(((an) this.c.a.getValue()).a);
        Iterator it = ((jt90) ((ls90) this.a.a).d.getValue()).b.iterator();
        while (it.hasNext()) {
            ((i4j0) it.next()).reportEvent(str, hashMap);
        }
    }
}
