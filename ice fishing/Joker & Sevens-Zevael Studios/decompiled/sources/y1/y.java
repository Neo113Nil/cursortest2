package y1;

import android.content.res.Resources;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.os.SystemClock;
import android.os.Trace;
import android.text.Layout;
import android.util.Log;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import org.fortheloss.st.R;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class y extends h3.b {
    public static final s.t Q;
    public boolean A;
    public v B;
    public s.u C;
    public final s.v D;
    public final s.s E;
    public final s.s F;
    public final String G;
    public final String H;
    public final a5.c I;
    public final s.u J;
    public k1 K;
    public boolean L;
    public final s.s M;
    public final a1.a N;
    public final ArrayList O;
    public final x P;

    /* renamed from: d, reason: collision with root package name */
    public final r f8679d;

    /* renamed from: e, reason: collision with root package name */
    public int f8680e = Integer.MIN_VALUE;

    /* renamed from: f, reason: collision with root package name */
    public final x f8681f = new x(this, 0);

    /* renamed from: g, reason: collision with root package name */
    public final AccessibilityManager f8682g;

    /* renamed from: h, reason: collision with root package name */
    public long f8683h;

    /* renamed from: i, reason: collision with root package name */
    public final s f8684i;

    /* renamed from: j, reason: collision with root package name */
    public final t f8685j;

    /* renamed from: k, reason: collision with root package name */
    public List f8686k;

    /* renamed from: l, reason: collision with root package name */
    public final Handler f8687l;

    /* renamed from: m, reason: collision with root package name */
    public final u f8688m;

    /* renamed from: n, reason: collision with root package name */
    public int f8689n;

    /* renamed from: o, reason: collision with root package name */
    public int f8690o;

    /* renamed from: p, reason: collision with root package name */
    public i3.d f8691p;

    /* renamed from: q, reason: collision with root package name */
    public i3.d f8692q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f8693r;

    /* renamed from: s, reason: collision with root package name */
    public final s.u f8694s;

    /* renamed from: t, reason: collision with root package name */
    public final s.u f8695t;

    /* renamed from: u, reason: collision with root package name */
    public final s.r0 f8696u;

    /* renamed from: v, reason: collision with root package name */
    public final s.r0 f8697v;

    /* renamed from: w, reason: collision with root package name */
    public int f8698w;

    /* renamed from: x, reason: collision with root package name */
    public Integer f8699x;

    /* renamed from: y, reason: collision with root package name */
    public final s.g f8700y;

    /* renamed from: z, reason: collision with root package name */
    public final ad.e f8701z;

    static {
        int[] iArr = {R.id.accessibility_custom_action_0, R.id.accessibility_custom_action_1, R.id.accessibility_custom_action_2, R.id.accessibility_custom_action_3, R.id.accessibility_custom_action_4, R.id.accessibility_custom_action_5, R.id.accessibility_custom_action_6, R.id.accessibility_custom_action_7, R.id.accessibility_custom_action_8, R.id.accessibility_custom_action_9, R.id.accessibility_custom_action_10, R.id.accessibility_custom_action_11, R.id.accessibility_custom_action_12, R.id.accessibility_custom_action_13, R.id.accessibility_custom_action_14, R.id.accessibility_custom_action_15, R.id.accessibility_custom_action_16, R.id.accessibility_custom_action_17, R.id.accessibility_custom_action_18, R.id.accessibility_custom_action_19, R.id.accessibility_custom_action_20, R.id.accessibility_custom_action_21, R.id.accessibility_custom_action_22, R.id.accessibility_custom_action_23, R.id.accessibility_custom_action_24, R.id.accessibility_custom_action_25, R.id.accessibility_custom_action_26, R.id.accessibility_custom_action_27, R.id.accessibility_custom_action_28, R.id.accessibility_custom_action_29, R.id.accessibility_custom_action_30, R.id.accessibility_custom_action_31};
        int i10 = s.j.f6292a;
        s.t tVar = new s.t(32);
        int i11 = tVar.f6342b;
        if (i11 < 0) {
            t.a.d("");
            throw null;
        }
        int i12 = i11 + 32;
        tVar.b(i12);
        int[] iArr2 = tVar.f6341a;
        int i13 = tVar.f6342b;
        if (i11 != i13) {
            bc.l.P(i12, i11, i13, iArr2, iArr2);
        }
        bc.l.S(i11, 0, 12, iArr, iArr2);
        tVar.f6342b += 32;
        Q = tVar;
    }

    /* JADX WARN: Type inference failed for: r3v3, types: [y1.s] */
    /* JADX WARN: Type inference failed for: r3v4, types: [y1.t] */
    public y(r rVar) {
        this.f8679d = rVar;
        Object systemService = rVar.getContext().getSystemService("accessibility");
        pc.j.c(systemService, "null cannot be cast to non-null type android.view.accessibility.AccessibilityManager");
        AccessibilityManager accessibilityManager = (AccessibilityManager) systemService;
        this.f8682g = accessibilityManager;
        this.f8683h = 100L;
        this.f8684i = new AccessibilityManager.AccessibilityStateChangeListener() { // from class: y1.s
            @Override // android.view.accessibility.AccessibilityManager.AccessibilityStateChangeListener
            public final void onAccessibilityStateChanged(boolean z10) {
                y yVar = y.this;
                yVar.f8686k = z10 ? yVar.f8682g.getEnabledAccessibilityServiceList(-1) : bc.v.f1067g;
            }
        };
        this.f8685j = new AccessibilityManager.TouchExplorationStateChangeListener() { // from class: y1.t
            @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
            public final void onTouchExplorationStateChanged(boolean z10) {
                y yVar = y.this;
                yVar.f8686k = yVar.f8682g.getEnabledAccessibilityServiceList(-1);
            }
        };
        this.f8686k = accessibilityManager.getEnabledAccessibilityServiceList(-1);
        this.f8687l = new Handler(Looper.getMainLooper());
        this.f8688m = new u(this);
        this.f8689n = Integer.MIN_VALUE;
        this.f8690o = Integer.MIN_VALUE;
        this.f8694s = new s.u();
        this.f8695t = new s.u();
        this.f8696u = new s.r0(0);
        this.f8697v = new s.r0(0);
        this.f8698w = -1;
        this.f8700y = new s.g(0);
        this.f8701z = a.a.a(1, 6, null);
        this.A = true;
        s.u uVar = s.l.f6301a;
        pc.j.c(uVar, "null cannot be cast to non-null type androidx.collection.IntObjectMap<V of androidx.collection.IntObjectMapKt.intObjectMapOf>");
        this.C = uVar;
        this.D = new s.v();
        this.E = new s.s();
        this.F = new s.s();
        this.G = "android.view.accessibility.extra.EXTRA_DATA_TEST_TRAVERSALBEFORE_VAL";
        this.H = "android.view.accessibility.extra.EXTRA_DATA_TEST_TRAVERSALAFTER_VAL";
        this.I = new a5.c(11);
        this.J = new s.u();
        e2.n a6 = rVar.getSemanticsOwner().a();
        pc.j.c(uVar, "null cannot be cast to non-null type androidx.collection.IntObjectMap<V of androidx.collection.IntObjectMapKt.intObjectMapOf>");
        this.K = new k1(a6, uVar);
        int i10 = s.i.f6279a;
        this.M = new s.s();
        rVar.addOnAttachStateChangeListener(new f1.e(3, this));
        this.N = new a1.a(15, this);
        this.O = new ArrayList();
        this.P = new x(this, 1);
    }

    public static Rect G(f1.b0 b0Var) {
        if (!(b0Var instanceof f1.z) && !(b0Var instanceof f1.a0)) {
            return null;
        }
        e1.c a6 = b0Var.a();
        return new Rect((int) a6.f1931a, (int) a6.f1932b, (int) a6.f1933c, (int) a6.f1934d);
    }

    public static float[] H(f1.b0 b0Var) {
        if (!(b0Var instanceof f1.a0)) {
            return null;
        }
        e1.d dVar = ((f1.a0) b0Var).f2212a;
        long j3 = dVar.f1942h;
        long j6 = dVar.f1941g;
        long j10 = dVar.f1940f;
        long j11 = dVar.f1939e;
        return new float[]{Float.intBitsToFloat((int) (j11 >> 32)), Float.intBitsToFloat((int) (j11 & 4294967295L)), Float.intBitsToFloat((int) (j10 >> 32)), Float.intBitsToFloat((int) (j10 & 4294967295L)), Float.intBitsToFloat((int) (j6 >> 32)), Float.intBitsToFloat((int) (j6 & 4294967295L)), Float.intBitsToFloat((int) (j3 >> 32)), Float.intBitsToFloat((int) (j3 & 4294967295L))};
    }

    public static Region I(f1.b0 b0Var) {
        if (!(b0Var instanceof f1.y)) {
            return null;
        }
        f1.y yVar = (f1.y) b0Var;
        e1.c a6 = yVar.a();
        Region region = new Region(new Rect((int) a6.f1931a, (int) a6.f1932b, (int) a6.f1933c, (int) a6.f1934d));
        Region region2 = new Region();
        f1.i iVar = yVar.f2291a;
        if (!(iVar instanceof f1.i)) {
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        region2.setPath(iVar.f2261a, region);
        return region2;
    }

    public static CharSequence J(CharSequence charSequence) {
        if (charSequence.length() != 0) {
            int i10 = 100000;
            if (charSequence.length() > 100000) {
                if (Character.isHighSurrogate(charSequence.charAt(99999)) && Character.isLowSurrogate(charSequence.charAt(100000))) {
                    i10 = 99999;
                }
                CharSequence subSequence = charSequence.subSequence(0, i10);
                pc.j.c(subSequence, "null cannot be cast to non-null type T of androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.trimToSize");
                return subSequence;
            }
        }
        return charSequence;
    }

    public static String p(e2.n nVar) {
        h2.e eVar;
        if (nVar != null) {
            e2.j jVar = nVar.f1996d;
            s.g0 g0Var = jVar.f1985g;
            e2.v vVar = e2.s.f2025a;
            if (g0Var.c(vVar)) {
                return u2.a.a((List) jVar.b(vVar), ",", null, 62);
            }
            e2.v vVar2 = e2.s.C;
            if (g0Var.c(vVar2)) {
                Object g8 = g0Var.g(vVar2);
                if (g8 == null) {
                    g8 = null;
                }
                h2.e eVar2 = (h2.e) g8;
                if (eVar2 != null) {
                    return eVar2.f2648h;
                }
            } else {
                Object g10 = g0Var.g(e2.s.f2049y);
                if (g10 == null) {
                    g10 = null;
                }
                List list = (List) g10;
                if (list != null && (eVar = (h2.e) bc.m.U(list)) != null) {
                    return eVar.f2648h;
                }
            }
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [oc.a, pc.k] */
    /* JADX WARN: Type inference failed for: r3v2, types: [oc.a, pc.k] */
    public static final boolean s(e2.h hVar, float f10) {
        ?? r02 = hVar.f1957a;
        if (f10 >= 0.0f || ((Number) r02.invoke()).floatValue() <= 0.0f) {
            return f10 > 0.0f && ((Number) r02.invoke()).floatValue() < ((Number) hVar.f1958b.invoke()).floatValue();
        }
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [oc.a, pc.k] */
    /* JADX WARN: Type inference failed for: r3v1, types: [oc.a, pc.k] */
    public static final boolean t(e2.h hVar) {
        ?? r02 = hVar.f1957a;
        if (((Number) r02.invoke()).floatValue() > 0.0f) {
            return true;
        }
        ((Number) r02.invoke()).floatValue();
        ((Number) hVar.f1958b.invoke()).floatValue();
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [oc.a, pc.k] */
    /* JADX WARN: Type inference failed for: r2v1, types: [oc.a, pc.k] */
    public static final boolean u(e2.h hVar) {
        ?? r02 = hVar.f1957a;
        if (((Number) r02.invoke()).floatValue() < ((Number) hVar.f1958b.invoke()).floatValue()) {
            return true;
        }
        ((Number) r02.invoke()).floatValue();
        return false;
    }

    public static /* synthetic */ void z(y yVar, int i10, int i11, Integer num, int i12) {
        if ((i12 & 4) != 0) {
            num = null;
        }
        yVar.y(i10, i11, num, null);
    }

    public final void A(String str, int i10, int i11) {
        AccessibilityEvent j3 = j(v(i10), 32);
        j3.setContentChangeTypes(i11);
        if (str != null) {
            j3.getText().add(str);
        }
        x(j3);
    }

    public final void B(int i10) {
        v vVar = this.B;
        if (vVar != null) {
            e2.n nVar = vVar.f8655a;
            if (i10 != nVar.f1999g) {
                return;
            }
            if (SystemClock.uptimeMillis() - vVar.f8660f <= 1000) {
                AccessibilityEvent j3 = j(v(nVar.f1999g), 131072);
                j3.setFromIndex(vVar.f8658d);
                j3.setToIndex(vVar.f8659e);
                j3.setAction(vVar.f8656b);
                j3.setMovementGranularity(vVar.f8657c);
                j3.getText().add(p(nVar));
                x(j3);
            }
        }
        this.B = null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:209:0x04d8, code lost:
    
        if (r1.isEmpty() == false) goto L223;
     */
    /* JADX WARN: Code restructure failed: missing block: B:223:0x0507, code lost:
    
        if (r12 != null) goto L243;
     */
    /* JADX WARN: Code restructure failed: missing block: B:225:0x050c, code lost:
    
        if (r12 == null) goto L243;
     */
    /* JADX WARN: Removed duplicated region for block: B:228:0x0515  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void C(s.k kVar) {
        ArrayList arrayList;
        int[] iArr;
        long[] jArr;
        int i10;
        Integer num;
        int i11;
        int i12;
        ArrayList arrayList2;
        int[] iArr2;
        long[] jArr2;
        int i13;
        int i14;
        int i15;
        Integer num2;
        e2.j jVar;
        e2.n nVar;
        int i16;
        int i17;
        int i18;
        int i19;
        s.g0 g0Var;
        x1.g0 g0Var2;
        int i20;
        e2.j jVar2;
        ArrayList arrayList3;
        long j3;
        int i21;
        int i22;
        int i23;
        x1.g0 g0Var3;
        Integer num3;
        int i24;
        s.g0 g0Var4;
        int i25;
        j1 j1Var;
        boolean z10;
        j1 j1Var2;
        boolean z11;
        int i26;
        String str;
        int i27;
        int i28;
        int i29;
        s.g0 g0Var5;
        Integer num4;
        AccessibilityEvent l10;
        Integer num5;
        s.k kVar2 = kVar;
        ArrayList arrayList4 = this.O;
        ArrayList arrayList5 = new ArrayList(arrayList4);
        arrayList4.clear();
        int[] iArr3 = kVar2.f6296b;
        long[] jArr3 = kVar2.f6295a;
        int i30 = 2;
        int length = jArr3.length - 2;
        int i31 = 0;
        Integer num6 = 0;
        if (length < 0) {
            return;
        }
        int i32 = 0;
        while (true) {
            long j6 = jArr3[i32];
            int i33 = i30;
            int i34 = length;
            if ((((~j6) << 7) & j6 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i35 = 8;
                int i36 = 8 - ((~(i32 - i34)) >>> 31);
                long j10 = j6;
                int i37 = i31;
                while (i37 < i36) {
                    if ((j10 & 255) < 128) {
                        int i38 = iArr3[(i32 << 3) + i37];
                        k1 k1Var = (k1) this.J.b(i38);
                        if (k1Var != null) {
                            e2.j jVar3 = k1Var.f8579a;
                            s.g0 g0Var6 = jVar3.f1985g;
                            e2.o oVar = (e2.o) kVar2.b(i38);
                            int i39 = i35;
                            e2.n nVar2 = oVar != null ? oVar.f2000a : null;
                            if (nVar2 == null) {
                                throw a4.d.e("no value for specified key");
                            }
                            x1.g0 g0Var7 = nVar2.f1995c;
                            e2.j jVar4 = nVar2.f1996d;
                            iArr2 = iArr3;
                            int i40 = nVar2.f1999g;
                            jArr2 = jArr3;
                            s.g0 g0Var8 = jVar4.f1985g;
                            i15 = i32;
                            Object[] objArr = g0Var8.f6267b;
                            Object[] objArr2 = g0Var8.f6268c;
                            long[] jArr4 = g0Var8.f6266a;
                            i12 = i37;
                            int length2 = jArr4.length - 2;
                            if (length2 >= 0) {
                                x1.g0 g0Var9 = g0Var7;
                                i13 = i36;
                                int i41 = 0;
                                i18 = 0;
                                while (true) {
                                    long j11 = jArr4[i41];
                                    nVar = nVar2;
                                    int i42 = i41;
                                    if ((((~j11) << 7) & j11 & (-9187201950435737472L)) != -9187201950435737472L) {
                                        int i43 = 8 - ((~(i42 - length2)) >>> 31);
                                        int i44 = 0;
                                        while (i44 < i43) {
                                            if ((j11 & 255) < 128) {
                                                int i45 = (i42 << 3) + i44;
                                                Object obj = objArr[i45];
                                                int i46 = length2;
                                                Object obj2 = objArr2[i45];
                                                jVar2 = jVar3;
                                                e2.v vVar = (e2.v) obj;
                                                j3 = j11;
                                                e2.v vVar2 = e2.s.f2044t;
                                                if (pc.j.a(vVar, vVar2) || pc.j.a(vVar, e2.s.f2045u)) {
                                                    int size = arrayList5.size();
                                                    i22 = i44;
                                                    int i47 = 0;
                                                    while (true) {
                                                        if (i47 >= size) {
                                                            j1Var = null;
                                                            break;
                                                        }
                                                        int i48 = size;
                                                        if (((j1) arrayList5.get(i47)).f8570g == i38) {
                                                            j1Var = (j1) arrayList5.get(i47);
                                                            break;
                                                        } else {
                                                            i47++;
                                                            size = i48;
                                                        }
                                                    }
                                                    if (j1Var != null) {
                                                        z10 = false;
                                                    } else {
                                                        j1Var = new j1(i38, arrayList4);
                                                        z10 = true;
                                                    }
                                                    arrayList4.add(j1Var);
                                                } else {
                                                    i22 = i44;
                                                    z10 = false;
                                                }
                                                if (!z10) {
                                                    Object g8 = g0Var6.g(vVar);
                                                    if (g8 == null) {
                                                        g8 = null;
                                                    }
                                                    if (pc.j.a(obj2, g8)) {
                                                        i24 = i38;
                                                        arrayList3 = arrayList5;
                                                        i21 = i43;
                                                        i23 = i39;
                                                        g0Var3 = g0Var9;
                                                        num3 = num6;
                                                        g0Var4 = g0Var6;
                                                        i25 = i46;
                                                    }
                                                }
                                                e2.v vVar3 = e2.s.f2028d;
                                                if (pc.j.a(vVar, vVar3)) {
                                                    pc.j.c(obj2, "null cannot be cast to non-null type kotlin.String");
                                                    String str2 = (String) obj2;
                                                    if (g0Var6.c(vVar3)) {
                                                        A(str2, i38, i39);
                                                    }
                                                    i24 = i38;
                                                    arrayList3 = arrayList5;
                                                    i21 = i43;
                                                    g0Var3 = g0Var9;
                                                    i23 = 8;
                                                    num3 = num6;
                                                    g0Var4 = g0Var6;
                                                    i25 = i46;
                                                } else if (pc.j.a(vVar, e2.s.f2026b) || pc.j.a(vVar, e2.s.F)) {
                                                    i24 = i38;
                                                    arrayList3 = arrayList5;
                                                    i21 = i43;
                                                    g0Var3 = g0Var9;
                                                    num3 = num6;
                                                    g0Var4 = g0Var6;
                                                    i25 = i46;
                                                    i23 = 8;
                                                    z(this, v(i24), 2048, 64, 8);
                                                    z(this, v(i24), 2048, num3, 8);
                                                } else if (pc.j.a(vVar, e2.s.f2027c)) {
                                                    i23 = 8;
                                                    z(this, v(i38), 2048, 64, 8);
                                                    z(this, v(i38), 2048, num6, 8);
                                                    i24 = i38;
                                                    arrayList3 = arrayList5;
                                                    i21 = i43;
                                                    g0Var3 = g0Var9;
                                                    num3 = num6;
                                                    g0Var4 = g0Var6;
                                                    i25 = i46;
                                                } else {
                                                    e2.v vVar4 = e2.s.E;
                                                    arrayList3 = arrayList5;
                                                    if (pc.j.a(vVar, vVar4)) {
                                                        Object g10 = g0Var8.g(e2.s.f2046v);
                                                        if (g10 == null) {
                                                            g10 = null;
                                                        }
                                                        e2.g gVar = (e2.g) g10;
                                                        if (gVar != null && gVar.f1956a == 4) {
                                                            Object g11 = g0Var8.g(vVar4);
                                                            if (g11 == null) {
                                                                g11 = null;
                                                            }
                                                            if (pc.j.a(g11, Boolean.TRUE)) {
                                                                AccessibilityEvent j12 = j(v(i38), 4);
                                                                e2.n nVar3 = nVar;
                                                                g0Var3 = g0Var9;
                                                                e2.n nVar4 = new e2.n(nVar3.f1993a, true, g0Var3, jVar4);
                                                                Object g12 = nVar4.k().f1985g.g(e2.s.f2025a);
                                                                if (g12 == null) {
                                                                    g12 = null;
                                                                }
                                                                List list = (List) g12;
                                                                nVar = nVar3;
                                                                String a6 = list != null ? u2.a.a(list, ",", null, 62) : null;
                                                                Object g13 = nVar4.k().f1985g.g(e2.s.f2049y);
                                                                if (g13 == null) {
                                                                    g13 = null;
                                                                }
                                                                List list2 = (List) g13;
                                                                i21 = i43;
                                                                String a8 = list2 != null ? u2.a.a(list2, ",", null, 62) : null;
                                                                if (a6 != null) {
                                                                    j12.setContentDescription(a6);
                                                                }
                                                                if (a8 != null) {
                                                                    j12.getText().add(a8);
                                                                }
                                                                x(j12);
                                                            } else {
                                                                i21 = i43;
                                                                g0Var3 = g0Var9;
                                                                z(this, v(i38), 2048, num6, 8);
                                                            }
                                                        } else {
                                                            i21 = i43;
                                                            g0Var3 = g0Var9;
                                                            z(this, v(i38), 2048, 64, 8);
                                                            z(this, v(i38), 2048, num6, 8);
                                                        }
                                                        num3 = num6;
                                                        i24 = i38;
                                                        g0Var4 = g0Var6;
                                                        i25 = i46;
                                                        i23 = 8;
                                                    } else {
                                                        i21 = i43;
                                                        g0Var3 = g0Var9;
                                                        if (pc.j.a(vVar, e2.s.f2025a)) {
                                                            int v10 = v(i38);
                                                            pc.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
                                                            y(v10, 2048, 4, (List) obj2);
                                                            num3 = num6;
                                                            i24 = i38;
                                                            g0Var4 = g0Var6;
                                                        } else {
                                                            e2.v vVar5 = e2.s.C;
                                                            String str3 = "";
                                                            if (!pc.j.a(vVar, vVar5)) {
                                                                Integer num7 = num6;
                                                                i24 = i38;
                                                                g0Var4 = g0Var6;
                                                                e2.v vVar6 = e2.s.D;
                                                                if (pc.j.a(vVar, vVar6)) {
                                                                    Object g14 = g0Var8.g(vVar5);
                                                                    if (g14 == null) {
                                                                        g14 = null;
                                                                    }
                                                                    h2.e eVar = (h2.e) g14;
                                                                    if (eVar != null && (str = eVar.f2648h) != null) {
                                                                        str3 = str;
                                                                    }
                                                                    long j13 = ((h2.g0) jVar4.b(vVar6)).f2672a;
                                                                    num3 = num7;
                                                                    x(l(v(i24), Integer.valueOf((int) (j13 >> 32)), Integer.valueOf((int) (j13 & 4294967295L)), Integer.valueOf(str3.length()), J(str3)));
                                                                    B(i40);
                                                                } else {
                                                                    i25 = i46;
                                                                    num3 = num7;
                                                                    if (pc.j.a(vVar, vVar2) || pc.j.a(vVar, e2.s.f2045u)) {
                                                                        r(g0Var3);
                                                                        int size2 = arrayList4.size();
                                                                        int i49 = 0;
                                                                        while (true) {
                                                                            if (i49 >= size2) {
                                                                                j1Var2 = null;
                                                                                break;
                                                                            } else {
                                                                                if (((j1) arrayList4.get(i49)).f8570g == i24) {
                                                                                    j1Var2 = (j1) arrayList4.get(i49);
                                                                                    break;
                                                                                }
                                                                                i49++;
                                                                            }
                                                                        }
                                                                        pc.j.b(j1Var2);
                                                                        Object g15 = g0Var8.g(vVar2);
                                                                        if (g15 == null) {
                                                                            g15 = null;
                                                                        }
                                                                        j1Var2.f8574k = (e2.h) g15;
                                                                        Object g16 = g0Var8.g(e2.s.f2045u);
                                                                        if (g16 == null) {
                                                                            g16 = null;
                                                                        }
                                                                        j1Var2.f8575l = (e2.h) g16;
                                                                        if (j1Var2.f8571h.contains(j1Var2)) {
                                                                            this.f8679d.getSnapshotObserver().a(j1Var2, this.P, new c1.b(11, j1Var2, this));
                                                                        }
                                                                    } else if (pc.j.a(vVar, e2.s.f2035k)) {
                                                                        pc.j.c(obj2, "null cannot be cast to non-null type kotlin.Boolean");
                                                                        if (((Boolean) obj2).booleanValue()) {
                                                                            i26 = 8;
                                                                            x(j(v(i40), 8));
                                                                        } else {
                                                                            i26 = 8;
                                                                        }
                                                                        z(this, v(i40), 2048, num3, i26);
                                                                        i23 = i26;
                                                                    } else {
                                                                        e2.v vVar7 = e2.i.f1980v;
                                                                        if (pc.j.a(vVar, vVar7)) {
                                                                            List list3 = (List) jVar4.b(vVar7);
                                                                            Object g17 = g0Var4.g(vVar7);
                                                                            if (g17 == null) {
                                                                                g17 = null;
                                                                            }
                                                                            List list4 = (List) g17;
                                                                            if (list4 != null) {
                                                                                LinkedHashSet linkedHashSet = new LinkedHashSet();
                                                                                if (list3.size() > 0) {
                                                                                    list3.get(0).getClass();
                                                                                    throw new ClassCastException();
                                                                                }
                                                                                LinkedHashSet linkedHashSet2 = new LinkedHashSet();
                                                                                if (list4.size() > 0) {
                                                                                    list4.get(0).getClass();
                                                                                    throw new ClassCastException();
                                                                                }
                                                                                i18 = (linkedHashSet.containsAll(linkedHashSet2) && linkedHashSet2.containsAll(linkedHashSet)) ? 0 : 1;
                                                                            }
                                                                        } else {
                                                                            if (obj2 instanceof e2.a) {
                                                                                e2.a aVar = (e2.a) obj2;
                                                                                Object g18 = g0Var4.g(vVar);
                                                                                if (g18 == null) {
                                                                                    g18 = null;
                                                                                }
                                                                                if (aVar != g18) {
                                                                                    if (g18 instanceof e2.a) {
                                                                                        String str4 = aVar.f1944a;
                                                                                        e2.a aVar2 = (e2.a) g18;
                                                                                        ac.c cVar = aVar2.f1945b;
                                                                                        if (pc.j.a(str4, aVar2.f1944a)) {
                                                                                            ac.c cVar2 = aVar.f1945b;
                                                                                            if (cVar2 == null) {
                                                                                            }
                                                                                            if (cVar2 != null) {
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    z11 = false;
                                                                                    if (z11) {
                                                                                        i18 = 0;
                                                                                    }
                                                                                }
                                                                                z11 = true;
                                                                                if (z11) {
                                                                                }
                                                                            }
                                                                            i18 = 1;
                                                                        }
                                                                    }
                                                                    i23 = 8;
                                                                }
                                                            } else if (g0Var8.c(e2.i.f1968j)) {
                                                                Object g19 = g0Var6.g(vVar5);
                                                                if (g19 == null) {
                                                                    g19 = null;
                                                                }
                                                                h2.e eVar2 = (h2.e) g19;
                                                                if (eVar2 == null) {
                                                                    eVar2 = "";
                                                                }
                                                                Object g20 = g0Var8.g(vVar5);
                                                                if (g20 == null) {
                                                                    g20 = null;
                                                                }
                                                                CharSequence charSequence = (h2.e) g20;
                                                                if (charSequence == null) {
                                                                    charSequence = "";
                                                                }
                                                                CharSequence J = J(charSequence);
                                                                int length3 = eVar2.length();
                                                                int length4 = charSequence.length();
                                                                int i50 = length3 > length4 ? length4 : length3;
                                                                Integer num8 = num6;
                                                                int i51 = 0;
                                                                while (true) {
                                                                    i27 = length3;
                                                                    if (i51 >= i50) {
                                                                        i28 = length4;
                                                                        break;
                                                                    }
                                                                    i28 = length4;
                                                                    if (eVar2.charAt(i51) != charSequence.charAt(i51)) {
                                                                        break;
                                                                    }
                                                                    i51++;
                                                                    length3 = i27;
                                                                    length4 = i28;
                                                                }
                                                                int i52 = 0;
                                                                while (true) {
                                                                    if (i52 >= i50 - i51) {
                                                                        i29 = i52;
                                                                        break;
                                                                    }
                                                                    i29 = i52;
                                                                    if (eVar2.charAt((i27 - 1) - i52) != charSequence.charAt((i28 - 1) - i29)) {
                                                                        break;
                                                                    } else {
                                                                        i52 = i29 + 1;
                                                                    }
                                                                }
                                                                int i53 = (i27 - i29) - i51;
                                                                int i54 = (i28 - i29) - i51;
                                                                e2.v vVar8 = e2.s.G;
                                                                boolean c3 = g0Var6.c(vVar8);
                                                                boolean c7 = g0Var8.c(vVar8);
                                                                boolean c10 = g0Var6.c(e2.s.C);
                                                                boolean z12 = c10 && !c3 && c7;
                                                                boolean z13 = c10 && c3 && !c7;
                                                                if (z12 || z13) {
                                                                    g0Var5 = g0Var6;
                                                                    i24 = i38;
                                                                    num4 = num8;
                                                                    l10 = l(v(i38), num4, num8, Integer.valueOf(i28), J);
                                                                } else {
                                                                    g0Var5 = g0Var6;
                                                                    l10 = j(v(i38), 16);
                                                                    l10.setFromIndex(i51);
                                                                    l10.setRemovedCount(i53);
                                                                    l10.setAddedCount(i54);
                                                                    l10.setBeforeText(eVar2);
                                                                    l10.getText().add(J);
                                                                    i24 = i38;
                                                                    num4 = num8;
                                                                }
                                                                l10.setClassName("android.widget.EditText");
                                                                x(l10);
                                                                if (z12 || z13) {
                                                                    long j14 = ((h2.g0) jVar4.b(e2.s.D)).f2672a;
                                                                    num5 = num4;
                                                                    l10.setFromIndex((int) (j14 >> 32));
                                                                    l10.setToIndex((int) (j14 & 4294967295L));
                                                                    x(l10);
                                                                } else {
                                                                    num5 = num4;
                                                                }
                                                                i25 = i46;
                                                                num3 = num5;
                                                                g0Var4 = g0Var5;
                                                                i23 = 8;
                                                            } else {
                                                                Integer num9 = num6;
                                                                i24 = i38;
                                                                i23 = 8;
                                                                z(this, v(i24), 2048, Integer.valueOf(i33), 8);
                                                                i25 = i46;
                                                                num3 = num9;
                                                                g0Var4 = g0Var6;
                                                            }
                                                        }
                                                        i25 = i46;
                                                        i23 = 8;
                                                    }
                                                }
                                            } else {
                                                jVar2 = jVar3;
                                                arrayList3 = arrayList5;
                                                j3 = j11;
                                                i21 = i43;
                                                i22 = i44;
                                                i23 = i39;
                                                g0Var3 = g0Var9;
                                                num3 = num6;
                                                i24 = i38;
                                                g0Var4 = g0Var6;
                                                i25 = length2;
                                            }
                                            i39 = i23;
                                            g0Var6 = g0Var4;
                                            g0Var9 = g0Var3;
                                            i43 = i21;
                                            i44 = i22 + 1;
                                            length2 = i25;
                                            num6 = num3;
                                            arrayList5 = arrayList3;
                                            i38 = i24;
                                            j11 = j3 >> i23;
                                            jVar3 = jVar2;
                                        }
                                        i17 = i38;
                                        jVar = jVar3;
                                        arrayList2 = arrayList5;
                                        g0Var2 = g0Var9;
                                        i16 = 1;
                                        num2 = num6;
                                        i20 = length2;
                                        int i55 = i43;
                                        g0Var = g0Var6;
                                        i14 = 0;
                                        if (i55 != i39) {
                                            break;
                                        }
                                    } else {
                                        i17 = i38;
                                        jVar = jVar3;
                                        g0Var = g0Var6;
                                        arrayList2 = arrayList5;
                                        g0Var2 = g0Var9;
                                        i14 = 0;
                                        i16 = 1;
                                        num2 = num6;
                                        i20 = length2;
                                    }
                                    if (i42 == i20) {
                                        break;
                                    }
                                    i38 = i17;
                                    g0Var6 = g0Var;
                                    g0Var9 = g0Var2;
                                    nVar2 = nVar;
                                    jVar3 = jVar;
                                    i39 = 8;
                                    i41 = i42 + 1;
                                    length2 = i20;
                                    num6 = num2;
                                    arrayList5 = arrayList2;
                                }
                            } else {
                                jVar = jVar3;
                                arrayList2 = arrayList5;
                                i13 = i36;
                                nVar = nVar2;
                                i14 = 0;
                                i16 = 1;
                                num2 = num6;
                                i17 = i38;
                                i18 = 0;
                            }
                            if (i18 == 0) {
                                Iterator it = jVar.iterator();
                                while (true) {
                                    if (!it.hasNext()) {
                                        i19 = i14;
                                        break;
                                    } else {
                                        if (!nVar.k().f1985g.c((e2.v) ((Map.Entry) it.next()).getKey())) {
                                            i19 = i16;
                                            break;
                                        }
                                    }
                                }
                                i18 = i19;
                            }
                            if (i18 != 0) {
                                i35 = 8;
                                z(this, v(i17), 2048, num2, 8);
                            } else {
                                i35 = 8;
                            }
                            j10 >>= i35;
                            i37 = i12 + 1;
                            kVar2 = kVar;
                            i31 = i14;
                            num6 = num2;
                            iArr3 = iArr2;
                            jArr3 = jArr2;
                            i32 = i15;
                            i36 = i13;
                            arrayList5 = arrayList2;
                        }
                    }
                    i12 = i37;
                    arrayList2 = arrayList5;
                    iArr2 = iArr3;
                    jArr2 = jArr3;
                    i13 = i36;
                    i14 = i31;
                    i15 = i32;
                    num2 = num6;
                    j10 >>= i35;
                    i37 = i12 + 1;
                    kVar2 = kVar;
                    i31 = i14;
                    num6 = num2;
                    iArr3 = iArr2;
                    jArr3 = jArr2;
                    i32 = i15;
                    i36 = i13;
                    arrayList5 = arrayList2;
                }
                arrayList = arrayList5;
                iArr = iArr3;
                jArr = jArr3;
                i10 = i31;
                int i56 = i32;
                num = num6;
                if (i36 != i35) {
                    return;
                } else {
                    i11 = i56;
                }
            } else {
                arrayList = arrayList5;
                iArr = iArr3;
                jArr = jArr3;
                i10 = i31;
                num = num6;
                i11 = i32;
            }
            if (i11 == i34) {
                return;
            }
            i32 = i11 + 1;
            kVar2 = kVar;
            length = i34;
            i31 = i10;
            num6 = num;
            i30 = i33;
            iArr3 = iArr;
            jArr3 = jArr;
            arrayList5 = arrayList;
        }
    }

    public final void D(x1.g0 g0Var, s.v vVar) {
        e2.j u10;
        if (g0Var.G() && !this.f8679d.getAndroidViewsHandler$ui_release().getLayoutNodeToHolder().containsKey(g0Var)) {
            x1.g0 g0Var2 = null;
            if (!g0Var.I.d(8)) {
                g0Var = g0Var.s();
                while (true) {
                    if (g0Var == null) {
                        g0Var = null;
                        break;
                    } else if (g0Var.I.d(8)) {
                        break;
                    } else {
                        g0Var = g0Var.s();
                    }
                }
            }
            if (g0Var == null || (u10 = g0Var.u()) == null) {
                return;
            }
            if (!u10.f1987i) {
                x1.g0 s10 = g0Var.s();
                while (true) {
                    if (s10 != null) {
                        e2.j u11 = s10.u();
                        if (u11 != null && u11.f1987i) {
                            g0Var2 = s10;
                            break;
                        }
                        s10 = s10.s();
                    } else {
                        break;
                    }
                }
                if (g0Var2 != null) {
                    g0Var = g0Var2;
                }
            }
            int i10 = g0Var.f8042h;
            if (vVar.a(i10)) {
                z(this, v(i10), 2048, 1, 8);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v13, types: [oc.a, pc.k] */
    /* JADX WARN: Type inference failed for: r0v18, types: [oc.a, pc.k] */
    /* JADX WARN: Type inference failed for: r0v8, types: [oc.a, pc.k] */
    /* JADX WARN: Type inference failed for: r2v1, types: [oc.a, pc.k] */
    public final void E(x1.g0 g0Var) {
        if (g0Var.G() && !this.f8679d.getAndroidViewsHandler$ui_release().getLayoutNodeToHolder().containsKey(g0Var)) {
            int i10 = g0Var.f8042h;
            e2.h hVar = (e2.h) this.f8694s.b(i10);
            e2.h hVar2 = (e2.h) this.f8695t.b(i10);
            if (hVar == null && hVar2 == null) {
                return;
            }
            AccessibilityEvent j3 = j(i10, 4096);
            if (hVar != null) {
                j3.setScrollX((int) ((Number) hVar.f1957a.invoke()).floatValue());
                j3.setMaxScrollX((int) ((Number) hVar.f1958b.invoke()).floatValue());
            }
            if (hVar2 != null) {
                j3.setScrollY((int) ((Number) hVar2.f1957a.invoke()).floatValue());
                j3.setMaxScrollY((int) ((Number) hVar2.f1958b.invoke()).floatValue());
            }
            x(j3);
        }
    }

    public final boolean F(e2.n nVar, int i10, int i11, boolean z10) {
        String p8;
        e2.j jVar = nVar.f1996d;
        int i12 = nVar.f1999g;
        e2.v vVar = e2.i.f1967i;
        if (jVar.f1985g.c(vVar) && e0.f(nVar)) {
            oc.f fVar = (oc.f) ((e2.a) nVar.f1996d.b(vVar)).f1945b;
            if (fVar != null) {
                return ((Boolean) fVar.b(Integer.valueOf(i10), Integer.valueOf(i11), Boolean.valueOf(z10))).booleanValue();
            }
        } else if ((i10 != i11 || i11 != this.f8698w) && (p8 = p(nVar)) != null) {
            if (i10 < 0 || i10 != i11 || i11 > p8.length()) {
                i10 = -1;
            }
            this.f8698w = i10;
            boolean z11 = p8.length() > 0;
            x(l(v(i12), z11 ? Integer.valueOf(this.f8698w) : null, z11 ? Integer.valueOf(this.f8698w) : null, z11 ? Integer.valueOf(p8.length()) : null, p8));
            B(i12);
            return true;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:59:0x013f, code lost:
    
        r28 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0149, code lost:
    
        if (((r7 & ((~r7) << 6)) & r20) == 0) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x014b, code lost:
    
        r25 = -1;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void K() {
        long j3;
        long j6;
        long j10;
        char c3;
        long[] jArr;
        long[] jArr2;
        long j11;
        int i10;
        int i11;
        int i12;
        char c7;
        s.v vVar = new s.v();
        s.v vVar2 = this.D;
        int[] iArr = vVar2.f6345b;
        long[] jArr3 = vVar2.f6344a;
        int length = jArr3.length - 2;
        s.u uVar = this.J;
        int i13 = 8;
        if (length >= 0) {
            int i14 = 0;
            j3 = 128;
            j6 = 255;
            while (true) {
                long j12 = jArr3[i14];
                char c10 = 7;
                j10 = -9187201950435737472L;
                if ((((~j12) << 7) & j12 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i15 = 8 - ((~(i14 - length)) >>> 31);
                    int i16 = 0;
                    while (i16 < i15) {
                        if ((j12 & 255) < 128) {
                            int i17 = iArr[(i14 << 3) + i16];
                            c7 = c10;
                            e2.o oVar = (e2.o) o().b(i17);
                            e2.n nVar = oVar != null ? oVar.f2000a : null;
                            if (nVar != null) {
                                if (nVar.f1996d.f1985g.c(e2.s.f2028d)) {
                                }
                            }
                            vVar.a(i17);
                            k1 k1Var = (k1) uVar.b(i17);
                            if (k1Var != null) {
                                Object g8 = k1Var.f8579a.f1985g.g(e2.s.f2028d);
                                r23 = g8 != 0 ? g8 : null;
                            }
                            A(r23, i17, 32);
                        } else {
                            c7 = c10;
                        }
                        j12 >>= 8;
                        i16++;
                        c10 = c7;
                    }
                    c3 = c10;
                    if (i15 != 8) {
                        break;
                    }
                } else {
                    c3 = 7;
                }
                if (i14 == length) {
                    break;
                } else {
                    i14++;
                }
            }
        } else {
            j3 = 128;
            j6 = 255;
            j10 = -9187201950435737472L;
            c3 = 7;
        }
        int[] iArr2 = vVar.f6345b;
        long[] jArr4 = vVar.f6344a;
        int length2 = jArr4.length - 2;
        if (length2 >= 0) {
            int i18 = 0;
            while (true) {
                long j13 = jArr4[i18];
                if ((((~j13) << c3) & j13 & j10) != j10) {
                    int i19 = 8 - ((~(i18 - length2)) >>> 31);
                    int i20 = 0;
                    while (i20 < i19) {
                        if ((j13 & j6) < j3) {
                            int i21 = iArr2[(i18 << 3) + i20];
                            int hashCode = Integer.hashCode(i21) * (-862048943);
                            int i22 = hashCode ^ (hashCode << 16);
                            int i23 = i22 & 127;
                            int i24 = vVar2.f6346c;
                            int i25 = (i22 >>> 7) & i24;
                            i10 = i13;
                            int i26 = 0;
                            while (true) {
                                long[] jArr5 = vVar2.f6344a;
                                int i27 = i25 >> 3;
                                jArr2 = jArr4;
                                int i28 = (i25 & 7) << 3;
                                j11 = j13;
                                long j14 = (jArr5[i27] >>> i28) | ((jArr5[i27 + 1] << (64 - i28)) & ((-i28) >> 63));
                                int i29 = i24;
                                long j15 = (i23 * 72340172838076673L) ^ j14;
                                long j16 = (j15 - 72340172838076673L) & (~j15) & j10;
                                while (true) {
                                    if (j16 == 0) {
                                        break;
                                    }
                                    i12 = (i25 + (Long.numberOfTrailingZeros(j16) >> 3)) & i29;
                                    int i30 = i29;
                                    if (vVar2.f6345b[i12] == i21) {
                                        break;
                                    }
                                    j16 &= j16 - 1;
                                    i29 = i30;
                                }
                                i26 += 8;
                                i25 = (i25 + i26) & i11;
                                jArr4 = jArr2;
                                i24 = i11;
                                j13 = j11;
                            }
                            int i31 = i12;
                            if (i31 >= 0) {
                                vVar2.f(i31);
                            }
                        } else {
                            jArr2 = jArr4;
                            j11 = j13;
                            i10 = i13;
                        }
                        j13 = j11 >> i10;
                        i20++;
                        i13 = i10;
                        jArr4 = jArr2;
                    }
                    jArr = jArr4;
                    if (i19 != i13) {
                        break;
                    }
                } else {
                    jArr = jArr4;
                }
                if (i18 == length2) {
                    break;
                }
                i18++;
                jArr4 = jArr;
                i13 = 8;
            }
        }
        uVar.c();
        s.k o7 = o();
        int[] iArr3 = o7.f6296b;
        Object[] objArr = o7.f6297c;
        long[] jArr6 = o7.f6295a;
        int length3 = jArr6.length - 2;
        if (length3 >= 0) {
            int i32 = 0;
            while (true) {
                long j17 = jArr6[i32];
                if ((((~j17) << c3) & j17 & j10) != j10) {
                    int i33 = 8 - ((~(i32 - length3)) >>> 31);
                    for (int i34 = 0; i34 < i33; i34++) {
                        if ((j17 & j6) < j3) {
                            int i35 = (i32 << 3) + i34;
                            int i36 = iArr3[i35];
                            e2.n nVar2 = ((e2.o) objArr[i35]).f2000a;
                            e2.j jVar = nVar2.f1996d;
                            e2.v vVar3 = e2.s.f2028d;
                            if (jVar.f1985g.c(vVar3) && vVar2.a(i36)) {
                                A((String) nVar2.f1996d.b(vVar3), i36, 16);
                            }
                            uVar.h(i36, new k1(nVar2, o()));
                        }
                        j17 >>= 8;
                    }
                    if (i33 != 8) {
                        break;
                    }
                }
                if (i32 == length3) {
                    break;
                } else {
                    i32++;
                }
            }
        }
        this.K = new k1(this.f8679d.getSemanticsOwner().a(), o());
    }

    @Override // h3.b
    public final f8.c a(View view) {
        return this.f8688m;
    }

    public final void e(int i10, i3.d dVar, String str, Bundle bundle) {
        e2.n nVar;
        Region I;
        float[] H;
        Rect G;
        int i11;
        float h10;
        float h11;
        float g8;
        float g10;
        AccessibilityNodeInfo accessibilityNodeInfo;
        int i12;
        RectF rectF;
        AccessibilityNodeInfo accessibilityNodeInfo2 = dVar.f3164a;
        e2.o oVar = (e2.o) o().b(i10);
        if (oVar == null || (nVar = oVar.f2000a) == null) {
            return;
        }
        e2.j jVar = nVar.f1996d;
        s.g0 g0Var = jVar.f1985g;
        String p8 = p(nVar);
        if (pc.j.a(str, this.G)) {
            int d10 = this.E.d(i10);
            if (d10 != -1) {
                accessibilityNodeInfo2.getExtras().putInt(str, d10);
                return;
            }
            return;
        }
        if (pc.j.a(str, this.H)) {
            int d11 = this.F.d(i10);
            if (d11 != -1) {
                accessibilityNodeInfo2.getExtras().putInt(str, d11);
                return;
            }
            return;
        }
        boolean z10 = false;
        if (!g0Var.c(e2.i.f1959a) || bundle == null || !pc.j.a(str, "android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_KEY")) {
            e2.v vVar = e2.s.f2047w;
            if (g0Var.c(vVar) && bundle != null && pc.j.a(str, "androidx.compose.ui.semantics.testTag")) {
                Object g11 = g0Var.g(vVar);
                String str2 = (String) (g11 == null ? null : g11);
                if (str2 != null) {
                    accessibilityNodeInfo2.getExtras().putCharSequence(str, str2);
                    return;
                }
                return;
            }
            if (pc.j.a(str, "androidx.compose.ui.semantics.id")) {
                accessibilityNodeInfo2.getExtras().putInt(str, nVar.f1999g);
                return;
            }
            if (pc.j.a(str, "androidx.compose.ui.semantics.shapeType")) {
                Object g12 = g0Var.g(e2.s.L);
                f1.g0 g0Var2 = (f1.g0) (g12 == null ? null : g12);
                if (g0Var2 != null) {
                    f1.b0 k3 = k(g0Var2, nVar);
                    if (k3 instanceof f1.z) {
                        accessibilityNodeInfo2.getExtras().putInt("androidx.compose.ui.semantics.shapeType", 0);
                        accessibilityNodeInfo2.getExtras().putParcelable("androidx.compose.ui.semantics.shapeRect", G(k3));
                        return;
                    } else if (k3 instanceof f1.a0) {
                        accessibilityNodeInfo2.getExtras().putInt("androidx.compose.ui.semantics.shapeType", 1);
                        accessibilityNodeInfo2.getExtras().putParcelable("androidx.compose.ui.semantics.shapeRect", G(k3));
                        accessibilityNodeInfo2.getExtras().putFloatArray("androidx.compose.ui.semantics.shapeCorners", H(k3));
                        return;
                    } else {
                        if (!(k3 instanceof f1.y)) {
                            throw new ac.d();
                        }
                        accessibilityNodeInfo2.getExtras().putInt("androidx.compose.ui.semantics.shapeType", 2);
                        accessibilityNodeInfo2.getExtras().putParcelable("androidx.compose.ui.semantics.shapeRegion", I(k3));
                        return;
                    }
                }
                return;
            }
            if (pc.j.a(str, "androidx.compose.ui.semantics.shapeRect")) {
                Object g13 = g0Var.g(e2.s.L);
                f1.g0 g0Var3 = (f1.g0) (g13 == null ? null : g13);
                if (g0Var3 == null || (G = G(k(g0Var3, nVar))) == null) {
                    return;
                }
                accessibilityNodeInfo2.getExtras().putParcelable("androidx.compose.ui.semantics.shapeRect", G);
                return;
            }
            if (pc.j.a(str, "androidx.compose.ui.semantics.shapeCorners")) {
                Object g14 = g0Var.g(e2.s.L);
                f1.g0 g0Var4 = (f1.g0) (g14 == null ? null : g14);
                if (g0Var4 == null || (H = H(k(g0Var4, nVar))) == null) {
                    return;
                }
                accessibilityNodeInfo2.getExtras().putFloatArray("androidx.compose.ui.semantics.shapeCorners", H);
                return;
            }
            if (pc.j.a(str, "androidx.compose.ui.semantics.shapeRegion")) {
                Object g15 = g0Var.g(e2.s.L);
                f1.g0 g0Var5 = (f1.g0) (g15 == null ? null : g15);
                if (g0Var5 == null || (I = I(k(g0Var5, nVar))) == null) {
                    return;
                }
                accessibilityNodeInfo2.getExtras().putParcelable("androidx.compose.ui.semantics.shapeRegion", I);
                return;
            }
            return;
        }
        int i13 = bundle.getInt("android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_ARG_START_INDEX", -1);
        int i14 = bundle.getInt("android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_ARG_LENGTH", -1);
        if (i14 > 0 && i13 >= 0) {
            if (i13 < (p8 != null ? p8.length() : Integer.MAX_VALUE)) {
                h2.e0 q10 = e0.q(jVar);
                if (q10 == null) {
                    return;
                }
                ArrayList arrayList = new ArrayList();
                int i15 = 0;
                while (i15 < i14) {
                    int i16 = i13 + i15;
                    if (i16 >= q10.f2651a.f2637a.f2648h.length()) {
                        arrayList.add(z10);
                        i11 = i13;
                        accessibilityNodeInfo = accessibilityNodeInfo2;
                        i12 = i14;
                    } else {
                        b0.s0 s0Var = q10.f2652b;
                        h2.e eVar = (h2.e) ((d8.t) s0Var.f890c).f1816a;
                        if (i16 < 0 || i16 >= eVar.f2648h.length()) {
                            m2.a.a("offset(" + i16 + ") is out of bounds [0, " + eVar.f2648h.length() + ')');
                        }
                        ArrayList arrayList2 = (ArrayList) s0Var.f892e;
                        h2.n nVar2 = (h2.n) arrayList2.get(h2.z.c(i16, arrayList2));
                        h2.a aVar = nVar2.f2686a;
                        int a6 = nVar2.a(i16);
                        CharSequence charSequence = aVar.f2610e;
                        if (a6 < 0 || a6 >= charSequence.length()) {
                            m2.a.a("offset(" + a6 + ") is out of bounds [0," + charSequence.length() + ')');
                        }
                        i2.k kVar = aVar.f2609d;
                        Layout layout = kVar.f3137e;
                        int lineForOffset = layout.getLineForOffset(a6);
                        float f10 = kVar.f(lineForOffset);
                        float d12 = kVar.d(lineForOffset);
                        i11 = i13;
                        boolean z11 = layout.getParagraphDirection(lineForOffset) == 1;
                        boolean isRtlCharAt = layout.isRtlCharAt(a6);
                        if (!z11 || isRtlCharAt) {
                            if (z11 && isRtlCharAt) {
                                g8 = kVar.h(a6, false);
                                g10 = kVar.h(a6 + 1, true);
                            } else if (isRtlCharAt) {
                                g8 = kVar.g(a6, false);
                                g10 = kVar.g(a6 + 1, true);
                            } else {
                                h10 = kVar.h(a6, false);
                                h11 = kVar.h(a6 + 1, true);
                            }
                            float f11 = g8;
                            h10 = g10;
                            h11 = f11;
                        } else {
                            h10 = kVar.g(a6, false);
                            h11 = kVar.g(a6 + 1, true);
                        }
                        RectF rectF2 = new RectF(h10, f10, h11, d12);
                        accessibilityNodeInfo = accessibilityNodeInfo2;
                        i12 = i14;
                        long floatToRawIntBits = (Float.floatToRawIntBits(nVar2.f2691f) & 4294967295L) | (Float.floatToRawIntBits(0.0f) << 32);
                        int i17 = (int) (floatToRawIntBits >> 32);
                        int i18 = (int) (floatToRawIntBits & 4294967295L);
                        e1.c cVar = new e1.c(Float.intBitsToFloat(i17) + rectF2.left, Float.intBitsToFloat(i18) + rectF2.top, Float.intBitsToFloat(i17) + rectF2.right, Float.intBitsToFloat(i18) + rectF2.bottom);
                        x1.f1 d13 = nVar.d();
                        long j3 = 0;
                        if (d13 != null) {
                            if (!d13.B0().f8456t) {
                                d13 = null;
                            }
                            if (d13 != null) {
                                j3 = d13.L0(0L);
                            }
                        }
                        e1.c e10 = cVar.e(j3);
                        e1.c g16 = nVar.g();
                        if ((((((e10.f1931a > g16.f1933c ? 1 : (e10.f1931a == g16.f1933c ? 0 : -1)) < 0) & ((g16.f1931a > e10.f1933c ? 1 : (g16.f1931a == e10.f1933c ? 0 : -1)) < 0)) & ((e10.f1932b > g16.f1934d ? 1 : (e10.f1932b == g16.f1934d ? 0 : -1)) < 0)) & ((g16.f1932b > e10.f1934d ? 1 : (g16.f1932b == e10.f1934d ? 0 : -1)) < 0) ? e10.c(g16) : null) != null) {
                            r rVar = this.f8679d;
                            long s10 = rVar.s((Float.floatToRawIntBits(r1.f1932b) & 4294967295L) | (Float.floatToRawIntBits(r1.f1931a) << 32));
                            long s11 = rVar.s((Float.floatToRawIntBits(r1.f1933c) << 32) | (Float.floatToRawIntBits(r1.f1934d) & 4294967295L));
                            int i19 = (int) (s10 >> 32);
                            int i20 = (int) (s11 >> 32);
                            int i21 = (int) (s10 & 4294967295L);
                            int i22 = (int) (s11 & 4294967295L);
                            rectF = new RectF(Math.min(Float.intBitsToFloat(i19), Float.intBitsToFloat(i20)), Math.min(Float.intBitsToFloat(i21), Float.intBitsToFloat(i22)), Math.max(Float.intBitsToFloat(i19), Float.intBitsToFloat(i20)), Math.max(Float.intBitsToFloat(i21), Float.intBitsToFloat(i22)));
                        } else {
                            rectF = null;
                        }
                        arrayList.add(rectF);
                    }
                    i15++;
                    i14 = i12;
                    accessibilityNodeInfo2 = accessibilityNodeInfo;
                    i13 = i11;
                    z10 = false;
                }
                accessibilityNodeInfo2.getExtras().putParcelableArray(str, (Parcelable[]) arrayList.toArray(new RectF[0]));
                return;
            }
        }
        Log.e("AccessibilityDelegate", "Invalid arguments for accessibility character locations");
    }

    public final Rect f(e2.o oVar) {
        s2.j jVar = oVar.f2001b;
        float f10 = jVar.f6391a;
        float f11 = jVar.f6392b;
        long floatToRawIntBits = (Float.floatToRawIntBits(f11) & 4294967295L) | (Float.floatToRawIntBits(f10) << 32);
        r rVar = this.f8679d;
        long s10 = rVar.s(floatToRawIntBits);
        float f12 = jVar.f6393c;
        float f13 = jVar.f6394d;
        long s11 = rVar.s((Float.floatToRawIntBits(f12) << 32) | (Float.floatToRawIntBits(f13) & 4294967295L));
        int i10 = (int) (s10 >> 32);
        int i11 = (int) (s11 >> 32);
        int i12 = (int) (s10 & 4294967295L);
        int i13 = (int) (s11 & 4294967295L);
        return new Rect((int) Math.floor(Math.min(Float.intBitsToFloat(i10), Float.intBitsToFloat(i11))), (int) Math.floor(Math.min(Float.intBitsToFloat(i12), Float.intBitsToFloat(i13))), (int) Math.ceil(Math.max(Float.intBitsToFloat(i10), Float.intBitsToFloat(i11))), (int) Math.ceil(Math.max(Float.intBitsToFloat(i12), Float.intBitsToFloat(i13))));
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x00f2, code lost:
    
        if (yc.a0.f(r4, r2) == r7) goto L49;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0077 A[Catch: all -> 0x0037, TryCatch #1 {all -> 0x0037, blocks: (B:12:0x0030, B:15:0x005d, B:21:0x006f, B:23:0x0077, B:25:0x0080, B:27:0x0086, B:29:0x0095, B:31:0x009d, B:53:0x0047, B:55:0x004e), top: B:7:0x0026 }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0028  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x00f2 -> B:14:0x00f5). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object g(hc.c cVar) {
        w wVar;
        int i10;
        s.g gVar;
        s.g gVar2;
        s.v vVar;
        ad.b bVar;
        s.v vVar2;
        ad.b bVar2;
        int i11;
        long j3;
        Object b2;
        try {
            if (cVar instanceof w) {
                wVar = (w) cVar;
                int i12 = wVar.f8667k;
                if ((i12 & Integer.MIN_VALUE) != 0) {
                    wVar.f8667k = i12 - Integer.MIN_VALUE;
                    Object obj = wVar.f8665i;
                    i10 = wVar.f8667k;
                    gVar = this.f8700y;
                    gc.a aVar = gc.a.f2559g;
                    if (i10 != 0) {
                        v6.a.W(obj);
                        vVar = new s.v();
                        ad.e eVar = this.f8701z;
                        eVar.getClass();
                        bVar = new ad.b(eVar);
                        wVar.f8663g = vVar;
                        wVar.f8664h = bVar;
                        wVar.f8667k = 1;
                        b2 = bVar.b(wVar);
                        if (b2 != aVar) {
                        }
                    } else if (i10 == 1) {
                        bVar2 = wVar.f8664h;
                        vVar2 = wVar.f8663g;
                        v6.a.W(obj);
                        if (((Boolean) obj).booleanValue()) {
                        }
                    } else {
                        if (i10 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        bVar2 = wVar.f8664h;
                        vVar2 = wVar.f8663g;
                        v6.a.W(obj);
                        char c3 = 2;
                        gVar2 = gVar;
                        vVar = vVar2;
                        gVar = gVar2;
                        bVar = bVar2;
                        wVar.f8663g = vVar;
                        wVar.f8664h = bVar;
                        wVar.f8667k = 1;
                        b2 = bVar.b(wVar);
                        if (b2 != aVar) {
                            return aVar;
                        }
                        ad.b bVar3 = bVar;
                        vVar2 = vVar;
                        obj = b2;
                        bVar2 = bVar3;
                        if (((Boolean) obj).booleanValue()) {
                            gVar.clear();
                            return ac.o.f277a;
                        }
                        bVar2.c();
                        if (q()) {
                            int i13 = gVar.f6265i;
                            for (int i14 = 0; i14 < i13; i14++) {
                                x1.g0 g0Var = (x1.g0) gVar.f6264h[i14];
                                D(g0Var, vVar2);
                                E(g0Var);
                            }
                            vVar2.f6347d = 0;
                            long[] jArr = vVar2.f6344a;
                            if (jArr != s.o0.f6312a) {
                                try {
                                    bc.l.W(jArr, -9187201950435737472L);
                                    long[] jArr2 = vVar2.f6344a;
                                    i11 = vVar2.f6346c;
                                    int i15 = i11 >> 3;
                                    jArr2[i15] = ((~j3) & jArr2[i15]) | j3;
                                } catch (Throwable th) {
                                    th = th;
                                    gVar2.clear();
                                    throw th;
                                }
                                j3 = 255 << ((i11 & 7) << 3);
                                gVar2 = gVar;
                            } else {
                                gVar2 = gVar;
                            }
                            vVar2.f6348e = s.o0.a(vVar2.f6346c) - vVar2.f6347d;
                            if (!this.L) {
                                this.L = true;
                                this.f8687l.post(this.N);
                            }
                        } else {
                            gVar2 = gVar;
                        }
                        gVar2.clear();
                        this.f8694s.c();
                        this.f8695t.c();
                        long j6 = this.f8683h;
                        wVar.f8663g = vVar2;
                        wVar.f8664h = bVar2;
                        c3 = 2;
                        wVar.f8667k = 2;
                    }
                }
            }
            if (i10 != 0) {
            }
        } catch (Throwable th2) {
            th = th2;
            gVar2 = gVar;
        }
        wVar = new w(this, cVar);
        Object obj2 = wVar.f8665i;
        i10 = wVar.f8667k;
        gVar = this.f8700y;
        gc.a aVar2 = gc.a.f2559g;
    }

    /* JADX WARN: Type inference failed for: r1v22, types: [oc.a, pc.k] */
    /* JADX WARN: Type inference failed for: r2v7, types: [oc.a, pc.k] */
    public final boolean h(boolean z10, int i10, long j3) {
        e2.v vVar;
        int i11;
        if (!pc.j.a(Looper.getMainLooper().getThread(), Thread.currentThread())) {
            return false;
        }
        s.k o7 = o();
        if (e1.b.b(j3, 9205357640488583168L) || (((9223372034707292159L & j3) + 36028792732385279L) & (-9223372034707292160L)) != 0) {
            return false;
        }
        if (z10) {
            vVar = e2.s.f2045u;
        } else {
            if (z10) {
                throw new ac.d();
            }
            vVar = e2.s.f2044t;
        }
        Object[] objArr = o7.f6297c;
        long[] jArr = o7.f6295a;
        int length = jArr.length - 2;
        if (length < 0) {
            return false;
        }
        int i12 = 0;
        boolean z11 = false;
        while (true) {
            long j6 = jArr[i12];
            if ((((~j6) << 7) & j6 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i13 = 8;
                int i14 = 8 - ((~(i12 - length)) >>> 31);
                int i15 = 0;
                while (i15 < i14) {
                    if ((255 & j6) < 128) {
                        e2.o oVar = (e2.o) objArr[(i12 << 3) + i15];
                        s2.j jVar = oVar.f2001b;
                        float f10 = jVar.f6391a;
                        i11 = i13;
                        float f11 = jVar.f6392b;
                        float f12 = jVar.f6393c;
                        float f13 = jVar.f6394d;
                        float intBitsToFloat = Float.intBitsToFloat((int) (j3 >> 32));
                        float intBitsToFloat2 = Float.intBitsToFloat((int) (j3 & 4294967295L));
                        if ((intBitsToFloat2 < f13) & (intBitsToFloat >= f10) & (intBitsToFloat < f12) & (intBitsToFloat2 >= f11)) {
                            Object g8 = oVar.f2000a.f1996d.f1985g.g(vVar);
                            if (g8 == null) {
                                g8 = null;
                            }
                            e2.h hVar = (e2.h) g8;
                            if (hVar != null) {
                                ?? r22 = hVar.f1957a;
                                if (i10 < 0) {
                                    if (((Number) r22.invoke()).floatValue() <= 0.0f) {
                                    }
                                    z11 = true;
                                } else {
                                    if (((Number) r22.invoke()).floatValue() >= ((Number) hVar.f1958b.invoke()).floatValue()) {
                                    }
                                    z11 = true;
                                }
                            }
                        }
                    } else {
                        i11 = i13;
                    }
                    j6 >>= i11;
                    i15++;
                    i13 = i11;
                }
                if (i14 != i13) {
                    return z11;
                }
            }
            if (i12 == length) {
                return z11;
            }
            i12++;
        }
    }

    public final void i() {
        Trace.beginSection("sendAccessibilitySemanticsStructureChangeEvents");
        try {
            if (q()) {
                w(this.f8679d.getSemanticsOwner().a(), this.K);
            }
            Trace.endSection();
            Trace.beginSection("sendSemanticsPropertyChangeEvents");
            try {
                C(o());
                Trace.endSection();
                Trace.beginSection("updateSemanticsNodesCopyAndPanes");
                try {
                    K();
                } finally {
                }
            } finally {
            }
        } finally {
        }
    }

    public final AccessibilityEvent j(int i10, int i11) {
        e2.o oVar;
        AccessibilityEvent obtain = AccessibilityEvent.obtain(i11);
        obtain.setEnabled(true);
        obtain.setClassName("android.view.View");
        r rVar = this.f8679d;
        obtain.setPackageName(rVar.getContext().getPackageName());
        obtain.setSource(rVar, i10);
        if (q() && (oVar = (e2.o) o().b(i10)) != null) {
            e2.n nVar = oVar.f2000a;
            obtain.setPassword(nVar.f1996d.f1985g.c(e2.s.G));
            Object g8 = nVar.f1996d.f1985g.g(e2.s.f2038n);
            if (g8 == null) {
                g8 = null;
            }
            boolean a6 = pc.j.a(g8, Boolean.TRUE);
            if (Build.VERSION.SDK_INT >= 34) {
                d.a.j(obtain, a6);
            }
        }
        return obtain;
    }

    public final f1.b0 k(f1.g0 g0Var, e2.n nVar) {
        x1.f1 d10 = nVar.d();
        return g0Var.a(i7.b.F(d10 != null ? d10.f7087i : 0L), nVar.f1995c.C, this.f8679d.getDensity());
    }

    public final AccessibilityEvent l(int i10, Integer num, Integer num2, Integer num3, CharSequence charSequence) {
        AccessibilityEvent j3 = j(i10, 8192);
        if (num != null) {
            j3.setFromIndex(num.intValue());
        }
        if (num2 != null) {
            j3.setToIndex(num2.intValue());
        }
        if (num3 != null) {
            j3.setItemCount(num3.intValue());
        }
        if (charSequence != null) {
            j3.getText().add(charSequence);
        }
        return j3;
    }

    public final int m(e2.n nVar) {
        e2.j jVar = nVar.f1996d;
        e2.j jVar2 = nVar.f1996d;
        e2.v vVar = e2.s.f2025a;
        if (!jVar.f1985g.c(e2.s.f2025a)) {
            e2.v vVar2 = e2.s.D;
            if (jVar2.f1985g.c(vVar2)) {
                return (int) (((h2.g0) jVar2.b(vVar2)).f2672a & 4294967295L);
            }
        }
        return this.f8698w;
    }

    public final int n(e2.n nVar) {
        e2.j jVar = nVar.f1996d;
        e2.j jVar2 = nVar.f1996d;
        e2.v vVar = e2.s.f2025a;
        if (!jVar.f1985g.c(e2.s.f2025a)) {
            e2.v vVar2 = e2.s.D;
            if (jVar2.f1985g.c(vVar2)) {
                return (int) (((h2.g0) jVar2.b(vVar2)).f2672a >> 32);
            }
        }
        return this.f8698w;
    }

    public final s.k o() {
        if (this.A) {
            this.A = false;
            r rVar = this.f8679d;
            this.C = e2.q.b(rVar.getSemanticsOwner());
            if (q()) {
                s.u uVar = this.C;
                Resources resources = rVar.getContext().getResources();
                s.s sVar = this.E;
                sVar.a();
                s.s sVar2 = this.F;
                sVar2.a();
                e2.o oVar = (e2.o) uVar.b(-1);
                e2.n nVar = oVar != null ? oVar.f2000a : null;
                pc.j.b(nVar);
                ArrayList b2 = e2.x.b(nVar, new wc.i(6, uVar), new wc.i(7, resources), i7.b.z(nVar));
                int K = bc.n.K(b2);
                int i10 = 1;
                if (1 <= K) {
                    while (true) {
                        int i11 = ((e2.n) b2.get(i10 - 1)).f1999g;
                        int i12 = ((e2.n) b2.get(i10)).f1999g;
                        sVar.f(i11, i12);
                        sVar2.f(i12, i11);
                        if (i10 == K) {
                            break;
                        }
                        i10++;
                    }
                }
            }
        }
        return this.C;
    }

    public final boolean q() {
        return this.f8682g.isEnabled() && !this.f8686k.isEmpty();
    }

    public final void r(x1.g0 g0Var) {
        if (this.f8700y.add(g0Var)) {
            this.f8701z.s(ac.o.f277a);
        }
    }

    public final int v(int i10) {
        if (i10 == this.f8679d.getSemanticsOwner().a().f1999g) {
            return -1;
        }
        return i10;
    }

    public final void w(e2.n nVar, k1 k1Var) {
        int[] iArr = s.m.f6304a;
        s.v vVar = new s.v();
        List j3 = e2.n.j(4, nVar);
        x1.g0 g0Var = nVar.f1995c;
        int size = j3.size();
        for (int i10 = 0; i10 < size; i10++) {
            e2.n nVar2 = (e2.n) j3.get(i10);
            s.k o7 = o();
            int i11 = nVar2.f1999g;
            if (o7.a(i11)) {
                if (!k1Var.f8580b.b(i11)) {
                    r(g0Var);
                    return;
                }
                vVar.a(i11);
            }
        }
        s.v vVar2 = k1Var.f8580b;
        int[] iArr2 = vVar2.f6345b;
        long[] jArr = vVar2.f6344a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i12 = 0;
            while (true) {
                long j6 = jArr[i12];
                if ((((~j6) << 7) & j6 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i13 = 8 - ((~(i12 - length)) >>> 31);
                    for (int i14 = 0; i14 < i13; i14++) {
                        if ((255 & j6) < 128 && !vVar.b(iArr2[(i12 << 3) + i14])) {
                            r(g0Var);
                            return;
                        }
                        j6 >>= 8;
                    }
                    if (i13 != 8) {
                        break;
                    }
                }
                if (i12 == length) {
                    break;
                } else {
                    i12++;
                }
            }
        }
        List j10 = e2.n.j(4, nVar);
        int size2 = j10.size();
        for (int i15 = 0; i15 < size2; i15++) {
            e2.n nVar3 = (e2.n) j10.get(i15);
            k1 k1Var2 = (k1) this.J.b(nVar3.f1999g);
            if (k1Var2 != null && o().a(nVar3.f1999g)) {
                w(nVar3, k1Var2);
            }
        }
    }

    public final boolean x(AccessibilityEvent accessibilityEvent) {
        if (!q()) {
            return false;
        }
        if (accessibilityEvent.getEventType() == 2048 || accessibilityEvent.getEventType() == 32768) {
            this.f8693r = true;
        }
        try {
            return ((Boolean) this.f8681f.invoke(accessibilityEvent)).booleanValue();
        } finally {
            this.f8693r = false;
        }
    }

    public final boolean y(int i10, int i11, Integer num, List list) {
        if (i10 == Integer.MIN_VALUE || !q()) {
            return false;
        }
        AccessibilityEvent j3 = j(i10, i11);
        if (num != null) {
            j3.setContentChangeTypes(num.intValue());
        }
        if (list != null) {
            j3.setContentDescription(u2.a.a(list, ",", null, 62));
        }
        return x(j3);
    }
}
