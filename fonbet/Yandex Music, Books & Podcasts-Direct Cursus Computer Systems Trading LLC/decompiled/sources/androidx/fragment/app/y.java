package androidx.fragment.app;

import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Looper;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.app.v0;
import androidx.core.app.w0;
import defpackage.auc;
import defpackage.bjt;
import defpackage.cuc;
import defpackage.dzf;
import defpackage.ei;
import defpackage.ern;
import defpackage.euc;
import defpackage.f1d;
import defpackage.fi;
import defpackage.fuc;
import defpackage.gs6;
import defpackage.gsg;
import defpackage.hrg;
import defpackage.jfu;
import defpackage.ji;
import defpackage.jxh;
import defpackage.k5r;
import defpackage.kac;
import defpackage.kfu;
import defpackage.lm4;
import defpackage.ltc;
import defpackage.lyf;
import defpackage.muc;
import defpackage.nnk;
import defpackage.nyf;
import defpackage.otc;
import defpackage.ouj;
import defpackage.ptc;
import defpackage.q9;
import defpackage.qpj;
import defpackage.rj7;
import defpackage.rpj;
import defpackage.rtc;
import defpackage.rwd;
import defpackage.s40;
import defpackage.stc;
import defpackage.su4;
import defpackage.tpj;
import defpackage.ttc;
import defpackage.tuc;
import defpackage.uoo;
import defpackage.utc;
import defpackage.vh;
import defpackage.vtc;
import defpackage.wj3;
import defpackage.woo;
import defpackage.wqj;
import defpackage.wvs;
import defpackage.xq0;
import defpackage.xtc;
import defpackage.ym5;
import defpackage.ytc;
import defpackage.zi2;
import defpackage.ztc;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import ru.yandex.music.R;

/* loaded from: classes.dex */
public abstract class y {
    public o A;
    public otc B;
    public final wj3 C;
    public final rwd D;
    public ei E;
    public ei F;
    public ei G;
    public ArrayDeque H;
    public boolean I;
    public boolean J;
    public boolean K;
    public boolean L;
    public boolean M;
    public ArrayList N;
    public ArrayList O;
    public ArrayList P;
    public z Q;
    public final q9 R;
    public boolean b;
    public ArrayList e;
    public qpj g;
    public final nnk p;
    public final CopyOnWriteArrayList q;
    public final rtc r;
    public final rtc s;
    public final rtc t;
    public final rtc u;
    public final ttc v;
    public int w;
    public ptc x;
    public ltc y;
    public o z;
    public final ArrayList a = new ArrayList();
    public final c0 c = new c0();
    public ArrayList d = new ArrayList();
    public final v f = new v(this);
    public a h = null;
    public boolean i = false;
    public final w j = new w(this);
    public final AtomicInteger k = new AtomicInteger();
    public final Map l = Collections.synchronizedMap(new HashMap());
    public final Map m = Collections.synchronizedMap(new HashMap());
    public final Map n = Collections.synchronizedMap(new HashMap());
    public final ArrayList o = new ArrayList();

    public y() {
        nnk nnkVar = new nnk();
        nnkVar.a = this;
        nnkVar.b = new CopyOnWriteArrayList();
        this.p = nnkVar;
        this.q = new CopyOnWriteArrayList();
        this.r = new rtc(0, this);
        this.s = new rtc(1, this);
        this.t = new rtc(2, this);
        this.u = new rtc(3, this);
        this.v = new ttc(this);
        this.w = -1;
        this.B = null;
        this.C = new wj3(4, this);
        this.D = new rwd(23);
        this.H = new ArrayDeque();
        this.R = new q9(29, this);
    }

    public static HashSet F(a aVar) {
        HashSet hashSet = new HashSet();
        for (int i = 0; i < aVar.c.size(); i++) {
            o oVar = ((tuc) aVar.c.get(i)).b;
            if (oVar != null && aVar.i) {
                hashSet.add(oVar);
            }
        }
        return hashSet;
    }

    public static boolean M(int i) {
        return Log.isLoggable("FragmentManager", i);
    }

    public static boolean N(o oVar) {
        if (oVar.mHasMenu && oVar.mMenuVisible) {
            return true;
        }
        Iterator it = oVar.mChildFragmentManager.c.e().iterator();
        boolean z = false;
        while (it.hasNext()) {
            o oVar2 = (o) it.next();
            if (oVar2 != null) {
                z = N(oVar2);
            }
            if (z) {
                return true;
            }
        }
        return false;
    }

    public static boolean P(o oVar) {
        if (oVar == null) {
            return true;
        }
        y yVar = oVar.mFragmentManager;
        return oVar.equals(yVar.A) && P(yVar.z);
    }

    public static void j0(o oVar) {
        if (M(2)) {
            Log.v("FragmentManager", "show: " + oVar);
        }
        if (oVar.mHidden) {
            oVar.mHidden = false;
            oVar.mHiddenChanged = !oVar.mHiddenChanged;
        }
    }

    public final void A(a aVar, boolean z) {
        if (z && (this.x == null || this.L)) {
            return;
        }
        y(z);
        a aVar2 = this.h;
        if (aVar2 != null) {
            aVar2.u = false;
            aVar2.i();
            if (M(3)) {
                Log.d("FragmentManager", "Reversing mTransitioningOp " + this.h + " as part of execSingleAction for action " + aVar);
            }
            this.h.k(false, false);
            this.h.a(this.N, this.O);
            Iterator it = this.h.c.iterator();
            while (it.hasNext()) {
                o oVar = ((tuc) it.next()).b;
                if (oVar != null) {
                    oVar.mTransitioning = false;
                }
            }
            this.h = null;
        }
        aVar.a(this.N, this.O);
        this.b = true;
        try {
            Z(this.N, this.O);
            d();
            l0();
            boolean z2 = this.M;
            c0 c0Var = this.c;
            if (z2) {
                this.M = false;
                Iterator it2 = c0Var.d().iterator();
                while (it2.hasNext()) {
                    b0 b0Var = (b0) it2.next();
                    o oVar2 = b0Var.c;
                    if (oVar2.mDeferStart) {
                        if (this.b) {
                            this.M = true;
                        } else {
                            oVar2.mDeferStart = false;
                            b0Var.k();
                        }
                    }
                }
            }
            c0Var.b.values().removeAll(Collections.singleton(null));
        } catch (Throwable th) {
            d();
            throw th;
        }
    }

    public final void B(int i, int i2, ArrayList arrayList, ArrayList arrayList2) {
        int i3;
        boolean z;
        int i4;
        boolean z2;
        int i5;
        int i6;
        boolean z3;
        int i7;
        int i8;
        int i9 = i;
        boolean z4 = ((a) arrayList.get(i9)).r;
        ArrayList arrayList3 = this.P;
        if (arrayList3 == null) {
            this.P = new ArrayList();
        } else {
            arrayList3.clear();
        }
        ArrayList arrayList4 = this.P;
        c0 c0Var = this.c;
        arrayList4.addAll(c0Var.f());
        o oVar = this.A;
        int i10 = i9;
        boolean z5 = false;
        while (true) {
            int i11 = 1;
            if (i10 >= i2) {
                boolean z6 = z4;
                boolean z7 = z5;
                this.P.clear();
                if (!z6 && this.w >= 1) {
                    for (int i12 = i9; i12 < i2; i12++) {
                        Iterator it = ((a) arrayList.get(i12)).c.iterator();
                        while (it.hasNext()) {
                            o oVar2 = ((tuc) it.next()).b;
                            if (oVar2 != null && oVar2.mFragmentManager != null) {
                                c0Var.g(g(oVar2));
                            }
                        }
                    }
                }
                int i13 = i9;
                while (i13 < i2) {
                    a aVar = (a) arrayList.get(i13);
                    if (!((Boolean) arrayList2.get(i13)).booleanValue()) {
                        aVar.h(1);
                        y yVar = aVar.t;
                        ArrayList arrayList5 = aVar.c;
                        int size = arrayList5.size();
                        int i14 = 0;
                        while (i14 < size) {
                            tuc tucVar = (tuc) arrayList5.get(i14);
                            o oVar3 = tucVar.b;
                            if (oVar3 != null) {
                                oVar3.mBeingSaved = false;
                                oVar3.setPopDirection(false);
                                oVar3.setNextTransition(aVar.h);
                                oVar3.setSharedElementNames(aVar.p, aVar.q);
                            }
                            switch (tucVar.a) {
                                case 1:
                                    i3 = i13;
                                    oVar3.setAnimations(tucVar.d, tucVar.e, tucVar.f, tucVar.g);
                                    yVar.d0(oVar3, false);
                                    yVar.a(oVar3);
                                    i14++;
                                    i13 = i3;
                                case 2:
                                default:
                                    kac.c(tucVar.a, "Unknown cmd: ");
                                    break;
                                case 3:
                                    i3 = i13;
                                    oVar3.setAnimations(tucVar.d, tucVar.e, tucVar.f, tucVar.g);
                                    yVar.Y(oVar3);
                                    i14++;
                                    i13 = i3;
                                case 4:
                                    i3 = i13;
                                    oVar3.setAnimations(tucVar.d, tucVar.e, tucVar.f, tucVar.g);
                                    yVar.L(oVar3);
                                    i14++;
                                    i13 = i3;
                                case 5:
                                    i3 = i13;
                                    oVar3.setAnimations(tucVar.d, tucVar.e, tucVar.f, tucVar.g);
                                    yVar.d0(oVar3, false);
                                    j0(oVar3);
                                    i14++;
                                    i13 = i3;
                                case 6:
                                    i3 = i13;
                                    oVar3.setAnimations(tucVar.d, tucVar.e, tucVar.f, tucVar.g);
                                    yVar.h(oVar3);
                                    i14++;
                                    i13 = i3;
                                case 7:
                                    i3 = i13;
                                    oVar3.setAnimations(tucVar.d, tucVar.e, tucVar.f, tucVar.g);
                                    yVar.d0(oVar3, false);
                                    yVar.c(oVar3);
                                    i14++;
                                    i13 = i3;
                                case 8:
                                    yVar.h0(oVar3);
                                    i3 = i13;
                                    i14++;
                                    i13 = i3;
                                case 9:
                                    yVar.h0(null);
                                    i3 = i13;
                                    i14++;
                                    i13 = i3;
                                case 10:
                                    yVar.g0(oVar3, tucVar.i);
                                    i3 = i13;
                                    i14++;
                                    i13 = i3;
                            }
                            return;
                        }
                    }
                    aVar.h(-1);
                    y yVar2 = aVar.t;
                    ArrayList arrayList6 = aVar.c;
                    boolean z8 = true;
                    for (int size2 = arrayList6.size() - 1; size2 >= 0; size2--) {
                        tuc tucVar2 = (tuc) arrayList6.get(size2);
                        o oVar4 = tucVar2.b;
                        if (oVar4 != null) {
                            oVar4.mBeingSaved = false;
                            oVar4.setPopDirection(z8);
                            int i15 = aVar.h;
                            int i16 = 8194;
                            int i17 = 4097;
                            if (i15 != 4097) {
                                if (i15 != 8194) {
                                    i16 = 4100;
                                    if (i15 != 8197) {
                                        i17 = 4099;
                                        if (i15 != 4099) {
                                            i16 = i15 != 4100 ? 0 : 8197;
                                        }
                                    }
                                }
                                i16 = i17;
                            }
                            oVar4.setNextTransition(i16);
                            oVar4.setSharedElementNames(aVar.q, aVar.p);
                        }
                        switch (tucVar2.a) {
                            case 1:
                                oVar4.setAnimations(tucVar2.d, tucVar2.e, tucVar2.f, tucVar2.g);
                                z8 = true;
                                yVar2.d0(oVar4, true);
                                yVar2.Y(oVar4);
                            case 2:
                            default:
                                kac.c(tucVar2.a, "Unknown cmd: ");
                                break;
                            case 3:
                                oVar4.setAnimations(tucVar2.d, tucVar2.e, tucVar2.f, tucVar2.g);
                                yVar2.a(oVar4);
                                z8 = true;
                            case 4:
                                oVar4.setAnimations(tucVar2.d, tucVar2.e, tucVar2.f, tucVar2.g);
                                yVar2.getClass();
                                j0(oVar4);
                                z8 = true;
                            case 5:
                                oVar4.setAnimations(tucVar2.d, tucVar2.e, tucVar2.f, tucVar2.g);
                                yVar2.d0(oVar4, true);
                                yVar2.L(oVar4);
                                z8 = true;
                            case 6:
                                oVar4.setAnimations(tucVar2.d, tucVar2.e, tucVar2.f, tucVar2.g);
                                yVar2.c(oVar4);
                                z8 = true;
                            case 7:
                                oVar4.setAnimations(tucVar2.d, tucVar2.e, tucVar2.f, tucVar2.g);
                                yVar2.d0(oVar4, true);
                                yVar2.h(oVar4);
                                z8 = true;
                            case 8:
                                yVar2.h0(null);
                                z8 = true;
                            case 9:
                                yVar2.h0(oVar4);
                                z8 = true;
                            case 10:
                                yVar2.g0(oVar4, tucVar2.h);
                                z8 = true;
                        }
                        return;
                    }
                    i13++;
                }
                boolean booleanValue = ((Boolean) arrayList2.get(i2 - 1)).booleanValue();
                ArrayList arrayList7 = this.o;
                if (z7 && !arrayList7.isEmpty()) {
                    LinkedHashSet linkedHashSet = new LinkedHashSet();
                    Iterator it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        linkedHashSet.addAll(F((a) it2.next()));
                    }
                    if (this.h == null) {
                        Iterator it3 = arrayList7.iterator();
                        while (it3.hasNext()) {
                            ytc ytcVar = (ytc) it3.next();
                            Iterator it4 = linkedHashSet.iterator();
                            while (it4.hasNext()) {
                                ytcVar.onBackStackChangeStarted((o) it4.next(), booleanValue);
                            }
                        }
                        Iterator it5 = arrayList7.iterator();
                        while (it5.hasNext()) {
                            ytc ytcVar2 = (ytc) it5.next();
                            Iterator it6 = linkedHashSet.iterator();
                            while (it6.hasNext()) {
                                ytcVar2.onBackStackChangeCommitted((o) it6.next(), booleanValue);
                            }
                        }
                    }
                }
                for (int i18 = i9; i18 < i2; i18++) {
                    a aVar2 = (a) arrayList.get(i18);
                    if (booleanValue) {
                        for (int size3 = aVar2.c.size() - 1; size3 >= 0; size3--) {
                            o oVar5 = ((tuc) aVar2.c.get(size3)).b;
                            if (oVar5 != null) {
                                g(oVar5).k();
                            }
                        }
                    } else {
                        Iterator it7 = aVar2.c.iterator();
                        while (it7.hasNext()) {
                            o oVar6 = ((tuc) it7.next()).b;
                            if (oVar6 != null) {
                                g(oVar6).k();
                            }
                        }
                    }
                }
                R(this.w, true);
                Iterator it8 = f(arrayList, i9, i2).iterator();
                while (it8.hasNext()) {
                    h hVar = (h) it8.next();
                    hVar.e = booleanValue;
                    hVar.l();
                    hVar.e();
                }
                while (i9 < i2) {
                    a aVar3 = (a) arrayList.get(i9);
                    if (((Boolean) arrayList2.get(i9)).booleanValue() && aVar3.v >= 0) {
                        aVar3.v = -1;
                    }
                    if (aVar3.s != null) {
                        for (int i19 = 0; i19 < aVar3.s.size(); i19++) {
                            ((Runnable) aVar3.s.get(i19)).run();
                        }
                        aVar3.s = null;
                    }
                    i9++;
                }
                if (z7) {
                    for (int i20 = 0; i20 < arrayList7.size(); i20++) {
                        ((ytc) arrayList7.get(i20)).onBackStackChanged();
                    }
                    return;
                }
                return;
            }
            a aVar4 = (a) arrayList.get(i10);
            boolean booleanValue2 = ((Boolean) arrayList2.get(i10)).booleanValue();
            ArrayList arrayList8 = this.P;
            if (booleanValue2) {
                z = z4;
                i4 = i10;
                z2 = z5;
                int i21 = 1;
                ArrayList arrayList9 = aVar4.c;
                int size4 = arrayList9.size() - 1;
                while (size4 >= 0) {
                    tuc tucVar3 = (tuc) arrayList9.get(size4);
                    int i22 = tucVar3.a;
                    if (i22 != i21) {
                        if (i22 != 3) {
                            switch (i22) {
                                case 8:
                                    oVar = null;
                                    break;
                                case 9:
                                    oVar = tucVar3.b;
                                    break;
                                case 10:
                                    tucVar3.i = tucVar3.h;
                                    break;
                            }
                            size4--;
                            i21 = 1;
                        }
                        arrayList8.add(tucVar3.b);
                        size4--;
                        i21 = 1;
                    }
                    arrayList8.remove(tucVar3.b);
                    size4--;
                    i21 = 1;
                }
            } else {
                ArrayList arrayList10 = aVar4.c;
                int i23 = 0;
                while (i23 < arrayList10.size()) {
                    tuc tucVar4 = (tuc) arrayList10.get(i23);
                    boolean z9 = z4;
                    int i24 = tucVar4.a;
                    if (i24 != i11) {
                        i5 = i10;
                        if (i24 != 2) {
                            if (i24 == 3 || i24 == 6) {
                                arrayList8.remove(tucVar4.b);
                                o oVar7 = tucVar4.b;
                                if (oVar7 == oVar) {
                                    arrayList10.add(i23, new tuc(oVar7, 9));
                                    i23++;
                                    z3 = z5;
                                    oVar = null;
                                    i6 = 1;
                                }
                            } else if (i24 == 7) {
                                i6 = 1;
                            } else if (i24 == 8) {
                                arrayList10.add(i23, new tuc(9, oVar, 0));
                                tucVar4.c = true;
                                i23++;
                                oVar = tucVar4.b;
                            }
                            z3 = z5;
                            i6 = 1;
                        } else {
                            o oVar8 = tucVar4.b;
                            int i25 = oVar8.mContainerId;
                            int size5 = arrayList8.size() - 1;
                            boolean z10 = false;
                            while (size5 >= 0) {
                                int i26 = size5;
                                o oVar9 = (o) arrayList8.get(size5);
                                boolean z11 = z5;
                                if (oVar9.mContainerId != i25) {
                                    i7 = i25;
                                } else if (oVar9 == oVar8) {
                                    i7 = i25;
                                    z10 = true;
                                } else {
                                    if (oVar9 == oVar) {
                                        i7 = i25;
                                        i8 = 0;
                                        arrayList10.add(i23, new tuc(9, oVar9, 0));
                                        i23++;
                                        oVar = null;
                                    } else {
                                        i7 = i25;
                                        i8 = 0;
                                    }
                                    tuc tucVar5 = new tuc(3, oVar9, i8);
                                    tucVar5.d = tucVar4.d;
                                    tucVar5.f = tucVar4.f;
                                    tucVar5.e = tucVar4.e;
                                    tucVar5.g = tucVar4.g;
                                    arrayList10.add(i23, tucVar5);
                                    arrayList8.remove(oVar9);
                                    i23++;
                                    oVar = oVar;
                                }
                                size5 = i26 - 1;
                                i25 = i7;
                                z5 = z11;
                            }
                            z3 = z5;
                            i6 = 1;
                            if (z10) {
                                arrayList10.remove(i23);
                                i23--;
                            } else {
                                tucVar4.a = 1;
                                tucVar4.c = true;
                                arrayList8.add(oVar8);
                            }
                        }
                        i23 += i6;
                        i11 = i6;
                        z4 = z9;
                        i10 = i5;
                        z5 = z3;
                    } else {
                        i5 = i10;
                        i6 = i11;
                    }
                    z3 = z5;
                    arrayList8.add(tucVar4.b);
                    i23 += i6;
                    i11 = i6;
                    z4 = z9;
                    i10 = i5;
                    z5 = z3;
                }
                z = z4;
                i4 = i10;
                z2 = z5;
            }
            z5 = z2 || aVar4.i;
            i10 = i4 + 1;
            z4 = z;
        }
    }

    public final o C(int i) {
        c0 c0Var = this.c;
        ArrayList arrayList = c0Var.a;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            o oVar = (o) arrayList.get(size);
            if (oVar != null && oVar.mFragmentId == i) {
                return oVar;
            }
        }
        for (b0 b0Var : c0Var.b.values()) {
            if (b0Var != null) {
                o oVar2 = b0Var.c;
                if (oVar2.mFragmentId == i) {
                    return oVar2;
                }
            }
        }
        return null;
    }

    public final o D(String str) {
        c0 c0Var = this.c;
        ArrayList arrayList = c0Var.a;
        if (str != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                o oVar = (o) arrayList.get(size);
                if (oVar != null && str.equals(oVar.mTag)) {
                    return oVar;
                }
            }
        }
        if (str == null) {
            return null;
        }
        for (b0 b0Var : c0Var.b.values()) {
            if (b0Var != null) {
                o oVar2 = b0Var.c;
                if (str.equals(oVar2.mTag)) {
                    return oVar2;
                }
            }
        }
        return null;
    }

    public final void E() {
        Iterator it = e().iterator();
        while (it.hasNext()) {
            h hVar = (h) it.next();
            if (hVar.f) {
                if (M(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: Forcing postponed operations");
                }
                hVar.f = false;
                hVar.e();
            }
        }
    }

    public final a G(int i) {
        if (i != this.d.size()) {
            return (a) this.d.get(i);
        }
        a aVar = this.h;
        if (aVar != null) {
            return aVar;
        }
        rj7.m();
        return null;
    }

    public final int H() {
        return this.d.size() + (this.h != null ? 1 : 0);
    }

    public final ViewGroup I(o oVar) {
        ViewGroup viewGroup = oVar.mContainer;
        if (viewGroup != null) {
            return viewGroup;
        }
        if (oVar.mContainerId <= 0 || !this.y.c()) {
            return null;
        }
        View b = this.y.b(oVar.mContainerId);
        if (b instanceof ViewGroup) {
            return (ViewGroup) b;
        }
        return null;
    }

    public final otc J() {
        otc otcVar = this.B;
        if (otcVar != null) {
            return otcVar;
        }
        o oVar = this.z;
        return oVar != null ? oVar.mFragmentManager.J() : this.C;
    }

    public final rwd K() {
        o oVar = this.z;
        return oVar != null ? oVar.mFragmentManager.K() : this.D;
    }

    public final void L(o oVar) {
        if (M(2)) {
            Log.v("FragmentManager", "hide: " + oVar);
        }
        if (oVar.mHidden) {
            return;
        }
        oVar.mHidden = true;
        oVar.mHiddenChanged = true ^ oVar.mHiddenChanged;
        i0(oVar);
    }

    public final boolean O() {
        o oVar = this.z;
        if (oVar == null) {
            return true;
        }
        return oVar.isAdded() && this.z.getParentFragmentManager().O();
    }

    public final boolean Q() {
        return this.J || this.K;
    }

    public final void R(int i, boolean z) {
        ptc ptcVar;
        if (this.x == null && i != -1) {
            xq0.q("No activity");
            return;
        }
        if (z || i != this.w) {
            this.w = i;
            c0 c0Var = this.c;
            HashMap hashMap = c0Var.b;
            Iterator it = c0Var.a.iterator();
            while (it.hasNext()) {
                b0 b0Var = (b0) hashMap.get(((o) it.next()).mWho);
                if (b0Var != null) {
                    b0Var.k();
                }
            }
            for (b0 b0Var2 : hashMap.values()) {
                if (b0Var2 != null) {
                    b0Var2.k();
                    o oVar = b0Var2.c;
                    if (oVar.mRemoving && !oVar.isInBackStack()) {
                        if (oVar.mBeingSaved && !c0Var.c.containsKey(oVar.mWho)) {
                            c0Var.i(b0Var2.n(), oVar.mWho);
                        }
                        c0Var.h(b0Var2);
                    }
                }
            }
            Iterator it2 = c0Var.d().iterator();
            while (it2.hasNext()) {
                b0 b0Var3 = (b0) it2.next();
                o oVar2 = b0Var3.c;
                if (oVar2.mDeferStart) {
                    if (this.b) {
                        this.M = true;
                    } else {
                        oVar2.mDeferStart = false;
                        b0Var3.k();
                    }
                }
            }
            if (this.I && (ptcVar = this.x) != null && this.w == 7) {
                ((s) ptcVar).e.invalidateMenu();
                this.I = false;
            }
        }
    }

    public final void S() {
        if (this.x == null) {
            return;
        }
        this.J = false;
        this.K = false;
        this.Q.p = false;
        for (o oVar : this.c.f()) {
            if (oVar != null) {
                oVar.noteStateNotSaved();
            }
        }
    }

    public final void T() {
        x(new auc(this, null, -1, 0), false);
    }

    public final void U(int i, boolean z) {
        if (i >= 0) {
            x(new auc(this, null, i, 1), z);
        } else {
            xq0.x(k5r.i(i, "Bad id: "));
        }
    }

    public final boolean V() {
        return W(-1, 0);
    }

    public final boolean W(int i, int i2) {
        z(false);
        y(true);
        o oVar = this.A;
        if (oVar != null && i < 0 && oVar.getChildFragmentManager().V()) {
            return true;
        }
        boolean X = X(this.N, this.O, null, i, i2);
        if (X) {
            this.b = true;
            try {
                Z(this.N, this.O);
            } finally {
                d();
            }
        }
        l0();
        boolean z = this.M;
        c0 c0Var = this.c;
        if (z) {
            this.M = false;
            Iterator it = c0Var.d().iterator();
            while (it.hasNext()) {
                b0 b0Var = (b0) it.next();
                o oVar2 = b0Var.c;
                if (oVar2.mDeferStart) {
                    if (this.b) {
                        this.M = true;
                    } else {
                        oVar2.mDeferStart = false;
                        b0Var.k();
                    }
                }
            }
        }
        c0Var.b.values().removeAll(Collections.singleton(null));
        return X;
    }

    public final boolean X(ArrayList arrayList, ArrayList arrayList2, String str, int i, int i2) {
        boolean z = (i2 & 1) != 0;
        int i3 = -1;
        if (!this.d.isEmpty()) {
            if (str != null || i >= 0) {
                int size = this.d.size() - 1;
                while (size >= 0) {
                    a aVar = (a) this.d.get(size);
                    if ((str != null && str.equals(aVar.k)) || (i >= 0 && i == aVar.v)) {
                        break;
                    }
                    size--;
                }
                if (size < 0) {
                    i3 = size;
                } else if (z) {
                    i3 = size;
                    while (i3 > 0) {
                        a aVar2 = (a) this.d.get(i3 - 1);
                        if ((str == null || !str.equals(aVar2.k)) && (i < 0 || i != aVar2.v)) {
                            break;
                        }
                        i3--;
                    }
                } else if (size != this.d.size() - 1) {
                    i3 = size + 1;
                }
            } else {
                i3 = z ? 0 : this.d.size() - 1;
            }
        }
        if (i3 < 0) {
            return false;
        }
        for (int size2 = this.d.size() - 1; size2 >= i3; size2--) {
            arrayList.add((a) this.d.remove(size2));
            arrayList2.add(Boolean.TRUE);
        }
        return true;
    }

    public final void Y(o oVar) {
        if (M(2)) {
            Log.v("FragmentManager", "remove: " + oVar + " nesting=" + oVar.mBackStackNesting);
        }
        boolean isInBackStack = oVar.isInBackStack();
        if (oVar.mDetached && isInBackStack) {
            return;
        }
        c0 c0Var = this.c;
        synchronized (c0Var.a) {
            c0Var.a.remove(oVar);
        }
        oVar.mAdded = false;
        if (N(oVar)) {
            this.I = true;
        }
        oVar.mRemoving = true;
        i0(oVar);
    }

    public final void Z(ArrayList arrayList, ArrayList arrayList2) {
        if (arrayList.isEmpty()) {
            return;
        }
        if (arrayList.size() != arrayList2.size()) {
            xq0.q("Internal error with the back stack records");
            return;
        }
        int size = arrayList.size();
        int i = 0;
        int i2 = 0;
        while (i < size) {
            if (!((a) arrayList.get(i)).r) {
                if (i2 != i) {
                    B(i2, i, arrayList, arrayList2);
                }
                i2 = i + 1;
                if (((Boolean) arrayList2.get(i)).booleanValue()) {
                    while (i2 < size && ((Boolean) arrayList2.get(i2)).booleanValue() && !((a) arrayList.get(i2)).r) {
                        i2++;
                    }
                }
                B(i, i2, arrayList, arrayList2);
                i = i2 - 1;
            }
            i++;
        }
        if (i2 != size) {
            B(i2, size, arrayList, arrayList2);
        }
    }

    public final b0 a(o oVar) {
        String str = oVar.mPreviousWho;
        if (str != null) {
            muc.d(oVar, str);
        }
        if (M(2)) {
            Log.v("FragmentManager", "add: " + oVar);
        }
        b0 g = g(oVar);
        oVar.mFragmentManager = this;
        c0 c0Var = this.c;
        c0Var.g(g);
        if (!oVar.mDetached) {
            c0Var.a(oVar);
            oVar.mRemoving = false;
            if (oVar.mView == null) {
                oVar.mHiddenChanged = false;
            }
            if (N(oVar)) {
                this.I = true;
            }
        }
        return g;
    }

    public final void a0(Bundle bundle) {
        nnk nnkVar;
        int i;
        boolean z;
        int i2;
        b0 b0Var;
        Bundle bundle2;
        Bundle bundle3;
        for (String str : bundle.keySet()) {
            if (str.startsWith("result_") && (bundle3 = bundle.getBundle(str)) != null) {
                bundle3.setClassLoader(this.x.b.getClassLoader());
                this.m.put(str.substring(7), bundle3);
            }
        }
        HashMap hashMap = new HashMap();
        for (String str2 : bundle.keySet()) {
            if (str2.startsWith("fragment_") && (bundle2 = bundle.getBundle(str2)) != null) {
                bundle2.setClassLoader(this.x.b.getClassLoader());
                hashMap.put(str2.substring(9), bundle2);
            }
        }
        c0 c0Var = this.c;
        HashMap hashMap2 = c0Var.c;
        HashMap hashMap3 = c0Var.b;
        hashMap2.clear();
        hashMap2.putAll(hashMap);
        cuc cucVar = (cuc) bundle.getParcelable("state");
        if (cucVar == null) {
            return;
        }
        hashMap3.clear();
        Iterator it = cucVar.a.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            nnkVar = this.p;
            i = 2;
            if (!hasNext) {
                break;
            }
            Bundle i3 = c0Var.i(null, (String) it.next());
            if (i3 != null) {
                o oVar = (o) this.Q.k.get(((a0) i3.getParcelable("state")).b);
                if (oVar != null) {
                    if (M(2)) {
                        Log.v("FragmentManager", "restoreSaveState: re-attaching retained " + oVar);
                    }
                    b0Var = new b0(nnkVar, c0Var, oVar, i3);
                } else {
                    b0Var = new b0(this.p, this.c, this.x.b.getClassLoader(), J(), i3);
                }
                o oVar2 = b0Var.c;
                oVar2.mSavedFragmentState = i3;
                oVar2.mFragmentManager = this;
                if (M(2)) {
                    Log.v("FragmentManager", "restoreSaveState: active (" + oVar2.mWho + "): " + oVar2);
                }
                b0Var.l(this.x.b.getClassLoader());
                c0Var.g(b0Var);
                b0Var.e = this.w;
            }
        }
        z zVar = this.Q;
        zVar.getClass();
        Iterator it2 = new ArrayList(zVar.k.values()).iterator();
        while (true) {
            z = true;
            if (!it2.hasNext()) {
                break;
            }
            o oVar3 = (o) it2.next();
            if (hashMap3.get(oVar3.mWho) == null) {
                if (M(2)) {
                    Log.v("FragmentManager", "Discarding retained Fragment " + oVar3 + " that was not found in the set of active Fragments " + cucVar.a);
                }
                this.Q.K(oVar3);
                oVar3.mFragmentManager = this;
                b0 b0Var2 = new b0(nnkVar, c0Var, oVar3);
                b0Var2.e = 1;
                b0Var2.k();
                oVar3.mRemoving = true;
                b0Var2.k();
            }
        }
        ArrayList<String> arrayList = cucVar.b;
        c0Var.a.clear();
        if (arrayList != null) {
            for (String str3 : arrayList) {
                o b = c0Var.b(str3);
                if (b == null) {
                    xq0.q(hrg.q("No instantiated fragment for (", str3, ")"));
                    return;
                }
                if (M(2)) {
                    Log.v("FragmentManager", "restoreSaveState: added (" + str3 + "): " + b);
                }
                c0Var.a(b);
            }
        }
        if (cucVar.c != null) {
            this.d = new ArrayList(cucVar.c.length);
            int i4 = 0;
            while (true) {
                b[] bVarArr = cucVar.c;
                if (i4 >= bVarArr.length) {
                    break;
                }
                b bVar = bVarArr[i4];
                ArrayList arrayList2 = bVar.b;
                a aVar = new a(this);
                int[] iArr = bVar.a;
                int i5 = 0;
                int i6 = 0;
                while (i5 < iArr.length) {
                    tuc tucVar = new tuc();
                    int i7 = i5 + 1;
                    int i8 = i;
                    tucVar.a = iArr[i5];
                    if (M(i8)) {
                        Log.v("FragmentManager", "Instantiate " + aVar + " op #" + i6 + " base fragment #" + iArr[i7]);
                    }
                    tucVar.h = lyf.values()[bVar.c[i6]];
                    tucVar.i = lyf.values()[bVar.d[i6]];
                    int i9 = i5 + 2;
                    tucVar.c = iArr[i7] != 0 ? z : false;
                    int i10 = iArr[i9];
                    tucVar.d = i10;
                    int i11 = iArr[i5 + 3];
                    tucVar.e = i11;
                    int i12 = i5 + 5;
                    int i13 = iArr[i5 + 4];
                    tucVar.f = i13;
                    i5 += 6;
                    int[] iArr2 = iArr;
                    int i14 = iArr2[i12];
                    tucVar.g = i14;
                    aVar.d = i10;
                    aVar.e = i11;
                    aVar.f = i13;
                    aVar.g = i14;
                    aVar.b(tucVar);
                    i6++;
                    i = i8;
                    iArr = iArr2;
                    z = true;
                }
                int i15 = i;
                aVar.h = bVar.e;
                aVar.k = bVar.f;
                aVar.i = true;
                aVar.l = bVar.h;
                aVar.m = bVar.i;
                aVar.n = bVar.j;
                aVar.o = bVar.k;
                aVar.p = bVar.l;
                aVar.q = bVar.m;
                aVar.r = bVar.n;
                aVar.v = bVar.g;
                for (int i16 = 0; i16 < arrayList2.size(); i16++) {
                    String str4 = (String) arrayList2.get(i16);
                    if (str4 != null) {
                        ((tuc) aVar.c.get(i16)).b = c0Var.b(str4);
                    }
                }
                aVar.h(1);
                if (M(i15)) {
                    StringBuilder q = k5r.q(i4, "restoreAllState: back stack #", " (index ");
                    q.append(aVar.v);
                    q.append("): ");
                    q.append(aVar);
                    Log.v("FragmentManager", q.toString());
                    PrintWriter printWriter = new PrintWriter(new gsg());
                    aVar.l("  ", printWriter, false);
                    printWriter.close();
                }
                this.d.add(aVar);
                i4++;
                i = i15;
                z = true;
            }
            i2 = 0;
        } else {
            i2 = 0;
            this.d = new ArrayList();
        }
        this.k.set(cucVar.d);
        String str5 = cucVar.e;
        if (str5 != null) {
            o b2 = c0Var.b(str5);
            this.A = b2;
            r(b2);
        }
        ArrayList arrayList3 = cucVar.f;
        if (arrayList3 != null) {
            for (int i17 = i2; i17 < arrayList3.size(); i17++) {
                this.l.put((String) arrayList3.get(i17), (zi2) cucVar.g.get(i17));
            }
        }
        this.H = new ArrayDeque(cucVar.h);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void b(ptc ptcVar, ltc ltcVar, o oVar) {
        if (this.x != null) {
            xq0.q("Already attached");
            return;
        }
        this.x = ptcVar;
        this.y = ltcVar;
        this.z = oVar;
        CopyOnWriteArrayList copyOnWriteArrayList = this.q;
        if (oVar != null) {
            copyOnWriteArrayList.add(new vtc(oVar));
        } else if (ptcVar instanceof euc) {
            copyOnWriteArrayList.add((euc) ptcVar);
        }
        if (this.z != null) {
            l0();
        }
        if (ptcVar instanceof rpj) {
            rpj rpjVar = (rpj) ptcVar;
            qpj onBackPressedDispatcher = rpjVar.getOnBackPressedDispatcher();
            this.g = onBackPressedDispatcher;
            dzf dzfVar = rpjVar;
            if (oVar != null) {
                dzfVar = oVar;
            }
            onBackPressedDispatcher.a(dzfVar, this.j);
        }
        if (oVar != null) {
            z zVar = oVar.mFragmentManager.Q;
            HashMap hashMap = zVar.l;
            z zVar2 = (z) hashMap.get(oVar.mWho);
            if (zVar2 == null) {
                zVar2 = new z(zVar.n);
                hashMap.put(oVar.mWho, zVar2);
            }
            this.Q = zVar2;
        } else if (ptcVar instanceof kfu) {
            jfu viewModelStore = ((kfu) ptcVar).getViewModelStore();
            s40 s40Var = z.q;
            viewModelStore.getClass();
            s40Var.getClass();
            gs6 gs6Var = gs6.b;
            gs6Var.getClass();
            bjt bjtVar = new bjt(viewModelStore, s40Var, gs6Var);
            lm4 a = ern.a(z.class);
            String f = a.f();
            if (f == null) {
                xq0.x("Local and anonymous classes can not be ViewModels");
                return;
            }
            this.Q = (z) bjtVar.j(a, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(f));
        } else {
            this.Q = new z(false);
        }
        this.Q.p = Q();
        this.c.d = this.Q;
        Object obj = this.x;
        if ((obj instanceof woo) && oVar == null) {
            uoo savedStateRegistry = ((woo) obj).getSavedStateRegistry();
            savedStateRegistry.c("android:support:fragments", new ym5(2, this));
            Bundle a2 = savedStateRegistry.a("android:support:fragments");
            if (a2 != null) {
                a0(a2);
            }
        }
        Object obj2 = this.x;
        if (obj2 instanceof ji) {
            fi activityResultRegistry = ((ji) obj2).getActivityResultRegistry();
            String concat = "FragmentManager:".concat(oVar != null ? su4.o(new StringBuilder(), oVar.mWho, StringUtils.PROCESS_POSTFIX_DELIMITER) : "");
            this.E = activityResultRegistry.c(concat.concat("StartActivityForResult"), new vh(4), new stc(this, 1));
            this.F = activityResultRegistry.c(concat.concat("StartIntentSenderForResult"), new vh(7), new stc(this, 2));
            this.G = activityResultRegistry.c(concat.concat("RequestPermissions"), new vh(2), new stc(this, 0));
        }
        Object obj3 = this.x;
        if (obj3 instanceof tpj) {
            ((tpj) obj3).addOnConfigurationChangedListener(this.r);
        }
        Object obj4 = this.x;
        if (obj4 instanceof wqj) {
            ((wqj) obj4).addOnTrimMemoryListener(this.s);
        }
        Object obj5 = this.x;
        if (obj5 instanceof v0) {
            ((v0) obj5).addOnMultiWindowModeChangedListener(this.t);
        }
        Object obj6 = this.x;
        if (obj6 instanceof w0) {
            ((w0) obj6).addOnPictureInPictureModeChangedListener(this.u);
        }
        Object obj7 = this.x;
        if ((obj7 instanceof jxh) && oVar == null) {
            ((jxh) obj7).addMenuProvider(this.v);
        }
    }

    public final Bundle b0() {
        ArrayList arrayList;
        b[] bVarArr;
        Bundle bundle = new Bundle();
        E();
        w();
        z(true);
        this.J = true;
        this.Q.p = true;
        c0 c0Var = this.c;
        c0Var.getClass();
        HashMap hashMap = c0Var.b;
        ArrayList arrayList2 = new ArrayList(hashMap.size());
        for (b0 b0Var : hashMap.values()) {
            if (b0Var != null) {
                o oVar = b0Var.c;
                c0Var.i(b0Var.n(), oVar.mWho);
                arrayList2.add(oVar.mWho);
                if (M(2)) {
                    Log.v("FragmentManager", "Saved state of " + oVar + ": " + oVar.mSavedFragmentState);
                }
            }
        }
        HashMap hashMap2 = this.c.c;
        if (!hashMap2.isEmpty()) {
            c0 c0Var2 = this.c;
            synchronized (c0Var2.a) {
                try {
                    if (c0Var2.a.isEmpty()) {
                        arrayList = null;
                    } else {
                        arrayList = new ArrayList(c0Var2.a.size());
                        Iterator it = c0Var2.a.iterator();
                        while (it.hasNext()) {
                            o oVar2 = (o) it.next();
                            arrayList.add(oVar2.mWho);
                            if (M(2)) {
                                Log.v("FragmentManager", "saveAllState: adding fragment (" + oVar2.mWho + "): " + oVar2);
                            }
                        }
                    }
                } finally {
                }
            }
            int size = this.d.size();
            if (size > 0) {
                bVarArr = new b[size];
                for (int i = 0; i < size; i++) {
                    bVarArr[i] = new b((a) this.d.get(i));
                    if (M(2)) {
                        StringBuilder q = k5r.q(i, "saveAllState: adding back stack #", ": ");
                        q.append(this.d.get(i));
                        Log.v("FragmentManager", q.toString());
                    }
                }
            } else {
                bVarArr = null;
            }
            cuc cucVar = new cuc();
            cucVar.e = null;
            ArrayList arrayList3 = new ArrayList();
            cucVar.f = arrayList3;
            ArrayList arrayList4 = new ArrayList();
            cucVar.g = arrayList4;
            cucVar.a = arrayList2;
            cucVar.b = arrayList;
            cucVar.c = bVarArr;
            cucVar.d = this.k.get();
            o oVar3 = this.A;
            if (oVar3 != null) {
                cucVar.e = oVar3.mWho;
            }
            arrayList3.addAll(this.l.keySet());
            arrayList4.addAll(this.l.values());
            cucVar.h = new ArrayList(this.H);
            bundle.putParcelable("state", cucVar);
            for (String str : this.m.keySet()) {
                bundle.putBundle(f1d.g("result_", str), (Bundle) this.m.get(str));
            }
            for (String str2 : hashMap2.keySet()) {
                bundle.putBundle(f1d.g("fragment_", str2), (Bundle) hashMap2.get(str2));
            }
        } else if (M(2)) {
            Log.v("FragmentManager", "saveAllState: no fragments!");
            return bundle;
        }
        return bundle;
    }

    public final void c(o oVar) {
        if (M(2)) {
            Log.v("FragmentManager", "attach: " + oVar);
        }
        if (oVar.mDetached) {
            oVar.mDetached = false;
            if (oVar.mAdded) {
                return;
            }
            this.c.a(oVar);
            if (M(2)) {
                Log.v("FragmentManager", "add from attach: " + oVar);
            }
            if (N(oVar)) {
                this.I = true;
            }
        }
    }

    public final void c0() {
        synchronized (this.a) {
            try {
                if (this.a.size() == 1) {
                    this.x.c.removeCallbacks(this.R);
                    this.x.c.post(this.R);
                    l0();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void d() {
        this.b = false;
        this.O.clear();
        this.N.clear();
    }

    public final void d0(o oVar, boolean z) {
        ViewGroup I = I(oVar);
        if (I == null || !(I instanceof FragmentContainerView)) {
            return;
        }
        ((FragmentContainerView) I).setDrawDisappearingViewsLast(!z);
    }

    public final HashSet e() {
        h hVar;
        HashSet hashSet = new HashSet();
        Iterator it = this.c.d().iterator();
        while (it.hasNext()) {
            ViewGroup viewGroup = ((b0) it.next()).c.mContainer;
            if (viewGroup != null) {
                K().getClass();
                Object tag = viewGroup.getTag(R.id.special_effects_controller_view_tag);
                if (tag instanceof h) {
                    hVar = (h) tag;
                } else {
                    hVar = new h(viewGroup);
                    viewGroup.setTag(R.id.special_effects_controller_view_tag, hVar);
                }
                hashSet.add(hVar);
            }
        }
        return hashSet;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void e0(Bundle bundle, String str) {
        xtc xtcVar = (xtc) this.n.get(str);
        if (xtcVar != null) {
            if (xtcVar.a.b().compareTo(lyf.d) >= 0) {
                xtcVar.k(bundle, str);
                if (M(2)) {
                    return;
                }
                Log.v("FragmentManager", "Setting fragment result with key " + str + " and result " + bundle);
                return;
            }
        }
        this.m.put(str, bundle);
        if (M(2)) {
        }
    }

    public final HashSet f(ArrayList arrayList, int i, int i2) {
        ViewGroup viewGroup;
        HashSet hashSet = new HashSet();
        while (i < i2) {
            Iterator it = ((a) arrayList.get(i)).c.iterator();
            while (it.hasNext()) {
                o oVar = ((tuc) it.next()).b;
                if (oVar != null && (viewGroup = oVar.mContainer) != null) {
                    hashSet.add(h.j(viewGroup, this));
                }
            }
            i++;
        }
        return hashSet;
    }

    public final void f0(String str, dzf dzfVar, fuc fucVar) {
        nyf lifecycle = dzfVar.getLifecycle();
        if (lifecycle.b() == lyf.a) {
            return;
        }
        utc utcVar = new utc(this, str, fucVar, lifecycle);
        xtc xtcVar = (xtc) this.n.put(str, new xtc(lifecycle, fucVar, utcVar));
        if (xtcVar != null) {
            xtcVar.a.d(xtcVar.c);
        }
        if (M(2)) {
            Log.v("FragmentManager", "Setting FragmentResultListener with key " + str + " lifecycleOwner " + lifecycle + " and listener " + fucVar);
        }
        lifecycle.a(utcVar);
    }

    public final b0 g(o oVar) {
        String str = oVar.mWho;
        c0 c0Var = this.c;
        b0 b0Var = (b0) c0Var.b.get(str);
        if (b0Var != null) {
            return b0Var;
        }
        b0 b0Var2 = new b0(this.p, c0Var, oVar);
        b0Var2.l(this.x.b.getClassLoader());
        b0Var2.e = this.w;
        return b0Var2;
    }

    public final void g0(o oVar, lyf lyfVar) {
        if (oVar.equals(this.c.b(oVar.mWho)) && (oVar.mHost == null || oVar.mFragmentManager == this)) {
            oVar.mMaxState = lyfVar;
        } else {
            wvs.i("Fragment ", oVar, " is not an active fragment of FragmentManager ", this);
        }
    }

    public final void h(o oVar) {
        if (M(2)) {
            Log.v("FragmentManager", "detach: " + oVar);
        }
        if (oVar.mDetached) {
            return;
        }
        oVar.mDetached = true;
        if (oVar.mAdded) {
            if (M(2)) {
                Log.v("FragmentManager", "remove from detach: " + oVar);
            }
            c0 c0Var = this.c;
            synchronized (c0Var.a) {
                c0Var.a.remove(oVar);
            }
            oVar.mAdded = false;
            if (N(oVar)) {
                this.I = true;
            }
            i0(oVar);
        }
    }

    public final void h0(o oVar) {
        if (oVar != null) {
            if (!oVar.equals(this.c.b(oVar.mWho)) || (oVar.mHost != null && oVar.mFragmentManager != this)) {
                wvs.i("Fragment ", oVar, " is not an active fragment of FragmentManager ", this);
                return;
            }
        }
        o oVar2 = this.A;
        this.A = oVar;
        r(oVar2);
        r(this.A);
    }

    public final void i(boolean z, Configuration configuration) {
        if (z && (this.x instanceof tpj)) {
            k0(new IllegalStateException("Do not call dispatchConfigurationChanged() on host. Host implements OnConfigurationChangedProvider and automatically dispatches configuration changes to fragments."));
            throw null;
        }
        for (o oVar : this.c.f()) {
            if (oVar != null) {
                oVar.performConfigurationChanged(configuration);
                if (z) {
                    oVar.mChildFragmentManager.i(true, configuration);
                }
            }
        }
    }

    public final void i0(o oVar) {
        ViewGroup I = I(oVar);
        if (I != null) {
            if (oVar.getPopExitAnim() + oVar.getPopEnterAnim() + oVar.getExitAnim() + oVar.getEnterAnim() > 0) {
                if (I.getTag(R.id.visible_removing_fragment_view_tag) == null) {
                    I.setTag(R.id.visible_removing_fragment_view_tag, oVar);
                }
                ((o) I.getTag(R.id.visible_removing_fragment_view_tag)).setPopDirection(oVar.getPopDirection());
            }
        }
    }

    public final boolean j(MenuItem menuItem) {
        if (this.w < 1) {
            return false;
        }
        for (o oVar : this.c.f()) {
            if (oVar != null && oVar.performContextItemSelected(menuItem)) {
                return true;
            }
        }
        return false;
    }

    public final boolean k(Menu menu, MenuInflater menuInflater) {
        if (this.w < 1) {
            return false;
        }
        ArrayList arrayList = null;
        boolean z = false;
        for (o oVar : this.c.f()) {
            if (oVar != null && oVar.isMenuVisible() && oVar.performCreateOptionsMenu(menu, menuInflater)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(oVar);
                z = true;
            }
        }
        if (this.e != null) {
            for (int i = 0; i < this.e.size(); i++) {
                o oVar2 = (o) this.e.get(i);
                if (arrayList == null || !arrayList.contains(oVar2)) {
                    oVar2.onDestroyOptionsMenu();
                }
            }
        }
        this.e = arrayList;
        return z;
    }

    public final void k0(IllegalStateException illegalStateException) {
        Log.e("FragmentManager", illegalStateException.getMessage());
        Log.e("FragmentManager", "Activity state:");
        PrintWriter printWriter = new PrintWriter(new gsg());
        ptc ptcVar = this.x;
        if (ptcVar == null) {
            try {
                v("  ", null, printWriter, new String[0]);
                throw illegalStateException;
            } catch (Exception e) {
                Log.e("FragmentManager", "Failed dumping state", e);
                throw illegalStateException;
            }
        }
        try {
            ((s) ptcVar).e.dump("  ", null, printWriter, new String[0]);
            throw illegalStateException;
        } catch (Exception e2) {
            Log.e("FragmentManager", "Failed dumping state", e2);
            throw illegalStateException;
        }
    }

    public final void l() {
        boolean z = true;
        this.L = true;
        z(true);
        w();
        ptc ptcVar = this.x;
        boolean z2 = ptcVar instanceof kfu;
        c0 c0Var = this.c;
        if (z2) {
            z = c0Var.d.o;
        } else {
            t tVar = ptcVar.b;
            if (tVar != null) {
                z = true ^ tVar.isChangingConfigurations();
            }
        }
        if (z) {
            Iterator it = this.l.values().iterator();
            while (it.hasNext()) {
                Iterator it2 = ((zi2) it.next()).a.iterator();
                while (it2.hasNext()) {
                    c0Var.d.H((String) it2.next(), false);
                }
            }
        }
        u(-1);
        Object obj = this.x;
        if (obj instanceof wqj) {
            ((wqj) obj).removeOnTrimMemoryListener(this.s);
        }
        Object obj2 = this.x;
        if (obj2 instanceof tpj) {
            ((tpj) obj2).removeOnConfigurationChangedListener(this.r);
        }
        Object obj3 = this.x;
        if (obj3 instanceof v0) {
            ((v0) obj3).removeOnMultiWindowModeChangedListener(this.t);
        }
        Object obj4 = this.x;
        if (obj4 instanceof w0) {
            ((w0) obj4).removeOnPictureInPictureModeChangedListener(this.u);
        }
        Object obj5 = this.x;
        if ((obj5 instanceof jxh) && this.z == null) {
            ((jxh) obj5).removeMenuProvider(this.v);
        }
        this.x = null;
        this.y = null;
        this.z = null;
        if (this.g != null) {
            this.j.remove();
            this.g = null;
        }
        ei eiVar = this.E;
        if (eiVar != null) {
            eiVar.b();
            this.F.b();
            this.G.b();
        }
    }

    public final void l0() {
        synchronized (this.a) {
            try {
                if (!this.a.isEmpty()) {
                    this.j.setEnabled(true);
                    if (M(3)) {
                        Log.d("FragmentManager", "FragmentManager " + this + " enabling OnBackPressedCallback, caused by non-empty pending actions");
                    }
                    return;
                }
                boolean z = H() > 0 && P(this.z);
                if (M(3)) {
                    Log.d("FragmentManager", "OnBackPressedCallback for FragmentManager " + this + " enabled state is " + z);
                }
                this.j.setEnabled(z);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void m(boolean z) {
        if (z && (this.x instanceof wqj)) {
            k0(new IllegalStateException("Do not call dispatchLowMemory() on host. Host implements OnTrimMemoryProvider and automatically dispatches low memory callbacks to fragments."));
            throw null;
        }
        for (o oVar : this.c.f()) {
            if (oVar != null) {
                oVar.performLowMemory();
                if (z) {
                    oVar.mChildFragmentManager.m(true);
                }
            }
        }
    }

    public final void n(boolean z, boolean z2) {
        if (z2 && (this.x instanceof v0)) {
            k0(new IllegalStateException("Do not call dispatchMultiWindowModeChanged() on host. Host implements OnMultiWindowModeChangedProvider and automatically dispatches multi-window mode changes to fragments."));
            throw null;
        }
        for (o oVar : this.c.f()) {
            if (oVar != null) {
                oVar.performMultiWindowModeChanged(z);
                if (z2) {
                    oVar.mChildFragmentManager.n(z, true);
                }
            }
        }
    }

    public final void o() {
        Iterator it = this.c.e().iterator();
        while (it.hasNext()) {
            o oVar = (o) it.next();
            if (oVar != null) {
                oVar.onHiddenChanged(oVar.isHidden());
                oVar.mChildFragmentManager.o();
            }
        }
    }

    public final boolean p(MenuItem menuItem) {
        if (this.w < 1) {
            return false;
        }
        for (o oVar : this.c.f()) {
            if (oVar != null && oVar.performOptionsItemSelected(menuItem)) {
                return true;
            }
        }
        return false;
    }

    public final void q(Menu menu) {
        if (this.w < 1) {
            return;
        }
        for (o oVar : this.c.f()) {
            if (oVar != null) {
                oVar.performOptionsMenuClosed(menu);
            }
        }
    }

    public final void r(o oVar) {
        if (oVar != null) {
            if (oVar.equals(this.c.b(oVar.mWho))) {
                oVar.performPrimaryNavigationFragmentChanged();
            }
        }
    }

    public final void s(boolean z, boolean z2) {
        if (z2 && (this.x instanceof w0)) {
            k0(new IllegalStateException("Do not call dispatchPictureInPictureModeChanged() on host. Host implements OnPictureInPictureModeChangedProvider and automatically dispatches picture-in-picture mode changes to fragments."));
            throw null;
        }
        for (o oVar : this.c.f()) {
            if (oVar != null) {
                oVar.performPictureInPictureModeChanged(z);
                if (z2) {
                    oVar.mChildFragmentManager.s(z, true);
                }
            }
        }
    }

    public final boolean t(Menu menu) {
        boolean z = false;
        if (this.w < 1) {
            return false;
        }
        for (o oVar : this.c.f()) {
            if (oVar != null && oVar.isMenuVisible() && oVar.performPrepareOptionsMenu(menu)) {
                z = true;
            }
        }
        return z;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        o oVar = this.z;
        if (oVar != null) {
            sb.append(oVar.getClass().getSimpleName());
            sb.append("{");
            sb.append(Integer.toHexString(System.identityHashCode(this.z)));
            sb.append("}");
        } else {
            ptc ptcVar = this.x;
            if (ptcVar != null) {
                sb.append(ptcVar.getClass().getSimpleName());
                sb.append("{");
                sb.append(Integer.toHexString(System.identityHashCode(this.x)));
                sb.append("}");
            } else {
                sb.append("null");
            }
        }
        sb.append("}}");
        return sb.toString();
    }

    public final void u(int i) {
        try {
            this.b = true;
            for (b0 b0Var : this.c.b.values()) {
                if (b0Var != null) {
                    b0Var.e = i;
                }
            }
            R(i, false);
            Iterator it = e().iterator();
            while (it.hasNext()) {
                ((h) it.next()).i();
            }
            this.b = false;
            z(true);
        } catch (Throwable th) {
            this.b = false;
            throw th;
        }
    }

    public final void v(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        int size;
        String n = ouj.n(str, "    ");
        c0 c0Var = this.c;
        ArrayList arrayList = c0Var.a;
        String n2 = ouj.n(str, "    ");
        HashMap hashMap = c0Var.b;
        if (!hashMap.isEmpty()) {
            printWriter.print(str);
            printWriter.println("Active Fragments:");
            for (b0 b0Var : hashMap.values()) {
                printWriter.print(str);
                if (b0Var != null) {
                    o oVar = b0Var.c;
                    printWriter.println(oVar);
                    oVar.dump(n2, fileDescriptor, printWriter, strArr);
                } else {
                    printWriter.println("null");
                }
            }
        }
        int size2 = arrayList.size();
        if (size2 > 0) {
            printWriter.print(str);
            printWriter.println("Added Fragments:");
            for (int i = 0; i < size2; i++) {
                o oVar2 = (o) arrayList.get(i);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i);
                printWriter.print(": ");
                printWriter.println(oVar2.toString());
            }
        }
        ArrayList arrayList2 = this.e;
        if (arrayList2 != null && (size = arrayList2.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Fragments Created Menus:");
            for (int i2 = 0; i2 < size; i2++) {
                o oVar3 = (o) this.e.get(i2);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i2);
                printWriter.print(": ");
                printWriter.println(oVar3.toString());
            }
        }
        int size3 = this.d.size();
        if (size3 > 0) {
            printWriter.print(str);
            printWriter.println("Back Stack:");
            for (int i3 = 0; i3 < size3; i3++) {
                a aVar = (a) this.d.get(i3);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i3);
                printWriter.print(": ");
                printWriter.println(aVar.toString());
                aVar.l(n, printWriter, true);
            }
        }
        printWriter.print(str);
        printWriter.println("Back Stack Index: " + this.k.get());
        synchronized (this.a) {
            try {
                int size4 = this.a.size();
                if (size4 > 0) {
                    printWriter.print(str);
                    printWriter.println("Pending Actions:");
                    for (int i4 = 0; i4 < size4; i4++) {
                        Object obj = (ztc) this.a.get(i4);
                        printWriter.print(str);
                        printWriter.print("  #");
                        printWriter.print(i4);
                        printWriter.print(": ");
                        printWriter.println(obj);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        printWriter.print(str);
        printWriter.println("FragmentManager misc state:");
        printWriter.print(str);
        printWriter.print("  mHost=");
        printWriter.println(this.x);
        printWriter.print(str);
        printWriter.print("  mContainer=");
        printWriter.println(this.y);
        if (this.z != null) {
            printWriter.print(str);
            printWriter.print("  mParent=");
            printWriter.println(this.z);
        }
        printWriter.print(str);
        printWriter.print("  mCurState=");
        printWriter.print(this.w);
        printWriter.print(" mStateSaved=");
        printWriter.print(this.J);
        printWriter.print(" mStopped=");
        printWriter.print(this.K);
        printWriter.print(" mDestroyed=");
        printWriter.println(this.L);
        if (this.I) {
            printWriter.print(str);
            printWriter.print("  mNeedMenuInvalidate=");
            printWriter.println(this.I);
        }
    }

    public final void w() {
        Iterator it = e().iterator();
        while (it.hasNext()) {
            ((h) it.next()).i();
        }
    }

    public final void x(ztc ztcVar, boolean z) {
        if (!z) {
            if (this.x == null) {
                if (this.L) {
                    xq0.q("FragmentManager has been destroyed");
                    return;
                } else {
                    xq0.q("FragmentManager has not been attached to a host.");
                    return;
                }
            }
            if (Q()) {
                xq0.q("Can not perform this action after onSaveInstanceState");
                return;
            }
        }
        synchronized (this.a) {
            try {
                if (this.x == null) {
                    if (!z) {
                        throw new IllegalStateException("Activity has been destroyed");
                    }
                } else {
                    this.a.add(ztcVar);
                    c0();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void y(boolean z) {
        if (this.b) {
            xq0.q("FragmentManager is already executing transactions");
            return;
        }
        if (this.x == null) {
            if (this.L) {
                xq0.q("FragmentManager has been destroyed");
                return;
            } else {
                xq0.q("FragmentManager has not been attached to a host.");
                return;
            }
        }
        if (Looper.myLooper() != this.x.c.getLooper()) {
            xq0.q("Must be called from main thread of fragment host");
            return;
        }
        if (!z && Q()) {
            xq0.q("Can not perform this action after onSaveInstanceState");
        } else if (this.N == null) {
            this.N = new ArrayList();
            this.O = new ArrayList();
        }
    }

    public final boolean z(boolean z) {
        boolean z2;
        ArrayList arrayList;
        a aVar;
        y(z);
        if (!this.i && (aVar = this.h) != null) {
            aVar.u = false;
            aVar.i();
            if (M(3)) {
                Log.d("FragmentManager", "Reversing mTransitioningOp " + this.h + " as part of execPendingActions for actions " + this.a);
            }
            this.h.k(false, false);
            this.a.add(0, this.h);
            Iterator it = this.h.c.iterator();
            while (it.hasNext()) {
                o oVar = ((tuc) it.next()).b;
                if (oVar != null) {
                    oVar.mTransitioning = false;
                }
            }
            this.h = null;
        }
        boolean z3 = false;
        while (true) {
            ArrayList arrayList2 = this.N;
            ArrayList arrayList3 = this.O;
            synchronized (this.a) {
                if (this.a.isEmpty()) {
                    z2 = false;
                } else {
                    try {
                        int size = this.a.size();
                        int i = 0;
                        z2 = false;
                        while (true) {
                            arrayList = this.a;
                            if (i >= size) {
                                break;
                            }
                            z2 |= ((ztc) arrayList.get(i)).a(arrayList2, arrayList3);
                            i++;
                        }
                        arrayList.clear();
                        this.x.c.removeCallbacks(this.R);
                    } finally {
                    }
                }
            }
            if (!z2) {
                break;
            }
            z3 = true;
            this.b = true;
            try {
                Z(this.N, this.O);
            } finally {
                d();
            }
        }
        l0();
        if (this.M) {
            this.M = false;
            Iterator it2 = this.c.d().iterator();
            while (it2.hasNext()) {
                b0 b0Var = (b0) it2.next();
                o oVar2 = b0Var.c;
                if (oVar2.mDeferStart) {
                    if (this.b) {
                        this.M = true;
                    } else {
                        oVar2.mDeferStart = false;
                        b0Var.k();
                    }
                }
            }
        }
        this.c.b.values().removeAll(Collections.singleton(null));
        return z3;
    }
}
