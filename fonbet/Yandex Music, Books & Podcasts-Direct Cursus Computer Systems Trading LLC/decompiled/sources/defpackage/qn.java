package defpackage;

import android.os.Handler;
import android.view.View;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes3.dex */
public final class qn implements ieu {
    public final String a;
    public final pgu b;
    public final lkk c;
    public final ieu d;
    public final feu e;
    public final AtomicInteger g;
    public final boolean i;
    public volatile int j;
    public final LinkedBlockingQueue f = new LinkedBlockingQueue();
    public final AtomicBoolean h = new AtomicBoolean(false);

    public qn(String str, pgu pguVar, lkk lkkVar, ieu ieuVar, feu feuVar, int i) {
        this.a = str;
        this.b = pguVar;
        this.c = lkkVar;
        this.d = ieuVar;
        this.e = feuVar;
        this.g = new AtomicInteger(i);
        this.i = !r1.isEmpty();
        this.j = i;
        for (int i2 = 0; i2 < i; i2++) {
            this.e.a.b.offer(new deu(this, 0));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v13, types: [ieu] */
    /* JADX WARN: Type inference failed for: r3v14, types: [ieu] */
    /* JADX WARN: Type inference failed for: r3v15, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v18 */
    /* JADX WARN: Type inference failed for: r3v19 */
    /* JADX WARN: Type inference failed for: r3v20 */
    @Override // defpackage.ieu
    public final View a() {
        long nanoTime = System.nanoTime();
        Object poll = this.f.poll();
        long nanoTime2 = System.nanoTime() - nanoTime;
        if (poll == null) {
            long nanoTime3 = System.nanoTime();
            ?? r3 = this.d;
            try {
                this.e.a(this);
                View view = (View) this.f.poll(16L, TimeUnit.MILLISECONDS);
                if (view != null) {
                    this.g.decrementAndGet();
                    r3 = view;
                } else {
                    r3 = r3.a();
                }
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
                r3 = r3.a();
            }
            long nanoTime4 = System.nanoTime() - nanoTime3;
            pgu pguVar = this.b;
            if (pguVar != null) {
                String str = this.a;
                synchronized (pguVar.a) {
                    lum lumVar = pguVar.a;
                    kum kumVar = (kum) lumVar.a;
                    kumVar.a += nanoTime4;
                    kumVar.b++;
                    xy0 xy0Var = (xy0) lumVar.c;
                    Object obj = xy0Var.get(str);
                    if (obj == null) {
                        obj = new kum();
                        xy0Var.put(str, obj);
                    }
                    kum kumVar2 = (kum) obj;
                    kumVar2.a += nanoTime4;
                    kumVar2.b++;
                    nq1 nq1Var = pguVar.b;
                    Handler handler = pguVar.c;
                    if (!nq1Var.b) {
                        handler.post(nq1Var);
                        nq1Var.b = true;
                    }
                }
            }
            lkk lkkVar = this.c;
            this.f.size();
            lkkVar.getClass();
            poll = r3;
        } else {
            this.g.decrementAndGet();
            pgu pguVar2 = this.b;
            if (pguVar2 != null) {
                synchronized (pguVar2.a) {
                    kum kumVar3 = (kum) pguVar2.a.a;
                    kumVar3.a += nanoTime2;
                    kumVar3.b++;
                    nq1 nq1Var2 = pguVar2.b;
                    Handler handler2 = pguVar2.c;
                    if (!nq1Var2.b) {
                        handler2.post(nq1Var2);
                        nq1Var2.b = true;
                    }
                }
            }
            lkk lkkVar2 = this.c;
            this.f.size();
            lkkVar2.getClass();
        }
        if (this.j > this.g.get()) {
            long nanoTime5 = System.nanoTime();
            this.e.a.b.offer(new deu(this, this.f.size()));
            this.g.incrementAndGet();
            long nanoTime6 = System.nanoTime() - nanoTime5;
            pgu pguVar3 = this.b;
            if (pguVar3 != null) {
                lum lumVar2 = pguVar3.a;
                ((kum) lumVar2.a).a += nanoTime6;
                if (nanoTime6 >= 1000000) {
                    kum kumVar4 = (kum) lumVar2.b;
                    kumVar4.a += nanoTime6;
                    kumVar4.b++;
                }
                nq1 nq1Var3 = pguVar3.b;
                Handler handler3 = pguVar3.c;
                if (!nq1Var3.b) {
                    handler3.post(nq1Var3);
                    nq1Var3.b = true;
                }
            }
        }
        return (View) poll;
    }
}
