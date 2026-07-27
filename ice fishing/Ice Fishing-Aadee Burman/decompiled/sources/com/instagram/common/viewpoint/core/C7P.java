package com.instagram.common.viewpoint.core;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewPropertyAnimator;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.7P, reason: invalid class name */
/* loaded from: assets/audience_network/classes2.dex */
public final class C7P extends AbstractC1894ha {
    public static TimeInterpolator A0B;
    public static String[] A0C = {"5", "w4FteHoxEZNBcBknXysU1QdwgOlgu", "XTfmSewcFvVIPqcU8HiF2JwhBroc2", "gTOT0dcLAsFp3JXaujmr6eSvv", "MioH3rC6822UBFONR3LUPujrkCbYq", "9Rk7JcSITmrZ17kamSQ7i6v9RKdnt", "plmSW6Ql", "PR6dCqey"};
    public ArrayList<RK> A0A = new ArrayList<>();
    public ArrayList<RK> A07 = new ArrayList<>();
    public ArrayList<C1173Qa> A09 = new ArrayList<>();
    public ArrayList<QZ> A08 = new ArrayList<>();
    public ArrayList<ArrayList<RK>> A01 = new ArrayList<>();
    public ArrayList<ArrayList<C1173Qa>> A05 = new ArrayList<>();
    public ArrayList<ArrayList<QZ>> A03 = new ArrayList<>();
    public ArrayList<RK> A00 = new ArrayList<>();
    public ArrayList<RK> A04 = new ArrayList<>();
    public ArrayList<RK> A06 = new ArrayList<>();
    public ArrayList<RK> A02 = new ArrayList<>();

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 9 out of bounds for length 9
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:125)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:636)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    @Override // com.instagram.common.viewpoint.core.AbstractC1196Qy
    public final void A0H() {
        int size;
        for (int size2 = this.A09.size() - 1; size2 >= 0; size2--) {
            C1173Qa c1173Qa = this.A09.get(size2);
            View view = c1173Qa.A04.A0H;
            view.setTranslationY(0.0f);
            view.setTranslationX(0.0f);
            A0U(c1173Qa.A04);
            this.A09.remove(size2);
        }
        for (int size3 = this.A0A.size() - 1; size3 >= 0; size3--) {
            A0V(this.A0A.get(size3));
            this.A0A.remove(size3);
        }
        for (int size4 = this.A07.size() - 1; size4 >= 0; size4--) {
            RK rk = this.A07.get(size4);
            rk.A0H.setAlpha(1.0f);
            A0T(rk);
            this.A07.remove(size4);
        }
        for (int size5 = this.A08.size() - 1; size5 >= 0; size5--) {
            ArrayList<QZ> arrayList = this.A08;
            String[] strArr = A0C;
            if (strArr[0].length() == strArr[3].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0C;
            strArr2[4] = "IUveBZzBDFrSzC13ImzzVKkvQDdr2";
            strArr2[5] = "sCoWws78k8eiD0jPt8s7ggXNZv987";
            A00(arrayList.get(size5));
        }
        this.A08.clear();
        if (A0M()) {
            for (int size6 = this.A05.size() - 1; size6 >= 0; size6--) {
                ArrayList<C1173Qa> arrayList2 = this.A05.get(size6);
                for (int size7 = arrayList2.size() - 1; size7 >= 0; size7--) {
                    C1173Qa c1173Qa2 = arrayList2.get(size7);
                    View view2 = c1173Qa2.A04.A0H;
                    view2.setTranslationY(0.0f);
                    view2.setTranslationX(0.0f);
                    A0U(c1173Qa2.A04);
                    arrayList2.remove(size7);
                    if (arrayList2.isEmpty()) {
                        this.A05.remove(arrayList2);
                    }
                }
            }
            for (int size8 = this.A01.size() - 1; size8 >= 0; size8--) {
                ArrayList<RK> arrayList3 = this.A01.get(size8);
                for (int size9 = arrayList3.size() - 1; size9 >= 0; size9--) {
                    RK rk2 = arrayList3.get(size9);
                    rk2.A0H.setAlpha(1.0f);
                    A0T(rk2);
                    arrayList3.remove(size9);
                    if (arrayList3.isEmpty()) {
                        ArrayList<ArrayList<RK>> arrayList4 = this.A01;
                        String[] strArr3 = A0C;
                        if (strArr3[0].length() != strArr3[3].length()) {
                            String[] strArr4 = A0C;
                            strArr4[7] = "VBPMrKBD";
                            strArr4[6] = "WZFlfD4M";
                            arrayList4.remove(arrayList3);
                        } else {
                            arrayList4.remove(arrayList3);
                        }
                    }
                }
            }
            ArrayList<ArrayList<QZ>> arrayList5 = this.A03;
            String[] strArr5 = A0C;
            if (strArr5[7].length() != strArr5[6].length()) {
                size = arrayList5.size() - 1;
            } else {
                String[] strArr6 = A0C;
                strArr6[2] = "1rfkrkAxI3SWkdgenr27gUX73o6p1";
                strArr6[1] = "SSeA7srmTqf1oxxrlzMYS1BTDHSjo";
                size = arrayList5.size() - 1;
            }
            while (size >= 0) {
                ArrayList<QZ> arrayList6 = this.A03.get(size);
                for (int size10 = arrayList6.size() - 1; size10 >= 0; size10--) {
                    A00(arrayList6.get(size10));
                    if (arrayList6.isEmpty()) {
                        this.A03.remove(arrayList6);
                    }
                }
                size--;
            }
            A03(this.A06);
            A03(this.A04);
            A03(this.A00);
            A03(this.A02);
            A0G();
        }
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    @Override // com.instagram.common.viewpoint.core.AbstractC1894ha
    public final boolean A0Z(RK rk, int i, int i6, int i9, int i10) {
        View view = rk.A0H;
        int translationX = i + ((int) rk.A0H.getTranslationX());
        int translationY = i6 + ((int) rk.A0H.getTranslationY());
        A02(rk);
        int i11 = i9 - translationX;
        int i12 = i10 - translationY;
        if (i11 == 0 && i12 == 0) {
            A0U(rk);
            return false;
        }
        if (i11 != 0) {
            view.setTranslationX(-i11);
        }
        if (i12 != 0) {
            view.setTranslationY(-i12);
        }
        this.A09.add(new C1173Qa(rk, translationX, translationY, i9, i10));
        return true;
    }

    private void A00(QZ qz) {
        if (qz.A05 != null) {
            A05(qz, qz.A05);
        }
        if (qz.A04 != null) {
            A05(qz, qz.A04);
        }
    }

    private void A01(RK rk) {
        View view = rk.A0H;
        ViewPropertyAnimator animate = view.animate();
        this.A06.add(rk);
        ViewPropertyAnimator animation = animate.setDuration(A0D());
        animation.alpha(0.0f).setListener(new QU(this, rk, animate, view)).start();
    }

    private void A02(RK rk) {
        if (A0B == null) {
            A0B = new ValueAnimator().getInterpolator();
        }
        rk.A0H.animate().setInterpolator(A0B);
        A0L(rk);
    }

    private final void A03(List<RK> list) {
        for (int size = list.size() - 1; size >= 0; size--) {
            list.get(size).A0H.animate().cancel();
        }
    }

    private void A04(List<QZ> list, RK rk) {
        for (int size = list.size() - 1; size >= 0; size--) {
            QZ changeInfo = list.get(size);
            if (A05(changeInfo, rk) && changeInfo.A05 == null && changeInfo.A04 == null) {
                list.remove(changeInfo);
            }
        }
    }

    private boolean A05(QZ qz, RK rk) {
        boolean z3 = false;
        if (qz.A04 == rk) {
            qz.A04 = null;
        } else {
            RK rk2 = qz.A05;
            String[] strArr = A0C;
            if (strArr[2].length() != strArr[1].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0C;
            strArr2[0] = "F";
            strArr2[3] = "q2hYYatvKRTsdUwOPBYP5pb4s";
            if (rk2 == rk) {
                qz.A05 = null;
                z3 = true;
            } else {
                return false;
            }
        }
        rk.A0H.setAlpha(1.0f);
        rk.A0H.setTranslationX(0.0f);
        rk.A0H.setTranslationY(0.0f);
        A0W(rk, z3);
        return true;
    }

    /* JADX WARN: Incorrect condition in loop: B:10:0x0033 */
    @Override // com.instagram.common.viewpoint.core.AbstractC1196Qy
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void A0I() {
        boolean z3 = !this.A0A.isEmpty();
        boolean removalsPending = this.A09.isEmpty();
        boolean z6 = !removalsPending;
        boolean removalsPending2 = this.A08.isEmpty();
        boolean z9 = !removalsPending2;
        boolean removalsPending3 = this.A07.isEmpty();
        boolean z10 = !removalsPending3;
        if (!z3 && !z6 && !z10 && !z9) {
            return;
        }
        Iterator<RK> it = this.A0A.iterator();
        while (removalsPending) {
            A01(it.next());
        }
        this.A0A.clear();
        if (z6) {
            ArrayList<C1173Qa> arrayList = new ArrayList<>();
            arrayList.addAll(this.A09);
            this.A05.add(arrayList);
            this.A09.clear();
            QR qr = new QR(this, arrayList);
            if (z3) {
                Ph.A0E(arrayList.get(0).A04.A0H, qr, A0D());
            } else {
                qr.run();
            }
        }
        if (z9) {
            ArrayList<QZ> arrayList2 = new ArrayList<>();
            arrayList2.addAll(this.A08);
            this.A03.add(arrayList2);
            this.A08.clear();
            QS qs = new QS(this, arrayList2);
            if (z3) {
                Ph.A0E(arrayList2.get(0).A05.A0H, qs, A0D());
            } else {
                qs.run();
            }
        }
        if (z10) {
            ArrayList<RK> arrayList3 = new ArrayList<>();
            arrayList3.addAll(this.A07);
            this.A01.add(arrayList3);
            this.A07.clear();
            QT qt = new QT(this, arrayList3);
            if (z3 || z6 || z9) {
                Ph.A0E(arrayList3.get(0).A0H, qt, Math.max(z6 ? A0C() : 0L, z9 ? A0B() : 0L) + (z3 ? A0D() : 0L));
            } else {
                qt.run();
            }
        }
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC1196Qy
    public final void A0L(RK rk) {
        View view = rk.A0H;
        view.animate().cancel();
        for (int i = this.A09.size() - 1; i >= 0; i--) {
            if (this.A09.get(i).A04 == rk) {
                view.setTranslationY(0.0f);
                view.setTranslationX(0.0f);
                A0U(rk);
                this.A09.remove(i);
            }
        }
        A04(this.A08, rk);
        if (this.A0A.remove(rk)) {
            view.setAlpha(1.0f);
            A0V(rk);
        }
        if (this.A07.remove(rk)) {
            view.setAlpha(1.0f);
            String[] strArr = A0C;
            if (strArr[2].length() != strArr[1].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0C;
            strArr2[4] = "yxRUaByjpu2evyevZXzo5CX3I8dRP";
            strArr2[5] = "IuT2zeZcrCaCkdpAEhiSgQgKuQzMH";
            A0T(rk);
        }
        for (int i6 = this.A03.size() - 1; i6 >= 0; i6--) {
            ArrayList<QZ> arrayList = this.A03.get(i6);
            A04(arrayList, rk);
            if (arrayList.isEmpty()) {
                this.A03.remove(i6);
            }
        }
        for (int size = this.A05.size() - 1; size >= 0; size--) {
            ArrayList<C1173Qa> arrayList2 = this.A05.get(size);
            int i9 = arrayList2.size() - 1;
            while (true) {
                if (i9 < 0) {
                    break;
                }
                if (arrayList2.get(i9).A04 == rk) {
                    view.setTranslationY(0.0f);
                    view.setTranslationX(0.0f);
                    A0U(rk);
                    arrayList2.remove(i9);
                    if (arrayList2.isEmpty()) {
                        this.A05.remove(size);
                    }
                } else {
                    i9--;
                }
            }
        }
        for (int size2 = this.A01.size() - 1; size2 >= 0; size2--) {
            ArrayList<RK> arrayList3 = this.A01.get(size2);
            if (arrayList3.remove(rk)) {
                view.setAlpha(1.0f);
                A0T(rk);
                if (arrayList3.isEmpty()) {
                    this.A01.remove(size2);
                }
            }
        }
        this.A06.remove(rk);
        this.A00.remove(rk);
        this.A02.remove(rk);
        this.A04.remove(rk);
        A0b();
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC1196Qy
    public final boolean A0M() {
        return (this.A07.isEmpty() && this.A08.isEmpty() && this.A09.isEmpty() && this.A0A.isEmpty() && this.A04.isEmpty() && this.A06.isEmpty() && this.A00.isEmpty() && this.A02.isEmpty() && this.A05.isEmpty() && this.A01.isEmpty() && this.A03.isEmpty()) ? false : true;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC1196Qy
    public final boolean A0S(RK rk, List<Object> payloads) {
        return !payloads.isEmpty() || super.A0S(rk, payloads);
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC1894ha
    public final boolean A0X(RK rk) {
        A02(rk);
        rk.A0H.setAlpha(0.0f);
        this.A07.add(rk);
        return true;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC1894ha
    public final boolean A0Y(RK rk) {
        A02(rk);
        this.A0A.add(rk);
        return true;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC1894ha
    public final boolean A0a(RK rk, RK rk2, int i, int i6, int i9, int i10) {
        if (rk == rk2) {
            return A0Z(rk, i, i6, i9, i10);
        }
        float translationX = rk.A0H.getTranslationX();
        float translationY = rk.A0H.getTranslationY();
        float prevTranslationY = rk.A0H.getAlpha();
        A02(rk);
        float prevTranslationX = i9 - i;
        int deltaY = (int) (prevTranslationX - translationX);
        float prevTranslationX2 = i10 - i6;
        int deltaX = (int) (prevTranslationX2 - translationY);
        rk.A0H.setTranslationX(translationX);
        rk.A0H.setTranslationY(translationY);
        rk.A0H.setAlpha(prevTranslationY);
        if (rk2 != null) {
            A02(rk2);
            float prevTranslationX3 = -deltaY;
            rk2.A0H.setTranslationX(prevTranslationX3);
            float prevTranslationX4 = -deltaX;
            rk2.A0H.setTranslationY(prevTranslationX4);
            rk2.A0H.setAlpha(0.0f);
        }
        this.A08.add(new QZ(rk, rk2, i, i6, i9, i10));
        return true;
    }

    public final void A0b() {
        if (!A0M()) {
            A0G();
        }
    }

    public final void A0c(QZ qz) {
        View view;
        RK holder = qz.A05;
        if (holder == null) {
            view = null;
        } else {
            view = holder.A0H;
        }
        RK holder2 = qz.A04;
        View view2 = holder2 != null ? holder2.A0H : null;
        if (view != null) {
            ViewPropertyAnimator oldViewAnim = view.animate().setDuration(A0B());
            this.A02.add(qz.A05);
            oldViewAnim.translationX(qz.A02 - qz.A00);
            oldViewAnim.translationY(qz.A03 - qz.A01);
            oldViewAnim.alpha(0.0f).setListener(new QX(this, qz, oldViewAnim, view)).start();
        }
        if (view2 != null) {
            ViewPropertyAnimator animate = view2.animate();
            this.A02.add(qz.A04);
            animate.translationX(0.0f).translationY(0.0f).setDuration(A0B()).alpha(1.0f).setListener(new QY(this, qz, animate, view2)).start();
        }
    }

    public final void A0d(RK rk) {
        View view = rk.A0H;
        ViewPropertyAnimator animate = view.animate();
        this.A00.add(rk);
        ViewPropertyAnimator animation = animate.alpha(1.0f).setDuration(A0A());
        animation.setListener(new QV(this, rk, view, animate)).start();
    }

    public final void A0e(RK rk, int i, int i6, int i9, int i10) {
        View view = rk.A0H;
        int i11 = i9 - i;
        int i12 = i10 - i6;
        if (i11 != 0) {
            view.animate().translationX(0.0f);
        }
        if (i12 != 0) {
            view.animate().translationY(0.0f);
        }
        ViewPropertyAnimator animate = view.animate();
        this.A04.add(rk);
        animate.setDuration(A0C()).setListener(new QW(this, rk, i11, view, i12, animate)).start();
    }
}
