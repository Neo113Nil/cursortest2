package V;

import a.AbstractC0078a;
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

/* loaded from: classes.dex */
public final class r implements i {

    /* renamed from: a, reason: collision with root package name */
    public final Context f1234a;

    /* renamed from: b, reason: collision with root package name */
    public final L.e f1235b;

    /* renamed from: c, reason: collision with root package name */
    public final S0.e f1236c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f1237d;
    public Handler e;

    /* renamed from: f, reason: collision with root package name */
    public ThreadPoolExecutor f1238f;

    /* renamed from: g, reason: collision with root package name */
    public ThreadPoolExecutor f1239g;

    /* renamed from: h, reason: collision with root package name */
    public R.j f1240h;

    public r(Context context, L.e eVar) {
        S0.e eVar2 = s.f1241d;
        this.f1237d = new Object();
        AbstractC0078a.g(context, "Context cannot be null");
        this.f1234a = context.getApplicationContext();
        this.f1235b = eVar;
        this.f1236c = eVar2;
    }

    public final void a() {
        synchronized (this.f1237d) {
            try {
                this.f1240h = null;
                Handler handler = this.e;
                if (handler != null) {
                    handler.removeCallbacks(null);
                }
                this.e = null;
                ThreadPoolExecutor threadPoolExecutor = this.f1239g;
                if (threadPoolExecutor != null) {
                    threadPoolExecutor.shutdown();
                }
                this.f1238f = null;
                this.f1239g = null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final L.j b() {
        try {
            S0.e eVar = this.f1236c;
            Context context = this.f1234a;
            L.e eVar2 = this.f1235b;
            eVar.getClass();
            Object[] objArr = {eVar2};
            ArrayList arrayList = new ArrayList(1);
            Object obj = objArr[0];
            Objects.requireNonNull(obj);
            arrayList.add(obj);
            B0.g a2 = L.d.a(context, Collections.unmodifiableList(arrayList));
            int i = a2.f46a;
            if (i != 0) {
                throw new RuntimeException("fetchFonts failed (" + i + ")");
            }
            L.j[] jVarArr = (L.j[]) ((List) a2.f47b).get(0);
            if (jVarArr == null || jVarArr.length == 0) {
                throw new RuntimeException("fetchFonts failed (empty result)");
            }
            return jVarArr[0];
        } catch (PackageManager.NameNotFoundException e) {
            throw new RuntimeException("provider not found", e);
        }
    }

    @Override // V.i
    public final void t(R.j jVar) {
        synchronized (this.f1237d) {
            this.f1240h = jVar;
        }
        synchronized (this.f1237d) {
            try {
                if (this.f1240h == null) {
                    return;
                }
                if (this.f1238f == null) {
                    ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), new a("emojiCompat"));
                    threadPoolExecutor.allowCoreThreadTimeOut(true);
                    this.f1239g = threadPoolExecutor;
                    this.f1238f = threadPoolExecutor;
                }
                this.f1238f.execute(new D.a(4, this));
            } finally {
            }
        }
    }
}
