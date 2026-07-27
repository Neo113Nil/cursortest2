package com.onesignal.user.internal.operations.impl.executors;

/* loaded from: classes2.dex */
public abstract class c {
    public static final f resolveBackendParams(D4.g op, String onesignalId, com.onesignal.user.internal.jwt.c jwtTokenStore, com.onesignal.core.internal.config.impl.c identityVerificationService) {
        kotlin.jvm.internal.h.e(op, "op");
        kotlin.jvm.internal.h.e(onesignalId, "onesignalId");
        kotlin.jvm.internal.h.e(jwtTokenStore, "jwtTokenStore");
        kotlin.jvm.internal.h.e(identityVerificationService, "identityVerificationService");
        return identityVerificationService.getNewCodePathsRun() ? resolveIvBackendParams(op, onesignalId, jwtTokenStore, identityVerificationService.getIvBehaviorActive()) : f.Companion.legacyFor(onesignalId);
    }

    public static final f resolveIvBackendParams(D4.g op, String onesignalId, com.onesignal.user.internal.jwt.c jwtTokenStore, boolean z8) {
        kotlin.jvm.internal.h.e(op, "op");
        kotlin.jvm.internal.h.e(onesignalId, "onesignalId");
        kotlin.jvm.internal.h.e(jwtTokenStore, "jwtTokenStore");
        if (!z8) {
            return f.Companion.legacyFor(onesignalId);
        }
        String externalId = op.getExternalId();
        if (externalId != null) {
            return new f("external_id", externalId, jwtTokenStore.getJwt(externalId));
        }
        com.onesignal.debug.internal.logging.b.error$default("IV active but op has null externalId; falling back to onesignal_id", null, 2, null);
        return f.Companion.legacyFor(onesignalId);
    }

    public static final String resolveIvJwt(D4.g op, com.onesignal.user.internal.jwt.c jwtTokenStore, boolean z8) {
        String externalId;
        kotlin.jvm.internal.h.e(op, "op");
        kotlin.jvm.internal.h.e(jwtTokenStore, "jwtTokenStore");
        if (z8 && (externalId = op.getExternalId()) != null) {
            return jwtTokenStore.getJwt(externalId);
        }
        return null;
    }

    public static final String resolveJwt(D4.g op, com.onesignal.user.internal.jwt.c jwtTokenStore, com.onesignal.core.internal.config.impl.c identityVerificationService) {
        kotlin.jvm.internal.h.e(op, "op");
        kotlin.jvm.internal.h.e(jwtTokenStore, "jwtTokenStore");
        kotlin.jvm.internal.h.e(identityVerificationService, "identityVerificationService");
        if (identityVerificationService.getNewCodePathsRun()) {
            return resolveIvJwt(op, jwtTokenStore, identityVerificationService.getIvBehaviorActive());
        }
        return null;
    }

    public static final boolean shouldFailLoginUserFromSubscription(boolean z8) {
        return z8;
    }
}
