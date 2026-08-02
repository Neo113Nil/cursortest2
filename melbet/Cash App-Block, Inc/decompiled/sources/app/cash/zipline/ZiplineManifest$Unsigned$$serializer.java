package app.cash.zipline;

import app.cash.local.presenters.LocalPresenterModule$Companion$$ExternalSyntheticLambda0;
import app.cash.zipline.ZiplineManifest;
import java.util.Map;
import kotlin.Deprecated;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.collections.EmptyMap;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.StringSerializer;
import kotlinx.serialization.internal.TuplesKt;

@Deprecated
@Metadata(d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u001d\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000e0\r¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0012\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"app/cash/zipline/ZiplineManifest.Unsigned.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lapp/cash/zipline/ZiplineManifest$Unsigned;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lapp/cash/zipline/ZiplineManifest$Unsigned;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lapp/cash/zipline/ZiplineManifest$Unsigned;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "zipline_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* synthetic */ class ZiplineManifest$Unsigned$$serializer implements GeneratedSerializer {
    public static final ZiplineManifest$Unsigned$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        ZiplineManifest$Unsigned$$serializer ziplineManifest$Unsigned$$serializer = new ZiplineManifest$Unsigned$$serializer();
        INSTANCE = ziplineManifest$Unsigned$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("app.cash.zipline.ZiplineManifest.Unsigned", ziplineManifest$Unsigned$$serializer, 3);
        pluginGeneratedSerialDescriptor.addElement("signatures", true);
        pluginGeneratedSerialDescriptor.addElement("freshAtEpochMs", true);
        pluginGeneratedSerialDescriptor.addElement("baseUrl", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{ZiplineManifest.Unsigned.$childSerializers[0].getValue(), BuiltinSerializersKt.getNullable(LongSerializer.INSTANCE), BuiltinSerializersKt.getNullable(StringSerializer.INSTANCE)};
    }

    @Override // kotlinx.serialization.KSerializer
    public final ZiplineManifest.Unsigned deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder beginStructure = decoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = ZiplineManifest.Unsigned.$childSerializers;
        boolean z = true;
        int i = 0;
        Map map = null;
        Long l = null;
        String str = null;
        while (z) {
            int decodeElementIndex = beginStructure.decodeElementIndex(serialDescriptor);
            if (decodeElementIndex == -1) {
                z = false;
            } else if (decodeElementIndex == 0) {
                map = (Map) beginStructure.decodeSerializableElement(serialDescriptor, 0, (KSerializer) lazyArr[0].getValue(), map);
                i |= 1;
            } else if (decodeElementIndex == 1) {
                l = (Long) beginStructure.decodeNullableSerializableElement(serialDescriptor, 1, LongSerializer.INSTANCE, l);
                i |= 2;
            } else {
                if (decodeElementIndex != 2) {
                    LocalPresenterModule$Companion$$ExternalSyntheticLambda0.m(decodeElementIndex);
                    return null;
                }
                str = (String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, str);
                i |= 4;
            }
        }
        beginStructure.endStructure(serialDescriptor);
        return new ZiplineManifest.Unsigned(i, map, l, str);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0024, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r6, r3) == false) goto L7;
     */
    @Override // kotlinx.serialization.KSerializer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void serialize(Encoder encoder, ZiplineManifest.Unsigned value) {
        encoder.getClass();
        value.getClass();
        String str = value.baseUrl;
        Long l = value.freshAtEpochMs;
        Map map = value.signatures;
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder beginStructure = encoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = ZiplineManifest.Unsigned.$childSerializers;
        if (!beginStructure.shouldEncodeElementDefault(serialDescriptor)) {
            EmptyMap emptyMap = EmptyMap.INSTANCE;
            emptyMap.getClass();
        }
        beginStructure.encodeSerializableElement(serialDescriptor, 0, (KSerializer) lazyArr[0].getValue(), map);
        if (beginStructure.shouldEncodeElementDefault(serialDescriptor) || l != null) {
            beginStructure.encodeNullableSerializableElement(serialDescriptor, 1, LongSerializer.INSTANCE, l);
        }
        if (beginStructure.shouldEncodeElementDefault(serialDescriptor) || str != null) {
            beginStructure.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, str);
        }
        beginStructure.endStructure(serialDescriptor);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return TuplesKt.EMPTY_SERIALIZER_ARRAY;
    }
}
