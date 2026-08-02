package com.squareup.cash.common.moneyformatter;

import app.cash.local.presenters.LocalPresenterModule$Companion$$ExternalSyntheticLambda0;
import com.squareup.cash.common.moneyformatter.NumberFormat;
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
@Metadata(d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u001a\u0010\u0005\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ \u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0014\u001a\u00020\u00118VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, d2 = {"com/squareup/cash/common/moneyformatter/NumberFormat.Abbreviated.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/squareup/cash/common/moneyformatter/NumberFormat$Abbreviated;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/squareup/cash/common/moneyformatter/NumberFormat$Abbreviated;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/squareup/cash/common/moneyformatter/NumberFormat$Abbreviated;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "money-formatter-config_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class NumberFormat$Abbreviated$$serializer implements GeneratedSerializer {
    public static final NumberFormat$Abbreviated$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        NumberFormat$Abbreviated$$serializer numberFormat$Abbreviated$$serializer = new NumberFormat$Abbreviated$$serializer();
        INSTANCE = numberFormat$Abbreviated$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.squareup.cash.common.moneyformatter.NumberFormat.Abbreviated", numberFormat$Abbreviated$$serializer, 3);
        pluginGeneratedSerialDescriptor.addElement("roundingMode", false);
        pluginGeneratedSerialDescriptor.addElement("fractionDigitsStrategy", false);
        pluginGeneratedSerialDescriptor.addElement("unitMagnitudeFormat", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public KSerializer[] childSerializers() {
        KSerializer[] kSerializerArr = NumberFormat.Abbreviated.$childSerializers;
        return new KSerializer[]{kSerializerArr[0], FractionDigitsStrategy$$serializer.INSTANCE, kSerializerArr[2]};
    }

    @Override // kotlinx.serialization.KSerializer
    public NumberFormat.Abbreviated deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor descriptor2 = getDescriptor();
        CompositeDecoder beginStructure = decoder.beginStructure(descriptor2);
        KSerializer[] kSerializerArr = NumberFormat.Abbreviated.$childSerializers;
        boolean z = true;
        int i = 0;
        RoundingMode roundingMode = null;
        FractionDigitsStrategy fractionDigitsStrategy = null;
        UnitMagnitudeFormat unitMagnitudeFormat = null;
        while (z) {
            int decodeElementIndex = beginStructure.decodeElementIndex(descriptor2);
            if (decodeElementIndex == -1) {
                z = false;
            } else if (decodeElementIndex == 0) {
                roundingMode = (RoundingMode) beginStructure.decodeSerializableElement(descriptor2, 0, kSerializerArr[0], roundingMode);
                i |= 1;
            } else if (decodeElementIndex == 1) {
                fractionDigitsStrategy = (FractionDigitsStrategy) beginStructure.decodeSerializableElement(descriptor2, 1, FractionDigitsStrategy$$serializer.INSTANCE, fractionDigitsStrategy);
                i |= 2;
            } else {
                if (decodeElementIndex != 2) {
                    LocalPresenterModule$Companion$$ExternalSyntheticLambda0.m(decodeElementIndex);
                    return null;
                }
                unitMagnitudeFormat = (UnitMagnitudeFormat) beginStructure.decodeSerializableElement(descriptor2, 2, kSerializerArr[2], unitMagnitudeFormat);
                i |= 4;
            }
        }
        beginStructure.endStructure(descriptor2);
        return new NumberFormat.Abbreviated(i, roundingMode, fractionDigitsStrategy, unitMagnitudeFormat);
    }

    @Override // kotlinx.serialization.KSerializer
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public void serialize(Encoder encoder, NumberFormat.Abbreviated value) {
        encoder.getClass();
        value.getClass();
        SerialDescriptor descriptor2 = getDescriptor();
        CompositeEncoder beginStructure = encoder.beginStructure(descriptor2);
        KSerializer[] kSerializerArr = NumberFormat.Abbreviated.$childSerializers;
        beginStructure.encodeSerializableElement(descriptor2, 0, kSerializerArr[0], value.roundingMode);
        beginStructure.encodeSerializableElement(descriptor2, 1, FractionDigitsStrategy$$serializer.INSTANCE, value.fractionDigitsStrategy);
        beginStructure.encodeSerializableElement(descriptor2, 2, kSerializerArr[2], value.unitMagnitudeFormat);
        beginStructure.endStructure(descriptor2);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public KSerializer[] typeParametersSerializers() {
        return TuplesKt.EMPTY_SERIALIZER_ARRAY;
    }
}
