package com.miteksystems.misnap.core;

import app.cash.local.presenters.LocalPresenterModule$Companion$$ExternalSyntheticLambda0;
import com.miteksystems.misnap.core.MiSnapSettings;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
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
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.TuplesKt;

@Deprecated
@Metadata(d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u001a\u0010\u0005\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ \u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0014\u001a\u00020\u00118VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, d2 = {"com/miteksystems/misnap/core/MiSnapSettings.Analysis.Document.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/miteksystems/misnap/core/MiSnapSettings$Analysis$Document;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/miteksystems/misnap/core/MiSnapSettings$Analysis$Document;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/miteksystems/misnap/core/MiSnapSettings$Analysis$Document;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class MiSnapSettings$Analysis$Document$$serializer implements GeneratedSerializer {
    public static final MiSnapSettings$Analysis$Document$$serializer INSTANCE;
    public static final /* synthetic */ PluginGeneratedSerialDescriptor a;

    static {
        MiSnapSettings$Analysis$Document$$serializer miSnapSettings$Analysis$Document$$serializer = new MiSnapSettings$Analysis$Document$$serializer();
        INSTANCE = miSnapSettings$Analysis$Document$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.miteksystems.misnap.core.MiSnapSettings.Analysis.Document", miSnapSettings$Analysis$Document$$serializer, 11);
        pluginGeneratedSerialDescriptor.addElement("advanced", true);
        pluginGeneratedSerialDescriptor.addElement("check", true);
        pluginGeneratedSerialDescriptor.addElement("documentExtractionRequirement", true);
        pluginGeneratedSerialDescriptor.addElement("prioritizeDocumentExtractionOverImageQuality", true);
        pluginGeneratedSerialDescriptor.addElement("barcodeExtractionRequirement", true);
        pluginGeneratedSerialDescriptor.addElement("orientation", true);
        pluginGeneratedSerialDescriptor.addElement("trigger", true);
        pluginGeneratedSerialDescriptor.addElement("redactOptionalData", true);
        pluginGeneratedSerialDescriptor.addElement("enableEnhancedManual", true);
        pluginGeneratedSerialDescriptor.addElement("enableDocumentClassification", true);
        pluginGeneratedSerialDescriptor.addElement("enableFocusOnFinalFrame", true);
        a = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public KSerializer[] childSerializers() {
        MiSnapSettings.Analysis.Document.ExtractionRequirement[] values = MiSnapSettings.Analysis.Document.ExtractionRequirement.values();
        values.getClass();
        KSerializer nullable = BuiltinSerializersKt.getNullable(new EnumSerializer("com.miteksystems.misnap.core.MiSnapSettings.Analysis.Document.ExtractionRequirement", (Enum[]) values));
        BooleanSerializer booleanSerializer = BooleanSerializer.INSTANCE;
        KSerializer nullable2 = BuiltinSerializersKt.getNullable(booleanSerializer);
        MiSnapSettings.Analysis.Document.ExtractionRequirement[] values2 = MiSnapSettings.Analysis.Document.ExtractionRequirement.values();
        values2.getClass();
        KSerializer nullable3 = BuiltinSerializersKt.getNullable(new EnumSerializer("com.miteksystems.misnap.core.MiSnapSettings.Analysis.Document.ExtractionRequirement", (Enum[]) values2));
        MiSnapSettings.Analysis.Document.Orientation[] values3 = MiSnapSettings.Analysis.Document.Orientation.values();
        values3.getClass();
        KSerializer nullable4 = BuiltinSerializersKt.getNullable(new EnumSerializer("com.miteksystems.misnap.core.MiSnapSettings.Analysis.Document.Orientation", (Enum[]) values3));
        MiSnapSettings.Analysis.Document.Trigger[] values4 = MiSnapSettings.Analysis.Document.Trigger.values();
        values4.getClass();
        return new KSerializer[]{MiSnapSettings$Analysis$Document$Advanced$$serializer.INSTANCE, MiSnapSettings$Analysis$Document$Check$$serializer.INSTANCE, nullable, nullable2, nullable3, nullable4, BuiltinSerializersKt.getNullable(new EnumSerializer("com.miteksystems.misnap.core.MiSnapSettings.Analysis.Document.Trigger", (Enum[]) values4)), BuiltinSerializersKt.getNullable(booleanSerializer), BuiltinSerializersKt.getNullable(booleanSerializer), BuiltinSerializersKt.getNullable(booleanSerializer), BuiltinSerializersKt.getNullable(booleanSerializer)};
    }

    @Override // kotlinx.serialization.KSerializer
    public MiSnapSettings.Analysis.Document deserialize(Decoder decoder) {
        boolean z;
        Object obj;
        boolean z2;
        decoder.getClass();
        SerialDescriptor descriptor = getDescriptor();
        CompositeDecoder beginStructure = decoder.beginStructure(descriptor);
        Object obj2 = null;
        Object obj3 = null;
        boolean z3 = true;
        Object obj4 = null;
        int i = 0;
        Object obj5 = null;
        Object obj6 = null;
        Object obj7 = null;
        Object obj8 = null;
        Object obj9 = null;
        Object obj10 = null;
        Object obj11 = null;
        Object obj12 = null;
        while (z3) {
            int decodeElementIndex = beginStructure.decodeElementIndex(descriptor);
            switch (decodeElementIndex) {
                case -1:
                    z3 = false;
                case 0:
                    obj = obj2;
                    z2 = z3;
                    obj4 = beginStructure.decodeSerializableElement(descriptor, 0, MiSnapSettings$Analysis$Document$Advanced$$serializer.INSTANCE, obj4);
                    i |= 1;
                    z3 = z2;
                    obj2 = obj;
                case 1:
                    obj = obj2;
                    obj5 = beginStructure.decodeSerializableElement(descriptor, 1, MiSnapSettings$Analysis$Document$Check$$serializer.INSTANCE, obj5);
                    i |= 2;
                    obj2 = obj;
                case 2:
                    obj = obj2;
                    z2 = z3;
                    MiSnapSettings.Analysis.Document.ExtractionRequirement[] values = MiSnapSettings.Analysis.Document.ExtractionRequirement.values();
                    values.getClass();
                    obj6 = beginStructure.decodeNullableSerializableElement(descriptor, 2, new EnumSerializer("com.miteksystems.misnap.core.MiSnapSettings.Analysis.Document.ExtractionRequirement", (Enum[]) values), obj6);
                    i |= 4;
                    z3 = z2;
                    obj2 = obj;
                case 3:
                    obj = obj2;
                    obj7 = beginStructure.decodeNullableSerializableElement(descriptor, 3, BooleanSerializer.INSTANCE, obj7);
                    i |= 8;
                    obj2 = obj;
                case 4:
                    obj = obj2;
                    z2 = z3;
                    MiSnapSettings.Analysis.Document.ExtractionRequirement[] values2 = MiSnapSettings.Analysis.Document.ExtractionRequirement.values();
                    values2.getClass();
                    obj8 = beginStructure.decodeNullableSerializableElement(descriptor, 4, new EnumSerializer("com.miteksystems.misnap.core.MiSnapSettings.Analysis.Document.ExtractionRequirement", (Enum[]) values2), obj8);
                    i |= 16;
                    z3 = z2;
                    obj2 = obj;
                case 5:
                    obj = obj2;
                    z2 = z3;
                    MiSnapSettings.Analysis.Document.Orientation[] values3 = MiSnapSettings.Analysis.Document.Orientation.values();
                    values3.getClass();
                    obj9 = beginStructure.decodeNullableSerializableElement(descriptor, 5, new EnumSerializer("com.miteksystems.misnap.core.MiSnapSettings.Analysis.Document.Orientation", (Enum[]) values3), obj9);
                    i |= 32;
                    z3 = z2;
                    obj2 = obj;
                case 6:
                    z2 = z3;
                    MiSnapSettings.Analysis.Document.Trigger[] values4 = MiSnapSettings.Analysis.Document.Trigger.values();
                    values4.getClass();
                    obj = obj2;
                    obj10 = beginStructure.decodeNullableSerializableElement(descriptor, 6, new EnumSerializer("com.miteksystems.misnap.core.MiSnapSettings.Analysis.Document.Trigger", (Enum[]) values4), obj10);
                    i |= 64;
                    z3 = z2;
                    obj2 = obj;
                case 7:
                    z = z3;
                    obj11 = beginStructure.decodeNullableSerializableElement(descriptor, 7, BooleanSerializer.INSTANCE, obj11);
                    i |= 128;
                    z3 = z;
                case 8:
                    z = z3;
                    obj12 = beginStructure.decodeNullableSerializableElement(descriptor, 8, BooleanSerializer.INSTANCE, obj12);
                    i |= 256;
                    z3 = z;
                case 9:
                    z = z3;
                    obj3 = beginStructure.decodeNullableSerializableElement(descriptor, 9, BooleanSerializer.INSTANCE, obj3);
                    i |= 512;
                    z3 = z;
                case 10:
                    z = z3;
                    obj2 = beginStructure.decodeNullableSerializableElement(descriptor, 10, BooleanSerializer.INSTANCE, obj2);
                    i |= 1024;
                    z3 = z;
                default:
                    LocalPresenterModule$Companion$$ExternalSyntheticLambda0.m(decodeElementIndex);
                    return null;
            }
        }
        beginStructure.endStructure(descriptor);
        return new MiSnapSettings.Analysis.Document(i, (MiSnapSettings.Analysis.Document.Advanced) obj4, (MiSnapSettings.Analysis.Document.Check) obj5, (MiSnapSettings.Analysis.Document.ExtractionRequirement) obj6, (Boolean) obj7, (MiSnapSettings.Analysis.Document.ExtractionRequirement) obj8, (MiSnapSettings.Analysis.Document.Orientation) obj9, (MiSnapSettings.Analysis.Document.Trigger) obj10, (Boolean) obj11, (Boolean) obj12, (Boolean) obj3, (Boolean) obj2);
    }

    @Override // kotlinx.serialization.KSerializer
    public SerialDescriptor getDescriptor() {
        return a;
    }

    @Override // kotlinx.serialization.KSerializer
    public void serialize(Encoder encoder, MiSnapSettings.Analysis.Document value) {
        encoder.getClass();
        value.getClass();
        SerialDescriptor descriptor = getDescriptor();
        CompositeEncoder beginStructure = encoder.beginStructure(descriptor);
        Boolean bool = value.h;
        Boolean bool2 = value.g;
        Boolean bool3 = value.f;
        MiSnapSettings.Analysis.Document.Orientation orientation = value.d;
        MiSnapSettings.Analysis.Document.ExtractionRequirement extractionRequirement = value.c;
        Boolean bool4 = value.b;
        MiSnapSettings.Analysis.Document.Check check = value.check;
        MiSnapSettings.Analysis.Document.Advanced advanced = value.advanced;
        if (beginStructure.shouldEncodeElementDefault(descriptor) || !Intrinsics.areEqual(advanced, new MiSnapSettings.Analysis.Document.Advanced())) {
            beginStructure.encodeSerializableElement(descriptor, 0, MiSnapSettings$Analysis$Document$Advanced$$serializer.INSTANCE, advanced);
        }
        if (beginStructure.shouldEncodeElementDefault(descriptor) || !Intrinsics.areEqual(check, new MiSnapSettings.Analysis.Document.Check())) {
            beginStructure.encodeSerializableElement(descriptor, 1, MiSnapSettings$Analysis$Document$Check$$serializer.INSTANCE, check);
        }
        if (beginStructure.shouldEncodeElementDefault(descriptor) || value.a != null) {
            MiSnapSettings.Analysis.Document.ExtractionRequirement[] values = MiSnapSettings.Analysis.Document.ExtractionRequirement.values();
            values.getClass();
            beginStructure.encodeNullableSerializableElement(descriptor, 2, new EnumSerializer("com.miteksystems.misnap.core.MiSnapSettings.Analysis.Document.ExtractionRequirement", (Enum[]) values), value.a);
        }
        if (beginStructure.shouldEncodeElementDefault(descriptor) || bool4 != null) {
            beginStructure.encodeNullableSerializableElement(descriptor, 3, BooleanSerializer.INSTANCE, bool4);
        }
        if (beginStructure.shouldEncodeElementDefault(descriptor) || extractionRequirement != null) {
            MiSnapSettings.Analysis.Document.ExtractionRequirement[] values2 = MiSnapSettings.Analysis.Document.ExtractionRequirement.values();
            values2.getClass();
            beginStructure.encodeNullableSerializableElement(descriptor, 4, new EnumSerializer("com.miteksystems.misnap.core.MiSnapSettings.Analysis.Document.ExtractionRequirement", (Enum[]) values2), extractionRequirement);
        }
        if (beginStructure.shouldEncodeElementDefault(descriptor) || orientation != null) {
            MiSnapSettings.Analysis.Document.Orientation[] values3 = MiSnapSettings.Analysis.Document.Orientation.values();
            values3.getClass();
            beginStructure.encodeNullableSerializableElement(descriptor, 5, new EnumSerializer("com.miteksystems.misnap.core.MiSnapSettings.Analysis.Document.Orientation", (Enum[]) values3), orientation);
        }
        if (beginStructure.shouldEncodeElementDefault(descriptor) || value.e != null) {
            MiSnapSettings.Analysis.Document.Trigger[] values4 = MiSnapSettings.Analysis.Document.Trigger.values();
            values4.getClass();
            beginStructure.encodeNullableSerializableElement(descriptor, 6, new EnumSerializer("com.miteksystems.misnap.core.MiSnapSettings.Analysis.Document.Trigger", (Enum[]) values4), value.e);
        }
        if (beginStructure.shouldEncodeElementDefault(descriptor) || bool3 != null) {
            beginStructure.encodeNullableSerializableElement(descriptor, 7, BooleanSerializer.INSTANCE, bool3);
        }
        if (beginStructure.shouldEncodeElementDefault(descriptor) || bool2 != null) {
            beginStructure.encodeNullableSerializableElement(descriptor, 8, BooleanSerializer.INSTANCE, bool2);
        }
        if (beginStructure.shouldEncodeElementDefault(descriptor) || bool != null) {
            beginStructure.encodeNullableSerializableElement(descriptor, 9, BooleanSerializer.INSTANCE, bool);
        }
        if (beginStructure.shouldEncodeElementDefault(descriptor) || value.i != null) {
            beginStructure.encodeNullableSerializableElement(descriptor, 10, BooleanSerializer.INSTANCE, value.i);
        }
        beginStructure.endStructure(descriptor);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public KSerializer[] typeParametersSerializers() {
        return TuplesKt.EMPTY_SERIALIZER_ARRAY;
    }
}
