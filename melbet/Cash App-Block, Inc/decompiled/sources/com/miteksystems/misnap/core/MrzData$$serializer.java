package com.miteksystems.misnap.core;

import app.cash.local.presenters.LocalPresenterModule$Companion$$ExternalSyntheticLambda0;
import com.appsflyer.AdRevenueScheme;
import com.miteksystems.misnap.core.Mrz;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.StringSerializer;
import kotlinx.serialization.internal.TuplesKt;

@Deprecated
@Metadata(d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u001a\u0010\u0005\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ \u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0014\u001a\u00020\u00118VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, d2 = {"com/miteksystems/misnap/core/MrzData.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/miteksystems/misnap/core/MrzData;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/miteksystems/misnap/core/MrzData;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/miteksystems/misnap/core/MrzData;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class MrzData$$serializer implements GeneratedSerializer {
    public static final MrzData$$serializer INSTANCE;
    public static final /* synthetic */ PluginGeneratedSerialDescriptor a;

    static {
        MrzData$$serializer mrzData$$serializer = new MrzData$$serializer();
        INSTANCE = mrzData$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.miteksystems.misnap.core.MrzData", mrzData$$serializer, 8);
        pluginGeneratedSerialDescriptor.addElement("documentNumber", false);
        pluginGeneratedSerialDescriptor.addElement("dateOfBirth", false);
        pluginGeneratedSerialDescriptor.addElement("dateOfExpiry", false);
        pluginGeneratedSerialDescriptor.addElement(AdRevenueScheme.COUNTRY, false);
        pluginGeneratedSerialDescriptor.addElement("documentCode", false);
        pluginGeneratedSerialDescriptor.addElement("optionalData1", true);
        pluginGeneratedSerialDescriptor.addElement("nationality", true);
        pluginGeneratedSerialDescriptor.addElement("rawData", true);
        a = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public KSerializer[] childSerializers() {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new KSerializer[]{stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer};
    }

    @Override // kotlinx.serialization.KSerializer
    public MrzData deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor descriptor = getDescriptor();
        CompositeDecoder beginStructure = decoder.beginStructure(descriptor);
        boolean z = true;
        int i = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        String str8 = null;
        while (z) {
            int decodeElementIndex = beginStructure.decodeElementIndex(descriptor);
            switch (decodeElementIndex) {
                case -1:
                    z = false;
                    break;
                case 0:
                    str = beginStructure.decodeStringElement(descriptor, 0);
                    i |= 1;
                    break;
                case 1:
                    str2 = beginStructure.decodeStringElement(descriptor, 1);
                    i |= 2;
                    break;
                case 2:
                    str3 = beginStructure.decodeStringElement(descriptor, 2);
                    i |= 4;
                    break;
                case 3:
                    str4 = beginStructure.decodeStringElement(descriptor, 3);
                    i |= 8;
                    break;
                case 4:
                    str5 = beginStructure.decodeStringElement(descriptor, 4);
                    i |= 16;
                    break;
                case 5:
                    str6 = beginStructure.decodeStringElement(descriptor, 5);
                    i |= 32;
                    break;
                case 6:
                    str7 = beginStructure.decodeStringElement(descriptor, 6);
                    i |= 64;
                    break;
                case 7:
                    str8 = beginStructure.decodeStringElement(descriptor, 7);
                    i |= 128;
                    break;
                default:
                    LocalPresenterModule$Companion$$ExternalSyntheticLambda0.m(decodeElementIndex);
                    return null;
            }
        }
        beginStructure.endStructure(descriptor);
        return new MrzData(i, str, str2, str3, str4, str5, str6, str7, str8);
    }

    @Override // kotlinx.serialization.KSerializer
    public SerialDescriptor getDescriptor() {
        return a;
    }

    @Override // kotlinx.serialization.KSerializer
    public void serialize(Encoder encoder, MrzData value) {
        encoder.getClass();
        value.getClass();
        SerialDescriptor descriptor = getDescriptor();
        CompositeEncoder beginStructure = encoder.beginStructure(descriptor);
        Mrz.Companion companion = Mrz.INSTANCE;
        String str = value.i;
        String str2 = value.h;
        String str3 = value.g;
        beginStructure.encodeStringElement(descriptor, 0, value.b);
        beginStructure.encodeStringElement(descriptor, 1, value.c);
        beginStructure.encodeStringElement(descriptor, 2, value.d);
        beginStructure.encodeStringElement(descriptor, 3, value.e);
        beginStructure.encodeStringElement(descriptor, 4, value.f);
        if (beginStructure.shouldEncodeElementDefault(descriptor) || !Intrinsics.areEqual(str3, "<<<<<<<<<<<<<<")) {
            beginStructure.encodeStringElement(descriptor, 5, str3);
        }
        if (beginStructure.shouldEncodeElementDefault(descriptor) || !Intrinsics.areEqual(str2, "")) {
            beginStructure.encodeStringElement(descriptor, 6, str2);
        }
        if (beginStructure.shouldEncodeElementDefault(descriptor) || !Intrinsics.areEqual(str, "")) {
            beginStructure.encodeStringElement(descriptor, 7, str);
        }
        beginStructure.endStructure(descriptor);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public KSerializer[] typeParametersSerializers() {
        return TuplesKt.EMPTY_SERIALIZER_ARRAY;
    }
}
