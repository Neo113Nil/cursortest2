package defpackage;

import io.appmetrica.analytics.rtm.internal.Constants;
import java.util.Map;

/* loaded from: classes2.dex */
public final class snz0 extends thj {
    public final String a;
    public final String b = "card";
    public final mnz0 c;
    public final wj00 d;

    public snz0(String str, mnz0 mnz0Var, wj00 wj00Var) {
        this.a = str;
        this.c = mnz0Var;
        this.d = wj00Var;
    }

    @Override // defpackage.thj, defpackage.l55, defpackage.hz50
    public final wj00 a() {
        wj00 wj00Var = new wj00(0);
        wj00Var.k("method", this.b);
        mnz0 mnz0Var = this.c;
        mnz0Var.getClass();
        wj00 wj00Var2 = new wj00(0);
        String str = mnz0Var.a;
        if (str != null) {
            wj00Var2.k("pan", str);
        }
        String str2 = mnz0Var.b;
        if (str2 == null) {
            str2 = null;
        } else if (str2.length() == 2) {
            str2 = "20".concat(str2);
        }
        if (str2 != null) {
            wj00Var2.k("expiration_year", str2);
        }
        String str3 = mnz0Var.c;
        if (str3 != null) {
            wj00Var2.k("expiration_month", str3);
        }
        String str4 = mnz0Var.d;
        if (str4 != null) {
            wj00Var2.k("holder_name", str4);
        }
        String str5 = mnz0Var.e;
        if (str5 != null) {
            wj00Var2.k("cvn", str5);
        }
        Map map = wj00Var.b;
        map.put(Constants.KEY_DATA, wj00Var2);
        wj00 wj00Var3 = this.d;
        if (wj00Var3 != null) {
            map.put("context", wj00Var3);
        }
        return wj00Var;
    }

    @Override // defpackage.thj, defpackage.hz50
    public final String c() {
        return "v2/tokenize";
    }

    @Override // defpackage.l55, defpackage.hz50
    public final wj00 d() {
        wj00 d = super.d();
        d.k("X-Request-ID", this.a);
        return d;
    }
}
