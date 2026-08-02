package com.google.android.gms.common.api;

import D.x;
import O2.b;
import Q2.C0359d;
import R2.w;
import android.app.Activity;
import android.app.PendingIntent;
import android.content.ActivityNotFoundException;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import c3.e;
import com.anythink.core.common.d.j;

/* loaded from: classes.dex */
public class GoogleApiActivity extends Activity implements DialogInterface.OnCancelListener {

    /* renamed from: u, reason: collision with root package name */
    public static final /* synthetic */ int f24390u = 0;

    /* renamed from: n, reason: collision with root package name */
    public int f24391n = 0;

    @Override // android.app.Activity
    public final void onActivityResult(int i, int i4, Intent intent) {
        super.onActivityResult(i, i4, intent);
        if (i == 1) {
            boolean booleanExtra = getIntent().getBooleanExtra("notify_manager", true);
            this.f24391n = 0;
            setResult(i4, intent);
            if (booleanExtra) {
                C0359d e9 = C0359d.e(this);
                if (i4 == -1) {
                    e eVar = e9.f2553F;
                    eVar.sendMessage(eVar.obtainMessage(3));
                } else if (i4 == 0) {
                    e9.f(new b(13, null, null), getIntent().getIntExtra("failing_client_id", -1));
                }
            }
        } else if (i == 2) {
            this.f24391n = 0;
            setResult(i4, intent);
        }
        finish();
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        this.f24391n = 0;
        setResult(0);
        finish();
    }

    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) {
        GoogleApiActivity googleApiActivity;
        super.onCreate(bundle);
        if (bundle != null) {
            this.f24391n = bundle.getInt("resolution");
        }
        if (this.f24391n == 1) {
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
            w.h(num);
            O2.e.f2268d.d(this, num.intValue(), this);
            this.f24391n = 1;
            return;
        }
        try {
            googleApiActivity = this;
            try {
                googleApiActivity.startIntentSenderForResult(pendingIntent.getIntentSender(), 1, null, 0, 0, 0);
                googleApiActivity.f24391n = 1;
            } catch (ActivityNotFoundException e9) {
                e = e9;
                if (extras.getBoolean("notify_manager", true)) {
                    C0359d.e(this).f(new b(22, null, null), getIntent().getIntExtra("failing_client_id", -1));
                } else {
                    String obj = pendingIntent.toString();
                    String p9 = x.p(new StringBuilder(obj.length() + 36), "Activity not found while launching ", obj, j.f13164z);
                    if (Build.FINGERPRINT.contains("generic")) {
                        p9 = p9.concat(" This may occur when resolving Google Play services connection issues on emulators with Google APIs but not Google Play Store.");
                    }
                    Log.e("GoogleApiActivity", p9, e);
                }
                googleApiActivity.f24391n = 1;
                finish();
            } catch (IntentSender.SendIntentException e10) {
                e = e10;
                Log.e("GoogleApiActivity", "Failed to launch pendingIntent", e);
                finish();
            }
        } catch (ActivityNotFoundException e11) {
            e = e11;
            googleApiActivity = this;
        } catch (IntentSender.SendIntentException e12) {
            e = e12;
        }
    }

    @Override // android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        bundle.putInt("resolution", this.f24391n);
        super.onSaveInstanceState(bundle);
    }
}
