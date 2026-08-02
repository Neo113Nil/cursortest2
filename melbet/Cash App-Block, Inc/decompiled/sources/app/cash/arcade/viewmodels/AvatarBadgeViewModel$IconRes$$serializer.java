package app.cash.arcade.viewmodels;

import app.cash.arcade.values.Color;
import app.cash.arcade.values.ColorFilter;
import app.cash.arcade.values.ImageResource;
import app.cash.arcade.values.ImageResource$Id$$serializer;
import app.cash.arcade.viewmodels.AvatarBadgeViewModel;
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
import kotlinx.serialization.internal.TuplesKt;

@Deprecated
@Metadata(d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u001d\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000e0\r¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0012\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"app/cash/arcade/viewmodels/AvatarBadgeViewModel.IconRes.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lapp/cash/arcade/viewmodels/AvatarBadgeViewModel$IconRes;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lapp/cash/arcade/viewmodels/AvatarBadgeViewModel$IconRes;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lapp/cash/arcade/viewmodels/AvatarBadgeViewModel$IconRes;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "values"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* synthetic */ class AvatarBadgeViewModel$IconRes$$serializer implements GeneratedSerializer {
    public static final AvatarBadgeViewModel$IconRes$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        AvatarBadgeViewModel$IconRes$$serializer avatarBadgeViewModel$IconRes$$serializer = new AvatarBadgeViewModel$IconRes$$serializer();
        INSTANCE = avatarBadgeViewModel$IconRes$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("IconRes", avatarBadgeViewModel$IconRes$$serializer, 3);
        pluginGeneratedSerialDescriptor.addElement("image", false);
        pluginGeneratedSerialDescriptor.addElement("backgroundColor", false);
        pluginGeneratedSerialDescriptor.addElement("colorFilter", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer[] childSerializers() {
        Lazy[] lazyArr = AvatarBadgeViewModel.IconRes.$childSerializers;
        return new KSerializer[]{ImageResource$Id$$serializer.INSTANCE, lazyArr[1].getValue(), BuiltinSerializersKt.getNullable((KSerializer) lazyArr[2].getValue())};
    }

    @Override // kotlinx.serialization.KSerializer
    public final AvatarBadgeViewModel.IconRes deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder beginStructure = decoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = AvatarBadgeViewModel.IconRes.$childSerializers;
        boolean z = true;
        int i = 0;
        ImageResource.Id id = null;
        Color color = null;
        ColorFilter colorFilter = null;
        while (z) {
            int decodeElementIndex = beginStructure.decodeElementIndex(serialDescriptor);
            if (decodeElementIndex == -1) {
                z = false;
            } else if (decodeElementIndex == 0) {
                id = (ImageResource.Id) beginStructure.decodeSerializableElement(serialDescriptor, 0, ImageResource$Id$$serializer.INSTANCE, id);
                i |= 1;
            } else if (decodeElementIndex == 1) {
                color = (Color) beginStructure.decodeSerializableElement(serialDescriptor, 1, (KSerializer) lazyArr[1].getValue(), color);
                i |= 2;
            } else {
                if (decodeElementIndex != 2) {
                    LocalPresenterModule$Companion$$ExternalSyntheticLambda0.m(decodeElementIndex);
                    return null;
                }
                colorFilter = (ColorFilter) beginStructure.decodeNullableSerializableElement(serialDescriptor, 2, (KSerializer) lazyArr[2].getValue(), colorFilter);
                i |= 4;
            }
        }
        beginStructure.endStructure(serialDescriptor);
        return new AvatarBadgeViewModel.IconRes(i, id, color, colorFilter);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, AvatarBadgeViewModel.IconRes value) {
        encoder.getClass();
        value.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder beginStructure = encoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = AvatarBadgeViewModel.IconRes.$childSerializers;
        ImageResource$Id$$serializer imageResource$Id$$serializer = ImageResource$Id$$serializer.INSTANCE;
        ImageResource.Id id = value.image;
        ColorFilter colorFilter = value.colorFilter;
        beginStructure.encodeSerializableElement(serialDescriptor, 0, imageResource$Id$$serializer, id);
        beginStructure.encodeSerializableElement(serialDescriptor, 1, (KSerializer) lazyArr[1].getValue(), value.backgroundColor);
        if (beginStructure.shouldEncodeElementDefault(serialDescriptor) || colorFilter != null) {
            beginStructure.encodeNullableSerializableElement(serialDescriptor, 2, (KSerializer) lazyArr[2].getValue(), colorFilter);
        }
        beginStructure.endStructure(serialDescriptor);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return TuplesKt.EMPTY_SERIALIZER_ARRAY;
    }
}
