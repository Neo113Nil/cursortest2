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
@Metadata(d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u001a\u0010\u0005\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ \u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0014\u001a\u00020\u00118VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, d2 = {"com/miteksystems/misnap/core/MibiData.NfcSessionInfo.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/miteksystems/misnap/core/MibiData$NfcSessionInfo;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/miteksystems/misnap/core/MibiData$NfcSessionInfo;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/miteksystems/misnap/core/MibiData$NfcSessionInfo;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class MibiData$NfcSessionInfo$$serializer implements GeneratedSerializer {
    public static final MibiData$NfcSessionInfo$$serializer INSTANCE;
    public static final /* synthetic */ PluginGeneratedSerialDescriptor a;

    static {
        MibiData$NfcSessionInfo$$serializer mibiData$NfcSessionInfo$$serializer = new MibiData$NfcSessionInfo$$serializer();
        INSTANCE = mibiData$NfcSessionInfo$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.miteksystems.misnap.core.MibiData.NfcSessionInfo", mibiData$NfcSessionInfo$$serializer, 12);
        pluginGeneratedSerialDescriptor.addElement("DocumentCode", true);
        pluginGeneratedSerialDescriptor.addElement("IssuingCountry", true);
        pluginGeneratedSerialDescriptor.addElement("Nationality", true);
        pluginGeneratedSerialDescriptor.addElement("IssueDate", true);
        pluginGeneratedSerialDescriptor.addElement("Unlock", true);
        pluginGeneratedSerialDescriptor.addElement("CA", true);
        pluginGeneratedSerialDescriptor.addElement("Warnings", true);
        pluginGeneratedSerialDescriptor.addElement("DGs", true);
        pluginGeneratedSerialDescriptor.addElement("OptionalDataRedacted", true);
        pluginGeneratedSerialDescriptor.addElement("TotalDuration", false);
        pluginGeneratedSerialDescriptor.addElement("Tries", true);
        pluginGeneratedSerialDescriptor.addElement("Type", true);
        a = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public KSerializer[] childSerializers() {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new KSerializer[]{BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(MibiData$NfcChipAuthentication$$serializer.INSTANCE), BuiltinSerializersKt.getNullable(new HashSetSerializer(new HashSetSerializer(stringSerializer, 1), 1)), BuiltinSerializersKt.getNullable(new HashSetSerializer(stringSerializer, 1)), BuiltinSerializersKt.getNullable(BooleanSerializer.INSTANCE), LongSerializer.INSTANCE, BuiltinSerializersKt.getNullable(IntSerializer.INSTANCE), stringSerializer};
    }

    @Override // kotlinx.serialization.KSerializer
    public MibiData.NfcSessionInfo deserialize(Decoder decoder) {
        Object obj;
        decoder.getClass();
        SerialDescriptor descriptor = getDescriptor();
        CompositeDecoder beginStructure = decoder.beginStructure(descriptor);
        long j = 0;
        Object obj2 = null;
        boolean z = true;
        Object obj3 = null;
        Object obj4 = null;
        int i = 0;
        Object obj5 = null;
        Object obj6 = null;
        Object obj7 = null;
        Object obj8 = null;
        Object obj9 = null;
        Object obj10 = null;
        Object obj11 = null;
        String str = null;
        while (z) {
            int decodeElementIndex = beginStructure.decodeElementIndex(descriptor);
            switch (decodeElementIndex) {
                case -1:
                    z = false;
                    continue;
                case 0:
                    obj = obj2;
                    obj3 = beginStructure.decodeNullableSerializableElement(descriptor, 0, StringSerializer.INSTANCE, obj3);
                    i |= 1;
                    break;
                case 1:
                    obj = obj2;
                    obj4 = beginStructure.decodeNullableSerializableElement(descriptor, 1, StringSerializer.INSTANCE, obj4);
                    i |= 2;
                    break;
                case 2:
                    obj5 = beginStructure.decodeNullableSerializableElement(descriptor, 2, StringSerializer.INSTANCE, obj5);
                    i |= 4;
                    continue;
                case 3:
                    obj6 = beginStructure.decodeNullableSerializableElement(descriptor, 3, StringSerializer.INSTANCE, obj6);
                    i |= 8;
                    continue;
                case 4:
                    obj7 = beginStructure.decodeNullableSerializableElement(descriptor, 4, StringSerializer.INSTANCE, obj7);
                    i |= 16;
                    continue;
                case 5:
                    obj8 = beginStructure.decodeNullableSerializableElement(descriptor, 5, MibiData$NfcChipAuthentication$$serializer.INSTANCE, obj8);
                    i |= 32;
                    continue;
                case 6:
                    obj9 = beginStructure.decodeNullableSerializableElement(descriptor, 6, new HashSetSerializer(new HashSetSerializer(StringSerializer.INSTANCE, 1), 1), obj9);
                    i |= 64;
                    obj2 = obj2;
                    z = z;
                    continue;
                case 7:
                    obj = obj2;
                    obj10 = beginStructure.decodeNullableSerializableElement(descriptor, 7, new HashSetSerializer(StringSerializer.INSTANCE, 1), obj10);
                    i |= 128;
                    break;
                case 8:
                    obj11 = beginStructure.decodeNullableSerializableElement(descriptor, 8, BooleanSerializer.INSTANCE, obj11);
                    i |= 256;
                    continue;
                case 9:
                    j = beginStructure.decodeLongElement(descriptor, 9);
                    i |= 512;
                    continue;
                case 10:
                    obj2 = beginStructure.decodeNullableSerializableElement(descriptor, 10, IntSerializer.INSTANCE, obj2);
                    i |= 1024;
                    continue;
                case 11:
                    str = beginStructure.decodeStringElement(descriptor, 11);
                    i |= 2048;
                    continue;
                default:
                    LocalPresenterModule$Companion$$ExternalSyntheticLambda0.m(decodeElementIndex);
                    return null;
            }
            obj2 = obj;
        }
        Object obj12 = obj2;
        beginStructure.endStructure(descriptor);
        return new MibiData.NfcSessionInfo(i, (String) obj3, (String) obj4, (String) obj5, (String) obj6, (String) obj7, (MibiData.NfcChipAuthentication) obj8, (List) obj9, (List) obj10, (Boolean) obj11, j, (Integer) obj12, str);
    }

    @Override // kotlinx.serialization.KSerializer
    public SerialDescriptor getDescriptor() {
        return a;
    }

    @Override // kotlinx.serialization.KSerializer
    public void serialize(Encoder encoder, MibiData.NfcSessionInfo value) {
        encoder.getClass();
        value.getClass();
        SerialDescriptor descriptor = getDescriptor();
        CompositeEncoder beginStructure = encoder.beginStructure(descriptor);
        Boolean bool = value.i;
        List list = value.h;
        List list2 = value.g;
        MibiData.NfcChipAuthentication nfcChipAuthentication = value.f;
        String str = value.e;
        String str2 = value.d;
        String str3 = value.c;
        String str4 = value.b;
        String str5 = value.a;
        if (beginStructure.shouldEncodeElementDefault(descriptor) || str5 != null) {
            beginStructure.encodeNullableSerializableElement(descriptor, 0, StringSerializer.INSTANCE, str5);
        }
        if (beginStructure.shouldEncodeElementDefault(descriptor) || str4 != null) {
            beginStructure.encodeNullableSerializableElement(descriptor, 1, StringSerializer.INSTANCE, str4);
        }
        if (beginStructure.shouldEncodeElementDefault(descriptor) || str3 != null) {
            beginStructure.encodeNullableSerializableElement(descriptor, 2, StringSerializer.INSTANCE, str3);
        }
        if (beginStructure.shouldEncodeElementDefault(descriptor) || str2 != null) {
            beginStructure.encodeNullableSerializableElement(descriptor, 3, StringSerializer.INSTANCE, str2);
        }
        if (beginStructure.shouldEncodeElementDefault(descriptor) || str != null) {
            beginStructure.encodeNullableSerializableElement(descriptor, 4, StringSerializer.INSTANCE, str);
        }
        if (beginStructure.shouldEncodeElementDefault(descriptor) || nfcChipAuthentication != null) {
            beginStructure.encodeNullableSerializableElement(descriptor, 5, MibiData$NfcChipAuthentication$$serializer.INSTANCE, nfcChipAuthentication);
        }
        if (beginStructure.shouldEncodeElementDefault(descriptor) || list2 != null) {
            beginStructure.encodeNullableSerializableElement(descriptor, 6, new HashSetSerializer(new HashSetSerializer(StringSerializer.INSTANCE, 1), 1), list2);
        }
        if (beginStructure.shouldEncodeElementDefault(descriptor) || list != null) {
            beginStructure.encodeNullableSerializableElement(descriptor, 7, new HashSetSerializer(StringSerializer.INSTANCE, 1), list);
        }
        if (beginStructure.shouldEncodeElementDefault(descriptor) || bool != null) {
            beginStructure.encodeNullableSerializableElement(descriptor, 8, BooleanSerializer.INSTANCE, bool);
        }
        long j = value.j;
        String str6 = value.l;
        Integer num = value.k;
        beginStructure.encodeLongElement(descriptor, 9, j);
        if (beginStructure.shouldEncodeElementDefault(descriptor) || num != null) {
            beginStructure.encodeNullableSerializableElement(descriptor, 10, IntSerializer.INSTANCE, num);
        }
        if (beginStructure.shouldEncodeElementDefault(descriptor) || !Intrinsics.areEqual(str6, "NFC")) {
            beginStructure.encodeStringElement(descriptor, 11, str6);
        }
        beginStructure.endStructure(descriptor);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public KSerializer[] typeParametersSerializers() {
        return TuplesKt.EMPTY_SERIALIZER_ARRAY;
    }
}
