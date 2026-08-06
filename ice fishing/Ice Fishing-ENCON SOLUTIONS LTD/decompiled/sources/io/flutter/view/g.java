package io.flutter.view;

import F.C0038n;
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
    public String f7921A;

    /* renamed from: B, reason: collision with root package name */
    public String f7922B;

    /* renamed from: C, reason: collision with root package name */
    public String f7923C;

    /* renamed from: D, reason: collision with root package name */
    public String f7924D;

    /* renamed from: E, reason: collision with root package name */
    public int f7925E;

    /* renamed from: F, reason: collision with root package name */
    public int f7926F;

    /* renamed from: I, reason: collision with root package name */
    public long f7928I;

    /* renamed from: J, reason: collision with root package name */
    public int f7929J;

    /* renamed from: K, reason: collision with root package name */
    public int f7930K;

    /* renamed from: L, reason: collision with root package name */
    public int f7931L;

    /* renamed from: M, reason: collision with root package name */
    public float f7932M;

    /* renamed from: N, reason: collision with root package name */
    public String f7933N;

    /* renamed from: O, reason: collision with root package name */
    public String f7934O;

    /* renamed from: P, reason: collision with root package name */
    public float f7935P;

    /* renamed from: Q, reason: collision with root package name */
    public float f7936Q;

    /* renamed from: R, reason: collision with root package name */
    public float f7937R;

    /* renamed from: S, reason: collision with root package name */
    public float f7938S;

    /* renamed from: T, reason: collision with root package name */
    public float[] f7939T;

    /* renamed from: U, reason: collision with root package name */
    public float[] f7940U;

    /* renamed from: V, reason: collision with root package name */
    public g f7941V;
    public ArrayList Y;

    /* renamed from: Z, reason: collision with root package name */
    public f f7944Z;

    /* renamed from: a, reason: collision with root package name */
    public final h f7945a;

    /* renamed from: a0, reason: collision with root package name */
    public f f7946a0;

    /* renamed from: c, reason: collision with root package name */
    public long f7949c;

    /* renamed from: c0, reason: collision with root package name */
    public float[] f7950c0;

    /* renamed from: d, reason: collision with root package name */
    public int f7951d;

    /* renamed from: e, reason: collision with root package name */
    public int f7953e;
    public float[] e0;

    /* renamed from: f, reason: collision with root package name */
    public int f7954f;
    public Rect f0;

    /* renamed from: g, reason: collision with root package name */
    public int f7955g;

    /* renamed from: h, reason: collision with root package name */
    public int f7956h;

    /* renamed from: i, reason: collision with root package name */
    public int f7957i;

    /* renamed from: j, reason: collision with root package name */
    public int f7958j;

    /* renamed from: k, reason: collision with root package name */
    public int f7959k;

    /* renamed from: l, reason: collision with root package name */
    public float f7960l;

    /* renamed from: m, reason: collision with root package name */
    public float f7961m;

    /* renamed from: n, reason: collision with root package name */
    public float f7962n;

    /* renamed from: o, reason: collision with root package name */
    public String f7963o;

    /* renamed from: p, reason: collision with root package name */
    public String f7964p;

    /* renamed from: q, reason: collision with root package name */
    public ArrayList f7965q;

    /* renamed from: r, reason: collision with root package name */
    public String f7966r;

    /* renamed from: s, reason: collision with root package name */
    public ArrayList f7967s;
    public String t;

    /* renamed from: u, reason: collision with root package name */
    public ArrayList f7968u;

    /* renamed from: v, reason: collision with root package name */
    public String f7969v;

    /* renamed from: w, reason: collision with root package name */
    public ArrayList f7970w;

    /* renamed from: x, reason: collision with root package name */
    public String f7971x;

    /* renamed from: y, reason: collision with root package name */
    public ArrayList f7972y;

    /* renamed from: z, reason: collision with root package name */
    public String f7973z;

    /* renamed from: b, reason: collision with root package name */
    public int f7947b = -1;
    public int G = -1;

    /* renamed from: H, reason: collision with root package name */
    public boolean f7927H = false;

    /* renamed from: W, reason: collision with root package name */
    public final ArrayList f7942W = new ArrayList();

    /* renamed from: X, reason: collision with root package name */
    public final ArrayList f7943X = new ArrayList();

    /* renamed from: b0, reason: collision with root package name */
    public boolean f7948b0 = true;

    /* renamed from: d0, reason: collision with root package name */
    public boolean f7952d0 = true;

    public g(h hVar) {
        this.f7945a = hVar;
    }

    public static boolean C(g gVar, e eVar) {
        return (gVar.f7929J & eVar.f7915a) != 0;
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
            int i6 = H.j.c(2)[byteBuffer.getInt()];
            int b2 = H.j.b(i6);
            if (b2 == 0) {
                byteBuffer.getInt();
                j jVar = new j();
                jVar.f7998a = i4;
                jVar.f7999b = i5;
                jVar.f8000c = i6;
                arrayList.add(jVar);
            } else if (b2 == 1) {
                ByteBuffer byteBuffer2 = byteBufferArr[byteBuffer.getInt()];
                i iVar = new i();
                iVar.f7998a = i4;
                iVar.f7999b = i5;
                iVar.f8000c = i6;
                iVar.f7997d = StandardCharsets.UTF_8.decode(byteBuffer2).toString();
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
        return gVar.f0;
    }

    public static boolean k(g gVar, e eVar) {
        return (gVar.f7951d & eVar.f7915a) != 0;
    }

    public static boolean o(g gVar) {
        if (gVar.I(4)) {
            return true;
        }
        String str = gVar.f7921A;
        if (str == null || str.isEmpty()) {
            return gVar.I(23);
        }
        return false;
    }

    public static SpannableString w(g gVar) {
        C0038n c0038n = new C0038n();
        c0038n.f532a = gVar.f7966r;
        c0038n.f533b = gVar.f7967s;
        c0038n.f534c = gVar.E();
        return c0038n.a();
    }

    public static CharSequence x(g gVar) {
        C0038n c0038n = new C0038n();
        c0038n.f532a = gVar.f7964p;
        c0038n.f533b = gVar.f7965q;
        c0038n.f535d = gVar.f7921A;
        c0038n.f534c = gVar.E();
        SpannableString a2 = c0038n.a();
        C0038n c0038n2 = new C0038n();
        c0038n2.f532a = gVar.f7971x;
        c0038n2.f533b = gVar.f7972y;
        c0038n2.f534c = gVar.E();
        CharSequence[] charSequenceArr = {a2, c0038n2.a()};
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
        C0038n c0038n = new C0038n();
        c0038n.f532a = gVar.f7966r;
        c0038n.f533b = gVar.f7967s;
        c0038n.f534c = gVar.E();
        SpannableString a2 = c0038n.a();
        C0038n c0038n2 = new C0038n();
        c0038n2.f532a = gVar.f7964p;
        c0038n2.f533b = gVar.f7965q;
        c0038n2.f535d = gVar.f7921A;
        c0038n2.f534c = gVar.E();
        SpannableString a3 = c0038n2.a();
        C0038n c0038n3 = new C0038n();
        c0038n3.f532a = gVar.f7971x;
        c0038n3.f533b = gVar.f7972y;
        c0038n3.f534c = gVar.E();
        CharSequence[] charSequenceArr = {a2, a3, c0038n3.a()};
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
        Iterator it = this.f7942W.iterator();
        while (it.hasNext()) {
            ((g) it.next()).D(arrayList);
        }
    }

    public final String E() {
        String str = this.f7922B;
        return (str == null || str.isEmpty()) ? this.f7945a.f7986l : this.f7922B;
    }

    public final String F() {
        String str;
        if (I(13) && (str = this.f7964p) != null && !str.isEmpty()) {
            return this.f7964p;
        }
        Iterator it = this.f7942W.iterator();
        while (it.hasNext()) {
            String F2 = ((g) it.next()).F();
            if (F2 != null && !F2.isEmpty()) {
                return F2;
            }
        }
        return null;
    }

    public final boolean H(int i2) {
        return (this.f7928I & ((long) C1.a.d(i2))) != 0;
    }

    public final boolean I(int i2) {
        return (this.f7949c & ((long) C1.a.d(i2))) != 0;
    }

    public final g J(float[] fArr, boolean z2) {
        float f2 = fArr[3];
        boolean z3 = false;
        float f3 = fArr[0] / f2;
        float f4 = fArr[1] / f2;
        if (f3 < this.f7935P || f3 >= this.f7937R || f4 < this.f7936Q || f4 >= this.f7938S) {
            return null;
        }
        float[] fArr2 = new float[4];
        Iterator it = this.f7943X.iterator();
        while (it.hasNext()) {
            g gVar = (g) it.next();
            if (!gVar.I(14)) {
                if (gVar.f7948b0) {
                    gVar.f7948b0 = false;
                    if (gVar.f7950c0 == null) {
                        gVar.f7950c0 = new float[16];
                    }
                    if (!Matrix.invertM(gVar.f7950c0, 0, gVar.f7940U, 0)) {
                        Arrays.fill(gVar.f7950c0, 0.0f);
                    }
                }
                Matrix.multiplyMV(fArr2, 0, gVar.f7950c0, 0, fArr, 0);
                g J2 = gVar.J(fArr2, z2);
                if (J2 != null) {
                    return J2;
                }
            }
        }
        if (z2 && this.f7957i != -1) {
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
        int i2 = this.f7951d;
        int i3 = h.f7974x;
        return ((i2 & (-61)) == 0 && (this.f7949c & ((long) 10682871)) == 0 && ((str = this.f7964p) == null || str.isEmpty()) && (((str2 = this.f7966r) == null || str2.isEmpty()) && ((str3 = this.f7971x) == null || str3.isEmpty()))) ? false : true;
    }

    public final void M(float[] fArr, HashSet hashSet, boolean z2) {
        hashSet.add(this);
        if (this.f7952d0) {
            z2 = true;
        }
        if (z2) {
            if (this.e0 == null) {
                this.e0 = new float[16];
            }
            if (this.f7939T == null) {
                this.f7939T = new float[16];
            }
            Matrix.multiplyMM(this.e0, 0, fArr, 0, this.f7939T, 0);
            float[] fArr2 = {this.f7935P, this.f7936Q, 0.0f, 1.0f};
            float[] fArr3 = new float[4];
            float[] fArr4 = new float[4];
            float[] fArr5 = new float[4];
            float[] fArr6 = new float[4];
            L(fArr3, this.e0, fArr2);
            fArr2[0] = this.f7937R;
            fArr2[1] = this.f7936Q;
            L(fArr4, this.e0, fArr2);
            fArr2[0] = this.f7937R;
            fArr2[1] = this.f7938S;
            L(fArr5, this.e0, fArr2);
            fArr2[0] = this.f7935P;
            fArr2[1] = this.f7938S;
            L(fArr6, this.e0, fArr2);
            if (this.f0 == null) {
                this.f0 = new Rect();
            }
            this.f0.set(Math.round(Math.min(fArr3[0], Math.min(fArr4[0], Math.min(fArr5[0], fArr6[0])))), Math.round(Math.min(fArr3[1], Math.min(fArr4[1], Math.min(fArr5[1], fArr6[1])))), Math.round(Math.max(fArr3[0], Math.max(fArr4[0], Math.max(fArr5[0], fArr6[0])))), Math.round(Math.max(fArr3[1], Math.max(fArr4[1], Math.max(fArr5[1], fArr6[1])))));
            this.f7952d0 = false;
        }
        Iterator it = this.f7942W.iterator();
        int i2 = -1;
        while (it.hasNext()) {
            g gVar = (g) it.next();
            gVar.G = i2;
            i2 = gVar.f7947b;
            gVar.M(this.e0, hashSet, z2);
        }
    }
}
