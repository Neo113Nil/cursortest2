package defpackage;

import android.view.View;
import com.connectsdk.service.webos.lgcast.common.utils.StringUtil;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* loaded from: classes.dex */
public class aa6 {
    public int A;
    public float B;
    public int[] C;
    public float D;
    public boolean E;
    public boolean F;
    public boolean G;
    public int H;
    public int I;
    public final o86 J;
    public final o86 K;
    public final o86 L;
    public final o86 M;
    public final o86 N;
    public final o86 O;
    public final o86 P;
    public final o86 Q;
    public final o86[] R;
    public final ArrayList S;
    public final boolean[] T;
    public z96[] U;
    public aa6 V;
    public int W;
    public int X;
    public float Y;
    public int Z;
    public int a0;
    public ta4 b;
    public int b0;
    public ta4 c;
    public int c0;
    public int d0;
    public int e0;
    public float f0;
    public float g0;
    public View h0;
    public int i0;
    public String j;
    public boolean j0;
    public boolean k;
    public String k0;
    public boolean l;
    public int l0;
    public boolean m;
    public int m0;
    public boolean n;
    public final float[] n0;
    public int o;
    public final aa6[] o0;
    public int p;
    public final aa6[] p0;
    public int q;
    public aa6 q0;
    public int r;
    public aa6 r0;
    public int s;
    public int s0;
    public final int[] t;
    public int t0;
    public int u;
    public int v;
    public float w;
    public int x;
    public int y;
    public float z;
    public boolean a = false;
    public x3e d = null;
    public f1u e = null;
    public final boolean[] f = {true, true};
    public boolean g = true;
    public int h = -1;
    public int i = -1;

    public aa6() {
        new HashMap();
        this.k = false;
        this.l = false;
        this.m = false;
        this.n = false;
        this.o = -1;
        this.p = -1;
        this.q = 0;
        this.r = 0;
        this.s = 0;
        this.t = new int[2];
        this.u = 0;
        this.v = 0;
        this.w = 1.0f;
        this.x = 0;
        this.y = 0;
        this.z = 1.0f;
        this.A = -1;
        this.B = 1.0f;
        this.C = new int[]{Integer.MAX_VALUE, Integer.MAX_VALUE};
        this.D = Float.NaN;
        this.E = false;
        this.G = false;
        this.H = 0;
        this.I = 0;
        o86 o86Var = new o86(this, 2);
        this.J = o86Var;
        o86 o86Var2 = new o86(this, 3);
        this.K = o86Var2;
        o86 o86Var3 = new o86(this, 4);
        this.L = o86Var3;
        o86 o86Var4 = new o86(this, 5);
        this.M = o86Var4;
        o86 o86Var5 = new o86(this, 6);
        this.N = o86Var5;
        o86 o86Var6 = new o86(this, 8);
        this.O = o86Var6;
        o86 o86Var7 = new o86(this, 9);
        this.P = o86Var7;
        o86 o86Var8 = new o86(this, 7);
        this.Q = o86Var8;
        this.R = new o86[]{o86Var, o86Var3, o86Var2, o86Var4, o86Var5, o86Var8};
        ArrayList arrayList = new ArrayList();
        this.S = arrayList;
        this.T = new boolean[2];
        z96 z96Var = z96.a;
        this.U = new z96[]{z96Var, z96Var};
        this.V = null;
        this.W = 0;
        this.X = 0;
        this.Y = 0.0f;
        this.Z = -1;
        this.a0 = 0;
        this.b0 = 0;
        this.c0 = 0;
        this.f0 = 0.5f;
        this.g0 = 0.5f;
        this.i0 = 0;
        this.j0 = false;
        this.k0 = null;
        this.l0 = 0;
        this.m0 = 0;
        this.n0 = new float[]{-1.0f, -1.0f};
        this.o0 = new aa6[]{null, null};
        this.p0 = new aa6[]{null, null};
        this.q0 = null;
        this.r0 = null;
        this.s0 = -1;
        this.t0 = -1;
        arrayList.add(o86Var);
        arrayList.add(o86Var2);
        arrayList.add(o86Var3);
        arrayList.add(o86Var4);
        arrayList.add(o86Var6);
        arrayList.add(o86Var7);
        arrayList.add(o86Var8);
        arrayList.add(o86Var5);
    }

    public static void H(int i, int i2, String str, StringBuilder sb) {
        if (i == i2) {
            return;
        }
        sb.append(str);
        sb.append(" :   ");
        sb.append(i);
        sb.append(",\n");
    }

    public static void I(StringBuilder sb, String str, float f, float f2) {
        if (f == f2) {
            return;
        }
        sb.append(str);
        sb.append(" :   ");
        sb.append(f);
        sb.append(",\n");
    }

    public static void p(StringBuilder sb, String str, int i, int i2, int i3, int i4, int i5, float f, z96 z96Var) {
        sb.append(str);
        sb.append(" :  {\n");
        String obj = z96Var.toString();
        if (!"FIXED".equals(obj)) {
            su4.v(sb, "      behavior", " :   ", obj, ",\n");
        }
        H(i, 0, "      size", sb);
        H(i2, 0, "      min", sb);
        H(i3, Integer.MAX_VALUE, "      max", sb);
        H(i4, 0, "      matchMin", sb);
        H(i5, 0, "      matchDef", sb);
        I(sb, "      matchPercent", f, 1.0f);
        sb.append("    },\n");
    }

    public static void q(StringBuilder sb, String str, o86 o86Var) {
        if (o86Var.f == null) {
            return;
        }
        sb.append("    ");
        sb.append(str);
        sb.append(" : [ '");
        sb.append(o86Var.f);
        sb.append("'");
        if (o86Var.h != Integer.MIN_VALUE || o86Var.g != 0) {
            sb.append(StringUtils.COMMA);
            sb.append(o86Var.g);
            if (o86Var.h != Integer.MIN_VALUE) {
                sb.append(StringUtils.COMMA);
                sb.append(o86Var.h);
                sb.append(StringUtils.COMMA);
            }
        }
        sb.append(" ] ,\n");
    }

    public final boolean A() {
        return this.g && this.i0 != 8;
    }

    public boolean B() {
        if (this.k) {
            return true;
        }
        return this.J.c && this.L.c;
    }

    public boolean C() {
        if (this.l) {
            return true;
        }
        return this.K.c && this.M.c;
    }

    public void D() {
        this.J.j();
        this.K.j();
        this.L.j();
        this.M.j();
        this.N.j();
        this.O.j();
        this.P.j();
        this.Q.j();
        this.V = null;
        this.D = Float.NaN;
        this.W = 0;
        this.X = 0;
        this.Y = 0.0f;
        this.Z = -1;
        this.a0 = 0;
        this.b0 = 0;
        this.c0 = 0;
        this.d0 = 0;
        this.e0 = 0;
        this.f0 = 0.5f;
        this.g0 = 0.5f;
        z96[] z96VarArr = this.U;
        z96 z96Var = z96.a;
        z96VarArr[0] = z96Var;
        z96VarArr[1] = z96Var;
        this.h0 = null;
        this.i0 = 0;
        this.l0 = 0;
        this.m0 = 0;
        float[] fArr = this.n0;
        fArr[0] = -1.0f;
        fArr[1] = -1.0f;
        this.o = -1;
        this.p = -1;
        int[] iArr = this.C;
        iArr[0] = Integer.MAX_VALUE;
        iArr[1] = Integer.MAX_VALUE;
        this.r = 0;
        this.s = 0;
        this.w = 1.0f;
        this.z = 1.0f;
        this.v = Integer.MAX_VALUE;
        this.y = Integer.MAX_VALUE;
        this.u = 0;
        this.x = 0;
        this.A = -1;
        this.B = 1.0f;
        boolean[] zArr = this.f;
        zArr[0] = true;
        zArr[1] = true;
        this.G = false;
        boolean[] zArr2 = this.T;
        zArr2[0] = false;
        zArr2[1] = false;
        this.g = true;
        int[] iArr2 = this.t;
        iArr2[0] = 0;
        iArr2[1] = 0;
        this.h = -1;
        this.i = -1;
    }

    public final void E() {
        aa6 aa6Var = this.V;
        if (aa6Var != null && (aa6Var instanceof ba6)) {
            ((ba6) aa6Var).getClass();
        }
        ArrayList arrayList = this.S;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((o86) arrayList.get(i)).j();
        }
    }

    public final void F() {
        this.k = false;
        this.l = false;
        this.m = false;
        this.n = false;
        ArrayList arrayList = this.S;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            o86 o86Var = (o86) arrayList.get(i);
            o86Var.c = false;
            o86Var.b = 0;
        }
    }

    public void G(osh oshVar) {
        this.J.k();
        this.K.k();
        this.L.k();
        this.M.k();
        this.N.k();
        this.Q.k();
        this.O.k();
        this.P.k();
    }

    public final void J(int i) {
        this.c0 = i;
        this.E = i > 0;
    }

    public final void K(int i, int i2) {
        if (this.k) {
            return;
        }
        this.J.l(i);
        this.L.l(i2);
        this.a0 = i;
        this.W = i2 - i;
        this.k = true;
    }

    public final void L(int i, int i2) {
        if (this.l) {
            return;
        }
        this.K.l(i);
        this.M.l(i2);
        this.b0 = i;
        this.X = i2 - i;
        if (this.E) {
            this.N.l(i + this.c0);
        }
        this.l = true;
    }

    public final void M(int i) {
        this.X = i;
        int i2 = this.e0;
        if (i < i2) {
            this.X = i2;
        }
    }

    public final void N(z96 z96Var) {
        this.U[0] = z96Var;
    }

    public final void O(z96 z96Var) {
        this.U[1] = z96Var;
    }

    public final void P(int i) {
        this.W = i;
        int i2 = this.d0;
        if (i < i2) {
            this.W = i2;
        }
    }

    public void Q(boolean z, boolean z2) {
        int i;
        int i2;
        x3e x3eVar = this.d;
        boolean z3 = z & x3eVar.g;
        f1u f1uVar = this.e;
        boolean z4 = z2 & f1uVar.g;
        int i3 = x3eVar.h.g;
        int i4 = f1uVar.h.g;
        int i5 = x3eVar.i.g;
        int i6 = f1uVar.i.g;
        int i7 = i6 - i4;
        if (i5 - i3 < 0 || i7 < 0 || i3 == Integer.MIN_VALUE || i3 == Integer.MAX_VALUE || i4 == Integer.MIN_VALUE || i4 == Integer.MAX_VALUE || i5 == Integer.MIN_VALUE || i5 == Integer.MAX_VALUE || i6 == Integer.MIN_VALUE || i6 == Integer.MAX_VALUE) {
            i5 = 0;
            i6 = 0;
            i3 = 0;
            i4 = 0;
        }
        int i8 = i5 - i3;
        int i9 = i6 - i4;
        if (z3) {
            this.a0 = i3;
        }
        if (z4) {
            this.b0 = i4;
        }
        if (this.i0 == 8) {
            this.W = 0;
            this.X = 0;
            return;
        }
        z96 z96Var = z96.a;
        if (z3) {
            if (this.U[0] == z96Var && i8 < (i2 = this.W)) {
                i8 = i2;
            }
            this.W = i8;
            int i10 = this.d0;
            if (i8 < i10) {
                this.W = i10;
            }
        }
        if (z4) {
            if (this.U[1] == z96Var && i9 < (i = this.X)) {
                i9 = i;
            }
            this.X = i9;
            int i11 = this.e0;
            if (i9 < i11) {
                this.X = i11;
            }
        }
    }

    public void R(j7g j7gVar, boolean z) {
        int i;
        int i2;
        f1u f1uVar;
        x3e x3eVar;
        j7gVar.getClass();
        int n = j7g.n(this.J);
        int n2 = j7g.n(this.K);
        int n3 = j7g.n(this.L);
        int n4 = j7g.n(this.M);
        if (z && (x3eVar = this.d) != null) {
            sx7 sx7Var = x3eVar.h;
            if (sx7Var.j) {
                sx7 sx7Var2 = x3eVar.i;
                if (sx7Var2.j) {
                    n = sx7Var.g;
                    n3 = sx7Var2.g;
                }
            }
        }
        if (z && (f1uVar = this.e) != null) {
            sx7 sx7Var3 = f1uVar.h;
            if (sx7Var3.j) {
                sx7 sx7Var4 = f1uVar.i;
                if (sx7Var4.j) {
                    n2 = sx7Var3.g;
                    n4 = sx7Var4.g;
                }
            }
        }
        int i3 = n4 - n2;
        if (n3 - n < 0 || i3 < 0 || n == Integer.MIN_VALUE || n == Integer.MAX_VALUE || n2 == Integer.MIN_VALUE || n2 == Integer.MAX_VALUE || n3 == Integer.MIN_VALUE || n3 == Integer.MAX_VALUE || n4 == Integer.MIN_VALUE || n4 == Integer.MAX_VALUE) {
            n = 0;
            n2 = 0;
            n3 = 0;
            n4 = 0;
        }
        int i4 = n3 - n;
        int i5 = n4 - n2;
        this.a0 = n;
        this.b0 = n2;
        if (this.i0 == 8) {
            this.W = 0;
            this.X = 0;
            return;
        }
        z96[] z96VarArr = this.U;
        z96 z96Var = z96VarArr[0];
        z96 z96Var2 = z96.a;
        if (z96Var == z96Var2 && i4 < (i2 = this.W)) {
            i4 = i2;
        }
        if (z96VarArr[1] == z96Var2 && i5 < (i = this.X)) {
            i5 = i;
        }
        this.W = i4;
        this.X = i5;
        int i6 = this.e0;
        if (i5 < i6) {
            this.X = i6;
        }
        int i7 = this.d0;
        if (i4 < i7) {
            this.W = i7;
        }
        int i8 = this.v;
        z96 z96Var3 = z96.c;
        if (i8 > 0 && z96Var == z96Var3) {
            this.W = Math.min(this.W, i8);
        }
        int i9 = this.y;
        if (i9 > 0 && this.U[1] == z96Var3) {
            this.X = Math.min(this.X, i9);
        }
        int i10 = this.W;
        if (i4 != i10) {
            this.h = i10;
        }
        int i11 = this.X;
        if (i5 != i11) {
            this.i = i11;
        }
    }

    public final void a(ba6 ba6Var, j7g j7gVar, HashSet hashSet, int i, boolean z) {
        if (z) {
            if (!hashSet.contains(this)) {
                return;
            }
            ff7.u(ba6Var, j7gVar, this);
            hashSet.remove(this);
            b(j7gVar, ba6Var.X(64));
        }
        if (i == 0) {
            HashSet hashSet2 = this.J.a;
            if (hashSet2 != null) {
                Iterator it = hashSet2.iterator();
                while (it.hasNext()) {
                    ((o86) it.next()).d.a(ba6Var, j7gVar, hashSet, i, true);
                }
            }
            HashSet hashSet3 = this.L.a;
            if (hashSet3 != null) {
                Iterator it2 = hashSet3.iterator();
                while (it2.hasNext()) {
                    ((o86) it2.next()).d.a(ba6Var, j7gVar, hashSet, i, true);
                }
                return;
            }
            return;
        }
        HashSet hashSet4 = this.K.a;
        if (hashSet4 != null) {
            Iterator it3 = hashSet4.iterator();
            while (it3.hasNext()) {
                ((o86) it3.next()).d.a(ba6Var, j7gVar, hashSet, i, true);
            }
        }
        HashSet hashSet5 = this.M.a;
        if (hashSet5 != null) {
            Iterator it4 = hashSet5.iterator();
            while (it4.hasNext()) {
                ((o86) it4.next()).d.a(ba6Var, j7gVar, hashSet, i, true);
            }
        }
        HashSet hashSet6 = this.N.a;
        if (hashSet6 != null) {
            Iterator it5 = hashSet6.iterator();
            while (it5.hasNext()) {
                ((o86) it5.next()).d.a(ba6Var, j7gVar, hashSet, i, true);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0048, code lost:
    
        if (r12 != 3) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:263:0x05e7, code lost:
    
        if (r60.i0 == r9) goto L382;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x02ba  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x02c8  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x02ec  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x040f  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0420  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0434  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x043d  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x0456  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x0471  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x04c2  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x04cf  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x04ff  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x054a  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x05ab  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x05b1  */
    /* JADX WARN: Removed duplicated region for block: B:269:0x0675  */
    /* JADX WARN: Removed duplicated region for block: B:275:0x06d1  */
    /* JADX WARN: Removed duplicated region for block: B:293:0x05ad  */
    /* JADX WARN: Removed duplicated region for block: B:297:0x04da  */
    /* JADX WARN: Removed duplicated region for block: B:298:0x04c9  */
    /* JADX WARN: Removed duplicated region for block: B:303:0x041a  */
    /* JADX WARN: Removed duplicated region for block: B:334:0x03f9  */
    /* JADX WARN: Removed duplicated region for block: B:335:0x02cd  */
    /* JADX WARN: Removed duplicated region for block: B:336:0x02c1  */
    /* JADX WARN: Removed duplicated region for block: B:337:0x02aa  */
    /* JADX WARN: Removed duplicated region for block: B:341:0x0293  */
    /* JADX WARN: Removed duplicated region for block: B:344:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:364:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0221  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x029e  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x02a7  */
    /* JADX WARN: Type inference failed for: r12v36 */
    /* JADX WARN: Type inference failed for: r12v37, types: [int] */
    /* JADX WARN: Type inference failed for: r12v42 */
    /* JADX WARN: Type inference failed for: r13v50, types: [ba6] */
    /* JADX WARN: Type inference failed for: r18v14 */
    /* JADX WARN: Type inference failed for: r18v15 */
    /* JADX WARN: Type inference failed for: r18v18 */
    /* JADX WARN: Type inference failed for: r18v2 */
    /* JADX WARN: Type inference failed for: r18v9, types: [boolean] */
    /* JADX WARN: Type inference failed for: r20v11 */
    /* JADX WARN: Type inference failed for: r20v13 */
    /* JADX WARN: Type inference failed for: r20v14 */
    /* JADX WARN: Type inference failed for: r20v2 */
    /* JADX WARN: Type inference failed for: r27v3 */
    /* JADX WARN: Type inference failed for: r27v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r27v7 */
    /* JADX WARN: Type inference failed for: r27v8 */
    /* JADX WARN: Type inference failed for: r27v9 */
    /* JADX WARN: Type inference failed for: r60v0, types: [aa6] */
    /* JADX WARN: Type inference failed for: r9v12, types: [boolean] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void b(j7g j7gVar, boolean z) {
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        ?? r20;
        ?? r18;
        int i;
        boolean z6;
        boolean z7;
        aa6 aa6Var;
        aa6 aa6Var2;
        boolean[] zArr;
        o86 o86Var;
        boolean[] zArr2;
        o86 o86Var2;
        boolean z8;
        boolean z9;
        int i2;
        int i3;
        float f;
        i3r i3rVar;
        i3r i3rVar2;
        boolean z10;
        int i4;
        int i5;
        boolean z11;
        int i6;
        boolean z12;
        boolean z13;
        o86 o86Var3;
        boolean z14;
        boolean z15;
        i3r i3rVar3;
        z96 z96Var;
        i3r i3rVar4;
        o86 o86Var4;
        int i7;
        boolean z16;
        z96 z96Var2;
        o86 o86Var5;
        boolean z17;
        i3r i3rVar5;
        o86 o86Var6;
        i3r i3rVar6;
        i3r i3rVar7;
        boolean z18;
        boolean z19;
        boolean[] zArr3;
        i3r i3rVar8;
        i3r i3rVar9;
        i3r i3rVar10;
        int i8;
        int i9;
        int i10;
        int i11;
        i3r i3rVar11;
        i3r i3rVar12;
        ?? r27;
        f1u f1uVar;
        sx7 sx7Var;
        aa6 aa6Var3;
        x3e x3eVar;
        sx7 sx7Var2;
        int i12;
        boolean y;
        ?? r12;
        boolean z20;
        x3e x3eVar2;
        f1u f1uVar2;
        boolean z21;
        j7g j7gVar2 = j7gVar;
        o86 o86Var7 = this.J;
        i3r k = j7gVar2.k(o86Var7);
        o86 o86Var8 = this.L;
        i3r k2 = j7gVar2.k(o86Var8);
        o86 o86Var9 = this.K;
        i3r k3 = j7gVar2.k(o86Var9);
        o86 o86Var10 = this.M;
        i3r k4 = j7gVar2.k(o86Var10);
        o86 o86Var11 = this.N;
        i3r k5 = j7gVar2.k(o86Var11);
        aa6 aa6Var4 = this.V;
        z96 z96Var3 = z96.b;
        if (aa6Var4 != null) {
            z96[] z96VarArr = aa6Var4.U;
            r18 = 0;
            z3 = false;
            r18 = 0;
            z5 = z96VarArr[0] == z96Var3;
            boolean z22 = z96VarArr[1] == z96Var3;
            int i13 = this.q;
            if (i13 != 1) {
                boolean z23 = true;
                if (i13 != 2) {
                    z2 = z23;
                } else {
                    z5 = false;
                }
                z4 = z22;
                r20 = z23;
            } else {
                r20 = 1;
                z4 = false;
            }
            i = this.i0;
            boolean z24 = z4;
            boolean[] zArr4 = this.T;
            if (i == 8 || this.j0) {
                z6 = z5;
            } else {
                ArrayList arrayList = this.S;
                int size = arrayList.size();
                z6 = z5;
                int i14 = r18;
                while (true) {
                    if (i14 < size) {
                        int i15 = size;
                        HashSet hashSet = ((o86) arrayList.get(i14)).a;
                        if (hashSet != null && hashSet.size() > 0) {
                            break;
                        }
                        i14++;
                        size = i15;
                    } else if (!zArr4[r18] && !zArr4[r20]) {
                        return;
                    }
                }
            }
            z7 = this.k;
            if (!z7 || this.l) {
                if (z7) {
                    j7gVar2.d(k, this.a0);
                    j7gVar2.d(k2, this.a0 + this.W);
                    if (z6 && (aa6Var2 = this.V) != null) {
                        ba6 ba6Var = (ba6) aa6Var2;
                        WeakReference weakReference = ba6Var.L0;
                        if (weakReference == null || weakReference.get() == null || o86Var7.d() > ((o86) ba6Var.L0.get()).d()) {
                            ba6Var.L0 = new WeakReference(o86Var7);
                        }
                        WeakReference weakReference2 = ba6Var.N0;
                        if (weakReference2 == null || weakReference2.get() == null || o86Var8.d() > ((o86) ba6Var.N0.get()).d()) {
                            ba6Var.N0 = new WeakReference(o86Var8);
                        }
                    }
                }
                if (this.l) {
                    j7gVar2.d(k3, this.b0);
                    j7gVar2.d(k4, this.b0 + this.X);
                    HashSet hashSet2 = o86Var11.a;
                    if (hashSet2 != null && hashSet2.size() > 0) {
                        j7gVar2.d(k5, this.b0 + this.c0);
                    }
                    if (z24 && (aa6Var = this.V) != null) {
                        ba6 ba6Var2 = (ba6) aa6Var;
                        WeakReference weakReference3 = ba6Var2.K0;
                        if (weakReference3 == null || weakReference3.get() == null || o86Var9.d() > ((o86) ba6Var2.K0.get()).d()) {
                            ba6Var2.K0 = new WeakReference(o86Var9);
                        }
                        WeakReference weakReference4 = ba6Var2.M0;
                        if (weakReference4 == null || weakReference4.get() == null || o86Var10.d() > ((o86) ba6Var2.M0.get()).d()) {
                            ba6Var2.M0 = new WeakReference(o86Var10);
                        }
                    }
                }
                if (this.k && this.l) {
                    boolean z25 = r18;
                    this.k = z25;
                    this.l = z25;
                    return;
                }
            }
            zArr = this.f;
            if (z || (x3eVar2 = this.d) == null || (f1uVar2 = this.e) == null) {
                o86Var = o86Var11;
                zArr2 = zArr;
            } else {
                o86Var = o86Var11;
                sx7 sx7Var3 = x3eVar2.h;
                zArr2 = zArr;
                if (sx7Var3.j && x3eVar2.i.j && f1uVar2.h.j && f1uVar2.i.j) {
                    j7gVar2.d(k, sx7Var3.g);
                    j7gVar2.d(k2, this.d.i.g);
                    j7gVar2.d(k3, this.e.h.g);
                    j7gVar2.d(k4, this.e.i.g);
                    j7gVar2.d(k5, this.e.k.g);
                    if (this.V != null) {
                        if (z6 && zArr2[0] && !y()) {
                            j7gVar2.f(j7gVar2.k(this.V.L), k2, 0, 8);
                        }
                        if (z24 && zArr2[r20] && !z()) {
                            z21 = false;
                            j7gVar2.f(j7gVar2.k(this.V.M), k4, 0, 8);
                            this.k = z21;
                            this.l = z21;
                            return;
                        }
                    }
                    z21 = false;
                    this.k = z21;
                    this.l = z21;
                    return;
                }
            }
            if (this.V == null) {
                if (x(0)) {
                    ((ba6) this.V).S(this, 0);
                    y = r20;
                    r12 = y;
                } else {
                    y = y();
                    r12 = r20;
                }
                if (x(r12)) {
                    ((ba6) this.V).S(this, r12);
                    z20 = true;
                } else {
                    z20 = z();
                }
                if (!y && z6 && this.i0 != 8 && o86Var7.f == null && o86Var8.f == null) {
                    o86Var2 = o86Var7;
                    j7gVar2.f(j7gVar2.k(this.V.L), k2, 0, 1);
                } else {
                    o86Var2 = o86Var7;
                }
                if (!z20 && z24 && this.i0 != 8 && o86Var9.f == null && o86Var10.f == null && o86Var == null) {
                    j7gVar2.f(j7gVar2.k(this.V.M), k4, 0, 1);
                }
                z8 = z20;
                z9 = y;
            } else {
                o86Var2 = o86Var7;
                z8 = false;
                z9 = false;
            }
            i2 = this.W;
            i3 = this.d0;
            if (i2 >= i3) {
                i3 = i2;
            }
            int i16 = this.X;
            boolean z26 = z8;
            int i17 = this.e0;
            int i18 = i16 >= i17 ? i17 : i16;
            z96[] z96VarArr2 = this.U;
            z96 z96Var4 = z96VarArr2[0];
            z96 z96Var5 = z96.c;
            boolean z27 = z96Var4 == z96Var5;
            z96 z96Var6 = z96VarArr2[1];
            boolean z28 = z96Var6 == z96Var5;
            int i19 = this.Z;
            this.A = i19;
            f = this.Y;
            this.B = f;
            int i20 = this.r;
            int i21 = this.s;
            if (f <= 0.0f) {
                i3rVar = k4;
                if (this.i0 != 8) {
                    i4 = (z96Var4 == z96Var5 && i20 == 0) ? 3 : i20;
                    int i22 = (z96Var6 == z96Var5 && i21 == 0) ? 3 : i21;
                    if (z96Var4 == z96Var5 && z96Var6 == z96Var5) {
                        i3rVar2 = k5;
                        if (i4 == 3 && i22 == 3) {
                            if (i19 == -1) {
                                if (z27 && !z28) {
                                    this.A = 0;
                                } else if (!z27 && z28) {
                                    this.A = 1;
                                    if (i19 == -1) {
                                        this.B = 1.0f / f;
                                    }
                                }
                            }
                            if (this.A == 0 && (!o86Var9.h() || !o86Var10.h())) {
                                this.A = 1;
                            } else if (this.A == 1 && (!o86Var2.h() || !o86Var8.h())) {
                                this.A = 0;
                            }
                            if (this.A == -1 && (!o86Var9.h() || !o86Var10.h() || !o86Var2.h() || !o86Var8.h())) {
                                if (o86Var9.h() && o86Var10.h()) {
                                    this.A = 0;
                                } else if (o86Var2.h() && o86Var8.h()) {
                                    this.B = 1.0f / this.B;
                                    this.A = 1;
                                }
                            }
                            if (this.A == -1) {
                                int i23 = this.u;
                                if (i23 > 0 && this.x == 0) {
                                    this.A = 0;
                                } else if (i23 == 0 && this.x > 0) {
                                    this.B = 1.0f / this.B;
                                    this.A = 1;
                                }
                            }
                            z10 = z6;
                            z11 = true;
                            i5 = i22;
                            int[] iArr = this.t;
                            iArr[0] = i4;
                            iArr[1] = i5;
                            if (z11) {
                                i6 = -1;
                            } else {
                                int i24 = this.A;
                                i6 = -1;
                                if (i24 == 0 || i24 == -1) {
                                    z12 = true;
                                    boolean z29 = !z11 && ((i12 = this.A) == 1 || i12 == i6);
                                    z13 = this.U[0] != z96Var3 && (this instanceof ba6);
                                    if (z13) {
                                        i3 = 0;
                                    }
                                    o86Var3 = this.Q;
                                    z14 = !o86Var3.h();
                                    z15 = zArr4[0];
                                    boolean z30 = zArr4[1];
                                    if (this.o != 2 && !this.k) {
                                        if (z && (x3eVar = this.d) != null) {
                                            sx7Var2 = x3eVar.h;
                                            if (sx7Var2.j && x3eVar.i.j) {
                                                if (z) {
                                                    j7gVar2.d(k, sx7Var2.g);
                                                    j7gVar2.d(k2, this.d.i.g);
                                                    if (this.V != null && z10 && zArr2[0] && !y()) {
                                                        j7gVar2.f(j7gVar2.k(this.V.L), k2, 0, 8);
                                                    }
                                                }
                                            }
                                        }
                                        aa6 aa6Var5 = this.V;
                                        i3r k6 = aa6Var5 == null ? j7gVar2.k(aa6Var5.L) : null;
                                        aa6 aa6Var6 = this.V;
                                        i3r k7 = aa6Var6 == null ? j7gVar2.k(aa6Var6.J) : null;
                                        boolean z31 = zArr2[0];
                                        z96[] z96VarArr3 = this.U;
                                        i7 = i4;
                                        boolean z32 = z9;
                                        z18 = z10;
                                        boolean z33 = z14;
                                        o86Var4 = o86Var3;
                                        z96Var = z96Var5;
                                        o86Var5 = o86Var;
                                        i3rVar5 = k3;
                                        o86Var6 = o86Var10;
                                        i3rVar4 = k2;
                                        z96Var2 = z96Var3;
                                        i3rVar6 = i3rVar;
                                        i3rVar7 = i3rVar2;
                                        i3rVar3 = k;
                                        j7gVar2 = j7gVar;
                                        zArr3 = zArr2;
                                        d(j7gVar2, true, z18, z24, z31, k7, k6, z96VarArr3[0], z13, this.J, this.L, this.a0, i3, this.d0, this.C[0], this.f0, z12, z96VarArr3[1] == z96Var5, z32, z26, z15, i7, i5, this.u, this.v, this.w, z33);
                                        z17 = z26;
                                        z16 = z32;
                                        z24 = z24;
                                        z19 = z33;
                                        if (z && (f1uVar = this.e) != null) {
                                            sx7Var = f1uVar.h;
                                            if (sx7Var.j && f1uVar.i.j) {
                                                int i25 = sx7Var.g;
                                                i3rVar8 = i3rVar5;
                                                j7gVar2.d(i3rVar8, i25);
                                                i3rVar9 = i3rVar6;
                                                j7gVar2.d(i3rVar9, this.e.i.g);
                                                i3rVar10 = i3rVar7;
                                                j7gVar2.d(i3rVar10, this.e.k.g);
                                                aa6Var3 = this.V;
                                                if (aa6Var3 == null && !z17 && z24) {
                                                    i10 = 1;
                                                    if (zArr3[1]) {
                                                        i8 = 0;
                                                        i9 = 8;
                                                        j7gVar2.f(j7gVar2.k(aa6Var3.M), i3rVar9, 0, 8);
                                                    } else {
                                                        i8 = 0;
                                                        i9 = 8;
                                                    }
                                                } else {
                                                    i8 = 0;
                                                    i9 = 8;
                                                    i10 = 1;
                                                }
                                                i11 = i8;
                                                if ((this.p == 2 ? i8 : i11) != 0 || this.l) {
                                                    i3rVar11 = i3rVar8;
                                                    i3rVar12 = i3rVar9;
                                                } else {
                                                    int i26 = (this.U[i10] == z96Var2 && (this instanceof ba6)) ? i10 : i8;
                                                    int i27 = i26 != 0 ? i8 : i18;
                                                    aa6 aa6Var7 = this.V;
                                                    i3r k8 = aa6Var7 != null ? j7gVar2.k(aa6Var7.M) : null;
                                                    aa6 aa6Var8 = this.V;
                                                    i3r k9 = aa6Var8 != null ? j7gVar2.k(aa6Var8.K) : null;
                                                    int i28 = this.c0;
                                                    if (i28 <= 0) {
                                                        r27 = z19;
                                                    }
                                                    o86 o86Var12 = o86Var5;
                                                    if (o86Var12.f != null) {
                                                        j7gVar2.e(i3rVar10, i3rVar8, i28, i9);
                                                        j7gVar2.e(i3rVar10, j7gVar2.k(o86Var12.f), o86Var12.e(), i9);
                                                        if (z24) {
                                                            j7gVar2.f(k8, j7gVar2.k(o86Var6), i8, 5);
                                                        }
                                                        r27 = i8;
                                                    } else if (this.i0 == i9) {
                                                        j7gVar2.e(i3rVar10, i3rVar8, o86Var12.e(), i9);
                                                        r27 = z19;
                                                    } else {
                                                        j7gVar2.e(i3rVar10, i3rVar8, i28, i9);
                                                        r27 = z19;
                                                    }
                                                    boolean z34 = zArr3[i10];
                                                    z96[] z96VarArr4 = this.U;
                                                    int i29 = i8;
                                                    i3rVar11 = i3rVar8;
                                                    i3rVar12 = i3rVar9;
                                                    j7gVar2 = j7gVar;
                                                    d(j7gVar2, false, z24, z18, z34, k9, k8, z96VarArr4[i10], i26, this.K, this.M, this.b0, i27, this.e0, this.C[i10], this.g0, z29, z96VarArr4[i29] == z96Var ? 1 : i29, z17, z16, z30, i5, i7, this.x, this.y, this.z, r27);
                                                }
                                                if (z11) {
                                                    int i30 = this.A;
                                                    float f2 = this.B;
                                                    if (i30 == 1) {
                                                        bz0 l = j7gVar2.l();
                                                        l.d.g(i3rVar12, -1.0f);
                                                        l.d.g(i3rVar11, 1.0f);
                                                        l.d.g(i3rVar4, f2);
                                                        l.d.g(i3rVar3, -f2);
                                                        j7gVar2.c(l);
                                                    } else {
                                                        bz0 l2 = j7gVar2.l();
                                                        l2.d.g(i3rVar4, -1.0f);
                                                        l2.d.g(i3rVar3, 1.0f);
                                                        l2.d.g(i3rVar12, f2);
                                                        l2.d.g(i3rVar11, -f2);
                                                        j7gVar2.c(l2);
                                                    }
                                                }
                                                if (o86Var4.h()) {
                                                    o86 o86Var13 = o86Var4;
                                                    aa6 aa6Var9 = o86Var13.f.d;
                                                    float radians = (float) Math.toRadians(this.D + 90.0f);
                                                    int e = o86Var13.e();
                                                    i3r k10 = j7gVar2.k(j(2));
                                                    i3r k11 = j7gVar2.k(j(3));
                                                    i3r k12 = j7gVar2.k(j(4));
                                                    i3r k13 = j7gVar2.k(j(5));
                                                    i3r k14 = j7gVar2.k(aa6Var9.j(2));
                                                    i3r k15 = j7gVar2.k(aa6Var9.j(3));
                                                    i3r k16 = j7gVar2.k(aa6Var9.j(4));
                                                    i3r k17 = j7gVar2.k(aa6Var9.j(5));
                                                    bz0 l3 = j7gVar2.l();
                                                    double d = radians;
                                                    double sin = Math.sin(d);
                                                    double d2 = e;
                                                    l3.d.g(k15, 0.5f);
                                                    l3.d.g(k17, 0.5f);
                                                    l3.d.g(k11, -0.5f);
                                                    l3.d.g(k13, -0.5f);
                                                    l3.b = -((float) (sin * d2));
                                                    j7gVar2.c(l3);
                                                    bz0 l4 = j7gVar2.l();
                                                    float cos = (float) (Math.cos(d) * d2);
                                                    l4.d.g(k14, 0.5f);
                                                    l4.d.g(k16, 0.5f);
                                                    l4.d.g(k10, -0.5f);
                                                    l4.d.g(k12, -0.5f);
                                                    l4.b = -cos;
                                                    j7gVar2.c(l4);
                                                }
                                                this.k = false;
                                                this.l = false;
                                            }
                                        }
                                        i3rVar8 = i3rVar5;
                                        i3rVar9 = i3rVar6;
                                        i3rVar10 = i3rVar7;
                                        i8 = 0;
                                        i9 = 8;
                                        i10 = 1;
                                        i11 = 1;
                                        if ((this.p == 2 ? i8 : i11) != 0) {
                                        }
                                        i3rVar11 = i3rVar8;
                                        i3rVar12 = i3rVar9;
                                        if (z11) {
                                        }
                                        if (o86Var4.h()) {
                                        }
                                        this.k = false;
                                        this.l = false;
                                    }
                                    i3rVar3 = k;
                                    z96Var = z96Var5;
                                    i3rVar4 = k2;
                                    o86Var4 = o86Var3;
                                    i7 = i4;
                                    z16 = z9;
                                    z96Var2 = z96Var3;
                                    o86Var5 = o86Var;
                                    z17 = z26;
                                    i3rVar5 = k3;
                                    o86Var6 = o86Var10;
                                    i3rVar6 = i3rVar;
                                    i3rVar7 = i3rVar2;
                                    z18 = z10;
                                    z19 = z14;
                                    zArr3 = zArr2;
                                    if (z) {
                                        sx7Var = f1uVar.h;
                                        if (sx7Var.j) {
                                            int i252 = sx7Var.g;
                                            i3rVar8 = i3rVar5;
                                            j7gVar2.d(i3rVar8, i252);
                                            i3rVar9 = i3rVar6;
                                            j7gVar2.d(i3rVar9, this.e.i.g);
                                            i3rVar10 = i3rVar7;
                                            j7gVar2.d(i3rVar10, this.e.k.g);
                                            aa6Var3 = this.V;
                                            if (aa6Var3 == null) {
                                            }
                                            i8 = 0;
                                            i9 = 8;
                                            i10 = 1;
                                            i11 = i8;
                                            if ((this.p == 2 ? i8 : i11) != 0) {
                                            }
                                            i3rVar11 = i3rVar8;
                                            i3rVar12 = i3rVar9;
                                            if (z11) {
                                            }
                                            if (o86Var4.h()) {
                                            }
                                            this.k = false;
                                            this.l = false;
                                        }
                                    }
                                    i3rVar8 = i3rVar5;
                                    i3rVar9 = i3rVar6;
                                    i3rVar10 = i3rVar7;
                                    i8 = 0;
                                    i9 = 8;
                                    i10 = 1;
                                    i11 = 1;
                                    if ((this.p == 2 ? i8 : i11) != 0) {
                                    }
                                    i3rVar11 = i3rVar8;
                                    i3rVar12 = i3rVar9;
                                    if (z11) {
                                    }
                                    if (o86Var4.h()) {
                                    }
                                    this.k = false;
                                    this.l = false;
                                }
                            }
                            z12 = false;
                            if (z11) {
                            }
                            if (this.U[0] != z96Var3) {
                            }
                            if (z13) {
                            }
                            o86Var3 = this.Q;
                            z14 = !o86Var3.h();
                            z15 = zArr4[0];
                            boolean z302 = zArr4[1];
                            if (this.o != 2) {
                                if (z) {
                                    sx7Var2 = x3eVar.h;
                                    if (sx7Var2.j) {
                                        if (z) {
                                        }
                                    }
                                }
                                aa6 aa6Var52 = this.V;
                                if (aa6Var52 == null) {
                                }
                                aa6 aa6Var62 = this.V;
                                if (aa6Var62 == null) {
                                }
                                boolean z312 = zArr2[0];
                                z96[] z96VarArr32 = this.U;
                                i7 = i4;
                                boolean z322 = z9;
                                z18 = z10;
                                boolean z332 = z14;
                                o86Var4 = o86Var3;
                                z96Var = z96Var5;
                                o86Var5 = o86Var;
                                i3rVar5 = k3;
                                o86Var6 = o86Var10;
                                i3rVar4 = k2;
                                z96Var2 = z96Var3;
                                i3rVar6 = i3rVar;
                                i3rVar7 = i3rVar2;
                                i3rVar3 = k;
                                j7gVar2 = j7gVar;
                                zArr3 = zArr2;
                                d(j7gVar2, true, z18, z24, z312, k7, k6, z96VarArr32[0], z13, this.J, this.L, this.a0, i3, this.d0, this.C[0], this.f0, z12, z96VarArr32[1] == z96Var5, z322, z26, z15, i7, i5, this.u, this.v, this.w, z332);
                                z17 = z26;
                                z16 = z322;
                                z24 = z24;
                                z19 = z332;
                                if (z) {
                                }
                                i3rVar8 = i3rVar5;
                                i3rVar9 = i3rVar6;
                                i3rVar10 = i3rVar7;
                                i8 = 0;
                                i9 = 8;
                                i10 = 1;
                                i11 = 1;
                                if ((this.p == 2 ? i8 : i11) != 0) {
                                }
                                i3rVar11 = i3rVar8;
                                i3rVar12 = i3rVar9;
                                if (z11) {
                                }
                                if (o86Var4.h()) {
                                }
                                this.k = false;
                                this.l = false;
                            }
                            i3rVar3 = k;
                            z96Var = z96Var5;
                            i3rVar4 = k2;
                            o86Var4 = o86Var3;
                            i7 = i4;
                            z16 = z9;
                            z96Var2 = z96Var3;
                            o86Var5 = o86Var;
                            z17 = z26;
                            i3rVar5 = k3;
                            o86Var6 = o86Var10;
                            i3rVar6 = i3rVar;
                            i3rVar7 = i3rVar2;
                            z18 = z10;
                            z19 = z14;
                            zArr3 = zArr2;
                            if (z) {
                            }
                            i3rVar8 = i3rVar5;
                            i3rVar9 = i3rVar6;
                            i3rVar10 = i3rVar7;
                            i8 = 0;
                            i9 = 8;
                            i10 = 1;
                            i11 = 1;
                            if ((this.p == 2 ? i8 : i11) != 0) {
                            }
                            i3rVar11 = i3rVar8;
                            i3rVar12 = i3rVar9;
                            if (z11) {
                            }
                            if (o86Var4.h()) {
                            }
                            this.k = false;
                            this.l = false;
                        }
                    } else {
                        i3rVar2 = k5;
                    }
                    if (z96Var4 == z96Var5 && i4 == 3) {
                        this.A = 0;
                        i3 = (int) (i16 * f);
                        z10 = z6;
                        if (z96Var6 == z96Var5) {
                            z11 = true;
                            i5 = i22;
                            int[] iArr2 = this.t;
                            iArr2[0] = i4;
                            iArr2[1] = i5;
                            if (z11) {
                            }
                            z12 = false;
                            if (z11) {
                            }
                            if (this.U[0] != z96Var3) {
                            }
                            if (z13) {
                            }
                            o86Var3 = this.Q;
                            z14 = !o86Var3.h();
                            z15 = zArr4[0];
                            boolean z3022 = zArr4[1];
                            if (this.o != 2) {
                            }
                            i3rVar3 = k;
                            z96Var = z96Var5;
                            i3rVar4 = k2;
                            o86Var4 = o86Var3;
                            i7 = i4;
                            z16 = z9;
                            z96Var2 = z96Var3;
                            o86Var5 = o86Var;
                            z17 = z26;
                            i3rVar5 = k3;
                            o86Var6 = o86Var10;
                            i3rVar6 = i3rVar;
                            i3rVar7 = i3rVar2;
                            z18 = z10;
                            z19 = z14;
                            zArr3 = zArr2;
                            if (z) {
                            }
                            i3rVar8 = i3rVar5;
                            i3rVar9 = i3rVar6;
                            i3rVar10 = i3rVar7;
                            i8 = 0;
                            i9 = 8;
                            i10 = 1;
                            i11 = 1;
                            if ((this.p == 2 ? i8 : i11) != 0) {
                            }
                            i3rVar11 = i3rVar8;
                            i3rVar12 = i3rVar9;
                            if (z11) {
                            }
                            if (o86Var4.h()) {
                            }
                            this.k = false;
                            this.l = false;
                        }
                        i4 = 4;
                        z11 = false;
                        i5 = i22;
                        int[] iArr22 = this.t;
                        iArr22[0] = i4;
                        iArr22[1] = i5;
                        if (z11) {
                        }
                        z12 = false;
                        if (z11) {
                        }
                        if (this.U[0] != z96Var3) {
                        }
                        if (z13) {
                        }
                        o86Var3 = this.Q;
                        z14 = !o86Var3.h();
                        z15 = zArr4[0];
                        boolean z30222 = zArr4[1];
                        if (this.o != 2) {
                        }
                        i3rVar3 = k;
                        z96Var = z96Var5;
                        i3rVar4 = k2;
                        o86Var4 = o86Var3;
                        i7 = i4;
                        z16 = z9;
                        z96Var2 = z96Var3;
                        o86Var5 = o86Var;
                        z17 = z26;
                        i3rVar5 = k3;
                        o86Var6 = o86Var10;
                        i3rVar6 = i3rVar;
                        i3rVar7 = i3rVar2;
                        z18 = z10;
                        z19 = z14;
                        zArr3 = zArr2;
                        if (z) {
                        }
                        i3rVar8 = i3rVar5;
                        i3rVar9 = i3rVar6;
                        i3rVar10 = i3rVar7;
                        i8 = 0;
                        i9 = 8;
                        i10 = 1;
                        i11 = 1;
                        if ((this.p == 2 ? i8 : i11) != 0) {
                        }
                        i3rVar11 = i3rVar8;
                        i3rVar12 = i3rVar9;
                        if (z11) {
                        }
                        if (o86Var4.h()) {
                        }
                        this.k = false;
                        this.l = false;
                    }
                    if (z96Var6 == z96Var5) {
                        if (i22 == 3) {
                            this.A = 1;
                            if (i19 == -1) {
                                this.B = 1.0f / f;
                            }
                            i18 = (int) (this.B * i2);
                            if (z96Var4 != z96Var5) {
                                z10 = z6;
                                i5 = 4;
                                z11 = false;
                                int[] iArr222 = this.t;
                                iArr222[0] = i4;
                                iArr222[1] = i5;
                                if (z11) {
                                }
                                z12 = false;
                                if (z11) {
                                }
                                if (this.U[0] != z96Var3) {
                                }
                                if (z13) {
                                }
                                o86Var3 = this.Q;
                                z14 = !o86Var3.h();
                                z15 = zArr4[0];
                                boolean z302222 = zArr4[1];
                                if (this.o != 2) {
                                }
                                i3rVar3 = k;
                                z96Var = z96Var5;
                                i3rVar4 = k2;
                                o86Var4 = o86Var3;
                                i7 = i4;
                                z16 = z9;
                                z96Var2 = z96Var3;
                                o86Var5 = o86Var;
                                z17 = z26;
                                i3rVar5 = k3;
                                o86Var6 = o86Var10;
                                i3rVar6 = i3rVar;
                                i3rVar7 = i3rVar2;
                                z18 = z10;
                                z19 = z14;
                                zArr3 = zArr2;
                                if (z) {
                                }
                                i3rVar8 = i3rVar5;
                                i3rVar9 = i3rVar6;
                                i3rVar10 = i3rVar7;
                                i8 = 0;
                                i9 = 8;
                                i10 = 1;
                                i11 = 1;
                                if ((this.p == 2 ? i8 : i11) != 0) {
                                }
                                i3rVar11 = i3rVar8;
                                i3rVar12 = i3rVar9;
                                if (z11) {
                                }
                                if (o86Var4.h()) {
                                }
                                this.k = false;
                                this.l = false;
                            }
                        }
                        z10 = z6;
                        z11 = true;
                        i5 = i22;
                        int[] iArr2222 = this.t;
                        iArr2222[0] = i4;
                        iArr2222[1] = i5;
                        if (z11) {
                        }
                        z12 = false;
                        if (z11) {
                        }
                        if (this.U[0] != z96Var3) {
                        }
                        if (z13) {
                        }
                        o86Var3 = this.Q;
                        z14 = !o86Var3.h();
                        z15 = zArr4[0];
                        boolean z3022222 = zArr4[1];
                        if (this.o != 2) {
                        }
                        i3rVar3 = k;
                        z96Var = z96Var5;
                        i3rVar4 = k2;
                        o86Var4 = o86Var3;
                        i7 = i4;
                        z16 = z9;
                        z96Var2 = z96Var3;
                        o86Var5 = o86Var;
                        z17 = z26;
                        i3rVar5 = k3;
                        o86Var6 = o86Var10;
                        i3rVar6 = i3rVar;
                        i3rVar7 = i3rVar2;
                        z18 = z10;
                        z19 = z14;
                        zArr3 = zArr2;
                        if (z) {
                        }
                        i3rVar8 = i3rVar5;
                        i3rVar9 = i3rVar6;
                        i3rVar10 = i3rVar7;
                        i8 = 0;
                        i9 = 8;
                        i10 = 1;
                        i11 = 1;
                        if ((this.p == 2 ? i8 : i11) != 0) {
                        }
                        i3rVar11 = i3rVar8;
                        i3rVar12 = i3rVar9;
                        if (z11) {
                        }
                        if (o86Var4.h()) {
                        }
                        this.k = false;
                        this.l = false;
                    }
                    z10 = z6;
                    z11 = true;
                    i5 = i22;
                    int[] iArr22222 = this.t;
                    iArr22222[0] = i4;
                    iArr22222[1] = i5;
                    if (z11) {
                    }
                    z12 = false;
                    if (z11) {
                    }
                    if (this.U[0] != z96Var3) {
                    }
                    if (z13) {
                    }
                    o86Var3 = this.Q;
                    z14 = !o86Var3.h();
                    z15 = zArr4[0];
                    boolean z30222222 = zArr4[1];
                    if (this.o != 2) {
                    }
                    i3rVar3 = k;
                    z96Var = z96Var5;
                    i3rVar4 = k2;
                    o86Var4 = o86Var3;
                    i7 = i4;
                    z16 = z9;
                    z96Var2 = z96Var3;
                    o86Var5 = o86Var;
                    z17 = z26;
                    i3rVar5 = k3;
                    o86Var6 = o86Var10;
                    i3rVar6 = i3rVar;
                    i3rVar7 = i3rVar2;
                    z18 = z10;
                    z19 = z14;
                    zArr3 = zArr2;
                    if (z) {
                    }
                    i3rVar8 = i3rVar5;
                    i3rVar9 = i3rVar6;
                    i3rVar10 = i3rVar7;
                    i8 = 0;
                    i9 = 8;
                    i10 = 1;
                    i11 = 1;
                    if ((this.p == 2 ? i8 : i11) != 0) {
                    }
                    i3rVar11 = i3rVar8;
                    i3rVar12 = i3rVar9;
                    if (z11) {
                    }
                    if (o86Var4.h()) {
                    }
                    this.k = false;
                    this.l = false;
                }
            } else {
                i3rVar = k4;
            }
            i3rVar2 = k5;
            z10 = z6;
            i4 = i20;
            i5 = i21;
            z11 = false;
            int[] iArr222222 = this.t;
            iArr222222[0] = i4;
            iArr222222[1] = i5;
            if (z11) {
            }
            z12 = false;
            if (z11) {
            }
            if (this.U[0] != z96Var3) {
            }
            if (z13) {
            }
            o86Var3 = this.Q;
            z14 = !o86Var3.h();
            z15 = zArr4[0];
            boolean z302222222 = zArr4[1];
            if (this.o != 2) {
            }
            i3rVar3 = k;
            z96Var = z96Var5;
            i3rVar4 = k2;
            o86Var4 = o86Var3;
            i7 = i4;
            z16 = z9;
            z96Var2 = z96Var3;
            o86Var5 = o86Var;
            z17 = z26;
            i3rVar5 = k3;
            o86Var6 = o86Var10;
            i3rVar6 = i3rVar;
            i3rVar7 = i3rVar2;
            z18 = z10;
            z19 = z14;
            zArr3 = zArr2;
            if (z) {
            }
            i3rVar8 = i3rVar5;
            i3rVar9 = i3rVar6;
            i3rVar10 = i3rVar7;
            i8 = 0;
            i9 = 8;
            i10 = 1;
            i11 = 1;
            if ((this.p == 2 ? i8 : i11) != 0) {
            }
            i3rVar11 = i3rVar8;
            i3rVar12 = i3rVar9;
            if (z11) {
            }
            if (o86Var4.h()) {
            }
            this.k = false;
            this.l = false;
        }
        z2 = true;
        z3 = false;
        z4 = z3 ? 1 : 0;
        z5 = z4;
        r18 = z3;
        r20 = z2;
        i = this.i0;
        boolean z242 = z4;
        boolean[] zArr42 = this.T;
        if (i == 8) {
        }
        z6 = z5;
        z7 = this.k;
        if (!z7) {
        }
        if (z7) {
        }
        if (this.l) {
        }
        if (this.k) {
            boolean z252 = r18;
            this.k = z252;
            this.l = z252;
            return;
        }
        zArr = this.f;
        if (z) {
        }
        o86Var = o86Var11;
        zArr2 = zArr;
        if (this.V == null) {
        }
        i2 = this.W;
        i3 = this.d0;
        if (i2 >= i3) {
        }
        int i162 = this.X;
        boolean z262 = z8;
        int i172 = this.e0;
        if (i162 >= i172) {
        }
        z96[] z96VarArr22 = this.U;
        z96 z96Var42 = z96VarArr22[0];
        z96 z96Var52 = z96.c;
        if (z96Var42 == z96Var52) {
        }
        z96 z96Var62 = z96VarArr22[1];
        if (z96Var62 == z96Var52) {
        }
        int i192 = this.Z;
        this.A = i192;
        f = this.Y;
        this.B = f;
        int i202 = this.r;
        int i212 = this.s;
        if (f <= 0.0f) {
        }
        i3rVar2 = k5;
        z10 = z6;
        i4 = i202;
        i5 = i212;
        z11 = false;
        int[] iArr2222222 = this.t;
        iArr2222222[0] = i4;
        iArr2222222[1] = i5;
        if (z11) {
        }
        z12 = false;
        if (z11) {
        }
        if (this.U[0] != z96Var3) {
        }
        if (z13) {
        }
        o86Var3 = this.Q;
        z14 = !o86Var3.h();
        z15 = zArr42[0];
        boolean z3022222222 = zArr42[1];
        if (this.o != 2) {
        }
        i3rVar3 = k;
        z96Var = z96Var52;
        i3rVar4 = k2;
        o86Var4 = o86Var3;
        i7 = i4;
        z16 = z9;
        z96Var2 = z96Var3;
        o86Var5 = o86Var;
        z17 = z262;
        i3rVar5 = k3;
        o86Var6 = o86Var10;
        i3rVar6 = i3rVar;
        i3rVar7 = i3rVar2;
        z18 = z10;
        z19 = z14;
        zArr3 = zArr2;
        if (z) {
        }
        i3rVar8 = i3rVar5;
        i3rVar9 = i3rVar6;
        i3rVar10 = i3rVar7;
        i8 = 0;
        i9 = 8;
        i10 = 1;
        i11 = 1;
        if ((this.p == 2 ? i8 : i11) != 0) {
        }
        i3rVar11 = i3rVar8;
        i3rVar12 = i3rVar9;
        if (z11) {
        }
        if (o86Var4.h()) {
        }
        this.k = false;
        this.l = false;
    }

    public boolean c() {
        return this.i0 != 8;
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x03bb A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:107:0x03c8  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0410  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x041e  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x043f A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0457  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x04a4  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x04b4 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0401  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x04d3 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:65:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void d(j7g j7gVar, boolean z, boolean z2, boolean z3, boolean z4, i3r i3rVar, i3r i3rVar2, z96 z96Var, boolean z5, o86 o86Var, o86 o86Var2, int i, int i2, int i3, int i4, float f, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, int i5, int i6, int i7, int i8, float f2, boolean z11) {
        boolean z12;
        boolean z13;
        int i9;
        boolean z14;
        boolean z15;
        int i10;
        int i11;
        boolean z16;
        i3r k;
        i3r k2;
        o86 o86Var3;
        i3r i3rVar3;
        boolean z17;
        int i12;
        i3r i3rVar4;
        i3r i3rVar5;
        i3r i3rVar6;
        i3r i3rVar7;
        int i13;
        int i14;
        int i15;
        boolean z18;
        boolean z19;
        boolean z20;
        boolean z21;
        aa6 aa6Var;
        int i16;
        int i17;
        o86 o86Var4;
        boolean z22;
        int i18;
        boolean z23;
        int i19;
        int i20;
        HashSet hashSet;
        boolean z24;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        boolean z25;
        boolean z26;
        int i26;
        j7g j7gVar2 = j7gVar;
        int i27 = i7;
        int i28 = i8;
        i3r k3 = j7gVar2.k(o86Var);
        i3r k4 = j7gVar2.k(o86Var2);
        i3r k5 = j7gVar2.k(o86Var.f);
        i3r k6 = j7gVar2.k(o86Var2.f);
        boolean h = o86Var.h();
        boolean h2 = o86Var2.h();
        boolean h3 = this.Q.h();
        int i29 = h2 ? (h ? 1 : 0) + 1 : h ? 1 : 0;
        if (h3) {
            i29++;
        }
        int i30 = i29;
        int i31 = z6 ? 3 : i5;
        int ordinal = z96Var.ordinal();
        boolean z27 = (ordinal == 0 || ordinal == 1 || ordinal != 2 || i31 == 4) ? false : true;
        int i32 = this.h;
        if (i32 == -1 || !z) {
            i32 = i2;
            z12 = z27;
        } else {
            this.h = -1;
            z12 = false;
        }
        int i33 = this.i;
        if (i33 == -1 || z) {
            z13 = z12;
        } else {
            this.i = -1;
            i32 = i33;
            z13 = false;
        }
        boolean z28 = z13;
        if (this.i0 == 8) {
            z14 = false;
            i9 = 0;
        } else {
            i9 = i32;
            z14 = z28;
        }
        if (z11) {
            if (!h && !h2 && !h3) {
                j7gVar2.d(k3, i);
            } else if (h && !h2) {
                z15 = z14;
                i10 = 8;
                j7gVar2.e(k3, k5, o86Var.e(), 8);
            }
            z15 = z14;
            i10 = 8;
        } else {
            z15 = z14;
            i10 = 8;
        }
        if (z15) {
            if (i30 == 2 || z6 || !(i31 == 1 || i31 == 0)) {
                if (i27 == -2) {
                    i27 = i9;
                }
                if (i28 == -2) {
                    i28 = i9;
                }
                if (i9 > 0 && i31 != 1) {
                    i9 = 0;
                }
                if (i27 > 0) {
                    j7gVar2.f(k4, k3, i27, 8);
                    i9 = Math.max(i9, i27);
                }
                if (i28 > 0) {
                    if (!z2 || i31 != 1) {
                        j7gVar2.g(k4, k3, i28, 8);
                    }
                    i9 = Math.min(i9, i28);
                }
                if (i31 == 1) {
                    if (z2) {
                        j7gVar2.e(k4, k3, i9, 8);
                    } else if (z8) {
                        j7gVar2.e(k4, k3, i9, 5);
                        j7gVar2.g(k4, k3, i9, 8);
                    } else {
                        j7gVar2.e(k4, k3, i9, 5);
                        j7gVar2.g(k4, k3, i9, 8);
                    }
                } else if (i31 == 2) {
                    int i34 = o86Var.e;
                    if (i34 == 3 || i34 == 5) {
                        k = j7gVar2.k(this.V.j(3));
                        k2 = j7gVar2.k(this.V.j(5));
                    } else {
                        k = j7gVar2.k(this.V.j(2));
                        k2 = j7gVar2.k(this.V.j(4));
                    }
                    bz0 l = j7gVar2.l();
                    int i35 = i27;
                    l.d.g(k4, -1.0f);
                    l.d.g(k3, 1.0f);
                    l.d.g(k2, f2);
                    l.d.g(k, -f2);
                    j7gVar2.c(l);
                    if (z2) {
                        z15 = false;
                    }
                    z16 = z4;
                    i11 = i35;
                } else {
                    i11 = i27;
                    z16 = true;
                }
            } else {
                int max = Math.max(i27, i9);
                if (i28 > 0) {
                    max = Math.min(i28, max);
                }
                j7gVar2.e(k4, k3, max, 8);
                z16 = z4;
                i11 = i27;
                z15 = false;
            }
            if (z11 || z8) {
                boolean z29 = z16;
                if (i30 >= 2 && z2 && z29) {
                    j7gVar2.f(k3, i3rVar, 0, 8);
                    o86 o86Var5 = this.N;
                    boolean z30 = z || o86Var5.f == null;
                    if (!z && (o86Var3 = o86Var5.f) != null) {
                        aa6 aa6Var2 = o86Var3.d;
                        if (aa6Var2.Y != 0.0f) {
                            z96[] z96VarArr = aa6Var2.U;
                            z96 z96Var2 = z96VarArr[0];
                            z96 z96Var3 = z96.c;
                            if (z96Var2 == z96Var3 && z96VarArr[1] == z96Var3) {
                                z30 = true;
                            }
                        }
                        z30 = false;
                    }
                    if (z30) {
                        j7gVar2.f(i3rVar2, k4, 0, 8);
                        return;
                    }
                    return;
                }
                return;
            }
            if (!h && !h2 && !h3) {
                o86Var4 = o86Var2;
                i3rVar6 = k4;
                z17 = z16;
                i3rVar3 = k6;
            } else if (!h || h2) {
                if (h || !h2) {
                    i3rVar3 = k6;
                    if (h && h2) {
                        aa6 aa6Var3 = o86Var.f.d;
                        aa6 aa6Var4 = o86Var2.f.d;
                        z17 = z16;
                        aa6 aa6Var5 = this.V;
                        int i36 = 6;
                        if (z15) {
                            if (i31 == 0) {
                                if (i28 != 0 || i11 != 0) {
                                    i24 = 5;
                                    i25 = 5;
                                    z25 = true;
                                    z26 = false;
                                    z19 = true;
                                } else if (k5.f && i3rVar3.f) {
                                    j7gVar2.e(k3, k5, o86Var.e(), 8);
                                    j7gVar2.e(k4, i3rVar3, -o86Var2.e(), 8);
                                    return;
                                } else {
                                    i24 = 8;
                                    i25 = 8;
                                    z25 = false;
                                    z26 = true;
                                    z19 = false;
                                }
                                if ((aa6Var3 instanceof ap2) || (aa6Var4 instanceof ap2)) {
                                    j7gVar2 = j7gVar;
                                    i12 = i31;
                                    i3rVar5 = k3;
                                    i3rVar6 = k4;
                                    z20 = z26;
                                    i3rVar4 = i3rVar2;
                                    i14 = i24;
                                    i3rVar7 = k5;
                                    i13 = 6;
                                    z18 = z25;
                                    i15 = 4;
                                    if (z19 || i3rVar7 != i3rVar3 || aa6Var3 == aa6Var5) {
                                        z21 = true;
                                    } else {
                                        z19 = false;
                                        z21 = false;
                                    }
                                    if (z18) {
                                        aa6Var = aa6Var4;
                                        i16 = i11;
                                        i17 = i12;
                                        o86Var4 = o86Var2;
                                        z22 = z2;
                                    } else {
                                        if (z15 || z7 || z9 || i3rVar7 != i3rVar || i3rVar3 != i3rVar4) {
                                            z22 = z2;
                                            z24 = z21;
                                            i21 = i14;
                                        } else {
                                            i13 = 8;
                                            z22 = false;
                                            i21 = 8;
                                            z24 = false;
                                        }
                                        i3r i3rVar8 = i3rVar7;
                                        i16 = i11;
                                        i17 = i12;
                                        aa6Var = aa6Var4;
                                        o86Var4 = o86Var2;
                                        j7gVar2.b(i3rVar5, i3rVar8, o86Var.e(), f, i3rVar3, i3rVar6, o86Var2.e(), i13);
                                        i3rVar7 = i3rVar8;
                                        i14 = i21;
                                        z21 = z24;
                                    }
                                    if (this.i0 != 8 && ((hashSet = o86Var4.a) == null || hashSet.size() <= 0)) {
                                        return;
                                    }
                                    if (z19) {
                                        if (z22 && i3rVar7 != i3rVar3 && !z15 && ((aa6Var3 instanceof ap2) || (aa6Var instanceof ap2))) {
                                            i14 = 6;
                                        }
                                        j7gVar2.f(i3rVar5, i3rVar7, o86Var.e(), i14);
                                        j7gVar2.g(i3rVar6, i3rVar3, -o86Var4.e(), i14);
                                    }
                                    if (z22 || !z10 || (aa6Var3 instanceof ap2) || (aa6Var instanceof ap2) || aa6Var == aa6Var5) {
                                        i18 = i15;
                                        z23 = z21;
                                    } else {
                                        i18 = 6;
                                        i14 = 6;
                                        z23 = true;
                                    }
                                    if (z23) {
                                        if (z20 && (!z9 || z3)) {
                                            if (aa6Var3 != aa6Var5 && aa6Var != aa6Var5) {
                                                i36 = i18;
                                            }
                                            if ((aa6Var3 instanceof grd) || (aa6Var instanceof grd)) {
                                                i36 = 5;
                                            }
                                            if ((aa6Var3 instanceof ap2) || (aa6Var instanceof ap2)) {
                                                i36 = 5;
                                            }
                                            i18 = Math.max(z9 ? 5 : i36, i18);
                                        }
                                        if (z22) {
                                            i18 = Math.min(i14, i18);
                                            if (z6 && !z9 && (aa6Var3 == aa6Var5 || aa6Var == aa6Var5)) {
                                                i20 = 4;
                                                j7gVar2.e(i3rVar5, i3rVar7, o86Var.e(), i20);
                                                j7gVar2.e(i3rVar6, i3rVar3, -o86Var4.e(), i20);
                                            }
                                        }
                                        i20 = i18;
                                        j7gVar2.e(i3rVar5, i3rVar7, o86Var.e(), i20);
                                        j7gVar2.e(i3rVar6, i3rVar3, -o86Var4.e(), i20);
                                    }
                                    if (z22) {
                                        int e = i3rVar == i3rVar7 ? o86Var.e() : 0;
                                        if (i3rVar7 != i3rVar) {
                                            j7gVar2.f(i3rVar5, i3rVar, e, 5);
                                        }
                                    }
                                    if (z22 && z15 && i3 == 0 && i16 == 0) {
                                        if (z15 || i17 != 3) {
                                            i19 = 5;
                                            j7gVar2.f(i3rVar6, i3rVar5, 0, 5);
                                        } else {
                                            j7gVar2.f(i3rVar6, i3rVar5, 0, 8);
                                        }
                                    }
                                    i19 = 5;
                                } else {
                                    j7gVar2 = j7gVar;
                                    i3rVar5 = k3;
                                    i3rVar6 = k4;
                                    z20 = z26;
                                    i14 = i24;
                                    i3rVar7 = k5;
                                    i13 = 6;
                                    z18 = z25;
                                    i15 = i25;
                                    i12 = i31;
                                    i3rVar4 = i3rVar2;
                                    if (z19) {
                                    }
                                    z21 = true;
                                    if (z18) {
                                    }
                                    if (this.i0 != 8) {
                                    }
                                    if (z19) {
                                    }
                                    if (z22) {
                                    }
                                    i18 = i15;
                                    z23 = z21;
                                    if (z23) {
                                    }
                                    if (z22) {
                                    }
                                    if (z22) {
                                        if (z15) {
                                        }
                                        i19 = 5;
                                        j7gVar2.f(i3rVar6, i3rVar5, 0, 5);
                                    }
                                    i19 = 5;
                                }
                            } else {
                                if (i31 == 2) {
                                    if ((aa6Var3 instanceof ap2) || (aa6Var4 instanceof ap2)) {
                                        j7gVar2 = j7gVar;
                                        i12 = i31;
                                        i3rVar5 = k3;
                                        i3rVar6 = k4;
                                        i3rVar7 = k5;
                                        i13 = 6;
                                        i14 = 5;
                                    } else {
                                        j7gVar2 = j7gVar;
                                        i12 = i31;
                                        i3rVar5 = k3;
                                        i3rVar6 = k4;
                                        i3rVar7 = k5;
                                        i13 = 6;
                                        i14 = 5;
                                        i15 = 5;
                                        z18 = true;
                                        z19 = true;
                                        z20 = false;
                                        i3rVar4 = i3rVar2;
                                        if (z19) {
                                        }
                                        z21 = true;
                                        if (z18) {
                                        }
                                        if (this.i0 != 8) {
                                        }
                                        if (z19) {
                                        }
                                        if (z22) {
                                        }
                                        i18 = i15;
                                        z23 = z21;
                                        if (z23) {
                                        }
                                        if (z22) {
                                        }
                                        if (z22) {
                                        }
                                        i19 = 5;
                                    }
                                } else if (i31 == 1) {
                                    j7gVar2 = j7gVar;
                                    i12 = i31;
                                    i3rVar5 = k3;
                                    i3rVar6 = k4;
                                    i3rVar7 = k5;
                                    i13 = 6;
                                    i14 = 8;
                                } else if (i31 == 3) {
                                    i12 = i31;
                                    if (this.A != -1) {
                                        if (z6) {
                                            if (i6 == 2 || i6 == 1) {
                                                i22 = 5;
                                                i23 = 4;
                                            } else {
                                                i22 = 8;
                                                i23 = 5;
                                            }
                                            i15 = i23;
                                            i3rVar5 = k3;
                                            i3rVar6 = k4;
                                            i3rVar7 = k5;
                                            i13 = 6;
                                            z18 = true;
                                            z19 = true;
                                            z20 = true;
                                            i3rVar4 = i3rVar2;
                                        } else if (i28 > 0) {
                                            j7gVar2 = j7gVar;
                                            i3rVar4 = i3rVar2;
                                            i3rVar5 = k3;
                                            i3rVar6 = k4;
                                            i3rVar7 = k5;
                                            i13 = 6;
                                            i14 = 5;
                                        } else {
                                            if (i28 != 0 || i11 != 0) {
                                                j7gVar2 = j7gVar;
                                                i3rVar4 = i3rVar2;
                                                i3rVar5 = k3;
                                                i3rVar6 = k4;
                                                i3rVar7 = k5;
                                                i13 = 6;
                                                i14 = 5;
                                                i15 = 4;
                                            } else if (z9) {
                                                i22 = (aa6Var3 == aa6Var5 || aa6Var4 == aa6Var5) ? 5 : 4;
                                                i3rVar4 = i3rVar2;
                                                i3rVar5 = k3;
                                                i3rVar6 = k4;
                                                i3rVar7 = k5;
                                                i13 = 6;
                                                i15 = 4;
                                                z18 = true;
                                                z19 = true;
                                                z20 = true;
                                            } else {
                                                j7gVar2 = j7gVar;
                                                i3rVar4 = i3rVar2;
                                                i3rVar5 = k3;
                                                i3rVar6 = k4;
                                                i3rVar7 = k5;
                                                i13 = 6;
                                                i14 = 5;
                                                i15 = 8;
                                            }
                                            z18 = true;
                                            z19 = true;
                                            z20 = true;
                                            if (z19) {
                                            }
                                            z21 = true;
                                            if (z18) {
                                            }
                                            if (this.i0 != 8) {
                                            }
                                            if (z19) {
                                            }
                                            if (z22) {
                                            }
                                            i18 = i15;
                                            z23 = z21;
                                            if (z23) {
                                            }
                                            if (z22) {
                                            }
                                            if (z22) {
                                            }
                                            i19 = 5;
                                        }
                                        i14 = i22;
                                        j7gVar2 = j7gVar;
                                        if (z19) {
                                        }
                                        z21 = true;
                                        if (z18) {
                                        }
                                        if (this.i0 != 8) {
                                        }
                                        if (z19) {
                                        }
                                        if (z22) {
                                        }
                                        i18 = i15;
                                        z23 = z21;
                                        if (z23) {
                                        }
                                        if (z22) {
                                        }
                                        if (z22) {
                                        }
                                        i19 = 5;
                                    } else if (z9) {
                                        j7gVar2 = j7gVar;
                                        i3rVar4 = i3rVar2;
                                        i3rVar5 = k3;
                                        i3rVar6 = k4;
                                        i3rVar7 = k5;
                                        i14 = 8;
                                        i13 = z2 ? 5 : 4;
                                    } else {
                                        j7gVar2 = j7gVar;
                                        i3rVar4 = i3rVar2;
                                        i3rVar5 = k3;
                                        i3rVar6 = k4;
                                        i3rVar7 = k5;
                                        i14 = 8;
                                        i13 = 8;
                                    }
                                    i15 = 5;
                                    z18 = true;
                                    z19 = true;
                                    z20 = true;
                                    if (z19) {
                                    }
                                    z21 = true;
                                    if (z18) {
                                    }
                                    if (this.i0 != 8) {
                                    }
                                    if (z19) {
                                    }
                                    if (z22) {
                                    }
                                    i18 = i15;
                                    z23 = z21;
                                    if (z23) {
                                    }
                                    if (z22) {
                                    }
                                    if (z22) {
                                    }
                                    i19 = 5;
                                } else {
                                    i12 = i31;
                                    j7gVar2 = j7gVar;
                                    i3rVar4 = i3rVar2;
                                    i3rVar5 = k3;
                                    i3rVar6 = k4;
                                    i3rVar7 = k5;
                                    i13 = 6;
                                    i14 = 5;
                                    i15 = 4;
                                    z18 = false;
                                    z19 = false;
                                }
                                i15 = 4;
                                z18 = true;
                                z19 = true;
                                z20 = false;
                                i3rVar4 = i3rVar2;
                                if (z19) {
                                }
                                z21 = true;
                                if (z18) {
                                }
                                if (this.i0 != 8) {
                                }
                                if (z19) {
                                }
                                if (z22) {
                                }
                                i18 = i15;
                                z23 = z21;
                                if (z23) {
                                }
                                if (z22) {
                                }
                                if (z22) {
                                }
                                i19 = 5;
                            }
                            i26 = i19;
                            if (z22 && z17) {
                                int e2 = o86Var4.f != null ? o86Var4.e() : 0;
                                if (i3rVar3 != i3rVar2) {
                                    j7gVar2.f(i3rVar2, i3rVar6, e2, i26);
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                        i12 = i31;
                        if (k5.f && i3rVar3.f) {
                            j7gVar.b(k3, k5, o86Var.e(), f, i3rVar3, k4, o86Var2.e(), 8);
                            if (z2 && z17) {
                                int e3 = o86Var2.f != null ? o86Var2.e() : 0;
                                if (i3rVar3 != i3rVar2) {
                                    j7gVar.f(i3rVar2, k4, e3, 5);
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                        j7gVar2 = j7gVar;
                        i3rVar4 = i3rVar2;
                        i3rVar5 = k3;
                        i3rVar6 = k4;
                        i3rVar7 = k5;
                        i13 = 6;
                        i14 = 5;
                        i15 = 4;
                        z18 = true;
                        z19 = true;
                        z20 = false;
                        if (z19) {
                        }
                        z21 = true;
                        if (z18) {
                        }
                        if (this.i0 != 8) {
                        }
                        if (z19) {
                        }
                        if (z22) {
                        }
                        i18 = i15;
                        z23 = z21;
                        if (z23) {
                        }
                        if (z22) {
                        }
                        if (z22) {
                        }
                        i19 = 5;
                        i26 = i19;
                        if (z22) {
                            return;
                        } else {
                            return;
                        }
                    }
                } else {
                    i3rVar3 = k6;
                    j7gVar2.e(k4, i3rVar3, -o86Var2.e(), 8);
                    if (z2) {
                        j7gVar2.f(k3, i3rVar, 0, 5);
                        o86Var4 = o86Var2;
                        i19 = 5;
                        i3rVar6 = k4;
                        z17 = z16;
                        z22 = z2;
                        i26 = i19;
                        if (z22) {
                        }
                    }
                }
                o86Var4 = o86Var2;
                i3rVar6 = k4;
                z17 = z16;
            } else {
                o86Var4 = o86Var2;
                i3rVar6 = k4;
                z17 = z16;
                i3rVar3 = k6;
                z22 = z2;
                i26 = (z2 && (o86Var.f.d instanceof ap2)) ? 8 : 5;
                if (z22) {
                }
            }
            i19 = 5;
            z22 = z2;
            i26 = i19;
            if (z22) {
            }
        } else if (z5) {
            j7gVar2.e(k4, k3, 0, 3);
            if (i3 > 0) {
                j7gVar2.f(k4, k3, i3, i10);
            }
            if (i4 < Integer.MAX_VALUE) {
                j7gVar2.g(k4, k3, i4, i10);
            }
        } else {
            j7gVar2.e(k4, k3, i9, i10);
        }
        z16 = z4;
        i11 = i27;
        if (z11) {
        }
        boolean z292 = z16;
        if (i30 >= 2) {
        }
    }

    public final void e(int i, aa6 aa6Var, int i2, int i3) {
        boolean z;
        if (i == 7) {
            if (i2 != 7) {
                if (i2 == 2 || i2 == 4) {
                    e(2, aa6Var, i2, 0);
                    e(4, aa6Var, i2, 0);
                    j(7).a(aa6Var.j(i2), 0);
                    return;
                } else {
                    if (i2 == 3 || i2 == 5) {
                        e(3, aa6Var, i2, 0);
                        e(5, aa6Var, i2, 0);
                        j(7).a(aa6Var.j(i2), 0);
                        return;
                    }
                    return;
                }
            }
            o86 j = j(2);
            o86 j2 = j(4);
            o86 j3 = j(3);
            o86 j4 = j(5);
            boolean z2 = true;
            if ((j == null || !j.h()) && (j2 == null || !j2.h())) {
                e(2, aa6Var, 2, 0);
                e(4, aa6Var, 4, 0);
                z = true;
            } else {
                z = false;
            }
            if ((j3 == null || !j3.h()) && (j4 == null || !j4.h())) {
                e(3, aa6Var, 3, 0);
                e(5, aa6Var, 5, 0);
            } else {
                z2 = false;
            }
            if (z && z2) {
                j(7).a(aa6Var.j(7), 0);
                return;
            } else if (z) {
                j(8).a(aa6Var.j(8), 0);
                return;
            } else {
                if (z2) {
                    j(9).a(aa6Var.j(9), 0);
                    return;
                }
                return;
            }
        }
        if (i == 8 && (i2 == 2 || i2 == 4)) {
            o86 j5 = j(2);
            o86 j6 = aa6Var.j(i2);
            o86 j7 = j(4);
            j5.a(j6, 0);
            j7.a(j6, 0);
            j(8).a(j6, 0);
            return;
        }
        if (i == 9 && (i2 == 3 || i2 == 5)) {
            o86 j8 = aa6Var.j(i2);
            j(3).a(j8, 0);
            j(5).a(j8, 0);
            j(9).a(j8, 0);
            return;
        }
        if (i == 8 && i2 == 8) {
            j(2).a(aa6Var.j(2), 0);
            j(4).a(aa6Var.j(4), 0);
            j(8).a(aa6Var.j(i2), 0);
            return;
        }
        if (i == 9 && i2 == 9) {
            j(3).a(aa6Var.j(3), 0);
            j(5).a(aa6Var.j(5), 0);
            j(9).a(aa6Var.j(i2), 0);
            return;
        }
        o86 j9 = j(i);
        o86 j10 = aa6Var.j(i2);
        if (j9.i(j10)) {
            if (i == 6) {
                o86 j11 = j(3);
                o86 j12 = j(5);
                if (j11 != null) {
                    j11.j();
                }
                if (j12 != null) {
                    j12.j();
                }
            } else if (i == 3 || i == 5) {
                o86 j13 = j(6);
                if (j13 != null) {
                    j13.j();
                }
                o86 j14 = j(7);
                if (j14.f != j10) {
                    j14.j();
                }
                o86 f = j(i).f();
                o86 j15 = j(9);
                if (j15.h()) {
                    f.j();
                    j15.j();
                }
            } else if (i == 2 || i == 4) {
                o86 j16 = j(7);
                if (j16.f != j10) {
                    j16.j();
                }
                o86 f2 = j(i).f();
                o86 j17 = j(8);
                if (j17.h()) {
                    f2.j();
                    j17.j();
                }
            }
            j9.a(j10, i3);
        }
    }

    public final void f(o86 o86Var, o86 o86Var2, int i) {
        if (o86Var.d == this) {
            e(o86Var.e, o86Var2.d, o86Var2.e, i);
        }
    }

    public void g(aa6 aa6Var, HashMap hashMap) {
        this.o = aa6Var.o;
        this.p = aa6Var.p;
        this.r = aa6Var.r;
        this.s = aa6Var.s;
        int[] iArr = aa6Var.t;
        int i = iArr[0];
        int[] iArr2 = this.t;
        iArr2[0] = i;
        iArr2[1] = iArr[1];
        this.u = aa6Var.u;
        this.v = aa6Var.v;
        this.x = aa6Var.x;
        this.y = aa6Var.y;
        this.z = aa6Var.z;
        this.A = aa6Var.A;
        this.B = aa6Var.B;
        int[] iArr3 = aa6Var.C;
        this.C = Arrays.copyOf(iArr3, iArr3.length);
        this.D = aa6Var.D;
        this.E = aa6Var.E;
        this.F = aa6Var.F;
        this.J.j();
        this.K.j();
        this.L.j();
        this.M.j();
        this.N.j();
        this.O.j();
        this.P.j();
        this.Q.j();
        this.U = (z96[]) Arrays.copyOf(this.U, 2);
        this.V = this.V == null ? null : (aa6) hashMap.get(aa6Var.V);
        this.W = aa6Var.W;
        this.X = aa6Var.X;
        this.Y = aa6Var.Y;
        this.Z = aa6Var.Z;
        this.a0 = aa6Var.a0;
        this.b0 = aa6Var.b0;
        this.c0 = aa6Var.c0;
        this.d0 = aa6Var.d0;
        this.e0 = aa6Var.e0;
        this.f0 = aa6Var.f0;
        this.g0 = aa6Var.g0;
        this.h0 = aa6Var.h0;
        this.i0 = aa6Var.i0;
        this.j0 = aa6Var.j0;
        this.k0 = aa6Var.k0;
        this.l0 = aa6Var.l0;
        this.m0 = aa6Var.m0;
        float[] fArr = aa6Var.n0;
        float f = fArr[0];
        float[] fArr2 = this.n0;
        fArr2[0] = f;
        fArr2[1] = fArr[1];
        aa6[] aa6VarArr = aa6Var.o0;
        aa6 aa6Var2 = aa6VarArr[0];
        aa6[] aa6VarArr2 = this.o0;
        aa6VarArr2[0] = aa6Var2;
        aa6VarArr2[1] = aa6VarArr[1];
        aa6[] aa6VarArr3 = aa6Var.p0;
        aa6 aa6Var3 = aa6VarArr3[0];
        aa6[] aa6VarArr4 = this.p0;
        aa6VarArr4[0] = aa6Var3;
        aa6VarArr4[1] = aa6VarArr3[1];
        aa6 aa6Var4 = aa6Var.q0;
        this.q0 = aa6Var4 == null ? null : (aa6) hashMap.get(aa6Var4);
        aa6 aa6Var5 = aa6Var.r0;
        this.r0 = aa6Var5 != null ? (aa6) hashMap.get(aa6Var5) : null;
    }

    public final void h(j7g j7gVar) {
        j7gVar.k(this.J);
        j7gVar.k(this.K);
        j7gVar.k(this.L);
        j7gVar.k(this.M);
        if (this.c0 > 0) {
            j7gVar.k(this.N);
        }
    }

    public final void i() {
        if (this.d == null) {
            x3e x3eVar = new x3e(this);
            x3eVar.h.e = 4;
            x3eVar.i.e = 5;
            x3eVar.f = 0;
            this.d = x3eVar;
        }
        if (this.e == null) {
            f1u f1uVar = new f1u(this);
            sx7 sx7Var = new sx7(f1uVar);
            f1uVar.k = sx7Var;
            f1uVar.l = null;
            f1uVar.h.e = 6;
            f1uVar.i.e = 7;
            sx7Var.e = 8;
            f1uVar.f = 1;
            this.e = f1uVar;
        }
    }

    public o86 j(int i) {
        switch (ouj.D(i)) {
            case 0:
                return null;
            case 1:
                return this.J;
            case 2:
                return this.K;
            case 3:
                return this.L;
            case 4:
                return this.M;
            case 5:
                return this.N;
            case 6:
                return this.Q;
            case 7:
                return this.O;
            case 8:
                return this.P;
            default:
                xq0.w(su4.x(i));
                return null;
        }
    }

    public final z96 k(int i) {
        if (i == 0) {
            return this.U[0];
        }
        if (i == 1) {
            return this.U[1];
        }
        return null;
    }

    public final int l() {
        if (this.i0 == 8) {
            return 0;
        }
        return this.X;
    }

    public final aa6 m(int i) {
        o86 o86Var;
        o86 o86Var2;
        if (i != 0) {
            if (i == 1 && (o86Var2 = (o86Var = this.M).f) != null && o86Var2.f == o86Var) {
                return o86Var2.d;
            }
            return null;
        }
        o86 o86Var3 = this.L;
        o86 o86Var4 = o86Var3.f;
        if (o86Var4 == null || o86Var4.f != o86Var3) {
            return null;
        }
        return o86Var4.d;
    }

    public final aa6 n(int i) {
        o86 o86Var;
        o86 o86Var2;
        if (i != 0) {
            if (i == 1 && (o86Var2 = (o86Var = this.K).f) != null && o86Var2.f == o86Var) {
                return o86Var2.d;
            }
            return null;
        }
        o86 o86Var3 = this.J;
        o86 o86Var4 = o86Var3.f;
        if (o86Var4 == null || o86Var4.f != o86Var3) {
            return null;
        }
        return o86Var4.d;
    }

    public void o(StringBuilder sb) {
        sb.append("  " + this.j + ":{\n");
        StringBuilder sb2 = new StringBuilder("    actualWidth:");
        sb2.append(this.W);
        sb.append(sb2.toString());
        sb.append(StringUtil.LF);
        sb.append("    actualHeight:" + this.X);
        sb.append(StringUtil.LF);
        sb.append("    actualLeft:" + this.a0);
        sb.append(StringUtil.LF);
        sb.append("    actualTop:" + this.b0);
        sb.append(StringUtil.LF);
        q(sb, "left", this.J);
        q(sb, "top", this.K);
        q(sb, "right", this.L);
        q(sb, "bottom", this.M);
        q(sb, "baseline", this.N);
        q(sb, "centerX", this.O);
        q(sb, "centerY", this.P);
        int i = this.W;
        int i2 = this.d0;
        int i3 = this.C[0];
        int i4 = this.u;
        int i5 = this.r;
        float f = this.w;
        z96 z96Var = this.U[0];
        float[] fArr = this.n0;
        float f2 = fArr[0];
        p(sb, "    width", i, i2, i3, i4, i5, f, z96Var);
        int i6 = this.X;
        int i7 = this.e0;
        int i8 = this.C[1];
        int i9 = this.x;
        int i10 = this.s;
        float f3 = this.z;
        z96 z96Var2 = this.U[1];
        float f4 = fArr[1];
        p(sb, "    height", i6, i7, i8, i9, i10, f3, z96Var2);
        float f5 = this.Y;
        int i11 = this.Z;
        if (f5 != 0.0f) {
            sb.append("    dimensionRatio");
            sb.append(" :  [");
            sb.append(f5);
            sb.append(StringUtils.COMMA);
            sb.append(i11);
            sb.append("");
            sb.append("],\n");
        }
        I(sb, "    horizontalBias", this.f0, 0.5f);
        I(sb, "    verticalBias", this.g0, 0.5f);
        H(this.l0, 0, "    horizontalChainStyle", sb);
        H(this.m0, 0, "    verticalChainStyle", sb);
        sb.append("  }");
    }

    public final int r() {
        if (this.i0 == 8) {
            return 0;
        }
        return this.W;
    }

    public final int s() {
        aa6 aa6Var = this.V;
        return (aa6Var == null || !(aa6Var instanceof ba6)) ? this.a0 : ((ba6) aa6Var).B0 + this.a0;
    }

    public final int t() {
        aa6 aa6Var = this.V;
        return (aa6Var == null || !(aa6Var instanceof ba6)) ? this.b0 : ((ba6) aa6Var).C0 + this.b0;
    }

    public String toString() {
        StringBuilder k = dfi.k("");
        k.append(this.k0 != null ? su4.o(new StringBuilder("id: "), this.k0, StringUtil.SPACE) : "");
        k.append("(");
        k.append(this.a0);
        k.append(", ");
        k.append(this.b0);
        k.append(") - (");
        k.append(this.W);
        k.append(" x ");
        return f1d.i(k, this.X, ")");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x003b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x003a A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean u(int i) {
        if (i == 0) {
            return (this.J.f != null ? 1 : 0) + (this.L.f != null ? 1 : 0) < 2;
        }
        if ((this.K.f != null ? 1 : 0) + (this.M.f != null ? 1 : 0) + (this.N.f != null ? 1 : 0) < 2) {
        }
    }

    public final boolean v(int i, int i2) {
        o86 o86Var;
        o86 o86Var2;
        o86 o86Var3;
        o86 o86Var4;
        if (i == 0) {
            o86 o86Var5 = this.J;
            o86 o86Var6 = o86Var5.f;
            if (o86Var6 == null || !o86Var6.c || (o86Var4 = (o86Var3 = this.L).f) == null || !o86Var4.c) {
                return false;
            }
            return (o86Var4.d() - o86Var3.e()) - (o86Var5.e() + o86Var5.f.d()) >= i2;
        }
        o86 o86Var7 = this.K;
        o86 o86Var8 = o86Var7.f;
        if (o86Var8 == null || !o86Var8.c || (o86Var2 = (o86Var = this.M).f) == null || !o86Var2.c) {
            return false;
        }
        return (o86Var2.d() - o86Var.e()) - (o86Var7.e() + o86Var7.f.d()) >= i2;
    }

    public final void w(int i, aa6 aa6Var, int i2, int i3, int i4) {
        j(i).b(aa6Var.j(i2), i3, i4, true);
    }

    public final boolean x(int i) {
        o86 o86Var;
        o86 o86Var2;
        int i2 = i * 2;
        o86[] o86VarArr = this.R;
        o86 o86Var3 = o86VarArr[i2];
        o86 o86Var4 = o86Var3.f;
        return (o86Var4 == null || o86Var4.f == o86Var3 || (o86Var2 = (o86Var = o86VarArr[i2 + 1]).f) == null || o86Var2.f != o86Var) ? false : true;
    }

    public final boolean y() {
        o86 o86Var = this.J;
        o86 o86Var2 = o86Var.f;
        if (o86Var2 != null && o86Var2.f == o86Var) {
            return true;
        }
        o86 o86Var3 = this.L;
        o86 o86Var4 = o86Var3.f;
        return o86Var4 != null && o86Var4.f == o86Var3;
    }

    public final boolean z() {
        o86 o86Var = this.K;
        o86 o86Var2 = o86Var.f;
        if (o86Var2 != null && o86Var2.f == o86Var) {
            return true;
        }
        o86 o86Var3 = this.M;
        o86 o86Var4 = o86Var3.f;
        return o86Var4 != null && o86Var4.f == o86Var3;
    }
}
