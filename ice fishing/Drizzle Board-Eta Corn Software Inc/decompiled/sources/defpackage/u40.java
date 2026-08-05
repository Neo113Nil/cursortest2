package defpackage;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.material.progressindicator.CircularProgressIndicator;
import com.kolosta.rejin.jilosa.R;
import com.kolosta.rejin.jilosa.presentation.ui.SauceBenchFragment;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class u40 implements yg {
    public final /* synthetic */ SauceBenchFragment MdtA4re8;
    public final /* synthetic */ int NCTxEWno;

    public /* synthetic */ u40(SauceBenchFragment sauceBenchFragment, int i) {
        this.NCTxEWno = i;
        this.MdtA4re8 = sauceBenchFragment;
    }

    @Override // defpackage.yg
    public final Object OnDfzHZD(Object obj, g9 g9Var) {
        int i = this.NCTxEWno;
        xe0 xe0Var = xe0.qoPGr6Ce;
        final SauceBenchFragment sauceBenchFragment = this.MdtA4re8;
        switch (i) {
            case 0:
                kb0 kb0Var = (kb0) obj;
                mb0 mb0Var = sauceBenchFragment.LvHlPNBd;
                if (mb0Var == null || !mb0Var.isShowing()) {
                    mb0 mb0Var2 = new mb0(sauceBenchFragment.aZz0PFXp(), kb0Var, new mj(sauceBenchFragment, kb0Var));
                    mb0Var2.show();
                    sauceBenchFragment.LvHlPNBd = mb0Var2;
                    break;
                }
                break;
            default:
                g2 g2Var = (g2) obj;
                n2 n2Var = g2Var.qoPGr6Ce;
                List list = g2Var.MdtA4re8;
                List list2 = g2Var.NCTxEWno;
                vj vjVar = sauceBenchFragment.pP9Y2m6O;
                vjVar.getClass();
                CircularProgressIndicator circularProgressIndicator = vjVar.OxcuoDLp;
                int i2 = n2Var.qoPGr6Ce;
                int i3 = n2Var.qoPGr6Ce;
                int i4 = n2Var.NCTxEWno;
                circularProgressIndicator.setProgress(i2 == 0 ? 0 : (i4 * 100) / i2);
                vj vjVar2 = sauceBenchFragment.pP9Y2m6O;
                vjVar2.getClass();
                vjVar2.amk52bBQ.setText(sauceBenchFragment.ygLcUYwZ(R.string.value_percent, Integer.valueOf(i3 == 0 ? 0 : (i4 * 100) / i3)));
                vj vjVar3 = sauceBenchFragment.pP9Y2m6O;
                vjVar3.getClass();
                vjVar3.sjUBp5pO.setText(sauceBenchFragment.ygLcUYwZ(R.string.value_pairs_opened, Integer.valueOf(i4), Integer.valueOf(i3)));
                n2 n2Var2 = g2Var.qoPGr6Ce;
                vj vjVar4 = sauceBenchFragment.pP9Y2m6O;
                vjVar4.getClass();
                View view = vjVar4.gjV1z5T1;
                int i5 = n2Var2.MdtA4re8;
                int i6 = n2Var2.qoPGr6Ce;
                int i7 = n2Var2.MdtA4re8;
                int i8 = n2Var2.NCTxEWno;
                SauceBenchFragment.zCflySGU(view, i5);
                vj vjVar5 = sauceBenchFragment.pP9Y2m6O;
                vjVar5.getClass();
                View view2 = vjVar5.FySoLYna;
                int i9 = i8 - i7;
                if (i9 < 0) {
                    i9 = 0;
                }
                SauceBenchFragment.zCflySGU(view2, i9);
                vj vjVar6 = sauceBenchFragment.pP9Y2m6O;
                vjVar6.getClass();
                View view3 = vjVar6.WYNAV5pd;
                int i10 = i6 - i8;
                if (i10 < 0) {
                    i10 = 0;
                }
                SauceBenchFragment.zCflySGU(view3, i10);
                vj vjVar7 = sauceBenchFragment.pP9Y2m6O;
                vjVar7.getClass();
                vjVar7.RXQxj5Oe.setText(sauceBenchFragment.ygLcUYwZ(R.string.value_legend, sauceBenchFragment.OnDfzHZD(R.string.bench_status_rated), Integer.valueOf(i7)));
                vj vjVar8 = sauceBenchFragment.pP9Y2m6O;
                vjVar8.getClass();
                TextView textView = vjVar8.I5GHvsYW;
                String OnDfzHZD = sauceBenchFragment.OnDfzHZD(R.string.bench_status_opened);
                int i11 = i8 - i7;
                if (i11 < 0) {
                    i11 = 0;
                }
                textView.setText(sauceBenchFragment.ygLcUYwZ(R.string.value_legend, OnDfzHZD, Integer.valueOf(i11)));
                vj vjVar9 = sauceBenchFragment.pP9Y2m6O;
                vjVar9.getClass();
                TextView textView2 = vjVar9.DK9slbsy;
                String OnDfzHZD2 = sauceBenchFragment.OnDfzHZD(R.string.bench_status_untouched);
                int i12 = i6 - i8;
                if (i12 < 0) {
                    i12 = 0;
                }
                textView2.setText(sauceBenchFragment.ygLcUYwZ(R.string.value_legend, OnDfzHZD2, Integer.valueOf(i12)));
                final kb0 kb0Var2 = g2Var.wxUZMvaN;
                vj vjVar10 = sauceBenchFragment.pP9Y2m6O;
                vjVar10.getClass();
                hx hxVar = new hx(kb0.wxUZMvaN, vjVar10.NCTxEWno);
                vj vjVar11 = sauceBenchFragment.pP9Y2m6O;
                vjVar11.getClass();
                hx hxVar2 = new hx(kb0.VgvYg0wo, vjVar11.qoPGr6Ce);
                vj vjVar12 = sauceBenchFragment.pP9Y2m6O;
                vjVar12.getClass();
                hx hxVar3 = new hx(kb0.P7K7Inc8, vjVar12.wxUZMvaN);
                vj vjVar13 = sauceBenchFragment.pP9Y2m6O;
                vjVar13.getClass();
                hx hxVar4 = new hx(kb0.b2ZJblxo, vjVar13.MdtA4re8);
                vj vjVar14 = sauceBenchFragment.pP9Y2m6O;
                vjVar14.getClass();
                hx[] hxVarArr = {hxVar, hxVar2, hxVar3, hxVar4, new hx(kb0.Qr9iLBAD, vjVar14.VgvYg0wo)};
                LinkedHashMap linkedHashMap = new LinkedHashMap(zq.ESscZ9M1(5));
                for (int i13 = 0; i13 < 5; i13++) {
                    hx hxVar5 = hxVarArr[i13];
                    linkedHashMap.put(hxVar5.NCTxEWno, hxVar5.MdtA4re8);
                }
                for (Map.Entry entry : linkedHashMap.entrySet()) {
                    final kb0 kb0Var3 = (kb0) entry.getKey();
                    Object value = entry.getValue();
                    value.getClass();
                    LinearLayout linearLayout = (LinearLayout) value;
                    linearLayout.setBackgroundResource(kb0Var3 == kb0Var2 ? R.drawable.bg_mood_selected : R.drawable.bg_mood_default);
                    linearLayout.setOnClickListener(new View.OnClickListener() { // from class: r40
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view4) {
                            SauceBenchFragment sauceBenchFragment2 = SauceBenchFragment.this;
                            d50 FXJmAAN1 = sauceBenchFragment2.FXJmAAN1();
                            kb0 kb0Var4 = kb0Var3;
                            kb0Var4.getClass();
                            fn.Ey6iv0m0(le0.FySoLYna(FXJmAAN1), null, new y7(FXJmAAN1, kb0Var4, null, 5), 3);
                            if (kb0Var2 != null) {
                                sauceBenchFragment2.N8VPGzVC(kb0Var4);
                            }
                        }
                    });
                }
                vj vjVar15 = sauceBenchFragment.pP9Y2m6O;
                vjVar15.getClass();
                vjVar15.P7K7Inc8.setVisibility(g2Var.P7K7Inc8 ? 0 : 8);
                vj vjVar16 = sauceBenchFragment.pP9Y2m6O;
                vjVar16.getClass();
                TextView textView3 = vjVar16.k3x7lurq;
                xx xxVar = g2Var.VgvYg0wo;
                String str = xxVar != null ? xxVar.NCTxEWno : null;
                if (str == null) {
                    str = "";
                }
                textView3.setText(str);
                sauceBenchFragment.hGvurcGl.VgvYg0wo(list2);
                vj vjVar17 = sauceBenchFragment.pP9Y2m6O;
                vjVar17.getClass();
                vjVar17.ygLcUYwZ.setVisibility(!list2.isEmpty() ? 0 : 8);
                vj vjVar18 = sauceBenchFragment.pP9Y2m6O;
                vjVar18.getClass();
                vjVar18.OnDfzHZD.setVisibility(list2.isEmpty() ? 0 : 8);
                sauceBenchFragment.Wi7iiXC4.VgvYg0wo(list);
                vj vjVar19 = sauceBenchFragment.pP9Y2m6O;
                vjVar19.getClass();
                vjVar19.Ey6iv0m0.setVisibility(!list.isEmpty() ? 0 : 8);
                vj vjVar20 = sauceBenchFragment.pP9Y2m6O;
                vjVar20.getClass();
                vjVar20.KlHjfFWx.setVisibility(list.isEmpty() ? 0 : 8);
                break;
        }
        return xe0Var;
    }
}
