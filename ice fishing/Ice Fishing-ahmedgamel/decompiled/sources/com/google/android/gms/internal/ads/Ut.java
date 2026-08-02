package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.util.JsonReader;
import android.util.JsonToken;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class Ut {

    /* renamed from: a, reason: collision with root package name */
    public final List f28800a;

    /* renamed from: b, reason: collision with root package name */
    public final String f28801b;

    /* renamed from: c, reason: collision with root package name */
    public final int f28802c;

    /* renamed from: d, reason: collision with root package name */
    public final int f28803d;

    /* renamed from: e, reason: collision with root package name */
    public final String f28804e;

    /* renamed from: f, reason: collision with root package name */
    public final int f28805f;

    /* renamed from: g, reason: collision with root package name */
    public final long f28806g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f28807h;
    public final String i;

    /* renamed from: j, reason: collision with root package name */
    public final C3902sE f28808j;

    /* renamed from: k, reason: collision with root package name */
    public final Bundle f28809k;

    /* renamed from: l, reason: collision with root package name */
    public final String f28810l;

    /* renamed from: m, reason: collision with root package name */
    public final String f28811m;

    /* renamed from: n, reason: collision with root package name */
    public final String f28812n;

    /* renamed from: o, reason: collision with root package name */
    public final JSONObject f28813o;

    /* renamed from: p, reason: collision with root package name */
    public final JSONObject f28814p;

    /* renamed from: q, reason: collision with root package name */
    public final String f28815q;

    /* renamed from: r, reason: collision with root package name */
    public final int f28816r;

    /* renamed from: s, reason: collision with root package name */
    public final long f28817s;

    /* renamed from: t, reason: collision with root package name */
    public final long f28818t;

    public Ut(JsonReader jsonReader) {
        String str;
        Bundle w3;
        char c9;
        List list = Collections.EMPTY_LIST;
        Bundle bundle = new Bundle();
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        jsonReader.beginObject();
        String str2 = "";
        String str3 = "";
        String str4 = str3;
        String str5 = str4;
        String str6 = str5;
        String str7 = str6;
        String str8 = str7;
        String str9 = str8;
        C3902sE c3902sE = null;
        long j6 = -1;
        long j9 = 0;
        long j10 = -1;
        int i = 0;
        int i4 = -1;
        int i6 = 1;
        int i9 = 0;
        boolean z6 = false;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            if (Objects.equals(nextName, "nofill_urls")) {
                list = d6.c.q(jsonReader);
            } else if ("refresh_interval".equals(nextName)) {
                i = jsonReader.nextInt();
            } else if (Objects.equals(nextName, "refresh_load_delay_time_interval")) {
                i4 = jsonReader.nextInt();
            } else if ("gws_query_id".equals(nextName)) {
                str3 = jsonReader.nextString();
            } else if ("analytics_query_ad_event_id".equals(nextName)) {
                str4 = jsonReader.nextString();
            } else if ("is_idless".equals(nextName)) {
                z6 = jsonReader.nextBoolean();
            } else if ("response_code".equals(nextName)) {
                i9 = jsonReader.nextInt();
            } else if ("latency".equals(nextName)) {
                j9 = jsonReader.nextLong();
            } else {
                C3324ha c3324ha = AbstractC3592ma.w9;
                str = str2;
                s2.r rVar = s2.r.f40506e;
                long j11 = j6;
                if (((Boolean) rVar.f40509c.a(c3324ha)).booleanValue() && "public_error".equals(nextName) && jsonReader.peek() == JsonToken.BEGIN_OBJECT) {
                    C3902sE c3902sE2 = new C3902sE();
                    jsonReader.beginObject();
                    String str10 = str;
                    while (jsonReader.hasNext()) {
                        String nextName2 = jsonReader.nextName();
                        int hashCode = nextName2.hashCode();
                        if (hashCode != -1724546052) {
                            if (hashCode == 3059181 && nextName2.equals("code")) {
                                c9 = 0;
                            }
                            c9 = 65535;
                        } else {
                            if (nextName2.equals("description")) {
                                c9 = 1;
                            }
                            c9 = 65535;
                        }
                        if (c9 == 0) {
                            jsonReader.nextInt();
                        } else if (c9 != 1) {
                            jsonReader.skipValue();
                        } else {
                            str10 = jsonReader.nextString();
                        }
                    }
                    jsonReader.endObject();
                    c3902sE2.f34696b = str10;
                    c3902sE = c3902sE2;
                } else if ("bidding_data".equals(nextName)) {
                    str5 = jsonReader.nextString();
                } else {
                    C3324ha c3324ha2 = AbstractC3592ma.Ob;
                    SharedPreferencesOnSharedPreferenceChangeListenerC3484ka sharedPreferencesOnSharedPreferenceChangeListenerC3484ka = rVar.f40509c;
                    if (((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC3484ka.a(c3324ha2)).booleanValue() && Objects.equals(nextName, "topics_should_record_observation")) {
                        jsonReader.nextBoolean();
                    } else if ("adapter_response_replacement_key".equals(nextName)) {
                        str9 = jsonReader.nextString();
                    } else if ("response_info_extras".equals(nextName)) {
                        if (((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC3484ka.a(AbstractC3592ma.f32817H7)).booleanValue()) {
                            try {
                                Bundle w6 = d6.c.w(d6.c.r(jsonReader));
                                if (w6 != null) {
                                    bundle = w6;
                                }
                            } catch (IOException | JSONException unused) {
                            } catch (IllegalStateException unused2) {
                                jsonReader.skipValue();
                            }
                        } else {
                            jsonReader.skipValue();
                        }
                    } else if ("adRequestPostBody".equals(nextName)) {
                        if (((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC3484ka.a(AbstractC3592ma.Da)).booleanValue()) {
                            str7 = jsonReader.nextString();
                        } else {
                            jsonReader.skipValue();
                        }
                    } else if (!"adRequestUrl".equals(nextName)) {
                        C3324ha c3324ha3 = AbstractC3592ma.Ea;
                        if (((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC3484ka.a(c3324ha3)).booleanValue() && Objects.equals(nextName, "adResponseBody")) {
                            str8 = jsonReader.nextString();
                        } else if (((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC3484ka.a(c3324ha3)).booleanValue() && Objects.equals(nextName, "adResponseHeaders")) {
                            jSONObject = d6.c.r(jsonReader);
                        } else {
                            if (Objects.equals(nextName, "max_parallel_renderers")) {
                                i6 = Math.max(1, jsonReader.nextInt());
                            } else if (((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC3484ka.a(AbstractC3592ma.Ma)).booleanValue() && Objects.equals(nextName, "inspector_ad_transaction_extras")) {
                                jSONObject2 = d6.c.r(jsonReader);
                            } else if (((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC3484ka.a(AbstractC3592ma.f32837K2)).booleanValue() && Objects.equals(nextName, "latency_extras")) {
                                try {
                                    w3 = d6.c.w(d6.c.r(jsonReader));
                                } catch (IOException | JSONException unused3) {
                                } catch (IllegalStateException unused4) {
                                }
                                if (w3 != null) {
                                    double d9 = w3.getDouble(com.anythink.core.common.d.g.f13115a);
                                    long j12 = (d9 > 9.223372036854776E18d || d9 < -9.223372036854776E18d) ? -1L : (long) d9;
                                    try {
                                        double d10 = w3.getDouble(com.anythink.core.common.d.g.f13116b);
                                        long j13 = (d10 > 9.223372036854776E18d || d10 < -9.223372036854776E18d) ? -1L : (long) d10;
                                        j10 = j12;
                                        j6 = j13;
                                    } catch (IOException | JSONException unused5) {
                                        j10 = j12;
                                    } catch (IllegalStateException unused6) {
                                        j10 = j12;
                                        jsonReader.skipValue();
                                        j6 = j11;
                                        str2 = str;
                                    }
                                    str2 = str;
                                }
                            } else {
                                jsonReader.skipValue();
                            }
                            j6 = j11;
                            str2 = str;
                        }
                    } else if (((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC3484ka.a(AbstractC3592ma.Da)).booleanValue()) {
                        str6 = jsonReader.nextString();
                    } else {
                        jsonReader.skipValue();
                    }
                    j6 = j11;
                    str2 = str;
                }
                j6 = j11;
                str2 = str;
            }
            str = str2;
            str2 = str;
        }
        long j14 = j6;
        jsonReader.endObject();
        this.f28800a = list;
        this.f28802c = i;
        if (((Boolean) AbstractC2840Va.f28999e.r()).booleanValue()) {
            this.f28803d = -1;
        } else {
            C3516l5 c3516l5 = AbstractC2568Fa.f25594a;
            if (((Long) c3516l5.r()).longValue() > -1) {
                this.f28803d = ((Long) c3516l5.r()).intValue();
            } else {
                this.f28803d = i4;
            }
        }
        this.f28801b = str3;
        this.f28804e = str4;
        this.f28805f = i9;
        this.f28806g = j9;
        this.f28808j = c3902sE;
        this.f28807h = z6;
        this.i = str5;
        this.f28809k = bundle;
        this.f28810l = str6;
        this.f28811m = str7;
        this.f28812n = str8;
        this.f28813o = jSONObject;
        this.f28814p = jSONObject2;
        this.f28815q = str9;
        C3516l5 c3516l52 = AbstractC2806Ta.f28527a;
        this.f28816r = ((Long) c3516l52.r()).longValue() > 0 ? ((Long) c3516l52.r()).intValue() : i6;
        this.f28817s = j10;
        this.f28818t = j14;
    }
}
