package Z0;

import X0.v;
import X0.z;
import a1.InterfaceC0424a;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import com.google.android.gms.internal.ads.C2991bm;
import d1.C4444b;
import f1.AbstractC4498a;
import j1.AbstractC4603g;
import j1.C4597a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

/* loaded from: classes.dex */
public final class p implements e, m, j, InterfaceC0424a, k {

    /* renamed from: a, reason: collision with root package name */
    public final Matrix f4092a = new Matrix();

    /* renamed from: b, reason: collision with root package name */
    public final Path f4093b = new Path();

    /* renamed from: c, reason: collision with root package name */
    public final v f4094c;

    /* renamed from: d, reason: collision with root package name */
    public final AbstractC4498a f4095d;

    /* renamed from: e, reason: collision with root package name */
    public final String f4096e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f4097f;

    /* renamed from: g, reason: collision with root package name */
    public final a1.i f4098g;

    /* renamed from: h, reason: collision with root package name */
    public final a1.i f4099h;
    public final a1.r i;

    /* renamed from: j, reason: collision with root package name */
    public d f4100j;

    public p(v vVar, AbstractC4498a abstractC4498a, e1.i iVar) {
        this.f4094c = vVar;
        this.f4095d = abstractC4498a;
        this.f4096e = iVar.f37148b;
        this.f4097f = iVar.f37150d;
        a1.i a9 = iVar.f37149c.a();
        this.f4098g = a9;
        abstractC4498a.d(a9);
        a9.a(this);
        a1.i a10 = ((C4444b) iVar.f37151e).a();
        this.f4099h = a10;
        abstractC4498a.d(a10);
        a10.a(this);
        d1.e eVar = (d1.e) iVar.f37152f;
        eVar.getClass();
        a1.r rVar = new a1.r(eVar);
        this.i = rVar;
        rVar.a(abstractC4498a);
        rVar.b(this);
    }

    @Override // a1.InterfaceC0424a
    public final void a() {
        this.f4094c.invalidateSelf();
    }

    @Override // Z0.c
    public final void b(List list, List list2) {
        this.f4100j.b(list, list2);
    }

    @Override // Z0.e
    public final void c(RectF rectF, Matrix matrix, boolean z3) {
        this.f4100j.c(rectF, matrix, z3);
    }

    @Override // Z0.j
    public final void d(ListIterator listIterator) {
        if (this.f4100j != null) {
            return;
        }
        while (listIterator.hasPrevious() && listIterator.previous() != this) {
        }
        ArrayList arrayList = new ArrayList();
        while (listIterator.hasPrevious()) {
            arrayList.add((c) listIterator.previous());
            listIterator.remove();
        }
        Collections.reverse(arrayList);
        this.f4100j = new d(this.f4094c, this.f4095d, "Repeater", this.f4097f, arrayList, null);
    }

    @Override // c1.f
    public final void e(c1.e eVar, int i, ArrayList arrayList, c1.e eVar2) {
        AbstractC4603g.g(eVar, i, arrayList, eVar2, this);
        for (int i6 = 0; i6 < this.f4100j.i.size(); i6++) {
            c cVar = (c) this.f4100j.i.get(i6);
            if (cVar instanceof k) {
                AbstractC4603g.g(eVar, i, arrayList, eVar2, (k) cVar);
            }
        }
    }

    @Override // Z0.m
    public final Path f() {
        Path f3 = this.f4100j.f();
        Path path = this.f4093b;
        path.reset();
        float floatValue = ((Float) this.f4098g.e()).floatValue();
        float floatValue2 = ((Float) this.f4099h.e()).floatValue();
        for (int i = ((int) floatValue) - 1; i >= 0; i--) {
            Matrix matrix = this.f4092a;
            matrix.set(this.i.f(i + floatValue2));
            path.addPath(f3, matrix);
        }
        return path;
    }

    @Override // Z0.e
    public final void g(Canvas canvas, Matrix matrix, int i, C4597a c4597a) {
        float floatValue = ((Float) this.f4098g.e()).floatValue();
        float floatValue2 = ((Float) this.f4099h.e()).floatValue();
        a1.r rVar = this.i;
        float floatValue3 = ((Float) rVar.f4311v.e()).floatValue() / 100.0f;
        float floatValue4 = ((Float) rVar.f4312w.e()).floatValue() / 100.0f;
        for (int i6 = ((int) floatValue) - 1; i6 >= 0; i6--) {
            Matrix matrix2 = this.f4092a;
            matrix2.set(matrix);
            float f3 = i6;
            matrix2.preConcat(rVar.f(f3 + floatValue2));
            this.f4100j.g(canvas, matrix2, (int) (AbstractC4603g.f(floatValue3, floatValue4, f3 / floatValue) * i), c4597a);
        }
    }

    @Override // Z0.c
    public final String getName() {
        return this.f4096e;
    }

    @Override // c1.f
    public final void h(ColorFilter colorFilter, C2991bm c2991bm) {
        if (this.i.c(colorFilter, c2991bm)) {
            return;
        }
        if (colorFilter == z.f3746s) {
            this.f4098g.j(c2991bm);
        } else if (colorFilter == z.f3747t) {
            this.f4099h.j(c2991bm);
        }
    }
}
