package com.miteksystems.misnap.core;

import app.cash.local.presenters.LocalPresenterModule$Companion$$ExternalSyntheticLambda0;
import com.miteksystems.misnap.core.MiSnapSettings;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.EnumSerializer;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.TuplesKt;

@Deprecated
@Metadata(d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u001a\u0010\u0005\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ \u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0014\u001a\u00020\u00118VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, d2 = {"com/miteksystems/misnap/core/MiSnapSettings.Camera.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/miteksystems/misnap/core/MiSnapSettings$Camera;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/miteksystems/misnap/core/MiSnapSettings$Camera;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/miteksystems/misnap/core/MiSnapSettings$Camera;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class MiSnapSettings$Camera$$serializer implements GeneratedSerializer {
    public static final MiSnapSettings$Camera$$serializer INSTANCE;
    public static final /* synthetic */ PluginGeneratedSerialDescriptor a;

    static {
        MiSnapSettings$Camera$$serializer miSnapSettings$Camera$$serializer = new MiSnapSettings$Camera$$serializer();
        INSTANCE = miSnapSettings$Camera$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.miteksystems.misnap.core.MiSnapSettings.Camera", miSnapSettings$Camera$$serializer, 5);
        pluginGeneratedSerialDescriptor.addElement("advanced", true);
        pluginGeneratedSerialDescriptor.addElement("videoRecord", true);
        pluginGeneratedSerialDescriptor.addElement("torchMode", true);
        pluginGeneratedSerialDescriptor.addElement("profile", true);
        pluginGeneratedSerialDescriptor.addElement("enableHighResolutionFrames", true);
        a = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public KSerializer[] childSerializers() {
        MiSnapSettings.Camera.TorchMode[] values = MiSnapSettings.Camera.TorchMode.values();
        values.getClass();
        KSerializer nullable = BuiltinSerializersKt.getNullable(new EnumSerializer("com.miteksystems.misnap.core.MiSnapSettings.Camera.TorchMode", (Enum[]) values));
        MiSnapSettings.Camera.Profile[] values2 = MiSnapSettings.Camera.Profile.values();
        values2.getClass();
        return new KSerializer[]{MiSnapSettings$Camera$Advanced$$serializer.INSTANCE, MiSnapSettings$Camera$VideoRecord$$serializer.INSTANCE, nullable, BuiltinSerializersKt.getNullable(new EnumSerializer("com.miteksystems.misnap.core.MiSnapSettings.Camera.Profile", (Enum[]) values2)), BuiltinSerializersKt.getNullable(BooleanSerializer.INSTANCE)};
    }

    @Override // kotlinx.serialization.KSerializer
    public MiSnapSettings.Camera deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor descriptor = getDescriptor();
        CompositeDecoder beginStructure = decoder.beginStructure(descriptor);
        boolean z = true;
        int i = 0;
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        Object obj4 = null;
        Object obj5 = null;
        while (z) {
            int decodeElementIndex = beginStructure.decodeElementIndex(descriptor);
            if (decodeElementIndex == -1) {
                z = false;
            } else if (decodeElementIndex == 0) {
                obj = beginStructure.decodeSerializableElement(descriptor, 0, MiSnapSettings$Camera$Advanced$$serializer.INSTANCE, obj);
                i |= 1;
            } else if (decodeElementIndex == 1) {
                obj2 = beginStructure.decodeSerializableElement(descriptor, 1, MiSnapSettings$Camera$VideoRecord$$serializer.INSTANCE, obj2);
                i |= 2;
            } else if (decodeElementIndex == 2) {
                MiSnapSettings.Camera.TorchMode[] values = MiSnapSettings.Camera.TorchMode.values();
                values.getClass();
                obj3 = beginStructure.decodeNullableSerializableElement(descriptor, 2, new EnumSerializer("com.miteksystems.misnap.core.MiSnapSettings.Camera.TorchMode", (Enum[]) values), obj3);
                i |= 4;
            } else if (decodeElementIndex == 3) {
                MiSnapSettings.Camera.Profile[] values2 = MiSnapSettings.Camera.Profile.values();
                values2.getClass();
                obj4 = beginStructure.decodeNullableSerializableElement(descriptor, 3, new EnumSerializer("com.miteksystems.misnap.core.MiSnapSettings.Camera.Profile", (Enum[]) values2), obj4);
                i |= 8;
            } else {
                if (decodeElementIndex != 4) {
                    LocalPresenterModule$Companion$$ExternalSyntheticLambda0.m(decodeElementIndex);
                    return null;
                }
                obj5 = beginStructure.decodeNullableSerializableElement(descriptor, 4, BooleanSerializer.INSTANCE, obj5);
                i |= 16;
            }
        }
        beginStructure.endStructure(descriptor);
        return new MiSnapSettings.Camera(i, (MiSnapSettings.Camera.Advanced) obj, (MiSnapSettings.Camera.VideoRecord) obj2, (MiSnapSettings.Camera.TorchMode) obj3, (MiSnapSettings.Camera.Profile) obj4, (Boolean) obj5);
    }

    @Override // kotlinx.serialization.KSerializer
    public SerialDescriptor getDescriptor() {
        return a;
    }

    @Override // kotlinx.serialization.KSerializer
    public void serialize(Encoder encoder, MiSnapSettings.Camera value) {
        encoder.getClass();
        value.getClass();
        SerialDescriptor descriptor = getDescriptor();
        CompositeEncoder beginStructure = encoder.beginStructure(descriptor);
        Boolean bool = value.c;
        MiSnapSettings.Camera.VideoRecord videoRecord = value.videoRecord;
        MiSnapSettings.Camera.Advanced advanced = value.advanced;
        if (beginStructure.shouldEncodeElementDefault(descriptor) || !Intrinsics.areEqual(advanced, new MiSnapSettings.Camera.Advanced())) {
            beginStructure.encodeSerializableElement(descriptor, 0, MiSnapSettings$Camera$Advanced$$serializer.INSTANCE, advanced);
        }
        if (beginStructure.shouldEncodeElementDefault(descriptor) || !Intrinsics.areEqual(videoRecord, new MiSnapSettings.Camera.VideoRecord())) {
            beginStructure.encodeSerializableElement(descriptor, 1, MiSnapSettings$Camera$VideoRecord$$serializer.INSTANCE, videoRecord);
        }
        if (beginStructure.shouldEncodeElementDefault(descriptor) || value.a != null) {
            MiSnapSettings.Camera.TorchMode[] values = MiSnapSettings.Camera.TorchMode.values();
            values.getClass();
            beginStructure.encodeNullableSerializableElement(descriptor, 2, new EnumSerializer("com.miteksystems.misnap.core.MiSnapSettings.Camera.TorchMode", (Enum[]) values), value.a);
        }
        if (beginStructure.shouldEncodeElementDefault(descriptor) || value.b != null) {
            MiSnapSettings.Camera.Profile[] values2 = MiSnapSettings.Camera.Profile.values();
            values2.getClass();
            beginStructure.encodeNullableSerializableElement(descriptor, 3, new EnumSerializer("com.miteksystems.misnap.core.MiSnapSettings.Camera.Profile", (Enum[]) values2), value.b);
        }
        if (beginStructure.shouldEncodeElementDefault(descriptor) || bool != null) {
            beginStructure.encodeNullableSerializableElement(descriptor, 4, BooleanSerializer.INSTANCE, bool);
        }
        beginStructure.endStructure(descriptor);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public KSerializer[] typeParametersSerializers() {
        return TuplesKt.EMPTY_SERIALIZER_ARRAY;
    }
}
