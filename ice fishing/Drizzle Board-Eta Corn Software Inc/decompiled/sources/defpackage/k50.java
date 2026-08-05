package defpackage;

import android.os.Bundle;
import java.util.Arrays;
import java.util.Map;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class k50 implements p50 {
    public Bundle MdtA4re8;
    public boolean NCTxEWno;
    public final mcXgUFR8 qoPGr6Ce;
    public final cb0 wxUZMvaN;

    public k50(mcXgUFR8 mcxgufr8, vg0 vg0Var) {
        mcxgufr8.getClass();
        this.qoPGr6Ce = mcxgufr8;
        this.wxUZMvaN = new cb0(new e7(7, vg0Var));
    }

    public final void NCTxEWno() {
        if (this.NCTxEWno) {
            return;
        }
        Bundle b2ZJblxo = this.qoPGr6Ce.b2ZJblxo("androidx.lifecycle.internal.SavedStateHandlesProvider");
        Bundle VgvYg0wo = w30.VgvYg0wo((hx[]) Arrays.copyOf(new hx[0], 0));
        Bundle bundle = this.MdtA4re8;
        if (bundle != null) {
            VgvYg0wo.putAll(bundle);
        }
        if (b2ZJblxo != null) {
            VgvYg0wo.putAll(b2ZJblxo);
        }
        this.MdtA4re8 = VgvYg0wo;
        this.NCTxEWno = true;
    }

    @Override // defpackage.p50
    public final Bundle qoPGr6Ce() {
        Bundle VgvYg0wo = w30.VgvYg0wo((hx[]) Arrays.copyOf(new hx[0], 0));
        Bundle bundle = this.MdtA4re8;
        if (bundle != null) {
            VgvYg0wo.putAll(bundle);
        }
        for (Map.Entry entry : ((l50) this.wxUZMvaN.getValue()).NCTxEWno.entrySet()) {
            String str = (String) entry.getKey();
            Bundle qoPGr6Ce = ((ui) ((h50) entry.getValue()).qoPGr6Ce.P7K7Inc8).qoPGr6Ce();
            if (!qoPGr6Ce.isEmpty()) {
                str.getClass();
                VgvYg0wo.putBundle(str, qoPGr6Ce);
            }
        }
        this.NCTxEWno = false;
        return VgvYg0wo;
    }
}
