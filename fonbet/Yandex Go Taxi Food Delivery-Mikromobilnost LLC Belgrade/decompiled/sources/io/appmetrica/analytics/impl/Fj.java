package io.appmetrica.analytics.impl;

import android.content.Context;
import android.content.pm.FeatureInfo;
import android.content.pm.PackageInfo;
import android.text.TextUtils;
import io.appmetrica.analytics.coreutils.internal.AndroidUtils;
import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import io.appmetrica.analytics.coreutils.internal.services.SafePackageManager;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes9.dex */
public final class Fj extends Aj {
    public final SafePackageManager b;

    public Fj(S5 s5) {
        this(s5, new SafePackageManager());
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x004d A[Catch: all -> 0x00c0, TryCatch #0 {all -> 0x00c0, blocks: (B:9:0x0043, B:11:0x004d, B:12:0x0051, B:13:0x005a, B:15:0x0060, B:17:0x0083, B:19:0x0088, B:22:0x008c), top: B:8:0x0043 }] */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0051 A[Catch: all -> 0x00c0, TryCatch #0 {all -> 0x00c0, blocks: (B:9:0x0043, B:11:0x004d, B:12:0x0051, B:13:0x005a, B:15:0x0060, B:17:0x0083, B:19:0x0088, B:22:0x008c), top: B:8:0x0043 }] */
    @Override // io.appmetrica.analytics.impl.Aj
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean a(K6 k6) {
        HashSet hashSet;
        ArrayList b;
        S5 s5 = this.a;
        if (s5.t.c() && s5.z()) {
            Ih ih = s5.c;
            String e = this.a.c.e();
            try {
                if (!TextUtils.isEmpty(e)) {
                    try {
                        hashSet = new HashSet();
                        JSONArray jSONArray = new JSONArray(e);
                        for (int i = 0; i < jSONArray.length(); i++) {
                            hashSet.add(new C0388hb(jSONArray.getJSONObject(i)));
                        }
                    } catch (Throwable unused) {
                    }
                    b = b();
                    if (CollectionUtils.areCollectionsEqual(hashSet, b)) {
                        JSONArray jSONArray2 = new JSONArray();
                        Iterator it = b.iterator();
                        while (it.hasNext()) {
                            C0388hb c0388hb = (C0388hb) it.next();
                            c0388hb.getClass();
                            JSONObject put = new JSONObject().put("name", c0388hb.a).put("required", c0388hb.c);
                            int i2 = c0388hb.b;
                            if (i2 != -1) {
                                put.put("version", i2);
                            }
                            jSONArray2.put(put);
                        }
                        K6 a = K6.a(k6, new JSONObject().put("features", jSONArray2).toString());
                        C0907za c0907za = s5.n;
                        c0907za.a(a, C0574no.a(c0907za.c.b(a), a.i));
                        int i3 = c0907za.j;
                        c0907za.l = i3;
                        c0907za.a.a(i3);
                        ih.i(jSONArray2.toString());
                    } else {
                        s5.w();
                    }
                }
                b = b();
                if (CollectionUtils.areCollectionsEqual(hashSet, b)) {
                }
            } catch (Throwable unused2) {
            }
            hashSet = null;
        }
        return false;
    }

    public final ArrayList b() {
        FeatureInfo[] featureInfoArr;
        try {
            S5 s5 = this.a;
            SafePackageManager safePackageManager = this.b;
            Context context = s5.a;
            PackageInfo packageInfo = safePackageManager.getPackageInfo(context, context.getPackageName(), 16384);
            ArrayList arrayList = new ArrayList();
            AbstractC0359gb c0301eb = AndroidUtils.isApiAchieved(24) ? new C0301eb() : new C0330fb();
            if (packageInfo != null && (featureInfoArr = packageInfo.reqFeatures) != null) {
                for (FeatureInfo featureInfo : featureInfoArr) {
                    arrayList.add(c0301eb.a(featureInfo));
                }
            }
            return arrayList;
        } catch (Throwable unused) {
            return null;
        }
    }

    public Fj(S5 s5, SafePackageManager safePackageManager) {
        super(s5);
        this.b = safePackageManager;
    }
}
