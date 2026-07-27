package com.google.android.gms.common.api;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.ActivityNotFoundException;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Build;
import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;
import kotlin.text.CatchingFishAdMobAdMob;
import kotlin.text.CatchingFishExoPlayerGson;
import kotlin.text.CatchingFishPayPalRedux;
import kotlin.text.CatchingFishToastHiltBundle;

/* loaded from: classes.dex */
public class GoogleApiActivity extends Activity implements DialogInterface.OnCancelListener {
    public static final /* synthetic */ int CatchingFishDaggerWebsocket = 0;
    public int CatchingFishReduxKtor = 0;

    @Override // android.app.Activity
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 1) {
            boolean booleanExtra = getIntent().getBooleanExtra("notify_manager", true);
            this.CatchingFishReduxKtor = 0;
            setResult(i2, intent);
            if (booleanExtra) {
                CatchingFishExoPlayerGson CatchingFishCoroutine = CatchingFishExoPlayerGson.CatchingFishCoroutine(this);
                if (i2 == -1) {
                    CatchingFishPayPalRedux catchingFishPayPalRedux = CatchingFishCoroutine.CatchingFishOkHttp;
                    catchingFishPayPalRedux.sendMessage(catchingFishPayPalRedux.obtainMessage(3));
                } else if (i2 == 0) {
                    CatchingFishCoroutine.CatchingFishWorkManager(new ConnectionResult(13, null, null), getIntent().getIntExtra("failing_client_id", -1));
                }
            }
        } else if (i == 2) {
            this.CatchingFishReduxKtor = 0;
            setResult(i2, intent);
        }
        finish();
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        this.CatchingFishReduxKtor = 0;
        setResult(0);
        finish();
    }

    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) {
        GoogleApiActivity googleApiActivity;
        super.onCreate(bundle);
        if (bundle != null) {
            this.CatchingFishReduxKtor = bundle.getInt("resolution");
        }
        if (this.CatchingFishReduxKtor != 1) {
            Bundle extras = getIntent().getExtras();
            if (extras == null) {
                finish();
                return;
            }
            PendingIntent pendingIntent = (PendingIntent) extras.get("pending_intent");
            Integer num = (Integer) extras.get("error_code");
            if (pendingIntent == null && num == null) {
                finish();
                return;
            }
            if (pendingIntent == null) {
                CatchingFishToastHiltBundle.CatchingFishAnimationMockk(num);
                CatchingFishAdMobAdMob.CatchingFishDaggerWebsocket.CatchingFishCoroutine(this, num.intValue(), this);
                this.CatchingFishReduxKtor = 1;
                return;
            }
            try {
                googleApiActivity = this;
            } catch (ActivityNotFoundException unused) {
                googleApiActivity = this;
            } catch (IntentSender.SendIntentException unused2) {
            }
            try {
                googleApiActivity.startIntentSenderForResult(pendingIntent.getIntentSender(), 1, null, 0, 0, 0);
                googleApiActivity.CatchingFishReduxKtor = 1;
            } catch (ActivityNotFoundException unused3) {
                if (extras.getBoolean("notify_manager", true)) {
                    CatchingFishExoPlayerGson.CatchingFishCoroutine(this).CatchingFishWorkManager(new ConnectionResult(22, null, null), getIntent().getIntExtra("failing_client_id", -1));
                } else {
                    String obj = pendingIntent.toString();
                    StringBuilder sb = new StringBuilder(obj.length() + 36);
                    sb.append("Activity not found while launching ");
                    sb.append(obj);
                    sb.append(".");
                    String sb2 = sb.toString();
                    if (Build.FINGERPRINT.contains("generic")) {
                        sb2.concat(" This may occur when resolving Google Play services connection issues on emulators with Google APIs but not Google Play Store.");
                    }
                }
                googleApiActivity.CatchingFishReduxKtor = 1;
                finish();
            } catch (IntentSender.SendIntentException unused4) {
                finish();
            }
        }
    }

    @Override // android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        bundle.putInt("resolution", this.CatchingFishReduxKtor);
        super.onSaveInstanceState(bundle);
    }
}
