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
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.TuplesKt;

@Deprecated
@Metadata(d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u001a\u0010\u0005\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ \u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0014\u001a\u00020\u00118VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, d2 = {"com/miteksystems/misnap/core/serverconnection/MobileVerifyV2Request.MobileVerifyV2RequestModel.Configuration.Verifications.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/miteksystems/misnap/core/serverconnection/MobileVerifyV2Request$MobileVerifyV2RequestModel$Configuration$Verifications;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/miteksystems/misnap/core/serverconnection/MobileVerifyV2Request$MobileVerifyV2RequestModel$Configuration$Verifications;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/miteksystems/misnap/core/serverconnection/MobileVerifyV2Request$MobileVerifyV2RequestModel$Configuration$Verifications;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class MobileVerifyV2Request$MobileVerifyV2RequestModel$Configuration$Verifications$$serializer implements GeneratedSerializer {
    public static final MobileVerifyV2Request$MobileVerifyV2RequestModel$Configuration$Verifications$$serializer INSTANCE;
    public static final /* synthetic */ PluginGeneratedSerialDescriptor a;

    static {
        MobileVerifyV2Request$MobileVerifyV2RequestModel$Configuration$Verifications$$serializer mobileVerifyV2Request$MobileVerifyV2RequestModel$Configuration$Verifications$$serializer = new MobileVerifyV2Request$MobileVerifyV2RequestModel$Configuration$Verifications$$serializer();
        INSTANCE = mobileVerifyV2Request$MobileVerifyV2RequestModel$Configuration$Verifications$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.miteksystems.misnap.core.serverconnection.MobileVerifyV2Request.MobileVerifyV2RequestModel.Configuration.Verifications", mobileVerifyV2Request$MobileVerifyV2RequestModel$Configuration$Verifications$$serializer, 8);
        pluginGeneratedSerialDescriptor.addElement("faceComparison", true);
        pluginGeneratedSerialDescriptor.addElement("faceLiveness", true);
        pluginGeneratedSerialDescriptor.addElement("faceBlocklist", true);
        pluginGeneratedSerialDescriptor.addElement("faceVelocity", true);
        pluginGeneratedSerialDescriptor.addElement("dataSignalAAMVA", true);
        pluginGeneratedSerialDescriptor.addElement("injectionAttackDetection", true);
        pluginGeneratedSerialDescriptor.addElement("injectionAttackDetectionAI", true);
        pluginGeneratedSerialDescriptor.addElement("templateAttackDetection", true);
        a = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public KSerializer[] childSerializers() {
        BooleanSerializer booleanSerializer = BooleanSerializer.INSTANCE;
        return new KSerializer[]{BuiltinSerializersKt.getNullable(booleanSerializer), BuiltinSerializersKt.getNullable(booleanSerializer), BuiltinSerializersKt.getNullable(booleanSerializer), BuiltinSerializersKt.getNullable(booleanSerializer), BuiltinSerializersKt.getNullable(booleanSerializer), BuiltinSerializersKt.getNullable(booleanSerializer), BuiltinSerializersKt.getNullable(booleanSerializer), BuiltinSerializersKt.getNullable(booleanSerializer)};
    }

    @Override // kotlinx.serialization.KSerializer
    public MobileVerifyV2Request$MobileVerifyV2RequestModel.Configuration.Verifications deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor descriptor = getDescriptor();
        CompositeDecoder beginStructure = decoder.beginStructure(descriptor);
        MobileVerifyV2Request$MobileVerifyV2RequestModel.Configuration.Verifications verifications = null;
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
                    obj = beginStructure.decodeNullableSerializableElement(descriptor, 0, BooleanSerializer.INSTANCE, obj);
                    i |= 1;
                    break;
                case 1:
                    obj2 = beginStructure.decodeNullableSerializableElement(descriptor, 1, BooleanSerializer.INSTANCE, obj2);
                    i |= 2;
                    break;
                case 2:
                    obj3 = beginStructure.decodeNullableSerializableElement(descriptor, 2, BooleanSerializer.INSTANCE, obj3);
                    i |= 4;
                    break;
                case 3:
                    obj4 = beginStructure.decodeNullableSerializableElement(descriptor, 3, BooleanSerializer.INSTANCE, obj4);
                    i |= 8;
                    break;
                case 4:
                    obj5 = beginStructure.decodeNullableSerializableElement(descriptor, 4, BooleanSerializer.INSTANCE, obj5);
                    i |= 16;
                    break;
                case 5:
                    obj6 = beginStructure.decodeNullableSerializableElement(descriptor, 5, BooleanSerializer.INSTANCE, obj6);
                    i |= 32;
                    break;
                case 6:
                    obj7 = beginStructure.decodeNullableSerializableElement(descriptor, 6, BooleanSerializer.INSTANCE, obj7);
                    i |= 64;
                    break;
                case 7:
                    obj8 = beginStructure.decodeNullableSerializableElement(descriptor, 7, BooleanSerializer.INSTANCE, obj8);
                    i |= 128;
                    break;
                default:
                    LocalPresenterModule$Companion$$ExternalSyntheticLambda0.m(decodeElementIndex);
                    return verifications;
            }
            verifications = null;
        }
        beginStructure.endStructure(descriptor);
        return new MobileVerifyV2Request$MobileVerifyV2RequestModel.Configuration.Verifications(i, (Boolean) obj, (Boolean) obj2, (Boolean) obj3, (Boolean) obj4, (Boolean) obj5, (Boolean) obj6, (Boolean) obj7, (Boolean) obj8);
    }

    @Override // kotlinx.serialization.KSerializer
    public SerialDescriptor getDescriptor() {
        return a;
    }

    @Override // kotlinx.serialization.KSerializer
    public void serialize(Encoder encoder, MobileVerifyV2Request$MobileVerifyV2RequestModel.Configuration.Verifications value) {
        encoder.getClass();
        value.getClass();
        SerialDescriptor descriptor = getDescriptor();
        CompositeEncoder beginStructure = encoder.beginStructure(descriptor);
        Boolean bool = value.h;
        Boolean bool2 = value.g;
        Boolean bool3 = value.f;
        Boolean bool4 = value.e;
        Boolean bool5 = value.d;
        Boolean bool6 = value.c;
        Boolean bool7 = value.b;
        Boolean bool8 = value.a;
        if (beginStructure.shouldEncodeElementDefault(descriptor) || bool8 != null) {
            beginStructure.encodeNullableSerializableElement(descriptor, 0, BooleanSerializer.INSTANCE, bool8);
        }
        if (beginStructure.shouldEncodeElementDefault(descriptor) || bool7 != null) {
            beginStructure.encodeNullableSerializableElement(descriptor, 1, BooleanSerializer.INSTANCE, bool7);
        }
        if (beginStructure.shouldEncodeElementDefault(descriptor) || bool6 != null) {
            beginStructure.encodeNullableSerializableElement(descriptor, 2, BooleanSerializer.INSTANCE, bool6);
        }
        if (beginStructure.shouldEncodeElementDefault(descriptor) || bool5 != null) {
            beginStructure.encodeNullableSerializableElement(descriptor, 3, BooleanSerializer.INSTANCE, bool5);
        }
        if (beginStructure.shouldEncodeElementDefault(descriptor) || bool4 != null) {
            beginStructure.encodeNullableSerializableElement(descriptor, 4, BooleanSerializer.INSTANCE, bool4);
        }
        if (beginStructure.shouldEncodeElementDefault(descriptor) || bool3 != null) {
            beginStructure.encodeNullableSerializableElement(descriptor, 5, BooleanSerializer.INSTANCE, bool3);
        }
        if (beginStructure.shouldEncodeElementDefault(descriptor) || bool2 != null) {
            beginStructure.encodeNullableSerializableElement(descriptor, 6, BooleanSerializer.INSTANCE, bool2);
        }
        if (beginStructure.shouldEncodeElementDefault(descriptor) || bool != null) {
            beginStructure.encodeNullableSerializableElement(descriptor, 7, BooleanSerializer.INSTANCE, bool);
        }
        beginStructure.endStructure(descriptor);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public KSerializer[] typeParametersSerializers() {
        return TuplesKt.EMPTY_SERIALIZER_ARRAY;
    }
}
