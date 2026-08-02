package com.google.android.gms.internal.measurement;

import android.os.Parcel;
import android.os.Parcelable;
import com.squareup.cash.directory_ui.views.ComposeUtilsKt;
import java.util.ArrayList;

/* loaded from: classes4.dex */
public final class zzjg implements Parcelable.Creator {
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ zzjg(int i) {
        this.$r8$classId = i;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int i = 0;
        int i2 = 0;
        boolean z = false;
        zzjo[] zzjoVarArr = null;
        ArrayList arrayList = null;
        String str = null;
        byte[] bArr = null;
        switch (this.$r8$classId) {
            case 0:
                int validateObjectHeader = ComposeUtilsKt.validateObjectHeader(parcel);
                String[] strArr = null;
                while (parcel.dataPosition() < validateObjectHeader) {
                    int readInt = parcel.readInt();
                    char c = (char) readInt;
                    if (c == 2) {
                        i = ComposeUtilsKt.readInt(parcel, readInt);
                    } else if (c == 3) {
                        zzjoVarArr = (zzjo[]) ComposeUtilsKt.createTypedArray(parcel, readInt, zzjo.CREATOR);
                    } else if (c != 4) {
                        ComposeUtilsKt.skipUnknownField(parcel, readInt);
                    } else {
                        strArr = ComposeUtilsKt.createStringArray(parcel, readInt);
                    }
                }
                ComposeUtilsKt.ensureAtEnd(parcel, validateObjectHeader);
                return new zzjf(i, zzjoVarArr, strArr);
            case 1:
                int validateObjectHeader2 = ComposeUtilsKt.validateObjectHeader(parcel);
                long j = 0;
                boolean z2 = false;
                String str2 = null;
                String str3 = null;
                zzjf[] zzjfVarArr = null;
                byte[] bArr2 = null;
                while (parcel.dataPosition() < validateObjectHeader2) {
                    int readInt2 = parcel.readInt();
                    switch ((char) readInt2) {
                        case 2:
                            str2 = ComposeUtilsKt.createString(parcel, readInt2);
                            break;
                        case 3:
                            str3 = ComposeUtilsKt.createString(parcel, readInt2);
                            break;
                        case 4:
                            zzjfVarArr = (zzjf[]) ComposeUtilsKt.createTypedArray(parcel, readInt2, zzjf.CREATOR);
                            break;
                        case 5:
                            z2 = ComposeUtilsKt.readBoolean(parcel, readInt2);
                            break;
                        case 6:
                            bArr2 = ComposeUtilsKt.createByteArray(parcel, readInt2);
                            break;
                        case 7:
                            j = ComposeUtilsKt.readLong(parcel, readInt2);
                            break;
                        default:
                            ComposeUtilsKt.skipUnknownField(parcel, readInt2);
                            break;
                    }
                }
                ComposeUtilsKt.ensureAtEnd(parcel, validateObjectHeader2);
                return new zzjh(str2, str3, zzjfVarArr, z2, bArr2, j);
            case 2:
                int validateObjectHeader3 = ComposeUtilsKt.validateObjectHeader(parcel);
                while (parcel.dataPosition() < validateObjectHeader3) {
                    int readInt3 = parcel.readInt();
                    if (((char) readInt3) != 2) {
                        ComposeUtilsKt.skipUnknownField(parcel, readInt3);
                    } else {
                        bArr = ComposeUtilsKt.createByteArray(parcel, readInt3);
                    }
                }
                ComposeUtilsKt.ensureAtEnd(parcel, validateObjectHeader3);
                return new zzjj(bArr);
            case 3:
                int validateObjectHeader4 = ComposeUtilsKt.validateObjectHeader(parcel);
                String str4 = null;
                byte[] bArr3 = null;
                byte[][] bArr4 = null;
                byte[][] bArr5 = null;
                byte[][] bArr6 = null;
                byte[][] bArr7 = null;
                int[] iArr = null;
                byte[][] bArr8 = null;
                int[] iArr2 = null;
                byte[][] bArr9 = null;
                while (parcel.dataPosition() < validateObjectHeader4) {
                    int readInt4 = parcel.readInt();
                    switch ((char) readInt4) {
                        case 2:
                            str4 = ComposeUtilsKt.createString(parcel, readInt4);
                            break;
                        case 3:
                            bArr3 = ComposeUtilsKt.createByteArray(parcel, readInt4);
                            break;
                        case 4:
                            bArr4 = ComposeUtilsKt.createByteArrayArray(parcel, readInt4);
                            break;
                        case 5:
                            bArr5 = ComposeUtilsKt.createByteArrayArray(parcel, readInt4);
                            break;
                        case 6:
                            bArr6 = ComposeUtilsKt.createByteArrayArray(parcel, readInt4);
                            break;
                        case 7:
                            bArr7 = ComposeUtilsKt.createByteArrayArray(parcel, readInt4);
                            break;
                        case '\b':
                            iArr = ComposeUtilsKt.createIntArray(parcel, readInt4);
                            break;
                        case '\t':
                            bArr8 = ComposeUtilsKt.createByteArrayArray(parcel, readInt4);
                            break;
                        case '\n':
                            iArr2 = ComposeUtilsKt.createIntArray(parcel, readInt4);
                            break;
                        case 11:
                            bArr9 = ComposeUtilsKt.createByteArrayArray(parcel, readInt4);
                            break;
                        default:
                            ComposeUtilsKt.skipUnknownField(parcel, readInt4);
                            break;
                    }
                }
                ComposeUtilsKt.ensureAtEnd(parcel, validateObjectHeader4);
                return new zzjl(str4, bArr3, bArr4, bArr5, bArr6, bArr7, iArr, bArr8, iArr2, bArr9);
            case 4:
                int validateObjectHeader5 = ComposeUtilsKt.validateObjectHeader(parcel);
                long j2 = 0;
                double d = 0.0d;
                boolean z3 = false;
                int i3 = 0;
                int i4 = 0;
                int i5 = 0;
                String str5 = null;
                String str6 = null;
                byte[] bArr10 = null;
                while (parcel.dataPosition() < validateObjectHeader5) {
                    int readInt5 = parcel.readInt();
                    switch ((char) readInt5) {
                        case 2:
                            str5 = ComposeUtilsKt.createString(parcel, readInt5);
                            break;
                        case 3:
                            j2 = ComposeUtilsKt.readLong(parcel, readInt5);
                            break;
                        case 4:
                            z3 = ComposeUtilsKt.readBoolean(parcel, readInt5);
                            break;
                        case 5:
                            d = ComposeUtilsKt.readDouble(parcel, readInt5);
                            break;
                        case 6:
                            str6 = ComposeUtilsKt.createString(parcel, readInt5);
                            break;
                        case 7:
                            bArr10 = ComposeUtilsKt.createByteArray(parcel, readInt5);
                            break;
                        case '\b':
                            i3 = ComposeUtilsKt.readInt(parcel, readInt5);
                            break;
                        case '\t':
                            i4 = ComposeUtilsKt.readInt(parcel, readInt5);
                            break;
                        case '\n':
                            i5 = ComposeUtilsKt.readInt(parcel, readInt5);
                            break;
                        default:
                            ComposeUtilsKt.skipUnknownField(parcel, readInt5);
                            break;
                    }
                }
                ComposeUtilsKt.ensureAtEnd(parcel, validateObjectHeader5);
                return new zzjo(str5, j2, z3, d, str6, bArr10, i3, i4, i5);
            case 5:
                int validateObjectHeader6 = ComposeUtilsKt.validateObjectHeader(parcel);
                String str7 = null;
                zzjo zzjoVar = null;
                while (parcel.dataPosition() < validateObjectHeader6) {
                    int readInt6 = parcel.readInt();
                    char c2 = (char) readInt6;
                    if (c2 == 2) {
                        str = ComposeUtilsKt.createString(parcel, readInt6);
                    } else if (c2 == 3) {
                        str7 = ComposeUtilsKt.createString(parcel, readInt6);
                    } else if (c2 == 4) {
                        zzjoVar = (zzjo) ComposeUtilsKt.createParcelable(parcel, readInt6, zzjo.CREATOR);
                    } else if (c2 != 5) {
                        ComposeUtilsKt.skipUnknownField(parcel, readInt6);
                    } else {
                        z = ComposeUtilsKt.readBoolean(parcel, readInt6);
                    }
                }
                ComposeUtilsKt.ensureAtEnd(parcel, validateObjectHeader6);
                return new zzjq(str, str7, zzjoVar, z);
            case 6:
                int validateObjectHeader7 = ComposeUtilsKt.validateObjectHeader(parcel);
                while (parcel.dataPosition() < validateObjectHeader7) {
                    int readInt7 = parcel.readInt();
                    if (((char) readInt7) != 2) {
                        ComposeUtilsKt.skipUnknownField(parcel, readInt7);
                    } else {
                        arrayList = ComposeUtilsKt.createTypedList(parcel, readInt7, zzjq.CREATOR);
                    }
                }
                ComposeUtilsKt.ensureAtEnd(parcel, validateObjectHeader7);
                return new zzjs(arrayList);
            default:
                int validateObjectHeader8 = ComposeUtilsKt.validateObjectHeader(parcel);
                int i6 = 0;
                while (parcel.dataPosition() < validateObjectHeader8) {
                    int readInt8 = parcel.readInt();
                    char c3 = (char) readInt8;
                    if (c3 == 1) {
                        i2 = ComposeUtilsKt.readInt(parcel, readInt8);
                    } else if (c3 != 2) {
                        ComposeUtilsKt.skipUnknownField(parcel, readInt8);
                    } else {
                        i6 = ComposeUtilsKt.readInt(parcel, readInt8);
                    }
                }
                ComposeUtilsKt.ensureAtEnd(parcel, validateObjectHeader8);
                return new zzju(i2, i6);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        switch (this.$r8$classId) {
            case 0:
                return new zzjf[i];
            case 1:
                return new zzjh[i];
            case 2:
                return new zzjj[i];
            case 3:
                return new zzjl[i];
            case 4:
                return new zzjo[i];
            case 5:
                return new zzjq[i];
            case 6:
                return new zzjs[i];
            default:
                return new zzju[i];
        }
    }
}
