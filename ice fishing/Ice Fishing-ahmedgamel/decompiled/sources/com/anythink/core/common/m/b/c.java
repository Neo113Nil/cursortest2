package com.anythink.core.common.m.b;

import android.text.TextUtils;
import com.anythink.core.api.ATSDK;
import com.anythink.core.common.n.a.i;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    private int f14500a;

    /* renamed from: b, reason: collision with root package name */
    private a f14501b;

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private final int[] f14502a;

        /* renamed from: b, reason: collision with root package name */
        private final long f14503b;

        /* renamed from: c, reason: collision with root package name */
        private final b[] f14504c;

        public a(int[] iArr, long j6, b[] bVarArr) {
            this.f14502a = iArr;
            this.f14503b = j6;
            this.f14504c = bVarArr;
        }

        private long c() {
            return this.f14503b;
        }

        public final int[] a() {
            return this.f14502a;
        }

        public final b[] b() {
            return this.f14504c;
        }
    }

    public static class b {

        /* renamed from: a, reason: collision with root package name */
        private final String f14505a;

        /* renamed from: b, reason: collision with root package name */
        private final int f14506b;

        /* renamed from: c, reason: collision with root package name */
        private final long f14507c;

        public b(String str, int i, long j6) {
            this.f14505a = str;
            this.f14506b = i;
            this.f14507c = j6;
        }

        public final String a() {
            return this.f14505a;
        }

        public final int b() {
            return this.f14506b;
        }

        public final long c() {
            return this.f14507c;
        }
    }

    private c() {
    }

    public static c a(JSONObject jSONObject) {
        int[] iArr = null;
        if (jSONObject == null) {
            return null;
        }
        c cVar = new c();
        cVar.f14500a = jSONObject.optInt("net_type", 1);
        JSONObject optJSONObject = jSONObject.optJSONObject("net_d");
        if (optJSONObject != null) {
            long optLong = optJSONObject.optLong("s_timeout", 500L);
            JSONArray optJSONArray = optJSONObject.optJSONArray("s_i");
            JSONArray optJSONArray2 = optJSONObject.optJSONArray("srv");
            if (optJSONArray != null && optJSONArray.length() > 0) {
                iArr = new int[optJSONArray.length()];
                for (int i = 0; i < optJSONArray.length(); i++) {
                    iArr[i] = optJSONArray.optInt(i);
                }
            }
            ArrayList arrayList = new ArrayList();
            if (optJSONArray2 != null && optJSONArray2.length() > 0) {
                for (int i6 = 0; i6 < optJSONArray2.length(); i6++) {
                    JSONObject optJSONObject2 = optJSONArray2.optJSONObject(i6);
                    if (optJSONObject2 != null) {
                        String optString = optJSONObject2.optString("ip");
                        if (!TextUtils.isEmpty(optString)) {
                            arrayList.add(new b(optString, optJSONObject2.optInt("port", 57), optJSONObject2.optLong("timeout", 500L)));
                        }
                    }
                }
            }
            if (!arrayList.isEmpty()) {
                cVar.f14501b = new a(iArr, optLong, (b[]) arrayList.toArray(new b[0]));
            }
        }
        return cVar;
    }

    public final int b() {
        return this.f14500a;
    }

    public final boolean a(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        a aVar = this.f14501b;
        boolean z3 = (aVar == null || aVar.b() == null || this.f14501b.b().length <= 0 || this.f14501b.a() == null || this.f14501b.a().length <= 0 || ATSDK.isCnSDK()) ? false : true;
        if (!z3) {
            return z3;
        }
        int[] a9 = this.f14501b.a();
        try {
            int a10 = g.a(str);
            for (int i : a9) {
                if (a10 == i) {
                    return true;
                }
            }
        } catch (Throwable unused) {
        }
        return false;
    }

    public final i[] a() {
        a aVar = this.f14501b;
        i[] iVarArr = null;
        b[] b9 = aVar != null ? aVar.b() : null;
        if (b9 != null && b9.length != 0) {
            iVarArr = new i[b9.length];
            for (int i = 0; i < b9.length; i++) {
                b bVar = b9[i];
                if (bVar != null) {
                    iVarArr[i] = new com.anythink.core.common.n.a.g(bVar.a(), bVar.b(), bVar.c());
                }
            }
        }
        return iVarArr;
    }

    private void a(int i) {
        this.f14500a = i;
    }

    private void a(a aVar) {
        this.f14501b = aVar;
    }
}
