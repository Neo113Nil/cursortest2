package h1;

import E2.M;
import Z0.v;
import Z0.z;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.RectF;
import b1.C0520d;
import com.google.android.gms.internal.ads.LP;
import g1.m;
import i1.C4586c;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import l1.C4666a;

/* renamed from: h1.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4568f extends AbstractC4563a {

    /* renamed from: D, reason: collision with root package name */
    public final C0520d f38042D;

    /* renamed from: E, reason: collision with root package name */
    public final C4564b f38043E;

    /* renamed from: F, reason: collision with root package name */
    public final c1.h f38044F;

    public C4568f(v vVar, C4566d c4566d, C4564b c4564b, Z0.i iVar) {
        super(vVar, c4566d);
        this.f38043E = c4564b;
        C0520d c0520d = new C0520d(vVar, this, new m("__container", c4566d.f38018a, false), iVar);
        this.f38042D = c0520d;
        List list = Collections.EMPTY_LIST;
        c0520d.b(list, list);
        M m9 = this.f37989p.f38040x;
        if (m9 != null) {
            this.f38044F = new c1.h(this, this, m9);
        }
    }

    @Override // h1.AbstractC4563a, e1.f
    public final void d(ColorFilter colorFilter, LP lp) {
        super.d(colorFilter, lp);
        PointF pointF = z.f4080a;
        c1.h hVar = this.f38044F;
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
        this.f38042D.e(rectF, this.f37987n, z6);
    }

    @Override // h1.AbstractC4563a
    public final void k(Canvas canvas, Matrix matrix, int i, C4666a c4666a) {
        c1.h hVar = this.f38044F;
        if (hVar != null) {
            c4666a = hVar.b(matrix, i);
        }
        this.f38042D.h(canvas, matrix, i, c4666a);
    }

    @Override // h1.AbstractC4563a
    public final C4586c l() {
        C4586c c4586c = this.f37989p.f38039w;
        return c4586c != null ? c4586c : this.f38043E.f37989p.f38039w;
    }

    @Override // h1.AbstractC4563a
    public final void p(e1.e eVar, int i, ArrayList arrayList, e1.e eVar2) {
        this.f38042D.c(eVar, i, arrayList, eVar2);
    }
}
