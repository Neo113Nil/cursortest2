package app.cash.redwood.ui;

import app.cash.local.presenters.LocalPresenterModule$Companion$$ExternalSyntheticLambda0;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.TuplesKt;

@Deprecated
@Metadata(d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u001d\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000e0\r¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0012\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"app/cash/redwood/ui/Margin.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lapp/cash/redwood/ui/Margin;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lapp/cash/redwood/ui/Margin;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lapp/cash/redwood/ui/Margin;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "redwood-runtime_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* synthetic */ class Margin$$serializer implements GeneratedSerializer {
    public static final int $stable = 8;
    public static final Margin$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        Margin$$serializer margin$$serializer = new Margin$$serializer();
        INSTANCE = margin$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("app.cash.redwood.ui.Margin", margin$$serializer, 4);
        pluginGeneratedSerialDescriptor.addElement("start", true);
        pluginGeneratedSerialDescriptor.addElement("end", true);
        pluginGeneratedSerialDescriptor.addElement("top", true);
        pluginGeneratedSerialDescriptor.addElement("bottom", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer[] childSerializers() {
        Dp$$serializer dp$$serializer = Dp$$serializer.INSTANCE;
        return new KSerializer[]{dp$$serializer, dp$$serializer, dp$$serializer, dp$$serializer};
    }

    @Override // kotlinx.serialization.KSerializer
    public final Margin deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder beginStructure = decoder.beginStructure(serialDescriptor);
        boolean z = true;
        int i = 0;
        Dp dp = null;
        Dp dp2 = null;
        Dp dp3 = null;
        Dp dp4 = null;
        while (z) {
            int decodeElementIndex = beginStructure.decodeElementIndex(serialDescriptor);
            if (decodeElementIndex == -1) {
                z = false;
            } else if (decodeElementIndex == 0) {
                dp = (Dp) beginStructure.decodeSerializableElement(serialDescriptor, 0, Dp$$serializer.INSTANCE, dp);
                i |= 1;
            } else if (decodeElementIndex == 1) {
                dp2 = (Dp) beginStructure.decodeSerializableElement(serialDescriptor, 1, Dp$$serializer.INSTANCE, dp2);
                i |= 2;
            } else if (decodeElementIndex == 2) {
                dp3 = (Dp) beginStructure.decodeSerializableElement(serialDescriptor, 2, Dp$$serializer.INSTANCE, dp3);
                i |= 4;
            } else {
                if (decodeElementIndex != 3) {
                    LocalPresenterModule$Companion$$ExternalSyntheticLambda0.m(decodeElementIndex);
                    return null;
                }
                dp4 = (Dp) beginStructure.decodeSerializableElement(serialDescriptor, 3, Dp$$serializer.INSTANCE, dp4);
                i |= 8;
            }
        }
        beginStructure.endStructure(serialDescriptor);
        return new Margin(i, dp, dp2, dp3, dp4);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x005a, code lost:
    
        if (app.cash.redwood.ui.Dp.m1406equalsimpl0(r2, 0.0d) == false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0075, code lost:
    
        if (app.cash.redwood.ui.Dp.m1406equalsimpl0(r0, 0.0d) == false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0024, code lost:
    
        if (app.cash.redwood.ui.Dp.m1406equalsimpl0(r6, 0.0d) == false) goto L7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x003f, code lost:
    
        if (app.cash.redwood.ui.Dp.m1406equalsimpl0(r4, 0.0d) == false) goto L13;
     */
    @Override // kotlinx.serialization.KSerializer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void serialize(Encoder encoder, Margin value) {
        encoder.getClass();
        value.getClass();
        double d = value.bottom;
        double d2 = value.top;
        double d3 = value.end;
        double d4 = value.start;
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder beginStructure = encoder.beginStructure(serialDescriptor);
        if (!beginStructure.shouldEncodeElementDefault(serialDescriptor)) {
            Dp.m1405constructorimpl(0.0d);
        }
        beginStructure.encodeSerializableElement(serialDescriptor, 0, Dp$$serializer.INSTANCE, new Dp(d4));
        if (!beginStructure.shouldEncodeElementDefault(serialDescriptor)) {
            Dp.m1405constructorimpl(0.0d);
        }
        beginStructure.encodeSerializableElement(serialDescriptor, 1, Dp$$serializer.INSTANCE, new Dp(d3));
        if (!beginStructure.shouldEncodeElementDefault(serialDescriptor)) {
            Dp.m1405constructorimpl(0.0d);
        }
        beginStructure.encodeSerializableElement(serialDescriptor, 2, Dp$$serializer.INSTANCE, new Dp(d2));
        if (!beginStructure.shouldEncodeElementDefault(serialDescriptor)) {
            Dp.m1405constructorimpl(0.0d);
        }
        beginStructure.encodeSerializableElement(serialDescriptor, 3, Dp$$serializer.INSTANCE, new Dp(d));
        beginStructure.endStructure(serialDescriptor);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public /* bridge */ /* synthetic */ KSerializer[] typeParametersSerializers() {
        return TuplesKt.EMPTY_SERIALIZER_ARRAY;
    }
}
