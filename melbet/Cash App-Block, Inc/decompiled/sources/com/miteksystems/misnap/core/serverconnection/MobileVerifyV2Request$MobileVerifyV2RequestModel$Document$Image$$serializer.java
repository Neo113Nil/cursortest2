package com.miteksystems.misnap.core.serverconnection;

import app.cash.local.presenters.LocalPresenterModule$Companion$$ExternalSyntheticLambda0;
import com.miteksystems.misnap.core.serverconnection.MobileVerifyV2Request$MobileVerifyV2RequestModel;
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
@Metadata(d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u001a\u0010\u0005\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ \u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0014\u001a\u00020\u00118VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, d2 = {"com/miteksystems/misnap/core/serverconnection/MobileVerifyV2Request.MobileVerifyV2RequestModel.Document.Image.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/miteksystems/misnap/core/serverconnection/MobileVerifyV2Request$MobileVerifyV2RequestModel$Document$Image;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/miteksystems/misnap/core/serverconnection/MobileVerifyV2Request$MobileVerifyV2RequestModel$Document$Image;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/miteksystems/misnap/core/serverconnection/MobileVerifyV2Request$MobileVerifyV2RequestModel$Document$Image;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class MobileVerifyV2Request$MobileVerifyV2RequestModel$Document$Image$$serializer implements GeneratedSerializer {
    public static final MobileVerifyV2Request$MobileVerifyV2RequestModel$Document$Image$$serializer INSTANCE;
    public static final /* synthetic */ PluginGeneratedSerialDescriptor a;

    static {
        MobileVerifyV2Request$MobileVerifyV2RequestModel$Document$Image$$serializer mobileVerifyV2Request$MobileVerifyV2RequestModel$Document$Image$$serializer = new MobileVerifyV2Request$MobileVerifyV2RequestModel$Document$Image$$serializer();
        INSTANCE = mobileVerifyV2Request$MobileVerifyV2RequestModel$Document$Image$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.miteksystems.misnap.core.serverconnection.MobileVerifyV2Request.MobileVerifyV2RequestModel.Document.Image", mobileVerifyV2Request$MobileVerifyV2RequestModel$Document$Image$$serializer, 4);
        pluginGeneratedSerialDescriptor.addElement("data", false);
        pluginGeneratedSerialDescriptor.addElement("encryptedPayload", true);
        pluginGeneratedSerialDescriptor.addElement("customerReferenceId", true);
        pluginGeneratedSerialDescriptor.addElement("encodedData", true);
        a = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public KSerializer[] childSerializers() {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new KSerializer[]{stringSerializer, BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(MobileVerifyV2Request$MobileVerifyV2RequestModel$Document$Image$EncodedData$$serializer.INSTANCE)};
    }

    @Override // kotlinx.serialization.KSerializer
    public MobileVerifyV2Request$MobileVerifyV2RequestModel.Document.Image deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor descriptor = getDescriptor();
        CompositeDecoder beginStructure = decoder.beginStructure(descriptor);
        boolean z = true;
        int i = 0;
        Object obj = null;
        String str = null;
        Object obj2 = null;
        Object obj3 = null;
        while (z) {
            int decodeElementIndex = beginStructure.decodeElementIndex(descriptor);
            if (decodeElementIndex == -1) {
                z = false;
            } else if (decodeElementIndex == 0) {
                str = beginStructure.decodeStringElement(descriptor, 0);
                i |= 1;
            } else if (decodeElementIndex == 1) {
                obj = beginStructure.decodeNullableSerializableElement(descriptor, 1, StringSerializer.INSTANCE, obj);
                i |= 2;
            } else if (decodeElementIndex == 2) {
                obj2 = beginStructure.decodeNullableSerializableElement(descriptor, 2, StringSerializer.INSTANCE, obj2);
                i |= 4;
            } else {
                if (decodeElementIndex != 3) {
                    LocalPresenterModule$Companion$$ExternalSyntheticLambda0.m(decodeElementIndex);
                    return null;
                }
                obj3 = beginStructure.decodeNullableSerializableElement(descriptor, 3, MobileVerifyV2Request$MobileVerifyV2RequestModel$Document$Image$EncodedData$$serializer.INSTANCE, obj3);
                i |= 8;
            }
        }
        beginStructure.endStructure(descriptor);
        return new MobileVerifyV2Request$MobileVerifyV2RequestModel.Document.Image(i, str, (String) obj, (String) obj2, (MobileVerifyV2Request$MobileVerifyV2RequestModel.Document.Image.EncodedData) obj3);
    }

    @Override // kotlinx.serialization.KSerializer
    public SerialDescriptor getDescriptor() {
        return a;
    }

    @Override // kotlinx.serialization.KSerializer
    public void serialize(Encoder encoder, MobileVerifyV2Request$MobileVerifyV2RequestModel.Document.Image value) {
        encoder.getClass();
        value.getClass();
        SerialDescriptor descriptor = getDescriptor();
        CompositeEncoder beginStructure = encoder.beginStructure(descriptor);
        String str = value.a;
        MobileVerifyV2Request$MobileVerifyV2RequestModel.Document.Image.EncodedData encodedData = value.d;
        String str2 = value.c;
        String str3 = value.b;
        beginStructure.encodeStringElement(descriptor, 0, str);
        if (beginStructure.shouldEncodeElementDefault(descriptor) || str3 != null) {
            beginStructure.encodeNullableSerializableElement(descriptor, 1, StringSerializer.INSTANCE, str3);
        }
        if (beginStructure.shouldEncodeElementDefault(descriptor) || str2 != null) {
            beginStructure.encodeNullableSerializableElement(descriptor, 2, StringSerializer.INSTANCE, str2);
        }
        if (beginStructure.shouldEncodeElementDefault(descriptor) || encodedData != null) {
            beginStructure.encodeNullableSerializableElement(descriptor, 3, MobileVerifyV2Request$MobileVerifyV2RequestModel$Document$Image$EncodedData$$serializer.INSTANCE, encodedData);
        }
        beginStructure.endStructure(descriptor);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public KSerializer[] typeParametersSerializers() {
        return TuplesKt.EMPTY_SERIALIZER_ARRAY;
    }
}
