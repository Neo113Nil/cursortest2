package defpackage;

import java.util.ArrayList;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public class ac implements yb {
    public int P7K7Inc8;
    public int b2ZJblxo;
    public final th0 wxUZMvaN;
    public th0 qoPGr6Ce = null;
    public boolean NCTxEWno = false;
    public boolean MdtA4re8 = false;
    public int VgvYg0wo = 1;
    public int Qr9iLBAD = 1;
    public zc jb9XjC4I = null;
    public boolean eVhOlqcC = false;
    public final ArrayList k3x7lurq = new ArrayList();
    public final ArrayList ow5vqvCr = new ArrayList();

    public ac(th0 th0Var) {
        this.wxUZMvaN = th0Var;
    }

    public final void MdtA4re8() {
        this.ow5vqvCr.clear();
        this.k3x7lurq.clear();
        this.eVhOlqcC = false;
        this.b2ZJblxo = 0;
        this.MdtA4re8 = false;
        this.NCTxEWno = false;
    }

    public final void NCTxEWno(th0 th0Var) {
        this.k3x7lurq.add(th0Var);
        if (this.eVhOlqcC) {
            th0Var.qoPGr6Ce(th0Var);
        }
    }

    @Override // defpackage.yb
    public final void qoPGr6Ce(yb ybVar) {
        ArrayList arrayList = this.ow5vqvCr;
        int size = arrayList.size();
        int i = 0;
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            if (!((ac) obj).eVhOlqcC) {
                return;
            }
        }
        this.MdtA4re8 = true;
        th0 th0Var = this.qoPGr6Ce;
        if (th0Var != null) {
            th0Var.qoPGr6Ce(this);
        }
        if (this.NCTxEWno) {
            this.wxUZMvaN.qoPGr6Ce(this);
            return;
        }
        int size2 = arrayList.size();
        ac acVar = null;
        int i3 = 0;
        while (i3 < size2) {
            Object obj2 = arrayList.get(i3);
            i3++;
            ac acVar2 = (ac) obj2;
            if (!(acVar2 instanceof zc)) {
                i++;
                acVar = acVar2;
            }
        }
        if (acVar != null && i == 1 && acVar.eVhOlqcC) {
            zc zcVar = this.jb9XjC4I;
            if (zcVar != null) {
                if (!zcVar.eVhOlqcC) {
                    return;
                } else {
                    this.P7K7Inc8 = this.Qr9iLBAD * zcVar.b2ZJblxo;
                }
            }
            wxUZMvaN(acVar.b2ZJblxo + this.P7K7Inc8);
        }
        th0 th0Var2 = this.qoPGr6Ce;
        if (th0Var2 != null) {
            th0Var2.qoPGr6Ce(this);
        }
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(this.wxUZMvaN.NCTxEWno.hGvurcGl);
        sb.append(":");
        switch (this.VgvYg0wo) {
            case 1:
                str = "UNKNOWN";
                break;
            case 2:
                str = "HORIZONTAL_DIMENSION";
                break;
            case 3:
                str = "VERTICAL_DIMENSION";
                break;
            case 4:
                str = "LEFT";
                break;
            case 5:
                str = "RIGHT";
                break;
            case 6:
                str = "TOP";
                break;
            case 7:
                str = "BOTTOM";
                break;
            case 8:
                str = "BASELINE";
                break;
            default:
                str = "null";
                break;
        }
        sb.append(str);
        sb.append("(");
        sb.append(this.eVhOlqcC ? Integer.valueOf(this.b2ZJblxo) : "unresolved");
        sb.append(") <t=");
        sb.append(this.ow5vqvCr.size());
        sb.append(":d=");
        sb.append(this.k3x7lurq.size());
        sb.append(">");
        return sb.toString();
    }

    public void wxUZMvaN(int i) {
        if (this.eVhOlqcC) {
            return;
        }
        this.eVhOlqcC = true;
        this.b2ZJblxo = i;
        ArrayList arrayList = this.k3x7lurq;
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            yb ybVar = (yb) obj;
            ybVar.qoPGr6Ce(ybVar);
        }
    }
}
