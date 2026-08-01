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
    private boolean f16071a;

    /* renamed from: b, reason: collision with root package name */
    private long f16072b;

    /* renamed from: c, reason: collision with root package name */
    private int f16073c;

    /* renamed from: d, reason: collision with root package name */
    private long f16074d;

    /* renamed from: e, reason: collision with root package name */
    private int f16075e;

    /* renamed from: f, reason: collision with root package name */
    private long f16076f;

    /* renamed from: g, reason: collision with root package name */
    private int f16077g;

    /* renamed from: h, reason: collision with root package name */
    private long f16078h;
    private int[] i;

    /* renamed from: j, reason: collision with root package name */
    private final List<h> f16079j = Collections.synchronizedList(new ArrayList());

    /* renamed from: k, reason: collision with root package name */
    private final Map<String, h> f16080k = new ConcurrentHashMap();

    public static g a(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        try {
            g gVar = new g();
            gVar.f16072b = jSONObject.optLong("pre_load_time", 30000L);
            gVar.f16073c = jSONObject.optInt("pre_load_num", 1);
            gVar.f16074d = jSONObject.optLong("pre_load_timeout", 30000L);
            gVar.f16075e = jSONObject.optInt("pre_load_mode", 1);
            gVar.f16076f = jSONObject.optLong("shared_delay_time_in_wf", com.anythink.basead.exoplayer.i.a.f7883f);
            gVar.f16078h = jSONObject.optLong("shared_retry_time_in_loadfailed", 15000L);
            gVar.f16077g = jSONObject.optInt("shared_retry_count_in_loadfailed", 6);
            gVar.i = b(jSONObject);
            JSONArray optJSONArray = jSONObject.optJSONArray("formats");
            if (optJSONArray != null) {
                int length = optJSONArray.length();
                for (int i = 0; i < length; i++) {
                    try {
                        JSONObject optJSONObject = optJSONArray.optJSONObject(i);
                        if (optJSONObject != null) {
                            h hVar = new h();
                            hVar.f16081a = optJSONObject.optInt("format");
                            hVar.f16082b = optJSONObject.optString(com.anythink.core.common.m.e.bk, "");
                            hVar.f16083c = optJSONObject.optInt("req_pacing");
                            hVar.f16084d = optJSONObject.optInt("ad_cache", 1);
                            hVar.f16085e = optJSONObject.optDouble("ad_ecpm", -1.0d);
                            hVar.f16089j = gVar;
                            gVar.f16079j.add(hVar);
                            gVar.f16080k.put(hVar.f16082b, hVar);
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
        return this.f16075e;
    }

    public final long c() {
        return this.f16074d;
    }

    public final Map<String, h> d() {
        return this.f16080k;
    }

    public final List<h> e() {
        return this.f16079j;
    }

    public final long f() {
        return this.f16076f;
    }

    public final int g() {
        if (this.f16077g <= 0) {
            this.f16077g = 6;
        }
        return this.f16077g;
    }

    public final long h() {
        return this.f16078h;
    }

    public final boolean i() {
        return this.f16071a;
    }

    public final void j() {
        this.f16071a = true;
    }

    public final String toString() {
        return "SharedPlaceConfig{isPreLocalConfig=" + this.f16071a + ", delayPreloadTime=" + this.f16072b + ", parallelReqNum=" + this.f16073c + ", preLoadTimeout=" + this.f16074d + ", preloadMode=" + this.f16075e + ", loadDelayTimeInWF=" + this.f16076f + ", retryLoadCountInFailed=" + this.f16077g + ", retryLoadDelayTimeInfFailed=" + this.f16078h + ", loadModes=" + Arrays.toString(this.i) + ", sharedPlaceInfoList=" + this.f16079j + ", placementIdToSharedPlaceInfoMap=" + this.f16080k + '}';
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
        return this.f16073c;
    }

    public final long a() {
        return this.f16072b;
    }

    public final boolean a(int i) {
        int[] iArr = this.i;
        if (iArr != null) {
            for (int i6 : iArr) {
                if (i6 == i) {
                    return true;
                }
            }
        }
        return false;
    }
}
