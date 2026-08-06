package defpackage;

import android.graphics.Path;
import android.os.Build;
import android.view.View;
import com.combinations.level.experts.R;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class bh1 {
    public static final WeakHashMap lv06NcmrQ = new WeakHashMap();
    public final c2 AvO7iQsrTN;
    public final jc1 E7jCp8Ls;
    public final c2 EljAMC1QTz;
    public final c2 GWasM1elztuh;
    public final kd1 JFJ3QoxA;
    public final kd1 Mjvvu5DE;
    public final c2 OOA6hdeuvCS;
    public final kd1 WIEu4Ya2g8;
    public final c2 X1lG3V04pd;
    public final kd1 XnEVoBF0td1l;
    public int Y6hRI1cF8;
    public final c2 Yi7zF1RB1;
    public final kd1 YmKjaVtbfp5Z;
    public final h20 cilMamHF;
    public final c2 encWxUiV2;
    public final kd1 iwATDS1i01k;
    public final boolean jivtDDk9H;
    public final kd1 mE4lRynR;
    public final c2 mOu10nynGul;
    public final fo0 rQPn8YBR;
    public final kd1 uFEq9NpZ;
    public final c2 xqGvceK5x;

    public bh1(View view) {
        c2 X1lG3V04pd = x51.X1lG3V04pd("captionBar", 4);
        this.GWasM1elztuh = X1lG3V04pd;
        c2 X1lG3V04pd2 = x51.X1lG3V04pd("displayCutout", 128);
        this.Yi7zF1RB1 = X1lG3V04pd2;
        c2 X1lG3V04pd3 = x51.X1lG3V04pd("ime", 8);
        this.X1lG3V04pd = X1lG3V04pd3;
        c2 X1lG3V04pd4 = x51.X1lG3V04pd("mandatorySystemGestures", 32);
        this.xqGvceK5x = X1lG3V04pd4;
        c2 X1lG3V04pd5 = x51.X1lG3V04pd("navigationBars", 2);
        this.OOA6hdeuvCS = X1lG3V04pd5;
        c2 X1lG3V04pd6 = x51.X1lG3V04pd("statusBars", 1);
        this.EljAMC1QTz = X1lG3V04pd6;
        c2 X1lG3V04pd7 = x51.X1lG3V04pd("systemBars", 519);
        this.AvO7iQsrTN = X1lG3V04pd7;
        c2 X1lG3V04pd8 = x51.X1lG3V04pd("systemGestures", 16);
        this.encWxUiV2 = X1lG3V04pd8;
        c2 X1lG3V04pd9 = x51.X1lG3V04pd("tappableElement", 64);
        this.mOu10nynGul = X1lG3V04pd9;
        kd1 kd1Var = new kd1(new l20(0, 0, 0, 0), "waterfall");
        this.JFJ3QoxA = kd1Var;
        this.rQPn8YBR = z50.WRKkgoJXwDn(null);
        this.E7jCp8Ls = new jc1(new jc1(X1lG3V04pd7, X1lG3V04pd3), X1lG3V04pd2);
        new jc1(new jc1(new jc1(X1lG3V04pd9, X1lG3V04pd4), X1lG3V04pd8), kd1Var);
        this.XnEVoBF0td1l = x51.OOA6hdeuvCS("captionBarIgnoringVisibility", 4);
        this.uFEq9NpZ = x51.OOA6hdeuvCS("navigationBarsIgnoringVisibility", 2);
        this.iwATDS1i01k = x51.OOA6hdeuvCS("statusBarsIgnoringVisibility", 1);
        this.WIEu4Ya2g8 = x51.OOA6hdeuvCS("systemBarsIgnoringVisibility", 519);
        this.YmKjaVtbfp5Z = x51.OOA6hdeuvCS("tappableElementIgnoringVisibility", 64);
        this.Mjvvu5DE = new kd1(new l20(0, 0, 0, 0), "imeAnimationTarget");
        this.mE4lRynR = new kd1(new l20(0, 0, 0, 0), "imeAnimationSource");
        Object parent = view.getParent();
        View view2 = parent instanceof View ? (View) parent : null;
        Object tag = view2 != null ? view2.getTag(R.id.consume_window_insets_tag) : null;
        Boolean bool = tag instanceof Boolean ? (Boolean) tag : null;
        this.jivtDDk9H = bool != null ? bool.booleanValue() : false;
        this.cilMamHF = new h20(this);
        int i = ne1.GWasM1elztuh;
        wg1 GWasM1elztuh = je1.GWasM1elztuh(view);
        if (GWasM1elztuh != null) {
            sg1 sg1Var = GWasM1elztuh.GWasM1elztuh;
            X1lG3V04pd.EljAMC1QTz(sg1Var.jivtDDk9H(4));
            X1lG3V04pd2.EljAMC1QTz(sg1Var.jivtDDk9H(128));
            X1lG3V04pd3.EljAMC1QTz(sg1Var.jivtDDk9H(8));
            X1lG3V04pd4.EljAMC1QTz(sg1Var.jivtDDk9H(32));
            X1lG3V04pd5.EljAMC1QTz(sg1Var.jivtDDk9H(2));
            X1lG3V04pd6.EljAMC1QTz(sg1Var.jivtDDk9H(1));
            X1lG3V04pd7.EljAMC1QTz(sg1Var.jivtDDk9H(519));
            X1lG3V04pd8.EljAMC1QTz(sg1Var.jivtDDk9H(16));
            X1lG3V04pd9.EljAMC1QTz(sg1Var.jivtDDk9H(64));
        }
    }

    public static void GWasM1elztuh(bh1 bh1Var, wg1 wg1Var) {
        boolean z = false;
        bh1Var.GWasM1elztuh.AvO7iQsrTN(wg1Var, 0);
        bh1Var.X1lG3V04pd.AvO7iQsrTN(wg1Var, 0);
        bh1Var.Yi7zF1RB1.AvO7iQsrTN(wg1Var, 0);
        bh1Var.OOA6hdeuvCS.AvO7iQsrTN(wg1Var, 0);
        bh1Var.EljAMC1QTz.AvO7iQsrTN(wg1Var, 0);
        bh1Var.AvO7iQsrTN.AvO7iQsrTN(wg1Var, 0);
        bh1Var.encWxUiV2.AvO7iQsrTN(wg1Var, 0);
        bh1Var.mOu10nynGul.AvO7iQsrTN(wg1Var, 0);
        bh1Var.xqGvceK5x.AvO7iQsrTN(wg1Var, 0);
        bh1Var.XnEVoBF0td1l.EljAMC1QTz(d70.TpUsjqg3bxO(wg1Var.GWasM1elztuh.mOu10nynGul(4)));
        bh1Var.uFEq9NpZ.EljAMC1QTz(d70.TpUsjqg3bxO(wg1Var.GWasM1elztuh.mOu10nynGul(2)));
        bh1Var.iwATDS1i01k.EljAMC1QTz(d70.TpUsjqg3bxO(wg1Var.GWasM1elztuh.mOu10nynGul(1)));
        bh1Var.WIEu4Ya2g8.EljAMC1QTz(d70.TpUsjqg3bxO(wg1Var.GWasM1elztuh.mOu10nynGul(519)));
        bh1Var.YmKjaVtbfp5Z.EljAMC1QTz(d70.TpUsjqg3bxO(wg1Var.GWasM1elztuh.mOu10nynGul(64)));
        om AvO7iQsrTN = wg1Var.GWasM1elztuh.AvO7iQsrTN();
        bh1Var.JFJ3QoxA.EljAMC1QTz(d70.TpUsjqg3bxO(AvO7iQsrTN != null ? AvO7iQsrTN.GWasM1elztuh() : e20.OOA6hdeuvCS));
        h1 h1Var = null;
        if (AvO7iQsrTN != null) {
            Path Yi7zF1RB1 = Build.VERSION.SDK_INT >= 31 ? d4.Yi7zF1RB1(AvO7iQsrTN.GWasM1elztuh) : null;
            if (Yi7zF1RB1 != null) {
                h1Var = new h1(Yi7zF1RB1);
            }
        }
        bh1Var.rQPn8YBR.setValue(h1Var);
        synchronized (e41.X1lG3V04pd) {
            ig0 ig0Var = e41.JFJ3QoxA.encWxUiV2;
            if (ig0Var != null) {
                if (ig0Var.encWxUiV2()) {
                    z = true;
                }
            }
        }
        if (z) {
            e41.GWasM1elztuh();
        }
    }
}
