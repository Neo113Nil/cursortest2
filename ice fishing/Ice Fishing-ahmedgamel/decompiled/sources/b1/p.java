package b1;

import Z0.v;
import Z0.z;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import c1.InterfaceC0541a;
import com.google.android.gms.internal.ads.LP;
import f1.C4516b;
import h1.AbstractC4563a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;
import l1.AbstractC4672g;
import l1.C4666a;

/* loaded from: classes.dex */
public final class p implements InterfaceC0521e, m, j, InterfaceC0541a, k {

    /* renamed from: a, reason: collision with root package name */
    public final Matrix f5481a = new Matrix();

    /* renamed from: b, reason: collision with root package name */
    public final Path f5482b = new Path();

    /* renamed from: c, reason: collision with root package name */
    public final v f5483c;

    /* renamed from: d, reason: collision with root package name */
    public final AbstractC4563a f5484d;

    /* renamed from: e, reason: collision with root package name */
    public final String f5485e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f5486f;

    /* renamed from: g, reason: collision with root package name */
    public final c1.i f5487g;

    /* renamed from: h, reason: collision with root package name */
    public final c1.i f5488h;
    public final c1.r i;

    /* renamed from: j, reason: collision with root package name */
    public C0520d f5489j;

    public p(v vVar, AbstractC4563a abstractC4563a, g1.i iVar) {
        this.f5483c = vVar;
        this.f5484d = abstractC4563a;
        this.f5485e = iVar.f37624b;
        this.f5486f = iVar.f37626d;
        c1.i a9 = iVar.f37625c.a();
        this.f5487g = a9;
        abstractC4563a.f(a9);
        a9.a(this);
        c1.i a10 = ((C4516b) iVar.f37627e).a();
        this.f5488h = a10;
        abstractC4563a.f(a10);
        a10.a(this);
        f1.d dVar = (f1.d) iVar.f37628f;
        dVar.getClass();
        c1.r rVar = new c1.r(dVar);
        this.i = rVar;
        rVar.a(abstractC4563a);
        rVar.b(this);
    }

    @Override // c1.InterfaceC0541a
    public final void a() {
        this.f5483c.invalidateSelf();
    }

    @Override // b1.InterfaceC0519c
    public final void b(List list, List list2) {
        this.f5489j.b(list, list2);
    }

    @Override // e1.f
    public final void c(e1.e eVar, int i, ArrayList arrayList, e1.e eVar2) {
        AbstractC4672g.g(eVar, i, arrayList, eVar2, this);
        for (int i4 = 0; i4 < this.f5489j.i.size(); i4++) {
            InterfaceC0519c interfaceC0519c = (InterfaceC0519c) this.f5489j.i.get(i4);
            if (interfaceC0519c instanceof k) {
                AbstractC4672g.g(eVar, i, arrayList, eVar2, (k) interfaceC0519c);
            }
        }
    }

    @Override // e1.f
    public final void d(ColorFilter colorFilter, LP lp) {
        if (this.i.c(colorFilter, lp)) {
            return;
        }
        if (colorFilter == z.f4097s) {
            this.f5487g.j(lp);
        } else if (colorFilter == z.f4098t) {
            this.f5488h.j(lp);
        }
    }

    @Override // b1.InterfaceC0521e
    public final void e(RectF rectF, Matrix matrix, boolean z6) {
        this.f5489j.e(rectF, matrix, z6);
    }

    @Override // b1.j
    public final void f(ListIterator listIterator) {
        if (this.f5489j != null) {
            return;
        }
        while (listIterator.hasPrevious() && listIterator.previous() != this) {
        }
        ArrayList arrayList = new ArrayList();
        while (listIterator.hasPrevious()) {
            arrayList.add((InterfaceC0519c) listIterator.previous());
            listIterator.remove();
        }
        Collections.reverse(arrayList);
        this.f5489j = new C0520d(this.f5483c, this.f5484d, "Repeater", this.f5486f, arrayList, null);
    }

    @Override // b1.m
    public final Path g() {
        Path g9 = this.f5489j.g();
        Path path = this.f5482b;
        path.reset();
        float floatValue = ((Float) this.f5487g.e()).floatValue();
        float floatValue2 = ((Float) this.f5488h.e()).floatValue();
        for (int i = ((int) floatValue) - 1; i >= 0; i--) {
            Matrix matrix = this.f5481a;
            matrix.set(this.i.f(i + floatValue2));
            path.addPath(g9, matrix);
        }
        return path;
    }

    @Override // b1.InterfaceC0519c
    public final String getName() {
        return this.f5485e;
    }

    @Override // b1.InterfaceC0521e
    public final void h(Canvas canvas, Matrix matrix, int i, C4666a c4666a) {
        float floatValue = ((Float) this.f5487g.e()).floatValue();
        float floatValue2 = ((Float) this.f5488h.e()).floatValue();
        c1.r rVar = this.i;
        float floatValue3 = ((Float) rVar.f5706v.e()).floatValue() / 100.0f;
        float floatValue4 = ((Float) rVar.f5707w.e()).floatValue() / 100.0f;
        for (int i4 = ((int) floatValue) - 1; i4 >= 0; i4--) {
            Matrix matrix2 = this.f5481a;
            matrix2.set(matrix);
            float f2 = i4;
            matrix2.preConcat(rVar.f(f2 + floatValue2));
            this.f5489j.h(canvas, matrix2, (int) (AbstractC4672g.f(floatValue3, floatValue4, f2 / floatValue) * i), c4666a);
        }
    }
}
