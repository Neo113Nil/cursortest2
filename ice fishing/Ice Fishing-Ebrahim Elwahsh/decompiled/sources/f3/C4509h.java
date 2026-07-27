package f3;

import O2.t;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import m.M;
import n2.C4805a;
import n2.C4808d;
import r2.C4957a;
import s2.C4997e;
import t0.C5037V;
import t0.C5055r;
import t0.W;
import t2.n;
import u2.C5107a;

/* renamed from: f3.h, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4509h implements Parcelable.Creator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f37709a;

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f37709a) {
            case 0:
                int F8 = K3.b.F(parcel);
                int i = 0;
                L2.b bVar = null;
                t tVar = null;
                while (parcel.dataPosition() < F8) {
                    int readInt = parcel.readInt();
                    char c4 = (char) readInt;
                    if (c4 == 1) {
                        i = K3.b.v(parcel, readInt);
                    } else if (c4 == 2) {
                        bVar = (L2.b) K3.b.h(parcel, readInt, L2.b.CREATOR);
                    } else if (c4 != 3) {
                        K3.b.C(parcel, readInt);
                    } else {
                        tVar = (t) K3.b.h(parcel, readInt, t.CREATOR);
                    }
                }
                K3.b.m(parcel, F8);
                return new C4508g(i, bVar, tVar);
            case 1:
                M m8 = new M(parcel);
                m8.f39303n = parcel.readByte() != 0;
                return m8;
            case 2:
                int F9 = K3.b.F(parcel);
                boolean z8 = false;
                while (parcel.dataPosition() < F9) {
                    int readInt2 = parcel.readInt();
                    if (((char) readInt2) != 1) {
                        K3.b.C(parcel, readInt2);
                    } else {
                        z8 = K3.b.t(parcel, readInt2);
                    }
                }
                K3.b.m(parcel, F9);
                return new C4805a(z8);
            case 3:
                int F10 = K3.b.F(parcel);
                IBinder iBinder = null;
                boolean z9 = false;
                IBinder iBinder2 = null;
                while (parcel.dataPosition() < F10) {
                    int readInt3 = parcel.readInt();
                    char c9 = (char) readInt3;
                    if (c9 == 1) {
                        z9 = K3.b.t(parcel, readInt3);
                    } else if (c9 == 2) {
                        iBinder = K3.b.u(parcel, readInt3);
                    } else if (c9 != 3) {
                        K3.b.C(parcel, readInt3);
                    } else {
                        iBinder2 = K3.b.u(parcel, readInt3);
                    }
                }
                K3.b.m(parcel, F10);
                return new C4808d(z9, iBinder, iBinder2);
            case 4:
                int F11 = K3.b.F(parcel);
                boolean z10 = false;
                boolean z11 = false;
                boolean z12 = false;
                int i4 = 0;
                boolean z13 = false;
                boolean z14 = false;
                boolean z15 = false;
                float f6 = 0.0f;
                String str = null;
                while (parcel.dataPosition() < F11) {
                    int readInt4 = parcel.readInt();
                    switch ((char) readInt4) {
                        case 2:
                            z10 = K3.b.t(parcel, readInt4);
                            break;
                        case 3:
                            z11 = K3.b.t(parcel, readInt4);
                            break;
                        case 4:
                            str = K3.b.i(parcel, readInt4);
                            break;
                        case 5:
                            z12 = K3.b.t(parcel, readInt4);
                            break;
                        case 6:
                            K3.b.H(parcel, readInt4, 4);
                            f6 = parcel.readFloat();
                            break;
                        case 7:
                            i4 = K3.b.v(parcel, readInt4);
                            break;
                        case '\b':
                            z13 = K3.b.t(parcel, readInt4);
                            break;
                        case '\t':
                            z14 = K3.b.t(parcel, readInt4);
                            break;
                        case '\n':
                            z15 = K3.b.t(parcel, readInt4);
                            break;
                        default:
                            K3.b.C(parcel, readInt4);
                            break;
                    }
                }
                K3.b.m(parcel, F11);
                return new p2.f(z10, z11, str, z12, f6, i4, z13, z14, z15);
            case 5:
                q3.b bVar2 = new q3.b(parcel);
                bVar2.f40129n = ((Integer) parcel.readValue(q3.b.class.getClassLoader())).intValue();
                return bVar2;
            case 6:
                int F12 = K3.b.F(parcel);
                String str2 = null;
                String str3 = null;
                String str4 = null;
                while (parcel.dataPosition() < F12) {
                    int readInt5 = parcel.readInt();
                    char c10 = (char) readInt5;
                    if (c10 == 1) {
                        str2 = K3.b.i(parcel, readInt5);
                    } else if (c10 == 2) {
                        str3 = K3.b.i(parcel, readInt5);
                    } else if (c10 != 3) {
                        K3.b.C(parcel, readInt5);
                    } else {
                        str4 = K3.b.i(parcel, readInt5);
                    }
                }
                K3.b.m(parcel, F12);
                return new C4957a(str2, str3, str4);
            case 7:
                int F13 = K3.b.F(parcel);
                String str5 = null;
                String str6 = null;
                String str7 = null;
                String str8 = null;
                String str9 = null;
                String str10 = null;
                String str11 = null;
                Intent intent = null;
                IBinder iBinder3 = null;
                Bundle bundle = null;
                boolean z16 = false;
                while (parcel.dataPosition() < F13) {
                    int readInt6 = parcel.readInt();
                    switch ((char) readInt6) {
                        case 2:
                            str5 = K3.b.i(parcel, readInt6);
                            break;
                        case 3:
                            str6 = K3.b.i(parcel, readInt6);
                            break;
                        case 4:
                            str7 = K3.b.i(parcel, readInt6);
                            break;
                        case 5:
                            str8 = K3.b.i(parcel, readInt6);
                            break;
                        case 6:
                            str9 = K3.b.i(parcel, readInt6);
                            break;
                        case 7:
                            str10 = K3.b.i(parcel, readInt6);
                            break;
                        case '\b':
                            str11 = K3.b.i(parcel, readInt6);
                            break;
                        case '\t':
                            intent = (Intent) K3.b.h(parcel, readInt6, Intent.CREATOR);
                            break;
                        case '\n':
                            iBinder3 = K3.b.u(parcel, readInt6);
                            break;
                        case 11:
                            z16 = K3.b.t(parcel, readInt6);
                            break;
                        case '\f':
                            bundle = K3.b.f(parcel, readInt6);
                            break;
                        default:
                            K3.b.C(parcel, readInt6);
                            break;
                    }
                }
                K3.b.m(parcel, F13);
                return new C4997e(str5, str6, str7, str8, str9, str10, str11, intent, iBinder3, z16, bundle);
            case 8:
                int F14 = K3.b.F(parcel);
                long j9 = 0;
                boolean z17 = false;
                int i9 = 0;
                int i10 = 0;
                boolean z18 = false;
                C4997e c4997e = null;
                IBinder iBinder4 = null;
                IBinder iBinder5 = null;
                IBinder iBinder6 = null;
                IBinder iBinder7 = null;
                String str12 = null;
                String str13 = null;
                IBinder iBinder8 = null;
                String str14 = null;
                C5107a c5107a = null;
                String str15 = null;
                p2.f fVar = null;
                IBinder iBinder9 = null;
                String str16 = null;
                String str17 = null;
                String str18 = null;
                IBinder iBinder10 = null;
                IBinder iBinder11 = null;
                IBinder iBinder12 = null;
                while (parcel.dataPosition() < F14) {
                    int readInt7 = parcel.readInt();
                    switch ((char) readInt7) {
                        case 2:
                            c4997e = (C4997e) K3.b.h(parcel, readInt7, C4997e.CREATOR);
                            break;
                        case 3:
                            iBinder4 = K3.b.u(parcel, readInt7);
                            break;
                        case 4:
                            iBinder5 = K3.b.u(parcel, readInt7);
                            break;
                        case 5:
                            iBinder6 = K3.b.u(parcel, readInt7);
                            break;
                        case 6:
                            iBinder7 = K3.b.u(parcel, readInt7);
                            break;
                        case 7:
                            str12 = K3.b.i(parcel, readInt7);
                            break;
                        case '\b':
                            z17 = K3.b.t(parcel, readInt7);
                            break;
                        case '\t':
                            str13 = K3.b.i(parcel, readInt7);
                            break;
                        case '\n':
                            iBinder8 = K3.b.u(parcel, readInt7);
                            break;
                        case 11:
                            i9 = K3.b.v(parcel, readInt7);
                            break;
                        case '\f':
                            i10 = K3.b.v(parcel, readInt7);
                            break;
                        case '\r':
                            str14 = K3.b.i(parcel, readInt7);
                            break;
                        case 14:
                            c5107a = (C5107a) K3.b.h(parcel, readInt7, C5107a.CREATOR);
                            break;
                        case 15:
                        case 20:
                        case 21:
                        case 22:
                        case 23:
                        default:
                            K3.b.C(parcel, readInt7);
                            break;
                        case 16:
                            str15 = K3.b.i(parcel, readInt7);
                            break;
                        case 17:
                            fVar = (p2.f) K3.b.h(parcel, readInt7, p2.f.CREATOR);
                            break;
                        case 18:
                            iBinder9 = K3.b.u(parcel, readInt7);
                            break;
                        case 19:
                            str16 = K3.b.i(parcel, readInt7);
                            break;
                        case 24:
                            str17 = K3.b.i(parcel, readInt7);
                            break;
                        case 25:
                            str18 = K3.b.i(parcel, readInt7);
                            break;
                        case 26:
                            iBinder10 = K3.b.u(parcel, readInt7);
                            break;
                        case 27:
                            iBinder11 = K3.b.u(parcel, readInt7);
                            break;
                        case 28:
                            iBinder12 = K3.b.u(parcel, readInt7);
                            break;
                        case 29:
                            z18 = K3.b.t(parcel, readInt7);
                            break;
                        case 30:
                            j9 = K3.b.w(parcel, readInt7);
                            break;
                    }
                }
                K3.b.m(parcel, F14);
                return new AdOverlayInfoParcel(c4997e, iBinder4, iBinder5, iBinder6, iBinder7, str12, z17, str13, iBinder8, i9, i10, str14, c5107a, str15, fVar, iBinder9, str16, str17, str18, iBinder10, iBinder11, iBinder12, z18, j9);
            case 9:
                C5055r c5055r = new C5055r();
                c5055r.f40776n = parcel.readInt();
                c5055r.f40777u = parcel.readInt();
                c5055r.f40778v = parcel.readInt() == 1;
                return c5055r;
            case 10:
                C5037V c5037v = new C5037V();
                c5037v.f40644n = parcel.readInt();
                c5037v.f40645u = parcel.readInt();
                c5037v.f40647w = parcel.readInt() == 1;
                int readInt8 = parcel.readInt();
                if (readInt8 > 0) {
                    int[] iArr = new int[readInt8];
                    c5037v.f40646v = iArr;
                    parcel.readIntArray(iArr);
                }
                return c5037v;
            case 11:
                W w9 = new W();
                w9.f40651n = parcel.readInt();
                w9.f40652u = parcel.readInt();
                int readInt9 = parcel.readInt();
                w9.f40653v = readInt9;
                if (readInt9 > 0) {
                    int[] iArr2 = new int[readInt9];
                    w9.f40654w = iArr2;
                    parcel.readIntArray(iArr2);
                }
                int readInt10 = parcel.readInt();
                w9.f40655x = readInt10;
                if (readInt10 > 0) {
                    int[] iArr3 = new int[readInt10];
                    w9.f40656y = iArr3;
                    parcel.readIntArray(iArr3);
                }
                w9.f40648A = parcel.readInt() == 1;
                w9.f40649B = parcel.readInt() == 1;
                w9.f40650C = parcel.readInt() == 1;
                w9.f40657z = parcel.readArrayList(C5037V.class.getClassLoader());
                return w9;
            case 12:
                int F15 = K3.b.F(parcel);
                int i11 = 0;
                String str19 = null;
                while (parcel.dataPosition() < F15) {
                    int readInt11 = parcel.readInt();
                    char c11 = (char) readInt11;
                    if (c11 == 1) {
                        str19 = K3.b.i(parcel, readInt11);
                    } else if (c11 != 2) {
                        K3.b.C(parcel, readInt11);
                    } else {
                        i11 = K3.b.v(parcel, readInt11);
                    }
                }
                K3.b.m(parcel, F15);
                return new n(str19, i11);
            case 13:
                int F16 = K3.b.F(parcel);
                int i12 = 0;
                int i13 = 0;
                boolean z19 = false;
                boolean z20 = false;
                String str20 = null;
                while (parcel.dataPosition() < F16) {
                    int readInt12 = parcel.readInt();
                    char c12 = (char) readInt12;
                    if (c12 == 2) {
                        str20 = K3.b.i(parcel, readInt12);
                    } else if (c12 == 3) {
                        i12 = K3.b.v(parcel, readInt12);
                    } else if (c12 == 4) {
                        i13 = K3.b.v(parcel, readInt12);
                    } else if (c12 == 5) {
                        z19 = K3.b.t(parcel, readInt12);
                    } else if (c12 != 6) {
                        K3.b.C(parcel, readInt12);
                    } else {
                        z20 = K3.b.t(parcel, readInt12);
                    }
                }
                K3.b.m(parcel, F16);
                return new C5107a(str20, i12, i13, z19, z20);
            default:
                return new pl.droidsonroids.gif.d(parcel);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.f37709a) {
            case 0:
                return new C4508g[i];
            case 1:
                return new M[i];
            case 2:
                return new C4805a[i];
            case 3:
                return new C4808d[i];
            case 4:
                return new p2.f[i];
            case 5:
                return new q3.b[i];
            case 6:
                return new C4957a[i];
            case 7:
                return new C4997e[i];
            case 8:
                return new AdOverlayInfoParcel[i];
            case 9:
                return new C5055r[i];
            case 10:
                return new C5037V[i];
            case 11:
                return new W[i];
            case 12:
                return new n[i];
            case 13:
                return new C5107a[i];
            default:
                return new pl.droidsonroids.gif.d[i];
        }
    }
}
