package defpackage;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewConfiguration;
import com.combinations.level.experts.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class se {
    public final j6IIN2O8eOU AvO7iQsrTN;
    public final gY3jNtCS0 E7jCp8Ls;
    public final j00 EljAMC1QTz;
    public final View GWasM1elztuh;
    public final o6lobyFa JFJ3QoxA;
    public final i60 Mjvvu5DE;
    public final ff1 OOA6hdeuvCS;
    public final fz WIEu4Ya2g8;
    public final t90 X1lG3V04pd;
    public final HkgleTzzRy XnEVoBF0td1l;
    public int Y6hRI1cF8;
    public final ye Yi7zF1RB1;
    public final z1 YmKjaVtbfp5Z;
    public final re cilMamHF;
    public final Configuration encWxUiV2;
    public final mg0 iwATDS1i01k;
    public final v9 jivtDDk9H;
    public final c90 mE4lRynR;
    public final mg0 mOu10nynGul;
    public final k61 rQPn8YBR;
    public final xt uFEq9NpZ;
    public final yw0 xqGvceK5x;

    public se(se seVar, View view, ye yeVar, t90 t90Var, yw0 yw0Var, ff1 ff1Var) {
        j00 j00Var;
        Configuration configuration;
        mg0 WRKkgoJXwDn;
        o6lobyFa o6lobyfa;
        k61 k61Var;
        gY3jNtCS0 gy3jntcs0;
        HkgleTzzRy hkgleTzzRy;
        xt k61Var2;
        mg0 fo0Var;
        z1 z1Var;
        v9 v9Var;
        i60 i60Var;
        j6IIN2O8eOU j6iin2o8eou;
        View view2;
        boolean rQPn8YBR = o30.rQPn8YBR((seVar == null || (view2 = seVar.GWasM1elztuh) == null) ? null : view2.getContext(), view.getContext());
        this.GWasM1elztuh = view;
        this.Yi7zF1RB1 = yeVar;
        this.X1lG3V04pd = t90Var;
        this.xqGvceK5x = yw0Var;
        this.OOA6hdeuvCS = ff1Var;
        if (rQPn8YBR) {
            seVar.getClass();
            j00Var = seVar.EljAMC1QTz;
        } else {
            j00Var = new j00(0);
        }
        this.EljAMC1QTz = j00Var;
        this.AvO7iQsrTN = (seVar == null || (j6iin2o8eou = seVar.AvO7iQsrTN) == null) ? new j6IIN2O8eOU(24) : j6iin2o8eou;
        if (rQPn8YBR) {
            seVar.getClass();
            configuration = seVar.encWxUiV2;
        } else {
            configuration = new Configuration(view.getContext().getResources().getConfiguration());
        }
        this.encWxUiV2 = configuration;
        if (rQPn8YBR) {
            seVar.getClass();
            WRKkgoJXwDn = seVar.mOu10nynGul;
        } else {
            WRKkgoJXwDn = z50.WRKkgoJXwDn(new Configuration(configuration));
        }
        this.mOu10nynGul = WRKkgoJXwDn;
        if (rQPn8YBR) {
            seVar.getClass();
            o6lobyfa = seVar.JFJ3QoxA;
        } else {
            o6lobyfa = new o6lobyFa(view.getContext());
        }
        this.JFJ3QoxA = o6lobyfa;
        if (rQPn8YBR) {
            seVar.getClass();
            k61Var = seVar.rQPn8YBR;
        } else {
            view.getContext();
            k61Var = new k61(11);
        }
        this.rQPn8YBR = k61Var;
        if (rQPn8YBR) {
            seVar.getClass();
            gy3jntcs0 = seVar.E7jCp8Ls;
        } else {
            gy3jntcs0 = new gY3jNtCS0(view.getContext());
        }
        this.E7jCp8Ls = gy3jntcs0;
        if (rQPn8YBR) {
            seVar.getClass();
            hkgleTzzRy = seVar.XnEVoBF0td1l;
        } else {
            hkgleTzzRy = new HkgleTzzRy();
        }
        this.XnEVoBF0td1l = hkgleTzzRy;
        if (rQPn8YBR) {
            seVar.getClass();
            k61Var2 = seVar.uFEq9NpZ;
        } else {
            view.getContext();
            k61Var2 = new k61(9);
        }
        this.uFEq9NpZ = k61Var2;
        if (rQPn8YBR) {
            seVar.getClass();
            fo0Var = seVar.iwATDS1i01k;
        } else {
            fo0Var = new fo0(n30.Y6hRI1cF8(view.getContext()), b9xEq24R1.Uxq83abb04);
        }
        this.iwATDS1i01k = fo0Var;
        this.WIEu4Ya2g8 = view == (seVar != null ? seVar.GWasM1elztuh : null) ? seVar.WIEu4Ya2g8 : new vt(15);
        if (rQPn8YBR) {
            seVar.getClass();
            z1Var = seVar.YmKjaVtbfp5Z;
        } else {
            z1Var = new z1(ViewConfiguration.get(view.getContext()));
        }
        this.YmKjaVtbfp5Z = z1Var;
        this.Mjvvu5DE = (seVar == null || (i60Var = seVar.Mjvvu5DE) == null) ? new i60() : i60Var;
        this.mE4lRynR = new c90(0);
        this.jivtDDk9H = (seVar == null || (v9Var = seVar.jivtDDk9H) == null) ? new v9() : v9Var;
        new d3(1, this);
        this.cilMamHF = new re(this);
    }

    public final void GWasM1elztuh(c cVar, lv lvVar, qx qxVar, int i) {
        boolean z;
        qxVar.Uxq83abb04(123858079);
        int i2 = (qxVar.encWxUiV2(cVar) ? 4 : 2) | i | (qxVar.encWxUiV2(lvVar) ? 32 : 16) | (qxVar.encWxUiV2(this) ? 256 : 128);
        int i3 = 1;
        if (qxVar.dqB83aoLBB(i2 & 1, (i2 & 147) != 146)) {
            Object tag = cVar.getTag(R.id.inspection_slot_table_set);
            LinkedHashMap linkedHashMap = null;
            Set set = (!(tag instanceof Set) || ((tag instanceof q40) && !(tag instanceof s40))) ? null : (Set) tag;
            if (set == null) {
                Object parent = cVar.getParent();
                View view = parent instanceof View ? (View) parent : null;
                Object tag2 = view != null ? view.getTag(R.id.inspection_slot_table_set) : null;
                set = (!(tag2 instanceof Set) || ((tag2 instanceof q40) && !(tag2 instanceof s40))) ? null : (Set) tag2;
            }
            if (set != null) {
                set.add(qxVar.lv06NcmrQ());
                qxVar.YmKjaVtbfp5Z = true;
                qxVar.k8h8IjolWQ = true;
                qxVar.X1lG3V04pd.Yi7zF1RB1();
                qxVar.eUH21U3apd.Yi7zF1RB1();
                c31 c31Var = qxVar.A1EKNP6CxJ;
                z21 z21Var = c31Var.GWasM1elztuh;
                c31Var.OOA6hdeuvCS = z21Var.uFEq9NpZ;
                c31Var.EljAMC1QTz = z21Var.iwATDS1i01k;
            }
            Object HFYAaqMd6 = qxVar.HFYAaqMd6();
            yw0 yw0Var = this.xqGvceK5x;
            k61 k61Var = ue.GWasM1elztuh;
            if (HFYAaqMd6 == k61Var) {
                Object parent2 = cVar.getParent();
                parent2.getClass();
                View view2 = (View) parent2;
                Object tag3 = view2.getTag(R.id.compose_view_saveable_id_tag);
                String str = tag3 instanceof String ? (String) tag3 : null;
                if (str == null) {
                    str = String.valueOf(view2.getId());
                }
                String str2 = "SaveableStateRegistry:" + str;
                d X1lG3V04pd = yw0Var.X1lG3V04pd();
                Bundle rQPn8YBR = X1lG3V04pd.rQPn8YBR(str2);
                if (rQPn8YBR != null) {
                    linkedHashMap = new LinkedHashMap();
                    for (String str3 : rQPn8YBR.keySet()) {
                        ArrayList parcelableArrayList = rQPn8YBR.getParcelableArrayList(str3);
                        parcelableArrayList.getClass();
                        linkedHashMap.put(str3, parcelableArrayList);
                    }
                }
                XdwzlWIkSDqF xdwzlWIkSDqF = XdwzlWIkSDqF.WIEu4Ya2g8;
                v51 v51Var = nw0.GWasM1elztuh;
                lw0 lw0Var = new lw0(linkedHashMap, xdwzlWIkSDqF);
                if (X1lG3V04pd.WIEu4Ya2g8(str2) == null) {
                    try {
                        X1lG3V04pd.jivtDDk9H(str2, new zc(i3, lw0Var));
                        z = true;
                    } catch (IllegalArgumentException unused) {
                    }
                    vm vmVar = new vm(lw0Var, new wm(z, X1lG3V04pd, str2));
                    qxVar.dcDmLGVhzWm(vmVar);
                    HFYAaqMd6 = vmVar;
                }
                z = false;
                vm vmVar2 = new vm(lw0Var, new wm(z, X1lG3V04pd, str2));
                qxVar.dcDmLGVhzWm(vmVar2);
                HFYAaqMd6 = vmVar2;
            }
            vm vmVar3 = (vm) HFYAaqMd6;
            boolean encWxUiV2 = qxVar.encWxUiV2(vmVar3);
            Object HFYAaqMd62 = qxVar.HFYAaqMd6();
            if (encWxUiV2 || HFYAaqMd62 == k61Var) {
                HFYAaqMd62 = new NWXxPwoOUSX9(8, vmVar3);
                qxVar.dcDmLGVhzWm(HFYAaqMd62);
            }
            ki1.EljAMC1QTz(kc1.GWasM1elztuh, (hv) HFYAaqMd62, qxVar);
            lf lfVar = kf.lv06NcmrQ;
            boolean booleanValue = ((Boolean) qxVar.JFJ3QoxA(lfVar)).booleanValue() | cVar.getScrollCaptureInProgress$ui();
            boolean EljAMC1QTz = qxVar.EljAMC1QTz(cVar.getView());
            Object HFYAaqMd63 = qxVar.HFYAaqMd6();
            if (EljAMC1QTz || HFYAaqMd63 == k61Var) {
                HFYAaqMd63 = new gf1(cVar.getView());
                qxVar.dcDmLGVhzWm(HFYAaqMd63);
            }
            vc0.xqGvceK5x(new qs0[]{za0.GWasM1elztuh.GWasM1elztuh(this.X1lG3V04pd), db0.GWasM1elztuh.GWasM1elztuh(yw0Var), r.xqGvceK5x.GWasM1elztuh(this.EljAMC1QTz), r.OOA6hdeuvCS.GWasM1elztuh(this.AvO7iQsrTN), r.Yi7zF1RB1.GWasM1elztuh(cVar.getContext()), n20.GWasM1elztuh.GWasM1elztuh(set), r.GWasM1elztuh.GWasM1elztuh(cVar.getConfiguration()), nw0.GWasM1elztuh.GWasM1elztuh(vmVar3), r.EljAMC1QTz.GWasM1elztuh(cVar.getView()), lfVar.GWasM1elztuh(Boolean.valueOf(booleanValue)), kf.jivtDDk9H.GWasM1elztuh(cVar.getViewConfiguration()), uz.GWasM1elztuh.GWasM1elztuh((gf1) HFYAaqMd63)}, rj0.YZjbz8VdP5(1317454175, new qe(cVar, this, lvVar), qxVar), qxVar, 56);
        } else {
            qxVar.YXi2hvwn7WL();
        }
        at0 Mjvvu5DE = qxVar.Mjvvu5DE();
        if (Mjvvu5DE != null) {
            Mjvvu5DE.xqGvceK5x = new qe(this, cVar, lvVar, i);
        }
    }

    public final void X1lG3V04pd() {
        int i = this.Y6hRI1cF8 + 1;
        this.Y6hRI1cF8 = i;
        if (i == 1) {
            View view = this.GWasM1elztuh;
            Context context = view.getContext();
            re reVar = this.cilMamHF;
            context.registerComponentCallbacks(reVar);
            xqGvceK5x(view.getResources().getConfiguration());
            this.mE4lRynR.GWasM1elztuh.setValue(Boolean.valueOf(view.hasWindowFocus()));
            view.getViewTreeObserver().addOnWindowFocusChangeListener(reVar);
        }
    }

    public final void Yi7zF1RB1() {
        int i = this.Y6hRI1cF8 - 1;
        this.Y6hRI1cF8 = i;
        if (i < 0) {
            Log.e("ComposeViewContext", "View count has dropped below 0");
            this.Y6hRI1cF8 = 0;
        }
        if (this.Y6hRI1cF8 == 0) {
            View view = this.GWasM1elztuh;
            Context context = view.getContext();
            re reVar = this.cilMamHF;
            context.unregisterComponentCallbacks(reVar);
            this.mE4lRynR.getClass();
            view.getViewTreeObserver().removeOnWindowFocusChangeListener(reVar);
        }
    }

    public final void xqGvceK5x(Configuration configuration) {
        int updateFrom = this.encWxUiV2.updateFrom(configuration);
        if (updateFrom != 0) {
            Iterator it = this.EljAMC1QTz.GWasM1elztuh.entrySet().iterator();
            while (it.hasNext()) {
                if (((WeakReference) ((Map.Entry) it.next()).getValue()).get() != null) {
                    o4.YmKjaVtbfp5Z();
                    return;
                }
                it.remove();
            }
            this.mOu10nynGul.setValue(new Configuration(configuration));
            j6IIN2O8eOU j6iin2o8eou = this.AvO7iQsrTN;
            synchronized (j6iin2o8eou) {
                ((rf0) j6iin2o8eou.EljAMC1QTz).X1lG3V04pd();
            }
            if ((268435456 & updateFrom) != 0) {
                this.iwATDS1i01k.setValue(n30.Y6hRI1cF8(this.GWasM1elztuh.getContext()));
            }
            if (((-1342235264) & updateFrom) != 0) {
                this.mE4lRynR.getClass();
            }
        }
    }
}
