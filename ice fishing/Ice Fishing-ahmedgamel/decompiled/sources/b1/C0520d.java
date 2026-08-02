package b1;

import Z0.v;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import c1.InterfaceC0541a;
import com.google.android.gms.internal.ads.LP;
import h1.AbstractC4563a;
import java.util.ArrayList;
import java.util.List;
import l1.C4666a;

/* renamed from: b1.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0520d implements InterfaceC0521e, m, InterfaceC0541a, e1.f {

    /* renamed from: a, reason: collision with root package name */
    public final I1.a f5389a;

    /* renamed from: b, reason: collision with root package name */
    public final RectF f5390b;

    /* renamed from: c, reason: collision with root package name */
    public final l1.h f5391c;

    /* renamed from: d, reason: collision with root package name */
    public final Matrix f5392d;

    /* renamed from: e, reason: collision with root package name */
    public final Path f5393e;

    /* renamed from: f, reason: collision with root package name */
    public final RectF f5394f;

    /* renamed from: g, reason: collision with root package name */
    public final String f5395g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f5396h;
    public final ArrayList i;

    /* renamed from: j, reason: collision with root package name */
    public final v f5397j;

    /* renamed from: k, reason: collision with root package name */
    public ArrayList f5398k;

    /* renamed from: l, reason: collision with root package name */
    public final c1.r f5399l;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C0520d(v vVar, AbstractC4563a abstractC4563a, g1.m mVar, Z0.i iVar) {
        this(vVar, abstractC4563a, r3, mVar.f37641c, r5, r11);
        f1.d dVar;
        String str = mVar.f37639a;
        List list = mVar.f37640b;
        ArrayList arrayList = new ArrayList(list.size());
        int i = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            InterfaceC0519c a9 = ((g1.b) list.get(i4)).a(vVar, iVar, abstractC4563a);
            if (a9 != null) {
                arrayList.add(a9);
            }
        }
        while (true) {
            if (i >= list.size()) {
                dVar = null;
                break;
            }
            g1.b bVar = (g1.b) list.get(i);
            if (bVar instanceof f1.d) {
                dVar = (f1.d) bVar;
                break;
            }
            i++;
        }
    }

    @Override // c1.InterfaceC0541a
    public final void a() {
        this.f5397j.invalidateSelf();
    }

    @Override // b1.InterfaceC0519c
    public final void b(List list, List list2) {
        int size = list.size();
        ArrayList arrayList = this.i;
        ArrayList arrayList2 = new ArrayList(arrayList.size() + size);
        arrayList2.addAll(list);
        for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
            InterfaceC0519c interfaceC0519c = (InterfaceC0519c) arrayList.get(size2);
            interfaceC0519c.b(arrayList2, arrayList.subList(0, size2));
            arrayList2.add(interfaceC0519c);
        }
    }

    @Override // e1.f
    public final void c(e1.e eVar, int i, ArrayList arrayList, e1.e eVar2) {
        String str = this.f5395g;
        if (!eVar.c(i, str) && !"__container".equals(str)) {
            return;
        }
        if (!"__container".equals(str)) {
            e1.e eVar3 = new e1.e(eVar2);
            eVar3.f37237a.add(str);
            if (eVar.a(i, str)) {
                e1.e eVar4 = new e1.e(eVar3);
                eVar4.f37238b = this;
                arrayList.add(eVar4);
            }
            eVar2 = eVar3;
        }
        if (!eVar.d(i, str)) {
            return;
        }
        int b9 = eVar.b(i, str) + i;
        int i4 = 0;
        while (true) {
            ArrayList arrayList2 = this.i;
            if (i4 >= arrayList2.size()) {
                return;
            }
            InterfaceC0519c interfaceC0519c = (InterfaceC0519c) arrayList2.get(i4);
            if (interfaceC0519c instanceof e1.f) {
                ((e1.f) interfaceC0519c).c(eVar, b9, arrayList, eVar2);
            }
            i4++;
        }
    }

    @Override // e1.f
    public final void d(ColorFilter colorFilter, LP lp) {
        c1.r rVar = this.f5399l;
        if (rVar != null) {
            rVar.c(colorFilter, lp);
        }
    }

    @Override // b1.InterfaceC0521e
    public final void e(RectF rectF, Matrix matrix, boolean z6) {
        Matrix matrix2 = this.f5392d;
        matrix2.set(matrix);
        c1.r rVar = this.f5399l;
        if (rVar != null) {
            matrix2.preConcat(rVar.e());
        }
        RectF rectF2 = this.f5394f;
        rectF2.set(0.0f, 0.0f, 0.0f, 0.0f);
        ArrayList arrayList = this.i;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            InterfaceC0519c interfaceC0519c = (InterfaceC0519c) arrayList.get(size);
            if (interfaceC0519c instanceof InterfaceC0521e) {
                ((InterfaceC0521e) interfaceC0519c).e(rectF2, matrix2, z6);
                rectF.union(rectF2);
            }
        }
    }

    public final List f() {
        if (this.f5398k == null) {
            this.f5398k = new ArrayList();
            int i = 0;
            while (true) {
                ArrayList arrayList = this.i;
                if (i >= arrayList.size()) {
                    break;
                }
                InterfaceC0519c interfaceC0519c = (InterfaceC0519c) arrayList.get(i);
                if (interfaceC0519c instanceof m) {
                    this.f5398k.add((m) interfaceC0519c);
                }
                i++;
            }
        }
        return this.f5398k;
    }

    @Override // b1.m
    public final Path g() {
        Matrix matrix = this.f5392d;
        matrix.reset();
        c1.r rVar = this.f5399l;
        if (rVar != null) {
            matrix.set(rVar.e());
        }
        Path path = this.f5393e;
        path.reset();
        if (!this.f5396h) {
            ArrayList arrayList = this.i;
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                InterfaceC0519c interfaceC0519c = (InterfaceC0519c) arrayList.get(size);
                if (interfaceC0519c instanceof m) {
                    path.addPath(((m) interfaceC0519c).g(), matrix);
                }
            }
        }
        return path;
    }

    @Override // b1.InterfaceC0519c
    public final String getName() {
        throw null;
    }

    @Override // b1.InterfaceC0521e
    public final void h(Canvas canvas, Matrix matrix, int i, C4666a c4666a) {
        if (this.f5396h) {
            return;
        }
        Matrix matrix2 = this.f5392d;
        matrix2.set(matrix);
        c1.r rVar = this.f5399l;
        if (rVar != null) {
            matrix2.preConcat(rVar.e());
            i = (int) (((((rVar.f5700p == null ? 100 : ((Integer) r1.e()).intValue()) / 100.0f) * i) / 255.0f) * 255.0f);
        }
        v vVar = this.f5397j;
        boolean z6 = vVar.f4028L;
        int i4 = com.anythink.basead.exoplayer.k.p.f9259b;
        boolean z9 = (z6 && i() && i != 255) || (c4666a != null && vVar.f4029M && i());
        if (!z9) {
            i4 = i;
        }
        l1.h hVar = this.f5391c;
        if (z9) {
            RectF rectF = this.f5390b;
            rectF.set(0.0f, 0.0f, 0.0f, 0.0f);
            e(rectF, matrix, true);
            I1.a aVar = this.f5389a;
            aVar.f1303u = i;
            if (c4666a != null) {
                if (Color.alpha(c4666a.f38811d) > 0) {
                    aVar.f1304v = c4666a;
                } else {
                    aVar.f1304v = null;
                }
                c4666a = null;
            } else {
                aVar.f1304v = null;
            }
            canvas = hVar.e(canvas, rectF, aVar);
        } else if (c4666a != null) {
            C4666a c4666a2 = new C4666a(c4666a);
            c4666a2.b(i4);
            c4666a = c4666a2;
        }
        ArrayList arrayList = this.i;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            Object obj = arrayList.get(size);
            if (obj instanceof InterfaceC0521e) {
                ((InterfaceC0521e) obj).h(canvas, matrix2, i4, c4666a);
            }
        }
        if (z9) {
            hVar.c();
        }
    }

    public final boolean i() {
        int i = 0;
        int i4 = 0;
        while (true) {
            ArrayList arrayList = this.i;
            if (i >= arrayList.size()) {
                return false;
            }
            if ((arrayList.get(i) instanceof InterfaceC0521e) && (i4 = i4 + 1) >= 2) {
                return true;
            }
            i++;
        }
    }

    public C0520d(v vVar, AbstractC4563a abstractC4563a, String str, boolean z6, ArrayList arrayList, f1.d dVar) {
        this.f5389a = new I1.a((byte) 0, 16);
        this.f5390b = new RectF();
        this.f5391c = new l1.h();
        this.f5392d = new Matrix();
        this.f5393e = new Path();
        this.f5394f = new RectF();
        this.f5395g = str;
        this.f5397j = vVar;
        this.f5396h = z6;
        this.i = arrayList;
        if (dVar != null) {
            c1.r rVar = new c1.r(dVar);
            this.f5399l = rVar;
            rVar.a(abstractC4563a);
            rVar.b(this);
        }
        ArrayList arrayList2 = new ArrayList();
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            InterfaceC0519c interfaceC0519c = (InterfaceC0519c) arrayList.get(size);
            if (interfaceC0519c instanceof j) {
                arrayList2.add((j) interfaceC0519c);
            }
        }
        for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
            ((j) arrayList2.get(size2)).f(arrayList.listIterator(arrayList.size()));
        }
    }
}
