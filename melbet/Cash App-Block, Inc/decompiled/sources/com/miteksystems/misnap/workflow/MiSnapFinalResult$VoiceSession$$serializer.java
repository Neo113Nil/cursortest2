package com.miteksystems.misnap.workflow;

import app.cash.local.presenters.LocalPresenterModule$Companion$$ExternalSyntheticLambda0;
import com.miteksystems.misnap.core.MiSnapMibiData$$serializer;
import com.miteksystems.misnap.workflow.MiSnapFinalResult;
import java.util.List;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.ByteArraySerializer;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.HashSetSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.StringSerializer;
import kotlinx.serialization.internal.TuplesKt;

@Deprecated
@Metadata(d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u001a\u0010\u0005\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ \u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0014\u001a\u00020\u00118VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, d2 = {"com/miteksystems/misnap/workflow/MiSnapFinalResult.VoiceSession.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/miteksystems/misnap/workflow/MiSnapFinalResult$VoiceSession;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/miteksystems/misnap/workflow/MiSnapFinalResult$VoiceSession;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/miteksystems/misnap/workflow/MiSnapFinalResult$VoiceSession;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "workflow_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class MiSnapFinalResult$VoiceSession$$serializer implements GeneratedSerializer {
    public static final MiSnapFinalResult$VoiceSession$$serializer INSTANCE;
    public static final /* synthetic */ PluginGeneratedSerialDescriptor a;

    static {
        MiSnapFinalResult$VoiceSession$$serializer miSnapFinalResult$VoiceSession$$serializer = new MiSnapFinalResult$VoiceSession$$serializer();
        INSTANCE = miSnapFinalResult$VoiceSession$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.miteksystems.misnap.workflow.MiSnapFinalResult.VoiceSession", miSnapFinalResult$VoiceSession$$serializer, 5);
        pluginGeneratedSerialDescriptor.addElement("voiceSamples", false);
        pluginGeneratedSerialDescriptor.addElement("phrase", false);
        pluginGeneratedSerialDescriptor.addElement("misnapMibiData", false);
        pluginGeneratedSerialDescriptor.addElement("licenseExpired", false);
        pluginGeneratedSerialDescriptor.addElement("rts", true);
        a = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public KSerializer[] childSerializers() {
        HashSetSerializer hashSetSerializer = new HashSetSerializer(ByteArraySerializer.INSTANCE, 1);
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new KSerializer[]{hashSetSerializer, stringSerializer, new HashSetSerializer(MiSnapMibiData$$serializer.INSTANCE, 1), BooleanSerializer.INSTANCE, new HashSetSerializer(BuiltinSerializersKt.getNullable(stringSerializer), 1)};
    }

    @Override // kotlinx.serialization.KSerializer
    public MiSnapFinalResult.VoiceSession deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor descriptor = getDescriptor();
        CompositeDecoder beginStructure = decoder.beginStructure(descriptor);
        boolean z = true;
        int i = 0;
        boolean z2 = false;
        Object obj = null;
        Object obj2 = null;
        String str = null;
        Object obj3 = null;
        while (z) {
            int decodeElementIndex = beginStructure.decodeElementIndex(descriptor);
            if (decodeElementIndex == -1) {
                z = false;
            } else if (decodeElementIndex == 0) {
                obj = beginStructure.decodeSerializableElement(descriptor, 0, new HashSetSerializer(ByteArraySerializer.INSTANCE, 1), obj);
                i |= 1;
            } else if (decodeElementIndex == 1) {
                str = beginStructure.decodeStringElement(descriptor, 1);
                i |= 2;
            } else if (decodeElementIndex == 2) {
                obj2 = beginStructure.decodeSerializableElement(descriptor, 2, new HashSetSerializer(MiSnapMibiData$$serializer.INSTANCE, 1), obj2);
                i |= 4;
            } else if (decodeElementIndex == 3) {
                z2 = beginStructure.decodeBooleanElement(descriptor, 3);
                i |= 8;
            } else {
                if (decodeElementIndex != 4) {
                    LocalPresenterModule$Companion$$ExternalSyntheticLambda0.m(decodeElementIndex);
                    return null;
                }
                obj3 = beginStructure.decodeSerializableElement(descriptor, 4, new HashSetSerializer(BuiltinSerializersKt.getNullable(StringSerializer.INSTANCE), 1), obj3);
                i |= 16;
            }
        }
        beginStructure.endStructure(descriptor);
        return new MiSnapFinalResult.VoiceSession(i, (List) obj, str, (List) obj2, z2, (List) obj3);
    }

    @Override // kotlinx.serialization.KSerializer
    public SerialDescriptor getDescriptor() {
        return a;
    }

    @Override // kotlinx.serialization.KSerializer
    public void serialize(Encoder encoder, MiSnapFinalResult.VoiceSession value) {
        encoder.getClass();
        value.getClass();
        SerialDescriptor descriptor = getDescriptor();
        CompositeEncoder beginStructure = encoder.beginStructure(descriptor);
        MiSnapFinalResult.Companion companion = MiSnapFinalResult.Companion;
        List list = value.f;
        beginStructure.encodeSerializableElement(descriptor, 0, new HashSetSerializer(ByteArraySerializer.INSTANCE, 1), value.b);
        beginStructure.encodeStringElement(descriptor, 1, value.c);
        beginStructure.encodeSerializableElement(descriptor, 2, new HashSetSerializer(MiSnapMibiData$$serializer.INSTANCE, 1), value.d);
        beginStructure.encodeBooleanElement(descriptor, 3, value.e);
        if (beginStructure.shouldEncodeElementDefault(descriptor) || !Intrinsics.areEqual(list, EmptyList.INSTANCE)) {
            beginStructure.encodeSerializableElement(descriptor, 4, new HashSetSerializer(BuiltinSerializersKt.getNullable(StringSerializer.INSTANCE), 1), list);
        }
        beginStructure.endStructure(descriptor);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public KSerializer[] typeParametersSerializers() {
        return TuplesKt.EMPTY_SERIALIZER_ARRAY;
    }
}
