package app.cash.zipline.internal.bridge;

import bo.app.a$$ExternalSyntheticBUOutline0;
import kotlin.Result;

/* loaded from: classes3.dex */
public final class ResultOrCallback {
    public final CancelCallback callback;
    public final Result result;

    public ResultOrCallback(Result result, CancelCallback cancelCallback) {
        this.result = result;
        this.callback = cancelCallback;
        if ((cancelCallback != null) != (result != null)) {
            return;
        }
        a$$ExternalSyntheticBUOutline0.m$3("Failed requirement.");
        throw null;
    }

    public /* synthetic */ ResultOrCallback(Result result, InboundService$callSuspending$cancelCallback$1 inboundService$callSuspending$cancelCallback$1, int i) {
        this((i & 1) != 0 ? null : result, (i & 2) != 0 ? null : inboundService$callSuspending$cancelCallback$1);
    }
}
