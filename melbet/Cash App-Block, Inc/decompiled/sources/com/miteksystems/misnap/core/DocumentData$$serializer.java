package com.miteksystems.misnap.core;

import app.cash.local.presenters.LocalPresenterModule$Companion$$ExternalSyntheticLambda0;
import com.appsflyer.AdRevenueScheme;
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
import kotlinx.serialization.internal.StringSerializer;
import kotlinx.serialization.internal.TuplesKt;

@Deprecated
@Metadata(d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u001a\u0010\u0005\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ \u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0014\u001a\u00020\u00118VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, d2 = {"com/miteksystems/misnap/core/DocumentData.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/miteksystems/misnap/core/DocumentData;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/miteksystems/misnap/core/DocumentData;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/miteksystems/misnap/core/DocumentData;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class DocumentData$$serializer implements GeneratedSerializer {
    public static final DocumentData$$serializer INSTANCE;
    public static final /* synthetic */ PluginGeneratedSerialDescriptor a;

    static {
        DocumentData$$serializer documentData$$serializer = new DocumentData$$serializer();
        INSTANCE = documentData$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.miteksystems.misnap.core.DocumentData", documentData$$serializer, 12);
        pluginGeneratedSerialDescriptor.addElement("docType", true);
        pluginGeneratedSerialDescriptor.addElement(AdRevenueScheme.COUNTRY, true);
        pluginGeneratedSerialDescriptor.addElement("surname", true);
        pluginGeneratedSerialDescriptor.addElement("firstName", true);
        pluginGeneratedSerialDescriptor.addElement("docNumber", true);
        pluginGeneratedSerialDescriptor.addElement("nationality", true);
        pluginGeneratedSerialDescriptor.addElement("dateOfBirth", true);
        pluginGeneratedSerialDescriptor.addElement("sex", true);
        pluginGeneratedSerialDescriptor.addElement("dateOfExpiration", true);
        pluginGeneratedSerialDescriptor.addElement("optionalData1", true);
        pluginGeneratedSerialDescriptor.addElement("optionalData2", true);
        pluginGeneratedSerialDescriptor.addElement("rawData", true);
        a = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public KSerializer[] childSerializers() {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new KSerializer[]{BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer)};
    }

    @Override // kotlinx.serialization.KSerializer
    public DocumentData deserialize(Decoder decoder) {
        boolean z;
        Object obj;
        Object obj2;
        decoder.getClass();
        SerialDescriptor descriptor = getDescriptor();
        CompositeDecoder beginStructure = decoder.beginStructure(descriptor);
        Object obj3 = null;
        Object obj4 = null;
        Object obj5 = null;
        boolean z2 = true;
        Object obj6 = null;
        int i = 0;
        Object obj7 = null;
        Object obj8 = null;
        Object obj9 = null;
        Object obj10 = null;
        Object obj11 = null;
        Object obj12 = null;
        Object obj13 = null;
        Object obj14 = null;
        while (z2) {
            int decodeElementIndex = beginStructure.decodeElementIndex(descriptor);
            switch (decodeElementIndex) {
                case -1:
                    obj2 = obj3;
                    z2 = false;
                    obj3 = obj2;
                case 0:
                    obj2 = obj3;
                    obj6 = beginStructure.decodeNullableSerializableElement(descriptor, 0, StringSerializer.INSTANCE, obj6);
                    i |= 1;
                    z2 = z2;
                    obj3 = obj2;
                case 1:
                    z = z2;
                    obj = obj6;
                    obj7 = beginStructure.decodeNullableSerializableElement(descriptor, 1, StringSerializer.INSTANCE, obj7);
                    i |= 2;
                    z2 = z;
                    obj6 = obj;
                case 2:
                    z = z2;
                    obj = obj6;
                    obj8 = beginStructure.decodeNullableSerializableElement(descriptor, 2, StringSerializer.INSTANCE, obj8);
                    i |= 4;
                    z2 = z;
                    obj6 = obj;
                case 3:
                    z = z2;
                    obj = obj6;
                    obj9 = beginStructure.decodeNullableSerializableElement(descriptor, 3, StringSerializer.INSTANCE, obj9);
                    i |= 8;
                    z2 = z;
                    obj6 = obj;
                case 4:
                    z = z2;
                    obj = obj6;
                    obj10 = beginStructure.decodeNullableSerializableElement(descriptor, 4, StringSerializer.INSTANCE, obj10);
                    i |= 16;
                    z2 = z;
                    obj6 = obj;
                case 5:
                    z = z2;
                    obj = obj6;
                    obj11 = beginStructure.decodeNullableSerializableElement(descriptor, 5, StringSerializer.INSTANCE, obj11);
                    i |= 32;
                    z2 = z;
                    obj6 = obj;
                case 6:
                    z = z2;
                    obj = obj6;
                    obj12 = beginStructure.decodeNullableSerializableElement(descriptor, 6, StringSerializer.INSTANCE, obj12);
                    i |= 64;
                    z2 = z;
                    obj6 = obj;
                case 7:
                    z = z2;
                    obj = obj6;
                    obj13 = beginStructure.decodeNullableSerializableElement(descriptor, 7, StringSerializer.INSTANCE, obj13);
                    i |= 128;
                    z2 = z;
                    obj6 = obj;
                case 8:
                    z = z2;
                    obj = obj6;
                    obj14 = beginStructure.decodeNullableSerializableElement(descriptor, 8, StringSerializer.INSTANCE, obj14);
                    i |= 256;
                    z2 = z;
                    obj6 = obj;
                case 9:
                    z = z2;
                    obj = obj6;
                    obj5 = beginStructure.decodeNullableSerializableElement(descriptor, 9, StringSerializer.INSTANCE, obj5);
                    i |= 512;
                    z2 = z;
                    obj6 = obj;
                case 10:
                    z = z2;
                    obj = obj6;
                    obj4 = beginStructure.decodeNullableSerializableElement(descriptor, 10, StringSerializer.INSTANCE, obj4);
                    i |= 1024;
                    z2 = z;
                    obj6 = obj;
                case 11:
                    z = z2;
                    obj = obj6;
                    obj3 = beginStructure.decodeNullableSerializableElement(descriptor, 11, StringSerializer.INSTANCE, obj3);
                    i |= 2048;
                    z2 = z;
                    obj6 = obj;
                default:
                    LocalPresenterModule$Companion$$ExternalSyntheticLambda0.m(decodeElementIndex);
                    return null;
            }
        }
        beginStructure.endStructure(descriptor);
        return new DocumentData(i, (String) obj6, (String) obj7, (String) obj8, (String) obj9, (String) obj10, (String) obj11, (String) obj12, (String) obj13, (String) obj14, (String) obj5, (String) obj4, (String) obj3);
    }

    @Override // kotlinx.serialization.KSerializer
    public SerialDescriptor getDescriptor() {
        return a;
    }

    @Override // kotlinx.serialization.KSerializer
    public void serialize(Encoder encoder, DocumentData value) {
        encoder.getClass();
        value.getClass();
        SerialDescriptor descriptor = getDescriptor();
        CompositeEncoder beginStructure = encoder.beginStructure(descriptor);
        String str = value.l;
        String str2 = value.k;
        String str3 = value.j;
        String str4 = value.i;
        String str5 = value.h;
        String str6 = value.g;
        String str7 = value.f;
        String str8 = value.e;
        String str9 = value.d;
        String str10 = value.c;
        String str11 = value.b;
        String str12 = value.a;
        if (beginStructure.shouldEncodeElementDefault(descriptor) || str12 != null) {
            beginStructure.encodeNullableSerializableElement(descriptor, 0, StringSerializer.INSTANCE, str12);
        }
        if (beginStructure.shouldEncodeElementDefault(descriptor) || str11 != null) {
            beginStructure.encodeNullableSerializableElement(descriptor, 1, StringSerializer.INSTANCE, str11);
        }
        if (beginStructure.shouldEncodeElementDefault(descriptor) || str10 != null) {
            beginStructure.encodeNullableSerializableElement(descriptor, 2, StringSerializer.INSTANCE, str10);
        }
        if (beginStructure.shouldEncodeElementDefault(descriptor) || str9 != null) {
            beginStructure.encodeNullableSerializableElement(descriptor, 3, StringSerializer.INSTANCE, str9);
        }
        if (beginStructure.shouldEncodeElementDefault(descriptor) || str8 != null) {
            beginStructure.encodeNullableSerializableElement(descriptor, 4, StringSerializer.INSTANCE, str8);
        }
        if (beginStructure.shouldEncodeElementDefault(descriptor) || str7 != null) {
            beginStructure.encodeNullableSerializableElement(descriptor, 5, StringSerializer.INSTANCE, str7);
        }
        if (beginStructure.shouldEncodeElementDefault(descriptor) || str6 != null) {
            beginStructure.encodeNullableSerializableElement(descriptor, 6, StringSerializer.INSTANCE, str6);
        }
        if (beginStructure.shouldEncodeElementDefault(descriptor) || str5 != null) {
            beginStructure.encodeNullableSerializableElement(descriptor, 7, StringSerializer.INSTANCE, str5);
        }
        if (beginStructure.shouldEncodeElementDefault(descriptor) || str4 != null) {
            beginStructure.encodeNullableSerializableElement(descriptor, 8, StringSerializer.INSTANCE, str4);
        }
        if (beginStructure.shouldEncodeElementDefault(descriptor) || str3 != null) {
            beginStructure.encodeNullableSerializableElement(descriptor, 9, StringSerializer.INSTANCE, str3);
        }
        if (beginStructure.shouldEncodeElementDefault(descriptor) || str2 != null) {
            beginStructure.encodeNullableSerializableElement(descriptor, 10, StringSerializer.INSTANCE, str2);
        }
        if (beginStructure.shouldEncodeElementDefault(descriptor) || str != null) {
            beginStructure.encodeNullableSerializableElement(descriptor, 11, StringSerializer.INSTANCE, str);
        }
        beginStructure.endStructure(descriptor);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public KSerializer[] typeParametersSerializers() {
        return TuplesKt.EMPTY_SERIALIZER_ARRAY;
    }
}
