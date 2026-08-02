package com.miteksystems.misnap.core.serverconnection;

import app.cash.local.presenters.LocalPresenterModule$Companion$$ExternalSyntheticLambda0;
import com.knotapi.knot.utilities.BreadcrumbHelper;
import com.miteksystems.misnap.core.serverconnection.MobileVerifyV2Request$MobileVerifyV2RequestModel;
import java.util.List;
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
import kotlinx.serialization.internal.HashSetSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.TuplesKt;

@Deprecated
@Metadata(d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u001a\u0010\u0005\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ \u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0014\u001a\u00020\u00118VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, d2 = {"com/miteksystems/misnap/core/serverconnection/MobileVerifyV2Request.MobileVerifyV2RequestModel.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/miteksystems/misnap/core/serverconnection/MobileVerifyV2Request$MobileVerifyV2RequestModel;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/miteksystems/misnap/core/serverconnection/MobileVerifyV2Request$MobileVerifyV2RequestModel;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/miteksystems/misnap/core/serverconnection/MobileVerifyV2Request$MobileVerifyV2RequestModel;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class MobileVerifyV2Request$MobileVerifyV2RequestModel$$serializer implements GeneratedSerializer {
    public static final MobileVerifyV2Request$MobileVerifyV2RequestModel$$serializer INSTANCE;
    public static final /* synthetic */ PluginGeneratedSerialDescriptor a;

    static {
        MobileVerifyV2Request$MobileVerifyV2RequestModel$$serializer mobileVerifyV2Request$MobileVerifyV2RequestModel$$serializer = new MobileVerifyV2Request$MobileVerifyV2RequestModel$$serializer();
        INSTANCE = mobileVerifyV2Request$MobileVerifyV2RequestModel$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.miteksystems.misnap.core.serverconnection.MobileVerifyV2Request.MobileVerifyV2RequestModel", mobileVerifyV2Request$MobileVerifyV2RequestModel$$serializer, 3);
        pluginGeneratedSerialDescriptor.addElement("dossierMetadata", true);
        pluginGeneratedSerialDescriptor.addElement("evidence", false);
        pluginGeneratedSerialDescriptor.addElement(BreadcrumbHelper.Category.CONFIGURATION, true);
        a = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public KSerializer[] childSerializers() {
        return new KSerializer[]{BuiltinSerializersKt.getNullable(MobileVerifyV2Request$MobileVerifyV2RequestModel$MetaData$$serializer.INSTANCE), BuiltinSerializersKt.getNullable(new HashSetSerializer(MobileVerifyV2Request$MobileVerifyV2RequestModel.a.a, 1)), BuiltinSerializersKt.getNullable(MobileVerifyV2Request$MobileVerifyV2RequestModel$Configuration$$serializer.INSTANCE)};
    }

    @Override // kotlinx.serialization.KSerializer
    public MobileVerifyV2Request$MobileVerifyV2RequestModel deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor descriptor = getDescriptor();
        CompositeDecoder beginStructure = decoder.beginStructure(descriptor);
        boolean z = true;
        int i = 0;
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        while (z) {
            int decodeElementIndex = beginStructure.decodeElementIndex(descriptor);
            if (decodeElementIndex == -1) {
                z = false;
            } else if (decodeElementIndex == 0) {
                obj = beginStructure.decodeNullableSerializableElement(descriptor, 0, MobileVerifyV2Request$MobileVerifyV2RequestModel$MetaData$$serializer.INSTANCE, obj);
                i |= 1;
            } else if (decodeElementIndex == 1) {
                obj2 = beginStructure.decodeNullableSerializableElement(descriptor, 1, new HashSetSerializer(MobileVerifyV2Request$MobileVerifyV2RequestModel.a.a, 1), obj2);
                i |= 2;
            } else {
                if (decodeElementIndex != 2) {
                    LocalPresenterModule$Companion$$ExternalSyntheticLambda0.m(decodeElementIndex);
                    return null;
                }
                obj3 = beginStructure.decodeNullableSerializableElement(descriptor, 2, MobileVerifyV2Request$MobileVerifyV2RequestModel$Configuration$$serializer.INSTANCE, obj3);
                i |= 4;
            }
        }
        beginStructure.endStructure(descriptor);
        return new MobileVerifyV2Request$MobileVerifyV2RequestModel(i, (MobileVerifyV2Request$MobileVerifyV2RequestModel.MetaData) obj, (List) obj2, (MobileVerifyV2Request$MobileVerifyV2RequestModel.Configuration) obj3);
    }

    @Override // kotlinx.serialization.KSerializer
    public SerialDescriptor getDescriptor() {
        return a;
    }

    @Override // kotlinx.serialization.KSerializer
    public void serialize(Encoder encoder, MobileVerifyV2Request$MobileVerifyV2RequestModel value) {
        encoder.getClass();
        value.getClass();
        SerialDescriptor descriptor = getDescriptor();
        CompositeEncoder beginStructure = encoder.beginStructure(descriptor);
        MobileVerifyV2Request$MobileVerifyV2RequestModel.MetaData metaData = value.a;
        if (beginStructure.shouldEncodeElementDefault(descriptor) || metaData != null) {
            beginStructure.encodeNullableSerializableElement(descriptor, 0, MobileVerifyV2Request$MobileVerifyV2RequestModel$MetaData$$serializer.INSTANCE, metaData);
        }
        HashSetSerializer hashSetSerializer = new HashSetSerializer(MobileVerifyV2Request$MobileVerifyV2RequestModel.a.a, 1);
        List list = value.b;
        MobileVerifyV2Request$MobileVerifyV2RequestModel.Configuration configuration = value.c;
        beginStructure.encodeNullableSerializableElement(descriptor, 1, hashSetSerializer, list);
        if (beginStructure.shouldEncodeElementDefault(descriptor) || configuration != null) {
            beginStructure.encodeNullableSerializableElement(descriptor, 2, MobileVerifyV2Request$MobileVerifyV2RequestModel$Configuration$$serializer.INSTANCE, configuration);
        }
        beginStructure.endStructure(descriptor);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public KSerializer[] typeParametersSerializers() {
        return TuplesKt.EMPTY_SERIALIZER_ARRAY;
    }
}
