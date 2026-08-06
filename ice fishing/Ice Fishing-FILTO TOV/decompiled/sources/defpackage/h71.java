package defpackage;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class h71 extends he0 implements oq0, el, nq0 {
    public final rg0 WRKkgoJXwDn;
    public final rg0 WdrkLMV3xh;
    public PointerInputEventHandler Y6hRI1cF8;
    public final rg0 arNh8D4Z5gB;
    public f51 cilMamHF;
    public Object jivtDDk9H;
    public gq0 lv06NcmrQ = f71.GWasM1elztuh;
    public Object mE4lRynR;
    public gq0 pog2g9KITJA;

    public h71(Object obj, Object obj2, PointerInputEventHandler pointerInputEventHandler) {
        this.mE4lRynR = obj;
        this.jivtDDk9H = obj2;
        this.Y6hRI1cF8 = pointerInputEventHandler;
        rg0 rg0Var = new rg0(new g71[16]);
        this.WdrkLMV3xh = rg0Var;
        this.WRKkgoJXwDn = rg0Var;
        this.arNh8D4Z5gB = new rg0(new g71[16]);
    }

    @Override // defpackage.xk
    public final void GWasM1elztuh() {
        sb9fmtV8A();
    }

    @Override // defpackage.nq0
    public final void J3Xc8BaqpN8() {
        sb9fmtV8A();
    }

    @Override // defpackage.el
    public final float Yi7zF1RB1() {
        return vc0.eUH21U3apd(this).M3K9sHhK.Yi7zF1RB1();
    }

    @Override // defpackage.he0
    public final void bCsSzSHkbaQ() {
        sb9fmtV8A();
    }

    public final void gqMuANyCes(gq0 gq0Var, hq0 hq0Var) {
        n9 n9Var;
        n9 n9Var2;
        synchronized (this.WRKkgoJXwDn) {
            rg0 rg0Var = this.arNh8D4Z5gB;
            rg0Var.X1lG3V04pd(rg0Var.AvO7iQsrTN, this.WdrkLMV3xh);
        }
        try {
            int ordinal = hq0Var.ordinal();
            if (ordinal != 0) {
                if (ordinal == 1) {
                    rg0 rg0Var2 = this.arNh8D4Z5gB;
                    int i = rg0Var2.AvO7iQsrTN - 1;
                    Object[] objArr = rg0Var2.OOA6hdeuvCS;
                    if (i < objArr.length) {
                        while (i >= 0) {
                            g71 g71Var = (g71) objArr[i];
                            if (hq0Var == g71Var.encWxUiV2 && (n9Var2 = g71Var.AvO7iQsrTN) != null) {
                                g71Var.AvO7iQsrTN = null;
                                n9Var2.AvO7iQsrTN(gq0Var);
                            }
                            i--;
                        }
                    }
                    this.arNh8D4Z5gB.AvO7iQsrTN();
                }
                if (ordinal != 2) {
                    throw new vc();
                }
            }
            rg0 rg0Var3 = this.arNh8D4Z5gB;
            Object[] objArr2 = rg0Var3.OOA6hdeuvCS;
            int i2 = rg0Var3.AvO7iQsrTN;
            for (int i3 = 0; i3 < i2; i3++) {
                g71 g71Var2 = (g71) objArr2[i3];
                if (hq0Var == g71Var2.encWxUiV2 && (n9Var = g71Var2.AvO7iQsrTN) != null) {
                    g71Var2.AvO7iQsrTN = null;
                    n9Var.AvO7iQsrTN(gq0Var);
                }
            }
            this.arNh8D4Z5gB.AvO7iQsrTN();
        } catch (Throwable th) {
            this.arNh8D4Z5gB.AvO7iQsrTN();
            throw th;
        }
    }

    @Override // defpackage.el
    public final float mOu10nynGul() {
        return vc0.eUH21U3apd(this).M3K9sHhK.mOu10nynGul();
    }

    @Override // defpackage.nq0
    public final void mqNvfisv7() {
        gq0 gq0Var = this.pog2g9KITJA;
        if (gq0Var == null) {
            return;
        }
        List list = gq0Var.GWasM1elztuh;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (((kq0) list.get(i)).xqGvceK5x) {
                ArrayList arrayList = new ArrayList(list.size());
                int size2 = list.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    kq0 kq0Var = (kq0) list.get(i2);
                    long j = kq0Var.GWasM1elztuh;
                    long j2 = kq0Var.X1lG3V04pd;
                    long j3 = kq0Var.Yi7zF1RB1;
                    float f = kq0Var.OOA6hdeuvCS;
                    boolean z = kq0Var.xqGvceK5x;
                    arrayList.add(new kq0(j, j3, j2, false, f, j3, j2, z, z, kq0Var.mOu10nynGul, 0L, 1.0f, 0L));
                }
                gq0 gq0Var2 = new gq0(arrayList, null);
                this.lv06NcmrQ = gq0Var2;
                gqMuANyCes(gq0Var2, hq0.OOA6hdeuvCS);
                gqMuANyCes(gq0Var2, hq0.EljAMC1QTz);
                gqMuANyCes(gq0Var2, hq0.AvO7iQsrTN);
                this.pog2g9KITJA = null;
                return;
            }
        }
    }

    @Override // defpackage.nq0
    public final void ozMwhSAI(gq0 gq0Var, hq0 hq0Var, long j) {
        if (hq0Var == hq0.OOA6hdeuvCS) {
            this.lv06NcmrQ = gq0Var;
        }
        vg vgVar = null;
        if (this.cilMamHF == null) {
            this.cilMamHF = fb1.MZhzXH72(oFzb77RX3H8t(), null, new xj(this, vgVar, 7), 1);
        }
        gqMuANyCes(gq0Var, hq0Var);
        List list = gq0Var.GWasM1elztuh;
        int size = list.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                gq0Var = null;
                break;
            } else if (!d70.rQPn8YBR((kq0) list.get(i))) {
                break;
            } else {
                i++;
            }
        }
        this.pog2g9KITJA = gq0Var;
    }

    public final void sb9fmtV8A() {
        f51 f51Var = this.cilMamHF;
        if (f51Var != null) {
            f51Var.M3K9sHhK(new le0("Pointer input was reset", 2));
            this.cilMamHF = null;
        }
    }
}
