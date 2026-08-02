package app.cash.redwood.treehouse;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.Updater;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* loaded from: classes3.dex */
public final class MutableStateSerializer implements KSerializer {
    public static final MutableStateSerializer INSTANCE = new MutableStateSerializer();
    public static final SerialDescriptor descriptor = MutableStateSurrogate.Companion.serializer().getDescriptor();

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        return Updater.mutableStateOf$default(((MutableStateSurrogate) decoder.decodeSerializableValue$1(MutableStateSurrogate.Companion.serializer())).value);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        MutableState mutableState = (MutableState) obj;
        mutableState.getClass();
        encoder.encodeSerializableValue(MutableStateSurrogate.Companion.serializer(), new MutableStateSurrogate(mutableState.getValue()));
    }
}
