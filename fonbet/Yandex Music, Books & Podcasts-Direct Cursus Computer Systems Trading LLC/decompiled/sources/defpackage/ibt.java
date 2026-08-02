package defpackage;

import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import android.util.Pair;
import com.connectsdk.service.webos.lgcast.common.utils.StringUtil;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

/* loaded from: classes.dex */
public final class ibt {
    public final String a;
    public final String b;
    public final boolean c;
    public final long d;
    public final long e;
    public final lbt f;
    public final String[] g;
    public final String h;
    public final String i;
    public final ibt j;
    public final HashMap k;
    public final HashMap l;
    public ArrayList m;

    public ibt(String str, String str2, long j, long j2, lbt lbtVar, String[] strArr, String str3, String str4, ibt ibtVar) {
        this.a = str;
        this.b = str2;
        this.i = str4;
        this.f = lbtVar;
        this.g = strArr;
        this.c = str2 != null;
        this.d = j;
        this.e = j2;
        str3.getClass();
        this.h = str3;
        this.j = ibtVar;
        this.k = new HashMap();
        this.l = new HashMap();
    }

    public static ibt a(String str) {
        return new ibt(null, str.replaceAll("\r\n", StringUtil.LF).replaceAll(" *\n *", StringUtil.LF).replaceAll(StringUtil.LF, StringUtil.SPACE).replaceAll("[ \t\\x0B\f\r]+", StringUtil.SPACE), -9223372036854775807L, -9223372036854775807L, null, null, "", null, null);
    }

    public static SpannableStringBuilder e(String str, TreeMap treeMap) {
        if (!treeMap.containsKey(str)) {
            qv6 qv6Var = new qv6();
            qv6Var.a = new SpannableStringBuilder();
            treeMap.put(str, qv6Var);
        }
        CharSequence charSequence = ((qv6) treeMap.get(str)).a;
        charSequence.getClass();
        return (SpannableStringBuilder) charSequence;
    }

    public final ibt b(int i) {
        ArrayList arrayList = this.m;
        if (arrayList != null) {
            return (ibt) arrayList.get(i);
        }
        rj7.m();
        return null;
    }

    public final int c() {
        ArrayList arrayList = this.m;
        if (arrayList == null) {
            return 0;
        }
        return arrayList.size();
    }

    public final void d(TreeSet treeSet, boolean z) {
        String str = this.a;
        boolean equals = "p".equals(str);
        boolean equals2 = "div".equals(str);
        if (z || equals || (equals2 && this.i != null)) {
            long j = this.d;
            if (j != -9223372036854775807L) {
                treeSet.add(Long.valueOf(j));
            }
            long j2 = this.e;
            if (j2 != -9223372036854775807L) {
                treeSet.add(Long.valueOf(j2));
            }
        }
        if (this.m == null) {
            return;
        }
        for (int i = 0; i < this.m.size(); i++) {
            ((ibt) this.m.get(i)).d(treeSet, z || equals);
        }
    }

    public final boolean f(long j) {
        long j2 = this.d;
        long j3 = this.e;
        if (j2 == -9223372036854775807L && j3 == -9223372036854775807L) {
            return true;
        }
        if (j2 <= j && j3 == -9223372036854775807L) {
            return true;
        }
        if (j2 != -9223372036854775807L || j >= j3) {
            return j2 <= j && j < j3;
        }
        return true;
    }

    public final void g(long j, String str, ArrayList arrayList) {
        String str2;
        String str3 = this.h;
        if (!"".equals(str3)) {
            str = str3;
        }
        if (f(j) && "div".equals(this.a) && (str2 = this.i) != null) {
            arrayList.add(new Pair(str, str2));
            return;
        }
        for (int i = 0; i < c(); i++) {
            b(i).g(j, str, arrayList);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x02ca A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:125:0x028d  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0207  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0215  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x02a7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void h(long j, Map map, HashMap hashMap, String str, TreeMap treeMap) {
        Iterator it;
        int i;
        ibt ibtVar;
        int i2;
        lbt M;
        int i3;
        float f;
        int i4;
        int i5;
        int i6;
        Map map2 = map;
        if (f(j)) {
            String str2 = this.h;
            String str3 = "".equals(str2) ? str : str2;
            Iterator it2 = this.l.entrySet().iterator();
            while (it2.hasNext()) {
                Map.Entry entry = (Map.Entry) it2.next();
                String str4 = (String) entry.getKey();
                HashMap hashMap2 = this.k;
                int intValue = hashMap2.containsKey(str4) ? ((Integer) hashMap2.get(str4)).intValue() : 0;
                int intValue2 = ((Integer) entry.getValue()).intValue();
                if (intValue != intValue2) {
                    qv6 qv6Var = (qv6) treeMap.get(str4);
                    qv6Var.getClass();
                    kbt kbtVar = (kbt) hashMap.get(str3);
                    kbtVar.getClass();
                    int i7 = kbtVar.j;
                    lbt M2 = o8g.M(this.f, this.g, map2);
                    SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) qv6Var.a;
                    if (spannableStringBuilder == null) {
                        spannableStringBuilder = new SpannableStringBuilder();
                        qv6Var.a = spannableStringBuilder;
                    }
                    if (M2 != null) {
                        int i8 = M2.h;
                        int i9 = 1;
                        if (((i8 == -1 && M2.i == -1) ? -1 : (i8 == 1 ? (char) 1 : (char) 0) | (M2.i == 1 ? (char) 2 : (char) 0)) != -1) {
                            int i10 = M2.h;
                            if (i10 == -1) {
                                if (M2.i == -1) {
                                    i6 = -1;
                                    i9 = 1;
                                    StyleSpan styleSpan = new StyleSpan(i6);
                                    i = 33;
                                    spannableStringBuilder.setSpan(styleSpan, intValue, intValue2, 33);
                                } else {
                                    i9 = 1;
                                }
                            }
                            i6 = (i10 == i9 ? i9 : 0) | (M2.i == i9 ? 2 : 0);
                            StyleSpan styleSpan2 = new StyleSpan(i6);
                            i = 33;
                            spannableStringBuilder.setSpan(styleSpan2, intValue, intValue2, 33);
                        } else {
                            i = 33;
                        }
                        if (M2.f == i9) {
                            spannableStringBuilder.setSpan(new StrikethroughSpan(), intValue, intValue2, i);
                        }
                        if (M2.g == i9) {
                            spannableStringBuilder.setSpan(new UnderlineSpan(), intValue, intValue2, i);
                        }
                        if (M2.c) {
                            if (!M2.c) {
                                xq0.q("Font color has not been defined.");
                                return;
                            }
                            w1g.o(spannableStringBuilder, new ForegroundColorSpan(M2.b), intValue, intValue2);
                        }
                        if (M2.e) {
                            if (!M2.e) {
                                xq0.q("Background color has not been defined.");
                                return;
                            }
                            w1g.o(spannableStringBuilder, new BackgroundColorSpan(M2.d), intValue, intValue2);
                        }
                        if (M2.a != null) {
                            w1g.o(spannableStringBuilder, new TypefaceSpan(M2.a), intValue, intValue2);
                        }
                        mas masVar = M2.r;
                        if (masVar != null) {
                            int i11 = masVar.a;
                            if (i11 == -1) {
                                i11 = (i7 == 2 || i7 == 1) ? 3 : 1;
                                i5 = 1;
                            } else {
                                i5 = masVar.b;
                            }
                            int i12 = masVar.c;
                            if (i12 == -2) {
                                i12 = 1;
                            }
                            w1g.o(spannableStringBuilder, new nas(i11, i5, i12), intValue, intValue2);
                        }
                        int i13 = M2.m;
                        if (i13 == 2) {
                            ibt ibtVar2 = this.j;
                            while (true) {
                                if (ibtVar2 == null) {
                                    ibtVar2 = null;
                                    break;
                                }
                                lbt M3 = o8g.M(ibtVar2.f, ibtVar2.g, map2);
                                if (M3 != null && M3.m == 1) {
                                    break;
                                } else {
                                    ibtVar2 = ibtVar2.j;
                                }
                            }
                            if (ibtVar2 != null) {
                                ArrayDeque arrayDeque = new ArrayDeque();
                                arrayDeque.push(ibtVar2);
                                while (true) {
                                    if (arrayDeque.isEmpty()) {
                                        ibtVar = null;
                                        break;
                                    }
                                    ibt ibtVar3 = (ibt) arrayDeque.pop();
                                    lbt M4 = o8g.M(ibtVar3.f, ibtVar3.g, map2);
                                    if (M4 != null && M4.m == 3) {
                                        ibtVar = ibtVar3;
                                        break;
                                    }
                                    for (int c = ibtVar3.c() - 1; c >= 0; c--) {
                                        arrayDeque.push(ibtVar3.b(c));
                                    }
                                }
                                if (ibtVar != null) {
                                    if (ibtVar.c() == 1) {
                                        i2 = 0;
                                        if (ibtVar.b(0).b != null) {
                                            String str5 = ibtVar.b(0).b;
                                            int i14 = dvt.a;
                                            lbt M5 = o8g.M(ibtVar.f, ibtVar.g, map2);
                                            int i15 = M5 != null ? M5.n : -1;
                                            if (i15 == -1 && (M = o8g.M(ibtVar2.f, ibtVar2.g, map2)) != null) {
                                                i15 = M.n;
                                            }
                                            spannableStringBuilder.setSpan(new gjo(str5, i15), intValue, intValue2, 33);
                                            if (M2.q == 1) {
                                                w1g.o(spannableStringBuilder, new h3e(), intValue, intValue2);
                                            }
                                            i3 = M2.j;
                                            float f2 = 100.0f;
                                            if (i3 == 1) {
                                                it = it2;
                                                f = 100.0f;
                                                w1g.o(spannableStringBuilder, new AbsoluteSizeSpan((int) M2.k, true), intValue, intValue2);
                                            } else if (i3 == 2) {
                                                it = it2;
                                                f = 100.0f;
                                                w1g.o(spannableStringBuilder, new RelativeSizeSpan(M2.k), intValue, intValue2);
                                            } else if (i3 != 3) {
                                                it = it2;
                                                f = 100.0f;
                                            } else {
                                                float f3 = M2.k / 100.0f;
                                                RelativeSizeSpan[] relativeSizeSpanArr = (RelativeSizeSpan[]) spannableStringBuilder.getSpans(intValue, intValue2, RelativeSizeSpan.class);
                                                int length = relativeSizeSpanArr.length;
                                                int i16 = i2;
                                                float f4 = f3;
                                                int i17 = i16;
                                                while (i17 < length) {
                                                    float f5 = f2;
                                                    RelativeSizeSpan relativeSizeSpan = relativeSizeSpanArr[i17];
                                                    Iterator it3 = it2;
                                                    if (spannableStringBuilder.getSpanStart(relativeSizeSpan) <= intValue && spannableStringBuilder.getSpanEnd(relativeSizeSpan) >= intValue2) {
                                                        f4 = relativeSizeSpan.getSizeChange() * f4;
                                                    }
                                                    if (spannableStringBuilder.getSpanStart(relativeSizeSpan) == intValue && spannableStringBuilder.getSpanEnd(relativeSizeSpan) == intValue2) {
                                                        i4 = i17;
                                                        if (spannableStringBuilder.getSpanFlags(relativeSizeSpan) == 33) {
                                                            spannableStringBuilder.removeSpan(relativeSizeSpan);
                                                        }
                                                    } else {
                                                        i4 = i17;
                                                    }
                                                    i17 = i4 + 1;
                                                    f2 = f5;
                                                    it2 = it3;
                                                }
                                                it = it2;
                                                f = f2;
                                                spannableStringBuilder.setSpan(new RelativeSizeSpan(f4), intValue, intValue2, 33);
                                            }
                                            if ("p".equals(this.a)) {
                                                float f6 = M2.s;
                                                if (f6 != Float.MAX_VALUE) {
                                                    qv6Var.q = (f6 * (-90.0f)) / f;
                                                }
                                                Layout.Alignment alignment = M2.o;
                                                if (alignment != null) {
                                                    qv6Var.c = alignment;
                                                }
                                                Layout.Alignment alignment2 = M2.p;
                                                if (alignment2 != null) {
                                                    qv6Var.d = alignment2;
                                                }
                                            }
                                            it2 = it;
                                        }
                                    } else {
                                        i2 = 0;
                                    }
                                    vq1.Y("TtmlRenderUtil", "Skipping rubyText node without exactly one text child.");
                                    if (M2.q == 1) {
                                    }
                                    i3 = M2.j;
                                    float f22 = 100.0f;
                                    if (i3 == 1) {
                                    }
                                    if ("p".equals(this.a)) {
                                    }
                                    it2 = it;
                                }
                            }
                        } else if (i13 == 3 || i13 == 4) {
                            spannableStringBuilder.setSpan(new fx7(), intValue, intValue2, 33);
                        }
                        i2 = 0;
                        if (M2.q == 1) {
                        }
                        i3 = M2.j;
                        float f222 = 100.0f;
                        if (i3 == 1) {
                        }
                        if ("p".equals(this.a)) {
                        }
                        it2 = it;
                    }
                }
                it = it2;
                it2 = it;
            }
            int i18 = 0;
            while (i18 < c()) {
                b(i18).h(j, map2, hashMap, str3, treeMap);
                i18++;
                map2 = map;
            }
        }
    }

    public final void i(long j, boolean z, String str, TreeMap treeMap) {
        boolean z2;
        TreeMap treeMap2;
        long j2;
        HashMap hashMap = this.k;
        hashMap.clear();
        HashMap hashMap2 = this.l;
        hashMap2.clear();
        String str2 = this.a;
        if ("metadata".equals(str2)) {
            return;
        }
        String str3 = this.h;
        String str4 = "".equals(str3) ? str : str3;
        if (this.c && z) {
            SpannableStringBuilder e = e(str4, treeMap);
            String str5 = this.b;
            str5.getClass();
            e.append((CharSequence) str5);
            return;
        }
        if ("br".equals(str2) && z) {
            e(str4, treeMap).append('\n');
            return;
        }
        if (f(j)) {
            for (Map.Entry entry : treeMap.entrySet()) {
                String str6 = (String) entry.getKey();
                CharSequence charSequence = ((qv6) entry.getValue()).a;
                charSequence.getClass();
                hashMap.put(str6, Integer.valueOf(charSequence.length()));
            }
            boolean equals = "p".equals(str2);
            for (int i = 0; i < c(); i++) {
                ibt b = b(i);
                if (z || equals) {
                    z2 = true;
                    treeMap2 = treeMap;
                    j2 = j;
                } else {
                    z2 = false;
                    j2 = j;
                    treeMap2 = treeMap;
                }
                b.i(j2, z2, str4, treeMap2);
            }
            if (equals) {
                SpannableStringBuilder e2 = e(str4, treeMap);
                int length = e2.length() - 1;
                while (length >= 0 && e2.charAt(length) == ' ') {
                    length--;
                }
                if (length >= 0 && e2.charAt(length) != '\n') {
                    e2.append('\n');
                }
            }
            for (Map.Entry entry2 : treeMap.entrySet()) {
                String str7 = (String) entry2.getKey();
                CharSequence charSequence2 = ((qv6) entry2.getValue()).a;
                charSequence2.getClass();
                hashMap2.put(str7, Integer.valueOf(charSequence2.length()));
            }
        }
    }
}
