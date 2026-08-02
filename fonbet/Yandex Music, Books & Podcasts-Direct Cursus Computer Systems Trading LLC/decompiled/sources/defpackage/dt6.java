package defpackage;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.Handler;
import android.os.Looper;
import android.util.Base64;
import com.appsflyer.AppsFlyerProperties;
import com.connectsdk.device.ConnectableDevice;
import com.google.android.gms.fido.common.Transport;
import io.appmetrica.analytics.rtm.internal.Constants;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.concurrent.Executor;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class dt6 extends vs6 {
    public final Context d;
    public ls6 e;
    public Executor f;
    public CancellationSignal g;
    public final ss6 h;

    public dt6(Context context) {
        context.getClass();
        this.d = context;
        this.h = new ss6(this, new Handler(Looper.getMainLooper()), 2);
    }

    public static cs6 e(g0n g0nVar) {
        JSONObject jSONObject;
        try {
            o02 o02Var = g0nVar.f;
            obx obxVar = g0nVar.c;
            try {
                JSONObject jSONObject2 = new JSONObject();
                if (obxVar != null && obxVar.u().length > 0) {
                    jSONObject2.put("rawId", vq1.M(obxVar.u()));
                }
                String str = g0nVar.h;
                if (str != null) {
                    jSONObject2.put("authenticatorAttachment", str);
                }
                String str2 = g0nVar.b;
                if (str2 != null && o02Var == null) {
                    jSONObject2.put("type", str2);
                }
                String str3 = g0nVar.a;
                if (str3 != null) {
                    jSONObject2.put(ConnectableDevice.KEY_ID, str3);
                }
                String str4 = "response";
                m02 m02Var = g0nVar.e;
                boolean z = true;
                if (m02Var != null) {
                    jSONObject = m02Var.d();
                } else {
                    n02 n02Var = g0nVar.d;
                    if (n02Var != null) {
                        jSONObject = n02Var.d();
                    } else {
                        z = false;
                        if (o02Var != null) {
                            try {
                                JSONObject jSONObject3 = new JSONObject();
                                jSONObject3.put("code", o02Var.a.a);
                                String str5 = o02Var.b;
                                if (str5 != null) {
                                    jSONObject3.put(Constants.KEY_MESSAGE, str5);
                                }
                                str4 = "error";
                                jSONObject = jSONObject3;
                            } catch (JSONException e) {
                                throw new RuntimeException("Error encoding AuthenticatorErrorResponse to JSON object", e);
                            }
                        } else {
                            jSONObject = null;
                        }
                    }
                }
                if (jSONObject != null) {
                    jSONObject2.put(str4, jSONObject);
                }
                a02 a02Var = g0nVar.g;
                if (a02Var != null) {
                    jSONObject2.put("clientExtensionResults", a02Var.d());
                } else if (z) {
                    jSONObject2.put("clientExtensionResults", new JSONObject());
                }
                String jSONObject4 = jSONObject2.toString();
                jSONObject4.getClass();
                Bundle bundle = new Bundle();
                bundle.putString("androidx.credentials.BUNDLE_KEY_REGISTRATION_RESPONSE_JSON", jSONObject4);
                return new cs6(bundle, jSONObject4);
            } catch (JSONException e2) {
                throw new RuntimeException("Error encoding PublicKeyCredential to JSON object", e2);
            }
        } catch (Throwable th) {
            throw new yq6(su4.p(th, new StringBuilder("The PublicKeyCredential response json had an unexpected exception when parsing: ")), 4);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final j0n d(bs6 bs6Var) {
        zz1 zz1Var;
        s02 s02Var;
        zz1 zz1Var2;
        JSONArray jSONArray;
        ArrayList arrayList;
        long j;
        bs6Var.getClass();
        LinkedHashMap linkedHashMap = i0n.a;
        String str = bs6Var.e;
        Context context = this.d;
        context.getClass();
        if (pmd.e.b(context, qmd.a) == 0) {
            PackageManager packageManager = context.getPackageManager();
            packageManager.getClass();
            if (Build.VERSION.SDK_INT >= 28) {
                PackageInfo packageInfo = packageManager.getPackageInfo("com.google.android.gms", 0);
                packageInfo.getClass();
                j = jo0.A(packageInfo);
            } else {
                j = packageManager.getPackageInfo("com.google.android.gms", 0).versionCode;
            }
            if (j > 241217000) {
                return new j0n(str);
            }
        }
        JSONObject jSONObject = new JSONObject(str);
        byte[] B = bzf.B(jSONObject);
        JSONObject jSONObject2 = jSONObject.getJSONObject("user");
        String string = jSONObject2.getString(ConnectableDevice.KEY_ID);
        string.getClass();
        int i = 11;
        byte[] decode = Base64.decode(string, 11);
        decode.getClass();
        String string2 = jSONObject2.getString("name");
        String string3 = jSONObject2.getString("displayName");
        String optString = jSONObject2.optString("icon", "");
        string3.getClass();
        if (string3.length() == 0) {
            throw new JSONException("PublicKeyCredentialCreationOptions UserEntity missing displayName or they are unexpectedly empty");
        }
        if (decode.length == 0) {
            throw new JSONException("PublicKeyCredentialCreationOptions UserEntity missing user id or they are unexpectedly empty");
        }
        string2.getClass();
        if (string2.length() == 0) {
            throw new JSONException("PublicKeyCredentialCreationOptions UserEntity missing user name or they are unexpectedly empty");
        }
        p0n p0nVar = new p0n(string2, optString, string3, decode);
        JSONObject jSONObject3 = jSONObject.getJSONObject("rp");
        String string4 = jSONObject3.getString(ConnectableDevice.KEY_ID);
        String optString2 = jSONObject3.optString("name", "");
        String optString3 = jSONObject3.optString("icon", "");
        optString3.getClass();
        if (optString3.length() == 0) {
            optString3 = null;
        }
        optString2.getClass();
        if (optString2.length() == 0) {
            throw new JSONException("PublicKeyCredentialCreationOptions rp name is missing or unexpectedly empty");
        }
        string4.getClass();
        if (string4.length() == 0) {
            throw new JSONException("PublicKeyCredentialCreationOptions rp ID is missing or unexpectedly empty");
        }
        m0n m0nVar = new m0n(string4, optString2, optString3);
        JSONArray jSONArray2 = jSONObject.getJSONArray("pubKeyCredParams");
        m0n m0nVar2 = m0nVar;
        ArrayList arrayList2 = new ArrayList();
        int length = jSONArray2.length();
        int i2 = 0;
        while (i2 < length) {
            JSONObject jSONObject4 = jSONArray2.getJSONObject(i2);
            LinkedHashMap linkedHashMap2 = i0n.a;
            m0n m0nVar3 = m0nVar2;
            int i3 = (int) jSONObject4.getLong("alg");
            String optString4 = jSONObject4.optString("type", "");
            optString4.getClass();
            if (optString4.length() == 0) {
                throw new JSONException("PublicKeyCredentialCreationOptions PublicKeyCredentialParameter type missing or unexpectedly empty");
            }
            try {
                yn3.a(i3);
                arrayList2.add(new l0n(optString4, i3));
            } catch (Throwable unused) {
            }
            i2++;
            m0nVar2 = m0nVar3;
        }
        m0n m0nVar4 = m0nVar2;
        ArrayList arrayList3 = new ArrayList();
        LinkedHashMap linkedHashMap3 = i0n.a;
        if (jSONObject.has("excludeCredentials")) {
            JSONArray jSONArray3 = jSONObject.getJSONArray("excludeCredentials");
            int length2 = jSONArray3.length();
            int i4 = 0;
            while (i4 < length2) {
                JSONObject jSONObject5 = jSONArray3.getJSONObject(i4);
                LinkedHashMap linkedHashMap4 = i0n.a;
                String string5 = jSONObject5.getString(ConnectableDevice.KEY_ID);
                string5.getClass();
                byte[] decode2 = Base64.decode(string5, i);
                decode2.getClass();
                String string6 = jSONObject5.getString("type");
                string6.getClass();
                if (string6.length() == 0) {
                    throw new JSONException("PublicKeyCredentialDescriptor type value is not found or unexpectedly empty");
                }
                if (decode2.length == 0) {
                    throw new JSONException("PublicKeyCredentialDescriptor id value is not found or unexpectedly empty");
                }
                if (jSONObject5.has("transports")) {
                    jSONArray = jSONArray3;
                    arrayList = new ArrayList();
                    JSONArray jSONArray4 = jSONObject5.getJSONArray("transports");
                    int length3 = jSONArray4.length();
                    int i5 = 0;
                    while (i5 < length3) {
                        try {
                            int i6 = i5;
                            arrayList.add(Transport.a(jSONArray4.getString(i5)));
                            i5 = i6 + 1;
                        } catch (h9t e) {
                            throw new as6(new o2(4), e.getMessage());
                        }
                    }
                } else {
                    jSONArray = jSONArray3;
                    arrayList = null;
                }
                arrayList3.add(new k0n(string6, decode2, arrayList));
                i4++;
                jSONArray3 = jSONArray;
                i = 11;
            }
        }
        LinkedHashMap linkedHashMap5 = i0n.a;
        String optString5 = jSONObject.optString("attestation", "none");
        optString5.getClass();
        lu1 a = lu1.a(optString5.length() != 0 ? optString5 : "none");
        Double valueOf = jSONObject.has("timeout") ? Double.valueOf(jSONObject.getLong("timeout") / 1000) : null;
        if (jSONObject.has("authenticatorSelection")) {
            JSONObject jSONObject6 = jSONObject.getJSONObject("authenticatorSelection");
            boolean optBoolean = jSONObject6.optBoolean("requireResidentKey", false);
            String optString6 = jSONObject6.optString("residentKey", "");
            optString6.getClass();
            z1o a2 = optString6.length() > 0 ? z1o.a(optString6) : null;
            Boolean valueOf2 = Boolean.valueOf(optBoolean);
            String optString7 = jSONObject6.optString("authenticatorAttachment", "");
            optString7.getClass();
            ju1 a3 = optString7.length() > 0 ? ju1.a(optString7) : null;
            zz1Var = null;
            s02Var = new s02(a3 == null ? null : a3.a, null, valueOf2, a2 == null ? null : a2.a);
        } else {
            zz1Var = null;
            s02Var = null;
        }
        if (jSONObject.has("extensions")) {
            JSONObject jSONObject7 = jSONObject.getJSONObject("extensions");
            String optString8 = jSONObject7.optString(AppsFlyerProperties.APP_ID, "");
            optString8.getClass();
            zz1Var2 = new zz1(optString8.length() > 0 ? new x8c(optString8) : zz1Var, null, jSONObject7.optBoolean("uvm", false) ? new ltt(true) : zz1Var, null, null, null, null, null, jSONObject7.optBoolean("thirdPartyPayment", false) ? new xnd(true) : zz1Var, null, null, null);
        } else {
            zz1Var2 = zz1Var;
        }
        return new j0n(m0nVar4, p0nVar, B, arrayList2, valueOf, arrayList3, s02Var, null, null, a.a, zz1Var2, null, null);
    }
}
