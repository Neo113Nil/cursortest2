package app.cash.zipline.internal.bridge;

import app.cash.redwood.treehouse.SequentialStateFlow;
import app.cash.zipline.internal.HostService$Companion$Adapter;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* loaded from: classes3.dex */
public final class StateFlowSerializer implements KSerializer {
    public final HostService$Companion$Adapter delegateSerializer;
    public final SerialDescriptor descriptor;

    public StateFlowSerializer(HostService$Companion$Adapter hostService$Companion$Adapter) {
        this.delegateSerializer = hostService$Companion$Adapter;
        this.descriptor = hostService$Companion$Adapter.getDescriptor();
    }

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        return new SequentialStateFlow((StateFlowZiplineService) decoder.decodeSerializableValue$1(this.delegateSerializer));
    }

    public final boolean equals(Object obj) {
        return (obj instanceof StateFlowSerializer) && ((StateFlowSerializer) obj).delegateSerializer.equals(this.delegateSerializer);
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
        StateFlow stateFlow = (StateFlow) obj;
        stateFlow.getClass();
        encoder.encodeSerializableValue(this.delegateSerializer, new StateFlowSerializer$toZiplineService$1(stateFlow));
    }
}
