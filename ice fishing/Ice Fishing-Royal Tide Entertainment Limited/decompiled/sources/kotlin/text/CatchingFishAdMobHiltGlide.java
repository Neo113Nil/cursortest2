package kotlin.text;

import android.app.PendingIntent;
import android.content.ContentProviderClient;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.ConnectionResult;

/* loaded from: classes.dex */
public abstract class CatchingFishAdMobHiltGlide {
    public static final Uri CatchingFishParcelableFAB = new Uri.Builder().scheme("content").authority("com.google.android.gms.chimera").build();

    /* JADX WARN: Removed duplicated region for block: B:18:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0095 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Intent CatchingFishParcelableFAB(Context context, CatchingFishXMLLayoutView catchingFishXMLLayoutView) {
        Bundle bundle;
        ContentProviderClient acquireUnstableContentProviderClient;
        String str = catchingFishXMLLayoutView.CatchingFishParcelableFAB;
        Intent intent = null;
        if (str == null) {
            return new Intent().setComponent(null);
        }
        if (catchingFishXMLLayoutView.CatchingFishCoroutine) {
            Bundle bundle2 = new Bundle();
            bundle2.putString("serviceActionBundleKey", str);
            try {
                acquireUnstableContentProviderClient = context.getContentResolver().acquireUnstableContentProviderClient(CatchingFishParcelableFAB);
            } catch (RemoteException e) {
                e = e;
                "Dynamic intent resolution failed: ".concat(e.toString());
                bundle = null;
                if (bundle != null) {
                }
                if (intent == null) {
                }
                if (intent == null) {
                }
            } catch (IllegalArgumentException e2) {
                e = e2;
                "Dynamic intent resolution failed: ".concat(e.toString());
                bundle = null;
                if (bundle != null) {
                }
                if (intent == null) {
                }
                if (intent == null) {
                }
            }
            if (acquireUnstableContentProviderClient == null) {
                throw new RemoteException("Failed to acquire ContentProviderClient");
            }
            try {
                bundle = acquireUnstableContentProviderClient.call("serviceIntentCall", null, bundle2);
                acquireUnstableContentProviderClient.release();
                if (bundle != null) {
                    Intent intent2 = (Intent) bundle.getParcelable("serviceResponseIntentKey");
                    if (intent2 != null) {
                        intent = intent2;
                    } else {
                        PendingIntent pendingIntent = (PendingIntent) bundle.getParcelable("serviceMissingResolutionIntentKey");
                        if (pendingIntent != null) {
                            new StringBuilder(str.length() + 72);
                            throw new CatchingFishFABIntentMVI(new ConnectionResult(25, pendingIntent, null));
                        }
                    }
                }
                if (intent == null) {
                    "Dynamic lookup for intent failed for action: ".concat(str);
                }
            } catch (Throwable th) {
                acquireUnstableContentProviderClient.release();
                throw th;
            }
        }
        return intent == null ? new Intent(str).setPackage(catchingFishXMLLayoutView.CatchingFishSnackbar) : intent;
    }
}
