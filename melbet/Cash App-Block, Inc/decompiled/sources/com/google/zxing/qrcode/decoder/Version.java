package com.google.zxing.qrcode.decoder;

import androidx.media3.extractor.mkv.Sniffer;
import com.google.android.filament.Viewport;
import com.plaid.internal.EnumC0170g;
import okio.Path$$ExternalSyntheticBUOutline0;

/* loaded from: classes4.dex */
public final class Version {
    public final int[] alignmentPatternCenters;
    public final Sniffer[] ecBlocks;
    public final int totalCodewords;
    public final int versionNumber;
    public static final int[] VERSION_DECODE_INFO = {31892, 34236, 39577, 42195, 48118, 51042, 55367, 58893, 63784, 68472, 70749, 76311, 79154, 84390, 87683, 92361, 96236, 102084, 102881, 110507, 110734, 117786, 119615, 126325, 127568, 133589, 136944, 141498, 145311, 150283, 152622, 158308, 161089, 167017};
    public static final Version[] VERSIONS = buildVersions();

    public Version(int i, int[] iArr, Sniffer... snifferArr) {
        this.versionNumber = i;
        this.alignmentPatternCenters = iArr;
        this.ecBlocks = snifferArr;
        Sniffer sniffer = snifferArr[0];
        int i2 = sniffer.peekLength;
        int i3 = 0;
        for (Viewport viewport : (Viewport[]) sniffer.scratch) {
            i3 += (viewport.height + i2) * viewport.width;
        }
        this.totalCodewords = i3;
    }

    public static Version[] buildVersions() {
        int i = 24;
        int i2 = 10;
        Version version = new Version(1, new int[0], new Sniffer(7, new Viewport[]{new Viewport(1, 19)}, i), new Sniffer(i2, new Viewport[]{new Viewport(1, 16)}, i), new Sniffer(13, new Viewport[]{new Viewport(1, 13)}, i), new Sniffer(17, new Viewport[]{new Viewport(1, 9)}, i));
        int i3 = 22;
        Version version2 = new Version(2, new int[]{6, 18}, new Sniffer(i2, new Viewport[]{new Viewport(1, 34)}, i), new Sniffer(16, new Viewport[]{new Viewport(1, 28)}, i), new Sniffer(i3, new Viewport[]{new Viewport(1, 22)}, i), new Sniffer(28, new Viewport[]{new Viewport(1, 16)}, i));
        Sniffer sniffer = new Sniffer(15, new Viewport[]{new Viewport(1, 55)}, i);
        int i4 = 26;
        Version version3 = new Version(3, new int[]{6, 22}, sniffer, new Sniffer(i4, new Viewport[]{new Viewport(1, 44)}, i), new Sniffer(18, new Viewport[]{new Viewport(2, 17)}, i), new Sniffer(i3, new Viewport[]{new Viewport(2, 13)}, i));
        Version version4 = new Version(4, new int[]{6, 26}, new Sniffer(20, new Viewport[]{new Viewport(1, 80)}, i), new Sniffer(18, new Viewport[]{new Viewport(2, 32)}, i), new Sniffer(i4, new Viewport[]{new Viewport(2, 24)}, i), new Sniffer(16, new Viewport[]{new Viewport(4, 9)}, i));
        Version version5 = new Version(5, new int[]{6, 30}, new Sniffer(i4, new Viewport[]{new Viewport(1, 108)}, i), new Sniffer(i, new Viewport[]{new Viewport(2, 43)}, i), new Sniffer(18, new Viewport[]{new Viewport(2, 15), new Viewport(2, 16)}, i), new Sniffer(22, new Viewport[]{new Viewport(2, 11), new Viewport(2, 12)}, i));
        Version version6 = new Version(6, new int[]{6, 34}, new Sniffer(18, new Viewport[]{new Viewport(2, 68)}, i), new Sniffer(16, new Viewport[]{new Viewport(4, 27)}, i), new Sniffer(i, new Viewport[]{new Viewport(4, 19)}, i), new Sniffer(28, new Viewport[]{new Viewport(4, 15)}, i));
        int i5 = 18;
        int i6 = 24;
        Version version7 = new Version(7, new int[]{6, 22, 38}, new Sniffer(20, new Viewport[]{new Viewport(2, 78)}, i), new Sniffer(i5, new Viewport[]{new Viewport(4, 31)}, i), new Sniffer(i5, new Viewport[]{new Viewport(2, 14), new Viewport(4, 15)}, 24), new Sniffer(26, new Viewport[]{new Viewport(4, 13), new Viewport(1, 14)}, i6));
        Version version8 = new Version(8, new int[]{6, 24, 42}, new Sniffer(i6, new Viewport[]{new Viewport(2, 97)}, i6), new Sniffer(22, new Viewport[]{new Viewport(2, 38), new Viewport(2, 39)}, i6), new Sniffer(22, new Viewport[]{new Viewport(4, 18), new Viewport(2, 19)}, 24), new Sniffer(26, new Viewport[]{new Viewport(4, 14), new Viewport(2, 15)}, 24));
        int i7 = 24;
        int i8 = 24;
        Version version9 = new Version(9, new int[]{6, 26, 46}, new Sniffer(30, new Viewport[]{new Viewport(2, 116)}, i7), new Sniffer(22, new Viewport[]{new Viewport(3, 36), new Viewport(2, 37)}, i7), new Sniffer(20, new Viewport[]{new Viewport(4, 16), new Viewport(4, 17)}, 24), new Sniffer(i8, new Viewport[]{new Viewport(4, 12), new Viewport(4, 13)}, i8));
        int i9 = 24;
        Sniffer sniffer2 = new Sniffer(18, new Viewport[]{new Viewport(2, 68), new Viewport(2, 69)}, i9);
        Sniffer sniffer3 = new Sniffer(26, new Viewport[]{new Viewport(4, 43), new Viewport(1, 44)}, i9);
        int i10 = 24;
        int i11 = 24;
        Version version10 = new Version(10, new int[]{6, 28, 50}, sniffer2, sniffer3, new Sniffer(i10, new Viewport[]{new Viewport(6, 19), new Viewport(2, 20)}, i10), new Sniffer(28, new Viewport[]{new Viewport(6, 15), new Viewport(2, 16)}, i11));
        int i12 = 24;
        Version version11 = new Version(11, new int[]{6, 30, 54}, new Sniffer(20, new Viewport[]{new Viewport(4, 81)}, i11), new Sniffer(30, new Viewport[]{new Viewport(1, 50), new Viewport(4, 51)}, i11), new Sniffer(28, new Viewport[]{new Viewport(4, 22), new Viewport(4, 23)}, 24), new Sniffer(i12, new Viewport[]{new Viewport(3, 12), new Viewport(8, 13)}, i12));
        int i13 = 24;
        int i14 = 24;
        Version version12 = new Version(12, new int[]{6, 32, 58}, new Sniffer(i13, new Viewport[]{new Viewport(2, 92), new Viewport(2, 93)}, i13), new Sniffer(22, new Viewport[]{new Viewport(6, 36), new Viewport(2, 37)}, i13), new Sniffer(26, new Viewport[]{new Viewport(4, 20), new Viewport(6, 21)}, 24), new Sniffer(28, new Viewport[]{new Viewport(7, 14), new Viewport(4, 15)}, i14));
        Sniffer sniffer4 = new Sniffer(26, new Viewport[]{new Viewport(4, 107)}, i14);
        Sniffer sniffer5 = new Sniffer(22, new Viewport[]{new Viewport(8, 37), new Viewport(1, 38)}, i14);
        int i15 = 24;
        Version version13 = new Version(13, new int[]{6, 34, 62}, sniffer4, sniffer5, new Sniffer(i15, new Viewport[]{new Viewport(8, 20), new Viewport(4, 21)}, i15), new Sniffer(22, new Viewport[]{new Viewport(12, 11), new Viewport(4, 12)}, 24));
        int i16 = 24;
        int i17 = 24;
        Version version14 = new Version(14, new int[]{6, 26, 46, 66}, new Sniffer(30, new Viewport[]{new Viewport(3, 115), new Viewport(1, 116)}, i16), new Sniffer(i16, new Viewport[]{new Viewport(4, 40), new Viewport(5, 41)}, i16), new Sniffer(20, new Viewport[]{new Viewport(11, 16), new Viewport(5, 17)}, 24), new Sniffer(i17, new Viewport[]{new Viewport(11, 12), new Viewport(5, 13)}, i17));
        int i18 = 24;
        int i19 = 24;
        Version version15 = new Version(15, new int[]{6, 26, 48, 70}, new Sniffer(22, new Viewport[]{new Viewport(5, 87), new Viewport(1, 88)}, i18), new Sniffer(i18, new Viewport[]{new Viewport(5, 41), new Viewport(5, 42)}, i18), new Sniffer(30, new Viewport[]{new Viewport(5, 24), new Viewport(7, 25)}, 24), new Sniffer(i19, new Viewport[]{new Viewport(11, 12), new Viewport(7, 13)}, i19));
        int i20 = 24;
        Sniffer sniffer6 = new Sniffer(i20, new Viewport[]{new Viewport(5, 98), new Viewport(1, 99)}, i20);
        Sniffer sniffer7 = new Sniffer(28, new Viewport[]{new Viewport(7, 45), new Viewport(3, 46)}, i20);
        int i21 = 24;
        Version version16 = new Version(16, new int[]{6, 26, 50, 74}, sniffer6, sniffer7, new Sniffer(i21, new Viewport[]{new Viewport(15, 19), new Viewport(2, 20)}, i21), new Sniffer(30, new Viewport[]{new Viewport(3, 15), new Viewport(13, 16)}, 24));
        int i22 = 24;
        Version version17 = new Version(17, new int[]{6, 30, 54, 78}, new Sniffer(28, new Viewport[]{new Viewport(1, 107), new Viewport(5, 108)}, i22), new Sniffer(28, new Viewport[]{new Viewport(10, 46), new Viewport(1, 47)}, i22), new Sniffer(28, new Viewport[]{new Viewport(1, 22), new Viewport(15, 23)}, 24), new Sniffer(28, new Viewport[]{new Viewport(2, 14), new Viewport(17, 15)}, 24));
        int i23 = 24;
        Version version18 = new Version(18, new int[]{6, 30, 56, 82}, new Sniffer(30, new Viewport[]{new Viewport(5, 120), new Viewport(1, 121)}, i23), new Sniffer(26, new Viewport[]{new Viewport(9, 43), new Viewport(4, 44)}, i23), new Sniffer(28, new Viewport[]{new Viewport(17, 22), new Viewport(1, 23)}, 24), new Sniffer(28, new Viewport[]{new Viewport(2, 14), new Viewport(19, 15)}, 24));
        int i24 = 24;
        Version version19 = new Version(19, new int[]{6, 30, 58, 86}, new Sniffer(28, new Viewport[]{new Viewport(3, 113), new Viewport(4, 114)}, i24), new Sniffer(26, new Viewport[]{new Viewport(3, 44), new Viewport(11, 45)}, i24), new Sniffer(26, new Viewport[]{new Viewport(17, 21), new Viewport(4, 22)}, 24), new Sniffer(26, new Viewport[]{new Viewport(9, 13), new Viewport(16, 14)}, 24));
        int i25 = 24;
        int i26 = 28;
        Version version20 = new Version(20, new int[]{6, 34, 62, 90}, new Sniffer(28, new Viewport[]{new Viewport(3, 107), new Viewport(5, 108)}, i25), new Sniffer(26, new Viewport[]{new Viewport(3, 41), new Viewport(13, 42)}, i25), new Sniffer(30, new Viewport[]{new Viewport(15, 24), new Viewport(5, 25)}, 24), new Sniffer(i26, new Viewport[]{new Viewport(15, 15), new Viewport(10, 16)}, 24));
        int i27 = 24;
        Version version21 = new Version(21, new int[]{6, 28, 50, 72, 94}, new Sniffer(i26, new Viewport[]{new Viewport(4, 116), new Viewport(4, 117)}, i27), new Sniffer(26, new Viewport[]{new Viewport(17, 42)}, i27), new Sniffer(28, new Viewport[]{new Viewport(17, 22), new Viewport(6, 23)}, 24), new Sniffer(30, new Viewport[]{new Viewport(19, 16), new Viewport(6, 17)}, 24));
        int i28 = 24;
        int i29 = 28;
        int i30 = 24;
        Version version22 = new Version(22, new int[]{6, 26, 50, 74, 98}, new Sniffer(i29, new Viewport[]{new Viewport(2, 111), new Viewport(7, 112)}, i28), new Sniffer(i29, new Viewport[]{new Viewport(17, 46)}, i28), new Sniffer(30, new Viewport[]{new Viewport(7, 24), new Viewport(16, 25)}, 24), new Sniffer(i30, new Viewport[]{new Viewport(34, 13)}, i30));
        Version version23 = new Version(23, new int[]{6, 30, 54, 78, 102}, new Sniffer(30, new Viewport[]{new Viewport(4, 121), new Viewport(5, EnumC0170g.SDK_ASSET_ILLUSTRATION_DEPOSIT_VALUE)}, 24), new Sniffer(28, new Viewport[]{new Viewport(4, 47), new Viewport(14, 48)}, 24), new Sniffer(30, new Viewport[]{new Viewport(11, 24), new Viewport(14, 25)}, 24), new Sniffer(30, new Viewport[]{new Viewport(16, 15), new Viewport(14, 16)}, 24));
        int i31 = 24;
        Version version24 = new Version(24, new int[]{6, 28, 54, 80, 106}, new Sniffer(30, new Viewport[]{new Viewport(6, 117), new Viewport(4, 118)}, i31), new Sniffer(28, new Viewport[]{new Viewport(6, 45), new Viewport(14, 46)}, i31), new Sniffer(30, new Viewport[]{new Viewport(11, 24), new Viewport(16, 25)}, 24), new Sniffer(30, new Viewport[]{new Viewport(30, 16), new Viewport(2, 17)}, 24));
        int i32 = 24;
        Version version25 = new Version(25, new int[]{6, 32, 58, 84, 110}, new Sniffer(26, new Viewport[]{new Viewport(8, 106), new Viewport(4, 107)}, i32), new Sniffer(28, new Viewport[]{new Viewport(8, 47), new Viewport(13, 48)}, i32), new Sniffer(30, new Viewport[]{new Viewport(7, 24), new Viewport(22, 25)}, 24), new Sniffer(30, new Viewport[]{new Viewport(22, 15), new Viewport(13, 16)}, 24));
        int i33 = 28;
        Version version26 = new Version(26, new int[]{6, 30, 58, 86, 114}, new Sniffer(i33, new Viewport[]{new Viewport(10, 114), new Viewport(2, 115)}, 24), new Sniffer(i33, new Viewport[]{new Viewport(19, 46), new Viewport(4, 47)}, 24), new Sniffer(28, new Viewport[]{new Viewport(28, 22), new Viewport(6, 23)}, 24), new Sniffer(30, new Viewport[]{new Viewport(33, 16), new Viewport(4, 17)}, 24));
        int i34 = 24;
        Version version27 = new Version(27, new int[]{6, 34, 62, 90, 118}, new Sniffer(30, new Viewport[]{new Viewport(8, EnumC0170g.SDK_ASSET_ILLUSTRATION_DEPOSIT_VALUE), new Viewport(4, EnumC0170g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE)}, i34), new Sniffer(28, new Viewport[]{new Viewport(22, 45), new Viewport(3, 46)}, i34), new Sniffer(30, new Viewport[]{new Viewport(8, 23), new Viewport(26, 24)}, i34), new Sniffer(30, new Viewport[]{new Viewport(12, 15), new Viewport(28, 16)}, 24));
        int i35 = 24;
        Version version28 = new Version(28, new int[]{6, 26, 50, 74, 98, EnumC0170g.SDK_ASSET_ILLUSTRATION_DEPOSIT_VALUE}, new Sniffer(30, new Viewport[]{new Viewport(3, 117), new Viewport(10, 118)}, i35), new Sniffer(28, new Viewport[]{new Viewport(3, 45), new Viewport(23, 46)}, i35), new Sniffer(30, new Viewport[]{new Viewport(4, 24), new Viewport(31, 25)}, 24), new Sniffer(30, new Viewport[]{new Viewport(11, 15), new Viewport(31, 16)}, 24));
        int i36 = 24;
        Version version29 = new Version(29, new int[]{6, 30, 54, 78, 102, EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE}, new Sniffer(30, new Viewport[]{new Viewport(7, 116), new Viewport(7, 117)}, i36), new Sniffer(28, new Viewport[]{new Viewport(21, 45), new Viewport(7, 46)}, i36), new Sniffer(30, new Viewport[]{new Viewport(1, 23), new Viewport(37, 24)}, i36), new Sniffer(30, new Viewport[]{new Viewport(19, 15), new Viewport(26, 16)}, 24));
        int i37 = 24;
        int i38 = 30;
        Version version30 = new Version(30, new int[]{6, 26, 52, 78, 104, EnumC0170g.SDK_ASSET_ILLUSTRATION_CONSUMER_VALUE}, new Sniffer(30, new Viewport[]{new Viewport(5, 115), new Viewport(10, 116)}, i37), new Sniffer(28, new Viewport[]{new Viewport(19, 47), new Viewport(10, 48)}, i37), new Sniffer(30, new Viewport[]{new Viewport(15, 24), new Viewport(25, 25)}, i37), new Sniffer(i38, new Viewport[]{new Viewport(23, 15), new Viewport(25, 16)}, 24));
        int i39 = 24;
        int i40 = 24;
        int i41 = 30;
        Version version31 = new Version(31, new int[]{6, 30, 56, 82, 108, EnumC0170g.SDK_ASSET_ILLUSTRATION_DEV_LOGS_VALUE}, new Sniffer(i38, new Viewport[]{new Viewport(13, 115), new Viewport(3, 116)}, i39), new Sniffer(28, new Viewport[]{new Viewport(2, 46), new Viewport(29, 47)}, i39), new Sniffer(30, new Viewport[]{new Viewport(42, 24), new Viewport(1, 25)}, 24), new Sniffer(i41, new Viewport[]{new Viewport(23, 15), new Viewport(28, 16)}, i40));
        Version version32 = new Version(32, new int[]{6, 34, 60, 86, 112, EnumC0170g.SDK_ASSET_ILLUSTRATION_SHARE_YOUR_DATA_VALUE}, new Sniffer(i41, new Viewport[]{new Viewport(17, 115)}, i40), new Sniffer(28, new Viewport[]{new Viewport(10, 46), new Viewport(23, 47)}, i40), new Sniffer(30, new Viewport[]{new Viewport(10, 24), new Viewport(35, 25)}, 24), new Sniffer(30, new Viewport[]{new Viewport(19, 15), new Viewport(35, 16)}, 24));
        int i42 = 24;
        Version version33 = new Version(33, new int[]{6, 30, 58, 86, 114, EnumC0170g.SDK_ASSET_CONNECTIVITY_WARNING_ILLUSTRATION_VALUE}, new Sniffer(30, new Viewport[]{new Viewport(17, 115), new Viewport(1, 116)}, i42), new Sniffer(28, new Viewport[]{new Viewport(14, 46), new Viewport(21, 47)}, i42), new Sniffer(30, new Viewport[]{new Viewport(29, 24), new Viewport(19, 25)}, 24), new Sniffer(30, new Viewport[]{new Viewport(11, 15), new Viewport(46, 16)}, 24));
        int i43 = 24;
        Version version34 = new Version(34, new int[]{6, 34, 62, 90, 118, EnumC0170g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_PERSON_VALUE}, new Sniffer(30, new Viewport[]{new Viewport(13, 115), new Viewport(6, 116)}, i43), new Sniffer(28, new Viewport[]{new Viewport(14, 46), new Viewport(23, 47)}, i43), new Sniffer(30, new Viewport[]{new Viewport(44, 24), new Viewport(7, 25)}, 24), new Sniffer(30, new Viewport[]{new Viewport(59, 16), new Viewport(1, 17)}, 24));
        int i44 = 24;
        Version version35 = new Version(35, new int[]{6, 30, 54, 78, 102, EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE, 150}, new Sniffer(30, new Viewport[]{new Viewport(12, 121), new Viewport(7, EnumC0170g.SDK_ASSET_ILLUSTRATION_DEPOSIT_VALUE)}, i44), new Sniffer(28, new Viewport[]{new Viewport(12, 47), new Viewport(26, 48)}, i44), new Sniffer(30, new Viewport[]{new Viewport(39, 24), new Viewport(14, 25)}, 24), new Sniffer(30, new Viewport[]{new Viewport(22, 15), new Viewport(41, 16)}, 24));
        int i45 = 24;
        Version version36 = new Version(36, new int[]{6, 24, 50, 76, 102, 128, EnumC0170g.SDK_ASSET_ILLUSTRATION_UPLOAD_VALUE}, new Sniffer(30, new Viewport[]{new Viewport(6, 121), new Viewport(14, EnumC0170g.SDK_ASSET_ILLUSTRATION_DEPOSIT_VALUE)}, i45), new Sniffer(28, new Viewport[]{new Viewport(6, 47), new Viewport(34, 48)}, i45), new Sniffer(30, new Viewport[]{new Viewport(46, 24), new Viewport(10, 25)}, 24), new Sniffer(30, new Viewport[]{new Viewport(2, 15), new Viewport(64, 16)}, 24));
        int i46 = 24;
        Version version37 = new Version(37, new int[]{6, 28, 54, 80, 106, EnumC0170g.SDK_ASSET_ILLUSTRATION_IN_CONTROL_VALUE, EnumC0170g.SDK_ASSET_ILLUSTRATION_WALLET_VALUE}, new Sniffer(30, new Viewport[]{new Viewport(17, EnumC0170g.SDK_ASSET_ILLUSTRATION_DEPOSIT_VALUE), new Viewport(4, EnumC0170g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE)}, i46), new Sniffer(28, new Viewport[]{new Viewport(29, 46), new Viewport(14, 47)}, i46), new Sniffer(30, new Viewport[]{new Viewport(49, 24), new Viewport(10, 25)}, 24), new Sniffer(30, new Viewport[]{new Viewport(24, 15), new Viewport(46, 16)}, 24));
        int i47 = 24;
        Version version38 = new Version(38, new int[]{6, 32, 58, 84, 110, 136, EnumC0170g.SDK_ASSET_ILLUSTRATION_SUPPORT_VALUE}, new Sniffer(30, new Viewport[]{new Viewport(4, EnumC0170g.SDK_ASSET_ILLUSTRATION_DEPOSIT_VALUE), new Viewport(18, EnumC0170g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE)}, i47), new Sniffer(28, new Viewport[]{new Viewport(13, 46), new Viewport(32, 47)}, i47), new Sniffer(30, new Viewport[]{new Viewport(48, 24), new Viewport(14, 25)}, 24), new Sniffer(30, new Viewport[]{new Viewport(42, 15), new Viewport(32, 16)}, 24));
        int i48 = 24;
        Version version39 = new Version(39, new int[]{6, 26, 54, 82, 110, EnumC0170g.SDK_ASSET_ILLUSTRATION_SHARE_YOUR_DATA_VALUE, EnumC0170g.SDK_ASSET_ILLUSTRATION_ETH_WITH_PLAID_VALUE}, new Sniffer(30, new Viewport[]{new Viewport(20, 117), new Viewport(4, 118)}, i48), new Sniffer(28, new Viewport[]{new Viewport(40, 47), new Viewport(7, 48)}, i48), new Sniffer(30, new Viewport[]{new Viewport(43, 24), new Viewport(22, 25)}, 24), new Sniffer(30, new Viewport[]{new Viewport(10, 15), new Viewport(67, 16)}, 24));
        int i49 = 24;
        return new Version[]{version, version2, version3, version4, version5, version6, version7, version8, version9, version10, version11, version12, version13, version14, version15, version16, version17, version18, version19, version20, version21, version22, version23, version24, version25, version26, version27, version28, version29, version30, version31, version32, version33, version34, version35, version36, version37, version38, version39, new Version(40, new int[]{6, 30, 58, 86, 114, EnumC0170g.SDK_ASSET_CONNECTIVITY_WARNING_ILLUSTRATION_VALUE, EnumC0170g.SDK_ASSET_ILLUSTRATION_INCOME_PAYROLL_URL_VALUE}, new Sniffer(30, new Viewport[]{new Viewport(19, 118), new Viewport(6, 119)}, i49), new Sniffer(28, new Viewport[]{new Viewport(18, 47), new Viewport(31, 48)}, i49), new Sniffer(30, new Viewport[]{new Viewport(34, 24), new Viewport(34, 25)}, 24), new Sniffer(30, new Viewport[]{new Viewport(20, 15), new Viewport(61, 16)}, 24))};
    }

    public static Version decodeVersionInformation(int i) {
        int i2 = Integer.MAX_VALUE;
        int i3 = 0;
        for (int i4 = 0; i4 < 34; i4++) {
            int i5 = VERSION_DECODE_INFO[i4];
            if (i5 == i) {
                return getVersionForNumber(i4 + 7);
            }
            int bitCount = Integer.bitCount(i5 ^ i);
            if (bitCount < i2) {
                i3 = i4 + 7;
                i2 = bitCount;
            }
        }
        if (i2 <= 3) {
            return getVersionForNumber(i3);
        }
        return null;
    }

    public static Version getVersionForNumber(int i) {
        if (i >= 1 && i <= 40) {
            return VERSIONS[i - 1];
        }
        Path$$ExternalSyntheticBUOutline0.m$3();
        return null;
    }

    public final String toString() {
        return String.valueOf(this.versionNumber);
    }
}
