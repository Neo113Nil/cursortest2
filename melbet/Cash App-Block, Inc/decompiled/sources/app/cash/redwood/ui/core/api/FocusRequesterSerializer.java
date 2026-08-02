package app.cash.redwood.ui.core.api;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.WrappedSerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import okhttp3.internal.Tags;
import okio.Path$$ExternalSyntheticBUOutline0;

/* loaded from: classes3.dex */
public final class FocusRequesterSerializer implements KSerializer {
    public static final FocusRequesterSerializer INSTANCE = new FocusRequesterSerializer();
    public static final KSerializer delegate;
    public static final WrappedSerialDescriptor descriptor;

    static {
        KSerializer serializer = FocusRequesterId.Companion.serializer();
        delegate = serializer;
        descriptor = Tags.SerialDescriptor("app.cash.redwood.ui.core.api.FocusRequester", serializer.getDescriptor());
    }

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        return (FocusRequester) decoder.decodeSerializableValue$1(delegate);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        FocusRequester focusRequester = (FocusRequester) obj;
        focusRequester.getClass();
        if ((focusRequester instanceof FocusRequesterId ? (FocusRequesterId) focusRequester : null) != null) {
            encoder.encodeSerializableValue(delegate, new FocusRequesterId(((FocusRequesterId) focusRequester).id));
        } else {
            Path$$ExternalSyntheticBUOutline0.m$1(focusRequester, "cannot serialize ");
        }
    }
}
