package F1;

import N1.p;
import O.C0344t;
import O2.C0360j;
import O2.I;
import O2.z;
import P2.J;
import S0.n;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import androidx.fragment.app.K;
import androidx.fragment.app.N;
import androidx.profileinstaller.ProfileInstallReceiver;
import androidx.recyclerview.widget.RecyclerView;
import b2.InterfaceC0515b;
import com.anythink.core.common.e.g;
import com.facebook.ads.internal.api.AdViewParentApi;
import com.icefishing.icefishinglive2.E;
import com.icefishing.icefishinglive2.IntroActivity;
import com.icefishing.icefishinglive2.MainActivity;
import com.icefishing.icefishinglive2.SplashActivity;
import com.icefishing.icefishinglive2.o;
import com.icefishing.icefishinglive2.x;
import e.InterfaceC4456b;
import g7.q;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;
import m.InterfaceC4701n;
import m6.m;
import m8.r;
import m8.t;
import m8.v;
import m8.w;
import o4.InterfaceC4798k;
import r0.InterfaceC4945c;
import t0.AbstractC5003S;
import t0.C5013h;
import w0.C5141a;
import w0.C5142b;
import z0.C5247c;

/* loaded from: classes.dex */
public class a implements I, InterfaceC4456b, AdViewParentApi, InterfaceC4798k, InterfaceC0515b, m, j3.e, j3.d, j3.b, InterfaceC4701n, m8.j, InterfaceC4945c {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f902n;

    /* renamed from: u, reason: collision with root package name */
    public Object f903u;

    public /* synthetic */ a(int i, Object obj) {
        this.f902n = i;
        this.f903u = obj;
    }

    public static void o(C5247c c5247c) {
        c5247c.A("CREATE TABLE IF NOT EXISTS `Dependency` (`work_spec_id` TEXT NOT NULL, `prerequisite_id` TEXT NOT NULL, PRIMARY KEY(`work_spec_id`, `prerequisite_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE , FOREIGN KEY(`prerequisite_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
        c5247c.A("CREATE INDEX IF NOT EXISTS `index_Dependency_work_spec_id` ON `Dependency` (`work_spec_id`)");
        c5247c.A("CREATE INDEX IF NOT EXISTS `index_Dependency_prerequisite_id` ON `Dependency` (`prerequisite_id`)");
        c5247c.A("CREATE TABLE IF NOT EXISTS `WorkSpec` (`id` TEXT NOT NULL, `state` INTEGER NOT NULL, `worker_class_name` TEXT NOT NULL, `input_merger_class_name` TEXT, `input` BLOB NOT NULL, `output` BLOB NOT NULL, `initial_delay` INTEGER NOT NULL, `interval_duration` INTEGER NOT NULL, `flex_duration` INTEGER NOT NULL, `run_attempt_count` INTEGER NOT NULL, `backoff_policy` INTEGER NOT NULL, `backoff_delay_duration` INTEGER NOT NULL, `last_enqueue_time` INTEGER NOT NULL, `minimum_retention_duration` INTEGER NOT NULL, `schedule_requested_at` INTEGER NOT NULL, `run_in_foreground` INTEGER NOT NULL, `out_of_quota_policy` INTEGER NOT NULL, `period_count` INTEGER NOT NULL DEFAULT 0, `generation` INTEGER NOT NULL DEFAULT 0, `required_network_type` INTEGER NOT NULL, `requires_charging` INTEGER NOT NULL, `requires_device_idle` INTEGER NOT NULL, `requires_battery_not_low` INTEGER NOT NULL, `requires_storage_not_low` INTEGER NOT NULL, `trigger_content_update_delay` INTEGER NOT NULL, `trigger_max_content_delay` INTEGER NOT NULL, `content_uri_triggers` BLOB NOT NULL, PRIMARY KEY(`id`))");
        c5247c.A("CREATE INDEX IF NOT EXISTS `index_WorkSpec_schedule_requested_at` ON `WorkSpec` (`schedule_requested_at`)");
        c5247c.A("CREATE INDEX IF NOT EXISTS `index_WorkSpec_last_enqueue_time` ON `WorkSpec` (`last_enqueue_time`)");
        c5247c.A("CREATE TABLE IF NOT EXISTS `WorkTag` (`tag` TEXT NOT NULL, `work_spec_id` TEXT NOT NULL, PRIMARY KEY(`tag`, `work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
        c5247c.A("CREATE INDEX IF NOT EXISTS `index_WorkTag_work_spec_id` ON `WorkTag` (`work_spec_id`)");
        c5247c.A("CREATE TABLE IF NOT EXISTS `SystemIdInfo` (`work_spec_id` TEXT NOT NULL, `generation` INTEGER NOT NULL DEFAULT 0, `system_id` INTEGER NOT NULL, PRIMARY KEY(`work_spec_id`, `generation`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
        c5247c.A("CREATE TABLE IF NOT EXISTS `WorkName` (`name` TEXT NOT NULL, `work_spec_id` TEXT NOT NULL, PRIMARY KEY(`name`, `work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
        c5247c.A("CREATE INDEX IF NOT EXISTS `index_WorkName_work_spec_id` ON `WorkName` (`work_spec_id`)");
        c5247c.A("CREATE TABLE IF NOT EXISTS `WorkProgress` (`work_spec_id` TEXT NOT NULL, `progress` BLOB NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
        c5247c.A("CREATE TABLE IF NOT EXISTS `Preference` (`key` TEXT NOT NULL, `long_value` INTEGER, PRIMARY KEY(`key`))");
        c5247c.A("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        c5247c.A("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '5181942b9ebc31ce68dacb56c16fd79f')");
    }

    public static J q(C5247c c5247c) {
        HashMap hashMap = new HashMap(2);
        hashMap.put("work_spec_id", new C5141a(1, 1, "work_spec_id", "TEXT", null, true));
        hashMap.put("prerequisite_id", new C5141a(2, 1, "prerequisite_id", "TEXT", null, true));
        HashSet hashSet = new HashSet(2);
        hashSet.add(new C5142b("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
        hashSet.add(new C5142b("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("prerequisite_id"), Arrays.asList("id")));
        HashSet hashSet2 = new HashSet(2);
        hashSet2.add(new w0.d("index_Dependency_work_spec_id", Arrays.asList("work_spec_id"), Arrays.asList("ASC"), false));
        hashSet2.add(new w0.d("index_Dependency_prerequisite_id", Arrays.asList("prerequisite_id"), Arrays.asList("ASC"), false));
        w0.e eVar = new w0.e("Dependency", hashMap, hashSet, hashSet2);
        w0.e a9 = w0.e.a(c5247c, "Dependency");
        if (!eVar.equals(a9)) {
            return new J(false, "Dependency(androidx.work.impl.model.Dependency).\n Expected:\n" + eVar + "\n Found:\n" + a9);
        }
        HashMap hashMap2 = new HashMap(27);
        hashMap2.put("id", new C5141a(1, 1, "id", "TEXT", null, true));
        hashMap2.put(com.anythink.core.express.b.a.f17526b, new C5141a(0, 1, com.anythink.core.express.b.a.f17526b, "INTEGER", null, true));
        hashMap2.put("worker_class_name", new C5141a(0, 1, "worker_class_name", "TEXT", null, true));
        hashMap2.put("input_merger_class_name", new C5141a(0, 1, "input_merger_class_name", "TEXT", null, false));
        hashMap2.put("input", new C5141a(0, 1, "input", "BLOB", null, true));
        hashMap2.put("output", new C5141a(0, 1, "output", "BLOB", null, true));
        hashMap2.put("initial_delay", new C5141a(0, 1, "initial_delay", "INTEGER", null, true));
        hashMap2.put("interval_duration", new C5141a(0, 1, "interval_duration", "INTEGER", null, true));
        hashMap2.put("flex_duration", new C5141a(0, 1, "flex_duration", "INTEGER", null, true));
        hashMap2.put("run_attempt_count", new C5141a(0, 1, "run_attempt_count", "INTEGER", null, true));
        hashMap2.put("backoff_policy", new C5141a(0, 1, "backoff_policy", "INTEGER", null, true));
        hashMap2.put("backoff_delay_duration", new C5141a(0, 1, "backoff_delay_duration", "INTEGER", null, true));
        hashMap2.put("last_enqueue_time", new C5141a(0, 1, "last_enqueue_time", "INTEGER", null, true));
        hashMap2.put("minimum_retention_duration", new C5141a(0, 1, "minimum_retention_duration", "INTEGER", null, true));
        hashMap2.put("schedule_requested_at", new C5141a(0, 1, "schedule_requested_at", "INTEGER", null, true));
        hashMap2.put("run_in_foreground", new C5141a(0, 1, "run_in_foreground", "INTEGER", null, true));
        hashMap2.put("out_of_quota_policy", new C5141a(0, 1, "out_of_quota_policy", "INTEGER", null, true));
        hashMap2.put("period_count", new C5141a(0, 1, "period_count", "INTEGER", "0", true));
        hashMap2.put("generation", new C5141a(0, 1, "generation", "INTEGER", "0", true));
        hashMap2.put("required_network_type", new C5141a(0, 1, "required_network_type", "INTEGER", null, true));
        hashMap2.put("requires_charging", new C5141a(0, 1, "requires_charging", "INTEGER", null, true));
        hashMap2.put("requires_device_idle", new C5141a(0, 1, "requires_device_idle", "INTEGER", null, true));
        hashMap2.put("requires_battery_not_low", new C5141a(0, 1, "requires_battery_not_low", "INTEGER", null, true));
        hashMap2.put("requires_storage_not_low", new C5141a(0, 1, "requires_storage_not_low", "INTEGER", null, true));
        hashMap2.put("trigger_content_update_delay", new C5141a(0, 1, "trigger_content_update_delay", "INTEGER", null, true));
        hashMap2.put("trigger_max_content_delay", new C5141a(0, 1, "trigger_max_content_delay", "INTEGER", null, true));
        hashMap2.put("content_uri_triggers", new C5141a(0, 1, "content_uri_triggers", "BLOB", null, true));
        HashSet hashSet3 = new HashSet(0);
        HashSet hashSet4 = new HashSet(2);
        hashSet4.add(new w0.d("index_WorkSpec_schedule_requested_at", Arrays.asList("schedule_requested_at"), Arrays.asList("ASC"), false));
        hashSet4.add(new w0.d("index_WorkSpec_last_enqueue_time", Arrays.asList("last_enqueue_time"), Arrays.asList("ASC"), false));
        w0.e eVar2 = new w0.e("WorkSpec", hashMap2, hashSet3, hashSet4);
        w0.e a10 = w0.e.a(c5247c, "WorkSpec");
        if (!eVar2.equals(a10)) {
            return new J(false, "WorkSpec(androidx.work.impl.model.WorkSpec).\n Expected:\n" + eVar2 + "\n Found:\n" + a10);
        }
        HashMap hashMap3 = new HashMap(2);
        hashMap3.put("tag", new C5141a(1, 1, "tag", "TEXT", null, true));
        hashMap3.put("work_spec_id", new C5141a(2, 1, "work_spec_id", "TEXT", null, true));
        HashSet hashSet5 = new HashSet(1);
        hashSet5.add(new C5142b("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
        HashSet hashSet6 = new HashSet(1);
        hashSet6.add(new w0.d("index_WorkTag_work_spec_id", Arrays.asList("work_spec_id"), Arrays.asList("ASC"), false));
        w0.e eVar3 = new w0.e("WorkTag", hashMap3, hashSet5, hashSet6);
        w0.e a11 = w0.e.a(c5247c, "WorkTag");
        if (!eVar3.equals(a11)) {
            return new J(false, "WorkTag(androidx.work.impl.model.WorkTag).\n Expected:\n" + eVar3 + "\n Found:\n" + a11);
        }
        HashMap hashMap4 = new HashMap(3);
        hashMap4.put("work_spec_id", new C5141a(1, 1, "work_spec_id", "TEXT", null, true));
        hashMap4.put("generation", new C5141a(2, 1, "generation", "INTEGER", "0", true));
        hashMap4.put("system_id", new C5141a(0, 1, "system_id", "INTEGER", null, true));
        HashSet hashSet7 = new HashSet(1);
        hashSet7.add(new C5142b("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
        w0.e eVar4 = new w0.e("SystemIdInfo", hashMap4, hashSet7, new HashSet(0));
        w0.e a12 = w0.e.a(c5247c, "SystemIdInfo");
        if (!eVar4.equals(a12)) {
            return new J(false, "SystemIdInfo(androidx.work.impl.model.SystemIdInfo).\n Expected:\n" + eVar4 + "\n Found:\n" + a12);
        }
        HashMap hashMap5 = new HashMap(2);
        hashMap5.put("name", new C5141a(1, 1, "name", "TEXT", null, true));
        hashMap5.put("work_spec_id", new C5141a(2, 1, "work_spec_id", "TEXT", null, true));
        HashSet hashSet8 = new HashSet(1);
        hashSet8.add(new C5142b("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
        HashSet hashSet9 = new HashSet(1);
        hashSet9.add(new w0.d("index_WorkName_work_spec_id", Arrays.asList("work_spec_id"), Arrays.asList("ASC"), false));
        w0.e eVar5 = new w0.e("WorkName", hashMap5, hashSet8, hashSet9);
        w0.e a13 = w0.e.a(c5247c, "WorkName");
        if (!eVar5.equals(a13)) {
            return new J(false, "WorkName(androidx.work.impl.model.WorkName).\n Expected:\n" + eVar5 + "\n Found:\n" + a13);
        }
        HashMap hashMap6 = new HashMap(2);
        hashMap6.put("work_spec_id", new C5141a(1, 1, "work_spec_id", "TEXT", null, true));
        hashMap6.put(g.a.f12949C, new C5141a(0, 1, g.a.f12949C, "BLOB", null, true));
        HashSet hashSet10 = new HashSet(1);
        hashSet10.add(new C5142b("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
        w0.e eVar6 = new w0.e("WorkProgress", hashMap6, hashSet10, new HashSet(0));
        w0.e a14 = w0.e.a(c5247c, "WorkProgress");
        if (!eVar6.equals(a14)) {
            return new J(false, "WorkProgress(androidx.work.impl.model.WorkProgress).\n Expected:\n" + eVar6 + "\n Found:\n" + a14);
        }
        HashMap hashMap7 = new HashMap(2);
        hashMap7.put("key", new C5141a(1, 1, "key", "TEXT", null, true));
        hashMap7.put("long_value", new C5141a(0, 1, "long_value", "INTEGER", null, false));
        w0.e eVar7 = new w0.e("Preference", hashMap7, new HashSet(0), new HashSet(0));
        w0.e a15 = w0.e.a(c5247c, "Preference");
        if (eVar7.equals(a15)) {
            return new J(true, (String) null);
        }
        return new J(false, "Preference(androidx.work.impl.model.Preference).\n Expected:\n" + eVar7 + "\n Found:\n" + a15);
    }

    @Override // o4.InterfaceC4798k
    public void OnCall() {
        switch (this.f902n) {
            case 12:
                super/*androidx.activity.p*/.onBackPressed();
                break;
            case 13:
                IntroActivity introActivity = ((o) this.f903u).f36928u;
                introActivity.startActivity(introActivity.f36779x);
                break;
            case 14:
                MainActivity mainActivity = ((x) this.f903u).f36946u.f36949c;
                mainActivity.startActivity(mainActivity.f36840Q);
                break;
            default:
                MainActivity mainActivity2 = ((x) this.f903u).f36946u.f36949c;
                mainActivity2.startActivity(mainActivity2.f36850V);
                break;
        }
    }

    @Override // r0.InterfaceC4945c
    public void a(int i, Serializable serializable) {
        String str;
        switch (i) {
            case 1:
                str = "RESULT_INSTALL_SUCCESS";
                break;
            case 2:
                str = "RESULT_ALREADY_INSTALLED";
                break;
            case 3:
                str = "RESULT_UNSUPPORTED_ART_VERSION";
                break;
            case 4:
                str = "RESULT_NOT_WRITABLE";
                break;
            case 5:
                str = "RESULT_DESIRED_FORMAT_UNSUPPORTED";
                break;
            case 6:
                str = "RESULT_BASELINE_PROFILE_NOT_FOUND";
                break;
            case 7:
                str = "RESULT_IO_EXCEPTION";
                break;
            case 8:
                str = "RESULT_PARSE_EXCEPTION";
                break;
            case 9:
            default:
                str = "";
                break;
            case 10:
                str = "RESULT_INSTALL_SKIP_FILE_SUCCESS";
                break;
            case 11:
                str = "RESULT_DELETE_SKIP_FILE_SUCCESS";
                break;
        }
        if (i == 6 || i == 7 || i == 8) {
            Log.e("ProfileInstaller", str, (Throwable) serializable);
        } else {
            Log.d("ProfileInstaller", str);
        }
        ((ProfileInstallReceiver) this.f903u).setResultCode(i);
    }

    @Override // m8.j
    public r b() {
        w w6;
        IOException iOException = null;
        while (true) {
            t tVar = (t) this.f903u;
            if (!tVar.f39420D.k()) {
                try {
                    w6 = tVar.w();
                } catch (IOException e9) {
                    if (iOException == null) {
                        iOException = e9;
                    } else {
                        X2.e.y(iOException, e9);
                    }
                    if (!tVar.s(null)) {
                        throw iOException;
                    }
                }
                if (w6.isReady()) {
                    break;
                }
                v c9 = w6.c();
                if (c9.f39434b == null && c9.f39435c == null) {
                    c9 = w6.e();
                }
                m8.e eVar = c9.f39434b;
                Throwable th = c9.f39435c;
                if (th != null) {
                    throw th;
                }
                if (eVar == null) {
                    break;
                }
                tVar.f39424H.addFirst(eVar);
            } else {
                throw new IOException("Canceled");
            }
        }
        return w6.b();
    }

    @Override // m8.j
    public m8.x c() {
        return (t) this.f903u;
    }

    @Override // m6.m
    public m d(String str) {
        ((g7.m) this.f903u).f37666d = str;
        return this;
    }

    @Override // m6.m
    public m e(String str) {
        ((g7.m) this.f903u).f37667e = str;
        return this;
    }

    @Override // O2.I
    public void f(M2.b bVar) {
        C0360j c0360j = (C0360j) this.f903u;
        ReentrantLock reentrantLock = (ReentrantLock) c0360j.f2247C;
        ReentrantLock reentrantLock2 = (ReentrantLock) c0360j.f2247C;
        reentrantLock.lock();
        try {
            c0360j.f2246B = bVar;
            C0360j.h(c0360j);
        } finally {
            reentrantLock2.unlock();
        }
    }

    @Override // e.InterfaceC4456b
    public void g(Object obj) {
        Map map = (Map) obj;
        ArrayList arrayList = new ArrayList(map.values());
        int[] iArr = new int[arrayList.size()];
        for (int i = 0; i < arrayList.size(); i++) {
            iArr[i] = ((Boolean) arrayList.get(i)).booleanValue() ? 0 : -1;
        }
        N n9 = (N) this.f903u;
        K k9 = (K) n9.f4840C.pollFirst();
        if (k9 == null) {
            Log.w("FragmentManager", "No permissions were requested for " + this);
            return;
        }
        n nVar = n9.f4852c;
        String str = k9.f4834n;
        if (nVar.i(str) == null) {
            Log.w("FragmentManager", "Permission request result delivered for unknown Fragment " + str);
        }
    }

    @Override // t7.InterfaceC5044a
    public Object get() {
        return new g2.j((Context) ((G3.e) this.f903u).f1072n, "com.google.android.datatransport.events", Integer.valueOf(g2.j.f37649w).intValue());
    }

    @Override // j3.e
    public void h(Object obj) {
        ((CountDownLatch) this.f903u).countDown();
    }

    @Override // j3.b
    public void i() {
        ((CountDownLatch) this.f903u).countDown();
    }

    @Override // r0.InterfaceC4945c
    public void j() {
        Log.d("ProfileInstaller", "DIAGNOSTIC_PROFILE_IS_COMPRESSED");
    }

    @Override // j3.d
    public void k(Exception exc) {
        ((CountDownLatch) this.f903u).countDown();
    }

    @Override // O2.I
    public void l(int i) {
        C0360j c0360j = (C0360j) this.f903u;
        ReentrantLock reentrantLock = (ReentrantLock) c0360j.f2247C;
        ReentrantLock reentrantLock2 = (ReentrantLock) c0360j.f2247C;
        reentrantLock.lock();
        try {
            if (c0360j.f2248n) {
                c0360j.f2248n = false;
                C0360j.g(c0360j, i);
            } else {
                c0360j.f2248n = true;
                ((z) c0360j.f2251w).onConnectionSuspended(i);
            }
        } finally {
            reentrantLock2.unlock();
        }
    }

    @Override // O2.I
    public void m(Bundle bundle) {
        C0360j c0360j = (C0360j) this.f903u;
        ReentrantLock reentrantLock = (ReentrantLock) c0360j.f2247C;
        ReentrantLock reentrantLock2 = (ReentrantLock) c0360j.f2247C;
        reentrantLock.lock();
        try {
            c0360j.f2246B = M2.b.f1828y;
            C0360j.h(c0360j);
        } finally {
            reentrantLock2.unlock();
        }
    }

    @Override // m6.m
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public q build() {
        return (q) ((g7.m) this.f903u).b(new d4.f(6));
    }

    @Override // com.facebook.ads.internal.api.AdViewParentApi
    public void onConfigurationChanged(Configuration configuration) {
        super/*android.view.View*/.onConfigurationChanged(configuration);
    }

    public void p() {
        View view = (View) this.f903u;
        if (view != null) {
            ((InputMethodManager) view.getContext().getSystemService("input_method")).hideSoftInputFromWindow(view.getWindowToken(), 0);
        }
    }

    public void r() {
        ((SplashActivity) this.f903u).f36891z.postDelayed(new E(this, 0), 7000L);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x003f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void s(AbstractC5003S abstractC5003S, C0344t c0344t, C0344t c0344t2) {
        boolean z3;
        RecyclerView recyclerView = (RecyclerView) this.f903u;
        recyclerView.getClass();
        abstractC5003S.n(false);
        C5013h c5013h = (C5013h) recyclerView.f5260q0;
        if (c0344t != null) {
            c5013h.getClass();
            int i = c0344t.f2133a;
            int i6 = c0344t2.f2133a;
            if (i != i6 || c0344t.f2134b != c0344t2.f2134b) {
                z3 = c5013h.g(abstractC5003S, i, c0344t.f2134b, i6, c0344t2.f2134b);
                if (z3) {
                    return;
                }
                recyclerView.S();
                return;
            }
        }
        c5013h.l(abstractC5003S);
        abstractC5003S.f40590a.setAlpha(0.0f);
        c5013h.i.add(abstractC5003S);
        z3 = true;
        if (z3) {
        }
    }

    public void t(AbstractC5003S abstractC5003S, C0344t c0344t, C0344t c0344t2) {
        boolean z3;
        RecyclerView recyclerView = (RecyclerView) this.f903u;
        recyclerView.f5264u.j(abstractC5003S);
        recyclerView.f(abstractC5003S);
        abstractC5003S.n(false);
        C5013h c5013h = (C5013h) recyclerView.f5260q0;
        c5013h.getClass();
        int i = c0344t.f2133a;
        int i6 = c0344t.f2134b;
        View view = abstractC5003S.f40590a;
        int left = c0344t2 == null ? view.getLeft() : c0344t2.f2133a;
        int top = c0344t2 == null ? view.getTop() : c0344t2.f2134b;
        if (abstractC5003S.h() || (i == left && i6 == top)) {
            c5013h.l(abstractC5003S);
            c5013h.f40677h.add(abstractC5003S);
            z3 = true;
        } else {
            view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
            z3 = c5013h.g(abstractC5003S, i, i6, left, top);
        }
        if (z3) {
            recyclerView.S();
        }
    }

    public String toString() {
        switch (this.f902n) {
            case 19:
                return ((g7.m) this.f903u).d(getClass().getSimpleName());
            case 26:
                return "ServiceLoaderComponentLoader{classLoader=" + ((ClassLoader) this.f903u) + "}";
            default:
                return super.toString();
        }
    }

    public synchronized void u(r1.c cVar) {
        cVar.f40351b = null;
        cVar.f40352c = null;
        ((ArrayDeque) this.f903u).offer(cVar);
    }

    public void v(y8.h value) {
        kotlin.jvm.internal.h.e(value, "value");
        ((y8.f) this.f903u).v(value);
    }

    public void w(int i, c6.d fieldEncoding) {
        kotlin.jvm.internal.h.e(fieldEncoding, "fieldEncoding");
        x((i << 3) | fieldEncoding.f5583n);
    }

    public void x(int i) {
        while (true) {
            int i6 = i & (-128);
            y8.f fVar = (y8.f) this.f903u;
            if (i6 == 0) {
                fVar.t(i);
                return;
            } else {
                fVar.t((i & com.anythink.expressad.video.module.a.a.f21728R) | 128);
                i >>>= 7;
            }
        }
    }

    public void y(long j6) {
        while (true) {
            long j9 = (-128) & j6;
            y8.f fVar = (y8.f) this.f903u;
            if (j9 == 0) {
                fVar.t((int) j6);
                return;
            } else {
                fVar.t((((int) j6) & com.anythink.expressad.video.module.a.a.f21728R) | 128);
                j6 >>>= 7;
            }
        }
    }

    public /* synthetic */ a(int i, boolean z3) {
        this.f902n = i;
    }

    public a(y8.f sink) {
        this.f902n = 10;
        kotlin.jvm.internal.h.e(sink, "sink");
        this.f903u = sink;
    }

    public a(g7.t tVar, String str) {
        this.f902n = 19;
        this.f903u = new g7.m(str, g7.n.f37671n, 1, tVar);
    }

    public a(int i) {
        this.f902n = i;
        switch (i) {
            case 21:
                this.f903u = new CountDownLatch(1);
                break;
            default:
                char[] cArr = p.f1932a;
                this.f903u = new ArrayDeque(0);
                break;
        }
    }

    public a(com.anythink.core.common.n.b.a.e eVar) {
        this.f902n = 23;
        this.f903u = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, TimeUnit.SECONDS, new SynchronousQueue(), eVar);
    }
}
