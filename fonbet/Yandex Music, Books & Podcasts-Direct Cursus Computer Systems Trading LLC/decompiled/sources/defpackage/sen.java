package defpackage;

import com.connectsdk.service.airplay.PListParser;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;

/* loaded from: classes3.dex */
public final class sen extends qen {
    public final String p;
    public final String q;
    public final int r;
    public Boolean s;
    public String t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sen(String str, String str2, int i, yen yenVar, String str3, String str4, String str5, mtk mtkVar, wdb wdbVar) {
        super(yenVar, str3, str4, str5, mtkVar, wdbVar);
        str.getClass();
        if (i == 0) {
            throw null;
        }
        this.p = str;
        this.q = str2;
        this.r = i;
        this.s = null;
        this.t = null;
        if (lsq.z(str)) {
            xq0.x("Name must not be empty");
            throw null;
        }
    }

    @Override // defpackage.qen
    public final String a() {
        return "690.32";
    }

    @Override // defpackage.qen
    public final Map b() {
        LinkedHashMap g = uah.g(new Pair("table", "rum_events"));
        String str = this.t;
        if (str != null) {
            g.put("reqid", str);
        }
        return g;
    }

    @Override // defpackage.qen
    public final LinkedHashMap c() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Boolean bool = this.s;
        if (bool != null) {
            linkedHashMap.put("-loggedin", bool.booleanValue() ? "1" : CommonUrlParts.Values.FALSE_INTEGER);
        }
        return linkedHashMap;
    }

    @Override // defpackage.qen
    public final Map d() {
        String str;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("-name", mlr.K(500, this.p));
        String str2 = this.q;
        if (str2 != null) {
            linkedHashMap.put("-value", str2);
            int i = this.r;
            if (i == 1) {
                str = PListParser.TAG_STRING;
            } else if (i == 2) {
                str = "float";
            } else {
                if (i != 3) {
                    throw null;
                }
                str = PListParser.TAG_INTEGER;
            }
            linkedHashMap.put("-type", str);
        }
        return linkedHashMap;
    }
}
