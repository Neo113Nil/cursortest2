package com.instagram.common.viewpoint.core;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.text.SpannableStringBuilder;
import android.util.Base64;
import android.util.Pair;
import com.anythink.basead.exoplayer.b;
import com.anythink.expressad.video.module.a.a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

/* loaded from: assets/audience_network/classes2.dex */
public final class KM {
    public static byte[] A0D;
    public static String[] A0E = {"GeuvjWmU0qMIecUET3rH1sSpSiCCpV8d", "VWuGBdV", "r1UddSi70yifv9lgmWBFhDm81yvqf6sz", "XTFXH6doUzlPXpn0lOcCpEMXSJ", "Gs3RvICYSdgYtTZ", "LUo1PxiU5xdJ1hZxjmijWXp8gfNxa8cO", "PBxwyL5R7nlTE13P8yY94OOBBe", "AYtcaoWRC0gFrEQm0SEPSBapgfKgyhaj"};
    public List<KM> A00;
    public final long A01;
    public final long A02;
    public final KM A03;
    public final KT A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final boolean A09;
    public final HashMap<String, Integer> A0A;
    public final HashMap<String, Integer> A0B;
    public final String[] A0C;

    public static String A03(int i, int i4, int i6) {
        byte[] copyOfRange = Arrays.copyOfRange(A0D, i, i + i4);
        int i9 = 0;
        while (true) {
            int length = copyOfRange.length;
            if (A0E[1].length() == 19) {
                throw new RuntimeException();
            }
            A0E[1] = "X7T2v9MzXPQN9wm4iApZn5l";
            if (i9 >= length) {
                return new String(copyOfRange);
            }
            copyOfRange[i9] = (byte) ((copyOfRange[i9] ^ i6) ^ 80);
            i9++;
        }
    }

    public static void A04() {
        A0D = new byte[]{30, 14, 38, 43, 52, 92, 84, 69, 80, 85, 80, 69, 80, 95};
    }

    static {
        A04();
    }

    public KM(String str, String str2, long j6, long j9, KT kt, String[] strArr, String str3, String str4, KM km) {
        this.A07 = str;
        this.A08 = str2;
        this.A05 = str4;
        this.A04 = kt;
        this.A0C = strArr;
        this.A09 = str2 != null;
        this.A02 = j6;
        this.A01 = j9;
        this.A06 = (String) AbstractC06443y.A01(str3);
        this.A03 = km;
        this.A0B = new HashMap<>();
        this.A0A = new HashMap<>();
    }

    public static SpannableStringBuilder A00(String str, Map<String, C06343o> map) {
        if (!map.containsKey(str)) {
            C06343o c06343o = new C06343o();
            c06343o.A0G(new SpannableStringBuilder());
            map.put(str, c06343o);
        }
        C06343o regionOutput = map.get(str);
        return (SpannableStringBuilder) AbstractC06443y.A01(regionOutput.A0I());
    }

    public static KM A01(String str) {
        return new KM(null, KO.A04(str), b.f7168b, b.f7168b, null, null, A03(0, 0, 119), null, null);
    }

    public static KM A02(String str, long j6, long j9, KT kt, String[] strArr, String str2, String str3, KM km) {
        return new KM(str, null, j6, j9, kt, strArr, str2, str3, km);
    }

    private void A05(long j6, String str, List<Pair<String, String>> regionImageList) {
        if (!A03(0, 0, 119).equals(this.A06)) {
            str = this.A06;
        }
        if (A0B(j6)) {
            String A03 = A03(2, 3, 18);
            String resolvedRegionId = this.A07;
            if (A03.equals(resolvedRegionId)) {
                String resolvedRegionId2 = this.A05;
                if (resolvedRegionId2 != null) {
                    regionImageList.add(new Pair<>(str, this.A05));
                    return;
                }
            }
        }
        for (int i = 0; i < A0C(); i++) {
            A0D(i).A05(j6, str, regionImageList);
        }
    }

    /* JADX WARN: Incorrect condition in loop: B:24:0x0089 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void A06(long j6, Map<String, KT> map, Map<String, KN> map2, String str, Map<String, C06343o> map3) {
        int end;
        String str2 = str;
        if (A0B(j6)) {
            if (!A03(0, 0, 119).equals(this.A06)) {
                str2 = this.A06;
            }
            for (Map.Entry<String, Integer> entry : this.A0A.entrySet()) {
                String key = entry.getKey();
                if (this.A0B.containsKey(key)) {
                    end = this.A0B.get(key).intValue();
                } else {
                    end = 0;
                }
                int intValue = entry.getValue().intValue();
                if (end != intValue) {
                    A09(map, (C06343o) AbstractC06443y.A01(map3.get(key)), end, intValue, ((KN) AbstractC06443y.A01(map2.get(str2))).A08);
                }
            }
            for (int i = 0; i < i; i++) {
                A0D(i).A06(j6, map, map2, str2, map3);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x00ec, code lost:
    
        if (r14 == false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00ee, code lost:
    
        if (r4 == false) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00f7, code lost:
    
        r8 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00f0, code lost:
    
        r8 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0100, code lost:
    
        if (r14 == false) goto L30;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void A07(long j6, boolean z6, String str, Map<String, C06343o> map) {
        boolean z9;
        String str2 = str;
        this.A0B.clear();
        this.A0A.clear();
        if (A03(5, 8, 97).equals(this.A07)) {
            return;
        }
        if (!A03(0, 0, 119).equals(this.A06)) {
            str2 = this.A06;
        }
        if (this.A09 && z6) {
            SpannableStringBuilder A00 = A00(str2, map);
            String resolvedRegionId = this.A08;
            A00.append((CharSequence) AbstractC06443y.A01(resolvedRegionId));
            return;
        }
        String A03 = A03(0, 2, 44);
        String resolvedRegionId2 = this.A07;
        if (A03.equals(resolvedRegionId2) && z6) {
            SpannableStringBuilder A002 = A00(str2, map);
            String[] strArr = A0E;
            if (strArr[0].charAt(26) == strArr[2].charAt(26)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0E;
            strArr2[5] = "DvePMvlINfUrHf8oCshP3y2zgWJgm1y9";
            strArr2[7] = "g33vhajkRJhloC0qEKLO4Zm1g9rQEkrd";
            A002.append('\n');
            return;
        }
        if (!A0B(j6)) {
            return;
        }
        for (Map.Entry<String, C06343o> entry : map.entrySet()) {
            this.A0B.put(entry.getKey(), Integer.valueOf(((CharSequence) AbstractC06443y.A01(entry.getValue().A0I())).length()));
        }
        String A032 = A03(13, 1, a.f22515R);
        String resolvedRegionId3 = this.A07;
        boolean equals = A032.equals(resolvedRegionId3);
        for (int i = 0; i < A0C(); i++) {
            KM A0D2 = A0D(i);
            String[] strArr3 = A0E;
            String str3 = strArr3[3];
            String resolvedRegionId4 = strArr3[6];
            if (str3.length() == resolvedRegionId4.length()) {
                A0E[1] = "BxcnzhC5XqKLAs";
            }
            A0D2.A07(j6, z9, str2, map);
        }
        if (equals) {
            KO.A07(A00(str2, map));
        }
        for (Map.Entry<String, C06343o> entry2 : map.entrySet()) {
            HashMap<String, Integer> hashMap = this.A0A;
            String key = entry2.getKey();
            C06343o value = entry2.getValue();
            String[] strArr4 = A0E;
            if (strArr4[0].charAt(26) != strArr4[2].charAt(26)) {
                String[] strArr5 = A0E;
                strArr5[3] = "NvsWEQBQe6VAGnQhJA54b4pVjA";
                strArr5[6] = "RDTsakCOEzYFACc9hnpkZM81VS";
                hashMap.put(key, Integer.valueOf(((CharSequence) AbstractC06443y.A01(value.A0I())).length()));
            } else {
                String[] strArr6 = A0E;
                strArr6[5] = "CHxe0vxZr8lPRHvaCG5LBeS6gh9aVBuv";
                strArr6[7] = "HeV50lBh9JGf3GNHX7ZdMbjxgTQZONIp";
                hashMap.put(key, Integer.valueOf(((CharSequence) AbstractC06443y.A01(value.A0I())).length()));
            }
        }
    }

    public static void A08(SpannableStringBuilder spannableStringBuilder) {
        for (KF kf : (KF[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), KF.class)) {
            spannableStringBuilder.replace(spannableStringBuilder.getSpanStart(kf), spannableStringBuilder.getSpanEnd(kf), (CharSequence) A03(0, 0, 119));
        }
        loop1: for (int i = 0; i < spannableStringBuilder.length(); i++) {
            if (spannableStringBuilder.charAt(i) == ' ') {
                int i4 = i + 1;
                while (i4 < spannableStringBuilder.length()) {
                    char charAt = spannableStringBuilder.charAt(i4);
                    String[] strArr = A0E;
                    String str = strArr[5];
                    String str2 = strArr[7];
                    int i6 = str.charAt(24);
                    if (i6 != str2.charAt(24)) {
                        break loop1;
                    }
                    String[] strArr2 = A0E;
                    strArr2[0] = "TbkeKkbvotKRDkL3aJkR6CKPV2CRZepO";
                    strArr2[2] = "HOyzJt7YVHsiDEtesdPQS8q1On7uoMtF";
                    if (charAt != ' ') {
                        break;
                    } else {
                        i4++;
                    }
                }
                int j6 = i + 1;
                String[] strArr3 = A0E;
                String str3 = strArr3[0];
                String str4 = strArr3[2];
                int i9 = str3.charAt(26);
                if (i9 == str4.charAt(26)) {
                    throw new RuntimeException();
                }
                A0E[1] = "2IIAODStabB9";
                int i10 = i4 - j6;
                if (i10 > 0) {
                    spannableStringBuilder.delete(i, i + i10);
                }
            }
        }
        if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(0) == ' ') {
            spannableStringBuilder.delete(0, 1);
        }
        for (int i11 = 0; i11 < spannableStringBuilder.length() - 1; i11++) {
            if (spannableStringBuilder.charAt(i11) == '\n' && spannableStringBuilder.charAt(i11 + 1) == ' ') {
                int i12 = i11 + 1;
                spannableStringBuilder.delete(i12, i11 + 2);
            }
        }
        if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) == ' ') {
            spannableStringBuilder.delete(spannableStringBuilder.length() - 1, spannableStringBuilder.length());
        }
        for (int i13 = 0; i13 < spannableStringBuilder.length() - 1; i13++) {
            if (spannableStringBuilder.charAt(i13) == ' ' && spannableStringBuilder.charAt(i13 + 1) == '\n') {
                spannableStringBuilder.delete(i13, i13 + 1);
            }
        }
        if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) == '\n') {
            spannableStringBuilder.delete(spannableStringBuilder.length() - 1, spannableStringBuilder.length());
        }
    }

    private void A09(Map<String, KT> map, C06343o c06343o, int i, int i4, int i6) {
        KT A02 = KO.A02(this.A04, this.A0C, map);
        SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) c06343o.A0I();
        if (spannableStringBuilder == null) {
            spannableStringBuilder = new SpannableStringBuilder();
            c06343o.A0G(spannableStringBuilder);
        }
        if (A02 != null) {
            KO.A06(spannableStringBuilder, i, i4, A02, this.A03, map, i6);
            if (A03(13, 1, a.f22515R).equals(this.A07)) {
                if (A02.A04() != Float.MAX_VALUE) {
                    c06343o.A05((A02.A04() * (-90.0f)) / 100.0f);
                }
                if (A02.A0C() != null) {
                    c06343o.A0F(A02.A0C());
                }
                if (A02.A0B() != null) {
                    c06343o.A0E(A02.A0B());
                }
            }
        }
    }

    private void A0A(TreeSet<Long> treeSet, boolean z6) {
        boolean equals = A03(13, 1, a.f22515R).equals(this.A07);
        boolean isPNode = A03(2, 3, 18).equals(this.A07);
        if (z6 || equals || (isPNode && this.A05 != null)) {
            if (this.A02 != b.f7168b) {
                treeSet.add(Long.valueOf(this.A02));
            }
            if (this.A01 != b.f7168b) {
                treeSet.add(Long.valueOf(this.A01));
            }
        }
        if (this.A00 == null) {
            return;
        }
        for (int i = 0; i < this.A00.size(); i++) {
            KM km = this.A00.get(i);
            boolean isPNode2 = z6 || equals;
            km.A0A(treeSet, isPNode2);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0034, code lost:
    
        if (r2 != com.anythink.basead.exoplayer.b.f7168b) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final boolean A0B(long j6) {
        if (this.A02 != b.f7168b || this.A01 != b.f7168b) {
            if (this.A02 <= j6) {
                long j9 = this.A01;
                if (A0E[1].length() == 19) {
                    throw new RuntimeException();
                }
                String[] strArr = A0E;
                strArr[5] = "RgXDLQ3a08cIBfoVnl1r1eLIg5MUrfoW";
                strArr[7] = "Ter36j0QNwpTucwH0VATqUwzgkfFz8sj";
            }
            if ((this.A02 != b.f7168b || j6 >= this.A01) && (this.A02 > j6 || j6 >= this.A01)) {
                return false;
            }
        }
        return true;
    }

    public final int A0C() {
        if (this.A00 == null) {
            return 0;
        }
        List<KM> list = this.A00;
        if (A0E[4].length() == 7) {
            throw new RuntimeException();
        }
        A0E[1] = "iiL";
        return list.size();
    }

    public final KM A0D(int i) {
        if (this.A00 != null) {
            return this.A00.get(i);
        }
        throw new IndexOutOfBoundsException();
    }

    public final List<C2370pT> A0E(long j6, Map<String, KT> map, Map<String, KN> map2, Map<String, String> imageMap) {
        List<Pair<String, String>> arrayList = new ArrayList<>();
        A05(j6, this.A06, arrayList);
        TreeMap treeMap = new TreeMap();
        A07(j6, false, this.A06, treeMap);
        A06(j6, map, map2, this.A06, treeMap);
        ArrayList arrayList2 = new ArrayList();
        for (Pair<String, String> pair : arrayList) {
            String str = imageMap.get(pair.second);
            if (str != null) {
                byte[] decode = Base64.decode(str, 0);
                Bitmap decodeByteArray = BitmapFactory.decodeByteArray(decode, 0, decode.length);
                KN kn = (KN) AbstractC06443y.A01(map2.get(pair.first));
                arrayList2.add(new C06343o().A0D(decodeByteArray).A04(kn.A02).A0A(0).A07(kn.A01, 0).A09(kn.A05).A06(kn.A04).A03(kn.A00).A0B(kn.A08).A0H());
            }
        }
        for (Map.Entry entry : treeMap.entrySet()) {
            KN kn2 = (KN) AbstractC06443y.A01(map2.get(entry.getKey()));
            C06343o c06343o = (C06343o) entry.getValue();
            A08((SpannableStringBuilder) AbstractC06443y.A01(c06343o.A0I()));
            c06343o.A07(kn2.A01, kn2.A06);
            c06343o.A09(kn2.A05);
            c06343o.A04(kn2.A02);
            c06343o.A06(kn2.A04);
            c06343o.A08(kn2.A03, kn2.A07);
            c06343o.A0B(kn2.A08);
            arrayList2.add(c06343o.A0H());
        }
        return arrayList2;
    }

    public final void A0F(KM km) {
        if (this.A00 == null) {
            this.A00 = new ArrayList();
        }
        this.A00.add(km);
    }

    public final long[] A0G() {
        TreeSet<Long> treeSet = new TreeSet<>();
        A0A(treeSet, false);
        long[] jArr = new long[treeSet.size()];
        int i = 0;
        Iterator<Long> it = treeSet.iterator();
        while (it.hasNext()) {
            jArr[i] = it.next().longValue();
            i++;
        }
        return jArr;
    }

    public final String[] A0H() {
        return this.A0C;
    }
}
