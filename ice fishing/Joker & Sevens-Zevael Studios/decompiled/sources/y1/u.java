package y1;

import android.content.ClipDescription;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.SpannableString;
import android.text.style.BackgroundColorSpan;
import android.text.style.ClickableSpan;
import android.text.style.ScaleXSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.TtsSpan;
import android.text.style.URLSpan;
import android.text.style.UnderlineSpan;
import android.util.Log;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import java.text.BreakIterator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.WeakHashMap;
import org.fortheloss.st.R;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class u extends f8.c {

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ y f8652j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(y yVar) {
        super(15);
        this.f8652j = yVar;
    }

    @Override // f8.c
    public final void k(int i10, i3.d dVar, String str, Bundle bundle) {
        this.f8652j.e(i10, dVar, str, bundle);
    }

    /* JADX WARN: Code restructure failed: missing block: B:406:0x0836, code lost:
    
        if (r2 == false) goto L429;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x012c, code lost:
    
        if (e2.n.j(4, r7).isEmpty() != false) goto L68;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0c69  */
    /* JADX WARN: Removed duplicated region for block: B:284:0x05de  */
    /* JADX WARN: Removed duplicated region for block: B:290:0x060d  */
    /* JADX WARN: Removed duplicated region for block: B:293:0x0612  */
    /* JADX WARN: Removed duplicated region for block: B:296:0x0631  */
    /* JADX WARN: Removed duplicated region for block: B:302:0x0668  */
    /* JADX WARN: Removed duplicated region for block: B:304:0x066b  */
    /* JADX WARN: Removed duplicated region for block: B:386:0x083d  */
    /* JADX WARN: Removed duplicated region for block: B:397:0x0817 A[LOOP:9: B:388:0x07fa->B:397:0x0817, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:398:0x081d A[EDGE_INSN: B:398:0x081d->B:399:0x081d BREAK  A[LOOP:9: B:388:0x07fa->B:397:0x0817], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:475:0x09da  */
    /* JADX WARN: Removed duplicated region for block: B:478:0x09f1  */
    /* JADX WARN: Removed duplicated region for block: B:481:0x09fb  */
    /* JADX WARN: Removed duplicated region for block: B:516:0x0a72  */
    /* JADX WARN: Removed duplicated region for block: B:519:0x0a89  */
    /* JADX WARN: Removed duplicated region for block: B:522:0x0a93  */
    /* JADX WARN: Removed duplicated region for block: B:600:0x0c76  */
    /* JADX WARN: Removed duplicated region for block: B:603:0x0655  */
    /* JADX WARN: Removed duplicated region for block: B:604:0x0617  */
    /* JADX WARN: Type inference failed for: r2v70, types: [bc.v] */
    /* JADX WARN: Type inference failed for: r2v71, types: [java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r2v72, types: [java.util.ArrayList] */
    @Override // f8.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final i3.d m(int i10) {
        AccessibilityManager accessibilityManager;
        s.r0 r0Var;
        y yVar;
        r rVar;
        s.s sVar;
        e2.n nVar;
        s.g0 g0Var;
        x1.g0 g0Var2;
        e2.g gVar;
        e2.j jVar;
        AccessibilityNodeInfo accessibilityNodeInfo;
        i3.d dVar;
        SpannableString spannableString;
        AccessibilityNodeInfo accessibilityNodeInfo2;
        e2.g gVar2;
        int i11;
        i3.d dVar2;
        int i12;
        Object g8;
        y yVar2;
        boolean z10;
        Object g10;
        r rVar2;
        i3.d dVar3;
        boolean z11;
        boolean z12;
        x1.g0 g0Var3;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16;
        boolean z17;
        ArrayList arrayList;
        ArrayList arrayList2;
        int i13;
        boolean z18;
        e2.n nVar2;
        int i14;
        androidx.lifecycle.w h10;
        y yVar3 = this.f8652j;
        AccessibilityManager accessibilityManager2 = yVar3.f8682g;
        r rVar3 = yVar3.f8679d;
        m viewTreeOwners = rVar3.getViewTreeOwners();
        if (((viewTreeOwners == null || (h10 = viewTreeOwners.f8582a.h()) == null) ? null : h10.f723c) == androidx.lifecycle.p.f697g) {
            if (!accessibilityManager2.isEnabled()) {
                dVar3 = new i3.d(AccessibilityNodeInfo.obtain());
                i12 = i10;
                yVar2 = yVar3;
                if (yVar2.f8693r) {
                    if (i12 == yVar2.f8689n) {
                        yVar2.f8691p = dVar3;
                    }
                    if (i12 == yVar2.f8690o) {
                        yVar2.f8692q = dVar3;
                    }
                }
                return dVar3;
            }
            dVar3 = null;
            i12 = i10;
            yVar2 = yVar3;
            if (yVar2.f8693r) {
            }
            return dVar3;
        }
        e2.o oVar = (e2.o) yVar3.o().b(i10);
        if (oVar == null) {
            if (!accessibilityManager2.isEnabled()) {
                dVar3 = new i3.d(AccessibilityNodeInfo.obtain());
                i12 = i10;
                yVar2 = yVar3;
                if (yVar2.f8693r) {
                }
                return dVar3;
            }
            dVar3 = null;
            i12 = i10;
            yVar2 = yVar3;
            if (yVar2.f8693r) {
            }
            return dVar3;
        }
        e2.n nVar3 = oVar.f2000a;
        e2.j k3 = nVar3.k();
        x1.g0 g0Var4 = nVar3.f1995c;
        Object g11 = k3.f1985g.g(e2.s.f2038n);
        if (g11 == null) {
            g11 = null;
        }
        boolean a6 = pc.j.a(g11, Boolean.TRUE);
        if (a6) {
            if (!(Build.VERSION.SDK_INT >= 34 ? d.a.h(accessibilityManager2) : true)) {
                i12 = i10;
                yVar2 = yVar3;
                dVar3 = null;
                if (yVar2.f8693r) {
                }
                return dVar3;
            }
        }
        AccessibilityNodeInfo obtain = AccessibilityNodeInfo.obtain();
        i3.d dVar4 = new i3.d(obtain);
        int i15 = Build.VERSION.SDK_INT;
        if (i15 >= 34) {
            d.a.k(obtain, a6);
        } else {
            dVar4.f(64, a6);
        }
        if (i10 == -1) {
            Object parentForAccessibility = rVar3.getParentForAccessibility();
            View view = parentForAccessibility instanceof View ? (View) parentForAccessibility : null;
            dVar4.f3165b = -1;
            obtain.setParent(view);
        } else {
            e2.n l10 = nVar3.l();
            Integer valueOf = l10 != null ? Integer.valueOf(l10.f1999g) : null;
            if (valueOf == null) {
                u1.a.c("semanticsNode " + i10 + " has null parent");
                throw new ac.d();
            }
            int intValue = valueOf.intValue();
            if (intValue == rVar3.getSemanticsOwner().a().f1999g) {
                intValue = -1;
            }
            dVar4.f3165b = intValue;
            obtain.setParent(rVar3, intValue);
        }
        dVar4.f3166c = i10;
        obtain.setSource(rVar3, i10);
        obtain.setBoundsInScreen(yVar3.f(oVar));
        s.s sVar2 = yVar3.M;
        s.r0 r0Var2 = yVar3.f8697v;
        Resources resources = rVar3.getContext().getResources();
        dVar4.g("android.view.View");
        e2.j jVar2 = nVar3.f1996d;
        s.g0 g0Var5 = jVar2.f1985g;
        if (g0Var5.c(e2.s.C)) {
            dVar4.g("android.widget.EditText");
        }
        if (g0Var5.c(e2.s.f2049y)) {
            dVar4.g("android.widget.TextView");
        }
        Object g12 = g0Var5.g(e2.s.f2046v);
        if (g12 == null) {
            g12 = null;
        }
        e2.g gVar3 = (e2.g) g12;
        if (gVar3 != null) {
            int i16 = gVar3.f1956a;
            accessibilityManager = accessibilityManager2;
            if (nVar3.f1997e) {
                i14 = 4;
                r0Var = r0Var2;
            } else {
                i14 = 4;
                r0Var = r0Var2;
            }
            if (i16 == i14) {
                obtain.getExtras().putCharSequence("AccessibilityNodeInfo.roleDescription", resources.getString(R.string.tab));
            } else if (i16 == 2) {
                obtain.getExtras().putCharSequence("AccessibilityNodeInfo.roleDescription", resources.getString(R.string.switch_role));
            } else {
                String x10 = e0.x(i16);
                if (i16 != 5 || nVar3.o() || jVar2.f1987i) {
                    dVar4.g(x10);
                }
            }
        } else {
            accessibilityManager = accessibilityManager2;
            r0Var = r0Var2;
        }
        obtain.setPackageName(rVar3.getContext().getPackageName());
        obtain.setImportantForAccessibility(e2.q.f(nVar3));
        boolean h11 = i15 >= 34 ? d.a.h(accessibilityManager) : true;
        List j3 = e2.n.j(4, nVar3);
        int size = j3.size();
        boolean z19 = h11;
        int i17 = 0;
        int i18 = 0;
        while (i18 < size) {
            int i19 = size;
            e2.n nVar4 = (e2.n) j3.get(i18);
            List list = j3;
            s.k o7 = yVar3.o();
            int i20 = i18;
            int i21 = nVar4.f1999g;
            if (o7.a(i21)) {
                if (rVar3.getAndroidViewsHandler$ui_release().getLayoutNodeToHolder().get(nVar4.f1995c) != null) {
                    throw new ClassCastException();
                }
                if (i21 != -1) {
                    e2.o oVar2 = (e2.o) yVar3.o().b(i21);
                    if (oVar2 == null || (nVar2 = oVar2.f2000a) == null) {
                        z18 = false;
                    } else {
                        Object g13 = nVar2.k().f1985g.g(e2.s.f2038n);
                        if (g13 == null) {
                            g13 = null;
                        }
                        z18 = pc.j.a(g13, Boolean.TRUE);
                    }
                    if (z19 || !z18) {
                        obtain.addChild(rVar3, i21);
                    }
                    sVar2.f(i21, i17);
                    i17++;
                }
            }
            i18 = i20 + 1;
            j3 = list;
            size = i19;
        }
        int i22 = yVar3.f8689n;
        AccessibilityNodeInfo accessibilityNodeInfo3 = dVar4.f3164a;
        if (i10 == i22) {
            accessibilityNodeInfo3.setAccessibilityFocused(true);
            dVar4.a(i3.c.f3155d);
        } else {
            accessibilityNodeInfo3.setAccessibilityFocused(false);
            dVar4.a(i3.c.f3154c);
        }
        h2.e o10 = e0.o(nVar3);
        if (o10 != null) {
            rVar3.getFontFamilyResolver();
            s2.c density = rVar3.getDensity();
            a5.c cVar = yVar3.I;
            rVar = rVar3;
            String str = o10.f2648h;
            g0Var2 = g0Var4;
            List list2 = o10.f2647g;
            SpannableString spannableString2 = new SpannableString(str);
            ArrayList arrayList3 = o10.f2649i;
            if (arrayList3 != null) {
                int size2 = arrayList3.size();
                yVar = yVar3;
                int i23 = 0;
                while (i23 < size2) {
                    ArrayList arrayList4 = arrayList3;
                    h2.c cVar2 = (h2.c) arrayList3.get(i23);
                    int i24 = i23;
                    h2.a0 a0Var = (h2.a0) cVar2.f2631a;
                    int i25 = size2;
                    int i26 = cVar2.f2632b;
                    int i27 = cVar2.f2633c;
                    s.s sVar3 = sVar2;
                    e2.g gVar4 = gVar3;
                    e2.j jVar3 = jVar2;
                    long b2 = a0Var.f2612a.b();
                    AccessibilityNodeInfo accessibilityNodeInfo4 = obtain;
                    i3.d dVar5 = dVar4;
                    long j6 = a0Var.f2613b;
                    k2.l lVar = a0Var.f2614c;
                    k2.j jVar4 = a0Var.f2615d;
                    r2.p pVar = a0Var.f2621j;
                    n2.b bVar = a0Var.f2622k;
                    e2.n nVar5 = nVar3;
                    s.g0 g0Var6 = g0Var5;
                    long j10 = a0Var.f2623l;
                    r2.l lVar2 = a0Var.f2624m;
                    r2.o oVar3 = a0Var.f2612a;
                    x4.f.U(spannableString2, (f1.q.c(b2, oVar3.b()) ? oVar3 : b2 != 16 ? new r2.c(b2) : r2.n.f6036a).b(), i26, i27);
                    SpannableString spannableString3 = spannableString2;
                    x4.f.V(spannableString3, j6, density, i26, i27);
                    if (lVar == null && jVar4 == null) {
                        i13 = 33;
                    } else {
                        i13 = 33;
                        spannableString3.setSpan(new StyleSpan(v6.a.F(lVar == null ? k2.l.f3612i : lVar, jVar4 != null ? jVar4.f3609a : 0)), i26, i27, 33);
                    }
                    if (lVar2 != null) {
                        int i28 = lVar2.f6034a;
                        if ((i28 | 1) == i28) {
                            spannableString3.setSpan(new UnderlineSpan(), i26, i27, i13);
                        }
                        if ((i28 | 2) == i28) {
                            spannableString3.setSpan(new StrikethroughSpan(), i26, i27, i13);
                        }
                    }
                    if (pVar != null) {
                        spannableString3.setSpan(new ScaleXSpan(pVar.f6038a), i26, i27, i13);
                    }
                    x4.f.W(spannableString3, bVar, i26, i27);
                    if (j10 != 16) {
                        spannableString3.setSpan(new BackgroundColorSpan(f1.d0.s(j10)), i26, i27, i13);
                    }
                    i23 = i24 + 1;
                    spannableString2 = spannableString3;
                    arrayList3 = arrayList4;
                    size2 = i25;
                    sVar2 = sVar3;
                    jVar2 = jVar3;
                    gVar3 = gVar4;
                    dVar4 = dVar5;
                    obtain = accessibilityNodeInfo4;
                    nVar3 = nVar5;
                    g0Var5 = g0Var6;
                }
            } else {
                yVar = yVar3;
            }
            sVar = sVar2;
            nVar = nVar3;
            g0Var = g0Var5;
            gVar = gVar3;
            jVar = jVar2;
            accessibilityNodeInfo = obtain;
            dVar = dVar4;
            SpannableString spannableString4 = spannableString2;
            int length = str.length();
            ?? r22 = bc.v.f1067g;
            if (list2 != null) {
                arrayList = new ArrayList(list2.size());
                int size3 = list2.size();
                for (int i29 = 0; i29 < size3; i29++) {
                    Object obj = list2.get(i29);
                    h2.c cVar3 = (h2.c) obj;
                    if ((cVar3.f2631a instanceof h2.j0) && h2.f.a(0, length, cVar3.f2632b, cVar3.f2633c)) {
                        arrayList.add(obj);
                    }
                }
            } else {
                arrayList = r22;
            }
            int size4 = arrayList.size();
            for (int i30 = 0; i30 < size4; i30++) {
                h2.c cVar4 = (h2.c) arrayList.get(i30);
                h2.j0 j0Var = (h2.j0) cVar4.f2631a;
                int i31 = cVar4.f2632b;
                int i32 = cVar4.f2633c;
                if (!(j0Var instanceof h2.j0)) {
                    throw new ac.d();
                }
                spannableString4.setSpan(new TtsSpan.VerbatimBuilder(j0Var.f2682a).build(), i31, i32, 33);
            }
            int length2 = str.length();
            if (list2 != null) {
                arrayList2 = new ArrayList(list2.size());
                int size5 = list2.size();
                for (int i33 = 0; i33 < size5; i33++) {
                    Object obj2 = list2.get(i33);
                    h2.c cVar5 = (h2.c) obj2;
                    if ((cVar5.f2631a instanceof h2.i0) && h2.f.a(0, length2, cVar5.f2632b, cVar5.f2633c)) {
                        arrayList2.add(obj2);
                    }
                }
            } else {
                arrayList2 = r22;
            }
            int size6 = arrayList2.size();
            for (int i34 = 0; i34 < size6; i34++) {
                h2.c cVar6 = (h2.c) arrayList2.get(i34);
                h2.i0 i0Var = (h2.i0) cVar6.f2631a;
                int i35 = cVar6.f2632b;
                int i36 = cVar6.f2633c;
                WeakHashMap weakHashMap = (WeakHashMap) cVar.f262h;
                Object obj3 = weakHashMap.get(i0Var);
                if (obj3 == null) {
                    obj3 = new URLSpan(i0Var.f2679a);
                    weakHashMap.put(i0Var, obj3);
                }
                spannableString4.setSpan((URLSpan) obj3, i35, i36, 33);
            }
            int length3 = str.length();
            if (list2 != null) {
                r22 = new ArrayList(list2.size());
                int size7 = list2.size();
                for (int i37 = 0; i37 < size7; i37++) {
                    Object obj4 = list2.get(i37);
                    h2.c cVar7 = (h2.c) obj4;
                    if ((cVar7.f2631a instanceof h2.k) && h2.f.a(0, length3, cVar7.f2632b, cVar7.f2633c)) {
                        r22.add(obj4);
                    }
                }
            }
            int size8 = r22.size();
            for (int i38 = 0; i38 < size8; i38++) {
                h2.c cVar8 = (h2.c) r22.get(i38);
                int i39 = cVar8.f2632b;
                Object obj5 = cVar8.f2631a;
                int i40 = cVar8.f2633c;
                if (i39 != i40) {
                    h2.k kVar = (h2.k) obj5;
                    if (kVar instanceof h2.j) {
                        pc.j.c(obj5, "null cannot be cast to non-null type androidx.compose.ui.text.LinkAnnotation.Url");
                        h2.j jVar5 = (h2.j) obj5;
                        h2.c cVar9 = new h2.c(i39, i40, jVar5);
                        WeakHashMap weakHashMap2 = (WeakHashMap) cVar.f261g;
                        Object obj6 = weakHashMap2.get(cVar9);
                        if (obj6 == null) {
                            obj6 = new URLSpan(jVar5.f2680a);
                            weakHashMap2.put(cVar9, obj6);
                        }
                        spannableString4.setSpan((URLSpan) obj6, i39, i40, 33);
                    } else {
                        WeakHashMap weakHashMap3 = (WeakHashMap) cVar.f263i;
                        Object obj7 = weakHashMap3.get(cVar8);
                        if (obj7 == null) {
                            obj7 = new o2.f(kVar);
                            weakHashMap3.put(cVar8, obj7);
                        }
                        spannableString4.setSpan((ClickableSpan) obj7, i39, i40, 33);
                    }
                }
            }
            spannableString = (SpannableString) y.J(spannableString4);
        } else {
            yVar = yVar3;
            rVar = rVar3;
            sVar = sVar2;
            nVar = nVar3;
            g0Var = g0Var5;
            g0Var2 = g0Var4;
            gVar = gVar3;
            jVar = jVar2;
            accessibilityNodeInfo = obtain;
            dVar = dVar4;
            spannableString = null;
        }
        accessibilityNodeInfo3.setText(spannableString);
        e2.v vVar = e2.s.H;
        s.g0 g0Var7 = g0Var;
        if (g0Var7.c(vVar)) {
            accessibilityNodeInfo2 = accessibilityNodeInfo;
            accessibilityNodeInfo2.setContentInvalid(true);
            Object g14 = g0Var7.g(vVar);
            if (g14 == null) {
                g14 = null;
            }
            accessibilityNodeInfo2.setError((CharSequence) g14);
        } else {
            accessibilityNodeInfo2 = accessibilityNodeInfo;
        }
        e2.n nVar6 = nVar;
        String n7 = e0.n(nVar6, resources);
        if (Build.VERSION.SDK_INT >= 30) {
            a2.c.h(accessibilityNodeInfo3, n7);
        } else {
            accessibilityNodeInfo3.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.STATE_DESCRIPTION_KEY", n7);
        }
        accessibilityNodeInfo2.setCheckable(e0.m(nVar6));
        Object g15 = g0Var7.g(e2.s.F);
        if (g15 == null) {
            g15 = null;
        }
        g2.a aVar = (g2.a) g15;
        if (aVar != null) {
            if (aVar == g2.a.f2504g) {
                accessibilityNodeInfo3.setChecked(true);
            } else if (aVar == g2.a.f2505h) {
                accessibilityNodeInfo3.setChecked(false);
            }
        }
        Object g16 = g0Var7.g(e2.s.E);
        if (g16 == null) {
            g16 = null;
        }
        Boolean bool = (Boolean) g16;
        if (bool != null) {
            boolean booleanValue = bool.booleanValue();
            if (gVar == null) {
                gVar2 = gVar;
                i11 = 4;
            } else {
                gVar2 = gVar;
                i11 = 4;
                if (gVar2.f1956a == 4) {
                    accessibilityNodeInfo2.setSelected(booleanValue);
                }
            }
            accessibilityNodeInfo3.setChecked(booleanValue);
        } else {
            gVar2 = gVar;
            i11 = 4;
        }
        e2.j jVar6 = jVar;
        if (!jVar6.f1987i || e2.n.j(i11, nVar6).isEmpty()) {
            Object g17 = g0Var7.g(e2.s.f2025a);
            if (g17 == null) {
                g17 = null;
            }
            List list3 = (List) g17;
            accessibilityNodeInfo2.setContentDescription(list3 != null ? (String) bc.m.U(list3) : null);
        }
        Object g18 = g0Var7.g(e2.s.f2047w);
        if (g18 == null) {
            g18 = null;
        }
        String str2 = (String) g18;
        if (str2 != null) {
            e2.n nVar7 = nVar6;
            while (true) {
                if (nVar7 == null) {
                    z17 = false;
                    break;
                }
                e2.j jVar7 = nVar7.f1996d;
                e2.v vVar2 = e2.t.f2051a;
                if (jVar7.f1985g.c(vVar2)) {
                    z17 = ((Boolean) jVar7.b(vVar2)).booleanValue();
                    break;
                }
                nVar7 = nVar7.l();
            }
            if (z17) {
                accessibilityNodeInfo2.setViewIdResourceName(str2);
            }
        }
        Object g19 = g0Var7.g(e2.s.f2032h);
        if (g19 == null) {
            g19 = null;
        }
        if (((ac.o) g19) != null) {
            if (Build.VERSION.SDK_INT >= 28) {
                accessibilityNodeInfo3.setHeading(true);
            } else {
                dVar2 = dVar;
                dVar2.f(2, true);
                i12 = i10;
                if (i12 != -1) {
                    int d10 = sVar.d(nVar6.f1999g);
                    if (d10 != -1) {
                        accessibilityNodeInfo2.setDrawingOrder(d10);
                    } else {
                        Log.w("AccessibilityDelegate", "Drawing order is not available, was AccessibilityNodeInfo requested for a child node before its parent?");
                    }
                }
                accessibilityNodeInfo2.setPassword(g0Var7.c(e2.s.G));
                accessibilityNodeInfo2.setEditable(g0Var7.c(e2.s.J));
                g8 = g0Var7.g(e2.s.K);
                if (g8 == null) {
                    g8 = null;
                }
                Integer num = (Integer) g8;
                accessibilityNodeInfo2.setMaxTextLength(num == null ? num.intValue() : -1);
                accessibilityNodeInfo2.setEnabled(e0.f(nVar6));
                e2.v vVar3 = e2.s.f2035k;
                accessibilityNodeInfo2.setFocusable(g0Var7.c(vVar3));
                if (accessibilityNodeInfo2.isFocusable()) {
                    yVar2 = yVar;
                } else {
                    accessibilityNodeInfo2.setFocused(((Boolean) jVar6.b(vVar3)).booleanValue());
                    if (!accessibilityNodeInfo2.isFocused()) {
                        yVar2 = yVar;
                        z10 = true;
                        accessibilityNodeInfo3.addAction(1);
                        accessibilityNodeInfo2.setVisibleToUser(e2.q.e(nVar6) ^ z10);
                        g10 = g0Var7.g(e2.s.f2034j);
                        if (g10 == null) {
                            g10 = null;
                        }
                        if (g10 != null) {
                            throw new ClassCastException();
                        }
                        accessibilityNodeInfo3.setClickable(false);
                        Object g20 = g0Var7.g(e2.i.f1960b);
                        if (g20 == null) {
                            g20 = null;
                        }
                        e2.a aVar2 = (e2.a) g20;
                        if (aVar2 != null) {
                            boolean a8 = pc.j.a(e2.q.d(jVar6, e2.s.E), Boolean.TRUE);
                            if (!(gVar2 != null && gVar2.f1956a == 4)) {
                                if (!(gVar2 != null && gVar2.f1956a == 3)) {
                                    z16 = false;
                                    accessibilityNodeInfo3.setClickable(z16 || (z16 && !a8));
                                    if (e0.f(nVar6) && accessibilityNodeInfo2.isClickable()) {
                                        dVar2.a(new i3.c(aVar2.f1944a, 16));
                                    }
                                }
                            }
                            z16 = true;
                            accessibilityNodeInfo3.setClickable(z16 || (z16 && !a8));
                            if (e0.f(nVar6)) {
                                dVar2.a(new i3.c(aVar2.f1944a, 16));
                            }
                        }
                        accessibilityNodeInfo3.setLongClickable(false);
                        e2.a aVar3 = (e2.a) e2.q.d(jVar6, e2.i.f1961c);
                        if (aVar3 != null) {
                            accessibilityNodeInfo3.setLongClickable(true);
                            if (e0.f(nVar6)) {
                                dVar2.a(new i3.c(aVar3.f1944a, 32));
                            }
                        }
                        e2.a aVar4 = (e2.a) e2.q.d(jVar6, e2.i.f1973o);
                        if (aVar4 != null) {
                            dVar2.a(new i3.c(aVar4.f1944a, 16384));
                        }
                        if (e0.f(nVar6)) {
                            e2.a aVar5 = (e2.a) e2.q.d(jVar6, e2.i.f1968j);
                            if (aVar5 != null) {
                                dVar2.a(new i3.c(aVar5.f1944a, 2097152));
                            }
                            e2.a aVar6 = (e2.a) e2.q.d(jVar6, e2.i.f1972n);
                            if (aVar6 != null) {
                                dVar2.a(new i3.c(aVar6.f1944a, android.R.id.accessibilityActionImeEnter));
                            }
                            e2.a aVar7 = (e2.a) e2.q.d(jVar6, e2.i.f1974p);
                            if (aVar7 != null) {
                                dVar2.a(new i3.c(aVar7.f1944a, 65536));
                            }
                            e2.a aVar8 = (e2.a) e2.q.d(jVar6, e2.i.f1975q);
                            if (aVar8 != null && accessibilityNodeInfo2.isFocused()) {
                                ClipDescription primaryClipDescription = rVar.m51getClipboardManager().f8554a.getPrimaryClipDescription();
                                if (primaryClipDescription != null ? primaryClipDescription.hasMimeType("text/*") : false) {
                                    dVar2.a(new i3.c(aVar8.f1944a, 32768));
                                }
                            }
                        }
                        String p8 = y.p(nVar6);
                        if (!(p8 == null || p8.length() == 0)) {
                            accessibilityNodeInfo2.setTextSelection(yVar2.n(nVar6), yVar2.m(nVar6));
                            e2.a aVar9 = (e2.a) e2.q.d(jVar6, e2.i.f1967i);
                            dVar2.a(new i3.c(aVar9 != null ? aVar9.f1944a : null, 131072));
                            accessibilityNodeInfo3.addAction(256);
                            accessibilityNodeInfo3.addAction(512);
                            accessibilityNodeInfo3.setMovementGranularities(11);
                            List list4 = (List) e2.q.d(jVar6, e2.s.f2025a);
                            if ((list4 == null || list4.isEmpty()) && g0Var7.c(e2.i.f1959a)) {
                                if (!g0Var7.c(e2.s.C) || pc.j.a(e2.q.d(jVar6, vVar3), Boolean.TRUE)) {
                                    x1.g0 s10 = g0Var2.s();
                                    while (true) {
                                        if (s10 == null) {
                                            s10 = null;
                                            break;
                                        }
                                        e2.j u10 = s10.u();
                                        if (u10 != null && u10.f1987i) {
                                            if (u10.f1985g.c(e2.s.C)) {
                                                z15 = true;
                                                if (!z15) {
                                                    break;
                                                }
                                                s10 = s10.s();
                                            }
                                        }
                                        z15 = false;
                                        if (!z15) {
                                        }
                                    }
                                    if (s10 != null) {
                                        e2.j u11 = s10.u();
                                        if (u11 != null) {
                                            Object g21 = u11.f1985g.g(vVar3);
                                            if (g21 == null) {
                                                g21 = null;
                                            }
                                            z14 = pc.j.a(g21, Boolean.TRUE);
                                        } else {
                                            z14 = false;
                                        }
                                    }
                                    z13 = false;
                                    if (!z13) {
                                        accessibilityNodeInfo3.setMovementGranularities(accessibilityNodeInfo2.getMovementGranularities() | 20);
                                    }
                                }
                                z13 = true;
                                if (!z13) {
                                }
                            }
                        }
                        ArrayList arrayList5 = new ArrayList();
                        arrayList5.add("androidx.compose.ui.semantics.id");
                        CharSequence e10 = dVar2.e();
                        if (!(e10 == null || e10.length() == 0) && g0Var7.c(e2.i.f1959a)) {
                            arrayList5.add("android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_KEY");
                        }
                        if (g0Var7.c(e2.s.f2047w)) {
                            arrayList5.add("androidx.compose.ui.semantics.testTag");
                        }
                        if (nVar6.m().f1985g.c(e2.s.L)) {
                            arrayList5.add("androidx.compose.ui.semantics.shapeType");
                            arrayList5.add("androidx.compose.ui.semantics.shapeRect");
                            arrayList5.add("androidx.compose.ui.semantics.shapeCorners");
                            arrayList5.add("androidx.compose.ui.semantics.shapeRegion");
                        }
                        nVar6.m().getClass();
                        accessibilityNodeInfo3.setAvailableExtraData(arrayList5);
                        e2.f fVar = (e2.f) e2.q.d(nVar6.m(), e2.s.f2027c);
                        if (fVar != null) {
                            e2.j m10 = nVar6.m();
                            e2.v vVar4 = e2.i.f1966h;
                            if (m10.f1985g.c(vVar4)) {
                                dVar2.g("android.widget.SeekBar");
                            } else {
                                dVar2.g("android.widget.ProgressBar");
                            }
                            e2.f fVar2 = e2.f.f1954b;
                            if (fVar != e2.f.f1954b) {
                                accessibilityNodeInfo3.setRangeInfo((AccessibilityNodeInfo.RangeInfo) new h.a(AccessibilityNodeInfo.RangeInfo.obtain(1, Float.valueOf(fVar.a().f6733a).floatValue(), Float.valueOf(fVar.a().f6734b).floatValue(), 0.0f)).f2590a);
                            }
                            if (nVar6.m().f1985g.c(vVar4) && e0.f(nVar6)) {
                                float floatValue = Float.valueOf(fVar.a().f6734b).floatValue();
                                float floatValue2 = Float.valueOf(fVar.a().f6733a).floatValue();
                                if (floatValue < floatValue2) {
                                    floatValue = floatValue2;
                                }
                                if (0.0f < floatValue) {
                                    dVar2.a(i3.c.f3156e);
                                }
                                float floatValue3 = Float.valueOf(fVar.a().f6733a).floatValue();
                                float floatValue4 = Float.valueOf(fVar.a().f6734b).floatValue();
                                if (floatValue3 > floatValue4) {
                                    floatValue3 = floatValue4;
                                }
                                if (0.0f > floatValue3) {
                                    dVar2.a(i3.c.f3157f);
                                }
                            }
                        }
                        int i41 = Build.VERSION.SDK_INT;
                        if (e0.f(nVar6)) {
                            Object g22 = nVar6.f1996d.f1985g.g(e2.i.f1966h);
                            if (g22 == null) {
                                g22 = null;
                            }
                            e2.a aVar10 = (e2.a) g22;
                            if (aVar10 != null) {
                                dVar2.a(new i3.c(null, android.R.id.accessibilityActionSetProgress, aVar10.f1944a, null));
                            }
                        }
                        u.l0.p(nVar6, dVar2);
                        u.l0.q(nVar6, dVar2);
                        e2.h hVar = (e2.h) e2.q.d(nVar6.m(), e2.s.f2044t);
                        e2.a aVar11 = (e2.a) e2.q.d(nVar6.m(), e2.i.f1962d);
                        if (hVar != null && aVar11 != null) {
                            Object g23 = nVar6.k().f1985g.g(e2.s.f2030f);
                            if (g23 == null) {
                                g23 = null;
                            }
                            if (g23 == null) {
                                Object g24 = nVar6.k().f1985g.g(e2.s.f2029e);
                                if (g24 == null) {
                                    g24 = null;
                                }
                                if (g24 == null) {
                                    z12 = false;
                                    if (!z12) {
                                        dVar2.g("android.widget.HorizontalScrollView");
                                    }
                                    if (((Number) hVar.a().invoke()).floatValue() > 0.0f) {
                                        accessibilityNodeInfo3.setScrollable(true);
                                    }
                                    if (e0.f(nVar6)) {
                                        boolean u12 = y.u(hVar);
                                        s2.l lVar3 = s2.l.f6397h;
                                        if (u12) {
                                            dVar2.a(i3.c.f3156e);
                                            g0Var3 = g0Var2;
                                            dVar2.a(!(g0Var3.C == lVar3) ? i3.c.f3161j : i3.c.f3159h);
                                        } else {
                                            g0Var3 = g0Var2;
                                        }
                                        if (y.t(hVar)) {
                                            dVar2.a(i3.c.f3157f);
                                            dVar2.a(!(g0Var3.C == lVar3) ? i3.c.f3159h : i3.c.f3161j);
                                        }
                                    }
                                }
                            }
                            z12 = true;
                            if (!z12) {
                            }
                            if (((Number) hVar.a().invoke()).floatValue() > 0.0f) {
                            }
                            if (e0.f(nVar6)) {
                            }
                        }
                        e2.h hVar2 = (e2.h) e2.q.d(nVar6.m(), e2.s.f2045u);
                        if (hVar2 != null && aVar11 != null) {
                            Object g25 = nVar6.k().f1985g.g(e2.s.f2030f);
                            if (g25 == null) {
                                g25 = null;
                            }
                            if (g25 == null) {
                                Object g26 = nVar6.k().f1985g.g(e2.s.f2029e);
                                if (g26 == null) {
                                    g26 = null;
                                }
                                if (g26 == null) {
                                    z11 = false;
                                    if (!z11) {
                                        dVar2.g("android.widget.ScrollView");
                                    }
                                    if (((Number) hVar2.a().invoke()).floatValue() > 0.0f) {
                                        accessibilityNodeInfo3.setScrollable(true);
                                    }
                                    if (e0.f(nVar6)) {
                                        if (y.u(hVar2)) {
                                            dVar2.a(i3.c.f3156e);
                                            dVar2.a(i3.c.f3160i);
                                        }
                                        if (y.t(hVar2)) {
                                            dVar2.a(i3.c.f3157f);
                                            dVar2.a(i3.c.f3158g);
                                        }
                                    }
                                }
                            }
                            z11 = true;
                            if (!z11) {
                            }
                            if (((Number) hVar2.a().invoke()).floatValue() > 0.0f) {
                            }
                            if (e0.f(nVar6)) {
                            }
                        }
                        if (i41 >= 29) {
                            e0.i(nVar6, dVar2);
                        }
                        CharSequence charSequence = (CharSequence) e2.q.d(nVar6.m(), e2.s.f2028d);
                        if (i41 >= 28) {
                            accessibilityNodeInfo3.setPaneTitle(charSequence);
                        } else {
                            accessibilityNodeInfo3.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.PANE_TITLE_KEY", charSequence);
                        }
                        if (e0.f(nVar6)) {
                            e2.a aVar12 = (e2.a) e2.q.d(nVar6.m(), e2.i.f1976r);
                            if (aVar12 != null) {
                                dVar2.a(new i3.c(aVar12.f1944a, 262144));
                            }
                            e2.a aVar13 = (e2.a) e2.q.d(nVar6.m(), e2.i.f1977s);
                            if (aVar13 != null) {
                                dVar2.a(new i3.c(aVar13.f1944a, 524288));
                            }
                            e2.a aVar14 = (e2.a) e2.q.d(nVar6.m(), e2.i.f1978t);
                            if (aVar14 != null) {
                                dVar2.a(new i3.c(aVar14.f1944a, 1048576));
                            }
                            e2.j m11 = nVar6.m();
                            e2.v vVar5 = e2.i.f1980v;
                            if (m11.f1985g.c(vVar5)) {
                                List list5 = (List) nVar6.m().b(vVar5);
                                int size9 = list5.size();
                                s.t tVar = y.Q;
                                if (size9 >= tVar.f6342b) {
                                    throw new IllegalStateException("Can't have more than " + tVar.f6342b + " custom actions for one widget");
                                }
                                s.r0 r0Var3 = new s.r0(0);
                                s.z a10 = s.k0.a();
                                s.r0 r0Var4 = r0Var;
                                if (r0Var4.c(i12)) {
                                    s.z zVar = (s.z) r0Var4.d(i12);
                                    int[] iArr = tVar.f6341a;
                                    int i42 = tVar.f6342b;
                                    int i43 = 0;
                                    int[] iArr2 = new int[16];
                                    int i44 = 0;
                                    while (i44 < i42) {
                                        int i45 = iArr[i44];
                                        int i46 = i42;
                                        int i47 = i43 + 1;
                                        s.z zVar2 = zVar;
                                        if (iArr2.length < i47) {
                                            int[] copyOf = Arrays.copyOf(iArr2, Math.max(i47, (iArr2.length * 3) / 2));
                                            pc.j.d(copyOf, "copyOf(...)");
                                            iArr2 = copyOf;
                                        }
                                        iArr2[i43] = i45;
                                        i44++;
                                        i43 = i47;
                                        i42 = i46;
                                        zVar = zVar2;
                                    }
                                    s.z zVar3 = zVar;
                                    ArrayList arrayList6 = new ArrayList();
                                    if (list5.size() > 0) {
                                        a4.d.s(list5.get(0));
                                        pc.j.b(zVar3);
                                        throw null;
                                    }
                                    if (arrayList6.size() > 0) {
                                        a4.d.s(arrayList6.get(0));
                                        if (i43 > 0) {
                                            int i48 = iArr2[0];
                                            throw null;
                                        }
                                        t.a.d("Index must be between 0 and size");
                                        throw null;
                                    }
                                } else if (list5.size() > 0) {
                                    a4.d.s(list5.get(0));
                                    tVar.c(0);
                                    throw null;
                                }
                                yVar2.f8696u.e(i12, r0Var3);
                                r0Var4.e(i12, a10);
                            }
                        }
                        boolean h12 = e0.h(nVar6, resources);
                        if (Build.VERSION.SDK_INT >= 28) {
                            accessibilityNodeInfo3.setScreenReaderFocusable(h12);
                        } else {
                            dVar2.f(1, h12);
                        }
                        int d11 = yVar2.E.d(i12);
                        if (d11 != -1) {
                            e0.v(rVar.getAndroidViewsHandler$ui_release(), d11);
                            rVar2 = rVar;
                            dVar2.h(rVar2, d11);
                            yVar2.e(i12, dVar2, yVar2.G, null);
                        } else {
                            rVar2 = rVar;
                        }
                        int d12 = yVar2.F.d(i12);
                        if (d12 != -1) {
                            e0.v(rVar2.getAndroidViewsHandler$ui_release(), d12);
                        }
                        String str3 = (String) e2.q.d(nVar6.m(), e2.t.f2052b);
                        if (str3 != null) {
                            dVar2.g(str3);
                        }
                        dVar3 = dVar2;
                        if (yVar2.f8693r) {
                        }
                        return dVar3;
                    }
                    accessibilityNodeInfo3.addAction(2);
                    yVar2 = yVar;
                    yVar2.f8690o = i12;
                }
                z10 = true;
                accessibilityNodeInfo2.setVisibleToUser(e2.q.e(nVar6) ^ z10);
                g10 = g0Var7.g(e2.s.f2034j);
                if (g10 == null) {
                }
                if (g10 != null) {
                }
            }
        }
        dVar2 = dVar;
        i12 = i10;
        if (i12 != -1) {
        }
        accessibilityNodeInfo2.setPassword(g0Var7.c(e2.s.G));
        accessibilityNodeInfo2.setEditable(g0Var7.c(e2.s.J));
        g8 = g0Var7.g(e2.s.K);
        if (g8 == null) {
        }
        Integer num2 = (Integer) g8;
        accessibilityNodeInfo2.setMaxTextLength(num2 == null ? num2.intValue() : -1);
        accessibilityNodeInfo2.setEnabled(e0.f(nVar6));
        e2.v vVar32 = e2.s.f2035k;
        accessibilityNodeInfo2.setFocusable(g0Var7.c(vVar32));
        if (accessibilityNodeInfo2.isFocusable()) {
        }
        z10 = true;
        accessibilityNodeInfo2.setVisibleToUser(e2.q.e(nVar6) ^ z10);
        g10 = g0Var7.g(e2.s.f2034j);
        if (g10 == null) {
        }
        if (g10 != null) {
        }
    }

    @Override // f8.c
    public final i3.d o(int i10) {
        y yVar = this.f8652j;
        if (i10 != 1) {
            if (i10 == 2) {
                return m(yVar.f8689n);
            }
            throw new IllegalArgumentException(a4.d.g("Unknown focus type: ", i10));
        }
        int i11 = yVar.f8690o;
        if (i11 == Integer.MIN_VALUE) {
            return null;
        }
        return m(i11);
    }

    /* JADX WARN: Code restructure failed: missing block: B:209:0x01a9, code lost:
    
        r1 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:561:0x06d0, code lost:
    
        if (r0 != 16) goto L520;
     */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0242  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0254  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x025f  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x027a  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x028f  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0294  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x02ab  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x02bb  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x0291  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x0289  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x0261  */
    /* JADX WARN: Removed duplicated region for block: B:567:0x078c  */
    /* JADX WARN: Removed duplicated region for block: B:601:? A[RETURN, SYNTHETIC] */
    @Override // f8.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean s(int i10, int i11, Bundle bundle) {
        e2.n nVar;
        int i12;
        Integer num;
        b bVar;
        int i13;
        int i14;
        h2.e0 q10;
        oc.a aVar;
        oc.a aVar2;
        oc.a aVar3;
        oc.a aVar4;
        Float f10;
        boolean z10;
        e2.a aVar5;
        oc.a aVar6;
        float intBitsToFloat;
        e2.a aVar7;
        oc.a aVar8;
        oc.c cVar;
        oc.a aVar9;
        oc.a aVar10;
        oc.a aVar11;
        oc.a aVar12;
        oc.a aVar13;
        oc.c cVar2;
        e2.a aVar14;
        long j3;
        Object g8;
        float f11;
        float f12;
        oc.c cVar3;
        oc.a aVar15;
        oc.a aVar16;
        oc.a aVar17;
        oc.a aVar18;
        oc.a aVar19;
        y yVar = this.f8652j;
        AccessibilityManager accessibilityManager = yVar.f8682g;
        Float valueOf = Float.valueOf(0.0f);
        r rVar = yVar.f8679d;
        e2.o oVar = (e2.o) yVar.o().b(i10);
        if (oVar == null || (nVar = oVar.f2000a) == null) {
            return false;
        }
        x1.g0 g0Var = nVar.f1995c;
        int i15 = nVar.f1999g;
        e2.j jVar = nVar.f1996d;
        s.g0 g0Var2 = jVar.f1985g;
        Object g10 = g0Var2.g(e2.s.f2038n);
        if (g10 == null) {
            g10 = null;
        }
        Boolean bool = Boolean.TRUE;
        if (pc.j.a(g10, bool)) {
            if (!(Build.VERSION.SDK_INT >= 34 ? d.a.h(accessibilityManager) : true)) {
                return false;
            }
        }
        if (i11 == 64) {
            if (!(accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled())) {
                return false;
            }
            int i16 = yVar.f8689n;
            if (i16 == i10) {
                return false;
            }
            if (i16 != Integer.MIN_VALUE) {
                i12 = 12;
                num = null;
                y.z(yVar, i16, 65536, null, 12);
            } else {
                i12 = 12;
                num = null;
            }
            yVar.f8689n = i10;
            rVar.invalidate();
            y.z(yVar, i10, 32768, num, i12);
            return true;
        }
        if (i11 == 128) {
            if (!(yVar.f8689n == i10)) {
                return false;
            }
            yVar.f8689n = Integer.MIN_VALUE;
            yVar.f8691p = null;
            rVar.invalidate();
            y.z(yVar, i10, 65536, null, 12);
            return true;
        }
        if (i11 != 256 && i11 != 512) {
            if (i11 == 16384) {
                Object g11 = g0Var2.g(e2.i.f1973o);
                e2.a aVar20 = (e2.a) (g11 == null ? null : g11);
                if (aVar20 == null || (aVar = (oc.a) aVar20.f1945b) == null) {
                    return false;
                }
                return ((Boolean) aVar.invoke()).booleanValue();
            }
            if (i11 == 131072) {
                boolean F = yVar.F(nVar, bundle != null ? bundle.getInt("ACTION_ARGUMENT_SELECTION_START_INT", -1) : -1, bundle != null ? bundle.getInt("ACTION_ARGUMENT_SELECTION_END_INT", -1) : -1, false);
                if (F) {
                    y.z(yVar, yVar.v(i15), 0, null, 12);
                }
                return F;
            }
            if (!e0.f(nVar)) {
                return false;
            }
            if (i11 == 1) {
                if (rVar.isInTouchMode()) {
                    rVar.requestFocusFromTouch();
                }
                Object g12 = g0Var2.g(e2.i.f1979u);
                e2.a aVar21 = (e2.a) (g12 == null ? null : g12);
                if (aVar21 == null || (aVar2 = (oc.a) aVar21.f1945b) == null) {
                    return false;
                }
                return ((Boolean) aVar2.invoke()).booleanValue();
            }
            if (i11 == 2) {
                Object g13 = g0Var2.g(e2.s.f2035k);
                if (g13 == null) {
                    g13 = null;
                }
                if (!pc.j.a(g13, bool)) {
                    return false;
                }
                ((d1.i) rVar.getFocusOwner()).b(8, false, true);
                return true;
            }
            s2.l lVar = s2.l.f6397h;
            switch (i11) {
                case 16:
                    Object g14 = g0Var2.g(e2.i.f1960b);
                    if (g14 == null) {
                        g14 = null;
                    }
                    e2.a aVar22 = (e2.a) g14;
                    Boolean bool2 = (aVar22 == null || (aVar3 = (oc.a) aVar22.f1945b) == null) ? null : (Boolean) aVar3.invoke();
                    y.z(yVar, i10, 1, null, 12);
                    if (bool2 != null) {
                        return bool2.booleanValue();
                    }
                    return false;
                case 32:
                    Object g15 = g0Var2.g(e2.i.f1961c);
                    e2.a aVar23 = (e2.a) (g15 == null ? null : g15);
                    if (aVar23 == null || (aVar4 = (oc.a) aVar23.f1945b) == null) {
                        return false;
                    }
                    return ((Boolean) aVar4.invoke()).booleanValue();
                case 4096:
                case 8192:
                    break;
                case 32768:
                    Object g16 = g0Var2.g(e2.i.f1975q);
                    e2.a aVar24 = (e2.a) (g16 == null ? null : g16);
                    if (aVar24 == null || (aVar9 = (oc.a) aVar24.f1945b) == null) {
                        return false;
                    }
                    return ((Boolean) aVar9.invoke()).booleanValue();
                case 65536:
                    Object g17 = g0Var2.g(e2.i.f1974p);
                    e2.a aVar25 = (e2.a) (g17 == null ? null : g17);
                    if (aVar25 == null || (aVar10 = (oc.a) aVar25.f1945b) == null) {
                        return false;
                    }
                    return ((Boolean) aVar10.invoke()).booleanValue();
                case 262144:
                    Object g18 = g0Var2.g(e2.i.f1976r);
                    e2.a aVar26 = (e2.a) (g18 == null ? null : g18);
                    if (aVar26 == null || (aVar11 = (oc.a) aVar26.f1945b) == null) {
                        return false;
                    }
                    return ((Boolean) aVar11.invoke()).booleanValue();
                case 524288:
                    Object g19 = g0Var2.g(e2.i.f1977s);
                    e2.a aVar27 = (e2.a) (g19 == null ? null : g19);
                    if (aVar27 == null || (aVar12 = (oc.a) aVar27.f1945b) == null) {
                        return false;
                    }
                    return ((Boolean) aVar12.invoke()).booleanValue();
                case 1048576:
                    Object g20 = g0Var2.g(e2.i.f1978t);
                    e2.a aVar28 = (e2.a) (g20 == null ? null : g20);
                    if (aVar28 == null || (aVar13 = (oc.a) aVar28.f1945b) == null) {
                        return false;
                    }
                    return ((Boolean) aVar13.invoke()).booleanValue();
                case 2097152:
                    String string = bundle != null ? bundle.getString("ACTION_ARGUMENT_SET_TEXT_CHARSEQUENCE") : null;
                    Object g21 = g0Var2.g(e2.i.f1968j);
                    e2.a aVar29 = (e2.a) (g21 == null ? null : g21);
                    if (aVar29 == null || (cVar2 = (oc.c) aVar29.f1945b) == null) {
                        return false;
                    }
                    if (string == null) {
                        string = "";
                    }
                    return ((Boolean) cVar2.invoke(new h2.e(string, 0))).booleanValue();
                case android.R.id.accessibilityActionShowOnScreen:
                    e2.n l10 = nVar.l();
                    if (l10 != null) {
                        Object g22 = l10.f1996d.f1985g.g(e2.i.f1962d);
                        if (g22 == null) {
                            g22 = null;
                        }
                        aVar14 = (e2.a) g22;
                        while (l10 != null && aVar14 == null) {
                            l10 = l10.l();
                            if (l10 != null) {
                                Object g23 = l10.f1996d.f1985g.g(e2.i.f1962d);
                                if (g23 == null) {
                                    g23 = null;
                                }
                                aVar14 = (e2.a) g23;
                            }
                        }
                        if (l10 == null) {
                            e1.c g24 = nVar.g();
                            return rVar.requestRectangleOnScreen(new Rect((int) Math.floor(g24.f1931a), (int) Math.floor(g24.f1932b), bc.a0.I((float) Math.ceil(g24.f1933c)), bc.a0.I((float) Math.ceil(g24.f1934d))));
                        }
                        s.g0 g0Var3 = l10.f1996d.f1985g;
                        x1.g0 g0Var4 = l10.f1995c;
                        e1.c d10 = v1.p0.d(g0Var4.I.f7988c);
                        v1.p i17 = g0Var4.I.f7988c.i();
                        e1.c e10 = d10.e(i17 != null ? ((x1.f1) i17).L0(0L) : 0L);
                        x1.f1 d11 = nVar.d();
                        if (d11 != null) {
                            if (!d11.B0().f8456t) {
                                d11 = null;
                            }
                            if (d11 != null) {
                                j3 = d11.L0(0L);
                                x1.f1 d12 = nVar.d();
                                e1.c r5 = x4.f.r(j3, i7.b.F(d12 != null ? d12.f7087i : 0L));
                                g8 = g0Var3.g(e2.s.f2044t);
                                if (g8 == null) {
                                    g8 = null;
                                }
                                Object g25 = g0Var3.g(e2.s.f2045u);
                                f11 = r5.f1931a - e10.f1931a;
                                f12 = r5.f1933c - e10.f1933c;
                                if (Math.signum(f11) == Math.signum(f12)) {
                                    f11 = 0.0f;
                                } else if (Math.abs(f11) >= Math.abs(f12)) {
                                    f11 = f12;
                                }
                                if (g0Var.C != lVar) {
                                    f11 = -f11;
                                }
                                float f13 = r5.f1932b - e10.f1932b;
                                float f14 = r5.f1934d - e10.f1934d;
                                float f15 = Math.signum(f13) != Math.signum(f14) ? Math.abs(f13) < Math.abs(f14) ? f13 : f14 : 0.0f;
                                return aVar14 == null ? false : false;
                            }
                        }
                        j3 = 0;
                        x1.f1 d122 = nVar.d();
                        e1.c r52 = x4.f.r(j3, i7.b.F(d122 != null ? d122.f7087i : 0L));
                        g8 = g0Var3.g(e2.s.f2044t);
                        if (g8 == null) {
                        }
                        Object g252 = g0Var3.g(e2.s.f2045u);
                        f11 = r52.f1931a - e10.f1931a;
                        f12 = r52.f1933c - e10.f1933c;
                        if (Math.signum(f11) == Math.signum(f12)) {
                        }
                        if (g0Var.C != lVar) {
                        }
                        float f132 = r52.f1932b - e10.f1932b;
                        float f142 = r52.f1934d - e10.f1934d;
                        if (Math.signum(f132) != Math.signum(f142)) {
                        }
                        return aVar14 == null ? false : false;
                    }
                    aVar14 = null;
                    break;
                case android.R.id.accessibilityActionSetProgress:
                    if (bundle == null || !bundle.containsKey("android.view.accessibility.action.ARGUMENT_PROGRESS_VALUE")) {
                        return false;
                    }
                    Object g26 = g0Var2.g(e2.i.f1966h);
                    e2.a aVar30 = (e2.a) (g26 == null ? null : g26);
                    if (aVar30 == null || (cVar3 = (oc.c) aVar30.f1945b) == null) {
                        return false;
                    }
                    return ((Boolean) cVar3.invoke(Float.valueOf(bundle.getFloat("android.view.accessibility.action.ARGUMENT_PROGRESS_VALUE")))).booleanValue();
                case android.R.id.accessibilityActionImeEnter:
                    Object g27 = g0Var2.g(e2.i.f1972n);
                    e2.a aVar31 = (e2.a) (g27 == null ? null : g27);
                    if (aVar31 == null || (aVar15 = (oc.a) aVar31.f1945b) == null) {
                        return false;
                    }
                    return ((Boolean) aVar15.invoke()).booleanValue();
                default:
                    switch (i11) {
                        case android.R.id.accessibilityActionScrollUp:
                        case android.R.id.accessibilityActionScrollLeft:
                        case android.R.id.accessibilityActionScrollDown:
                        case android.R.id.accessibilityActionScrollRight:
                            break;
                        default:
                            switch (i11) {
                                case android.R.id.accessibilityActionPageUp:
                                    Object g28 = g0Var2.g(e2.i.f1981w);
                                    e2.a aVar32 = (e2.a) (g28 == null ? null : g28);
                                    if (aVar32 == null || (aVar16 = (oc.a) aVar32.f1945b) == null) {
                                        return false;
                                    }
                                    return ((Boolean) aVar16.invoke()).booleanValue();
                                case android.R.id.accessibilityActionPageDown:
                                    Object g29 = g0Var2.g(e2.i.f1983y);
                                    e2.a aVar33 = (e2.a) (g29 == null ? null : g29);
                                    if (aVar33 == null || (aVar17 = (oc.a) aVar33.f1945b) == null) {
                                        return false;
                                    }
                                    return ((Boolean) aVar17.invoke()).booleanValue();
                                case android.R.id.accessibilityActionPageLeft:
                                    Object g30 = g0Var2.g(e2.i.f1982x);
                                    e2.a aVar34 = (e2.a) (g30 == null ? null : g30);
                                    if (aVar34 == null || (aVar18 = (oc.a) aVar34.f1945b) == null) {
                                        return false;
                                    }
                                    return ((Boolean) aVar18.invoke()).booleanValue();
                                case android.R.id.accessibilityActionPageRight:
                                    Object g31 = g0Var2.g(e2.i.f1984z);
                                    e2.a aVar35 = (e2.a) (g31 == null ? null : g31);
                                    if (aVar35 == null || (aVar19 = (oc.a) aVar35.f1945b) == null) {
                                        return false;
                                    }
                                    return ((Boolean) aVar19.invoke()).booleanValue();
                                default:
                                    s.r0 r0Var = (s.r0) yVar.f8696u.d(i10);
                                    if (r0Var == null || ((CharSequence) r0Var.d(i11)) == null) {
                                        return false;
                                    }
                                    Object g32 = g0Var2.g(e2.i.f1980v);
                                    List list = (List) (g32 == null ? null : g32);
                                    if (list == null || list.size() <= 0) {
                                        return false;
                                    }
                                    list.get(0).getClass();
                                    throw new ClassCastException();
                            }
                    }
            }
            boolean z11 = i11 == 4096;
            boolean z12 = i11 == 8192;
            boolean z13 = i11 == 16908345;
            boolean z14 = i11 == 16908347;
            boolean z15 = i11 == 16908344;
            boolean z16 = i11 == 16908346;
            boolean z17 = z13 || z14 || z11 || z12;
            boolean z18 = z15 || z16 || z11 || z12;
            if (z11 || z12) {
                Object g33 = g0Var2.g(e2.s.f2027c);
                if (g33 == null) {
                    g33 = null;
                }
                e2.f fVar = (e2.f) g33;
                Object g34 = g0Var2.g(e2.i.f1966h);
                if (g34 == null) {
                    g34 = null;
                }
                e2.a aVar36 = (e2.a) g34;
                if (fVar != null) {
                    uc.a aVar37 = fVar.f1955a;
                    if (aVar36 != null) {
                        float f16 = aVar37.f6734b;
                        float f17 = aVar37.f6733a;
                        float f18 = f16 < f17 ? f17 : f16;
                        if (f17 <= f16) {
                            f16 = f17;
                        }
                        float f19 = (f18 - f16) / 20;
                        if (z12) {
                            f19 = -f19;
                        }
                        oc.c cVar4 = (oc.c) aVar36.f1945b;
                        if (cVar4 != null) {
                            return ((Boolean) cVar4.invoke(Float.valueOf(0.0f + f19))).booleanValue();
                        }
                        return false;
                    }
                }
            }
            long b2 = v1.p0.d(g0Var.I.f7988c).b();
            ArrayList arrayList = new ArrayList();
            Object g35 = g0Var2.g(e2.i.A);
            if (g35 == null) {
                g35 = null;
            }
            e2.a aVar38 = (e2.a) g35;
            Float f20 = (aVar38 == null || (cVar = (oc.c) aVar38.f1945b) == null || !((Boolean) cVar.invoke(arrayList)).booleanValue()) ? null : (Float) arrayList.get(0);
            Object g36 = g0Var2.g(e2.i.f1962d);
            if (g36 == null) {
                g36 = null;
            }
            e2.a aVar39 = (e2.a) g36;
            if (aVar39 == null) {
                return false;
            }
            ac.c cVar5 = aVar39.f1945b;
            Object g37 = g0Var2.g(e2.s.f2044t);
            if (g37 == null) {
                g37 = null;
            }
            e2.h hVar = (e2.h) g37;
            if (hVar == null || !z17) {
                f10 = f20;
                z10 = z18;
            } else {
                if (f20 != null) {
                    intBitsToFloat = f20.floatValue();
                    f10 = f20;
                    z10 = z18;
                } else {
                    f10 = f20;
                    z10 = z18;
                    intBitsToFloat = Float.intBitsToFloat((int) (b2 >> 32));
                }
                if (z13 || z12) {
                    intBitsToFloat = -intBitsToFloat;
                }
                if ((g0Var.C == lVar) && (z13 || z14)) {
                    intBitsToFloat = -intBitsToFloat;
                }
                if (y.s(hVar, intBitsToFloat)) {
                    e2.v vVar = e2.i.f1982x;
                    if (!g0Var2.c(vVar) && !g0Var2.c(e2.i.f1984z)) {
                        oc.e eVar = (oc.e) cVar5;
                        if (eVar != null) {
                            return ((Boolean) eVar.invoke(Float.valueOf(intBitsToFloat), valueOf)).booleanValue();
                        }
                        return false;
                    }
                    if (intBitsToFloat > 0.0f) {
                        Object g38 = g0Var2.g(e2.i.f1984z);
                        aVar7 = (e2.a) (g38 == null ? null : g38);
                    } else {
                        Object g39 = g0Var2.g(vVar);
                        aVar7 = (e2.a) (g39 == null ? null : g39);
                    }
                    if (aVar7 == null || (aVar8 = (oc.a) aVar7.f1945b) == null) {
                        return false;
                    }
                    return ((Boolean) aVar8.invoke()).booleanValue();
                }
            }
            Object g40 = g0Var2.g(e2.s.f2045u);
            if (g40 == null) {
                g40 = null;
            }
            e2.h hVar2 = (e2.h) g40;
            if (hVar2 == null || !z10) {
                return false;
            }
            float floatValue = f10 != null ? f10.floatValue() : Float.intBitsToFloat((int) (4294967295L & b2));
            if (z15 || z12) {
                floatValue = -floatValue;
            }
            if (!y.s(hVar2, floatValue)) {
                return false;
            }
            e2.v vVar2 = e2.i.f1981w;
            if (!g0Var2.c(vVar2) && !g0Var2.c(e2.i.f1983y)) {
                oc.e eVar2 = (oc.e) cVar5;
                if (eVar2 != null) {
                    return ((Boolean) eVar2.invoke(valueOf, Float.valueOf(floatValue))).booleanValue();
                }
                return false;
            }
            if (floatValue > 0.0f) {
                Object g41 = g0Var2.g(e2.i.f1983y);
                aVar5 = (e2.a) (g41 == null ? null : g41);
            } else {
                Object g42 = g0Var2.g(vVar2);
                aVar5 = (e2.a) (g42 == null ? null : g42);
            }
            if (aVar5 == null || (aVar6 = (oc.a) aVar5.f1945b) == null) {
                return false;
            }
            return ((Boolean) aVar6.invoke()).booleanValue();
        }
        if (bundle == null) {
            return false;
        }
        int i18 = bundle.getInt("ACTION_ARGUMENT_MOVEMENT_GRANULARITY_INT");
        boolean z19 = bundle.getBoolean("ACTION_ARGUMENT_EXTEND_SELECTION_BOOLEAN");
        boolean z20 = i11 == 256;
        Integer num2 = yVar.f8699x;
        if (num2 == null || i15 != num2.intValue()) {
            yVar.f8698w = -1;
            yVar.f8699x = Integer.valueOf(i15);
        }
        String p8 = y.p(nVar);
        if (p8 == null || p8.length() == 0) {
            return false;
        }
        String p10 = y.p(nVar);
        if (p10 != null && p10.length() != 0) {
            if (i18 == 1) {
                Locale locale = rVar.getContext().getResources().getConfiguration().locale;
                if (c.f8480e == null) {
                    c cVar6 = new c(0);
                    cVar6.f8486d = BreakIterator.getCharacterInstance(locale);
                    c.f8480e = cVar6;
                }
                c cVar7 = c.f8480e;
                pc.j.c(cVar7, "null cannot be cast to non-null type androidx.compose.ui.platform.AccessibilityIterators.CharacterTextSegmentIterator");
                cVar7.f(p10);
                bVar = cVar7;
            } else if (i18 != 2) {
                if (i18 != 4) {
                    if (i18 == 8) {
                        if (e.f8504c == null) {
                            e.f8504c = new e();
                        }
                        e eVar3 = e.f8504c;
                        pc.j.c(eVar3, "null cannot be cast to non-null type androidx.compose.ui.platform.AccessibilityIterators.ParagraphTextSegmentIterator");
                        eVar3.f8473a = p10;
                        bVar = eVar3;
                    }
                }
                if (g0Var2.c(e2.i.f1959a) && (q10 = e0.q(jVar)) != null) {
                    if (i18 == 4) {
                        if (c.f8482g == null) {
                            c.f8482g = new c(2);
                        }
                        c cVar8 = c.f8482g;
                        pc.j.c(cVar8, "null cannot be cast to non-null type androidx.compose.ui.platform.AccessibilityIterators.LineTextSegmentIterator");
                        cVar8.f8473a = p10;
                        cVar8.f8486d = q10;
                        bVar = cVar8;
                    } else {
                        if (d.f8492e == null) {
                            d dVar = new d();
                            new Rect();
                            d.f8492e = dVar;
                        }
                        d dVar2 = d.f8492e;
                        pc.j.c(dVar2, "null cannot be cast to non-null type androidx.compose.ui.platform.AccessibilityIterators.PageTextSegmentIterator");
                        dVar2.f8473a = p10;
                        dVar2.f8495c = q10;
                        dVar2.f8496d = nVar;
                        bVar = dVar2;
                    }
                }
            } else {
                Locale locale2 = rVar.getContext().getResources().getConfiguration().locale;
                if (c.f8481f == null) {
                    c cVar9 = new c(1);
                    cVar9.f8486d = BreakIterator.getWordInstance(locale2);
                    c.f8481f = cVar9;
                }
                c cVar10 = c.f8481f;
                pc.j.c(cVar10, "null cannot be cast to non-null type androidx.compose.ui.platform.AccessibilityIterators.WordTextSegmentIterator");
                cVar10.f(p10);
                bVar = cVar10;
            }
            if (bVar != null) {
                return false;
            }
            int m10 = yVar.m(nVar);
            if (m10 == -1) {
                m10 = z20 ? 0 : p8.length();
            }
            int[] a6 = z20 ? bVar.a(m10) : bVar.d(m10);
            if (a6 == null) {
                return false;
            }
            int i19 = a6[0];
            int i20 = a6[1];
            if (z19 && !g0Var2.c(e2.s.f2025a) && g0Var2.c(e2.s.C)) {
                i13 = yVar.n(nVar);
                if (i13 == -1) {
                    i13 = z20 ? i19 : i20;
                }
                i14 = z20 ? i20 : i19;
            } else {
                i13 = z20 ? i20 : i19;
                i14 = i13;
            }
            yVar.B = new v(nVar, z20 ? 256 : 512, i18, i19, i20, SystemClock.uptimeMillis());
            yVar.F(nVar, i13, i14, true);
            return true;
        }
        bVar = null;
        if (bVar != null) {
        }
    }
}
