package com.google.android.gms.internal.ads;

import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.Bg, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2486Bg {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f23919a;

    /* renamed from: b, reason: collision with root package name */
    public final int f23920b;

    /* renamed from: c, reason: collision with root package name */
    public final int f23921c;

    /* renamed from: d, reason: collision with root package name */
    public final int f23922d;

    /* renamed from: e, reason: collision with root package name */
    public final int f23923e;

    /* renamed from: f, reason: collision with root package name */
    public final int f23924f;

    /* renamed from: g, reason: collision with root package name */
    public final int f23925g;

    /* renamed from: h, reason: collision with root package name */
    public final int f23926h;
    public final boolean i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f23927j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f23928k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f23929l;

    /* renamed from: m, reason: collision with root package name */
    public final long f23930m;

    /* renamed from: n, reason: collision with root package name */
    public final long f23931n;

    /* JADX WARN: Removed duplicated region for block: B:15:0x00c0 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00a5 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C2486Bg(String str) {
        long j6;
        long j9;
        JSONObject jSONObject = null;
        if (str != null) {
            try {
                jSONObject = new JSONObject(str);
            } catch (JSONException unused) {
            }
        }
        this.f23919a = a(jSONObject, "aggressive_media_codec_release", AbstractC3569ma.f32361s0);
        this.f23920b = b(jSONObject, "byte_buffer_precache_limit", AbstractC3569ma.f32314n);
        this.f23921c = b(jSONObject, "exo_cache_buffer_size", AbstractC3569ma.f31968A);
        this.f23922d = b(jSONObject, "exo_connect_timeout_millis", AbstractC3569ma.f32277j);
        C3301ha c3301ha = AbstractC3569ma.i;
        if (jSONObject != null) {
            try {
                jSONObject.getString("exo_player_version");
            } catch (JSONException unused2) {
            }
            this.f23923e = b(jSONObject, "exo_read_timeout_millis", AbstractC3569ma.f32286k);
            this.f23924f = b(jSONObject, "load_check_interval_bytes", AbstractC3569ma.f32296l);
            this.f23925g = b(jSONObject, "player_precache_limit", AbstractC3569ma.f32306m);
            this.f23926h = b(jSONObject, "socket_receive_buffer_size", AbstractC3569ma.f32323o);
            this.i = a(jSONObject, "use_cache_data_source", AbstractC3569ma.f32274i5);
            b(jSONObject, "min_retry_count", AbstractC3569ma.f32332p);
            this.f23927j = a(jSONObject, "treat_load_exception_as_non_fatal", AbstractC3569ma.f32350r);
            this.f23928k = a(jSONObject, "enable_multiple_video_playback", AbstractC3569ma.f32419y2);
            this.f23929l = a(jSONObject, "use_range_http_data_source", AbstractC3569ma.f31971A2);
            C3301ha c3301ha2 = AbstractC3569ma.f31981B2;
            if (jSONObject != null) {
                try {
                    j6 = jSONObject.getLong("range_http_data_source_high_water_mark");
                } catch (JSONException unused3) {
                }
                this.f23930m = j6;
                C3301ha c3301ha3 = AbstractC3569ma.f31990C2;
                if (jSONObject != null) {
                    try {
                        j9 = jSONObject.getLong("range_http_data_source_low_water_mark");
                    } catch (JSONException unused4) {
                    }
                    this.f23931n = j9;
                }
                j9 = ((Long) q2.r.f40204e.f40207c.a(c3301ha3)).longValue();
                this.f23931n = j9;
            }
            j6 = ((Long) q2.r.f40204e.f40207c.a(c3301ha2)).longValue();
            this.f23930m = j6;
            C3301ha c3301ha32 = AbstractC3569ma.f31990C2;
            if (jSONObject != null) {
            }
            j9 = ((Long) q2.r.f40204e.f40207c.a(c3301ha32)).longValue();
            this.f23931n = j9;
        }
        this.f23923e = b(jSONObject, "exo_read_timeout_millis", AbstractC3569ma.f32286k);
        this.f23924f = b(jSONObject, "load_check_interval_bytes", AbstractC3569ma.f32296l);
        this.f23925g = b(jSONObject, "player_precache_limit", AbstractC3569ma.f32306m);
        this.f23926h = b(jSONObject, "socket_receive_buffer_size", AbstractC3569ma.f32323o);
        this.i = a(jSONObject, "use_cache_data_source", AbstractC3569ma.f32274i5);
        b(jSONObject, "min_retry_count", AbstractC3569ma.f32332p);
        this.f23927j = a(jSONObject, "treat_load_exception_as_non_fatal", AbstractC3569ma.f32350r);
        this.f23928k = a(jSONObject, "enable_multiple_video_playback", AbstractC3569ma.f32419y2);
        this.f23929l = a(jSONObject, "use_range_http_data_source", AbstractC3569ma.f31971A2);
        C3301ha c3301ha22 = AbstractC3569ma.f31981B2;
        if (jSONObject != null) {
        }
        j6 = ((Long) q2.r.f40204e.f40207c.a(c3301ha22)).longValue();
        this.f23930m = j6;
        C3301ha c3301ha322 = AbstractC3569ma.f31990C2;
        if (jSONObject != null) {
        }
        j9 = ((Long) q2.r.f40204e.f40207c.a(c3301ha322)).longValue();
        this.f23931n = j9;
    }

    public static final boolean a(JSONObject jSONObject, String str, C3301ha c3301ha) {
        boolean booleanValue = ((Boolean) q2.r.f40204e.f40207c.a(c3301ha)).booleanValue();
        if (jSONObject != null) {
            try {
                return jSONObject.getBoolean(str);
            } catch (JSONException unused) {
            }
        }
        return booleanValue;
    }

    public static final int b(JSONObject jSONObject, String str, C3301ha c3301ha) {
        if (jSONObject != null) {
            try {
                return jSONObject.getInt(str);
            } catch (JSONException unused) {
            }
        }
        return ((Integer) q2.r.f40204e.f40207c.a(c3301ha)).intValue();
    }
}
