package com.google.android.gms.internal.mlkit_vision_face;

import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.recyclerview.widget.RecyclerView;
import com.squareup.cash.directory_ui.views.ComposeUtilsKt;
import java.util.ArrayList;

/* loaded from: classes4.dex */
public final class zze implements Parcelable.Creator {
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ zze(int i) {
        this.$r8$classId = i;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int i = this.$r8$classId;
        float f = RecyclerView.DECELERATION_RATE;
        PointF[] pointFArr = null;
        PointF pointF = null;
        ArrayList arrayList = null;
        int i2 = 0;
        switch (i) {
            case 0:
                int validateObjectHeader = ComposeUtilsKt.validateObjectHeader(parcel);
                while (parcel.dataPosition() < validateObjectHeader) {
                    int readInt = parcel.readInt();
                    char c = (char) readInt;
                    if (c == 2) {
                        pointFArr = (PointF[]) ComposeUtilsKt.createTypedArray(parcel, readInt, PointF.CREATOR);
                    } else if (c != 3) {
                        ComposeUtilsKt.skipUnknownField(parcel, readInt);
                    } else {
                        i2 = ComposeUtilsKt.readInt(parcel, readInt);
                    }
                }
                ComposeUtilsKt.ensureAtEnd(parcel, validateObjectHeader);
                return new zzd(pointFArr, i2);
            case 1:
                int validateObjectHeader2 = ComposeUtilsKt.validateObjectHeader(parcel);
                float f2 = -1.0f;
                float f3 = Float.MAX_VALUE;
                float f4 = Float.MAX_VALUE;
                float f5 = Float.MAX_VALUE;
                float f6 = 0.0f;
                float f7 = 0.0f;
                float f8 = 0.0f;
                float f9 = 0.0f;
                float f10 = 0.0f;
                float f11 = 0.0f;
                float f12 = 0.0f;
                zzn[] zznVarArr = null;
                zzd[] zzdVarArr = null;
                int i3 = 0;
                int i4 = 0;
                while (parcel.dataPosition() < validateObjectHeader2) {
                    int readInt2 = parcel.readInt();
                    switch ((char) readInt2) {
                        case 1:
                            i3 = ComposeUtilsKt.readInt(parcel, readInt2);
                            break;
                        case 2:
                            i4 = ComposeUtilsKt.readInt(parcel, readInt2);
                            break;
                        case 3:
                            f6 = ComposeUtilsKt.readFloat(parcel, readInt2);
                            break;
                        case 4:
                            f7 = ComposeUtilsKt.readFloat(parcel, readInt2);
                            break;
                        case 5:
                            f8 = ComposeUtilsKt.readFloat(parcel, readInt2);
                            break;
                        case 6:
                            f9 = ComposeUtilsKt.readFloat(parcel, readInt2);
                            break;
                        case 7:
                            f3 = ComposeUtilsKt.readFloat(parcel, readInt2);
                            break;
                        case '\b':
                            f4 = ComposeUtilsKt.readFloat(parcel, readInt2);
                            break;
                        case '\t':
                            zznVarArr = (zzn[]) ComposeUtilsKt.createTypedArray(parcel, readInt2, zzn.CREATOR);
                            break;
                        case '\n':
                            f10 = ComposeUtilsKt.readFloat(parcel, readInt2);
                            break;
                        case 11:
                            f11 = ComposeUtilsKt.readFloat(parcel, readInt2);
                            break;
                        case '\f':
                            f12 = ComposeUtilsKt.readFloat(parcel, readInt2);
                            break;
                        case '\r':
                            zzdVarArr = (zzd[]) ComposeUtilsKt.createTypedArray(parcel, readInt2, zzd.CREATOR);
                            break;
                        case 14:
                            f5 = ComposeUtilsKt.readFloat(parcel, readInt2);
                            break;
                        case 15:
                            f2 = ComposeUtilsKt.readFloat(parcel, readInt2);
                            break;
                        default:
                            ComposeUtilsKt.skipUnknownField(parcel, readInt2);
                            break;
                    }
                }
                ComposeUtilsKt.ensureAtEnd(parcel, validateObjectHeader2);
                return new zzf(i3, i4, f6, f7, f8, f9, f3, f4, f5, zznVarArr, f10, f11, f12, zzdVarArr, f2);
            case 2:
                int validateObjectHeader3 = ComposeUtilsKt.validateObjectHeader(parcel);
                float f13 = -1.0f;
                int i5 = 0;
                int i6 = 0;
                int i7 = 0;
                boolean z = false;
                boolean z2 = false;
                while (parcel.dataPosition() < validateObjectHeader3) {
                    int readInt3 = parcel.readInt();
                    switch ((char) readInt3) {
                        case 2:
                            i5 = ComposeUtilsKt.readInt(parcel, readInt3);
                            break;
                        case 3:
                            i6 = ComposeUtilsKt.readInt(parcel, readInt3);
                            break;
                        case 4:
                            i7 = ComposeUtilsKt.readInt(parcel, readInt3);
                            break;
                        case 5:
                            z = ComposeUtilsKt.readBoolean(parcel, readInt3);
                            break;
                        case 6:
                            z2 = ComposeUtilsKt.readBoolean(parcel, readInt3);
                            break;
                        case 7:
                            f13 = ComposeUtilsKt.readFloat(parcel, readInt3);
                            break;
                        default:
                            ComposeUtilsKt.skipUnknownField(parcel, readInt3);
                            break;
                    }
                }
                ComposeUtilsKt.ensureAtEnd(parcel, validateObjectHeader3);
                return new zzh(i5, i6, i7, z, z2, f13);
            case 3:
                int validateObjectHeader4 = ComposeUtilsKt.validateObjectHeader(parcel);
                float f14 = 0.0f;
                int i8 = 0;
                while (parcel.dataPosition() < validateObjectHeader4) {
                    int readInt4 = parcel.readInt();
                    char c2 = (char) readInt4;
                    if (c2 == 1) {
                        i2 = ComposeUtilsKt.readInt(parcel, readInt4);
                    } else if (c2 == 2) {
                        f = ComposeUtilsKt.readFloat(parcel, readInt4);
                    } else if (c2 == 3) {
                        f14 = ComposeUtilsKt.readFloat(parcel, readInt4);
                    } else if (c2 != 4) {
                        ComposeUtilsKt.skipUnknownField(parcel, readInt4);
                    } else {
                        i8 = ComposeUtilsKt.readInt(parcel, readInt4);
                    }
                }
                ComposeUtilsKt.ensureAtEnd(parcel, validateObjectHeader4);
                return new zzn(f, f14, i2, i8);
            case 4:
                int validateObjectHeader5 = ComposeUtilsKt.validateObjectHeader(parcel);
                while (parcel.dataPosition() < validateObjectHeader5) {
                    int readInt5 = parcel.readInt();
                    char c3 = (char) readInt5;
                    if (c3 == 1) {
                        i2 = ComposeUtilsKt.readInt(parcel, readInt5);
                    } else if (c3 != 2) {
                        ComposeUtilsKt.skipUnknownField(parcel, readInt5);
                    } else {
                        arrayList = ComposeUtilsKt.createTypedList(parcel, readInt5, PointF.CREATOR);
                    }
                }
                ComposeUtilsKt.ensureAtEnd(parcel, validateObjectHeader5);
                return new zzos(i2, arrayList);
            case 5:
                int validateObjectHeader6 = ComposeUtilsKt.validateObjectHeader(parcel);
                float f15 = 0.0f;
                int i9 = 0;
                int i10 = 0;
                int i11 = 0;
                int i12 = 0;
                boolean z3 = false;
                while (parcel.dataPosition() < validateObjectHeader6) {
                    int readInt6 = parcel.readInt();
                    switch ((char) readInt6) {
                        case 1:
                            i9 = ComposeUtilsKt.readInt(parcel, readInt6);
                            break;
                        case 2:
                            i10 = ComposeUtilsKt.readInt(parcel, readInt6);
                            break;
                        case 3:
                            i11 = ComposeUtilsKt.readInt(parcel, readInt6);
                            break;
                        case 4:
                            i12 = ComposeUtilsKt.readInt(parcel, readInt6);
                            break;
                        case 5:
                            z3 = ComposeUtilsKt.readBoolean(parcel, readInt6);
                            break;
                        case 6:
                            f15 = ComposeUtilsKt.readFloat(parcel, readInt6);
                            break;
                        default:
                            ComposeUtilsKt.skipUnknownField(parcel, readInt6);
                            break;
                    }
                }
                ComposeUtilsKt.ensureAtEnd(parcel, validateObjectHeader6);
                return new zzou(i9, i10, i11, i12, z3, f15);
            case 6:
                int validateObjectHeader7 = ComposeUtilsKt.validateObjectHeader(parcel);
                float f16 = 0.0f;
                float f17 = 0.0f;
                float f18 = 0.0f;
                float f19 = 0.0f;
                float f20 = 0.0f;
                float f21 = 0.0f;
                float f22 = 0.0f;
                Rect rect = null;
                ArrayList arrayList2 = null;
                ArrayList arrayList3 = null;
                int i13 = 0;
                while (parcel.dataPosition() < validateObjectHeader7) {
                    int readInt7 = parcel.readInt();
                    switch ((char) readInt7) {
                        case 1:
                            i13 = ComposeUtilsKt.readInt(parcel, readInt7);
                            break;
                        case 2:
                            rect = (Rect) ComposeUtilsKt.createParcelable(parcel, readInt7, Rect.CREATOR);
                            break;
                        case 3:
                            f16 = ComposeUtilsKt.readFloat(parcel, readInt7);
                            break;
                        case 4:
                            f17 = ComposeUtilsKt.readFloat(parcel, readInt7);
                            break;
                        case 5:
                            f18 = ComposeUtilsKt.readFloat(parcel, readInt7);
                            break;
                        case 6:
                            f19 = ComposeUtilsKt.readFloat(parcel, readInt7);
                            break;
                        case 7:
                            f20 = ComposeUtilsKt.readFloat(parcel, readInt7);
                            break;
                        case '\b':
                            f21 = ComposeUtilsKt.readFloat(parcel, readInt7);
                            break;
                        case '\t':
                            f22 = ComposeUtilsKt.readFloat(parcel, readInt7);
                            break;
                        case '\n':
                            arrayList2 = ComposeUtilsKt.createTypedList(parcel, readInt7, zzpc.CREATOR);
                            break;
                        case 11:
                            arrayList3 = ComposeUtilsKt.createTypedList(parcel, readInt7, zzos.CREATOR);
                            break;
                        default:
                            ComposeUtilsKt.skipUnknownField(parcel, readInt7);
                            break;
                    }
                }
                ComposeUtilsKt.ensureAtEnd(parcel, validateObjectHeader7);
                return new zzow(i13, rect, f16, f17, f18, f19, f20, f21, f22, arrayList2, arrayList3);
            case 7:
                int validateObjectHeader8 = ComposeUtilsKt.validateObjectHeader(parcel);
                while (parcel.dataPosition() < validateObjectHeader8) {
                    int readInt8 = parcel.readInt();
                    char c4 = (char) readInt8;
                    if (c4 == 1) {
                        i2 = ComposeUtilsKt.readInt(parcel, readInt8);
                    } else if (c4 != 2) {
                        ComposeUtilsKt.skipUnknownField(parcel, readInt8);
                    } else {
                        pointF = (PointF) ComposeUtilsKt.createParcelable(parcel, readInt8, PointF.CREATOR);
                    }
                }
                ComposeUtilsKt.ensureAtEnd(parcel, validateObjectHeader8);
                return new zzpc(i2, pointF);
            default:
                int validateObjectHeader9 = ComposeUtilsKt.validateObjectHeader(parcel);
                long j = 0;
                int i14 = 0;
                int i15 = 0;
                int i16 = 0;
                int i17 = 0;
                while (parcel.dataPosition() < validateObjectHeader9) {
                    int readInt9 = parcel.readInt();
                    char c5 = (char) readInt9;
                    if (c5 == 2) {
                        i14 = ComposeUtilsKt.readInt(parcel, readInt9);
                    } else if (c5 == 3) {
                        i15 = ComposeUtilsKt.readInt(parcel, readInt9);
                    } else if (c5 == 4) {
                        i16 = ComposeUtilsKt.readInt(parcel, readInt9);
                    } else if (c5 == 5) {
                        j = ComposeUtilsKt.readLong(parcel, readInt9);
                    } else if (c5 != 6) {
                        ComposeUtilsKt.skipUnknownField(parcel, readInt9);
                    } else {
                        i17 = ComposeUtilsKt.readInt(parcel, readInt9);
                    }
                }
                ComposeUtilsKt.ensureAtEnd(parcel, validateObjectHeader9);
                return new zzp(i14, i15, i16, i17, j);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        switch (this.$r8$classId) {
            case 0:
                return new zzd[i];
            case 1:
                return new zzf[i];
            case 2:
                return new zzh[i];
            case 3:
                return new zzn[i];
            case 4:
                return new zzos[i];
            case 5:
                return new zzou[i];
            case 6:
                return new zzow[i];
            case 7:
                return new zzpc[i];
            default:
                return new zzp[i];
        }
    }
}
