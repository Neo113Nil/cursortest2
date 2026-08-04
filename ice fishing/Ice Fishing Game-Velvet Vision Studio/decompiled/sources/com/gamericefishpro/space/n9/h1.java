package com.gamericefishpro.space.n9;

import android.app.BroadcastOptions;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.android.installreferrer.api.InstallReferrerClient;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class h1 implements v2 {
    public final /* synthetic */ int d;
    public final r1 e;

    public /* synthetic */ h1(r1 r1Var, int i) {
        this.d = i;
        this.e = r1Var;
    }

    @Override // com.gamericefishpro.space.n9.v2
    public void a(int i, Throwable th, byte[] bArr) {
        int i2;
        v0 v0Var;
        v0 v0Var2;
        r1 r1Var = this.e;
        v0 v0Var3 = r1Var.y;
        if (i != 200 && i != 204) {
            i2 = 304;
            if (i != 304) {
                i2 = i;
            }
            r1.l(v0Var3);
            v0Var3.B.c("Network Request for Deferred Deep Link failed. response, exception", Integer.valueOf(i2), th);
        }
        i2 = i;
        if (th == null) {
            f1 f1Var = r1Var.w;
            r1.j(f1Var);
            f1Var.M.b(true);
            if (bArr == null || bArr.length == 0) {
                r1.l(v0Var3);
                v0Var3.F.a("Deferred Deep Link response empty.");
                return;
            }
            try {
                JSONObject jSONObject = new JSONObject(new String(bArr));
                String strOptString = jSONObject.optString("deeplink", "");
                if (TextUtils.isEmpty(strOptString)) {
                    r1.l(v0Var3);
                    v0Var3.F.a("Deferred Deep Link is empty.");
                    return;
                }
                String strOptString2 = jSONObject.optString("gclid", "");
                String strOptString3 = jSONObject.optString("gbraid", "");
                String strOptString4 = jSONObject.optString("gad_source", "");
                double dOptDouble = jSONObject.optDouble("timestamp", 0.0d);
                Bundle bundle = new Bundle();
                r4 r4Var = r1Var.B;
                r1.j(r4Var);
                r1 r1Var2 = (r1) r4Var.d;
                if (TextUtils.isEmpty(strOptString)) {
                    v0Var2 = v0Var3;
                } else {
                    Context context = r1Var2.d;
                    v0Var2 = v0Var3;
                    try {
                        List<ResolveInfo> listQueryIntentActivities = context.getPackageManager().queryIntentActivities(new Intent("android.intent.action.VIEW", Uri.parse(strOptString)), 0);
                        if (listQueryIntentActivities != null && !listQueryIntentActivities.isEmpty()) {
                            if (!TextUtils.isEmpty(strOptString3)) {
                                bundle.putString("gbraid", strOptString3);
                            }
                            if (!TextUtils.isEmpty(strOptString4)) {
                                bundle.putString("gad_source", strOptString4);
                            }
                            bundle.putString("gclid", strOptString2);
                            bundle.putString("_cis", "ddp");
                            r1Var.F.y("auto", "_cmp", bundle);
                            if (TextUtils.isEmpty(strOptString)) {
                                return;
                            }
                            try {
                                SharedPreferences.Editor editorEdit = context.getSharedPreferences("google.analytics.deferred.deeplink.prefs", 0).edit();
                                editorEdit.putString("deeplink", strOptString);
                                editorEdit.putLong("timestamp", Double.doubleToRawLongBits(dOptDouble));
                                if (editorEdit.commit()) {
                                    Intent intent = new Intent("android.google.analytics.action.DEEPLINK_ACTION");
                                    Context context2 = r1Var2.d;
                                    if (Build.VERSION.SDK_INT < 34) {
                                        context2.sendBroadcast(intent);
                                        return;
                                    } else {
                                        context2.sendBroadcast(intent, null, BroadcastOptions.makeBasic().setShareIdentityEnabled(true).toBundle());
                                        return;
                                    }
                                }
                                return;
                            } catch (RuntimeException e) {
                                v0 v0Var4 = ((r1) r4Var.d).y;
                                r1.l(v0Var4);
                                v0Var4.y.b(e, "Failed to persist Deferred Deep Link. exception");
                                return;
                            }
                        }
                    } catch (JSONException e2) {
                        e = e2;
                        v0Var = v0Var2;
                        r1.l(v0Var);
                        v0Var.y.b(e, "Failed to parse the Deferred Deep Link response. exception");
                        return;
                    }
                }
                r1.l(v0Var2);
                v0Var = v0Var2;
                try {
                    v0Var.B.d("Deferred Deep Link validation failed. gclid, gbraid, deep link", strOptString2, strOptString3, strOptString);
                    return;
                } catch (JSONException e3) {
                    e = e3;
                    r1.l(v0Var);
                    v0Var.y.b(e, "Failed to parse the Deferred Deep Link response. exception");
                    return;
                }
            } catch (JSONException e4) {
                e = e4;
                v0Var = v0Var3;
            }
        }
        r1.l(v0Var3);
        v0Var3.B.c("Network Request for Deferred Deep Link failed. response, exception", Integer.valueOf(i2), th);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public boolean b() {
        switch (this.d) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                r1 r1Var = this.e;
                boolean z = false;
                try {
                    com.gamericefishpro.space.b9.b bVarA = com.gamericefishpro.space.b9.c.a(r1Var.d);
                    if (bVarA == null) {
                        v0 v0Var = r1Var.y;
                        r1.l(v0Var);
                        v0Var.G.a("Failed to get PackageManager for Install Referrer Play Store compatibility check");
                        r1Var = r1Var;
                    } else {
                        int i = bVarA.e(128, "com.android.vending").versionCode;
                        r1Var = i;
                        if (i >= 80837300) {
                            z = true;
                            r1Var = i;
                        }
                    }
                    break;
                } catch (Exception e) {
                    v0 v0Var2 = r1Var.y;
                    r1.l(v0Var2);
                    v0Var2.G.b(e, "Failed to retrieve Play Store version for Install Referrer");
                }
                return z;
            default:
                v0 v0Var3 = this.e.y;
                r1.l(v0Var3);
                return Log.isLoggable(v0Var3.B(), 3);
        }
    }

    public void c(String str, Bundle bundle) {
        String string;
        r1 r1Var = this.e;
        p1 p1Var = r1Var.z;
        f1 f1Var = r1Var.w;
        r1.l(p1Var);
        p1Var.r();
        if (r1Var.b()) {
            return;
        }
        if (bundle.isEmpty()) {
            string = null;
        } else {
            if (true == str.isEmpty()) {
                str = "auto";
            }
            Uri.Builder builder = new Uri.Builder();
            builder.path(str);
            for (String str2 : bundle.keySet()) {
                builder.appendQueryParameter(str2, bundle.getString(str2));
            }
            string = builder.build().toString();
        }
        if (TextUtils.isEmpty(string)) {
            return;
        }
        r1.j(f1Var);
        f1Var.P.e(string);
        d1 d1Var = f1Var.Q;
        r1Var.D.getClass();
        d1Var.b(System.currentTimeMillis());
    }

    public boolean d() {
        if (!e()) {
            return false;
        }
        r1 r1Var = this.e;
        r1Var.D.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        f1 f1Var = r1Var.w;
        r1.j(f1Var);
        return jCurrentTimeMillis - f1Var.Q.a() > r1Var.v.y(null, e0.j0);
    }

    public boolean e() {
        f1 f1Var = this.e.w;
        r1.j(f1Var);
        return f1Var.Q.a() > 0;
    }

    public h1(m4 m4Var) {
        this.d = 0;
        this.e = m4Var.E;
    }

    public h1(g2 g2Var, r1 r1Var) {
        this.d = 2;
        this.e = r1Var;
    }
}
