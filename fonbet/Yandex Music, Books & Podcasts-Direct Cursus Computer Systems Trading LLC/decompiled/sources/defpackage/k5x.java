package defpackage;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.cast.MediaInfo;
import com.google.android.gms.cast.MediaTrack;
import com.google.android.gms.common.internal.BinderWrapper;
import com.google.android.gms.identity.intents.model.UserAddress;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.wallet.FullWallet;
import com.yandex.pulse.metrics.o;
import java.util.ArrayList;
import java.util.regex.Pattern;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class k5x implements Parcelable.Creator {
    public final /* synthetic */ int a;

    public /* synthetic */ k5x(int i) {
        this.a = i;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        JSONObject jSONObject;
        JSONObject jSONObject2;
        long j = 0;
        double d = 0.0d;
        int i = 0;
        boolean z = false;
        int i2 = 0;
        int i3 = 0;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        boolean z5 = false;
        boolean z6 = false;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        ArrayList arrayList = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        ArrayList arrayList2 = null;
        String str4 = null;
        String str5 = null;
        ArrayList arrayList3 = null;
        String str6 = null;
        r13 = null;
        JSONObject jSONObject3 = null;
        String str7 = null;
        String str8 = null;
        String str9 = null;
        switch (this.a) {
            case 0:
                int f0 = f8g.f0(parcel);
                long j2 = 0;
                long j3 = 0;
                double d2 = 0.0d;
                String str10 = null;
                MediaInfo mediaInfo = null;
                bph bphVar = null;
                Boolean bool = null;
                long[] jArr = null;
                String str11 = null;
                String str12 = null;
                String str13 = null;
                String str14 = null;
                while (parcel.dataPosition() < f0) {
                    int readInt = parcel.readInt();
                    switch ((char) readInt) {
                        case 2:
                            mediaInfo = (MediaInfo) f8g.u(parcel, readInt, MediaInfo.CREATOR);
                            break;
                        case 3:
                            bphVar = (bph) f8g.u(parcel, readInt, bph.CREATOR);
                            break;
                        case 4:
                            bool = f8g.N(parcel, readInt);
                            break;
                        case 5:
                            j2 = f8g.T(parcel, readInt);
                            break;
                        case 6:
                            d2 = f8g.O(parcel, readInt);
                            break;
                        case 7:
                            jArr = f8g.t(parcel, readInt);
                            break;
                        case '\b':
                            str10 = f8g.v(parcel, readInt);
                            break;
                        case '\t':
                            str11 = f8g.v(parcel, readInt);
                            break;
                        case '\n':
                            str12 = f8g.v(parcel, readInt);
                            break;
                        case 11:
                            str13 = f8g.v(parcel, readInt);
                            break;
                        case '\f':
                            str14 = f8g.v(parcel, readInt);
                            break;
                        case '\r':
                            j3 = f8g.T(parcel, readInt);
                            break;
                        default:
                            f8g.W(parcel, readInt);
                            break;
                    }
                }
                f8g.B(parcel, f0);
                Pattern pattern = d94.a;
                if (str10 != null) {
                    try {
                        jSONObject = new JSONObject(str10);
                    } catch (JSONException unused) {
                    }
                    return new coh(mediaInfo, bphVar, bool, j2, d2, jArr, jSONObject, str11, str12, str13, str14, j3);
                }
                jSONObject = null;
                return new coh(mediaInfo, bphVar, bool, j2, d2, jArr, jSONObject, str11, str12, str13, str14, j3);
            case 1:
                int f02 = f8g.f0(parcel);
                Bundle bundle = null;
                while (parcel.dataPosition() < f02) {
                    int readInt2 = parcel.readInt();
                    char c = (char) readInt2;
                    if (c == 2) {
                        arrayList = f8g.z(parcel, readInt2, nbv.CREATOR);
                    } else if (c == 3) {
                        bundle = f8g.p(parcel, readInt2);
                    } else if (c != 4) {
                        f8g.W(parcel, readInt2);
                    } else {
                        i = f8g.R(parcel, readInt2);
                    }
                }
                f8g.B(parcel, f02);
                return new goh(arrayList, bundle, i);
            case 2:
                int f03 = f8g.f0(parcel);
                ArrayList arrayList4 = null;
                ArrayList arrayList5 = null;
                while (parcel.dataPosition() < f03) {
                    int readInt3 = parcel.readInt();
                    char c2 = (char) readInt3;
                    if (c2 == 2) {
                        i7 = f8g.R(parcel, readInt3);
                    } else if (c2 == 3) {
                        str9 = f8g.v(parcel, readInt3);
                    } else if (c2 == 4) {
                        arrayList4 = f8g.z(parcel, readInt3, goh.CREATOR);
                    } else if (c2 == 5) {
                        arrayList5 = f8g.z(parcel, readInt3, nbv.CREATOR);
                    } else if (c2 != 6) {
                        f8g.W(parcel, readInt3);
                    } else {
                        d = f8g.O(parcel, readInt3);
                    }
                }
                f8g.B(parcel, f03);
                aph aphVar = new aph();
                aphVar.a = i7;
                aphVar.b = str9;
                aphVar.c = arrayList4;
                aphVar.d = arrayList5;
                aphVar.e = d;
                return aphVar;
            case 3:
                int f04 = f8g.f0(parcel);
                int i8 = 0;
                int i9 = 0;
                boolean z7 = false;
                String str15 = null;
                String str16 = null;
                aph aphVar2 = null;
                ArrayList arrayList6 = null;
                while (parcel.dataPosition() < f04) {
                    int readInt4 = parcel.readInt();
                    switch ((char) readInt4) {
                        case 2:
                            str8 = f8g.v(parcel, readInt4);
                            break;
                        case 3:
                            str15 = f8g.v(parcel, readInt4);
                            break;
                        case 4:
                            i6 = f8g.R(parcel, readInt4);
                            break;
                        case 5:
                            str16 = f8g.v(parcel, readInt4);
                            break;
                        case 6:
                            aphVar2 = (aph) f8g.u(parcel, readInt4, aph.CREATOR);
                            break;
                        case 7:
                            i8 = f8g.R(parcel, readInt4);
                            break;
                        case '\b':
                            arrayList6 = f8g.z(parcel, readInt4, cph.CREATOR);
                            break;
                        case '\t':
                            i9 = f8g.R(parcel, readInt4);
                            break;
                        case '\n':
                            j = f8g.T(parcel, readInt4);
                            break;
                        case 11:
                            z7 = f8g.M(parcel, readInt4);
                            break;
                        default:
                            f8g.W(parcel, readInt4);
                            break;
                    }
                }
                f8g.B(parcel, f04);
                bph bphVar2 = new bph();
                bphVar2.a = str8;
                bphVar2.b = str15;
                bphVar2.c = i6;
                bphVar2.d = str16;
                bphVar2.e = aphVar2;
                bphVar2.f = i8;
                bphVar2.g = arrayList6;
                bphVar2.h = i9;
                bphVar2.i = j;
                bphVar2.j = z7;
                return bphVar2;
            case 4:
                int f05 = f8g.f0(parcel);
                double d3 = 0.0d;
                double d4 = 0.0d;
                double d5 = 0.0d;
                int i10 = 0;
                boolean z8 = false;
                MediaInfo mediaInfo2 = null;
                long[] jArr2 = null;
                String str17 = null;
                while (parcel.dataPosition() < f05) {
                    int readInt5 = parcel.readInt();
                    switch ((char) readInt5) {
                        case 2:
                            mediaInfo2 = (MediaInfo) f8g.u(parcel, readInt5, MediaInfo.CREATOR);
                            break;
                        case 3:
                            i10 = f8g.R(parcel, readInt5);
                            break;
                        case 4:
                            z8 = f8g.M(parcel, readInt5);
                            break;
                        case 5:
                            d3 = f8g.O(parcel, readInt5);
                            break;
                        case 6:
                            d4 = f8g.O(parcel, readInt5);
                            break;
                        case 7:
                            d5 = f8g.O(parcel, readInt5);
                            break;
                        case '\b':
                            jArr2 = f8g.t(parcel, readInt5);
                            break;
                        case '\t':
                            str17 = f8g.v(parcel, readInt5);
                            break;
                        default:
                            f8g.W(parcel, readInt5);
                            break;
                    }
                }
                f8g.B(parcel, f05);
                return new cph(mediaInfo2, i10, z8, d3, d4, d5, jArr2, str17);
            case 5:
                int f06 = f8g.f0(parcel);
                long j4 = 0;
                long j5 = 0;
                long j6 = 0;
                double d6 = 0.0d;
                double d7 = 0.0d;
                int i11 = 0;
                int i12 = 0;
                int i13 = 0;
                boolean z9 = false;
                int i14 = 0;
                int i15 = 0;
                int i16 = 0;
                boolean z10 = false;
                MediaInfo mediaInfo3 = null;
                long[] jArr3 = null;
                String str18 = null;
                ArrayList arrayList7 = null;
                yi yiVar = null;
                kbu kbuVar = null;
                aoh aohVar = null;
                bph bphVar3 = null;
                while (parcel.dataPosition() < f06) {
                    int readInt6 = parcel.readInt();
                    switch ((char) readInt6) {
                        case 2:
                            mediaInfo3 = (MediaInfo) f8g.u(parcel, readInt6, MediaInfo.CREATOR);
                            break;
                        case 3:
                            j4 = f8g.T(parcel, readInt6);
                            break;
                        case 4:
                            i11 = f8g.R(parcel, readInt6);
                            break;
                        case 5:
                            d6 = f8g.O(parcel, readInt6);
                            break;
                        case 6:
                            i12 = f8g.R(parcel, readInt6);
                            break;
                        case 7:
                            i13 = f8g.R(parcel, readInt6);
                            break;
                        case '\b':
                            j5 = f8g.T(parcel, readInt6);
                            break;
                        case '\t':
                            j6 = f8g.T(parcel, readInt6);
                            break;
                        case '\n':
                            d7 = f8g.O(parcel, readInt6);
                            break;
                        case 11:
                            z9 = f8g.M(parcel, readInt6);
                            break;
                        case '\f':
                            jArr3 = f8g.t(parcel, readInt6);
                            break;
                        case '\r':
                            i14 = f8g.R(parcel, readInt6);
                            break;
                        case 14:
                            i15 = f8g.R(parcel, readInt6);
                            break;
                        case 15:
                            str18 = f8g.v(parcel, readInt6);
                            break;
                        case 16:
                            i16 = f8g.R(parcel, readInt6);
                            break;
                        case 17:
                            arrayList7 = f8g.z(parcel, readInt6, cph.CREATOR);
                            break;
                        case 18:
                            z10 = f8g.M(parcel, readInt6);
                            break;
                        case 19:
                            yiVar = (yi) f8g.u(parcel, readInt6, yi.CREATOR);
                            break;
                        case 20:
                            kbuVar = (kbu) f8g.u(parcel, readInt6, kbu.CREATOR);
                            break;
                        case 21:
                            aohVar = (aoh) f8g.u(parcel, readInt6, aoh.CREATOR);
                            break;
                        case 22:
                            bphVar3 = (bph) f8g.u(parcel, readInt6, bph.CREATOR);
                            break;
                        default:
                            f8g.W(parcel, readInt6);
                            break;
                    }
                }
                f8g.B(parcel, f06);
                return new owh(mediaInfo3, j4, i11, d6, i12, i13, j5, j6, d7, z9, jArr3, i14, i15, str18, i16, arrayList7, z10, yiVar, kbuVar, aohVar, bphVar3);
            case 6:
                int f07 = f8g.f0(parcel);
                long j7 = 0;
                int i17 = 0;
                int i18 = 0;
                String str19 = null;
                String str20 = null;
                String str21 = null;
                String str22 = null;
                String str23 = null;
                ArrayList arrayList8 = null;
                while (parcel.dataPosition() < f07) {
                    int readInt7 = parcel.readInt();
                    switch ((char) readInt7) {
                        case 2:
                            j7 = f8g.T(parcel, readInt7);
                            break;
                        case 3:
                            i17 = f8g.R(parcel, readInt7);
                            break;
                        case 4:
                            str20 = f8g.v(parcel, readInt7);
                            break;
                        case 5:
                            str21 = f8g.v(parcel, readInt7);
                            break;
                        case 6:
                            str22 = f8g.v(parcel, readInt7);
                            break;
                        case 7:
                            str23 = f8g.v(parcel, readInt7);
                            break;
                        case '\b':
                            i18 = f8g.R(parcel, readInt7);
                            break;
                        case '\t':
                            arrayList8 = f8g.x(parcel, readInt7);
                            break;
                        case '\n':
                            str19 = f8g.v(parcel, readInt7);
                            break;
                        default:
                            f8g.W(parcel, readInt7);
                            break;
                    }
                }
                f8g.B(parcel, f07);
                Pattern pattern2 = d94.a;
                if (str19 != null) {
                    try {
                        jSONObject2 = new JSONObject(str19);
                    } catch (JSONException unused2) {
                    }
                    return new MediaTrack(j7, i17, str20, str21, str22, str23, i18, arrayList8, jSONObject2);
                }
                jSONObject2 = null;
                return new MediaTrack(j7, i17, str20, str21, str22, str23, i18, arrayList8, jSONObject2);
            case 7:
                int f08 = f8g.f0(parcel);
                String str24 = null;
                String str25 = null;
                ArrayList arrayList9 = null;
                String str26 = null;
                Uri uri = null;
                String str27 = null;
                String str28 = null;
                Boolean bool2 = null;
                Boolean bool3 = null;
                while (parcel.dataPosition() < f08) {
                    int readInt8 = parcel.readInt();
                    switch ((char) readInt8) {
                        case 2:
                            str24 = f8g.v(parcel, readInt8);
                            break;
                        case 3:
                            str25 = f8g.v(parcel, readInt8);
                            break;
                        case 4:
                            f8g.z(parcel, readInt8, nbv.CREATOR);
                            break;
                        case 5:
                            arrayList9 = f8g.x(parcel, readInt8);
                            break;
                        case 6:
                            str26 = f8g.v(parcel, readInt8);
                            break;
                        case 7:
                            uri = (Uri) f8g.u(parcel, readInt8, Uri.CREATOR);
                            break;
                        case '\b':
                            str27 = f8g.v(parcel, readInt8);
                            break;
                        case '\t':
                            str28 = f8g.v(parcel, readInt8);
                            break;
                        case '\n':
                            bool2 = f8g.N(parcel, readInt8);
                            break;
                        case 11:
                            bool3 = f8g.N(parcel, readInt8);
                            break;
                        default:
                            f8g.W(parcel, readInt8);
                            break;
                    }
                }
                f8g.B(parcel, f08);
                return new jw0(str24, str25, arrayList9, str26, uri, str27, str28, bool2, bool3);
            case 8:
                int f09 = f8g.f0(parcel);
                x8c x8cVar = null;
                jlx jlxVar = null;
                ltt lttVar = null;
                lox loxVar = null;
                f0x f0xVar = null;
                n0x n0xVar = null;
                nmx nmxVar = null;
                v0x v0xVar = null;
                xnd xndVar = null;
                g1x g1xVar = null;
                o2x o2xVar = null;
                a1x a1xVar = null;
                while (parcel.dataPosition() < f09) {
                    int readInt9 = parcel.readInt();
                    switch ((char) readInt9) {
                        case 2:
                            x8cVar = (x8c) f8g.u(parcel, readInt9, x8c.CREATOR);
                            break;
                        case 3:
                            jlxVar = (jlx) f8g.u(parcel, readInt9, jlx.CREATOR);
                            break;
                        case 4:
                            lttVar = (ltt) f8g.u(parcel, readInt9, ltt.CREATOR);
                            break;
                        case 5:
                            loxVar = (lox) f8g.u(parcel, readInt9, lox.CREATOR);
                            break;
                        case 6:
                            f0xVar = (f0x) f8g.u(parcel, readInt9, f0x.CREATOR);
                            break;
                        case 7:
                            n0xVar = (n0x) f8g.u(parcel, readInt9, n0x.CREATOR);
                            break;
                        case '\b':
                            nmxVar = (nmx) f8g.u(parcel, readInt9, nmx.CREATOR);
                            break;
                        case '\t':
                            v0xVar = (v0x) f8g.u(parcel, readInt9, v0x.CREATOR);
                            break;
                        case '\n':
                            xndVar = (xnd) f8g.u(parcel, readInt9, xnd.CREATOR);
                            break;
                        case 11:
                            g1xVar = (g1x) f8g.u(parcel, readInt9, g1x.CREATOR);
                            break;
                        case '\f':
                            o2xVar = (o2x) f8g.u(parcel, readInt9, o2x.CREATOR);
                            break;
                        case '\r':
                            a1xVar = (a1x) f8g.u(parcel, readInt9, a1x.CREATOR);
                            break;
                        default:
                            f8g.W(parcel, readInt9);
                            break;
                    }
                }
                f8g.B(parcel, f09);
                return new zz1(x8cVar, jlxVar, lttVar, loxVar, f0xVar, n0xVar, nmxVar, v0xVar, xndVar, g1xVar, o2xVar, a1xVar);
            case 9:
                int f010 = f8g.f0(parcel);
                while (parcel.dataPosition() < f010) {
                    int readInt10 = parcel.readInt();
                    char c3 = (char) readInt10;
                    if (c3 == 1) {
                        str7 = f8g.v(parcel, readInt10);
                    } else if (c3 != 2) {
                        f8g.W(parcel, readInt10);
                    } else {
                        i5 = f8g.R(parcel, readInt10);
                    }
                }
                f8g.B(parcel, f010);
                return new j5x(str7, i5);
            case 10:
                int f011 = f8g.f0(parcel);
                coh cohVar = null;
                String str29 = null;
                while (parcel.dataPosition() < f011) {
                    int readInt11 = parcel.readInt();
                    char c4 = (char) readInt11;
                    if (c4 == 2) {
                        cohVar = (coh) f8g.u(parcel, readInt11, coh.CREATOR);
                    } else if (c4 != 3) {
                        f8g.W(parcel, readInt11);
                    } else {
                        str29 = f8g.v(parcel, readInt11);
                    }
                }
                f8g.B(parcel, f011);
                Pattern pattern3 = d94.a;
                if (str29 != null) {
                    try {
                        jSONObject3 = new JSONObject(str29);
                    } catch (JSONException unused3) {
                    }
                }
                return new xmp(cohVar, jSONObject3);
            case 11:
                int f012 = f8g.f0(parcel);
                float f = 0.0f;
                int i19 = 0;
                int i20 = 0;
                int i21 = 0;
                int i22 = 0;
                int i23 = 0;
                int i24 = 0;
                int i25 = 0;
                int i26 = 0;
                int i27 = 0;
                String str30 = null;
                String str31 = null;
                while (parcel.dataPosition() < f012) {
                    int readInt12 = parcel.readInt();
                    switch ((char) readInt12) {
                        case 2:
                            f = f8g.P(parcel, readInt12);
                            break;
                        case 3:
                            i19 = f8g.R(parcel, readInt12);
                            break;
                        case 4:
                            i20 = f8g.R(parcel, readInt12);
                            break;
                        case 5:
                            i21 = f8g.R(parcel, readInt12);
                            break;
                        case 6:
                            i22 = f8g.R(parcel, readInt12);
                            break;
                        case 7:
                            i23 = f8g.R(parcel, readInt12);
                            break;
                        case '\b':
                            i24 = f8g.R(parcel, readInt12);
                            break;
                        case '\t':
                            i25 = f8g.R(parcel, readInt12);
                            break;
                        case '\n':
                            str30 = f8g.v(parcel, readInt12);
                            break;
                        case 11:
                            i26 = f8g.R(parcel, readInt12);
                            break;
                        case '\f':
                            i27 = f8g.R(parcel, readInt12);
                            break;
                        case '\r':
                            str31 = f8g.v(parcel, readInt12);
                            break;
                        default:
                            f8g.W(parcel, readInt12);
                            break;
                    }
                }
                f8g.B(parcel, f012);
                return new jes(f, i19, i20, i21, i22, i23, i24, i25, str30, i26, i27, str31);
            case 12:
                int f013 = f8g.f0(parcel);
                String str32 = null;
                while (parcel.dataPosition() < f013) {
                    int readInt13 = parcel.readInt();
                    char c5 = (char) readInt13;
                    if (c5 == 2) {
                        str6 = f8g.v(parcel, readInt13);
                    } else if (c5 != 3) {
                        f8g.W(parcel, readInt13);
                    } else {
                        str32 = f8g.v(parcel, readInt13);
                    }
                }
                f8g.B(parcel, f013);
                return new vyt(str6, str32);
            case 13:
                int f014 = f8g.f0(parcel);
                int i28 = 0;
                int i29 = 0;
                while (parcel.dataPosition() < f014) {
                    int readInt14 = parcel.readInt();
                    char c6 = (char) readInt14;
                    if (c6 == 2) {
                        i4 = f8g.R(parcel, readInt14);
                    } else if (c6 == 3) {
                        i28 = f8g.R(parcel, readInt14);
                    } else if (c6 != 4) {
                        f8g.W(parcel, readInt14);
                    } else {
                        i29 = f8g.R(parcel, readInt14);
                    }
                }
                f8g.B(parcel, f014);
                return new kbu(i4, i28, i29);
            case 14:
                int f015 = f8g.f0(parcel);
                boolean z11 = true;
                int i30 = 0;
                while (parcel.dataPosition() < f015) {
                    int readInt15 = parcel.readInt();
                    char c7 = (char) readInt15;
                    if (c7 == 1) {
                        arrayList3 = f8g.s(parcel, readInt15);
                    } else if (c7 == 2) {
                        z11 = f8g.M(parcel, readInt15);
                    } else if (c7 == 3) {
                        z6 = f8g.M(parcel, readInt15);
                    } else if (c7 != 4) {
                        f8g.W(parcel, readInt15);
                    } else {
                        i30 = f8g.R(parcel, readInt15);
                    }
                }
                f8g.B(parcel, f015);
                lx3 lx3Var = new lx3();
                lx3Var.a = arrayList3;
                lx3Var.b = z11;
                lx3Var.c = z6;
                lx3Var.d = i30;
                return lx3Var;
            case 15:
                int f016 = f8g.f0(parcel);
                ArrayList arrayList10 = new ArrayList();
                String str33 = null;
                while (parcel.dataPosition() < f016) {
                    int readInt16 = parcel.readInt();
                    char c8 = (char) readInt16;
                    if (c8 == 2) {
                        str5 = f8g.v(parcel, readInt16);
                    } else if (c8 == 3) {
                        str33 = f8g.v(parcel, readInt16);
                    } else if (c8 != 4) {
                        f8g.W(parcel, readInt16);
                    } else {
                        arrayList10 = f8g.z(parcel, readInt16, sif.CREATOR);
                    }
                }
                f8g.B(parcel, f016);
                tif tifVar = new tif();
                tifVar.a = str5;
                tifVar.b = str33;
                tifVar.c = arrayList10;
                return tifVar;
            case 16:
                int f017 = f8g.f0(parcel);
                while (parcel.dataPosition() < f017) {
                    int readInt17 = parcel.readInt();
                    if (((char) readInt17) != 1) {
                        f8g.W(parcel, readInt17);
                    } else {
                        z5 = f8g.M(parcel, readInt17);
                    }
                }
                f8g.B(parcel, f017);
                return new b02(z5);
            case 17:
                int f018 = f8g.f0(parcel);
                byte[] bArr = null;
                ArrayList arrayList11 = null;
                while (parcel.dataPosition() < f018) {
                    int readInt18 = parcel.readInt();
                    char c9 = (char) readInt18;
                    if (c9 == 1) {
                        str4 = f8g.v(parcel, readInt18);
                    } else if (c9 == 2) {
                        bArr = f8g.q(parcel, readInt18);
                    } else if (c9 != 3) {
                        f8g.W(parcel, readInt18);
                    } else {
                        arrayList11 = f8g.s(parcel, readInt18);
                    }
                }
                f8g.B(parcel, f018);
                return new b9x(str4, bArr, arrayList11);
            case 18:
                int f019 = f8g.f0(parcel);
                boolean z12 = false;
                while (parcel.dataPosition() < f019) {
                    int readInt19 = parcel.readInt();
                    char c10 = (char) readInt19;
                    if (c10 == 1) {
                        arrayList2 = f8g.z(parcel, readInt19, b9x.CREATOR);
                    } else if (c10 == 2) {
                        z4 = f8g.M(parcel, readInt19);
                    } else if (c10 != 3) {
                        f8g.W(parcel, readInt19);
                    } else {
                        z12 = f8g.M(parcel, readInt19);
                    }
                }
                f8g.B(parcel, f019);
                return new d9x(arrayList2, z4, z12);
            case 19:
                int f020 = f8g.f0(parcel);
                double d8 = 0.0d;
                while (parcel.dataPosition() < f020) {
                    int readInt20 = parcel.readInt();
                    char c11 = (char) readInt20;
                    if (c11 == 2) {
                        d = f8g.O(parcel, readInt20);
                    } else if (c11 != 3) {
                        f8g.W(parcel, readInt20);
                    } else {
                        d8 = f8g.O(parcel, readInt20);
                    }
                }
                f8g.B(parcel, f020);
                return new LatLng(d, d8);
            case 20:
                int f021 = f8g.f0(parcel);
                int i31 = 0;
                while (parcel.dataPosition() < f021) {
                    int readInt21 = parcel.readInt();
                    char c12 = (char) readInt21;
                    if (c12 == 2) {
                        z3 = f8g.M(parcel, readInt21);
                    } else if (c12 != 3) {
                        f8g.W(parcel, readInt21);
                    } else {
                        i31 = f8g.R(parcel, readInt21);
                    }
                }
                f8g.B(parcel, f021);
                return new g9x(i31, z3);
            case 21:
                int f022 = f8g.f0(parcel);
                boolean z13 = false;
                int i32 = 0;
                while (parcel.dataPosition() < f022) {
                    int readInt22 = parcel.readInt();
                    char c13 = (char) readInt22;
                    if (c13 == 2) {
                        z2 = f8g.M(parcel, readInt22);
                    } else if (c13 == 3) {
                        z13 = f8g.M(parcel, readInt22);
                    } else if (c13 != 4) {
                        f8g.W(parcel, readInt22);
                    } else {
                        i32 = f8g.R(parcel, readInt22);
                    }
                }
                f8g.B(parcel, f022);
                return new v9x(i32, z2, z13);
            case 22:
                int f023 = f8g.f0(parcel);
                int i33 = 0;
                boolean z14 = false;
                int i34 = 0;
                boolean z15 = false;
                ArrayList arrayList12 = null;
                String str34 = null;
                while (parcel.dataPosition() < f023) {
                    int readInt23 = parcel.readInt();
                    switch ((char) readInt23) {
                        case 2:
                            i33 = f8g.R(parcel, readInt23);
                            break;
                        case 3:
                            z14 = f8g.M(parcel, readInt23);
                            break;
                        case 4:
                            arrayList12 = f8g.x(parcel, readInt23);
                            break;
                        case 5:
                            i34 = f8g.R(parcel, readInt23);
                            break;
                        case 6:
                            str34 = f8g.v(parcel, readInt23);
                            break;
                        case 7:
                            z15 = f8g.M(parcel, readInt23);
                            break;
                        default:
                            f8g.W(parcel, readInt23);
                            break;
                    }
                }
                f8g.B(parcel, f023);
                return new bax(i33, z14, arrayList12, i34, str34, z15);
            case 23:
                int f024 = f8g.f0(parcel);
                byte[] bArr2 = null;
                byte[] bArr3 = null;
                while (parcel.dataPosition() < f024) {
                    int readInt24 = parcel.readInt();
                    char c14 = (char) readInt24;
                    if (c14 == 1) {
                        bArr2 = f8g.q(parcel, readInt24);
                    } else if (c14 != 2) {
                        f8g.W(parcel, readInt24);
                    } else {
                        bArr3 = f8g.q(parcel, readInt24);
                    }
                }
                f8g.B(parcel, f024);
                return new n9x(bArr2 == null ? null : obx.t(bArr2.length, bArr2), bArr3 != null ? obx.t(bArr3.length, bArr3) : null);
            case 24:
                int f025 = f8g.f0(parcel);
                yzg yzgVar = null;
                khs khsVar = null;
                while (parcel.dataPosition() < f025) {
                    int readInt25 = parcel.readInt();
                    char c15 = (char) readInt25;
                    if (c15 == 2) {
                        str3 = f8g.v(parcel, readInt25);
                    } else if (c15 == 3) {
                        yzgVar = (yzg) f8g.u(parcel, readInt25, yzg.CREATOR);
                    } else if (c15 != 5) {
                        f8g.W(parcel, readInt25);
                    } else {
                        khsVar = (khs) f8g.u(parcel, readInt25, khs.CREATOR);
                    }
                }
                f8g.B(parcel, f025);
                xzg xzgVar = new xzg();
                xzgVar.a = str3;
                xzgVar.b = yzgVar;
                xzgVar.c = khsVar;
                return xzgVar;
            case 25:
                int f026 = f8g.f0(parcel);
                int i35 = 0;
                int i36 = 0;
                while (parcel.dataPosition() < f026) {
                    int readInt26 = parcel.readInt();
                    char c16 = (char) readInt26;
                    if (c16 == 2) {
                        i3 = f8g.R(parcel, readInt26);
                    } else if (c16 == 3) {
                        i35 = f8g.R(parcel, readInt26);
                    } else if (c16 != 4) {
                        f8g.W(parcel, readInt26);
                    } else {
                        i36 = f8g.R(parcel, readInt26);
                    }
                }
                f8g.B(parcel, f026);
                return new sbe(i3, i35, i36);
            case 26:
                return new BinderWrapper(parcel);
            case 27:
                int f027 = f8g.f0(parcel);
                String str35 = null;
                l0x l0xVar = null;
                String str36 = null;
                b3x b3xVar = null;
                b3x b3xVar2 = null;
                String[] strArr = null;
                UserAddress userAddress = null;
                UserAddress userAddress2 = null;
                epe[] epeVarArr = null;
                sfk sfkVar = null;
                while (parcel.dataPosition() < f027) {
                    int readInt27 = parcel.readInt();
                    switch ((char) readInt27) {
                        case 2:
                            str2 = f8g.v(parcel, readInt27);
                            break;
                        case 3:
                            str35 = f8g.v(parcel, readInt27);
                            break;
                        case 4:
                            l0xVar = (l0x) f8g.u(parcel, readInt27, l0x.CREATOR);
                            break;
                        case 5:
                            str36 = f8g.v(parcel, readInt27);
                            break;
                        case 6:
                            b3xVar = (b3x) f8g.u(parcel, readInt27, b3x.CREATOR);
                            break;
                        case 7:
                            b3xVar2 = (b3x) f8g.u(parcel, readInt27, b3x.CREATOR);
                            break;
                        case '\b':
                            strArr = f8g.w(parcel, readInt27);
                            break;
                        case '\t':
                            userAddress = (UserAddress) f8g.u(parcel, readInt27, UserAddress.CREATOR);
                            break;
                        case '\n':
                            userAddress2 = (UserAddress) f8g.u(parcel, readInt27, UserAddress.CREATOR);
                            break;
                        case 11:
                            epeVarArr = (epe[]) f8g.y(parcel, readInt27, epe.CREATOR);
                            break;
                        case '\f':
                            sfkVar = (sfk) f8g.u(parcel, readInt27, sfk.CREATOR);
                            break;
                        default:
                            f8g.W(parcel, readInt27);
                            break;
                    }
                }
                f8g.B(parcel, f027);
                FullWallet fullWallet = new FullWallet();
                fullWallet.a = str2;
                fullWallet.b = str35;
                fullWallet.c = l0xVar;
                fullWallet.d = str36;
                fullWallet.e = b3xVar;
                fullWallet.f = b3xVar2;
                fullWallet.g = strArr;
                fullWallet.h = userAddress;
                fullWallet.i = userAddress2;
                fullWallet.j = epeVarArr;
                fullWallet.k = sfkVar;
                return fullWallet;
            case o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                int f028 = f8g.f0(parcel);
                int i37 = -1;
                String str37 = null;
                while (parcel.dataPosition() < f028) {
                    int readInt28 = parcel.readInt();
                    switch ((char) readInt28) {
                        case 2:
                            i2 = f8g.R(parcel, readInt28);
                            break;
                        case 3:
                            str = f8g.v(parcel, readInt28);
                            break;
                        case 4:
                            d = f8g.O(parcel, readInt28);
                            break;
                        case 5:
                            str37 = f8g.v(parcel, readInt28);
                            break;
                        case 6:
                            j = f8g.T(parcel, readInt28);
                            break;
                        case 7:
                            i37 = f8g.R(parcel, readInt28);
                            break;
                        default:
                            f8g.W(parcel, readInt28);
                            break;
                    }
                }
                f8g.B(parcel, f028);
                yzg yzgVar2 = new yzg();
                yzgVar2.a = i2;
                yzgVar2.b = str;
                yzgVar2.c = d;
                yzgVar2.d = str37;
                yzgVar2.e = j;
                yzgVar2.f = i37;
                return yzgVar2;
            default:
                int f029 = f8g.f0(parcel);
                byte[] bArr4 = null;
                while (parcel.dataPosition() < f029) {
                    int readInt29 = parcel.readInt();
                    char c17 = (char) readInt29;
                    if (c17 == 1) {
                        z = f8g.M(parcel, readInt29);
                    } else if (c17 != 2) {
                        f8g.W(parcel, readInt29);
                    } else {
                        bArr4 = f8g.q(parcel, readInt29);
                    }
                }
                f8g.B(parcel, f029);
                return new wbx(z, bArr4 != null ? obx.t(bArr4.length, bArr4) : null);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new coh[i];
            case 1:
                return new goh[i];
            case 2:
                return new aph[i];
            case 3:
                return new bph[i];
            case 4:
                return new cph[i];
            case 5:
                return new owh[i];
            case 6:
                return new MediaTrack[i];
            case 7:
                return new jw0[i];
            case 8:
                return new zz1[i];
            case 9:
                return new j5x[i];
            case 10:
                return new xmp[i];
            case 11:
                return new jes[i];
            case 12:
                return new vyt[i];
            case 13:
                return new kbu[i];
            case 14:
                return new lx3[i];
            case 15:
                return new tif[i];
            case 16:
                return new b02[i];
            case 17:
                return new b9x[i];
            case 18:
                return new d9x[i];
            case 19:
                return new LatLng[i];
            case 20:
                return new g9x[i];
            case 21:
                return new v9x[i];
            case 22:
                return new bax[i];
            case 23:
                return new n9x[i];
            case 24:
                return new xzg[i];
            case 25:
                return new sbe[i];
            case 26:
                return new BinderWrapper[i];
            case 27:
                return new FullWallet[i];
            case o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                return new yzg[i];
            default:
                return new wbx[i];
        }
    }
}
