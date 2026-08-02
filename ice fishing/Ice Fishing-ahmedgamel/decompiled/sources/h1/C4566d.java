package h1;

import E2.M;
import com.google.android.gms.internal.ads.WP;
import f1.C4515a;
import f1.C4516b;
import i1.C4586c;
import java.util.List;
import java.util.Locale;
import u.AbstractC5050e;

/* renamed from: h1.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4566d {

    /* renamed from: a, reason: collision with root package name */
    public final List f38018a;

    /* renamed from: b, reason: collision with root package name */
    public final Z0.i f38019b;

    /* renamed from: c, reason: collision with root package name */
    public final String f38020c;

    /* renamed from: d, reason: collision with root package name */
    public final long f38021d;

    /* renamed from: e, reason: collision with root package name */
    public final int f38022e;

    /* renamed from: f, reason: collision with root package name */
    public final long f38023f;

    /* renamed from: g, reason: collision with root package name */
    public final String f38024g;

    /* renamed from: h, reason: collision with root package name */
    public final List f38025h;
    public final f1.d i;

    /* renamed from: j, reason: collision with root package name */
    public final int f38026j;

    /* renamed from: k, reason: collision with root package name */
    public final int f38027k;

    /* renamed from: l, reason: collision with root package name */
    public final int f38028l;

    /* renamed from: m, reason: collision with root package name */
    public final float f38029m;

    /* renamed from: n, reason: collision with root package name */
    public final float f38030n;

    /* renamed from: o, reason: collision with root package name */
    public final float f38031o;

    /* renamed from: p, reason: collision with root package name */
    public final float f38032p;

    /* renamed from: q, reason: collision with root package name */
    public final C4515a f38033q;

    /* renamed from: r, reason: collision with root package name */
    public final WP f38034r;

    /* renamed from: s, reason: collision with root package name */
    public final C4516b f38035s;

    /* renamed from: t, reason: collision with root package name */
    public final List f38036t;

    /* renamed from: u, reason: collision with root package name */
    public final int f38037u;

    /* renamed from: v, reason: collision with root package name */
    public final boolean f38038v;

    /* renamed from: w, reason: collision with root package name */
    public final C4586c f38039w;

    /* renamed from: x, reason: collision with root package name */
    public final M f38040x;

    /* renamed from: y, reason: collision with root package name */
    public final int f38041y;

    public C4566d(List list, Z0.i iVar, String str, long j6, int i, long j9, String str2, List list2, f1.d dVar, int i4, int i6, int i9, float f2, float f9, float f10, float f11, C4515a c4515a, WP wp, List list3, int i10, C4516b c4516b, boolean z6, C4586c c4586c, M m9, int i11) {
        this.f38018a = list;
        this.f38019b = iVar;
        this.f38020c = str;
        this.f38021d = j6;
        this.f38022e = i;
        this.f38023f = j9;
        this.f38024g = str2;
        this.f38025h = list2;
        this.i = dVar;
        this.f38026j = i4;
        this.f38027k = i6;
        this.f38028l = i9;
        this.f38029m = f2;
        this.f38030n = f9;
        this.f38031o = f10;
        this.f38032p = f11;
        this.f38033q = c4515a;
        this.f38034r = wp;
        this.f38036t = list3;
        this.f38037u = i10;
        this.f38035s = c4516b;
        this.f38038v = z6;
        this.f38039w = c4586c;
        this.f38040x = m9;
        this.f38041y = i11;
    }

    public final String a(String str) {
        int i;
        StringBuilder b9 = AbstractC5050e.b(str);
        b9.append(this.f38020c);
        b9.append("\n");
        Z0.i iVar = this.f38019b;
        C4566d c4566d = (C4566d) iVar.i.j(this.f38023f, null);
        if (c4566d != null) {
            b9.append("\t\tParents: ");
            b9.append(c4566d.f38020c);
            for (C4566d c4566d2 = (C4566d) iVar.i.j(c4566d.f38023f, null); c4566d2 != null; c4566d2 = (C4566d) iVar.i.j(c4566d2.f38023f, null)) {
                b9.append("->");
                b9.append(c4566d2.f38020c);
            }
            b9.append(str);
            b9.append("\n");
        }
        List list = this.f38025h;
        if (!list.isEmpty()) {
            b9.append(str);
            b9.append("\tMasks: ");
            b9.append(list.size());
            b9.append("\n");
        }
        int i4 = this.f38026j;
        if (i4 != 0 && (i = this.f38027k) != 0) {
            b9.append(str);
            b9.append("\tBackground: ");
            b9.append(String.format(Locale.US, "%dx%d %X\n", Integer.valueOf(i4), Integer.valueOf(i), Integer.valueOf(this.f38028l)));
        }
        List list2 = this.f38018a;
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
