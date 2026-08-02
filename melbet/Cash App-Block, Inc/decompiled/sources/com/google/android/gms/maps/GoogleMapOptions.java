package com.google.android.gms.maps;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import androidx.recyclerview.widget.RecyclerView;
import androidx.work.impl.WorkLauncherImpl;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.directory_ui.views.MooncakeHeaderViewKt;

/* loaded from: classes4.dex */
public final class GoogleMapOptions extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<GoogleMapOptions> CREATOR = new zzac(0);
    public static final Integer zza = Integer.valueOf(Color.argb(255, EnumC0170g.SDK_ASSET_ILLUSTRATION_INSTITUTION_TRANSFER_CIRCLE_VALUE, EnumC0170g.SDK_ASSET_ILLUSTRATION_INFOCARD_BANKSTATEMENT_VALUE, EnumC0170g.SDK_ASSET_ILLUSTRATION_ACCOUNT_NUMBER_SEARCH_CIRCLE_VALUE));
    public Boolean zzb;
    public Boolean zzc;
    public CameraPosition zze;
    public Boolean zzf;
    public Boolean zzg;
    public Boolean zzh;
    public Boolean zzi;
    public Boolean zzj;
    public Boolean zzk;
    public Boolean zzl;
    public Boolean zzm;
    public Boolean zzn;
    public Boolean zzr;
    public int zzu;
    public int zzd = -1;
    public Float zzo = null;
    public Float zzp = null;
    public LatLngBounds zzq = null;
    public Integer zzs = null;
    public String zzt = null;

    public static GoogleMapOptions createFromAttributes(Context context, AttributeSet attributeSet) {
        String string2;
        LatLngBounds latLngBounds = null;
        if (context == null || attributeSet == null) {
            return null;
        }
        Resources resources = context.getResources();
        int[] iArr = R$styleable.MapAttrs;
        TypedArray obtainAttributes = resources.obtainAttributes(attributeSet, iArr);
        GoogleMapOptions googleMapOptions = new GoogleMapOptions();
        if (obtainAttributes.hasValue(16)) {
            googleMapOptions.zzd = obtainAttributes.getInt(16, -1);
        }
        if (obtainAttributes.hasValue(26)) {
            googleMapOptions.zzb = Boolean.valueOf(obtainAttributes.getBoolean(26, false));
        }
        if (obtainAttributes.hasValue(25)) {
            googleMapOptions.zzc = Boolean.valueOf(obtainAttributes.getBoolean(25, false));
        }
        if (obtainAttributes.hasValue(17)) {
            googleMapOptions.zzg = Boolean.valueOf(obtainAttributes.getBoolean(17, true));
        }
        if (obtainAttributes.hasValue(19)) {
            googleMapOptions.zzk = Boolean.valueOf(obtainAttributes.getBoolean(19, true));
        }
        if (obtainAttributes.hasValue(21)) {
            googleMapOptions.zzr = Boolean.valueOf(obtainAttributes.getBoolean(21, true));
        }
        if (obtainAttributes.hasValue(20)) {
            googleMapOptions.zzh = Boolean.valueOf(obtainAttributes.getBoolean(20, true));
        }
        if (obtainAttributes.hasValue(22)) {
            googleMapOptions.zzj = Boolean.valueOf(obtainAttributes.getBoolean(22, true));
        }
        if (obtainAttributes.hasValue(24)) {
            googleMapOptions.zzi = Boolean.valueOf(obtainAttributes.getBoolean(24, true));
        }
        if (obtainAttributes.hasValue(23)) {
            googleMapOptions.zzf = Boolean.valueOf(obtainAttributes.getBoolean(23, true));
        }
        if (obtainAttributes.hasValue(13)) {
            googleMapOptions.zzl = Boolean.valueOf(obtainAttributes.getBoolean(13, false));
        }
        if (obtainAttributes.hasValue(18)) {
            googleMapOptions.zzm = Boolean.valueOf(obtainAttributes.getBoolean(18, true));
        }
        if (obtainAttributes.hasValue(0)) {
            googleMapOptions.zzn = Boolean.valueOf(obtainAttributes.getBoolean(0, false));
        }
        if (obtainAttributes.hasValue(4)) {
            googleMapOptions.zzo = Float.valueOf(obtainAttributes.getFloat(4, Float.NEGATIVE_INFINITY));
        }
        if (obtainAttributes.hasValue(4)) {
            googleMapOptions.zzp = Float.valueOf(obtainAttributes.getFloat(3, Float.POSITIVE_INFINITY));
        }
        if (obtainAttributes.hasValue(1)) {
            googleMapOptions.zzs = Integer.valueOf(obtainAttributes.getColor(1, zza.intValue()));
        }
        if (obtainAttributes.hasValue(15) && (string2 = obtainAttributes.getString(15)) != null && !string2.isEmpty()) {
            googleMapOptions.zzt = string2;
        }
        if (obtainAttributes.hasValue(14)) {
            googleMapOptions.zzu = obtainAttributes.getInt(14, 0);
        }
        TypedArray obtainAttributes2 = context.getResources().obtainAttributes(attributeSet, iArr);
        boolean hasValue = obtainAttributes2.hasValue(11);
        float f = RecyclerView.DECELERATION_RATE;
        Float valueOf = hasValue ? Float.valueOf(obtainAttributes2.getFloat(11, RecyclerView.DECELERATION_RATE)) : null;
        Float valueOf2 = obtainAttributes2.hasValue(12) ? Float.valueOf(obtainAttributes2.getFloat(12, RecyclerView.DECELERATION_RATE)) : null;
        Float valueOf3 = obtainAttributes2.hasValue(9) ? Float.valueOf(obtainAttributes2.getFloat(9, RecyclerView.DECELERATION_RATE)) : null;
        Float valueOf4 = obtainAttributes2.hasValue(10) ? Float.valueOf(obtainAttributes2.getFloat(10, RecyclerView.DECELERATION_RATE)) : null;
        obtainAttributes2.recycle();
        if (valueOf != null && valueOf2 != null && valueOf3 != null && valueOf4 != null) {
            latLngBounds = new LatLngBounds(new LatLng(valueOf.floatValue(), valueOf2.floatValue()), new LatLng(valueOf3.floatValue(), valueOf4.floatValue()));
        }
        googleMapOptions.zzq = latLngBounds;
        TypedArray obtainAttributes3 = context.getResources().obtainAttributes(attributeSet, iArr);
        LatLng latLng = new LatLng(obtainAttributes3.hasValue(5) ? obtainAttributes3.getFloat(5, RecyclerView.DECELERATION_RATE) : 0.0f, obtainAttributes3.hasValue(6) ? obtainAttributes3.getFloat(6, RecyclerView.DECELERATION_RATE) : 0.0f);
        float f2 = obtainAttributes3.hasValue(8) ? obtainAttributes3.getFloat(8, RecyclerView.DECELERATION_RATE) : 0.0f;
        float f3 = obtainAttributes3.hasValue(2) ? obtainAttributes3.getFloat(2, RecyclerView.DECELERATION_RATE) : 0.0f;
        if (obtainAttributes3.hasValue(7)) {
            f = obtainAttributes3.getFloat(7, RecyclerView.DECELERATION_RATE);
        }
        obtainAttributes3.recycle();
        googleMapOptions.zze = new CameraPosition(latLng, f2, f, f3);
        obtainAttributes.recycle();
        return googleMapOptions;
    }

    public final String toString() {
        WorkLauncherImpl workLauncherImpl = new WorkLauncherImpl(this);
        workLauncherImpl.add(Integer.valueOf(this.zzd), "MapType");
        workLauncherImpl.add(this.zzl, "LiteMode");
        workLauncherImpl.add(this.zze, "Camera");
        workLauncherImpl.add(this.zzg, "CompassEnabled");
        workLauncherImpl.add(this.zzf, "ZoomControlsEnabled");
        workLauncherImpl.add(this.zzh, "ScrollGesturesEnabled");
        workLauncherImpl.add(this.zzi, "ZoomGesturesEnabled");
        workLauncherImpl.add(this.zzj, "TiltGesturesEnabled");
        workLauncherImpl.add(this.zzk, "RotateGesturesEnabled");
        workLauncherImpl.add(this.zzr, "ScrollGesturesEnabledDuringRotateOrZoom");
        workLauncherImpl.add(this.zzm, "MapToolbarEnabled");
        workLauncherImpl.add(this.zzn, "AmbientEnabled");
        workLauncherImpl.add(this.zzo, "MinZoomPreference");
        workLauncherImpl.add(this.zzp, "MaxZoomPreference");
        workLauncherImpl.add(this.zzs, "BackgroundColor");
        workLauncherImpl.add(this.zzq, "LatLngBoundsForCameraTarget");
        workLauncherImpl.add(this.zzb, "ZOrderOnTop");
        workLauncherImpl.add(this.zzc, "UseViewLifecycleInFragment");
        workLauncherImpl.add(Integer.valueOf(this.zzu), "mapColorScheme");
        return workLauncherImpl.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int zzb = MooncakeHeaderViewKt.zzb(parcel, 20293);
        byte zza2 = com.google.android.gms.maps.internal.zza.zza(this.zzb);
        MooncakeHeaderViewKt.zza(parcel, 2, 4);
        parcel.writeInt(zza2);
        byte zza3 = com.google.android.gms.maps.internal.zza.zza(this.zzc);
        MooncakeHeaderViewKt.zza(parcel, 3, 4);
        parcel.writeInt(zza3);
        int i2 = this.zzd;
        MooncakeHeaderViewKt.zza(parcel, 4, 4);
        parcel.writeInt(i2);
        MooncakeHeaderViewKt.writeParcelable(parcel, 5, this.zze, i);
        byte zza4 = com.google.android.gms.maps.internal.zza.zza(this.zzf);
        MooncakeHeaderViewKt.zza(parcel, 6, 4);
        parcel.writeInt(zza4);
        byte zza5 = com.google.android.gms.maps.internal.zza.zza(this.zzg);
        MooncakeHeaderViewKt.zza(parcel, 7, 4);
        parcel.writeInt(zza5);
        byte zza6 = com.google.android.gms.maps.internal.zza.zza(this.zzh);
        MooncakeHeaderViewKt.zza(parcel, 8, 4);
        parcel.writeInt(zza6);
        byte zza7 = com.google.android.gms.maps.internal.zza.zza(this.zzi);
        MooncakeHeaderViewKt.zza(parcel, 9, 4);
        parcel.writeInt(zza7);
        byte zza8 = com.google.android.gms.maps.internal.zza.zza(this.zzj);
        MooncakeHeaderViewKt.zza(parcel, 10, 4);
        parcel.writeInt(zza8);
        byte zza9 = com.google.android.gms.maps.internal.zza.zza(this.zzk);
        MooncakeHeaderViewKt.zza(parcel, 11, 4);
        parcel.writeInt(zza9);
        byte zza10 = com.google.android.gms.maps.internal.zza.zza(this.zzl);
        MooncakeHeaderViewKt.zza(parcel, 12, 4);
        parcel.writeInt(zza10);
        byte zza11 = com.google.android.gms.maps.internal.zza.zza(this.zzm);
        MooncakeHeaderViewKt.zza(parcel, 14, 4);
        parcel.writeInt(zza11);
        byte zza12 = com.google.android.gms.maps.internal.zza.zza(this.zzn);
        MooncakeHeaderViewKt.zza(parcel, 15, 4);
        parcel.writeInt(zza12);
        Float f = this.zzo;
        if (f != null) {
            MooncakeHeaderViewKt.zza(parcel, 16, 4);
            parcel.writeFloat(f.floatValue());
        }
        Float f2 = this.zzp;
        if (f2 != null) {
            MooncakeHeaderViewKt.zza(parcel, 17, 4);
            parcel.writeFloat(f2.floatValue());
        }
        MooncakeHeaderViewKt.writeParcelable(parcel, 18, this.zzq, i);
        byte zza13 = com.google.android.gms.maps.internal.zza.zza(this.zzr);
        MooncakeHeaderViewKt.zza(parcel, 19, 4);
        parcel.writeInt(zza13);
        MooncakeHeaderViewKt.writeIntegerObject(parcel, 20, this.zzs);
        MooncakeHeaderViewKt.writeString(parcel, 21, this.zzt);
        int i3 = this.zzu;
        MooncakeHeaderViewKt.zza(parcel, 23, 4);
        parcel.writeInt(i3);
        MooncakeHeaderViewKt.zzc(parcel, zzb);
    }
}
