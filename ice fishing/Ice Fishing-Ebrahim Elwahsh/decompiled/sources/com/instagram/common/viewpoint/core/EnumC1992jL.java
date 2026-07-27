package com.instagram.common.viewpoint.core;

import com.anythink.basead.b.b.j;
import java.util.Arrays;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/facebook/video/heroplayer/exocustom/MediaCodecPoolTracker$Source;", "", "<init>", "(Ljava/lang/String;I)V", "PREALLOCATE", "RENDERER", "fbandroid.java.com.facebook.video.heroplayer.exocustom.exocustom"}, k = 1, mv = {2, 1, 0}, xi = j.f5973W)
/* renamed from: com.facebook.ads.redexgen.X.jL, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class EnumC1992jL {
    public static byte[] A00;
    public static String[] A01 = {"rZXWte666DrLsHPXoqDaJnENYxWgqi71", "qMs7Jpkjo6B4WXMo8buLNP4YVnGGOO84", "YRIecdWAq5cWjgqhOuL8Ww5BoTNcrIze", "AByNt8kh1UJ42iFdWHQ9AlvMpeOzBj1N", "TtlAFxYjvYaGMd2rBwLXiq144cixnhml", "0tQELiow6fswCTTeRUqvQMculdEzTfkG", "bUbYkP8pksg9sIq7o6TggR0molp8Rj4l", "BmPEJaYEGSD1ZlHIDmqiSE8I7JHRaK4U"};
    public static final /* synthetic */ InterfaceC0769Ac A02;
    public static final /* synthetic */ EnumC1992jL[] A03;
    public static final EnumC1992jL A04;
    public static final EnumC1992jL A05;

    public static String A00(int i, int i4, int i9) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i4);
        int i10 = 0;
        while (true) {
            int length = copyOfRange.length;
            if (A01[4].charAt(16) == 'F') {
                throw new RuntimeException();
            }
            String[] strArr = A01;
            strArr[5] = "OpZAEcbarzEwXZVKbMNcbnzwzo5b5CZv";
            strArr[7] = "K81mqq1BRjiJt0SW846JOs7Zv9TlCW8P";
            if (i10 >= length) {
                return new String(copyOfRange);
            }
            copyOfRange[i10] = (byte) ((copyOfRange[i10] - i9) - 73);
            i10++;
        }
    }

    public static void A01() {
        A00 = new byte[]{-6, -4, -17, -21, -10, -10, -7, -19, -21, -2, -17, -63, -76, -67, -77, -76, -63, -76, -63};
    }

    public static final /* synthetic */ EnumC1992jL[] A02() {
        EnumC1992jL[] enumC1992jLArr = new EnumC1992jL[2];
        EnumC1992jL enumC1992jL = A04;
        String[] strArr = A01;
        if (strArr[5].charAt(11) == strArr[7].charAt(11)) {
            throw new RuntimeException();
        }
        A01[4] = "Fkm6UCeGNRQRi4wWDBIOpvvd9TujRbQP";
        enumC1992jLArr[0] = enumC1992jL;
        enumC1992jLArr[1] = A05;
        return enumC1992jLArr;
    }

    static {
        A01();
        A04 = new EnumC1992jL(A00(0, 11, 97), 0);
        A05 = new EnumC1992jL(A00(11, 8, 38), 1);
        A03 = A02();
        A02 = AbstractC2416qd.A01(A03);
    }

    public EnumC1992jL(String str, int i) {
    }

    public static EnumC1992jL valueOf(String str) {
        return (EnumC1992jL) Enum.valueOf(EnumC1992jL.class, str);
    }

    public static EnumC1992jL[] values() {
        return (EnumC1992jL[]) A03.clone();
    }
}
