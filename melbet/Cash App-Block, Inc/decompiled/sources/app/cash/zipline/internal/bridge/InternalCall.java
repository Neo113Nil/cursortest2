package app.cash.zipline.internal.bridge;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import app.cash.zipline.ZiplineFunction;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.List;
import kotlinx.serialization.KSerializer;

/* loaded from: classes3.dex */
public final class InternalCall {
    public final List args;
    public final ArgsListSerializer argsListSerializer;
    public final ZiplineFunction function;
    public final InboundService inboundService;
    public final String serviceName;
    public final SuspendCallback suspendCallback;
    public final KSerializer suspendCallbackSerializer;

    public InternalCall(String str, ArgsListSerializer argsListSerializer, KSerializer kSerializer, InboundService inboundService, ZiplineFunction ziplineFunction, SuspendCallback suspendCallback, List list, int i) {
        argsListSerializer = (i & 2) != 0 ? null : argsListSerializer;
        kSerializer = (i & 4) != 0 ? null : kSerializer;
        inboundService = (i & 8) != 0 ? null : inboundService;
        suspendCallback = (i & 32) != 0 ? null : suspendCallback;
        str.getClass();
        list.getClass();
        this.serviceName = str;
        this.argsListSerializer = argsListSerializer;
        this.suspendCallbackSerializer = kSerializer;
        this.inboundService = inboundService;
        this.function = ziplineFunction;
        this.suspendCallback = suspendCallback;
        this.args = list;
    }

    public final String toString() {
        return CameraState$Type$EnumUnboxingLocalUtility.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Call(receiver=", this.serviceName, ", function=", this.function.getSignature(), ", args="), this.args, ")");
    }
}
