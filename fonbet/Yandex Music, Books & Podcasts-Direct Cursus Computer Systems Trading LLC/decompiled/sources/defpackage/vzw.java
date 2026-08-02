package defpackage;

import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.ResultReceiver;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.fido.common.Transport;
import com.yandex.pulse.metrics.o;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class vzw implements Parcelable.Creator {
    public final /* synthetic */ int a;

    public /* synthetic */ vzw(int i) {
        this.a = i;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.a) {
            case 0:
                int f0 = f8g.f0(parcel);
                String str = null;
                String str2 = null;
                String str3 = null;
                String str4 = null;
                String str5 = null;
                String str6 = null;
                String str7 = null;
                String str8 = null;
                String str9 = null;
                vyt vytVar = null;
                long j = 0;
                long j2 = 0;
                while (parcel.dataPosition() < f0) {
                    int readInt = parcel.readInt();
                    switch ((char) readInt) {
                        case 2:
                            str = f8g.v(parcel, readInt);
                            break;
                        case 3:
                            str2 = f8g.v(parcel, readInt);
                            break;
                        case 4:
                            j = f8g.T(parcel, readInt);
                            break;
                        case 5:
                            str3 = f8g.v(parcel, readInt);
                            break;
                        case 6:
                            str4 = f8g.v(parcel, readInt);
                            break;
                        case 7:
                            str5 = f8g.v(parcel, readInt);
                            break;
                        case '\b':
                            str6 = f8g.v(parcel, readInt);
                            break;
                        case '\t':
                            str7 = f8g.v(parcel, readInt);
                            break;
                        case '\n':
                            str8 = f8g.v(parcel, readInt);
                            break;
                        case 11:
                            j2 = f8g.T(parcel, readInt);
                            break;
                        case '\f':
                            str9 = f8g.v(parcel, readInt);
                            break;
                        case '\r':
                            vytVar = (vyt) f8g.u(parcel, readInt, vyt.CREATOR);
                            break;
                        default:
                            f8g.W(parcel, readInt);
                            break;
                    }
                }
                f8g.B(parcel, f0);
                return new wi(str, str2, j, str3, str4, str5, str6, str7, str8, j2, str9, vytVar);
            case 1:
                int f02 = f8g.f0(parcel);
                String str10 = null;
                String str11 = null;
                String str12 = null;
                String str13 = null;
                String str14 = null;
                String str15 = null;
                String str16 = null;
                String str17 = null;
                String str18 = null;
                boolean z = false;
                String str19 = null;
                while (parcel.dataPosition() < f02) {
                    int readInt2 = parcel.readInt();
                    switch ((char) readInt2) {
                        case 2:
                            str10 = f8g.v(parcel, readInt2);
                            break;
                        case 3:
                            str19 = f8g.v(parcel, readInt2);
                            break;
                        case 4:
                            str11 = f8g.v(parcel, readInt2);
                            break;
                        case 5:
                            str12 = f8g.v(parcel, readInt2);
                            break;
                        case 6:
                            str13 = f8g.v(parcel, readInt2);
                            break;
                        case 7:
                            str14 = f8g.v(parcel, readInt2);
                            break;
                        case '\b':
                            str15 = f8g.v(parcel, readInt2);
                            break;
                        case '\t':
                            str16 = f8g.v(parcel, readInt2);
                            break;
                        case '\n':
                            str17 = f8g.v(parcel, readInt2);
                            break;
                        case 11:
                            z = f8g.M(parcel, readInt2);
                            break;
                        case '\f':
                            str18 = f8g.v(parcel, readInt2);
                            break;
                        default:
                            f8g.W(parcel, readInt2);
                            break;
                    }
                }
                f8g.B(parcel, f02);
                b3x b3xVar = new b3x();
                b3xVar.a = str10;
                b3xVar.b = str19;
                b3xVar.c = str11;
                b3xVar.d = str12;
                b3xVar.e = str13;
                b3xVar.f = str14;
                b3xVar.g = str15;
                b3xVar.h = str16;
                b3xVar.i = str17;
                b3xVar.j = z;
                b3xVar.k = str18;
                return b3xVar;
            case 2:
                int f03 = f8g.f0(parcel);
                boolean z2 = false;
                boolean z3 = false;
                String str20 = null;
                String str21 = null;
                IBinder iBinder = null;
                mfj mfjVar = null;
                while (parcel.dataPosition() < f03) {
                    int readInt3 = parcel.readInt();
                    switch ((char) readInt3) {
                        case 2:
                            str20 = f8g.v(parcel, readInt3);
                            break;
                        case 3:
                            str21 = f8g.v(parcel, readInt3);
                            break;
                        case 4:
                            iBinder = f8g.Q(parcel, readInt3);
                            break;
                        case 5:
                            mfjVar = (mfj) f8g.u(parcel, readInt3, mfj.CREATOR);
                            break;
                        case 6:
                            z2 = f8g.M(parcel, readInt3);
                            break;
                        case 7:
                            z3 = f8g.M(parcel, readInt3);
                            break;
                        default:
                            f8g.W(parcel, readInt3);
                            break;
                    }
                }
                f8g.B(parcel, f03);
                return new g74(str20, str21, iBinder, mfjVar, z2, z3);
            case 3:
                int f04 = f8g.f0(parcel);
                Intent intent = null;
                while (parcel.dataPosition() < f04) {
                    int readInt4 = parcel.readInt();
                    if (((char) readInt4) != 1) {
                        f8g.W(parcel, readInt4);
                    } else {
                        intent = (Intent) f8g.u(parcel, readInt4, Intent.CREATOR);
                    }
                }
                f8g.B(parcel, f04);
                return new kq4(intent);
            case 4:
                int f05 = f8g.f0(parcel);
                String str22 = null;
                int i = 0;
                while (parcel.dataPosition() < f05) {
                    int readInt5 = parcel.readInt();
                    char c = (char) readInt5;
                    if (c == 1) {
                        i = f8g.R(parcel, readInt5);
                    } else if (c != 2) {
                        f8g.W(parcel, readInt5);
                    } else {
                        str22 = f8g.v(parcel, readInt5);
                    }
                }
                f8g.B(parcel, f05);
                return new Scope(i, str22);
            case 5:
                int f06 = f8g.f0(parcel);
                boolean z4 = false;
                while (parcel.dataPosition() < f06) {
                    int readInt6 = parcel.readInt();
                    if (((char) readInt6) != 1) {
                        f8g.W(parcel, readInt6);
                    } else {
                        z4 = f8g.M(parcel, readInt6);
                    }
                }
                f8g.B(parcel, f06);
                return new lox(z4);
            case 6:
                int f07 = f8g.f0(parcel);
                int i2 = 0;
                Bundle bundle = null;
                while (parcel.dataPosition() < f07) {
                    int readInt7 = parcel.readInt();
                    char c2 = (char) readInt7;
                    if (c2 == 2) {
                        i2 = f8g.R(parcel, readInt7);
                    } else if (c2 != 3) {
                        f8g.W(parcel, readInt7);
                    } else {
                        bundle = f8g.p(parcel, readInt7);
                    }
                }
                f8g.B(parcel, f07);
                tfk tfkVar = new tfk();
                new Bundle();
                tfkVar.a = i2;
                tfkVar.b = bundle;
                return tfkVar;
            case 7:
                int f08 = f8g.f0(parcel);
                int i3 = 0;
                boolean z5 = false;
                boolean z6 = false;
                boolean z7 = false;
                String str23 = null;
                String str24 = null;
                String str25 = null;
                String str26 = null;
                String str27 = null;
                while (parcel.dataPosition() < f08) {
                    int readInt8 = parcel.readInt();
                    switch ((char) readInt8) {
                        case 2:
                            i3 = f8g.R(parcel, readInt8);
                            break;
                        case 3:
                            z5 = f8g.M(parcel, readInt8);
                            break;
                        case 4:
                            z6 = f8g.M(parcel, readInt8);
                            break;
                        case 5:
                            str23 = f8g.v(parcel, readInt8);
                            break;
                        case 6:
                            str24 = f8g.v(parcel, readInt8);
                            break;
                        case 7:
                            str25 = f8g.v(parcel, readInt8);
                            break;
                        case '\b':
                            str26 = f8g.v(parcel, readInt8);
                            break;
                        case '\t':
                            str27 = f8g.v(parcel, readInt8);
                            break;
                        case '\n':
                            z7 = f8g.M(parcel, readInt8);
                            break;
                        default:
                            f8g.W(parcel, readInt8);
                            break;
                    }
                }
                f8g.B(parcel, f08);
                return new e0x(i3, z5, z6, str23, str24, str25, str26, str27, z7);
            case 8:
                int f09 = f8g.f0(parcel);
                long j3 = 0;
                while (parcel.dataPosition() < f09) {
                    int readInt9 = parcel.readInt();
                    if (((char) readInt9) != 1) {
                        f8g.W(parcel, readInt9);
                    } else {
                        j3 = f8g.T(parcel, readInt9);
                    }
                }
                f8g.B(parcel, f09);
                return new f0x(j3);
            case 9:
                int f010 = f8g.f0(parcel);
                double d = 0.0d;
                jw0 jw0Var = null;
                a2x a2xVar = null;
                boolean z8 = false;
                int i4 = 0;
                int i5 = 0;
                double d2 = 0.0d;
                while (parcel.dataPosition() < f010) {
                    int readInt10 = parcel.readInt();
                    switch ((char) readInt10) {
                        case 2:
                            d = f8g.O(parcel, readInt10);
                            break;
                        case 3:
                            z8 = f8g.M(parcel, readInt10);
                            break;
                        case 4:
                            i4 = f8g.R(parcel, readInt10);
                            break;
                        case 5:
                            jw0Var = (jw0) f8g.u(parcel, readInt10, jw0.CREATOR);
                            break;
                        case 6:
                            i5 = f8g.R(parcel, readInt10);
                            break;
                        case 7:
                            a2xVar = (a2x) f8g.u(parcel, readInt10, a2x.CREATOR);
                            break;
                        case '\b':
                            d2 = f8g.O(parcel, readInt10);
                            break;
                        default:
                            f8g.W(parcel, readInt10);
                            break;
                    }
                }
                f8g.B(parcel, f010);
                j0x j0xVar = new j0x();
                j0xVar.a = d;
                j0xVar.b = z8;
                j0xVar.c = i4;
                j0xVar.d = jw0Var;
                j0xVar.e = i5;
                j0xVar.f = a2xVar;
                j0xVar.g = d2;
                return j0xVar;
            case 10:
                int f011 = f8g.f0(parcel);
                boolean z9 = false;
                while (parcel.dataPosition() < f011) {
                    int readInt11 = parcel.readInt();
                    if (((char) readInt11) != 1) {
                        f8g.W(parcel, readInt11);
                    } else {
                        z9 = f8g.M(parcel, readInt11);
                    }
                }
                f8g.B(parcel, f011);
                return new n0x(z9);
            case 11:
                int f012 = f8g.f0(parcel);
                String str28 = null;
                int i6 = 0;
                int i7 = 0;
                String str29 = null;
                while (parcel.dataPosition() < f012) {
                    int readInt12 = parcel.readInt();
                    char c3 = (char) readInt12;
                    if (c3 == 2) {
                        str28 = f8g.v(parcel, readInt12);
                    } else if (c3 == 3) {
                        str29 = f8g.v(parcel, readInt12);
                    } else if (c3 == 4) {
                        i6 = f8g.R(parcel, readInt12);
                    } else if (c3 != 5) {
                        f8g.W(parcel, readInt12);
                    } else {
                        i7 = f8g.R(parcel, readInt12);
                    }
                }
                f8g.B(parcel, f012);
                l0x l0xVar = new l0x();
                l0xVar.a = str28;
                l0xVar.b = str29;
                l0xVar.c = i6;
                l0xVar.d = i7;
                return l0xVar;
            case 12:
                int f013 = f8g.f0(parcel);
                boolean z10 = false;
                while (parcel.dataPosition() < f013) {
                    int readInt13 = parcel.readInt();
                    if (((char) readInt13) != 1) {
                        f8g.W(parcel, readInt13);
                    } else {
                        z10 = f8g.M(parcel, readInt13);
                    }
                }
                f8g.B(parcel, f013);
                return new xnd(z10);
            case 13:
                int f014 = f8g.f0(parcel);
                ArrayList arrayList = null;
                while (parcel.dataPosition() < f014) {
                    int readInt14 = parcel.readInt();
                    if (((char) readInt14) != 1) {
                        f8g.W(parcel, readInt14);
                    } else {
                        arrayList = f8g.x(parcel, readInt14);
                    }
                }
                f8g.B(parcel, f014);
                idq idqVar = new idq();
                idqVar.a = arrayList;
                return idqVar;
            case 14:
                int f015 = f8g.f0(parcel);
                String str30 = null;
                while (parcel.dataPosition() < f015) {
                    int readInt15 = parcel.readInt();
                    if (((char) readInt15) != 1) {
                        f8g.W(parcel, readInt15);
                    } else {
                        str30 = f8g.v(parcel, readInt15);
                    }
                }
                f8g.B(parcel, f015);
                return new v0x(str30);
            case 15:
                int f016 = f8g.f0(parcel);
                int i8 = 0;
                String str31 = null;
                String str32 = null;
                while (parcel.dataPosition() < f016) {
                    int readInt16 = parcel.readInt();
                    char c4 = (char) readInt16;
                    if (c4 == 1) {
                        i8 = f8g.R(parcel, readInt16);
                    } else if (c4 == 2) {
                        str31 = f8g.v(parcel, readInt16);
                    } else if (c4 != 3) {
                        f8g.W(parcel, readInt16);
                    } else {
                        str32 = f8g.v(parcel, readInt16);
                    }
                }
                f8g.B(parcel, f016);
                n6t n6tVar = new n6t();
                n6tVar.a = i8;
                n6tVar.b = str31;
                n6tVar.c = str32;
                return n6tVar;
            case 16:
                int f017 = f8g.f0(parcel);
                int i9 = 0;
                int i10 = 0;
                int i11 = 0;
                boolean z11 = false;
                boolean z12 = false;
                while (parcel.dataPosition() < f017) {
                    int readInt17 = parcel.readInt();
                    char c5 = (char) readInt17;
                    if (c5 == 1) {
                        i9 = f8g.R(parcel, readInt17);
                    } else if (c5 == 2) {
                        z11 = f8g.M(parcel, readInt17);
                    } else if (c5 == 3) {
                        z12 = f8g.M(parcel, readInt17);
                    } else if (c5 == 4) {
                        i10 = f8g.R(parcel, readInt17);
                    } else if (c5 != 5) {
                        f8g.W(parcel, readInt17);
                    } else {
                        i11 = f8g.R(parcel, readInt17);
                    }
                }
                f8g.B(parcel, f017);
                return new ffo(i9, i10, i11, z11, z12);
            case 17:
                int f018 = f8g.f0(parcel);
                int i12 = 0;
                byte[] bArr = null;
                byte[] bArr2 = null;
                byte[] bArr3 = null;
                while (parcel.dataPosition() < f018) {
                    int readInt18 = parcel.readInt();
                    char c6 = (char) readInt18;
                    if (c6 == 1) {
                        bArr = f8g.q(parcel, readInt18);
                    } else if (c6 == 2) {
                        bArr2 = f8g.q(parcel, readInt18);
                    } else if (c6 == 3) {
                        bArr3 = f8g.q(parcel, readInt18);
                    } else if (c6 != 4) {
                        f8g.W(parcel, readInt18);
                    } else {
                        i12 = f8g.R(parcel, readInt18);
                    }
                }
                f8g.B(parcel, f018);
                return new a1x(bArr == null ? null : obx.t(bArr.length, bArr), bArr2 == null ? null : obx.t(bArr2.length, bArr2), bArr3 != null ? obx.t(bArr3.length, bArr3) : null, i12);
            case 18:
                int f019 = f8g.f0(parcel);
                while (true) {
                    byte[][] bArr4 = null;
                    while (parcel.dataPosition() < f019) {
                        int readInt19 = parcel.readInt();
                        if (((char) readInt19) != 1) {
                            f8g.W(parcel, readInt19);
                        } else {
                            int V = f8g.V(parcel, readInt19);
                            int dataPosition = parcel.dataPosition();
                            if (V == 0) {
                                break;
                            }
                            int readInt20 = parcel.readInt();
                            byte[][] bArr5 = new byte[readInt20][];
                            for (int i13 = 0; i13 < readInt20; i13++) {
                                bArr5[i13] = parcel.createByteArray();
                            }
                            parcel.setDataPosition(dataPosition + V);
                            bArr4 = bArr5;
                        }
                    }
                    f8g.B(parcel, f019);
                    return new g1x(bArr4);
                    break;
                }
            case 19:
                int f020 = f8g.f0(parcel);
                String str33 = null;
                while (parcel.dataPosition() < f020) {
                    int readInt21 = parcel.readInt();
                    if (((char) readInt21) != 2) {
                        f8g.W(parcel, readInt21);
                    } else {
                        str33 = f8g.v(parcel, readInt21);
                    }
                }
                f8g.B(parcel, f020);
                o1x o1xVar = new o1x();
                o1xVar.a = str33;
                return o1xVar;
            case 20:
                int f021 = f8g.f0(parcel);
                m0n m0nVar = null;
                p0n p0nVar = null;
                byte[] bArr6 = null;
                ArrayList arrayList2 = null;
                Double d3 = null;
                ArrayList arrayList3 = null;
                s02 s02Var = null;
                Integer num = null;
                pns pnsVar = null;
                String str34 = null;
                zz1 zz1Var = null;
                String str35 = null;
                ResultReceiver resultReceiver = null;
                while (parcel.dataPosition() < f021) {
                    int readInt22 = parcel.readInt();
                    switch ((char) readInt22) {
                        case 2:
                            m0nVar = (m0n) f8g.u(parcel, readInt22, m0n.CREATOR);
                            break;
                        case 3:
                            p0nVar = (p0n) f8g.u(parcel, readInt22, p0n.CREATOR);
                            break;
                        case 4:
                            bArr6 = f8g.q(parcel, readInt22);
                            break;
                        case 5:
                            arrayList2 = f8g.z(parcel, readInt22, l0n.CREATOR);
                            break;
                        case 6:
                            int V2 = f8g.V(parcel, readInt22);
                            if (V2 == 0) {
                                d3 = null;
                                break;
                            } else {
                                f8g.h0(V2, 8, parcel);
                                d3 = Double.valueOf(parcel.readDouble());
                                break;
                            }
                        case 7:
                            arrayList3 = f8g.z(parcel, readInt22, k0n.CREATOR);
                            break;
                        case '\b':
                            s02Var = (s02) f8g.u(parcel, readInt22, s02.CREATOR);
                            break;
                        case '\t':
                            num = f8g.S(parcel, readInt22);
                            break;
                        case '\n':
                            pnsVar = (pns) f8g.u(parcel, readInt22, pns.CREATOR);
                            break;
                        case 11:
                            str34 = f8g.v(parcel, readInt22);
                            break;
                        case '\f':
                            zz1Var = (zz1) f8g.u(parcel, readInt22, zz1.CREATOR);
                            break;
                        case '\r':
                            str35 = f8g.v(parcel, readInt22);
                            break;
                        case 14:
                            resultReceiver = (ResultReceiver) f8g.u(parcel, readInt22, ResultReceiver.CREATOR);
                            break;
                        default:
                            f8g.W(parcel, readInt22);
                            break;
                    }
                }
                f8g.B(parcel, f021);
                return new j0n(m0nVar, p0nVar, bArr6, arrayList2, d3, arrayList3, s02Var, num, pnsVar, str34, zz1Var, str35, resultReceiver);
            case 21:
                int f022 = f8g.f0(parcel);
                String str36 = null;
                String str37 = null;
                byte[] bArr7 = null;
                n02 n02Var = null;
                m02 m02Var = null;
                o02 o02Var = null;
                a02 a02Var = null;
                String str38 = null;
                while (parcel.dataPosition() < f022) {
                    int readInt23 = parcel.readInt();
                    switch ((char) readInt23) {
                        case 1:
                            str36 = f8g.v(parcel, readInt23);
                            break;
                        case 2:
                            str37 = f8g.v(parcel, readInt23);
                            break;
                        case 3:
                            bArr7 = f8g.q(parcel, readInt23);
                            break;
                        case 4:
                            n02Var = (n02) f8g.u(parcel, readInt23, n02.CREATOR);
                            break;
                        case 5:
                            m02Var = (m02) f8g.u(parcel, readInt23, m02.CREATOR);
                            break;
                        case 6:
                            o02Var = (o02) f8g.u(parcel, readInt23, o02.CREATOR);
                            break;
                        case 7:
                            a02Var = (a02) f8g.u(parcel, readInt23, a02.CREATOR);
                            break;
                        case '\b':
                            str38 = f8g.v(parcel, readInt23);
                            break;
                        case '\t':
                            f8g.v(parcel, readInt23);
                            break;
                        default:
                            f8g.W(parcel, readInt23);
                            break;
                    }
                }
                f8g.B(parcel, f022);
                return new g0n(str36, str37, bArr7, n02Var, m02Var, o02Var, a02Var, str38);
            case 22:
                int f023 = f8g.f0(parcel);
                String str39 = null;
                byte[] bArr8 = null;
                ArrayList arrayList4 = null;
                while (parcel.dataPosition() < f023) {
                    int readInt24 = parcel.readInt();
                    char c7 = (char) readInt24;
                    if (c7 == 2) {
                        str39 = f8g.v(parcel, readInt24);
                    } else if (c7 == 3) {
                        bArr8 = f8g.q(parcel, readInt24);
                    } else if (c7 != 4) {
                        f8g.W(parcel, readInt24);
                    } else {
                        arrayList4 = f8g.z(parcel, readInt24, Transport.CREATOR);
                    }
                }
                f8g.B(parcel, f023);
                return new k0n(str39, bArr8, arrayList4);
            case 23:
                int f024 = f8g.f0(parcel);
                String str40 = null;
                Integer num2 = null;
                while (parcel.dataPosition() < f024) {
                    int readInt25 = parcel.readInt();
                    char c8 = (char) readInt25;
                    if (c8 == 2) {
                        str40 = f8g.v(parcel, readInt25);
                    } else if (c8 != 3) {
                        f8g.W(parcel, readInt25);
                    } else {
                        num2 = f8g.S(parcel, readInt25);
                    }
                }
                f8g.B(parcel, f024);
                return new l0n(str40, num2.intValue());
            case 24:
                int f025 = f8g.f0(parcel);
                String str41 = null;
                String str42 = null;
                while (parcel.dataPosition() < f025) {
                    int readInt26 = parcel.readInt();
                    char c9 = (char) readInt26;
                    if (c9 == 1) {
                        str41 = f8g.v(parcel, readInt26);
                    } else if (c9 != 2) {
                        f8g.W(parcel, readInt26);
                    } else {
                        str42 = f8g.v(parcel, readInt26);
                    }
                }
                f8g.B(parcel, f025);
                return new wt6(str41, str42);
            case 25:
                int f026 = f8g.f0(parcel);
                float f = 0.0f;
                float f2 = 0.0f;
                float f3 = 0.0f;
                while (parcel.dataPosition() < f026) {
                    int readInt27 = parcel.readInt();
                    char c10 = (char) readInt27;
                    if (c10 == 2) {
                        f = f8g.P(parcel, readInt27);
                    } else if (c10 == 3) {
                        f2 = f8g.P(parcel, readInt27);
                    } else if (c10 != 4) {
                        f8g.W(parcel, readInt27);
                    } else {
                        f3 = f8g.P(parcel, readInt27);
                    }
                }
                f8g.B(parcel, f026);
                return new u1x(f, f2, f3);
            case 26:
                int f027 = f8g.f0(parcel);
                String str43 = null;
                String str44 = null;
                String str45 = null;
                while (parcel.dataPosition() < f027) {
                    int readInt28 = parcel.readInt();
                    char c11 = (char) readInt28;
                    if (c11 == 2) {
                        str43 = f8g.v(parcel, readInt28);
                    } else if (c11 == 3) {
                        str44 = f8g.v(parcel, readInt28);
                    } else if (c11 != 4) {
                        f8g.W(parcel, readInt28);
                    } else {
                        str45 = f8g.v(parcel, readInt28);
                    }
                }
                f8g.B(parcel, f027);
                return new m0n(str43, str44, str45);
            case 27:
                try {
                    return o0n.a(parcel.readString());
                } catch (n0n e) {
                    b6e.q(e);
                    return null;
                }
            case o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                int f028 = f8g.f0(parcel);
                u1x u1xVar = null;
                u1x u1xVar2 = null;
                while (parcel.dataPosition() < f028) {
                    int readInt29 = parcel.readInt();
                    char c12 = (char) readInt29;
                    if (c12 == 2) {
                        u1xVar = (u1x) f8g.u(parcel, readInt29, u1x.CREATOR);
                    } else if (c12 != 3) {
                        f8g.W(parcel, readInt29);
                    } else {
                        u1xVar2 = (u1x) f8g.u(parcel, readInt29, u1x.CREATOR);
                    }
                }
                f8g.B(parcel, f028);
                return new a2x(u1xVar, u1xVar2);
            default:
                int f029 = f8g.f0(parcel);
                byte[] bArr9 = null;
                String str46 = null;
                String str47 = null;
                String str48 = null;
                while (parcel.dataPosition() < f029) {
                    int readInt30 = parcel.readInt();
                    char c13 = (char) readInt30;
                    if (c13 == 2) {
                        bArr9 = f8g.q(parcel, readInt30);
                    } else if (c13 == 3) {
                        str46 = f8g.v(parcel, readInt30);
                    } else if (c13 == 4) {
                        str47 = f8g.v(parcel, readInt30);
                    } else if (c13 != 5) {
                        f8g.W(parcel, readInt30);
                    } else {
                        str48 = f8g.v(parcel, readInt30);
                    }
                }
                f8g.B(parcel, f029);
                return new p0n(str46, str47, str48, bArr9);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new wi[i];
            case 1:
                return new b3x[i];
            case 2:
                return new g74[i];
            case 3:
                return new kq4[i];
            case 4:
                return new Scope[i];
            case 5:
                return new lox[i];
            case 6:
                return new tfk[i];
            case 7:
                return new e0x[i];
            case 8:
                return new f0x[i];
            case 9:
                return new j0x[i];
            case 10:
                return new n0x[i];
            case 11:
                return new l0x[i];
            case 12:
                return new xnd[i];
            case 13:
                return new idq[i];
            case 14:
                return new v0x[i];
            case 15:
                return new n6t[i];
            case 16:
                return new ffo[i];
            case 17:
                return new a1x[i];
            case 18:
                return new g1x[i];
            case 19:
                return new o1x[i];
            case 20:
                return new j0n[i];
            case 21:
                return new g0n[i];
            case 22:
                return new k0n[i];
            case 23:
                return new l0n[i];
            case 24:
                return new wt6[i];
            case 25:
                return new u1x[i];
            case 26:
                return new m0n[i];
            case 27:
                return new o0n[i];
            case o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                return new a2x[i];
            default:
                return new p0n[i];
        }
    }
}
