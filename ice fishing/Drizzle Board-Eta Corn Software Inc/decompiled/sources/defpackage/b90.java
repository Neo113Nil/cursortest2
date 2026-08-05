package defpackage;

import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatButton;
import com.kolosta.rejin.jilosa.R;
import com.kolosta.rejin.jilosa.presentation.ui.SprintRoundFragment;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class b90 implements yg {
    public final /* synthetic */ SprintRoundFragment MdtA4re8;
    public final /* synthetic */ int NCTxEWno;

    public /* synthetic */ b90(SprintRoundFragment sprintRoundFragment, int i) {
        this.NCTxEWno = i;
        this.MdtA4re8 = sprintRoundFragment;
    }

    @Override // defpackage.yg
    public final Object OnDfzHZD(Object obj, g9 g9Var) {
        int i = this.NCTxEWno;
        xe0 xe0Var = xe0.qoPGr6Ce;
        SprintRoundFragment sprintRoundFragment = this.MdtA4re8;
        switch (i) {
            case 0:
                long longValue = ((Number) obj).longValue();
                uu sjUBp5pO = ej0.sjUBp5pO(sprintRoundFragment);
                sjUBp5pO.getClass();
                Bundle bundle = new Bundle();
                bundle.putLong("roundId", longValue);
                sjUBp5pO.MdtA4re8(R.id.action_sprint_round_to_sprint_recap, bundle, null);
                break;
            default:
                e90 e90Var = (e90) obj;
                sprintRoundFragment.Sjrx9cEN.VgvYg0wo(e90Var.NCTxEWno);
                hd0 hd0Var = sprintRoundFragment.pP9Y2m6O;
                hd0Var.getClass();
                ((TextView) hd0Var.P7K7Inc8).setText(g50.VgvYg0wo(sprintRoundFragment.aZz0PFXp(), e90Var.MdtA4re8));
                hd0 hd0Var2 = sprintRoundFragment.pP9Y2m6O;
                hd0Var2.getClass();
                TextView textView = (TextView) hd0Var2.b2ZJblxo;
                i90 i90Var = e90Var.qoPGr6Ce;
                textView.setText(g50.lDXGDhIF(i90Var));
                hd0 hd0Var3 = sprintRoundFragment.pP9Y2m6O;
                hd0Var3.getClass();
                hd0Var3.qoPGr6Ce.setText(sprintRoundFragment.ygLcUYwZ(R.string.round_order_by, sprintRoundFragment.OnDfzHZD(g50.lDXGDhIF(i90Var))));
                hd0 hd0Var4 = sprintRoundFragment.pP9Y2m6O;
                hd0Var4.getClass();
                ((AppCompatButton) hd0Var4.VgvYg0wo).setEnabled(e90Var.wxUZMvaN);
                break;
        }
        return xe0Var;
    }
}
