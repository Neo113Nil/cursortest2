package q2;

import android.location.Location;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* renamed from: q2.i0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4887i0 implements Parcelable.Creator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f40176a;

    public /* synthetic */ C4887i0(int i) {
        this.f40176a = i;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f40176a) {
            case 0:
                int H8 = t8.g.H(parcel);
                String str = null;
                String str2 = null;
                while (parcel.dataPosition() < H8) {
                    int readInt = parcel.readInt();
                    char c9 = (char) readInt;
                    if (c9 == 1) {
                        str = t8.g.i(parcel, readInt);
                    } else if (c9 != 2) {
                        t8.g.G(parcel, readInt);
                    } else {
                        str2 = t8.g.i(parcel, readInt);
                    }
                }
                t8.g.n(parcel, H8);
                return new O(str, str2);
            case 1:
                int H9 = t8.g.H(parcel);
                int i = 0;
                while (parcel.dataPosition() < H9) {
                    int readInt2 = parcel.readInt();
                    if (((char) readInt2) != 2) {
                        t8.g.G(parcel, readInt2);
                    } else {
                        i = t8.g.z(parcel, readInt2);
                    }
                }
                t8.g.n(parcel, H9);
                return new D0(i);
            case 2:
                int H10 = t8.g.H(parcel);
                String str3 = null;
                String str4 = null;
                C4920z0 c4920z0 = null;
                IBinder iBinder = null;
                int i6 = 0;
                while (parcel.dataPosition() < H10) {
                    int readInt3 = parcel.readInt();
                    char c10 = (char) readInt3;
                    if (c10 == 1) {
                        i6 = t8.g.z(parcel, readInt3);
                    } else if (c10 == 2) {
                        str3 = t8.g.i(parcel, readInt3);
                    } else if (c10 == 3) {
                        str4 = t8.g.i(parcel, readInt3);
                    } else if (c10 == 4) {
                        c4920z0 = (C4920z0) t8.g.h(parcel, readInt3, C4920z0.CREATOR);
                    } else if (c10 != 5) {
                        t8.g.G(parcel, readInt3);
                    } else {
                        iBinder = t8.g.y(parcel, readInt3);
                    }
                }
                t8.g.n(parcel, H10);
                return new C4920z0(i6, str3, str4, c4920z0, iBinder);
            case 3:
                int H11 = t8.g.H(parcel);
                String str5 = null;
                int i9 = 0;
                int i10 = 0;
                while (parcel.dataPosition() < H11) {
                    int readInt4 = parcel.readInt();
                    char c11 = (char) readInt4;
                    if (c11 == 1) {
                        i9 = t8.g.z(parcel, readInt4);
                    } else if (c11 == 2) {
                        i10 = t8.g.z(parcel, readInt4);
                    } else if (c11 != 3) {
                        t8.g.G(parcel, readInt4);
                    } else {
                        str5 = t8.g.i(parcel, readInt4);
                    }
                }
                t8.g.n(parcel, H11);
                return new M0(i9, i10, str5);
            case 4:
                int H12 = t8.g.H(parcel);
                int i11 = 0;
                int i12 = 0;
                boolean z3 = false;
                String str6 = null;
                c1 c1Var = null;
                while (parcel.dataPosition() < H12) {
                    int readInt5 = parcel.readInt();
                    char c12 = (char) readInt5;
                    if (c12 == 1) {
                        str6 = t8.g.i(parcel, readInt5);
                    } else if (c12 == 2) {
                        i11 = t8.g.z(parcel, readInt5);
                    } else if (c12 == 3) {
                        c1Var = (c1) t8.g.h(parcel, readInt5, c1.CREATOR);
                    } else if (c12 == 4) {
                        i12 = t8.g.z(parcel, readInt5);
                    } else if (c12 != 5) {
                        t8.g.G(parcel, readInt5);
                    } else {
                        z3 = t8.g.x(parcel, readInt5);
                    }
                }
                t8.g.n(parcel, H12);
                return new V0(str6, i11, c1Var, i12, z3);
            case 5:
                int H13 = t8.g.H(parcel);
                int i13 = 0;
                int i14 = 0;
                while (parcel.dataPosition() < H13) {
                    int readInt6 = parcel.readInt();
                    char c13 = (char) readInt6;
                    if (c13 == 1) {
                        i13 = t8.g.z(parcel, readInt6);
                    } else if (c13 != 2) {
                        t8.g.G(parcel, readInt6);
                    } else {
                        i14 = t8.g.z(parcel, readInt6);
                    }
                }
                t8.g.n(parcel, H13);
                return new W0(i13, i14);
            case 6:
                int H14 = t8.g.H(parcel);
                String str7 = null;
                while (parcel.dataPosition() < H14) {
                    int readInt7 = parcel.readInt();
                    if (((char) readInt7) != 15) {
                        t8.g.G(parcel, readInt7);
                    } else {
                        str7 = t8.g.i(parcel, readInt7);
                    }
                }
                t8.g.n(parcel, H14);
                return new X0(str7);
            case 7:
                int H15 = t8.g.H(parcel);
                boolean z6 = false;
                boolean z9 = false;
                boolean z10 = false;
                while (parcel.dataPosition() < H15) {
                    int readInt8 = parcel.readInt();
                    char c14 = (char) readInt8;
                    if (c14 == 2) {
                        z6 = t8.g.x(parcel, readInt8);
                    } else if (c14 == 3) {
                        z9 = t8.g.x(parcel, readInt8);
                    } else if (c14 != 4) {
                        t8.g.G(parcel, readInt8);
                    } else {
                        z10 = t8.g.x(parcel, readInt8);
                    }
                }
                t8.g.n(parcel, H15);
                return new Z0(z6, z9, z10);
            case 8:
                int H16 = t8.g.H(parcel);
                int i15 = 0;
                int i16 = 0;
                boolean z11 = false;
                int i17 = 0;
                boolean z12 = false;
                boolean z13 = false;
                int i18 = 0;
                int i19 = 0;
                int i20 = 0;
                int i21 = 0;
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
                O o6 = null;
                String str12 = null;
                ArrayList arrayList3 = null;
                String str13 = null;
                while (parcel.dataPosition() < H16) {
                    int readInt9 = parcel.readInt();
                    switch ((char) readInt9) {
                        case 1:
                            i15 = t8.g.z(parcel, readInt9);
                            break;
                        case 2:
                            j6 = t8.g.A(parcel, readInt9);
                            break;
                        case 3:
                            bundle = t8.g.f(parcel, readInt9);
                            break;
                        case 4:
                            i16 = t8.g.z(parcel, readInt9);
                            break;
                        case 5:
                            arrayList = t8.g.k(parcel, readInt9);
                            break;
                        case 6:
                            z11 = t8.g.x(parcel, readInt9);
                            break;
                        case 7:
                            i17 = t8.g.z(parcel, readInt9);
                            break;
                        case '\b':
                            z12 = t8.g.x(parcel, readInt9);
                            break;
                        case '\t':
                            str8 = t8.g.i(parcel, readInt9);
                            break;
                        case '\n':
                            x02 = (X0) t8.g.h(parcel, readInt9, X0.CREATOR);
                            break;
                        case 11:
                            location = (Location) t8.g.h(parcel, readInt9, Location.CREATOR);
                            break;
                        case '\f':
                            str9 = t8.g.i(parcel, readInt9);
                            break;
                        case '\r':
                            bundle2 = t8.g.f(parcel, readInt9);
                            break;
                        case 14:
                            bundle3 = t8.g.f(parcel, readInt9);
                            break;
                        case 15:
                            arrayList2 = t8.g.k(parcel, readInt9);
                            break;
                        case 16:
                            str10 = t8.g.i(parcel, readInt9);
                            break;
                        case 17:
                            str11 = t8.g.i(parcel, readInt9);
                            break;
                        case 18:
                            z13 = t8.g.x(parcel, readInt9);
                            break;
                        case 19:
                            o6 = (O) t8.g.h(parcel, readInt9, O.CREATOR);
                            break;
                        case 20:
                            i18 = t8.g.z(parcel, readInt9);
                            break;
                        case 21:
                            str12 = t8.g.i(parcel, readInt9);
                            break;
                        case 22:
                            arrayList3 = t8.g.k(parcel, readInt9);
                            break;
                        case 23:
                            i19 = t8.g.z(parcel, readInt9);
                            break;
                        case 24:
                            str13 = t8.g.i(parcel, readInt9);
                            break;
                        case 25:
                            i20 = t8.g.z(parcel, readInt9);
                            break;
                        case 26:
                            j9 = t8.g.A(parcel, readInt9);
                            break;
                        case 27:
                            j10 = t8.g.A(parcel, readInt9);
                            break;
                        case 28:
                            i21 = t8.g.z(parcel, readInt9);
                            break;
                        default:
                            t8.g.G(parcel, readInt9);
                            break;
                    }
                }
                t8.g.n(parcel, H16);
                return new c1(i15, j6, bundle, i16, arrayList, z11, i17, z12, str8, x02, location, str9, bundle2, bundle3, arrayList2, str10, str11, z13, o6, i18, str12, arrayList3, i19, str13, i20, j9, j10, i21);
            case 9:
                int H17 = t8.g.H(parcel);
                int i22 = 0;
                int i23 = 0;
                boolean z14 = false;
                int i24 = 0;
                int i25 = 0;
                boolean z15 = false;
                boolean z16 = false;
                boolean z17 = false;
                boolean z18 = false;
                boolean z19 = false;
                boolean z20 = false;
                boolean z21 = false;
                boolean z22 = false;
                boolean z23 = false;
                String str14 = null;
                f1[] f1VarArr = null;
                while (parcel.dataPosition() < H17) {
                    int readInt10 = parcel.readInt();
                    switch ((char) readInt10) {
                        case 2:
                            str14 = t8.g.i(parcel, readInt10);
                            break;
                        case 3:
                            i22 = t8.g.z(parcel, readInt10);
                            break;
                        case 4:
                            i23 = t8.g.z(parcel, readInt10);
                            break;
                        case 5:
                            z14 = t8.g.x(parcel, readInt10);
                            break;
                        case 6:
                            i24 = t8.g.z(parcel, readInt10);
                            break;
                        case 7:
                            i25 = t8.g.z(parcel, readInt10);
                            break;
                        case '\b':
                            f1VarArr = (f1[]) t8.g.l(parcel, readInt10, f1.CREATOR);
                            break;
                        case '\t':
                            z15 = t8.g.x(parcel, readInt10);
                            break;
                        case '\n':
                            z16 = t8.g.x(parcel, readInt10);
                            break;
                        case 11:
                            z17 = t8.g.x(parcel, readInt10);
                            break;
                        case '\f':
                            z18 = t8.g.x(parcel, readInt10);
                            break;
                        case '\r':
                            z19 = t8.g.x(parcel, readInt10);
                            break;
                        case 14:
                            z20 = t8.g.x(parcel, readInt10);
                            break;
                        case 15:
                            z21 = t8.g.x(parcel, readInt10);
                            break;
                        case 16:
                            z22 = t8.g.x(parcel, readInt10);
                            break;
                        case 17:
                            z23 = t8.g.x(parcel, readInt10);
                            break;
                        default:
                            t8.g.G(parcel, readInt10);
                            break;
                    }
                }
                t8.g.n(parcel, H17);
                return new f1(str14, i22, i23, z14, i24, i25, f1VarArr, z15, z16, z17, z18, z19, z20, z21, z22, z23);
            case 10:
                int H18 = t8.g.H(parcel);
                long j11 = 0;
                String str15 = null;
                int i26 = 0;
                int i27 = 0;
                while (parcel.dataPosition() < H18) {
                    int readInt11 = parcel.readInt();
                    char c15 = (char) readInt11;
                    if (c15 == 1) {
                        i26 = t8.g.z(parcel, readInt11);
                    } else if (c15 == 2) {
                        i27 = t8.g.z(parcel, readInt11);
                    } else if (c15 == 3) {
                        str15 = t8.g.i(parcel, readInt11);
                    } else if (c15 != 4) {
                        t8.g.G(parcel, readInt11);
                    } else {
                        j11 = t8.g.A(parcel, readInt11);
                    }
                }
                t8.g.n(parcel, H18);
                return new g1(i26, i27, str15, j11);
            case 11:
                int H19 = t8.g.H(parcel);
                String str16 = null;
                C4920z0 c4920z02 = null;
                Bundle bundle4 = null;
                String str17 = null;
                String str18 = null;
                String str19 = null;
                String str20 = null;
                long j12 = 0;
                while (parcel.dataPosition() < H19) {
                    int readInt12 = parcel.readInt();
                    switch ((char) readInt12) {
                        case 1:
                            str16 = t8.g.i(parcel, readInt12);
                            break;
                        case 2:
                            j12 = t8.g.A(parcel, readInt12);
                            break;
                        case 3:
                            c4920z02 = (C4920z0) t8.g.h(parcel, readInt12, C4920z0.CREATOR);
                            break;
                        case 4:
                            bundle4 = t8.g.f(parcel, readInt12);
                            break;
                        case 5:
                            str17 = t8.g.i(parcel, readInt12);
                            break;
                        case 6:
                            str18 = t8.g.i(parcel, readInt12);
                            break;
                        case 7:
                            str19 = t8.g.i(parcel, readInt12);
                            break;
                        case '\b':
                            str20 = t8.g.i(parcel, readInt12);
                            break;
                        default:
                            t8.g.G(parcel, readInt12);
                            break;
                    }
                }
                t8.g.n(parcel, H19);
                return new h1(str16, j12, c4920z02, bundle4, str17, str18, str19, str20);
            default:
                int H20 = t8.g.H(parcel);
                int i28 = 0;
                while (parcel.dataPosition() < H20) {
                    int readInt13 = parcel.readInt();
                    if (((char) readInt13) != 2) {
                        t8.g.G(parcel, readInt13);
                    } else {
                        i28 = t8.g.z(parcel, readInt13);
                    }
                }
                t8.g.n(parcel, H20);
                return new i1(i28);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        switch (this.f40176a) {
            case 0:
                return new O[i];
            case 1:
                return new D0[i];
            case 2:
                return new C4920z0[i];
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
