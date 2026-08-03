package com.onesignal.core.internal.preferences.impl;

import ac.i;
import ac.o;
import android.content.SharedPreferences;
import bc.a0;
import bc.z;
import com.onesignal.common.threading.c;
import fc.d;
import fc.g;
import hc.j;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import oc.e;
import q8.f;
import yc.d0;
import yc.e0;
import yc.i0;
import yc.r;
import yc.y;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class a implements c9.b, d9.b {
    public static final C0020a Companion = new C0020a(null);
    private static final int WRITE_CALL_DELAY_TO_BUFFER_MS = 200;
    private final f _applicationService;
    private final e9.a _time;
    private final Map<String, Map<String, Object>> prefsToApply;
    private d0 queueJob;
    private final c waiter;

    /* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
    /* renamed from: com.onesignal.core.internal.preferences.impl.a$a, reason: collision with other inner class name */
    public static final class C0020a {
        public /* synthetic */ C0020a(pc.f fVar) {
            this();
        }

        private C0020a() {
        }
    }

    /* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
    public static final class b extends j implements e {
        long J$0;
        int label;

        public b(d dVar) {
            super(2, dVar);
        }

        @Override // hc.a
        public final d create(Object obj, d dVar) {
            return a.this.new b(dVar);
        }

        /* JADX WARN: Code restructure failed: missing block: B:81:0x00f7, code lost:
        
            if (yc.a0.f(r4, r11) == r0) goto L63;
         */
        /* JADX WARN: Code restructure failed: missing block: B:82:0x00fd, code lost:
        
            r4 = r6;
         */
        /* JADX WARN: Code restructure failed: missing block: B:84:0x010c, code lost:
        
            if (r12.waitForWake(r11) == r0) goto L63;
         */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:52:0x010c -> B:8:0x0031). Please report as a decompilation issue!!! */
        @Override // hc.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            long j3;
            gc.a aVar = gc.a.f2559g;
            int i10 = this.label;
            try {
            } catch (Throwable th) {
                com.onesignal.debug.internal.logging.b.log(g9.c.ERROR, "Error with Preference work loop", th);
            }
            if (i10 == 0) {
                v6.a.W(obj);
                j3 = a.this._time.getCurrentTimeMillis();
            } else if (i10 == 1) {
                j3 = this.J$0;
                v6.a.W(obj);
                c cVar = a.this.waiter;
                this.J$0 = j3;
                this.label = 2;
            } else {
                if (i10 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                j3 = this.J$0;
                v6.a.W(obj);
            }
            while (true) {
                for (String str : a.this.prefsToApply.keySet()) {
                    Object obj2 = a.this.prefsToApply.get(str);
                    pc.j.b(obj2);
                    Map map = (Map) obj2;
                    SharedPreferences sharedPrefsByName = a.this.getSharedPrefsByName(str);
                    if (sharedPrefsByName == null) {
                        a.this.waiter.wake();
                    } else {
                        SharedPreferences.Editor edit = sharedPrefsByName.edit();
                        synchronized (map) {
                            try {
                                for (String str2 : map.keySet()) {
                                    Object obj3 = map.get(str2);
                                    if (obj3 instanceof String) {
                                        edit.putString(str2, (String) obj3);
                                    } else if (obj3 instanceof Boolean) {
                                        edit.putBoolean(str2, ((Boolean) obj3).booleanValue());
                                    } else if (obj3 instanceof Integer) {
                                        edit.putInt(str2, ((Integer) obj3).intValue());
                                    } else if (obj3 instanceof Long) {
                                        edit.putLong(str2, ((Long) obj3).longValue());
                                    } else if (obj3 instanceof Set) {
                                        edit.putStringSet(str2, (Set) obj3);
                                    } else if (obj3 == null) {
                                        edit.remove(str2);
                                    }
                                }
                                map.clear();
                            } finally {
                            }
                        }
                        edit.apply();
                    }
                }
                long currentTimeMillis = a.this._time.getCurrentTimeMillis();
                long j6 = (j3 - currentTimeMillis) + a.WRITE_CALL_DELAY_TO_BUFFER_MS;
                if (j6 <= 0) {
                    break;
                }
                try {
                    this.J$0 = currentTimeMillis;
                    this.label = 1;
                } catch (Throwable th2) {
                    j3 = currentTimeMillis;
                    com.onesignal.debug.internal.logging.b.log(g9.c.ERROR, "Error with Preference work loop", th2);
                }
                com.onesignal.debug.internal.logging.b.log(g9.c.ERROR, "Error with Preference work loop", th2);
            }
            return aVar;
        }

        @Override // oc.e
        public final Object invoke(y yVar, d dVar) {
            return ((b) create(yVar, dVar)).invokeSuspend(o.f277a);
        }
    }

    public a(f fVar, e9.a aVar) {
        pc.j.e(fVar, "_applicationService");
        pc.j.e(aVar, "_time");
        this._applicationService = fVar;
        this._time = aVar;
        i[] iVarArr = {new i("OneSignal", new LinkedHashMap()), new i("GTPlayerPurchases", new LinkedHashMap())};
        LinkedHashMap linkedHashMap = new LinkedHashMap(a0.B(2));
        z.O(linkedHashMap, iVarArr);
        this.prefsToApply = linkedHashMap;
        this.waiter = new c();
    }

    private final d0 doWorkAsync() {
        fd.d dVar = i0.f8861c;
        e bVar = new b(null);
        boolean booleanValue = ((Boolean) dVar.i(Boolean.FALSE, r.f8894i)).booleanValue();
        fd.d dVar2 = dVar;
        if (booleanValue) {
            fc.j jVar = fc.j.f2348g;
            Object obj = dVar;
            if (booleanValue) {
                obj = dVar.i(jVar, r.f8893h);
            }
            fd.d dVar3 = (fc.i) obj;
            jVar.d(dVar3);
            dVar2 = dVar3;
        }
        fd.e eVar = i0.f8859a;
        fc.i iVar = dVar2;
        if (dVar2 != eVar) {
            g v10 = dVar2.v(fc.e.f2347g);
            iVar = dVar2;
            if (v10 == null) {
                iVar = dVar2.d(eVar);
            }
        }
        e0 e0Var = new e0(iVar, true);
        e0Var.f0(yc.z.f8921g, e0Var, bVar);
        return e0Var;
    }

    private final Object get(String str, String str2, Class<?> cls, Object obj) {
        if (!this.prefsToApply.containsKey(str)) {
            throw new Exception("Store not found: " + str);
        }
        Map<String, Object> map = this.prefsToApply.get(str);
        pc.j.b(map);
        Map<String, Object> map2 = map;
        synchronized (map2) {
            Object obj2 = map2.get(str2);
            if (obj2 == null) {
                if (!map2.containsKey(str2)) {
                    SharedPreferences sharedPrefsByName = getSharedPrefsByName(str);
                    if (sharedPrefsByName != null) {
                        try {
                            if (pc.j.a(cls, String.class)) {
                                return sharedPrefsByName.getString(str2, (String) obj);
                            }
                            if (pc.j.a(cls, Boolean.TYPE)) {
                                Boolean bool = (Boolean) obj;
                                return Boolean.valueOf(sharedPrefsByName.getBoolean(str2, bool != null ? bool.booleanValue() : false));
                            }
                            if (pc.j.a(cls, Integer.TYPE)) {
                                Integer num = (Integer) obj;
                                return Integer.valueOf(sharedPrefsByName.getInt(str2, num != null ? num.intValue() : 0));
                            }
                            if (pc.j.a(cls, Long.TYPE)) {
                                Long l10 = (Long) obj;
                                return Long.valueOf(sharedPrefsByName.getLong(str2, l10 != null ? l10.longValue() : 0L));
                            }
                            if (pc.j.a(cls, Set.class)) {
                                return sharedPrefsByName.getStringSet(str2, (Set) obj);
                            }
                            return null;
                        } catch (Exception unused) {
                        }
                    }
                    if (pc.j.a(cls, String.class)) {
                        return (String) obj;
                    }
                    if (pc.j.a(cls, Boolean.TYPE)) {
                        Boolean bool2 = (Boolean) obj;
                        return Boolean.valueOf(bool2 != null ? bool2.booleanValue() : false);
                    }
                    if (pc.j.a(cls, Integer.TYPE)) {
                        Integer num2 = (Integer) obj;
                        return Integer.valueOf(num2 != null ? num2.intValue() : 0);
                    }
                    if (pc.j.a(cls, Long.TYPE)) {
                        Long l11 = (Long) obj;
                        return Long.valueOf(l11 != null ? l11.longValue() : 0L);
                    }
                    if (pc.j.a(cls, Set.class)) {
                        return (Set) obj;
                    }
                    return null;
                }
            }
            return obj2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final synchronized SharedPreferences getSharedPrefsByName(String str) {
        return this._applicationService.getAppContext().getSharedPreferences(str, 0);
    }

    private final void save(String str, String str2, Object obj) {
        if (!this.prefsToApply.containsKey(str)) {
            throw new Exception("Store not found: " + str);
        }
        Map<String, Object> map = this.prefsToApply.get(str);
        pc.j.b(map);
        Map<String, Object> map2 = map;
        synchronized (map2) {
            map2.put(str2, obj);
        }
        this.waiter.wake();
    }

    @Override // c9.b
    public Boolean getBool(String str, String str2, Boolean bool) {
        pc.j.e(str, "store");
        pc.j.e(str2, "key");
        return (Boolean) get(str, str2, Boolean.TYPE, bool);
    }

    @Override // c9.b
    public Integer getInt(String str, String str2, Integer num) {
        pc.j.e(str, "store");
        pc.j.e(str2, "key");
        return (Integer) get(str, str2, Integer.TYPE, num);
    }

    @Override // c9.b
    public Long getLong(String str, String str2, Long l10) {
        pc.j.e(str, "store");
        pc.j.e(str2, "key");
        return (Long) get(str, str2, Long.TYPE, l10);
    }

    @Override // c9.b
    public String getString(String str, String str2, String str3) {
        pc.j.e(str, "store");
        pc.j.e(str2, "key");
        return (String) get(str, str2, String.class, str3);
    }

    @Override // c9.b
    public Set<String> getStringSet(String str, String str2, Set<String> set) {
        pc.j.e(str, "store");
        pc.j.e(str2, "key");
        return (Set) get(str, str2, Set.class, set);
    }

    @Override // c9.b
    public void saveBool(String str, String str2, Boolean bool) {
        pc.j.e(str, "store");
        pc.j.e(str2, "key");
        save(str, str2, bool);
    }

    @Override // c9.b
    public void saveInt(String str, String str2, Integer num) {
        pc.j.e(str, "store");
        pc.j.e(str2, "key");
        save(str, str2, num);
    }

    @Override // c9.b
    public void saveLong(String str, String str2, Long l10) {
        pc.j.e(str, "store");
        pc.j.e(str2, "key");
        save(str, str2, l10);
    }

    @Override // c9.b
    public void saveString(String str, String str2, String str3) {
        pc.j.e(str, "store");
        pc.j.e(str2, "key");
        save(str, str2, str3);
    }

    @Override // c9.b
    public void saveStringSet(String str, String str2, Set<String> set) {
        pc.j.e(str, "store");
        pc.j.e(str2, "key");
        save(str, str2, set);
    }

    @Override // d9.b
    public void start() {
        this.queueJob = doWorkAsync();
    }
}
