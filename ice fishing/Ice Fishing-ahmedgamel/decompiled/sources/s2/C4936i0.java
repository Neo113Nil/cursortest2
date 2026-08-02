package s2;

import android.location.Location;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* renamed from: s2.i0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4936i0 implements Parcelable.Creator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f40475a;

    public /* synthetic */ C4936i0(int i) {
        this.f40475a = i;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f40475a) {
            case 0:
                int L2 = com.bumptech.glide.d.L(parcel);
                String str = null;
                String str2 = null;
                while (parcel.dataPosition() < L2) {
                    int readInt = parcel.readInt();
                    char c9 = (char) readInt;
                    if (c9 == 1) {
                        str = com.bumptech.glide.d.l(parcel, readInt);
                    } else if (c9 != 2) {
                        com.bumptech.glide.d.J(parcel, readInt);
                    } else {
                        str2 = com.bumptech.glide.d.l(parcel, readInt);
                    }
                }
                com.bumptech.glide.d.p(parcel, L2);
                return new O(str, str2);
            case 1:
                int L6 = com.bumptech.glide.d.L(parcel);
                int i = 0;
                while (parcel.dataPosition() < L6) {
                    int readInt2 = parcel.readInt();
                    if (((char) readInt2) != 2) {
                        com.bumptech.glide.d.J(parcel, readInt2);
                    } else {
                        i = com.bumptech.glide.d.B(parcel, readInt2);
                    }
                }
                com.bumptech.glide.d.p(parcel, L6);
                return new D0(i);
            case 2:
                int L8 = com.bumptech.glide.d.L(parcel);
                String str3 = null;
                String str4 = null;
                C4969z0 c4969z0 = null;
                IBinder iBinder = null;
                int i4 = 0;
                while (parcel.dataPosition() < L8) {
                    int readInt3 = parcel.readInt();
                    char c10 = (char) readInt3;
                    if (c10 == 1) {
                        i4 = com.bumptech.glide.d.B(parcel, readInt3);
                    } else if (c10 == 2) {
                        str3 = com.bumptech.glide.d.l(parcel, readInt3);
                    } else if (c10 == 3) {
                        str4 = com.bumptech.glide.d.l(parcel, readInt3);
                    } else if (c10 == 4) {
                        c4969z0 = (C4969z0) com.bumptech.glide.d.k(parcel, readInt3, C4969z0.CREATOR);
                    } else if (c10 != 5) {
                        com.bumptech.glide.d.J(parcel, readInt3);
                    } else {
                        iBinder = com.bumptech.glide.d.A(parcel, readInt3);
                    }
                }
                com.bumptech.glide.d.p(parcel, L8);
                return new C4969z0(i4, str3, str4, c4969z0, iBinder);
            case 3:
                int L9 = com.bumptech.glide.d.L(parcel);
                String str5 = null;
                int i6 = 0;
                int i9 = 0;
                while (parcel.dataPosition() < L9) {
                    int readInt4 = parcel.readInt();
                    char c11 = (char) readInt4;
                    if (c11 == 1) {
                        i6 = com.bumptech.glide.d.B(parcel, readInt4);
                    } else if (c11 == 2) {
                        i9 = com.bumptech.glide.d.B(parcel, readInt4);
                    } else if (c11 != 3) {
                        com.bumptech.glide.d.J(parcel, readInt4);
                    } else {
                        str5 = com.bumptech.glide.d.l(parcel, readInt4);
                    }
                }
                com.bumptech.glide.d.p(parcel, L9);
                return new M0(i6, i9, str5);
            case 4:
                int L10 = com.bumptech.glide.d.L(parcel);
                int i10 = 0;
                int i11 = 0;
                boolean z6 = false;
                String str6 = null;
                c1 c1Var = null;
                while (parcel.dataPosition() < L10) {
                    int readInt5 = parcel.readInt();
                    char c12 = (char) readInt5;
                    if (c12 == 1) {
                        str6 = com.bumptech.glide.d.l(parcel, readInt5);
                    } else if (c12 == 2) {
                        i10 = com.bumptech.glide.d.B(parcel, readInt5);
                    } else if (c12 == 3) {
                        c1Var = (c1) com.bumptech.glide.d.k(parcel, readInt5, c1.CREATOR);
                    } else if (c12 == 4) {
                        i11 = com.bumptech.glide.d.B(parcel, readInt5);
                    } else if (c12 != 5) {
                        com.bumptech.glide.d.J(parcel, readInt5);
                    } else {
                        z6 = com.bumptech.glide.d.z(parcel, readInt5);
                    }
                }
                com.bumptech.glide.d.p(parcel, L10);
                return new V0(str6, i10, c1Var, i11, z6);
            case 5:
                int L11 = com.bumptech.glide.d.L(parcel);
                int i12 = 0;
                int i13 = 0;
                while (parcel.dataPosition() < L11) {
                    int readInt6 = parcel.readInt();
                    char c13 = (char) readInt6;
                    if (c13 == 1) {
                        i12 = com.bumptech.glide.d.B(parcel, readInt6);
                    } else if (c13 != 2) {
                        com.bumptech.glide.d.J(parcel, readInt6);
                    } else {
                        i13 = com.bumptech.glide.d.B(parcel, readInt6);
                    }
                }
                com.bumptech.glide.d.p(parcel, L11);
                return new W0(i12, i13);
            case 6:
                int L12 = com.bumptech.glide.d.L(parcel);
                String str7 = null;
                while (parcel.dataPosition() < L12) {
                    int readInt7 = parcel.readInt();
                    if (((char) readInt7) != 15) {
                        com.bumptech.glide.d.J(parcel, readInt7);
                    } else {
                        str7 = com.bumptech.glide.d.l(parcel, readInt7);
                    }
                }
                com.bumptech.glide.d.p(parcel, L12);
                return new X0(str7);
            case 7:
                int L13 = com.bumptech.glide.d.L(parcel);
                boolean z9 = false;
                boolean z10 = false;
                boolean z11 = false;
                while (parcel.dataPosition() < L13) {
                    int readInt8 = parcel.readInt();
                    char c14 = (char) readInt8;
                    if (c14 == 2) {
                        z9 = com.bumptech.glide.d.z(parcel, readInt8);
                    } else if (c14 == 3) {
                        z10 = com.bumptech.glide.d.z(parcel, readInt8);
                    } else if (c14 != 4) {
                        com.bumptech.glide.d.J(parcel, readInt8);
                    } else {
                        z11 = com.bumptech.glide.d.z(parcel, readInt8);
                    }
                }
                com.bumptech.glide.d.p(parcel, L13);
                return new Z0(z9, z10, z11);
            case 8:
                int L14 = com.bumptech.glide.d.L(parcel);
                int i14 = 0;
                int i15 = 0;
                boolean z12 = false;
                int i16 = 0;
                boolean z13 = false;
                boolean z14 = false;
                int i17 = 0;
                int i18 = 0;
                int i19 = 0;
                int i20 = 0;
                long j6 = 0;
                long j9 = 0;
                long j10 = 0;
                Bundle bundle = null;
                ArrayList arrayList = null;
                String str8 = null;
                X0 x02 = null;
                Location location = null;
                String str9 = null;
                Bundle bundle2 = null;
                Bundle bundle3 = null;
                ArrayList arrayList2 = null;
                String str10 = null;
                String str11 = null;
                O o4 = null;
                String str12 = null;
                ArrayList arrayList3 = null;
                String str13 = null;
                while (parcel.dataPosition() < L14) {
                    int readInt9 = parcel.readInt();
                    switch ((char) readInt9) {
                        case 1:
                            i14 = com.bumptech.glide.d.B(parcel, readInt9);
                            break;
                        case 2:
                            j6 = com.bumptech.glide.d.C(parcel, readInt9);
                            break;
                        case 3:
                            bundle = com.bumptech.glide.d.i(parcel, readInt9);
                            break;
                        case 4:
                            i15 = com.bumptech.glide.d.B(parcel, readInt9);
                            break;
                        case 5:
                            arrayList = com.bumptech.glide.d.n(parcel, readInt9);
                            break;
                        case 6:
                            z12 = com.bumptech.glide.d.z(parcel, readInt9);
                            break;
                        case 7:
                            i16 = com.bumptech.glide.d.B(parcel, readInt9);
                            break;
                        case '\b':
                            z13 = com.bumptech.glide.d.z(parcel, readInt9);
                            break;
                        case '\t':
                            str8 = com.bumptech.glide.d.l(parcel, readInt9);
                            break;
                        case '\n':
                            x02 = (X0) com.bumptech.glide.d.k(parcel, readInt9, X0.CREATOR);
                            break;
                        case 11:
                            location = (Location) com.bumptech.glide.d.k(parcel, readInt9, Location.CREATOR);
                            break;
                        case '\f':
                            str9 = com.bumptech.glide.d.l(parcel, readInt9);
                            break;
                        case '\r':
                            bundle2 = com.bumptech.glide.d.i(parcel, readInt9);
                            break;
                        case 14:
                            bundle3 = com.bumptech.glide.d.i(parcel, readInt9);
                            break;
                        case 15:
                            arrayList2 = com.bumptech.glide.d.n(parcel, readInt9);
                            break;
                        case 16:
                            str10 = com.bumptech.glide.d.l(parcel, readInt9);
                            break;
                        case 17:
                            str11 = com.bumptech.glide.d.l(parcel, readInt9);
                            break;
                        case 18:
                            z14 = com.bumptech.glide.d.z(parcel, readInt9);
                            break;
                        case 19:
                            o4 = (O) com.bumptech.glide.d.k(parcel, readInt9, O.CREATOR);
                            break;
                        case 20:
                            i17 = com.bumptech.glide.d.B(parcel, readInt9);
                            break;
                        case 21:
                            str12 = com.bumptech.glide.d.l(parcel, readInt9);
                            break;
                        case 22:
                            arrayList3 = com.bumptech.glide.d.n(parcel, readInt9);
                            break;
                        case 23:
                            i18 = com.bumptech.glide.d.B(parcel, readInt9);
                            break;
                        case 24:
                            str13 = com.bumptech.glide.d.l(parcel, readInt9);
                            break;
                        case 25:
                            i19 = com.bumptech.glide.d.B(parcel, readInt9);
                            break;
                        case 26:
                            j9 = com.bumptech.glide.d.C(parcel, readInt9);
                            break;
                        case 27:
                            j10 = com.bumptech.glide.d.C(parcel, readInt9);
                            break;
                        case 28:
                            i20 = com.bumptech.glide.d.B(parcel, readInt9);
                            break;
                        default:
                            com.bumptech.glide.d.J(parcel, readInt9);
                            break;
                    }
                }
                com.bumptech.glide.d.p(parcel, L14);
                return new c1(i14, j6, bundle, i15, arrayList, z12, i16, z13, str8, x02, location, str9, bundle2, bundle3, arrayList2, str10, str11, z14, o4, i17, str12, arrayList3, i18, str13, i19, j9, j10, i20);
            case 9:
                int L15 = com.bumptech.glide.d.L(parcel);
                int i21 = 0;
                int i22 = 0;
                boolean z15 = false;
                int i23 = 0;
                int i24 = 0;
                boolean z16 = false;
                boolean z17 = false;
                boolean z18 = false;
                boolean z19 = false;
                boolean z20 = false;
                boolean z21 = false;
                boolean z22 = false;
                boolean z23 = false;
                boolean z24 = false;
                String str14 = null;
                f1[] f1VarArr = null;
                while (parcel.dataPosition() < L15) {
                    int readInt10 = parcel.readInt();
                    switch ((char) readInt10) {
                        case 2:
                            str14 = com.bumptech.glide.d.l(parcel, readInt10);
                            break;
                        case 3:
                            i21 = com.bumptech.glide.d.B(parcel, readInt10);
                            break;
                        case 4:
                            i22 = com.bumptech.glide.d.B(parcel, readInt10);
                            break;
                        case 5:
                            z15 = com.bumptech.glide.d.z(parcel, readInt10);
                            break;
                        case 6:
                            i23 = com.bumptech.glide.d.B(parcel, readInt10);
                            break;
                        case 7:
                            i24 = com.bumptech.glide.d.B(parcel, readInt10);
                            break;
                        case '\b':
                            f1VarArr = (f1[]) com.bumptech.glide.d.o(parcel, readInt10, f1.CREATOR);
                            break;
                        case '\t':
                            z16 = com.bumptech.glide.d.z(parcel, readInt10);
                            break;
                        case '\n':
                            z17 = com.bumptech.glide.d.z(parcel, readInt10);
                            break;
                        case 11:
                            z18 = com.bumptech.glide.d.z(parcel, readInt10);
                            break;
                        case '\f':
                            z19 = com.bumptech.glide.d.z(parcel, readInt10);
                            break;
                        case '\r':
                            z20 = com.bumptech.glide.d.z(parcel, readInt10);
                            break;
                        case 14:
                            z21 = com.bumptech.glide.d.z(parcel, readInt10);
                            break;
                        case 15:
                            z22 = com.bumptech.glide.d.z(parcel, readInt10);
                            break;
                        case 16:
                            z23 = com.bumptech.glide.d.z(parcel, readInt10);
                            break;
                        case 17:
                            z24 = com.bumptech.glide.d.z(parcel, readInt10);
                            break;
                        default:
                            com.bumptech.glide.d.J(parcel, readInt10);
                            break;
                    }
                }
                com.bumptech.glide.d.p(parcel, L15);
                return new f1(str14, i21, i22, z15, i23, i24, f1VarArr, z16, z17, z18, z19, z20, z21, z22, z23, z24);
            case 10:
                int L16 = com.bumptech.glide.d.L(parcel);
                long j11 = 0;
                String str15 = null;
                int i25 = 0;
                int i26 = 0;
                while (parcel.dataPosition() < L16) {
                    int readInt11 = parcel.readInt();
                    char c15 = (char) readInt11;
                    if (c15 == 1) {
                        i25 = com.bumptech.glide.d.B(parcel, readInt11);
                    } else if (c15 == 2) {
                        i26 = com.bumptech.glide.d.B(parcel, readInt11);
                    } else if (c15 == 3) {
                        str15 = com.bumptech.glide.d.l(parcel, readInt11);
                    } else if (c15 != 4) {
                        com.bumptech.glide.d.J(parcel, readInt11);
                    } else {
                        j11 = com.bumptech.glide.d.C(parcel, readInt11);
                    }
                }
                com.bumptech.glide.d.p(parcel, L16);
                return new g1(i25, i26, str15, j11);
            case 11:
                int L17 = com.bumptech.glide.d.L(parcel);
                String str16 = null;
                C4969z0 c4969z02 = null;
                Bundle bundle4 = null;
                String str17 = null;
                String str18 = null;
                String str19 = null;
                String str20 = null;
                long j12 = 0;
                while (parcel.dataPosition() < L17) {
                    int readInt12 = parcel.readInt();
                    switch ((char) readInt12) {
                        case 1:
                            str16 = com.bumptech.glide.d.l(parcel, readInt12);
                            break;
                        case 2:
                            j12 = com.bumptech.glide.d.C(parcel, readInt12);
                            break;
                        case 3:
                            c4969z02 = (C4969z0) com.bumptech.glide.d.k(parcel, readInt12, C4969z0.CREATOR);
                            break;
                        case 4:
                            bundle4 = com.bumptech.glide.d.i(parcel, readInt12);
                            break;
                        case 5:
                            str17 = com.bumptech.glide.d.l(parcel, readInt12);
                            break;
                        case 6:
                            str18 = com.bumptech.glide.d.l(parcel, readInt12);
                            break;
                        case 7:
                            str19 = com.bumptech.glide.d.l(parcel, readInt12);
                            break;
                        case '\b':
                            str20 = com.bumptech.glide.d.l(parcel, readInt12);
                            break;
                        default:
                            com.bumptech.glide.d.J(parcel, readInt12);
                            break;
                    }
                }
                com.bumptech.glide.d.p(parcel, L17);
                return new h1(str16, j12, c4969z02, bundle4, str17, str18, str19, str20);
            default:
                int L18 = com.bumptech.glide.d.L(parcel);
                int i27 = 0;
                while (parcel.dataPosition() < L18) {
                    int readInt13 = parcel.readInt();
                    if (((char) readInt13) != 2) {
                        com.bumptech.glide.d.J(parcel, readInt13);
                    } else {
                        i27 = com.bumptech.glide.d.B(parcel, readInt13);
                    }
                }
                com.bumptech.glide.d.p(parcel, L18);
                return new i1(i27);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        switch (this.f40475a) {
            case 0:
                return new O[i];
            case 1:
                return new D0[i];
            case 2:
                return new C4969z0[i];
            case 3:
                return new M0[i];
            case 4:
                return new V0[i];
            case 5:
                return new W0[i];
            case 6:
                return new X0[i];
            case 7:
                return new Z0[i];
            case 8:
                return new c1[i];
            case 9:
                return new f1[i];
            case 10:
                return new g1[i];
            case 11:
                return new h1[i];
            default:
                return new i1[i];
        }
    }
}
