package defpackage;

import android.content.res.Resources;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class rt8 extends p9 {
    public final /* synthetic */ int b = 1;
    public final gp8 c;
    public final efb d;
    public final Object e;
    public final Object f;
    public final Object g;
    public final Object h;

    public rt8(gp8 gp8Var, szm szmVar, dd9 dd9Var, szm szmVar2, efb efbVar) {
        super(gp8Var);
        this.c = gp8Var;
        this.e = szmVar;
        this.g = dd9Var;
        this.f = szmVar2;
        this.d = efbVar;
        this.h = new Rect();
    }

    public static final Rect G(rt8 rt8Var, ix8 ix8Var, Resources resources, xzb xzbVar) {
        Rect rect = (Rect) rt8Var.h;
        if (ix8Var == null) {
            rect.set(0, 0, 0, 0);
            return rect;
        }
        szb szbVar = ix8Var.b;
        szb szbVar2 = ix8Var.e;
        DisplayMetrics displayMetrics = resources.getDisplayMetrics();
        jk9 jk9Var = (jk9) ix8Var.g.a(xzbVar);
        if (szbVar2 == null && szbVar == null) {
            rect.left = bg3.m0((Long) ix8Var.c.a(xzbVar), displayMetrics, jk9Var);
            rect.right = bg3.m0((Long) ix8Var.d.a(xzbVar), displayMetrics, jk9Var);
        } else {
            if (resources.getConfiguration().getLayoutDirection() == 0) {
                rect.left = bg3.m0(szbVar2 != null ? (Long) szbVar2.a(xzbVar) : null, displayMetrics, jk9Var);
                rect.right = bg3.m0(szbVar != null ? (Long) szbVar.a(xzbVar) : null, displayMetrics, jk9Var);
            } else {
                rect.left = bg3.m0(szbVar != null ? (Long) szbVar.a(xzbVar) : null, displayMetrics, jk9Var);
                rect.right = bg3.m0(szbVar2 != null ? (Long) szbVar2.a(xzbVar) : null, displayMetrics, jk9Var);
            }
        }
        rect.top = bg3.m0((Long) ix8Var.f.a(xzbVar), displayMetrics, jk9Var);
        rect.bottom = bg3.m0((Long) ix8Var.a.a(xzbVar), displayMetrics, jk9Var);
        return rect;
    }

    public static final void H(rt8 rt8Var, pwt pwtVar, String str, j79 j79Var, gc8 gc8Var, xzb xzbVar) {
        boolean a = pwtVar.a.a(str);
        hyf.K(gc8Var, pwtVar.b, String.valueOf(a), xzbVar);
        StringBuilder sb = new StringBuilder("Can't find label with id '");
        String str2 = pwtVar.c;
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException(dfi.i(sb, str2, '\''));
        dfb a2 = rt8Var.d.a(gc8Var.getDivData(), gc8Var.getDataTag());
        z0a l = gc8Var.getViewComponent$div_release().l();
        if (!j79Var.isLaidOut() || j79Var.isLayoutRequested()) {
            j79Var.addOnLayoutChangeListener(new n49(l, pwtVar, j79Var, a, a2, illegalArgumentException));
            return;
        }
        int a3 = l.a(str2);
        if (a3 == -1) {
            a2.d(illegalArgumentException);
            return;
        }
        View findViewById = j79Var.getRootView().findViewById(a3);
        if (findViewById != null) {
            findViewById.setLabelFor(a ? -1 : j79Var.getId());
        } else {
            a2.d(illegalArgumentException);
        }
    }

    public static void I(View view, jt8 jt8Var, dp8 dp8Var, xzb xzbVar, xzb xzbVar2) {
        szb u = dp8Var.u();
        pm8 pm8Var = null;
        om8 e0 = u != null ? (om8) u.a(xzbVar2) : vq1.c0(jt8Var, xzbVar) ? null : vq1.e0((du8) jt8Var.o.a(xzbVar));
        szb o = dp8Var.o();
        if (o != null) {
            pm8Var = (pm8) o.a(xzbVar2);
        } else if (!vq1.c0(jt8Var, xzbVar)) {
            pm8Var = vq1.f0((eu8) jt8Var.p.a(xzbVar));
        }
        bg3.j(view, e0, pm8Var);
    }

    public static void L(j79 j79Var, om8 om8Var, pm8 pm8Var) {
        j79Var.setGravity(vq1.N(om8Var, pm8Var));
        int i = om8Var == null ? -1 : m49.a[om8Var.ordinal()];
        int i2 = 5;
        if (i != 1) {
            if (i == 2) {
                i2 = 4;
            } else if (i == 3 || (i != 4 && i == 5)) {
                i2 = 6;
            }
        }
        j79Var.setTextAlignment(i2);
    }

    public static void O(jt8 jt8Var, xzb xzbVar, dfb dfbVar) {
        long longValue = ((Number) jt8Var.A.a(xzbVar)).longValue();
        if ((R(jt8Var.P, xzbVar) & 2) == 0 || longValue == 0) {
            return;
        }
        dfbVar.e(new Throwable("item_spacing will be ignored due to the 'separator' property."));
    }

    public static void P(bk9 bk9Var, dp8 dp8Var, dfb dfbVar, String str, String str2) {
        if (bk9Var instanceof zj9) {
            String id = dp8Var.getId();
            dfbVar.e(new Throwable(String.format("Incorrect child size. Container with %s contains child%s with match_parent size along the %s axis.", Arrays.copyOf(new Object[]{str, id != null ? ouj.k('\'', " with id='", id) : "", str2}, 3))));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [int] */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8 */
    public static int R(ht8 ht8Var, xzb xzbVar) {
        if (ht8Var == null) {
            return 0;
        }
        boolean booleanValue = ((Boolean) ht8Var.c.a(xzbVar)).booleanValue();
        ?? r0 = booleanValue;
        if (((Boolean) ht8Var.d.a(xzbVar)).booleanValue()) {
            r0 = (booleanValue ? 1 : 0) | 2;
        }
        return ((Boolean) ht8Var.b.a(xzbVar)).booleanValue() ? r0 | 4 : r0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:71:0x0203, code lost:
    
        if (defpackage.xp3.B(r4.o(), r19.o()) != false) goto L108;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0278  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x027e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void J(ViewGroup viewGroup, e23 e23Var, jt8 jt8Var, jt8 jt8Var2, List list, List list2, pm9 pm9Var, dfb dfbVar) {
        List list3;
        List c;
        a0c a0cVar;
        View view;
        ArrayList arrayList;
        jc8 jc8Var;
        xzb xzbVar;
        szb szbVar;
        Iterator it;
        rt8 rt8Var = this;
        e23 e23Var2 = e23Var;
        jt8 jt8Var3 = jt8Var;
        szb szbVar2 = jt8Var3.I;
        gc8 gc8Var = e23Var2.a;
        ngg.Q(viewGroup, gc8Var, list, (szm) rt8Var.e);
        xzb xzbVar2 = e23Var2.b;
        if (!(viewGroup instanceof f09)) {
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                dp8 d = ((k79) it2.next()).a.d();
                boolean z = viewGroup instanceof c2a;
                gt8 gt8Var = gt8.HORIZONTAL;
                if (z) {
                    if (szbVar2.a(xzbVar2) == gt8Var) {
                        P(d.a(), d, dfbVar, "wrap layout mode", "cross");
                    } else {
                        P(d.c(), d, dfbVar, "wrap layout mode", "cross");
                    }
                } else if (viewGroup instanceof p89) {
                    if (szbVar2.a(xzbVar2) == gt8Var) {
                        if (jt8Var3.c0 instanceof ak9) {
                            P(d.c(), d, dfbVar, "wrap_content size", "main");
                        }
                    } else if (jt8Var3.v instanceof ak9) {
                        do8 do8Var = jt8Var3.i;
                        if (do8Var != null) {
                            szbVar = szbVar2;
                            it = it2;
                            if (((float) ((Number) do8Var.a.a(xzbVar2)).doubleValue()) != 0.0f) {
                                szbVar2 = szbVar;
                                it2 = it;
                            }
                        } else {
                            szbVar = szbVar2;
                            it = it2;
                        }
                        P(d.a(), d, dfbVar, "wrap_content size", "main");
                        szbVar2 = szbVar;
                        it2 = it;
                    }
                }
                szbVar = szbVar2;
                it = it2;
                szbVar2 = szbVar;
                it2 = it;
            }
        }
        pr8 pr8Var = jt8Var3.z;
        szb szbVar3 = jt8Var3.p;
        szb szbVar4 = jt8Var3.o;
        if (pr8Var == null || list == null) {
            ArrayList arrayList2 = new ArrayList();
            Iterator it3 = list.iterator();
            int i = 0;
            while (it3.hasNext()) {
                Object next = it3.next();
                int i2 = i + 1;
                if (i < 0) {
                    u75.n();
                    throw null;
                }
                k79 k79Var = (k79) next;
                jc8 jc8Var2 = k79Var.a;
                if (jc8Var2.d().getId() == null) {
                    c = t75.c(jc8Var2);
                } else {
                    if (((dd9) rt8Var.g).a.a.get(gc8Var.getDataTag()) != null) {
                        l1j.f();
                        return;
                    }
                    c = t75.c(jc8Var2);
                }
                List list4 = c;
                ArrayList arrayList3 = new ArrayList(v75.o(list4, 10));
                for (Iterator it4 = list4.iterator(); it4.hasNext(); it4 = it4) {
                    arrayList3.add(new k79((jc8) it4.next(), k79Var.b));
                    it3 = it3;
                }
                arrayList3.size();
                z75.t(arrayList2, arrayList3);
                i = i2;
            }
            list3 = arrayList2;
        } else {
            list3 = list;
        }
        ArrayList K = wvo.K(list3, gd9.u, gd9.v);
        int i3 = 0;
        for (Object obj : list3) {
            int i4 = i3 + 1;
            if (i3 < 0) {
                u75.n();
                throw null;
            }
            k79 k79Var2 = (k79) obj;
            View childAt = viewGroup.getChildAt(i3);
            jc8 jc8Var3 = k79Var2.a;
            xzb xzbVar3 = k79Var2.b;
            pm9 b = pm9Var.b((String) K.get(i3));
            ArrayList arrayList4 = K;
            f29 f29Var = childAt instanceof f29 ? (f29) childAt : null;
            jc8 div = f29Var != null ? f29Var.getDiv() : null;
            d0c j = gc8Var.getRuntimeStore$div_release().j(b, jc8Var3, xzbVar3, xzbVar2);
            ((hp8) ((szm) rt8Var.f).get()).b(e23Var2.a(xzbVar3), childAt, jc8Var3, b);
            dp8 d2 = jc8Var3.d();
            dp8 d3 = div != null ? div.d() : null;
            xzb xzbVar4 = e23Var2.b;
            if (j != null && (xzbVar = j.a) != null) {
                xzbVar3 = xzbVar;
            }
            a0c A = a0g.A(childAt);
            if (gc8Var.getComplexRebindInProgress$div_release() || d3 == null) {
                a0cVar = A;
            } else {
                a0cVar = A;
                if (xp3.B(szbVar4, jt8Var2 != null ? jt8Var2.o : null)) {
                    if (xp3.B(szbVar3, jt8Var2 != null ? jt8Var2.p : null)) {
                        dp8 dp8Var = d3;
                        if (xp3.B(d2.u(), dp8Var.u())) {
                        }
                    }
                }
            }
            I(childAt, jt8Var3, d2, xzbVar4, xzbVar3);
            if (!(szbVar4 instanceof ozb) || !(szbVar3 instanceof ozb) || !xp3.V(d2.u()) || !xp3.V(d2.o())) {
                xzb xzbVar5 = xzbVar3;
                view = childAt;
                arrayList = arrayList4;
                a0c a0cVar2 = a0cVar;
                jc8Var = jc8Var3;
                Function1 iiVar = new ii(this, view, jt8Var3, d2, xzbVar4, xzbVar5, 8);
                a0cVar2.i(szbVar4.c(xzbVar4, iiVar));
                a0cVar2.i(szbVar3.c(xzbVar4, iiVar));
                szb u = d2.u();
                a0cVar2.i(u != null ? u.c(xzbVar5, iiVar) : null);
                szb o = d2.o();
                a0cVar2.i(o != null ? o.c(xzbVar5, iiVar) : null);
                if (vq1.V(jc8Var.d())) {
                    gc8Var.Y(view);
                } else {
                    gc8Var.u(view, jc8Var);
                }
                rt8Var = this;
                e23Var2 = e23Var;
                jt8Var3 = jt8Var;
                i3 = i4;
                K = arrayList;
            }
            arrayList = arrayList4;
            view = childAt;
            jc8Var = jc8Var3;
            if (vq1.V(jc8Var.d())) {
            }
            rt8Var = this;
            e23Var2 = e23Var;
            jt8Var3 = jt8Var;
            i3 = i4;
            K = arrayList;
        }
        viewGroup.getClass();
        ((mr8) viewGroup).setItems(list3);
        bg3.l0(viewGroup, gc8Var, list3, list2);
    }

    public void K(j79 j79Var, e23 e23Var, l49 l49Var, l49 l49Var2) {
        Drawable nativeBackground$div_release;
        Drawable drawable;
        szb szbVar;
        xzb xzbVar = e23Var.b;
        k49 k49Var = l49Var.K;
        int intValue = (k49Var == null || (szbVar = k49Var.a) == null) ? 0 : ((Number) szbVar.a(xzbVar)).intValue();
        if (intValue == 0 || (nativeBackground$div_release = j79Var.getNativeBackground$div_release()) == null) {
            drawable = null;
        } else {
            nativeBackground$div_release.setTint(intValue);
            drawable = nativeBackground$div_release;
        }
        a0c A = a0g.A(j79Var);
        this.c.b(j79Var, e23Var, l49Var, l49Var2, A, false, drawable);
        gp8.c(j79Var, l49Var, l49Var2, e23Var.b, A);
    }

    /* JADX WARN: Code restructure failed: missing block: B:145:0x015e, code lost:
    
        if (defpackage.xp3.V(r2 != null ? r2.b : null) != false) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:195:0x0321, code lost:
    
        if (defpackage.xp3.B(r2, r24 != null ? r24.p : null) != false) goto L222;
     */
    /* JADX WARN: Code restructure failed: missing block: B:216:0x0391, code lost:
    
        if (defpackage.xp3.B(r1 != null ? r1.b : null, r2 != null ? r2.b : null) != false) goto L250;
     */
    /* JADX WARN: Code restructure failed: missing block: B:217:0x0393, code lost:
    
        r2 = r6;
        r0 = r3;
        r3 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:293:0x052c, code lost:
    
        if (defpackage.xp3.B(r1 != null ? r1.b : null, r0 != null ? r0.b : null) != false) goto L380;
     */
    /* JADX WARN: Code restructure failed: missing block: B:294:0x052e, code lost:
    
        r0 = r20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00bb, code lost:
    
        if (defpackage.xp3.B(r11, r24 != null ? r24.p : null) != false) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:395:0x055b, code lost:
    
        if (defpackage.xp3.V(r1 != null ? r1.b : null) != false) goto L380;
     */
    /* JADX WARN: Code restructure failed: missing block: B:443:0x03c1, code lost:
    
        if (defpackage.xp3.V(r1 != null ? r1.b : null) != false) goto L250;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x012d, code lost:
    
        if (defpackage.xp3.B(r2 != null ? r2.b : null, r5 != null ? r5.b : null) != false) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x012f, code lost:
    
        r12 = r23;
        r13 = r24;
        r1 = r2;
        r2 = r6;
     */
    /* JADX WARN: Removed duplicated region for block: B:92:0x028a  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0295  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void M(ViewGroup viewGroup, e23 e23Var, jt8 jt8Var, jt8 jt8Var2) {
        szb szbVar;
        szb szbVar2;
        szb szbVar3;
        szb szbVar4;
        szb szbVar5;
        szb szbVar6;
        szb szbVar7;
        szb szbVar8;
        szb szbVar9;
        szb szbVar10;
        xzb xzbVar;
        rt8 rt8Var = this;
        bd8 bd8Var = jt8Var.b;
        szb szbVar11 = jt8Var.p;
        szb szbVar12 = jt8Var.o;
        szb szbVar13 = jt8Var.A;
        szb szbVar14 = jt8Var.I;
        bg3.k(viewGroup, e23Var, bd8Var, jt8Var.d, jt8Var.G, jt8Var.r, jt8Var.x, jt8Var.w, jt8Var.L, jt8Var.K, jt8Var.c, jt8Var.l);
        xzb xzbVar2 = e23Var.b;
        gc8 gc8Var = e23Var.a;
        dfb a = rt8Var.d.a(gc8Var.getDivData(), gc8Var.getDataTag());
        bg3.p(viewGroup, jt8Var.i, jt8Var2 != null ? jt8Var2.i : null, xzbVar2);
        bg3.q(viewGroup, jt8Var.m, jt8Var2 != null ? jt8Var2.m : null, xzbVar2);
        if (viewGroup instanceof p89) {
            p89 p89Var = (p89) viewGroup;
            if (!xp3.B(szbVar14, jt8Var2 != null ? jt8Var2.I : null)) {
                p89Var.setOrientation(kt8.a[((gt8) szbVar14.a(xzbVar2)).ordinal()] != 1 ? 1 : 0);
                if (!(szbVar14 instanceof ozb)) {
                    p89Var.i(szbVar14.c(xzbVar2, new ot8(p89Var, rt8Var)));
                }
            }
            if (xp3.B(szbVar12, jt8Var2 != null ? jt8Var2.o : null)) {
                szbVar7 = szbVar11;
            } else {
                szbVar7 = szbVar11;
            }
            p89Var.setGravity(vq1.O((du8) szbVar12.a(xzbVar2), (eu8) szbVar7.a(xzbVar2)));
            if (!(szbVar12 instanceof ozb) || !(szbVar7 instanceof ozb)) {
                lj0 lj0Var = new lj0(17, jt8Var, xzbVar2, p89Var);
                p89Var.i(szbVar12.c(xzbVar2, lj0Var));
                p89Var.i(szbVar7.c(xzbVar2, lj0Var));
            }
            ht8 ht8Var = jt8Var.P;
            ht8 ht8Var2 = jt8Var2 != null ? jt8Var2.P : null;
            if (xp3.B(ht8Var != null ? ht8Var.c : null, ht8Var2 != null ? ht8Var2.c : null)) {
                if (xp3.B(ht8Var != null ? ht8Var.d : null, ht8Var2 != null ? ht8Var2.d : null)) {
                }
            }
            p89Var.setShowDividers(R(ht8Var, xzbVar2));
            if (xp3.V(ht8Var != null ? ht8Var.c : null)) {
                if (xp3.V(ht8Var != null ? ht8Var.d : null)) {
                }
            }
            jt8 jt8Var3 = jt8Var;
            jt8 jt8Var4 = jt8Var2;
            ht8 ht8Var3 = ht8Var;
            xzb xzbVar3 = xzbVar2;
            qt8 qt8Var = new qt8(ht8Var3, xzbVar3, p89Var, rt8Var, xzbVar2);
            p89Var = p89Var;
            rt8Var = rt8Var;
            p89Var.i((ht8Var3 == null || (szbVar10 = ht8Var3.c) == null) ? null : szbVar10.c(xzbVar3, qt8Var));
            p89Var.i((ht8Var3 == null || (szbVar9 = ht8Var3.d) == null) ? null : szbVar9.c(xzbVar3, qt8Var));
            p89Var.i((ht8Var3 == null || (szbVar8 = ht8Var3.b) == null) ? null : szbVar8.c(xzbVar3, qt8Var));
            ht8 ht8Var4 = jt8Var4 != null ? jt8Var4.P : null;
            if (!vut.v(ht8Var3 != null ? ht8Var3.e : null, ht8Var4 != null ? ht8Var4.e : null)) {
                dx8 dx8Var = ht8Var3 != null ? ht8Var3.e : null;
                p89Var.setDividerDrawable(dx8Var != null ? vq1.g0(dx8Var, p89Var.getResources().getDisplayMetrics(), xzbVar3) : null);
                if (!vut.K(ht8Var3 != null ? ht8Var3.e : null)) {
                    sk3.J(p89Var, ht8Var3 != null ? ht8Var3.e : null, xzbVar3, new qt8(ht8Var3, xzbVar3, p89Var, xzbVar3));
                }
            }
            ht8 ht8Var5 = jt8Var4 != null ? jt8Var4.P : null;
            if (!vut.w(ht8Var3 != null ? ht8Var3.a : null, ht8Var5 != null ? ht8Var5.a : null)) {
                Rect G = G(rt8Var, ht8Var3 != null ? ht8Var3.a : null, p89Var.getResources(), xzbVar3);
                int i = G.left;
                int i2 = G.top;
                int i3 = G.right;
                int i4 = G.bottom;
                p89Var.p = i;
                p89Var.q = i3;
                p89Var.n = i2;
                p89Var.o = i4;
                p89Var.requestLayout();
                ix8 ix8Var = ht8Var3 != null ? ht8Var3.a : null;
                if (ix8Var != null && !vut.L(ix8Var)) {
                    ak0 ak0Var = new ak0(ix8Var, xzbVar3, rt8Var, p89Var, xzbVar3);
                    xzbVar = xzbVar3;
                    szb szbVar15 = ix8Var.f;
                    szb szbVar16 = ix8Var.b;
                    p89Var.i(szbVar15.c(xzbVar, ak0Var));
                    p89Var.i(ix8Var.a.c(xzbVar, ak0Var));
                    szb szbVar17 = ix8Var.e;
                    if (szbVar17 == null && szbVar16 == null) {
                        p89Var.i(ix8Var.c.c(xzbVar, ak0Var));
                        p89Var.i(ix8Var.d.c(xzbVar, ak0Var));
                    } else {
                        p89Var.i(szbVar17 != null ? szbVar17.c(xzbVar, ak0Var) : null);
                        p89Var.i(szbVar16 != null ? szbVar16.c(xzbVar, ak0Var) : null);
                    }
                    if (!xp3.B(szbVar13, jt8Var4 != null ? jt8Var4.A : null)) {
                        p89Var.setItemSpacing(bg3.w(Long.valueOf(((Number) szbVar13.a(xzbVar)).longValue()), p89Var.getResources().getDisplayMetrics()));
                        if (!(szbVar13 instanceof ozb)) {
                            p89Var.i(szbVar13.c(xzbVar, new ot8(p89Var)));
                        }
                    }
                    O(jt8Var3, xzbVar, a);
                    return;
                }
            }
            xzbVar = xzbVar3;
            if (!xp3.B(szbVar13, jt8Var4 != null ? jt8Var4.A : null)) {
            }
            O(jt8Var3, xzbVar, a);
            return;
        }
        if (viewGroup instanceof c2a) {
            c2a c2aVar = (c2a) viewGroup;
            szb szbVar18 = jt8Var.F;
            if (!xp3.B(szbVar14, jt8Var2 != null ? jt8Var2.I : null)) {
                c2aVar.setWrapDirection(kt8.a[((gt8) szbVar14.a(xzbVar2)).ordinal()] != 1 ? 1 : 0);
                if (!(szbVar14 instanceof ozb)) {
                    c2aVar.i(szbVar14.c(xzbVar2, new pt8(c2aVar, rt8Var)));
                }
            }
            if (xp3.B(szbVar12, jt8Var2 != null ? jt8Var2.o : null)) {
            }
            c2aVar.setGravity(vq1.O((du8) szbVar12.a(xzbVar2), (eu8) szbVar11.a(xzbVar2)));
            if (!(szbVar12 instanceof ozb) || !(szbVar11 instanceof ozb)) {
                lj0 lj0Var2 = new lj0(18, jt8Var, xzbVar2, c2aVar);
                c2aVar.i(szbVar12.c(xzbVar2, lj0Var2));
                c2aVar.i(szbVar11.c(xzbVar2, lj0Var2));
            }
            ht8 ht8Var6 = jt8Var.P;
            ht8 ht8Var7 = jt8Var2 != null ? jt8Var2.P : null;
            if (xp3.B(ht8Var6 != null ? ht8Var6.c : null, ht8Var7 != null ? ht8Var7.c : null)) {
                if (xp3.B(ht8Var6 != null ? ht8Var6.d : null, ht8Var7 != null ? ht8Var7.d : null)) {
                }
            }
            c2aVar.setShowSeparators(R(ht8Var6, xzbVar2));
            if (xp3.V(ht8Var6 != null ? ht8Var6.c : null)) {
                if (xp3.V(ht8Var6 != null ? ht8Var6.d : null)) {
                }
            }
            xzb xzbVar4 = xzbVar2;
            c2a c2aVar2 = c2aVar;
            nt8 nt8Var = new nt8(ht8Var6, xzbVar4, c2aVar2, rt8Var, xzbVar4, 2);
            rt8 rt8Var2 = rt8Var;
            c2aVar2.i((ht8Var6 == null || (szbVar3 = ht8Var6.c) == null) ? null : szbVar3.c(xzbVar4, nt8Var));
            c2aVar2.i((ht8Var6 == null || (szbVar2 = ht8Var6.d) == null) ? null : szbVar2.c(xzbVar4, nt8Var));
            c2aVar2.i((ht8Var6 == null || (szbVar = ht8Var6.b) == null) ? null : szbVar.c(xzbVar4, nt8Var));
            ht8 ht8Var8 = jt8Var2 != null ? jt8Var2.P : null;
            if (!vut.v(ht8Var6 != null ? ht8Var6.e : null, ht8Var8 != null ? ht8Var8.e : null)) {
                dx8 dx8Var2 = ht8Var6 != null ? ht8Var6.e : null;
                c2aVar2.setSeparatorDrawable(dx8Var2 != null ? vq1.g0(dx8Var2, c2aVar2.getResources().getDisplayMetrics(), xzbVar4) : null);
                if (!vut.K(ht8Var6 != null ? ht8Var6.e : null)) {
                    c2a c2aVar3 = c2aVar2;
                    c2aVar2 = c2aVar3;
                    sk3.J(c2aVar2, ht8Var6 != null ? ht8Var6.e : null, xzbVar4, new nt8(ht8Var6, xzbVar4, c2aVar3, xzbVar4, 3));
                }
            }
            ht8 ht8Var9 = jt8Var2 != null ? jt8Var2.P : null;
            if (!vut.w(ht8Var6 != null ? ht8Var6.a : null, ht8Var9 != null ? ht8Var9.a : null)) {
                Rect G2 = G(rt8Var2, ht8Var6 != null ? ht8Var6.a : null, c2aVar2.getResources(), xzbVar4);
                int i5 = G2.left;
                int i6 = G2.top;
                int i7 = G2.right;
                int i8 = G2.bottom;
                c2aVar2.m = i5;
                c2aVar2.n = i7;
                c2aVar2.k = i6;
                c2aVar2.l = i8;
                c2aVar2.requestLayout();
                ix8 ix8Var2 = ht8Var6 != null ? ht8Var6.a : null;
                if (ix8Var2 != null && !vut.L(ix8Var2)) {
                    c2a c2aVar4 = c2aVar2;
                    mt8 mt8Var = new mt8(ix8Var2, xzbVar4, this, c2aVar4, xzbVar4, 1);
                    c2aVar2 = c2aVar4;
                    szb szbVar19 = ix8Var2.f;
                    szb szbVar20 = ix8Var2.b;
                    c2aVar2.i(szbVar19.c(xzbVar4, mt8Var));
                    c2aVar2.i(ix8Var2.a.c(xzbVar4, mt8Var));
                    szb szbVar21 = ix8Var2.e;
                    if (szbVar21 == null && szbVar20 == null) {
                        c2aVar2.i(ix8Var2.c.c(xzbVar4, mt8Var));
                        c2aVar2.i(ix8Var2.d.c(xzbVar4, mt8Var));
                    } else {
                        c2aVar2.i(szbVar21 != null ? szbVar21.c(xzbVar4, mt8Var) : null);
                        c2aVar2.i(szbVar20 != null ? szbVar20.c(xzbVar4, mt8Var) : null);
                    }
                }
            }
            ht8 ht8Var10 = jt8Var.E;
            ht8 ht8Var11 = jt8Var2 != null ? jt8Var2.E : null;
            if (xp3.B(ht8Var10 != null ? ht8Var10.c : null, ht8Var11 != null ? ht8Var11.c : null)) {
                if (xp3.B(ht8Var10 != null ? ht8Var10.d : null, ht8Var11 != null ? ht8Var11.d : null)) {
                }
            }
            c2aVar2.setShowLineSeparators(R(ht8Var10, xzbVar4));
            if (xp3.V(ht8Var10 != null ? ht8Var10.c : null)) {
                if (xp3.V(ht8Var10 != null ? ht8Var10.d : null)) {
                }
            }
            nt8 nt8Var2 = new nt8(ht8Var10, xzbVar4, c2aVar2, this, xzbVar4, 0);
            rt8 rt8Var3 = this;
            c2aVar2.i((ht8Var10 == null || (szbVar6 = ht8Var10.c) == null) ? null : szbVar6.c(xzbVar4, nt8Var2));
            c2aVar2.i((ht8Var10 == null || (szbVar5 = ht8Var10.d) == null) ? null : szbVar5.c(xzbVar4, nt8Var2));
            c2aVar2.i((ht8Var10 == null || (szbVar4 = ht8Var10.b) == null) ? null : szbVar4.c(xzbVar4, nt8Var2));
            ht8 ht8Var12 = jt8Var2 != null ? jt8Var2.E : null;
            if (!vut.v(ht8Var10 != null ? ht8Var10.e : null, ht8Var12 != null ? ht8Var12.e : null)) {
                dx8 dx8Var3 = ht8Var10 != null ? ht8Var10.e : null;
                c2aVar2.setLineSeparatorDrawable(dx8Var3 != null ? vq1.g0(dx8Var3, c2aVar2.getResources().getDisplayMetrics(), xzbVar4) : null);
                if (!vut.K(ht8Var10 != null ? ht8Var10.e : null)) {
                    c2a c2aVar5 = c2aVar2;
                    c2aVar2 = c2aVar5;
                    sk3.J(c2aVar2, ht8Var10 != null ? ht8Var10.e : null, xzbVar4, new nt8(ht8Var10, xzbVar4, c2aVar5, xzbVar4, 1));
                }
            }
            ht8 ht8Var13 = jt8Var2 != null ? jt8Var2.E : null;
            if (!vut.w(ht8Var10 != null ? ht8Var10.a : null, ht8Var13 != null ? ht8Var13.a : null)) {
                Rect G3 = G(rt8Var3, ht8Var10 != null ? ht8Var10.a : null, c2aVar2.getResources(), xzbVar4);
                int i9 = G3.left;
                int i10 = G3.top;
                int i11 = G3.right;
                int i12 = G3.bottom;
                c2aVar2.s = i9;
                c2aVar2.t = i11;
                c2aVar2.q = i10;
                c2aVar2.r = i12;
                c2aVar2.requestLayout();
                ix8 ix8Var3 = ht8Var10 != null ? ht8Var10.a : null;
                if (ix8Var3 != null && !vut.L(ix8Var3)) {
                    c2a c2aVar6 = c2aVar2;
                    mt8 mt8Var2 = new mt8(ix8Var3, xzbVar4, this, c2aVar6, xzbVar4, 0);
                    c2aVar2 = c2aVar6;
                    szb szbVar22 = ix8Var3.f;
                    szb szbVar23 = ix8Var3.b;
                    c2aVar2.i(szbVar22.c(xzbVar4, mt8Var2));
                    c2aVar2.i(ix8Var3.a.c(xzbVar4, mt8Var2));
                    szb szbVar24 = ix8Var3.e;
                    if (szbVar24 == null && szbVar23 == null) {
                        c2aVar2.i(ix8Var3.c.c(xzbVar4, mt8Var2));
                        c2aVar2.i(ix8Var3.d.c(xzbVar4, mt8Var2));
                    } else {
                        c2aVar2.i(szbVar24 != null ? szbVar24.c(xzbVar4, mt8Var2) : null);
                        c2aVar2.i(szbVar23 != null ? szbVar23.c(xzbVar4, mt8Var2) : null);
                    }
                }
            }
            if (!xp3.B(szbVar13, jt8Var2 != null ? jt8Var2.A : null)) {
                c2aVar2.setItemSpacing(bg3.w(Long.valueOf(((Number) szbVar13.a(xzbVar4)).longValue()), c2aVar2.getResources().getDisplayMetrics()));
                if (!(szbVar13 instanceof ozb)) {
                    c2aVar2.i(szbVar13.c(xzbVar4, new pt8(c2aVar2)));
                }
            }
            if (!xp3.B(szbVar18, jt8Var2 != null ? jt8Var2.F : null)) {
                DisplayMetrics displayMetrics = c2aVar2.getResources().getDisplayMetrics();
                c2aVar2.setLineSpacing(bg3.w((Long) szbVar18.a(xzbVar4), displayMetrics));
                if (!(szbVar18 instanceof ozb)) {
                    c2aVar2.i(szbVar18.c(xzbVar4, new sv4(21, c2aVar2, displayMetrics)));
                }
            }
            O(jt8Var, xzbVar4, a);
            long longValue = ((Number) szbVar18.a(xzbVar4)).longValue();
            if ((R(jt8Var.E, xzbVar4) & 2) == 0 || longValue == 0) {
                return;
            }
            a.e(new Throwable("line_spacing will be ignored due to the 'line_separator' property."));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0096  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void N(ViewGroup viewGroup, e23 e23Var, jt8 jt8Var, jt8 jt8Var2, xzb xzbVar, pm9 pm9Var, boolean z) {
        List list;
        rt8 rt8Var;
        ViewGroup viewGroup2;
        e23 e23Var2;
        jt8 jt8Var3;
        pm9 pm9Var2;
        jt8 jt8Var4;
        List list2;
        List list3;
        dfb dfbVar;
        gc8 gc8Var = e23Var.a;
        xzb xzbVar2 = e23Var.b;
        List list4 = jt8Var.B;
        pr8 pr8Var = jt8Var.z;
        List<k79> x = qwp.x(list4, pr8Var, xzbVar2);
        viewGroup.getClass();
        List items = ((mr8) viewGroup).getItems();
        if (items == null) {
            for (k79 k79Var : x) {
                viewGroup.addView(((p0a) ((szm) this.e).get()).W(k79Var.a, k79Var.b));
            }
        } else if (jt8Var != jt8Var2) {
            if (!gc8Var.getComplexRebindInProgress$div_release()) {
                if (jt8Var2 == null || !h1b.E(jt8Var2, jt8Var, xzbVar, xzbVar2) || !h1b.A(items, x)) {
                    Q(viewGroup, gc8Var, items, x);
                }
            }
            list = null;
            dfb a = this.d.a(gc8Var.getDivData(), gc8Var.getDataTag());
            if (z) {
                rt8Var = this;
                viewGroup2 = viewGroup;
                e23Var2 = e23Var;
                jt8Var3 = jt8Var;
                pm9Var2 = pm9Var;
                jt8Var4 = jt8Var2;
                list2 = x;
                list3 = list;
            } else {
                if (pr8Var == null) {
                    dfbVar = a;
                } else {
                    dfbVar = a;
                    bg3.r(pr8Var, xzbVar2, new lt8(pr8Var, e23Var, viewGroup, this, jt8Var, pm9Var, dfbVar, 0));
                }
                a = dfbVar;
                rt8Var = this;
                viewGroup2 = viewGroup;
                e23Var2 = e23Var;
                jt8Var3 = jt8Var;
                jt8Var4 = jt8Var2;
                list2 = x;
                list3 = list;
                pm9Var2 = pm9Var;
            }
            rt8Var.J(viewGroup2, e23Var2, jt8Var3, jt8Var4, list2, list3, pm9Var2, a);
        }
        list = items;
        dfb a2 = this.d.a(gc8Var.getDivData(), gc8Var.getDataTag());
        if (z) {
        }
        rt8Var.J(viewGroup2, e23Var2, jt8Var3, jt8Var4, list2, list3, pm9Var2, a2);
    }

    public void Q(ViewGroup viewGroup, gc8 gc8Var, List list, List list2) {
        Iterable iterable;
        Object obj;
        boolean z;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        List list3 = list;
        if (viewGroup.getChildCount() > 0) {
            int i = 0 + 1;
            View childAt = viewGroup.getChildAt(0);
            if (childAt == null) {
                rj7.m();
                return;
            }
            if (i < viewGroup.getChildCount()) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(childAt);
                while (true) {
                    if (!(i < viewGroup.getChildCount())) {
                        iterable = arrayList;
                        break;
                    }
                    int i2 = i + 1;
                    View childAt2 = viewGroup.getChildAt(i);
                    if (childAt2 == null) {
                        rj7.m();
                        return;
                    } else {
                        arrayList.add(childAt2);
                        i = i2;
                    }
                }
            } else {
                iterable = t75.c(childAt);
            }
        } else {
            iterable = c5b.a;
        }
        Iterable iterable2 = iterable;
        Iterator it = list3.iterator();
        Iterator it2 = iterable2.iterator();
        ArrayList arrayList2 = new ArrayList(Math.min(v75.o(list3, 10), v75.o(iterable2, 10)));
        while (it.hasNext() && it2.hasNext()) {
            linkedHashMap.put(((k79) it.next()).a, (View) it2.next());
            arrayList2.add(Unit.a);
        }
        viewGroup.removeAllViews();
        ArrayList arrayList3 = new ArrayList();
        Iterator it3 = list2.iterator();
        int i3 = 0;
        while (true) {
            Object obj2 = null;
            if (!it3.hasNext()) {
                Iterator it4 = arrayList3.iterator();
                while (it4.hasNext()) {
                    int intValue = ((Number) it4.next()).intValue();
                    k79 k79Var = (k79) list2.get(intValue);
                    Iterator it5 = linkedHashMap.keySet().iterator();
                    while (true) {
                        if (!it5.hasNext()) {
                            obj = null;
                            break;
                        } else {
                            obj = it5.next();
                            if (vq1.X((jc8) obj).equals(vq1.X(k79Var.a))) {
                                break;
                            }
                        }
                    }
                    View view = (View) wct.n(linkedHashMap).remove((jc8) obj);
                    if (view == null) {
                        view = ((p0a) ((szm) this.e).get()).W(k79Var.a, k79Var.b);
                    }
                    viewGroup.addView(view, intValue);
                }
                Iterator it6 = linkedHashMap.values().iterator();
                while (it6.hasNext()) {
                    yd5.R(gc8Var.getReleaseViewVisitor$div_release(), (View) it6.next());
                }
                return;
            }
            Object next = it3.next();
            int i4 = i3 + 1;
            if (i3 < 0) {
                u75.n();
                throw null;
            }
            k79 k79Var2 = (k79) next;
            Iterator it7 = linkedHashMap.keySet().iterator();
            while (true) {
                if (!it7.hasNext()) {
                    break;
                }
                Object next2 = it7.next();
                jc8 jc8Var = (jc8) next2;
                if (vq1.a0(jc8Var)) {
                    z = vq1.X(k79Var2.a).equals(vq1.X(jc8Var));
                } else {
                    jc8 jc8Var2 = k79Var2.a;
                    xzb xzbVar = k79Var2.b;
                    if (vq1.X(jc8Var).equals(vq1.X(jc8Var2))) {
                        dp8 d = jc8Var.d();
                        dp8 d2 = jc8Var2.d();
                        if ((d instanceof i29) && (d2 instanceof i29)) {
                            z = Intrinsics.d(((i29) d).B.a(xzbVar), ((i29) d2).B.a(xzbVar));
                        } else if (d.d() == d2.d()) {
                            z = true;
                        }
                    }
                    z = false;
                }
                if (z) {
                    obj2 = next2;
                    break;
                }
            }
            View view2 = (View) wct.n(linkedHashMap).remove((jc8) obj2);
            if (view2 != null) {
                viewGroup.addView(view2);
            } else {
                arrayList3.add(Integer.valueOf(i3));
            }
            i3 = i4;
        }
    }

    @Override // defpackage.p9
    public /* bridge */ /* synthetic */ void j(View view, e23 e23Var, dp8 dp8Var, dp8 dp8Var2) {
        switch (this.b) {
            case 0:
                M((ViewGroup) view, e23Var, (jt8) dp8Var, (jt8) dp8Var2);
                break;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0366  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0307  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x02af  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0288  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x023c  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0237  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0241  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x02f5  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x03e6  */
    /* JADX WARN: Removed duplicated region for block: B:97:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    @Override // defpackage.p9
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void k(View view, e23 e23Var, dp8 dp8Var, dp8 dp8Var2, pm9 pm9Var) {
        l49 l49Var;
        rt8 rt8Var;
        l49 l49Var2;
        szb szbVar;
        szb szbVar2;
        szb szbVar3;
        szb szbVar4;
        v59 v59Var;
        w59 a;
        szb szbVar5;
        ja8 c;
        rt8 rt8Var2;
        String str;
        j79 j79Var;
        gc8 gc8Var;
        List list;
        one focusTracker$div_release;
        ja8 ja8Var;
        szb szbVar6;
        switch (this.b) {
            case 1:
                j79 j79Var2 = (j79) view;
                l49 l49Var3 = (l49) dp8Var;
                l49 l49Var4 = (l49) dp8Var2;
                xzb xzbVar = e23Var.b;
                gc8 gc8Var2 = e23Var.a;
                j79Var2.setTextAlignment(5);
                j79Var2.setAccessibilityEnabled$div_release(((zb) this.h).a(j79Var2.getContext()));
                k49 k49Var = l49Var3.K;
                k49 k49Var2 = l49Var4 != null ? l49Var4.K : null;
                if (!((k49Var == null && k49Var2 == null) ? true : xp3.B(k49Var != null ? k49Var.a : null, k49Var2 != null ? k49Var2.a : null))) {
                    K(j79Var2, e23Var, l49Var3, l49Var4);
                    if (!(k49Var == null ? true : k49Var.a instanceof ozb)) {
                        if (k49Var == null || (szbVar6 = k49Var.a) == null) {
                            l49Var = l49Var4;
                            rt8Var = this;
                            l49Var2 = l49Var3;
                            ja8Var = null;
                        } else {
                            l49Var = l49Var4;
                            ii iiVar = new ii(this, j79Var2, e23Var, l49Var3, l49Var, 13);
                            j79Var2 = j79Var2;
                            rt8Var = this;
                            l49Var2 = l49Var3;
                            ja8Var = szbVar6.d(xzbVar, iiVar);
                        }
                        j79Var2.i(ja8Var);
                        j79 j79Var3 = j79Var2;
                        l49 l49Var5 = l49Var2;
                        woe.q(j79Var3, l49Var2.q, l49Var2.r, l49Var2.E, l49Var2.S, l49Var2.F, l49Var2.p, l49Var2.t, l49Var2.u, l49Var2.s, l49Var == null ? l49Var.q : null, l49Var == null ? l49Var.r : null, l49Var == null ? l49Var.E : null, l49Var == null ? l49Var.S : null, l49Var == null ? l49Var.F : null, l49Var == null ? l49Var.p : null, l49Var == null ? l49Var.t : null, l49Var == null ? l49Var.u : null, l49Var == null ? l49Var.s : null, l49Var, (ly9) rt8Var.e, xzbVar);
                        szb szbVar7 = l49Var5.Q;
                        szb szbVar8 = l49Var5.R;
                        L(j79Var3, (om8) szbVar7.a(xzbVar), (pm8) szbVar8.a(xzbVar));
                        ak0 ak0Var = new ak0(this, j79Var3, szbVar7, xzbVar, szbVar8, 10);
                        j79Var3.i(szbVar7.c(xzbVar, ak0Var));
                        j79Var3.i(szbVar8.c(xzbVar, ak0Var));
                        szbVar = l49Var5.J;
                        if (szbVar != null) {
                            j79Var3.i(szbVar.d(xzbVar, new p49(j79Var3, szbVar, xzbVar, 3)));
                        }
                        szbVar2 = l49Var5.I;
                        if (szbVar2 != null) {
                            j79Var3.i(szbVar2.d(xzbVar, new p49(j79Var3, szbVar2, xzbVar, 2)));
                        }
                        szbVar3 = l49Var5.z;
                        if (szbVar3 != null) {
                            j79Var3.i(szbVar3.d(xzbVar, new p49(j79Var3, szbVar3, xzbVar, 1)));
                        }
                        j79Var3.i(l49Var5.y.d(xzbVar, new q49(j79Var3, l49Var5, xzbVar, 0)));
                        szbVar4 = l49Var5.x;
                        if (szbVar4 != null) {
                            j79Var3.i(szbVar4.d(xzbVar, new p49(j79Var3, szbVar4, xzbVar, 0)));
                        }
                        q49 q49Var = new q49(l49Var5, xzbVar, j79Var3, this);
                        j79Var3.i(l49Var5.C.c(xzbVar, q49Var));
                        j79Var3.i(l49Var5.f.d(xzbVar, q49Var));
                        j79Var3.i(l49Var5.l.d(xzbVar, new ii(l49Var5, xzbVar, j79Var3, this, e23Var, 14)));
                        j79Var3.i(l49Var5.O.d(xzbVar, new q49(j79Var3, l49Var5, xzbVar, 2)));
                        j79Var3.i(l49Var5.B.d(xzbVar, new az6(20, j79Var3)));
                        j79Var3.removeTextChangedListener(j79Var3.p);
                        j79Var3.o.clear();
                        j79Var3.p = null;
                        xqn xqnVar = new xqn();
                        xzb xzbVar2 = e23Var.b;
                        t49 t49Var = new t49(xqnVar, j79Var3, 0);
                        xqn xqnVar2 = new xqn();
                        dw8 dataTag = gc8Var2.getDataTag();
                        rv8 divData = gc8Var2.getDivData();
                        efb efbVar = this.d;
                        dfb a2 = efbVar.a(divData, dataTag);
                        s49 s49Var = new s49(l49Var5, xqnVar2, j79Var3, j79Var3.getKeyListener(), xzbVar2, t49Var, new y5(10, a2), a2);
                        v59Var = l49Var5.H;
                        String str2 = l49Var5.T;
                        a = v59Var == null ? v59Var.a() : null;
                        if (!(a instanceof zy8)) {
                            zy8 zy8Var = (zy8) a;
                            j79Var3.i(zy8Var.b.c(xzbVar2, s49Var));
                            for (yy8 yy8Var : zy8Var.c) {
                                j79Var3.i(yy8Var.a.c(xzbVar2, s49Var));
                                szb szbVar9 = yy8Var.c;
                                if (szbVar9 != null) {
                                    j79Var3.i(szbVar9.c(xzbVar2, s49Var));
                                }
                                j79Var3.i(yy8Var.b.c(xzbVar2, s49Var));
                            }
                            j79Var3.i(zy8Var.a.c(xzbVar2, s49Var));
                        } else if ((a instanceof tu8) && (szbVar5 = ((tu8) a).a) != null && (c = szbVar5.c(xzbVar2, s49Var)) != null) {
                            j79Var3.i(c);
                        }
                        s49Var.invoke(Unit.a);
                        xqn xqnVar3 = new xqn();
                        t49 t49Var2 = new t49(xqnVar3, j79Var3, 1);
                        if (v59Var == null) {
                            List<x49> list2 = l49Var5.n;
                            List list3 = list2;
                            if (list3 != null && !list3.isEmpty()) {
                                xzb xzbVar3 = e23Var.b;
                                ii iiVar2 = new ii(list2, t49Var2, xzbVar3, this, e23Var, 15);
                                rt8Var2 = this;
                                for (x49 x49Var : list2) {
                                    if (x49Var instanceof w49) {
                                        j79Var3.i(((w49) x49Var).b.a.c(xzbVar3, iiVar2));
                                    }
                                }
                                iiVar2.invoke(Unit.a);
                                if (v59Var != null) {
                                    String a3 = v59Var.a().a();
                                    if (a3 == null) {
                                        j79Var = j79Var3;
                                        gc8Var = gc8Var2;
                                        j79Var.setFocusTracker$div_release(gc8Var.getInputFocusTracker$div_release());
                                        focusTracker$div_release = j79Var.getFocusTracker$div_release();
                                        if (focusTracker$div_release == null && j79Var.getTag() != null && Intrinsics.d(j79Var.getTag(), focusTracker$div_release.a) && focusTracker$div_release.b) {
                                            focusTracker$div_release.c.a = true;
                                            j79Var.requestFocus();
                                            return;
                                        }
                                        return;
                                    }
                                    str = str2;
                                    str2 = a3;
                                } else {
                                    str = null;
                                }
                                j79Var3.i(((qct) rt8Var2.f).l(e23Var, str2, new dn9((xr2) xqnVar.a, (mne) xqnVar3.a, j79Var3, str, e23Var, 9)));
                                xzb xzbVar4 = e23Var.b;
                                ArrayList arrayList = new ArrayList();
                                dfb a4 = efbVar.a(gc8Var2.getDivData(), gc8Var2.getDataTag());
                                ii iiVar3 = new ii(rt8Var2, arrayList, j79Var3, gc8Var2, xzbVar4, 16);
                                j79Var3.addTextChangedListener(new u49(arrayList, this, j79Var3, gc8Var2, xzbVar4));
                                lt8 lt8Var = new lt8(arrayList, l49Var5, this, xzbVar4, a4, j79Var3, gc8Var2);
                                j79Var = j79Var3;
                                gc8Var = gc8Var2;
                                list = l49Var5.b0;
                                if (list != null) {
                                    int i = 0;
                                    for (Object obj : list) {
                                        int i2 = i + 1;
                                        if (i < 0) {
                                            u75.n();
                                            throw null;
                                        }
                                        k69 k69Var = (k69) obj;
                                        if (k69Var instanceof j69) {
                                            z69 z69Var = ((j69) k69Var).b;
                                            j79Var.i(z69Var.c.c(xzbVar4, lt8Var));
                                            j79Var.i(z69Var.b.c(xzbVar4, lt8Var));
                                            j79Var.i(z69Var.a.c(xzbVar4, lt8Var));
                                        } else {
                                            if (!(k69Var instanceof i69)) {
                                                b6e.s();
                                                return;
                                            }
                                            q69 q69Var = ((i69) k69Var).b;
                                            j79Var.i(q69Var.b.c(xzbVar4, new wk8(iiVar3, i, 1)));
                                            j79Var.i(q69Var.c.c(xzbVar4, lt8Var));
                                            j79Var.i(q69Var.a.c(xzbVar4, lt8Var));
                                        }
                                        i = i2;
                                    }
                                }
                                lt8Var.invoke(Unit.a);
                                j79Var.setFocusTracker$div_release(gc8Var.getInputFocusTracker$div_release());
                                focusTracker$div_release = j79Var.getFocusTracker$div_release();
                                if (focusTracker$div_release == null) {
                                    return;
                                } else {
                                    return;
                                }
                            }
                        }
                        rt8Var2 = this;
                        if (v59Var != null) {
                        }
                        j79Var3.i(((qct) rt8Var2.f).l(e23Var, str2, new dn9((xr2) xqnVar.a, (mne) xqnVar3.a, j79Var3, str, e23Var, 9)));
                        xzb xzbVar42 = e23Var.b;
                        ArrayList arrayList2 = new ArrayList();
                        dfb a42 = efbVar.a(gc8Var2.getDivData(), gc8Var2.getDataTag());
                        ii iiVar32 = new ii(rt8Var2, arrayList2, j79Var3, gc8Var2, xzbVar42, 16);
                        j79Var3.addTextChangedListener(new u49(arrayList2, this, j79Var3, gc8Var2, xzbVar42));
                        lt8 lt8Var2 = new lt8(arrayList2, l49Var5, this, xzbVar42, a42, j79Var3, gc8Var2);
                        j79Var = j79Var3;
                        gc8Var = gc8Var2;
                        list = l49Var5.b0;
                        if (list != null) {
                        }
                        lt8Var2.invoke(Unit.a);
                        j79Var.setFocusTracker$div_release(gc8Var.getInputFocusTracker$div_release());
                        focusTracker$div_release = j79Var.getFocusTracker$div_release();
                        if (focusTracker$div_release == null) {
                        }
                    }
                }
                l49Var = l49Var4;
                rt8Var = this;
                l49Var2 = l49Var3;
                j79 j79Var32 = j79Var2;
                if (l49Var == null) {
                }
                if (l49Var == null) {
                }
                l49 l49Var52 = l49Var2;
                woe.q(j79Var32, l49Var2.q, l49Var2.r, l49Var2.E, l49Var2.S, l49Var2.F, l49Var2.p, l49Var2.t, l49Var2.u, l49Var2.s, l49Var == null ? l49Var.q : null, l49Var == null ? l49Var.r : null, l49Var == null ? l49Var.E : null, l49Var == null ? l49Var.S : null, l49Var == null ? l49Var.F : null, l49Var == null ? l49Var.p : null, l49Var == null ? l49Var.t : null, l49Var == null ? l49Var.u : null, l49Var == null ? l49Var.s : null, l49Var, (ly9) rt8Var.e, xzbVar);
                szb szbVar72 = l49Var52.Q;
                szb szbVar82 = l49Var52.R;
                L(j79Var32, (om8) szbVar72.a(xzbVar), (pm8) szbVar82.a(xzbVar));
                ak0 ak0Var2 = new ak0(this, j79Var32, szbVar72, xzbVar, szbVar82, 10);
                j79Var32.i(szbVar72.c(xzbVar, ak0Var2));
                j79Var32.i(szbVar82.c(xzbVar, ak0Var2));
                szbVar = l49Var52.J;
                if (szbVar != null) {
                }
                szbVar2 = l49Var52.I;
                if (szbVar2 != null) {
                }
                szbVar3 = l49Var52.z;
                if (szbVar3 != null) {
                }
                j79Var32.i(l49Var52.y.d(xzbVar, new q49(j79Var32, l49Var52, xzbVar, 0)));
                szbVar4 = l49Var52.x;
                if (szbVar4 != null) {
                }
                q49 q49Var2 = new q49(l49Var52, xzbVar, j79Var32, this);
                j79Var32.i(l49Var52.C.c(xzbVar, q49Var2));
                j79Var32.i(l49Var52.f.d(xzbVar, q49Var2));
                j79Var32.i(l49Var52.l.d(xzbVar, new ii(l49Var52, xzbVar, j79Var32, this, e23Var, 14)));
                j79Var32.i(l49Var52.O.d(xzbVar, new q49(j79Var32, l49Var52, xzbVar, 2)));
                j79Var32.i(l49Var52.B.d(xzbVar, new az6(20, j79Var32)));
                j79Var32.removeTextChangedListener(j79Var32.p);
                j79Var32.o.clear();
                j79Var32.p = null;
                xqn xqnVar4 = new xqn();
                xzb xzbVar22 = e23Var.b;
                t49 t49Var3 = new t49(xqnVar4, j79Var32, 0);
                xqn xqnVar22 = new xqn();
                dw8 dataTag2 = gc8Var2.getDataTag();
                rv8 divData2 = gc8Var2.getDivData();
                efb efbVar2 = this.d;
                dfb a22 = efbVar2.a(divData2, dataTag2);
                s49 s49Var2 = new s49(l49Var52, xqnVar22, j79Var32, j79Var32.getKeyListener(), xzbVar22, t49Var3, new y5(10, a22), a22);
                v59Var = l49Var52.H;
                String str22 = l49Var52.T;
                if (v59Var == null) {
                }
                if (!(a instanceof zy8)) {
                }
                s49Var2.invoke(Unit.a);
                xqn xqnVar32 = new xqn();
                t49 t49Var22 = new t49(xqnVar32, j79Var32, 1);
                if (v59Var == null) {
                }
                rt8Var2 = this;
                if (v59Var != null) {
                }
                j79Var32.i(((qct) rt8Var2.f).l(e23Var, str22, new dn9((xr2) xqnVar4.a, (mne) xqnVar32.a, j79Var32, str, e23Var, 9)));
                xzb xzbVar422 = e23Var.b;
                ArrayList arrayList22 = new ArrayList();
                dfb a422 = efbVar2.a(gc8Var2.getDivData(), gc8Var2.getDataTag());
                ii iiVar322 = new ii(rt8Var2, arrayList22, j79Var32, gc8Var2, xzbVar422, 16);
                j79Var32.addTextChangedListener(new u49(arrayList22, this, j79Var32, gc8Var2, xzbVar422));
                lt8 lt8Var22 = new lt8(arrayList22, l49Var52, this, xzbVar422, a422, j79Var32, gc8Var2);
                j79Var = j79Var32;
                gc8Var = gc8Var2;
                list = l49Var52.b0;
                if (list != null) {
                }
                lt8Var22.invoke(Unit.a);
                j79Var.setFocusTracker$div_release(gc8Var.getInputFocusTracker$div_release());
                focusTracker$div_release = j79Var.getFocusTracker$div_release();
                if (focusTracker$div_release == null) {
                }
                break;
            default:
                super.k(view, e23Var, dp8Var, dp8Var2, pm9Var);
                return;
        }
    }

    public rt8(gp8 gp8Var, ly9 ly9Var, qct qctVar, qg8 qg8Var, zb zbVar, efb efbVar) {
        super(gp8Var);
        this.c = gp8Var;
        this.e = ly9Var;
        this.f = qctVar;
        this.g = qg8Var;
        this.h = zbVar;
        this.d = efbVar;
    }
}
