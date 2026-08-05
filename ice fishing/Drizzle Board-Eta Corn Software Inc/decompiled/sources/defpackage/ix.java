package defpackage;

import android.os.Bundle;
import android.view.View;
import androidx.core.widget.NestedScrollView;
import com.kolosta.rejin.jilosa.R;
import com.kolosta.rejin.jilosa.presentation.ui.PairShelfFragment;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final /* synthetic */ class ix implements zk {
    public final /* synthetic */ PairShelfFragment MdtA4re8;
    public final /* synthetic */ int NCTxEWno;

    public /* synthetic */ ix(PairShelfFragment pairShelfFragment, int i) {
        this.NCTxEWno = i;
        this.MdtA4re8 = pairShelfFragment;
    }

    @Override // defpackage.zk
    public final Object ow5vqvCr(Object obj) {
        int i = this.NCTxEWno;
        xe0 xe0Var = xe0.qoPGr6Ce;
        PairShelfFragment pairShelfFragment = this.MdtA4re8;
        switch (i) {
            case 0:
                py pyVar = (py) obj;
                List list = PairShelfFragment.f7oeun2L;
                pyVar.getClass();
                uu sjUBp5pO = ej0.sjUBp5pO(pairShelfFragment);
                long j = pyVar.qoPGr6Ce;
                sjUBp5pO.getClass();
                Bundle bundle = new Bundle();
                bundle.putLong("pairId", j);
                sjUBp5pO.MdtA4re8(R.id.action_pair_shelf_to_pairing_card, bundle, null);
                break;
            case 1:
                String str = (String) obj;
                List list2 = PairShelfFragment.f7oeun2L;
                str.getClass();
                sj sjVar = pairShelfFragment.pP9Y2m6O;
                sjVar.getClass();
                sjVar.WYNAV5pd.setText(str);
                sj sjVar2 = pairShelfFragment.pP9Y2m6O;
                sjVar2.getClass();
                sjVar2.WYNAV5pd.setSelection(str.length());
                x90 x90Var = pairShelfFragment.nSmgoSB5().NCTxEWno;
                x90Var.getClass();
                x90Var.eVhOlqcC(null, str);
                break;
            case 2:
                String str2 = (String) obj;
                List list3 = PairShelfFragment.f7oeun2L;
                str2.getClass();
                Iterator it = ((n70) pairShelfFragment.nSmgoSB5().b2ZJblxo.NCTxEWno.Qr9iLBAD()).VgvYg0wo.iterator();
                int i2 = 0;
                while (true) {
                    if (it.hasNext()) {
                        String upperCase = ba0.euDDoUNr(((py) it.next()).NCTxEWno).toUpperCase(Locale.ROOT);
                        upperCase.getClass();
                        if (!upperCase.equals(str2)) {
                            i2++;
                        }
                    } else {
                        i2 = -1;
                    }
                }
                if (i2 >= 0) {
                    sj sjVar3 = pairShelfFragment.pP9Y2m6O;
                    sjVar3.getClass();
                    t10 layoutManager = sjVar3.sjUBp5pO.getLayoutManager();
                    View sjUBp5pO2 = layoutManager != null ? layoutManager.sjUBp5pO(i2) : null;
                    sj sjVar4 = pairShelfFragment.pP9Y2m6O;
                    sjVar4.getClass();
                    int top = sjVar4.sjUBp5pO.getTop();
                    int top2 = sjUBp5pO2 != null ? sjUBp5pO2.getTop() : 0;
                    sj sjVar5 = pairShelfFragment.pP9Y2m6O;
                    sjVar5.getClass();
                    NestedScrollView nestedScrollView = sjVar5.jb9XjC4I;
                    nestedScrollView.I5GHvsYW(0 - nestedScrollView.getScrollX(), (top + top2) - nestedScrollView.getScrollY(), false);
                    break;
                }
                break;
            default:
                w6 w6Var = (w6) obj;
                List list4 = PairShelfFragment.f7oeun2L;
                w6Var.getClass();
                sj sjVar6 = pairShelfFragment.pP9Y2m6O;
                sjVar6.getClass();
                pairShelfFragment.FXJmAAN1(sjVar6.OxcuoDLp, w6Var.NCTxEWno);
                sj sjVar7 = pairShelfFragment.pP9Y2m6O;
                sjVar7.getClass();
                pairShelfFragment.FXJmAAN1(sjVar7.amk52bBQ, w6Var.MdtA4re8);
                sj sjVar8 = pairShelfFragment.pP9Y2m6O;
                sjVar8.getClass();
                sjVar8.P7K7Inc8.setVisibility(0);
                break;
        }
        return xe0Var;
    }
}
