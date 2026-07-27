package com.google.firebase.messaging;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Locale;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import kotlin.text.CatchingFishAsyncTaskDagger;
import kotlin.text.CatchingFishDaggerBiometric;
import kotlin.text.CatchingFishFluxFirebase;
import kotlin.text.CatchingFishFluxFluxBundle;
import kotlin.text.CatchingFishFluxKtor;
import kotlin.text.CatchingFishGlideAdMobMVI;
import kotlin.text.CatchingFishMoshiWidgetMVP;
import kotlin.text.CatchingFishSnackbarIntent;
import kotlin.text.CatchingFishViewPagerMockk;
import kotlin.text.CatchingFishWorkManagerMVP;

/* loaded from: classes.dex */
public class FirebaseMessagingService extends EnhancedIntentService {
    public static final ArrayDeque CatchingFishCloudMessaging = new ArrayDeque(10);
    public CatchingFishGlideAdMobMVI CatchingFishFragmentHandler;

    /* JADX WARN: Removed duplicated region for block: B:22:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0161  */
    @Override // com.google.firebase.messaging.EnhancedIntentService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void CatchingFishCoroutine(Intent intent) {
        CatchingFishGlideAdMobMVI catchingFishGlideAdMobMVI;
        int i;
        String action = intent.getAction();
        if (!"com.google.android.c2dm.intent.RECEIVE".equals(action) && !"com.google.firebase.messaging.RECEIVE_DIRECT_BOOT".equals(action)) {
            if ("com.google.firebase.messaging.NEW_TOKEN".equals(action)) {
                intent.getStringExtra("token");
                return;
            } else {
                intent.getAction();
                return;
            }
        }
        String stringExtra = intent.getStringExtra("google.message_id");
        if (!TextUtils.isEmpty(stringExtra)) {
            ArrayDeque arrayDeque = CatchingFishCloudMessaging;
            if (!arrayDeque.contains(stringExtra)) {
                if (arrayDeque.size() >= 10) {
                    arrayDeque.remove();
                }
                arrayDeque.add(stringExtra);
            }
            if (this.CatchingFishFragmentHandler == null) {
                this.CatchingFishFragmentHandler = new CatchingFishGlideAdMobMVI(getApplicationContext());
            }
            catchingFishGlideAdMobMVI = this.CatchingFishFragmentHandler;
            if (catchingFishGlideAdMobMVI.CatchingFishCoroutine.CatchingFishParcelableFAB() >= 233700000) {
                new CatchingFishWorkManagerMVP().CatchingFishCloudMessaging(new IOException("SERVICE_NOT_AVAILABLE"));
                return;
            }
            Bundle bundle = new Bundle();
            String stringExtra2 = intent.getStringExtra("google.message_id");
            if (stringExtra2 == null) {
                stringExtra2 = intent.getStringExtra("message_id");
            }
            bundle.putString("google.message_id", stringExtra2);
            Integer valueOf = intent.hasExtra("google.product_id") ? Integer.valueOf(intent.getIntExtra("google.product_id", 0)) : null;
            if (valueOf != null) {
                bundle.putInt("google.product_id", valueOf.intValue());
            }
            CatchingFishFluxFirebase CatchingFishViewModelFAB = CatchingFishFluxFirebase.CatchingFishViewModelFAB(catchingFishGlideAdMobMVI.CatchingFishSnackbar);
            synchronized (CatchingFishViewModelFAB) {
                i = CatchingFishViewModelFAB.CatchingFishParcelableFAB;
                CatchingFishViewModelFAB.CatchingFishParcelableFAB = i + 1;
            }
            CatchingFishViewModelFAB.CatchingFishLayout(new CatchingFishFluxKtor(i, 3, bundle, 0));
            return;
        }
        String stringExtra3 = intent.getStringExtra("message_type");
        if (stringExtra3 == null) {
            stringExtra3 = "gcm";
        }
        switch (stringExtra3) {
            case "gcm":
                CatchingFishDaggerBiometric.CatchingFishPayPal(intent);
                Bundle extras = intent.getExtras();
                if (extras == null) {
                    extras = new Bundle();
                }
                extras.remove("androidx.content.wakelockid");
                if (CatchingFishViewPagerMockk.CatchingFishUnitTesting(extras)) {
                    CatchingFishViewPagerMockk catchingFishViewPagerMockk = new CatchingFishViewPagerMockk(extras);
                    ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor(new CatchingFishMoshiWidgetMVP("Firebase-Messaging-Network-Io"));
                    try {
                        if (!new CatchingFishAsyncTaskDagger(this, catchingFishViewPagerMockk, newSingleThreadExecutor).CatchingFishPayPalLiveData()) {
                            newSingleThreadExecutor.shutdown();
                            if (CatchingFishDaggerBiometric.CatchingFishGradleManifest(intent)) {
                                CatchingFishDaggerBiometric.CatchingFishCardViewView("_nf", intent.getExtras());
                                break;
                            }
                        } else {
                            break;
                        }
                    } finally {
                        newSingleThreadExecutor.shutdown();
                    }
                }
                break;
            case "send_error":
                if (intent.getStringExtra("google.message_id") == null) {
                    intent.getStringExtra("message_id");
                }
                String stringExtra4 = intent.getStringExtra("error");
                new CatchingFishSnackbarIntent(stringExtra4);
                if (stringExtra4 != null) {
                    stringExtra4.toLowerCase(Locale.US).getClass();
                    break;
                }
                break;
            case "send_event":
                intent.getStringExtra("google.message_id");
                break;
        }
        if (this.CatchingFishFragmentHandler == null) {
        }
        catchingFishGlideAdMobMVI = this.CatchingFishFragmentHandler;
        if (catchingFishGlideAdMobMVI.CatchingFishCoroutine.CatchingFishParcelableFAB() >= 233700000) {
        }
    }

    @Override // com.google.firebase.messaging.EnhancedIntentService
    public final Intent CatchingFishSnackbar(Intent intent) {
        return (Intent) ((ArrayDeque) CatchingFishFluxFluxBundle.CatchingFishRoomDatabase().CatchingFishViewModelScope).poll();
    }
}
