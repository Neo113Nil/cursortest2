package app.cash.zipline.internal.bridge;

import app.cash.zipline.ZiplineScope;
import app.cash.zipline.ZiplineService;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlinx.serialization.ContextualSerializer;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.ContextDescriptor;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.TuplesKt;
import kotlinx.serialization.modules.SerializersModule;

/* loaded from: classes3.dex */
public abstract class ZiplineServiceAdapter implements KSerializer {
    public final ContextualSerializer contextualSerializer;
    public final ContextDescriptor descriptor;

    public ZiplineServiceAdapter() {
        ContextualSerializer contextualSerializer = new ContextualSerializer(Reflection.factory.getOrCreateKotlinClass(PassByReference.class), null, TuplesKt.EMPTY_SERIALIZER_ARRAY);
        this.contextualSerializer = contextualSerializer;
        this.descriptor = contextualSerializer.descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        Object deserialize = this.contextualSerializer.deserialize(decoder);
        deserialize.getClass();
        ReceiveByReference receiveByReference = (ReceiveByReference) deserialize;
        Endpoint endpoint = receiveByReference.endpoint;
        ZiplineScope ziplineScope = endpoint.takeScope;
        if (ziplineScope == null) {
            ziplineScope = new ZiplineScope();
        }
        return endpoint.take(receiveByReference.name, ziplineScope, this);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof ZiplineServiceAdapter) && getClass() == obj.getClass() && Intrinsics.areEqual(getSerializers(), ((ZiplineServiceAdapter) obj).getSerializers());
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return this.descriptor;
    }

    public abstract String getSerialName();

    public abstract List getSerializers();

    public abstract String getSimpleName();

    public final int hashCode() {
        return Reflection.factory.getOrCreateKotlinClass(getClass()).hashCode();
    }

    public abstract ZiplineService outboundService(OutboundCallHandler outboundCallHandler);

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        ZiplineService ziplineService = (ZiplineService) obj;
        ziplineService.getClass();
        this.contextualSerializer.serialize(encoder, new SendByReference(ziplineService, this));
    }

    public final String toString() {
        return getSimpleName();
    }

    public abstract List ziplineFunctions(SerializersModule serializersModule);
}
