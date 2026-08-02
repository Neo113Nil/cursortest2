package com.google.android.gms.internal.time;

import android.os.Parcel;
import android.os.Parcelable;
import com.squareup.cash.directory_ui.views.ComposeUtilsKt;
import java.util.ArrayList;

/* loaded from: classes4.dex */
public final class zzh implements Parcelable.Creator {
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ zzh(int i) {
        this.$r8$classId = i;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        long j = 0;
        Long l = null;
        zzg zzgVar = null;
        int i = 0;
        switch (this.$r8$classId) {
            case 0:
                int validateObjectHeader = ComposeUtilsKt.validateObjectHeader(parcel);
                while (parcel.dataPosition() < validateObjectHeader) {
                    int readInt = parcel.readInt();
                    char c = (char) readInt;
                    if (c == 1) {
                        j = ComposeUtilsKt.readLong(parcel, readInt);
                    } else if (c != 2) {
                        ComposeUtilsKt.skipUnknownField(parcel, readInt);
                    } else {
                        i = ComposeUtilsKt.readInt(parcel, readInt);
                    }
                }
                ComposeUtilsKt.ensureAtEnd(parcel, validateObjectHeader);
                return new zzg(j, i);
            case 1:
                int validateObjectHeader2 = ComposeUtilsKt.validateObjectHeader(parcel);
                while (parcel.dataPosition() < validateObjectHeader2) {
                    int readInt2 = parcel.readInt();
                    char c2 = (char) readInt2;
                    if (c2 == 1) {
                        j = ComposeUtilsKt.readLong(parcel, readInt2);
                    } else if (c2 != 2) {
                        ComposeUtilsKt.skipUnknownField(parcel, readInt2);
                    } else {
                        i = ComposeUtilsKt.readInt(parcel, readInt2);
                    }
                }
                ComposeUtilsKt.ensureAtEnd(parcel, validateObjectHeader2);
                return new zzi(j, i);
            case 2:
                int validateObjectHeader3 = ComposeUtilsKt.validateObjectHeader(parcel);
                String str = null;
                while (parcel.dataPosition() < validateObjectHeader3) {
                    int readInt3 = parcel.readInt();
                    char c3 = (char) readInt3;
                    if (c3 == 1) {
                        l = ComposeUtilsKt.readLongObject(parcel, readInt3);
                    } else if (c3 == 2) {
                        str = ComposeUtilsKt.createString(parcel, readInt3);
                    } else if (c3 != 3) {
                        ComposeUtilsKt.skipUnknownField(parcel, readInt3);
                    } else {
                        i = ComposeUtilsKt.readInt(parcel, readInt3);
                    }
                }
                ComposeUtilsKt.ensureAtEnd(parcel, validateObjectHeader3);
                return new zzk(i, l, str);
            case 3:
                int validateObjectHeader4 = ComposeUtilsKt.validateObjectHeader(parcel);
                zzg zzgVar2 = null;
                zzg zzgVar3 = null;
                zzg zzgVar4 = null;
                while (parcel.dataPosition() < validateObjectHeader4) {
                    int readInt4 = parcel.readInt();
                    char c4 = (char) readInt4;
                    if (c4 == 1) {
                        zzgVar = (zzg) ComposeUtilsKt.createParcelable(parcel, readInt4, zzg.CREATOR);
                    } else if (c4 == 2) {
                        zzgVar2 = (zzg) ComposeUtilsKt.createParcelable(parcel, readInt4, zzg.CREATOR);
                    } else if (c4 == 3) {
                        zzgVar3 = (zzg) ComposeUtilsKt.createParcelable(parcel, readInt4, zzg.CREATOR);
                    } else if (c4 != 4) {
                        ComposeUtilsKt.skipUnknownField(parcel, readInt4);
                    } else {
                        zzgVar4 = (zzg) ComposeUtilsKt.createParcelable(parcel, readInt4, zzg.CREATOR);
                    }
                }
                ComposeUtilsKt.ensureAtEnd(parcel, validateObjectHeader4);
                return new zzm(zzgVar, zzgVar2, zzgVar3, zzgVar4);
            case 4:
                int validateObjectHeader5 = ComposeUtilsKt.validateObjectHeader(parcel);
                while (parcel.dataPosition() < validateObjectHeader5) {
                    int readInt5 = parcel.readInt();
                    char c5 = (char) readInt5;
                    if (c5 == 1) {
                        i = ComposeUtilsKt.readInt(parcel, readInt5);
                    } else if (c5 != 2) {
                        ComposeUtilsKt.skipUnknownField(parcel, readInt5);
                    } else {
                        j = ComposeUtilsKt.readLong(parcel, readInt5);
                    }
                }
                ComposeUtilsKt.ensureAtEnd(parcel, validateObjectHeader5);
                return new zzo(i, j);
            default:
                int validateObjectHeader6 = ComposeUtilsKt.validateObjectHeader(parcel);
                zzg zzgVar5 = null;
                zzi zziVar = null;
                zzo zzoVar = null;
                ArrayList arrayList = null;
                ArrayList arrayList2 = null;
                while (parcel.dataPosition() < validateObjectHeader6) {
                    int readInt6 = parcel.readInt();
                    char c6 = (char) readInt6;
                    if (c6 == 1) {
                        zzgVar5 = (zzg) ComposeUtilsKt.createParcelable(parcel, readInt6, zzg.CREATOR);
                    } else if (c6 == 2) {
                        zziVar = (zzi) ComposeUtilsKt.createParcelable(parcel, readInt6, zzi.CREATOR);
                    } else if (c6 == 3) {
                        zzoVar = (zzo) ComposeUtilsKt.createParcelable(parcel, readInt6, zzo.CREATOR);
                    } else if (c6 == 4) {
                        arrayList = ComposeUtilsKt.createTypedList(parcel, readInt6, zzm.CREATOR);
                    } else if (c6 != 5) {
                        ComposeUtilsKt.skipUnknownField(parcel, readInt6);
                    } else {
                        arrayList2 = ComposeUtilsKt.createTypedList(parcel, readInt6, zzm.CREATOR);
                    }
                }
                ComposeUtilsKt.ensureAtEnd(parcel, validateObjectHeader6);
                return new zzq(zzgVar5, zziVar, zzoVar, arrayList, arrayList2);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        switch (this.$r8$classId) {
            case 0:
                return new zzg[i];
            case 1:
                return new zzi[i];
            case 2:
                return new zzk[i];
            case 3:
                return new zzm[i];
            case 4:
                return new zzo[i];
            default:
                return new zzq[i];
        }
    }
}
