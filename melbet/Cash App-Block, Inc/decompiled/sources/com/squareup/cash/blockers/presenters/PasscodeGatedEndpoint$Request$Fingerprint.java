package com.squareup.cash.blockers.presenters;

import com.squareup.cash.overlays.FakeOverlayLayerKt;
import com.squareup.protos.franklin.common.RequestContext;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class PasscodeGatedEndpoint$Request$Fingerprint extends FakeOverlayLayerKt {
    public final RequestContext requestContext;
    public final String token;

    public PasscodeGatedEndpoint$Request$Fingerprint(String str, RequestContext requestContext) {
        str.getClass();
        this.token = str;
        this.requestContext = requestContext;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PasscodeGatedEndpoint$Request$Fingerprint)) {
            return false;
        }
        PasscodeGatedEndpoint$Request$Fingerprint passcodeGatedEndpoint$Request$Fingerprint = (PasscodeGatedEndpoint$Request$Fingerprint) obj;
        return Intrinsics.areEqual(this.token, passcodeGatedEndpoint$Request$Fingerprint.token) && Intrinsics.areEqual(this.requestContext, passcodeGatedEndpoint$Request$Fingerprint.requestContext);
    }

    @Override // com.squareup.cash.overlays.FakeOverlayLayerKt
    public final RequestContext getRequestContext() {
        return this.requestContext;
    }

    public final int hashCode() {
        int hashCode = this.token.hashCode() * 31;
        RequestContext requestContext = this.requestContext;
        return hashCode + (requestContext == null ? 0 : requestContext.hashCode());
    }

    public final String toString() {
        return "Fingerprint(token=" + this.token + ", requestContext=" + this.requestContext + ")";
    }
}
