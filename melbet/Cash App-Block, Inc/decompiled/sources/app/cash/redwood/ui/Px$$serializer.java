package app.cash.redwood.ui;

import kotlin.Deprecated;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.DoubleSerializer;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.InlineClassDescriptor;
import kotlinx.serialization.internal.TuplesKt;

@Deprecated
@Metadata(d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u001d\u0010\t\u001a\u00020\u00062\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"app/cash/redwood/ui/Px.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lapp/cash/redwood/ui/Px;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "", "serialize-o3_lFyk", "(Lkotlinx/serialization/encoding/Encoder;D)V", "serialize", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize-5CDL8Aw", "(Lkotlinx/serialization/encoding/Decoder;)D", "deserialize", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "redwood-runtime_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* synthetic */ class Px$$serializer implements GeneratedSerializer {
    public static final int $stable = 8;
    public static final Px$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        Px$$serializer px$$serializer = new Px$$serializer();
        INSTANCE = px$$serializer;
        InlineClassDescriptor inlineClassDescriptor = new InlineClassDescriptor("app.cash.redwood.ui.Px", px$$serializer);
        inlineClassDescriptor.addElement("value", false);
        descriptor = inlineClassDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{DoubleSerializer.INSTANCE};
    }

    @Override // kotlinx.serialization.KSerializer
    public /* synthetic */ Object deserialize(Decoder decoder) {
        return new Px(m1411deserialize5CDL8Aw(decoder));
    }

    /* renamed from: deserialize-5CDL8Aw, reason: not valid java name */
    public final double m1411deserialize5CDL8Aw(Decoder decoder) {
        decoder.getClass();
        double decodeDouble = decoder.decodeInline(descriptor).decodeDouble();
        Px.m1410constructorimpl(decodeDouble);
        return decodeDouble;
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public /* synthetic */ void serialize(Encoder encoder, Object obj) {
        m1412serializeo3_lFyk(encoder, ((Px) obj).value);
    }

    /* renamed from: serialize-o3_lFyk, reason: not valid java name */
    public final void m1412serializeo3_lFyk(Encoder encoder, double value) {
        encoder.getClass();
        Encoder encodeInline = encoder.encodeInline(descriptor);
        if (encodeInline == null) {
            return;
        }
        encodeInline.encodeDouble(value);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public /* bridge */ /* synthetic */ KSerializer[] typeParametersSerializers() {
        return TuplesKt.EMPTY_SERIALIZER_ARRAY;
    }
}
