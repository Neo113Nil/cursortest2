package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import android.graphics.Point;
import android.os.Parcel;
import android.os.Parcelable;
import com.squareup.cash.directory_ui.views.ComposeUtilsKt;

/* loaded from: classes4.dex */
public final class zzal implements Parcelable.Creator {
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ zzal(int i) {
        this.$r8$classId = i;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int readInt;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        boolean z = false;
        int i6 = 0;
        String[] strArr = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        zzbr zzbrVar = null;
        zzbt zzbtVar = null;
        switch (this.$r8$classId) {
            case 0:
                int validateObjectHeader = ComposeUtilsKt.validateObjectHeader(parcel);
                while (parcel.dataPosition() < validateObjectHeader) {
                    int readInt2 = parcel.readInt();
                    char c = (char) readInt2;
                    if (c == 1) {
                        i = ComposeUtilsKt.readInt(parcel, readInt2);
                    } else if (c != 2) {
                        ComposeUtilsKt.skipUnknownField(parcel, readInt2);
                    } else {
                        strArr = ComposeUtilsKt.createStringArray(parcel, readInt2);
                    }
                }
                ComposeUtilsKt.ensureAtEnd(parcel, validateObjectHeader);
                return new zzam(strArr, i);
            case 1:
                int validateObjectHeader2 = ComposeUtilsKt.validateObjectHeader(parcel);
                int i7 = 0;
                int i8 = 0;
                String str6 = null;
                String str7 = null;
                byte[] bArr = null;
                Point[] pointArr = null;
                zzar zzarVar = null;
                zzau zzauVar = null;
                zzav zzavVar = null;
                zzax zzaxVar = null;
                zzaw zzawVar = null;
                zzas zzasVar = null;
                zzao zzaoVar = null;
                zzap zzapVar = null;
                zzaq zzaqVar = null;
                while (parcel.dataPosition() < validateObjectHeader2) {
                    int readInt3 = parcel.readInt();
                    switch ((char) readInt3) {
                        case 1:
                            i7 = ComposeUtilsKt.readInt(parcel, readInt3);
                            break;
                        case 2:
                            str6 = ComposeUtilsKt.createString(parcel, readInt3);
                            break;
                        case 3:
                            str7 = ComposeUtilsKt.createString(parcel, readInt3);
                            break;
                        case 4:
                            bArr = ComposeUtilsKt.createByteArray(parcel, readInt3);
                            break;
                        case 5:
                            pointArr = (Point[]) ComposeUtilsKt.createTypedArray(parcel, readInt3, Point.CREATOR);
                            break;
                        case 6:
                            i8 = ComposeUtilsKt.readInt(parcel, readInt3);
                            break;
                        case 7:
                            zzarVar = (zzar) ComposeUtilsKt.createParcelable(parcel, readInt3, zzar.CREATOR);
                            break;
                        case '\b':
                            zzauVar = (zzau) ComposeUtilsKt.createParcelable(parcel, readInt3, zzau.CREATOR);
                            break;
                        case '\t':
                            zzavVar = (zzav) ComposeUtilsKt.createParcelable(parcel, readInt3, zzav.CREATOR);
                            break;
                        case '\n':
                            zzaxVar = (zzax) ComposeUtilsKt.createParcelable(parcel, readInt3, zzax.CREATOR);
                            break;
                        case 11:
                            zzawVar = (zzaw) ComposeUtilsKt.createParcelable(parcel, readInt3, zzaw.CREATOR);
                            break;
                        case '\f':
                            zzasVar = (zzas) ComposeUtilsKt.createParcelable(parcel, readInt3, zzas.CREATOR);
                            break;
                        case '\r':
                            zzaoVar = (zzao) ComposeUtilsKt.createParcelable(parcel, readInt3, zzao.CREATOR);
                            break;
                        case 14:
                            zzapVar = (zzap) ComposeUtilsKt.createParcelable(parcel, readInt3, zzap.CREATOR);
                            break;
                        case 15:
                            zzaqVar = (zzaq) ComposeUtilsKt.createParcelable(parcel, readInt3, zzaq.CREATOR);
                            break;
                        default:
                            ComposeUtilsKt.skipUnknownField(parcel, readInt3);
                            break;
                    }
                }
                ComposeUtilsKt.ensureAtEnd(parcel, validateObjectHeader2);
                return new zzay(i7, str6, str7, bArr, pointArr, i8, zzarVar, zzauVar, zzavVar, zzaxVar, zzawVar, zzasVar, zzaoVar, zzapVar, zzaqVar);
            case 2:
                int validateObjectHeader3 = ComposeUtilsKt.validateObjectHeader(parcel);
                boolean z2 = false;
                while (parcel.dataPosition() < validateObjectHeader3) {
                    int readInt4 = parcel.readInt();
                    char c2 = (char) readInt4;
                    if (c2 == 1) {
                        i6 = ComposeUtilsKt.readInt(parcel, readInt4);
                    } else if (c2 != 2) {
                        ComposeUtilsKt.skipUnknownField(parcel, readInt4);
                    } else {
                        z2 = ComposeUtilsKt.readBoolean(parcel, readInt4);
                    }
                }
                ComposeUtilsKt.ensureAtEnd(parcel, validateObjectHeader3);
                return new zzba(i6, z2);
            case 3:
                int validateObjectHeader4 = ComposeUtilsKt.validateObjectHeader(parcel);
                zzbv zzbvVar = null;
                while (parcel.dataPosition() < validateObjectHeader4) {
                    int readInt5 = parcel.readInt();
                    char c3 = (char) readInt5;
                    if (c3 == 1) {
                        zzbtVar = (zzbt) ComposeUtilsKt.createParcelable(parcel, readInt5, zzbt.CREATOR);
                    } else if (c3 == 2) {
                        zzbvVar = (zzbv) ComposeUtilsKt.createParcelable(parcel, readInt5, zzbv.CREATOR);
                    } else if (c3 == 3) {
                        ComposeUtilsKt.readBoolean(parcel, readInt5);
                    } else if (c3 != 4) {
                        ComposeUtilsKt.skipUnknownField(parcel, readInt5);
                    } else {
                        z = ComposeUtilsKt.readBoolean(parcel, readInt5);
                    }
                }
                ComposeUtilsKt.ensureAtEnd(parcel, validateObjectHeader4);
                return new zzbc(zzbtVar, zzbvVar, z);
            case 4:
                int validateObjectHeader5 = ComposeUtilsKt.validateObjectHeader(parcel);
                while (parcel.dataPosition() < validateObjectHeader5) {
                    int readInt6 = parcel.readInt();
                    if (((char) readInt6) != 1) {
                        ComposeUtilsKt.skipUnknownField(parcel, readInt6);
                    } else {
                        zzbrVar = (zzbr) ComposeUtilsKt.createParcelable(parcel, readInt6, zzbr.CREATOR);
                    }
                }
                ComposeUtilsKt.ensureAtEnd(parcel, validateObjectHeader5);
                return new zzbe(zzbrVar);
            case 5:
                int validateObjectHeader6 = ComposeUtilsKt.validateObjectHeader(parcel);
                int i9 = 0;
                int i10 = 0;
                int i11 = 0;
                int i12 = 0;
                boolean z3 = false;
                int i13 = 0;
                int i14 = 0;
                String str8 = null;
                while (parcel.dataPosition() < validateObjectHeader6) {
                    int readInt7 = parcel.readInt();
                    switch ((char) readInt7) {
                        case 1:
                            i9 = ComposeUtilsKt.readInt(parcel, readInt7);
                            break;
                        case 2:
                            i10 = ComposeUtilsKt.readInt(parcel, readInt7);
                            break;
                        case 3:
                            i11 = ComposeUtilsKt.readInt(parcel, readInt7);
                            break;
                        case 4:
                            i12 = ComposeUtilsKt.readInt(parcel, readInt7);
                            break;
                        case 5:
                            i13 = ComposeUtilsKt.readInt(parcel, readInt7);
                            break;
                        case 6:
                            i14 = ComposeUtilsKt.readInt(parcel, readInt7);
                            break;
                        case 7:
                            z3 = ComposeUtilsKt.readBoolean(parcel, readInt7);
                            break;
                        case '\b':
                            str8 = ComposeUtilsKt.createString(parcel, readInt7);
                            break;
                        default:
                            ComposeUtilsKt.skipUnknownField(parcel, readInt7);
                            break;
                    }
                }
                ComposeUtilsKt.ensureAtEnd(parcel, validateObjectHeader6);
                return new zzan(str8, i9, i10, i11, i12, z3, i13, i14);
            case 6:
                int validateObjectHeader7 = ComposeUtilsKt.validateObjectHeader(parcel);
                String str9 = null;
                String str10 = null;
                String str11 = null;
                String str12 = null;
                String str13 = null;
                zzan zzanVar = null;
                zzan zzanVar2 = null;
                while (parcel.dataPosition() < validateObjectHeader7) {
                    int readInt8 = parcel.readInt();
                    switch ((char) readInt8) {
                        case 1:
                            str9 = ComposeUtilsKt.createString(parcel, readInt8);
                            break;
                        case 2:
                            str10 = ComposeUtilsKt.createString(parcel, readInt8);
                            break;
                        case 3:
                            str11 = ComposeUtilsKt.createString(parcel, readInt8);
                            break;
                        case 4:
                            str12 = ComposeUtilsKt.createString(parcel, readInt8);
                            break;
                        case 5:
                            str13 = ComposeUtilsKt.createString(parcel, readInt8);
                            break;
                        case 6:
                            zzanVar = (zzan) ComposeUtilsKt.createParcelable(parcel, readInt8, zzan.CREATOR);
                            break;
                        case 7:
                            zzanVar2 = (zzan) ComposeUtilsKt.createParcelable(parcel, readInt8, zzan.CREATOR);
                            break;
                        default:
                            ComposeUtilsKt.skipUnknownField(parcel, readInt8);
                            break;
                    }
                }
                ComposeUtilsKt.ensureAtEnd(parcel, validateObjectHeader7);
                return new zzao(str9, str10, str11, str12, str13, zzanVar, zzanVar2);
            case 7:
                int validateObjectHeader8 = ComposeUtilsKt.validateObjectHeader(parcel);
                zzat zzatVar = null;
                String str14 = null;
                String str15 = null;
                zzau[] zzauVarArr = null;
                zzar[] zzarVarArr = null;
                String[] strArr2 = null;
                zzam[] zzamVarArr = null;
                while (parcel.dataPosition() < validateObjectHeader8) {
                    int readInt9 = parcel.readInt();
                    switch ((char) readInt9) {
                        case 1:
                            zzatVar = (zzat) ComposeUtilsKt.createParcelable(parcel, readInt9, zzat.CREATOR);
                            break;
                        case 2:
                            str14 = ComposeUtilsKt.createString(parcel, readInt9);
                            break;
                        case 3:
                            str15 = ComposeUtilsKt.createString(parcel, readInt9);
                            break;
                        case 4:
                            zzauVarArr = (zzau[]) ComposeUtilsKt.createTypedArray(parcel, readInt9, zzau.CREATOR);
                            break;
                        case 5:
                            zzarVarArr = (zzar[]) ComposeUtilsKt.createTypedArray(parcel, readInt9, zzar.CREATOR);
                            break;
                        case 6:
                            strArr2 = ComposeUtilsKt.createStringArray(parcel, readInt9);
                            break;
                        case 7:
                            zzamVarArr = (zzam[]) ComposeUtilsKt.createTypedArray(parcel, readInt9, zzam.CREATOR);
                            break;
                        default:
                            ComposeUtilsKt.skipUnknownField(parcel, readInt9);
                            break;
                    }
                }
                ComposeUtilsKt.ensureAtEnd(parcel, validateObjectHeader8);
                return new zzap(zzatVar, str14, str15, zzauVarArr, zzarVarArr, strArr2, zzamVarArr);
            case 8:
                int validateObjectHeader9 = ComposeUtilsKt.validateObjectHeader(parcel);
                String str16 = null;
                String str17 = null;
                String str18 = null;
                String str19 = null;
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
                while (parcel.dataPosition() < validateObjectHeader9) {
                    int readInt10 = parcel.readInt();
                    switch ((char) readInt10) {
                        case 1:
                            str16 = ComposeUtilsKt.createString(parcel, readInt10);
                            break;
                        case 2:
                            str17 = ComposeUtilsKt.createString(parcel, readInt10);
                            break;
                        case 3:
                            str18 = ComposeUtilsKt.createString(parcel, readInt10);
                            break;
                        case 4:
                            str19 = ComposeUtilsKt.createString(parcel, readInt10);
                            break;
                        case 5:
                            str20 = ComposeUtilsKt.createString(parcel, readInt10);
                            break;
                        case 6:
                            str21 = ComposeUtilsKt.createString(parcel, readInt10);
                            break;
                        case 7:
                            str22 = ComposeUtilsKt.createString(parcel, readInt10);
                            break;
                        case '\b':
                            str23 = ComposeUtilsKt.createString(parcel, readInt10);
                            break;
                        case '\t':
                            str24 = ComposeUtilsKt.createString(parcel, readInt10);
                            break;
                        case '\n':
                            str25 = ComposeUtilsKt.createString(parcel, readInt10);
                            break;
                        case 11:
                            str26 = ComposeUtilsKt.createString(parcel, readInt10);
                            break;
                        case '\f':
                            str27 = ComposeUtilsKt.createString(parcel, readInt10);
                            break;
                        case '\r':
                            str28 = ComposeUtilsKt.createString(parcel, readInt10);
                            break;
                        case 14:
                            str29 = ComposeUtilsKt.createString(parcel, readInt10);
                            break;
                        default:
                            ComposeUtilsKt.skipUnknownField(parcel, readInt10);
                            break;
                    }
                }
                ComposeUtilsKt.ensureAtEnd(parcel, validateObjectHeader9);
                return new zzaq(str16, str17, str18, str19, str20, str21, str22, str23, str24, str25, str26, str27, str28, str29);
            case 9:
                int validateObjectHeader10 = ComposeUtilsKt.validateObjectHeader(parcel);
                String str30 = null;
                String str31 = null;
                while (parcel.dataPosition() < validateObjectHeader10) {
                    int readInt11 = parcel.readInt();
                    char c4 = (char) readInt11;
                    if (c4 == 1) {
                        i5 = ComposeUtilsKt.readInt(parcel, readInt11);
                    } else if (c4 == 2) {
                        str5 = ComposeUtilsKt.createString(parcel, readInt11);
                    } else if (c4 == 3) {
                        str30 = ComposeUtilsKt.createString(parcel, readInt11);
                    } else if (c4 != 4) {
                        ComposeUtilsKt.skipUnknownField(parcel, readInt11);
                    } else {
                        str31 = ComposeUtilsKt.createString(parcel, readInt11);
                    }
                }
                ComposeUtilsKt.ensureAtEnd(parcel, validateObjectHeader10);
                return new zzar(i5, str5, str30, str31);
            case 10:
                int validateObjectHeader11 = ComposeUtilsKt.validateObjectHeader(parcel);
                double d = 0.0d;
                double d2 = 0.0d;
                while (parcel.dataPosition() < validateObjectHeader11) {
                    int readInt12 = parcel.readInt();
                    char c5 = (char) readInt12;
                    if (c5 == 1) {
                        d = ComposeUtilsKt.readDouble(parcel, readInt12);
                    } else if (c5 != 2) {
                        ComposeUtilsKt.skipUnknownField(parcel, readInt12);
                    } else {
                        d2 = ComposeUtilsKt.readDouble(parcel, readInt12);
                    }
                }
                ComposeUtilsKt.ensureAtEnd(parcel, validateObjectHeader11);
                return new zzas(d, d2);
            case 11:
                int validateObjectHeader12 = ComposeUtilsKt.validateObjectHeader(parcel);
                boolean z4 = false;
                boolean z5 = false;
                boolean z6 = false;
                byte[] bArr2 = null;
                float f = 0.0f;
                while (parcel.dataPosition() < validateObjectHeader12) {
                    int readInt13 = parcel.readInt();
                    char c6 = (char) readInt13;
                    if (c6 == 1) {
                        z4 = ComposeUtilsKt.readBoolean(parcel, readInt13);
                    } else if (c6 == 2) {
                        bArr2 = ComposeUtilsKt.createByteArray(parcel, readInt13);
                    } else if (c6 == 3) {
                        z5 = ComposeUtilsKt.readBoolean(parcel, readInt13);
                    } else if (c6 == 4) {
                        f = ComposeUtilsKt.readFloat(parcel, readInt13);
                    } else if (c6 != 5) {
                        ComposeUtilsKt.skipUnknownField(parcel, readInt13);
                    } else {
                        z6 = ComposeUtilsKt.readBoolean(parcel, readInt13);
                    }
                }
                ComposeUtilsKt.ensureAtEnd(parcel, validateObjectHeader12);
                return new zzbr(z4, bArr2, z5, f, z6);
            case 12:
                int validateObjectHeader13 = ComposeUtilsKt.validateObjectHeader(parcel);
                boolean z7 = false;
                while (true) {
                    float[] fArr = null;
                    while (parcel.dataPosition() < validateObjectHeader13) {
                        int readInt14 = parcel.readInt();
                        char c7 = (char) readInt14;
                        if (c7 == 1) {
                            int readSize = ComposeUtilsKt.readSize(parcel, readInt14);
                            int dataPosition = parcel.dataPosition();
                            if (readSize == 0) {
                                break;
                            }
                            float[] createFloatArray = parcel.createFloatArray();
                            parcel.setDataPosition(dataPosition + readSize);
                            fArr = createFloatArray;
                        } else if (c7 == 2) {
                            i4 = ComposeUtilsKt.readInt(parcel, readInt14);
                        } else if (c7 != 3) {
                            ComposeUtilsKt.skipUnknownField(parcel, readInt14);
                        } else {
                            z7 = ComposeUtilsKt.readBoolean(parcel, readInt14);
                        }
                    }
                    ComposeUtilsKt.ensureAtEnd(parcel, validateObjectHeader13);
                    return new zzbt(fArr, i4, z7);
                    break;
                }
            case 13:
                int validateObjectHeader14 = ComposeUtilsKt.validateObjectHeader(parcel);
                while (true) {
                    float[] fArr2 = null;
                    while (parcel.dataPosition() < validateObjectHeader14) {
                        int readInt15 = parcel.readInt();
                        if (((char) readInt15) != 1) {
                            ComposeUtilsKt.skipUnknownField(parcel, readInt15);
                        } else {
                            int readSize2 = ComposeUtilsKt.readSize(parcel, readInt15);
                            int dataPosition2 = parcel.dataPosition();
                            if (readSize2 == 0) {
                                break;
                            }
                            float[] createFloatArray2 = parcel.createFloatArray();
                            parcel.setDataPosition(dataPosition2 + readSize2);
                            fArr2 = createFloatArray2;
                        }
                    }
                    ComposeUtilsKt.ensureAtEnd(parcel, validateObjectHeader14);
                    return new zzbv(fArr2);
                    break;
                }
            case 14:
                int validateObjectHeader15 = ComposeUtilsKt.validateObjectHeader(parcel);
                String str32 = null;
                String str33 = null;
                String str34 = null;
                String str35 = null;
                String str36 = null;
                String str37 = null;
                String str38 = null;
                while (parcel.dataPosition() < validateObjectHeader15) {
                    int readInt16 = parcel.readInt();
                    switch ((char) readInt16) {
                        case 1:
                            str32 = ComposeUtilsKt.createString(parcel, readInt16);
                            break;
                        case 2:
                            str33 = ComposeUtilsKt.createString(parcel, readInt16);
                            break;
                        case 3:
                            str34 = ComposeUtilsKt.createString(parcel, readInt16);
                            break;
                        case 4:
                            str35 = ComposeUtilsKt.createString(parcel, readInt16);
                            break;
                        case 5:
                            str36 = ComposeUtilsKt.createString(parcel, readInt16);
                            break;
                        case 6:
                            str37 = ComposeUtilsKt.createString(parcel, readInt16);
                            break;
                        case 7:
                            str38 = ComposeUtilsKt.createString(parcel, readInt16);
                            break;
                        default:
                            ComposeUtilsKt.skipUnknownField(parcel, readInt16);
                            break;
                    }
                }
                ComposeUtilsKt.ensureAtEnd(parcel, validateObjectHeader15);
                return new zzat(str32, str33, str34, str35, str36, str37, str38);
            case 15:
                int validateObjectHeader16 = ComposeUtilsKt.validateObjectHeader(parcel);
                while (parcel.dataPosition() < validateObjectHeader16) {
                    int readInt17 = parcel.readInt();
                    char c8 = (char) readInt17;
                    if (c8 == 1) {
                        i3 = ComposeUtilsKt.readInt(parcel, readInt17);
                    } else if (c8 != 2) {
                        ComposeUtilsKt.skipUnknownField(parcel, readInt17);
                    } else {
                        str4 = ComposeUtilsKt.createString(parcel, readInt17);
                    }
                }
                ComposeUtilsKt.ensureAtEnd(parcel, validateObjectHeader16);
                return new zzau(i3, str4);
            case 16:
                int validateObjectHeader17 = ComposeUtilsKt.validateObjectHeader(parcel);
                String str39 = null;
                while (parcel.dataPosition() < validateObjectHeader17) {
                    int readInt18 = parcel.readInt();
                    char c9 = (char) readInt18;
                    if (c9 == 1) {
                        str3 = ComposeUtilsKt.createString(parcel, readInt18);
                    } else if (c9 != 2) {
                        ComposeUtilsKt.skipUnknownField(parcel, readInt18);
                    } else {
                        str39 = ComposeUtilsKt.createString(parcel, readInt18);
                    }
                }
                ComposeUtilsKt.ensureAtEnd(parcel, validateObjectHeader17);
                return new zzav(str3, str39);
            case 17:
                int validateObjectHeader18 = ComposeUtilsKt.validateObjectHeader(parcel);
                String str40 = null;
                while (parcel.dataPosition() < validateObjectHeader18) {
                    int readInt19 = parcel.readInt();
                    char c10 = (char) readInt19;
                    if (c10 == 1) {
                        str2 = ComposeUtilsKt.createString(parcel, readInt19);
                    } else if (c10 != 2) {
                        ComposeUtilsKt.skipUnknownField(parcel, readInt19);
                    } else {
                        str40 = ComposeUtilsKt.createString(parcel, readInt19);
                    }
                }
                ComposeUtilsKt.ensureAtEnd(parcel, validateObjectHeader18);
                return new zzaw(str2, str40);
            case 18:
                int validateObjectHeader19 = ComposeUtilsKt.validateObjectHeader(parcel);
                String str41 = null;
                while (parcel.dataPosition() < validateObjectHeader19) {
                    int readInt20 = parcel.readInt();
                    char c11 = (char) readInt20;
                    if (c11 == 1) {
                        str = ComposeUtilsKt.createString(parcel, readInt20);
                    } else if (c11 == 2) {
                        str41 = ComposeUtilsKt.createString(parcel, readInt20);
                    } else if (c11 != 3) {
                        ComposeUtilsKt.skipUnknownField(parcel, readInt20);
                    } else {
                        i2 = ComposeUtilsKt.readInt(parcel, readInt20);
                    }
                }
                ComposeUtilsKt.ensureAtEnd(parcel, validateObjectHeader19);
                return new zzax(str, str41, i2);
            default:
                int validateObjectHeader20 = ComposeUtilsKt.validateObjectHeader(parcel);
                long j = 0;
                int i15 = 0;
                int i16 = 0;
                int i17 = 0;
                int i18 = 0;
                while (true) {
                    long j2 = j;
                    while (parcel.dataPosition() < validateObjectHeader20) {
                        readInt = parcel.readInt();
                        char c12 = (char) readInt;
                        if (c12 == 1) {
                            i15 = ComposeUtilsKt.readInt(parcel, readInt);
                        } else if (c12 == 2) {
                            i16 = ComposeUtilsKt.readInt(parcel, readInt);
                        } else if (c12 == 3) {
                            i17 = ComposeUtilsKt.readInt(parcel, readInt);
                        } else if (c12 == 4) {
                            i18 = ComposeUtilsKt.readInt(parcel, readInt);
                        } else if (c12 != 5) {
                            ComposeUtilsKt.skipUnknownField(parcel, readInt);
                        }
                    }
                    ComposeUtilsKt.ensureAtEnd(parcel, validateObjectHeader20);
                    return new zzcc(i15, i16, i17, i18, j2);
                    j = ComposeUtilsKt.readLong(parcel, readInt);
                    break;
                }
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        switch (this.$r8$classId) {
            case 0:
                return new zzam[i];
            case 1:
                return new zzay[i];
            case 2:
                return new zzba[i];
            case 3:
                return new zzbc[i];
            case 4:
                return new zzbe[i];
            case 5:
                return new zzan[i];
            case 6:
                return new zzao[i];
            case 7:
                return new zzap[i];
            case 8:
                return new zzaq[i];
            case 9:
                return new zzar[i];
            case 10:
                return new zzas[i];
            case 11:
                return new zzbr[i];
            case 12:
                return new zzbt[i];
            case 13:
                return new zzbv[i];
            case 14:
                return new zzat[i];
            case 15:
                return new zzau[i];
            case 16:
                return new zzav[i];
            case 17:
                return new zzaw[i];
            case 18:
                return new zzax[i];
            default:
                return new zzcc[i];
        }
    }
}
