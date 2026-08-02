package com.miteksystems.misnap.workflow;

import app.cash.local.presenters.LocalPresenterModule$Companion$$ExternalSyntheticLambda0;
import com.miteksystems.misnap.core.Barcode;
import com.miteksystems.misnap.core.Barcode$$serializer;
import com.miteksystems.misnap.core.DocumentClassification;
import com.miteksystems.misnap.core.DocumentClassification$$serializer;
import com.miteksystems.misnap.core.DocumentExtraction;
import com.miteksystems.misnap.core.DocumentExtraction$$serializer;
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
@Metadata(d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u001a\u0010\u0005\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ \u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0014\u001a\u00020\u00118VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, d2 = {"com/miteksystems/misnap/workflow/MiSnapFinalResult.DocumentSession.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/miteksystems/misnap/workflow/MiSnapFinalResult$DocumentSession;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/miteksystems/misnap/workflow/MiSnapFinalResult$DocumentSession;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/miteksystems/misnap/workflow/MiSnapFinalResult$DocumentSession;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "workflow_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class MiSnapFinalResult$DocumentSession$$serializer implements GeneratedSerializer {
    public static final MiSnapFinalResult$DocumentSession$$serializer INSTANCE;
    public static final /* synthetic */ PluginGeneratedSerialDescriptor a;

    static {
        MiSnapFinalResult$DocumentSession$$serializer miSnapFinalResult$DocumentSession$$serializer = new MiSnapFinalResult$DocumentSession$$serializer();
        INSTANCE = miSnapFinalResult$DocumentSession$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.miteksystems.misnap.workflow.MiSnapFinalResult.DocumentSession", miSnapFinalResult$DocumentSession$$serializer, 9);
        pluginGeneratedSerialDescriptor.addElement("jpegImage", false);
        pluginGeneratedSerialDescriptor.addElement("video", true);
        pluginGeneratedSerialDescriptor.addElement("extraction", false);
        pluginGeneratedSerialDescriptor.addElement("classification", false);
        pluginGeneratedSerialDescriptor.addElement("barcode", false);
        pluginGeneratedSerialDescriptor.addElement("warnings", false);
        pluginGeneratedSerialDescriptor.addElement("misnapMibiData", false);
        pluginGeneratedSerialDescriptor.addElement("licenseExpired", false);
        pluginGeneratedSerialDescriptor.addElement("rts", true);
        a = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public KSerializer[] childSerializers() {
        ByteArraySerializer byteArraySerializer = ByteArraySerializer.INSTANCE;
        return new KSerializer[]{byteArraySerializer, BuiltinSerializersKt.getNullable(byteArraySerializer), BuiltinSerializersKt.getNullable(DocumentExtraction$$serializer.INSTANCE), BuiltinSerializersKt.getNullable(DocumentClassification$$serializer.INSTANCE), BuiltinSerializersKt.getNullable(Barcode$$serializer.INSTANCE), new HashSetSerializer(UserAction.Companion.serializer(), 1), MiSnapMibiData$$serializer.INSTANCE, BooleanSerializer.INSTANCE, BuiltinSerializersKt.getNullable(StringSerializer.INSTANCE)};
    }

    @Override // kotlinx.serialization.KSerializer
    public MiSnapFinalResult.DocumentSession deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor descriptor = getDescriptor();
        CompositeDecoder beginStructure = decoder.beginStructure(descriptor);
        MiSnapFinalResult.DocumentSession documentSession = null;
        boolean z = true;
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        Object obj4 = null;
        Object obj5 = null;
        Object obj6 = null;
        Object obj7 = null;
        Object obj8 = null;
        int i = 0;
        boolean z2 = false;
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
                    obj3 = beginStructure.decodeNullableSerializableElement(descriptor, 2, DocumentExtraction$$serializer.INSTANCE, obj3);
                    i |= 4;
                    break;
                case 3:
                    obj4 = beginStructure.decodeNullableSerializableElement(descriptor, 3, DocumentClassification$$serializer.INSTANCE, obj4);
                    i |= 8;
                    break;
                case 4:
                    obj5 = beginStructure.decodeNullableSerializableElement(descriptor, 4, Barcode$$serializer.INSTANCE, obj5);
                    i |= 16;
                    break;
                case 5:
                    obj6 = beginStructure.decodeSerializableElement(descriptor, 5, new HashSetSerializer(UserAction.Companion.serializer(), 1), obj6);
                    i |= 32;
                    break;
                case 6:
                    obj7 = beginStructure.decodeSerializableElement(descriptor, 6, MiSnapMibiData$$serializer.INSTANCE, obj7);
                    i |= 64;
                    break;
                case 7:
                    z2 = beginStructure.decodeBooleanElement(descriptor, 7);
                    i |= 128;
                    break;
                case 8:
                    obj8 = beginStructure.decodeNullableSerializableElement(descriptor, 8, StringSerializer.INSTANCE, obj8);
                    i |= 256;
                    break;
                default:
                    LocalPresenterModule$Companion$$ExternalSyntheticLambda0.m(decodeElementIndex);
                    return documentSession;
            }
            documentSession = null;
        }
        beginStructure.endStructure(descriptor);
        return new MiSnapFinalResult.DocumentSession(i, (byte[]) obj, (byte[]) obj2, (DocumentExtraction) obj3, (DocumentClassification) obj4, (Barcode) obj5, (List) obj6, (MiSnapMibiData) obj7, z2, (String) obj8);
    }

    @Override // kotlinx.serialization.KSerializer
    public SerialDescriptor getDescriptor() {
        return a;
    }

    @Override // kotlinx.serialization.KSerializer
    public void serialize(Encoder encoder, MiSnapFinalResult.DocumentSession value) {
        encoder.getClass();
        value.getClass();
        SerialDescriptor descriptor = getDescriptor();
        CompositeEncoder beginStructure = encoder.beginStructure(descriptor);
        MiSnapFinalResult.Companion companion = MiSnapFinalResult.Companion;
        String str = value.j;
        byte[] bArr = value.c;
        ByteArraySerializer byteArraySerializer = ByteArraySerializer.INSTANCE;
        beginStructure.encodeSerializableElement(descriptor, 0, byteArraySerializer, value.b);
        if (beginStructure.shouldEncodeElementDefault(descriptor) || bArr != null) {
            beginStructure.encodeNullableSerializableElement(descriptor, 1, byteArraySerializer, bArr);
        }
        beginStructure.encodeNullableSerializableElement(descriptor, 2, DocumentExtraction$$serializer.INSTANCE, value.d);
        beginStructure.encodeNullableSerializableElement(descriptor, 3, DocumentClassification$$serializer.INSTANCE, value.e);
        beginStructure.encodeNullableSerializableElement(descriptor, 4, Barcode$$serializer.INSTANCE, value.f);
        beginStructure.encodeSerializableElement(descriptor, 5, new HashSetSerializer(UserAction.Companion.serializer(), 1), value.g);
        beginStructure.encodeSerializableElement(descriptor, 6, MiSnapMibiData$$serializer.INSTANCE, value.h);
        beginStructure.encodeBooleanElement(descriptor, 7, value.i);
        if (beginStructure.shouldEncodeElementDefault(descriptor) || str != null) {
            beginStructure.encodeNullableSerializableElement(descriptor, 8, StringSerializer.INSTANCE, str);
        }
        beginStructure.endStructure(descriptor);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public KSerializer[] typeParametersSerializers() {
        return TuplesKt.EMPTY_SERIALIZER_ARRAY;
    }
}
