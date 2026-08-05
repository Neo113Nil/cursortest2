package defpackage;

import android.animation.Animator;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.WindowId;
import java.util.ArrayList;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class ud0 implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {
    public ViewGroup MdtA4re8;
    public rd0 NCTxEWno;

    /* JADX WARN: Removed duplicated region for block: B:114:0x01e0 A[EDGE_INSN: B:114:0x01e0->B:115:0x01e0 BREAK  A[LOOP:1: B:16:0x0084->B:28:0x01d9], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:118:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:11:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0208  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0234  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0089  */
    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onPreDraw() {
        ArrayList arrayList;
        int i;
        x0 x0Var;
        x0 x0Var2;
        int i2;
        int[] iArr;
        int i3;
        int i4;
        int i5;
        pd0 pd0Var;
        boolean z;
        zd0 zd0Var;
        View view;
        View view2;
        boolean z2;
        rd0 rd0Var = this.NCTxEWno;
        ViewGroup viewGroup = this.MdtA4re8;
        viewGroup.getViewTreeObserver().removeOnPreDrawListener(this);
        viewGroup.removeOnAttachStateChangeListener(this);
        boolean z3 = true;
        if (!vd0.NCTxEWno.remove(viewGroup)) {
            return true;
        }
        x0 qoPGr6Ce = vd0.qoPGr6Ce();
        ArrayList arrayList2 = (ArrayList) qoPGr6Ce.get(viewGroup);
        if (arrayList2 == null) {
            arrayList2 = new ArrayList();
            qoPGr6Ce.put(viewGroup, arrayList2);
        } else if (arrayList2.size() > 0) {
            arrayList = new ArrayList(arrayList2);
            arrayList2.add(rd0Var);
            rd0Var.qoPGr6Ce(new td0(this, qoPGr6Ce));
            i = 0;
            rd0Var.Qr9iLBAD(viewGroup, false);
            if (arrayList != null) {
                int size = arrayList.size();
                int i6 = 0;
                while (i6 < size) {
                    Object obj = arrayList.get(i6);
                    i6++;
                    ((rd0) obj).DK9slbsy(viewGroup);
                }
            }
            rd0Var.OnDfzHZD = new ArrayList();
            rd0Var.ygLcUYwZ = new ArrayList();
            VZZbw3BB vZZbw3BB = rd0Var.jb9XjC4I;
            VZZbw3BB vZZbw3BB2 = rd0Var.eVhOlqcC;
            x0Var = new x0((x0) vZZbw3BB.qoPGr6Ce);
            x0Var2 = new x0((x0) vZZbw3BB2.qoPGr6Ce);
            i2 = 0;
            while (true) {
                iArr = rd0Var.ow5vqvCr;
                if (i2 < iArr.length) {
                    break;
                }
                int i7 = iArr[i2];
                if (i7 == z3) {
                    z = z3;
                    for (int i8 = x0Var.wxUZMvaN - 1; i8 >= 0; i8--) {
                        View view3 = (View) x0Var.P7K7Inc8(i8);
                        if (view3 != null && rd0Var.I5GHvsYW(view3) && (zd0Var = (zd0) x0Var2.remove(view3)) != null && rd0Var.I5GHvsYW(zd0Var.NCTxEWno)) {
                            rd0Var.OnDfzHZD.add((zd0) x0Var.b2ZJblxo(i8));
                            rd0Var.ygLcUYwZ.add(zd0Var);
                        }
                    }
                } else if (i7 == 2) {
                    z = z3;
                    x0 x0Var3 = (x0) vZZbw3BB.wxUZMvaN;
                    x0 x0Var4 = (x0) vZZbw3BB2.wxUZMvaN;
                    int i9 = x0Var3.wxUZMvaN;
                    for (int i10 = 0; i10 < i9; i10++) {
                        View view4 = (View) x0Var3.jb9XjC4I(i10);
                        if (view4 != null && rd0Var.I5GHvsYW(view4) && (view = (View) x0Var4.get(x0Var3.P7K7Inc8(i10))) != null && rd0Var.I5GHvsYW(view)) {
                            zd0 zd0Var2 = (zd0) x0Var.get(view4);
                            zd0 zd0Var3 = (zd0) x0Var2.get(view);
                            if (zd0Var2 != null && zd0Var3 != null) {
                                rd0Var.OnDfzHZD.add(zd0Var2);
                                rd0Var.ygLcUYwZ.add(zd0Var3);
                                x0Var.remove(view4);
                                x0Var2.remove(view);
                            }
                        }
                    }
                } else if (i7 != 3) {
                    if (i7 == 4) {
                        lq lqVar = (lq) vZZbw3BB.MdtA4re8;
                        lq lqVar2 = (lq) vZZbw3BB2.MdtA4re8;
                        int VgvYg0wo = lqVar.VgvYg0wo();
                        int i11 = i;
                        while (i11 < VgvYg0wo) {
                            View view5 = (View) lqVar.P7K7Inc8(i11);
                            if (view5 == null || !rd0Var.I5GHvsYW(view5)) {
                                z2 = z3;
                            } else {
                                boolean z4 = z3;
                                View view6 = (View) lqVar2.NCTxEWno(lqVar.MdtA4re8(i11));
                                if (view6 != null && rd0Var.I5GHvsYW(view6)) {
                                    zd0 zd0Var4 = (zd0) x0Var.get(view5);
                                    zd0 zd0Var5 = (zd0) x0Var2.get(view6);
                                    if (zd0Var4 != null && zd0Var5 != null) {
                                        z2 = z4;
                                        rd0Var.OnDfzHZD.add(zd0Var4);
                                        rd0Var.ygLcUYwZ.add(zd0Var5);
                                        x0Var.remove(view5);
                                        x0Var2.remove(view6);
                                    }
                                }
                                z2 = z4;
                            }
                            i11++;
                            z3 = z2;
                        }
                    }
                    z = z3;
                } else {
                    z = z3;
                    SparseArray sparseArray = (SparseArray) vZZbw3BB.NCTxEWno;
                    SparseArray sparseArray2 = (SparseArray) vZZbw3BB2.NCTxEWno;
                    int size2 = sparseArray.size();
                    for (int i12 = 0; i12 < size2; i12++) {
                        View view7 = (View) sparseArray.valueAt(i12);
                        if (view7 != null && rd0Var.I5GHvsYW(view7) && (view2 = (View) sparseArray2.get(sparseArray.keyAt(i12))) != null && rd0Var.I5GHvsYW(view2)) {
                            zd0 zd0Var6 = (zd0) x0Var.get(view7);
                            zd0 zd0Var7 = (zd0) x0Var2.get(view2);
                            if (zd0Var6 != null && zd0Var7 != null) {
                                rd0Var.OnDfzHZD.add(zd0Var6);
                                rd0Var.ygLcUYwZ.add(zd0Var7);
                                x0Var.remove(view7);
                                x0Var2.remove(view2);
                            }
                        }
                    }
                }
                i2++;
                z3 = z;
                i = 0;
            }
            boolean z5 = z3;
            for (i3 = 0; i3 < x0Var.wxUZMvaN; i3++) {
                zd0 zd0Var8 = (zd0) x0Var.jb9XjC4I(i3);
                if (rd0Var.I5GHvsYW(zd0Var8.NCTxEWno)) {
                    rd0Var.OnDfzHZD.add(zd0Var8);
                    rd0Var.ygLcUYwZ.add(null);
                }
            }
            for (i4 = 0; i4 < x0Var2.wxUZMvaN; i4++) {
                zd0 zd0Var9 = (zd0) x0Var2.jb9XjC4I(i4);
                if (rd0Var.I5GHvsYW(zd0Var9.NCTxEWno)) {
                    rd0Var.ygLcUYwZ.add(zd0Var9);
                    rd0Var.OnDfzHZD.add(null);
                }
            }
            x0 OxcuoDLp = rd0.OxcuoDLp();
            int i13 = OxcuoDLp.wxUZMvaN;
            WindowId windowId = viewGroup.getWindowId();
            i5 = i13 - 1;
            while (i5 >= 0) {
                Animator animator = (Animator) OxcuoDLp.P7K7Inc8(i5);
                if (animator != null && (pd0Var = (pd0) OxcuoDLp.get(animator)) != null) {
                    rd0 rd0Var2 = pd0Var.VgvYg0wo;
                    View view8 = pd0Var.qoPGr6Ce;
                    if (view8 != null && windowId.equals(pd0Var.wxUZMvaN)) {
                        zd0 zd0Var10 = pd0Var.MdtA4re8;
                        boolean z6 = z5;
                        zd0 KlHjfFWx = rd0Var.KlHjfFWx(view8, z6);
                        zd0 lDXGDhIF = rd0Var.lDXGDhIF(view8, z6);
                        if (KlHjfFWx == null && lDXGDhIF == null) {
                            lDXGDhIF = (zd0) ((x0) rd0Var.eVhOlqcC.qoPGr6Ce).get(view8);
                        }
                        if ((KlHjfFWx != null || lDXGDhIF != null) && rd0Var2.Ey6iv0m0(zd0Var10, lDXGDhIF)) {
                            rd0Var2.sjUBp5pO().getClass();
                            if (animator.isRunning() || animator.isStarted()) {
                                animator.cancel();
                            } else {
                                OxcuoDLp.remove(animator);
                            }
                        }
                    }
                }
                i5--;
                z5 = true;
            }
            rd0Var.ow5vqvCr(viewGroup, rd0Var.jb9XjC4I, rd0Var.eVhOlqcC, rd0Var.OnDfzHZD, rd0Var.ygLcUYwZ);
            rd0Var.lwWCatUu();
            return true;
        }
        arrayList = null;
        arrayList2.add(rd0Var);
        rd0Var.qoPGr6Ce(new td0(this, qoPGr6Ce));
        i = 0;
        rd0Var.Qr9iLBAD(viewGroup, false);
        if (arrayList != null) {
        }
        rd0Var.OnDfzHZD = new ArrayList();
        rd0Var.ygLcUYwZ = new ArrayList();
        VZZbw3BB vZZbw3BB3 = rd0Var.jb9XjC4I;
        VZZbw3BB vZZbw3BB22 = rd0Var.eVhOlqcC;
        x0Var = new x0((x0) vZZbw3BB3.qoPGr6Ce);
        x0Var2 = new x0((x0) vZZbw3BB22.qoPGr6Ce);
        i2 = 0;
        while (true) {
            iArr = rd0Var.ow5vqvCr;
            if (i2 < iArr.length) {
            }
            i2++;
            z3 = z;
            i = 0;
        }
        boolean z52 = z3;
        while (i3 < x0Var.wxUZMvaN) {
        }
        while (i4 < x0Var2.wxUZMvaN) {
        }
        x0 OxcuoDLp2 = rd0.OxcuoDLp();
        int i132 = OxcuoDLp2.wxUZMvaN;
        WindowId windowId2 = viewGroup.getWindowId();
        i5 = i132 - 1;
        while (i5 >= 0) {
        }
        rd0Var.ow5vqvCr(viewGroup, rd0Var.jb9XjC4I, rd0Var.eVhOlqcC, rd0Var.OnDfzHZD, rd0Var.ygLcUYwZ);
        rd0Var.lwWCatUu();
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        ViewGroup viewGroup = this.MdtA4re8;
        viewGroup.getViewTreeObserver().removeOnPreDrawListener(this);
        viewGroup.removeOnAttachStateChangeListener(this);
        vd0.NCTxEWno.remove(viewGroup);
        ArrayList arrayList = (ArrayList) vd0.qoPGr6Ce().get(viewGroup);
        if (arrayList != null && arrayList.size() > 0) {
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                ((rd0) obj).DK9slbsy(viewGroup);
            }
        }
        this.NCTxEWno.jb9XjC4I(true);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }
}
