package defpackage;

import android.content.Context;
import android.content.IntentFilter;
import android.view.MenuItem;
import android.view.View;
import java.util.ArrayList;
import java.util.LinkedHashSet;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public abstract class cD2QLRqg {
    public Object NCTxEWno;
    public Object qoPGr6Ce;

    public cD2QLRqg() {
        ArrayList arrayList = new ArrayList();
        this.NCTxEWno = arrayList;
        arrayList.add(new xd());
    }

    public static float Qr9iLBAD(int i, int i2, int i3) {
        return ej0.b2ZJblxo((i - i2) / i3, 0.0f, 1.0f);
    }

    public abstract void MdtA4re8();

    public abstract void OnDfzHZD(b2 b2Var);

    public abstract void OxcuoDLp();

    public abstract IntentFilter P7K7Inc8();

    public void VgvYg0wo() {
        d80 d80Var = (d80) this.qoPGr6Ce;
        o3 o3Var = (o3) this.NCTxEWno;
        LinkedHashSet linkedHashSet = d80Var.VgvYg0wo;
        if (linkedHashSet.remove(o3Var) && linkedHashSet.isEmpty()) {
            d80Var.NCTxEWno();
        }
    }

    public abstract int b2ZJblxo();

    public abstract void eVhOlqcC();

    public MenuItem jb9XjC4I(MenuItem menuItem) {
        if (!(menuItem instanceof sa0)) {
            return menuItem;
        }
        sa0 sa0Var = (sa0) menuItem;
        p70 p70Var = (p70) this.NCTxEWno;
        if (p70Var == null) {
            p70Var = new p70(0);
            this.NCTxEWno = p70Var;
        }
        MenuItem menuItem2 = (MenuItem) p70Var.get(sa0Var);
        if (menuItem2 != null) {
            return menuItem2;
        }
        gs gsVar = new gs((Context) this.qoPGr6Ce, sa0Var);
        ((p70) this.NCTxEWno).put(sa0Var, gsVar);
        return gsVar;
    }

    public boolean k3x7lurq() {
        d80 d80Var = (d80) this.qoPGr6Ce;
        View view = d80Var.MdtA4re8.ytu5o6f4;
        view.getClass();
        int i = 4;
        if (view.getAlpha() != 0.0f || view.getVisibility() != 0) {
            int visibility = view.getVisibility();
            if (visibility == 0) {
                i = 2;
            } else if (visibility != 4) {
                if (visibility != 8) {
                    m1.sjUBp5pO(q70.VgvYg0wo("Unknown visibility ", visibility));
                    return false;
                }
                i = 3;
            }
        }
        int i2 = d80Var.qoPGr6Ce;
        if (i != i2) {
            return (i == 2 || i2 == 2) ? false : true;
        }
        return true;
    }

    public void lDXGDhIF() {
        wxUZMvaN();
        IntentFilter P7K7Inc8 = P7K7Inc8();
        if (P7K7Inc8.countActions() == 0) {
            return;
        }
        ff2loHL3 ff2lohl3 = (ff2loHL3) this.qoPGr6Ce;
        if (ff2lohl3 == null) {
            ff2lohl3 = new ff2loHL3(this);
            this.qoPGr6Ce = ff2lohl3;
        }
        ((SJ7tYVsF) this.NCTxEWno).ow5vqvCr.registerReceiver(ff2lohl3, P7K7Inc8);
    }

    public abstract void ow5vqvCr();

    public abstract void sjUBp5pO();

    public void wxUZMvaN() {
        ff2loHL3 ff2lohl3 = (ff2loHL3) this.qoPGr6Ce;
        if (ff2lohl3 != null) {
            try {
                ((SJ7tYVsF) this.NCTxEWno).ow5vqvCr.unregisterReceiver(ff2lohl3);
            } catch (IllegalArgumentException unused) {
            }
            this.qoPGr6Ce = null;
        }
    }

    public abstract void ygLcUYwZ();

    public cD2QLRqg(Context context) {
        this.qoPGr6Ce = context;
    }

    public cD2QLRqg(d80 d80Var, o3 o3Var) {
        this.qoPGr6Ce = d80Var;
        this.NCTxEWno = o3Var;
    }

    public cD2QLRqg(SJ7tYVsF sJ7tYVsF) {
        this.NCTxEWno = sJ7tYVsF;
    }
}
