package com.google.firebase.installations;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.installations.local.AutoValue_PersistedInstallationEntry;

/* loaded from: classes4.dex */
public final class GetAuthTokenListener implements StateListener {
    public final TaskCompletionSource resultTaskCompletionSource;

    /* renamed from: utils, reason: collision with root package name */
    public final Utils f1008utils;

    public GetAuthTokenListener(Utils utils2, TaskCompletionSource taskCompletionSource) {
        this.f1008utils = utils2;
        this.resultTaskCompletionSource = taskCompletionSource;
    }

    @Override // com.google.firebase.installations.StateListener
    public final boolean onException(Exception exc) {
        this.resultTaskCompletionSource.trySetException(exc);
        return true;
    }

    @Override // com.google.firebase.installations.StateListener
    public final boolean onStateReached(AutoValue_PersistedInstallationEntry autoValue_PersistedInstallationEntry) {
        if (autoValue_PersistedInstallationEntry.registrationStatus == 4 && !this.f1008utils.isAuthTokenExpired(autoValue_PersistedInstallationEntry)) {
            String str = autoValue_PersistedInstallationEntry.authToken;
            if (str != null) {
                this.resultTaskCompletionSource.setResult(new AutoValue_InstallationTokenResult(autoValue_PersistedInstallationEntry.expiresInSecs, autoValue_PersistedInstallationEntry.tokenCreationEpochInSecs, str));
                return true;
            }
            a$$ExternalSyntheticBUOutline0.m$2("Null token");
        }
        return false;
    }
}
