package Z0;

import X0.v;
import a1.InterfaceC0424a;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import com.google.android.gms.internal.ads.C2991bm;
import f1.AbstractC4498a;
import j1.C4597a;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class d implements e, m, InterfaceC0424a, c1.f {

    /* renamed from: a, reason: collision with root package name */
    public final G1.a f4000a;

    /* renamed from: b, reason: collision with root package name */
    public final RectF f4001b;

    /* renamed from: c, reason: collision with root package name */
    public final j1.i f4002c;

    /* renamed from: d, reason: collision with root package name */
    public final Matrix f4003d;

    /* renamed from: e, reason: collision with root package name */
    public final Path f4004e;

    /* renamed from: f, reason: collision with root package name */
    public final RectF f4005f;

    /* renamed from: g, reason: collision with root package name */
    public final String f4006g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f4007h;
    public final ArrayList i;

    /* renamed from: j, reason: collision with root package name */
    public final v f4008j;

    /* renamed from: k, reason: collision with root package name */
    public ArrayList f4009k;

    /* renamed from: l, reason: collision with root package name */
    public final a1.r f4010l;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public d(v vVar, AbstractC4498a abstractC4498a, e1.m mVar, X0.i iVar) {
        this(vVar, abstractC4498a, r3, mVar.f37165c, r5, r11);
        d1.e eVar;
        String str = mVar.f37163a;
        List list = mVar.f37164b;
        ArrayList arrayList = new ArrayList(list.size());
        int i = 0;
        for (int i6 = 0; i6 < list.size(); i6++) {
            c a9 = ((e1.b) list.get(i6)).a(vVar, iVar, abstractC4498a);
            if (a9 != null) {
                arrayList.add(a9);
            }
        }
        while (true) {
            if (i >= list.size()) {
                eVar = null;
                break;
            }
            e1.b bVar = (e1.b) list.get(i);
            if (bVar instanceof d1.e) {
                eVar = (d1.e) bVar;
                break;
            }
            i++;
        }
    }

    @Override // a1.InterfaceC0424a
    public final void a() {
        this.f4008j.invalidateSelf();
    }

    @Override // Z0.c
    public final void b(List list, List list2) {
        int size = list.size();
        ArrayList arrayList = this.i;
        ArrayList arrayList2 = new ArrayList(arrayList.size() + size);
        arrayList2.addAll(list);
        for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
            c cVar = (c) arrayList.get(size2);
            cVar.b(arrayList2, arrayList.subList(0, size2));
            arrayList2.add(cVar);
        }
    }

    @Override // Z0.e
    public final void c(RectF rectF, Matrix matrix, boolean z3) {
        Matrix matrix2 = this.f4003d;
        matrix2.set(matrix);
        a1.r rVar = this.f4010l;
        if (rVar != null) {
            matrix2.preConcat(rVar.e());
        }
        RectF rectF2 = this.f4005f;
        rectF2.set(0.0f, 0.0f, 0.0f, 0.0f);
        ArrayList arrayList = this.i;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            c cVar = (c) arrayList.get(size);
            if (cVar instanceof e) {
                ((e) cVar).c(rectF2, matrix2, z3);
                rectF.union(rectF2);
            }
        }
    }

    public final List d() {
        if (this.f4009k == null) {
            this.f4009k = new ArrayList();
            int i = 0;
            while (true) {
                ArrayList arrayList = this.i;
                if (i >= arrayList.size()) {
                    break;
                }
                c cVar = (c) arrayList.get(i);
                if (cVar instanceof m) {
                    this.f4009k.add((m) cVar);
                }
                i++;
            }
        }
        return this.f4009k;
    }

    @Override // c1.f
    public final void e(c1.e eVar, int i, ArrayList arrayList, c1.e eVar2) {
        String str = this.f4006g;
        if (!eVar.c(i, str) && !"__container".equals(str)) {
            return;
        }
        if (!"__container".equals(str)) {
            c1.e eVar3 = new c1.e(eVar2);
            eVar3.f5519a.add(str);
            if (eVar.a(i, str)) {
                c1.e eVar4 = new c1.e(eVar3);
                eVar4.f5520b = this;
                arrayList.add(eVar4);
            }
            eVar2 = eVar3;
        }
        if (!eVar.d(i, str)) {
            return;
        }
        int b9 = eVar.b(i, str) + i;
        int i6 = 0;
        while (true) {
            ArrayList arrayList2 = this.i;
            if (i6 >= arrayList2.size()) {
                return;
            }
            c cVar = (c) arrayList2.get(i6);
            if (cVar instanceof c1.f) {
                ((c1.f) cVar).e(eVar, b9, arrayList, eVar2);
            }
            i6++;
        }
    }

    @Override // Z0.m
    public final Path f() {
        Matrix matrix = this.f4003d;
        matrix.reset();
        a1.r rVar = this.f4010l;
        if (rVar != null) {
            matrix.set(rVar.e());
        }
        Path path = this.f4004e;
        path.reset();
        if (!this.f4007h) {
            ArrayList arrayList = this.i;
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                c cVar = (c) arrayList.get(size);
                if (cVar instanceof m) {
                    path.addPath(((m) cVar).f(), matrix);
                }
            }
        }
        return path;
    }

    @Override // Z0.e
    public final void g(Canvas canvas, Matrix matrix, int i, C4597a c4597a) {
        if (this.f4007h) {
            return;
        }
        Matrix matrix2 = this.f4003d;
        matrix2.set(matrix);
        a1.r rVar = this.f4010l;
        if (rVar != null) {
            matrix2.preConcat(rVar.e());
            i = (int) (((((rVar.f4305p == null ? 100 : ((Integer) r1.e()).intValue()) / 100.0f) * i) / 255.0f) * 255.0f);
        }
        v vVar = this.f4008j;
        boolean z3 = vVar.f3676L;
        int i6 = com.anythink.basead.exoplayer.k.p.f8473b;
        boolean z6 = (z3 && i() && i != 255) || (c4597a != null && vVar.f3677M && i());
        if (!z6) {
            i6 = i;
        }
        j1.i iVar = this.f4002c;
        if (z6) {
            RectF rectF = this.f4001b;
            rectF.set(0.0f, 0.0f, 0.0f, 0.0f);
            c(rectF, matrix, true);
            G1.a aVar = this.f4000a;
            aVar.f1050u = i;
            if (c4597a != null) {
                if (Color.alpha(c4597a.f38299d) > 0) {
                    aVar.f1051v = c4597a;
                } else {
                    aVar.f1051v = null;
                }
                c4597a = null;
            } else {
                aVar.f1051v = null;
            }
            canvas = iVar.e(canvas, rectF, aVar);
        } else if (c4597a != null) {
            C4597a c4597a2 = new C4597a(c4597a);
            c4597a2.b(i6);
            c4597a = c4597a2;
        }
        ArrayList arrayList = this.i;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            Object obj = arrayList.get(size);
            if (obj instanceof e) {
                ((e) obj).g(canvas, matrix2, i6, c4597a);
            }
        }
        if (z6) {
            iVar.c();
        }
    }

    @Override // Z0.c
    public final String getName() {
        throw null;
    }

    @Override // c1.f
    public final void h(ColorFilter colorFilter, C2991bm c2991bm) {
        a1.r rVar = this.f4010l;
        if (rVar != null) {
            rVar.c(colorFilter, c2991bm);
        }
    }

    public final boolean i() {
        int i = 0;
        int i6 = 0;
        while (true) {
            ArrayList arrayList = this.i;
            if (i >= arrayList.size()) {
                return false;
            }
            if ((arrayList.get(i) instanceof e) && (i6 = i6 + 1) >= 2) {
                return true;
            }
            i++;
        }
    }

    public d(v vVar, AbstractC4498a abstractC4498a, String str, boolean z3, ArrayList arrayList, d1.e eVar) {
        this.f4000a = new G1.a((byte) 0, 16);
        this.f4001b = new RectF();
        this.f4002c = new j1.i();
        this.f4003d = new Matrix();
        this.f4004e = new Path();
        this.f4005f = new RectF();
        this.f4006g = str;
        this.f4008j = vVar;
        this.f4007h = z3;
        this.i = arrayList;
        if (eVar != null) {
            a1.r rVar = new a1.r(eVar);
            this.f4010l = rVar;
            rVar.a(abstractC4498a);
            rVar.b(this);
        }
        ArrayList arrayList2 = new ArrayList();
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            c cVar = (c) arrayList.get(size);
            if (cVar instanceof j) {
                arrayList2.add((j) cVar);
            }
        }
        for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
            ((j) arrayList2.get(size2)).d(arrayList.listIterator(arrayList.size()));
        }
    }
}
