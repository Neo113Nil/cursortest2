package com.squareup.cash.common.moneyformatter;

import app.cash.local.presenters.LocalPresenterModule$Companion$$ExternalSyntheticLambda0;
import com.squareup.cash.common.moneyformatter.DenominationOption;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.TuplesKt;

@Deprecated
@Metadata(d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u001a\u0010\u0005\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ \u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0014\u001a\u00020\u00118VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, d2 = {"com/squareup/cash/common/moneyformatter/DenominationOption.DollarsAndCents.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/squareup/cash/common/moneyformatter/DenominationOption$DollarsAndCents;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/squareup/cash/common/moneyformatter/DenominationOption$DollarsAndCents;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/squareup/cash/common/moneyformatter/DenominationOption$DollarsAndCents;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "money-formatter-config_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class DenominationOption$DollarsAndCents$$serializer implements GeneratedSerializer {
    public static final DenominationOption$DollarsAndCents$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        DenominationOption$DollarsAndCents$$serializer denominationOption$DollarsAndCents$$serializer = new DenominationOption$DollarsAndCents$$serializer();
        INSTANCE = denominationOption$DollarsAndCents$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.squareup.cash.common.moneyformatter.DenominationOption.DollarsAndCents", denominationOption$DollarsAndCents$$serializer, 3);
        pluginGeneratedSerialDescriptor.addElement("omitsCentsIfPossible", false);
        pluginGeneratedSerialDescriptor.addElement("showsAsCentsIfPossible", false);
        pluginGeneratedSerialDescriptor.addElement("trailingZeroesBehavior", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public KSerializer[] childSerializers() {
        KSerializer nullable = BuiltinSerializersKt.getNullable(DenominationOption.DollarsAndCents.$childSerializers[2]);
        BooleanSerializer booleanSerializer = BooleanSerializer.INSTANCE;
        return new KSerializer[]{booleanSerializer, booleanSerializer, nullable};
    }

    @Override // kotlinx.serialization.KSerializer
    public DenominationOption.DollarsAndCents deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor descriptor2 = getDescriptor();
        CompositeDecoder beginStructure = decoder.beginStructure(descriptor2);
        KSerializer[] kSerializerArr = DenominationOption.DollarsAndCents.$childSerializers;
        boolean z = true;
        int i = 0;
        boolean z2 = false;
        boolean z3 = false;
        TrailingZeroesBehavior trailingZeroesBehavior = null;
        while (z) {
            int decodeElementIndex = beginStructure.decodeElementIndex(descriptor2);
            if (decodeElementIndex == -1) {
                z = false;
            } else if (decodeElementIndex == 0) {
                z2 = beginStructure.decodeBooleanElement(descriptor2, 0);
                i |= 1;
            } else if (decodeElementIndex == 1) {
                z3 = beginStructure.decodeBooleanElement(descriptor2, 1);
                i |= 2;
            } else {
                if (decodeElementIndex != 2) {
                    LocalPresenterModule$Companion$$ExternalSyntheticLambda0.m(decodeElementIndex);
                    return null;
                }
                trailingZeroesBehavior = (TrailingZeroesBehavior) beginStructure.decodeNullableSerializableElement(descriptor2, 2, kSerializerArr[2], trailingZeroesBehavior);
                i |= 4;
            }
        }
        beginStructure.endStructure(descriptor2);
        return new DenominationOption.DollarsAndCents(i, z2, z3, trailingZeroesBehavior);
    }

    @Override // kotlinx.serialization.KSerializer
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public void serialize(Encoder encoder, DenominationOption.DollarsAndCents value) {
        encoder.getClass();
        value.getClass();
        SerialDescriptor descriptor2 = getDescriptor();
        CompositeEncoder beginStructure = encoder.beginStructure(descriptor2);
        KSerializer[] kSerializerArr = DenominationOption.DollarsAndCents.$childSerializers;
        boolean z = value.omitsCentsIfPossible;
        TrailingZeroesBehavior trailingZeroesBehavior = value.trailingZeroesBehavior;
        beginStructure.encodeBooleanElement(descriptor2, 0, z);
        beginStructure.encodeBooleanElement(descriptor2, 1, value.showsAsCentsIfPossible);
        if (beginStructure.shouldEncodeElementDefault(descriptor2) || trailingZeroesBehavior != null) {
            beginStructure.encodeNullableSerializableElement(descriptor2, 2, kSerializerArr[2], trailingZeroesBehavior);
        }
        beginStructure.endStructure(descriptor2);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public KSerializer[] typeParametersSerializers() {
        return TuplesKt.EMPTY_SERIALIZER_ARRAY;
    }
}
