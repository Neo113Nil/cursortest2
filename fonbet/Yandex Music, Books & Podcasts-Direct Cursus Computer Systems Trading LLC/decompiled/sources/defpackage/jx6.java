package defpackage;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.connectsdk.service.airplay.PListParser;
import com.facebook.CustomTabMainActivity;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.util.HashSet;
import java.util.Locale;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class jx6 extends sbv {
    public static final Parcelable.Creator<jx6> CREATOR = new kg4(22);
    public static boolean g = false;
    public String d;
    public String e;
    public String f;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // defpackage.ytg
    public final String j() {
        return "custom_tab";
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x004d, code lost:
    
        if (r8.startsWith("fb" + defpackage.j3c.c() + "://authorize/") != false) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x000b, code lost:
    
        if (r9.getBooleanExtra("CustomTabMainActivity.no_activity_exception", false) != false) goto L9;
     */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00fe  */
    @Override // defpackage.ytg
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean l(int i, int i2, Intent intent) {
        String str;
        int parseInt;
        boolean z = false;
        if (intent != null) {
            int i3 = CustomTabMainActivity.c;
        }
        if (i == 1) {
            atg atgVar = i().g;
            if (i2 != -1) {
                C(atgVar, null, new f3c());
                return false;
            }
            if (intent != null) {
                int i4 = CustomTabMainActivity.c;
                str = intent.getStringExtra("CustomTabMainActivity.extra_url");
            } else {
                str = null;
            }
            if (str != null) {
                if (!str.startsWith("fbconnect://cct.")) {
                }
                Uri parse = Uri.parse(str);
                Bundle J = gvt.J(parse.getQuery());
                J.putAll(gvt.J(parse.getFragment()));
                try {
                    String string = J.getString("state");
                    if (string != null) {
                        z = new JSONObject(string).getString("7_challenge").equals(this.e);
                    }
                } catch (JSONException unused) {
                }
                if (z) {
                    String string2 = J.getString("error");
                    if (string2 == null) {
                        string2 = J.getString("error_type");
                    }
                    String string3 = J.getString("error_msg");
                    if (string3 == null) {
                        string3 = J.getString("error_message");
                    }
                    if (string3 == null) {
                        string3 = J.getString("error_description");
                    }
                    String string4 = J.getString("error_code");
                    if (!gvt.D(string4)) {
                        try {
                            parseInt = Integer.parseInt(string4);
                        } catch (NumberFormatException unused2) {
                        }
                        if (!gvt.D(string2) && gvt.D(string3) && parseInt == -1) {
                            C(atgVar, J, null);
                        } else if (string2 == null && (string2.equals("access_denied") || string2.equals("OAuthAccessDeniedException"))) {
                            C(atgVar, null, new f3c());
                        } else if (parseInt != 4201) {
                            C(atgVar, null, new f3c());
                        } else {
                            C(atgVar, null, new l3c(new g3c(parseInt, string2, string3), string3));
                        }
                    }
                    parseInt = -1;
                    if (!gvt.D(string2)) {
                    }
                    if (string2 == null) {
                    }
                    if (parseInt != 4201) {
                    }
                } else {
                    C(atgVar, null, new c3c("Invalid state parameter"));
                }
            }
            return true;
        }
        return false;
    }

    @Override // defpackage.ytg
    public final void m(JSONObject jSONObject) {
        jSONObject.put("7_challenge", this.e);
    }

    @Override // defpackage.ytg
    public final int n(atg atgVar) {
        ctg i = i();
        String str = this.f;
        if (str.isEmpty()) {
            return 0;
        }
        Bundle o = o(atgVar);
        int i2 = atgVar.l;
        o.putString("redirect_uri", str);
        boolean z = i2 == 2;
        String str2 = atgVar.d;
        if (z) {
            o.putString(CommonUrlParts.APP_ID, str2);
        } else {
            o.putString("client_id", str2);
        }
        i();
        o.putString("e2e", ctg.h());
        if (i2 == 2) {
            o.putString("response_type", "token,signed_request,graph_domain,granted_scopes");
        } else if (atgVar.b.contains("openid")) {
            o.putString("response_type", "id_token,token,signed_request,graph_domain");
            o.putString("nonce", atgVar.o);
        } else {
            o.putString("response_type", "token,signed_request,graph_domain");
        }
        o.putString("return_scopes", PListParser.TAG_TRUE);
        o.putString("auth_type", atgVar.h);
        o.putString("login_behavior", hrg.C(atgVar.a));
        Locale locale = Locale.ROOT;
        HashSet hashSet = j3c.a;
        o.putString("sdk", "android-12.2.0");
        o.putString("sso", "chrome_custom_tab");
        boolean z2 = j3c.k;
        String str3 = CommonUrlParts.Values.FALSE_INTEGER;
        o.putString("cct_prefetching", z2 ? "1" : CommonUrlParts.Values.FALSE_INTEGER);
        if (atgVar.m) {
            o.putString("fx_app", hrg.e(i2));
        }
        if (atgVar.n) {
            o.putString("skip_dedupe", PListParser.TAG_TRUE);
        }
        String str4 = atgVar.j;
        if (str4 != null) {
            o.putString("messenger_page_id", str4);
            if (atgVar.k) {
                str3 = "1";
            }
            o.putString("reset_messenger_state", str3);
        }
        if (g) {
            o.putString("cct_over_app_switch", "1");
        }
        if (j3c.k) {
            if (i2 == 2) {
                kx6.b(ix6.g(o, "oauth"));
            } else {
                kx6.b(ix6.g(o, "oauth"));
            }
        }
        Intent intent = new Intent(i.c.l(), (Class<?>) CustomTabMainActivity.class);
        int i3 = CustomTabMainActivity.c;
        intent.putExtra("CustomTabMainActivity.extra_action", "oauth");
        intent.putExtra("CustomTabMainActivity.extra_params", o);
        String str5 = this.d;
        if (str5 == null) {
            str5 = ox6.F();
            this.d = str5;
        }
        intent.putExtra("CustomTabMainActivity.extra_chromePackage", str5);
        intent.putExtra("CustomTabMainActivity.extra_targetApp", hrg.e(i2));
        i.c.startActivityForResult(intent, 1);
        return 1;
    }

    @Override // defpackage.sbv
    public final ra p() {
        return ra.CHROME_CUSTOM_TAB;
    }

    @Override // defpackage.ytg, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.e);
    }
}
