package com.squareup.cash.identityverification.backend.real;

import com.squareup.cash.identityverification.backend.api.IdentityVerificationStatus;
import com.squareup.protos.franklin.ui.IdentityHubState;
import kotlin.jvm.functions.Function1;

/* loaded from: classes8.dex */
public final class RealIdentityVerificationRepo$status$2$1 implements Function1 {
    public static final RealIdentityVerificationRepo$status$2$1 INSTANCE = new RealIdentityVerificationRepo$status$2$1();

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        IdentityHubState identityHubState = (IdentityHubState) obj;
        identityHubState.getClass();
        Boolean bool = identityHubState.should_show_badge;
        bool.getClass();
        boolean booleanValue = bool.booleanValue();
        IdentityHubState.EntrypointStatus entrypointStatus = identityHubState.entrypoint_status;
        entrypointStatus.getClass();
        Long l = identityHubState.version;
        l.getClass();
        return new IdentityVerificationStatus(booleanValue, entrypointStatus, l.longValue());
    }
}
