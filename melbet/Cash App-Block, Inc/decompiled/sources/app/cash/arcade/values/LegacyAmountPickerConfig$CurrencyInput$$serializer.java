package app.cash.arcade.values;

import app.cash.arcade.values.LegacyAmountPickerConfig;
import app.cash.local.presenters.LocalPresenterModule$Companion$$ExternalSyntheticLambda0;
import kotlin.Deprecated;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.StringSerializer;
import kotlinx.serialization.internal.TuplesKt;

@Deprecated
@Metadata(d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u001d\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000e0\r¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0012\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"app/cash/arcade/values/LegacyAmountPickerConfig.CurrencyInput.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lapp/cash/arcade/values/LegacyAmountPickerConfig$CurrencyInput;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lapp/cash/arcade/values/LegacyAmountPickerConfig$CurrencyInput;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lapp/cash/arcade/values/LegacyAmountPickerConfig$CurrencyInput;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "values"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* synthetic */ class LegacyAmountPickerConfig$CurrencyInput$$serializer implements GeneratedSerializer {
    public static final LegacyAmountPickerConfig$CurrencyInput$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        LegacyAmountPickerConfig$CurrencyInput$$serializer legacyAmountPickerConfig$CurrencyInput$$serializer = new LegacyAmountPickerConfig$CurrencyInput$$serializer();
        INSTANCE = legacyAmountPickerConfig$CurrencyInput$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("CurrencyInput", legacyAmountPickerConfig$CurrencyInput$$serializer, 7);
        pluginGeneratedSerialDescriptor.addElement("prefix", false);
        pluginGeneratedSerialDescriptor.addElement("suffixBuilder", false);
        pluginGeneratedSerialDescriptor.addElement("totalFractionalDigitCount", false);
        pluginGeneratedSerialDescriptor.addElement("maxDisplayWholeDigits", false);
        pluginGeneratedSerialDescriptor.addElement("maxEmptyZeroCount", false);
        pluginGeneratedSerialDescriptor.addElement("contentLabelBuilder", false);
        pluginGeneratedSerialDescriptor.addElement("initialRawAmount", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer[] childSerializers() {
        Lazy[] lazyArr = LegacyAmountPickerConfig.CurrencyInput.$childSerializers;
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        IntSerializer intSerializer = IntSerializer.INSTANCE;
        return new KSerializer[]{stringSerializer, lazyArr[1].getValue(), intSerializer, intSerializer, intSerializer, lazyArr[5].getValue(), BuiltinSerializersKt.getNullable(stringSerializer)};
    }

    @Override // kotlinx.serialization.KSerializer
    public final LegacyAmountPickerConfig.CurrencyInput deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder beginStructure = decoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = LegacyAmountPickerConfig.CurrencyInput.$childSerializers;
        LegacyAmountPickerConfig.CurrencyInput currencyInput = null;
        boolean z = true;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        String str = null;
        LegacyAmountInputSuffixBuilder legacyAmountInputSuffixBuilder = null;
        LegacyAmountContentLabelBuilder legacyAmountContentLabelBuilder = null;
        String str2 = null;
        while (z) {
            int decodeElementIndex = beginStructure.decodeElementIndex(serialDescriptor);
            switch (decodeElementIndex) {
                case -1:
                    z = false;
                    continue;
                case 0:
                    str = beginStructure.decodeStringElement(serialDescriptor, 0);
                    i |= 1;
                    break;
                case 1:
                    legacyAmountInputSuffixBuilder = (LegacyAmountInputSuffixBuilder) beginStructure.decodeSerializableElement(serialDescriptor, 1, (KSerializer) lazyArr[1].getValue(), legacyAmountInputSuffixBuilder);
                    i |= 2;
                    break;
                case 2:
                    i2 = beginStructure.decodeIntElement(serialDescriptor, 2);
                    i |= 4;
                    break;
                case 3:
                    i3 = beginStructure.decodeIntElement(serialDescriptor, 3);
                    i |= 8;
                    break;
                case 4:
                    i4 = beginStructure.decodeIntElement(serialDescriptor, 4);
                    i |= 16;
                    break;
                case 5:
                    legacyAmountContentLabelBuilder = (LegacyAmountContentLabelBuilder) beginStructure.decodeSerializableElement(serialDescriptor, 5, (KSerializer) lazyArr[5].getValue(), legacyAmountContentLabelBuilder);
                    i |= 32;
                    break;
                case 6:
                    str2 = (String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 6, StringSerializer.INSTANCE, str2);
                    i |= 64;
                    break;
                default:
                    LocalPresenterModule$Companion$$ExternalSyntheticLambda0.m(decodeElementIndex);
                    return currencyInput;
            }
            currencyInput = null;
        }
        beginStructure.endStructure(serialDescriptor);
        return new LegacyAmountPickerConfig.CurrencyInput(i, str, legacyAmountInputSuffixBuilder, i2, i3, i4, legacyAmountContentLabelBuilder, str2);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, LegacyAmountPickerConfig.CurrencyInput value) {
        encoder.getClass();
        value.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder beginStructure = encoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = LegacyAmountPickerConfig.CurrencyInput.$childSerializers;
        String str = value.prefix;
        String str2 = value.initialRawAmount;
        beginStructure.encodeStringElement(serialDescriptor, 0, str);
        beginStructure.encodeSerializableElement(serialDescriptor, 1, (KSerializer) lazyArr[1].getValue(), value.suffixBuilder);
        beginStructure.encodeIntElement(2, value.totalFractionalDigitCount, serialDescriptor);
        beginStructure.encodeIntElement(3, value.maxDisplayWholeDigits, serialDescriptor);
        beginStructure.encodeIntElement(4, value.maxEmptyZeroCount, serialDescriptor);
        beginStructure.encodeSerializableElement(serialDescriptor, 5, (KSerializer) lazyArr[5].getValue(), value.contentLabelBuilder);
        if (beginStructure.shouldEncodeElementDefault(serialDescriptor) || str2 != null) {
            beginStructure.encodeNullableSerializableElement(serialDescriptor, 6, StringSerializer.INSTANCE, str2);
        }
        beginStructure.endStructure(serialDescriptor);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return TuplesKt.EMPTY_SERIALIZER_ARRAY;
    }
}
