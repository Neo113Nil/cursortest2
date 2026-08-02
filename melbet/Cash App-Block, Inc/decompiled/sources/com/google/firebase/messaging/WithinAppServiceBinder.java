package com.google.firebase.messaging;

import android.os.Binder;
import android.os.Process;
import android.util.Log;
import androidx.arch.core.executor.ArchTaskExecutor$$ExternalSyntheticLambda0;
import com.google.android.material.button.MaterialButton$$ExternalSyntheticLambda3;
import com.google.firebase.messaging.WithinAppServiceConnection;
import com.nimbusds.jose.jca.JCAContext;

/* loaded from: classes4.dex */
public final class WithinAppServiceBinder extends Binder {
    public final JCAContext intentHandler;

    public WithinAppServiceBinder(JCAContext jCAContext) {
        this.intentHandler = jCAContext;
    }

    public final void send(WithinAppServiceConnection.BindRequest bindRequest) {
        if (Binder.getCallingUid() != Process.myUid()) {
            throw new SecurityException("Binding only allowed within app");
        }
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "service received new intent via bind strategy");
        }
        EnhancedIntentService.access$000((EnhancedIntentService) this.intentHandler.provider, bindRequest.intent).addOnCompleteListener(new ArchTaskExecutor$$ExternalSyntheticLambda0(1), new MaterialButton$$ExternalSyntheticLambda3(bindRequest, 7));
    }
}
