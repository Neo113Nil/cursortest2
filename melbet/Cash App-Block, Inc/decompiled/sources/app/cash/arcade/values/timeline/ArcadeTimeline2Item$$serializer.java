package app.cash.arcade.values.timeline;

import app.cash.arcade.values.Color;
import app.cash.arcade.values.timeline.ArcadeTimeline2Item;
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
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.StringSerializer;
import kotlinx.serialization.internal.TuplesKt;

@Deprecated
@Metadata(d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u001d\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000e0\r¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0012\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"app/cash/arcade/values/timeline/ArcadeTimeline2Item.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lapp/cash/arcade/values/timeline/ArcadeTimeline2Item;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lapp/cash/arcade/values/timeline/ArcadeTimeline2Item;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lapp/cash/arcade/values/timeline/ArcadeTimeline2Item;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "values"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* synthetic */ class ArcadeTimeline2Item$$serializer implements GeneratedSerializer {
    public static final ArcadeTimeline2Item$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        ArcadeTimeline2Item$$serializer arcadeTimeline2Item$$serializer = new ArcadeTimeline2Item$$serializer();
        INSTANCE = arcadeTimeline2Item$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("app.cash.arcade.values.timeline.ArcadeTimeline2Item", arcadeTimeline2Item$$serializer, 9);
        pluginGeneratedSerialDescriptor.addElement("state", false);
        pluginGeneratedSerialDescriptor.addElement("title", false);
        pluginGeneratedSerialDescriptor.addElement("value", true);
        pluginGeneratedSerialDescriptor.addElement("valueColor", true);
        pluginGeneratedSerialDescriptor.addElement("body", true);
        pluginGeneratedSerialDescriptor.addElement("bodyColor", true);
        pluginGeneratedSerialDescriptor.addElement("valueDescriptor", true);
        pluginGeneratedSerialDescriptor.addElement("isClickable", true);
        pluginGeneratedSerialDescriptor.addElement("id", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer[] childSerializers() {
        Lazy[] lazyArr = ArcadeTimeline2Item.$childSerializers;
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new KSerializer[]{lazyArr[0].getValue(), stringSerializer, BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable((KSerializer) lazyArr[3].getValue()), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable((KSerializer) lazyArr[5].getValue()), BuiltinSerializersKt.getNullable(stringSerializer), BooleanSerializer.INSTANCE, BuiltinSerializersKt.getNullable(stringSerializer)};
    }

    @Override // kotlinx.serialization.KSerializer
    public final ArcadeTimeline2Item deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder beginStructure = decoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = ArcadeTimeline2Item.$childSerializers;
        ArcadeTimeline2Item arcadeTimeline2Item = null;
        boolean z = true;
        String str = null;
        ArcadeTimeline2Item.State state = null;
        String str2 = null;
        String str3 = null;
        Color color = null;
        String str4 = null;
        Color color2 = null;
        String str5 = null;
        int i = 0;
        boolean z2 = false;
        while (z) {
            int decodeElementIndex = beginStructure.decodeElementIndex(serialDescriptor);
            switch (decodeElementIndex) {
                case -1:
                    z = false;
                    break;
                case 0:
                    state = (ArcadeTimeline2Item.State) beginStructure.decodeSerializableElement(serialDescriptor, 0, (KSerializer) lazyArr[0].getValue(), state);
                    i |= 1;
                    break;
                case 1:
                    str2 = beginStructure.decodeStringElement(serialDescriptor, 1);
                    i |= 2;
                    break;
                case 2:
                    str3 = (String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, str3);
                    i |= 4;
                    break;
                case 3:
                    color = (Color) beginStructure.decodeNullableSerializableElement(serialDescriptor, 3, (KSerializer) lazyArr[3].getValue(), color);
                    i |= 8;
                    break;
                case 4:
                    str4 = (String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, str4);
                    i |= 16;
                    break;
                case 5:
                    color2 = (Color) beginStructure.decodeNullableSerializableElement(serialDescriptor, 5, (KSerializer) lazyArr[5].getValue(), color2);
                    i |= 32;
                    break;
                case 6:
                    str5 = (String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 6, StringSerializer.INSTANCE, str5);
                    i |= 64;
                    break;
                case 7:
                    z2 = beginStructure.decodeBooleanElement(serialDescriptor, 7);
                    i |= 128;
                    break;
                case 8:
                    str = (String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 8, StringSerializer.INSTANCE, str);
                    i |= 256;
                    break;
                default:
                    LocalPresenterModule$Companion$$ExternalSyntheticLambda0.m(decodeElementIndex);
                    return arcadeTimeline2Item;
            }
            arcadeTimeline2Item = null;
        }
        beginStructure.endStructure(serialDescriptor);
        return new ArcadeTimeline2Item(i, state, str2, str3, color, str4, color2, str5, z2, str);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, ArcadeTimeline2Item value) {
        encoder.getClass();
        value.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder beginStructure = encoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = ArcadeTimeline2Item.$childSerializers;
        KSerializer kSerializer = (KSerializer) lazyArr[0].getValue();
        ArcadeTimeline2Item.State state = value.state;
        String str = value.id;
        boolean z = value.isClickable;
        String str2 = value.valueDescriptor;
        Color color = value.bodyColor;
        String str3 = value.body;
        Color color2 = value.valueColor;
        String str4 = value.value;
        beginStructure.encodeSerializableElement(serialDescriptor, 0, kSerializer, state);
        beginStructure.encodeStringElement(serialDescriptor, 1, value.title);
        if (beginStructure.shouldEncodeElementDefault(serialDescriptor) || str4 != null) {
            beginStructure.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, str4);
        }
        if (beginStructure.shouldEncodeElementDefault(serialDescriptor) || color2 != null) {
            beginStructure.encodeNullableSerializableElement(serialDescriptor, 3, (KSerializer) lazyArr[3].getValue(), color2);
        }
        if (beginStructure.shouldEncodeElementDefault(serialDescriptor) || str3 != null) {
            beginStructure.encodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, str3);
        }
        if (beginStructure.shouldEncodeElementDefault(serialDescriptor) || color != null) {
            beginStructure.encodeNullableSerializableElement(serialDescriptor, 5, (KSerializer) lazyArr[5].getValue(), color);
        }
        if (beginStructure.shouldEncodeElementDefault(serialDescriptor) || str2 != null) {
            beginStructure.encodeNullableSerializableElement(serialDescriptor, 6, StringSerializer.INSTANCE, str2);
        }
        if (beginStructure.shouldEncodeElementDefault(serialDescriptor) || z) {
            beginStructure.encodeBooleanElement(serialDescriptor, 7, z);
        }
        if (beginStructure.shouldEncodeElementDefault(serialDescriptor) || str != null) {
            beginStructure.encodeNullableSerializableElement(serialDescriptor, 8, StringSerializer.INSTANCE, str);
        }
        beginStructure.endStructure(serialDescriptor);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return TuplesKt.EMPTY_SERIALIZER_ARRAY;
    }
}
