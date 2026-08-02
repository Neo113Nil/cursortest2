package bo.app;

import android.content.Context;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import com.braze.enums.DataStoreKey;
import com.braze.enums.DataStoreValueType;
import com.braze.storage.DataStoreProvider;
import com.braze.support.BrazeLogger;
import com.braze.support.DataStoreUtils;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.collections.EmptySet;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.sync.Mutex;
import kotlinx.coroutines.sync.MutexImpl;
import kotlinx.serialization.internal.HashSetSerializer;
import kotlinx.serialization.internal.StringSerializer;
import kotlinx.serialization.json.Json;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class ue {
    public static final int f = 10000;
    public static final int g = 300000;
    public final r7 a;
    public final com.braze.storage.p b;
    public final ReentrantLock c;
    public final Mutex d;
    public re e;

    public ue(Context context, String str, r7 r7Var) {
        ue ueVar;
        Map x;
        context.getClass();
        str.getClass();
        r7Var.getClass();
        this.a = r7Var;
        com.braze.storage.p pVar = new com.braze.storage.p(context, str);
        this.b = pVar;
        ReentrantLock reentrantLock = new ReentrantLock();
        this.c = reentrantLock;
        this.d = new MutexImpl();
        DataStoreKey dataStoreKey = DataStoreKey.LAST_ACCESSED_SDK_VERSION;
        String readString = pVar.readString(dataStoreKey, "");
        if ("42.2.0".equals(readString)) {
            ueVar = this;
        } else {
            ueVar = this;
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) ueVar, BrazeLogger.Priority.V, (Throwable) null, false, (Function0) new o6$$ExternalSyntheticLambda2(readString, 24), 6, (Object) null);
            pVar.writeData(DataStoreKey.CONFIG_TIME, 0L);
            pVar.writeData(dataStoreKey, "42.2.0");
        }
        re reVar = new re();
        reVar.c = ueVar.e();
        reVar.b = ueVar.f();
        reVar.d = ueVar.g();
        reVar.a = ueVar.i();
        reVar.k = ueVar.s();
        reVar.e = ueVar.u();
        reVar.f = ueVar.t();
        reVar.g = ueVar.r();
        reVar.i = ueVar.J();
        reVar.h = ueVar.K();
        reVar.j = ueVar.F();
        reVar.l = ueVar.H();
        reVar.m = ueVar.I();
        reVar.n = ueVar.n();
        reVar.o = ueVar.M();
        reVar.p = ueVar.v();
        reVar.t = ueVar.G();
        reVar.u = ueVar.E();
        reVar.q = ueVar.L();
        reVar.r = ueVar.p();
        reVar.s = ueVar.o();
        reVar.v = ueVar.w();
        reVar.y = ueVar.l();
        reVar.w = ueVar.k();
        reVar.x = ueVar.j();
        reVar.z = ueVar.N();
        reVar.A = ueVar.z();
        reVar.C = ueVar.B();
        reVar.D = ueVar.C();
        reVar.E = ueVar.D();
        reVar.B = Long.valueOf(ueVar.A());
        reentrantLock.lock();
        try {
            re reVar2 = ueVar.e;
            try {
                if (reVar2 != null) {
                    x = reVar2.F;
                    if (x == null) {
                    }
                    reentrantLock.unlock();
                    reVar.F = x;
                    reVar.G = ueVar.d();
                    reVar.H = ueVar.q();
                    reVar.I = ueVar.m();
                    reentrantLock.lock();
                    ueVar.e = reVar;
                    return;
                }
                ueVar.e = reVar;
                return;
            } finally {
                reentrantLock.unlock();
            }
            x = ueVar.x();
            reentrantLock.unlock();
            reVar.F = x;
            reVar.G = ueVar.d();
            reVar.H = ueVar.q();
            reVar.I = ueVar.m();
            reentrantLock.lock();
        } catch (Throwable th) {
            throw th;
        }
    }

    public static final String P() {
        return "Attempting to unlock server config info";
    }

    public static final String Q() {
        return "Unlocking config info lock.";
    }

    public static final String R() {
        return "Tried to unlock server config info when not locked.";
    }

    public static final String S() {
        return "Could not persist server config to DataStore.";
    }

    public static final String T() {
        return "Could not persist server config to DataStore.";
    }

    public static final String U() {
        return "Server config is older than previous config time. Not sending out ConfigChangeEvent.";
    }

    public static final String b(re reVar) {
        return "Finishing updating server config to " + reVar;
    }

    public static final String c() {
        return "Not allowing server config info unlock. Returning null.";
    }

    public static final String h() {
        return "Experienced exception retrieving blocklisted strings from local storage. Returning empty set.";
    }

    public static final String y() {
        return "Failed to parse endpoint override from storage";
    }

    public final long A() {
        long j;
        long longValue;
        Long l;
        ReentrantLock reentrantLock = this.c;
        reentrantLock.lock();
        try {
            re reVar = this.e;
            if (reVar == null || (l = reVar.B) == null) {
                j = -1;
                Long readLong = this.b.readLong(DataStoreKey.SDK_DEBUGGER_EXPIRATION_TIME, -1L);
                if (readLong != null) {
                    longValue = readLong.longValue();
                }
                reentrantLock.unlock();
                return j;
            }
            longValue = l.longValue();
            j = longValue;
            reentrantLock.unlock();
            return j;
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final long B() {
        long j;
        long longValue;
        ReentrantLock reentrantLock = this.c;
        reentrantLock.lock();
        try {
            re reVar = this.e;
            if (reVar == null) {
                j = 0;
                Long readLong = this.b.readLong(DataStoreKey.SDK_DEBUGGER_FLUSH_INTERVAL_BYTES, 0L);
                if (readLong != null) {
                    longValue = readLong.longValue();
                }
                reentrantLock.unlock();
                return j;
            }
            longValue = reVar.C;
            j = longValue;
            reentrantLock.unlock();
            return j;
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final long C() {
        long j;
        long longValue;
        ReentrantLock reentrantLock = this.c;
        reentrantLock.lock();
        try {
            re reVar = this.e;
            if (reVar == null) {
                j = 0;
                Long readLong = this.b.readLong(DataStoreKey.SDK_DEBUGGER_FLUSH_INTERVAL_SECONDS, 0L);
                if (readLong != null) {
                    longValue = readLong.longValue();
                }
                reentrantLock.unlock();
                return j;
            }
            longValue = reVar.D;
            j = longValue;
            reentrantLock.unlock();
            return j;
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final long D() {
        long j;
        long longValue;
        ReentrantLock reentrantLock = this.c;
        reentrantLock.lock();
        try {
            re reVar = this.e;
            if (reVar == null) {
                j = 0;
                Long readLong = this.b.readLong(DataStoreKey.SDK_DEBUGGER_MAX_PAYLOAD_BYTES, 0L);
                if (readLong != null) {
                    longValue = readLong.longValue();
                }
                reentrantLock.unlock();
                return j;
            }
            longValue = reVar.E;
            j = longValue;
            reentrantLock.unlock();
            return j;
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final boolean E() {
        boolean booleanValue;
        ReentrantLock reentrantLock = this.c;
        reentrantLock.lock();
        try {
            re reVar = this.e;
            if (reVar != null) {
                booleanValue = reVar.u;
            } else {
                Boolean readBoolean = this.b.readBoolean(DataStoreKey.DUST_SHOULD_BLOCK_CC_REFRESH, Boolean.FALSE);
                booleanValue = readBoolean != null ? readBoolean.booleanValue() : false;
            }
            reentrantLock.unlock();
            return booleanValue;
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final boolean F() {
        boolean booleanValue;
        ReentrantLock reentrantLock = this.c;
        reentrantLock.lock();
        try {
            re reVar = this.e;
            if (reVar != null) {
                booleanValue = reVar.j;
            } else {
                Boolean readBoolean = this.b.readBoolean(DataStoreKey.CONTENT_CARDS_ENABLED, Boolean.FALSE);
                booleanValue = readBoolean != null ? readBoolean.booleanValue() : false;
            }
            reentrantLock.unlock();
            return booleanValue;
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final boolean G() {
        boolean booleanValue;
        ReentrantLock reentrantLock = this.c;
        reentrantLock.lock();
        try {
            re reVar = this.e;
            if (reVar != null) {
                booleanValue = reVar.t;
            } else {
                Boolean readBoolean = this.b.readBoolean(DataStoreKey.DUST_ENABLED, Boolean.FALSE);
                booleanValue = readBoolean != null ? readBoolean.booleanValue() : false;
            }
            reentrantLock.unlock();
            return booleanValue;
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final boolean H() {
        boolean booleanValue;
        ReentrantLock reentrantLock = this.c;
        reentrantLock.lock();
        try {
            re reVar = this.e;
            if (reVar != null) {
                booleanValue = reVar.l;
            } else {
                Boolean readBoolean = this.b.readBoolean(DataStoreKey.EPHEMERAL_EVENTS_ENABLED, Boolean.FALSE);
                booleanValue = readBoolean != null ? readBoolean.booleanValue() : false;
            }
            reentrantLock.unlock();
            return booleanValue;
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final boolean I() {
        boolean booleanValue;
        ReentrantLock reentrantLock = this.c;
        reentrantLock.lock();
        try {
            re reVar = this.e;
            if (reVar != null) {
                booleanValue = reVar.m;
            } else {
                Boolean readBoolean = this.b.readBoolean(DataStoreKey.FEATURE_FLAGS_ENABLED, Boolean.FALSE);
                booleanValue = readBoolean != null ? readBoolean.booleanValue() : false;
            }
            reentrantLock.unlock();
            return booleanValue;
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final boolean J() {
        boolean booleanValue;
        ReentrantLock reentrantLock = this.c;
        reentrantLock.lock();
        try {
            re reVar = this.e;
            if (reVar != null) {
                booleanValue = reVar.i;
            } else {
                Boolean readBoolean = this.b.readBoolean(DataStoreKey.GEOFENCES_ENABLED, Boolean.FALSE);
                booleanValue = readBoolean != null ? readBoolean.booleanValue() : false;
            }
            reentrantLock.unlock();
            return booleanValue;
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final boolean K() {
        boolean booleanValue;
        ReentrantLock reentrantLock = this.c;
        reentrantLock.lock();
        try {
            re reVar = this.e;
            if (reVar != null) {
                booleanValue = reVar.h;
            } else {
                Boolean readBoolean = this.b.readBoolean(DataStoreKey.GEOFENCES_ENABLED_SET, Boolean.FALSE);
                booleanValue = readBoolean != null ? readBoolean.booleanValue() : false;
            }
            reentrantLock.unlock();
            return booleanValue;
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final boolean L() {
        boolean booleanValue;
        ReentrantLock reentrantLock = this.c;
        reentrantLock.lock();
        try {
            re reVar = this.e;
            if (reVar != null) {
                booleanValue = reVar.q;
            } else {
                Boolean readBoolean = this.b.readBoolean(DataStoreKey.GLOBAL_REQUEST_RATE_LIMITING_ENABLED, Boolean.TRUE);
                booleanValue = readBoolean != null ? readBoolean.booleanValue() : true;
            }
            reentrantLock.unlock();
            return booleanValue;
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final boolean M() {
        boolean booleanValue;
        ReentrantLock reentrantLock = this.c;
        reentrantLock.lock();
        try {
            re reVar = this.e;
            if (reVar != null) {
                booleanValue = reVar.o;
            } else {
                Boolean readBoolean = this.b.readBoolean(DataStoreKey.PUSH_MAX_ENABLED, Boolean.FALSE);
                booleanValue = readBoolean != null ? readBoolean.booleanValue() : false;
            }
            reentrantLock.unlock();
            return booleanValue;
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final boolean N() {
        boolean booleanValue;
        ReentrantLock reentrantLock = this.c;
        reentrantLock.lock();
        try {
            re reVar = this.e;
            if (reVar != null) {
                booleanValue = reVar.z;
            } else {
                Boolean readBoolean = this.b.readBoolean(DataStoreKey.SDK_DEBUGGER_ENABLED, Boolean.FALSE);
                booleanValue = readBoolean != null ? readBoolean.booleanValue() : false;
            }
            reentrantLock.unlock();
            return booleanValue;
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final void O() {
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        BrazeLogger.brazelog$default(brazeLogger, (Object) this, BrazeLogger.Priority.V, (Throwable) null, false, (Function0) new w$$ExternalSyntheticLambda0(14), 6, (Object) null);
        if (this.d.isLocked()) {
            BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new w$$ExternalSyntheticLambda0(15), 7, (Object) null);
            try {
                this.d.unlock(null);
            } catch (IllegalStateException e) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e, false, (Function0) new w$$ExternalSyntheticLambda0(16), 4, (Object) null);
            }
        }
    }

    public final void a(re reVar) {
        String str;
        String str2;
        reVar.getClass();
        ReentrantLock reentrantLock = this.c;
        reentrantLock.lock();
        try {
            re reVar2 = this.e;
            this.e = reVar;
            reentrantLock.unlock();
            try {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                Set set = reVar.b;
                String str3 = "[]";
                if (set != null) {
                    String key = DataStoreKey.BLOCKLISTED_EVENTS.getKey();
                    DataStoreUtils dataStoreUtils = DataStoreUtils.INSTANCE;
                    List list = CollectionsKt.toList(set);
                    try {
                        Json.Default r0 = Json.Default;
                        r0.getClass();
                        str2 = r0.encodeToString(new HashSetSerializer(StringSerializer.INSTANCE, 1), list);
                    } catch (Exception e) {
                        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) dataStoreUtils, BrazeLogger.Priority.E, (Throwable) e, false, (Function0) DataStoreUtils.e.a, 4, (Object) null);
                        str2 = (!(list instanceof Map) && (list instanceof List)) ? "[]" : "{}";
                    }
                    linkedHashMap.put(key, str2);
                }
                Set set2 = reVar.c;
                if (set2 != null) {
                    String key2 = DataStoreKey.BLOCKLISTED_ATTRIBUTES.getKey();
                    DataStoreUtils dataStoreUtils2 = DataStoreUtils.INSTANCE;
                    List list2 = CollectionsKt.toList(set2);
                    try {
                        Json.Default r02 = Json.Default;
                        r02.getClass();
                        str = r02.encodeToString(new HashSetSerializer(StringSerializer.INSTANCE, 1), list2);
                    } catch (Exception e2) {
                        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) dataStoreUtils2, BrazeLogger.Priority.E, (Throwable) e2, false, (Function0) DataStoreUtils.e.a, 4, (Object) null);
                        str = (!(list2 instanceof Map) && (list2 instanceof List)) ? "[]" : "{}";
                    }
                    linkedHashMap.put(key2, str);
                }
                Set set3 = reVar.d;
                if (set3 != null) {
                    String key3 = DataStoreKey.BLOCKLISTED_PURCHASES.getKey();
                    DataStoreUtils dataStoreUtils3 = DataStoreUtils.INSTANCE;
                    List list3 = CollectionsKt.toList(set3);
                    try {
                        Json.Default r03 = Json.Default;
                        r03.getClass();
                        str3 = r03.encodeToString(new HashSetSerializer(StringSerializer.INSTANCE, 1), list3);
                    } catch (Exception e3) {
                        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) dataStoreUtils3, BrazeLogger.Priority.E, (Throwable) e3, false, (Function0) DataStoreUtils.e.a, 4, (Object) null);
                        if ((list3 instanceof Map) || !(list3 instanceof List)) {
                            str3 = "{}";
                        }
                    }
                    linkedHashMap.put(key3, str3);
                }
                Map map = reVar.F;
                if (map != null) {
                    JSONObject jSONObject = new JSONObject();
                    for (Map.Entry entry : map.entrySet()) {
                        c9 c9Var = (c9) entry.getKey();
                        oe oeVar = (oe) entry.getValue();
                        jSONObject.put(c9Var.name(), new JSONObject().put("refill", oeVar.b).put("capacity", oeVar.a));
                    }
                    linkedHashMap.put(DataStoreKey.GLOBAL_REQUEST_RATE_LIMIT_ENDPOINT_OVERRIDES.getKey(), jSONObject.toString());
                }
                linkedHashMap.put(DataStoreKey.CONFIG_TIME.getKey(), Long.valueOf(reVar.a));
                linkedHashMap.put(DataStoreKey.EPHEMERAL_EVENTS_ENABLED.getKey(), Boolean.valueOf(reVar.l));
                linkedHashMap.put(DataStoreKey.GEOFENCES_ENABLED_SET.getKey(), Boolean.valueOf(reVar.h));
                linkedHashMap.put(DataStoreKey.GEOFENCES_ENABLED.getKey(), Boolean.valueOf(reVar.i));
                linkedHashMap.put(DataStoreKey.GEOFENCES_MIN_TIME_REQUEST.getKey(), Integer.valueOf(reVar.e));
                linkedHashMap.put(DataStoreKey.GEOFENCES_MIN_TIME_REPORT.getKey(), Integer.valueOf(reVar.f));
                linkedHashMap.put(DataStoreKey.GEOFENCES_MAX_NUM_TO_REGISTER.getKey(), Integer.valueOf(reVar.g));
                linkedHashMap.put(DataStoreKey.MESSAGING_SESSION_TIMEOUT.getKey(), Long.valueOf(reVar.k));
                linkedHashMap.put(DataStoreKey.DUST_ENABLED.getKey(), Boolean.valueOf(reVar.t));
                linkedHashMap.put(DataStoreKey.DUST_SHOULD_BLOCK_CC_REFRESH.getKey(), Boolean.valueOf(reVar.u));
                linkedHashMap.put(DataStoreKey.CONTENT_CARDS_ENABLED.getKey(), Boolean.valueOf(reVar.j));
                linkedHashMap.put(DataStoreKey.FEATURE_FLAGS_ENABLED.getKey(), Boolean.valueOf(reVar.m));
                linkedHashMap.put(DataStoreKey.FEATURE_FLAGS_RATE_REFRESH_RATE_LIMIT.getKey(), Integer.valueOf(reVar.n));
                linkedHashMap.put(DataStoreKey.PUSH_MAX_ENABLED.getKey(), Boolean.valueOf(reVar.o));
                linkedHashMap.put(DataStoreKey.PUSH_MAX_REDELIVER_BUFFER.getKey(), Long.valueOf(reVar.p));
                linkedHashMap.put(DataStoreKey.PUSH_MAX_REDELIVER_DEDUPE_BUFFER.getKey(), Long.valueOf(reVar.v));
                linkedHashMap.put(DataStoreKey.GLOBAL_REQUEST_RATE_LIMITING_ENABLED.getKey(), Boolean.valueOf(reVar.q));
                linkedHashMap.put(DataStoreKey.GLOBAL_REQUEST_RATE_LIMITING_CAPACITY.getKey(), Integer.valueOf(reVar.s));
                linkedHashMap.put(DataStoreKey.GLOBAL_REQUEST_RATE_LIMITING_REFILL_RATE.getKey(), Integer.valueOf(reVar.r));
                linkedHashMap.put(DataStoreKey.DEFAULT_REQUEST_BACKOFF_MIN_SLEEP_DURATION_MS.getKey(), Integer.valueOf(reVar.w));
                linkedHashMap.put(DataStoreKey.DEFAULT_REQUEST_BACKOFF_MAX_SLEEP_DURATION_MS.getKey(), Integer.valueOf(reVar.x));
                linkedHashMap.put(DataStoreKey.DEFAULT_REQUEST_BACKOFF_SCALE_FACTOR.getKey(), Integer.valueOf(reVar.y));
                linkedHashMap.put(DataStoreKey.SDK_DEBUGGER_ENABLED.getKey(), Boolean.valueOf(reVar.z));
                Long l = reVar.B;
                if (l != null) {
                    linkedHashMap.put(DataStoreKey.SDK_DEBUGGER_EXPIRATION_TIME.getKey(), Long.valueOf(l.longValue()));
                }
                String str4 = reVar.A;
                if (str4 != null) {
                    linkedHashMap.put(DataStoreKey.SDK_DEBUGGER_AUTHORIZATION_CODE.getKey(), str4);
                }
                linkedHashMap.put(DataStoreKey.SDK_DEBUGGER_FLUSH_INTERVAL_BYTES.getKey(), Long.valueOf(reVar.C));
                linkedHashMap.put(DataStoreKey.SDK_DEBUGGER_FLUSH_INTERVAL_SECONDS.getKey(), Long.valueOf(reVar.D));
                linkedHashMap.put(DataStoreKey.SDK_DEBUGGER_MAX_PAYLOAD_BYTES.getKey(), Long.valueOf(reVar.E));
                linkedHashMap.put(DataStoreKey.BANNERS_ENABLED.getKey(), Boolean.valueOf(reVar.G));
                linkedHashMap.put(DataStoreKey.MAX_BANNER_PLACEMENTS.getKey(), Integer.valueOf(reVar.H));
                linkedHashMap.put(DataStoreKey.BANNERS_DISMISSALS_CACHE_SIZE.getKey(), Integer.valueOf(reVar.I));
                this.b.batchUpdate(linkedHashMap, EmptySet.INSTANCE);
            } catch (Exception e4) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e4, false, (Function0) new w$$ExternalSyntheticLambda0(13), 4, (Object) null);
            }
            BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
            BrazeLogger.brazelog$default(brazeLogger, (Object) this, BrazeLogger.Priority.V, (Throwable) null, false, (Function0) new re$$ExternalSyntheticLambda4(reVar, 1), 6, (Object) null);
            if (reVar2 != null) {
                if (reVar.a > reVar2.a) {
                    this.a.b(new o3(reVar2, reVar), o3.class);
                } else {
                    BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new w$$ExternalSyntheticLambda0(17), 7, (Object) null);
                }
            }
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final boolean d() {
        boolean booleanValue;
        ReentrantLock reentrantLock = this.c;
        reentrantLock.lock();
        try {
            re reVar = this.e;
            if (reVar != null) {
                booleanValue = reVar.G;
            } else {
                Boolean readBoolean = this.b.readBoolean(DataStoreKey.BANNERS_ENABLED, Boolean.FALSE);
                booleanValue = readBoolean != null ? readBoolean.booleanValue() : false;
            }
            reentrantLock.unlock();
            return booleanValue;
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final Set e() {
        Set a;
        ReentrantLock reentrantLock = this.c;
        reentrantLock.lock();
        try {
            re reVar = this.e;
            if (reVar != null) {
                a = reVar.c;
                if (a == null) {
                }
                reentrantLock.unlock();
                return a;
            }
            a = a(DataStoreKey.BLOCKLISTED_ATTRIBUTES);
            reentrantLock.unlock();
            return a;
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final Set f() {
        Set a;
        ReentrantLock reentrantLock = this.c;
        reentrantLock.lock();
        try {
            re reVar = this.e;
            if (reVar != null) {
                a = reVar.b;
                if (a == null) {
                }
                reentrantLock.unlock();
                return a;
            }
            a = a(DataStoreKey.BLOCKLISTED_EVENTS);
            reentrantLock.unlock();
            return a;
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final Set g() {
        Set a;
        ReentrantLock reentrantLock = this.c;
        reentrantLock.lock();
        try {
            re reVar = this.e;
            if (reVar != null) {
                a = reVar.d;
                if (a == null) {
                }
                reentrantLock.unlock();
                return a;
            }
            a = a(DataStoreKey.BLOCKLISTED_PURCHASES);
            reentrantLock.unlock();
            return a;
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final long i() {
        long j;
        long longValue;
        ReentrantLock reentrantLock = this.c;
        reentrantLock.lock();
        try {
            re reVar = this.e;
            if (reVar == null) {
                j = 0;
                Long readLong = this.b.readLong(DataStoreKey.CONFIG_TIME, 0L);
                if (readLong != null) {
                    longValue = readLong.longValue();
                }
                reentrantLock.unlock();
                return j;
            }
            longValue = reVar.a;
            j = longValue;
            reentrantLock.unlock();
            return j;
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final int j() {
        int i;
        int intValue;
        ReentrantLock reentrantLock = this.c;
        reentrantLock.lock();
        try {
            re reVar = this.e;
            if (reVar == null) {
                com.braze.storage.p pVar = this.b;
                DataStoreKey dataStoreKey = DataStoreKey.DEFAULT_REQUEST_BACKOFF_MAX_SLEEP_DURATION_MS;
                i = g;
                Integer readInt = pVar.readInt(dataStoreKey, Integer.valueOf(i));
                if (readInt != null) {
                    intValue = readInt.intValue();
                }
                reentrantLock.unlock();
                return i;
            }
            intValue = reVar.x;
            i = intValue;
            reentrantLock.unlock();
            return i;
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final int k() {
        int i;
        int intValue;
        ReentrantLock reentrantLock = this.c;
        reentrantLock.lock();
        try {
            re reVar = this.e;
            if (reVar == null) {
                com.braze.storage.p pVar = this.b;
                DataStoreKey dataStoreKey = DataStoreKey.DEFAULT_REQUEST_BACKOFF_MIN_SLEEP_DURATION_MS;
                i = f;
                Integer readInt = pVar.readInt(dataStoreKey, Integer.valueOf(i));
                if (readInt != null) {
                    intValue = readInt.intValue();
                }
                reentrantLock.unlock();
                return i;
            }
            intValue = reVar.w;
            i = intValue;
            reentrantLock.unlock();
            return i;
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final int l() {
        int i;
        int intValue;
        ReentrantLock reentrantLock = this.c;
        reentrantLock.lock();
        try {
            re reVar = this.e;
            if (reVar == null) {
                i = 3;
                Integer readInt = this.b.readInt(DataStoreKey.DEFAULT_REQUEST_BACKOFF_SCALE_FACTOR, 3);
                if (readInt != null) {
                    intValue = readInt.intValue();
                }
                reentrantLock.unlock();
                return i;
            }
            intValue = reVar.y;
            i = intValue;
            reentrantLock.unlock();
            return i;
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final int m() {
        int intValue;
        ReentrantLock reentrantLock = this.c;
        reentrantLock.lock();
        try {
            re reVar = this.e;
            if (reVar != null) {
                intValue = reVar.I;
            } else {
                Integer readInt = this.b.readInt(DataStoreKey.BANNERS_DISMISSALS_CACHE_SIZE, 200);
                intValue = readInt != null ? readInt.intValue() : 200;
            }
            int i = intValue > 0 ? intValue : 200;
            reentrantLock.unlock();
            return i;
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final int n() {
        int i;
        int intValue;
        ReentrantLock reentrantLock = this.c;
        reentrantLock.lock();
        try {
            re reVar = this.e;
            if (reVar == null) {
                i = 5;
                Integer readInt = this.b.readInt(DataStoreKey.FEATURE_FLAGS_RATE_REFRESH_RATE_LIMIT, 5);
                if (readInt != null) {
                    intValue = readInt.intValue();
                }
                reentrantLock.unlock();
                return i;
            }
            intValue = reVar.n;
            i = intValue;
            reentrantLock.unlock();
            return i;
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final int o() {
        int i;
        int intValue;
        ReentrantLock reentrantLock = this.c;
        reentrantLock.lock();
        try {
            re reVar = this.e;
            if (reVar == null) {
                i = 30;
                Integer readInt = this.b.readInt(DataStoreKey.GLOBAL_REQUEST_RATE_LIMITING_CAPACITY, 30);
                if (readInt != null) {
                    intValue = readInt.intValue();
                }
                reentrantLock.unlock();
                return i;
            }
            intValue = reVar.s;
            i = intValue;
            reentrantLock.unlock();
            return i;
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final int p() {
        int i;
        int intValue;
        ReentrantLock reentrantLock = this.c;
        reentrantLock.lock();
        try {
            re reVar = this.e;
            if (reVar == null) {
                i = 30;
                Integer readInt = this.b.readInt(DataStoreKey.GLOBAL_REQUEST_RATE_LIMITING_REFILL_RATE, 30);
                if (readInt != null) {
                    intValue = readInt.intValue();
                }
                reentrantLock.unlock();
                return i;
            }
            intValue = reVar.r;
            i = intValue;
            reentrantLock.unlock();
            return i;
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final int q() {
        int i;
        int intValue;
        ReentrantLock reentrantLock = this.c;
        reentrantLock.lock();
        try {
            re reVar = this.e;
            if (reVar == null) {
                i = 0;
                Integer readInt = this.b.readInt(DataStoreKey.MAX_BANNER_PLACEMENTS, 0);
                if (readInt != null) {
                    intValue = readInt.intValue();
                }
                reentrantLock.unlock();
                return i;
            }
            intValue = reVar.H;
            i = intValue;
            reentrantLock.unlock();
            return i;
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final int r() {
        int i;
        int intValue;
        ReentrantLock reentrantLock = this.c;
        reentrantLock.lock();
        try {
            re reVar = this.e;
            if (reVar == null) {
                i = -1;
                Integer readInt = this.b.readInt(DataStoreKey.GEOFENCES_MAX_NUM_TO_REGISTER, -1);
                if (readInt != null) {
                    intValue = readInt.intValue();
                }
                reentrantLock.unlock();
                return i;
            }
            intValue = reVar.g;
            i = intValue;
            reentrantLock.unlock();
            return i;
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final long s() {
        long j;
        long longValue;
        ReentrantLock reentrantLock = this.c;
        reentrantLock.lock();
        try {
            re reVar = this.e;
            if (reVar == null) {
                j = -1;
                Long readLong = this.b.readLong(DataStoreKey.MESSAGING_SESSION_TIMEOUT, -1L);
                if (readLong != null) {
                    longValue = readLong.longValue();
                }
                reentrantLock.unlock();
                return j;
            }
            longValue = reVar.k;
            j = longValue;
            reentrantLock.unlock();
            return j;
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final int t() {
        int i;
        int intValue;
        ReentrantLock reentrantLock = this.c;
        reentrantLock.lock();
        try {
            re reVar = this.e;
            if (reVar == null) {
                i = -1;
                Integer readInt = this.b.readInt(DataStoreKey.GEOFENCES_MIN_TIME_REPORT, -1);
                if (readInt != null) {
                    intValue = readInt.intValue();
                }
                reentrantLock.unlock();
                return i;
            }
            intValue = reVar.f;
            i = intValue;
            reentrantLock.unlock();
            return i;
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final int u() {
        int i;
        int intValue;
        ReentrantLock reentrantLock = this.c;
        reentrantLock.lock();
        try {
            re reVar = this.e;
            if (reVar == null) {
                i = -1;
                Integer readInt = this.b.readInt(DataStoreKey.GEOFENCES_MIN_TIME_REQUEST, -1);
                if (readInt != null) {
                    intValue = readInt.intValue();
                }
                reentrantLock.unlock();
                return i;
            }
            intValue = reVar.e;
            i = intValue;
            reentrantLock.unlock();
            return i;
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final long v() {
        long j;
        long longValue;
        ReentrantLock reentrantLock = this.c;
        reentrantLock.lock();
        try {
            re reVar = this.e;
            if (reVar == null) {
                j = 86400;
                Long readLong = this.b.readLong(DataStoreKey.PUSH_MAX_REDELIVER_BUFFER, 86400L);
                if (readLong != null) {
                    longValue = readLong.longValue();
                }
                reentrantLock.unlock();
                return j;
            }
            longValue = reVar.p;
            j = longValue;
            reentrantLock.unlock();
            return j;
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final long w() {
        long j;
        long longValue;
        ReentrantLock reentrantLock = this.c;
        reentrantLock.lock();
        try {
            re reVar = this.e;
            if (reVar == null) {
                j = -1;
                Long readLong = this.b.readLong(DataStoreKey.PUSH_MAX_REDELIVER_DEDUPE_BUFFER, -1L);
                if (readLong != null) {
                    longValue = readLong.longValue();
                }
                reentrantLock.unlock();
                return j;
            }
            longValue = reVar.v;
            j = longValue;
            reentrantLock.unlock();
            return j;
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final LinkedHashMap x() {
        String str = "";
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        try {
            String readString = this.b.readString(DataStoreKey.GLOBAL_REQUEST_RATE_LIMIT_ENDPOINT_OVERRIDES, "");
            if (readString != null) {
                str = readString;
            }
            if (str.length() != 0) {
                JSONObject jSONObject = new JSONObject(str);
                Iterator<String> keys = jSONObject.keys();
                keys.getClass();
                while (keys.hasNext()) {
                    String next = keys.next();
                    b9 b9Var = c9.b;
                    next.getClass();
                    c9 a = b9Var.a(next);
                    if (a != null) {
                        JSONObject jSONObject2 = jSONObject.getJSONObject(next);
                        linkedHashMap.put(a, new oe(jSONObject2.getInt("capacity"), jSONObject2.getInt("refill")));
                    }
                }
            }
            return linkedHashMap;
        } catch (Exception e) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e, false, (Function0) new w$$ExternalSyntheticLambda0(19), 4, (Object) null);
            return linkedHashMap;
        }
    }

    public final String z() {
        String readString;
        ReentrantLock reentrantLock = this.c;
        reentrantLock.lock();
        try {
            re reVar = this.e;
            if (reVar != null) {
                readString = reVar.A;
                if (readString == null) {
                }
                reentrantLock.unlock();
                return readString;
            }
            readString = this.b.readString(DataStoreKey.SDK_DEBUGGER_AUTHORIZATION_CODE, null);
            reentrantLock.unlock();
            return readString;
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public static final String b() {
        return "Attempting to acquire server config lock";
    }

    public static final String a(String str, String str2) {
        return Boxes$$ExternalSyntheticOutline1.m("Detected SDK update from '", str, "' -> '", str2, "'. Clearing config update time.");
    }

    public final void a(td tdVar) {
        tdVar.getClass();
        ReentrantLock reentrantLock = this.c;
        reentrantLock.lock();
        try {
            re reVar = this.e;
            if (reVar != null) {
                reVar.z = tdVar.a;
            }
            if (reVar != null) {
                reVar.C = tdVar.d;
            }
            if (reVar != null) {
                reVar.D = tdVar.e;
            }
            if (reVar != null) {
                reVar.E = tdVar.f;
            }
            String str = tdVar.c;
            if (str != null && reVar != null) {
                reVar.A = str;
            }
            Long l = tdVar.b;
            if (l != null) {
                long longValue = l.longValue();
                re reVar2 = this.e;
                if (reVar2 != null) {
                    reVar2.B = Long.valueOf(longValue);
                }
            }
            reentrantLock.unlock();
            try {
                re reVar3 = this.e;
                if (reVar3 != null) {
                    LinkedHashMap mutableMapOf = MapsKt__MapsKt.mutableMapOf(new Pair(DataStoreKey.SDK_DEBUGGER_ENABLED.getKey(), Boolean.valueOf(reVar3.z)), new Pair(DataStoreKey.SDK_DEBUGGER_FLUSH_INTERVAL_BYTES.getKey(), Long.valueOf(reVar3.C)), new Pair(DataStoreKey.SDK_DEBUGGER_FLUSH_INTERVAL_SECONDS.getKey(), Long.valueOf(reVar3.D)), new Pair(DataStoreKey.SDK_DEBUGGER_MAX_PAYLOAD_BYTES.getKey(), Long.valueOf(reVar3.E)));
                    Long l2 = reVar3.B;
                    if (l2 != null) {
                        mutableMapOf.put(DataStoreKey.SDK_DEBUGGER_EXPIRATION_TIME.getKey(), Long.valueOf(l2.longValue()));
                    }
                    String str2 = reVar3.A;
                    if (str2 != null) {
                        mutableMapOf.put(DataStoreKey.SDK_DEBUGGER_AUTHORIZATION_CODE.getKey(), str2);
                    }
                    this.b.batchUpdate(mutableMapOf, EmptySet.INSTANCE);
                }
            } catch (Exception e) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e, false, (Function0) new w$$ExternalSyntheticLambda0(22), 4, (Object) null);
            }
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.V, (Throwable) null, false, (Function0) new h$$ExternalSyntheticLambda0(this, 23), 6, (Object) null);
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public static final String a(ue ueVar) {
        return "Finishing updating server config to " + ueVar.e;
    }

    public final Pair a() {
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        BrazeLogger.Priority priority = BrazeLogger.Priority.V;
        BrazeLogger.brazelog$default(brazeLogger, (Object) this, priority, (Throwable) null, false, (Function0) new w$$ExternalSyntheticLambda0(20), 6, (Object) null);
        if (!this.d.tryLock(null)) {
            BrazeLogger.brazelog$default(brazeLogger, (Object) this, priority, (Throwable) null, false, (Function0) new w$$ExternalSyntheticLambda0(21), 6, (Object) null);
            return null;
        }
        return new Pair(Long.valueOf(i()), Boolean.valueOf(i() <= 0));
    }

    public final HashSet a(DataStoreKey dataStoreKey) {
        ArrayList arrayList;
        Collection collection;
        try {
            com.braze.storage.p pVar = this.b;
            if (dataStoreKey.getType() != DataStoreValueType.LIST) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.E, (Throwable) null, false, (Function0) new DataStoreProvider.i(dataStoreKey), 12, (Object) null);
                arrayList = new ArrayList();
            } else {
                try {
                    Object readData = pVar.readData(dataStoreKey, "");
                    readData.getClass();
                    String str = (String) readData;
                    if (StringsKt.isBlank(str)) {
                        arrayList = new ArrayList();
                    } else {
                        DataStoreUtils dataStoreUtils = DataStoreUtils.INSTANCE;
                        if (StringsKt.isBlank(str)) {
                            collection = EmptyList.INSTANCE;
                        } else if (Intrinsics.areEqual(StringsKt.trim(str).toString(), "null")) {
                            collection = EmptyList.INSTANCE;
                        } else {
                            try {
                                Json.Default r0 = Json.Default;
                                r0.getClass();
                                collection = (List) r0.decodeFromString(str, new HashSetSerializer(StringSerializer.INSTANCE, 1));
                            } catch (Exception e) {
                                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) dataStoreUtils, BrazeLogger.Priority.E, (Throwable) e, false, (Function0) new DataStoreUtils.a(str), 4, (Object) null);
                                collection = EmptyList.INSTANCE;
                            }
                        }
                        arrayList = CollectionsKt.toMutableList(collection);
                    }
                } catch (Exception e2) {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.E, (Throwable) e2, false, (Function0) new DataStoreProvider.j(dataStoreKey), 8, (Object) null);
                    arrayList = new ArrayList();
                }
            }
            return CollectionsKt.toHashSet(arrayList);
        } catch (Exception e3) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e3, false, (Function0) new w$$ExternalSyntheticLambda0(18), 4, (Object) null);
            return new HashSet();
        }
    }
}
