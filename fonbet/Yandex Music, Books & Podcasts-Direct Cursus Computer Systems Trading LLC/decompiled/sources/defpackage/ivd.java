package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;

/* loaded from: classes3.dex */
public final class ivd implements gvd {
    public final String a;
    public final mm6 b;
    public final long c;
    public final Context d;
    public final cce e;
    public final boolean f;
    public final fud g;
    public final x0q h;
    public final fk0 i;
    public final x6k j;
    public final x6k k;
    public final x6k l;

    public ivd(String str, mm6 mm6Var, long j, Context context, cce cceVar, boolean z, fud fudVar) {
        str.getClass();
        context.getClass();
        cceVar.getClass();
        this.a = str;
        this.b = mm6Var;
        this.c = j;
        this.d = context;
        this.e = cceVar;
        this.f = z;
        this.g = fudVar;
        this.h = y0q.b(0, 0, null, 7);
        this.i = bmq.a(j);
        xr1 xr1Var = xr1.a;
        this.j = szf.g0(xr1Var);
        this.k = szf.g0(xr1Var);
        this.l = vz1.j(d85.n);
        x97.y(mm6Var, null, null, new hvd(this, null, 1), 3);
    }

    public static final bs1 e(ivd ivdVar, sce sceVar) {
        ivdVar.getClass();
        if (sceVar instanceof pgb) {
            pgb pgbVar = (pgb) sceVar;
            Drawable drawable = pgbVar.a;
            return new yr1(drawable != null ? f(drawable) : null, pgbVar);
        }
        if (sceVar instanceof bqr) {
            bqr bqrVar = (bqr) sceVar;
            return new as1(f(bqrVar.a), bqrVar);
        }
        b6e.s();
        return null;
    }

    public static w4k f(Drawable drawable) {
        if (drawable instanceof BitmapDrawable) {
            Bitmap bitmap = ((BitmapDrawable) drawable).getBitmap();
            bitmap.getClass();
            return new q33(new yg0(bitmap));
        }
        if (drawable instanceof ColorDrawable) {
            return new w85(c3x.f(((ColorDrawable) drawable).getColor()));
        }
        Drawable mutate = drawable.mutate();
        mutate.getClass();
        return new opa(mutate);
    }

    @Override // defpackage.gvd
    public final long a() {
        fud fudVar = this.g;
        return fudVar != null ? fudVar.a() : ((d85) this.i.e()).a;
    }

    @Override // defpackage.gvd
    public final long b() {
        fud fudVar = this.g;
        return fudVar != null ? fudVar.b() : ((d85) this.l.getValue()).a;
    }

    @Override // defpackage.gvd
    public final bs1 c() {
        return (bs1) this.k.getValue();
    }

    @Override // defpackage.gvd
    public final bs1 d() {
        return (bs1) this.j.getValue();
    }
}
