package j3;

import R2.t;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import java.util.ArrayList;
import m.M;
import p2.C4830a;
import p2.C4833d;
import r2.C4902g;
import t0.C5021q;
import t0.V;
import t0.W;
import u2.C5067a;
import u3.C5069b;
import v2.C5101e;
import w2.m;
import x2.C5189a;

/* renamed from: j3.c, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4614c implements Parcelable.Creator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f38481a;

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f38481a) {
            case 0:
                int L2 = com.bumptech.glide.d.L(parcel);
                int i = 0;
                Intent intent = null;
                int i4 = 0;
                while (parcel.dataPosition() < L2) {
                    int readInt = parcel.readInt();
                    char c9 = (char) readInt;
                    if (c9 == 1) {
                        i = com.bumptech.glide.d.B(parcel, readInt);
                    } else if (c9 == 2) {
                        i4 = com.bumptech.glide.d.B(parcel, readInt);
                    } else if (c9 != 3) {
                        com.bumptech.glide.d.J(parcel, readInt);
                    } else {
                        intent = (Intent) com.bumptech.glide.d.k(parcel, readInt, Intent.CREATOR);
                    }
                }
                com.bumptech.glide.d.p(parcel, L2);
                return new C4613b(i, i4, intent);
            case 1:
                int L6 = com.bumptech.glide.d.L(parcel);
                ArrayList arrayList = null;
                String str = null;
                while (parcel.dataPosition() < L6) {
                    int readInt2 = parcel.readInt();
                    char c10 = (char) readInt2;
                    if (c10 == 1) {
                        arrayList = com.bumptech.glide.d.n(parcel, readInt2);
                    } else if (c10 != 2) {
                        com.bumptech.glide.d.J(parcel, readInt2);
                    } else {
                        str = com.bumptech.glide.d.l(parcel, readInt2);
                    }
                }
                com.bumptech.glide.d.p(parcel, L6);
                return new C4618g(str, arrayList);
            case 2:
                int L8 = com.bumptech.glide.d.L(parcel);
                int i6 = 0;
                O2.b bVar = null;
                t tVar = null;
                while (parcel.dataPosition() < L8) {
                    int readInt3 = parcel.readInt();
                    char c11 = (char) readInt3;
                    if (c11 == 1) {
                        i6 = com.bumptech.glide.d.B(parcel, readInt3);
                    } else if (c11 == 2) {
                        bVar = (O2.b) com.bumptech.glide.d.k(parcel, readInt3, O2.b.CREATOR);
                    } else if (c11 != 3) {
                        com.bumptech.glide.d.J(parcel, readInt3);
                    } else {
                        tVar = (t) com.bumptech.glide.d.k(parcel, readInt3, t.CREATOR);
                    }
                }
                com.bumptech.glide.d.p(parcel, L8);
                return new C4619h(i6, bVar, tVar);
            case 3:
                M m9 = new M(parcel);
                m9.f39104n = parcel.readByte() != 0;
                return m9;
            case 4:
                int L9 = com.bumptech.glide.d.L(parcel);
                boolean z6 = false;
                while (parcel.dataPosition() < L9) {
                    int readInt4 = parcel.readInt();
                    if (((char) readInt4) != 1) {
                        com.bumptech.glide.d.J(parcel, readInt4);
                    } else {
                        z6 = com.bumptech.glide.d.z(parcel, readInt4);
                    }
                }
                com.bumptech.glide.d.p(parcel, L9);
                return new C4830a(z6);
            case 5:
                int L10 = com.bumptech.glide.d.L(parcel);
                IBinder iBinder = null;
                boolean z9 = false;
                IBinder iBinder2 = null;
                while (parcel.dataPosition() < L10) {
                    int readInt5 = parcel.readInt();
                    char c12 = (char) readInt5;
                    if (c12 == 1) {
                        z9 = com.bumptech.glide.d.z(parcel, readInt5);
                    } else if (c12 == 2) {
                        iBinder = com.bumptech.glide.d.A(parcel, readInt5);
                    } else if (c12 != 3) {
                        com.bumptech.glide.d.J(parcel, readInt5);
                    } else {
                        iBinder2 = com.bumptech.glide.d.A(parcel, readInt5);
                    }
                }
                com.bumptech.glide.d.p(parcel, L10);
                return new C4833d(z9, iBinder, iBinder2);
            case 6:
                int L11 = com.bumptech.glide.d.L(parcel);
                boolean z10 = false;
                boolean z11 = false;
                boolean z12 = false;
                int i9 = 0;
                boolean z13 = false;
                boolean z14 = false;
                boolean z15 = false;
                float f2 = 0.0f;
                String str2 = null;
                while (parcel.dataPosition() < L11) {
                    int readInt6 = parcel.readInt();
                    switch ((char) readInt6) {
                        case 2:
                            z10 = com.bumptech.glide.d.z(parcel, readInt6);
                            break;
                        case 3:
                            z11 = com.bumptech.glide.d.z(parcel, readInt6);
                            break;
                        case 4:
                            str2 = com.bumptech.glide.d.l(parcel, readInt6);
                            break;
                        case 5:
                            z12 = com.bumptech.glide.d.z(parcel, readInt6);
                            break;
                        case 6:
                            com.bumptech.glide.d.N(parcel, readInt6, 4);
                            f2 = parcel.readFloat();
                            break;
                        case 7:
                            i9 = com.bumptech.glide.d.B(parcel, readInt6);
                            break;
                        case '\b':
                            z13 = com.bumptech.glide.d.z(parcel, readInt6);
                            break;
                        case '\t':
                            z14 = com.bumptech.glide.d.z(parcel, readInt6);
                            break;
                        case '\n':
                            z15 = com.bumptech.glide.d.z(parcel, readInt6);
                            break;
                        default:
                            com.bumptech.glide.d.J(parcel, readInt6);
                            break;
                    }
                }
                com.bumptech.glide.d.p(parcel, L11);
                return new C4902g(z10, z11, str2, z12, f2, i9, z13, z14, z15);
            case 7:
                C5021q c5021q = new C5021q();
                c5021q.f40804n = parcel.readInt();
                c5021q.f40805u = parcel.readInt();
                c5021q.f40806v = parcel.readInt() == 1;
                return c5021q;
            case 8:
                V v9 = new V();
                v9.f40672n = parcel.readInt();
                v9.f40673u = parcel.readInt();
                v9.f40675w = parcel.readInt() == 1;
                int readInt7 = parcel.readInt();
                if (readInt7 > 0) {
                    int[] iArr = new int[readInt7];
                    v9.f40674v = iArr;
                    parcel.readIntArray(iArr);
                }
                return v9;
            case 9:
                W w3 = new W();
                w3.f40679n = parcel.readInt();
                w3.f40680u = parcel.readInt();
                int readInt8 = parcel.readInt();
                w3.f40681v = readInt8;
                if (readInt8 > 0) {
                    int[] iArr2 = new int[readInt8];
                    w3.f40682w = iArr2;
                    parcel.readIntArray(iArr2);
                }
                int readInt9 = parcel.readInt();
                w3.f40683x = readInt9;
                if (readInt9 > 0) {
                    int[] iArr3 = new int[readInt9];
                    w3.f40684y = iArr3;
                    parcel.readIntArray(iArr3);
                }
                w3.f40676A = parcel.readInt() == 1;
                w3.f40677B = parcel.readInt() == 1;
                w3.f40678C = parcel.readInt() == 1;
                w3.f40685z = parcel.readArrayList(V.class.getClassLoader());
                return w3;
            case 10:
                int L12 = com.bumptech.glide.d.L(parcel);
                String str3 = null;
                String str4 = null;
                String str5 = null;
                while (parcel.dataPosition() < L12) {
                    int readInt10 = parcel.readInt();
                    char c13 = (char) readInt10;
                    if (c13 == 1) {
                        str3 = com.bumptech.glide.d.l(parcel, readInt10);
                    } else if (c13 == 2) {
                        str4 = com.bumptech.glide.d.l(parcel, readInt10);
                    } else if (c13 != 3) {
                        com.bumptech.glide.d.J(parcel, readInt10);
                    } else {
                        str5 = com.bumptech.glide.d.l(parcel, readInt10);
                    }
                }
                com.bumptech.glide.d.p(parcel, L12);
                return new C5067a(str3, str4, str5);
            case 11:
                C5069b c5069b = new C5069b(parcel);
                c5069b.f41019n = ((Integer) parcel.readValue(C5069b.class.getClassLoader())).intValue();
                return c5069b;
            case 12:
                int L13 = com.bumptech.glide.d.L(parcel);
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
                boolean z16 = false;
                while (parcel.dataPosition() < L13) {
                    int readInt11 = parcel.readInt();
                    switch ((char) readInt11) {
                        case 2:
                            str6 = com.bumptech.glide.d.l(parcel, readInt11);
                            break;
                        case 3:
                            str7 = com.bumptech.glide.d.l(parcel, readInt11);
                            break;
                        case 4:
                            str8 = com.bumptech.glide.d.l(parcel, readInt11);
                            break;
                        case 5:
                            str9 = com.bumptech.glide.d.l(parcel, readInt11);
                            break;
                        case 6:
                            str10 = com.bumptech.glide.d.l(parcel, readInt11);
                            break;
                        case 7:
                            str11 = com.bumptech.glide.d.l(parcel, readInt11);
                            break;
                        case '\b':
                            str12 = com.bumptech.glide.d.l(parcel, readInt11);
                            break;
                        case '\t':
                            intent2 = (Intent) com.bumptech.glide.d.k(parcel, readInt11, Intent.CREATOR);
                            break;
                        case '\n':
                            iBinder3 = com.bumptech.glide.d.A(parcel, readInt11);
                            break;
                        case 11:
                            z16 = com.bumptech.glide.d.z(parcel, readInt11);
                            break;
                        case '\f':
                            bundle = com.bumptech.glide.d.i(parcel, readInt11);
                            break;
                        default:
                            com.bumptech.glide.d.J(parcel, readInt11);
                            break;
                    }
                }
                com.bumptech.glide.d.p(parcel, L13);
                return new C5101e(str6, str7, str8, str9, str10, str11, str12, intent2, iBinder3, z16, bundle);
            case 13:
                int L14 = com.bumptech.glide.d.L(parcel);
                long j6 = 0;
                boolean z17 = false;
                int i10 = 0;
                int i11 = 0;
                boolean z18 = false;
                C5101e c5101e = null;
                IBinder iBinder4 = null;
                IBinder iBinder5 = null;
                IBinder iBinder6 = null;
                IBinder iBinder7 = null;
                String str13 = null;
                String str14 = null;
                IBinder iBinder8 = null;
                String str15 = null;
                C5189a c5189a = null;
                String str16 = null;
                C4902g c4902g = null;
                IBinder iBinder9 = null;
                String str17 = null;
                String str18 = null;
                String str19 = null;
                IBinder iBinder10 = null;
                IBinder iBinder11 = null;
                IBinder iBinder12 = null;
                while (parcel.dataPosition() < L14) {
                    int readInt12 = parcel.readInt();
                    switch ((char) readInt12) {
                        case 2:
                            c5101e = (C5101e) com.bumptech.glide.d.k(parcel, readInt12, C5101e.CREATOR);
                            break;
                        case 3:
                            iBinder4 = com.bumptech.glide.d.A(parcel, readInt12);
                            break;
                        case 4:
                            iBinder5 = com.bumptech.glide.d.A(parcel, readInt12);
                            break;
                        case 5:
                            iBinder6 = com.bumptech.glide.d.A(parcel, readInt12);
                            break;
                        case 6:
                            iBinder7 = com.bumptech.glide.d.A(parcel, readInt12);
                            break;
                        case 7:
                            str13 = com.bumptech.glide.d.l(parcel, readInt12);
                            break;
                        case '\b':
                            z17 = com.bumptech.glide.d.z(parcel, readInt12);
                            break;
                        case '\t':
                            str14 = com.bumptech.glide.d.l(parcel, readInt12);
                            break;
                        case '\n':
                            iBinder8 = com.bumptech.glide.d.A(parcel, readInt12);
                            break;
                        case 11:
                            i10 = com.bumptech.glide.d.B(parcel, readInt12);
                            break;
                        case '\f':
                            i11 = com.bumptech.glide.d.B(parcel, readInt12);
                            break;
                        case '\r':
                            str15 = com.bumptech.glide.d.l(parcel, readInt12);
                            break;
                        case 14:
                            c5189a = (C5189a) com.bumptech.glide.d.k(parcel, readInt12, C5189a.CREATOR);
                            break;
                        case 15:
                        case 20:
                        case 21:
                        case 22:
                        case 23:
                        default:
                            com.bumptech.glide.d.J(parcel, readInt12);
                            break;
                        case 16:
                            str16 = com.bumptech.glide.d.l(parcel, readInt12);
                            break;
                        case 17:
                            c4902g = (C4902g) com.bumptech.glide.d.k(parcel, readInt12, C4902g.CREATOR);
                            break;
                        case 18:
                            iBinder9 = com.bumptech.glide.d.A(parcel, readInt12);
                            break;
                        case 19:
                            str17 = com.bumptech.glide.d.l(parcel, readInt12);
                            break;
                        case 24:
                            str18 = com.bumptech.glide.d.l(parcel, readInt12);
                            break;
                        case 25:
                            str19 = com.bumptech.glide.d.l(parcel, readInt12);
                            break;
                        case 26:
                            iBinder10 = com.bumptech.glide.d.A(parcel, readInt12);
                            break;
                        case 27:
                            iBinder11 = com.bumptech.glide.d.A(parcel, readInt12);
                            break;
                        case 28:
                            iBinder12 = com.bumptech.glide.d.A(parcel, readInt12);
                            break;
                        case 29:
                            z18 = com.bumptech.glide.d.z(parcel, readInt12);
                            break;
                        case 30:
                            j6 = com.bumptech.glide.d.C(parcel, readInt12);
                            break;
                    }
                }
                com.bumptech.glide.d.p(parcel, L14);
                return new AdOverlayInfoParcel(c5101e, iBinder4, iBinder5, iBinder6, iBinder7, str13, z17, str14, iBinder8, i10, i11, str15, c5189a, str16, c4902g, iBinder9, str17, str18, str19, iBinder10, iBinder11, iBinder12, z18, j6);
            case 14:
                int L15 = com.bumptech.glide.d.L(parcel);
                int i12 = 0;
                String str20 = null;
                while (parcel.dataPosition() < L15) {
                    int readInt13 = parcel.readInt();
                    char c14 = (char) readInt13;
                    if (c14 == 1) {
                        str20 = com.bumptech.glide.d.l(parcel, readInt13);
                    } else if (c14 != 2) {
                        com.bumptech.glide.d.J(parcel, readInt13);
                    } else {
                        i12 = com.bumptech.glide.d.B(parcel, readInt13);
                    }
                }
                com.bumptech.glide.d.p(parcel, L15);
                return new m(str20, i12);
            default:
                int L16 = com.bumptech.glide.d.L(parcel);
                int i13 = 0;
                int i14 = 0;
                boolean z19 = false;
                boolean z20 = false;
                String str21 = null;
                while (parcel.dataPosition() < L16) {
                    int readInt14 = parcel.readInt();
                    char c15 = (char) readInt14;
                    if (c15 == 2) {
                        str21 = com.bumptech.glide.d.l(parcel, readInt14);
                    } else if (c15 == 3) {
                        i13 = com.bumptech.glide.d.B(parcel, readInt14);
                    } else if (c15 == 4) {
                        i14 = com.bumptech.glide.d.B(parcel, readInt14);
                    } else if (c15 == 5) {
                        z19 = com.bumptech.glide.d.z(parcel, readInt14);
                    } else if (c15 != 6) {
                        com.bumptech.glide.d.J(parcel, readInt14);
                    } else {
                        z20 = com.bumptech.glide.d.z(parcel, readInt14);
                    }
                }
                com.bumptech.glide.d.p(parcel, L16);
                return new C5189a(str21, i13, i14, z19, z20);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.f38481a) {
            case 0:
                return new C4613b[i];
            case 1:
                return new C4618g[i];
            case 2:
                return new C4619h[i];
            case 3:
                return new M[i];
            case 4:
                return new C4830a[i];
            case 5:
                return new C4833d[i];
            case 6:
                return new C4902g[i];
            case 7:
                return new C5021q[i];
            case 8:
                return new V[i];
            case 9:
                return new W[i];
            case 10:
                return new C5067a[i];
            case 11:
                return new C5069b[i];
            case 12:
                return new C5101e[i];
            case 13:
                return new AdOverlayInfoParcel[i];
            case 14:
                return new m[i];
            default:
                return new C5189a[i];
        }
    }
}
