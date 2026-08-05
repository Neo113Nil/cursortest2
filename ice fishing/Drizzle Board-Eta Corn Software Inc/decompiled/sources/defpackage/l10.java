package defpackage;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Collections;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class l10 {
    public final /* synthetic */ RecyclerView qoPGr6Ce;

    public /* synthetic */ l10(RecyclerView recyclerView) {
        this.qoPGr6Ce = recyclerView;
    }

    public void MdtA4re8(int i, int i2, Object obj) {
        int i3;
        int i4;
        RecyclerView recyclerView = this.qoPGr6Ce;
        int gjV1z5T1 = recyclerView.P7K7Inc8.gjV1z5T1();
        int i5 = i2 + i;
        for (int i6 = 0; i6 < gjV1z5T1; i6++) {
            View FySoLYna = recyclerView.P7K7Inc8.FySoLYna(i6);
            g20 euDDoUNr = RecyclerView.euDDoUNr(FySoLYna);
            if (euDDoUNr != null && !euDDoUNr.ygLcUYwZ() && (i4 = euDDoUNr.MdtA4re8) >= i && i4 < i5) {
                euDDoUNr.qoPGr6Ce(2);
                if (obj == null) {
                    euDDoUNr.qoPGr6Ce(1024);
                } else if ((1024 & euDDoUNr.jb9XjC4I) == 0) {
                    if (euDDoUNr.eVhOlqcC == null) {
                        ArrayList arrayList = new ArrayList();
                        euDDoUNr.eVhOlqcC = arrayList;
                        euDDoUNr.k3x7lurq = Collections.unmodifiableList(arrayList);
                    }
                    euDDoUNr.eVhOlqcC.add(obj);
                }
                ((u10) FySoLYna.getLayoutParams()).MdtA4re8 = true;
            }
        }
        z10 z10Var = recyclerView.MdtA4re8;
        ArrayList arrayList2 = z10Var.MdtA4re8;
        for (int size = arrayList2.size() - 1; size >= 0; size--) {
            g20 g20Var = (g20) arrayList2.get(size);
            if (g20Var != null && (i3 = g20Var.MdtA4re8) >= i && i3 < i5) {
                g20Var.qoPGr6Ce(2);
                z10Var.P7K7Inc8(size);
            }
        }
        recyclerView.hGvurcGl = true;
    }

    public g20 NCTxEWno(int i) {
        RecyclerView recyclerView = this.qoPGr6Ce;
        int gjV1z5T1 = recyclerView.P7K7Inc8.gjV1z5T1();
        int i2 = 0;
        g20 g20Var = null;
        while (true) {
            if (i2 >= gjV1z5T1) {
                break;
            }
            g20 euDDoUNr = RecyclerView.euDDoUNr(recyclerView.P7K7Inc8.FySoLYna(i2));
            if (euDDoUNr != null && !euDDoUNr.b2ZJblxo() && euDDoUNr.MdtA4re8 == i) {
                if (!((ArrayList) recyclerView.P7K7Inc8.VgvYg0wo).contains(euDDoUNr.qoPGr6Ce)) {
                    g20Var = euDDoUNr;
                    break;
                }
                g20Var = euDDoUNr;
            }
            i2++;
        }
        if (g20Var != null) {
            if (!((ArrayList) recyclerView.P7K7Inc8.VgvYg0wo).contains(g20Var.qoPGr6Ce)) {
                return g20Var;
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x003a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void P7K7Inc8(g20 g20Var, fw fwVar, fw fwVar2) {
        boolean z;
        g20Var.OnDfzHZD(false);
        RecyclerView recyclerView = this.qoPGr6Ce;
        eb ebVar = (eb) recyclerView.Xkz7p5xa;
        if (fwVar != null) {
            ebVar.getClass();
            int i = fwVar.qoPGr6Ce;
            int i2 = fwVar2.qoPGr6Ce;
            if (i != i2 || fwVar.NCTxEWno != fwVar2.NCTxEWno) {
                z = ebVar.b2ZJblxo(g20Var, i, fwVar.NCTxEWno, i2, fwVar2.NCTxEWno);
                if (z) {
                    return;
                }
                recyclerView.hzgxAD8d();
                return;
            }
        }
        ebVar.ow5vqvCr(g20Var);
        g20Var.qoPGr6Ce.setAlpha(0.0f);
        ebVar.jb9XjC4I.add(g20Var);
        z = true;
        if (z) {
        }
    }

    public void Qr9iLBAD(int i) {
        RecyclerView recyclerView = this.qoPGr6Ce;
        View childAt = recyclerView.getChildAt(i);
        if (childAt != null) {
            RecyclerView.euDDoUNr(childAt);
            m10 m10Var = recyclerView.OnDfzHZD;
            childAt.clearAnimation();
        }
        recyclerView.removeViewAt(i);
    }

    public void VgvYg0wo(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        RecyclerView recyclerView = this.qoPGr6Ce;
        int gjV1z5T1 = recyclerView.P7K7Inc8.gjV1z5T1();
        int i10 = -1;
        if (i < i2) {
            i4 = i;
            i3 = i2;
            i5 = -1;
        } else {
            i3 = i;
            i4 = i2;
            i5 = 1;
        }
        for (int i11 = 0; i11 < gjV1z5T1; i11++) {
            g20 euDDoUNr = RecyclerView.euDDoUNr(recyclerView.P7K7Inc8.FySoLYna(i11));
            if (euDDoUNr != null && (i9 = euDDoUNr.MdtA4re8) >= i4 && i9 <= i3) {
                if (i9 == i) {
                    euDDoUNr.k3x7lurq(i2 - i, false);
                } else {
                    euDDoUNr.k3x7lurq(i5, false);
                }
                recyclerView.pP9Y2m6O.VgvYg0wo = true;
            }
        }
        ArrayList arrayList = recyclerView.MdtA4re8.MdtA4re8;
        if (i < i2) {
            i7 = i;
            i6 = i2;
        } else {
            i6 = i;
            i7 = i2;
            i10 = 1;
        }
        int size = arrayList.size();
        for (int i12 = 0; i12 < size; i12++) {
            g20 g20Var = (g20) arrayList.get(i12);
            if (g20Var != null && (i8 = g20Var.MdtA4re8) >= i7 && i8 <= i6) {
                if (i8 == i) {
                    g20Var.k3x7lurq(i2 - i, false);
                } else {
                    g20Var.k3x7lurq(i10, false);
                }
            }
        }
        recyclerView.requestLayout();
        recyclerView.LvHlPNBd = true;
    }

    public void b2ZJblxo(g20 g20Var, fw fwVar, fw fwVar2) {
        boolean z;
        RecyclerView recyclerView = this.qoPGr6Ce;
        recyclerView.MdtA4re8.k3x7lurq(g20Var);
        recyclerView.VgvYg0wo(g20Var);
        g20Var.OnDfzHZD(false);
        eb ebVar = (eb) recyclerView.Xkz7p5xa;
        ebVar.getClass();
        int i = fwVar.qoPGr6Ce;
        int i2 = fwVar.NCTxEWno;
        View view = g20Var.qoPGr6Ce;
        int left = fwVar2 == null ? view.getLeft() : fwVar2.qoPGr6Ce;
        int top = fwVar2 == null ? view.getTop() : fwVar2.NCTxEWno;
        if (g20Var.b2ZJblxo() || (i == left && i2 == top)) {
            ebVar.ow5vqvCr(g20Var);
            ebVar.Qr9iLBAD.add(g20Var);
            z = true;
        } else {
            view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
            z = ebVar.b2ZJblxo(g20Var, i, i2, left, top);
        }
        if (z) {
            recyclerView.hzgxAD8d();
        }
    }

    public void qoPGr6Ce(FzsqRtM7 fzsqRtM7) {
        int i = fzsqRtM7.qoPGr6Ce;
        RecyclerView recyclerView = this.qoPGr6Ce;
        if (i == 1) {
            recyclerView.ygLcUYwZ.gmkaJpmS(fzsqRtM7.NCTxEWno, fzsqRtM7.wxUZMvaN);
            return;
        }
        if (i == 2) {
            recyclerView.ygLcUYwZ.ESscZ9M1(fzsqRtM7.NCTxEWno, fzsqRtM7.wxUZMvaN);
        } else if (i == 4) {
            recyclerView.ygLcUYwZ.VGmz0ccI(fzsqRtM7.NCTxEWno, fzsqRtM7.wxUZMvaN);
        } else {
            if (i != 8) {
                return;
            }
            recyclerView.ygLcUYwZ.g2aRJUAd(fzsqRtM7.NCTxEWno, fzsqRtM7.wxUZMvaN);
        }
    }

    public void wxUZMvaN(int i, int i2) {
        RecyclerView recyclerView = this.qoPGr6Ce;
        int gjV1z5T1 = recyclerView.P7K7Inc8.gjV1z5T1();
        for (int i3 = 0; i3 < gjV1z5T1; i3++) {
            g20 euDDoUNr = RecyclerView.euDDoUNr(recyclerView.P7K7Inc8.FySoLYna(i3));
            if (euDDoUNr != null && !euDDoUNr.ygLcUYwZ() && euDDoUNr.MdtA4re8 >= i) {
                euDDoUNr.k3x7lurq(i2, false);
                recyclerView.pP9Y2m6O.VgvYg0wo = true;
            }
        }
        ArrayList arrayList = recyclerView.MdtA4re8.MdtA4re8;
        int size = arrayList.size();
        for (int i4 = 0; i4 < size; i4++) {
            g20 g20Var = (g20) arrayList.get(i4);
            if (g20Var != null && g20Var.MdtA4re8 >= i) {
                g20Var.k3x7lurq(i2, false);
            }
        }
        recyclerView.requestLayout();
        recyclerView.LvHlPNBd = true;
    }
}
