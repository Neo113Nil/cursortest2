package com.iab.omid.library.toponad.walking;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import com.iab.omid.library.toponad.internal.j;
import com.iab.omid.library.toponad.processor.a;
import com.iab.omid.library.toponad.utils.f;
import com.iab.omid.library.toponad.utils.h;
import com.iab.omid.library.toponad.walking.a;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class TreeWalker implements a.InterfaceC0170a {
    private static TreeWalker i = new TreeWalker();

    /* renamed from: j, reason: collision with root package name */
    private static Handler f36297j = new Handler(Looper.getMainLooper());

    /* renamed from: k, reason: collision with root package name */
    private static Handler f36298k = null;

    /* renamed from: l, reason: collision with root package name */
    private static final Runnable f36299l = new b();

    /* renamed from: m, reason: collision with root package name */
    private static final Runnable f36300m = new c();

    /* renamed from: b, reason: collision with root package name */
    private int f36302b;

    /* renamed from: h, reason: collision with root package name */
    private long f36308h;

    /* renamed from: a, reason: collision with root package name */
    private List<TreeWalkerTimeLogger> f36301a = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    private boolean f36303c = false;

    /* renamed from: d, reason: collision with root package name */
    private final List<com.iab.omid.library.toponad.weakreference.a> f36304d = new ArrayList();

    /* renamed from: f, reason: collision with root package name */
    private com.iab.omid.library.toponad.walking.a f36306f = new com.iab.omid.library.toponad.walking.a();

    /* renamed from: e, reason: collision with root package name */
    private com.iab.omid.library.toponad.processor.b f36305e = new com.iab.omid.library.toponad.processor.b();

    /* renamed from: g, reason: collision with root package name */
    private com.iab.omid.library.toponad.walking.b f36307g = new com.iab.omid.library.toponad.walking.b(new com.iab.omid.library.toponad.walking.async.c());

    public interface TreeWalkerNanoTimeLogger extends TreeWalkerTimeLogger {
        void onTreeProcessedNano(int i, long j6);
    }

    public interface TreeWalkerTimeLogger {
        void onTreeProcessed(int i, long j6);
    }

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            TreeWalker.this.f36307g.b();
        }
    }

    public class b implements Runnable {
        @Override // java.lang.Runnable
        public void run() {
            TreeWalker.getInstance().l();
        }
    }

    public class c implements Runnable {
        @Override // java.lang.Runnable
        public void run() {
            if (TreeWalker.f36298k != null) {
                TreeWalker.f36298k.post(TreeWalker.f36299l);
                TreeWalker.f36298k.postDelayed(TreeWalker.f36300m, 200L);
            }
        }
    }

    private void d() {
        a(f.b() - this.f36308h);
    }

    private void e() {
        this.f36302b = 0;
        this.f36304d.clear();
        this.f36303c = false;
        Iterator<com.iab.omid.library.toponad.adsession.a> it = com.iab.omid.library.toponad.internal.c.c().a().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            } else if (it.next().e()) {
                this.f36303c = true;
                break;
            }
        }
        this.f36308h = f.b();
    }

    public static TreeWalker getInstance() {
        return i;
    }

    private void i() {
        if (f36298k == null) {
            Handler handler = new Handler(Looper.getMainLooper());
            f36298k = handler;
            handler.post(f36299l);
            f36298k.postDelayed(f36300m, 200L);
        }
    }

    private void k() {
        Handler handler = f36298k;
        if (handler != null) {
            handler.removeCallbacks(f36300m);
            f36298k = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void l() {
        e();
        f();
        d();
        j.b().a();
    }

    public void addTimeLogger(TreeWalkerTimeLogger treeWalkerTimeLogger) {
        if (this.f36301a.contains(treeWalkerTimeLogger)) {
            return;
        }
        this.f36301a.add(treeWalkerTimeLogger);
    }

    public void f() {
        TreeWalker treeWalker;
        this.f36306f.e();
        long b9 = f.b();
        com.iab.omid.library.toponad.processor.a a9 = this.f36305e.a();
        if (this.f36306f.b().size() > 0) {
            Iterator<String> it = this.f36306f.b().iterator();
            while (it.hasNext()) {
                String next = it.next();
                JSONObject a10 = a9.a(null);
                a(next, this.f36306f.a(next), a10);
                com.iab.omid.library.toponad.utils.c.b(a10);
                HashSet<String> hashSet = new HashSet<>();
                hashSet.add(next);
                this.f36307g.a(a10, hashSet, b9);
            }
        }
        if (this.f36306f.c().size() > 0) {
            JSONObject a11 = a9.a(null);
            treeWalker = this;
            treeWalker.a(null, a9, a11, com.iab.omid.library.toponad.walking.c.PARENT_VIEW, false);
            com.iab.omid.library.toponad.utils.c.b(a11);
            treeWalker.f36307g.b(a11, treeWalker.f36306f.c(), b9);
            if (treeWalker.f36303c) {
                Iterator<com.iab.omid.library.toponad.adsession.a> it2 = com.iab.omid.library.toponad.internal.c.c().a().iterator();
                while (it2.hasNext()) {
                    it2.next().a(treeWalker.f36304d);
                }
            }
        } else {
            treeWalker = this;
            treeWalker.f36307g.b();
        }
        treeWalker.f36306f.a();
    }

    public void g() {
        k();
    }

    public void h() {
        i();
    }

    public void j() {
        g();
        this.f36301a.clear();
        f36297j.post(new a());
    }

    public void removeTimeLogger(TreeWalkerTimeLogger treeWalkerTimeLogger) {
        if (this.f36301a.contains(treeWalkerTimeLogger)) {
            this.f36301a.remove(treeWalkerTimeLogger);
        }
    }

    private void a(long j6) {
        if (this.f36301a.size() > 0) {
            for (TreeWalkerTimeLogger treeWalkerTimeLogger : this.f36301a) {
                treeWalkerTimeLogger.onTreeProcessed(this.f36302b, TimeUnit.NANOSECONDS.toMillis(j6));
                if (treeWalkerTimeLogger instanceof TreeWalkerNanoTimeLogger) {
                    ((TreeWalkerNanoTimeLogger) treeWalkerTimeLogger).onTreeProcessedNano(this.f36302b, j6);
                }
            }
        }
    }

    private boolean b(View view, JSONObject jSONObject) {
        String c9 = this.f36306f.c(view);
        if (c9 == null) {
            return false;
        }
        com.iab.omid.library.toponad.utils.c.a(jSONObject, c9);
        com.iab.omid.library.toponad.utils.c.a(jSONObject, Boolean.valueOf(this.f36306f.e(view)));
        com.iab.omid.library.toponad.utils.c.b(jSONObject, Boolean.valueOf(this.f36306f.c(c9)));
        this.f36306f.d();
        return true;
    }

    private void a(View view, com.iab.omid.library.toponad.processor.a aVar, JSONObject jSONObject, com.iab.omid.library.toponad.walking.c cVar, boolean z3) {
        aVar.a(view, jSONObject, this, cVar == com.iab.omid.library.toponad.walking.c.PARENT_VIEW, z3);
    }

    @Override // com.iab.omid.library.toponad.processor.a.InterfaceC0170a
    public void a(View view, com.iab.omid.library.toponad.processor.a aVar, JSONObject jSONObject, boolean z3) {
        com.iab.omid.library.toponad.walking.c d2;
        TreeWalker treeWalker;
        if (h.f(view) && (d2 = this.f36306f.d(view)) != com.iab.omid.library.toponad.walking.c.UNDERLYING_VIEW) {
            JSONObject a9 = aVar.a(view);
            com.iab.omid.library.toponad.utils.c.a(jSONObject, a9);
            if (b(view, a9)) {
                treeWalker = this;
            } else {
                boolean z6 = z3 || a(view, a9);
                if (this.f36303c && d2 == com.iab.omid.library.toponad.walking.c.OBSTRUCTION_VIEW && !z6) {
                    this.f36304d.add(new com.iab.omid.library.toponad.weakreference.a(view));
                }
                treeWalker = this;
                treeWalker.a(view, aVar, a9, d2, z6);
            }
            treeWalker.f36302b++;
        }
    }

    private void a(String str, View view, JSONObject jSONObject) {
        com.iab.omid.library.toponad.processor.a b9 = this.f36305e.b();
        String b10 = this.f36306f.b(str);
        if (b10 != null) {
            JSONObject a9 = b9.a(view);
            com.iab.omid.library.toponad.utils.c.a(a9, str);
            com.iab.omid.library.toponad.utils.c.b(a9, b10);
            com.iab.omid.library.toponad.utils.c.a(jSONObject, a9);
        }
    }

    private boolean a(View view, JSONObject jSONObject) {
        a.C0172a b9 = this.f36306f.b(view);
        if (b9 == null) {
            return false;
        }
        com.iab.omid.library.toponad.utils.c.a(jSONObject, b9);
        return true;
    }
}
