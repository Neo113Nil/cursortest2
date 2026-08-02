package defpackage;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.view.WindowManager;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import okhttp3.OkHttpClient;
import ru.yandex.video.m3.player.b;
import ru.yandex.video.m3.player.d;

/* loaded from: classes4.dex */
public final class fbw {
    public final Context a;
    public final so7 b;
    public final tao c;
    public final tao d;
    public final zr7 e;

    public fbw(Context context, tbu tbuVar, z66 z66Var, frt frtVar, fos fosVar, ksb ksbVar, xau xauVar) {
        this.a = context;
        jyr b = l18.b.b(hag.I(v3i.class), true);
        jwl jwlVar = new jwl(8);
        n4f n4fVar = new n4f();
        apo apoVar = new apo(18, frtVar, fosVar);
        tka tkaVar = tbuVar.a;
        this.b = wdp.P(new itv(14, new bjt(context, (OkHttpClient) tkaVar.invoke(), z66Var, (so3) ksbVar.b.getValue()), jwlVar));
        g8c g8cVar = new g8c(new l48(21));
        String str = "ya-music";
        i1u i1uVar = new i1u(cb0.r((OkHttpClient) tkaVar.invoke(), n4fVar, apoVar, new wpt(dvt.O(context), str, str)), b(context));
        kl7 kl7Var = new kl7(((v3i) b.getValue()).a());
        c5p c5pVar = new c5p(11);
        c5pVar.b = jwlVar;
        Object obj = (ngl) c5pVar.b;
        this.c = new tao(context, i1uVar, g8cVar, kl7Var, obj == null ? new ksa() : obj);
        String str2 = null;
        i1u i1uVar2 = new i1u(cb0.r((OkHttpClient) tkaVar.invoke(), n4fVar, apoVar, new wpt(dvt.O(context), str2, str2)), b(context));
        kl7 kl7Var2 = new kl7(((v3i) b.getValue()).a());
        c5p c5pVar2 = new c5p(11);
        c5pVar2.b = jwlVar;
        Object obj2 = (ngl) c5pVar2.b;
        this.d = new tao(context, i1uVar2, g8cVar, kl7Var2, obj2 == null ? new ksa() : obj2);
        OkHttpClient okHttpClient = (OkHttpClient) tkaVar.invoke();
        ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor();
        newSingleThreadExecutor.getClass();
        ScheduledExecutorService newSingleThreadScheduledExecutor = Executors.newSingleThreadScheduledExecutor();
        newSingleThreadScheduledExecutor.getClass();
        cr d = ogp.d(apoVar, new s4b());
        c5b c5bVar = c5b.a;
        c5bVar.getClass();
        this.e = new zr7(context, okHttpClient, newSingleThreadExecutor, newSingleThreadScheduledExecutor, d, c5bVar, null, null, new imp(), new g06(str2, new ksa(), str2, "AndroidPlayer"));
    }

    public static gbw a(fbw fbwVar) {
        d9w d9wVar = new d9w(8);
        Context context = fbwVar.a;
        b s = zsd.s(context, new ebw(fbwVar, d9wVar, 1));
        d dVar = new d();
        dVar.a = context;
        dVar.c = s;
        tao taoVar = fbwVar.d;
        taoVar.getClass();
        dVar.b = taoVar;
        zr7 zr7Var = fbwVar.e;
        zr7Var.getClass();
        dVar.f = zr7Var;
        dVar.d = true;
        return new gbw(dVar.a(null));
    }

    public static Point b(Context context) {
        WindowManager j = l1b.j(context);
        if (Build.VERSION.SDK_INT >= 30) {
            Rect bounds = j.getMaximumWindowMetrics().getBounds();
            bounds.getClass();
            return new Point(bounds.width(), bounds.height());
        }
        Point point = new Point();
        j.getDefaultDisplay().getRealSize(point);
        return point;
    }
}
