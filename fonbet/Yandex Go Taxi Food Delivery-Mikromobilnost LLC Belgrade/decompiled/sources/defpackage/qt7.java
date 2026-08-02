package defpackage;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.util.Log;
import android.util.Range;
import android.util.Rational;
import android.util.Size;
import androidx.camera.core.g;
import androidx.camera.core.impl.Config$OptionPriority;
import androidx.camera.core.impl.UseCaseConfigFactory$CaptureType;
import androidx.camera.core.internal.CameraUseCaseAdapter$CameraException;
import androidx.camera.core.internal.compat.quirk.ImageCaptureFailedForSpecificCombinationQuirk;
import androidx.camera.core.j;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* loaded from: classes10.dex */
public final class qt7 implements co7 {
    public xt31 A;
    public final jp7 D;
    public j H;
    public iru0 I;
    public final jud J;
    public final jud K;
    public final hhs0 M;
    public final h70 a;
    public final h70 b;
    public final zi21 c;
    public final yq7 w;
    public final jm7 z;
    public final ArrayList x = new ArrayList();
    public final ArrayList y = new ArrayList();
    public List B = Collections.EMPTY_LIST;
    public Range C = lru0.a;
    public final Object E = new Object();
    public boolean F = true;
    public szd G = null;
    public final kru0 L = new kru0();

    public qt7(br7 br7Var, br7 br7Var2, g70 g70Var, g70 g70Var2, jud judVar, jud judVar2, jm7 jm7Var, hhs0 hhs0Var, zi21 zi21Var) {
        jp7 jp7Var = g70Var.d;
        this.D = jp7Var;
        this.a = new h70(br7Var, g70Var);
        if (br7Var2 == null || g70Var2 == null) {
            this.b = null;
        } else {
            this.b = new h70(br7Var2, g70Var2);
        }
        this.J = judVar;
        this.K = judVar2;
        this.z = jm7Var;
        this.c = zi21Var;
        String c = g70Var2 != null ? g70Var2.a.c() : null;
        l6v r = jp7Var.r();
        ArrayList i = scc.i(g70Var.a.c());
        if (c != null) {
            i.add(c);
        }
        this.w = new yq7(i, r);
        this.M = hhs0Var;
    }

    public static boolean A(LinkedHashSet linkedHashSet) {
        Iterator it = linkedHashSet.iterator();
        while (it.hasNext()) {
            j jVar = (j) it.next();
            if (jVar instanceof w8v) {
                xi21 xi21Var = jVar.h;
                x34 x34Var = x8v.y;
                if (xi21Var.d(x34Var)) {
                    Integer num = (Integer) xi21Var.f(x34Var);
                    num.getClass();
                    if (num.intValue() == 2) {
                        return true;
                    }
                } else {
                    continue;
                }
            }
        }
        return false;
    }

    public static boolean B(AbstractCollection abstractCollection) {
        Iterator it = abstractCollection.iterator();
        while (it.hasNext()) {
            if (C((j) it.next())) {
                return true;
            }
        }
        return false;
    }

    public static boolean C(j jVar) {
        if (jVar != null) {
            if (jVar.h.d(xi21.t4)) {
                return jVar.h.y() == UseCaseConfigFactory$CaptureType.VIDEO_CAPTURE;
            }
            Log.e("CameraUseCaseAdapter", jVar + " UseCase does not have capture type.");
        }
        return false;
    }

    public static void E(HashMap hashMap) {
        HashSet hashSet;
        for (Map.Entry entry : hashMap.entrySet()) {
            j jVar = (j) entry.getKey();
            Set set = (Set) entry.getValue();
            if (set != null) {
                jVar.getClass();
                hashSet = new HashSet(set);
            } else {
                hashSet = null;
            }
            jVar.g = hashSet;
        }
    }

    public static ArrayList F(ArrayList arrayList, List list) {
        ArrayList arrayList2 = new ArrayList(list);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((j) it.next()).getClass();
            Iterator it2 = list.iterator();
            if (it2.hasNext()) {
                throw unr0.i(it2);
            }
        }
        return arrayList2;
    }

    public static HashMap p(LinkedHashSet linkedHashSet, ddf ddfVar) {
        HashMap hashMap = new HashMap();
        Iterator it = linkedHashSet.iterator();
        while (it.hasNext()) {
            j jVar = (j) it.next();
            hashMap.put(jVar, jVar.g);
            HashSet hashSet = null;
            LinkedHashSet linkedHashSet2 = ddfVar != null ? (LinkedHashSet) ddfVar.b : null;
            if (linkedHashSet2 != null) {
                hashSet = new HashSet(linkedHashSet2);
            }
            jVar.g = hashSet;
        }
        return hashMap;
    }

    public static Matrix t(Rect rect, Size size) {
        d6z.m("Cannot compute viewport crop rects zero sized sensor rect.", rect.width() > 0 && rect.height() > 0);
        RectF rectF = new RectF(rect);
        Matrix matrix = new Matrix();
        matrix.setRectToRect(new RectF(0.0f, 0.0f, size.getWidth(), size.getHeight()), rectF, Matrix.ScaleToFit.CENTER);
        matrix.invert(matrix);
        return matrix;
    }

    public static HashMap w(ArrayList arrayList, zi21 zi21Var, zi21 zi21Var2, Range range) {
        xi21 h;
        HashMap hashMap = new HashMap();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            j jVar = (j) it.next();
            if (jVar instanceof iru0) {
                iru0 iru0Var = (iru0) jVar;
                xi21 h2 = new pxe0().f().h(false, zi21Var);
                if (h2 == null) {
                    h = null;
                } else {
                    yy40 p = yy40.p(h2);
                    p.z(max0.f4);
                    h = ((l7s0) iru0Var.o(p)).e();
                }
            } else {
                h = jVar.h(false, zi21Var);
            }
            xi21 h3 = jVar.h(true, zi21Var2);
            yy40 p2 = h3 != null ? yy40.p(h3) : yy40.b();
            p2.w(xi21.o4, 0);
            if (!lru0.a.equals(range)) {
                p2.t(xi21.p4, Config$OptionPriority.HIGH_PRIORITY_REQUIRED, range);
                p2.w(xi21.q4, Boolean.TRUE);
            }
            xi21 e = jVar.o(p2).e();
            pt7 pt7Var = new pt7();
            pt7Var.a = h;
            pt7Var.b = e;
            hashMap.put(jVar, pt7Var);
        }
        return hashMap;
    }

    public final void D(ArrayList arrayList) {
        synchronized (this.E) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((j) it.next()).g = null;
            }
            LinkedHashSet linkedHashSet = new LinkedHashSet(this.x);
            linkedHashSet.removeAll(arrayList);
            k(s(linkedHashSet, this.b != null));
        }
    }

    @Override // defpackage.co7
    public final qp7 b() {
        return this.a.c;
    }

    @Override // defpackage.co7
    public final ar7 c() {
        return this.a.b;
    }

    public final void e(Collection collection, ddf ddfVar) {
        Objects.toString(collection);
        Objects.toString(ddfVar);
        sgb1.g(3, "CameraUseCaseAdapter");
        synchronized (this.E) {
            try {
                h70 h70Var = this.a;
                jp7 jp7Var = this.D;
                h70Var.d(jp7Var);
                h70 h70Var2 = this.b;
                if (h70Var2 != null) {
                    h70Var2.d(jp7Var);
                }
                LinkedHashSet linkedHashSet = new LinkedHashSet(this.x);
                linkedHashSet.addAll(collection);
                HashMap p = p(linkedHashSet, ddfVar);
                try {
                    k(s(linkedHashSet, this.b != null));
                } catch (IllegalArgumentException e) {
                    E(p);
                    throw new CameraUseCaseAdapter$CameraException(e);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void k(se7 se7Var) {
        Map map = se7Var.i.a;
        ArrayList arrayList = se7Var.b;
        synchronized (this.E) {
            try {
                if (this.A != null && !arrayList.isEmpty()) {
                    boolean z = this.a.b.a.d() == 0;
                    Rect n = this.a.b.a.n();
                    xt31 xt31Var = this.A;
                    Rational rational = xt31Var.b;
                    int i = this.a.b.a.i(xt31Var.c);
                    xt31 xt31Var2 = this.A;
                    HashMap h = bj91.h(n, z, rational, i, xt31Var2.a, xt31Var2.d, map);
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        j jVar = (j) it.next();
                        Rect rect = (Rect) h.get(jVar);
                        rect.getClass();
                        jVar.E(rect);
                    }
                }
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    j jVar2 = (j) it2.next();
                    Rect n2 = this.a.b.a.n();
                    lru0 lru0Var = (lru0) map.get(jVar2);
                    lru0Var.getClass();
                    jVar2.C(t(n2, lru0Var.f()));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        List list = this.B;
        ArrayList arrayList2 = se7Var.b;
        LinkedHashSet linkedHashSet = se7Var.a;
        ArrayList F = F(arrayList2, list);
        ArrayList arrayList3 = new ArrayList(linkedHashSet);
        arrayList3.removeAll(arrayList2);
        ArrayList F2 = F(arrayList3, F);
        if (!F2.isEmpty()) {
            F2.toString();
            sgb1.g(5, "CameraUseCaseAdapter");
        }
        Iterator it3 = se7Var.e.iterator();
        while (it3.hasNext()) {
            ((j) it3.next()).F(this.a);
        }
        this.a.h(se7Var.e);
        if (this.b != null) {
            Iterator it4 = se7Var.e.iterator();
            while (it4.hasNext()) {
                j jVar3 = (j) it4.next();
                h70 h70Var = this.b;
                Objects.requireNonNull(h70Var);
                jVar3.F(h70Var);
            }
            h70 h70Var2 = this.b;
            Objects.requireNonNull(h70Var2);
            h70Var2.h(se7Var.e);
        }
        if (se7Var.e.isEmpty()) {
            Iterator it5 = se7Var.d.iterator();
            while (it5.hasNext()) {
                j jVar4 = (j) it5.next();
                Map map2 = se7Var.i.a;
                if (map2.containsKey(jVar4)) {
                    lru0 lru0Var2 = (lru0) map2.get(jVar4);
                    Objects.requireNonNull(lru0Var2);
                    szd d = lru0Var2.d();
                    if (d != null) {
                        jyq0 jyq0Var = jVar4.o;
                        szd d2 = lru0Var2.d();
                        ug70 ug70Var = jyq0Var.g.b;
                        Objects.requireNonNull(d2);
                        if (d2.h().size() == jyq0Var.g.b.h().size()) {
                            for (x34 x34Var : d2.h()) {
                                if (ug70Var.a.containsKey(x34Var) && Objects.equals(ug70Var.f(x34Var), d2.f(x34Var))) {
                                }
                            }
                        }
                        jVar4.i = jVar4.z(d);
                        if (this.F) {
                            this.a.e(jVar4);
                            h70 h70Var3 = this.b;
                            if (h70Var3 != null) {
                                h70Var3.e(jVar4);
                            }
                        }
                    }
                }
            }
        }
        Iterator it6 = se7Var.c.iterator();
        while (it6.hasNext()) {
            j jVar5 = (j) it6.next();
            pt7 pt7Var = (pt7) se7Var.h.get(jVar5);
            Objects.requireNonNull(pt7Var);
            h70 h70Var4 = this.b;
            h70 h70Var5 = this.a;
            xi21 xi21Var = pt7Var.a;
            if (h70Var4 != null) {
                jVar5.b(h70Var5, h70Var4, xi21Var, pt7Var.b);
                lru0 lru0Var3 = (lru0) se7Var.i.a.get(jVar5);
                lru0Var3.getClass();
                mru0 mru0Var = se7Var.j;
                mru0Var.getClass();
                jVar5.i = jVar5.A(lru0Var3, (lru0) mru0Var.a.get(jVar5));
            } else {
                jVar5.b(h70Var5, null, xi21Var, pt7Var.b);
                lru0 lru0Var4 = (lru0) se7Var.i.a.get(jVar5);
                lru0Var4.getClass();
                jVar5.i = jVar5.A(lru0Var4, null);
            }
        }
        if (this.F) {
            this.a.o(se7Var.c);
            h70 h70Var6 = this.b;
            if (h70Var6 != null) {
                h70Var6.o(se7Var.c);
            }
        }
        Iterator it7 = se7Var.c.iterator();
        while (it7.hasNext()) {
            ((j) it7.next()).t();
        }
        this.x.clear();
        this.x.addAll(se7Var.a);
        this.y.clear();
        this.y.addAll(se7Var.b);
        this.H = se7Var.g;
        this.I = se7Var.f;
    }

    public final void r() {
        synchronized (this.E) {
            try {
                if (!this.F) {
                    if (!this.y.isEmpty()) {
                        this.a.d(this.D);
                        h70 h70Var = this.b;
                        if (h70Var != null) {
                            h70Var.d(this.D);
                        }
                    }
                    this.a.o(this.y);
                    h70 h70Var2 = this.b;
                    if (h70Var2 != null) {
                        h70Var2.o(this.y);
                    }
                    synchronized (this.E) {
                        try {
                            szd szdVar = this.G;
                            if (szdVar != null) {
                                this.a.c.c(szdVar);
                            }
                        } finally {
                        }
                    }
                    Iterator it = this.y.iterator();
                    while (it.hasNext()) {
                        ((j) it.next()).t();
                    }
                    this.F = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:102:0x0178, code lost:
    
        if (r7 != false) goto L109;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final se7 s(LinkedHashSet linkedHashSet, boolean z) {
        iru0 iru0Var;
        boolean z2;
        boolean z3;
        j jVar;
        mru0 mru0Var;
        boolean z4;
        boolean z5;
        if (z()) {
            Iterator it = linkedHashSet.iterator();
            while (it.hasNext()) {
                q8n o = ((j) it.next()).h.o();
                boolean z6 = o.b == 10;
                int i = o.a;
                boolean z7 = (i == 1 || i == 0) ? false : true;
                if (z6 || z7) {
                    ny61.g("Extensions are only supported for use with standard dynamic range.");
                    return null;
                }
            }
            if (A(linkedHashSet)) {
                ny61.g("Extensions are not supported for use with Raw image capture.");
                return null;
            }
        }
        synchronized (this.E) {
            try {
                if (!this.B.isEmpty()) {
                    Iterator it2 = linkedHashSet.iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            j jVar2 = (j) it2.next();
                            if (jVar2 instanceof w8v) {
                                xi21 xi21Var = jVar2.h;
                                x34 x34Var = x8v.y;
                                if (xi21Var.d(x34Var)) {
                                    Integer num = (Integer) xi21Var.f(x34Var);
                                    num.getClass();
                                    if (num.intValue() == 1) {
                                        break;
                                    }
                                } else {
                                    continue;
                                }
                            }
                        } else if (!A(linkedHashSet)) {
                        }
                    }
                    throw new IllegalArgumentException("Ultra HDR image and Raw capture does not support for use with CameraEffect.");
                }
            } finally {
            }
        }
        if (!z) {
            if (!z() || !B(linkedHashSet)) {
                kru0 kru0Var = this.L;
                String c = this.a.b.a.c();
                if (kru0Var.a != null) {
                    HashSet hashSet = ImageCaptureFailedForSpecificCombinationQuirk.a;
                    String str = Build.BRAND;
                    if ("oneplus".equalsIgnoreCase(str)) {
                    }
                } else if (kru0Var.b != null && "motorola".equalsIgnoreCase(Build.BRAND) && "moto e20".equalsIgnoreCase(Build.MODEL) && c.equals("0") && linkedHashSet.size() == 2) {
                    if (!linkedHashSet.isEmpty()) {
                        Iterator it3 = linkedHashSet.iterator();
                        while (it3.hasNext()) {
                            if (((j) it3.next()) instanceof g) {
                                z4 = true;
                                break;
                            }
                        }
                    }
                    z4 = false;
                    if (!linkedHashSet.isEmpty()) {
                        Iterator it4 = linkedHashSet.iterator();
                        while (it4.hasNext()) {
                            j jVar3 = (j) it4.next();
                            if (jVar3.h.d(xi21.t4) && jVar3.h.y() == UseCaseConfigFactory$CaptureType.VIDEO_CAPTURE) {
                                z5 = true;
                                break;
                            }
                        }
                    }
                    z5 = false;
                    if (z4) {
                    }
                }
            }
            return s(linkedHashSet, true);
        }
        synchronized (this.E) {
            try {
                HashSet x = x(linkedHashSet, z);
                if (x.size() >= 2 || (z() && B(x))) {
                    iru0 iru0Var2 = this.I;
                    if (iru0Var2 == null || !iru0Var2.r.a.equals(x)) {
                        int[] iArr = {1, 2, 4};
                        HashSet hashSet2 = new HashSet();
                        Iterator it5 = x.iterator();
                        loop8: while (true) {
                            if (!it5.hasNext()) {
                                iru0Var = new iru0(this.a, this.b, this.J, this.K, x, this.c);
                                break;
                            }
                            j jVar4 = (j) it5.next();
                            for (int i2 = 0; i2 < 3; i2++) {
                                int i3 = iArr[i2];
                                Iterator it6 = jVar4.m().iterator();
                                while (true) {
                                    if (!it6.hasNext()) {
                                        z2 = false;
                                        break;
                                    }
                                    int intValue = ((Integer) it6.next()).intValue();
                                    if ((i3 & intValue) == intValue) {
                                        z2 = true;
                                        break;
                                    }
                                }
                                if (z2) {
                                    if (hashSet2.contains(Integer.valueOf(i3))) {
                                        iru0Var = null;
                                        break loop8;
                                    }
                                    hashSet2.add(Integer.valueOf(i3));
                                }
                            }
                        }
                    } else {
                        iru0 iru0Var3 = this.I;
                        iru0Var3.getClass();
                        HashSet hashSet3 = ((j) x.iterator().next()).g;
                        iru0Var3.g = hashSet3 != null ? new HashSet(hashSet3) : null;
                        iru0Var = this.I;
                        Objects.requireNonNull(iru0Var);
                    }
                }
                iru0Var = null;
            } finally {
            }
        }
        synchronized (this.E) {
            try {
                ArrayList arrayList = new ArrayList(linkedHashSet);
                if (iru0Var != null) {
                    arrayList.add(iru0Var);
                    arrayList.removeAll(iru0Var.r.a);
                }
                synchronized (this.E) {
                    z3 = ((Integer) this.D.g(jp7.l1, 0)).intValue() == 1;
                }
                if (z3) {
                    Iterator it7 = arrayList.iterator();
                    boolean z8 = false;
                    boolean z9 = false;
                    while (it7.hasNext()) {
                        j jVar5 = (j) it7.next();
                        if (!(jVar5 instanceof g) && !(jVar5 instanceof iru0)) {
                            if (jVar5 instanceof w8v) {
                                z8 = true;
                            }
                        }
                        z9 = true;
                    }
                    if (!z8 || z9) {
                        Iterator it8 = arrayList.iterator();
                        boolean z10 = false;
                        boolean z11 = false;
                        while (it8.hasNext()) {
                            j jVar6 = (j) it8.next();
                            if (!(jVar6 instanceof g) && !(jVar6 instanceof iru0)) {
                                if (jVar6 instanceof w8v) {
                                    z11 = true;
                                }
                            }
                            z10 = true;
                        }
                        if (z10 && !z11) {
                            j jVar7 = this.H;
                            if (!(jVar7 instanceof w8v)) {
                                q8v q8vVar = new q8v();
                                q8vVar.a.w(max0.e4, "ImageCapture-Extra");
                                jVar = q8vVar.f();
                            }
                        }
                    } else {
                        j jVar8 = this.H;
                        if (!(jVar8 instanceof g)) {
                            pxe0 pxe0Var = new pxe0();
                            pxe0Var.a.w(max0.e4, "Preview-Extra");
                            g f = pxe0Var.f();
                            f.J(new vm7(8));
                            jVar = f;
                        }
                    }
                }
                jVar = null;
            } finally {
            }
        }
        ArrayList arrayList2 = new ArrayList(linkedHashSet);
        if (jVar != null) {
            arrayList2.add(jVar);
        }
        if (iru0Var != null) {
            arrayList2.add(iru0Var);
            arrayList2.removeAll(iru0Var.r.a);
        }
        ArrayList arrayList3 = new ArrayList(arrayList2);
        arrayList3.removeAll(this.y);
        ArrayList arrayList4 = new ArrayList(arrayList2);
        arrayList4.retainAll(this.y);
        ArrayList arrayList5 = new ArrayList(this.y);
        arrayList5.removeAll(arrayList2);
        HashMap w = w(arrayList3, (zi21) this.D.g(jp7.j1, zi21.a), this.c, this.C);
        List[] listArr = {arrayList3, arrayList4};
        boolean z12 = false;
        for (int i4 = 0; i4 < 2; i4++) {
            Iterator it9 = listArr[i4].iterator();
            while (true) {
                if (!it9.hasNext()) {
                    break;
                }
                if (((j) it9.next()).g != null) {
                    z12 = true;
                    break;
                }
            }
            if (z12) {
                break;
            }
        }
        boolean z13 = z12;
        try {
            mru0 i5 = this.M.i(v(), this.a.b, arrayList3, arrayList4, this.D, this.C, z13);
            if (this.b != null) {
                hhs0 hhs0Var = this.M;
                int v = v();
                h70 h70Var = this.b;
                Objects.requireNonNull(h70Var);
                mru0Var = hhs0Var.i(v, h70Var.b, arrayList3, arrayList4, this.D, this.C, z13);
            } else {
                mru0Var = null;
            }
            return new se7(linkedHashSet, arrayList2, arrayList3, arrayList4, arrayList5, iru0Var, jVar, w, i5, mru0Var);
        } catch (IllegalArgumentException e) {
            if (z || z() || this.b != null) {
                throw e;
            }
            return s(linkedHashSet, true);
        }
    }

    public final void u() {
        synchronized (this.E) {
            try {
                if (this.F) {
                    this.a.h(new ArrayList(this.y));
                    h70 h70Var = this.b;
                    if (h70Var != null) {
                        h70Var.h(new ArrayList(this.y));
                    }
                    synchronized (this.E) {
                        e70 e70Var = this.a.c;
                        this.G = e70Var.b.o();
                        e70Var.p();
                    }
                    this.F = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final int v() {
        synchronized (this.E) {
            try {
                return this.z.b() == 2 ? 1 : 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final HashSet x(LinkedHashSet linkedHashSet, boolean z) {
        int i;
        HashSet hashSet = new HashSet();
        synchronized (this.E) {
            Iterator it = this.B.iterator();
            if (it.hasNext()) {
                if (it.next() == null) {
                    throw null;
                }
                throw new ClassCastException();
            }
            i = z ? 3 : 0;
        }
        Iterator it2 = linkedHashSet.iterator();
        while (it2.hasNext()) {
            j jVar = (j) it2.next();
            d6z.m("Only support one level of sharing for now.", !(jVar instanceof iru0));
            Iterator it3 = jVar.m().iterator();
            while (true) {
                if (it3.hasNext()) {
                    int intValue = ((Integer) it3.next()).intValue();
                    if ((i & intValue) == intValue) {
                        hashSet.add(jVar);
                        break;
                    }
                }
            }
        }
        return hashSet;
    }

    public final List y() {
        ArrayList arrayList;
        synchronized (this.E) {
            arrayList = new ArrayList(this.x);
        }
        return arrayList;
    }

    public final boolean z() {
        boolean z;
        synchronized (this.E) {
            z = this.D.u() != null;
        }
        return z;
    }
}
