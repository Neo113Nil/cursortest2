package defpackage;

import android.accounts.Account;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.widget.RemoteViews;
import com.google.android.gms.cast.CastDevice;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.identity.intents.model.UserAddress;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.wallet.MaskedWallet;
import com.google.android.gms.wallet.wobs.CommonWalletObject;
import com.yandex.pulse.metrics.o;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class oex implements Parcelable.Creator {
    public final /* synthetic */ int a;

    public /* synthetic */ oex(int i) {
        this.a = i;
    }

    public static void a(gbd gbdVar, Parcel parcel, int i) {
        int o0 = o8g.o0(parcel, 20293);
        int i2 = gbdVar.a;
        o8g.q0(1, 4, parcel);
        parcel.writeInt(i2);
        int i3 = gbdVar.b;
        o8g.q0(2, 4, parcel);
        parcel.writeInt(i3);
        int i4 = gbdVar.c;
        o8g.q0(3, 4, parcel);
        parcel.writeInt(i4);
        o8g.j0(parcel, 4, gbdVar.d);
        o8g.d0(parcel, 5, gbdVar.e);
        o8g.m0(parcel, 6, gbdVar.f, i);
        o8g.b0(parcel, 7, gbdVar.g);
        o8g.i0(parcel, 8, gbdVar.h, i);
        o8g.m0(parcel, 10, gbdVar.i, i);
        o8g.m0(parcel, 11, gbdVar.j, i);
        boolean z = gbdVar.k;
        o8g.q0(12, 4, parcel);
        parcel.writeInt(z ? 1 : 0);
        int i5 = gbdVar.l;
        o8g.q0(13, 4, parcel);
        parcel.writeInt(i5);
        boolean z2 = gbdVar.m;
        o8g.q0(14, 4, parcel);
        parcel.writeInt(z2 ? 1 : 0);
        o8g.j0(parcel, 15, gbdVar.n);
        o8g.p0(parcel, o0);
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.a) {
            case 0:
                int f0 = f8g.f0(parcel);
                byte[] bArr = null;
                byte[] bArr2 = null;
                byte[] bArr3 = null;
                byte[] bArr4 = null;
                byte[] bArr5 = null;
                while (parcel.dataPosition() < f0) {
                    int readInt = parcel.readInt();
                    char c = (char) readInt;
                    if (c == 2) {
                        bArr = f8g.q(parcel, readInt);
                    } else if (c == 3) {
                        bArr2 = f8g.q(parcel, readInt);
                    } else if (c == 4) {
                        bArr3 = f8g.q(parcel, readInt);
                    } else if (c == 5) {
                        bArr4 = f8g.q(parcel, readInt);
                    } else if (c != 6) {
                        f8g.W(parcel, readInt);
                    } else {
                        bArr5 = f8g.q(parcel, readInt);
                    }
                }
                f8g.B(parcel, f0);
                return new m02(bArr, bArr2, bArr3, bArr4, bArr5);
            case 1:
                int f02 = f8g.f0(parcel);
                byte[] bArr6 = null;
                while (parcel.dataPosition() < f02) {
                    int readInt2 = parcel.readInt();
                    if (((char) readInt2) != 2) {
                        f8g.W(parcel, readInt2);
                    } else {
                        bArr6 = f8g.q(parcel, readInt2);
                    }
                }
                f8g.B(parcel, f02);
                sax saxVar = new sax();
                saxVar.a = bArr6;
                return saxVar;
            case 2:
                int f03 = f8g.f0(parcel);
                String str = null;
                String str2 = null;
                while (parcel.dataPosition() < f03) {
                    int readInt3 = parcel.readInt();
                    char c2 = (char) readInt3;
                    if (c2 == 2) {
                        str = f8g.v(parcel, readInt3);
                    } else if (c2 != 3) {
                        f8g.W(parcel, readInt3);
                    } else {
                        str2 = f8g.v(parcel, readInt3);
                    }
                }
                f8g.B(parcel, f03);
                jds jdsVar = new jds();
                jdsVar.a = str;
                jdsVar.b = str2;
                return jdsVar;
            case 3:
                int f04 = f8g.f0(parcel);
                long j = 0;
                long j2 = 0;
                while (parcel.dataPosition() < f04) {
                    int readInt4 = parcel.readInt();
                    char c3 = (char) readInt4;
                    if (c3 == 2) {
                        j = f8g.T(parcel, readInt4);
                    } else if (c3 != 3) {
                        f8g.W(parcel, readInt4);
                    } else {
                        j2 = f8g.T(parcel, readInt4);
                    }
                }
                f8g.B(parcel, f04);
                khs khsVar = new khs();
                khsVar.a = j;
                khsVar.b = j2;
                return khsVar;
            case 4:
                int f05 = f8g.f0(parcel);
                byte[] bArr7 = null;
                byte[] bArr8 = null;
                byte[] bArr9 = null;
                String[] strArr = null;
                while (parcel.dataPosition() < f05) {
                    int readInt5 = parcel.readInt();
                    char c4 = (char) readInt5;
                    if (c4 == 2) {
                        bArr7 = f8g.q(parcel, readInt5);
                    } else if (c4 == 3) {
                        bArr8 = f8g.q(parcel, readInt5);
                    } else if (c4 == 4) {
                        bArr9 = f8g.q(parcel, readInt5);
                    } else if (c4 != 5) {
                        f8g.W(parcel, readInt5);
                    } else {
                        strArr = f8g.w(parcel, readInt5);
                    }
                }
                f8g.B(parcel, f05);
                return new n02(bArr7, bArr8, bArr9, strArr);
            case 5:
                int f06 = f8g.f0(parcel);
                boolean z = false;
                while (parcel.dataPosition() < f06) {
                    int readInt6 = parcel.readInt();
                    if (((char) readInt6) != 2) {
                        f8g.W(parcel, readInt6);
                    } else {
                        z = f8g.M(parcel, readInt6);
                    }
                }
                f8g.B(parcel, f06);
                return new qex(z);
            case 6:
                int f07 = f8g.f0(parcel);
                byte[] bArr10 = null;
                while (parcel.dataPosition() < f07) {
                    int readInt7 = parcel.readInt();
                    if (((char) readInt7) != 2) {
                        f8g.W(parcel, readInt7);
                    } else {
                        bArr10 = f8g.q(parcel, readInt7);
                    }
                }
                f8g.B(parcel, f07);
                pdx pdxVar = new pdx();
                pdxVar.a = bArr10;
                return pdxVar;
            case 7:
                int f08 = f8g.f0(parcel);
                String str3 = null;
                int i = 0;
                String str4 = null;
                while (parcel.dataPosition() < f08) {
                    int readInt8 = parcel.readInt();
                    char c5 = (char) readInt8;
                    if (c5 == 2) {
                        str3 = f8g.v(parcel, readInt8);
                    } else if (c5 == 3) {
                        str4 = f8g.v(parcel, readInt8);
                    } else if (c5 != 4) {
                        f8g.W(parcel, readInt8);
                    } else {
                        i = f8g.R(parcel, readInt8);
                    }
                }
                f8g.B(parcel, f08);
                epe epeVar = new epe();
                epeVar.a = str3;
                epeVar.b = str4;
                epeVar.c = i;
                return epeVar;
            case 8:
                int f09 = f8g.f0(parcel);
                String str5 = null;
                String str6 = null;
                while (parcel.dataPosition() < f09) {
                    int readInt9 = parcel.readInt();
                    char c6 = (char) readInt9;
                    if (c6 == 2) {
                        str5 = f8g.v(parcel, readInt9);
                    } else if (c6 != 3) {
                        f8g.W(parcel, readInt9);
                    } else {
                        str6 = f8g.v(parcel, readInt9);
                    }
                }
                f8g.B(parcel, f09);
                ept eptVar = new ept();
                eptVar.a = str5;
                eptVar.b = str6;
                return eptVar;
            case 9:
                int f010 = f8g.f0(parcel);
                Bundle bundle = null;
                q66 q66Var = null;
                int i2 = 0;
                i6c[] i6cVarArr = null;
                while (parcel.dataPosition() < f010) {
                    int readInt10 = parcel.readInt();
                    char c7 = (char) readInt10;
                    if (c7 == 1) {
                        bundle = f8g.p(parcel, readInt10);
                    } else if (c7 == 2) {
                        i6cVarArr = (i6c[]) f8g.y(parcel, readInt10, i6c.CREATOR);
                    } else if (c7 == 3) {
                        i2 = f8g.R(parcel, readInt10);
                    } else if (c7 != 4) {
                        f8g.W(parcel, readInt10);
                    } else {
                        q66Var = (q66) f8g.u(parcel, readInt10, q66.CREATOR);
                    }
                }
                f8g.B(parcel, f010);
                gfx gfxVar = new gfx();
                gfxVar.a = bundle;
                gfxVar.b = i6cVarArr;
                gfxVar.c = i2;
                gfxVar.d = q66Var;
                return gfxVar;
            case 10:
                int f011 = f8g.f0(parcel);
                int i3 = 0;
                String str7 = null;
                int i4 = 0;
                while (parcel.dataPosition() < f011) {
                    int readInt11 = parcel.readInt();
                    char c8 = (char) readInt11;
                    if (c8 == 2) {
                        i3 = f8g.R(parcel, readInt11);
                    } else if (c8 == 3) {
                        str7 = f8g.v(parcel, readInt11);
                    } else if (c8 != 4) {
                        f8g.W(parcel, readInt11);
                    } else {
                        i4 = f8g.R(parcel, readInt11);
                    }
                }
                f8g.B(parcel, f011);
                return new o02(i3, str7, i4);
            case 11:
                int f012 = f8g.f0(parcel);
                int i5 = 0;
                while (parcel.dataPosition() < f012) {
                    int readInt12 = parcel.readInt();
                    if (((char) readInt12) != 2) {
                        f8g.W(parcel, readInt12);
                    } else {
                        i5 = f8g.R(parcel, readInt12);
                    }
                }
                f8g.B(parcel, f012);
                return new agx(i5);
            case 12:
                int f013 = f8g.f0(parcel);
                ffo ffoVar = null;
                int[] iArr = null;
                int[] iArr2 = null;
                boolean z2 = false;
                boolean z3 = false;
                int i6 = 0;
                while (parcel.dataPosition() < f013) {
                    int readInt13 = parcel.readInt();
                    switch ((char) readInt13) {
                        case 1:
                            ffoVar = (ffo) f8g.u(parcel, readInt13, ffo.CREATOR);
                            break;
                        case 2:
                            z2 = f8g.M(parcel, readInt13);
                            break;
                        case 3:
                            z3 = f8g.M(parcel, readInt13);
                            break;
                        case 4:
                            iArr = f8g.r(parcel, readInt13);
                            break;
                        case 5:
                            i6 = f8g.R(parcel, readInt13);
                            break;
                        case 6:
                            iArr2 = f8g.r(parcel, readInt13);
                            break;
                        default:
                            f8g.W(parcel, readInt13);
                            break;
                    }
                }
                f8g.B(parcel, f013);
                return new q66(ffoVar, z2, z3, iArr, i6, iArr2);
            case 13:
                int f014 = f8g.f0(parcel);
                String str8 = null;
                Boolean bool = null;
                String str9 = null;
                String str10 = null;
                while (parcel.dataPosition() < f014) {
                    int readInt14 = parcel.readInt();
                    char c9 = (char) readInt14;
                    if (c9 == 2) {
                        str8 = f8g.v(parcel, readInt14);
                    } else if (c9 == 3) {
                        bool = f8g.N(parcel, readInt14);
                    } else if (c9 == 4) {
                        str9 = f8g.v(parcel, readInt14);
                    } else if (c9 != 5) {
                        f8g.W(parcel, readInt14);
                    } else {
                        str10 = f8g.v(parcel, readInt14);
                    }
                }
                f8g.B(parcel, f014);
                return new s02(str8, str9, bool, str10);
            case 14:
                int f015 = f8g.f0(parcel);
                byte[] bArr11 = null;
                while (parcel.dataPosition() < f015) {
                    int readInt15 = parcel.readInt();
                    if (((char) readInt15) != 1) {
                        f8g.W(parcel, readInt15);
                    } else {
                        bArr11 = f8g.q(parcel, readInt15);
                    }
                }
                f8g.B(parcel, f015);
                cfx cfxVar = new cfx();
                cfxVar.a = bArr11;
                return cfxVar;
            case 15:
                int f016 = f8g.f0(parcel);
                ArrayList arrayList = null;
                String str11 = null;
                ArrayList arrayList2 = null;
                String str12 = null;
                boolean z4 = false;
                String str13 = null;
                while (parcel.dataPosition() < f016) {
                    int readInt16 = parcel.readInt();
                    switch ((char) readInt16) {
                        case 2:
                            arrayList = f8g.s(parcel, readInt16);
                            break;
                        case 3:
                        default:
                            f8g.W(parcel, readInt16);
                            break;
                        case 4:
                            str13 = f8g.v(parcel, readInt16);
                            break;
                        case 5:
                            str11 = f8g.v(parcel, readInt16);
                            break;
                        case 6:
                            arrayList2 = f8g.s(parcel, readInt16);
                            break;
                        case 7:
                            z4 = f8g.M(parcel, readInt16);
                            break;
                        case '\b':
                            str12 = f8g.v(parcel, readInt16);
                            break;
                    }
                }
                f8g.B(parcel, f016);
                sye syeVar = new sye();
                syeVar.a = arrayList;
                syeVar.b = str13;
                syeVar.c = str11;
                syeVar.d = arrayList2;
                syeVar.e = z4;
                syeVar.f = str12;
                return syeVar;
            case 16:
                int f017 = f8g.f0(parcel);
                String str14 = null;
                String str15 = null;
                khs khsVar2 = null;
                ept eptVar2 = null;
                ept eptVar3 = null;
                while (parcel.dataPosition() < f017) {
                    int readInt17 = parcel.readInt();
                    char c10 = (char) readInt17;
                    if (c10 == 2) {
                        str14 = f8g.v(parcel, readInt17);
                    } else if (c10 == 3) {
                        str15 = f8g.v(parcel, readInt17);
                    } else if (c10 == 4) {
                        khsVar2 = (khs) f8g.u(parcel, readInt17, khs.CREATOR);
                    } else if (c10 == 5) {
                        eptVar2 = (ept) f8g.u(parcel, readInt17, ept.CREATOR);
                    } else if (c10 != 6) {
                        f8g.W(parcel, readInt17);
                    } else {
                        eptVar3 = (ept) f8g.u(parcel, readInt17, ept.CREATOR);
                    }
                }
                f8g.B(parcel, f017);
                pku pkuVar = new pku();
                pkuVar.a = str14;
                pkuVar.b = str15;
                pkuVar.c = khsVar2;
                pkuVar.d = eptVar2;
                pkuVar.e = eptVar3;
                return pkuVar;
            case 17:
                int f018 = f8g.f0(parcel);
                String str16 = null;
                ArrayList arrayList3 = null;
                mnf mnfVar = null;
                g74 g74Var = null;
                ArrayList arrayList4 = null;
                qex qexVar = null;
                agx agxVar = null;
                boolean z5 = false;
                boolean z6 = false;
                boolean z7 = false;
                boolean z8 = false;
                boolean z9 = false;
                boolean z10 = false;
                boolean z11 = false;
                boolean z12 = false;
                double d = 0.0d;
                while (parcel.dataPosition() < f018) {
                    int readInt18 = parcel.readInt();
                    switch ((char) readInt18) {
                        case 2:
                            str16 = f8g.v(parcel, readInt18);
                            break;
                        case 3:
                            arrayList3 = f8g.x(parcel, readInt18);
                            break;
                        case 4:
                            z5 = f8g.M(parcel, readInt18);
                            break;
                        case 5:
                            mnfVar = (mnf) f8g.u(parcel, readInt18, mnf.CREATOR);
                            break;
                        case 6:
                            z6 = f8g.M(parcel, readInt18);
                            break;
                        case 7:
                            g74Var = (g74) f8g.u(parcel, readInt18, g74.CREATOR);
                            break;
                        case '\b':
                            z7 = f8g.M(parcel, readInt18);
                            break;
                        case '\t':
                            d = f8g.O(parcel, readInt18);
                            break;
                        case '\n':
                            z8 = f8g.M(parcel, readInt18);
                            break;
                        case 11:
                            z9 = f8g.M(parcel, readInt18);
                            break;
                        case '\f':
                            z10 = f8g.M(parcel, readInt18);
                            break;
                        case '\r':
                            arrayList4 = f8g.x(parcel, readInt18);
                            break;
                        case 14:
                            z11 = f8g.M(parcel, readInt18);
                            break;
                        case 15:
                            f8g.R(parcel, readInt18);
                            break;
                        case 16:
                            z12 = f8g.M(parcel, readInt18);
                            break;
                        case 17:
                            qexVar = (qex) f8g.u(parcel, readInt18, qex.CREATOR);
                            break;
                        case 18:
                            agxVar = (agx) f8g.u(parcel, readInt18, agx.CREATOR);
                            break;
                        default:
                            f8g.W(parcel, readInt18);
                            break;
                    }
                }
                f8g.B(parcel, f018);
                return new k74(str16, arrayList3, z5, mnfVar, z6, g74Var, z7, d, z8, z9, z10, arrayList4, z11, z12, qexVar, agxVar);
            case 18:
                int f019 = f8g.f0(parcel);
                Bundle bundle2 = new Bundle();
                Scope[] scopeArr = gbd.o;
                String str17 = null;
                IBinder iBinder = null;
                Account account = null;
                String str18 = null;
                int i7 = 0;
                int i8 = 0;
                int i9 = 0;
                boolean z13 = false;
                int i10 = 0;
                boolean z14 = false;
                i6c[] i6cVarArr2 = gbd.p;
                i6c[] i6cVarArr3 = i6cVarArr2;
                while (parcel.dataPosition() < f019) {
                    int readInt19 = parcel.readInt();
                    switch ((char) readInt19) {
                        case 1:
                            i7 = f8g.R(parcel, readInt19);
                            break;
                        case 2:
                            i8 = f8g.R(parcel, readInt19);
                            break;
                        case 3:
                            i9 = f8g.R(parcel, readInt19);
                            break;
                        case 4:
                            str17 = f8g.v(parcel, readInt19);
                            break;
                        case 5:
                            iBinder = f8g.Q(parcel, readInt19);
                            break;
                        case 6:
                            scopeArr = (Scope[]) f8g.y(parcel, readInt19, Scope.CREATOR);
                            break;
                        case 7:
                            bundle2 = f8g.p(parcel, readInt19);
                            break;
                        case '\b':
                            account = (Account) f8g.u(parcel, readInt19, Account.CREATOR);
                            break;
                        case '\t':
                        default:
                            f8g.W(parcel, readInt19);
                            break;
                        case '\n':
                            i6cVarArr2 = (i6c[]) f8g.y(parcel, readInt19, i6c.CREATOR);
                            break;
                        case 11:
                            i6cVarArr3 = (i6c[]) f8g.y(parcel, readInt19, i6c.CREATOR);
                            break;
                        case '\f':
                            z13 = f8g.M(parcel, readInt19);
                            break;
                        case '\r':
                            i10 = f8g.R(parcel, readInt19);
                            break;
                        case 14:
                            z14 = f8g.M(parcel, readInt19);
                            break;
                        case 15:
                            str18 = f8g.v(parcel, readInt19);
                            break;
                    }
                }
                f8g.B(parcel, f019);
                return new gbd(i7, i8, i9, str17, iBinder, scopeArr, bundle2, account, i6cVarArr2, i6cVarArr3, z13, i10, z14, str18);
            case 19:
                int f020 = f8g.f0(parcel);
                ArrayList arrayList5 = new ArrayList();
                ArrayList arrayList6 = new ArrayList();
                ArrayList arrayList7 = new ArrayList();
                String str19 = null;
                ArrayList arrayList8 = arrayList6;
                ArrayList arrayList9 = arrayList7;
                ArrayList arrayList10 = new ArrayList();
                ArrayList arrayList11 = new ArrayList();
                ArrayList arrayList12 = new ArrayList();
                String str20 = null;
                khs khsVar3 = null;
                String str21 = null;
                String str22 = null;
                String str23 = null;
                String str24 = null;
                String str25 = null;
                String str26 = null;
                String str27 = null;
                String str28 = null;
                String str29 = null;
                xzg xzgVar = null;
                int i11 = 0;
                boolean z15 = false;
                String str30 = null;
                while (parcel.dataPosition() < f020) {
                    int readInt20 = parcel.readInt();
                    khs khsVar4 = khsVar3;
                    switch ((char) readInt20) {
                        case 2:
                            str19 = f8g.v(parcel, readInt20);
                            break;
                        case 3:
                            str30 = f8g.v(parcel, readInt20);
                            break;
                        case 4:
                            str23 = f8g.v(parcel, readInt20);
                            break;
                        case 5:
                            str24 = f8g.v(parcel, readInt20);
                            break;
                        case 6:
                            str25 = f8g.v(parcel, readInt20);
                            break;
                        case 7:
                            str26 = f8g.v(parcel, readInt20);
                            break;
                        case '\b':
                            str27 = f8g.v(parcel, readInt20);
                            break;
                        case '\t':
                            str20 = f8g.v(parcel, readInt20);
                            break;
                        case '\n':
                            str22 = f8g.v(parcel, readInt20);
                            break;
                        case 11:
                            str21 = f8g.v(parcel, readInt20);
                            break;
                        case '\f':
                            i11 = f8g.R(parcel, readInt20);
                            break;
                        case '\r':
                            arrayList5 = f8g.z(parcel, readInt20, pku.CREATOR);
                            break;
                        case 14:
                            khsVar3 = (khs) f8g.u(parcel, readInt20, khs.CREATOR);
                            continue;
                        case 15:
                            arrayList8 = f8g.z(parcel, readInt20, LatLng.CREATOR);
                            break;
                        case 16:
                            str28 = f8g.v(parcel, readInt20);
                            break;
                        case 17:
                            str29 = f8g.v(parcel, readInt20);
                            break;
                        case 18:
                            arrayList9 = f8g.z(parcel, readInt20, tif.CREATOR);
                            break;
                        case 19:
                            z15 = f8g.M(parcel, readInt20);
                            break;
                        case 20:
                            arrayList10 = f8g.z(parcel, readInt20, ept.CREATOR);
                            break;
                        case 21:
                            arrayList11 = f8g.z(parcel, readInt20, jds.CREATOR);
                            break;
                        case 22:
                            arrayList12 = f8g.z(parcel, readInt20, ept.CREATOR);
                            break;
                        case 23:
                            xzgVar = (xzg) f8g.u(parcel, readInt20, xzg.CREATOR);
                            break;
                        default:
                            f8g.W(parcel, readInt20);
                            break;
                    }
                    khsVar3 = khsVar4;
                }
                f8g.B(parcel, f020);
                zzg zzgVar = new zzg();
                zzgVar.a = str19;
                zzgVar.b = str30;
                zzgVar.c = str23;
                zzgVar.d = str24;
                zzgVar.e = str25;
                zzgVar.f = str26;
                zzgVar.g = str27;
                zzgVar.h = str20;
                zzgVar.i = str22;
                zzgVar.j = str21;
                zzgVar.k = i11;
                zzgVar.l = arrayList5;
                zzgVar.m = khsVar3;
                zzgVar.n = arrayList8;
                zzgVar.o = str28;
                zzgVar.p = str29;
                zzgVar.q = arrayList9;
                zzgVar.r = z15;
                zzgVar.s = arrayList10;
                zzgVar.t = arrayList11;
                zzgVar.u = arrayList12;
                zzgVar.v = xzgVar;
                return zzgVar;
            case 20:
                try {
                    return yn3.a(parcel.readInt());
                } catch (xn3 e) {
                    b6e.q(e);
                    return null;
                }
            case 21:
                int f021 = f8g.f0(parcel);
                String[] strArr2 = null;
                int[] iArr3 = null;
                RemoteViews remoteViews = null;
                byte[] bArr12 = null;
                while (parcel.dataPosition() < f021) {
                    int readInt21 = parcel.readInt();
                    char c11 = (char) readInt21;
                    if (c11 == 1) {
                        strArr2 = f8g.w(parcel, readInt21);
                    } else if (c11 == 2) {
                        iArr3 = f8g.r(parcel, readInt21);
                    } else if (c11 == 3) {
                        remoteViews = (RemoteViews) f8g.u(parcel, readInt21, RemoteViews.CREATOR);
                    } else if (c11 != 4) {
                        f8g.W(parcel, readInt21);
                    } else {
                        bArr12 = f8g.q(parcel, readInt21);
                    }
                }
                f8g.B(parcel, f021);
                ngx ngxVar = new ngx();
                ngxVar.a = strArr2;
                ngxVar.b = iArr3;
                ngxVar.c = remoteViews;
                ngxVar.d = bArr12;
                return ngxVar;
            case 22:
                int f022 = f8g.f0(parcel);
                String str31 = null;
                String str32 = null;
                String[] strArr3 = null;
                String str33 = null;
                b3x b3xVar = null;
                b3x b3xVar2 = null;
                zzg[] zzgVarArr = null;
                vkj[] vkjVarArr = null;
                UserAddress userAddress = null;
                UserAddress userAddress2 = null;
                epe[] epeVarArr = null;
                while (parcel.dataPosition() < f022) {
                    int readInt22 = parcel.readInt();
                    switch ((char) readInt22) {
                        case 2:
                            str31 = f8g.v(parcel, readInt22);
                            break;
                        case 3:
                            str32 = f8g.v(parcel, readInt22);
                            break;
                        case 4:
                            strArr3 = f8g.w(parcel, readInt22);
                            break;
                        case 5:
                            str33 = f8g.v(parcel, readInt22);
                            break;
                        case 6:
                            b3xVar = (b3x) f8g.u(parcel, readInt22, b3x.CREATOR);
                            break;
                        case 7:
                            b3xVar2 = (b3x) f8g.u(parcel, readInt22, b3x.CREATOR);
                            break;
                        case '\b':
                            zzgVarArr = (zzg[]) f8g.y(parcel, readInt22, zzg.CREATOR);
                            break;
                        case '\t':
                            vkjVarArr = (vkj[]) f8g.y(parcel, readInt22, vkj.CREATOR);
                            break;
                        case '\n':
                            userAddress = (UserAddress) f8g.u(parcel, readInt22, UserAddress.CREATOR);
                            break;
                        case 11:
                            userAddress2 = (UserAddress) f8g.u(parcel, readInt22, UserAddress.CREATOR);
                            break;
                        case '\f':
                            epeVarArr = (epe[]) f8g.y(parcel, readInt22, epe.CREATOR);
                            break;
                        default:
                            f8g.W(parcel, readInt22);
                            break;
                    }
                }
                f8g.B(parcel, f022);
                MaskedWallet maskedWallet = new MaskedWallet();
                maskedWallet.a = str31;
                maskedWallet.b = str32;
                maskedWallet.c = strArr3;
                maskedWallet.d = str33;
                maskedWallet.e = b3xVar;
                maskedWallet.f = b3xVar2;
                maskedWallet.g = zzgVarArr;
                maskedWallet.h = vkjVarArr;
                maskedWallet.i = userAddress;
                maskedWallet.j = userAddress2;
                maskedWallet.k = epeVarArr;
                return maskedWallet;
            case 23:
                int f023 = f8g.f0(parcel);
                byte[] bArr13 = null;
                byte[] bArr14 = null;
                byte[] bArr15 = null;
                long j3 = 0;
                while (parcel.dataPosition() < f023) {
                    int readInt23 = parcel.readInt();
                    char c12 = (char) readInt23;
                    if (c12 == 1) {
                        j3 = f8g.T(parcel, readInt23);
                    } else if (c12 == 2) {
                        bArr13 = f8g.q(parcel, readInt23);
                    } else if (c12 == 3) {
                        bArr14 = f8g.q(parcel, readInt23);
                    } else if (c12 != 4) {
                        f8g.W(parcel, readInt23);
                    } else {
                        bArr15 = f8g.q(parcel, readInt23);
                    }
                }
                f8g.B(parcel, f023);
                return new sjx(j3, bArr13, bArr14, bArr15);
            case 24:
                int f024 = f8g.f0(parcel);
                int i12 = 0;
                String str34 = null;
                String str35 = null;
                CommonWalletObject commonWalletObject = null;
                while (parcel.dataPosition() < f024) {
                    int readInt24 = parcel.readInt();
                    char c13 = (char) readInt24;
                    if (c13 == 1) {
                        i12 = f8g.R(parcel, readInt24);
                    } else if (c13 == 2) {
                        str34 = f8g.v(parcel, readInt24);
                    } else if (c13 == 3) {
                        str35 = f8g.v(parcel, readInt24);
                    } else if (c13 != 4) {
                        f8g.W(parcel, readInt24);
                    } else {
                        commonWalletObject = (CommonWalletObject) f8g.u(parcel, readInt24, CommonWalletObject.CREATOR);
                    }
                }
                f8g.B(parcel, f024);
                return new vkj(i12, str34, str35, commonWalletObject);
            case 25:
                int f025 = f8g.f0(parcel);
                String str36 = null;
                String str37 = null;
                String str38 = null;
                String str39 = null;
                String str40 = null;
                ArrayList arrayList13 = null;
                String str41 = null;
                String str42 = null;
                String str43 = null;
                byte[] bArr16 = null;
                String str44 = null;
                e0x e0xVar = null;
                Integer num = null;
                int i13 = 0;
                int i14 = 0;
                int i15 = 0;
                boolean z16 = false;
                int i16 = -1;
                while (parcel.dataPosition() < f025) {
                    int readInt25 = parcel.readInt();
                    switch ((char) readInt25) {
                        case 2:
                            str36 = f8g.v(parcel, readInt25);
                            break;
                        case 3:
                            str37 = f8g.v(parcel, readInt25);
                            break;
                        case 4:
                            str38 = f8g.v(parcel, readInt25);
                            break;
                        case 5:
                            str39 = f8g.v(parcel, readInt25);
                            break;
                        case 6:
                            str40 = f8g.v(parcel, readInt25);
                            break;
                        case 7:
                            i13 = f8g.R(parcel, readInt25);
                            break;
                        case '\b':
                            arrayList13 = f8g.z(parcel, readInt25, nbv.CREATOR);
                            break;
                        case '\t':
                            i14 = f8g.R(parcel, readInt25);
                            break;
                        case '\n':
                            i16 = f8g.R(parcel, readInt25);
                            break;
                        case 11:
                            str41 = f8g.v(parcel, readInt25);
                            break;
                        case '\f':
                            str42 = f8g.v(parcel, readInt25);
                            break;
                        case '\r':
                            i15 = f8g.R(parcel, readInt25);
                            break;
                        case 14:
                            str43 = f8g.v(parcel, readInt25);
                            break;
                        case 15:
                            bArr16 = f8g.q(parcel, readInt25);
                            break;
                        case 16:
                            str44 = f8g.v(parcel, readInt25);
                            break;
                        case 17:
                            z16 = f8g.M(parcel, readInt25);
                            break;
                        case 18:
                            e0xVar = (e0x) f8g.u(parcel, readInt25, e0x.CREATOR);
                            break;
                        case 19:
                            num = f8g.S(parcel, readInt25);
                            break;
                        default:
                            f8g.W(parcel, readInt25);
                            break;
                    }
                }
                f8g.B(parcel, f025);
                return new CastDevice(str36, str37, str38, str39, str40, i13, arrayList13, i14, i16, str41, str42, i15, str43, bArr16, str44, z16, e0xVar, num);
            case 26:
                int f026 = f8g.f0(parcel);
                String str45 = null;
                int i17 = 0;
                String str46 = null;
                while (parcel.dataPosition() < f026) {
                    int readInt26 = parcel.readInt();
                    char c14 = (char) readInt26;
                    if (c14 == 2) {
                        str45 = f8g.v(parcel, readInt26);
                    } else if (c14 == 3) {
                        i17 = f8g.R(parcel, readInt26);
                    } else if (c14 != 4) {
                        f8g.W(parcel, readInt26);
                    } else {
                        str46 = f8g.v(parcel, readInt26);
                    }
                }
                f8g.B(parcel, f026);
                return new zej(str45, i17, str46);
            case 27:
                int f027 = f8g.f0(parcel);
                ArrayList arrayList14 = null;
                while (parcel.dataPosition() < f027) {
                    int readInt27 = parcel.readInt();
                    if (((char) readInt27) != 1) {
                        f8g.W(parcel, readInt27);
                    } else {
                        arrayList14 = f8g.z(parcel, readInt27, sjx.CREATOR);
                    }
                }
                f8g.B(parcel, f027);
                return new jlx(arrayList14);
            case o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                int f028 = f8g.f0(parcel);
                String str47 = null;
                iw3 iw3Var = null;
                UserAddress userAddress3 = null;
                sfk sfkVar = null;
                String str48 = null;
                Bundle bundle3 = null;
                String str49 = null;
                while (parcel.dataPosition() < f028) {
                    int readInt28 = parcel.readInt();
                    switch ((char) readInt28) {
                        case 1:
                            str47 = f8g.v(parcel, readInt28);
                            break;
                        case 2:
                            iw3Var = (iw3) f8g.u(parcel, readInt28, iw3.CREATOR);
                            break;
                        case 3:
                            userAddress3 = (UserAddress) f8g.u(parcel, readInt28, UserAddress.CREATOR);
                            break;
                        case 4:
                            sfkVar = (sfk) f8g.u(parcel, readInt28, sfk.CREATOR);
                            break;
                        case 5:
                            str48 = f8g.v(parcel, readInt28);
                            break;
                        case 6:
                            bundle3 = f8g.p(parcel, readInt28);
                            break;
                        case 7:
                            str49 = f8g.v(parcel, readInt28);
                            break;
                        default:
                            f8g.W(parcel, readInt28);
                            break;
                    }
                }
                f8g.B(parcel, f028);
                kek kekVar = new kek();
                kekVar.a = str47;
                kekVar.b = iw3Var;
                kekVar.c = userAddress3;
                kekVar.d = sfkVar;
                kekVar.e = str48;
                kekVar.f = bundle3;
                kekVar.g = str49;
                return kekVar;
            default:
                int f029 = f8g.f0(parcel);
                while (parcel.dataPosition() < f029) {
                    int readInt29 = parcel.readInt();
                    if (((char) readInt29) != 1) {
                        f8g.W(parcel, readInt29);
                    } else {
                        f8g.M(parcel, readInt29);
                    }
                }
                f8g.B(parcel, f029);
                return new nmx();
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new m02[i];
            case 1:
                return new sax[i];
            case 2:
                return new jds[i];
            case 3:
                return new khs[i];
            case 4:
                return new n02[i];
            case 5:
                return new qex[i];
            case 6:
                return new pdx[i];
            case 7:
                return new epe[i];
            case 8:
                return new ept[i];
            case 9:
                return new gfx[i];
            case 10:
                return new o02[i];
            case 11:
                return new agx[i];
            case 12:
                return new q66[i];
            case 13:
                return new s02[i];
            case 14:
                return new cfx[i];
            case 15:
                return new sye[i];
            case 16:
                return new pku[i];
            case 17:
                return new k74[i];
            case 18:
                return new gbd[i];
            case 19:
                return new zzg[i];
            case 20:
                return new yn3[i];
            case 21:
                return new ngx[i];
            case 22:
                return new MaskedWallet[i];
            case 23:
                return new sjx[i];
            case 24:
                return new vkj[i];
            case 25:
                return new CastDevice[i];
            case 26:
                return new zej[i];
            case 27:
                return new jlx[i];
            case o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                return new kek[i];
            default:
                return new nmx[i];
        }
    }
}
