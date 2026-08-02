package com.google.crypto.tink.subtle;

import bo.app.a$$ExternalSyntheticBUOutline0;
import bo.app.re$$ExternalSyntheticOutline0;
import com.fillr.browsersdk.tls.utils.TLSUtils;
import com.google.crypto.tink.aead.subtle.AesGcmSiv$$ExternalSyntheticLambda0;
import com.google.crypto.tink.prf.Prf;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes4.dex */
public final class PrfHmacJce implements Prf {
    public final String algorithm;
    public final SecretKeySpec key;
    public final TLSUtils.AnonymousClass2 localMac;
    public final int maxOutputLength;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0045, code lost:
    
        if (r5.equals("HMACSHA256") == false) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public PrfHmacJce(String str, SecretKeySpec secretKeySpec) {
        char c = 2;
        TLSUtils.AnonymousClass2 anonymousClass2 = new TLSUtils.AnonymousClass2(this, 2);
        this.localMac = anonymousClass2;
        if (!re$$ExternalSyntheticOutline0._isCompatible$1(2)) {
            a$$ExternalSyntheticBUOutline0.m$6("Can not use HMAC in FIPS-mode, as BoringCrypto module is not available.");
            throw null;
        }
        this.algorithm = str;
        this.key = secretKeySpec;
        if (secretKeySpec.getEncoded().length < 16) {
            AesGcmSiv$$ExternalSyntheticLambda0.m$1("key size too small, need at least 16 bytes");
            throw null;
        }
        switch (str.hashCode()) {
            case -1823053428:
                if (str.equals("HMACSHA1")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case 392315023:
                if (str.equals("HMACSHA224")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case 392315118:
                break;
            case 392316170:
                if (str.equals("HMACSHA384")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case 392317873:
                if (str.equals("HMACSHA512")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        switch (c) {
            case 0:
                this.maxOutputLength = 20;
                break;
            case 1:
                this.maxOutputLength = 28;
                break;
            case 2:
                this.maxOutputLength = 32;
                break;
            case 3:
                this.maxOutputLength = 48;
                break;
            case 4:
                this.maxOutputLength = 64;
                break;
            default:
                throw new NoSuchAlgorithmException("unknown Hmac algorithm: ".concat(str));
        }
        anonymousClass2.get();
    }

    @Override // com.google.crypto.tink.prf.Prf
    public final byte[] compute(int i, byte[] bArr) {
        if (i > this.maxOutputLength) {
            AesGcmSiv$$ExternalSyntheticLambda0.m$1("tag size too big");
            return null;
        }
        TLSUtils.AnonymousClass2 anonymousClass2 = this.localMac;
        ((Mac) anonymousClass2.get()).update(bArr);
        return Arrays.copyOf(((Mac) anonymousClass2.get()).doFinal(), i);
    }
}
