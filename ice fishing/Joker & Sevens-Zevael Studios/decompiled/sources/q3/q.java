package q3;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Handler;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class q implements h {

    /* renamed from: a, reason: collision with root package name */
    public final Context f5778a;

    /* renamed from: b, reason: collision with root package name */
    public final e3.e f5779b;

    /* renamed from: c, reason: collision with root package name */
    public final p6.i f5780c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f5781d = new Object();

    /* renamed from: e, reason: collision with root package name */
    public Handler f5782e;

    /* renamed from: f, reason: collision with root package name */
    public ThreadPoolExecutor f5783f;

    /* renamed from: g, reason: collision with root package name */
    public ThreadPoolExecutor f5784g;

    /* renamed from: h, reason: collision with root package name */
    public a.a f5785h;

    public q(Context context, e3.e eVar) {
        a.a.m(context, "Context cannot be null");
        this.f5778a = context.getApplicationContext();
        this.f5779b = eVar;
        this.f5780c = r.f5786d;
    }

    @Override // q3.h
    public final void a(a.a aVar) {
        synchronized (this.f5781d) {
            this.f5785h = aVar;
        }
        synchronized (this.f5781d) {
            try {
                if (this.f5785h == null) {
                    return;
                }
                if (this.f5783f == null) {
                    ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), new a("emojiCompat"));
                    threadPoolExecutor.allowCoreThreadTimeOut(true);
                    this.f5784g = threadPoolExecutor;
                    this.f5783f = threadPoolExecutor;
                }
                this.f5783f.execute(new a1.a(12, this));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void b() {
        synchronized (this.f5781d) {
            try {
                this.f5785h = null;
                Handler handler = this.f5782e;
                if (handler != null) {
                    handler.removeCallbacks(null);
                }
                this.f5782e = null;
                ThreadPoolExecutor threadPoolExecutor = this.f5784g;
                if (threadPoolExecutor != null) {
                    threadPoolExecutor.shutdown();
                }
                this.f5783f = null;
                this.f5784g = null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final e3.k c() {
        try {
            p6.i iVar = this.f5780c;
            Context context = this.f5778a;
            e3.e eVar = this.f5779b;
            iVar.getClass();
            Object[] objArr = {eVar};
            ArrayList arrayList = new ArrayList(1);
            Object obj = objArr[0];
            Objects.requireNonNull(obj);
            arrayList.add(obj);
            e3.j a6 = e3.d.a(context, Collections.unmodifiableList(arrayList));
            int i10 = a6.f2091b;
            if (i10 != 0) {
                throw new RuntimeException(a4.d.h("fetchFonts failed (", i10, ")"));
            }
            e3.k[] kVarArr = (e3.k[]) ((List) a6.f2092c).get(0);
            if (kVarArr == null || kVarArr.length == 0) {
                throw new RuntimeException("fetchFonts failed (empty result)");
            }
            return kVarArr[0];
        } catch (PackageManager.NameNotFoundException e10) {
            throw new RuntimeException("provider not found", e10);
        }
    }
}
