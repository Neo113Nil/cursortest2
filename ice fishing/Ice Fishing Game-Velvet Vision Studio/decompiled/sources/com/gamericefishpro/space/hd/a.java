package com.gamericefishpro.space.hd;

import android.content.SharedPreferences;
import com.gamericefishpro.space.ic.c;
import com.gamericefishpro.space.lc.f;
import com.gamericefishpro.space.ph.m0;
import com.gamericefishpro.space.pi.a0;
import com.gamericefishpro.space.pi.d0;
import com.gamericefishpro.space.pi.k0;
import com.gamericefishpro.space.pi.x;
import com.gamericefishpro.space.pi.x0;
import com.gamericefishpro.space.vh.i;
import com.gamericefishpro.space.wi.d;
import com.gamericefishpro.space.wi.e;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class a implements com.gamericefishpro.space.gd.b, com.gamericefishpro.space.jd.b {
    public static final C0018a Companion = new C0018a(null);
    private static final int WRITE_CALL_DELAY_TO_BUFFER_MS = 200;
    private final f _applicationService;
    private final com.gamericefishpro.space.kd.a _time;
    private final Map<String, Map<String, Object>> prefsToApply;
    private d0 queueJob;
    private final c waiter;

    /* JADX INFO: renamed from: com.gamericefishpro.space.hd.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
    public static final class C0018a {
        public /* synthetic */ C0018a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C0018a() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
    public static final class b extends i implements Function2 {
        long J$0;
        int label;

        public b(com.gamericefishpro.space.th.a aVar) {
            super(2, aVar);
        }

        @Override // com.gamericefishpro.space.vh.a
        public final com.gamericefishpro.space.th.a create(Object obj, com.gamericefishpro.space.th.a aVar) {
            return a.this.new b(aVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(x xVar, com.gamericefishpro.space.th.a aVar) {
            return ((b) create(xVar, aVar)).invokeSuspend(Unit.a);
        }

        /* JADX WARN: Code duplicated, block: B:20:0x0045 A[Catch: all -> 0x0012, TryCatch #0 {all -> 0x0012, blocks: (B:7:0x000e, B:17:0x0031, B:18:0x003f, B:20:0x0045, B:22:0x0062, B:23:0x006c, B:24:0x0070, B:48:0x00d4, B:49:0x00d5, B:50:0x00da, B:51:0x00db, B:52:0x00dc, B:61:0x0100, B:14:0x001f, B:25:0x0071, B:26:0x0079, B:28:0x007f, B:30:0x008d, B:33:0x0095, B:35:0x0099, B:36:0x00a3, B:38:0x00a7, B:39:0x00b1, B:41:0x00b5, B:42:0x00bf, B:44:0x00c3, B:46:0x00cb, B:47:0x00cf), top: B:65:0x0006, inners: #1 }] */
        /* JADX WARN: Code duplicated, block: B:28:0x007f A[Catch: all -> 0x0093, TryCatch #1 {all -> 0x0093, blocks: (B:25:0x0071, B:26:0x0079, B:28:0x007f, B:30:0x008d, B:33:0x0095, B:35:0x0099, B:36:0x00a3, B:38:0x00a7, B:39:0x00b1, B:41:0x00b5, B:42:0x00bf, B:44:0x00c3, B:46:0x00cb, B:47:0x00cf), top: B:67:0x0071, outer: #0 }] */
        /* JADX WARN: Code duplicated, block: B:67:0x0071 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:69:0x00f1 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:72:0x00ff A[EDGE_INSN: B:72:0x00ff->B:60:0x00ff BREAK  A[LOOP:0: B:17:0x0031->B:71:0x0031], SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:74:? A[PHI: r4
          PHI (r4v2 long) = (r4v3 long), (r4v1 long), (r4v8 long), (r4v10 long) binds: [B:64:0x0111, B:62:0x010e, B:16:0x0024, B:7:0x000e] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:76:0x006c A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:77:0x0062 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:82:0x0095 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:83:0x00a3 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:84:0x008d A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:85:0x0099 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:86:0x00b1 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:87:0x00a7 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:88:0x00bf A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:89:0x00b5 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:90:0x00c9 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:91:0x00c3 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:92:0x00cb A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:94:0x0079 A[SYNTHETIC] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:62:0x010e -> B:17:0x0031). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:87:0x00a7
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // com.gamericefishpro.space.vh.a
        public final java.lang.Object invokeSuspend(java.lang.Object r12) {
            /*
                Method dump skipped, instruction units count: 282
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.gamericefishpro.space.hd.a.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public a(f _applicationService, com.gamericefishpro.space.kd.a _time) {
        Intrinsics.checkNotNullParameter(_applicationService, "_applicationService");
        Intrinsics.checkNotNullParameter(_time, "_time");
        this._applicationService = _applicationService;
        this._time = _time;
        this.prefsToApply = m0.e(new Pair("OneSignal", new LinkedHashMap()), new Pair("GTPlayerPurchases", new LinkedHashMap()));
        this.waiter = new c();
    }

    private final d0 doWorkAsync() {
        e eVar = k0.a;
        return a0.e(x0.d, d.i, new b(null), 2);
    }

    private final Object get(String str, String str2, Class<?> cls, Object obj) throws Exception {
        if (!this.prefsToApply.containsKey(str)) {
            throw new Exception(com.gamericefishpro.space.m5.a.u("Store not found: ", str));
        }
        Map<String, Object> map = this.prefsToApply.get(str);
        Intrinsics.b(map);
        Map<String, Object> map2 = map;
        synchronized (map2) {
            Object obj2 = map2.get(str2);
            if (obj2 == null && !map2.containsKey(str2)) {
                Unit unit = Unit.a;
                SharedPreferences sharedPrefsByName = getSharedPrefsByName(str);
                if (sharedPrefsByName != null) {
                    try {
                        if (Intrinsics.a(cls, String.class)) {
                            return sharedPrefsByName.getString(str2, (String) obj);
                        }
                        if (Intrinsics.a(cls, Boolean.TYPE)) {
                            Boolean bool = (Boolean) obj;
                            return Boolean.valueOf(sharedPrefsByName.getBoolean(str2, bool != null ? bool.booleanValue() : false));
                        }
                        if (Intrinsics.a(cls, Integer.TYPE)) {
                            Integer num = (Integer) obj;
                            return Integer.valueOf(sharedPrefsByName.getInt(str2, num != null ? num.intValue() : 0));
                        }
                        if (Intrinsics.a(cls, Long.TYPE)) {
                            Long l = (Long) obj;
                            return Long.valueOf(sharedPrefsByName.getLong(str2, l != null ? l.longValue() : 0L));
                        }
                        if (Intrinsics.a(cls, Set.class)) {
                            return sharedPrefsByName.getStringSet(str2, (Set) obj);
                        }
                        return null;
                    } catch (Exception unused) {
                    }
                }
                if (Intrinsics.a(cls, String.class)) {
                    return (String) obj;
                }
                if (Intrinsics.a(cls, Boolean.TYPE)) {
                    Boolean bool2 = (Boolean) obj;
                    return Boolean.valueOf(bool2 != null ? bool2.booleanValue() : false);
                }
                if (Intrinsics.a(cls, Integer.TYPE)) {
                    Integer num2 = (Integer) obj;
                    return Integer.valueOf(num2 != null ? num2.intValue() : 0);
                }
                if (Intrinsics.a(cls, Long.TYPE)) {
                    Long l2 = (Long) obj;
                    return Long.valueOf(l2 != null ? l2.longValue() : 0L);
                }
                if (Intrinsics.a(cls, Set.class)) {
                    return (Set) obj;
                }
                return null;
            }
            return obj2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final synchronized SharedPreferences getSharedPrefsByName(String str) {
        return this._applicationService.getAppContext().getSharedPreferences(str, 0);
    }

    private final void save(String str, String str2, Object obj) throws Exception {
        if (!this.prefsToApply.containsKey(str)) {
            throw new Exception(com.gamericefishpro.space.m5.a.u("Store not found: ", str));
        }
        Map<String, Object> map = this.prefsToApply.get(str);
        Intrinsics.b(map);
        Map<String, Object> map2 = map;
        synchronized (map2) {
            map2.put(str2, obj);
            Unit unit = Unit.a;
        }
        this.waiter.wake();
    }

    @Override // com.gamericefishpro.space.gd.b
    public Boolean getBool(String store, String key, Boolean bool) {
        Intrinsics.checkNotNullParameter(store, "store");
        Intrinsics.checkNotNullParameter(key, "key");
        return (Boolean) get(store, key, Boolean.TYPE, bool);
    }

    @Override // com.gamericefishpro.space.gd.b
    public Integer getInt(String store, String key, Integer num) {
        Intrinsics.checkNotNullParameter(store, "store");
        Intrinsics.checkNotNullParameter(key, "key");
        return (Integer) get(store, key, Integer.TYPE, num);
    }

    @Override // com.gamericefishpro.space.gd.b
    public Long getLong(String store, String key, Long l) {
        Intrinsics.checkNotNullParameter(store, "store");
        Intrinsics.checkNotNullParameter(key, "key");
        return (Long) get(store, key, Long.TYPE, l);
    }

    @Override // com.gamericefishpro.space.gd.b
    public String getString(String store, String key, String str) {
        Intrinsics.checkNotNullParameter(store, "store");
        Intrinsics.checkNotNullParameter(key, "key");
        return (String) get(store, key, String.class, str);
    }

    @Override // com.gamericefishpro.space.gd.b
    public Set<String> getStringSet(String store, String key, Set<String> set) {
        Intrinsics.checkNotNullParameter(store, "store");
        Intrinsics.checkNotNullParameter(key, "key");
        return (Set) get(store, key, Set.class, set);
    }

    @Override // com.gamericefishpro.space.gd.b
    public void saveBool(String store, String key, Boolean bool) throws Exception {
        Intrinsics.checkNotNullParameter(store, "store");
        Intrinsics.checkNotNullParameter(key, "key");
        save(store, key, bool);
    }

    @Override // com.gamericefishpro.space.gd.b
    public void saveInt(String store, String key, Integer num) throws Exception {
        Intrinsics.checkNotNullParameter(store, "store");
        Intrinsics.checkNotNullParameter(key, "key");
        save(store, key, num);
    }

    @Override // com.gamericefishpro.space.gd.b
    public void saveLong(String store, String key, Long l) throws Exception {
        Intrinsics.checkNotNullParameter(store, "store");
        Intrinsics.checkNotNullParameter(key, "key");
        save(store, key, l);
    }

    @Override // com.gamericefishpro.space.gd.b
    public void saveString(String store, String key, String str) throws Exception {
        Intrinsics.checkNotNullParameter(store, "store");
        Intrinsics.checkNotNullParameter(key, "key");
        save(store, key, str);
    }

    @Override // com.gamericefishpro.space.gd.b
    public void saveStringSet(String store, String key, Set<String> set) throws Exception {
        Intrinsics.checkNotNullParameter(store, "store");
        Intrinsics.checkNotNullParameter(key, "key");
        save(store, key, set);
    }

    @Override // com.gamericefishpro.space.jd.b
    public void start() {
        this.queueJob = doWorkAsync();
    }
}
