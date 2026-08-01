package f1;

import C2.N;
import d1.C4443a;
import d1.C4444b;
import java.util.List;
import java.util.Locale;
import u.AbstractC5049e;

/* renamed from: f1.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4501d {

    /* renamed from: a, reason: collision with root package name */
    public final List f37394a;

    /* renamed from: b, reason: collision with root package name */
    public final X0.i f37395b;

    /* renamed from: c, reason: collision with root package name */
    public final String f37396c;

    /* renamed from: d, reason: collision with root package name */
    public final long f37397d;

    /* renamed from: e, reason: collision with root package name */
    public final int f37398e;

    /* renamed from: f, reason: collision with root package name */
    public final long f37399f;

    /* renamed from: g, reason: collision with root package name */
    public final String f37400g;

    /* renamed from: h, reason: collision with root package name */
    public final List f37401h;
    public final d1.e i;

    /* renamed from: j, reason: collision with root package name */
    public final int f37402j;

    /* renamed from: k, reason: collision with root package name */
    public final int f37403k;

    /* renamed from: l, reason: collision with root package name */
    public final int f37404l;

    /* renamed from: m, reason: collision with root package name */
    public final float f37405m;

    /* renamed from: n, reason: collision with root package name */
    public final float f37406n;

    /* renamed from: o, reason: collision with root package name */
    public final float f37407o;

    /* renamed from: p, reason: collision with root package name */
    public final float f37408p;

    /* renamed from: q, reason: collision with root package name */
    public final C4443a f37409q;

    /* renamed from: r, reason: collision with root package name */
    public final S0.e f37410r;

    /* renamed from: s, reason: collision with root package name */
    public final C4444b f37411s;

    /* renamed from: t, reason: collision with root package name */
    public final List f37412t;

    /* renamed from: u, reason: collision with root package name */
    public final int f37413u;

    /* renamed from: v, reason: collision with root package name */
    public final boolean f37414v;

    /* renamed from: w, reason: collision with root package name */
    public final F1.a f37415w;

    /* renamed from: x, reason: collision with root package name */
    public final N f37416x;

    /* renamed from: y, reason: collision with root package name */
    public final int f37417y;

    public C4501d(List list, X0.i iVar, String str, long j6, int i, long j9, String str2, List list2, d1.e eVar, int i6, int i9, int i10, float f3, float f9, float f10, float f11, C4443a c4443a, S0.e eVar2, List list3, int i11, C4444b c4444b, boolean z3, F1.a aVar, N n9, int i12) {
        this.f37394a = list;
        this.f37395b = iVar;
        this.f37396c = str;
        this.f37397d = j6;
        this.f37398e = i;
        this.f37399f = j9;
        this.f37400g = str2;
        this.f37401h = list2;
        this.i = eVar;
        this.f37402j = i6;
        this.f37403k = i9;
        this.f37404l = i10;
        this.f37405m = f3;
        this.f37406n = f9;
        this.f37407o = f10;
        this.f37408p = f11;
        this.f37409q = c4443a;
        this.f37410r = eVar2;
        this.f37412t = list3;
        this.f37413u = i11;
        this.f37411s = c4444b;
        this.f37414v = z3;
        this.f37415w = aVar;
        this.f37416x = n9;
        this.f37417y = i12;
    }

    public final String a(String str) {
        int i;
        StringBuilder b9 = AbstractC5049e.b(str);
        b9.append(this.f37396c);
        b9.append("\n");
        X0.i iVar = this.f37395b;
        C4501d c4501d = (C4501d) iVar.i.j(this.f37399f, null);
        if (c4501d != null) {
            b9.append("\t\tParents: ");
            b9.append(c4501d.f37396c);
            for (C4501d c4501d2 = (C4501d) iVar.i.j(c4501d.f37399f, null); c4501d2 != null; c4501d2 = (C4501d) iVar.i.j(c4501d2.f37399f, null)) {
                b9.append("->");
                b9.append(c4501d2.f37396c);
            }
            b9.append(str);
            b9.append("\n");
        }
        List list = this.f37401h;
        if (!list.isEmpty()) {
            b9.append(str);
            b9.append("\tMasks: ");
            b9.append(list.size());
            b9.append("\n");
        }
        int i6 = this.f37402j;
        if (i6 != 0 && (i = this.f37403k) != 0) {
            b9.append(str);
            b9.append("\tBackground: ");
            b9.append(String.format(Locale.US, "%dx%d %X\n", Integer.valueOf(i6), Integer.valueOf(i), Integer.valueOf(this.f37404l)));
        }
        List list2 = this.f37394a;
        if (!list2.isEmpty()) {
            b9.append(str);
            b9.append("\tShapes:\n");
            for (Object obj : list2) {
                b9.append(str);
                b9.append("\t\t");
                b9.append(obj);
                b9.append("\n");
            }
        }
        return b9.toString();
    }

    public final String toString() {
        return a("");
    }
}
