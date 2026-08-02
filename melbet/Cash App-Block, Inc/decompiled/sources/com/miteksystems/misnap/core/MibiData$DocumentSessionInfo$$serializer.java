package com.miteksystems.misnap.core;

import app.cash.local.presenters.LocalPresenterModule$Companion$$ExternalSyntheticLambda0;
import com.miteksystems.misnap.core.MibiData;
import java.util.List;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
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
import kotlinx.serialization.internal.IntArraySerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.ReferenceArraySerializer;
import kotlinx.serialization.internal.StringSerializer;
import kotlinx.serialization.internal.TuplesKt;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

@Deprecated
@Metadata(d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u001a\u0010\u0005\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ \u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0014\u001a\u00020\u00118VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, d2 = {"com/miteksystems/misnap/core/MibiData.DocumentSessionInfo.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/miteksystems/misnap/core/MibiData$DocumentSessionInfo;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/miteksystems/misnap/core/MibiData$DocumentSessionInfo;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/miteksystems/misnap/core/MibiData$DocumentSessionInfo;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class MibiData$DocumentSessionInfo$$serializer implements GeneratedSerializer {
    public static final MibiData$DocumentSessionInfo$$serializer INSTANCE;
    public static final /* synthetic */ PluginGeneratedSerialDescriptor a;

    static {
        MibiData$DocumentSessionInfo$$serializer mibiData$DocumentSessionInfo$$serializer = new MibiData$DocumentSessionInfo$$serializer();
        INSTANCE = mibiData$DocumentSessionInfo$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.miteksystems.misnap.core.MibiData.DocumentSessionInfo", mibiData$DocumentSessionInfo$$serializer, 16);
        pluginGeneratedSerialDescriptor.addElement("DocType", true);
        pluginGeneratedSerialDescriptor.addElement("ClassificationType", true);
        pluginGeneratedSerialDescriptor.addElement("MrzExtracted", true);
        pluginGeneratedSerialDescriptor.addElement("OptionalDataRedacted", true);
        pluginGeneratedSerialDescriptor.addElement("EnhancedManual", true);
        pluginGeneratedSerialDescriptor.addElement("Mode", true);
        pluginGeneratedSerialDescriptor.addElement("FourCorners", true);
        pluginGeneratedSerialDescriptor.addElement("DeviceOrientation", true);
        pluginGeneratedSerialDescriptor.addElement("DocumentOrientation", true);
        pluginGeneratedSerialDescriptor.addElement("Warnings", true);
        pluginGeneratedSerialDescriptor.addElement("JpegQuality", true);
        pluginGeneratedSerialDescriptor.addElement("TotalDuration", false);
        pluginGeneratedSerialDescriptor.addElement("AutoTries", true);
        pluginGeneratedSerialDescriptor.addElement("ManualTries", true);
        pluginGeneratedSerialDescriptor.addElement("IqaRequired", true);
        pluginGeneratedSerialDescriptor.addElement("Type", true);
        a = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public KSerializer[] childSerializers() {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        KSerializer nullable = BuiltinSerializersKt.getNullable(stringSerializer);
        KSerializer nullable2 = BuiltinSerializersKt.getNullable(stringSerializer);
        BooleanSerializer booleanSerializer = BooleanSerializer.INSTANCE;
        KSerializer nullable3 = BuiltinSerializersKt.getNullable(booleanSerializer);
        KSerializer nullable4 = BuiltinSerializersKt.getNullable(booleanSerializer);
        KSerializer nullable5 = BuiltinSerializersKt.getNullable(booleanSerializer);
        KSerializer nullable6 = BuiltinSerializersKt.getNullable(stringSerializer);
        KSerializer nullable7 = BuiltinSerializersKt.getNullable(new ReferenceArraySerializer(Reflection.factory.getOrCreateKotlinClass(int[].class), IntArraySerializer.INSTANCE));
        KSerializer nullable8 = BuiltinSerializersKt.getNullable(stringSerializer);
        KSerializer nullable9 = BuiltinSerializersKt.getNullable(stringSerializer);
        KSerializer nullable10 = BuiltinSerializersKt.getNullable(new HashSetSerializer(stringSerializer, 1));
        IntSerializer intSerializer = IntSerializer.INSTANCE;
        return new KSerializer[]{nullable, nullable2, nullable3, nullable4, nullable5, nullable6, nullable7, nullable8, nullable9, nullable10, BuiltinSerializersKt.getNullable(intSerializer), LongSerializer.INSTANCE, BuiltinSerializersKt.getNullable(intSerializer), BuiltinSerializersKt.getNullable(intSerializer), BuiltinSerializersKt.getNullable(booleanSerializer), stringSerializer};
    }

    @Override // kotlinx.serialization.KSerializer
    public MibiData.DocumentSessionInfo deserialize(Decoder decoder) {
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        Object obj6;
        Object obj7;
        decoder.getClass();
        SerialDescriptor descriptor = getDescriptor();
        CompositeDecoder beginStructure = decoder.beginStructure(descriptor);
        long j = 0;
        Object obj8 = null;
        Object obj9 = null;
        Object obj10 = null;
        Object obj11 = null;
        Object obj12 = null;
        Object obj13 = null;
        int i = 0;
        Object obj14 = null;
        Object obj15 = null;
        Object obj16 = null;
        Object obj17 = null;
        Object obj18 = null;
        Object obj19 = null;
        Object obj20 = null;
        boolean z = true;
        Object obj21 = null;
        String str = null;
        while (z) {
            int decodeElementIndex = beginStructure.decodeElementIndex(descriptor);
            switch (decodeElementIndex) {
                case -1:
                    z = false;
                    obj10 = obj10;
                    obj21 = obj21;
                    obj9 = obj9;
                case 0:
                    obj2 = obj8;
                    i |= 1;
                    obj9 = obj9;
                    obj10 = obj10;
                    obj21 = beginStructure.decodeNullableSerializableElement(descriptor, 0, StringSerializer.INSTANCE, obj21);
                    obj8 = obj2;
                case 1:
                    obj2 = obj8;
                    obj13 = beginStructure.decodeNullableSerializableElement(descriptor, 1, StringSerializer.INSTANCE, obj13);
                    i |= 2;
                    obj9 = obj9;
                    obj8 = obj2;
                case 2:
                    obj2 = obj8;
                    obj3 = obj13;
                    obj14 = beginStructure.decodeNullableSerializableElement(descriptor, 2, BooleanSerializer.INSTANCE, obj14);
                    i |= 4;
                    obj13 = obj3;
                    obj8 = obj2;
                case 3:
                    obj2 = obj8;
                    obj3 = obj13;
                    obj15 = beginStructure.decodeNullableSerializableElement(descriptor, 3, BooleanSerializer.INSTANCE, obj15);
                    i |= 8;
                    obj13 = obj3;
                    obj8 = obj2;
                case 4:
                    obj2 = obj8;
                    obj3 = obj13;
                    obj16 = beginStructure.decodeNullableSerializableElement(descriptor, 4, BooleanSerializer.INSTANCE, obj16);
                    i |= 16;
                    obj13 = obj3;
                    obj8 = obj2;
                case 5:
                    obj2 = obj8;
                    obj3 = obj13;
                    obj17 = beginStructure.decodeNullableSerializableElement(descriptor, 5, StringSerializer.INSTANCE, obj17);
                    i |= 32;
                    obj13 = obj3;
                    obj8 = obj2;
                case 6:
                    obj2 = obj8;
                    obj4 = obj13;
                    obj5 = obj14;
                    obj18 = beginStructure.decodeNullableSerializableElement(descriptor, 6, new ReferenceArraySerializer(Reflection.factory.getOrCreateKotlinClass(int[].class), IntArraySerializer.INSTANCE), obj18);
                    i |= 64;
                    obj13 = obj4;
                    obj14 = obj5;
                    obj8 = obj2;
                case 7:
                    obj2 = obj8;
                    obj3 = obj13;
                    obj19 = beginStructure.decodeNullableSerializableElement(descriptor, 7, StringSerializer.INSTANCE, obj19);
                    i |= 128;
                    obj13 = obj3;
                    obj8 = obj2;
                case 8:
                    obj2 = obj8;
                    obj3 = obj13;
                    obj20 = beginStructure.decodeNullableSerializableElement(descriptor, 8, StringSerializer.INSTANCE, obj20);
                    i |= 256;
                    obj13 = obj3;
                    obj8 = obj2;
                case 9:
                    obj4 = obj13;
                    obj5 = obj14;
                    obj2 = obj8;
                    obj10 = beginStructure.decodeNullableSerializableElement(descriptor, 9, new HashSetSerializer(StringSerializer.INSTANCE, 1), obj10);
                    i |= 512;
                    obj13 = obj4;
                    obj14 = obj5;
                    obj8 = obj2;
                case 10:
                    obj6 = obj13;
                    obj7 = obj14;
                    obj9 = beginStructure.decodeNullableSerializableElement(descriptor, 10, IntSerializer.INSTANCE, obj9);
                    i |= 1024;
                    obj13 = obj6;
                    obj14 = obj7;
                case 11:
                    obj = obj13;
                    j = beginStructure.decodeLongElement(descriptor, 11);
                    i |= 2048;
                    obj13 = obj;
                case 12:
                    obj6 = obj13;
                    obj7 = obj14;
                    obj8 = beginStructure.decodeNullableSerializableElement(descriptor, 12, IntSerializer.INSTANCE, obj8);
                    i |= 4096;
                    obj13 = obj6;
                    obj14 = obj7;
                case 13:
                    obj6 = obj13;
                    obj7 = obj14;
                    obj11 = beginStructure.decodeNullableSerializableElement(descriptor, 13, IntSerializer.INSTANCE, obj11);
                    i |= PKIFailureInfo.certRevoked;
                    obj13 = obj6;
                    obj14 = obj7;
                case 14:
                    obj6 = obj13;
                    obj7 = obj14;
                    obj12 = beginStructure.decodeNullableSerializableElement(descriptor, 14, BooleanSerializer.INSTANCE, obj12);
                    i |= 16384;
                    obj13 = obj6;
                    obj14 = obj7;
                case 15:
                    obj = obj13;
                    str = beginStructure.decodeStringElement(descriptor, 15);
                    i |= 32768;
                    obj13 = obj;
                default:
                    LocalPresenterModule$Companion$$ExternalSyntheticLambda0.m(decodeElementIndex);
                    return null;
            }
        }
        Object obj22 = obj9;
        Object obj23 = obj21;
        beginStructure.endStructure(descriptor);
        return new MibiData.DocumentSessionInfo(i, (String) obj23, (String) obj13, (Boolean) obj14, (Boolean) obj15, (Boolean) obj16, (String) obj17, (int[][]) obj18, (String) obj19, (String) obj20, (List) obj10, (Integer) obj22, j, (Integer) obj8, (Integer) obj11, (Boolean) obj12, str);
    }

    @Override // kotlinx.serialization.KSerializer
    public SerialDescriptor getDescriptor() {
        return a;
    }

    @Override // kotlinx.serialization.KSerializer
    public void serialize(Encoder encoder, MibiData.DocumentSessionInfo value) {
        encoder.getClass();
        value.getClass();
        SerialDescriptor descriptor = getDescriptor();
        CompositeEncoder beginStructure = encoder.beginStructure(descriptor);
        Integer num = value.k;
        List list = value.j;
        String str = value.i;
        String str2 = value.h;
        int[][] iArr = value.g;
        String str3 = value.f;
        Boolean bool = value.e;
        Boolean bool2 = value.d;
        Boolean bool3 = value.c;
        String str4 = value.b;
        String str5 = value.a;
        if (beginStructure.shouldEncodeElementDefault(descriptor) || str5 != null) {
            beginStructure.encodeNullableSerializableElement(descriptor, 0, StringSerializer.INSTANCE, str5);
        }
        if (beginStructure.shouldEncodeElementDefault(descriptor) || str4 != null) {
            beginStructure.encodeNullableSerializableElement(descriptor, 1, StringSerializer.INSTANCE, str4);
        }
        if (beginStructure.shouldEncodeElementDefault(descriptor) || bool3 != null) {
            beginStructure.encodeNullableSerializableElement(descriptor, 2, BooleanSerializer.INSTANCE, bool3);
        }
        if (beginStructure.shouldEncodeElementDefault(descriptor) || bool2 != null) {
            beginStructure.encodeNullableSerializableElement(descriptor, 3, BooleanSerializer.INSTANCE, bool2);
        }
        if (beginStructure.shouldEncodeElementDefault(descriptor) || bool != null) {
            beginStructure.encodeNullableSerializableElement(descriptor, 4, BooleanSerializer.INSTANCE, bool);
        }
        if (beginStructure.shouldEncodeElementDefault(descriptor) || str3 != null) {
            beginStructure.encodeNullableSerializableElement(descriptor, 5, StringSerializer.INSTANCE, str3);
        }
        if (beginStructure.shouldEncodeElementDefault(descriptor) || iArr != null) {
            beginStructure.encodeNullableSerializableElement(descriptor, 6, new ReferenceArraySerializer(Reflection.factory.getOrCreateKotlinClass(int[].class), IntArraySerializer.INSTANCE), iArr);
        }
        if (beginStructure.shouldEncodeElementDefault(descriptor) || str2 != null) {
            beginStructure.encodeNullableSerializableElement(descriptor, 7, StringSerializer.INSTANCE, str2);
        }
        if (beginStructure.shouldEncodeElementDefault(descriptor) || str != null) {
            beginStructure.encodeNullableSerializableElement(descriptor, 8, StringSerializer.INSTANCE, str);
        }
        if (beginStructure.shouldEncodeElementDefault(descriptor) || list != null) {
            beginStructure.encodeNullableSerializableElement(descriptor, 9, new HashSetSerializer(StringSerializer.INSTANCE, 1), list);
        }
        if (beginStructure.shouldEncodeElementDefault(descriptor) || num != null) {
            beginStructure.encodeNullableSerializableElement(descriptor, 10, IntSerializer.INSTANCE, num);
        }
        long j = value.l;
        String str6 = value.p;
        Boolean bool4 = value.o;
        Integer num2 = value.n;
        Integer num3 = value.m;
        beginStructure.encodeLongElement(descriptor, 11, j);
        if (beginStructure.shouldEncodeElementDefault(descriptor) || num3 != null) {
            beginStructure.encodeNullableSerializableElement(descriptor, 12, IntSerializer.INSTANCE, num3);
        }
        if (beginStructure.shouldEncodeElementDefault(descriptor) || num2 != null) {
            beginStructure.encodeNullableSerializableElement(descriptor, 13, IntSerializer.INSTANCE, num2);
        }
        if (beginStructure.shouldEncodeElementDefault(descriptor) || bool4 != null) {
            beginStructure.encodeNullableSerializableElement(descriptor, 14, BooleanSerializer.INSTANCE, bool4);
        }
        if (beginStructure.shouldEncodeElementDefault(descriptor) || !Intrinsics.areEqual(str6, "Document")) {
            beginStructure.encodeStringElement(descriptor, 15, str6);
        }
        beginStructure.endStructure(descriptor);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public KSerializer[] typeParametersSerializers() {
        return TuplesKt.EMPTY_SERIALIZER_ARRAY;
    }
}
