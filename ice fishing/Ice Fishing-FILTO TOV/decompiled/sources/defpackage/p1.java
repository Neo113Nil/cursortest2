package defpackage;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.LinkedHashMap;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class p1 extends he0 implements ef, go, l50 {
    public kv0 EXrPz3p7hFb;
    public float WRKkgoJXwDn;
    public ra WdrkLMV3xh;
    public final float Y6hRI1cF8;
    public final j6IIN2O8eOU cilMamHF;
    public final boolean jivtDDk9H;
    public jv0 k8h8IjolWQ;
    public final zk lv06NcmrQ;
    public final tf0 mE4lRynR;
    public boolean pog2g9KITJA;
    public long arNh8D4Z5gB = 0;
    public final ag0 M3K9sHhK = new ag0();

    public p1(tf0 tf0Var, boolean z, float f, j6IIN2O8eOU j6iin2o8eou, zk zkVar) {
        this.mE4lRynR = tf0Var;
        this.jivtDDk9H = z;
        this.Y6hRI1cF8 = f;
        this.cilMamHF = j6iin2o8eou;
        this.lv06NcmrQ = zkVar;
    }

    @Override // defpackage.go
    public final void DmJncFq5(i60 i60Var) {
        u9 u9Var = i60Var.OOA6hdeuvCS;
        i60Var.GWasM1elztuh();
        ra raVar = this.WdrkLMV3xh;
        if (raVar != null) {
            float f = this.WRKkgoJXwDn;
            long JFJ3QoxA = this.cilMamHF.JFJ3QoxA();
            float floatValue = ((Number) ((g2) raVar.X1lG3V04pd).xqGvceK5x()).floatValue();
            if (floatValue > 0.0f) {
                long Yi7zF1RB1 = yb.Yi7zF1RB1(floatValue, JFJ3QoxA);
                if (raVar.GWasM1elztuh) {
                    float intBitsToFloat = Float.intBitsToFloat((int) (u9Var.xqGvceK5x() >> 32));
                    float intBitsToFloat2 = Float.intBitsToFloat((int) (u9Var.xqGvceK5x() & 4294967295L));
                    f4 f4Var = u9Var.EljAMC1QTz;
                    long mOu10nynGul = f4Var.mOu10nynGul();
                    f4Var.EljAMC1QTz().E7jCp8Ls();
                    try {
                        ((f4) ((j6IIN2O8eOU) f4Var.Yi7zF1RB1).EljAMC1QTz).EljAMC1QTz().EljAMC1QTz(0.0f, 0.0f, intBitsToFloat, intBitsToFloat2, 1);
                        ho.JB4pnjMK(i60Var, Yi7zF1RB1, f, 0L, 0.0f, null, 124);
                    } finally {
                        f4Var.EljAMC1QTz().JFJ3QoxA();
                        f4Var.jivtDDk9H(mOu10nynGul);
                    }
                } else {
                    ho.JB4pnjMK(i60Var, Yi7zF1RB1, f, 0L, 0.0f, null, 124);
                }
            }
        }
        s9 EljAMC1QTz = u9Var.EljAMC1QTz.EljAMC1QTz();
        kv0 kv0Var = this.EXrPz3p7hFb;
        if (kv0Var != null) {
            long j = this.arNh8D4Z5gB;
            int MZhzXH72 = vc0.MZhzXH72(this.WRKkgoJXwDn);
            long JFJ3QoxA2 = this.cilMamHF.JFJ3QoxA();
            this.lv06NcmrQ.GWasM1elztuh();
            kv0Var.OOA6hdeuvCS(MZhzXH72, j, JFJ3QoxA2);
            kv0Var.draw(ddkiCTz5mZ.GWasM1elztuh(EljAMC1QTz));
        }
    }

    @Override // defpackage.he0
    public final boolean UjhVk5crk() {
        return false;
    }

    @Override // defpackage.l50, defpackage.ed0
    public final void X1lG3V04pd(long j) {
        float jivtDDk9H;
        this.pog2g9KITJA = true;
        el elVar = vc0.eUH21U3apd(this).M3K9sHhK;
        this.arNh8D4Z5gB = o30.CMh55RymNfS(j);
        float f = this.Y6hRI1cF8;
        if (Float.isNaN(f)) {
            long j2 = this.arNh8D4Z5gB;
            float intBitsToFloat = Float.intBitsToFloat((int) (j2 >> 32));
            float intBitsToFloat2 = Float.intBitsToFloat((int) (j2 & 4294967295L));
            jivtDDk9H = uk0.X1lG3V04pd((Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L) | (Float.floatToRawIntBits(intBitsToFloat) << 32)) / 2.0f;
            if (this.jivtDDk9H) {
                jivtDDk9H += elVar.jivtDDk9H(10.0f);
            }
        } else {
            jivtDDk9H = elVar.jivtDDk9H(f);
        }
        this.WRKkgoJXwDn = jivtDDk9H;
        ag0 ag0Var = this.M3K9sHhK;
        Object[] objArr = ag0Var.GWasM1elztuh;
        int i = ag0Var.Yi7zF1RB1;
        for (int i2 = 0; i2 < i; i2++) {
            gqMuANyCes((xr0) objArr[i2]);
        }
        ag0Var.xqGvceK5x();
    }

    @Override // defpackage.he0
    public final void bCsSzSHkbaQ() {
        jv0 jv0Var = this.k8h8IjolWQ;
        if (jv0Var != null) {
            this.EXrPz3p7hFb = null;
            p.uFEq9NpZ(this);
            d dVar = jv0Var.encWxUiV2;
            kv0 kv0Var = (kv0) ((LinkedHashMap) dVar.EljAMC1QTz).get(this);
            if (kv0Var != null) {
                kv0Var.X1lG3V04pd();
                LinkedHashMap linkedHashMap = (LinkedHashMap) dVar.EljAMC1QTz;
                kv0 kv0Var2 = (kv0) linkedHashMap.get(this);
                if (kv0Var2 != null) {
                }
                linkedHashMap.remove(this);
                jv0Var.AvO7iQsrTN.add(kv0Var);
            }
        }
    }

    @Override // defpackage.he0
    public final void cTIXpaxc() {
        fb1.MZhzXH72(oFzb77RX3H8t(), null, new xqGvceK5x(this, null, 20), 3);
    }

    public final void gqMuANyCes(xr0 xr0Var) {
        kv0 kv0Var;
        if (!(xr0Var instanceof vr0)) {
            if (xr0Var instanceof wr0) {
                kv0 kv0Var2 = this.EXrPz3p7hFb;
                if (kv0Var2 != null) {
                    kv0Var2.xqGvceK5x();
                    return;
                }
                return;
            }
            if (!(xr0Var instanceof ur0) || (kv0Var = this.EXrPz3p7hFb) == null) {
                return;
            }
            kv0Var.xqGvceK5x();
            return;
        }
        vr0 vr0Var = (vr0) xr0Var;
        long j = this.arNh8D4Z5gB;
        float f = this.WRKkgoJXwDn;
        jv0 jv0Var = this.k8h8IjolWQ;
        int i = 0;
        if (jv0Var == null) {
            Object obj = (View) o30.Mjvvu5DE(this, r.EljAMC1QTz);
            while (!(obj instanceof ViewGroup)) {
                Object parent = ((View) obj).getParent();
                if (!(parent instanceof View)) {
                    o4.iwATDS1i01k("Couldn't find a valid parent for ", obj, ". Are you overriding LocalView and providing a View that is not attached to the view hierarchy?");
                    return;
                }
                obj = parent;
            }
            ViewGroup viewGroup = (ViewGroup) obj;
            int childCount = viewGroup.getChildCount();
            int i2 = 0;
            while (true) {
                if (i2 >= childCount) {
                    jv0 jv0Var2 = new jv0(viewGroup.getContext());
                    viewGroup.addView(jv0Var2);
                    jv0Var = jv0Var2;
                    break;
                } else {
                    View childAt = viewGroup.getChildAt(i2);
                    if (childAt instanceof jv0) {
                        jv0Var = (jv0) childAt;
                        break;
                    }
                    i2++;
                }
            }
            this.k8h8IjolWQ = jv0Var;
        }
        ArrayList arrayList = jv0Var.EljAMC1QTz;
        d dVar = jv0Var.encWxUiV2;
        LinkedHashMap linkedHashMap = (LinkedHashMap) dVar.EljAMC1QTz;
        LinkedHashMap linkedHashMap2 = (LinkedHashMap) dVar.EljAMC1QTz;
        LinkedHashMap linkedHashMap3 = (LinkedHashMap) dVar.AvO7iQsrTN;
        kv0 kv0Var3 = (kv0) linkedHashMap.get(this);
        if (kv0Var3 == null) {
            ArrayList arrayList2 = jv0Var.AvO7iQsrTN;
            arrayList2.getClass();
            kv0Var3 = (kv0) (arrayList2.isEmpty() ? null : arrayList2.remove(0));
            if (kv0Var3 == null) {
                if (jv0Var.mOu10nynGul > fb1.EXrPz3p7hFb(arrayList)) {
                    kv0Var3 = new kv0(jv0Var.getContext());
                    jv0Var.addView(kv0Var3);
                    arrayList.add(kv0Var3);
                } else {
                    kv0Var3 = (kv0) arrayList.get(jv0Var.mOu10nynGul);
                    p1 p1Var = (p1) linkedHashMap3.get(kv0Var3);
                    if (p1Var != null) {
                        p1Var.EXrPz3p7hFb = null;
                        p.uFEq9NpZ(p1Var);
                        kv0 kv0Var4 = (kv0) linkedHashMap2.get(p1Var);
                        if (kv0Var4 != null) {
                        }
                        linkedHashMap2.remove(p1Var);
                        kv0Var3.X1lG3V04pd();
                    }
                }
                int i3 = jv0Var.mOu10nynGul;
                if (i3 < jv0Var.OOA6hdeuvCS - 1) {
                    jv0Var.mOu10nynGul = i3 + 1;
                } else {
                    jv0Var.mOu10nynGul = 0;
                }
            }
            linkedHashMap2.put(this, kv0Var3);
            linkedHashMap3.put(kv0Var3, this);
        }
        int MZhzXH72 = vc0.MZhzXH72(f);
        long JFJ3QoxA = this.cilMamHF.JFJ3QoxA();
        this.lv06NcmrQ.GWasM1elztuh();
        kv0 kv0Var5 = kv0Var3;
        kv0Var5.Yi7zF1RB1(vr0Var, this.jivtDDk9H, j, MZhzXH72, JFJ3QoxA, new o1(i, this));
        this.EXrPz3p7hFb = kv0Var5;
        p.uFEq9NpZ(this);
    }
}
