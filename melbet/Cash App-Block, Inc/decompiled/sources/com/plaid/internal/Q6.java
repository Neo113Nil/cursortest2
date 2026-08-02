package com.plaid.internal;

import com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKInternalEvent;

/* loaded from: classes5.dex */
public final class Q6 {
    public static final AbstractC0187h7 a(Common$SDKInternalEvent.RequestSilentNetworkAuth requestSilentNetworkAuth) {
        requestSilentNetworkAuth.getClass();
        String verificationId = requestSilentNetworkAuth.getVerificationId();
        if (verificationId != null && verificationId.length() != 0) {
            if (requestSilentNetworkAuth.hasTwilio()) {
                String redirectUri = requestSilentNetworkAuth.getTwilio().getRedirectUri();
                if (redirectUri == null || redirectUri.length() == 0) {
                    return null;
                }
                String verificationId2 = requestSilentNetworkAuth.getVerificationId();
                verificationId2.getClass();
                String redirectUri2 = requestSilentNetworkAuth.getTwilio().getRedirectUri();
                redirectUri2.getClass();
                return new C0303u7(verificationId2, redirectUri2);
            }
            if (requestSilentNetworkAuth.hasProve()) {
                String verificationId3 = requestSilentNetworkAuth.getVerificationId();
                verificationId3.getClass();
                return new C0293t6(verificationId3);
            }
        }
        return null;
    }
}
