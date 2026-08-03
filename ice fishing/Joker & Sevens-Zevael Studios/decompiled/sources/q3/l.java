package q3;

import android.content.Context;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class l implements h {

    /* renamed from: a, reason: collision with root package name */
    public Context f5771a;

    public /* synthetic */ l(Context context, boolean z10) {
        this.f5771a = context;
    }

    @Override // q3.h
    public void a(a.a aVar) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), new a("EmojiCompatInitializer"));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        threadPoolExecutor.execute(new b6.a(this, aVar, threadPoolExecutor, 4));
    }

    public w5.j b() {
        Context context = this.f5771a;
        if (context == null) {
            throw new IllegalStateException(Context.class.getCanonicalName() + " must be set");
        }
        w5.j jVar = new w5.j();
        jVar.f7690g = y5.a.a(w5.l.f7698a);
        x5.d dVar = new x5.d(1, context);
        jVar.f7691h = dVar;
        jVar.f7692i = y5.a.a(new d6.k(dVar, new x5.d(0, dVar), 1));
        x5.d dVar2 = jVar.f7691h;
        jVar.f7693j = new d6.e(dVar2, 1);
        zb.a a6 = y5.a.a(new d6.k(jVar.f7693j, y5.a.a(new d6.e(dVar2, 0)), 0));
        jVar.f7694k = a6;
        b6.f fVar = new b6.f(0);
        x5.d dVar3 = jVar.f7691h;
        b6.g gVar = new b6.g(dVar3, a6, fVar, 0);
        zb.a aVar = jVar.f7690g;
        zb.a aVar2 = jVar.f7692i;
        jVar.f7695l = y5.a.a(new b6.g(new b6.d(aVar, aVar2, gVar, a6, a6), new c6.m(dVar3, aVar2, a6, gVar, aVar, a6, a6), new c6.n(aVar, a6, gVar, a6), 1));
        return jVar;
    }
}
