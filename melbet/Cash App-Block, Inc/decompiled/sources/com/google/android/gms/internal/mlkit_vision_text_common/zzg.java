package com.google.android.gms.internal.mlkit_vision_text_common;

import android.graphics.Point;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import com.squareup.cash.directory_ui.views.ComposeUtilsKt;
import java.util.ArrayList;

/* loaded from: classes4.dex */
public final class zzg implements Parcelable.Creator {
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ zzg(int i) {
        this.$r8$classId = i;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        String str = null;
        switch (this.$r8$classId) {
            case 0:
                int validateObjectHeader = ComposeUtilsKt.validateObjectHeader(parcel);
                int i = 0;
                int i2 = 0;
                int i3 = 0;
                int i4 = 0;
                float f = 0.0f;
                while (parcel.dataPosition() < validateObjectHeader) {
                    int readInt = parcel.readInt();
                    char c = (char) readInt;
                    if (c == 2) {
                        i = ComposeUtilsKt.readInt(parcel, readInt);
                    } else if (c == 3) {
                        i2 = ComposeUtilsKt.readInt(parcel, readInt);
                    } else if (c == 4) {
                        i3 = ComposeUtilsKt.readInt(parcel, readInt);
                    } else if (c == 5) {
                        i4 = ComposeUtilsKt.readInt(parcel, readInt);
                    } else if (c != 6) {
                        ComposeUtilsKt.skipUnknownField(parcel, readInt);
                    } else {
                        f = ComposeUtilsKt.readFloat(parcel, readInt);
                    }
                }
                ComposeUtilsKt.ensureAtEnd(parcel, validateObjectHeader);
                return new zzf(i, i2, i3, i4, f);
            case 1:
                int validateObjectHeader2 = ComposeUtilsKt.validateObjectHeader(parcel);
                int i5 = 0;
                boolean z = false;
                int i6 = 0;
                int i7 = 0;
                float f2 = 0.0f;
                zzr[] zzrVarArr = null;
                zzf zzfVar = null;
                zzf zzfVar2 = null;
                zzf zzfVar3 = null;
                String str2 = null;
                String str3 = null;
                while (parcel.dataPosition() < validateObjectHeader2) {
                    int readInt2 = parcel.readInt();
                    switch ((char) readInt2) {
                        case 2:
                            zzrVarArr = (zzr[]) ComposeUtilsKt.createTypedArray(parcel, readInt2, zzr.CREATOR);
                            break;
                        case 3:
                            zzfVar = (zzf) ComposeUtilsKt.createParcelable(parcel, readInt2, zzf.CREATOR);
                            break;
                        case 4:
                            zzfVar2 = (zzf) ComposeUtilsKt.createParcelable(parcel, readInt2, zzf.CREATOR);
                            break;
                        case 5:
                            zzfVar3 = (zzf) ComposeUtilsKt.createParcelable(parcel, readInt2, zzf.CREATOR);
                            break;
                        case 6:
                            str2 = ComposeUtilsKt.createString(parcel, readInt2);
                            break;
                        case 7:
                            f2 = ComposeUtilsKt.readFloat(parcel, readInt2);
                            break;
                        case '\b':
                            str3 = ComposeUtilsKt.createString(parcel, readInt2);
                            break;
                        case '\t':
                            i5 = ComposeUtilsKt.readInt(parcel, readInt2);
                            break;
                        case '\n':
                            z = ComposeUtilsKt.readBoolean(parcel, readInt2);
                            break;
                        case 11:
                            i6 = ComposeUtilsKt.readInt(parcel, readInt2);
                            break;
                        case '\f':
                            i7 = ComposeUtilsKt.readInt(parcel, readInt2);
                            break;
                        default:
                            ComposeUtilsKt.skipUnknownField(parcel, readInt2);
                            break;
                    }
                }
                ComposeUtilsKt.ensureAtEnd(parcel, validateObjectHeader2);
                return new zzl(zzrVarArr, zzfVar, zzfVar2, zzfVar3, str2, f2, str3, i5, z, i6, i7);
            case 2:
                int validateObjectHeader3 = ComposeUtilsKt.validateObjectHeader(parcel);
                while (parcel.dataPosition() < validateObjectHeader3) {
                    ComposeUtilsKt.skipUnknownField(parcel, parcel.readInt());
                }
                ComposeUtilsKt.ensureAtEnd(parcel, validateObjectHeader3);
                return new zzn();
            case 3:
                int validateObjectHeader4 = ComposeUtilsKt.validateObjectHeader(parcel);
                while (parcel.dataPosition() < validateObjectHeader4) {
                    int readInt3 = parcel.readInt();
                    if (((char) readInt3) != 2) {
                        ComposeUtilsKt.skipUnknownField(parcel, readInt3);
                    } else {
                        str = ComposeUtilsKt.createString(parcel, readInt3);
                    }
                }
                ComposeUtilsKt.ensureAtEnd(parcel, validateObjectHeader4);
                return new zzp(str);
            case 4:
                int validateObjectHeader5 = ComposeUtilsKt.validateObjectHeader(parcel);
                boolean z2 = false;
                float f3 = 0.0f;
                zzn[] zznVarArr = null;
                zzf zzfVar4 = null;
                zzf zzfVar5 = null;
                String str4 = null;
                String str5 = null;
                while (parcel.dataPosition() < validateObjectHeader5) {
                    int readInt4 = parcel.readInt();
                    switch ((char) readInt4) {
                        case 2:
                            zznVarArr = (zzn[]) ComposeUtilsKt.createTypedArray(parcel, readInt4, zzn.CREATOR);
                            break;
                        case 3:
                            zzfVar4 = (zzf) ComposeUtilsKt.createParcelable(parcel, readInt4, zzf.CREATOR);
                            break;
                        case 4:
                            zzfVar5 = (zzf) ComposeUtilsKt.createParcelable(parcel, readInt4, zzf.CREATOR);
                            break;
                        case 5:
                            str4 = ComposeUtilsKt.createString(parcel, readInt4);
                            break;
                        case 6:
                            f3 = ComposeUtilsKt.readFloat(parcel, readInt4);
                            break;
                        case 7:
                            str5 = ComposeUtilsKt.createString(parcel, readInt4);
                            break;
                        case '\b':
                            z2 = ComposeUtilsKt.readBoolean(parcel, readInt4);
                            break;
                        default:
                            ComposeUtilsKt.skipUnknownField(parcel, readInt4);
                            break;
                    }
                }
                ComposeUtilsKt.ensureAtEnd(parcel, validateObjectHeader5);
                return new zzr(zznVarArr, zzfVar4, zzfVar5, str4, f3, str5, z2);
            case 5:
                int validateObjectHeader6 = ComposeUtilsKt.validateObjectHeader(parcel);
                String str6 = null;
                Rect rect = null;
                ArrayList arrayList = null;
                String str7 = null;
                ArrayList arrayList2 = null;
                while (parcel.dataPosition() < validateObjectHeader6) {
                    int readInt5 = parcel.readInt();
                    char c2 = (char) readInt5;
                    if (c2 == 1) {
                        str6 = ComposeUtilsKt.createString(parcel, readInt5);
                    } else if (c2 == 2) {
                        rect = (Rect) ComposeUtilsKt.createParcelable(parcel, readInt5, Rect.CREATOR);
                    } else if (c2 == 3) {
                        arrayList = ComposeUtilsKt.createTypedList(parcel, readInt5, Point.CREATOR);
                    } else if (c2 == 4) {
                        str7 = ComposeUtilsKt.createString(parcel, readInt5);
                    } else if (c2 != 5) {
                        ComposeUtilsKt.skipUnknownField(parcel, readInt5);
                    } else {
                        arrayList2 = ComposeUtilsKt.createTypedList(parcel, readInt5, zzvd.CREATOR);
                    }
                }
                ComposeUtilsKt.ensureAtEnd(parcel, validateObjectHeader6);
                return new zzuz(str6, rect, arrayList, str7, arrayList2);
            case 6:
                int validateObjectHeader7 = ComposeUtilsKt.validateObjectHeader(parcel);
                float f4 = 0.0f;
                float f5 = 0.0f;
                Rect rect2 = null;
                String str8 = null;
                String str9 = null;
                ArrayList arrayList3 = null;
                ArrayList arrayList4 = null;
                while (parcel.dataPosition() < validateObjectHeader7) {
                    int readInt6 = parcel.readInt();
                    switch ((char) readInt6) {
                        case 1:
                            str8 = ComposeUtilsKt.createString(parcel, readInt6);
                            break;
                        case 2:
                            rect2 = (Rect) ComposeUtilsKt.createParcelable(parcel, readInt6, Rect.CREATOR);
                            break;
                        case 3:
                            arrayList3 = ComposeUtilsKt.createTypedList(parcel, readInt6, Point.CREATOR);
                            break;
                        case 4:
                            str9 = ComposeUtilsKt.createString(parcel, readInt6);
                            break;
                        case 5:
                            f4 = ComposeUtilsKt.readFloat(parcel, readInt6);
                            break;
                        case 6:
                            f5 = ComposeUtilsKt.readFloat(parcel, readInt6);
                            break;
                        case 7:
                            arrayList4 = ComposeUtilsKt.createTypedList(parcel, readInt6, zzvj.CREATOR);
                            break;
                        default:
                            ComposeUtilsKt.skipUnknownField(parcel, readInt6);
                            break;
                    }
                }
                ComposeUtilsKt.ensureAtEnd(parcel, validateObjectHeader7);
                return new zzvb(f4, f5, rect2, str8, str9, arrayList3, arrayList4);
            case 7:
                int validateObjectHeader8 = ComposeUtilsKt.validateObjectHeader(parcel);
                float f6 = 0.0f;
                float f7 = 0.0f;
                Rect rect3 = null;
                String str10 = null;
                String str11 = null;
                ArrayList arrayList5 = null;
                ArrayList arrayList6 = null;
                while (parcel.dataPosition() < validateObjectHeader8) {
                    int readInt7 = parcel.readInt();
                    switch ((char) readInt7) {
                        case 1:
                            str10 = ComposeUtilsKt.createString(parcel, readInt7);
                            break;
                        case 2:
                            rect3 = (Rect) ComposeUtilsKt.createParcelable(parcel, readInt7, Rect.CREATOR);
                            break;
                        case 3:
                            arrayList5 = ComposeUtilsKt.createTypedList(parcel, readInt7, Point.CREATOR);
                            break;
                        case 4:
                            str11 = ComposeUtilsKt.createString(parcel, readInt7);
                            break;
                        case 5:
                            arrayList6 = ComposeUtilsKt.createTypedList(parcel, readInt7, zzvb.CREATOR);
                            break;
                        case 6:
                            f6 = ComposeUtilsKt.readFloat(parcel, readInt7);
                            break;
                        case 7:
                            f7 = ComposeUtilsKt.readFloat(parcel, readInt7);
                            break;
                        default:
                            ComposeUtilsKt.skipUnknownField(parcel, readInt7);
                            break;
                    }
                }
                ComposeUtilsKt.ensureAtEnd(parcel, validateObjectHeader8);
                return new zzvd(f6, f7, rect3, str10, str11, arrayList5, arrayList6);
            case 8:
                int validateObjectHeader9 = ComposeUtilsKt.validateObjectHeader(parcel);
                ArrayList arrayList7 = null;
                while (parcel.dataPosition() < validateObjectHeader9) {
                    int readInt8 = parcel.readInt();
                    char c3 = (char) readInt8;
                    if (c3 == 1) {
                        str = ComposeUtilsKt.createString(parcel, readInt8);
                    } else if (c3 != 2) {
                        ComposeUtilsKt.skipUnknownField(parcel, readInt8);
                    } else {
                        arrayList7 = ComposeUtilsKt.createTypedList(parcel, readInt8, zzuz.CREATOR);
                    }
                }
                ComposeUtilsKt.ensureAtEnd(parcel, validateObjectHeader9);
                return new zzvf(str, arrayList7);
            case 9:
                int validateObjectHeader10 = ComposeUtilsKt.validateObjectHeader(parcel);
                boolean z3 = false;
                int i8 = 0;
                boolean z4 = false;
                String str12 = null;
                String str13 = null;
                String str14 = null;
                String str15 = null;
                while (parcel.dataPosition() < validateObjectHeader10) {
                    int readInt9 = parcel.readInt();
                    switch ((char) readInt9) {
                        case 1:
                            str12 = ComposeUtilsKt.createString(parcel, readInt9);
                            break;
                        case 2:
                            str13 = ComposeUtilsKt.createString(parcel, readInt9);
                            break;
                        case 3:
                            str14 = ComposeUtilsKt.createString(parcel, readInt9);
                            break;
                        case 4:
                            z3 = ComposeUtilsKt.readBoolean(parcel, readInt9);
                            break;
                        case 5:
                            i8 = ComposeUtilsKt.readInt(parcel, readInt9);
                            break;
                        case 6:
                            str15 = ComposeUtilsKt.createString(parcel, readInt9);
                            break;
                        case 7:
                            z4 = ComposeUtilsKt.readBoolean(parcel, readInt9);
                            break;
                        default:
                            ComposeUtilsKt.skipUnknownField(parcel, readInt9);
                            break;
                    }
                }
                ComposeUtilsKt.ensureAtEnd(parcel, validateObjectHeader10);
                return new zzvh(str12, str13, str14, z3, i8, str15, z4);
            default:
                int validateObjectHeader11 = ComposeUtilsKt.validateObjectHeader(parcel);
                float f8 = 0.0f;
                float f9 = 0.0f;
                String str16 = null;
                Rect rect4 = null;
                ArrayList arrayList8 = null;
                while (parcel.dataPosition() < validateObjectHeader11) {
                    int readInt10 = parcel.readInt();
                    char c4 = (char) readInt10;
                    if (c4 == 1) {
                        str16 = ComposeUtilsKt.createString(parcel, readInt10);
                    } else if (c4 == 2) {
                        rect4 = (Rect) ComposeUtilsKt.createParcelable(parcel, readInt10, Rect.CREATOR);
                    } else if (c4 == 3) {
                        arrayList8 = ComposeUtilsKt.createTypedList(parcel, readInt10, Point.CREATOR);
                    } else if (c4 == 4) {
                        f8 = ComposeUtilsKt.readFloat(parcel, readInt10);
                    } else if (c4 != 5) {
                        ComposeUtilsKt.skipUnknownField(parcel, readInt10);
                    } else {
                        f9 = ComposeUtilsKt.readFloat(parcel, readInt10);
                    }
                }
                ComposeUtilsKt.ensureAtEnd(parcel, validateObjectHeader11);
                return new zzvj(str16, rect4, arrayList8, f8, f9);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        switch (this.$r8$classId) {
            case 0:
                return new zzf[i];
            case 1:
                return new zzl[i];
            case 2:
                return new zzn[i];
            case 3:
                return new zzp[i];
            case 4:
                return new zzr[i];
            case 5:
                return new zzuz[i];
            case 6:
                return new zzvb[i];
            case 7:
                return new zzvd[i];
            case 8:
                return new zzvf[i];
            case 9:
                return new zzvh[i];
            default:
                return new zzvj[i];
        }
    }
}
