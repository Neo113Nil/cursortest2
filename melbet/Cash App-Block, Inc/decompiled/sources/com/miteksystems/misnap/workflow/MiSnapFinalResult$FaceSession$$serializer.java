package com.miteksystems.misnap.workflow;

import app.cash.local.presenters.LocalPresenterModule$Companion$$ExternalSyntheticLambda0;
import com.miteksystems.misnap.core.MiSnapMibiData;
import com.miteksystems.misnap.core.MiSnapMibiData$$serializer;
import com.miteksystems.misnap.core.UserAction;
import com.miteksystems.misnap.workflow.MiSnapFinalResult;
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
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.ByteArraySerializer;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.HashSetSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.StringSerializer;
import kotlinx.serialization.internal.TuplesKt;

@Deprecated
@Metadata(d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u001a\u0010\u0005\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ \u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0014\u001a\u00020\u00118VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, d2 = {"com/miteksystems/misnap/workflow/MiSnapFinalResult.FaceSession.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/miteksystems/misnap/workflow/MiSnapFinalResult$FaceSession;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/miteksystems/misnap/workflow/MiSnapFinalResult$FaceSession;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/miteksystems/misnap/workflow/MiSnapFinalResult$FaceSession;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "workflow_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class MiSnapFinalResult$FaceSession$$serializer implements GeneratedSerializer {
    public static final MiSnapFinalResult$FaceSession$$serializer INSTANCE;
    public static final /* synthetic */ PluginGeneratedSerialDescriptor a;

    static {
        MiSnapFinalResult$FaceSession$$serializer miSnapFinalResult$FaceSession$$serializer = new MiSnapFinalResult$FaceSession$$serializer();
        INSTANCE = miSnapFinalResult$FaceSession$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.miteksystems.misnap.workflow.MiSnapFinalResult.FaceSession", miSnapFinalResult$FaceSession$$serializer, 7);
        pluginGeneratedSerialDescriptor.addElement("jpegImage", false);
        pluginGeneratedSerialDescriptor.addElement("video", true);
        pluginGeneratedSerialDescriptor.addElement("warnings", false);
        pluginGeneratedSerialDescriptor.addElement("misnapMibiData", false);
        pluginGeneratedSerialDescriptor.addElement("licenseExpired", false);
        pluginGeneratedSerialDescriptor.addElement("rts", true);
        pluginGeneratedSerialDescriptor.addElement("aIBasedRts", true);
        a = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public KSerializer[] childSerializers() {
        ByteArraySerializer byteArraySerializer = ByteArraySerializer.INSTANCE;
        return new KSerializer[]{byteArraySerializer, BuiltinSerializersKt.getNullable(byteArraySerializer), new HashSetSerializer(UserAction.Companion.serializer(), 1), MiSnapMibiData$$serializer.INSTANCE, BooleanSerializer.INSTANCE, BuiltinSerializersKt.getNullable(StringSerializer.INSTANCE), BuiltinSerializersKt.getNullable(byteArraySerializer)};
    }

    @Override // kotlinx.serialization.KSerializer
    public MiSnapFinalResult.FaceSession deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor descriptor = getDescriptor();
        CompositeDecoder beginStructure = decoder.beginStructure(descriptor);
        boolean z = true;
        int i = 0;
        boolean z2 = false;
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        Object obj4 = null;
        Object obj5 = null;
        Object obj6 = null;
        while (z) {
            int decodeElementIndex = beginStructure.decodeElementIndex(descriptor);
            switch (decodeElementIndex) {
                case -1:
                    z = false;
                    break;
                case 0:
                    obj = beginStructure.decodeSerializableElement(descriptor, 0, ByteArraySerializer.INSTANCE, obj);
                    i |= 1;
                    break;
                case 1:
                    obj2 = beginStructure.decodeNullableSerializableElement(descriptor, 1, ByteArraySerializer.INSTANCE, obj2);
                    i |= 2;
                    break;
                case 2:
                    obj3 = beginStructure.decodeSerializableElement(descriptor, 2, new HashSetSerializer(UserAction.Companion.serializer(), 1), obj3);
                    i |= 4;
                    break;
                case 3:
                    obj4 = beginStructure.decodeSerializableElement(descriptor, 3, MiSnapMibiData$$serializer.INSTANCE, obj4);
                    i |= 8;
                    break;
                case 4:
                    z2 = beginStructure.decodeBooleanElement(descriptor, 4);
                    i |= 16;
                    break;
                case 5:
                    obj5 = beginStructure.decodeNullableSerializableElement(descriptor, 5, StringSerializer.INSTANCE, obj5);
                    i |= 32;
                    break;
                case 6:
                    obj6 = beginStructure.decodeNullableSerializableElement(descriptor, 6, ByteArraySerializer.INSTANCE, obj6);
                    i |= 64;
                    break;
                default:
                    LocalPresenterModule$Companion$$ExternalSyntheticLambda0.m(decodeElementIndex);
                    return null;
            }
        }
        beginStructure.endStructure(descriptor);
        return new MiSnapFinalResult.FaceSession(i, (byte[]) obj, (byte[]) obj2, (List) obj3, (MiSnapMibiData) obj4, z2, (String) obj5, (byte[]) obj6);
    }

    @Override // kotlinx.serialization.KSerializer
    public SerialDescriptor getDescriptor() {
        return a;
    }

    @Override // kotlinx.serialization.KSerializer
    public void serialize(Encoder encoder, MiSnapFinalResult.FaceSession value) {
        encoder.getClass();
        value.getClass();
        SerialDescriptor descriptor = getDescriptor();
        CompositeEncoder beginStructure = encoder.beginStructure(descriptor);
        MiSnapFinalResult.Companion companion = MiSnapFinalResult.Companion;
        byte[] bArr = value.h;
        String str = value.g;
        byte[] bArr2 = value.c;
        ByteArraySerializer byteArraySerializer = ByteArraySerializer.INSTANCE;
        beginStructure.encodeSerializableElement(descriptor, 0, byteArraySerializer, value.b);
        if (beginStructure.shouldEncodeElementDefault(descriptor) || bArr2 != null) {
            beginStructure.encodeNullableSerializableElement(descriptor, 1, byteArraySerializer, bArr2);
        }
        beginStructure.encodeSerializableElement(descriptor, 2, new HashSetSerializer(UserAction.Companion.serializer(), 1), value.d);
        beginStructure.encodeSerializableElement(descriptor, 3, MiSnapMibiData$$serializer.INSTANCE, value.e);
        beginStructure.encodeBooleanElement(descriptor, 4, value.f);
        if (beginStructure.shouldEncodeElementDefault(descriptor) || str != null) {
            beginStructure.encodeNullableSerializableElement(descriptor, 5, StringSerializer.INSTANCE, str);
        }
        if (beginStructure.shouldEncodeElementDefault(descriptor) || bArr != null) {
            beginStructure.encodeNullableSerializableElement(descriptor, 6, byteArraySerializer, bArr);
        }
        beginStructure.endStructure(descriptor);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public KSerializer[] typeParametersSerializers() {
        return TuplesKt.EMPTY_SERIALIZER_ARRAY;
    }
}
