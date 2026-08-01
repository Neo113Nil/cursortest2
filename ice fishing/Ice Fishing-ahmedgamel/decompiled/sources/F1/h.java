package F1;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import com.bumptech.glide.n;
import com.bumptech.glide.p;
import java.util.ArrayList;
import r1.C4947a;
import s1.l;
import u1.k;
import v1.InterfaceC5104a;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final r1.d f931a;

    /* renamed from: b, reason: collision with root package name */
    public final Handler f932b;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f933c;

    /* renamed from: d, reason: collision with root package name */
    public final p f934d;

    /* renamed from: e, reason: collision with root package name */
    public final InterfaceC5104a f935e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f936f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f937g;

    /* renamed from: h, reason: collision with root package name */
    public n f938h;
    public e i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f939j;

    /* renamed from: k, reason: collision with root package name */
    public e f940k;

    /* renamed from: l, reason: collision with root package name */
    public Bitmap f941l;

    /* renamed from: m, reason: collision with root package name */
    public e f942m;

    /* renamed from: n, reason: collision with root package name */
    public int f943n;

    /* renamed from: o, reason: collision with root package name */
    public int f944o;

    /* renamed from: p, reason: collision with root package name */
    public int f945p;

    public h(com.bumptech.glide.c cVar, r1.d dVar, int i, int i6, Bitmap bitmap) {
        A1.e eVar = A1.e.f18b;
        InterfaceC5104a interfaceC5104a = cVar.f23372n;
        com.bumptech.glide.i iVar = cVar.f23374v;
        p c9 = com.bumptech.glide.c.c(iVar.getBaseContext());
        p c10 = com.bumptech.glide.c.c(iVar.getBaseContext());
        c10.getClass();
        n a9 = new n(c10.f23491n, c10, Bitmap.class, c10.f23492u).a(p.f23487D).a(((J1.e) ((J1.e) ((J1.e) new J1.e().j(k.f41113b)).y()).u()).n(i, i6));
        this.f933c = new ArrayList();
        this.f934d = c9;
        Handler handler = new Handler(Looper.getMainLooper(), new g(0, this));
        this.f935e = interfaceC5104a;
        this.f932b = handler;
        this.f938h = a9;
        this.f931a = dVar;
        c(eVar, bitmap);
    }

    public final void a() {
        int i;
        if (!this.f936f || this.f937g) {
            return;
        }
        e eVar = this.f942m;
        if (eVar != null) {
            this.f942m = null;
            b(eVar);
            return;
        }
        this.f937g = true;
        r1.d dVar = this.f931a;
        int i6 = dVar.f40367l.f40345c;
        long uptimeMillis = SystemClock.uptimeMillis() + ((i6 <= 0 || (i = dVar.f40366k) < 0) ? 0 : (i < 0 || i >= i6) ? -1 : ((C4947a) r2.f40347e.get(i)).i);
        int i9 = (dVar.f40366k + 1) % dVar.f40367l.f40345c;
        dVar.f40366k = i9;
        this.f940k = new e(this.f932b, i9, uptimeMillis);
        n F8 = this.f938h.a((J1.e) new J1.e().t(new M1.d(Double.valueOf(Math.random())))).F(dVar);
        F8.D(this.f940k, F8);
    }

    public final void b(e eVar) {
        this.f937g = false;
        boolean z3 = this.f939j;
        Handler handler = this.f932b;
        if (z3) {
            handler.obtainMessage(2, eVar).sendToTarget();
            return;
        }
        if (!this.f936f) {
            this.f942m = eVar;
            return;
        }
        if (eVar.f928z != null) {
            Bitmap bitmap = this.f941l;
            if (bitmap != null) {
                this.f935e.d(bitmap);
                this.f941l = null;
            }
            e eVar2 = this.i;
            this.i = eVar;
            ArrayList arrayList = this.f933c;
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
                    e eVar3 = ((h) cVar.f914n.f664b).i;
                    if ((eVar3 != null ? eVar3.f926x : -1) == r5.f931a.f40367l.f40345c - 1) {
                        cVar.f919y++;
                    }
                    int i = cVar.f920z;
                    if (i != -1 && cVar.f919y >= i) {
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
        N1.g.c(lVar, "Argument must not be null");
        N1.g.c(bitmap, "Argument must not be null");
        this.f941l = bitmap;
        this.f938h = this.f938h.a(new J1.e().x(lVar, true));
        this.f943n = N1.p.c(bitmap);
        this.f944o = bitmap.getWidth();
        this.f945p = bitmap.getHeight();
    }
}
