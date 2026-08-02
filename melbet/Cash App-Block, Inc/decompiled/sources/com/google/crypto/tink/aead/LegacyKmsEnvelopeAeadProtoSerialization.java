package com.google.crypto.tink.aead;

import androidx.tracing.Trace;
import com.fillr.featuretoggle.UnleashContext;
import com.google.crypto.tink.Parameters;
import com.google.crypto.tink.aead.LegacyKmsAeadParameters;
import com.google.crypto.tink.internal.KeyParser$1;
import com.google.crypto.tink.internal.KeySerializer$1;
import com.google.crypto.tink.internal.ParametersParser$1;
import com.google.crypto.tink.internal.ParametersSerializer$1;
import com.google.crypto.tink.internal.Util;
import com.google.crypto.tink.mac.MacWrapper$$ExternalSyntheticLambda0;
import com.google.crypto.tink.proto.KeyTemplate;
import com.google.crypto.tink.proto.KmsEnvelopeAeadKeyFormat;
import com.google.crypto.tink.proto.OutputPrefixType;
import com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite;
import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;
import com.google.crypto.tink.util.Bytes;
import java.security.GeneralSecurityException;

/* loaded from: classes.dex */
public abstract class LegacyKmsEnvelopeAeadProtoSerialization {
    public static final KeyParser$1 KEY_PARSER;
    public static final KeySerializer$1 KEY_SERIALIZER;
    public static final ParametersParser$1 PARAMETERS_PARSER;
    public static final ParametersSerializer$1 PARAMETERS_SERIALIZER;

    static {
        Bytes bytesFromPrintableAscii = Util.toBytesFromPrintableAscii("type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey");
        PARAMETERS_SERIALIZER = new ParametersSerializer$1(LegacyKmsEnvelopeAeadParameters.class, new XAesGcmKey$$ExternalSyntheticBUOutline0(12));
        PARAMETERS_PARSER = new ParametersParser$1(bytesFromPrintableAscii, new XAesGcmKey$$ExternalSyntheticBUOutline0(13));
        KEY_SERIALIZER = new KeySerializer$1(LegacyKmsEnvelopeAeadKey.class, new XAesGcmKey$$ExternalSyntheticBUOutline0(14));
        KEY_PARSER = new KeyParser$1(bytesFromPrintableAscii, new XAesGcmKey$$ExternalSyntheticBUOutline0(15));
    }

    public static LegacyKmsEnvelopeAeadParameters parseParameters(KmsEnvelopeAeadKeyFormat kmsEnvelopeAeadKeyFormat, OutputPrefixType outputPrefixType) {
        LegacyKmsAeadParameters.Variant variant;
        LegacyKmsAeadParameters.Variant variant2;
        KeyTemplate.Builder newBuilder = KeyTemplate.newBuilder();
        newBuilder.setTypeUrl$1(kmsEnvelopeAeadKeyFormat.getDekTemplate().getTypeUrl());
        newBuilder.setValue$1(kmsEnvelopeAeadKeyFormat.getDekTemplate().getValue());
        newBuilder.setOutputPrefixType(OutputPrefixType.RAW);
        Parameters parse = Trace.parse(((KeyTemplate) newBuilder.build()).toByteArray());
        if (parse instanceof AesGcmParameters) {
            variant = LegacyKmsAeadParameters.Variant.ASSUME_AES_GCM;
        } else if (parse instanceof ChaCha20Poly1305Parameters) {
            variant = LegacyKmsAeadParameters.Variant.ASSUME_CHACHA20POLY1305;
        } else if (parse instanceof XChaCha20Poly1305Parameters) {
            variant = LegacyKmsAeadParameters.Variant.ASSUME_XCHACHA20POLY1305;
        } else if (parse instanceof AesCtrHmacAeadParameters) {
            variant = LegacyKmsAeadParameters.Variant.ASSUME_AES_CTR_HMAC;
        } else if (parse instanceof AesEaxParameters) {
            variant = LegacyKmsAeadParameters.Variant.ASSUME_AES_EAX;
        } else {
            if (!(parse instanceof AesGcmSivParameters)) {
                MacWrapper$$ExternalSyntheticLambda0.m(parse, "Unsupported DEK parameters when parsing ");
                return null;
            }
            variant = LegacyKmsAeadParameters.Variant.ASSUME_AES_GCM_SIV;
        }
        UnleashContext unleashContext = new UnleashContext(17);
        int ordinal = outputPrefixType.ordinal();
        if (ordinal == 1) {
            variant2 = LegacyKmsAeadParameters.Variant.TINK$1;
        } else {
            if (ordinal != 3) {
                throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + outputPrefixType.getNumber());
            }
            variant2 = LegacyKmsAeadParameters.Variant.NO_PREFIX$1;
        }
        unleashContext.setVariant(variant2);
        unleashContext.setKekUri(kmsEnvelopeAeadKeyFormat.getKekUri());
        unleashContext.setDekParametersForNewKeys((AeadParameters) parse);
        unleashContext.setDekParsingStrategy(variant);
        return unleashContext.build();
    }

    public static KmsEnvelopeAeadKeyFormat serializeParametersToKmsEnvelopeAeadKeyFormat(LegacyKmsEnvelopeAeadParameters legacyKmsEnvelopeAeadParameters) {
        try {
            KeyTemplate parseFrom = KeyTemplate.parseFrom(Trace.serialize(legacyKmsEnvelopeAeadParameters.dekParametersForNewKeys), ExtensionRegistryLite.getEmptyRegistry());
            KmsEnvelopeAeadKeyFormat.Builder newBuilder = KmsEnvelopeAeadKeyFormat.newBuilder();
            newBuilder.setKekUri(legacyKmsEnvelopeAeadParameters.kekUri);
            newBuilder.setDekTemplate(parseFrom);
            return (KmsEnvelopeAeadKeyFormat) newBuilder.build();
        } catch (InvalidProtocolBufferException e) {
            throw new GeneralSecurityException("Parsing KmsEnvelopeAeadKeyFormat failed: ", e);
        }
    }

    public static OutputPrefixType toProtoOutputPrefixType(LegacyKmsAeadParameters.Variant variant) {
        if (LegacyKmsAeadParameters.Variant.TINK$1 == variant) {
            return OutputPrefixType.TINK;
        }
        if (LegacyKmsAeadParameters.Variant.NO_PREFIX$1 == variant) {
            return OutputPrefixType.RAW;
        }
        MacWrapper$$ExternalSyntheticLambda0.m(variant, "Unable to serialize variant: ");
        return null;
    }
}
