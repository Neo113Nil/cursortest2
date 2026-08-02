package ru.yandex.taxi.preorder.source.userposition.misc;

import android.location.LocationListener;
import android.os.Bundle;
import defpackage.jxi;
import kotlin.Metadata;
import ru.cprocsp.ACSP.tools.common.ACSPConstants;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0017¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\r\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000f\u0010\u000e¨\u0006\u0010"}, d2 = {"Lru/yandex/taxi/preorder/source/userposition/misc/LocationListenerAdapter;", "Landroid/location/LocationListener;", "<init>", "()V", "", "provider", "", ACSPConstants.STATUS, "Landroid/os/Bundle;", "extras", "Lzy11;", "onStatusChanged", "(Ljava/lang/String;ILandroid/os/Bundle;)V", "onProviderEnabled", "(Ljava/lang/String;)V", "onProviderDisabled", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes9.dex */
public abstract class LocationListenerAdapter implements LocationListener {
    @Override // android.location.LocationListener
    public void onProviderDisabled(String provider) {
    }

    @Override // android.location.LocationListener
    public void onProviderEnabled(String provider) {
    }

    @Override // android.location.LocationListener
    @jxi
    public void onStatusChanged(String provider, int status, Bundle extras) {
    }
}
