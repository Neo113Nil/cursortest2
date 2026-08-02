package app.cash.zipline;

import app.cash.local.presenters.LocalPresenterModule$Companion$$ExternalSyntheticLambda0;
import app.cash.zipline.ZiplineManifest;
import java.util.Map;
import kotlin.Deprecated;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.collections.EmptyMap;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
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
@Metadata(d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u001d\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000e0\r¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0012\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"app/cash/zipline/ZiplineManifest.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lapp/cash/zipline/ZiplineManifest;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lapp/cash/zipline/ZiplineManifest;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lapp/cash/zipline/ZiplineManifest;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "zipline_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* synthetic */ class ZiplineManifest$$serializer implements GeneratedSerializer {
    public static final ZiplineManifest$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        ZiplineManifest$$serializer ziplineManifest$$serializer = new ZiplineManifest$$serializer();
        INSTANCE = ziplineManifest$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("app.cash.zipline.ZiplineManifest", ziplineManifest$$serializer, 6);
        pluginGeneratedSerialDescriptor.addElement("unsigned", true);
        pluginGeneratedSerialDescriptor.addElement("modules", true);
        pluginGeneratedSerialDescriptor.addElement("mainModuleId", false);
        pluginGeneratedSerialDescriptor.addElement("mainFunction", true);
        pluginGeneratedSerialDescriptor.addElement("version", true);
        pluginGeneratedSerialDescriptor.addElement("metadata", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer[] childSerializers() {
        Lazy[] lazyArr = ZiplineManifest.$childSerializers;
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new KSerializer[]{ZiplineManifest$Unsigned$$serializer.INSTANCE, lazyArr[1].getValue(), stringSerializer, BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), lazyArr[5].getValue()};
    }

    @Override // kotlinx.serialization.KSerializer
    public final ZiplineManifest deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder beginStructure = decoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = ZiplineManifest.$childSerializers;
        boolean z = true;
        int i = 0;
        ZiplineManifest.Unsigned unsigned = null;
        Map map = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        Map map2 = null;
        while (z) {
            int decodeElementIndex = beginStructure.decodeElementIndex(serialDescriptor);
            switch (decodeElementIndex) {
                case -1:
                    z = false;
                    break;
                case 0:
                    unsigned = (ZiplineManifest.Unsigned) beginStructure.decodeSerializableElement(serialDescriptor, 0, ZiplineManifest$Unsigned$$serializer.INSTANCE, unsigned);
                    i |= 1;
                    break;
                case 1:
                    map = (Map) beginStructure.decodeSerializableElement(serialDescriptor, 1, (KSerializer) lazyArr[1].getValue(), map);
                    i |= 2;
                    break;
                case 2:
                    str = beginStructure.decodeStringElement(serialDescriptor, 2);
                    i |= 4;
                    break;
                case 3:
                    str2 = (String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, str2);
                    i |= 8;
                    break;
                case 4:
                    str3 = (String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, str3);
                    i |= 16;
                    break;
                case 5:
                    map2 = (Map) beginStructure.decodeSerializableElement(serialDescriptor, 5, (KSerializer) lazyArr[5].getValue(), map2);
                    i |= 32;
                    break;
                default:
                    LocalPresenterModule$Companion$$ExternalSyntheticLambda0.m(decodeElementIndex);
                    return null;
            }
        }
        beginStructure.endStructure(serialDescriptor);
        return new ZiplineManifest(i, unsigned, map, str, str2, str3, map2);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0082, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r0, r5) == false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x003a, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r5, r0) == false) goto L13;
     */
    @Override // kotlinx.serialization.KSerializer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void serialize(Encoder encoder, ZiplineManifest value) {
        encoder.getClass();
        value.getClass();
        Map map = value.modules;
        ZiplineManifest.Unsigned unsigned = value.unsigned;
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder beginStructure = encoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = ZiplineManifest.$childSerializers;
        if (beginStructure.shouldEncodeElementDefault(serialDescriptor) || !Intrinsics.areEqual(unsigned, new ZiplineManifest.Unsigned())) {
            beginStructure.encodeSerializableElement(serialDescriptor, 0, ZiplineManifest$Unsigned$$serializer.INSTANCE, unsigned);
        }
        if (!beginStructure.shouldEncodeElementDefault(serialDescriptor)) {
            EmptyMap emptyMap = EmptyMap.INSTANCE;
            emptyMap.getClass();
        }
        beginStructure.encodeSerializableElement(serialDescriptor, 1, (KSerializer) lazyArr[1].getValue(), map);
        String str = value.mainModuleId;
        Map map2 = value.metadata;
        String str2 = value.version;
        String str3 = value.mainFunction;
        beginStructure.encodeStringElement(serialDescriptor, 2, str);
        if (beginStructure.shouldEncodeElementDefault(serialDescriptor) || str3 != null) {
            beginStructure.encodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, str3);
        }
        if (beginStructure.shouldEncodeElementDefault(serialDescriptor) || str2 != null) {
            beginStructure.encodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, str2);
        }
        if (!beginStructure.shouldEncodeElementDefault(serialDescriptor)) {
            EmptyMap emptyMap2 = EmptyMap.INSTANCE;
            emptyMap2.getClass();
        }
        beginStructure.encodeSerializableElement(serialDescriptor, 5, (KSerializer) lazyArr[5].getValue(), map2);
        beginStructure.endStructure(serialDescriptor);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return TuplesKt.EMPTY_SERIALIZER_ARRAY;
    }
}
