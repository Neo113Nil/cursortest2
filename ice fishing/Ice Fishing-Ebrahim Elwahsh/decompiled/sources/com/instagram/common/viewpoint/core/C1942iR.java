package com.instagram.common.viewpoint.core;

import com.anythink.basead.b.b.j;
import com.anythink.core.common.s;
import com.anythink.core.common.s.a.c;
import com.anythink.expressad.foundation.d.e;
import com.anythink.expressad.video.module.a.a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\n\u001a\u0004\u0018\u00010\t2\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\fH\u0007J\"\u0010\u000e\u001a\u0004\u0018\u00010\t2\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f2\u0006\u0010\u000f\u001a\u00020\u0010H\u0007J\u001a\u0010\u0011\u001a\u0004\u0018\u00010\t2\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\fH\u0007J2\u0010\u0012\u001a\u0004\u0018\u00010\t2\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f2\u0006\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u0010H\u0003J&\u0010\u0015\u001a\u00020\u00162\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u0005H\u0002J&\u0010\u0017\u001a\u00020\u00182\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u0005H\u0002J\u0016\u0010\u0019\u001a\u00020\t2\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00180\fH\u0002J\u0010\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u001c\u001a\u00020\u0018H\u0002J\u001c\u0010\u001d\u001a\u00020\u00162\n\u0010\u001e\u001a\u00060\u001fj\u0002` 2\u0006\u0010!\u001a\u00020\u0018H\u0002J \u0010\"\u001a\u00020\t2\u0016\u0010#\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\t\u0012\u0006\u0012\u0004\u0018\u00010\u00010$H\u0002J\u0010\u0010%\u001a\u00020\t2\u0006\u0010\u001e\u001a\u00020\tH\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082T¢\u0006\u0002\n\u0000¨\u0006&"}, d2 = {"Lcom/facebook/video/framebasedlogging/FrameBasedLogger$Companion;", "", "<init>", "()V", "FRAME_DATA_ENCODING_VERSION", "", "FRAME_DATA_MAX_LENGTH_CAP", "FRAME_DATA_MAX_NUM_OF_FRAMES_IN_ONE_JSON_STRING", "FRAME_DATA_JSON_STRING_DELIMITER", "", "encodeVideoFrameData", e.f18821j, "", "Lcom/facebook/video/framebasedlogging/VideoFrameInfo;", "encodeVideoFrameDataWithViewability", "isViewabilityEnabled", "", "encodeVideoFrameDataWithinMaxNumOfFrames", "encodeVideoFrameDataInternal", "startIndex", "length", "transformFrameDelta", "", "transformBaseDelta", "", "toVarintZigZagBase64", "framesTimestampList", "encodeZigZag", "val", "putVarint64", s.f16407a, "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "v", "toJsonStr", "frameDataMap", "", "encode", "fbandroid.java.com.facebook.video.framebasedlogging.framebasedlogging_an"}, k = 1, mv = {2, 1, 0}, xi = j.f5973W)
/* renamed from: com.facebook.ads.redexgen.X.iR, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C1942iR {
    public static byte[] A00;
    public static String[] A01 = {"adqjJWKIDwjAAy", "cw9Vnez3nJ8pqsnuDUkgXOpF8rslrf", "Havhpk4Y1gg0WgtXW", "mNHAa5sEdSRckmXK", "QxVW3xmlxKst1GqVF", "5PefWRHd6Gh2UjYCRwne9THrqV7gX4zU", "GTMqvhsWxrHsLf4wXFdmS1hSOthAR4ub", "KzrQwwA6xfmA0AB"};

    public /* synthetic */ C1942iR(AbstractC2414qZ abstractC2414qZ) {
        this();
    }

    public static String A02(int i, int i4, int i9) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i4);
        for (int i10 = 0; i10 < copyOfRange.length; i10++) {
            copyOfRange[i10] = (byte) ((copyOfRange[i10] ^ i9) ^ a.f21914z);
        }
        return new String(copyOfRange);
    }

    public static void A07() {
        A00 = new byte[]{77, 78, 79, 72, 73, 74, 75, 68, 69, 70, 71, c.f16475b, 65, 66, 67, 92, 93, 94, 95, 88, 89, 90, 91, 84, 85, 86, 109, 110, 111, 104, 105, 106, 107, 100, 101, 102, 103, 96, 97, 98, 99, 124, 125, 126, Byte.MAX_VALUE, 120, 121, 122, 123, 116, 117, 118, 60, 61, 62, c.f16476c, 56, 57, 58, 59, 52, 53, 39, 35, 66, 65, 83, 69, 100, 69, 76, 84, 65, 114, 36, 40, 15, 59, 42, 39, 33, 16, 32, 31, 19, 1, 23, 20, 26, 19, 67, 70, 9, 1, 15, 21, 53, 9, 19, 8, 2, 41, 8, 75, 81, 116, 75, 71, 85, 67, c.f16475b, 78, 71, 23, 18, 83, 72, 116, 83, 85, 78, 73, c.f16475b, 15, 9, 9, 9, 14, 6, 21, 2, 3, 25, 31, 30, 18, 75, 12, 27, 27, 75, 83, 75, 58, 32, 51, 44, 54, 44, 49, 42, 44, 44, 45, 54, 36, 40, 49, 54, 42, 40, 57, 75, 20};
    }

    static {
        A07();
    }

    public C1942iR() {
    }

    private final long A00(long j9) {
        return (j9 << 1) ^ (j9 >> 63);
    }

    private final long A01(List<C1944iT> list, int i, int i4) {
        HashMap hashMap = new HashMap();
        int i9 = i + i4;
        for (int i10 = i + 1; i10 < i9; i10++) {
            long a03 = list.get(i10).getA03();
            long a01 = list.get(i10).getA01();
            Long valueOf = Long.valueOf(a03);
            Long valueOf2 = Long.valueOf(a03);
            Object obj = hashMap.get(valueOf2);
            if (obj == null) {
                obj = 0;
                hashMap.put(valueOf2, obj);
            }
            hashMap.put(valueOf, Integer.valueOf(((Number) obj).intValue() + 1));
            Long valueOf3 = Long.valueOf(a01);
            Long valueOf4 = Long.valueOf(a01);
            Object obj2 = hashMap.get(valueOf4);
            if (obj2 == null) {
                obj2 = 0;
                hashMap.put(valueOf4, obj2);
            }
            hashMap.put(valueOf3, Integer.valueOf(((Number) obj2).intValue() + 1));
        }
        long j9 = 3333;
        int baseCountCurr = 0;
        for (Map.Entry entry : hashMap.entrySet()) {
            long longValue = ((Number) entry.getKey()).longValue();
            int intValue = ((Number) entry.getValue()).intValue();
            if (baseCountCurr < intValue) {
                baseCountCurr = intValue;
                j9 = longValue;
            }
        }
        int i11 = i + i4;
        for (int i12 = i + 1; i12 < i11; i12++) {
            list.get(i12).A09(list.get(i12).getA03() - j9);
            list.get(i12).A07(list.get(i12).getA01() - j9);
        }
        return j9;
    }

    private final String A03(String str) {
        String A02 = A02(0, 64, 97);
        StringBuilder sb = new StringBuilder(str);
        StringBuilder sb2 = new StringBuilder();
        StringBuilder p6 = new StringBuilder();
        int length = sb.length() % 3;
        if (length > 0) {
            while (length < 3) {
                p6.append('=');
                sb.append((char) 0);
                length++;
            }
        }
        int n22 = 0;
        while (true) {
            int length2 = sb.length();
            String[] strArr = A01;
            if (strArr[6].charAt(29) != strArr[5].charAt(29)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A01;
            strArr2[6] = "c8I6WkBk38UBs7py2rcGfWrh0qBcN4cV";
            strArr2[5] = "diMQGy0StG563mex3KV2JMPYAWT514yw";
            if (n22 < length2) {
                int charAt = (sb.charAt(n22) << 16) + (sb.charAt(n22 + 1) << '\b') + sb.charAt(n22 + 2);
                int n42 = (charAt >> 12) & 63;
                int n32 = (charAt >> 6) & 63;
                StringBuilder sb3 = sb2.append(A02.charAt((charAt >> 18) & 63));
                sb3.append(A02.charAt(n42)).append(A02.charAt(n32)).append(A02.charAt(charAt & 63));
                n22 += 3;
            } else {
                StringBuilder r9 = new StringBuilder();
                String base64chars = sb2.substring(0, sb2.length() - p6.length());
                return r9.append(base64chars).append((Object) p6).toString();
            }
        }
    }

    private final String A04(List<Long> list) {
        StringBuilder sb = new StringBuilder();
        Iterator<Long> it = list.iterator();
        while (it.hasNext()) {
            A08(sb, A00(it.next().longValue()));
        }
        String sb2 = sb.toString();
        C2413qY.A08(sb2, A02(115, 13, 74));
        return A03(sb2);
    }

    private final String A05(List<C1944iT> list, int i, int i4, boolean z8) {
        if (list == null || list.isEmpty() || i < 0 || i >= list.size() || i4 <= 0 || i + i4 > list.size()) {
            return null;
        }
        Map frameDataMap = new HashMap();
        frameDataMap.put(A02(73, 2, 121), list.get(i).A05());
        frameDataMap.put(A02(128, 7, 29), 1);
        boolean z9 = false;
        boolean z10 = false;
        if (i4 > 1) {
            A09(list, i, i4);
            frameDataMap.put(A02(64, 9, 77), Long.valueOf(A01(list, i, i4)));
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            List framesTimestampList = new ArrayList();
            int i9 = i + i4;
            for (int i10 = i + 1; i10 < i9; i10++) {
                arrayList.add(Long.valueOf(list.get(i10).getA03()));
                arrayList.add(Long.valueOf(list.get(i10).getA01()));
                arrayList.add(Long.valueOf(list.get(i10).getA02()));
                arrayList2.add(Long.valueOf(list.get(i10).getA00()));
                if (list.get(i10).getA00() != 0) {
                    z9 = true;
                }
                if (z8) {
                    framesTimestampList.add(Long.valueOf(list.get(i10).getA04()));
                    if (list.get(i10).getA04() != 0) {
                        z10 = true;
                    }
                }
            }
            frameDataMap.put(A02(92, 2, 2), A04(arrayList));
            frameDataMap.put(A02(75, 6, 35), A04(arrayList2));
            frameDataMap.put(A02(94, 9, 11), Boolean.valueOf(z9));
            if (z8) {
                frameDataMap.put(A02(81, 11, 27), A04(framesTimestampList));
                frameDataMap.put(A02(103, 12, 79), Boolean.valueOf(z10));
            }
        }
        String A06 = A06(frameDataMap);
        if (A06.length() > 900000) {
            return A02(135, 29, 4);
        }
        return A06;
    }

    private final String A06(Map<String, ? extends Object> map) {
        JSONObject json = new JSONObject(map);
        String jSONObject = json.toString();
        C2413qY.A08(jSONObject, A02(115, 13, 74));
        return jSONObject;
    }

    private final void A08(StringBuilder sb, long j9) {
        while (j9 >= 128) {
            long j10 = (128 - 1) & j9;
            long v6 = 128;
            j9 >>= 7;
            sb.append((char) (AbstractC2427qr.A00((short) (j10 | v6)) & 65535));
        }
        int A002 = AbstractC2427qr.A00((short) j9) & 65535;
        String[] strArr = A01;
        if (strArr[0].length() == strArr[7].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A01;
        strArr2[3] = "T60Ooc0cJ5Sp1Pqo";
        strArr2[1] = "uvRZm299xuhvmD13tPTGCghGF8GWUX";
        sb.append((char) A002);
    }

    private final void A09(List<C1944iT> list, int i, int i4) {
        long a00;
        int i9 = (i + i4) - 1;
        int i10 = i + 1;
        if (i10 > i9) {
            return;
        }
        while (true) {
            int i11 = i9 - 1;
            list.get(i9).A09(list.get(i9).getA03() - list.get(i11).getA03());
            int i12 = i9 - 1;
            list.get(i9).A07(list.get(i9).getA01() - list.get(i12).getA01());
            int i13 = i9 - 1;
            list.get(i9).A08(list.get(i9).getA02() - list.get(i13).getA02());
            C1944iT c1944iT = list.get(i9);
            int i14 = i9 - 1;
            long j9 = 0;
            if (list.get(i14).getA00() == -1) {
                a00 = 0;
            } else {
                int i15 = i9 - 1;
                a00 = list.get(i9).getA00() - list.get(i15).getA00();
            }
            c1944iT.A06(a00);
            C1944iT c1944iT2 = list.get(i9);
            int i16 = i9 - 1;
            if (list.get(i16).getA04() != -1) {
                int i17 = i9 - 1;
                j9 = list.get(i9).getA04() - list.get(i17).getA04();
            }
            c1944iT2.A0A(j9);
            list.get(i9).A08(list.get(i9).getA02() - list.get(i9).getA01());
            String[] strArr = A01;
            String str = strArr[6];
            String str2 = strArr[5];
            int charAt = str.charAt(29);
            int i18 = str2.charAt(29);
            if (charAt != i18) {
                throw new RuntimeException();
            }
            String[] strArr2 = A01;
            strArr2[2] = "n61ygDvjmVqwwcyNa";
            strArr2[4] = "CJKArLC5kHvee0bz5";
            if (i9 == i10) {
                return;
            } else {
                i9--;
            }
        }
    }

    @JvmStatic
    public final String A0A(List<C1944iT> list) {
        if (list != null) {
            return A05(list, 0, list.size(), false);
        }
        String[] strArr = A01;
        if (strArr[2].length() != strArr[4].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A01;
        strArr2[3] = "x2TjSmR3QrlPzJhh";
        strArr2[1] = "SlNC4q47AflZsduXtHukt2Kcji3T7v";
        return null;
    }
}
