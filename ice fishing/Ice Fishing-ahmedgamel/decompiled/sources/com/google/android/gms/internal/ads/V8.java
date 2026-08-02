package com.google.android.gms.internal.ads;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import com.anythink.core.common.d.j;
import com.anythink.expressad.foundation.h.p;
import java.util.ArrayList;
import x2.C5189a;

/* loaded from: classes2.dex */
public final class V8 implements Parcelable.Creator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f28893a;

    public /* synthetic */ V8(int i) {
        this.f28893a = i;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f28893a) {
            case 0:
                int L2 = com.bumptech.glide.d.L(parcel);
                boolean z6 = false;
                boolean z9 = false;
                boolean z10 = false;
                long j6 = 0;
                ParcelFileDescriptor parcelFileDescriptor = null;
                while (parcel.dataPosition() < L2) {
                    int readInt = parcel.readInt();
                    char c9 = (char) readInt;
                    if (c9 == 2) {
                        parcelFileDescriptor = (ParcelFileDescriptor) com.bumptech.glide.d.k(parcel, readInt, ParcelFileDescriptor.CREATOR);
                    } else if (c9 == 3) {
                        z6 = com.bumptech.glide.d.z(parcel, readInt);
                    } else if (c9 == 4) {
                        z9 = com.bumptech.glide.d.z(parcel, readInt);
                    } else if (c9 == 5) {
                        j6 = com.bumptech.glide.d.C(parcel, readInt);
                    } else if (c9 != 6) {
                        com.bumptech.glide.d.J(parcel, readInt);
                    } else {
                        z10 = com.bumptech.glide.d.z(parcel, readInt);
                    }
                }
                com.bumptech.glide.d.p(parcel, L2);
                return new U8(parcelFileDescriptor, z6, z9, j6, z10);
            case 1:
                int L6 = com.bumptech.glide.d.L(parcel);
                boolean z11 = false;
                int i = 0;
                String str = null;
                String str2 = null;
                String str3 = null;
                String str4 = null;
                Bundle bundle = null;
                String str5 = null;
                long j9 = 0;
                long j10 = 0;
                while (parcel.dataPosition() < L6) {
                    int readInt2 = parcel.readInt();
                    switch ((char) readInt2) {
                        case 2:
                            str = com.bumptech.glide.d.l(parcel, readInt2);
                            break;
                        case 3:
                            j9 = com.bumptech.glide.d.C(parcel, readInt2);
                            break;
                        case 4:
                            str2 = com.bumptech.glide.d.l(parcel, readInt2);
                            break;
                        case 5:
                            str3 = com.bumptech.glide.d.l(parcel, readInt2);
                            break;
                        case 6:
                            str4 = com.bumptech.glide.d.l(parcel, readInt2);
                            break;
                        case 7:
                            bundle = com.bumptech.glide.d.i(parcel, readInt2);
                            break;
                        case '\b':
                            z11 = com.bumptech.glide.d.z(parcel, readInt2);
                            break;
                        case '\t':
                            j10 = com.bumptech.glide.d.C(parcel, readInt2);
                            break;
                        case '\n':
                            str5 = com.bumptech.glide.d.l(parcel, readInt2);
                            break;
                        case 11:
                            i = com.bumptech.glide.d.B(parcel, readInt2);
                            break;
                        default:
                            com.bumptech.glide.d.J(parcel, readInt2);
                            break;
                    }
                }
                com.bumptech.glide.d.p(parcel, L6);
                return new X8(str, j9, str2, str3, str4, bundle, z11, j10, str5, i);
            case 2:
                int L8 = com.bumptech.glide.d.L(parcel);
                int i4 = 0;
                boolean z12 = false;
                int i6 = 0;
                boolean z13 = false;
                int i9 = 0;
                boolean z14 = false;
                int i10 = 0;
                int i11 = 0;
                boolean z15 = false;
                int i12 = 0;
                s2.Z0 z02 = null;
                while (parcel.dataPosition() < L8) {
                    int readInt3 = parcel.readInt();
                    switch ((char) readInt3) {
                        case 1:
                            i4 = com.bumptech.glide.d.B(parcel, readInt3);
                            break;
                        case 2:
                            z12 = com.bumptech.glide.d.z(parcel, readInt3);
                            break;
                        case 3:
                            i6 = com.bumptech.glide.d.B(parcel, readInt3);
                            break;
                        case 4:
                            z13 = com.bumptech.glide.d.z(parcel, readInt3);
                            break;
                        case 5:
                            i9 = com.bumptech.glide.d.B(parcel, readInt3);
                            break;
                        case 6:
                            z02 = (s2.Z0) com.bumptech.glide.d.k(parcel, readInt3, s2.Z0.CREATOR);
                            break;
                        case 7:
                            z14 = com.bumptech.glide.d.z(parcel, readInt3);
                            break;
                        case '\b':
                            i10 = com.bumptech.glide.d.B(parcel, readInt3);
                            break;
                        case '\t':
                            i11 = com.bumptech.glide.d.B(parcel, readInt3);
                            break;
                        case '\n':
                            z15 = com.bumptech.glide.d.z(parcel, readInt3);
                            break;
                        case 11:
                            i12 = com.bumptech.glide.d.B(parcel, readInt3);
                            break;
                        default:
                            com.bumptech.glide.d.J(parcel, readInt3);
                            break;
                    }
                }
                com.bumptech.glide.d.p(parcel, L8);
                return new C3485kb(i4, z12, i6, z13, i9, z02, z14, i10, i11, z15, i12);
            case 3:
                int L9 = com.bumptech.glide.d.L(parcel);
                String str6 = null;
                String[] strArr = null;
                String[] strArr2 = null;
                while (parcel.dataPosition() < L9) {
                    int readInt4 = parcel.readInt();
                    char c10 = (char) readInt4;
                    if (c10 == 1) {
                        str6 = com.bumptech.glide.d.l(parcel, readInt4);
                    } else if (c10 == 2) {
                        strArr = com.bumptech.glide.d.m(parcel, readInt4);
                    } else if (c10 != 3) {
                        com.bumptech.glide.d.J(parcel, readInt4);
                    } else {
                        strArr2 = com.bumptech.glide.d.m(parcel, readInt4);
                    }
                }
                com.bumptech.glide.d.p(parcel, L9);
                return new C3971tc(str6, strArr, strArr2);
            case 4:
                int L10 = com.bumptech.glide.d.L(parcel);
                long j11 = 0;
                boolean z16 = false;
                int i13 = 0;
                boolean z17 = false;
                String str7 = null;
                byte[] bArr = null;
                String[] strArr3 = null;
                String[] strArr4 = null;
                while (parcel.dataPosition() < L10) {
                    int readInt5 = parcel.readInt();
                    switch ((char) readInt5) {
                        case 1:
                            z16 = com.bumptech.glide.d.z(parcel, readInt5);
                            break;
                        case 2:
                            str7 = com.bumptech.glide.d.l(parcel, readInt5);
                            break;
                        case 3:
                            i13 = com.bumptech.glide.d.B(parcel, readInt5);
                            break;
                        case 4:
                            bArr = com.bumptech.glide.d.j(parcel, readInt5);
                            break;
                        case 5:
                            strArr3 = com.bumptech.glide.d.m(parcel, readInt5);
                            break;
                        case 6:
                            strArr4 = com.bumptech.glide.d.m(parcel, readInt5);
                            break;
                        case 7:
                            z17 = com.bumptech.glide.d.z(parcel, readInt5);
                            break;
                        case '\b':
                            j11 = com.bumptech.glide.d.C(parcel, readInt5);
                            break;
                        default:
                            com.bumptech.glide.d.J(parcel, readInt5);
                            break;
                    }
                }
                com.bumptech.glide.d.p(parcel, L10);
                return new C4025uc(z16, str7, i13, bArr, strArr3, strArr4, z17, j11);
            case 5:
                int L11 = com.bumptech.glide.d.L(parcel);
                String str8 = null;
                boolean z18 = false;
                int i14 = 0;
                String str9 = null;
                while (parcel.dataPosition() < L11) {
                    int readInt6 = parcel.readInt();
                    char c11 = (char) readInt6;
                    if (c11 == 1) {
                        str8 = com.bumptech.glide.d.l(parcel, readInt6);
                    } else if (c11 == 2) {
                        z18 = com.bumptech.glide.d.z(parcel, readInt6);
                    } else if (c11 == 3) {
                        i14 = com.bumptech.glide.d.B(parcel, readInt6);
                    } else if (c11 != 4) {
                        com.bumptech.glide.d.J(parcel, readInt6);
                    } else {
                        str9 = com.bumptech.glide.d.l(parcel, readInt6);
                    }
                }
                com.bumptech.glide.d.p(parcel, L11);
                return new C4295zc(str8, i14, str9, z18);
            case 6:
                int L12 = com.bumptech.glide.d.L(parcel);
                String str10 = null;
                Bundle bundle2 = null;
                while (parcel.dataPosition() < L12) {
                    int readInt7 = parcel.readInt();
                    char c12 = (char) readInt7;
                    if (c12 == 1) {
                        str10 = com.bumptech.glide.d.l(parcel, readInt7);
                    } else if (c12 != 2) {
                        com.bumptech.glide.d.J(parcel, readInt7);
                    } else {
                        bundle2 = com.bumptech.glide.d.i(parcel, readInt7);
                    }
                }
                com.bumptech.glide.d.p(parcel, L12);
                return new C2553Ec(str10, bundle2);
            case 7:
                int L13 = com.bumptech.glide.d.L(parcel);
                int i15 = 0;
                int i16 = 0;
                String str11 = null;
                int i17 = 0;
                while (parcel.dataPosition() < L13) {
                    int readInt8 = parcel.readInt();
                    char c13 = (char) readInt8;
                    if (c13 == 1) {
                        i17 = com.bumptech.glide.d.B(parcel, readInt8);
                    } else if (c13 == 2) {
                        str11 = com.bumptech.glide.d.l(parcel, readInt8);
                    } else if (c13 == 3) {
                        i16 = com.bumptech.glide.d.B(parcel, readInt8);
                    } else if (c13 != 1000) {
                        com.bumptech.glide.d.J(parcel, readInt8);
                    } else {
                        i15 = com.bumptech.glide.d.B(parcel, readInt8);
                    }
                }
                com.bumptech.glide.d.p(parcel, L13);
                return new C2570Fc(i15, str11, i17, i16);
            case 8:
                int L14 = com.bumptech.glide.d.L(parcel);
                int i18 = 0;
                int i19 = 0;
                int i20 = 0;
                while (parcel.dataPosition() < L14) {
                    int readInt9 = parcel.readInt();
                    char c14 = (char) readInt9;
                    if (c14 == 1) {
                        i18 = com.bumptech.glide.d.B(parcel, readInt9);
                    } else if (c14 == 2) {
                        i19 = com.bumptech.glide.d.B(parcel, readInt9);
                    } else if (c14 != 3) {
                        com.bumptech.glide.d.J(parcel, readInt9);
                    } else {
                        i20 = com.bumptech.glide.d.B(parcel, readInt9);
                    }
                }
                com.bumptech.glide.d.p(parcel, L14);
                return new C2826Ud(i18, i19, i20);
            case 9:
                int L15 = com.bumptech.glide.d.L(parcel);
                IBinder iBinder = null;
                IBinder iBinder2 = null;
                while (parcel.dataPosition() < L15) {
                    int readInt10 = parcel.readInt();
                    char c15 = (char) readInt10;
                    if (c15 == 1) {
                        iBinder = com.bumptech.glide.d.A(parcel, readInt10);
                    } else if (c15 != 2) {
                        com.bumptech.glide.d.J(parcel, readInt10);
                    } else {
                        iBinder2 = com.bumptech.glide.d.A(parcel, readInt10);
                    }
                }
                com.bumptech.glide.d.p(parcel, L15);
                return new C2487Ae(iBinder, iBinder2);
            case 10:
                int L16 = com.bumptech.glide.d.L(parcel);
                float f2 = 0.0f;
                float f9 = 0.0f;
                long j12 = 0;
                long j13 = 0;
                int i21 = 0;
                Bundle bundle3 = null;
                s2.c1 c1Var = null;
                s2.f1 f1Var = null;
                String str12 = null;
                ApplicationInfo applicationInfo = null;
                PackageInfo packageInfo = null;
                String str13 = null;
                String str14 = null;
                String str15 = null;
                C5189a c5189a = null;
                Bundle bundle4 = null;
                int i22 = 0;
                ArrayList arrayList = null;
                Bundle bundle5 = null;
                boolean z19 = false;
                int i23 = 0;
                int i24 = 0;
                String str16 = null;
                String str17 = null;
                ArrayList arrayList2 = null;
                String str18 = null;
                C3485kb c3485kb = null;
                ArrayList arrayList3 = null;
                String str19 = null;
                boolean z20 = false;
                int i25 = 0;
                int i26 = 0;
                boolean z21 = false;
                String str20 = null;
                String str21 = null;
                boolean z22 = false;
                int i27 = 0;
                Bundle bundle6 = null;
                String str22 = null;
                s2.D0 d02 = null;
                boolean z23 = false;
                Bundle bundle7 = null;
                String str23 = null;
                String str24 = null;
                String str25 = null;
                boolean z24 = false;
                ArrayList arrayList4 = null;
                String str26 = null;
                ArrayList arrayList5 = null;
                int i28 = 0;
                boolean z25 = false;
                boolean z26 = false;
                boolean z27 = false;
                ArrayList arrayList6 = null;
                String str27 = null;
                C2570Fc c2570Fc = null;
                String str28 = null;
                Bundle bundle8 = null;
                while (parcel.dataPosition() < L16) {
                    int readInt11 = parcel.readInt();
                    switch ((char) readInt11) {
                        case 1:
                            i21 = com.bumptech.glide.d.B(parcel, readInt11);
                            break;
                        case 2:
                            bundle3 = com.bumptech.glide.d.i(parcel, readInt11);
                            break;
                        case 3:
                            c1Var = (s2.c1) com.bumptech.glide.d.k(parcel, readInt11, s2.c1.CREATOR);
                            break;
                        case 4:
                            f1Var = (s2.f1) com.bumptech.glide.d.k(parcel, readInt11, s2.f1.CREATOR);
                            break;
                        case 5:
                            str12 = com.bumptech.glide.d.l(parcel, readInt11);
                            break;
                        case 6:
                            applicationInfo = (ApplicationInfo) com.bumptech.glide.d.k(parcel, readInt11, ApplicationInfo.CREATOR);
                            break;
                        case 7:
                            packageInfo = (PackageInfo) com.bumptech.glide.d.k(parcel, readInt11, PackageInfo.CREATOR);
                            break;
                        case '\b':
                            str13 = com.bumptech.glide.d.l(parcel, readInt11);
                            break;
                        case '\t':
                            str14 = com.bumptech.glide.d.l(parcel, readInt11);
                            break;
                        case '\n':
                            str15 = com.bumptech.glide.d.l(parcel, readInt11);
                            break;
                        case 11:
                            c5189a = (C5189a) com.bumptech.glide.d.k(parcel, readInt11, C5189a.CREATOR);
                            break;
                        case '\f':
                            bundle4 = com.bumptech.glide.d.i(parcel, readInt11);
                            break;
                        case '\r':
                            i22 = com.bumptech.glide.d.B(parcel, readInt11);
                            break;
                        case 14:
                            arrayList = com.bumptech.glide.d.n(parcel, readInt11);
                            break;
                        case 15:
                            bundle5 = com.bumptech.glide.d.i(parcel, readInt11);
                            break;
                        case 16:
                            z19 = com.bumptech.glide.d.z(parcel, readInt11);
                            break;
                        case 17:
                        case 22:
                        case 23:
                        case 24:
                        case ' ':
                        case com.anythink.basead.b.b.j.f6592M /* 38 */:
                        case '>':
                        default:
                            com.bumptech.glide.d.J(parcel, readInt11);
                            break;
                        case 18:
                            i23 = com.bumptech.glide.d.B(parcel, readInt11);
                            break;
                        case 19:
                            i24 = com.bumptech.glide.d.B(parcel, readInt11);
                            break;
                        case 20:
                            com.bumptech.glide.d.N(parcel, readInt11, 4);
                            f2 = parcel.readFloat();
                            break;
                        case 21:
                            str16 = com.bumptech.glide.d.l(parcel, readInt11);
                            break;
                        case 25:
                            j12 = com.bumptech.glide.d.C(parcel, readInt11);
                            break;
                        case 26:
                            str17 = com.bumptech.glide.d.l(parcel, readInt11);
                            break;
                        case 27:
                            arrayList2 = com.bumptech.glide.d.n(parcel, readInt11);
                            break;
                        case 28:
                            str18 = com.bumptech.glide.d.l(parcel, readInt11);
                            break;
                        case 29:
                            c3485kb = (C3485kb) com.bumptech.glide.d.k(parcel, readInt11, C3485kb.CREATOR);
                            break;
                        case 30:
                            arrayList3 = com.bumptech.glide.d.n(parcel, readInt11);
                            break;
                        case 31:
                            j13 = com.bumptech.glide.d.C(parcel, readInt11);
                            break;
                        case '!':
                            str19 = com.bumptech.glide.d.l(parcel, readInt11);
                            break;
                        case '\"':
                            com.bumptech.glide.d.N(parcel, readInt11, 4);
                            f9 = parcel.readFloat();
                            break;
                        case '#':
                            i25 = com.bumptech.glide.d.B(parcel, readInt11);
                            break;
                        case '$':
                            i26 = com.bumptech.glide.d.B(parcel, readInt11);
                            break;
                        case '%':
                            z21 = com.bumptech.glide.d.z(parcel, readInt11);
                            break;
                        case '\'':
                            str20 = com.bumptech.glide.d.l(parcel, readInt11);
                            break;
                        case com.anythink.basead.b.b.j.f6594O /* 40 */:
                            z20 = com.bumptech.glide.d.z(parcel, readInt11);
                            break;
                        case ')':
                            str21 = com.bumptech.glide.d.l(parcel, readInt11);
                            break;
                        case '*':
                            z22 = com.bumptech.glide.d.z(parcel, readInt11);
                            break;
                        case com.anythink.basead.b.b.j.f6597R /* 43 */:
                            i27 = com.bumptech.glide.d.B(parcel, readInt11);
                            break;
                        case com.anythink.basead.b.b.j.f6598S /* 44 */:
                            bundle6 = com.bumptech.glide.d.i(parcel, readInt11);
                            break;
                        case com.anythink.basead.b.b.j.f6599T /* 45 */:
                            str22 = com.bumptech.glide.d.l(parcel, readInt11);
                            break;
                        case '.':
                            d02 = (s2.D0) com.bumptech.glide.d.k(parcel, readInt11, s2.D0.CREATOR);
                            break;
                        case '/':
                            z23 = com.bumptech.glide.d.z(parcel, readInt11);
                            break;
                        case com.anythink.basead.b.b.j.f6602W /* 48 */:
                            bundle7 = com.bumptech.glide.d.i(parcel, readInt11);
                            break;
                        case com.anythink.basead.b.b.j.f6603X /* 49 */:
                            str23 = com.bumptech.glide.d.l(parcel, readInt11);
                            break;
                        case '2':
                            str24 = com.bumptech.glide.d.l(parcel, readInt11);
                            break;
                        case '3':
                            str25 = com.bumptech.glide.d.l(parcel, readInt11);
                            break;
                        case '4':
                            z24 = com.bumptech.glide.d.z(parcel, readInt11);
                            break;
                        case com.anythink.core.common.n.a.i.f15609d /* 53 */:
                            int D8 = com.bumptech.glide.d.D(parcel, readInt11);
                            int dataPosition = parcel.dataPosition();
                            if (D8 == 0) {
                                arrayList4 = null;
                                break;
                            } else {
                                ArrayList arrayList7 = new ArrayList();
                                int readInt12 = parcel.readInt();
                                for (int i29 = 0; i29 < readInt12; i29++) {
                                    arrayList7.add(Integer.valueOf(parcel.readInt()));
                                }
                                parcel.setDataPosition(dataPosition + D8);
                                arrayList4 = arrayList7;
                                break;
                            }
                        case '6':
                            str26 = com.bumptech.glide.d.l(parcel, readInt11);
                            break;
                        case '7':
                            arrayList5 = com.bumptech.glide.d.n(parcel, readInt11);
                            break;
                        case p.a.f20466e /* 56 */:
                            i28 = com.bumptech.glide.d.B(parcel, readInt11);
                            break;
                        case '9':
                            z25 = com.bumptech.glide.d.z(parcel, readInt11);
                            break;
                        case ':':
                            z26 = com.bumptech.glide.d.z(parcel, readInt11);
                            break;
                        case j.v.f13377n /* 59 */:
                            z27 = com.bumptech.glide.d.z(parcel, readInt11);
                            break;
                        case '<':
                            arrayList6 = com.bumptech.glide.d.n(parcel, readInt11);
                            break;
                        case '=':
                            str27 = com.bumptech.glide.d.l(parcel, readInt11);
                            break;
                        case '?':
                            c2570Fc = (C2570Fc) com.bumptech.glide.d.k(parcel, readInt11, C2570Fc.CREATOR);
                            break;
                        case '@':
                            str28 = com.bumptech.glide.d.l(parcel, readInt11);
                            break;
                        case j.v.f13362G /* 65 */:
                            bundle8 = com.bumptech.glide.d.i(parcel, readInt11);
                            break;
                    }
                }
                com.bumptech.glide.d.p(parcel, L16);
                return new C2589Ge(i21, bundle3, c1Var, f1Var, str12, applicationInfo, packageInfo, str13, str14, str15, c5189a, bundle4, i22, arrayList, bundle5, z19, i23, i24, f2, str16, j12, str17, arrayList2, str18, c3485kb, arrayList3, j13, str19, f9, z20, i25, i26, z21, str20, str21, z22, i27, bundle6, str22, d02, z23, bundle7, str23, str24, str25, z24, arrayList4, str26, arrayList5, i28, z25, z26, z27, arrayList6, str27, c2570Fc, str28, bundle8);
            case 11:
                int L17 = com.bumptech.glide.d.L(parcel);
                ArrayList arrayList8 = null;
                boolean z28 = false;
                while (parcel.dataPosition() < L17) {
                    int readInt13 = parcel.readInt();
                    char c16 = (char) readInt13;
                    if (c16 == 2) {
                        z28 = com.bumptech.glide.d.z(parcel, readInt13);
                    } else if (c16 != 3) {
                        com.bumptech.glide.d.J(parcel, readInt13);
                    } else {
                        arrayList8 = com.bumptech.glide.d.n(parcel, readInt13);
                    }
                }
                com.bumptech.glide.d.p(parcel, L17);
                return new C2606He(z28, arrayList8);
            case 12:
                int L18 = com.bumptech.glide.d.L(parcel);
                String str29 = null;
                while (parcel.dataPosition() < L18) {
                    int readInt14 = parcel.readInt();
                    if (((char) readInt14) != 1) {
                        com.bumptech.glide.d.J(parcel, readInt14);
                    } else {
                        str29 = com.bumptech.glide.d.l(parcel, readInt14);
                    }
                }
                com.bumptech.glide.d.p(parcel, L18);
                return new C2623Ie(str29);
            case 13:
                int L19 = com.bumptech.glide.d.L(parcel);
                Bundle bundle9 = null;
                C5189a c5189a2 = null;
                ApplicationInfo applicationInfo2 = null;
                String str30 = null;
                ArrayList arrayList9 = null;
                PackageInfo packageInfo2 = null;
                String str31 = null;
                String str32 = null;
                C3989tu c3989tu = null;
                String str33 = null;
                Bundle bundle10 = null;
                boolean z29 = false;
                boolean z30 = false;
                while (parcel.dataPosition() < L19) {
                    int readInt15 = parcel.readInt();
                    switch ((char) readInt15) {
                        case 1:
                            bundle9 = com.bumptech.glide.d.i(parcel, readInt15);
                            break;
                        case 2:
                            c5189a2 = (C5189a) com.bumptech.glide.d.k(parcel, readInt15, C5189a.CREATOR);
                            break;
                        case 3:
                            applicationInfo2 = (ApplicationInfo) com.bumptech.glide.d.k(parcel, readInt15, ApplicationInfo.CREATOR);
                            break;
                        case 4:
                            str30 = com.bumptech.glide.d.l(parcel, readInt15);
                            break;
                        case 5:
                            arrayList9 = com.bumptech.glide.d.n(parcel, readInt15);
                            break;
                        case 6:
                            packageInfo2 = (PackageInfo) com.bumptech.glide.d.k(parcel, readInt15, PackageInfo.CREATOR);
                            break;
                        case 7:
                            str31 = com.bumptech.glide.d.l(parcel, readInt15);
                            break;
                        case '\b':
                        default:
                            com.bumptech.glide.d.J(parcel, readInt15);
                            break;
                        case '\t':
                            str32 = com.bumptech.glide.d.l(parcel, readInt15);
                            break;
                        case '\n':
                            c3989tu = (C3989tu) com.bumptech.glide.d.k(parcel, readInt15, C3989tu.CREATOR);
                            break;
                        case 11:
                            str33 = com.bumptech.glide.d.l(parcel, readInt15);
                            break;
                        case '\f':
                            z29 = com.bumptech.glide.d.z(parcel, readInt15);
                            break;
                        case '\r':
                            z30 = com.bumptech.glide.d.z(parcel, readInt15);
                            break;
                        case 14:
                            bundle10 = com.bumptech.glide.d.i(parcel, readInt15);
                            break;
                    }
                }
                com.bumptech.glide.d.p(parcel, L19);
                return new C2759Qe(bundle9, c5189a2, applicationInfo2, str30, arrayList9, packageInfo2, str31, str32, c3989tu, str33, z29, z30, bundle10);
            case 14:
                int L20 = com.bumptech.glide.d.L(parcel);
                s2.c1 c1Var2 = null;
                String str34 = null;
                while (parcel.dataPosition() < L20) {
                    int readInt16 = parcel.readInt();
                    char c17 = (char) readInt16;
                    if (c17 == 2) {
                        c1Var2 = (s2.c1) com.bumptech.glide.d.k(parcel, readInt16, s2.c1.CREATOR);
                    } else if (c17 != 3) {
                        com.bumptech.glide.d.J(parcel, readInt16);
                    } else {
                        str34 = com.bumptech.glide.d.l(parcel, readInt16);
                    }
                }
                com.bumptech.glide.d.p(parcel, L20);
                return new C2908Ze(str34, c1Var2);
            case 15:
                int L21 = com.bumptech.glide.d.L(parcel);
                int i30 = 0;
                String str35 = null;
                while (parcel.dataPosition() < L21) {
                    int readInt17 = parcel.readInt();
                    char c18 = (char) readInt17;
                    if (c18 == 2) {
                        str35 = com.bumptech.glide.d.l(parcel, readInt17);
                    } else if (c18 != 3) {
                        com.bumptech.glide.d.J(parcel, readInt17);
                    } else {
                        i30 = com.bumptech.glide.d.B(parcel, readInt17);
                    }
                }
                com.bumptech.glide.d.p(parcel, L21);
                return new C3114df(str35, i30);
            case 16:
                int L22 = com.bumptech.glide.d.L(parcel);
                String str36 = null;
                String str37 = null;
                while (parcel.dataPosition() < L22) {
                    int readInt18 = parcel.readInt();
                    char c19 = (char) readInt18;
                    if (c19 == 1) {
                        str36 = com.bumptech.glide.d.l(parcel, readInt18);
                    } else if (c19 != 2) {
                        com.bumptech.glide.d.J(parcel, readInt18);
                    } else {
                        str37 = com.bumptech.glide.d.l(parcel, readInt18);
                    }
                }
                com.bumptech.glide.d.p(parcel, L22);
                return new C4028uf(str36, str37);
            case 17:
                int L23 = com.bumptech.glide.d.L(parcel);
                String str38 = null;
                String str39 = null;
                ArrayList arrayList10 = null;
                ArrayList arrayList11 = null;
                boolean z31 = false;
                boolean z32 = false;
                boolean z33 = false;
                boolean z34 = false;
                while (parcel.dataPosition() < L23) {
                    int readInt19 = parcel.readInt();
                    switch ((char) readInt19) {
                        case 2:
                            str38 = com.bumptech.glide.d.l(parcel, readInt19);
                            break;
                        case 3:
                            str39 = com.bumptech.glide.d.l(parcel, readInt19);
                            break;
                        case 4:
                            z31 = com.bumptech.glide.d.z(parcel, readInt19);
                            break;
                        case 5:
                            z32 = com.bumptech.glide.d.z(parcel, readInt19);
                            break;
                        case 6:
                            arrayList10 = com.bumptech.glide.d.n(parcel, readInt19);
                            break;
                        case 7:
                            z33 = com.bumptech.glide.d.z(parcel, readInt19);
                            break;
                        case '\b':
                            z34 = com.bumptech.glide.d.z(parcel, readInt19);
                            break;
                        case '\t':
                            arrayList11 = com.bumptech.glide.d.n(parcel, readInt19);
                            break;
                        default:
                            com.bumptech.glide.d.J(parcel, readInt19);
                            break;
                    }
                }
                com.bumptech.glide.d.p(parcel, L23);
                return new C4298zf(str38, str39, z31, z32, arrayList10, z33, z34, arrayList11);
            case 18:
                int L24 = com.bumptech.glide.d.L(parcel);
                String str40 = null;
                String str41 = null;
                s2.f1 f1Var2 = null;
                s2.c1 c1Var3 = null;
                while (parcel.dataPosition() < L24) {
                    int readInt20 = parcel.readInt();
                    char c20 = (char) readInt20;
                    if (c20 == 1) {
                        str40 = com.bumptech.glide.d.l(parcel, readInt20);
                    } else if (c20 == 2) {
                        str41 = com.bumptech.glide.d.l(parcel, readInt20);
                    } else if (c20 == 3) {
                        f1Var2 = (s2.f1) com.bumptech.glide.d.k(parcel, readInt20, s2.f1.CREATOR);
                    } else if (c20 != 4) {
                        com.bumptech.glide.d.J(parcel, readInt20);
                    } else {
                        c1Var3 = (s2.c1) com.bumptech.glide.d.k(parcel, readInt20, s2.c1.CREATOR);
                    }
                }
                com.bumptech.glide.d.p(parcel, L24);
                return new C2861Wf(str40, str41, f1Var2, c1Var3);
            case 19:
                int L25 = com.bumptech.glide.d.L(parcel);
                int i31 = 0;
                int i32 = 0;
                int i33 = 0;
                int i34 = 0;
                int i35 = 0;
                int i36 = 0;
                String str42 = null;
                while (parcel.dataPosition() < L25) {
                    int readInt21 = parcel.readInt();
                    switch ((char) readInt21) {
                        case 1:
                            i31 = com.bumptech.glide.d.B(parcel, readInt21);
                            break;
                        case 2:
                            i32 = com.bumptech.glide.d.B(parcel, readInt21);
                            break;
                        case 3:
                            i33 = com.bumptech.glide.d.B(parcel, readInt21);
                            break;
                        case 4:
                            i34 = com.bumptech.glide.d.B(parcel, readInt21);
                            break;
                        case 5:
                            str42 = com.bumptech.glide.d.l(parcel, readInt21);
                            break;
                        case 6:
                            i35 = com.bumptech.glide.d.B(parcel, readInt21);
                            break;
                        case 7:
                            i36 = com.bumptech.glide.d.B(parcel, readInt21);
                            break;
                        default:
                            com.bumptech.glide.d.J(parcel, readInt21);
                            break;
                    }
                }
                com.bumptech.glide.d.p(parcel, L25);
                return new C3989tu(i31, i32, i33, i34, str42, i35, i36);
            case 20:
                int L26 = com.bumptech.glide.d.L(parcel);
                byte[] bArr2 = null;
                int i37 = 0;
                while (parcel.dataPosition() < L26) {
                    int readInt22 = parcel.readInt();
                    char c21 = (char) readInt22;
                    if (c21 == 1) {
                        i37 = com.bumptech.glide.d.B(parcel, readInt22);
                    } else if (c21 != 2) {
                        com.bumptech.glide.d.J(parcel, readInt22);
                    } else {
                        bArr2 = com.bumptech.glide.d.j(parcel, readInt22);
                    }
                }
                com.bumptech.glide.d.p(parcel, L26);
                return new Pw(i37, bArr2);
            case 21:
                int L27 = com.bumptech.glide.d.L(parcel);
                String str43 = null;
                int i38 = 0;
                String str44 = null;
                while (parcel.dataPosition() < L27) {
                    int readInt23 = parcel.readInt();
                    char c22 = (char) readInt23;
                    if (c22 == 1) {
                        i38 = com.bumptech.glide.d.B(parcel, readInt23);
                    } else if (c22 == 2) {
                        str43 = com.bumptech.glide.d.l(parcel, readInt23);
                    } else if (c22 != 3) {
                        com.bumptech.glide.d.J(parcel, readInt23);
                    } else {
                        str44 = com.bumptech.glide.d.l(parcel, readInt23);
                    }
                }
                com.bumptech.glide.d.p(parcel, L27);
                return new Rw(i38, str43, str44);
            case 22:
                int L28 = com.bumptech.glide.d.L(parcel);
                byte[] bArr3 = null;
                int i39 = 0;
                while (parcel.dataPosition() < L28) {
                    int readInt24 = parcel.readInt();
                    char c23 = (char) readInt24;
                    if (c23 == 1) {
                        i39 = com.bumptech.glide.d.B(parcel, readInt24);
                    } else if (c23 != 2) {
                        com.bumptech.glide.d.J(parcel, readInt24);
                    } else {
                        bArr3 = com.bumptech.glide.d.j(parcel, readInt24);
                    }
                }
                com.bumptech.glide.d.p(parcel, L28);
                return new Sw(i39, bArr3);
            case 23:
                int L29 = com.bumptech.glide.d.L(parcel);
                String str45 = null;
                String str46 = null;
                int i40 = 0;
                int i41 = 0;
                int i42 = 0;
                while (parcel.dataPosition() < L29) {
                    int readInt25 = parcel.readInt();
                    char c24 = (char) readInt25;
                    if (c24 == 1) {
                        i40 = com.bumptech.glide.d.B(parcel, readInt25);
                    } else if (c24 == 2) {
                        i41 = com.bumptech.glide.d.B(parcel, readInt25);
                    } else if (c24 == 3) {
                        str45 = com.bumptech.glide.d.l(parcel, readInt25);
                    } else if (c24 == 4) {
                        str46 = com.bumptech.glide.d.l(parcel, readInt25);
                    } else if (c24 != 5) {
                        com.bumptech.glide.d.J(parcel, readInt25);
                    } else {
                        i42 = com.bumptech.glide.d.B(parcel, readInt25);
                    }
                }
                com.bumptech.glide.d.p(parcel, L29);
                return new Vw(i40, i41, i42, str45, str46);
            case 24:
                int L30 = com.bumptech.glide.d.L(parcel);
                int i43 = 0;
                byte[] bArr4 = null;
                int i44 = 0;
                while (parcel.dataPosition() < L30) {
                    int readInt26 = parcel.readInt();
                    char c25 = (char) readInt26;
                    if (c25 == 1) {
                        i43 = com.bumptech.glide.d.B(parcel, readInt26);
                    } else if (c25 == 2) {
                        bArr4 = com.bumptech.glide.d.j(parcel, readInt26);
                    } else if (c25 != 3) {
                        com.bumptech.glide.d.J(parcel, readInt26);
                    } else {
                        i44 = com.bumptech.glide.d.B(parcel, readInt26);
                    }
                }
                com.bumptech.glide.d.p(parcel, L30);
                return new Ww(bArr4, i43, i44);
            case 25:
                return new EO(parcel);
            default:
                return new AO(parcel);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        switch (this.f28893a) {
            case 0:
                return new U8[i];
            case 1:
                return new X8[i];
            case 2:
                return new C3485kb[i];
            case 3:
                return new C3971tc[i];
            case 4:
                return new C4025uc[i];
            case 5:
                return new C4295zc[i];
            case 6:
                return new C2553Ec[i];
            case 7:
                return new C2570Fc[i];
            case 8:
                return new C2826Ud[i];
            case 9:
                return new C2487Ae[i];
            case 10:
                return new C2589Ge[i];
            case 11:
                return new C2606He[i];
            case 12:
                return new C2623Ie[i];
            case 13:
                return new C2759Qe[i];
            case 14:
                return new C2908Ze[i];
            case 15:
                return new C3114df[i];
            case 16:
                return new C4028uf[i];
            case 17:
                return new C4298zf[i];
            case 18:
                return new C2861Wf[i];
            case 19:
                return new C3989tu[i];
            case 20:
                return new Pw[i];
            case 21:
                return new Rw[i];
            case 22:
                return new Sw[i];
            case 23:
                return new Vw[i];
            case 24:
                return new Ww[i];
            case 25:
                return new EO[i];
            default:
                return new AO[i];
        }
    }
}
