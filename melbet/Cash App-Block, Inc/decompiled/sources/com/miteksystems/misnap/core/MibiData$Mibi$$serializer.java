package com.miteksystems.misnap.core;

import app.cash.local.presenters.LocalPresenterModule$Companion$$ExternalSyntheticLambda0;
import com.miteksystems.misnap.core.MibiData;
import java.util.List;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.HashSetSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.StringSerializer;
import kotlinx.serialization.internal.TuplesKt;

@Deprecated
@Metadata(d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u001a\u0010\u0005\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ \u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0014\u001a\u00020\u00118VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, d2 = {"com/miteksystems/misnap/core/MibiData.Mibi.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/miteksystems/misnap/core/MibiData$Mibi;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/miteksystems/misnap/core/MibiData$Mibi;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/miteksystems/misnap/core/MibiData$Mibi;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class MibiData$Mibi$$serializer implements GeneratedSerializer {
    public static final MibiData$Mibi$$serializer INSTANCE;
    public static final /* synthetic */ PluginGeneratedSerialDescriptor a;

    static {
        MibiData$Mibi$$serializer mibiData$Mibi$$serializer = new MibiData$Mibi$$serializer();
        INSTANCE = mibiData$Mibi$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.miteksystems.misnap.core.MibiData.Mibi", mibiData$Mibi$$serializer, 6);
        pluginGeneratedSerialDescriptor.addElement("MibiVersion", false);
        pluginGeneratedSerialDescriptor.addElement("Platform", false);
        pluginGeneratedSerialDescriptor.addElement("DeviceInfo", false);
        pluginGeneratedSerialDescriptor.addElement("SdkInfo", false);
        pluginGeneratedSerialDescriptor.addElement("PlatformPrivate", false);
        pluginGeneratedSerialDescriptor.addElement("SessionInfo", false);
        a = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public KSerializer[] childSerializers() {
        HashSetSerializer hashSetSerializer = new HashSetSerializer(MibiData.SessionInfoSerializer.INSTANCE, 1);
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new KSerializer[]{stringSerializer, stringSerializer, MibiData$DeviceInfo$$serializer.INSTANCE, MibiData$SdkInfo$$serializer.INSTANCE, MibiData$PlatformPrivate$$serializer.INSTANCE, hashSetSerializer};
    }

    @Override // kotlinx.serialization.KSerializer
    public MibiData.Mibi deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor descriptor = getDescriptor();
        CompositeDecoder beginStructure = decoder.beginStructure(descriptor);
        boolean z = true;
        int i = 0;
        Object obj = null;
        String str = null;
        String str2 = null;
        Object obj2 = null;
        Object obj3 = null;
        Object obj4 = null;
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
                    obj = beginStructure.decodeSerializableElement(descriptor, 2, MibiData$DeviceInfo$$serializer.INSTANCE, obj);
                    i |= 4;
                    break;
                case 3:
                    obj2 = beginStructure.decodeSerializableElement(descriptor, 3, MibiData$SdkInfo$$serializer.INSTANCE, obj2);
                    i |= 8;
                    break;
                case 4:
                    obj3 = beginStructure.decodeSerializableElement(descriptor, 4, MibiData$PlatformPrivate$$serializer.INSTANCE, obj3);
                    i |= 16;
                    break;
                case 5:
                    obj4 = beginStructure.decodeSerializableElement(descriptor, 5, new HashSetSerializer(MibiData.SessionInfoSerializer.INSTANCE, 1), obj4);
                    i |= 32;
                    break;
                default:
                    LocalPresenterModule$Companion$$ExternalSyntheticLambda0.m(decodeElementIndex);
                    return null;
            }
        }
        beginStructure.endStructure(descriptor);
        return new MibiData.Mibi(i, str, str2, (MibiData.DeviceInfo) obj, (MibiData.SdkInfo) obj2, (MibiData.PlatformPrivate) obj3, (List) obj4);
    }

    @Override // kotlinx.serialization.KSerializer
    public SerialDescriptor getDescriptor() {
        return a;
    }

    @Override // kotlinx.serialization.KSerializer
    public void serialize(Encoder encoder, MibiData.Mibi value) {
        encoder.getClass();
        value.getClass();
        SerialDescriptor descriptor = getDescriptor();
        CompositeEncoder beginStructure = encoder.beginStructure(descriptor);
        beginStructure.encodeStringElement(descriptor, 0, value.a);
        beginStructure.encodeStringElement(descriptor, 1, value.b);
        beginStructure.encodeSerializableElement(descriptor, 2, MibiData$DeviceInfo$$serializer.INSTANCE, value.c);
        beginStructure.encodeSerializableElement(descriptor, 3, MibiData$SdkInfo$$serializer.INSTANCE, value.d);
        beginStructure.encodeSerializableElement(descriptor, 4, MibiData$PlatformPrivate$$serializer.INSTANCE, value.e);
        beginStructure.encodeSerializableElement(descriptor, 5, new HashSetSerializer(MibiData.SessionInfoSerializer.INSTANCE, 1), value.f);
        beginStructure.endStructure(descriptor);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public KSerializer[] typeParametersSerializers() {
        return TuplesKt.EMPTY_SERIALIZER_ARRAY;
    }
}
