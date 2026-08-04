package com.gamericefishpro.space.i2;

import android.accessibilityservice.AccessibilityServiceInfo;
import android.content.res.Resources;
import android.graphics.Path;
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
import com.gamericefishpro.space.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class z extends com.gamericefishpro.space.d4.b implements View.OnAttachStateChangeListener, AccessibilityManager.AccessibilityStateChangeListener, AccessibilityManager.TouchExplorationStateChangeListener {
    public static final com.gamericefishpro.space.t.v h0;
    public long A;
    public List B;
    public final Handler C;
    public final u D;
    public int E;
    public int F;
    public com.gamericefishpro.space.e4.h G;
    public com.gamericefishpro.space.e4.h H;
    public boolean I;
    public final com.gamericefishpro.space.t.w J;
    public final com.gamericefishpro.space.t.w K;
    public final com.gamericefishpro.space.t.s0 L;
    public final com.gamericefishpro.space.t.s0 M;
    public int N;
    public Integer O;
    public final com.gamericefishpro.space.t.f P;
    public final com.gamericefishpro.space.ri.e Q;
    public boolean R;
    public v S;
    public com.gamericefishpro.space.t.w T;
    public final com.gamericefishpro.space.t.x U;
    public final com.gamericefishpro.space.t.u V;
    public final com.gamericefishpro.space.t.u W;
    public final String X;
    public final String Y;
    public final com.gamericefishpro.space.r5.b Z;
    public final com.gamericefishpro.space.t.w a0;
    public s1 b0;
    public boolean c0;
    public final com.gamericefishpro.space.t.u d0;
    public final com.appsflyer.a e0;
    public final ArrayList f0;
    public final y g0;
    public final t v;
    public int w = Integer.MIN_VALUE;
    public final y y;
    public final AccessibilityManager z;

    static {
        int i;
        int[] elements = {R.id.accessibility_custom_action_0, R.id.accessibility_custom_action_1, R.id.accessibility_custom_action_2, R.id.accessibility_custom_action_3, R.id.accessibility_custom_action_4, R.id.accessibility_custom_action_5, R.id.accessibility_custom_action_6, R.id.accessibility_custom_action_7, R.id.accessibility_custom_action_8, R.id.accessibility_custom_action_9, R.id.accessibility_custom_action_10, R.id.accessibility_custom_action_11, R.id.accessibility_custom_action_12, R.id.accessibility_custom_action_13, R.id.accessibility_custom_action_14, R.id.accessibility_custom_action_15, R.id.accessibility_custom_action_16, R.id.accessibility_custom_action_17, R.id.accessibility_custom_action_18, R.id.accessibility_custom_action_19, R.id.accessibility_custom_action_20, R.id.accessibility_custom_action_21, R.id.accessibility_custom_action_22, R.id.accessibility_custom_action_23, R.id.accessibility_custom_action_24, R.id.accessibility_custom_action_25, R.id.accessibility_custom_action_26, R.id.accessibility_custom_action_27, R.id.accessibility_custom_action_28, R.id.accessibility_custom_action_29, R.id.accessibility_custom_action_30, R.id.accessibility_custom_action_31};
        com.gamericefishpro.space.t.v vVar = com.gamericefishpro.space.t.k.a;
        Intrinsics.checkNotNullParameter(elements, "elements");
        com.gamericefishpro.space.t.v vVar2 = new com.gamericefishpro.space.t.v(32);
        int i2 = vVar2.b;
        Intrinsics.checkNotNullParameter(elements, "elements");
        if (i2 < 0 || i2 > (i = vVar2.b)) {
            com.gamericefishpro.space.u.a.d("");
            throw null;
        }
        int i3 = i + 32;
        int[] iArr = vVar2.a;
        if (iArr.length < i3) {
            int[] iArrCopyOf = Arrays.copyOf(iArr, Math.max(i3, (iArr.length * 3) / 2));
            Intrinsics.checkNotNullExpressionValue(iArrCopyOf, "copyOf(...)");
            vVar2.a = iArrCopyOf;
        }
        int[] iArr2 = vVar2.a;
        int i4 = vVar2.b;
        if (i2 != i4) {
            com.gamericefishpro.space.ph.u.c(i2 + 32, i2, i4, iArr2, iArr2);
        }
        com.gamericefishpro.space.ph.u.f(i2, 0, 12, elements, iArr2);
        vVar2.b += 32;
        h0 = vVar2;
    }

    public z(t tVar) {
        this.v = tVar;
        int i = 0;
        this.y = new y(this, i);
        Object systemService = tVar.getContext().getSystemService("accessibility");
        Intrinsics.c(systemService, "null cannot be cast to non-null type android.view.accessibility.AccessibilityManager");
        this.z = (AccessibilityManager) systemService;
        this.A = 100L;
        this.C = new Handler(Looper.getMainLooper());
        this.D = new u(this, i);
        this.E = Integer.MIN_VALUE;
        this.F = Integer.MIN_VALUE;
        this.J = new com.gamericefishpro.space.t.w();
        this.K = new com.gamericefishpro.space.t.w();
        this.L = new com.gamericefishpro.space.t.s0(0);
        this.M = new com.gamericefishpro.space.t.s0(0);
        this.N = -1;
        this.P = new com.gamericefishpro.space.t.f(0);
        this.Q = com.gamericefishpro.space.hj.c.a(1, 6, null);
        this.R = true;
        com.gamericefishpro.space.t.w wVar = com.gamericefishpro.space.t.m.a;
        Intrinsics.c(wVar, "null cannot be cast to non-null type androidx.collection.IntObjectMap<V of androidx.collection.IntObjectMapKt.intObjectMapOf>");
        this.T = wVar;
        this.U = new com.gamericefishpro.space.t.x();
        this.V = new com.gamericefishpro.space.t.u();
        this.W = new com.gamericefishpro.space.t.u();
        this.X = "android.view.accessibility.extra.EXTRA_DATA_TEST_TRAVERSALBEFORE_VAL";
        this.Y = "android.view.accessibility.extra.EXTRA_DATA_TEST_TRAVERSALAFTER_VAL";
        this.Z = new com.gamericefishpro.space.r5.b(11);
        this.a0 = new com.gamericefishpro.space.t.w();
        com.gamericefishpro.space.o2.o oVarA = tVar.getSemanticsOwner().a();
        Intrinsics.c(wVar, "null cannot be cast to non-null type androidx.collection.IntObjectMap<V of androidx.collection.IntObjectMapKt.intObjectMapOf>");
        this.b0 = new s1(oVarA, wVar);
        int i2 = com.gamericefishpro.space.t.j.a;
        this.d0 = new com.gamericefishpro.space.t.u();
        tVar.addOnAttachStateChangeListener(this);
        this.e0 = new com.appsflyer.a(4, this);
        this.f0 = new ArrayList();
        this.g0 = new y(this, 1);
    }

    public static /* synthetic */ void E(z zVar, int i, int i2, Integer num, int i3) {
        if ((i3 & 4) != 0) {
            num = null;
        }
        zVar.D(i, i2, num, null);
    }

    public static Rect L(com.gamericefishpro.space.o1.o oVar, float f, float f2) {
        if (!(oVar instanceof com.gamericefishpro.space.o1.c0) && !(oVar instanceof com.gamericefishpro.space.o1.d0)) {
            return null;
        }
        com.gamericefishpro.space.n1.c cVarL = oVar.l();
        return new Rect((int) (cVarL.a + f), (int) (cVarL.b + f2), (int) (cVarL.c + f), (int) (cVarL.d + f2));
    }

    public static float[] N(com.gamericefishpro.space.o1.o oVar) {
        if (!(oVar instanceof com.gamericefishpro.space.o1.d0)) {
            return null;
        }
        com.gamericefishpro.space.n1.d dVar = ((com.gamericefishpro.space.o1.d0) oVar).f;
        long j = dVar.h;
        long j2 = dVar.g;
        long j3 = dVar.f;
        long j4 = dVar.e;
        return new float[]{Float.intBitsToFloat((int) (j4 >> 32)), Float.intBitsToFloat((int) (j4 & 4294967295L)), Float.intBitsToFloat((int) (j3 >> 32)), Float.intBitsToFloat((int) (j3 & 4294967295L)), Float.intBitsToFloat((int) (j2 >> 32)), Float.intBitsToFloat((int) (j2 & 4294967295L)), Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L))};
    }

    public static Region O(com.gamericefishpro.space.o1.o oVar, float f, float f2) {
        if (!(oVar instanceof com.gamericefishpro.space.o1.b0)) {
            return null;
        }
        com.gamericefishpro.space.o1.b0 b0Var = (com.gamericefishpro.space.o1.b0) oVar;
        com.gamericefishpro.space.n1.c cVarD = b0Var.l().d(f, f2);
        Region region = new Region(new Rect((int) (cVarD.a + 0.0f), (int) (cVarD.b + 0.0f), (int) (cVarD.c + 0.0f), (int) (cVarD.d + 0.0f)));
        Region region2 = new Region();
        com.gamericefishpro.space.o1.h hVar = b0Var.f;
        if (!(hVar instanceof com.gamericefishpro.space.o1.h)) {
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        Path path = hVar.a;
        path.offset(f, f2);
        region2.setPath(path, region);
        return region2;
    }

    public static CharSequence P(CharSequence charSequence) {
        if (charSequence.length() != 0) {
            int i = 100000;
            if (charSequence.length() > 100000) {
                if (Character.isHighSurrogate(charSequence.charAt(99999)) && Character.isLowSurrogate(charSequence.charAt(100000))) {
                    i = 99999;
                }
                CharSequence charSequenceSubSequence = charSequence.subSequence(0, i);
                Intrinsics.c(charSequenceSubSequence, "null cannot be cast to non-null type T of androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.trimToSize");
                return charSequenceSubSequence;
            }
        }
        return charSequence;
    }

    public static String t(com.gamericefishpro.space.o2.o oVar) {
        com.gamericefishpro.space.r2.e eVar;
        if (oVar != null) {
            com.gamericefishpro.space.o2.l lVar = oVar.d;
            com.gamericefishpro.space.t.h0 h0Var = lVar.d;
            com.gamericefishpro.space.o2.v vVar = com.gamericefishpro.space.o2.s.a;
            if (h0Var.c(vVar)) {
                return com.gamericefishpro.space.e3.a.a((List) lVar.d(vVar), ",", null, 62);
            }
            com.gamericefishpro.space.o2.v vVar2 = com.gamericefishpro.space.o2.s.E;
            if (h0Var.c(vVar2)) {
                Object objG = h0Var.g(vVar2);
                if (objG == null) {
                    objG = null;
                }
                com.gamericefishpro.space.r2.e eVar2 = (com.gamericefishpro.space.r2.e) objG;
                if (eVar2 != null) {
                    return eVar2.e;
                }
            } else {
                Object objG2 = h0Var.g(com.gamericefishpro.space.o2.s.A);
                if (objG2 == null) {
                    objG2 = null;
                }
                List list = (List) objG2;
                if (list != null && (eVar = (com.gamericefishpro.space.r2.e) CollectionsKt.firstOrNull(list)) != null) {
                    return eVar.e;
                }
            }
        }
        return null;
    }

    public static final boolean x(com.gamericefishpro.space.o2.i iVar, float f) {
        Function0 function0 = iVar.a;
        if (f >= 0.0f || ((Number) function0.invoke()).floatValue() <= 0.0f) {
            return f > 0.0f && ((Number) function0.invoke()).floatValue() < ((Number) iVar.b.invoke()).floatValue();
        }
        return true;
    }

    public static final boolean y(com.gamericefishpro.space.o2.i iVar) {
        Function0 function0 = iVar.a;
        if (((Number) function0.invoke()).floatValue() > 0.0f) {
            return true;
        }
        ((Number) function0.invoke()).floatValue();
        ((Number) iVar.b.invoke()).floatValue();
        return false;
    }

    public static final boolean z(com.gamericefishpro.space.o2.i iVar) {
        Function0 function0 = iVar.a;
        if (((Number) function0.invoke()).floatValue() < ((Number) iVar.b.invoke()).floatValue()) {
            return true;
        }
        ((Number) function0.invoke()).floatValue();
        return false;
    }

    public final int A(int i) {
        if (i == this.v.getSemanticsOwner().a().g) {
            return -1;
        }
        return i;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0086 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:28:0x0088 A[LOOP:1: B:15:0x004c->B:28:0x0088, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:44:0x008b A[EDGE_INSN: B:44:0x008b->B:29:0x008b BREAK  A[LOOP:1: B:15:0x004c->B:28:0x0088], SYNTHETIC] */
    public final void B(com.gamericefishpro.space.o2.o oVar, s1 s1Var) {
        int[] iArr = com.gamericefishpro.space.t.n.a;
        com.gamericefishpro.space.t.x xVar = new com.gamericefishpro.space.t.x();
        List listJ = com.gamericefishpro.space.o2.o.j(4, oVar);
        com.gamericefishpro.space.h2.f0 f0Var = oVar.c;
        int size = listJ.size();
        for (int i = 0; i < size; i++) {
            com.gamericefishpro.space.o2.o oVar2 = (com.gamericefishpro.space.o2.o) listJ.get(i);
            com.gamericefishpro.space.t.l lVarS = s();
            int i2 = oVar2.g;
            if (lVarS.a(i2)) {
                if (!s1Var.b.b(i2)) {
                    w(f0Var);
                    return;
                }
                xVar.a(i2);
            }
        }
        com.gamericefishpro.space.t.x xVar2 = s1Var.b;
        int[] iArr2 = xVar2.b;
        long[] jArr = xVar2.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i3 = 0;
            while (true) {
                long j = jArr[i3];
                if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                    if (i3 != length) {
                        break;
                        break;
                    }
                    i3++;
                } else {
                    int i4 = 8 - ((~(i3 - length)) >>> 31);
                    for (int i5 = 0; i5 < i4; i5++) {
                        if ((255 & j) < 128 && !xVar.b(iArr2[(i3 << 3) + i5])) {
                            w(f0Var);
                            return;
                        }
                        j >>= 8;
                    }
                    if (i4 != 8) {
                        break;
                    } else if (i3 != length) {
                        break;
                    } else {
                        i3++;
                    }
                }
            }
        }
        List listJ2 = com.gamericefishpro.space.o2.o.j(4, oVar);
        int size2 = listJ2.size();
        for (int i6 = 0; i6 < size2; i6++) {
            com.gamericefishpro.space.o2.o oVar3 = (com.gamericefishpro.space.o2.o) listJ2.get(i6);
            s1 s1Var2 = (s1) this.a0.b(oVar3.g);
            if (s1Var2 != null && s().a(oVar3.g)) {
                B(oVar3, s1Var2);
            }
        }
    }

    public final boolean C(AccessibilityEvent accessibilityEvent) {
        if (!v()) {
            return false;
        }
        if (accessibilityEvent.getEventType() == 2048 || accessibilityEvent.getEventType() == 32768) {
            this.I = true;
        }
        try {
            return ((Boolean) this.y.invoke(accessibilityEvent)).booleanValue();
        } finally {
            this.I = false;
        }
    }

    public final boolean D(int i, int i2, Integer num, List list) {
        if (i == Integer.MIN_VALUE || !v()) {
            return false;
        }
        AccessibilityEvent accessibilityEventO = o(i, i2);
        if (num != null) {
            accessibilityEventO.setContentChangeTypes(num.intValue());
        }
        if (list != null) {
            accessibilityEventO.setContentDescription(com.gamericefishpro.space.e3.a.a(list, ",", null, 62));
        }
        return C(accessibilityEventO);
    }

    public final void F(String str, int i, int i2) {
        AccessibilityEvent accessibilityEventO = o(A(i), 32);
        accessibilityEventO.setContentChangeTypes(i2);
        if (str != null) {
            accessibilityEventO.getText().add(str);
        }
        C(accessibilityEventO);
    }

    public final void G(int i) {
        v vVar = this.S;
        if (vVar != null) {
            com.gamericefishpro.space.o2.o oVar = vVar.a;
            if (i != oVar.g) {
                return;
            }
            if (SystemClock.uptimeMillis() - vVar.f <= 1000) {
                AccessibilityEvent accessibilityEventO = o(A(oVar.g), 131072);
                accessibilityEventO.setFromIndex(vVar.d);
                accessibilityEventO.setToIndex(vVar.e);
                accessibilityEventO.setAction(vVar.b);
                accessibilityEventO.setMovementGranularity(vVar.c);
                accessibilityEventO.getText().add(t(oVar));
                C(accessibilityEventO);
            }
        }
        this.S = null;
    }

    /* JADX WARN: Code duplicated, block: B:246:0x0519  */
    /* JADX WARN: Code duplicated, block: B:248:0x051d  */
    /* JADX WARN: Code duplicated, block: B:293:0x064a  */
    /* JADX WARN: Code duplicated, block: B:52:0x0132  */
    /* JADX WARN: Code duplicated, block: B:54:0x013a  */
    /* JADX WARN: Code duplicated, block: B:56:0x0147  */
    /* JADX WARN: Code duplicated, block: B:60:0x0160  */
    /* JADX WARN: Code duplicated, block: B:64:0x0170  */
    public final void H(com.gamericefishpro.space.t.l lVar) {
        ArrayList arrayList;
        int[] iArr;
        long[] jArr;
        int i;
        Integer num;
        int i2;
        int i3;
        ArrayList arrayList2;
        int[] iArr2;
        long[] jArr2;
        int i4;
        int i5;
        int i6;
        Integer num2;
        com.gamericefishpro.space.o2.l lVar2;
        com.gamericefishpro.space.o2.o oVar;
        int i7;
        int i8;
        int i9;
        int i10;
        com.gamericefishpro.space.t.h0 h0Var;
        com.gamericefishpro.space.h2.f0 f0Var;
        int i11;
        com.gamericefishpro.space.o2.l lVar3;
        long j;
        int i12;
        Integer num3;
        com.gamericefishpro.space.t.h0 h0Var2;
        int i13;
        r1 r1Var;
        boolean z;
        com.gamericefishpro.space.o2.v vVar;
        r1 r1Var2;
        boolean z2;
        com.gamericefishpro.space.oh.d dVar;
        int i14;
        String str;
        int i15;
        int i16;
        int i17;
        Integer num4;
        AccessibilityEvent accessibilityEventP;
        String str2;
        com.gamericefishpro.space.t.l lVar4 = lVar;
        ArrayList arrayList3 = this.f0;
        ArrayList arrayList4 = new ArrayList(arrayList3);
        arrayList3.clear();
        int[] iArr3 = lVar4.b;
        long[] jArr3 = lVar4.a;
        int i18 = 2;
        int length = jArr3.length - 2;
        int i19 = 0;
        Integer num5 = 0;
        if (length < 0) {
            return;
        }
        int i20 = 0;
        while (true) {
            long j2 = jArr3[i20];
            int i21 = i18;
            int i22 = length;
            if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i23 = 8;
                int i24 = 8 - ((~(i20 - i22)) >>> 31);
                long j3 = j2;
                int i25 = i19;
                while (i25 < i24) {
                    if ((j3 & 255) < 128) {
                        int i26 = iArr3[(i20 << 3) + i25];
                        s1 s1Var = (s1) this.a0.b(i26);
                        if (s1Var == null) {
                            i3 = i25;
                            arrayList2 = arrayList4;
                            iArr2 = iArr3;
                            jArr2 = jArr3;
                            i4 = i24;
                            i5 = i19;
                            i6 = i20;
                            num2 = num5;
                        } else {
                            com.gamericefishpro.space.o2.l lVar5 = s1Var.a;
                            com.gamericefishpro.space.t.h0 h0Var3 = lVar5.d;
                            com.gamericefishpro.space.o2.p pVar = (com.gamericefishpro.space.o2.p) lVar4.b(i26);
                            int i27 = i23;
                            com.gamericefishpro.space.o2.o oVar2 = pVar != null ? pVar.a : null;
                            if (oVar2 == null) {
                                throw com.gamericefishpro.space.m5.a.e("no value for specified key");
                            }
                            com.gamericefishpro.space.h2.f0 f0Var2 = oVar2.c;
                            com.gamericefishpro.space.o2.l lVar6 = oVar2.d;
                            iArr2 = iArr3;
                            int i28 = oVar2.g;
                            jArr2 = jArr3;
                            com.gamericefishpro.space.t.h0 h0Var4 = lVar6.d;
                            i6 = i20;
                            Object[] objArr = h0Var4.b;
                            Object[] objArr2 = h0Var4.c;
                            long[] jArr4 = h0Var4.a;
                            i3 = i25;
                            int length2 = jArr4.length - 2;
                            if (length2 >= 0) {
                                com.gamericefishpro.space.h2.f0 f0Var3 = f0Var2;
                                i4 = i24;
                                int i29 = 0;
                                i9 = 0;
                                while (true) {
                                    long j4 = jArr4[i29];
                                    oVar = oVar2;
                                    int i30 = i29;
                                    if ((((~j4) << 7) & j4 & (-9187201950435737472L)) != -9187201950435737472L) {
                                        int i31 = 8 - ((~(i30 - length2)) >>> 31);
                                        int i32 = 0;
                                        while (i32 < i31) {
                                            if ((j4 & 255) < 128) {
                                                int i33 = (i30 << 3) + i32;
                                                Object obj = objArr[i33];
                                                i13 = length2;
                                                Object obj2 = objArr2[i33];
                                                lVar3 = lVar5;
                                                com.gamericefishpro.space.o2.v vVar2 = (com.gamericefishpro.space.o2.v) obj;
                                                j = j4;
                                                com.gamericefishpro.space.o2.v vVar3 = com.gamericefishpro.space.o2.s.u;
                                                if (Intrinsics.a(vVar2, vVar3) || Intrinsics.a(vVar2, com.gamericefishpro.space.o2.s.v)) {
                                                    int size = arrayList4.size();
                                                    int i34 = 0;
                                                    while (true) {
                                                        if (i34 >= size) {
                                                            r1Var = null;
                                                            break;
                                                        }
                                                        int i35 = size;
                                                        if (((r1) arrayList4.get(i34)).d == i26) {
                                                            r1Var = (r1) arrayList4.get(i34);
                                                            break;
                                                        } else {
                                                            i34++;
                                                            size = i35;
                                                        }
                                                    }
                                                    if (r1Var != null) {
                                                        z = false;
                                                    } else {
                                                        r1Var = new r1(i26, arrayList3);
                                                        z = true;
                                                    }
                                                    arrayList3.add(r1Var);
                                                } else {
                                                    z = false;
                                                }
                                                if (z) {
                                                    vVar = com.gamericefishpro.space.o2.s.d;
                                                    if (Intrinsics.a(vVar2, vVar)) {
                                                        Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.String");
                                                        str2 = (String) obj2;
                                                        if (h0Var3.c(vVar)) {
                                                            F(str2, i26, i27);
                                                        }
                                                        Unit unit = Unit.a;
                                                        i26 = i26;
                                                        arrayList4 = arrayList4;
                                                        i31 = i31;
                                                        i12 = 8;
                                                        num3 = num5;
                                                        h0Var2 = h0Var3;
                                                        i13 = i13;
                                                    } else if (!Intrinsics.a(vVar2, com.gamericefishpro.space.o2.s.b) || Intrinsics.a(vVar2, com.gamericefishpro.space.o2.s.H)) {
                                                        i26 = i26;
                                                        arrayList4 = arrayList4;
                                                        i31 = i31;
                                                        f0Var3 = f0Var3;
                                                        num3 = num5;
                                                        h0Var2 = h0Var3;
                                                        i13 = i13;
                                                        i12 = 8;
                                                        E(this, A(i26), 2048, 64, 8);
                                                        E(this, A(i26), 2048, num3, 8);
                                                    } else if (Intrinsics.a(vVar2, com.gamericefishpro.space.o2.s.c)) {
                                                        i12 = 8;
                                                        E(this, A(i26), 2048, 64, 8);
                                                        E(this, A(i26), 2048, num5, 8);
                                                        num3 = num5;
                                                        h0Var2 = h0Var3;
                                                        i13 = i13;
                                                    } else {
                                                        com.gamericefishpro.space.o2.v vVar4 = com.gamericefishpro.space.o2.s.G;
                                                        arrayList4 = arrayList4;
                                                        if (Intrinsics.a(vVar2, vVar4)) {
                                                            Object objG = h0Var4.g(com.gamericefishpro.space.o2.s.x);
                                                            if (objG == null) {
                                                                objG = null;
                                                            }
                                                            com.gamericefishpro.space.o2.h hVar = (com.gamericefishpro.space.o2.h) objG;
                                                            if (hVar != null && hVar.a == 4) {
                                                                Object objG2 = h0Var4.g(vVar4);
                                                                if (objG2 == null) {
                                                                    objG2 = null;
                                                                }
                                                                if (Intrinsics.a(objG2, Boolean.TRUE)) {
                                                                    AccessibilityEvent accessibilityEventO = o(A(i26), 4);
                                                                    com.gamericefishpro.space.o2.o oVar3 = oVar;
                                                                    f0Var3 = f0Var3;
                                                                    com.gamericefishpro.space.o2.o oVar4 = new com.gamericefishpro.space.o2.o(oVar3.a, true, f0Var3, lVar6);
                                                                    Object objG3 = oVar4.k().d.g(com.gamericefishpro.space.o2.s.a);
                                                                    if (objG3 == null) {
                                                                        objG3 = null;
                                                                    }
                                                                    List list = (List) objG3;
                                                                    oVar = oVar3;
                                                                    String strA = list != null ? com.gamericefishpro.space.e3.a.a(list, ",", null, 62) : null;
                                                                    Object objG4 = oVar4.k().d.g(com.gamericefishpro.space.o2.s.A);
                                                                    if (objG4 == null) {
                                                                        objG4 = null;
                                                                    }
                                                                    List list2 = (List) objG4;
                                                                    String strA2 = list2 != null ? com.gamericefishpro.space.e3.a.a(list2, ",", null, 62) : null;
                                                                    if (strA != null) {
                                                                        accessibilityEventO.setContentDescription(strA);
                                                                        Unit unit2 = Unit.a;
                                                                    }
                                                                    if (strA2 != null) {
                                                                        accessibilityEventO.getText().add(strA2);
                                                                    }
                                                                    C(accessibilityEventO);
                                                                } else {
                                                                    f0Var3 = f0Var3;
                                                                    E(this, A(i26), 2048, num5, 8);
                                                                }
                                                            } else {
                                                                f0Var3 = f0Var3;
                                                                E(this, A(i26), 2048, 64, 8);
                                                                E(this, A(i26), 2048, num5, 8);
                                                            }
                                                            num3 = num5;
                                                            i26 = i26;
                                                            h0Var2 = h0Var3;
                                                            i13 = i13;
                                                            i12 = 8;
                                                        } else {
                                                            i31 = i31;
                                                            f0Var3 = f0Var3;
                                                            if (Intrinsics.a(vVar2, com.gamericefishpro.space.o2.s.a)) {
                                                                int iA = A(i26);
                                                                Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
                                                                D(iA, 2048, 4, (List) obj2);
                                                                num3 = num5;
                                                                i26 = i26;
                                                                h0Var2 = h0Var3;
                                                            } else {
                                                                com.gamericefishpro.space.o2.v vVar5 = com.gamericefishpro.space.o2.s.E;
                                                                String str3 = "";
                                                                if (!Intrinsics.a(vVar2, vVar5)) {
                                                                    Integer num6 = num5;
                                                                    i26 = i26;
                                                                    h0Var2 = h0Var3;
                                                                    com.gamericefishpro.space.o2.v vVar6 = com.gamericefishpro.space.o2.s.F;
                                                                    if (Intrinsics.a(vVar2, vVar6)) {
                                                                        Object objG5 = h0Var4.g(vVar5);
                                                                        if (objG5 == null) {
                                                                            objG5 = null;
                                                                        }
                                                                        com.gamericefishpro.space.r2.e eVar = (com.gamericefishpro.space.r2.e) objG5;
                                                                        if (eVar != null && (str = eVar.e) != null) {
                                                                            str3 = str;
                                                                        }
                                                                        long j5 = ((com.gamericefishpro.space.r2.h0) lVar6.d(vVar6)).a;
                                                                        num3 = num6;
                                                                        C(p(A(i26), Integer.valueOf((int) (j5 >> 32)), Integer.valueOf((int) (j5 & 4294967295L)), Integer.valueOf(str3.length()), P(str3)));
                                                                        G(i28);
                                                                        Unit unit3 = Unit.a;
                                                                    } else {
                                                                        i13 = i13;
                                                                        num3 = num6;
                                                                        if (Intrinsics.a(vVar2, vVar3) || Intrinsics.a(vVar2, com.gamericefishpro.space.o2.s.v)) {
                                                                            w(f0Var3);
                                                                            int size2 = arrayList3.size();
                                                                            int i36 = 0;
                                                                            while (true) {
                                                                                if (i36 >= size2) {
                                                                                    r1Var2 = null;
                                                                                    break;
                                                                                } else {
                                                                                    if (((r1) arrayList3.get(i36)).d == i26) {
                                                                                        r1Var2 = (r1) arrayList3.get(i36);
                                                                                        break;
                                                                                    }
                                                                                    i36++;
                                                                                }
                                                                            }
                                                                            Intrinsics.b(r1Var2);
                                                                            Object objG6 = h0Var4.g(vVar3);
                                                                            if (objG6 == null) {
                                                                                objG6 = null;
                                                                            }
                                                                            r1Var2.w = (com.gamericefishpro.space.o2.i) objG6;
                                                                            Object objG7 = h0Var4.g(com.gamericefishpro.space.o2.s.v);
                                                                            if (objG7 == null) {
                                                                                objG7 = null;
                                                                            }
                                                                            r1Var2.y = (com.gamericefishpro.space.o2.i) objG7;
                                                                            if (r1Var2.e.contains(r1Var2)) {
                                                                                this.v.getSnapshotObserver().a.c(r1Var2, this.g0, new com.gamericefishpro.space.b2.b(6, r1Var2, this));
                                                                            }
                                                                            Unit unit4 = Unit.a;
                                                                        } else if (Intrinsics.a(vVar2, com.gamericefishpro.space.o2.s.k)) {
                                                                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.Boolean");
                                                                            if (((Boolean) obj2).booleanValue()) {
                                                                                i14 = 8;
                                                                                C(o(A(i28), 8));
                                                                            } else {
                                                                                i14 = 8;
                                                                            }
                                                                            E(this, A(i28), 2048, num3, i14);
                                                                            i12 = i14;
                                                                        } else {
                                                                            com.gamericefishpro.space.o2.v vVar7 = com.gamericefishpro.space.o2.k.w;
                                                                            if (Intrinsics.a(vVar2, vVar7)) {
                                                                                List list3 = (List) lVar6.d(vVar7);
                                                                                Object objG8 = h0Var2.g(vVar7);
                                                                                if (objG8 == null) {
                                                                                    objG8 = null;
                                                                                }
                                                                                List list4 = (List) objG8;
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
                                                                                    i9 = (linkedHashSet.containsAll(linkedHashSet2) && linkedHashSet2.containsAll(linkedHashSet)) ? 0 : 1;
                                                                                } else if (!list3.isEmpty()) {
                                                                                    i9 = 1;
                                                                                }
                                                                                Unit unit5 = Unit.a;
                                                                            } else {
                                                                                if (obj2 instanceof com.gamericefishpro.space.o2.a) {
                                                                                    com.gamericefishpro.space.o2.a aVar = (com.gamericefishpro.space.o2.a) obj2;
                                                                                    Object objG9 = h0Var2.g(vVar2);
                                                                                    if (objG9 == null) {
                                                                                        objG9 = null;
                                                                                    }
                                                                                    if (aVar != objG9) {
                                                                                        if (objG9 instanceof com.gamericefishpro.space.o2.a) {
                                                                                            String str4 = aVar.a;
                                                                                            com.gamericefishpro.space.o2.a aVar2 = (com.gamericefishpro.space.o2.a) objG9;
                                                                                            com.gamericefishpro.space.oh.d dVar2 = aVar2.b;
                                                                                            if (Intrinsics.a(str4, aVar2.a) && (((dVar = aVar.b) != null || dVar2 == null) && (dVar == null || dVar2 != null))) {
                                                                                                z2 = true;
                                                                                            }
                                                                                        }
                                                                                        z2 = false;
                                                                                    } else {
                                                                                        z2 = true;
                                                                                    }
                                                                                    if (z2) {
                                                                                        i9 = 0;
                                                                                    } else {
                                                                                        i9 = 1;
                                                                                    }
                                                                                } else {
                                                                                    i9 = 1;
                                                                                }
                                                                                Unit unit6 = Unit.a;
                                                                            }
                                                                        }
                                                                    }
                                                                    i12 = 8;
                                                                } else if (h0Var4.c(com.gamericefishpro.space.o2.k.k)) {
                                                                    Object objG10 = h0Var3.g(vVar5);
                                                                    if (objG10 == null) {
                                                                        objG10 = null;
                                                                    }
                                                                    com.gamericefishpro.space.r2.e eVar2 = (com.gamericefishpro.space.r2.e) objG10;
                                                                    if (eVar2 == null) {
                                                                        eVar2 = "";
                                                                    }
                                                                    Object objG11 = h0Var4.g(vVar5);
                                                                    if (objG11 == null) {
                                                                        objG11 = null;
                                                                    }
                                                                    CharSequence charSequence = (com.gamericefishpro.space.r2.e) objG11;
                                                                    if (charSequence == null) {
                                                                        charSequence = "";
                                                                    }
                                                                    CharSequence charSequenceP = P(charSequence);
                                                                    int length3 = eVar2.length();
                                                                    int length4 = charSequence.length();
                                                                    int i37 = length3 > length4 ? length4 : length3;
                                                                    Integer num7 = num5;
                                                                    int i38 = 0;
                                                                    while (true) {
                                                                        i15 = length3;
                                                                        if (i38 >= i37) {
                                                                            i16 = length4;
                                                                            break;
                                                                        }
                                                                        i16 = length4;
                                                                        if (eVar2.charAt(i38) != charSequence.charAt(i38)) {
                                                                            break;
                                                                        }
                                                                        i38++;
                                                                        length3 = i15;
                                                                        length4 = i16;
                                                                    }
                                                                    int i39 = 0;
                                                                    while (true) {
                                                                        if (i39 >= i37 - i38) {
                                                                            i17 = i39;
                                                                            break;
                                                                        }
                                                                        i17 = i39;
                                                                        if (eVar2.charAt((i15 - 1) - i39) != charSequence.charAt((i16 - 1) - i17)) {
                                                                            break;
                                                                        } else {
                                                                            i39 = i17 + 1;
                                                                        }
                                                                    }
                                                                    int i40 = (i15 - i17) - i38;
                                                                    int i41 = (i16 - i17) - i38;
                                                                    com.gamericefishpro.space.o2.v vVar8 = com.gamericefishpro.space.o2.s.I;
                                                                    boolean zC = h0Var3.c(vVar8);
                                                                    boolean zC2 = h0Var4.c(vVar8);
                                                                    boolean zC3 = h0Var3.c(com.gamericefishpro.space.o2.s.E);
                                                                    boolean z3 = zC3 && !zC && zC2;
                                                                    boolean z4 = zC3 && zC && !zC2;
                                                                    if (z3 || z4) {
                                                                        i26 = i26;
                                                                        num4 = num7;
                                                                        accessibilityEventP = p(A(i26), num4, num7, Integer.valueOf(i16), charSequenceP);
                                                                    } else {
                                                                        accessibilityEventP = o(A(i26), 16);
                                                                        accessibilityEventP.setFromIndex(i38);
                                                                        accessibilityEventP.setRemovedCount(i40);
                                                                        accessibilityEventP.setAddedCount(i41);
                                                                        accessibilityEventP.setBeforeText(eVar2);
                                                                        accessibilityEventP.getText().add(charSequenceP);
                                                                        i26 = i26;
                                                                        num4 = num7;
                                                                    }
                                                                    accessibilityEventP.setClassName("android.widget.EditText");
                                                                    C(accessibilityEventP);
                                                                    if (z3 || z4) {
                                                                        long j6 = ((com.gamericefishpro.space.r2.h0) lVar6.d(com.gamericefishpro.space.o2.s.F)).a;
                                                                        accessibilityEventP.setFromIndex((int) (j6 >> 32));
                                                                        accessibilityEventP.setToIndex((int) (j6 & 4294967295L));
                                                                        C(accessibilityEventP);
                                                                    }
                                                                    Unit unit7 = Unit.a;
                                                                    num3 = num4;
                                                                    h0Var2 = h0Var3;
                                                                    i12 = 8;
                                                                } else {
                                                                    Integer num8 = num5;
                                                                    i26 = i26;
                                                                    i12 = 8;
                                                                    E(this, A(i26), 2048, Integer.valueOf(i21), 8);
                                                                    i13 = i13;
                                                                    num3 = num8;
                                                                    h0Var2 = h0Var3;
                                                                }
                                                            }
                                                            i12 = 8;
                                                        }
                                                    }
                                                } else {
                                                    Object objG12 = h0Var3.g(vVar2);
                                                    if (objG12 == null) {
                                                        objG12 = null;
                                                    }
                                                    if (Intrinsics.a(obj2, objG12)) {
                                                        i12 = i27;
                                                    } else {
                                                        vVar = com.gamericefishpro.space.o2.s.d;
                                                        if (Intrinsics.a(vVar2, vVar)) {
                                                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.String");
                                                            str2 = (String) obj2;
                                                            if (h0Var3.c(vVar)) {
                                                                F(str2, i26, i27);
                                                            }
                                                            Unit unit8 = Unit.a;
                                                            i26 = i26;
                                                            arrayList4 = arrayList4;
                                                            i31 = i31;
                                                            i12 = 8;
                                                            num3 = num5;
                                                            h0Var2 = h0Var3;
                                                            i13 = i13;
                                                        } else if (Intrinsics.a(vVar2, com.gamericefishpro.space.o2.s.b)) {
                                                            i26 = i26;
                                                            arrayList4 = arrayList4;
                                                            i31 = i31;
                                                            f0Var3 = f0Var3;
                                                            num3 = num5;
                                                            h0Var2 = h0Var3;
                                                            i13 = i13;
                                                            i12 = 8;
                                                            E(this, A(i26), 2048, 64, 8);
                                                            E(this, A(i26), 2048, num3, 8);
                                                        } else {
                                                            i26 = i26;
                                                            arrayList4 = arrayList4;
                                                            i31 = i31;
                                                            f0Var3 = f0Var3;
                                                            num3 = num5;
                                                            h0Var2 = h0Var3;
                                                            i13 = i13;
                                                            i12 = 8;
                                                            E(this, A(i26), 2048, 64, 8);
                                                            E(this, A(i26), 2048, num3, 8);
                                                        }
                                                    }
                                                    num3 = num5;
                                                    h0Var2 = h0Var3;
                                                    i13 = i13;
                                                }
                                            } else {
                                                lVar3 = lVar5;
                                                arrayList4 = arrayList4;
                                                j = j4;
                                                i31 = i31;
                                                i32 = i32;
                                                i12 = i27;
                                                f0Var3 = f0Var3;
                                                num3 = num5;
                                                i26 = i26;
                                                h0Var2 = h0Var3;
                                                i13 = length2;
                                            }
                                            i27 = i12;
                                            h0Var3 = h0Var2;
                                            f0Var3 = f0Var3;
                                            i31 = i31;
                                            i32++;
                                            length2 = i13;
                                            num5 = num3;
                                            arrayList4 = arrayList4;
                                            i26 = i26;
                                            j4 = j >> i12;
                                            lVar5 = lVar3;
                                        }
                                        i8 = i26;
                                        lVar2 = lVar5;
                                        arrayList2 = arrayList4;
                                        f0Var = f0Var3;
                                        i7 = 1;
                                        num2 = num5;
                                        i11 = length2;
                                        int i42 = i31;
                                        h0Var = h0Var3;
                                        i5 = 0;
                                        if (i42 != i27) {
                                            break;
                                        }
                                    } else {
                                        i8 = i26;
                                        lVar2 = lVar5;
                                        h0Var = h0Var3;
                                        arrayList2 = arrayList4;
                                        f0Var = f0Var3;
                                        i5 = 0;
                                        i7 = 1;
                                        num2 = num5;
                                        i11 = length2;
                                    }
                                    if (i30 == i11) {
                                        break;
                                    }
                                    i26 = i8;
                                    h0Var3 = h0Var;
                                    f0Var3 = f0Var;
                                    oVar2 = oVar;
                                    lVar5 = lVar2;
                                    i27 = 8;
                                    i29 = i30 + 1;
                                    length2 = i11;
                                    num5 = num2;
                                    arrayList4 = arrayList2;
                                }
                            } else {
                                lVar2 = lVar5;
                                arrayList2 = arrayList4;
                                i4 = i24;
                                oVar = oVar2;
                                i5 = 0;
                                i7 = 1;
                                num2 = num5;
                                i8 = i26;
                                i9 = 0;
                            }
                            if (i9 == 0) {
                                Iterator it = lVar2.iterator();
                                while (true) {
                                    if (!it.hasNext()) {
                                        i10 = i5;
                                        break;
                                    } else {
                                        if (!oVar.k().d.c((com.gamericefishpro.space.o2.v) ((Map.Entry) it.next()).getKey())) {
                                            i10 = i7;
                                            break;
                                        }
                                    }
                                }
                                i9 = i10;
                            }
                            if (i9 != 0) {
                                i23 = 8;
                                E(this, A(i8), 2048, num2, 8);
                            } else {
                                i23 = 8;
                            }
                        }
                    } else {
                        i3 = i25;
                        arrayList2 = arrayList4;
                        iArr2 = iArr3;
                        jArr2 = jArr3;
                        i4 = i24;
                        i5 = i19;
                        i6 = i20;
                        num2 = num5;
                    }
                    j3 >>= i23;
                    i25 = i3 + 1;
                    lVar4 = lVar;
                    i19 = i5;
                    num5 = num2;
                    iArr3 = iArr2;
                    jArr3 = jArr2;
                    i20 = i6;
                    i24 = i4;
                    arrayList4 = arrayList2;
                }
                arrayList = arrayList4;
                iArr = iArr3;
                jArr = jArr3;
                i = i19;
                int i43 = i20;
                num = num5;
                if (i24 != i23) {
                    return;
                } else {
                    i2 = i43;
                }
            } else {
                arrayList = arrayList4;
                iArr = iArr3;
                jArr = jArr3;
                i = i19;
                num = num5;
                i2 = i20;
            }
            if (i2 == i22) {
                return;
            }
            i20 = i2 + 1;
            lVar4 = lVar;
            length = i22;
            i19 = i;
            num5 = num;
            i18 = i21;
            iArr3 = iArr;
            jArr3 = jArr;
            arrayList4 = arrayList;
        }
    }

    public final void I(com.gamericefishpro.space.h2.f0 f0Var, com.gamericefishpro.space.t.x xVar) {
        com.gamericefishpro.space.o2.l lVarX;
        if (f0Var.H() && !this.v.getAndroidViewsHandler$ui().getLayoutNodeToHolder().containsKey(f0Var)) {
            com.gamericefishpro.space.h2.f0 f0Var2 = null;
            if (!f0Var.Z.d(8)) {
                f0Var = f0Var.v();
                while (true) {
                    if (f0Var == null) {
                        f0Var = null;
                        break;
                    } else if (f0Var.Z.d(8)) {
                        break;
                    } else {
                        f0Var = f0Var.v();
                    }
                }
            }
            if (f0Var == null || (lVarX = f0Var.x()) == null) {
                return;
            }
            if (!lVarX.i) {
                for (com.gamericefishpro.space.h2.f0 f0VarV = f0Var.v(); f0VarV != null; f0VarV = f0VarV.v()) {
                    com.gamericefishpro.space.o2.l lVarX2 = f0VarV.x();
                    if (lVarX2 != null && lVarX2.i) {
                        f0Var2 = f0VarV;
                        break;
                    }
                }
                if (f0Var2 != null) {
                    f0Var = f0Var2;
                }
            }
            int i = f0Var.e;
            if (xVar.a(i)) {
                E(this, A(i), 2048, 1, 8);
            }
        }
    }

    public final void J(com.gamericefishpro.space.h2.f0 f0Var) {
        if (f0Var.H() && !this.v.getAndroidViewsHandler$ui().getLayoutNodeToHolder().containsKey(f0Var)) {
            int i = f0Var.e;
            com.gamericefishpro.space.o2.i iVar = (com.gamericefishpro.space.o2.i) this.J.b(i);
            com.gamericefishpro.space.o2.i iVar2 = (com.gamericefishpro.space.o2.i) this.K.b(i);
            if (iVar == null && iVar2 == null) {
                return;
            }
            AccessibilityEvent accessibilityEventO = o(i, 4096);
            if (iVar != null) {
                accessibilityEventO.setScrollX((int) ((Number) iVar.a.invoke()).floatValue());
                accessibilityEventO.setMaxScrollX((int) ((Number) iVar.b.invoke()).floatValue());
            }
            if (iVar2 != null) {
                accessibilityEventO.setScrollY((int) ((Number) iVar2.a.invoke()).floatValue());
                accessibilityEventO.setMaxScrollY((int) ((Number) iVar2.b.invoke()).floatValue());
            }
            C(accessibilityEventO);
        }
    }

    public final boolean K(com.gamericefishpro.space.o2.o oVar, int i, int i2, boolean z) {
        String strT;
        com.gamericefishpro.space.o2.l lVar = oVar.d;
        int i3 = oVar.g;
        com.gamericefishpro.space.o2.v vVar = com.gamericefishpro.space.o2.k.j;
        if (lVar.d.c(vVar) && f0.b(oVar)) {
            com.gamericefishpro.space.di.c cVar = (com.gamericefishpro.space.di.c) ((com.gamericefishpro.space.o2.a) oVar.d.d(vVar)).b;
            if (cVar != null) {
                return ((Boolean) cVar.a(Integer.valueOf(i), Integer.valueOf(i2), Boolean.valueOf(z))).booleanValue();
            }
        } else if ((i != i2 || i2 != this.N) && (strT = t(oVar)) != null) {
            if (i < 0 || i != i2 || i2 > strT.length()) {
                i = -1;
            }
            this.N = i;
            boolean z2 = strT.length() > 0;
            C(p(A(i3), z2 ? Integer.valueOf(this.N) : null, z2 ? Integer.valueOf(this.N) : null, z2 ? Integer.valueOf(strT.length()) : null, strT));
            G(i3);
            return true;
        }
        return false;
    }

    public final Rect M(float f, float f2, float f3, float f4) {
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(f2)) & 4294967295L) | (Float.floatToRawIntBits(f) << 32);
        t tVar = this.v;
        long jT = tVar.t(jFloatToRawIntBits);
        long jT2 = tVar.t((((long) Float.floatToRawIntBits(f4)) & 4294967295L) | (Float.floatToRawIntBits(f3) << 32));
        int i = (int) (jT >> 32);
        int i2 = (int) (jT2 >> 32);
        int i3 = (int) (jT & 4294967295L);
        int i4 = (int) (jT2 & 4294967295L);
        return new Rect((int) Math.floor(Math.min(Float.intBitsToFloat(i), Float.intBitsToFloat(i2))), (int) Math.floor(Math.min(Float.intBitsToFloat(i3), Float.intBitsToFloat(i4))), (int) Math.ceil(Math.max(Float.intBitsToFloat(i), Float.intBitsToFloat(i2))), (int) Math.ceil(Math.max(Float.intBitsToFloat(i3), Float.intBitsToFloat(i4))));
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0064  */
    /* JADX WARN: Code duplicated, block: B:20:0x006f  */
    /* JADX WARN: Code duplicated, block: B:23:0x007c  */
    /* JADX WARN: Multi-variable type inference failed */
    public final void Q() {
        long j;
        long j2;
        long j3;
        char c;
        long[] jArr;
        long[] jArr2;
        long j4;
        int i;
        int iNumberOfTrailingZeros;
        char c2;
        s1 s1Var;
        com.gamericefishpro.space.t.x elements = new com.gamericefishpro.space.t.x();
        com.gamericefishpro.space.t.x xVar = this.U;
        int[] iArr = xVar.b;
        long[] jArr3 = xVar.a;
        int length = jArr3.length - 2;
        com.gamericefishpro.space.t.w wVar = this.a0;
        int i2 = 8;
        if (length >= 0) {
            int i3 = 0;
            j = 128;
            j2 = 255;
            while (true) {
                long j5 = jArr3[i3];
                char c3 = 7;
                j3 = -9187201950435737472L;
                if ((((~j5) << 7) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i4 = 8 - ((~(i3 - length)) >>> 31);
                    int i5 = 0;
                    while (i5 < i4) {
                        if ((j5 & 255) < 128) {
                            int i6 = iArr[(i3 << 3) + i5];
                            c2 = c3;
                            com.gamericefishpro.space.o2.p pVar = (com.gamericefishpro.space.o2.p) s().b(i6);
                            Object obj = null;
                            com.gamericefishpro.space.o2.o oVar = pVar != null ? pVar.a : null;
                            if (oVar != null) {
                                if (!oVar.d.d.c(com.gamericefishpro.space.o2.s.d)) {
                                    elements.a(i6);
                                    s1Var = (s1) wVar.b(i6);
                                    if (s1Var != null) {
                                        Object objG = s1Var.a.d.g(com.gamericefishpro.space.o2.s.d);
                                        obj = (String) (objG != null ? objG : null);
                                    }
                                    F(obj, i6, 32);
                                }
                            } else {
                                elements.a(i6);
                                s1Var = (s1) wVar.b(i6);
                                if (s1Var != null) {
                                    Object objG2 = s1Var.a.d.g(com.gamericefishpro.space.o2.s.d);
                                    obj = (String) (objG2 != null ? objG2 : null);
                                }
                                F(obj, i6, 32);
                            }
                        } else {
                            c2 = c3;
                        }
                        j5 >>= 8;
                        i5++;
                        c3 = c2;
                    }
                    c = c3;
                    if (i4 != 8) {
                        break;
                    }
                } else {
                    c = 7;
                }
                if (i3 == length) {
                    break;
                } else {
                    i3++;
                }
            }
        } else {
            j = 128;
            j2 = 255;
            j3 = -9187201950435737472L;
            c = 7;
        }
        Intrinsics.checkNotNullParameter(elements, "elements");
        Intrinsics.checkNotNullParameter(elements, "elements");
        int[] iArr2 = elements.b;
        long[] jArr4 = elements.a;
        int length2 = jArr4.length - 2;
        if (length2 >= 0) {
            int i7 = 0;
            while (true) {
                long j6 = jArr4[i7];
                if ((((~j6) << c) & j6 & j3) != j3) {
                    int i8 = 8 - ((~(i7 - length2)) >>> 31);
                    int i9 = 0;
                    while (i9 < i8) {
                        if ((j6 & j2) < j) {
                            int i10 = iArr2[(i7 << 3) + i9];
                            int iHashCode = Integer.hashCode(i10) * (-862048943);
                            int i11 = iHashCode ^ (iHashCode << 16);
                            int i12 = i11 & 127;
                            int i13 = xVar.c;
                            int i14 = (i11 >>> 7) & i13;
                            i = i2;
                            int i15 = 0;
                            while (true) {
                                long[] jArr5 = xVar.a;
                                int i16 = i14 >> 3;
                                jArr2 = jArr4;
                                int i17 = (i14 & 7) << 3;
                                j4 = j6;
                                long j7 = (jArr5[i16] >>> i17) | ((jArr5[i16 + 1] << (64 - i17)) & ((-i17) >> 63));
                                int i18 = i13;
                                long j8 = (((long) i12) * 72340172838076673L) ^ j7;
                                long j9 = (j8 - 72340172838076673L) & (~j8) & j3;
                                while (j9 != 0) {
                                    iNumberOfTrailingZeros = (i14 + (Long.numberOfTrailingZeros(j9) >> 3)) & i18;
                                    int i19 = i18;
                                    if (xVar.b[iNumberOfTrailingZeros] == i10) {
                                        break;
                                    }
                                    j9 &= j9 - 1;
                                    i18 = i19;
                                }
                                int i20 = i18;
                                if ((j7 & ((~j7) << 6) & j3) != 0) {
                                    iNumberOfTrailingZeros = -1;
                                    break;
                                }
                                i15 += 8;
                                i14 = (i14 + i15) & i20;
                                jArr4 = jArr2;
                                i13 = i20;
                                j6 = j4;
                            }
                            int i21 = iNumberOfTrailingZeros;
                            if (i21 >= 0) {
                                xVar.f(i21);
                            }
                        } else {
                            jArr2 = jArr4;
                            j4 = j6;
                            i = i2;
                        }
                        j6 = j4 >> i;
                        i9++;
                        i2 = i;
                        jArr4 = jArr2;
                    }
                    jArr = jArr4;
                    if (i8 != i2) {
                        break;
                    }
                } else {
                    jArr = jArr4;
                }
                if (i7 == length2) {
                    break;
                }
                i7++;
                jArr4 = jArr;
                i2 = 8;
            }
        }
        wVar.c();
        com.gamericefishpro.space.t.l lVarS = s();
        int[] iArr3 = lVarS.b;
        Object[] objArr = lVarS.c;
        long[] jArr6 = lVarS.a;
        int length3 = jArr6.length - 2;
        if (length3 >= 0) {
            int i22 = 0;
            while (true) {
                long j10 = jArr6[i22];
                if ((((~j10) << c) & j10 & j3) != j3) {
                    int i23 = 8 - ((~(i22 - length3)) >>> 31);
                    for (int i24 = 0; i24 < i23; i24++) {
                        if ((j10 & j2) < j) {
                            int i25 = (i22 << 3) + i24;
                            int i26 = iArr3[i25];
                            com.gamericefishpro.space.o2.o oVar2 = ((com.gamericefishpro.space.o2.p) objArr[i25]).a;
                            com.gamericefishpro.space.o2.l lVar = oVar2.d;
                            com.gamericefishpro.space.o2.v vVar = com.gamericefishpro.space.o2.s.d;
                            if (lVar.d.c(vVar) && xVar.a(i26)) {
                                F((String) oVar2.d.d(vVar), i26, 16);
                            }
                            wVar.h(i26, new s1(oVar2, s()));
                        }
                        j10 >>= 8;
                    }
                    if (i23 != 8) {
                        break;
                    }
                }
                if (i22 == length3) {
                    break;
                } else {
                    i22++;
                }
            }
        }
        this.b0 = new s1(this.v.getSemanticsOwner().a(), s());
    }

    @Override // com.gamericefishpro.space.d4.b
    public final com.gamericefishpro.space.vb.c b(View view) {
        return this.D;
    }

    public final void j(int i, com.gamericefishpro.space.e4.h hVar, String str, Bundle bundle) {
        com.gamericefishpro.space.o2.o oVar;
        float fH;
        float fH2;
        float fG;
        float fG2;
        RectF rectF;
        AccessibilityNodeInfo accessibilityNodeInfo = hVar.a;
        com.gamericefishpro.space.o2.p pVar = (com.gamericefishpro.space.o2.p) s().b(i);
        if (pVar == null || (oVar = pVar.a) == null) {
            return;
        }
        com.gamericefishpro.space.h2.f0 f0Var = oVar.c;
        com.gamericefishpro.space.o2.l lVar = oVar.d;
        com.gamericefishpro.space.t.h0 h0Var = lVar.d;
        String strT = t(oVar);
        if (Intrinsics.a(str, this.X)) {
            int iD = this.V.d(i);
            if (iD != -1) {
                accessibilityNodeInfo.getExtras().putInt(str, iD);
                return;
            }
            return;
        }
        if (Intrinsics.a(str, this.Y)) {
            int iD2 = this.W.d(i);
            if (iD2 != -1) {
                accessibilityNodeInfo.getExtras().putInt(str, iD2);
                return;
            }
            return;
        }
        boolean zC = h0Var.c(com.gamericefishpro.space.o2.k.a);
        t tVar = this.v;
        boolean z = false;
        if (!zC || bundle == null || !Intrinsics.a(str, "android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_KEY")) {
            com.gamericefishpro.space.o2.v vVar = com.gamericefishpro.space.o2.s.y;
            if (h0Var.c(vVar) && bundle != null && Intrinsics.a(str, "androidx.compose.ui.semantics.testTag")) {
                Object objG = h0Var.g(vVar);
                String str2 = (String) (objG == null ? null : objG);
                if (str2 != null) {
                    accessibilityNodeInfo.getExtras().putCharSequence(str, str2);
                    return;
                }
                return;
            }
            if (Intrinsics.a(str, "androidx.compose.ui.semantics.id")) {
                accessibilityNodeInfo.getExtras().putInt(str, oVar.g);
                return;
            }
            if (Intrinsics.a(str, "androidx.compose.ui.semantics.shapeType")) {
                Object objG2 = h0Var.g(com.gamericefishpro.space.o2.s.N);
                com.gamericefishpro.space.o1.k0 k0Var = (com.gamericefishpro.space.o1.k0) (objG2 == null ? null : objG2);
                if (k0Var != null) {
                    Rect rect = new Rect();
                    accessibilityNodeInfo.getBoundsInScreen(rect);
                    com.gamericefishpro.space.n1.c cVarU = u(oVar, rect, k0Var);
                    float f = cVarU.b;
                    float f2 = cVarU.a;
                    com.gamericefishpro.space.o1.o oVarA = k0Var.a(cVarU.b(), f0Var.T, tVar.getDensity());
                    if (oVarA instanceof com.gamericefishpro.space.o1.c0) {
                        accessibilityNodeInfo.getExtras().putInt("androidx.compose.ui.semantics.shapeType", 0);
                        accessibilityNodeInfo.getExtras().putParcelable("androidx.compose.ui.semantics.shapeRect", L(oVarA, f2, f));
                        return;
                    } else if (oVarA instanceof com.gamericefishpro.space.o1.d0) {
                        accessibilityNodeInfo.getExtras().putInt("androidx.compose.ui.semantics.shapeType", 1);
                        accessibilityNodeInfo.getExtras().putParcelable("androidx.compose.ui.semantics.shapeRect", L(oVarA, f2, f));
                        accessibilityNodeInfo.getExtras().putFloatArray("androidx.compose.ui.semantics.shapeCorners", N(oVarA));
                        return;
                    } else {
                        if (!(oVarA instanceof com.gamericefishpro.space.o1.b0)) {
                            throw new com.gamericefishpro.space.oh.k();
                        }
                        accessibilityNodeInfo.getExtras().putInt("androidx.compose.ui.semantics.shapeType", 2);
                        accessibilityNodeInfo.getExtras().putParcelable("androidx.compose.ui.semantics.shapeRegion", O(oVarA, f2, f));
                        return;
                    }
                }
                return;
            }
            if (Intrinsics.a(str, "androidx.compose.ui.semantics.shapeRect")) {
                Object objG3 = h0Var.g(com.gamericefishpro.space.o2.s.N);
                com.gamericefishpro.space.o1.k0 k0Var2 = (com.gamericefishpro.space.o1.k0) (objG3 == null ? null : objG3);
                if (k0Var2 != null) {
                    Rect rect2 = new Rect();
                    accessibilityNodeInfo.getBoundsInScreen(rect2);
                    com.gamericefishpro.space.n1.c cVarU2 = u(oVar, rect2, k0Var2);
                    Rect rectL = L(k0Var2.a(cVarU2.b(), f0Var.T, tVar.getDensity()), cVarU2.a, cVarU2.b);
                    if (rectL != null) {
                        accessibilityNodeInfo.getExtras().putParcelable("androidx.compose.ui.semantics.shapeRect", rectL);
                        return;
                    }
                    return;
                }
                return;
            }
            if (Intrinsics.a(str, "androidx.compose.ui.semantics.shapeCorners")) {
                Object objG4 = h0Var.g(com.gamericefishpro.space.o2.s.N);
                com.gamericefishpro.space.o1.k0 k0Var3 = (com.gamericefishpro.space.o1.k0) (objG4 == null ? null : objG4);
                if (k0Var3 != null) {
                    Rect rect3 = new Rect();
                    accessibilityNodeInfo.getBoundsInScreen(rect3);
                    float[] fArrN = N(k0Var3.a(u(oVar, rect3, k0Var3).b(), f0Var.T, tVar.getDensity()));
                    if (fArrN != null) {
                        accessibilityNodeInfo.getExtras().putFloatArray("androidx.compose.ui.semantics.shapeCorners", fArrN);
                        return;
                    }
                    return;
                }
                return;
            }
            if (Intrinsics.a(str, "androidx.compose.ui.semantics.shapeRegion")) {
                Object objG5 = h0Var.g(com.gamericefishpro.space.o2.s.N);
                com.gamericefishpro.space.o1.k0 k0Var4 = (com.gamericefishpro.space.o1.k0) (objG5 == null ? null : objG5);
                if (k0Var4 != null) {
                    Rect rect4 = new Rect();
                    accessibilityNodeInfo.getBoundsInScreen(rect4);
                    com.gamericefishpro.space.n1.c cVarU3 = u(oVar, rect4, k0Var4);
                    Region regionO = O(k0Var4.a(cVarU3.b(), f0Var.T, tVar.getDensity()), cVarU3.a, cVarU3.b);
                    if (regionO != null) {
                        accessibilityNodeInfo.getExtras().putParcelable("androidx.compose.ui.semantics.shapeRegion", regionO);
                        return;
                    }
                    return;
                }
                return;
            }
            return;
        }
        int i2 = bundle.getInt("android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_ARG_START_INDEX", -1);
        int i3 = bundle.getInt("android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_ARG_LENGTH", -1);
        if (i3 > 0 && i2 >= 0) {
            if (i2 < (strT != null ? strT.length() : Integer.MAX_VALUE)) {
                com.gamericefishpro.space.r2.f0 f0VarK = f0.k(lVar);
                if (f0VarK == null) {
                    return;
                }
                ArrayList arrayList = new ArrayList();
                int i4 = 0;
                while (i4 < i3) {
                    int i5 = i2 + i4;
                    if (i5 >= f0VarK.a.a.e.length()) {
                        arrayList.add(z);
                    } else {
                        com.gamericefishpro.space.f1.k kVar = f0VarK.b;
                        com.gamericefishpro.space.r2.e eVar = (com.gamericefishpro.space.r2.e) ((com.gamericefishpro.space.b1.d) kVar.c).e;
                        if (i5 < 0 || i5 >= eVar.e.length()) {
                            StringBuilder sbK = com.gamericefishpro.space.m5.a.k(i5, "offset(", ") is out of bounds [0, ");
                            sbK.append(eVar.e.length());
                            sbK.append(')');
                            com.gamericefishpro.space.w2.a.a(sbK.toString());
                        }
                        ArrayList arrayList2 = (ArrayList) kVar.e;
                        com.gamericefishpro.space.r2.m mVar = (com.gamericefishpro.space.r2.m) arrayList2.get(com.gamericefishpro.space.r2.a0.c(i5, arrayList2));
                        com.gamericefishpro.space.r2.a aVar = mVar.a;
                        int iA = mVar.a(i5);
                        CharSequence charSequence = aVar.e;
                        if (iA < 0 || iA >= charSequence.length()) {
                            StringBuilder sbK2 = com.gamericefishpro.space.m5.a.k(iA, "offset(", ") is out of bounds [0,");
                            sbK2.append(charSequence.length());
                            sbK2.append(')');
                            com.gamericefishpro.space.w2.a.a(sbK2.toString());
                        }
                        com.gamericefishpro.space.s2.i iVar = aVar.d;
                        Layout layout = iVar.e;
                        int lineForOffset = layout.getLineForOffset(iA);
                        float f3 = iVar.f(lineForOffset);
                        float fD = iVar.d(lineForOffset);
                        boolean z2 = layout.getParagraphDirection(lineForOffset) == 1;
                        boolean zIsRtlCharAt = layout.isRtlCharAt(iA);
                        if (!z2 || zIsRtlCharAt) {
                            if (z2 && zIsRtlCharAt) {
                                fG = iVar.h(iA, false);
                                fG2 = iVar.h(iA + 1, true);
                            } else if (zIsRtlCharAt) {
                                fG = iVar.g(iA, false);
                                fG2 = iVar.g(iA + 1, true);
                            } else {
                                fH = iVar.h(iA, false);
                                fH2 = iVar.h(iA + 1, true);
                            }
                            float f4 = fG;
                            fH = fG2;
                            fH2 = f4;
                        } else {
                            fH = iVar.g(iA, false);
                            fH2 = iVar.g(iA + 1, true);
                        }
                        RectF rectF2 = new RectF(fH, f3, fH2, fD);
                        float f5 = rectF2.left;
                        float f6 = rectF2.top;
                        float f7 = rectF2.right;
                        float f8 = rectF2.bottom;
                        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(mVar.f)) & 4294967295L) | (((long) Float.floatToRawIntBits(0.0f)) << 32);
                        int i6 = (int) (jFloatToRawIntBits >> 32);
                        float fIntBitsToFloat = Float.intBitsToFloat(i6) + f5;
                        int i7 = (int) (jFloatToRawIntBits & 4294967295L);
                        com.gamericefishpro.space.n1.c cVar = new com.gamericefishpro.space.n1.c(fIntBitsToFloat, Float.intBitsToFloat(i7) + f6, Float.intBitsToFloat(i6) + f7, Float.intBitsToFloat(i7) + f8);
                        com.gamericefishpro.space.h2.f1 f1VarD = oVar.d();
                        long jH = 0;
                        if (f1VarD != null) {
                            if (!f1VarD.K0().G) {
                                f1VarD = null;
                            }
                            if (f1VarD != null) {
                                jH = f1VarD.H(0L);
                            }
                        }
                        com.gamericefishpro.space.n1.c cVarE = cVar.e(jH);
                        com.gamericefishpro.space.n1.c cVarG = oVar.g();
                        com.gamericefishpro.space.n1.c cVarC = ((((cVarE.a > cVarG.c ? 1 : (cVarE.a == cVarG.c ? 0 : -1)) < 0) & ((cVarG.a > cVarE.c ? 1 : (cVarG.a == cVarE.c ? 0 : -1)) < 0)) & ((cVarE.b > cVarG.d ? 1 : (cVarE.b == cVarG.d ? 0 : -1)) < 0)) & ((cVarG.b > cVarE.d ? 1 : (cVarG.b == cVarE.d ? 0 : -1)) < 0) ? cVarE.c(cVarG) : null;
                        if (cVarC != null) {
                            long jT = tVar.t((((long) Float.floatToRawIntBits(cVarC.b)) & 4294967295L) | (((long) Float.floatToRawIntBits(cVarC.a)) << 32));
                            long jT2 = tVar.t((((long) Float.floatToRawIntBits(cVarC.c)) << 32) | (((long) Float.floatToRawIntBits(cVarC.d)) & 4294967295L));
                            int i8 = (int) (jT >> 32);
                            int i9 = (int) (jT2 >> 32);
                            int i10 = (int) (jT & 4294967295L);
                            int i11 = (int) (jT2 & 4294967295L);
                            rectF = new RectF(Math.min(Float.intBitsToFloat(i8), Float.intBitsToFloat(i9)), Math.min(Float.intBitsToFloat(i10), Float.intBitsToFloat(i11)), Math.max(Float.intBitsToFloat(i8), Float.intBitsToFloat(i9)), Math.max(Float.intBitsToFloat(i10), Float.intBitsToFloat(i11)));
                        } else {
                            rectF = null;
                        }
                        arrayList.add(rectF);
                    }
                    i4++;
                    i3 = i3;
                    i2 = i2;
                    z = false;
                }
                accessibilityNodeInfo.getExtras().putParcelableArray(str, (Parcelable[]) arrayList.toArray(new RectF[0]));
                return;
            }
        }
        Log.e("AccessibilityDelegate", "Invalid arguments for accessibility character locations");
    }

    public final Rect k(com.gamericefishpro.space.o2.p pVar) {
        com.gamericefishpro.space.c3.j jVar = pVar.b;
        return M(jVar.a, jVar.b, jVar.c, jVar.d);
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0069  */
    /* JADX WARN: Code duplicated, block: B:27:0x006b  */
    /* JADX WARN: Code duplicated, block: B:30:0x0077 A[Catch: all -> 0x0037, TryCatch #1 {all -> 0x0037, blocks: (B:13:0x0030, B:24:0x005d, B:28:0x006f, B:30:0x0077, B:32:0x0080, B:34:0x0086, B:35:0x0095, B:37:0x009d, B:20:0x0047, B:23:0x004e), top: B:57:0x0026 }] */
    /* JADX WARN: Code duplicated, block: B:32:0x0080 A[Catch: all -> 0x0037, TryCatch #1 {all -> 0x0037, blocks: (B:13:0x0030, B:24:0x005d, B:28:0x006f, B:30:0x0077, B:32:0x0080, B:34:0x0086, B:35:0x0095, B:37:0x009d, B:20:0x0047, B:23:0x004e), top: B:57:0x0026 }] */
    /* JADX WARN: Code duplicated, block: B:34:0x0086 A[Catch: all -> 0x0037, LOOP:0: B:33:0x0084->B:34:0x0086, LOOP_END, TryCatch #1 {all -> 0x0037, blocks: (B:13:0x0030, B:24:0x005d, B:28:0x006f, B:30:0x0077, B:32:0x0080, B:34:0x0086, B:35:0x0095, B:37:0x009d, B:20:0x0047, B:23:0x004e), top: B:57:0x0026 }] */
    /* JADX WARN: Code duplicated, block: B:37:0x009d A[Catch: all -> 0x0037, TRY_LEAVE, TryCatch #1 {all -> 0x0037, blocks: (B:13:0x0030, B:24:0x005d, B:28:0x006f, B:30:0x0077, B:32:0x0080, B:34:0x0086, B:35:0x0095, B:37:0x009d, B:20:0x0047, B:23:0x004e), top: B:57:0x0026 }] */
    /* JADX WARN: Code duplicated, block: B:40:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:43:0x00cb A[Catch: all -> 0x00d5, TryCatch #0 {all -> 0x00d5, blocks: (B:39:0x00b8, B:41:0x00bc, B:43:0x00cb, B:47:0x00d8), top: B:55:0x00b8 }] */
    /* JADX WARN: Code duplicated, block: B:46:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:51:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00f2, code lost:
    
        if (com.gamericefishpro.space.pi.a0.i(r5, r2) == r3) goto L49;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:48:0x00f2 -> B:50:0x00f5). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object l(com.gamericefishpro.space.vh.c cVar) throws Throwable {
        w wVar;
        com.gamericefishpro.space.t.f fVar;
        com.gamericefishpro.space.t.x xVar;
        com.gamericefishpro.space.ri.b bVar;
        com.gamericefishpro.space.t.x xVar2;
        com.gamericefishpro.space.ri.b bVar2;
        char c;
        int i;
        int i2;
        long[] jArr;
        Object objB;
        if (cVar instanceof w) {
            wVar = (w) cVar;
            int i3 = wVar.w;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                wVar.w = i3 - Integer.MIN_VALUE;
            } else {
                wVar = new w(this, cVar);
            }
        } else {
            wVar = new w(this, cVar);
        }
        Object obj = wVar.i;
        com.gamericefishpro.space.uh.a aVar = com.gamericefishpro.space.uh.a.d;
        int i4 = wVar.w;
        com.gamericefishpro.space.t.f fVar2 = this.P;
        try {
            if (i4 == 0) {
                com.gamericefishpro.space.wa.b.P(obj);
                xVar = new com.gamericefishpro.space.t.x();
                com.gamericefishpro.space.ri.e eVar = this.Q;
                eVar.getClass();
                bVar = new com.gamericefishpro.space.ri.b(eVar);
                wVar.d = xVar;
                wVar.e = bVar;
                wVar.w = 1;
                objB = bVar.b(wVar);
                if (objB == aVar) {
                    com.gamericefishpro.space.ri.b bVar3 = bVar;
                    xVar2 = xVar;
                    obj = objB;
                    bVar2 = bVar3;
                    if (!((Boolean) obj).booleanValue()) {
                        fVar2.clear();
                        return Unit.a;
                    }
                    bVar2.c();
                    if (v()) {
                        i = fVar2.i;
                        for (i2 = 0; i2 < i; i2++) {
                            com.gamericefishpro.space.h2.f0 f0Var = (com.gamericefishpro.space.h2.f0) fVar2.e[i2];
                            I(f0Var, xVar2);
                            J(f0Var);
                        }
                        xVar2.d = 0;
                        jArr = xVar2.a;
                        if (jArr != com.gamericefishpro.space.t.p0.a) {
                            com.gamericefishpro.space.ph.u.k(jArr, -9187201950435737472L);
                            long[] jArr2 = xVar2.a;
                            int i5 = xVar2.c;
                            int i6 = i5 >> 3;
                            long j = 255 << ((i5 & 7) << 3);
                            fVar = fVar2;
                            jArr2[i6] = ((~j) & jArr2[i6]) | j;
                        } else {
                            fVar = fVar2;
                        }
                        xVar2.e = com.gamericefishpro.space.t.p0.a(xVar2.c) - xVar2.d;
                        if (!this.c0) {
                            this.c0 = true;
                            this.C.post(this.e0);
                        }
                    } else {
                        fVar = fVar2;
                    }
                    fVar.clear();
                    this.J.c();
                    this.K.c();
                    long j2 = this.A;
                    wVar.d = xVar2;
                    wVar.e = bVar2;
                    c = 2;
                    wVar.w = 2;
                }
                return aVar;
            }
            if (i4 == 1) {
                bVar2 = wVar.e;
                xVar2 = wVar.d;
                com.gamericefishpro.space.wa.b.P(obj);
                if (!((Boolean) obj).booleanValue()) {
                    fVar2.clear();
                    return Unit.a;
                }
                bVar2.c();
                if (v()) {
                    i = fVar2.i;
                    while (i2 < i) {
                        com.gamericefishpro.space.h2.f0 f0Var2 = (com.gamericefishpro.space.h2.f0) fVar2.e[i2];
                        I(f0Var2, xVar2);
                        J(f0Var2);
                    }
                    xVar2.d = 0;
                    jArr = xVar2.a;
                    if (jArr != com.gamericefishpro.space.t.p0.a) {
                        try {
                            com.gamericefishpro.space.ph.u.k(jArr, -9187201950435737472L);
                            long[] jArr3 = xVar2.a;
                            int i7 = xVar2.c;
                            int i8 = i7 >> 3;
                            long j3 = 255 << ((i7 & 7) << 3);
                            fVar = fVar2;
                            jArr3[i8] = ((~j3) & jArr3[i8]) | j3;
                        } catch (Throwable th) {
                            th = th;
                            fVar.clear();
                            throw th;
                        }
                    } else {
                        fVar = fVar2;
                    }
                    xVar2.e = com.gamericefishpro.space.t.p0.a(xVar2.c) - xVar2.d;
                    if (!this.c0) {
                        this.c0 = true;
                        this.C.post(this.e0);
                    }
                } else {
                    fVar = fVar2;
                }
                fVar.clear();
                this.J.c();
                this.K.c();
                long j4 = this.A;
                wVar.d = xVar2;
                wVar.e = bVar2;
                c = 2;
                wVar.w = 2;
            } else {
                if (i4 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bVar2 = wVar.e;
                xVar2 = wVar.d;
                com.gamericefishpro.space.wa.b.P(obj);
                c = 2;
                fVar = fVar2;
            }
            xVar = xVar2;
            fVar2 = fVar;
            bVar = bVar2;
            wVar.d = xVar;
            wVar.e = bVar;
            wVar.w = 1;
            objB = bVar.b(wVar);
            if (objB == aVar) {
                com.gamericefishpro.space.ri.b bVar4 = bVar;
                xVar2 = xVar;
                obj = objB;
                bVar2 = bVar4;
                if (!((Boolean) obj).booleanValue()) {
                    fVar2.clear();
                    return Unit.a;
                }
                bVar2.c();
                if (v()) {
                    i = fVar2.i;
                    while (i2 < i) {
                        com.gamericefishpro.space.h2.f0 f0Var3 = (com.gamericefishpro.space.h2.f0) fVar2.e[i2];
                        I(f0Var3, xVar2);
                        J(f0Var3);
                    }
                    xVar2.d = 0;
                    jArr = xVar2.a;
                    if (jArr != com.gamericefishpro.space.t.p0.a) {
                        com.gamericefishpro.space.ph.u.k(jArr, -9187201950435737472L);
                        long[] jArr4 = xVar2.a;
                        int i9 = xVar2.c;
                        int i10 = i9 >> 3;
                        long j5 = 255 << ((i9 & 7) << 3);
                        fVar = fVar2;
                        jArr4[i10] = ((~j5) & jArr4[i10]) | j5;
                    } else {
                        fVar = fVar2;
                    }
                    xVar2.e = com.gamericefishpro.space.t.p0.a(xVar2.c) - xVar2.d;
                    if (!this.c0) {
                        this.c0 = true;
                        this.C.post(this.e0);
                    }
                } else {
                    fVar = fVar2;
                }
                fVar.clear();
                this.J.c();
                this.K.c();
                long j6 = this.A;
                wVar.d = xVar2;
                wVar.e = bVar2;
                c = 2;
                wVar.w = 2;
            }
            return aVar;
        } catch (Throwable th2) {
            th = th2;
            fVar = fVar2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:52:0x00f9  */
    public final boolean m(boolean z, int i, long j) {
        com.gamericefishpro.space.o2.v vVar;
        int i2;
        if (!Intrinsics.a(Looper.getMainLooper().getThread(), Thread.currentThread())) {
            return false;
        }
        com.gamericefishpro.space.t.l lVarS = s();
        if (com.gamericefishpro.space.n1.b.b(j, 9205357640488583168L) || (((9223372034707292159L & j) + 36028792732385279L) & (-9223372034707292160L)) != 0) {
            return false;
        }
        if (z) {
            vVar = com.gamericefishpro.space.o2.s.v;
        } else {
            if (z) {
                throw new com.gamericefishpro.space.oh.k();
            }
            vVar = com.gamericefishpro.space.o2.s.u;
        }
        Object[] objArr = lVarS.c;
        long[] jArr = lVarS.a;
        int length = jArr.length - 2;
        if (length < 0) {
            return false;
        }
        int i3 = 0;
        boolean z2 = false;
        while (true) {
            long j2 = jArr[i3];
            if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i4 = 8;
                int i5 = 8 - ((~(i3 - length)) >>> 31);
                int i6 = 0;
                while (i6 < i5) {
                    if ((255 & j2) < 128) {
                        com.gamericefishpro.space.o2.p pVar = (com.gamericefishpro.space.o2.p) objArr[(i3 << 3) + i6];
                        com.gamericefishpro.space.c3.j jVar = pVar.b;
                        float f = jVar.a;
                        i2 = i4;
                        float f2 = jVar.b;
                        float f3 = jVar.c;
                        float f4 = jVar.d;
                        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
                        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
                        if ((fIntBitsToFloat2 < f4) & (fIntBitsToFloat >= f) & (fIntBitsToFloat < f3) & (fIntBitsToFloat2 >= f2)) {
                            Object objG = pVar.a.d.d.g(vVar);
                            if (objG == null) {
                                objG = null;
                            }
                            com.gamericefishpro.space.o2.i iVar = (com.gamericefishpro.space.o2.i) objG;
                            if (iVar != null) {
                                Function0 function0 = iVar.a;
                                if (i < 0) {
                                    if (((Number) function0.invoke()).floatValue() > 0.0f) {
                                        z2 = true;
                                    }
                                } else if (((Number) function0.invoke()).floatValue() < ((Number) iVar.b.invoke()).floatValue()) {
                                    z2 = true;
                                }
                            }
                        }
                    } else {
                        i2 = i4;
                    }
                    j2 >>= i2;
                    i6++;
                    i4 = i2;
                }
                if (i5 != i4) {
                    return z2;
                }
            }
            if (i3 == length) {
                return z2;
            }
            i3++;
        }
    }

    public final void n() {
        Trace.beginSection("sendAccessibilitySemanticsStructureChangeEvents");
        try {
            if (v()) {
                B(this.v.getSemanticsOwner().a(), this.b0);
            }
            Unit unit = Unit.a;
            Trace.endSection();
            Trace.beginSection("sendSemanticsPropertyChangeEvents");
            try {
                H(s());
                Trace.endSection();
                Trace.beginSection("updateSemanticsNodesCopyAndPanes");
                try {
                    Q();
                } finally {
                    Trace.endSection();
                }
            } catch (Throwable th) {
                Trace.endSection();
                throw th;
            }
        } catch (Throwable th2) {
            Trace.endSection();
            throw th2;
        }
    }

    public final AccessibilityEvent o(int i, int i2) {
        com.gamericefishpro.space.o2.p pVar;
        AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain(i2);
        accessibilityEventObtain.setEnabled(true);
        accessibilityEventObtain.setClassName("android.view.View");
        t tVar = this.v;
        accessibilityEventObtain.setPackageName(tVar.getContext().getPackageName());
        accessibilityEventObtain.setSource(tVar, i);
        if (v() && (pVar = (com.gamericefishpro.space.o2.p) s().b(i)) != null) {
            com.gamericefishpro.space.o2.o oVar = pVar.a;
            accessibilityEventObtain.setPassword(oVar.d.d.c(com.gamericefishpro.space.o2.s.I));
            Object objG = oVar.d.d.g(com.gamericefishpro.space.o2.s.n);
            if (objG == null) {
                objG = null;
            }
            boolean zA = Intrinsics.a(objG, Boolean.TRUE);
            if (Build.VERSION.SDK_INT >= 34) {
                com.gamericefishpro.space.d4.v.i(accessibilityEventObtain, zA);
            }
        }
        return accessibilityEventObtain;
    }

    @Override // android.view.accessibility.AccessibilityManager.AccessibilityStateChangeListener
    public final void onAccessibilityStateChanged(boolean z) {
        this.B = null;
    }

    @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
    public final void onTouchExplorationStateChanged(boolean z) {
        this.B = null;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        AccessibilityManager accessibilityManager = this.z;
        if (accessibilityManager.isEnabled()) {
            this.B = null;
        }
        accessibilityManager.addAccessibilityStateChangeListener(this);
        accessibilityManager.addTouchExplorationStateChangeListener(this);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.C.removeCallbacks(this.e0);
        AccessibilityManager accessibilityManager = this.z;
        accessibilityManager.removeAccessibilityStateChangeListener(this);
        accessibilityManager.removeTouchExplorationStateChangeListener(this);
    }

    public final AccessibilityEvent p(int i, Integer num, Integer num2, Integer num3, CharSequence charSequence) {
        AccessibilityEvent accessibilityEventO = o(i, 8192);
        if (num != null) {
            accessibilityEventO.setFromIndex(num.intValue());
        }
        if (num2 != null) {
            accessibilityEventO.setToIndex(num2.intValue());
        }
        if (num3 != null) {
            accessibilityEventO.setItemCount(num3.intValue());
        }
        if (charSequence != null) {
            accessibilityEventO.getText().add(charSequence);
        }
        return accessibilityEventO;
    }

    public final int q(com.gamericefishpro.space.o2.o oVar) {
        com.gamericefishpro.space.o2.l lVar = oVar.d;
        com.gamericefishpro.space.o2.l lVar2 = oVar.d;
        com.gamericefishpro.space.o2.v vVar = com.gamericefishpro.space.o2.s.a;
        if (!lVar.d.c(com.gamericefishpro.space.o2.s.a)) {
            com.gamericefishpro.space.o2.v vVar2 = com.gamericefishpro.space.o2.s.F;
            if (lVar2.d.c(vVar2)) {
                return (int) (((com.gamericefishpro.space.r2.h0) lVar2.d(vVar2)).a & 4294967295L);
            }
        }
        return this.N;
    }

    public final int r(com.gamericefishpro.space.o2.o oVar) {
        com.gamericefishpro.space.o2.l lVar = oVar.d;
        com.gamericefishpro.space.o2.l lVar2 = oVar.d;
        com.gamericefishpro.space.o2.v vVar = com.gamericefishpro.space.o2.s.a;
        if (!lVar.d.c(com.gamericefishpro.space.o2.s.a)) {
            com.gamericefishpro.space.o2.v vVar2 = com.gamericefishpro.space.o2.s.F;
            if (lVar2.d.c(vVar2)) {
                return (int) (((com.gamericefishpro.space.r2.h0) lVar2.d(vVar2)).a >> 32);
            }
        }
        return this.N;
    }

    public final com.gamericefishpro.space.t.l s() {
        if (this.R) {
            this.R = false;
            t tVar = this.v;
            this.T = com.gamericefishpro.space.o2.r.b(tVar.getSemanticsOwner(), p.i);
            if (v()) {
                com.gamericefishpro.space.t.w wVar = this.T;
                Resources resources = tVar.getContext().getResources();
                com.gamericefishpro.space.t.u uVar = this.V;
                uVar.a();
                com.gamericefishpro.space.t.u uVar2 = this.W;
                uVar2.a();
                com.gamericefishpro.space.o2.p pVar = (com.gamericefishpro.space.o2.p) wVar.b(-1);
                com.gamericefishpro.space.o2.o oVar = pVar != null ? pVar.a : null;
                Intrinsics.b(oVar);
                ArrayList arrayListB = com.gamericefishpro.space.o2.z.b(oVar, new com.gamericefishpro.space.b2.d0(7, wVar), new com.gamericefishpro.space.b2.d0(8, resources), com.gamericefishpro.space.ph.w.c(oVar));
                int iE = com.gamericefishpro.space.ph.x.e(arrayListB);
                int i = 1;
                if (1 <= iE) {
                    while (true) {
                        int i2 = ((com.gamericefishpro.space.o2.o) arrayListB.get(i - 1)).g;
                        int i3 = ((com.gamericefishpro.space.o2.o) arrayListB.get(i)).g;
                        uVar.f(i2, i3);
                        uVar2.f(i3, i2);
                        if (i == iE) {
                            break;
                        }
                        i++;
                    }
                }
            }
        }
        return this.T;
    }

    /* JADX WARN: Code duplicated, block: B:36:0x0073 A[LOOP:0: B:4:0x0014->B:36:0x0073, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:47:0x0076 A[EDGE_INSN: B:47:0x0076->B:37:0x0076 BREAK  A[LOOP:0: B:4:0x0014->B:36:0x0073], SYNTHETIC] */
    public final com.gamericefishpro.space.n1.c u(com.gamericefishpro.space.o2.o oVar, Rect rect, com.gamericefishpro.space.o1.k0 k0Var) {
        x xVar = new x(k0Var);
        com.gamericefishpro.space.h2.f0 f0Var = oVar.c;
        com.gamericefishpro.space.h1.l lVar = f0Var.Z.f;
        com.gamericefishpro.space.h2.i iVar = null;
        if ((lVar.v & 8) != 0) {
            loop0: while (lVar != null) {
                if ((lVar.i & 8) == 0) {
                    if ((lVar.v & 8) != 0) {
                        break;
                        break;
                    }
                    lVar = lVar.y;
                } else {
                    com.gamericefishpro.space.h1.l lVarE = lVar;
                    com.gamericefishpro.space.v0.e eVar = null;
                    while (lVarE != null) {
                        if (lVarE instanceof com.gamericefishpro.space.h2.x1) {
                            ((com.gamericefishpro.space.h2.x1) lVarE).L(xVar);
                            if (xVar.d) {
                                iVar = lVarE;
                                break loop0;
                            }
                        } else if ((lVarE.i & 8) != 0 && (lVarE instanceof com.gamericefishpro.space.h2.j)) {
                            int i = 0;
                            for (com.gamericefishpro.space.h1.l lVar2 = ((com.gamericefishpro.space.h2.j) lVarE).I; lVar2 != null; lVar2 = lVar2.y) {
                                if ((lVar2.i & 8) != 0) {
                                    i++;
                                    if (i == 1) {
                                        lVarE = lVar2;
                                    } else {
                                        if (eVar == null) {
                                            eVar = new com.gamericefishpro.space.v0.e(new com.gamericefishpro.space.h1.l[16]);
                                        }
                                        if (lVarE != null) {
                                            eVar.b(lVarE);
                                            lVarE = null;
                                        }
                                        eVar.b(lVar2);
                                    }
                                }
                            }
                            if (i == 1) {
                            }
                        }
                        lVarE = com.gamericefishpro.space.h2.k.e(eVar);
                    }
                    if ((lVar.v & 8) != 0) {
                        break;
                    }
                    lVar = lVar.y;
                }
            }
        }
        com.gamericefishpro.space.h2.i iVar2 = (com.gamericefishpro.space.h2.x1) iVar;
        if (iVar2 == null || !((com.gamericefishpro.space.h1.l) iVar2).d.G) {
            return com.gamericefishpro.space.f2.x.f(f0Var.Z.d, false);
        }
        com.gamericefishpro.space.h2.f1 f1VarR = com.gamericefishpro.space.h2.k.r(iVar2);
        com.gamericefishpro.space.n1.c cVarZ = com.gamericefishpro.space.f2.x.h(f1VarR).z(f1VarR, true);
        Rect rectM = M(cVarZ.a, cVarZ.b, cVarZ.c, cVarZ.d);
        float f = rectM.left - rect.left;
        float f2 = rectM.top - rect.top;
        return new com.gamericefishpro.space.n1.c(f, f2, rectM.width() + f, rectM.height() + f2);
    }

    public final boolean v() {
        AccessibilityManager accessibilityManager = this.z;
        if (!accessibilityManager.isEnabled()) {
            return false;
        }
        List<AccessibilityServiceInfo> enabledAccessibilityServiceList = this.B;
        if (enabledAccessibilityServiceList == null) {
            enabledAccessibilityServiceList = accessibilityManager.getEnabledAccessibilityServiceList(-1);
            this.B = enabledAccessibilityServiceList;
        }
        return !enabledAccessibilityServiceList.isEmpty();
    }

    public final void w(com.gamericefishpro.space.h2.f0 f0Var) {
        if (this.P.add(f0Var)) {
            this.Q.k(Unit.a);
        }
    }
}
