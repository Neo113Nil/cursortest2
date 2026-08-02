package io.flutter.view;

import android.graphics.Rect;
import android.opengl.Matrix;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.LocaleSpan;
import android.text.style.TtsSpan;
import android.text.style.URLSpan;
import defpackage.cg;
import defpackage.dg;
import defpackage.fg;
import defpackage.gg;
import io.flutter.view.AccessibilityBridge;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes4.dex */
public final class b {
    public String A;
    public long D;
    public int E;
    public int F;
    public int G;
    public float H;
    public String I;
    public String J;
    public float K;
    public float L;
    public float M;
    public float N;
    public float[] O;
    public b P;
    public ArrayList S;
    public cg T;
    public cg U;
    public float[] W;
    public float[] Y;
    public Rect Z;
    public final AccessibilityBridge a;
    public long c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public int i;
    public int j;
    public int k;
    public float l;
    public float m;
    public float n;
    public String o;
    public String p;
    public ArrayList q;
    public String r;
    public List s;
    public String t;
    public ArrayList u;
    public String v;
    public ArrayList w;
    public String x;
    public ArrayList y;
    public String z;
    public int b = -1;
    public int B = -1;
    public boolean C = false;
    public final ArrayList Q = new ArrayList();
    public final ArrayList R = new ArrayList();
    public boolean V = true;
    public boolean X = true;

    public b(AccessibilityBridge accessibilityBridge) {
        this.a = accessibilityBridge;
    }

    public static boolean a(b bVar, AccessibilityBridge.Action action) {
        return (bVar.d & action.value) != 0;
    }

    public static CharSequence b(b bVar) {
        CharSequence[] charSequenceArr = {d(bVar.r, bVar.s), bVar.e(), d(bVar.x, bVar.y)};
        CharSequence charSequence = null;
        for (int i = 0; i < 3; i++) {
            CharSequence charSequence2 = charSequenceArr[i];
            if (charSequence2 != null && charSequence2.length() > 0) {
                charSequence = (charSequence == null || charSequence.length() == 0) ? charSequence2 : TextUtils.concat(charSequence, Extension.FIX_SPACE, charSequence2);
            }
        }
        return charSequence;
    }

    public static SpannableString d(String str, List list) {
        if (str == null) {
            return null;
        }
        SpannableString spannableString = new SpannableString(str);
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                c cVar = (c) it.next();
                int i = a.a[cVar.c.ordinal()];
                if (i == 1) {
                    spannableString.setSpan(new TtsSpan.Builder("android.type.verbatim").build(), cVar.a, cVar.b, 0);
                } else if (i == 2) {
                    spannableString.setSpan(new LocaleSpan(Locale.forLanguageTag(((dg) cVar).d)), cVar.a, cVar.b, 0);
                } else if (i == 3) {
                    spannableString.setSpan(new URLSpan(((gg) cVar).d), cVar.a, cVar.b, 0);
                }
            }
        }
        return spannableString;
    }

    public static ArrayList g(ByteBuffer byteBuffer, ByteBuffer[] byteBufferArr) {
        int i = byteBuffer.getInt();
        if (i == -1) {
            return null;
        }
        ArrayList arrayList = new ArrayList(i);
        for (int i2 = 0; i2 < i; i2++) {
            int i3 = byteBuffer.getInt();
            int i4 = byteBuffer.getInt();
            AccessibilityBridge.StringAttributeType stringAttributeType = AccessibilityBridge.StringAttributeType.values()[byteBuffer.getInt()];
            int i5 = a.a[stringAttributeType.ordinal()];
            if (i5 == 1) {
                byteBuffer.getInt();
                fg fgVar = new fg();
                fgVar.a = i3;
                fgVar.b = i4;
                fgVar.c = stringAttributeType;
                arrayList.add(fgVar);
            } else if (i5 == 2) {
                ByteBuffer byteBuffer2 = byteBufferArr[byteBuffer.getInt()];
                dg dgVar = new dg();
                dgVar.a = i3;
                dgVar.b = i4;
                dgVar.c = stringAttributeType;
                dgVar.d = Charset.forName("UTF-8").decode(byteBuffer2).toString();
                arrayList.add(dgVar);
            }
        }
        return arrayList;
    }

    public static void k(float[] fArr, float[] fArr2, float[] fArr3) {
        Matrix.multiplyMV(fArr, 0, fArr2, 0, fArr3, 0);
        float f = fArr[3];
        fArr[0] = fArr[0] / f;
        fArr[1] = fArr[1] / f;
        fArr[2] = fArr[2] / f;
        fArr[3] = 0.0f;
    }

    public final void c(ArrayList arrayList) {
        if (h(AccessibilityBridge.Flag.SCOPES_ROUTE)) {
            arrayList.add(this);
        }
        Iterator it = this.Q.iterator();
        while (it.hasNext()) {
            ((b) it.next()).c(arrayList);
        }
    }

    public final SpannableString e() {
        ArrayList arrayList = this.q;
        String str = this.A;
        if (str != null && str.length() > 0) {
            arrayList = arrayList == null ? new ArrayList() : new ArrayList(arrayList);
            gg ggVar = new gg();
            ggVar.a = 0;
            ggVar.b = this.p.length();
            ggVar.d = this.A;
            ggVar.c = AccessibilityBridge.StringAttributeType.URL;
            arrayList.add(ggVar);
        }
        return d(this.p, arrayList);
    }

    public final String f() {
        String str;
        if (h(AccessibilityBridge.Flag.NAMES_ROUTE) && (str = this.p) != null && !str.isEmpty()) {
            return this.p;
        }
        Iterator it = this.Q.iterator();
        while (it.hasNext()) {
            String f = ((b) it.next()).f();
            if (f != null && !f.isEmpty()) {
                return f;
            }
        }
        return null;
    }

    public final boolean h(AccessibilityBridge.Flag flag) {
        return (((long) flag.value) & this.c) != 0;
    }

    public final b i(float[] fArr, boolean z) {
        float f = fArr[3];
        boolean z2 = false;
        float f2 = fArr[0] / f;
        float f3 = fArr[1] / f;
        if (f2 < this.K || f2 >= this.M || f3 < this.L || f3 >= this.N) {
            return null;
        }
        float[] fArr2 = new float[4];
        Iterator it = this.R.iterator();
        while (it.hasNext()) {
            b bVar = (b) it.next();
            if (!bVar.h(AccessibilityBridge.Flag.IS_HIDDEN)) {
                if (bVar.V) {
                    bVar.V = false;
                    if (bVar.W == null) {
                        bVar.W = new float[16];
                    }
                    if (!Matrix.invertM(bVar.W, 0, bVar.O, 0)) {
                        Arrays.fill(bVar.W, 0.0f);
                    }
                }
                float[] fArr3 = fArr;
                Matrix.multiplyMV(fArr2, 0, bVar.W, 0, fArr3, 0);
                b i = bVar.i(fArr2, z);
                if (i != null) {
                    return i;
                }
                fArr = fArr3;
            }
        }
        if (z && this.i != -1) {
            z2 = true;
        }
        if (j() || z2) {
            return this;
        }
        return null;
    }

    public final boolean j() {
        int i;
        int i2;
        String str;
        String str2;
        String str3;
        if (h(AccessibilityBridge.Flag.SCOPES_ROUTE)) {
            return false;
        }
        if (h(AccessibilityBridge.Flag.IS_FOCUSABLE)) {
            return true;
        }
        int i3 = this.d;
        i = AccessibilityBridge.SCROLLABLE_ACTIONS;
        if ((i3 & (~i)) == 0) {
            long j = this.c;
            i2 = AccessibilityBridge.FOCUSABLE_FLAGS;
            if ((j & i2) == 0 && (((str = this.p) == null || str.isEmpty()) && (((str2 = this.r) == null || str2.isEmpty()) && ((str3 = this.x) == null || str3.isEmpty())))) {
                return false;
            }
        }
        return true;
    }

    public final void l(float[] fArr, HashSet hashSet, boolean z) {
        hashSet.add(this);
        if (this.X) {
            z = true;
        }
        if (z) {
            if (this.Y == null) {
                this.Y = new float[16];
            }
            if (this.O == null) {
                this.O = new float[16];
            }
            Matrix.multiplyMM(this.Y, 0, fArr, 0, this.O, 0);
            float[] fArr2 = {this.K, this.L, 0.0f, 1.0f};
            float[] fArr3 = new float[4];
            float[] fArr4 = new float[4];
            float[] fArr5 = new float[4];
            float[] fArr6 = new float[4];
            k(fArr3, this.Y, fArr2);
            fArr2[0] = this.M;
            fArr2[1] = this.L;
            k(fArr4, this.Y, fArr2);
            fArr2[0] = this.M;
            fArr2[1] = this.N;
            k(fArr5, this.Y, fArr2);
            fArr2[0] = this.K;
            fArr2[1] = this.N;
            k(fArr6, this.Y, fArr2);
            if (this.Z == null) {
                this.Z = new Rect();
            }
            this.Z.set(Math.round(Math.min(fArr3[0], Math.min(fArr4[0], Math.min(fArr5[0], fArr6[0])))), Math.round(Math.min(fArr3[1], Math.min(fArr4[1], Math.min(fArr5[1], fArr6[1])))), Math.round(Math.max(fArr3[0], Math.max(fArr4[0], Math.max(fArr5[0], fArr6[0])))), Math.round(Math.max(fArr3[1], Math.max(fArr4[1], Math.max(fArr5[1], fArr6[1])))));
            this.X = false;
        }
        Iterator it = this.Q.iterator();
        int i = -1;
        while (it.hasNext()) {
            b bVar = (b) it.next();
            bVar.B = i;
            i = bVar.b;
            bVar.l(this.Y, hashSet, z);
        }
    }
}
