package app.cash.zipline.internal.bridge;

import app.cash.zipline.internal.HostService$Companion$Adapter;
import app.cash.zipline.loader.ZiplineLoader$ModuleJob$run$3;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* loaded from: classes3.dex */
public final class FlowSerializer implements KSerializer {
    public final HostService$Companion$Adapter delegateSerializer;
    public final SerialDescriptor descriptor;

    public FlowSerializer(HostService$Companion$Adapter hostService$Companion$Adapter) {
        this.delegateSerializer = hostService$Companion$Adapter;
        this.descriptor = hostService$Companion$Adapter.getDescriptor();
    }

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        return FlowKt.channelFlow(new ZiplineLoader$ModuleJob$run$3((FlowZiplineService) decoder.decodeSerializableValue$1(this.delegateSerializer), null, 28));
    }

    public final boolean equals(Object obj) {
        return (obj instanceof FlowSerializer) && ((FlowSerializer) obj).delegateSerializer.equals(this.delegateSerializer);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return this.descriptor;
    }

    public final int hashCode() {
        return this.delegateSerializer.hashCode();
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        Flow flow = (Flow) obj;
        flow.getClass();
        encoder.encodeSerializableValue(this.delegateSerializer, new FlowSerializer$toZiplineService$1(flow));
    }
}
