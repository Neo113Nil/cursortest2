package com.miteksystems.misnap.core.serverconnection;

import app.cash.local.presenters.LocalPresenterModule$Companion$$ExternalSyntheticLambda0;
import com.miteksystems.misnap.core.serverconnection.MobileVerifyV2Request$MobileVerifyV2RequestModel;
import java.util.Map;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.collections.EmptyMap;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.HashMapSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.StringSerializer;
import kotlinx.serialization.internal.TuplesKt;

@Deprecated
@Metadata(d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u001a\u0010\u0005\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ \u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0014\u001a\u00020\u00118VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, d2 = {"com/miteksystems/misnap/core/serverconnection/MobileVerifyV2Request.MobileVerifyV2RequestModel.Document.Nfc.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/miteksystems/misnap/core/serverconnection/MobileVerifyV2Request$MobileVerifyV2RequestModel$Document$Nfc;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/miteksystems/misnap/core/serverconnection/MobileVerifyV2Request$MobileVerifyV2RequestModel$Document$Nfc;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/miteksystems/misnap/core/serverconnection/MobileVerifyV2Request$MobileVerifyV2RequestModel$Document$Nfc;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class MobileVerifyV2Request$MobileVerifyV2RequestModel$Document$Nfc$$serializer implements GeneratedSerializer {
    public static final MobileVerifyV2Request$MobileVerifyV2RequestModel$Document$Nfc$$serializer INSTANCE;
    public static final /* synthetic */ PluginGeneratedSerialDescriptor a;

    static {
        MobileVerifyV2Request$MobileVerifyV2RequestModel$Document$Nfc$$serializer mobileVerifyV2Request$MobileVerifyV2RequestModel$Document$Nfc$$serializer = new MobileVerifyV2Request$MobileVerifyV2RequestModel$Document$Nfc$$serializer();
        INSTANCE = mobileVerifyV2Request$MobileVerifyV2RequestModel$Document$Nfc$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.miteksystems.misnap.core.serverconnection.MobileVerifyV2Request.MobileVerifyV2RequestModel.Document.Nfc", mobileVerifyV2Request$MobileVerifyV2RequestModel$Document$Nfc$$serializer, 8);
        pluginGeneratedSerialDescriptor.addElement("sod", true);
        pluginGeneratedSerialDescriptor.addElement("com", true);
        pluginGeneratedSerialDescriptor.addElement("dataFormat", true);
        pluginGeneratedSerialDescriptor.addElement("dataGroups", true);
        pluginGeneratedSerialDescriptor.addElement("activeAuthInput", true);
        pluginGeneratedSerialDescriptor.addElement("chipAuthOutput", true);
        pluginGeneratedSerialDescriptor.addElement("portrait", true);
        pluginGeneratedSerialDescriptor.addElement("mibi", true);
        a = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public KSerializer[] childSerializers() {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new KSerializer[]{BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(new HashMapSerializer(stringSerializer, stringSerializer, 1)), BuiltinSerializersKt.getNullable(MobileVerifyV2Request$MobileVerifyV2RequestModel$Document$Nfc$ActiveAuthInput$$serializer.INSTANCE), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer)};
    }

    @Override // kotlinx.serialization.KSerializer
    public MobileVerifyV2Request$MobileVerifyV2RequestModel.Document.Nfc deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor descriptor = getDescriptor();
        CompositeDecoder beginStructure = decoder.beginStructure(descriptor);
        MobileVerifyV2Request$MobileVerifyV2RequestModel.Document.Nfc nfc = null;
        boolean z = true;
        int i = 0;
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        Object obj4 = null;
        Object obj5 = null;
        Object obj6 = null;
        Object obj7 = null;
        Object obj8 = null;
        while (z) {
            int decodeElementIndex = beginStructure.decodeElementIndex(descriptor);
            switch (decodeElementIndex) {
                case -1:
                    z = false;
                    continue;
                case 0:
                    obj = beginStructure.decodeNullableSerializableElement(descriptor, 0, StringSerializer.INSTANCE, obj);
                    i |= 1;
                    break;
                case 1:
                    obj2 = beginStructure.decodeNullableSerializableElement(descriptor, 1, StringSerializer.INSTANCE, obj2);
                    i |= 2;
                    break;
                case 2:
                    obj3 = beginStructure.decodeNullableSerializableElement(descriptor, 2, StringSerializer.INSTANCE, obj3);
                    i |= 4;
                    break;
                case 3:
                    StringSerializer stringSerializer = StringSerializer.INSTANCE;
                    obj4 = beginStructure.decodeNullableSerializableElement(descriptor, 3, new HashMapSerializer(stringSerializer, stringSerializer, 1), obj4);
                    i |= 8;
                    break;
                case 4:
                    obj5 = beginStructure.decodeNullableSerializableElement(descriptor, 4, MobileVerifyV2Request$MobileVerifyV2RequestModel$Document$Nfc$ActiveAuthInput$$serializer.INSTANCE, obj5);
                    i |= 16;
                    break;
                case 5:
                    obj6 = beginStructure.decodeNullableSerializableElement(descriptor, 5, StringSerializer.INSTANCE, obj6);
                    i |= 32;
                    break;
                case 6:
                    obj7 = beginStructure.decodeNullableSerializableElement(descriptor, 6, StringSerializer.INSTANCE, obj7);
                    i |= 64;
                    break;
                case 7:
                    obj8 = beginStructure.decodeNullableSerializableElement(descriptor, 7, StringSerializer.INSTANCE, obj8);
                    i |= 128;
                    break;
                default:
                    LocalPresenterModule$Companion$$ExternalSyntheticLambda0.m(decodeElementIndex);
                    return nfc;
            }
            nfc = null;
        }
        beginStructure.endStructure(descriptor);
        return new MobileVerifyV2Request$MobileVerifyV2RequestModel.Document.Nfc(i, (String) obj, (String) obj2, (String) obj3, (Map) obj4, (MobileVerifyV2Request$MobileVerifyV2RequestModel.Document.Nfc.ActiveAuthInput) obj5, (String) obj6, (String) obj7, (String) obj8);
    }

    @Override // kotlinx.serialization.KSerializer
    public SerialDescriptor getDescriptor() {
        return a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x005b, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r4, r11) == false) goto L22;
     */
    @Override // kotlinx.serialization.KSerializer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void serialize(Encoder encoder, MobileVerifyV2Request$MobileVerifyV2RequestModel.Document.Nfc value) {
        encoder.getClass();
        value.getClass();
        SerialDescriptor descriptor = getDescriptor();
        CompositeEncoder beginStructure = encoder.beginStructure(descriptor);
        String str = value.h;
        String str2 = value.g;
        String str3 = value.f;
        MobileVerifyV2Request$MobileVerifyV2RequestModel.Document.Nfc.ActiveAuthInput activeAuthInput = value.e;
        Map map = value.d;
        String str4 = value.c;
        String str5 = value.b;
        String str6 = value.a;
        if (beginStructure.shouldEncodeElementDefault(descriptor) || str6 != null) {
            beginStructure.encodeNullableSerializableElement(descriptor, 0, StringSerializer.INSTANCE, str6);
        }
        if (beginStructure.shouldEncodeElementDefault(descriptor) || str5 != null) {
            beginStructure.encodeNullableSerializableElement(descriptor, 1, StringSerializer.INSTANCE, str5);
        }
        if (beginStructure.shouldEncodeElementDefault(descriptor) || str4 != null) {
            beginStructure.encodeNullableSerializableElement(descriptor, 2, StringSerializer.INSTANCE, str4);
        }
        if (!beginStructure.shouldEncodeElementDefault(descriptor)) {
            EmptyMap emptyMap = EmptyMap.INSTANCE;
            emptyMap.getClass();
        }
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        beginStructure.encodeNullableSerializableElement(descriptor, 3, new HashMapSerializer(stringSerializer, stringSerializer, 1), map);
        if (beginStructure.shouldEncodeElementDefault(descriptor) || activeAuthInput != null) {
            beginStructure.encodeNullableSerializableElement(descriptor, 4, MobileVerifyV2Request$MobileVerifyV2RequestModel$Document$Nfc$ActiveAuthInput$$serializer.INSTANCE, activeAuthInput);
        }
        if (beginStructure.shouldEncodeElementDefault(descriptor) || str3 != null) {
            beginStructure.encodeNullableSerializableElement(descriptor, 5, StringSerializer.INSTANCE, str3);
        }
        if (beginStructure.shouldEncodeElementDefault(descriptor) || str2 != null) {
            beginStructure.encodeNullableSerializableElement(descriptor, 6, StringSerializer.INSTANCE, str2);
        }
        if (beginStructure.shouldEncodeElementDefault(descriptor) || str != null) {
            beginStructure.encodeNullableSerializableElement(descriptor, 7, StringSerializer.INSTANCE, str);
        }
        beginStructure.endStructure(descriptor);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public KSerializer[] typeParametersSerializers() {
        return TuplesKt.EMPTY_SERIALIZER_ARRAY;
    }
}
