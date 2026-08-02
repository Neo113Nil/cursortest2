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
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.TuplesKt;

@Metadata(d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u001a\u0010\u0005\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ \u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0014\u001a\u00020\u00118VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, d2 = {"com/miteksystems/misnap/core/MiSnapSettings.Analysis.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/miteksystems/misnap/core/MiSnapSettings$Analysis;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/miteksystems/misnap/core/MiSnapSettings$Analysis;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/miteksystems/misnap/core/MiSnapSettings$Analysis;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@Deprecated
/* loaded from: classes4.dex */
public final class MiSnapSettings$Analysis$$serializer implements GeneratedSerializer {
    public static final MiSnapSettings$Analysis$$serializer INSTANCE;
    public static final /* synthetic */ PluginGeneratedSerialDescriptor a;

    static {
        MiSnapSettings$Analysis$$serializer miSnapSettings$Analysis$$serializer = new MiSnapSettings$Analysis$$serializer();
        INSTANCE = miSnapSettings$Analysis$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.miteksystems.misnap.core.MiSnapSettings.Analysis", miSnapSettings$Analysis$$serializer, 8);
        pluginGeneratedSerialDescriptor.addElement("document", true);
        pluginGeneratedSerialDescriptor.addElement("face", true);
        pluginGeneratedSerialDescriptor.addElement("barcode", true);
        pluginGeneratedSerialDescriptor.addElement("jpgQuality", true);
        pluginGeneratedSerialDescriptor.addElement("initialDelay", true);
        pluginGeneratedSerialDescriptor.addElement("motionDetectorSensitivity", true);
        pluginGeneratedSerialDescriptor.addElement("enableAiBasedRts", true);
        pluginGeneratedSerialDescriptor.addElement("aiBasedRtsPayloadSize", true);
        a = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public KSerializer[] childSerializers() {
        IntSerializer intSerializer = IntSerializer.INSTANCE;
        KSerializer nullable = BuiltinSerializersKt.getNullable(intSerializer);
        KSerializer nullable2 = BuiltinSerializersKt.getNullable(intSerializer);
        MiSnapSettings.Analysis.MotionDetectorSensitivity[] values = MiSnapSettings.Analysis.MotionDetectorSensitivity.values();
        values.getClass();
        KSerializer nullable3 = BuiltinSerializersKt.getNullable(new EnumSerializer("com.miteksystems.misnap.core.MiSnapSettings.Analysis.MotionDetectorSensitivity", (Enum[]) values));
        KSerializer nullable4 = BuiltinSerializersKt.getNullable(BooleanSerializer.INSTANCE);
        MiSnapSettings.Analysis.AiBasedRtsPayloadSize[] values2 = MiSnapSettings.Analysis.AiBasedRtsPayloadSize.values();
        values2.getClass();
        return new KSerializer[]{MiSnapSettings$Analysis$Document$$serializer.INSTANCE, MiSnapSettings$Analysis$Face$$serializer.INSTANCE, MiSnapSettings$Analysis$Barcode$$serializer.INSTANCE, nullable, nullable2, nullable3, nullable4, BuiltinSerializersKt.getNullable(new EnumSerializer("com.miteksystems.misnap.core.MiSnapSettings.Analysis.AiBasedRtsPayloadSize", (Enum[]) values2))};
    }

    @Override // kotlinx.serialization.KSerializer
    public MiSnapSettings.Analysis deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor descriptor = getDescriptor();
        CompositeDecoder beginStructure = decoder.beginStructure(descriptor);
        MiSnapSettings.Analysis analysis = null;
        boolean z = true;
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        Object obj4 = null;
        Object obj5 = null;
        Object obj6 = null;
        Object obj7 = null;
        Object obj8 = null;
        int i = 0;
        while (z) {
            int decodeElementIndex = beginStructure.decodeElementIndex(descriptor);
            switch (decodeElementIndex) {
                case -1:
                    z = false;
                    break;
                case 0:
                    obj = beginStructure.decodeSerializableElement(descriptor, 0, MiSnapSettings$Analysis$Document$$serializer.INSTANCE, obj);
                    i |= 1;
                    break;
                case 1:
                    obj2 = beginStructure.decodeSerializableElement(descriptor, 1, MiSnapSettings$Analysis$Face$$serializer.INSTANCE, obj2);
                    i |= 2;
                    break;
                case 2:
                    obj3 = beginStructure.decodeSerializableElement(descriptor, 2, MiSnapSettings$Analysis$Barcode$$serializer.INSTANCE, obj3);
                    i |= 4;
                    break;
                case 3:
                    obj4 = beginStructure.decodeNullableSerializableElement(descriptor, 3, IntSerializer.INSTANCE, obj4);
                    i |= 8;
                    break;
                case 4:
                    obj5 = beginStructure.decodeNullableSerializableElement(descriptor, 4, IntSerializer.INSTANCE, obj5);
                    i |= 16;
                    break;
                case 5:
                    MiSnapSettings.Analysis.MotionDetectorSensitivity[] values = MiSnapSettings.Analysis.MotionDetectorSensitivity.values();
                    values.getClass();
                    obj6 = beginStructure.decodeNullableSerializableElement(descriptor, 5, new EnumSerializer("com.miteksystems.misnap.core.MiSnapSettings.Analysis.MotionDetectorSensitivity", (Enum[]) values), obj6);
                    i |= 32;
                    break;
                case 6:
                    obj7 = beginStructure.decodeNullableSerializableElement(descriptor, 6, BooleanSerializer.INSTANCE, obj7);
                    i |= 64;
                    break;
                case 7:
                    MiSnapSettings.Analysis.AiBasedRtsPayloadSize[] values2 = MiSnapSettings.Analysis.AiBasedRtsPayloadSize.values();
                    values2.getClass();
                    obj8 = beginStructure.decodeNullableSerializableElement(descriptor, 7, new EnumSerializer("com.miteksystems.misnap.core.MiSnapSettings.Analysis.AiBasedRtsPayloadSize", (Enum[]) values2), obj8);
                    i |= 128;
                    break;
                default:
                    LocalPresenterModule$Companion$$ExternalSyntheticLambda0.m(decodeElementIndex);
                    return analysis;
            }
            analysis = null;
        }
        beginStructure.endStructure(descriptor);
        return new MiSnapSettings.Analysis(i, (MiSnapSettings.Analysis.Document) obj, (MiSnapSettings.Analysis.Face) obj2, (MiSnapSettings.Analysis.Barcode) obj3, (Integer) obj4, (Integer) obj5, (MiSnapSettings.Analysis.MotionDetectorSensitivity) obj6, (Boolean) obj7, (MiSnapSettings.Analysis.AiBasedRtsPayloadSize) obj8);
    }

    @Override // kotlinx.serialization.KSerializer
    public SerialDescriptor getDescriptor() {
        return a;
    }

    @Override // kotlinx.serialization.KSerializer
    public void serialize(Encoder encoder, MiSnapSettings.Analysis value) {
        encoder.getClass();
        value.getClass();
        SerialDescriptor descriptor = getDescriptor();
        CompositeEncoder beginStructure = encoder.beginStructure(descriptor);
        MiSnapSettings.Analysis.AiBasedRtsPayloadSize aiBasedRtsPayloadSize = value.e;
        Boolean bool = value.d;
        MiSnapSettings.Analysis.MotionDetectorSensitivity motionDetectorSensitivity = value.c;
        Integer num = value.b;
        MiSnapSettings.Analysis.Barcode barcode = value.barcode;
        MiSnapSettings.Analysis.Face face = value.face;
        MiSnapSettings.Analysis.Document document = value.document;
        if (beginStructure.shouldEncodeElementDefault(descriptor) || !Intrinsics.areEqual(document, new MiSnapSettings.Analysis.Document())) {
            beginStructure.encodeSerializableElement(descriptor, 0, MiSnapSettings$Analysis$Document$$serializer.INSTANCE, document);
        }
        if (beginStructure.shouldEncodeElementDefault(descriptor) || !Intrinsics.areEqual(face, new MiSnapSettings.Analysis.Face())) {
            beginStructure.encodeSerializableElement(descriptor, 1, MiSnapSettings$Analysis$Face$$serializer.INSTANCE, face);
        }
        if (beginStructure.shouldEncodeElementDefault(descriptor) || !Intrinsics.areEqual(barcode, new MiSnapSettings.Analysis.Barcode())) {
            beginStructure.encodeSerializableElement(descriptor, 2, MiSnapSettings$Analysis$Barcode$$serializer.INSTANCE, barcode);
        }
        if (beginStructure.shouldEncodeElementDefault(descriptor) || value.a != null) {
            beginStructure.encodeNullableSerializableElement(descriptor, 3, IntSerializer.INSTANCE, value.a);
        }
        if (beginStructure.shouldEncodeElementDefault(descriptor) || num != null) {
            beginStructure.encodeNullableSerializableElement(descriptor, 4, IntSerializer.INSTANCE, num);
        }
        if (beginStructure.shouldEncodeElementDefault(descriptor) || motionDetectorSensitivity != null) {
            MiSnapSettings.Analysis.MotionDetectorSensitivity[] values = MiSnapSettings.Analysis.MotionDetectorSensitivity.values();
            values.getClass();
            beginStructure.encodeNullableSerializableElement(descriptor, 5, new EnumSerializer("com.miteksystems.misnap.core.MiSnapSettings.Analysis.MotionDetectorSensitivity", (Enum[]) values), motionDetectorSensitivity);
        }
        if (beginStructure.shouldEncodeElementDefault(descriptor) || bool != null) {
            beginStructure.encodeNullableSerializableElement(descriptor, 6, BooleanSerializer.INSTANCE, bool);
        }
        if (beginStructure.shouldEncodeElementDefault(descriptor) || aiBasedRtsPayloadSize != null) {
            MiSnapSettings.Analysis.AiBasedRtsPayloadSize[] values2 = MiSnapSettings.Analysis.AiBasedRtsPayloadSize.values();
            values2.getClass();
            beginStructure.encodeNullableSerializableElement(descriptor, 7, new EnumSerializer("com.miteksystems.misnap.core.MiSnapSettings.Analysis.AiBasedRtsPayloadSize", (Enum[]) values2), aiBasedRtsPayloadSize);
        }
        beginStructure.endStructure(descriptor);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public KSerializer[] typeParametersSerializers() {
        return TuplesKt.EMPTY_SERIALIZER_ARRAY;
    }
}
