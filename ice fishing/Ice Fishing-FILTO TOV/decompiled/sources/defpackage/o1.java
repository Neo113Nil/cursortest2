package defpackage;

import android.content.Context;
import android.os.Bundle;
import com.combinations.level.experts.core.domain.model.Side;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final /* synthetic */ class o1 implements wu {
    public final /* synthetic */ Object EljAMC1QTz;
    public final /* synthetic */ int OOA6hdeuvCS;

    public /* synthetic */ o1(int i, Object obj) {
        this.OOA6hdeuvCS = i;
        this.EljAMC1QTz = obj;
    }

    @Override // defpackage.wu
    public final Object GWasM1elztuh() {
        Object obj;
        boolean z;
        boolean z2;
        boolean z3 = true;
        switch (this.OOA6hdeuvCS) {
            case 0:
                p.uFEq9NpZ((p1) this.EljAMC1QTz);
                return kc1.GWasM1elztuh;
            case 1:
                File file = (File) this.EljAMC1QTz;
                synchronized (mr.xqGvceK5x) {
                    mr.X1lG3V04pd.remove(file.getAbsolutePath());
                }
                return kc1.GWasM1elztuh;
            case 2:
                return Float.valueOf(q70.YmKjaVtbfp5Z(((ph) this.EljAMC1QTz).EljAMC1QTz()));
            case nr0.INTEGER_FIELD_NUMBER /* 3 */:
                return Integer.valueOf(((u80) this.EljAMC1QTz).AvO7iQsrTN().uFEq9NpZ);
            case 4:
                hh0 hh0Var = ((fh0) this.EljAMC1QTz).E7jCp8Ls;
                if (!hh0Var.mOu10nynGul) {
                    o4.jivtDDk9H("You cannot access the NavBackStackEntry's SavedStateHandle until it is added to the NavController's back stack (i.e., the Lifecycle of the NavBackStackEntry reaches the CREATED state).");
                    return null;
                }
                if (hh0Var.JFJ3QoxA.encWxUiV2 == m90.OOA6hdeuvCS) {
                    o4.jivtDDk9H("You cannot access the NavBackStackEntry's SavedStateHandle after the NavBackStackEntry is destroyed.");
                    return null;
                }
                fh0 fh0Var = hh0Var.GWasM1elztuh;
                af1 af1Var = (af1) hh0Var.E7jCp8Ls.getValue();
                of0 xqGvceK5x = fh0Var.xqGvceK5x();
                af1Var.getClass();
                rx0 rx0Var = new rx0(fh0Var.OOA6hdeuvCS(), af1Var, xqGvceK5x);
                va GWasM1elztuh = st0.GWasM1elztuh(gh0.class);
                String GWasM1elztuh2 = GWasM1elztuh.GWasM1elztuh();
                if (GWasM1elztuh2 != null) {
                    return ((gh0) rx0Var.YmKjaVtbfp5Z(GWasM1elztuh, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(GWasM1elztuh2))).Yi7zF1RB1;
                }
                o4.mE4lRynR("Local and anonymous classes can not be ViewModels");
                return null;
            case 5:
                return new vh0((String) this.EljAMC1QTz);
            case nr0.STRING_SET_FIELD_NUMBER /* 6 */:
                return n4.encWxUiV2((Context) this.EljAMC1QTz);
            case nr0.DOUBLE_FIELD_NUMBER /* 7 */:
                List list = (List) ((m51) this.EljAMC1QTz).getValue();
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : list) {
                    if (o30.rQPn8YBR(((fh0) obj2).EljAMC1QTz.OOA6hdeuvCS, "composable")) {
                        arrayList.add(obj2);
                    }
                }
                return arrayList;
            case 8:
                return new fl0((hl0) this.EljAMC1QTz);
            case 9:
                File file2 = (File) ((h2) this.EljAMC1QTz).GWasM1elztuh();
                String name = file2.getName();
                name.getClass();
                int lastIndexOf = name.lastIndexOf(46, name.length() - 1);
                if (!(lastIndexOf != -1 ? name.substring(lastIndexOf + 1, name.length()) : "").equals("preferences_pb")) {
                    o4.encWxUiV2("File extension for file: ", file2, " does not match required extension for Preferences file: preferences_pb");
                    return null;
                }
                File absoluteFile = file2.getAbsoluteFile();
                absoluteFile.getClass();
                return absoluteFile;
            case 10:
                hw0 hw0Var = (hw0) this.EljAMC1QTz;
                bx0 bx0Var = hw0Var.OOA6hdeuvCS;
                Object obj3 = hw0Var.encWxUiV2;
                if (obj3 != null) {
                    return bx0Var.mOu10nynGul(hw0Var, obj3);
                }
                o4.mE4lRynR("Value should be initialized");
                return null;
            case 11:
                d dVar = ((ow0) this.EljAMC1QTz).AvO7iQsrTN;
                if (dVar == null) {
                    return null;
                }
                Bundle jivtDDk9H = ki1.jivtDDk9H((rn0[]) Arrays.copyOf(new rn0[0], 0));
                dVar.mE4lRynR(jivtDDk9H);
                if (jivtDDk9H.isEmpty()) {
                    return null;
                }
                return jivtDDk9H;
            case 12:
                return fb1.ozMwhSAI((ff1) this.EljAMC1QTz);
            case 13:
                yw0 yw0Var = (yw0) this.EljAMC1QTz;
                yw0Var.AvO7iQsrTN().GWasM1elztuh(new jt0(0, yw0Var));
                return kc1.GWasM1elztuh;
            case 14:
                dy0 dy0Var = (dy0) this.EljAMC1QTz;
                n0 n0Var = (n0) o30.Mjvvu5DE(dy0Var, en0.GWasM1elztuh);
                dy0Var.EXrPz3p7hFb = n0Var;
                dy0Var.ozMwhSAI = n0Var != null ? new m0(n0Var.GWasM1elztuh, n0Var.Yi7zF1RB1, n0Var.X1lG3V04pd, n0Var.xqGvceK5x) : null;
                return kc1.GWasM1elztuh;
            case Side.ALL /* 15 */:
                ((kz0) this.EljAMC1QTz).EljAMC1QTz.mE4lRynR(dz0.GWasM1elztuh);
                return kc1.GWasM1elztuh;
            case 16:
                vz0 vz0Var = (vz0) this.EljAMC1QTz;
                qa1 qa1Var = vz0Var.OOA6hdeuvCS;
                vz0Var.EljAMC1QTz = qa1Var != null ? ((Number) qa1Var.E7jCp8Ls.getValue()).longValue() : 0L;
                return kc1.GWasM1elztuh;
            case 17:
                return this.EljAMC1QTz;
            case 18:
                w11 w11Var = (w11) this.EljAMC1QTz;
                fo0 fo0Var = w11Var.AvO7iQsrTN;
                if (((t21) fo0Var.getValue()).GWasM1elztuh == 9205357640488583168L || t21.X1lG3V04pd(((t21) fo0Var.getValue()).GWasM1elztuh)) {
                    return null;
                }
                return w11Var.OOA6hdeuvCS.MjxSquD6Av(((t21) fo0Var.getValue()).GWasM1elztuh);
            case 19:
                ((m31) this.EljAMC1QTz).GWasM1elztuh();
                return Boolean.TRUE;
            case 20:
                r41 r41Var = (r41) this.EljAMC1QTz;
                while (true) {
                    Object obj4 = r41Var.AvO7iQsrTN;
                    synchronized (obj4) {
                        try {
                            if (r41Var.X1lG3V04pd) {
                                z = z3;
                                obj = obj4;
                            } else {
                                r41Var.X1lG3V04pd = z3;
                                try {
                                    rg0 rg0Var = r41Var.EljAMC1QTz;
                                    Object[] objArr = rg0Var.OOA6hdeuvCS;
                                    int i = rg0Var.AvO7iQsrTN;
                                    int i2 = 0;
                                    while (i2 < i) {
                                        q41 q41Var = (q41) objArr[i2];
                                        ig0 ig0Var = q41Var.AvO7iQsrTN;
                                        hv hvVar = q41Var.GWasM1elztuh;
                                        Object[] objArr2 = ig0Var.Yi7zF1RB1;
                                        long[] jArr = ig0Var.GWasM1elztuh;
                                        int length = jArr.length - 2;
                                        if (length >= 0) {
                                            int i3 = 0;
                                            while (true) {
                                                long j = jArr[i3];
                                                boolean z4 = z3;
                                                obj = obj4;
                                                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                                    int i4 = 8 - ((~(i3 - length)) >>> 31);
                                                    z2 = z4;
                                                    for (int i5 = 0; i5 < i4; i5++) {
                                                        if ((j & 255) < 128) {
                                                            try {
                                                                hvVar.mOu10nynGul(objArr2[(i3 << 3) + i5]);
                                                            } catch (Throwable th) {
                                                                th = th;
                                                                r41Var.X1lG3V04pd = false;
                                                                throw th;
                                                            }
                                                        }
                                                        j >>= 8;
                                                    }
                                                    if (i4 == 8) {
                                                    }
                                                } else {
                                                    z2 = z4;
                                                }
                                                if (i3 != length) {
                                                    i3++;
                                                    obj4 = obj;
                                                    z3 = z2;
                                                }
                                            }
                                        } else {
                                            z2 = z3;
                                            obj = obj4;
                                        }
                                        ig0Var.Yi7zF1RB1();
                                        i2++;
                                        obj4 = obj;
                                        z3 = z2;
                                    }
                                    z = z3;
                                    obj = obj4;
                                    try {
                                        r41Var.X1lG3V04pd = false;
                                    } catch (Throwable th2) {
                                        th = th2;
                                        throw th;
                                    }
                                } catch (Throwable th3) {
                                    th = th3;
                                    obj = obj4;
                                }
                            }
                            if (!r41Var.Yi7zF1RB1()) {
                                return kc1.GWasM1elztuh;
                            }
                            z3 = z;
                        } catch (Throwable th4) {
                            th = th4;
                            obj = obj4;
                        }
                    }
                }
            case 21:
                x81 x81Var = (x81) this.EljAMC1QTz;
                x81Var.k8h8IjolWQ = null;
                l60.WIEu4Ya2g8(x81Var);
                n4.XnEVoBF0td1l(x81Var);
                p.uFEq9NpZ(x81Var);
                return Boolean.TRUE;
            default:
                ((v91) this.EljAMC1QTz).YXi2hvwn7WL.mOu10nynGul(Boolean.valueOf(!r0.z19UFEN2I));
                return kc1.GWasM1elztuh;
        }
    }
}
