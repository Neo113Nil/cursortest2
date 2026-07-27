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
import v2.C5110a;

/* loaded from: classes2.dex */
public final class V8 implements Parcelable.Creator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f28096a;

    public /* synthetic */ V8(int i) {
        this.f28096a = i;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f28096a) {
            case 0:
                int H8 = t8.g.H(parcel);
                boolean z3 = false;
                boolean z6 = false;
                boolean z9 = false;
                long j6 = 0;
                ParcelFileDescriptor parcelFileDescriptor = null;
                while (parcel.dataPosition() < H8) {
                    int readInt = parcel.readInt();
                    char c9 = (char) readInt;
                    if (c9 == 2) {
                        parcelFileDescriptor = (ParcelFileDescriptor) t8.g.h(parcel, readInt, ParcelFileDescriptor.CREATOR);
                    } else if (c9 == 3) {
                        z3 = t8.g.x(parcel, readInt);
                    } else if (c9 == 4) {
                        z6 = t8.g.x(parcel, readInt);
                    } else if (c9 == 5) {
                        j6 = t8.g.A(parcel, readInt);
                    } else if (c9 != 6) {
                        t8.g.G(parcel, readInt);
                    } else {
                        z9 = t8.g.x(parcel, readInt);
                    }
                }
                t8.g.n(parcel, H8);
                return new U8(parcelFileDescriptor, z3, z6, j6, z9);
            case 1:
                int H9 = t8.g.H(parcel);
                boolean z10 = false;
                int i = 0;
                String str = null;
                String str2 = null;
                String str3 = null;
                String str4 = null;
                Bundle bundle = null;
                String str5 = null;
                long j9 = 0;
                long j10 = 0;
                while (parcel.dataPosition() < H9) {
                    int readInt2 = parcel.readInt();
                    switch ((char) readInt2) {
                        case 2:
                            str = t8.g.i(parcel, readInt2);
                            break;
                        case 3:
                            j9 = t8.g.A(parcel, readInt2);
                            break;
                        case 4:
                            str2 = t8.g.i(parcel, readInt2);
                            break;
                        case 5:
                            str3 = t8.g.i(parcel, readInt2);
                            break;
                        case 6:
                            str4 = t8.g.i(parcel, readInt2);
                            break;
                        case 7:
                            bundle = t8.g.f(parcel, readInt2);
                            break;
                        case '\b':
                            z10 = t8.g.x(parcel, readInt2);
                            break;
                        case '\t':
                            j10 = t8.g.A(parcel, readInt2);
                            break;
                        case '\n':
                            str5 = t8.g.i(parcel, readInt2);
                            break;
                        case 11:
                            i = t8.g.z(parcel, readInt2);
                            break;
                        default:
                            t8.g.G(parcel, readInt2);
                            break;
                    }
                }
                t8.g.n(parcel, H9);
                return new X8(str, j9, str2, str3, str4, bundle, z10, j10, str5, i);
            case 2:
                int H10 = t8.g.H(parcel);
                int i6 = 0;
                boolean z11 = false;
                int i9 = 0;
                boolean z12 = false;
                int i10 = 0;
                boolean z13 = false;
                int i11 = 0;
                int i12 = 0;
                boolean z14 = false;
                int i13 = 0;
                q2.Z0 z02 = null;
                while (parcel.dataPosition() < H10) {
                    int readInt3 = parcel.readInt();
                    switch ((char) readInt3) {
                        case 1:
                            i6 = t8.g.z(parcel, readInt3);
                            break;
                        case 2:
                            z11 = t8.g.x(parcel, readInt3);
                            break;
                        case 3:
                            i9 = t8.g.z(parcel, readInt3);
                            break;
                        case 4:
                            z12 = t8.g.x(parcel, readInt3);
                            break;
                        case 5:
                            i10 = t8.g.z(parcel, readInt3);
                            break;
                        case 6:
                            z02 = (q2.Z0) t8.g.h(parcel, readInt3, q2.Z0.CREATOR);
                            break;
                        case 7:
                            z13 = t8.g.x(parcel, readInt3);
                            break;
                        case '\b':
                            i11 = t8.g.z(parcel, readInt3);
                            break;
                        case '\t':
                            i12 = t8.g.z(parcel, readInt3);
                            break;
                        case '\n':
                            z14 = t8.g.x(parcel, readInt3);
                            break;
                        case 11:
                            i13 = t8.g.z(parcel, readInt3);
                            break;
                        default:
                            t8.g.G(parcel, readInt3);
                            break;
                    }
                }
                t8.g.n(parcel, H10);
                return new C3462kb(i6, z11, i9, z12, i10, z02, z13, i11, i12, z14, i13);
            case 3:
                int H11 = t8.g.H(parcel);
                String str6 = null;
                String[] strArr = null;
                String[] strArr2 = null;
                while (parcel.dataPosition() < H11) {
                    int readInt4 = parcel.readInt();
                    char c10 = (char) readInt4;
                    if (c10 == 1) {
                        str6 = t8.g.i(parcel, readInt4);
                    } else if (c10 == 2) {
                        strArr = t8.g.j(parcel, readInt4);
                    } else if (c10 != 3) {
                        t8.g.G(parcel, readInt4);
                    } else {
                        strArr2 = t8.g.j(parcel, readInt4);
                    }
                }
                t8.g.n(parcel, H11);
                return new C3948tc(str6, strArr, strArr2);
            case 4:
                int H12 = t8.g.H(parcel);
                long j11 = 0;
                boolean z15 = false;
                int i14 = 0;
                boolean z16 = false;
                String str7 = null;
                byte[] bArr = null;
                String[] strArr3 = null;
                String[] strArr4 = null;
                while (parcel.dataPosition() < H12) {
                    int readInt5 = parcel.readInt();
                    switch ((char) readInt5) {
                        case 1:
                            z15 = t8.g.x(parcel, readInt5);
                            break;
                        case 2:
                            str7 = t8.g.i(parcel, readInt5);
                            break;
                        case 3:
                            i14 = t8.g.z(parcel, readInt5);
                            break;
                        case 4:
                            bArr = t8.g.g(parcel, readInt5);
                            break;
                        case 5:
                            strArr3 = t8.g.j(parcel, readInt5);
                            break;
                        case 6:
                            strArr4 = t8.g.j(parcel, readInt5);
                            break;
                        case 7:
                            z16 = t8.g.x(parcel, readInt5);
                            break;
                        case '\b':
                            j11 = t8.g.A(parcel, readInt5);
                            break;
                        default:
                            t8.g.G(parcel, readInt5);
                            break;
                    }
                }
                t8.g.n(parcel, H12);
                return new C4002uc(z15, str7, i14, bArr, strArr3, strArr4, z16, j11);
            case 5:
                int H13 = t8.g.H(parcel);
                String str8 = null;
                boolean z17 = false;
                int i15 = 0;
                String str9 = null;
                while (parcel.dataPosition() < H13) {
                    int readInt6 = parcel.readInt();
                    char c11 = (char) readInt6;
                    if (c11 == 1) {
                        str8 = t8.g.i(parcel, readInt6);
                    } else if (c11 == 2) {
                        z17 = t8.g.x(parcel, readInt6);
                    } else if (c11 == 3) {
                        i15 = t8.g.z(parcel, readInt6);
                    } else if (c11 != 4) {
                        t8.g.G(parcel, readInt6);
                    } else {
                        str9 = t8.g.i(parcel, readInt6);
                    }
                }
                t8.g.n(parcel, H13);
                return new C4272zc(str8, i15, str9, z17);
            case 6:
                int H14 = t8.g.H(parcel);
                String str10 = null;
                Bundle bundle2 = null;
                while (parcel.dataPosition() < H14) {
                    int readInt7 = parcel.readInt();
                    char c12 = (char) readInt7;
                    if (c12 == 1) {
                        str10 = t8.g.i(parcel, readInt7);
                    } else if (c12 != 2) {
                        t8.g.G(parcel, readInt7);
                    } else {
                        bundle2 = t8.g.f(parcel, readInt7);
                    }
                }
                t8.g.n(parcel, H14);
                return new C2533Ec(str10, bundle2);
            case 7:
                int H15 = t8.g.H(parcel);
                int i16 = 0;
                int i17 = 0;
                String str11 = null;
                int i18 = 0;
                while (parcel.dataPosition() < H15) {
                    int readInt8 = parcel.readInt();
                    char c13 = (char) readInt8;
                    if (c13 == 1) {
                        i18 = t8.g.z(parcel, readInt8);
                    } else if (c13 == 2) {
                        str11 = t8.g.i(parcel, readInt8);
                    } else if (c13 == 3) {
                        i17 = t8.g.z(parcel, readInt8);
                    } else if (c13 != 1000) {
                        t8.g.G(parcel, readInt8);
                    } else {
                        i16 = t8.g.z(parcel, readInt8);
                    }
                }
                t8.g.n(parcel, H15);
                return new C2550Fc(i16, str11, i18, i17);
            case 8:
                int H16 = t8.g.H(parcel);
                int i19 = 0;
                int i20 = 0;
                int i21 = 0;
                while (parcel.dataPosition() < H16) {
                    int readInt9 = parcel.readInt();
                    char c14 = (char) readInt9;
                    if (c14 == 1) {
                        i19 = t8.g.z(parcel, readInt9);
                    } else if (c14 == 2) {
                        i20 = t8.g.z(parcel, readInt9);
                    } else if (c14 != 3) {
                        t8.g.G(parcel, readInt9);
                    } else {
                        i21 = t8.g.z(parcel, readInt9);
                    }
                }
                t8.g.n(parcel, H16);
                return new C2804Ud(i19, i20, i21);
            case 9:
                int H17 = t8.g.H(parcel);
                IBinder iBinder = null;
                IBinder iBinder2 = null;
                while (parcel.dataPosition() < H17) {
                    int readInt10 = parcel.readInt();
                    char c15 = (char) readInt10;
                    if (c15 == 1) {
                        iBinder = t8.g.y(parcel, readInt10);
                    } else if (c15 != 2) {
                        t8.g.G(parcel, readInt10);
                    } else {
                        iBinder2 = t8.g.y(parcel, readInt10);
                    }
                }
                t8.g.n(parcel, H17);
                return new C2467Ae(iBinder, iBinder2);
            case 10:
                int H18 = t8.g.H(parcel);
                float f3 = 0.0f;
                float f9 = 0.0f;
                long j12 = 0;
                long j13 = 0;
                int i22 = 0;
                Bundle bundle3 = null;
                q2.c1 c1Var = null;
                q2.f1 f1Var = null;
                String str12 = null;
                ApplicationInfo applicationInfo = null;
                PackageInfo packageInfo = null;
                String str13 = null;
                String str14 = null;
                String str15 = null;
                C5110a c5110a = null;
                Bundle bundle4 = null;
                int i23 = 0;
                ArrayList arrayList = null;
                Bundle bundle5 = null;
                boolean z18 = false;
                int i24 = 0;
                int i25 = 0;
                String str16 = null;
                String str17 = null;
                ArrayList arrayList2 = null;
                String str18 = null;
                C3462kb c3462kb = null;
                ArrayList arrayList3 = null;
                String str19 = null;
                boolean z19 = false;
                int i26 = 0;
                int i27 = 0;
                boolean z20 = false;
                String str20 = null;
                String str21 = null;
                boolean z21 = false;
                int i28 = 0;
                Bundle bundle6 = null;
                String str22 = null;
                q2.D0 d02 = null;
                boolean z22 = false;
                Bundle bundle7 = null;
                String str23 = null;
                String str24 = null;
                String str25 = null;
                boolean z23 = false;
                ArrayList arrayList4 = null;
                String str26 = null;
                ArrayList arrayList5 = null;
                int i29 = 0;
                boolean z24 = false;
                boolean z25 = false;
                boolean z26 = false;
                ArrayList arrayList6 = null;
                String str27 = null;
                C2550Fc c2550Fc = null;
                String str28 = null;
                Bundle bundle8 = null;
                while (parcel.dataPosition() < H18) {
                    int readInt11 = parcel.readInt();
                    switch ((char) readInt11) {
                        case 1:
                            i22 = t8.g.z(parcel, readInt11);
                            break;
                        case 2:
                            bundle3 = t8.g.f(parcel, readInt11);
                            break;
                        case 3:
                            c1Var = (q2.c1) t8.g.h(parcel, readInt11, q2.c1.CREATOR);
                            break;
                        case 4:
                            f1Var = (q2.f1) t8.g.h(parcel, readInt11, q2.f1.CREATOR);
                            break;
                        case 5:
                            str12 = t8.g.i(parcel, readInt11);
                            break;
                        case 6:
                            applicationInfo = (ApplicationInfo) t8.g.h(parcel, readInt11, ApplicationInfo.CREATOR);
                            break;
                        case 7:
                            packageInfo = (PackageInfo) t8.g.h(parcel, readInt11, PackageInfo.CREATOR);
                            break;
                        case '\b':
                            str13 = t8.g.i(parcel, readInt11);
                            break;
                        case '\t':
                            str14 = t8.g.i(parcel, readInt11);
                            break;
                        case '\n':
                            str15 = t8.g.i(parcel, readInt11);
                            break;
                        case 11:
                            c5110a = (C5110a) t8.g.h(parcel, readInt11, C5110a.CREATOR);
                            break;
                        case '\f':
                            bundle4 = t8.g.f(parcel, readInt11);
                            break;
                        case '\r':
                            i23 = t8.g.z(parcel, readInt11);
                            break;
                        case 14:
                            arrayList = t8.g.k(parcel, readInt11);
                            break;
                        case 15:
                            bundle5 = t8.g.f(parcel, readInt11);
                            break;
                        case 16:
                            z18 = t8.g.x(parcel, readInt11);
                            break;
                        case 17:
                        case 22:
                        case 23:
                        case 24:
                        case ' ':
                        case com.anythink.basead.b.b.j.f5806M /* 38 */:
                        case '>':
                        default:
                            t8.g.G(parcel, readInt11);
                            break;
                        case 18:
                            i24 = t8.g.z(parcel, readInt11);
                            break;
                        case 19:
                            i25 = t8.g.z(parcel, readInt11);
                            break;
                        case 20:
                            t8.g.K(parcel, readInt11, 4);
                            f3 = parcel.readFloat();
                            break;
                        case 21:
                            str16 = t8.g.i(parcel, readInt11);
                            break;
                        case 25:
                            j12 = t8.g.A(parcel, readInt11);
                            break;
                        case 26:
                            str17 = t8.g.i(parcel, readInt11);
                            break;
                        case 27:
                            arrayList2 = t8.g.k(parcel, readInt11);
                            break;
                        case 28:
                            str18 = t8.g.i(parcel, readInt11);
                            break;
                        case 29:
                            c3462kb = (C3462kb) t8.g.h(parcel, readInt11, C3462kb.CREATOR);
                            break;
                        case 30:
                            arrayList3 = t8.g.k(parcel, readInt11);
                            break;
                        case 31:
                            j13 = t8.g.A(parcel, readInt11);
                            break;
                        case '!':
                            str19 = t8.g.i(parcel, readInt11);
                            break;
                        case '\"':
                            t8.g.K(parcel, readInt11, 4);
                            f9 = parcel.readFloat();
                            break;
                        case '#':
                            i26 = t8.g.z(parcel, readInt11);
                            break;
                        case '$':
                            i27 = t8.g.z(parcel, readInt11);
                            break;
                        case '%':
                            z20 = t8.g.x(parcel, readInt11);
                            break;
                        case '\'':
                            str20 = t8.g.i(parcel, readInt11);
                            break;
                        case com.anythink.basead.b.b.j.f5808O /* 40 */:
                            z19 = t8.g.x(parcel, readInt11);
                            break;
                        case ')':
                            str21 = t8.g.i(parcel, readInt11);
                            break;
                        case '*':
                            z21 = t8.g.x(parcel, readInt11);
                            break;
                        case com.anythink.basead.b.b.j.f5811R /* 43 */:
                            i28 = t8.g.z(parcel, readInt11);
                            break;
                        case com.anythink.basead.b.b.j.f5812S /* 44 */:
                            bundle6 = t8.g.f(parcel, readInt11);
                            break;
                        case com.anythink.basead.b.b.j.f5813T /* 45 */:
                            str22 = t8.g.i(parcel, readInt11);
                            break;
                        case '.':
                            d02 = (q2.D0) t8.g.h(parcel, readInt11, q2.D0.CREATOR);
                            break;
                        case '/':
                            z22 = t8.g.x(parcel, readInt11);
                            break;
                        case com.anythink.basead.b.b.j.f5816W /* 48 */:
                            bundle7 = t8.g.f(parcel, readInt11);
                            break;
                        case com.anythink.basead.b.b.j.f5817X /* 49 */:
                            str23 = t8.g.i(parcel, readInt11);
                            break;
                        case '2':
                            str24 = t8.g.i(parcel, readInt11);
                            break;
                        case '3':
                            str25 = t8.g.i(parcel, readInt11);
                            break;
                        case '4':
                            z23 = t8.g.x(parcel, readInt11);
                            break;
                        case com.anythink.core.common.n.a.i.f14823d /* 53 */:
                            int B9 = t8.g.B(parcel, readInt11);
                            int dataPosition = parcel.dataPosition();
                            if (B9 == 0) {
                                arrayList4 = null;
                                break;
                            } else {
                                ArrayList arrayList7 = new ArrayList();
                                int readInt12 = parcel.readInt();
                                for (int i30 = 0; i30 < readInt12; i30++) {
                                    arrayList7.add(Integer.valueOf(parcel.readInt()));
                                }
                                parcel.setDataPosition(dataPosition + B9);
                                arrayList4 = arrayList7;
                                break;
                            }
                        case '6':
                            str26 = t8.g.i(parcel, readInt11);
                            break;
                        case '7':
                            arrayList5 = t8.g.k(parcel, readInt11);
                            break;
                        case p.a.f19679e /* 56 */:
                            i29 = t8.g.z(parcel, readInt11);
                            break;
                        case '9':
                            z24 = t8.g.x(parcel, readInt11);
                            break;
                        case ':':
                            z25 = t8.g.x(parcel, readInt11);
                            break;
                        case j.v.f12591n /* 59 */:
                            z26 = t8.g.x(parcel, readInt11);
                            break;
                        case '<':
                            arrayList6 = t8.g.k(parcel, readInt11);
                            break;
                        case '=':
                            str27 = t8.g.i(parcel, readInt11);
                            break;
                        case '?':
                            c2550Fc = (C2550Fc) t8.g.h(parcel, readInt11, C2550Fc.CREATOR);
                            break;
                        case '@':
                            str28 = t8.g.i(parcel, readInt11);
                            break;
                        case j.v.f12576G /* 65 */:
                            bundle8 = t8.g.f(parcel, readInt11);
                            break;
                    }
                }
                t8.g.n(parcel, H18);
                return new C2569Ge(i22, bundle3, c1Var, f1Var, str12, applicationInfo, packageInfo, str13, str14, str15, c5110a, bundle4, i23, arrayList, bundle5, z18, i24, i25, f3, str16, j12, str17, arrayList2, str18, c3462kb, arrayList3, j13, str19, f9, z19, i26, i27, z20, str20, str21, z21, i28, bundle6, str22, d02, z22, bundle7, str23, str24, str25, z23, arrayList4, str26, arrayList5, i29, z24, z25, z26, arrayList6, str27, c2550Fc, str28, bundle8);
            case 11:
                int H19 = t8.g.H(parcel);
                ArrayList arrayList8 = null;
                boolean z27 = false;
                while (parcel.dataPosition() < H19) {
                    int readInt13 = parcel.readInt();
                    char c16 = (char) readInt13;
                    if (c16 == 2) {
                        z27 = t8.g.x(parcel, readInt13);
                    } else if (c16 != 3) {
                        t8.g.G(parcel, readInt13);
                    } else {
                        arrayList8 = t8.g.k(parcel, readInt13);
                    }
                }
                t8.g.n(parcel, H19);
                return new C2586He(z27, arrayList8);
            case 12:
                int H20 = t8.g.H(parcel);
                String str29 = null;
                while (parcel.dataPosition() < H20) {
                    int readInt14 = parcel.readInt();
                    if (((char) readInt14) != 1) {
                        t8.g.G(parcel, readInt14);
                    } else {
                        str29 = t8.g.i(parcel, readInt14);
                    }
                }
                t8.g.n(parcel, H20);
                return new C2603Ie(str29);
            case 13:
                int H21 = t8.g.H(parcel);
                Bundle bundle9 = null;
                C5110a c5110a2 = null;
                ApplicationInfo applicationInfo2 = null;
                String str30 = null;
                ArrayList arrayList9 = null;
                PackageInfo packageInfo2 = null;
                String str31 = null;
                String str32 = null;
                C3966tu c3966tu = null;
                String str33 = null;
                Bundle bundle10 = null;
                boolean z28 = false;
                boolean z29 = false;
                while (parcel.dataPosition() < H21) {
                    int readInt15 = parcel.readInt();
                    switch ((char) readInt15) {
                        case 1:
                            bundle9 = t8.g.f(parcel, readInt15);
                            break;
                        case 2:
                            c5110a2 = (C5110a) t8.g.h(parcel, readInt15, C5110a.CREATOR);
                            break;
                        case 3:
                            applicationInfo2 = (ApplicationInfo) t8.g.h(parcel, readInt15, ApplicationInfo.CREATOR);
                            break;
                        case 4:
                            str30 = t8.g.i(parcel, readInt15);
                            break;
                        case 5:
                            arrayList9 = t8.g.k(parcel, readInt15);
                            break;
                        case 6:
                            packageInfo2 = (PackageInfo) t8.g.h(parcel, readInt15, PackageInfo.CREATOR);
                            break;
                        case 7:
                            str31 = t8.g.i(parcel, readInt15);
                            break;
                        case '\b':
                        default:
                            t8.g.G(parcel, readInt15);
                            break;
                        case '\t':
                            str32 = t8.g.i(parcel, readInt15);
                            break;
                        case '\n':
                            c3966tu = (C3966tu) t8.g.h(parcel, readInt15, C3966tu.CREATOR);
                            break;
                        case 11:
                            str33 = t8.g.i(parcel, readInt15);
                            break;
                        case '\f':
                            z28 = t8.g.x(parcel, readInt15);
                            break;
                        case '\r':
                            z29 = t8.g.x(parcel, readInt15);
                            break;
                        case 14:
                            bundle10 = t8.g.f(parcel, readInt15);
                            break;
                    }
                }
                t8.g.n(parcel, H21);
                return new C2739Qe(bundle9, c5110a2, applicationInfo2, str30, arrayList9, packageInfo2, str31, str32, c3966tu, str33, z28, z29, bundle10);
            case 14:
                int H22 = t8.g.H(parcel);
                q2.c1 c1Var2 = null;
                String str34 = null;
                while (parcel.dataPosition() < H22) {
                    int readInt16 = parcel.readInt();
                    char c17 = (char) readInt16;
                    if (c17 == 2) {
                        c1Var2 = (q2.c1) t8.g.h(parcel, readInt16, q2.c1.CREATOR);
                    } else if (c17 != 3) {
                        t8.g.G(parcel, readInt16);
                    } else {
                        str34 = t8.g.i(parcel, readInt16);
                    }
                }
                t8.g.n(parcel, H22);
                return new C2885Ze(str34, c1Var2);
            case 15:
                int H23 = t8.g.H(parcel);
                int i31 = 0;
                String str35 = null;
                while (parcel.dataPosition() < H23) {
                    int readInt17 = parcel.readInt();
                    char c18 = (char) readInt17;
                    if (c18 == 2) {
                        str35 = t8.g.i(parcel, readInt17);
                    } else if (c18 != 3) {
                        t8.g.G(parcel, readInt17);
                    } else {
                        i31 = t8.g.z(parcel, readInt17);
                    }
                }
                t8.g.n(parcel, H23);
                return new C3091df(str35, i31);
            case 16:
                int H24 = t8.g.H(parcel);
                String str36 = null;
                String str37 = null;
                while (parcel.dataPosition() < H24) {
                    int readInt18 = parcel.readInt();
                    char c19 = (char) readInt18;
                    if (c19 == 1) {
                        str36 = t8.g.i(parcel, readInt18);
                    } else if (c19 != 2) {
                        t8.g.G(parcel, readInt18);
                    } else {
                        str37 = t8.g.i(parcel, readInt18);
                    }
                }
                t8.g.n(parcel, H24);
                return new C4005uf(str36, str37);
            case 17:
                int H25 = t8.g.H(parcel);
                String str38 = null;
                String str39 = null;
                ArrayList arrayList10 = null;
                ArrayList arrayList11 = null;
                boolean z30 = false;
                boolean z31 = false;
                boolean z32 = false;
                boolean z33 = false;
                while (parcel.dataPosition() < H25) {
                    int readInt19 = parcel.readInt();
                    switch ((char) readInt19) {
                        case 2:
                            str38 = t8.g.i(parcel, readInt19);
                            break;
                        case 3:
                            str39 = t8.g.i(parcel, readInt19);
                            break;
                        case 4:
                            z30 = t8.g.x(parcel, readInt19);
                            break;
                        case 5:
                            z31 = t8.g.x(parcel, readInt19);
                            break;
                        case 6:
                            arrayList10 = t8.g.k(parcel, readInt19);
                            break;
                        case 7:
                            z32 = t8.g.x(parcel, readInt19);
                            break;
                        case '\b':
                            z33 = t8.g.x(parcel, readInt19);
                            break;
                        case '\t':
                            arrayList11 = t8.g.k(parcel, readInt19);
                            break;
                        default:
                            t8.g.G(parcel, readInt19);
                            break;
                    }
                }
                t8.g.n(parcel, H25);
                return new C4275zf(str38, str39, z30, z31, arrayList10, z32, z33, arrayList11);
            case 18:
                int H26 = t8.g.H(parcel);
                String str40 = null;
                String str41 = null;
                q2.f1 f1Var2 = null;
                q2.c1 c1Var3 = null;
                while (parcel.dataPosition() < H26) {
                    int readInt20 = parcel.readInt();
                    char c20 = (char) readInt20;
                    if (c20 == 1) {
                        str40 = t8.g.i(parcel, readInt20);
                    } else if (c20 == 2) {
                        str41 = t8.g.i(parcel, readInt20);
                    } else if (c20 == 3) {
                        f1Var2 = (q2.f1) t8.g.h(parcel, readInt20, q2.f1.CREATOR);
                    } else if (c20 != 4) {
                        t8.g.G(parcel, readInt20);
                    } else {
                        c1Var3 = (q2.c1) t8.g.h(parcel, readInt20, q2.c1.CREATOR);
                    }
                }
                t8.g.n(parcel, H26);
                return new C2838Wf(str40, str41, f1Var2, c1Var3);
            case 19:
                int H27 = t8.g.H(parcel);
                int i32 = 0;
                int i33 = 0;
                int i34 = 0;
                int i35 = 0;
                int i36 = 0;
                int i37 = 0;
                String str42 = null;
                while (parcel.dataPosition() < H27) {
                    int readInt21 = parcel.readInt();
                    switch ((char) readInt21) {
                        case 1:
                            i32 = t8.g.z(parcel, readInt21);
                            break;
                        case 2:
                            i33 = t8.g.z(parcel, readInt21);
                            break;
                        case 3:
                            i34 = t8.g.z(parcel, readInt21);
                            break;
                        case 4:
                            i35 = t8.g.z(parcel, readInt21);
                            break;
                        case 5:
                            str42 = t8.g.i(parcel, readInt21);
                            break;
                        case 6:
                            i36 = t8.g.z(parcel, readInt21);
                            break;
                        case 7:
                            i37 = t8.g.z(parcel, readInt21);
                            break;
                        default:
                            t8.g.G(parcel, readInt21);
                            break;
                    }
                }
                t8.g.n(parcel, H27);
                return new C3966tu(i32, i33, i34, i35, str42, i36, i37);
            case 20:
                int H28 = t8.g.H(parcel);
                byte[] bArr2 = null;
                int i38 = 0;
                while (parcel.dataPosition() < H28) {
                    int readInt22 = parcel.readInt();
                    char c21 = (char) readInt22;
                    if (c21 == 1) {
                        i38 = t8.g.z(parcel, readInt22);
                    } else if (c21 != 2) {
                        t8.g.G(parcel, readInt22);
                    } else {
                        bArr2 = t8.g.g(parcel, readInt22);
                    }
                }
                t8.g.n(parcel, H28);
                return new Pw(i38, bArr2);
            case 21:
                int H29 = t8.g.H(parcel);
                String str43 = null;
                int i39 = 0;
                String str44 = null;
                while (parcel.dataPosition() < H29) {
                    int readInt23 = parcel.readInt();
                    char c22 = (char) readInt23;
                    if (c22 == 1) {
                        i39 = t8.g.z(parcel, readInt23);
                    } else if (c22 == 2) {
                        str43 = t8.g.i(parcel, readInt23);
                    } else if (c22 != 3) {
                        t8.g.G(parcel, readInt23);
                    } else {
                        str44 = t8.g.i(parcel, readInt23);
                    }
                }
                t8.g.n(parcel, H29);
                return new Rw(i39, str43, str44);
            case 22:
                int H30 = t8.g.H(parcel);
                byte[] bArr3 = null;
                int i40 = 0;
                while (parcel.dataPosition() < H30) {
                    int readInt24 = parcel.readInt();
                    char c23 = (char) readInt24;
                    if (c23 == 1) {
                        i40 = t8.g.z(parcel, readInt24);
                    } else if (c23 != 2) {
                        t8.g.G(parcel, readInt24);
                    } else {
                        bArr3 = t8.g.g(parcel, readInt24);
                    }
                }
                t8.g.n(parcel, H30);
                return new Sw(i40, bArr3);
            case 23:
                int H31 = t8.g.H(parcel);
                String str45 = null;
                String str46 = null;
                int i41 = 0;
                int i42 = 0;
                int i43 = 0;
                while (parcel.dataPosition() < H31) {
                    int readInt25 = parcel.readInt();
                    char c24 = (char) readInt25;
                    if (c24 == 1) {
                        i41 = t8.g.z(parcel, readInt25);
                    } else if (c24 == 2) {
                        i42 = t8.g.z(parcel, readInt25);
                    } else if (c24 == 3) {
                        str45 = t8.g.i(parcel, readInt25);
                    } else if (c24 == 4) {
                        str46 = t8.g.i(parcel, readInt25);
                    } else if (c24 != 5) {
                        t8.g.G(parcel, readInt25);
                    } else {
                        i43 = t8.g.z(parcel, readInt25);
                    }
                }
                t8.g.n(parcel, H31);
                return new Vw(i41, i42, i43, str45, str46);
            case 24:
                int H32 = t8.g.H(parcel);
                int i44 = 0;
                byte[] bArr4 = null;
                int i45 = 0;
                while (parcel.dataPosition() < H32) {
                    int readInt26 = parcel.readInt();
                    char c25 = (char) readInt26;
                    if (c25 == 1) {
                        i44 = t8.g.z(parcel, readInt26);
                    } else if (c25 == 2) {
                        bArr4 = t8.g.g(parcel, readInt26);
                    } else if (c25 != 3) {
                        t8.g.G(parcel, readInt26);
                    } else {
                        i45 = t8.g.z(parcel, readInt26);
                    }
                }
                t8.g.n(parcel, H32);
                return new Ww(bArr4, i44, i45);
            case 25:
                return new EO(parcel);
            default:
                return new AO(parcel);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        switch (this.f28096a) {
            case 0:
                return new U8[i];
            case 1:
                return new X8[i];
            case 2:
                return new C3462kb[i];
            case 3:
                return new C3948tc[i];
            case 4:
                return new C4002uc[i];
            case 5:
                return new C4272zc[i];
            case 6:
                return new C2533Ec[i];
            case 7:
                return new C2550Fc[i];
            case 8:
                return new C2804Ud[i];
            case 9:
                return new C2467Ae[i];
            case 10:
                return new C2569Ge[i];
            case 11:
                return new C2586He[i];
            case 12:
                return new C2603Ie[i];
            case 13:
                return new C2739Qe[i];
            case 14:
                return new C2885Ze[i];
            case 15:
                return new C3091df[i];
            case 16:
                return new C4005uf[i];
            case 17:
                return new C4275zf[i];
            case 18:
                return new C2838Wf[i];
            case 19:
                return new C3966tu[i];
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
