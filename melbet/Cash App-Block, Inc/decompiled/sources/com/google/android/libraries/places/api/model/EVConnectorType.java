package com.google.android.libraries.places.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.play.core.review.zzb;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class EVConnectorType implements Parcelable {
    public static final Parcelable.Creator<EVConnectorType> CREATOR;
    public static final EVConnectorType EV_CONNECTOR_TYPE_CCS_COMBO_1;
    public static final EVConnectorType EV_CONNECTOR_TYPE_CCS_COMBO_2;
    public static final EVConnectorType EV_CONNECTOR_TYPE_CHADEMO;
    public static final EVConnectorType EV_CONNECTOR_TYPE_J1772;
    public static final EVConnectorType EV_CONNECTOR_TYPE_NACS;
    public static final EVConnectorType EV_CONNECTOR_TYPE_OTHER;
    public static final EVConnectorType EV_CONNECTOR_TYPE_TESLA;
    public static final EVConnectorType EV_CONNECTOR_TYPE_TYPE_2;
    public static final EVConnectorType EV_CONNECTOR_TYPE_UNSPECIFIED;
    public static final EVConnectorType EV_CONNECTOR_TYPE_UNSPECIFIED_GB_T;
    public static final EVConnectorType EV_CONNECTOR_TYPE_UNSPECIFIED_WALL_OUTLET;
    public static final /* synthetic */ EVConnectorType[] zza;

    static {
        EVConnectorType eVConnectorType = new EVConnectorType("EV_CONNECTOR_TYPE_UNSPECIFIED", 0);
        EV_CONNECTOR_TYPE_UNSPECIFIED = eVConnectorType;
        EVConnectorType eVConnectorType2 = new EVConnectorType("EV_CONNECTOR_TYPE_OTHER", 1);
        EV_CONNECTOR_TYPE_OTHER = eVConnectorType2;
        EVConnectorType eVConnectorType3 = new EVConnectorType("EV_CONNECTOR_TYPE_J1772", 2);
        EV_CONNECTOR_TYPE_J1772 = eVConnectorType3;
        EVConnectorType eVConnectorType4 = new EVConnectorType("EV_CONNECTOR_TYPE_TYPE_2", 3);
        EV_CONNECTOR_TYPE_TYPE_2 = eVConnectorType4;
        EVConnectorType eVConnectorType5 = new EVConnectorType("EV_CONNECTOR_TYPE_CHADEMO", 4);
        EV_CONNECTOR_TYPE_CHADEMO = eVConnectorType5;
        EVConnectorType eVConnectorType6 = new EVConnectorType("EV_CONNECTOR_TYPE_CCS_COMBO_1", 5);
        EV_CONNECTOR_TYPE_CCS_COMBO_1 = eVConnectorType6;
        EVConnectorType eVConnectorType7 = new EVConnectorType("EV_CONNECTOR_TYPE_CCS_COMBO_2", 6);
        EV_CONNECTOR_TYPE_CCS_COMBO_2 = eVConnectorType7;
        EVConnectorType eVConnectorType8 = new EVConnectorType("EV_CONNECTOR_TYPE_TESLA", 7);
        EV_CONNECTOR_TYPE_TESLA = eVConnectorType8;
        EVConnectorType eVConnectorType9 = new EVConnectorType("EV_CONNECTOR_TYPE_UNSPECIFIED_GB_T", 8);
        EV_CONNECTOR_TYPE_UNSPECIFIED_GB_T = eVConnectorType9;
        EVConnectorType eVConnectorType10 = new EVConnectorType("EV_CONNECTOR_TYPE_UNSPECIFIED_WALL_OUTLET", 9);
        EV_CONNECTOR_TYPE_UNSPECIFIED_WALL_OUTLET = eVConnectorType10;
        EVConnectorType eVConnectorType11 = new EVConnectorType("EV_CONNECTOR_TYPE_NACS", 10);
        EV_CONNECTOR_TYPE_NACS = eVConnectorType11;
        zza = new EVConnectorType[]{eVConnectorType, eVConnectorType2, eVConnectorType3, eVConnectorType4, eVConnectorType5, eVConnectorType6, eVConnectorType7, eVConnectorType8, eVConnectorType9, eVConnectorType10, eVConnectorType11};
        CREATOR = new zzb(2);
    }

    public static EVConnectorType valueOf(String str) {
        return (EVConnectorType) Enum.valueOf(EVConnectorType.class, str);
    }

    public static EVConnectorType[] values() {
        return (EVConnectorType[]) zza.clone();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(name());
    }
}
