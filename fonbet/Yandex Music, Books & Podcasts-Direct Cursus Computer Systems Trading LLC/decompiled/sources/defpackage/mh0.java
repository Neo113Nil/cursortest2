package defpackage;

import android.graphics.Typeface;
import android.os.LocaleList;
import android.text.Layout;
import android.text.Spannable;
import android.text.SpannableString;
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
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class mh0 implements v5k {
    public final String a;
    public final ges b;
    public final List c;
    public final List d;
    public final ppc e;
    public final jx7 f;
    public final yi0 g;
    public final CharSequence h;
    public final bpf i;
    public lum j;
    public final boolean k;
    public final int l;

    /* JADX WARN: Code restructure failed: missing block: B:490:0x0099, code lost:
    
        if (r8 == 1) goto L13;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:102:0x035f  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0381  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x039a  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x03ad  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x03b7  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0434  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x04e6  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x051a  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0529  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x056c  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0643  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x0795  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:282:0x080e  */
    /* JADX WARN: Removed duplicated region for block: B:288:0x0843  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:307:0x08a1  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0158 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:363:0x083a  */
    /* JADX WARN: Removed duplicated region for block: B:364:0x05a3  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:412:0x03dc  */
    /* JADX WARN: Removed duplicated region for block: B:415:0x03ec  */
    /* JADX WARN: Removed duplicated region for block: B:432:0x03a7  */
    /* JADX WARN: Removed duplicated region for block: B:433:0x0384  */
    /* JADX WARN: Removed duplicated region for block: B:438:0x02c2  */
    /* JADX WARN: Removed duplicated region for block: B:440:0x02c9  */
    /* JADX WARN: Removed duplicated region for block: B:442:0x02cc  */
    /* JADX WARN: Removed duplicated region for block: B:443:0x02c5  */
    /* JADX WARN: Removed duplicated region for block: B:444:0x02bd  */
    /* JADX WARN: Removed duplicated region for block: B:450:0x0263  */
    /* JADX WARN: Removed duplicated region for block: B:452:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:454:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:457:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:459:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:460:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:461:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:462:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:465:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:466:0x0100 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:468:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:473:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0234  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0270  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0294  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x02a2  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x02b1 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x02f2  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0334  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public mh0(String str, ges gesVar, List list, List list2, ppc ppcVar, jx7 jx7Var) {
        Locale locale;
        int i;
        int i2;
        int size;
        int i3;
        Throwable th;
        Object obj;
        tqc tqcVar;
        oqc oqcVar;
        String str2;
        bqg bqgVar;
        ccs ccsVar;
        long j;
        long b;
        qpc qpcVar;
        Object c4rVar;
        List list3;
        String str3;
        float textSize;
        ges gesVar2;
        List list4;
        jx7 jx7Var2;
        boolean z;
        CharSequence charSequence;
        c4r c4rVar2;
        x5k x5kVar;
        float f;
        nuk nukVar;
        long j2;
        float W;
        int i4;
        fcs fcsVar;
        float f2;
        ArrayList arrayList;
        int size2;
        int i5;
        List list5;
        c4r c4rVar3;
        ArrayList arrayList2;
        int i6;
        int i7;
        int size3;
        int i8;
        boolean z2;
        fcs fcsVar2;
        float f3;
        int size4;
        int i9;
        int size5;
        int i10;
        long j3;
        int i11;
        int i12;
        int i13;
        float f4;
        int i14;
        int i15;
        int i16;
        List list6;
        boolean z3;
        Spannable spannable;
        int i17;
        duk dukVar;
        this.a = str;
        this.b = gesVar;
        this.c = list;
        this.d = list2;
        this.e = ppcVar;
        this.f = jx7Var;
        float density = jx7Var.getDensity();
        yi0 yi0Var = new yi0(1);
        ((TextPaint) yi0Var).density = density;
        yi0Var.b = aas.b;
        yi0Var.c = 3;
        yi0Var.d = otp.d;
        this.g = yi0Var;
        nuk nukVar2 = gesVar.c;
        c4r c4rVar4 = gesVar.a;
        x5k x5kVar2 = gesVar.b;
        qxp qxpVar = u3b.a;
        qxp qxpVar2 = u3b.a;
        sdr sdrVar = (sdr) qxpVar2.a;
        if (sdrVar == null) {
            if (r3b.d()) {
                sdrVar = qxpVar2.j();
                qxpVar2.a = sdrVar;
            } else {
                sdrVar = hld.h;
            }
        }
        this.k = ((Boolean) sdrVar.getValue()).booleanValue();
        int i18 = x5kVar2.b;
        bqg bqgVar2 = c4rVar4.k;
        int i19 = 0;
        if (i18 != 4) {
            if (i18 != 5) {
                if (i18 == 1) {
                    i = 0;
                } else if (i18 == 2) {
                    i = 1;
                } else {
                    if (i18 != 3 && i18 != Integer.MIN_VALUE) {
                        xq0.q("Invalid TextDirection.");
                        throw null;
                    }
                    int layoutDirectionFromLocale = TextUtils.getLayoutDirectionFromLocale((bqgVar2 == null || (locale = ((zpg) bqgVar2.a.get(0)).a) == null) ? Locale.getDefault() : locale);
                    if (layoutDirectionFromLocale != 0) {
                    }
                }
                this.l = i;
                lh0 lh0Var = new lh0(i19, this);
                lds ldsVar = x5kVar2.i;
                ldsVar = ldsVar == null ? lds.c : ldsVar;
                yi0Var.setFlags(ldsVar.b ? yi0Var.getFlags() | 128 : yi0Var.getFlags() & (-129));
                i2 = ldsVar.a;
                if (i2 == 1) {
                    yi0Var.setFlags(yi0Var.getFlags() | 64);
                    yi0Var.setHinting(0);
                } else if (i2 == 2) {
                    yi0Var.getFlags();
                    yi0Var.setHinting(1);
                } else if (i2 == 3) {
                    yi0Var.getFlags();
                    yi0Var.setHinting(0);
                } else {
                    yi0Var.getFlags();
                }
                size = list.size();
                i3 = 0;
                while (true) {
                    if (i3 >= size) {
                        th = null;
                        obj = null;
                        break;
                    } else {
                        obj = list.get(i3);
                        th = null;
                        if (((ln0) obj).a instanceof c4r) {
                            break;
                        } else {
                            i3++;
                        }
                    }
                }
                boolean z4 = obj != null;
                long j4 = c4rVar4.b;
                tqcVar = c4rVar4.c;
                oqcVar = c4rVar4.d;
                str2 = c4rVar4.g;
                bqgVar = c4rVar4.k;
                bcs bcsVar = c4rVar4.a;
                ccsVar = c4rVar4.j;
                j = c4rVar4.h;
                b = kes.b(j4);
                boolean z5 = z4;
                if (les.a(b, 4294967296L)) {
                    yi0Var.setTextSize(jx7Var.N(j4));
                } else if (les.a(b, 8589934592L)) {
                    yi0Var.setTextSize(kes.c(j4) * yi0Var.getTextSize());
                }
                qpcVar = c4rVar4.f;
                if (qpcVar == null || oqcVar != null || tqcVar != null) {
                    tqc tqcVar2 = tqcVar == null ? tqc.m : tqcVar;
                    oqc oqcVar2 = new oqc(oqcVar != null ? oqcVar.a : 0);
                    pqc pqcVar = c4rVar4.e;
                    yi0Var.setTypeface((Typeface) lh0Var.invoke(qpcVar, tqcVar2, oqcVar2, new pqc(pqcVar != null ? pqcVar.a : 65535)));
                }
                if (bqgVar != null) {
                    bqg bqgVar3 = bqg.c;
                    if (!bqgVar.equals(stk.a.F())) {
                        ArrayList arrayList3 = new ArrayList(v75.o(bqgVar, 10));
                        Iterator it = bqgVar.a.iterator();
                        while (it.hasNext()) {
                            arrayList3.add(((zpg) it.next()).a);
                        }
                        Locale[] localeArr = (Locale[]) arrayList3.toArray(new Locale[0]);
                        yi0Var.setTextLocales(new LocaleList((Locale[]) Arrays.copyOf(localeArr, localeArr.length)));
                    }
                }
                if (str2 != null && !str2.equals("")) {
                    yi0Var.setFontFeatureSettings(str2);
                }
                if (ccsVar != null && !ccsVar.equals(ccs.c)) {
                    yi0Var.setTextScaleX(yi0Var.getTextScaleX() * ccsVar.a);
                    yi0Var.setTextSkewX(yi0Var.getTextSkewX() + ccsVar.b);
                }
                yi0Var.d(bcsVar.a());
                yi0Var.c(bcsVar.c(), 9205357640488583168L, bcsVar.b());
                yi0Var.f(c4rVar4.n);
                yi0Var.g(c4rVar4.m);
                yi0Var.e(c4rVar4.p);
                if (!les.a(kes.b(j), 4294967296L) && kes.c(j) != 0.0f) {
                    float textScaleX = yi0Var.getTextScaleX() * yi0Var.getTextSize();
                    float N = jx7Var.N(j);
                    if (textScaleX != 0.0f) {
                        yi0Var.setLetterSpacing(N / textScaleX);
                    }
                } else if (les.a(kes.b(j), 8589934592L)) {
                    yi0Var.setLetterSpacing(kes.c(j));
                }
                long j5 = c4rVar4.l;
                wu2 wu2Var = c4rVar4.i;
                boolean z6 = (z5 || !les.a(kes.b(j), 4294967296L) || kes.c(j) == 0.0f) ? false : true;
                long j6 = d85.n;
                boolean z7 = d85.c(j5, j6) && !d85.c(j5, d85.m);
                boolean z8 = wu2Var == null && Float.compare(wu2Var.a, 0.0f) != 0;
                c4rVar = (!z6 || z7 || z8) ? new c4r(0L, 0L, (tqc) null, (oqc) null, (pqc) null, (qpc) null, (String) null, z6 ? j : kes.c, z8 ? wu2Var : th, (ccs) null, (bqg) null, z7 ? j5 : j6, (aas) null, (otp) null, 63103) : th;
                list3 = this.c;
                if (c4rVar != null) {
                    int size6 = list3.size() + 1;
                    ArrayList arrayList4 = new ArrayList(size6);
                    int i20 = 0;
                    while (i20 < size6) {
                        arrayList4.add(i20 == 0 ? new ln0(c4rVar, 0, this.a.length()) : (ln0) this.c.get(i20 - 1));
                        i20++;
                    }
                    list3 = arrayList4;
                }
                str3 = this.a;
                textSize = this.g.getTextSize();
                gesVar2 = this.b;
                list4 = this.d;
                jx7Var2 = this.f;
                z = this.k;
                jh0 jh0Var = kh0.a;
                if (z || !r3b.d()) {
                    charSequence = str3;
                } else {
                    nuk nukVar3 = gesVar2.c;
                    if (nukVar3 != null) {
                        duk dukVar2 = nukVar3.b;
                    }
                    charSequence = r3b.a().g(0, str3.length(), 0, str3);
                    charSequence.getClass();
                }
                if (list3.isEmpty() || !list4.isEmpty() || !Intrinsics.d(gesVar2.b.d, fcs.c) || (gesVar2.b.c & 1095216660480L) != 0) {
                    Spannable spannableString = charSequence instanceof Spannable ? (Spannable) charSequence : new SpannableString(charSequence);
                    c4rVar2 = gesVar2.a;
                    x5kVar = gesVar2.b;
                    if (Intrinsics.d(c4rVar2.m, aas.c)) {
                        f = 0.0f;
                        spannableString.setSpan(kh0.a, 0, str3.length(), 33);
                    } else {
                        f = 0.0f;
                    }
                    nukVar = gesVar2.c;
                    if (((nukVar != null || (dukVar = nukVar.b) == null) ? false : dukVar.a) || x5kVar.f != null) {
                        h6g h6gVar = x5kVar.f;
                        h6gVar = h6gVar == null ? h6g.c : h6gVar;
                        j2 = 0;
                        W = y1g.W(x5kVar.c, textSize, jx7Var2);
                        if (!Float.isNaN(W)) {
                            int length = (spannableString.length() == 0 || mlr.I(spannableString) == '\n') ? spannableString.length() + 1 : spannableString.length();
                            int i21 = h6gVar.b;
                            i4 = 0;
                            spannableString.setSpan(new i6g(W, length, (i21 & 1) > 0, (i21 & 16) > 0, h6gVar.a, false), 0, spannableString.length(), 33);
                            fcsVar = x5kVar.d;
                            if (fcsVar != null) {
                                long j7 = fcsVar.a;
                                long j8 = fcsVar.b;
                                int i22 = i4;
                                if ((!kes.a(j7, v7g.z(i22)) || !kes.a(j8, v7g.z(i22))) && (j7 & 1095216660480L) != j2 && (j8 & 1095216660480L) != j2) {
                                    long b2 = kes.b(j7);
                                    f2 = textSize;
                                    float N2 = les.a(b2, 4294967296L) ? jx7Var2.N(j7) : les.a(b2, 8589934592L) ? kes.c(j7) * f2 : f;
                                    long b3 = kes.b(j8);
                                    spannableString.setSpan(new LeadingMarginSpan.Standard((int) Math.ceil(N2), (int) Math.ceil(les.a(b3, 4294967296L) ? jx7Var2.N(j8) : les.a(b3, 8589934592L) ? kes.c(j8) * f2 : f)), 0, spannableString.length(), 33);
                                    arrayList = new ArrayList(list3.size());
                                    List list7 = list3;
                                    size2 = list7.size();
                                    for (i5 = 0; i5 < size2; i5++) {
                                        ln0 ln0Var = (ln0) list3.get(i5);
                                        Object obj2 = ln0Var.a;
                                        if (obj2 instanceof c4r) {
                                            c4r c4rVar5 = (c4r) obj2;
                                            if (((c4rVar5.f == null && c4rVar5.d == null && c4rVar5.c == null) ? false : true) || ((c4r) obj2).e != null) {
                                                arrayList.add(ln0Var);
                                            }
                                        }
                                    }
                                    c4r c4rVar6 = gesVar2.a;
                                    qpc qpcVar2 = c4rVar6.f;
                                    c4r c4rVar7 = ((qpcVar2 == null || c4rVar6.d != null || c4rVar6.c != null) && c4rVar6.e == null) ? th : new c4r(0L, 0L, c4rVar6.c, c4rVar6.d, c4rVar6.e, qpcVar2, (String) null, 0L, (wu2) null, (ccs) null, (bqg) null, 0L, (aas) null, (otp) null, 65475);
                                    yl0 yl0Var = new yl0(9, spannableString, lh0Var);
                                    if (arrayList.size() <= 1) {
                                        if (!arrayList.isEmpty()) {
                                            c4r c4rVar8 = (c4r) ((ln0) arrayList.get(0)).a;
                                            yl0Var.invoke(c4rVar7 != 0 ? c4rVar7.c(c4rVar8) : c4rVar8, Integer.valueOf(((ln0) arrayList.get(0)).b), Integer.valueOf(((ln0) arrayList.get(0)).c));
                                        }
                                        list5 = list7;
                                    } else {
                                        int size7 = arrayList.size();
                                        int i23 = size7 * 2;
                                        int[] iArr = new int[i23];
                                        int size8 = arrayList.size();
                                        int i24 = 0;
                                        while (i24 < size8) {
                                            ln0 ln0Var2 = (ln0) arrayList.get(i24);
                                            iArr[i24] = ln0Var2.b;
                                            iArr[i24 + size7] = ln0Var2.c;
                                            i24++;
                                            list7 = list7;
                                        }
                                        list5 = list7;
                                        if (i23 > 1) {
                                            Arrays.sort(iArr);
                                        }
                                        int x = xz0.x(iArr);
                                        int i25 = 0;
                                        c4r c4rVar9 = c4rVar7;
                                        while (i25 < i23) {
                                            int i26 = iArr[i25];
                                            if (i26 == x) {
                                                arrayList2 = arrayList;
                                                c4rVar3 = c4rVar9;
                                                i6 = i25;
                                                i7 = i23;
                                            } else {
                                                int size9 = arrayList.size();
                                                c4rVar3 = c4rVar9;
                                                int i27 = 0;
                                                c4r c4rVar10 = c4rVar9;
                                                while (i27 < size9) {
                                                    ArrayList arrayList5 = arrayList;
                                                    ln0 ln0Var3 = (ln0) arrayList.get(i27);
                                                    int i28 = i25;
                                                    int i29 = ln0Var3.b;
                                                    int i30 = i23;
                                                    int i31 = ln0Var3.c;
                                                    if (i29 != i31 && nn0.c(x, i26, i29, i31)) {
                                                        c4r c4rVar11 = (c4r) ln0Var3.a;
                                                        c4rVar10 = c4rVar10 != null ? c4rVar10.c(c4rVar11) : c4rVar11;
                                                    }
                                                    i27++;
                                                    i25 = i28;
                                                    arrayList = arrayList5;
                                                    i23 = i30;
                                                    c4rVar10 = c4rVar10;
                                                }
                                                arrayList2 = arrayList;
                                                i6 = i25;
                                                i7 = i23;
                                                if (c4rVar10 != null) {
                                                    yl0Var.invoke(c4rVar10, Integer.valueOf(x), Integer.valueOf(i26));
                                                }
                                                x = i26;
                                            }
                                            i25 = i6 + 1;
                                            c4rVar9 = c4rVar3;
                                            arrayList = arrayList2;
                                            i23 = i7;
                                        }
                                    }
                                    size3 = list5.size();
                                    i8 = 0;
                                    z2 = false;
                                    while (i8 < size3) {
                                        ln0 ln0Var4 = (ln0) list3.get(i8);
                                        Object obj3 = ln0Var4.a;
                                        if (obj3 instanceof c4r) {
                                            int i32 = ln0Var4.b;
                                            int i33 = ln0Var4.c;
                                            if (i32 >= 0 && i32 < spannableString.length() && i33 > i32 && i33 <= spannableString.length()) {
                                                c4r c4rVar12 = (c4r) obj3;
                                                long j9 = c4rVar12.h;
                                                wu2 wu2Var2 = c4rVar12.i;
                                                bcs bcsVar2 = c4rVar12.a;
                                                if (wu2Var2 != null) {
                                                    i15 = size3;
                                                    i16 = i8;
                                                    spannableString.setSpan(new yu2(0, wu2Var2.a), i32, i33, 33);
                                                } else {
                                                    i15 = size3;
                                                    i16 = i8;
                                                }
                                                y1g.Z(spannableString, bcsVar2.a(), i32, i33);
                                                ai3 c = bcsVar2.c();
                                                float b4 = bcsVar2.b();
                                                if (c != null) {
                                                    if (c instanceof f3r) {
                                                        y1g.Z(spannableString, ((f3r) c).a, i32, i33);
                                                    } else {
                                                        spannableString.setSpan(new mtp((ltp) c, b4), i32, i33, 33);
                                                    }
                                                }
                                                aas aasVar = c4rVar12.m;
                                                if (aasVar != null) {
                                                    int i34 = aasVar.a;
                                                    bas basVar = new bas((i34 | 1) == i34, (i34 | 2) == i34);
                                                    i17 = 33;
                                                    spannableString.setSpan(basVar, i32, i33, 33);
                                                } else {
                                                    i17 = 33;
                                                }
                                                int i35 = i17;
                                                y1g.b0(spannableString, c4rVar12.b, jx7Var2, i32, i33);
                                                spannable = spannableString;
                                                String str4 = c4rVar12.g;
                                                if (str4 != null) {
                                                    spannable.setSpan(new upc(str4, 1), i32, i33, i35);
                                                }
                                                ccs ccsVar2 = c4rVar12.j;
                                                if (ccsVar2 != null) {
                                                    spannable.setSpan(new ScaleXSpan(ccsVar2.a), i32, i33, i35);
                                                    spannable.setSpan(new gxf(1, ccsVar2.b), i32, i33, i35);
                                                }
                                                y1g.c0(spannable, c4rVar12.k, i32, i33);
                                                long j10 = c4rVar12.l;
                                                if (j10 != 16) {
                                                    spannable.setSpan(new BackgroundColorSpan(c3x.U(j10)), i32, i33, i35);
                                                }
                                                otp otpVar = c4rVar12.n;
                                                if (otpVar != null) {
                                                    long j11 = otpVar.b;
                                                    list6 = list3;
                                                    int U = c3x.U(otpVar.a);
                                                    z3 = z2;
                                                    float intBitsToFloat = Float.intBitsToFloat((int) (j11 >> 32));
                                                    float intBitsToFloat2 = Float.intBitsToFloat((int) (j11 & 4294967295L));
                                                    float f5 = otpVar.c;
                                                    utp utpVar = new utp(intBitsToFloat, intBitsToFloat2, f5 == f ? Float.MIN_VALUE : f5, U);
                                                    i35 = 33;
                                                    spannable.setSpan(utpVar, i32, i33, 33);
                                                } else {
                                                    list6 = list3;
                                                    z3 = z2;
                                                }
                                                kpa kpaVar = c4rVar12.p;
                                                if (kpaVar != null) {
                                                    spannable.setSpan(new lpa(kpaVar), i32, i33, i35);
                                                }
                                                if (les.a(kes.b(j9), 4294967296L) || les.a(kes.b(j9), 8589934592L)) {
                                                    z2 = true;
                                                    i8 = i16 + 1;
                                                    list3 = list6;
                                                    spannableString = spannable;
                                                    size3 = i15;
                                                }
                                                z2 = z3;
                                                i8 = i16 + 1;
                                                list3 = list6;
                                                spannableString = spannable;
                                                size3 = i15;
                                            }
                                        }
                                        i15 = size3;
                                        i16 = i8;
                                        list6 = list3;
                                        z3 = z2;
                                        spannable = spannableString;
                                        z2 = z3;
                                        i8 = i16 + 1;
                                        list3 = list6;
                                        spannableString = spannable;
                                        size3 = i15;
                                    }
                                    List list8 = list3;
                                    Spannable spannable2 = spannableString;
                                    if (z2) {
                                        int size10 = list5.size();
                                        int i36 = 0;
                                        while (i36 < size10) {
                                            List list9 = list8;
                                            ln0 ln0Var5 = (ln0) list9.get(i36);
                                            in0 in0Var = (in0) ln0Var5.a;
                                            if (in0Var instanceof c4r) {
                                                int i37 = ln0Var5.b;
                                                int i38 = ln0Var5.c;
                                                if (i37 >= 0 && i37 < spannable2.length() && i38 > i37 && i38 <= spannable2.length()) {
                                                    long j12 = ((c4r) in0Var).h;
                                                    long b5 = kes.b(j12);
                                                    i14 = i36;
                                                    Object hxfVar = les.a(b5, 4294967296L) ? new hxf(jx7Var2.N(j12)) : les.a(b5, 8589934592L) ? new gxf(0, kes.c(j12)) : th;
                                                    if (hxfVar != null) {
                                                        spannable2.setSpan(hxfVar, i37, i38, 33);
                                                    }
                                                    i36 = i14 + 1;
                                                    list8 = list9;
                                                }
                                            }
                                            i14 = i36;
                                            i36 = i14 + 1;
                                            list8 = list9;
                                        }
                                    }
                                    List list10 = list8;
                                    int i39 = 0;
                                    fcsVar2 = x5kVar.d;
                                    if (fcsVar2 != null) {
                                        long j13 = fcsVar2.a;
                                        long b6 = kes.b(j13);
                                        f3 = les.a(b6, 4294967296L) ? jx7Var2.N(j13) : les.a(b6, 8589934592L) ? kes.c(j13) * f2 : f;
                                    } else {
                                        f3 = f;
                                    }
                                    size4 = list5.size();
                                    i9 = 0;
                                    while (i9 < size4) {
                                        ln0 ln0Var6 = (ln0) list10.get(i9);
                                        Object obj4 = ln0Var6.a;
                                        tj3 tj3Var = obj4 instanceof tj3 ? (tj3) obj4 : th;
                                        if (tj3Var != 0) {
                                            f4 = f2;
                                            float V = y1g.V(tj3Var.a, f4, jx7Var2);
                                            float V2 = y1g.V(tj3Var.b, f4, jx7Var2);
                                            if (Float.isNaN(V) || Float.isNaN(V2)) {
                                                i13 = 0;
                                            } else {
                                                jx7 jx7Var3 = jx7Var2;
                                                i13 = 0;
                                                jx7Var2 = jx7Var3;
                                                spannable2.setSpan(new sw6(V, V, V2, jx7Var3, f3), ln0Var6.b, ln0Var6.c, 33);
                                            }
                                        } else {
                                            i13 = i39;
                                            f4 = f2;
                                        }
                                        i9++;
                                        f2 = f4;
                                        i39 = i13;
                                    }
                                    int i40 = i39;
                                    size5 = list4.size();
                                    i10 = i40;
                                    while (i10 < size5) {
                                        ln0 ln0Var7 = (ln0) list4.get(i10);
                                        psk pskVar = (psk) ln0Var7.a;
                                        int i41 = ln0Var7.b;
                                        int i42 = ln0Var7.c;
                                        Object[] spans = spannable2.getSpans(i41, i42, kdt.class);
                                        int length2 = spans.length;
                                        for (int i43 = i40; i43 < length2; i43++) {
                                            spannable2.removeSpan((kdt) spans[i43]);
                                        }
                                        long j14 = pskVar.a;
                                        long j15 = pskVar.b;
                                        float c2 = kes.c(j14);
                                        long b7 = kes.b(pskVar.a);
                                        List list11 = list4;
                                        if (les.a(b7, 4294967296L)) {
                                            i11 = i40;
                                            j3 = 8589934592L;
                                        } else {
                                            j3 = 8589934592L;
                                            i11 = les.a(b7, 8589934592L) ? 1 : 2;
                                        }
                                        float c3 = kes.c(j15);
                                        long b8 = kes.b(j15);
                                        int i44 = les.a(b8, 4294967296L) ? i40 : les.a(b8, j3) ? 1 : 2;
                                        float density2 = jx7Var2.getDensity() * jx7Var2.i0();
                                        int i45 = pskVar.c;
                                        if (i45 == 1) {
                                            i12 = i40;
                                        } else if (i45 == 2) {
                                            i12 = 1;
                                        } else {
                                            if (i45 == 3) {
                                                i12 = 2;
                                            } else if (i45 == 4) {
                                                i12 = 3;
                                            } else {
                                                if (i45 == 5) {
                                                    i12 = 4;
                                                } else if (i45 == 6) {
                                                    i12 = 5;
                                                } else {
                                                    if (i45 != 7) {
                                                        xq0.q("Invalid PlaceholderVerticalAlign");
                                                        throw th;
                                                    }
                                                    i12 = 6;
                                                }
                                                spannable2.setSpan(new ssk(c2, i11, c3, i44, density2, i12), i41, i42, 33);
                                                i10++;
                                                list4 = list11;
                                            }
                                            spannable2.setSpan(new ssk(c2, i11, c3, i44, density2, i12), i41, i42, 33);
                                            i10++;
                                            list4 = list11;
                                        }
                                        spannable2.setSpan(new ssk(c2, i11, c3, i44, density2, i12), i41, i42, 33);
                                        i10++;
                                        list4 = list11;
                                    }
                                    charSequence = spannable2;
                                }
                            }
                            f2 = textSize;
                            arrayList = new ArrayList(list3.size());
                            List list72 = list3;
                            size2 = list72.size();
                            while (i5 < size2) {
                            }
                            c4r c4rVar62 = gesVar2.a;
                            qpc qpcVar22 = c4rVar62.f;
                            if (qpcVar22 == null || c4rVar62.d != null || c4rVar62.c != null) {
                            }
                            yl0 yl0Var2 = new yl0(9, spannableString, lh0Var);
                            if (arrayList.size() <= 1) {
                            }
                            size3 = list5.size();
                            i8 = 0;
                            z2 = false;
                            while (i8 < size3) {
                            }
                            List list82 = list3;
                            Spannable spannable22 = spannableString;
                            if (z2) {
                            }
                            List list102 = list82;
                            int i392 = 0;
                            fcsVar2 = x5kVar.d;
                            if (fcsVar2 != null) {
                            }
                            size4 = list5.size();
                            i9 = 0;
                            while (i9 < size4) {
                            }
                            int i402 = i392;
                            size5 = list4.size();
                            i10 = i402;
                            while (i10 < size5) {
                            }
                            charSequence = spannable22;
                        }
                    } else {
                        float W2 = y1g.W(x5kVar.c, textSize, jx7Var2);
                        if (!Float.isNaN(W2)) {
                            spannableString.setSpan(new d6g(W2), 0, spannableString.length(), 33);
                        }
                        j2 = 0;
                    }
                    i4 = 0;
                    fcsVar = x5kVar.d;
                    if (fcsVar != null) {
                    }
                    f2 = textSize;
                    arrayList = new ArrayList(list3.size());
                    List list722 = list3;
                    size2 = list722.size();
                    while (i5 < size2) {
                    }
                    c4r c4rVar622 = gesVar2.a;
                    qpc qpcVar222 = c4rVar622.f;
                    if (qpcVar222 == null || c4rVar622.d != null || c4rVar622.c != null) {
                    }
                    yl0 yl0Var22 = new yl0(9, spannableString, lh0Var);
                    if (arrayList.size() <= 1) {
                    }
                    size3 = list5.size();
                    i8 = 0;
                    z2 = false;
                    while (i8 < size3) {
                    }
                    List list822 = list3;
                    Spannable spannable222 = spannableString;
                    if (z2) {
                    }
                    List list1022 = list822;
                    int i3922 = 0;
                    fcsVar2 = x5kVar.d;
                    if (fcsVar2 != null) {
                    }
                    size4 = list5.size();
                    i9 = 0;
                    while (i9 < size4) {
                    }
                    int i4022 = i3922;
                    size5 = list4.size();
                    i10 = i4022;
                    while (i10 < size5) {
                    }
                    charSequence = spannable222;
                }
                this.h = charSequence;
                this.i = new bpf(charSequence, this.g, this.l);
            }
            i = 3;
            this.l = i;
            lh0 lh0Var2 = new lh0(i19, this);
            lds ldsVar2 = x5kVar2.i;
            if (ldsVar2 == null) {
            }
            yi0Var.setFlags(ldsVar2.b ? yi0Var.getFlags() | 128 : yi0Var.getFlags() & (-129));
            i2 = ldsVar2.a;
            if (i2 == 1) {
            }
            size = list.size();
            i3 = 0;
            while (true) {
                if (i3 >= size) {
                }
                i3++;
            }
            if (obj != null) {
            }
            long j42 = c4rVar4.b;
            tqcVar = c4rVar4.c;
            oqcVar = c4rVar4.d;
            str2 = c4rVar4.g;
            bqgVar = c4rVar4.k;
            bcs bcsVar3 = c4rVar4.a;
            ccsVar = c4rVar4.j;
            j = c4rVar4.h;
            b = kes.b(j42);
            boolean z52 = z4;
            if (les.a(b, 4294967296L)) {
            }
            qpcVar = c4rVar4.f;
            if (qpcVar == null) {
            }
            if (tqcVar == null) {
            }
            oqc oqcVar22 = new oqc(oqcVar != null ? oqcVar.a : 0);
            pqc pqcVar2 = c4rVar4.e;
            yi0Var.setTypeface((Typeface) lh0Var2.invoke(qpcVar, tqcVar2, oqcVar22, new pqc(pqcVar2 != null ? pqcVar2.a : 65535)));
            if (bqgVar != null) {
            }
            if (str2 != null) {
                yi0Var.setFontFeatureSettings(str2);
            }
            if (ccsVar != null) {
                yi0Var.setTextScaleX(yi0Var.getTextScaleX() * ccsVar.a);
                yi0Var.setTextSkewX(yi0Var.getTextSkewX() + ccsVar.b);
            }
            yi0Var.d(bcsVar3.a());
            yi0Var.c(bcsVar3.c(), 9205357640488583168L, bcsVar3.b());
            yi0Var.f(c4rVar4.n);
            yi0Var.g(c4rVar4.m);
            yi0Var.e(c4rVar4.p);
            if (!les.a(kes.b(j), 4294967296L)) {
            }
            if (les.a(kes.b(j), 8589934592L)) {
            }
            long j52 = c4rVar4.l;
            wu2 wu2Var3 = c4rVar4.i;
            if (z52) {
            }
            long j62 = d85.n;
            if (d85.c(j52, j62)) {
            }
            if (wu2Var3 == null) {
            }
            if (z6) {
            }
            list3 = this.c;
            if (c4rVar != null) {
            }
            str3 = this.a;
            textSize = this.g.getTextSize();
            gesVar2 = this.b;
            list4 = this.d;
            jx7Var2 = this.f;
            z = this.k;
            jh0 jh0Var2 = kh0.a;
            if (z) {
            }
            charSequence = str3;
            if (list3.isEmpty()) {
            }
            if (charSequence instanceof Spannable) {
            }
            c4rVar2 = gesVar2.a;
            x5kVar = gesVar2.b;
            if (Intrinsics.d(c4rVar2.m, aas.c)) {
            }
            nukVar = gesVar2.c;
            if ((nukVar != null || (dukVar = nukVar.b) == null) ? false : dukVar.a) {
            }
            h6g h6gVar2 = x5kVar.f;
            if (h6gVar2 == null) {
            }
            j2 = 0;
            W = y1g.W(x5kVar.c, textSize, jx7Var2);
            if (!Float.isNaN(W)) {
            }
            i4 = 0;
            fcsVar = x5kVar.d;
            if (fcsVar != null) {
            }
            f2 = textSize;
            arrayList = new ArrayList(list3.size());
            List list7222 = list3;
            size2 = list7222.size();
            while (i5 < size2) {
            }
            c4r c4rVar6222 = gesVar2.a;
            qpc qpcVar2222 = c4rVar6222.f;
            if (qpcVar2222 == null || c4rVar6222.d != null || c4rVar6222.c != null) {
            }
            yl0 yl0Var222 = new yl0(9, spannableString, lh0Var2);
            if (arrayList.size() <= 1) {
            }
            size3 = list5.size();
            i8 = 0;
            z2 = false;
            while (i8 < size3) {
            }
            List list8222 = list3;
            Spannable spannable2222 = spannableString;
            if (z2) {
            }
            List list10222 = list8222;
            int i39222 = 0;
            fcsVar2 = x5kVar.d;
            if (fcsVar2 != null) {
            }
            size4 = list5.size();
            i9 = 0;
            while (i9 < size4) {
            }
            int i40222 = i39222;
            size5 = list4.size();
            i10 = i40222;
            while (i10 < size5) {
            }
            charSequence = spannable2222;
            this.h = charSequence;
            this.i = new bpf(charSequence, this.g, this.l);
        }
        i = 2;
        this.l = i;
        lh0 lh0Var22 = new lh0(i19, this);
        lds ldsVar22 = x5kVar2.i;
        if (ldsVar22 == null) {
        }
        yi0Var.setFlags(ldsVar22.b ? yi0Var.getFlags() | 128 : yi0Var.getFlags() & (-129));
        i2 = ldsVar22.a;
        if (i2 == 1) {
        }
        size = list.size();
        i3 = 0;
        while (true) {
            if (i3 >= size) {
            }
            i3++;
        }
        if (obj != null) {
        }
        long j422 = c4rVar4.b;
        tqcVar = c4rVar4.c;
        oqcVar = c4rVar4.d;
        str2 = c4rVar4.g;
        bqgVar = c4rVar4.k;
        bcs bcsVar32 = c4rVar4.a;
        ccsVar = c4rVar4.j;
        j = c4rVar4.h;
        b = kes.b(j422);
        boolean z522 = z4;
        if (les.a(b, 4294967296L)) {
        }
        qpcVar = c4rVar4.f;
        if (qpcVar == null) {
        }
        if (tqcVar == null) {
        }
        oqc oqcVar222 = new oqc(oqcVar != null ? oqcVar.a : 0);
        pqc pqcVar22 = c4rVar4.e;
        yi0Var.setTypeface((Typeface) lh0Var22.invoke(qpcVar, tqcVar2, oqcVar222, new pqc(pqcVar22 != null ? pqcVar22.a : 65535)));
        if (bqgVar != null) {
        }
        if (str2 != null) {
        }
        if (ccsVar != null) {
        }
        yi0Var.d(bcsVar32.a());
        yi0Var.c(bcsVar32.c(), 9205357640488583168L, bcsVar32.b());
        yi0Var.f(c4rVar4.n);
        yi0Var.g(c4rVar4.m);
        yi0Var.e(c4rVar4.p);
        if (!les.a(kes.b(j), 4294967296L)) {
        }
        if (les.a(kes.b(j), 8589934592L)) {
        }
        long j522 = c4rVar4.l;
        wu2 wu2Var32 = c4rVar4.i;
        if (z522) {
        }
        long j622 = d85.n;
        if (d85.c(j522, j622)) {
        }
        if (wu2Var32 == null) {
        }
        if (z6) {
        }
        list3 = this.c;
        if (c4rVar != null) {
        }
        str3 = this.a;
        textSize = this.g.getTextSize();
        gesVar2 = this.b;
        list4 = this.d;
        jx7Var2 = this.f;
        z = this.k;
        jh0 jh0Var22 = kh0.a;
        if (z) {
        }
        charSequence = str3;
        if (list3.isEmpty()) {
        }
        if (charSequence instanceof Spannable) {
        }
        c4rVar2 = gesVar2.a;
        x5kVar = gesVar2.b;
        if (Intrinsics.d(c4rVar2.m, aas.c)) {
        }
        nukVar = gesVar2.c;
        if ((nukVar != null || (dukVar = nukVar.b) == null) ? false : dukVar.a) {
        }
        h6g h6gVar22 = x5kVar.f;
        if (h6gVar22 == null) {
        }
        j2 = 0;
        W = y1g.W(x5kVar.c, textSize, jx7Var2);
        if (!Float.isNaN(W)) {
        }
        i4 = 0;
        fcsVar = x5kVar.d;
        if (fcsVar != null) {
        }
        f2 = textSize;
        arrayList = new ArrayList(list3.size());
        List list72222 = list3;
        size2 = list72222.size();
        while (i5 < size2) {
        }
        c4r c4rVar62222 = gesVar2.a;
        qpc qpcVar22222 = c4rVar62222.f;
        if (qpcVar22222 == null || c4rVar62222.d != null || c4rVar62222.c != null) {
        }
        yl0 yl0Var2222 = new yl0(9, spannableString, lh0Var22);
        if (arrayList.size() <= 1) {
        }
        size3 = list5.size();
        i8 = 0;
        z2 = false;
        while (i8 < size3) {
        }
        List list82222 = list3;
        Spannable spannable22222 = spannableString;
        if (z2) {
        }
        List list102222 = list82222;
        int i392222 = 0;
        fcsVar2 = x5kVar.d;
        if (fcsVar2 != null) {
        }
        size4 = list5.size();
        i9 = 0;
        while (i9 < size4) {
        }
        int i402222 = i392222;
        size5 = list4.size();
        i10 = i402222;
        while (i10 < size5) {
        }
        charSequence = spannable22222;
        this.h = charSequence;
        this.i = new bpf(charSequence, this.g, this.l);
    }

    @Override // defpackage.v5k
    public final boolean a() {
        lum lumVar = this.j;
        if (lumVar != null ? lumVar.U() : false) {
            return true;
        }
        if (!this.k) {
            nuk nukVar = this.b.c;
            qxp qxpVar = u3b.a;
            qxp qxpVar2 = u3b.a;
            sdr sdrVar = (sdr) qxpVar2.a;
            if (sdrVar == null) {
                if (r3b.d()) {
                    sdrVar = qxpVar2.j();
                    qxpVar2.a = sdrVar;
                } else {
                    sdrVar = hld.h;
                }
            }
            if (((Boolean) sdrVar.getValue()).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.v5k
    public final float b() {
        return this.i.c();
    }

    @Override // defpackage.v5k
    public final float c() {
        float f;
        bpf bpfVar = this.i;
        float f2 = bpfVar.e;
        TextPaint textPaint = bpfVar.b;
        if (!Float.isNaN(f2)) {
            return bpfVar.e;
        }
        BreakIterator lineInstance = BreakIterator.getLineInstance(textPaint.getTextLocale());
        CharSequence charSequence = bpfVar.a;
        lineInstance.setText(new he4(charSequence.length(), charSequence));
        PriorityQueue priorityQueue = new PriorityQueue(10, new mj(18));
        int i = 0;
        for (int next = lineInstance.next(); next != -1; next = lineInstance.next()) {
            if (priorityQueue.size() < 10) {
                priorityQueue.add(new Pair(Integer.valueOf(i), Integer.valueOf(next)));
            } else {
                Pair pair = (Pair) priorityQueue.peek();
                if (pair != null && ((Number) pair.b).intValue() - ((Number) pair.a).intValue() < next - i) {
                    priorityQueue.poll();
                    priorityQueue.add(new Pair(Integer.valueOf(i), Integer.valueOf(next)));
                }
            }
            i = next;
        }
        if (priorityQueue.isEmpty()) {
            f = 0.0f;
        } else {
            Iterator it = priorityQueue.iterator();
            if (!it.hasNext()) {
                wvs.n();
                return 0.0f;
            }
            Pair pair2 = (Pair) it.next();
            float desiredWidth = Layout.getDesiredWidth(bpfVar.b(), ((Number) pair2.a).intValue(), ((Number) pair2.b).intValue(), textPaint);
            while (it.hasNext()) {
                Pair pair3 = (Pair) it.next();
                desiredWidth = Math.max(desiredWidth, Layout.getDesiredWidth(bpfVar.b(), ((Number) pair3.a).intValue(), ((Number) pair3.b).intValue(), textPaint));
            }
            f = desiredWidth;
        }
        bpfVar.e = f;
        return f;
    }
}
