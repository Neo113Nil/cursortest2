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
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.HashSetSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.StringSerializer;
import kotlinx.serialization.internal.TuplesKt;

@Deprecated
@Metadata(d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u001a\u0010\u0005\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ \u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0014\u001a\u00020\u00118VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, d2 = {"com/miteksystems/misnap/core/MibiData.FaceSessionInfo.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/miteksystems/misnap/core/MibiData$FaceSessionInfo;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/miteksystems/misnap/core/MibiData$FaceSessionInfo;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/miteksystems/misnap/core/MibiData$FaceSessionInfo;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class MibiData$FaceSessionInfo$$serializer implements GeneratedSerializer {
    public static final MibiData$FaceSessionInfo$$serializer INSTANCE;
    public static final /* synthetic */ PluginGeneratedSerialDescriptor a;

    static {
        MibiData$FaceSessionInfo$$serializer mibiData$FaceSessionInfo$$serializer = new MibiData$FaceSessionInfo$$serializer();
        INSTANCE = mibiData$FaceSessionInfo$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.miteksystems.misnap.core.MibiData.FaceSessionInfo", mibiData$FaceSessionInfo$$serializer, 9);
        pluginGeneratedSerialDescriptor.addElement("Mode", true);
        pluginGeneratedSerialDescriptor.addElement("Smile", true);
        pluginGeneratedSerialDescriptor.addElement("DeviceOrientation", true);
        pluginGeneratedSerialDescriptor.addElement("Warnings", true);
        pluginGeneratedSerialDescriptor.addElement("JpegQuality", true);
        pluginGeneratedSerialDescriptor.addElement("TotalDuration", false);
        pluginGeneratedSerialDescriptor.addElement("AutoTries", true);
        pluginGeneratedSerialDescriptor.addElement("ManualTries", true);
        pluginGeneratedSerialDescriptor.addElement("Type", true);
        a = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public KSerializer[] childSerializers() {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        KSerializer nullable = BuiltinSerializersKt.getNullable(stringSerializer);
        KSerializer nullable2 = BuiltinSerializersKt.getNullable(BooleanSerializer.INSTANCE);
        KSerializer nullable3 = BuiltinSerializersKt.getNullable(stringSerializer);
        KSerializer nullable4 = BuiltinSerializersKt.getNullable(new HashSetSerializer(stringSerializer, 1));
        IntSerializer intSerializer = IntSerializer.INSTANCE;
        return new KSerializer[]{nullable, nullable2, nullable3, nullable4, BuiltinSerializersKt.getNullable(intSerializer), LongSerializer.INSTANCE, BuiltinSerializersKt.getNullable(intSerializer), BuiltinSerializersKt.getNullable(intSerializer), stringSerializer};
    }

    @Override // kotlinx.serialization.KSerializer
    public MibiData.FaceSessionInfo deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor descriptor = getDescriptor();
        CompositeDecoder beginStructure = decoder.beginStructure(descriptor);
        MibiData.FaceSessionInfo faceSessionInfo = null;
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        Object obj4 = null;
        Object obj5 = null;
        Object obj6 = null;
        String str = null;
        long j = 0;
        int i = 0;
        boolean z = true;
        Object obj7 = null;
        while (z) {
            int decodeElementIndex = beginStructure.decodeElementIndex(descriptor);
            switch (decodeElementIndex) {
                case -1:
                    z = false;
                    break;
                case 0:
                    obj7 = beginStructure.decodeNullableSerializableElement(descriptor, 0, StringSerializer.INSTANCE, obj7);
                    i |= 1;
                    break;
                case 1:
                    obj = beginStructure.decodeNullableSerializableElement(descriptor, 1, BooleanSerializer.INSTANCE, obj);
                    i |= 2;
                    break;
                case 2:
                    obj2 = beginStructure.decodeNullableSerializableElement(descriptor, 2, StringSerializer.INSTANCE, obj2);
                    i |= 4;
                    break;
                case 3:
                    obj3 = beginStructure.decodeNullableSerializableElement(descriptor, 3, new HashSetSerializer(StringSerializer.INSTANCE, 1), obj3);
                    i |= 8;
                    break;
                case 4:
                    obj4 = beginStructure.decodeNullableSerializableElement(descriptor, 4, IntSerializer.INSTANCE, obj4);
                    i |= 16;
                    break;
                case 5:
                    j = beginStructure.decodeLongElement(descriptor, 5);
                    i |= 32;
                    break;
                case 6:
                    obj5 = beginStructure.decodeNullableSerializableElement(descriptor, 6, IntSerializer.INSTANCE, obj5);
                    i |= 64;
                    break;
                case 7:
                    obj6 = beginStructure.decodeNullableSerializableElement(descriptor, 7, IntSerializer.INSTANCE, obj6);
                    i |= 128;
                    break;
                case 8:
                    str = beginStructure.decodeStringElement(descriptor, 8);
                    i |= 256;
                    break;
                default:
                    LocalPresenterModule$Companion$$ExternalSyntheticLambda0.m(decodeElementIndex);
                    return faceSessionInfo;
            }
            faceSessionInfo = null;
        }
        beginStructure.endStructure(descriptor);
        return new MibiData.FaceSessionInfo(i, (String) obj7, (Boolean) obj, (String) obj2, (List) obj3, (Integer) obj4, j, (Integer) obj5, (Integer) obj6, str);
    }

    @Override // kotlinx.serialization.KSerializer
    public SerialDescriptor getDescriptor() {
        return a;
    }

    @Override // kotlinx.serialization.KSerializer
    public void serialize(Encoder encoder, MibiData.FaceSessionInfo value) {
        encoder.getClass();
        value.getClass();
        SerialDescriptor descriptor = getDescriptor();
        CompositeEncoder beginStructure = encoder.beginStructure(descriptor);
        Integer num = value.e;
        List list = value.d;
        String str = value.c;
        Boolean bool = value.b;
        String str2 = value.a;
        if (beginStructure.shouldEncodeElementDefault(descriptor) || str2 != null) {
            beginStructure.encodeNullableSerializableElement(descriptor, 0, StringSerializer.INSTANCE, str2);
        }
        if (beginStructure.shouldEncodeElementDefault(descriptor) || bool != null) {
            beginStructure.encodeNullableSerializableElement(descriptor, 1, BooleanSerializer.INSTANCE, bool);
        }
        if (beginStructure.shouldEncodeElementDefault(descriptor) || str != null) {
            beginStructure.encodeNullableSerializableElement(descriptor, 2, StringSerializer.INSTANCE, str);
        }
        if (beginStructure.shouldEncodeElementDefault(descriptor) || list != null) {
            beginStructure.encodeNullableSerializableElement(descriptor, 3, new HashSetSerializer(StringSerializer.INSTANCE, 1), list);
        }
        if (beginStructure.shouldEncodeElementDefault(descriptor) || num != null) {
            beginStructure.encodeNullableSerializableElement(descriptor, 4, IntSerializer.INSTANCE, num);
        }
        long j = value.f;
        String str3 = value.i;
        Integer num2 = value.h;
        Integer num3 = value.g;
        beginStructure.encodeLongElement(descriptor, 5, j);
        if (beginStructure.shouldEncodeElementDefault(descriptor) || num3 != null) {
            beginStructure.encodeNullableSerializableElement(descriptor, 6, IntSerializer.INSTANCE, num3);
        }
        if (beginStructure.shouldEncodeElementDefault(descriptor) || num2 != null) {
            beginStructure.encodeNullableSerializableElement(descriptor, 7, IntSerializer.INSTANCE, num2);
        }
        if (beginStructure.shouldEncodeElementDefault(descriptor) || !Intrinsics.areEqual(str3, "Face")) {
            beginStructure.encodeStringElement(descriptor, 8, str3);
        }
        beginStructure.endStructure(descriptor);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public KSerializer[] typeParametersSerializers() {
        return TuplesKt.EMPTY_SERIALIZER_ARRAY;
    }
}
