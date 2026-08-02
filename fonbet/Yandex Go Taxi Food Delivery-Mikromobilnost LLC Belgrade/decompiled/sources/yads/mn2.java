package yads;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.PowerManager;
import defpackage.rf71;
import ru.cprocsp.ACSP.tools.common.ACSPConstants;

/* loaded from: classes7.dex */
public final class mn2 implements Parcelable {
    public static final Parcelable.Creator<mn2> CREATOR = new ln2();
    public final int b;

    public mn2(int i) {
        this.b = (i & 2) != 0 ? i | 1 : i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0039, code lost:
    
        if (r5.hasCapability(16) != false) goto L18;
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:54:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int a(Context context) {
        int i;
        Intent registerReceiver;
        int intExtra;
        boolean z = true;
        if ((this.b & 1) != 0) {
            Object systemService = context.getSystemService("connectivity");
            systemService.getClass();
            ConnectivityManager connectivityManager = (ConnectivityManager) systemService;
            NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
                if (rf71.a >= 24) {
                    Network activeNetwork = connectivityManager.getActiveNetwork();
                    if (activeNetwork != null) {
                        try {
                            NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(activeNetwork);
                            if (networkCapabilities != null) {
                            }
                        } catch (SecurityException unused) {
                        }
                    }
                }
                if ((this.b & 2) != 0 && connectivityManager.isActiveNetworkMetered()) {
                    i = 2;
                    if ((this.b & 8) != 0 && ((registerReceiver = context.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"))) == null || ((intExtra = registerReceiver.getIntExtra(ACSPConstants.STATUS, -1)) != 2 && intExtra != 5))) {
                        i |= 8;
                    }
                    if ((this.b & 4) != 0) {
                        Object systemService2 = context.getSystemService("power");
                        systemService2.getClass();
                        PowerManager powerManager = (PowerManager) systemService2;
                        int i2 = rf71.a;
                        if (i2 >= 23) {
                            z = powerManager.isDeviceIdleMode();
                        } else if (i2 < 20 ? powerManager.isScreenOn() : powerManager.isInteractive()) {
                            z = false;
                        }
                        if (!z) {
                            i |= 4;
                        }
                    }
                    return ((this.b & 16) != 0 || context.registerReceiver(null, new IntentFilter("android.intent.action.DEVICE_STORAGE_LOW")) == null) ? i : i | 16;
                }
            }
            i = this.b & 3;
            if ((this.b & 8) != 0) {
                i |= 8;
            }
            if ((this.b & 4) != 0) {
            }
            if ((this.b & 16) != 0) {
                return i;
            }
        }
        i = 0;
        if ((this.b & 8) != 0) {
        }
        if ((this.b & 4) != 0) {
        }
        if ((this.b & 16) != 0) {
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && mn2.class == obj.getClass() && this.b == ((mn2) obj).b;
    }

    public final int hashCode() {
        return this.b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.b);
    }
}
