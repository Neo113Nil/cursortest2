package defpackage;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Rect;
import android.graphics.text.LineBreakConfig;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Trace;
import android.text.Layout;
import android.text.Spanned;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.MetricAffectingSpan;
import android.util.Log;
import android.view.View;
import android.view.Window;
import com.combinations.level.experts.R;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public abstract class l60 {
    public static i00 GWasM1elztuh;
    public static Method X1lG3V04pd;
    public static long Yi7zF1RB1;

    public static final void AvO7iQsrTN(ha1 ha1Var, kq0 kq0Var, long j) {
        uk ukVar = (uk) ha1Var.EljAMC1QTz;
        ukVar.getClass();
        ae1 ae1Var = ukVar.Yi7zF1RB1;
        ae1 ae1Var2 = ukVar.GWasM1elztuh;
        boolean JFJ3QoxA = d70.JFJ3QoxA(kq0Var);
        long j2 = kq0Var.Yi7zF1RB1;
        if (JFJ3QoxA) {
            fi[] fiVarArr = ae1Var2.xqGvceK5x;
            Arrays.fill(fiVarArr, 0, fiVarArr.length, (Object) null);
            ae1Var2.OOA6hdeuvCS = 0;
            fi[] fiVarArr2 = ae1Var.xqGvceK5x;
            Arrays.fill(fiVarArr2, 0, fiVarArr2.length, (Object) null);
            ae1Var.OOA6hdeuvCS = 0;
            ukVar.X1lG3V04pd = 0L;
        }
        if (!d70.rQPn8YBR(kq0Var)) {
            List list = kq0Var.XnEVoBF0td1l;
            if (list == null) {
                list = xp.OOA6hdeuvCS;
            }
            int size = list.size();
            for (int i = 0; i < size; i++) {
                jz jzVar = (jz) list.get(i);
                ukVar.GWasM1elztuh(jzVar.GWasM1elztuh, uk0.OOA6hdeuvCS(jzVar.OOA6hdeuvCS, j));
            }
            ukVar.GWasM1elztuh(j2, uk0.OOA6hdeuvCS(kq0Var.uFEq9NpZ, j));
        }
        if (d70.rQPn8YBR(kq0Var) && j2 - ukVar.X1lG3V04pd > 40) {
            fi[] fiVarArr3 = ae1Var2.xqGvceK5x;
            Arrays.fill(fiVarArr3, 0, fiVarArr3.length, (Object) null);
            ae1Var2.OOA6hdeuvCS = 0;
            fi[] fiVarArr4 = ae1Var.xqGvceK5x;
            Arrays.fill(fiVarArr4, 0, fiVarArr4.length, (Object) null);
            ae1Var.OOA6hdeuvCS = 0;
            ukVar.X1lG3V04pd = 0L;
        }
        ukVar.X1lG3V04pd = j2;
    }

    public static final kt0 E7jCp8Ls(he0 he0Var, boolean z, boolean z2) {
        if (!he0Var.OOA6hdeuvCS.Mjvvu5DE) {
            return kt0.OOA6hdeuvCS;
        }
        if (z) {
            return vc0.AEn1Rrio(he0Var, 8).o9oGstcVt9();
        }
        bk0 AEn1Rrio = vc0.AEn1Rrio(he0Var, 8);
        return o50.iwATDS1i01k(AEn1Rrio).eUH21U3apd(AEn1Rrio, z2);
    }

    public static final he0 EljAMC1QTz(xk xkVar, int i) {
        he0 he0Var = ((he0) xkVar).OOA6hdeuvCS.JFJ3QoxA;
        if (he0Var == null || (he0Var.encWxUiV2 & i) == 0) {
            return null;
        }
        while (he0Var != null) {
            int i2 = he0Var.AvO7iQsrTN;
            if ((i2 & 2) != 0) {
                return null;
            }
            if ((i2 & i) != 0) {
                return he0Var;
            }
            he0Var = he0Var.JFJ3QoxA;
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:135:0x0287, code lost:
    
        if (r44.AvO7iQsrTN(true) != false) goto L173;
     */
    /* JADX WARN: Removed duplicated region for block: B:144:0x02b7  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x02ce  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x02e1  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x02ff A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0325  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0364  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x02c1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void GWasM1elztuh(final ie0 ie0Var, u80 u80Var, final nn0 nn0Var, final fk fkVar, final boolean z, final m0 m0Var, final p6 p6Var, final t4 t4Var, final hv hvVar, qx qxVar, final int i, final int i2) {
        int i3;
        int i4;
        u80 u80Var2;
        int i5;
        boolean z2;
        Object obj;
        boolean z3;
        boolean EljAMC1QTz;
        Object o80Var;
        u80 u80Var3;
        boolean z4;
        l80 l80Var;
        ie0 ie0Var2;
        qxVar.Uxq83abb04(924924659);
        if ((i & 6) == 0) {
            i3 = (qxVar.EljAMC1QTz(ie0Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= qxVar.EljAMC1QTz(u80Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= qxVar.EljAMC1QTz(nn0Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= qxVar.AvO7iQsrTN(false) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i3 |= qxVar.AvO7iQsrTN(true) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i3 |= qxVar.EljAMC1QTz(fkVar) ? 131072 : 65536;
        }
        if ((i & 1572864) == 0) {
            i3 |= qxVar.AvO7iQsrTN(z) ? 1048576 : 524288;
        }
        if ((i & 12582912) == 0) {
            i3 |= qxVar.EljAMC1QTz(m0Var) ? 8388608 : 4194304;
        }
        if ((i & 100663296) == 0) {
            i3 |= 33554432;
        }
        if ((i & 805306368) == 0) {
            i3 |= qxVar.EljAMC1QTz(p6Var) ? 536870912 : 268435456;
        }
        if ((i2 & 6) == 0) {
            i4 = i2 | (qxVar.EljAMC1QTz(t4Var) ? 4 : 2);
        } else {
            i4 = i2;
        }
        int i6 = i4 | 432;
        if ((i2 & 3072) == 0) {
            i6 |= qxVar.encWxUiV2(hvVar) ? 2048 : 1024;
        }
        if (qxVar.dqB83aoLBB(i3 & 1, ((i3 & 306783379) == 306783378 && (i6 & 1171) == 1170) ? false : true)) {
            qxVar.qugwajBSa59j();
            if ((i & 1) != 0 && !qxVar.WRKkgoJXwDn()) {
                qxVar.YXi2hvwn7WL();
            }
            int i7 = i3 & (-234881025);
            qxVar.YmKjaVtbfp5Z();
            int i8 = i7 >> 3;
            int i9 = i8 & 14;
            int i10 = i9 | ((i6 >> 6) & 112);
            mg0 pog2g9KITJA = z50.pog2g9KITJA(hvVar, qxVar);
            boolean z5 = (((i10 & 14) ^ 6) > 4 && qxVar.EljAMC1QTz(u80Var)) || (i10 & 6) == 4;
            Object HFYAaqMd6 = qxVar.HFYAaqMd6();
            Object obj2 = ue.GWasM1elztuh;
            if (z5 || HFYAaqMd6 == obj2) {
                c70 c70Var = new c70();
                c70Var.GWasM1elztuh = new co0(Integer.MAX_VALUE);
                c70Var.Yi7zF1RB1 = new co0(Integer.MAX_VALUE);
                b9xEq24R1 b9xeq24r1 = b9xEq24R1.Uxq83abb04;
                i5 = i6;
                r70 r70Var = new r70(pog2g9KITJA, 1);
                f4 f4Var = l41.GWasM1elztuh;
                HFYAaqMd6 = new l80(0, 0, m51.class, new ml(new t5(new ml(r70Var, b9xeq24r1), u80Var, c70Var, 4), b9xeq24r1), "value", "getValue()Ljava/lang/Object;");
                qxVar.dcDmLGVhzWm(HFYAaqMd6);
            } else {
                i5 = i6;
            }
            l80 l80Var2 = (l80) HFYAaqMd6;
            int i11 = i7 >> 9;
            int i12 = (i11 & 112) | i9;
            boolean z6 = ((((i12 & 112) ^ 48) > 32 && qxVar.AvO7iQsrTN(true)) || (i12 & 48) == 32) | ((((i12 & 14) ^ 6) > 4 && qxVar.EljAMC1QTz(u80Var)) || (i12 & 6) == 4);
            Object HFYAaqMd62 = qxVar.HFYAaqMd6();
            if (z6 || HFYAaqMd62 == obj2) {
                HFYAaqMd62 = new b80(u80Var);
                qxVar.dcDmLGVhzWm(HFYAaqMd62);
            }
            b80 b80Var = (b80) HFYAaqMd62;
            Object HFYAaqMd63 = qxVar.HFYAaqMd6();
            if (HFYAaqMd63 == obj2) {
                HFYAaqMd63 = ki1.WdrkLMV3xh(qxVar);
                qxVar.dcDmLGVhzWm(HFYAaqMd63);
            }
            ph phVar = (ph) HFYAaqMd63;
            ny nyVar = (ny) qxVar.JFJ3QoxA(kf.AvO7iQsrTN);
            x51 x51Var = !((Boolean) qxVar.JFJ3QoxA(kf.lv06NcmrQ)).booleanValue() ? y51.GWasM1elztuh : null;
            int i13 = i5 << 18;
            int i14 = (i7 & 65520) | (i11 & 3670016) | (i13 & 29360128) | (i13 & 234881024) | ((i5 << 27) & 1879048192);
            boolean z7 = ((((i14 & 896) ^ 384) > 256 && qxVar.EljAMC1QTz(nn0Var)) || (i14 & 384) == 256) | ((((i14 & 112) ^ 48) > 32 && qxVar.EljAMC1QTz(u80Var)) || (i14 & 48) == 32) | ((((i14 & 7168) ^ 3072) > 2048 && qxVar.AvO7iQsrTN(false)) || (i14 & 3072) == 2048);
            if (((57344 & i14) ^ 24576) <= 16384) {
            }
            if ((i14 & 24576) != 16384) {
                z2 = false;
                boolean xqGvceK5x = z7 | z2 | qxVar.xqGvceK5x(0) | ((((i14 & 3670016) ^ 1572864) <= 1048576 && qxVar.EljAMC1QTz(p6Var)) || (i14 & 1572864) == 1048576);
                if (((i14 & 29360128) ^ 12582912) <= 8388608) {
                    obj = null;
                    if (qxVar.EljAMC1QTz(null)) {
                        z3 = true;
                        EljAMC1QTz = (((i14 & 234881024) ^ 100663296) <= 67108864 && qxVar.EljAMC1QTz(obj)) | xqGvceK5x | z3 | ((((i14 & 1879048192) ^ 805306368) <= 536870912 && qxVar.EljAMC1QTz(t4Var)) || (i14 & 805306368) == 536870912) | qxVar.EljAMC1QTz(nyVar) | qxVar.EljAMC1QTz(x51Var);
                        Object HFYAaqMd64 = qxVar.HFYAaqMd6();
                        if (!EljAMC1QTz || HFYAaqMd64 == obj2) {
                            u80Var3 = u80Var;
                            z4 = true;
                            o80Var = new o80(u80Var3, nn0Var, l80Var2, t4Var, phVar, nyVar, x51Var, p6Var);
                            l80Var = l80Var2;
                            qxVar.dcDmLGVhzWm(o80Var);
                        } else {
                            o80Var = HFYAaqMd64;
                            l80Var = l80Var2;
                            z4 = true;
                            u80Var3 = u80Var;
                        }
                        o80 o80Var2 = (o80) o80Var;
                        xm0 xm0Var = xm0.OOA6hdeuvCS;
                        if (z) {
                            qxVar.MjxSquD6Av(-2077147368);
                            if ((((i8 & 14) ^ 6) <= 4 || !qxVar.EljAMC1QTz(u80Var3)) && (i8 & 6) != 4) {
                                z4 = false;
                            }
                            boolean xqGvceK5x2 = z4 | qxVar.xqGvceK5x(0);
                            Object HFYAaqMd65 = qxVar.HFYAaqMd6();
                            if (xqGvceK5x2 || HFYAaqMd65 == obj2) {
                                HFYAaqMd65 = new h80(u80Var3);
                                qxVar.dcDmLGVhzWm(HFYAaqMd65);
                            }
                            ie0Var2 = vc0.pog2g9KITJA((h80) HFYAaqMd65, u80Var3.iwATDS1i01k, xm0Var);
                            qxVar.WIEu4Ya2g8(false);
                        } else {
                            qxVar.MjxSquD6Av(-2076718545);
                            qxVar.WIEu4Ya2g8(false);
                            ie0Var2 = fe0.GWasM1elztuh;
                        }
                        u80Var2 = u80Var3;
                        z50.GWasM1elztuh(l80Var, n30.MItybXapHX(fb1.DmJncFq5(ie0Var.X1lG3V04pd(u80Var3.E7jCp8Ls).X1lG3V04pd(u80Var3.XnEVoBF0td1l), l80Var, b80Var, xm0Var, z).X1lG3V04pd(ie0Var2).X1lG3V04pd(u80Var3.uFEq9NpZ.mOu10nynGul), u80Var3, xm0Var, m0Var, z, fkVar, u80Var3.AvO7iQsrTN), u80Var2.WIEu4Ya2g8, o80Var2, qxVar, 0);
                    }
                } else {
                    obj = null;
                }
                z3 = false;
                EljAMC1QTz = (((i14 & 234881024) ^ 100663296) <= 67108864 && qxVar.EljAMC1QTz(obj)) | xqGvceK5x | z3 | ((((i14 & 1879048192) ^ 805306368) <= 536870912 && qxVar.EljAMC1QTz(t4Var)) || (i14 & 805306368) == 536870912) | qxVar.EljAMC1QTz(nyVar) | qxVar.EljAMC1QTz(x51Var);
                Object HFYAaqMd642 = qxVar.HFYAaqMd6();
                if (EljAMC1QTz) {
                }
                u80Var3 = u80Var;
                z4 = true;
                o80Var = new o80(u80Var3, nn0Var, l80Var2, t4Var, phVar, nyVar, x51Var, p6Var);
                l80Var = l80Var2;
                qxVar.dcDmLGVhzWm(o80Var);
                o80 o80Var22 = (o80) o80Var;
                xm0 xm0Var2 = xm0.OOA6hdeuvCS;
                if (z) {
                }
                u80Var2 = u80Var3;
                z50.GWasM1elztuh(l80Var, n30.MItybXapHX(fb1.DmJncFq5(ie0Var.X1lG3V04pd(u80Var3.E7jCp8Ls).X1lG3V04pd(u80Var3.XnEVoBF0td1l), l80Var, b80Var, xm0Var2, z).X1lG3V04pd(ie0Var2).X1lG3V04pd(u80Var3.uFEq9NpZ.mOu10nynGul), u80Var3, xm0Var2, m0Var, z, fkVar, u80Var3.AvO7iQsrTN), u80Var2.WIEu4Ya2g8, o80Var22, qxVar, 0);
            }
            z2 = true;
            boolean xqGvceK5x3 = z7 | z2 | qxVar.xqGvceK5x(0) | ((((i14 & 3670016) ^ 1572864) <= 1048576 && qxVar.EljAMC1QTz(p6Var)) || (i14 & 1572864) == 1048576);
            if (((i14 & 29360128) ^ 12582912) <= 8388608) {
            }
            z3 = false;
            EljAMC1QTz = (((i14 & 234881024) ^ 100663296) <= 67108864 && qxVar.EljAMC1QTz(obj)) | xqGvceK5x3 | z3 | ((((i14 & 1879048192) ^ 805306368) <= 536870912 && qxVar.EljAMC1QTz(t4Var)) || (i14 & 805306368) == 536870912) | qxVar.EljAMC1QTz(nyVar) | qxVar.EljAMC1QTz(x51Var);
            Object HFYAaqMd6422 = qxVar.HFYAaqMd6();
            if (EljAMC1QTz) {
            }
            u80Var3 = u80Var;
            z4 = true;
            o80Var = new o80(u80Var3, nn0Var, l80Var2, t4Var, phVar, nyVar, x51Var, p6Var);
            l80Var = l80Var2;
            qxVar.dcDmLGVhzWm(o80Var);
            o80 o80Var222 = (o80) o80Var;
            xm0 xm0Var22 = xm0.OOA6hdeuvCS;
            if (z) {
            }
            u80Var2 = u80Var3;
            z50.GWasM1elztuh(l80Var, n30.MItybXapHX(fb1.DmJncFq5(ie0Var.X1lG3V04pd(u80Var3.E7jCp8Ls).X1lG3V04pd(u80Var3.XnEVoBF0td1l), l80Var, b80Var, xm0Var22, z).X1lG3V04pd(ie0Var2).X1lG3V04pd(u80Var3.uFEq9NpZ.mOu10nynGul), u80Var3, xm0Var22, m0Var, z, fkVar, u80Var3.AvO7iQsrTN), u80Var2.WIEu4Ya2g8, o80Var222, qxVar, 0);
        } else {
            u80Var2 = u80Var;
            qxVar.YXi2hvwn7WL();
        }
        at0 Mjvvu5DE = qxVar.Mjvvu5DE();
        if (Mjvvu5DE != null) {
            final u80 u80Var4 = u80Var2;
            Mjvvu5DE.xqGvceK5x = new lv() { // from class: m80
                @Override // defpackage.lv
                public final Object EljAMC1QTz(Object obj3, Object obj4) {
                    ((Integer) obj4).getClass();
                    l60.GWasM1elztuh(ie0.this, u80Var4, nn0Var, fkVar, z, m0Var, p6Var, t4Var, hvVar, (qx) obj3, n4.lv06NcmrQ(i | 1), n4.lv06NcmrQ(i2));
                    return kc1.GWasM1elztuh;
                }
            };
        }
    }

    public static StaticLayout JFJ3QoxA(CharSequence charSequence, TextPaint textPaint, int i, int i2, TextDirectionHeuristic textDirectionHeuristic, Layout.Alignment alignment, int i3, TextUtils.TruncateAt truncateAt, int i4, int i5, boolean z, int i6, int i7, int i8, int i9) {
        LineBreakConfig.Builder lineBreakStyle;
        LineBreakConfig.Builder lineBreakWordStyle;
        LineBreakConfig build;
        if (i2 < 0) {
            u10.GWasM1elztuh("invalid start value");
        }
        int length = charSequence.length();
        if (i2 < 0 || i2 > length) {
            u10.GWasM1elztuh("invalid end value");
        }
        if (i3 < 0) {
            u10.GWasM1elztuh("invalid maxLines value");
        }
        if (i < 0) {
            u10.GWasM1elztuh("invalid width value");
        }
        if (i4 < 0) {
            u10.GWasM1elztuh("invalid ellipsizedWidth value");
        }
        StaticLayout.Builder obtain = StaticLayout.Builder.obtain(charSequence, 0, i2, textPaint, i);
        obtain.setTextDirection(textDirectionHeuristic);
        obtain.setAlignment(alignment);
        obtain.setMaxLines(i3);
        obtain.setEllipsize(truncateAt);
        obtain.setEllipsizedWidth(i4);
        obtain.setLineSpacing(0.0f, 1.0f);
        obtain.setIncludePad(z);
        obtain.setBreakStrategy(i6);
        obtain.setHyphenationFrequency(i9);
        obtain.setIndents(null, null);
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 26) {
            obtain.setJustificationMode(i5);
        }
        if (i10 >= 28) {
            obtain.setUseLineSpacingFromFallbacks(true);
        }
        if (i10 >= 33) {
            lineBreakStyle = NyNgffpi.GWasM1elztuh().setLineBreakStyle(i7);
            lineBreakWordStyle = lineBreakStyle.setLineBreakWordStyle(i8);
            build = lineBreakWordStyle.build();
            obtain.setLineBreakConfig(build);
        }
        if (i10 >= 35) {
            obtain.setUseBoundsForWidth(false);
        }
        return obtain.build();
    }

    public static final boolean Mjvvu5DE(g60 g60Var) {
        if (g60Var.E7jCp8Ls == null) {
            return false;
        }
        g60 cilMamHF = g60Var.cilMamHF();
        return (cilMamHF != null ? cilMamHF.E7jCp8Ls : null) == null || g60Var.MZhzXH72.Yi7zF1RB1;
    }

    public static final void OOA6hdeuvCS(final boolean z, final lv lvVar, qx qxVar, final int i) {
        int i2;
        qxVar.Uxq83abb04(-642000585);
        if ((i & 6) == 0) {
            i2 = (qxVar.AvO7iQsrTN(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= qxVar.encWxUiV2(lvVar) ? 32 : 16;
        }
        if (qxVar.dqB83aoLBB(i2 & 1, (i2 & 19) != 18)) {
            Object obj = (wi0) qxVar.JFJ3QoxA(ab0.GWasM1elztuh);
            if (obj == null) {
                qxVar.MjxSquD6Av(950836184);
                View view = (View) qxVar.JFJ3QoxA(r.EljAMC1QTz);
                view.getClass();
                while (true) {
                    if (view == null) {
                        obj = null;
                        break;
                    }
                    Object tag = view.getTag(R.id.view_tree_navigation_event_dispatcher_owner);
                    Object obj2 = tag instanceof wi0 ? (wi0) tag : null;
                    if (obj2 != null) {
                        obj = obj2;
                        break;
                    } else {
                        Object mE4lRynR = d70.mE4lRynR(view);
                        view = mE4lRynR instanceof View ? (View) mE4lRynR : null;
                    }
                }
                qxVar.WIEu4Ya2g8(false);
            } else {
                qxVar.MjxSquD6Av(950834231);
                qxVar.WIEu4Ya2g8(false);
            }
            if (obj == null) {
                qxVar.MjxSquD6Av(1512740606);
                obj = (il0) qxVar.JFJ3QoxA(bb0.GWasM1elztuh);
                if (obj == null) {
                    qxVar.MjxSquD6Av(1208426157);
                    View view2 = (View) qxVar.JFJ3QoxA(r.EljAMC1QTz);
                    view2.getClass();
                    while (true) {
                        if (view2 == null) {
                            obj = null;
                            break;
                        }
                        Object tag2 = view2.getTag(R.id.view_tree_on_back_pressed_dispatcher_owner);
                        Object obj3 = tag2 instanceof il0 ? (il0) tag2 : null;
                        if (obj3 != null) {
                            obj = obj3;
                            break;
                        } else {
                            Object mE4lRynR2 = d70.mE4lRynR(view2);
                            view2 = mE4lRynR2 instanceof View ? (View) mE4lRynR2 : null;
                        }
                    }
                } else {
                    qxVar.MjxSquD6Av(1208423708);
                }
                qxVar.WIEu4Ya2g8(false);
                if (obj == null) {
                    qxVar.MjxSquD6Av(1208428160);
                    Object obj4 = (Context) qxVar.JFJ3QoxA(r.Yi7zF1RB1);
                    while (true) {
                        if (!(obj4 instanceof ContextWrapper)) {
                            obj4 = null;
                            break;
                        } else if (obj4 instanceof il0) {
                            break;
                        } else {
                            obj4 = ((ContextWrapper) obj4).getBaseContext();
                        }
                    }
                    obj = (il0) obj4;
                } else {
                    qxVar.MjxSquD6Av(1208423789);
                }
                qxVar.WIEu4Ya2g8(false);
            } else {
                qxVar.MjxSquD6Av(1512737723);
            }
            qxVar.WIEu4Ya2g8(false);
            if (obj == null) {
                o4.jivtDDk9H("No NavigationEventDispatcherOwner was provided via LocalNavigationEventDispatcherOwner and no OnBackPressedDispatcherOwner was provided via LocalOnBackPressedDispatcherOwner. Please provide one of the two.");
                return;
            }
            boolean EljAMC1QTz = qxVar.EljAMC1QTz(obj);
            Object HFYAaqMd6 = qxVar.HFYAaqMd6();
            Object obj5 = ue.GWasM1elztuh;
            if (EljAMC1QTz || HFYAaqMd6 == obj5) {
                wi0 wi0Var = obj instanceof wi0 ? (wi0) obj : null;
                rx0 GWasM1elztuh2 = wi0Var != null ? wi0Var.GWasM1elztuh() : null;
                il0 il0Var = obj instanceof il0 ? (il0) obj : null;
                HFYAaqMd6 = new z5(GWasM1elztuh2, il0Var != null ? il0Var.Yi7zF1RB1() : null);
                qxVar.dcDmLGVhzWm(HFYAaqMd6);
            }
            Object obj6 = (z5) HFYAaqMd6;
            Object HFYAaqMd62 = qxVar.HFYAaqMd6();
            if (HFYAaqMd62 == obj5) {
                HFYAaqMd62 = ki1.WdrkLMV3xh(qxVar);
                qxVar.dcDmLGVhzWm(HFYAaqMd62);
            }
            ph phVar = (ph) HFYAaqMd62;
            long j = qxVar.qugwajBSa59j;
            boolean EljAMC1QTz2 = qxVar.EljAMC1QTz(obj6) | qxVar.OOA6hdeuvCS(j);
            Object HFYAaqMd63 = qxVar.HFYAaqMd6();
            if (EljAMC1QTz2 || HFYAaqMd63 == obj5) {
                HFYAaqMd63 = new fe(phVar, new wq0(j, obj));
                qxVar.dcDmLGVhzWm(HFYAaqMd63);
            }
            final fe feVar = (fe) HFYAaqMd63;
            qxVar.MjxSquD6Av(-348514256);
            boolean encWxUiV2 = qxVar.encWxUiV2(feVar) | qxVar.encWxUiV2(lvVar);
            Object HFYAaqMd64 = qxVar.HFYAaqMd6();
            if (encWxUiV2 || HFYAaqMd64 == obj5) {
                HFYAaqMd64 = new h2(8, feVar, lvVar);
                qxVar.dcDmLGVhzWm(HFYAaqMd64);
            }
            ki1.rQPn8YBR((wu) HFYAaqMd64, qxVar);
            int i3 = i2;
            Boolean valueOf = Boolean.valueOf(z);
            int i4 = i3 & 14;
            boolean encWxUiV22 = qxVar.encWxUiV2(feVar) | (i4 == 4);
            Object HFYAaqMd65 = qxVar.HFYAaqMd6();
            if (encWxUiV22 || HFYAaqMd65 == obj5) {
                HFYAaqMd65 = new hv() { // from class: xq0
                    @Override // defpackage.hv
                    public final Object mOu10nynGul(Object obj7) {
                        fe feVar2 = fe.this;
                        feVar2.OOA6hdeuvCS(z);
                        return new zq0((ba0) obj7, feVar2);
                    }
                };
                qxVar.dcDmLGVhzWm(HFYAaqMd65);
            }
            d70.X1lG3V04pd(valueOf, feVar, null, (hv) HFYAaqMd65, qxVar, i4);
            boolean encWxUiV23 = qxVar.encWxUiV2(obj6) | qxVar.encWxUiV2(feVar);
            Object HFYAaqMd66 = qxVar.HFYAaqMd6();
            if (encWxUiV23 || HFYAaqMd66 == obj5) {
                HFYAaqMd66 = new X1lG3V04pd(20, obj6, feVar);
                qxVar.dcDmLGVhzWm(HFYAaqMd66);
            }
            ki1.AvO7iQsrTN(obj6, feVar, (hv) HFYAaqMd66, qxVar);
            qxVar.WIEu4Ya2g8(false);
        } else {
            qxVar.YXi2hvwn7WL();
        }
        at0 Mjvvu5DE = qxVar.Mjvvu5DE();
        if (Mjvvu5DE != null) {
            Mjvvu5DE.xqGvceK5x = new lv() { // from class: yq0
                @Override // defpackage.lv
                public final Object EljAMC1QTz(Object obj7, Object obj8) {
                    ((Integer) obj8).getClass();
                    int lv06NcmrQ = n4.lv06NcmrQ(i | 1);
                    l60.OOA6hdeuvCS(z, lvVar, (qx) obj7, lv06NcmrQ);
                    return kc1.GWasM1elztuh;
                }
            };
        }
    }

    public static final void WIEu4Ya2g8(b01 b01Var) {
        vc0.eUH21U3apd(b01Var).AEn1Rrio();
    }

    public static final void WRKkgoJXwDn(lv lvVar, qx qxVar, Object obj) {
        if (qxVar.CMh55RymNfS || !o30.rQPn8YBR(qxVar.HFYAaqMd6(), obj)) {
            qxVar.dcDmLGVhzWm(obj);
            qxVar.Yi7zF1RB1(lvVar, obj);
        }
    }

    public static final void WdrkLMV3xh(qx qxVar, hv hvVar) {
        qxVar.Yi7zF1RB1(new k4(15, hvVar), kc1.GWasM1elztuh);
    }

    public static final void X1lG3V04pd(hi0 hi0Var, ie0 ie0Var, r6 r6Var, hv hvVar, hv hvVar2, hv hvVar3, hv hvVar4, hv hvVar5, qx qxVar, int i) {
        int i2;
        hv hvVar6;
        hv hvVar7;
        hv hvVar8;
        hv hvVar9;
        r6 r6Var2;
        ie0 ie0Var2;
        r6 r6Var3;
        qxVar.Uxq83abb04(1840250294);
        if ((i & 6) == 0) {
            i2 = i | (qxVar.encWxUiV2(hi0Var) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= qxVar.EljAMC1QTz("menu") ? 32 : 16;
        }
        int i3 = i2 | 28032;
        if ((i & 196608) == 0) {
            hvVar6 = hvVar;
            i3 |= qxVar.encWxUiV2(hvVar6) ? 131072 : 65536;
        } else {
            hvVar6 = hvVar;
        }
        if ((i & 1572864) == 0) {
            hvVar7 = hvVar2;
            i3 |= qxVar.encWxUiV2(hvVar7) ? 1048576 : 524288;
        } else {
            hvVar7 = hvVar2;
        }
        if ((i & 12582912) == 0) {
            hvVar8 = hvVar3;
            i3 |= qxVar.encWxUiV2(hvVar8) ? 8388608 : 4194304;
        } else {
            hvVar8 = hvVar3;
        }
        if ((i & 100663296) == 0) {
            hvVar9 = hvVar4;
            i3 |= qxVar.encWxUiV2(hvVar9) ? 67108864 : 33554432;
        } else {
            hvVar9 = hvVar4;
        }
        int i4 = i3 | 805306368;
        char c = qxVar.encWxUiV2(hvVar5) ? (char) 4 : (char) 2;
        if ((306783379 & i4) == 306783378 && (c & 3) == 2 && qxVar.pog2g9KITJA()) {
            qxVar.YXi2hvwn7WL();
            ie0Var2 = ie0Var;
            r6Var3 = r6Var;
        } else {
            qxVar.qugwajBSa59j();
            if ((i & 1) == 0 || qxVar.WRKkgoJXwDn()) {
                r6Var2 = b9xEq24R1.EljAMC1QTz;
                ie0Var2 = fe0.GWasM1elztuh;
            } else {
                qxVar.YXi2hvwn7WL();
                ie0Var2 = ie0Var;
                r6Var2 = r6Var;
            }
            qxVar.YmKjaVtbfp5Z();
            boolean z = ((i4 & 112) == 32) | ((i4 & 57344) == 16384) | ((c & 14) == 4);
            Object HFYAaqMd6 = qxVar.HFYAaqMd6();
            if (z || HFYAaqMd6 == ue.GWasM1elztuh) {
                ci0 ci0Var = new ci0(hi0Var.Yi7zF1RB1.mE4lRynR);
                hvVar5.mOu10nynGul(ci0Var);
                HFYAaqMd6 = ci0Var.X1lG3V04pd();
                qxVar.dcDmLGVhzWm(HFYAaqMd6);
            }
            int i5 = i4 & 8078;
            int i6 = i4 >> 3;
            int i7 = (i6 & 234881024) | i5 | (i6 & 57344) | (458752 & i6) | (3670016 & i6) | (29360128 & i6);
            r6Var3 = r6Var2;
            xqGvceK5x(hi0Var, (bi0) HFYAaqMd6, ie0Var2, r6Var3, hvVar6, hvVar7, hvVar8, hvVar9, qxVar, i7);
        }
        at0 Mjvvu5DE = qxVar.Mjvvu5DE();
        if (Mjvvu5DE != null) {
            Mjvvu5DE.xqGvceK5x = new ji0(hi0Var, ie0Var2, r6Var3, hvVar, hvVar2, hvVar3, hvVar4, hvVar5, i);
        }
    }

    public static final int XnEVoBF0td1l(int i, List list) {
        int i2;
        int i3 = ((un0) rb.vaTCmWUgXF(list)).X1lG3V04pd;
        if (i > ((un0) rb.vaTCmWUgXF(list)).X1lG3V04pd) {
            u10.GWasM1elztuh("Index " + i + " should be less or equal than last line's end " + i3);
        }
        int size = list.size() - 1;
        int i4 = 0;
        while (true) {
            if (i4 > size) {
                i2 = -(i4 + 1);
                break;
            }
            i2 = (i4 + size) >>> 1;
            un0 un0Var = (un0) list.get(i2);
            char c = un0Var.Yi7zF1RB1 > i ? (char) 1 : un0Var.X1lG3V04pd <= i ? (char) 65535 : (char) 0;
            if (c >= 0) {
                if (c <= 0) {
                    break;
                }
                size = i2 - 1;
            } else {
                i4 = i2 + 1;
            }
        }
        if (i2 >= 0 && i2 < list.size()) {
            return i2;
        }
        StringBuilder rQPn8YBR = mr0.rQPn8YBR("Found paragraph index ", i2, " should be in range [0, ");
        rQPn8YBR.append(list.size());
        rQPn8YBR.append(").\nDebug info: index=");
        rQPn8YBR.append(i);
        rQPn8YBR.append(", paragraphs=[");
        rQPn8YBR.append(xa0.GWasM1elztuh(list, null, new bCsSzSHkbaQ(23), 31));
        rQPn8YBR.append(']');
        u10.GWasM1elztuh(rQPn8YBR.toString());
        return i2;
    }

    public static final void Yi7zF1RB1(ie0 ie0Var, qx qxVar, int i) {
        qx qxVar2;
        qxVar.Uxq83abb04(719121556);
        int i2 = 1;
        if (qxVar.dqB83aoLBB(i & 1, (i & 3) != 2)) {
            m10 MZhzXH72 = ki1.MZhzXH72("emblem", qxVar);
            o4 o4Var = po.Yi7zF1RB1;
            qxVar2 = qxVar;
            k10 Mjvvu5DE = ki1.Mjvvu5DE(MZhzXH72, 0.0f, 360.0f, new j10(fb1.JFXS9W1rB5s4(14000, 2, o4Var), iu0.OOA6hdeuvCS), "sweep", qxVar2);
            k10 Mjvvu5DE2 = ki1.Mjvvu5DE(MZhzXH72, 0.55f, 1.0f, new j10(fb1.JFXS9W1rB5s4(1800, 2, o4Var), iu0.EljAMC1QTz), "pulse", qxVar2);
            boolean EljAMC1QTz = qxVar2.EljAMC1QTz(Mjvvu5DE2) | qxVar2.EljAMC1QTz(Mjvvu5DE);
            Object HFYAaqMd6 = qxVar2.HFYAaqMd6();
            if (EljAMC1QTz || HFYAaqMd6 == ue.GWasM1elztuh) {
                HFYAaqMd6 = new X1lG3V04pd(13, Mjvvu5DE2, Mjvvu5DE);
                qxVar2.dcDmLGVhzWm(HFYAaqMd6);
            }
            o30.Yi7zF1RB1(ie0Var, (hv) HFYAaqMd6, qxVar2, 6);
        } else {
            qxVar2 = qxVar;
            qxVar2.YXi2hvwn7WL();
        }
        at0 Mjvvu5DE3 = qxVar2.Mjvvu5DE();
        if (Mjvvu5DE3 != null) {
            Mjvvu5DE3.xqGvceK5x = new m7(ie0Var, i, i2);
        }
    }

    public static boolean YmKjaVtbfp5Z() {
        if (Build.VERSION.SDK_INT >= 29) {
            return z91.GWasM1elztuh();
        }
        try {
            if (X1lG3V04pd == null) {
                Yi7zF1RB1 = Trace.class.getField("TRACE_TAG_APP").getLong(null);
                X1lG3V04pd = Trace.class.getMethod("isTagEnabled", Long.TYPE);
            }
            return ((Boolean) X1lG3V04pd.invoke(null, Long.valueOf(Yi7zF1RB1))).booleanValue();
        } catch (Exception e) {
            if (!(e instanceof InvocationTargetException)) {
                Log.v("Trace", "Unable to call isTagEnabled via reflection", e);
                return false;
            }
            Throwable cause = e.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            throw new RuntimeException(cause);
        }
    }

    public static void arNh8D4Z5gB(Window window, boolean z) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 35) {
            dcDmLGVhzWm.OOA6hdeuvCS(window, z);
        } else {
            if (i >= 30) {
                dcDmLGVhzWm.xqGvceK5x(window, z);
                return;
            }
            View decorView = window.getDecorView();
            int systemUiVisibility = decorView.getSystemUiVisibility();
            decorView.setSystemUiVisibility(z ? systemUiVisibility & (-1793) : systemUiVisibility | 1792);
        }
    }

    public static final void cilMamHF(float[] fArr, float[] fArr2, int i, float[] fArr3) {
        if (i == 0) {
            t10.GWasM1elztuh("At least one point must be provided");
        }
        int i2 = 2 >= i ? i - 1 : 2;
        int i3 = i2 + 1;
        float[][] fArr4 = new float[i3][];
        for (int i4 = 0; i4 < i3; i4++) {
            fArr4[i4] = new float[i];
        }
        for (int i5 = 0; i5 < i; i5++) {
            fArr4[0][i5] = 1.0f;
            for (int i6 = 1; i6 < i3; i6++) {
                fArr4[i6][i5] = fArr4[i6 - 1][i5] * fArr[i5];
            }
        }
        float[][] fArr5 = new float[i3][];
        for (int i7 = 0; i7 < i3; i7++) {
            fArr5[i7] = new float[i];
        }
        float[][] fArr6 = new float[i3][];
        for (int i8 = 0; i8 < i3; i8++) {
            fArr6[i8] = new float[i3];
        }
        int i9 = 0;
        while (i9 < i3) {
            float[] fArr7 = fArr5[i9];
            float[] fArr8 = fArr4[i9];
            fArr8.getClass();
            fArr7.getClass();
            System.arraycopy(fArr8, 0, fArr7, 0, i);
            for (int i10 = 0; i10 < i9; i10++) {
                float[] fArr9 = fArr5[i10];
                float rQPn8YBR = rQPn8YBR(fArr7, fArr9);
                for (int i11 = 0; i11 < i; i11++) {
                    fArr7[i11] = fArr7[i11] - (fArr9[i11] * rQPn8YBR);
                }
            }
            float sqrt = (float) Math.sqrt(rQPn8YBR(fArr7, fArr7));
            if (sqrt < 1.0E-6f) {
                sqrt = 1.0E-6f;
            }
            float f = 1.0f / sqrt;
            for (int i12 = 0; i12 < i; i12++) {
                fArr7[i12] = fArr7[i12] * f;
            }
            float[] fArr10 = fArr6[i9];
            int i13 = 0;
            while (i13 < i3) {
                fArr10[i13] = i13 < i9 ? 0.0f : rQPn8YBR(fArr7, fArr4[i13]);
                i13++;
            }
            i9++;
        }
        for (int i14 = i2; -1 < i14; i14--) {
            float rQPn8YBR2 = rQPn8YBR(fArr5[i14], fArr2);
            float[] fArr11 = fArr6[i14];
            int i15 = i14 + 1;
            if (i15 <= i2) {
                int i16 = i2;
                while (true) {
                    rQPn8YBR2 -= fArr11[i16] * fArr3[i16];
                    if (i16 != i15) {
                        i16--;
                    }
                }
            }
            fArr3[i14] = rQPn8YBR2 / fArr11[i14];
        }
    }

    public static void encWxUiV2(String str) {
        if (str.length() > 127) {
            str = str.substring(0, 127);
        }
        Trace.beginSection(str);
    }

    public static final Rect iwATDS1i01k(TextPaint textPaint, CharSequence charSequence, int i, int i2) {
        int i3 = i;
        if (charSequence instanceof Spanned) {
            Spanned spanned = (Spanned) charSequence;
            if (spanned.nextSpanTransition(i3 - 1, i2, MetricAffectingSpan.class) != i2) {
                Rect rect = new Rect();
                Rect rect2 = new Rect();
                TextPaint textPaint2 = new TextPaint();
                while (i3 < i2) {
                    int nextSpanTransition = spanned.nextSpanTransition(i3, i2, MetricAffectingSpan.class);
                    MetricAffectingSpan[] metricAffectingSpanArr = (MetricAffectingSpan[]) spanned.getSpans(i3, nextSpanTransition, MetricAffectingSpan.class);
                    textPaint2.set(textPaint);
                    for (MetricAffectingSpan metricAffectingSpan : metricAffectingSpanArr) {
                        if (spanned.getSpanStart(metricAffectingSpan) != spanned.getSpanEnd(metricAffectingSpan)) {
                            metricAffectingSpan.updateMeasureState(textPaint2);
                        }
                    }
                    if (Build.VERSION.SDK_INT >= 29) {
                        textPaint2.getTextBounds(charSequence, i3, nextSpanTransition, rect2);
                    } else {
                        textPaint2.getTextBounds(charSequence.toString(), i3, nextSpanTransition, rect2);
                    }
                    rect.right = rect2.width() + rect.right;
                    rect.top = Math.min(rect.top, rect2.top);
                    rect.bottom = Math.max(rect.bottom, rect2.bottom);
                    i3 = nextSpanTransition;
                }
                return rect;
            }
        }
        Rect rect3 = new Rect();
        if (Build.VERSION.SDK_INT >= 29) {
            textPaint.getTextBounds(charSequence, i3, i2, rect3);
            return rect3;
        }
        textPaint.getTextBounds(charSequence.toString(), i3, i2, rect3);
        return rect3;
    }

    public static final void jivtDDk9H(hi0 hi0Var, String str, hv hvVar) {
        w90 w90Var;
        m90 m90Var;
        hi0Var.getClass();
        ph0 ph0Var = hi0Var.Yi7zF1RB1;
        fh0 AvO7iQsrTN = ph0Var.AvO7iQsrTN();
        if (AvO7iQsrTN == null || (w90Var = AvO7iQsrTN.E7jCp8Ls.JFJ3QoxA) == null || (m90Var = w90Var.encWxUiV2) == null || m90Var.compareTo(m90.mOu10nynGul) < 0) {
            return;
        }
        si0 Y6hRI1cF8 = w60.Y6hRI1cF8(hvVar);
        if (ph0Var.X1lG3V04pd == null) {
            throw new IllegalArgumentException(("Cannot navigate to " + str + ". Navigation graph has not been set for NavController " + ph0Var + '.').toString());
        }
        bi0 JFJ3QoxA = ph0Var.JFJ3QoxA();
        wh0 EljAMC1QTz = JFJ3QoxA.EljAMC1QTz(str, true, JFJ3QoxA);
        if (EljAMC1QTz == null) {
            throw new IllegalArgumentException("Navigation destination that matches route " + str + " cannot be found in the navigation graph " + ph0Var.X1lG3V04pd);
        }
        xh0 xh0Var = EljAMC1QTz.OOA6hdeuvCS;
        Bundle GWasM1elztuh2 = xh0Var.GWasM1elztuh(EljAMC1QTz.EljAMC1QTz);
        if (GWasM1elztuh2 == null) {
            GWasM1elztuh2 = ki1.jivtDDk9H((rn0[]) Arrays.copyOf(new rn0[0], 0));
        }
        int i = xh0.mOu10nynGul;
        String str2 = (String) xh0Var.EljAMC1QTz.OOA6hdeuvCS;
        Uri parse = Uri.parse(str2 != null ? "android-app://androidx.navigation/".concat(str2) : "");
        parse.getClass();
        Intent intent = new Intent();
        intent.setDataAndType(parse, null);
        intent.setAction(null);
        GWasM1elztuh2.putParcelable("android-support-nav:controller:deepLinkIntent", intent);
        ph0Var.E7jCp8Ls(xh0Var, GWasM1elztuh2, Y6hRI1cF8);
    }

    public static final void lv06NcmrQ(hi0 hi0Var) {
        w90 w90Var;
        m90 m90Var;
        hi0Var.getClass();
        fh0 AvO7iQsrTN = hi0Var.Yi7zF1RB1.AvO7iQsrTN();
        if (AvO7iQsrTN == null || (w90Var = AvO7iQsrTN.E7jCp8Ls.JFJ3QoxA) == null || (m90Var = w90Var.encWxUiV2) == null || m90Var.compareTo(m90.mOu10nynGul) < 0) {
            return;
        }
        hi0Var.GWasM1elztuh();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static List mE4lRynR(c31 c31Var, int i, c31 c31Var2, boolean z, boolean z2, boolean z3) {
        xp xpVar;
        boolean z4;
        int i2;
        int i3;
        int Y6hRI1cF8 = c31Var.Y6hRI1cF8(i);
        int i4 = i + Y6hRI1cF8;
        int EljAMC1QTz = c31Var.EljAMC1QTz(i);
        int EljAMC1QTz2 = c31Var.EljAMC1QTz(i4);
        int i5 = EljAMC1QTz2 - EljAMC1QTz;
        boolean z5 = i >= 0 && (c31Var.Yi7zF1RB1[(c31Var.Mjvvu5DE(i) * 5) + 1] & 201326592) != 0;
        c31Var2.lv06NcmrQ(Y6hRI1cF8);
        c31Var2.WdrkLMV3xh(i5, c31Var2.jivtDDk9H);
        if (c31Var.AvO7iQsrTN < i4) {
            c31Var.M3K9sHhK(i4);
        }
        if (c31Var.rQPn8YBR < EljAMC1QTz2) {
            c31Var.k8h8IjolWQ(EljAMC1QTz2, i4);
        }
        int[] iArr = c31Var2.Yi7zF1RB1;
        int i6 = c31Var2.jivtDDk9H;
        int i7 = i6 * 5;
        d5.MjxSquD6Av(c31Var.Yi7zF1RB1, iArr, i7, i * 5, i4 * 5);
        Object[] objArr = c31Var2.X1lG3V04pd;
        int i8 = c31Var2.mOu10nynGul;
        System.arraycopy(c31Var.X1lG3V04pd, EljAMC1QTz, objArr, i8, i5);
        int i9 = c31Var2.cilMamHF;
        iArr[i7 + 2] = i9;
        int i10 = i6 - i;
        int i11 = i6 + Y6hRI1cF8;
        int AvO7iQsrTN = i8 - c31Var2.AvO7iQsrTN(iArr, i6);
        int i12 = c31Var2.XnEVoBF0td1l;
        int i13 = c31Var2.E7jCp8Ls;
        int length = objArr.length;
        boolean z6 = z5;
        int i14 = i12;
        int i15 = i6;
        while (i15 < i11) {
            if (i15 != i6) {
                int i16 = (i15 * 5) + 2;
                iArr[i16] = iArr[i16] + i10;
            }
            int[] iArr2 = iArr;
            int AvO7iQsrTN2 = c31Var2.AvO7iQsrTN(iArr, i15) + AvO7iQsrTN;
            if (i14 < i15) {
                i2 = i6;
                i3 = 0;
            } else {
                i2 = i6;
                i3 = c31Var2.rQPn8YBR;
            }
            iArr2[(i15 * 5) + 4] = c31.mOu10nynGul(AvO7iQsrTN2, i3, i13, length);
            if (i15 == i14) {
                i14++;
            }
            i15++;
            i6 = i2;
            iArr = iArr2;
        }
        int[] iArr3 = iArr;
        c31Var2.XnEVoBF0td1l = i14;
        int GWasM1elztuh2 = b31.GWasM1elztuh(c31Var.xqGvceK5x, i, c31Var.WIEu4Ya2g8());
        int GWasM1elztuh3 = b31.GWasM1elztuh(c31Var.xqGvceK5x, i4, c31Var.WIEu4Ya2g8());
        if (GWasM1elztuh2 < GWasM1elztuh3) {
            ArrayList arrayList = c31Var.xqGvceK5x;
            ArrayList arrayList2 = new ArrayList(GWasM1elztuh3 - GWasM1elztuh2);
            for (int i17 = GWasM1elztuh2; i17 < GWasM1elztuh3; i17++) {
                lx lxVar = (lx) arrayList.get(i17);
                lxVar.GWasM1elztuh += i10;
                arrayList2.add(lxVar);
            }
            c31Var2.xqGvceK5x.addAll(b31.GWasM1elztuh(c31Var2.xqGvceK5x, c31Var2.jivtDDk9H, c31Var2.WIEu4Ya2g8()), arrayList2);
            arrayList.subList(GWasM1elztuh2, GWasM1elztuh3).clear();
            xpVar = arrayList2;
        } else {
            xpVar = xp.OOA6hdeuvCS;
        }
        if (!xpVar.isEmpty()) {
            HashMap hashMap = c31Var.OOA6hdeuvCS;
            HashMap hashMap2 = c31Var2.OOA6hdeuvCS;
            if (hashMap != null && hashMap2 != null) {
                int size = xpVar.size();
                for (int i18 = 0; i18 < size; i18++) {
                }
            }
        }
        int i19 = c31Var2.cilMamHF;
        c31Var2.dqB83aoLBB(i9);
        int ozMwhSAI = c31Var.ozMwhSAI(c31Var.Yi7zF1RB1, i);
        if (!z3) {
            z4 = false;
        } else if (z) {
            boolean z7 = ozMwhSAI >= 0;
            if (z7) {
                c31Var.VeqTn1PQw7();
                c31Var.GWasM1elztuh(ozMwhSAI - c31Var.jivtDDk9H);
                c31Var.VeqTn1PQw7();
            }
            c31Var.GWasM1elztuh(i - c31Var.jivtDDk9H);
            boolean eUH21U3apd = c31Var.eUH21U3apd();
            if (z7) {
                c31Var.rezfBrjOrqK();
                c31Var.JFJ3QoxA();
                c31Var.rezfBrjOrqK();
                c31Var.JFJ3QoxA();
            }
            z4 = eUH21U3apd;
        } else {
            boolean A1EKNP6CxJ = c31Var.A1EKNP6CxJ(i, Y6hRI1cF8);
            c31Var.MZhzXH72(EljAMC1QTz, i5, i - 1);
            z4 = A1EKNP6CxJ;
        }
        if (z4) {
            we.GWasM1elztuh("Unexpectedly removed anchors");
        }
        int i20 = c31Var2.iwATDS1i01k;
        int i21 = iArr3[i7 + 1];
        c31Var2.iwATDS1i01k = i20 + ((1073741824 & i21) != 0 ? 1 : i21 & 67108863);
        if (z2) {
            c31Var2.jivtDDk9H = i11;
            c31Var2.mOu10nynGul = i8 + i5;
        }
        if (z6) {
            c31Var2.qugwajBSa59j(i9);
        }
        return xpVar;
    }

    public static final int mOu10nynGul(float f) {
        return Math.round((float) Math.ceil(f));
    }

    public static final Rect pog2g9KITJA(y20 y20Var) {
        return new Rect(y20Var.GWasM1elztuh, y20Var.Yi7zF1RB1, y20Var.X1lG3V04pd, y20Var.xqGvceK5x);
    }

    public static final float rQPn8YBR(float[] fArr, float[] fArr2) {
        int length = fArr.length;
        float f = 0.0f;
        for (int i = 0; i < length; i++) {
            f += fArr[i] * fArr2[i];
        }
        return f;
    }

    public static final int uFEq9NpZ(int i, List list) {
        int size = list.size() - 1;
        int i2 = 0;
        while (i2 <= size) {
            int i3 = (i2 + size) >>> 1;
            un0 un0Var = (un0) list.get(i3);
            char c = un0Var.xqGvceK5x > i ? (char) 1 : un0Var.OOA6hdeuvCS <= i ? (char) 65535 : (char) 0;
            if (c < 0) {
                i2 = i3 + 1;
            } else {
                if (c <= 0) {
                    return i3;
                }
                size = i3 - 1;
            }
        }
        return -(i2 + 1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:225:0x04b1  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x0508  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x0523  */
    /* JADX WARN: Removed duplicated region for block: B:495:0x0505 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r11v10 */
    /* JADX WARN: Type inference failed for: r11v11 */
    /* JADX WARN: Type inference failed for: r11v13, types: [vg] */
    /* JADX WARN: Type inference failed for: r11v14 */
    /* JADX WARN: Type inference failed for: r11v15 */
    /* JADX WARN: Type inference failed for: r11v20, types: [bi0, xh0] */
    /* JADX WARN: Type inference failed for: r12v3, types: [qx] */
    /* JADX WARN: Type inference failed for: r14v17, types: [java.lang.Object, qa1] */
    /* JADX WARN: Type inference failed for: r23v2, types: [vg] */
    /* JADX WARN: Type inference failed for: r23v4, types: [vg] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void xqGvceK5x(hi0 hi0Var, bi0 bi0Var, ie0 ie0Var, r6 r6Var, final hv hvVar, final hv hvVar2, final hv hvVar3, final hv hvVar4, qx qxVar, int i) {
        fj0 fj0Var;
        int i2;
        t90 t90Var;
        mg0 mg0Var;
        final mg0 mg0Var2;
        fj0 fj0Var2;
        am amVar;
        fj0 fj0Var3;
        final zd zdVar;
        boolean z;
        boolean z2;
        yf0 yf0Var;
        mg0 mg0Var3;
        m51 m51Var;
        ?? r11;
        vz0 vz0Var;
        qa1 qa1Var;
        fh0 fh0Var;
        am amVar2;
        Object obj;
        zd zdVar2;
        mg0 mg0Var4;
        yf0 yf0Var2;
        am amVar3;
        int[] iArr;
        int[] iArr2;
        int[] iArr3;
        ArrayList arrayList;
        int length;
        int i3;
        String str;
        xh0 GWasM1elztuh2;
        bi0 bi0Var2;
        int i4;
        Bundle bundle;
        xh0 GWasM1elztuh3;
        bi0 bi0Var3;
        qx qxVar2;
        qxVar.Uxq83abb04(-1964664536);
        int i5 = (i & 6) == 0 ? (qxVar.encWxUiV2(hi0Var) ? 4 : 2) | i : i;
        if ((i & 48) == 0) {
            i5 |= qxVar.encWxUiV2(bi0Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i5 |= qxVar.EljAMC1QTz(ie0Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i5 |= qxVar.EljAMC1QTz(r6Var) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i5 |= qxVar.encWxUiV2(hvVar) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i5 |= qxVar.encWxUiV2(hvVar2) ? 131072 : 65536;
        }
        if ((i & 1572864) == 0) {
            i5 |= qxVar.encWxUiV2(hvVar3) ? 1048576 : 524288;
        }
        if ((i & 12582912) == 0) {
            i5 |= qxVar.encWxUiV2(hvVar4) ? 8388608 : 4194304;
        }
        if ((i & 100663296) == 0) {
            i5 |= qxVar.encWxUiV2(null) ? 67108864 : 33554432;
        }
        int i6 = i5;
        if ((38347923 & i6) == 38347922 && qxVar.pog2g9KITJA()) {
            qxVar.YXi2hvwn7WL();
            qxVar2 = qxVar;
        } else {
            qxVar.qugwajBSa59j();
            if ((i & 1) != 0 && !qxVar.WRKkgoJXwDn()) {
                qxVar.YXi2hvwn7WL();
            }
            qxVar.YmKjaVtbfp5Z();
            t90 t90Var2 = (t90) qxVar.JFJ3QoxA(za0.GWasM1elztuh);
            ff1 GWasM1elztuh4 = eb0.GWasM1elztuh(qxVar);
            if (GWasM1elztuh4 == null) {
                o4.jivtDDk9H("NavHost requires a ViewModelStoreOwner to be provided via LocalViewModelStoreOwner");
                return;
            }
            ef1 OOA6hdeuvCS = GWasM1elztuh4.OOA6hdeuvCS();
            hi0Var.getClass();
            ph0 ph0Var = hi0Var.Yi7zF1RB1;
            ph0Var.getClass();
            fj0 fj0Var4 = ph0Var.mE4lRynR;
            if (!o30.rQPn8YBR(ph0Var.iwATDS1i01k, q70.Mjvvu5DE(OOA6hdeuvCS))) {
                if (!ph0Var.EljAMC1QTz.isEmpty()) {
                    o4.jivtDDk9H("ViewModelStore should be set before setGraph call");
                    return;
                }
                ph0Var.iwATDS1i01k = q70.Mjvvu5DE(OOA6hdeuvCS);
            }
            bi0Var.getClass();
            ph0Var.getClass();
            LinkedHashMap linkedHashMap = ph0Var.jivtDDk9H;
            ei0 ei0Var = bi0Var.JFJ3QoxA;
            v4 v4Var = ph0Var.EljAMC1QTz;
            if (!v4Var.isEmpty() && ph0Var.mOu10nynGul() == m90.OOA6hdeuvCS) {
                o4.jivtDDk9H("You cannot set a new graph on a NavController with entries on the back stack after the NavController has been destroyed. Please ensure that your NavHost has the same lifetime as your NavController.");
                return;
            }
            boolean z3 = false;
            if (o30.rQPn8YBR(ph0Var.X1lG3V04pd, bi0Var)) {
                fj0Var = fj0Var4;
                i2 = i6;
                t90Var = t90Var2;
                int OOA6hdeuvCS2 = ei0Var.Yi7zF1RB1.OOA6hdeuvCS();
                for (int i7 = 0; i7 < OOA6hdeuvCS2; i7++) {
                    xh0 xh0Var = (xh0) ei0Var.Yi7zF1RB1.EljAMC1QTz(i7);
                    bi0 bi0Var4 = ph0Var.X1lG3V04pd;
                    bi0Var4.getClass();
                    int X1lG3V04pd2 = bi0Var4.JFJ3QoxA.Yi7zF1RB1.X1lG3V04pd(i7);
                    bi0 bi0Var5 = ph0Var.X1lG3V04pd;
                    bi0Var5.getClass();
                    y41 y41Var = bi0Var5.JFJ3QoxA.Yi7zF1RB1;
                    if (y41Var.OOA6hdeuvCS) {
                        o30.encWxUiV2(y41Var);
                    }
                    int uFEq9NpZ = fb1.uFEq9NpZ(y41Var.EljAMC1QTz, y41Var.encWxUiV2, X1lG3V04pd2);
                    if (uFEq9NpZ >= 0) {
                        Object[] objArr = y41Var.AvO7iQsrTN;
                        Object obj2 = objArr[uFEq9NpZ];
                        objArr[uFEq9NpZ] = xh0Var;
                    }
                }
                Iterator it = v4Var.iterator();
                while (it.hasNext()) {
                    fh0 fh0Var2 = (fh0) it.next();
                    int i8 = xh0.mOu10nynGul;
                    bv0 bv0Var = new bv0(x01.ozMwhSAI(o50.Mjvvu5DE(fh0Var2.EljAMC1QTz)));
                    xh0 xh0Var2 = ph0Var.X1lG3V04pd;
                    xh0Var2.getClass();
                    Iterator it2 = bv0Var.iterator();
                    while (true) {
                        ListIterator listIterator = (ListIterator) ((zu0) it2).EljAMC1QTz;
                        if (listIterator.hasPrevious()) {
                            xh0 xh0Var3 = (xh0) listIterator.previous();
                            if (o30.rQPn8YBR(xh0Var3, ph0Var.X1lG3V04pd) && xh0Var2.equals(bi0Var)) {
                            }
                            if (xh0Var2 instanceof bi0) {
                                xh0Var2 = ((bi0) xh0Var2).JFJ3QoxA.GWasM1elztuh(xh0Var3.EljAMC1QTz.GWasM1elztuh);
                                xh0Var2.getClass();
                            }
                        }
                    }
                    fh0Var2.EljAMC1QTz = xh0Var2;
                }
            } else {
                bi0 bi0Var6 = ph0Var.X1lG3V04pd;
                if (bi0Var6 != null) {
                    ArrayList arrayList2 = new ArrayList(ph0Var.E7jCp8Ls.keySet());
                    int size = arrayList2.size();
                    int i9 = 0;
                    while (i9 < size) {
                        Object obj3 = arrayList2.get(i9);
                        int i10 = i9 + 1;
                        Integer num = (Integer) obj3;
                        num.getClass();
                        ArrayList arrayList3 = arrayList2;
                        int intValue = num.intValue();
                        Iterator it3 = linkedHashMap.values().iterator();
                        while (it3.hasNext()) {
                            ((kh0) it3.next()).xqGvceK5x = true;
                            size = size;
                            i10 = i10;
                        }
                        int i11 = size;
                        int i12 = i10;
                        boolean YmKjaVtbfp5Z = ph0Var.YmKjaVtbfp5Z(intValue, null, new si0(z3, true, -1, z3, z3, -1, -1));
                        for (Iterator it4 = linkedHashMap.values().iterator(); it4.hasNext(); it4 = it4) {
                            ((kh0) it4.next()).xqGvceK5x = false;
                            YmKjaVtbfp5Z = YmKjaVtbfp5Z;
                        }
                        if (YmKjaVtbfp5Z) {
                            ph0Var.XnEVoBF0td1l(intValue, true, false);
                        }
                        arrayList2 = arrayList3;
                        size = i11;
                        i9 = i12;
                        z3 = false;
                    }
                    ph0Var.XnEVoBF0td1l(bi0Var6.EljAMC1QTz.GWasM1elztuh, true, false);
                }
                ph0Var.X1lG3V04pd = bi0Var;
                fj0 fj0Var5 = ph0Var.mE4lRynR;
                hi0 hi0Var2 = ph0Var.GWasM1elztuh;
                kp kpVar = hi0Var2.X1lG3V04pd;
                Bundle bundle2 = ph0Var.xqGvceK5x;
                if (bundle2 != null && bundle2.containsKey("android-support-nav:controller:navigatorState:names")) {
                    ArrayList<String> stringArrayList = bundle2.getStringArrayList("android-support-nav:controller:navigatorState:names");
                    if (stringArrayList == null) {
                        z50.cilMamHF("android-support-nav:controller:navigatorState:names");
                        throw null;
                    }
                    int size2 = stringArrayList.size();
                    int i13 = 0;
                    while (i13 < size2) {
                        String str2 = stringArrayList.get(i13);
                        i13++;
                        int i14 = size2;
                        String str3 = str2;
                        fj0Var5.Yi7zF1RB1(str3);
                        if (bundle2.containsKey(str3) && bundle2.getBundle(str3) == null) {
                            z50.cilMamHF(str3);
                            throw null;
                        }
                        size2 = i14;
                    }
                }
                Bundle[] bundleArr = ph0Var.OOA6hdeuvCS;
                if (bundleArr != null) {
                    int length2 = bundleArr.length;
                    int i15 = 0;
                    while (i15 < length2) {
                        Bundle[] bundleArr2 = bundleArr;
                        Bundle bundle3 = bundleArr2[i15];
                        bundle3.getClass();
                        int i16 = length2;
                        bundle3.setClassLoader(ih0.class.getClassLoader());
                        String string = bundle3.getString("nav-entry-state:id");
                        if (string == null) {
                            z50.cilMamHF("nav-entry-state:id");
                            throw null;
                        }
                        int mE4lRynR = o50.mE4lRynR(bundle3, "nav-entry-state:destination-id");
                        int i17 = i15;
                        Bundle bundle4 = bundle3.getBundle("nav-entry-state:args");
                        if (bundle4 == null) {
                            z50.cilMamHF("nav-entry-state:args");
                            throw null;
                        }
                        Bundle bundle5 = bundle3.getBundle("nav-entry-state:saved-state");
                        if (bundle5 == null) {
                            z50.cilMamHF("nav-entry-state:saved-state");
                            throw null;
                        }
                        xh0 xqGvceK5x = ph0Var.xqGvceK5x(mE4lRynR, null);
                        if (xqGvceK5x == null) {
                            int i18 = xh0.mOu10nynGul;
                            throw new IllegalStateException("Restoring the Navigation back stack failed: destination " + o50.YmKjaVtbfp5Z(kpVar, mE4lRynR) + " cannot be found from the current destination " + ph0Var.encWxUiV2());
                        }
                        m90 mOu10nynGul = ph0Var.mOu10nynGul();
                        qh0 qh0Var = ph0Var.iwATDS1i01k;
                        kpVar.getClass();
                        mOu10nynGul.getClass();
                        Context context = kpVar.GWasM1elztuh;
                        bundle4.setClassLoader(context != null ? context.getClassLoader() : null);
                        fh0 fh0Var3 = new fh0(kpVar, xqGvceK5x, bundle4, mOu10nynGul, qh0Var, string, bundle5);
                        ej0 Yi7zF1RB12 = fj0Var5.Yi7zF1RB1(xqGvceK5x.OOA6hdeuvCS);
                        Object obj4 = linkedHashMap.get(Yi7zF1RB12);
                        if (obj4 == null) {
                            obj4 = new kh0(hi0Var2, Yi7zF1RB12);
                            linkedHashMap.put(Yi7zF1RB12, obj4);
                        }
                        v4Var.addLast(fh0Var3);
                        ((kh0) obj4).GWasM1elztuh(fh0Var3);
                        bi0 bi0Var7 = fh0Var3.EljAMC1QTz.AvO7iQsrTN;
                        if (bi0Var7 != null) {
                            ph0Var.rQPn8YBR(fh0Var3, ph0Var.EljAMC1QTz(bi0Var7.EljAMC1QTz.GWasM1elztuh));
                        }
                        i15 = i17 + 1;
                        bundleArr = bundleArr2;
                        length2 = i16;
                    }
                    ph0Var.Yi7zF1RB1.GWasM1elztuh();
                    ph0Var.OOA6hdeuvCS = null;
                }
                Collection values = rc0.AEn1Rrio(fj0Var5.GWasM1elztuh).values();
                ArrayList arrayList4 = new ArrayList();
                for (Object obj5 : values) {
                    if (!((ej0) obj5).Yi7zF1RB1) {
                        arrayList4.add(obj5);
                    }
                }
                int size3 = arrayList4.size();
                int i19 = 0;
                while (i19 < size3) {
                    Object obj6 = arrayList4.get(i19);
                    i19++;
                    ej0 ej0Var = (ej0) obj6;
                    Object obj7 = linkedHashMap.get(ej0Var);
                    if (obj7 == null) {
                        ej0Var.getClass();
                        obj7 = new kh0(hi0Var2, ej0Var);
                        linkedHashMap.put(ej0Var, obj7);
                    }
                    ej0Var.getClass();
                    ej0Var.GWasM1elztuh = (kh0) obj7;
                    ej0Var.Yi7zF1RB1 = true;
                }
                if (ph0Var.X1lG3V04pd == null || !v4Var.isEmpty()) {
                    fj0Var = fj0Var4;
                    i2 = i6;
                    t90Var = t90Var2;
                    ph0Var.Yi7zF1RB1();
                } else {
                    Activity activity = hi0Var2.xqGvceK5x;
                    if (!hi0Var2.OOA6hdeuvCS && activity != null) {
                        Intent intent = activity.getIntent();
                        ph0 ph0Var2 = hi0Var2.Yi7zF1RB1;
                        if (intent != null) {
                            Bundle extras = intent.getExtras();
                            if (extras != null) {
                                try {
                                    iArr = extras.getIntArray("android-support-nav:controller:deepLinkIds");
                                } catch (Exception e) {
                                    i2 = i6;
                                    Log.e("NavController", "handleDeepLink() could not extract deepLink from " + intent, e);
                                    iArr = null;
                                }
                            } else {
                                iArr = null;
                            }
                            i2 = i6;
                            ArrayList parcelableArrayList = extras != null ? extras.getParcelableArrayList("android-support-nav:controller:deepLinkArgs") : null;
                            Bundle jivtDDk9H = ki1.jivtDDk9H((rn0[]) Arrays.copyOf(new rn0[0], 0));
                            Bundle bundle6 = extras != null ? extras.getBundle("android-support-nav:controller:deepLinkExtras") : null;
                            if (bundle6 != null) {
                                jivtDDk9H.putAll(bundle6);
                            }
                            if (iArr == null || iArr.length == 0) {
                                ?? JFJ3QoxA = ph0Var2.JFJ3QoxA();
                                iArr2 = iArr;
                                t90Var = t90Var2;
                                fj0Var = fj0Var4;
                                wh0 OOA6hdeuvCS3 = JFJ3QoxA.OOA6hdeuvCS(new f4(intent.getData(), intent.getAction(), intent.getType(), 11), JFJ3QoxA);
                                if (OOA6hdeuvCS3 != null) {
                                    xh0 xh0Var4 = OOA6hdeuvCS3.OOA6hdeuvCS;
                                    v4 v4Var2 = new v4();
                                    xh0 xh0Var5 = xh0Var4;
                                    while (true) {
                                        ai0 ai0Var = xh0Var5.EljAMC1QTz;
                                        bi0 bi0Var8 = xh0Var5.AvO7iQsrTN;
                                        if (bi0Var8 == null || bi0Var8.JFJ3QoxA.X1lG3V04pd != ai0Var.GWasM1elztuh) {
                                            v4Var2.addFirst(xh0Var5);
                                        }
                                        if (!o30.rQPn8YBR(bi0Var8, null) && bi0Var8 != null) {
                                            xh0Var5 = bi0Var8;
                                        }
                                    }
                                    List gqMuANyCes = rb.gqMuANyCes(v4Var2);
                                    ArrayList arrayList5 = new ArrayList(sb.dcDmLGVhzWm(gqMuANyCes, 10));
                                    Iterator it5 = gqMuANyCes.iterator();
                                    while (it5.hasNext()) {
                                        arrayList5.add(Integer.valueOf(((xh0) it5.next()).EljAMC1QTz.GWasM1elztuh));
                                    }
                                    int[] iArr4 = new int[arrayList5.size()];
                                    Iterator it6 = arrayList5.iterator();
                                    int i20 = 0;
                                    while (it6.hasNext()) {
                                        iArr4[i20] = ((Number) it6.next()).intValue();
                                        i20++;
                                    }
                                    Bundle GWasM1elztuh5 = xh0Var4.GWasM1elztuh(OOA6hdeuvCS3.EljAMC1QTz);
                                    if (GWasM1elztuh5 != null) {
                                        jivtDDk9H.putAll(GWasM1elztuh5);
                                    }
                                    iArr3 = iArr4;
                                    arrayList = null;
                                    if (iArr3 != null && iArr3.length != 0) {
                                        ph0Var2.getClass();
                                        bi0 bi0Var9 = ph0Var2.X1lG3V04pd;
                                        length = iArr3.length;
                                        i3 = 0;
                                        while (true) {
                                            if (i3 < length) {
                                                str = null;
                                                break;
                                            }
                                            int i21 = iArr3[i3];
                                            if (i3 == 0) {
                                                bi0 bi0Var10 = ph0Var2.X1lG3V04pd;
                                                bi0Var10.getClass();
                                                GWasM1elztuh3 = bi0Var10.EljAMC1QTz.GWasM1elztuh == i21 ? ph0Var2.X1lG3V04pd : null;
                                            } else {
                                                bi0Var9.getClass();
                                                GWasM1elztuh3 = bi0Var9.JFJ3QoxA.GWasM1elztuh(i21);
                                            }
                                            if (GWasM1elztuh3 == null) {
                                                int i22 = xh0.mOu10nynGul;
                                                str = o50.YmKjaVtbfp5Z(ph0Var2.GWasM1elztuh.X1lG3V04pd, i21);
                                                break;
                                            }
                                            if (i3 != iArr3.length - 1 && (GWasM1elztuh3 instanceof bi0)) {
                                                while (true) {
                                                    bi0Var3 = (bi0) GWasM1elztuh3;
                                                    bi0Var3.getClass();
                                                    ei0 ei0Var2 = bi0Var3.JFJ3QoxA;
                                                    if (!(ei0Var2.GWasM1elztuh(ei0Var2.X1lG3V04pd) instanceof bi0)) {
                                                        break;
                                                    } else {
                                                        GWasM1elztuh3 = ei0Var2.GWasM1elztuh(ei0Var2.X1lG3V04pd);
                                                    }
                                                }
                                                bi0Var9 = bi0Var3;
                                            }
                                            i3++;
                                        }
                                        if (str == null) {
                                            Log.i("NavController", "Could not find destination " + str + " in the navigation graph, ignoring the deep link from " + intent);
                                        } else {
                                            jivtDDk9H.putParcelable("android-support-nav:controller:deepLinkIntent", intent);
                                            int length3 = iArr3.length;
                                            Bundle[] bundleArr3 = new Bundle[length3];
                                            for (int i23 = 0; i23 < length3; i23++) {
                                                Bundle jivtDDk9H2 = ki1.jivtDDk9H((rn0[]) Arrays.copyOf(new rn0[0], 0));
                                                jivtDDk9H2.putAll(jivtDDk9H);
                                                if (arrayList != null && (bundle = (Bundle) arrayList.get(i23)) != null) {
                                                    jivtDDk9H2.putAll(bundle);
                                                }
                                                bundleArr3[i23] = jivtDDk9H2;
                                            }
                                            int flags = intent.getFlags();
                                            int i24 = 268435456 & flags;
                                            if (i24 != 0 && (flags & 32768) == 0) {
                                                intent.addFlags(32768);
                                                Context context2 = hi0Var2.GWasM1elztuh;
                                                ArrayList arrayList6 = new ArrayList();
                                                ComponentName component = intent.getComponent();
                                                if (component == null) {
                                                    component = intent.resolveActivity(context2.getPackageManager());
                                                }
                                                if (component != null) {
                                                    int size4 = arrayList6.size();
                                                    try {
                                                        for (Intent cilMamHF = b70.cilMamHF(context2, component); cilMamHF != null; cilMamHF = b70.cilMamHF(context2, cilMamHF.getComponent())) {
                                                            arrayList6.add(size4, cilMamHF);
                                                        }
                                                    } catch (PackageManager.NameNotFoundException e2) {
                                                        Log.e("TaskStackBuilder", "Bad ComponentName while traversing activity parent metadata");
                                                        throw new IllegalArgumentException(e2);
                                                    }
                                                }
                                                arrayList6.add(intent);
                                                if (arrayList6.isEmpty()) {
                                                    o4.jivtDDk9H("No intents added to TaskStackBuilder; cannot startActivities");
                                                    return;
                                                }
                                                Intent[] intentArr = (Intent[]) arrayList6.toArray(new Intent[0]);
                                                intentArr[0] = new Intent(intentArr[0]).addFlags(268484608);
                                                context2.startActivities(intentArr, null);
                                                activity.finish();
                                                activity.overridePendingTransition(0, 0);
                                            } else if (i24 != 0) {
                                                if (ph0Var2.EljAMC1QTz.isEmpty()) {
                                                    i4 = 0;
                                                } else {
                                                    bi0 bi0Var11 = ph0Var2.X1lG3V04pd;
                                                    bi0Var11.getClass();
                                                    i4 = 0;
                                                    ph0Var2.XnEVoBF0td1l(bi0Var11.EljAMC1QTz.GWasM1elztuh, true, false);
                                                }
                                                while (i4 < iArr3.length) {
                                                    int i25 = iArr3[i4];
                                                    int i26 = i4 + 1;
                                                    Bundle bundle7 = bundleArr3[i4];
                                                    xh0 xqGvceK5x2 = ph0Var2.xqGvceK5x(i25, null);
                                                    if (xqGvceK5x2 == null) {
                                                        int i27 = xh0.mOu10nynGul;
                                                        throw new IllegalStateException("Deep Linking failed: destination " + o50.YmKjaVtbfp5Z(kpVar, i25) + " cannot be found from the current destination " + ph0Var2.encWxUiV2());
                                                    }
                                                    ph0Var2.E7jCp8Ls(xqGvceK5x2, bundle7, w60.Y6hRI1cF8(new X1lG3V04pd(16, xqGvceK5x2, hi0Var2)));
                                                    i4 = i26;
                                                }
                                                hi0Var2.OOA6hdeuvCS = true;
                                            } else {
                                                bi0 bi0Var12 = ph0Var2.X1lG3V04pd;
                                                int length4 = iArr3.length;
                                                for (int i28 = 0; i28 < length4; i28++) {
                                                    int i29 = iArr3[i28];
                                                    Bundle bundle8 = bundleArr3[i28];
                                                    if (i28 == 0) {
                                                        GWasM1elztuh2 = ph0Var2.X1lG3V04pd;
                                                    } else {
                                                        bi0Var12.getClass();
                                                        GWasM1elztuh2 = bi0Var12.JFJ3QoxA.GWasM1elztuh(i29);
                                                    }
                                                    if (GWasM1elztuh2 == null) {
                                                        int i30 = xh0.mOu10nynGul;
                                                        throw new IllegalStateException("Deep Linking failed: destination " + o50.YmKjaVtbfp5Z(kpVar, i29) + " cannot be found in graph " + bi0Var12);
                                                    }
                                                    if (i28 == iArr3.length - 1) {
                                                        bi0 bi0Var13 = ph0Var2.X1lG3V04pd;
                                                        bi0Var13.getClass();
                                                        ph0Var2.E7jCp8Ls(GWasM1elztuh2, bundle8, new si0(false, false, bi0Var13.EljAMC1QTz.GWasM1elztuh, true, false, 0, 0));
                                                    } else if (GWasM1elztuh2 instanceof bi0) {
                                                        while (true) {
                                                            bi0Var2 = (bi0) GWasM1elztuh2;
                                                            bi0Var2.getClass();
                                                            ei0 ei0Var3 = bi0Var2.JFJ3QoxA;
                                                            if (!(ei0Var3.GWasM1elztuh(ei0Var3.X1lG3V04pd) instanceof bi0)) {
                                                                break;
                                                            } else {
                                                                GWasM1elztuh2 = ei0Var3.GWasM1elztuh(ei0Var3.X1lG3V04pd);
                                                            }
                                                        }
                                                        bi0Var12 = bi0Var2;
                                                    }
                                                }
                                                hi0Var2.OOA6hdeuvCS = true;
                                            }
                                        }
                                    }
                                    bi0 bi0Var14 = ph0Var.X1lG3V04pd;
                                    bi0Var14.getClass();
                                    ph0Var.E7jCp8Ls(bi0Var14, null, null);
                                }
                            } else {
                                iArr2 = iArr;
                                fj0Var = fj0Var4;
                                t90Var = t90Var2;
                            }
                            arrayList = parcelableArrayList;
                            iArr3 = iArr2;
                            if (iArr3 != null) {
                                ph0Var2.getClass();
                                bi0 bi0Var92 = ph0Var2.X1lG3V04pd;
                                length = iArr3.length;
                                i3 = 0;
                                while (true) {
                                    if (i3 < length) {
                                    }
                                    i3++;
                                }
                                if (str == null) {
                                }
                            }
                            bi0 bi0Var142 = ph0Var.X1lG3V04pd;
                            bi0Var142.getClass();
                            ph0Var.E7jCp8Ls(bi0Var142, null, null);
                        }
                    }
                    fj0Var = fj0Var4;
                    i2 = i6;
                    t90Var = t90Var2;
                    bi0 bi0Var1422 = ph0Var.X1lG3V04pd;
                    bi0Var1422.getClass();
                    ph0Var.E7jCp8Ls(bi0Var1422, null, null);
                }
            }
            fj0 fj0Var6 = fj0Var;
            ej0 Yi7zF1RB13 = fj0Var6.Yi7zF1RB1("composable");
            zd zdVar3 = Yi7zF1RB13 instanceof zd ? (zd) Yi7zF1RB13 : null;
            if (zdVar3 == null) {
                at0 Mjvvu5DE = qxVar.Mjvvu5DE();
                if (Mjvvu5DE != null) {
                    Mjvvu5DE.xqGvceK5x = new ji0(hi0Var, bi0Var, ie0Var, r6Var, hvVar, hvVar2, hvVar3, hvVar4, i, 2);
                    return;
                }
                return;
            }
            ?? r12 = qxVar;
            mg0 mOu10nynGul2 = z50.mOu10nynGul(zdVar3.Yi7zF1RB1().OOA6hdeuvCS, r12);
            Object HFYAaqMd6 = r12.HFYAaqMd6();
            Object obj8 = ue.GWasM1elztuh;
            if (HFYAaqMd6 == obj8) {
                HFYAaqMd6 = new bo0(0.0f);
                r12.dcDmLGVhzWm(HFYAaqMd6);
            }
            bo0 bo0Var = (bo0) HFYAaqMd6;
            Object HFYAaqMd62 = r12.HFYAaqMd6();
            if (HFYAaqMd62 == obj8) {
                HFYAaqMd62 = z50.WRKkgoJXwDn(Boolean.FALSE);
                r12.dcDmLGVhzWm(HFYAaqMd62);
            }
            mg0 mg0Var5 = (mg0) HFYAaqMd62;
            boolean z4 = ((List) mOu10nynGul2.getValue()).size() > 1;
            boolean EljAMC1QTz = r12.EljAMC1QTz(mOu10nynGul2) | r12.encWxUiV2(zdVar3);
            Object HFYAaqMd63 = r12.HFYAaqMd6();
            if (EljAMC1QTz || HFYAaqMd63 == obj8) {
                zd zdVar4 = zdVar3;
                ei eiVar = new ei(zdVar4, mOu10nynGul2, bo0Var, mg0Var5, null, 2);
                mg0Var = mOu10nynGul2;
                mg0Var2 = mg0Var5;
                zdVar3 = zdVar4;
                r12.dcDmLGVhzWm(eiVar);
                HFYAaqMd63 = eiVar;
            } else {
                mg0Var = mOu10nynGul2;
                mg0Var2 = mg0Var5;
            }
            d70.OOA6hdeuvCS(z4, (lv) HFYAaqMd63, r12, 0);
            t90 t90Var3 = t90Var;
            boolean encWxUiV2 = r12.encWxUiV2(hi0Var) | r12.encWxUiV2(t90Var3);
            Object HFYAaqMd64 = r12.HFYAaqMd6();
            if (encWxUiV2 || HFYAaqMd64 == obj8) {
                HFYAaqMd64 = new X1lG3V04pd(18, hi0Var, t90Var3);
                r12.dcDmLGVhzWm(HFYAaqMd64);
            }
            ki1.EljAMC1QTz(t90Var3, (hv) HFYAaqMd64, r12);
            jw0 cilMamHF2 = q70.cilMamHF(r12);
            mg0 mOu10nynGul3 = z50.mOu10nynGul(ph0Var.mOu10nynGul, r12);
            Object HFYAaqMd65 = r12.HFYAaqMd6();
            if (HFYAaqMd65 == obj8) {
                HFYAaqMd65 = z50.iwATDS1i01k(new o1(7, mOu10nynGul3));
                r12.dcDmLGVhzWm(HFYAaqMd65);
            }
            m51 m51Var2 = (m51) HFYAaqMd65;
            fh0 fh0Var4 = (fh0) rb.cTIXpaxc((List) m51Var2.getValue());
            Object HFYAaqMd66 = r12.HFYAaqMd6();
            if (HFYAaqMd66 == obj8) {
                int i31 = ok0.GWasM1elztuh;
                HFYAaqMd66 = new yf0(6);
                r12.dcDmLGVhzWm(HFYAaqMd66);
            }
            yf0 yf0Var3 = (yf0) HFYAaqMd66;
            if (fh0Var4 != null) {
                r12.MjxSquD6Av(-1797563167);
                boolean encWxUiV22 = r12.encWxUiV2(zdVar3) | ((((i2 & 3670016) ^ 1572864) > 1048576 && r12.EljAMC1QTz(hvVar3)) || (i2 & 1572864) == 1048576) | ((i2 & 57344) == 16384);
                Object HFYAaqMd67 = r12.HFYAaqMd6();
                if (encWxUiV22 || HFYAaqMd67 == obj8) {
                    final int i32 = 0;
                    fj0Var3 = fj0Var6;
                    zdVar = zdVar3;
                    z = true;
                    z2 = false;
                    yf0Var = yf0Var3;
                    hv hvVar5 = new hv() { // from class: ki0
                        @Override // defpackage.hv
                        public final Object mOu10nynGul(Object obj9) {
                            int i33 = i32;
                            mg0 mg0Var6 = mg0Var2;
                            hv hvVar6 = hvVar;
                            hv hvVar7 = hvVar3;
                            zd zdVar5 = zdVar;
                            a3 a3Var = (a3) obj9;
                            switch (i33) {
                                case 0:
                                    xh0 xh0Var6 = ((fh0) a3Var.X1lG3V04pd()).EljAMC1QTz;
                                    xh0Var6.getClass();
                                    yd ydVar = (yd) xh0Var6;
                                    if (((Boolean) zdVar5.X1lG3V04pd.getValue()).booleanValue() || ((Boolean) mg0Var6.getValue()).booleanValue()) {
                                        int i34 = xh0.mOu10nynGul;
                                        for (xh0 xh0Var7 : o50.Mjvvu5DE(ydVar)) {
                                        }
                                        return (lq) hvVar7.mOu10nynGul(a3Var);
                                    }
                                    int i35 = xh0.mOu10nynGul;
                                    for (xh0 xh0Var8 : o50.Mjvvu5DE(ydVar)) {
                                    }
                                    return (lq) hvVar6.mOu10nynGul(a3Var);
                                default:
                                    xh0 xh0Var9 = ((fh0) a3Var.Yi7zF1RB1()).EljAMC1QTz;
                                    xh0Var9.getClass();
                                    yd ydVar2 = (yd) xh0Var9;
                                    if (((Boolean) zdVar5.X1lG3V04pd.getValue()).booleanValue() || ((Boolean) mg0Var6.getValue()).booleanValue()) {
                                        int i36 = xh0.mOu10nynGul;
                                        for (xh0 xh0Var10 : o50.Mjvvu5DE(ydVar2)) {
                                        }
                                        return (xq) hvVar7.mOu10nynGul(a3Var);
                                    }
                                    int i37 = xh0.mOu10nynGul;
                                    for (xh0 xh0Var11 : o50.Mjvvu5DE(ydVar2)) {
                                    }
                                    return (xq) hvVar6.mOu10nynGul(a3Var);
                            }
                        }
                    };
                    r12.dcDmLGVhzWm(hvVar5);
                    HFYAaqMd67 = hvVar5;
                } else {
                    fj0Var3 = fj0Var6;
                    zdVar = zdVar3;
                    z = true;
                    z2 = false;
                    yf0Var = yf0Var3;
                }
                final hv hvVar6 = (hv) HFYAaqMd67;
                boolean encWxUiV23 = r12.encWxUiV2(zdVar) | (((((i2 & 29360128) ^ 12582912) <= 8388608 || !r12.EljAMC1QTz(hvVar4)) && (i2 & 12582912) != 8388608) ? z2 : z) | ((i2 & 458752) == 131072 ? z : z2);
                Object HFYAaqMd68 = r12.HFYAaqMd6();
                if (encWxUiV23 || HFYAaqMd68 == obj8) {
                    final int i33 = 1;
                    hv hvVar7 = new hv() { // from class: ki0
                        @Override // defpackage.hv
                        public final Object mOu10nynGul(Object obj9) {
                            int i332 = i33;
                            mg0 mg0Var6 = mg0Var2;
                            hv hvVar62 = hvVar2;
                            hv hvVar72 = hvVar4;
                            zd zdVar5 = zdVar;
                            a3 a3Var = (a3) obj9;
                            switch (i332) {
                                case 0:
                                    xh0 xh0Var6 = ((fh0) a3Var.X1lG3V04pd()).EljAMC1QTz;
                                    xh0Var6.getClass();
                                    yd ydVar = (yd) xh0Var6;
                                    if (((Boolean) zdVar5.X1lG3V04pd.getValue()).booleanValue() || ((Boolean) mg0Var6.getValue()).booleanValue()) {
                                        int i34 = xh0.mOu10nynGul;
                                        for (xh0 xh0Var7 : o50.Mjvvu5DE(ydVar)) {
                                        }
                                        return (lq) hvVar72.mOu10nynGul(a3Var);
                                    }
                                    int i35 = xh0.mOu10nynGul;
                                    for (xh0 xh0Var8 : o50.Mjvvu5DE(ydVar)) {
                                    }
                                    return (lq) hvVar62.mOu10nynGul(a3Var);
                                default:
                                    xh0 xh0Var9 = ((fh0) a3Var.Yi7zF1RB1()).EljAMC1QTz;
                                    xh0Var9.getClass();
                                    yd ydVar2 = (yd) xh0Var9;
                                    if (((Boolean) zdVar5.X1lG3V04pd.getValue()).booleanValue() || ((Boolean) mg0Var6.getValue()).booleanValue()) {
                                        int i36 = xh0.mOu10nynGul;
                                        for (xh0 xh0Var10 : o50.Mjvvu5DE(ydVar2)) {
                                        }
                                        return (xq) hvVar72.mOu10nynGul(a3Var);
                                    }
                                    int i37 = xh0.mOu10nynGul;
                                    for (xh0 xh0Var11 : o50.Mjvvu5DE(ydVar2)) {
                                    }
                                    return (xq) hvVar62.mOu10nynGul(a3Var);
                            }
                        }
                    };
                    r12.dcDmLGVhzWm(hvVar7);
                    HFYAaqMd68 = hvVar7;
                }
                final hv hvVar8 = (hv) HFYAaqMd68;
                boolean z5 = (i2 & 234881024) == 67108864 ? z : z2;
                Object HFYAaqMd69 = r12.HFYAaqMd6();
                if (z5 || HFYAaqMd69 == obj8) {
                    HFYAaqMd69 = new oh0(5);
                    r12.dcDmLGVhzWm(HFYAaqMd69);
                }
                final hv hvVar9 = (hv) HFYAaqMd69;
                Boolean bool = Boolean.TRUE;
                boolean encWxUiV24 = r12.encWxUiV2(zdVar);
                Object HFYAaqMd610 = r12.HFYAaqMd6();
                int i34 = 17;
                if (encWxUiV24 || HFYAaqMd610 == obj8) {
                    HFYAaqMd610 = new X1lG3V04pd(i34, m51Var2, zdVar);
                    r12.dcDmLGVhzWm(HFYAaqMd610);
                }
                ki1.EljAMC1QTz(bool, (hv) HFYAaqMd610, r12);
                Object HFYAaqMd611 = r12.HFYAaqMd6();
                if (HFYAaqMd611 == obj8) {
                    HFYAaqMd611 = new vz0(fh0Var4);
                    r12.dcDmLGVhzWm(HFYAaqMd611);
                }
                vz0 vz0Var2 = (vz0) HFYAaqMd611;
                boolean EljAMC1QTz2 = r12.EljAMC1QTz(vz0Var2);
                Object HFYAaqMd612 = r12.HFYAaqMd6();
                if (EljAMC1QTz2 || HFYAaqMd612 == obj8) {
                    y31 Mjvvu5DE2 = d70.Mjvvu5DE();
                    hv OOA6hdeuvCS4 = Mjvvu5DE2 != null ? Mjvvu5DE2.OOA6hdeuvCS() : null;
                    mg0Var3 = mg0Var2;
                    y31 M3K9sHhK = d70.M3K9sHhK(Mjvvu5DE2);
                    m51Var = m51Var2;
                    try {
                        qa1 qa1Var2 = new qa1(vz0Var2, null, "entry");
                        d70.A1EKNP6CxJ(Mjvvu5DE2, M3K9sHhK, OOA6hdeuvCS4);
                        r12.dcDmLGVhzWm(qa1Var2);
                        HFYAaqMd612 = qa1Var2;
                    } catch (Throwable th) {
                        d70.A1EKNP6CxJ(Mjvvu5DE2, M3K9sHhK, OOA6hdeuvCS4);
                        throw th;
                    }
                } else {
                    mg0Var3 = mg0Var2;
                    m51Var = m51Var2;
                }
                ?? r14 = (qa1) HFYAaqMd612;
                if (vz0Var2 != null) {
                    r12.MjxSquD6Av(-1357590553);
                    Object HFYAaqMd613 = r12.HFYAaqMd6();
                    if (HFYAaqMd613 == obj8) {
                        HFYAaqMd613 = ki1.WdrkLMV3xh(r12);
                        r12.dcDmLGVhzWm(HFYAaqMd613);
                    }
                    ph phVar = (ph) HFYAaqMd613;
                    boolean encWxUiV25 = r12.encWxUiV2(phVar) | r12.EljAMC1QTz(vz0Var2);
                    Object HFYAaqMd614 = r12.HFYAaqMd6();
                    if (encWxUiV25 || HFYAaqMd614 == obj8) {
                        HFYAaqMd614 = new X1lG3V04pd(26, vz0Var2, phVar);
                        r12.dcDmLGVhzWm(HFYAaqMd614);
                    }
                    ki1.EljAMC1QTz(phVar, (hv) HFYAaqMd614, r12);
                    Object value = vz0Var2.X1lG3V04pd.getValue();
                    Object value2 = vz0Var2.Yi7zF1RB1.getValue();
                    boolean EljAMC1QTz3 = r12.EljAMC1QTz(vz0Var2);
                    Object HFYAaqMd615 = r12.HFYAaqMd6();
                    if (EljAMC1QTz3 || HFYAaqMd615 == obj8) {
                        r11 = null;
                        HFYAaqMd615 = new EljAMC1QTz(vz0Var2, r11, 17);
                        r12.dcDmLGVhzWm(HFYAaqMd615);
                    } else {
                        r11 = null;
                    }
                    ki1.mOu10nynGul(value, value2, (lv) HFYAaqMd615, r12);
                    r12.WIEu4Ya2g8(false);
                } else {
                    r11 = null;
                    r12.MjxSquD6Av(-1356604288);
                    r14.GWasM1elztuh(vz0Var2.Yi7zF1RB1.getValue(), r12, 0);
                    r12.WIEu4Ya2g8(false);
                }
                boolean EljAMC1QTz4 = r12.EljAMC1QTz(r14);
                Object HFYAaqMd616 = r12.HFYAaqMd6();
                if (EljAMC1QTz4 || HFYAaqMd616 == obj8) {
                    HFYAaqMd616 = new E7jCp8Ls(23, (Object) r14);
                    r12.dcDmLGVhzWm(HFYAaqMd616);
                }
                ki1.EljAMC1QTz(r14, (hv) HFYAaqMd616, r12);
                if (((Boolean) mg0Var3.getValue()).booleanValue()) {
                    r12.MjxSquD6Av(-1795329152);
                    Float valueOf = Float.valueOf(bo0Var.AvO7iQsrTN());
                    boolean EljAMC1QTz5 = r12.EljAMC1QTz(mg0Var) | r12.encWxUiV2(vz0Var2);
                    Object HFYAaqMd617 = r12.HFYAaqMd6();
                    if (EljAMC1QTz5 || HFYAaqMd617 == obj8) {
                        ?? r23 = r11;
                        HFYAaqMd617 = new EljAMC1QTz(vz0Var2, mg0Var, bo0Var, r23, 12);
                        r12.dcDmLGVhzWm(HFYAaqMd617);
                        amVar3 = r23;
                    } else {
                        amVar3 = r11;
                    }
                    ki1.encWxUiV2((lv) HFYAaqMd617, r12, valueOf);
                    r12.WIEu4Ya2g8(false);
                    vz0Var = vz0Var2;
                    qa1Var = r14;
                    fh0Var = fh0Var4;
                    amVar2 = amVar3;
                } else {
                    ?? r232 = r11;
                    r12.MjxSquD6Av(-1794910745);
                    boolean encWxUiV26 = r12.encWxUiV2(vz0Var2) | r12.encWxUiV2(fh0Var4) | r12.EljAMC1QTz(r14);
                    Object HFYAaqMd618 = r12.HFYAaqMd6();
                    if (encWxUiV26 || HFYAaqMd618 == obj8) {
                        vz0Var = vz0Var2;
                        qa1Var = r14;
                        HFYAaqMd618 = new i2(vz0Var, fh0Var4, qa1Var, r232, 5);
                        fh0Var = fh0Var4;
                        r12.dcDmLGVhzWm(HFYAaqMd618);
                    } else {
                        vz0Var = vz0Var2;
                        qa1Var = r14;
                        fh0Var = fh0Var4;
                    }
                    ki1.encWxUiV2((lv) HFYAaqMd618, r12, fh0Var);
                    r12.WIEu4Ya2g8(false);
                    amVar2 = r232;
                }
                boolean encWxUiV27 = r12.encWxUiV2(yf0Var) | r12.encWxUiV2(zdVar) | r12.EljAMC1QTz(hvVar6) | r12.EljAMC1QTz(hvVar8) | r12.EljAMC1QTz(hvVar9);
                Object HFYAaqMd619 = r12.HFYAaqMd6();
                if (encWxUiV27 || HFYAaqMd619 == obj8) {
                    final yf0 yf0Var4 = yf0Var;
                    final zd zdVar5 = zdVar;
                    fj0Var2 = fj0Var3;
                    final mg0 mg0Var6 = mg0Var3;
                    final m51 m51Var3 = m51Var;
                    obj = new hv() { // from class: ii0
                        @Override // defpackage.hv
                        public final Object mOu10nynGul(Object obj9) {
                            a3 a3Var = (a3) obj9;
                            float f = 0.0f;
                            if (!((List) m51Var3.getValue()).contains(a3Var.Yi7zF1RB1())) {
                                return new qg(lq.Yi7zF1RB1, xq.Yi7zF1RB1, 0.0f, new x21(r2.AvO7iQsrTN));
                            }
                            String str4 = ((fh0) a3Var.Yi7zF1RB1()).JFJ3QoxA;
                            yf0 yf0Var5 = yf0.this;
                            int Yi7zF1RB14 = yf0Var5.Yi7zF1RB1(str4);
                            if (Yi7zF1RB14 >= 0) {
                                f = yf0Var5.X1lG3V04pd[Yi7zF1RB14];
                            } else {
                                yf0Var5.xqGvceK5x(str4, 0.0f);
                            }
                            if (!o30.rQPn8YBR(((fh0) a3Var.X1lG3V04pd()).JFJ3QoxA, ((fh0) a3Var.Yi7zF1RB1()).JFJ3QoxA)) {
                                f = (((Boolean) zdVar5.X1lG3V04pd.getValue()).booleanValue() || ((Boolean) mg0Var6.getValue()).booleanValue()) ? f - 1.0f : f + 1.0f;
                            }
                            yf0Var5.xqGvceK5x(((fh0) a3Var.X1lG3V04pd()).JFJ3QoxA, f);
                            return new qg((lq) hvVar6.mOu10nynGul(a3Var), (xq) hvVar8.mOu10nynGul(a3Var), f, (x21) hvVar9.mOu10nynGul(a3Var));
                        }
                    };
                    zdVar2 = zdVar5;
                    mg0Var4 = mg0Var6;
                    yf0Var2 = yf0Var4;
                    r12.dcDmLGVhzWm(obj);
                } else {
                    zdVar2 = zdVar;
                    obj = HFYAaqMd619;
                    yf0Var2 = yf0Var;
                    fj0Var2 = fj0Var3;
                    mg0Var4 = mg0Var3;
                }
                hv hvVar10 = (hv) obj;
                Object HFYAaqMd620 = r12.HFYAaqMd6();
                if (HFYAaqMd620 == obj8) {
                    HFYAaqMd620 = new oh0(4);
                    r12.dcDmLGVhzWm(HFYAaqMd620);
                }
                qa1 qa1Var3 = qa1Var;
                n30.GWasM1elztuh(qa1Var3, ie0Var, hvVar10, r6Var, (hv) HFYAaqMd620, rj0.YZjbz8VdP5(820763100, new ni0(vz0Var, fh0Var, cilMamHF2, mg0Var4, m51Var), r12), r12, ((i2 >> 3) & 112) | 221184 | (i2 & 7168));
                Object EljAMC1QTz6 = qa1Var3.GWasM1elztuh.EljAMC1QTz();
                Object value3 = qa1Var3.xqGvceK5x.getValue();
                boolean EljAMC1QTz7 = r12.EljAMC1QTz(qa1Var3) | r12.encWxUiV2(hi0Var) | r12.encWxUiV2(fh0Var) | r12.encWxUiV2(zdVar2) | r12.encWxUiV2(yf0Var2);
                Object HFYAaqMd621 = r12.HFYAaqMd6();
                if (EljAMC1QTz7 || HFYAaqMd621 == obj8) {
                    oi0 oi0Var = new oi0(qa1Var3, hi0Var, fh0Var, yf0Var2, m51Var, zdVar2, null);
                    r12.dcDmLGVhzWm(oi0Var);
                    HFYAaqMd621 = oi0Var;
                }
                ki1.mOu10nynGul(EljAMC1QTz6, value3, (lv) HFYAaqMd621, r12);
                r12.WIEu4Ya2g8(false);
                amVar = amVar2;
            } else {
                fj0Var2 = fj0Var6;
                amVar = null;
                r12.MjxSquD6Av(-1789758886);
                r12.WIEu4Ya2g8(false);
            }
            ej0 Yi7zF1RB14 = fj0Var2.Yi7zF1RB1("dialog");
            am amVar4 = Yi7zF1RB14 instanceof am ? (am) Yi7zF1RB14 : amVar;
            if (amVar4 == null) {
                at0 Mjvvu5DE3 = r12.Mjvvu5DE();
                if (Mjvvu5DE3 != null) {
                    Mjvvu5DE3.xqGvceK5x = new ji0(hi0Var, bi0Var, ie0Var, r6Var, hvVar, hvVar2, hvVar3, hvVar4, i, 0);
                    return;
                }
                return;
            }
            fb1.xqGvceK5x(amVar4, r12, 0);
            qxVar2 = r12;
        }
        at0 Mjvvu5DE4 = qxVar2.Mjvvu5DE();
        if (Mjvvu5DE4 != null) {
            Mjvvu5DE4.xqGvceK5x = new ji0(hi0Var, bi0Var, ie0Var, r6Var, hvVar, hvVar2, hvVar3, hvVar4, i, 1);
        }
    }
}
