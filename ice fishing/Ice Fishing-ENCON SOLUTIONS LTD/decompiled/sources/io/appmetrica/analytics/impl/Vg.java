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

/* loaded from: classes.dex */
public final class Vg extends Rg {

    /* renamed from: b, reason: collision with root package name */
    public final SafePackageManager f5262b;

    public Vg(X4 x4) {
        this(x4, new SafePackageManager());
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x004d A[Catch: all -> 0x00d0, TryCatch #0 {all -> 0x00d0, blocks: (B:9:0x0043, B:11:0x004d, B:12:0x005d, B:13:0x0066, B:15:0x006c, B:17:0x008f, B:19:0x0094, B:22:0x0098), top: B:8:0x0043 }] */
    /* JADX WARN: Removed duplicated region for block: B:12:0x005d A[Catch: all -> 0x00d0, TryCatch #0 {all -> 0x00d0, blocks: (B:9:0x0043, B:11:0x004d, B:12:0x005d, B:13:0x0066, B:15:0x006c, B:17:0x008f, B:19:0x0094, B:22:0x0098), top: B:8:0x0043 }] */
    @Override // io.appmetrica.analytics.impl.Rg
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean a(P5 p5) {
        HashSet hashSet;
        ArrayList b2;
        X4 x4 = this.f4998a;
        if (x4.t.c() && x4.y()) {
            We we = x4.f5348c;
            String e2 = this.f4998a.f5348c.e();
            try {
                if (!TextUtils.isEmpty(e2)) {
                    try {
                        hashSet = new HashSet();
                        JSONArray jSONArray = new JSONArray(e2);
                        for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                            hashSet.add(new R9(jSONArray.getJSONObject(i2)));
                        }
                    } catch (Throwable unused) {
                    }
                    b2 = b();
                    if (CollectionUtils.areCollectionsEqual(hashSet, b2)) {
                        JSONArray jSONArray2 = new JSONArray();
                        Iterator it = b2.iterator();
                        while (it.hasNext()) {
                            R9 r9 = (R9) it.next();
                            r9.getClass();
                            JSONObject put = new JSONObject().put("name", r9.f4991a).put("required", r9.f4993c);
                            int i3 = r9.f4992b;
                            if (i3 != -1) {
                                put.put("version", i3);
                            }
                            jSONArray2.put(put);
                        }
                        P5 a2 = P5.a(p5, new JSONObject().put("features", jSONArray2).toString());
                        C0531k9 c0531k9 = x4.f5359n;
                        c0531k9.a(a2, Rk.a(c0531k9.f6357c.b(a2), a2.f4912i));
                        int i4 = c0531k9.f6364j;
                        c0531k9.f6366l = i4;
                        c0531k9.f6355a.a(i4).b();
                        we.i(jSONArray2.toString());
                    } else {
                        C0531k9 c0531k92 = x4.f5359n;
                        int i5 = c0531k92.f6364j;
                        c0531k92.f6366l = i5;
                        c0531k92.f6355a.a(i5).b();
                    }
                }
                b2 = b();
                if (CollectionUtils.areCollectionsEqual(hashSet, b2)) {
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
            X4 x4 = this.f4998a;
            SafePackageManager safePackageManager = this.f5262b;
            Context context = x4.f5346a;
            PackageInfo packageInfo = safePackageManager.getPackageInfo(context, context.getPackageName(), 16384);
            ArrayList arrayList = new ArrayList();
            Q9 o9 = AndroidUtils.isApiAchieved(24) ? new O9() : new P9();
            if (packageInfo != null && (featureInfoArr = packageInfo.reqFeatures) != null) {
                for (FeatureInfo featureInfo : featureInfoArr) {
                    arrayList.add(o9.a(featureInfo));
                }
            }
            return arrayList;
        } catch (Throwable unused) {
            return null;
        }
    }

    public Vg(X4 x4, SafePackageManager safePackageManager) {
        super(x4);
        this.f5262b = safePackageManager;
    }
}
