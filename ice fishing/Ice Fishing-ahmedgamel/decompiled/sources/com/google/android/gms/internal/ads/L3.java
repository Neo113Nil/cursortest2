package com.google.android.gms.internal.ads;

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
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

/* loaded from: classes2.dex */
public final class L3 {

    /* renamed from: a, reason: collision with root package name */
    public final String f26046a;

    /* renamed from: b, reason: collision with root package name */
    public final String f26047b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f26048c;

    /* renamed from: d, reason: collision with root package name */
    public final long f26049d;

    /* renamed from: e, reason: collision with root package name */
    public final long f26050e;

    /* renamed from: f, reason: collision with root package name */
    public final Q3 f26051f;

    /* renamed from: g, reason: collision with root package name */
    public final String[] f26052g;

    /* renamed from: h, reason: collision with root package name */
    public final String f26053h;
    public final String i;

    /* renamed from: j, reason: collision with root package name */
    public final L3 f26054j;

    /* renamed from: k, reason: collision with root package name */
    public final HashMap f26055k;

    /* renamed from: l, reason: collision with root package name */
    public final HashMap f26056l;

    /* renamed from: m, reason: collision with root package name */
    public ArrayList f26057m;

    public L3(String str, String str2, long j6, long j9, Q3 q32, String[] strArr, String str3, String str4, L3 l32) {
        this.f26046a = str;
        this.f26047b = str2;
        this.i = str4;
        this.f26051f = q32;
        this.f26052g = strArr;
        this.f26048c = str2 != null;
        this.f26049d = j6;
        this.f26050e = j9;
        str3.getClass();
        this.f26053h = str3;
        this.f26054j = l32;
        this.f26055k = new HashMap();
        this.f26056l = new HashMap();
    }

    public static L3 a(String str) {
        return new L3(null, str.replaceAll("\r\n", "\n").replaceAll(" *\n *", "\n").replaceAll("\n", " ").replaceAll("[ \t\\x0B\f\r]+", " "), com.anythink.basead.exoplayer.b.f6382b, com.anythink.basead.exoplayer.b.f6382b, null, null, "", null, null);
    }

    public static L3 b(String str, long j6, long j9, Q3 q32, String[] strArr, String str2, String str3, L3 l32) {
        return new L3(str, null, j6, j9, q32, strArr, str2, str3, l32);
    }

    public static SpannableStringBuilder i(String str, TreeMap treeMap) {
        if (!treeMap.containsKey(str)) {
            C3901sj c3901sj = new C3901sj();
            c3901sj.f34119a = new SpannableStringBuilder();
            c3901sj.f34120b = null;
            treeMap.put(str, c3901sj);
        }
        CharSequence charSequence = ((C3901sj) treeMap.get(str)).f34119a;
        charSequence.getClass();
        return (SpannableStringBuilder) charSequence;
    }

    public final boolean c(long j6) {
        long j9 = this.f26049d;
        long j10 = this.f26050e;
        if (j9 == com.anythink.basead.exoplayer.b.f6382b) {
            if (j10 == com.anythink.basead.exoplayer.b.f6382b) {
                return true;
            }
            j9 = -9223372036854775807L;
        }
        if (j9 <= j6 && j10 == com.anythink.basead.exoplayer.b.f6382b) {
            return true;
        }
        if (j9 != com.anythink.basead.exoplayer.b.f6382b || j6 >= j10) {
            return j9 <= j6 && j6 < j10;
        }
        return true;
    }

    public final L3 d(int i) {
        ArrayList arrayList = this.f26057m;
        if (arrayList != null) {
            return (L3) arrayList.get(i);
        }
        throw new IndexOutOfBoundsException();
    }

    public final int e() {
        ArrayList arrayList = this.f26057m;
        if (arrayList == null) {
            return 0;
        }
        return arrayList.size();
    }

    public final void f(TreeSet treeSet, boolean z3) {
        String str = this.f26046a;
        boolean equals = "p".equals(str);
        if (z3 || equals || ("div".equals(str) && this.i != null)) {
            long j6 = this.f26049d;
            if (j6 != com.anythink.basead.exoplayer.b.f6382b) {
                treeSet.add(Long.valueOf(j6));
            }
            long j9 = this.f26050e;
            if (j9 != com.anythink.basead.exoplayer.b.f6382b) {
                treeSet.add(Long.valueOf(j9));
            }
        }
        if (this.f26057m != null) {
            for (int i = 0; i < this.f26057m.size(); i++) {
                L3 l32 = (L3) this.f26057m.get(i);
                boolean z6 = true;
                if (!z3 && !equals) {
                    z6 = false;
                }
                l32.f(treeSet, z6);
            }
        }
    }

    public final void g(long j6, String str, ArrayList arrayList) {
        String str2;
        String str3 = this.f26053h;
        boolean equals = "".equals(str3);
        boolean c9 = c(j6);
        if (true != equals) {
            str = str3;
        }
        if (c9 && "div".equals(this.f26046a) && (str2 = this.i) != null) {
            arrayList.add(new Pair(str, str2));
            return;
        }
        for (int i = 0; i < e(); i++) {
            d(i).g(j6, str, arrayList);
        }
    }

    public final void h(long j6, boolean z3, String str, TreeMap treeMap) {
        long j9;
        boolean z6;
        HashMap hashMap = this.f26055k;
        hashMap.clear();
        HashMap hashMap2 = this.f26056l;
        hashMap2.clear();
        String str2 = this.f26046a;
        if ("metadata".equals(str2)) {
            return;
        }
        String str3 = this.f26053h;
        String str4 = true != "".equals(str3) ? str3 : str;
        if (this.f26048c && z3) {
            SpannableStringBuilder i = i(str4, treeMap);
            String str5 = this.f26047b;
            str5.getClass();
            i.append((CharSequence) str5);
            return;
        }
        if ("br".equals(str2) && z3) {
            i(str4, treeMap).append('\n');
            return;
        }
        if (c(j6)) {
            for (Map.Entry entry : treeMap.entrySet()) {
                String str6 = (String) entry.getKey();
                CharSequence charSequence = ((C3901sj) entry.getValue()).f34119a;
                charSequence.getClass();
                hashMap.put(str6, Integer.valueOf(charSequence.length()));
            }
            boolean equals = "p".equals(str2);
            for (int i6 = 0; i6 < e(); i6++) {
                L3 d2 = d(i6);
                if (z3 || equals) {
                    j9 = j6;
                    z6 = true;
                } else {
                    j9 = j6;
                    z6 = false;
                }
                d2.h(j9, z6, str4, treeMap);
            }
            if (equals) {
                SpannableStringBuilder i9 = i(str4, treeMap);
                int length = i9.length();
                do {
                    length--;
                    if (length < 0) {
                        break;
                    }
                } while (i9.charAt(length) == ' ');
                if (length >= 0 && i9.charAt(length) != '\n') {
                    i9.append('\n');
                }
            }
            for (Map.Entry entry2 : treeMap.entrySet()) {
                String str7 = (String) entry2.getKey();
                CharSequence charSequence2 = ((C3901sj) entry2.getValue()).f34119a;
                charSequence2.getClass();
                hashMap2.put(str7, Integer.valueOf(charSequence2.length()));
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:125:0x0292  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0210  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x021e  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x02ac  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void j(long j6, Map map, HashMap hashMap, String str, TreeMap treeMap) {
        int i;
        int i6;
        L3 l32;
        int i9;
        int i10;
        Q3 a9;
        int i11;
        Iterator it;
        float f3;
        int i12;
        int i13;
        Map map2 = map;
        int i14 = -1;
        int i15 = 1;
        if (c(j6)) {
            String str2 = this.f26053h;
            String str3 = true != "".equals(str2) ? str2 : str;
            Iterator it2 = this.f26056l.entrySet().iterator();
            while (it2.hasNext()) {
                Map.Entry entry = (Map.Entry) it2.next();
                String str4 = (String) entry.getKey();
                HashMap hashMap2 = this.f26055k;
                int intValue = hashMap2.containsKey(str4) ? ((Integer) hashMap2.get(str4)).intValue() : 0;
                int intValue2 = ((Integer) entry.getValue()).intValue();
                if (intValue != intValue2) {
                    C3901sj c3901sj = (C3901sj) treeMap.get(str4);
                    c3901sj.getClass();
                    P3 p32 = (P3) hashMap.get(str3);
                    p32.getClass();
                    Q3 a10 = AbstractC2968bG.a(this.f26051f, this.f26052g, map2);
                    SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) c3901sj.f34119a;
                    if (spannableStringBuilder == null) {
                        spannableStringBuilder = new SpannableStringBuilder();
                        c3901sj.f34119a = spannableStringBuilder;
                        c3901sj.f34120b = null;
                    }
                    if (a10 != null) {
                        int i16 = a10.f26965h;
                        if (((i16 == i14 && a10.i == i14) ? i14 : (i16 == i15 ? i15 : 0) | (a10.i == i15 ? 2 : 0)) != i14) {
                            int i17 = a10.f26965h;
                            if (i17 == i14) {
                                if (a10.i == i14) {
                                    i13 = i14;
                                    i15 = 1;
                                    StyleSpan styleSpan = new StyleSpan(i13);
                                    i = 33;
                                    spannableStringBuilder.setSpan(styleSpan, intValue, intValue2, 33);
                                } else {
                                    i15 = 1;
                                }
                            }
                            i13 = (i17 == i15 ? i15 : 0) | (a10.i == i15 ? 2 : 0);
                            StyleSpan styleSpan2 = new StyleSpan(i13);
                            i = 33;
                            spannableStringBuilder.setSpan(styleSpan2, intValue, intValue2, 33);
                        } else {
                            i = 33;
                        }
                        if (a10.f26963f == i15) {
                            spannableStringBuilder.setSpan(new StrikethroughSpan(), intValue, intValue2, i);
                        }
                        if (a10.f26964g == i15) {
                            spannableStringBuilder.setSpan(new UnderlineSpan(), intValue, intValue2, i);
                        }
                        if (a10.f26960c) {
                            if (!a10.f26960c) {
                                throw new IllegalStateException("Font color has not been defined.");
                            }
                            SK.m(spannableStringBuilder, new ForegroundColorSpan(a10.f26959b), intValue, intValue2);
                        }
                        if (a10.f26962e) {
                            if (!a10.f26962e) {
                                throw new IllegalStateException("Background color has not been defined.");
                            }
                            SK.m(spannableStringBuilder, new BackgroundColorSpan(a10.f26961d), intValue, intValue2);
                        }
                        if (a10.f26958a != null) {
                            SK.m(spannableStringBuilder, new TypefaceSpan(a10.f26958a), intValue, intValue2);
                        }
                        K3 k32 = a10.f26974r;
                        if (k32 != null) {
                            int i18 = k32.f25838a;
                            if (i18 == i14) {
                                int i19 = p32.f26737j;
                                i18 = (i19 == 2 || i19 == 1) ? 3 : 1;
                                i12 = 1;
                            } else {
                                i12 = k32.f25839b;
                            }
                            i6 = i14;
                            int i20 = k32.f25840c;
                            if (i20 == -2) {
                                i20 = 1;
                            }
                            SK.m(spannableStringBuilder, new C2609Ik(i18, i12, i20), intValue, intValue2);
                        } else {
                            i6 = i14;
                        }
                        int i21 = a10.f26969m;
                        if (i21 == 2) {
                            L3 l33 = this.f26054j;
                            while (true) {
                                if (l33 == null) {
                                    l33 = null;
                                    break;
                                }
                                Q3 a11 = AbstractC2968bG.a(l33.f26051f, l33.f26052g, map2);
                                if (a11 != null && a11.f26969m == 1) {
                                    break;
                                } else {
                                    l33 = l33.f26054j;
                                }
                            }
                            if (l33 != null) {
                                ArrayDeque arrayDeque = new ArrayDeque();
                                arrayDeque.push(l33);
                                while (true) {
                                    if (arrayDeque.isEmpty()) {
                                        l32 = null;
                                        break;
                                    }
                                    L3 l34 = (L3) arrayDeque.pop();
                                    Q3 a12 = AbstractC2968bG.a(l34.f26051f, l34.f26052g, map2);
                                    if (a12 != null && a12.f26969m == 3) {
                                        l32 = l34;
                                        break;
                                    }
                                    int e9 = l34.e();
                                    while (true) {
                                        e9--;
                                        if (e9 >= 0) {
                                            arrayDeque.push(l34.d(e9));
                                        }
                                    }
                                }
                                if (l32 != null) {
                                    if (l32.e() != 1 || l32.d(0).f26047b == null) {
                                        AbstractC2968bG.t("TtmlRenderUtil", "Skipping rubyText node without exactly one text child.");
                                    } else {
                                        String str5 = l32.d(0).f26047b;
                                        String str6 = AbstractC3159eu.f29993a;
                                        Q3 a13 = AbstractC2968bG.a(l32.f26051f, l32.f26052g, map2);
                                        if (a13 != null) {
                                            i9 = a13.f26970n;
                                            i10 = i6;
                                        } else {
                                            i9 = i6;
                                            i10 = i9;
                                        }
                                        if (i9 == i10 && (a9 = AbstractC2968bG.a(l33.f26051f, l33.f26052g, map2)) != null) {
                                            i9 = a9.f26970n;
                                        }
                                        spannableStringBuilder.setSpan(new C3741pk(str5, i9), intValue, intValue2, 33);
                                    }
                                    if (a10.f26973q == 1) {
                                        SK.m(spannableStringBuilder, new C3149ek(), intValue, intValue2);
                                    }
                                    i11 = a10.f26966j;
                                    if (i11 != 1) {
                                        it = it2;
                                        f3 = 100.0f;
                                        SK.m(spannableStringBuilder, new AbsoluteSizeSpan((int) a10.f26967k, true), intValue, intValue2);
                                    } else if (i11 == 2) {
                                        it = it2;
                                        f3 = 100.0f;
                                        SK.m(spannableStringBuilder, new RelativeSizeSpan(a10.f26967k), intValue, intValue2);
                                    } else if (i11 != 3) {
                                        it = it2;
                                        f3 = 100.0f;
                                    } else {
                                        float f9 = a10.f26967k / 100.0f;
                                        RelativeSizeSpan[] relativeSizeSpanArr = (RelativeSizeSpan[]) spannableStringBuilder.getSpans(intValue, intValue2, RelativeSizeSpan.class);
                                        int length = relativeSizeSpanArr.length;
                                        f3 = 100.0f;
                                        int i22 = 0;
                                        while (i22 < length) {
                                            RelativeSizeSpan relativeSizeSpan = relativeSizeSpanArr[i22];
                                            Iterator it3 = it2;
                                            if (spannableStringBuilder.getSpanStart(relativeSizeSpan) <= intValue && spannableStringBuilder.getSpanEnd(relativeSizeSpan) >= intValue2) {
                                                f9 = relativeSizeSpan.getSizeChange() * f9;
                                            }
                                            if (spannableStringBuilder.getSpanStart(relativeSizeSpan) == intValue && spannableStringBuilder.getSpanEnd(relativeSizeSpan) == intValue2) {
                                                if (spannableStringBuilder.getSpanFlags(relativeSizeSpan) == 33) {
                                                    spannableStringBuilder.removeSpan(relativeSizeSpan);
                                                }
                                            }
                                            i22++;
                                            it2 = it3;
                                        }
                                        it = it2;
                                        spannableStringBuilder.setSpan(new RelativeSizeSpan(f9), intValue, intValue2, 33);
                                    }
                                    if ("p".equals(this.f26046a)) {
                                        float f10 = a10.f26975s;
                                        if (f10 != Float.MAX_VALUE) {
                                            c3901sj.f34132o = (f10 * (-90.0f)) / f3;
                                        }
                                        Layout.Alignment alignment = a10.f26971o;
                                        if (alignment != null) {
                                            c3901sj.f34121c = alignment;
                                        }
                                        Layout.Alignment alignment2 = a10.f26972p;
                                        if (alignment2 != null) {
                                            c3901sj.f34122d = alignment2;
                                        }
                                    }
                                    map2 = map;
                                    it2 = it;
                                    i14 = -1;
                                    i15 = 1;
                                }
                            }
                        } else if (i21 == 3 || i21 == 4) {
                            spannableStringBuilder.setSpan(new J3(), intValue, intValue2, 33);
                        }
                        if (a10.f26973q == 1) {
                        }
                        i11 = a10.f26966j;
                        if (i11 != 1) {
                        }
                        if ("p".equals(this.f26046a)) {
                        }
                        map2 = map;
                        it2 = it;
                        i14 = -1;
                        i15 = 1;
                    }
                }
                map2 = map;
            }
            for (int i23 = 0; i23 < e(); i23++) {
                d(i23).j(j6, map, hashMap, str3, treeMap);
            }
        }
    }
}
