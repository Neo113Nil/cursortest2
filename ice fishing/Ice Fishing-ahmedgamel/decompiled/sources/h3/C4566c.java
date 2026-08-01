package h3;

import P2.t;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import java.util.ArrayList;
import m.M;
import n2.C4750a;
import n2.C4753d;
import p2.C4831f;
import s2.C4971a;
import s3.C4973b;
import t0.C5023r;
import t0.X;
import t0.Y;
import t2.C5037e;
import u2.m;
import v2.C5110a;

/* renamed from: h3.c, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4566c implements Parcelable.Creator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f38012a;

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f38012a) {
            case 0:
                int H8 = t8.g.H(parcel);
                int i = 0;
                Intent intent = null;
                int i6 = 0;
                while (parcel.dataPosition() < H8) {
                    int readInt = parcel.readInt();
                    char c9 = (char) readInt;
                    if (c9 == 1) {
                        i = t8.g.z(parcel, readInt);
                    } else if (c9 == 2) {
                        i6 = t8.g.z(parcel, readInt);
                    } else if (c9 != 3) {
                        t8.g.G(parcel, readInt);
                    } else {
                        intent = (Intent) t8.g.h(parcel, readInt, Intent.CREATOR);
                    }
                }
                t8.g.n(parcel, H8);
                return new C4565b(i, i6, intent);
            case 1:
                int H9 = t8.g.H(parcel);
                ArrayList arrayList = null;
                String str = null;
                while (parcel.dataPosition() < H9) {
                    int readInt2 = parcel.readInt();
                    char c10 = (char) readInt2;
                    if (c10 == 1) {
                        arrayList = t8.g.k(parcel, readInt2);
                    } else if (c10 != 2) {
                        t8.g.G(parcel, readInt2);
                    } else {
                        str = t8.g.i(parcel, readInt2);
                    }
                }
                t8.g.n(parcel, H9);
                return new C4570g(str, arrayList);
            case 2:
                int H10 = t8.g.H(parcel);
                int i9 = 0;
                M2.b bVar = null;
                t tVar = null;
                while (parcel.dataPosition() < H10) {
                    int readInt3 = parcel.readInt();
                    char c11 = (char) readInt3;
                    if (c11 == 1) {
                        i9 = t8.g.z(parcel, readInt3);
                    } else if (c11 == 2) {
                        bVar = (M2.b) t8.g.h(parcel, readInt3, M2.b.CREATOR);
                    } else if (c11 != 3) {
                        t8.g.G(parcel, readInt3);
                    } else {
                        tVar = (t) t8.g.h(parcel, readInt3, t.CREATOR);
                    }
                }
                t8.g.n(parcel, H10);
                return new C4571h(i9, bVar, tVar);
            case 3:
                M m4 = new M(parcel);
                m4.f39036n = parcel.readByte() != 0;
                return m4;
            case 4:
                int H11 = t8.g.H(parcel);
                boolean z3 = false;
                while (parcel.dataPosition() < H11) {
                    int readInt4 = parcel.readInt();
                    if (((char) readInt4) != 1) {
                        t8.g.G(parcel, readInt4);
                    } else {
                        z3 = t8.g.x(parcel, readInt4);
                    }
                }
                t8.g.n(parcel, H11);
                return new C4750a(z3);
            case 5:
                int H12 = t8.g.H(parcel);
                IBinder iBinder = null;
                boolean z6 = false;
                IBinder iBinder2 = null;
                while (parcel.dataPosition() < H12) {
                    int readInt5 = parcel.readInt();
                    char c12 = (char) readInt5;
                    if (c12 == 1) {
                        z6 = t8.g.x(parcel, readInt5);
                    } else if (c12 == 2) {
                        iBinder = t8.g.y(parcel, readInt5);
                    } else if (c12 != 3) {
                        t8.g.G(parcel, readInt5);
                    } else {
                        iBinder2 = t8.g.y(parcel, readInt5);
                    }
                }
                t8.g.n(parcel, H12);
                return new C4753d(z6, iBinder, iBinder2);
            case 6:
                int H13 = t8.g.H(parcel);
                boolean z9 = false;
                boolean z10 = false;
                boolean z11 = false;
                int i10 = 0;
                boolean z12 = false;
                boolean z13 = false;
                boolean z14 = false;
                float f3 = 0.0f;
                String str2 = null;
                while (parcel.dataPosition() < H13) {
                    int readInt6 = parcel.readInt();
                    switch ((char) readInt6) {
                        case 2:
                            z9 = t8.g.x(parcel, readInt6);
                            break;
                        case 3:
                            z10 = t8.g.x(parcel, readInt6);
                            break;
                        case 4:
                            str2 = t8.g.i(parcel, readInt6);
                            break;
                        case 5:
                            z11 = t8.g.x(parcel, readInt6);
                            break;
                        case 6:
                            t8.g.K(parcel, readInt6, 4);
                            f3 = parcel.readFloat();
                            break;
                        case 7:
                            i10 = t8.g.z(parcel, readInt6);
                            break;
                        case '\b':
                            z12 = t8.g.x(parcel, readInt6);
                            break;
                        case '\t':
                            z13 = t8.g.x(parcel, readInt6);
                            break;
                        case '\n':
                            z14 = t8.g.x(parcel, readInt6);
                            break;
                        default:
                            t8.g.G(parcel, readInt6);
                            break;
                    }
                }
                t8.g.n(parcel, H13);
                return new C4831f(z9, z10, str2, z11, f3, i10, z12, z13, z14);
            case 7:
                int H14 = t8.g.H(parcel);
                String str3 = null;
                String str4 = null;
                String str5 = null;
                while (parcel.dataPosition() < H14) {
                    int readInt7 = parcel.readInt();
                    char c13 = (char) readInt7;
                    if (c13 == 1) {
                        str3 = t8.g.i(parcel, readInt7);
                    } else if (c13 == 2) {
                        str4 = t8.g.i(parcel, readInt7);
                    } else if (c13 != 3) {
                        t8.g.G(parcel, readInt7);
                    } else {
                        str5 = t8.g.i(parcel, readInt7);
                    }
                }
                t8.g.n(parcel, H14);
                return new C4971a(str3, str4, str5);
            case 8:
                C4973b c4973b = new C4973b(parcel);
                c4973b.f40465n = ((Integer) parcel.readValue(C4973b.class.getClassLoader())).intValue();
                return c4973b;
            case 9:
                C5023r c5023r = new C5023r();
                c5023r.f40757n = parcel.readInt();
                c5023r.f40758u = parcel.readInt();
                c5023r.f40759v = parcel.readInt() == 1;
                return c5023r;
            case 10:
                X x9 = new X();
                x9.f40622n = parcel.readInt();
                x9.f40623u = parcel.readInt();
                x9.f40625w = parcel.readInt() == 1;
                int readInt8 = parcel.readInt();
                if (readInt8 > 0) {
                    int[] iArr = new int[readInt8];
                    x9.f40624v = iArr;
                    parcel.readIntArray(iArr);
                }
                return x9;
            case 11:
                Y y7 = new Y();
                y7.f40629n = parcel.readInt();
                y7.f40630u = parcel.readInt();
                int readInt9 = parcel.readInt();
                y7.f40631v = readInt9;
                if (readInt9 > 0) {
                    int[] iArr2 = new int[readInt9];
                    y7.f40632w = iArr2;
                    parcel.readIntArray(iArr2);
                }
                int readInt10 = parcel.readInt();
                y7.f40633x = readInt10;
                if (readInt10 > 0) {
                    int[] iArr3 = new int[readInt10];
                    y7.f40634y = iArr3;
                    parcel.readIntArray(iArr3);
                }
                y7.f40626A = parcel.readInt() == 1;
                y7.f40627B = parcel.readInt() == 1;
                y7.f40628C = parcel.readInt() == 1;
                y7.f40635z = parcel.readArrayList(X.class.getClassLoader());
                return y7;
            case 12:
                int H15 = t8.g.H(parcel);
                String str6 = null;
                String str7 = null;
                String str8 = null;
                String str9 = null;
                String str10 = null;
                String str11 = null;
                String str12 = null;
                Intent intent2 = null;
                IBinder iBinder3 = null;
                Bundle bundle = null;
                boolean z15 = false;
                while (parcel.dataPosition() < H15) {
                    int readInt11 = parcel.readInt();
                    switch ((char) readInt11) {
                        case 2:
                            str6 = t8.g.i(parcel, readInt11);
                            break;
                        case 3:
                            str7 = t8.g.i(parcel, readInt11);
                            break;
                        case 4:
                            str8 = t8.g.i(parcel, readInt11);
                            break;
                        case 5:
                            str9 = t8.g.i(parcel, readInt11);
                            break;
                        case 6:
                            str10 = t8.g.i(parcel, readInt11);
                            break;
                        case 7:
                            str11 = t8.g.i(parcel, readInt11);
                            break;
                        case '\b':
                            str12 = t8.g.i(parcel, readInt11);
                            break;
                        case '\t':
                            intent2 = (Intent) t8.g.h(parcel, readInt11, Intent.CREATOR);
                            break;
                        case '\n':
                            iBinder3 = t8.g.y(parcel, readInt11);
                            break;
                        case 11:
                            z15 = t8.g.x(parcel, readInt11);
                            break;
                        case '\f':
                            bundle = t8.g.f(parcel, readInt11);
                            break;
                        default:
                            t8.g.G(parcel, readInt11);
                            break;
                    }
                }
                t8.g.n(parcel, H15);
                return new C5037e(str6, str7, str8, str9, str10, str11, str12, intent2, iBinder3, z15, bundle);
            case 13:
                int H16 = t8.g.H(parcel);
                long j6 = 0;
                boolean z16 = false;
                int i11 = 0;
                int i12 = 0;
                boolean z17 = false;
                C5037e c5037e = null;
                IBinder iBinder4 = null;
                IBinder iBinder5 = null;
                IBinder iBinder6 = null;
                IBinder iBinder7 = null;
                String str13 = null;
                String str14 = null;
                IBinder iBinder8 = null;
                String str15 = null;
                C5110a c5110a = null;
                String str16 = null;
                C4831f c4831f = null;
                IBinder iBinder9 = null;
                String str17 = null;
                String str18 = null;
                String str19 = null;
                IBinder iBinder10 = null;
                IBinder iBinder11 = null;
                IBinder iBinder12 = null;
                while (parcel.dataPosition() < H16) {
                    int readInt12 = parcel.readInt();
                    switch ((char) readInt12) {
                        case 2:
                            c5037e = (C5037e) t8.g.h(parcel, readInt12, C5037e.CREATOR);
                            break;
                        case 3:
                            iBinder4 = t8.g.y(parcel, readInt12);
                            break;
                        case 4:
                            iBinder5 = t8.g.y(parcel, readInt12);
                            break;
                        case 5:
                            iBinder6 = t8.g.y(parcel, readInt12);
                            break;
                        case 6:
                            iBinder7 = t8.g.y(parcel, readInt12);
                            break;
                        case 7:
                            str13 = t8.g.i(parcel, readInt12);
                            break;
                        case '\b':
                            z16 = t8.g.x(parcel, readInt12);
                            break;
                        case '\t':
                            str14 = t8.g.i(parcel, readInt12);
                            break;
                        case '\n':
                            iBinder8 = t8.g.y(parcel, readInt12);
                            break;
                        case 11:
                            i11 = t8.g.z(parcel, readInt12);
                            break;
                        case '\f':
                            i12 = t8.g.z(parcel, readInt12);
                            break;
                        case '\r':
                            str15 = t8.g.i(parcel, readInt12);
                            break;
                        case 14:
                            c5110a = (C5110a) t8.g.h(parcel, readInt12, C5110a.CREATOR);
                            break;
                        case 15:
                        case 20:
                        case 21:
                        case 22:
                        case 23:
                        default:
                            t8.g.G(parcel, readInt12);
                            break;
                        case 16:
                            str16 = t8.g.i(parcel, readInt12);
                            break;
                        case 17:
                            c4831f = (C4831f) t8.g.h(parcel, readInt12, C4831f.CREATOR);
                            break;
                        case 18:
                            iBinder9 = t8.g.y(parcel, readInt12);
                            break;
                        case 19:
                            str17 = t8.g.i(parcel, readInt12);
                            break;
                        case 24:
                            str18 = t8.g.i(parcel, readInt12);
                            break;
                        case 25:
                            str19 = t8.g.i(parcel, readInt12);
                            break;
                        case 26:
                            iBinder10 = t8.g.y(parcel, readInt12);
                            break;
                        case 27:
                            iBinder11 = t8.g.y(parcel, readInt12);
                            break;
                        case 28:
                            iBinder12 = t8.g.y(parcel, readInt12);
                            break;
                        case 29:
                            z17 = t8.g.x(parcel, readInt12);
                            break;
                        case 30:
                            j6 = t8.g.A(parcel, readInt12);
                            break;
                    }
                }
                t8.g.n(parcel, H16);
                return new AdOverlayInfoParcel(c5037e, iBinder4, iBinder5, iBinder6, iBinder7, str13, z16, str14, iBinder8, i11, i12, str15, c5110a, str16, c4831f, iBinder9, str17, str18, str19, iBinder10, iBinder11, iBinder12, z17, j6);
            case 14:
                int H17 = t8.g.H(parcel);
                int i13 = 0;
                String str20 = null;
                while (parcel.dataPosition() < H17) {
                    int readInt13 = parcel.readInt();
                    char c14 = (char) readInt13;
                    if (c14 == 1) {
                        str20 = t8.g.i(parcel, readInt13);
                    } else if (c14 != 2) {
                        t8.g.G(parcel, readInt13);
                    } else {
                        i13 = t8.g.z(parcel, readInt13);
                    }
                }
                t8.g.n(parcel, H17);
                return new m(str20, i13);
            default:
                int H18 = t8.g.H(parcel);
                int i14 = 0;
                int i15 = 0;
                boolean z18 = false;
                boolean z19 = false;
                String str21 = null;
                while (parcel.dataPosition() < H18) {
                    int readInt14 = parcel.readInt();
                    char c15 = (char) readInt14;
                    if (c15 == 2) {
                        str21 = t8.g.i(parcel, readInt14);
                    } else if (c15 == 3) {
                        i14 = t8.g.z(parcel, readInt14);
                    } else if (c15 == 4) {
                        i15 = t8.g.z(parcel, readInt14);
                    } else if (c15 == 5) {
                        z18 = t8.g.x(parcel, readInt14);
                    } else if (c15 != 6) {
                        t8.g.G(parcel, readInt14);
                    } else {
                        z19 = t8.g.x(parcel, readInt14);
                    }
                }
                t8.g.n(parcel, H18);
                return new C5110a(str21, i14, i15, z18, z19);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.f38012a) {
            case 0:
                return new C4565b[i];
            case 1:
                return new C4570g[i];
            case 2:
                return new C4571h[i];
            case 3:
                return new M[i];
            case 4:
                return new C4750a[i];
            case 5:
                return new C4753d[i];
            case 6:
                return new C4831f[i];
            case 7:
                return new C4971a[i];
            case 8:
                return new C4973b[i];
            case 9:
                return new C5023r[i];
            case 10:
                return new X[i];
            case 11:
                return new Y[i];
            case 12:
                return new C5037e[i];
            case 13:
                return new AdOverlayInfoParcel[i];
            case 14:
                return new m[i];
            default:
                return new C5110a[i];
        }
    }
}
