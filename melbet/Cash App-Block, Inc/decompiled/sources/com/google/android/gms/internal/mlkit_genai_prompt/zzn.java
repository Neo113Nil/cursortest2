package com.google.android.gms.internal.mlkit_genai_prompt;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import androidx.recyclerview.widget.RecyclerView;
import com.squareup.cash.directory_ui.views.ComposeUtilsKt;
import java.util.ArrayList;

/* loaded from: classes4.dex */
public final class zzn implements Parcelable.Creator {
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ zzn(int i) {
        this.$r8$classId = i;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int i = this.$r8$classId;
        float f = RecyclerView.DECELERATION_RATE;
        int i2 = 0;
        int i3 = 0;
        boolean z = false;
        int i4 = 0;
        ArrayList arrayList = null;
        String str = null;
        ArrayList arrayList2 = null;
        ArrayList arrayList3 = null;
        ParcelFileDescriptor parcelFileDescriptor = null;
        switch (i) {
            case 0:
                int validateObjectHeader = ComposeUtilsKt.validateObjectHeader(parcel);
                int i5 = 0;
                int i6 = 0;
                int i7 = 0;
                int i8 = 0;
                String str2 = null;
                String str3 = null;
                while (parcel.dataPosition() < validateObjectHeader) {
                    int readInt = parcel.readInt();
                    switch ((char) readInt) {
                        case 1:
                            str2 = ComposeUtilsKt.createString(parcel, readInt);
                            break;
                        case 2:
                            str3 = ComposeUtilsKt.createString(parcel, readInt);
                            break;
                        case 3:
                            i5 = ComposeUtilsKt.readInt(parcel, readInt);
                            break;
                        case 4:
                            i6 = ComposeUtilsKt.readInt(parcel, readInt);
                            break;
                        case 5:
                            i7 = ComposeUtilsKt.readInt(parcel, readInt);
                            break;
                        case 6:
                            i8 = ComposeUtilsKt.readInt(parcel, readInt);
                            break;
                        default:
                            ComposeUtilsKt.skipUnknownField(parcel, readInt);
                            break;
                    }
                }
                ComposeUtilsKt.ensureAtEnd(parcel, validateObjectHeader);
                return new zzm(str2, str3, i5, i6, i7, i8);
            case 1:
                int validateObjectHeader2 = ComposeUtilsKt.validateObjectHeader(parcel);
                zzbl zzblVar = null;
                while (parcel.dataPosition() < validateObjectHeader2) {
                    int readInt2 = parcel.readInt();
                    char c = (char) readInt2;
                    if (c == 1) {
                        arrayList = ComposeUtilsKt.createTypedList(parcel, readInt2, zzu.CREATOR);
                    } else if (c == 2) {
                        zzblVar = (zzbl) ComposeUtilsKt.createParcelable(parcel, readInt2, zzbl.CREATOR);
                    } else if (c != 3) {
                        ComposeUtilsKt.skipUnknownField(parcel, readInt2);
                    } else {
                        i2 = ComposeUtilsKt.readInt(parcel, readInt2);
                    }
                }
                ComposeUtilsKt.ensureAtEnd(parcel, validateObjectHeader2);
                return new zzz(arrayList, zzblVar, i2);
            case 2:
                int validateObjectHeader3 = ComposeUtilsKt.validateObjectHeader(parcel);
                while (parcel.dataPosition() < validateObjectHeader3) {
                    ComposeUtilsKt.skipUnknownField(parcel, parcel.readInt());
                }
                ComposeUtilsKt.ensureAtEnd(parcel, validateObjectHeader3);
                return new zzbi();
            case 3:
                int validateObjectHeader4 = ComposeUtilsKt.validateObjectHeader(parcel);
                String str4 = "unknown";
                long j = 0;
                long j2 = 0;
                long j3 = 0;
                long j4 = 0;
                long j5 = 0;
                long j6 = 0;
                long j7 = 0;
                long j8 = 0;
                long j9 = 0;
                long j10 = 0;
                long j11 = 0;
                long j12 = 0;
                float f2 = 0.0f;
                int i9 = -1;
                int i10 = -1;
                int i11 = 0;
                int i12 = 0;
                int i13 = 0;
                int i14 = 0;
                int i15 = 0;
                int i16 = 0;
                int i17 = 0;
                int i18 = 0;
                int i19 = 0;
                int i20 = 0;
                int i21 = 0;
                boolean z2 = false;
                int i22 = 0;
                int i23 = 0;
                int i24 = 0;
                int i25 = 0;
                int i26 = 0;
                int i27 = 0;
                int i28 = 0;
                int i29 = 0;
                int i30 = 0;
                int i31 = 0;
                int i32 = 0;
                byte[] bArr = null;
                int[] iArr = null;
                byte[] bArr2 = null;
                double d = 0.0d;
                double d2 = 0.0d;
                while (parcel.dataPosition() < validateObjectHeader4) {
                    int readInt3 = parcel.readInt();
                    switch ((char) readInt3) {
                        case 1:
                            i11 = ComposeUtilsKt.readInt(parcel, readInt3);
                            break;
                        case 2:
                            i12 = ComposeUtilsKt.readInt(parcel, readInt3);
                            break;
                        case 3:
                            i13 = ComposeUtilsKt.readInt(parcel, readInt3);
                            break;
                        case 4:
                            i14 = ComposeUtilsKt.readInt(parcel, readInt3);
                            break;
                        case 5:
                            j = ComposeUtilsKt.readLong(parcel, readInt3);
                            break;
                        case 6:
                            i15 = ComposeUtilsKt.readInt(parcel, readInt3);
                            break;
                        case 7:
                            i16 = ComposeUtilsKt.readInt(parcel, readInt3);
                            break;
                        case '\b':
                            i17 = ComposeUtilsKt.readInt(parcel, readInt3);
                            break;
                        case '\t':
                            j2 = ComposeUtilsKt.readLong(parcel, readInt3);
                            break;
                        case '\n':
                            j3 = ComposeUtilsKt.readLong(parcel, readInt3);
                            break;
                        case 11:
                            j4 = ComposeUtilsKt.readLong(parcel, readInt3);
                            break;
                        case '\f':
                            j5 = ComposeUtilsKt.readLong(parcel, readInt3);
                            break;
                        case '\r':
                            j6 = ComposeUtilsKt.readLong(parcel, readInt3);
                            break;
                        case 14:
                            j7 = ComposeUtilsKt.readLong(parcel, readInt3);
                            break;
                        case 15:
                            i18 = ComposeUtilsKt.readInt(parcel, readInt3);
                            break;
                        case 16:
                            i19 = ComposeUtilsKt.readInt(parcel, readInt3);
                            break;
                        case 17:
                            i20 = ComposeUtilsKt.readInt(parcel, readInt3);
                            break;
                        case 18:
                            i21 = ComposeUtilsKt.readInt(parcel, readInt3);
                            break;
                        case 19:
                            z2 = ComposeUtilsKt.readBoolean(parcel, readInt3);
                            break;
                        case 20:
                            i22 = ComposeUtilsKt.readInt(parcel, readInt3);
                            break;
                        case 21:
                            j8 = ComposeUtilsKt.readLong(parcel, readInt3);
                            break;
                        case 22:
                            d = ComposeUtilsKt.readDouble(parcel, readInt3);
                            break;
                        case 23:
                            d2 = ComposeUtilsKt.readDouble(parcel, readInt3);
                            break;
                        case 24:
                            i23 = ComposeUtilsKt.readInt(parcel, readInt3);
                            break;
                        case 25:
                            f2 = ComposeUtilsKt.readFloat(parcel, readInt3);
                            break;
                        case 26:
                            bArr = ComposeUtilsKt.createByteArray(parcel, readInt3);
                            break;
                        case 27:
                            i24 = ComposeUtilsKt.readInt(parcel, readInt3);
                            break;
                        case 28:
                            i25 = ComposeUtilsKt.readInt(parcel, readInt3);
                            break;
                        case 29:
                            j9 = ComposeUtilsKt.readLong(parcel, readInt3);
                            break;
                        case 30:
                            j10 = ComposeUtilsKt.readLong(parcel, readInt3);
                            break;
                        case 31:
                            i9 = ComposeUtilsKt.readInt(parcel, readInt3);
                            break;
                        case ' ':
                            i26 = ComposeUtilsKt.readInt(parcel, readInt3);
                            break;
                        case '!':
                            i27 = ComposeUtilsKt.readInt(parcel, readInt3);
                            break;
                        case '\"':
                            i28 = ComposeUtilsKt.readInt(parcel, readInt3);
                            break;
                        case '#':
                            i29 = ComposeUtilsKt.readInt(parcel, readInt3);
                            break;
                        case '$':
                            i30 = ComposeUtilsKt.readInt(parcel, readInt3);
                            break;
                        case '%':
                            i10 = ComposeUtilsKt.readInt(parcel, readInt3);
                            break;
                        case '&':
                            i31 = ComposeUtilsKt.readInt(parcel, readInt3);
                            break;
                        case '\'':
                            j11 = ComposeUtilsKt.readLong(parcel, readInt3);
                            break;
                        case '(':
                            j12 = ComposeUtilsKt.readLong(parcel, readInt3);
                            break;
                        case ')':
                            iArr = ComposeUtilsKt.createIntArray(parcel, readInt3);
                            break;
                        case '*':
                            i32 = ComposeUtilsKt.readInt(parcel, readInt3);
                            break;
                        case '+':
                            str4 = ComposeUtilsKt.createString(parcel, readInt3);
                            break;
                        case ',':
                            bArr2 = ComposeUtilsKt.createByteArray(parcel, readInt3);
                            break;
                        default:
                            ComposeUtilsKt.skipUnknownField(parcel, readInt3);
                            break;
                    }
                }
                ComposeUtilsKt.ensureAtEnd(parcel, validateObjectHeader4);
                return new zzbl(i11, i12, i13, i14, j, i15, i16, i17, j2, j3, j4, j5, j6, j7, i18, i19, i20, i21, z2, i22, j8, d, d2, i23, f2, bArr, i24, i25, j9, j10, i9, i26, i27, i28, i29, i30, i10, i31, j11, j12, iArr, i32, str4, bArr2);
            case 4:
                int validateObjectHeader5 = ComposeUtilsKt.validateObjectHeader(parcel);
                String str5 = null;
                while (parcel.dataPosition() < validateObjectHeader5) {
                    int readInt4 = parcel.readInt();
                    char c2 = (char) readInt4;
                    if (c2 == 1) {
                        parcelFileDescriptor = (ParcelFileDescriptor) ComposeUtilsKt.createParcelable(parcel, readInt4, ParcelFileDescriptor.CREATOR);
                    } else if (c2 != 2) {
                        ComposeUtilsKt.skipUnknownField(parcel, readInt4);
                    } else {
                        str5 = ComposeUtilsKt.createString(parcel, readInt4);
                    }
                }
                ComposeUtilsKt.ensureAtEnd(parcel, validateObjectHeader5);
                return new zzbn(parcelFileDescriptor, str5);
            case 5:
                int validateObjectHeader6 = ComposeUtilsKt.validateObjectHeader(parcel);
                int i33 = 0;
                int i34 = 0;
                boolean z3 = false;
                String str6 = null;
                Bitmap bitmap = null;
                ParcelFileDescriptor parcelFileDescriptor2 = null;
                zzbn zzbnVar = null;
                while (parcel.dataPosition() < validateObjectHeader6) {
                    int readInt5 = parcel.readInt();
                    switch ((char) readInt5) {
                        case 1:
                            i33 = ComposeUtilsKt.readInt(parcel, readInt5);
                            break;
                        case 2:
                            str6 = ComposeUtilsKt.createString(parcel, readInt5);
                            break;
                        case 3:
                            bitmap = (Bitmap) ComposeUtilsKt.createParcelable(parcel, readInt5, Bitmap.CREATOR);
                            break;
                        case 4:
                            i34 = ComposeUtilsKt.readInt(parcel, readInt5);
                            break;
                        case 5:
                            parcelFileDescriptor2 = (ParcelFileDescriptor) ComposeUtilsKt.createParcelable(parcel, readInt5, ParcelFileDescriptor.CREATOR);
                            break;
                        case 6:
                            z3 = ComposeUtilsKt.readBoolean(parcel, readInt5);
                            break;
                        case 7:
                            zzbnVar = (zzbn) ComposeUtilsKt.createParcelable(parcel, readInt5, zzbn.CREATOR);
                            break;
                        default:
                            ComposeUtilsKt.skipUnknownField(parcel, readInt5);
                            break;
                    }
                }
                ComposeUtilsKt.ensureAtEnd(parcel, validateObjectHeader6);
                return new zzbp(i33, str6, bitmap, i34, parcelFileDescriptor2, z3, zzbnVar);
            case 6:
                int validateObjectHeader7 = ComposeUtilsKt.validateObjectHeader(parcel);
                ParcelFileDescriptor parcelFileDescriptor3 = null;
                while (parcel.dataPosition() < validateObjectHeader7) {
                    int readInt6 = parcel.readInt();
                    char c3 = (char) readInt6;
                    if (c3 == 1) {
                        arrayList3 = ComposeUtilsKt.createTypedList(parcel, readInt6, zzbp.CREATOR);
                    } else if (c3 != 2) {
                        ComposeUtilsKt.skipUnknownField(parcel, readInt6);
                    } else {
                        parcelFileDescriptor3 = (ParcelFileDescriptor) ComposeUtilsKt.createParcelable(parcel, readInt6, ParcelFileDescriptor.CREATOR);
                    }
                }
                ComposeUtilsKt.ensureAtEnd(parcel, validateObjectHeader7);
                return new zzbr(arrayList3, parcelFileDescriptor3);
            case 7:
                int validateObjectHeader8 = ComposeUtilsKt.validateObjectHeader(parcel);
                float f3 = 0.0f;
                float f4 = 0.0f;
                int i35 = 0;
                String str7 = null;
                Bundle bundle = null;
                while (parcel.dataPosition() < validateObjectHeader8) {
                    int readInt7 = parcel.readInt();
                    char c4 = (char) readInt7;
                    if (c4 == 1) {
                        str7 = ComposeUtilsKt.createString(parcel, readInt7);
                    } else if (c4 == 2) {
                        f3 = ComposeUtilsKt.readFloat(parcel, readInt7);
                    } else if (c4 == 3) {
                        i35 = ComposeUtilsKt.readInt(parcel, readInt7);
                    } else if (c4 == 4) {
                        f4 = ComposeUtilsKt.readFloat(parcel, readInt7);
                    } else if (c4 != 5) {
                        ComposeUtilsKt.skipUnknownField(parcel, readInt7);
                    } else {
                        bundle = ComposeUtilsKt.createBundle(parcel, readInt7);
                    }
                }
                ComposeUtilsKt.ensureAtEnd(parcel, validateObjectHeader8);
                return new zzbt(str7, f3, i35, f4, bundle);
            case 8:
                int validateObjectHeader9 = ComposeUtilsKt.validateObjectHeader(parcel);
                float f5 = 0.0f;
                int i36 = 0;
                int i37 = 0;
                int i38 = 0;
                boolean z4 = false;
                int i39 = 0;
                int i40 = 0;
                int i41 = 0;
                int i42 = 0;
                int i43 = 0;
                int i44 = 0;
                ArrayList arrayList4 = null;
                ArrayList arrayList5 = null;
                IBinder iBinder = null;
                IBinder iBinder2 = null;
                String str8 = null;
                Bundle bundle2 = null;
                zzce zzceVar = null;
                zzbr zzbrVar = null;
                while (parcel.dataPosition() < validateObjectHeader9) {
                    int readInt8 = parcel.readInt();
                    switch ((char) readInt8) {
                        case 1:
                            arrayList4 = ComposeUtilsKt.createTypedList(parcel, readInt8, zzbp.CREATOR);
                            break;
                        case 2:
                            f5 = ComposeUtilsKt.readFloat(parcel, readInt8);
                            break;
                        case 3:
                            i36 = ComposeUtilsKt.readInt(parcel, readInt8);
                            break;
                        case 4:
                            arrayList5 = ComposeUtilsKt.createStringList(parcel, readInt8);
                            break;
                        case 5:
                            i37 = ComposeUtilsKt.readInt(parcel, readInt8);
                            break;
                        case 6:
                            i38 = ComposeUtilsKt.readInt(parcel, readInt8);
                            break;
                        case 7:
                            iBinder = ComposeUtilsKt.readIBinder(parcel, readInt8);
                            break;
                        case '\b':
                            z4 = ComposeUtilsKt.readBoolean(parcel, readInt8);
                            break;
                        case '\t':
                            i39 = ComposeUtilsKt.readInt(parcel, readInt8);
                            break;
                        case '\n':
                            iBinder2 = ComposeUtilsKt.readIBinder(parcel, readInt8);
                            break;
                        case 11:
                            i40 = ComposeUtilsKt.readInt(parcel, readInt8);
                            break;
                        case '\f':
                            i41 = ComposeUtilsKt.readInt(parcel, readInt8);
                            break;
                        case '\r':
                            str8 = ComposeUtilsKt.createString(parcel, readInt8);
                            break;
                        case 14:
                            bundle2 = ComposeUtilsKt.createBundle(parcel, readInt8);
                            break;
                        case 15:
                            i42 = ComposeUtilsKt.readInt(parcel, readInt8);
                            break;
                        case 16:
                            zzceVar = (zzce) ComposeUtilsKt.createParcelable(parcel, readInt8, zzce.CREATOR);
                            break;
                        case 17:
                            i43 = ComposeUtilsKt.readInt(parcel, readInt8);
                            break;
                        case 18:
                            zzbrVar = (zzbr) ComposeUtilsKt.createParcelable(parcel, readInt8, zzbr.CREATOR);
                            break;
                        case 19:
                            i44 = ComposeUtilsKt.readInt(parcel, readInt8);
                            break;
                        default:
                            ComposeUtilsKt.skipUnknownField(parcel, readInt8);
                            break;
                    }
                }
                ComposeUtilsKt.ensureAtEnd(parcel, validateObjectHeader9);
                return new zzbw(arrayList4, f5, i36, arrayList5, i37, i38, iBinder, z4, i39, iBinder2, i40, i41, str8, bundle2, i42, zzceVar, i43, zzbrVar, i44);
            case 9:
                int validateObjectHeader10 = ComposeUtilsKt.validateObjectHeader(parcel);
                zzbl zzblVar2 = null;
                while (parcel.dataPosition() < validateObjectHeader10) {
                    int readInt9 = parcel.readInt();
                    char c5 = (char) readInt9;
                    if (c5 == 1) {
                        arrayList2 = ComposeUtilsKt.createTypedList(parcel, readInt9, zzbt.CREATOR);
                    } else if (c5 != 2) {
                        ComposeUtilsKt.skipUnknownField(parcel, readInt9);
                    } else {
                        zzblVar2 = (zzbl) ComposeUtilsKt.createParcelable(parcel, readInt9, zzbl.CREATOR);
                    }
                }
                ComposeUtilsKt.ensureAtEnd(parcel, validateObjectHeader10);
                return new zzby(arrayList2, zzblVar2);
            case 10:
                int validateObjectHeader11 = ComposeUtilsKt.validateObjectHeader(parcel);
                while (parcel.dataPosition() < validateObjectHeader11) {
                    int readInt10 = parcel.readInt();
                    if (((char) readInt10) != 1) {
                        ComposeUtilsKt.skipUnknownField(parcel, readInt10);
                    } else {
                        i4 = ComposeUtilsKt.readInt(parcel, readInt10);
                    }
                }
                ComposeUtilsKt.ensureAtEnd(parcel, validateObjectHeader11);
                return new zzca(i4);
            case 11:
                int validateObjectHeader12 = ComposeUtilsKt.validateObjectHeader(parcel);
                while (parcel.dataPosition() < validateObjectHeader12) {
                    int readInt11 = parcel.readInt();
                    if (((char) readInt11) != 1) {
                        ComposeUtilsKt.skipUnknownField(parcel, readInt11);
                    } else {
                        z = ComposeUtilsKt.readBoolean(parcel, readInt11);
                    }
                }
                ComposeUtilsKt.ensureAtEnd(parcel, validateObjectHeader12);
                return new zzce(z);
            case 12:
                int validateObjectHeader13 = ComposeUtilsKt.validateObjectHeader(parcel);
                int i45 = 0;
                int i46 = 0;
                String str9 = null;
                zzca zzcaVar = null;
                zzbi zzbiVar = null;
                while (parcel.dataPosition() < validateObjectHeader13) {
                    int readInt12 = parcel.readInt();
                    char c6 = (char) readInt12;
                    if (c6 == 1) {
                        i45 = ComposeUtilsKt.readInt(parcel, readInt12);
                    } else if (c6 == 2) {
                        i46 = ComposeUtilsKt.readInt(parcel, readInt12);
                    } else if (c6 == 3) {
                        str9 = ComposeUtilsKt.createString(parcel, readInt12);
                    } else if (c6 == 4) {
                        zzcaVar = (zzca) ComposeUtilsKt.createParcelable(parcel, readInt12, zzca.CREATOR);
                    } else if (c6 != 5) {
                        ComposeUtilsKt.skipUnknownField(parcel, readInt12);
                    } else {
                        zzbiVar = (zzbi) ComposeUtilsKt.createParcelable(parcel, readInt12, zzbi.CREATOR);
                    }
                }
                ComposeUtilsKt.ensureAtEnd(parcel, validateObjectHeader13);
                return new zzo(i45, i46, str9, zzcaVar, zzbiVar);
            case 13:
                int validateObjectHeader14 = ComposeUtilsKt.validateObjectHeader(parcel);
                int i47 = 0;
                int i48 = 0;
                String str10 = null;
                Bitmap bitmap2 = null;
                ParcelFileDescriptor parcelFileDescriptor4 = null;
                while (parcel.dataPosition() < validateObjectHeader14) {
                    int readInt13 = parcel.readInt();
                    char c7 = (char) readInt13;
                    if (c7 == 1) {
                        i47 = ComposeUtilsKt.readInt(parcel, readInt13);
                    } else if (c7 == 2) {
                        str10 = ComposeUtilsKt.createString(parcel, readInt13);
                    } else if (c7 == 3) {
                        bitmap2 = (Bitmap) ComposeUtilsKt.createParcelable(parcel, readInt13, Bitmap.CREATOR);
                    } else if (c7 == 4) {
                        i48 = ComposeUtilsKt.readInt(parcel, readInt13);
                    } else if (c7 != 5) {
                        ComposeUtilsKt.skipUnknownField(parcel, readInt13);
                    } else {
                        parcelFileDescriptor4 = (ParcelFileDescriptor) ComposeUtilsKt.createParcelable(parcel, readInt13, ParcelFileDescriptor.CREATOR);
                    }
                }
                ComposeUtilsKt.ensureAtEnd(parcel, validateObjectHeader14);
                return new zzs(i47, str10, bitmap2, i48, parcelFileDescriptor4);
            case 14:
                int validateObjectHeader15 = ComposeUtilsKt.validateObjectHeader(parcel);
                float f6 = 0.0f;
                while (parcel.dataPosition() < validateObjectHeader15) {
                    int readInt14 = parcel.readInt();
                    char c8 = (char) readInt14;
                    if (c8 == 1) {
                        str = ComposeUtilsKt.createString(parcel, readInt14);
                    } else if (c8 == 2) {
                        f = ComposeUtilsKt.readFloat(parcel, readInt14);
                    } else if (c8 == 3) {
                        i3 = ComposeUtilsKt.readInt(parcel, readInt14);
                    } else if (c8 != 4) {
                        ComposeUtilsKt.skipUnknownField(parcel, readInt14);
                    } else {
                        f6 = ComposeUtilsKt.readFloat(parcel, readInt14);
                    }
                }
                ComposeUtilsKt.ensureAtEnd(parcel, validateObjectHeader15);
                return new zzu(f, f6, i3, str);
            default:
                int validateObjectHeader16 = ComposeUtilsKt.validateObjectHeader(parcel);
                float f7 = 0.0f;
                int i49 = 0;
                int i50 = 0;
                int i51 = 0;
                int i52 = 0;
                int i53 = 0;
                int i54 = 0;
                int i55 = 0;
                ArrayList arrayList6 = null;
                IBinder iBinder3 = null;
                IBinder iBinder4 = null;
                ArrayList arrayList7 = null;
                String str11 = null;
                String str12 = null;
                String str13 = null;
                String str14 = null;
                while (parcel.dataPosition() < validateObjectHeader16) {
                    int readInt15 = parcel.readInt();
                    switch ((char) readInt15) {
                        case 1:
                            arrayList6 = ComposeUtilsKt.createTypedList(parcel, readInt15, zzs.CREATOR);
                            break;
                        case 2:
                            f7 = ComposeUtilsKt.readFloat(parcel, readInt15);
                            break;
                        case 3:
                            i49 = ComposeUtilsKt.readInt(parcel, readInt15);
                            break;
                        case 4:
                            i50 = ComposeUtilsKt.readInt(parcel, readInt15);
                            break;
                        case 5:
                            iBinder3 = ComposeUtilsKt.readIBinder(parcel, readInt15);
                            break;
                        case 6:
                            i51 = ComposeUtilsKt.readInt(parcel, readInt15);
                            break;
                        case 7:
                            iBinder4 = ComposeUtilsKt.readIBinder(parcel, readInt15);
                            break;
                        case '\b':
                            arrayList7 = ComposeUtilsKt.createTypedList(parcel, readInt15, ParcelFileDescriptor.CREATOR);
                            break;
                        case '\t':
                            i52 = ComposeUtilsKt.readInt(parcel, readInt15);
                            break;
                        case '\n':
                            i53 = ComposeUtilsKt.readInt(parcel, readInt15);
                            break;
                        case 11:
                            str11 = ComposeUtilsKt.createString(parcel, readInt15);
                            break;
                        case '\f':
                            str12 = ComposeUtilsKt.createString(parcel, readInt15);
                            break;
                        case '\r':
                            str13 = ComposeUtilsKt.createString(parcel, readInt15);
                            break;
                        case 14:
                            str14 = ComposeUtilsKt.createString(parcel, readInt15);
                            break;
                        case 15:
                            i54 = ComposeUtilsKt.readInt(parcel, readInt15);
                            break;
                        case 16:
                            i55 = ComposeUtilsKt.readInt(parcel, readInt15);
                            break;
                        default:
                            ComposeUtilsKt.skipUnknownField(parcel, readInt15);
                            break;
                    }
                }
                ComposeUtilsKt.ensureAtEnd(parcel, validateObjectHeader16);
                return new zzx(arrayList6, f7, i49, i50, iBinder3, i51, iBinder4, arrayList7, i52, i53, str11, str12, str13, str14, i54, i55);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        switch (this.$r8$classId) {
            case 0:
                return new zzm[i];
            case 1:
                return new zzz[i];
            case 2:
                return new zzbi[i];
            case 3:
                return new zzbl[i];
            case 4:
                return new zzbn[i];
            case 5:
                return new zzbp[i];
            case 6:
                return new zzbr[i];
            case 7:
                return new zzbt[i];
            case 8:
                return new zzbw[i];
            case 9:
                return new zzby[i];
            case 10:
                return new zzca[i];
            case 11:
                return new zzce[i];
            case 12:
                return new zzo[i];
            case 13:
                return new zzs[i];
            case 14:
                return new zzu[i];
            default:
                return new zzx[i];
        }
    }
}
