package io.flutter.view;

import D.C0013n;
import android.graphics.Rect;
import android.opengl.Matrix;
import android.text.SpannableString;
import android.text.TextUtils;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: A, reason: collision with root package name */
    public String f2529A;

    /* renamed from: B, reason: collision with root package name */
    public String f2530B;

    /* renamed from: C, reason: collision with root package name */
    public String f2531C;

    /* renamed from: D, reason: collision with root package name */
    public String f2532D;

    /* renamed from: E, reason: collision with root package name */
    public int f2533E;

    /* renamed from: F, reason: collision with root package name */
    public int f2534F;

    /* renamed from: I, reason: collision with root package name */
    public long f2537I;

    /* renamed from: J, reason: collision with root package name */
    public int f2538J;

    /* renamed from: K, reason: collision with root package name */
    public int f2539K;

    /* renamed from: L, reason: collision with root package name */
    public int f2540L;

    /* renamed from: M, reason: collision with root package name */
    public float f2541M;

    /* renamed from: N, reason: collision with root package name */
    public String f2542N;

    /* renamed from: O, reason: collision with root package name */
    public String f2543O;

    /* renamed from: P, reason: collision with root package name */
    public float f2544P;

    /* renamed from: Q, reason: collision with root package name */
    public float f2545Q;

    /* renamed from: R, reason: collision with root package name */
    public float f2546R;

    /* renamed from: S, reason: collision with root package name */
    public float f2547S;
    public float[] T;

    /* renamed from: U, reason: collision with root package name */
    public float[] f2548U;

    /* renamed from: V, reason: collision with root package name */
    public g f2549V;

    /* renamed from: Y, reason: collision with root package name */
    public ArrayList f2552Y;
    public f Z;

    /* renamed from: a, reason: collision with root package name */
    public final h f2553a;

    /* renamed from: a0, reason: collision with root package name */
    public f f2554a0;

    /* renamed from: c, reason: collision with root package name */
    public long f2557c;

    /* renamed from: c0, reason: collision with root package name */
    public float[] f2558c0;

    /* renamed from: d, reason: collision with root package name */
    public int f2559d;

    /* renamed from: e, reason: collision with root package name */
    public int f2561e;

    /* renamed from: e0, reason: collision with root package name */
    public float[] f2562e0;

    /* renamed from: f, reason: collision with root package name */
    public int f2563f;

    /* renamed from: f0, reason: collision with root package name */
    public Rect f2564f0;

    /* renamed from: g, reason: collision with root package name */
    public int f2565g;

    /* renamed from: h, reason: collision with root package name */
    public int f2566h;

    /* renamed from: i, reason: collision with root package name */
    public int f2567i;

    /* renamed from: j, reason: collision with root package name */
    public int f2568j;

    /* renamed from: k, reason: collision with root package name */
    public int f2569k;

    /* renamed from: l, reason: collision with root package name */
    public float f2570l;

    /* renamed from: m, reason: collision with root package name */
    public float f2571m;

    /* renamed from: n, reason: collision with root package name */
    public float f2572n;

    /* renamed from: o, reason: collision with root package name */
    public String f2573o;

    /* renamed from: p, reason: collision with root package name */
    public String f2574p;

    /* renamed from: q, reason: collision with root package name */
    public ArrayList f2575q;
    public String r;

    /* renamed from: s, reason: collision with root package name */
    public ArrayList f2576s;

    /* renamed from: t, reason: collision with root package name */
    public String f2577t;

    /* renamed from: u, reason: collision with root package name */
    public ArrayList f2578u;

    /* renamed from: v, reason: collision with root package name */
    public String f2579v;

    /* renamed from: w, reason: collision with root package name */
    public ArrayList f2580w;

    /* renamed from: x, reason: collision with root package name */
    public String f2581x;

    /* renamed from: y, reason: collision with root package name */
    public ArrayList f2582y;

    /* renamed from: z, reason: collision with root package name */
    public String f2583z;

    /* renamed from: b, reason: collision with root package name */
    public int f2555b = -1;

    /* renamed from: G, reason: collision with root package name */
    public int f2535G = -1;

    /* renamed from: H, reason: collision with root package name */
    public boolean f2536H = false;

    /* renamed from: W, reason: collision with root package name */
    public final ArrayList f2550W = new ArrayList();

    /* renamed from: X, reason: collision with root package name */
    public final ArrayList f2551X = new ArrayList();

    /* renamed from: b0, reason: collision with root package name */
    public boolean f2556b0 = true;

    /* renamed from: d0, reason: collision with root package name */
    public boolean f2560d0 = true;

    public g(h hVar) {
        this.f2553a = hVar;
    }

    public static boolean C(g gVar, e eVar) {
        return (gVar.f2538J & eVar.f2523f) != 0;
    }

    public static ArrayList G(ByteBuffer byteBuffer, ByteBuffer[] byteBufferArr) {
        int i2 = byteBuffer.getInt();
        if (i2 == -1) {
            return null;
        }
        ArrayList arrayList = new ArrayList(i2);
        for (int i3 = 0; i3 < i2; i3++) {
            int i4 = byteBuffer.getInt();
            int i5 = byteBuffer.getInt();
            int i6 = F.j.c(2)[byteBuffer.getInt()];
            int b2 = F.j.b(i6);
            if (b2 == 0) {
                byteBuffer.getInt();
                j jVar = new j();
                jVar.f2608a = i4;
                jVar.f2609b = i5;
                jVar.f2610c = i6;
                arrayList.add(jVar);
            } else if (b2 == 1) {
                ByteBuffer byteBuffer2 = byteBufferArr[byteBuffer.getInt()];
                i iVar = new i();
                iVar.f2608a = i4;
                iVar.f2609b = i5;
                iVar.f2610c = i6;
                iVar.f2607d = StandardCharsets.UTF_8.decode(byteBuffer2).toString();
                arrayList.add(iVar);
            }
        }
        return arrayList;
    }

    public static void L(float[] fArr, float[] fArr2, float[] fArr3) {
        Matrix.multiplyMV(fArr, 0, fArr2, 0, fArr3, 0);
        float f2 = fArr[3];
        fArr[0] = fArr[0] / f2;
        fArr[1] = fArr[1] / f2;
        fArr[2] = fArr[2] / f2;
        fArr[3] = 0.0f;
    }

    public static Rect f(g gVar) {
        return gVar.f2564f0;
    }

    public static boolean k(g gVar, e eVar) {
        return (gVar.f2559d & eVar.f2523f) != 0;
    }

    public static boolean o(g gVar) {
        if (gVar.I(4)) {
            return true;
        }
        String str = gVar.f2529A;
        if (str == null || str.isEmpty()) {
            return gVar.I(23);
        }
        return false;
    }

    public static SpannableString w(g gVar) {
        C0013n c0013n = new C0013n();
        c0013n.f242a = gVar.r;
        c0013n.f243b = gVar.f2576s;
        c0013n.f244c = gVar.E();
        return c0013n.a();
    }

    public static CharSequence x(g gVar) {
        C0013n c0013n = new C0013n();
        c0013n.f242a = gVar.f2574p;
        c0013n.f243b = gVar.f2575q;
        c0013n.f245d = gVar.f2529A;
        c0013n.f244c = gVar.E();
        SpannableString a2 = c0013n.a();
        C0013n c0013n2 = new C0013n();
        c0013n2.f242a = gVar.f2581x;
        c0013n2.f243b = gVar.f2582y;
        c0013n2.f244c = gVar.E();
        CharSequence[] charSequenceArr = {a2, c0013n2.a()};
        CharSequence charSequence = null;
        for (int i2 = 0; i2 < 2; i2++) {
            CharSequence charSequence2 = charSequenceArr[i2];
            if (charSequence2 != null && charSequence2.length() > 0) {
                charSequence = (charSequence == null || charSequence.length() == 0) ? charSequence2 : TextUtils.concat(charSequence, ", ", charSequence2);
            }
        }
        return charSequence;
    }

    public static CharSequence y(g gVar) {
        C0013n c0013n = new C0013n();
        c0013n.f242a = gVar.r;
        c0013n.f243b = gVar.f2576s;
        c0013n.f244c = gVar.E();
        SpannableString a2 = c0013n.a();
        C0013n c0013n2 = new C0013n();
        c0013n2.f242a = gVar.f2574p;
        c0013n2.f243b = gVar.f2575q;
        c0013n2.f245d = gVar.f2529A;
        c0013n2.f244c = gVar.E();
        SpannableString a3 = c0013n2.a();
        C0013n c0013n3 = new C0013n();
        c0013n3.f242a = gVar.f2581x;
        c0013n3.f243b = gVar.f2582y;
        c0013n3.f244c = gVar.E();
        CharSequence[] charSequenceArr = {a2, a3, c0013n3.a()};
        CharSequence charSequence = null;
        for (int i2 = 0; i2 < 3; i2++) {
            CharSequence charSequence2 = charSequenceArr[i2];
            if (charSequence2 != null && charSequence2.length() > 0) {
                charSequence = (charSequence == null || charSequence.length() == 0) ? charSequence2 : TextUtils.concat(charSequence, ", ", charSequence2);
            }
        }
        return charSequence;
    }

    public final void D(ArrayList arrayList) {
        if (I(12)) {
            arrayList.add(this);
        }
        Iterator it = this.f2550W.iterator();
        while (it.hasNext()) {
            ((g) it.next()).D(arrayList);
        }
    }

    public final String E() {
        String str = this.f2530B;
        return (str == null || str.isEmpty()) ? this.f2553a.f2596l : this.f2530B;
    }

    public final String F() {
        String str;
        if (I(13) && (str = this.f2574p) != null && !str.isEmpty()) {
            return this.f2574p;
        }
        Iterator it = this.f2550W.iterator();
        while (it.hasNext()) {
            String F2 = ((g) it.next()).F();
            if (F2 != null && !F2.isEmpty()) {
                return F2;
            }
        }
        return null;
    }

    public final boolean H(int i2) {
        return (this.f2537I & ((long) E0.h.d(i2))) != 0;
    }

    public final boolean I(int i2) {
        return (this.f2557c & ((long) E0.h.d(i2))) != 0;
    }

    public final g J(float[] fArr, boolean z2) {
        float f2 = fArr[3];
        boolean z3 = false;
        float f3 = fArr[0] / f2;
        float f4 = fArr[1] / f2;
        if (f3 < this.f2544P || f3 >= this.f2546R || f4 < this.f2545Q || f4 >= this.f2547S) {
            return null;
        }
        float[] fArr2 = new float[4];
        Iterator it = this.f2551X.iterator();
        while (it.hasNext()) {
            g gVar = (g) it.next();
            if (!gVar.I(14)) {
                if (gVar.f2556b0) {
                    gVar.f2556b0 = false;
                    if (gVar.f2558c0 == null) {
                        gVar.f2558c0 = new float[16];
                    }
                    if (!Matrix.invertM(gVar.f2558c0, 0, gVar.f2548U, 0)) {
                        Arrays.fill(gVar.f2558c0, 0.0f);
                    }
                }
                Matrix.multiplyMV(fArr2, 0, gVar.f2558c0, 0, fArr, 0);
                g J2 = gVar.J(fArr2, z2);
                if (J2 != null) {
                    return J2;
                }
            }
        }
        if (z2 && this.f2567i != -1) {
            z3 = true;
        }
        if (K() || z3) {
            return this;
        }
        return null;
    }

    public final boolean K() {
        String str;
        String str2;
        String str3;
        if (I(12)) {
            return false;
        }
        if (I(22)) {
            return true;
        }
        if (I(32)) {
            return false;
        }
        int i2 = this.f2559d;
        int i3 = h.f2584x;
        return ((i2 & (-61)) == 0 && (this.f2557c & ((long) 10682871)) == 0 && ((str = this.f2574p) == null || str.isEmpty()) && (((str2 = this.r) == null || str2.isEmpty()) && ((str3 = this.f2581x) == null || str3.isEmpty()))) ? false : true;
    }

    public final void M(float[] fArr, HashSet hashSet, boolean z2) {
        hashSet.add(this);
        if (this.f2560d0) {
            z2 = true;
        }
        if (z2) {
            if (this.f2562e0 == null) {
                this.f2562e0 = new float[16];
            }
            if (this.T == null) {
                this.T = new float[16];
            }
            Matrix.multiplyMM(this.f2562e0, 0, fArr, 0, this.T, 0);
            float[] fArr2 = {this.f2544P, this.f2545Q, 0.0f, 1.0f};
            float[] fArr3 = new float[4];
            float[] fArr4 = new float[4];
            float[] fArr5 = new float[4];
            float[] fArr6 = new float[4];
            L(fArr3, this.f2562e0, fArr2);
            fArr2[0] = this.f2546R;
            fArr2[1] = this.f2545Q;
            L(fArr4, this.f2562e0, fArr2);
            fArr2[0] = this.f2546R;
            fArr2[1] = this.f2547S;
            L(fArr5, this.f2562e0, fArr2);
            fArr2[0] = this.f2544P;
            fArr2[1] = this.f2547S;
            L(fArr6, this.f2562e0, fArr2);
            if (this.f2564f0 == null) {
                this.f2564f0 = new Rect();
            }
            this.f2564f0.set(Math.round(Math.min(fArr3[0], Math.min(fArr4[0], Math.min(fArr5[0], fArr6[0])))), Math.round(Math.min(fArr3[1], Math.min(fArr4[1], Math.min(fArr5[1], fArr6[1])))), Math.round(Math.max(fArr3[0], Math.max(fArr4[0], Math.max(fArr5[0], fArr6[0])))), Math.round(Math.max(fArr3[1], Math.max(fArr4[1], Math.max(fArr5[1], fArr6[1])))));
            this.f2560d0 = false;
        }
        Iterator it = this.f2550W.iterator();
        int i2 = -1;
        while (it.hasNext()) {
            g gVar = (g) it.next();
            gVar.f2535G = i2;
            i2 = gVar.f2555b;
            gVar.M(this.f2562e0, hashSet, z2);
        }
    }
}
