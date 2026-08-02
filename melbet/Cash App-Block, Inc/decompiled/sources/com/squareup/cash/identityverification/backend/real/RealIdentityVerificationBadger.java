package com.squareup.cash.identityverification.backend.real;

import com.squareup.preferences.LongPreference;

/* loaded from: classes.dex */
public final class RealIdentityVerificationBadger {
    public final RealIdentityVerificationRepo identityVerificationRepo;
    public final LongPreference lastSeenIdentityVerificationVersion;

    public RealIdentityVerificationBadger(RealIdentityVerificationRepo realIdentityVerificationRepo, LongPreference longPreference) {
        this.identityVerificationRepo = realIdentityVerificationRepo;
        this.lastSeenIdentityVerificationVersion = longPreference;
    }
}
