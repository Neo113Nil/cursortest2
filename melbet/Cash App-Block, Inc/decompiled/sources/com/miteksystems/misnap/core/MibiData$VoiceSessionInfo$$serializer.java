package com.miteksystems.misnap.core;

import app.cash.local.presenters.LocalPresenterModule$Companion$$ExternalSyntheticLambda0;
import com.miteksystems.misnap.core.MibiData;
import java.util.List;
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
import kotlinx.serialization.internal.EnumSerializer;
import kotlinx.serialization.internal.FloatSerializer;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.HashSetSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.StringSerializer;
import kotlinx.serialization.internal.TuplesKt;

@Deprecated
@Metadata(d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u001a\u0010\u0005\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ \u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0014\u001a\u00020\u00118VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, d2 = {"com/miteksystems/misnap/core/MibiData.VoiceSessionInfo.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/miteksystems/misnap/core/MibiData$VoiceSessionInfo;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/miteksystems/misnap/core/MibiData$VoiceSessionInfo;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/miteksystems/misnap/core/MibiData$VoiceSessionInfo;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class MibiData$VoiceSessionInfo$$serializer implements GeneratedSerializer {
    public static final MibiData$VoiceSessionInfo$$serializer INSTANCE;
    public static final /* synthetic */ PluginGeneratedSerialDescriptor a;

    static {
        MibiData$VoiceSessionInfo$$serializer mibiData$VoiceSessionInfo$$serializer = new MibiData$VoiceSessionInfo$$serializer();
        INSTANCE = mibiData$VoiceSessionInfo$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.miteksystems.misnap.core.MibiData.VoiceSessionInfo", mibiData$VoiceSessionInfo$$serializer, 7);
        pluginGeneratedSerialDescriptor.addElement("Flow", true);
        pluginGeneratedSerialDescriptor.addElement("SNR", true);
        pluginGeneratedSerialDescriptor.addElement("SpeechDuration", true);
        pluginGeneratedSerialDescriptor.addElement("Warnings", true);
        pluginGeneratedSerialDescriptor.addElement("TotalDuration", false);
        pluginGeneratedSerialDescriptor.addElement("Tries", true);
        pluginGeneratedSerialDescriptor.addElement("Type", true);
        a = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public KSerializer[] childSerializers() {
        MibiData.VoiceSessionInfo.Flow[] values = MibiData.VoiceSessionInfo.Flow.values();
        values.getClass();
        KSerializer nullable = BuiltinSerializersKt.getNullable(new EnumSerializer("com.miteksystems.misnap.core.MibiData.VoiceSessionInfo.Flow", (Enum[]) values));
        KSerializer nullable2 = BuiltinSerializersKt.getNullable(FloatSerializer.INSTANCE);
        IntSerializer intSerializer = IntSerializer.INSTANCE;
        KSerializer nullable3 = BuiltinSerializersKt.getNullable(intSerializer);
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new KSerializer[]{nullable, nullable2, nullable3, BuiltinSerializersKt.getNullable(new HashSetSerializer(new HashSetSerializer(stringSerializer, 1), 1)), LongSerializer.INSTANCE, BuiltinSerializersKt.getNullable(intSerializer), stringSerializer};
    }

    @Override // kotlinx.serialization.KSerializer
    public MibiData.VoiceSessionInfo deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor descriptor = getDescriptor();
        CompositeDecoder beginStructure = decoder.beginStructure(descriptor);
        MibiData.VoiceSessionInfo voiceSessionInfo = null;
        int i = 0;
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        Object obj4 = null;
        String str = null;
        long j = 0;
        boolean z = true;
        Object obj5 = null;
        while (z) {
            int decodeElementIndex = beginStructure.decodeElementIndex(descriptor);
            switch (decodeElementIndex) {
                case -1:
                    z = false;
                    continue;
                case 0:
                    MibiData.VoiceSessionInfo.Flow[] values = MibiData.VoiceSessionInfo.Flow.values();
                    values.getClass();
                    obj5 = beginStructure.decodeNullableSerializableElement(descriptor, 0, new EnumSerializer("com.miteksystems.misnap.core.MibiData.VoiceSessionInfo.Flow", (Enum[]) values), obj5);
                    i |= 1;
                    break;
                case 1:
                    obj = beginStructure.decodeNullableSerializableElement(descriptor, 1, FloatSerializer.INSTANCE, obj);
                    i |= 2;
                    break;
                case 2:
                    obj2 = beginStructure.decodeNullableSerializableElement(descriptor, 2, IntSerializer.INSTANCE, obj2);
                    i |= 4;
                    break;
                case 3:
                    obj3 = beginStructure.decodeNullableSerializableElement(descriptor, 3, new HashSetSerializer(new HashSetSerializer(StringSerializer.INSTANCE, 1), 1), obj3);
                    i |= 8;
                    break;
                case 4:
                    j = beginStructure.decodeLongElement(descriptor, 4);
                    i |= 16;
                    continue;
                case 5:
                    obj4 = beginStructure.decodeNullableSerializableElement(descriptor, 5, IntSerializer.INSTANCE, obj4);
                    i |= 32;
                    continue;
                case 6:
                    str = beginStructure.decodeStringElement(descriptor, 6);
                    i |= 64;
                    continue;
                default:
                    LocalPresenterModule$Companion$$ExternalSyntheticLambda0.m(decodeElementIndex);
                    return voiceSessionInfo;
            }
            voiceSessionInfo = null;
        }
        beginStructure.endStructure(descriptor);
        return new MibiData.VoiceSessionInfo(i, (MibiData.VoiceSessionInfo.Flow) obj5, (Float) obj, (Integer) obj2, (List) obj3, j, (Integer) obj4, str);
    }

    @Override // kotlinx.serialization.KSerializer
    public SerialDescriptor getDescriptor() {
        return a;
    }

    @Override // kotlinx.serialization.KSerializer
    public void serialize(Encoder encoder, MibiData.VoiceSessionInfo value) {
        encoder.getClass();
        value.getClass();
        SerialDescriptor descriptor = getDescriptor();
        CompositeEncoder beginStructure = encoder.beginStructure(descriptor);
        List list = value.d;
        Integer num = value.c;
        Float f = value.b;
        MibiData.VoiceSessionInfo.Flow flow = value.a;
        if (beginStructure.shouldEncodeElementDefault(descriptor) || flow != null) {
            MibiData.VoiceSessionInfo.Flow[] values = MibiData.VoiceSessionInfo.Flow.values();
            values.getClass();
            beginStructure.encodeNullableSerializableElement(descriptor, 0, new EnumSerializer("com.miteksystems.misnap.core.MibiData.VoiceSessionInfo.Flow", (Enum[]) values), flow);
        }
        if (beginStructure.shouldEncodeElementDefault(descriptor) || f != null) {
            beginStructure.encodeNullableSerializableElement(descriptor, 1, FloatSerializer.INSTANCE, f);
        }
        if (beginStructure.shouldEncodeElementDefault(descriptor) || num != null) {
            beginStructure.encodeNullableSerializableElement(descriptor, 2, IntSerializer.INSTANCE, num);
        }
        if (beginStructure.shouldEncodeElementDefault(descriptor) || list != null) {
            beginStructure.encodeNullableSerializableElement(descriptor, 3, new HashSetSerializer(new HashSetSerializer(StringSerializer.INSTANCE, 1), 1), list);
        }
        long j = value.e;
        String str = value.g;
        Integer num2 = value.f;
        beginStructure.encodeLongElement(descriptor, 4, j);
        if (beginStructure.shouldEncodeElementDefault(descriptor) || num2 != null) {
            beginStructure.encodeNullableSerializableElement(descriptor, 5, IntSerializer.INSTANCE, num2);
        }
        if (beginStructure.shouldEncodeElementDefault(descriptor) || !Intrinsics.areEqual(str, "Voice")) {
            beginStructure.encodeStringElement(descriptor, 6, str);
        }
        beginStructure.endStructure(descriptor);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public KSerializer[] typeParametersSerializers() {
        return TuplesKt.EMPTY_SERIALIZER_ARRAY;
    }
}
