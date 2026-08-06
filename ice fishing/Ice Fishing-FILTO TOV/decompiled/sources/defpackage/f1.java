package defpackage;

import android.graphics.Typeface;
import android.os.LocaleList;
import android.text.Layout;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.BackgroundColorSpan;
import android.text.style.LeadingMarginSpan;
import android.text.style.ScaleXSpan;
import java.text.BreakIterator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.PriorityQueue;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class f1 implements wn0 {
    public final r1 AvO7iQsrTN;
    public final int E7jCp8Ls;
    public final el EljAMC1QTz;
    public final String GWasM1elztuh;
    public f4 JFJ3QoxA;
    public final yt OOA6hdeuvCS;
    public final List X1lG3V04pd;
    public final y81 Yi7zF1RB1;
    public final CharSequence encWxUiV2;
    public final u50 mOu10nynGul;
    public final boolean rQPn8YBR;
    public final List xqGvceK5x;

    /* JADX WARN: Code restructure failed: missing block: B:156:0x04b7, code lost:
    
        if ((r3.Yi7zF1RB1.X1lG3V04pd & 1095216660480L) == 0) goto L505;
     */
    /* JADX WARN: Code restructure failed: missing block: B:516:0x009b, code lost:
    
        if (r7 == 1) goto L17;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x049c  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x04c1  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x04d8  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x04e6  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x04f0  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x058e  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x063d  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x066b  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x06b5  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x078f  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:302:0x08f6  */
    /* JADX WARN: Removed duplicated region for block: B:331:0x0968  */
    /* JADX WARN: Removed duplicated region for block: B:339:0x0992 A[LOOP:7: B:338:0x0990->B:339:0x0992, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:343:0x09a3  */
    /* JADX WARN: Removed duplicated region for block: B:354:0x06ec  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:395:0x0519  */
    /* JADX WARN: Removed duplicated region for block: B:398:0x0529  */
    /* JADX WARN: Removed duplicated region for block: B:405:0x055e  */
    /* JADX WARN: Removed duplicated region for block: B:408:0x0567  */
    /* JADX WARN: Removed duplicated region for block: B:410:0x056a  */
    /* JADX WARN: Removed duplicated region for block: B:411:0x0561  */
    /* JADX WARN: Removed duplicated region for block: B:420:0x04c4  */
    /* JADX WARN: Removed duplicated region for block: B:459:0x02dd  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x01ee  */
    /* JADX WARN: Removed duplicated region for block: B:461:0x02e4  */
    /* JADX WARN: Removed duplicated region for block: B:463:0x02e7  */
    /* JADX WARN: Removed duplicated region for block: B:464:0x02e0  */
    /* JADX WARN: Removed duplicated region for block: B:465:0x02d8  */
    /* JADX WARN: Removed duplicated region for block: B:471:0x027e  */
    /* JADX WARN: Removed duplicated region for block: B:474:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:477:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:480:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:484:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:486:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:487:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:488:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:489:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:492:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:493:0x0101 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:495:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x01fb  */
    /* JADX WARN: Removed duplicated region for block: B:500:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x024f  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x028b  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x02af  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x02bd  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x02cc A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x030d  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0351  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x00ab  */
    /* JADX WARN: Type inference failed for: r10v12, types: [java.lang.CharSequence, java.lang.String] */
    /* JADX WARN: Type inference failed for: r8v10, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v12, types: [android.text.Spannable, android.text.Spanned, java.lang.CharSequence, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v13, types: [android.text.Spannable] */
    /* JADX WARN: Type inference failed for: r8v14 */
    /* JADX WARN: Type inference failed for: r8v15, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v24, types: [android.text.Spannable] */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9, types: [java.lang.CharSequence] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public f1(String str, y81 y81Var, List list, List list2, yt ytVar, el elVar) {
        boolean booleanValue;
        Locale locale;
        int i;
        h4 h4Var;
        int i2;
        w41 w41Var;
        int size;
        int i3;
        Object obj;
        String str2;
        gb0 gb0Var;
        e81 e81Var;
        long j;
        long Yi7zF1RB1;
        o71 o71Var;
        h4 h4Var2;
        tb1 Yi7zF1RB12;
        Typeface typeface;
        w41 w41Var2;
        ?? r10;
        y81 y81Var2;
        boolean z;
        Class<rb1> cls;
        float f;
        Class<rb1> cls2;
        Spannable spannable;
        String str3;
        eq0 eq0Var;
        long j2;
        float eUH21U3apd;
        int length;
        f81 f81Var;
        ArrayList arrayList;
        int size2;
        int i4;
        el elVar2;
        int i5;
        ArrayList arrayList2;
        w41 w41Var3;
        int i6;
        int size3;
        boolean z2;
        int i7;
        List list3;
        f81 f81Var2;
        int size4;
        int i8;
        int i9;
        int i10;
        List list4;
        boolean z3;
        el elVar3;
        int i11;
        int i12;
        bq0 bq0Var;
        String str4;
        String str5;
        int i13;
        pc1 pc1Var;
        String str6;
        Class<rb1> cls3;
        int i14;
        rb1[] rb1VarArr;
        bq0 bq0Var2;
        this.GWasM1elztuh = str;
        this.Yi7zF1RB1 = y81Var;
        this.X1lG3V04pd = list;
        this.xqGvceK5x = list2;
        this.OOA6hdeuvCS = ytVar;
        this.EljAMC1QTz = elVar;
        float Yi7zF1RB13 = elVar.Yi7zF1RB1();
        r1 r1Var = new r1(1);
        ((TextPaint) r1Var).density = Yi7zF1RB13;
        r1Var.Yi7zF1RB1 = a81.Yi7zF1RB1;
        r1Var.X1lG3V04pd = 3;
        r1Var.xqGvceK5x = x11.xqGvceK5x;
        this.AvO7iQsrTN = r1Var;
        if (n30.mOu10nynGul(y81Var)) {
            j6IIN2O8eOU j6iin2o8eou = mp.GWasM1elztuh;
            j6IIN2O8eOU j6iin2o8eou2 = mp.GWasM1elztuh;
            m51 m51Var = (m51) j6iin2o8eou2.EljAMC1QTz;
            if (m51Var == null) {
                if (gp.rQPn8YBR != null) {
                    m51Var = j6iin2o8eou2.encWxUiV2();
                    j6iin2o8eou2.EljAMC1QTz = m51Var;
                } else {
                    m51Var = p.xqGvceK5x;
                }
            }
            booleanValue = ((Boolean) m51Var.getValue()).booleanValue();
        } else {
            booleanValue = false;
        }
        this.rQPn8YBR = booleanValue;
        int i15 = y81Var.Yi7zF1RB1.Yi7zF1RB1;
        gb0 gb0Var2 = y81Var.GWasM1elztuh.rQPn8YBR;
        int i16 = 5;
        if (i15 != 4) {
            if (i15 != 5) {
                if (i15 == 1) {
                    i = 0;
                } else if (i15 == 2) {
                    i = 1;
                } else {
                    if (i15 != 3 && i15 != 0) {
                        o4.jivtDDk9H("Invalid TextDirection.");
                        throw null;
                    }
                    int layoutDirectionFromLocale = TextUtils.getLayoutDirectionFromLocale((gb0Var2 == null || (locale = ((fb0) gb0Var2.OOA6hdeuvCS.get(0)).GWasM1elztuh) == null) ? Locale.getDefault() : locale);
                    if (layoutDirectionFromLocale != 0) {
                    }
                }
                this.E7jCp8Ls = i;
                h4Var = new h4(i16, this);
                q81 q81Var = y81Var.Yi7zF1RB1.mOu10nynGul;
                q81Var = q81Var == null ? q81.X1lG3V04pd : q81Var;
                r1Var.setFlags(q81Var.Yi7zF1RB1 ? r1Var.getFlags() | 128 : r1Var.getFlags() & (-129));
                i2 = q81Var.GWasM1elztuh;
                if (i2 == 1) {
                    r1Var.setFlags(r1Var.getFlags() | 64);
                    r1Var.setHinting(0);
                } else if (i2 == 2) {
                    r1Var.getFlags();
                    r1Var.setHinting(1);
                } else if (i2 == 3) {
                    r1Var.getFlags();
                    r1Var.setHinting(0);
                } else {
                    r1Var.getFlags();
                }
                w41Var = y81Var.GWasM1elztuh;
                size = list.size();
                i3 = 0;
                while (true) {
                    if (i3 >= size) {
                        obj = null;
                        break;
                    }
                    obj = list.get(i3);
                    if (((t3) obj).GWasM1elztuh instanceof w41) {
                        break;
                    } else {
                        i3++;
                    }
                }
                boolean z4 = obj != null;
                long j3 = w41Var.Yi7zF1RB1;
                str2 = w41Var.AvO7iQsrTN;
                gb0Var = w41Var.rQPn8YBR;
                d81 d81Var = w41Var.GWasM1elztuh;
                e81Var = w41Var.JFJ3QoxA;
                j = w41Var.encWxUiV2;
                Yi7zF1RB1 = a91.Yi7zF1RB1(j3);
                if (b91.GWasM1elztuh(Yi7zF1RB1, 4294967296L)) {
                    r1Var.setTextSize(elVar.MItybXapHX(j3));
                } else if (b91.GWasM1elztuh(Yi7zF1RB1, 8589934592L)) {
                    r1Var.setTextSize(a91.X1lG3V04pd(j3) * r1Var.getTextSize());
                }
                o71Var = w41Var.EljAMC1QTz;
                if (o71Var != null && w41Var.xqGvceK5x == null && w41Var.X1lG3V04pd == null) {
                    h4Var2 = h4Var;
                } else {
                    ou ouVar = w41Var.X1lG3V04pd;
                    ouVar = ouVar == null ? ou.AvO7iQsrTN : ouVar;
                    mu muVar = w41Var.xqGvceK5x;
                    int i17 = muVar != null ? muVar.GWasM1elztuh : 0;
                    nu nuVar = w41Var.OOA6hdeuvCS;
                    int i18 = nuVar != null ? nuVar.GWasM1elztuh : 65535;
                    h4Var2 = h4Var;
                    f1 f1Var = (f1) h4Var2.EljAMC1QTz;
                    Yi7zF1RB12 = ((zt) f1Var.OOA6hdeuvCS).Yi7zF1RB1(o71Var, ouVar, i17, i18);
                    if (Yi7zF1RB12 instanceof tb1) {
                        Object obj2 = Yi7zF1RB12.OOA6hdeuvCS;
                        obj2.getClass();
                        typeface = (Typeface) obj2;
                    } else {
                        f4 f4Var = new f4(Yi7zF1RB12, f1Var.JFJ3QoxA);
                        f1Var.JFJ3QoxA = f4Var;
                        Object obj3 = f4Var.xqGvceK5x;
                        obj3.getClass();
                        typeface = (Typeface) obj3;
                    }
                    r1Var.setTypeface(typeface);
                }
                if (gb0Var != null) {
                    gb0 gb0Var3 = gb0.AvO7iQsrTN;
                    if (!gb0Var.equals(n4.JFJ3QoxA())) {
                        ArrayList arrayList3 = new ArrayList(sb.dcDmLGVhzWm(gb0Var, 10));
                        Iterator it = gb0Var.OOA6hdeuvCS.iterator();
                        while (it.hasNext()) {
                            arrayList3.add(((fb0) it.next()).GWasM1elztuh);
                        }
                        Locale[] localeArr = (Locale[]) arrayList3.toArray(new Locale[0]);
                        r1Var.setTextLocales(new LocaleList((Locale[]) Arrays.copyOf(localeArr, localeArr.length)));
                    }
                }
                if (str2 != null && !str2.equals("")) {
                    r1Var.setFontFeatureSettings(str2);
                }
                if (e81Var != null && !e81Var.equals(e81.X1lG3V04pd)) {
                    r1Var.setTextScaleX(r1Var.getTextScaleX() * e81Var.GWasM1elztuh);
                    r1Var.setTextSkewX(r1Var.getTextSkewX() + e81Var.Yi7zF1RB1);
                }
                r1Var.xqGvceK5x(d81Var.xqGvceK5x());
                r1Var.X1lG3V04pd(d81Var.AvO7iQsrTN(), 9205357640488583168L, d81Var.Yi7zF1RB1());
                r1Var.EljAMC1QTz(w41Var.uFEq9NpZ);
                r1Var.AvO7iQsrTN(w41Var.XnEVoBF0td1l);
                r1Var.OOA6hdeuvCS(w41Var.iwATDS1i01k);
                if (!b91.GWasM1elztuh(a91.Yi7zF1RB1(j), 4294967296L) && a91.X1lG3V04pd(j) != 0.0f) {
                    float textScaleX = r1Var.getTextScaleX() * r1Var.getTextSize();
                    float MItybXapHX = elVar.MItybXapHX(j);
                    if (textScaleX != 0.0f) {
                        r1Var.setLetterSpacing(MItybXapHX / textScaleX);
                    }
                } else if (b91.GWasM1elztuh(a91.Yi7zF1RB1(j), 8589934592L)) {
                    r1Var.setLetterSpacing(a91.X1lG3V04pd(j));
                }
                long j4 = w41Var.E7jCp8Ls;
                i6 i6Var = w41Var.mOu10nynGul;
                boolean z5 = (z4 || !b91.GWasM1elztuh(a91.Yi7zF1RB1(j), 4294967296L) || a91.X1lG3V04pd(j) == 0.0f) ? false : true;
                long j5 = yb.AvO7iQsrTN;
                boolean z6 = yb.X1lG3V04pd(j4, j5) && !yb.X1lG3V04pd(j4, yb.EljAMC1QTz);
                boolean z7 = i6Var == null && Float.compare(i6Var.GWasM1elztuh, 0.0f) != 0;
                w41Var2 = (!z5 || z6 || z7) ? new w41(0L, 0L, (ou) null, (mu) null, (nu) null, (o71) null, (String) null, z5 ? j : a91.X1lG3V04pd, z7 ? i6Var : null, (e81) null, (gb0) null, z6 ? j4 : j5, (a81) null, (x11) null, 63103) : null;
                List list5 = this.X1lG3V04pd;
                if (w41Var2 != null) {
                    int size5 = list5.size() + 1;
                    ArrayList arrayList4 = new ArrayList(size5);
                    int i19 = 0;
                    while (i19 < size5) {
                        arrayList4.add(i19 == 0 ? new t3(0, this.GWasM1elztuh.length(), w41Var2) : (t3) this.X1lG3V04pd.get(i19 - 1));
                        i19++;
                    }
                    list5 = arrayList4;
                }
                r10 = this.GWasM1elztuh;
                float textSize = this.AvO7iQsrTN.getTextSize();
                y81Var2 = this.Yi7zF1RB1;
                List list6 = this.xqGvceK5x;
                el elVar4 = this.EljAMC1QTz;
                z = this.rQPn8YBR;
                d1 d1Var = e1.GWasM1elztuh;
                cls = rb1.class;
                if (z || gp.rQPn8YBR == null) {
                    f = 0.0f;
                    cls2 = cls;
                    spannable = r10;
                    str3 = r10;
                } else {
                    eq0 eq0Var2 = y81Var2.X1lG3V04pd;
                    rp rpVar = (eq0Var2 == null || (bq0Var2 = eq0Var2.GWasM1elztuh) == null) ? null : new rp(bq0Var2.Yi7zF1RB1);
                    boolean z8 = rpVar != null && rpVar.GWasM1elztuh == 2;
                    gp GWasM1elztuh = gp.GWasM1elztuh();
                    int length2 = r10.length();
                    if (!(GWasM1elztuh.Yi7zF1RB1() == 1)) {
                        o4.jivtDDk9H("Not initialized yet");
                        throw null;
                    }
                    if (length2 < 0) {
                        o4.mE4lRynR("end cannot be negative");
                        throw null;
                    }
                    if (!(length2 >= 0)) {
                        o4.mE4lRynR("start should be <= than end");
                        throw null;
                    }
                    if (!(r10.length() >= 0)) {
                        o4.mE4lRynR("start should be < than charSequence length");
                        throw null;
                    }
                    if (!(length2 <= r10.length())) {
                        o4.mE4lRynR("end should be < than charSequence length");
                        throw null;
                    }
                    if (r10.length() == 0 || length2 == 0) {
                        f = 0.0f;
                        cls2 = cls;
                        str4 = r10;
                    } else {
                        boolean z9 = z8;
                        f4 f4Var2 = GWasM1elztuh.OOA6hdeuvCS.Yi7zF1RB1;
                        f4Var2.getClass();
                        if (r10 instanceof Spannable) {
                            pc1Var = new pc1((Spannable) r10);
                            f = 0.0f;
                            i13 = 0;
                        } else {
                            if (r10 instanceof Spanned) {
                                f = 0.0f;
                                if (((Spanned) r10).nextSpanTransition(-1, length2 + 1, cls) <= length2) {
                                    pc1Var = new pc1();
                                    i13 = 0;
                                    pc1Var.OOA6hdeuvCS = false;
                                    pc1Var.EljAMC1QTz = new SpannableString(r10);
                                }
                            } else {
                                f = 0.0f;
                            }
                            i13 = 0;
                            pc1Var = null;
                        }
                        if (pc1Var == null || (rb1VarArr = (rb1[]) pc1Var.EljAMC1QTz.getSpans(i13, length2, cls)) == null || rb1VarArr.length <= 0) {
                            str6 = r10;
                            cls3 = cls;
                            i14 = 0;
                        } else {
                            int length3 = rb1VarArr.length;
                            str6 = r10;
                            int i20 = 0;
                            int i21 = 0;
                            while (i20 < length3) {
                                int i22 = i20;
                                rb1 rb1Var = rb1VarArr[i22];
                                int i23 = length3;
                                int spanStart = pc1Var.EljAMC1QTz.getSpanStart(rb1Var);
                                Class<rb1> cls4 = cls;
                                int spanEnd = pc1Var.EljAMC1QTz.getSpanEnd(rb1Var);
                                if (spanStart != length2) {
                                    pc1Var.removeSpan(rb1Var);
                                }
                                i21 = Math.min(spanStart, i21);
                                length2 = Math.max(spanEnd, length2);
                                i20 = i22 + 1;
                                cls = cls4;
                                length3 = i23;
                            }
                            cls3 = cls;
                            i14 = i21;
                        }
                        if (i14 == length2 || i14 >= str6.length()) {
                            cls2 = cls3;
                            str4 = str6;
                        } else {
                            cls2 = cls3;
                            String str7 = str6;
                            pc1 pc1Var2 = (pc1) f4Var2.uFEq9NpZ(str7, i14, length2, Integer.MAX_VALUE, z9, new d(5, pc1Var, (k61) f4Var2.Yi7zF1RB1));
                            str4 = str7;
                            if (pc1Var2 != null) {
                                spannable = pc1Var2.EljAMC1QTz;
                                str5 = str7;
                                spannable.getClass();
                                str3 = str5;
                            }
                        }
                    }
                    spannable = str4;
                    str5 = str4;
                    spannable.getClass();
                    str3 = str5;
                }
                long j6 = (!list5.isEmpty() && list6.isEmpty() && o30.rQPn8YBR(y81Var2.Yi7zF1RB1.xqGvceK5x, f81.X1lG3V04pd)) ? 0L : 0L;
                spannable = spannable instanceof Spannable ? (Spannable) spannable : new SpannableString(spannable);
                if (o30.rQPn8YBR(y81Var2.GWasM1elztuh.XnEVoBF0td1l, a81.X1lG3V04pd)) {
                    spannable.setSpan(e1.GWasM1elztuh, 0, str3.length(), 33);
                }
                eq0Var = y81Var2.X1lG3V04pd;
                if ((eq0Var != null || (bq0Var = eq0Var.GWasM1elztuh) == null) ? false : bq0Var.GWasM1elztuh) {
                    yn0 yn0Var = y81Var2.Yi7zF1RB1;
                    if (yn0Var.EljAMC1QTz == null) {
                        float eUH21U3apd2 = d70.eUH21U3apd(yn0Var.X1lG3V04pd, textSize, elVar4);
                        if (!Float.isNaN(eUH21U3apd2)) {
                            spannable.setSpan(new fa0(eUH21U3apd2), 0, spannable.length(), 33);
                        }
                        j2 = 1095216660480L;
                        f81Var = y81Var2.Yi7zF1RB1.xqGvceK5x;
                        if (f81Var != null) {
                            long j7 = f81Var.GWasM1elztuh;
                            long j8 = f81Var.Yi7zF1RB1;
                            if ((!a91.GWasM1elztuh(j7, o50.WRKkgoJXwDn(0)) || !a91.GWasM1elztuh(j8, o50.WRKkgoJXwDn(0))) && (j7 & j2) != j6 && (j8 & j2) != j6) {
                                long Yi7zF1RB14 = a91.Yi7zF1RB1(j7);
                                float MItybXapHX2 = b91.GWasM1elztuh(Yi7zF1RB14, 4294967296L) ? elVar4.MItybXapHX(j7) : b91.GWasM1elztuh(Yi7zF1RB14, 8589934592L) ? a91.X1lG3V04pd(j7) * textSize : f;
                                long Yi7zF1RB15 = a91.Yi7zF1RB1(j8);
                                spannable.setSpan(new LeadingMarginSpan.Standard((int) Math.ceil(MItybXapHX2), (int) Math.ceil(b91.GWasM1elztuh(Yi7zF1RB15, 4294967296L) ? elVar4.MItybXapHX(j8) : b91.GWasM1elztuh(Yi7zF1RB15, 8589934592L) ? textSize * a91.X1lG3V04pd(j8) : f)), 0, spannable.length(), 33);
                            }
                        }
                        arrayList = new ArrayList(list5.size());
                        size2 = list5.size();
                        for (i4 = 0; i4 < size2; i4++) {
                            t3 t3Var = (t3) list5.get(i4);
                            Object obj4 = t3Var.GWasM1elztuh;
                            if (obj4 instanceof w41) {
                                w41 w41Var4 = (w41) obj4;
                                if (w41Var4.EljAMC1QTz != null || w41Var4.xqGvceK5x != null || w41Var4.X1lG3V04pd != null || ((w41) obj4).OOA6hdeuvCS != null) {
                                    arrayList.add(t3Var);
                                }
                            }
                        }
                        w41 w41Var5 = y81Var2.GWasM1elztuh;
                        o71 o71Var2 = w41Var5.EljAMC1QTz;
                        w41 w41Var6 = (o71Var2 != null && w41Var5.xqGvceK5x == null && w41Var5.X1lG3V04pd == null && w41Var5.OOA6hdeuvCS == null) ? null : new w41(0L, 0L, w41Var5.X1lG3V04pd, w41Var5.xqGvceK5x, w41Var5.OOA6hdeuvCS, o71Var2, (String) null, 0L, (i6) null, (e81) null, (gb0) null, 0L, (a81) null, (x11) null, 65475);
                        xz xzVar = new xz(2, spannable, h4Var2);
                        if (arrayList.size() > 1) {
                            if (!arrayList.isEmpty()) {
                                w41 w41Var7 = (w41) ((t3) arrayList.get(0)).GWasM1elztuh;
                                xzVar.X1lG3V04pd(w41Var6 != null ? w41Var6.X1lG3V04pd(w41Var7) : w41Var7, Integer.valueOf(((t3) arrayList.get(0)).Yi7zF1RB1), Integer.valueOf(((t3) arrayList.get(0)).X1lG3V04pd));
                            }
                            elVar2 = elVar4;
                        } else {
                            int size6 = arrayList.size();
                            int i24 = size6 * 2;
                            int[] iArr = new int[i24];
                            int size7 = arrayList.size();
                            int i25 = 0;
                            while (i25 < size7) {
                                t3 t3Var2 = (t3) arrayList.get(i25);
                                iArr[i25] = t3Var2.Yi7zF1RB1;
                                iArr[i25 + size6] = t3Var2.X1lG3V04pd;
                                i25++;
                                elVar4 = elVar4;
                            }
                            elVar2 = elVar4;
                            if (i24 > 1) {
                                Arrays.sort(iArr);
                            }
                            if (i24 == 0) {
                                o4.AvO7iQsrTN("Array is empty.");
                                throw null;
                            }
                            int i26 = iArr[0];
                            int i27 = 0;
                            while (i27 < i24) {
                                int i28 = iArr[i27];
                                if (i28 == i26) {
                                    arrayList2 = arrayList;
                                    i5 = i27;
                                    w41Var3 = w41Var6;
                                    i6 = i24;
                                } else {
                                    int size8 = arrayList.size();
                                    i5 = i27;
                                    w41 w41Var8 = w41Var6;
                                    int i29 = 0;
                                    while (i29 < size8) {
                                        ArrayList arrayList5 = arrayList;
                                        t3 t3Var3 = (t3) arrayList.get(i29);
                                        w41 w41Var9 = w41Var6;
                                        int i30 = t3Var3.Yi7zF1RB1;
                                        int i31 = i24;
                                        int i32 = t3Var3.X1lG3V04pd;
                                        if (i30 != i32 && v3.GWasM1elztuh(i26, i28, i30, i32)) {
                                            w41 w41Var10 = (w41) t3Var3.GWasM1elztuh;
                                            w41Var8 = w41Var8 != null ? w41Var8.X1lG3V04pd(w41Var10) : w41Var10;
                                        }
                                        i29++;
                                        arrayList = arrayList5;
                                        w41Var6 = w41Var9;
                                        i24 = i31;
                                    }
                                    arrayList2 = arrayList;
                                    w41Var3 = w41Var6;
                                    i6 = i24;
                                    if (w41Var8 != null) {
                                        xzVar.X1lG3V04pd(w41Var8, Integer.valueOf(i26), Integer.valueOf(i28));
                                    }
                                    i26 = i28;
                                }
                                i27 = i5 + 1;
                                arrayList = arrayList2;
                                w41Var6 = w41Var3;
                                i24 = i6;
                            }
                        }
                        size3 = list5.size();
                        z2 = false;
                        i7 = 0;
                        while (i7 < size3) {
                            t3 t3Var4 = (t3) list5.get(i7);
                            Object obj5 = t3Var4.GWasM1elztuh;
                            if (obj5 instanceof w41) {
                                int i33 = t3Var4.Yi7zF1RB1;
                                int i34 = t3Var4.X1lG3V04pd;
                                if (i33 >= 0 && i33 < spannable.length() && i34 > i33 && i34 <= spannable.length()) {
                                    w41 w41Var11 = (w41) obj5;
                                    i6 i6Var2 = w41Var11.mOu10nynGul;
                                    d81 d81Var2 = w41Var11.GWasM1elztuh;
                                    if (i6Var2 != null) {
                                        spannable.setSpan(new j6(i6Var2.GWasM1elztuh, 0), i33, i34, 33);
                                    }
                                    d70.DmJncFq5(spannable, d81Var2.xqGvceK5x(), i33, i34);
                                    qj AvO7iQsrTN = d81Var2.AvO7iQsrTN();
                                    float Yi7zF1RB16 = d81Var2.Yi7zF1RB1();
                                    if (AvO7iQsrTN != null) {
                                        if (AvO7iQsrTN instanceof t41) {
                                            d70.DmJncFq5(spannable, ((t41) AvO7iQsrTN).Mjvvu5DE, i33, i34);
                                        } else {
                                            spannable.setSpan(new w11((v11) AvO7iQsrTN, Yi7zF1RB16), i33, i34, 33);
                                        }
                                    }
                                    a81 a81Var = w41Var11.XnEVoBF0td1l;
                                    if (a81Var != null) {
                                        int i35 = a81Var.GWasM1elztuh;
                                        b81 b81Var = new b81((i35 | 1) == i35, (i35 | 2) == i35);
                                        i11 = 33;
                                        spannable.setSpan(b81Var, i33, i34, 33);
                                    } else {
                                        i11 = 33;
                                    }
                                    d70.HFYAaqMd6(spannable, w41Var11.Yi7zF1RB1, elVar2, i33, i34);
                                    el elVar5 = elVar2;
                                    String str8 = w41Var11.AvO7iQsrTN;
                                    if (str8 != null) {
                                        i10 = size3;
                                        spannable.setSpan(new bu(0, str8), i33, i34, i11);
                                    } else {
                                        i10 = size3;
                                    }
                                    e81 e81Var2 = w41Var11.JFJ3QoxA;
                                    if (e81Var2 != null) {
                                        spannable.setSpan(new ScaleXSpan(e81Var2.GWasM1elztuh), i33, i34, i11);
                                        spannable.setSpan(new j6(e81Var2.Yi7zF1RB1, 1), i33, i34, i11);
                                    }
                                    d70.rezfBrjOrqK(spannable, w41Var11.rQPn8YBR, i33, i34);
                                    long j9 = w41Var11.E7jCp8Ls;
                                    if (j9 != 16) {
                                        spannable.setSpan(new BackgroundColorSpan(ki1.HFYAaqMd6(j9)), i33, i34, 33);
                                    }
                                    x11 x11Var = w41Var11.uFEq9NpZ;
                                    if (x11Var != null) {
                                        long j10 = x11Var.Yi7zF1RB1;
                                        int HFYAaqMd6 = ki1.HFYAaqMd6(x11Var.GWasM1elztuh);
                                        list4 = list6;
                                        z3 = z2;
                                        float intBitsToFloat = Float.intBitsToFloat((int) (j10 >> 32));
                                        elVar3 = elVar5;
                                        float intBitsToFloat2 = Float.intBitsToFloat((int) (j10 & 4294967295L));
                                        float f2 = x11Var.X1lG3V04pd;
                                        y11 y11Var = new y11(HFYAaqMd6, intBitsToFloat, intBitsToFloat2, f2 == f ? Float.MIN_VALUE : f2);
                                        i12 = 33;
                                        spannable.setSpan(y11Var, i33, i34, 33);
                                    } else {
                                        list4 = list6;
                                        z3 = z2;
                                        elVar3 = elVar5;
                                        i12 = 33;
                                    }
                                    qj qjVar = w41Var11.iwATDS1i01k;
                                    if (qjVar != null) {
                                        spannable.setSpan(new io(qjVar), i33, i34, i12);
                                    }
                                    if (b91.GWasM1elztuh(a91.Yi7zF1RB1(w41Var11.encWxUiV2), 4294967296L) || b91.GWasM1elztuh(a91.Yi7zF1RB1(w41Var11.encWxUiV2), 8589934592L)) {
                                        z2 = true;
                                        i7++;
                                        size3 = i10;
                                        elVar2 = elVar3;
                                        list6 = list4;
                                    }
                                    z2 = z3;
                                    i7++;
                                    size3 = i10;
                                    elVar2 = elVar3;
                                    list6 = list4;
                                }
                            }
                            i10 = size3;
                            list4 = list6;
                            z3 = z2;
                            elVar3 = elVar2;
                            z2 = z3;
                            i7++;
                            size3 = i10;
                            elVar2 = elVar3;
                            list6 = list4;
                        }
                        list3 = list6;
                        el elVar6 = elVar2;
                        if (z2) {
                            int size9 = list5.size();
                            int i36 = 0;
                            while (i36 < size9) {
                                t3 t3Var5 = (t3) list5.get(i36);
                                s3 s3Var = (s3) t3Var5.GWasM1elztuh;
                                if (s3Var instanceof w41) {
                                    int i37 = t3Var5.Yi7zF1RB1;
                                    int i38 = t3Var5.X1lG3V04pd;
                                    if (i37 >= 0 && i37 < spannable.length() && i38 > i37 && i38 <= spannable.length()) {
                                        long j11 = ((w41) s3Var).encWxUiV2;
                                        long Yi7zF1RB17 = a91.Yi7zF1RB1(j11);
                                        i9 = i36;
                                        Object f90Var = b91.GWasM1elztuh(Yi7zF1RB17, 4294967296L) ? new f90(elVar6.MItybXapHX(j11)) : b91.GWasM1elztuh(Yi7zF1RB17, 8589934592L) ? new e90(a91.X1lG3V04pd(j11)) : null;
                                        if (f90Var != null) {
                                            spannable.setSpan(f90Var, i37, i38, 33);
                                        }
                                        i36 = i9 + 1;
                                    }
                                }
                                i9 = i36;
                                i36 = i9 + 1;
                            }
                        }
                        f81Var2 = y81Var2.Yi7zF1RB1.xqGvceK5x;
                        if (f81Var2 != null) {
                            long j12 = f81Var2.GWasM1elztuh;
                            long Yi7zF1RB18 = a91.Yi7zF1RB1(j12);
                            if (b91.GWasM1elztuh(Yi7zF1RB18, 4294967296L)) {
                                elVar6.MItybXapHX(j12);
                            } else if (b91.GWasM1elztuh(Yi7zF1RB18, 8589934592L)) {
                                a91.X1lG3V04pd(j12);
                            }
                        }
                        size4 = list5.size();
                        for (i8 = 0; i8 < size4; i8++) {
                            Object obj6 = ((t3) list5.get(i8)).GWasM1elztuh;
                        }
                        if (list3.size() > 0) {
                            t3 t3Var6 = (t3) list3.get(0);
                            if (t3Var6.GWasM1elztuh != null) {
                                o4.YmKjaVtbfp5Z();
                                throw null;
                            }
                            for (Object obj7 : spannable.getSpans(t3Var6.Yi7zF1RB1, t3Var6.X1lG3V04pd, cls2)) {
                                spannable.removeSpan((rb1) obj7);
                            }
                            throw null;
                        }
                        this.encWxUiV2 = spannable;
                        this.mOu10nynGul = new u50(spannable, this.AvO7iQsrTN, this.E7jCp8Ls);
                    }
                }
                yn0 yn0Var2 = y81Var2.Yi7zF1RB1;
                ja0 ja0Var = yn0Var2.EljAMC1QTz;
                ja0Var = ja0Var == null ? ja0.xqGvceK5x : ja0Var;
                j2 = 1095216660480L;
                eUH21U3apd = d70.eUH21U3apd(yn0Var2.X1lG3V04pd, textSize, elVar4);
                if (!Float.isNaN(eUH21U3apd)) {
                    if (spannable.length() != 0) {
                        if (spannable.length() == 0) {
                            o4.AvO7iQsrTN("Char sequence is empty.");
                            throw null;
                        }
                        if (spannable.charAt(spannable.length() - 1) != '\n') {
                            length = spannable.length();
                            int i39 = length;
                            int i40 = ja0Var.Yi7zF1RB1;
                            spannable.setSpan(new ka0(eUH21U3apd, i39, (i40 & 1) <= 0, (i40 & 16) <= 0, ja0Var.GWasM1elztuh, ja0Var.X1lG3V04pd), 0, spannable.length(), 33);
                        }
                    }
                    length = spannable.length() + 1;
                    int i392 = length;
                    int i402 = ja0Var.Yi7zF1RB1;
                    spannable.setSpan(new ka0(eUH21U3apd, i392, (i402 & 1) <= 0, (i402 & 16) <= 0, ja0Var.GWasM1elztuh, ja0Var.X1lG3V04pd), 0, spannable.length(), 33);
                }
                f81Var = y81Var2.Yi7zF1RB1.xqGvceK5x;
                if (f81Var != null) {
                }
                arrayList = new ArrayList(list5.size());
                size2 = list5.size();
                while (i4 < size2) {
                }
                w41 w41Var52 = y81Var2.GWasM1elztuh;
                o71 o71Var22 = w41Var52.EljAMC1QTz;
                if (o71Var22 != null) {
                }
                xz xzVar2 = new xz(2, spannable, h4Var2);
                if (arrayList.size() > 1) {
                }
                size3 = list5.size();
                z2 = false;
                i7 = 0;
                while (i7 < size3) {
                }
                list3 = list6;
                el elVar62 = elVar2;
                if (z2) {
                }
                f81Var2 = y81Var2.Yi7zF1RB1.xqGvceK5x;
                if (f81Var2 != null) {
                }
                size4 = list5.size();
                while (i8 < size4) {
                }
                if (list3.size() > 0) {
                }
                this.encWxUiV2 = spannable;
                this.mOu10nynGul = new u50(spannable, this.AvO7iQsrTN, this.E7jCp8Ls);
            }
            i = 3;
            this.E7jCp8Ls = i;
            h4Var = new h4(i16, this);
            q81 q81Var2 = y81Var.Yi7zF1RB1.mOu10nynGul;
            if (q81Var2 == null) {
            }
            r1Var.setFlags(q81Var2.Yi7zF1RB1 ? r1Var.getFlags() | 128 : r1Var.getFlags() & (-129));
            i2 = q81Var2.GWasM1elztuh;
            if (i2 == 1) {
            }
            w41Var = y81Var.GWasM1elztuh;
            size = list.size();
            i3 = 0;
            while (true) {
                if (i3 >= size) {
                }
                i3++;
            }
            if (obj != null) {
            }
            long j32 = w41Var.Yi7zF1RB1;
            str2 = w41Var.AvO7iQsrTN;
            gb0Var = w41Var.rQPn8YBR;
            d81 d81Var3 = w41Var.GWasM1elztuh;
            e81Var = w41Var.JFJ3QoxA;
            j = w41Var.encWxUiV2;
            Yi7zF1RB1 = a91.Yi7zF1RB1(j32);
            if (b91.GWasM1elztuh(Yi7zF1RB1, 4294967296L)) {
            }
            o71Var = w41Var.EljAMC1QTz;
            if (o71Var != null) {
            }
            ou ouVar2 = w41Var.X1lG3V04pd;
            if (ouVar2 == null) {
            }
            mu muVar2 = w41Var.xqGvceK5x;
            if (muVar2 != null) {
            }
            nu nuVar2 = w41Var.OOA6hdeuvCS;
            if (nuVar2 != null) {
            }
            h4Var2 = h4Var;
            f1 f1Var2 = (f1) h4Var2.EljAMC1QTz;
            Yi7zF1RB12 = ((zt) f1Var2.OOA6hdeuvCS).Yi7zF1RB1(o71Var, ouVar2, i17, i18);
            if (Yi7zF1RB12 instanceof tb1) {
            }
            r1Var.setTypeface(typeface);
            if (gb0Var != null) {
            }
            if (str2 != null) {
                r1Var.setFontFeatureSettings(str2);
            }
            if (e81Var != null) {
                r1Var.setTextScaleX(r1Var.getTextScaleX() * e81Var.GWasM1elztuh);
                r1Var.setTextSkewX(r1Var.getTextSkewX() + e81Var.Yi7zF1RB1);
            }
            r1Var.xqGvceK5x(d81Var3.xqGvceK5x());
            r1Var.X1lG3V04pd(d81Var3.AvO7iQsrTN(), 9205357640488583168L, d81Var3.Yi7zF1RB1());
            r1Var.EljAMC1QTz(w41Var.uFEq9NpZ);
            r1Var.AvO7iQsrTN(w41Var.XnEVoBF0td1l);
            r1Var.OOA6hdeuvCS(w41Var.iwATDS1i01k);
            if (!b91.GWasM1elztuh(a91.Yi7zF1RB1(j), 4294967296L)) {
            }
            if (b91.GWasM1elztuh(a91.Yi7zF1RB1(j), 8589934592L)) {
            }
            long j42 = w41Var.E7jCp8Ls;
            i6 i6Var3 = w41Var.mOu10nynGul;
            if (z4) {
            }
            long j52 = yb.AvO7iQsrTN;
            if (yb.X1lG3V04pd(j42, j52)) {
            }
            if (i6Var3 == null) {
            }
            if (z5) {
            }
            List list52 = this.X1lG3V04pd;
            if (w41Var2 != null) {
            }
            r10 = this.GWasM1elztuh;
            float textSize2 = this.AvO7iQsrTN.getTextSize();
            y81Var2 = this.Yi7zF1RB1;
            List list62 = this.xqGvceK5x;
            el elVar42 = this.EljAMC1QTz;
            z = this.rQPn8YBR;
            d1 d1Var2 = e1.GWasM1elztuh;
            cls = rb1.class;
            if (z) {
            }
            f = 0.0f;
            cls2 = cls;
            spannable = r10;
            str3 = r10;
            if (!list52.isEmpty()) {
            }
            if (spannable instanceof Spannable) {
            }
            if (o30.rQPn8YBR(y81Var2.GWasM1elztuh.XnEVoBF0td1l, a81.X1lG3V04pd)) {
            }
            eq0Var = y81Var2.X1lG3V04pd;
            if ((eq0Var != null || (bq0Var = eq0Var.GWasM1elztuh) == null) ? false : bq0Var.GWasM1elztuh) {
            }
            yn0 yn0Var22 = y81Var2.Yi7zF1RB1;
            ja0 ja0Var2 = yn0Var22.EljAMC1QTz;
            if (ja0Var2 == null) {
            }
            j2 = 1095216660480L;
            eUH21U3apd = d70.eUH21U3apd(yn0Var22.X1lG3V04pd, textSize2, elVar42);
            if (!Float.isNaN(eUH21U3apd)) {
            }
            f81Var = y81Var2.Yi7zF1RB1.xqGvceK5x;
            if (f81Var != null) {
            }
            arrayList = new ArrayList(list52.size());
            size2 = list52.size();
            while (i4 < size2) {
            }
            w41 w41Var522 = y81Var2.GWasM1elztuh;
            o71 o71Var222 = w41Var522.EljAMC1QTz;
            if (o71Var222 != null) {
            }
            xz xzVar22 = new xz(2, spannable, h4Var2);
            if (arrayList.size() > 1) {
            }
            size3 = list52.size();
            z2 = false;
            i7 = 0;
            while (i7 < size3) {
            }
            list3 = list62;
            el elVar622 = elVar2;
            if (z2) {
            }
            f81Var2 = y81Var2.Yi7zF1RB1.xqGvceK5x;
            if (f81Var2 != null) {
            }
            size4 = list52.size();
            while (i8 < size4) {
            }
            if (list3.size() > 0) {
            }
            this.encWxUiV2 = spannable;
            this.mOu10nynGul = new u50(spannable, this.AvO7iQsrTN, this.E7jCp8Ls);
        }
        i = 2;
        this.E7jCp8Ls = i;
        h4Var = new h4(i16, this);
        q81 q81Var22 = y81Var.Yi7zF1RB1.mOu10nynGul;
        if (q81Var22 == null) {
        }
        r1Var.setFlags(q81Var22.Yi7zF1RB1 ? r1Var.getFlags() | 128 : r1Var.getFlags() & (-129));
        i2 = q81Var22.GWasM1elztuh;
        if (i2 == 1) {
        }
        w41Var = y81Var.GWasM1elztuh;
        size = list.size();
        i3 = 0;
        while (true) {
            if (i3 >= size) {
            }
            i3++;
        }
        if (obj != null) {
        }
        long j322 = w41Var.Yi7zF1RB1;
        str2 = w41Var.AvO7iQsrTN;
        gb0Var = w41Var.rQPn8YBR;
        d81 d81Var32 = w41Var.GWasM1elztuh;
        e81Var = w41Var.JFJ3QoxA;
        j = w41Var.encWxUiV2;
        Yi7zF1RB1 = a91.Yi7zF1RB1(j322);
        if (b91.GWasM1elztuh(Yi7zF1RB1, 4294967296L)) {
        }
        o71Var = w41Var.EljAMC1QTz;
        if (o71Var != null) {
        }
        ou ouVar22 = w41Var.X1lG3V04pd;
        if (ouVar22 == null) {
        }
        mu muVar22 = w41Var.xqGvceK5x;
        if (muVar22 != null) {
        }
        nu nuVar22 = w41Var.OOA6hdeuvCS;
        if (nuVar22 != null) {
        }
        h4Var2 = h4Var;
        f1 f1Var22 = (f1) h4Var2.EljAMC1QTz;
        Yi7zF1RB12 = ((zt) f1Var22.OOA6hdeuvCS).Yi7zF1RB1(o71Var, ouVar22, i17, i18);
        if (Yi7zF1RB12 instanceof tb1) {
        }
        r1Var.setTypeface(typeface);
        if (gb0Var != null) {
        }
        if (str2 != null) {
        }
        if (e81Var != null) {
        }
        r1Var.xqGvceK5x(d81Var32.xqGvceK5x());
        r1Var.X1lG3V04pd(d81Var32.AvO7iQsrTN(), 9205357640488583168L, d81Var32.Yi7zF1RB1());
        r1Var.EljAMC1QTz(w41Var.uFEq9NpZ);
        r1Var.AvO7iQsrTN(w41Var.XnEVoBF0td1l);
        r1Var.OOA6hdeuvCS(w41Var.iwATDS1i01k);
        if (!b91.GWasM1elztuh(a91.Yi7zF1RB1(j), 4294967296L)) {
        }
        if (b91.GWasM1elztuh(a91.Yi7zF1RB1(j), 8589934592L)) {
        }
        long j422 = w41Var.E7jCp8Ls;
        i6 i6Var32 = w41Var.mOu10nynGul;
        if (z4) {
        }
        long j522 = yb.AvO7iQsrTN;
        if (yb.X1lG3V04pd(j422, j522)) {
        }
        if (i6Var32 == null) {
        }
        if (z5) {
        }
        List list522 = this.X1lG3V04pd;
        if (w41Var2 != null) {
        }
        r10 = this.GWasM1elztuh;
        float textSize22 = this.AvO7iQsrTN.getTextSize();
        y81Var2 = this.Yi7zF1RB1;
        List list622 = this.xqGvceK5x;
        el elVar422 = this.EljAMC1QTz;
        z = this.rQPn8YBR;
        d1 d1Var22 = e1.GWasM1elztuh;
        cls = rb1.class;
        if (z) {
        }
        f = 0.0f;
        cls2 = cls;
        spannable = r10;
        str3 = r10;
        if (!list522.isEmpty()) {
        }
        if (spannable instanceof Spannable) {
        }
        if (o30.rQPn8YBR(y81Var2.GWasM1elztuh.XnEVoBF0td1l, a81.X1lG3V04pd)) {
        }
        eq0Var = y81Var2.X1lG3V04pd;
        if ((eq0Var != null || (bq0Var = eq0Var.GWasM1elztuh) == null) ? false : bq0Var.GWasM1elztuh) {
        }
        yn0 yn0Var222 = y81Var2.Yi7zF1RB1;
        ja0 ja0Var22 = yn0Var222.EljAMC1QTz;
        if (ja0Var22 == null) {
        }
        j2 = 1095216660480L;
        eUH21U3apd = d70.eUH21U3apd(yn0Var222.X1lG3V04pd, textSize22, elVar422);
        if (!Float.isNaN(eUH21U3apd)) {
        }
        f81Var = y81Var2.Yi7zF1RB1.xqGvceK5x;
        if (f81Var != null) {
        }
        arrayList = new ArrayList(list522.size());
        size2 = list522.size();
        while (i4 < size2) {
        }
        w41 w41Var5222 = y81Var2.GWasM1elztuh;
        o71 o71Var2222 = w41Var5222.EljAMC1QTz;
        if (o71Var2222 != null) {
        }
        xz xzVar222 = new xz(2, spannable, h4Var2);
        if (arrayList.size() > 1) {
        }
        size3 = list522.size();
        z2 = false;
        i7 = 0;
        while (i7 < size3) {
        }
        list3 = list622;
        el elVar6222 = elVar2;
        if (z2) {
        }
        f81Var2 = y81Var2.Yi7zF1RB1.xqGvceK5x;
        if (f81Var2 != null) {
        }
        size4 = list522.size();
        while (i8 < size4) {
        }
        if (list3.size() > 0) {
        }
        this.encWxUiV2 = spannable;
        this.mOu10nynGul = new u50(spannable, this.AvO7iQsrTN, this.E7jCp8Ls);
    }

    @Override // defpackage.wn0
    public final float GWasM1elztuh() {
        u50 u50Var = this.mOu10nynGul;
        float f = u50Var.OOA6hdeuvCS;
        TextPaint textPaint = u50Var.Yi7zF1RB1;
        if (!Float.isNaN(f)) {
            return u50Var.OOA6hdeuvCS;
        }
        BreakIterator lineInstance = BreakIterator.getLineInstance(textPaint.getTextLocale());
        CharSequence charSequence = u50Var.GWasM1elztuh;
        lineInstance.setText(new la(charSequence, charSequence.length()));
        PriorityQueue priorityQueue = new PriorityQueue(10, n30.mOu10nynGul);
        int i = 0;
        for (int next = lineInstance.next(); next != -1; next = lineInstance.next()) {
            if (priorityQueue.size() < 10) {
                priorityQueue.add(new x20(i, next, 1));
            } else {
                x20 x20Var = (x20) priorityQueue.peek();
                if (x20Var != null && x20Var.EljAMC1QTz - x20Var.OOA6hdeuvCS < next - i) {
                    priorityQueue.poll();
                    priorityQueue.add(new x20(i, next, 1));
                }
            }
            i = next;
        }
        float f2 = 0.0f;
        if (!priorityQueue.isEmpty()) {
            Iterator it = priorityQueue.iterator();
            if (!it.hasNext()) {
                o4.E7jCp8Ls();
                return 0.0f;
            }
            x20 x20Var2 = (x20) it.next();
            f2 = Layout.getDesiredWidth(u50Var.Yi7zF1RB1(), x20Var2.OOA6hdeuvCS, x20Var2.EljAMC1QTz, textPaint);
            while (it.hasNext()) {
                x20 x20Var3 = (x20) it.next();
                f2 = Math.max(f2, Layout.getDesiredWidth(u50Var.Yi7zF1RB1(), x20Var3.OOA6hdeuvCS, x20Var3.EljAMC1QTz, textPaint));
            }
        }
        u50Var.OOA6hdeuvCS = f2;
        return f2;
    }

    @Override // defpackage.wn0
    public final float X1lG3V04pd() {
        return this.mOu10nynGul.X1lG3V04pd();
    }

    @Override // defpackage.wn0
    public final boolean Yi7zF1RB1() {
        f4 f4Var = this.JFJ3QoxA;
        if (f4Var != null ? f4Var.E7jCp8Ls() : false) {
            return true;
        }
        if (!this.rQPn8YBR && n30.mOu10nynGul(this.Yi7zF1RB1)) {
            j6IIN2O8eOU j6iin2o8eou = mp.GWasM1elztuh;
            j6IIN2O8eOU j6iin2o8eou2 = mp.GWasM1elztuh;
            m51 m51Var = (m51) j6iin2o8eou2.EljAMC1QTz;
            if (m51Var == null) {
                if (gp.rQPn8YBR != null) {
                    m51Var = j6iin2o8eou2.encWxUiV2();
                    j6iin2o8eou2.EljAMC1QTz = m51Var;
                } else {
                    m51Var = p.xqGvceK5x;
                }
            }
            if (((Boolean) m51Var.getValue()).booleanValue()) {
                return true;
            }
        }
        return false;
    }
}
