package com.google.android.gms.maps;

import android.app.PendingIntent;
import android.location.Location;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.WorkSource;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.ClientIdentity;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.location.zze;
import com.google.android.gms.internal.location.zzeg;
import com.google.android.gms.internal.location.zzei;
import com.google.android.gms.internal.location.zzl;
import com.google.android.gms.location.CurrentLocationRequest;
import com.google.android.gms.location.LastLocationRequest;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.LocationResult;
import com.google.android.gms.location.LocationSettingsRequest;
import com.google.android.gms.location.LocationSettingsResult;
import com.google.android.gms.location.LocationSettingsStates;
import com.google.android.gms.location.places.internal.zzat;
import com.google.android.gms.location.zzal;
import com.google.android.gms.maps.model.BitmapDescriptor;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import com.google.android.gms.maps.model.MapStyleOptions;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.maps.model.PointOfInterest;
import com.google.android.gms.maps.model.VisibleRegion;
import com.google.android.gms.measurement.internal.zzaf;
import com.google.android.gms.measurement.internal.zzao;
import com.google.android.gms.measurement.internal.zzbf;
import com.google.android.gms.measurement.internal.zzbh;
import com.google.android.gms.measurement.internal.zzoh;
import com.google.android.gms.measurement.internal.zzom;
import com.google.android.gms.measurement.internal.zzoo;
import com.google.android.gms.measurement.internal.zzpl;
import com.squareup.cash.directory_ui.views.ComposeUtilsKt;
import com.squareup.cash.directory_ui.views.MooncakeHeaderViewKt;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes4.dex */
public final class zzac implements Parcelable.Creator {
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ zzac(int i) {
        this.$r8$classId = i;
    }

    public static void zza(zzbh zzbhVar, Parcel parcel, int i) {
        String str = zzbhVar.zza;
        int zzb = MooncakeHeaderViewKt.zzb(parcel, 20293);
        MooncakeHeaderViewKt.writeString(parcel, 2, str);
        MooncakeHeaderViewKt.writeParcelable(parcel, 3, zzbhVar.zzb, i);
        MooncakeHeaderViewKt.writeString(parcel, 4, zzbhVar.zzc);
        long j = zzbhVar.zzd;
        MooncakeHeaderViewKt.zza(parcel, 5, 8);
        parcel.writeLong(j);
        long j2 = zzbhVar.zze;
        MooncakeHeaderViewKt.zza(parcel, 6, 8);
        parcel.writeLong(j2);
        MooncakeHeaderViewKt.zzc(parcel, zzb);
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        long j = 0;
        boolean z = false;
        int i = 0;
        switch (this.$r8$classId) {
            case 0:
                int validateObjectHeader = ComposeUtilsKt.validateObjectHeader(parcel);
                int i2 = 0;
                int i3 = 0;
                CameraPosition cameraPosition = null;
                Float f = null;
                Float f2 = null;
                LatLngBounds latLngBounds = null;
                Integer num = null;
                String str = null;
                byte b = -1;
                byte b2 = -1;
                byte b3 = -1;
                byte b4 = -1;
                byte b5 = -1;
                byte b6 = -1;
                byte b7 = -1;
                byte b8 = -1;
                byte b9 = -1;
                byte b10 = -1;
                byte b11 = -1;
                byte b12 = -1;
                while (parcel.dataPosition() < validateObjectHeader) {
                    int readInt = parcel.readInt();
                    byte b13 = b;
                    switch ((char) readInt) {
                        case 2:
                            b = ComposeUtilsKt.readByte(parcel, readInt);
                            continue;
                        case 3:
                            b2 = ComposeUtilsKt.readByte(parcel, readInt);
                            break;
                        case 4:
                            i2 = ComposeUtilsKt.readInt(parcel, readInt);
                            break;
                        case 5:
                            cameraPosition = (CameraPosition) ComposeUtilsKt.createParcelable(parcel, readInt, CameraPosition.CREATOR);
                            break;
                        case 6:
                            b3 = ComposeUtilsKt.readByte(parcel, readInt);
                            break;
                        case 7:
                            b4 = ComposeUtilsKt.readByte(parcel, readInt);
                            break;
                        case '\b':
                            b5 = ComposeUtilsKt.readByte(parcel, readInt);
                            break;
                        case '\t':
                            b6 = ComposeUtilsKt.readByte(parcel, readInt);
                            break;
                        case '\n':
                            b7 = ComposeUtilsKt.readByte(parcel, readInt);
                            break;
                        case 11:
                            b8 = ComposeUtilsKt.readByte(parcel, readInt);
                            break;
                        case '\f':
                            b9 = ComposeUtilsKt.readByte(parcel, readInt);
                            break;
                        case '\r':
                        case 22:
                        default:
                            ComposeUtilsKt.skipUnknownField(parcel, readInt);
                            break;
                        case 14:
                            b10 = ComposeUtilsKt.readByte(parcel, readInt);
                            break;
                        case 15:
                            b11 = ComposeUtilsKt.readByte(parcel, readInt);
                            break;
                        case 16:
                            f = ComposeUtilsKt.readFloatObject(parcel, readInt);
                            break;
                        case 17:
                            f2 = ComposeUtilsKt.readFloatObject(parcel, readInt);
                            break;
                        case 18:
                            latLngBounds = (LatLngBounds) ComposeUtilsKt.createParcelable(parcel, readInt, LatLngBounds.CREATOR);
                            break;
                        case 19:
                            b12 = ComposeUtilsKt.readByte(parcel, readInt);
                            break;
                        case 20:
                            num = ComposeUtilsKt.readIntegerObject(parcel, readInt);
                            break;
                        case 21:
                            str = ComposeUtilsKt.createString(parcel, readInt);
                            break;
                        case 23:
                            i3 = ComposeUtilsKt.readInt(parcel, readInt);
                            break;
                    }
                    b = b13;
                }
                ComposeUtilsKt.ensureAtEnd(parcel, validateObjectHeader);
                GoogleMapOptions googleMapOptions = new GoogleMapOptions();
                googleMapOptions.zzd = -1;
                googleMapOptions.zzo = null;
                googleMapOptions.zzp = null;
                googleMapOptions.zzq = null;
                googleMapOptions.zzs = null;
                googleMapOptions.zzt = null;
                googleMapOptions.zzb = com.google.android.gms.maps.internal.zza.zzb(b);
                googleMapOptions.zzc = com.google.android.gms.maps.internal.zza.zzb(b2);
                googleMapOptions.zzd = i2;
                googleMapOptions.zze = cameraPosition;
                googleMapOptions.zzf = com.google.android.gms.maps.internal.zza.zzb(b3);
                googleMapOptions.zzg = com.google.android.gms.maps.internal.zza.zzb(b4);
                googleMapOptions.zzh = com.google.android.gms.maps.internal.zza.zzb(b5);
                googleMapOptions.zzi = com.google.android.gms.maps.internal.zza.zzb(b6);
                googleMapOptions.zzj = com.google.android.gms.maps.internal.zza.zzb(b7);
                googleMapOptions.zzk = com.google.android.gms.maps.internal.zza.zzb(b8);
                googleMapOptions.zzl = com.google.android.gms.maps.internal.zza.zzb(b9);
                googleMapOptions.zzm = com.google.android.gms.maps.internal.zza.zzb(b10);
                googleMapOptions.zzn = com.google.android.gms.maps.internal.zza.zzb(b11);
                googleMapOptions.zzo = f;
                googleMapOptions.zzp = f2;
                googleMapOptions.zzq = latLngBounds;
                googleMapOptions.zzr = com.google.android.gms.maps.internal.zza.zzb(b12);
                googleMapOptions.zzs = num;
                googleMapOptions.zzt = str;
                googleMapOptions.zzu = i3;
                return googleMapOptions;
            case 1:
                int validateObjectHeader2 = ComposeUtilsKt.validateObjectHeader(parcel);
                boolean z2 = false;
                boolean z3 = false;
                boolean z4 = false;
                boolean z5 = false;
                LocationRequest locationRequest = null;
                ArrayList arrayList = null;
                long j2 = Long.MAX_VALUE;
                while (parcel.dataPosition() < validateObjectHeader2) {
                    int readInt2 = parcel.readInt();
                    char c = (char) readInt2;
                    if (c == 1) {
                        locationRequest = (LocationRequest) ComposeUtilsKt.createParcelable(parcel, readInt2, LocationRequest.CREATOR);
                    } else if (c == 5) {
                        arrayList = ComposeUtilsKt.createTypedList(parcel, readInt2, ClientIdentity.CREATOR);
                    } else if (c == '\b') {
                        z2 = ComposeUtilsKt.readBoolean(parcel, readInt2);
                    } else if (c != '\t') {
                        switch (c) {
                            case 11:
                                z4 = ComposeUtilsKt.readBoolean(parcel, readInt2);
                                break;
                            case '\f':
                                z5 = ComposeUtilsKt.readBoolean(parcel, readInt2);
                                break;
                            case '\r':
                                ComposeUtilsKt.createString(parcel, readInt2);
                                break;
                            case 14:
                                j2 = ComposeUtilsKt.readLong(parcel, readInt2);
                                break;
                            default:
                                ComposeUtilsKt.skipUnknownField(parcel, readInt2);
                                break;
                        }
                    } else {
                        z3 = ComposeUtilsKt.readBoolean(parcel, readInt2);
                    }
                }
                ComposeUtilsKt.ensureAtEnd(parcel, validateObjectHeader2);
                return new zzeg(locationRequest, arrayList, z2, z3, z4, z5, j2);
            case 2:
                int validateObjectHeader3 = ComposeUtilsKt.validateObjectHeader(parcel);
                int i4 = 1;
                zzeg zzegVar = null;
                IBinder iBinder = null;
                IBinder iBinder2 = null;
                PendingIntent pendingIntent = null;
                IBinder iBinder3 = null;
                String str2 = null;
                while (parcel.dataPosition() < validateObjectHeader3) {
                    int readInt3 = parcel.readInt();
                    switch ((char) readInt3) {
                        case 1:
                            i4 = ComposeUtilsKt.readInt(parcel, readInt3);
                            break;
                        case 2:
                            zzegVar = (zzeg) ComposeUtilsKt.createParcelable(parcel, readInt3, zzeg.CREATOR);
                            break;
                        case 3:
                            iBinder = ComposeUtilsKt.readIBinder(parcel, readInt3);
                            break;
                        case 4:
                            pendingIntent = (PendingIntent) ComposeUtilsKt.createParcelable(parcel, readInt3, PendingIntent.CREATOR);
                            break;
                        case 5:
                            iBinder2 = ComposeUtilsKt.readIBinder(parcel, readInt3);
                            break;
                        case 6:
                            iBinder3 = ComposeUtilsKt.readIBinder(parcel, readInt3);
                            break;
                        case 7:
                        default:
                            ComposeUtilsKt.skipUnknownField(parcel, readInt3);
                            break;
                        case '\b':
                            str2 = ComposeUtilsKt.createString(parcel, readInt3);
                            break;
                    }
                }
                ComposeUtilsKt.ensureAtEnd(parcel, validateObjectHeader3);
                return new zzei(i4, zzegVar, iBinder, iBinder2, pendingIntent, iBinder3, str2);
            case 3:
                int validateObjectHeader4 = ComposeUtilsKt.validateObjectHeader(parcel);
                int i5 = 0;
                String str3 = null;
                String str4 = null;
                String str5 = null;
                ArrayList arrayList2 = null;
                zze zzeVar = null;
                while (parcel.dataPosition() < validateObjectHeader4) {
                    int readInt4 = parcel.readInt();
                    char c2 = (char) readInt4;
                    if (c2 == 1) {
                        i5 = ComposeUtilsKt.readInt(parcel, readInt4);
                    } else if (c2 == 3) {
                        str3 = ComposeUtilsKt.createString(parcel, readInt4);
                    } else if (c2 == 4) {
                        str4 = ComposeUtilsKt.createString(parcel, readInt4);
                    } else if (c2 == 6) {
                        str5 = ComposeUtilsKt.createString(parcel, readInt4);
                    } else if (c2 == 7) {
                        zzeVar = (zze) ComposeUtilsKt.createParcelable(parcel, readInt4, zze.CREATOR);
                    } else if (c2 != '\b') {
                        ComposeUtilsKt.skipUnknownField(parcel, readInt4);
                    } else {
                        arrayList2 = ComposeUtilsKt.createTypedList(parcel, readInt4, Feature.CREATOR);
                    }
                }
                ComposeUtilsKt.ensureAtEnd(parcel, validateObjectHeader4);
                return new zze(i5, str3, str4, str5, arrayList2, zzeVar);
            case 4:
                int validateObjectHeader5 = ComposeUtilsKt.validateObjectHeader(parcel);
                Status status = null;
                while (parcel.dataPosition() < validateObjectHeader5) {
                    int readInt5 = parcel.readInt();
                    if (((char) readInt5) != 1) {
                        ComposeUtilsKt.skipUnknownField(parcel, readInt5);
                    } else {
                        status = (Status) ComposeUtilsKt.createParcelable(parcel, readInt5, Status.CREATOR);
                    }
                }
                ComposeUtilsKt.ensureAtEnd(parcel, validateObjectHeader5);
                return new zzl(status);
            case 5:
                int validateObjectHeader6 = ComposeUtilsKt.validateObjectHeader(parcel);
                int i6 = 0;
                int i7 = 0;
                String str6 = null;
                String str7 = null;
                String str8 = null;
                String str9 = null;
                while (parcel.dataPosition() < validateObjectHeader6) {
                    int readInt6 = parcel.readInt();
                    char c3 = (char) readInt6;
                    if (c3 == 1) {
                        str6 = ComposeUtilsKt.createString(parcel, readInt6);
                    } else if (c3 == 2) {
                        str7 = ComposeUtilsKt.createString(parcel, readInt6);
                    } else if (c3 == 3) {
                        str8 = ComposeUtilsKt.createString(parcel, readInt6);
                    } else if (c3 == 4) {
                        str9 = ComposeUtilsKt.createString(parcel, readInt6);
                    } else if (c3 == 6) {
                        i6 = ComposeUtilsKt.readInt(parcel, readInt6);
                    } else if (c3 != 7) {
                        ComposeUtilsKt.skipUnknownField(parcel, readInt6);
                    } else {
                        i7 = ComposeUtilsKt.readInt(parcel, readInt6);
                    }
                }
                ComposeUtilsKt.ensureAtEnd(parcel, validateObjectHeader6);
                return new zzat(str6, str7, str8, str9, i6, i7);
            case 6:
                int validateObjectHeader7 = ComposeUtilsKt.validateObjectHeader(parcel);
                int i8 = 0;
                boolean z6 = false;
                long j3 = Long.MAX_VALUE;
                zze zzeVar2 = null;
                while (parcel.dataPosition() < validateObjectHeader7) {
                    int readInt7 = parcel.readInt();
                    char c4 = (char) readInt7;
                    if (c4 == 1) {
                        j3 = ComposeUtilsKt.readLong(parcel, readInt7);
                    } else if (c4 == 2) {
                        i8 = ComposeUtilsKt.readInt(parcel, readInt7);
                    } else if (c4 == 3) {
                        z6 = ComposeUtilsKt.readBoolean(parcel, readInt7);
                    } else if (c4 != 5) {
                        ComposeUtilsKt.skipUnknownField(parcel, readInt7);
                    } else {
                        zzeVar2 = (zze) ComposeUtilsKt.createParcelable(parcel, readInt7, zze.CREATOR);
                    }
                }
                ComposeUtilsKt.ensureAtEnd(parcel, validateObjectHeader7);
                return new LastLocationRequest(j3, i8, z6, zzeVar2);
            case 7:
                int validateObjectHeader8 = ComposeUtilsKt.validateObjectHeader(parcel);
                int i9 = 1000;
                int i10 = 1;
                int i11 = 1;
                long j4 = 0;
                zzal[] zzalVarArr = null;
                while (parcel.dataPosition() < validateObjectHeader8) {
                    int readInt8 = parcel.readInt();
                    switch ((char) readInt8) {
                        case 1:
                            i10 = ComposeUtilsKt.readInt(parcel, readInt8);
                            break;
                        case 2:
                            i11 = ComposeUtilsKt.readInt(parcel, readInt8);
                            break;
                        case 3:
                            j4 = ComposeUtilsKt.readLong(parcel, readInt8);
                            break;
                        case 4:
                            i9 = ComposeUtilsKt.readInt(parcel, readInt8);
                            break;
                        case 5:
                            zzalVarArr = (zzal[]) ComposeUtilsKt.createTypedArray(parcel, readInt8, zzal.CREATOR);
                            break;
                        case 6:
                            ComposeUtilsKt.readBoolean(parcel, readInt8);
                            break;
                        default:
                            ComposeUtilsKt.skipUnknownField(parcel, readInt8);
                            break;
                    }
                }
                ComposeUtilsKt.ensureAtEnd(parcel, validateObjectHeader8);
                return new LocationAvailability(i9, i10, i11, j4, zzalVarArr);
            case 8:
                int validateObjectHeader9 = ComposeUtilsKt.validateObjectHeader(parcel);
                WorkSource workSource = new WorkSource();
                int i12 = Integer.MAX_VALUE;
                boolean z7 = false;
                int i13 = 0;
                int i14 = 0;
                boolean z8 = false;
                float f3 = 0.0f;
                long j5 = 600000;
                long j6 = 3600000;
                long j7 = 0;
                int i15 = 102;
                long j8 = Long.MAX_VALUE;
                long j9 = Long.MAX_VALUE;
                long j10 = -1;
                zze zzeVar3 = null;
                while (parcel.dataPosition() < validateObjectHeader9) {
                    int readInt9 = parcel.readInt();
                    switch ((char) readInt9) {
                        case 1:
                            i15 = ComposeUtilsKt.readInt(parcel, readInt9);
                            break;
                        case 2:
                            j6 = ComposeUtilsKt.readLong(parcel, readInt9);
                            break;
                        case 3:
                            j5 = ComposeUtilsKt.readLong(parcel, readInt9);
                            break;
                        case 4:
                        case 14:
                        default:
                            ComposeUtilsKt.skipUnknownField(parcel, readInt9);
                            break;
                        case 5:
                            j8 = ComposeUtilsKt.readLong(parcel, readInt9);
                            break;
                        case 6:
                            i12 = ComposeUtilsKt.readInt(parcel, readInt9);
                            break;
                        case 7:
                            f3 = ComposeUtilsKt.readFloat(parcel, readInt9);
                            break;
                        case '\b':
                            j7 = ComposeUtilsKt.readLong(parcel, readInt9);
                            break;
                        case '\t':
                            z7 = ComposeUtilsKt.readBoolean(parcel, readInt9);
                            break;
                        case '\n':
                            j9 = ComposeUtilsKt.readLong(parcel, readInt9);
                            break;
                        case 11:
                            j10 = ComposeUtilsKt.readLong(parcel, readInt9);
                            break;
                        case '\f':
                            i13 = ComposeUtilsKt.readInt(parcel, readInt9);
                            break;
                        case '\r':
                            i14 = ComposeUtilsKt.readInt(parcel, readInt9);
                            break;
                        case 15:
                            z8 = ComposeUtilsKt.readBoolean(parcel, readInt9);
                            break;
                        case 16:
                            workSource = (WorkSource) ComposeUtilsKt.createParcelable(parcel, readInt9, WorkSource.CREATOR);
                            break;
                        case 17:
                            zzeVar3 = (zze) ComposeUtilsKt.createParcelable(parcel, readInt9, zze.CREATOR);
                            break;
                    }
                }
                ComposeUtilsKt.ensureAtEnd(parcel, validateObjectHeader9);
                return new LocationRequest(i15, j6, j5, j7, j8, j9, i12, f3, z7, j10, i13, i14, z8, workSource, zzeVar3);
            case 9:
                int validateObjectHeader10 = ComposeUtilsKt.validateObjectHeader(parcel);
                List list = LocationResult.zza;
                while (parcel.dataPosition() < validateObjectHeader10) {
                    int readInt10 = parcel.readInt();
                    if (((char) readInt10) != 1) {
                        ComposeUtilsKt.skipUnknownField(parcel, readInt10);
                    } else {
                        list = ComposeUtilsKt.createTypedList(parcel, readInt10, Location.CREATOR);
                    }
                }
                ComposeUtilsKt.ensureAtEnd(parcel, validateObjectHeader10);
                return new LocationResult(list);
            case 10:
                int validateObjectHeader11 = ComposeUtilsKt.validateObjectHeader(parcel);
                boolean z9 = false;
                ArrayList arrayList3 = null;
                while (parcel.dataPosition() < validateObjectHeader11) {
                    int readInt11 = parcel.readInt();
                    char c5 = (char) readInt11;
                    if (c5 == 1) {
                        arrayList3 = ComposeUtilsKt.createTypedList(parcel, readInt11, LocationRequest.CREATOR);
                    } else if (c5 == 2) {
                        z = ComposeUtilsKt.readBoolean(parcel, readInt11);
                    } else if (c5 != 3) {
                        ComposeUtilsKt.skipUnknownField(parcel, readInt11);
                    } else {
                        z9 = ComposeUtilsKt.readBoolean(parcel, readInt11);
                    }
                }
                ComposeUtilsKt.ensureAtEnd(parcel, validateObjectHeader11);
                return new LocationSettingsRequest(arrayList3, z, z9);
            case 11:
                int validateObjectHeader12 = ComposeUtilsKt.validateObjectHeader(parcel);
                LocationSettingsStates locationSettingsStates = null;
                Status status2 = null;
                while (parcel.dataPosition() < validateObjectHeader12) {
                    int readInt12 = parcel.readInt();
                    char c6 = (char) readInt12;
                    if (c6 == 1) {
                        status2 = (Status) ComposeUtilsKt.createParcelable(parcel, readInt12, Status.CREATOR);
                    } else if (c6 != 2) {
                        ComposeUtilsKt.skipUnknownField(parcel, readInt12);
                    } else {
                        locationSettingsStates = (LocationSettingsStates) ComposeUtilsKt.createParcelable(parcel, readInt12, LocationSettingsStates.CREATOR);
                    }
                }
                ComposeUtilsKt.ensureAtEnd(parcel, validateObjectHeader12);
                return new LocationSettingsResult(status2, locationSettingsStates);
            case 12:
                int validateObjectHeader13 = ComposeUtilsKt.validateObjectHeader(parcel);
                boolean z10 = false;
                boolean z11 = false;
                boolean z12 = false;
                boolean z13 = false;
                boolean z14 = false;
                boolean z15 = false;
                while (parcel.dataPosition() < validateObjectHeader13) {
                    int readInt13 = parcel.readInt();
                    switch ((char) readInt13) {
                        case 1:
                            z10 = ComposeUtilsKt.readBoolean(parcel, readInt13);
                            break;
                        case 2:
                            z11 = ComposeUtilsKt.readBoolean(parcel, readInt13);
                            break;
                        case 3:
                            z12 = ComposeUtilsKt.readBoolean(parcel, readInt13);
                            break;
                        case 4:
                            z13 = ComposeUtilsKt.readBoolean(parcel, readInt13);
                            break;
                        case 5:
                            z14 = ComposeUtilsKt.readBoolean(parcel, readInt13);
                            break;
                        case 6:
                            z15 = ComposeUtilsKt.readBoolean(parcel, readInt13);
                            break;
                        default:
                            ComposeUtilsKt.skipUnknownField(parcel, readInt13);
                            break;
                    }
                }
                ComposeUtilsKt.ensureAtEnd(parcel, validateObjectHeader13);
                return new LocationSettingsStates(z10, z11, z12, z13, z14, z15);
            case 13:
                int validateObjectHeader14 = ComposeUtilsKt.validateObjectHeader(parcel);
                int i16 = 1;
                int i17 = 1;
                long j11 = -1;
                long j12 = -1;
                while (parcel.dataPosition() < validateObjectHeader14) {
                    int readInt14 = parcel.readInt();
                    char c7 = (char) readInt14;
                    if (c7 == 1) {
                        i16 = ComposeUtilsKt.readInt(parcel, readInt14);
                    } else if (c7 == 2) {
                        i17 = ComposeUtilsKt.readInt(parcel, readInt14);
                    } else if (c7 == 3) {
                        j11 = ComposeUtilsKt.readLong(parcel, readInt14);
                    } else if (c7 != 4) {
                        ComposeUtilsKt.skipUnknownField(parcel, readInt14);
                    } else {
                        j12 = ComposeUtilsKt.readLong(parcel, readInt14);
                    }
                }
                ComposeUtilsKt.ensureAtEnd(parcel, validateObjectHeader14);
                return new zzal(j11, j12, i16, i17);
            case 14:
                int validateObjectHeader15 = ComposeUtilsKt.validateObjectHeader(parcel);
                WorkSource workSource2 = new WorkSource();
                int i18 = 0;
                boolean z16 = false;
                int i19 = 0;
                long j13 = Long.MAX_VALUE;
                int i20 = 102;
                long j14 = Long.MAX_VALUE;
                zze zzeVar4 = null;
                while (parcel.dataPosition() < validateObjectHeader15) {
                    int readInt15 = parcel.readInt();
                    switch ((char) readInt15) {
                        case 1:
                            j13 = ComposeUtilsKt.readLong(parcel, readInt15);
                            break;
                        case 2:
                            i18 = ComposeUtilsKt.readInt(parcel, readInt15);
                            break;
                        case 3:
                            i20 = ComposeUtilsKt.readInt(parcel, readInt15);
                            break;
                        case 4:
                            j14 = ComposeUtilsKt.readLong(parcel, readInt15);
                            break;
                        case 5:
                            z16 = ComposeUtilsKt.readBoolean(parcel, readInt15);
                            break;
                        case 6:
                            workSource2 = (WorkSource) ComposeUtilsKt.createParcelable(parcel, readInt15, WorkSource.CREATOR);
                            break;
                        case 7:
                            i19 = ComposeUtilsKt.readInt(parcel, readInt15);
                            break;
                        case '\b':
                        default:
                            ComposeUtilsKt.skipUnknownField(parcel, readInt15);
                            break;
                        case '\t':
                            zzeVar4 = (zze) ComposeUtilsKt.createParcelable(parcel, readInt15, zze.CREATOR);
                            break;
                    }
                }
                ComposeUtilsKt.ensureAtEnd(parcel, validateObjectHeader15);
                return new CurrentLocationRequest(j13, i18, i20, j14, z16, i19, workSource2, zzeVar4);
            case 15:
                float f4 = RecyclerView.DECELERATION_RATE;
                int validateObjectHeader16 = ComposeUtilsKt.validateObjectHeader(parcel);
                float f5 = 0.0f;
                float f6 = 0.0f;
                LatLng latLng = null;
                while (parcel.dataPosition() < validateObjectHeader16) {
                    int readInt16 = parcel.readInt();
                    char c8 = (char) readInt16;
                    if (c8 == 2) {
                        latLng = (LatLng) ComposeUtilsKt.createParcelable(parcel, readInt16, LatLng.CREATOR);
                    } else if (c8 == 3) {
                        f6 = ComposeUtilsKt.readFloat(parcel, readInt16);
                    } else if (c8 == 4) {
                        f4 = ComposeUtilsKt.readFloat(parcel, readInt16);
                    } else if (c8 != 5) {
                        ComposeUtilsKt.skipUnknownField(parcel, readInt16);
                    } else {
                        f5 = ComposeUtilsKt.readFloat(parcel, readInt16);
                    }
                }
                ComposeUtilsKt.ensureAtEnd(parcel, validateObjectHeader16);
                return new CameraPosition(latLng, f6, f4, f5);
            case 16:
                int validateObjectHeader17 = ComposeUtilsKt.validateObjectHeader(parcel);
                LatLng latLng2 = null;
                LatLng latLng3 = null;
                LatLng latLng4 = null;
                LatLng latLng5 = null;
                LatLngBounds latLngBounds2 = null;
                while (parcel.dataPosition() < validateObjectHeader17) {
                    int readInt17 = parcel.readInt();
                    char c9 = (char) readInt17;
                    if (c9 == 2) {
                        latLng2 = (LatLng) ComposeUtilsKt.createParcelable(parcel, readInt17, LatLng.CREATOR);
                    } else if (c9 == 3) {
                        latLng3 = (LatLng) ComposeUtilsKt.createParcelable(parcel, readInt17, LatLng.CREATOR);
                    } else if (c9 == 4) {
                        latLng4 = (LatLng) ComposeUtilsKt.createParcelable(parcel, readInt17, LatLng.CREATOR);
                    } else if (c9 == 5) {
                        latLng5 = (LatLng) ComposeUtilsKt.createParcelable(parcel, readInt17, LatLng.CREATOR);
                    } else if (c9 != 6) {
                        ComposeUtilsKt.skipUnknownField(parcel, readInt17);
                    } else {
                        latLngBounds2 = (LatLngBounds) ComposeUtilsKt.createParcelable(parcel, readInt17, LatLngBounds.CREATOR);
                    }
                }
                ComposeUtilsKt.ensureAtEnd(parcel, validateObjectHeader17);
                return new VisibleRegion(latLng2, latLng3, latLng4, latLng5, latLngBounds2);
            case 17:
                int validateObjectHeader18 = ComposeUtilsKt.validateObjectHeader(parcel);
                LatLng latLng6 = null;
                LatLng latLng7 = null;
                while (parcel.dataPosition() < validateObjectHeader18) {
                    int readInt18 = parcel.readInt();
                    char c10 = (char) readInt18;
                    if (c10 == 2) {
                        latLng7 = (LatLng) ComposeUtilsKt.createParcelable(parcel, readInt18, LatLng.CREATOR);
                    } else if (c10 != 3) {
                        ComposeUtilsKt.skipUnknownField(parcel, readInt18);
                    } else {
                        latLng6 = (LatLng) ComposeUtilsKt.createParcelable(parcel, readInt18, LatLng.CREATOR);
                    }
                }
                ComposeUtilsKt.ensureAtEnd(parcel, validateObjectHeader18);
                return new LatLngBounds(latLng7, latLng6);
            case 18:
                int validateObjectHeader19 = ComposeUtilsKt.validateObjectHeader(parcel);
                double d = 0.0d;
                double d2 = 0.0d;
                while (parcel.dataPosition() < validateObjectHeader19) {
                    int readInt19 = parcel.readInt();
                    char c11 = (char) readInt19;
                    if (c11 == 2) {
                        d = ComposeUtilsKt.readDouble(parcel, readInt19);
                    } else if (c11 != 3) {
                        ComposeUtilsKt.skipUnknownField(parcel, readInt19);
                    } else {
                        d2 = ComposeUtilsKt.readDouble(parcel, readInt19);
                    }
                }
                ComposeUtilsKt.ensureAtEnd(parcel, validateObjectHeader19);
                return new LatLng(d, d2);
            case 19:
                int validateObjectHeader20 = ComposeUtilsKt.validateObjectHeader(parcel);
                String str10 = null;
                while (parcel.dataPosition() < validateObjectHeader20) {
                    int readInt20 = parcel.readInt();
                    if (((char) readInt20) != 2) {
                        ComposeUtilsKt.skipUnknownField(parcel, readInt20);
                    } else {
                        str10 = ComposeUtilsKt.createString(parcel, readInt20);
                    }
                }
                ComposeUtilsKt.ensureAtEnd(parcel, validateObjectHeader20);
                return new MapStyleOptions(str10);
            case 20:
                int validateObjectHeader21 = ComposeUtilsKt.validateObjectHeader(parcel);
                float f7 = 1.0f;
                float f8 = 0.5f;
                boolean z17 = false;
                boolean z18 = false;
                boolean z19 = false;
                int i21 = 0;
                int i22 = 0;
                LatLng latLng8 = null;
                String str11 = null;
                String str12 = null;
                IBinder iBinder4 = null;
                float f9 = RecyclerView.DECELERATION_RATE;
                float f10 = RecyclerView.DECELERATION_RATE;
                IBinder iBinder5 = null;
                float f11 = RecyclerView.DECELERATION_RATE;
                float f12 = RecyclerView.DECELERATION_RATE;
                float f13 = RecyclerView.DECELERATION_RATE;
                String str13 = null;
                while (parcel.dataPosition() < validateObjectHeader21) {
                    int readInt21 = parcel.readInt();
                    switch ((char) readInt21) {
                        case 2:
                            latLng8 = (LatLng) ComposeUtilsKt.createParcelable(parcel, readInt21, LatLng.CREATOR);
                            break;
                        case 3:
                            str11 = ComposeUtilsKt.createString(parcel, readInt21);
                            break;
                        case 4:
                            str12 = ComposeUtilsKt.createString(parcel, readInt21);
                            break;
                        case 5:
                            iBinder4 = ComposeUtilsKt.readIBinder(parcel, readInt21);
                            break;
                        case 6:
                            f9 = ComposeUtilsKt.readFloat(parcel, readInt21);
                            break;
                        case 7:
                            f10 = ComposeUtilsKt.readFloat(parcel, readInt21);
                            break;
                        case '\b':
                            z17 = ComposeUtilsKt.readBoolean(parcel, readInt21);
                            break;
                        case '\t':
                            z18 = ComposeUtilsKt.readBoolean(parcel, readInt21);
                            break;
                        case '\n':
                            z19 = ComposeUtilsKt.readBoolean(parcel, readInt21);
                            break;
                        case 11:
                            f11 = ComposeUtilsKt.readFloat(parcel, readInt21);
                            break;
                        case '\f':
                            f8 = ComposeUtilsKt.readFloat(parcel, readInt21);
                            break;
                        case '\r':
                            f12 = ComposeUtilsKt.readFloat(parcel, readInt21);
                            break;
                        case 14:
                            f7 = ComposeUtilsKt.readFloat(parcel, readInt21);
                            break;
                        case 15:
                            f13 = ComposeUtilsKt.readFloat(parcel, readInt21);
                            break;
                        case 16:
                        default:
                            ComposeUtilsKt.skipUnknownField(parcel, readInt21);
                            break;
                        case 17:
                            i21 = ComposeUtilsKt.readInt(parcel, readInt21);
                            break;
                        case 18:
                            iBinder5 = ComposeUtilsKt.readIBinder(parcel, readInt21);
                            break;
                        case 19:
                            i22 = ComposeUtilsKt.readInt(parcel, readInt21);
                            break;
                        case 20:
                            str13 = ComposeUtilsKt.createString(parcel, readInt21);
                            break;
                    }
                }
                ComposeUtilsKt.ensureAtEnd(parcel, validateObjectHeader21);
                MarkerOptions markerOptions = new MarkerOptions();
                markerOptions.zze = 0.5f;
                markerOptions.zzf = 1.0f;
                markerOptions.zzh = true;
                markerOptions.zzi = false;
                markerOptions.zzj = RecyclerView.DECELERATION_RATE;
                markerOptions.zzk = 0.5f;
                markerOptions.zzl = RecyclerView.DECELERATION_RATE;
                markerOptions.zzm = 1.0f;
                markerOptions.zzo = 0;
                markerOptions.zza = latLng8;
                markerOptions.zzb = str11;
                markerOptions.zzc = str12;
                if (iBinder4 == null) {
                    markerOptions.zzd = null;
                } else {
                    markerOptions.zzd = new BitmapDescriptor(ObjectWrapper.asInterface(iBinder4));
                }
                markerOptions.zze = f9;
                markerOptions.zzf = f10;
                markerOptions.zzg = z17;
                markerOptions.zzh = z18;
                markerOptions.zzi = z19;
                markerOptions.zzj = f11;
                markerOptions.zzk = f8;
                markerOptions.zzl = f12;
                markerOptions.zzm = f7;
                markerOptions.zzn = f13;
                markerOptions.zzq = i22;
                markerOptions.zzo = i21;
                IObjectWrapper asInterface = ObjectWrapper.asInterface(iBinder5);
                markerOptions.zzp = asInterface == null ? null : (View) ObjectWrapper.unwrap(asInterface);
                markerOptions.zzr = str13;
                return markerOptions;
            case 21:
                int validateObjectHeader22 = ComposeUtilsKt.validateObjectHeader(parcel);
                String str14 = null;
                String str15 = null;
                LatLng latLng9 = null;
                while (parcel.dataPosition() < validateObjectHeader22) {
                    int readInt22 = parcel.readInt();
                    char c12 = (char) readInt22;
                    if (c12 == 2) {
                        latLng9 = (LatLng) ComposeUtilsKt.createParcelable(parcel, readInt22, LatLng.CREATOR);
                    } else if (c12 == 3) {
                        str14 = ComposeUtilsKt.createString(parcel, readInt22);
                    } else if (c12 != 4) {
                        ComposeUtilsKt.skipUnknownField(parcel, readInt22);
                    } else {
                        str15 = ComposeUtilsKt.createString(parcel, readInt22);
                    }
                }
                ComposeUtilsKt.ensureAtEnd(parcel, validateObjectHeader22);
                return new PointOfInterest(latLng9, str14, str15);
            case 22:
                int validateObjectHeader23 = ComposeUtilsKt.validateObjectHeader(parcel);
                int i23 = 0;
                long j15 = 0;
                long j16 = 0;
                while (parcel.dataPosition() < validateObjectHeader23) {
                    int readInt23 = parcel.readInt();
                    char c13 = (char) readInt23;
                    if (c13 == 1) {
                        j15 = ComposeUtilsKt.readLong(parcel, readInt23);
                    } else if (c13 == 2) {
                        i23 = ComposeUtilsKt.readInt(parcel, readInt23);
                    } else if (c13 != 3) {
                        ComposeUtilsKt.skipUnknownField(parcel, readInt23);
                    } else {
                        j16 = ComposeUtilsKt.readLong(parcel, readInt23);
                    }
                }
                ComposeUtilsKt.ensureAtEnd(parcel, validateObjectHeader23);
                return new zzaf(i23, j15, j16);
            case 23:
                int validateObjectHeader24 = ComposeUtilsKt.validateObjectHeader(parcel);
                boolean z20 = false;
                long j17 = 0;
                long j18 = 0;
                long j19 = 0;
                String str16 = null;
                String str17 = null;
                zzpl zzplVar = null;
                String str18 = null;
                zzbh zzbhVar = null;
                zzbh zzbhVar2 = null;
                zzbh zzbhVar3 = null;
                while (parcel.dataPosition() < validateObjectHeader24) {
                    int readInt24 = parcel.readInt();
                    switch ((char) readInt24) {
                        case 2:
                            str16 = ComposeUtilsKt.createString(parcel, readInt24);
                            break;
                        case 3:
                            str17 = ComposeUtilsKt.createString(parcel, readInt24);
                            break;
                        case 4:
                            zzplVar = (zzpl) ComposeUtilsKt.createParcelable(parcel, readInt24, zzpl.CREATOR);
                            break;
                        case 5:
                            j17 = ComposeUtilsKt.readLong(parcel, readInt24);
                            break;
                        case 6:
                            z20 = ComposeUtilsKt.readBoolean(parcel, readInt24);
                            break;
                        case 7:
                            str18 = ComposeUtilsKt.createString(parcel, readInt24);
                            break;
                        case '\b':
                            zzbhVar = (zzbh) ComposeUtilsKt.createParcelable(parcel, readInt24, zzbh.CREATOR);
                            break;
                        case '\t':
                            j18 = ComposeUtilsKt.readLong(parcel, readInt24);
                            break;
                        case '\n':
                            zzbhVar2 = (zzbh) ComposeUtilsKt.createParcelable(parcel, readInt24, zzbh.CREATOR);
                            break;
                        case 11:
                            j19 = ComposeUtilsKt.readLong(parcel, readInt24);
                            break;
                        case '\f':
                            zzbhVar3 = (zzbh) ComposeUtilsKt.createParcelable(parcel, readInt24, zzbh.CREATOR);
                            break;
                        default:
                            ComposeUtilsKt.skipUnknownField(parcel, readInt24);
                            break;
                    }
                }
                ComposeUtilsKt.ensureAtEnd(parcel, validateObjectHeader24);
                return new com.google.android.gms.measurement.internal.zzah(str16, str17, zzplVar, j17, z20, str18, zzbhVar, j18, zzbhVar2, j19, zzbhVar3);
            case 24:
                int validateObjectHeader25 = ComposeUtilsKt.validateObjectHeader(parcel);
                Bundle bundle = null;
                while (parcel.dataPosition() < validateObjectHeader25) {
                    int readInt25 = parcel.readInt();
                    if (((char) readInt25) != 1) {
                        ComposeUtilsKt.skipUnknownField(parcel, readInt25);
                    } else {
                        bundle = ComposeUtilsKt.createBundle(parcel, readInt25);
                    }
                }
                ComposeUtilsKt.ensureAtEnd(parcel, validateObjectHeader25);
                return new zzao(bundle);
            case 25:
                int validateObjectHeader26 = ComposeUtilsKt.validateObjectHeader(parcel);
                Bundle bundle2 = null;
                while (parcel.dataPosition() < validateObjectHeader26) {
                    int readInt26 = parcel.readInt();
                    if (((char) readInt26) != 2) {
                        ComposeUtilsKt.skipUnknownField(parcel, readInt26);
                    } else {
                        bundle2 = ComposeUtilsKt.createBundle(parcel, readInt26);
                    }
                }
                ComposeUtilsKt.ensureAtEnd(parcel, validateObjectHeader26);
                return new zzbf(bundle2);
            case 26:
                int validateObjectHeader27 = ComposeUtilsKt.validateObjectHeader(parcel);
                long j20 = 0;
                long j21 = 0;
                String str19 = null;
                zzbf zzbfVar = null;
                String str20 = null;
                while (parcel.dataPosition() < validateObjectHeader27) {
                    int readInt27 = parcel.readInt();
                    char c14 = (char) readInt27;
                    if (c14 == 2) {
                        str19 = ComposeUtilsKt.createString(parcel, readInt27);
                    } else if (c14 == 3) {
                        zzbfVar = (zzbf) ComposeUtilsKt.createParcelable(parcel, readInt27, zzbf.CREATOR);
                    } else if (c14 == 4) {
                        str20 = ComposeUtilsKt.createString(parcel, readInt27);
                    } else if (c14 == 5) {
                        j20 = ComposeUtilsKt.readLong(parcel, readInt27);
                    } else if (c14 != 6) {
                        ComposeUtilsKt.skipUnknownField(parcel, readInt27);
                    } else {
                        j21 = ComposeUtilsKt.readLong(parcel, readInt27);
                    }
                }
                ComposeUtilsKt.ensureAtEnd(parcel, validateObjectHeader27);
                return new zzbh(str19, zzbfVar, str20, j20, j21);
            case 27:
                int validateObjectHeader28 = ComposeUtilsKt.validateObjectHeader(parcel);
                String str21 = null;
                while (parcel.dataPosition() < validateObjectHeader28) {
                    int readInt28 = parcel.readInt();
                    char c15 = (char) readInt28;
                    if (c15 == 1) {
                        str21 = ComposeUtilsKt.createString(parcel, readInt28);
                    } else if (c15 == 2) {
                        j = ComposeUtilsKt.readLong(parcel, readInt28);
                    } else if (c15 != 3) {
                        ComposeUtilsKt.skipUnknownField(parcel, readInt28);
                    } else {
                        i = ComposeUtilsKt.readInt(parcel, readInt28);
                    }
                }
                ComposeUtilsKt.ensureAtEnd(parcel, validateObjectHeader28);
                return new zzoh(str21, j, i);
            case 28:
                int validateObjectHeader29 = ComposeUtilsKt.validateObjectHeader(parcel);
                int i24 = 0;
                long j22 = 0;
                long j23 = 0;
                byte[] bArr = null;
                String str22 = null;
                Bundle bundle3 = null;
                String str23 = null;
                while (parcel.dataPosition() < validateObjectHeader29) {
                    int readInt29 = parcel.readInt();
                    switch ((char) readInt29) {
                        case 1:
                            j22 = ComposeUtilsKt.readLong(parcel, readInt29);
                            break;
                        case 2:
                            bArr = ComposeUtilsKt.createByteArray(parcel, readInt29);
                            break;
                        case 3:
                            str22 = ComposeUtilsKt.createString(parcel, readInt29);
                            break;
                        case 4:
                            bundle3 = ComposeUtilsKt.createBundle(parcel, readInt29);
                            break;
                        case 5:
                            i24 = ComposeUtilsKt.readInt(parcel, readInt29);
                            break;
                        case 6:
                            j23 = ComposeUtilsKt.readLong(parcel, readInt29);
                            break;
                        case 7:
                            str23 = ComposeUtilsKt.createString(parcel, readInt29);
                            break;
                        default:
                            ComposeUtilsKt.skipUnknownField(parcel, readInt29);
                            break;
                    }
                }
                ComposeUtilsKt.ensureAtEnd(parcel, validateObjectHeader29);
                return new zzom(j22, bArr, str22, bundle3, i24, j23, str23);
            default:
                int validateObjectHeader30 = ComposeUtilsKt.validateObjectHeader(parcel);
                ArrayList arrayList4 = null;
                while (parcel.dataPosition() < validateObjectHeader30) {
                    int readInt30 = parcel.readInt();
                    if (((char) readInt30) != 1) {
                        ComposeUtilsKt.skipUnknownField(parcel, readInt30);
                    } else {
                        arrayList4 = ComposeUtilsKt.createIntegerList(parcel, readInt30);
                    }
                }
                ComposeUtilsKt.ensureAtEnd(parcel, validateObjectHeader30);
                return new zzoo(arrayList4);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        switch (this.$r8$classId) {
            case 0:
                return new GoogleMapOptions[i];
            case 1:
                return new zzeg[i];
            case 2:
                return new zzei[i];
            case 3:
                return new zze[i];
            case 4:
                return new zzl[i];
            case 5:
                return new zzat[i];
            case 6:
                return new LastLocationRequest[i];
            case 7:
                return new LocationAvailability[i];
            case 8:
                return new LocationRequest[i];
            case 9:
                return new LocationResult[i];
            case 10:
                return new LocationSettingsRequest[i];
            case 11:
                return new LocationSettingsResult[i];
            case 12:
                return new LocationSettingsStates[i];
            case 13:
                return new zzal[i];
            case 14:
                return new CurrentLocationRequest[i];
            case 15:
                return new CameraPosition[i];
            case 16:
                return new VisibleRegion[i];
            case 17:
                return new LatLngBounds[i];
            case 18:
                return new LatLng[i];
            case 19:
                return new MapStyleOptions[i];
            case 20:
                return new MarkerOptions[i];
            case 21:
                return new PointOfInterest[i];
            case 22:
                return new zzaf[i];
            case 23:
                return new com.google.android.gms.measurement.internal.zzah[i];
            case 24:
                return new zzao[i];
            case 25:
                return new zzbf[i];
            case 26:
                return new zzbh[i];
            case 27:
                return new zzoh[i];
            case 28:
                return new zzom[i];
            default:
                return new zzoo[i];
        }
    }
}
