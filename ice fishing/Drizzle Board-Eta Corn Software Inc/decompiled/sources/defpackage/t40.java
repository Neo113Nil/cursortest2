package defpackage;

import android.os.Bundle;
import com.kolosta.rejin.jilosa.R;
import com.kolosta.rejin.jilosa.presentation.ui.SauceBenchFragment;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final /* synthetic */ class t40 implements zk {
    public final /* synthetic */ SauceBenchFragment MdtA4re8;
    public final /* synthetic */ int NCTxEWno;

    public /* synthetic */ t40(SauceBenchFragment sauceBenchFragment, int i) {
        this.NCTxEWno = i;
        this.MdtA4re8 = sauceBenchFragment;
    }

    @Override // defpackage.zk
    public final Object ow5vqvCr(Object obj) {
        int i = this.NCTxEWno;
        xe0 xe0Var = xe0.qoPGr6Ce;
        SauceBenchFragment sauceBenchFragment = this.MdtA4re8;
        switch (i) {
            case 0:
                py pyVar = (py) obj;
                pyVar.getClass();
                uu sjUBp5pO = ej0.sjUBp5pO(sauceBenchFragment);
                long j = pyVar.qoPGr6Ce;
                sjUBp5pO.getClass();
                Bundle bundle = new Bundle();
                bundle.putLong("pairId", j);
                sjUBp5pO.MdtA4re8(R.id.action_sauce_bench_to_pairing_card, bundle, null);
                break;
            default:
                k80 k80Var = (k80) obj;
                k80Var.getClass();
                uu sjUBp5pO2 = ej0.sjUBp5pO(sauceBenchFragment);
                long j2 = k80Var.qoPGr6Ce;
                sjUBp5pO2.getClass();
                Bundle bundle2 = new Bundle();
                bundle2.putLong("roundId", j2);
                sjUBp5pO2.MdtA4re8(R.id.action_sauce_bench_to_sprint_recap, bundle2, null);
                break;
        }
        return xe0Var;
    }
}
