package com.google.android.gms.common.api;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.ActivityNotFoundException;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import com.gamericefishpro.space.f9.e;
import com.gamericefishpro.space.s8.b;
import com.gamericefishpro.space.t0.y0;
import com.gamericefishpro.space.u8.d;
import com.gamericefishpro.space.v8.c0;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public class GoogleApiActivity extends Activity implements DialogInterface.OnCancelListener {
    public static final /* synthetic */ int e = 0;
    public int d = 0;

    @Override // android.app.Activity
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 1) {
            boolean booleanExtra = getIntent().getBooleanExtra("notify_manager", true);
            this.d = 0;
            setResult(i2, intent);
            if (booleanExtra) {
                d dVarD = d.d(this);
                if (i2 == -1) {
                    e eVar = dVarD.F;
                    eVar.sendMessage(eVar.obtainMessage(3));
                } else if (i2 == 0) {
                    dVarD.e(new b(13, null, null), getIntent().getIntExtra("failing_client_id", -1));
                }
            }
        } else if (i == 2) {
            this.d = 0;
            setResult(i2, intent);
        }
        finish();
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        this.d = 0;
        setResult(0);
        finish();
    }

    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) {
        GoogleApiActivity googleApiActivity;
        super.onCreate(bundle);
        if (bundle != null) {
            this.d = bundle.getInt("resolution");
        }
        if (this.d == 1) {
            return;
        }
        Bundle extras = getIntent().getExtras();
        if (extras == null) {
            Log.e("GoogleApiActivity", "Activity started without extras");
            finish();
            return;
        }
        PendingIntent pendingIntent = (PendingIntent) extras.get("pending_intent");
        Integer num = (Integer) extras.get("error_code");
        if (pendingIntent == null && num == null) {
            Log.e("GoogleApiActivity", "Activity started without resolution");
            finish();
            return;
        }
        if (pendingIntent == null) {
            c0.g(num);
            com.gamericefishpro.space.s8.e.d.c(this, num.intValue(), this);
            this.d = 1;
            return;
        }
        try {
            googleApiActivity = this;
            try {
                googleApiActivity.startIntentSenderForResult(pendingIntent.getIntentSender(), 1, null, 0, 0, 0);
                googleApiActivity.d = 1;
            } catch (ActivityNotFoundException e2) {
                e = e2;
                if (extras.getBoolean("notify_manager", true)) {
                    d.d(this).e(new b(22, null, null), getIntent().getIntExtra("failing_client_id", -1));
                } else {
                    String strG = y0.g("Activity not found while launching ", pendingIntent.toString(), ".");
                    if (Build.FINGERPRINT.contains("generic")) {
                        strG = strG.concat(" This may occur when resolving Google Play services connection issues on emulators with Google APIs but not Google Play Store.");
                    }
                    Log.e("GoogleApiActivity", strG, e);
                }
                googleApiActivity.d = 1;
                finish();
            } catch (IntentSender.SendIntentException e3) {
                e = e3;
                Log.e("GoogleApiActivity", "Failed to launch pendingIntent", e);
                finish();
            }
        } catch (ActivityNotFoundException e4) {
            e = e4;
            googleApiActivity = this;
        } catch (IntentSender.SendIntentException e5) {
            e = e5;
        }
    }

    @Override // android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        bundle.putInt("resolution", this.d);
        super.onSaveInstanceState(bundle);
    }
}
