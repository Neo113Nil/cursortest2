package app.cash.arcade.values.internal;

import androidx.work.Data$$ExternalSyntheticLambda0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.IntCompanionObject;
import kotlin.ranges.IntRange;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerializationException;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialDescriptorImpl;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PairSerializer$$ExternalSyntheticLambda0;
import okhttp3.internal.Tags;

/* loaded from: classes3.dex */
public final class IntRangeSerializer implements KSerializer {
    public static final IntRangeSerializer INSTANCE = new IntRangeSerializer();
    public static final SerialDescriptorImpl descriptor;
    public static final KSerializer intSerializer;

    static {
        KSerializer serializer = BuiltinSerializersKt.serializer(IntCompanionObject.INSTANCE);
        intSerializer = serializer;
        serializer.getClass();
        Tags.buildClassSerialDescriptor("kotlin.Pair", new SerialDescriptor[0], new PairSerializer$$ExternalSyntheticLambda0(serializer, serializer, 0));
        descriptor = Tags.buildClassSerialDescriptor("kotlin.ranges.IntRange", new SerialDescriptor[0], new Data$$ExternalSyntheticLambda0(7));
    }

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        SerialDescriptorImpl serialDescriptorImpl = descriptor;
        CompositeDecoder beginStructure = decoder.beginStructure(serialDescriptorImpl);
        Integer num = null;
        Integer num2 = null;
        while (true) {
            int decodeElementIndex = beginStructure.decodeElementIndex(serialDescriptorImpl);
            if (decodeElementIndex == -1) {
                if (num == null) {
                    throw new SerializationException("Element 'start' is missing");
                }
                int intValue = num.intValue();
                if (num2 == null) {
                    throw new SerializationException("Element 'endInclusive' is missing");
                }
                IntRange intRange = new IntRange(intValue, num2.intValue(), 1);
                beginStructure.endStructure(serialDescriptorImpl);
                return intRange;
            }
            KSerializer kSerializer = intSerializer;
            if (decodeElementIndex == 0) {
                num = (Integer) beginStructure.decodeSerializableElement(serialDescriptorImpl, 0, kSerializer, null);
            } else {
                if (decodeElementIndex != 1) {
                    throw new SerializationException(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(decodeElementIndex, "Invalid index: "));
                }
                num2 = (Integer) beginStructure.decodeSerializableElement(serialDescriptorImpl, 1, kSerializer, null);
            }
        }
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        IntRange intRange = (IntRange) obj;
        intRange.getClass();
        SerialDescriptorImpl serialDescriptorImpl = descriptor;
        CompositeEncoder beginStructure = encoder.beginStructure(serialDescriptorImpl);
        KSerializer kSerializer = intSerializer;
        beginStructure.encodeSerializableElement(serialDescriptorImpl, 0, kSerializer, Integer.valueOf(intRange.first));
        beginStructure.encodeSerializableElement(serialDescriptorImpl, 1, kSerializer, Integer.valueOf(intRange.last));
        beginStructure.endStructure(serialDescriptorImpl);
    }
}
