package com.google.android.gms.signin.internal;

import android.content.Intent;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.zaw;
import com.google.android.gms.common.internal.zay;
import com.google.android.gms.measurement.internal.zzom;
import com.google.android.gms.measurement.internal.zzoq;
import com.google.android.gms.measurement.internal.zzpl;
import com.google.android.gms.measurement.internal.zzr;
import com.google.android.gms.tapandpay.firstparty.AccountInfo;
import com.google.android.gms.tapandpay.firstparty.CardInfo;
import com.google.android.gms.tapandpay.firstparty.ContactlessSetupItem;
import com.google.android.gms.tapandpay.firstparty.RetrieveInAppPaymentCredentialResponse;
import com.google.android.gms.tapandpay.firstparty.TokenStatus;
import com.google.android.gms.tapandpay.firstparty.zzab;
import com.google.android.gms.tapandpay.firstparty.zzad;
import com.google.android.gms.tapandpay.firstparty.zzaf;
import com.google.android.gms.tapandpay.firstparty.zzah;
import com.google.android.gms.tapandpay.firstparty.zzaj;
import com.google.android.gms.tapandpay.firstparty.zzal;
import com.google.android.gms.tapandpay.firstparty.zzan;
import com.google.android.gms.tapandpay.firstparty.zzap;
import com.google.android.gms.tapandpay.firstparty.zzas;
import com.google.android.gms.tapandpay.firstparty.zzau;
import com.google.android.gms.tapandpay.firstparty.zzaw;
import com.google.android.gms.tapandpay.firstparty.zzaz;
import com.google.android.gms.tapandpay.firstparty.zzb;
import com.google.android.gms.tapandpay.firstparty.zze;
import com.google.android.gms.tapandpay.firstparty.zzg;
import com.google.android.gms.tapandpay.firstparty.zzj;
import com.google.android.gms.tapandpay.firstparty.zzl;
import com.google.android.gms.tapandpay.firstparty.zzz;
import com.squareup.cash.directory_ui.views.ComposeUtilsKt;
import com.squareup.cash.directory_ui.views.MooncakeHeaderViewKt;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;

/* loaded from: classes4.dex */
public final class zab implements Parcelable.Creator {
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ zab(int i) {
        this.$r8$classId = i;
    }

    public static void zza(zzpl zzplVar, Parcel parcel) {
        int i = zzplVar.zza;
        int zzb = MooncakeHeaderViewKt.zzb(parcel, 20293);
        MooncakeHeaderViewKt.zza(parcel, 1, 4);
        parcel.writeInt(i);
        MooncakeHeaderViewKt.writeString(parcel, 2, zzplVar.zzb);
        long j = zzplVar.zzc;
        MooncakeHeaderViewKt.zza(parcel, 3, 8);
        parcel.writeLong(j);
        MooncakeHeaderViewKt.writeLongObject(parcel, 4, zzplVar.zzd);
        MooncakeHeaderViewKt.writeString(parcel, 6, zzplVar.zze);
        MooncakeHeaderViewKt.writeString(parcel, 7, zzplVar.zzf);
        Double d = zzplVar.zzg;
        if (d != null) {
            MooncakeHeaderViewKt.zza(parcel, 8, 8);
            parcel.writeDouble(d.doubleValue());
        }
        MooncakeHeaderViewKt.zzc(parcel, zzb);
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int i = 0;
        int i2 = 0;
        boolean z = false;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        boolean z2 = false;
        int i7 = 0;
        boolean z3 = false;
        int i8 = 0;
        int i9 = 0;
        Intent intent = null;
        CardInfo[] cardInfoArr = null;
        AccountInfo accountInfo = null;
        zzaw zzawVar = null;
        String str = null;
        ArrayList arrayList = null;
        zzal zzalVar = null;
        String str2 = null;
        ConnectionResult connectionResult = null;
        zaw zawVar = null;
        ArrayList arrayList2 = null;
        ArrayList arrayList3 = null;
        switch (this.$r8$classId) {
            case 0:
                int validateObjectHeader = ComposeUtilsKt.validateObjectHeader(parcel);
                int i10 = 0;
                while (parcel.dataPosition() < validateObjectHeader) {
                    int readInt = parcel.readInt();
                    char c = (char) readInt;
                    if (c == 1) {
                        i = ComposeUtilsKt.readInt(parcel, readInt);
                    } else if (c == 2) {
                        i10 = ComposeUtilsKt.readInt(parcel, readInt);
                    } else if (c != 3) {
                        ComposeUtilsKt.skipUnknownField(parcel, readInt);
                    } else {
                        intent = (Intent) ComposeUtilsKt.createParcelable(parcel, readInt, Intent.CREATOR);
                    }
                }
                ComposeUtilsKt.ensureAtEnd(parcel, validateObjectHeader);
                return new zaa(i, i10, intent);
            case 1:
                int validateObjectHeader2 = ComposeUtilsKt.validateObjectHeader(parcel);
                while (parcel.dataPosition() < validateObjectHeader2) {
                    int readInt2 = parcel.readInt();
                    if (((char) readInt2) != 1) {
                        ComposeUtilsKt.skipUnknownField(parcel, readInt2);
                    } else {
                        arrayList3 = ComposeUtilsKt.createTypedList(parcel, readInt2, zzom.CREATOR);
                    }
                }
                ComposeUtilsKt.ensureAtEnd(parcel, validateObjectHeader2);
                return new zzoq(arrayList3);
            case 2:
                int validateObjectHeader3 = ComposeUtilsKt.validateObjectHeader(parcel);
                long j = 0;
                int i11 = 0;
                String str3 = null;
                Long l = null;
                Float f = null;
                String str4 = null;
                String str5 = null;
                Double d = null;
                while (parcel.dataPosition() < validateObjectHeader3) {
                    int readInt3 = parcel.readInt();
                    switch ((char) readInt3) {
                        case 1:
                            i11 = ComposeUtilsKt.readInt(parcel, readInt3);
                            break;
                        case 2:
                            str3 = ComposeUtilsKt.createString(parcel, readInt3);
                            break;
                        case 3:
                            j = ComposeUtilsKt.readLong(parcel, readInt3);
                            break;
                        case 4:
                            l = ComposeUtilsKt.readLongObject(parcel, readInt3);
                            break;
                        case 5:
                            f = ComposeUtilsKt.readFloatObject(parcel, readInt3);
                            break;
                        case 6:
                            str4 = ComposeUtilsKt.createString(parcel, readInt3);
                            break;
                        case 7:
                            str5 = ComposeUtilsKt.createString(parcel, readInt3);
                            break;
                        case '\b':
                            int readSize = ComposeUtilsKt.readSize(parcel, readInt3);
                            if (readSize != 0) {
                                ComposeUtilsKt.zzb(parcel, readSize, 8);
                                d = Double.valueOf(parcel.readDouble());
                                break;
                            } else {
                                d = null;
                                break;
                            }
                        default:
                            ComposeUtilsKt.skipUnknownField(parcel, readInt3);
                            break;
                    }
                }
                ComposeUtilsKt.ensureAtEnd(parcel, validateObjectHeader3);
                return new zzpl(i11, str3, j, l, f, str4, str5, d);
            case 3:
                int validateObjectHeader4 = ComposeUtilsKt.validateObjectHeader(parcel);
                String str6 = "";
                String str7 = str6;
                String str8 = str7;
                String str9 = str8;
                long j2 = 0;
                long j3 = 0;
                long j4 = 0;
                long j5 = 0;
                long j6 = 0;
                long j7 = 0;
                long j8 = 0;
                long j9 = 0;
                int i12 = 100;
                boolean z4 = true;
                boolean z5 = true;
                boolean z6 = false;
                int i13 = 0;
                boolean z7 = false;
                boolean z8 = false;
                int i14 = 0;
                int i15 = 0;
                String str10 = null;
                String str11 = null;
                String str12 = null;
                String str13 = null;
                String str14 = null;
                String str15 = null;
                Boolean bool = null;
                ArrayList arrayList4 = null;
                String str16 = null;
                String str17 = null;
                long j10 = -2147483648L;
                while (parcel.dataPosition() < validateObjectHeader4) {
                    int readInt4 = parcel.readInt();
                    switch ((char) readInt4) {
                        case 2:
                            str10 = ComposeUtilsKt.createString(parcel, readInt4);
                            break;
                        case 3:
                            str11 = ComposeUtilsKt.createString(parcel, readInt4);
                            break;
                        case 4:
                            str12 = ComposeUtilsKt.createString(parcel, readInt4);
                            break;
                        case 5:
                            str13 = ComposeUtilsKt.createString(parcel, readInt4);
                            break;
                        case 6:
                            j2 = ComposeUtilsKt.readLong(parcel, readInt4);
                            break;
                        case 7:
                            j3 = ComposeUtilsKt.readLong(parcel, readInt4);
                            break;
                        case '\b':
                            str14 = ComposeUtilsKt.createString(parcel, readInt4);
                            break;
                        case '\t':
                            z4 = ComposeUtilsKt.readBoolean(parcel, readInt4);
                            break;
                        case '\n':
                            z6 = ComposeUtilsKt.readBoolean(parcel, readInt4);
                            break;
                        case 11:
                            j10 = ComposeUtilsKt.readLong(parcel, readInt4);
                            break;
                        case '\f':
                            str15 = ComposeUtilsKt.createString(parcel, readInt4);
                            break;
                        case '\r':
                        case 17:
                        case 19:
                        case 20:
                        case 24:
                        case '!':
                        default:
                            ComposeUtilsKt.skipUnknownField(parcel, readInt4);
                            break;
                        case 14:
                            j4 = ComposeUtilsKt.readLong(parcel, readInt4);
                            break;
                        case 15:
                            i13 = ComposeUtilsKt.readInt(parcel, readInt4);
                            break;
                        case 16:
                            z5 = ComposeUtilsKt.readBoolean(parcel, readInt4);
                            break;
                        case 18:
                            z7 = ComposeUtilsKt.readBoolean(parcel, readInt4);
                            break;
                        case 21:
                            int readSize2 = ComposeUtilsKt.readSize(parcel, readInt4);
                            if (readSize2 != 0) {
                                ComposeUtilsKt.zzb(parcel, readSize2, 4);
                                bool = Boolean.valueOf(parcel.readInt() != 0);
                                break;
                            } else {
                                bool = null;
                                break;
                            }
                        case 22:
                            j5 = ComposeUtilsKt.readLong(parcel, readInt4);
                            break;
                        case 23:
                            arrayList4 = ComposeUtilsKt.createStringList(parcel, readInt4);
                            break;
                        case 25:
                            str6 = ComposeUtilsKt.createString(parcel, readInt4);
                            break;
                        case 26:
                            str7 = ComposeUtilsKt.createString(parcel, readInt4);
                            break;
                        case 27:
                            str16 = ComposeUtilsKt.createString(parcel, readInt4);
                            break;
                        case 28:
                            z8 = ComposeUtilsKt.readBoolean(parcel, readInt4);
                            break;
                        case 29:
                            j6 = ComposeUtilsKt.readLong(parcel, readInt4);
                            break;
                        case 30:
                            i12 = ComposeUtilsKt.readInt(parcel, readInt4);
                            break;
                        case 31:
                            str8 = ComposeUtilsKt.createString(parcel, readInt4);
                            break;
                        case ' ':
                            i14 = ComposeUtilsKt.readInt(parcel, readInt4);
                            break;
                        case '\"':
                            j7 = ComposeUtilsKt.readLong(parcel, readInt4);
                            break;
                        case '#':
                            str17 = ComposeUtilsKt.createString(parcel, readInt4);
                            break;
                        case '$':
                            str9 = ComposeUtilsKt.createString(parcel, readInt4);
                            break;
                        case '%':
                            j8 = ComposeUtilsKt.readLong(parcel, readInt4);
                            break;
                        case '&':
                            i15 = ComposeUtilsKt.readInt(parcel, readInt4);
                            break;
                        case '\'':
                            j9 = ComposeUtilsKt.readLong(parcel, readInt4);
                            break;
                    }
                }
                ComposeUtilsKt.ensureAtEnd(parcel, validateObjectHeader4);
                return new zzr(str10, str11, str12, str13, j2, j3, str14, z4, z6, j10, str15, j4, i13, z5, z7, bool, j5, arrayList4, str6, str7, str16, z8, j6, i12, str8, i14, j7, str17, str9, j8, i15, j9);
            case 4:
                int validateObjectHeader5 = ComposeUtilsKt.validateObjectHeader(parcel);
                String str18 = null;
                while (parcel.dataPosition() < validateObjectHeader5) {
                    int readInt5 = parcel.readInt();
                    char c2 = (char) readInt5;
                    if (c2 == 1) {
                        arrayList2 = ComposeUtilsKt.createStringList(parcel, readInt5);
                    } else if (c2 != 2) {
                        ComposeUtilsKt.skipUnknownField(parcel, readInt5);
                    } else {
                        str18 = ComposeUtilsKt.createString(parcel, readInt5);
                    }
                }
                ComposeUtilsKt.ensureAtEnd(parcel, validateObjectHeader5);
                return new zag(str18, arrayList2);
            case 5:
                int validateObjectHeader6 = ComposeUtilsKt.validateObjectHeader(parcel);
                while (parcel.dataPosition() < validateObjectHeader6) {
                    int readInt6 = parcel.readInt();
                    char c3 = (char) readInt6;
                    if (c3 == 1) {
                        i9 = ComposeUtilsKt.readInt(parcel, readInt6);
                    } else if (c3 != 2) {
                        ComposeUtilsKt.skipUnknownField(parcel, readInt6);
                    } else {
                        zawVar = (zaw) ComposeUtilsKt.createParcelable(parcel, readInt6, zaw.CREATOR);
                    }
                }
                ComposeUtilsKt.ensureAtEnd(parcel, validateObjectHeader6);
                return new zai(i9, zawVar);
            case 6:
                int validateObjectHeader7 = ComposeUtilsKt.validateObjectHeader(parcel);
                zay zayVar = null;
                while (parcel.dataPosition() < validateObjectHeader7) {
                    int readInt7 = parcel.readInt();
                    char c4 = (char) readInt7;
                    if (c4 == 1) {
                        i8 = ComposeUtilsKt.readInt(parcel, readInt7);
                    } else if (c4 == 2) {
                        connectionResult = (ConnectionResult) ComposeUtilsKt.createParcelable(parcel, readInt7, ConnectionResult.CREATOR);
                    } else if (c4 != 3) {
                        ComposeUtilsKt.skipUnknownField(parcel, readInt7);
                    } else {
                        zayVar = (zay) ComposeUtilsKt.createParcelable(parcel, readInt7, zay.CREATOR);
                    }
                }
                ComposeUtilsKt.ensureAtEnd(parcel, validateObjectHeader7);
                return new zak(i8, connectionResult, zayVar);
            case 7:
                int validateObjectHeader8 = ComposeUtilsKt.validateObjectHeader(parcel);
                String str19 = null;
                while (parcel.dataPosition() < validateObjectHeader8) {
                    int readInt8 = parcel.readInt();
                    char c5 = (char) readInt8;
                    if (c5 == 2) {
                        str2 = ComposeUtilsKt.createString(parcel, readInt8);
                    } else if (c5 != 3) {
                        ComposeUtilsKt.skipUnknownField(parcel, readInt8);
                    } else {
                        str19 = ComposeUtilsKt.createString(parcel, readInt8);
                    }
                }
                ComposeUtilsKt.ensureAtEnd(parcel, validateObjectHeader8);
                return new AccountInfo(str2, str19);
            case 8:
                int validateObjectHeader9 = ComposeUtilsKt.validateObjectHeader(parcel);
                while (parcel.dataPosition() < validateObjectHeader9) {
                    int readInt9 = parcel.readInt();
                    if (((char) readInt9) != 1) {
                        ComposeUtilsKt.skipUnknownField(parcel, readInt9);
                    } else {
                        zzalVar = (zzal) ComposeUtilsKt.createParcelable(parcel, readInt9, zzal.CREATOR);
                    }
                }
                ComposeUtilsKt.ensureAtEnd(parcel, validateObjectHeader9);
                return new zzz(zzalVar);
            case 9:
                int validateObjectHeader10 = ComposeUtilsKt.validateObjectHeader(parcel);
                while (parcel.dataPosition() < validateObjectHeader10) {
                    int readInt10 = parcel.readInt();
                    if (((char) readInt10) != 1) {
                        ComposeUtilsKt.skipUnknownField(parcel, readInt10);
                    } else {
                        arrayList = ComposeUtilsKt.createTypedList(parcel, readInt10, zzas.CREATOR);
                    }
                }
                ComposeUtilsKt.ensureAtEnd(parcel, validateObjectHeader10);
                return new zzab(arrayList);
            case 10:
                int validateObjectHeader11 = ComposeUtilsKt.validateObjectHeader(parcel);
                boolean z9 = false;
                boolean z10 = false;
                boolean z11 = false;
                while (parcel.dataPosition() < validateObjectHeader11) {
                    int readInt11 = parcel.readInt();
                    char c6 = (char) readInt11;
                    if (c6 == 2) {
                        z3 = ComposeUtilsKt.readBoolean(parcel, readInt11);
                    } else if (c6 == 3) {
                        z9 = ComposeUtilsKt.readBoolean(parcel, readInt11);
                    } else if (c6 == 4) {
                        z10 = ComposeUtilsKt.readBoolean(parcel, readInt11);
                    } else if (c6 != 5) {
                        ComposeUtilsKt.skipUnknownField(parcel, readInt11);
                    } else {
                        z11 = ComposeUtilsKt.readBoolean(parcel, readInt11);
                    }
                }
                ComposeUtilsKt.ensureAtEnd(parcel, validateObjectHeader11);
                return new zzad(z3, z9, z10, z11);
            case 11:
                int validateObjectHeader12 = ComposeUtilsKt.validateObjectHeader(parcel);
                int i16 = 0;
                while (parcel.dataPosition() < validateObjectHeader12) {
                    int readInt12 = parcel.readInt();
                    char c7 = (char) readInt12;
                    if (c7 == 2) {
                        i7 = ComposeUtilsKt.readInt(parcel, readInt12);
                    } else if (c7 != 3) {
                        ComposeUtilsKt.skipUnknownField(parcel, readInt12);
                    } else {
                        i16 = ComposeUtilsKt.readInt(parcel, readInt12);
                    }
                }
                ComposeUtilsKt.ensureAtEnd(parcel, validateObjectHeader12);
                return new zzaf(i7, i16);
            case 12:
                int validateObjectHeader13 = ComposeUtilsKt.validateObjectHeader(parcel);
                int i17 = 0;
                int i18 = 0;
                int i19 = 0;
                boolean z12 = false;
                boolean z13 = false;
                while (parcel.dataPosition() < validateObjectHeader13) {
                    int readInt13 = parcel.readInt();
                    char c8 = (char) readInt13;
                    if (c8 == 2) {
                        z12 = ComposeUtilsKt.readBoolean(parcel, readInt13);
                    } else if (c8 == 3) {
                        i17 = ComposeUtilsKt.readInt(parcel, readInt13);
                    } else if (c8 == 4) {
                        i18 = ComposeUtilsKt.readInt(parcel, readInt13);
                    } else if (c8 == 5) {
                        i19 = ComposeUtilsKt.readInt(parcel, readInt13);
                    } else if (c8 != 6) {
                        ComposeUtilsKt.skipUnknownField(parcel, readInt13);
                    } else {
                        z13 = ComposeUtilsKt.readBoolean(parcel, readInt13);
                    }
                }
                ComposeUtilsKt.ensureAtEnd(parcel, validateObjectHeader13);
                return new zzah(i17, i18, i19, z12, z13);
            case 13:
                int validateObjectHeader14 = ComposeUtilsKt.validateObjectHeader(parcel);
                long j11 = 0;
                int i20 = 0;
                String str20 = null;
                String str21 = null;
                String str22 = null;
                String str23 = null;
                String str24 = null;
                String str25 = null;
                String str26 = null;
                String str27 = null;
                String str28 = null;
                String str29 = null;
                String str30 = null;
                String str31 = null;
                String str32 = null;
                String str33 = null;
                String str34 = null;
                String str35 = null;
                String str36 = null;
                String str37 = null;
                String str38 = null;
                String str39 = null;
                while (parcel.dataPosition() < validateObjectHeader14) {
                    int readInt14 = parcel.readInt();
                    switch ((char) readInt14) {
                        case 2:
                            str20 = ComposeUtilsKt.createString(parcel, readInt14);
                            break;
                        case 3:
                            str21 = ComposeUtilsKt.createString(parcel, readInt14);
                            break;
                        case 4:
                            str22 = ComposeUtilsKt.createString(parcel, readInt14);
                            break;
                        case 5:
                            str23 = ComposeUtilsKt.createString(parcel, readInt14);
                            break;
                        case 6:
                            str24 = ComposeUtilsKt.createString(parcel, readInt14);
                            break;
                        case 7:
                            str25 = ComposeUtilsKt.createString(parcel, readInt14);
                            break;
                        case '\b':
                            str26 = ComposeUtilsKt.createString(parcel, readInt14);
                            break;
                        case '\t':
                            str27 = ComposeUtilsKt.createString(parcel, readInt14);
                            break;
                        case '\n':
                            str28 = ComposeUtilsKt.createString(parcel, readInt14);
                            break;
                        case 11:
                            str29 = ComposeUtilsKt.createString(parcel, readInt14);
                            break;
                        case '\f':
                            str30 = ComposeUtilsKt.createString(parcel, readInt14);
                            break;
                        case '\r':
                            str31 = ComposeUtilsKt.createString(parcel, readInt14);
                            break;
                        case 14:
                            str32 = ComposeUtilsKt.createString(parcel, readInt14);
                            break;
                        case 15:
                            j11 = ComposeUtilsKt.readLong(parcel, readInt14);
                            break;
                        case 16:
                            str33 = ComposeUtilsKt.createString(parcel, readInt14);
                            break;
                        case 17:
                            str34 = ComposeUtilsKt.createString(parcel, readInt14);
                            break;
                        case 18:
                            str35 = ComposeUtilsKt.createString(parcel, readInt14);
                            break;
                        case 19:
                        default:
                            ComposeUtilsKt.skipUnknownField(parcel, readInt14);
                            break;
                        case 20:
                            str36 = ComposeUtilsKt.createString(parcel, readInt14);
                            break;
                        case 21:
                            str37 = ComposeUtilsKt.createString(parcel, readInt14);
                            break;
                        case 22:
                            str38 = ComposeUtilsKt.createString(parcel, readInt14);
                            break;
                        case 23:
                            str39 = ComposeUtilsKt.createString(parcel, readInt14);
                            break;
                        case 24:
                            i20 = ComposeUtilsKt.readInt(parcel, readInt14);
                            break;
                    }
                }
                ComposeUtilsKt.ensureAtEnd(parcel, validateObjectHeader14);
                return new zzaj(str20, str21, str22, str23, str24, str25, str26, str27, str28, str29, str30, str31, str32, j11, str33, str34, str35, str36, str37, str38, str39, i20);
            case 14:
                int validateObjectHeader15 = ComposeUtilsKt.validateObjectHeader(parcel);
                boolean z14 = false;
                boolean z15 = false;
                int i21 = 0;
                while (parcel.dataPosition() < validateObjectHeader15) {
                    int readInt15 = parcel.readInt();
                    char c9 = (char) readInt15;
                    if (c9 == 1) {
                        z2 = ComposeUtilsKt.readBoolean(parcel, readInt15);
                    } else if (c9 == 2) {
                        z14 = ComposeUtilsKt.readBoolean(parcel, readInt15);
                    } else if (c9 == 3) {
                        z15 = ComposeUtilsKt.readBoolean(parcel, readInt15);
                    } else if (c9 != 4) {
                        ComposeUtilsKt.skipUnknownField(parcel, readInt15);
                    } else {
                        i21 = ComposeUtilsKt.readInt(parcel, readInt15);
                    }
                }
                ComposeUtilsKt.ensureAtEnd(parcel, validateObjectHeader15);
                return new zzal(i21, z2, z14, z15);
            case 15:
                int validateObjectHeader16 = ComposeUtilsKt.validateObjectHeader(parcel);
                int i22 = 0;
                while (parcel.dataPosition() < validateObjectHeader16) {
                    int readInt16 = parcel.readInt();
                    char c10 = (char) readInt16;
                    if (c10 == 1) {
                        i6 = ComposeUtilsKt.readInt(parcel, readInt16);
                    } else if (c10 != 2) {
                        ComposeUtilsKt.skipUnknownField(parcel, readInt16);
                    } else {
                        i22 = ComposeUtilsKt.readInt(parcel, readInt16);
                    }
                }
                ComposeUtilsKt.ensureAtEnd(parcel, validateObjectHeader16);
                return new zzan(i6, i22);
            case 16:
                int validateObjectHeader17 = ComposeUtilsKt.validateObjectHeader(parcel);
                while (parcel.dataPosition() < validateObjectHeader17) {
                    ComposeUtilsKt.skipUnknownField(parcel, parcel.readInt());
                }
                ComposeUtilsKt.ensureAtEnd(parcel, validateObjectHeader17);
                return new zzap();
            case 17:
                int validateObjectHeader18 = ComposeUtilsKt.validateObjectHeader(parcel);
                int i23 = 0;
                int i24 = 0;
                String str40 = null;
                byte[] bArr = null;
                String str41 = null;
                String str42 = null;
                while (parcel.dataPosition() < validateObjectHeader18) {
                    int readInt17 = parcel.readInt();
                    switch ((char) readInt17) {
                        case 2:
                            str40 = ComposeUtilsKt.createString(parcel, readInt17);
                            break;
                        case 3:
                            bArr = ComposeUtilsKt.createByteArray(parcel, readInt17);
                            break;
                        case 4:
                            i23 = ComposeUtilsKt.readInt(parcel, readInt17);
                            break;
                        case 5:
                            i24 = ComposeUtilsKt.readInt(parcel, readInt17);
                            break;
                        case 6:
                            str41 = ComposeUtilsKt.createString(parcel, readInt17);
                            break;
                        case 7:
                            str42 = ComposeUtilsKt.createString(parcel, readInt17);
                            break;
                        default:
                            ComposeUtilsKt.skipUnknownField(parcel, readInt17);
                            break;
                    }
                }
                ComposeUtilsKt.ensureAtEnd(parcel, validateObjectHeader18);
                return new RetrieveInAppPaymentCredentialResponse(str40, bArr, i23, i24, str41, str42);
            case 18:
                int validateObjectHeader19 = ComposeUtilsKt.validateObjectHeader(parcel);
                long j12 = 0;
                long j13 = 0;
                int i25 = 0;
                BigDecimal bigDecimal = null;
                String str43 = null;
                while (parcel.dataPosition() < validateObjectHeader19) {
                    int readInt18 = parcel.readInt();
                    char c11 = (char) readInt18;
                    if (c11 == 1) {
                        j12 = ComposeUtilsKt.readLong(parcel, readInt18);
                    } else if (c11 == 2) {
                        int readSize3 = ComposeUtilsKt.readSize(parcel, readInt18);
                        int dataPosition = parcel.dataPosition();
                        if (readSize3 == 0) {
                            bigDecimal = null;
                        } else {
                            byte[] createByteArray = parcel.createByteArray();
                            int readInt19 = parcel.readInt();
                            parcel.setDataPosition(dataPosition + readSize3);
                            bigDecimal = new BigDecimal(new BigInteger(createByteArray), readInt19);
                        }
                    } else if (c11 == 3) {
                        str43 = ComposeUtilsKt.createString(parcel, readInt18);
                    } else if (c11 == 4) {
                        j13 = ComposeUtilsKt.readLong(parcel, readInt18);
                    } else if (c11 != 5) {
                        ComposeUtilsKt.skipUnknownField(parcel, readInt18);
                    } else {
                        i25 = ComposeUtilsKt.readInt(parcel, readInt18);
                    }
                }
                ComposeUtilsKt.ensureAtEnd(parcel, validateObjectHeader19);
                return new zzas(j12, bigDecimal, str43, j13, i25);
            case 19:
                int validateObjectHeader20 = ComposeUtilsKt.validateObjectHeader(parcel);
                int i26 = 0;
                int i27 = 0;
                boolean z16 = false;
                String str44 = null;
                String str45 = null;
                TokenStatus tokenStatus = null;
                String str46 = null;
                Uri uri = null;
                byte[] bArr2 = null;
                zzan[] zzanVarArr = null;
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
                            i26 = ComposeUtilsKt.readInt(parcel, readInt20);
                            break;
                        case 4:
                            tokenStatus = (TokenStatus) ComposeUtilsKt.createParcelable(parcel, readInt20, TokenStatus.CREATOR);
                            break;
                        case 5:
                            str46 = ComposeUtilsKt.createString(parcel, readInt20);
                            break;
                        case 6:
                            uri = (Uri) ComposeUtilsKt.createParcelable(parcel, readInt20, Uri.CREATOR);
                            break;
                        case 7:
                            bArr2 = ComposeUtilsKt.createByteArray(parcel, readInt20);
                            break;
                        case '\b':
                            zzanVarArr = (zzan[]) ComposeUtilsKt.createTypedArray(parcel, readInt20, zzan.CREATOR);
                            break;
                        case '\t':
                            i27 = ComposeUtilsKt.readInt(parcel, readInt20);
                            break;
                        case '\n':
                            z16 = ComposeUtilsKt.readBoolean(parcel, readInt20);
                            break;
                        default:
                            ComposeUtilsKt.skipUnknownField(parcel, readInt20);
                            break;
                    }
                }
                ComposeUtilsKt.ensureAtEnd(parcel, validateObjectHeader20);
                return new zzau(str44, str45, i26, tokenStatus, str46, uri, bArr2, zzanVarArr, i27, z16);
            case 20:
                int validateObjectHeader21 = ComposeUtilsKt.validateObjectHeader(parcel);
                while (parcel.dataPosition() < validateObjectHeader21) {
                    int readInt21 = parcel.readInt();
                    char c12 = (char) readInt21;
                    if (c12 == 2) {
                        str = ComposeUtilsKt.createString(parcel, readInt21);
                    } else if (c12 != 3) {
                        ComposeUtilsKt.skipUnknownField(parcel, readInt21);
                    } else {
                        i5 = ComposeUtilsKt.readInt(parcel, readInt21);
                    }
                }
                ComposeUtilsKt.ensureAtEnd(parcel, validateObjectHeader21);
                return new zzaw(str, i5);
            case 21:
                int validateObjectHeader22 = ComposeUtilsKt.validateObjectHeader(parcel);
                boolean z17 = false;
                while (parcel.dataPosition() < validateObjectHeader22) {
                    int readInt22 = parcel.readInt();
                    char c13 = (char) readInt22;
                    if (c13 == 2) {
                        zzawVar = (zzaw) ComposeUtilsKt.createParcelable(parcel, readInt22, zzaw.CREATOR);
                    } else if (c13 == 3) {
                        i4 = ComposeUtilsKt.readInt(parcel, readInt22);
                    } else if (c13 != 4) {
                        ComposeUtilsKt.skipUnknownField(parcel, readInt22);
                    } else {
                        z17 = ComposeUtilsKt.readBoolean(parcel, readInt22);
                    }
                }
                ComposeUtilsKt.ensureAtEnd(parcel, validateObjectHeader22);
                return new TokenStatus(zzawVar, i4, z17);
            case 22:
                int validateObjectHeader23 = ComposeUtilsKt.validateObjectHeader(parcel);
                int i28 = 0;
                int i29 = 0;
                int i30 = 0;
                while (parcel.dataPosition() < validateObjectHeader23) {
                    int readInt23 = parcel.readInt();
                    char c14 = (char) readInt23;
                    if (c14 == 2) {
                        i3 = ComposeUtilsKt.readInt(parcel, readInt23);
                    } else if (c14 == 3) {
                        i28 = ComposeUtilsKt.readInt(parcel, readInt23);
                    } else if (c14 == 4) {
                        i29 = ComposeUtilsKt.readInt(parcel, readInt23);
                    } else if (c14 != 5) {
                        ComposeUtilsKt.skipUnknownField(parcel, readInt23);
                    } else {
                        i30 = ComposeUtilsKt.readInt(parcel, readInt23);
                    }
                }
                ComposeUtilsKt.ensureAtEnd(parcel, validateObjectHeader23);
                return new zzaz(i3, i28, i29, i30);
            case 23:
                int validateObjectHeader24 = ComposeUtilsKt.validateObjectHeader(parcel);
                int i31 = 0;
                String str47 = null;
                byte[] bArr3 = null;
                TokenStatus tokenStatus2 = null;
                String str48 = null;
                zzaz zzazVar = null;
                while (parcel.dataPosition() < validateObjectHeader24) {
                    int readInt24 = parcel.readInt();
                    switch ((char) readInt24) {
                        case 1:
                            str47 = ComposeUtilsKt.createString(parcel, readInt24);
                            break;
                        case 2:
                            bArr3 = ComposeUtilsKt.createByteArray(parcel, readInt24);
                            break;
                        case 3:
                            i31 = ComposeUtilsKt.readInt(parcel, readInt24);
                            break;
                        case 4:
                            tokenStatus2 = (TokenStatus) ComposeUtilsKt.createParcelable(parcel, readInt24, TokenStatus.CREATOR);
                            break;
                        case 5:
                            str48 = ComposeUtilsKt.createString(parcel, readInt24);
                            break;
                        case 6:
                            zzazVar = (zzaz) ComposeUtilsKt.createParcelable(parcel, readInt24, zzaz.CREATOR);
                            break;
                        default:
                            ComposeUtilsKt.skipUnknownField(parcel, readInt24);
                            break;
                    }
                }
                ComposeUtilsKt.ensureAtEnd(parcel, validateObjectHeader24);
                return new zzb(str47, bArr3, i31, tokenStatus2, str48, zzazVar);
            case 24:
                int validateObjectHeader25 = ComposeUtilsKt.validateObjectHeader(parcel);
                long j14 = 0;
                long j15 = 0;
                long j16 = 0;
                long j17 = 0;
                int i32 = 0;
                int i33 = 0;
                int i34 = 0;
                int i35 = 0;
                int i36 = 0;
                int i37 = 0;
                boolean z18 = false;
                boolean z19 = false;
                boolean z20 = false;
                boolean z21 = false;
                int i38 = 0;
                boolean z22 = false;
                int i39 = 0;
                boolean z23 = false;
                int i40 = 0;
                String str49 = null;
                String str50 = null;
                byte[] bArr4 = null;
                String str51 = null;
                String str52 = null;
                TokenStatus tokenStatus3 = null;
                String str53 = null;
                Uri uri2 = null;
                zzaj zzajVar = null;
                String str54 = null;
                zzaz zzazVar2 = null;
                String str55 = null;
                byte[] bArr5 = null;
                zzah zzahVar = null;
                zzaf zzafVar = null;
                String str56 = null;
                zzan[] zzanVarArr2 = null;
                ArrayList arrayList5 = null;
                String str57 = null;
                String str58 = null;
                zze zzeVar = null;
                String str59 = null;
                String str60 = null;
                while (parcel.dataPosition() < validateObjectHeader25) {
                    int readInt25 = parcel.readInt();
                    switch ((char) readInt25) {
                        case 2:
                            str49 = ComposeUtilsKt.createString(parcel, readInt25);
                            break;
                        case 3:
                            bArr4 = ComposeUtilsKt.createByteArray(parcel, readInt25);
                            break;
                        case 4:
                            str51 = ComposeUtilsKt.createString(parcel, readInt25);
                            break;
                        case 5:
                            str52 = ComposeUtilsKt.createString(parcel, readInt25);
                            break;
                        case 6:
                            i32 = ComposeUtilsKt.readInt(parcel, readInt25);
                            break;
                        case 7:
                            tokenStatus3 = (TokenStatus) ComposeUtilsKt.createParcelable(parcel, readInt25, TokenStatus.CREATOR);
                            break;
                        case '\b':
                            str53 = ComposeUtilsKt.createString(parcel, readInt25);
                            break;
                        case '\t':
                            uri2 = (Uri) ComposeUtilsKt.createParcelable(parcel, readInt25, Uri.CREATOR);
                            break;
                        case '\n':
                            i33 = ComposeUtilsKt.readInt(parcel, readInt25);
                            break;
                        case 11:
                            i34 = ComposeUtilsKt.readInt(parcel, readInt25);
                            break;
                        case '\f':
                            zzajVar = (zzaj) ComposeUtilsKt.createParcelable(parcel, readInt25, zzaj.CREATOR);
                            break;
                        case '\r':
                            str54 = ComposeUtilsKt.createString(parcel, readInt25);
                            break;
                        case 14:
                        case 19:
                        default:
                            ComposeUtilsKt.skipUnknownField(parcel, readInt25);
                            break;
                        case 15:
                            zzazVar2 = (zzaz) ComposeUtilsKt.createParcelable(parcel, readInt25, zzaz.CREATOR);
                            break;
                        case 16:
                            str55 = ComposeUtilsKt.createString(parcel, readInt25);
                            break;
                        case 17:
                            bArr5 = ComposeUtilsKt.createByteArray(parcel, readInt25);
                            break;
                        case 18:
                            i35 = ComposeUtilsKt.readInt(parcel, readInt25);
                            break;
                        case 20:
                            i36 = ComposeUtilsKt.readInt(parcel, readInt25);
                            break;
                        case 21:
                            i37 = ComposeUtilsKt.readInt(parcel, readInt25);
                            break;
                        case 22:
                            zzahVar = (zzah) ComposeUtilsKt.createParcelable(parcel, readInt25, zzah.CREATOR);
                            break;
                        case 23:
                            zzafVar = (zzaf) ComposeUtilsKt.createParcelable(parcel, readInt25, zzaf.CREATOR);
                            break;
                        case 24:
                            str56 = ComposeUtilsKt.createString(parcel, readInt25);
                            break;
                        case 25:
                            zzanVarArr2 = (zzan[]) ComposeUtilsKt.createTypedArray(parcel, readInt25, zzan.CREATOR);
                            break;
                        case 26:
                            z18 = ComposeUtilsKt.readBoolean(parcel, readInt25);
                            break;
                        case 27:
                            arrayList5 = ComposeUtilsKt.createTypedList(parcel, readInt25, zzb.CREATOR);
                            break;
                        case 28:
                            z19 = ComposeUtilsKt.readBoolean(parcel, readInt25);
                            break;
                        case 29:
                            z20 = ComposeUtilsKt.readBoolean(parcel, readInt25);
                            break;
                        case 30:
                            j14 = ComposeUtilsKt.readLong(parcel, readInt25);
                            break;
                        case 31:
                            j15 = ComposeUtilsKt.readLong(parcel, readInt25);
                            break;
                        case ' ':
                            z21 = ComposeUtilsKt.readBoolean(parcel, readInt25);
                            break;
                        case '!':
                            j16 = ComposeUtilsKt.readLong(parcel, readInt25);
                            break;
                        case '\"':
                            str57 = ComposeUtilsKt.createString(parcel, readInt25);
                            break;
                        case '#':
                            str58 = ComposeUtilsKt.createString(parcel, readInt25);
                            break;
                        case '$':
                            zzeVar = (zze) ComposeUtilsKt.createParcelable(parcel, readInt25, zze.CREATOR);
                            break;
                        case '%':
                            i38 = ComposeUtilsKt.readInt(parcel, readInt25);
                            break;
                        case '&':
                            z22 = ComposeUtilsKt.readBoolean(parcel, readInt25);
                            break;
                        case '\'':
                            str59 = ComposeUtilsKt.createString(parcel, readInt25);
                            break;
                        case '(':
                            i39 = ComposeUtilsKt.readInt(parcel, readInt25);
                            break;
                        case ')':
                            z23 = ComposeUtilsKt.readBoolean(parcel, readInt25);
                            break;
                        case '*':
                            j17 = ComposeUtilsKt.readLong(parcel, readInt25);
                            break;
                        case '+':
                            str60 = ComposeUtilsKt.createString(parcel, readInt25);
                            break;
                        case ',':
                            i40 = ComposeUtilsKt.readInt(parcel, readInt25);
                            break;
                        case '-':
                            str50 = ComposeUtilsKt.createString(parcel, readInt25);
                            break;
                    }
                }
                ComposeUtilsKt.ensureAtEnd(parcel, validateObjectHeader25);
                return new CardInfo(str49, str50, bArr4, str51, str52, i32, tokenStatus3, str53, uri2, i33, i34, zzajVar, str54, zzazVar2, str55, bArr5, i35, i36, i37, zzahVar, zzafVar, str56, zzanVarArr2, z18, arrayList5, z19, z20, j14, j15, z21, j16, str57, str58, zzeVar, i38, z22, str59, i39, z23, j17, str60, i40);
            case 25:
                int validateObjectHeader26 = ComposeUtilsKt.validateObjectHeader(parcel);
                long j18 = 0;
                String str61 = null;
                String str62 = null;
                String str63 = null;
                String str64 = null;
                while (parcel.dataPosition() < validateObjectHeader26) {
                    int readInt26 = parcel.readInt();
                    char c15 = (char) readInt26;
                    if (c15 == 1) {
                        j18 = ComposeUtilsKt.readLong(parcel, readInt26);
                    } else if (c15 == 2) {
                        str61 = ComposeUtilsKt.createString(parcel, readInt26);
                    } else if (c15 == 3) {
                        str62 = ComposeUtilsKt.createString(parcel, readInt26);
                    } else if (c15 == 4) {
                        str63 = ComposeUtilsKt.createString(parcel, readInt26);
                    } else if (c15 != 5) {
                        ComposeUtilsKt.skipUnknownField(parcel, readInt26);
                    } else {
                        str64 = ComposeUtilsKt.createString(parcel, readInt26);
                    }
                }
                ComposeUtilsKt.ensureAtEnd(parcel, validateObjectHeader26);
                return new zze(str61, str62, str63, str64, j18);
            case 26:
                int validateObjectHeader27 = ComposeUtilsKt.validateObjectHeader(parcel);
                boolean z24 = false;
                while (parcel.dataPosition() < validateObjectHeader27) {
                    int readInt27 = parcel.readInt();
                    char c16 = (char) readInt27;
                    if (c16 == 1) {
                        z = ComposeUtilsKt.readBoolean(parcel, readInt27);
                    } else if (c16 != 2) {
                        ComposeUtilsKt.skipUnknownField(parcel, readInt27);
                    } else {
                        z24 = ComposeUtilsKt.readBoolean(parcel, readInt27);
                    }
                }
                ComposeUtilsKt.ensureAtEnd(parcel, validateObjectHeader27);
                zzg zzgVar = new zzg();
                zzgVar.zza = z;
                zzgVar.zzb = z24;
                return zzgVar;
            case 27:
                int validateObjectHeader28 = ComposeUtilsKt.validateObjectHeader(parcel);
                int i41 = 0;
                while (parcel.dataPosition() < validateObjectHeader28) {
                    int readInt28 = parcel.readInt();
                    char c17 = (char) readInt28;
                    if (c17 == 1) {
                        i2 = ComposeUtilsKt.readInt(parcel, readInt28);
                    } else if (c17 != 2) {
                        ComposeUtilsKt.skipUnknownField(parcel, readInt28);
                    } else {
                        i41 = ComposeUtilsKt.readInt(parcel, readInt28);
                    }
                }
                ComposeUtilsKt.ensureAtEnd(parcel, validateObjectHeader28);
                return new ContactlessSetupItem(i2, i41);
            case 28:
                int validateObjectHeader29 = ComposeUtilsKt.validateObjectHeader(parcel);
                while (parcel.dataPosition() < validateObjectHeader29) {
                    int readInt29 = parcel.readInt();
                    if (((char) readInt29) != 2) {
                        ComposeUtilsKt.skipUnknownField(parcel, readInt29);
                    } else {
                        accountInfo = (AccountInfo) ComposeUtilsKt.createParcelable(parcel, readInt29, AccountInfo.CREATOR);
                    }
                }
                ComposeUtilsKt.ensureAtEnd(parcel, validateObjectHeader29);
                return new zzj(accountInfo);
            default:
                int validateObjectHeader30 = ComposeUtilsKt.validateObjectHeader(parcel);
                while (parcel.dataPosition() < validateObjectHeader30) {
                    int readInt30 = parcel.readInt();
                    if (((char) readInt30) != 2) {
                        ComposeUtilsKt.skipUnknownField(parcel, readInt30);
                    } else {
                        cardInfoArr = (CardInfo[]) ComposeUtilsKt.createTypedArray(parcel, readInt30, CardInfo.CREATOR);
                    }
                }
                ComposeUtilsKt.ensureAtEnd(parcel, validateObjectHeader30);
                return new zzl(cardInfoArr);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        switch (this.$r8$classId) {
            case 0:
                return new zaa[i];
            case 1:
                return new zzoq[i];
            case 2:
                return new zzpl[i];
            case 3:
                return new zzr[i];
            case 4:
                return new zag[i];
            case 5:
                return new zai[i];
            case 6:
                return new zak[i];
            case 7:
                return new AccountInfo[i];
            case 8:
                return new zzz[i];
            case 9:
                return new zzab[i];
            case 10:
                return new zzad[i];
            case 11:
                return new zzaf[i];
            case 12:
                return new zzah[i];
            case 13:
                return new zzaj[i];
            case 14:
                return new zzal[i];
            case 15:
                return new zzan[i];
            case 16:
                return new zzap[i];
            case 17:
                return new RetrieveInAppPaymentCredentialResponse[i];
            case 18:
                return new zzas[i];
            case 19:
                return new zzau[i];
            case 20:
                return new zzaw[i];
            case 21:
                return new TokenStatus[i];
            case 22:
                return new zzaz[i];
            case 23:
                return new zzb[i];
            case 24:
                return new CardInfo[i];
            case 25:
                return new zze[i];
            case 26:
                return new zzg[i];
            case 27:
                return new ContactlessSetupItem[i];
            case 28:
                return new zzj[i];
            default:
                return new zzl[i];
        }
    }
}
