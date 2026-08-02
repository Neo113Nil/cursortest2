package defpackage;

import android.graphics.Rect;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.animation.Interpolator;
import com.connectsdk.service.webos.lgcast.remotecamera.service.CameraProperty;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;

/* loaded from: classes.dex */
public final class gei {
    public lbf[] A;
    public final View b;
    public final int c;
    public lg3[] j;
    public ex0 k;
    public int[] o;
    public double[] p;
    public double[] q;
    public String[] r;
    public int[] s;
    public HashMap x;
    public HashMap y;
    public HashMap z;
    public final Rect a = new Rect();
    public boolean d = false;
    public int e = -1;
    public final sei f = new sei();
    public final sei g = new sei();
    public final eei h = new eei();
    public final eei i = new eei();
    public float l = Float.NaN;
    public float m = 0.0f;
    public float n = 1.0f;
    public final float[] t = new float[4];
    public final ArrayList u = new ArrayList();
    public final float[] v = new float[1];
    public final ArrayList w = new ArrayList();
    public int B = -1;
    public int C = -1;
    public View D = null;
    public int E = -1;
    public float F = Float.NaN;
    public Interpolator G = null;
    public boolean H = false;

    public gei(View view) {
        this.b = view;
        this.c = view.getId();
        view.getLayoutParams();
    }

    public static void f(Rect rect, Rect rect2, int i, int i2, int i3) {
        if (i == 1) {
            int i4 = rect.left + rect.right;
            rect2.left = ((rect.top + rect.bottom) - rect.width()) / 2;
            rect2.top = i3 - ((rect.height() + i4) / 2);
            rect2.right = rect.width() + rect2.left;
            rect2.bottom = rect.height() + rect2.top;
            return;
        }
        if (i == 2) {
            int i5 = rect.left + rect.right;
            rect2.left = i2 - ((rect.width() + (rect.top + rect.bottom)) / 2);
            rect2.top = (i5 - rect.height()) / 2;
            rect2.right = rect.width() + rect2.left;
            rect2.bottom = rect.height() + rect2.top;
            return;
        }
        if (i == 3) {
            int i6 = rect.left + rect.right;
            rect2.left = ((rect.height() / 2) + rect.top) - (i6 / 2);
            rect2.top = i3 - ((rect.height() + i6) / 2);
            rect2.right = rect.width() + rect2.left;
            rect2.bottom = rect.height() + rect2.top;
            return;
        }
        if (i != 4) {
            return;
        }
        int i7 = rect.left + rect.right;
        rect2.left = i2 - ((rect.width() + (rect.bottom + rect.top)) / 2);
        rect2.top = (i7 - rect.height()) / 2;
        rect2.right = rect.width() + rect2.left;
        rect2.bottom = rect.height() + rect2.top;
    }

    public final float a(float f, float[] fArr) {
        float f2 = 0.0f;
        if (fArr != null) {
            fArr[0] = 1.0f;
        } else {
            float f3 = this.n;
            if (f3 != 1.0d) {
                float f4 = this.m;
                if (f < f4) {
                    f = 0.0f;
                }
                if (f > f4 && f < 1.0d) {
                    f = Math.min((f - f4) * f3, 1.0f);
                }
            }
        }
        jya jyaVar = this.f.a;
        Iterator it = this.u.iterator();
        float f5 = Float.NaN;
        while (it.hasNext()) {
            sei seiVar = (sei) it.next();
            jya jyaVar2 = seiVar.a;
            if (jyaVar2 != null) {
                float f6 = seiVar.c;
                if (f6 < f) {
                    jyaVar = jyaVar2;
                    f2 = f6;
                } else if (Float.isNaN(f5)) {
                    f5 = seiVar.c;
                }
            }
        }
        if (jyaVar != null) {
            float f7 = (Float.isNaN(f5) ? 1.0f : f5) - f2;
            double d = (f - f2) / f7;
            f = (((float) jyaVar.a(d)) * f7) + f2;
            if (fArr != null) {
                fArr[0] = (float) jyaVar.b(d);
            }
        }
        return f;
    }

    public final void b(double d, float[] fArr, float[] fArr2) {
        float f;
        double[] dArr = new double[4];
        double[] dArr2 = new double[4];
        this.j[0].i0(d, dArr);
        this.j[0].k0(d, dArr2);
        float f2 = 0.0f;
        Arrays.fill(fArr2, 0.0f);
        int[] iArr = this.o;
        sei seiVar = this.f;
        float f3 = seiVar.e;
        float f4 = seiVar.f;
        float f5 = seiVar.g;
        float f6 = seiVar.h;
        float f7 = 0.0f;
        float f8 = 0.0f;
        float f9 = 0.0f;
        for (int i = 0; i < iArr.length; i++) {
            float f10 = (float) dArr[i];
            float f11 = (float) dArr2[i];
            int i2 = iArr[i];
            if (i2 == 1) {
                f3 = f10;
                f2 = f11;
            } else if (i2 == 2) {
                f4 = f10;
                f9 = f11;
            } else if (i2 == 3) {
                f5 = f10;
                f7 = f11;
            } else if (i2 == 4) {
                f6 = f10;
                f8 = f11;
            }
        }
        float f12 = (f7 / 2.0f) + f2;
        float f13 = (f8 / 2.0f) + f9;
        gei geiVar = seiVar.m;
        if (geiVar != null) {
            float[] fArr3 = new float[2];
            float[] fArr4 = new float[2];
            geiVar.b(d, fArr3, fArr4);
            float f14 = fArr3[0];
            float f15 = fArr3[1];
            float f16 = fArr4[0];
            float f17 = fArr4[1];
            double d2 = f3;
            double d3 = f4;
            float sin = (float) (((Math.sin(d3) * d2) + f14) - (f5 / 2.0f));
            float cos = (float) ((f15 - (Math.cos(d3) * d2)) - (f6 / 2.0f));
            double d4 = f2;
            double d5 = f9;
            f = 2.0f;
            f4 = cos;
            f12 = (float) ((Math.cos(d3) * d5) + (Math.sin(d3) * d4) + f16);
            f13 = (float) ((Math.sin(d3) * d5) + (f17 - (Math.cos(d3) * d4)));
            f3 = sin;
        } else {
            f = 2.0f;
        }
        fArr[0] = (f5 / f) + f3 + 0.0f;
        fArr[1] = (f6 / f) + f4 + 0.0f;
        fArr2[0] = f12;
        fArr2[1] = f13;
    }

    public final float c() {
        float[] fArr = new float[2];
        float f = 1.0f / 99;
        double d = 0.0d;
        double d2 = 0.0d;
        int i = 0;
        float f2 = 0.0f;
        while (i < 100) {
            float f3 = i * f;
            double d3 = f3;
            jya jyaVar = this.f.a;
            Iterator it = this.u.iterator();
            float f4 = Float.NaN;
            float f5 = 0.0f;
            while (it.hasNext()) {
                sei seiVar = (sei) it.next();
                jya jyaVar2 = seiVar.a;
                if (jyaVar2 != null) {
                    float f6 = seiVar.c;
                    if (f6 < f3) {
                        jyaVar = jyaVar2;
                        f5 = f6;
                    } else if (Float.isNaN(f4)) {
                        f4 = seiVar.c;
                    }
                }
            }
            if (jyaVar != null) {
                if (Float.isNaN(f4)) {
                    f4 = 1.0f;
                }
                d3 = (((float) jyaVar.a((f3 - f5) / r17)) * (f4 - f5)) + f5;
            }
            double d4 = d3;
            this.j[0].i0(d4, this.p);
            int i2 = i;
            this.f.c(d4, this.o, this.p, fArr, 0);
            if (i2 > 0) {
                f2 += (float) Math.hypot(d2 - fArr[1], d - fArr[0]);
            }
            d = fArr[0];
            d2 = fArr[1];
            i = i2 + 1;
        }
        return f2;
    }

    public final boolean d(float f, long j, n7b n7bVar, View view) {
        boolean z;
        View view2;
        boolean z2;
        float f2;
        rhu rhuVar;
        float f3;
        boolean z3;
        float f4;
        float f5;
        float f6;
        boolean z4;
        View view3 = view;
        rhu rhuVar2 = null;
        float a = a(f, null);
        int i = this.E;
        if (i != -1) {
            float f7 = 1.0f / i;
            float floor = ((float) Math.floor(a / f7)) * f7;
            float f8 = (a % f7) / f7;
            if (!Float.isNaN(this.F)) {
                f8 = (f8 + this.F) % 1.0f;
            }
            Interpolator interpolator = this.G;
            a = ((interpolator != null ? interpolator.getInterpolation(f8) : ((double) f8) > 0.5d ? 1.0f : 0.0f) * f7) + floor;
        }
        HashMap hashMap = this.y;
        if (hashMap != null) {
            Iterator it = hashMap.values().iterator();
            while (it.hasNext()) {
                ((ihu) it.next()).c(view3, a);
            }
        }
        HashMap hashMap2 = this.x;
        if (hashMap2 != null) {
            rhu rhuVar3 = null;
            z = false;
            for (thu thuVar : hashMap2.values()) {
                if (thuVar instanceof rhu) {
                    rhuVar3 = (rhu) thuVar;
                } else {
                    z |= thuVar.d(a, j, n7bVar, view3);
                    view3 = view;
                }
            }
            rhuVar2 = rhuVar3;
        } else {
            z = false;
        }
        lg3[] lg3VarArr = this.j;
        sei seiVar = this.f;
        if (lg3VarArr != null) {
            double d = a;
            lg3VarArr[0].i0(d, this.p);
            this.j[0].k0(d, this.q);
            ex0 ex0Var = this.k;
            if (ex0Var != null) {
                double[] dArr = this.p;
                f2 = 0.0f;
                if (dArr.length > 0) {
                    ex0Var.i0(d, dArr);
                    this.k.k0(d, this.q);
                }
            } else {
                f2 = 0.0f;
            }
            if (this.H) {
                view2 = view;
                rhuVar = rhuVar2;
                f3 = 1.0f;
                z3 = z;
                f4 = 2.0f;
            } else {
                int[] iArr = this.o;
                double[] dArr2 = this.p;
                f4 = 2.0f;
                double[] dArr3 = this.q;
                f3 = 1.0f;
                boolean z5 = this.d;
                float f9 = seiVar.e;
                float f10 = seiVar.f;
                float f11 = seiVar.g;
                int i2 = 1;
                float f12 = seiVar.h;
                rhuVar = rhuVar2;
                if (iArr.length != 0) {
                    f5 = f11;
                    if (seiVar.p.length <= iArr[iArr.length - 1]) {
                        int i3 = iArr[iArr.length - 1] + 1;
                        seiVar.p = new double[i3];
                        seiVar.q = new double[i3];
                    }
                } else {
                    f5 = f11;
                }
                Arrays.fill(seiVar.p, Double.NaN);
                for (int i4 = 0; i4 < iArr.length; i4++) {
                    double[] dArr4 = seiVar.p;
                    int i5 = iArr[i4];
                    dArr4[i5] = dArr2[i4];
                    seiVar.q[i5] = dArr3[i4];
                }
                float f13 = Float.NaN;
                float f14 = f2;
                float f15 = f14;
                float f16 = f15;
                int i6 = 0;
                float f17 = f5;
                float f18 = f16;
                while (true) {
                    double[] dArr5 = seiVar.p;
                    f6 = f12;
                    if (i6 >= dArr5.length) {
                        break;
                    }
                    if (Double.isNaN(dArr5[i6])) {
                        z4 = z;
                    } else {
                        float f19 = (float) (Double.isNaN(seiVar.p[i6]) ? 0.0d : seiVar.p[i6] + 0.0d);
                        z4 = z;
                        float f20 = (float) seiVar.q[i6];
                        if (i6 == i2) {
                            f9 = f19;
                            f14 = f20;
                        } else if (i6 == 2) {
                            f10 = f19;
                            f15 = f20;
                        } else if (i6 == 3) {
                            f17 = f19;
                            f18 = f20;
                        } else if (i6 == 4) {
                            f12 = f19;
                            f16 = f20;
                            i6++;
                            z = z4;
                            i2 = 1;
                        } else if (i6 == 5) {
                            f13 = f19;
                        }
                    }
                    f12 = f6;
                    i6++;
                    z = z4;
                    i2 = 1;
                }
                z3 = z;
                gei geiVar = seiVar.m;
                if (geiVar != null) {
                    float[] fArr = new float[2];
                    float[] fArr2 = new float[2];
                    geiVar.b(d, fArr, fArr2);
                    float f21 = fArr[0];
                    float f22 = fArr[1];
                    float f23 = fArr2[0];
                    float f24 = fArr2[1];
                    double d2 = f9;
                    double d3 = f10;
                    float sin = (float) (((Math.sin(d3) * d2) + f21) - (f17 / 2.0f));
                    float cos = (float) ((f22 - (Math.cos(d3) * d2)) - (f6 / 2.0f));
                    double d4 = f14;
                    double d5 = f15;
                    float cos2 = (float) ((Math.cos(d3) * d2 * d5) + (Math.sin(d3) * d4) + f23);
                    float sin2 = (float) ((Math.sin(d3) * d2 * d5) + (f24 - (Math.cos(d3) * d4)));
                    if (dArr3.length >= 2) {
                        dArr3[0] = cos2;
                        dArr3[1] = sin2;
                    }
                    if (Float.isNaN(f13)) {
                        view2 = view;
                    } else {
                        double degrees = Math.toDegrees(Math.atan2(sin2, cos2));
                        view2 = view;
                        view2.setRotation((float) (degrees + f13));
                    }
                    f9 = sin;
                    f10 = cos;
                } else {
                    view2 = view;
                    if (!Float.isNaN(f13)) {
                        view2.setRotation(f13 + ((float) Math.toDegrees(Math.atan2((f16 / 2.0f) + f15, (f18 / 2.0f) + f14))) + f2);
                    }
                }
                float f25 = f9 + 0.5f;
                int i7 = (int) f25;
                float f26 = f10 + 0.5f;
                int i8 = (int) f26;
                int i9 = (int) (f25 + f17);
                int i10 = (int) (f26 + f6);
                int i11 = i9 - i7;
                int i12 = i10 - i8;
                if (i11 != view2.getMeasuredWidth() || i12 != view2.getMeasuredHeight() || z5) {
                    view2.measure(View.MeasureSpec.makeMeasureSpec(i11, 1073741824), View.MeasureSpec.makeMeasureSpec(i12, 1073741824));
                }
                view2.layout(i7, i8, i9, i10);
                this.d = false;
            }
            if (this.C != -1) {
                if (this.D == null) {
                    this.D = ((View) view2.getParent()).findViewById(this.C);
                }
                if (this.D != null) {
                    float bottom = (this.D.getBottom() + r1.getTop()) / f4;
                    float right = (this.D.getRight() + this.D.getLeft()) / f4;
                    if (view2.getRight() - view2.getLeft() > 0 && view2.getBottom() - view2.getTop() > 0) {
                        view2.setPivotX(right - view2.getLeft());
                        view2.setPivotY(bottom - view2.getTop());
                    }
                }
            }
            HashMap hashMap3 = this.y;
            if (hashMap3 != null) {
                for (ihu ihuVar : hashMap3.values()) {
                    if (ihuVar instanceof ghu) {
                        double[] dArr6 = this.q;
                        if (dArr6.length > 1) {
                            view2.setRotation(((ghu) ihuVar).a(a) + ((float) Math.toDegrees(Math.atan2(dArr6[1], dArr6[0]))));
                        }
                    }
                }
            }
            if (rhuVar != null) {
                double[] dArr7 = this.q;
                double d6 = dArr7[0];
                double d7 = dArr7[1];
                rhu rhuVar4 = rhuVar;
                view2.setRotation(rhuVar4.b(a, j, n7bVar, view2) + ((float) Math.toDegrees(Math.atan2(d7, d6))));
                z2 = z3 | rhuVar4.h;
            } else {
                z2 = z3;
            }
            int i13 = 1;
            while (true) {
                lg3[] lg3VarArr2 = this.j;
                if (i13 >= lg3VarArr2.length) {
                    break;
                }
                lg3 lg3Var = lg3VarArr2[i13];
                float[] fArr3 = this.t;
                lg3Var.j0(d, fArr3);
                xp3.c0((p86) seiVar.n.get(this.r[i13 - 1]), view2, fArr3);
                i13++;
            }
            eei eeiVar = this.h;
            if (eeiVar.b == 0) {
                if (a <= f2) {
                    view2.setVisibility(eeiVar.c);
                } else {
                    eei eeiVar2 = this.i;
                    if (a >= f3) {
                        view2.setVisibility(eeiVar2.c);
                    } else if (eeiVar2.c != eeiVar.c) {
                        view2.setVisibility(0);
                    }
                }
            }
            if (this.A != null) {
                int i14 = 0;
                while (true) {
                    lbf[] lbfVarArr = this.A;
                    if (i14 >= lbfVarArr.length) {
                        break;
                    }
                    lbfVarArr[i14].g(view2, a);
                    i14++;
                }
            }
        } else {
            view2 = view;
            boolean z6 = z;
            float f27 = seiVar.e;
            sei seiVar2 = this.g;
            float e = su4.e(seiVar2.e, f27, a, f27);
            float f28 = seiVar.f;
            float e2 = su4.e(seiVar2.f, f28, a, f28);
            float f29 = seiVar.g;
            float f30 = seiVar2.g;
            float e3 = su4.e(f30, f29, a, f29);
            float f31 = seiVar.h;
            float f32 = seiVar2.h;
            float f33 = e + 0.5f;
            int i15 = (int) f33;
            float f34 = e2 + 0.5f;
            int i16 = (int) f34;
            int i17 = (int) (f33 + e3);
            int e4 = (int) (f34 + su4.e(f32, f31, a, f31));
            int i18 = i17 - i15;
            int i19 = e4 - i16;
            if (f30 != f29 || f32 != f31 || this.d) {
                view2.measure(View.MeasureSpec.makeMeasureSpec(i18, 1073741824), View.MeasureSpec.makeMeasureSpec(i19, 1073741824));
                this.d = false;
            }
            view2.layout(i15, i16, i17, e4);
            z2 = z6;
        }
        HashMap hashMap4 = this.z;
        if (hashMap4 != null) {
            for (tfu tfuVar : hashMap4.values()) {
                if (tfuVar instanceof rfu) {
                    double[] dArr8 = this.q;
                    view2.setRotation(((rfu) tfuVar).a(a) + ((float) Math.toDegrees(Math.atan2(dArr8[1], dArr8[0]))));
                } else {
                    tfuVar.d(view2, a);
                }
            }
        }
        return z2;
    }

    public final void e(sei seiVar) {
        seiVar.d((int) this.b.getX(), (int) this.b.getY(), this.b.getWidth(), this.b.getHeight());
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:402:0x0caa. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:397:0x0d27  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x05d8  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x05ff  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0639 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r1v92, types: [fhu, ihu] */
    /* JADX WARN: Type inference failed for: r4v67, types: [qhu, thu] */
    /* JADX WARN: Type inference failed for: r6v104, types: [hhu, ihu] */
    /* JADX WARN: Type inference failed for: r6v112, types: [ihu] */
    /* JADX WARN: Type inference failed for: r9v42, types: [shu, thu] */
    /* JADX WARN: Type inference failed for: r9v47, types: [thu] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void g(long j, int i, int i2) {
        String str;
        ArrayList arrayList;
        HashSet hashSet;
        Object obj;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        HashSet hashSet2;
        HashSet hashSet3;
        sei seiVar;
        Object obj2;
        String str7;
        ArrayList arrayList2;
        sei seiVar2;
        Object obj3;
        String str8;
        int i3;
        String str9;
        int i4;
        p86 p86Var;
        HashSet hashSet4;
        String str10;
        HashMap hashMap;
        Iterator it;
        String str11;
        Object obj4;
        Object obj5;
        char c;
        char c2;
        phu phuVar;
        String str12;
        Object obj6;
        phu phuVar2;
        phu phuVar3;
        p86 p86Var2;
        Integer num;
        HashSet hashSet5;
        String str13;
        String str14;
        String str15;
        String str16;
        HashSet hashSet6;
        String str17;
        ArrayList arrayList3;
        Object obj7;
        Iterator it2;
        String str18;
        HashSet hashSet7;
        Object obj8;
        sei seiVar3;
        Object obj9;
        sei seiVar4;
        Object obj10;
        char c3;
        char c4;
        char c5;
        Object obj11;
        ehu ehuVar;
        ehu ehuVar2;
        p86 p86Var3;
        String str19;
        String str20;
        String str21;
        String str22;
        String str23;
        int i5;
        float min;
        float f;
        new HashSet();
        HashSet hashSet8 = new HashSet();
        HashSet hashSet9 = new HashSet();
        HashSet hashSet10 = new HashSet();
        HashMap hashMap2 = new HashMap();
        int i6 = this.B;
        sei seiVar5 = this.f;
        if (i6 != -1) {
            seiVar5.j = i6;
        }
        eei eeiVar = this.h;
        float f2 = eeiVar.e;
        eei eeiVar2 = this.i;
        if (eei.b(f2, eeiVar2.e)) {
            hashSet9.add("alpha");
        }
        String str24 = "elevation";
        if (eei.b(eeiVar.f, eeiVar2.f)) {
            hashSet9.add("elevation");
        }
        int i7 = eeiVar.c;
        int i8 = eeiVar2.c;
        if (i7 != i8 && eeiVar.b == 0 && (i7 == 0 || i8 == 0)) {
            hashSet9.add("alpha");
        }
        boolean b = eei.b(eeiVar.g, eeiVar2.g);
        String str25 = CameraProperty.ROTATION;
        if (b) {
            hashSet9.add(CameraProperty.ROTATION);
        }
        String str26 = "transitionPathRotate";
        if (!Float.isNaN(eeiVar.p) || !Float.isNaN(eeiVar2.p)) {
            hashSet9.add("transitionPathRotate");
        }
        if (!Float.isNaN(eeiVar.q) || !Float.isNaN(eeiVar2.q)) {
            hashSet9.add("progress");
        }
        if (eei.b(eeiVar.h, eeiVar2.h)) {
            hashSet9.add("rotationX");
        }
        if (eei.b(eeiVar.a, eeiVar2.a)) {
            hashSet9.add("rotationY");
        }
        Object obj12 = "rotationX";
        if (eei.b(eeiVar.k, eeiVar2.k)) {
            hashSet9.add("transformPivotX");
        }
        if (eei.b(eeiVar.l, eeiVar2.l)) {
            hashSet9.add("transformPivotY");
        }
        String str27 = "scaleX";
        if (eei.b(eeiVar.i, eeiVar2.i)) {
            hashSet9.add("scaleX");
        }
        Object obj13 = "rotationY";
        String str28 = "scaleY";
        if (eei.b(eeiVar.j, eeiVar2.j)) {
            hashSet9.add("scaleY");
        }
        Object obj14 = "progress";
        if (eei.b(eeiVar.m, eeiVar2.m)) {
            hashSet9.add("translationX");
        }
        Object obj15 = "translationX";
        String str29 = "translationY";
        if (eei.b(eeiVar.n, eeiVar2.n)) {
            hashSet9.add("translationY");
        }
        if (eei.b(eeiVar.o, eeiVar2.o)) {
            hashSet9.add("translationZ");
        }
        sei seiVar6 = this.g;
        ArrayList arrayList4 = this.u;
        ArrayList arrayList5 = this.w;
        if (arrayList5 != null) {
            Iterator it3 = arrayList5.iterator();
            ArrayList arrayList6 = null;
            while (it3.hasNext()) {
                caf cafVar = (caf) it3.next();
                String str30 = str29;
                if (cafVar instanceof ebf) {
                    ebf ebfVar = (ebf) cafVar;
                    sei seiVar7 = new sei();
                    str23 = str27;
                    seiVar7.b = 0;
                    seiVar7.i = Float.NaN;
                    seiVar7.j = -1;
                    seiVar7.k = -1;
                    seiVar7.l = Float.NaN;
                    seiVar7.m = null;
                    seiVar7.n = new LinkedHashMap();
                    seiVar7.o = 0;
                    str19 = str28;
                    seiVar7.p = new double[18];
                    seiVar7.q = new double[18];
                    if (seiVar5.k != -1) {
                        float f3 = ebfVar.a / 100.0f;
                        seiVar7.c = f3;
                        seiVar7.b = ebfVar.h;
                        seiVar7.o = ebfVar.m;
                        float f4 = Float.isNaN(ebfVar.i) ? f3 : ebfVar.i;
                        str21 = str25;
                        float f5 = Float.isNaN(ebfVar.j) ? f3 : ebfVar.j;
                        str20 = str24;
                        float f6 = seiVar6.g - seiVar5.g;
                        float f7 = seiVar6.h;
                        float f8 = seiVar5.h;
                        seiVar7.d = seiVar7.c;
                        seiVar7.g = (int) ((f6 * f4) + r11);
                        seiVar7.h = (int) (((f7 - f8) * f5) + f8);
                        int i9 = ebfVar.m;
                        str22 = str26;
                        float f9 = ebfVar.k;
                        if (i9 != 2) {
                            float f10 = Float.isNaN(f9) ? f3 : ebfVar.k;
                            float f11 = seiVar6.e;
                            float f12 = seiVar5.e;
                            seiVar7.e = su4.e(f11, f12, f10, f12);
                            if (!Float.isNaN(ebfVar.l)) {
                                f3 = ebfVar.l;
                            }
                            float f13 = seiVar6.f;
                            float f14 = seiVar5.f;
                            seiVar7.f = su4.e(f13, f14, f3, f14);
                        } else {
                            if (Float.isNaN(f9)) {
                                float f15 = seiVar6.e;
                                float f16 = seiVar5.e;
                                min = su4.e(f15, f16, f3, f16);
                            } else {
                                min = ebfVar.k * Math.min(f5, f4);
                            }
                            seiVar7.e = min;
                            if (Float.isNaN(ebfVar.l)) {
                                float f17 = seiVar6.f;
                                float f18 = seiVar5.f;
                                f = su4.e(f17, f18, f3, f18);
                            } else {
                                f = ebfVar.l;
                            }
                            seiVar7.f = f;
                        }
                        seiVar7.k = seiVar5.k;
                        seiVar7.a = jya.c(ebfVar.f);
                        seiVar7.j = ebfVar.g;
                    } else {
                        str20 = str24;
                        str21 = str25;
                        str22 = str26;
                        int i10 = ebfVar.m;
                        int i11 = ebfVar.a;
                        if (i10 == 1) {
                            float f19 = i11 / 100.0f;
                            seiVar7.c = f19;
                            seiVar7.b = ebfVar.h;
                            float f20 = Float.isNaN(ebfVar.i) ? f19 : ebfVar.i;
                            float f21 = Float.isNaN(ebfVar.j) ? f19 : ebfVar.j;
                            float f22 = seiVar6.g - seiVar5.g;
                            float f23 = f19;
                            float f24 = seiVar6.h - seiVar5.h;
                            seiVar7.d = seiVar7.c;
                            if (!Float.isNaN(ebfVar.k)) {
                                f23 = ebfVar.k;
                            }
                            float f25 = (seiVar5.g / 2.0f) + seiVar5.e;
                            float f26 = seiVar5.f;
                            float f27 = seiVar5.h;
                            float f28 = ((seiVar6.g / 2.0f) + seiVar6.e) - f25;
                            float f29 = ((seiVar6.h / 2.0f) + seiVar6.f) - ((f27 / 2.0f) + f26);
                            float f30 = f28 * f23;
                            float f31 = (f22 * f20) / 2.0f;
                            seiVar7.e = (int) ((r8 + f30) - f31);
                            float f32 = f23 * f29;
                            float f33 = (f24 * f21) / 2.0f;
                            seiVar7.f = (int) ((f26 + f32) - f33);
                            seiVar7.g = (int) (r8 + r13);
                            seiVar7.h = (int) (f27 + r15);
                            float f34 = Float.isNaN(ebfVar.l) ? 0.0f : ebfVar.l;
                            seiVar7.o = 1;
                            float f35 = (int) ((seiVar5.e + f30) - f31);
                            float f36 = (int) ((seiVar5.f + f32) - f33);
                            seiVar7.e = f35 + ((-f29) * f34);
                            seiVar7.f = f36 + (f28 * f34);
                            seiVar7.k = seiVar7.k;
                            seiVar7.a = jya.c(ebfVar.f);
                            seiVar7.j = ebfVar.g;
                        } else if (i10 == 2) {
                            float f37 = i11 / 100.0f;
                            seiVar7.c = f37;
                            seiVar7.b = ebfVar.h;
                            float f38 = Float.isNaN(ebfVar.i) ? f37 : ebfVar.i;
                            float f39 = Float.isNaN(ebfVar.j) ? f37 : ebfVar.j;
                            float f40 = seiVar6.g;
                            float f41 = seiVar5.g;
                            float f42 = f40 - f41;
                            float f43 = seiVar6.h;
                            float f44 = seiVar5.h;
                            float f45 = f43 - f44;
                            seiVar7.d = seiVar7.c;
                            float f46 = (f41 / 2.0f) + seiVar5.e;
                            float f47 = seiVar5.f;
                            float f48 = (f40 / 2.0f) + seiVar6.e;
                            float f49 = ((f43 / 2.0f) + seiVar6.f) - ((f44 / 2.0f) + f47);
                            float f50 = f42 * f38;
                            seiVar7.e = (int) ((((f48 - f46) * f37) + r8) - (f50 / 2.0f));
                            float f51 = f45 * f39;
                            seiVar7.f = (int) (((f49 * f37) + f47) - (f51 / 2.0f));
                            seiVar7.g = (int) (f41 + f50);
                            seiVar7.h = (int) (f44 + f51);
                            seiVar7.o = 2;
                            if (!Float.isNaN(ebfVar.k)) {
                                seiVar7.e = (int) (ebfVar.k * (i - ((int) seiVar7.g)));
                            }
                            if (!Float.isNaN(ebfVar.l)) {
                                seiVar7.f = (int) (ebfVar.l * (i2 - ((int) seiVar7.h)));
                            }
                            seiVar7.k = seiVar7.k;
                            seiVar7.a = jya.c(ebfVar.f);
                            seiVar7.j = ebfVar.g;
                        } else if (i10 != 3) {
                            float f52 = i11 / 100.0f;
                            seiVar7.c = f52;
                            seiVar7.b = ebfVar.h;
                            float f53 = Float.isNaN(ebfVar.i) ? f52 : ebfVar.i;
                            float f54 = Float.isNaN(ebfVar.j) ? f52 : ebfVar.j;
                            float f55 = seiVar6.g;
                            float f56 = seiVar5.g;
                            float f57 = f55 - f56;
                            float f58 = seiVar6.h;
                            float f59 = seiVar5.h;
                            float f60 = f58 - f59;
                            seiVar7.d = seiVar7.c;
                            float f61 = (f56 / 2.0f) + seiVar5.e;
                            float f62 = seiVar5.f;
                            float f63 = ((f55 / 2.0f) + seiVar6.e) - f61;
                            float f64 = ((f58 / 2.0f) + seiVar6.f) - ((f59 / 2.0f) + f62);
                            float f65 = (f57 * f53) / 2.0f;
                            seiVar7.e = (int) (((f63 * f52) + r8) - f65);
                            float f66 = (f60 * f54) / 2.0f;
                            seiVar7.f = (int) (((f64 * f52) + f62) - f66);
                            seiVar7.g = (int) (f56 + r34);
                            seiVar7.h = (int) (f59 + r42);
                            float f67 = Float.isNaN(ebfVar.k) ? f52 : ebfVar.k;
                            float f68 = Float.isNaN(Float.NaN) ? 0.0f : Float.NaN;
                            float f69 = f67;
                            float f70 = Float.isNaN(ebfVar.l) ? f52 : ebfVar.l;
                            float f71 = Float.isNaN(Float.NaN) ? 0.0f : Float.NaN;
                            float f72 = f70;
                            seiVar7.o = 0;
                            seiVar7.e = (int) (((f71 * f64) + ((f69 * f63) + seiVar5.e)) - f65);
                            seiVar7.f = (int) (((f64 * f72) + ((f63 * f68) + seiVar5.f)) - f66);
                            seiVar7.a = jya.c(ebfVar.f);
                            seiVar7.j = ebfVar.g;
                        } else {
                            float f73 = i11 / 100.0f;
                            seiVar7.c = f73;
                            seiVar7.b = ebfVar.h;
                            float f74 = Float.isNaN(ebfVar.i) ? f73 : ebfVar.i;
                            float f75 = Float.isNaN(ebfVar.j) ? f73 : ebfVar.j;
                            float f76 = seiVar6.g;
                            float f77 = seiVar5.g;
                            float f78 = f76 - f77;
                            float f79 = seiVar6.h;
                            float f80 = seiVar5.h;
                            float f81 = f79 - f80;
                            seiVar7.d = seiVar7.c;
                            float f82 = (f77 / 2.0f) + seiVar5.e;
                            float f83 = (f80 / 2.0f) + seiVar5.f;
                            float f84 = (f76 / 2.0f) + seiVar6.e;
                            float f85 = (f79 / 2.0f) + seiVar6.f;
                            if (f82 > f84) {
                                f82 = f84;
                                f84 = f82;
                            }
                            if (f83 <= f85) {
                                f83 = f85;
                                f85 = f83;
                            }
                            float f86 = f84 - f82;
                            float f87 = f83 - f85;
                            float f88 = (f78 * f74) / 2.0f;
                            seiVar7.e = (int) (((f86 * f73) + r8) - f88);
                            float f89 = (f81 * f75) / 2.0f;
                            seiVar7.f = (int) (((f87 * f73) + r8) - f89);
                            seiVar7.g = (int) (f77 + r34);
                            seiVar7.h = (int) (f80 + r42);
                            float f90 = Float.isNaN(ebfVar.k) ? f73 : ebfVar.k;
                            float f91 = Float.isNaN(Float.NaN) ? 0.0f : Float.NaN;
                            float f92 = f90;
                            float f93 = Float.isNaN(ebfVar.l) ? f73 : ebfVar.l;
                            float f94 = Float.isNaN(Float.NaN) ? 0.0f : Float.NaN;
                            float f95 = f93;
                            seiVar7.o = 0;
                            seiVar7.e = (int) (((f94 * f87) + ((f92 * f86) + seiVar5.e)) - f88);
                            seiVar7.f = (int) (((f87 * f95) + ((f86 * f91) + seiVar5.f)) - f89);
                            seiVar7.a = jya.c(ebfVar.f);
                            seiVar7.j = ebfVar.g;
                        }
                        if (Collections.binarySearch(arrayList4, seiVar7) == 0) {
                            Log.e("MotionController", " KeyPath position \"" + seiVar7.d + "\" outside of range");
                        }
                        arrayList4.add((-r8) - 1, seiVar7);
                        i5 = ebfVar.e;
                        if (i5 == -1) {
                            this.e = i5;
                        }
                    }
                    if (Collections.binarySearch(arrayList4, seiVar7) == 0) {
                    }
                    arrayList4.add((-r8) - 1, seiVar7);
                    i5 = ebfVar.e;
                    if (i5 == -1) {
                    }
                } else {
                    str19 = str28;
                    str20 = str24;
                    str21 = str25;
                    str22 = str26;
                    str23 = str27;
                    if (cafVar instanceof kaf) {
                        cafVar.d(hashSet10);
                    } else if (cafVar instanceof jbf) {
                        cafVar.d(hashSet8);
                    } else if (cafVar instanceof lbf) {
                        if (arrayList6 == null) {
                            arrayList6 = new ArrayList();
                        }
                        ArrayList arrayList7 = arrayList6;
                        arrayList7.add((lbf) cafVar);
                        arrayList6 = arrayList7;
                    } else {
                        cafVar.f(hashMap2);
                        cafVar.d(hashSet9);
                    }
                }
                str29 = str30;
                str27 = str23;
                str28 = str19;
                str25 = str21;
                str24 = str20;
                str26 = str22;
            }
            str = str28;
            arrayList = arrayList6;
        } else {
            str = "scaleY";
            arrayList = null;
        }
        String str31 = str24;
        String str32 = str25;
        String str33 = str26;
        String str34 = str29;
        String str35 = str27;
        if (arrayList != null) {
            this.A = (lbf[]) arrayList.toArray(new lbf[0]);
        }
        String str36 = "CUSTOM,";
        if (hashSet9.isEmpty()) {
            hashSet = hashSet8;
            obj = obj13;
            str2 = str34;
            str3 = str;
            str4 = str32;
            str5 = str31;
            str6 = str33;
            hashSet2 = hashSet9;
            hashSet3 = hashSet10;
            seiVar = seiVar6;
            obj2 = obj15;
            str7 = str35;
            arrayList2 = arrayList4;
            seiVar2 = seiVar5;
            obj3 = obj14;
        } else {
            this.y = new HashMap();
            Iterator it4 = hashSet9.iterator();
            while (it4.hasNext()) {
                String str37 = (String) it4.next();
                if (!str37.startsWith("CUSTOM,")) {
                    hashSet5 = hashSet8;
                    switch (str37.hashCode()) {
                        case -1249320806:
                            str13 = str;
                            str14 = str32;
                            str15 = str31;
                            str16 = str33;
                            hashSet6 = hashSet10;
                            str17 = str35;
                            arrayList3 = arrayList4;
                            obj7 = obj14;
                            it2 = it4;
                            str18 = str34;
                            hashSet7 = hashSet9;
                            obj8 = obj15;
                            seiVar3 = seiVar5;
                            obj9 = obj13;
                            seiVar4 = seiVar6;
                            obj10 = obj12;
                            if (str37.equals(obj10)) {
                                c3 = 0;
                                break;
                            }
                            c3 = 65535;
                            break;
                        case -1249320805:
                            str13 = str;
                            str14 = str32;
                            str15 = str31;
                            str16 = str33;
                            hashSet6 = hashSet10;
                            str17 = str35;
                            arrayList3 = arrayList4;
                            obj7 = obj14;
                            it2 = it4;
                            str18 = str34;
                            hashSet7 = hashSet9;
                            obj8 = obj15;
                            seiVar3 = seiVar5;
                            obj9 = obj13;
                            if (str37.equals(obj9)) {
                                seiVar4 = seiVar6;
                                obj10 = obj12;
                                c3 = 1;
                                break;
                            }
                            seiVar4 = seiVar6;
                            obj10 = obj12;
                            c3 = 65535;
                            break;
                        case -1225497657:
                            str13 = str;
                            str14 = str32;
                            str15 = str31;
                            str16 = str33;
                            hashSet6 = hashSet10;
                            str17 = str35;
                            arrayList3 = arrayList4;
                            obj7 = obj14;
                            it2 = it4;
                            str18 = str34;
                            hashSet7 = hashSet9;
                            obj8 = obj15;
                            if (str37.equals(obj8)) {
                                seiVar3 = seiVar5;
                                obj9 = obj13;
                                seiVar4 = seiVar6;
                                obj10 = obj12;
                                c3 = 2;
                                break;
                            }
                            seiVar3 = seiVar5;
                            obj9 = obj13;
                            seiVar4 = seiVar6;
                            obj10 = obj12;
                            c3 = 65535;
                            break;
                        case -1225497656:
                            str13 = str;
                            str14 = str32;
                            str15 = str31;
                            str16 = str33;
                            hashSet6 = hashSet10;
                            str17 = str35;
                            arrayList3 = arrayList4;
                            obj7 = obj14;
                            it2 = it4;
                            str18 = str34;
                            if (str37.equals(str18)) {
                                hashSet7 = hashSet9;
                                obj8 = obj15;
                                seiVar3 = seiVar5;
                                obj9 = obj13;
                                seiVar4 = seiVar6;
                                obj10 = obj12;
                                c3 = 3;
                                break;
                            }
                            hashSet7 = hashSet9;
                            obj8 = obj15;
                            seiVar3 = seiVar5;
                            obj9 = obj13;
                            seiVar4 = seiVar6;
                            obj10 = obj12;
                            c3 = 65535;
                            break;
                        case -1225497655:
                            str13 = str;
                            str14 = str32;
                            str15 = str31;
                            str16 = str33;
                            hashSet6 = hashSet10;
                            str17 = str35;
                            arrayList3 = arrayList4;
                            obj7 = obj14;
                            it2 = it4;
                            if (str37.equals("translationZ")) {
                                str18 = str34;
                                hashSet7 = hashSet9;
                                obj8 = obj15;
                                seiVar3 = seiVar5;
                                obj9 = obj13;
                                seiVar4 = seiVar6;
                                obj10 = obj12;
                                c3 = 4;
                                break;
                            }
                            str18 = str34;
                            hashSet7 = hashSet9;
                            obj8 = obj15;
                            seiVar3 = seiVar5;
                            obj9 = obj13;
                            seiVar4 = seiVar6;
                            obj10 = obj12;
                            c3 = 65535;
                            break;
                        case -1001078227:
                            str13 = str;
                            str14 = str32;
                            str15 = str31;
                            str16 = str33;
                            hashSet6 = hashSet10;
                            str17 = str35;
                            arrayList3 = arrayList4;
                            obj7 = obj14;
                            if (str37.equals(obj7)) {
                                it2 = it4;
                                str18 = str34;
                                hashSet7 = hashSet9;
                                obj8 = obj15;
                                seiVar3 = seiVar5;
                                obj9 = obj13;
                                seiVar4 = seiVar6;
                                obj10 = obj12;
                                c3 = 5;
                                break;
                            }
                            it2 = it4;
                            str18 = str34;
                            hashSet7 = hashSet9;
                            obj8 = obj15;
                            seiVar3 = seiVar5;
                            obj9 = obj13;
                            seiVar4 = seiVar6;
                            obj10 = obj12;
                            c3 = 65535;
                            break;
                        case -908189618:
                            str13 = str;
                            str14 = str32;
                            str15 = str31;
                            str16 = str33;
                            hashSet6 = hashSet10;
                            str17 = str35;
                            if (str37.equals(str17)) {
                                arrayList3 = arrayList4;
                                obj7 = obj14;
                                it2 = it4;
                                str18 = str34;
                                hashSet7 = hashSet9;
                                obj8 = obj15;
                                seiVar3 = seiVar5;
                                obj9 = obj13;
                                seiVar4 = seiVar6;
                                obj10 = obj12;
                                c3 = 6;
                                break;
                            }
                            arrayList3 = arrayList4;
                            obj7 = obj14;
                            it2 = it4;
                            str18 = str34;
                            hashSet7 = hashSet9;
                            obj8 = obj15;
                            seiVar3 = seiVar5;
                            obj9 = obj13;
                            seiVar4 = seiVar6;
                            obj10 = obj12;
                            c3 = 65535;
                            break;
                        case -908189617:
                            str13 = str;
                            str14 = str32;
                            str15 = str31;
                            str16 = str33;
                            if (str37.equals(str13)) {
                                hashSet6 = hashSet10;
                                str17 = str35;
                                arrayList3 = arrayList4;
                                obj7 = obj14;
                                it2 = it4;
                                str18 = str34;
                                hashSet7 = hashSet9;
                                obj8 = obj15;
                                seiVar3 = seiVar5;
                                obj9 = obj13;
                                seiVar4 = seiVar6;
                                obj10 = obj12;
                                c3 = 7;
                                break;
                            }
                            hashSet6 = hashSet10;
                            str17 = str35;
                            arrayList3 = arrayList4;
                            obj7 = obj14;
                            it2 = it4;
                            str18 = str34;
                            hashSet7 = hashSet9;
                            obj8 = obj15;
                            seiVar3 = seiVar5;
                            obj9 = obj13;
                            seiVar4 = seiVar6;
                            obj10 = obj12;
                            c3 = 65535;
                            break;
                        case -797520672:
                            str14 = str32;
                            str15 = str31;
                            str16 = str33;
                            if (str37.equals("waveVariesBy")) {
                                str13 = str;
                                hashSet6 = hashSet10;
                                str17 = str35;
                                arrayList3 = arrayList4;
                                obj7 = obj14;
                                it2 = it4;
                                str18 = str34;
                                hashSet7 = hashSet9;
                                obj8 = obj15;
                                seiVar3 = seiVar5;
                                obj9 = obj13;
                                seiVar4 = seiVar6;
                                obj10 = obj12;
                                c3 = '\b';
                                break;
                            }
                            str13 = str;
                            hashSet6 = hashSet10;
                            str17 = str35;
                            arrayList3 = arrayList4;
                            obj7 = obj14;
                            it2 = it4;
                            str18 = str34;
                            hashSet7 = hashSet9;
                            obj8 = obj15;
                            seiVar3 = seiVar5;
                            obj9 = obj13;
                            seiVar4 = seiVar6;
                            obj10 = obj12;
                            c3 = 65535;
                            break;
                        case -760884510:
                            str14 = str32;
                            str15 = str31;
                            str16 = str33;
                            if (str37.equals("transformPivotX")) {
                                str13 = str;
                                hashSet6 = hashSet10;
                                str17 = str35;
                                arrayList3 = arrayList4;
                                obj7 = obj14;
                                it2 = it4;
                                str18 = str34;
                                hashSet7 = hashSet9;
                                obj8 = obj15;
                                seiVar3 = seiVar5;
                                obj9 = obj13;
                                seiVar4 = seiVar6;
                                obj10 = obj12;
                                c3 = '\t';
                                break;
                            }
                            str13 = str;
                            hashSet6 = hashSet10;
                            str17 = str35;
                            arrayList3 = arrayList4;
                            obj7 = obj14;
                            it2 = it4;
                            str18 = str34;
                            hashSet7 = hashSet9;
                            obj8 = obj15;
                            seiVar3 = seiVar5;
                            obj9 = obj13;
                            seiVar4 = seiVar6;
                            obj10 = obj12;
                            c3 = 65535;
                            break;
                        case -760884509:
                            str14 = str32;
                            str15 = str31;
                            str16 = str33;
                            if (str37.equals("transformPivotY")) {
                                c4 = '\n';
                                String str38 = str34;
                                hashSet7 = hashSet9;
                                obj8 = obj15;
                                seiVar3 = seiVar5;
                                obj9 = obj13;
                                seiVar4 = seiVar6;
                                obj10 = obj12;
                                c3 = c4;
                                str13 = str;
                                hashSet6 = hashSet10;
                                str17 = str35;
                                arrayList3 = arrayList4;
                                obj7 = obj14;
                                it2 = it4;
                                str18 = str38;
                                break;
                            }
                            str13 = str;
                            hashSet6 = hashSet10;
                            str17 = str35;
                            arrayList3 = arrayList4;
                            obj7 = obj14;
                            it2 = it4;
                            str18 = str34;
                            hashSet7 = hashSet9;
                            obj8 = obj15;
                            seiVar3 = seiVar5;
                            obj9 = obj13;
                            seiVar4 = seiVar6;
                            obj10 = obj12;
                            c3 = 65535;
                            break;
                        case -40300674:
                            str14 = str32;
                            str15 = str31;
                            str16 = str33;
                            if (str37.equals(str14)) {
                                c4 = 11;
                                String str382 = str34;
                                hashSet7 = hashSet9;
                                obj8 = obj15;
                                seiVar3 = seiVar5;
                                obj9 = obj13;
                                seiVar4 = seiVar6;
                                obj10 = obj12;
                                c3 = c4;
                                str13 = str;
                                hashSet6 = hashSet10;
                                str17 = str35;
                                arrayList3 = arrayList4;
                                obj7 = obj14;
                                it2 = it4;
                                str18 = str382;
                                break;
                            }
                            str13 = str;
                            hashSet6 = hashSet10;
                            str17 = str35;
                            arrayList3 = arrayList4;
                            obj7 = obj14;
                            it2 = it4;
                            str18 = str34;
                            hashSet7 = hashSet9;
                            obj8 = obj15;
                            seiVar3 = seiVar5;
                            obj9 = obj13;
                            seiVar4 = seiVar6;
                            obj10 = obj12;
                            c3 = 65535;
                            break;
                        case -4379043:
                            str15 = str31;
                            str16 = str33;
                            if (str37.equals(str15)) {
                                str13 = str;
                                hashSet6 = hashSet10;
                                str17 = str35;
                                arrayList3 = arrayList4;
                                obj7 = obj14;
                                it2 = it4;
                                str18 = str34;
                                hashSet7 = hashSet9;
                                obj8 = obj15;
                                seiVar3 = seiVar5;
                                obj9 = obj13;
                                seiVar4 = seiVar6;
                                obj10 = obj12;
                                c3 = '\f';
                                str14 = str32;
                                break;
                            } else {
                                str13 = str;
                                str14 = str32;
                                hashSet6 = hashSet10;
                                str17 = str35;
                                arrayList3 = arrayList4;
                                obj7 = obj14;
                                it2 = it4;
                                str18 = str34;
                                hashSet7 = hashSet9;
                                obj8 = obj15;
                                seiVar3 = seiVar5;
                                obj9 = obj13;
                                seiVar4 = seiVar6;
                                obj10 = obj12;
                                c3 = 65535;
                                break;
                            }
                        case 37232917:
                            str16 = str33;
                            if (str37.equals(str16)) {
                                str13 = str;
                                str14 = str32;
                                hashSet6 = hashSet10;
                                str17 = str35;
                                arrayList3 = arrayList4;
                                obj7 = obj14;
                                it2 = it4;
                                str18 = str34;
                                hashSet7 = hashSet9;
                                obj8 = obj15;
                                seiVar3 = seiVar5;
                                obj9 = obj13;
                                seiVar4 = seiVar6;
                                obj10 = obj12;
                                c3 = '\r';
                                str15 = str31;
                                break;
                            } else {
                                str13 = str;
                                str14 = str32;
                                str15 = str31;
                                hashSet6 = hashSet10;
                                str17 = str35;
                                arrayList3 = arrayList4;
                                obj7 = obj14;
                                it2 = it4;
                                str18 = str34;
                                hashSet7 = hashSet9;
                                obj8 = obj15;
                                seiVar3 = seiVar5;
                                obj9 = obj13;
                                seiVar4 = seiVar6;
                                obj10 = obj12;
                                c3 = 65535;
                                break;
                            }
                        case 92909918:
                            if (str37.equals("alpha")) {
                                c5 = 14;
                                str13 = str;
                                str14 = str32;
                                str15 = str31;
                                hashSet6 = hashSet10;
                                str17 = str35;
                                arrayList3 = arrayList4;
                                obj7 = obj14;
                                it2 = it4;
                                str18 = str34;
                                hashSet7 = hashSet9;
                                obj8 = obj15;
                                seiVar3 = seiVar5;
                                obj9 = obj13;
                                seiVar4 = seiVar6;
                                obj10 = obj12;
                                c3 = c5;
                                str16 = str33;
                                break;
                            }
                            str13 = str;
                            str14 = str32;
                            str15 = str31;
                            str16 = str33;
                            hashSet6 = hashSet10;
                            str17 = str35;
                            arrayList3 = arrayList4;
                            obj7 = obj14;
                            it2 = it4;
                            str18 = str34;
                            hashSet7 = hashSet9;
                            obj8 = obj15;
                            seiVar3 = seiVar5;
                            obj9 = obj13;
                            seiVar4 = seiVar6;
                            obj10 = obj12;
                            c3 = 65535;
                            break;
                        case 156108012:
                            if (str37.equals("waveOffset")) {
                                c5 = 15;
                                str13 = str;
                                str14 = str32;
                                str15 = str31;
                                hashSet6 = hashSet10;
                                str17 = str35;
                                arrayList3 = arrayList4;
                                obj7 = obj14;
                                it2 = it4;
                                str18 = str34;
                                hashSet7 = hashSet9;
                                obj8 = obj15;
                                seiVar3 = seiVar5;
                                obj9 = obj13;
                                seiVar4 = seiVar6;
                                obj10 = obj12;
                                c3 = c5;
                                str16 = str33;
                                break;
                            }
                            str13 = str;
                            str14 = str32;
                            str15 = str31;
                            str16 = str33;
                            hashSet6 = hashSet10;
                            str17 = str35;
                            arrayList3 = arrayList4;
                            obj7 = obj14;
                            it2 = it4;
                            str18 = str34;
                            hashSet7 = hashSet9;
                            obj8 = obj15;
                            seiVar3 = seiVar5;
                            obj9 = obj13;
                            seiVar4 = seiVar6;
                            obj10 = obj12;
                            c3 = 65535;
                            break;
                        default:
                            str13 = str;
                            str14 = str32;
                            str15 = str31;
                            str16 = str33;
                            hashSet6 = hashSet10;
                            str17 = str35;
                            arrayList3 = arrayList4;
                            obj7 = obj14;
                            it2 = it4;
                            str18 = str34;
                            hashSet7 = hashSet9;
                            obj8 = obj15;
                            seiVar3 = seiVar5;
                            obj9 = obj13;
                            seiVar4 = seiVar6;
                            obj10 = obj12;
                            c3 = 65535;
                            break;
                    }
                    switch (c3) {
                        case 0:
                            obj11 = obj9;
                            obj12 = obj10;
                            ehuVar2 = new ehu(5);
                            break;
                        case 1:
                            obj11 = obj9;
                            obj12 = obj10;
                            ehuVar2 = new ehu(6);
                            break;
                        case 2:
                            obj11 = obj9;
                            obj12 = obj10;
                            ehuVar2 = new ehu(9);
                            break;
                        case 3:
                            obj11 = obj9;
                            obj12 = obj10;
                            ehuVar2 = new ehu(10);
                            break;
                        case 4:
                            obj11 = obj9;
                            obj12 = obj10;
                            ehuVar2 = new ehu(11);
                            break;
                        case 5:
                            obj11 = obj9;
                            obj12 = obj10;
                            ?? hhuVar = new hhu();
                            hhuVar.f = false;
                            ehuVar2 = hhuVar;
                            break;
                        case 6:
                            obj11 = obj9;
                            obj12 = obj10;
                            ehuVar2 = new ehu(7);
                            break;
                        case 7:
                            obj11 = obj9;
                            obj12 = obj10;
                            ehuVar2 = new ehu(8);
                            break;
                        case '\b':
                            obj11 = obj9;
                            obj12 = obj10;
                            ehuVar2 = new ehu(0);
                            break;
                        case '\t':
                            obj11 = obj9;
                            obj12 = obj10;
                            ehuVar2 = new ehu(2);
                            break;
                        case '\n':
                            obj11 = obj9;
                            obj12 = obj10;
                            ehuVar2 = new ehu(3);
                            break;
                        case 11:
                            obj11 = obj9;
                            obj12 = obj10;
                            ehuVar2 = new ehu(4);
                            break;
                        case '\f':
                            obj11 = obj9;
                            obj12 = obj10;
                            ehuVar2 = new ehu(1);
                            break;
                        case '\r':
                            obj11 = obj9;
                            obj12 = obj10;
                            ehuVar2 = new ghu();
                            break;
                        case 14:
                            obj11 = obj9;
                            obj12 = obj10;
                            ehuVar = new ehu(0);
                            ehuVar2 = ehuVar;
                            break;
                        case 15:
                            obj12 = obj10;
                            obj11 = obj9;
                            ehuVar = new ehu(0);
                            ehuVar2 = ehuVar;
                            break;
                        default:
                            obj11 = obj9;
                            obj12 = obj10;
                            ehuVar2 = null;
                            break;
                    }
                } else {
                    SparseArray sparseArray = new SparseArray();
                    String str39 = str37.split(StringUtils.COMMA)[1];
                    Iterator it5 = arrayList5.iterator();
                    while (it5.hasNext()) {
                        caf cafVar2 = (caf) it5.next();
                        HashSet hashSet11 = hashSet8;
                        HashMap hashMap3 = cafVar2.d;
                        if (hashMap3 != null && (p86Var3 = (p86) hashMap3.get(str39)) != null) {
                            sparseArray.append(cafVar2.a, p86Var3);
                        }
                        hashSet8 = hashSet11;
                    }
                    hashSet5 = hashSet8;
                    ?? fhuVar = new fhu();
                    String str40 = str37.split(StringUtils.COMMA)[1];
                    fhuVar.f = sparseArray;
                    obj11 = obj13;
                    str13 = str;
                    str14 = str32;
                    str15 = str31;
                    hashSet6 = hashSet10;
                    seiVar4 = seiVar6;
                    str17 = str35;
                    arrayList3 = arrayList4;
                    obj7 = obj14;
                    it2 = it4;
                    str18 = str34;
                    hashSet7 = hashSet9;
                    obj8 = obj15;
                    seiVar3 = seiVar5;
                    ehuVar2 = fhuVar;
                    str16 = str33;
                }
                if (ehuVar2 != null) {
                    ehuVar2.e = str37;
                    this.y.put(str37, ehuVar2);
                }
                str33 = str16;
                str31 = str15;
                str32 = str14;
                seiVar6 = seiVar4;
                seiVar5 = seiVar3;
                obj13 = obj11;
                hashSet8 = hashSet5;
                obj15 = obj8;
                hashSet9 = hashSet7;
                str34 = str18;
                it4 = it2;
                obj14 = obj7;
                arrayList4 = arrayList3;
                str35 = str17;
                hashSet10 = hashSet6;
                str = str13;
            }
            hashSet = hashSet8;
            obj = obj13;
            str2 = str34;
            str3 = str;
            str4 = str32;
            str5 = str31;
            str6 = str33;
            hashSet2 = hashSet9;
            hashSet3 = hashSet10;
            seiVar = seiVar6;
            obj2 = obj15;
            str7 = str35;
            arrayList2 = arrayList4;
            seiVar2 = seiVar5;
            obj3 = obj14;
            if (arrayList5 != null) {
                Iterator it6 = arrayList5.iterator();
                while (it6.hasNext()) {
                    caf cafVar3 = (caf) it6.next();
                    if (cafVar3 instanceof haf) {
                        cafVar3.a(this.y);
                    }
                }
            }
            eeiVar.a(0, this.y);
            eeiVar2.a(100, this.y);
            Iterator it7 = this.y.keySet().iterator();
            while (it7.hasNext()) {
                String str41 = (String) it7.next();
                int intValue = (!hashMap2.containsKey(str41) || (num = (Integer) hashMap2.get(str41)) == null) ? 0 : num.intValue();
                Iterator it8 = it7;
                ihu ihuVar = (ihu) this.y.get(str41);
                if (ihuVar != null) {
                    ihuVar.d(intValue);
                }
                it7 = it8;
            }
        }
        if (hashSet.isEmpty()) {
            str8 = "CUSTOM,";
        } else {
            if (this.x == null) {
                this.x = new HashMap();
            }
            Iterator it9 = hashSet.iterator();
            while (it9.hasNext()) {
                String str42 = (String) it9.next();
                if (!this.x.containsKey(str42)) {
                    if (str42.startsWith(str36)) {
                        SparseArray sparseArray2 = new SparseArray();
                        it = it9;
                        String str43 = str42.split(StringUtils.COMMA)[1];
                        Iterator it10 = arrayList5.iterator();
                        while (it10.hasNext()) {
                            String str44 = str36;
                            caf cafVar4 = (caf) it10.next();
                            HashMap hashMap4 = hashMap2;
                            HashMap hashMap5 = cafVar4.d;
                            if (hashMap5 != null && (p86Var2 = (p86) hashMap5.get(str43)) != null) {
                                sparseArray2.append(cafVar4.a, p86Var2);
                            }
                            hashMap2 = hashMap4;
                            str36 = str44;
                        }
                        hashMap = hashMap2;
                        str11 = str36;
                        ?? qhuVar = new qhu();
                        qhuVar.m = new SparseArray();
                        qhuVar.k = str42.split(StringUtils.COMMA)[1];
                        qhuVar.l = sparseArray2;
                        str12 = str6;
                        obj6 = obj2;
                        phuVar2 = qhuVar;
                        obj4 = obj12;
                        obj5 = obj;
                    } else {
                        hashMap = hashMap2;
                        it = it9;
                        str11 = str36;
                        switch (str42.hashCode()) {
                            case -1249320806:
                                obj4 = obj12;
                                obj5 = obj;
                                if (str42.equals(obj4)) {
                                    c = 0;
                                    break;
                                }
                                c = 65535;
                                break;
                            case -1249320805:
                                obj5 = obj;
                                if (str42.equals(obj5)) {
                                    obj4 = obj12;
                                    c = 1;
                                    break;
                                } else {
                                    obj4 = obj12;
                                    c = 65535;
                                    break;
                                }
                            case -1225497657:
                                if (str42.equals(obj2)) {
                                    obj4 = obj12;
                                    obj5 = obj;
                                    c = 2;
                                    break;
                                }
                                obj4 = obj12;
                                obj5 = obj;
                                c = 65535;
                                break;
                            case -1225497656:
                                if (str42.equals(str2)) {
                                    obj4 = obj12;
                                    obj5 = obj;
                                    c = 3;
                                    break;
                                }
                                obj4 = obj12;
                                obj5 = obj;
                                c = 65535;
                                break;
                            case -1225497655:
                                if (str42.equals("translationZ")) {
                                    obj4 = obj12;
                                    obj5 = obj;
                                    c = 4;
                                    break;
                                }
                                obj4 = obj12;
                                obj5 = obj;
                                c = 65535;
                                break;
                            case -1001078227:
                                if (str42.equals(obj3)) {
                                    obj4 = obj12;
                                    obj5 = obj;
                                    c = 5;
                                    break;
                                }
                                obj4 = obj12;
                                obj5 = obj;
                                c = 65535;
                                break;
                            case -908189618:
                                if (str42.equals(str7)) {
                                    obj4 = obj12;
                                    obj5 = obj;
                                    c = 6;
                                    break;
                                }
                                obj4 = obj12;
                                obj5 = obj;
                                c = 65535;
                                break;
                            case -908189617:
                                if (str42.equals(str3)) {
                                    obj4 = obj12;
                                    obj5 = obj;
                                    c = 7;
                                    break;
                                }
                                obj4 = obj12;
                                obj5 = obj;
                                c = 65535;
                                break;
                            case -40300674:
                                if (str42.equals(str4)) {
                                    obj4 = obj12;
                                    obj5 = obj;
                                    c = '\b';
                                    break;
                                }
                                obj4 = obj12;
                                obj5 = obj;
                                c = 65535;
                                break;
                            case -4379043:
                                if (str42.equals(str5)) {
                                    obj4 = obj12;
                                    obj5 = obj;
                                    c = '\t';
                                    break;
                                }
                                obj4 = obj12;
                                obj5 = obj;
                                c = 65535;
                                break;
                            case 37232917:
                                if (str42.equals(str6)) {
                                    c2 = '\n';
                                    c = c2;
                                    obj4 = obj12;
                                    obj5 = obj;
                                    break;
                                }
                                obj4 = obj12;
                                obj5 = obj;
                                c = 65535;
                                break;
                            case 92909918:
                                if (str42.equals("alpha")) {
                                    c2 = 11;
                                    c = c2;
                                    obj4 = obj12;
                                    obj5 = obj;
                                    break;
                                }
                                obj4 = obj12;
                                obj5 = obj;
                                c = 65535;
                                break;
                            default:
                                obj4 = obj12;
                                obj5 = obj;
                                c = 65535;
                                break;
                        }
                        switch (c) {
                            case 0:
                                phuVar = new phu(3);
                                str12 = str6;
                                obj6 = obj2;
                                phuVar.i = j;
                                phuVar3 = phuVar;
                                break;
                            case 1:
                                phuVar = new phu(4);
                                str12 = str6;
                                obj6 = obj2;
                                phuVar.i = j;
                                phuVar3 = phuVar;
                                break;
                            case 2:
                                phuVar = new phu(7);
                                str12 = str6;
                                obj6 = obj2;
                                phuVar.i = j;
                                phuVar3 = phuVar;
                                break;
                            case 3:
                                phuVar = new phu(8);
                                str12 = str6;
                                obj6 = obj2;
                                phuVar.i = j;
                                phuVar3 = phuVar;
                                break;
                            case 4:
                                phuVar = new phu(9);
                                str12 = str6;
                                obj6 = obj2;
                                phuVar.i = j;
                                phuVar3 = phuVar;
                                break;
                            case 5:
                                ?? shuVar = new shu();
                                shuVar.k = false;
                                phuVar = shuVar;
                                str12 = str6;
                                obj6 = obj2;
                                phuVar.i = j;
                                phuVar3 = phuVar;
                                break;
                            case 6:
                                phuVar = new phu(5);
                                str12 = str6;
                                obj6 = obj2;
                                phuVar.i = j;
                                phuVar3 = phuVar;
                                break;
                            case 7:
                                phuVar = new phu(6);
                                str12 = str6;
                                obj6 = obj2;
                                phuVar.i = j;
                                phuVar3 = phuVar;
                                break;
                            case '\b':
                                phuVar = new phu(2);
                                str12 = str6;
                                obj6 = obj2;
                                phuVar.i = j;
                                phuVar3 = phuVar;
                                break;
                            case '\t':
                                phuVar = new phu(1);
                                str12 = str6;
                                obj6 = obj2;
                                phuVar.i = j;
                                phuVar3 = phuVar;
                                break;
                            case '\n':
                                phuVar = new rhu();
                                str12 = str6;
                                obj6 = obj2;
                                phuVar.i = j;
                                phuVar3 = phuVar;
                                break;
                            case 11:
                                phuVar = new phu(0);
                                str12 = str6;
                                obj6 = obj2;
                                phuVar.i = j;
                                phuVar3 = phuVar;
                                break;
                            default:
                                str12 = str6;
                                obj6 = obj2;
                                phuVar2 = null;
                                break;
                        }
                        if (phuVar3 != null) {
                            phuVar3.f = str42;
                            this.x.put(str42, phuVar3);
                        }
                        obj12 = obj4;
                        obj = obj5;
                        obj2 = obj6;
                        it9 = it;
                        hashMap2 = hashMap;
                        str36 = str11;
                        str6 = str12;
                    }
                    phuVar3 = phuVar2;
                    if (phuVar3 != null) {
                    }
                    obj12 = obj4;
                    obj = obj5;
                    obj2 = obj6;
                    it9 = it;
                    hashMap2 = hashMap;
                    str36 = str11;
                    str6 = str12;
                }
            }
            HashMap hashMap6 = hashMap2;
            str8 = str36;
            if (arrayList5 != null) {
                Iterator it11 = arrayList5.iterator();
                while (it11.hasNext()) {
                    caf cafVar5 = (caf) it11.next();
                    if (cafVar5 instanceof jbf) {
                        ((jbf) cafVar5).g(this.x);
                    }
                }
            }
            for (String str45 : this.x.keySet()) {
                HashMap hashMap7 = hashMap6;
                ((thu) this.x.get(str45)).e(hashMap7.containsKey(str45) ? ((Integer) hashMap7.get(str45)).intValue() : 0);
                hashMap6 = hashMap7;
            }
        }
        int size = arrayList2.size();
        int i12 = size + 2;
        sei[] seiVarArr = new sei[i12];
        seiVarArr[0] = seiVar2;
        seiVarArr[size + 1] = seiVar;
        if (arrayList2.size() > 0 && this.e == -1) {
            this.e = 0;
        }
        Iterator it12 = arrayList2.iterator();
        int i13 = 1;
        while (it12.hasNext()) {
            seiVarArr[i13] = (sei) it12.next();
            i13++;
        }
        HashSet hashSet12 = new HashSet();
        for (String str46 : seiVar.n.keySet()) {
            sei seiVar8 = seiVar2;
            if (seiVar8.n.containsKey(str46)) {
                str10 = str8;
                hashSet4 = hashSet2;
                if (!hashSet4.contains(str10 + str46)) {
                    hashSet12.add(str46);
                }
            } else {
                hashSet4 = hashSet2;
                str10 = str8;
            }
            seiVar2 = seiVar8;
            str8 = str10;
            hashSet2 = hashSet4;
        }
        String[] strArr = (String[]) hashSet12.toArray(new String[0]);
        this.r = strArr;
        this.s = new int[strArr.length];
        int i14 = 0;
        while (true) {
            String[] strArr2 = this.r;
            if (i14 < strArr2.length) {
                String str47 = strArr2[i14];
                this.s[i14] = 0;
                int i15 = 0;
                while (true) {
                    if (i15 >= i12) {
                        break;
                    }
                    if (!seiVarArr[i15].n.containsKey(str47) || (p86Var = (p86) seiVarArr[i15].n.get(str47)) == null) {
                        i15++;
                    } else {
                        int[] iArr = this.s;
                        iArr[i14] = p86Var.c() + iArr[i14];
                    }
                }
                i14++;
            } else {
                boolean z = seiVarArr[0].j != -1;
                int length = 18 + strArr2.length;
                boolean[] zArr = new boolean[length];
                for (int i16 = 1; i16 < i12; i16++) {
                    sei seiVar9 = seiVarArr[i16];
                    sei seiVar10 = seiVarArr[i16 - 1];
                    boolean b2 = sei.b(seiVar9.e, seiVar10.e);
                    boolean b3 = sei.b(seiVar9.f, seiVar10.f);
                    zArr[0] = zArr[0] | sei.b(seiVar9.d, seiVar10.d);
                    boolean z2 = b2 | b3 | z;
                    zArr[1] = zArr[1] | z2;
                    zArr[2] = z2 | zArr[2];
                    zArr[3] = zArr[3] | sei.b(seiVar9.g, seiVar10.g);
                    zArr[4] = sei.b(seiVar9.h, seiVar10.h) | zArr[4];
                }
                int i17 = 0;
                for (int i18 = 1; i18 < length; i18++) {
                    if (zArr[i18]) {
                        i17++;
                    }
                }
                this.o = new int[i17];
                int max = Math.max(2, i17);
                this.p = new double[max];
                this.q = new double[max];
                int i19 = 0;
                for (int i20 = 1; i20 < length; i20++) {
                    if (zArr[i20]) {
                        this.o[i19] = i20;
                        i19++;
                    }
                }
                int[] iArr2 = {i12, this.o.length};
                Class cls = Double.TYPE;
                double[][] dArr = (double[][]) Array.newInstance((Class<?>) cls, iArr2);
                double[] dArr2 = new double[i12];
                int i21 = 0;
                while (i21 < i12) {
                    sei seiVar11 = seiVarArr[i21];
                    double[] dArr3 = dArr[i21];
                    int[] iArr3 = this.o;
                    sei[] seiVarArr2 = seiVarArr;
                    int i22 = 6;
                    float[] fArr = {seiVar11.d, seiVar11.e, seiVar11.f, seiVar11.g, seiVar11.h, seiVar11.i};
                    int i23 = 0;
                    int i24 = 0;
                    while (i23 < iArr3.length) {
                        if (iArr3[i23] < i22) {
                            dArr3[i24] = fArr[r11];
                            i24++;
                        }
                        i23++;
                        i22 = 6;
                    }
                    dArr2[i21] = seiVarArr2[i21].c;
                    i21++;
                    seiVarArr = seiVarArr2;
                }
                sei[] seiVarArr3 = seiVarArr;
                int i25 = 0;
                while (true) {
                    int[] iArr4 = this.o;
                    if (i25 < iArr4.length) {
                        if (iArr4[i25] < 6) {
                            String o = su4.o(new StringBuilder(), sei.r[this.o[i25]], " [");
                            for (int i26 = 0; i26 < i12; i26++) {
                                StringBuilder k = dfi.k(o);
                                k.append(dArr[i26][i25]);
                                o = k.toString();
                            }
                        }
                        i25++;
                    } else {
                        this.j = new lg3[this.r.length + 1];
                        int i27 = 0;
                        while (true) {
                            String[] strArr3 = this.r;
                            if (i27 >= strArr3.length) {
                                this.j[0] = lg3.f0(this.e, dArr2, dArr);
                                if (seiVarArr3[0].j != -1) {
                                    int[] iArr5 = new int[i12];
                                    double[] dArr4 = new double[i12];
                                    double[][] dArr5 = (double[][]) Array.newInstance((Class<?>) cls, i12, 2);
                                    for (int i28 = 0; i28 < i12; i28++) {
                                        iArr5[i28] = seiVarArr3[i28].j;
                                        dArr4[i28] = r5.c;
                                        double[] dArr6 = dArr5[i28];
                                        dArr6[0] = r5.e;
                                        dArr6[1] = r5.f;
                                    }
                                    this.k = new ex0(iArr5, dArr4, dArr5);
                                }
                                this.z = new HashMap();
                                if (arrayList5 != null) {
                                    Iterator it13 = hashSet3.iterator();
                                    float f96 = Float.NaN;
                                    while (it13.hasNext()) {
                                        String str48 = (String) it13.next();
                                        tfu b4 = tfu.b(str48);
                                        if (b4 != null) {
                                            if (b4.e == 1 && Float.isNaN(f96)) {
                                                f96 = c();
                                            }
                                            b4.b = str48;
                                            this.z.put(str48, b4);
                                        }
                                    }
                                    Iterator it14 = arrayList5.iterator();
                                    while (it14.hasNext()) {
                                        caf cafVar6 = (caf) it14.next();
                                        if (cafVar6 instanceof kaf) {
                                            ((kaf) cafVar6).g(this.z);
                                        }
                                    }
                                    Iterator it15 = this.z.values().iterator();
                                    while (it15.hasNext()) {
                                        ((tfu) it15.next()).e();
                                    }
                                    return;
                                }
                                return;
                            }
                            String str49 = strArr3[i27];
                            int i29 = 0;
                            int i30 = 0;
                            double[] dArr7 = null;
                            double[][] dArr8 = null;
                            while (i29 < i12) {
                                if (seiVarArr3[i29].n.containsKey(str49)) {
                                    if (dArr8 == null) {
                                        dArr7 = new double[i12];
                                        p86 p86Var4 = (p86) seiVarArr3[i29].n.get(str49);
                                        dArr8 = (double[][]) Array.newInstance((Class<?>) cls, i12, p86Var4 == null ? 0 : p86Var4.c());
                                    }
                                    sei seiVar12 = seiVarArr3[i29];
                                    dArr7[i30] = seiVar12.c;
                                    double[] dArr9 = dArr8[i30];
                                    p86 p86Var5 = (p86) seiVar12.n.get(str49);
                                    if (p86Var5 != null) {
                                        if (p86Var5.c() == 1) {
                                            dArr9[0] = p86Var5.a();
                                        } else {
                                            int c6 = p86Var5.c();
                                            p86Var5.b(new float[c6]);
                                            int i31 = 0;
                                            int i32 = 0;
                                            while (i31 < c6) {
                                                dArr9[i32] = r14[i31];
                                                i31++;
                                                str49 = str49;
                                                i32++;
                                                i27 = i27;
                                                i29 = i29;
                                            }
                                        }
                                    }
                                    i3 = i27;
                                    str9 = str49;
                                    i4 = i29;
                                    i30++;
                                } else {
                                    i3 = i27;
                                    str9 = str49;
                                    i4 = i29;
                                }
                                i29 = i4 + 1;
                                str49 = str9;
                                i27 = i3;
                            }
                            int i33 = i27;
                            double[] copyOf = Arrays.copyOf(dArr7, i30);
                            double[][] dArr10 = (double[][]) Arrays.copyOf(dArr8, i30);
                            int i34 = i33 + 1;
                            this.j[i34] = lg3.f0(this.e, copyOf, dArr10);
                            i27 = i34;
                        }
                    }
                }
            }
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(" start: x: ");
        sei seiVar = this.f;
        sb.append(seiVar.e);
        sb.append(" y: ");
        sb.append(seiVar.f);
        sb.append(" end: x: ");
        sei seiVar2 = this.g;
        sb.append(seiVar2.e);
        sb.append(" y: ");
        sb.append(seiVar2.f);
        return sb.toString();
    }
}
