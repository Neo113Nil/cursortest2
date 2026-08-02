package defpackage;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import kotlin.jvm.internal.Intrinsics;
import ru.yandex.video.m3.preload_manager.d;
import ru.yandex.video.m3.preload_manager.k;
import ru.yandex.video.m3.preload_manager.l;
import timber.log.Timber;

/* loaded from: classes6.dex */
public final class wnm {
    public final tnm a;
    public final Handler b;
    public final pnm c;
    public final d d;
    public final l[] e;
    public boolean f;
    public volatile boolean g;

    public wnm(int i, tnm tnmVar, Handler handler, pnm pnmVar, d dVar) {
        this.a = tnmVar;
        this.b = handler;
        this.c = pnmVar;
        this.d = dVar;
        this.e = new l[i];
        pnmVar.b = new kgk(7, this);
    }

    public final void a() {
        Intrinsics.d(this.b.getLooper(), Looper.myLooper());
        l[] lVarArr = this.e;
        int length = lVarArr.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            l lVar = lVarArr[i];
            int i3 = i2 + 1;
            Timber.Companion companion = Timber.INSTANCE;
            StringBuilder sb = new StringBuilder("cancelAllRequest(), request = ");
            sb.append(lVar != null ? lVar.b() : null);
            companion.d(sb.toString(), new Object[0]);
            if (lVar != null) {
                lVar.a();
            }
            lVarArr[i2] = null;
            i++;
            i2 = i3;
        }
        d();
    }

    public final void b(nnm nnmVar) {
        Intrinsics.d(this.b.getLooper(), Looper.myLooper());
        l[] lVarArr = this.e;
        int length = lVarArr.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                i = -1;
                break;
            }
            l lVar = lVarArr[i];
            if (Intrinsics.d(lVar != null ? lVar.b() : null, nnmVar)) {
                break;
            } else {
                i++;
            }
        }
        if (i >= 0) {
            Timber.INSTANCE.d("cancelRequest(), request = " + nnmVar, new Object[0]);
            l lVar2 = lVarArr[i];
            lVar2.getClass();
            lVar2.a();
            lVarArr[i] = null;
            d();
        }
    }

    public final nnm c(String str) {
        l lVar;
        Intrinsics.d(this.b.getLooper(), Looper.myLooper());
        l[] lVarArr = this.e;
        int length = lVarArr.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                lVar = null;
                break;
            }
            lVar = lVarArr[i];
            if (Intrinsics.d(lVar != null ? lVar.b().l : null, str)) {
                break;
            }
            i++;
        }
        if (lVar != null) {
            return lVar.b();
        }
        return null;
    }

    public final void d() {
        int i;
        while (true) {
            Intrinsics.d(this.b.getLooper(), Looper.myLooper());
            if (this.g) {
                Timber.INSTANCE.d("schedule(), skip due to shutdown", new Object[0]);
                return;
            }
            if (this.f) {
                Timber.INSTANCE.d("schedule(), skip due to batch mode", new Object[0]);
                return;
            }
            pnm pnmVar = this.c;
            Intrinsics.d(pnmVar.a.getLooper(), Looper.myLooper());
            onm onmVar = (onm) pnmVar.d.peek();
            nnm nnmVar = onmVar != null ? onmVar.b : null;
            if (nnmVar == null) {
                Timber.INSTANCE.d("schedule(), requests queue is empty", new Object[0]);
                return;
            }
            l[] lVarArr = this.e;
            int length = lVarArr.length;
            int i2 = 0;
            while (true) {
                i = -1;
                if (i2 >= length) {
                    i2 = -1;
                    break;
                } else if (lVarArr[i2] == null) {
                    break;
                } else {
                    i2++;
                }
            }
            if (i2 >= 0) {
                this.c.c();
                e(i2, nnmVar);
            } else {
                jnm jnmVar = xee.i;
                l[] lVarArr2 = this.e;
                int length2 = lVarArr2.length;
                for (int i3 = 0; i3 < length2; i3++) {
                    l lVar = lVarArr2[i3];
                    if (lVar != null) {
                        jnm jnmVar2 = lVar.b().c;
                        jnmVar2.getClass();
                        jnmVar.getClass();
                        if (jnmVar2.a - jnmVar.a < 0) {
                            jnmVar = lVar.b().c;
                            i = i3;
                        }
                    }
                }
                if (i < 0) {
                    return;
                }
                l lVar2 = this.e[i];
                lVar2.getClass();
                jnm jnmVar3 = lVar2.b().c;
                jnm jnmVar4 = nnmVar.c;
                jnmVar3.getClass();
                jnmVar4.getClass();
                if (jnmVar3.a - jnmVar4.a >= 0) {
                    return;
                }
                Timber.INSTANCE.d("schedule(), replace lower priority request = " + lVar2.b(), new Object[0]);
                this.c.c();
                lVar2.j = false;
                lVar2.a();
                this.c.a(lVar2.b(), true);
                e(i, nnmVar);
            }
        }
    }

    public final void e(int i, nnm nnmVar) {
        Timber.INSTANCE.d("scheduleWithIndex(), index = " + i + ", request = " + nnmVar, new Object[0]);
        l[] lVarArr = this.e;
        tnm tnmVar = this.a;
        vnm vnmVar = new vnm(nnmVar, this);
        xiu xiuVar = (xiu) tnmVar.b;
        ExecutorService executorService = (ExecutorService) tnmVar.c;
        Handler handler = (Handler) tnmVar.d;
        l lVar = new l(xiuVar, executorService, handler, (k) tnmVar.e, tnmVar.a, (liq) tnmVar.f, (vp3) tnmVar.g);
        Intrinsics.d(Looper.myLooper(), handler.getLooper());
        lVar.f = nnmVar;
        lVar.g = vnmVar;
        Future<?> submit = executorService.submit(new dyg(20, lVar));
        submit.getClass();
        lVar.h = submit;
        lVarArr[i] = lVar;
    }

    public final void f(jnm jnmVar, nnm nnmVar) {
        jnmVar.getClass();
        Intrinsics.d(this.b.getLooper(), Looper.myLooper());
        l[] lVarArr = this.e;
        int length = lVarArr.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                i = -1;
                break;
            }
            l lVar = lVarArr[i];
            if (Intrinsics.d(lVar != null ? lVar.b() : null, nnmVar)) {
                break;
            } else {
                i++;
            }
        }
        if (i >= 0) {
            Timber.INSTANCE.d("setPriority(), request = " + nnmVar + ", new priority = " + jnmVar + ", worker index = " + i, new Object[0]);
            l lVar2 = this.e[i];
            lVar2.getClass();
            Intrinsics.d(Looper.myLooper(), lVar2.c.getLooper());
            lVar2.f = nnm.a(jnmVar, lVar2.b());
            d();
        }
    }
}
