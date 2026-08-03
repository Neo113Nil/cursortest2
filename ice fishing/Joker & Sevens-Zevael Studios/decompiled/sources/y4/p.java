package y4;

import android.content.Context;
import android.os.Build;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class p implements Runnable {

    /* renamed from: m, reason: collision with root package name */
    public static final String f8762m = o4.o.f("WorkForegroundRunnable");

    /* renamed from: g, reason: collision with root package name */
    public final z4.j f8763g = new z4.j();

    /* renamed from: h, reason: collision with root package name */
    public final Context f8764h;

    /* renamed from: i, reason: collision with root package name */
    public final x4.p f8765i;

    /* renamed from: j, reason: collision with root package name */
    public final o4.n f8766j;

    /* renamed from: k, reason: collision with root package name */
    public final r f8767k;

    /* renamed from: l, reason: collision with root package name */
    public final a5.a f8768l;

    public p(Context context, x4.p pVar, o4.n nVar, r rVar, a5.c cVar) {
        this.f8764h = context;
        this.f8765i = pVar;
        this.f8766j = nVar;
        this.f8767k = rVar;
        this.f8768l = cVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (!this.f8765i.f8338q || Build.VERSION.SDK_INT >= 31) {
            this.f8763g.i(null);
            return;
        }
        z4.j jVar = new z4.j();
        a5.c cVar = (a5.c) this.f8768l;
        ((a5.b) cVar.f263i).execute(new a1.d(13, this, jVar));
        jVar.a(new dd.i(23, this, jVar), (a5.b) cVar.f263i);
    }
}
