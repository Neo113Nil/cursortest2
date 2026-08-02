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
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.TuplesKt;

@Deprecated
@Metadata(d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u001a\u0010\u0005\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ \u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0014\u001a\u00020\u00118VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, d2 = {"com/miteksystems/misnap/core/MiSnapSettings.Nfc.Advanced.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/miteksystems/misnap/core/MiSnapSettings$Nfc$Advanced;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/miteksystems/misnap/core/MiSnapSettings$Nfc$Advanced;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/miteksystems/misnap/core/MiSnapSettings$Nfc$Advanced;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class MiSnapSettings$Nfc$Advanced$$serializer implements GeneratedSerializer {
    public static final MiSnapSettings$Nfc$Advanced$$serializer INSTANCE;
    public static final /* synthetic */ PluginGeneratedSerialDescriptor a;

    static {
        MiSnapSettings$Nfc$Advanced$$serializer miSnapSettings$Nfc$Advanced$$serializer = new MiSnapSettings$Nfc$Advanced$$serializer();
        INSTANCE = miSnapSettings$Nfc$Advanced$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.miteksystems.misnap.core.MiSnapSettings.Nfc.Advanced", miSnapSettings$Nfc$Advanced$$serializer, 1);
        pluginGeneratedSerialDescriptor.addElement("docType", true);
        a = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public KSerializer[] childSerializers() {
        MiSnapSettings.Nfc.Advanced.DocType[] values = MiSnapSettings.Nfc.Advanced.DocType.values();
        values.getClass();
        return new KSerializer[]{BuiltinSerializersKt.getNullable(new EnumSerializer("com.miteksystems.misnap.core.MiSnapSettings.Nfc.Advanced.DocType", (Enum[]) values))};
    }

    @Override // kotlinx.serialization.KSerializer
    public MiSnapSettings.Nfc.Advanced deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor descriptor = getDescriptor();
        CompositeDecoder beginStructure = decoder.beginStructure(descriptor);
        boolean z = true;
        boolean z2 = false;
        Object obj = null;
        while (z) {
            int decodeElementIndex = beginStructure.decodeElementIndex(descriptor);
            if (decodeElementIndex == -1) {
                z = false;
            } else {
                if (decodeElementIndex != 0) {
                    LocalPresenterModule$Companion$$ExternalSyntheticLambda0.m(decodeElementIndex);
                    return null;
                }
                MiSnapSettings.Nfc.Advanced.DocType[] values = MiSnapSettings.Nfc.Advanced.DocType.values();
                values.getClass();
                obj = beginStructure.decodeNullableSerializableElement(descriptor, 0, new EnumSerializer("com.miteksystems.misnap.core.MiSnapSettings.Nfc.Advanced.DocType", (Enum[]) values), obj);
                z2 = true;
            }
        }
        beginStructure.endStructure(descriptor);
        MiSnapSettings.Nfc.Advanced.DocType docType = (MiSnapSettings.Nfc.Advanced.DocType) obj;
        MiSnapSettings.Nfc.Advanced advanced = new MiSnapSettings.Nfc.Advanced();
        if (z2) {
            advanced.a = docType;
            return advanced;
        }
        advanced.a = null;
        return advanced;
    }

    @Override // kotlinx.serialization.KSerializer
    public SerialDescriptor getDescriptor() {
        return a;
    }

    @Override // kotlinx.serialization.KSerializer
    public void serialize(Encoder encoder, MiSnapSettings.Nfc.Advanced value) {
        encoder.getClass();
        value.getClass();
        SerialDescriptor descriptor = getDescriptor();
        CompositeEncoder beginStructure = encoder.beginStructure(descriptor);
        if (beginStructure.shouldEncodeElementDefault(descriptor) || value.a != null) {
            MiSnapSettings.Nfc.Advanced.DocType[] values = MiSnapSettings.Nfc.Advanced.DocType.values();
            values.getClass();
            beginStructure.encodeNullableSerializableElement(descriptor, 0, new EnumSerializer("com.miteksystems.misnap.core.MiSnapSettings.Nfc.Advanced.DocType", (Enum[]) values), value.a);
        }
        beginStructure.endStructure(descriptor);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public KSerializer[] typeParametersSerializers() {
        return TuplesKt.EMPTY_SERIALIZER_ARRAY;
    }
}
