package com.miteksystems.misnap.core;

import app.cash.local.presenters.LocalPresenterModule$Companion$$ExternalSyntheticLambda0;
import com.miteksystems.misnap.core.MibiData;
import kotlin.Deprecated;
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
@Metadata(d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u001a\u0010\u0005\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ \u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0014\u001a\u00020\u00118VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, d2 = {"com/miteksystems/misnap/core/MibiData.PlatformPrivate.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/miteksystems/misnap/core/MibiData$PlatformPrivate;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/miteksystems/misnap/core/MibiData$PlatformPrivate;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/miteksystems/misnap/core/MibiData$PlatformPrivate;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class MibiData$PlatformPrivate$$serializer implements GeneratedSerializer {
    public static final MibiData$PlatformPrivate$$serializer INSTANCE;
    public static final /* synthetic */ PluginGeneratedSerialDescriptor a;

    static {
        MibiData$PlatformPrivate$$serializer mibiData$PlatformPrivate$$serializer = new MibiData$PlatformPrivate$$serializer();
        INSTANCE = mibiData$PlatformPrivate$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.miteksystems.misnap.core.MibiData.PlatformPrivate", mibiData$PlatformPrivate$$serializer, 5);
        pluginGeneratedSerialDescriptor.addElement("UXP", false);
        pluginGeneratedSerialDescriptor.addElement("OriginalSettings", true);
        pluginGeneratedSerialDescriptor.addElement("FinalSettings", true);
        pluginGeneratedSerialDescriptor.addElement("CameraInfo", true);
        pluginGeneratedSerialDescriptor.addElement("MicrophoneInfo", true);
        a = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public KSerializer[] childSerializers() {
        MibiData.MiSnapSettingsSerializer miSnapSettingsSerializer = MibiData.MiSnapSettingsSerializer.INSTANCE;
        return new KSerializer[]{MibiData$Uxp$$serializer.INSTANCE, BuiltinSerializersKt.getNullable(miSnapSettingsSerializer), BuiltinSerializersKt.getNullable(miSnapSettingsSerializer), BuiltinSerializersKt.getNullable(MiSnapCameraInfo$$serializer.INSTANCE), BuiltinSerializersKt.getNullable(MibiData$MicrophoneInfo$$serializer.INSTANCE)};
    }

    @Override // kotlinx.serialization.KSerializer
    public MibiData.PlatformPrivate deserialize(Decoder decoder) {
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
                obj = beginStructure.decodeSerializableElement(descriptor, 0, MibiData$Uxp$$serializer.INSTANCE, obj);
                i |= 1;
            } else if (decodeElementIndex == 1) {
                obj2 = beginStructure.decodeNullableSerializableElement(descriptor, 1, MibiData.MiSnapSettingsSerializer.INSTANCE, obj2);
                i |= 2;
            } else if (decodeElementIndex == 2) {
                obj3 = beginStructure.decodeNullableSerializableElement(descriptor, 2, MibiData.MiSnapSettingsSerializer.INSTANCE, obj3);
                i |= 4;
            } else if (decodeElementIndex == 3) {
                obj4 = beginStructure.decodeNullableSerializableElement(descriptor, 3, MiSnapCameraInfo$$serializer.INSTANCE, obj4);
                i |= 8;
            } else {
                if (decodeElementIndex != 4) {
                    LocalPresenterModule$Companion$$ExternalSyntheticLambda0.m(decodeElementIndex);
                    return null;
                }
                obj5 = beginStructure.decodeNullableSerializableElement(descriptor, 4, MibiData$MicrophoneInfo$$serializer.INSTANCE, obj5);
                i |= 16;
            }
        }
        beginStructure.endStructure(descriptor);
        return new MibiData.PlatformPrivate(i, (MibiData.Uxp) obj, (MiSnapSettings) obj2, (MiSnapSettings) obj3, (MiSnapCameraInfo) obj4, (MibiData.MicrophoneInfo) obj5);
    }

    @Override // kotlinx.serialization.KSerializer
    public SerialDescriptor getDescriptor() {
        return a;
    }

    @Override // kotlinx.serialization.KSerializer
    public void serialize(Encoder encoder, MibiData.PlatformPrivate value) {
        encoder.getClass();
        value.getClass();
        SerialDescriptor descriptor = getDescriptor();
        CompositeEncoder beginStructure = encoder.beginStructure(descriptor);
        MibiData$Uxp$$serializer mibiData$Uxp$$serializer = MibiData$Uxp$$serializer.INSTANCE;
        MibiData.Uxp uxp = value.a;
        MibiData.MicrophoneInfo microphoneInfo = value.e;
        MiSnapCameraInfo miSnapCameraInfo = value.d;
        MiSnapSettings miSnapSettings = value.c;
        MiSnapSettings miSnapSettings2 = value.b;
        beginStructure.encodeSerializableElement(descriptor, 0, mibiData$Uxp$$serializer, uxp);
        if (beginStructure.shouldEncodeElementDefault(descriptor) || miSnapSettings2 != null) {
            beginStructure.encodeNullableSerializableElement(descriptor, 1, MibiData.MiSnapSettingsSerializer.INSTANCE, miSnapSettings2);
        }
        if (beginStructure.shouldEncodeElementDefault(descriptor) || miSnapSettings != null) {
            beginStructure.encodeNullableSerializableElement(descriptor, 2, MibiData.MiSnapSettingsSerializer.INSTANCE, miSnapSettings);
        }
        if (beginStructure.shouldEncodeElementDefault(descriptor) || miSnapCameraInfo != null) {
            beginStructure.encodeNullableSerializableElement(descriptor, 3, MiSnapCameraInfo$$serializer.INSTANCE, miSnapCameraInfo);
        }
        if (beginStructure.shouldEncodeElementDefault(descriptor) || microphoneInfo != null) {
            beginStructure.encodeNullableSerializableElement(descriptor, 4, MibiData$MicrophoneInfo$$serializer.INSTANCE, microphoneInfo);
        }
        beginStructure.endStructure(descriptor);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public KSerializer[] typeParametersSerializers() {
        return TuplesKt.EMPTY_SERIALIZER_ARRAY;
    }
}
