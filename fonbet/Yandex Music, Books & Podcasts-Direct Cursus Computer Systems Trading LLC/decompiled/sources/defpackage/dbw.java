package defpackage;

import android.content.Context;
import androidx.media3.exoplayer.trackselection.a;
import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import okhttp3.OkHttpClient;
import ru.yandex.video.m3.player.PlaybackException;
import ru.yandex.video.m3.player.d;
import ru.yandex.video.m3.player.impl.tracking.device.DeviceType;

/* loaded from: classes6.dex */
public final class dbw implements rgl {
    public final int a;
    public final int b;
    public final int c;
    public final xzt d;
    public final qdc e;
    public int h;
    public ecg i;
    public final ArrayList f = new ArrayList();
    public final zx0 g = new zx0();
    public final AtomicInteger j = new AtomicInteger(0);

    public dbw(int i, int i2, int i3, xzt xztVar, qdc qdcVar) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = xztVar;
        this.e = qdcVar;
        this.h = i;
    }

    @Override // defpackage.rgl
    public final void P(PlaybackException playbackException) {
        if (playbackException instanceof PlaybackException.ErrorInstantiatingDecoder) {
            this.j.incrementAndGet();
        }
    }

    public final paw b() {
        zx0 zx0Var = this.g;
        int i = zx0Var.c;
        qdc qdcVar = this.e;
        ArrayList arrayList = this.f;
        if (i > 0) {
            qdcVar.H("YP:Pool", "acquire", "availableSize > 0 will be returned idle player. It will be " + (zx0Var.c + arrayList.size()) + " player", new Object[0]);
            paw pawVar = (paw) zx0Var.removeFirst();
            arrayList.add(pawVar);
            return pawVar;
        }
        int size = zx0Var.c + arrayList.size();
        int i2 = this.h;
        if (size >= i2) {
            int i3 = this.b;
            if (i2 >= i3 || this.j.get() >= this.c) {
                qdcVar.H("YP:Pool", "acquire", "failed availableSize=" + zx0Var.c + ", inUseSize=" + arrayList.size(), new Object[0]);
                return null;
            }
            this.h++;
            qdcVar.H("YP:Pool", "increasePoolSize", "poolSize=" + this.h + "; maxPoolSize=" + i3, new Object[0]);
        }
        qdcVar.H("YP:Pool", "acquire", "There ara no available idle player, but acquired = " + (zx0Var.c + arrayList.size()) + " < " + this.h, new Object[0]);
        return c();
    }

    public final paw c() {
        ecg ecgVar = this.i;
        final xzt xztVar = this.d;
        qdc qdcVar = (qdc) xztVar.l;
        y7g.Y(false, qdcVar);
        final ThreadFactory defaultThreadFactory = Executors.defaultThreadFactory();
        ScheduledExecutorService newSingleThreadScheduledExecutor = Executors.newSingleThreadScheduledExecutor(new ThreadFactory() { // from class: uaw
            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(Runnable runnable) {
                Thread newThread = defaultThreadFactory.newThread(runnable);
                StringBuilder sb = new StringBuilder("YP:SStrmManager[");
                xzt xztVar2 = xztVar;
                int i = xztVar2.a;
                xztVar2.a = i + 1;
                sb.append(i);
                sb.append(']');
                newThread.setName(sb.toString());
                return newThread;
            }
        });
        d dVar = new d();
        o46 o46Var = (o46) xztVar.b;
        Context context = o46Var.a;
        context.getClass();
        dVar.a = context;
        OkHttpClient okHttpClient = (OkHttpClient) xztVar.i;
        anm anmVar = (anm) xztVar.c;
        ssm ssmVar = (ssm) xztVar.d;
        rp7 rp7Var = (rp7) xztVar.e;
        keg kegVar = (keg) xztVar.j;
        s1 s1Var = (s1) xztVar.k;
        boolean c = s1Var.c();
        context.getClass();
        okHttpClient.getClass();
        so7 P = wdp.P(new ti0(c, qdcVar, anmVar, okHttpClient));
        az6 az6Var = new az6(11, kegVar);
        Context applicationContext = context.getApplicationContext();
        applicationContext.getClass();
        dVar.c = zsd.s(context, new a03(okHttpClient, P, Executors.newSingleThreadScheduledExecutor(new lp7(0, Executors.defaultThreadFactory())), new t6s(context, rp7Var, new a(new us7()), new b2c(), new r6s(0, false)), new iwe(7, applicationContext, (keg) az6Var.s), ox6.n(new az6(10, ssmVar)), 2));
        kau kauVar = (kau) xztVar.h;
        g8c g8cVar = new g8c(new l48(21));
        o6c o6cVar = new o6c(20);
        Object obj = (ngl) new c5p(11).b;
        if (obj == null) {
            obj = new ksa();
        }
        dVar.b = new tao(context, kauVar, g8cVar, o6cVar, obj);
        String str = s1Var.f() ? "Cache,NoInternetConnection,QueueSecureInputBuffer,DequeueInputBuffer,DequeueOutputBuffer,FailedReleaseOutputBuffer,InstantiatingDecoder,PreferH264HandlingRule" : "Cache,NoInternetConnection,QueueSecureInputBuffer,DequeueInputBuffer,DequeueOutputBuffer,FailedReleaseOutputBuffer,InstantiatingDecoder";
        Context context2 = o46Var.a;
        OkHttpClient okHttpClient2 = (OkHttpClient) xztVar.i;
        ExecutorService executorService = (ExecutorService) xztVar.m;
        newSingleThreadScheduledExecutor.getClass();
        dVar.f = fgq.k(context2, okHttpClient2, executorService, newSingleThreadScheduledExecutor, ogp.d(new wul(), new t08(tt0.i(DeviceType.OTHER, o46Var.c))), o46Var.d, new u8b(22, xztVar));
        dVar.d = true;
        dVar.e = true;
        dVar.i = (c5p) xztVar.f;
        dVar.h = str;
        dVar.j = (c5p) xztVar.g;
        dVar.l = true;
        paw a = dVar.a(o46Var.b);
        a.J();
        if (ecgVar != null) {
            a.w(new vaw(new vg7(a.l(), ecgVar)));
        }
        a.I(this);
        this.f.add(a);
        return a;
    }

    public final synchronized void d(paw pawVar) {
        try {
            zx0 zx0Var = this.g;
            int i = this.h;
            int i2 = this.a;
            if (i > i2) {
                int size = this.f.size();
                int i3 = zx0Var.c;
                if (size + i3 > i2 && i3 > 0) {
                    paw pawVar2 = (paw) zx0Var.removeFirst();
                    pawVar2.F(this);
                    pawVar2.a();
                    this.h--;
                }
            }
            int size2 = this.f.size() + this.g.c;
            int i4 = this.h;
            qdc qdcVar = this.e;
            if (size2 > i4) {
                qdcVar.H("YP:Pool", "release", "To much players. It is " + (this.f.size() + this.g.c + 1) + " player. Release player", new Object[0]);
                this.f.remove(pawVar);
                pawVar.F(this);
                pawVar.a();
            } else {
                qdcVar.H("YP:Pool", "release", "Return player to pool; inUseSize=" + this.f.size() + " availableSize=" + this.g.c, new Object[0]);
                this.f.remove(pawVar);
                this.g.addLast(pawVar);
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
