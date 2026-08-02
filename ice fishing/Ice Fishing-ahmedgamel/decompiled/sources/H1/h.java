package H1;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import com.bumptech.glide.n;
import com.bumptech.glide.p;
import java.util.ArrayList;
import t1.C5031a;
import u1.l;
import x1.InterfaceC5183a;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final t1.d f1216a;

    /* renamed from: b, reason: collision with root package name */
    public final Handler f1217b;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f1218c;

    /* renamed from: d, reason: collision with root package name */
    public final p f1219d;

    /* renamed from: e, reason: collision with root package name */
    public final InterfaceC5183a f1220e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f1221f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f1222g;

    /* renamed from: h, reason: collision with root package name */
    public n f1223h;
    public e i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f1224j;

    /* renamed from: k, reason: collision with root package name */
    public e f1225k;

    /* renamed from: l, reason: collision with root package name */
    public Bitmap f1226l;

    /* renamed from: m, reason: collision with root package name */
    public e f1227m;

    /* renamed from: n, reason: collision with root package name */
    public int f1228n;

    /* renamed from: o, reason: collision with root package name */
    public int f1229o;

    /* renamed from: p, reason: collision with root package name */
    public int f1230p;

    public h(com.bumptech.glide.c cVar, t1.d dVar, int i, int i4, Bitmap bitmap) {
        C1.e eVar = C1.e.f317b;
        InterfaceC5183a interfaceC5183a = cVar.f24159n;
        com.bumptech.glide.i iVar = cVar.f24161v;
        p c9 = com.bumptech.glide.c.c(iVar.getBaseContext());
        p c10 = com.bumptech.glide.c.c(iVar.getBaseContext());
        c10.getClass();
        n a9 = new n(c10.f24276n, c10, Bitmap.class, c10.f24277u).a(p.f24272D).a(((L1.e) ((L1.e) ((L1.e) new L1.e().j(w1.j.f41496b)).y()).u()).n(i, i4));
        this.f1218c = new ArrayList();
        this.f1219d = c9;
        Handler handler = new Handler(Looper.getMainLooper(), new g(0, this));
        this.f1220e = interfaceC5183a;
        this.f1217b = handler;
        this.f1223h = a9;
        this.f1216a = dVar;
        c(eVar, bitmap);
    }

    public final void a() {
        int i;
        if (!this.f1221f || this.f1222g) {
            return;
        }
        e eVar = this.f1227m;
        if (eVar != null) {
            this.f1227m = null;
            b(eVar);
            return;
        }
        this.f1222g = true;
        t1.d dVar = this.f1216a;
        int i4 = dVar.f40871l.f40849c;
        long uptimeMillis = SystemClock.uptimeMillis() + ((i4 <= 0 || (i = dVar.f40870k) < 0) ? 0 : (i < 0 || i >= i4) ? -1 : ((C5031a) r2.f40851e.get(i)).i);
        int i6 = (dVar.f40870k + 1) % dVar.f40871l.f40849c;
        dVar.f40870k = i6;
        this.f1225k = new e(this.f1217b, i6, uptimeMillis);
        n F8 = this.f1223h.a((L1.e) new L1.e().t(new O1.d(Double.valueOf(Math.random())))).F(dVar);
        F8.D(this.f1225k, F8);
    }

    public final void b(e eVar) {
        this.f1222g = false;
        boolean z6 = this.f1224j;
        Handler handler = this.f1217b;
        if (z6) {
            handler.obtainMessage(2, eVar).sendToTarget();
            return;
        }
        if (!this.f1221f) {
            this.f1227m = eVar;
            return;
        }
        if (eVar.f1213z != null) {
            Bitmap bitmap = this.f1226l;
            if (bitmap != null) {
                this.f1220e.b(bitmap);
                this.f1226l = null;
            }
            e eVar2 = this.i;
            this.i = eVar;
            ArrayList arrayList = this.f1218c;
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                c cVar = (c) ((f) arrayList.get(size));
                Object callback = cVar.getCallback();
                while (callback instanceof Drawable) {
                    callback = ((Drawable) callback).getCallback();
                }
                if (callback == null) {
                    cVar.stop();
                    cVar.invalidateSelf();
                } else {
                    cVar.invalidateSelf();
                    e eVar3 = ((h) cVar.f1199n.f644b).i;
                    if ((eVar3 != null ? eVar3.f1211x : -1) == r5.f1216a.f40871l.f40849c - 1) {
                        cVar.f1204y++;
                    }
                    int i = cVar.f1205z;
                    if (i != -1 && cVar.f1204y >= i) {
                        cVar.stop();
                    }
                }
            }
            if (eVar2 != null) {
                handler.obtainMessage(2, eVar2).sendToTarget();
            }
        }
        a();
    }

    public final void c(l lVar, Bitmap bitmap) {
        P1.g.c(lVar, "Argument must not be null");
        P1.g.c(bitmap, "Argument must not be null");
        this.f1226l = bitmap;
        this.f1223h = this.f1223h.a(new L1.e().x(lVar, true));
        this.f1228n = P1.p.c(bitmap);
        this.f1229o = bitmap.getWidth();
        this.f1230p = bitmap.getHeight();
    }
}
