package defpackage;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import com.connectsdk.device.ConnectableDevice;
import io.appmetrica.analytics.rtm.internal.Constants;
import java.util.LinkedHashMap;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class ts6 extends vs6 {
    public final Context d;
    public ls6 e;
    public Executor f;
    public CancellationSignal g;
    public final ss6 h;

    public ts6(Context context) {
        context.getClass();
        this.d = context;
        this.h = new ss6(this, new Handler(Looper.getMainLooper()), 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final o7d d(sfq sfqVar) {
        c3x c3xVar;
        o02 o02Var;
        String jSONObject;
        String str = sfqVar.f;
        g0n g0nVar = sfqVar.i;
        String str2 = sfqVar.g;
        String str3 = sfqVar.a;
        if (str != null) {
            str3.getClass();
            str.getClass();
            Bundle bundle = new Bundle();
            bundle.putString("androidx.credentials.BUNDLE_KEY_ID", str3);
            bundle.putString("androidx.credentials.BUNDLE_KEY_PASSWORD", str);
            c3xVar = new z9k(str3, str, bundle);
        } else {
            JSONObject jSONObject2 = null;
            if (str2 != null) {
                str3.getClass();
                String str4 = sfqVar.b;
                if (str4 == null) {
                    str4 = null;
                }
                String str5 = sfqVar.c;
                if (str5 == null) {
                    str5 = null;
                }
                String str6 = sfqVar.d;
                if (str6 == null) {
                    str6 = null;
                }
                String str7 = sfqVar.h;
                if (str7 == null) {
                    str7 = null;
                }
                Uri uri = sfqVar.e;
                if (uri == null) {
                    uri = null;
                }
                str3.getClass();
                str2.getClass();
                Bundle bundle2 = new Bundle();
                bundle2.putString("com.google.android.libraries.identity.googleid.BUNDLE_KEY_ID", str3);
                bundle2.putString("com.google.android.libraries.identity.googleid.BUNDLE_KEY_ID_TOKEN", str2);
                bundle2.putString("com.google.android.libraries.identity.googleid.BUNDLE_KEY_DISPLAY_NAME", str4);
                bundle2.putString("com.google.android.libraries.identity.googleid.BUNDLE_KEY_FAMILY_NAME", str6);
                bundle2.putString("com.google.android.libraries.identity.googleid.BUNDLE_KEY_GIVEN_NAME", str5);
                bundle2.putString("com.google.android.libraries.identity.googleid.BUNDLE_KEY_PHONE_NUMBER", str7);
                bundle2.putParcelable("com.google.android.libraries.identity.googleid.BUNDLE_KEY_PROFILE_PICTURE_URI", uri);
                c3x cndVar = new cnd(bundle2, "com.google.android.libraries.identity.googleid.TYPE_GOOGLE_ID_TOKEN_CREDENTIAL");
                if (str3.length() <= 0) {
                    xq0.x("id should not be empty");
                    throw null;
                }
                if (str2.length() <= 0) {
                    xq0.x("idToken should not be empty");
                    throw null;
                }
                c3xVar = cndVar;
            } else if (g0nVar != null) {
                o02 o02Var2 = g0nVar.f;
                m02 m02Var = g0nVar.e;
                n02 n02Var = g0nVar.d;
                LinkedHashMap linkedHashMap = i0n.a;
                JSONObject jSONObject3 = new JSONObject();
                if (n02Var != 0) {
                    o02Var = n02Var;
                } else if (m02Var != 0) {
                    o02Var = m02Var;
                } else {
                    if (o02Var2 == null) {
                        xq0.q("No response set.");
                        return null;
                    }
                    o02Var = o02Var2;
                }
                boolean z = true;
                if (o02Var instanceof o02) {
                    o02 o02Var3 = o02Var;
                    bfb bfbVar = o02Var3.a;
                    bfbVar.getClass();
                    String str8 = o02Var3.b;
                    o2 o2Var = (o2) i0n.a.get(bfbVar);
                    if (o2Var == null) {
                        throw new sad(new o2(26), f1d.g("unknown fido gms exception - ", str8));
                    }
                    if (bfbVar == bfb.NOT_ALLOWED_ERR && str8 != null && StringsKt.M(str8, "Unable to get sync account", false)) {
                        throw new l7d(0, "Passkey retrieval was cancelled by the user.");
                    }
                    throw new sad(o2Var, str8);
                }
                if (o02Var instanceof m02) {
                    try {
                        obx obxVar = g0nVar.c;
                        try {
                            JSONObject jSONObject4 = new JSONObject();
                            if (obxVar != null && obxVar.u().length > 0) {
                                jSONObject4.put("rawId", vq1.M(obxVar.u()));
                            }
                            String str9 = g0nVar.h;
                            if (str9 != null) {
                                jSONObject4.put("authenticatorAttachment", str9);
                            }
                            String str10 = g0nVar.b;
                            if (str10 != null && o02Var2 == null) {
                                jSONObject4.put("type", str10);
                            }
                            String str11 = g0nVar.a;
                            if (str11 != null) {
                                jSONObject4.put(ConnectableDevice.KEY_ID, str11);
                            }
                            String str12 = "response";
                            if (m02Var != 0) {
                                jSONObject2 = m02Var.d();
                            } else if (n02Var != 0) {
                                jSONObject2 = n02Var.d();
                            } else {
                                if (o02Var2 != null) {
                                    try {
                                        jSONObject2 = new JSONObject();
                                        jSONObject2.put("code", o02Var2.a.a);
                                        String str13 = o02Var2.b;
                                        if (str13 != null) {
                                            jSONObject2.put(Constants.KEY_MESSAGE, str13);
                                        }
                                        str12 = "error";
                                    } catch (JSONException e) {
                                        throw new RuntimeException("Error encoding AuthenticatorErrorResponse to JSON object", e);
                                    }
                                }
                                z = false;
                            }
                            if (jSONObject2 != null) {
                                jSONObject4.put(str12, jSONObject2);
                            }
                            a02 a02Var = g0nVar.g;
                            if (a02Var != null) {
                                jSONObject4.put("clientExtensionResults", a02Var.d());
                            } else if (z) {
                                jSONObject4.put("clientExtensionResults", new JSONObject());
                            }
                            jSONObject = jSONObject4.toString();
                            jSONObject.getClass();
                        } catch (JSONException e2) {
                            throw new RuntimeException("Error encoding PublicKeyCredential to JSON object", e2);
                        }
                    } catch (Throwable th) {
                        throw new l7d(4, su4.p(th, new StringBuilder("The PublicKeyCredential response json had an unexpected exception when parsing: ")));
                    }
                } else {
                    Log.e("PublicKeyUtility", "AuthenticatorResponse expected assertion response but got: ".concat(o02Var.getClass().getName()));
                    jSONObject = jSONObject3.toString();
                    jSONObject.getClass();
                }
                Bundle bundle3 = new Bundle();
                bundle3.putString("androidx.credentials.BUNDLE_KEY_AUTHENTICATION_RESPONSE_JSON", jSONObject);
                c3xVar = new h0n(bundle3, jSONObject);
            } else {
                Log.w("BeginSignIn", "Credential returned but no google Id or password or passkey found");
                c3xVar = null;
            }
        }
        if (c3xVar != null) {
            return new o7d(c3xVar);
        }
        throw new l7d(4, "When attempting to convert get response, null credential found");
    }

    public final ls6 e() {
        ls6 ls6Var = this.e;
        if (ls6Var != null) {
            return ls6Var;
        }
        Intrinsics.j("callback");
        throw null;
    }

    public final Executor f() {
        Executor executor = this.f;
        if (executor != null) {
            return executor;
        }
        Intrinsics.j("executor");
        throw null;
    }
}
