package defpackage;

import android.os.Handler;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.text.Regex;
import ru.yandex.video.m3.data.dto.VideoData;
import ru.yandex.video.m3.preload_manager.d;
import ru.yandex.video.m3.preload_manager.f;
import ru.yandex.video.m3.preload_manager.g;
import ru.yandex.video.m3.preload_manager.k;

/* loaded from: classes6.dex */
public final class inm implements hnm {
    public static final Set p = xz0.Y(new String[]{"mpd", "mp4", "webm", "mkv"});
    public final ExecutorService a;
    public final Handler b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final f4m f;
    public final jzi g;
    public final str h;
    public final AtomicReference i;
    public final pnm j;
    public final yjj k;
    public final chs l;
    public final d m;
    public final wnm n;
    public final Regex o;

    public inm(ExecutorService executorService, int i, ExecutorService executorService2, xiu xiuVar, liq liqVar, ip3 ip3Var, yk2 yk2Var, rsb rsbVar, Function1 function1, List list, long j, t8w t8wVar, Handler handler, boolean z, boolean z2, boolean z3, f4m f4mVar, jzi jziVar, str strVar) {
        new jml(new ujl());
        xiuVar.getClass();
        list.getClass();
        t8wVar.getClass();
        this.a = executorService2;
        this.b = handler;
        this.c = z;
        this.d = z2;
        this.e = z3;
        this.f = f4mVar;
        this.g = jziVar;
        this.h = strVar;
        this.i = new AtomicReference();
        pnm pnmVar = new pnm(handler);
        this.j = pnmVar;
        yjj yjjVar = new yjj();
        this.k = yjjVar;
        this.l = new chs();
        d dVar = new d(yjjVar, list);
        this.m = dVar;
        this.n = new wnm(i, new tnm(xiuVar, executorService, handler, new k(liqVar, yk2Var, xiuVar, new tao(function1, rsbVar, yk2Var, ip3Var, new kgk(6, this)), t8wVar, handler), j, liqVar, t8wVar), handler, pnmVar, dVar);
        this.o = new Regex("[0-9a-z]{44}x[A-Z]{3}x\\d{4}x\\d{10}");
    }

    public final void a(Function0 function0) {
        if (this.i.get() != null) {
            l1j.f();
        } else {
            dvt.c0(this.b, new u6h(1, function0));
        }
    }

    @Override // defpackage.hnm
    public final void c(VideoData videoData) {
        videoData.getClass();
        chs chsVar = this.l;
        chsVar.getClass();
        chsVar.a("PreloadManagerImpl", "cancelPreload", "called with: videoData = " + videoData, new Object[0]);
        a(new g(videoData, this));
    }

    @Override // defpackage.hnm
    public final aom d() {
        return new com(this, this.b);
    }

    @Override // defpackage.hnm
    public final void e(xbu xbuVar) {
        this.k.a(xbuVar);
    }

    @Override // defpackage.hnm
    public final void shutdown() {
        this.n.g = true;
        chs chsVar = this.l;
        chsVar.getClass();
        chsVar.a("PreloadManagerImpl", "cancelAllPreloads", null, new Object[0]);
        a(new f(this));
        ExecutorService executorService = this.a;
        if (executorService != null) {
            executorService.shutdownNow();
        }
    }
}
