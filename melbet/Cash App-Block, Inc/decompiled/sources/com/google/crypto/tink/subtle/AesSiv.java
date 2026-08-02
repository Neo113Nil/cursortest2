package com.google.crypto.tink.subtle;

import androidx.camera.core.impl.utils.Exif;
import bo.app.a$$ExternalSyntheticBUOutline0;
import bo.app.re$$ExternalSyntheticOutline0;
import com.google.crypto.tink.DeterministicAead;
import com.google.crypto.tink.daead.AesSivKey;
import com.google.crypto.tink.prf.AesCmacPrfKey;
import com.google.crypto.tink.prf.AesCmacPrfParameters;
import com.google.crypto.tink.prf.Prf;
import com.squareup.cash.db.WireAdapter;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import java.util.Arrays;
import kotlin.reflect.jvm.KCallablesJvm;

/* loaded from: classes4.dex */
public final class AesSiv implements DeterministicAead {
    public final byte[] aesCtrKey;
    public final Prf cmacForS2V;
    public final byte[] outputPrefix;
    public static final byte[] blockZero = new byte[16];
    public static final byte[] blockOne = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1};
    public static final Exif.AnonymousClass1 localAesCtrCipher = new Exif.AnonymousClass1(19);

    public AesSiv(byte[] bArr, com.google.crypto.tink.util.Bytes bytes) {
        if (!re$$ExternalSyntheticOutline0._isCompatible(1)) {
            a$$ExternalSyntheticBUOutline0.m$6("Can not use AES-SIV in FIPS-mode.");
            throw null;
        }
        if (bArr.length != 32 && bArr.length != 64) {
            throw new InvalidKeyException(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(bArr.length, " bytes; key must have 32 or 64 bytes", new StringBuilder("invalid key size: ")));
        }
        byte[] copyOfRange = Arrays.copyOfRange(bArr, 0, bArr.length / 2);
        this.aesCtrKey = Arrays.copyOfRange(bArr, bArr.length / 2, bArr.length);
        this.cmacForS2V = PrfAesCmac.create(AesCmacPrfKey.create(AesCmacPrfParameters.create(copyOfRange.length), new WireAdapter(com.google.crypto.tink.util.Bytes.copyFrom(copyOfRange))));
        this.outputPrefix = bytes.toByteArray();
    }

    public static AesSiv create(AesSivKey aesSivKey) {
        return new AesSiv(((com.google.crypto.tink.util.Bytes) aesSivKey.keyBytes.adapter).toByteArray(), aesSivKey.outputPrefix);
    }

    public static void validateAssociatedDataLength(int i) {
        if (i > 126) {
            throw new GeneralSecurityException(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(i, "Too many associated datas: ", " > 126"));
        }
    }

    public final byte[] s2v(byte[]... bArr) {
        byte[] xor;
        int length = bArr.length;
        Prf prf = this.cmacForS2V;
        if (length == 0) {
            return prf.compute(16, blockOne);
        }
        byte[] compute = prf.compute(16, blockZero);
        for (int i = 0; i < bArr.length - 1; i++) {
            byte[] bArr2 = bArr[i];
            if (bArr2 == null) {
                bArr2 = new byte[0];
            }
            compute = Bytes.xor(KCallablesJvm.dbl(compute), prf.compute(16, bArr2));
        }
        byte[] bArr3 = bArr[bArr.length - 1];
        if (bArr3.length >= 16) {
            if (bArr3.length < compute.length) {
                a$$ExternalSyntheticBUOutline0.m$3("xorEnd requires a.length >= b.length");
                return null;
            }
            int length2 = bArr3.length - compute.length;
            xor = Arrays.copyOf(bArr3, bArr3.length);
            for (int i2 = 0; i2 < compute.length; i2++) {
                int i3 = length2 + i2;
                xor[i3] = (byte) (xor[i3] ^ compute[i2]);
            }
        } else {
            if (bArr3.length >= 16) {
                a$$ExternalSyntheticBUOutline0.m$3("x must be smaller than a block.");
                return null;
            }
            byte[] copyOf = Arrays.copyOf(bArr3, 16);
            copyOf[bArr3.length] = Byte.MIN_VALUE;
            xor = Bytes.xor(copyOf, KCallablesJvm.dbl(compute));
        }
        return prf.compute(16, xor);
    }
}
