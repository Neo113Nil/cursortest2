package defpackage;

import com.apollographql.apollo3.api.c;
import com.apollographql.apollo3.api.json.JsonReader$Token;
import com.yandex.plus.acquisition.sdk.pay.common.api.PlusAcquisitionSmartOffer;
import java.util.List;
import java.util.Map;
import ru.yandex.video.m3.player.utils.DRMInfoProvider;

/* loaded from: classes2.dex */
public abstract class ve70 implements b70 {
    public static final List a = scc.g("title", "text", DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, "additionText", "payload", "image", "offerName", PlusAcquisitionSmartOffer.Texts.OPTION_PREFIX, "backgroundTv");

    public static se70 c(xdx xdxVar, c cVar) {
        Object obj;
        Object b;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        Map map = null;
        Map map2 = null;
        String str5 = null;
        re70 re70Var = null;
        qe70 qe70Var = null;
        while (true) {
            int h2 = xdxVar.h2(a);
            wkf wkfVar = ju00.a;
            switch (h2) {
                case 0:
                    foe foeVar = l80.a;
                    str = xdxVar.nextString();
                    break;
                case 1:
                    str2 = (String) l80.i.b(xdxVar, cVar);
                    break;
                case 2:
                    str3 = (String) l80.i.b(xdxVar, cVar);
                    break;
                case 3:
                    str4 = (String) l80.i.b(xdxVar, cVar);
                    break;
                case 4:
                    b70 d = cVar.d(wkfVar);
                    foe foeVar2 = l80.a;
                    if (!(d instanceof om60)) {
                        if (xdxVar.peek() == JsonReader$Token.NULL) {
                            xdxVar.skipValue();
                            b = null;
                        } else {
                            b = d.b(xdxVar, cVar);
                        }
                        map = (Map) b;
                        break;
                    } else {
                        ny61.r("The adapter is already nullable");
                        return null;
                    }
                case 5:
                    map2 = (Map) cVar.d(wkfVar).b(xdxVar, cVar);
                    break;
                case 6:
                    str5 = (String) cVar.d(rs60.a).b(xdxVar, cVar);
                    break;
                case 7:
                    re70Var = (re70) l80.a(ue70.a).b(xdxVar, cVar);
                    break;
                case 8:
                    te70 te70Var = te70.a;
                    foe foeVar3 = l80.a;
                    ep60 ep60Var = new ep60(te70Var, true);
                    if (xdxVar.peek() == JsonReader$Token.NULL) {
                        xdxVar.skipValue();
                        obj = null;
                    } else {
                        obj = ep60Var.b(xdxVar, cVar);
                    }
                    qe70Var = (qe70) obj;
                    break;
                default:
                    return new se70(str, str2, str3, str4, map, map2, str5, re70Var, qe70Var);
            }
        }
    }
}
