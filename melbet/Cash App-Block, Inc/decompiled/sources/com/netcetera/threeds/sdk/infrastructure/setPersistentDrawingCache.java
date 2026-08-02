package com.netcetera.threeds.sdk.infrastructure;

import com.netcetera.threeds.sdk.api.info.CertificateInfo;
import java.util.List;

/* loaded from: classes5.dex */
public class setPersistentDrawingCache implements com.netcetera.threeds.sdk.api.info.SchemeInfo {
    private static int ThreeDS2ServiceInitializationCallback = 1;
    private static int getSDKVersion;
    private final String ThreeDS2Service;
    private final String ThreeDS2ServiceInstance;
    private final List<String> get;
    private final List<CertificateInfo> getWarnings;
    private final CertificateInfo initialize;

    public setPersistentDrawingCache(List<CertificateInfo> list, CertificateInfo certificateInfo, String str, String str2, List<String> list2) {
        this.getWarnings = list;
        this.initialize = certificateInfo;
        this.ThreeDS2Service = str;
        this.ThreeDS2ServiceInstance = str2;
        this.get = list2;
    }

    @Override // com.netcetera.threeds.sdk.api.info.SchemeInfo
    public CertificateInfo getEncryptionCertificate() {
        int i = getSDKVersion;
        CertificateInfo certificateInfo = this.initialize;
        int i2 = (i & (-106)) | ((~i) & 105);
        int i3 = (i & 105) << 1;
        ThreeDS2ServiceInitializationCallback = (((i2 | i3) << 1) - (i3 ^ i2)) % 128;
        return certificateInfo;
    }

    @Override // com.netcetera.threeds.sdk.api.info.SchemeInfo
    public String getEncryptionCertificateKid() {
        int i = getSDKVersion;
        String str = this.ThreeDS2Service;
        int i2 = i & 91;
        int i3 = -(-((i ^ 91) | i2));
        int i4 = ((i2 | i3) << 1) - (i3 ^ i2);
        ThreeDS2ServiceInitializationCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return str;
        }
        throw null;
    }

    @Override // com.netcetera.threeds.sdk.api.info.SchemeInfo
    public List<String> getIds() {
        int identityHashCode = System.identityHashCode(this);
        int i = 1659479437 & identityHashCode;
        int i2 = (~i) & (1659479437 | identityHashCode);
        int i3 = ~identityHashCode;
        int i4 = ~((i & i2) | (i2 ^ i));
        int i5 = ((i4 & 268704352) | (268704352 ^ i4)) * 576;
        int i6 = 349296726 & i5;
        int i7 = (i5 | 349296726) & (~i6);
        int i8 = i6 << 1;
        int i9 = ((i7 | i8) << 1) - (i7 ^ i8);
        int i10 = (identityHashCode | i3) & (~identityHashCode);
        int i11 = (i10 & 1659479437) | ((~i10) & 1659479437) | ((-1659479438) & i10);
        int i12 = ~((i11 & 1890426724) | (i11 ^ 1890426724));
        int i13 = ((~i12) & 1621722372) | ((-1621722373) & i12);
        int i14 = i12 & 1621722372;
        int i15 = -(-(((i14 & i13) | (i13 ^ i14)) * 576));
        int i16 = i9 & i15;
        int i17 = -(-(i15 | i9));
        int i18 = (i16 & i17) + (i17 | i16);
        int i19 = (i18 ^ 154884096) + ((154884096 & i18) << 1);
        int identityHashCode2 = System.identityHashCode(this);
        int i20 = ((~identityHashCode2) & (-164621187)) | (164621186 & identityHashCode2);
        int i21 = (-164621187) & identityHashCode2;
        int i22 = ~((i20 & i21) | (i20 ^ i21));
        int i23 = (-1488495879) ^ i22;
        int i24 = i22 & (-1488495879);
        int i25 = -(-(((i24 & i23) | (i23 ^ i24)) * 56));
        int i26 = (727125414 ^ i25) + ((i25 & 727125414) << 1);
        int i27 = ((i26 & 572311441) + (572311441 | i26)) - 1;
        int i28 = ~identityHashCode2;
        int i29 = i28 & (-1488495879);
        int i30 = (i28 | (-1488495879)) & (~i29);
        int i31 = ~((i30 & i29) | (i30 ^ i29));
        int i32 = ((i31 & (-164621187)) | ((-164621187) ^ i31)) * 56;
        int i33 = i27 & i32;
        int i34 = i33 + ((i32 ^ i27) | i33);
        List<String> list = this.get;
        if (i19 <= i34) {
            throw null;
        }
        int i35 = ThreeDS2ServiceInitializationCallback;
        int i36 = (((i35 | 59) << 1) - (~(-(i35 ^ 59)))) - 1;
        getSDKVersion = i36 % 128;
        if (i36 % 2 == 0) {
            return list;
        }
        throw null;
    }

    @Override // com.netcetera.threeds.sdk.api.info.SchemeInfo
    public String getName() {
        int i = ThreeDS2ServiceInitializationCallback;
        int i2 = (i & (-12)) | ((~i) & 11);
        int i3 = -(-((i & 11) << 1));
        int i4 = ((i2 | i3) << 1) - (i3 ^ i2);
        getSDKVersion = i4 % 128;
        int i5 = i4 % 2;
        String str = this.ThreeDS2ServiceInstance;
        if (i5 != 0) {
            int i6 = 84 / 0;
        }
        return str;
    }

    @Override // com.netcetera.threeds.sdk.api.info.SchemeInfo
    public List<CertificateInfo> getRootCertificates() {
        int i = getSDKVersion;
        int i2 = (i ^ 102) + ((i & 102) << 1);
        int i3 = ((i2 ^ (-1)) + (i2 << 1)) % 128;
        ThreeDS2ServiceInitializationCallback = i3;
        List<CertificateInfo> list = this.getWarnings;
        getSDKVersion = (((i3 | 113) << 1) - (i3 ^ 113)) % 128;
        return list;
    }
}
