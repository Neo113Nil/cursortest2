package defpackage;

import android.os.Bundle;
import java.util.LinkedHashMap;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class r50 {
    public final e7 NCTxEWno;
    public Bundle P7K7Inc8;
    public boolean VgvYg0wo;
    public boolean b2ZJblxo;
    public final s50 qoPGr6Ce;
    public final k00 MdtA4re8 = new k00(10);
    public final LinkedHashMap wxUZMvaN = new LinkedHashMap();
    public boolean Qr9iLBAD = true;

    public r50(s50 s50Var, e7 e7Var) {
        this.qoPGr6Ce = s50Var;
        this.NCTxEWno = e7Var;
    }

    public final void qoPGr6Ce() {
        s50 s50Var = this.qoPGr6Ce;
        if (s50Var.b2ZJblxo().MdtA4re8 != po.MdtA4re8) {
            m1.Ey6iv0m0("Restarter must be created only during owner's initialization stage");
        } else {
            if (this.VgvYg0wo) {
                m1.Ey6iv0m0("SavedStateRegistry was already attached.");
                return;
            }
            this.NCTxEWno.qoPGr6Ce();
            s50Var.b2ZJblxo().qoPGr6Ce(new ij(2, this));
            this.VgvYg0wo = true;
        }
    }
}
