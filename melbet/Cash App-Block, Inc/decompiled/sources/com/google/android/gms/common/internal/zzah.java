package com.google.android.gms.common.internal;

import android.app.PendingIntent;
import android.content.ContentProviderClient;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;

/* loaded from: classes4.dex */
public abstract class zzah {
    public static final Uri zza = new Uri.Builder().scheme("content").authority("com.google.android.gms.chimera").build();

    public static Intent zza(Context context, zzn zznVar) {
        Bundle bundle;
        ContentProviderClient acquireUnstableContentProviderClient;
        String str = zznVar.zza;
        Intent intent = null;
        if (str == null) {
            return new Intent().setComponent(null);
        }
        if (zznVar.zze) {
            Bundle bundle2 = new Bundle();
            bundle2.putString("serviceActionBundleKey", str);
            try {
                acquireUnstableContentProviderClient = context.getContentResolver().acquireUnstableContentProviderClient(zza);
            } catch (RemoteException | IllegalArgumentException e) {
                Log.w("ServiceBindIntentUtils", "Dynamic intent resolution failed: ".concat(e.toString()));
                bundle = null;
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
                            StringBuilder sb = new StringBuilder(str.length() + 72);
                            sb.append("Dynamic lookup for intent failed for action ");
                            sb.append(str);
                            sb.append(" but has possible resolution");
                            Log.w("ServiceBindIntentUtils", sb.toString());
                            throw new zzaf(new ConnectionResult(25, pendingIntent, null));
                        }
                    }
                }
                if (intent == null) {
                    Log.w("ServiceBindIntentUtils", "Dynamic lookup for intent failed for action: ".concat(str));
                }
            } catch (Throwable th) {
                acquireUnstableContentProviderClient.release();
                throw th;
            }
        }
        return intent == null ? new Intent(str).setPackage(zznVar.zzb) : intent;
    }
}
