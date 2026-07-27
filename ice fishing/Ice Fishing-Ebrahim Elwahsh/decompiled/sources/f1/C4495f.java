package f1;

import B2.N;
import S0.s;
import X0.v;
import X0.z;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.RectF;
import e1.m;
import g1.C4524d;
import j1.C4589b;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: f1.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4495f extends AbstractC4490a {

    /* renamed from: D, reason: collision with root package name */
    public final Z0.d f37622D;

    /* renamed from: E, reason: collision with root package name */
    public final C4491b f37623E;

    /* renamed from: F, reason: collision with root package name */
    public final a1.h f37624F;

    public C4495f(v vVar, C4493d c4493d, C4491b c4491b, X0.i iVar) {
        super(vVar, c4493d);
        this.f37623E = c4491b;
        Z0.d dVar = new Z0.d(vVar, this, new m("__container", c4493d.f37598a, false), iVar);
        this.f37622D = dVar;
        List list = Collections.EMPTY_LIST;
        dVar.b(list, list);
        N n9 = this.f37569p.f37620x;
        if (n9 != null) {
            this.f37624F = new a1.h(this, this, n9);
        }
    }

    @Override // f1.AbstractC4490a, c1.f
    public final void c(ColorFilter colorFilter, s sVar) {
        super.c(colorFilter, sVar);
        PointF pointF = z.f3785a;
        a1.h hVar = this.f37624F;
        if (colorFilter == 5 && hVar != null) {
            hVar.f4313c.j(sVar);
            return;
        }
        if (colorFilter == z.f3776E && hVar != null) {
            hVar.c(sVar);
            return;
        }
        if (colorFilter == z.f3777F && hVar != null) {
            hVar.f4315e.j(sVar);
            return;
        }
        if (colorFilter == z.f3778G && hVar != null) {
            hVar.f4316f.j(sVar);
        } else {
            if (colorFilter != z.f3779H || hVar == null) {
                return;
            }
            hVar.f4317g.j(sVar);
        }
    }

    @Override // f1.AbstractC4490a, Z0.e
    public final void d(RectF rectF, Matrix matrix, boolean z8) {
        super.d(rectF, matrix, z8);
        this.f37622D.d(rectF, this.f37567n, z8);
    }

    @Override // f1.AbstractC4490a
    public final void k(Canvas canvas, Matrix matrix, int i, C4589b c4589b) {
        a1.h hVar = this.f37624F;
        if (hVar != null) {
            c4589b = hVar.b(matrix, i);
        }
        this.f37622D.h(canvas, matrix, i, c4589b);
    }

    @Override // f1.AbstractC4490a
    public final C4524d l() {
        C4524d c4524d = this.f37569p.f37619w;
        return c4524d != null ? c4524d : this.f37623E.f37569p.f37619w;
    }

    @Override // f1.AbstractC4490a
    public final void p(c1.e eVar, int i, ArrayList arrayList, c1.e eVar2) {
        this.f37622D.f(eVar, i, arrayList, eVar2);
    }
}
