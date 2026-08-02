package com.squareup.cash.blockers.presenters;

import com.squareup.cash.overlays.FakeOverlayLayerKt;
import com.squareup.protos.franklin.common.RequestContext;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class PasscodeGatedEndpoint$Request$Passcode extends FakeOverlayLayerKt {
    public final String passcode;
    public final RequestContext requestContext;

    public PasscodeGatedEndpoint$Request$Passcode(String str, RequestContext requestContext) {
        str.getClass();
        this.passcode = str;
        this.requestContext = requestContext;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PasscodeGatedEndpoint$Request$Passcode)) {
            return false;
        }
        PasscodeGatedEndpoint$Request$Passcode passcodeGatedEndpoint$Request$Passcode = (PasscodeGatedEndpoint$Request$Passcode) obj;
        return Intrinsics.areEqual(this.passcode, passcodeGatedEndpoint$Request$Passcode.passcode) && Intrinsics.areEqual(this.requestContext, passcodeGatedEndpoint$Request$Passcode.requestContext);
    }

    @Override // com.squareup.cash.overlays.FakeOverlayLayerKt
    public final RequestContext getRequestContext() {
        return this.requestContext;
    }

    public final int hashCode() {
        int hashCode = this.passcode.hashCode() * 31;
        RequestContext requestContext = this.requestContext;
        return hashCode + (requestContext == null ? 0 : requestContext.hashCode());
    }

    public final String toString() {
        return "Passcode(passcode=" + this.passcode + ", requestContext=" + this.requestContext + ")";
    }
}
