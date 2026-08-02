package com.google.android.libraries.places.api.model;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import com.google.android.libraries.places.api.model.Place;
import java.time.Duration;
import java.time.Instant;
import java.time.ZoneId;
import java.util.ArrayList;

/* loaded from: classes4.dex */
public final class zzdp implements Parcelable.Creator {
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ zzdp(int i) {
        this.$r8$classId = i;
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        Boolean bool;
        int i = 1;
        switch (this.$r8$classId) {
            case 0:
                return new zzdq((Uri) parcel.readParcelable(zzdq.class.getClassLoader()), parcel.readInt() == 0 ? parcel.readString() : null, parcel.readInt() == 0 ? parcel.readString() : null, parcel.readInt() == 0 ? parcel.readString() : null);
            case 1:
                return new zzds(parcel.readString(), parcel.readString());
            case 2:
                return new zzdu(parcel.readInt() == 0 ? parcel.readString() : null, parcel.readInt() == 0 ? parcel.readString() : null, parcel.readArrayList(zzdu.class.getClassLoader()), parcel.readArrayList(zzdu.class.getClassLoader()));
            case 3:
                return new zzdw(parcel.readArrayList(zzdw.class.getClassLoader()), Integer.valueOf(parcel.readInt()));
            case 4:
                return new zzec((zzdu) parcel.readParcelable(zzec.class.getClassLoader()), (zzdu) parcel.readParcelable(zzec.class.getClassLoader()), (zzdu) parcel.readParcelable(zzec.class.getClassLoader()), (zzdu) parcel.readParcelable(zzec.class.getClassLoader()), (Uri) parcel.readParcelable(zzec.class.getClassLoader()), parcel.readInt() == 0 ? parcel.readString() : null, parcel.readInt() == 0 ? parcel.readString() : null);
            case 5:
                return new zzee(parcel.readArrayList(zzee.class.getClassLoader()));
            case 6:
                return new zzeg((FuelPrice$FuelType) parcel.readParcelable(zzeg.class.getClassLoader()), (zzeu) parcel.readParcelable(zzeg.class.getClassLoader()), (Instant) parcel.readSerializable());
            case 7:
                return new zzei(parcel.readInt() == 0 ? parcel.readString() : null, parcel.readInt() == 0 ? parcel.readString() : null, (Uri) parcel.readParcelable(zzei.class.getClassLoader()), parcel.readInt() == 0 ? parcel.readString() : null, parcel.readInt() == 0 ? parcel.readString() : null);
            case 8:
                return new zzek((Uri) parcel.readParcelable(zzek.class.getClassLoader()), (Uri) parcel.readParcelable(zzek.class.getClassLoader()), (Uri) parcel.readParcelable(zzek.class.getClassLoader()), (Uri) parcel.readParcelable(zzek.class.getClassLoader()), (Uri) parcel.readParcelable(zzek.class.getClassLoader()));
            case 9:
                int i2 = 0;
                String readString = parcel.readInt() == 0 ? parcel.readString() : null;
                String readString2 = parcel.readInt() == 0 ? parcel.readString() : null;
                String readString3 = parcel.readInt() == 0 ? parcel.readString() : null;
                String readString4 = parcel.readInt() == 0 ? parcel.readString() : null;
                ArrayList readArrayList = parcel.readArrayList(zzem.class.getClassLoader());
                if (parcel.readInt() == 0) {
                    String readString5 = parcel.readString();
                    if (readString5 != null) {
                        if (!readString5.equals("NEAR")) {
                            if (readString5.equals("WITHIN")) {
                                i = 2;
                            } else if (readString5.equals("BESIDE")) {
                                i = 3;
                            } else if (readString5.equals("ACROSS_THE_ROAD")) {
                                i = 4;
                            } else if (readString5.equals("DOWN_THE_ROAD")) {
                                i = 5;
                            } else if (readString5.equals("AROUND_THE_CORNER")) {
                                i = 6;
                            } else if (readString5.equals("BEHIND")) {
                                i = 7;
                            } else {
                                a$$ExternalSyntheticBUOutline0.m$3("No enum constant com.google.android.libraries.places.api.model.Landmark.SpatialRelationship.".concat(readString5));
                            }
                        }
                        i2 = i;
                    } else {
                        a$$ExternalSyntheticBUOutline0.m$2("Name is null");
                    }
                    i = 0;
                    i2 = i;
                }
                return new zzem(readString, readString2, readString3, readString4, readArrayList, i2, parcel.readInt() == 0 ? Double.valueOf(parcel.readDouble()) : null, parcel.readInt() == 0 ? Double.valueOf(parcel.readDouble()) : null);
            case 10:
                return new zzeo((Duration) parcel.readSerializable(), parcel.readInt());
            case 11:
                return new zzeq(parcel.readInt(), parcel.readInt(), parcel.readInt());
            case 12:
                return new zzes(parcel.readInt(), parcel.readInt());
            case 13:
                return new zzeu(Integer.valueOf(parcel.readInt()), Long.valueOf(parcel.readLong()), parcel.readString());
            case 14:
                return new zzew((zzdu) parcel.readParcelable(zzew.class.getClassLoader()), (zzdu) parcel.readParcelable(zzew.class.getClassLoader()), (Uri) parcel.readParcelable(zzew.class.getClassLoader()), parcel.readInt() == 0 ? parcel.readString() : null, parcel.readInt() == 0 ? parcel.readString() : null);
            case 15:
                OpeningHours$HoursType openingHours$HoursType = (OpeningHours$HoursType) parcel.readParcelable(zzey.class.getClassLoader());
                ArrayList readArrayList2 = parcel.readArrayList(zzey.class.getClassLoader());
                ArrayList readArrayList3 = parcel.readArrayList(zzey.class.getClassLoader());
                ArrayList readArrayList4 = parcel.readArrayList(zzey.class.getClassLoader());
                if (parcel.readInt() == 0) {
                    bool = Boolean.valueOf(parcel.readInt() == 1);
                } else {
                    bool = null;
                }
                return new zzey(openingHours$HoursType, readArrayList2, readArrayList3, readArrayList4, bool, parcel.readInt() == 0 ? (Instant) parcel.readSerializable() : null, parcel.readInt() == 0 ? (Instant) parcel.readSerializable() : null);
            case 16:
                return new zzfa((Place.BooleanPlaceAttributeValue) parcel.readParcelable(zzfa.class.getClassLoader()), (Place.BooleanPlaceAttributeValue) parcel.readParcelable(zzfa.class.getClassLoader()), (Place.BooleanPlaceAttributeValue) parcel.readParcelable(zzfa.class.getClassLoader()), (Place.BooleanPlaceAttributeValue) parcel.readParcelable(zzfa.class.getClassLoader()), (Place.BooleanPlaceAttributeValue) parcel.readParcelable(zzfa.class.getClassLoader()), (Place.BooleanPlaceAttributeValue) parcel.readParcelable(zzfa.class.getClassLoader()), (Place.BooleanPlaceAttributeValue) parcel.readParcelable(zzfa.class.getClassLoader()));
            case 17:
                return new zzfc((Place.BooleanPlaceAttributeValue) parcel.readParcelable(zzfc.class.getClassLoader()), (Place.BooleanPlaceAttributeValue) parcel.readParcelable(zzfc.class.getClassLoader()), (Place.BooleanPlaceAttributeValue) parcel.readParcelable(zzfc.class.getClassLoader()), (Place.BooleanPlaceAttributeValue) parcel.readParcelable(zzfc.class.getClassLoader()));
            case 18:
                return new zzfe((zzgk) parcel.readParcelable(zzfe.class.getClassLoader()), (zzgk) parcel.readParcelable(zzfe.class.getClassLoader()));
            case 19:
                return new zzfg(parcel.readString(), parcel.readInt(), parcel.readInt(), parcel.readString(), parcel.readInt() == 0 ? parcel.readString() : null, (zzdc) parcel.readParcelable(PhotoMetadata.class.getClassLoader()), (Uri) parcel.readParcelable(PhotoMetadata.class.getClassLoader()), (Uri) parcel.readParcelable(PhotoMetadata.class.getClassLoader()));
            case 20:
                return new zzfi(parcel.readInt() == 0 ? parcel.readString() : null, parcel.readInt() == 0 ? parcel.readString() : null, parcel.readInt() == 0 ? parcel.readString() : null, (zzcu) parcel.readParcelable(Place.class.getClassLoader()), parcel.readArrayList(Place.class.getClassLoader()), (Place.BusinessStatus) parcel.readParcelable(Place.class.getClassLoader()), (zzdo) parcel.readParcelable(Place.class.getClassLoader()), (Place.BooleanPlaceAttributeValue) parcel.readParcelable(Place.class.getClassLoader()), (zzey) parcel.readParcelable(Place.class.getClassLoader()), (Place.BooleanPlaceAttributeValue) parcel.readParcelable(Place.class.getClassLoader()), (Place.BooleanPlaceAttributeValue) parcel.readParcelable(Place.class.getClassLoader()), parcel.readInt() == 0 ? parcel.readString() : null, parcel.readInt() == 0 ? parcel.readString() : null, parcel.readInt() == 0 ? Integer.valueOf(parcel.readInt()) : null, parcel.readInt() == 0 ? parcel.readString() : null, parcel.readInt() == 0 ? parcel.readString() : null, (LatLng) parcel.readParcelable(Place.class.getClassLoader()), parcel.readInt() == 0 ? parcel.readString() : null, parcel.readInt() == 0 ? parcel.readString() : null, parcel.readInt() == 0 ? parcel.readString() : null, (zzey) parcel.readParcelable(Place.class.getClassLoader()), parcel.readInt() == 0 ? parcel.readString() : null, parcel.readInt() == 0 ? parcel.readString() : null, parcel.readArrayList(Place.class.getClassLoader()), parcel.readArrayList(Place.class.getClassLoader()), parcel.readArrayList(Place.class.getClassLoader()), (zzfm) parcel.readParcelable(Place.class.getClassLoader()), parcel.readInt() == 0 ? Integer.valueOf(parcel.readInt()) : null, (zzfq) parcel.readParcelable(Place.class.getClassLoader()), parcel.readInt() == 0 ? parcel.readString() : null, parcel.readInt() == 0 ? parcel.readString() : null, parcel.readInt() == 0 ? parcel.readString() : null, parcel.readInt() == 0 ? Double.valueOf(parcel.readDouble()) : null, (Place.BooleanPlaceAttributeValue) parcel.readParcelable(Place.class.getClassLoader()), parcel.readArrayList(Place.class.getClassLoader()), parcel.readArrayList(Place.class.getClassLoader()), (Place.BooleanPlaceAttributeValue) parcel.readParcelable(Place.class.getClassLoader()), (Place.BooleanPlaceAttributeValue) parcel.readParcelable(Place.class.getClassLoader()), (Place.BooleanPlaceAttributeValue) parcel.readParcelable(Place.class.getClassLoader()), (Place.BooleanPlaceAttributeValue) parcel.readParcelable(Place.class.getClassLoader()), (Place.BooleanPlaceAttributeValue) parcel.readParcelable(Place.class.getClassLoader()), (Place.BooleanPlaceAttributeValue) parcel.readParcelable(Place.class.getClassLoader()), (Place.BooleanPlaceAttributeValue) parcel.readParcelable(Place.class.getClassLoader()), (Place.BooleanPlaceAttributeValue) parcel.readParcelable(Place.class.getClassLoader()), parcel.readInt() == 0 ? Integer.valueOf(parcel.readInt()) : null, parcel.readInt() == 0 ? Integer.valueOf(parcel.readInt()) : null, (LatLngBounds) parcel.readParcelable(Place.class.getClassLoader()), (Uri) parcel.readParcelable(Place.class.getClassLoader()), (Uri) parcel.readParcelable(Place.class.getClassLoader()), (zzcq) parcel.readParcelable(Place.class.getClassLoader()), (zzfa) parcel.readParcelable(Place.class.getClassLoader()), (zzfc) parcel.readParcelable(Place.class.getClassLoader()), (zzdw) parcel.readParcelable(Place.class.getClassLoader()), (Place.BooleanPlaceAttributeValue) parcel.readParcelable(Place.class.getClassLoader()), (Place.BooleanPlaceAttributeValue) parcel.readParcelable(Place.class.getClassLoader()), (Place.BooleanPlaceAttributeValue) parcel.readParcelable(Place.class.getClassLoader()), (Place.BooleanPlaceAttributeValue) parcel.readParcelable(Place.class.getClassLoader()), (Place.BooleanPlaceAttributeValue) parcel.readParcelable(Place.class.getClassLoader()), (Place.BooleanPlaceAttributeValue) parcel.readParcelable(Place.class.getClassLoader()), (Place.BooleanPlaceAttributeValue) parcel.readParcelable(Place.class.getClassLoader()), (Place.BooleanPlaceAttributeValue) parcel.readParcelable(Place.class.getClassLoader()), (Place.BooleanPlaceAttributeValue) parcel.readParcelable(Place.class.getClassLoader()), (Place.BooleanPlaceAttributeValue) parcel.readParcelable(Place.class.getClassLoader()), (Place.BooleanPlaceAttributeValue) parcel.readParcelable(Place.class.getClassLoader()), parcel.readArrayList(Place.class.getClassLoader()), (zzee) parcel.readParcelable(Place.class.getClassLoader()), (Place.BooleanPlaceAttributeValue) parcel.readParcelable(Place.class.getClassLoader()), (zzei) parcel.readParcelable(Place.class.getClassLoader()), (zzec) parcel.readParcelable(Place.class.getClassLoader()), (zzew) parcel.readParcelable(Place.class.getClassLoader()), (zzfw) parcel.readParcelable(Place.class.getClassLoader()), (zzek) parcel.readParcelable(Place.class.getClassLoader()), parcel.readArrayList(Place.class.getClassLoader()), parcel.readInt() == 0 ? (ZoneId) parcel.readSerializable() : null, (zzcw) parcel.readParcelable(Place.class.getClassLoader()), (zzfo) parcel.readParcelable(Place.class.getClassLoader()));
            case 21:
                return new zzfm(parcel.readInt() == 0 ? parcel.readString() : null, parcel.readInt() == 0 ? parcel.readString() : null);
            case 22:
                String str = null;
                String readString6 = parcel.readString();
                String readString7 = parcel.readInt() == 0 ? parcel.readString() : null;
                String readString8 = parcel.readInt() == 0 ? parcel.readString() : null;
                String readString9 = parcel.readInt() == 0 ? parcel.readString() : null;
                String readString10 = parcel.readInt() == 0 ? parcel.readString() : null;
                String readString11 = parcel.readInt() == 0 ? parcel.readString() : null;
                String readString12 = parcel.readInt() == 0 ? parcel.readString() : null;
                ArrayList readArrayList5 = parcel.readArrayList(zzfo.class.getClassLoader());
                ArrayList readArrayList6 = parcel.readArrayList(zzfo.class.getClassLoader());
                if (parcel.readInt() == 0) {
                    str = parcel.readString();
                }
                return new zzfo(readString6, readString7, readString8, readString9, readString10, readString11, readString12, readArrayList5, readArrayList6, str);
            case 23:
                return new zzfq((zzeu) parcel.readParcelable(zzfq.class.getClassLoader()), (zzeu) parcel.readParcelable(zzfq.class.getClassLoader()));
            case 24:
                return new zzfu(parcel.readInt() == 0 ? parcel.readString() : null, parcel.readInt() == 0 ? parcel.readString() : null, parcel.readInt() == 0 ? parcel.readString() : null, parcel.readInt() == 0 ? parcel.readString() : null, parcel.readInt() == 0 ? parcel.readString() : null, Double.valueOf(parcel.readDouble()), (zzda) parcel.readParcelable(zzfu.class.getClassLoader()), parcel.readString(), parcel.readInt() == 0 ? parcel.readString() : null, (Uri) parcel.readParcelable(zzfu.class.getClassLoader()), (zzeq) parcel.readParcelable(zzfu.class.getClassLoader()));
            case 25:
                String str2 = null;
                String readString13 = parcel.readInt() == 0 ? parcel.readString() : null;
                String readString14 = parcel.readInt() == 0 ? parcel.readString() : null;
                Uri uri = (Uri) parcel.readParcelable(zzfw.class.getClassLoader());
                String readString15 = parcel.readInt() == 0 ? parcel.readString() : null;
                if (parcel.readInt() == 0) {
                    str2 = parcel.readString();
                }
                return new zzfw(readString13, readString14, uri, readString15, str2, (Uri) parcel.readParcelable(zzfw.class.getClassLoader()));
            case 26:
                return new zzgc((Uri) parcel.readParcelable(zzgc.class.getClassLoader()), parcel.readArrayList(zzgc.class.getClassLoader()));
            case 27:
                return new zzgg((zzeq) parcel.readParcelable(zzgg.class.getClassLoader()), parcel.readInt() == 1);
            case 28:
                return new zzgi(parcel.readString(), parcel.readString());
            default:
                return new zzgk((zzeq) parcel.readParcelable(zzgk.class.getClassLoader()), (DayOfWeek) parcel.readParcelable(zzgk.class.getClassLoader()), (zzes) parcel.readParcelable(zzgk.class.getClassLoader()), parcel.readInt() == 1);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        switch (this.$r8$classId) {
            case 0:
                return new zzdq[i];
            case 1:
                return new zzds[i];
            case 2:
                return new zzdu[i];
            case 3:
                return new zzdw[i];
            case 4:
                return new zzec[i];
            case 5:
                return new zzee[i];
            case 6:
                return new zzeg[i];
            case 7:
                return new zzei[i];
            case 8:
                return new zzek[i];
            case 9:
                return new zzem[i];
            case 10:
                return new zzeo[i];
            case 11:
                return new zzeq[i];
            case 12:
                return new zzes[i];
            case 13:
                return new zzeu[i];
            case 14:
                return new zzew[i];
            case 15:
                return new zzey[i];
            case 16:
                return new zzfa[i];
            case 17:
                return new zzfc[i];
            case 18:
                return new zzfe[i];
            case 19:
                return new zzfg[i];
            case 20:
                return new zzfi[i];
            case 21:
                return new zzfm[i];
            case 22:
                return new zzfo[i];
            case 23:
                return new zzfq[i];
            case 24:
                return new zzfu[i];
            case 25:
                return new zzfw[i];
            case 26:
                return new zzgc[i];
            case 27:
                return new zzgg[i];
            case 28:
                return new zzgi[i];
            default:
                return new zzgk[i];
        }
    }
}
