package o2;

import android.graphics.Paint;
import android.graphics.Shader;
import android.text.TextPaint;
import androidx.lifecycle.n0;
import f1.d0;
import f1.f0;
import f1.n;
import f1.q;
import l6.l;
import m0.i0;
import m0.z;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class e extends TextPaint {

    /* renamed from: a, reason: collision with root package name */
    public l f5165a;

    /* renamed from: b, reason: collision with root package name */
    public r2.l f5166b;

    /* renamed from: c, reason: collision with root package name */
    public int f5167c;

    /* renamed from: d, reason: collision with root package name */
    public f0 f5168d;

    /* renamed from: e, reason: collision with root package name */
    public q f5169e;

    /* renamed from: f, reason: collision with root package name */
    public d0 f5170f;

    /* renamed from: g, reason: collision with root package name */
    public i0 f5171g;

    /* renamed from: h, reason: collision with root package name */
    public e1.e f5172h;

    /* renamed from: i, reason: collision with root package name */
    public h1.c f5173i;

    public final l a() {
        l lVar = this.f5165a;
        if (lVar != null) {
            return lVar;
        }
        l lVar2 = new l(this);
        this.f5165a = lVar2;
        return lVar2;
    }

    public final void b(int i10) {
        if (i10 == this.f5167c) {
            return;
        }
        a().e(i10);
        this.f5167c = i10;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0036, code lost:
    
        if ((r1 == null ? false : e1.e.a(r1.f1943a, r7)) == false) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c(d0 d0Var, long j3, float f10) {
        if (d0Var == null) {
            this.f5171g = null;
            this.f5170f = null;
            this.f5172h = null;
            setShader(null);
            return;
        }
        if (d0Var instanceof f1.i0) {
            d(i7.b.A(((f1.i0) d0Var).f2264e, f10));
            return;
        }
        if (!(d0Var instanceof n)) {
            throw new ac.d();
        }
        if (pc.j.a(this.f5170f, d0Var)) {
            e1.e eVar = this.f5172h;
        }
        if (j3 != 9205357640488583168L) {
            this.f5170f = d0Var;
            this.f5172h = new e1.e(j3);
            this.f5171g = z.n(new n0(d0Var, j3));
        }
        l a6 = a();
        i0 i0Var = this.f5171g;
        a6.h(i0Var != null ? (Shader) i0Var.getValue() : null);
        this.f5169e = null;
        j.a(this, f10);
    }

    public final void d(long j3) {
        q qVar = this.f5169e;
        if (qVar == null ? false : q.c(qVar.f2285a, j3)) {
            return;
        }
        if (j3 != 16) {
            this.f5169e = new q(j3);
            setColor(d0.s(j3));
            this.f5171g = null;
            this.f5170f = null;
            this.f5172h = null;
            setShader(null);
        }
    }

    public final void e(h1.c cVar) {
        if (cVar == null || pc.j.a(this.f5173i, cVar)) {
            return;
        }
        this.f5173i = cVar;
        if (cVar.equals(h1.f.f2601b)) {
            setStyle(Paint.Style.FILL);
            return;
        }
        if (!(cVar instanceof h1.g)) {
            throw new ac.d();
        }
        a().k(1);
        l a6 = a();
        h1.g gVar = (h1.g) cVar;
        ((Paint) a6.f4199b).setStrokeWidth(gVar.f2602b);
        l a8 = a();
        ((Paint) a8.f4199b).setStrokeMiter(gVar.f2603c);
        a().j(gVar.f2605e);
        a().i(gVar.f2604d);
        ((Paint) a().f4199b).setPathEffect(null);
    }

    public final void f(f0 f0Var) {
        if (f0Var == null || pc.j.a(this.f5168d, f0Var)) {
            return;
        }
        this.f5168d = f0Var;
        if (f0Var.equals(f0.f2248d)) {
            clearShadowLayer();
            return;
        }
        f0 f0Var2 = this.f5168d;
        float f10 = f0Var2.f2251c;
        if (f10 == 0.0f) {
            f10 = Float.MIN_VALUE;
        }
        setShadowLayer(f10, Float.intBitsToFloat((int) (f0Var2.f2250b >> 32)), Float.intBitsToFloat((int) (this.f5168d.f2250b & 4294967295L)), d0.s(this.f5168d.f2249a));
    }

    public final void g(r2.l lVar) {
        if (lVar == null || pc.j.a(this.f5166b, lVar)) {
            return;
        }
        this.f5166b = lVar;
        int i10 = lVar.f6034a;
        setUnderlineText((i10 | 1) == i10);
        int i11 = this.f5166b.f6034a;
        setStrikeThruText((i11 | 2) == i11);
    }
}
