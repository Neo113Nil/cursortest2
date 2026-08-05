package defpackage;

import android.os.Bundle;
import com.kolosta.rejin.jilosa.R;
import com.kolosta.rejin.jilosa.presentation.ui.TasteLedgerFragment;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final /* synthetic */ class sb0 implements zk {
    public final /* synthetic */ TasteLedgerFragment MdtA4re8;
    public final /* synthetic */ int NCTxEWno;

    public /* synthetic */ sb0(TasteLedgerFragment tasteLedgerFragment, int i) {
        this.NCTxEWno = i;
        this.MdtA4re8 = tasteLedgerFragment;
    }

    @Override // defpackage.zk
    public final Object ow5vqvCr(Object obj) {
        int i = this.NCTxEWno;
        xe0 xe0Var = xe0.qoPGr6Ce;
        TasteLedgerFragment tasteLedgerFragment = this.MdtA4re8;
        switch (i) {
            case 0:
                k1 k1Var = (k1) obj;
                k1Var.getClass();
                long j = k1Var.wxUZMvaN;
                if (j >= 0) {
                    uu sjUBp5pO = ej0.sjUBp5pO(tasteLedgerFragment);
                    sjUBp5pO.getClass();
                    Bundle bundle = new Bundle();
                    bundle.putLong("roundId", j);
                    sjUBp5pO.MdtA4re8(R.id.action_taste_ledger_to_sprint_recap, bundle, null);
                    break;
                }
                break;
            default:
                c10 c10Var = (c10) obj;
                c10Var.getClass();
                uu sjUBp5pO2 = ej0.sjUBp5pO(tasteLedgerFragment);
                long j2 = c10Var.qoPGr6Ce;
                sjUBp5pO2.getClass();
                Bundle bundle2 = new Bundle();
                bundle2.putLong("pairId", j2);
                sjUBp5pO2.MdtA4re8(R.id.action_taste_ledger_to_pairing_card, bundle2, null);
                break;
        }
        return xe0Var;
    }
}
