package app.cash.redwood.ui;

import app.cash.local.presenters.LocalPresenterModule$Companion$$ExternalSyntheticLambda0;
import kotlin.Deprecated;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.DoubleSerializer;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.TuplesKt;

@Deprecated
@Metadata(d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u001d\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000e0\r¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0012\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"app/cash/redwood/ui/UiConfiguration.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lapp/cash/redwood/ui/UiConfiguration;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lapp/cash/redwood/ui/UiConfiguration;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lapp/cash/redwood/ui/UiConfiguration;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "redwood-runtime_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* synthetic */ class UiConfiguration$$serializer implements GeneratedSerializer {
    public static final int $stable = 8;
    public static final UiConfiguration$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        UiConfiguration$$serializer uiConfiguration$$serializer = new UiConfiguration$$serializer();
        INSTANCE = uiConfiguration$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("app.cash.redwood.ui.UiConfiguration", uiConfiguration$$serializer, 6);
        pluginGeneratedSerialDescriptor.addElement("darkMode", true);
        pluginGeneratedSerialDescriptor.addElement("safeAreaInsets", true);
        pluginGeneratedSerialDescriptor.addElement("viewInsets", true);
        pluginGeneratedSerialDescriptor.addElement("viewportSize", true);
        pluginGeneratedSerialDescriptor.addElement("density", true);
        pluginGeneratedSerialDescriptor.addElement("layoutDirection", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer[] childSerializers() {
        Lazy[] lazyArr = UiConfiguration.$childSerializers;
        Margin$$serializer margin$$serializer = Margin$$serializer.INSTANCE;
        return new KSerializer[]{BooleanSerializer.INSTANCE, margin$$serializer, margin$$serializer, BuiltinSerializersKt.getNullable(Size$$serializer.INSTANCE), DoubleSerializer.INSTANCE, lazyArr[5].getValue()};
    }

    @Override // kotlinx.serialization.KSerializer
    public final UiConfiguration deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder beginStructure = decoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = UiConfiguration.$childSerializers;
        UiConfiguration uiConfiguration = null;
        int i = 0;
        boolean z = false;
        Margin margin = null;
        Margin margin2 = null;
        Size size = null;
        double d = 0.0d;
        boolean z2 = true;
        LayoutDirection layoutDirection = null;
        while (z2) {
            int decodeElementIndex = beginStructure.decodeElementIndex(serialDescriptor);
            switch (decodeElementIndex) {
                case -1:
                    z2 = false;
                    continue;
                case 0:
                    z = beginStructure.decodeBooleanElement(serialDescriptor, 0);
                    i |= 1;
                    break;
                case 1:
                    margin = (Margin) beginStructure.decodeSerializableElement(serialDescriptor, 1, Margin$$serializer.INSTANCE, margin);
                    i |= 2;
                    break;
                case 2:
                    margin2 = (Margin) beginStructure.decodeSerializableElement(serialDescriptor, 2, Margin$$serializer.INSTANCE, margin2);
                    i |= 4;
                    break;
                case 3:
                    size = (Size) beginStructure.decodeNullableSerializableElement(serialDescriptor, 3, Size$$serializer.INSTANCE, size);
                    i |= 8;
                    break;
                case 4:
                    d = beginStructure.decodeDoubleElement(serialDescriptor, 4);
                    i |= 16;
                    break;
                case 5:
                    layoutDirection = (LayoutDirection) beginStructure.decodeSerializableElement(serialDescriptor, 5, (KSerializer) lazyArr[5].getValue(), layoutDirection);
                    i |= 32;
                    break;
                default:
                    LocalPresenterModule$Companion$$ExternalSyntheticLambda0.m(decodeElementIndex);
                    return uiConfiguration;
            }
            uiConfiguration = null;
        }
        beginStructure.endStructure(serialDescriptor);
        return new UiConfiguration(i, z, margin, margin2, size, d, layoutDirection);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0053, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r3, app.cash.redwood.ui.Margin.Zero) == false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0039, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r4, app.cash.redwood.ui.Margin.Zero) == false) goto L12;
     */
    @Override // kotlinx.serialization.KSerializer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void serialize(Encoder encoder, UiConfiguration value) {
        encoder.getClass();
        value.getClass();
        LayoutDirection layoutDirection = value.layoutDirection;
        double d = value.density;
        Size size = value.viewportSize;
        Margin margin = value.viewInsets;
        Margin margin2 = value.safeAreaInsets;
        boolean z = value.darkMode;
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder beginStructure = encoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = UiConfiguration.$childSerializers;
        if (beginStructure.shouldEncodeElementDefault(serialDescriptor) || z) {
            beginStructure.encodeBooleanElement(serialDescriptor, 0, z);
        }
        if (!beginStructure.shouldEncodeElementDefault(serialDescriptor)) {
            Margin.Companion.getClass();
        }
        beginStructure.encodeSerializableElement(serialDescriptor, 1, Margin$$serializer.INSTANCE, margin2);
        if (!beginStructure.shouldEncodeElementDefault(serialDescriptor)) {
            Margin.Companion.getClass();
        }
        beginStructure.encodeSerializableElement(serialDescriptor, 2, Margin$$serializer.INSTANCE, margin);
        if (beginStructure.shouldEncodeElementDefault(serialDescriptor) || size != null) {
            beginStructure.encodeNullableSerializableElement(serialDescriptor, 3, Size$$serializer.INSTANCE, size);
        }
        if (beginStructure.shouldEncodeElementDefault(serialDescriptor) || Double.compare(d, 1.0d) != 0) {
            beginStructure.encodeDoubleElement(serialDescriptor, 4, d);
        }
        if (beginStructure.shouldEncodeElementDefault(serialDescriptor) || layoutDirection != LayoutDirection.Ltr) {
            beginStructure.encodeSerializableElement(serialDescriptor, 5, (KSerializer) lazyArr[5].getValue(), layoutDirection);
        }
        beginStructure.endStructure(serialDescriptor);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public /* bridge */ /* synthetic */ KSerializer[] typeParametersSerializers() {
        return TuplesKt.EMPTY_SERIALIZER_ARRAY;
    }
}
