package com.google.android.gms.internal.mlkit_vision_barcode;

import android.graphics.Point;
import android.os.Parcel;
import android.os.Parcelable;
import com.squareup.cash.directory_ui.views.ComposeUtilsKt;

/* loaded from: classes4.dex */
public final class zzh implements Parcelable.Creator {
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ zzh(int i) {
        this.$r8$classId = i;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        double d = 0.0d;
        int i = 0;
        String[] strArr = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        zzp zzpVar = null;
        String[] strArr2 = null;
        String str7 = null;
        String str8 = null;
        String str9 = null;
        String str10 = null;
        String str11 = null;
        String str12 = null;
        String str13 = null;
        String str14 = null;
        String str15 = null;
        switch (this.$r8$classId) {
            case 0:
                int validateObjectHeader = ComposeUtilsKt.validateObjectHeader(parcel);
                while (parcel.dataPosition() < validateObjectHeader) {
                    int readInt = parcel.readInt();
                    char c = (char) readInt;
                    if (c == 2) {
                        i = ComposeUtilsKt.readInt(parcel, readInt);
                    } else if (c != 3) {
                        ComposeUtilsKt.skipUnknownField(parcel, readInt);
                    } else {
                        strArr = ComposeUtilsKt.createStringArray(parcel, readInt);
                    }
                }
                ComposeUtilsKt.ensureAtEnd(parcel, validateObjectHeader);
                zzi zziVar = new zzi();
                zziVar.zza = i;
                zziVar.zzb = strArr;
                return zziVar;
            case 1:
                int validateObjectHeader2 = ComposeUtilsKt.validateObjectHeader(parcel);
                String str16 = null;
                String str17 = null;
                while (parcel.dataPosition() < validateObjectHeader2) {
                    int readInt2 = parcel.readInt();
                    char c2 = (char) readInt2;
                    if (c2 == 2) {
                        i = ComposeUtilsKt.readInt(parcel, readInt2);
                    } else if (c2 == 3) {
                        str15 = ComposeUtilsKt.createString(parcel, readInt2);
                    } else if (c2 == 4) {
                        str16 = ComposeUtilsKt.createString(parcel, readInt2);
                    } else if (c2 != 5) {
                        ComposeUtilsKt.skipUnknownField(parcel, readInt2);
                    } else {
                        str17 = ComposeUtilsKt.createString(parcel, readInt2);
                    }
                }
                ComposeUtilsKt.ensureAtEnd(parcel, validateObjectHeader2);
                zzn zznVar = new zzn();
                zznVar.zza = i;
                zznVar.zzb = str15;
                zznVar.zzc = str16;
                zznVar.zzd = str17;
                return zznVar;
            case 2:
                int validateObjectHeader3 = ComposeUtilsKt.validateObjectHeader(parcel);
                double d2 = 0.0d;
                while (parcel.dataPosition() < validateObjectHeader3) {
                    int readInt3 = parcel.readInt();
                    char c3 = (char) readInt3;
                    if (c3 == 2) {
                        d = ComposeUtilsKt.readDouble(parcel, readInt3);
                    } else if (c3 != 3) {
                        ComposeUtilsKt.skipUnknownField(parcel, readInt3);
                    } else {
                        d2 = ComposeUtilsKt.readDouble(parcel, readInt3);
                    }
                }
                ComposeUtilsKt.ensureAtEnd(parcel, validateObjectHeader3);
                zzo zzoVar = new zzo();
                zzoVar.zza = d;
                zzoVar.zzb = d2;
                return zzoVar;
            case 3:
                int validateObjectHeader4 = ComposeUtilsKt.validateObjectHeader(parcel);
                String str18 = null;
                String str19 = null;
                String str20 = null;
                String str21 = null;
                String str22 = null;
                String str23 = null;
                while (parcel.dataPosition() < validateObjectHeader4) {
                    int readInt4 = parcel.readInt();
                    switch ((char) readInt4) {
                        case 2:
                            str14 = ComposeUtilsKt.createString(parcel, readInt4);
                            break;
                        case 3:
                            str18 = ComposeUtilsKt.createString(parcel, readInt4);
                            break;
                        case 4:
                            str19 = ComposeUtilsKt.createString(parcel, readInt4);
                            break;
                        case 5:
                            str20 = ComposeUtilsKt.createString(parcel, readInt4);
                            break;
                        case 6:
                            str21 = ComposeUtilsKt.createString(parcel, readInt4);
                            break;
                        case 7:
                            str22 = ComposeUtilsKt.createString(parcel, readInt4);
                            break;
                        case '\b':
                            str23 = ComposeUtilsKt.createString(parcel, readInt4);
                            break;
                        default:
                            ComposeUtilsKt.skipUnknownField(parcel, readInt4);
                            break;
                    }
                }
                ComposeUtilsKt.ensureAtEnd(parcel, validateObjectHeader4);
                zzp zzpVar2 = new zzp();
                zzpVar2.zza = str14;
                zzpVar2.zzb = str18;
                zzpVar2.zzc = str19;
                zzpVar2.zzd = str20;
                zzpVar2.zze = str21;
                zzpVar2.zzf = str22;
                zzpVar2.zzg = str23;
                return zzpVar2;
            case 4:
                int validateObjectHeader5 = ComposeUtilsKt.validateObjectHeader(parcel);
                while (parcel.dataPosition() < validateObjectHeader5) {
                    int readInt5 = parcel.readInt();
                    char c4 = (char) readInt5;
                    if (c4 == 2) {
                        i = ComposeUtilsKt.readInt(parcel, readInt5);
                    } else if (c4 != 3) {
                        ComposeUtilsKt.skipUnknownField(parcel, readInt5);
                    } else {
                        str13 = ComposeUtilsKt.createString(parcel, readInt5);
                    }
                }
                ComposeUtilsKt.ensureAtEnd(parcel, validateObjectHeader5);
                zzq zzqVar = new zzq();
                zzqVar.zza = i;
                zzqVar.zzb = str13;
                return zzqVar;
            case 5:
                int validateObjectHeader6 = ComposeUtilsKt.validateObjectHeader(parcel);
                String str24 = null;
                while (parcel.dataPosition() < validateObjectHeader6) {
                    int readInt6 = parcel.readInt();
                    char c5 = (char) readInt6;
                    if (c5 == 2) {
                        str12 = ComposeUtilsKt.createString(parcel, readInt6);
                    } else if (c5 != 3) {
                        ComposeUtilsKt.skipUnknownField(parcel, readInt6);
                    } else {
                        str24 = ComposeUtilsKt.createString(parcel, readInt6);
                    }
                }
                ComposeUtilsKt.ensureAtEnd(parcel, validateObjectHeader6);
                zzr zzrVar = new zzr();
                zzrVar.zza = str12;
                zzrVar.zzb = str24;
                return zzrVar;
            case 6:
                int validateObjectHeader7 = ComposeUtilsKt.validateObjectHeader(parcel);
                String str25 = null;
                while (parcel.dataPosition() < validateObjectHeader7) {
                    int readInt7 = parcel.readInt();
                    char c6 = (char) readInt7;
                    if (c6 == 2) {
                        str11 = ComposeUtilsKt.createString(parcel, readInt7);
                    } else if (c6 != 3) {
                        ComposeUtilsKt.skipUnknownField(parcel, readInt7);
                    } else {
                        str25 = ComposeUtilsKt.createString(parcel, readInt7);
                    }
                }
                ComposeUtilsKt.ensureAtEnd(parcel, validateObjectHeader7);
                zzs zzsVar = new zzs();
                zzsVar.zza = str11;
                zzsVar.zzb = str25;
                return zzsVar;
            case 7:
                int validateObjectHeader8 = ComposeUtilsKt.validateObjectHeader(parcel);
                String str26 = null;
                while (parcel.dataPosition() < validateObjectHeader8) {
                    int readInt8 = parcel.readInt();
                    char c7 = (char) readInt8;
                    if (c7 == 2) {
                        str10 = ComposeUtilsKt.createString(parcel, readInt8);
                    } else if (c7 == 3) {
                        str26 = ComposeUtilsKt.createString(parcel, readInt8);
                    } else if (c7 != 4) {
                        ComposeUtilsKt.skipUnknownField(parcel, readInt8);
                    } else {
                        i = ComposeUtilsKt.readInt(parcel, readInt8);
                    }
                }
                ComposeUtilsKt.ensureAtEnd(parcel, validateObjectHeader8);
                zzt zztVar = new zzt();
                zztVar.zza = str10;
                zztVar.zzb = str26;
                zztVar.zzc = i;
                return zztVar;
            case 8:
                int validateObjectHeader9 = ComposeUtilsKt.validateObjectHeader(parcel);
                boolean z = false;
                while (parcel.dataPosition() < validateObjectHeader9) {
                    int readInt9 = parcel.readInt();
                    char c8 = (char) readInt9;
                    if (c8 == 2) {
                        i = ComposeUtilsKt.readInt(parcel, readInt9);
                    } else if (c8 != 3) {
                        ComposeUtilsKt.skipUnknownField(parcel, readInt9);
                    } else {
                        z = ComposeUtilsKt.readBoolean(parcel, readInt9);
                    }
                }
                ComposeUtilsKt.ensureAtEnd(parcel, validateObjectHeader9);
                zzah zzahVar = new zzah();
                zzahVar.zza = i;
                zzahVar.zzb = z;
                return zzahVar;
            case 9:
                int validateObjectHeader10 = ComposeUtilsKt.validateObjectHeader(parcel);
                long j = 0;
                int i2 = 0;
                int i3 = 0;
                int i4 = 0;
                int i5 = 0;
                while (parcel.dataPosition() < validateObjectHeader10) {
                    int readInt10 = parcel.readInt();
                    char c9 = (char) readInt10;
                    if (c9 == 2) {
                        i2 = ComposeUtilsKt.readInt(parcel, readInt10);
                    } else if (c9 == 3) {
                        i3 = ComposeUtilsKt.readInt(parcel, readInt10);
                    } else if (c9 == 4) {
                        i4 = ComposeUtilsKt.readInt(parcel, readInt10);
                    } else if (c9 == 5) {
                        j = ComposeUtilsKt.readLong(parcel, readInt10);
                    } else if (c9 != 6) {
                        ComposeUtilsKt.skipUnknownField(parcel, readInt10);
                    } else {
                        i5 = ComposeUtilsKt.readInt(parcel, readInt10);
                    }
                }
                ComposeUtilsKt.ensureAtEnd(parcel, validateObjectHeader10);
                return new zzan(i2, i3, i4, i5, j);
            case 10:
                int validateObjectHeader11 = ComposeUtilsKt.validateObjectHeader(parcel);
                int i6 = 0;
                boolean z2 = false;
                String str27 = null;
                Point[] pointArr = null;
                zzn zznVar2 = null;
                zzq zzqVar2 = null;
                zzr zzrVar2 = null;
                zzt zztVar2 = null;
                byte[] bArr = null;
                zzo zzoVar2 = null;
                zzs zzsVar2 = null;
                zzk zzkVar = null;
                zzl zzlVar = null;
                zzm zzmVar = null;
                while (parcel.dataPosition() < validateObjectHeader11) {
                    int readInt11 = parcel.readInt();
                    zzt zztVar3 = zztVar2;
                    switch ((char) readInt11) {
                        case 2:
                            i = ComposeUtilsKt.readInt(parcel, readInt11);
                            break;
                        case 3:
                            str9 = ComposeUtilsKt.createString(parcel, readInt11);
                            break;
                        case 4:
                            str27 = ComposeUtilsKt.createString(parcel, readInt11);
                            break;
                        case 5:
                            i6 = ComposeUtilsKt.readInt(parcel, readInt11);
                            break;
                        case 6:
                            pointArr = (Point[]) ComposeUtilsKt.createTypedArray(parcel, readInt11, Point.CREATOR);
                            break;
                        case 7:
                            zznVar2 = (zzn) ComposeUtilsKt.createParcelable(parcel, readInt11, zzn.CREATOR);
                            break;
                        case '\b':
                            zzqVar2 = (zzq) ComposeUtilsKt.createParcelable(parcel, readInt11, zzq.CREATOR);
                            break;
                        case '\t':
                            zzrVar2 = (zzr) ComposeUtilsKt.createParcelable(parcel, readInt11, zzr.CREATOR);
                            break;
                        case '\n':
                            zztVar2 = (zzt) ComposeUtilsKt.createParcelable(parcel, readInt11, zzt.CREATOR);
                            continue;
                        case 11:
                            zzsVar2 = (zzs) ComposeUtilsKt.createParcelable(parcel, readInt11, zzs.CREATOR);
                            break;
                        case '\f':
                            zzoVar2 = (zzo) ComposeUtilsKt.createParcelable(parcel, readInt11, zzo.CREATOR);
                            break;
                        case '\r':
                            zzkVar = (zzk) ComposeUtilsKt.createParcelable(parcel, readInt11, zzk.CREATOR);
                            break;
                        case 14:
                            zzlVar = (zzl) ComposeUtilsKt.createParcelable(parcel, readInt11, zzl.CREATOR);
                            break;
                        case 15:
                            zzmVar = (zzm) ComposeUtilsKt.createParcelable(parcel, readInt11, zzm.CREATOR);
                            break;
                        case 16:
                            bArr = ComposeUtilsKt.createByteArray(parcel, readInt11);
                            break;
                        case 17:
                            z2 = ComposeUtilsKt.readBoolean(parcel, readInt11);
                            break;
                        case 18:
                            d = ComposeUtilsKt.readDouble(parcel, readInt11);
                            break;
                        default:
                            ComposeUtilsKt.skipUnknownField(parcel, readInt11);
                            break;
                    }
                    zztVar2 = zztVar3;
                }
                ComposeUtilsKt.ensureAtEnd(parcel, validateObjectHeader11);
                zzu zzuVar = new zzu();
                zzuVar.zza = i;
                zzuVar.zzb = str9;
                zzuVar.zzo = bArr;
                zzuVar.zzc = str27;
                zzuVar.zzd = i6;
                zzuVar.zze = pointArr;
                zzuVar.zzp = z2;
                zzuVar.zzq = d;
                zzuVar.zzf = zznVar2;
                zzuVar.zzg = zzqVar2;
                zzuVar.zzh = zzrVar2;
                zzuVar.zzi = zztVar2;
                zzuVar.zzj = zzsVar2;
                zzuVar.zzk = zzoVar2;
                zzuVar.zzl = zzkVar;
                zzuVar.zzm = zzlVar;
                zzuVar.zzn = zzmVar;
                return zzuVar;
            case 11:
                int validateObjectHeader12 = ComposeUtilsKt.validateObjectHeader(parcel);
                int i7 = 0;
                int i8 = 0;
                int i9 = 0;
                int i10 = 0;
                int i11 = 0;
                boolean z3 = false;
                while (parcel.dataPosition() < validateObjectHeader12) {
                    int readInt12 = parcel.readInt();
                    switch ((char) readInt12) {
                        case 2:
                            i = ComposeUtilsKt.readInt(parcel, readInt12);
                            break;
                        case 3:
                            i7 = ComposeUtilsKt.readInt(parcel, readInt12);
                            break;
                        case 4:
                            i8 = ComposeUtilsKt.readInt(parcel, readInt12);
                            break;
                        case 5:
                            i9 = ComposeUtilsKt.readInt(parcel, readInt12);
                            break;
                        case 6:
                            i10 = ComposeUtilsKt.readInt(parcel, readInt12);
                            break;
                        case 7:
                            i11 = ComposeUtilsKt.readInt(parcel, readInt12);
                            break;
                        case '\b':
                            z3 = ComposeUtilsKt.readBoolean(parcel, readInt12);
                            break;
                        case '\t':
                            str8 = ComposeUtilsKt.createString(parcel, readInt12);
                            break;
                        default:
                            ComposeUtilsKt.skipUnknownField(parcel, readInt12);
                            break;
                    }
                }
                ComposeUtilsKt.ensureAtEnd(parcel, validateObjectHeader12);
                zzj zzjVar = new zzj();
                zzjVar.zza = i;
                zzjVar.zzb = i7;
                zzjVar.zzc = i8;
                zzjVar.zzd = i9;
                zzjVar.zze = i10;
                zzjVar.zzf = i11;
                zzjVar.zzg = z3;
                zzjVar.zzh = str8;
                return zzjVar;
            case 12:
                int validateObjectHeader13 = ComposeUtilsKt.validateObjectHeader(parcel);
                String str28 = null;
                String str29 = null;
                String str30 = null;
                String str31 = null;
                zzj zzjVar2 = null;
                zzj zzjVar3 = null;
                while (parcel.dataPosition() < validateObjectHeader13) {
                    int readInt13 = parcel.readInt();
                    switch ((char) readInt13) {
                        case 2:
                            str7 = ComposeUtilsKt.createString(parcel, readInt13);
                            break;
                        case 3:
                            str28 = ComposeUtilsKt.createString(parcel, readInt13);
                            break;
                        case 4:
                            str29 = ComposeUtilsKt.createString(parcel, readInt13);
                            break;
                        case 5:
                            str30 = ComposeUtilsKt.createString(parcel, readInt13);
                            break;
                        case 6:
                            str31 = ComposeUtilsKt.createString(parcel, readInt13);
                            break;
                        case 7:
                            zzjVar2 = (zzj) ComposeUtilsKt.createParcelable(parcel, readInt13, zzj.CREATOR);
                            break;
                        case '\b':
                            zzjVar3 = (zzj) ComposeUtilsKt.createParcelable(parcel, readInt13, zzj.CREATOR);
                            break;
                        default:
                            ComposeUtilsKt.skipUnknownField(parcel, readInt13);
                            break;
                    }
                }
                ComposeUtilsKt.ensureAtEnd(parcel, validateObjectHeader13);
                zzk zzkVar2 = new zzk();
                zzkVar2.zza = str7;
                zzkVar2.zzb = str28;
                zzkVar2.zzc = str29;
                zzkVar2.zzd = str30;
                zzkVar2.zze = str31;
                zzkVar2.zzf = zzjVar2;
                zzkVar2.zzg = zzjVar3;
                return zzkVar2;
            case 13:
                int validateObjectHeader14 = ComposeUtilsKt.validateObjectHeader(parcel);
                while (parcel.dataPosition() < validateObjectHeader14) {
                    int readInt14 = parcel.readInt();
                    char c10 = (char) readInt14;
                    if (c10 == 1) {
                        i = ComposeUtilsKt.readInt(parcel, readInt14);
                    } else if (c10 != 2) {
                        ComposeUtilsKt.skipUnknownField(parcel, readInt14);
                    } else {
                        strArr2 = ComposeUtilsKt.createStringArray(parcel, readInt14);
                    }
                }
                ComposeUtilsKt.ensureAtEnd(parcel, validateObjectHeader14);
                return new zzxp(strArr2, i);
            case 14:
                int validateObjectHeader15 = ComposeUtilsKt.validateObjectHeader(parcel);
                String str32 = null;
                String str33 = null;
                zzq[] zzqVarArr = null;
                zzn[] zznVarArr = null;
                String[] strArr3 = null;
                zzi[] zziVarArr = null;
                while (parcel.dataPosition() < validateObjectHeader15) {
                    int readInt15 = parcel.readInt();
                    switch ((char) readInt15) {
                        case 2:
                            zzpVar = (zzp) ComposeUtilsKt.createParcelable(parcel, readInt15, zzp.CREATOR);
                            break;
                        case 3:
                            str32 = ComposeUtilsKt.createString(parcel, readInt15);
                            break;
                        case 4:
                            str33 = ComposeUtilsKt.createString(parcel, readInt15);
                            break;
                        case 5:
                            zzqVarArr = (zzq[]) ComposeUtilsKt.createTypedArray(parcel, readInt15, zzq.CREATOR);
                            break;
                        case 6:
                            zznVarArr = (zzn[]) ComposeUtilsKt.createTypedArray(parcel, readInt15, zzn.CREATOR);
                            break;
                        case 7:
                            strArr3 = ComposeUtilsKt.createStringArray(parcel, readInt15);
                            break;
                        case '\b':
                            zziVarArr = (zzi[]) ComposeUtilsKt.createTypedArray(parcel, readInt15, zzi.CREATOR);
                            break;
                        default:
                            ComposeUtilsKt.skipUnknownField(parcel, readInt15);
                            break;
                    }
                }
                ComposeUtilsKt.ensureAtEnd(parcel, validateObjectHeader15);
                zzl zzlVar2 = new zzl();
                zzlVar2.zza = zzpVar;
                zzlVar2.zzb = str32;
                zzlVar2.zzc = str33;
                zzlVar2.zzd = zzqVarArr;
                zzlVar2.zze = zznVarArr;
                zzlVar2.zzf = strArr3;
                zzlVar2.zzg = zziVarArr;
                return zzlVar2;
            case 15:
                int validateObjectHeader16 = ComposeUtilsKt.validateObjectHeader(parcel);
                int i12 = 0;
                int i13 = 0;
                String str34 = null;
                String str35 = null;
                byte[] bArr2 = null;
                Point[] pointArr2 = null;
                zzxu zzxuVar = null;
                zzxx zzxxVar = null;
                zzxy zzxyVar = null;
                zzya zzyaVar = null;
                zzxz zzxzVar = null;
                zzxv zzxvVar = null;
                zzxr zzxrVar = null;
                zzxs zzxsVar = null;
                zzxt zzxtVar = null;
                while (parcel.dataPosition() < validateObjectHeader16) {
                    int readInt16 = parcel.readInt();
                    switch ((char) readInt16) {
                        case 1:
                            i12 = ComposeUtilsKt.readInt(parcel, readInt16);
                            break;
                        case 2:
                            str34 = ComposeUtilsKt.createString(parcel, readInt16);
                            break;
                        case 3:
                            str35 = ComposeUtilsKt.createString(parcel, readInt16);
                            break;
                        case 4:
                            bArr2 = ComposeUtilsKt.createByteArray(parcel, readInt16);
                            break;
                        case 5:
                            pointArr2 = (Point[]) ComposeUtilsKt.createTypedArray(parcel, readInt16, Point.CREATOR);
                            break;
                        case 6:
                            i13 = ComposeUtilsKt.readInt(parcel, readInt16);
                            break;
                        case 7:
                            zzxuVar = (zzxu) ComposeUtilsKt.createParcelable(parcel, readInt16, zzxu.CREATOR);
                            break;
                        case '\b':
                            zzxxVar = (zzxx) ComposeUtilsKt.createParcelable(parcel, readInt16, zzxx.CREATOR);
                            break;
                        case '\t':
                            zzxyVar = (zzxy) ComposeUtilsKt.createParcelable(parcel, readInt16, zzxy.CREATOR);
                            break;
                        case '\n':
                            zzyaVar = (zzya) ComposeUtilsKt.createParcelable(parcel, readInt16, zzya.CREATOR);
                            break;
                        case 11:
                            zzxzVar = (zzxz) ComposeUtilsKt.createParcelable(parcel, readInt16, zzxz.CREATOR);
                            break;
                        case '\f':
                            zzxvVar = (zzxv) ComposeUtilsKt.createParcelable(parcel, readInt16, zzxv.CREATOR);
                            break;
                        case '\r':
                            zzxrVar = (zzxr) ComposeUtilsKt.createParcelable(parcel, readInt16, zzxr.CREATOR);
                            break;
                        case 14:
                            zzxsVar = (zzxs) ComposeUtilsKt.createParcelable(parcel, readInt16, zzxs.CREATOR);
                            break;
                        case 15:
                            zzxtVar = (zzxt) ComposeUtilsKt.createParcelable(parcel, readInt16, zzxt.CREATOR);
                            break;
                        default:
                            ComposeUtilsKt.skipUnknownField(parcel, readInt16);
                            break;
                    }
                }
                ComposeUtilsKt.ensureAtEnd(parcel, validateObjectHeader16);
                return new zzyb(i12, str34, str35, bArr2, pointArr2, i13, zzxuVar, zzxxVar, zzxyVar, zzyaVar, zzxzVar, zzxvVar, zzxrVar, zzxsVar, zzxtVar);
            case 16:
                int validateObjectHeader17 = ComposeUtilsKt.validateObjectHeader(parcel);
                int i14 = 0;
                int i15 = 0;
                int i16 = 0;
                int i17 = 0;
                boolean z4 = false;
                int i18 = 0;
                int i19 = 0;
                String str36 = null;
                while (parcel.dataPosition() < validateObjectHeader17) {
                    int readInt17 = parcel.readInt();
                    switch ((char) readInt17) {
                        case 1:
                            i14 = ComposeUtilsKt.readInt(parcel, readInt17);
                            break;
                        case 2:
                            i15 = ComposeUtilsKt.readInt(parcel, readInt17);
                            break;
                        case 3:
                            i16 = ComposeUtilsKt.readInt(parcel, readInt17);
                            break;
                        case 4:
                            i17 = ComposeUtilsKt.readInt(parcel, readInt17);
                            break;
                        case 5:
                            i18 = ComposeUtilsKt.readInt(parcel, readInt17);
                            break;
                        case 6:
                            i19 = ComposeUtilsKt.readInt(parcel, readInt17);
                            break;
                        case 7:
                            z4 = ComposeUtilsKt.readBoolean(parcel, readInt17);
                            break;
                        case '\b':
                            str36 = ComposeUtilsKt.createString(parcel, readInt17);
                            break;
                        default:
                            ComposeUtilsKt.skipUnknownField(parcel, readInt17);
                            break;
                    }
                }
                ComposeUtilsKt.ensureAtEnd(parcel, validateObjectHeader17);
                return new zzxq(str36, i14, i15, i16, i17, z4, i18, i19);
            case 17:
                int validateObjectHeader18 = ComposeUtilsKt.validateObjectHeader(parcel);
                String str37 = null;
                String str38 = null;
                String str39 = null;
                String str40 = null;
                String str41 = null;
                zzxq zzxqVar = null;
                zzxq zzxqVar2 = null;
                while (parcel.dataPosition() < validateObjectHeader18) {
                    int readInt18 = parcel.readInt();
                    switch ((char) readInt18) {
                        case 1:
                            str37 = ComposeUtilsKt.createString(parcel, readInt18);
                            break;
                        case 2:
                            str38 = ComposeUtilsKt.createString(parcel, readInt18);
                            break;
                        case 3:
                            str39 = ComposeUtilsKt.createString(parcel, readInt18);
                            break;
                        case 4:
                            str40 = ComposeUtilsKt.createString(parcel, readInt18);
                            break;
                        case 5:
                            str41 = ComposeUtilsKt.createString(parcel, readInt18);
                            break;
                        case 6:
                            zzxqVar = (zzxq) ComposeUtilsKt.createParcelable(parcel, readInt18, zzxq.CREATOR);
                            break;
                        case 7:
                            zzxqVar2 = (zzxq) ComposeUtilsKt.createParcelable(parcel, readInt18, zzxq.CREATOR);
                            break;
                        default:
                            ComposeUtilsKt.skipUnknownField(parcel, readInt18);
                            break;
                    }
                }
                ComposeUtilsKt.ensureAtEnd(parcel, validateObjectHeader18);
                return new zzxr(str37, str38, str39, str40, str41, zzxqVar, zzxqVar2);
            case 18:
                int validateObjectHeader19 = ComposeUtilsKt.validateObjectHeader(parcel);
                zzxw zzxwVar = null;
                String str42 = null;
                String str43 = null;
                zzxx[] zzxxVarArr = null;
                zzxu[] zzxuVarArr = null;
                String[] strArr4 = null;
                zzxp[] zzxpVarArr = null;
                while (parcel.dataPosition() < validateObjectHeader19) {
                    int readInt19 = parcel.readInt();
                    switch ((char) readInt19) {
                        case 1:
                            zzxwVar = (zzxw) ComposeUtilsKt.createParcelable(parcel, readInt19, zzxw.CREATOR);
                            break;
                        case 2:
                            str42 = ComposeUtilsKt.createString(parcel, readInt19);
                            break;
                        case 3:
                            str43 = ComposeUtilsKt.createString(parcel, readInt19);
                            break;
                        case 4:
                            zzxxVarArr = (zzxx[]) ComposeUtilsKt.createTypedArray(parcel, readInt19, zzxx.CREATOR);
                            break;
                        case 5:
                            zzxuVarArr = (zzxu[]) ComposeUtilsKt.createTypedArray(parcel, readInt19, zzxu.CREATOR);
                            break;
                        case 6:
                            strArr4 = ComposeUtilsKt.createStringArray(parcel, readInt19);
                            break;
                        case 7:
                            zzxpVarArr = (zzxp[]) ComposeUtilsKt.createTypedArray(parcel, readInt19, zzxp.CREATOR);
                            break;
                        default:
                            ComposeUtilsKt.skipUnknownField(parcel, readInt19);
                            break;
                    }
                }
                ComposeUtilsKt.ensureAtEnd(parcel, validateObjectHeader19);
                return new zzxs(zzxwVar, str42, str43, zzxxVarArr, zzxuVarArr, strArr4, zzxpVarArr);
            case 19:
                int validateObjectHeader20 = ComposeUtilsKt.validateObjectHeader(parcel);
                String str44 = null;
                String str45 = null;
                String str46 = null;
                String str47 = null;
                String str48 = null;
                String str49 = null;
                String str50 = null;
                String str51 = null;
                String str52 = null;
                String str53 = null;
                String str54 = null;
                String str55 = null;
                String str56 = null;
                String str57 = null;
                while (parcel.dataPosition() < validateObjectHeader20) {
                    int readInt20 = parcel.readInt();
                    switch ((char) readInt20) {
                        case 1:
                            str44 = ComposeUtilsKt.createString(parcel, readInt20);
                            break;
                        case 2:
                            str45 = ComposeUtilsKt.createString(parcel, readInt20);
                            break;
                        case 3:
                            str46 = ComposeUtilsKt.createString(parcel, readInt20);
                            break;
                        case 4:
                            str47 = ComposeUtilsKt.createString(parcel, readInt20);
                            break;
                        case 5:
                            str48 = ComposeUtilsKt.createString(parcel, readInt20);
                            break;
                        case 6:
                            str49 = ComposeUtilsKt.createString(parcel, readInt20);
                            break;
                        case 7:
                            str50 = ComposeUtilsKt.createString(parcel, readInt20);
                            break;
                        case '\b':
                            str51 = ComposeUtilsKt.createString(parcel, readInt20);
                            break;
                        case '\t':
                            str52 = ComposeUtilsKt.createString(parcel, readInt20);
                            break;
                        case '\n':
                            str53 = ComposeUtilsKt.createString(parcel, readInt20);
                            break;
                        case 11:
                            str54 = ComposeUtilsKt.createString(parcel, readInt20);
                            break;
                        case '\f':
                            str55 = ComposeUtilsKt.createString(parcel, readInt20);
                            break;
                        case '\r':
                            str56 = ComposeUtilsKt.createString(parcel, readInt20);
                            break;
                        case 14:
                            str57 = ComposeUtilsKt.createString(parcel, readInt20);
                            break;
                        default:
                            ComposeUtilsKt.skipUnknownField(parcel, readInt20);
                            break;
                    }
                }
                ComposeUtilsKt.ensureAtEnd(parcel, validateObjectHeader20);
                return new zzxt(str44, str45, str46, str47, str48, str49, str50, str51, str52, str53, str54, str55, str56, str57);
            case 20:
                int validateObjectHeader21 = ComposeUtilsKt.validateObjectHeader(parcel);
                String str58 = null;
                String str59 = null;
                while (parcel.dataPosition() < validateObjectHeader21) {
                    int readInt21 = parcel.readInt();
                    char c11 = (char) readInt21;
                    if (c11 == 1) {
                        i = ComposeUtilsKt.readInt(parcel, readInt21);
                    } else if (c11 == 2) {
                        str6 = ComposeUtilsKt.createString(parcel, readInt21);
                    } else if (c11 == 3) {
                        str58 = ComposeUtilsKt.createString(parcel, readInt21);
                    } else if (c11 != 4) {
                        ComposeUtilsKt.skipUnknownField(parcel, readInt21);
                    } else {
                        str59 = ComposeUtilsKt.createString(parcel, readInt21);
                    }
                }
                ComposeUtilsKt.ensureAtEnd(parcel, validateObjectHeader21);
                return new zzxu(i, str6, str58, str59);
            case 21:
                int validateObjectHeader22 = ComposeUtilsKt.validateObjectHeader(parcel);
                double d3 = 0.0d;
                while (parcel.dataPosition() < validateObjectHeader22) {
                    int readInt22 = parcel.readInt();
                    char c12 = (char) readInt22;
                    if (c12 == 1) {
                        d = ComposeUtilsKt.readDouble(parcel, readInt22);
                    } else if (c12 != 2) {
                        ComposeUtilsKt.skipUnknownField(parcel, readInt22);
                    } else {
                        d3 = ComposeUtilsKt.readDouble(parcel, readInt22);
                    }
                }
                ComposeUtilsKt.ensureAtEnd(parcel, validateObjectHeader22);
                return new zzxv(d, d3);
            case 22:
                int validateObjectHeader23 = ComposeUtilsKt.validateObjectHeader(parcel);
                String str60 = null;
                String str61 = null;
                String str62 = null;
                String str63 = null;
                String str64 = null;
                String str65 = null;
                String str66 = null;
                while (parcel.dataPosition() < validateObjectHeader23) {
                    int readInt23 = parcel.readInt();
                    switch ((char) readInt23) {
                        case 1:
                            str60 = ComposeUtilsKt.createString(parcel, readInt23);
                            break;
                        case 2:
                            str61 = ComposeUtilsKt.createString(parcel, readInt23);
                            break;
                        case 3:
                            str62 = ComposeUtilsKt.createString(parcel, readInt23);
                            break;
                        case 4:
                            str63 = ComposeUtilsKt.createString(parcel, readInt23);
                            break;
                        case 5:
                            str64 = ComposeUtilsKt.createString(parcel, readInt23);
                            break;
                        case 6:
                            str65 = ComposeUtilsKt.createString(parcel, readInt23);
                            break;
                        case 7:
                            str66 = ComposeUtilsKt.createString(parcel, readInt23);
                            break;
                        default:
                            ComposeUtilsKt.skipUnknownField(parcel, readInt23);
                            break;
                    }
                }
                ComposeUtilsKt.ensureAtEnd(parcel, validateObjectHeader23);
                return new zzxw(str60, str61, str62, str63, str64, str65, str66);
            case 23:
                int validateObjectHeader24 = ComposeUtilsKt.validateObjectHeader(parcel);
                while (parcel.dataPosition() < validateObjectHeader24) {
                    int readInt24 = parcel.readInt();
                    char c13 = (char) readInt24;
                    if (c13 == 1) {
                        i = ComposeUtilsKt.readInt(parcel, readInt24);
                    } else if (c13 != 2) {
                        ComposeUtilsKt.skipUnknownField(parcel, readInt24);
                    } else {
                        str5 = ComposeUtilsKt.createString(parcel, readInt24);
                    }
                }
                ComposeUtilsKt.ensureAtEnd(parcel, validateObjectHeader24);
                return new zzxx(i, str5);
            case 24:
                int validateObjectHeader25 = ComposeUtilsKt.validateObjectHeader(parcel);
                String str67 = null;
                while (parcel.dataPosition() < validateObjectHeader25) {
                    int readInt25 = parcel.readInt();
                    char c14 = (char) readInt25;
                    if (c14 == 1) {
                        str4 = ComposeUtilsKt.createString(parcel, readInt25);
                    } else if (c14 != 2) {
                        ComposeUtilsKt.skipUnknownField(parcel, readInt25);
                    } else {
                        str67 = ComposeUtilsKt.createString(parcel, readInt25);
                    }
                }
                ComposeUtilsKt.ensureAtEnd(parcel, validateObjectHeader25);
                return new zzxy(str4, str67);
            case 25:
                int validateObjectHeader26 = ComposeUtilsKt.validateObjectHeader(parcel);
                String str68 = null;
                while (parcel.dataPosition() < validateObjectHeader26) {
                    int readInt26 = parcel.readInt();
                    char c15 = (char) readInt26;
                    if (c15 == 1) {
                        str3 = ComposeUtilsKt.createString(parcel, readInt26);
                    } else if (c15 != 2) {
                        ComposeUtilsKt.skipUnknownField(parcel, readInt26);
                    } else {
                        str68 = ComposeUtilsKt.createString(parcel, readInt26);
                    }
                }
                ComposeUtilsKt.ensureAtEnd(parcel, validateObjectHeader26);
                return new zzxz(str3, str68);
            case 26:
                int validateObjectHeader27 = ComposeUtilsKt.validateObjectHeader(parcel);
                String str69 = null;
                while (parcel.dataPosition() < validateObjectHeader27) {
                    int readInt27 = parcel.readInt();
                    char c16 = (char) readInt27;
                    if (c16 == 1) {
                        str2 = ComposeUtilsKt.createString(parcel, readInt27);
                    } else if (c16 == 2) {
                        str69 = ComposeUtilsKt.createString(parcel, readInt27);
                    } else if (c16 != 3) {
                        ComposeUtilsKt.skipUnknownField(parcel, readInt27);
                    } else {
                        i = ComposeUtilsKt.readInt(parcel, readInt27);
                    }
                }
                ComposeUtilsKt.ensureAtEnd(parcel, validateObjectHeader27);
                return new zzya(str2, str69, i);
            default:
                int validateObjectHeader28 = ComposeUtilsKt.validateObjectHeader(parcel);
                String str70 = null;
                String str71 = null;
                String str72 = null;
                String str73 = null;
                String str74 = null;
                String str75 = null;
                String str76 = null;
                String str77 = null;
                String str78 = null;
                String str79 = null;
                String str80 = null;
                String str81 = null;
                String str82 = null;
                while (parcel.dataPosition() < validateObjectHeader28) {
                    int readInt28 = parcel.readInt();
                    String str83 = str82;
                    switch ((char) readInt28) {
                        case 2:
                            str = ComposeUtilsKt.createString(parcel, readInt28);
                            break;
                        case 3:
                            str71 = ComposeUtilsKt.createString(parcel, readInt28);
                            break;
                        case 4:
                            str72 = ComposeUtilsKt.createString(parcel, readInt28);
                            break;
                        case 5:
                            str73 = ComposeUtilsKt.createString(parcel, readInt28);
                            break;
                        case 6:
                            str74 = ComposeUtilsKt.createString(parcel, readInt28);
                            break;
                        case 7:
                            str75 = ComposeUtilsKt.createString(parcel, readInt28);
                            break;
                        case '\b':
                            str76 = ComposeUtilsKt.createString(parcel, readInt28);
                            break;
                        case '\t':
                            str77 = ComposeUtilsKt.createString(parcel, readInt28);
                            break;
                        case '\n':
                            str78 = ComposeUtilsKt.createString(parcel, readInt28);
                            break;
                        case 11:
                            str79 = ComposeUtilsKt.createString(parcel, readInt28);
                            break;
                        case '\f':
                            str80 = ComposeUtilsKt.createString(parcel, readInt28);
                            break;
                        case '\r':
                            str81 = ComposeUtilsKt.createString(parcel, readInt28);
                            break;
                        case 14:
                            str82 = ComposeUtilsKt.createString(parcel, readInt28);
                            continue;
                        case 15:
                            str70 = ComposeUtilsKt.createString(parcel, readInt28);
                            break;
                        default:
                            ComposeUtilsKt.skipUnknownField(parcel, readInt28);
                            break;
                    }
                    str82 = str83;
                }
                ComposeUtilsKt.ensureAtEnd(parcel, validateObjectHeader28);
                zzm zzmVar2 = new zzm();
                zzmVar2.zza = str;
                zzmVar2.zzb = str71;
                zzmVar2.zzc = str72;
                zzmVar2.zzd = str73;
                zzmVar2.zze = str74;
                zzmVar2.zzf = str75;
                zzmVar2.zzg = str76;
                zzmVar2.zzh = str77;
                zzmVar2.zzi = str78;
                zzmVar2.zzj = str79;
                zzmVar2.zzk = str80;
                zzmVar2.zzl = str81;
                zzmVar2.zzm = str82;
                zzmVar2.zzn = str70;
                return zzmVar2;
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        switch (this.$r8$classId) {
            case 0:
                return new zzi[i];
            case 1:
                return new zzn[i];
            case 2:
                return new zzo[i];
            case 3:
                return new zzp[i];
            case 4:
                return new zzq[i];
            case 5:
                return new zzr[i];
            case 6:
                return new zzs[i];
            case 7:
                return new zzt[i];
            case 8:
                return new zzah[i];
            case 9:
                return new zzan[i];
            case 10:
                return new zzu[i];
            case 11:
                return new zzj[i];
            case 12:
                return new zzk[i];
            case 13:
                return new zzxp[i];
            case 14:
                return new zzl[i];
            case 15:
                return new zzyb[i];
            case 16:
                return new zzxq[i];
            case 17:
                return new zzxr[i];
            case 18:
                return new zzxs[i];
            case 19:
                return new zzxt[i];
            case 20:
                return new zzxu[i];
            case 21:
                return new zzxv[i];
            case 22:
                return new zzxw[i];
            case 23:
                return new zzxx[i];
            case 24:
                return new zzxy[i];
            case 25:
                return new zzxz[i];
            case 26:
                return new zzya[i];
            default:
                return new zzm[i];
        }
    }
}
