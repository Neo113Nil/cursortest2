package h4;

import B2.u;
import E7.q;
import I0.o;
import N2.C0324j;
import N2.C0332s;
import N2.H;
import N2.InterfaceC0323i;
import N2.w;
import N2.y;
import O2.J;
import S0.i;
import a.AbstractC0415a;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcel;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.webkit.WebView;
import android.widget.EditText;
import androidx.fragment.app.AbstractComponentCallbacksC0485s;
import androidx.fragment.app.K;
import androidx.fragment.app.N;
import androidx.work.impl.WorkDatabase;
import b2.InterfaceC0525b;
import c7.m;
import c7.p;
import c7.t;
import com.anythink.core.common.e.g;
import com.anythink.core.common.s;
import com.facebook.ads.internal.api.AdViewParentApi;
import com.google.android.gms.internal.ads.C2609Il;
import com.google.android.gms.internal.ads.LD;
import com.google.android.gms.internal.ads.LE;
import com.google.android.gms.internal.ads.Rx;
import com.icefishing.icefishingliveapp.C5284R;
import com.icefishing.icefishingliveapp.E;
import com.icefishing.icefishingliveapp.IntroActivity;
import com.icefishing.icefishingliveapp.MainActivity;
import com.icefishing.icefishingliveapp.SplashActivity;
import com.icefishing.icefishingliveapp.n;
import e.C4462a;
import e.InterfaceC4463b;
import e7.AbstractC4482d;
import g1.C4523c;
import g2.j;
import h.AbstractC4542a;
import h.C4541H;
import h.InterfaceC4543b;
import h.LayoutInflaterFactory2C4535B;
import h.x;
import h3.InterfaceC4567a;
import h3.h;
import i6.k;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;
import k4.InterfaceC4657l;
import l.InterfaceC4682j;
import l.l;
import m.Q0;
import org.chromium.support_lib_boundary.ProfileStoreBoundaryInterface;
import org.chromium.support_lib_boundary.StaticsBoundaryInterface;
import org.chromium.support_lib_boundary.WebViewProviderBoundaryInterface;
import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;
import s1.f;
import w0.C5146a;
import w0.C5147b;
import w0.d;
import w0.e;
import z0.C5260c;

/* loaded from: classes2.dex */
public class c implements f, LD, o, w, H, InterfaceC0323i, InterfaceC4567a, InterfaceC4463b, k, AdViewParentApi, InterfaceC4657l, InterfaceC0525b, InterfaceC4543b, InterfaceC4682j {

    /* renamed from: v, reason: collision with root package name */
    public static volatile c f38230v;

    /* renamed from: w, reason: collision with root package name */
    public static c f38231w;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f38232n;

    /* renamed from: u, reason: collision with root package name */
    public Object f38233u;

    public /* synthetic */ c(int i, Object obj) {
        this.f38232n = i;
        this.f38233u = obj;
    }

    public static void A(C5260c c5260c) {
        c5260c.A("CREATE TABLE IF NOT EXISTS `Dependency` (`work_spec_id` TEXT NOT NULL, `prerequisite_id` TEXT NOT NULL, PRIMARY KEY(`work_spec_id`, `prerequisite_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE , FOREIGN KEY(`prerequisite_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
        c5260c.A("CREATE INDEX IF NOT EXISTS `index_Dependency_work_spec_id` ON `Dependency` (`work_spec_id`)");
        c5260c.A("CREATE INDEX IF NOT EXISTS `index_Dependency_prerequisite_id` ON `Dependency` (`prerequisite_id`)");
        c5260c.A("CREATE TABLE IF NOT EXISTS `WorkSpec` (`id` TEXT NOT NULL, `state` INTEGER NOT NULL, `worker_class_name` TEXT NOT NULL, `input_merger_class_name` TEXT, `input` BLOB NOT NULL, `output` BLOB NOT NULL, `initial_delay` INTEGER NOT NULL, `interval_duration` INTEGER NOT NULL, `flex_duration` INTEGER NOT NULL, `run_attempt_count` INTEGER NOT NULL, `backoff_policy` INTEGER NOT NULL, `backoff_delay_duration` INTEGER NOT NULL, `last_enqueue_time` INTEGER NOT NULL, `minimum_retention_duration` INTEGER NOT NULL, `schedule_requested_at` INTEGER NOT NULL, `run_in_foreground` INTEGER NOT NULL, `out_of_quota_policy` INTEGER NOT NULL, `period_count` INTEGER NOT NULL DEFAULT 0, `generation` INTEGER NOT NULL DEFAULT 0, `required_network_type` INTEGER NOT NULL, `requires_charging` INTEGER NOT NULL, `requires_device_idle` INTEGER NOT NULL, `requires_battery_not_low` INTEGER NOT NULL, `requires_storage_not_low` INTEGER NOT NULL, `trigger_content_update_delay` INTEGER NOT NULL, `trigger_max_content_delay` INTEGER NOT NULL, `content_uri_triggers` BLOB NOT NULL, PRIMARY KEY(`id`))");
        c5260c.A("CREATE INDEX IF NOT EXISTS `index_WorkSpec_schedule_requested_at` ON `WorkSpec` (`schedule_requested_at`)");
        c5260c.A("CREATE INDEX IF NOT EXISTS `index_WorkSpec_last_enqueue_time` ON `WorkSpec` (`last_enqueue_time`)");
        c5260c.A("CREATE TABLE IF NOT EXISTS `WorkTag` (`tag` TEXT NOT NULL, `work_spec_id` TEXT NOT NULL, PRIMARY KEY(`tag`, `work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
        c5260c.A("CREATE INDEX IF NOT EXISTS `index_WorkTag_work_spec_id` ON `WorkTag` (`work_spec_id`)");
        c5260c.A("CREATE TABLE IF NOT EXISTS `SystemIdInfo` (`work_spec_id` TEXT NOT NULL, `generation` INTEGER NOT NULL DEFAULT 0, `system_id` INTEGER NOT NULL, PRIMARY KEY(`work_spec_id`, `generation`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
        c5260c.A("CREATE TABLE IF NOT EXISTS `WorkName` (`name` TEXT NOT NULL, `work_spec_id` TEXT NOT NULL, PRIMARY KEY(`name`, `work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
        c5260c.A("CREATE INDEX IF NOT EXISTS `index_WorkName_work_spec_id` ON `WorkName` (`work_spec_id`)");
        c5260c.A("CREATE TABLE IF NOT EXISTS `WorkProgress` (`work_spec_id` TEXT NOT NULL, `progress` BLOB NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
        c5260c.A("CREATE TABLE IF NOT EXISTS `Preference` (`key` TEXT NOT NULL, `long_value` INTEGER, PRIMARY KEY(`key`))");
        c5260c.A("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        c5260c.A("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '5181942b9ebc31ce68dacb56c16fd79f')");
    }

    public static J D(C5260c c5260c) {
        HashMap hashMap = new HashMap(2);
        hashMap.put("work_spec_id", new C5146a(1, 1, "work_spec_id", "TEXT", null, true));
        hashMap.put("prerequisite_id", new C5146a(2, 1, "prerequisite_id", "TEXT", null, true));
        HashSet hashSet = new HashSet(2);
        hashSet.add(new C5147b("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
        hashSet.add(new C5147b("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("prerequisite_id"), Arrays.asList("id")));
        HashSet hashSet2 = new HashSet(2);
        hashSet2.add(new d("index_Dependency_work_spec_id", Arrays.asList("work_spec_id"), Arrays.asList("ASC"), false));
        hashSet2.add(new d("index_Dependency_prerequisite_id", Arrays.asList("prerequisite_id"), Arrays.asList("ASC"), false));
        e eVar = new e("Dependency", hashMap, hashSet, hashSet2);
        e a9 = e.a(c5260c, "Dependency");
        if (!eVar.equals(a9)) {
            return new J(false, "Dependency(androidx.work.impl.model.Dependency).\n Expected:\n" + eVar + "\n Found:\n" + a9);
        }
        HashMap hashMap2 = new HashMap(27);
        hashMap2.put("id", new C5146a(1, 1, "id", "TEXT", null, true));
        hashMap2.put(com.anythink.core.express.b.a.f17684b, new C5146a(0, 1, com.anythink.core.express.b.a.f17684b, "INTEGER", null, true));
        hashMap2.put("worker_class_name", new C5146a(0, 1, "worker_class_name", "TEXT", null, true));
        hashMap2.put("input_merger_class_name", new C5146a(0, 1, "input_merger_class_name", "TEXT", null, false));
        hashMap2.put("input", new C5146a(0, 1, "input", "BLOB", null, true));
        hashMap2.put("output", new C5146a(0, 1, "output", "BLOB", null, true));
        hashMap2.put("initial_delay", new C5146a(0, 1, "initial_delay", "INTEGER", null, true));
        hashMap2.put("interval_duration", new C5146a(0, 1, "interval_duration", "INTEGER", null, true));
        hashMap2.put("flex_duration", new C5146a(0, 1, "flex_duration", "INTEGER", null, true));
        hashMap2.put("run_attempt_count", new C5146a(0, 1, "run_attempt_count", "INTEGER", null, true));
        hashMap2.put("backoff_policy", new C5146a(0, 1, "backoff_policy", "INTEGER", null, true));
        hashMap2.put("backoff_delay_duration", new C5146a(0, 1, "backoff_delay_duration", "INTEGER", null, true));
        hashMap2.put("last_enqueue_time", new C5146a(0, 1, "last_enqueue_time", "INTEGER", null, true));
        hashMap2.put("minimum_retention_duration", new C5146a(0, 1, "minimum_retention_duration", "INTEGER", null, true));
        hashMap2.put("schedule_requested_at", new C5146a(0, 1, "schedule_requested_at", "INTEGER", null, true));
        hashMap2.put("run_in_foreground", new C5146a(0, 1, "run_in_foreground", "INTEGER", null, true));
        hashMap2.put("out_of_quota_policy", new C5146a(0, 1, "out_of_quota_policy", "INTEGER", null, true));
        hashMap2.put("period_count", new C5146a(0, 1, "period_count", "INTEGER", "0", true));
        hashMap2.put("generation", new C5146a(0, 1, "generation", "INTEGER", "0", true));
        hashMap2.put("required_network_type", new C5146a(0, 1, "required_network_type", "INTEGER", null, true));
        hashMap2.put("requires_charging", new C5146a(0, 1, "requires_charging", "INTEGER", null, true));
        hashMap2.put("requires_device_idle", new C5146a(0, 1, "requires_device_idle", "INTEGER", null, true));
        hashMap2.put("requires_battery_not_low", new C5146a(0, 1, "requires_battery_not_low", "INTEGER", null, true));
        hashMap2.put("requires_storage_not_low", new C5146a(0, 1, "requires_storage_not_low", "INTEGER", null, true));
        hashMap2.put("trigger_content_update_delay", new C5146a(0, 1, "trigger_content_update_delay", "INTEGER", null, true));
        hashMap2.put("trigger_max_content_delay", new C5146a(0, 1, "trigger_max_content_delay", "INTEGER", null, true));
        hashMap2.put("content_uri_triggers", new C5146a(0, 1, "content_uri_triggers", "BLOB", null, true));
        HashSet hashSet3 = new HashSet(0);
        HashSet hashSet4 = new HashSet(2);
        hashSet4.add(new d("index_WorkSpec_schedule_requested_at", Arrays.asList("schedule_requested_at"), Arrays.asList("ASC"), false));
        hashSet4.add(new d("index_WorkSpec_last_enqueue_time", Arrays.asList("last_enqueue_time"), Arrays.asList("ASC"), false));
        e eVar2 = new e("WorkSpec", hashMap2, hashSet3, hashSet4);
        e a10 = e.a(c5260c, "WorkSpec");
        if (!eVar2.equals(a10)) {
            return new J(false, "WorkSpec(androidx.work.impl.model.WorkSpec).\n Expected:\n" + eVar2 + "\n Found:\n" + a10);
        }
        HashMap hashMap3 = new HashMap(2);
        hashMap3.put("tag", new C5146a(1, 1, "tag", "TEXT", null, true));
        hashMap3.put("work_spec_id", new C5146a(2, 1, "work_spec_id", "TEXT", null, true));
        HashSet hashSet5 = new HashSet(1);
        hashSet5.add(new C5147b("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
        HashSet hashSet6 = new HashSet(1);
        hashSet6.add(new d("index_WorkTag_work_spec_id", Arrays.asList("work_spec_id"), Arrays.asList("ASC"), false));
        e eVar3 = new e("WorkTag", hashMap3, hashSet5, hashSet6);
        e a11 = e.a(c5260c, "WorkTag");
        if (!eVar3.equals(a11)) {
            return new J(false, "WorkTag(androidx.work.impl.model.WorkTag).\n Expected:\n" + eVar3 + "\n Found:\n" + a11);
        }
        HashMap hashMap4 = new HashMap(3);
        hashMap4.put("work_spec_id", new C5146a(1, 1, "work_spec_id", "TEXT", null, true));
        hashMap4.put("generation", new C5146a(2, 1, "generation", "INTEGER", "0", true));
        hashMap4.put("system_id", new C5146a(0, 1, "system_id", "INTEGER", null, true));
        HashSet hashSet7 = new HashSet(1);
        hashSet7.add(new C5147b("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
        e eVar4 = new e("SystemIdInfo", hashMap4, hashSet7, new HashSet(0));
        e a12 = e.a(c5260c, "SystemIdInfo");
        if (!eVar4.equals(a12)) {
            return new J(false, "SystemIdInfo(androidx.work.impl.model.SystemIdInfo).\n Expected:\n" + eVar4 + "\n Found:\n" + a12);
        }
        HashMap hashMap5 = new HashMap(2);
        hashMap5.put("name", new C5146a(1, 1, "name", "TEXT", null, true));
        hashMap5.put("work_spec_id", new C5146a(2, 1, "work_spec_id", "TEXT", null, true));
        HashSet hashSet8 = new HashSet(1);
        hashSet8.add(new C5147b("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
        HashSet hashSet9 = new HashSet(1);
        hashSet9.add(new d("index_WorkName_work_spec_id", Arrays.asList("work_spec_id"), Arrays.asList("ASC"), false));
        e eVar5 = new e("WorkName", hashMap5, hashSet8, hashSet9);
        e a13 = e.a(c5260c, "WorkName");
        if (!eVar5.equals(a13)) {
            return new J(false, "WorkName(androidx.work.impl.model.WorkName).\n Expected:\n" + eVar5 + "\n Found:\n" + a13);
        }
        HashMap hashMap6 = new HashMap(2);
        hashMap6.put("work_spec_id", new C5146a(1, 1, "work_spec_id", "TEXT", null, true));
        hashMap6.put(g.a.f13106C, new C5146a(0, 1, g.a.f13106C, "BLOB", null, true));
        HashSet hashSet10 = new HashSet(1);
        hashSet10.add(new C5147b("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
        e eVar6 = new e("WorkProgress", hashMap6, hashSet10, new HashSet(0));
        e a14 = e.a(c5260c, "WorkProgress");
        if (!eVar6.equals(a14)) {
            return new J(false, "WorkProgress(androidx.work.impl.model.WorkProgress).\n Expected:\n" + eVar6 + "\n Found:\n" + a14);
        }
        HashMap hashMap7 = new HashMap(2);
        hashMap7.put("key", new C5146a(1, 1, "key", "TEXT", null, true));
        hashMap7.put("long_value", new C5146a(0, 1, "long_value", "INTEGER", null, false));
        e eVar7 = new e("Preference", hashMap7, new HashSet(0), new HashSet(0));
        e a15 = e.a(c5260c, "Preference");
        if (eVar7.equals(a15)) {
            return new J(true, (String) null);
        }
        return new J(false, "Preference(androidx.work.impl.model.Preference).\n Expected:\n" + eVar7 + "\n Found:\n" + a15);
    }

    public synchronized ArrayList B(Class cls, Class cls2) {
        ArrayList arrayList = new ArrayList();
        if (cls2.isAssignableFrom(cls)) {
            arrayList.add(cls2);
            return arrayList;
        }
        Iterator it = ((ArrayList) this.f38233u).iterator();
        while (it.hasNext()) {
            G1.d dVar = (G1.d) it.next();
            if ((dVar.f1197a.isAssignableFrom(cls) && cls2.isAssignableFrom(dVar.f1198b)) && !arrayList.contains(dVar.f1198b)) {
                arrayList.add(dVar.f1198b);
            }
        }
        return arrayList;
    }

    public void C() {
        View view = (View) this.f38233u;
        if (view != null) {
            ((InputMethodManager) view.getContext().getSystemService("input_method")).hideSoftInputFromWindow(view.getWindowToken(), 0);
        }
    }

    public void E() {
        ((SplashActivity) this.f38233u).f37052z.postDelayed(new E(this, 0), 7000L);
    }

    @Override // k4.InterfaceC4657l
    public void OnCall() {
        switch (this.f38232n) {
            case 20:
                super/*androidx.activity.p*/.onBackPressed();
                break;
            case 21:
                IntroActivity introActivity = ((n) this.f38233u).f37089u;
                introActivity.startActivity(introActivity.f36940x);
                break;
            case 22:
                MainActivity mainActivity = ((com.icefishing.icefishingliveapp.w) this.f38233u).f37107u.f37110c;
                mainActivity.startActivity(mainActivity.f37001Q);
                break;
            default:
                MainActivity mainActivity2 = ((com.icefishing.icefishingliveapp.w) this.f38233u).f37107u.f37110c;
                mainActivity2.startActivity(mainActivity2.f37011V);
                break;
        }
    }

    @Override // i6.k
    public k a() {
        ((m) this.f38233u).f5721d = "The duration of exporting a batch of telemetry records";
        return this;
    }

    @Override // N2.InterfaceC0323i
    public void accept(Object obj, Object obj2) {
        h hVar = (h) obj2;
        Q2.a aVar = (Q2.a) ((Q2.d) obj).u();
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(aVar.f4244v);
        int i = Z2.b.f4245a;
        O2.n nVar = (O2.n) this.f38233u;
        if (nVar == null) {
            obtain.writeInt(0);
        } else {
            obtain.writeInt(1);
            nVar.writeToParcel(obtain, 0);
        }
        try {
            aVar.f4243u.transact(1, obtain, null, 1);
            obtain.recycle();
            hVar.b(null);
        } catch (Throwable th) {
            obtain.recycle();
            throw th;
        }
    }

    @Override // i6.k
    public k b() {
        ((m) this.f38233u).f5722e = s.f16407a;
        return this;
    }

    @Override // I0.o
    public WebViewProviderBoundaryInterface createWebView(WebView webView) {
        return (WebViewProviderBoundaryInterface) w8.a.b(WebViewProviderBoundaryInterface.class, ((WebViewProviderFactoryBoundaryInterface) this.f38233u).createWebView(webView));
    }

    @Override // h.InterfaceC4543b
    public boolean d() {
        LayoutInflaterFactory2C4535B layoutInflaterFactory2C4535B = (LayoutInflaterFactory2C4535B) this.f38233u;
        layoutInflaterFactory2C4535B.C();
        AbstractC4542a abstractC4542a = layoutInflaterFactory2C4535B.f37981H;
        return (abstractC4542a == null || (abstractC4542a.d() & 4) == 0) ? false : true;
    }

    @Override // N2.w
    public void e() {
        y yVar = (y) this.f38233u;
        yVar.f2139n.lock();
        try {
            yVar.f2135D = new C0332s(yVar, yVar.f2132A, yVar.f2133B, yVar.f2142w, yVar.f2134C, yVar.f2139n, yVar.f2141v);
            yVar.f2135D.t();
            yVar.f2140u.signalAll();
        } finally {
            yVar.f2139n.unlock();
        }
    }

    @Override // i6.k
    public k f() {
        List list = Collections.EMPTY_LIST;
        try {
            Objects.requireNonNull(list, "bucketBoundaries must not be null");
            AbstractC4482d.a(list);
            ((e8.k) ((m) this.f38233u).f5725h).f37422a = Collections.unmodifiableList(new ArrayList(list));
            return this;
        } catch (IllegalArgumentException | NullPointerException e6) {
            p.f5734w.warning("Error setting explicit bucket boundaries advice: " + e6.getMessage());
            return this;
        }
    }

    @Override // e.InterfaceC4463b
    public void g(Object obj) {
        C4462a c4462a = (C4462a) obj;
        N n9 = (N) this.f38233u;
        K k6 = (K) n9.f4952C.pollFirst();
        if (k6 == null) {
            Log.w("FragmentManager", "No IntentSenders were started for " + this);
            return;
        }
        i iVar = n9.f4964c;
        String str = k6.f4946n;
        AbstractComponentCallbacksC0485s g9 = iVar.g(str);
        if (g9 != null) {
            g9.m(k6.f4947u, c4462a.f37209n, c4462a.f37210u);
        } else {
            Log.w("FragmentManager", "Intent Sender result delivered for unknown Fragment " + str);
        }
    }

    @Override // p7.InterfaceC4864a
    public Object get() {
        return new j((Context) ((C4523c) this.f38233u).f37856u, "com.google.android.datatransport.events", Integer.valueOf(j.f37880w).intValue());
    }

    @Override // I0.o
    public ProfileStoreBoundaryInterface getProfileStore() {
        return (ProfileStoreBoundaryInterface) w8.a.b(ProfileStoreBoundaryInterface.class, ((WebViewProviderFactoryBoundaryInterface) this.f38233u).getProfileStore());
    }

    @Override // I0.o
    public StaticsBoundaryInterface getStatics() {
        return (StaticsBoundaryInterface) w8.a.b(StaticsBoundaryInterface.class, ((WebViewProviderFactoryBoundaryInterface) this.f38233u).getStatics());
    }

    @Override // s1.f
    public void h(byte[] bArr, Object obj, MessageDigest messageDigest) {
        Long l9 = (Long) obj;
        messageDigest.update(bArr);
        synchronized (((ByteBuffer) this.f38233u)) {
            ((ByteBuffer) this.f38233u).position(0);
            messageDigest.update(((ByteBuffer) this.f38233u).putLong(l9.longValue()).array());
        }
    }

    @Override // N2.H
    public void i(L2.b bVar) {
        C0324j c0324j = (C0324j) this.f38233u;
        ReentrantLock reentrantLock = (ReentrantLock) c0324j.f2064C;
        ReentrantLock reentrantLock2 = (ReentrantLock) c0324j.f2064C;
        reentrantLock.lock();
        try {
            c0324j.f2062A = bVar;
            C0324j.h(c0324j);
        } finally {
            reentrantLock2.unlock();
        }
    }

    @Override // l.InterfaceC4682j
    public void j(l lVar) {
        C4541H c4541h = (C4541H) this.f38233u;
        boolean p6 = c4541h.f38031a.f39353a.p();
        x xVar = c4541h.f38032b;
        if (p6) {
            xVar.onPanelClosed(108, lVar);
        } else if (xVar.onPreparePanel(0, null, lVar)) {
            xVar.onMenuOpened(108, lVar);
        }
    }

    @Override // h.InterfaceC4543b
    public Context k() {
        return ((LayoutInflaterFactory2C4535B) this.f38233u).z();
    }

    @Override // com.google.android.gms.internal.ads.LD
    /* renamed from: l */
    public void mo7l(Object obj) {
        C2609Il c2609Il = (C2609Il) this.f38233u;
        u uVar = (u) obj;
        synchronized (c2609Il) {
            c2609Il.u1(new Rx(21, uVar));
        }
    }

    @Override // N2.H
    public void m(int i) {
        L2.b bVar;
        C0324j c0324j = (C0324j) this.f38233u;
        ReentrantLock reentrantLock = (ReentrantLock) c0324j.f2064C;
        ReentrantLock reentrantLock2 = (ReentrantLock) c0324j.f2064C;
        reentrantLock.lock();
        try {
            if (!c0324j.f2065n && (bVar = (L2.b) c0324j.f2063B) != null && bVar.b()) {
                c0324j.f2065n = true;
                ((y) c0324j.f2069x).onConnectionSuspended(i);
                return;
            }
            c0324j.f2065n = false;
            C0324j.g(c0324j, i);
        } finally {
            reentrantLock2.unlock();
        }
    }

    @Override // N2.H
    public void n(Bundle bundle) {
        C0324j c0324j = (C0324j) this.f38233u;
        ReentrantLock reentrantLock = (ReentrantLock) c0324j.f2064C;
        ReentrantLock reentrantLock2 = (ReentrantLock) c0324j.f2064C;
        reentrantLock.lock();
        try {
            Bundle bundle2 = (Bundle) c0324j.f2071z;
            if (bundle2 == null) {
                c0324j.f2071z = bundle;
            } else if (bundle != null) {
                bundle2.putAll(bundle);
            }
            c0324j.f2062A = L2.b.f1710y;
            C0324j.h(c0324j);
        } finally {
            reentrantLock2.unlock();
        }
    }

    @Override // l.InterfaceC4682j
    public boolean o(l lVar, MenuItem menuItem) {
        return false;
    }

    @Override // com.facebook.ads.internal.api.AdViewParentApi
    public void onConfigurationChanged(Configuration configuration) {
        super/*android.view.View*/.onConfigurationChanged(configuration);
    }

    @Override // I0.o
    public String[] p() {
        return ((WebViewProviderFactoryBoundaryInterface) this.f38233u).getSupportedFeatures();
    }

    @Override // com.google.android.gms.internal.ads.LD
    public void q(Throwable th) {
        C2609Il c2609Il = (C2609Il) this.f38233u;
        String message = th.getMessage();
        synchronized (c2609Il) {
            c2609Il.u1(new LE(message, 6));
        }
    }

    @Override // h3.InterfaceC4567a
    public Object s(h3.n nVar) {
        S0.e eVar = (S0.e) this.f38233u;
        if (nVar.i() || nVar.f38223d) {
            return nVar;
        }
        Exception f6 = nVar.f();
        if (!(f6 instanceof M2.f)) {
            return nVar;
        }
        int i = ((M2.f) f6).f1884n.f23768n;
        return (i == 43001 || i == 43002 || i == 43003 || i == 17) ? ((Y2.e) eVar.f2892v).a() : i == 43000 ? AbstractC0415a.q(new Exception("Failed to get app set ID due to an internal error. Please try again later.")) : i != 15 ? nVar : AbstractC0415a.q(new Exception("The operation to get app set ID timed out. Please try again later."));
    }

    @Override // N2.w
    public void t() {
        y yVar = (y) this.f38233u;
        Iterator it = ((s.i) yVar.f2144y.values()).iterator();
        while (it.hasNext()) {
            ((M2.c) it.next()).h();
        }
        yVar.f2137F.f2118I = Collections.EMPTY_SET;
    }

    public String toString() {
        switch (this.f38232n) {
            case 17:
                return ((m) this.f38233u).d(getClass().getSimpleName());
            default:
                return super.toString();
        }
    }

    @Override // h.InterfaceC4543b
    public Drawable u() {
        Q0 o9 = Q0.o(((LayoutInflaterFactory2C4535B) this.f38233u).z(), null, new int[]{C5284R.attr.homeAsUpIndicator});
        Drawable g9 = o9.g(0);
        o9.q();
        return g9;
    }

    @Override // h.InterfaceC4543b
    public void v(int i) {
        LayoutInflaterFactory2C4535B layoutInflaterFactory2C4535B = (LayoutInflaterFactory2C4535B) this.f38233u;
        layoutInflaterFactory2C4535B.C();
        AbstractC4542a abstractC4542a = layoutInflaterFactory2C4535B.f37981H;
        if (abstractC4542a != null) {
            abstractC4542a.n(i);
        }
    }

    @Override // h.InterfaceC4543b
    public void w(j.a aVar, int i) {
        LayoutInflaterFactory2C4535B layoutInflaterFactory2C4535B = (LayoutInflaterFactory2C4535B) this.f38233u;
        layoutInflaterFactory2C4535B.C();
        AbstractC4542a abstractC4542a = layoutInflaterFactory2C4535B.f37981H;
        if (abstractC4542a != null) {
            abstractC4542a.o(aVar);
            abstractC4542a.n(i);
        }
    }

    @Override // N2.w
    public boolean x() {
        return true;
    }

    @Override // i6.k
    /* renamed from: z, reason: merged with bridge method [inline-methods] */
    public p build() {
        return (p) ((m) this.f38233u).b(new B1.w(27));
    }

    public c(WorkDatabase workDatabase) {
        this.f38232n = 12;
        kotlin.jvm.internal.h.e(workDatabase, "workDatabase");
        this.f38233u = workDatabase;
    }

    public c(int i) {
        this.f38232n = i;
        switch (i) {
            case 1:
                this.f38233u = ByteBuffer.allocate(8);
                break;
            case 3:
                this.f38233u = new Object();
                new Handler(Looper.getMainLooper(), new E3.e(0, this));
                break;
            case 4:
                this.f38233u = new ArrayList();
                break;
            case 6:
                break;
            case 18:
                this.f38233u = new ConcurrentHashMap(16);
                break;
            default:
                this.f38233u = new HashSet();
                break;
        }
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [e8.g] */
    public c(final int i, final int i4, final int i9, final int i10, final boolean z8, final boolean z9, final C4523c c4523c) {
        this.f38232n = 25;
        TimeUnit timeUnit = TimeUnit.MINUTES;
        final h8.e taskRunner = h8.e.f38263l;
        i8.f fVar = i8.f.f38360a;
        kotlin.jvm.internal.h.e(timeUnit, "timeUnit");
        kotlin.jvm.internal.h.e(taskRunner, "taskRunner");
        this.f38233u = new i8.s(taskRunner, timeUnit, fVar, new q() { // from class: e8.g
            @Override // E7.q
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                i8.s pool = (i8.s) obj;
                C4483a address = (C4483a) obj2;
                i8.a user = (i8.a) obj3;
                kotlin.jvm.internal.h.e(pool, "pool");
                kotlin.jvm.internal.h.e(address, "address");
                kotlin.jvm.internal.h.e(user, "user");
                h8.e eVar = h8.e.this;
                return new i8.l(new i8.m(new i8.t(eVar, pool, i, i4, i9, i10, z8, z9, address, c4523c, user)), eVar);
            }
        });
    }

    public c(t tVar, String str) {
        this.f38232n = 17;
        this.f38233u = new m(str, c7.n.f5728v, 2, tVar);
    }

    public c(EditText editText) {
        this.f38232n = 16;
        this.f38233u = new S0.e(editText);
    }

    @Override // N2.w
    public void c(Bundle bundle) {
    }

    @Override // N2.w
    public void r(int i) {
    }

    @Override // N2.w
    public void y(L2.b bVar, M2.e eVar, boolean z8) {
    }
}
