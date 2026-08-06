package defpackage;

import android.graphics.Region;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.autofill.AutofillManager;
import androidx.profileinstaller.ProfileInstallReceiver;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class j6IIN2O8eOU implements wu0, fs0 {
    public static final j6IIN2O8eOU AvO7iQsrTN = new j6IIN2O8eOU(0, new float[]{0.8951f, -0.7502f, 0.0389f, 0.2664f, 1.7135f, -0.0685f, -0.1614f, 0.0367f, 1.0296f});
    public static final xx encWxUiV2 = new xx(1);
    public Object EljAMC1QTz;
    public final /* synthetic */ int OOA6hdeuvCS;

    public j6IIN2O8eOU(int i) {
        td0 td0Var;
        this.OOA6hdeuvCS = i;
        switch (i) {
            case 4:
                this.EljAMC1QTz = new AtomicInteger(0);
                break;
            case 8:
                this.EljAMC1QTz = vc0.EljAMC1QTz(ec1.Yi7zF1RB1);
                break;
            case 11:
                this.EljAMC1QTz = new u41(qj.E7jCp8Ls);
                break;
            case 16:
                dc0 dc0Var = new dc0();
                this.EljAMC1QTz = dc0Var;
                if (!dc0Var.EljAMC1QTz) {
                    if (dc0Var.AvO7iQsrTN) {
                        uq0.GWasM1elztuh("ManagedValuesStore tried to enter composition twice. Did you attempt to install the same store multiple times or into two compositions?");
                    }
                    dc0Var.GWasM1elztuh();
                    dc0Var.AvO7iQsrTN = true;
                    break;
                }
                break;
            case 17:
                this.EljAMC1QTz = new CopyOnWriteArrayList();
                new HashMap();
                break;
            case 18:
                this.EljAMC1QTz = new ArrayList(32);
                break;
            case 20:
                this.EljAMC1QTz = Build.VERSION.SDK_INT >= 28 ? new vt(17) : new vt(18);
                break;
            case 21:
                this.EljAMC1QTz = new qb0();
                break;
            case 24:
                this.EljAMC1QTz = new rf0();
                break;
            case 26:
                this.EljAMC1QTz = new Region();
                break;
            default:
                ns0 ns0Var = ns0.X1lG3V04pd;
                try {
                    td0Var = (td0) Class.forName("androidx.datastore.preferences.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", null).invoke(null, null);
                } catch (Exception unused) {
                    td0Var = encWxUiV2;
                }
                td0[] td0VarArr = {xx.Yi7zF1RB1, td0Var};
                ec0 ec0Var = new ec0();
                ec0Var.GWasM1elztuh = td0VarArr;
                Charset charset = i30.GWasM1elztuh;
                this.EljAMC1QTz = ec0Var;
                break;
        }
    }

    public static y70 Y6hRI1cF8(j6IIN2O8eOU j6iin2o8eou, int i) {
        u80 u80Var = (u80) j6iin2o8eou.EljAMC1QTz;
        y31 Mjvvu5DE = d70.Mjvvu5DE();
        hv OOA6hdeuvCS = Mjvvu5DE != null ? Mjvvu5DE.OOA6hdeuvCS() : null;
        y31 M3K9sHhK = d70.M3K9sHhK(Mjvvu5DE);
        try {
            p80 p80Var = (p80) u80Var.EljAMC1QTz.getValue();
            d70.A1EKNP6CxJ(Mjvvu5DE, M3K9sHhK, OOA6hdeuvCS);
            z70 z70Var = u80Var.WIEu4Ya2g8;
            long j = p80Var.JFJ3QoxA;
            boolean z = u80Var.xqGvceK5x;
            bCsSzSHkbaQ bcsszshkbaq = new bCsSzSHkbaQ(i, p80Var);
            i50 i50Var = z70Var.X1lG3V04pd;
            if (i50Var == null) {
                return b9xEq24R1.EXrPz3p7hFb;
            }
            f4 f4Var = z70Var.Yi7zF1RB1;
            rr0 rr0Var = (rr0) i50Var.xqGvceK5x;
            boolean z2 = rr0Var instanceof n1;
            qr0 qr0Var = new qr0(i50Var, i, f4Var, bcsszshkbaq);
            qr0Var.encWxUiV2 = new eg(j);
            if (!z2) {
                rr0Var.GWasM1elztuh(qr0Var);
            } else if (z) {
                n1 n1Var = (n1) rr0Var;
                n1Var.EljAMC1QTz.add(new zr0(1, qr0Var));
                if (!n1Var.AvO7iQsrTN) {
                    n1Var.AvO7iQsrTN = true;
                    n1Var.OOA6hdeuvCS.post(n1Var);
                }
            } else {
                n1 n1Var2 = (n1) rr0Var;
                n1Var2.EljAMC1QTz.add(new zr0(0, qr0Var));
                if (!n1Var2.AvO7iQsrTN) {
                    n1Var2.AvO7iQsrTN = true;
                    n1Var2.OOA6hdeuvCS.post(n1Var2);
                }
            }
            rj0.DmJncFq5("compose:lazy:schedule_prefetch:index", i);
            return qr0Var;
        } catch (Throwable th) {
            d70.A1EKNP6CxJ(Mjvvu5DE, M3K9sHhK, OOA6hdeuvCS);
            throw th;
        }
    }

    public l51 AvO7iQsrTN() {
        return (l51) ((p51) this.EljAMC1QTz).getValue();
    }

    public void E7jCp8Ls(float f, float f2) {
        ((ArrayList) this.EljAMC1QTz).add(new ro0(f, f2));
    }

    @Override // defpackage.fs0
    public void EljAMC1QTz(int i, Object obj) {
        String str;
        switch (i) {
            case 1:
                str = "RESULT_INSTALL_SUCCESS";
                break;
            case 2:
                str = "RESULT_ALREADY_INSTALLED";
                break;
            case nr0.INTEGER_FIELD_NUMBER /* 3 */:
                str = "RESULT_UNSUPPORTED_ART_VERSION";
                break;
            case 4:
                str = "RESULT_NOT_WRITABLE";
                break;
            case 5:
                str = "RESULT_DESIRED_FORMAT_UNSUPPORTED";
                break;
            case nr0.STRING_SET_FIELD_NUMBER /* 6 */:
                str = "RESULT_BASELINE_PROFILE_NOT_FOUND";
                break;
            case nr0.DOUBLE_FIELD_NUMBER /* 7 */:
                str = "RESULT_IO_EXCEPTION";
                break;
            case 8:
                str = "RESULT_PARSE_EXCEPTION";
                break;
            case 9:
            default:
                str = "";
                break;
            case 10:
                str = "RESULT_INSTALL_SKIP_FILE_SUCCESS";
                break;
            case 11:
                str = "RESULT_DELETE_SKIP_FILE_SUCCESS";
                break;
        }
        if (i == 6 || i == 7 || i == 8) {
            Log.e("ProfileInstaller", str, (Throwable) obj);
        } else {
            Log.d("ProfileInstaller", str);
        }
        ((ProfileInstallReceiver) this.EljAMC1QTz).setResultCode(i);
    }

    public void GWasM1elztuh(g60 g60Var) {
        if (!g60Var.eUH21U3apd()) {
            t10.Yi7zF1RB1("DepthSortedSet.add called on an unattached node");
        }
        ((u41) this.EljAMC1QTz).add(g60Var);
    }

    public long JFJ3QoxA() {
        switch (this.OOA6hdeuvCS) {
            case 10:
                al alVar = (al) this.EljAMC1QTz;
                long JFJ3QoxA = alVar.WdrkLMV3xh.JFJ3QoxA();
                if (JFJ3QoxA != 16) {
                    return JFJ3QoxA;
                }
                iv0 iv0Var = (iv0) o30.Mjvvu5DE(alVar, lv0.GWasM1elztuh);
                if (iv0Var != null) {
                    long j = iv0Var.GWasM1elztuh;
                    if (j != 16) {
                        return j;
                    }
                }
                return ((yb) o30.Mjvvu5DE(alVar, kg.GWasM1elztuh)).GWasM1elztuh;
            default:
                return ((nv0) this.EljAMC1QTz).X1lG3V04pd;
        }
    }

    public void Mjvvu5DE(float f, long j) {
        s9 EljAMC1QTz = ((f4) this.EljAMC1QTz).EljAMC1QTz();
        int i = (int) (j >> 32);
        int i2 = (int) (j & 4294967295L);
        EljAMC1QTz.AvO7iQsrTN(Float.intBitsToFloat(i), Float.intBitsToFloat(i2));
        EljAMC1QTz.X1lG3V04pd(f);
        EljAMC1QTz.AvO7iQsrTN(-Float.intBitsToFloat(i), -Float.intBitsToFloat(i2));
    }

    @Override // defpackage.fs0
    public void OOA6hdeuvCS() {
        Log.d("ProfileInstaller", "DIAGNOSTIC_PROFILE_IS_COMPRESSED");
    }

    public void WIEu4Ya2g8(float f, float f2, float f3, float f4) {
        ((ArrayList) this.EljAMC1QTz).add(new so0(f, f2, f3, f4));
    }

    public void WRKkgoJXwDn(int i, Object obj, nx0 nx0Var) {
        pb pbVar = (pb) this.EljAMC1QTz;
        pbVar.M3K9sHhK(i, 3);
        nx0Var.EljAMC1QTz((WRKkgoJXwDn) obj, pbVar.GWasM1elztuh);
        pbVar.M3K9sHhK(i, 4);
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0026, code lost:
    
        if (r5.GWasM1elztuh > ((defpackage.bi) r1).GWasM1elztuh) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void WdrkLMV3xh(l51 l51Var) {
        Object value;
        l51 l51Var2;
        l51Var.getClass();
        p51 p51Var = (p51) this.EljAMC1QTz;
        do {
            value = p51Var.getValue();
            l51Var2 = (l51) value;
            if (!(l51Var2 instanceof vs0) && !o30.rQPn8YBR(l51Var2, ec1.Yi7zF1RB1)) {
                if (!(l51Var2 instanceof bi)) {
                    if (!(l51Var2 instanceof wr)) {
                        if (l51Var2 instanceof tj0) {
                            o4.jivtDDk9H("This is a bug in DataStore. Please file a bug at: https://issuetracker.google.com/issues/new?component=907884&template=1466542");
                            return;
                        } else {
                            o4.xqGvceK5x();
                            return;
                        }
                    }
                }
            }
            l51Var2 = l51Var;
        } while (!p51Var.encWxUiV2(value, l51Var2));
    }

    public void X1lG3V04pd() {
        ((ye) this.EljAMC1QTz).getClass();
    }

    public void XnEVoBF0td1l(float f, float f2) {
        ((ArrayList) this.EljAMC1QTz).add(new no0(f, f2));
    }

    public void Yi7zF1RB1() {
        ((ArrayList) this.EljAMC1QTz).add(jo0.Yi7zF1RB1);
    }

    public boolean YmKjaVtbfp5Z(g60 g60Var) {
        if (!g60Var.eUH21U3apd()) {
            t10.Yi7zF1RB1("DepthSortedSet.remove called on an unattached node");
        }
        return ((u41) this.EljAMC1QTz).remove(g60Var);
    }

    public void cilMamHF(y20 y20Var) {
        ((Region) this.EljAMC1QTz).set(y20Var.GWasM1elztuh, y20Var.Yi7zF1RB1, y20Var.X1lG3V04pd, y20Var.xqGvceK5x);
    }

    public m51 encWxUiV2() {
        gp GWasM1elztuh = gp.GWasM1elztuh();
        if (GWasM1elztuh.Yi7zF1RB1() == 1) {
            return new m00(true);
        }
        fo0 WRKkgoJXwDn = z50.WRKkgoJXwDn(Boolean.FALSE);
        ik ikVar = new ik(WRKkgoJXwDn, this);
        GWasM1elztuh.GWasM1elztuh.writeLock().lock();
        try {
            if (GWasM1elztuh.X1lG3V04pd != 1 && GWasM1elztuh.X1lG3V04pd != 2) {
                GWasM1elztuh.Yi7zF1RB1.add(ikVar);
                GWasM1elztuh.GWasM1elztuh.writeLock().unlock();
                return WRKkgoJXwDn;
            }
            GWasM1elztuh.xqGvceK5x.post(new ep(Arrays.asList(ikVar), GWasM1elztuh.X1lG3V04pd, null));
            GWasM1elztuh.GWasM1elztuh.writeLock().unlock();
            return WRKkgoJXwDn;
        } catch (Throwable th) {
            GWasM1elztuh.GWasM1elztuh.writeLock().unlock();
            throw th;
        }
    }

    public d iwATDS1i01k(d dVar, c cVar) {
        Object obj;
        long j;
        boolean z;
        long AEn1Rrio;
        qb0 qb0Var = (qb0) this.EljAMC1QTz;
        List list = (List) dVar.EljAMC1QTz;
        qb0 qb0Var2 = new qb0(list.size());
        int size = list.size();
        int i = 0;
        while (i < size) {
            mq0 mq0Var = (mq0) list.get(i);
            long j2 = mq0Var.GWasM1elztuh;
            int iwATDS1i01k = fb1.iwATDS1i01k(qb0Var.EljAMC1QTz, qb0Var.encWxUiV2, j2);
            if (iwATDS1i01k < 0 || (obj = qb0Var.AvO7iQsrTN[iwATDS1i01k]) == ki1.mOu10nynGul) {
                obj = null;
            }
            lq0 lq0Var = (lq0) obj;
            if (lq0Var == null) {
                j = mq0Var.Yi7zF1RB1;
                AEn1Rrio = mq0Var.xqGvceK5x;
                z = false;
            } else {
                j = lq0Var.GWasM1elztuh;
                z = lq0Var.X1lG3V04pd;
                AEn1Rrio = cVar.AEn1Rrio(lq0Var.Yi7zF1RB1);
            }
            long j3 = mq0Var.GWasM1elztuh;
            int i2 = i;
            List list2 = list;
            int i3 = size;
            qb0Var2.Yi7zF1RB1(j3, new kq0(j3, mq0Var.Yi7zF1RB1, mq0Var.xqGvceK5x, mq0Var.OOA6hdeuvCS, mq0Var.EljAMC1QTz, j, AEn1Rrio, z, mq0Var.AvO7iQsrTN, mq0Var.mOu10nynGul, mq0Var.JFJ3QoxA, mq0Var.rQPn8YBR, mq0Var.E7jCp8Ls, mq0Var.XnEVoBF0td1l));
            boolean z2 = mq0Var.OOA6hdeuvCS;
            if (z2) {
                qb0Var.Yi7zF1RB1(j2, new lq0(mq0Var.Yi7zF1RB1, mq0Var.X1lG3V04pd, z2));
            } else {
                qb0Var.X1lG3V04pd(j2);
            }
            i = i2 + 1;
            list = list2;
            size = i3;
        }
        return new d(6, qb0Var2, dVar);
    }

    public void jivtDDk9H(float f, float f2, long j) {
        s9 EljAMC1QTz = ((f4) this.EljAMC1QTz).EljAMC1QTz();
        int i = (int) (j >> 32);
        int i2 = (int) (j & 4294967295L);
        EljAMC1QTz.AvO7iQsrTN(Float.intBitsToFloat(i), Float.intBitsToFloat(i2));
        EljAMC1QTz.Yi7zF1RB1(f, f2);
        EljAMC1QTz.AvO7iQsrTN(-Float.intBitsToFloat(i), -Float.intBitsToFloat(i2));
    }

    public void lv06NcmrQ(float f, float f2) {
        ((f4) this.EljAMC1QTz).EljAMC1QTz().AvO7iQsrTN(f, f2);
    }

    public Object mE4lRynR(z9 z9Var, wu wuVar) {
        s21 s21Var;
        t01 t01Var;
        int i;
        if (((le) this.EljAMC1QTz) == null) {
            tq0.Yi7zF1RB1("Called runAndWatch on a manager that has been disposed of");
        }
        le leVar = (le) this.EljAMC1QTz;
        if ((leVar instanceof s21) && (t01Var = (s21Var = (s21) leVar).EljAMC1QTz) != null && !t01Var.equals(z9Var)) {
            mf0 mf0Var = new mf0();
            t01 t01Var2 = s21Var.EljAMC1QTz;
            if (t01Var2 == null) {
                tq0.Yi7zF1RB1("promote must only be called when a manager is managing subscriptions for one channel and needs to start managing them for a second");
            }
            ig0 ig0Var = s21Var.xqGvceK5x;
            ArrayList arrayList = mf0Var.X1lG3V04pd;
            if (ig0Var == null) {
                Object obj = s21Var.Yi7zF1RB1;
                obj.getClass();
                arrayList.add(new jf0(obj, t01Var2));
            } else {
                Object[] objArr = ig0Var.Yi7zF1RB1;
                long[] jArr = ig0Var.GWasM1elztuh;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i2 = 0;
                    while (true) {
                        long j = jArr[i2];
                        if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i3 = 8;
                            int i4 = 8 - ((~(i2 - length)) >>> 31);
                            int i5 = 0;
                            while (i5 < i4) {
                                if ((j & 255) < 128) {
                                    i = i3;
                                    arrayList.add(new jf0(objArr[(i2 << 3) + i5], t01Var2));
                                } else {
                                    i = i3;
                                }
                                j >>= i;
                                i5++;
                                i3 = i;
                            }
                            if (i4 != i3) {
                                break;
                            }
                        }
                        if (i2 == length) {
                            break;
                        }
                        i2++;
                    }
                }
            }
            mf0Var.xqGvceK5x();
            s21Var.OOA6hdeuvCS();
            this.EljAMC1QTz = mf0Var;
        }
        le leVar2 = (le) this.EljAMC1QTz;
        leVar2.getClass();
        y31 Y6hRI1cF8 = e41.JFJ3QoxA().Y6hRI1cF8(leVar2.encWxUiV2(z9Var));
        leVar2.X1lG3V04pd(z9Var);
        try {
            y31 JFJ3QoxA = Y6hRI1cF8.JFJ3QoxA();
            try {
                Object GWasM1elztuh = wuVar.GWasM1elztuh();
                Y6hRI1cF8.X1lG3V04pd();
                leVar2.xqGvceK5x();
                return GWasM1elztuh;
            } finally {
                y31.YmKjaVtbfp5Z(JFJ3QoxA);
            }
        } catch (Throwable th) {
            Y6hRI1cF8.X1lG3V04pd();
            throw th;
        }
    }

    public void mOu10nynGul(float f, float f2, float f3, float f4) {
        f4 f4Var = (f4) this.EljAMC1QTz;
        s9 EljAMC1QTz = f4Var.EljAMC1QTz();
        float intBitsToFloat = Float.intBitsToFloat((int) (f4Var.mOu10nynGul() >> 32)) - (f3 + f);
        float intBitsToFloat2 = Float.intBitsToFloat((int) (f4Var.mOu10nynGul() & 4294967295L)) - (f4 + f2);
        long floatToRawIntBits = (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L) | (Float.floatToRawIntBits(intBitsToFloat) << 32);
        if (Float.intBitsToFloat((int) (floatToRawIntBits >> 32)) < 0.0f || Float.intBitsToFloat((int) (floatToRawIntBits & 4294967295L)) < 0.0f) {
            s10.GWasM1elztuh("Width and height must be greater than or equal to zero");
        }
        f4Var.jivtDDk9H(floatToRawIntBits);
        EljAMC1QTz.AvO7iQsrTN(f, f2);
    }

    public void rQPn8YBR(float f, float f2) {
        ((ArrayList) this.EljAMC1QTz).add(new mo0(f, f2));
    }

    public String toString() {
        switch (this.OOA6hdeuvCS) {
            case 0:
                return "Bradford";
            case 11:
                return ((u41) this.EljAMC1QTz).toString();
            default:
                return super.toString();
        }
    }

    public void uFEq9NpZ(View view, int i, boolean z) {
        if (Build.VERSION.SDK_INT >= 27) {
            ((AutofillManager) this.EljAMC1QTz).notifyViewVisibilityChanged(view, i, z);
        }
    }

    public void xqGvceK5x(float f, float f2, float f3, float f4, float f5, float f6) {
        ((ArrayList) this.EljAMC1QTz).add(new po0(f, f2, f3, f4, f5, f6));
    }

    public /* synthetic */ j6IIN2O8eOU(int i, boolean z) {
        this.OOA6hdeuvCS = i;
    }

    public j6IIN2O8eOU(el elVar) {
        this.OOA6hdeuvCS = 29;
        this.EljAMC1QTz = new cs(a51.GWasM1elztuh, elVar);
    }

    public j6IIN2O8eOU(pb pbVar) {
        this.OOA6hdeuvCS = 6;
        i30.GWasM1elztuh(pbVar, "output");
        this.EljAMC1QTz = pbVar;
        pbVar.GWasM1elztuh = this;
    }

    public j6IIN2O8eOU(boolean z) {
        this.OOA6hdeuvCS = 3;
        this.EljAMC1QTz = new AtomicBoolean(z);
    }

    public j6IIN2O8eOU(View view) {
        this.OOA6hdeuvCS = 14;
        this.EljAMC1QTz = view;
        d70.arNh8D4Z5gB(a90.OOA6hdeuvCS, new d3(3, this));
    }

    public /* synthetic */ j6IIN2O8eOU(int i, Object obj) {
        this.OOA6hdeuvCS = i;
        this.EljAMC1QTz = obj;
    }

    public j6IIN2O8eOU(long[] jArr) {
        uf0 uf0Var;
        this.OOA6hdeuvCS = 28;
        if (jArr != null) {
            long[] copyOf = Arrays.copyOf(jArr, jArr.length);
            uf0Var = new uf0(copyOf.length);
            int i = uf0Var.Yi7zF1RB1;
            if (i >= 0) {
                if (copyOf.length != 0) {
                    int length = copyOf.length + i;
                    long[] jArr2 = uf0Var.GWasM1elztuh;
                    if (jArr2.length < length) {
                        uf0Var.GWasM1elztuh = Arrays.copyOf(jArr2, Math.max(length, (jArr2.length * 3) / 2));
                    }
                    long[] jArr3 = uf0Var.GWasM1elztuh;
                    int i2 = uf0Var.Yi7zF1RB1;
                    if (i != i2) {
                        d5.Uxq83abb04(jArr3, jArr3, copyOf.length + i, i, i2);
                    }
                    d5.Uxq83abb04(copyOf, jArr3, i, 0, copyOf.length);
                    uf0Var.Yi7zF1RB1 += copyOf.length;
                }
            } else {
                o4.uFEq9NpZ("");
                throw null;
            }
        } else {
            uf0Var = new uf0();
        }
        this.EljAMC1QTz = uf0Var;
    }
}
