package com.miteksystems.misnap.workflow;

import app.cash.local.presenters.LocalPresenterModule$Companion$$ExternalSyntheticLambda0;
import com.miteksystems.misnap.core.Barcode;
import com.miteksystems.misnap.core.Barcode$$serializer;
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
@Metadata(d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u001a\u0010\u0005\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ \u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0014\u001a\u00020\u00118VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, d2 = {"com/miteksystems/misnap/workflow/MiSnapFinalResult.BarcodeSession.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/miteksystems/misnap/workflow/MiSnapFinalResult$BarcodeSession;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/miteksystems/misnap/workflow/MiSnapFinalResult$BarcodeSession;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/miteksystems/misnap/workflow/MiSnapFinalResult$BarcodeSession;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "workflow_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class MiSnapFinalResult$BarcodeSession$$serializer implements GeneratedSerializer {
    public static final MiSnapFinalResult$BarcodeSession$$serializer INSTANCE;
    public static final /* synthetic */ PluginGeneratedSerialDescriptor a;

    static {
        MiSnapFinalResult$BarcodeSession$$serializer miSnapFinalResult$BarcodeSession$$serializer = new MiSnapFinalResult$BarcodeSession$$serializer();
        INSTANCE = miSnapFinalResult$BarcodeSession$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.miteksystems.misnap.workflow.MiSnapFinalResult.BarcodeSession", miSnapFinalResult$BarcodeSession$$serializer, 7);
        pluginGeneratedSerialDescriptor.addElement("jpegImage", false);
        pluginGeneratedSerialDescriptor.addElement("video", true);
        pluginGeneratedSerialDescriptor.addElement("barcode", true);
        pluginGeneratedSerialDescriptor.addElement("warnings", false);
        pluginGeneratedSerialDescriptor.addElement("misnapMibiData", false);
        pluginGeneratedSerialDescriptor.addElement("licenseExpired", false);
        pluginGeneratedSerialDescriptor.addElement("rts", true);
        a = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public KSerializer[] childSerializers() {
        ByteArraySerializer byteArraySerializer = ByteArraySerializer.INSTANCE;
        return new KSerializer[]{byteArraySerializer, BuiltinSerializersKt.getNullable(byteArraySerializer), BuiltinSerializersKt.getNullable(Barcode$$serializer.INSTANCE), new HashSetSerializer(UserAction.Companion.serializer(), 1), MiSnapMibiData$$serializer.INSTANCE, BooleanSerializer.INSTANCE, BuiltinSerializersKt.getNullable(StringSerializer.INSTANCE)};
    }

    @Override // kotlinx.serialization.KSerializer
    public MiSnapFinalResult.BarcodeSession deserialize(Decoder decoder) {
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
                    obj3 = beginStructure.decodeNullableSerializableElement(descriptor, 2, Barcode$$serializer.INSTANCE, obj3);
                    i |= 4;
                    break;
                case 3:
                    obj4 = beginStructure.decodeSerializableElement(descriptor, 3, new HashSetSerializer(UserAction.Companion.serializer(), 1), obj4);
                    i |= 8;
                    break;
                case 4:
                    obj5 = beginStructure.decodeSerializableElement(descriptor, 4, MiSnapMibiData$$serializer.INSTANCE, obj5);
                    i |= 16;
                    break;
                case 5:
                    z2 = beginStructure.decodeBooleanElement(descriptor, 5);
                    i |= 32;
                    break;
                case 6:
                    obj6 = beginStructure.decodeNullableSerializableElement(descriptor, 6, StringSerializer.INSTANCE, obj6);
                    i |= 64;
                    break;
                default:
                    LocalPresenterModule$Companion$$ExternalSyntheticLambda0.m(decodeElementIndex);
                    return null;
            }
        }
        beginStructure.endStructure(descriptor);
        return new MiSnapFinalResult.BarcodeSession(i, (byte[]) obj, (byte[]) obj2, (Barcode) obj3, (List) obj4, (MiSnapMibiData) obj5, z2, (String) obj6);
    }

    @Override // kotlinx.serialization.KSerializer
    public SerialDescriptor getDescriptor() {
        return a;
    }

    @Override // kotlinx.serialization.KSerializer
    public void serialize(Encoder encoder, MiSnapFinalResult.BarcodeSession value) {
        encoder.getClass();
        value.getClass();
        SerialDescriptor descriptor = getDescriptor();
        CompositeEncoder beginStructure = encoder.beginStructure(descriptor);
        MiSnapFinalResult.Companion companion = MiSnapFinalResult.Companion;
        String str = value.h;
        Barcode barcode = value.d;
        byte[] bArr = value.c;
        ByteArraySerializer byteArraySerializer = ByteArraySerializer.INSTANCE;
        beginStructure.encodeSerializableElement(descriptor, 0, byteArraySerializer, value.b);
        if (beginStructure.shouldEncodeElementDefault(descriptor) || bArr != null) {
            beginStructure.encodeNullableSerializableElement(descriptor, 1, byteArraySerializer, bArr);
        }
        if (beginStructure.shouldEncodeElementDefault(descriptor) || barcode != null) {
            beginStructure.encodeNullableSerializableElement(descriptor, 2, Barcode$$serializer.INSTANCE, barcode);
        }
        beginStructure.encodeSerializableElement(descriptor, 3, new HashSetSerializer(UserAction.Companion.serializer(), 1), value.e);
        beginStructure.encodeSerializableElement(descriptor, 4, MiSnapMibiData$$serializer.INSTANCE, value.f);
        beginStructure.encodeBooleanElement(descriptor, 5, value.g);
        if (beginStructure.shouldEncodeElementDefault(descriptor) || str != null) {
            beginStructure.encodeNullableSerializableElement(descriptor, 6, StringSerializer.INSTANCE, str);
        }
        beginStructure.endStructure(descriptor);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public KSerializer[] typeParametersSerializers() {
        return TuplesKt.EMPTY_SERIALIZER_ARRAY;
    }
}
