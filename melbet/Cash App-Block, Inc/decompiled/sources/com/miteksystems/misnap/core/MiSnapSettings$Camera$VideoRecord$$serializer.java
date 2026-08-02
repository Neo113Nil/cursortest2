package com.miteksystems.misnap.core;

import android.util.Size;
import app.cash.local.presenters.LocalPresenterModule$Companion$$ExternalSyntheticLambda0;
import com.miteksystems.misnap.core.MiSnapSettings;
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
import kotlinx.serialization.internal.EnumSerializer;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.TuplesKt;

@Deprecated
@Metadata(d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u001a\u0010\u0005\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ \u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0014\u001a\u00020\u00118VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, d2 = {"com/miteksystems/misnap/core/MiSnapSettings.Camera.VideoRecord.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/miteksystems/misnap/core/MiSnapSettings$Camera$VideoRecord;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/miteksystems/misnap/core/MiSnapSettings$Camera$VideoRecord;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/miteksystems/misnap/core/MiSnapSettings$Camera$VideoRecord;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class MiSnapSettings$Camera$VideoRecord$$serializer implements GeneratedSerializer {
    public static final MiSnapSettings$Camera$VideoRecord$$serializer INSTANCE;
    public static final /* synthetic */ PluginGeneratedSerialDescriptor a;

    static {
        MiSnapSettings$Camera$VideoRecord$$serializer miSnapSettings$Camera$VideoRecord$$serializer = new MiSnapSettings$Camera$VideoRecord$$serializer();
        INSTANCE = miSnapSettings$Camera$VideoRecord$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.miteksystems.misnap.core.MiSnapSettings.Camera.VideoRecord", miSnapSettings$Camera$VideoRecord$$serializer, 5);
        pluginGeneratedSerialDescriptor.addElement("recordSession", true);
        pluginGeneratedSerialDescriptor.addElement("recordAudio", true);
        pluginGeneratedSerialDescriptor.addElement("videoQuality", true);
        pluginGeneratedSerialDescriptor.addElement("videoResolution", true);
        pluginGeneratedSerialDescriptor.addElement("videoBitrate", true);
        a = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public KSerializer[] childSerializers() {
        BooleanSerializer booleanSerializer = BooleanSerializer.INSTANCE;
        KSerializer nullable = BuiltinSerializersKt.getNullable(booleanSerializer);
        KSerializer nullable2 = BuiltinSerializersKt.getNullable(booleanSerializer);
        MiSnapSettings.Camera.VideoRecord.VideoQuality[] values = MiSnapSettings.Camera.VideoRecord.VideoQuality.values();
        values.getClass();
        return new KSerializer[]{nullable, nullable2, BuiltinSerializersKt.getNullable(new EnumSerializer("com.miteksystems.misnap.core.MiSnapSettings.Camera.VideoRecord.VideoQuality", (Enum[]) values)), BuiltinSerializersKt.getNullable(MiSnapSettings.SizeSerializer.INSTANCE), BuiltinSerializersKt.getNullable(IntSerializer.INSTANCE)};
    }

    @Override // kotlinx.serialization.KSerializer
    public MiSnapSettings.Camera.VideoRecord deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor descriptor = getDescriptor();
        CompositeDecoder beginStructure = decoder.beginStructure(descriptor);
        boolean z = true;
        int i = 0;
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        Object obj4 = null;
        Object obj5 = null;
        while (z) {
            int decodeElementIndex = beginStructure.decodeElementIndex(descriptor);
            if (decodeElementIndex == -1) {
                z = false;
            } else if (decodeElementIndex == 0) {
                obj = beginStructure.decodeNullableSerializableElement(descriptor, 0, BooleanSerializer.INSTANCE, obj);
                i |= 1;
            } else if (decodeElementIndex == 1) {
                obj2 = beginStructure.decodeNullableSerializableElement(descriptor, 1, BooleanSerializer.INSTANCE, obj2);
                i |= 2;
            } else if (decodeElementIndex == 2) {
                MiSnapSettings.Camera.VideoRecord.VideoQuality[] values = MiSnapSettings.Camera.VideoRecord.VideoQuality.values();
                values.getClass();
                obj3 = beginStructure.decodeNullableSerializableElement(descriptor, 2, new EnumSerializer("com.miteksystems.misnap.core.MiSnapSettings.Camera.VideoRecord.VideoQuality", (Enum[]) values), obj3);
                i |= 4;
            } else if (decodeElementIndex == 3) {
                obj4 = beginStructure.decodeNullableSerializableElement(descriptor, 3, MiSnapSettings.SizeSerializer.INSTANCE, obj4);
                i |= 8;
            } else {
                if (decodeElementIndex != 4) {
                    LocalPresenterModule$Companion$$ExternalSyntheticLambda0.m(decodeElementIndex);
                    return null;
                }
                obj5 = beginStructure.decodeNullableSerializableElement(descriptor, 4, IntSerializer.INSTANCE, obj5);
                i |= 16;
            }
        }
        beginStructure.endStructure(descriptor);
        Boolean bool = (Boolean) obj;
        Boolean bool2 = (Boolean) obj2;
        MiSnapSettings.Camera.VideoRecord.VideoQuality videoQuality = (MiSnapSettings.Camera.VideoRecord.VideoQuality) obj3;
        Size size = (Size) obj4;
        Integer num = (Integer) obj5;
        MiSnapSettings.Camera.VideoRecord videoRecord = new MiSnapSettings.Camera.VideoRecord();
        if ((i & 1) == 0) {
            videoRecord.a = null;
        } else {
            videoRecord.a = bool;
        }
        if ((i & 2) == 0) {
            videoRecord.b = null;
        } else {
            videoRecord.b = bool2;
        }
        if ((i & 4) == 0) {
            videoRecord.c = null;
        } else {
            videoRecord.c = videoQuality;
        }
        if ((i & 8) == 0) {
            videoRecord.d = null;
        } else {
            videoRecord.d = size;
        }
        if ((i & 16) == 0) {
            videoRecord.e = null;
            return videoRecord;
        }
        videoRecord.e = num;
        return videoRecord;
    }

    @Override // kotlinx.serialization.KSerializer
    public SerialDescriptor getDescriptor() {
        return a;
    }

    @Override // kotlinx.serialization.KSerializer
    public void serialize(Encoder encoder, MiSnapSettings.Camera.VideoRecord value) {
        encoder.getClass();
        value.getClass();
        SerialDescriptor descriptor = getDescriptor();
        CompositeEncoder beginStructure = encoder.beginStructure(descriptor);
        if (beginStructure.shouldEncodeElementDefault(descriptor) || value.a != null) {
            beginStructure.encodeNullableSerializableElement(descriptor, 0, BooleanSerializer.INSTANCE, value.a);
        }
        if (beginStructure.shouldEncodeElementDefault(descriptor) || value.b != null) {
            beginStructure.encodeNullableSerializableElement(descriptor, 1, BooleanSerializer.INSTANCE, value.b);
        }
        if (beginStructure.shouldEncodeElementDefault(descriptor) || value.c != null) {
            MiSnapSettings.Camera.VideoRecord.VideoQuality[] values = MiSnapSettings.Camera.VideoRecord.VideoQuality.values();
            values.getClass();
            beginStructure.encodeNullableSerializableElement(descriptor, 2, new EnumSerializer("com.miteksystems.misnap.core.MiSnapSettings.Camera.VideoRecord.VideoQuality", (Enum[]) values), value.c);
        }
        if (beginStructure.shouldEncodeElementDefault(descriptor) || value.d != null) {
            beginStructure.encodeNullableSerializableElement(descriptor, 3, MiSnapSettings.SizeSerializer.INSTANCE, value.d);
        }
        if (beginStructure.shouldEncodeElementDefault(descriptor) || value.e != null) {
            beginStructure.encodeNullableSerializableElement(descriptor, 4, IntSerializer.INSTANCE, value.e);
        }
        beginStructure.endStructure(descriptor);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public KSerializer[] typeParametersSerializers() {
        return TuplesKt.EMPTY_SERIALIZER_ARRAY;
    }
}
