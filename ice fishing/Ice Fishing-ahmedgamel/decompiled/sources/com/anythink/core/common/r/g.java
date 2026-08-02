package com.anythink.core.common.r;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    private boolean f16858a;

    /* renamed from: b, reason: collision with root package name */
    private long f16859b;

    /* renamed from: c, reason: collision with root package name */
    private int f16860c;

    /* renamed from: d, reason: collision with root package name */
    private long f16861d;

    /* renamed from: e, reason: collision with root package name */
    private int f16862e;

    /* renamed from: f, reason: collision with root package name */
    private long f16863f;

    /* renamed from: g, reason: collision with root package name */
    private int f16864g;

    /* renamed from: h, reason: collision with root package name */
    private long f16865h;
    private int[] i;

    /* renamed from: j, reason: collision with root package name */
    private final List<h> f16866j = Collections.synchronizedList(new ArrayList());

    /* renamed from: k, reason: collision with root package name */
    private final Map<String, h> f16867k = new ConcurrentHashMap();

    public static g a(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        try {
            g gVar = new g();
            gVar.f16859b = jSONObject.optLong("pre_load_time", 30000L);
            gVar.f16860c = jSONObject.optInt("pre_load_num", 1);
            gVar.f16861d = jSONObject.optLong("pre_load_timeout", 30000L);
            gVar.f16862e = jSONObject.optInt("pre_load_mode", 1);
            gVar.f16863f = jSONObject.optLong("shared_delay_time_in_wf", com.anythink.basead.exoplayer.i.a.f8669f);
            gVar.f16865h = jSONObject.optLong("shared_retry_time_in_loadfailed", 15000L);
            gVar.f16864g = jSONObject.optInt("shared_retry_count_in_loadfailed", 6);
            gVar.i = b(jSONObject);
            JSONArray optJSONArray = jSONObject.optJSONArray("formats");
            if (optJSONArray != null) {
                int length = optJSONArray.length();
                for (int i = 0; i < length; i++) {
                    try {
                        JSONObject optJSONObject = optJSONArray.optJSONObject(i);
                        if (optJSONObject != null) {
                            h hVar = new h();
                            hVar.f16868a = optJSONObject.optInt("format");
                            hVar.f16869b = optJSONObject.optString(com.anythink.core.common.m.e.bk, "");
                            hVar.f16870c = optJSONObject.optInt("req_pacing");
                            hVar.f16871d = optJSONObject.optInt("ad_cache", 1);
                            hVar.f16872e = optJSONObject.optDouble("ad_ecpm", -1.0d);
                            hVar.f16876j = gVar;
                            gVar.f16866j.add(hVar);
                            gVar.f16867k.put(hVar.f16869b, hVar);
                        }
                    } catch (Throwable unused) {
                    }
                }
            }
            return gVar;
        } catch (Throwable th) {
            th.getMessage();
            return null;
        }
    }

    private static int b(int i) {
        switch (i) {
            case 1:
                return 10;
            case 2:
                return 12;
            case 3:
                return 6;
            case 4:
                return 11;
            case 5:
                return 15;
            case 6:
                return 16;
            default:
                return 17;
        }
    }

    private int k() {
        return this.f16862e;
    }

    public final long c() {
        return this.f16861d;
    }

    public final Map<String, h> d() {
        return this.f16867k;
    }

    public final List<h> e() {
        return this.f16866j;
    }

    public final long f() {
        return this.f16863f;
    }

    public final int g() {
        if (this.f16864g <= 0) {
            this.f16864g = 6;
        }
        return this.f16864g;
    }

    public final long h() {
        return this.f16865h;
    }

    public final boolean i() {
        return this.f16858a;
    }

    public final void j() {
        this.f16858a = true;
    }

    public final String toString() {
        return "SharedPlaceConfig{isPreLocalConfig=" + this.f16858a + ", delayPreloadTime=" + this.f16859b + ", parallelReqNum=" + this.f16860c + ", preLoadTimeout=" + this.f16861d + ", preloadMode=" + this.f16862e + ", loadDelayTimeInWF=" + this.f16863f + ", retryLoadCountInFailed=" + this.f16864g + ", retryLoadDelayTimeInfFailed=" + this.f16865h + ", loadModes=" + Arrays.toString(this.i) + ", sharedPlaceInfoList=" + this.f16866j + ", placementIdToSharedPlaceInfoMap=" + this.f16867k + '}';
    }

    private static int[] b(JSONObject jSONObject) {
        try {
            JSONArray optJSONArray = jSONObject.optJSONArray("pre_load_mode_n");
            if (optJSONArray == null || optJSONArray.length() <= 0) {
                return new int[]{b(jSONObject.optInt("pre_load_mode", 1)), 6, 11};
            }
            int[] iArr = new int[optJSONArray.length()];
            for (int i = 0; i < optJSONArray.length(); i++) {
                try {
                    iArr[i] = b(optJSONArray.optInt(i));
                } catch (Throwable unused) {
                    return iArr;
                }
            }
            return iArr;
        } catch (Throwable unused2) {
            return null;
        }
    }

    public final int b() {
        return this.f16860c;
    }

    public final long a() {
        return this.f16859b;
    }

    public final boolean a(int i) {
        int[] iArr = this.i;
        if (iArr != null) {
            for (int i4 : iArr) {
                if (i4 == i) {
                    return true;
                }
            }
        }
        return false;
    }
}
