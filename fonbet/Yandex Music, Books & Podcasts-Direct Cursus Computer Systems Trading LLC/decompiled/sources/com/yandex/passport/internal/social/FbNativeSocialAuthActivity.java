package com.yandex.passport.internal.social;

import android.app.Application;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.connectsdk.service.command.ServiceCommand;
import com.facebook.FacebookActivity;
import com.yandex.passport.data.network.l;
import com.yandex.passport.social.facebook.R;
import defpackage.atg;
import defpackage.bp6;
import defpackage.c3c;
import defpackage.eta;
import defpackage.ett;
import defpackage.ge4;
import defpackage.gs4;
import defpackage.gtg;
import defpackage.gtt;
import defpackage.hq0;
import defpackage.hrg;
import defpackage.itg;
import defpackage.j02;
import defpackage.j3c;
import defpackage.ja;
import defpackage.ktg;
import defpackage.ltg;
import defpackage.mka;
import defpackage.n7w;
import defpackage.nsh;
import defpackage.phn;
import defpackage.pt0;
import defpackage.su4;
import defpackage.ts3;
import defpackage.us3;
import defpackage.vz1;
import defpackage.xq0;
import defpackage.xtg;
import defpackage.yhn;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import kotlin.collections.CollectionsKt;
import kotlin.ranges.IntRange;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class FbNativeSocialAuthActivity extends hq0 {
    public static final /* synthetic */ int b = 0;
    public final us3 a = new us3();

    @Override // androidx.fragment.app.t, defpackage.hn5, android.app.Activity
    public final void onActivityResult(int i, int i2, Intent intent) {
        ts3 ts3Var;
        super.onActivityResult(i, i2, intent);
        ts3 ts3Var2 = (ts3) this.a.a.get(Integer.valueOf(i));
        if (ts3Var2 != null) {
            ts3Var2.a(i2, intent);
            return;
        }
        synchronized (us3.c) {
            ts3Var = (ts3) us3.b.get(Integer.valueOf(i));
        }
        if (ts3Var != null) {
            ts3Var.a(i2, intent);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x02e2  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0194  */
    @Override // androidx.fragment.app.t, defpackage.hn5, androidx.core.app.i, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onCreate(Bundle bundle) {
        boolean z;
        super.onCreate(bundle);
        HashSet hashSet = j3c.a;
        gtt gttVar = gtt.i;
        if (!bp6.a.contains(gtt.class)) {
            try {
                ett ettVar = gtt.d;
                ettVar.a = Boolean.FALSE;
                ettVar.b = System.currentTimeMillis();
                if (gtt.a.get()) {
                    gttVar.k(ettVar);
                } else {
                    gttVar.e();
                }
            } catch (Throwable th) {
                bp6.a(gtt.class, th);
            }
        }
        Application application = getApplication();
        synchronized (j3c.class) {
            application.getClass();
            j3c.k(application);
        }
        xtg a = xtg.a();
        us3 us3Var = this.a;
        l lVar = new l(this);
        a.getClass();
        if (us3Var == null) {
            throw new c3c("Unexpected CallbackManager, please use the provided Factory.");
        }
        us3Var.a.put(Integer.valueOf(vz1.b(1)), new itg(a, lVar));
        if (bundle != null) {
            return;
        }
        List<String> asList = Arrays.asList(getResources().getStringArray(R.array.passport_facebook_scopes));
        xtg a2 = xtg.a();
        a2.getClass();
        Date date = ja.l;
        gs4.i.o().V(null, true);
        j02.a(null);
        nsh.o.f().N(null, true);
        SharedPreferences.Editor edit = a2.a.edit();
        edit.putBoolean("express_login_allowed", false);
        edit.apply();
        xtg a3 = xtg.a();
        a3.getClass();
        if (asList != null) {
            for (String str : asList) {
                if (xtg.b(str)) {
                    throw new c3c(hrg.q("Cannot pass a publish or manage permission (", str, ") to a request for read authorization"));
                }
            }
        }
        String e = eta.e();
        int j = yhn.j(new IntRange(43, 128, 1), phn.a);
        ArrayList h0 = CollectionsKt.h0(CollectionsKt.h0(CollectionsKt.h0(CollectionsKt.h0(CollectionsKt.g0(CollectionsKt.f0(new ge4('a', 'z'), new ge4('A', 'Z')), new ge4('0', '9')), '-'), '.'), '_'), '~');
        ArrayList arrayList = new ArrayList(j);
        for (int i = 0; i < j; i++) {
            Character ch = (Character) CollectionsKt.i0(h0, phn.a);
            ch.getClass();
            arrayList.add(ch);
        }
        String X = CollectionsKt.X(arrayList, "", null, null, null, 62);
        if (e.length() == 0 ? false : !(StringsKt.S(e, ' ', 0, 6) >= 0)) {
            if ((X.length() != 0 && X.length() >= 43 && X.length() <= 128) ? new Regex("^[-._~A-Za-z0-9]+$").e(X) : false) {
                z = true;
                if (z) {
                    xq0.x("Failed requirement.");
                    return;
                }
                HashSet hashSet2 = asList != null ? new HashSet(asList) : new HashSet();
                hashSet2.add("openid");
                Set unmodifiableSet = Collections.unmodifiableSet(hashSet2);
                unmodifiableSet.getClass();
                Log.w(xtg.c, "You're calling logging in Facebook with an activity supports androidx activity result APIs. Please follow our document to upgrade to new APIs to avoid overriding onActivityResult().");
                atg atgVar = new atg(Collections.unmodifiableSet(new HashSet(unmodifiableSet)), j3c.c(), UUID.randomUUID().toString(), e);
                Date date2 = ja.l;
                atgVar.f = n7w.P();
                atgVar.j = null;
                atgVar.k = false;
                atgVar.m = false;
                atgVar.n = false;
                gtg o = ltg.o(this);
                if (o != null) {
                    String str2 = atgVar.m ? "foa_mobile_login_start" : "fb_mobile_login_start";
                    if (!bp6.a.contains(o)) {
                        try {
                            Bundle b2 = gtg.b(atgVar.e);
                            try {
                                JSONObject jSONObject = new JSONObject();
                                jSONObject.put("login_behavior", "NATIVE_WITH_FALLBACK");
                                jSONObject.put("request_code", vz1.b(1));
                                jSONObject.put("permissions", TextUtils.join(StringUtils.COMMA, atgVar.b));
                                jSONObject.put("default_audience", su4.y(atgVar.c));
                                jSONObject.put("isReauthorize", atgVar.f);
                                String str3 = o.c;
                                if (str3 != null) {
                                    jSONObject.put("facebookVersion", str3);
                                }
                                int i2 = atgVar.l;
                                if (i2 != 0) {
                                    jSONObject.put("target_app", hrg.e(i2));
                                }
                                b2.putString("6_extras", jSONObject.toString());
                            } catch (JSONException unused) {
                            }
                            mka mkaVar = o.a;
                            mkaVar.getClass();
                            HashSet hashSet3 = j3c.a;
                            if (gtt.c()) {
                                ((pt0) mkaVar.a).z(b2, str2);
                            }
                        } catch (Throwable th2) {
                            bp6.a(o, th2);
                        }
                    }
                }
                int b3 = vz1.b(1);
                ktg ktgVar = new ktg(a3);
                HashMap hashMap = us3.b;
                synchronized (us3.class) {
                    synchronized (us3.c) {
                        HashMap hashMap2 = us3.b;
                        if (!hashMap2.containsKey(Integer.valueOf(b3))) {
                            hashMap2.put(Integer.valueOf(b3), ktgVar);
                        }
                    }
                }
                Intent intent = new Intent();
                intent.setClass(j3c.b(), FacebookActivity.class);
                intent.setAction(hrg.C(atgVar.a));
                Bundle bundle2 = new Bundle();
                bundle2.putParcelable(ServiceCommand.TYPE_REQ, atgVar);
                intent.putExtra("com.facebook.LoginFragment:Request", bundle2);
                if (j3c.b().getPackageManager().resolveActivity(intent, 0) != null) {
                    try {
                        startActivityForResult(intent, vz1.b(1));
                        return;
                    } catch (ActivityNotFoundException unused2) {
                    }
                }
                c3c c3cVar = new c3c("Log in attempt failed: FacebookActivity could not be started. Please make sure you added FacebookActivity to the AndroidManifest.");
                xtg.c(this, 3, null, c3cVar, false, atgVar);
                throw c3cVar;
            }
        }
        z = false;
        if (z) {
        }
    }
}
