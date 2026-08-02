package com.netcetera.threeds.sdk.infrastructure;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.netcetera.threeds.sdk.infrastructure.oo;
import com.nimbusds.jose.jwk.JWK$$ExternalSyntheticBUOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import org.apache.commons.imaging.formats.pnm.PnmConstants;

/* loaded from: classes5.dex */
public class on extends oo {
    private final byte[] ThreeDS2ServiceInitializationCallback;
    private final int createTransaction;
    private final byte[] getSDKInfo;
    private final byte[] getSDKVersion;
    private final int onCompleted;
    static final byte[] ThreeDS2ServiceInstance = {13, 10};
    private static final byte[] initialize = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, PnmConstants.PNM_PREFIX_BYTE, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, PnmConstants.PBM_TEXT_CODE, PnmConstants.PGM_TEXT_CODE, PnmConstants.PPM_TEXT_CODE, PnmConstants.PBM_RAW_CODE, PnmConstants.PGM_RAW_CODE, PnmConstants.PPM_RAW_CODE, PnmConstants.PAM_RAW_CODE, 56, 57, 43, 47};
    private static final byte[] ThreeDS2Service = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, PnmConstants.PNM_PREFIX_BYTE, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, PnmConstants.PBM_TEXT_CODE, PnmConstants.PGM_TEXT_CODE, PnmConstants.PPM_TEXT_CODE, PnmConstants.PBM_RAW_CODE, PnmConstants.PGM_RAW_CODE, PnmConstants.PPM_RAW_CODE, PnmConstants.PAM_RAW_CODE, 56, 57, 45, 95};
    private static final byte[] cleanup = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 62, -1, 62, -1, 63, PnmConstants.PBM_RAW_CODE, PnmConstants.PGM_RAW_CODE, PnmConstants.PPM_RAW_CODE, PnmConstants.PAM_RAW_CODE, 56, 57, 58, 59, 60, 61, -1, -1, -1, -1, -1, -1, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, -1, -1, -1, -1, 63, -1, 26, 27, 28, 29, 30, 31, PnmConstants.PNM_SEPARATOR, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, PnmConstants.PBM_TEXT_CODE, PnmConstants.PGM_TEXT_CODE, PnmConstants.PPM_TEXT_CODE};

    public on(int i, byte[] bArr, boolean z) {
        super(3, 4, i, bArr == null ? 0 : bArr.length);
        this.ThreeDS2ServiceInitializationCallback = cleanup;
        if (bArr == null) {
            this.onCompleted = 4;
            this.getSDKInfo = null;
        } else {
            if (ThreeDS2ServiceInstance(bArr)) {
                a$$ExternalSyntheticBUOutline0.m$3(JsonLogicResult$Success$$ExternalSyntheticOutline0.m("lineSeparator must not contain base64 characters: [", rr.initialize(bArr), "]"));
                throw null;
            }
            if (i > 0) {
                this.onCompleted = bArr.length + 4;
                byte[] bArr2 = new byte[bArr.length];
                this.getSDKInfo = bArr2;
                System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
            } else {
                this.onCompleted = 4;
                this.getSDKInfo = null;
            }
        }
        this.createTransaction = this.onCompleted - 1;
        this.getSDKVersion = z ? ThreeDS2Service : initialize;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.oo
    public boolean ThreeDS2Service(byte b) {
        if (b < 0) {
            return false;
        }
        byte[] bArr = this.ThreeDS2ServiceInitializationCallback;
        return b < bArr.length && bArr[b] != -1;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.oo
    public void get(byte[] bArr, int i, int i2, oo.get getVar) {
        if (getVar.getSDKVersion) {
            return;
        }
        if (i2 >= 0) {
            int i3 = 0;
            while (i3 < i2) {
                byte[] initialize2 = initialize(this.onCompleted, getVar);
                int i4 = (getVar.cleanup + 1) % 3;
                getVar.cleanup = i4;
                int i5 = i + 1;
                int i6 = bArr[i];
                if (i6 < 0) {
                    i6 += 256;
                }
                int i7 = (getVar.ThreeDS2ServiceInstance << 8) + i6;
                getVar.ThreeDS2ServiceInstance = i7;
                if (i4 == 0) {
                    int i8 = getVar.initialize;
                    int i9 = i8 + 1;
                    getVar.initialize = i9;
                    byte[] bArr2 = this.getSDKVersion;
                    initialize2[i8] = bArr2[(i7 >> 18) & 63];
                    int i10 = i8 + 2;
                    getVar.initialize = i10;
                    initialize2[i9] = bArr2[(i7 >> 12) & 63];
                    int i11 = i8 + 3;
                    getVar.initialize = i11;
                    initialize2[i10] = bArr2[(i7 >> 6) & 63];
                    int i12 = i8 + 4;
                    getVar.initialize = i12;
                    initialize2[i11] = bArr2[i7 & 63];
                    int i13 = getVar.getSDKInfo + 4;
                    getVar.getSDKInfo = i13;
                    int i14 = this.getWarnings;
                    if (i14 > 0 && i14 <= i13) {
                        byte[] bArr3 = this.getSDKInfo;
                        System.arraycopy(bArr3, 0, initialize2, i12, bArr3.length);
                        getVar.initialize += this.getSDKInfo.length;
                        getVar.getSDKInfo = 0;
                    }
                }
                i3++;
                i = i5;
            }
            return;
        }
        getVar.getSDKVersion = true;
        if (getVar.cleanup == 0 && this.getWarnings == 0) {
            return;
        }
        byte[] initialize3 = initialize(this.onCompleted, getVar);
        int i15 = getVar.initialize;
        int i16 = getVar.cleanup;
        if (i16 != 0) {
            if (i16 == 1) {
                int i17 = i15 + 1;
                getVar.initialize = i17;
                byte[] bArr4 = this.getSDKVersion;
                int i18 = getVar.ThreeDS2ServiceInstance;
                initialize3[i15] = bArr4[(i18 >> 2) & 63];
                int i19 = i15 + 2;
                getVar.initialize = i19;
                initialize3[i17] = bArr4[(i18 << 4) & 63];
                if (bArr4 == initialize) {
                    int i20 = i15 + 3;
                    getVar.initialize = i20;
                    initialize3[i19] = 61;
                    getVar.initialize = i15 + 4;
                    initialize3[i20] = 61;
                }
            } else {
                if (i16 != 2) {
                    JWK$$ExternalSyntheticBUOutline0.m(getVar.cleanup, "Impossible modulus ");
                    return;
                }
                int i21 = i15 + 1;
                getVar.initialize = i21;
                byte[] bArr5 = this.getSDKVersion;
                int i22 = getVar.ThreeDS2ServiceInstance;
                initialize3[i15] = bArr5[(i22 >> 10) & 63];
                int i23 = i15 + 2;
                getVar.initialize = i23;
                initialize3[i21] = bArr5[(i22 >> 4) & 63];
                int i24 = i15 + 3;
                getVar.initialize = i24;
                initialize3[i23] = bArr5[(i22 << 2) & 63];
                if (bArr5 == initialize) {
                    getVar.initialize = i15 + 4;
                    initialize3[i24] = 61;
                }
            }
        }
        int i25 = getVar.getSDKInfo;
        int i26 = getVar.initialize;
        int i27 = (i26 - i15) + i25;
        getVar.getSDKInfo = i27;
        if (this.getWarnings <= 0 || i27 <= 0) {
            return;
        }
        byte[] bArr6 = this.getSDKInfo;
        System.arraycopy(bArr6, 0, initialize3, i26, bArr6.length);
        getVar.initialize += this.getSDKInfo.length;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.oo
    public void getWarnings(byte[] bArr, int i, int i2, oo.get getVar) {
        byte b;
        if (getVar.getSDKVersion) {
            return;
        }
        if (i2 < 0) {
            getVar.getSDKVersion = true;
        }
        int i3 = 0;
        while (true) {
            if (i3 >= i2) {
                break;
            }
            byte[] initialize2 = initialize(this.createTransaction, getVar);
            int i4 = i + 1;
            byte b2 = bArr[i];
            if (b2 == 61) {
                getVar.getSDKVersion = true;
                break;
            }
            if (b2 >= 0) {
                byte[] bArr2 = cleanup;
                if (b2 < bArr2.length && (b = bArr2[b2]) >= 0) {
                    int i5 = (getVar.cleanup + 1) % 4;
                    getVar.cleanup = i5;
                    int i6 = (getVar.ThreeDS2ServiceInstance << 6) + b;
                    getVar.ThreeDS2ServiceInstance = i6;
                    if (i5 == 0) {
                        int i7 = getVar.initialize;
                        int i8 = i7 + 1;
                        getVar.initialize = i8;
                        initialize2[i7] = (byte) ((i6 >> 16) & 255);
                        int i9 = i7 + 2;
                        getVar.initialize = i9;
                        initialize2[i8] = (byte) ((i6 >> 8) & 255);
                        getVar.initialize = i7 + 3;
                        initialize2[i9] = (byte) (i6 & 255);
                    }
                }
            }
            i3++;
            i = i4;
        }
        if (!getVar.getSDKVersion || getVar.cleanup == 0) {
            return;
        }
        byte[] initialize3 = initialize(this.createTransaction, getVar);
        int i10 = getVar.cleanup;
        if (i10 != 1) {
            if (i10 == 2) {
                int i11 = getVar.ThreeDS2ServiceInstance >> 4;
                getVar.ThreeDS2ServiceInstance = i11;
                int i12 = getVar.initialize;
                getVar.initialize = i12 + 1;
                initialize3[i12] = (byte) (i11 & 255);
                return;
            }
            if (i10 != 3) {
                JWK$$ExternalSyntheticBUOutline0.m(getVar.cleanup, "Impossible modulus ");
                return;
            }
            int i13 = getVar.ThreeDS2ServiceInstance;
            int i14 = i13 >> 2;
            getVar.ThreeDS2ServiceInstance = i14;
            int i15 = getVar.initialize;
            int i16 = i15 + 1;
            getVar.initialize = i16;
            initialize3[i15] = (byte) ((i13 >> 10) & 255);
            getVar.initialize = i15 + 2;
            initialize3[i16] = (byte) (i14 & 255);
        }
    }

    public on(int i) {
        this(i, ThreeDS2ServiceInstance);
    }

    public on(int i, byte[] bArr) {
        this(i, bArr, false);
    }

    public on() {
        this(0);
    }
}
