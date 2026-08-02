package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import com.yandex.passport.data.network.l;
import com.yandex.passport.internal.social.FbNativeSocialAuthActivity;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import io.appmetrica.analytics.rtm.internal.Constants;
import java.io.IOException;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class xtg {
    public static final Set b;
    public static final String c;
    public static volatile xtg d;
    public final SharedPreferences a;

    static {
        jtg jtgVar = new jtg();
        jtgVar.add("ads_management");
        jtgVar.add("create_event");
        jtgVar.add("rsvp_event");
        b = Collections.unmodifiableSet(jtgVar);
        c = xtg.class.toString();
    }

    public xtg() {
        wxf.J();
        this.a = j3c.b().getSharedPreferences("com.facebook.loginManager", 0);
        if (!j3c.k || ox6.F() == null) {
            return;
        }
        kx6 kx6Var = new kx6();
        Context b2 = j3c.b();
        kx6Var.a = b2.getApplicationContext();
        Intent intent = new Intent("android.support.customtabs.action.CustomTabsService");
        if (!TextUtils.isEmpty("com.android.chrome")) {
            intent.setPackage("com.android.chrome");
        }
        b2.bindService(intent, kx6Var, 33);
        Context b3 = j3c.b();
        String packageName = j3c.b().getPackageName();
        if (packageName == null) {
            return;
        }
        Context applicationContext = b3.getApplicationContext();
        px6 px6Var = new px6(applicationContext);
        try {
            px6Var.a = applicationContext.getApplicationContext();
            Intent intent2 = new Intent("android.support.customtabs.action.CustomTabsService");
            if (!TextUtils.isEmpty(packageName)) {
                intent2.setPackage(packageName);
            }
            applicationContext.bindService(intent2, px6Var, 33);
        } catch (SecurityException unused) {
        }
    }

    public static xtg a() {
        if (d == null) {
            synchronized (xtg.class) {
                try {
                    if (d == null) {
                        d = new xtg();
                    }
                } finally {
                }
            }
        }
        return d;
    }

    public static boolean b(String str) {
        if (str != null) {
            return str.startsWith("publish") || str.startsWith("manage") || b.contains(str);
        }
        return false;
    }

    public static void c(FbNativeSocialAuthActivity fbNativeSocialAuthActivity, int i, Map map, c3c c3cVar, boolean z, atg atgVar) {
        gtg o = ltg.o(fbNativeSocialAuthActivity);
        if (o == null) {
            return;
        }
        if (atgVar == null) {
            if (bp6.a.contains(o)) {
                return;
            }
            try {
                o.a("fb_mobile_login_complete", "");
                return;
            } catch (Throwable th) {
                bp6.a(o, th);
                return;
            }
        }
        HashMap hashMap = new HashMap();
        hashMap.put("try_login_activity", z ? "1" : CommonUrlParts.Values.FALSE_INTEGER);
        String str = atgVar.e;
        String str2 = atgVar.m ? "foa_mobile_login_complete" : "fb_mobile_login_complete";
        if (bp6.a.contains(o)) {
            return;
        }
        try {
            Bundle b2 = gtg.b(str);
            if (i != 0) {
                b2.putString("2_result", hrg.d(i));
            }
            if (c3cVar != null && c3cVar.getMessage() != null) {
                b2.putString("5_error_message", c3cVar.getMessage());
            }
            JSONObject jSONObject = !hashMap.isEmpty() ? new JSONObject(hashMap) : null;
            if (map != null) {
                if (jSONObject == null) {
                    jSONObject = new JSONObject();
                }
                try {
                    for (Map.Entry entry : map.entrySet()) {
                        jSONObject.put((String) entry.getKey(), entry.getValue());
                    }
                } catch (JSONException unused) {
                }
            }
            if (jSONObject != null) {
                b2.putString("6_extras", jSONObject.toString());
            }
            o.a.l(b2, str2);
            if (i != 1 || bp6.a.contains(o)) {
                return;
            }
            try {
                gtg.d.schedule(new pv7(21, o, gtg.b(str)), 5L, TimeUnit.SECONDS);
            } catch (Throwable th2) {
                bp6.a(o, th2);
            }
        } catch (Throwable th3) {
            bp6.a(o, th3);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void d(int i, Intent intent, l lVar) {
        c3c c3cVar;
        ja jaVar;
        HashMap hashMap;
        atg atgVar;
        int i2;
        boolean z;
        j02 j02Var;
        HashMap hashMap2;
        atg atgVar2;
        ja jaVar2;
        Parcelable parcelable;
        boolean z2;
        dug dugVar = null;
        int i3 = 3;
        if (intent != null) {
            btg btgVar = (btg) intent.getParcelableExtra("com.facebook.LoginFragment:Result");
            if (btgVar != null) {
                atg atgVar3 = btgVar.f;
                int i4 = btgVar.a;
                if (i == -1) {
                    if (i4 == 1) {
                        ja jaVar3 = btgVar.b;
                        z2 = false;
                        parcelable = btgVar.c;
                        jaVar2 = jaVar3;
                        c3cVar = null;
                        hashMap2 = btgVar.g;
                        atgVar2 = atgVar3;
                        i3 = i4;
                    } else {
                        c3cVar = new z2c(btgVar.d);
                        jaVar2 = null;
                        parcelable = jaVar2;
                        z2 = false;
                        hashMap2 = btgVar.g;
                        atgVar2 = atgVar3;
                        i3 = i4;
                    }
                } else if (i == 0) {
                    z2 = true;
                    c3cVar = null;
                    jaVar2 = null;
                    parcelable = null;
                    hashMap2 = btgVar.g;
                    atgVar2 = atgVar3;
                    i3 = i4;
                } else {
                    c3cVar = null;
                    jaVar2 = null;
                    parcelable = jaVar2;
                    z2 = false;
                    hashMap2 = btgVar.g;
                    atgVar2 = atgVar3;
                    i3 = i4;
                }
            } else {
                c3cVar = null;
                hashMap2 = null;
                atgVar2 = null;
                jaVar2 = null;
                parcelable = null;
                z2 = false;
            }
            Parcelable parcelable2 = parcelable;
            hashMap = hashMap2;
            jaVar = jaVar2;
            i2 = i3;
            j02Var = parcelable2;
            atgVar = atgVar2;
            z = z2;
        } else {
            if (i == 0) {
                z = true;
                c3cVar = null;
                jaVar = null;
                hashMap = null;
                atgVar = null;
                i2 = 2;
            } else {
                c3cVar = null;
                jaVar = null;
                hashMap = null;
                atgVar = null;
                i2 = 3;
                z = false;
            }
            j02Var = atgVar;
        }
        if (c3cVar == null && jaVar == null && !z) {
            c3cVar = new c3c("Unexpected call to LoginManager.onActivityResult");
        }
        c3c c3cVar2 = c3cVar;
        c(null, i2, hashMap, c3cVar2, true, atgVar);
        if (jaVar != null) {
            Date date = ja.l;
            gs4.i.o().V(jaVar, true);
            ja N = n7w.N();
            if (N != null) {
                if (n7w.P()) {
                    gvt.r(new l3l(), N.e);
                } else {
                    nsh.o.f().N(null, true);
                }
            }
        }
        if (j02Var != 0) {
            j02.a(j02Var);
        }
        if (lVar != null) {
            FbNativeSocialAuthActivity fbNativeSocialAuthActivity = (FbNativeSocialAuthActivity) lVar.a;
            if (jaVar != null) {
                Set set = atgVar.b;
                HashSet hashSet = new HashSet(jaVar.b);
                if (atgVar.f) {
                    hashSet.retainAll(set);
                }
                HashSet hashSet2 = new HashSet(set);
                hashSet2.removeAll(hashSet);
                dugVar = new dug(jaVar, j02Var, hashSet, hashSet2);
            }
            if (z || (dugVar != null && dugVar.c.size() == 0)) {
                int i5 = FbNativeSocialAuthActivity.b;
                fbNativeSocialAuthActivity.setResult(0);
                fbNativeSocialAuthActivity.finish();
                return;
            }
            if (c3cVar2 != null) {
                if (c3cVar2.getMessage() == null || !c3cVar2.getMessage().startsWith("net::")) {
                    int i6 = FbNativeSocialAuthActivity.b;
                    Log.e("FbNativeSocialAuthActivity", "Error native auth", c3cVar2);
                    Intent intent2 = new Intent();
                    intent2.putExtra(Constants.KEY_EXCEPTION, c3cVar2);
                    fbNativeSocialAuthActivity.setResult(0, intent2);
                    fbNativeSocialAuthActivity.finish();
                    return;
                }
                IOException iOException = new IOException(c3cVar2);
                int i7 = FbNativeSocialAuthActivity.b;
                Log.e("FbNativeSocialAuthActivity", "Error native auth", iOException);
                Intent intent3 = new Intent();
                intent3.putExtra(Constants.KEY_EXCEPTION, iOException);
                fbNativeSocialAuthActivity.setResult(0, intent3);
                fbNativeSocialAuthActivity.finish();
                return;
            }
            if (jaVar != null) {
                SharedPreferences.Editor edit = this.a.edit();
                edit.putBoolean("express_login_allowed", true);
                edit.apply();
                ja jaVar4 = dugVar.a;
                String str = jaVar4.e;
                String str2 = jaVar4.h;
                int i8 = FbNativeSocialAuthActivity.b;
                Intent intent4 = new Intent();
                intent4.putExtra("social-token", str);
                intent4.putExtra("application-id", str2);
                fbNativeSocialAuthActivity.setResult(-1, intent4);
                fbNativeSocialAuthActivity.finish();
            }
        }
    }
}
