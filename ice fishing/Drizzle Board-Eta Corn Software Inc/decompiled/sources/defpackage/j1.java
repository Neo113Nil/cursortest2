package defpackage;

import android.animation.TimeInterpolator;
import android.util.AndroidRuntimeException;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class j1 extends rd0 {
    public int euDDoUNr;
    public ArrayList i7xS8jrb = new ArrayList();
    public boolean Mq3SeTnW = true;
    public boolean SgZGMMPL = false;
    public int ytu5o6f4 = 0;

    public j1() {
        fVMzMhyS(1);
        VhgXwMj9(new ng(2));
        VhgXwMj9(new h4());
        VhgXwMj9(new ng(1));
    }

    @Override // defpackage.rd0
    public final void DK9slbsy(View view) {
        super.DK9slbsy(view);
        int size = this.i7xS8jrb.size();
        for (int i = 0; i < size; i++) {
            ((rd0) this.i7xS8jrb.get(i)).DK9slbsy(view);
        }
    }

    @Override // defpackage.rd0
    public final void MdtA4re8() {
        super.MdtA4re8();
        int size = this.i7xS8jrb.size();
        for (int i = 0; i < size; i++) {
            ((rd0) this.i7xS8jrb.get(i)).MdtA4re8();
        }
    }

    @Override // defpackage.rd0
    public final void P7K7Inc8(zd0 zd0Var) {
        int size = this.i7xS8jrb.size();
        for (int i = 0; i < size; i++) {
            ((rd0) this.i7xS8jrb.get(i)).P7K7Inc8(zd0Var);
        }
    }

    @Override // defpackage.rd0
    public final void SgZGMMPL() {
        this.ytu5o6f4 |= 2;
        int size = this.i7xS8jrb.size();
        for (int i = 0; i < size; i++) {
            ((rd0) this.i7xS8jrb.get(i)).SgZGMMPL();
        }
    }

    public final void VhgXwMj9(rd0 rd0Var) {
        this.i7xS8jrb.add(rd0Var);
        rd0Var.k3x7lurq = this;
        long j = this.wxUZMvaN;
        if (j >= 0) {
            rd0Var.U0LaHZX7(j);
        }
        if ((this.ytu5o6f4 & 1) != 0) {
            rd0Var.Mq3SeTnW(this.VgvYg0wo);
        }
        if ((this.ytu5o6f4 & 2) != 0) {
            rd0Var.SgZGMMPL();
        }
        if ((this.ytu5o6f4 & 4) != 0) {
            rd0Var.euDDoUNr(this.gjV1z5T1);
        }
        if ((this.ytu5o6f4 & 8) != 0) {
            rd0Var.i7xS8jrb(null);
        }
    }

    @Override // defpackage.rd0
    public final rd0 WYNAV5pd(qd0 qd0Var) {
        super.WYNAV5pd(qd0Var);
        return this;
    }

    @Override // defpackage.rd0
    /* renamed from: Xkz7p5xa, reason: merged with bridge method [inline-methods] */
    public final void Mq3SeTnW(TimeInterpolator timeInterpolator) {
        this.ytu5o6f4 |= 1;
        ArrayList arrayList = this.i7xS8jrb;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((rd0) this.i7xS8jrb.get(i)).Mq3SeTnW(timeInterpolator);
            }
        }
        this.VgvYg0wo = timeInterpolator;
    }

    @Override // defpackage.rd0
    /* renamed from: aZz0PFXp, reason: merged with bridge method [inline-methods] */
    public final void U0LaHZX7(long j) {
        ArrayList arrayList;
        this.wxUZMvaN = j;
        if (j < 0 || (arrayList = this.i7xS8jrb) == null) {
            return;
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((rd0) this.i7xS8jrb.get(i)).U0LaHZX7(j);
        }
    }

    @Override // defpackage.rd0
    public final void b2ZJblxo(zd0 zd0Var) {
        View view = zd0Var.NCTxEWno;
        if (I5GHvsYW(view)) {
            ArrayList arrayList = this.i7xS8jrb;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                rd0 rd0Var = (rd0) obj;
                if (rd0Var.I5GHvsYW(view)) {
                    rd0Var.b2ZJblxo(zd0Var);
                    zd0Var.MdtA4re8.add(rd0Var);
                }
            }
        }
    }

    @Override // defpackage.rd0
    /* renamed from: eVhOlqcC, reason: merged with bridge method [inline-methods] */
    public final rd0 clone() {
        j1 j1Var = (j1) super.clone();
        j1Var.i7xS8jrb = new ArrayList();
        int size = this.i7xS8jrb.size();
        for (int i = 0; i < size; i++) {
            rd0 clone = ((rd0) this.i7xS8jrb.get(i)).clone();
            j1Var.i7xS8jrb.add(clone);
            clone.k3x7lurq = j1Var;
        }
        return j1Var;
    }

    @Override // defpackage.rd0
    public final void euDDoUNr(k00 k00Var) {
        super.euDDoUNr(k00Var);
        this.ytu5o6f4 |= 4;
        if (this.i7xS8jrb != null) {
            for (int i = 0; i < this.i7xS8jrb.size(); i++) {
                ((rd0) this.i7xS8jrb.get(i)).euDDoUNr(k00Var);
            }
        }
    }

    public final void fVMzMhyS(int i) {
        if (i == 0) {
            this.Mq3SeTnW = true;
        } else {
            if (i != 1) {
                throw new AndroidRuntimeException(q70.VgvYg0wo("Invalid parameter for TransitionSet ordering: ", i));
            }
            this.Mq3SeTnW = false;
        }
    }

    @Override // defpackage.rd0
    public final void gjV1z5T1(r2 r2Var) {
        super.gjV1z5T1(r2Var);
        int size = this.i7xS8jrb.size();
        for (int i = 0; i < size; i++) {
            ((rd0) this.i7xS8jrb.get(i)).gjV1z5T1(r2Var);
        }
    }

    @Override // defpackage.rd0
    public final void i7xS8jrb(m50 m50Var) {
        this.ytu5o6f4 |= 8;
        int size = this.i7xS8jrb.size();
        for (int i = 0; i < size; i++) {
            ((rd0) this.i7xS8jrb.get(i)).i7xS8jrb(m50Var);
        }
    }

    @Override // defpackage.rd0
    public final void lwWCatUu() {
        ArrayList arrayList;
        if (this.i7xS8jrb.isEmpty()) {
            eIA6dogk();
            OnDfzHZD();
            return;
        }
        wd0 wd0Var = new wd0();
        wd0Var.NCTxEWno = this;
        ArrayList arrayList2 = this.i7xS8jrb;
        int size = arrayList2.size();
        int i = 0;
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList2.get(i2);
            i2++;
            ((rd0) obj).qoPGr6Ce(wd0Var);
        }
        this.euDDoUNr = this.i7xS8jrb.size();
        if (this.Mq3SeTnW) {
            ArrayList arrayList3 = this.i7xS8jrb;
            int size2 = arrayList3.size();
            while (i < size2) {
                Object obj2 = arrayList3.get(i);
                i++;
                ((rd0) obj2).lwWCatUu();
            }
            return;
        }
        int i3 = 1;
        while (true) {
            int size3 = this.i7xS8jrb.size();
            arrayList = this.i7xS8jrb;
            if (i3 >= size3) {
                break;
            }
            ((rd0) arrayList.get(i3 - 1)).qoPGr6Ce(new wd0((rd0) this.i7xS8jrb.get(i3)));
            i3++;
        }
        rd0 rd0Var = (rd0) arrayList.get(0);
        if (rd0Var != null) {
            rd0Var.lwWCatUu();
        }
    }

    @Override // defpackage.rd0
    public final void ow5vqvCr(ViewGroup viewGroup, VZZbw3BB vZZbw3BB, VZZbw3BB vZZbw3BB2, ArrayList arrayList, ArrayList arrayList2) {
        long j = this.MdtA4re8;
        int size = this.i7xS8jrb.size();
        for (int i = 0; i < size; i++) {
            rd0 rd0Var = (rd0) this.i7xS8jrb.get(i);
            if (j > 0 && (this.Mq3SeTnW || i == 0)) {
                long j2 = rd0Var.MdtA4re8;
                if (j2 > 0) {
                    rd0Var.ytu5o6f4(j2 + j);
                } else {
                    rd0Var.ytu5o6f4(j);
                }
            }
            rd0Var.ow5vqvCr(viewGroup, vZZbw3BB, vZZbw3BB2, arrayList, arrayList2);
        }
    }

    @Override // defpackage.rd0
    public final String pRiPUEwG(String str) {
        String pRiPUEwG = super.pRiPUEwG(str);
        for (int i = 0; i < this.i7xS8jrb.size(); i++) {
            pRiPUEwG = pRiPUEwG + "\n" + ((rd0) this.i7xS8jrb.get(i)).pRiPUEwG(str.concat("  "));
        }
        return pRiPUEwG;
    }

    @Override // defpackage.rd0
    public final void wxUZMvaN(zd0 zd0Var) {
        View view = zd0Var.NCTxEWno;
        if (I5GHvsYW(view)) {
            ArrayList arrayList = this.i7xS8jrb;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                rd0 rd0Var = (rd0) obj;
                if (rd0Var.I5GHvsYW(view)) {
                    rd0Var.wxUZMvaN(zd0Var);
                    zd0Var.MdtA4re8.add(rd0Var);
                }
            }
        }
    }

    @Override // defpackage.rd0
    public final void ygLcUYwZ() {
        for (int i = 0; i < this.i7xS8jrb.size(); i++) {
            ((rd0) this.i7xS8jrb.get(i)).ygLcUYwZ();
        }
        super.ygLcUYwZ();
    }

    @Override // defpackage.rd0
    public final void ytu5o6f4(long j) {
        this.MdtA4re8 = j;
    }
}
