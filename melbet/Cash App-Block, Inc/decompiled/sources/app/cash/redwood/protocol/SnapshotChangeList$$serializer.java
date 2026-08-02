package app.cash.redwood.protocol;

import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import app.cash.redwood.protocol.ChildrenChange;
import app.cash.redwood.protocol.SnapshotChangeList;
import app.cash.redwood.yoga.internal.Yoga$$ExternalSyntheticLambda0;
import java.util.ArrayList;
import java.util.List;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.HashSetSerializer;
import kotlinx.serialization.internal.InlineClassDescriptor;
import kotlinx.serialization.internal.TuplesKt;

@Deprecated
@Metadata(d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u001d\u0010\t\u001a\u00020\u00062\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"app/cash/redwood/protocol/SnapshotChangeList.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lapp/cash/redwood/protocol/SnapshotChangeList;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "", "serialize-rqC_l18", "(Lkotlinx/serialization/encoding/Encoder;Ljava/util/List;)V", "serialize", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize-48S5H8M", "(Lkotlinx/serialization/encoding/Decoder;)Ljava/util/List;", "deserialize", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "redwood-protocol"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* synthetic */ class SnapshotChangeList$$serializer implements GeneratedSerializer {
    public static final SnapshotChangeList$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        SnapshotChangeList$$serializer snapshotChangeList$$serializer = new SnapshotChangeList$$serializer();
        INSTANCE = snapshotChangeList$$serializer;
        InlineClassDescriptor inlineClassDescriptor = new InlineClassDescriptor("app.cash.redwood.protocol.SnapshotChangeList", snapshotChangeList$$serializer);
        inlineClassDescriptor.addElement("changes", false);
        descriptor = inlineClassDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{SnapshotChangeList.$childSerializers[0].getValue()};
    }

    @Override // kotlinx.serialization.KSerializer
    public /* synthetic */ Object deserialize(Decoder decoder) {
        return new SnapshotChangeList(m1383deserialize48S5H8M(decoder));
    }

    /* renamed from: deserialize-48S5H8M, reason: not valid java name */
    public final List<? extends Change> m1383deserialize48S5H8M(Decoder decoder) {
        decoder.getClass();
        List<? extends Change> list = (List) decoder.decodeInline(descriptor).decodeSerializableValue$1(new HashSetSerializer(Change.Companion.serializer(), 1));
        SnapshotChangeList.Companion companion = SnapshotChangeList.Companion;
        list.getClass();
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            Change change = (Change) obj;
            if ((change instanceof ChildrenChange.Move) || (change instanceof ChildrenChange.Remove)) {
                arrayList.add(obj);
            }
        }
        if (arrayList.isEmpty()) {
            return list;
        }
        StringBuilder m = Boxes$$ExternalSyntheticOutline1.m("Snapshot change list cannot contain move or remove operations\n\nFound:\n");
        CollectionsKt.joinTo$default(arrayList, m, "\n", null, null, new Yoga$$ExternalSyntheticLambda0(26), 60);
        throw new IllegalArgumentException(m.toString().toString());
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public /* synthetic */ void serialize(Encoder encoder, Object obj) {
        m1384serializerqC_l18(encoder, ((SnapshotChangeList) obj).changes);
    }

    /* renamed from: serialize-rqC_l18, reason: not valid java name */
    public final void m1384serializerqC_l18(Encoder encoder, List<? extends Change> value) {
        encoder.getClass();
        value.getClass();
        Encoder encodeInline = encoder.encodeInline(descriptor);
        if (encodeInline == null) {
            return;
        }
        encodeInline.encodeSerializableValue(new HashSetSerializer(Change.Companion.serializer(), 1), value);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public /* bridge */ /* synthetic */ KSerializer[] typeParametersSerializers() {
        return TuplesKt.EMPTY_SERIALIZER_ARRAY;
    }
}
