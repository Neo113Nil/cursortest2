package defpackage;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import java.util.ArrayList;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class eb extends q10 {
    public static TimeInterpolator KlHjfFWx;
    public ArrayList OnDfzHZD;
    public ArrayList OxcuoDLp;
    public ArrayList Qr9iLBAD;
    public ArrayList amk52bBQ;
    public boolean b2ZJblxo;
    public ArrayList eVhOlqcC;
    public ArrayList jb9XjC4I;
    public ArrayList k3x7lurq;
    public ArrayList lDXGDhIF;
    public ArrayList ow5vqvCr;
    public ArrayList sjUBp5pO;
    public ArrayList ygLcUYwZ;

    public static void Qr9iLBAD(ArrayList arrayList) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            ((g20) arrayList.get(size)).qoPGr6Ce.animate().cancel();
        }
    }

    @Override // defpackage.q10
    public final boolean P7K7Inc8() {
        return (this.jb9XjC4I.isEmpty() && this.k3x7lurq.isEmpty() && this.eVhOlqcC.isEmpty() && this.Qr9iLBAD.isEmpty() && this.sjUBp5pO.isEmpty() && this.OxcuoDLp.isEmpty() && this.lDXGDhIF.isEmpty() && this.amk52bBQ.isEmpty() && this.OnDfzHZD.isEmpty() && this.ow5vqvCr.isEmpty() && this.ygLcUYwZ.isEmpty()) ? false : true;
    }

    @Override // defpackage.q10
    public final void VgvYg0wo() {
        ArrayList arrayList = this.k3x7lurq;
        ArrayList arrayList2 = this.ygLcUYwZ;
        ArrayList arrayList3 = this.ow5vqvCr;
        ArrayList arrayList4 = this.OnDfzHZD;
        ArrayList arrayList5 = this.jb9XjC4I;
        ArrayList arrayList6 = this.Qr9iLBAD;
        ArrayList arrayList7 = this.eVhOlqcC;
        int size = arrayList7.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            db dbVar = (db) arrayList7.get(size);
            View view = dbVar.qoPGr6Ce.qoPGr6Ce;
            view.setTranslationY(0.0f);
            view.setTranslationX(0.0f);
            MdtA4re8(dbVar.qoPGr6Ce);
            arrayList7.remove(size);
        }
        for (int size2 = arrayList6.size() - 1; size2 >= 0; size2--) {
            MdtA4re8((g20) arrayList6.get(size2));
            arrayList6.remove(size2);
        }
        int size3 = arrayList5.size();
        while (true) {
            size3--;
            if (size3 < 0) {
                break;
            }
            g20 g20Var = (g20) arrayList5.get(size3);
            g20Var.qoPGr6Ce.setAlpha(1.0f);
            MdtA4re8(g20Var);
            arrayList5.remove(size3);
        }
        for (int size4 = arrayList.size() - 1; size4 >= 0; size4--) {
            cb cbVar = (cb) arrayList.get(size4);
            g20 g20Var2 = cbVar.qoPGr6Ce;
            if (g20Var2 != null) {
                k3x7lurq(cbVar, g20Var2);
            }
            g20 g20Var3 = cbVar.NCTxEWno;
            if (g20Var3 != null) {
                k3x7lurq(cbVar, g20Var3);
            }
        }
        arrayList.clear();
        if (P7K7Inc8()) {
            for (int size5 = arrayList4.size() - 1; size5 >= 0; size5--) {
                ArrayList arrayList8 = (ArrayList) arrayList4.get(size5);
                for (int size6 = arrayList8.size() - 1; size6 >= 0; size6--) {
                    db dbVar2 = (db) arrayList8.get(size6);
                    View view2 = dbVar2.qoPGr6Ce.qoPGr6Ce;
                    view2.setTranslationY(0.0f);
                    view2.setTranslationX(0.0f);
                    MdtA4re8(dbVar2.qoPGr6Ce);
                    arrayList8.remove(size6);
                    if (arrayList8.isEmpty()) {
                        arrayList4.remove(arrayList8);
                    }
                }
            }
            for (int size7 = arrayList3.size() - 1; size7 >= 0; size7--) {
                ArrayList arrayList9 = (ArrayList) arrayList3.get(size7);
                for (int size8 = arrayList9.size() - 1; size8 >= 0; size8--) {
                    g20 g20Var4 = (g20) arrayList9.get(size8);
                    g20Var4.qoPGr6Ce.setAlpha(1.0f);
                    MdtA4re8(g20Var4);
                    arrayList9.remove(size8);
                    if (arrayList9.isEmpty()) {
                        arrayList3.remove(arrayList9);
                    }
                }
            }
            for (int size9 = arrayList2.size() - 1; size9 >= 0; size9--) {
                ArrayList arrayList10 = (ArrayList) arrayList2.get(size9);
                for (int size10 = arrayList10.size() - 1; size10 >= 0; size10--) {
                    cb cbVar2 = (cb) arrayList10.get(size10);
                    g20 g20Var5 = cbVar2.qoPGr6Ce;
                    if (g20Var5 != null) {
                        k3x7lurq(cbVar2, g20Var5);
                    }
                    g20 g20Var6 = cbVar2.NCTxEWno;
                    if (g20Var6 != null) {
                        k3x7lurq(cbVar2, g20Var6);
                    }
                    if (arrayList10.isEmpty()) {
                        arrayList2.remove(arrayList10);
                    }
                }
            }
            Qr9iLBAD(this.OxcuoDLp);
            Qr9iLBAD(this.sjUBp5pO);
            Qr9iLBAD(this.lDXGDhIF);
            Qr9iLBAD(this.amk52bBQ);
            ArrayList arrayList11 = this.NCTxEWno;
            if (arrayList11.size() <= 0) {
                arrayList11.clear();
            } else {
                arrayList11.get(0).getClass();
                m1.qoPGr6Ce();
            }
        }
    }

    public final boolean b2ZJblxo(g20 g20Var, int i, int i2, int i3, int i4) {
        View view = g20Var.qoPGr6Ce;
        int translationX = i + ((int) view.getTranslationX());
        int translationY = i2 + ((int) g20Var.qoPGr6Ce.getTranslationY());
        ow5vqvCr(g20Var);
        int i5 = i3 - translationX;
        int i6 = i4 - translationY;
        if (i5 == 0 && i6 == 0) {
            MdtA4re8(g20Var);
            return false;
        }
        if (i5 != 0) {
            view.setTranslationX(-i5);
        }
        if (i6 != 0) {
            view.setTranslationY(-i6);
        }
        ArrayList arrayList = this.eVhOlqcC;
        db dbVar = new db();
        dbVar.qoPGr6Ce = g20Var;
        dbVar.NCTxEWno = translationX;
        dbVar.MdtA4re8 = translationY;
        dbVar.wxUZMvaN = i3;
        dbVar.VgvYg0wo = i4;
        arrayList.add(dbVar);
        return true;
    }

    public final void eVhOlqcC(ArrayList arrayList, g20 g20Var) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            cb cbVar = (cb) arrayList.get(size);
            if (k3x7lurq(cbVar, g20Var) && cbVar.qoPGr6Ce == null && cbVar.NCTxEWno == null) {
                arrayList.remove(cbVar);
            }
        }
    }

    public final void jb9XjC4I() {
        if (P7K7Inc8()) {
            return;
        }
        ArrayList arrayList = this.NCTxEWno;
        if (arrayList.size() <= 0) {
            arrayList.clear();
        } else {
            arrayList.get(0).getClass();
            m1.qoPGr6Ce();
        }
    }

    public final boolean k3x7lurq(cb cbVar, g20 g20Var) {
        if (cbVar.NCTxEWno == g20Var) {
            cbVar.NCTxEWno = null;
        } else {
            if (cbVar.qoPGr6Ce != g20Var) {
                return false;
            }
            cbVar.qoPGr6Ce = null;
        }
        View view = g20Var.qoPGr6Ce;
        View view2 = g20Var.qoPGr6Ce;
        view.setAlpha(1.0f);
        view2.setTranslationX(0.0f);
        view2.setTranslationY(0.0f);
        MdtA4re8(g20Var);
        return true;
    }

    public final void ow5vqvCr(g20 g20Var) {
        if (KlHjfFWx == null) {
            KlHjfFWx = new ValueAnimator().getInterpolator();
        }
        g20Var.qoPGr6Ce.animate().setInterpolator(KlHjfFWx);
        wxUZMvaN(g20Var);
    }

    @Override // defpackage.q10
    public final boolean qoPGr6Ce(g20 g20Var, g20 g20Var2, fw fwVar, fw fwVar2) {
        int i;
        int i2;
        int i3 = fwVar.qoPGr6Ce;
        int i4 = fwVar.NCTxEWno;
        if (g20Var2.ygLcUYwZ()) {
            int i5 = fwVar.qoPGr6Ce;
            i2 = fwVar.NCTxEWno;
            i = i5;
        } else {
            i = fwVar2.qoPGr6Ce;
            i2 = fwVar2.NCTxEWno;
        }
        if (g20Var == g20Var2) {
            return b2ZJblxo(g20Var, i3, i4, i, i2);
        }
        View view = g20Var.qoPGr6Ce;
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        float alpha = view.getAlpha();
        ow5vqvCr(g20Var);
        view.setTranslationX(translationX);
        view.setTranslationY(translationY);
        view.setAlpha(alpha);
        View view2 = g20Var2.qoPGr6Ce;
        ow5vqvCr(g20Var2);
        view2.setTranslationX(-((int) ((i - i3) - translationX)));
        view2.setTranslationY(-((int) ((i2 - i4) - translationY)));
        view2.setAlpha(0.0f);
        ArrayList arrayList = this.k3x7lurq;
        cb cbVar = new cb();
        cbVar.qoPGr6Ce = g20Var;
        cbVar.NCTxEWno = g20Var2;
        cbVar.MdtA4re8 = i3;
        cbVar.wxUZMvaN = i4;
        cbVar.VgvYg0wo = i;
        cbVar.P7K7Inc8 = i2;
        arrayList.add(cbVar);
        return true;
    }

    @Override // defpackage.q10
    public final void wxUZMvaN(g20 g20Var) {
        ArrayList arrayList = this.ow5vqvCr;
        ArrayList arrayList2 = this.OnDfzHZD;
        ArrayList arrayList3 = this.ygLcUYwZ;
        View view = g20Var.qoPGr6Ce;
        view.animate().cancel();
        ArrayList arrayList4 = this.eVhOlqcC;
        int size = arrayList4.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            if (((db) arrayList4.get(size)).qoPGr6Ce == g20Var) {
                view.setTranslationY(0.0f);
                view.setTranslationX(0.0f);
                MdtA4re8(g20Var);
                arrayList4.remove(size);
            }
        }
        eVhOlqcC(this.k3x7lurq, g20Var);
        if (this.Qr9iLBAD.remove(g20Var)) {
            view.setAlpha(1.0f);
            MdtA4re8(g20Var);
        }
        if (this.jb9XjC4I.remove(g20Var)) {
            view.setAlpha(1.0f);
            MdtA4re8(g20Var);
        }
        for (int size2 = arrayList3.size() - 1; size2 >= 0; size2--) {
            ArrayList arrayList5 = (ArrayList) arrayList3.get(size2);
            eVhOlqcC(arrayList5, g20Var);
            if (arrayList5.isEmpty()) {
                arrayList3.remove(size2);
            }
        }
        for (int size3 = arrayList2.size() - 1; size3 >= 0; size3--) {
            ArrayList arrayList6 = (ArrayList) arrayList2.get(size3);
            int size4 = arrayList6.size() - 1;
            while (true) {
                if (size4 < 0) {
                    break;
                }
                if (((db) arrayList6.get(size4)).qoPGr6Ce == g20Var) {
                    view.setTranslationY(0.0f);
                    view.setTranslationX(0.0f);
                    MdtA4re8(g20Var);
                    arrayList6.remove(size4);
                    if (arrayList6.isEmpty()) {
                        arrayList2.remove(size3);
                    }
                } else {
                    size4--;
                }
            }
        }
        for (int size5 = arrayList.size() - 1; size5 >= 0; size5--) {
            ArrayList arrayList7 = (ArrayList) arrayList.get(size5);
            if (arrayList7.remove(g20Var)) {
                view.setAlpha(1.0f);
                MdtA4re8(g20Var);
                if (arrayList7.isEmpty()) {
                    arrayList.remove(size5);
                }
            }
        }
        this.OxcuoDLp.remove(g20Var);
        this.lDXGDhIF.remove(g20Var);
        this.amk52bBQ.remove(g20Var);
        this.sjUBp5pO.remove(g20Var);
        jb9XjC4I();
    }
}
