package defpackage;

import android.graphics.Bitmap;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.view.View;
import android.view.animation.Interpolator;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import ru.yandex.music.R;

/* loaded from: classes3.dex */
public final class v29 extends p9 {
    public final a39 b;
    public final qe9 c;
    public final efb d;

    public v29(gp8 gp8Var, a39 a39Var, qe9 qe9Var, efb efbVar) {
        super(gp8Var);
        this.b = a39Var;
        this.c = qe9Var;
        this.d = efbVar;
    }

    public static final void G(v29 v29Var, i39 i39Var, i29 i29Var, xzb xzbVar, t33 t33Var) {
        i39Var.animate().cancel();
        zx8 zx8Var = i29Var.i;
        float doubleValue = (float) ((Number) i29Var.g.a(xzbVar)).doubleValue();
        if (zx8Var == null || t33Var == t33.c) {
            i39Var.setAlpha(doubleValue);
            return;
        }
        long longValue = ((Number) zx8Var.b.a(xzbVar)).longValue();
        Interpolator Q = vq1.Q((um8) zx8Var.c.a(xzbVar));
        i39Var.setAlpha((float) ((Number) zx8Var.a.a(xzbVar)).doubleValue());
        i39Var.animate().alpha(doubleValue).setDuration(longValue).setInterpolator(Q).setStartDelay(((Number) zx8Var.d.a(xzbVar)).longValue());
    }

    public static final void H(v29 v29Var, i39 i39Var, gc8 gc8Var, Drawable drawable) {
        d51 d51Var = d51.l;
        synchronized (d51Var) {
        }
        if (qht.a.a()) {
            i39Var.setImageDrawable(drawable);
            return;
        }
        g23 d = gc8Var.getViewComponent$div_release().d();
        f23 a = d.a();
        try {
            d51Var.p(new u29(d, a, i39Var, drawable, 0));
        } catch (Throwable th) {
            g23.b(a);
            throw th;
        }
    }

    public static final void I(v29 v29Var, i39 i39Var, e23 e23Var, Bitmap bitmap, i29 i29Var) {
        v29Var.L(i39Var, e23Var, bitmap, i29Var.N, i29Var.t);
        xzb xzbVar = e23Var.b;
        i39Var.p();
        szb szbVar = i29Var.P;
        M(i39Var, szbVar != null ? (Integer) szbVar.a(xzbVar) : null, (ip8) i29Var.Q.a(xzbVar));
    }

    public static void M(bgg bggVar, Integer num, ip8 ip8Var) {
        if ((bggVar.o() || Intrinsics.d(bggVar.getTag(R.id.image_loaded_flag), Boolean.FALSE)) && num != null) {
            bggVar.setColorFilter(num.intValue(), vq1.k0(ip8Var));
        } else {
            bggVar.setColorFilter((ColorFilter) null);
        }
    }

    public static boolean N(xzb xzbVar, i39 i39Var, i29 i29Var) {
        return !i39Var.o() && ((Boolean) i29Var.x.a(xzbVar)).booleanValue();
    }

    public static void O(i39 i39Var, gc8 gc8Var, Bitmap bitmap) {
        d51 d51Var = d51.l;
        synchronized (d51Var) {
        }
        if (qht.a.a()) {
            i39Var.setImageBitmap(bitmap);
            return;
        }
        g23 d = gc8Var.getViewComponent$div_release().d();
        f23 a = d.a();
        try {
            d51Var.p(new zg(d, a, i39Var, bitmap, 6));
        } catch (Throwable th) {
            g23.b(a);
            throw th;
        }
    }

    public final boolean J(i39 i39Var, e23 e23Var, i29 i29Var, dfb dfbVar) {
        xzb xzbVar = e23Var.b;
        gc8 gc8Var = e23Var.a;
        Uri uri = (Uri) i29Var.B.a(xzbVar);
        if (Intrinsics.d(uri, i39Var.getImageUrl$div_release())) {
            return false;
        }
        boolean N = N(xzbVar, i39Var, i29Var);
        i39Var.q();
        i39Var.setCurrentBitmapWithoutFilters$div_release(null);
        i39Var.setColorFilter((ColorFilter) null);
        ffg loadReference$div_release = i39Var.getLoadReference$div_release();
        if (loadReference$div_release != null) {
            loadReference$div_release.cancel();
        }
        K(i39Var, e23Var, i29Var, N, dfbVar);
        i39Var.setImageUrl$div_release(uri);
        ffg b = this.b.b(uri.toString(), new r29(this, i39Var, e23Var, i29Var, xzbVar, gc8Var));
        gc8Var.p(b);
        i39Var.setLoadReference$div_release(b);
        return true;
    }

    public final void K(i39 i39Var, e23 e23Var, i29 i29Var, boolean z, dfb dfbVar) {
        xzb xzbVar = e23Var.b;
        szb szbVar = i29Var.K;
        this.c.a(i39Var, dfbVar, szbVar != null ? (String) szbVar.a(xzbVar) : null, ((Number) i29Var.G.a(xzbVar)).intValue(), z, new s29(i39Var, this, e23Var), new ak0(i39Var, this, e23Var, i29Var, 9));
    }

    public final void L(i39 i39Var, e23 e23Var, Bitmap bitmap, szb szbVar, List list) {
        List list2 = list;
        if (list2 == null || list2.isEmpty()) {
            O(i39Var, e23Var.a, bitmap);
            return;
        }
        g39 g39Var = (g39) szbVar.a(e23Var.b);
        ArrayList h0 = vq1.h0(list, e23Var.b);
        i39Var.setCurrentBitmapWithoutFilters$div_release(bitmap);
        ild.q(e23Var.a, g39Var, bitmap, i39Var, h0, new s29(this, i39Var, e23Var));
    }

    /* JADX WARN: Code restructure failed: missing block: B:112:0x026e, code lost:
    
        if (defpackage.xp3.B(r2, r14 != null ? r14.B : r21) == false) goto L149;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x028d, code lost:
    
        r0 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x028f, code lost:
    
        if (r0 == null) goto L174;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x0295, code lost:
    
        if (r0.isEmpty() == false) goto L162;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x0298, code lost:
    
        r3 = r1.getCurrentBitmapWithoutFilters$div_release();
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x029c, code lost:
    
        if (r3 == null) goto L165;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x029e, code lost:
    
        L(r1, r22, r3, r10.N, r10.t);
     */
    /* JADX WARN: Code restructure failed: missing block: B:170:0x02aa, code lost:
    
        r0 = r1.getDrawable();
     */
    /* JADX WARN: Code restructure failed: missing block: B:171:0x02ae, code lost:
    
        if (r0 != null) goto L168;
     */
    /* JADX WARN: Code restructure failed: missing block: B:173:0x02b3, code lost:
    
        if ((r0 instanceof android.graphics.drawable.BitmapDrawable) == false) goto L172;
     */
    /* JADX WARN: Code restructure failed: missing block: B:174:0x02b5, code lost:
    
        r0 = ((android.graphics.drawable.BitmapDrawable) r0).getBitmap();
     */
    /* JADX WARN: Code restructure failed: missing block: B:176:0x02cb, code lost:
    
        L(r1, r22, r0, r10.N, r10.t);
     */
    /* JADX WARN: Code restructure failed: missing block: B:177:0x02bd, code lost:
    
        r0 = defpackage.vq2.N(r0, r0.getIntrinsicWidth(), r0.getIntrinsicHeight(), 4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:178:0x02d7, code lost:
    
        r0 = r1.getCurrentBitmapWithoutFilters$div_release();
     */
    /* JADX WARN: Code restructure failed: missing block: B:179:0x02db, code lost:
    
        if (r0 == null) goto L177;
     */
    /* JADX WARN: Code restructure failed: missing block: B:180:0x02dd, code lost:
    
        O(r1, r8, r0);
        r1.setCurrentBitmapWithoutFilters$div_release(r21);
     */
    /* JADX WARN: Code restructure failed: missing block: B:187:0x028a, code lost:
    
        if (defpackage.xp3.B(r9, r14 != null ? r14.K : r21) == false) goto L177;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00a0, code lost:
    
        if (defpackage.xp3.B(r11, r14 != null ? r14.p : null) != false) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x01b0, code lost:
    
        if (defpackage.xp3.B(r7, r14 != null ? r14.Q : r21) != false) goto L102;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0263  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x02ec  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x02fb  */
    /* JADX WARN: Removed duplicated region for block: B:168:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:184:0x027f  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x01ff  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x01e1  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x01e6  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0124 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x012d A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x018b A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01f6  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0218  */
    /* JADX WARN: Type inference failed for: r21v2 */
    /* JADX WARN: Type inference failed for: r21v3, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r21v4 */
    @Override // defpackage.p9
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void j(View view, e23 e23Var, dp8 dp8Var, dp8 dp8Var2) {
        i29 i29Var;
        xzb xzbVar;
        szb szbVar;
        boolean B;
        boolean z;
        boolean z2;
        szb szbVar2;
        dfb dfbVar;
        Bitmap bitmap;
        v29 v29Var;
        e23 e23Var2;
        szb szbVar3;
        szb szbVar4;
        i29 i29Var2;
        List list;
        List list2;
        boolean z3;
        boolean z4;
        List list3;
        List list4;
        i39 i39Var = (i39) view;
        i29 i29Var3 = (i29) dp8Var;
        i29 i29Var4 = (i29) dp8Var2;
        bd8 bd8Var = i29Var3.b;
        szb szbVar5 = i29Var3.K;
        szb szbVar6 = i29Var3.B;
        szb szbVar7 = i29Var3.N;
        bg3.k(i39Var, e23Var, bd8Var, i29Var3.d, i29Var3.D, i29Var3.r, i29Var3.z, i29Var3.y, i29Var3.J, i29Var3.I, i29Var3.c, i29Var3.m);
        gc8 gc8Var = e23Var.a;
        xzb xzbVar2 = e23Var.b;
        dfb a = this.d.a(gc8Var.getDivData(), gc8Var.getDataTag());
        bg3.p(i39Var, i29Var3.j, i29Var4 != null ? i29Var4.j : null, xzbVar2);
        if (!xp3.B(szbVar7, i29Var4 != null ? i29Var4.N : null)) {
            i39Var.setImageScale(vq1.i0((g39) szbVar7.a(xzbVar2)));
            if (!(szbVar7 instanceof ozb)) {
                i39Var.i(szbVar7.c(xzbVar2, new az6(this, i39Var)));
            }
        }
        szb szbVar8 = i29Var3.o;
        szb szbVar9 = i29Var3.p;
        if (xp3.B(szbVar8, i29Var4 != null ? i29Var4.o : null)) {
        }
        i39Var.setGravity(vq1.N((om8) szbVar8.a(xzbVar2), (pm8) szbVar9.a(xzbVar2)));
        if (!(szbVar8 instanceof ozb) || !(szbVar9 instanceof ozb)) {
            i29Var = i29Var3;
            t29 t29Var = new t29(this, i39Var, i29Var, xzbVar2, 0);
            i39Var = i39Var;
            xzbVar = xzbVar2;
            i39Var.i(szbVar8.c(xzbVar, t29Var));
            i39Var.i(szbVar9.c(xzbVar, t29Var));
            szbVar = i29Var.G;
            B = xp3.B(szbVar6, i29Var4 == null ? i29Var4.B : null);
            boolean z5 = false;
            if (xp3.B(szbVar5, i29Var4 == null ? i29Var4.K : null)) {
                if (xp3.B(szbVar, i29Var4 != null ? i29Var4.G : null)) {
                    z = false;
                    boolean z6 = !xp3.V(szbVar5) && (szbVar instanceof ozb);
                    z2 = i39Var.o() && z;
                    if (z2 || z6) {
                        szbVar2 = szbVar5;
                        dfbVar = a;
                        bitmap = 0;
                    } else {
                        xzb xzbVar3 = e23Var.b;
                        szbVar2 = szbVar5;
                        i29 i29Var5 = i29Var;
                        bitmap = 0;
                        a03 a03Var = new a03(i39Var, this, e23Var, i29Var5, xzbVar3, a, 5);
                        i29Var = i29Var5;
                        dfbVar = a;
                        i39Var.i(szbVar2 != null ? szbVar2.c(xzbVar3, a03Var) : null);
                        i39Var.i(szbVar.c(xzbVar3, a03Var));
                    }
                    if (!B || xp3.V(szbVar6)) {
                        v29Var = this;
                        e23Var2 = e23Var;
                    } else {
                        i39 i39Var2 = i39Var;
                        i29 i29Var6 = i29Var;
                        ii iiVar = new ii(this, i39Var2, e23Var, i29Var6, dfbVar, 12);
                        v29Var = this;
                        i39Var = i39Var2;
                        e23Var2 = e23Var;
                        i29Var = i29Var6;
                        i39Var.i(szbVar6.c(xzbVar, iiVar));
                    }
                    if (!v29Var.J(i39Var, e23Var2, i29Var, dfbVar) && z2) {
                        v29Var.K(i39Var, e23Var2, i29Var, N(xzbVar, i39Var, i29Var), dfbVar);
                    }
                    szbVar3 = i29Var.P;
                    szbVar4 = i29Var.Q;
                    if (xp3.B(szbVar3, i29Var4 != null ? i29Var4.P : bitmap)) {
                    }
                    M(i39Var, szbVar3 != null ? (Integer) szbVar3.a(xzbVar) : bitmap, (ip8) szbVar4.a(xzbVar));
                    if (xp3.V(szbVar3) || !(szbVar4 instanceof ozb)) {
                        i39 i39Var3 = i39Var;
                        t29 t29Var2 = new t29(this, i39Var3, i29Var, xzbVar, 1);
                        i39Var = i39Var3;
                        i29Var2 = i29Var;
                        i39Var.i(szbVar3 != null ? szbVar3.c(xzbVar, t29Var2) : bitmap);
                        i39Var.i(szbVar4.c(xzbVar, t29Var2));
                        list = i29Var2.t;
                        if (Intrinsics.d(list == null ? Integer.valueOf(list.size()) : bitmap, (i29Var4 != null || (list4 = i29Var4.t) == null) ? bitmap : Integer.valueOf(list4.size()))) {
                            if (list != null) {
                                int i = 0;
                                z4 = true;
                                for (Object obj : list) {
                                    int i2 = i + 1;
                                    if (i < 0) {
                                        u75.n();
                                        throw bitmap;
                                    }
                                    hy8 hy8Var = (hy8) obj;
                                    if (z4) {
                                        if (vut.x(hy8Var, (i29Var4 == null || (list3 = i29Var4.t) == null) ? bitmap : (hy8) list3.get(i))) {
                                            z4 = true;
                                            i = i2;
                                        }
                                    }
                                    z4 = false;
                                    i = i2;
                                }
                            } else {
                                z4 = true;
                            }
                            if (z4) {
                                return;
                            }
                        }
                        if (i39Var.o()) {
                        }
                        if (Intrinsics.d(i39Var.getTag(R.id.image_loaded_flag), Boolean.FALSE)) {
                        }
                        List list5 = i29Var2.t;
                        list2 = list5;
                        if (list2 != null || list2.isEmpty()) {
                            List<hy8> list6 = list5;
                            if (!(list6 instanceof Collection) || !list6.isEmpty()) {
                                for (hy8 hy8Var2 : list6) {
                                    if (hy8Var2 == null || (hy8Var2 instanceof gy8)) {
                                        z3 = true;
                                    } else {
                                        if (!(hy8Var2 instanceof fy8)) {
                                            b6e.s();
                                            return;
                                        }
                                        z3 = ((fy8) hy8Var2).b.a instanceof ozb;
                                    }
                                    if (!z3) {
                                        break;
                                    }
                                }
                            }
                            z5 = true;
                            if (z5 && (szbVar7 instanceof ozb)) {
                                return;
                            }
                            ii iiVar2 = new ii(i39Var, this, e23Var, i29Var2, list5, 11);
                            for (hy8 hy8Var3 : list6) {
                                if (hy8Var3 instanceof fy8) {
                                    i39Var.i(((fy8) hy8Var3).b.a.c(xzbVar, iiVar2));
                                }
                            }
                            szbVar7.c(xzbVar, iiVar2);
                            return;
                        }
                        return;
                    }
                    i29Var2 = i29Var;
                    list = i29Var2.t;
                    if (Intrinsics.d(list == null ? Integer.valueOf(list.size()) : bitmap, (i29Var4 != null || (list4 = i29Var4.t) == null) ? bitmap : Integer.valueOf(list4.size()))) {
                    }
                    if (i39Var.o()) {
                    }
                    if (Intrinsics.d(i39Var.getTag(R.id.image_loaded_flag), Boolean.FALSE)) {
                    }
                    List list52 = i29Var2.t;
                    list2 = list52;
                    if (list2 != null || list2.isEmpty()) {
                    }
                }
            }
            z = true;
            if (xp3.V(szbVar5)) {
            }
            if (i39Var.o()) {
            }
            if (z2) {
            }
            szbVar2 = szbVar5;
            dfbVar = a;
            bitmap = 0;
            if (B) {
            }
            v29Var = this;
            e23Var2 = e23Var;
            if (!v29Var.J(i39Var, e23Var2, i29Var, dfbVar)) {
                v29Var.K(i39Var, e23Var2, i29Var, N(xzbVar, i39Var, i29Var), dfbVar);
            }
            szbVar3 = i29Var.P;
            szbVar4 = i29Var.Q;
            if (xp3.B(szbVar3, i29Var4 != null ? i29Var4.P : bitmap)) {
            }
            M(i39Var, szbVar3 != null ? (Integer) szbVar3.a(xzbVar) : bitmap, (ip8) szbVar4.a(xzbVar));
            if (xp3.V(szbVar3)) {
            }
            i39 i39Var32 = i39Var;
            t29 t29Var22 = new t29(this, i39Var32, i29Var, xzbVar, 1);
            i39Var = i39Var32;
            i29Var2 = i29Var;
            i39Var.i(szbVar3 != null ? szbVar3.c(xzbVar, t29Var22) : bitmap);
            i39Var.i(szbVar4.c(xzbVar, t29Var22));
            list = i29Var2.t;
            if (Intrinsics.d(list == null ? Integer.valueOf(list.size()) : bitmap, (i29Var4 != null || (list4 = i29Var4.t) == null) ? bitmap : Integer.valueOf(list4.size()))) {
            }
            if (i39Var.o()) {
            }
            if (Intrinsics.d(i39Var.getTag(R.id.image_loaded_flag), Boolean.FALSE)) {
            }
            List list522 = i29Var2.t;
            list2 = list522;
            if (list2 != null || list2.isEmpty()) {
            }
        }
        xzbVar = xzbVar2;
        i29Var = i29Var3;
        szbVar = i29Var.G;
        B = xp3.B(szbVar6, i29Var4 == null ? i29Var4.B : null);
        boolean z52 = false;
        if (xp3.B(szbVar5, i29Var4 == null ? i29Var4.K : null)) {
        }
        z = true;
        if (xp3.V(szbVar5)) {
        }
        if (i39Var.o()) {
        }
        if (z2) {
        }
        szbVar2 = szbVar5;
        dfbVar = a;
        bitmap = 0;
        if (B) {
        }
        v29Var = this;
        e23Var2 = e23Var;
        if (!v29Var.J(i39Var, e23Var2, i29Var, dfbVar)) {
        }
        szbVar3 = i29Var.P;
        szbVar4 = i29Var.Q;
        if (xp3.B(szbVar3, i29Var4 != null ? i29Var4.P : bitmap)) {
        }
        M(i39Var, szbVar3 != null ? (Integer) szbVar3.a(xzbVar) : bitmap, (ip8) szbVar4.a(xzbVar));
        if (xp3.V(szbVar3)) {
        }
        i39 i39Var322 = i39Var;
        t29 t29Var222 = new t29(this, i39Var322, i29Var, xzbVar, 1);
        i39Var = i39Var322;
        i29Var2 = i29Var;
        i39Var.i(szbVar3 != null ? szbVar3.c(xzbVar, t29Var222) : bitmap);
        i39Var.i(szbVar4.c(xzbVar, t29Var222));
        list = i29Var2.t;
        if (Intrinsics.d(list == null ? Integer.valueOf(list.size()) : bitmap, (i29Var4 != null || (list4 = i29Var4.t) == null) ? bitmap : Integer.valueOf(list4.size()))) {
        }
        if (i39Var.o()) {
        }
        if (Intrinsics.d(i39Var.getTag(R.id.image_loaded_flag), Boolean.FALSE)) {
        }
        List list5222 = i29Var2.t;
        list2 = list5222;
        if (list2 != null || list2.isEmpty()) {
        }
    }
}
