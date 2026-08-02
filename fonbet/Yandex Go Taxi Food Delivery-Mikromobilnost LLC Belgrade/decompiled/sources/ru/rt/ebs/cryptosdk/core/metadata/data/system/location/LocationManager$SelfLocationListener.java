package ru.rt.ebs.cryptosdk.core.metadata.data.system.location;

import android.location.Location;
import android.location.LocationListener;
import android.os.Bundle;
import defpackage.c3v;
import kotlin.Metadata;
import ru.cprocsp.ACSP.tools.common.ACSPConstants;

@Metadata(d1 = {"\u00000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0002\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ+\u0010\u0011\u001a\u00020\b2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u000e\u001a\u00020\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0013\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0015\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0015\u0010\u0014J\r\u0010\u0016\u001a\u00020\b¢\u0006\u0004\b\u0016\u0010\u0017R\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0003\u0010\u0018¨\u0006\u0019"}, d2 = {"ru/rt/ebs/cryptosdk/core/metadata/data/system/location/LocationManager$SelfLocationListener", "Landroid/location/LocationListener;", "Lc3v;", "locationListener", "<init>", "(Lc3v;)V", "Landroid/location/Location;", "location", "Lzy11;", "onLocationChanged", "(Landroid/location/Location;)V", "", "provider", "", ACSPConstants.STATUS, "Landroid/os/Bundle;", "extras", "onStatusChanged", "(Ljava/lang/String;ILandroid/os/Bundle;)V", "onProviderEnabled", "(Ljava/lang/String;)V", "onProviderDisabled", "release", "()V", "Lc3v;", "cryptosdk-core_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
final class LocationManager$SelfLocationListener implements LocationListener {
    private c3v locationListener;

    public LocationManager$SelfLocationListener(c3v c3vVar) {
        this.locationListener = c3vVar;
    }

    @Override // android.location.LocationListener
    public void onLocationChanged(Location location) {
        c3v c3vVar = this.locationListener;
        if (c3vVar != null) {
            c3vVar.onLocationChanged(location);
        }
    }

    @Override // android.location.LocationListener
    public void onProviderDisabled(String provider) {
    }

    @Override // android.location.LocationListener
    public void onProviderEnabled(String provider) {
    }

    @Override // android.location.LocationListener
    public void onStatusChanged(String provider, int status, Bundle extras) {
    }

    public final void release() {
        this.locationListener = null;
    }
}
