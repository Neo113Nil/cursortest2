package defpackage;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class e8 {
    public boolean MdtA4re8;
    public int NCTxEWno;
    public e8 P7K7Inc8;
    public final int VgvYg0wo;
    public r70 jb9XjC4I;
    public final t8 wxUZMvaN;
    public HashSet qoPGr6Ce = null;
    public int b2ZJblxo = 0;
    public int Qr9iLBAD = Integer.MIN_VALUE;

    public e8(t8 t8Var, int i) {
        this.wxUZMvaN = t8Var;
        this.VgvYg0wo = i;
    }

    public final int MdtA4re8() {
        if (this.MdtA4re8) {
            return this.NCTxEWno;
        }
        return 0;
    }

    public final void NCTxEWno(int i, sh0 sh0Var, ArrayList arrayList) {
        HashSet hashSet = this.qoPGr6Ce;
        if (hashSet != null) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                ra.sjUBp5pO(((e8) it.next()).wxUZMvaN, i, arrayList, sh0Var);
            }
        }
    }

    public final boolean P7K7Inc8() {
        return this.P7K7Inc8 != null;
    }

    public final void Qr9iLBAD() {
        r70 r70Var = this.jb9XjC4I;
        if (r70Var == null) {
            this.jb9XjC4I = new r70(1);
        } else {
            r70Var.MdtA4re8();
        }
    }

    public final boolean VgvYg0wo() {
        e8 e8Var;
        HashSet hashSet = this.qoPGr6Ce;
        if (hashSet == null) {
            return false;
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            e8 e8Var2 = (e8) it.next();
            t8 t8Var = e8Var2.wxUZMvaN;
            int i = e8Var2.VgvYg0wo;
            switch (q70.k3x7lurq(i)) {
                case 0:
                case 5:
                case 6:
                case 7:
                case 8:
                    e8Var = null;
                    break;
                case 1:
                    e8Var = t8Var.VhgXwMj9;
                    break;
                case 2:
                    e8Var = t8Var.aZz0PFXp;
                    break;
                case 3:
                    e8Var = t8Var.eIA6dogk;
                    break;
                case 4:
                    e8Var = t8Var.pRiPUEwG;
                    break;
                default:
                    throw new AssertionError(q70.eVhOlqcC(i));
            }
            if (e8Var.P7K7Inc8()) {
                return true;
            }
        }
        return false;
    }

    public final void b2ZJblxo() {
        HashSet hashSet;
        e8 e8Var = this.P7K7Inc8;
        if (e8Var != null && (hashSet = e8Var.qoPGr6Ce) != null) {
            hashSet.remove(this);
            if (this.P7K7Inc8.qoPGr6Ce.size() == 0) {
                this.P7K7Inc8.qoPGr6Ce = null;
            }
        }
        this.qoPGr6Ce = null;
        this.P7K7Inc8 = null;
        this.b2ZJblxo = 0;
        this.Qr9iLBAD = Integer.MIN_VALUE;
        this.MdtA4re8 = false;
        this.NCTxEWno = 0;
    }

    public final void jb9XjC4I(int i) {
        this.NCTxEWno = i;
        this.MdtA4re8 = true;
    }

    public final void qoPGr6Ce(e8 e8Var, int i, int i2) {
        if (e8Var == null) {
            b2ZJblxo();
            return;
        }
        this.P7K7Inc8 = e8Var;
        if (e8Var.qoPGr6Ce == null) {
            e8Var.qoPGr6Ce = new HashSet();
        }
        HashSet hashSet = this.P7K7Inc8.qoPGr6Ce;
        if (hashSet != null) {
            hashSet.add(this);
        }
        this.b2ZJblxo = i;
        this.Qr9iLBAD = i2;
    }

    public final String toString() {
        return this.wxUZMvaN.hGvurcGl + ":" + q70.eVhOlqcC(this.VgvYg0wo);
    }

    public final int wxUZMvaN() {
        e8 e8Var;
        if (this.wxUZMvaN.LvHlPNBd == 8) {
            return 0;
        }
        int i = this.Qr9iLBAD;
        return (i == Integer.MIN_VALUE || (e8Var = this.P7K7Inc8) == null || e8Var.wxUZMvaN.LvHlPNBd != 8) ? this.b2ZJblxo : i;
    }
}
