package h1;

import E2.M;
import Z0.v;
import Z0.z;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.RectF;
import c1.AbstractC0545e;
import c1.s;
import com.anythink.basead.exoplayer.k.p;
import com.google.android.gms.internal.ads.LP;
import f1.C4516b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import l1.AbstractC4668c;
import l1.C4666a;
import u.AbstractC5050e;

/* renamed from: h1.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4564b extends AbstractC4563a {

    /* renamed from: D, reason: collision with root package name */
    public AbstractC0545e f38000D;

    /* renamed from: E, reason: collision with root package name */
    public final ArrayList f38001E;

    /* renamed from: F, reason: collision with root package name */
    public final RectF f38002F;

    /* renamed from: G, reason: collision with root package name */
    public final RectF f38003G;

    /* renamed from: H, reason: collision with root package name */
    public final RectF f38004H;

    /* renamed from: I, reason: collision with root package name */
    public final l1.h f38005I;
    public final I1.a J;

    /* renamed from: K, reason: collision with root package name */
    public float f38006K;

    /* renamed from: L, reason: collision with root package name */
    public boolean f38007L;

    /* renamed from: M, reason: collision with root package name */
    public final c1.h f38008M;

    public C4564b(v vVar, C4566d c4566d, List list, Z0.i iVar) {
        super(vVar, c4566d);
        AbstractC4563a abstractC4563a;
        AbstractC4563a c4564b;
        String str;
        this.f38001E = new ArrayList();
        this.f38002F = new RectF();
        this.f38003G = new RectF();
        this.f38004H = new RectF();
        this.f38005I = new l1.h();
        this.J = new I1.a((byte) 0, 16);
        this.f38007L = true;
        C4516b c4516b = c4566d.f38035s;
        if (c4516b != null) {
            c1.i a9 = c4516b.a();
            this.f38000D = a9;
            f(a9);
            this.f38000D.a(this);
        } else {
            this.f38000D = null;
        }
        s.e eVar = new s.e(iVar.f3973j.size());
        int size = list.size() - 1;
        AbstractC4563a abstractC4563a2 = null;
        while (true) {
            if (size < 0) {
                for (int i = 0; i < eVar.l(); i++) {
                    if (eVar.f40251n) {
                        eVar.i();
                    }
                    AbstractC4563a abstractC4563a3 = (AbstractC4563a) eVar.j(eVar.f40252u[i], null);
                    if (abstractC4563a3 != null && (abstractC4563a = (AbstractC4563a) eVar.j(abstractC4563a3.f37989p.f38023f, null)) != null) {
                        abstractC4563a3.f37993t = abstractC4563a;
                    }
                }
                M m9 = this.f37989p.f38040x;
                if (m9 != null) {
                    this.f38008M = new c1.h(this, this, m9);
                    return;
                }
                return;
            }
            C4566d c4566d2 = (C4566d) list.get(size);
            int d9 = AbstractC5050e.d(c4566d2.f38022e);
            if (d9 == 0) {
                c4564b = new C4564b(vVar, c4566d2, (List) iVar.f3967c.get(c4566d2.f38024g), iVar);
            } else if (d9 == 1) {
                c4564b = new C4569g(vVar, c4566d2);
            } else if (d9 == 2) {
                c4564b = new C4565c(vVar, c4566d2);
            } else if (d9 == 3) {
                c4564b = new C4567e(vVar, c4566d2);
            } else if (d9 == 4) {
                c4564b = new C4568f(vVar, c4566d2, this, iVar);
            } else if (d9 != 5) {
                switch (c4566d2.f38022e) {
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
                AbstractC4668c.b("Unknown layer type ".concat(str));
                c4564b = null;
            } else {
                c4564b = new C4571i(vVar, c4566d2);
            }
            if (c4564b != null) {
                eVar.k(c4564b.f37989p.f38021d, c4564b);
                if (abstractC4563a2 != null) {
                    abstractC4563a2.f37992s = c4564b;
                    abstractC4563a2 = null;
                } else {
                    this.f38001E.add(0, c4564b);
                    int d10 = AbstractC5050e.d(c4566d2.f38037u);
                    if (d10 == 1 || d10 == 2) {
                        abstractC4563a2 = c4564b;
                    }
                }
            }
            size--;
        }
    }

    @Override // h1.AbstractC4563a, e1.f
    public final void d(ColorFilter colorFilter, LP lp) {
        super.d(colorFilter, lp);
        if (colorFilter == z.f4069C) {
            s sVar = new s(lp, null);
            this.f38000D = sVar;
            sVar.a(this);
            f(this.f38000D);
            return;
        }
        c1.h hVar = this.f38008M;
        if (colorFilter == 5 && hVar != null) {
            hVar.f5659c.j(lp);
            return;
        }
        if (colorFilter == z.f4071E && hVar != null) {
            hVar.c(lp);
            return;
        }
        if (colorFilter == z.f4072F && hVar != null) {
            hVar.f5661e.j(lp);
            return;
        }
        if (colorFilter == z.f4073G && hVar != null) {
            hVar.f5662f.j(lp);
        } else {
            if (colorFilter != z.f4074H || hVar == null) {
                return;
            }
            hVar.f5663g.j(lp);
        }
    }

    @Override // h1.AbstractC4563a, b1.InterfaceC0521e
    public final void e(RectF rectF, Matrix matrix, boolean z6) {
        super.e(rectF, matrix, z6);
        ArrayList arrayList = this.f38001E;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            RectF rectF2 = this.f38002F;
            rectF2.set(0.0f, 0.0f, 0.0f, 0.0f);
            ((AbstractC4563a) arrayList.get(size)).e(rectF2, this.f37987n, true);
            rectF.union(rectF2);
        }
    }

    @Override // h1.AbstractC4563a
    public final void k(Canvas canvas, Matrix matrix, int i, C4666a c4666a) {
        Canvas canvas2;
        c1.h hVar = this.f38008M;
        boolean z6 = false;
        boolean z9 = (c4666a == null && hVar == null) ? false : true;
        v vVar = this.f37988o;
        boolean z10 = vVar.f4028L;
        ArrayList arrayList = this.f38001E;
        int i4 = p.f9259b;
        if ((z10 && arrayList.size() > 1 && i != 255) || (z9 && vVar.f4029M)) {
            z6 = true;
        }
        if (!z6) {
            i4 = i;
        }
        if (hVar != null) {
            c4666a = hVar.b(matrix, i4);
        }
        boolean z11 = this.f38007L;
        RectF rectF = this.f38003G;
        C4566d c4566d = this.f37989p;
        if (z11 || !"__container".equals(c4566d.f38020c)) {
            rectF.set(0.0f, 0.0f, c4566d.f38031o, c4566d.f38032p);
            matrix.mapRect(rectF);
        } else {
            rectF.setEmpty();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                AbstractC4563a abstractC4563a = (AbstractC4563a) it.next();
                RectF rectF2 = this.f38004H;
                abstractC4563a.e(rectF2, matrix, true);
                rectF.union(rectF2);
            }
        }
        l1.h hVar2 = this.f38005I;
        if (z6) {
            I1.a aVar = this.J;
            aVar.f1304v = null;
            aVar.f1303u = i;
            if (c4666a != null) {
                if (Color.alpha(c4666a.f38811d) > 0) {
                    aVar.f1304v = c4666a;
                } else {
                    aVar.f1304v = null;
                }
                c4666a = null;
            }
            canvas2 = hVar2.e(canvas, rectF, aVar);
        } else {
            canvas2 = canvas;
        }
        canvas.save();
        if (canvas.clipRect(rectF)) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((AbstractC4563a) arrayList.get(size)).h(canvas2, matrix, i4, c4666a);
            }
        }
        if (z6) {
            hVar2.c();
        }
        canvas.restore();
    }

    @Override // h1.AbstractC4563a
    public final void p(e1.e eVar, int i, ArrayList arrayList, e1.e eVar2) {
        int i4 = 0;
        while (true) {
            ArrayList arrayList2 = this.f38001E;
            if (i4 >= arrayList2.size()) {
                return;
            }
            ((AbstractC4563a) arrayList2.get(i4)).c(eVar, i, arrayList, eVar2);
            i4++;
        }
    }

    @Override // h1.AbstractC4563a
    public final void q(boolean z6) {
        super.q(z6);
        Iterator it = this.f38001E.iterator();
        while (it.hasNext()) {
            ((AbstractC4563a) it.next()).q(z6);
        }
    }

    @Override // h1.AbstractC4563a
    public final void r(float f2) {
        this.f38006K = f2;
        super.r(f2);
        AbstractC0545e abstractC0545e = this.f38000D;
        C4566d c4566d = this.f37989p;
        if (abstractC0545e != null) {
            Z0.i iVar = this.f37988o.f4046n;
            f2 = ((((Float) abstractC0545e.e()).floatValue() * c4566d.f38019b.f3977n) - c4566d.f38019b.f3975l) / ((iVar.f3976m - iVar.f3975l) + 0.01f);
        }
        if (this.f38000D == null) {
            Z0.i iVar2 = c4566d.f38019b;
            f2 -= c4566d.f38030n / (iVar2.f3976m - iVar2.f3975l);
        }
        if (c4566d.f38029m != 0.0f && !"__container".equals(c4566d.f38020c)) {
            f2 /= c4566d.f38029m;
        }
        ArrayList arrayList = this.f38001E;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            ((AbstractC4563a) arrayList.get(size)).r(f2);
        }
    }
}
