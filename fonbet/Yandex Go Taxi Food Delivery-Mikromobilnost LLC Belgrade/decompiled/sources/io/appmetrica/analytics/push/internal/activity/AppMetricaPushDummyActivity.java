package io.appmetrica.analytics.push.internal.activity;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import io.appmetrica.analytics.push.coreutils.internal.utils.TrackersHub;
import io.appmetrica.analytics.push.impl.C1049k1;
import io.appmetrica.analytics.push.impl.r;

/* loaded from: classes4.dex */
public class AppMetricaPushDummyActivity extends Activity {
    @Override // android.app.Activity
    public void onResume() {
        super.onResume();
        try {
            Context applicationContext = getApplicationContext();
            Intent intent = getIntent();
            r.a(applicationContext).f.b().getClass();
            C1049k1.a(applicationContext, intent);
            finish();
        } catch (Throwable th) {
            TrackersHub.getInstance().reportError("Failed to handle notification action", th);
        }
    }
}
