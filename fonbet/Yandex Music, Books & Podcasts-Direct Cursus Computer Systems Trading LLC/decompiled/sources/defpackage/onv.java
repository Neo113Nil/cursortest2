package defpackage;

import android.accounts.Account;
import android.app.PendingIntent;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.SignInAccount;
import com.google.android.gms.auth.api.signin.internal.SignInConfiguration;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.fido.common.Transport;
import com.yandex.pulse.metrics.o;
import java.util.ArrayList;

/* loaded from: classes4.dex */
public final class onv implements Parcelable.Creator {
    public final /* synthetic */ int a;

    public /* synthetic */ onv(int i) {
        this.a = i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0013, code lost:
    
        defpackage.b6e.q(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0021, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0022, code lost:
    
        defpackage.b6e.q(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0012, code lost:
    
        r0 = move-exception;
     */
    @Override // android.os.Parcelable.Creator
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object createFromParcel(Parcel parcel) {
        switch (this.a) {
            case 0:
                parcel.getClass();
                break;
            case 1:
                parcel.getClass();
                break;
            case 2:
                parcel.getClass();
                break;
            case 3:
                int f0 = f8g.f0(parcel);
                Bundle bundle = null;
                int i = 0;
                int i2 = 0;
                while (parcel.dataPosition() < f0) {
                    int readInt = parcel.readInt();
                    char c = (char) readInt;
                    if (c == 1) {
                        i = f8g.R(parcel, readInt);
                    } else if (c == 2) {
                        i2 = f8g.R(parcel, readInt);
                    } else if (c != 3) {
                        f8g.W(parcel, readInt);
                    } else {
                        bundle = f8g.p(parcel, readInt);
                    }
                }
                f8g.B(parcel, f0);
                break;
            case 4:
                int f02 = f8g.f0(parcel);
                ArrayList arrayList = null;
                int i3 = 0;
                while (parcel.dataPosition() < f02) {
                    int readInt2 = parcel.readInt();
                    char c2 = (char) readInt2;
                    if (c2 == 1) {
                        i3 = f8g.R(parcel, readInt2);
                    } else if (c2 != 2) {
                        f8g.W(parcel, readInt2);
                    } else {
                        arrayList = f8g.z(parcel, readInt2, o3i.CREATOR);
                    }
                }
                f8g.B(parcel, f02);
                break;
            case 5:
                int f03 = f8g.f0(parcel);
                Intent intent = null;
                int i4 = 0;
                int i5 = 0;
                while (parcel.dataPosition() < f03) {
                    int readInt3 = parcel.readInt();
                    char c3 = (char) readInt3;
                    if (c3 == 1) {
                        i4 = f8g.R(parcel, readInt3);
                    } else if (c3 == 2) {
                        i5 = f8g.R(parcel, readInt3);
                    } else if (c3 != 3) {
                        f8g.W(parcel, readInt3);
                    } else {
                        intent = (Intent) f8g.u(parcel, readInt3, Intent.CREATOR);
                    }
                }
                f8g.B(parcel, f03);
                break;
            case 6:
                int f04 = f8g.f0(parcel);
                String str = null;
                String str2 = null;
                String str3 = null;
                String str4 = null;
                Uri uri = null;
                String str5 = null;
                String str6 = null;
                ArrayList arrayList2 = null;
                String str7 = null;
                String str8 = null;
                long j = 0;
                int i6 = 0;
                while (parcel.dataPosition() < f04) {
                    int readInt4 = parcel.readInt();
                    switch ((char) readInt4) {
                        case 1:
                            i6 = f8g.R(parcel, readInt4);
                            break;
                        case 2:
                            str = f8g.v(parcel, readInt4);
                            break;
                        case 3:
                            str2 = f8g.v(parcel, readInt4);
                            break;
                        case 4:
                            str3 = f8g.v(parcel, readInt4);
                            break;
                        case 5:
                            str4 = f8g.v(parcel, readInt4);
                            break;
                        case 6:
                            uri = (Uri) f8g.u(parcel, readInt4, Uri.CREATOR);
                            break;
                        case 7:
                            str5 = f8g.v(parcel, readInt4);
                            break;
                        case '\b':
                            j = f8g.T(parcel, readInt4);
                            break;
                        case '\t':
                            str6 = f8g.v(parcel, readInt4);
                            break;
                        case '\n':
                            arrayList2 = f8g.z(parcel, readInt4, Scope.CREATOR);
                            break;
                        case 11:
                            str7 = f8g.v(parcel, readInt4);
                            break;
                        case '\f':
                            str8 = f8g.v(parcel, readInt4);
                            break;
                        default:
                            f8g.W(parcel, readInt4);
                            break;
                    }
                }
                f8g.B(parcel, f04);
                break;
            case 7:
                int f05 = f8g.f0(parcel);
                ArrayList arrayList3 = null;
                ArrayList arrayList4 = null;
                Account account = null;
                String str9 = null;
                String str10 = null;
                String str11 = null;
                int i7 = 0;
                boolean z = false;
                boolean z2 = false;
                boolean z3 = false;
                while (parcel.dataPosition() < f05) {
                    int readInt5 = parcel.readInt();
                    switch ((char) readInt5) {
                        case 1:
                            i7 = f8g.R(parcel, readInt5);
                            break;
                        case 2:
                            arrayList4 = f8g.z(parcel, readInt5, Scope.CREATOR);
                            break;
                        case 3:
                            account = (Account) f8g.u(parcel, readInt5, Account.CREATOR);
                            break;
                        case 4:
                            z = f8g.M(parcel, readInt5);
                            break;
                        case 5:
                            z2 = f8g.M(parcel, readInt5);
                            break;
                        case 6:
                            z3 = f8g.M(parcel, readInt5);
                            break;
                        case 7:
                            str9 = f8g.v(parcel, readInt5);
                            break;
                        case '\b':
                            str10 = f8g.v(parcel, readInt5);
                            break;
                        case '\t':
                            arrayList3 = f8g.z(parcel, readInt5, und.CREATOR);
                            break;
                        case '\n':
                            str11 = f8g.v(parcel, readInt5);
                            break;
                        default:
                            f8g.W(parcel, readInt5);
                            break;
                    }
                }
                f8g.B(parcel, f05);
                break;
            case 8:
                int f06 = f8g.f0(parcel);
                int i8 = 0;
                int i9 = 0;
                Uri uri2 = null;
                int i10 = 0;
                while (parcel.dataPosition() < f06) {
                    int readInt6 = parcel.readInt();
                    char c4 = (char) readInt6;
                    if (c4 == 1) {
                        i8 = f8g.R(parcel, readInt6);
                    } else if (c4 == 2) {
                        uri2 = (Uri) f8g.u(parcel, readInt6, Uri.CREATOR);
                    } else if (c4 == 3) {
                        i10 = f8g.R(parcel, readInt6);
                    } else if (c4 != 4) {
                        f8g.W(parcel, readInt6);
                    } else {
                        i9 = f8g.R(parcel, readInt6);
                    }
                }
                f8g.B(parcel, f06);
                break;
            case 9:
                int f07 = f8g.f0(parcel);
                ArrayList arrayList5 = null;
                String str12 = null;
                while (parcel.dataPosition() < f07) {
                    int readInt7 = parcel.readInt();
                    char c5 = (char) readInt7;
                    if (c5 == 1) {
                        arrayList5 = f8g.x(parcel, readInt7);
                    } else if (c5 != 2) {
                        f8g.W(parcel, readInt7);
                    } else {
                        str12 = f8g.v(parcel, readInt7);
                    }
                }
                f8g.B(parcel, f07);
                break;
            case 10:
                int f08 = f8g.f0(parcel);
                h66 h66Var = null;
                int i11 = 0;
                xyw xywVar = null;
                while (parcel.dataPosition() < f08) {
                    int readInt8 = parcel.readInt();
                    char c6 = (char) readInt8;
                    if (c6 == 1) {
                        i11 = f8g.R(parcel, readInt8);
                    } else if (c6 == 2) {
                        h66Var = (h66) f8g.u(parcel, readInt8, h66.CREATOR);
                    } else if (c6 != 3) {
                        f8g.W(parcel, readInt8);
                    } else {
                        xywVar = (xyw) f8g.u(parcel, readInt8, xyw.CREATOR);
                    }
                }
                f8g.B(parcel, f08);
                break;
            case 11:
                int f09 = f8g.f0(parcel);
                int i12 = -1;
                int i13 = 0;
                int i14 = 0;
                int i15 = 0;
                int i16 = 0;
                String str13 = null;
                String str14 = null;
                long j2 = 0;
                long j3 = 0;
                while (parcel.dataPosition() < f09) {
                    int readInt9 = parcel.readInt();
                    switch ((char) readInt9) {
                        case 1:
                            i13 = f8g.R(parcel, readInt9);
                            break;
                        case 2:
                            i14 = f8g.R(parcel, readInt9);
                            break;
                        case 3:
                            i15 = f8g.R(parcel, readInt9);
                            break;
                        case 4:
                            j2 = f8g.T(parcel, readInt9);
                            break;
                        case 5:
                            j3 = f8g.T(parcel, readInt9);
                            break;
                        case 6:
                            str13 = f8g.v(parcel, readInt9);
                            break;
                        case 7:
                            str14 = f8g.v(parcel, readInt9);
                            break;
                        case '\b':
                            i16 = f8g.R(parcel, readInt9);
                            break;
                        case '\t':
                            i12 = f8g.R(parcel, readInt9);
                            break;
                        default:
                            f8g.W(parcel, readInt9);
                            break;
                    }
                }
                f8g.B(parcel, f09);
                break;
            case 12:
                int f010 = f8g.f0(parcel);
                Account account2 = null;
                int i17 = 0;
                int i18 = 0;
                GoogleSignInAccount googleSignInAccount = null;
                while (parcel.dataPosition() < f010) {
                    int readInt10 = parcel.readInt();
                    char c7 = (char) readInt10;
                    if (c7 == 1) {
                        i17 = f8g.R(parcel, readInt10);
                    } else if (c7 == 2) {
                        account2 = (Account) f8g.u(parcel, readInt10, Account.CREATOR);
                    } else if (c7 == 3) {
                        i18 = f8g.R(parcel, readInt10);
                    } else if (c7 != 4) {
                        f8g.W(parcel, readInt10);
                    } else {
                        googleSignInAccount = (GoogleSignInAccount) f8g.u(parcel, readInt10, GoogleSignInAccount.CREATOR);
                    }
                }
                f8g.B(parcel, f010);
                break;
            case 13:
                int f011 = f8g.f0(parcel);
                int i19 = 0;
                boolean z4 = false;
                boolean z5 = false;
                IBinder iBinder = null;
                h66 h66Var2 = null;
                while (parcel.dataPosition() < f011) {
                    int readInt11 = parcel.readInt();
                    char c8 = (char) readInt11;
                    if (c8 == 1) {
                        i19 = f8g.R(parcel, readInt11);
                    } else if (c8 == 2) {
                        iBinder = f8g.Q(parcel, readInt11);
                    } else if (c8 == 3) {
                        h66Var2 = (h66) f8g.u(parcel, readInt11, h66.CREATOR);
                    } else if (c8 == 4) {
                        z4 = f8g.M(parcel, readInt11);
                    } else if (c8 != 5) {
                        f8g.W(parcel, readInt11);
                    } else {
                        z5 = f8g.M(parcel, readInt11);
                    }
                }
                f8g.B(parcel, f011);
                break;
            case 14:
                int f012 = f8g.f0(parcel);
                String str15 = "";
                GoogleSignInAccount googleSignInAccount2 = null;
                String str16 = "";
                while (parcel.dataPosition() < f012) {
                    int readInt12 = parcel.readInt();
                    char c9 = (char) readInt12;
                    if (c9 == 4) {
                        str15 = f8g.v(parcel, readInt12);
                    } else if (c9 == 7) {
                        googleSignInAccount2 = (GoogleSignInAccount) f8g.u(parcel, readInt12, GoogleSignInAccount.CREATOR);
                    } else if (c9 != '\b') {
                        f8g.W(parcel, readInt12);
                    } else {
                        str16 = f8g.v(parcel, readInt12);
                    }
                }
                f8g.B(parcel, f012);
                break;
            case 15:
                int f013 = f8g.f0(parcel);
                boolean z6 = false;
                int i20 = 0;
                boolean z7 = false;
                uy2 uy2Var = null;
                ry2 ry2Var = null;
                String str17 = null;
                ty2 ty2Var = null;
                sy2 sy2Var = null;
                while (parcel.dataPosition() < f013) {
                    int readInt13 = parcel.readInt();
                    switch ((char) readInt13) {
                        case 1:
                            uy2Var = (uy2) f8g.u(parcel, readInt13, uy2.CREATOR);
                            break;
                        case 2:
                            ry2Var = (ry2) f8g.u(parcel, readInt13, ry2.CREATOR);
                            break;
                        case 3:
                            str17 = f8g.v(parcel, readInt13);
                            break;
                        case 4:
                            z6 = f8g.M(parcel, readInt13);
                            break;
                        case 5:
                            i20 = f8g.R(parcel, readInt13);
                            break;
                        case 6:
                            ty2Var = (ty2) f8g.u(parcel, readInt13, ty2.CREATOR);
                            break;
                        case 7:
                            sy2Var = (sy2) f8g.u(parcel, readInt13, sy2.CREATOR);
                            break;
                        case '\b':
                            z7 = f8g.M(parcel, readInt13);
                            break;
                        default:
                            f8g.W(parcel, readInt13);
                            break;
                    }
                }
                f8g.B(parcel, f013);
                break;
            case 16:
                int f014 = f8g.f0(parcel);
                PendingIntent pendingIntent = null;
                while (parcel.dataPosition() < f014) {
                    int readInt14 = parcel.readInt();
                    if (((char) readInt14) != 1) {
                        f8g.W(parcel, readInt14);
                    } else {
                        pendingIntent = (PendingIntent) f8g.u(parcel, readInt14, PendingIntent.CREATOR);
                    }
                }
                f8g.B(parcel, f014);
                break;
            case 17:
                int f015 = f8g.f0(parcel);
                int i21 = 0;
                while (parcel.dataPosition() < f015) {
                    int readInt15 = parcel.readInt();
                    if (((char) readInt15) != 1) {
                        f8g.W(parcel, readInt15);
                    } else {
                        i21 = f8g.R(parcel, readInt15);
                    }
                }
                f8g.B(parcel, f015);
                break;
            case 18:
                int f016 = f8g.f0(parcel);
                int i22 = 0;
                boolean z8 = false;
                String str18 = null;
                String str19 = null;
                String str20 = null;
                String str21 = null;
                while (parcel.dataPosition() < f016) {
                    int readInt16 = parcel.readInt();
                    switch ((char) readInt16) {
                        case 1:
                            str18 = f8g.v(parcel, readInt16);
                            break;
                        case 2:
                            str19 = f8g.v(parcel, readInt16);
                            break;
                        case 3:
                            str20 = f8g.v(parcel, readInt16);
                            break;
                        case 4:
                            str21 = f8g.v(parcel, readInt16);
                            break;
                        case 5:
                            z8 = f8g.M(parcel, readInt16);
                            break;
                        case 6:
                            i22 = f8g.R(parcel, readInt16);
                            break;
                        default:
                            f8g.W(parcel, readInt16);
                            break;
                    }
                }
                f8g.B(parcel, f016);
                break;
            case 19:
                int f017 = f8g.f0(parcel);
                boolean z9 = false;
                boolean z10 = false;
                boolean z11 = false;
                String str22 = null;
                String str23 = null;
                String str24 = null;
                ArrayList arrayList6 = null;
                while (parcel.dataPosition() < f017) {
                    int readInt17 = parcel.readInt();
                    switch ((char) readInt17) {
                        case 1:
                            z9 = f8g.M(parcel, readInt17);
                            break;
                        case 2:
                            str22 = f8g.v(parcel, readInt17);
                            break;
                        case 3:
                            str23 = f8g.v(parcel, readInt17);
                            break;
                        case 4:
                            z10 = f8g.M(parcel, readInt17);
                            break;
                        case 5:
                            str24 = f8g.v(parcel, readInt17);
                            break;
                        case 6:
                            arrayList6 = f8g.x(parcel, readInt17);
                            break;
                        case 7:
                            z11 = f8g.M(parcel, readInt17);
                            break;
                        default:
                            f8g.W(parcel, readInt17);
                            break;
                    }
                }
                f8g.B(parcel, f017);
                break;
            case 20:
                int f018 = f8g.f0(parcel);
                String str25 = null;
                boolean z12 = false;
                while (parcel.dataPosition() < f018) {
                    int readInt18 = parcel.readInt();
                    char c10 = (char) readInt18;
                    if (c10 == 1) {
                        z12 = f8g.M(parcel, readInt18);
                    } else if (c10 != 2) {
                        f8g.W(parcel, readInt18);
                    } else {
                        str25 = f8g.v(parcel, readInt18);
                    }
                }
                f8g.B(parcel, f018);
                break;
            case 21:
                int f019 = f8g.f0(parcel);
                byte[] bArr = null;
                boolean z13 = false;
                String str26 = null;
                while (parcel.dataPosition() < f019) {
                    int readInt19 = parcel.readInt();
                    char c11 = (char) readInt19;
                    if (c11 == 1) {
                        z13 = f8g.M(parcel, readInt19);
                    } else if (c11 == 2) {
                        bArr = f8g.q(parcel, readInt19);
                    } else if (c11 != 3) {
                        f8g.W(parcel, readInt19);
                    } else {
                        str26 = f8g.v(parcel, readInt19);
                    }
                }
                f8g.B(parcel, f019);
                break;
            case 22:
                int f020 = f8g.f0(parcel);
                boolean z14 = false;
                while (parcel.dataPosition() < f020) {
                    int readInt20 = parcel.readInt();
                    if (((char) readInt20) != 1) {
                        f8g.W(parcel, readInt20);
                    } else {
                        z14 = f8g.M(parcel, readInt20);
                    }
                }
                f8g.B(parcel, f020);
                break;
            case 23:
                int f021 = f8g.f0(parcel);
                int i23 = 0;
                ufq ufqVar = null;
                String str27 = null;
                while (parcel.dataPosition() < f021) {
                    int readInt21 = parcel.readInt();
                    char c12 = (char) readInt21;
                    if (c12 == 1) {
                        ufqVar = (ufq) f8g.u(parcel, readInt21, ufq.CREATOR);
                    } else if (c12 == 2) {
                        str27 = f8g.v(parcel, readInt21);
                    } else if (c12 != 3) {
                        f8g.W(parcel, readInt21);
                    } else {
                        i23 = f8g.R(parcel, readInt21);
                    }
                }
                f8g.B(parcel, f021);
                break;
            case 24:
                int f022 = f8g.f0(parcel);
                PendingIntent pendingIntent2 = null;
                while (parcel.dataPosition() < f022) {
                    int readInt22 = parcel.readInt();
                    if (((char) readInt22) != 1) {
                        f8g.W(parcel, readInt22);
                    } else {
                        pendingIntent2 = (PendingIntent) f8g.u(parcel, readInt22, PendingIntent.CREATOR);
                    }
                }
                f8g.B(parcel, f022);
                break;
            case 25:
                int f023 = f8g.f0(parcel);
                String str28 = null;
                GoogleSignInOptions googleSignInOptions = null;
                while (parcel.dataPosition() < f023) {
                    int readInt23 = parcel.readInt();
                    char c13 = (char) readInt23;
                    if (c13 == 2) {
                        str28 = f8g.v(parcel, readInt23);
                    } else if (c13 != 5) {
                        f8g.W(parcel, readInt23);
                    } else {
                        googleSignInOptions = (GoogleSignInOptions) f8g.u(parcel, readInt23, GoogleSignInOptions.CREATOR);
                    }
                }
                f8g.B(parcel, f023);
                break;
            case 26:
                int f024 = f8g.f0(parcel);
                String str29 = null;
                String str30 = null;
                String str31 = null;
                String str32 = null;
                Uri uri3 = null;
                String str33 = null;
                String str34 = null;
                String str35 = null;
                g0n g0nVar = null;
                while (parcel.dataPosition() < f024) {
                    int readInt24 = parcel.readInt();
                    switch ((char) readInt24) {
                        case 1:
                            str29 = f8g.v(parcel, readInt24);
                            break;
                        case 2:
                            str30 = f8g.v(parcel, readInt24);
                            break;
                        case 3:
                            str31 = f8g.v(parcel, readInt24);
                            break;
                        case 4:
                            str32 = f8g.v(parcel, readInt24);
                            break;
                        case 5:
                            uri3 = (Uri) f8g.u(parcel, readInt24, Uri.CREATOR);
                            break;
                        case 6:
                            str33 = f8g.v(parcel, readInt24);
                            break;
                        case 7:
                            str34 = f8g.v(parcel, readInt24);
                            break;
                        case '\b':
                            str35 = f8g.v(parcel, readInt24);
                            break;
                        case '\t':
                            g0nVar = (g0n) f8g.u(parcel, readInt24, g0n.CREATOR);
                            break;
                        default:
                            f8g.W(parcel, readInt24);
                            break;
                    }
                }
                f8g.B(parcel, f024);
                break;
            case 27:
                int f025 = f8g.f0(parcel);
                String str36 = null;
                String str37 = null;
                while (parcel.dataPosition() < f025) {
                    int readInt25 = parcel.readInt();
                    char c14 = (char) readInt25;
                    if (c14 == 1) {
                        str36 = f8g.v(parcel, readInt25);
                    } else if (c14 != 2) {
                        f8g.W(parcel, readInt25);
                    } else {
                        str37 = f8g.v(parcel, readInt25);
                    }
                }
                f8g.B(parcel, f025);
                break;
        }
        return null;
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new pnv[i];
            case 1:
                return new qnv[i];
            case 2:
                return new u7w[i];
            case 3:
                return new und[i];
            case 4:
                return new p8s[i];
            case 5:
                return new cww[i];
            case 6:
                return new GoogleSignInAccount[i];
            case 7:
                return new GoogleSignInOptions[i];
            case 8:
                return new nbv[i];
            case 9:
                return new fyw[i];
            case 10:
                return new myw[i];
            case 11:
                return new o3i[i];
            case 12:
                return new vyw[i];
            case 13:
                return new xyw[i];
            case 14:
                return new SignInAccount[i];
            case 15:
                return new vy2[i];
            case 16:
                return new wy2[i];
            case 17:
                return new rad[i];
            case 18:
                return new hbd[i];
            case 19:
                return new ry2[i];
            case 20:
                return new sy2[i];
            case 21:
                return new ty2[i];
            case 22:
                return new uy2[i];
            case 23:
                return new coo[i];
            case 24:
                return new doo[i];
            case 25:
                return new SignInConfiguration[i];
            case 26:
                return new sfq[i];
            case 27:
                return new ufq[i];
            case o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                return new Transport[i];
            default:
                return new ju1[i];
        }
    }
}
