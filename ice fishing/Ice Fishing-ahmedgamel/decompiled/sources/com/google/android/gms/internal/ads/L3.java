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
    public final String f26846a;

    /* renamed from: b, reason: collision with root package name */
    public final String f26847b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f26848c;

    /* renamed from: d, reason: collision with root package name */
    public final long f26849d;

    /* renamed from: e, reason: collision with root package name */
    public final long f26850e;

    /* renamed from: f, reason: collision with root package name */
    public final Q3 f26851f;

    /* renamed from: g, reason: collision with root package name */
    public final String[] f26852g;

    /* renamed from: h, reason: collision with root package name */
    public final String f26853h;
    public final String i;

    /* renamed from: j, reason: collision with root package name */
    public final L3 f26854j;

    /* renamed from: k, reason: collision with root package name */
    public final HashMap f26855k;

    /* renamed from: l, reason: collision with root package name */
    public final HashMap f26856l;

    /* renamed from: m, reason: collision with root package name */
    public ArrayList f26857m;

    public L3(String str, String str2, long j6, long j9, Q3 q32, String[] strArr, String str3, String str4, L3 l32) {
        this.f26846a = str;
        this.f26847b = str2;
        this.i = str4;
        this.f26851f = q32;
        this.f26852g = strArr;
        this.f26848c = str2 != null;
        this.f26849d = j6;
        this.f26850e = j9;
        str3.getClass();
        this.f26853h = str3;
        this.f26854j = l32;
        this.f26855k = new HashMap();
        this.f26856l = new HashMap();
    }

    public static L3 a(String str) {
        return new L3(null, str.replaceAll("\r\n", "\n").replaceAll(" *\n *", "\n").replaceAll("\n", " ").replaceAll("[ \t\\x0B\f\r]+", " "), com.anythink.basead.exoplayer.b.f7168b, com.anythink.basead.exoplayer.b.f7168b, null, null, "", null, null);
    }

    public static L3 b(String str, long j6, long j9, Q3 q32, String[] strArr, String str2, String str3, L3 l32) {
        return new L3(str, null, j6, j9, q32, strArr, str2, str3, l32);
    }

    public static SpannableStringBuilder i(String str, TreeMap treeMap) {
        if (!treeMap.containsKey(str)) {
            C3924sj c3924sj = new C3924sj();
            c3924sj.f34886a = new SpannableStringBuilder();
            c3924sj.f34887b = null;
            treeMap.put(str, c3924sj);
        }
        CharSequence charSequence = ((C3924sj) treeMap.get(str)).f34886a;
        charSequence.getClass();
        return (SpannableStringBuilder) charSequence;
    }

    public final boolean c(long j6) {
        long j9 = this.f26849d;
        long j10 = this.f26850e;
        if (j9 == com.anythink.basead.exoplayer.b.f7168b) {
            if (j10 == com.anythink.basead.exoplayer.b.f7168b) {
                return true;
            }
            j9 = -9223372036854775807L;
        }
        if (j9 <= j6 && j10 == com.anythink.basead.exoplayer.b.f7168b) {
            return true;
        }
        if (j9 != com.anythink.basead.exoplayer.b.f7168b || j6 >= j10) {
            return j9 <= j6 && j6 < j10;
        }
        return true;
    }

    public final L3 d(int i) {
        ArrayList arrayList = this.f26857m;
        if (arrayList != null) {
            return (L3) arrayList.get(i);
        }
        throw new IndexOutOfBoundsException();
    }

    public final int e() {
        ArrayList arrayList = this.f26857m;
        if (arrayList == null) {
            return 0;
        }
        return arrayList.size();
    }

    public final void f(TreeSet treeSet, boolean z6) {
        String str = this.f26846a;
        boolean equals = "p".equals(str);
        if (z6 || equals || ("div".equals(str) && this.i != null)) {
            long j6 = this.f26849d;
            if (j6 != com.anythink.basead.exoplayer.b.f7168b) {
                treeSet.add(Long.valueOf(j6));
            }
            long j9 = this.f26850e;
            if (j9 != com.anythink.basead.exoplayer.b.f7168b) {
                treeSet.add(Long.valueOf(j9));
            }
        }
        if (this.f26857m != null) {
            for (int i = 0; i < this.f26857m.size(); i++) {
                L3 l32 = (L3) this.f26857m.get(i);
                boolean z9 = true;
                if (!z6 && !equals) {
                    z9 = false;
                }
                l32.f(treeSet, z9);
            }
        }
    }

    public final void g(long j6, String str, ArrayList arrayList) {
        String str2;
        String str3 = this.f26853h;
        boolean equals = "".equals(str3);
        boolean c9 = c(j6);
        if (true != equals) {
            str = str3;
        }
        if (c9 && "div".equals(this.f26846a) && (str2 = this.i) != null) {
            arrayList.add(new Pair(str, str2));
            return;
        }
        for (int i = 0; i < e(); i++) {
            d(i).g(j6, str, arrayList);
        }
    }

    public final void h(long j6, boolean z6, String str, TreeMap treeMap) {
        long j9;
        boolean z9;
        HashMap hashMap = this.f26855k;
        hashMap.clear();
        HashMap hashMap2 = this.f26856l;
        hashMap2.clear();
        String str2 = this.f26846a;
        if ("metadata".equals(str2)) {
            return;
        }
        String str3 = this.f26853h;
        String str4 = true != "".equals(str3) ? str3 : str;
        if (this.f26848c && z6) {
            SpannableStringBuilder i = i(str4, treeMap);
            String str5 = this.f26847b;
            str5.getClass();
            i.append((CharSequence) str5);
            return;
        }
        if ("br".equals(str2) && z6) {
            i(str4, treeMap).append('\n');
            return;
        }
        if (c(j6)) {
            for (Map.Entry entry : treeMap.entrySet()) {
                String str6 = (String) entry.getKey();
                CharSequence charSequence = ((C3924sj) entry.getValue()).f34886a;
                charSequence.getClass();
                hashMap.put(str6, Integer.valueOf(charSequence.length()));
            }
            boolean equals = "p".equals(str2);
            for (int i4 = 0; i4 < e(); i4++) {
                L3 d9 = d(i4);
                if (z6 || equals) {
                    j9 = j6;
                    z9 = true;
                } else {
                    j9 = j6;
                    z9 = false;
                }
                d9.h(j9, z9, str4, treeMap);
            }
            if (equals) {
                SpannableStringBuilder i6 = i(str4, treeMap);
                int length = i6.length();
                do {
                    length--;
                    if (length < 0) {
                        break;
                    }
                } while (i6.charAt(length) == ' ');
                if (length >= 0 && i6.charAt(length) != '\n') {
                    i6.append('\n');
                }
            }
            for (Map.Entry entry2 : treeMap.entrySet()) {
                String str7 = (String) entry2.getKey();
                CharSequence charSequence2 = ((C3924sj) entry2.getValue()).f34886a;
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
        int i4;
        L3 l32;
        int i6;
        int i9;
        Q3 a9;
        int i10;
        Iterator it;
        float f2;
        int i11;
        int i12;
        Map map2 = map;
        int i13 = -1;
        int i14 = 1;
        if (c(j6)) {
            String str2 = this.f26853h;
            String str3 = true != "".equals(str2) ? str2 : str;
            Iterator it2 = this.f26856l.entrySet().iterator();
            while (it2.hasNext()) {
                Map.Entry entry = (Map.Entry) it2.next();
                String str4 = (String) entry.getKey();
                HashMap hashMap2 = this.f26855k;
                int intValue = hashMap2.containsKey(str4) ? ((Integer) hashMap2.get(str4)).intValue() : 0;
                int intValue2 = ((Integer) entry.getValue()).intValue();
                if (intValue != intValue2) {
                    C3924sj c3924sj = (C3924sj) treeMap.get(str4);
                    c3924sj.getClass();
                    P3 p32 = (P3) hashMap.get(str3);
                    p32.getClass();
                    Q3 a10 = AbstractC2991bG.a(this.f26851f, this.f26852g, map2);
                    SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) c3924sj.f34886a;
                    if (spannableStringBuilder == null) {
                        spannableStringBuilder = new SpannableStringBuilder();
                        c3924sj.f34886a = spannableStringBuilder;
                        c3924sj.f34887b = null;
                    }
                    if (a10 != null) {
                        int i15 = a10.f27752h;
                        if (((i15 == i13 && a10.i == i13) ? i13 : (i15 == i14 ? i14 : 0) | (a10.i == i14 ? 2 : 0)) != i13) {
                            int i16 = a10.f27752h;
                            if (i16 == i13) {
                                if (a10.i == i13) {
                                    i12 = i13;
                                    i14 = 1;
                                    StyleSpan styleSpan = new StyleSpan(i12);
                                    i = 33;
                                    spannableStringBuilder.setSpan(styleSpan, intValue, intValue2, 33);
                                } else {
                                    i14 = 1;
                                }
                            }
                            i12 = (i16 == i14 ? i14 : 0) | (a10.i == i14 ? 2 : 0);
                            StyleSpan styleSpan2 = new StyleSpan(i12);
                            i = 33;
                            spannableStringBuilder.setSpan(styleSpan2, intValue, intValue2, 33);
                        } else {
                            i = 33;
                        }
                        if (a10.f27750f == i14) {
                            spannableStringBuilder.setSpan(new StrikethroughSpan(), intValue, intValue2, i);
                        }
                        if (a10.f27751g == i14) {
                            spannableStringBuilder.setSpan(new UnderlineSpan(), intValue, intValue2, i);
                        }
                        if (a10.f27747c) {
                            if (!a10.f27747c) {
                                throw new IllegalStateException("Font color has not been defined.");
                            }
                            SK.m(spannableStringBuilder, new ForegroundColorSpan(a10.f27746b), intValue, intValue2);
                        }
                        if (a10.f27749e) {
                            if (!a10.f27749e) {
                                throw new IllegalStateException("Background color has not been defined.");
                            }
                            SK.m(spannableStringBuilder, new BackgroundColorSpan(a10.f27748d), intValue, intValue2);
                        }
                        if (a10.f27745a != null) {
                            SK.m(spannableStringBuilder, new TypefaceSpan(a10.f27745a), intValue, intValue2);
                        }
                        K3 k32 = a10.f27761r;
                        if (k32 != null) {
                            int i17 = k32.f26590a;
                            if (i17 == i13) {
                                int i18 = p32.f27520j;
                                i17 = (i18 == 2 || i18 == 1) ? 3 : 1;
                                i11 = 1;
                            } else {
                                i11 = k32.f26591b;
                            }
                            i4 = i13;
                            int i19 = k32.f26592c;
                            if (i19 == -2) {
                                i19 = 1;
                            }
                            SK.m(spannableStringBuilder, new C2629Ik(i17, i11, i19), intValue, intValue2);
                        } else {
                            i4 = i13;
                        }
                        int i20 = a10.f27756m;
                        if (i20 == 2) {
                            L3 l33 = this.f26854j;
                            while (true) {
                                if (l33 == null) {
                                    l33 = null;
                                    break;
                                }
                                Q3 a11 = AbstractC2991bG.a(l33.f26851f, l33.f26852g, map2);
                                if (a11 != null && a11.f27756m == 1) {
                                    break;
                                } else {
                                    l33 = l33.f26854j;
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
                                    Q3 a12 = AbstractC2991bG.a(l34.f26851f, l34.f26852g, map2);
                                    if (a12 != null && a12.f27756m == 3) {
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
                                    if (l32.e() != 1 || l32.d(0).f26847b == null) {
                                        AbstractC2991bG.t("TtmlRenderUtil", "Skipping rubyText node without exactly one text child.");
                                    } else {
                                        String str5 = l32.d(0).f26847b;
                                        String str6 = AbstractC3182eu.f30782a;
                                        Q3 a13 = AbstractC2991bG.a(l32.f26851f, l32.f26852g, map2);
                                        if (a13 != null) {
                                            i6 = a13.f27757n;
                                            i9 = i4;
                                        } else {
                                            i6 = i4;
                                            i9 = i6;
                                        }
                                        if (i6 == i9 && (a9 = AbstractC2991bG.a(l33.f26851f, l33.f26852g, map2)) != null) {
                                            i6 = a9.f27757n;
                                        }
                                        spannableStringBuilder.setSpan(new C3764pk(str5, i6), intValue, intValue2, 33);
                                    }
                                    if (a10.f27760q == 1) {
                                        SK.m(spannableStringBuilder, new C3172ek(), intValue, intValue2);
                                    }
                                    i10 = a10.f27753j;
                                    if (i10 != 1) {
                                        it = it2;
                                        f2 = 100.0f;
                                        SK.m(spannableStringBuilder, new AbsoluteSizeSpan((int) a10.f27754k, true), intValue, intValue2);
                                    } else if (i10 == 2) {
                                        it = it2;
                                        f2 = 100.0f;
                                        SK.m(spannableStringBuilder, new RelativeSizeSpan(a10.f27754k), intValue, intValue2);
                                    } else if (i10 != 3) {
                                        it = it2;
                                        f2 = 100.0f;
                                    } else {
                                        float f9 = a10.f27754k / 100.0f;
                                        RelativeSizeSpan[] relativeSizeSpanArr = (RelativeSizeSpan[]) spannableStringBuilder.getSpans(intValue, intValue2, RelativeSizeSpan.class);
                                        int length = relativeSizeSpanArr.length;
                                        f2 = 100.0f;
                                        int i21 = 0;
                                        while (i21 < length) {
                                            RelativeSizeSpan relativeSizeSpan = relativeSizeSpanArr[i21];
                                            Iterator it3 = it2;
                                            if (spannableStringBuilder.getSpanStart(relativeSizeSpan) <= intValue && spannableStringBuilder.getSpanEnd(relativeSizeSpan) >= intValue2) {
                                                f9 = relativeSizeSpan.getSizeChange() * f9;
                                            }
                                            if (spannableStringBuilder.getSpanStart(relativeSizeSpan) == intValue && spannableStringBuilder.getSpanEnd(relativeSizeSpan) == intValue2) {
                                                if (spannableStringBuilder.getSpanFlags(relativeSizeSpan) == 33) {
                                                    spannableStringBuilder.removeSpan(relativeSizeSpan);
                                                }
                                            }
                                            i21++;
                                            it2 = it3;
                                        }
                                        it = it2;
                                        spannableStringBuilder.setSpan(new RelativeSizeSpan(f9), intValue, intValue2, 33);
                                    }
                                    if ("p".equals(this.f26846a)) {
                                        float f10 = a10.f27762s;
                                        if (f10 != Float.MAX_VALUE) {
                                            c3924sj.f34899o = (f10 * (-90.0f)) / f2;
                                        }
                                        Layout.Alignment alignment = a10.f27758o;
                                        if (alignment != null) {
                                            c3924sj.f34888c = alignment;
                                        }
                                        Layout.Alignment alignment2 = a10.f27759p;
                                        if (alignment2 != null) {
                                            c3924sj.f34889d = alignment2;
                                        }
                                    }
                                    map2 = map;
                                    it2 = it;
                                    i13 = -1;
                                    i14 = 1;
                                }
                            }
                        } else if (i20 == 3 || i20 == 4) {
                            spannableStringBuilder.setSpan(new J3(), intValue, intValue2, 33);
                        }
                        if (a10.f27760q == 1) {
                        }
                        i10 = a10.f27753j;
                        if (i10 != 1) {
                        }
                        if ("p".equals(this.f26846a)) {
                        }
                        map2 = map;
                        it2 = it;
                        i13 = -1;
                        i14 = 1;
                    }
                }
                map2 = map;
            }
            for (int i22 = 0; i22 < e(); i22++) {
                d(i22).j(j6, map, hashMap, str3, treeMap);
            }
        }
    }
}
