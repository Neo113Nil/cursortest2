package com.miteksystems.misnap.core;

import android.util.Size;
import app.cash.local.presenters.LocalPresenterModule$Companion$$ExternalSyntheticLambda0;
import com.miteksystems.misnap.core.MiSnapSettings;
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
import kotlinx.serialization.internal.StringSerializer;
import kotlinx.serialization.internal.TuplesKt;

@Deprecated
@Metadata(d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u001a\u0010\u0005\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ \u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0014\u001a\u00020\u00118VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, d2 = {"com/miteksystems/misnap/core/MiSnapCameraInfo.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/miteksystems/misnap/core/MiSnapCameraInfo;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/miteksystems/misnap/core/MiSnapCameraInfo;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/miteksystems/misnap/core/MiSnapCameraInfo;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class MiSnapCameraInfo$$serializer implements GeneratedSerializer {
    public static final MiSnapCameraInfo$$serializer INSTANCE;
    public static final /* synthetic */ PluginGeneratedSerialDescriptor a;

    static {
        MiSnapCameraInfo$$serializer miSnapCameraInfo$$serializer = new MiSnapCameraInfo$$serializer();
        INSTANCE = miSnapCameraInfo$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.miteksystems.misnap.core.MiSnapCameraInfo", miSnapCameraInfo$$serializer, 10);
        pluginGeneratedSerialDescriptor.addElement("SupportsAutoAnalysis", false);
        pluginGeneratedSerialDescriptor.addElement("SupportsAutoFocus", false);
        pluginGeneratedSerialDescriptor.addElement("SupportsTorch", false);
        pluginGeneratedSerialDescriptor.addElement("SupportedPreviewSize", false);
        pluginGeneratedSerialDescriptor.addElement("SupportedImageAnalysisSize", false);
        pluginGeneratedSerialDescriptor.addElement("SupportedPictureSize", false);
        pluginGeneratedSerialDescriptor.addElement("DeviceHardwareLevel", false);
        pluginGeneratedSerialDescriptor.addElement("FacingDirection", false);
        pluginGeneratedSerialDescriptor.addElement("SupportedImageAnalysisHighResolutionSize", true);
        pluginGeneratedSerialDescriptor.addElement("SupportedPictureHighResolutionSize", true);
        a = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public KSerializer[] childSerializers() {
        MiSnapSettings.SizeSerializer sizeSerializer = MiSnapSettings.SizeSerializer.INSTANCE;
        KSerializer nullable = BuiltinSerializersKt.getNullable(sizeSerializer);
        KSerializer nullable2 = BuiltinSerializersKt.getNullable(sizeSerializer);
        BooleanSerializer booleanSerializer = BooleanSerializer.INSTANCE;
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new KSerializer[]{booleanSerializer, booleanSerializer, booleanSerializer, sizeSerializer, sizeSerializer, sizeSerializer, stringSerializer, stringSerializer, nullable, nullable2};
    }

    @Override // kotlinx.serialization.KSerializer
    public MiSnapCameraInfo deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor descriptor = getDescriptor();
        CompositeDecoder beginStructure = decoder.beginStructure(descriptor);
        Object obj = null;
        boolean z = true;
        Object obj2 = null;
        int i = 0;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        Object obj3 = null;
        Object obj4 = null;
        Object obj5 = null;
        String str = null;
        String str2 = null;
        while (z) {
            int decodeElementIndex = beginStructure.decodeElementIndex(descriptor);
            switch (decodeElementIndex) {
                case -1:
                    z = false;
                    break;
                case 0:
                    z2 = beginStructure.decodeBooleanElement(descriptor, 0);
                    i |= 1;
                    break;
                case 1:
                    z3 = beginStructure.decodeBooleanElement(descriptor, 1);
                    i |= 2;
                    break;
                case 2:
                    z4 = beginStructure.decodeBooleanElement(descriptor, 2);
                    i |= 4;
                    break;
                case 3:
                    obj2 = beginStructure.decodeSerializableElement(descriptor, 3, MiSnapSettings.SizeSerializer.INSTANCE, obj2);
                    i |= 8;
                    break;
                case 4:
                    obj3 = beginStructure.decodeSerializableElement(descriptor, 4, MiSnapSettings.SizeSerializer.INSTANCE, obj3);
                    i |= 16;
                    break;
                case 5:
                    obj4 = beginStructure.decodeSerializableElement(descriptor, 5, MiSnapSettings.SizeSerializer.INSTANCE, obj4);
                    i |= 32;
                    break;
                case 6:
                    str = beginStructure.decodeStringElement(descriptor, 6);
                    i |= 64;
                    break;
                case 7:
                    str2 = beginStructure.decodeStringElement(descriptor, 7);
                    i |= 128;
                    break;
                case 8:
                    obj5 = beginStructure.decodeNullableSerializableElement(descriptor, 8, MiSnapSettings.SizeSerializer.INSTANCE, obj5);
                    i |= 256;
                    break;
                case 9:
                    obj = beginStructure.decodeNullableSerializableElement(descriptor, 9, MiSnapSettings.SizeSerializer.INSTANCE, obj);
                    i |= 512;
                    break;
                default:
                    LocalPresenterModule$Companion$$ExternalSyntheticLambda0.m(decodeElementIndex);
                    return null;
            }
        }
        beginStructure.endStructure(descriptor);
        return new MiSnapCameraInfo(i, z2, z3, z4, (Size) obj2, (Size) obj3, (Size) obj4, str, str2, (Size) obj5, (Size) obj);
    }

    @Override // kotlinx.serialization.KSerializer
    public SerialDescriptor getDescriptor() {
        return a;
    }

    @Override // kotlinx.serialization.KSerializer
    public void serialize(Encoder encoder, MiSnapCameraInfo value) {
        encoder.getClass();
        value.getClass();
        SerialDescriptor descriptor = getDescriptor();
        CompositeEncoder beginStructure = encoder.beginStructure(descriptor);
        boolean z = value.a;
        Size size = value.j;
        Size size2 = value.i;
        beginStructure.encodeBooleanElement(descriptor, 0, z);
        beginStructure.encodeBooleanElement(descriptor, 1, value.b);
        beginStructure.encodeBooleanElement(descriptor, 2, value.c);
        MiSnapSettings.SizeSerializer sizeSerializer = MiSnapSettings.SizeSerializer.INSTANCE;
        beginStructure.encodeSerializableElement(descriptor, 3, sizeSerializer, value.d);
        beginStructure.encodeSerializableElement(descriptor, 4, sizeSerializer, value.e);
        beginStructure.encodeSerializableElement(descriptor, 5, sizeSerializer, value.f);
        beginStructure.encodeStringElement(descriptor, 6, value.g);
        beginStructure.encodeStringElement(descriptor, 7, value.h);
        if (beginStructure.shouldEncodeElementDefault(descriptor) || size2 != null) {
            beginStructure.encodeNullableSerializableElement(descriptor, 8, sizeSerializer, size2);
        }
        if (beginStructure.shouldEncodeElementDefault(descriptor) || size != null) {
            beginStructure.encodeNullableSerializableElement(descriptor, 9, sizeSerializer, size);
        }
        beginStructure.endStructure(descriptor);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public KSerializer[] typeParametersSerializers() {
        return TuplesKt.EMPTY_SERIALIZER_ARRAY;
    }
}
