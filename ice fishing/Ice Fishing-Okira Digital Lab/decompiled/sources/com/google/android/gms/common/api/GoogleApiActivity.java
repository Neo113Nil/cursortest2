package com.google.android.gms.common.api;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.ActivityNotFoundException;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Build;
import android.os.Bundle;
import androidx.versionedparcelable.SolarMeshRegistryObserverUJFTy91xkPUtX5JOOQ52590879128148;
import androidx.versionedparcelable.UltraBufferAbstractionProtocolTgaQyeo9rnw00yYZjg19326817840326;
import androidx.versionedparcelable.YellowLoopStoragePayloadVFtu5CxYzqP8AEqxI345075376816214;
import androidx.versionedparcelable.ZenithPathBinaryInterfaceJPvSokakdHX9LAzKqB54416701949648;
import com.google.android.gms.common.ConnectionResult;

/* compiled from: r8-map-id-30b448d4aea92b7ca08aa98ecb87d6bc49bf391f2fd37f06e0a9b205a292647a */
/* loaded from: classes.dex */
public class GoogleApiActivity extends Activity implements DialogInterface.OnCancelListener {
    public static final /* synthetic */ int LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119 = 0;
    public int RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867 = 0;

    @Override // android.app.Activity
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 1) {
            boolean booleanExtra = getIntent().getBooleanExtra("notify_manager", true);
            this.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867 = 0;
            setResult(i2, intent);
            if (booleanExtra) {
                UltraBufferAbstractionProtocolTgaQyeo9rnw00yYZjg19326817840326 RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867 = UltraBufferAbstractionProtocolTgaQyeo9rnw00yYZjg19326817840326.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867(this);
                if (i2 == -1) {
                    ZenithPathBinaryInterfaceJPvSokakdHX9LAzKqB54416701949648 zenithPathBinaryInterfaceJPvSokakdHX9LAzKqB54416701949648 = RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867.ObsidianEngineTokenDecoderIG41scEIZAujyeJD0i27475043832834;
                    zenithPathBinaryInterfaceJPvSokakdHX9LAzKqB54416701949648.sendMessage(zenithPathBinaryInterfaceJPvSokakdHX9LAzKqB54416701949648.obtainMessage(3));
                } else if (i2 == 0) {
                    RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119(new ConnectionResult(13, null), getIntent().getIntExtra("failing_client_id", -1));
                }
            }
        } else if (i == 2) {
            this.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867 = 0;
            setResult(i2, intent);
        }
        finish();
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        this.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867 = 0;
        setResult(0);
        finish();
    }

    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) {
        GoogleApiActivity googleApiActivity;
        super.onCreate(bundle);
        if (bundle != null) {
            this.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867 = bundle.getInt("resolution");
        }
        if (this.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867 != 1) {
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
                YellowLoopStoragePayloadVFtu5CxYzqP8AEqxI345075376816214.PhotonFrameFilterJITAeT2SDHL9pSK7KtI7w36828414417036(num);
                SolarMeshRegistryObserverUJFTy91xkPUtX5JOOQ52590879128148.ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495.ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495(this, num.intValue(), this);
                this.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867 = 1;
                return;
            }
            try {
                googleApiActivity = this;
            } catch (ActivityNotFoundException unused) {
                googleApiActivity = this;
            } catch (IntentSender.SendIntentException unused2) {
                googleApiActivity = this;
            }
            try {
                googleApiActivity.startIntentSenderForResult(pendingIntent.getIntentSender(), 1, null, 0, 0, 0);
                googleApiActivity.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867 = 1;
            } catch (ActivityNotFoundException unused3) {
                if (extras.getBoolean("notify_manager", true)) {
                    UltraBufferAbstractionProtocolTgaQyeo9rnw00yYZjg19326817840326.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867(googleApiActivity).LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119(new ConnectionResult(22, null), googleApiActivity.getIntent().getIntExtra("failing_client_id", -1));
                } else {
                    String str = "Activity not found while launching " + pendingIntent.toString() + ".";
                    if (Build.FINGERPRINT.contains("generic")) {
                        str.concat(" This may occur when resolving Google Play services connection issues on emulators with Google APIs but not Google Play Store.");
                    }
                }
                googleApiActivity.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867 = 1;
                googleApiActivity.finish();
            } catch (IntentSender.SendIntentException unused4) {
                googleApiActivity.finish();
            }
        }
    }

    @Override // android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        bundle.putInt("resolution", this.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867);
        super.onSaveInstanceState(bundle);
    }
}
