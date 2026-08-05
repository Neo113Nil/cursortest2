package defpackage;

import android.os.Bundle;
import android.view.View;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class q50 {
    public Object NCTxEWno;
    public Object qoPGr6Ce;

    public q50(r10 r10Var) {
        this.qoPGr6Ce = r10Var;
        tf0 tf0Var = new tf0();
        tf0Var.qoPGr6Ce = 0;
        this.NCTxEWno = tf0Var;
    }

    public void MdtA4re8(int i) {
        int[] iArr = (int[]) this.qoPGr6Ce;
        if (iArr == null) {
            int[] iArr2 = new int[Math.max(i, 10) + 1];
            this.qoPGr6Ce = iArr2;
            Arrays.fill(iArr2, -1);
        } else if (i >= iArr.length) {
            int length = iArr.length;
            while (length <= i) {
                length *= 2;
            }
            int[] iArr3 = new int[length];
            this.qoPGr6Ce = iArr3;
            System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
            int[] iArr4 = (int[]) this.qoPGr6Ce;
            Arrays.fill(iArr4, iArr.length, iArr4.length, -1);
        }
    }

    public void NCTxEWno() {
        int[] iArr = (int[]) this.qoPGr6Ce;
        if (iArr != null) {
            Arrays.fill(iArr, -1);
        }
        this.NCTxEWno = null;
    }

    public void OnDfzHZD(g20 g20Var) {
        lq lqVar = (lq) this.NCTxEWno;
        int VgvYg0wo = lqVar.VgvYg0wo() - 1;
        while (true) {
            if (VgvYg0wo < 0) {
                break;
            }
            if (g20Var == lqVar.P7K7Inc8(VgvYg0wo)) {
                Object[] objArr = lqVar.wxUZMvaN;
                Object obj = objArr[VgvYg0wo];
                Object obj2 = w30.VgvYg0wo;
                if (obj != obj2) {
                    objArr[VgvYg0wo] = obj2;
                    lqVar.NCTxEWno = true;
                }
            } else {
                VgvYg0wo--;
            }
        }
        mg0 mg0Var = (mg0) ((p70) this.qoPGr6Ce).remove(g20Var);
        if (mg0Var != null) {
            mg0Var.qoPGr6Ce = 0;
            mg0Var.NCTxEWno = null;
            mg0Var.MdtA4re8 = null;
            mg0.wxUZMvaN.MdtA4re8(mg0Var);
        }
    }

    public void P7K7Inc8(int i, int i2) {
        int[] iArr = (int[]) this.qoPGr6Ce;
        if (iArr == null || i >= iArr.length) {
            return;
        }
        int i3 = i + i2;
        MdtA4re8(i3);
        int[] iArr2 = (int[]) this.qoPGr6Ce;
        System.arraycopy(iArr2, i, iArr2, i3, (iArr2.length - i) - i2);
        Arrays.fill((int[]) this.qoPGr6Ce, i, i3, -1);
        ArrayList arrayList = (ArrayList) this.NCTxEWno;
        if (arrayList == null) {
            return;
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            n90 n90Var = (n90) ((ArrayList) this.NCTxEWno).get(size);
            int i4 = n90Var.NCTxEWno;
            if (i4 >= i) {
                n90Var.NCTxEWno = i4 + i2;
            }
        }
    }

    public void Qr9iLBAD() {
        ((r50) this.qoPGr6Ce).qoPGr6Ce();
    }

    public boolean VgvYg0wo(View view) {
        tf0 tf0Var = (tf0) this.NCTxEWno;
        r10 r10Var = (r10) this.qoPGr6Ce;
        int wxUZMvaN = r10Var.wxUZMvaN();
        int MdtA4re8 = r10Var.MdtA4re8();
        int NCTxEWno = r10Var.NCTxEWno(view);
        int qoPGr6Ce = r10Var.qoPGr6Ce(view);
        tf0Var.NCTxEWno = wxUZMvaN;
        tf0Var.MdtA4re8 = MdtA4re8;
        tf0Var.wxUZMvaN = NCTxEWno;
        tf0Var.VgvYg0wo = qoPGr6Ce;
        tf0Var.qoPGr6Ce = 24579;
        return tf0Var.qoPGr6Ce();
    }

    public void b2ZJblxo(int i, int i2) {
        int[] iArr = (int[]) this.qoPGr6Ce;
        if (iArr == null || i >= iArr.length) {
            return;
        }
        int i3 = i + i2;
        MdtA4re8(i3);
        int[] iArr2 = (int[]) this.qoPGr6Ce;
        System.arraycopy(iArr2, i3, iArr2, i, (iArr2.length - i) - i2);
        int[] iArr3 = (int[]) this.qoPGr6Ce;
        Arrays.fill(iArr3, iArr3.length - i2, iArr3.length, -1);
        ArrayList arrayList = (ArrayList) this.NCTxEWno;
        if (arrayList == null) {
            return;
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            n90 n90Var = (n90) ((ArrayList) this.NCTxEWno).get(size);
            int i4 = n90Var.NCTxEWno;
            if (i4 >= i) {
                if (i4 < i3) {
                    ((ArrayList) this.NCTxEWno).remove(size);
                } else {
                    n90Var.NCTxEWno = i4 - i2;
                }
            }
        }
    }

    public void eVhOlqcC(Bundle bundle) {
        r50 r50Var = (r50) this.qoPGr6Ce;
        Bundle VgvYg0wo = w30.VgvYg0wo((hx[]) Arrays.copyOf(new hx[0], 0));
        Bundle bundle2 = r50Var.P7K7Inc8;
        if (bundle2 != null) {
            VgvYg0wo.putAll(bundle2);
        }
        synchronized (r50Var.MdtA4re8) {
            for (Map.Entry entry : r50Var.wxUZMvaN.entrySet()) {
                String str = (String) entry.getKey();
                Bundle qoPGr6Ce = ((p50) entry.getValue()).qoPGr6Ce();
                str.getClass();
                qoPGr6Ce.getClass();
                VgvYg0wo.putBundle(str, qoPGr6Ce);
            }
        }
        if (VgvYg0wo.isEmpty()) {
            return;
        }
        bundle.putBundle("androidx.lifecycle.BundlableSavedStateRegistry.key", VgvYg0wo);
    }

    public void jb9XjC4I(Bundle bundle) {
        r50 r50Var = (r50) this.qoPGr6Ce;
        s50 s50Var = r50Var.qoPGr6Ce;
        if (!r50Var.VgvYg0wo) {
            r50Var.qoPGr6Ce();
        }
        if (s50Var.b2ZJblxo().MdtA4re8.compareTo(po.VgvYg0wo) >= 0) {
            throw new IllegalStateException(("performRestore cannot be called when owner is " + s50Var.b2ZJblxo().MdtA4re8).toString());
        }
        if (r50Var.b2ZJblxo) {
            m1.Ey6iv0m0("SavedStateRegistry was already restored.");
            return;
        }
        Bundle bundle2 = null;
        if (bundle != null && bundle.containsKey("androidx.lifecycle.BundlableSavedStateRegistry.key")) {
            Bundle bundle3 = bundle.getBundle("androidx.lifecycle.BundlableSavedStateRegistry.key");
            if (bundle3 == null) {
                n50.P7K7Inc8("androidx.lifecycle.BundlableSavedStateRegistry.key");
                throw null;
            }
            bundle2 = bundle3;
        }
        r50Var.P7K7Inc8 = bundle2;
        r50Var.b2ZJblxo = true;
    }

    public fw k3x7lurq(g20 g20Var, int i) {
        mg0 mg0Var;
        fw fwVar;
        p70 p70Var = (p70) this.qoPGr6Ce;
        int wxUZMvaN = p70Var.wxUZMvaN(g20Var);
        if (wxUZMvaN >= 0 && (mg0Var = (mg0) p70Var.jb9XjC4I(wxUZMvaN)) != null) {
            int i2 = mg0Var.qoPGr6Ce;
            if ((i2 & i) != 0) {
                int i3 = i2 & (~i);
                mg0Var.qoPGr6Ce = i3;
                if (i == 4) {
                    fwVar = mg0Var.NCTxEWno;
                } else if (i == 8) {
                    fwVar = mg0Var.MdtA4re8;
                } else {
                    m1.sjUBp5pO("Must provide flag PRE or POST");
                }
                if ((i3 & 12) == 0) {
                    p70Var.b2ZJblxo(wxUZMvaN);
                    mg0Var.qoPGr6Ce = 0;
                    mg0Var.NCTxEWno = null;
                    mg0Var.MdtA4re8 = null;
                    mg0.wxUZMvaN.MdtA4re8(mg0Var);
                }
                return fwVar;
            }
        }
        return null;
    }

    public void ow5vqvCr(g20 g20Var) {
        mg0 mg0Var = (mg0) ((p70) this.qoPGr6Ce).get(g20Var);
        if (mg0Var == null) {
            return;
        }
        mg0Var.qoPGr6Ce &= -2;
    }

    public void qoPGr6Ce(g20 g20Var, fw fwVar) {
        p70 p70Var = (p70) this.qoPGr6Ce;
        mg0 mg0Var = (mg0) p70Var.get(g20Var);
        if (mg0Var == null) {
            mg0Var = mg0.qoPGr6Ce();
            p70Var.put(g20Var, mg0Var);
        }
        mg0Var.MdtA4re8 = fwVar;
        mg0Var.qoPGr6Ce |= 8;
    }

    public View wxUZMvaN(int i, int i2, int i3, int i4) {
        View Ey6iv0m0;
        tf0 tf0Var = (tf0) this.NCTxEWno;
        r10 r10Var = (r10) this.qoPGr6Ce;
        int wxUZMvaN = r10Var.wxUZMvaN();
        int MdtA4re8 = r10Var.MdtA4re8();
        int i5 = i2 > i ? 1 : -1;
        View view = null;
        while (i != i2) {
            switch (r10Var.qoPGr6Ce) {
                case 0:
                    Ey6iv0m0 = r10Var.NCTxEWno.Ey6iv0m0(i);
                    break;
                default:
                    Ey6iv0m0 = r10Var.NCTxEWno.Ey6iv0m0(i);
                    break;
            }
            int NCTxEWno = r10Var.NCTxEWno(Ey6iv0m0);
            int qoPGr6Ce = r10Var.qoPGr6Ce(Ey6iv0m0);
            tf0Var.NCTxEWno = wxUZMvaN;
            tf0Var.MdtA4re8 = MdtA4re8;
            tf0Var.wxUZMvaN = NCTxEWno;
            tf0Var.VgvYg0wo = qoPGr6Ce;
            if (i3 != 0) {
                tf0Var.qoPGr6Ce = i3;
                if (tf0Var.qoPGr6Ce()) {
                    return Ey6iv0m0;
                }
            }
            if (i4 != 0) {
                tf0Var.qoPGr6Ce = i4;
                if (tf0Var.qoPGr6Ce()) {
                    view = Ey6iv0m0;
                }
            }
            i += i5;
        }
        return view;
    }

    public q50(r50 r50Var) {
        this.qoPGr6Ce = r50Var;
        this.NCTxEWno = new mcXgUFR8(29, r50Var);
    }

    public q50(xg xgVar, l9 l9Var) {
        this.qoPGr6Ce = xgVar;
        this.NCTxEWno = l9Var;
    }
}
