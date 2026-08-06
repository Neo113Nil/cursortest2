package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.ResolveInfo;
import android.content.pm.Signature;
import android.content.res.Resources;
import android.os.Build;
import android.util.Log;
import android.view.View;
import com.combinations.level.experts.R;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Collection;
import java.util.Collections;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Locale;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public abstract class n30 {
    public static final /* synthetic */ int iwATDS1i01k = 0;
    public static final long uFEq9NpZ = Long.MIN_VALUE;
    public static final b21 GWasM1elztuh = b21.AvO7iQsrTN;
    public static final jd Yi7zF1RB1 = new jd(-73357825, false, new pd(10));
    public static final ec X1lG3V04pd = ec.XnEVoBF0td1l;
    public static final wb1 xqGvceK5x = wb1.AvO7iQsrTN;
    public static final b21 OOA6hdeuvCS = b21.OOA6hdeuvCS;
    public static final wb1 EljAMC1QTz = wb1.EljAMC1QTz;
    public static final wb1 AvO7iQsrTN = wb1.OOA6hdeuvCS;
    public static final ec encWxUiV2 = ec.uFEq9NpZ;
    public static final l1 mOu10nynGul = new l1(3);
    public static final pp JFJ3QoxA = new pp("NULL", 1);
    public static final byte[] rQPn8YBR = {112, 114, 111, 0};
    public static final byte[] E7jCp8Ls = {112, 114, 109, 0};
    public static final e91 XnEVoBF0td1l = new e91(0, new long[0], new Object[0]);

    public static final ie0 A1EKNP6CxJ(qx qxVar, ie0 ie0Var) {
        if (ie0Var.Yi7zF1RB1(XdwzlWIkSDqF.iwATDS1i01k)) {
            return ie0Var;
        }
        qxVar.CMh55RymNfS(1219399079, 0, null, null);
        ie0 ie0Var2 = (ie0) ie0Var.GWasM1elztuh(new iwATDS1i01k(4, qxVar), fe0.GWasM1elztuh);
        qxVar.WIEu4Ya2g8(false);
        return ie0Var2;
    }

    public static final int AEn1Rrio(c5 c5Var, Object obj, int i) {
        int i2 = c5Var.AvO7iQsrTN;
        if (i2 == 0) {
            return -1;
        }
        try {
            int uFEq9NpZ2 = fb1.uFEq9NpZ(c5Var.OOA6hdeuvCS, i2, i);
            if (uFEq9NpZ2 < 0 || o30.rQPn8YBR(obj, c5Var.EljAMC1QTz[uFEq9NpZ2])) {
                return uFEq9NpZ2;
            }
            int i3 = uFEq9NpZ2 + 1;
            while (i3 < i2 && c5Var.OOA6hdeuvCS[i3] == i) {
                if (o30.rQPn8YBR(obj, c5Var.EljAMC1QTz[i3])) {
                    return i3;
                }
                i3++;
            }
            for (int i4 = uFEq9NpZ2 - 1; i4 >= 0 && c5Var.OOA6hdeuvCS[i4] == i; i4--) {
                if (o30.rQPn8YBR(obj, c5Var.EljAMC1QTz[i4])) {
                    return i4;
                }
            }
            return ~i3;
        } catch (IndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }

    public static final long AvO7iQsrTN(long j, long j2) {
        if (j != 4611686018427387903L && j != -4611686018427387903L) {
            return (j2 == 4611686018427387903L || j2 == -4611686018427387903L) ? j2 : o50.mOu10nynGul(j + j2);
        }
        if ((-4611686018427387903L >= j2 || j2 >= 4611686018427387903L) && (j2 ^ j) < 0) {
            return 9223372036854759646L;
        }
        return j;
    }

    public static pl[] CMh55RymNfS(FileInputStream fileInputStream, byte[] bArr, String str) {
        if (!Arrays.equals(bArr, o30.rQPn8YBR)) {
            o4.jivtDDk9H("Unsupported version");
            return null;
        }
        int CMh55RymNfS = (int) fb1.CMh55RymNfS(fileInputStream, 1);
        byte[] YXi2hvwn7WL = fb1.YXi2hvwn7WL(fileInputStream, (int) fb1.CMh55RymNfS(fileInputStream, 4), (int) fb1.CMh55RymNfS(fileInputStream, 4));
        if (fileInputStream.read() > 0) {
            o4.jivtDDk9H("Content found after the end of file");
            return null;
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(YXi2hvwn7WL);
        try {
            pl[] qugwajBSa59j = qugwajBSa59j(byteArrayInputStream, str, CMh55RymNfS);
            byteArrayInputStream.close();
            return qugwajBSa59j;
        } catch (Throwable th) {
            try {
                byteArrayInputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public static gh DmJncFq5(eh ehVar, fh fhVar) {
        fhVar.getClass();
        return o30.rQPn8YBR(ehVar.getKey(), fhVar) ? vp.OOA6hdeuvCS : ehVar;
    }

    public static IOException E7jCp8Ls(File file, IOException iOException) {
        File parentFile = file.getParentFile();
        return parentFile == null ? rQPn8YBR(file, iOException) : parentFile.exists() ? parentFile.isFile() ? parentFile.canRead() ? parentFile.canWrite() ? rQPn8YBR(file, iOException) : rQPn8YBR(file, iOException) : parentFile.canWrite() ? rQPn8YBR(file, iOException) : rQPn8YBR(file, iOException) : parentFile.canRead() ? parentFile.canWrite() ? rQPn8YBR(file, iOException) : rQPn8YBR(file, iOException) : parentFile.canWrite() ? rQPn8YBR(file, iOException) : rQPn8YBR(file, iOException) : rQPn8YBR(file, iOException);
    }

    public static final u3 EXrPz3p7hFb(d01 d01Var) {
        Object AvO7iQsrTN2 = d01Var.xqGvceK5x.OOA6hdeuvCS.AvO7iQsrTN(h01.AEn1Rrio);
        if (AvO7iQsrTN2 == null) {
            AvO7iQsrTN2 = null;
        }
        u3 u3Var = (u3) AvO7iQsrTN2;
        Object AvO7iQsrTN3 = d01Var.xqGvceK5x.OOA6hdeuvCS.AvO7iQsrTN(h01.M3K9sHhK);
        if (AvO7iQsrTN3 == null) {
            AvO7iQsrTN3 = null;
        }
        List list = (List) AvO7iQsrTN3;
        return u3Var == null ? list != null ? (u3) rb.YTyqgZhdF(list) : null : u3Var;
    }

    public static final void EljAMC1QTz(cx cxVar, hv hvVar, qx qxVar, int i) {
        hv hvVar2;
        qx qxVar2 = qxVar;
        qxVar2.Uxq83abb04(-1243542426);
        int i2 = i | (qxVar2.encWxUiV2(cxVar) ? 4 : 2) | (qxVar2.encWxUiV2(hvVar) ? 32 : 16);
        int i3 = 1;
        if (qxVar2.dqB83aoLBB(i2 & 1, (i2 & 19) != 18)) {
            tr trVar = v21.GWasM1elztuh;
            zv0 GWasM1elztuh2 = yv0.GWasM1elztuh(rj0.GWasM1elztuh, b9xEq24R1.WIEu4Ya2g8, qxVar2, 48);
            int hashCode = Long.hashCode(qxVar2.qugwajBSa59j);
            cp0 E7jCp8Ls2 = qxVar2.E7jCp8Ls();
            ie0 MZhzXH72 = MZhzXH72(qxVar2, trVar);
            oe.X1lG3V04pd.getClass();
            hf hfVar = ne.Yi7zF1RB1;
            qxVar2.c4eaifQP();
            if (qxVar2.CMh55RymNfS) {
                qxVar2.rQPn8YBR(hfVar);
            } else {
                qxVar2.K0ReC6MK();
            }
            r2 r2Var = ne.OOA6hdeuvCS;
            l60.WRKkgoJXwDn(r2Var, qxVar2, GWasM1elztuh2);
            r2 r2Var2 = ne.xqGvceK5x;
            l60.WRKkgoJXwDn(r2Var2, qxVar2, E7jCp8Ls2);
            Integer valueOf = Integer.valueOf(hashCode);
            r2 r2Var3 = ne.EljAMC1QTz;
            l60.WRKkgoJXwDn(r2Var3, qxVar2, valueOf);
            XdwzlWIkSDqF xdwzlWIkSDqF = ne.AvO7iQsrTN;
            l60.WdrkLMV3xh(qxVar2, xdwzlWIkSDqF);
            r2 r2Var4 = ne.X1lG3V04pd;
            l60.WRKkgoJXwDn(r2Var4, qxVar2, MZhzXH72);
            int i4 = i2 & 112;
            boolean z = i4 == 32;
            Object HFYAaqMd6 = qxVar2.HFYAaqMd6();
            k61 k61Var = ue.GWasM1elztuh;
            if (z || HFYAaqMd6 == k61Var) {
                HFYAaqMd6 = new uw(hvVar, i3);
                qxVar2.dcDmLGVhzWm(HFYAaqMd6);
            }
            fb1.OOA6hdeuvCS((wu) HFYAaqMd6, null, false, null, null, ki1.GWasM1elztuh, qxVar2, 1572864, 62);
            x60 x60Var = new x60(1.0f, true);
            nc GWasM1elztuh3 = lc.GWasM1elztuh(rj0.Yi7zF1RB1, b9xEq24R1.Mjvvu5DE, qxVar2, 48);
            int hashCode2 = Long.hashCode(qxVar2.qugwajBSa59j);
            cp0 E7jCp8Ls3 = qxVar2.E7jCp8Ls();
            ie0 MZhzXH722 = MZhzXH72(qxVar2, x60Var);
            qxVar2.c4eaifQP();
            if (qxVar2.CMh55RymNfS) {
                qxVar2.rQPn8YBR(hfVar);
            } else {
                qxVar2.K0ReC6MK();
            }
            l60.WRKkgoJXwDn(r2Var, qxVar2, GWasM1elztuh3);
            l60.WRKkgoJXwDn(r2Var2, qxVar2, E7jCp8Ls3);
            l60.WRKkgoJXwDn(r2Var3, qxVar2, Integer.valueOf(hashCode2));
            l60.WdrkLMV3xh(qxVar2, xdwzlWIkSDqF);
            l60.WRKkgoJXwDn(r2Var4, qxVar2, MZhzXH722);
            String WdrkLMV3xh = w60.WdrkLMV3xh(R.string.game_level_title, new Object[]{Integer.valueOf(cxVar.Yi7zF1RB1 + 1)}, qxVar2);
            v51 v51Var = xb1.GWasM1elztuh;
            j81.Yi7zF1RB1(WdrkLMV3xh, null, ac.XnEVoBF0td1l, 0L, 0L, new x71(3), 0L, 0, false, 0, 0, ((vb1) qxVar2.JFJ3QoxA(v51Var)).AvO7iQsrTN, qxVar, 384, 130042);
            String upperCase = cxVar.xqGvceK5x.toUpperCase(Locale.ROOT);
            upperCase.getClass();
            j81.Yi7zF1RB1(upperCase, null, ac.uFEq9NpZ, 0L, 0L, new x71(3), 0L, 0, false, 0, 0, ((vb1) qxVar.JFJ3QoxA(v51Var)).uFEq9NpZ, qxVar, 384, 130042);
            qxVar2 = qxVar;
            qxVar2.WIEu4Ya2g8(true);
            boolean z2 = i4 == 32;
            Object HFYAaqMd62 = qxVar2.HFYAaqMd6();
            if (z2 || HFYAaqMd62 == k61Var) {
                hvVar2 = hvVar;
                HFYAaqMd62 = new uw(hvVar2, 2);
                qxVar2.dcDmLGVhzWm(HFYAaqMd62);
            } else {
                hvVar2 = hvVar;
            }
            fb1.OOA6hdeuvCS((wu) HFYAaqMd62, null, cxVar.GWasM1elztuh != tw.OOA6hdeuvCS, null, null, ki1.Yi7zF1RB1, qxVar2, 1572864, 58);
            qxVar2.WIEu4Ya2g8(true);
        } else {
            hvVar2 = hvVar;
            qxVar2.YXi2hvwn7WL();
        }
        at0 Mjvvu5DE = qxVar2.Mjvvu5DE();
        if (Mjvvu5DE != null) {
            Mjvvu5DE.xqGvceK5x = new t7(i, 6, cxVar, hvVar2);
        }
    }

    /* JADX WARN: Finally extract failed */
    public static boolean Fm8W7vP7q(ByteArrayOutputStream byteArrayOutputStream, byte[] bArr, pl[] plVarArr) {
        int i;
        long j;
        int length;
        byte[] bArr2 = o30.uFEq9NpZ;
        byte[] bArr3 = o30.XnEVoBF0td1l;
        byte[] bArr4 = o30.JFJ3QoxA;
        int i2 = 0;
        if (!Arrays.equals(bArr, bArr4)) {
            byte[] bArr5 = o30.rQPn8YBR;
            if (Arrays.equals(bArr, bArr5)) {
                byte[] jivtDDk9H = jivtDDk9H(plVarArr, bArr5);
                fb1.NyNgffpi(byteArrayOutputStream, plVarArr.length, 1);
                fb1.NyNgffpi(byteArrayOutputStream, jivtDDk9H.length, 4);
                byte[] Mjvvu5DE = fb1.Mjvvu5DE(jivtDDk9H);
                fb1.NyNgffpi(byteArrayOutputStream, Mjvvu5DE.length, 4);
                byteArrayOutputStream.write(Mjvvu5DE);
                return true;
            }
            if (Arrays.equals(bArr, bArr3)) {
                fb1.NyNgffpi(byteArrayOutputStream, plVarArr.length, 1);
                for (pl plVar : plVarArr) {
                    int size = plVar.mOu10nynGul.size() * 4;
                    String WRKkgoJXwDn = WRKkgoJXwDn(plVar.GWasM1elztuh, plVar.Yi7zF1RB1, bArr3);
                    Charset charset = StandardCharsets.UTF_8;
                    fb1.EDwNPVYuViP0(byteArrayOutputStream, WRKkgoJXwDn.getBytes(charset).length);
                    fb1.EDwNPVYuViP0(byteArrayOutputStream, plVar.encWxUiV2.length);
                    fb1.NyNgffpi(byteArrayOutputStream, size, 4);
                    fb1.NyNgffpi(byteArrayOutputStream, plVar.X1lG3V04pd, 4);
                    byteArrayOutputStream.write(WRKkgoJXwDn.getBytes(charset));
                    Iterator it = plVar.mOu10nynGul.keySet().iterator();
                    while (it.hasNext()) {
                        fb1.EDwNPVYuViP0(byteArrayOutputStream, ((Integer) it.next()).intValue());
                        fb1.EDwNPVYuViP0(byteArrayOutputStream, 0);
                    }
                    for (int i3 : plVar.encWxUiV2) {
                        fb1.EDwNPVYuViP0(byteArrayOutputStream, i3);
                    }
                }
                return true;
            }
            byte[] bArr6 = o30.E7jCp8Ls;
            if (Arrays.equals(bArr, bArr6)) {
                byte[] jivtDDk9H2 = jivtDDk9H(plVarArr, bArr6);
                fb1.NyNgffpi(byteArrayOutputStream, plVarArr.length, 1);
                fb1.NyNgffpi(byteArrayOutputStream, jivtDDk9H2.length, 4);
                byte[] Mjvvu5DE2 = fb1.Mjvvu5DE(jivtDDk9H2);
                fb1.NyNgffpi(byteArrayOutputStream, Mjvvu5DE2.length, 4);
                byteArrayOutputStream.write(Mjvvu5DE2);
                return true;
            }
            if (!Arrays.equals(bArr, bArr2)) {
                return false;
            }
            fb1.EDwNPVYuViP0(byteArrayOutputStream, plVarArr.length);
            for (pl plVar2 : plVarArr) {
                String str = plVar2.GWasM1elztuh;
                TreeMap treeMap = plVar2.mOu10nynGul;
                String WRKkgoJXwDn2 = WRKkgoJXwDn(str, plVar2.Yi7zF1RB1, bArr2);
                Charset charset2 = StandardCharsets.UTF_8;
                fb1.EDwNPVYuViP0(byteArrayOutputStream, WRKkgoJXwDn2.getBytes(charset2).length);
                fb1.EDwNPVYuViP0(byteArrayOutputStream, treeMap.size());
                fb1.EDwNPVYuViP0(byteArrayOutputStream, plVar2.encWxUiV2.length);
                fb1.NyNgffpi(byteArrayOutputStream, plVar2.X1lG3V04pd, 4);
                byteArrayOutputStream.write(WRKkgoJXwDn2.getBytes(charset2));
                Iterator it2 = treeMap.keySet().iterator();
                while (it2.hasNext()) {
                    fb1.EDwNPVYuViP0(byteArrayOutputStream, ((Integer) it2.next()).intValue());
                }
                for (int i4 : plVar2.encWxUiV2) {
                    fb1.EDwNPVYuViP0(byteArrayOutputStream, i4);
                }
            }
            return true;
        }
        ArrayList arrayList = new ArrayList(3);
        ArrayList arrayList2 = new ArrayList(3);
        ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
        try {
            fb1.EDwNPVYuViP0(byteArrayOutputStream2, plVarArr.length);
            int i5 = 2;
            int i6 = 2;
            for (pl plVar3 : plVarArr) {
                fb1.NyNgffpi(byteArrayOutputStream2, plVar3.X1lG3V04pd, 4);
                fb1.NyNgffpi(byteArrayOutputStream2, plVar3.xqGvceK5x, 4);
                fb1.NyNgffpi(byteArrayOutputStream2, plVar3.AvO7iQsrTN, 4);
                String WRKkgoJXwDn3 = WRKkgoJXwDn(plVar3.GWasM1elztuh, plVar3.Yi7zF1RB1, bArr4);
                Charset charset3 = StandardCharsets.UTF_8;
                int length2 = WRKkgoJXwDn3.getBytes(charset3).length;
                fb1.EDwNPVYuViP0(byteArrayOutputStream2, length2);
                i6 = i6 + 14 + length2;
                byteArrayOutputStream2.write(WRKkgoJXwDn3.getBytes(charset3));
            }
            byte[] byteArray = byteArrayOutputStream2.toByteArray();
            if (i6 != byteArray.length) {
                throw new IllegalStateException("Expected size " + i6 + ", does not match actual size " + byteArray.length);
            }
            ii1 ii1Var = new ii1(1, byteArray, false);
            byteArrayOutputStream2.close();
            arrayList.add(ii1Var);
            ByteArrayOutputStream byteArrayOutputStream3 = new ByteArrayOutputStream();
            int i7 = 0;
            int i8 = 0;
            while (i7 < plVarArr.length) {
                try {
                    pl plVar4 = plVarArr[i7];
                    fb1.EDwNPVYuViP0(byteArrayOutputStream3, i7);
                    fb1.EDwNPVYuViP0(byteArrayOutputStream3, plVar4.OOA6hdeuvCS);
                    i8 = i8 + 4 + (plVar4.OOA6hdeuvCS * i5);
                    int[] iArr = plVar4.encWxUiV2;
                    int length3 = iArr.length;
                    int i9 = i2;
                    while (i2 < length3) {
                        int i10 = iArr[i2];
                        fb1.EDwNPVYuViP0(byteArrayOutputStream3, i10 - i9);
                        i2++;
                        i5 = i5;
                        i9 = i10;
                    }
                    i7++;
                    i2 = 0;
                } catch (Throwable th) {
                }
            }
            int i11 = i5;
            byte[] byteArray2 = byteArrayOutputStream3.toByteArray();
            if (i8 != byteArray2.length) {
                throw new IllegalStateException("Expected size " + i8 + ", does not match actual size " + byteArray2.length);
            }
            ii1 ii1Var2 = new ii1(3, byteArray2, true);
            byteArrayOutputStream3.close();
            arrayList.add(ii1Var2);
            byteArrayOutputStream3 = new ByteArrayOutputStream();
            int i12 = 0;
            for (int i13 = 0; i13 < plVarArr.length; i13++) {
                try {
                    pl plVar5 = plVarArr[i13];
                    Iterator it3 = plVar5.mOu10nynGul.entrySet().iterator();
                    int i14 = 0;
                    while (it3.hasNext()) {
                        i14 |= ((Integer) ((Map.Entry) it3.next()).getValue()).intValue();
                    }
                    ByteArrayOutputStream byteArrayOutputStream4 = new ByteArrayOutputStream();
                    try {
                        ZCWXqiC0(byteArrayOutputStream4, i14, plVar5);
                        byte[] byteArray3 = byteArrayOutputStream4.toByteArray();
                        byteArrayOutputStream4.close();
                        byteArrayOutputStream4 = new ByteArrayOutputStream();
                        try {
                            JFXS9W1rB5s4(byteArrayOutputStream4, plVar5);
                            byte[] byteArray4 = byteArrayOutputStream4.toByteArray();
                            byteArrayOutputStream4.close();
                            fb1.EDwNPVYuViP0(byteArrayOutputStream3, i13);
                            int length4 = byteArray3.length + 2 + byteArray4.length;
                            int i15 = i12 + 6;
                            fb1.NyNgffpi(byteArrayOutputStream3, length4, 4);
                            fb1.EDwNPVYuViP0(byteArrayOutputStream3, i14);
                            byteArrayOutputStream3.write(byteArray3);
                            byteArrayOutputStream3.write(byteArray4);
                            i12 = i15 + length4;
                        } finally {
                        }
                    } finally {
                    }
                } finally {
                    try {
                        byteArrayOutputStream3.close();
                        throw th;
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
            }
            byte[] byteArray5 = byteArrayOutputStream3.toByteArray();
            if (i12 != byteArray5.length) {
                throw new IllegalStateException("Expected size " + i12 + ", does not match actual size " + byteArray5.length);
            }
            ii1 ii1Var3 = new ii1(4, byteArray5, true);
            byteArrayOutputStream3.close();
            arrayList.add(ii1Var3);
            long size2 = 12 + (arrayList.size() * 16);
            fb1.NyNgffpi(byteArrayOutputStream, arrayList.size(), 4);
            int i16 = 0;
            while (i16 < arrayList.size()) {
                ii1 ii1Var4 = (ii1) arrayList.get(i16);
                int i17 = ii1Var4.GWasM1elztuh;
                byte[] bArr7 = ii1Var4.Yi7zF1RB1;
                if (i17 != 1) {
                    i = i11;
                    if (i17 == i) {
                        j = 1;
                    } else if (i17 == 3) {
                        j = 2;
                    } else if (i17 == 4) {
                        j = 3;
                    } else {
                        if (i17 != 5) {
                            throw null;
                        }
                        j = 4;
                    }
                } else {
                    i = i11;
                    j = 0;
                }
                fb1.NyNgffpi(byteArrayOutputStream, j, 4);
                fb1.NyNgffpi(byteArrayOutputStream, size2, 4);
                if (ii1Var4.X1lG3V04pd) {
                    long length5 = bArr7.length;
                    byte[] Mjvvu5DE3 = fb1.Mjvvu5DE(bArr7);
                    arrayList2.add(Mjvvu5DE3);
                    fb1.NyNgffpi(byteArrayOutputStream, Mjvvu5DE3.length, 4);
                    fb1.NyNgffpi(byteArrayOutputStream, length5, 4);
                    length = Mjvvu5DE3.length;
                } else {
                    arrayList2.add(bArr7);
                    fb1.NyNgffpi(byteArrayOutputStream, bArr7.length, 4);
                    fb1.NyNgffpi(byteArrayOutputStream, 0L, 4);
                    length = bArr7.length;
                }
                size2 += length;
                i16++;
                i11 = i;
            }
            for (int i18 = 0; i18 < arrayList2.size(); i18++) {
                byteArrayOutputStream.write((byte[]) arrayList2.get(i18));
            }
            return true;
        } catch (Throwable th3) {
            try {
                byteArrayOutputStream2.close();
                throw th3;
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
                throw th3;
            }
        }
    }

    public static final void GWasM1elztuh(qa1 qa1Var, ie0 ie0Var, hv hvVar, r6 r6Var, hv hvVar2, jd jdVar, qx qxVar, int i) {
        int i2;
        hv hvVar3;
        qx qxVar2;
        le leVar;
        a3 a3Var;
        p41 p41Var;
        a3 a3Var2;
        la1 la1Var;
        hv hvVar4 = hvVar;
        qxVar.Uxq83abb04(511725103);
        if ((i & 6) == 0) {
            i2 = (qxVar.EljAMC1QTz(qa1Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= qxVar.EljAMC1QTz(ie0Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= qxVar.encWxUiV2(hvVar4) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= qxVar.EljAMC1QTz(r6Var) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= qxVar.encWxUiV2(hvVar2) ? 16384 : 8192;
        }
        jd jdVar2 = jdVar;
        if ((196608 & i) == 0) {
            i2 |= qxVar.encWxUiV2(jdVar2) ? 131072 : 65536;
        }
        if (qxVar.dqB83aoLBB(i2 & 1, (74899 & i2) != 74898)) {
            int i3 = i2 & 14;
            boolean z = i3 == 4;
            Object HFYAaqMd6 = qxVar.HFYAaqMd6();
            Object obj = ue.GWasM1elztuh;
            if (z || HFYAaqMd6 == obj) {
                HFYAaqMd6 = new a3(qa1Var, r6Var);
                qxVar.dcDmLGVhzWm(HFYAaqMd6);
            }
            a3 a3Var3 = (a3) HFYAaqMd6;
            boolean z2 = i3 == 4;
            Object HFYAaqMd62 = qxVar.HFYAaqMd6();
            Object obj2 = HFYAaqMd62;
            if (z2 || HFYAaqMd62 == obj) {
                Object[] objArr = {qa1Var.GWasM1elztuh.EljAMC1QTz()};
                p41 p41Var2 = new p41();
                p41Var2.addAll(d5.nXl1EmE5(objArr));
                qxVar.dcDmLGVhzWm(p41Var2);
                obj2 = p41Var2;
            }
            p41 p41Var3 = (p41) obj2;
            boolean z3 = i3 == 4;
            Object HFYAaqMd63 = qxVar.HFYAaqMd6();
            if (z3 || HFYAaqMd63 == obj) {
                long[] jArr = kx0.GWasM1elztuh;
                HFYAaqMd63 = new hg0();
                qxVar.dcDmLGVhzWm(HFYAaqMd63);
            }
            hg0 hg0Var = (hg0) HFYAaqMd63;
            le leVar2 = qa1Var.GWasM1elztuh;
            fo0 fo0Var = qa1Var.xqGvceK5x;
            if (!p41Var3.contains(leVar2.EljAMC1QTz())) {
                p41Var3.clear();
                p41Var3.add(leVar2.EljAMC1QTz());
            }
            if (o30.rQPn8YBR(leVar2.EljAMC1QTz(), fo0Var.getValue())) {
                if (p41Var3.size() != 1 || !o30.rQPn8YBR(p41Var3.get(0), leVar2.EljAMC1QTz())) {
                    p41Var3.clear();
                    p41Var3.add(leVar2.EljAMC1QTz());
                }
                if (hg0Var.OOA6hdeuvCS != 1 || hg0Var.X1lG3V04pd(leVar2.EljAMC1QTz())) {
                    hg0Var.GWasM1elztuh();
                }
                a3Var3.Yi7zF1RB1 = r6Var;
            }
            if (o30.rQPn8YBR(leVar2.EljAMC1QTz(), fo0Var.getValue()) || p41Var3.contains(fo0Var.getValue())) {
                leVar = leVar2;
            } else {
                ListIterator listIterator = p41Var3.listIterator();
                int i4 = 0;
                while (true) {
                    lz lzVar = (lz) listIterator;
                    leVar = leVar2;
                    if (!lzVar.hasNext()) {
                        i4 = -1;
                        break;
                    } else {
                        if (o30.rQPn8YBR(hvVar2.mOu10nynGul(lzVar.next()), hvVar2.mOu10nynGul(fo0Var.getValue()))) {
                            break;
                        }
                        i4++;
                        leVar2 = leVar;
                    }
                }
                if (i4 == -1) {
                    p41Var3.add(fo0Var.getValue());
                } else {
                    p41Var3.set(i4, fo0Var.getValue());
                }
            }
            if (hg0Var.X1lG3V04pd(fo0Var.getValue()) && hg0Var.X1lG3V04pd(leVar.EljAMC1QTz())) {
                qxVar.MjxSquD6Av(1968995539);
                qxVar.WIEu4Ya2g8(false);
                hvVar3 = hvVar4;
                a3Var = a3Var3;
            } else {
                qxVar.MjxSquD6Av(1966410449);
                hg0Var.GWasM1elztuh();
                int size = p41Var3.size();
                int i5 = 0;
                while (i5 < size) {
                    Object obj3 = p41Var3.get(i5);
                    hg0Var.XnEVoBF0td1l(obj3, rj0.YZjbz8VdP5(-23915175, new p2(qa1Var, obj3, hvVar4, a3Var3, p41Var3, jdVar2), qxVar));
                    i5++;
                    hvVar4 = hvVar4;
                    jdVar2 = jdVar;
                }
                hvVar3 = hvVar4;
                a3Var = a3Var3;
                qxVar.WIEu4Ya2g8(false);
            }
            boolean EljAMC1QTz2 = qxVar.EljAMC1QTz(qa1Var.EljAMC1QTz()) | qxVar.EljAMC1QTz(a3Var);
            Object HFYAaqMd64 = qxVar.HFYAaqMd6();
            if (EljAMC1QTz2 || HFYAaqMd64 == obj) {
                HFYAaqMd64 = (qg) hvVar3.mOu10nynGul(a3Var);
                qxVar.dcDmLGVhzWm(HFYAaqMd64);
            }
            qg qgVar = (qg) HFYAaqMd64;
            qa1 qa1Var2 = a3Var.GWasM1elztuh;
            boolean EljAMC1QTz3 = qxVar.EljAMC1QTz(a3Var);
            Object HFYAaqMd65 = qxVar.HFYAaqMd6();
            if (EljAMC1QTz3 || HFYAaqMd65 == obj) {
                HFYAaqMd65 = z50.WRKkgoJXwDn(Boolean.FALSE);
                qxVar.dcDmLGVhzWm(HFYAaqMd65);
            }
            mg0 mg0Var = (mg0) HFYAaqMd65;
            mg0 pog2g9KITJA = z50.pog2g9KITJA(qgVar.xqGvceK5x, qxVar);
            if (o30.rQPn8YBR(qa1Var2.GWasM1elztuh.EljAMC1QTz(), qa1Var2.xqGvceK5x.getValue())) {
                mg0Var.setValue(Boolean.FALSE);
            } else if (pog2g9KITJA.getValue() != null) {
                mg0Var.setValue(Boolean.TRUE);
            }
            boolean booleanValue = ((Boolean) mg0Var.getValue()).booleanValue();
            ie0 ie0Var2 = fe0.GWasM1elztuh;
            if (booleanValue) {
                qxVar.MjxSquD6Av(1353077497);
                a3 a3Var4 = a3Var;
                p41Var = p41Var3;
                qxVar2 = qxVar;
                a3Var2 = a3Var4;
                la1Var = o30.YmKjaVtbfp5Z(a3Var4.GWasM1elztuh, vc0.WIEu4Ya2g8, null, qxVar2, 0, 2);
                boolean EljAMC1QTz4 = qxVar2.EljAMC1QTz(la1Var);
                Object HFYAaqMd66 = qxVar2.HFYAaqMd6();
                if (EljAMC1QTz4 || HFYAaqMd66 == obj) {
                    HFYAaqMd66 = vc0.WRKkgoJXwDn(ie0Var2, 0.0f, 0.0f, 0.0f, null, 520191);
                    qxVar2.dcDmLGVhzWm(HFYAaqMd66);
                }
                ie0Var2 = (ie0) HFYAaqMd66;
                qxVar2.WIEu4Ya2g8(false);
            } else {
                p41Var = p41Var3;
                qxVar2 = qxVar;
                a3Var2 = a3Var;
                qxVar2.MjxSquD6Av(1353343539);
                qxVar2.WIEu4Ya2g8(false);
                la1Var = null;
            }
            ie0 X1lG3V04pd2 = ie0Var.X1lG3V04pd(ie0Var2.X1lG3V04pd(new w2(la1Var, pog2g9KITJA, a3Var2)));
            Object HFYAaqMd67 = qxVar2.HFYAaqMd6();
            if (HFYAaqMd67 == obj) {
                HFYAaqMd67 = new t2(a3Var2);
                qxVar2.dcDmLGVhzWm(HFYAaqMd67);
            }
            t2 t2Var = (t2) HFYAaqMd67;
            int hashCode = Long.hashCode(qxVar2.qugwajBSa59j);
            cp0 E7jCp8Ls2 = qxVar2.E7jCp8Ls();
            ie0 MZhzXH72 = MZhzXH72(qxVar2, X1lG3V04pd2);
            oe.X1lG3V04pd.getClass();
            wu wuVar = ne.Yi7zF1RB1;
            qxVar2.c4eaifQP();
            if (qxVar2.CMh55RymNfS) {
                qxVar2.rQPn8YBR(wuVar);
            } else {
                qxVar2.K0ReC6MK();
            }
            l60.WRKkgoJXwDn(ne.OOA6hdeuvCS, qxVar2, t2Var);
            l60.WRKkgoJXwDn(ne.xqGvceK5x, qxVar2, E7jCp8Ls2);
            Object valueOf = Integer.valueOf(hashCode);
            lv lvVar = ne.EljAMC1QTz;
            if (qxVar2.CMh55RymNfS) {
                qxVar2.Yi7zF1RB1(lvVar, valueOf);
            }
            l60.WdrkLMV3xh(qxVar2, ne.AvO7iQsrTN);
            l60.WRKkgoJXwDn(ne.X1lG3V04pd, qxVar2, MZhzXH72);
            qxVar2.MjxSquD6Av(-860173498);
            int size2 = p41Var.size();
            int i6 = 0;
            while (i6 < size2) {
                p41 p41Var4 = p41Var;
                Object obj4 = p41Var4.get(i6);
                qxVar2.CMh55RymNfS(-2026002954, 0, hvVar2.mOu10nynGul(obj4), null);
                lv lvVar2 = (lv) hg0Var.AvO7iQsrTN(obj4);
                if (lvVar2 == null) {
                    qxVar2.MjxSquD6Av(1618454323);
                } else {
                    qxVar2.MjxSquD6Av(-2026001778);
                    lvVar2.EljAMC1QTz(qxVar2, 0);
                }
                qxVar2.WIEu4Ya2g8(false);
                qxVar2.WIEu4Ya2g8(false);
                i6++;
                p41Var = p41Var4;
            }
            qxVar2.WIEu4Ya2g8(false);
            qxVar2.WIEu4Ya2g8(true);
        } else {
            hvVar3 = hvVar4;
            qxVar2 = qxVar;
            qxVar2.YXi2hvwn7WL();
        }
        at0 Mjvvu5DE = qxVar2.Mjvvu5DE();
        if (Mjvvu5DE != null) {
            Mjvvu5DE.xqGvceK5x = new q2(qa1Var, ie0Var, hvVar3, r6Var, hvVar2, jdVar, i);
        }
    }

    public static gh HFYAaqMd6(eh ehVar, gh ghVar) {
        ghVar.getClass();
        return ghVar == vp.OOA6hdeuvCS ? ehVar : (gh) ghVar.WIEu4Ya2g8(new pd(14), ehVar);
    }

    public static final y20 J3Xc8BaqpN8(kt0 kt0Var) {
        return new y20(Math.round(kt0Var.GWasM1elztuh), Math.round(kt0Var.Yi7zF1RB1), Math.round(kt0Var.X1lG3V04pd), Math.round(kt0Var.xqGvceK5x));
    }

    public static final boolean JFJ3QoxA(d01 d01Var, Resources resources) {
        Object AvO7iQsrTN2 = d01Var.xqGvceK5x.OOA6hdeuvCS.AvO7iQsrTN(h01.GWasM1elztuh);
        if (AvO7iQsrTN2 == null) {
            AvO7iQsrTN2 = null;
        }
        List list = (List) AvO7iQsrTN2;
        return !o30.k8h8IjolWQ(d01Var) && (d01Var.xqGvceK5x.AvO7iQsrTN || (d01Var.YmKjaVtbfp5Z() && ((list != null ? (String) rb.YTyqgZhdF(list) : null) != null || EXrPz3p7hFb(d01Var) != null || k8h8IjolWQ(d01Var, resources) != null || M3K9sHhK(d01Var))));
    }

    public static void JFXS9W1rB5s4(ByteArrayOutputStream byteArrayOutputStream, pl plVar) {
        int i = 0;
        for (Map.Entry entry : plVar.mOu10nynGul.entrySet()) {
            int intValue = ((Integer) entry.getKey()).intValue();
            if ((((Integer) entry.getValue()).intValue() & 1) != 0) {
                fb1.EDwNPVYuViP0(byteArrayOutputStream, intValue - i);
                fb1.EDwNPVYuViP0(byteArrayOutputStream, 0);
                i = intValue;
            }
        }
    }

    public static final boolean M3K9sHhK(d01 d01Var) {
        Object AvO7iQsrTN2 = d01Var.xqGvceK5x.OOA6hdeuvCS.AvO7iQsrTN(h01.A1EKNP6CxJ);
        if (AvO7iQsrTN2 == null) {
            AvO7iQsrTN2 = null;
        }
        w91 w91Var = (w91) AvO7iQsrTN2;
        hg0 hg0Var = d01Var.xqGvceK5x.OOA6hdeuvCS;
        Object AvO7iQsrTN3 = hg0Var.AvO7iQsrTN(h01.WRKkgoJXwDn);
        if (AvO7iQsrTN3 == null) {
            AvO7iQsrTN3 = null;
        }
        ov0 ov0Var = (ov0) AvO7iQsrTN3;
        boolean z = w91Var != null;
        Object AvO7iQsrTN4 = hg0Var.AvO7iQsrTN(h01.eUH21U3apd);
        if (((Boolean) (AvO7iQsrTN4 != null ? AvO7iQsrTN4 : null)) == null || (ov0Var != null && ov0Var.GWasM1elztuh == 4)) {
            return z;
        }
        return true;
    }

    public static ie0 MItybXapHX(ie0 ie0Var, u80 u80Var, xm0 xm0Var, m0 m0Var, boolean z, fk fkVar, tf0 tf0Var) {
        xm0 xm0Var2 = xm0.OOA6hdeuvCS;
        fe0 fe0Var = fe0.GWasM1elztuh;
        return ie0Var.X1lG3V04pd(xm0Var == xm0Var2 ? WIEu4Ya2g8(fe0Var, tz.X1lG3V04pd) : WIEu4Ya2g8(fe0Var, tz.Yi7zF1RB1)).X1lG3V04pd(new cy0(m0Var, fkVar, tf0Var, xm0Var, u80Var, z, false));
    }

    public static final ie0 MZhzXH72(qx qxVar, ie0 ie0Var) {
        qxVar.MjxSquD6Av(439770924);
        ie0 A1EKNP6CxJ = A1EKNP6CxJ(qxVar, ie0Var);
        qxVar.WIEu4Ya2g8(false);
        return A1EKNP6CxJ;
    }

    public static int Mjvvu5DE(Comparable comparable, Comparable comparable2) {
        if (comparable == comparable2) {
            return 0;
        }
        if (comparable == null) {
            return -1;
        }
        if (comparable2 == null) {
            return 1;
        }
        return comparable.compareTo(comparable2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x0085, code lost:
    
        if (r8 > 4611686018427387903L) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x009f, code lost:
    
        if (r8 > 4611686018427387903L) goto L32;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final long MjxSquD6Av(long j, mo moVar) {
        long j2;
        TimeUnit timeUnit = moVar.OOA6hdeuvCS;
        TimeUnit timeUnit2 = TimeUnit.NANOSECONDS;
        long convert = timeUnit.convert(4611686018426999999L, timeUnit2);
        if ((-convert) <= j && j <= convert) {
            long convert2 = timeUnit2.convert(j, timeUnit);
            k61 k61Var = jo.OOA6hdeuvCS;
            long j3 = convert2 << 1;
            int i = lo.GWasM1elztuh;
            return j3;
        }
        if (moVar.compareTo(mo.MILLISECONDS) < 0) {
            return lv06NcmrQ(o50.mOu10nynGul(TimeUnit.MILLISECONDS.convert(j, timeUnit)));
        }
        long signum = Long.signum(j);
        if (j < -9223372036854775807L) {
            j = -9223372036854775807L;
        }
        long abs = Math.abs(j);
        int ordinal = moVar.ordinal();
        long j4 = 0;
        if (ordinal == 2) {
            j2 = 1;
        } else if (ordinal == 3) {
            j2 = 1000;
        } else if (ordinal == 4) {
            j2 = 60000;
        } else if (ordinal == 5) {
            j2 = 3600000;
        } else {
            if (ordinal != 6) {
                o4.EljAMC1QTz(moVar, "Wrong unit for millisMultiplier: ");
                return 0L;
            }
            j2 = 86400000;
        }
        if (abs != 0) {
            j4 = 4611686018427387903L;
            if (abs == 1) {
                if (j2 <= 4611686018427387903L) {
                    abs = j2;
                    return lv06NcmrQ(signum * abs);
                }
            } else if (j2 != 1) {
                int numberOfLeadingZeros = (128 - Long.numberOfLeadingZeros(abs)) - Long.numberOfLeadingZeros(j2);
                if (numberOfLeadingZeros < 63) {
                    abs *= j2;
                } else if (numberOfLeadingZeros <= 63) {
                    abs *= j2;
                }
                return lv06NcmrQ(signum * abs);
            }
        }
        abs = j4;
        return lv06NcmrQ(signum * abs);
    }

    public static final void OOA6hdeuvCS(int i, final wu wuVar, final wu wuVar2, final hv hvVar, kx kxVar, qx qxVar, int i2) {
        kx kxVar2;
        int i3;
        kx kxVar3;
        aa aaVar;
        final p31 p31Var;
        kx kxVar4;
        wuVar.getClass();
        wuVar2.getClass();
        hvVar.getClass();
        qxVar.Uxq83abb04(2113586178);
        int i4 = i2 | (qxVar.xqGvceK5x(i) ? 4 : 2) | (qxVar.encWxUiV2(wuVar) ? 32 : 16) | (qxVar.encWxUiV2(wuVar2) ? 256 : 128) | (qxVar.encWxUiV2(hvVar) ? 2048 : 1024) | 8192;
        if (qxVar.dqB83aoLBB(i4 & 1, (i4 & 9363) != 9362)) {
            qxVar.qugwajBSa59j();
            if ((i2 & 1) == 0 || qxVar.WRKkgoJXwDn()) {
                ff1 GWasM1elztuh2 = eb0.GWasM1elztuh(qxVar);
                if (GWasM1elztuh2 == null) {
                    o4.jivtDDk9H("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                    return;
                } else {
                    kx kxVar5 = (kx) ki1.DmJncFq5(st0.GWasM1elztuh(kx.class), GWasM1elztuh2.OOA6hdeuvCS(), ki1.WRKkgoJXwDn(GWasM1elztuh2), b50.GWasM1elztuh(qxVar));
                    i3 = i4 & (-57345);
                    kxVar3 = kxVar5;
                }
            } else {
                qxVar.YXi2hvwn7WL();
                i3 = i4 & (-57345);
                kxVar3 = kxVar;
            }
            qxVar.YmKjaVtbfp5Z();
            mg0 Mjvvu5DE = vc0.Mjvvu5DE(kxVar3.X1lG3V04pd, qxVar);
            Object HFYAaqMd6 = qxVar.HFYAaqMd6();
            Object obj = ue.GWasM1elztuh;
            if (HFYAaqMd6 == obj) {
                HFYAaqMd6 = new p31();
                qxVar.dcDmLGVhzWm(HFYAaqMd6);
            }
            p31 p31Var2 = (p31) HFYAaqMd6;
            Object HFYAaqMd62 = qxVar.HFYAaqMd6();
            if (HFYAaqMd62 == obj) {
                HFYAaqMd62 = ki1.WdrkLMV3xh(qxVar);
                qxVar.dcDmLGVhzWm(HFYAaqMd62);
            }
            final ph phVar = (ph) HFYAaqMd62;
            final View view = (View) qxVar.JFJ3QoxA(r.EljAMC1QTz);
            Integer valueOf = Integer.valueOf(i);
            boolean encWxUiV22 = qxVar.encWxUiV2(kxVar3) | ((i3 & 14) == 4);
            Object HFYAaqMd63 = qxVar.HFYAaqMd6();
            if (encWxUiV22 || HFYAaqMd63 == obj) {
                HFYAaqMd63 = new zw(kxVar3, i, (vg) null);
                qxVar.dcDmLGVhzWm(HFYAaqMd63);
            }
            ki1.encWxUiV2((lv) HFYAaqMd63, qxVar, valueOf);
            boolean encWxUiV23 = qxVar.encWxUiV2(kxVar3);
            Object HFYAaqMd64 = qxVar.HFYAaqMd6();
            if (encWxUiV23 || HFYAaqMd64 == obj) {
                HFYAaqMd64 = new E7jCp8Ls(5, kxVar3);
                qxVar.dcDmLGVhzWm(HFYAaqMd64);
            }
            d70.GWasM1elztuh(null, (hv) HFYAaqMd64, qxVar, 6);
            final String lv06NcmrQ = w60.lv06NcmrQ(R.string.message_no_scans, qxVar);
            final String lv06NcmrQ2 = w60.lv06NcmrQ(R.string.message_nothing_to_scan, qxVar);
            aa aaVar2 = kxVar3.OOA6hdeuvCS;
            boolean EljAMC1QTz2 = ((i3 & 112) == 32) | ((i3 & 896) == 256) | ((i3 & 7168) == 2048) | qxVar.EljAMC1QTz(lv06NcmrQ) | qxVar.EljAMC1QTz(lv06NcmrQ2) | qxVar.encWxUiV2(phVar) | qxVar.encWxUiV2(view);
            Object HFYAaqMd65 = qxVar.HFYAaqMd6();
            if (EljAMC1QTz2 || HFYAaqMd65 == obj) {
                aaVar = aaVar2;
                p31Var = p31Var2;
                Object obj2 = new hv() { // from class: vw
                    @Override // defpackage.hv
                    public final Object mOu10nynGul(Object obj3) {
                        String str;
                        dw dwVar = (dw) obj3;
                        dwVar.getClass();
                        if (dwVar.equals(zv.GWasM1elztuh)) {
                            wu.this.GWasM1elztuh();
                        } else if (dwVar.equals(bw.GWasM1elztuh)) {
                            wuVar2.GWasM1elztuh();
                        } else if (dwVar instanceof aw) {
                            hvVar.mOu10nynGul(Integer.valueOf(((aw) dwVar).GWasM1elztuh));
                        } else {
                            int i5 = 0;
                            if (dwVar instanceof cw) {
                                int ordinal = ((cw) dwVar).GWasM1elztuh.ordinal();
                                if (ordinal == 0) {
                                    str = lv06NcmrQ;
                                } else {
                                    if (ordinal != 1) {
                                        o4.xqGvceK5x();
                                        return null;
                                    }
                                    str = lv06NcmrQ2;
                                }
                                p31 p31Var3 = p31Var;
                                m31 m31Var = (m31) p31Var3.Yi7zF1RB1.getValue();
                                if (m31Var != null) {
                                    m31Var.GWasM1elztuh();
                                }
                                fb1.MZhzXH72(phVar, null, new ax(p31Var3, str, null, 0), 3);
                            } else {
                                if (!(dwVar instanceof yv)) {
                                    o4.xqGvceK5x();
                                    return null;
                                }
                                int ordinal2 = ((yv) dwVar).GWasM1elztuh.ordinal();
                                if (ordinal2 == 0) {
                                    i5 = 1;
                                } else if (ordinal2 == 1) {
                                    i5 = 3;
                                } else if (ordinal2 != 2) {
                                    o4.xqGvceK5x();
                                    return null;
                                }
                                view.performHapticFeedback(i5);
                            }
                        }
                        return kc1.GWasM1elztuh;
                    }
                };
                qxVar.dcDmLGVhzWm(obj2);
                HFYAaqMd65 = obj2;
            } else {
                aaVar = aaVar2;
                p31Var = p31Var2;
            }
            vc0.Yi7zF1RB1(aaVar, (hv) HFYAaqMd65, qxVar, 0);
            cx cxVar = (cx) Mjvvu5DE.getValue();
            boolean encWxUiV24 = qxVar.encWxUiV2(kxVar3);
            Object HFYAaqMd66 = qxVar.HFYAaqMd6();
            if (encWxUiV24 || HFYAaqMd66 == obj) {
                kxVar4 = kxVar3;
                Object oOA6hdeuvCS = new OOA6hdeuvCS(1, kxVar4, kx.class, "onIntent", "onIntent(Lcom/combinations/level/experts/core/mvi/UiIntent;)V", 0, 0, 1);
                qxVar.dcDmLGVhzWm(oOA6hdeuvCS);
                HFYAaqMd66 = oOA6hdeuvCS;
            } else {
                kxVar4 = kxVar3;
            }
            X1lG3V04pd(cxVar, p31Var, (hv) ((vv) HFYAaqMd66), qxVar, 48);
            kxVar2 = kxVar4;
        } else {
            qxVar.YXi2hvwn7WL();
            kxVar2 = kxVar;
        }
        at0 Mjvvu5DE2 = qxVar.Mjvvu5DE();
        if (Mjvvu5DE2 != null) {
            Mjvvu5DE2.xqGvceK5x = new Hc2GqxcqBiX(i, wuVar, wuVar2, hvVar, kxVar2, i2);
        }
    }

    public static String Uxq83abb04(int i) {
        return i == 0 ? "Clear" : i == 1 ? "Src" : i == 2 ? "Dst" : i == 3 ? "SrcOver" : i == 4 ? "DstOver" : i == 5 ? "SrcIn" : i == 6 ? "DstIn" : i == 7 ? "SrcOut" : i == 8 ? "DstOut" : i == 9 ? "SrcAtop" : i == 10 ? "DstAtop" : i == 11 ? "Xor" : i == 12 ? "Plus" : i == 13 ? "Modulate" : i == 14 ? "Screen" : i == 15 ? "Overlay" : i == 16 ? "Darken" : i == 17 ? "Lighten" : i == 18 ? "ColorDodge" : i == 19 ? "ColorBurn" : i == 20 ? "HardLight" : i == 21 ? "Softlight" : i == 22 ? "Difference" : i == 23 ? "Exclusion" : i == 24 ? "Multiply" : i == 25 ? "Hue" : i == 26 ? "Saturation" : i == 27 ? "Color" : i == 28 ? "Luminosity" : "Unknown";
    }

    public static pl[] VeqTn1PQw7(FileInputStream fileInputStream, byte[] bArr, byte[] bArr2, pl[] plVarArr) {
        byte[] bArr3 = o30.iwATDS1i01k;
        if (!Arrays.equals(bArr, bArr3)) {
            if (!Arrays.equals(bArr, o30.WIEu4Ya2g8)) {
                o4.jivtDDk9H("Unsupported meta version");
                return null;
            }
            int CMh55RymNfS = (int) fb1.CMh55RymNfS(fileInputStream, 2);
            byte[] YXi2hvwn7WL = fb1.YXi2hvwn7WL(fileInputStream, (int) fb1.CMh55RymNfS(fileInputStream, 4), (int) fb1.CMh55RymNfS(fileInputStream, 4));
            if (fileInputStream.read() > 0) {
                o4.jivtDDk9H("Content found after the end of file");
                return null;
            }
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(YXi2hvwn7WL);
            try {
                pl[] YXi2hvwn7WL2 = YXi2hvwn7WL(byteArrayInputStream, bArr2, CMh55RymNfS, plVarArr);
                byteArrayInputStream.close();
                return YXi2hvwn7WL2;
            } catch (Throwable th) {
                try {
                    byteArrayInputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        if (Arrays.equals(o30.JFJ3QoxA, bArr2)) {
            o4.jivtDDk9H("Requires new Baseline Profile Metadata. Please rebuild the APK with Android Gradle Plugin 7.2 Canary 7 or higher");
            return null;
        }
        if (!Arrays.equals(bArr, bArr3)) {
            o4.jivtDDk9H("Unsupported meta version");
            return null;
        }
        int CMh55RymNfS2 = (int) fb1.CMh55RymNfS(fileInputStream, 1);
        byte[] YXi2hvwn7WL3 = fb1.YXi2hvwn7WL(fileInputStream, (int) fb1.CMh55RymNfS(fileInputStream, 4), (int) fb1.CMh55RymNfS(fileInputStream, 4));
        if (fileInputStream.read() > 0) {
            o4.jivtDDk9H("Content found after the end of file");
            return null;
        }
        ByteArrayInputStream byteArrayInputStream2 = new ByteArrayInputStream(YXi2hvwn7WL3);
        try {
            pl[] z19UFEN2I = z19UFEN2I(byteArrayInputStream2, CMh55RymNfS2, plVarArr);
            byteArrayInputStream2.close();
            return z19UFEN2I;
        } catch (Throwable th3) {
            try {
                byteArrayInputStream2.close();
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
            }
            throw th3;
        }
    }

    public static final ie0 WIEu4Ya2g8(ie0 ie0Var, z11 z11Var) {
        return vc0.WRKkgoJXwDn(ie0Var, 0.0f, 0.0f, 0.0f, z11Var, 518143);
    }

    public static String WRKkgoJXwDn(String str, String str2, byte[] bArr) {
        byte[] bArr2 = o30.XnEVoBF0td1l;
        byte[] bArr3 = o30.uFEq9NpZ;
        String str3 = (Arrays.equals(bArr, bArr3) || Arrays.equals(bArr, bArr2)) ? ":" : "!";
        if (str.length() <= 0) {
            if ("!".equals(str3)) {
                return str2.replace(":", "!");
            }
            if (":".equals(str3)) {
                return str2.replace("!", ":");
            }
        } else {
            if (str2.equals("classes.dex")) {
                return str;
            }
            if (str2.contains("!") || str2.contains(":")) {
                if ("!".equals(str3)) {
                    return str2.replace(":", "!");
                }
                if (":".equals(str3)) {
                    return str2.replace("!", ":");
                }
            } else if (!str2.endsWith(".apk")) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append((Arrays.equals(bArr, bArr3) || Arrays.equals(bArr, bArr2)) ? ":" : "!");
                sb.append(str2);
                return sb.toString();
            }
        }
        return str2;
    }

    public static final String WdrkLMV3xh(long j) {
        long j2 = j / 1000;
        if (j2 < 0) {
            j2 = 0;
        }
        return String.format("%d:%02d", Arrays.copyOf(new Object[]{Long.valueOf(j2 / 60), Long.valueOf(j2 % 60)}, 2));
    }

    public static final void X1lG3V04pd(cx cxVar, p31 p31Var, hv hvVar, qx qxVar, int i) {
        qxVar.Uxq83abb04(-816108583);
        int i2 = (qxVar.encWxUiV2(cxVar) ? 4 : 2) | i | (qxVar.encWxUiV2(hvVar) ? 256 : 128);
        if (qxVar.dqB83aoLBB(i2 & 1, (i2 & 147) != 146)) {
            List list = tn0.GWasM1elztuh;
            xy0 GWasM1elztuh2 = tn0.GWasM1elztuh(cxVar.X1lG3V04pd);
            ki1.iwATDS1i01k(GWasM1elztuh2.GWasM1elztuh, null, rj0.YZjbz8VdP5(1936529209, new ww(p31Var, cxVar, hvVar, GWasM1elztuh2, 0), qxVar), qxVar, 384);
        } else {
            qxVar.YXi2hvwn7WL();
        }
        at0 Mjvvu5DE = qxVar.Mjvvu5DE();
        if (Mjvvu5DE != null) {
            Mjvvu5DE.xqGvceK5x = new xw(cxVar, p31Var, hvVar, i, 0);
        }
    }

    public static final zt Y6hRI1cF8(Context context) {
        k61 k61Var = new k61(8);
        context.getApplicationContext();
        return new zt(k61Var, new s0(Build.VERSION.SDK_INT >= 31 ? pu.GWasM1elztuh.GWasM1elztuh(context) : 0));
    }

    public static pl[] YXi2hvwn7WL(ByteArrayInputStream byteArrayInputStream, byte[] bArr, int i, pl[] plVarArr) {
        pl plVar;
        if (byteArrayInputStream.available() == 0) {
            return new pl[0];
        }
        if (i != plVarArr.length) {
            o4.jivtDDk9H("Mismatched number of dex files found in metadata");
            return null;
        }
        for (int i2 = 0; i2 < i; i2++) {
            fb1.CMh55RymNfS(byteArrayInputStream, 2);
            String str = new String(fb1.z19UFEN2I(byteArrayInputStream, (int) fb1.CMh55RymNfS(byteArrayInputStream, 2)), StandardCharsets.UTF_8);
            long CMh55RymNfS = fb1.CMh55RymNfS(byteArrayInputStream, 4);
            int CMh55RymNfS2 = (int) fb1.CMh55RymNfS(byteArrayInputStream, 2);
            if (plVarArr.length > 0) {
                int indexOf = str.indexOf("!");
                if (indexOf < 0) {
                    indexOf = str.indexOf(":");
                }
                String substring = indexOf > 0 ? str.substring(indexOf + 1) : str;
                for (int i3 = 0; i3 < plVarArr.length; i3++) {
                    if (plVarArr[i3].Yi7zF1RB1.equals(substring)) {
                        plVar = plVarArr[i3];
                        break;
                    }
                }
            }
            plVar = null;
            if (plVar == null) {
                o4.jivtDDk9H("Missing profile key: ".concat(str));
                return null;
            }
            plVar.xqGvceK5x = CMh55RymNfS;
            int[] dqB83aoLBB = dqB83aoLBB(byteArrayInputStream, CMh55RymNfS2);
            if (Arrays.equals(bArr, o30.uFEq9NpZ)) {
                plVar.OOA6hdeuvCS = CMh55RymNfS2;
                plVar.encWxUiV2 = dqB83aoLBB;
            }
        }
        return plVarArr;
    }

    public static final boolean YZjbz8VdP5(long j) {
        return (j & 2) != 0;
    }

    public static final long Yi7zF1RB1(float f, boolean z, boolean z2) {
        return (((z ? 1L : 0L) | (z2 ? 2L : 0L)) & 4294967295L) | (Float.floatToRawIntBits(f) << 32);
    }

    public static final int YmKjaVtbfp5Z(long j, long j2) {
        boolean eUH21U3apd = eUH21U3apd(j);
        if (eUH21U3apd != eUH21U3apd(j2)) {
            return eUH21U3apd ? -1 : 1;
        }
        return (Math.min(pog2g9KITJA(j), pog2g9KITJA(j2)) >= 0.0f && YZjbz8VdP5(j) != YZjbz8VdP5(j2)) ? YZjbz8VdP5(j) ? -1 : 1 : (int) Math.signum(pog2g9KITJA(j) - pog2g9KITJA(j2));
    }

    public static void ZCWXqiC0(ByteArrayOutputStream byteArrayOutputStream, int i, pl plVar) {
        int i2 = plVar.AvO7iQsrTN;
        byte[] bArr = new byte[(((Integer.bitCount(i & (-2)) * i2) + 7) & (-8)) / 8];
        for (Map.Entry entry : plVar.mOu10nynGul.entrySet()) {
            int intValue = ((Integer) entry.getKey()).intValue();
            int intValue2 = ((Integer) entry.getValue()).intValue();
            int i3 = 0;
            for (int i4 = 1; i4 <= 4; i4 <<= 1) {
                if (i4 != 1 && (i4 & i) != 0) {
                    if ((i4 & intValue2) == i4) {
                        int i5 = (i3 * i2) + intValue;
                        int i6 = i5 / 8;
                        bArr[i6] = (byte) ((1 << (i5 % 8)) | bArr[i6]);
                    }
                    i3++;
                }
            }
        }
        byteArrayOutputStream.write(bArr);
    }

    public static eh arNh8D4Z5gB(eh ehVar, fh fhVar) {
        fhVar.getClass();
        if (o30.rQPn8YBR(ehVar.getKey(), fhVar)) {
            return ehVar;
        }
        return null;
    }

    public static void c4eaifQP(ByteArrayOutputStream byteArrayOutputStream, pl plVar) {
        JFXS9W1rB5s4(byteArrayOutputStream, plVar);
        int i = plVar.AvO7iQsrTN;
        int[] iArr = plVar.encWxUiV2;
        int length = iArr.length;
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            int i4 = iArr[i2];
            fb1.EDwNPVYuViP0(byteArrayOutputStream, i4 - i3);
            i2++;
            i3 = i4;
        }
        byte[] bArr = new byte[(((i * 2) + 7) & (-8)) / 8];
        for (Map.Entry entry : plVar.mOu10nynGul.entrySet()) {
            int intValue = ((Integer) entry.getKey()).intValue();
            int intValue2 = ((Integer) entry.getValue()).intValue();
            if ((intValue2 & 2) != 0) {
                int i5 = intValue / 8;
                bArr[i5] = (byte) (bArr[i5] | (1 << (intValue % 8)));
            }
            if ((intValue2 & 4) != 0) {
                int i6 = intValue + i;
                int i7 = i6 / 8;
                bArr[i7] = (byte) ((1 << (i6 % 8)) | bArr[i7]);
            }
        }
        byteArrayOutputStream.write(bArr);
    }

    public static we1 cilMamHF(Class cls) {
        try {
            Constructor declaredConstructor = cls.getDeclaredConstructor(null);
            if (!Modifier.isPublic(declaredConstructor.getModifiers())) {
                throw new RuntimeException("Cannot create an instance of " + cls);
            }
            try {
                Object newInstance = declaredConstructor.newInstance(null);
                newInstance.getClass();
                return (we1) newInstance;
            } catch (IllegalAccessException e) {
                o4.rQPn8YBR("Cannot create an instance of ", cls, e);
                return null;
            } catch (InstantiationException e2) {
                o4.rQPn8YBR("Cannot create an instance of ", cls, e2);
                return null;
            }
        } catch (NoSuchMethodException e3) {
            o4.rQPn8YBR("Cannot create an instance of ", cls, e3);
            return null;
        }
    }

    public static int[] dqB83aoLBB(ByteArrayInputStream byteArrayInputStream, int i) {
        int[] iArr = new int[i];
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            i2 += (int) fb1.CMh55RymNfS(byteArrayInputStream, 2);
            iArr[i3] = i2;
        }
        return iArr;
    }

    public static final boolean eUH21U3apd(long j) {
        return (j & 1) != 0;
    }

    public static final boolean encWxUiV2(d01 d01Var) {
        zz0 rQPn8YBR2 = d01Var.rQPn8YBR();
        return !rQPn8YBR2.OOA6hdeuvCS.X1lG3V04pd(h01.JFJ3QoxA);
    }

    public static byte[] jivtDDk9H(pl[] plVarArr, byte[] bArr) {
        int i = 0;
        int i2 = 0;
        for (pl plVar : plVarArr) {
            i2 += ((((plVar.AvO7iQsrTN * 2) + 7) & (-8)) / 8) + (plVar.OOA6hdeuvCS * 2) + WRKkgoJXwDn(plVar.GWasM1elztuh, plVar.Yi7zF1RB1, bArr).getBytes(StandardCharsets.UTF_8).length + 16 + plVar.EljAMC1QTz;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(i2);
        if (Arrays.equals(bArr, o30.E7jCp8Ls)) {
            int length = plVarArr.length;
            while (i < length) {
                pl plVar2 = plVarArr[i];
                mqNvfisv7(byteArrayOutputStream, plVar2, WRKkgoJXwDn(plVar2.GWasM1elztuh, plVar2.Yi7zF1RB1, bArr));
                c4eaifQP(byteArrayOutputStream, plVar2);
                i++;
            }
        } else {
            for (pl plVar3 : plVarArr) {
                mqNvfisv7(byteArrayOutputStream, plVar3, WRKkgoJXwDn(plVar3.GWasM1elztuh, plVar3.Yi7zF1RB1, bArr));
            }
            int length2 = plVarArr.length;
            while (i < length2) {
                c4eaifQP(byteArrayOutputStream, plVarArr[i]);
                i++;
            }
        }
        if (byteArrayOutputStream.size() == i2) {
            return byteArrayOutputStream.toByteArray();
        }
        throw new IllegalStateException("The bytes saved do not match expectation. actual=" + byteArrayOutputStream.size() + " expected=" + i2);
    }

    public static final String k8h8IjolWQ(d01 d01Var, Resources resources) {
        zz0 zz0Var = d01Var.xqGvceK5x;
        zz0 zz0Var2 = d01Var.xqGvceK5x;
        Object AvO7iQsrTN2 = zz0Var.OOA6hdeuvCS.AvO7iQsrTN(h01.Yi7zF1RB1);
        String str = null;
        if (AvO7iQsrTN2 == null) {
            AvO7iQsrTN2 = null;
        }
        hg0 hg0Var = zz0Var2.OOA6hdeuvCS;
        Object AvO7iQsrTN3 = hg0Var.AvO7iQsrTN(h01.A1EKNP6CxJ);
        if (AvO7iQsrTN3 == null) {
            AvO7iQsrTN3 = null;
        }
        w91 w91Var = (w91) AvO7iQsrTN3;
        Object AvO7iQsrTN4 = hg0Var.AvO7iQsrTN(h01.WRKkgoJXwDn);
        if (AvO7iQsrTN4 == null) {
            AvO7iQsrTN4 = null;
        }
        ov0 ov0Var = (ov0) AvO7iQsrTN4;
        if (w91Var != null) {
            int ordinal = w91Var.ordinal();
            if (ordinal != 0) {
                if (ordinal != 1) {
                    if (ordinal != 2) {
                        o4.xqGvceK5x();
                        return null;
                    }
                    if (AvO7iQsrTN2 == null) {
                        AvO7iQsrTN2 = resources.getString(R.string.indeterminate);
                    }
                } else if (ov0Var != null && ov0Var.GWasM1elztuh == 2 && AvO7iQsrTN2 == null) {
                    AvO7iQsrTN2 = resources.getString(R.string.state_off);
                }
            } else if (ov0Var != null && ov0Var.GWasM1elztuh == 2 && AvO7iQsrTN2 == null) {
                AvO7iQsrTN2 = resources.getString(R.string.state_on);
            }
        }
        Object AvO7iQsrTN5 = hg0Var.AvO7iQsrTN(h01.eUH21U3apd);
        if (AvO7iQsrTN5 == null) {
            AvO7iQsrTN5 = null;
        }
        Boolean bool = (Boolean) AvO7iQsrTN5;
        if (bool != null) {
            boolean booleanValue = bool.booleanValue();
            if ((ov0Var == null || ov0Var.GWasM1elztuh != 4) && AvO7iQsrTN2 == null) {
                AvO7iQsrTN2 = booleanValue ? resources.getString(R.string.selected) : resources.getString(R.string.not_selected);
            }
        }
        Object AvO7iQsrTN6 = hg0Var.AvO7iQsrTN(h01.X1lG3V04pd);
        if (AvO7iQsrTN6 == null) {
            AvO7iQsrTN6 = null;
        }
        ks0 ks0Var = (ks0) AvO7iQsrTN6;
        if (ks0Var != null) {
            if (ks0Var != ks0.Yi7zF1RB1) {
                if (AvO7iQsrTN2 == null) {
                    AvO7iQsrTN2 = resources.getString(R.string.template_percent, 0);
                }
            } else if (AvO7iQsrTN2 == null) {
                AvO7iQsrTN2 = resources.getString(R.string.in_progress);
            }
        }
        k01 k01Var = h01.AEn1Rrio;
        if (hg0Var.X1lG3V04pd(k01Var)) {
            hg0 hg0Var2 = new d01(d01Var.GWasM1elztuh, true, d01Var.X1lG3V04pd, zz0Var2).rQPn8YBR().OOA6hdeuvCS;
            Object AvO7iQsrTN7 = hg0Var2.AvO7iQsrTN(h01.GWasM1elztuh);
            if (AvO7iQsrTN7 == null) {
                AvO7iQsrTN7 = null;
            }
            Collection collection = (Collection) AvO7iQsrTN7;
            if (collection == null || collection.isEmpty()) {
                Object AvO7iQsrTN8 = hg0Var2.AvO7iQsrTN(h01.M3K9sHhK);
                if (AvO7iQsrTN8 == null) {
                    AvO7iQsrTN8 = null;
                }
                Collection collection2 = (Collection) AvO7iQsrTN8;
                if (collection2 == null || collection2.isEmpty()) {
                    Object AvO7iQsrTN9 = hg0Var2.AvO7iQsrTN(k01Var);
                    if (AvO7iQsrTN9 == null) {
                        AvO7iQsrTN9 = null;
                    }
                    CharSequence charSequence = (CharSequence) AvO7iQsrTN9;
                    if (charSequence == null || charSequence.length() == 0) {
                        str = resources.getString(R.string.state_empty);
                    }
                }
            }
            AvO7iQsrTN2 = str;
        }
        return (String) AvO7iQsrTN2;
    }

    public static final long lv06NcmrQ(long j) {
        long j2 = (j << 1) + 1;
        jo.OOA6hdeuvCS.getClass();
        int i = lo.GWasM1elztuh;
        return j2;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static iu mE4lRynR(Context context) {
        ProviderInfo providerInfo;
        gu guVar;
        ApplicationInfo applicationInfo;
        int i = 25;
        k61 akVar = Build.VERSION.SDK_INT >= 28 ? new ak(i) : new k61(i);
        PackageManager packageManager = context.getPackageManager();
        n4.AvO7iQsrTN(packageManager, "Package manager required to locate emoji font provider");
        Iterator<ResolveInfo> it = packageManager.queryIntentContentProviders(new Intent("androidx.content.action.LOAD_EMOJI_FONT"), 0).iterator();
        while (true) {
            if (!it.hasNext()) {
                providerInfo = null;
                break;
            }
            providerInfo = it.next().providerInfo;
            if (providerInfo != null && (applicationInfo = providerInfo.applicationInfo) != null && (applicationInfo.flags & 1) == 1) {
                break;
            }
        }
        if (providerInfo != null) {
            try {
                String str = providerInfo.authority;
                String str2 = providerInfo.packageName;
                Signature[] JFJ3QoxA2 = akVar.JFJ3QoxA(packageManager, str2);
                ArrayList arrayList = new ArrayList();
                for (Signature signature : JFJ3QoxA2) {
                    arrayList.add(signature.toByteArray());
                }
                guVar = new gu(str, str2, "emojicompat-emoji-font", Collections.singletonList(arrayList), null, null);
            } catch (PackageManager.NameNotFoundException e) {
                Log.wtf("emoji2.text.DefaultEmojiConfig", e);
            }
            if (guVar != null) {
                return null;
            }
            return new iu(new hu(context, guVar));
        }
        guVar = null;
        if (guVar != null) {
        }
    }

    public static final boolean mOu10nynGul(y81 y81Var) {
        bq0 bq0Var;
        eq0 eq0Var = y81Var.X1lG3V04pd;
        rp rpVar = (eq0Var == null || (bq0Var = eq0Var.GWasM1elztuh) == null) ? null : new rp(bq0Var.Yi7zF1RB1);
        boolean z = false;
        if (rpVar != null && rpVar.GWasM1elztuh == 1) {
            z = true;
        }
        return !z;
    }

    public static void mqNvfisv7(ByteArrayOutputStream byteArrayOutputStream, pl plVar, String str) {
        Charset charset = StandardCharsets.UTF_8;
        fb1.EDwNPVYuViP0(byteArrayOutputStream, str.getBytes(charset).length);
        fb1.EDwNPVYuViP0(byteArrayOutputStream, plVar.OOA6hdeuvCS);
        fb1.NyNgffpi(byteArrayOutputStream, plVar.EljAMC1QTz, 4);
        fb1.NyNgffpi(byteArrayOutputStream, plVar.X1lG3V04pd, 4);
        fb1.NyNgffpi(byteArrayOutputStream, plVar.AvO7iQsrTN, 4);
        byteArrayOutputStream.write(str.getBytes(charset));
    }

    public static final n9 ozMwhSAI(vg vgVar) {
        if (!(vgVar instanceof im)) {
            return new n9(1, vgVar);
        }
        n9 uFEq9NpZ2 = ((im) vgVar).uFEq9NpZ();
        if (uFEq9NpZ2 != null) {
            if (!uFEq9NpZ2.ozMwhSAI()) {
                uFEq9NpZ2 = null;
            }
            if (uFEq9NpZ2 != null) {
                return uFEq9NpZ2;
            }
        }
        return new n9(2, vgVar);
    }

    public static final float pog2g9KITJA(long j) {
        return Float.intBitsToFloat((int) (j >> 32));
    }

    public static pl[] qugwajBSa59j(ByteArrayInputStream byteArrayInputStream, String str, int i) {
        int i2 = 0;
        if (byteArrayInputStream.available() == 0) {
            return new pl[0];
        }
        pl[] plVarArr = new pl[i];
        for (int i3 = 0; i3 < i; i3++) {
            int CMh55RymNfS = (int) fb1.CMh55RymNfS(byteArrayInputStream, 2);
            int CMh55RymNfS2 = (int) fb1.CMh55RymNfS(byteArrayInputStream, 2);
            plVarArr[i3] = new pl(str, new String(fb1.z19UFEN2I(byteArrayInputStream, CMh55RymNfS), StandardCharsets.UTF_8), fb1.CMh55RymNfS(byteArrayInputStream, 4), CMh55RymNfS2, (int) fb1.CMh55RymNfS(byteArrayInputStream, 4), (int) fb1.CMh55RymNfS(byteArrayInputStream, 4), new int[CMh55RymNfS2], new TreeMap());
        }
        int i4 = 0;
        while (i4 < i) {
            pl plVar = plVarArr[i4];
            int available = byteArrayInputStream.available();
            int i5 = plVar.EljAMC1QTz;
            int i6 = plVar.AvO7iQsrTN;
            TreeMap treeMap = plVar.mOu10nynGul;
            int i7 = available - i5;
            int i8 = i2;
            while (byteArrayInputStream.available() > i7) {
                i8 += (int) fb1.CMh55RymNfS(byteArrayInputStream, 2);
                treeMap.put(Integer.valueOf(i8), 1);
                int CMh55RymNfS3 = (int) fb1.CMh55RymNfS(byteArrayInputStream, 2);
                while (CMh55RymNfS3 > 0) {
                    fb1.CMh55RymNfS(byteArrayInputStream, 2);
                    int CMh55RymNfS4 = (int) fb1.CMh55RymNfS(byteArrayInputStream, 1);
                    if (CMh55RymNfS4 != 6 && CMh55RymNfS4 != 7) {
                        while (CMh55RymNfS4 > 0) {
                            fb1.CMh55RymNfS(byteArrayInputStream, 1);
                            int i9 = i2;
                            int i10 = i4;
                            for (int CMh55RymNfS5 = (int) fb1.CMh55RymNfS(byteArrayInputStream, 1); CMh55RymNfS5 > 0; CMh55RymNfS5--) {
                                fb1.CMh55RymNfS(byteArrayInputStream, 2);
                            }
                            CMh55RymNfS4--;
                            i2 = i9;
                            i4 = i10;
                        }
                    }
                    CMh55RymNfS3--;
                    i2 = i2;
                    i4 = i4;
                }
            }
            int i11 = i2;
            int i12 = i4;
            if (byteArrayInputStream.available() != i7) {
                o4.jivtDDk9H("Read too much data during profile line parse");
                return null;
            }
            plVar.encWxUiV2 = dqB83aoLBB(byteArrayInputStream, plVar.OOA6hdeuvCS);
            BitSet valueOf = BitSet.valueOf(fb1.z19UFEN2I(byteArrayInputStream, (((i6 * 2) + 7) & (-8)) / 8));
            for (int i13 = i11; i13 < i6; i13++) {
                int i14 = valueOf.get(i13) ? 2 : i11;
                if (valueOf.get(i13 + i6)) {
                    i14 |= 4;
                }
                if (i14 != 0) {
                    Integer num = (Integer) treeMap.get(Integer.valueOf(i13));
                    if (num == null) {
                        num = Integer.valueOf(i11);
                    }
                    treeMap.put(Integer.valueOf(i13), Integer.valueOf(i14 | num.intValue()));
                }
            }
            i4 = i12 + 1;
            i2 = i11;
        }
        return plVarArr;
    }

    public static IOException rQPn8YBR(File file, IOException iOException) {
        StringBuilder sb = new StringBuilder("Inoperable file:");
        try {
            sb.append(" canonical[" + file.getCanonicalPath() + "] freeSpace[" + file.getFreeSpace() + ']');
        } catch (IOException unused) {
            sb.append(" failed to attach additional metadata");
        }
        return new IOException(sb.toString(), iOException);
    }

    public static final void xqGvceK5x(cx cxVar, ie0 ie0Var, qx qxVar, int i) {
        int i2;
        qxVar.Uxq83abb04(1957904345);
        int i3 = (qxVar.encWxUiV2(cxVar) ? 4 : 2) | i;
        if (qxVar.dqB83aoLBB(i3 & 1, (i3 & 19) != 18)) {
            ie0 X1lG3V04pd2 = ie0Var.X1lG3V04pd(v21.GWasM1elztuh);
            zv0 GWasM1elztuh2 = yv0.GWasM1elztuh(new s4(8.0f, new o4(1)), b9xEq24R1.iwATDS1i01k, qxVar, 6);
            int hashCode = Long.hashCode(qxVar.qugwajBSa59j);
            cp0 E7jCp8Ls2 = qxVar.E7jCp8Ls();
            ie0 MZhzXH72 = MZhzXH72(qxVar, X1lG3V04pd2);
            oe.X1lG3V04pd.getClass();
            hf hfVar = ne.Yi7zF1RB1;
            qxVar.c4eaifQP();
            if (qxVar.CMh55RymNfS) {
                qxVar.rQPn8YBR(hfVar);
            } else {
                qxVar.K0ReC6MK();
            }
            l60.WRKkgoJXwDn(ne.OOA6hdeuvCS, qxVar, GWasM1elztuh2);
            l60.WRKkgoJXwDn(ne.xqGvceK5x, qxVar, E7jCp8Ls2);
            l60.WRKkgoJXwDn(ne.EljAMC1QTz, qxVar, Integer.valueOf(hashCode));
            l60.WdrkLMV3xh(qxVar, ne.AvO7iQsrTN);
            l60.WRKkgoJXwDn(ne.X1lG3V04pd, qxVar, MZhzXH72);
            String lv06NcmrQ = w60.lv06NcmrQ(R.string.hud_moves, qxVar);
            int i4 = cxVar.XnEVoBF0td1l;
            int i5 = cxVar.E7jCp8Ls;
            ki1.XnEVoBF0td1l(lv06NcmrQ, i4 + "/" + i5, null, cxVar.XnEVoBF0td1l <= i5 ? ac.XnEVoBF0td1l : ac.mOu10nynGul, qxVar, 0);
            String lv06NcmrQ2 = w60.lv06NcmrQ(R.string.hud_power, qxVar);
            List list = cxVar.JFJ3QoxA;
            if (list == null || !list.isEmpty()) {
                Iterator it = list.iterator();
                i2 = 0;
                while (it.hasNext()) {
                    if (((Boolean) it.next()).booleanValue() && (i2 = i2 + 1) < 0) {
                        throw new ArithmeticException("Count overflow has happened.");
                    }
                }
            } else {
                i2 = 0;
            }
            String str = i2 + "/" + cxVar.mOu10nynGul.size();
            List list2 = tn0.GWasM1elztuh;
            ki1.XnEVoBF0td1l(lv06NcmrQ2, str, null, tn0.GWasM1elztuh(cxVar.X1lG3V04pd).GWasM1elztuh, qxVar, 0);
            if (cxVar.WIEu4Ya2g8.getTimerVisible()) {
                qxVar.MjxSquD6Av(-467729596);
                ki1.XnEVoBF0td1l(w60.lv06NcmrQ(R.string.hud_time, qxVar), WdrkLMV3xh(cxVar.uFEq9NpZ), null, ac.XnEVoBF0td1l, qxVar, 3072);
            } else {
                qxVar.MjxSquD6Av(-476665811);
            }
            qxVar.WIEu4Ya2g8(false);
            qxVar.WIEu4Ya2g8(true);
        } else {
            qxVar.YXi2hvwn7WL();
        }
        at0 Mjvvu5DE = qxVar.Mjvvu5DE();
        if (Mjvvu5DE != null) {
            Mjvvu5DE.xqGvceK5x = new t7(i, 5, cxVar, ie0Var);
        }
    }

    public static pl[] z19UFEN2I(ByteArrayInputStream byteArrayInputStream, int i, pl[] plVarArr) {
        if (byteArrayInputStream.available() == 0) {
            return new pl[0];
        }
        if (i != plVarArr.length) {
            o4.jivtDDk9H("Mismatched number of dex files found in metadata");
            return null;
        }
        String[] strArr = new String[i];
        int[] iArr = new int[i];
        for (int i2 = 0; i2 < i; i2++) {
            int CMh55RymNfS = (int) fb1.CMh55RymNfS(byteArrayInputStream, 2);
            iArr[i2] = (int) fb1.CMh55RymNfS(byteArrayInputStream, 2);
            strArr[i2] = new String(fb1.z19UFEN2I(byteArrayInputStream, CMh55RymNfS), StandardCharsets.UTF_8);
        }
        for (int i3 = 0; i3 < i; i3++) {
            pl plVar = plVarArr[i3];
            if (!plVar.Yi7zF1RB1.equals(strArr[i3])) {
                o4.jivtDDk9H("Order of dexfiles in metadata did not match baseline");
                return null;
            }
            int i4 = iArr[i3];
            plVar.OOA6hdeuvCS = i4;
            plVar.encWxUiV2 = dqB83aoLBB(byteArrayInputStream, i4);
        }
        return plVarArr;
    }

    public abstract void TpUsjqg3bxO(DmJncFq5 dmJncFq5, Thread thread);

    public abstract boolean XnEVoBF0td1l(HFYAaqMd6 hFYAaqMd6, eUH21U3apd euh21u3apd);

    public abstract boolean iwATDS1i01k(HFYAaqMd6 hFYAaqMd6, DmJncFq5 dmJncFq5, DmJncFq5 dmJncFq52);

    public abstract void rezfBrjOrqK(DmJncFq5 dmJncFq5, DmJncFq5 dmJncFq52);

    public abstract boolean uFEq9NpZ(HFYAaqMd6 hFYAaqMd6, Object obj, Object obj2);
}
