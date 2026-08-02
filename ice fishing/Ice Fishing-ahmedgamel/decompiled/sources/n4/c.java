package n4;

import A1.C0260b;
import A1.E;
import A1.I;
import A1.x;
import A1.y;
import D1.l;
import E2.BinderC0314k;
import E2.C0316m;
import I0.j;
import O.InterfaceC0334e;
import P.u;
import Q2.C0365j;
import Q2.C0373s;
import Q2.H;
import Q2.w;
import R2.J;
import V7.k;
import Y0.o;
import Y0.p;
import android.content.ClipData;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.util.Log;
import android.util.Pair;
import android.view.ContentInfo;
import android.view.View;
import android.widget.EditText;
import androidx.drawerlayout.widget.DrawerLayout;
import com.IceFishing.LiveIceFishing.B;
import com.IceFishing.LiveIceFishing.G;
import com.IceFishing.LiveIceFishing.GenderActivity;
import com.IceFishing.LiveIceFishing.MainActivity;
import com.IceFishing.LiveIceFishing.PlaygamesActivity;
import com.IceFishing.LiveIceFishing.SplashActivity;
import com.IceFishing.LiveIceFishing.StartActivity;
import com.IceFishing.LiveIceFishing.ViewOnClickListenerC0559c;
import com.anythink.core.api.ATAdConst;
import com.anythink.core.common.e.g;
import com.facebook.ads.internal.api.AdViewParentApi;
import com.google.android.gms.internal.ads.AbstractC3592ma;
import com.google.android.gms.internal.ads.C3067cm;
import com.google.android.gms.internal.ads.C3324ha;
import com.google.android.gms.internal.ads.KD;
import e7.C4485a;
import g7.m;
import g7.v;
import i1.C4586c;
import j7.EnumC4623b;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.locks.ReentrantLock;
import l4.q;
import m.InterfaceC4701g0;
import m6.n;
import m6.t;
import m7.C4755a;
import n7.AbstractC4786a;
import n7.C4788c;
import o7.C4806a;
import o7.C4809d;
import r2.C4906k;
import s2.r;
import w0.C5131a;
import w0.C5132b;
import w0.d;
import w0.e;
import w2.z;
import x2.i;
import y8.f;
import y8.h;
import z0.C5214c;
import z7.InterfaceC5240d;

/* loaded from: classes2.dex */
public class c implements y, l, KD, InterfaceC0334e, w, H, V7.l, V7.b, u, o, AdViewParentApi, n, InterfaceC4701g0 {

    /* renamed from: v, reason: collision with root package name */
    public static volatile c f39656v;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f39657n;

    /* renamed from: u, reason: collision with root package name */
    public Object f39658u;

    public /* synthetic */ c(int i, Object obj) {
        this.f39657n = i;
        this.f39658u = obj;
    }

    public static J A(C5214c c5214c) {
        HashMap hashMap = new HashMap(2);
        hashMap.put("work_spec_id", new C5131a(1, 1, "work_spec_id", "TEXT", null, true));
        hashMap.put("prerequisite_id", new C5131a(2, 1, "prerequisite_id", "TEXT", null, true));
        HashSet hashSet = new HashSet(2);
        hashSet.add(new C5132b("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
        hashSet.add(new C5132b("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("prerequisite_id"), Arrays.asList("id")));
        HashSet hashSet2 = new HashSet(2);
        hashSet2.add(new d("index_Dependency_work_spec_id", Arrays.asList("work_spec_id"), Arrays.asList("ASC"), false));
        hashSet2.add(new d("index_Dependency_prerequisite_id", Arrays.asList("prerequisite_id"), Arrays.asList("ASC"), false));
        e eVar = new e("Dependency", hashMap, hashSet, hashSet2);
        e a9 = e.a(c5214c, "Dependency");
        if (!eVar.equals(a9)) {
            return new J(false, "Dependency(androidx.work.impl.model.Dependency).\n Expected:\n" + eVar + "\n Found:\n" + a9);
        }
        HashMap hashMap2 = new HashMap(27);
        hashMap2.put("id", new C5131a(1, 1, "id", "TEXT", null, true));
        hashMap2.put(com.anythink.core.express.b.a.f18313b, new C5131a(0, 1, com.anythink.core.express.b.a.f18313b, "INTEGER", null, true));
        hashMap2.put("worker_class_name", new C5131a(0, 1, "worker_class_name", "TEXT", null, true));
        hashMap2.put("input_merger_class_name", new C5131a(0, 1, "input_merger_class_name", "TEXT", null, false));
        hashMap2.put("input", new C5131a(0, 1, "input", "BLOB", null, true));
        hashMap2.put("output", new C5131a(0, 1, "output", "BLOB", null, true));
        hashMap2.put("initial_delay", new C5131a(0, 1, "initial_delay", "INTEGER", null, true));
        hashMap2.put("interval_duration", new C5131a(0, 1, "interval_duration", "INTEGER", null, true));
        hashMap2.put("flex_duration", new C5131a(0, 1, "flex_duration", "INTEGER", null, true));
        hashMap2.put("run_attempt_count", new C5131a(0, 1, "run_attempt_count", "INTEGER", null, true));
        hashMap2.put("backoff_policy", new C5131a(0, 1, "backoff_policy", "INTEGER", null, true));
        hashMap2.put("backoff_delay_duration", new C5131a(0, 1, "backoff_delay_duration", "INTEGER", null, true));
        hashMap2.put("last_enqueue_time", new C5131a(0, 1, "last_enqueue_time", "INTEGER", null, true));
        hashMap2.put("minimum_retention_duration", new C5131a(0, 1, "minimum_retention_duration", "INTEGER", null, true));
        hashMap2.put("schedule_requested_at", new C5131a(0, 1, "schedule_requested_at", "INTEGER", null, true));
        hashMap2.put("run_in_foreground", new C5131a(0, 1, "run_in_foreground", "INTEGER", null, true));
        hashMap2.put("out_of_quota_policy", new C5131a(0, 1, "out_of_quota_policy", "INTEGER", null, true));
        hashMap2.put("period_count", new C5131a(0, 1, "period_count", "INTEGER", "0", true));
        hashMap2.put("generation", new C5131a(0, 1, "generation", "INTEGER", "0", true));
        hashMap2.put("required_network_type", new C5131a(0, 1, "required_network_type", "INTEGER", null, true));
        hashMap2.put("requires_charging", new C5131a(0, 1, "requires_charging", "INTEGER", null, true));
        hashMap2.put("requires_device_idle", new C5131a(0, 1, "requires_device_idle", "INTEGER", null, true));
        hashMap2.put("requires_battery_not_low", new C5131a(0, 1, "requires_battery_not_low", "INTEGER", null, true));
        hashMap2.put("requires_storage_not_low", new C5131a(0, 1, "requires_storage_not_low", "INTEGER", null, true));
        hashMap2.put("trigger_content_update_delay", new C5131a(0, 1, "trigger_content_update_delay", "INTEGER", null, true));
        hashMap2.put("trigger_max_content_delay", new C5131a(0, 1, "trigger_max_content_delay", "INTEGER", null, true));
        hashMap2.put("content_uri_triggers", new C5131a(0, 1, "content_uri_triggers", "BLOB", null, true));
        HashSet hashSet3 = new HashSet(0);
        HashSet hashSet4 = new HashSet(2);
        hashSet4.add(new d("index_WorkSpec_schedule_requested_at", Arrays.asList("schedule_requested_at"), Arrays.asList("ASC"), false));
        hashSet4.add(new d("index_WorkSpec_last_enqueue_time", Arrays.asList("last_enqueue_time"), Arrays.asList("ASC"), false));
        e eVar2 = new e("WorkSpec", hashMap2, hashSet3, hashSet4);
        e a10 = e.a(c5214c, "WorkSpec");
        if (!eVar2.equals(a10)) {
            return new J(false, "WorkSpec(androidx.work.impl.model.WorkSpec).\n Expected:\n" + eVar2 + "\n Found:\n" + a10);
        }
        HashMap hashMap3 = new HashMap(2);
        hashMap3.put("tag", new C5131a(1, 1, "tag", "TEXT", null, true));
        hashMap3.put("work_spec_id", new C5131a(2, 1, "work_spec_id", "TEXT", null, true));
        HashSet hashSet5 = new HashSet(1);
        hashSet5.add(new C5132b("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
        HashSet hashSet6 = new HashSet(1);
        hashSet6.add(new d("index_WorkTag_work_spec_id", Arrays.asList("work_spec_id"), Arrays.asList("ASC"), false));
        e eVar3 = new e("WorkTag", hashMap3, hashSet5, hashSet6);
        e a11 = e.a(c5214c, "WorkTag");
        if (!eVar3.equals(a11)) {
            return new J(false, "WorkTag(androidx.work.impl.model.WorkTag).\n Expected:\n" + eVar3 + "\n Found:\n" + a11);
        }
        HashMap hashMap4 = new HashMap(3);
        hashMap4.put("work_spec_id", new C5131a(1, 1, "work_spec_id", "TEXT", null, true));
        hashMap4.put("generation", new C5131a(2, 1, "generation", "INTEGER", "0", true));
        hashMap4.put("system_id", new C5131a(0, 1, "system_id", "INTEGER", null, true));
        HashSet hashSet7 = new HashSet(1);
        hashSet7.add(new C5132b("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
        e eVar4 = new e("SystemIdInfo", hashMap4, hashSet7, new HashSet(0));
        e a12 = e.a(c5214c, "SystemIdInfo");
        if (!eVar4.equals(a12)) {
            return new J(false, "SystemIdInfo(androidx.work.impl.model.SystemIdInfo).\n Expected:\n" + eVar4 + "\n Found:\n" + a12);
        }
        HashMap hashMap5 = new HashMap(2);
        hashMap5.put("name", new C5131a(1, 1, "name", "TEXT", null, true));
        hashMap5.put("work_spec_id", new C5131a(2, 1, "work_spec_id", "TEXT", null, true));
        HashSet hashSet8 = new HashSet(1);
        hashSet8.add(new C5132b("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
        HashSet hashSet9 = new HashSet(1);
        hashSet9.add(new d("index_WorkName_work_spec_id", Arrays.asList("work_spec_id"), Arrays.asList("ASC"), false));
        e eVar5 = new e("WorkName", hashMap5, hashSet8, hashSet9);
        e a13 = e.a(c5214c, "WorkName");
        if (!eVar5.equals(a13)) {
            return new J(false, "WorkName(androidx.work.impl.model.WorkName).\n Expected:\n" + eVar5 + "\n Found:\n" + a13);
        }
        HashMap hashMap6 = new HashMap(2);
        hashMap6.put("work_spec_id", new C5131a(1, 1, "work_spec_id", "TEXT", null, true));
        hashMap6.put(g.a.f13735C, new C5131a(0, 1, g.a.f13735C, "BLOB", null, true));
        HashSet hashSet10 = new HashSet(1);
        hashSet10.add(new C5132b("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
        e eVar6 = new e("WorkProgress", hashMap6, hashSet10, new HashSet(0));
        e a14 = e.a(c5214c, "WorkProgress");
        if (!eVar6.equals(a14)) {
            return new J(false, "WorkProgress(androidx.work.impl.model.WorkProgress).\n Expected:\n" + eVar6 + "\n Found:\n" + a14);
        }
        HashMap hashMap7 = new HashMap(2);
        hashMap7.put("key", new C5131a(1, 1, "key", "TEXT", null, true));
        hashMap7.put("long_value", new C5131a(0, 1, "long_value", "INTEGER", null, false));
        e eVar7 = new e("Preference", hashMap7, new HashSet(0), new HashSet(0));
        e a15 = e.a(c5214c, "Preference");
        if (eVar7.equals(a15)) {
            return new J(true, (String) null);
        }
        return new J(false, "Preference(androidx.work.impl.model.Preference).\n Expected:\n" + eVar7 + "\n Found:\n" + a15);
    }

    public static void z(C5214c c5214c) {
        c5214c.A("CREATE TABLE IF NOT EXISTS `Dependency` (`work_spec_id` TEXT NOT NULL, `prerequisite_id` TEXT NOT NULL, PRIMARY KEY(`work_spec_id`, `prerequisite_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE , FOREIGN KEY(`prerequisite_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
        c5214c.A("CREATE INDEX IF NOT EXISTS `index_Dependency_work_spec_id` ON `Dependency` (`work_spec_id`)");
        c5214c.A("CREATE INDEX IF NOT EXISTS `index_Dependency_prerequisite_id` ON `Dependency` (`prerequisite_id`)");
        c5214c.A("CREATE TABLE IF NOT EXISTS `WorkSpec` (`id` TEXT NOT NULL, `state` INTEGER NOT NULL, `worker_class_name` TEXT NOT NULL, `input_merger_class_name` TEXT, `input` BLOB NOT NULL, `output` BLOB NOT NULL, `initial_delay` INTEGER NOT NULL, `interval_duration` INTEGER NOT NULL, `flex_duration` INTEGER NOT NULL, `run_attempt_count` INTEGER NOT NULL, `backoff_policy` INTEGER NOT NULL, `backoff_delay_duration` INTEGER NOT NULL, `last_enqueue_time` INTEGER NOT NULL, `minimum_retention_duration` INTEGER NOT NULL, `schedule_requested_at` INTEGER NOT NULL, `run_in_foreground` INTEGER NOT NULL, `out_of_quota_policy` INTEGER NOT NULL, `period_count` INTEGER NOT NULL DEFAULT 0, `generation` INTEGER NOT NULL DEFAULT 0, `required_network_type` INTEGER NOT NULL, `requires_charging` INTEGER NOT NULL, `requires_device_idle` INTEGER NOT NULL, `requires_battery_not_low` INTEGER NOT NULL, `requires_storage_not_low` INTEGER NOT NULL, `trigger_content_update_delay` INTEGER NOT NULL, `trigger_max_content_delay` INTEGER NOT NULL, `content_uri_triggers` BLOB NOT NULL, PRIMARY KEY(`id`))");
        c5214c.A("CREATE INDEX IF NOT EXISTS `index_WorkSpec_schedule_requested_at` ON `WorkSpec` (`schedule_requested_at`)");
        c5214c.A("CREATE INDEX IF NOT EXISTS `index_WorkSpec_last_enqueue_time` ON `WorkSpec` (`last_enqueue_time`)");
        c5214c.A("CREATE TABLE IF NOT EXISTS `WorkTag` (`tag` TEXT NOT NULL, `work_spec_id` TEXT NOT NULL, PRIMARY KEY(`tag`, `work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
        c5214c.A("CREATE INDEX IF NOT EXISTS `index_WorkTag_work_spec_id` ON `WorkTag` (`work_spec_id`)");
        c5214c.A("CREATE TABLE IF NOT EXISTS `SystemIdInfo` (`work_spec_id` TEXT NOT NULL, `generation` INTEGER NOT NULL DEFAULT 0, `system_id` INTEGER NOT NULL, PRIMARY KEY(`work_spec_id`, `generation`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
        c5214c.A("CREATE TABLE IF NOT EXISTS `WorkName` (`name` TEXT NOT NULL, `work_spec_id` TEXT NOT NULL, PRIMARY KEY(`name`, `work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
        c5214c.A("CREATE INDEX IF NOT EXISTS `index_WorkName_work_spec_id` ON `WorkName` (`work_spec_id`)");
        c5214c.A("CREATE TABLE IF NOT EXISTS `WorkProgress` (`work_spec_id` TEXT NOT NULL, `progress` BLOB NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
        c5214c.A("CREATE TABLE IF NOT EXISTS `Preference` (`key` TEXT NOT NULL, `long_value` INTEGER, PRIMARY KEY(`key`))");
        c5214c.A("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        c5214c.A("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '5181942b9ebc31ce68dacb56c16fd79f')");
    }

    public void B() {
        NetworkInfo activeNetworkInfo;
        boolean z6 = p.f3875d.getBoolean("app_AppOpenAdStatus", false);
        String string = p.f3875d.getString("AppOpenID", "");
        q qVar = (q) this.f39658u;
        if (!z6 || string.isEmpty() || (activeNetworkInfo = ((ConnectivityManager) ((SplashActivity) qVar.f38948w).getSystemService("connectivity")).getActiveNetworkInfo()) == null || !activeNetworkInfo.isConnected()) {
            ((C4586c) qVar.f38945n).s();
            return;
        }
        Log.d("Workingdone", "5");
        if (z6) {
            Log.d("Workingdone", "6");
        } else {
            Log.d("Workingdone", "7");
            ((C4586c) qVar.f38947v).s();
        }
    }

    public void C(h value) {
        kotlin.jvm.internal.h.e(value, "value");
        ((f) this.f39658u).v(value);
    }

    public void D(int i, c6.d fieldEncoding) {
        kotlin.jvm.internal.h.e(fieldEncoding, "fieldEncoding");
        E((i << 3) | fieldEncoding.f5759n);
    }

    public void E(int i) {
        while (true) {
            int i4 = i & (-128);
            f fVar = (f) this.f39658u;
            if (i4 == 0) {
                fVar.t(i);
                return;
            } else {
                fVar.t((i & com.anythink.expressad.video.module.a.a.f22515R) | 128);
                i >>>= 7;
            }
        }
    }

    public void F(long j6) {
        while (true) {
            long j9 = (-128) & j6;
            f fVar = (f) this.f39658u;
            if (j9 == 0) {
                fVar.t((int) j6);
                return;
            } else {
                fVar.t((((int) j6) & com.anythink.expressad.video.module.a.a.f22515R) | 128);
                j6 >>>= 7;
            }
        }
    }

    @Override // Y0.o
    public void OnCall() {
        switch (this.f39657n) {
            case 22:
                ViewOnClickListenerC0559c viewOnClickListenerC0559c = (ViewOnClickListenerC0559c) this.f39658u;
                viewOnClickListenerC0559c.f6395u.startActivity(new Intent(viewOnClickListenerC0559c.f6395u, (Class<?>) MainActivity.class));
                break;
            case 23:
                com.IceFishing.LiveIceFishing.q qVar = (com.IceFishing.LiveIceFishing.q) this.f39658u;
                qVar.f6420u.startActivity(new Intent(qVar.f6420u, (Class<?>) GenderActivity.class));
                break;
            case 24:
                MainActivity mainActivity = ((com.IceFishing.LiveIceFishing.y) this.f39658u).f6437u.f6440c;
                mainActivity.startActivity(mainActivity.f6332R);
                break;
            case 25:
                PlaygamesActivity playgamesActivity = ((B) this.f39658u).f5847u;
                playgamesActivity.startActivity(playgamesActivity.f6369u);
                break;
            default:
                StartActivity startActivity = ((G) this.f39658u).f5886u;
                startActivity.startActivity(startActivity.f6387y);
                break;
        }
    }

    @Override // m6.n
    public n a() {
        ((m) this.f39658u).f37691d = "The number of items queued";
        return this;
    }

    @Override // m6.n
    public n c() {
        ((m) this.f39658u).f37692e = "1";
        return this;
    }

    @Override // O.InterfaceC0334e
    public int d() {
        int source;
        source = ((ContentInfo) this.f39658u).getSource();
        return source;
    }

    @Override // O.InterfaceC0334e
    public ClipData e() {
        ClipData clip;
        clip = ((ContentInfo) this.f39658u).getClip();
        return clip;
    }

    @Override // P.u
    public boolean f(View view) {
        DrawerLayout drawerLayout = (DrawerLayout) this.f39658u;
        if (!DrawerLayout.n(view) || drawerLayout.i(view) == 2) {
            return false;
        }
        drawerLayout.b(view);
        return true;
    }

    @Override // D1.l
    public int h() {
        return (q() << 8) | q();
    }

    @Override // Q2.w
    public void i() {
        Q2.y yVar = (Q2.y) this.f39658u;
        yVar.f2640n.lock();
        try {
            yVar.f2636D = new C0373s(yVar, yVar.f2633A, yVar.f2634B, yVar.f2643w, yVar.f2635C, yVar.f2640n, yVar.f2642v);
            yVar.f2636D.t();
            yVar.f2641u.signalAll();
        } finally {
            yVar.f2640n.unlock();
        }
    }

    @Override // A1.y
    public x j(E e9) {
        return new C0260b((Resources) this.f39658u, I.f35b);
    }

    @Override // Q2.H
    public void k(int i) {
        O2.b bVar;
        C0365j c0365j = (C0365j) this.f39658u;
        ReentrantLock reentrantLock = (ReentrantLock) c0365j.f2565C;
        ReentrantLock reentrantLock2 = (ReentrantLock) c0365j.f2565C;
        reentrantLock.lock();
        try {
            if (!c0365j.f2566n && (bVar = (O2.b) c0365j.f2564B) != null && bVar.b()) {
                c0365j.f2566n = true;
                ((Q2.y) c0365j.f2570x).onConnectionSuspended(i);
                return;
            }
            c0365j.f2566n = false;
            C0365j.g(c0365j, i);
        } finally {
            reentrantLock2.unlock();
        }
    }

    @Override // V7.b
    public Object l(V7.c cVar, InterfaceC5240d interfaceC5240d) {
        ((V7.n) ((k) this.f39658u)).l(cVar, interfaceC5240d);
        return A7.a.f215n;
    }

    @Override // m6.n
    public t m(C4485a c4485a) {
        m mVar = (m) this.f39658u;
        mVar.f37694g = g7.n.f37699w;
        k7.b c9 = mVar.c();
        g7.t tVar = (g7.t) mVar.f37693f;
        tVar.getClass();
        ArrayList arrayList = new ArrayList();
        Iterator it = tVar.f37719e.entrySet().iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            Y6.a aVar = tVar.f37718d;
            if (!hasNext) {
                n7.e eVar = new n7.e(c9, arrayList);
                C4788c c4788c = new C4788c(Collections.singletonList(eVar), new F.n(16, c4485a, eVar));
                g7.t tVar2 = (g7.t) mVar.f37693f;
                synchronized (tVar2.f37715a) {
                    tVar2.f37716b.add(c4788c);
                }
                return new v((g7.t) mVar.f37693f, c4788c);
            }
            Map.Entry entry = (Map.Entry) it.next();
            C4755a c4755a = (C4755a) entry.getKey();
            for (C4806a c4806a : c4755a.f39477b.a(c9, aVar)) {
                C4809d c4809d = C4809d.f39752a;
                g7.d dVar = c4806a.f39746b;
                if (c4809d != dVar.f37685a) {
                    int i = AbstractC4786a.f39669a;
                    k7.c.a(dVar, EnumC4623b.f38489n, c9);
                    throw null;
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.KD
    /* renamed from: n */
    public void mo10n(Object obj) {
        int i = z.f41712b;
        i.a("Initialized webview successfully for SDKCore.");
        if (((Boolean) r.f40506e.f40509c.a(AbstractC3592ma.eb)).booleanValue()) {
            Pair pair = new Pair("se", "query_g");
            Pair pair2 = new Pair(ATAdConst.NETWORK_REQUEST_PARAMS_KEY.FORMAT, "BANNER");
            Pair pair3 = new Pair("rtype", Integer.toString(6));
            Pair pair4 = new Pair("scar", "true");
            BinderC0314k binderC0314k = (BinderC0314k) this.f39658u;
            t8.g.z(binderC0314k.f812E, "sgs", pair, pair2, pair3, pair4, new Pair("sgi_rn", Integer.toString(binderC0314k.f829W.get())));
            binderC0314k.f828V.set(true);
        }
    }

    @Override // Q2.H
    public void o(Bundle bundle) {
        C0365j c0365j = (C0365j) this.f39658u;
        ReentrantLock reentrantLock = (ReentrantLock) c0365j.f2565C;
        ReentrantLock reentrantLock2 = (ReentrantLock) c0365j.f2565C;
        reentrantLock.lock();
        try {
            Bundle bundle2 = (Bundle) c0365j.f2572z;
            if (bundle2 == null) {
                c0365j.f2572z = bundle;
            } else if (bundle != null) {
                bundle2.putAll(bundle);
            }
            c0365j.f2563A = O2.b.f2254y;
            C0365j.h(c0365j);
        } finally {
            reentrantLock2.unlock();
        }
    }

    @Override // com.facebook.ads.internal.api.AdViewParentApi
    public void onConfigurationChanged(Configuration configuration) {
        super/*android.view.View*/.onConfigurationChanged(configuration);
    }

    @Override // D1.l
    public long p(long j6) {
        if (j6 < 0) {
            return 0L;
        }
        long j9 = j6;
        while (j9 > 0) {
            InputStream inputStream = (InputStream) this.f39658u;
            long skip = inputStream.skip(j9);
            if (skip > 0) {
                j9 -= skip;
            } else {
                if (inputStream.read() == -1) {
                    break;
                }
                j9--;
            }
        }
        return j6 - j9;
    }

    @Override // D1.l
    public short q() {
        int read = ((InputStream) this.f39658u).read();
        if (read != -1) {
            return (short) read;
        }
        throw new D1.k();
    }

    @Override // Q2.H
    public void s(O2.b bVar) {
        C0365j c0365j = (C0365j) this.f39658u;
        ReentrantLock reentrantLock = (ReentrantLock) c0365j.f2565C;
        ReentrantLock reentrantLock2 = (ReentrantLock) c0365j.f2565C;
        reentrantLock.lock();
        try {
            c0365j.f2563A = bVar;
            C0365j.h(c0365j);
        } finally {
            reentrantLock2.unlock();
        }
    }

    @Override // Q2.w
    public void t() {
        Q2.y yVar = (Q2.y) this.f39658u;
        Iterator it = ((s.i) yVar.f2645y.values()).iterator();
        while (it.hasNext()) {
            ((P2.c) it.next()).g();
        }
        yVar.f2638F.f2619I = Collections.EMPTY_SET;
    }

    public String toString() {
        switch (this.f39657n) {
            case 10:
                return "ContentInfoCompat{" + ((ContentInfo) this.f39658u) + "}";
            case 28:
                return ((m) this.f39658u).d(getClass().getSimpleName());
            default:
                return super.toString();
        }
    }

    @Override // O.InterfaceC0334e
    public int u() {
        int flags;
        flags = ((ContentInfo) this.f39658u).getFlags();
        return flags;
    }

    @Override // D1.l
    public int v(int i, byte[] bArr) {
        int i4 = 0;
        int i6 = 0;
        while (i4 < i && (i6 = ((InputStream) this.f39658u).read(bArr, i4, i - i4)) != -1) {
            i4 += i6;
        }
        if (i4 == 0 && i6 == -1) {
            throw new D1.k();
        }
        return i4;
    }

    @Override // com.google.android.gms.internal.ads.KD
    public void w(Throwable th) {
        C4906k.f40186C.f40196h.d("SignalGeneratorImpl.initializeWebViewForSignalCollection", th);
        Pair pair = new Pair("sgf_reason", th.getMessage());
        Pair pair2 = new Pair("se", "query_g");
        Pair pair3 = new Pair(ATAdConst.NETWORK_REQUEST_PARAMS_KEY.FORMAT, "BANNER");
        Pair pair4 = new Pair("rtype", Integer.toString(6));
        Pair pair5 = new Pair("scar", "true");
        BinderC0314k binderC0314k = (BinderC0314k) this.f39658u;
        t8.g.z(binderC0314k.f812E, "sgf", pair, pair2, pair3, pair4, pair5, new Pair("sgi_rn", Integer.toString(binderC0314k.f829W.get())));
        int i = z.f41712b;
        i.d("Failed to initialize webview for loading SDKCore. ", th);
        C3324ha c3324ha = AbstractC3592ma.eb;
        r rVar = r.f40506e;
        if (!((Boolean) rVar.f40509c.a(c3324ha)).booleanValue() || binderC0314k.f828V.get()) {
            return;
        }
        if (binderC0314k.f829W.getAndIncrement() < ((Integer) rVar.f40509c.a(AbstractC3592ma.fb)).intValue()) {
            binderC0314k.X3();
        }
    }

    @Override // O.InterfaceC0334e
    public ContentInfo x() {
        return (ContentInfo) this.f39658u;
    }

    @Override // Q2.w
    public boolean y() {
        return true;
    }

    public /* synthetic */ c(C0316m c0316m) {
        this.f39657n = 6;
        this.f39658u = c0316m.f851u;
    }

    public /* synthetic */ c(C4586c c4586c) {
        this.f39657n = 11;
        c4586c.getClass();
        this.f39658u = (O3.a) c4586c.f38154u;
    }

    public c(BinderC0314k binderC0314k) {
        this.f39657n = 5;
        Objects.requireNonNull(binderC0314k);
        this.f39658u = binderC0314k;
    }

    public c(int i) {
        this.f39657n = i;
        switch (i) {
            case 1:
                this.f39658u = new A1.u(500L, 0);
                break;
            case 8:
                break;
            default:
                this.f39658u = new HashSet();
                break;
        }
    }

    public c(g7.t tVar, String str, String str2, String str3, j jVar) {
        this.f39657n = 28;
        m mVar = new m(str, g7.n.f37700x, 1, tVar);
        mVar.f37691d = str2;
        mVar.f37692e = str3;
        mVar.f37695h = jVar;
        this.f39658u = mVar;
    }

    public c(f sink) {
        this.f39657n = 21;
        kotlin.jvm.internal.h.e(sink, "sink");
        this.f39658u = sink;
    }

    public c(EditText editText) {
        this.f39657n = 20;
        this.f39658u = new C3067cm(editText);
    }

    public c(ContentInfo contentInfo) {
        this.f39657n = 10;
        contentInfo.getClass();
        this.f39658u = D3.e.q(contentInfo);
    }

    @Override // Q2.w
    public void g(Bundle bundle) {
    }

    @Override // Q2.w
    public void r(int i) {
    }

    @Override // Q2.w
    public void b(O2.b bVar, P2.e eVar, boolean z6) {
    }
}
