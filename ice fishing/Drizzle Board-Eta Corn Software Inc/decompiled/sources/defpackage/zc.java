package defpackage;

import java.util.ArrayList;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public class zc extends ac {
    public int OnDfzHZD;

    public zc(th0 th0Var) {
        super(th0Var);
        if (th0Var instanceof lm) {
            this.VgvYg0wo = 2;
        } else {
            this.VgvYg0wo = 3;
        }
    }

    @Override // defpackage.ac
    public final void wxUZMvaN(int i) {
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
