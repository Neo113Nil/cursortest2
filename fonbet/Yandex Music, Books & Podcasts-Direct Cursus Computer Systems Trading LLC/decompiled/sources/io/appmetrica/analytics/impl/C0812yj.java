package io.appmetrica.analytics.impl;

import android.content.Context;
import android.content.pm.FeatureInfo;
import android.content.pm.PackageInfo;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreutils.internal.AndroidUtils;
import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import io.appmetrica.analytics.coreutils.internal.services.SafePackageManager;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: io.appmetrica.analytics.impl.yj, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C0812yj extends AbstractC0697uj {
    public final SafePackageManager b;

    public C0812yj(P5 p5) {
        this(p5, new SafePackageManager());
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x004d A[Catch: all -> 0x00d0, TryCatch #0 {all -> 0x00d0, blocks: (B:9:0x0043, B:11:0x004d, B:12:0x005d, B:13:0x0066, B:15:0x006c, B:17:0x008f, B:19:0x0094, B:22:0x0098), top: B:8:0x0043 }] */
    /* JADX WARN: Removed duplicated region for block: B:12:0x005d A[Catch: all -> 0x00d0, TryCatch #0 {all -> 0x00d0, blocks: (B:9:0x0043, B:11:0x004d, B:12:0x005d, B:13:0x0066, B:15:0x006c, B:17:0x008f, B:19:0x0094, B:22:0x0098), top: B:8:0x0043 }] */
    @Override // io.appmetrica.analytics.impl.AbstractC0697uj
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean a(@NonNull H6 h6) {
        HashSet hashSet;
        ArrayList b;
        P5 p5 = this.a;
        if (p5.t.c() && p5.z()) {
            C0637sh c0637sh = p5.c;
            String e = this.a.c.e();
            try {
                if (!TextUtils.isEmpty(e)) {
                    try {
                        hashSet = new HashSet();
                        JSONArray jSONArray = new JSONArray(e);
                        for (int i = 0; i < jSONArray.length(); i++) {
                            hashSet.add(new Za(jSONArray.getJSONObject(i)));
                        }
                    } catch (Throwable unused) {
                    }
                    b = b();
                    if (CollectionUtils.areCollectionsEqual(hashSet, b)) {
                        JSONArray jSONArray2 = new JSONArray();
                        Iterator it = b.iterator();
                        while (it.hasNext()) {
                            Za za = (Za) it.next();
                            za.getClass();
                            JSONObject put = new JSONObject().put("name", za.a).put("required", za.c);
                            int i2 = za.b;
                            if (i2 != -1) {
                                put.put("version", i2);
                            }
                            jSONArray2.put(put);
                        }
                        H6 a = H6.a(h6, new JSONObject().put("features", jSONArray2).toString());
                        C0630sa c0630sa = p5.n;
                        c0630sa.a(a, Tn.a(c0630sa.c.b(a), a.i));
                        int i3 = c0630sa.j;
                        c0630sa.l = i3;
                        c0630sa.a.a(i3).b();
                        c0637sh.i(jSONArray2.toString());
                    } else {
                        C0630sa c0630sa2 = p5.n;
                        int i4 = c0630sa2.j;
                        c0630sa2.l = i4;
                        c0630sa2.a.a(i4).b();
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
            P5 p5 = this.a;
            SafePackageManager safePackageManager = this.b;
            Context context = p5.a;
            PackageInfo packageInfo = safePackageManager.getPackageInfo(context, context.getPackageName(), 16384);
            ArrayList arrayList = new ArrayList();
            Ya wa = AndroidUtils.isApiAchieved(24) ? new Wa() : new Xa();
            if (packageInfo != null && (featureInfoArr = packageInfo.reqFeatures) != null) {
                for (FeatureInfo featureInfo : featureInfoArr) {
                    arrayList.add(wa.a(featureInfo));
                }
            }
            return arrayList;
        } catch (Throwable unused) {
            return null;
        }
    }

    public C0812yj(P5 p5, @NonNull SafePackageManager safePackageManager) {
        super(p5);
        this.b = safePackageManager;
    }
}
