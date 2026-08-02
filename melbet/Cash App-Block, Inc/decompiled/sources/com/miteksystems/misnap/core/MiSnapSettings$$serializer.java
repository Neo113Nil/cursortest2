package com.miteksystems.misnap.core;

import app.cash.local.presenters.LocalPresenterModule$Companion$$ExternalSyntheticLambda0;
import com.miteksystems.misnap.core.MiSnapSettings;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.EnumSerializer;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.StringSerializer;
import kotlinx.serialization.internal.TuplesKt;

@Metadata(d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u001a\u0010\u0005\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ \u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0014\u001a\u00020\u00118VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, d2 = {"com/miteksystems/misnap/core/MiSnapSettings.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/miteksystems/misnap/core/MiSnapSettings;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/miteksystems/misnap/core/MiSnapSettings;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/miteksystems/misnap/core/MiSnapSettings;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@Deprecated
/* loaded from: classes4.dex */
public final class MiSnapSettings$$serializer implements GeneratedSerializer {
    public static final MiSnapSettings$$serializer INSTANCE;
    public static final /* synthetic */ PluginGeneratedSerialDescriptor a;

    static {
        MiSnapSettings$$serializer miSnapSettings$$serializer = new MiSnapSettings$$serializer();
        INSTANCE = miSnapSettings$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.miteksystems.misnap.core.MiSnapSettings", miSnapSettings$$serializer, 7);
        pluginGeneratedSerialDescriptor.addElement("useCase", false);
        pluginGeneratedSerialDescriptor.addElement("license", false);
        pluginGeneratedSerialDescriptor.addElement("camera", true);
        pluginGeneratedSerialDescriptor.addElement("analysis", true);
        pluginGeneratedSerialDescriptor.addElement("workflow", true);
        pluginGeneratedSerialDescriptor.addElement("nfc", true);
        pluginGeneratedSerialDescriptor.addElement("voice", true);
        a = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public KSerializer[] childSerializers() {
        MiSnapSettings.UseCase[] values = MiSnapSettings.UseCase.values();
        values.getClass();
        return new KSerializer[]{new EnumSerializer("com.miteksystems.misnap.core.MiSnapSettings.UseCase", (Enum[]) values), StringSerializer.INSTANCE, MiSnapSettings$Camera$$serializer.INSTANCE, MiSnapSettings$Analysis$$serializer.INSTANCE, MiSnapSettings$Workflow$$serializer.INSTANCE, MiSnapSettings$Nfc$$serializer.INSTANCE, MiSnapSettings$Voice$$serializer.INSTANCE};
    }

    @Override // kotlinx.serialization.KSerializer
    public MiSnapSettings deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor descriptor = getDescriptor();
        CompositeDecoder beginStructure = decoder.beginStructure(descriptor);
        int i = 1;
        boolean z = true;
        int i2 = 0;
        Object obj = null;
        Object obj2 = null;
        String str = null;
        Object obj3 = null;
        Object obj4 = null;
        Object obj5 = null;
        Object obj6 = null;
        while (z) {
            int decodeElementIndex = beginStructure.decodeElementIndex(descriptor);
            switch (decodeElementIndex) {
                case -1:
                    z = false;
                    break;
                case 0:
                    MiSnapSettings.UseCase[] values = MiSnapSettings.UseCase.values();
                    values.getClass();
                    obj = beginStructure.decodeSerializableElement(descriptor, 0, new EnumSerializer("com.miteksystems.misnap.core.MiSnapSettings.UseCase", (Enum[]) values), obj);
                    i2 |= 1;
                    i = 1;
                    break;
                case 1:
                    str = beginStructure.decodeStringElement(descriptor, i);
                    i2 |= 2;
                    break;
                case 2:
                    obj2 = beginStructure.decodeSerializableElement(descriptor, 2, MiSnapSettings$Camera$$serializer.INSTANCE, obj2);
                    i2 |= 4;
                    break;
                case 3:
                    obj3 = beginStructure.decodeSerializableElement(descriptor, 3, MiSnapSettings$Analysis$$serializer.INSTANCE, obj3);
                    i2 |= 8;
                    break;
                case 4:
                    obj4 = beginStructure.decodeSerializableElement(descriptor, 4, MiSnapSettings$Workflow$$serializer.INSTANCE, obj4);
                    i2 |= 16;
                    break;
                case 5:
                    obj5 = beginStructure.decodeSerializableElement(descriptor, 5, MiSnapSettings$Nfc$$serializer.INSTANCE, obj5);
                    i2 |= 32;
                    break;
                case 6:
                    obj6 = beginStructure.decodeSerializableElement(descriptor, 6, MiSnapSettings$Voice$$serializer.INSTANCE, obj6);
                    i2 |= 64;
                    break;
                default:
                    LocalPresenterModule$Companion$$ExternalSyntheticLambda0.m(decodeElementIndex);
                    return null;
            }
        }
        beginStructure.endStructure(descriptor);
        return new MiSnapSettings(i2, (MiSnapSettings.UseCase) obj, str, (MiSnapSettings.Camera) obj2, (MiSnapSettings.Analysis) obj3, (MiSnapSettings.Workflow) obj4, (MiSnapSettings.Nfc) obj5, (MiSnapSettings.Voice) obj6);
    }

    @Override // kotlinx.serialization.KSerializer
    public SerialDescriptor getDescriptor() {
        return a;
    }

    @Override // kotlinx.serialization.KSerializer
    public void serialize(Encoder encoder, MiSnapSettings value) {
        encoder.getClass();
        value.getClass();
        SerialDescriptor descriptor = getDescriptor();
        CompositeEncoder beginStructure = encoder.beginStructure(descriptor);
        MiSnapSettings.UseCase[] values = MiSnapSettings.UseCase.values();
        values.getClass();
        EnumSerializer enumSerializer = new EnumSerializer("com.miteksystems.misnap.core.MiSnapSettings.UseCase", (Enum[]) values);
        MiSnapSettings.UseCase useCase = value.a;
        MiSnapSettings.Voice voice = value.voice;
        MiSnapSettings.Nfc nfc = value.nfc;
        MiSnapSettings.Workflow workflow = value.workflow;
        MiSnapSettings.Analysis analysis = value.analysis;
        MiSnapSettings.Camera camera = value.camera;
        beginStructure.encodeSerializableElement(descriptor, 0, enumSerializer, useCase);
        beginStructure.encodeStringElement(descriptor, 1, value.b);
        if (beginStructure.shouldEncodeElementDefault(descriptor) || !Intrinsics.areEqual(camera, new MiSnapSettings.Camera())) {
            beginStructure.encodeSerializableElement(descriptor, 2, MiSnapSettings$Camera$$serializer.INSTANCE, camera);
        }
        if (beginStructure.shouldEncodeElementDefault(descriptor) || !Intrinsics.areEqual(analysis, new MiSnapSettings.Analysis())) {
            beginStructure.encodeSerializableElement(descriptor, 3, MiSnapSettings$Analysis$$serializer.INSTANCE, analysis);
        }
        if (beginStructure.shouldEncodeElementDefault(descriptor) || !Intrinsics.areEqual(workflow, new MiSnapSettings.Workflow())) {
            beginStructure.encodeSerializableElement(descriptor, 4, MiSnapSettings$Workflow$$serializer.INSTANCE, workflow);
        }
        if (beginStructure.shouldEncodeElementDefault(descriptor) || !Intrinsics.areEqual(nfc, new MiSnapSettings.Nfc())) {
            beginStructure.encodeSerializableElement(descriptor, 5, MiSnapSettings$Nfc$$serializer.INSTANCE, nfc);
        }
        if (beginStructure.shouldEncodeElementDefault(descriptor) || !Intrinsics.areEqual(voice, new MiSnapSettings.Voice())) {
            beginStructure.encodeSerializableElement(descriptor, 6, MiSnapSettings$Voice$$serializer.INSTANCE, voice);
        }
        beginStructure.endStructure(descriptor);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public KSerializer[] typeParametersSerializers() {
        return TuplesKt.EMPTY_SERIALIZER_ARRAY;
    }
}
