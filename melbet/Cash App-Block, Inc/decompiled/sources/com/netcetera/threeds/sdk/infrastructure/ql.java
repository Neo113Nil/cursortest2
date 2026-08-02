package com.netcetera.threeds.sdk.infrastructure;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.plaid.internal.EnumC0170g;
import java.io.IOException;
import java.security.Key;
import java.security.PublicKey;
import java.security.interfaces.ECKey;

/* loaded from: classes5.dex */
public class ql extends qn {
    private String ThreeDS2ServiceInstance;
    private int initialize;

    public static class ThreeDS2Service extends ql {
        public ThreeDS2Service() {
            super("ES512", "SHA512withECDSA", "P-521", EnumC0170g.SDK_ASSET_ILLUSTRATION_IN_CONTROL_VALUE);
        }
    }

    public static class get extends ql {
        public get() {
            super("ES384", "SHA384withECDSA", "P-384", 96);
        }
    }

    public static class getWarnings extends ql {
        public getWarnings() {
            super("ES256", "SHA256withECDSA", "P-256", 64);
        }
    }

    public ql(String str, String str2, String str3, int i) {
        super(str, str2, "EC");
        this.ThreeDS2ServiceInstance = str3;
        this.initialize = i;
    }

    private void ThreeDS2Service(Key key) {
        if (key instanceof ECKey) {
            String warnings = rc.getWarnings(((ECKey) key).getParams().getCurve());
            if (ThreeDS2Service().equals(warnings)) {
                return;
            }
            throw new rn(ThreeDS2ServiceInstance() + "/" + get() + " expects a key using " + ThreeDS2Service() + " but was " + warnings);
        }
    }

    public static byte[] getWarnings(byte[] bArr) {
        byte[] bArr2;
        int length = bArr.length / 2;
        int i = length;
        while (i > 0 && bArr[length - i] == 0) {
            i--;
        }
        int i2 = length - i;
        int i3 = bArr[i2] < 0 ? i + 1 : i;
        int i4 = length;
        while (i4 > 0 && bArr[(length * 2) - i4] == 0) {
            i4--;
        }
        int i5 = (length * 2) - i4;
        int i6 = bArr[i5] < 0 ? i4 + 1 : i4;
        int i7 = i3 + 4 + i6;
        if (i7 > 255) {
            a$$ExternalSyntheticBUOutline0.m$4("Invalid format of ECDSA signature");
            return null;
        }
        int i8 = 1;
        if (i7 < 128) {
            bArr2 = new byte[i3 + 6 + i6];
        } else {
            bArr2 = new byte[i3 + 7 + i6];
            bArr2[1] = -127;
            i8 = 2;
        }
        bArr2[0] = 48;
        bArr2[i8] = (byte) i7;
        bArr2[i8 + 1] = 2;
        bArr2[i8 + 2] = (byte) i3;
        int i9 = i8 + 3 + i3;
        System.arraycopy(bArr, i2, bArr2, i9 - i, i);
        bArr2[i9] = 2;
        bArr2[i9 + 1] = (byte) i6;
        System.arraycopy(bArr, i5, bArr2, ((i9 + 2) + i6) - i4, i4);
        return bArr2;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.qn
    public void ThreeDS2ServiceInstance(PublicKey publicKey) {
        ThreeDS2Service(publicKey);
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.qn, com.netcetera.threeds.sdk.infrastructure.qu
    public boolean get(byte[] bArr, Key key, byte[] bArr2, or orVar) {
        try {
            return super.get(getWarnings(bArr), key, bArr2, orVar);
        } catch (IOException e) {
            throw new ro("Unable to convert R and S as a concatenated byte array to DER encoding.", e);
        }
    }

    public String ThreeDS2Service() {
        return this.ThreeDS2ServiceInstance;
    }
}
