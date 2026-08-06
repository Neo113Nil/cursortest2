package defpackage;

import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class g20 extends mb implements Runnable, xk0, View.OnAttachStateChangeListener {
    public boolean AvO7iQsrTN;
    public final ag0 E7jCp8Ls;
    public final hg0 JFJ3QoxA;
    public final p41 XnEVoBF0td1l;
    public int encWxUiV2;
    public wg1 mOu10nynGul;
    public final co0 rQPn8YBR;

    public g20() {
        super(1);
        hg0 hg0Var = new hg0(9);
        dh1.GWasM1elztuh.getClass();
        hg0Var.XnEVoBF0td1l(ch1.Yi7zF1RB1, new th1("caption bar"));
        hg0Var.XnEVoBF0td1l(ch1.X1lG3V04pd, new th1("display cutout"));
        hg0Var.XnEVoBF0td1l(ch1.xqGvceK5x, new th1("ime"));
        hg0Var.XnEVoBF0td1l(ch1.OOA6hdeuvCS, new th1("mandatory system gestures"));
        hg0Var.XnEVoBF0td1l(ch1.EljAMC1QTz, new th1("navigation bars"));
        hg0Var.XnEVoBF0td1l(ch1.AvO7iQsrTN, new th1("status bars"));
        hg0Var.XnEVoBF0td1l(ch1.encWxUiV2, new th1("system gestures"));
        hg0Var.XnEVoBF0td1l(ch1.mOu10nynGul, new th1("tappable element"));
        hg0Var.XnEVoBF0td1l(ch1.JFJ3QoxA, new th1("waterfall"));
        this.JFJ3QoxA = hg0Var;
        this.rQPn8YBR = new co0(0);
        this.E7jCp8Ls = new ag0(4);
        this.XnEVoBF0td1l = new p41();
    }

    @Override // defpackage.mb
    public final wg1 AvO7iQsrTN(wg1 wg1Var, List list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            bg1 bg1Var = (bg1) list.get(i);
            dh1 dh1Var = (dh1) fh1.GWasM1elztuh.Yi7zF1RB1(bg1Var.GWasM1elztuh.xqGvceK5x());
            if (dh1Var != null) {
                Object AvO7iQsrTN = this.JFJ3QoxA.AvO7iQsrTN(dh1Var);
                AvO7iQsrTN.getClass();
                th1 th1Var = (th1) AvO7iQsrTN;
                if (((Boolean) th1Var.Yi7zF1RB1.getValue()).booleanValue()) {
                    ag1 ag1Var = bg1Var.GWasM1elztuh;
                    th1Var.X1lG3V04pd.encWxUiV2(ag1Var.X1lG3V04pd());
                    th1Var.OOA6hdeuvCS.encWxUiV2(ag1Var.GWasM1elztuh());
                    th1Var.xqGvceK5x.encWxUiV2(ag1Var.Yi7zF1RB1());
                }
            }
        }
        ozMwhSAI(wg1Var);
        return wg1Var;
    }

    @Override // defpackage.mb
    public final void EljAMC1QTz(bg1 bg1Var) {
        this.AvO7iQsrTN = true;
    }

    @Override // defpackage.xk0
    public final wg1 GWasM1elztuh(View view, wg1 wg1Var) {
        if (this.AvO7iQsrTN) {
            this.mOu10nynGul = wg1Var;
            if (Build.VERSION.SDK_INT == 30) {
                view.post(this);
                return wg1Var;
            }
        } else if (this.encWxUiV2 == 0) {
            ozMwhSAI(wg1Var);
        }
        return wg1Var;
    }

    @Override // defpackage.mb
    public final void OOA6hdeuvCS(bg1 bg1Var) {
        boolean z = false;
        this.AvO7iQsrTN = false;
        int xqGvceK5x = bg1Var.GWasM1elztuh.xqGvceK5x();
        this.encWxUiV2 &= ~xqGvceK5x;
        this.mOu10nynGul = null;
        dh1 dh1Var = (dh1) fh1.GWasM1elztuh.Yi7zF1RB1(xqGvceK5x);
        if (dh1Var != null) {
            Object AvO7iQsrTN = this.JFJ3QoxA.AvO7iQsrTN(dh1Var);
            AvO7iQsrTN.getClass();
            th1 th1Var = (th1) AvO7iQsrTN;
            th1Var.X1lG3V04pd.encWxUiV2(0.0f);
            th1Var.OOA6hdeuvCS.encWxUiV2(1.0f);
            th1Var.xqGvceK5x.encWxUiV2(0L);
            th1Var.X1lG3V04pd.encWxUiV2(0.0f);
            th1Var.Yi7zF1RB1.setValue(Boolean.FALSE);
            th1Var.JFJ3QoxA = -1L;
            th1Var.rQPn8YBR = -1L;
            co0 co0Var = this.rQPn8YBR;
            co0Var.encWxUiV2(co0Var.AvO7iQsrTN() + 1);
            synchronized (e41.X1lG3V04pd) {
                ig0 ig0Var = e41.JFJ3QoxA.encWxUiV2;
                if (ig0Var != null) {
                    if (ig0Var.encWxUiV2()) {
                        z = true;
                    }
                }
            }
            if (z) {
                e41.GWasM1elztuh();
            }
        }
    }

    @Override // defpackage.mb
    public final d encWxUiV2(bg1 bg1Var, d dVar) {
        wg1 wg1Var = this.mOu10nynGul;
        boolean z = false;
        this.AvO7iQsrTN = false;
        this.mOu10nynGul = null;
        if (bg1Var.GWasM1elztuh.Yi7zF1RB1() > 0 && wg1Var != null) {
            int xqGvceK5x = bg1Var.GWasM1elztuh.xqGvceK5x();
            this.encWxUiV2 |= xqGvceK5x;
            dh1 dh1Var = (dh1) fh1.GWasM1elztuh.Yi7zF1RB1(xqGvceK5x);
            if (dh1Var != null) {
                Object AvO7iQsrTN = this.JFJ3QoxA.AvO7iQsrTN(dh1Var);
                AvO7iQsrTN.getClass();
                th1 th1Var = (th1) AvO7iQsrTN;
                e20 encWxUiV2 = wg1Var.GWasM1elztuh.encWxUiV2(xqGvceK5x);
                long j = (encWxUiV2.GWasM1elztuh << 48) | (encWxUiV2.Yi7zF1RB1 << 32) | (encWxUiV2.X1lG3V04pd << 16) | encWxUiV2.xqGvceK5x;
                long j2 = th1Var.encWxUiV2;
                if (!o50.E7jCp8Ls(j, j2)) {
                    th1Var.JFJ3QoxA = j2;
                    th1Var.rQPn8YBR = j;
                    th1Var.Yi7zF1RB1.setValue(Boolean.TRUE);
                    ag1 ag1Var = bg1Var.GWasM1elztuh;
                    th1Var.X1lG3V04pd.encWxUiV2(ag1Var.X1lG3V04pd());
                    th1Var.OOA6hdeuvCS.encWxUiV2(ag1Var.GWasM1elztuh());
                    th1Var.xqGvceK5x.encWxUiV2(ag1Var.Yi7zF1RB1());
                    co0 co0Var = this.rQPn8YBR;
                    co0Var.encWxUiV2(co0Var.AvO7iQsrTN() + 1);
                    synchronized (e41.X1lG3V04pd) {
                        ig0 ig0Var = e41.JFJ3QoxA.encWxUiV2;
                        if (ig0Var != null) {
                            if (ig0Var.encWxUiV2()) {
                                z = true;
                            }
                        }
                    }
                    if (z) {
                        e41.GWasM1elztuh();
                        return dVar;
                    }
                }
            }
        }
        return dVar;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        Object parent = view.getParent();
        View view2 = parent instanceof View ? (View) parent : null;
        if (view2 != null) {
            view = view2;
        }
        int i = ne1.GWasM1elztuh;
        ie1.Yi7zF1RB1(view, this);
        ne1.GWasM1elztuh(view, this);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        Object parent = view.getParent();
        View view2 = parent instanceof View ? (View) parent : null;
        if (view2 != null) {
            view = view2;
        }
        int i = ne1.GWasM1elztuh;
        ie1.Yi7zF1RB1(view, null);
        ne1.GWasM1elztuh(view, null);
    }

    public final void ozMwhSAI(wg1 wg1Var) {
        char c;
        char c2;
        boolean z;
        char c3;
        boolean z2;
        boolean z3;
        long j;
        boolean z4;
        long[] jArr;
        int[] iArr;
        Object[] objArr;
        long[] jArr2;
        int[] iArr2;
        Object[] objArr2;
        long j2;
        int i;
        rf0 rf0Var = fh1.GWasM1elztuh;
        int[] iArr3 = rf0Var.Yi7zF1RB1;
        Object[] objArr3 = rf0Var.X1lG3V04pd;
        long[] jArr3 = rf0Var.GWasM1elztuh;
        int length = jArr3.length - 2;
        if (length >= 0) {
            int i2 = 0;
            z2 = false;
            z3 = false;
            c = 16;
            c2 = ' ';
            while (true) {
                long j3 = jArr3[i2];
                z = true;
                if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i3 = 8;
                    int i4 = 8 - ((~(i2 - length)) >>> 31);
                    int i5 = 0;
                    c3 = '0';
                    while (i5 < i4) {
                        if ((j3 & 255) < 128) {
                            int i6 = (i2 << 3) + i5;
                            int i7 = iArr3[i6];
                            dh1 dh1Var = (dh1) objArr3[i6];
                            e20 encWxUiV2 = wg1Var.GWasM1elztuh.encWxUiV2(i7);
                            jArr2 = jArr3;
                            iArr2 = iArr3;
                            long j4 = (encWxUiV2.GWasM1elztuh << 48) | (encWxUiV2.Yi7zF1RB1 << 32) | (encWxUiV2.X1lG3V04pd << 16) | encWxUiV2.xqGvceK5x;
                            Object AvO7iQsrTN = this.JFJ3QoxA.AvO7iQsrTN(dh1Var);
                            AvO7iQsrTN.getClass();
                            th1 th1Var = (th1) AvO7iQsrTN;
                            j2 = j3;
                            if (!o50.E7jCp8Ls(j4, th1Var.encWxUiV2)) {
                                th1Var.encWxUiV2 = j4;
                                z2 = true;
                                if (!o50.E7jCp8Ls(j4, 0L)) {
                                    z3 = true;
                                }
                            }
                            if (i7 != 8) {
                                e20 mOu10nynGul = wg1Var.GWasM1elztuh.mOu10nynGul(i7);
                                objArr2 = objArr3;
                                long j5 = (mOu10nynGul.Yi7zF1RB1 << 32) | (mOu10nynGul.GWasM1elztuh << 48) | (mOu10nynGul.X1lG3V04pd << 16) | mOu10nynGul.xqGvceK5x;
                                if (!o50.E7jCp8Ls(th1Var.mOu10nynGul, j5)) {
                                    th1Var.mOu10nynGul = j5;
                                    z2 = true;
                                    if (!o50.E7jCp8Ls(j5, 0L)) {
                                        z3 = true;
                                    }
                                }
                            } else {
                                objArr2 = objArr3;
                            }
                            th1Var.GWasM1elztuh.setValue(Boolean.valueOf(wg1Var.GWasM1elztuh.jivtDDk9H(i7)));
                            i = 8;
                        } else {
                            jArr2 = jArr3;
                            iArr2 = iArr3;
                            objArr2 = objArr3;
                            j2 = j3;
                            i = i3;
                        }
                        j3 = j2 >> i;
                        i5++;
                        i3 = i;
                        objArr3 = objArr2;
                        jArr3 = jArr2;
                        iArr3 = iArr2;
                    }
                    jArr = jArr3;
                    iArr = iArr3;
                    objArr = objArr3;
                    if (i4 != i3) {
                        break;
                    }
                } else {
                    jArr = jArr3;
                    iArr = iArr3;
                    objArr = objArr3;
                    c3 = '0';
                }
                if (i2 == length) {
                    break;
                }
                i2++;
                objArr3 = objArr;
                jArr3 = jArr;
                iArr3 = iArr;
            }
        } else {
            c = 16;
            c2 = ' ';
            z = true;
            c3 = '0';
            z2 = false;
            z3 = false;
        }
        om AvO7iQsrTN2 = wg1Var.GWasM1elztuh.AvO7iQsrTN();
        if (AvO7iQsrTN2 == null) {
            j = 0;
        } else {
            e20 GWasM1elztuh = AvO7iQsrTN2.GWasM1elztuh();
            j = (GWasM1elztuh.GWasM1elztuh << c3) | (GWasM1elztuh.Yi7zF1RB1 << c2) | (GWasM1elztuh.X1lG3V04pd << c) | GWasM1elztuh.xqGvceK5x;
        }
        hg0 hg0Var = this.JFJ3QoxA;
        dh1.GWasM1elztuh.getClass();
        Object AvO7iQsrTN3 = hg0Var.AvO7iQsrTN(ch1.JFJ3QoxA);
        AvO7iQsrTN3.getClass();
        th1 th1Var2 = (th1) AvO7iQsrTN3;
        th1Var2.GWasM1elztuh.setValue(Boolean.valueOf(!o50.E7jCp8Ls(j, 0L)));
        if (!o50.E7jCp8Ls(th1Var2.encWxUiV2, j)) {
            th1Var2.encWxUiV2 = j;
            th1Var2.mOu10nynGul = j;
            z2 = z;
            if (!o50.E7jCp8Ls(j, 0L)) {
                z3 = z2;
            }
        }
        if (AvO7iQsrTN2 == null) {
            ag0 ag0Var = this.E7jCp8Ls;
            if (ag0Var.Yi7zF1RB1 > 0) {
                ag0Var.xqGvceK5x();
                this.XnEVoBF0td1l.clear();
                z2 = z;
            }
        } else {
            List Yi7zF1RB1 = Build.VERSION.SDK_INT >= 28 ? nm.Yi7zF1RB1(AvO7iQsrTN2.GWasM1elztuh) : Collections.EMPTY_LIST;
            int size = Yi7zF1RB1.size();
            ag0 ag0Var2 = this.E7jCp8Ls;
            if (size < ag0Var2.Yi7zF1RB1) {
                ag0Var2.E7jCp8Ls(Yi7zF1RB1.size(), this.E7jCp8Ls.Yi7zF1RB1);
                this.XnEVoBF0td1l.OOA6hdeuvCS(Yi7zF1RB1.size(), this.XnEVoBF0td1l.size());
                z2 = z;
            } else {
                int size2 = Yi7zF1RB1.size() - this.E7jCp8Ls.Yi7zF1RB1;
                int i8 = 0;
                while (i8 < size2) {
                    ag0 ag0Var3 = this.E7jCp8Ls;
                    ag0Var3.GWasM1elztuh(z50.WRKkgoJXwDn(Yi7zF1RB1.get(ag0Var3.Yi7zF1RB1)));
                    this.XnEVoBF0td1l.add(new a20("display cutout rect " + this.E7jCp8Ls.Yi7zF1RB1));
                    i8++;
                    z2 = z;
                }
            }
            int size3 = Yi7zF1RB1.size();
            for (int i9 = 0; i9 < size3; i9++) {
                Rect rect = (Rect) Yi7zF1RB1.get(i9);
                mg0 mg0Var = (mg0) this.E7jCp8Ls.EljAMC1QTz(i9);
                if (!o30.rQPn8YBR(mg0Var.getValue(), rect)) {
                    mg0Var.setValue(rect);
                    z2 = z;
                }
            }
            if (!Yi7zF1RB1.isEmpty()) {
                z3 = z;
            }
        }
        if ((z3 || this.rQPn8YBR.AvO7iQsrTN() != 0) && z2) {
            co0 co0Var = this.rQPn8YBR;
            co0Var.encWxUiV2(co0Var.AvO7iQsrTN() + 1);
            synchronized (e41.X1lG3V04pd) {
                ig0 ig0Var = e41.JFJ3QoxA.encWxUiV2;
                if (ig0Var != null) {
                    boolean z5 = z;
                    z4 = ig0Var.encWxUiV2() == z5 ? z5 : false;
                }
            }
            if (z4) {
                e41.GWasM1elztuh();
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.AvO7iQsrTN) {
            this.encWxUiV2 = 0;
            this.AvO7iQsrTN = false;
            wg1 wg1Var = this.mOu10nynGul;
            if (wg1Var != null) {
                ozMwhSAI(wg1Var);
                this.mOu10nynGul = null;
            }
        }
    }
}
