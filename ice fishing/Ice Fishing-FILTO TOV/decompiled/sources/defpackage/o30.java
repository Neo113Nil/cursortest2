package defpackage;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.graphics.Region;
import android.os.Build;
import android.os.Trace;
import android.util.Base64;
import android.util.DisplayMetrics;
import android.util.LongSparseArray;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.View;
import android.view.translation.TranslationResponseValue;
import android.view.translation.ViewTranslationResponse;
import android.widget.EdgeEffect;
import com.combinations.level.experts.R;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public abstract class o30 {
    public static final pp AvO7iQsrTN;
    public static final pp GWasM1elztuh;
    public static final jd X1lG3V04pd;
    public static Method Y6hRI1cF8 = null;
    public static final pp encWxUiV2;
    public static boolean jivtDDk9H = false;
    public static final jd xqGvceK5x;
    public static final jd Yi7zF1RB1 = new jd(-191970404, false, new pd(11));
    public static final jd OOA6hdeuvCS = new jd(1890794611, false, new pd(12));
    public static final jd EljAMC1QTz = new jd(-693521838, false, new pd(13));
    public static final l1 mOu10nynGul = new l1(2);
    public static final byte[] JFJ3QoxA = {48, 49, 53, 0};
    public static final byte[] rQPn8YBR = {48, 49, 48, 0};
    public static final byte[] E7jCp8Ls = {48, 48, 57, 0};
    public static final byte[] XnEVoBF0td1l = {48, 48, 53, 0};
    public static final byte[] uFEq9NpZ = {48, 48, 49, 0};
    public static final byte[] iwATDS1i01k = {48, 48, 49, 0};
    public static final byte[] WIEu4Ya2g8 = {48, 48, 50, 0};
    public static final kt0 YmKjaVtbfp5Z = new kt0(0.0f, 0.0f, 10.0f, 10.0f);
    public static final Object Mjvvu5DE = new Object();
    public static final dx0 mE4lRynR = new dx0(27);

    static {
        final int i = 1;
        GWasM1elztuh = new pp("RESUME_TOKEN", i);
        final int i2 = 0;
        X1lG3V04pd = new jd(-264765478, false, new mv() { // from class: qd
            @Override // defpackage.mv
            public final Object X1lG3V04pd(Object obj, Object obj2, Object obj3) {
                int i3 = i2;
                kc1 kc1Var = kc1.GWasM1elztuh;
                switch (i3) {
                    case 0:
                        qx qxVar = (qx) obj2;
                        int intValue = ((Integer) obj3).intValue();
                        ((aw0) obj).getClass();
                        if (!qxVar.dqB83aoLBB(intValue & 1, (intValue & 17) != 16)) {
                            qxVar.YXi2hvwn7WL();
                            break;
                        } else {
                            j81.Yi7zF1RB1(w60.lv06NcmrQ(R.string.reset_dialog_confirm, qxVar), null, ac.encWxUiV2, 0L, 0L, null, 0L, 0, false, 0, 0, null, qxVar, 384, 262138);
                            break;
                        }
                    default:
                        qx qxVar2 = (qx) obj2;
                        int intValue2 = ((Integer) obj3).intValue();
                        ((aw0) obj).getClass();
                        if (!qxVar2.dqB83aoLBB(intValue2 & 1, (intValue2 & 17) != 16)) {
                            qxVar2.YXi2hvwn7WL();
                            break;
                        } else {
                            j81.Yi7zF1RB1(w60.lv06NcmrQ(R.string.action_cancel, qxVar2), null, ac.uFEq9NpZ, 0L, 0L, null, 0L, 0, false, 0, 0, null, qxVar2, 384, 262138);
                            break;
                        }
                }
                return kc1Var;
            }
        });
        xqGvceK5x = new jd(-1138431080, false, new mv() { // from class: qd
            @Override // defpackage.mv
            public final Object X1lG3V04pd(Object obj, Object obj2, Object obj3) {
                int i3 = i;
                kc1 kc1Var = kc1.GWasM1elztuh;
                switch (i3) {
                    case 0:
                        qx qxVar = (qx) obj2;
                        int intValue = ((Integer) obj3).intValue();
                        ((aw0) obj).getClass();
                        if (!qxVar.dqB83aoLBB(intValue & 1, (intValue & 17) != 16)) {
                            qxVar.YXi2hvwn7WL();
                            break;
                        } else {
                            j81.Yi7zF1RB1(w60.lv06NcmrQ(R.string.reset_dialog_confirm, qxVar), null, ac.encWxUiV2, 0L, 0L, null, 0L, 0, false, 0, 0, null, qxVar, 384, 262138);
                            break;
                        }
                    default:
                        qx qxVar2 = (qx) obj2;
                        int intValue2 = ((Integer) obj3).intValue();
                        ((aw0) obj).getClass();
                        if (!qxVar2.dqB83aoLBB(intValue2 & 1, (intValue2 & 17) != 16)) {
                            qxVar2.YXi2hvwn7WL();
                            break;
                        } else {
                            j81.Yi7zF1RB1(w60.lv06NcmrQ(R.string.action_cancel, qxVar2), null, ac.uFEq9NpZ, 0L, 0L, null, 0L, 0, false, 0, 0, null, qxVar2, 384, 262138);
                            break;
                        }
                }
                return kc1Var;
            }
        });
        AvO7iQsrTN = new pp("UNDEFINED", i);
        encWxUiV2 = new pp("REUSABLE_CLAIMED", i);
    }

    public static final ie0 A1EKNP6CxJ(ie0 ie0Var, float f, float f2) {
        return ie0Var.X1lG3V04pd(new kn0(f, f2, f, f2));
    }

    public static final float[] AEn1Rrio(List list, List list2, int i) {
        if (i == 0) {
            if (list != null) {
                return rb.xtv4Xm13vGi(list);
            }
            return null;
        }
        float[] fArr = new float[list2.size() + i];
        fArr[0] = list != null ? ((Number) list.get(0)).floatValue() : 0.0f;
        int size = list2.size() - 1;
        int i2 = 1;
        for (int i3 = 1; i3 < size; i3++) {
            long j = ((yb) list2.get(i3)).GWasM1elztuh;
            float floatValue = list != null ? ((Number) list.get(i3)).floatValue() : i3 / (list2.size() - 1);
            int i4 = i2 + 1;
            fArr[i2] = floatValue;
            if (yb.xqGvceK5x(j) == 0.0f) {
                i2 += 2;
                fArr[i4] = floatValue;
            } else {
                i2 = i4;
            }
        }
        fArr[i2] = list != null ? ((Number) list.get(list2.size() - 1)).floatValue() : 1.0f;
        return fArr;
    }

    public static float AvO7iQsrTN(EdgeEffect edgeEffect, float f, float f2, el elVar) {
        float f3 = qo.GWasM1elztuh;
        double Yi7zF1RB12 = elVar.Yi7zF1RB1() * 386.0878f * 160.0f * 0.84f;
        double d = qo.GWasM1elztuh * Yi7zF1RB12;
        float exp = (float) (Math.exp((qo.Yi7zF1RB1 / qo.X1lG3V04pd) * Math.log((Math.abs(f) * 0.35f) / d)) * d);
        int i = Build.VERSION.SDK_INT;
        if (exp > (i >= 31 ? d4.X1lG3V04pd(edgeEffect) : 0.0f) * f2) {
            return 0.0f;
        }
        int MZhzXH72 = vc0.MZhzXH72(f);
        if (i >= 31) {
            edgeEffect.onAbsorb(MZhzXH72);
            return f;
        }
        if (edgeEffect.isFinished()) {
            edgeEffect.onAbsorb(MZhzXH72);
        }
        return f;
    }

    public static final long CMh55RymNfS(long j) {
        return (Float.floatToRawIntBits((int) (j & 4294967295L)) & 4294967295L) | (Float.floatToRawIntBits((int) (j >> 32)) << 32);
    }

    public static ie0 DmJncFq5(ie0 ie0Var, float f, float f2, int i) {
        float f3 = (i & 1) != 0 ? 0.0f : 16.0f;
        float f4 = (i & 2) != 0 ? 0.0f : 4.0f;
        if ((i & 4) != 0) {
            f = 0.0f;
        }
        if ((i & 8) != 0) {
            f2 = 0.0f;
        }
        return ie0Var.X1lG3V04pd(new kn0(f3, f4, f, f2));
    }

    public static final void E7jCp8Ls(Closeable closeable, Throwable th) {
        if (closeable != null) {
            if (th == null) {
                closeable.close();
                return;
            }
            try {
                closeable.close();
            } catch (Throwable th2) {
                p.xqGvceK5x(th, th2);
            }
        }
    }

    public static final boolean EXrPz3p7hFb(d01 d01Var) {
        if (!k8h8IjolWQ(d01Var)) {
            zz0 zz0Var = d01Var.xqGvceK5x;
            if (zz0Var.AvO7iQsrTN) {
                return true;
            }
            hg0 hg0Var = zz0Var.OOA6hdeuvCS;
            Object[] objArr = hg0Var.Yi7zF1RB1;
            Object[] objArr2 = hg0Var.X1lG3V04pd;
            long[] jArr = hg0Var.GWasM1elztuh;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i = 0;
                while (true) {
                    long j = jArr[i];
                    if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i2 = 8 - ((~(i - length)) >>> 31);
                        for (int i3 = 0; i3 < i2; i3++) {
                            if ((255 & j) < 128) {
                                int i4 = (i << 3) + i3;
                                Object obj = objArr[i4];
                                Object obj2 = objArr2[i4];
                                if (((k01) obj).X1lG3V04pd) {
                                    return true;
                                }
                            }
                            j >>= 8;
                        }
                        if (i2 != 8) {
                            break;
                        }
                    }
                    if (i == length) {
                        break;
                    }
                    i++;
                }
            }
        }
        return false;
    }

    public static nn0 EljAMC1QTz(float f) {
        return new nn0(0.0f, 0.0f, 0.0f, f);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0306  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0321  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0375  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0450  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0476  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0491  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x047a  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x039b  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0308  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x023a  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x02af  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void GWasM1elztuh(qa1 qa1Var, hv hvVar, ie0 ie0Var, lq lqVar, xq xqVar, lv lvVar, jd jdVar, qx qxVar, int i) {
        jd jdVar2;
        le leVar;
        lq lqVar2;
        boolean EljAMC1QTz2;
        Object HFYAaqMd6;
        xq xqVar2;
        boolean EljAMC1QTz3;
        Object HFYAaqMd62;
        Object HFYAaqMd63;
        mg0 mg0Var;
        boolean encWxUiV22;
        Object HFYAaqMd64;
        Object EljAMC1QTz4;
        cq cqVar;
        boolean z;
        Object HFYAaqMd65;
        Object HFYAaqMd66;
        ra1 ra1Var;
        ra1 ra1Var2;
        Object obj;
        boolean z2;
        la1 la1Var;
        boolean encWxUiV23;
        Object HFYAaqMd67;
        lq lqVar3;
        xq xqVar3;
        boolean AvO7iQsrTN2;
        Object HFYAaqMd68;
        Object HFYAaqMd69;
        boolean z3;
        qxVar.Uxq83abb04(1912839215);
        int i2 = i | (qxVar.EljAMC1QTz(qa1Var) ? 4 : 2) | (qxVar.encWxUiV2(hvVar) ? 32 : 16) | (qxVar.EljAMC1QTz(ie0Var) ? 256 : 128) | (qxVar.EljAMC1QTz(lqVar) ? 2048 : 1024) | (qxVar.EljAMC1QTz(xqVar) ? 16384 : 8192) | (qxVar.encWxUiV2(lvVar) ? 131072 : 65536) | 1572864;
        if (qxVar.dqB83aoLBB(i2 & 1, (4793491 & i2) != 4793490)) {
            fo0 fo0Var = qa1Var.xqGvceK5x;
            le leVar2 = qa1Var.GWasM1elztuh;
            if (((Boolean) hvVar.mOu10nynGul(fo0Var.getValue())).booleanValue() || ((Boolean) hvVar.mOu10nynGul(leVar2.EljAMC1QTz())).booleanValue() || qa1Var.AvO7iQsrTN() || qa1Var.xqGvceK5x()) {
                qxVar.MjxSquD6Av(-232386135);
                int i3 = i2 & 14;
                int i4 = i3 | 48;
                int i5 = i4 & 14;
                boolean z4 = ((i5 ^ 6) > 4 && qxVar.EljAMC1QTz(qa1Var)) || (i4 & 6) == 4;
                Object HFYAaqMd610 = qxVar.HFYAaqMd6();
                Object obj2 = ue.GWasM1elztuh;
                if (z4 || HFYAaqMd610 == obj2) {
                    HFYAaqMd610 = leVar2.EljAMC1QTz();
                    qxVar.dcDmLGVhzWm(HFYAaqMd610);
                }
                if (qa1Var.AvO7iQsrTN()) {
                    HFYAaqMd610 = leVar2.EljAMC1QTz();
                }
                qxVar.MjxSquD6Av(1844425648);
                cq z19UFEN2I = z19UFEN2I(qa1Var, hvVar, HFYAaqMd610, qxVar);
                qxVar.WIEu4Ya2g8(false);
                Object value = qa1Var.xqGvceK5x.getValue();
                qxVar.MjxSquD6Av(1844425648);
                cq z19UFEN2I2 = z19UFEN2I(qa1Var, hvVar, value, qxVar);
                qxVar.WIEu4Ya2g8(false);
                int i6 = i5 | 3072;
                int i7 = (i6 & 14) ^ 6;
                boolean z5 = (i7 > 4 && qxVar.EljAMC1QTz(qa1Var)) || (i6 & 6) == 4;
                Object HFYAaqMd611 = qxVar.HFYAaqMd6();
                if (z5 || HFYAaqMd611 == obj2) {
                    HFYAaqMd611 = new qa1(new ng0(z19UFEN2I), qa1Var, qa1Var.X1lG3V04pd.concat(" > EnterExitTransition"));
                    qxVar.dcDmLGVhzWm(HFYAaqMd611);
                }
                qa1 qa1Var2 = (qa1) HFYAaqMd611;
                boolean EljAMC1QTz5 = ((i7 > 4 && qxVar.EljAMC1QTz(qa1Var)) || (i6 & 6) == 4) | qxVar.EljAMC1QTz(qa1Var2);
                Object HFYAaqMd612 = qxVar.HFYAaqMd6();
                if (EljAMC1QTz5 || HFYAaqMd612 == obj2) {
                    HFYAaqMd612 = new X1lG3V04pd(27, qa1Var, qa1Var2);
                    qxVar.dcDmLGVhzWm(HFYAaqMd612);
                }
                ki1.EljAMC1QTz(qa1Var2, (hv) HFYAaqMd612, qxVar);
                if (qa1Var.AvO7iQsrTN()) {
                    qa1Var2.rQPn8YBR(z19UFEN2I, z19UFEN2I2);
                } else {
                    qa1Var2.WIEu4Ya2g8(z19UFEN2I2);
                    qa1Var2.rQPn8YBR.setValue(Boolean.FALSE);
                }
                eb1 eb1Var = hq.GWasM1elztuh;
                boolean EljAMC1QTz6 = qxVar.EljAMC1QTz(qa1Var2);
                Object HFYAaqMd613 = qxVar.HFYAaqMd6();
                if (EljAMC1QTz6 || HFYAaqMd613 == obj2) {
                    HFYAaqMd613 = z50.WRKkgoJXwDn(lqVar);
                    qxVar.dcDmLGVhzWm(HFYAaqMd613);
                }
                mg0 mg0Var2 = (mg0) HFYAaqMd613;
                le leVar3 = qa1Var2.GWasM1elztuh;
                le leVar4 = qa1Var2.GWasM1elztuh;
                fo0 fo0Var2 = qa1Var2.xqGvceK5x;
                Object EljAMC1QTz7 = leVar3.EljAMC1QTz();
                Object value2 = fo0Var2.getValue();
                cq cqVar2 = cq.EljAMC1QTz;
                if (EljAMC1QTz7 == value2 && leVar4.EljAMC1QTz() == cqVar2) {
                    if (qa1Var2.AvO7iQsrTN()) {
                        mg0Var2.setValue(lqVar);
                    } else {
                        mg0Var2.setValue(lq.Yi7zF1RB1);
                    }
                } else if (fo0Var2.getValue() == cqVar2) {
                    ra1 ra1Var3 = ((lq) mg0Var2.getValue()).GWasM1elztuh;
                    ra1 ra1Var4 = lqVar.GWasM1elztuh;
                    dr drVar = ra1Var4.GWasM1elztuh;
                    if (drVar == null) {
                        drVar = ra1Var3.GWasM1elztuh;
                    }
                    Map map = ra1Var3.X1lG3V04pd;
                    Map map2 = ra1Var4.X1lG3V04pd;
                    map.getClass();
                    map2.getClass();
                    leVar = leVar4;
                    LinkedHashMap linkedHashMap = new LinkedHashMap(map);
                    linkedHashMap.putAll(map2);
                    mg0Var2.setValue(new lq(new ra1(drVar, (l60) null, linkedHashMap, 32)));
                    lqVar2 = (lq) mg0Var2.getValue();
                    EljAMC1QTz2 = qxVar.EljAMC1QTz(qa1Var2);
                    HFYAaqMd6 = qxVar.HFYAaqMd6();
                    if (!EljAMC1QTz2 || HFYAaqMd6 == obj2) {
                        HFYAaqMd6 = z50.WRKkgoJXwDn(xqVar);
                        qxVar.dcDmLGVhzWm(HFYAaqMd6);
                    }
                    mg0 mg0Var3 = (mg0) HFYAaqMd6;
                    if (leVar.EljAMC1QTz() == fo0Var2.getValue() || leVar.EljAMC1QTz() != cqVar2) {
                        if (fo0Var2.getValue() != cqVar2) {
                            ra1 ra1Var5 = ((xq) mg0Var3.getValue()).GWasM1elztuh;
                            ra1 ra1Var6 = xqVar.GWasM1elztuh;
                            dr drVar2 = ra1Var6.GWasM1elztuh;
                            if (drVar2 == null) {
                                drVar2 = ra1Var5.GWasM1elztuh;
                            }
                            boolean z6 = ra1Var6.Yi7zF1RB1 || ra1Var5.Yi7zF1RB1;
                            Map map3 = ra1Var5.X1lG3V04pd;
                            Map map4 = ra1Var6.X1lG3V04pd;
                            map3.getClass();
                            map4.getClass();
                            LinkedHashMap linkedHashMap2 = new LinkedHashMap(map3);
                            linkedHashMap2.putAll(map4);
                            mg0Var3.setValue(new xq(new ra1(drVar2, (l60) null, z6, linkedHashMap2)));
                        }
                    } else if (qa1Var2.AvO7iQsrTN()) {
                        mg0Var3.setValue(xqVar);
                    } else {
                        mg0Var3.setValue(xq.Yi7zF1RB1);
                    }
                    xqVar2 = (xq) mg0Var3.getValue();
                    Object pog2g9KITJA = z50.pog2g9KITJA(lvVar, qxVar);
                    Object EljAMC1QTz8 = lvVar.EljAMC1QTz(leVar.EljAMC1QTz(), fo0Var2.getValue());
                    EljAMC1QTz3 = qxVar.EljAMC1QTz(qa1Var2) | qxVar.EljAMC1QTz(pog2g9KITJA);
                    HFYAaqMd62 = qxVar.HFYAaqMd6();
                    la1 la1Var2 = null;
                    if (!EljAMC1QTz3 || HFYAaqMd62 == obj2) {
                        HFYAaqMd62 = new EljAMC1QTz(qa1Var2, pog2g9KITJA, null == true ? 1 : 0, 1);
                        qxVar.dcDmLGVhzWm(HFYAaqMd62);
                    }
                    lv lvVar2 = (lv) HFYAaqMd62;
                    HFYAaqMd63 = qxVar.HFYAaqMd6();
                    if (HFYAaqMd63 == obj2) {
                        HFYAaqMd63 = z50.WRKkgoJXwDn(EljAMC1QTz8);
                        qxVar.dcDmLGVhzWm(HFYAaqMd63);
                    }
                    mg0Var = (mg0) HFYAaqMd63;
                    encWxUiV22 = qxVar.encWxUiV2(lvVar2);
                    HFYAaqMd64 = qxVar.HFYAaqMd6();
                    if (!encWxUiV22 || HFYAaqMd64 == obj2) {
                        HFYAaqMd64 = new m41(lvVar2, mg0Var, null == true ? 1 : 0, 0);
                        qxVar.dcDmLGVhzWm(HFYAaqMd64);
                    }
                    ki1.encWxUiV2((lv) HFYAaqMd64, qxVar, kc1.GWasM1elztuh);
                    EljAMC1QTz4 = leVar.EljAMC1QTz();
                    cqVar = cq.AvO7iQsrTN;
                    if (EljAMC1QTz4 != cqVar && fo0Var2.getValue() == cqVar && ((Boolean) mg0Var.getValue()).booleanValue()) {
                        qxVar.MjxSquD6Av(-229368781);
                        z3 = false;
                        qxVar.WIEu4Ya2g8(false);
                        jdVar2 = jdVar;
                    } else {
                        qxVar.MjxSquD6Av(-230699766);
                        z = i3 != 4;
                        HFYAaqMd65 = qxVar.HFYAaqMd6();
                        if (!z || HFYAaqMd65 == obj2) {
                            HFYAaqMd65 = new g3();
                            qxVar.dcDmLGVhzWm(HFYAaqMd65);
                        }
                        g3 g3Var = (g3) HFYAaqMd65;
                        HFYAaqMd66 = qxVar.HFYAaqMd6();
                        if (HFYAaqMd66 == obj2) {
                            HFYAaqMd66 = hf.JFJ3QoxA;
                            qxVar.dcDmLGVhzWm(HFYAaqMd66);
                        }
                        wu wuVar = (wu) HFYAaqMd66;
                        qxVar.MjxSquD6Av(-167964673);
                        qxVar.WIEu4Ya2g8(false);
                        qxVar.MjxSquD6Av(-167961890);
                        qxVar.WIEu4Ya2g8(false);
                        ra1Var = lqVar2.GWasM1elztuh;
                        ra1Var2 = xqVar2.GWasM1elztuh;
                        qxVar.MjxSquD6Av(-911382324);
                        qxVar.WIEu4Ya2g8(false);
                        qxVar.MjxSquD6Av(-911179709);
                        qxVar.WIEu4Ya2g8(false);
                        qxVar.MjxSquD6Av(-910935677);
                        qxVar.WIEu4Ya2g8(false);
                        float[] fArr = jc.GWasM1elztuh;
                        qxVar.MjxSquD6Av(-910130296);
                        qxVar.WIEu4Ya2g8(false);
                        eb1 eb1Var2 = vc0.mOu10nynGul;
                        if (ra1Var.GWasM1elztuh == null || ra1Var2.GWasM1elztuh != null) {
                            obj = obj2;
                            z2 = false;
                            qxVar.MjxSquD6Av(-703709976);
                            qxVar.WIEu4Ya2g8(false);
                            la1Var = null;
                        } else {
                            qxVar.MjxSquD6Av(-703879421);
                            Object HFYAaqMd614 = qxVar.HFYAaqMd6();
                            if (HFYAaqMd614 == obj2) {
                                HFYAaqMd614 = "Built-in alpha";
                                qxVar.dcDmLGVhzWm("Built-in alpha");
                            }
                            obj = obj2;
                            la1Var = YmKjaVtbfp5Z(qa1Var2, eb1Var2, (String) HFYAaqMd614, qxVar, 384, 0);
                            z2 = false;
                            qxVar.WIEu4Ya2g8(false);
                        }
                        qxVar.MjxSquD6Av(-703472888);
                        qxVar.WIEu4Ya2g8(z2);
                        qxVar.MjxSquD6Av(-703222904);
                        qxVar.WIEu4Ya2g8(z2);
                        encWxUiV23 = qxVar.encWxUiV2(la1Var) | qxVar.EljAMC1QTz(lqVar2) | qxVar.EljAMC1QTz(xqVar2) | qxVar.encWxUiV2(null) | qxVar.EljAMC1QTz(qa1Var2) | qxVar.encWxUiV2(null);
                        HFYAaqMd67 = qxVar.HFYAaqMd6();
                        if (!encWxUiV23 || HFYAaqMd67 == obj) {
                            lqVar3 = lqVar2;
                            HFYAaqMd67 = new eq(la1Var, la1Var2, qa1Var2, lqVar3, xqVar2, null == true ? 1 : 0);
                            xqVar3 = xqVar2;
                            qxVar.dcDmLGVhzWm(HFYAaqMd67);
                        } else {
                            lqVar3 = lqVar2;
                            xqVar3 = xqVar2;
                        }
                        eq eqVar = (eq) HFYAaqMd67;
                        AvO7iQsrTN2 = qxVar.AvO7iQsrTN(true) | qxVar.EljAMC1QTz(wuVar);
                        HFYAaqMd68 = qxVar.HFYAaqMd6();
                        if (!AvO7iQsrTN2 || HFYAaqMd68 == obj) {
                            HFYAaqMd68 = new gq(true, wuVar);
                            qxVar.dcDmLGVhzWm(HFYAaqMd68);
                        }
                        ie0 X1lG3V04pd2 = new t6((hv) HFYAaqMd68).X1lG3V04pd(new dq(qa1Var2, lqVar3, xqVar3, wuVar, eqVar));
                        fe0 fe0Var = fe0.GWasM1elztuh;
                        ie0 X1lG3V04pd3 = X1lG3V04pd2.X1lG3V04pd(fe0Var);
                        qxVar.MjxSquD6Av(-7404393);
                        qxVar.WIEu4Ya2g8(false);
                        ie0 X1lG3V04pd4 = ie0Var.X1lG3V04pd(X1lG3V04pd3.X1lG3V04pd(fe0Var));
                        HFYAaqMd69 = qxVar.HFYAaqMd6();
                        if (HFYAaqMd69 == obj) {
                            HFYAaqMd69 = new b3(g3Var);
                            qxVar.dcDmLGVhzWm(HFYAaqMd69);
                        }
                        b3 b3Var = (b3) HFYAaqMd69;
                        int hashCode = Long.hashCode(qxVar.qugwajBSa59j);
                        cp0 E7jCp8Ls2 = qxVar.E7jCp8Ls();
                        ie0 MZhzXH72 = n30.MZhzXH72(qxVar, X1lG3V04pd4);
                        oe.X1lG3V04pd.getClass();
                        wu wuVar2 = ne.Yi7zF1RB1;
                        qxVar.c4eaifQP();
                        if (qxVar.CMh55RymNfS) {
                            qxVar.K0ReC6MK();
                        } else {
                            qxVar.rQPn8YBR(wuVar2);
                        }
                        l60.WRKkgoJXwDn(ne.OOA6hdeuvCS, qxVar, b3Var);
                        l60.WRKkgoJXwDn(ne.xqGvceK5x, qxVar, E7jCp8Ls2);
                        Object valueOf = Integer.valueOf(hashCode);
                        lv lvVar3 = ne.EljAMC1QTz;
                        if (qxVar.CMh55RymNfS) {
                            qxVar.Yi7zF1RB1(lvVar3, valueOf);
                        }
                        l60.WdrkLMV3xh(qxVar, ne.AvO7iQsrTN);
                        l60.WRKkgoJXwDn(ne.X1lG3V04pd, qxVar, MZhzXH72);
                        jdVar2 = jdVar;
                        jdVar2.X1lG3V04pd(g3Var, qxVar, 48);
                        qxVar.WIEu4Ya2g8(true);
                        z3 = false;
                        qxVar.WIEu4Ya2g8(false);
                    }
                    qxVar.WIEu4Ya2g8(z3);
                }
                leVar = leVar4;
                lqVar2 = (lq) mg0Var2.getValue();
                EljAMC1QTz2 = qxVar.EljAMC1QTz(qa1Var2);
                HFYAaqMd6 = qxVar.HFYAaqMd6();
                if (!EljAMC1QTz2) {
                }
                HFYAaqMd6 = z50.WRKkgoJXwDn(xqVar);
                qxVar.dcDmLGVhzWm(HFYAaqMd6);
                mg0 mg0Var32 = (mg0) HFYAaqMd6;
                if (leVar.EljAMC1QTz() == fo0Var2.getValue()) {
                }
                if (fo0Var2.getValue() != cqVar2) {
                }
                xqVar2 = (xq) mg0Var32.getValue();
                Object pog2g9KITJA2 = z50.pog2g9KITJA(lvVar, qxVar);
                Object EljAMC1QTz82 = lvVar.EljAMC1QTz(leVar.EljAMC1QTz(), fo0Var2.getValue());
                EljAMC1QTz3 = qxVar.EljAMC1QTz(qa1Var2) | qxVar.EljAMC1QTz(pog2g9KITJA2);
                HFYAaqMd62 = qxVar.HFYAaqMd6();
                la1 la1Var22 = null;
                if (!EljAMC1QTz3) {
                }
                HFYAaqMd62 = new EljAMC1QTz(qa1Var2, pog2g9KITJA2, null == true ? 1 : 0, 1);
                qxVar.dcDmLGVhzWm(HFYAaqMd62);
                lv lvVar22 = (lv) HFYAaqMd62;
                HFYAaqMd63 = qxVar.HFYAaqMd6();
                if (HFYAaqMd63 == obj2) {
                }
                mg0Var = (mg0) HFYAaqMd63;
                encWxUiV22 = qxVar.encWxUiV2(lvVar22);
                HFYAaqMd64 = qxVar.HFYAaqMd6();
                if (!encWxUiV22) {
                }
                HFYAaqMd64 = new m41(lvVar22, mg0Var, null == true ? 1 : 0, 0);
                qxVar.dcDmLGVhzWm(HFYAaqMd64);
                ki1.encWxUiV2((lv) HFYAaqMd64, qxVar, kc1.GWasM1elztuh);
                EljAMC1QTz4 = leVar.EljAMC1QTz();
                cqVar = cq.AvO7iQsrTN;
                if (EljAMC1QTz4 != cqVar) {
                }
                qxVar.MjxSquD6Av(-230699766);
                if (i3 != 4) {
                }
                HFYAaqMd65 = qxVar.HFYAaqMd6();
                if (!z) {
                }
                HFYAaqMd65 = new g3();
                qxVar.dcDmLGVhzWm(HFYAaqMd65);
                g3 g3Var2 = (g3) HFYAaqMd65;
                HFYAaqMd66 = qxVar.HFYAaqMd6();
                if (HFYAaqMd66 == obj2) {
                }
                wu wuVar3 = (wu) HFYAaqMd66;
                qxVar.MjxSquD6Av(-167964673);
                qxVar.WIEu4Ya2g8(false);
                qxVar.MjxSquD6Av(-167961890);
                qxVar.WIEu4Ya2g8(false);
                ra1Var = lqVar2.GWasM1elztuh;
                ra1Var2 = xqVar2.GWasM1elztuh;
                qxVar.MjxSquD6Av(-911382324);
                qxVar.WIEu4Ya2g8(false);
                qxVar.MjxSquD6Av(-911179709);
                qxVar.WIEu4Ya2g8(false);
                qxVar.MjxSquD6Av(-910935677);
                qxVar.WIEu4Ya2g8(false);
                float[] fArr2 = jc.GWasM1elztuh;
                qxVar.MjxSquD6Av(-910130296);
                qxVar.WIEu4Ya2g8(false);
                eb1 eb1Var22 = vc0.mOu10nynGul;
                if (ra1Var.GWasM1elztuh == null || ra1Var2.GWasM1elztuh != null) {
                }
                qxVar.MjxSquD6Av(-703472888);
                qxVar.WIEu4Ya2g8(z2);
                qxVar.MjxSquD6Av(-703222904);
                qxVar.WIEu4Ya2g8(z2);
                encWxUiV23 = qxVar.encWxUiV2(la1Var) | qxVar.EljAMC1QTz(lqVar2) | qxVar.EljAMC1QTz(xqVar2) | qxVar.encWxUiV2(null) | qxVar.EljAMC1QTz(qa1Var2) | qxVar.encWxUiV2(null);
                HFYAaqMd67 = qxVar.HFYAaqMd6();
                if (encWxUiV23) {
                }
                lqVar3 = lqVar2;
                HFYAaqMd67 = new eq(la1Var, la1Var22, qa1Var2, lqVar3, xqVar2, null == true ? 1 : 0);
                xqVar3 = xqVar2;
                qxVar.dcDmLGVhzWm(HFYAaqMd67);
                eq eqVar2 = (eq) HFYAaqMd67;
                AvO7iQsrTN2 = qxVar.AvO7iQsrTN(true) | qxVar.EljAMC1QTz(wuVar3);
                HFYAaqMd68 = qxVar.HFYAaqMd6();
                if (!AvO7iQsrTN2) {
                }
                HFYAaqMd68 = new gq(true, wuVar3);
                qxVar.dcDmLGVhzWm(HFYAaqMd68);
                ie0 X1lG3V04pd22 = new t6((hv) HFYAaqMd68).X1lG3V04pd(new dq(qa1Var2, lqVar3, xqVar3, wuVar3, eqVar2));
                fe0 fe0Var2 = fe0.GWasM1elztuh;
                ie0 X1lG3V04pd32 = X1lG3V04pd22.X1lG3V04pd(fe0Var2);
                qxVar.MjxSquD6Av(-7404393);
                qxVar.WIEu4Ya2g8(false);
                ie0 X1lG3V04pd42 = ie0Var.X1lG3V04pd(X1lG3V04pd32.X1lG3V04pd(fe0Var2));
                HFYAaqMd69 = qxVar.HFYAaqMd6();
                if (HFYAaqMd69 == obj) {
                }
                b3 b3Var2 = (b3) HFYAaqMd69;
                int hashCode2 = Long.hashCode(qxVar.qugwajBSa59j);
                cp0 E7jCp8Ls22 = qxVar.E7jCp8Ls();
                ie0 MZhzXH722 = n30.MZhzXH72(qxVar, X1lG3V04pd42);
                oe.X1lG3V04pd.getClass();
                wu wuVar22 = ne.Yi7zF1RB1;
                qxVar.c4eaifQP();
                if (qxVar.CMh55RymNfS) {
                }
                l60.WRKkgoJXwDn(ne.OOA6hdeuvCS, qxVar, b3Var2);
                l60.WRKkgoJXwDn(ne.xqGvceK5x, qxVar, E7jCp8Ls22);
                Object valueOf2 = Integer.valueOf(hashCode2);
                lv lvVar32 = ne.EljAMC1QTz;
                if (qxVar.CMh55RymNfS) {
                }
                l60.WdrkLMV3xh(qxVar, ne.AvO7iQsrTN);
                l60.WRKkgoJXwDn(ne.X1lG3V04pd, qxVar, MZhzXH722);
                jdVar2 = jdVar;
                jdVar2.X1lG3V04pd(g3Var2, qxVar, 48);
                qxVar.WIEu4Ya2g8(true);
                z3 = false;
                qxVar.WIEu4Ya2g8(false);
                qxVar.WIEu4Ya2g8(z3);
            } else {
                qxVar.MjxSquD6Av(-229362829);
                qxVar.WIEu4Ya2g8(false);
                jdVar2 = jdVar;
            }
        } else {
            jdVar2 = jdVar;
            qxVar.YXi2hvwn7WL();
        }
        at0 Mjvvu5DE2 = qxVar.Mjvvu5DE();
        if (Mjvvu5DE2 != null) {
            Mjvvu5DE2.xqGvceK5x = new c3(qa1Var, hvVar, ie0Var, lqVar, xqVar, lvVar, jdVar2, i);
        }
    }

    public static List HFYAaqMd6(Resources resources, int i) {
        if (i == 0) {
            return Collections.EMPTY_LIST;
        }
        TypedArray obtainTypedArray = resources.obtainTypedArray(i);
        try {
            if (obtainTypedArray.length() == 0) {
                return Collections.EMPTY_LIST;
            }
            ArrayList arrayList = new ArrayList();
            if (obtainTypedArray.getType(0) == 1) {
                for (int i2 = 0; i2 < obtainTypedArray.length(); i2++) {
                    int resourceId = obtainTypedArray.getResourceId(i2, 0);
                    if (resourceId != 0) {
                        String[] stringArray = resources.getStringArray(resourceId);
                        ArrayList arrayList2 = new ArrayList();
                        for (String str : stringArray) {
                            arrayList2.add(Base64.decode(str, 0));
                        }
                        arrayList.add(arrayList2);
                    }
                }
            } else {
                String[] stringArray2 = resources.getStringArray(i);
                ArrayList arrayList3 = new ArrayList();
                for (String str2 : stringArray2) {
                    arrayList3.add(Base64.decode(str2, 0));
                }
                arrayList.add(arrayList3);
            }
            return arrayList;
        } finally {
            obtainTypedArray.recycle();
        }
    }

    public static final void J3Xc8BaqpN8(List list, List list2) {
        if (list2 == null) {
            if (list.size() >= 2) {
                return;
            }
            o4.mE4lRynR("colors must have length of at least 2 if colorStops is omitted.");
        } else {
            if (list.size() == list2.size()) {
                return;
            }
            o4.mE4lRynR("colors and colorStops arguments must have equal length.");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object JFJ3QoxA(File file, hv hvVar, wg wgVar) {
        qr qrVar;
        int i;
        try {
            if (wgVar instanceof qr) {
                qrVar = (qr) wgVar;
                int i2 = qrVar.JFJ3QoxA;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    qrVar.JFJ3QoxA = i2 - Integer.MIN_VALUE;
                    Object obj = qrVar.mOu10nynGul;
                    i = qrVar.JFJ3QoxA;
                    if (i == 0) {
                        if (i != 1) {
                            o4.jivtDDk9H("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        File file2 = qrVar.encWxUiV2;
                        o50.A1EKNP6CxJ(obj);
                        return obj;
                    }
                    o50.A1EKNP6CxJ(obj);
                    qrVar.encWxUiV2 = file;
                    qrVar.JFJ3QoxA = 1;
                    Object mOu10nynGul2 = hvVar.mOu10nynGul(qrVar);
                    Object obj2 = qh.OOA6hdeuvCS;
                    return mOu10nynGul2 == obj2 ? obj2 : mOu10nynGul2;
                }
            }
            if (i == 0) {
            }
        } catch (IOException e) {
            if (e instanceof uh) {
                throw e;
            }
            file.getClass();
            if (!file.exists()) {
                throw n30.E7jCp8Ls(file, e);
            }
            if (file.isFile()) {
                if (file.canRead()) {
                    if (file.canWrite()) {
                        throw n30.E7jCp8Ls(file, e);
                    }
                    throw n30.E7jCp8Ls(file, e);
                }
                if (file.canWrite()) {
                    throw n30.E7jCp8Ls(file, e);
                }
                throw n30.E7jCp8Ls(file, e);
            }
            if (file.canRead()) {
                if (file.canWrite()) {
                    throw n30.E7jCp8Ls(file, e);
                }
                throw n30.E7jCp8Ls(file, e);
            }
            if (file.canWrite()) {
                throw n30.E7jCp8Ls(file, e);
            }
            throw n30.E7jCp8Ls(file, e);
        }
        qrVar = new qr(wgVar);
        Object obj3 = qrVar.mOu10nynGul;
        i = qrVar.JFJ3QoxA;
    }

    public static final wk M3K9sHhK(gh ghVar) {
        eh E7jCp8Ls2 = ghVar.E7jCp8Ls(b9xEq24R1.arNh8D4Z5gB);
        wk wkVar = E7jCp8Ls2 instanceof wk ? (wk) E7jCp8Ls2 : null;
        return wkVar == null ? ck.GWasM1elztuh : wkVar;
    }

    public static ie0 MZhzXH72(ie0 ie0Var, float f, float f2, int i) {
        if ((i & 1) != 0) {
            f = 0.0f;
        }
        if ((i & 2) != 0) {
            f2 = 0.0f;
        }
        return A1EKNP6CxJ(ie0Var, f, f2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object Mjvvu5DE(ef efVar, ps0 ps0Var) {
        if (!((he0) efVar).OOA6hdeuvCS.Mjvvu5DE) {
            t10.Yi7zF1RB1("Cannot read CompositionLocal because the Modifier node is not currently attached.");
        }
        cp0 cp0Var = (cp0) vc0.eUH21U3apd(efVar).ozMwhSAI;
        cp0Var.getClass();
        return rj0.AEn1Rrio(cp0Var, ps0Var);
    }

    public static w0 OOA6hdeuvCS(int i, int i2, int i3) {
        Bitmap createBitmap;
        gv0 gv0Var = jc.OOA6hdeuvCS;
        Bitmap.Config rezfBrjOrqK = ki1.rezfBrjOrqK(i3);
        if (Build.VERSION.SDK_INT >= 26) {
            createBitmap = Bitmap.createBitmap((DisplayMetrics) null, i, i2, ki1.rezfBrjOrqK(i3), true, y3.GWasM1elztuh(gv0Var));
        } else {
            createBitmap = Bitmap.createBitmap((DisplayMetrics) null, i, i2, rezfBrjOrqK);
            createBitmap.setHasAlpha(true);
        }
        return new w0(createBitmap);
    }

    public static final void TpUsjqg3bxO(vg vgVar, Object obj) {
        if (!(vgVar instanceof im)) {
            vgVar.AvO7iQsrTN(obj);
            return;
        }
        im imVar = (im) vgVar;
        ih ihVar = imVar.encWxUiV2;
        wg wgVar = imVar.mOu10nynGul;
        Throwable GWasM1elztuh2 = tu0.GWasM1elztuh(obj);
        Object ucVar = GWasM1elztuh2 == null ? obj : new uc(GWasM1elztuh2, false);
        if (ihVar.EljAMC1QTz(wgVar.OOA6hdeuvCS())) {
            imVar.JFJ3QoxA = ucVar;
            imVar.AvO7iQsrTN = 1;
            ihVar.OOA6hdeuvCS(wgVar.OOA6hdeuvCS(), imVar);
            return;
        }
        qq GWasM1elztuh3 = d91.GWasM1elztuh();
        if (GWasM1elztuh3.AvO7iQsrTN >= 4294967296L) {
            imVar.JFJ3QoxA = ucVar;
            imVar.AvO7iQsrTN = 1;
            GWasM1elztuh3.rQPn8YBR(imVar);
            return;
        }
        GWasM1elztuh3.XnEVoBF0td1l(true);
        try {
            f40 f40Var = (f40) wgVar.OOA6hdeuvCS().E7jCp8Ls(b9xEq24R1.VeqTn1PQw7);
            if (f40Var == null || f40Var.Yi7zF1RB1()) {
                Object obj2 = imVar.rQPn8YBR;
                gh OOA6hdeuvCS2 = wgVar.OOA6hdeuvCS();
                Object M3K9sHhK = p.M3K9sHhK(OOA6hdeuvCS2, obj2);
                hc1 qugwajBSa59j = M3K9sHhK != p.EXrPz3p7hFb ? qugwajBSa59j(wgVar, OOA6hdeuvCS2, M3K9sHhK) : null;
                try {
                    wgVar.AvO7iQsrTN(obj);
                } finally {
                    if (qugwajBSa59j == null || qugwajBSa59j.JB4pnjMK()) {
                        p.jivtDDk9H(OOA6hdeuvCS2, M3K9sHhK);
                    }
                }
            } else {
                imVar.AvO7iQsrTN(o50.rQPn8YBR(f40Var.iwATDS1i01k()));
            }
            while (GWasM1elztuh3.mE4lRynR()) {
            }
        } finally {
            try {
            } finally {
            }
        }
    }

    public static final long VeqTn1PQw7(float f, long j) {
        float max = Math.max(0.0f, Float.intBitsToFloat((int) (j >> 32)) - f);
        float max2 = Math.max(0.0f, Float.intBitsToFloat((int) (j & 4294967295L)) - f);
        return (Float.floatToRawIntBits(max) << 32) | (Float.floatToRawIntBits(max2) & 4294967295L);
    }

    public static final int WIEu4Ya2g8(List list) {
        int i = 0;
        if (Build.VERSION.SDK_INT >= 26) {
            return 0;
        }
        int size = list.size() - 1;
        for (int i2 = 1; i2 < size; i2++) {
            if (yb.xqGvceK5x(((yb) list.get(i2)).GWasM1elztuh) == 0.0f) {
                i++;
            }
        }
        return i;
    }

    public static final void WRKkgoJXwDn(j6IIN2O8eOU j6iin2o8eou, j6IIN2O8eOU j6iin2o8eou2, hv hvVar, rf0 rf0Var, d01 d01Var, d01 d01Var2) {
        j6IIN2O8eOU j6iin2o8eou3 = j6iin2o8eou;
        Region region = (Region) j6iin2o8eou3.EljAMC1QTz;
        j6IIN2O8eOU j6iin2o8eou4 = j6iin2o8eou2;
        Region region2 = (Region) j6iin2o8eou4.EljAMC1QTz;
        g60 g60Var = d01Var2.X1lG3V04pd;
        g60 g60Var2 = d01Var2.X1lG3V04pd;
        if (!g60Var.A1EKNP6CxJ() || !g60Var2.eUH21U3apd() || region2.isEmpty()) {
            if (d01Var2.iwATDS1i01k()) {
                arNh8D4Z5gB(rf0Var, d01Var, d01Var2);
                return;
            }
            return;
        }
        kt0 XnEVoBF0td1l2 = d01Var2.XnEVoBF0td1l();
        if ((XnEVoBF0td1l2.GWasM1elztuh >= XnEVoBF0td1l2.X1lG3V04pd) | (XnEVoBF0td1l2.Yi7zF1RB1 >= XnEVoBF0td1l2.xqGvceK5x)) {
            xk EljAMC1QTz2 = d01Var2.EljAMC1QTz();
            if (EljAMC1QTz2 == null) {
                z10 z10Var = g60Var2.A1EKNP6CxJ.X1lG3V04pd;
                XnEVoBF0td1l2 = o50.iwATDS1i01k(z10Var).eUH21U3apd(z10Var, false);
            } else {
                he0 he0Var = ((he0) EljAMC1QTz2).OOA6hdeuvCS;
                Object AvO7iQsrTN2 = d01Var2.xqGvceK5x.OOA6hdeuvCS.AvO7iQsrTN(yz0.Yi7zF1RB1);
                if (AvO7iQsrTN2 == null) {
                    AvO7iQsrTN2 = null;
                }
                XnEVoBF0td1l2 = l60.E7jCp8Ls(he0Var, AvO7iQsrTN2 != null, false);
            }
        }
        y20 J3Xc8BaqpN8 = n30.J3Xc8BaqpN8(XnEVoBF0td1l2);
        j6iin2o8eou3.cilMamHF(J3Xc8BaqpN8);
        if (region.op(region2, Region.Op.INTERSECT)) {
            int i = d01Var2.EljAMC1QTz;
            d01 d01Var3 = d01Var;
            if (i == d01Var3.EljAMC1QTz) {
                i = -1;
            }
            Rect bounds = region.getBounds();
            f01 f01Var = new f01(d01Var2, new y20(bounds.left, bounds.top, bounds.right, bounds.bottom));
            rf0 rf0Var2 = rf0Var;
            rf0Var2.encWxUiV2(i, f01Var);
            List JFJ3QoxA2 = d01.JFJ3QoxA(4, d01Var2);
            int size = JFJ3QoxA2.size() - 1;
            while (-1 < size) {
                if (!((Boolean) hvVar.mOu10nynGul(JFJ3QoxA2.get(size))).booleanValue()) {
                    WRKkgoJXwDn(j6iin2o8eou3, j6iin2o8eou4, hvVar, rf0Var2, d01Var3, (d01) JFJ3QoxA2.get(size));
                }
                size--;
                j6iin2o8eou3 = j6iin2o8eou;
                j6iin2o8eou4 = j6iin2o8eou2;
                rf0Var2 = rf0Var;
                d01Var3 = d01Var;
            }
            if (EXrPz3p7hFb(d01Var2)) {
                region2.op(J3Xc8BaqpN8.GWasM1elztuh, J3Xc8BaqpN8.Yi7zF1RB1, J3Xc8BaqpN8.X1lG3V04pd, J3Xc8BaqpN8.xqGvceK5x, Region.Op.DIFFERENCE);
            }
        }
    }

    public static final rf0 WdrkLMV3xh(g01 g01Var, hv hvVar) {
        Trace.beginSection("getAllUncoveredSemanticsNodesToIntObjectMap");
        try {
            d01 GWasM1elztuh2 = g01Var.GWasM1elztuh();
            g60 g60Var = GWasM1elztuh2.X1lG3V04pd;
            if (g60Var.A1EKNP6CxJ() && g60Var.eUH21U3apd()) {
                kt0 AvO7iQsrTN2 = GWasM1elztuh2.AvO7iQsrTN();
                rf0 rf0Var = new rf0(48);
                j6IIN2O8eOU j6iin2o8eou = new j6IIN2O8eOU(26);
                j6iin2o8eou.cilMamHF(n30.J3Xc8BaqpN8(AvO7iQsrTN2));
                pog2g9KITJA(new j6IIN2O8eOU(26), j6iin2o8eou, hvVar, rf0Var, GWasM1elztuh2, GWasM1elztuh2);
                return rf0Var;
            }
            rf0 rf0Var2 = t20.GWasM1elztuh;
            rf0Var2.getClass();
            return rf0Var2;
        } finally {
            Trace.endSection();
        }
    }

    public static rc X1lG3V04pd() {
        rc rcVar = new rc(true);
        rcVar.z19UFEN2I(null);
        return rcVar;
    }

    public static final void XnEVoBF0td1l(y21 y21Var, ArrayList arrayList, int i) {
        boolean E7jCp8Ls2 = y21Var.E7jCp8Ls(i);
        int[] iArr = y21Var.Yi7zF1RB1;
        if (E7jCp8Ls2) {
            arrayList.add(y21Var.uFEq9NpZ(i));
            return;
        }
        int i2 = iArr[(i * 5) + 3] + i;
        for (int i3 = i + 1; i3 < i2; i3 += iArr[(i3 * 5) + 3]) {
            XnEVoBF0td1l(y21Var, arrayList, i3);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x0015, code lost:
    
        r4 = r4.getValue("android:text");
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x001b, code lost:
    
        r4 = r4.getText();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void Y6hRI1cF8(w wVar, LongSparseArray longSparseArray) {
        TranslationResponseValue value;
        CharSequence text;
        f01 f01Var;
        d01 d01Var;
        hv hvVar;
        int size = longSparseArray.size();
        for (int i = 0; i < size; i++) {
            long keyAt = longSparseArray.keyAt(i);
            ViewTranslationResponse iwATDS1i01k2 = m.iwATDS1i01k(longSparseArray.get(keyAt));
            if (iwATDS1i01k2 != null && value != null && text != null && (f01Var = (f01) wVar.AvO7iQsrTN().Yi7zF1RB1((int) keyAt)) != null && (d01Var = f01Var.GWasM1elztuh) != null) {
                Object AvO7iQsrTN2 = d01Var.xqGvceK5x.OOA6hdeuvCS.AvO7iQsrTN(yz0.E7jCp8Ls);
                if (AvO7iQsrTN2 == null) {
                    AvO7iQsrTN2 = null;
                }
                VeqTn1PQw7 veqTn1PQw7 = (VeqTn1PQw7) AvO7iQsrTN2;
                if (veqTn1PQw7 != null && (hvVar = (hv) veqTn1PQw7.Yi7zF1RB1) != null) {
                }
            }
        }
    }

    public static void YXi2hvwn7WL(String str) {
        vc vcVar = new vc("lateinit property " + str + " has not been initialized");
        dqB83aoLBB(vcVar, o30.class.getName());
        throw vcVar;
    }

    public static final ie0 YZjbz8VdP5(ie0 ie0Var, nn0 nn0Var) {
        return ie0Var.X1lG3V04pd(new mn0(nn0Var));
    }

    public static final void Yi7zF1RB1(ie0 ie0Var, hv hvVar, qx qxVar, int i) {
        int i2;
        qxVar.Uxq83abb04(-932836462);
        if ((i & 6) == 0) {
            i2 = (qxVar.EljAMC1QTz(ie0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= qxVar.encWxUiV2(hvVar) ? 32 : 16;
        }
        int i3 = 0;
        if (qxVar.dqB83aoLBB(i2 & 1, (i2 & 19) != 18)) {
            b70.AvO7iQsrTN(qxVar, fb1.Y6hRI1cF8(ie0Var, hvVar));
        } else {
            qxVar.YXi2hvwn7WL();
        }
        at0 Mjvvu5DE2 = qxVar.Mjvvu5DE();
        if (Mjvvu5DE2 != null) {
            Mjvvu5DE2.xqGvceK5x = new w9(i, i3, ie0Var, hvVar);
        }
    }

    public static final la1 YmKjaVtbfp5Z(qa1 qa1Var, eb1 eb1Var, String str, qx qxVar, int i, int i2) {
        ka1 ka1Var;
        if ((i2 & 2) != 0) {
            str = "DeferredAnimation";
        }
        boolean EljAMC1QTz2 = qxVar.EljAMC1QTz(qa1Var);
        Object HFYAaqMd6 = qxVar.HFYAaqMd6();
        Object obj = ue.GWasM1elztuh;
        if (EljAMC1QTz2 || HFYAaqMd6 == obj) {
            HFYAaqMd6 = new la1(qa1Var, eb1Var, str);
            qxVar.dcDmLGVhzWm(HFYAaqMd6);
        }
        la1 la1Var = (la1) HFYAaqMd6;
        boolean EljAMC1QTz3 = qxVar.EljAMC1QTz(qa1Var) | qxVar.encWxUiV2(la1Var);
        Object HFYAaqMd62 = qxVar.HFYAaqMd6();
        if (EljAMC1QTz3 || HFYAaqMd62 == obj) {
            HFYAaqMd62 = new X1lG3V04pd(28, qa1Var, la1Var);
            qxVar.dcDmLGVhzWm(HFYAaqMd62);
        }
        ki1.EljAMC1QTz(la1Var, (hv) HFYAaqMd62, qxVar);
        if (qa1Var.AvO7iQsrTN() && (ka1Var = (ka1) la1Var.Yi7zF1RB1.getValue()) != null) {
            qa1 qa1Var2 = la1Var.X1lG3V04pd;
            ka1Var.OOA6hdeuvCS.AvO7iQsrTN(ka1Var.AvO7iQsrTN.mOu10nynGul(qa1Var2.EljAMC1QTz().Yi7zF1RB1()), ka1Var.AvO7iQsrTN.mOu10nynGul(qa1Var2.EljAMC1QTz().X1lG3V04pd()), (xr) ka1Var.EljAMC1QTz.mOu10nynGul(qa1Var2.EljAMC1QTz()));
        }
        return la1Var;
    }

    public static final void arNh8D4Z5gB(rf0 rf0Var, d01 d01Var, d01 d01Var2) {
        g60 g60Var;
        d01 E7jCp8Ls2 = d01Var2.E7jCp8Ls();
        kt0 AvO7iQsrTN2 = (E7jCp8Ls2 == null || (g60Var = E7jCp8Ls2.X1lG3V04pd) == null || !g60Var.A1EKNP6CxJ()) ? YmKjaVtbfp5Z : E7jCp8Ls2.AvO7iQsrTN();
        int i = d01Var2.EljAMC1QTz;
        if (i == d01Var.EljAMC1QTz) {
            i = -1;
        }
        rf0Var.encWxUiV2(i, new f01(d01Var2, n30.J3Xc8BaqpN8(AvO7iQsrTN2)));
    }

    public static final int cilMamHF(int i, List list) {
        int size = list.size() - 1;
        int i2 = 0;
        while (i2 <= size) {
            int i3 = (i2 + size) >>> 1;
            int uFEq9NpZ2 = uFEq9NpZ(((y30) list.get(i3)).Yi7zF1RB1, i);
            if (uFEq9NpZ2 < 0) {
                i2 = i3 + 1;
            } else {
                if (uFEq9NpZ2 <= 0) {
                    return i3;
                }
                size = i3 - 1;
            }
        }
        return -(i2 + 1);
    }

    public static void dqB83aoLBB(RuntimeException runtimeException, String str) {
        StackTraceElement[] stackTrace = runtimeException.getStackTrace();
        int length = stackTrace.length;
        int i = -1;
        for (int i2 = 0; i2 < length; i2++) {
            if (str.equals(stackTrace[i2].getClassName())) {
                i = i2;
            }
        }
        runtimeException.setStackTrace((StackTraceElement[]) Arrays.copyOfRange(stackTrace, i + 1, length));
    }

    public static final ie0 eUH21U3apd(ie0 ie0Var, float f) {
        return ie0Var.X1lG3V04pd(new kn0(f, f, f, f));
    }

    public static final void encWxUiV2(y41 y41Var) {
        int i = y41Var.encWxUiV2;
        int[] iArr = y41Var.EljAMC1QTz;
        Object[] objArr = y41Var.AvO7iQsrTN;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = objArr[i3];
            if (obj != Mjvvu5DE) {
                if (i3 != i2) {
                    iArr[i2] = iArr[i3];
                    objArr[i2] = obj;
                    objArr[i3] = null;
                }
                i2++;
            }
        }
        y41Var.OOA6hdeuvCS = false;
        y41Var.encWxUiV2 = i2;
    }

    public static int iwATDS1i01k(long j, long j2) {
        if (j < j2) {
            return -1;
        }
        return j == j2 ? 0 : 1;
    }

    public static boolean jivtDDk9H(View view, KeyEvent keyEvent) {
        ArrayList arrayList;
        int size;
        int indexOfKey;
        int i = ne1.GWasM1elztuh;
        if (Build.VERSION.SDK_INT < 28) {
            ArrayList arrayList2 = me1.xqGvceK5x;
            me1 me1Var = (me1) view.getTag(R.id.tag_unhandled_key_event_manager);
            WeakReference weakReference = null;
            if (me1Var == null) {
                me1Var = new me1();
                me1Var.GWasM1elztuh = null;
                me1Var.Yi7zF1RB1 = null;
                me1Var.X1lG3V04pd = null;
                view.setTag(R.id.tag_unhandled_key_event_manager, me1Var);
            }
            WeakReference weakReference2 = me1Var.X1lG3V04pd;
            if (weakReference2 == null || weakReference2.get() != keyEvent) {
                me1Var.X1lG3V04pd = new WeakReference(keyEvent);
                if (me1Var.Yi7zF1RB1 == null) {
                    me1Var.Yi7zF1RB1 = new SparseArray();
                }
                SparseArray sparseArray = me1Var.Yi7zF1RB1;
                if (keyEvent.getAction() == 1 && (indexOfKey = sparseArray.indexOfKey(keyEvent.getKeyCode())) >= 0) {
                    weakReference = (WeakReference) sparseArray.valueAt(indexOfKey);
                    sparseArray.removeAt(indexOfKey);
                }
                if (weakReference == null) {
                    weakReference = (WeakReference) sparseArray.get(keyEvent.getKeyCode());
                }
                if (weakReference != null) {
                    View view2 = (View) weakReference.get();
                    if (view2 == null || !view2.isAttachedToWindow() || (arrayList = (ArrayList) view2.getTag(R.id.tag_unhandled_key_listeners)) == null || (size = arrayList.size() - 1) < 0) {
                        return true;
                    }
                    arrayList.get(size).getClass();
                    o4.YmKjaVtbfp5Z();
                    return false;
                }
            }
        }
        return false;
    }

    public static final boolean k8h8IjolWQ(d01 d01Var) {
        bk0 xqGvceK5x2 = d01Var.xqGvceK5x();
        hg0 hg0Var = d01Var.xqGvceK5x.OOA6hdeuvCS;
        return (xqGvceK5x2 != null ? xqGvceK5x2.o6lobyFa() : false) || hg0Var.X1lG3V04pd(h01.YmKjaVtbfp5Z) || hg0Var.X1lG3V04pd(h01.WIEu4Ya2g8);
    }

    public static final gh lv06NcmrQ(gh ghVar, gh ghVar2, boolean z) {
        Boolean bool = Boolean.FALSE;
        int i = 17;
        boolean booleanValue = ((Boolean) ghVar.WIEu4Ya2g8(new pd(i), bool)).booleanValue();
        boolean booleanValue2 = ((Boolean) ghVar2.WIEu4Ya2g8(new pd(i), bool)).booleanValue();
        if (!booleanValue && !booleanValue2) {
            return ghVar.mOu10nynGul(ghVar2);
        }
        pd pdVar = new pd(15);
        vp vpVar = vp.OOA6hdeuvCS;
        gh ghVar3 = (gh) ghVar.WIEu4Ya2g8(pdVar, vpVar);
        Object obj = ghVar2;
        if (booleanValue2) {
            obj = ghVar2.WIEu4Ya2g8(new pd(16), vpVar);
        }
        return ghVar3.mOu10nynGul((gh) obj);
    }

    public static final Object mE4lRynR(long j, wg wgVar) {
        if (j > 0) {
            n9 n9Var = new n9(1, rj0.M3K9sHhK(wgVar));
            n9Var.cilMamHF();
            if (j < Long.MAX_VALUE) {
                M3K9sHhK(n9Var.mOu10nynGul).xqGvceK5x(j, n9Var);
            }
            Object jivtDDk9H2 = n9Var.jivtDDk9H();
            if (jivtDDk9H2 == qh.OOA6hdeuvCS) {
                return jivtDDk9H2;
            }
        }
        return kc1.GWasM1elztuh;
    }

    public static final void mOu10nynGul(List list, int i, int i2) {
        int cilMamHF = cilMamHF(i, list);
        if (cilMamHF < 0) {
            cilMamHF = -(cilMamHF + 1);
        }
        while (cilMamHF < list.size() && ((y30) list.get(cilMamHF)).Yi7zF1RB1 < i2) {
        }
    }

    public static final int[] ozMwhSAI(int i, List list) {
        int i2;
        int i3 = 0;
        if (Build.VERSION.SDK_INT >= 26) {
            int size = list.size();
            int[] iArr = new int[size];
            while (i3 < size) {
                iArr[i3] = ki1.HFYAaqMd6(((yb) list.get(i3)).GWasM1elztuh);
                i3++;
            }
            return iArr;
        }
        int[] iArr2 = new int[list.size() + i];
        int size2 = list.size() - 1;
        int size3 = list.size();
        int i4 = 0;
        while (i3 < size3) {
            long j = ((yb) list.get(i3)).GWasM1elztuh;
            if (yb.xqGvceK5x(j) == 0.0f) {
                if (i3 == 0) {
                    i2 = i4 + 1;
                    iArr2[i4] = ki1.HFYAaqMd6(yb.Yi7zF1RB1(0.0f, ((yb) list.get(1)).GWasM1elztuh));
                } else if (i3 == size2) {
                    i2 = i4 + 1;
                    iArr2[i4] = ki1.HFYAaqMd6(yb.Yi7zF1RB1(0.0f, ((yb) list.get(i3 - 1)).GWasM1elztuh));
                } else {
                    int i5 = i4 + 1;
                    iArr2[i4] = ki1.HFYAaqMd6(yb.Yi7zF1RB1(0.0f, ((yb) list.get(i3 - 1)).GWasM1elztuh));
                    i4 += 2;
                    iArr2[i5] = ki1.HFYAaqMd6(yb.Yi7zF1RB1(0.0f, ((yb) list.get(i3 + 1)).GWasM1elztuh));
                }
                i4 = i2;
            } else {
                iArr2[i4] = ki1.HFYAaqMd6(j);
                i4++;
            }
            i3++;
        }
        return iArr2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x00ab, code lost:
    
        if (r5 != null) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00bf, code lost:
    
        if (r0 != null) goto L51;
     */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:64:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void pog2g9KITJA(j6IIN2O8eOU j6iin2o8eou, j6IIN2O8eOU j6iin2o8eou2, hv hvVar, rf0 rf0Var, d01 d01Var, d01 d01Var2) {
        boolean z;
        kt0 E7jCp8Ls2;
        rf0 rf0Var2 = rf0Var;
        d01 d01Var3 = d01Var;
        int i = d01Var3.EljAMC1QTz;
        Region region = (Region) j6iin2o8eou.EljAMC1QTz;
        j6IIN2O8eOU j6iin2o8eou3 = j6iin2o8eou2;
        Region region2 = (Region) j6iin2o8eou3.EljAMC1QTz;
        g60 g60Var = d01Var2.X1lG3V04pd;
        zz0 zz0Var = d01Var2.xqGvceK5x;
        g60 g60Var2 = d01Var2.X1lG3V04pd;
        int i2 = d01Var2.EljAMC1QTz;
        boolean z2 = (g60Var.A1EKNP6CxJ() && g60Var2.eUH21U3apd()) ? false : true;
        if (region2.isEmpty() && i2 != i) {
            return;
        }
        if (z2 && !d01Var2.iwATDS1i01k()) {
            return;
        }
        y20 J3Xc8BaqpN8 = n30.J3Xc8BaqpN8(d01Var2.XnEVoBF0td1l());
        j6iin2o8eou.cilMamHF(J3Xc8BaqpN8);
        if (i2 == i) {
            i2 = -1;
        }
        if (!region.op(region2, Region.Op.INTERSECT)) {
            if (d01Var2.iwATDS1i01k()) {
                arNh8D4Z5gB(rf0Var, d01Var, d01Var2);
                return;
            } else {
                if (i2 == -1) {
                    Rect bounds = region.getBounds();
                    rf0Var2.encWxUiV2(i2, new f01(d01Var2, new y20(bounds.left, bounds.top, bounds.right, bounds.bottom)));
                    return;
                }
                return;
            }
        }
        Rect bounds2 = region.getBounds();
        rf0Var2.encWxUiV2(i2, new f01(d01Var2, new y20(bounds2.left, bounds2.top, bounds2.right, bounds2.bottom)));
        List JFJ3QoxA2 = d01.JFJ3QoxA(4, d01Var2);
        if (zz0Var.AvO7iQsrTN) {
            d01 E7jCp8Ls3 = d01Var2.E7jCp8Ls();
            while (true) {
                if (E7jCp8Ls3 == null) {
                    E7jCp8Ls3 = null;
                    break;
                }
                hg0 hg0Var = E7jCp8Ls3.xqGvceK5x.OOA6hdeuvCS;
                if (hg0Var.X1lG3V04pd(h01.lv06NcmrQ) || hg0Var.X1lG3V04pd(h01.cilMamHF)) {
                    break;
                } else {
                    E7jCp8Ls3 = E7jCp8Ls3.E7jCp8Ls();
                }
            }
            if (E7jCp8Ls3 != null) {
                bk0 xqGvceK5x2 = d01Var2.xqGvceK5x();
                if (xqGvceK5x2 != null) {
                    if (!xqGvceK5x2.iK7aQfvhG().Mjvvu5DE) {
                        xqGvceK5x2 = null;
                    }
                }
                xqGvceK5x2 = null;
                bk0 xqGvceK5x3 = E7jCp8Ls3.xqGvceK5x();
                if (xqGvceK5x3 != null) {
                    if (!xqGvceK5x3.iK7aQfvhG().Mjvvu5DE) {
                        xqGvceK5x3 = null;
                    }
                }
                xqGvceK5x3 = null;
                if (xqGvceK5x2 != null && xqGvceK5x3 != null) {
                    kt0 eUH21U3apd = xqGvceK5x3.eUH21U3apd(xqGvceK5x2, false);
                    z = !eUH21U3apd.equals(eUH21U3apd.X1lG3V04pd(w60.EljAMC1QTz(0L, CMh55RymNfS(xqGvceK5x3.AvO7iQsrTN))));
                    if (z) {
                        j6IIN2O8eOU j6iin2o8eou4 = new j6IIN2O8eOU(26);
                        xk EljAMC1QTz2 = d01Var2.EljAMC1QTz();
                        if (EljAMC1QTz2 == null) {
                            z10 z10Var = g60Var2.A1EKNP6CxJ.X1lG3V04pd;
                            E7jCp8Ls2 = o50.iwATDS1i01k(z10Var).eUH21U3apd(z10Var, false);
                        } else {
                            he0 he0Var = ((he0) EljAMC1QTz2).OOA6hdeuvCS;
                            Object AvO7iQsrTN2 = zz0Var.OOA6hdeuvCS.AvO7iQsrTN(yz0.Yi7zF1RB1);
                            E7jCp8Ls2 = l60.E7jCp8Ls(he0Var, (AvO7iQsrTN2 == null ? null : AvO7iQsrTN2) != null, false);
                        }
                        j6iin2o8eou4.cilMamHF(n30.J3Xc8BaqpN8(E7jCp8Ls2));
                        int size = JFJ3QoxA2.size() - 1;
                        while (-1 < size) {
                            if (!((Boolean) hvVar.mOu10nynGul(JFJ3QoxA2.get(size))).booleanValue()) {
                                WRKkgoJXwDn(new j6IIN2O8eOU(26), j6iin2o8eou4, hvVar, rf0Var2, d01Var3, (d01) JFJ3QoxA2.get(size));
                            }
                            size--;
                            rf0Var2 = rf0Var;
                            d01Var3 = d01Var;
                        }
                        if (EXrPz3p7hFb(d01Var2)) {
                            return;
                        }
                        region2.op(J3Xc8BaqpN8.GWasM1elztuh, J3Xc8BaqpN8.Yi7zF1RB1, J3Xc8BaqpN8.X1lG3V04pd, J3Xc8BaqpN8.xqGvceK5x, Region.Op.DIFFERENCE);
                        return;
                    }
                }
            }
            z = false;
            if (z) {
            }
        }
        hv hvVar2 = hvVar;
        int size2 = JFJ3QoxA2.size() - 1;
        while (-1 < size2) {
            if (!((Boolean) hvVar2.mOu10nynGul(JFJ3QoxA2.get(size2))).booleanValue()) {
                pog2g9KITJA(j6iin2o8eou, j6iin2o8eou3, hvVar2, rf0Var, d01Var, (d01) JFJ3QoxA2.get(size2));
            }
            size2--;
            j6iin2o8eou3 = j6iin2o8eou2;
            hvVar2 = hvVar;
        }
        if (EXrPz3p7hFb(d01Var2)) {
        }
    }

    public static final hc1 qugwajBSa59j(vg vgVar, gh ghVar, Object obj) {
        hc1 hc1Var = null;
        if ((vgVar instanceof rh) && ghVar.E7jCp8Ls(r9.AvO7iQsrTN) != null) {
            rh rhVar = (rh) vgVar;
            while (true) {
                if ((rhVar instanceof jm) || (rhVar = rhVar.xqGvceK5x()) == null) {
                    break;
                }
                if (rhVar instanceof hc1) {
                    hc1Var = (hc1) rhVar;
                    break;
                }
            }
            if (hc1Var != null) {
                hc1Var.jed7WnvkLvFq(ghVar, obj);
            }
        }
        return hc1Var;
    }

    public static boolean rQPn8YBR(Object obj, Object obj2) {
        return obj == null ? obj2 == null : obj.equals(obj2);
    }

    public static final void rezfBrjOrqK(c31 c31Var, int i, Object obj) {
        int encWxUiV22 = c31Var.encWxUiV2(i);
        Object[] objArr = c31Var.X1lG3V04pd;
        Object obj2 = objArr[encWxUiV22];
        objArr[encWxUiV22] = ue.GWasM1elztuh;
        if (obj == obj2) {
            return;
        }
        we.GWasM1elztuh("Slot table is out of sync (expected " + obj + ", got " + obj2 + ')');
    }

    public static int uFEq9NpZ(int i, int i2) {
        if (i < i2) {
            return -1;
        }
        return i == i2 ? 0 : 1;
    }

    public static final long xqGvceK5x(float f, float f2) {
        return (Float.floatToRawIntBits(f2) & 4294967295L) | (Float.floatToRawIntBits(f) << 32);
    }

    public static final cq z19UFEN2I(qa1 qa1Var, hv hvVar, Object obj, qx qxVar) {
        qxVar.CMh55RymNfS(-422486745, 0, qa1Var, null);
        boolean AvO7iQsrTN2 = qa1Var.AvO7iQsrTN();
        le leVar = qa1Var.GWasM1elztuh;
        cq cqVar = cq.OOA6hdeuvCS;
        cq cqVar2 = cq.AvO7iQsrTN;
        cq cqVar3 = cq.EljAMC1QTz;
        if (AvO7iQsrTN2) {
            qxVar.MjxSquD6Av(-212166497);
            qxVar.WIEu4Ya2g8(false);
            if (((Boolean) hvVar.mOu10nynGul(obj)).booleanValue()) {
                cqVar = cqVar3;
            } else if (((Boolean) hvVar.mOu10nynGul(leVar.EljAMC1QTz())).booleanValue()) {
                cqVar = cqVar2;
            }
        } else {
            qxVar.MjxSquD6Av(-211892364);
            Object HFYAaqMd6 = qxVar.HFYAaqMd6();
            if (HFYAaqMd6 == ue.GWasM1elztuh) {
                HFYAaqMd6 = z50.WRKkgoJXwDn(Boolean.FALSE);
                qxVar.dcDmLGVhzWm(HFYAaqMd6);
            }
            mg0 mg0Var = (mg0) HFYAaqMd6;
            if (((Boolean) hvVar.mOu10nynGul(leVar.EljAMC1QTz())).booleanValue()) {
                mg0Var.setValue(Boolean.TRUE);
            }
            if (((Boolean) hvVar.mOu10nynGul(obj)).booleanValue()) {
                cqVar = cqVar3;
            } else if (((Boolean) mg0Var.getValue()).booleanValue()) {
                cqVar = cqVar2;
            }
            qxVar.WIEu4Ya2g8(false);
        }
        qxVar.WIEu4Ya2g8(false);
        return cqVar;
    }
}
