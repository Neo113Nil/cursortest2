package defpackage;

import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public class bb extends yk implements nq0, y40, b01, va1, ef, sk0, g10, ey {
    public static final k61 VeqTn1PQw7 = new k61(6);
    public vr0 A1EKNP6CxJ;
    public vz AEn1Rrio;
    public boolean DmJncFq5;
    public xk EXrPz3p7hFb;
    public f51 HFYAaqMd6;
    public w00 M3K9sHhK;
    public tf0 MZhzXH72;
    public kq0 TpUsjqg3bxO;
    public boolean WRKkgoJXwDn;
    public ov0 WdrkLMV3xh;
    public tf0 Y6hRI1cF8;
    public final vf0 YZjbz8VdP5;
    public wu arNh8D4Z5gB;
    public w00 cilMamHF;
    public y00 dqB83aoLBB;
    public long eUH21U3apd;
    public fy k8h8IjolWQ;
    public boolean lv06NcmrQ;
    public vr0 ozMwhSAI;
    public final ut pog2g9KITJA;
    public final k61 rezfBrjOrqK;

    public bb(tf0 tf0Var, w00 w00Var, boolean z, boolean z2, ov0 ov0Var, wu wuVar) {
        this.Y6hRI1cF8 = tf0Var;
        this.cilMamHF = w00Var;
        this.lv06NcmrQ = z;
        this.WdrkLMV3xh = ov0Var;
        this.WRKkgoJXwDn = z2;
        this.arNh8D4Z5gB = wuVar;
        this.pog2g9KITJA = new ut(tf0Var, new OOA6hdeuvCS(1, this, bb.class, "onFocusChange", "onFocusChange(Z)V", 0, 0, 0));
        int i = ob0.GWasM1elztuh;
        this.YZjbz8VdP5 = new vf0(6);
        this.eUH21U3apd = 0L;
        tf0 tf0Var2 = this.Y6hRI1cF8;
        this.MZhzXH72 = tf0Var2;
        this.DmJncFq5 = tf0Var2 == null;
        this.rezfBrjOrqK = VeqTn1PQw7;
    }

    @Override // defpackage.va1
    public final Object E7jCp8Ls() {
        return this.rezfBrjOrqK;
    }

    @Override // defpackage.b01
    public final boolean JFXS9W1rB5s4() {
        return true;
    }

    @Override // defpackage.g10
    public final void M3K9sHhK(x0 x0Var, hq0 hq0Var) {
        tf0 tf0Var;
        ArrayList arrayList = (ArrayList) x0Var.Yi7zF1RB1;
        d5idzIhj55b();
        if (this.WRKkgoJXwDn && this.k8h8IjolWQ == null) {
            fy fyVar = new fy(this);
            gqMuANyCes(fyVar);
            this.k8h8IjolWQ = fyVar;
        }
        if (hq0Var != hq0.EljAMC1QTz) {
            if (hq0Var != hq0.AvO7iQsrTN || this.dqB83aoLBB == null) {
                return;
            }
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                y00 y00Var = (y00) arrayList.get(i);
                if (y00Var.mOu10nynGul && y00Var != this.dqB83aoLBB) {
                    OGdJP42E(true);
                    return;
                }
            }
            return;
        }
        vg vgVar = null;
        if (this.dqB83aoLBB == null) {
            int size2 = arrayList.size();
            for (int i2 = 0; i2 < size2; i2++) {
                if (fb1.YmKjaVtbfp5Z((y00) arrayList.get(i2))) {
                    y00 y00Var2 = (y00) arrayList.get(0);
                    y00Var2.mOu10nynGul = true;
                    this.dqB83aoLBB = y00Var2;
                    if (!this.WRKkgoJXwDn || (tf0Var = this.Y6hRI1cF8) == null) {
                        return;
                    }
                    vr0 vr0Var = new vr0(y00Var2.X1lG3V04pd);
                    nt0 nt0Var = new nt0();
                    w60.arNh8D4Z5gB(this, fy.jivtDDk9H, new yw(new X1lG3V04pd(5, y00Var2, nt0Var), 1));
                    if (!nt0Var.OOA6hdeuvCS) {
                        int i3 = cb.Yi7zF1RB1;
                        if (!this.OOA6hdeuvCS.Mjvvu5DE) {
                            t10.Yi7zF1RB1("Cannot get View because the Modifier node is not currently attached.");
                        }
                        ViewParent parent = ((View) j60.GWasM1elztuh(vc0.eUH21U3apd(this))).getParent();
                        while (parent != null && (parent instanceof ViewGroup)) {
                            ViewGroup viewGroup = (ViewGroup) parent;
                            if (!viewGroup.shouldDelayChildPressedState()) {
                                parent = viewGroup.getParent();
                            }
                        }
                        this.A1EKNP6CxJ = vr0Var;
                        fb1.MZhzXH72(oFzb77RX3H8t(), null, new encWxUiV2(tf0Var, vr0Var, null, 1), 3);
                        return;
                    }
                    this.HFYAaqMd6 = fb1.MZhzXH72(oFzb77RX3H8t(), null, new mOu10nynGul(tf0Var, vr0Var, this, vgVar, 0), 3);
                    return;
                }
            }
            return;
        }
        int size3 = arrayList.size();
        for (int i4 = 0; i4 < size3; i4++) {
            y00 y00Var3 = (y00) arrayList.get(i4);
            if (y00Var3.mOu10nynGul || !y00Var3.encWxUiV2 || y00Var3.xqGvceK5x) {
                float Yi7zF1RB1 = ((qe1) o30.Mjvvu5DE(this, kf.jivtDDk9H)).Yi7zF1RB1();
                int size4 = arrayList.size();
                for (int i5 = 0; i5 < size4; i5++) {
                    y00 y00Var4 = (y00) arrayList.get(i5);
                    long j = y00Var4.X1lG3V04pd;
                    y00 y00Var5 = this.dqB83aoLBB;
                    y00Var5.getClass();
                    boolean z = Math.abs(uk0.X1lG3V04pd(uk0.xqGvceK5x(j, y00Var5.X1lG3V04pd))) > Yi7zF1RB1;
                    if (y00Var4.mOu10nynGul || z) {
                        OGdJP42E(true);
                        return;
                    }
                }
                return;
            }
        }
        ((y00) arrayList.get(0)).mOu10nynGul = true;
        if (this.WRKkgoJXwDn) {
            y00 y00Var6 = this.dqB83aoLBB;
            y00Var6.getClass();
            fX9rg6CD(y00Var6.X1lG3V04pd, true);
            this.arNh8D4Z5gB.GWasM1elztuh();
        }
        this.dqB83aoLBB = null;
    }

    public final void OGdJP42E(boolean z) {
        vg vgVar = null;
        if (z) {
            this.dqB83aoLBB = null;
        } else {
            this.TpUsjqg3bxO = null;
        }
        tf0 tf0Var = this.Y6hRI1cF8;
        if (tf0Var != null) {
            f51 f51Var = this.HFYAaqMd6;
            if (f51Var == null || !f51Var.Yi7zF1RB1()) {
                vr0 vr0Var = z ? this.A1EKNP6CxJ : this.ozMwhSAI;
                if (vr0Var != null) {
                    ur0 ur0Var = new ur0(vr0Var);
                    f40 f40Var = (f40) ((ug) oFzb77RX3H8t()).OOA6hdeuvCS.E7jCp8Ls(b9xEq24R1.VeqTn1PQw7);
                    fb1.MZhzXH72(oFzb77RX3H8t(), null, new EljAMC1QTz(tf0Var, ur0Var, f40Var != null ? f40Var.Mjvvu5DE(new X1lG3V04pd(0, tf0Var, ur0Var)) : null, vgVar, 0), 3);
                }
            } else {
                f51 f51Var2 = this.HFYAaqMd6;
                if (f51Var2 != null) {
                    f51Var2.GWasM1elztuh(null);
                }
            }
            if (z) {
                this.A1EKNP6CxJ = null;
            } else {
                this.ozMwhSAI = null;
            }
        }
    }

    @Override // defpackage.he0
    public final boolean UjhVk5crk() {
        return false;
    }

    @Override // defpackage.b01
    public final void Uxq83abb04(l01 l01Var) {
        ov0 ov0Var = this.WdrkLMV3xh;
        if (ov0Var != null) {
            j01.GWasM1elztuh(l01Var, ov0Var.GWasM1elztuh);
        }
        Yi7zF1RB1 yi7zF1RB1 = new Yi7zF1RB1(this, 1);
        u40[] u40VarArr = j01.GWasM1elztuh;
        l01Var.GWasM1elztuh(yz0.Yi7zF1RB1, new VeqTn1PQw7(null, yi7zF1RB1));
        if (this.WRKkgoJXwDn) {
            this.pog2g9KITJA.Uxq83abb04(l01Var);
        } else {
            l01Var.GWasM1elztuh(h01.JFJ3QoxA, kc1.GWasM1elztuh);
        }
        Hc2GqxcqBiX(l01Var);
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x00cd, code lost:
    
        if (((r7 & ((~r7) << 6)) & r14) == 0) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00cf, code lost:
    
        r16 = -1;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.y40
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean VeqTn1PQw7(KeyEvent keyEvent) {
        boolean z;
        int i;
        Object obj;
        d5idzIhj55b();
        long OOA6hdeuvCS = rj0.OOA6hdeuvCS(keyEvent.getKeyCode());
        boolean z2 = this.WRKkgoJXwDn;
        vf0 vf0Var = this.YZjbz8VdP5;
        int i2 = 1;
        if (z2 && vc0.lv06NcmrQ(keyEvent) == 2 && rj0.k8h8IjolWQ(keyEvent)) {
            if (!vf0Var.Yi7zF1RB1(OOA6hdeuvCS)) {
                vr0 vr0Var = new vr0(this.eUH21U3apd);
                vf0Var.EljAMC1QTz(OOA6hdeuvCS, vr0Var);
                if (this.Y6hRI1cF8 == null) {
                    return true;
                }
                fb1.MZhzXH72(oFzb77RX3H8t(), null, new JFJ3QoxA(this, vr0Var, null, 2), 3);
                return true;
            }
        } else if (this.WRKkgoJXwDn && vc0.lv06NcmrQ(keyEvent) == 1 && rj0.k8h8IjolWQ(keyEvent)) {
            vf0Var.getClass();
            int hashCode = Long.hashCode(OOA6hdeuvCS) * (-862048943);
            int i3 = hashCode ^ (hashCode << 16);
            int i4 = i3 & 127;
            int i5 = vf0Var.xqGvceK5x;
            int i6 = (i3 >>> 7) & i5;
            int i7 = 0;
            loop0: while (true) {
                long[] jArr = vf0Var.GWasM1elztuh;
                int i8 = i6 >> 3;
                int i9 = (i6 & 7) << 3;
                z = i2;
                long j = (((-i9) >> 63) & (jArr[i8 + i2] << (64 - i9))) | (jArr[i8] >>> i9);
                long j2 = (i4 * 72340172838076673L) ^ j;
                long j3 = -9187201950435737472L;
                long j4 = (~j2) & (j2 - 72340172838076673L) & (-9187201950435737472L);
                while (true) {
                    if (j4 == 0) {
                        break;
                    }
                    i = (i6 + (Long.numberOfTrailingZeros(j4) >> 3)) & i5;
                    long j5 = j3;
                    if (vf0Var.Yi7zF1RB1[i] == OOA6hdeuvCS) {
                        break loop0;
                    }
                    j4 &= j4 - 1;
                    j3 = j5;
                }
                i7 += 8;
                i6 = (i6 + i7) & i5;
                i2 = z ? 1 : 0;
            }
            if (i >= 0) {
                vf0Var.OOA6hdeuvCS--;
                long[] jArr2 = vf0Var.GWasM1elztuh;
                int i10 = vf0Var.xqGvceK5x;
                int i11 = i >> 3;
                int i12 = (i & 7) << 3;
                long j6 = (jArr2[i11] & (~(255 << i12))) | (254 << i12);
                jArr2[i11] = j6;
                jArr2[(((i - 7) & i10) + (i10 & 7)) >> 3] = j6;
                Object[] objArr = vf0Var.X1lG3V04pd;
                obj = objArr[i];
                objArr[i] = null;
            } else {
                obj = null;
            }
            vr0 vr0Var2 = (vr0) obj;
            if (vr0Var2 != null) {
                if (this.Y6hRI1cF8 != null) {
                    fb1.MZhzXH72(oFzb77RX3H8t(), null, new JFJ3QoxA(this, vr0Var2, null, 3), 3);
                }
                this.arNh8D4Z5gB.GWasM1elztuh();
            }
            if (vr0Var2 != null) {
                return z;
            }
            return false;
        }
        return false;
    }

    @Override // defpackage.sk0
    public final void YZjbz8VdP5() {
        if (this.lv06NcmrQ) {
            w60.cilMamHF(this, new Yi7zF1RB1(this, 0));
        }
    }

    @Override // defpackage.he0
    public final void bCsSzSHkbaQ() {
        bfDgRvRIg();
        if (this.MZhzXH72 == null) {
            this.Y6hRI1cF8 = null;
        }
        xk xkVar = this.EXrPz3p7hFb;
        if (xkVar != null) {
            sb9fmtV8A(xkVar);
        }
        this.EXrPz3p7hFb = null;
        fy fyVar = this.k8h8IjolWQ;
        if (fyVar != null) {
            sb9fmtV8A(fyVar);
        }
        this.k8h8IjolWQ = null;
    }

    public final void bfDgRvRIg() {
        tf0 tf0Var = this.Y6hRI1cF8;
        vf0 vf0Var = this.YZjbz8VdP5;
        if (tf0Var != null) {
            vr0 vr0Var = this.ozMwhSAI;
            if (vr0Var != null) {
                tf0Var.Yi7zF1RB1(new ur0(vr0Var));
            }
            vr0 vr0Var2 = this.A1EKNP6CxJ;
            if (vr0Var2 != null) {
                tf0Var.Yi7zF1RB1(new ur0(vr0Var2));
            }
            vz vzVar = this.AEn1Rrio;
            if (vzVar != null) {
                tf0Var.Yi7zF1RB1(new wz(vzVar));
            }
            Object[] objArr = vf0Var.X1lG3V04pd;
            long[] jArr = vf0Var.GWasM1elztuh;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i = 0;
                while (true) {
                    long j = jArr[i];
                    if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i2 = 8 - ((~(i - length)) >>> 31);
                        for (int i3 = 0; i3 < i2; i3++) {
                            if ((255 & j) < 128) {
                                tf0Var.Yi7zF1RB1(new ur0((vr0) objArr[(i << 3) + i3]));
                            }
                            j >>= 8;
                        }
                        if (i2 != 8) {
                            break;
                        }
                    }
                    if (i == length) {
                        break;
                    } else {
                        i++;
                    }
                }
            }
        }
        this.ozMwhSAI = null;
        this.A1EKNP6CxJ = null;
        this.AEn1Rrio = null;
        vf0Var.GWasM1elztuh();
    }

    @Override // defpackage.he0
    public final void cTIXpaxc() {
        YZjbz8VdP5();
        if (!this.DmJncFq5) {
            d5idzIhj55b();
        }
        if (this.WRKkgoJXwDn) {
            gqMuANyCes(this.pog2g9KITJA);
        }
    }

    public final void d5idzIhj55b() {
        if (this.EXrPz3p7hFb != null) {
            return;
        }
        w00 w00Var = this.lv06NcmrQ ? this.M3K9sHhK : this.cilMamHF;
        if (w00Var != null) {
            if (this.Y6hRI1cF8 == null) {
                this.Y6hRI1cF8 = new tf0();
            }
            this.pog2g9KITJA.OGdJP42E(this.Y6hRI1cF8);
            tf0 tf0Var = this.Y6hRI1cF8;
            tf0Var.getClass();
            xk GWasM1elztuh = w00Var.GWasM1elztuh(tf0Var);
            gqMuANyCes(GWasM1elztuh);
            this.EXrPz3p7hFb = GWasM1elztuh;
        }
    }

    public final void fX9rg6CD(long j, boolean z) {
        tf0 tf0Var = this.Y6hRI1cF8;
        if (tf0Var != null) {
            f51 f51Var = this.HFYAaqMd6;
            if (f51Var == null || !f51Var.Yi7zF1RB1()) {
                vr0 vr0Var = z ? this.A1EKNP6CxJ : this.ozMwhSAI;
                if (vr0Var != null) {
                    fb1.MZhzXH72(oFzb77RX3H8t(), null, new encWxUiV2(vr0Var, tf0Var, null), 3);
                }
            } else {
                f51Var.GWasM1elztuh(null);
                fb1.MZhzXH72(oFzb77RX3H8t(), null, new AvO7iQsrTN(f51Var, j, tf0Var, null, 0), 3);
            }
            if (z) {
                this.A1EKNP6CxJ = null;
            } else {
                this.ozMwhSAI = null;
            }
        }
    }

    @Override // defpackage.g10
    public final void lv06NcmrQ() {
        OGdJP42E(true);
    }

    @Override // defpackage.nq0
    public final void mqNvfisv7() {
        vz vzVar;
        tf0 tf0Var = this.Y6hRI1cF8;
        if (tf0Var != null && (vzVar = this.AEn1Rrio) != null) {
            tf0Var.Yi7zF1RB1(new wz(vzVar));
        }
        this.AEn1Rrio = null;
        OGdJP42E(false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0065, code lost:
    
        if (r3.EXrPz3p7hFb == null) goto L37;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void oCbv4H4NsA(tf0 tf0Var, w00 w00Var, boolean z, boolean z2, ov0 ov0Var, wu wuVar) {
        boolean z3;
        xk xkVar;
        boolean z4 = true;
        if (o30.rQPn8YBR(this.MZhzXH72, tf0Var)) {
            z3 = false;
        } else {
            bfDgRvRIg();
            this.MZhzXH72 = tf0Var;
            this.Y6hRI1cF8 = tf0Var;
            z3 = true;
        }
        if (!o30.rQPn8YBR(this.cilMamHF, w00Var)) {
            this.cilMamHF = w00Var;
            z3 = true;
        }
        if (this.lv06NcmrQ != z) {
            this.lv06NcmrQ = z;
            if (z) {
                YZjbz8VdP5();
            }
            z3 = true;
        }
        boolean z5 = this.WRKkgoJXwDn;
        ut utVar = this.pog2g9KITJA;
        if (z5 != z2) {
            if (z2) {
                gqMuANyCes(utVar);
            } else {
                sb9fmtV8A(utVar);
                bfDgRvRIg();
            }
            l60.WIEu4Ya2g8(this);
            this.WRKkgoJXwDn = z2;
        }
        if (!o30.rQPn8YBR(this.WdrkLMV3xh, ov0Var)) {
            this.WdrkLMV3xh = ov0Var;
            l60.WIEu4Ya2g8(this);
        }
        this.arNh8D4Z5gB = wuVar;
        boolean z6 = this.DmJncFq5;
        tf0 tf0Var2 = this.MZhzXH72;
        if (z6 != (tf0Var2 == null)) {
            boolean z7 = tf0Var2 == null;
            this.DmJncFq5 = z7;
            if (!z7) {
            }
        }
        z4 = z3;
        if (z4 && ((xkVar = this.EXrPz3p7hFb) != null || !this.DmJncFq5)) {
            if (xkVar != null) {
                sb9fmtV8A(xkVar);
            }
            this.EXrPz3p7hFb = null;
            d5idzIhj55b();
        }
        utVar.OGdJP42E(this.Y6hRI1cF8);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.nq0
    public final void ozMwhSAI(gq0 gq0Var, hq0 hq0Var, long j) {
        boolean z;
        tf0 tf0Var;
        char c = ' ';
        long j2 = 4294967295L;
        long j3 = ((j >> 33) << 32) | (((j << 32) >> 33) & 4294967295L);
        this.eUH21U3apd = (Float.floatToRawIntBits((int) (j3 & 4294967295L)) & 4294967295L) | (Float.floatToRawIntBits((int) (j3 >> 32)) << 32);
        d5idzIhj55b();
        boolean z2 = this.WRKkgoJXwDn;
        hq0 hq0Var2 = hq0.EljAMC1QTz;
        vg vgVar = null;
        int i = 1;
        int i2 = 0;
        if (z2) {
            if (this.k8h8IjolWQ == null) {
                fy fyVar = new fy(this);
                gqMuANyCes(fyVar);
                this.k8h8IjolWQ = fyVar;
            }
            if (hq0Var == hq0Var2) {
                int i3 = gq0Var.X1lG3V04pd;
                if (i3 == 4) {
                    fb1.MZhzXH72(oFzb77RX3H8t(), null, new rQPn8YBR(this, vgVar, i2), 3);
                } else if (i3 == 5) {
                    fb1.MZhzXH72(oFzb77RX3H8t(), null, new rQPn8YBR(this, vgVar, i), 3);
                }
            }
        }
        if (hq0Var != hq0Var2) {
            if (hq0Var != hq0.AvO7iQsrTN || this.TpUsjqg3bxO == null) {
                return;
            }
            List list = gq0Var.GWasM1elztuh;
            int size = list.size();
            for (int i4 = 0; i4 < size; i4++) {
                kq0 kq0Var = (kq0) list.get(i4);
                if (kq0Var.Yi7zF1RB1() && kq0Var != this.TpUsjqg3bxO) {
                    OGdJP42E(false);
                    return;
                }
            }
            return;
        }
        if (this.TpUsjqg3bxO == null) {
            if (z50.mE4lRynR(gq0Var, true)) {
                kq0 kq0Var2 = (kq0) gq0Var.GWasM1elztuh.get(0);
                kq0Var2.GWasM1elztuh();
                this.TpUsjqg3bxO = kq0Var2;
                if (!this.WRKkgoJXwDn || (tf0Var = this.Y6hRI1cF8) == null) {
                    return;
                }
                vr0 vr0Var = new vr0(kq0Var2.X1lG3V04pd);
                nt0 nt0Var = new nt0();
                w60.arNh8D4Z5gB(this, fy.jivtDDk9H, new yw(new X1lG3V04pd(6, kq0Var2, nt0Var), 1));
                if (!nt0Var.OOA6hdeuvCS) {
                    int i5 = cb.Yi7zF1RB1;
                    if (!this.OOA6hdeuvCS.Mjvvu5DE) {
                        t10.Yi7zF1RB1("Cannot get View because the Modifier node is not currently attached.");
                    }
                    ViewParent parent = ((View) j60.GWasM1elztuh(vc0.eUH21U3apd(this))).getParent();
                    while (parent != null && (parent instanceof ViewGroup)) {
                        ViewGroup viewGroup = (ViewGroup) parent;
                        if (!viewGroup.shouldDelayChildPressedState()) {
                            parent = viewGroup.getParent();
                        }
                    }
                    this.ozMwhSAI = vr0Var;
                    fb1.MZhzXH72(oFzb77RX3H8t(), null, new encWxUiV2(tf0Var, vr0Var, null, 2), 3);
                    return;
                }
                this.HFYAaqMd6 = fb1.MZhzXH72(oFzb77RX3H8t(), null, new mOu10nynGul(tf0Var, vr0Var, this, vgVar, 1), 3);
                return;
            }
            return;
        }
        List list2 = gq0Var.GWasM1elztuh;
        int size2 = list2.size();
        int i6 = 0;
        while (i6 < size2) {
            kq0 kq0Var3 = (kq0) list2.get(i6);
            if (((kq0Var3.Yi7zF1RB1() || !kq0Var3.encWxUiV2 || kq0Var3.xqGvceK5x) ? 0 : i) == 0) {
                long CMh55RymNfS = vc0.eUH21U3apd(this).M3K9sHhK.CMh55RymNfS(((qe1) o30.Mjvvu5DE(this, kf.jivtDDk9H)).X1lG3V04pd());
                long floatToRawIntBits = (Float.floatToRawIntBits(Math.max(0.0f, Float.intBitsToFloat((int) (CMh55RymNfS & j2)) - ((int) (j & j2))) / 2.0f) & j2) | (Float.floatToRawIntBits(Math.max(0.0f, Float.intBitsToFloat((int) (CMh55RymNfS >> c)) - ((int) (j >> c))) / 2.0f) << c);
                int size3 = list2.size();
                int i7 = 0;
                while (i7 < size3) {
                    kq0 kq0Var4 = (kq0) list2.get(i7);
                    if (kq0Var4.Yi7zF1RB1()) {
                        z = i2;
                    } else {
                        int i8 = kq0Var4.mOu10nynGul == i ? i : i2;
                        long j4 = kq0Var4.X1lG3V04pd;
                        char c2 = c;
                        float intBitsToFloat = Float.intBitsToFloat((int) (j4 >> c2));
                        float intBitsToFloat2 = Float.intBitsToFloat((int) (j4 & j2));
                        float f = i8;
                        float intBitsToFloat3 = Float.intBitsToFloat((int) (floatToRawIntBits >> c2)) * f;
                        long j5 = j2;
                        float f2 = ((int) (j >> c2)) + intBitsToFloat3;
                        float intBitsToFloat4 = Float.intBitsToFloat((int) (floatToRawIntBits & j5)) * f;
                        if ((((intBitsToFloat > f2) | (intBitsToFloat < (-intBitsToFloat3))) || (intBitsToFloat2 < (-intBitsToFloat4))) || (intBitsToFloat2 > ((int) (j & j5)) + intBitsToFloat4)) {
                            z = 0;
                        } else {
                            i7++;
                            j2 = j5;
                            c = ' ';
                            i = 1;
                            i2 = 0;
                        }
                    }
                    OGdJP42E(z);
                    return;
                }
                return;
            }
            i6++;
            j2 = j2;
            c = ' ';
            i = 1;
        }
        ((kq0) list2.get(0)).GWasM1elztuh();
        if (this.WRKkgoJXwDn) {
            kq0 kq0Var5 = this.TpUsjqg3bxO;
            kq0Var5.getClass();
            fX9rg6CD(kq0Var5.X1lG3V04pd, false);
            this.arNh8D4Z5gB.GWasM1elztuh();
        }
        this.TpUsjqg3bxO = null;
    }

    public void Hc2GqxcqBiX(l01 l01Var) {
    }
}
