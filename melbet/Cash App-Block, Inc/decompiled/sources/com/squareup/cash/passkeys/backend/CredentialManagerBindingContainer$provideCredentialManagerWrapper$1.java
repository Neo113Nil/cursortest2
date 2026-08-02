package com.squareup.cash.passkeys.backend;

import android.app.Activity;
import androidx.credentials.CreatePublicKeyCredentialRequest;
import androidx.credentials.CredentialManagerImpl;
import com.squareup.cash.mri.android.RealMRIFactory$sign$2;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.scheduling.DefaultIoScheduler;
import kotlinx.coroutines.scheduling.DefaultScheduler;

/* loaded from: classes.dex */
public final class CredentialManagerBindingContainer$provideCredentialManagerWrapper$1 {
    public final /* synthetic */ Activity $activity;
    public final /* synthetic */ CredentialManagerImpl $credentialManager;

    public CredentialManagerBindingContainer$provideCredentialManagerWrapper$1(CredentialManagerImpl credentialManagerImpl, Activity activity) {
        this.$credentialManager = credentialManagerImpl;
        this.$activity = activity;
    }

    public final Object createCredential(CreatePublicKeyCredentialRequest createPublicKeyCredentialRequest, CredentialManagerPasskeyCreator$createCredential$1 credentialManagerPasskeyCreator$createCredential$1) {
        DefaultScheduler defaultScheduler = Dispatchers.Default;
        return JobKt.withContext(DefaultIoScheduler.INSTANCE, new RealMRIFactory$sign$2(this.$credentialManager, this.$activity, createPublicKeyCredentialRequest, null, 27), credentialManagerPasskeyCreator$createCredential$1);
    }
}
