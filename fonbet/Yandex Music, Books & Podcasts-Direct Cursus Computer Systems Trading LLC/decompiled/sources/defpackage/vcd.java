package defpackage;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import com.bumptech.glide.a;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class vcd {
    public final abr a;
    public final Handler b;
    public final ArrayList c;
    public final b1o d;
    public final r33 e;
    public boolean f;
    public boolean g;
    public k0o h;
    public tcd i;
    public boolean j;
    public tcd k;
    public Bitmap l;
    public tcd m;
    public int n;
    public int o;
    public int p;

    public vcd(a aVar, abr abrVar, int i, int i2, Bitmap bitmap) {
        r33 r33Var = aVar.a;
        jld jldVar = aVar.c;
        b1o c = a.c(jldVar.getBaseContext());
        b1o c2 = a.c(jldVar.getBaseContext());
        c2.getClass();
        k0o b = new k0o(c2.a, c2, Bitmap.class, c2.b).b(b1o.k).b(((g1o) ((g1o) ((g1o) new g1o().e(x68.b)).x()).t()).k(i, i2));
        this.c = new ArrayList();
        this.d = c;
        Handler handler = new Handler(Looper.getMainLooper(), new ucd(0, this));
        this.e = r33Var;
        this.b = handler;
        this.h = b;
        this.a = abrVar;
        c(wit.b, bitmap);
    }

    public final void a() {
        int i;
        if (!this.f || this.g) {
            return;
        }
        tcd tcdVar = this.m;
        if (tcdVar != null) {
            this.m = null;
            b(tcdVar);
            return;
        }
        this.g = true;
        abr abrVar = this.a;
        int i2 = abrVar.l.c;
        long uptimeMillis = SystemClock.uptimeMillis() + ((i2 <= 0 || (i = abrVar.k) < 0) ? 0 : (i < 0 || i >= i2) ? -1 : ((scd) r2.e.get(i)).i);
        int i3 = (abrVar.k + 1) % abrVar.l.c;
        abrVar.k = i3;
        this.k = new tcd(this.b, i3, uptimeMillis);
        k0o I = this.h.b((g1o) new g1o().s(new vhj(Double.valueOf(Math.random())))).I(abrVar);
        I.E(this.k, I);
    }

    public final void b(tcd tcdVar) {
        this.g = false;
        boolean z = this.j;
        Handler handler = this.b;
        if (z) {
            handler.obtainMessage(2, tcdVar).sendToTarget();
            return;
        }
        if (!this.f) {
            this.m = tcdVar;
            return;
        }
        if (tcdVar.g != null) {
            Bitmap bitmap = this.l;
            if (bitmap != null) {
                this.e.o(bitmap);
                this.l = null;
            }
            tcd tcdVar2 = this.i;
            this.i = tcdVar;
            ArrayList arrayList = this.c;
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                pcd pcdVar = (pcd) arrayList.get(size);
                Object callback = pcdVar.getCallback();
                while (callback instanceof Drawable) {
                    callback = ((Drawable) callback).getCallback();
                }
                if (callback == null) {
                    pcdVar.stop();
                    pcdVar.invalidateSelf();
                } else {
                    pcdVar.invalidateSelf();
                    tcd tcdVar3 = ((vcd) pcdVar.a.b).i;
                    if ((tcdVar3 != null ? tcdVar3.e : -1) == r5.a.l.c - 1) {
                        pcdVar.f++;
                    }
                    int i = pcdVar.g;
                    if (i != -1 && pcdVar.f >= i) {
                        pcdVar.stop();
                    }
                }
            }
            if (tcdVar2 != null) {
                handler.obtainMessage(2, tcdVar2).sendToTarget();
            }
        }
        a();
    }

    public final void c(d7t d7tVar, Bitmap bitmap) {
        w1g.s(d7tVar, "Argument must not be null");
        w1g.s(bitmap, "Argument must not be null");
        this.l = bitmap;
        this.h = this.h.b(new g1o().v(d7tVar, true));
        this.n = xut.c(bitmap);
        this.o = bitmap.getWidth();
        this.p = bitmap.getHeight();
    }
}
