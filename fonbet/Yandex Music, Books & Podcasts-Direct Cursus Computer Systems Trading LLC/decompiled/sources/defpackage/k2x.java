package defpackage;

import android.app.PendingIntent;
import android.location.Location;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.cast.MediaError;
import com.google.android.gms.cast.MediaInfo;
import com.google.android.gms.cast.MediaTrack;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.identity.intents.model.UserAddress;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.LocationResult;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.wallet.wobs.CommonWalletObject;
import com.yandex.pulse.metrics.o;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class k2x implements Parcelable.Creator {
    public final /* synthetic */ int a;

    public /* synthetic */ k2x(int i) {
        this.a = i;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        JSONObject jSONObject;
        long j = -1;
        long j2 = 0;
        boolean z = false;
        int i = 0;
        int i2 = 0;
        boolean z2 = false;
        boolean z3 = false;
        int i3 = 0;
        boolean z4 = false;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        e4x[] e4xVarArr = null;
        ArrayList arrayList = null;
        String str6 = null;
        PendingIntent pendingIntent = null;
        String str7 = null;
        String str8 = null;
        String str9 = null;
        String str10 = null;
        switch (this.a) {
            case 0:
                String readString = parcel.readString();
                if (readString == null) {
                    readString = "";
                }
                try {
                    return z1o.a(readString);
                } catch (y1o e) {
                    b6e.q(e);
                    return null;
                }
            case 1:
                int f0 = f8g.f0(parcel);
                while (parcel.dataPosition() < f0) {
                    int readInt = parcel.readInt();
                    if (((char) readInt) != 1) {
                        f8g.W(parcel, readInt);
                    } else {
                        str = f8g.v(parcel, readInt);
                    }
                }
                f8g.B(parcel, f0);
                return new o2x(str);
            case 2:
                try {
                    return nns.a(parcel.readString());
                } catch (ons e2) {
                    b6e.q(e2);
                    return null;
                }
            case 3:
                int f02 = f8g.f0(parcel);
                String str11 = null;
                while (parcel.dataPosition() < f02) {
                    int readInt2 = parcel.readInt();
                    char c = (char) readInt2;
                    if (c == 2) {
                        str10 = f8g.v(parcel, readInt2);
                    } else if (c != 3) {
                        f8g.W(parcel, readInt2);
                    } else {
                        str11 = f8g.v(parcel, readInt2);
                    }
                }
                f8g.B(parcel, f02);
                return new pns(str10, str11);
            case 4:
                try {
                    return lu1.a(parcel.readString());
                } catch (ku1 e3) {
                    b6e.q(e3);
                    return null;
                }
            case 5:
                int f03 = f8g.f0(parcel);
                String str12 = null;
                String str13 = null;
                String str14 = null;
                String str15 = null;
                String str16 = null;
                String str17 = null;
                String str18 = null;
                String str19 = null;
                String str20 = null;
                String str21 = null;
                String str22 = null;
                String str23 = null;
                String str24 = null;
                while (parcel.dataPosition() < f03) {
                    int readInt3 = parcel.readInt();
                    boolean z5 = z;
                    switch ((char) readInt3) {
                        case 2:
                            str9 = f8g.v(parcel, readInt3);
                            break;
                        case 3:
                            str12 = f8g.v(parcel, readInt3);
                            break;
                        case 4:
                            str13 = f8g.v(parcel, readInt3);
                            break;
                        case 5:
                            str14 = f8g.v(parcel, readInt3);
                            break;
                        case 6:
                            str15 = f8g.v(parcel, readInt3);
                            break;
                        case 7:
                            str16 = f8g.v(parcel, readInt3);
                            break;
                        case '\b':
                            str17 = f8g.v(parcel, readInt3);
                            break;
                        case '\t':
                            str18 = f8g.v(parcel, readInt3);
                            break;
                        case '\n':
                            str19 = f8g.v(parcel, readInt3);
                            break;
                        case 11:
                            str20 = f8g.v(parcel, readInt3);
                            break;
                        case '\f':
                            str21 = f8g.v(parcel, readInt3);
                            break;
                        case '\r':
                            str22 = f8g.v(parcel, readInt3);
                            break;
                        case 14:
                            z = f8g.M(parcel, readInt3);
                            continue;
                        case 15:
                            str23 = f8g.v(parcel, readInt3);
                            break;
                        case 16:
                            str24 = f8g.v(parcel, readInt3);
                            break;
                        default:
                            f8g.W(parcel, readInt3);
                            break;
                    }
                    z = z5;
                }
                f8g.B(parcel, f03);
                UserAddress userAddress = new UserAddress();
                userAddress.a = str9;
                userAddress.b = str12;
                userAddress.c = str13;
                userAddress.d = str14;
                userAddress.e = str15;
                userAddress.f = str16;
                userAddress.g = str17;
                userAddress.h = str18;
                userAddress.i = str19;
                userAddress.j = str20;
                userAddress.k = str21;
                userAddress.l = str22;
                userAddress.m = z;
                userAddress.n = str23;
                userAddress.o = str24;
                return userAddress;
            case 6:
                int f04 = f8g.f0(parcel);
                long j3 = 0;
                long j4 = 0;
                boolean z6 = false;
                boolean z7 = false;
                boolean z8 = false;
                String str25 = null;
                String[] strArr = null;
                while (parcel.dataPosition() < f04) {
                    int readInt4 = parcel.readInt();
                    switch ((char) readInt4) {
                        case 2:
                            j3 = f8g.T(parcel, readInt4);
                            break;
                        case 3:
                            str25 = f8g.v(parcel, readInt4);
                            break;
                        case 4:
                            j4 = f8g.T(parcel, readInt4);
                            break;
                        case 5:
                            z6 = f8g.M(parcel, readInt4);
                            break;
                        case 6:
                            strArr = f8g.w(parcel, readInt4);
                            break;
                        case 7:
                            z7 = f8g.M(parcel, readInt4);
                            break;
                        case '\b':
                            z8 = f8g.M(parcel, readInt4);
                            break;
                        default:
                            f8g.W(parcel, readInt4);
                            break;
                    }
                }
                f8g.B(parcel, f04);
                return new xi(j3, str25, j4, z6, strArr, z7, z8);
            case 7:
                int f05 = f8g.f0(parcel);
                ArrayList arrayList2 = new ArrayList();
                ArrayList arrayList3 = new ArrayList();
                ArrayList arrayList4 = new ArrayList();
                ArrayList arrayList5 = new ArrayList();
                ArrayList arrayList6 = new ArrayList();
                ArrayList arrayList7 = new ArrayList();
                boolean z9 = false;
                khs khsVar = null;
                String str26 = null;
                String str27 = null;
                String str28 = null;
                String str29 = null;
                String str30 = null;
                String str31 = null;
                String str32 = null;
                String str33 = null;
                String str34 = null;
                while (parcel.dataPosition() < f05) {
                    int readInt5 = parcel.readInt();
                    String str35 = str28;
                    switch ((char) readInt5) {
                        case 2:
                            str8 = f8g.v(parcel, readInt5);
                            break;
                        case 3:
                            str29 = f8g.v(parcel, readInt5);
                            break;
                        case 4:
                            str30 = f8g.v(parcel, readInt5);
                            break;
                        case 5:
                            str31 = f8g.v(parcel, readInt5);
                            break;
                        case 6:
                            str32 = f8g.v(parcel, readInt5);
                            break;
                        case 7:
                            str33 = f8g.v(parcel, readInt5);
                            break;
                        case '\b':
                            str27 = f8g.v(parcel, readInt5);
                            break;
                        case '\t':
                            str26 = f8g.v(parcel, readInt5);
                            break;
                        case '\n':
                            i6 = f8g.R(parcel, readInt5);
                            break;
                        case 11:
                            arrayList2 = f8g.z(parcel, readInt5, pku.CREATOR);
                            break;
                        case '\f':
                            khsVar = (khs) f8g.u(parcel, readInt5, khs.CREATOR);
                            break;
                        case '\r':
                            arrayList3 = f8g.z(parcel, readInt5, LatLng.CREATOR);
                            break;
                        case 14:
                            str28 = f8g.v(parcel, readInt5);
                            continue;
                        case 15:
                            str34 = f8g.v(parcel, readInt5);
                            break;
                        case 16:
                            arrayList4 = f8g.z(parcel, readInt5, tif.CREATOR);
                            break;
                        case 17:
                            z9 = f8g.M(parcel, readInt5);
                            break;
                        case 18:
                            arrayList5 = f8g.z(parcel, readInt5, ept.CREATOR);
                            break;
                        case 19:
                            arrayList6 = f8g.z(parcel, readInt5, jds.CREATOR);
                            break;
                        case 20:
                            arrayList7 = f8g.z(parcel, readInt5, ept.CREATOR);
                            break;
                        default:
                            f8g.W(parcel, readInt5);
                            break;
                    }
                    str28 = str35;
                }
                f8g.B(parcel, f05);
                CommonWalletObject commonWalletObject = new CommonWalletObject();
                commonWalletObject.a = str8;
                commonWalletObject.b = str29;
                commonWalletObject.c = str30;
                commonWalletObject.d = str31;
                commonWalletObject.e = str32;
                commonWalletObject.f = str33;
                commonWalletObject.g = str27;
                commonWalletObject.h = str26;
                commonWalletObject.i = i6;
                commonWalletObject.j = arrayList2;
                commonWalletObject.k = khsVar;
                commonWalletObject.l = arrayList3;
                commonWalletObject.m = str28;
                commonWalletObject.n = str34;
                commonWalletObject.o = arrayList4;
                commonWalletObject.p = z9;
                commonWalletObject.q = arrayList5;
                commonWalletObject.r = arrayList6;
                commonWalletObject.s = arrayList7;
                return commonWalletObject;
            case 8:
                return new yzw((PendingIntent) parcel.readParcelable(ldo.class.getClassLoader()), parcel.readInt() != 0);
            case 9:
                int f06 = f8g.f0(parcel);
                while (parcel.dataPosition() < f06) {
                    int readInt6 = parcel.readInt();
                    if (((char) readInt6) != 2) {
                        f8g.W(parcel, readInt6);
                    } else {
                        str7 = f8g.v(parcel, readInt6);
                    }
                }
                f8g.B(parcel, f06);
                return new b0x(str7);
            case 10:
                return new g7x(parcel.readStrongBinder());
            case 11:
                int f07 = f8g.f0(parcel);
                int i7 = 0;
                String str36 = null;
                while (parcel.dataPosition() < f07) {
                    int readInt7 = parcel.readInt();
                    char c2 = (char) readInt7;
                    if (c2 == 1) {
                        i5 = f8g.R(parcel, readInt7);
                    } else if (c2 == 2) {
                        i7 = f8g.R(parcel, readInt7);
                    } else if (c2 == 3) {
                        pendingIntent = (PendingIntent) f8g.u(parcel, readInt7, PendingIntent.CREATOR);
                    } else if (c2 != 4) {
                        f8g.W(parcel, readInt7);
                    } else {
                        str36 = f8g.v(parcel, readInt7);
                    }
                }
                f8g.B(parcel, f07);
                return new h66(i5, i7, pendingIntent, str36);
            case 12:
                int f08 = f8g.f0(parcel);
                PendingIntent pendingIntent2 = null;
                h66 h66Var = null;
                while (parcel.dataPosition() < f08) {
                    int readInt8 = parcel.readInt();
                    char c3 = (char) readInt8;
                    if (c3 == 1) {
                        i4 = f8g.R(parcel, readInt8);
                    } else if (c3 == 2) {
                        str6 = f8g.v(parcel, readInt8);
                    } else if (c3 == 3) {
                        pendingIntent2 = (PendingIntent) f8g.u(parcel, readInt8, PendingIntent.CREATOR);
                    } else if (c3 != 4) {
                        f8g.W(parcel, readInt8);
                    } else {
                        h66Var = (h66) f8g.u(parcel, readInt8, h66.CREATOR);
                    }
                }
                f8g.B(parcel, f08);
                return new Status(i4, str6, pendingIntent2, h66Var);
            case 13:
                int f09 = f8g.f0(parcel);
                while (parcel.dataPosition() < f09) {
                    int readInt9 = parcel.readInt();
                    if (((char) readInt9) != 1) {
                        f8g.W(parcel, readInt9);
                    } else {
                        z4 = f8g.M(parcel, readInt9);
                    }
                }
                f8g.B(parcel, f09);
                return new ltt(z4);
            case 14:
                try {
                    return mtt.a(parcel.readString());
                } catch (j3x e4) {
                    b6e.q(e4);
                    return null;
                }
            case 15:
                int f010 = f8g.f0(parcel);
                while (parcel.dataPosition() < f010) {
                    int readInt10 = parcel.readInt();
                    if (((char) readInt10) != 1) {
                        f8g.W(parcel, readInt10);
                    } else {
                        arrayList = f8g.z(parcel, readInt10, kwt.CREATOR);
                    }
                }
                f8g.B(parcel, f010);
                return new jwt(arrayList);
            case 16:
                int f011 = f8g.f0(parcel);
                short s = 0;
                short s2 = 0;
                while (parcel.dataPosition() < f011) {
                    int readInt11 = parcel.readInt();
                    char c4 = (char) readInt11;
                    if (c4 == 1) {
                        i3 = f8g.R(parcel, readInt11);
                    } else if (c4 == 2) {
                        f8g.i0(readInt11, 4, parcel);
                        s = (short) parcel.readInt();
                    } else if (c4 != 3) {
                        f8g.W(parcel, readInt11);
                    } else {
                        f8g.i0(readInt11, 4, parcel);
                        s2 = (short) parcel.readInt();
                    }
                }
                f8g.B(parcel, f011);
                return new kwt(i3, s, s2);
            case 17:
                int f012 = f8g.f0(parcel);
                int i8 = 1000;
                int i9 = 1;
                int i10 = 1;
                while (parcel.dataPosition() < f012) {
                    int readInt12 = parcel.readInt();
                    char c5 = (char) readInt12;
                    if (c5 == 1) {
                        i9 = f8g.R(parcel, readInt12);
                    } else if (c5 == 2) {
                        i10 = f8g.R(parcel, readInt12);
                    } else if (c5 == 3) {
                        j2 = f8g.T(parcel, readInt12);
                    } else if (c5 == 4) {
                        i8 = f8g.R(parcel, readInt12);
                    } else if (c5 != 5) {
                        f8g.W(parcel, readInt12);
                    } else {
                        e4xVarArr = (e4x[]) f8g.y(parcel, readInt12, e4x.CREATOR);
                    }
                }
                f8g.B(parcel, f012);
                LocationAvailability locationAvailability = new LocationAvailability();
                locationAvailability.d = i8;
                locationAvailability.a = i9;
                locationAvailability.b = i10;
                locationAvailability.c = j2;
                locationAvailability.e = e4xVarArr;
                return locationAvailability;
            case 18:
                int f013 = f8g.f0(parcel);
                int i11 = 102;
                long j5 = 3600000;
                long j6 = 600000;
                int i12 = Integer.MAX_VALUE;
                float f = 0.0f;
                long j7 = Long.MAX_VALUE;
                boolean z10 = false;
                while (parcel.dataPosition() < f013) {
                    int readInt13 = parcel.readInt();
                    boolean z11 = z10;
                    switch ((char) readInt13) {
                        case 1:
                            i11 = f8g.R(parcel, readInt13);
                            break;
                        case 2:
                            j5 = f8g.T(parcel, readInt13);
                            break;
                        case 3:
                            j6 = f8g.T(parcel, readInt13);
                            break;
                        case 4:
                            z3 = f8g.M(parcel, readInt13);
                            break;
                        case 5:
                            j7 = f8g.T(parcel, readInt13);
                            break;
                        case 6:
                            i12 = f8g.R(parcel, readInt13);
                            break;
                        case 7:
                            f = f8g.P(parcel, readInt13);
                            break;
                        case '\b':
                            j2 = f8g.T(parcel, readInt13);
                            break;
                        case '\t':
                            z10 = f8g.M(parcel, readInt13);
                            continue;
                        default:
                            f8g.W(parcel, readInt13);
                            break;
                    }
                    z10 = z11;
                }
                f8g.B(parcel, f013);
                LocationRequest locationRequest = new LocationRequest();
                locationRequest.a = i11;
                locationRequest.b = j5;
                locationRequest.c = j6;
                locationRequest.d = z3;
                locationRequest.e = j7;
                locationRequest.f = i12;
                locationRequest.g = f;
                locationRequest.h = j2;
                locationRequest.i = z10;
                return locationRequest;
            case 19:
                int f014 = f8g.f0(parcel);
                List list = LocationResult.b;
                while (parcel.dataPosition() < f014) {
                    int readInt14 = parcel.readInt();
                    if (((char) readInt14) != 1) {
                        f8g.W(parcel, readInt14);
                    } else {
                        list = f8g.z(parcel, readInt14, Location.CREATOR);
                    }
                }
                f8g.B(parcel, f014);
                return new LocationResult(list);
            case 20:
                int f015 = f8g.f0(parcel);
                long j8 = -1;
                long j9 = -1;
                int i13 = 1;
                int i14 = 1;
                while (parcel.dataPosition() < f015) {
                    int readInt15 = parcel.readInt();
                    char c6 = (char) readInt15;
                    if (c6 == 1) {
                        i13 = f8g.R(parcel, readInt15);
                    } else if (c6 == 2) {
                        i14 = f8g.R(parcel, readInt15);
                    } else if (c6 == 3) {
                        j8 = f8g.T(parcel, readInt15);
                    } else if (c6 != 4) {
                        f8g.W(parcel, readInt15);
                    } else {
                        j9 = f8g.T(parcel, readInt15);
                    }
                }
                f8g.B(parcel, f015);
                return new e4x(j8, j9, i13, i14);
            case 21:
                int f016 = f8g.f0(parcel);
                boolean z12 = false;
                wt6 wt6Var = null;
                while (parcel.dataPosition() < f016) {
                    int readInt16 = parcel.readInt();
                    char c7 = (char) readInt16;
                    if (c7 == 2) {
                        z2 = f8g.M(parcel, readInt16);
                    } else if (c7 == 3) {
                        str5 = f8g.v(parcel, readInt16);
                    } else if (c7 == 4) {
                        z12 = f8g.M(parcel, readInt16);
                    } else if (c7 != 5) {
                        f8g.W(parcel, readInt16);
                    } else {
                        wt6Var = (wt6) f8g.u(parcel, readInt16, wt6.CREATOR);
                    }
                }
                f8g.B(parcel, f016);
                return new mnf(z2, str5, z12, wt6Var);
            case 22:
                int f017 = f8g.f0(parcel);
                long j10 = 0;
                String str37 = null;
                String str38 = null;
                Integer num = null;
                String str39 = null;
                while (parcel.dataPosition() < f017) {
                    int readInt17 = parcel.readInt();
                    char c8 = (char) readInt17;
                    if (c8 == 2) {
                        str38 = f8g.v(parcel, readInt17);
                    } else if (c8 == 3) {
                        j10 = f8g.T(parcel, readInt17);
                    } else if (c8 == 4) {
                        num = f8g.S(parcel, readInt17);
                    } else if (c8 == 5) {
                        str39 = f8g.v(parcel, readInt17);
                    } else if (c8 != 6) {
                        f8g.W(parcel, readInt17);
                    } else {
                        str37 = f8g.v(parcel, readInt17);
                    }
                }
                f8g.B(parcel, f017);
                Pattern pattern = d94.a;
                if (str37 != null) {
                    try {
                        jSONObject = new JSONObject(str37);
                    } catch (JSONException unused) {
                    }
                    return new MediaError(str38, j10, num, str39, jSONObject);
                }
                jSONObject = null;
                return new MediaError(str38, j10, num, str39, jSONObject);
            case 23:
                int f018 = f8g.f0(parcel);
                long j11 = 0;
                long j12 = 0;
                int i15 = 0;
                String str40 = null;
                String str41 = null;
                goh gohVar = null;
                ArrayList arrayList8 = null;
                jes jesVar = null;
                String str42 = null;
                ArrayList arrayList9 = null;
                ArrayList arrayList10 = null;
                String str43 = null;
                vyt vytVar = null;
                String str44 = null;
                String str45 = null;
                String str46 = null;
                String str47 = null;
                while (parcel.dataPosition() < f018) {
                    int readInt18 = parcel.readInt();
                    switch ((char) readInt18) {
                        case 2:
                            str40 = f8g.v(parcel, readInt18);
                            break;
                        case 3:
                            i15 = f8g.R(parcel, readInt18);
                            break;
                        case 4:
                            str41 = f8g.v(parcel, readInt18);
                            break;
                        case 5:
                            gohVar = (goh) f8g.u(parcel, readInt18, goh.CREATOR);
                            break;
                        case 6:
                            j11 = f8g.T(parcel, readInt18);
                            break;
                        case 7:
                            arrayList8 = f8g.z(parcel, readInt18, MediaTrack.CREATOR);
                            break;
                        case '\b':
                            jesVar = (jes) f8g.u(parcel, readInt18, jes.CREATOR);
                            break;
                        case '\t':
                            str42 = f8g.v(parcel, readInt18);
                            break;
                        case '\n':
                            arrayList9 = f8g.z(parcel, readInt18, xi.CREATOR);
                            break;
                        case 11:
                            arrayList10 = f8g.z(parcel, readInt18, wi.CREATOR);
                            break;
                        case '\f':
                            str43 = f8g.v(parcel, readInt18);
                            break;
                        case '\r':
                            vytVar = (vyt) f8g.u(parcel, readInt18, vyt.CREATOR);
                            break;
                        case 14:
                            j12 = f8g.T(parcel, readInt18);
                            break;
                        case 15:
                            str44 = f8g.v(parcel, readInt18);
                            break;
                        case 16:
                            str45 = f8g.v(parcel, readInt18);
                            break;
                        case 17:
                            str46 = f8g.v(parcel, readInt18);
                            break;
                        case 18:
                            str47 = f8g.v(parcel, readInt18);
                            break;
                        default:
                            f8g.W(parcel, readInt18);
                            break;
                    }
                }
                f8g.B(parcel, f018);
                return new MediaInfo(str40, i15, str41, gohVar, j11, arrayList8, jesVar, str42, arrayList9, arrayList10, str43, vytVar, j12, str44, str45, str46, str47);
            case 24:
                int f019 = f8g.f0(parcel);
                long j13 = 0;
                long j14 = 0;
                boolean z13 = false;
                boolean z14 = false;
                while (parcel.dataPosition() < f019) {
                    int readInt19 = parcel.readInt();
                    char c9 = (char) readInt19;
                    if (c9 == 2) {
                        j13 = f8g.T(parcel, readInt19);
                    } else if (c9 == 3) {
                        j14 = f8g.T(parcel, readInt19);
                    } else if (c9 == 4) {
                        z13 = f8g.M(parcel, readInt19);
                    } else if (c9 != 5) {
                        f8g.W(parcel, readInt19);
                    } else {
                        z14 = f8g.M(parcel, readInt19);
                    }
                }
                f8g.B(parcel, f019);
                return new aoh(j13, j14, z13, z14);
            case 25:
                int f020 = f8g.f0(parcel);
                long j15 = 0;
                long j16 = 0;
                long j17 = 0;
                String str48 = null;
                String str49 = null;
                while (parcel.dataPosition() < f020) {
                    int readInt20 = parcel.readInt();
                    char c10 = (char) readInt20;
                    if (c10 == 2) {
                        j15 = f8g.T(parcel, readInt20);
                    } else if (c10 == 3) {
                        j16 = f8g.T(parcel, readInt20);
                    } else if (c10 == 4) {
                        str48 = f8g.v(parcel, readInt20);
                    } else if (c10 == 5) {
                        str49 = f8g.v(parcel, readInt20);
                    } else if (c10 != 6) {
                        f8g.W(parcel, readInt20);
                    } else {
                        j17 = f8g.T(parcel, readInt20);
                    }
                }
                f8g.B(parcel, f020);
                return new yi(j15, j16, j17, str48, str49);
            case 26:
                int f021 = f8g.f0(parcel);
                String str50 = null;
                String str51 = null;
                UserAddress userAddress2 = null;
                while (parcel.dataPosition() < f021) {
                    int readInt21 = parcel.readInt();
                    char c11 = (char) readInt21;
                    if (c11 == 1) {
                        str4 = f8g.v(parcel, readInt21);
                    } else if (c11 == 2) {
                        str50 = f8g.v(parcel, readInt21);
                    } else if (c11 == 3) {
                        str51 = f8g.v(parcel, readInt21);
                    } else if (c11 == 4) {
                        i2 = f8g.R(parcel, readInt21);
                    } else if (c11 != 5) {
                        f8g.W(parcel, readInt21);
                    } else {
                        userAddress2 = (UserAddress) f8g.u(parcel, readInt21, UserAddress.CREATOR);
                    }
                }
                f8g.B(parcel, f021);
                iw3 iw3Var = new iw3();
                iw3Var.a = str4;
                iw3Var.b = str50;
                iw3Var.c = str51;
                iw3Var.d = i2;
                iw3Var.e = userAddress2;
                return iw3Var;
            case 27:
                int f022 = f8g.f0(parcel);
                String str52 = null;
                while (parcel.dataPosition() < f022) {
                    int readInt22 = parcel.readInt();
                    char c12 = (char) readInt22;
                    if (c12 == 2) {
                        str3 = f8g.v(parcel, readInt22);
                    } else if (c12 != 3) {
                        f8g.W(parcel, readInt22);
                    } else {
                        str52 = f8g.v(parcel, readInt22);
                    }
                }
                f8g.B(parcel, f022);
                sif sifVar = new sif();
                sifVar.a = str3;
                sifVar.b = str52;
                return sifVar;
            case o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                int f023 = f8g.f0(parcel);
                while (parcel.dataPosition() < f023) {
                    int readInt23 = parcel.readInt();
                    char c13 = (char) readInt23;
                    if (c13 == 1) {
                        str2 = f8g.v(parcel, readInt23);
                    } else if (c13 == 2) {
                        i = f8g.R(parcel, readInt23);
                    } else if (c13 != 3) {
                        f8g.W(parcel, readInt23);
                    } else {
                        j = f8g.T(parcel, readInt23);
                    }
                }
                f8g.B(parcel, f023);
                return new i6c(str2, i, j);
            default:
                int f024 = f8g.f0(parcel);
                jwt jwtVar = null;
                n9x n9xVar = null;
                b02 b02Var = null;
                wbx wbxVar = null;
                String str53 = null;
                while (parcel.dataPosition() < f024) {
                    int readInt24 = parcel.readInt();
                    char c14 = (char) readInt24;
                    if (c14 == 1) {
                        jwtVar = (jwt) f8g.u(parcel, readInt24, jwt.CREATOR);
                    } else if (c14 == 2) {
                        n9xVar = (n9x) f8g.u(parcel, readInt24, n9x.CREATOR);
                    } else if (c14 == 3) {
                        b02Var = (b02) f8g.u(parcel, readInt24, b02.CREATOR);
                    } else if (c14 == 4) {
                        wbxVar = (wbx) f8g.u(parcel, readInt24, wbx.CREATOR);
                    } else if (c14 != 5) {
                        f8g.W(parcel, readInt24);
                    } else {
                        str53 = f8g.v(parcel, readInt24);
                    }
                }
                f8g.B(parcel, f024);
                return new a02(jwtVar, n9xVar, b02Var, wbxVar, str53);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new z1o[i];
            case 1:
                return new o2x[i];
            case 2:
                return new nns[i];
            case 3:
                return new pns[i];
            case 4:
                return new lu1[i];
            case 5:
                return new UserAddress[i];
            case 6:
                return new xi[i];
            case 7:
                return new CommonWalletObject[i];
            case 8:
                return new ldo[i];
            case 9:
                return new b0x[i];
            case 10:
                return new g7x[i];
            case 11:
                return new h66[i];
            case 12:
                return new Status[i];
            case 13:
                return new ltt[i];
            case 14:
                return new mtt[i];
            case 15:
                return new jwt[i];
            case 16:
                return new kwt[i];
            case 17:
                return new LocationAvailability[i];
            case 18:
                return new LocationRequest[i];
            case 19:
                return new LocationResult[i];
            case 20:
                return new e4x[i];
            case 21:
                return new mnf[i];
            case 22:
                return new MediaError[i];
            case 23:
                return new MediaInfo[i];
            case 24:
                return new aoh[i];
            case 25:
                return new yi[i];
            case 26:
                return new iw3[i];
            case 27:
                return new sif[i];
            case o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                return new i6c[i];
            default:
                return new a02[i];
        }
    }
}
