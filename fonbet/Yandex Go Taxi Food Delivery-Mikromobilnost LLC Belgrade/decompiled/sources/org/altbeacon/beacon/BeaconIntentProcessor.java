package org.altbeacon.beacon;

import android.app.IntentService;
import android.content.Intent;
import defpackage.y7w;

/* loaded from: classes4.dex */
public class BeaconIntentProcessor extends IntentService {
    private static final String TAG = "BeaconIntentProcessor";

    public BeaconIntentProcessor() {
        super(TAG);
    }

    @Override // android.app.IntentService
    public void onHandleIntent(Intent intent) {
        new y7w();
        y7w.a(getApplicationContext(), intent);
    }
}
