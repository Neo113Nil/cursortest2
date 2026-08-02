package defpackage;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import com.connectsdk.service.DeviceService;
import java.math.BigDecimal;
import java.util.Currency;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public abstract class ne2 {
    public static final mka a = new mka(j3c.b());

    public static final void a() {
        Context b = j3c.b();
        String c = j3c.c();
        boolean c2 = gtt.c();
        wxf.H(b, "context");
        if (c2) {
            if (!(b instanceof Application)) {
                Log.w("ne2", "Automatic logging of basic events will not happen, because FacebookSdk.getApplicationContext() returns object that is not instance of android.app.Application. Make sure you call FacebookSdk.sdkInitialize() from Application class and pass application context.");
                return;
            }
            Application application = (Application) b;
            if (!j3c.n.get()) {
                throw new c3c("The Facebook sdk must be initialized before calling activateApp");
            }
            if (!u80.c) {
                if (pt0.h() == null) {
                    y9w.J();
                }
                ScheduledThreadPoolExecutor h = pt0.h();
                if (h == null) {
                    xq0.q("Required value was null.");
                    return;
                }
                h.execute(q.d);
            }
            SharedPreferences sharedPreferences = ast.a;
            if (!bp6.a.contains(ast.class)) {
                try {
                    if (!ast.b.get()) {
                        ast.e.b();
                    }
                } catch (Throwable th) {
                    bp6.a(ast.class, th);
                }
            }
            Set set = bp6.a;
            if (!set.contains(j3c.class)) {
                try {
                    j3c.d().execute(new h3c(application.getApplicationContext(), c, 0));
                    if (x6c.b(v6c.OnDeviceEventProcessing) && wpj.a() && !set.contains(wpj.class)) {
                        try {
                            Context b2 = j3c.b();
                            if (b2 != null) {
                                j3c.d().execute(new h3c(b2, c, 1));
                            }
                        } catch (Throwable th2) {
                            bp6.a(wpj.class, th2);
                        }
                    }
                } catch (Throwable th3) {
                    bp6.a(j3c.class, th3);
                }
            }
            oh.c(application, c);
        }
    }

    public static final void b(long j, String str) {
        Context b = j3c.b();
        String c = j3c.c();
        wxf.H(b, "context");
        n8c f = q8c.f(c, false);
        if (f == null || !f.d || j <= 0) {
            return;
        }
        pt0 pt0Var = new pt0(b, (String) null);
        Bundle bundle = new Bundle(1);
        bundle.putCharSequence("fb_aa_time_spent_view_name", str);
        double d = j;
        if (!gtt.c() || bp6.a.contains(pt0Var)) {
            return;
        }
        try {
            pt0Var.y("fb_aa_time_spent_on_view", Double.valueOf(d), bundle, false, oh.b());
        } catch (Throwable th) {
            bp6.a(pt0Var, th);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:51:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void c(String str, String str2, boolean z) {
        osh oshVar;
        String optString;
        String str3;
        str2.getClass();
        n8c b = q8c.b(j3c.c());
        if (b == null || !gtt.c() || !b.f) {
            return;
        }
        HashMap hashMap = new HashMap();
        try {
            JSONObject jSONObject = new JSONObject(str);
            JSONObject jSONObject2 = new JSONObject(str2);
            Bundle bundle = new Bundle(1);
            bundle.putCharSequence("fb_iap_product_id", jSONObject.getString("productId"));
            bundle.putCharSequence("fb_iap_purchase_time", jSONObject.getString("purchaseTime"));
            bundle.putCharSequence("fb_iap_purchase_token", jSONObject.getString("purchaseToken"));
            bundle.putCharSequence("fb_iap_package_name", jSONObject.optString("packageName"));
            bundle.putCharSequence("fb_iap_product_title", jSONObject2.optString("title"));
            bundle.putCharSequence("fb_iap_product_description", jSONObject2.optString(DeviceService.KEY_DESC));
            String optString2 = jSONObject2.optString("type");
            bundle.putCharSequence("fb_iap_product_type", optString2);
            if (Intrinsics.d(optString2, "subs")) {
                bundle.putCharSequence("fb_iap_subs_auto_renewing", Boolean.toString(jSONObject.optBoolean("autoRenewing", false)));
                bundle.putCharSequence("fb_iap_subs_period", jSONObject2.optString("subscriptionPeriod"));
                bundle.putCharSequence("fb_free_trial_period", jSONObject2.optString("freeTrialPeriod"));
                String optString3 = jSONObject2.optString("introductoryPriceCycles");
                optString3.getClass();
                if (optString3.length() != 0) {
                    bundle.putCharSequence("fb_intro_price_amount_micros", jSONObject2.optString("introductoryPriceAmountMicros"));
                    bundle.putCharSequence("fb_intro_price_cycles", optString3);
                }
            }
            for (Map.Entry entry : hashMap.entrySet()) {
                bundle.putCharSequence((String) entry.getKey(), (String) entry.getValue());
            }
            BigDecimal bigDecimal = new BigDecimal(jSONObject2.getLong("price_amount_micros") / 1000000.0d);
            Currency currency = Currency.getInstance(jSONObject2.getString("price_currency_code"));
            currency.getClass();
            oshVar = new osh();
            oshVar.a = bigDecimal;
            oshVar.b = currency;
            oshVar.c = bundle;
        } catch (JSONException e) {
            Log.e("ne2", "Error parsing in-app subscription data.", e);
            oshVar = null;
        }
        if (oshVar == null) {
            return;
        }
        Bundle bundle2 = (Bundle) oshVar.c;
        Currency currency2 = (Currency) oshVar.b;
        BigDecimal bigDecimal2 = (BigDecimal) oshVar.a;
        mka mkaVar = a;
        if (!z || !m8c.b("app_events_if_auto_log_subs", j3c.c(), false)) {
            mkaVar.getClass();
            HashSet hashSet = j3c.a;
            if (gtt.c()) {
                pt0 pt0Var = (pt0) mkaVar.a;
                pt0Var.getClass();
                if (bp6.a.contains(pt0Var)) {
                    return;
                }
                try {
                    pt0Var.A(bigDecimal2, currency2, bundle2);
                    return;
                } catch (Throwable th) {
                    bp6.a(pt0Var, th);
                    return;
                }
            }
            return;
        }
        tee teeVar = tee.f;
        if (!bp6.a.contains(teeVar)) {
            try {
                optString = new JSONObject(str2).optString("freeTrialPeriod");
            } catch (JSONException unused) {
            } catch (Throwable th2) {
                bp6.a(teeVar, th2);
            }
            if (optString != null) {
                if (optString.length() > 0) {
                    str3 = "StartTrial";
                    String str4 = str3;
                    mkaVar.getClass();
                    HashSet hashSet2 = j3c.a;
                    if (gtt.c()) {
                        return;
                    }
                    pt0 pt0Var2 = (pt0) mkaVar.a;
                    pt0Var2.getClass();
                    if (bp6.a.contains(pt0Var2) || bigDecimal2 == null || currency2 == null) {
                        return;
                    }
                    if (bundle2 == null) {
                        try {
                            bundle2 = new Bundle();
                        } catch (Throwable th3) {
                            bp6.a(pt0Var2, th3);
                            return;
                        }
                    }
                    Bundle bundle3 = bundle2;
                    bundle3.putString("fb_currency", currency2.getCurrencyCode());
                    pt0Var2.y(str4, Double.valueOf(bigDecimal2.doubleValue()), bundle3, true, oh.b());
                    return;
                }
            }
        }
        str3 = "Subscribe";
        String str42 = str3;
        mkaVar.getClass();
        HashSet hashSet22 = j3c.a;
        if (gtt.c()) {
        }
    }
}
