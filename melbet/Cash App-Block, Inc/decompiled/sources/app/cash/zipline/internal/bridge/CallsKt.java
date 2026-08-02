package app.cash.zipline.internal.bridge;

import app.cash.zipline.internal.HostService$Companion$Adapter;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.IntCompanionObject;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.internal.ArrayClassDesc;
import kotlinx.serialization.internal.IntSerializer;

/* loaded from: classes3.dex */
public abstract class CallsKt {
    public static final ArrayClassDesc argsListDescriptor;
    public static final HostService$Companion$Adapter cancelCallbackSerializer;
    public static final HostService$Companion$Adapter failureSuspendCallbackSerializer;

    static {
        KSerializer serializer = BuiltinSerializersKt.serializer(IntCompanionObject.INSTANCE);
        serializer.getClass();
        SerialDescriptor descriptor = serializer.getDescriptor();
        descriptor.getClass();
        argsListDescriptor = new ArrayClassDesc(descriptor, 1);
        failureSuspendCallbackSerializer = new HostService$Companion$Adapter("app.cash.zipline.internal.bridge.SuspendCallback<kotlin.Int>", CollectionsKt__CollectionsKt.listOf((Object[]) new KSerializer[]{IntSerializer.INSTANCE}), 12);
        cancelCallbackSerializer = new HostService$Companion$Adapter(CollectionsKt__CollectionsKt.listOf((Object[]) new KSerializer[0]), 8);
    }
}
