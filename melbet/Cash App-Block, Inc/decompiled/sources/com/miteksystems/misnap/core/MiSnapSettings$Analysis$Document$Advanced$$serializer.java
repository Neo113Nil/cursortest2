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
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

@Deprecated
@Metadata(d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u001a\u0010\u0005\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ \u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0014\u001a\u00020\u00118VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, d2 = {"com/miteksystems/misnap/core/MiSnapSettings.Analysis.Document.Advanced.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/miteksystems/misnap/core/MiSnapSettings$Analysis$Document$Advanced;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/miteksystems/misnap/core/MiSnapSettings$Analysis$Document$Advanced;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/miteksystems/misnap/core/MiSnapSettings$Analysis$Document$Advanced;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class MiSnapSettings$Analysis$Document$Advanced$$serializer implements GeneratedSerializer {
    public static final MiSnapSettings$Analysis$Document$Advanced$$serializer INSTANCE;
    public static final /* synthetic */ PluginGeneratedSerialDescriptor a;

    static {
        MiSnapSettings$Analysis$Document$Advanced$$serializer miSnapSettings$Analysis$Document$Advanced$$serializer = new MiSnapSettings$Analysis$Document$Advanced$$serializer();
        INSTANCE = miSnapSettings$Analysis$Document$Advanced$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.miteksystems.misnap.core.MiSnapSettings.Analysis.Document.Advanced", miSnapSettings$Analysis$Document$Advanced$$serializer, 14);
        pluginGeneratedSerialDescriptor.addElement("cornerConfidence", true);
        pluginGeneratedSerialDescriptor.addElement("minPadding", true);
        pluginGeneratedSerialDescriptor.addElement("minHorizontalFillUnaligned", true);
        pluginGeneratedSerialDescriptor.addElement("minHorizontalFillAligned", true);
        pluginGeneratedSerialDescriptor.addElement("maxBrightness", true);
        pluginGeneratedSerialDescriptor.addElement("minBrightness", true);
        pluginGeneratedSerialDescriptor.addElement("minContrast", true);
        pluginGeneratedSerialDescriptor.addElement("minBusyBackground", true);
        pluginGeneratedSerialDescriptor.addElement("maxAngle", true);
        pluginGeneratedSerialDescriptor.addElement("minSharpness", true);
        pluginGeneratedSerialDescriptor.addElement("minNoGlare", true);
        pluginGeneratedSerialDescriptor.addElement("mrzConfidence", true);
        pluginGeneratedSerialDescriptor.addElement("docType", true);
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
        KSerializer nullable7 = BuiltinSerializersKt.getNullable(intSerializer);
        KSerializer nullable8 = BuiltinSerializersKt.getNullable(intSerializer);
        KSerializer nullable9 = BuiltinSerializersKt.getNullable(intSerializer);
        KSerializer nullable10 = BuiltinSerializersKt.getNullable(intSerializer);
        KSerializer nullable11 = BuiltinSerializersKt.getNullable(intSerializer);
        KSerializer nullable12 = BuiltinSerializersKt.getNullable(intSerializer);
        MiSnapSettings.Analysis.Document.Advanced.DocType[] values = MiSnapSettings.Analysis.Document.Advanced.DocType.values();
        values.getClass();
        KSerializer nullable13 = BuiltinSerializersKt.getNullable(new EnumSerializer("com.miteksystems.misnap.core.MiSnapSettings.Analysis.Document.Advanced.DocType", (Enum[]) values));
        DocumentIqaCheck[] values2 = DocumentIqaCheck.values();
        values2.getClass();
        return new KSerializer[]{nullable, nullable2, nullable3, nullable4, nullable5, nullable6, nullable7, nullable8, nullable9, nullable10, nullable11, nullable12, nullable13, BuiltinSerializersKt.getNullable(new HashSetSerializer(new EnumSerializer("com.miteksystems.misnap.core.DocumentIqaCheck", (Enum[]) values2), 1))};
    }

    @Override // kotlinx.serialization.KSerializer
    public MiSnapSettings.Analysis.Document.Advanced deserialize(Decoder decoder) {
        boolean z;
        Object obj;
        Object obj2;
        Object obj3;
        boolean z2;
        Object obj4;
        decoder.getClass();
        SerialDescriptor descriptor = getDescriptor();
        CompositeDecoder beginStructure = decoder.beginStructure(descriptor);
        Object obj5 = null;
        Object obj6 = null;
        boolean z3 = true;
        int i = 0;
        Object obj7 = null;
        Object obj8 = null;
        Object obj9 = null;
        Object obj10 = null;
        Object obj11 = null;
        Object obj12 = null;
        Object obj13 = null;
        Object obj14 = null;
        Object obj15 = null;
        Object obj16 = null;
        Object obj17 = null;
        Object obj18 = null;
        while (z3) {
            int decodeElementIndex = beginStructure.decodeElementIndex(descriptor);
            switch (decodeElementIndex) {
                case -1:
                    Object obj19 = obj8;
                    obj7 = obj7;
                    obj5 = obj5;
                    obj16 = obj16;
                    z3 = false;
                    obj6 = obj6;
                    obj18 = obj18;
                    obj17 = obj17;
                    obj8 = obj19;
                case 0:
                    boolean z4 = z3;
                    Object obj20 = obj8;
                    i |= 1;
                    obj5 = obj5;
                    obj6 = obj6;
                    obj16 = obj16;
                    obj18 = obj18;
                    obj7 = beginStructure.decodeNullableSerializableElement(descriptor, 0, IntSerializer.INSTANCE, obj7);
                    obj17 = obj17;
                    obj8 = obj20;
                    z3 = z4;
                case 1:
                    i |= 2;
                    obj5 = obj5;
                    z3 = z3;
                    obj16 = obj16;
                    obj17 = obj17;
                    obj7 = obj7;
                    obj8 = beginStructure.decodeNullableSerializableElement(descriptor, 1, IntSerializer.INSTANCE, obj8);
                case 2:
                    z = z3;
                    obj = obj7;
                    obj2 = obj8;
                    obj3 = obj17;
                    obj9 = beginStructure.decodeNullableSerializableElement(descriptor, 2, IntSerializer.INSTANCE, obj9);
                    i |= 4;
                    z3 = z;
                    obj7 = obj;
                    obj17 = obj3;
                    obj8 = obj2;
                case 3:
                    z = z3;
                    obj = obj7;
                    obj2 = obj8;
                    obj3 = obj17;
                    obj10 = beginStructure.decodeNullableSerializableElement(descriptor, 3, IntSerializer.INSTANCE, obj10);
                    i |= 8;
                    z3 = z;
                    obj7 = obj;
                    obj17 = obj3;
                    obj8 = obj2;
                case 4:
                    z = z3;
                    obj = obj7;
                    obj2 = obj8;
                    obj3 = obj17;
                    obj11 = beginStructure.decodeNullableSerializableElement(descriptor, 4, IntSerializer.INSTANCE, obj11);
                    i |= 16;
                    z3 = z;
                    obj7 = obj;
                    obj17 = obj3;
                    obj8 = obj2;
                case 5:
                    z = z3;
                    obj = obj7;
                    obj2 = obj8;
                    obj3 = obj17;
                    obj12 = beginStructure.decodeNullableSerializableElement(descriptor, 5, IntSerializer.INSTANCE, obj12);
                    i |= 32;
                    z3 = z;
                    obj7 = obj;
                    obj17 = obj3;
                    obj8 = obj2;
                case 6:
                    z = z3;
                    obj = obj7;
                    obj2 = obj8;
                    obj3 = obj17;
                    obj13 = beginStructure.decodeNullableSerializableElement(descriptor, 6, IntSerializer.INSTANCE, obj13);
                    i |= 64;
                    z3 = z;
                    obj7 = obj;
                    obj17 = obj3;
                    obj8 = obj2;
                case 7:
                    z = z3;
                    obj = obj7;
                    obj2 = obj8;
                    obj3 = obj17;
                    obj14 = beginStructure.decodeNullableSerializableElement(descriptor, 7, IntSerializer.INSTANCE, obj14);
                    i |= 128;
                    z3 = z;
                    obj7 = obj;
                    obj17 = obj3;
                    obj8 = obj2;
                case 8:
                    z = z3;
                    obj = obj7;
                    obj2 = obj8;
                    obj3 = obj17;
                    obj15 = beginStructure.decodeNullableSerializableElement(descriptor, 8, IntSerializer.INSTANCE, obj15);
                    i |= 256;
                    z3 = z;
                    obj7 = obj;
                    obj17 = obj3;
                    obj8 = obj2;
                case 9:
                    z = z3;
                    obj = obj7;
                    obj2 = obj8;
                    obj3 = obj17;
                    obj6 = beginStructure.decodeNullableSerializableElement(descriptor, 9, IntSerializer.INSTANCE, obj6);
                    i |= 512;
                    z3 = z;
                    obj7 = obj;
                    obj17 = obj3;
                    obj8 = obj2;
                case 10:
                    z = z3;
                    obj = obj7;
                    obj2 = obj8;
                    obj3 = obj17;
                    obj5 = beginStructure.decodeNullableSerializableElement(descriptor, 10, IntSerializer.INSTANCE, obj5);
                    i |= 1024;
                    z3 = z;
                    obj7 = obj;
                    obj17 = obj3;
                    obj8 = obj2;
                case 11:
                    z = z3;
                    obj = obj7;
                    obj2 = obj8;
                    obj3 = obj17;
                    obj16 = beginStructure.decodeNullableSerializableElement(descriptor, 11, IntSerializer.INSTANCE, obj16);
                    i |= 2048;
                    obj18 = obj18;
                    z3 = z;
                    obj7 = obj;
                    obj17 = obj3;
                    obj8 = obj2;
                case 12:
                    z2 = z3;
                    obj4 = obj7;
                    obj2 = obj8;
                    MiSnapSettings.Analysis.Document.Advanced.DocType[] values = MiSnapSettings.Analysis.Document.Advanced.DocType.values();
                    values.getClass();
                    obj17 = beginStructure.decodeNullableSerializableElement(descriptor, 12, new EnumSerializer("com.miteksystems.misnap.core.MiSnapSettings.Analysis.Document.Advanced.DocType", (Enum[]) values), obj17);
                    i |= 4096;
                    z3 = z2;
                    obj7 = obj4;
                    obj8 = obj2;
                case 13:
                    z2 = z3;
                    DocumentIqaCheck[] values2 = DocumentIqaCheck.values();
                    values2.getClass();
                    obj4 = obj7;
                    obj2 = obj8;
                    obj18 = beginStructure.decodeNullableSerializableElement(descriptor, 13, new HashSetSerializer(new EnumSerializer("com.miteksystems.misnap.core.DocumentIqaCheck", (Enum[]) values2), 1), obj18);
                    i |= PKIFailureInfo.certRevoked;
                    z3 = z2;
                    obj7 = obj4;
                    obj8 = obj2;
                default:
                    LocalPresenterModule$Companion$$ExternalSyntheticLambda0.m(decodeElementIndex);
                    return null;
            }
        }
        Object obj21 = obj8;
        beginStructure.endStructure(descriptor);
        Integer num = (Integer) obj7;
        Integer num2 = (Integer) obj21;
        Integer num3 = (Integer) obj9;
        Integer num4 = (Integer) obj10;
        Integer num5 = (Integer) obj11;
        Integer num6 = (Integer) obj12;
        Integer num7 = (Integer) obj13;
        Integer num8 = (Integer) obj14;
        Integer num9 = (Integer) obj15;
        Integer num10 = (Integer) obj6;
        Integer num11 = (Integer) obj5;
        Integer num12 = (Integer) obj16;
        MiSnapSettings.Analysis.Document.Advanced.DocType docType = (MiSnapSettings.Analysis.Document.Advanced.DocType) obj17;
        List list = (List) obj18;
        MiSnapSettings.Analysis.Document.Advanced advanced = new MiSnapSettings.Analysis.Document.Advanced();
        if ((i & 1) == 0) {
            advanced.a = null;
        } else {
            advanced.a = num;
        }
        if ((i & 2) == 0) {
            advanced.b = null;
        } else {
            advanced.b = num2;
        }
        if ((i & 4) == 0) {
            advanced.c = null;
        } else {
            advanced.c = num3;
        }
        if ((i & 8) == 0) {
            advanced.d = null;
        } else {
            advanced.d = num4;
        }
        if ((i & 16) == 0) {
            advanced.e = null;
        } else {
            advanced.e = num5;
        }
        if ((i & 32) == 0) {
            advanced.f = null;
        } else {
            advanced.f = num6;
        }
        if ((i & 64) == 0) {
            advanced.g = null;
        } else {
            advanced.g = num7;
        }
        if ((i & 128) == 0) {
            advanced.h = null;
        } else {
            advanced.h = num8;
        }
        if ((i & 256) == 0) {
            advanced.i = null;
        } else {
            advanced.i = num9;
        }
        if ((i & 512) == 0) {
            advanced.j = null;
        } else {
            advanced.j = num10;
        }
        if ((i & 1024) == 0) {
            advanced.k = null;
        } else {
            advanced.k = num11;
        }
        if ((i & 2048) == 0) {
            advanced.l = null;
        } else {
            advanced.l = num12;
        }
        if ((i & 4096) == 0) {
            advanced.m = null;
        } else {
            advanced.m = docType;
        }
        if ((i & PKIFailureInfo.certRevoked) == 0) {
            advanced.n = null;
            return advanced;
        }
        advanced.n = list;
        return advanced;
    }

    @Override // kotlinx.serialization.KSerializer
    public SerialDescriptor getDescriptor() {
        return a;
    }

    @Override // kotlinx.serialization.KSerializer
    public void serialize(Encoder encoder, MiSnapSettings.Analysis.Document.Advanced value) {
        encoder.getClass();
        value.getClass();
        SerialDescriptor descriptor = getDescriptor();
        CompositeEncoder beginStructure = encoder.beginStructure(descriptor);
        if (beginStructure.shouldEncodeElementDefault(descriptor) || value.a != null) {
            beginStructure.encodeNullableSerializableElement(descriptor, 0, IntSerializer.INSTANCE, value.a);
        }
        if (beginStructure.shouldEncodeElementDefault(descriptor) || value.b != null) {
            beginStructure.encodeNullableSerializableElement(descriptor, 1, IntSerializer.INSTANCE, value.b);
        }
        if (beginStructure.shouldEncodeElementDefault(descriptor) || value.c != null) {
            beginStructure.encodeNullableSerializableElement(descriptor, 2, IntSerializer.INSTANCE, value.c);
        }
        if (beginStructure.shouldEncodeElementDefault(descriptor) || value.d != null) {
            beginStructure.encodeNullableSerializableElement(descriptor, 3, IntSerializer.INSTANCE, value.d);
        }
        if (beginStructure.shouldEncodeElementDefault(descriptor) || value.e != null) {
            beginStructure.encodeNullableSerializableElement(descriptor, 4, IntSerializer.INSTANCE, value.e);
        }
        if (beginStructure.shouldEncodeElementDefault(descriptor) || value.f != null) {
            beginStructure.encodeNullableSerializableElement(descriptor, 5, IntSerializer.INSTANCE, value.f);
        }
        if (beginStructure.shouldEncodeElementDefault(descriptor) || value.g != null) {
            beginStructure.encodeNullableSerializableElement(descriptor, 6, IntSerializer.INSTANCE, value.g);
        }
        if (beginStructure.shouldEncodeElementDefault(descriptor) || value.h != null) {
            beginStructure.encodeNullableSerializableElement(descriptor, 7, IntSerializer.INSTANCE, value.h);
        }
        if (beginStructure.shouldEncodeElementDefault(descriptor) || value.i != null) {
            beginStructure.encodeNullableSerializableElement(descriptor, 8, IntSerializer.INSTANCE, value.i);
        }
        if (beginStructure.shouldEncodeElementDefault(descriptor) || value.j != null) {
            beginStructure.encodeNullableSerializableElement(descriptor, 9, IntSerializer.INSTANCE, value.j);
        }
        if (beginStructure.shouldEncodeElementDefault(descriptor) || value.k != null) {
            beginStructure.encodeNullableSerializableElement(descriptor, 10, IntSerializer.INSTANCE, value.k);
        }
        if (beginStructure.shouldEncodeElementDefault(descriptor) || value.l != null) {
            beginStructure.encodeNullableSerializableElement(descriptor, 11, IntSerializer.INSTANCE, value.l);
        }
        if (beginStructure.shouldEncodeElementDefault(descriptor) || value.m != null) {
            MiSnapSettings.Analysis.Document.Advanced.DocType[] values = MiSnapSettings.Analysis.Document.Advanced.DocType.values();
            values.getClass();
            beginStructure.encodeNullableSerializableElement(descriptor, 12, new EnumSerializer("com.miteksystems.misnap.core.MiSnapSettings.Analysis.Document.Advanced.DocType", (Enum[]) values), value.m);
        }
        if (beginStructure.shouldEncodeElementDefault(descriptor) || value.n != null) {
            DocumentIqaCheck[] values2 = DocumentIqaCheck.values();
            values2.getClass();
            beginStructure.encodeNullableSerializableElement(descriptor, 13, new HashSetSerializer(new EnumSerializer("com.miteksystems.misnap.core.DocumentIqaCheck", (Enum[]) values2), 1), value.n);
        }
        beginStructure.endStructure(descriptor);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public KSerializer[] typeParametersSerializers() {
        return TuplesKt.EMPTY_SERIALIZER_ARRAY;
    }
}
