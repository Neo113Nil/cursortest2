package com.squareup.cash.common.moneyformatter;

import app.cash.local.presenters.LocalPresenterModule$Companion$$ExternalSyntheticLambda0;
import com.squareup.cash.common.moneyformatter.DenominationOption;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.TuplesKt;

@Deprecated
@Metadata(d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u001a\u0010\u0005\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ \u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0014\u001a\u00020\u00118VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, d2 = {"com/squareup/cash/common/moneyformatter/DenominationOption.Dollars.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/squareup/cash/common/moneyformatter/DenominationOption$Dollars;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/squareup/cash/common/moneyformatter/DenominationOption$Dollars;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/squareup/cash/common/moneyformatter/DenominationOption$Dollars;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "money-formatter-config_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class DenominationOption$Dollars$$serializer implements GeneratedSerializer {
    public static final DenominationOption$Dollars$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        DenominationOption$Dollars$$serializer denominationOption$Dollars$$serializer = new DenominationOption$Dollars$$serializer();
        INSTANCE = denominationOption$Dollars$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.squareup.cash.common.moneyformatter.DenominationOption.Dollars", denominationOption$Dollars$$serializer, 1);
        pluginGeneratedSerialDescriptor.addElement("roundingMode", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public KSerializer[] childSerializers() {
        return new KSerializer[]{DenominationOption.Dollars.$childSerializers[0]};
    }

    @Override // kotlinx.serialization.KSerializer
    public DenominationOption.Dollars deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor descriptor2 = getDescriptor();
        CompositeDecoder beginStructure = decoder.beginStructure(descriptor2);
        KSerializer[] kSerializerArr = DenominationOption.Dollars.$childSerializers;
        boolean z = true;
        int i = 0;
        RoundingMode roundingMode = null;
        while (z) {
            int decodeElementIndex = beginStructure.decodeElementIndex(descriptor2);
            if (decodeElementIndex == -1) {
                z = false;
            } else {
                if (decodeElementIndex != 0) {
                    LocalPresenterModule$Companion$$ExternalSyntheticLambda0.m(decodeElementIndex);
                    return null;
                }
                roundingMode = (RoundingMode) beginStructure.decodeSerializableElement(descriptor2, 0, kSerializerArr[0], roundingMode);
                i = 1;
            }
        }
        beginStructure.endStructure(descriptor2);
        return new DenominationOption.Dollars(i, roundingMode);
    }

    @Override // kotlinx.serialization.KSerializer
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public void serialize(Encoder encoder, DenominationOption.Dollars value) {
        encoder.getClass();
        value.getClass();
        RoundingMode roundingMode = value.roundingMode;
        SerialDescriptor descriptor2 = getDescriptor();
        CompositeEncoder beginStructure = encoder.beginStructure(descriptor2);
        KSerializer[] kSerializerArr = DenominationOption.Dollars.$childSerializers;
        if (beginStructure.shouldEncodeElementDefault(descriptor2) || roundingMode != RoundingMode.HALF_UP) {
            beginStructure.encodeSerializableElement(descriptor2, 0, kSerializerArr[0], roundingMode);
        }
        beginStructure.endStructure(descriptor2);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public KSerializer[] typeParametersSerializers() {
        return TuplesKt.EMPTY_SERIALIZER_ARRAY;
    }
}
