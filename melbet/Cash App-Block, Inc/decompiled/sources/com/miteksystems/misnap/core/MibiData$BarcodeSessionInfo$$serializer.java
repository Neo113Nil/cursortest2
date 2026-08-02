package com.miteksystems.misnap.core;

import app.cash.local.presenters.LocalPresenterModule$Companion$$ExternalSyntheticLambda0;
import com.miteksystems.misnap.core.MibiData;
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
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.StringSerializer;
import kotlinx.serialization.internal.TuplesKt;

@Deprecated
@Metadata(d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u001a\u0010\u0005\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ \u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0014\u001a\u00020\u00118VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, d2 = {"com/miteksystems/misnap/core/MibiData.BarcodeSessionInfo.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/miteksystems/misnap/core/MibiData$BarcodeSessionInfo;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/miteksystems/misnap/core/MibiData$BarcodeSessionInfo;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/miteksystems/misnap/core/MibiData$BarcodeSessionInfo;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class MibiData$BarcodeSessionInfo$$serializer implements GeneratedSerializer {
    public static final MibiData$BarcodeSessionInfo$$serializer INSTANCE;
    public static final /* synthetic */ PluginGeneratedSerialDescriptor a;

    static {
        MibiData$BarcodeSessionInfo$$serializer mibiData$BarcodeSessionInfo$$serializer = new MibiData$BarcodeSessionInfo$$serializer();
        INSTANCE = mibiData$BarcodeSessionInfo$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.miteksystems.misnap.core.MibiData.BarcodeSessionInfo", mibiData$BarcodeSessionInfo$$serializer, 8);
        pluginGeneratedSerialDescriptor.addElement("BarcodeType", true);
        pluginGeneratedSerialDescriptor.addElement("DeviceOrientation", true);
        pluginGeneratedSerialDescriptor.addElement("DocumentOrientation", true);
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
        KSerializer nullable2 = BuiltinSerializersKt.getNullable(stringSerializer);
        KSerializer nullable3 = BuiltinSerializersKt.getNullable(stringSerializer);
        IntSerializer intSerializer = IntSerializer.INSTANCE;
        return new KSerializer[]{nullable, nullable2, nullable3, BuiltinSerializersKt.getNullable(intSerializer), LongSerializer.INSTANCE, BuiltinSerializersKt.getNullable(intSerializer), BuiltinSerializersKt.getNullable(intSerializer), stringSerializer};
    }

    @Override // kotlinx.serialization.KSerializer
    public MibiData.BarcodeSessionInfo deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor descriptor = getDescriptor();
        CompositeDecoder beginStructure = decoder.beginStructure(descriptor);
        MibiData.BarcodeSessionInfo barcodeSessionInfo = null;
        int i = 0;
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        Object obj4 = null;
        Object obj5 = null;
        String str = null;
        long j = 0;
        boolean z = true;
        Object obj6 = null;
        while (z) {
            int decodeElementIndex = beginStructure.decodeElementIndex(descriptor);
            switch (decodeElementIndex) {
                case -1:
                    z = false;
                    continue;
                case 0:
                    obj6 = beginStructure.decodeNullableSerializableElement(descriptor, 0, StringSerializer.INSTANCE, obj6);
                    i |= 1;
                    break;
                case 1:
                    obj = beginStructure.decodeNullableSerializableElement(descriptor, 1, StringSerializer.INSTANCE, obj);
                    i |= 2;
                    break;
                case 2:
                    obj2 = beginStructure.decodeNullableSerializableElement(descriptor, 2, StringSerializer.INSTANCE, obj2);
                    i |= 4;
                    break;
                case 3:
                    obj3 = beginStructure.decodeNullableSerializableElement(descriptor, 3, IntSerializer.INSTANCE, obj3);
                    i |= 8;
                    break;
                case 4:
                    j = beginStructure.decodeLongElement(descriptor, 4);
                    i |= 16;
                    break;
                case 5:
                    obj4 = beginStructure.decodeNullableSerializableElement(descriptor, 5, IntSerializer.INSTANCE, obj4);
                    i |= 32;
                    break;
                case 6:
                    obj5 = beginStructure.decodeNullableSerializableElement(descriptor, 6, IntSerializer.INSTANCE, obj5);
                    i |= 64;
                    break;
                case 7:
                    str = beginStructure.decodeStringElement(descriptor, 7);
                    i |= 128;
                    continue;
                default:
                    LocalPresenterModule$Companion$$ExternalSyntheticLambda0.m(decodeElementIndex);
                    return barcodeSessionInfo;
            }
            barcodeSessionInfo = null;
        }
        beginStructure.endStructure(descriptor);
        return new MibiData.BarcodeSessionInfo(i, (String) obj6, (String) obj, (String) obj2, (Integer) obj3, j, (Integer) obj4, (Integer) obj5, str);
    }

    @Override // kotlinx.serialization.KSerializer
    public SerialDescriptor getDescriptor() {
        return a;
    }

    @Override // kotlinx.serialization.KSerializer
    public void serialize(Encoder encoder, MibiData.BarcodeSessionInfo value) {
        encoder.getClass();
        value.getClass();
        SerialDescriptor descriptor = getDescriptor();
        CompositeEncoder beginStructure = encoder.beginStructure(descriptor);
        Integer num = value.d;
        String str = value.c;
        String str2 = value.b;
        String str3 = value.a;
        if (beginStructure.shouldEncodeElementDefault(descriptor) || str3 != null) {
            beginStructure.encodeNullableSerializableElement(descriptor, 0, StringSerializer.INSTANCE, str3);
        }
        if (beginStructure.shouldEncodeElementDefault(descriptor) || str2 != null) {
            beginStructure.encodeNullableSerializableElement(descriptor, 1, StringSerializer.INSTANCE, str2);
        }
        if (beginStructure.shouldEncodeElementDefault(descriptor) || str != null) {
            beginStructure.encodeNullableSerializableElement(descriptor, 2, StringSerializer.INSTANCE, str);
        }
        if (beginStructure.shouldEncodeElementDefault(descriptor) || num != null) {
            beginStructure.encodeNullableSerializableElement(descriptor, 3, IntSerializer.INSTANCE, num);
        }
        long j = value.e;
        String str4 = value.h;
        Integer num2 = value.g;
        Integer num3 = value.f;
        beginStructure.encodeLongElement(descriptor, 4, j);
        if (beginStructure.shouldEncodeElementDefault(descriptor) || num3 != null) {
            beginStructure.encodeNullableSerializableElement(descriptor, 5, IntSerializer.INSTANCE, num3);
        }
        if (beginStructure.shouldEncodeElementDefault(descriptor) || num2 != null) {
            beginStructure.encodeNullableSerializableElement(descriptor, 6, IntSerializer.INSTANCE, num2);
        }
        if (beginStructure.shouldEncodeElementDefault(descriptor) || !Intrinsics.areEqual(str4, "Barcode")) {
            beginStructure.encodeStringElement(descriptor, 7, str4);
        }
        beginStructure.endStructure(descriptor);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public KSerializer[] typeParametersSerializers() {
        return TuplesKt.EMPTY_SERIALIZER_ARRAY;
    }
}
