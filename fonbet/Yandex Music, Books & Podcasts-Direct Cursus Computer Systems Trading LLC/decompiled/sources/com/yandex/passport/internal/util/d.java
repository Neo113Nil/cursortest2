package com.yandex.passport.internal.util;

import android.accounts.Account;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Base64;
import com.connectsdk.service.webos.lgcast.remotecamera.RemoteCameraConfig;
import com.yandex.auth.LegacyAccountType;
import com.yandex.passport.internal.entities.s;
import defpackage.dfi;
import defpackage.f1d;
import defpackage.hrg;
import defpackage.kwf;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class d {
    public static final kwf h = new kwf();
    public final String a;
    public final PackageManager b;
    public final com.yandex.passport.common.analytics.k c;
    public final com.yandex.passport.internal.core.accounts.k d;
    public final com.yandex.passport.internal.core.accounts.e e;
    public final com.yandex.passport.internal.flags.experiments.i f;
    public final com.yandex.passport.internal.network.mappers.d g;

    public d(String str, PackageManager packageManager, com.yandex.passport.common.analytics.k kVar, com.yandex.passport.internal.core.accounts.k kVar2, com.yandex.passport.internal.core.accounts.e eVar, com.yandex.passport.internal.flags.experiments.i iVar, com.yandex.passport.internal.network.mappers.d dVar) {
        this.a = str;
        this.b = packageManager;
        this.c = kVar;
        this.d = kVar2;
        this.e = eVar;
        this.f = iVar;
        this.g = dVar;
    }

    public final String a() {
        String str;
        String q;
        ApplicationInfo applicationInfo;
        PackageInfo packageInfo;
        String str2;
        JSONObject jSONObject;
        Iterator<ResolveInfo> it;
        String str3;
        String str4;
        List list;
        String str5 = "Name not found: ";
        Intent intent = new Intent();
        intent.setAction("com.yandex.accounts.AccountAuthenticator");
        ApplicationInfo applicationInfo2 = null;
        intent.setPackage(null);
        PackageManager packageManager = this.b;
        List<ResolveInfo> queryIntentServices = packageManager.queryIntentServices(intent, RemoteCameraConfig.Mic.BUFFER_SIZE);
        JSONArray jSONArray = new JSONArray();
        JSONObject jSONObject2 = new JSONObject();
        HashMap hashMap = new HashMap();
        ArrayList arrayList = new ArrayList();
        Iterator<ResolveInfo> it2 = queryIntentServices.iterator();
        while (true) {
            String str6 = "unknown";
            if (!it2.hasNext()) {
                break;
            }
            String str7 = it2.next().serviceInfo.packageName;
            try {
                applicationInfo = packageManager.getApplicationInfo(str7, 128);
            } catch (PackageManager.NameNotFoundException e) {
                com.yandex.passport.legacy.a.e(6, f1d.g(str5, str7), e);
                applicationInfo = applicationInfo2;
            }
            try {
                packageInfo = packageManager.getPackageInfo(str7, 8);
            } catch (PackageManager.NameNotFoundException e2) {
                com.yandex.passport.legacy.a.e(6, f1d.g(str5, str7), e2);
                packageInfo = null;
            }
            kwf kwfVar = h;
            if (applicationInfo != null) {
                String charSequence = packageManager.getApplicationLabel(applicationInfo).toString();
                Bundle bundle = applicationInfo.metaData;
                if (bundle != null) {
                    str2 = str5;
                    int i = bundle.getInt("com.yandex.auth.INTERNAL_VERSION", -1);
                    it = it2;
                    int i2 = bundle.getInt("com.yandex.auth.INTERNAL_BUILD_NUMBER", -1);
                    jSONObject = jSONObject2;
                    float f = bundle.getFloat("com.yandex.auth.VERSION", -1.0f);
                    kwfVar = i == -1 ? f != -1.0f ? new kwf(f) : kwfVar : new kwf(i, i2);
                } else {
                    str2 = str5;
                    jSONObject = jSONObject2;
                    it = it2;
                }
                str3 = charSequence;
            } else {
                str2 = str5;
                jSONObject = jSONObject2;
                it = it2;
                str3 = "<unknown>";
            }
            if (packageInfo != null) {
                str4 = packageInfo.versionName;
                str6 = packageInfo.packageName;
            } else {
                str4 = "<unknown>";
            }
            JSONObject jSONObject3 = new JSONObject();
            JSONObject jSONObject4 = new JSONObject();
            jSONObject4.put("manifest", kwfVar.toString());
            JSONObject put = jSONObject3.put("label", str3).put("application_id", str6).put("version", str4).put("amVersions", jSONObject4);
            JSONArray jSONArray2 = new JSONArray();
            try {
                byte[] bArr = s.c;
                Iterator it3 = com.yandex.plus.core.network.api.utils.a.q(packageManager, str7).a.iterator();
                while (it3.hasNext()) {
                    jSONArray2.put(Base64.encodeToString((byte[]) it3.next(), 2));
                }
            } catch (PackageManager.NameNotFoundException | NoSuchAlgorithmException e3) {
                com.yandex.passport.legacy.a.e(6, "Failed to calculate signature", e3);
                jSONArray2.put("<unknown>");
            }
            put.put("signatures", jSONArray2);
            try {
                byte[] bArr2 = s.c;
                String encodeToString = Base64.encodeToString(com.yandex.plus.core.network.api.utils.a.q(packageManager, str7).b(), 2);
                encodeToString.getClass();
                if (hashMap.containsKey(encodeToString)) {
                    list = (List) hashMap.get(encodeToString);
                } else {
                    ArrayList arrayList2 = new ArrayList();
                    hashMap.put(encodeToString, arrayList2);
                    list = arrayList2;
                }
                list.add(str7);
            } catch (PackageManager.NameNotFoundException e4) {
                e = e4;
                com.yandex.passport.legacy.a.e(6, "Failed to calculate signature", e);
                arrayList.add(str7);
                jSONArray.put(jSONObject3);
                str5 = str2;
                it2 = it;
                jSONObject2 = jSONObject;
                applicationInfo2 = null;
            } catch (NoSuchAlgorithmException e5) {
                e = e5;
                com.yandex.passport.legacy.a.e(6, "Failed to calculate signature", e);
                arrayList.add(str7);
                jSONArray.put(jSONObject3);
                str5 = str2;
                it2 = it;
                jSONObject2 = jSONObject;
                applicationInfo2 = null;
            }
            jSONArray.put(jSONObject3);
            str5 = str2;
            it2 = it;
            jSONObject2 = jSONObject;
            applicationInfo2 = null;
        }
        JSONObject jSONObject5 = jSONObject2;
        JSONObject jSONObject6 = new JSONObject();
        jSONObject6.put("unknown", arrayList);
        for (String str8 : hashMap.keySet()) {
            JSONArray jSONArray3 = new JSONArray();
            Iterator it4 = ((List) hashMap.get(str8)).iterator();
            while (it4.hasNext()) {
                jSONArray3.put((String) it4.next());
            }
            jSONObject6.put(str8, jSONArray3);
        }
        JSONObject jSONObject7 = new JSONObject();
        com.yandex.passport.internal.flags.experiments.b bVar = this.f.e;
        HashMap hashMap2 = new HashMap();
        Map<String, ?> all = bVar.a.getAll();
        all.getClass();
        for (Map.Entry<String, ?> entry : all.entrySet()) {
            hashMap2.put("experiments_" + entry.getKey(), String.valueOf(entry.getValue()));
        }
        for (Map.Entry entry2 : hashMap2.entrySet()) {
            jSONObject7.put((String) entry2.getKey(), entry2.getValue());
        }
        JSONObject put2 = jSONObject5.put("signatures", jSONObject6);
        JSONObject jSONObject8 = new JSONObject();
        com.yandex.passport.internal.d a = this.e.a();
        Iterator it5 = a.b().iterator();
        while (it5.hasNext()) {
            Account account = (Account) it5.next();
            JSONObject jSONObject9 = new JSONObject();
            com.yandex.passport.internal.b a2 = a.a(account);
            if (a2 == null) {
                jSONObject8.put(account.name, new JSONObject());
            } else {
                String str9 = a2.b;
                if (TextUtils.isEmpty(str9)) {
                    jSONObject9.put("token", "-");
                } else {
                    jSONObject9.put("token", l.b(str9));
                }
                com.yandex.passport.internal.l b = this.g.b(a2);
                if (b != null) {
                    int i3 = b.e.h;
                    com.yandex.passport.common.core.f fVar = b.b;
                    com.yandex.passport.common.core.b bVar2 = fVar.a;
                    jSONObject9.put("uid", fVar.b);
                    if (i3 == 1) {
                        str = "portal";
                    } else if (i3 == 10) {
                        str = "phone";
                    } else if (i3 == 12) {
                        str = "mail";
                    } else if (i3 == 5) {
                        str = "lite";
                    } else if (i3 == 6) {
                        str = LegacyAccountType.STRING_SOCIAL;
                    } else if (i3 != 7) {
                        Locale locale = Locale.US;
                        str = dfi.c(i3, "unknown [", "]");
                    } else {
                        str = "pdd";
                    }
                    jSONObject9.put("type", str);
                    if (bVar2 == com.yandex.passport.common.core.b.c) {
                        q = "production";
                    } else if (bVar2 == com.yandex.passport.common.core.b.e) {
                        q = "testing";
                    } else if (bVar2 == com.yandex.passport.common.core.b.g) {
                        q = "rc";
                    } else if (com.yandex.plus.pay.ui.core.b.B(bVar2)) {
                        q = LegacyAccountType.STRING_TEAM;
                    } else {
                        Locale locale2 = Locale.US;
                        q = hrg.q("unknown [", bVar2.toString(), "]");
                    }
                    jSONObject9.put("environment", q);
                    jSONObject9.put("locationId", b.h());
                } else {
                    jSONObject9.put("uid", a2.c);
                }
                jSONObject9.put("hasUserInfo", !TextUtils.isEmpty(a2.d));
                jSONObject9.put("hasStash", !TextUtils.isEmpty(a2.f));
                jSONObject9.put("userInfoMeta", a2.e);
                jSONObject8.put(a2.a, jSONObject9);
            }
        }
        JSONObject put3 = put2.put("accounts", jSONObject8).put("applications", jSONArray).put("device", new JSONObject(this.c.c(null, null)));
        JSONObject jSONObject10 = new JSONObject();
        for (Map.Entry entry3 : this.d.d().entrySet()) {
            if (((String) entry3.getKey()).startsWith("com.yandex.passport")) {
                jSONObject10.put((String) entry3.getKey(), entry3.getValue());
            }
        }
        put3.put("authenticators", jSONObject10).put("experiments", jSONObject7);
        String jSONObject11 = jSONObject5.toString(4);
        com.yandex.passport.legacy.a.a(jSONObject11);
        return jSONObject11;
    }
}
