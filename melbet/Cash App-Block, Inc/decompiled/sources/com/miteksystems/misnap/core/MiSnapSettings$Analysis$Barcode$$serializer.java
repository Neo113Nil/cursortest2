package com.miteksystems.misnap.core;

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
import kotlinx.serialization.internal.EnumSerializer;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.TuplesKt;

@Metadata(d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u001a\u0010\u0005\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ \u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0014\u001a\u00020\u00118VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, d2 = {"com/miteksystems/misnap/core/MiSnapSettings.Analysis.Barcode.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/miteksystems/misnap/core/MiSnapSettings$Analysis$Barcode;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/miteksystems/misnap/core/MiSnapSettings$Analysis$Barcode;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/miteksystems/misnap/core/MiSnapSettings$Analysis$Barcode;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@Deprecated
/* loaded from: classes4.dex */
public final class MiSnapSettings$Analysis$Barcode$$serializer implements GeneratedSerializer {
    public static final MiSnapSettings$Analysis$Barcode$$serializer INSTANCE;
    public static final /* synthetic */ PluginGeneratedSerialDescriptor a;

    static {
        MiSnapSettings$Analysis$Barcode$$serializer miSnapSettings$Analysis$Barcode$$serializer = new MiSnapSettings$Analysis$Barcode$$serializer();
        INSTANCE = miSnapSettings$Analysis$Barcode$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.miteksystems.misnap.core.MiSnapSettings.Analysis.Barcode", miSnapSettings$Analysis$Barcode$$serializer, 4);
        pluginGeneratedSerialDescriptor.addElement("scanSpeed", true);
        pluginGeneratedSerialDescriptor.addElement("type", true);
        pluginGeneratedSerialDescriptor.addElement("orientation", true);
        pluginGeneratedSerialDescriptor.addElement("trigger", true);
        a = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public KSerializer[] childSerializers() {
        MiSnapSettings.Analysis.Barcode.ScanSpeed[] values = MiSnapSettings.Analysis.Barcode.ScanSpeed.values();
        values.getClass();
        KSerializer nullable = BuiltinSerializersKt.getNullable(new EnumSerializer("com.miteksystems.misnap.core.MiSnapSettings.Analysis.Barcode.ScanSpeed", (Enum[]) values));
        KSerializer nullable2 = BuiltinSerializersKt.getNullable(IntSerializer.INSTANCE);
        MiSnapSettings.Analysis.Barcode.Orientation[] values2 = MiSnapSettings.Analysis.Barcode.Orientation.values();
        values2.getClass();
        KSerializer nullable3 = BuiltinSerializersKt.getNullable(new EnumSerializer("com.miteksystems.misnap.core.MiSnapSettings.Analysis.Barcode.Orientation", (Enum[]) values2));
        MiSnapSettings.Analysis.Barcode.Trigger[] values3 = MiSnapSettings.Analysis.Barcode.Trigger.values();
        values3.getClass();
        return new KSerializer[]{nullable, nullable2, nullable3, BuiltinSerializersKt.getNullable(new EnumSerializer("com.miteksystems.misnap.core.MiSnapSettings.Analysis.Barcode.Trigger", (Enum[]) values3))};
    }

    @Override // kotlinx.serialization.KSerializer
    public MiSnapSettings.Analysis.Barcode deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor descriptor = getDescriptor();
        CompositeDecoder beginStructure = decoder.beginStructure(descriptor);
        boolean z = true;
        int i = 0;
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        Object obj4 = null;
        while (z) {
            int decodeElementIndex = beginStructure.decodeElementIndex(descriptor);
            if (decodeElementIndex == -1) {
                z = false;
            } else if (decodeElementIndex == 0) {
                MiSnapSettings.Analysis.Barcode.ScanSpeed[] values = MiSnapSettings.Analysis.Barcode.ScanSpeed.values();
                values.getClass();
                obj = beginStructure.decodeNullableSerializableElement(descriptor, 0, new EnumSerializer("com.miteksystems.misnap.core.MiSnapSettings.Analysis.Barcode.ScanSpeed", (Enum[]) values), obj);
                i |= 1;
            } else if (decodeElementIndex == 1) {
                obj2 = beginStructure.decodeNullableSerializableElement(descriptor, 1, IntSerializer.INSTANCE, obj2);
                i |= 2;
            } else if (decodeElementIndex == 2) {
                MiSnapSettings.Analysis.Barcode.Orientation[] values2 = MiSnapSettings.Analysis.Barcode.Orientation.values();
                values2.getClass();
                obj3 = beginStructure.decodeNullableSerializableElement(descriptor, 2, new EnumSerializer("com.miteksystems.misnap.core.MiSnapSettings.Analysis.Barcode.Orientation", (Enum[]) values2), obj3);
                i |= 4;
            } else {
                if (decodeElementIndex != 3) {
                    LocalPresenterModule$Companion$$ExternalSyntheticLambda0.m(decodeElementIndex);
                    return null;
                }
                MiSnapSettings.Analysis.Barcode.Trigger[] values3 = MiSnapSettings.Analysis.Barcode.Trigger.values();
                values3.getClass();
                obj4 = beginStructure.decodeNullableSerializableElement(descriptor, 3, new EnumSerializer("com.miteksystems.misnap.core.MiSnapSettings.Analysis.Barcode.Trigger", (Enum[]) values3), obj4);
                i |= 8;
            }
        }
        beginStructure.endStructure(descriptor);
        MiSnapSettings.Analysis.Barcode.ScanSpeed scanSpeed = (MiSnapSettings.Analysis.Barcode.ScanSpeed) obj;
        Integer num = (Integer) obj2;
        MiSnapSettings.Analysis.Barcode.Orientation orientation = (MiSnapSettings.Analysis.Barcode.Orientation) obj3;
        MiSnapSettings.Analysis.Barcode.Trigger trigger = (MiSnapSettings.Analysis.Barcode.Trigger) obj4;
        MiSnapSettings.Analysis.Barcode barcode = new MiSnapSettings.Analysis.Barcode();
        if ((i & 1) == 0) {
            barcode.a = null;
        } else {
            barcode.a = scanSpeed;
        }
        if ((i & 2) == 0) {
            barcode.b = null;
        } else {
            barcode.b = num;
        }
        if ((i & 4) == 0) {
            barcode.c = null;
        } else {
            barcode.c = orientation;
        }
        if ((i & 8) == 0) {
            barcode.d = null;
            return barcode;
        }
        barcode.d = trigger;
        return barcode;
    }

    @Override // kotlinx.serialization.KSerializer
    public SerialDescriptor getDescriptor() {
        return a;
    }

    @Override // kotlinx.serialization.KSerializer
    public void serialize(Encoder encoder, MiSnapSettings.Analysis.Barcode value) {
        encoder.getClass();
        value.getClass();
        SerialDescriptor descriptor = getDescriptor();
        CompositeEncoder beginStructure = encoder.beginStructure(descriptor);
        Integer num = value.b;
        MiSnapSettings.Analysis.Barcode.ScanSpeed scanSpeed = value.a;
        if (beginStructure.shouldEncodeElementDefault(descriptor) || scanSpeed != null) {
            MiSnapSettings.Analysis.Barcode.ScanSpeed[] values = MiSnapSettings.Analysis.Barcode.ScanSpeed.values();
            values.getClass();
            beginStructure.encodeNullableSerializableElement(descriptor, 0, new EnumSerializer("com.miteksystems.misnap.core.MiSnapSettings.Analysis.Barcode.ScanSpeed", (Enum[]) values), scanSpeed);
        }
        if (beginStructure.shouldEncodeElementDefault(descriptor) || num != null) {
            beginStructure.encodeNullableSerializableElement(descriptor, 1, IntSerializer.INSTANCE, num);
        }
        if (beginStructure.shouldEncodeElementDefault(descriptor) || value.c != null) {
            MiSnapSettings.Analysis.Barcode.Orientation[] values2 = MiSnapSettings.Analysis.Barcode.Orientation.values();
            values2.getClass();
            beginStructure.encodeNullableSerializableElement(descriptor, 2, new EnumSerializer("com.miteksystems.misnap.core.MiSnapSettings.Analysis.Barcode.Orientation", (Enum[]) values2), value.c);
        }
        if (beginStructure.shouldEncodeElementDefault(descriptor) || value.d != null) {
            MiSnapSettings.Analysis.Barcode.Trigger[] values3 = MiSnapSettings.Analysis.Barcode.Trigger.values();
            values3.getClass();
            beginStructure.encodeNullableSerializableElement(descriptor, 3, new EnumSerializer("com.miteksystems.misnap.core.MiSnapSettings.Analysis.Barcode.Trigger", (Enum[]) values3), value.d);
        }
        beginStructure.endStructure(descriptor);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public KSerializer[] typeParametersSerializers() {
        return TuplesKt.EMPTY_SERIALIZER_ARRAY;
    }
}
