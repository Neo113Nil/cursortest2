package app.cash.redwood.protocol;

import app.cash.local.presenters.LocalPresenterModule$Companion$$ExternalSyntheticLambda0;
import app.cash.redwood.protocol.ChildrenChange;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.TuplesKt;

@Deprecated
@Metadata(d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u001d\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000e0\r¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0012\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"app/cash/redwood/protocol/ChildrenChange.Remove.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lapp/cash/redwood/protocol/ChildrenChange$Remove;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lapp/cash/redwood/protocol/ChildrenChange$Remove;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lapp/cash/redwood/protocol/ChildrenChange$Remove;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "redwood-protocol"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* synthetic */ class ChildrenChange$Remove$$serializer implements GeneratedSerializer {
    public static final ChildrenChange$Remove$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        ChildrenChange$Remove$$serializer childrenChange$Remove$$serializer = new ChildrenChange$Remove$$serializer();
        INSTANCE = childrenChange$Remove$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("remove", childrenChange$Remove$$serializer, 5);
        pluginGeneratedSerialDescriptor.addElement("id", false);
        pluginGeneratedSerialDescriptor.addElement("tag", false);
        pluginGeneratedSerialDescriptor.addElement("index", false);
        pluginGeneratedSerialDescriptor.addElement("count", false);
        pluginGeneratedSerialDescriptor.addElement("detach", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer[] childSerializers() {
        IntSerializer intSerializer = IntSerializer.INSTANCE;
        return new KSerializer[]{intSerializer, intSerializer, intSerializer, intSerializer, BooleanSerializer.INSTANCE};
    }

    @Override // kotlinx.serialization.KSerializer
    public final ChildrenChange.Remove deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder beginStructure = decoder.beginStructure(serialDescriptor);
        boolean z = true;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        boolean z2 = false;
        int i4 = 0;
        int i5 = 0;
        while (z) {
            int decodeElementIndex = beginStructure.decodeElementIndex(serialDescriptor);
            if (decodeElementIndex == -1) {
                z = false;
            } else if (decodeElementIndex == 0) {
                i2 = beginStructure.decodeIntElement(serialDescriptor, 0);
                i |= 1;
            } else if (decodeElementIndex == 1) {
                i3 = beginStructure.decodeIntElement(serialDescriptor, 1);
                i |= 2;
            } else if (decodeElementIndex == 2) {
                i4 = beginStructure.decodeIntElement(serialDescriptor, 2);
                i |= 4;
            } else if (decodeElementIndex == 3) {
                i5 = beginStructure.decodeIntElement(serialDescriptor, 3);
                i |= 8;
            } else {
                if (decodeElementIndex != 4) {
                    LocalPresenterModule$Companion$$ExternalSyntheticLambda0.m(decodeElementIndex);
                    return null;
                }
                z2 = beginStructure.decodeBooleanElement(serialDescriptor, 4);
                i |= 16;
            }
        }
        beginStructure.endStructure(serialDescriptor);
        return new ChildrenChange.Remove(i, i2, i3, z2, i4, i5);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, ChildrenChange.Remove value) {
        encoder.getClass();
        value.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder beginStructure = encoder.beginStructure(serialDescriptor);
        int i = value._id;
        boolean z = value.detach;
        beginStructure.encodeIntElement(0, i, serialDescriptor);
        beginStructure.encodeIntElement(1, value._tag, serialDescriptor);
        beginStructure.encodeIntElement(2, value.index, serialDescriptor);
        beginStructure.encodeIntElement(3, value.count, serialDescriptor);
        if (beginStructure.shouldEncodeElementDefault(serialDescriptor) || z) {
            beginStructure.encodeBooleanElement(serialDescriptor, 4, z);
        }
        beginStructure.endStructure(serialDescriptor);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public /* bridge */ /* synthetic */ KSerializer[] typeParametersSerializers() {
        return TuplesKt.EMPTY_SERIALIZER_ARRAY;
    }
}
