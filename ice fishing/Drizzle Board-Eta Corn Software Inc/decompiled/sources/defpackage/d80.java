package defpackage;

import android.util.Log;
import android.view.View;
import java.util.ArrayList;
import java.util.LinkedHashSet;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class d80 {
    public final li MdtA4re8;
    public int NCTxEWno;
    public boolean P7K7Inc8;
    public final xj Qr9iLBAD;
    public final LinkedHashSet VgvYg0wo;
    public boolean b2ZJblxo;
    public int qoPGr6Ce;
    public final ArrayList wxUZMvaN;

    public d80(int i, int i2, xj xjVar, o3 o3Var) {
        if (i == 0) {
            throw null;
        }
        if (i2 == 0) {
            throw null;
        }
        li liVar = xjVar.MdtA4re8;
        if (i == 0) {
            throw null;
        }
        if (i2 == 0) {
            throw null;
        }
        this.qoPGr6Ce = i;
        this.NCTxEWno = i2;
        this.MdtA4re8 = liVar;
        this.wxUZMvaN = new ArrayList();
        this.VgvYg0wo = new LinkedHashSet();
        o3Var.qoPGr6Ce(new wm(this));
        this.Qr9iLBAD = xjVar;
    }

    public final void MdtA4re8(int i, int i2) {
        if (i == 0) {
            throw null;
        }
        if (i2 == 0) {
            throw null;
        }
        int k3x7lurq = q70.k3x7lurq(i2);
        li liVar = this.MdtA4re8;
        if (k3x7lurq == 0) {
            if (this.qoPGr6Ce != 1) {
                if (ej.ytu5o6f4(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: For fragment " + liVar + " mFinalState = " + q70.OnDfzHZD(this.qoPGr6Ce) + " -> " + q70.OnDfzHZD(i) + '.');
                }
                this.qoPGr6Ce = i;
                return;
            }
            return;
        }
        if (k3x7lurq == 1) {
            if (this.qoPGr6Ce == 1) {
                if (ej.ytu5o6f4(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: For fragment " + liVar + " mFinalState = REMOVED -> VISIBLE. mLifecycleImpact = " + q70.ow5vqvCr(this.NCTxEWno) + " to ADDING.");
                }
                this.qoPGr6Ce = 2;
                this.NCTxEWno = 2;
                return;
            }
            return;
        }
        if (k3x7lurq != 2) {
            return;
        }
        if (ej.ytu5o6f4(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: For fragment " + liVar + " mFinalState = " + q70.OnDfzHZD(this.qoPGr6Ce) + " -> REMOVED. mLifecycleImpact  = " + q70.ow5vqvCr(this.NCTxEWno) + " to REMOVING.");
        }
        this.qoPGr6Ce = 1;
        this.NCTxEWno = 3;
    }

    public final void NCTxEWno() {
        if (!this.b2ZJblxo) {
            if (ej.ytu5o6f4(2)) {
                Log.v("FragmentManager", "SpecialEffectsController: " + this + " has called complete.");
            }
            this.b2ZJblxo = true;
            ArrayList arrayList = this.wxUZMvaN;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                ((Runnable) obj).run();
            }
        }
        this.Qr9iLBAD.k3x7lurq();
    }

    public final void qoPGr6Ce() {
        LinkedHashSet linkedHashSet = this.VgvYg0wo;
        if (this.P7K7Inc8) {
            return;
        }
        this.P7K7Inc8 = true;
        if (linkedHashSet.isEmpty()) {
            NCTxEWno();
            return;
        }
        for (o3 o3Var : x5.yzvmSy3z(linkedHashSet)) {
            synchronized (o3Var) {
                try {
                    if (!o3Var.qoPGr6Ce) {
                        o3Var.qoPGr6Ce = true;
                        o3Var.MdtA4re8 = true;
                        n3 n3Var = o3Var.NCTxEWno;
                        if (n3Var != null) {
                            try {
                                n3Var.onCancel();
                            } catch (Throwable th) {
                                synchronized (o3Var) {
                                    o3Var.MdtA4re8 = false;
                                    o3Var.notifyAll();
                                    throw th;
                                }
                            }
                        }
                        synchronized (o3Var) {
                            o3Var.MdtA4re8 = false;
                            o3Var.notifyAll();
                        }
                    }
                } finally {
                }
            }
        }
    }

    public final String toString() {
        StringBuilder b2ZJblxo = q70.b2ZJblxo("Operation {", Integer.toHexString(System.identityHashCode(this)), "} {finalState = ");
        b2ZJblxo.append(q70.OnDfzHZD(this.qoPGr6Ce));
        b2ZJblxo.append(" lifecycleImpact = ");
        b2ZJblxo.append(q70.ow5vqvCr(this.NCTxEWno));
        b2ZJblxo.append(" fragment = ");
        b2ZJblxo.append(this.MdtA4re8);
        b2ZJblxo.append('}');
        return b2ZJblxo.toString();
    }

    public final void wxUZMvaN() {
        int i = this.NCTxEWno;
        xj xjVar = this.Qr9iLBAD;
        if (i != 2) {
            if (i == 3) {
                li liVar = xjVar.MdtA4re8;
                View Xkz7p5xa = liVar.Xkz7p5xa();
                if (ej.ytu5o6f4(2)) {
                    Log.v("FragmentManager", "Clearing focus " + Xkz7p5xa.findFocus() + " on view " + Xkz7p5xa + " for Fragment " + liVar);
                }
                Xkz7p5xa.clearFocus();
                return;
            }
            return;
        }
        li liVar2 = xjVar.MdtA4re8;
        View findFocus = liVar2.ytu5o6f4.findFocus();
        if (findFocus != null) {
            liVar2.Qr9iLBAD().k3x7lurq = findFocus;
            if (ej.ytu5o6f4(2)) {
                Log.v("FragmentManager", "requestFocus: Saved focused view " + findFocus + " for Fragment " + liVar2);
            }
        }
        View Xkz7p5xa2 = this.MdtA4re8.Xkz7p5xa();
        if (Xkz7p5xa2.getParent() == null) {
            xjVar.NCTxEWno();
            Xkz7p5xa2.setAlpha(0.0f);
        }
        if (Xkz7p5xa2.getAlpha() == 0.0f && Xkz7p5xa2.getVisibility() == 0) {
            Xkz7p5xa2.setVisibility(4);
        }
        ki kiVar = liVar2.VhgXwMj9;
        Xkz7p5xa2.setAlpha(kiVar == null ? 1.0f : kiVar.eVhOlqcC);
    }
}
