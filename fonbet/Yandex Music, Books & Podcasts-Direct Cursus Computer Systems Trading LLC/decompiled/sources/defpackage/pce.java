package defpackage;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import java.util.LinkedHashMap;
import java.util.List;
import kotlinx.coroutines.a;

/* loaded from: classes.dex */
public final class pce {
    public bnq A;
    public nso B;
    public final Context a;
    public yp7 b;
    public Object c;
    public i6s d;
    public qce e;
    public xwh f;
    public String g;
    public Bitmap.Config h;
    public ilm i;
    public List j;
    public u7t k;
    public final pv9 l;
    public final LinkedHashMap m;
    public final boolean n;
    public Boolean o;
    public final boolean p;
    public dq3 q;
    public dq3 r;
    public dq3 s;
    public h4b t;
    public Integer u;
    public Integer v;
    public Drawable w;
    public bnq x;
    public nso y;
    public nyf z;

    public pce(rce rceVar, Context context) {
        this.a = context;
        this.b = rceVar.F;
        this.c = rceVar.b;
        this.d = rceVar.c;
        this.e = rceVar.d;
        this.f = rceVar.e;
        this.g = rceVar.f;
        tu7 tu7Var = rceVar.E;
        this.h = tu7Var.e;
        this.i = tu7Var.d;
        this.j = rceVar.i;
        this.k = tu7Var.c;
        this.l = rceVar.k.m();
        this.m = uah.q(rceVar.l.a);
        this.n = rceVar.m;
        this.o = tu7Var.f;
        this.p = rceVar.p;
        this.q = tu7Var.g;
        this.r = tu7Var.h;
        this.s = tu7Var.i;
        m6k m6kVar = rceVar.A;
        h4b h4bVar = new h4b();
        h4bVar.a = uah.q(m6kVar.a);
        this.t = h4bVar;
        this.u = rceVar.B;
        this.v = rceVar.C;
        this.w = rceVar.D;
        this.x = tu7Var.a;
        this.y = tu7Var.b;
        if (rceVar.a == context) {
            this.z = rceVar.x;
            this.A = rceVar.y;
            this.B = rceVar.z;
        } else {
            this.z = null;
            this.A = null;
            this.B = null;
        }
    }

    public final rce a() {
        a aVar;
        Object obj;
        View view;
        bnq bnqVar;
        Object obj2 = this.c;
        if (obj2 == null) {
            obj2 = klx.g;
        }
        Object obj3 = obj2;
        i6s i6sVar = this.d;
        qce qceVar = this.e;
        xwh xwhVar = this.f;
        String str = this.g;
        Bitmap.Config config = this.h;
        if (config == null) {
            config = this.b.g;
        }
        Bitmap.Config config2 = config;
        ilm ilmVar = this.i;
        if (ilmVar == null) {
            ilmVar = this.b.f;
        }
        ilm ilmVar2 = ilmVar;
        List list = this.j;
        u7t u7tVar = this.k;
        if (u7tVar == null) {
            u7tVar = this.b.e;
        }
        u7t u7tVar2 = u7tVar;
        pv9 pv9Var = this.l;
        zvd r = pv9Var != null ? pv9Var.r() : null;
        if (r == null) {
            r = k.c;
        } else {
            Bitmap.Config[] configArr = k.a;
        }
        zvd zvdVar = r;
        LinkedHashMap linkedHashMap = this.m;
        h4s h4sVar = linkedHashMap != null ? new h4s(xee.M(linkedHashMap)) : null;
        if (h4sVar == null) {
            h4sVar = h4s.b;
        }
        h4s h4sVar2 = h4sVar;
        Boolean bool = this.o;
        boolean booleanValue = bool != null ? bool.booleanValue() : this.b.h;
        yp7 yp7Var = this.b;
        boolean z = yp7Var.i;
        dq3 dq3Var = this.q;
        if (dq3Var == null) {
            dq3Var = yp7Var.m;
        }
        dq3 dq3Var2 = dq3Var;
        dq3 dq3Var3 = this.r;
        if (dq3Var3 == null) {
            dq3Var3 = yp7Var.n;
        }
        dq3 dq3Var4 = dq3Var3;
        dq3 dq3Var5 = this.s;
        if (dq3Var5 == null) {
            dq3Var5 = yp7Var.o;
        }
        dq3 dq3Var6 = dq3Var5;
        a aVar2 = yp7Var.a;
        a aVar3 = yp7Var.b;
        a aVar4 = yp7Var.c;
        a aVar5 = yp7Var.d;
        nyf nyfVar = this.z;
        Context context = this.a;
        if (nyfVar == null) {
            i6s i6sVar2 = this.d;
            aVar = aVar5;
            Object context2 = i6sVar2 instanceof lhu ? ((lhu) i6sVar2).getView().getContext() : context;
            while (true) {
                if (context2 instanceof dzf) {
                    nyfVar = ((dzf) context2).getLifecycle();
                    break;
                }
                if (!(context2 instanceof ContextWrapper)) {
                    nyfVar = null;
                    break;
                }
                context2 = ((ContextWrapper) context2).getBaseContext();
            }
            if (nyfVar == null) {
                nyfVar = uld.b;
            }
        } else {
            aVar = aVar5;
        }
        nyf nyfVar2 = nyfVar;
        bnq bnqVar2 = this.x;
        if (bnqVar2 == null && (bnqVar2 = this.A) == null) {
            i6s i6sVar3 = this.d;
            if (i6sVar3 instanceof lhu) {
                View view2 = ((lhu) i6sVar3).getView();
                if (view2 instanceof ImageView) {
                    ImageView.ScaleType scaleType = ((ImageView) view2).getScaleType();
                    obj = obj3;
                    if (scaleType == ImageView.ScaleType.CENTER || scaleType == ImageView.ScaleType.MATRIX) {
                        bnqVar = new xkn(lmq.c);
                        bnqVar2 = bnqVar;
                    }
                } else {
                    obj = obj3;
                }
                bnqVar = new aln(view2);
                bnqVar2 = bnqVar;
            } else {
                obj = obj3;
                bnqVar2 = new ha8(context);
            }
        } else {
            obj = obj3;
        }
        bnq bnqVar3 = bnqVar2;
        nso nsoVar = this.y;
        if (nsoVar == null && (nsoVar = this.B) == null) {
            bnq bnqVar4 = this.x;
            aln alnVar = bnqVar4 instanceof aln ? (aln) bnqVar4 : null;
            if (alnVar == null || (view = alnVar.a) == null) {
                i6s i6sVar4 = this.d;
                lhu lhuVar = i6sVar4 instanceof lhu ? (lhu) i6sVar4 : null;
                view = lhuVar != null ? lhuVar.getView() : null;
            }
            if (view instanceof ImageView) {
                Bitmap.Config[] configArr2 = k.a;
                ImageView.ScaleType scaleType2 = ((ImageView) view).getScaleType();
                int i = scaleType2 == null ? -1 : j.a[scaleType2.ordinal()];
                nsoVar = (i == 1 || i == 2 || i == 3 || i == 4) ? nso.b : nso.a;
            } else {
                nsoVar = nso.b;
            }
        }
        nso nsoVar2 = nsoVar;
        h4b h4bVar = this.t;
        m6k m6kVar = h4bVar != null ? new m6k(xee.M((LinkedHashMap) h4bVar.a)) : null;
        if (m6kVar == null) {
            m6kVar = m6k.b;
        }
        return new rce(context, obj, i6sVar, qceVar, xwhVar, str, config2, ilmVar2, list, u7tVar2, zvdVar, h4sVar2, this.n, booleanValue, z, this.p, dq3Var2, dq3Var4, dq3Var6, aVar2, aVar3, aVar4, aVar, nyfVar2, bnqVar3, nsoVar2, m6kVar, this.u, this.v, this.w, new tu7(this.x, this.y, this.k, this.i, this.h, this.o, this.q, this.r, this.s), this.b);
    }

    public final void b() {
        this.k = new vu6(100);
    }

    public final void c(int i) {
        this.u = Integer.valueOf(i);
    }

    public final void d() {
        this.z = null;
        this.A = null;
        this.B = null;
    }

    public final void e(lmq lmqVar) {
        this.x = new xkn(lmqVar);
        d();
    }

    public final void f(ImageView imageView) {
        this.d = new fde(imageView);
        d();
    }

    public pce(Context context) {
        this.a = context;
        this.b = i.a;
        this.c = null;
        this.d = null;
        this.e = null;
        this.f = null;
        this.g = null;
        this.h = null;
        this.i = null;
        this.j = c5b.a;
        this.k = null;
        this.l = null;
        this.m = null;
        this.n = true;
        this.o = null;
        this.p = true;
        this.q = null;
        this.r = null;
        this.s = null;
        this.t = null;
        this.u = null;
        this.v = null;
        this.w = null;
        this.x = null;
        this.y = null;
        this.z = null;
        this.A = null;
        this.B = null;
    }
}
