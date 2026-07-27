package com.google.android.gms.common.api;

import D.y;
import L2.b;
import N2.C0318d;
import O2.w;
import Z2.e;
import android.app.Activity;
import android.app.PendingIntent;
import android.content.ActivityNotFoundException;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import com.anythink.core.common.d.j;

/* loaded from: classes.dex */
public class GoogleApiActivity extends Activity implements DialogInterface.OnCancelListener {

    /* renamed from: u, reason: collision with root package name */
    public static final /* synthetic */ int f23763u = 0;

    /* renamed from: n, reason: collision with root package name */
    public int f23764n = 0;

    @Override // android.app.Activity
    public final void onActivityResult(int i, int i4, Intent intent) {
        super.onActivityResult(i, i4, intent);
        if (i == 1) {
            boolean booleanExtra = getIntent().getBooleanExtra("notify_manager", true);
            this.f23764n = 0;
            setResult(i4, intent);
            if (booleanExtra) {
                C0318d e6 = C0318d.e(this);
                if (i4 == -1) {
                    e eVar = e6.f2052F;
                    eVar.sendMessage(eVar.obtainMessage(3));
                } else if (i4 == 0) {
                    e6.f(new b(13, null, null), getIntent().getIntExtra("failing_client_id", -1));
                }
            }
        } else if (i == 2) {
            this.f23764n = 0;
            setResult(i4, intent);
        }
        finish();
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        this.f23764n = 0;
        setResult(0);
        finish();
    }

    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) {
        GoogleApiActivity googleApiActivity;
        super.onCreate(bundle);
        if (bundle != null) {
            this.f23764n = bundle.getInt("resolution");
        }
        if (this.f23764n == 1) {
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
            L2.e.f1724d.d(this, num.intValue(), this);
            this.f23764n = 1;
            return;
        }
        try {
            googleApiActivity = this;
            try {
                googleApiActivity.startIntentSenderForResult(pendingIntent.getIntentSender(), 1, null, 0, 0, 0);
                googleApiActivity.f23764n = 1;
            } catch (ActivityNotFoundException e6) {
                e = e6;
                if (extras.getBoolean("notify_manager", true)) {
                    C0318d.e(this).f(new b(22, null, null), getIntent().getIntExtra("failing_client_id", -1));
                } else {
                    String obj = pendingIntent.toString();
                    String o9 = y.o(new StringBuilder(obj.length() + 36), "Activity not found while launching ", obj, j.f12535z);
                    if (Build.FINGERPRINT.contains("generic")) {
                        o9 = o9.concat(" This may occur when resolving Google Play services connection issues on emulators with Google APIs but not Google Play Store.");
                    }
                    Log.e("GoogleApiActivity", o9, e);
                }
                googleApiActivity.f23764n = 1;
                finish();
            } catch (IntentSender.SendIntentException e9) {
                e = e9;
                Log.e("GoogleApiActivity", "Failed to launch pendingIntent", e);
                finish();
            }
        } catch (ActivityNotFoundException e10) {
            e = e10;
            googleApiActivity = this;
        } catch (IntentSender.SendIntentException e11) {
            e = e11;
        }
    }

    @Override // android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        bundle.putInt("resolution", this.f23764n);
        super.onSaveInstanceState(bundle);
    }
}
