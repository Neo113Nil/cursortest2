package com.miteksystems.misnap.core;

import app.cash.local.presenters.LocalPresenterModule$Companion$$ExternalSyntheticLambda0;
import com.miteksystems.misnap.core.MiSnapSettings;
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
import kotlinx.serialization.internal.EnumSerializer;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.HashSetSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.TuplesKt;

@Metadata(d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u001a\u0010\u0005\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ \u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0014\u001a\u00020\u00118VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, d2 = {"com/miteksystems/misnap/core/MiSnapSettings.Analysis.Face.Advanced.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/miteksystems/misnap/core/MiSnapSettings$Analysis$Face$Advanced;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/miteksystems/misnap/core/MiSnapSettings$Analysis$Face$Advanced;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/miteksystems/misnap/core/MiSnapSettings$Analysis$Face$Advanced;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@Deprecated
/* loaded from: classes4.dex */
public final class MiSnapSettings$Analysis$Face$Advanced$$serializer implements GeneratedSerializer {
    public static final MiSnapSettings$Analysis$Face$Advanced$$serializer INSTANCE;
    public static final /* synthetic */ PluginGeneratedSerialDescriptor a;

    static {
        MiSnapSettings$Analysis$Face$Advanced$$serializer miSnapSettings$Analysis$Face$Advanced$$serializer = new MiSnapSettings$Analysis$Face$Advanced$$serializer();
        INSTANCE = miSnapSettings$Analysis$Face$Advanced$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.miteksystems.misnap.core.MiSnapSettings.Analysis.Face.Advanced", miSnapSettings$Analysis$Face$Advanced$$serializer, 7);
        pluginGeneratedSerialDescriptor.addElement("minHorizontalFill", true);
        pluginGeneratedSerialDescriptor.addElement("minPadding", true);
        pluginGeneratedSerialDescriptor.addElement("maxAngle", true);
        pluginGeneratedSerialDescriptor.addElement("minSmileConfidence", true);
        pluginGeneratedSerialDescriptor.addElement("minEyesOpenConfidence", true);
        pluginGeneratedSerialDescriptor.addElement("triggerDelay", true);
        pluginGeneratedSerialDescriptor.addElement("prioritizedIqaChecks", true);
        a = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public KSerializer[] childSerializers() {
        IntSerializer intSerializer = IntSerializer.INSTANCE;
        KSerializer nullable = BuiltinSerializersKt.getNullable(intSerializer);
        KSerializer nullable2 = BuiltinSerializersKt.getNullable(intSerializer);
        KSerializer nullable3 = BuiltinSerializersKt.getNullable(intSerializer);
        KSerializer nullable4 = BuiltinSerializersKt.getNullable(intSerializer);
        KSerializer nullable5 = BuiltinSerializersKt.getNullable(intSerializer);
        KSerializer nullable6 = BuiltinSerializersKt.getNullable(intSerializer);
        FaceIqaCheck[] values = FaceIqaCheck.values();
        values.getClass();
        return new KSerializer[]{nullable, nullable2, nullable3, nullable4, nullable5, nullable6, BuiltinSerializersKt.getNullable(new HashSetSerializer(new EnumSerializer("com.miteksystems.misnap.core.FaceIqaCheck", (Enum[]) values), 1))};
    }

    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Integer, java.util.List] */
    /* JADX WARN: Type inference failed for: r1v5 */
    @Override // kotlinx.serialization.KSerializer
    public MiSnapSettings.Analysis.Face.Advanced deserialize(Decoder decoder) {
        ?? r1;
        decoder.getClass();
        SerialDescriptor descriptor = getDescriptor();
        CompositeDecoder beginStructure = decoder.beginStructure(descriptor);
        MiSnapSettings.Analysis.Face.Advanced advanced = null;
        boolean z = true;
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        Object obj4 = null;
        Object obj5 = null;
        Object obj6 = null;
        Object obj7 = null;
        int i = 0;
        while (z) {
            int decodeElementIndex = beginStructure.decodeElementIndex(descriptor);
            switch (decodeElementIndex) {
                case -1:
                    z = false;
                    break;
                case 0:
                    obj = beginStructure.decodeNullableSerializableElement(descriptor, 0, IntSerializer.INSTANCE, obj);
                    i |= 1;
                    break;
                case 1:
                    obj2 = beginStructure.decodeNullableSerializableElement(descriptor, 1, IntSerializer.INSTANCE, obj2);
                    i |= 2;
                    break;
                case 2:
                    obj3 = beginStructure.decodeNullableSerializableElement(descriptor, 2, IntSerializer.INSTANCE, obj3);
                    i |= 4;
                    break;
                case 3:
                    obj4 = beginStructure.decodeNullableSerializableElement(descriptor, 3, IntSerializer.INSTANCE, obj4);
                    i |= 8;
                    break;
                case 4:
                    obj5 = beginStructure.decodeNullableSerializableElement(descriptor, 4, IntSerializer.INSTANCE, obj5);
                    i |= 16;
                    break;
                case 5:
                    obj6 = beginStructure.decodeNullableSerializableElement(descriptor, 5, IntSerializer.INSTANCE, obj6);
                    i |= 32;
                    break;
                case 6:
                    FaceIqaCheck[] values = FaceIqaCheck.values();
                    values.getClass();
                    obj7 = beginStructure.decodeNullableSerializableElement(descriptor, 6, new HashSetSerializer(new EnumSerializer("com.miteksystems.misnap.core.FaceIqaCheck", (Enum[]) values), 1), obj7);
                    i |= 64;
                    break;
                default:
                    LocalPresenterModule$Companion$$ExternalSyntheticLambda0.m(decodeElementIndex);
                    return advanced;
            }
            advanced = null;
        }
        beginStructure.endStructure(descriptor);
        Integer num = (Integer) obj;
        Integer num2 = (Integer) obj2;
        Integer num3 = (Integer) obj3;
        Integer num4 = (Integer) obj4;
        Integer num5 = (Integer) obj5;
        Integer num6 = (Integer) obj6;
        List list = (List) obj7;
        MiSnapSettings.Analysis.Face.Advanced advanced2 = new MiSnapSettings.Analysis.Face.Advanced();
        if ((i & 1) == 0) {
            r1 = 0;
            advanced2.a = null;
        } else {
            r1 = 0;
            advanced2.a = num;
        }
        if ((i & 2) == 0) {
            advanced2.b = r1;
        } else {
            advanced2.b = num2;
        }
        if ((i & 4) == 0) {
            advanced2.c = r1;
        } else {
            advanced2.c = num3;
        }
        if ((i & 8) == 0) {
            advanced2.d = r1;
        } else {
            advanced2.d = num4;
        }
        if ((i & 16) == 0) {
            advanced2.e = r1;
        } else {
            advanced2.e = num5;
        }
        if ((i & 32) == 0) {
            advanced2.f = r1;
        } else {
            advanced2.f = num6;
        }
        if ((i & 64) == 0) {
            advanced2.g = r1;
            return advanced2;
        }
        advanced2.g = list;
        return advanced2;
    }

    @Override // kotlinx.serialization.KSerializer
    public SerialDescriptor getDescriptor() {
        return a;
    }

    @Override // kotlinx.serialization.KSerializer
    public void serialize(Encoder encoder, MiSnapSettings.Analysis.Face.Advanced value) {
        encoder.getClass();
        value.getClass();
        SerialDescriptor descriptor = getDescriptor();
        CompositeEncoder beginStructure = encoder.beginStructure(descriptor);
        List list = value.g;
        Integer num = value.f;
        Integer num2 = value.e;
        Integer num3 = value.d;
        Integer num4 = value.c;
        Integer num5 = value.b;
        Integer num6 = value.a;
        if (beginStructure.shouldEncodeElementDefault(descriptor) || num6 != null) {
            beginStructure.encodeNullableSerializableElement(descriptor, 0, IntSerializer.INSTANCE, num6);
        }
        if (beginStructure.shouldEncodeElementDefault(descriptor) || num5 != null) {
            beginStructure.encodeNullableSerializableElement(descriptor, 1, IntSerializer.INSTANCE, num5);
        }
        if (beginStructure.shouldEncodeElementDefault(descriptor) || num4 != null) {
            beginStructure.encodeNullableSerializableElement(descriptor, 2, IntSerializer.INSTANCE, num4);
        }
        if (beginStructure.shouldEncodeElementDefault(descriptor) || num3 != null) {
            beginStructure.encodeNullableSerializableElement(descriptor, 3, IntSerializer.INSTANCE, num3);
        }
        if (beginStructure.shouldEncodeElementDefault(descriptor) || num2 != null) {
            beginStructure.encodeNullableSerializableElement(descriptor, 4, IntSerializer.INSTANCE, num2);
        }
        if (beginStructure.shouldEncodeElementDefault(descriptor) || num != null) {
            beginStructure.encodeNullableSerializableElement(descriptor, 5, IntSerializer.INSTANCE, num);
        }
        if (beginStructure.shouldEncodeElementDefault(descriptor) || list != null) {
            FaceIqaCheck[] values = FaceIqaCheck.values();
            values.getClass();
            beginStructure.encodeNullableSerializableElement(descriptor, 6, new HashSetSerializer(new EnumSerializer("com.miteksystems.misnap.core.FaceIqaCheck", (Enum[]) values), 1), list);
        }
        beginStructure.endStructure(descriptor);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public KSerializer[] typeParametersSerializers() {
        return TuplesKt.EMPTY_SERIALIZER_ARRAY;
    }
}
