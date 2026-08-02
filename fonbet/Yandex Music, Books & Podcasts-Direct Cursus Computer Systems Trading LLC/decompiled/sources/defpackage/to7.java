package defpackage;

import android.content.Context;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Objects;

/* loaded from: classes.dex */
public final class to7 implements tvh {
    public final jp0 a;
    public final va7 b;
    public mvt c;
    public final long d;
    public final long e;
    public final long f;
    public final float g;
    public final float h;
    public boolean i;

    public to7(va7 va7Var, u2c u2cVar) {
        this.b = va7Var;
        mvt mvtVar = new mvt(20);
        this.c = mvtVar;
        jp0 jp0Var = new jp0(u2cVar, mvtVar);
        this.a = jp0Var;
        if (va7Var != ((va7) jp0Var.e)) {
            jp0Var.e = va7Var;
            ((HashMap) jp0Var.c).clear();
            ((HashMap) jp0Var.d).clear();
        }
        this.d = -9223372036854775807L;
        this.e = -9223372036854775807L;
        this.f = -9223372036854775807L;
        this.g = -3.4028235E38f;
        this.h = -3.4028235E38f;
        this.i = true;
    }

    public static tvh f(Class cls, va7 va7Var) {
        try {
            return (tvh) cls.getConstructor(va7.class).newInstance(va7Var);
        } catch (Exception e) {
            wvs.m(e);
            return null;
        }
    }

    @Override // defpackage.tvh
    public final void a(mvt mvtVar) {
        this.c = mvtVar;
        jp0 jp0Var = this.a;
        jp0Var.f = mvtVar;
        ((u2c) jp0Var.b).a(mvtVar);
        Iterator it = ((HashMap) jp0Var.d).values().iterator();
        while (it.hasNext()) {
            ((tvh) it.next()).a(mvtVar);
        }
    }

    @Override // defpackage.tvh
    public final void b() {
        jp0 jp0Var = this.a;
        jp0Var.getClass();
        ((u2c) jp0Var.b).b();
    }

    @Override // defpackage.tvh
    public final void c(boolean z) {
        this.i = z;
        jp0 jp0Var = this.a;
        jp0Var.a = z;
        ((u2c) jp0Var.b).c(z);
        Iterator it = ((HashMap) jp0Var.d).values().iterator();
        while (it.hasNext()) {
            ((tvh) it.next()).c(z);
        }
    }

    @Override // defpackage.tvh
    public final wvh d(onh onhVar) {
        gra K;
        gra graVar;
        onh onhVar2 = onhVar;
        onhVar2.b.getClass();
        String scheme = onhVar2.b.a.getScheme();
        if (scheme != null && scheme.equals("ssai")) {
            throw null;
        }
        boolean equals = Objects.equals(onhVar2.b.b, "application/x-image-uri");
        gnh gnhVar = onhVar2.b;
        if (equals) {
            long j = gnhVar.h;
            int i = dvt.a;
            throw null;
        }
        int R = dvt.R(gnhVar.a, gnhVar.b);
        if (onhVar2.b.h != -9223372036854775807L) {
            u2c u2cVar = (u2c) this.a.b;
            if (u2cVar instanceof hm7) {
                hm7 hm7Var = (hm7) u2cVar;
                synchronized (hm7Var) {
                    hm7Var.e = 1;
                }
            }
        }
        try {
            tvh f = this.a.f(R);
            dnh a = onhVar2.c.a();
            fnh fnhVar = onhVar2.c;
            if (fnhVar.a == -9223372036854775807L) {
                a.a = this.d;
            }
            if (fnhVar.d == -3.4028235E38f) {
                a.d = this.g;
            }
            if (fnhVar.e == -3.4028235E38f) {
                a.e = this.h;
            }
            if (fnhVar.b == -9223372036854775807L) {
                a.b = this.e;
            }
            if (fnhVar.c == -9223372036854775807L) {
                a.c = this.f;
            }
            fnh fnhVar2 = new fnh(a);
            if (!fnhVar2.equals(onhVar2.c)) {
                wmh a2 = onhVar2.a();
                a2.l = fnhVar2.a();
                onhVar2 = a2.a();
            }
            wvh d = f.d(onhVar2);
            yde ydeVar = onhVar2.b.g;
            if (!ydeVar.isEmpty()) {
                wvh[] wvhVarArr = new wvh[ydeVar.size() + 1];
                wvhVarArr[0] = d;
                for (int i2 = 0; i2 < ydeVar.size(); i2++) {
                    int i3 = 19;
                    if (this.i) {
                        bsc bscVar = new bsc();
                        bscVar.m = l5i.p(((mnh) ydeVar.get(i2)).b);
                        bscVar.d = ((mnh) ydeVar.get(i2)).c;
                        bscVar.e = ((mnh) ydeVar.get(i2)).d;
                        bscVar.f = ((mnh) ydeVar.get(i2)).e;
                        bscVar.b = ((mnh) ydeVar.get(i2)).f;
                        bscVar.a = ((mnh) ydeVar.get(i2)).g;
                        final dsc dscVar = new dsc(bscVar);
                        u2c u2cVar2 = new u2c() { // from class: mo7
                            @Override // defpackage.u2c
                            public final r2c[] e() {
                                to7 to7Var = to7.this;
                                mvt mvtVar = to7Var.c;
                                dsc dscVar2 = dscVar;
                                return new r2c[]{mvtVar.d(dscVar2) ? new npr(to7Var.c.f(dscVar2), null) : new ro7(dscVar2)};
                            }
                        };
                        va7 va7Var = this.b;
                        uvg uvgVar = new uvg(28, u2cVar2);
                        Object obj = new Object();
                        klx klxVar = new klx(i3);
                        if (this.c.d(dscVar)) {
                            bsc a3 = dscVar.a();
                            a3.m = l5i.p("application/x-media3-cues");
                            a3.j = dscVar.n;
                            a3.I = this.c.l(dscVar);
                            dscVar = new dsc(a3);
                        }
                        dsc dscVar2 = dscVar;
                        int i4 = i2 + 1;
                        onh d2 = onh.d(((mnh) ydeVar.get(i2)).a.toString());
                        d2.b.getClass();
                        d2.b.getClass();
                        cnh cnhVar = d2.b.c;
                        if (cnhVar == null) {
                            graVar = gra.a;
                        } else {
                            synchronized (obj) {
                                try {
                                    K = !cnhVar.equals(null) ? es6.K(cnhVar) : null;
                                    K.getClass();
                                } catch (Throwable th) {
                                    throw th;
                                }
                            }
                            graVar = K;
                        }
                        wvhVarArr[i4] = new xvm(d2, va7Var, uvgVar, graVar, klxVar, 1048576, dscVar2);
                    } else {
                        va7 va7Var2 = this.b;
                        va7Var2.getClass();
                        wvhVarArr[i2 + 1] = new ulq((mnh) ydeVar.get(i2), va7Var2, new klx(i3));
                    }
                }
                d = new bzh(wvhVarArr);
            }
            anh anhVar = onhVar2.e;
            if (anhVar.b != 0 || anhVar.d != Long.MIN_VALUE || anhVar.f) {
                op4 op4Var = new op4(d);
                long j2 = anhVar.b;
                vq1.v(j2 >= 0);
                vq1.A(!op4Var.g);
                op4Var.b = j2;
                long j3 = anhVar.d;
                vq1.A(!op4Var.g);
                op4Var.c = j3;
                boolean z = !anhVar.g;
                vq1.A(!op4Var.g);
                op4Var.d = z;
                boolean z2 = anhVar.e;
                vq1.A(!op4Var.g);
                op4Var.e = z2;
                boolean z3 = anhVar.f;
                vq1.A(!op4Var.g);
                op4Var.f = z3;
                op4Var.g = true;
                d = new rp4(op4Var);
            }
            onhVar2.b.getClass();
            if (onhVar2.b.d == null) {
                return d;
            }
            vq1.n0("DMediaSourceFactory", "Playing media without ads. Configure ad support by calling setAdsLoaderProvider and setAdViewProvider.");
            return d;
        } catch (ClassNotFoundException e) {
            wvs.m(e);
            return null;
        }
    }

    @Override // defpackage.tvh
    public final tvh e(hra hraVar) {
        vq1.y(hraVar, "MediaSource.Factory#setDrmSessionManagerProvider no longer handles null by instantiating a new DefaultDrmSessionManagerProvider. Explicitly construct and pass an instance in order to retain the old behavior.");
        jp0 jp0Var = this.a;
        jp0Var.g = hraVar;
        Iterator it = ((HashMap) jp0Var.d).values().iterator();
        while (it.hasNext()) {
            ((tvh) it.next()).e(hraVar);
        }
        return this;
    }

    public to7(Context context, hm7 hm7Var) {
        this(new hl5(context), hm7Var);
    }
}
