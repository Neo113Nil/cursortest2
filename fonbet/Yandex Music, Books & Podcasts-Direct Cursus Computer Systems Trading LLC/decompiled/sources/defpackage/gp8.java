package defpackage;

import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.DisplayMetrics;
import android.view.View;
import androidx.core.view.a;
import com.connectsdk.service.webos.lgcast.remotecamera.service.CameraProperty;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.c;
import ru.yandex.music.R;

/* loaded from: classes3.dex */
public final class gp8 {
    public final xzi a;
    public final qu9 b;
    public final znk c;
    public final bz2 d;
    public final ozw e;

    public gp8(xzi xziVar, qu9 qu9Var, znk znkVar, bz2 bz2Var, ozw ozwVar) {
        this.a = xziVar;
        this.b = qu9Var;
        this.c = znkVar;
        this.d = bz2Var;
        this.e = ozwVar;
    }

    public static void a(View view, gc8 gc8Var, dp8 dp8Var, xzb xzbVar, boolean z) {
        int i;
        lw9 divTransitionHandler$div_release = gc8Var.getDivTransitionHandler$div_release();
        int ordinal = ((k1a) dp8Var.getVisibility().a(xzbVar)).ordinal();
        if (ordinal == 0) {
            i = 0;
        } else if (ordinal == 1) {
            i = 4;
        } else {
            if (ordinal != 2) {
                b6e.s();
                return;
            }
            i = 8;
        }
        if (i != 0) {
            view.clearAnimation();
        }
        int visibility = view.getVisibility();
        List l = dp8Var.l();
        b8t b8tVar = null;
        if (l == null || l.contains(nw9.VISIBILITY_CHANGE)) {
            iw9 iw9Var = (iw9) CollectionsKt.Z(lw9.b(divTransitionHandler$div_release.b, view));
            if (iw9Var == null && (iw9Var = (iw9) CollectionsKt.Z(lw9.b(divTransitionHandler$div_release.c, view))) == null) {
                iw9Var = null;
            }
            if (iw9Var != null) {
                visibility = iw9Var.a;
            }
            hw9 k = gc8Var.getViewComponent$div_release().k();
            if ((visibility == 4 || visibility == 8) && i == 0) {
                un8 A = dp8Var.A();
                if (A != null) {
                    b8tVar = k.c(A, 1, xzbVar);
                } else {
                    k.getClass();
                }
            } else if ((i == 4 || i == 8) && visibility == 0 && !z) {
                un8 D = dp8Var.D();
                if (D != null) {
                    b8tVar = k.c(D, 2, xzbVar);
                } else {
                    k.getClass();
                }
            } else if (iw9Var != null) {
                l8t.b(gc8Var);
            }
            if (b8tVar != null) {
                b8tVar.e(view);
            }
        }
        if (b8tVar != null) {
            divTransitionHandler$div_release.b.add(new jw9(b8tVar, view, u75.j(new iw9(i)), new ArrayList()));
            if (!divTransitionHandler$div_release.d) {
                divTransitionHandler$div_release.d = true;
                divTransitionHandler$div_release.a.post(new sr7(7, divTransitionHandler$div_release));
            }
        } else {
            view.setVisibility(i);
        }
        gc8Var.U();
    }

    public static void c(View view, dp8 dp8Var, dp8 dp8Var2, xzb xzbVar, a0c a0cVar) {
        if (view instanceof oc9) {
            return;
        }
        if (vut.w(dp8Var.s(), dp8Var2 != null ? dp8Var2.s() : null)) {
            return;
        }
        bg3.m(view, dp8Var.s(), xzbVar);
        if (vut.L(dp8Var.s())) {
            return;
        }
        sk3.K(a0cVar, dp8Var.s(), xzbVar, new ep8(view, dp8Var, xzbVar, 2));
    }

    public final void b(View view, e23 e23Var, dp8 dp8Var, dp8 dp8Var2, a0c a0cVar, boolean z, Drawable drawable) {
        List list;
        List list2;
        List list3;
        wz8 p;
        List d = dp8Var.d();
        if (d == null) {
            d = c5b.a;
        }
        List list4 = d;
        if (dp8Var2 == null || (list = dp8Var2.d()) == null) {
            list = c5b.a;
        }
        wz8 p2 = dp8Var.p();
        if (p2 == null || (list2 = p2.a) == null) {
            list2 = c5b.a;
        }
        List list5 = list2;
        if (dp8Var2 == null || (p = dp8Var2.p()) == null || (list3 = p.a) == null) {
            list3 = c5b.a;
        }
        int i = 0;
        if (z && list4.size() == list.size()) {
            Iterator it = list4.iterator();
            int i2 = 0;
            while (true) {
                if (it.hasNext()) {
                    Object next = it.next();
                    int i3 = i2 + 1;
                    if (i2 < 0) {
                        u75.n();
                        throw null;
                    }
                    if (!vut.t((mo8) next, (mo8) list.get(i2))) {
                        break;
                    } else {
                        i2 = i3;
                    }
                } else if (list5.size() == list3.size()) {
                    int i4 = 0;
                    for (Object obj : list5) {
                        int i5 = i4 + 1;
                        if (i4 < 0) {
                            u75.n();
                            throw null;
                        }
                        if (vut.t((mo8) obj, (mo8) list3.get(i4))) {
                            i4 = i5;
                        }
                    }
                    return;
                }
            }
        }
        boolean isEmpty = list5.isEmpty();
        List list6 = list3;
        xzi xziVar = this.a;
        if (isEmpty) {
            Drawable Z = xzi.Z(view);
            if (list4.size() == list.size()) {
                Iterator it2 = list4.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        Object next2 = it2.next();
                        int i6 = i + 1;
                        if (i < 0) {
                            u75.n();
                            throw null;
                        }
                        if (!vut.t((mo8) next2, (mo8) list.get(i))) {
                            break;
                        } else {
                            i = i6;
                        }
                    } else if (Intrinsics.d(drawable, Z)) {
                        return;
                    }
                }
            }
            View view2 = view;
            xziVar.R(view2, e23Var, drawable, list4);
            List list7 = list4;
            if ((list7 instanceof Collection) && list7.isEmpty()) {
                return;
            }
            Iterator it3 = list7.iterator();
            while (it3.hasNext()) {
                if (!vut.J((mo8) it3.next())) {
                    xzi.P(list4, e23Var.b, a0cVar, new ii(xziVar, view2, e23Var, drawable, list4, 6));
                    return;
                }
                view2 = view;
            }
            return;
        }
        Drawable Z2 = xzi.Z(view);
        if (list4.size() == list.size()) {
            Iterator it4 = list4.iterator();
            int i7 = 0;
            while (true) {
                if (it4.hasNext()) {
                    Object next3 = it4.next();
                    int i8 = i7 + 1;
                    if (i7 < 0) {
                        u75.n();
                        throw null;
                    }
                    if (!vut.t((mo8) next3, (mo8) list.get(i7))) {
                        break;
                    } else {
                        i7 = i8;
                    }
                } else if (list5.size() == list6.size()) {
                    Iterator it5 = list5.iterator();
                    while (true) {
                        if (it5.hasNext()) {
                            Object next4 = it5.next();
                            int i9 = i + 1;
                            if (i < 0) {
                                u75.n();
                                throw null;
                            }
                            if (!vut.t((mo8) next4, (mo8) list6.get(i))) {
                                break;
                            } else {
                                i = i9;
                            }
                        } else if (Intrinsics.d(drawable, Z2)) {
                            return;
                        }
                    }
                }
            }
        }
        xziVar.S(view, e23Var, drawable, list4, list5);
        List list8 = list4;
        if (!(list8 instanceof Collection) || !list8.isEmpty()) {
            Iterator it6 = list8.iterator();
            while (it6.hasNext()) {
                if (!vut.J((mo8) it6.next())) {
                    break;
                }
            }
        }
        List list9 = list5;
        if ((list9 instanceof Collection) && list9.isEmpty()) {
            return;
        }
        Iterator it7 = list9.iterator();
        while (it7.hasNext()) {
            if (!vut.J((mo8) it7.next())) {
                a03 a03Var = new a03(xziVar, view, e23Var, drawable, list4, list5, 3);
                xzb xzbVar = e23Var.b;
                xzi.P(list4, xzbVar, a0cVar, a03Var);
                xzi.P(list5, xzbVar, a0cVar, a03Var);
                return;
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:265:0x0880, code lost:
    
        if (defpackage.vut.z(r1 != null ? r1.b : r10, r2 != null ? r2.b : r10) != false) goto L610;
     */
    /* JADX WARN: Code restructure failed: missing block: B:339:0x034f, code lost:
    
        if (r3 == (r6 != null ? r6.g : null)) goto L213;
     */
    /* JADX WARN: Code restructure failed: missing block: B:403:0x040c, code lost:
    
        if (defpackage.xp3.B(r8, (r18 == null || (r3 = r18.q()) == null) ? null : r3.b) != false) goto L246;
     */
    /* JADX WARN: Code restructure failed: missing block: B:422:0x048f, code lost:
    
        if ((r2 != null ? r2.g : null) == ((r18 == null || (r3 = r18.q()) == null) ? null : r3.g)) goto L290;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x016d, code lost:
    
        if (defpackage.xp3.B(r3.o(), r1 != null ? r1.o() : null) != false) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:508:0x0208, code lost:
    
        if (kotlin.text.c.o(r6.a, r7 != null ? r7.a : null, false) != false) goto L107;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0630  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0666  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0670  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0685  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x06b3  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x06bd  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x06d3  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0701  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x070b  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0721  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x074f  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0759  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x076e  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x079c  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x07a6  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x07b2  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x07b8  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x07fd  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x080a  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x0840  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x0848 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:234:0x08cf  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x08de  */
    /* JADX WARN: Removed duplicated region for block: B:247:? A[ADDED_TO_REGION, REMOVE, RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:247:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:249:0x084e  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x0854  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x085e  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x088d  */
    /* JADX WARN: Removed duplicated region for block: B:280:0x08b2  */
    /* JADX WARN: Removed duplicated region for block: B:285:0x0857  */
    /* JADX WARN: Removed duplicated region for block: B:286:0x0851  */
    /* JADX WARN: Removed duplicated region for block: B:287:0x0845  */
    /* JADX WARN: Removed duplicated region for block: B:288:0x0802  */
    /* JADX WARN: Removed duplicated region for block: B:290:0x07ca  */
    /* JADX WARN: Removed duplicated region for block: B:294:0x07db  */
    /* JADX WARN: Removed duplicated region for block: B:297:0x07e8  */
    /* JADX WARN: Removed duplicated region for block: B:299:0x07c7  */
    /* JADX WARN: Removed duplicated region for block: B:300:0x07b5  */
    /* JADX WARN: Removed duplicated region for block: B:301:0x07a9  */
    /* JADX WARN: Removed duplicated region for block: B:302:0x079f  */
    /* JADX WARN: Removed duplicated region for block: B:314:0x05d6  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:323:0x05f5  */
    /* JADX WARN: Removed duplicated region for block: B:325:0x05c8  */
    /* JADX WARN: Removed duplicated region for block: B:327:0x05a2  */
    /* JADX WARN: Removed duplicated region for block: B:328:0x0544  */
    /* JADX WARN: Removed duplicated region for block: B:332:0x0339  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:370:0x03a5  */
    /* JADX WARN: Removed duplicated region for block: B:373:0x03b3  */
    /* JADX WARN: Removed duplicated region for block: B:377:0x03c3  */
    /* JADX WARN: Removed duplicated region for block: B:384:0x03a7  */
    /* JADX WARN: Removed duplicated region for block: B:388:0x03da  */
    /* JADX WARN: Removed duplicated region for block: B:391:0x03e5  */
    /* JADX WARN: Removed duplicated region for block: B:398:0x03fc  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:406:0x045d  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:438:0x04bc  */
    /* JADX WARN: Removed duplicated region for block: B:440:0x04c2  */
    /* JADX WARN: Removed duplicated region for block: B:445:0x04d3  */
    /* JADX WARN: Removed duplicated region for block: B:456:0x04fd  */
    /* JADX WARN: Removed duplicated region for block: B:458:0x0503  */
    /* JADX WARN: Removed duplicated region for block: B:463:0x0514  */
    /* JADX WARN: Removed duplicated region for block: B:473:0x0500  */
    /* JADX WARN: Removed duplicated region for block: B:475:0x04bf  */
    /* JADX WARN: Removed duplicated region for block: B:478:0x0411  */
    /* JADX WARN: Removed duplicated region for block: B:480:0x041b  */
    /* JADX WARN: Removed duplicated region for block: B:487:0x0446  */
    /* JADX WARN: Removed duplicated region for block: B:490:0x0451  */
    /* JADX WARN: Removed duplicated region for block: B:492:0x0456  */
    /* JADX WARN: Removed duplicated region for block: B:493:0x044b  */
    /* JADX WARN: Removed duplicated region for block: B:494:0x0422  */
    /* JADX WARN: Removed duplicated region for block: B:495:0x0418  */
    /* JADX WARN: Removed duplicated region for block: B:497:0x03e9  */
    /* JADX WARN: Removed duplicated region for block: B:498:0x03de  */
    /* JADX WARN: Removed duplicated region for block: B:499:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x01dd  */
    /* JADX WARN: Removed duplicated region for block: B:545:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:549:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0315  */
    /* JADX WARN: Removed duplicated region for block: B:552:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:559:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:562:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:564:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:565:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:566:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:567:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:568:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:569:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x053f  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x054c  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x059f  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x05aa  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x05c5  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x05cd  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0611  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x061b  */
    /* JADX WARN: Type inference failed for: r11v10 */
    /* JADX WARN: Type inference failed for: r11v11 */
    /* JADX WARN: Type inference failed for: r11v12, types: [boolean] */
    /* JADX WARN: Type inference failed for: r11v13 */
    /* JADX WARN: Type inference failed for: r11v8 */
    /* JADX WARN: Type inference failed for: r11v9, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v59 */
    /* JADX WARN: Type inference failed for: r1v60, types: [xd9] */
    /* JADX WARN: Type inference failed for: r1v94 */
    /* JADX WARN: Type inference failed for: r2v57 */
    /* JADX WARN: Type inference failed for: r2v58, types: [xd9] */
    /* JADX WARN: Type inference failed for: r2v67 */
    /* JADX WARN: Type inference failed for: r3v103 */
    /* JADX WARN: Type inference failed for: r3v104, types: [xd9] */
    /* JADX WARN: Type inference failed for: r3v143 */
    /* JADX WARN: Type inference failed for: r3v144 */
    /* JADX WARN: Type inference failed for: r3v65 */
    /* JADX WARN: Type inference failed for: r3v66, types: [boolean] */
    /* JADX WARN: Type inference failed for: r3v68 */
    /* JADX WARN: Type inference failed for: r3v98 */
    /* JADX WARN: Type inference failed for: r3v99, types: [szb] */
    /* JADX WARN: Type inference failed for: r4v126 */
    /* JADX WARN: Type inference failed for: r4v127 */
    /* JADX WARN: Type inference failed for: r4v23, types: [java.lang.Object, y79] */
    /* JADX WARN: Type inference failed for: r4v55 */
    /* JADX WARN: Type inference failed for: r4v56, types: [szb] */
    /* JADX WARN: Type inference failed for: r4v57 */
    /* JADX WARN: Type inference failed for: r4v58, types: [xd9] */
    /* JADX WARN: Type inference failed for: r5v0, types: [android.view.View, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v10, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v19 */
    /* JADX WARN: Type inference failed for: r5v20 */
    /* JADX WARN: Type inference failed for: r6v32 */
    /* JADX WARN: Type inference failed for: r6v33, types: [boolean] */
    /* JADX WARN: Type inference failed for: r6v34 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void d(e23 e23Var, View view, jc8 jc8Var, jc8 jc8Var2) {
        dfb dfbVar;
        dp8 dp8Var;
        w79 v;
        dp8 dp8Var2;
        dp8 dp8Var3;
        xzb xzbVar;
        gc8 gc8Var;
        int i;
        y79 y79Var;
        gc8 gc8Var2;
        View view2;
        View view3;
        bz2 bz2Var;
        boolean z;
        szb szbVar;
        szb szbVar2;
        xzb xzbVar2;
        bz2 bz2Var2;
        dp8 dp8Var4;
        szb szbVar3;
        szb szbVar4;
        tc8 q;
        tc8 q2;
        tc8 q3;
        tc8 q4;
        ?? r6;
        a aVar;
        dp8 dp8Var5;
        dp8 dp8Var6;
        View view4;
        op8 op8Var;
        xz8 xz8Var;
        szb szbVar5;
        szb szbVar6;
        szb szbVar7;
        szb szbVar8;
        szb szbVar9;
        List list;
        List list2;
        xz8 xz8Var2;
        char c;
        qv9 qv9Var;
        List[] listArr;
        ?? r5;
        qv9 f;
        qv9 f2;
        qv9 f3;
        qv9 f4;
        List x;
        wz8 p;
        vz8 vz8Var;
        vz8 vz8Var2;
        wz8 p2;
        vz8 vz8Var3;
        vz8 vz8Var4;
        wz8 p3;
        vz8 vz8Var5;
        vz8 vz8Var6;
        wz8 p4;
        vz8 vz8Var7;
        vz8 vz8Var8;
        wz8 p5;
        vz8 vz8Var9;
        vz8 vz8Var10;
        gp8 gp8Var = this;
        final ?? r52 = view;
        r52.getClass();
        f29 f29Var = (f29) r52;
        f29Var.l();
        f29Var.setDiv(jc8Var);
        f29Var.setBindingContext(e23Var);
        dp8 d = jc8Var.d();
        dp8 d2 = jc8Var2 != null ? jc8Var2.d() : null;
        final xzb xzbVar3 = e23Var.b;
        gc8 gc8Var3 = e23Var.a;
        a0c A = a0g.A(r52);
        int i2 = 0;
        if (Build.VERSION.SDK_INT >= 26) {
            r52.setDefaultFocusHighlightEnabled(false);
        }
        if (!Intrinsics.d(d.getId(), d2 != null ? d2.getId() : null)) {
            int a = gc8Var3.getViewComponent$div_release().l().a(d.getId());
            r52.setTag(d.getId());
            r52.setId(a);
        }
        ozw ozwVar = gp8Var.e;
        dfb a2 = ((efb) ozwVar.b).a(gc8Var3.getDivData(), gc8Var3.getDataTag());
        xzb xzbVar4 = e23Var.b;
        if (r52.getLayoutParams() == null) {
            r52.setLayoutParams(new u79(-1, -2));
        }
        if (vut.A(d.c(), d2 != null ? d2.c() : null)) {
            ozw.i(d.c(), CameraProperty.WIDTH, d.getId(), r52.getResources().getDisplayMetrics(), xzbVar4, a2);
            dfbVar = a2;
        } else {
            dfbVar = a2;
            ozw.h(r52, d, xzbVar4, dfbVar);
            if (!vut.O(d.c())) {
                sk3.Q(A, d.c(), xzbVar4, new v79(ozwVar, r52, d, xzbVar4, dfbVar, 1));
            }
        }
        if (vut.A(d.a(), d2 != null ? d2.a() : null)) {
            ozw.i(d.a(), CameraProperty.HEIGHT, d.getId(), r52.getResources().getDisplayMetrics(), xzbVar4, dfbVar);
        } else {
            ozw.c(r52, d, xzbVar4, dfbVar);
            if (!vut.O(d.a())) {
                dp8Var = d;
                sk3.Q(A, d.a(), xzbVar4, new v79(ozwVar, r52, d, xzbVar4, dfbVar, 0));
                int i3 = 1;
                if (!vut.w(dp8Var.j(), d2 == null ? d2.j() : null)) {
                    bg3.l(r52, dp8Var.j(), xzbVar3);
                    if (!vut.L(dp8Var.j())) {
                        sk3.K(A, dp8Var.j(), xzbVar3, new ep8((View) r52, dp8Var, xzbVar3, i3));
                    }
                }
                if (xp3.B(dp8Var.u(), d2 == null ? d2.u() : null)) {
                }
                szb u = dp8Var.u();
                om8 om8Var = u == null ? (om8) u.a(xzbVar3) : null;
                szb o = dp8Var.o();
                bg3.j(r52, om8Var, o == null ? (pm8) o.a(xzbVar3) : null);
                if (xp3.V(dp8Var.u()) || !xp3.V(dp8Var.o())) {
                    ep8 ep8Var = new ep8((View) r52, dp8Var, xzbVar3, i2);
                    szb u2 = dp8Var.u();
                    A.i(u2 == null ? u2.c(xzbVar3, ep8Var) : null);
                    szb o2 = dp8Var.o();
                    A.i(o2 == null ? o2.c(xzbVar3, ep8Var) : null);
                }
                final ?? f5 = gc8Var3.getViewComponent$div_release().f();
                v = dp8Var.v();
                w79 v2 = d2 == null ? d2.v() : null;
                if (v != null) {
                    f5.a(r52, v2);
                    dp8Var2 = d2;
                    dp8Var3 = dp8Var;
                    xzbVar = xzbVar3;
                    gc8Var = gc8Var3;
                    i = 1;
                    view3 = r52;
                } else {
                    f5.getClass();
                    gc8 gc8Var4 = f5.b;
                    if (c.o(v.b, v2 != null ? v2.b : null, false)) {
                    }
                    f5.a(r52, v2);
                    rv8 divData = gc8Var4.getDivData();
                    if (divData != null) {
                        final String str = v.b;
                        final String str2 = v.a;
                        final dfb a3 = f5.a.a(divData, gc8Var4.getDataTag());
                        if ((str == null || str.length() == 0) && (str2 == null || str2.length() == 0)) {
                            dp8Var2 = d2;
                            dp8Var3 = dp8Var;
                            xzbVar = xzbVar3;
                            gc8Var = gc8Var3;
                            i = 1;
                            a3.d(new Throwable("Neither width_variable_name nor height_variable_name found."));
                            view3 = r52;
                        } else {
                            LinkedHashMap linkedHashMap = f5.e;
                            Object obj = linkedHashMap.get(divData);
                            if (obj == null) {
                                dp8Var2 = d2;
                                LinkedHashSet linkedHashSet = new LinkedHashSet();
                                linkedHashMap.put(divData, linkedHashSet);
                                obj = linkedHashSet;
                            } else {
                                dp8Var2 = d2;
                            }
                            ((Set) obj).add(v);
                            LinkedHashMap linkedHashMap2 = f5.d;
                            Object obj2 = linkedHashMap2.get(divData);
                            if (obj2 == null) {
                                obj2 = new c89();
                                linkedHashMap2.put(divData, obj2);
                            }
                            final c89 c89Var = (c89) obj2;
                            e23 bindingContext$div_release = gc8Var4.getBindingContext$div_release();
                            if (c89Var.v.isEmpty()) {
                                c89Var.X(divData, bindingContext$div_release);
                            }
                            dp8Var3 = dp8Var;
                            View.OnLayoutChangeListener onLayoutChangeListener = new View.OnLayoutChangeListener() { // from class: x79
                                @Override // android.view.View.OnLayoutChangeListener
                                public final void onLayoutChange(View view5, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11) {
                                    View view6 = r52;
                                    DisplayMetrics displayMetrics = view6.getResources().getDisplayMetrics();
                                    y79 y79Var2 = y79.this;
                                    String str3 = str;
                                    c89 c89Var2 = c89Var;
                                    xzb xzbVar5 = xzbVar3;
                                    dfb dfbVar2 = a3;
                                    y79Var2.b(displayMetrics, str3, c89Var2, i4, i6, i8, i10, xzbVar5, dfbVar2);
                                    y79Var2.b(view6.getResources().getDisplayMetrics(), str2, c89Var2, i5, i7, i9, i11, xzbVar5, dfbVar2);
                                }
                            };
                            if (view.getWidth() > 0 || view.getHeight() > 0) {
                                y79Var = f5;
                                gc8Var2 = gc8Var4;
                                xzbVar = xzbVar3;
                                gc8Var = gc8Var3;
                                i = 1;
                                onLayoutChangeListener.onLayoutChange(view, view.getLeft(), view.getTop(), view.getRight(), view.getBottom(), 0, 0, 0, 0);
                                view2 = view;
                            } else {
                                view2 = view;
                                y79Var = f5;
                                gc8Var2 = gc8Var4;
                                gc8Var = gc8Var3;
                                i = 1;
                                xzbVar = xzbVar3;
                            }
                            view2.addOnLayoutChangeListener(onLayoutChangeListener);
                            view2.setTag(R.id.div_layout_provider_listener_id, onLayoutChangeListener);
                            view3 = view2;
                            if (gc8Var2.isAttachedToWindow()) {
                                view3 = view2;
                                if (y79Var.f == null) {
                                    gzj gzjVar = new gzj(new oqj(new rs6(23, y79Var)), jqa.g);
                                    y79Var.f = gzjVar;
                                    gc8Var2.getViewTreeObserver().addOnPreDrawListener(gzjVar);
                                    view3 = view2;
                                }
                            }
                        }
                    }
                    dp8Var2 = d2;
                    dp8Var3 = dp8Var;
                    xzbVar = xzbVar3;
                    gc8Var = gc8Var3;
                    i = 1;
                    view3 = r52;
                }
                bz2Var = gp8Var.d;
                z = bz2Var.b;
                if (dp8Var3.q() == null) {
                    if ((dp8Var2 != null ? dp8Var2.q() : null) == null) {
                        if (z) {
                            bz2.p(view3, dp8Var3, null);
                        }
                        dp8Var4 = dp8Var3;
                        xzbVar2 = xzbVar;
                        if (!xp3.B(dp8Var4.b(), dp8Var2 == null ? dp8Var2.b() : null)) {
                            view3.setAlpha((float) ((Number) dp8Var4.b().a(xzbVar2)).doubleValue());
                            yp8 yp8Var = view3 instanceof yp8 ? (yp8) view3 : null;
                            if (yp8Var != null) {
                                yp8Var.k();
                            }
                            if (!(dp8Var4.b() instanceof ozb)) {
                                A.i(dp8Var4.b().c(xzbVar2, new sv4(20, gp8Var, view3)));
                            }
                        }
                        dp8 dp8Var7 = dp8Var4;
                        View view5 = view3;
                        dp8Var5 = dp8Var2;
                        gp8Var.b(view5, e23Var, dp8Var7, dp8Var5, A, true, null);
                        dp8Var6 = dp8Var7;
                        view4 = view5;
                        wz8 p6 = dp8Var6.p();
                        op8Var = p6 == null ? p6.b : null;
                        op8 C = dp8Var6.C();
                        znk.t(e23Var, (op8Var == null || znk.z(op8Var) || !view4.isFocused()) ? C : op8Var, view4);
                        View.OnFocusChangeListener onFocusChangeListener = view4.getOnFocusChangeListener();
                        xz8Var = onFocusChangeListener instanceof xz8 ? (xz8) onFocusChangeListener : null;
                        znk znkVar = gp8Var.c;
                        if (xz8Var == null || !znk.z(op8Var)) {
                            if (xz8Var == null && xz8Var.d == null && xz8Var.e == null && znk.z(op8Var)) {
                                view4.setOnFocusChangeListener(null);
                            } else {
                                xz8 xz8Var3 = new xz8(znkVar, e23Var);
                                xz8Var3.b = op8Var;
                                xz8Var3.c = C;
                                if (xz8Var != null) {
                                    List list3 = xz8Var.d;
                                    List list4 = xz8Var.e;
                                    xz8Var3.d = list3;
                                    xz8Var3.e = list4;
                                }
                                view4.setOnFocusChangeListener(xz8Var3);
                            }
                        }
                        c(view4, dp8Var6, dp8Var5, xzbVar2, A);
                        z0a l = gc8Var.getViewComponent$div_release().l();
                        wz8 p7 = dp8Var6.p();
                        szbVar5 = (p7 != null || (vz8Var10 = p7.c) == null) ? null : vz8Var10.b;
                        if (!xp3.B(szbVar5, (dp8Var5 != null || (p5 = dp8Var5.p()) == null || (vz8Var9 = p5.c) == null) ? null : vz8Var9.b)) {
                            String str3 = szbVar5 != null ? (String) szbVar5.a(xzbVar2) : null;
                            view4.setNextFocusForwardId(l.a(str3));
                            view4.setAccessibilityTraversalBefore(l.a(str3));
                            if (!xp3.V(szbVar5)) {
                                A.i(szbVar5 != null ? szbVar5.c(xzbVar2, new fp8(view4, l, 0)) : null);
                            }
                        }
                        wz8 p8 = dp8Var6.p();
                        szbVar6 = (p8 != null || (vz8Var8 = p8.c) == null) ? null : vz8Var8.c;
                        if (!xp3.B(szbVar6, (dp8Var5 != null || (p4 = dp8Var5.p()) == null || (vz8Var7 = p4.c) == null) ? null : vz8Var7.c)) {
                            view4.setNextFocusLeftId(l.a(szbVar6 != null ? (String) szbVar6.a(xzbVar2) : null));
                            if (!xp3.V(szbVar6)) {
                                A.i(szbVar6 != null ? szbVar6.c(xzbVar2, new fp8(view4, l, i)) : null);
                            }
                        }
                        wz8 p9 = dp8Var6.p();
                        szbVar7 = (p9 != null || (vz8Var6 = p9.c) == null) ? null : vz8Var6.d;
                        if (!xp3.B(szbVar7, (dp8Var5 != null || (p3 = dp8Var5.p()) == null || (vz8Var5 = p3.c) == null) ? null : vz8Var5.d)) {
                            view4.setNextFocusRightId(l.a(szbVar7 != null ? (String) szbVar7.a(xzbVar2) : null));
                            if (!xp3.V(szbVar7)) {
                                A.i(szbVar7 != null ? szbVar7.c(xzbVar2, new fp8(view4, l, 2)) : null);
                            }
                        }
                        wz8 p10 = dp8Var6.p();
                        szbVar8 = (p10 != null || (vz8Var4 = p10.c) == null) ? null : vz8Var4.e;
                        int i4 = 3;
                        if (!xp3.B(szbVar8, (dp8Var5 != null || (p2 = dp8Var5.p()) == null || (vz8Var3 = p2.c) == null) ? null : vz8Var3.e)) {
                            view4.setNextFocusUpId(l.a(szbVar8 != null ? (String) szbVar8.a(xzbVar2) : null));
                            if (!xp3.V(szbVar8)) {
                                A.i(szbVar8 != null ? szbVar8.c(xzbVar2, new fp8(view4, l, 3)) : null);
                            }
                        }
                        wz8 p11 = dp8Var6.p();
                        szbVar9 = (p11 != null || (vz8Var2 = p11.c) == null) ? null : vz8Var2.a;
                        if (!xp3.B(szbVar9, (dp8Var5 != null || (p = dp8Var5.p()) == null || (vz8Var = p.c) == null) ? null : vz8Var.a)) {
                            view4.setNextFocusDownId(l.a(szbVar9 != null ? (String) szbVar9.a(xzbVar2) : null));
                            if (!xp3.V(szbVar9)) {
                                A.i(szbVar9 != null ? szbVar9.c(xzbVar2, new fp8(view4, l, 4)) : null);
                            }
                        }
                        wz8 p12 = dp8Var6.p();
                        list = p12 != null ? p12.e : null;
                        wz8 p13 = dp8Var6.p();
                        list2 = p13 != null ? p13.d : null;
                        View.OnFocusChangeListener onFocusChangeListener2 = view4.getOnFocusChangeListener();
                        xz8Var2 = onFocusChangeListener2 instanceof xz8 ? (xz8) onFocusChangeListener2 : null;
                        if (xz8Var2 == null) {
                            List[] listArr2 = new List[2];
                            c = 0;
                            listArr2[0] = list;
                            listArr2[i] = list2;
                            if (leu.z(listArr2)) {
                                qv9Var = null;
                                r5 = view4;
                                if (!xp3.B(dp8Var6.getVisibility(), dp8Var5 != null ? dp8Var5.getVisibility() : qv9Var)) {
                                    gc8 gc8Var5 = gc8Var;
                                    a(view4, gc8Var5, dp8Var6, xzbVar2, dp8Var5 == null ? i : c);
                                    r5 = view4;
                                    if (!(dp8Var6.getVisibility() instanceof ozb)) {
                                        szb visibility = dp8Var6.getVisibility();
                                        ii iiVar = new ii(this, view4, gc8Var5, dp8Var6, xzbVar2, 7);
                                        gp8Var = this;
                                        dp8Var6 = dp8Var6;
                                        r5 = view4;
                                        A.i(visibility.c(xzbVar2, iiVar));
                                    }
                                }
                                f = dp8Var6.f();
                                f2 = dp8Var5 != null ? dp8Var5.f() : qv9Var;
                                if (f == null || f2 != null) {
                                    if (xp3.B(f != null ? f.c : qv9Var, f2 != null ? f2.c : qv9Var)) {
                                        if (vut.z(f != null ? f.a : qv9Var, f2 != null ? f2.a : qv9Var)) {
                                        }
                                    }
                                    bg3.n(dp8Var6, xzbVar2, r5);
                                    f3 = dp8Var6.f();
                                    if (f3 != null && (!xp3.V(f3.c) || !vut.N(f3.a) || !vut.N(f3.b))) {
                                        f4 = dp8Var6.f();
                                        ep8 ep8Var2 = new ep8((View) r5, dp8Var6, xzbVar2, i4);
                                        if (f4 != null) {
                                            szb szbVar10 = f4.c;
                                            A.i(szbVar10 != null ? szbVar10.c(xzbVar2, ep8Var2) : qv9Var);
                                            sk3.M(A, f4.a, xzbVar2, ep8Var2);
                                            sk3.M(A, f4.b, xzbVar2, ep8Var2);
                                        }
                                    }
                                }
                                x = dp8Var6.x();
                                if (x != null) {
                                    gp8Var.b.getClass();
                                    r5.setTag(R.id.div_tooltips_tag, x);
                                }
                                if ((dp8Var6 instanceof l49) || (dp8Var6 instanceof jo9)) {
                                    return;
                                }
                                r5.setFocusable(dp8Var6.p() != null ? i : c);
                                return;
                            }
                        } else {
                            c = 0;
                        }
                        if (xz8Var2 != null && xz8Var2.b == null) {
                            listArr = new List[2];
                            listArr[c] = list;
                            listArr[i] = list2;
                            if (leu.z(listArr)) {
                                qv9Var = null;
                                view4.setOnFocusChangeListener(null);
                                r5 = view4;
                                if (!xp3.B(dp8Var6.getVisibility(), dp8Var5 != null ? dp8Var5.getVisibility() : qv9Var)) {
                                }
                                f = dp8Var6.f();
                                if (dp8Var5 != null) {
                                }
                                if (f == null) {
                                }
                                if (xp3.B(f != null ? f.c : qv9Var, f2 != null ? f2.c : qv9Var)) {
                                }
                                bg3.n(dp8Var6, xzbVar2, r5);
                                f3 = dp8Var6.f();
                                if (f3 != null) {
                                    f4 = dp8Var6.f();
                                    ep8 ep8Var22 = new ep8((View) r5, dp8Var6, xzbVar2, i4);
                                    if (f4 != null) {
                                    }
                                }
                                x = dp8Var6.x();
                                if (x != null) {
                                }
                                if (dp8Var6 instanceof l49) {
                                    return;
                                } else {
                                    return;
                                }
                            }
                        }
                        qv9Var = null;
                        xz8 xz8Var4 = new xz8(znkVar, e23Var);
                        if (xz8Var2 != null) {
                            op8 op8Var2 = xz8Var2.b;
                            op8 op8Var3 = xz8Var2.c;
                            xz8Var4.b = op8Var2;
                            xz8Var4.c = op8Var3;
                        }
                        xz8Var4.d = list;
                        xz8Var4.e = list2;
                        view4.setOnFocusChangeListener(xz8Var4);
                        r5 = view4;
                        if (!xp3.B(dp8Var6.getVisibility(), dp8Var5 != null ? dp8Var5.getVisibility() : qv9Var)) {
                        }
                        f = dp8Var6.f();
                        if (dp8Var5 != null) {
                        }
                        if (f == null) {
                        }
                        if (xp3.B(f != null ? f.c : qv9Var, f2 != null ? f2.c : qv9Var)) {
                        }
                        bg3.n(dp8Var6, xzbVar2, r5);
                        f3 = dp8Var6.f();
                        if (f3 != null) {
                        }
                        x = dp8Var6.x();
                        if (x != null) {
                        }
                        if (dp8Var6 instanceof l49) {
                        }
                    }
                }
                if (((zb) bz2Var.c).a(view3.getContext())) {
                    if (dp8Var2 != null) {
                        tc8 q5 = dp8Var3.q();
                        sc8 sc8Var = q5 != null ? q5.g : null;
                        tc8 q6 = dp8Var2.q();
                    }
                    tc8 q7 = dp8Var3.q();
                    sc8 sc8Var2 = q7 != null ? q7.g : null;
                    if (sc8Var2 == null) {
                        sc8Var2 = sc8.AUTO;
                    }
                    int M = bz2.M(sc8Var2, dp8Var3);
                    if (M != 6 || !(view3 instanceof vi2)) {
                        String str4 = "";
                        switch (ouj.D(M)) {
                            case 0:
                            case 3:
                            case 5:
                            case 6:
                                r6 = M != 4 ? i : 0;
                                CharSequence accessibilityClassName = view3.getAccessibilityClassName();
                                if ((str4.length() != 0 && !str4.equals(accessibilityClassName)) || r6 != 0) {
                                    aVar = new o1c(str4, r6, (M != 13 || M == 12) ? i : 0);
                                    break;
                                } else {
                                    aVar = null;
                                    break;
                                }
                                break;
                            case 1:
                                str4 = "android.widget.Button";
                                if (M != 4) {
                                }
                                CharSequence accessibilityClassName2 = view3.getAccessibilityClassName();
                                if (str4.length() != 0) {
                                    if (M != 13) {
                                        break;
                                    }
                                    aVar = new o1c(str4, r6, (M != 13 || M == 12) ? i : 0);
                                    break;
                                }
                                aVar = new o1c(str4, r6, (M != 13 || M == 12) ? i : 0);
                                break;
                            case 2:
                                str4 = "android.widget.EditText";
                                if (M != 4) {
                                }
                                CharSequence accessibilityClassName22 = view3.getAccessibilityClassName();
                                if (str4.length() != 0) {
                                }
                                aVar = new o1c(str4, r6, (M != 13 || M == 12) ? i : 0);
                                break;
                            case 4:
                                str4 = "android.widget.ImageView";
                                if (M != 4) {
                                }
                                CharSequence accessibilityClassName222 = view3.getAccessibilityClassName();
                                if (str4.length() != 0) {
                                }
                                aVar = new o1c(str4, r6, (M != 13 || M == 12) ? i : 0);
                                break;
                            case 7:
                                str4 = "android.widget.Spinner";
                                if (M != 4) {
                                }
                                CharSequence accessibilityClassName2222 = view3.getAccessibilityClassName();
                                if (str4.length() != 0) {
                                }
                                aVar = new o1c(str4, r6, (M != 13 || M == 12) ? i : 0);
                                break;
                            case 8:
                                str4 = "android.widget.TabWidget";
                                if (M != 4) {
                                }
                                CharSequence accessibilityClassName22222 = view3.getAccessibilityClassName();
                                if (str4.length() != 0) {
                                }
                                aVar = new o1c(str4, r6, (M != 13 || M == 12) ? i : 0);
                                break;
                            case 9:
                                str4 = "androidx.viewpager.widget.ViewPager";
                                if (M != 4) {
                                }
                                CharSequence accessibilityClassName222222 = view3.getAccessibilityClassName();
                                if (str4.length() != 0) {
                                }
                                aVar = new o1c(str4, r6, (M != 13 || M == 12) ? i : 0);
                                break;
                            case 10:
                                str4 = "android.widget.TextView";
                                if (M != 4) {
                                }
                                CharSequence accessibilityClassName2222222 = view3.getAccessibilityClassName();
                                if (str4.length() != 0) {
                                }
                                aVar = new o1c(str4, r6, (M != 13 || M == 12) ? i : 0);
                                break;
                            case 11:
                                str4 = "android.widget.RadioButton";
                                if (M != 4) {
                                }
                                CharSequence accessibilityClassName22222222 = view3.getAccessibilityClassName();
                                if (str4.length() != 0) {
                                }
                                aVar = new o1c(str4, r6, (M != 13 || M == 12) ? i : 0);
                                break;
                            case 12:
                                str4 = "android.widget.CheckBox";
                                if (M != 4) {
                                }
                                CharSequence accessibilityClassName222222222 = view3.getAccessibilityClassName();
                                if (str4.length() != 0) {
                                }
                                aVar = new o1c(str4, r6, (M != 13 || M == 12) ? i : 0);
                                break;
                            case 13:
                                str4 = "android.view.ViewGroup";
                                if (M != 4) {
                                }
                                CharSequence accessibilityClassName2222222222 = view3.getAccessibilityClassName();
                                if (str4.length() != 0) {
                                }
                                aVar = new o1c(str4, r6, (M != 13 || M == 12) ? i : 0);
                                break;
                            case 14:
                                str4 = "android.widget.Switch";
                                if (M != 4) {
                                }
                                CharSequence accessibilityClassName22222222222 = view3.getAccessibilityClassName();
                                if (str4.length() != 0) {
                                }
                                aVar = new o1c(str4, r6, (M != 13 || M == 12) ? i : 0);
                                break;
                            default:
                                b6e.s();
                                break;
                        }
                        return;
                    }
                    aVar = new ob((vi2) view3);
                    if (aVar != null) {
                        wdu.q(view3, aVar);
                    }
                }
                tc8 q8 = dp8Var3.q();
                szbVar = q8 == null ? q8.a : null;
                tc8 q9 = dp8Var3.q();
                szbVar2 = q9 == null ? q9.b : null;
                if (xp3.B(szbVar, (dp8Var2 != null || (q4 = dp8Var2.q()) == null) ? null : q4.a)) {
                }
                bz2.n(view3, szbVar == null ? (String) szbVar.a(xzbVar) : null, szbVar2 == null ? (String) szbVar2.a(xzbVar) : null);
                if (xp3.V(szbVar) || !xp3.V(szbVar2)) {
                    dp8 dp8Var8 = dp8Var3;
                    xzb xzbVar5 = xzbVar;
                    ii iiVar2 = new ii(bz2Var, view3, szbVar, xzbVar5, szbVar2, dp8Var8, 5);
                    szb szbVar11 = szbVar2;
                    xzbVar2 = xzbVar5;
                    bz2Var2 = bz2Var;
                    szb szbVar12 = szbVar;
                    dp8Var4 = dp8Var8;
                    A.i(szbVar12 == null ? szbVar12.c(xzbVar2, iiVar2) : null);
                    A.i(szbVar11 == null ? szbVar11.c(xzbVar2, iiVar2) : null);
                    if (z) {
                        tc8 q10 = dp8Var4.q();
                        szb szbVar13 = q10 != null ? q10.d : null;
                        if (xp3.B(szbVar13, (dp8Var2 == null || (q3 = dp8Var2.q()) == null) ? null : q3.d)) {
                            tc8 q11 = dp8Var4.q();
                        }
                        bz2.p(view3, dp8Var4, szbVar13 != null ? (rc8) szbVar13.a(xzbVar2) : null);
                        if (!xp3.V(szbVar13)) {
                            A.i(szbVar13 != null ? szbVar13.c(xzbVar2, new uc8(bz2Var2, view3, dp8Var4, i)) : null);
                        }
                    }
                    tc8 q12 = dp8Var4.q();
                    szbVar3 = q12 != null ? q12.f : null;
                    if (!xp3.B(szbVar3, (dp8Var2 != null || (q2 = dp8Var2.q()) == null) ? null : q2.f)) {
                        wdu.s(view3, szbVar3 != null ? (String) szbVar3.a(xzbVar2) : null);
                        if (!xp3.V(szbVar3)) {
                            A.i(szbVar3 != null ? szbVar3.c(xzbVar2, new tq2(bz2Var2, view3)) : null);
                        }
                    }
                    tc8 q13 = dp8Var4.q();
                    szbVar4 = q13 != null ? q13.c : null;
                    if (!xp3.B(szbVar4, (dp8Var2 != null || (q = dp8Var2.q()) == null) ? null : q.c)) {
                        bz2.m(view3, dp8Var4, szbVar4 != null ? (Boolean) szbVar4.a(xzbVar2) : null);
                        if (!xp3.V(szbVar4)) {
                            A.i(szbVar4 != null ? szbVar4.c(xzbVar2, new uc8(bz2Var2, view3, dp8Var4, 0)) : null);
                        }
                    }
                    if (!xp3.B(dp8Var4.b(), dp8Var2 == null ? dp8Var2.b() : null)) {
                    }
                    dp8 dp8Var72 = dp8Var4;
                    View view52 = view3;
                    dp8Var5 = dp8Var2;
                    gp8Var.b(view52, e23Var, dp8Var72, dp8Var5, A, true, null);
                    dp8Var6 = dp8Var72;
                    view4 = view52;
                    wz8 p62 = dp8Var6.p();
                    if (p62 == null) {
                    }
                    op8 C2 = dp8Var6.C();
                    if (op8Var == null) {
                        znk.t(e23Var, (op8Var == null || znk.z(op8Var) || !view4.isFocused()) ? C2 : op8Var, view4);
                        View.OnFocusChangeListener onFocusChangeListener3 = view4.getOnFocusChangeListener();
                        if (onFocusChangeListener3 instanceof xz8) {
                        }
                        znk znkVar2 = gp8Var.c;
                        if (xz8Var == null) {
                        }
                        if (xz8Var == null) {
                        }
                        xz8 xz8Var32 = new xz8(znkVar2, e23Var);
                        xz8Var32.b = op8Var;
                        xz8Var32.c = C2;
                        if (xz8Var != null) {
                        }
                        view4.setOnFocusChangeListener(xz8Var32);
                        c(view4, dp8Var6, dp8Var5, xzbVar2, A);
                        z0a l2 = gc8Var.getViewComponent$div_release().l();
                        wz8 p72 = dp8Var6.p();
                        if (p72 != null) {
                        }
                        if (!xp3.B(szbVar5, (dp8Var5 != null || (p5 = dp8Var5.p()) == null || (vz8Var9 = p5.c) == null) ? null : vz8Var9.b)) {
                        }
                        wz8 p82 = dp8Var6.p();
                        if (p82 != null) {
                        }
                        if (!xp3.B(szbVar6, (dp8Var5 != null || (p4 = dp8Var5.p()) == null || (vz8Var7 = p4.c) == null) ? null : vz8Var7.c)) {
                        }
                        wz8 p92 = dp8Var6.p();
                        if (p92 != null) {
                        }
                        if (!xp3.B(szbVar7, (dp8Var5 != null || (p3 = dp8Var5.p()) == null || (vz8Var5 = p3.c) == null) ? null : vz8Var5.d)) {
                        }
                        wz8 p102 = dp8Var6.p();
                        if (p102 != null) {
                        }
                        int i42 = 3;
                        if (!xp3.B(szbVar8, (dp8Var5 != null || (p2 = dp8Var5.p()) == null || (vz8Var3 = p2.c) == null) ? null : vz8Var3.e)) {
                        }
                        wz8 p112 = dp8Var6.p();
                        if (p112 != null) {
                        }
                        if (!xp3.B(szbVar9, (dp8Var5 != null || (p = dp8Var5.p()) == null || (vz8Var = p.c) == null) ? null : vz8Var.a)) {
                        }
                        wz8 p122 = dp8Var6.p();
                        if (p122 != null) {
                        }
                        wz8 p132 = dp8Var6.p();
                        if (p132 != null) {
                        }
                        View.OnFocusChangeListener onFocusChangeListener22 = view4.getOnFocusChangeListener();
                        if (onFocusChangeListener22 instanceof xz8) {
                        }
                        if (xz8Var2 == null) {
                        }
                        if (xz8Var2 != null) {
                            listArr = new List[2];
                            listArr[c] = list;
                            listArr[i] = list2;
                            if (leu.z(listArr)) {
                            }
                        }
                        qv9Var = null;
                        xz8 xz8Var42 = new xz8(znkVar2, e23Var);
                        if (xz8Var2 != null) {
                        }
                        xz8Var42.d = list;
                        xz8Var42.e = list2;
                        view4.setOnFocusChangeListener(xz8Var42);
                        r5 = view4;
                        if (!xp3.B(dp8Var6.getVisibility(), dp8Var5 != null ? dp8Var5.getVisibility() : qv9Var)) {
                        }
                        f = dp8Var6.f();
                        if (dp8Var5 != null) {
                        }
                        if (f == null) {
                        }
                        if (xp3.B(f != null ? f.c : qv9Var, f2 != null ? f2.c : qv9Var)) {
                        }
                        bg3.n(dp8Var6, xzbVar2, r5);
                        f3 = dp8Var6.f();
                        if (f3 != null) {
                        }
                        x = dp8Var6.x();
                        if (x != null) {
                        }
                        if (dp8Var6 instanceof l49) {
                        }
                    }
                    znk.t(e23Var, (op8Var == null || znk.z(op8Var) || !view4.isFocused()) ? C2 : op8Var, view4);
                    View.OnFocusChangeListener onFocusChangeListener32 = view4.getOnFocusChangeListener();
                    if (onFocusChangeListener32 instanceof xz8) {
                    }
                    znk znkVar22 = gp8Var.c;
                    if (xz8Var == null) {
                    }
                    if (xz8Var == null) {
                    }
                    xz8 xz8Var322 = new xz8(znkVar22, e23Var);
                    xz8Var322.b = op8Var;
                    xz8Var322.c = C2;
                    if (xz8Var != null) {
                    }
                    view4.setOnFocusChangeListener(xz8Var322);
                    c(view4, dp8Var6, dp8Var5, xzbVar2, A);
                    z0a l22 = gc8Var.getViewComponent$div_release().l();
                    wz8 p722 = dp8Var6.p();
                    if (p722 != null) {
                    }
                    if (!xp3.B(szbVar5, (dp8Var5 != null || (p5 = dp8Var5.p()) == null || (vz8Var9 = p5.c) == null) ? null : vz8Var9.b)) {
                    }
                    wz8 p822 = dp8Var6.p();
                    if (p822 != null) {
                    }
                    if (!xp3.B(szbVar6, (dp8Var5 != null || (p4 = dp8Var5.p()) == null || (vz8Var7 = p4.c) == null) ? null : vz8Var7.c)) {
                    }
                    wz8 p922 = dp8Var6.p();
                    if (p922 != null) {
                    }
                    if (!xp3.B(szbVar7, (dp8Var5 != null || (p3 = dp8Var5.p()) == null || (vz8Var5 = p3.c) == null) ? null : vz8Var5.d)) {
                    }
                    wz8 p1022 = dp8Var6.p();
                    if (p1022 != null) {
                    }
                    int i422 = 3;
                    if (!xp3.B(szbVar8, (dp8Var5 != null || (p2 = dp8Var5.p()) == null || (vz8Var3 = p2.c) == null) ? null : vz8Var3.e)) {
                    }
                    wz8 p1122 = dp8Var6.p();
                    if (p1122 != null) {
                    }
                    if (!xp3.B(szbVar9, (dp8Var5 != null || (p = dp8Var5.p()) == null || (vz8Var = p.c) == null) ? null : vz8Var.a)) {
                    }
                    wz8 p1222 = dp8Var6.p();
                    if (p1222 != null) {
                    }
                    wz8 p1322 = dp8Var6.p();
                    if (p1322 != null) {
                    }
                    View.OnFocusChangeListener onFocusChangeListener222 = view4.getOnFocusChangeListener();
                    if (onFocusChangeListener222 instanceof xz8) {
                    }
                    if (xz8Var2 == null) {
                    }
                    if (xz8Var2 != null) {
                    }
                    qv9Var = null;
                    xz8 xz8Var422 = new xz8(znkVar22, e23Var);
                    if (xz8Var2 != null) {
                    }
                    xz8Var422.d = list;
                    xz8Var422.e = list2;
                    view4.setOnFocusChangeListener(xz8Var422);
                    r5 = view4;
                    if (!xp3.B(dp8Var6.getVisibility(), dp8Var5 != null ? dp8Var5.getVisibility() : qv9Var)) {
                    }
                    f = dp8Var6.f();
                    if (dp8Var5 != null) {
                    }
                    if (f == null) {
                    }
                    if (xp3.B(f != null ? f.c : qv9Var, f2 != null ? f2.c : qv9Var)) {
                    }
                    bg3.n(dp8Var6, xzbVar2, r5);
                    f3 = dp8Var6.f();
                    if (f3 != null) {
                    }
                    x = dp8Var6.x();
                    if (x != null) {
                    }
                    if (dp8Var6 instanceof l49) {
                    }
                }
                dp8Var4 = dp8Var3;
                bz2Var2 = bz2Var;
                xzbVar2 = xzbVar;
                if (z) {
                }
                tc8 q122 = dp8Var4.q();
                if (q122 != null) {
                }
                if (!xp3.B(szbVar3, (dp8Var2 != null || (q2 = dp8Var2.q()) == null) ? null : q2.f)) {
                }
                tc8 q132 = dp8Var4.q();
                if (q132 != null) {
                }
                if (!xp3.B(szbVar4, (dp8Var2 != null || (q = dp8Var2.q()) == null) ? null : q.c)) {
                }
                if (!xp3.B(dp8Var4.b(), dp8Var2 == null ? dp8Var2.b() : null)) {
                }
                dp8 dp8Var722 = dp8Var4;
                View view522 = view3;
                dp8Var5 = dp8Var2;
                gp8Var.b(view522, e23Var, dp8Var722, dp8Var5, A, true, null);
                dp8Var6 = dp8Var722;
                view4 = view522;
                wz8 p622 = dp8Var6.p();
                if (p622 == null) {
                }
                op8 C22 = dp8Var6.C();
                znk.t(e23Var, (op8Var == null || znk.z(op8Var) || !view4.isFocused()) ? C22 : op8Var, view4);
                View.OnFocusChangeListener onFocusChangeListener322 = view4.getOnFocusChangeListener();
                if (onFocusChangeListener322 instanceof xz8) {
                }
                znk znkVar222 = gp8Var.c;
                if (xz8Var == null) {
                }
                if (xz8Var == null) {
                }
                xz8 xz8Var3222 = new xz8(znkVar222, e23Var);
                xz8Var3222.b = op8Var;
                xz8Var3222.c = C22;
                if (xz8Var != null) {
                }
                view4.setOnFocusChangeListener(xz8Var3222);
                c(view4, dp8Var6, dp8Var5, xzbVar2, A);
                z0a l222 = gc8Var.getViewComponent$div_release().l();
                wz8 p7222 = dp8Var6.p();
                if (p7222 != null) {
                }
                if (!xp3.B(szbVar5, (dp8Var5 != null || (p5 = dp8Var5.p()) == null || (vz8Var9 = p5.c) == null) ? null : vz8Var9.b)) {
                }
                wz8 p8222 = dp8Var6.p();
                if (p8222 != null) {
                }
                if (!xp3.B(szbVar6, (dp8Var5 != null || (p4 = dp8Var5.p()) == null || (vz8Var7 = p4.c) == null) ? null : vz8Var7.c)) {
                }
                wz8 p9222 = dp8Var6.p();
                if (p9222 != null) {
                }
                if (!xp3.B(szbVar7, (dp8Var5 != null || (p3 = dp8Var5.p()) == null || (vz8Var5 = p3.c) == null) ? null : vz8Var5.d)) {
                }
                wz8 p10222 = dp8Var6.p();
                if (p10222 != null) {
                }
                int i4222 = 3;
                if (!xp3.B(szbVar8, (dp8Var5 != null || (p2 = dp8Var5.p()) == null || (vz8Var3 = p2.c) == null) ? null : vz8Var3.e)) {
                }
                wz8 p11222 = dp8Var6.p();
                if (p11222 != null) {
                }
                if (!xp3.B(szbVar9, (dp8Var5 != null || (p = dp8Var5.p()) == null || (vz8Var = p.c) == null) ? null : vz8Var.a)) {
                }
                wz8 p12222 = dp8Var6.p();
                if (p12222 != null) {
                }
                wz8 p13222 = dp8Var6.p();
                if (p13222 != null) {
                }
                View.OnFocusChangeListener onFocusChangeListener2222 = view4.getOnFocusChangeListener();
                if (onFocusChangeListener2222 instanceof xz8) {
                }
                if (xz8Var2 == null) {
                }
                if (xz8Var2 != null) {
                }
                qv9Var = null;
                xz8 xz8Var4222 = new xz8(znkVar222, e23Var);
                if (xz8Var2 != null) {
                }
                xz8Var4222.d = list;
                xz8Var4222.e = list2;
                view4.setOnFocusChangeListener(xz8Var4222);
                r5 = view4;
                if (!xp3.B(dp8Var6.getVisibility(), dp8Var5 != null ? dp8Var5.getVisibility() : qv9Var)) {
                }
                f = dp8Var6.f();
                if (dp8Var5 != null) {
                }
                if (f == null) {
                }
                if (xp3.B(f != null ? f.c : qv9Var, f2 != null ? f2.c : qv9Var)) {
                }
                bg3.n(dp8Var6, xzbVar2, r5);
                f3 = dp8Var6.f();
                if (f3 != null) {
                }
                x = dp8Var6.x();
                if (x != null) {
                }
                if (dp8Var6 instanceof l49) {
                }
            }
        }
        dp8Var = d;
        int i32 = 1;
        if (!vut.w(dp8Var.j(), d2 == null ? d2.j() : null)) {
        }
        if (xp3.B(dp8Var.u(), d2 == null ? d2.u() : null)) {
        }
        szb u3 = dp8Var.u();
        if (u3 == null) {
        }
        szb o3 = dp8Var.o();
        bg3.j(r52, om8Var, o3 == null ? (pm8) o3.a(xzbVar3) : null);
        if (xp3.V(dp8Var.u())) {
        }
        ep8 ep8Var3 = new ep8((View) r52, dp8Var, xzbVar3, i2);
        szb u22 = dp8Var.u();
        A.i(u22 == null ? u22.c(xzbVar3, ep8Var3) : null);
        szb o22 = dp8Var.o();
        A.i(o22 == null ? o22.c(xzbVar3, ep8Var3) : null);
        final y79 f52 = gc8Var3.getViewComponent$div_release().f();
        v = dp8Var.v();
        if (d2 == null) {
        }
        if (v != null) {
        }
        bz2Var = gp8Var.d;
        z = bz2Var.b;
        if (dp8Var3.q() == null) {
        }
        if (((zb) bz2Var.c).a(view3.getContext())) {
        }
        tc8 q82 = dp8Var3.q();
        if (q82 == null) {
        }
        tc8 q92 = dp8Var3.q();
        if (q92 == null) {
        }
        if (xp3.B(szbVar, (dp8Var2 != null || (q4 = dp8Var2.q()) == null) ? null : q4.a)) {
        }
        bz2.n(view3, szbVar == null ? (String) szbVar.a(xzbVar) : null, szbVar2 == null ? (String) szbVar2.a(xzbVar) : null);
        if (xp3.V(szbVar)) {
        }
        dp8 dp8Var82 = dp8Var3;
        xzb xzbVar52 = xzbVar;
        ii iiVar22 = new ii(bz2Var, view3, szbVar, xzbVar52, szbVar2, dp8Var82, 5);
        szb szbVar112 = szbVar2;
        xzbVar2 = xzbVar52;
        bz2Var2 = bz2Var;
        szb szbVar122 = szbVar;
        dp8Var4 = dp8Var82;
        A.i(szbVar122 == null ? szbVar122.c(xzbVar2, iiVar22) : null);
        A.i(szbVar112 == null ? szbVar112.c(xzbVar2, iiVar22) : null);
        if (z) {
        }
        tc8 q1222 = dp8Var4.q();
        if (q1222 != null) {
        }
        if (!xp3.B(szbVar3, (dp8Var2 != null || (q2 = dp8Var2.q()) == null) ? null : q2.f)) {
        }
        tc8 q1322 = dp8Var4.q();
        if (q1322 != null) {
        }
        if (!xp3.B(szbVar4, (dp8Var2 != null || (q = dp8Var2.q()) == null) ? null : q.c)) {
        }
        if (!xp3.B(dp8Var4.b(), dp8Var2 == null ? dp8Var2.b() : null)) {
        }
        dp8 dp8Var7222 = dp8Var4;
        View view5222 = view3;
        dp8Var5 = dp8Var2;
        gp8Var.b(view5222, e23Var, dp8Var7222, dp8Var5, A, true, null);
        dp8Var6 = dp8Var7222;
        view4 = view5222;
        wz8 p6222 = dp8Var6.p();
        if (p6222 == null) {
        }
        op8 C222 = dp8Var6.C();
        znk.t(e23Var, (op8Var == null || znk.z(op8Var) || !view4.isFocused()) ? C222 : op8Var, view4);
        View.OnFocusChangeListener onFocusChangeListener3222 = view4.getOnFocusChangeListener();
        if (onFocusChangeListener3222 instanceof xz8) {
        }
        znk znkVar2222 = gp8Var.c;
        if (xz8Var == null) {
        }
        if (xz8Var == null) {
        }
        xz8 xz8Var32222 = new xz8(znkVar2222, e23Var);
        xz8Var32222.b = op8Var;
        xz8Var32222.c = C222;
        if (xz8Var != null) {
        }
        view4.setOnFocusChangeListener(xz8Var32222);
        c(view4, dp8Var6, dp8Var5, xzbVar2, A);
        z0a l2222 = gc8Var.getViewComponent$div_release().l();
        wz8 p72222 = dp8Var6.p();
        if (p72222 != null) {
        }
        if (!xp3.B(szbVar5, (dp8Var5 != null || (p5 = dp8Var5.p()) == null || (vz8Var9 = p5.c) == null) ? null : vz8Var9.b)) {
        }
        wz8 p82222 = dp8Var6.p();
        if (p82222 != null) {
        }
        if (!xp3.B(szbVar6, (dp8Var5 != null || (p4 = dp8Var5.p()) == null || (vz8Var7 = p4.c) == null) ? null : vz8Var7.c)) {
        }
        wz8 p92222 = dp8Var6.p();
        if (p92222 != null) {
        }
        if (!xp3.B(szbVar7, (dp8Var5 != null || (p3 = dp8Var5.p()) == null || (vz8Var5 = p3.c) == null) ? null : vz8Var5.d)) {
        }
        wz8 p102222 = dp8Var6.p();
        if (p102222 != null) {
        }
        int i42222 = 3;
        if (!xp3.B(szbVar8, (dp8Var5 != null || (p2 = dp8Var5.p()) == null || (vz8Var3 = p2.c) == null) ? null : vz8Var3.e)) {
        }
        wz8 p112222 = dp8Var6.p();
        if (p112222 != null) {
        }
        if (!xp3.B(szbVar9, (dp8Var5 != null || (p = dp8Var5.p()) == null || (vz8Var = p.c) == null) ? null : vz8Var.a)) {
        }
        wz8 p122222 = dp8Var6.p();
        if (p122222 != null) {
        }
        wz8 p132222 = dp8Var6.p();
        if (p132222 != null) {
        }
        View.OnFocusChangeListener onFocusChangeListener22222 = view4.getOnFocusChangeListener();
        if (onFocusChangeListener22222 instanceof xz8) {
        }
        if (xz8Var2 == null) {
        }
        if (xz8Var2 != null) {
        }
        qv9Var = null;
        xz8 xz8Var42222 = new xz8(znkVar2222, e23Var);
        if (xz8Var2 != null) {
        }
        xz8Var42222.d = list;
        xz8Var42222.e = list2;
        view4.setOnFocusChangeListener(xz8Var42222);
        r5 = view4;
        if (!xp3.B(dp8Var6.getVisibility(), dp8Var5 != null ? dp8Var5.getVisibility() : qv9Var)) {
        }
        f = dp8Var6.f();
        if (dp8Var5 != null) {
        }
        if (f == null) {
        }
        if (xp3.B(f != null ? f.c : qv9Var, f2 != null ? f2.c : qv9Var)) {
        }
        bg3.n(dp8Var6, xzbVar2, r5);
        f3 = dp8Var6.f();
        if (f3 != null) {
        }
        x = dp8Var6.x();
        if (x != null) {
        }
        if (dp8Var6 instanceof l49) {
        }
    }
}
