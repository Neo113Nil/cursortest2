package app.cash.arcade.viewmodels;

import app.cash.arcade.values.Color;
import app.cash.arcade.values.ImageResource;
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
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.StringSerializer;
import kotlinx.serialization.internal.TuplesKt;

@Deprecated
@Metadata(d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u001d\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000e0\r¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0012\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"app/cash/arcade/viewmodels/AvatarViewModel.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lapp/cash/arcade/viewmodels/AvatarViewModel;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lapp/cash/arcade/viewmodels/AvatarViewModel;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lapp/cash/arcade/viewmodels/AvatarViewModel;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "values"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* synthetic */ class AvatarViewModel$$serializer implements GeneratedSerializer {
    public static final AvatarViewModel$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        AvatarViewModel$$serializer avatarViewModel$$serializer = new AvatarViewModel$$serializer();
        INSTANCE = avatarViewModel$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("app.cash.arcade.viewmodels.AvatarViewModel", avatarViewModel$$serializer, 6);
        pluginGeneratedSerialDescriptor.addElement("backgroundColor", true);
        pluginGeneratedSerialDescriptor.addElement("character", true);
        pluginGeneratedSerialDescriptor.addElement("contentDescription", true);
        pluginGeneratedSerialDescriptor.addElement("foregroundColor", true);
        pluginGeneratedSerialDescriptor.addElement("image", true);
        pluginGeneratedSerialDescriptor.addElement("borderColor", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer[] childSerializers() {
        Lazy[] lazyArr = AvatarViewModel.$childSerializers;
        KSerializer nullable = BuiltinSerializersKt.getNullable((KSerializer) lazyArr[0].getValue());
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new KSerializer[]{nullable, BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable((KSerializer) lazyArr[3].getValue()), BuiltinSerializersKt.getNullable((KSerializer) lazyArr[4].getValue()), BuiltinSerializersKt.getNullable((KSerializer) lazyArr[5].getValue())};
    }

    @Override // kotlinx.serialization.KSerializer
    public final AvatarViewModel deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder beginStructure = decoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = AvatarViewModel.$childSerializers;
        boolean z = true;
        int i = 0;
        Color color = null;
        String str = null;
        String str2 = null;
        Color color2 = null;
        ImageResource imageResource = null;
        Color color3 = null;
        while (z) {
            int decodeElementIndex = beginStructure.decodeElementIndex(serialDescriptor);
            switch (decodeElementIndex) {
                case -1:
                    z = false;
                    break;
                case 0:
                    color = (Color) beginStructure.decodeNullableSerializableElement(serialDescriptor, 0, (KSerializer) lazyArr[0].getValue(), color);
                    i |= 1;
                    break;
                case 1:
                    str = (String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, str);
                    i |= 2;
                    break;
                case 2:
                    str2 = (String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, str2);
                    i |= 4;
                    break;
                case 3:
                    color2 = (Color) beginStructure.decodeNullableSerializableElement(serialDescriptor, 3, (KSerializer) lazyArr[3].getValue(), color2);
                    i |= 8;
                    break;
                case 4:
                    imageResource = (ImageResource) beginStructure.decodeNullableSerializableElement(serialDescriptor, 4, (KSerializer) lazyArr[4].getValue(), imageResource);
                    i |= 16;
                    break;
                case 5:
                    color3 = (Color) beginStructure.decodeNullableSerializableElement(serialDescriptor, 5, (KSerializer) lazyArr[5].getValue(), color3);
                    i |= 32;
                    break;
                default:
                    LocalPresenterModule$Companion$$ExternalSyntheticLambda0.m(decodeElementIndex);
                    return null;
            }
        }
        beginStructure.endStructure(serialDescriptor);
        return new AvatarViewModel(i, color, str, str2, color2, imageResource, color3);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, AvatarViewModel value) {
        encoder.getClass();
        value.getClass();
        Color color = value.borderColor;
        ImageResource imageResource = value.image;
        Color color2 = value.foregroundColor;
        String str = value.contentDescription;
        String str2 = value.character;
        Color color3 = value.backgroundColor;
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder beginStructure = encoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = AvatarViewModel.$childSerializers;
        if (beginStructure.shouldEncodeElementDefault(serialDescriptor) || color3 != null) {
            beginStructure.encodeNullableSerializableElement(serialDescriptor, 0, (KSerializer) lazyArr[0].getValue(), color3);
        }
        if (beginStructure.shouldEncodeElementDefault(serialDescriptor) || str2 != null) {
            beginStructure.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, str2);
        }
        if (beginStructure.shouldEncodeElementDefault(serialDescriptor) || str != null) {
            beginStructure.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, str);
        }
        if (beginStructure.shouldEncodeElementDefault(serialDescriptor) || color2 != null) {
            beginStructure.encodeNullableSerializableElement(serialDescriptor, 3, (KSerializer) lazyArr[3].getValue(), color2);
        }
        if (beginStructure.shouldEncodeElementDefault(serialDescriptor) || imageResource != null) {
            beginStructure.encodeNullableSerializableElement(serialDescriptor, 4, (KSerializer) lazyArr[4].getValue(), imageResource);
        }
        if (beginStructure.shouldEncodeElementDefault(serialDescriptor) || color != null) {
            beginStructure.encodeNullableSerializableElement(serialDescriptor, 5, (KSerializer) lazyArr[5].getValue(), color);
        }
        beginStructure.endStructure(serialDescriptor);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return TuplesKt.EMPTY_SERIALIZER_ARRAY;
    }
}
