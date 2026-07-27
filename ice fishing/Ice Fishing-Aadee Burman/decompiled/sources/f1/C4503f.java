package f1;

import C2.N;
import X0.v;
import X0.z;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.RectF;
import com.google.android.gms.internal.ads.C2991bm;
import e1.m;
import j1.C4597a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: f1.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4503f extends AbstractC4498a {

    /* renamed from: D, reason: collision with root package name */
    public final Z0.d f37418D;

    /* renamed from: E, reason: collision with root package name */
    public final C4499b f37419E;

    /* renamed from: F, reason: collision with root package name */
    public final a1.h f37420F;

    public C4503f(v vVar, C4501d c4501d, C4499b c4499b, X0.i iVar) {
        super(vVar, c4501d);
        this.f37419E = c4499b;
        Z0.d dVar = new Z0.d(vVar, this, new m("__container", c4501d.f37394a, false), iVar);
        this.f37418D = dVar;
        List list = Collections.EMPTY_LIST;
        dVar.b(list, list);
        N n9 = this.f37365p.f37416x;
        if (n9 != null) {
            this.f37420F = new a1.h(this, this, n9);
        }
    }

    @Override // f1.AbstractC4498a, Z0.e
    public final void c(RectF rectF, Matrix matrix, boolean z3) {
        super.c(rectF, matrix, z3);
        this.f37418D.c(rectF, this.f37363n, z3);
    }

    @Override // f1.AbstractC4498a, c1.f
    public final void h(ColorFilter colorFilter, C2991bm c2991bm) {
        super.h(colorFilter, c2991bm);
        PointF pointF = z.f3729a;
        a1.h hVar = this.f37420F;
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
        a1.h hVar = this.f37420F;
        if (hVar != null) {
            c4597a = hVar.b(matrix, i);
        }
        this.f37418D.g(canvas, matrix, i, c4597a);
    }

    @Override // f1.AbstractC4498a
    public final F1.a l() {
        F1.a aVar = this.f37365p.f37415w;
        return aVar != null ? aVar : this.f37419E.f37365p.f37415w;
    }

    @Override // f1.AbstractC4498a
    public final void p(c1.e eVar, int i, ArrayList arrayList, c1.e eVar2) {
        this.f37418D.e(eVar, i, arrayList, eVar2);
    }
}
