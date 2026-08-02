package com.google.android.gms.location;

import android.location.Location;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import androidx.core.view.DisplayCompat;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.zzae;
import com.google.android.gms.internal.location.zzeo;
import com.google.android.gms.maps.zzac;
import com.squareup.cash.directory_ui.views.MooncakeHeaderViewKt;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes4.dex */
public final class LocationResult extends AbstractSafeParcelable implements ReflectedParcelable {
    public final List zzb;
    public static final List zza = Collections.EMPTY_LIST;
    public static final Parcelable.Creator<LocationResult> CREATOR = new zzac(9);

    public LocationResult(List list) {
        this.zzb = list;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof LocationResult)) {
            return false;
        }
        List list = ((LocationResult) obj).zzb;
        int i = Build.VERSION.SDK_INT;
        List<Location> list2 = this.zzb;
        if (i >= 31) {
            return list2.equals(list);
        }
        if (list2.size() != list.size()) {
            return false;
        }
        Iterator it = list.iterator();
        for (Location location : list2) {
            Location location2 = (Location) it.next();
            if (Double.compare(location.getLatitude(), location2.getLatitude()) != 0 || Double.compare(location.getLongitude(), location2.getLongitude()) != 0 || location.getTime() != location2.getTime() || location.getElapsedRealtimeNanos() != location2.getElapsedRealtimeNanos() || !zzae.equal(location.getProvider(), location2.getProvider())) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.zzb});
    }

    public final String toString() {
        String l;
        StringBuilder sb = new StringBuilder("LocationResult");
        DecimalFormat decimalFormat = zzak.zzb;
        List<Location> list = this.zzb;
        sb.ensureCapacity(list.size() * 100);
        sb.append("[");
        boolean z = false;
        for (Location location : list) {
            DecimalFormat decimalFormat2 = zzak.zzc;
            sb.ensureCapacity(100);
            if (location == null) {
                sb.append((String) null);
            } else {
                sb.append("{");
                sb.append(location.getProvider());
                sb.append(", ");
                if (Build.VERSION.SDK_INT >= 31 ? DisplayCompat.isMock(location) : location.isFromMockProvider()) {
                    sb.append("mock, ");
                }
                DecimalFormat decimalFormat3 = zzak.zzb;
                sb.append(decimalFormat3.format(location.getLatitude()));
                sb.append(",");
                sb.append(decimalFormat3.format(location.getLongitude()));
                if (location.hasAccuracy()) {
                    sb.append("±");
                    sb.append(decimalFormat2.format(location.getAccuracy()));
                    sb.append("m");
                }
                if (location.hasAltitude()) {
                    sb.append(", alt=");
                    sb.append(decimalFormat2.format(location.getAltitude()));
                    if (location.hasVerticalAccuracy()) {
                        sb.append("±");
                        sb.append(decimalFormat2.format(location.getVerticalAccuracyMeters()));
                    }
                    sb.append("m");
                }
                if (location.hasSpeed()) {
                    sb.append(", spd=");
                    sb.append(decimalFormat2.format(location.getSpeed()));
                    if (location.hasSpeedAccuracy()) {
                        sb.append("±");
                        sb.append(decimalFormat2.format(location.getSpeedAccuracyMetersPerSecond()));
                    }
                    sb.append("m/s");
                }
                if (location.hasBearing()) {
                    sb.append(", brg=");
                    sb.append(decimalFormat2.format(location.getBearing()));
                    if (location.hasBearingAccuracy()) {
                        sb.append("±");
                        sb.append(decimalFormat2.format(location.getBearingAccuracyDegrees()));
                    }
                    sb.append("°");
                }
                Bundle extras = location.getExtras();
                String string2 = extras != null ? extras.getString("floorLabel") : null;
                if (string2 != null) {
                    sb.append(", fl=");
                    sb.append(string2);
                }
                Bundle extras2 = location.getExtras();
                String string3 = extras2 != null ? extras2.getString("levelId") : null;
                if (string3 != null) {
                    sb.append(", lv=");
                    sb.append(string3);
                }
                long currentTimeMillis = System.currentTimeMillis() - SystemClock.elapsedRealtime();
                sb.append(", ert=");
                long elapsedRealtimeNanos = (location.getElapsedRealtimeNanos() / 1000000) + currentTimeMillis;
                if (elapsedRealtimeNanos >= 0) {
                    l = zzeo.zza.format(new Date(elapsedRealtimeNanos));
                } else {
                    SimpleDateFormat simpleDateFormat = zzeo.zza;
                    l = Long.toString(elapsedRealtimeNanos);
                }
                sb.append(l);
                sb.append('}');
            }
            sb.append(", ");
            z = true;
        }
        if (z) {
            sb.setLength(sb.length() - 2);
        }
        sb.append("]");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int zzb = MooncakeHeaderViewKt.zzb(parcel, 20293);
        MooncakeHeaderViewKt.writeTypedList(parcel, 1, this.zzb);
        MooncakeHeaderViewKt.zzc(parcel, zzb);
    }
}
