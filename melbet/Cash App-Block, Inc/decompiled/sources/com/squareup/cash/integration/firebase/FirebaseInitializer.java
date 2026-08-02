package com.squareup.cash.integration.firebase;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Bundle;
import com.google.android.gms.common.internal.zzae;
import com.google.firebase.FirebaseApp;
import com.google.firebase.FirebaseOptions;
import com.squareup.cash.worker.ApplicationWorker;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import timber.log.Timber;

/* loaded from: classes.dex */
public final class FirebaseInitializer implements ApplicationWorker {
    public final Context context;

    public FirebaseInitializer(Context context) {
        this.context = context;
    }

    @Override // com.squareup.cash.worker.ApplicationWorker
    public final Object work(Continuation continuation) {
        Context context = this.context;
        try {
            ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128);
            applicationInfo.getClass();
            Bundle bundle = applicationInfo.metaData;
            String string2 = bundle.getString("com.google.firebase.API_KEY");
            string2.getClass();
            String string3 = bundle.getString("com.google.firebase.APP_ID");
            string3.getClass();
            String string4 = bundle.getString("com.google.firebase.PROJECT_ID");
            zzae.checkNotEmpty(string3, "ApplicationId must be set.");
            zzae.checkNotEmpty(string2, "ApiKey must be set.");
            FirebaseApp.initializeApp(context, new FirebaseOptions(string3, string2, string4));
            FirebaseApp.getInstance().setDataCollectionDefaultEnabled$1();
        } catch (IllegalStateException e) {
            Timber.Forest.e("failed to initialize FirebaseApp", new Object[0], e);
        }
        return Unit.INSTANCE;
    }
}
