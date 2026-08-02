package com.google.crypto.tink.hybrid.internal;

import androidx.media3.extractor.mkv.Sniffer;
import com.google.crypto.tink.Parameters;
import com.google.crypto.tink.aead.AesCtrHmacAeadParameters;
import com.google.crypto.tink.aead.AesGcmParameters;
import com.google.crypto.tink.daead.AesSivParameters;
import com.google.crypto.tink.hybrid.EciesParameters;
import com.google.crypto.tink.mac.MacWrapper$$ExternalSyntheticLambda0;
import com.squareup.cash.mooncake.themes.Dimen$Sp;

/* loaded from: classes.dex */
public abstract class EciesDemHelper {
    public static final byte[] EMPTY_AAD = new byte[0];

    public interface Dem {
        byte[] decrypt(byte[] bArr, byte[] bArr2, int i);

        byte[] encrypt(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4);

        int getSymmetricKeySizeInBytes();
    }

    public static Dem getDem(EciesParameters eciesParameters) {
        Parameters parameters = eciesParameters.demParameters;
        if (parameters instanceof AesGcmParameters) {
            return new Dimen$Sp((AesGcmParameters) parameters);
        }
        if (parameters instanceof AesCtrHmacAeadParameters) {
            return new Sniffer((AesCtrHmacAeadParameters) parameters);
        }
        if (parameters instanceof AesSivParameters) {
            return new Sniffer((AesSivParameters) parameters);
        }
        MacWrapper$$ExternalSyntheticLambda0.m(parameters, "Unsupported DEM parameters: ");
        return null;
    }
}
