package androidx.fragment.app;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import defpackage.j5r;
import defpackage.k5r;
import defpackage.mr7;
import defpackage.ndu;
import defpackage.wdu;
import defpackage.xq0;
import defpackage.xy0;
import defpackage.z75;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.WeakHashMap;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import ru.yandex.music.R;

/* loaded from: classes.dex */
public final class h {
    public final ViewGroup a;
    public final ArrayList b;
    public final ArrayList c;
    public boolean d;
    public boolean e;
    public boolean f;

    public h(ViewGroup viewGroup) {
        viewGroup.getClass();
        this.a = viewGroup;
        this.b = new ArrayList();
        this.c = new ArrayList();
    }

    public static void f(xy0 xy0Var, View view) {
        WeakHashMap weakHashMap = wdu.a;
        String g = ndu.g(view);
        if (g != null) {
            xy0Var.put(g, view);
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = viewGroup.getChildAt(i);
                if (childAt.getVisibility() == 0) {
                    f(xy0Var, childAt);
                }
            }
        }
    }

    public static final h j(ViewGroup viewGroup, y yVar) {
        viewGroup.getClass();
        yVar.getClass();
        yVar.K().getClass();
        Object tag = viewGroup.getTag(R.id.special_effects_controller_view_tag);
        if (tag instanceof h) {
            return (h) tag;
        }
        h hVar = new h(viewGroup);
        viewGroup.setTag(R.id.special_effects_controller_view_tag, hVar);
        return hVar;
    }

    public static boolean k(ArrayList arrayList) {
        boolean z;
        Iterator it = arrayList.iterator();
        loop0: while (true) {
            z = true;
            while (it.hasNext()) {
                f0 f0Var = (f0) it.next();
                if (!f0Var.k.isEmpty()) {
                    ArrayList arrayList2 = f0Var.k;
                    if (arrayList2 == null || !arrayList2.isEmpty()) {
                        Iterator it2 = arrayList2.iterator();
                        while (it2.hasNext()) {
                            if (!((j5r) it2.next()).a()) {
                                break;
                            }
                        }
                    }
                }
                z = false;
            }
            break loop0;
        }
        if (z) {
            ArrayList arrayList3 = new ArrayList();
            Iterator it3 = arrayList.iterator();
            while (it3.hasNext()) {
                z75.t(arrayList3, ((f0) it3.next()).k);
            }
            if (!arrayList3.isEmpty()) {
                return true;
            }
        }
        return false;
    }

    public final void a(f0 f0Var) {
        f0Var.getClass();
        if (f0Var.i) {
            int i = f0Var.a;
            View requireView = f0Var.c.requireView();
            requireView.getClass();
            k5r.a(i, requireView, this.a);
            f0Var.i = false;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x0484, code lost:
    
        if (r6.k.isEmpty() != false) goto L231;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x04a6, code lost:
    
        if (r6.a != 3) goto L172;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x04a8, code lost:
    
        r6.i = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x04ad, code lost:
    
        r6.j.add(new androidx.fragment.app.e(r4));
        r9 = r21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x048a, code lost:
    
        if (androidx.fragment.app.y.M(r17) == false) goto L238;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x048c, code lost:
    
        android.util.Log.v(r15, "Ignoring Animator set on " + r5 + " as this Fragment was involved in a Transition.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x0478, code lost:
    
        r1.add(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x04ba, code lost:
    
        r1 = r1.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x04c2, code lost:
    
        if (r1.hasNext() == false) goto L242;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x04c4, code lost:
    
        r3 = (androidx.fragment.app.d) r1.next();
        r4 = r3.a;
        r5 = r4.c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x04d0, code lost:
    
        if (r2 != false) goto L241;
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x04ed, code lost:
    
        if (r9 == false) goto L246;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x050a, code lost:
    
        r4.j.add(new androidx.fragment.app.c(r3));
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x04f3, code lost:
    
        if (androidx.fragment.app.y.M(r17) == false) goto L250;
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x04f5, code lost:
    
        android.util.Log.v(r15, "Ignoring Animation set on " + r5 + " as Animations cannot run alongside Animators.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x04d6, code lost:
    
        if (androidx.fragment.app.y.M(r17) == false) goto L252;
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x04d8, code lost:
    
        android.util.Log.v(r15, "Ignoring Animation set on " + r5 + " as Animations cannot run alongside Transitions.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x0515, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x01ba, code lost:
    
        r6 = new java.util.ArrayList();
        r11 = r5;
        r8 = new java.util.ArrayList();
        r12 = new defpackage.xy0(0);
        r13 = new java.util.ArrayList<>();
        r16 = new java.util.ArrayList<>();
        r17 = 2;
        r15 = new defpackage.xy0(0);
        r18 = r13;
        r13 = new defpackage.xy0(0);
        r19 = r11.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x01e8, code lost:
    
        r6 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x01ed, code lost:
    
        if (r19.hasNext() == false) goto L254;
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x01ef, code lost:
    
        r9 = ((defpackage.ur7) r19.next()).d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x01f9, code lost:
    
        if (r9 == null) goto L259;
     */
    /* JADX WARN: Code restructure failed: missing block: B:154:0x01fb, code lost:
    
        if (r2 == null) goto L260;
     */
    /* JADX WARN: Code restructure failed: missing block: B:155:0x01fd, code lost:
    
        r10 = r2.c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:156:0x0201, code lost:
    
        if (r4 == null) goto L257;
     */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x03aa, code lost:
    
        r22 = r1;
        r23 = r5;
        r24 = r8;
        r25 = r11;
        r5 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:159:0x03c0, code lost:
    
        r9 = r5;
        r1 = r22;
        r5 = r23;
        r8 = r24;
        r11 = r25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x004b, code lost:
    
        r2 = (androidx.fragment.app.f0) r2;
        r1 = r27.listIterator(r27.size());
     */
    /* JADX WARN: Code restructure failed: missing block: B:163:0x0203, code lost:
    
        r6 = r4.c;
        r9 = r5.y(r5.h(r9));
        r7 = r6.getSharedElementSourceNames();
        r7.getClass();
        r22 = r1;
        r1 = r10.getSharedElementSourceNames();
        r1.getClass();
        r23 = r5;
        r5 = r10.getSharedElementTargetNames();
        r5.getClass();
        r24 = r8;
        r8 = r5.size();
        r25 = r11;
        r11 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:165:0x0230, code lost:
    
        if (r11 >= r8) goto L265;
     */
    /* JADX WARN: Code restructure failed: missing block: B:166:0x0232, code lost:
    
        r16 = r8;
        r8 = r7.indexOf(r5.get(r11));
     */
    /* JADX WARN: Code restructure failed: missing block: B:167:0x023c, code lost:
    
        if (r8 == (-1)) goto L267;
     */
    /* JADX WARN: Code restructure failed: missing block: B:168:0x023e, code lost:
    
        r7.set(r8, r1.get(r11));
     */
    /* JADX WARN: Code restructure failed: missing block: B:170:0x0245, code lost:
    
        r11 = r11 + 1;
        r8 = r16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:173:0x024a, code lost:
    
        r1 = r6.getSharedElementTargetNames();
        r1.getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:174:0x0251, code lost:
    
        if (r28 != false) goto L101;
     */
    /* JADX WARN: Code restructure failed: missing block: B:175:0x0253, code lost:
    
        r10.getExitTransitionCallback();
        r6.getEnterTransitionCallback();
        r5 = new kotlin.Pair(null, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:177:0x026e, code lost:
    
        if (r5.a != null) goto L255;
     */
    /* JADX WARN: Code restructure failed: missing block: B:179:0x0272, code lost:
    
        if (r5.b != null) goto L256;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x005b, code lost:
    
        if (r1.hasPrevious() == false) goto L202;
     */
    /* JADX WARN: Code restructure failed: missing block: B:180:0x0274, code lost:
    
        r5 = r7.size();
        r11 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:181:0x0279, code lost:
    
        if (r11 >= r5) goto L268;
     */
    /* JADX WARN: Code restructure failed: missing block: B:182:0x027b, code lost:
    
        r16 = r7.get(r11);
        r16.getClass();
        r8 = r16;
        r16 = r1.get(r11);
        r16.getClass();
        r12.put(r8, r16);
        r11 = r11 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:185:0x029d, code lost:
    
        if (androidx.fragment.app.y.M(2) == false) goto L119;
     */
    /* JADX WARN: Code restructure failed: missing block: B:186:0x029f, code lost:
    
        android.util.Log.v("FragmentManager", ">>> entering view names <<<");
        r5 = r1.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:188:0x02ae, code lost:
    
        if (r5.hasNext() == false) goto L269;
     */
    /* JADX WARN: Code restructure failed: missing block: B:189:0x02b0, code lost:
    
        android.util.Log.v("FragmentManager", "Name: " + r5.next());
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x005d, code lost:
    
        r9 = r1.previous();
        r10 = (androidx.fragment.app.f0) r9;
        r11 = r10.c.mView;
        r11.getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:191:0x02c6, code lost:
    
        android.util.Log.v("FragmentManager", ">>> exiting view names <<<");
        r5 = r7.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:193:0x02d3, code lost:
    
        if (r5.hasNext() == false) goto L270;
     */
    /* JADX WARN: Code restructure failed: missing block: B:194:0x02d5, code lost:
    
        android.util.Log.v("FragmentManager", "Name: " + r5.next());
     */
    /* JADX WARN: Code restructure failed: missing block: B:196:0x02eb, code lost:
    
        r5 = r10.mView;
        r5.getClass();
        f(r15, r5);
        r15.m(r7);
        r12.m(r15.keySet());
        r5 = r6.mView;
        r5.getClass();
        f(r13, r5);
        r13.m(r1);
        r13.m(r12.values());
        r5 = defpackage.vuc.a;
        r5 = r12.c - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:197:0x0316, code lost:
    
        if ((-1) >= r5) goto L271;
     */
    /* JADX WARN: Code restructure failed: missing block: B:199:0x0322, code lost:
    
        if (r13.containsKey((java.lang.String) r12.j(r5)) != false) goto L273;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0071, code lost:
    
        if (r11.getAlpha() != 0.0f) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:200:0x0324, code lost:
    
        r12.h(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:202:0x0327, code lost:
    
        r5 = r5 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:205:0x032a, code lost:
    
        defpackage.z75.w(r15.entrySet(), new defpackage.l8(1, r12.keySet()), false);
        defpackage.z75.w(r13.entrySet(), new defpackage.l8(1, r12.values()), false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:206:0x0351, code lost:
    
        if (r12.isEmpty() == false) goto L128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:207:0x0390, code lost:
    
        r18 = r1;
        r16 = r7;
        r6 = r9;
        r1 = r22;
        r8 = r24;
        r11 = r25;
        r9 = false;
        r5 = r23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:210:0x0353, code lost:
    
        android.util.Log.i("FragmentManager", "Ignoring shared elements transition " + r9 + " between " + r2 + " and " + r4 + " as there are no matching elements in both the entering and exiting fragment. In order to run a SharedElementTransition, both fragments involved must have the element.");
        r6.clear();
        r24.clear();
        r18 = r1;
        r9 = false;
        r16 = r7;
        r1 = r22;
        r5 = r23;
        r8 = r24;
        r11 = r25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:212:0x03a2, code lost:
    
        defpackage.l1j.f();
     */
    /* JADX WARN: Code restructure failed: missing block: B:213:0x03a5, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:215:0x03a6, code lost:
    
        defpackage.l1j.f();
     */
    /* JADX WARN: Code restructure failed: missing block: B:216:0x03a9, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:217:0x0260, code lost:
    
        r10.getEnterTransitionCallback();
        r6.getExitTransitionCallback();
        r5 = new kotlin.Pair(null, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:219:0x03b6, code lost:
    
        r22 = r1;
        r23 = r5;
        r24 = r8;
        r25 = r11;
        r5 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0077, code lost:
    
        if (r11.getVisibility() != 0) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:222:0x03cd, code lost:
    
        r22 = r1;
        r23 = r5;
        r24 = r8;
        r25 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:223:0x03d7, code lost:
    
        if (r6 != null) goto L147;
     */
    /* JADX WARN: Code restructure failed: missing block: B:225:0x03dd, code lost:
    
        if (r25.isEmpty() == false) goto L141;
     */
    /* JADX WARN: Code restructure failed: missing block: B:226:0x03df, code lost:
    
        r15 = "FragmentManager";
        r21 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:227:0x03e3, code lost:
    
        r1 = r25.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:229:0x03eb, code lost:
    
        if (r1.hasNext() == false) goto L275;
     */
    /* JADX WARN: Code restructure failed: missing block: B:231:0x03f5, code lost:
    
        if (((defpackage.ur7) r1.next()).b != null) goto L274;
     */
    /* JADX WARN: Code restructure failed: missing block: B:235:0x03f8, code lost:
    
        r21 = true;
        r15 = "FragmentManager";
        r1 = new androidx.fragment.app.g(r25, r2, r4, r23, r6, r6, r24, r12, r18, r16, r15, r13, r28);
        r2 = r25.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:237:0x0419, code lost:
    
        if (r2.hasNext() == false) goto L277;
     */
    /* JADX WARN: Code restructure failed: missing block: B:238:0x041b, code lost:
    
        ((defpackage.ur7) r2.next()).a.j.add(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:242:0x007a, code lost:
    
        r11 = r11.getVisibility();
     */
    /* JADX WARN: Code restructure failed: missing block: B:243:0x007e, code lost:
    
        if (r11 == 0) goto L208;
     */
    /* JADX WARN: Code restructure failed: missing block: B:245:0x0080, code lost:
    
        if (r11 == 4) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:246:0x0082, code lost:
    
        if (r11 != 8) goto L201;
     */
    /* JADX WARN: Code restructure failed: missing block: B:248:0x0085, code lost:
    
        defpackage.xq0.x(defpackage.k5r.i(r11, "Unknown visibility "));
     */
    /* JADX WARN: Code restructure failed: missing block: B:249:0x008c, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x008f, code lost:
    
        if (r10.a != 2) goto L207;
     */
    /* JADX WARN: Code restructure failed: missing block: B:252:0x0092, code lost:
    
        r9 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0093, code lost:
    
        r4 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x009c, code lost:
    
        if (androidx.fragment.app.y.M(2) == false) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x009e, code lost:
    
        android.util.Log.v("FragmentManager", "Executing operations from " + r2 + " to " + r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00b7, code lost:
    
        r1 = new java.util.ArrayList();
        r5 = new java.util.ArrayList();
        r6 = ((androidx.fragment.app.f0) kotlin.collections.CollectionsKt.Y(r27)).c;
        r9 = r27.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00d1, code lost:
    
        if (r9.hasNext() == false) goto L209;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00d3, code lost:
    
        r10 = ((androidx.fragment.app.f0) r9.next()).c.mAnimationInfo;
        r11 = r6.mAnimationInfo;
        r10.b = r11.b;
        r10.c = r11.c;
        r10.d = r11.d;
        r10.e = r11.e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00f0, code lost:
    
        r6 = r27.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00f4, code lost:
    
        r9 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00f9, code lost:
    
        if (r6.hasNext() == false) goto L210;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00fb, code lost:
    
        r8 = (androidx.fragment.app.f0) r6.next();
        r1.add(new androidx.fragment.app.d(r8, r28));
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x010b, code lost:
    
        if (r28 == false) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x010d, code lost:
    
        if (r8 != r2) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x010f, code lost:
    
        r10 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0116, code lost:
    
        r5.add(new defpackage.ur7(r8, r28, r10));
        r8.d.add(new defpackage.mr7(r26, r8, 0));
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0111, code lost:
    
        r10 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0113, code lost:
    
        if (r8 != r4) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0127, code lost:
    
        r6 = new java.util.ArrayList();
        r5 = r5.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0134, code lost:
    
        if (r5.hasNext() == false) goto L214;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0136, code lost:
    
        r8 = r5.next();
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0141, code lost:
    
        if (((defpackage.ur7) r8).a() != false) goto L216;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0143, code lost:
    
        r6.add(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0147, code lost:
    
        r5 = new java.util.ArrayList();
        r6 = r6.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0154, code lost:
    
        if (r6.hasNext() == false) goto L219;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0156, code lost:
    
        r8 = r6.next();
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0161, code lost:
    
        if (((defpackage.ur7) r8).b() == null) goto L221;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0163, code lost:
    
        r5.add(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0167, code lost:
    
        r6 = r5.iterator();
        r5 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0171, code lost:
    
        if (r6.hasNext() == false) goto L223;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0173, code lost:
    
        r11 = (defpackage.ur7) r6.next();
        r12 = r11.b();
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x017d, code lost:
    
        if (r5 == null) goto L225;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x017f, code lost:
    
        if (r12 != r5) goto L224;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0182, code lost:
    
        r1 = new java.lang.StringBuilder("Mixing framework transitions and AndroidX transitions is not allowed. Fragment ");
        r1.append(r11.a.c);
        r2 = r11.b;
        r1.append(" returned Transition ");
        r1.append(r2);
        r1.append(" which uses a different Transition type than other Fragments.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x01ac, code lost:
    
        throw new java.lang.IllegalArgumentException(r1.toString().toString());
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x01ad, code lost:
    
        r5 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x01af, code lost:
    
        if (r5 != null) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x01b1, code lost:
    
        r22 = r1;
        r17 = 2;
        r21 = true;
        r15 = "FragmentManager";
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0429, code lost:
    
        r1 = new java.util.ArrayList();
        r2 = new java.util.ArrayList();
        r3 = r22.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x043b, code lost:
    
        if (r3.hasNext() == false) goto L227;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x043d, code lost:
    
        defpackage.z75.t(r2, ((androidx.fragment.app.d) r3.next()).a.k);
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x044b, code lost:
    
        r2 = r2.isEmpty();
        r3 = r22.iterator();
        r9 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x0458, code lost:
    
        if (r3.hasNext() == false) goto L228;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x045a, code lost:
    
        r4 = (androidx.fragment.app.d) r3.next();
        r5 = r26.a.getContext();
        r6 = r4.a;
        r5.getClass();
        r5 = r4.b(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x046f, code lost:
    
        if (r5 != null) goto L229;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x0476, code lost:
    
        if (((android.animation.AnimatorSet) r5.b) != null) goto L230;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x047c, code lost:
    
        r5 = r6.c;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v21, types: [java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(ArrayList arrayList, boolean z) {
        Object obj;
        Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            f0 f0Var = (f0) obj;
            View view = f0Var.c.mView;
            view.getClass();
            if (view.getAlpha() != 0.0f || view.getVisibility() != 0) {
                int visibility = view.getVisibility();
                if (visibility != 0) {
                    if (visibility != 4 && visibility != 8) {
                        xq0.x(k5r.i(visibility, "Unknown visibility "));
                        return;
                    }
                } else if (f0Var.a != 2) {
                    break;
                }
            }
        }
    }

    public final void c(List list) {
        list.getClass();
        List list2 = list;
        ArrayList arrayList = new ArrayList();
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            z75.t(arrayList, ((f0) it.next()).k);
        }
        List w0 = CollectionsKt.w0(CollectionsKt.A0(arrayList));
        int size = w0.size();
        for (int i = 0; i < size; i++) {
            ((j5r) w0.get(i)).c(this.a);
        }
        int size2 = list.size();
        for (int i2 = 0; i2 < size2; i2++) {
            a((f0) list.get(i2));
        }
        List w02 = CollectionsKt.w0(list2);
        int size3 = w02.size();
        for (int i3 = 0; i3 < size3; i3++) {
            f0 f0Var = (f0) w02.get(i3);
            if (f0Var.k.isEmpty()) {
                f0Var.b();
            }
        }
    }

    public final void d(int i, int i2, b0 b0Var) {
        synchronized (this.b) {
            try {
                o oVar = b0Var.c;
                oVar.getClass();
                f0 g = g(oVar);
                if (g == null) {
                    o oVar2 = b0Var.c;
                    g = oVar2.mTransitioning ? h(oVar2) : null;
                }
                if (g != null) {
                    g.d(i, i2);
                    return;
                }
                final f0 f0Var = new f0(i, i2, b0Var);
                this.b.add(f0Var);
                f0Var.d.add(new Runnable() { // from class: androidx.fragment.app.e0
                    @Override // java.lang.Runnable
                    public final void run() {
                        h hVar = h.this;
                        ArrayList arrayList = hVar.b;
                        f0 f0Var2 = f0Var;
                        if (arrayList.contains(f0Var2)) {
                            int i3 = f0Var2.a;
                            View view = f0Var2.c.mView;
                            view.getClass();
                            k5r.a(i3, view, hVar.a);
                        }
                    }
                });
                f0Var.d.add(new mr7(this, f0Var, 1));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void e() {
        boolean z;
        if (this.f) {
            return;
        }
        if (!this.a.isAttachedToWindow()) {
            i();
            this.e = false;
            return;
        }
        synchronized (this.b) {
            try {
                ArrayList y0 = CollectionsKt.y0(this.c);
                this.c.clear();
                Iterator it = y0.iterator();
                while (true) {
                    z = true;
                    if (!it.hasNext()) {
                        break;
                    }
                    f0 f0Var = (f0) it.next();
                    if (this.b.isEmpty() || !f0Var.c.mTransitioning) {
                        z = false;
                    }
                    f0Var.g = z;
                }
                Iterator it2 = y0.iterator();
                while (it2.hasNext()) {
                    f0 f0Var2 = (f0) it2.next();
                    if (this.d) {
                        if (y.M(2)) {
                            Log.v("FragmentManager", "SpecialEffectsController: Completing non-seekable operation " + f0Var2);
                        }
                        f0Var2.b();
                    } else {
                        if (y.M(2)) {
                            Log.v("FragmentManager", "SpecialEffectsController: Cancelling operation " + f0Var2);
                        }
                        f0Var2.a(this.a);
                    }
                    this.d = false;
                    if (!f0Var2.f) {
                        this.c.add(f0Var2);
                    }
                }
                if (!this.b.isEmpty()) {
                    n();
                    ArrayList y02 = CollectionsKt.y0(this.b);
                    if (y02.isEmpty()) {
                        return;
                    }
                    this.b.clear();
                    this.c.addAll(y02);
                    if (y.M(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Executing pending operations");
                    }
                    b(y02, this.e);
                    boolean k = k(y02);
                    Iterator it3 = y02.iterator();
                    boolean z2 = true;
                    while (it3.hasNext()) {
                        if (!((f0) it3.next()).c.mTransitioning) {
                            z2 = false;
                        }
                    }
                    if (!z2 || k) {
                        z = false;
                    }
                    this.d = z;
                    if (y.M(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Operation seekable = " + k + " \ntransition = " + z2);
                    }
                    if (!z2) {
                        m(y02);
                        c(y02);
                    } else if (k) {
                        m(y02);
                        int size = y02.size();
                        for (int i = 0; i < size; i++) {
                            a((f0) y02.get(i));
                        }
                    }
                    this.e = false;
                    if (y.M(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Finished executing pending operations");
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final f0 g(o oVar) {
        Object obj;
        Iterator it = this.b.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            f0 f0Var = (f0) obj;
            if (Intrinsics.d(f0Var.c, oVar) && !f0Var.e) {
                break;
            }
        }
        return (f0) obj;
    }

    public final f0 h(o oVar) {
        Object obj;
        Iterator it = this.c.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            f0 f0Var = (f0) obj;
            if (Intrinsics.d(f0Var.c, oVar) && !f0Var.e) {
                break;
            }
        }
        return (f0) obj;
    }

    public final void i() {
        String str;
        String str2;
        if (y.M(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Forcing all operations to complete");
        }
        boolean isAttachedToWindow = this.a.isAttachedToWindow();
        synchronized (this.b) {
            try {
                n();
                m(this.b);
                ArrayList y0 = CollectionsKt.y0(this.c);
                Iterator it = y0.iterator();
                while (it.hasNext()) {
                    ((f0) it.next()).g = false;
                }
                Iterator it2 = y0.iterator();
                while (it2.hasNext()) {
                    f0 f0Var = (f0) it2.next();
                    if (y.M(2)) {
                        if (isAttachedToWindow) {
                            str2 = "";
                        } else {
                            str2 = "Container " + this.a + " is not attached to window. ";
                        }
                        Log.v("FragmentManager", "SpecialEffectsController: " + str2 + "Cancelling running operation " + f0Var);
                    }
                    f0Var.a(this.a);
                }
                ArrayList y02 = CollectionsKt.y0(this.b);
                Iterator it3 = y02.iterator();
                while (it3.hasNext()) {
                    ((f0) it3.next()).g = false;
                }
                Iterator it4 = y02.iterator();
                while (it4.hasNext()) {
                    f0 f0Var2 = (f0) it4.next();
                    if (y.M(2)) {
                        if (isAttachedToWindow) {
                            str = "";
                        } else {
                            str = "Container " + this.a + " is not attached to window. ";
                        }
                        Log.v("FragmentManager", "SpecialEffectsController: " + str + "Cancelling pending operation " + f0Var2);
                    }
                    f0Var2.a(this.a);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void l() {
        Object obj;
        synchronized (this.b) {
            try {
                n();
                ArrayList arrayList = this.b;
                ListIterator listIterator = arrayList.listIterator(arrayList.size());
                while (true) {
                    if (!listIterator.hasPrevious()) {
                        obj = null;
                        break;
                    }
                    obj = listIterator.previous();
                    f0 f0Var = (f0) obj;
                    View view = f0Var.c.mView;
                    view.getClass();
                    char c = 4;
                    if (view.getAlpha() != 0.0f || view.getVisibility() != 0) {
                        int visibility = view.getVisibility();
                        if (visibility == 0) {
                            c = 2;
                        } else if (visibility != 4) {
                            if (visibility != 8) {
                                throw new IllegalArgumentException("Unknown visibility " + visibility);
                            }
                            c = 3;
                        }
                    }
                    if (f0Var.a == 2 && c != 2) {
                        break;
                    }
                }
                f0 f0Var2 = (f0) obj;
                o oVar = f0Var2 != null ? f0Var2.c : null;
                this.f = oVar != null ? oVar.isPostponed() : false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void m(List list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            f0 f0Var = (f0) list.get(i);
            b0 b0Var = f0Var.l;
            if (!f0Var.h) {
                f0Var.h = true;
                int i2 = f0Var.b;
                if (i2 == 2) {
                    o oVar = b0Var.c;
                    oVar.getClass();
                    View findFocus = oVar.mView.findFocus();
                    if (findFocus != null) {
                        oVar.setFocusedView(findFocus);
                        if (y.M(2)) {
                            Log.v("FragmentManager", "requestFocus: Saved focused view " + findFocus + " for Fragment " + oVar);
                        }
                    }
                    View requireView = f0Var.c.requireView();
                    requireView.getClass();
                    if (requireView.getParent() == null) {
                        b0Var.b();
                        requireView.setAlpha(0.0f);
                    }
                    if (requireView.getAlpha() == 0.0f && requireView.getVisibility() == 0) {
                        requireView.setVisibility(4);
                    }
                    requireView.setAlpha(oVar.getPostOnViewCreatedAlpha());
                } else if (i2 == 3) {
                    o oVar2 = b0Var.c;
                    oVar2.getClass();
                    View requireView2 = oVar2.requireView();
                    requireView2.getClass();
                    if (y.M(2)) {
                        Log.v("FragmentManager", "Clearing focus " + requireView2.findFocus() + " on view " + requireView2 + " for Fragment " + oVar2);
                    }
                    requireView2.clearFocus();
                }
            }
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            z75.t(arrayList, ((f0) it.next()).k);
        }
        List w0 = CollectionsKt.w0(CollectionsKt.A0(arrayList));
        int size2 = w0.size();
        for (int i3 = 0; i3 < size2; i3++) {
            j5r j5rVar = (j5r) w0.get(i3);
            j5rVar.getClass();
            ViewGroup viewGroup = this.a;
            viewGroup.getClass();
            if (!j5rVar.a) {
                j5rVar.e(viewGroup);
            }
            j5rVar.a = true;
        }
    }

    public final void n() {
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            f0 f0Var = (f0) it.next();
            int i = 2;
            if (f0Var.b == 2) {
                View requireView = f0Var.c.requireView();
                requireView.getClass();
                int visibility = requireView.getVisibility();
                if (visibility != 0) {
                    i = 4;
                    if (visibility != 4) {
                        if (visibility != 8) {
                            xq0.x(k5r.i(visibility, "Unknown visibility "));
                            return;
                        }
                        i = 3;
                    }
                }
                f0Var.d(i, 1);
            }
        }
    }
}
