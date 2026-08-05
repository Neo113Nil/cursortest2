package defpackage;

import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.chip.Chip;
import com.kolosta.rejin.jilosa.R;
import com.kolosta.rejin.jilosa.presentation.ui.PairShelfFragment;
import com.kolosta.rejin.jilosa.presentation.ui.PairingCardFragment;
import com.kolosta.rejin.jilosa.presentation.ui.SortSprintFragment;
import com.kolosta.rejin.jilosa.presentation.ui.SprintRecapFragment;
import com.kolosta.rejin.jilosa.presentation.ui.TasteLedgerFragment;
import java.util.List;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class lx implements yg {
    public final /* synthetic */ li MdtA4re8;
    public final /* synthetic */ int NCTxEWno;

    public /* synthetic */ lx(int i, li liVar) {
        this.NCTxEWno = i;
        this.MdtA4re8 = liVar;
    }

    @Override // defpackage.yg
    public final Object OnDfzHZD(Object obj, g9 g9Var) {
        int i = this.NCTxEWno;
        xe0 xe0Var = xe0.qoPGr6Ce;
        li liVar = this.MdtA4re8;
        switch (i) {
            case 0:
                n70 n70Var = (n70) obj;
                PairShelfFragment pairShelfFragment = (PairShelfFragment) liVar;
                List list = PairShelfFragment.f7oeun2L;
                ay ayVar = pairShelfFragment.Wi7iiXC4;
                q3 q3Var = n70Var.wxUZMvaN;
                List list2 = n70Var.b2ZJblxo;
                List list3 = n70Var.VgvYg0wo;
                ayVar.getClass();
                q3Var.getClass();
                if (ayVar.VgvYg0wo != q3Var) {
                    ayVar.VgvYg0wo = q3Var;
                    ayVar.qoPGr6Ce.NCTxEWno(0, ayVar.qoPGr6Ce());
                }
                ayVar.VgvYg0wo(list3);
                pairShelfFragment.orhfF2Ya.VgvYg0wo(n70Var.P7K7Inc8);
                pairShelfFragment.dHozS53r.VgvYg0wo(list2);
                sj sjVar = pairShelfFragment.pP9Y2m6O;
                sjVar.getClass();
                sjVar.FySoLYna.setText(pairShelfFragment.ygLcUYwZ(R.string.value_results, Integer.valueOf(list3.size())));
                sj sjVar2 = pairShelfFragment.pP9Y2m6O;
                sjVar2.getClass();
                sjVar2.sjUBp5pO.setVisibility(!list3.isEmpty() ? 0 : 8);
                sj sjVar3 = pairShelfFragment.pP9Y2m6O;
                sjVar3.getClass();
                sjVar3.lDXGDhIF.setVisibility(list3.isEmpty() ? 0 : 8);
                sj sjVar4 = pairShelfFragment.pP9Y2m6O;
                sjVar4.getClass();
                sjVar4.ygLcUYwZ.setVisibility(!list3.isEmpty() ? 0 : 8);
                sj sjVar5 = pairShelfFragment.pP9Y2m6O;
                sjVar5.getClass();
                sjVar5.Qr9iLBAD.setVisibility(!list2.isEmpty() ? 0 : 8);
                sj sjVar6 = pairShelfFragment.pP9Y2m6O;
                sjVar6.getClass();
                sjVar6.b2ZJblxo.setVisibility(list2.isEmpty() ? 0 : 8);
                String str = n70Var.qoPGr6Ce;
                sj sjVar7 = pairShelfFragment.pP9Y2m6O;
                sjVar7.getClass();
                if (!fn.qoPGr6Ce(sjVar7.WYNAV5pd.getText().toString(), str)) {
                    sj sjVar8 = pairShelfFragment.pP9Y2m6O;
                    sjVar8.getClass();
                    sjVar8.WYNAV5pd.setText(str);
                    sj sjVar9 = pairShelfFragment.pP9Y2m6O;
                    sjVar9.getClass();
                    sjVar9.WYNAV5pd.setSelection(str.length());
                }
                sj sjVar10 = pairShelfFragment.pP9Y2m6O;
                sjVar10.getClass();
                sjVar10.gjV1z5T1.setVisibility(str.length() > 0 ? 0 : 8);
                for (hx hxVar : pairShelfFragment.HdOGZAzC()) {
                    ((Chip) hxVar.NCTxEWno).setChecked(n70Var.NCTxEWno.contains((String) hxVar.MdtA4re8));
                }
                a4 a4Var = n70Var.MdtA4re8;
                sj sjVar11 = pairShelfFragment.pP9Y2m6O;
                sjVar11.getClass();
                pairShelfFragment.zCflySGU(sjVar11.DK9slbsy, a4Var == a4.NCTxEWno);
                sj sjVar12 = pairShelfFragment.pP9Y2m6O;
                sjVar12.getClass();
                pairShelfFragment.zCflySGU(sjVar12.lwWCatUu, a4Var == a4.MdtA4re8);
                sj sjVar13 = pairShelfFragment.pP9Y2m6O;
                sjVar13.getClass();
                pairShelfFragment.zCflySGU(sjVar13.U0LaHZX7, a4Var == a4.wxUZMvaN);
                q3 q3Var2 = n70Var.wxUZMvaN;
                sj sjVar14 = pairShelfFragment.pP9Y2m6O;
                sjVar14.getClass();
                pairShelfFragment.zCflySGU(sjVar14.eVhOlqcC, q3Var2 == q3.NCTxEWno);
                sj sjVar15 = pairShelfFragment.pP9Y2m6O;
                sjVar15.getClass();
                pairShelfFragment.zCflySGU(sjVar15.ow5vqvCr, q3Var2 == q3.MdtA4re8);
                sj sjVar16 = pairShelfFragment.pP9Y2m6O;
                sjVar16.getClass();
                pairShelfFragment.zCflySGU(sjVar16.k3x7lurq, q3Var2 == q3.wxUZMvaN);
                kb0 kb0Var = n70Var.Qr9iLBAD;
                sj sjVar17 = pairShelfFragment.pP9Y2m6O;
                sjVar17.getClass();
                sjVar17.RXQxj5Oe.setVisibility(kb0Var == null ? 8 : 0);
                if (kb0Var != null) {
                    sj sjVar18 = pairShelfFragment.pP9Y2m6O;
                    sjVar18.getClass();
                    sjVar18.I5GHvsYW.setText(pairShelfFragment.ygLcUYwZ(R.string.prefilter_mood, pairShelfFragment.OnDfzHZD(g50.P7K7Inc8(kb0Var))));
                    break;
                }
                break;
            case 1:
                fy fyVar = (fy) obj;
                PairingCardFragment pairingCardFragment = (PairingCardFragment) liVar;
                xx xxVar = fyVar.qoPGr6Ce;
                r6 r6Var = fyVar.VgvYg0wo;
                List list4 = fyVar.MdtA4re8;
                if (xxVar != null) {
                    String str2 = xxVar.NCTxEWno;
                    tj tjVar = pairingCardFragment.pP9Y2m6O;
                    tjVar.getClass();
                    tjVar.Qr9iLBAD.setText(str2);
                    tj tjVar2 = pairingCardFragment.pP9Y2m6O;
                    tjVar2.getClass();
                    tjVar2.jb9XjC4I.setText(xxVar.MdtA4re8);
                    tj tjVar3 = pairingCardFragment.pP9Y2m6O;
                    tjVar3.getClass();
                    tjVar3.eVhOlqcC.setText(str2);
                    tj tjVar4 = pairingCardFragment.pP9Y2m6O;
                    tjVar4.getClass();
                    tjVar4.k3x7lurq.setText(xxVar.wxUZMvaN);
                    tj tjVar5 = pairingCardFragment.pP9Y2m6O;
                    tjVar5.getClass();
                    tjVar5.amk52bBQ.setText(pairingCardFragment.ygLcUYwZ(R.string.value_minutes, Integer.valueOf(xxVar.jb9XjC4I)));
                    tj tjVar6 = pairingCardFragment.pP9Y2m6O;
                    tjVar6.getClass();
                    tjVar6.P7K7Inc8.setText(xxVar.VgvYg0wo);
                    tj tjVar7 = pairingCardFragment.pP9Y2m6O;
                    tjVar7.getClass();
                    tjVar7.VgvYg0wo.setText(xxVar.OnDfzHZD);
                }
                pairingCardFragment.Sjrx9cEN.VgvYg0wo(fyVar.NCTxEWno);
                pairingCardFragment.LvHlPNBd.VgvYg0wo(list4);
                tj tjVar8 = pairingCardFragment.pP9Y2m6O;
                tjVar8.getClass();
                tjVar8.OxcuoDLp.setVisibility(!list4.isEmpty() ? 0 : 8);
                tj tjVar9 = pairingCardFragment.pP9Y2m6O;
                tjVar9.getClass();
                tjVar9.sjUBp5pO.setVisibility(list4.isEmpty() ? 0 : 8);
                tj tjVar10 = pairingCardFragment.pP9Y2m6O;
                tjVar10.getClass();
                tjVar10.wxUZMvaN.setVisibility(fyVar.wxUZMvaN ? 0 : 8);
                tj tjVar11 = pairingCardFragment.pP9Y2m6O;
                tjVar11.getClass();
                tjVar11.MdtA4re8.setVisibility(r6Var == null ? 8 : 0);
                if (r6Var != null) {
                    tj tjVar12 = pairingCardFragment.pP9Y2m6O;
                    tjVar12.getClass();
                    pairingCardFragment.zCflySGU(tjVar12.ow5vqvCr, r6Var.qoPGr6Ce);
                    tj tjVar13 = pairingCardFragment.pP9Y2m6O;
                    tjVar13.getClass();
                    pairingCardFragment.zCflySGU(tjVar13.OnDfzHZD, r6Var.NCTxEWno);
                    break;
                }
                break;
            case 2:
                w70 w70Var = (w70) obj;
                SortSprintFragment sortSprintFragment = (SortSprintFragment) liVar;
                bp9dZ9BB bp9dz9bb = sortSprintFragment.pP9Y2m6O;
                bp9dz9bb.getClass();
                ((TextView) bp9dz9bb.P7K7Inc8).setText(g50.lDXGDhIF(w70Var.qoPGr6Ce));
                w80 w80Var = w70Var.NCTxEWno;
                bp9dZ9BB bp9dz9bb2 = sortSprintFragment.pP9Y2m6O;
                bp9dz9bb2.getClass();
                ((LinearLayout) bp9dz9bb2.wxUZMvaN).setVisibility(w80Var != null ? 0 : 8);
                bp9dZ9BB bp9dz9bb3 = sortSprintFragment.pP9Y2m6O;
                bp9dz9bb3.getClass();
                ((TextView) bp9dz9bb3.NCTxEWno).setVisibility(w80Var != null ? 8 : 0);
                if (w80Var != null) {
                    bp9dZ9BB bp9dz9bb4 = sortSprintFragment.pP9Y2m6O;
                    bp9dz9bb4.getClass();
                    ((TextView) bp9dz9bb4.MdtA4re8).setText(g50.VgvYg0wo(sortSprintFragment.aZz0PFXp(), w80Var.MdtA4re8));
                    bp9dZ9BB bp9dz9bb5 = sortSprintFragment.pP9Y2m6O;
                    bp9dz9bb5.getClass();
                    ((TextView) bp9dz9bb5.qoPGr6Ce).setText(sortSprintFragment.ygLcUYwZ(R.string.value_percent, Integer.valueOf(w80Var.wxUZMvaN)));
                    break;
                }
                break;
            case 3:
                o80 o80Var = (o80) obj;
                SprintRecapFragment sprintRecapFragment = (SprintRecapFragment) liVar;
                sprintRecapFragment.Sjrx9cEN.VgvYg0wo(o80Var.NCTxEWno);
                w80 w80Var2 = o80Var.qoPGr6Ce;
                if (w80Var2 != null) {
                    bp9dZ9BB bp9dz9bb6 = sprintRecapFragment.pP9Y2m6O;
                    bp9dz9bb6.getClass();
                    ((TextView) bp9dz9bb6.P7K7Inc8).setText(g50.VgvYg0wo(sprintRecapFragment.aZz0PFXp(), w80Var2.MdtA4re8));
                    bp9dZ9BB bp9dz9bb7 = sprintRecapFragment.pP9Y2m6O;
                    bp9dz9bb7.getClass();
                    ((TextView) bp9dz9bb7.NCTxEWno).setText(sprintRecapFragment.ygLcUYwZ(R.string.value_percent, Integer.valueOf(w80Var2.wxUZMvaN)));
                    break;
                }
                break;
            default:
                jo joVar = (jo) obj;
                TasteLedgerFragment tasteLedgerFragment = (TasteLedgerFragment) liVar;
                tasteLedgerFragment.Sjrx9cEN.VgvYg0wo(joVar.qoPGr6Ce);
                u6 u6Var = tasteLedgerFragment.LvHlPNBd;
                List list5 = joVar.NCTxEWno;
                u6Var.VgvYg0wo(list5);
                u6 u6Var2 = tasteLedgerFragment.hGvurcGl;
                List list6 = joVar.MdtA4re8;
                u6Var2.VgvYg0wo(list6);
                hd0 hd0Var = tasteLedgerFragment.pP9Y2m6O;
                hd0Var.getClass();
                ((RecyclerView) hd0Var.NCTxEWno).setVisibility(!list5.isEmpty() ? 0 : 8);
                hd0 hd0Var2 = tasteLedgerFragment.pP9Y2m6O;
                hd0Var2.getClass();
                hd0Var2.qoPGr6Ce.setVisibility(list5.isEmpty() ? 0 : 8);
                hd0 hd0Var3 = tasteLedgerFragment.pP9Y2m6O;
                hd0Var3.getClass();
                ((RecyclerView) hd0Var3.b2ZJblxo).setVisibility(!list6.isEmpty() ? 0 : 8);
                hd0 hd0Var4 = tasteLedgerFragment.pP9Y2m6O;
                hd0Var4.getClass();
                ((TextView) hd0Var4.P7K7Inc8).setVisibility(list6.isEmpty() ? 0 : 8);
                hd0 hd0Var5 = tasteLedgerFragment.pP9Y2m6O;
                hd0Var5.getClass();
                ((TextView) hd0Var5.wxUZMvaN).setText(tasteLedgerFragment.ygLcUYwZ(R.string.value_coverage, Integer.valueOf(joVar.wxUZMvaN), Integer.valueOf(joVar.VgvYg0wo)));
                hd0 hd0Var6 = tasteLedgerFragment.pP9Y2m6O;
                hd0Var6.getClass();
                ((TextView) hd0Var6.VgvYg0wo).setText(tasteLedgerFragment.ygLcUYwZ(R.string.value_coverage, Integer.valueOf(joVar.P7K7Inc8), Integer.valueOf(joVar.b2ZJblxo)));
                break;
        }
        return xe0Var;
    }
}
