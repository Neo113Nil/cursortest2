package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.util.Log;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.BounceInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.OvershootInterpolator;
import androidx.constraintlayout.widget.Barrier;
import com.connectsdk.service.webos.lgcast.remotecamera.RemoteCameraConfig;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* loaded from: classes3.dex */
public final class eg0 {
    public int a;
    public int b;
    public Object c;
    public Object d;
    public Object e;
    public Object f;
    public Object g;

    public eg0(Class cls, Class[] clsArr) {
        this.c = null;
        HashSet hashSet = new HashSet();
        this.d = hashSet;
        this.e = new HashSet();
        this.a = 0;
        this.b = 0;
        this.g = new HashSet();
        hashSet.add(m5n.a(cls));
        for (Class cls2 : clsArr) {
            v3g.w(cls2, "Null interface");
            ((HashSet) this.d).add(m5n.a(cls2));
        }
    }

    public static void e(ba6 ba6Var, ba6 ba6Var2) {
        ArrayList arrayList = ba6Var.u0;
        HashMap hashMap = new HashMap();
        hashMap.put(ba6Var, ba6Var2);
        ba6Var2.u0.clear();
        ba6Var2.g(ba6Var, hashMap);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            aa6 aa6Var = (aa6) it.next();
            aa6 ap2Var = aa6Var instanceof ap2 ? new ap2() : aa6Var instanceof grd ? new grd() : aa6Var instanceof qjc ? new qjc() : aa6Var instanceof nsk ? new nsk() : aa6Var instanceof fxd ? new fxd() : new aa6();
            ba6Var2.u0.add(ap2Var);
            aa6 aa6Var2 = ap2Var.V;
            if (aa6Var2 != null) {
                ((ba6) aa6Var2).u0.remove(ap2Var);
                ap2Var.D();
            }
            ap2Var.V = ba6Var2;
            hashMap.put(aa6Var, ap2Var);
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            aa6 aa6Var3 = (aa6) it2.next();
            ((aa6) hashMap.get(aa6Var3)).g(aa6Var3, hashMap);
        }
    }

    public static aa6 f(ba6 ba6Var, View view) {
        if (ba6Var.h0 == view) {
            return ba6Var;
        }
        ArrayList arrayList = ba6Var.u0;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            aa6 aa6Var = (aa6) arrayList.get(i);
            if (aa6Var.h0 == view) {
                return aa6Var;
            }
        }
        return null;
    }

    public void a(ox7 ox7Var) {
        if (((HashSet) this.d).contains(ox7Var.a)) {
            xq0.x("Components are not allowed to depend on interfaces they themselves provide.");
        } else {
            ((HashSet) this.e).add(ox7Var);
        }
    }

    public vm5 b() {
        if (((nn5) this.f) != null) {
            return new vm5((String) this.c, new HashSet((HashSet) this.d), new HashSet((HashSet) this.e), this.a, this.b, (nn5) this.f, (HashSet) this.g);
        }
        xq0.q("Missing required property: factory.");
        return null;
    }

    public void c() {
        int i;
        HashMap hashMap;
        SparseArray sparseArray;
        int[] iArr;
        int i2;
        Rect rect;
        Rect rect2;
        rei reiVar = (rei) this.g;
        int childCount = reiVar.getChildCount();
        HashMap hashMap2 = reiVar.A;
        hashMap2.clear();
        SparseArray sparseArray2 = new SparseArray();
        int[] iArr2 = new int[childCount];
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = reiVar.getChildAt(i3);
            gei geiVar = new gei(childAt);
            int id = childAt.getId();
            iArr2[i3] = id;
            sparseArray2.put(id, geiVar);
            hashMap2.put(childAt, geiVar);
        }
        int i4 = 0;
        while (i4 < childCount) {
            View childAt2 = reiVar.getChildAt(i4);
            gei geiVar2 = (gei) hashMap2.get(childAt2);
            if (geiVar2 == null) {
                i = childCount;
                hashMap = hashMap2;
                sparseArray = sparseArray2;
                iArr = iArr2;
                i2 = i4;
            } else {
                Rect rect3 = geiVar2.a;
                sei seiVar = geiVar2.f;
                if (((f96) this.e) != null) {
                    aa6 f = f((ba6) this.c, childAt2);
                    if (f != null) {
                        Rect t = rei.t(reiVar, f);
                        hashMap = hashMap2;
                        f96 f96Var = (f96) this.e;
                        iArr = iArr2;
                        int width = reiVar.getWidth();
                        i2 = i4;
                        int height = reiVar.getHeight();
                        sparseArray = sparseArray2;
                        int i5 = f96Var.d;
                        if (i5 != 0) {
                            gei.f(t, rect3, i5, width, height);
                        }
                        seiVar.c = 0.0f;
                        seiVar.d = 0.0f;
                        geiVar2.e(seiVar);
                        i = childCount;
                        rect = rect3;
                        seiVar.d(t.left, t.top, t.width(), t.height());
                        a96 k = f96Var.k(geiVar2.c);
                        seiVar.a(k);
                        c96 c96Var = k.d;
                        geiVar2.l = c96Var.g;
                        geiVar2.h.c(t, f96Var, i5, geiVar2.c);
                        geiVar2.C = k.f.i;
                        geiVar2.E = c96Var.j;
                        geiVar2.F = c96Var.i;
                        Context context = geiVar2.b.getContext();
                        int i6 = c96Var.l;
                        geiVar2.G = i6 != -2 ? i6 != -1 ? i6 != 0 ? i6 != 1 ? i6 != 2 ? i6 != 4 ? i6 != 5 ? null : new OvershootInterpolator() : new BounceInterpolator() : new DecelerateInterpolator() : new AccelerateInterpolator() : new AccelerateDecelerateInterpolator() : new fei(0, jya.c(c96Var.k)) : AnimationUtils.loadInterpolator(context, c96Var.m);
                    } else {
                        i = childCount;
                        hashMap = hashMap2;
                        sparseArray = sparseArray2;
                        iArr = iArr2;
                        i2 = i4;
                        rect = rect3;
                        if (reiVar.K != 0) {
                            Log.e("MotionLayout", irf.N() + "no widget for  " + irf.P(childAt2) + " (" + childAt2.getClass().getName() + ")");
                        }
                    }
                } else {
                    i = childCount;
                    hashMap = hashMap2;
                    sparseArray = sparseArray2;
                    iArr = iArr2;
                    i2 = i4;
                    rect = rect3;
                }
                if (((f96) this.f) != null) {
                    aa6 f2 = f((ba6) this.d, childAt2);
                    if (f2 != null) {
                        Rect t2 = rei.t(reiVar, f2);
                        f96 f96Var2 = (f96) this.f;
                        int width2 = reiVar.getWidth();
                        int height2 = reiVar.getHeight();
                        sei seiVar2 = geiVar2.g;
                        int i7 = f96Var2.d;
                        if (i7 != 0) {
                            Rect rect4 = rect;
                            gei.f(t2, rect4, i7, width2, height2);
                            rect2 = rect4;
                        } else {
                            rect2 = t2;
                        }
                        seiVar2.c = 1.0f;
                        seiVar2.d = 1.0f;
                        geiVar2.e(seiVar2);
                        seiVar2.d(rect2.left, rect2.top, rect2.width(), rect2.height());
                        seiVar2.a(f96Var2.k(geiVar2.c));
                        geiVar2.i.c(rect2, f96Var2, i7, geiVar2.c);
                    } else if (reiVar.K != 0) {
                        Log.e("MotionLayout", irf.N() + "no widget for  " + irf.P(childAt2) + " (" + childAt2.getClass().getName() + ")");
                    }
                }
            }
            i4 = i2 + 1;
            hashMap2 = hashMap;
            iArr2 = iArr;
            sparseArray2 = sparseArray;
            childCount = i;
        }
        SparseArray sparseArray3 = sparseArray2;
        int[] iArr3 = iArr2;
        int i8 = childCount;
        int i9 = 0;
        while (i9 < i8) {
            SparseArray sparseArray4 = sparseArray3;
            gei geiVar3 = (gei) sparseArray4.get(iArr3[i9]);
            int i10 = geiVar3.f.k;
            if (i10 != -1) {
                gei geiVar4 = (gei) sparseArray4.get(i10);
                geiVar3.f.f(geiVar4, geiVar4.f);
                geiVar3.g.f(geiVar4, geiVar4.g);
            }
            i9++;
            sparseArray3 = sparseArray4;
        }
    }

    public void d(int i, int i2) {
        rei reiVar = (rei) this.g;
        int optimizationLevel = reiVar.getOptimizationLevel();
        if (reiVar.v == reiVar.getStartState()) {
            ba6 ba6Var = (ba6) this.d;
            f96 f96Var = (f96) this.f;
            reiVar.r(ba6Var, optimizationLevel, (f96Var == null || f96Var.d == 0) ? i : i2, (f96Var == null || f96Var.d == 0) ? i2 : i);
            f96 f96Var2 = (f96) this.e;
            if (f96Var2 != null) {
                ba6 ba6Var2 = (ba6) this.c;
                int i3 = f96Var2.d;
                int i4 = i3 == 0 ? i : i2;
                if (i3 == 0) {
                    i = i2;
                }
                reiVar.r(ba6Var2, optimizationLevel, i4, i);
                return;
            }
            return;
        }
        f96 f96Var3 = (f96) this.e;
        if (f96Var3 != null) {
            ba6 ba6Var3 = (ba6) this.c;
            int i5 = f96Var3.d;
            reiVar.r(ba6Var3, optimizationLevel, i5 == 0 ? i : i2, i5 == 0 ? i2 : i);
        }
        ba6 ba6Var4 = (ba6) this.d;
        f96 f96Var4 = (f96) this.f;
        int i6 = (f96Var4 == null || f96Var4.d == 0) ? i : i2;
        if (f96Var4 == null || f96Var4.d == 0) {
            i = i2;
        }
        reiVar.r(ba6Var4, optimizationLevel, i6, i);
    }

    public void g(f96 f96Var, f96 f96Var2) {
        this.e = f96Var;
        this.f = f96Var2;
        this.c = new ba6();
        ba6 ba6Var = new ba6();
        this.d = ba6Var;
        ba6 ba6Var2 = (ba6) this.c;
        rei reiVar = (rei) this.g;
        boolean z = rei.k1;
        ba6 ba6Var3 = reiVar.c;
        awm awmVar = ba6Var3.y0;
        ba6Var2.y0 = awmVar;
        ba6Var2.w0.g = awmVar;
        awm awmVar2 = ba6Var3.y0;
        ba6Var.y0 = awmVar2;
        ba6Var.w0.g = awmVar2;
        ba6Var2.u0.clear();
        ((ba6) this.d).u0.clear();
        e(ba6Var3, (ba6) this.c);
        e(ba6Var3, (ba6) this.d);
        if (reiVar.E > 0.5d) {
            if (f96Var != null) {
                k((ba6) this.c, f96Var);
            }
            k((ba6) this.d, f96Var2);
        } else {
            k((ba6) this.d, f96Var2);
            if (f96Var != null) {
                k((ba6) this.c, f96Var);
            }
        }
        ((ba6) this.c).z0 = reiVar.n();
        ba6 ba6Var4 = (ba6) this.c;
        ba6Var4.v0.V(ba6Var4);
        ((ba6) this.d).z0 = reiVar.n();
        ba6 ba6Var5 = (ba6) this.d;
        ba6Var5.v0.V(ba6Var5);
        ViewGroup.LayoutParams layoutParams = reiVar.getLayoutParams();
        if (layoutParams != null) {
            int i = layoutParams.width;
            z96 z96Var = z96.b;
            if (i == -2) {
                ((ba6) this.c).N(z96Var);
                ((ba6) this.d).N(z96Var);
            }
            if (layoutParams.height == -2) {
                ((ba6) this.c).O(z96Var);
                ((ba6) this.d).O(z96Var);
            }
        }
    }

    public void h() {
        rei reiVar = (rei) this.g;
        int i = reiVar.x;
        int i2 = reiVar.y;
        int mode = View.MeasureSpec.getMode(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        reiVar.U0 = mode;
        reiVar.V0 = mode2;
        d(i, i2);
        int i3 = 0;
        if (!(reiVar.getParent() instanceof rei) || mode != 1073741824 || mode2 != 1073741824) {
            d(i, i2);
            reiVar.Q0 = ((ba6) this.c).r();
            reiVar.R0 = ((ba6) this.c).l();
            reiVar.S0 = ((ba6) this.d).r();
            int l = ((ba6) this.d).l();
            reiVar.T0 = l;
            reiVar.P0 = (reiVar.Q0 == reiVar.S0 && reiVar.R0 == l) ? false : true;
        }
        int i4 = reiVar.Q0;
        int i5 = reiVar.R0;
        int i6 = reiVar.U0;
        if (i6 == Integer.MIN_VALUE || i6 == 0) {
            i4 = (int) ((reiVar.W0 * (reiVar.S0 - i4)) + i4);
        }
        int i7 = reiVar.V0;
        if (i7 == Integer.MIN_VALUE || i7 == 0) {
            i5 = (int) ((reiVar.W0 * (reiVar.T0 - i5)) + i5);
        }
        int i8 = i5;
        ba6 ba6Var = (ba6) this.c;
        reiVar.q(i, i2, i4, i8, ba6Var.I0 || ((ba6) this.d).I0, ba6Var.J0 || ((ba6) this.d).J0);
        HashMap hashMap = reiVar.A;
        int childCount = reiVar.getChildCount();
        reiVar.e1.c();
        reiVar.I = true;
        SparseArray sparseArray = new SparseArray();
        for (int i9 = 0; i9 < childCount; i9++) {
            View childAt = reiVar.getChildAt(i9);
            sparseArray.put(childAt.getId(), (gei) hashMap.get(childAt));
        }
        int width = reiVar.getWidth();
        int height = reiVar.getHeight();
        xei xeiVar = reiVar.q.c;
        int i10 = xeiVar != null ? xeiVar.p : -1;
        if (i10 != -1) {
            for (int i11 = 0; i11 < childCount; i11++) {
                gei geiVar = (gei) hashMap.get(reiVar.getChildAt(i11));
                if (geiVar != null) {
                    geiVar.B = i10;
                }
            }
        }
        SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
        int[] iArr = new int[hashMap.size()];
        int i12 = 0;
        for (int i13 = 0; i13 < childCount; i13++) {
            gei geiVar2 = (gei) hashMap.get(reiVar.getChildAt(i13));
            int i14 = geiVar2.f.k;
            if (i14 != -1) {
                sparseBooleanArray.put(i14, true);
                iArr[i12] = geiVar2.f.k;
                i12++;
            }
        }
        for (int i15 = 0; i15 < i12; i15++) {
            gei geiVar3 = (gei) hashMap.get(reiVar.findViewById(iArr[i15]));
            if (geiVar3 != null) {
                reiVar.q.e(geiVar3);
                geiVar3.g(reiVar.getNanoTime(), width, height);
            }
        }
        for (int i16 = 0; i16 < childCount; i16++) {
            View childAt2 = reiVar.getChildAt(i16);
            gei geiVar4 = (gei) hashMap.get(childAt2);
            if (!sparseBooleanArray.get(childAt2.getId()) && geiVar4 != null) {
                reiVar.q.e(geiVar4);
                geiVar4.g(reiVar.getNanoTime(), width, height);
            }
        }
        xei xeiVar2 = reiVar.q.c;
        float f = xeiVar2 != null ? xeiVar2.i : 0.0f;
        if (f != 0.0f) {
            boolean z = ((double) f) < 0.0d;
            float abs = Math.abs(f);
            float f2 = -3.4028235E38f;
            float f3 = Float.MAX_VALUE;
            float f4 = -3.4028235E38f;
            float f5 = Float.MAX_VALUE;
            for (int i17 = 0; i17 < childCount; i17++) {
                gei geiVar5 = (gei) hashMap.get(reiVar.getChildAt(i17));
                if (!Float.isNaN(geiVar5.l)) {
                    for (int i18 = 0; i18 < childCount; i18++) {
                        gei geiVar6 = (gei) hashMap.get(reiVar.getChildAt(i18));
                        if (!Float.isNaN(geiVar6.l)) {
                            f3 = Math.min(f3, geiVar6.l);
                            f2 = Math.max(f2, geiVar6.l);
                        }
                    }
                    while (i3 < childCount) {
                        gei geiVar7 = (gei) hashMap.get(reiVar.getChildAt(i3));
                        if (!Float.isNaN(geiVar7.l)) {
                            geiVar7.n = 1.0f / (1.0f - abs);
                            float f6 = geiVar7.l;
                            if (z) {
                                geiVar7.m = abs - (((f2 - f6) / (f2 - f3)) * abs);
                            } else {
                                geiVar7.m = abs - (((f6 - f3) * abs) / (f2 - f3));
                            }
                        }
                        i3++;
                    }
                    return;
                }
                sei seiVar = geiVar5.g;
                float f7 = seiVar.e;
                float f8 = seiVar.f;
                float f9 = z ? f8 - f7 : f8 + f7;
                f5 = Math.min(f5, f9);
                f4 = Math.max(f4, f9);
            }
            while (i3 < childCount) {
                gei geiVar8 = (gei) hashMap.get(reiVar.getChildAt(i3));
                sei seiVar2 = geiVar8.g;
                float f10 = seiVar2.e;
                float f11 = seiVar2.f;
                float f12 = z ? f11 - f10 : f11 + f10;
                geiVar8.n = 1.0f / (1.0f - abs);
                geiVar8.m = abs - (((f12 - f5) * abs) / (f4 - f5));
                i3++;
            }
        }
    }

    public int i(pd4 pd4Var) {
        int i;
        am3 am3Var = (am3) this.e;
        byte[] bArr = (byte[]) this.d;
        bg3.P(pd4Var, "Char array buffer");
        ((fzh) this.f).getClass();
        boolean z = true;
        int i2 = 0;
        while (z) {
            int i3 = this.a;
            while (true) {
                i = this.b;
                if (i3 >= i) {
                    i3 = -1;
                    break;
                }
                if (bArr[i3] == 10) {
                    break;
                }
                i3++;
            }
            if (i3 != -1) {
                int i4 = am3Var.b;
                int i5 = this.a;
                if (i4 == 0) {
                    this.a = i3 + 1;
                    if (i3 > i5 && bArr[i3 - 1] == 13) {
                        i3--;
                    }
                    int i6 = i3 - i5;
                    pd4Var.c(bArr, i5, i6);
                    return i6;
                }
                int i7 = i3 + 1;
                am3Var.a(bArr, i5, i7 - i5);
                this.a = i7;
            } else {
                int i8 = this.a;
                if (i8 < i) {
                    am3Var.a(bArr, i8, i - i8);
                    this.a = this.b;
                }
                int i9 = this.a;
                if (i9 > 0) {
                    int i10 = this.b - i9;
                    if (i10 > 0) {
                        System.arraycopy(bArr, i9, bArr, 0, i10);
                    }
                    this.a = 0;
                    this.b = i10;
                }
                int i11 = this.b;
                int length = bArr.length - i11;
                InputStream inputStream = (InputStream) this.g;
                if (inputStream == null) {
                    xq0.q("Input stream is null");
                    return 0;
                }
                int read = inputStream.read(bArr, i11, length);
                if (read == -1) {
                    i2 = -1;
                } else {
                    this.b = i11 + read;
                    ((o6c) this.c).getClass();
                    i2 = read;
                }
                if (i2 == -1) {
                }
            }
            z = false;
        }
        if (i2 == -1 && am3Var.b == 0) {
            return -1;
        }
        int i12 = am3Var.b;
        if (i12 > 0) {
            byte[] bArr2 = am3Var.a;
            if (bArr2[i12 - 1] == 10) {
                i12--;
            }
            if (i12 > 0 && bArr2[i12 - 1] == 13) {
                i12--;
            }
        }
        pd4Var.c(am3Var.a, 0, i12);
        am3Var.b = 0;
        return i12;
    }

    public void j(int i) {
        if (this.a == 0) {
            this.a = i;
        } else {
            xq0.q("Instantiation type has already been set.");
        }
    }

    public void k(ba6 ba6Var, f96 f96Var) {
        a96 a96Var;
        a96 a96Var2;
        SparseArray sparseArray = new SparseArray();
        da6 da6Var = new da6();
        sparseArray.clear();
        sparseArray.put(0, ba6Var);
        rei reiVar = (rei) this.g;
        sparseArray.put(reiVar.getId(), ba6Var);
        if (f96Var != null && f96Var.d != 0) {
            ba6 ba6Var2 = (ba6) this.d;
            int optimizationLevel = reiVar.getOptimizationLevel();
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(reiVar.getHeight(), 1073741824);
            int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(reiVar.getWidth(), 1073741824);
            boolean z = rei.k1;
            reiVar.r(ba6Var2, optimizationLevel, makeMeasureSpec, makeMeasureSpec2);
        }
        Iterator it = ba6Var.u0.iterator();
        while (it.hasNext()) {
            aa6 aa6Var = (aa6) it.next();
            aa6Var.j0 = true;
            sparseArray.put(aa6Var.h0.getId(), aa6Var);
        }
        Iterator it2 = ba6Var.u0.iterator();
        while (it2.hasNext()) {
            aa6 aa6Var2 = (aa6) it2.next();
            View view = aa6Var2.h0;
            int id = view.getId();
            HashMap hashMap = f96Var.g;
            if (hashMap.containsKey(Integer.valueOf(id)) && (a96Var2 = (a96) hashMap.get(Integer.valueOf(id))) != null) {
                a96Var2.a(da6Var);
            }
            aa6Var2.P(f96Var.k(view.getId()).e.c);
            aa6Var2.M(f96Var.k(view.getId()).e.d);
            if (view instanceof r86) {
                r86 r86Var = (r86) view;
                int id2 = r86Var.getId();
                HashMap hashMap2 = f96Var.g;
                if (hashMap2.containsKey(Integer.valueOf(id2)) && (a96Var = (a96) hashMap2.get(Integer.valueOf(id2))) != null && (aa6Var2 instanceof fxd)) {
                    r86Var.i(a96Var, (fxd) aa6Var2, da6Var, sparseArray);
                }
                if (view instanceof Barrier) {
                    ((Barrier) view).k();
                }
            }
            da6Var.resolveLayoutDirection(reiVar.getLayoutDirection());
            boolean z2 = rei.k1;
            reiVar.a(false, view, aa6Var2, da6Var, sparseArray);
            if (f96Var.k(view.getId()).c.c == 1) {
                aa6Var2.i0 = view.getVisibility();
            } else {
                aa6Var2.i0 = f96Var.k(view.getId()).c.b;
            }
        }
        Iterator it3 = ba6Var.u0.iterator();
        while (it3.hasNext()) {
            aa6 aa6Var3 = (aa6) it3.next();
            if (aa6Var3 instanceof kiu) {
                r86 r86Var2 = (r86) aa6Var3.h0;
                fxd fxdVar = (fxd) aa6Var3;
                r86Var2.getClass();
                fxdVar.v0 = 0;
                Arrays.fill(fxdVar.u0, (Object) null);
                for (int i = 0; i < r86Var2.b; i++) {
                    fxdVar.S((aa6) sparseArray.get(r86Var2.a[i]));
                }
                kiu kiuVar = (kiu) fxdVar;
                for (int i2 = 0; i2 < kiuVar.v0; i2++) {
                    aa6 aa6Var4 = kiuVar.u0[i2];
                    if (aa6Var4 != null) {
                        aa6Var4.G = true;
                    }
                }
            }
        }
    }

    public eg0(o6c o6cVar) {
        this.c = o6cVar;
        this.d = new byte[RemoteCameraConfig.Notification.ID];
        this.a = 0;
        this.b = 0;
        this.f = fzh.a;
        am3 am3Var = new am3();
        bg3.O(RemoteCameraConfig.Notification.ID, "Buffer capacity");
        am3Var.a = new byte[RemoteCameraConfig.Notification.ID];
        this.e = am3Var;
    }

    public eg0(rei reiVar) {
        this.g = reiVar;
        this.c = new ba6();
        this.d = new ba6();
        this.e = null;
        this.f = null;
    }
}
