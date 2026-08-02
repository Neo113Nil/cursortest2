package bo.app;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline1;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.fragment.app.Fragment$5$$ExternalSyntheticOutline0;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import com.braze.support.BrazeLogger;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyIterator;
import kotlin.collections.EmptyList;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt___RangesKt;
import kotlin.sequences.SequencesKt___SequencesKt;
import kotlin.sequences.TransformingSequence$iterator$1;
import kotlin.text.StringsKt;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class re {
    public String A;
    public Long B;
    public long C;
    public long D;
    public long E;
    public Map F;
    public boolean G;
    public int H;
    public int I;
    public long a;
    public Set b;
    public Set c;
    public Set d;
    public int e;
    public int f;
    public int g;
    public boolean h;
    public boolean i;
    public boolean j;
    public long k;
    public boolean l;
    public boolean m;
    public int n;
    public boolean o;
    public long p;
    public boolean q;
    public int r;
    public int s;
    public boolean t;
    public boolean u;
    public long v;
    public int w;
    public int x;
    public int y;
    public boolean z;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public re(JSONObject jSONObject) {
        this();
        jSONObject.getClass();
        this.a = jSONObject.optLong("time", 0L);
        this.k = jSONObject.optLong("messaging_session_timeout", -1L);
        this.b = a(jSONObject, "events_blacklist");
        this.c = a(jSONObject, "attributes_blacklist");
        this.d = a(jSONObject, "purchases_blacklist");
        b(jSONObject);
        f(jSONObject);
        d(jSONObject);
        e(jSONObject);
        i(jSONObject);
        h(jSONObject);
        c(jSONObject);
        JSONObject optJSONObject = jSONObject.optJSONObject("request_backoff");
        if (optJSONObject != null) {
            this.w = optJSONObject.optInt("min_sleep_duration_ms", this.w);
            this.x = optJSONObject.optInt("max_sleep_duration_ms", this.x);
            this.y = optJSONObject.optInt("scale_factor", this.y);
        }
        j(jSONObject);
        a(jSONObject);
    }

    public static final String k(JSONObject jSONObject) {
        return "sdkDebuggerObject contains invalid values. Disabling SDK debugging. " + jSONObject;
    }

    public final void a(JSONObject jSONObject) {
        int i;
        JSONObject optJSONObject = jSONObject.optJSONObject("banners");
        if (optJSONObject != null) {
            try {
                this.G = optJSONObject.getBoolean("enabled");
                i = optJSONObject.getInt("max_placements");
                this.H = i;
            } catch (JSONException e) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e, false, (Function0) new pf$$ExternalSyntheticLambda0(21), 4, (Object) null);
            }
            if (this.G && i <= 0) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new re$$ExternalSyntheticLambda4(this, 0), 7, (Object) null);
                this.G = false;
                this.H = 0;
            }
            int optInt = optJSONObject.optInt("dismissals_cache_size", 200);
            this.I = optInt > 0 ? optInt : 200;
        }
    }

    public final void b(JSONObject jSONObject) {
        re reVar;
        boolean z;
        JSONObject optJSONObject = jSONObject.optJSONObject("content_cards");
        if (optJSONObject != null) {
            try {
                z = optJSONObject.getBoolean("enabled");
                reVar = this;
            } catch (JSONException e) {
                reVar = this;
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) reVar, BrazeLogger.Priority.E, (Throwable) e, false, (Function0) new pf$$ExternalSyntheticLambda0(19), 4, (Object) null);
                z = false;
            }
            reVar.j = z;
        }
    }

    public final void c(JSONObject jSONObject) {
        re reVar;
        boolean z;
        JSONObject optJSONObject = jSONObject.optJSONObject("dust");
        if (optJSONObject != null) {
            try {
                z = optJSONObject.getBoolean("enabled");
                reVar = this;
            } catch (JSONException e) {
                reVar = this;
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) reVar, BrazeLogger.Priority.E, (Throwable) e, false, (Function0) new pf$$ExternalSyntheticLambda0(23), 4, (Object) null);
                z = false;
            }
            reVar.t = z;
            reVar.u = optJSONObject.optBoolean("should_block_cc_refresh", false);
        }
    }

    public final void d(JSONObject jSONObject) {
        re reVar;
        boolean z;
        JSONObject optJSONObject = jSONObject.optJSONObject("ephemeral_events");
        if (optJSONObject != null) {
            try {
                z = optJSONObject.getBoolean("enabled");
                reVar = this;
            } catch (JSONException e) {
                reVar = this;
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) reVar, BrazeLogger.Priority.E, (Throwable) e, false, (Function0) new pf$$ExternalSyntheticLambda0(18), 4, (Object) null);
                z = false;
            }
            reVar.l = z;
        }
    }

    public final void e(JSONObject jSONObject) {
        JSONObject optJSONObject = jSONObject.optJSONObject("feature_flags");
        if (optJSONObject != null) {
            try {
                this.m = optJSONObject.optBoolean("enabled");
                this.n = optJSONObject.getInt("refresh_rate_limit");
            } catch (JSONException e) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e, false, (Function0) new pf$$ExternalSyntheticLambda0(24), 4, (Object) null);
                this.m = false;
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof re)) {
            return false;
        }
        re reVar = (re) obj;
        return this.a == reVar.a && Intrinsics.areEqual(this.b, reVar.b) && Intrinsics.areEqual(this.c, reVar.c) && Intrinsics.areEqual(this.d, reVar.d) && this.e == reVar.e && this.f == reVar.f && this.g == reVar.g && this.h == reVar.h && this.i == reVar.i && this.j == reVar.j && this.k == reVar.k && this.l == reVar.l && this.m == reVar.m && this.n == reVar.n && this.o == reVar.o && this.p == reVar.p && this.q == reVar.q && this.r == reVar.r && this.s == reVar.s && this.t == reVar.t && this.u == reVar.u && this.v == reVar.v && this.w == reVar.w && this.x == reVar.x && this.y == reVar.y && this.z == reVar.z && Intrinsics.areEqual(this.A, reVar.A) && Intrinsics.areEqual(this.B, reVar.B) && this.C == reVar.C && this.D == reVar.D && this.E == reVar.E && Intrinsics.areEqual(this.F, reVar.F) && this.G == reVar.G && this.H == reVar.H && this.I == reVar.I;
    }

    public final void f(JSONObject jSONObject) {
        JSONObject optJSONObject = jSONObject.optJSONObject("geofences");
        if (optJSONObject != null) {
            try {
                this.e = optJSONObject.getInt("min_time_since_last_request");
                this.f = optJSONObject.getInt("min_time_since_last_report");
                this.i = optJSONObject.getBoolean("enabled");
                this.h = true;
                this.g = optJSONObject.optInt("max_num_to_register", 20);
            } catch (JSONException e) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e, false, (Function0) new pf$$ExternalSyntheticLambda0(22), 4, (Object) null);
                this.e = -1;
                this.f = -1;
                this.g = -1;
                this.i = false;
                this.h = false;
            }
        }
    }

    public final void g(JSONObject jSONObject) {
        JSONObject optJSONObject = jSONObject.optJSONObject("endpoint_overrides");
        if (optJSONObject != null) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            Iterator<String> keys = optJSONObject.keys();
            keys.getClass();
            while (keys.hasNext()) {
                String next = keys.next();
                b9 b9Var = c9.b;
                next.getClass();
                b9Var.getClass();
                c9 c9Var = (c9) c9.c.get(next);
                if (c9Var != null) {
                    JSONObject jSONObject2 = optJSONObject.getJSONObject(next);
                    int i = jSONObject2.getInt("capacity");
                    int i2 = jSONObject2.getInt("refill_rate");
                    if (i > 0 && i2 > 0) {
                        linkedHashMap.put(c9Var, new oe(i, i2));
                    }
                }
            }
            if (linkedHashMap.isEmpty()) {
                return;
            }
            this.F = linkedHashMap;
        }
    }

    public final void h(JSONObject jSONObject) {
        try {
            JSONObject optJSONObject = jSONObject.optJSONObject("global_request_rate_limit");
            if (optJSONObject != null) {
                if (!optJSONObject.getBoolean("enabled")) {
                    this.q = false;
                    return;
                }
                int i = optJSONObject.getInt("refill_rate");
                int i2 = optJSONObject.getInt("capacity");
                if (i2 < 10) {
                    this.q = false;
                } else {
                    if (i <= 0) {
                        return;
                    }
                    this.q = true;
                    this.s = i2;
                    this.r = i;
                    g(optJSONObject);
                }
            }
        } catch (Exception e) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e, false, (Function0) new pf$$ExternalSyntheticLambda0(17), 4, (Object) null);
            this.q = false;
            this.F = null;
        }
    }

    public final int hashCode() {
        int hashCode = Long.hashCode(this.a) * 31;
        Set set = this.b;
        int hashCode2 = (hashCode + (set == null ? 0 : set.hashCode())) * 31;
        Set set2 = this.c;
        int hashCode3 = (hashCode2 + (set2 == null ? 0 : set2.hashCode())) * 31;
        Set set3 = this.d;
        int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.y, JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.x, JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.w, Recorder$$ExternalSyntheticOutline2.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.s, JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.r, JsonLogicResult$Success$$ExternalSyntheticOutline0.m(Recorder$$ExternalSyntheticOutline2.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.n, JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(Recorder$$ExternalSyntheticOutline2.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.g, JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.f, JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.e, (hashCode3 + (set3 == null ? 0 : set3.hashCode())) * 31, 31), 31), 31), 31, this.h), 31, this.i), 31, this.j), 31, this.k), 31, this.l), 31, this.m), 31), 31, this.o), 31, this.p), 31, this.q), 31), 31), 31, this.t), 31, this.u), 31, this.v), 31), 31), 31), 31, this.z);
        String str = this.A;
        int hashCode4 = (m + (str == null ? 0 : str.hashCode())) * 31;
        Long l = this.B;
        int m2 = Recorder$$ExternalSyntheticOutline2.m(Recorder$$ExternalSyntheticOutline2.m(Recorder$$ExternalSyntheticOutline2.m((hashCode4 + (l == null ? 0 : l.hashCode())) * 31, 31, this.C), 31, this.D), 31, this.E);
        Map map = this.F;
        return Integer.hashCode(this.I) + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.H, JsonLogicResult$Success$$ExternalSyntheticOutline0.m((m2 + (map != null ? map.hashCode() : 0)) * 31, 31, this.G), 31);
    }

    public final void i(JSONObject jSONObject) {
        JSONObject optJSONObject = jSONObject.optJSONObject("push_max");
        if (optJSONObject != null) {
            try {
                this.o = optJSONObject.optBoolean("enabled");
                this.p = optJSONObject.optLong("redeliver_buffer", 86400L);
                this.v = optJSONObject.optLong("redeliver_dedupe_buffer", -1L);
            } catch (JSONException e) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e, false, (Function0) new pf$$ExternalSyntheticLambda0(20), 4, (Object) null);
                this.o = false;
                this.p = 0L;
                this.v = -1L;
            }
        }
    }

    public final void j(JSONObject jSONObject) {
        JSONObject optJSONObject = jSONObject.optJSONObject("sdk_debugger");
        if (optJSONObject == null) {
            return;
        }
        try {
            td a = xd.k.a(optJSONObject, false);
            if (a.a) {
                this.z = true;
                this.A = a.c;
                Long l = a.b;
                if (l != null) {
                    this.B = Long.valueOf(l.longValue());
                }
                this.C = a.d;
                this.D = a.e;
                this.E = a.f;
            }
            String str = this.A;
            if (str != null && !StringsKt.isBlank(str) && this.C > 0 && this.D > 0 && this.E > 0) {
                return;
            }
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new l$$ExternalSyntheticLambda2(optJSONObject, 8), 7, (Object) null);
        } catch (JSONException e) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e, false, (Function0) new pf$$ExternalSyntheticLambda0(16), 4, (Object) null);
        }
        this.z = false;
        this.A = null;
        this.C = 0L;
        this.D = 0L;
        this.E = 0L;
    }

    public final String toString() {
        long j = this.a;
        Set set = this.b;
        Set set2 = this.c;
        Set set3 = this.d;
        int i = this.e;
        int i2 = this.f;
        int i3 = this.g;
        boolean z = this.h;
        boolean z2 = this.i;
        boolean z3 = this.j;
        long j2 = this.k;
        boolean z4 = this.l;
        boolean z5 = this.m;
        int i4 = this.n;
        boolean z6 = this.o;
        long j3 = this.p;
        boolean z7 = this.q;
        int i5 = this.r;
        int i6 = this.s;
        boolean z8 = this.t;
        boolean z9 = this.u;
        long j4 = this.v;
        int i7 = this.w;
        int i8 = this.x;
        int i9 = this.y;
        boolean z10 = this.z;
        String str = this.A;
        Long l = this.B;
        long j5 = this.C;
        long j6 = this.D;
        long j7 = this.E;
        Map map = this.F;
        boolean z11 = this.G;
        int i10 = this.H;
        int i11 = this.I;
        StringBuilder sb = new StringBuilder("ServerConfig(configTime=");
        sb.append(j);
        sb.append(", blocklistedEvents=");
        sb.append(set);
        sb.append(", blocklistedAttributes=");
        sb.append(set2);
        sb.append(", blocklistedPurchases=");
        sb.append(set3);
        Fragment$5$$ExternalSyntheticOutline0.m(i, i2, ", minTimeSinceLastRequest=", ", minTimeSinceLastReport=", sb);
        sb.append(", maxNumToRegister=");
        sb.append(i3);
        sb.append(", geofencesEnabledSet=");
        sb.append(z);
        sb.append(", geofencesEnabled=");
        sb.append(z2);
        sb.append(", isContentCardsFeatureEnabled=");
        sb.append(z3);
        Boxes$$ExternalSyntheticOutline1.m1151m(j2, ", messagingSessionTimeout=", ", ephemeralEventsEnabled=", sb);
        re$$ExternalSyntheticOutline0.m(sb, z4, ", featureFlagsEnabled=", z5, ", featureFlagsRefreshRateLimit=");
        sb.append(i4);
        sb.append(", pushMaxEnabled=");
        sb.append(z6);
        sb.append(", pushMaxRedeliverBuffer=");
        sb.append(j3);
        sb.append(", globalRequestRateLimitEnabled=");
        sb.append(z7);
        Fragment$5$$ExternalSyntheticOutline0.m(i5, i6, ", globalRequestRateLimitBucketRefillRate=", ", globalRequestRateLimitBucketCapacity=", sb);
        sb.append(", isDustFeatureEnabled=");
        sb.append(z8);
        sb.append(", dustShouldBlockCcRefresh=");
        sb.append(z9);
        Boxes$$ExternalSyntheticOutline1.m1151m(j4, ", pushMaxRedeliverDedupeBuffer=", ", defaultBackoffMinSleepMs=", sb);
        Recorder$$ExternalSyntheticOutline1.m105m(i7, i8, ", defaultBackoffMaxSleepMs=", ", defaultBackoffScaleFactor=", sb);
        sb.append(i9);
        sb.append(", sdkDebuggerEnabled=");
        sb.append(z10);
        sb.append(", sdkDebuggerAuthCode=");
        Request$Priority$EnumUnboxingLocalUtility.m(l, str, ", sdkDebuggerExpirationTime=", ", sdkDebuggerFlushIntervalBytes=", sb);
        sb.append(j5);
        Boxes$$ExternalSyntheticOutline1.m1151m(j6, ", sdkDebuggerFlushIntervalSeconds=", ", sdkDebuggerMaxPayloadBytes=", sb);
        sb.append(j7);
        sb.append(", globalRequestRateLimitOverrides=");
        sb.append(map);
        sb.append(", bannersEnabled=");
        sb.append(z11);
        sb.append(", maxBannerPlacements=");
        sb.append(i10);
        return re$$ExternalSyntheticOutline0.m(i11, ", dismissalsCacheSize=", ")", sb);
    }

    public static final String b() {
        return "Error getting required content cards fields. Using defaults.";
    }

    public static final String d() {
        return "Error getting required ephemeral events fields. Using defaults.";
    }

    public static final String c() {
        return "Error getting required DUST enabled field. Using default of false.";
    }

    public static final String e() {
        return "Error getting required feature flag fields. Disabling feature flags.";
    }

    public static final String i() {
        return "Error getting required SDK debugging fields. Disabling SDK debugging.";
    }

    public static final String f() {
        return "Error getting required geofence fields. Using defaults.";
    }

    public static final String h() {
        return "Error getting required push max fields. Disabling push max.";
    }

    public static final String a(re reVar) {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(reVar.H, "Banners enabled but maxBannerPlacement is ", ". Not enabling banners.");
    }

    public static final String a() {
        return "Error getting required banner configuration fields. Disabling banners.";
    }

    public static final String g() {
        return "Caught error parsing global rate limit config.";
    }

    public static HashSet a(JSONObject jSONObject, String str) {
        Iterator transformingSequence$iterator$1;
        HashSet hashSet = new HashSet();
        if (jSONObject.has(str)) {
            JSONArray optJSONArray = jSONObject.optJSONArray(str);
            if (optJSONArray == null) {
                EmptyList.INSTANCE.getClass();
                transformingSequence$iterator$1 = EmptyIterator.INSTANCE;
            } else {
                transformingSequence$iterator$1 = new TransformingSequence$iterator$1(SequencesKt___SequencesKt.map(SequencesKt___SequencesKt.filter(CollectionsKt.asSequence(RangesKt___RangesKt.until(0, optJSONArray.length())), new pe(optJSONArray)), new qe(optJSONArray)));
            }
            while (transformingSequence$iterator$1.hasNext()) {
                hashSet.add((String) transformingSequence$iterator$1.next());
            }
        }
        return hashSet;
    }

    public re() {
        int i = ue.f;
        int i2 = ue.g;
        this.a = 0L;
        this.b = null;
        this.c = null;
        this.d = null;
        this.e = -1;
        this.f = -1;
        this.g = -1;
        this.h = false;
        this.i = false;
        this.j = false;
        this.k = -1L;
        this.l = false;
        this.m = false;
        this.n = -1;
        this.o = false;
        this.p = 86400L;
        this.q = true;
        this.r = 30;
        this.s = 30;
        this.t = false;
        this.u = false;
        this.v = -1L;
        this.w = i;
        this.x = i2;
        this.y = 3;
        this.z = false;
        this.A = null;
        this.B = null;
        this.C = 0L;
        this.D = 0L;
        this.E = 0L;
        this.F = null;
        this.G = false;
        this.H = 0;
        this.I = 200;
    }
}
