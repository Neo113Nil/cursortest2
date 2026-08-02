package defpackage;

import com.yandex.go.experiments.api.ExperimentSource;
import com.yandex.messaging.core.net.entities.BackendConfig;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import kotlin.Result;
import kotlinx.serialization.json.b;

/* loaded from: classes9.dex */
public final class rku0 {
    public final dne0 a;
    public final wku0 b;
    public final dlw0 c;
    public final r8h d;
    public final wnt e;
    public final cne0 f;

    public rku0(dne0 dne0Var, wku0 wku0Var, dlw0 dlw0Var, r8h r8hVar, wnt wntVar) {
        this.a = dne0Var;
        this.b = wku0Var;
        this.c = dlw0Var;
        this.d = r8hVar;
        this.e = wntVar;
        this.f = dne0Var.a("ru.yandex.taxi.experiments.storage.MIGRATION");
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00b2 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a() {
        wnt wntVar;
        wku0 wku0Var;
        Object failure;
        ExperimentSource experimentSource;
        Iterator it;
        Object failure2;
        b bVar;
        cne0 cne0Var = this.f;
        boolean z = false;
        if (cne0Var.g("stored_experiments_legacy_migration_done", false)) {
            return;
        }
        dne0 dne0Var = this.a;
        cne0 a = dne0Var.a("ru.yandex.taxi.startup.launch.response.EXPERIMENTS");
        Iterator it2 = qku0.a().entrySet().iterator();
        while (true) {
            boolean hasNext = it2.hasNext();
            wntVar = this.e;
            wku0Var = this.b;
            if (!hasNext) {
                break;
            }
            Map.Entry entry = (Map.Entry) it2.next();
            String str = (String) entry.getKey();
            ExperimentSource experimentSource2 = (ExperimentSource) entry.getValue();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            String j = b64.j(str, "_");
            for (Map.Entry<String, ?> entry2 : a.k().getAll().entrySet()) {
                String key = entry2.getKey();
                cne0 cne0Var2 = cne0Var;
                Object value = entry2.getValue();
                if (cvu0.x(key, j, z) && (value instanceof String)) {
                    String Q = evu0.Q(j, key);
                    String str2 = (String) value;
                    try {
                        it = it2;
                    } catch (Throwable th) {
                        th = th;
                        it = it2;
                    }
                    try {
                        failure2 = (b) ((xnt) wntVar).c(str2, b.Companion.serializer());
                    } catch (Throwable th2) {
                        th = th2;
                        failure2 = new Result.Failure(th);
                        if (failure2 instanceof Result.Failure) {
                        }
                        bVar = (b) failure2;
                        if (bVar == null) {
                        }
                        cne0Var = cne0Var2;
                        it2 = it;
                        z = false;
                    }
                    if (failure2 instanceof Result.Failure) {
                        failure2 = null;
                    }
                    bVar = (b) failure2;
                    if (bVar == null) {
                        linkedHashMap.put(Q, new fku0(Q, "", bVar, str2));
                    }
                } else {
                    it = it2;
                }
                cne0Var = cne0Var2;
                it2 = it;
                z = false;
            }
            cne0 cne0Var3 = cne0Var;
            Iterator it3 = it2;
            for (String str3 : a.n(str)) {
                kdx kdxVar = new kdx();
                abb1.c(kdxVar, BackendConfig.Restrictions.ENABLED, Boolean.TRUE);
                linkedHashMap.putIfAbsent(str3, new fku0(str3, "", kdxVar.a(), null));
            }
            wku0Var.g(experimentSource2, linkedHashMap.values());
            cne0Var = cne0Var3;
            it2 = it3;
            z = false;
        }
        cne0 cne0Var4 = cne0Var;
        cne0 a2 = dne0Var.a("ru.yandex.taxi.net.ExperimentsCache");
        if (a2.i("ExperimentsCache.CACHE_VERSION", 0) >= 2) {
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            for (Map.Entry<String, ?> entry3 : a2.k().getAll().entrySet()) {
                String key2 = entry3.getKey();
                Object value2 = entry3.getValue();
                if (!jl40.l(key2, "ExperimentsCache.CACHE_VERSION") && !cvu0.s(key2, ".last_update", false) && (value2 instanceof String)) {
                    String concat = key2.concat(".last_update");
                    this.d.getClass();
                    if (System.currentTimeMillis() - a2.j(concat, System.currentTimeMillis()) <= 2592000000L) {
                        try {
                            failure = (pku0) ((xnt) wntVar).c((String) value2, pku0.Companion.serializer());
                        } catch (Throwable th3) {
                            failure = new Result.Failure(th3);
                        }
                        if (failure instanceof Result.Failure) {
                            failure = null;
                        }
                        pku0 pku0Var = (pku0) failure;
                        if (pku0Var != null) {
                            clw0 clw0Var = (clw0) this.c.a.get(pku0Var.a());
                            if (clw0Var != null && (experimentSource = clw0Var.c) != null) {
                                if (!qku0.a().values().contains(experimentSource)) {
                                    experimentSource = null;
                                }
                                if (experimentSource != null) {
                                    Object obj = linkedHashMap2.get(experimentSource);
                                    if (obj == null) {
                                        obj = new ArrayList();
                                        linkedHashMap2.put(experimentSource, obj);
                                    }
                                    ((Collection) obj).add(new fku0(pku0Var.a(), pku0Var.c(), pku0Var.b(), null));
                                }
                            }
                        }
                    }
                }
            }
            for (Map.Entry entry4 : linkedHashMap2.entrySet()) {
                wku0Var.g((ExperimentSource) entry4.getKey(), (List) entry4.getValue());
            }
        }
        ReentrantReadWriteLock.WriteLock writeLock = wku0Var.h.writeLock();
        writeLock.lock();
        try {
            wku0Var.e.b();
            writeLock.unlock();
            if (cne0Var4.d().putBoolean("stored_experiments_legacy_migration_done", true).commit()) {
                return;
            }
            ny61.r("Check failed.");
        } catch (Throwable th4) {
            writeLock.unlock();
            throw th4;
        }
    }
}
