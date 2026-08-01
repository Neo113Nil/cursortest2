package f1;

import C2.N;
import X0.v;
import X0.z;
import a1.AbstractC0428e;
import a1.s;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.RectF;
import com.anythink.basead.exoplayer.k.p;
import com.google.android.gms.internal.ads.C2991bm;
import d1.C4444b;
import j1.AbstractC4599c;
import j1.C4597a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import u.AbstractC5049e;

/* renamed from: f1.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4499b extends AbstractC4498a {

    /* renamed from: D, reason: collision with root package name */
    public AbstractC0428e f37376D;

    /* renamed from: E, reason: collision with root package name */
    public final ArrayList f37377E;

    /* renamed from: F, reason: collision with root package name */
    public final RectF f37378F;

    /* renamed from: G, reason: collision with root package name */
    public final RectF f37379G;

    /* renamed from: H, reason: collision with root package name */
    public final RectF f37380H;

    /* renamed from: I, reason: collision with root package name */
    public final j1.i f37381I;
    public final G1.a J;

    /* renamed from: K, reason: collision with root package name */
    public float f37382K;

    /* renamed from: L, reason: collision with root package name */
    public boolean f37383L;

    /* renamed from: M, reason: collision with root package name */
    public final a1.h f37384M;

    public C4499b(v vVar, C4501d c4501d, List list, X0.i iVar) {
        super(vVar, c4501d);
        AbstractC4498a abstractC4498a;
        AbstractC4498a c4499b;
        String str;
        this.f37377E = new ArrayList();
        this.f37378F = new RectF();
        this.f37379G = new RectF();
        this.f37380H = new RectF();
        this.f37381I = new j1.i();
        this.J = new G1.a((byte) 0, 16);
        this.f37383L = true;
        C4444b c4444b = c4501d.f37411s;
        if (c4444b != null) {
            a1.i a9 = c4444b.a();
            this.f37376D = a9;
            d(a9);
            this.f37376D.a(this);
        } else {
            this.f37376D = null;
        }
        s.e eVar = new s.e(iVar.f3621j.size());
        int size = list.size() - 1;
        AbstractC4498a abstractC4498a2 = null;
        while (true) {
            if (size < 0) {
                for (int i = 0; i < eVar.l(); i++) {
                    if (eVar.f40415n) {
                        eVar.i();
                    }
                    AbstractC4498a abstractC4498a3 = (AbstractC4498a) eVar.j(eVar.f40416u[i], null);
                    if (abstractC4498a3 != null && (abstractC4498a = (AbstractC4498a) eVar.j(abstractC4498a3.f37365p.f37399f, null)) != null) {
                        abstractC4498a3.f37369t = abstractC4498a;
                    }
                }
                N n9 = this.f37365p.f37416x;
                if (n9 != null) {
                    this.f37384M = new a1.h(this, this, n9);
                    return;
                }
                return;
            }
            C4501d c4501d2 = (C4501d) list.get(size);
            int d2 = AbstractC5049e.d(c4501d2.f37398e);
            if (d2 == 0) {
                c4499b = new C4499b(vVar, c4501d2, (List) iVar.f3615c.get(c4501d2.f37400g), iVar);
            } else if (d2 == 1) {
                c4499b = new C4504g(vVar, c4501d2);
            } else if (d2 == 2) {
                c4499b = new C4500c(vVar, c4501d2);
            } else if (d2 == 3) {
                c4499b = new C4502e(vVar, c4501d2);
            } else if (d2 == 4) {
                c4499b = new C4503f(vVar, c4501d2, this, iVar);
            } else if (d2 != 5) {
                switch (c4501d2.f37398e) {
                    case 1:
                        str = "PRE_COMP";
                        break;
                    case 2:
                        str = "SOLID";
                        break;
                    case 3:
                        str = "IMAGE";
                        break;
                    case 4:
                        str = "NULL";
                        break;
                    case 5:
                        str = "SHAPE";
                        break;
                    case 6:
                        str = "TEXT";
                        break;
                    case 7:
                        str = "UNKNOWN";
                        break;
                    default:
                        str = "null";
                        break;
                }
                AbstractC4599c.b("Unknown layer type ".concat(str));
                c4499b = null;
            } else {
                c4499b = new C4506i(vVar, c4501d2);
            }
            if (c4499b != null) {
                eVar.k(c4499b.f37365p.f37397d, c4499b);
                if (abstractC4498a2 != null) {
                    abstractC4498a2.f37368s = c4499b;
                    abstractC4498a2 = null;
                } else {
                    this.f37377E.add(0, c4499b);
                    int d9 = AbstractC5049e.d(c4501d2.f37413u);
                    if (d9 == 1 || d9 == 2) {
                        abstractC4498a2 = c4499b;
                    }
                }
            }
            size--;
        }
    }

    @Override // f1.AbstractC4498a, Z0.e
    public final void c(RectF rectF, Matrix matrix, boolean z3) {
        super.c(rectF, matrix, z3);
        ArrayList arrayList = this.f37377E;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            RectF rectF2 = this.f37378F;
            rectF2.set(0.0f, 0.0f, 0.0f, 0.0f);
            ((AbstractC4498a) arrayList.get(size)).c(rectF2, this.f37363n, true);
            rectF.union(rectF2);
        }
    }

    @Override // f1.AbstractC4498a, c1.f
    public final void h(ColorFilter colorFilter, C2991bm c2991bm) {
        super.h(colorFilter, c2991bm);
        if (colorFilter == z.f3718C) {
            s sVar = new s(c2991bm, null);
            this.f37376D = sVar;
            sVar.a(this);
            d(this.f37376D);
            return;
        }
        a1.h hVar = this.f37384M;
        if (colorFilter == 5 && hVar != null) {
            hVar.f4264c.j(c2991bm);
            return;
        }
        if (colorFilter == z.f3720E && hVar != null) {
            hVar.c(c2991bm);
            return;
        }
        if (colorFilter == z.f3721F && hVar != null) {
            hVar.f4266e.j(c2991bm);
            return;
        }
        if (colorFilter == z.f3722G && hVar != null) {
            hVar.f4267f.j(c2991bm);
        } else {
            if (colorFilter != z.f3723H || hVar == null) {
                return;
            }
            hVar.f4268g.j(c2991bm);
        }
    }

    @Override // f1.AbstractC4498a
    public final void k(Canvas canvas, Matrix matrix, int i, C4597a c4597a) {
        Canvas canvas2;
        a1.h hVar = this.f37384M;
        boolean z3 = false;
        boolean z6 = (c4597a == null && hVar == null) ? false : true;
        v vVar = this.f37364o;
        boolean z9 = vVar.f3676L;
        ArrayList arrayList = this.f37377E;
        int i6 = p.f8473b;
        if ((z9 && arrayList.size() > 1 && i != 255) || (z6 && vVar.f3677M)) {
            z3 = true;
        }
        if (!z3) {
            i6 = i;
        }
        if (hVar != null) {
            c4597a = hVar.b(matrix, i6);
        }
        boolean z10 = this.f37383L;
        RectF rectF = this.f37379G;
        C4501d c4501d = this.f37365p;
        if (z10 || !"__container".equals(c4501d.f37396c)) {
            rectF.set(0.0f, 0.0f, c4501d.f37407o, c4501d.f37408p);
            matrix.mapRect(rectF);
        } else {
            rectF.setEmpty();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                AbstractC4498a abstractC4498a = (AbstractC4498a) it.next();
                RectF rectF2 = this.f37380H;
                abstractC4498a.c(rectF2, matrix, true);
                rectF.union(rectF2);
            }
        }
        j1.i iVar = this.f37381I;
        if (z3) {
            G1.a aVar = this.J;
            aVar.f1051v = null;
            aVar.f1050u = i;
            if (c4597a != null) {
                if (Color.alpha(c4597a.f38299d) > 0) {
                    aVar.f1051v = c4597a;
                } else {
                    aVar.f1051v = null;
                }
                c4597a = null;
            }
            canvas2 = iVar.e(canvas, rectF, aVar);
        } else {
            canvas2 = canvas;
        }
        canvas.save();
        if (canvas.clipRect(rectF)) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((AbstractC4498a) arrayList.get(size)).g(canvas2, matrix, i6, c4597a);
            }
        }
        if (z3) {
            iVar.c();
        }
        canvas.restore();
    }

    @Override // f1.AbstractC4498a
    public final void p(c1.e eVar, int i, ArrayList arrayList, c1.e eVar2) {
        int i6 = 0;
        while (true) {
            ArrayList arrayList2 = this.f37377E;
            if (i6 >= arrayList2.size()) {
                return;
            }
            ((AbstractC4498a) arrayList2.get(i6)).e(eVar, i, arrayList, eVar2);
            i6++;
        }
    }

    @Override // f1.AbstractC4498a
    public final void q(boolean z3) {
        super.q(z3);
        Iterator it = this.f37377E.iterator();
        while (it.hasNext()) {
            ((AbstractC4498a) it.next()).q(z3);
        }
    }

    @Override // f1.AbstractC4498a
    public final void r(float f3) {
        this.f37382K = f3;
        super.r(f3);
        AbstractC0428e abstractC0428e = this.f37376D;
        C4501d c4501d = this.f37365p;
        if (abstractC0428e != null) {
            X0.i iVar = this.f37364o.f3690n;
            f3 = ((((Float) abstractC0428e.e()).floatValue() * c4501d.f37395b.f3625n) - c4501d.f37395b.f3623l) / ((iVar.f3624m - iVar.f3623l) + 0.01f);
        }
        if (this.f37376D == null) {
            X0.i iVar2 = c4501d.f37395b;
            f3 -= c4501d.f37406n / (iVar2.f3624m - iVar2.f3623l);
        }
        if (c4501d.f37405m != 0.0f && !"__container".equals(c4501d.f37396c)) {
            f3 /= c4501d.f37405m;
        }
        ArrayList arrayList = this.f37377E;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            ((AbstractC4498a) arrayList.get(size)).r(f3);
        }
    }
}
