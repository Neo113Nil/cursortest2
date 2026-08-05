package defpackage;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class sh0 {
    public static int P7K7Inc8;
    public int MdtA4re8;
    public int NCTxEWno;
    public int VgvYg0wo;
    public ArrayList qoPGr6Ce;
    public ArrayList wxUZMvaN;

    public final void MdtA4re8(int i, sh0 sh0Var) {
        int i2 = sh0Var.NCTxEWno;
        ArrayList arrayList = this.qoPGr6Ce;
        int size = arrayList.size();
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayList.get(i3);
            i3++;
            t8 t8Var = (t8) obj;
            ArrayList arrayList2 = sh0Var.qoPGr6Ce;
            if (!arrayList2.contains(t8Var)) {
                arrayList2.add(t8Var);
            }
            if (i == 0) {
                t8Var.uQ3KJUK5 = i2;
            } else {
                t8Var.XrPeKzBk = i2;
            }
        }
        this.VgvYg0wo = i2;
    }

    public final int NCTxEWno(gp gpVar, int i) {
        int ygLcUYwZ;
        int ygLcUYwZ2;
        ArrayList arrayList = this.qoPGr6Ce;
        if (arrayList.size() == 0) {
            return 0;
        }
        u8 u8Var = ((t8) arrayList.get(0)).HdOGZAzC;
        gpVar.Ey6iv0m0();
        u8Var.NCTxEWno(gpVar, false);
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            ((t8) arrayList.get(i2)).NCTxEWno(gpVar, false);
        }
        if (i == 0 && u8Var.ZLB5OTob > 0) {
            ra.NCTxEWno(u8Var, gpVar, arrayList, 0);
        }
        if (i == 1 && u8Var.CIYkyd1d > 0) {
            ra.NCTxEWno(u8Var, gpVar, arrayList, 1);
        }
        try {
            gpVar.sjUBp5pO();
        } catch (Exception e) {
            System.err.println(e.toString() + "\n" + Arrays.toString(e.getStackTrace()).replace("[", "   at ").replace(",", "\n   at").replace("]", ""));
        }
        this.wxUZMvaN = new ArrayList();
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            t8 t8Var = (t8) arrayList.get(i3);
            k00 k00Var = new k00(20);
            new WeakReference(t8Var);
            gp.ygLcUYwZ(t8Var.eIA6dogk);
            gp.ygLcUYwZ(t8Var.pRiPUEwG);
            gp.ygLcUYwZ(t8Var.VhgXwMj9);
            gp.ygLcUYwZ(t8Var.aZz0PFXp);
            gp.ygLcUYwZ(t8Var.Xkz7p5xa);
            this.wxUZMvaN.add(k00Var);
        }
        if (i == 0) {
            ygLcUYwZ = gp.ygLcUYwZ(u8Var.eIA6dogk);
            ygLcUYwZ2 = gp.ygLcUYwZ(u8Var.VhgXwMj9);
            gpVar.Ey6iv0m0();
        } else {
            ygLcUYwZ = gp.ygLcUYwZ(u8Var.pRiPUEwG);
            ygLcUYwZ2 = gp.ygLcUYwZ(u8Var.aZz0PFXp);
            gpVar.Ey6iv0m0();
        }
        return ygLcUYwZ2 - ygLcUYwZ;
    }

    public final void qoPGr6Ce(ArrayList arrayList) {
        int size = this.qoPGr6Ce.size();
        if (this.VgvYg0wo != -1 && size > 0) {
            for (int i = 0; i < arrayList.size(); i++) {
                sh0 sh0Var = (sh0) arrayList.get(i);
                if (this.VgvYg0wo == sh0Var.NCTxEWno) {
                    MdtA4re8(this.MdtA4re8, sh0Var);
                }
            }
        }
        if (size == 0) {
            arrayList.remove(this);
        }
    }

    public final String toString() {
        int i = this.MdtA4re8;
        String str = (i == 0 ? "Horizontal" : i == 1 ? "Vertical" : i == 2 ? "Both" : "Unknown") + " [" + this.NCTxEWno + "] <";
        ArrayList arrayList = this.qoPGr6Ce;
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            str = str + " " + ((t8) obj).hGvurcGl;
        }
        return str.concat(" >");
    }
}
