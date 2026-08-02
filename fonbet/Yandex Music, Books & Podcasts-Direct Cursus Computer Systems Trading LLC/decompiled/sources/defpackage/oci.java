package defpackage;

import android.content.res.Resources;
import android.os.Bundle;
import android.text.TextUtils;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class oci {
    public static final oci d = new oci();
    public static final ConcurrentHashMap a = new ConcurrentHashMap();
    public static final List b = u75.h("other", "fb_mobile_complete_registration", "fb_mobile_add_to_cart", "fb_mobile_purchase", "fb_mobile_initiated_checkout");
    public static final List c = u75.h("none", "address", "health");

    public static final boolean a(long j) {
        oci ociVar = d;
        Set set = bp6.a;
        if (!set.contains(oci.class)) {
            try {
                if (!set.contains(ociVar) && j != 0) {
                    try {
                        if (System.currentTimeMillis() - j < 259200000) {
                            return true;
                        }
                    } catch (Throwable th) {
                        bp6.a(ociVar, th);
                    }
                }
            } catch (Throwable th2) {
                bp6.a(oci.class, th2);
                return false;
            }
        }
        return false;
    }

    public static final File d() {
        if (!bp6.a.contains(oci.class)) {
            try {
                nci nciVar = (nci) a.get(hrg.b(2));
                if (nciVar != null) {
                    return nciVar.a;
                }
            } catch (Throwable th) {
                bp6.a(oci.class, th);
                return null;
            }
        }
        return null;
    }

    public static final String[] f(int i, float[][] fArr, String[] strArr) {
        gci gciVar;
        if (!bp6.a.contains(oci.class)) {
            try {
                if (i == 0) {
                    throw null;
                }
                nci nciVar = (nci) a.get(hrg.b(i));
                if (nciVar != null && (gciVar = nciVar.b) != null) {
                    float[] fArr2 = nciVar.h;
                    int length = strArr.length;
                    int length2 = fArr[0].length;
                    n4h n4hVar = new n4h(new int[]{length, length2});
                    for (int i2 = 0; i2 < length; i2++) {
                        System.arraycopy(fArr[i2], 0, n4hVar.b, i2 * length2, length2);
                    }
                    n4h a2 = gciVar.a(n4hVar, strArr, hrg.a(i));
                    if (a2 != null && fArr2 != null && a2.b.length != 0 && fArr2.length != 0) {
                        int D = ouj.D(i);
                        oci ociVar = d;
                        if (D == 0) {
                            return ociVar.g(a2, fArr2);
                        }
                        if (D == 1) {
                            return ociVar.h(a2, fArr2);
                        }
                        throw new x7j();
                    }
                }
            } catch (Throwable th) {
                bp6.a(oci.class, th);
                return null;
            }
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x007c, code lost:
    
        if (kotlin.text.StringsKt.M(r0, "en", false) != false) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b() {
        Locale locale;
        if (bp6.a.contains(this)) {
            return;
        }
        try {
            ArrayList arrayList = new ArrayList();
            int i = 0;
            String str = null;
            for (Map.Entry entry : a.entrySet()) {
                String str2 = (String) entry.getKey();
                nci nciVar = (nci) entry.getValue();
                if (Intrinsics.d(str2, hrg.b(2))) {
                    str = nciVar.e;
                    i = Math.max(i, nciVar.g);
                    if (x6c.b(v6c.SuggestedEvents) && !bp6.a.contains(this)) {
                        try {
                            try {
                                Resources resources = j3c.b().getResources();
                                resources.getClass();
                                locale = resources.getConfiguration().locale;
                            } catch (Exception unused) {
                                locale = null;
                            }
                            if (locale != null) {
                                String language = locale.getLanguage();
                                language.getClass();
                            }
                            nciVar.c = q.n;
                            arrayList.add(nciVar);
                        } catch (Throwable th) {
                            bp6.a(this, th);
                        }
                    }
                }
                if (Intrinsics.d(str2, hrg.b(1))) {
                    String str3 = nciVar.e;
                    int max = Math.max(i, nciVar.g);
                    if (x6c.b(v6c.IntelligentIntegrity)) {
                        nciVar.c = q.o;
                        arrayList.add(nciVar);
                    }
                    str = str3;
                    i = max;
                }
            }
            if (str == null || i <= 0 || arrayList.isEmpty()) {
                return;
            }
            hyf.B(new nci("MTML", str, null, i, null), arrayList);
        } catch (Throwable th2) {
            bp6.a(this, th2);
        }
    }

    public final JSONObject c() {
        if (!bp6.a.contains(this)) {
            try {
                Bundle bundle = new Bundle();
                bundle.putString("fields", TextUtils.join(StringUtils.COMMA, new String[]{"use_case", "version_id", "asset_uri", "rules_uri", "thresholds"}));
                String str = ood.j;
                ood oodVar = new ood(null, String.format("%s/model_asset", Arrays.copyOf(new Object[]{j3c.c()}, 1)), null, null, null, 0);
                oodVar.h = true;
                oodVar.d = bundle;
                JSONObject jSONObject = oodVar.c().c;
                if (jSONObject != null) {
                    return e(jSONObject);
                }
            } catch (Throwable th) {
                bp6.a(this, th);
                return null;
            }
        }
        return null;
    }

    public final JSONObject e(JSONObject jSONObject) {
        if (bp6.a.contains(this)) {
            return null;
        }
        try {
            JSONObject jSONObject2 = new JSONObject();
            try {
                JSONArray jSONArray = jSONObject.getJSONArray("data");
                int length = jSONArray.length();
                for (int i = 0; i < length; i++) {
                    JSONObject jSONObject3 = jSONArray.getJSONObject(i);
                    JSONObject jSONObject4 = new JSONObject();
                    jSONObject4.put("version_id", jSONObject3.getString("version_id"));
                    jSONObject4.put("use_case", jSONObject3.getString("use_case"));
                    jSONObject4.put("thresholds", jSONObject3.getJSONArray("thresholds"));
                    jSONObject4.put("asset_uri", jSONObject3.getString("asset_uri"));
                    if (jSONObject3.has("rules_uri")) {
                        jSONObject4.put("rules_uri", jSONObject3.getString("rules_uri"));
                    }
                    jSONObject2.put(jSONObject3.getString("use_case"), jSONObject4);
                }
                return jSONObject2;
            } catch (JSONException unused) {
                return new JSONObject();
            }
        } catch (Throwable th) {
            bp6.a(this, th);
            return null;
        }
    }

    public final String[] g(n4h n4hVar, float[] fArr) {
        if (!bp6.a.contains(this)) {
            try {
                int[] iArr = n4hVar.c;
                int i = iArr[0];
                int i2 = iArr[1];
                float[] fArr2 = n4hVar.b;
                if (i2 == fArr.length) {
                    IntRange m = yhn.m(0, i);
                    ArrayList arrayList = new ArrayList(v75.o(m, 10));
                    ype it = m.iterator();
                    while (it.c) {
                        int nextInt = it.nextInt();
                        String str = "none";
                        int length = fArr.length;
                        int i3 = 0;
                        int i4 = 0;
                        while (i3 < length) {
                            int i5 = i4 + 1;
                            if (fArr2[(nextInt * i2) + i4] >= fArr[i3]) {
                                str = (String) c.get(i4);
                            }
                            i3++;
                            i4 = i5;
                        }
                        arrayList.add(str);
                    }
                    Object[] array = arrayList.toArray(new String[0]);
                    if (array != null) {
                        return (String[]) array;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
                }
            } catch (Throwable th) {
                bp6.a(this, th);
                return null;
            }
        }
        return null;
    }

    public final String[] h(n4h n4hVar, float[] fArr) {
        if (!bp6.a.contains(this)) {
            try {
                int[] iArr = n4hVar.c;
                int i = iArr[0];
                int i2 = iArr[1];
                float[] fArr2 = n4hVar.b;
                if (i2 == fArr.length) {
                    IntRange m = yhn.m(0, i);
                    ArrayList arrayList = new ArrayList(v75.o(m, 10));
                    ype it = m.iterator();
                    while (it.c) {
                        int nextInt = it.nextInt();
                        String str = "other";
                        int length = fArr.length;
                        int i3 = 0;
                        int i4 = 0;
                        while (i3 < length) {
                            int i5 = i4 + 1;
                            if (fArr2[(nextInt * i2) + i4] >= fArr[i3]) {
                                str = (String) b.get(i4);
                            }
                            i3++;
                            i4 = i5;
                        }
                        arrayList.add(str);
                    }
                    Object[] array = arrayList.toArray(new String[0]);
                    if (array != null) {
                        return (String[]) array;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
                }
            } catch (Throwable th) {
                bp6.a(this, th);
                return null;
            }
        }
        return null;
    }
}
