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
    public final List f28003a;

    /* renamed from: b, reason: collision with root package name */
    public final String f28004b;

    /* renamed from: c, reason: collision with root package name */
    public final int f28005c;

    /* renamed from: d, reason: collision with root package name */
    public final int f28006d;

    /* renamed from: e, reason: collision with root package name */
    public final String f28007e;

    /* renamed from: f, reason: collision with root package name */
    public final int f28008f;

    /* renamed from: g, reason: collision with root package name */
    public final long f28009g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f28010h;
    public final String i;

    /* renamed from: j, reason: collision with root package name */
    public final C3879sE f28011j;

    /* renamed from: k, reason: collision with root package name */
    public final Bundle f28012k;

    /* renamed from: l, reason: collision with root package name */
    public final String f28013l;

    /* renamed from: m, reason: collision with root package name */
    public final String f28014m;

    /* renamed from: n, reason: collision with root package name */
    public final String f28015n;

    /* renamed from: o, reason: collision with root package name */
    public final JSONObject f28016o;

    /* renamed from: p, reason: collision with root package name */
    public final JSONObject f28017p;

    /* renamed from: q, reason: collision with root package name */
    public final String f28018q;

    /* renamed from: r, reason: collision with root package name */
    public final int f28019r;

    /* renamed from: s, reason: collision with root package name */
    public final long f28020s;

    /* renamed from: t, reason: collision with root package name */
    public final long f28021t;

    public Ut(JsonReader jsonReader) {
        String str;
        Bundle O8;
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
        C3879sE c3879sE = null;
        long j6 = -1;
        long j9 = 0;
        long j10 = -1;
        int i = 0;
        int i6 = -1;
        int i9 = 1;
        int i10 = 0;
        boolean z3 = false;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            if (Objects.equals(nextName, "nofill_urls")) {
                list = A8.b.H(jsonReader);
            } else if ("refresh_interval".equals(nextName)) {
                i = jsonReader.nextInt();
            } else if (Objects.equals(nextName, "refresh_load_delay_time_interval")) {
                i6 = jsonReader.nextInt();
            } else if ("gws_query_id".equals(nextName)) {
                str3 = jsonReader.nextString();
            } else if ("analytics_query_ad_event_id".equals(nextName)) {
                str4 = jsonReader.nextString();
            } else if ("is_idless".equals(nextName)) {
                z3 = jsonReader.nextBoolean();
            } else if ("response_code".equals(nextName)) {
                i10 = jsonReader.nextInt();
            } else if ("latency".equals(nextName)) {
                j9 = jsonReader.nextLong();
            } else {
                C3301ha c3301ha = AbstractC3569ma.w9;
                str = str2;
                q2.r rVar = q2.r.f40207e;
                long j11 = j6;
                if (((Boolean) rVar.f40210c.a(c3301ha)).booleanValue() && "public_error".equals(nextName) && jsonReader.peek() == JsonToken.BEGIN_OBJECT) {
                    C3879sE c3879sE2 = new C3879sE();
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
                    c3879sE2.f33928b = str10;
                    c3879sE = c3879sE2;
                } else if ("bidding_data".equals(nextName)) {
                    str5 = jsonReader.nextString();
                } else {
                    C3301ha c3301ha2 = AbstractC3569ma.Ob;
                    SharedPreferencesOnSharedPreferenceChangeListenerC3461ka sharedPreferencesOnSharedPreferenceChangeListenerC3461ka = rVar.f40210c;
                    if (((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC3461ka.a(c3301ha2)).booleanValue() && Objects.equals(nextName, "topics_should_record_observation")) {
                        jsonReader.nextBoolean();
                    } else if ("adapter_response_replacement_key".equals(nextName)) {
                        str9 = jsonReader.nextString();
                    } else if ("response_info_extras".equals(nextName)) {
                        if (((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC3461ka.a(AbstractC3569ma.f32037H7)).booleanValue()) {
                            try {
                                Bundle O9 = A8.b.O(A8.b.J(jsonReader));
                                if (O9 != null) {
                                    bundle = O9;
                                }
                            } catch (IOException | JSONException unused) {
                            } catch (IllegalStateException unused2) {
                                jsonReader.skipValue();
                            }
                        } else {
                            jsonReader.skipValue();
                        }
                    } else if ("adRequestPostBody".equals(nextName)) {
                        if (((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC3461ka.a(AbstractC3569ma.Da)).booleanValue()) {
                            str7 = jsonReader.nextString();
                        } else {
                            jsonReader.skipValue();
                        }
                    } else if (!"adRequestUrl".equals(nextName)) {
                        C3301ha c3301ha3 = AbstractC3569ma.Ea;
                        if (((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC3461ka.a(c3301ha3)).booleanValue() && Objects.equals(nextName, "adResponseBody")) {
                            str8 = jsonReader.nextString();
                        } else if (((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC3461ka.a(c3301ha3)).booleanValue() && Objects.equals(nextName, "adResponseHeaders")) {
                            jSONObject = A8.b.J(jsonReader);
                        } else {
                            if (Objects.equals(nextName, "max_parallel_renderers")) {
                                i9 = Math.max(1, jsonReader.nextInt());
                            } else if (((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC3461ka.a(AbstractC3569ma.Ma)).booleanValue() && Objects.equals(nextName, "inspector_ad_transaction_extras")) {
                                jSONObject2 = A8.b.J(jsonReader);
                            } else if (((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC3461ka.a(AbstractC3569ma.f32057K2)).booleanValue() && Objects.equals(nextName, "latency_extras")) {
                                try {
                                    O8 = A8.b.O(A8.b.J(jsonReader));
                                } catch (IOException | JSONException unused3) {
                                } catch (IllegalStateException unused4) {
                                }
                                if (O8 != null) {
                                    double d2 = O8.getDouble(com.anythink.core.common.d.g.f12329a);
                                    long j12 = (d2 > 9.223372036854776E18d || d2 < -9.223372036854776E18d) ? -1L : (long) d2;
                                    try {
                                        double d9 = O8.getDouble(com.anythink.core.common.d.g.f12330b);
                                        long j13 = (d9 > 9.223372036854776E18d || d9 < -9.223372036854776E18d) ? -1L : (long) d9;
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
                    } else if (((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC3461ka.a(AbstractC3569ma.Da)).booleanValue()) {
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
        this.f28003a = list;
        this.f28005c = i;
        if (((Boolean) AbstractC2817Va.f28202e.r()).booleanValue()) {
            this.f28006d = -1;
        } else {
            C3493l5 c3493l5 = AbstractC2548Fa.f24805a;
            if (((Long) c3493l5.r()).longValue() > -1) {
                this.f28006d = ((Long) c3493l5.r()).intValue();
            } else {
                this.f28006d = i6;
            }
        }
        this.f28004b = str3;
        this.f28007e = str4;
        this.f28008f = i10;
        this.f28009g = j9;
        this.f28011j = c3879sE;
        this.f28010h = z3;
        this.i = str5;
        this.f28012k = bundle;
        this.f28013l = str6;
        this.f28014m = str7;
        this.f28015n = str8;
        this.f28016o = jSONObject;
        this.f28017p = jSONObject2;
        this.f28018q = str9;
        C3493l5 c3493l52 = AbstractC2785Ta.f27740a;
        this.f28019r = ((Long) c3493l52.r()).longValue() > 0 ? ((Long) c3493l52.r()).intValue() : i9;
        this.f28020s = j10;
        this.f28021t = j14;
    }
}
