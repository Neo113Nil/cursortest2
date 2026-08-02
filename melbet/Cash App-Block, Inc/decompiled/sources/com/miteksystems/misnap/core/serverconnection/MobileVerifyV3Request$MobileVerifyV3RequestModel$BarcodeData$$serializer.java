package com.miteksystems.misnap.core.serverconnection;

import app.cash.local.presenters.LocalPresenterModule$Companion$$ExternalSyntheticLambda0;
import com.miteksystems.misnap.core.serverconnection.MobileVerifyV3Request$MobileVerifyV3RequestModel;
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
@Metadata(d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u001a\u0010\u0005\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ \u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0014\u001a\u00020\u00118VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, d2 = {"com/miteksystems/misnap/core/serverconnection/MobileVerifyV3Request.MobileVerifyV3RequestModel.BarcodeData.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/miteksystems/misnap/core/serverconnection/MobileVerifyV3Request$MobileVerifyV3RequestModel$BarcodeData;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/miteksystems/misnap/core/serverconnection/MobileVerifyV3Request$MobileVerifyV3RequestModel$BarcodeData;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/miteksystems/misnap/core/serverconnection/MobileVerifyV3Request$MobileVerifyV3RequestModel$BarcodeData;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class MobileVerifyV3Request$MobileVerifyV3RequestModel$BarcodeData$$serializer implements GeneratedSerializer {
    public static final MobileVerifyV3Request$MobileVerifyV3RequestModel$BarcodeData$$serializer INSTANCE;
    public static final /* synthetic */ PluginGeneratedSerialDescriptor a;

    static {
        MobileVerifyV3Request$MobileVerifyV3RequestModel$BarcodeData$$serializer mobileVerifyV3Request$MobileVerifyV3RequestModel$BarcodeData$$serializer = new MobileVerifyV3Request$MobileVerifyV3RequestModel$BarcodeData$$serializer();
        INSTANCE = mobileVerifyV3Request$MobileVerifyV3RequestModel$BarcodeData$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.miteksystems.misnap.core.serverconnection.MobileVerifyV3Request.MobileVerifyV3RequestModel.BarcodeData", mobileVerifyV3Request$MobileVerifyV3RequestModel$BarcodeData$$serializer, 2);
        pluginGeneratedSerialDescriptor.addElement("dataType", false);
        pluginGeneratedSerialDescriptor.addElement("data", false);
        a = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public KSerializer[] childSerializers() {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new KSerializer[]{BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer)};
    }

    @Override // kotlinx.serialization.KSerializer
    public MobileVerifyV3Request$MobileVerifyV3RequestModel.BarcodeData deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor descriptor = getDescriptor();
        CompositeDecoder beginStructure = decoder.beginStructure(descriptor);
        boolean z = true;
        int i = 0;
        Object obj = null;
        Object obj2 = null;
        while (z) {
            int decodeElementIndex = beginStructure.decodeElementIndex(descriptor);
            if (decodeElementIndex == -1) {
                z = false;
            } else if (decodeElementIndex == 0) {
                obj = beginStructure.decodeNullableSerializableElement(descriptor, 0, StringSerializer.INSTANCE, obj);
                i |= 1;
            } else {
                if (decodeElementIndex != 1) {
                    LocalPresenterModule$Companion$$ExternalSyntheticLambda0.m(decodeElementIndex);
                    return null;
                }
                obj2 = beginStructure.decodeNullableSerializableElement(descriptor, 1, StringSerializer.INSTANCE, obj2);
                i |= 2;
            }
        }
        beginStructure.endStructure(descriptor);
        return new MobileVerifyV3Request$MobileVerifyV3RequestModel.BarcodeData(i, (String) obj, (String) obj2);
    }

    @Override // kotlinx.serialization.KSerializer
    public SerialDescriptor getDescriptor() {
        return a;
    }

    @Override // kotlinx.serialization.KSerializer
    public void serialize(Encoder encoder, MobileVerifyV3Request$MobileVerifyV3RequestModel.BarcodeData value) {
        encoder.getClass();
        value.getClass();
        SerialDescriptor descriptor = getDescriptor();
        CompositeEncoder beginStructure = encoder.beginStructure(descriptor);
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        beginStructure.encodeNullableSerializableElement(descriptor, 0, stringSerializer, value.a);
        beginStructure.encodeNullableSerializableElement(descriptor, 1, stringSerializer, value.b);
        beginStructure.endStructure(descriptor);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public KSerializer[] typeParametersSerializers() {
        return TuplesKt.EMPTY_SERIALIZER_ARRAY;
    }
}
