package com.google.android.gms.internal.ads;

import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.Bg, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2506Bg {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f24692a;

    /* renamed from: b, reason: collision with root package name */
    public final int f24693b;

    /* renamed from: c, reason: collision with root package name */
    public final int f24694c;

    /* renamed from: d, reason: collision with root package name */
    public final int f24695d;

    /* renamed from: e, reason: collision with root package name */
    public final int f24696e;

    /* renamed from: f, reason: collision with root package name */
    public final int f24697f;

    /* renamed from: g, reason: collision with root package name */
    public final int f24698g;

    /* renamed from: h, reason: collision with root package name */
    public final int f24699h;
    public final boolean i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f24700j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f24701k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f24702l;

    /* renamed from: m, reason: collision with root package name */
    public final long f24703m;

    /* renamed from: n, reason: collision with root package name */
    public final long f24704n;

    /* JADX WARN: Removed duplicated region for block: B:15:0x00c0 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00a5 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C2506Bg(String str) {
        long j6;
        long j9;
        JSONObject jSONObject = null;
        if (str != null) {
            try {
                jSONObject = new JSONObject(str);
            } catch (JSONException unused) {
            }
        }
        this.f24692a = a(jSONObject, "aggressive_media_codec_release", AbstractC3592ma.f33140s0);
        this.f24693b = b(jSONObject, "byte_buffer_precache_limit", AbstractC3592ma.f33094n);
        this.f24694c = b(jSONObject, "exo_cache_buffer_size", AbstractC3592ma.f32749A);
        this.f24695d = b(jSONObject, "exo_connect_timeout_millis", AbstractC3592ma.f33056j);
        C3324ha c3324ha = AbstractC3592ma.i;
        if (jSONObject != null) {
            try {
                jSONObject.getString("exo_player_version");
            } catch (JSONException unused2) {
            }
            this.f24696e = b(jSONObject, "exo_read_timeout_millis", AbstractC3592ma.f33065k);
            this.f24697f = b(jSONObject, "load_check_interval_bytes", AbstractC3592ma.f33075l);
            this.f24698g = b(jSONObject, "player_precache_limit", AbstractC3592ma.f33085m);
            this.f24699h = b(jSONObject, "socket_receive_buffer_size", AbstractC3592ma.f33104o);
            this.i = a(jSONObject, "use_cache_data_source", AbstractC3592ma.f33053i5);
            b(jSONObject, "min_retry_count", AbstractC3592ma.f33112p);
            this.f24700j = a(jSONObject, "treat_load_exception_as_non_fatal", AbstractC3592ma.f33130r);
            this.f24701k = a(jSONObject, "enable_multiple_video_playback", AbstractC3592ma.f33198y2);
            this.f24702l = a(jSONObject, "use_range_http_data_source", AbstractC3592ma.f32752A2);
            C3324ha c3324ha2 = AbstractC3592ma.f32762B2;
            if (jSONObject != null) {
                try {
                    j6 = jSONObject.getLong("range_http_data_source_high_water_mark");
                } catch (JSONException unused3) {
                }
                this.f24703m = j6;
                C3324ha c3324ha3 = AbstractC3592ma.f32770C2;
                if (jSONObject != null) {
                    try {
                        j9 = jSONObject.getLong("range_http_data_source_low_water_mark");
                    } catch (JSONException unused4) {
                    }
                    this.f24704n = j9;
                }
                j9 = ((Long) s2.r.f40506e.f40509c.a(c3324ha3)).longValue();
                this.f24704n = j9;
            }
            j6 = ((Long) s2.r.f40506e.f40509c.a(c3324ha2)).longValue();
            this.f24703m = j6;
            C3324ha c3324ha32 = AbstractC3592ma.f32770C2;
            if (jSONObject != null) {
            }
            j9 = ((Long) s2.r.f40506e.f40509c.a(c3324ha32)).longValue();
            this.f24704n = j9;
        }
        this.f24696e = b(jSONObject, "exo_read_timeout_millis", AbstractC3592ma.f33065k);
        this.f24697f = b(jSONObject, "load_check_interval_bytes", AbstractC3592ma.f33075l);
        this.f24698g = b(jSONObject, "player_precache_limit", AbstractC3592ma.f33085m);
        this.f24699h = b(jSONObject, "socket_receive_buffer_size", AbstractC3592ma.f33104o);
        this.i = a(jSONObject, "use_cache_data_source", AbstractC3592ma.f33053i5);
        b(jSONObject, "min_retry_count", AbstractC3592ma.f33112p);
        this.f24700j = a(jSONObject, "treat_load_exception_as_non_fatal", AbstractC3592ma.f33130r);
        this.f24701k = a(jSONObject, "enable_multiple_video_playback", AbstractC3592ma.f33198y2);
        this.f24702l = a(jSONObject, "use_range_http_data_source", AbstractC3592ma.f32752A2);
        C3324ha c3324ha22 = AbstractC3592ma.f32762B2;
        if (jSONObject != null) {
        }
        j6 = ((Long) s2.r.f40506e.f40509c.a(c3324ha22)).longValue();
        this.f24703m = j6;
        C3324ha c3324ha322 = AbstractC3592ma.f32770C2;
        if (jSONObject != null) {
        }
        j9 = ((Long) s2.r.f40506e.f40509c.a(c3324ha322)).longValue();
        this.f24704n = j9;
    }

    public static final boolean a(JSONObject jSONObject, String str, C3324ha c3324ha) {
        boolean booleanValue = ((Boolean) s2.r.f40506e.f40509c.a(c3324ha)).booleanValue();
        if (jSONObject != null) {
            try {
                return jSONObject.getBoolean(str);
            } catch (JSONException unused) {
            }
        }
        return booleanValue;
    }

    public static final int b(JSONObject jSONObject, String str, C3324ha c3324ha) {
        if (jSONObject != null) {
            try {
                return jSONObject.getInt(str);
            } catch (JSONException unused) {
            }
        }
        return ((Integer) s2.r.f40506e.f40509c.a(c3324ha)).intValue();
    }
}
