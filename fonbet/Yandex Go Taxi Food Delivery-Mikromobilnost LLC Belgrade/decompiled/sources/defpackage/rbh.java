package defpackage;

import java.security.cert.PKIXBuilderParameters;
import org.json.JSONException;
import org.json.JSONObject;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.CryptoPro.reprov.JCPPKIXBuilderAlternativeParameters;
import ru.CryptoPro.reprov.RevCheck;

/* loaded from: classes11.dex */
public final class rbh implements d4x {
    public final /* synthetic */ int a;
    public final String b;
    public final String c;

    public rbh(JSONObject jSONObject, quz quzVar) {
        String str;
        this.a = 1;
        try {
            str = b4x.m("position", jSONObject);
        } catch (JSONException e) {
            quzVar.e(e);
            str = null;
        }
        if ("left".equals(str)) {
            this.b = "left";
        } else if ("right".equals(str)) {
            this.b = "right";
        } else {
            this.b = "left";
        }
        String j = b4x.j("size", jSONObject);
        if ("zero".equals(j)) {
            this.c = "zero";
            return;
        }
        if ("xxs".equals(j)) {
            this.c = "xxs";
            return;
        }
        if ("xs".equals(j)) {
            this.c = "xs";
            return;
        }
        if ("s".equals(j)) {
            this.c = "s";
            return;
        }
        if ("m".equals(j)) {
            this.c = "m";
            return;
        }
        if ("l".equals(j)) {
            this.c = "l";
            return;
        }
        if ("xl".equals(j)) {
            this.c = "xl";
        } else if ("xxl".equals(j)) {
            this.c = "xxl";
        } else {
            if (!"match_parent".equals(j)) {
                throw new JSONException(j.concat(" is not a valid value of size"));
            }
            this.c = "match_parent";
        }
    }

    public static rbh a(Object obj, PKIXBuilderParameters pKIXBuilderParameters) {
        int i = 10;
        if (obj != null && !((String) obj).contains("GR3410")) {
            return new rbh(null, "PKIX", i);
        }
        String str = nt61.p;
        if (str != null || nt61.q != null) {
            return new rbh(str, nt61.q, i);
        }
        if (!(pKIXBuilderParameters instanceof JCPPKIXBuilderAlternativeParameters)) {
            return new rbh(RevCheck.PROVIDER_NAME, RevCheck.CP_REV_CHECK_ALG, i);
        }
        JCPPKIXBuilderAlternativeParameters jCPPKIXBuilderAlternativeParameters = (JCPPKIXBuilderAlternativeParameters) pKIXBuilderParameters;
        return new rbh(jCPPKIXBuilderAlternativeParameters.getPkixProvider(), jCPPKIXBuilderAlternativeParameters.getPkixAlgorithm(), i);
    }

    public static rbh b(Object obj, PKIXBuilderParameters pKIXBuilderParameters) {
        int i = 11;
        if (obj != null && !((String) obj).contains("GR3410")) {
            return new rbh(null, "PKIX", i);
        }
        String str = nu61.p;
        if (str != null || nu61.q != null) {
            return new rbh(str, nu61.q, i);
        }
        if (!(pKIXBuilderParameters instanceof JCPPKIXBuilderAlternativeParameters)) {
            return new rbh(RevCheck.PROVIDER_NAME, RevCheck.CP_REV_CHECK_ALG, i);
        }
        JCPPKIXBuilderAlternativeParameters jCPPKIXBuilderAlternativeParameters = (JCPPKIXBuilderAlternativeParameters) pKIXBuilderParameters;
        return new rbh(jCPPKIXBuilderAlternativeParameters.getPkixProvider(), jCPPKIXBuilderAlternativeParameters.getPkixAlgorithm(), i);
    }

    public String toString() {
        int i = this.a;
        String str = this.c;
        String str2 = this.b;
        switch (i) {
            case 1:
                tjz0 tjz0Var = new tjz0();
                tjz0Var.a(str2, "position");
                tjz0Var.a(str, "size");
                return tjz0Var.a.toString();
            case 12:
                return str2 + Extension.FIX_SPACE + str;
            default:
                return super.toString();
        }
    }

    public /* synthetic */ rbh(String str, String str2, int i) {
        this.a = i;
        this.b = str;
        this.c = str2;
    }
}
