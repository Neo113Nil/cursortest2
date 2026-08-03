package a1;

import ac.o;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewStructure;
import android.view.autofill.AutofillId;
import bc.m;
import d.x;
import e2.n;
import e2.q;
import e2.s;
import e2.v;
import h2.d0;
import h2.h0;
import java.util.ArrayList;
import java.util.List;
import s.g0;
import s.k;
import s.l;
import s.u;
import x1.f1;
import y1.e0;
import y1.k1;
import y1.r;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class h implements androidx.lifecycle.f, View.OnAttachStateChangeListener {

    /* renamed from: g, reason: collision with root package name */
    public final r f170g;

    /* renamed from: h, reason: collision with root package name */
    public final x f171h;

    /* renamed from: i, reason: collision with root package name */
    public x4.e f172i;

    /* renamed from: j, reason: collision with root package name */
    public final ArrayList f173j = new ArrayList();

    /* renamed from: k, reason: collision with root package name */
    public final long f174k = 100;

    /* renamed from: l, reason: collision with root package name */
    public b f175l = b.f155g;

    /* renamed from: m, reason: collision with root package name */
    public boolean f176m = true;

    /* renamed from: n, reason: collision with root package name */
    public final ad.e f177n = a.a.a(1, 6, null);

    /* renamed from: o, reason: collision with root package name */
    public final Handler f178o = new Handler(Looper.getMainLooper());

    /* renamed from: p, reason: collision with root package name */
    public u f179p;

    /* renamed from: q, reason: collision with root package name */
    public long f180q;

    /* renamed from: r, reason: collision with root package name */
    public final u f181r;

    /* renamed from: s, reason: collision with root package name */
    public k1 f182s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f183t;

    /* renamed from: u, reason: collision with root package name */
    public final a f184u;

    public h(r rVar, x xVar) {
        this.f170g = rVar;
        this.f171h = xVar;
        u uVar = l.f6301a;
        pc.j.c(uVar, "null cannot be cast to non-null type androidx.collection.IntObjectMap<V of androidx.collection.IntObjectMapKt.intObjectMapOf>");
        this.f179p = uVar;
        this.f181r = new u();
        n a6 = rVar.getSemanticsOwner().a();
        pc.j.c(uVar, "null cannot be cast to non-null type androidx.collection.IntObjectMap<V of androidx.collection.IntObjectMapKt.intObjectMapOf>");
        this.f182s = new k1(a6, uVar);
        this.f184u = new a(0, this);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x004f, code lost:
    
        if (r8 != r4) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x007d, code lost:
    
        if (yc.a0.f(r7.f174k, r0) == r4) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x007f, code lost:
    
        return r4;
     */
    /* JADX WARN: Removed duplicated region for block: B:30:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x007d -> B:11:0x0047). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(hc.c cVar) {
        e eVar;
        int i10;
        ad.b bVar;
        if (cVar instanceof e) {
            eVar = (e) cVar;
            int i11 = eVar.f164j;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                eVar.f164j = i11 - Integer.MIN_VALUE;
                Object obj = eVar.f162h;
                i10 = eVar.f164j;
                gc.a aVar = gc.a.f2559g;
                if (i10 != 0) {
                    v6.a.W(obj);
                    ad.e eVar2 = this.f177n;
                    eVar2.getClass();
                    bVar = new ad.b(eVar2);
                } else if (i10 == 1) {
                    bVar = eVar.f161g;
                    v6.a.W(obj);
                    if (!((Boolean) obj).booleanValue()) {
                        return o.f277a;
                    }
                    bVar.c();
                    if (j()) {
                        k();
                    }
                    if (!this.f183t) {
                        this.f183t = true;
                        this.f178o.post(this.f184u);
                    }
                    eVar.f161g = bVar;
                    eVar.f164j = 2;
                } else {
                    if (i10 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bVar = eVar.f161g;
                    v6.a.W(obj);
                }
                eVar.f161g = bVar;
                eVar.f164j = 1;
                obj = bVar.b(eVar);
            }
        }
        eVar = new e(this, cVar);
        Object obj2 = eVar.f162h;
        i10 = eVar.f164j;
        gc.a aVar2 = gc.a.f2559g;
        if (i10 != 0) {
        }
        eVar.f161g = bVar;
        eVar.f164j = 1;
        obj2 = bVar.b(eVar);
    }

    public final void e(k kVar) {
        int[] iArr;
        long[] jArr;
        int[] iArr2;
        long[] jArr2;
        long j3;
        char c3;
        long j6;
        int i10;
        long[] jArr3;
        long[] jArr4;
        long j10;
        long j11;
        k kVar2 = kVar;
        int[] iArr3 = kVar2.f6296b;
        long[] jArr5 = kVar2.f6295a;
        int length = jArr5.length - 2;
        if (length < 0) {
            return;
        }
        int i11 = 0;
        while (true) {
            long j12 = jArr5[i11];
            char c7 = 7;
            long j13 = -9187201950435737472L;
            if ((((~j12) << 7) & j12 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i12 = 8;
                int i13 = 8 - ((~(i11 - length)) >>> 31);
                int i14 = 0;
                while (i14 < i13) {
                    if ((j12 & 255) < 128) {
                        int i15 = iArr3[(i11 << 3) + i14];
                        c3 = c7;
                        k1 k1Var = (k1) this.f181r.b(i15);
                        e2.o oVar = (e2.o) kVar2.b(i15);
                        n nVar = oVar != null ? oVar.f2000a : null;
                        if (nVar == null) {
                            throw a4.d.e("no value for specified key");
                        }
                        j6 = j13;
                        int i16 = nVar.f1999g;
                        e2.j jVar = nVar.f1996d;
                        if (k1Var == null) {
                            g0 g0Var = jVar.f1985g;
                            Object[] objArr = g0Var.f6267b;
                            long[] jArr6 = g0Var.f6266a;
                            int length2 = jArr6.length - 2;
                            iArr2 = iArr3;
                            if (length2 >= 0) {
                                int i17 = i12;
                                int i18 = 0;
                                while (true) {
                                    long j14 = jArr6[i18];
                                    j3 = j12;
                                    if ((((~j14) << c3) & j14 & j6) != j6) {
                                        int i19 = 8 - ((~(i18 - length2)) >>> 31);
                                        for (int i20 = 0; i20 < i19; i20++) {
                                            if ((j14 & 255) < 128) {
                                                j11 = j14;
                                                v vVar = (v) objArr[(i18 << 3) + i20];
                                                v vVar2 = s.f2025a;
                                                v vVar3 = s.f2049y;
                                                if (pc.j.a(vVar, vVar3)) {
                                                    List list = (List) q.d(jVar, vVar3);
                                                    m(String.valueOf(list != null ? (h2.e) m.U(list) : null), i16);
                                                }
                                            } else {
                                                j11 = j14;
                                            }
                                            j14 = j11 >> i17;
                                        }
                                        if (i19 != i17) {
                                            break;
                                        }
                                    }
                                    if (i18 == length2) {
                                        break;
                                    }
                                    i18++;
                                    j12 = j3;
                                    i17 = 8;
                                }
                            } else {
                                j3 = j12;
                            }
                        } else {
                            iArr2 = iArr3;
                            j3 = j12;
                            g0 g0Var2 = jVar.f1985g;
                            Object[] objArr2 = g0Var2.f6267b;
                            long[] jArr7 = g0Var2.f6266a;
                            int length3 = jArr7.length - 2;
                            if (length3 >= 0) {
                                Object[] objArr3 = objArr2;
                                jArr2 = jArr5;
                                int i21 = 0;
                                while (true) {
                                    long j15 = jArr7[i21];
                                    Object[] objArr4 = objArr3;
                                    i10 = i14;
                                    if ((((~j15) << c3) & j15 & j6) != j6) {
                                        int i22 = 8 - ((~(i21 - length3)) >>> 31);
                                        int i23 = 0;
                                        while (i23 < i22) {
                                            if ((j15 & 255) < 128) {
                                                jArr4 = jArr7;
                                                v vVar4 = (v) objArr4[(i21 << 3) + i23];
                                                v vVar5 = s.f2025a;
                                                j10 = j15;
                                                v vVar6 = s.f2049y;
                                                if (pc.j.a(vVar4, vVar6)) {
                                                    List list2 = (List) q.d(k1Var.f8579a, vVar6);
                                                    h2.e eVar = list2 != null ? (h2.e) m.U(list2) : null;
                                                    List list3 = (List) q.d(jVar, vVar6);
                                                    h2.e eVar2 = list3 != null ? (h2.e) m.U(list3) : null;
                                                    if (!pc.j.a(eVar, eVar2)) {
                                                        m(String.valueOf(eVar2), i16);
                                                    }
                                                }
                                            } else {
                                                jArr4 = jArr7;
                                                j10 = j15;
                                            }
                                            j15 = j10 >> 8;
                                            i23++;
                                            jArr7 = jArr4;
                                        }
                                        jArr3 = jArr7;
                                        if (i22 != 8) {
                                            break;
                                        }
                                    } else {
                                        jArr3 = jArr7;
                                    }
                                    if (i21 == length3) {
                                        break;
                                    }
                                    i21++;
                                    i14 = i10;
                                    objArr3 = objArr4;
                                    jArr7 = jArr3;
                                }
                                j12 = j3 >> 8;
                                i14 = i10 + 1;
                                jArr5 = jArr2;
                                c7 = c3;
                                j13 = j6;
                                iArr3 = iArr2;
                                i12 = 8;
                                kVar2 = kVar;
                            }
                        }
                        jArr2 = jArr5;
                    } else {
                        iArr2 = iArr3;
                        jArr2 = jArr5;
                        j3 = j12;
                        c3 = c7;
                        j6 = j13;
                    }
                    i10 = i14;
                    j12 = j3 >> 8;
                    i14 = i10 + 1;
                    jArr5 = jArr2;
                    c7 = c3;
                    j13 = j6;
                    iArr3 = iArr2;
                    i12 = 8;
                    kVar2 = kVar;
                }
                iArr = iArr3;
                int i24 = i12;
                jArr = jArr5;
                if (i13 != i24) {
                    return;
                }
            } else {
                iArr = iArr3;
                jArr = jArr5;
            }
            if (i11 == length) {
                return;
            }
            i11++;
            kVar2 = kVar;
            jArr5 = jArr;
            iArr3 = iArr;
        }
    }

    @Override // androidx.lifecycle.f
    public final void f(androidx.lifecycle.u uVar) {
        this.f172i = (x4.e) this.f171h.invoke();
        n(-1, this.f170g.getSemanticsOwner().a());
        k();
    }

    @Override // androidx.lifecycle.f
    public final void g(androidx.lifecycle.u uVar) {
        o(this.f170g.getSemanticsOwner().a());
        k();
        this.f172i = null;
    }

    public final void h(n nVar, oc.e eVar) {
        nVar.getClass();
        List j3 = n.j(4, nVar);
        int size = j3.size();
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            Object obj = j3.get(i11);
            if (i().a(((n) obj).f1999g)) {
                eVar.invoke(Integer.valueOf(i10), obj);
                i10++;
            }
        }
    }

    public final k i() {
        if (this.f176m) {
            this.f176m = false;
            this.f179p = q.b(this.f170g.getSemanticsOwner());
            this.f180q = System.currentTimeMillis();
        }
        return this.f179p;
    }

    public final boolean j() {
        return this.f172i != null;
    }

    public final void k() {
        x4.e eVar = this.f172i;
        if (eVar == null) {
            return;
        }
        Object obj = eVar.f8294g;
        if (Build.VERSION.SDK_INT < 29) {
            return;
        }
        ArrayList arrayList = this.f173j;
        if (arrayList.isEmpty()) {
            return;
        }
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            i iVar = (i) arrayList.get(i10);
            int ordinal = iVar.f187c.ordinal();
            if (ordinal == 0) {
                f8.c cVar = iVar.f188d;
                if (cVar != null) {
                    ViewStructure viewStructure = (ViewStructure) cVar.f2340h;
                    if (Build.VERSION.SDK_INT >= 29) {
                        a2.b.d(a2.a.j(obj), viewStructure);
                    }
                }
            } else {
                if (ordinal != 1) {
                    throw new ac.d();
                }
                AutofillId g8 = eVar.g(iVar.f185a);
                if (g8 != null && Build.VERSION.SDK_INT >= 29) {
                    a2.b.e(a2.a.j(obj), g8);
                }
            }
        }
        if (Build.VERSION.SDK_INT >= 29) {
            a2.b.g(a2.a.j(obj), ((View) eVar.f8295h).getAutofillId(), new long[]{Long.MIN_VALUE});
        }
        arrayList.clear();
    }

    public final void l(n nVar, k1 k1Var) {
        h(nVar, new f(0, k1Var, this));
        List j3 = n.j(4, nVar);
        int size = j3.size();
        for (int i10 = 0; i10 < size; i10++) {
            n nVar2 = (n) j3.get(i10);
            k i11 = i();
            int i12 = nVar2.f1999g;
            if (i11.a(i12)) {
                u uVar = this.f181r;
                if (uVar.a(i12)) {
                    Object b2 = uVar.b(i12);
                    if (b2 == null) {
                        throw a4.d.e("node not present in pruned tree before this change");
                    }
                    l(nVar2, (k1) b2);
                } else {
                    continue;
                }
            }
        }
    }

    public final void m(String str, int i10) {
        x4.e eVar;
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 29 && (eVar = this.f172i) != null) {
            AutofillId g8 = eVar.g(i10);
            if (g8 == null) {
                throw a4.d.e("Invalid content capture ID");
            }
            if (i11 >= 29) {
                a2.b.f(a2.a.j(eVar.f8294g), g8, str);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x01a7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void n(int i10, n nVar) {
        oc.c cVar;
        int i11;
        e1.c cVar2;
        f8.c cVar3;
        String x10;
        oc.c cVar4;
        if (j()) {
            g0 g0Var = nVar.f1996d.f1985g;
            Object g8 = g0Var.g(s.A);
            if (g8 == null) {
                g8 = null;
            }
            Boolean bool = (Boolean) g8;
            if (this.f175l == b.f155g && pc.j.a(bool, Boolean.TRUE)) {
                Object g10 = g0Var.g(e2.i.f1970l);
                if (g10 == null) {
                    g10 = null;
                }
                e2.a aVar = (e2.a) g10;
                if (aVar != null && (cVar4 = (oc.c) aVar.f1945b) != null) {
                }
            } else if (this.f175l == b.f156h && pc.j.a(bool, Boolean.FALSE)) {
                Object g11 = g0Var.g(e2.i.f1970l);
                if (g11 == null) {
                    g11 = null;
                }
                e2.a aVar2 = (e2.a) g11;
                if (aVar2 != null && (cVar = (oc.c) aVar2.f1945b) != null) {
                }
            }
            int i12 = nVar.f1999g;
            x4.e eVar = this.f172i;
            if (eVar != null && (i11 = Build.VERSION.SDK_INT) >= 29) {
                AutofillId autofillId = this.f170g.getAutofillId();
                n l10 = nVar.l();
                int i13 = nVar.f1999g;
                if (l10 == null || (autofillId = eVar.g(l10.f1999g)) != null) {
                    f8.c cVar5 = i11 >= 29 ? new f8.c(2, a2.b.c(a2.a.j(eVar.f8294g), autofillId, i13)) : null;
                    if (cVar5 != null) {
                        ViewStructure viewStructure = (ViewStructure) cVar5.f2340h;
                        e2.j jVar = nVar.f1996d;
                        v vVar = s.G;
                        g0 g0Var2 = jVar.f1985g;
                        if (!g0Var2.c(vVar)) {
                            Bundle extras = viewStructure.getExtras();
                            if (extras != null) {
                                extras.putLong("android.view.contentcapture.EventTimestamp", this.f180q);
                                extras.putInt("android.view.ViewStructure.extra.EXTRA_VIEW_NODE_INDEX", i10);
                            }
                            Object g12 = g0Var2.g(s.f2047w);
                            if (g12 == null) {
                                g12 = null;
                            }
                            String str = (String) g12;
                            if (str != null) {
                                viewStructure.setId(i13, null, null, str);
                            }
                            Object g13 = g0Var2.g(s.f2037m);
                            if (g13 == null) {
                                g13 = null;
                            }
                            if (((Boolean) g13) != null) {
                                viewStructure.setClassName("android.widget.ViewGroup");
                            }
                            Object g14 = g0Var2.g(s.f2049y);
                            if (g14 == null) {
                                g14 = null;
                            }
                            List list = (List) g14;
                            if (list != null) {
                                viewStructure.setClassName("android.widget.TextView");
                                viewStructure.setText(u2.a.a(list, "\n", null, 62));
                            }
                            Object g15 = g0Var2.g(s.C);
                            if (g15 == null) {
                                g15 = null;
                            }
                            h2.e eVar2 = (h2.e) g15;
                            if (eVar2 != null) {
                                viewStructure.setClassName("android.widget.EditText");
                                viewStructure.setText(eVar2);
                            }
                            Object g16 = g0Var2.g(s.f2025a);
                            if (g16 == null) {
                                g16 = null;
                            }
                            List list2 = (List) g16;
                            if (list2 != null) {
                                viewStructure.setContentDescription(u2.a.a(list2, "\n", null, 62));
                            }
                            Object g17 = g0Var2.g(s.f2046v);
                            if (g17 == null) {
                                g17 = null;
                            }
                            e2.g gVar = (e2.g) g17;
                            if (gVar != null && (x10 = e0.x(gVar.f1956a)) != null) {
                                viewStructure.setClassName(x10);
                            }
                            h2.e0 q10 = e0.q(jVar);
                            if (q10 != null) {
                                d0 d0Var = q10.f2651a;
                                h0 h0Var = d0Var.f2638b;
                                s2.c cVar6 = d0Var.f2643g;
                                viewStructure.setTextStyle(cVar6.m() * cVar6.c() * s2.n.c(h0Var.f2674a.f2613b), 0, 0, 0);
                            }
                            f1 d10 = nVar.d();
                            if (d10 != null) {
                                f1 f1Var = d10.B0().f8456t ? d10 : null;
                                if (f1Var != null) {
                                    cVar2 = nVar.a(f1Var);
                                    float f10 = cVar2.f1931a;
                                    float f11 = cVar2.f1932b;
                                    viewStructure.setDimens((int) f10, (int) f11, 0, 0, (int) (cVar2.f1933c - f10), (int) (cVar2.f1934d - f11));
                                    cVar3 = cVar5;
                                    if (cVar3 != null) {
                                        this.f173j.add(new i(i12, this.f180q, j.f189g, cVar3));
                                    }
                                    h(nVar, new g(0, this));
                                }
                            }
                            cVar2 = e1.c.f1930e;
                            float f102 = cVar2.f1931a;
                            float f112 = cVar2.f1932b;
                            viewStructure.setDimens((int) f102, (int) f112, 0, 0, (int) (cVar2.f1933c - f102), (int) (cVar2.f1934d - f112));
                            cVar3 = cVar5;
                            if (cVar3 != null) {
                            }
                            h(nVar, new g(0, this));
                        }
                    }
                }
            }
            cVar3 = null;
            if (cVar3 != null) {
            }
            h(nVar, new g(0, this));
        }
    }

    public final void o(n nVar) {
        if (j()) {
            this.f173j.add(new i(nVar.f1999g, this.f180q, j.f190h, null));
            List j3 = n.j(4, nVar);
            int size = j3.size();
            for (int i10 = 0; i10 < size; i10++) {
                o((n) j3.get(i10));
            }
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.f178o.removeCallbacks(this.f184u);
        this.f172i = null;
    }

    public final void p() {
        u uVar = this.f181r;
        uVar.c();
        k i10 = i();
        int[] iArr = i10.f6296b;
        Object[] objArr = i10.f6297c;
        long[] jArr = i10.f6295a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i11 = 0;
            while (true) {
                long j3 = jArr[i11];
                if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i12 = 8 - ((~(i11 - length)) >>> 31);
                    for (int i13 = 0; i13 < i12; i13++) {
                        if ((255 & j3) < 128) {
                            int i14 = (i11 << 3) + i13;
                            uVar.h(iArr[i14], new k1(((e2.o) objArr[i14]).f2000a, i()));
                        }
                        j3 >>= 8;
                    }
                    if (i12 != 8) {
                        break;
                    }
                }
                if (i11 == length) {
                    break;
                } else {
                    i11++;
                }
            }
        }
        this.f182s = new k1(this.f170g.getSemanticsOwner().a(), i());
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }
}
