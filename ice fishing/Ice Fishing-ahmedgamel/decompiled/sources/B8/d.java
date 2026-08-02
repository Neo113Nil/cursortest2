package B8;

import R2.C0381g;
import R2.C0382h;
import R2.C0385k;
import R2.E;
import R2.m;
import R2.n;
import R2.s;
import R2.t;
import U.k;
import Z0.C0423f;
import android.accounts.Account;
import android.app.PendingIntent;
import android.content.Intent;
import android.content.IntentSender;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.fragment.app.C0463b;
import androidx.fragment.app.C0464c;
import androidx.fragment.app.K;
import androidx.fragment.app.P;
import androidx.fragment.app.U;
import androidx.versionedparcelable.ParcelImpl;
import com.facebook.ads.internal.util.parcelable.WrappedParcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.Status;
import e.C4466a;
import e.j;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class d implements Parcelable.Creator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f296a;

    public /* synthetic */ d(int i) {
        this.f296a = i;
    }

    public static void a(C0382h c0382h, Parcel parcel, int i) {
        int x9 = com.bumptech.glide.e.x(parcel, 20293);
        com.bumptech.glide.e.w(parcel, 1, 4);
        parcel.writeInt(c0382h.f2817n);
        com.bumptech.glide.e.w(parcel, 2, 4);
        parcel.writeInt(c0382h.f2818u);
        com.bumptech.glide.e.w(parcel, 3, 4);
        parcel.writeInt(c0382h.f2819v);
        com.bumptech.glide.e.r(parcel, 4, c0382h.f2820w);
        com.bumptech.glide.e.p(parcel, 5, c0382h.f2821x);
        com.bumptech.glide.e.u(parcel, 6, c0382h.f2822y, i);
        com.bumptech.glide.e.n(parcel, 7, c0382h.f2823z);
        com.bumptech.glide.e.q(parcel, 8, c0382h.f2810A, i);
        com.bumptech.glide.e.u(parcel, 10, c0382h.f2811B, i);
        com.bumptech.glide.e.u(parcel, 11, c0382h.f2812C, i);
        com.bumptech.glide.e.w(parcel, 12, 4);
        parcel.writeInt(c0382h.f2813D ? 1 : 0);
        com.bumptech.glide.e.w(parcel, 13, 4);
        parcel.writeInt(c0382h.f2814E);
        boolean z6 = c0382h.f2815F;
        com.bumptech.glide.e.w(parcel, 14, 4);
        parcel.writeInt(z6 ? 1 : 0);
        com.bumptech.glide.e.r(parcel, 15, c0382h.f2816G);
        com.bumptech.glide.e.z(parcel, x9);
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int readInt;
        switch (this.f296a) {
            case 0:
                return new pl.droidsonroids.gif.d(parcel);
            case 1:
                return new ParcelImpl(parcel);
            case 2:
                int L2 = com.bumptech.glide.d.L(parcel);
                String str = null;
                int i = 0;
                while (parcel.dataPosition() < L2) {
                    int readInt2 = parcel.readInt();
                    char c9 = (char) readInt2;
                    if (c9 == 1) {
                        str = com.bumptech.glide.d.l(parcel, readInt2);
                    } else if (c9 != 2) {
                        com.bumptech.glide.d.J(parcel, readInt2);
                    } else {
                        i = com.bumptech.glide.d.B(parcel, readInt2);
                    }
                }
                com.bumptech.glide.d.p(parcel, L2);
                return new K2.c(str, i);
            case 3:
                int L6 = com.bumptech.glide.d.L(parcel);
                long j6 = 0;
                int i4 = 0;
                String str2 = null;
                String str3 = null;
                String str4 = null;
                String str5 = null;
                Uri uri = null;
                String str6 = null;
                String str7 = null;
                ArrayList arrayList = null;
                String str8 = null;
                String str9 = null;
                while (true) {
                    long j9 = j6;
                    while (parcel.dataPosition() < L6) {
                        readInt = parcel.readInt();
                        switch ((char) readInt) {
                            case 1:
                                i4 = com.bumptech.glide.d.B(parcel, readInt);
                                break;
                            case 2:
                                str2 = com.bumptech.glide.d.l(parcel, readInt);
                                break;
                            case 3:
                                str3 = com.bumptech.glide.d.l(parcel, readInt);
                                break;
                            case 4:
                                str4 = com.bumptech.glide.d.l(parcel, readInt);
                                break;
                            case 5:
                                str5 = com.bumptech.glide.d.l(parcel, readInt);
                                break;
                            case 6:
                                uri = (Uri) com.bumptech.glide.d.k(parcel, readInt, Uri.CREATOR);
                                break;
                            case 7:
                                str6 = com.bumptech.glide.d.l(parcel, readInt);
                                break;
                            case '\b':
                                break;
                            case '\t':
                                str7 = com.bumptech.glide.d.l(parcel, readInt);
                                break;
                            case '\n':
                                Parcelable.Creator<Scope> creator = Scope.CREATOR;
                                int D8 = com.bumptech.glide.d.D(parcel, readInt);
                                int dataPosition = parcel.dataPosition();
                                if (D8 != 0) {
                                    ArrayList createTypedArrayList = parcel.createTypedArrayList(creator);
                                    parcel.setDataPosition(dataPosition + D8);
                                    arrayList = createTypedArrayList;
                                    break;
                                } else {
                                    arrayList = null;
                                    break;
                                }
                            case 11:
                                str8 = com.bumptech.glide.d.l(parcel, readInt);
                                break;
                            case '\f':
                                str9 = com.bumptech.glide.d.l(parcel, readInt);
                                break;
                            default:
                                com.bumptech.glide.d.J(parcel, readInt);
                                break;
                        }
                    }
                    com.bumptech.glide.d.p(parcel, L6);
                    return new GoogleSignInAccount(i4, str2, str3, str4, str5, uri, str6, j9, str7, arrayList, str8, str9);
                    j6 = com.bumptech.glide.d.C(parcel, readInt);
                    break;
                }
            case 4:
                return new M3.a(parcel);
            case 5:
                int L8 = com.bumptech.glide.d.L(parcel);
                PendingIntent pendingIntent = null;
                String str10 = null;
                Integer num = null;
                int i6 = 0;
                int i9 = 0;
                while (parcel.dataPosition() < L8) {
                    int readInt3 = parcel.readInt();
                    char c10 = (char) readInt3;
                    if (c10 == 1) {
                        i6 = com.bumptech.glide.d.B(parcel, readInt3);
                    } else if (c10 == 2) {
                        i9 = com.bumptech.glide.d.B(parcel, readInt3);
                    } else if (c10 == 3) {
                        pendingIntent = (PendingIntent) com.bumptech.glide.d.k(parcel, readInt3, PendingIntent.CREATOR);
                    } else if (c10 == 4) {
                        str10 = com.bumptech.glide.d.l(parcel, readInt3);
                    } else if (c10 != 5) {
                        com.bumptech.glide.d.J(parcel, readInt3);
                    } else {
                        int D9 = com.bumptech.glide.d.D(parcel, readInt3);
                        if (D9 == 0) {
                            num = null;
                        } else {
                            if (D9 != 4) {
                                String hexString = Integer.toHexString(D9);
                                StringBuilder sb = new StringBuilder(String.valueOf(hexString).length() + String.valueOf(4).length() + 19 + String.valueOf(D9).length() + 4 + 1);
                                sb.append("Expected size 4 got ");
                                sb.append(D9);
                                sb.append(" (0x");
                                sb.append(hexString);
                                sb.append(")");
                                throw new B0.c(sb.toString(), parcel);
                            }
                            num = Integer.valueOf(parcel.readInt());
                        }
                    }
                }
                com.bumptech.glide.d.p(parcel, L8);
                return new O2.b(i6, i9, pendingIntent, str10, num);
            case 6:
                int L9 = com.bumptech.glide.d.L(parcel);
                boolean z6 = false;
                int i10 = 0;
                long j10 = -1;
                String str11 = null;
                while (parcel.dataPosition() < L9) {
                    int readInt4 = parcel.readInt();
                    char c11 = (char) readInt4;
                    if (c11 == 1) {
                        str11 = com.bumptech.glide.d.l(parcel, readInt4);
                    } else if (c11 == 2) {
                        i10 = com.bumptech.glide.d.B(parcel, readInt4);
                    } else if (c11 == 3) {
                        j10 = com.bumptech.glide.d.C(parcel, readInt4);
                    } else if (c11 != 4) {
                        com.bumptech.glide.d.J(parcel, readInt4);
                    } else {
                        z6 = com.bumptech.glide.d.z(parcel, readInt4);
                    }
                }
                com.bumptech.glide.d.p(parcel, L9);
                return new O2.d(str11, z6, i10, j10);
            case 7:
                int L10 = com.bumptech.glide.d.L(parcel);
                String str12 = null;
                int i11 = 0;
                while (parcel.dataPosition() < L10) {
                    int readInt5 = parcel.readInt();
                    char c12 = (char) readInt5;
                    if (c12 == 1) {
                        i11 = com.bumptech.glide.d.B(parcel, readInt5);
                    } else if (c12 != 2) {
                        com.bumptech.glide.d.J(parcel, readInt5);
                    } else {
                        str12 = com.bumptech.glide.d.l(parcel, readInt5);
                    }
                }
                com.bumptech.glide.d.p(parcel, L10);
                return new Scope(i11, str12);
            case 8:
                int L11 = com.bumptech.glide.d.L(parcel);
                String str13 = null;
                O2.b bVar = null;
                int i12 = 0;
                PendingIntent pendingIntent2 = null;
                while (parcel.dataPosition() < L11) {
                    int readInt6 = parcel.readInt();
                    char c13 = (char) readInt6;
                    if (c13 == 1) {
                        i12 = com.bumptech.glide.d.B(parcel, readInt6);
                    } else if (c13 == 2) {
                        str13 = com.bumptech.glide.d.l(parcel, readInt6);
                    } else if (c13 == 3) {
                        pendingIntent2 = (PendingIntent) com.bumptech.glide.d.k(parcel, readInt6, PendingIntent.CREATOR);
                    } else if (c13 != 4) {
                        com.bumptech.glide.d.J(parcel, readInt6);
                    } else {
                        bVar = (O2.b) com.bumptech.glide.d.k(parcel, readInt6, O2.b.CREATOR);
                    }
                }
                com.bumptech.glide.d.p(parcel, L11);
                return new Status(i12, str13, pendingIntent2, bVar);
            case 9:
                return new WrappedParcelable(parcel);
            case 10:
                int L12 = com.bumptech.glide.d.L(parcel);
                int i13 = 0;
                while (true) {
                    ArrayList arrayList2 = null;
                    while (parcel.dataPosition() < L12) {
                        int readInt7 = parcel.readInt();
                        char c14 = (char) readInt7;
                        if (c14 == 1) {
                            i13 = com.bumptech.glide.d.B(parcel, readInt7);
                        } else if (c14 != 2) {
                            com.bumptech.glide.d.J(parcel, readInt7);
                        } else {
                            Parcelable.Creator<C0385k> creator2 = C0385k.CREATOR;
                            int D10 = com.bumptech.glide.d.D(parcel, readInt7);
                            int dataPosition2 = parcel.dataPosition();
                            if (D10 == 0) {
                                break;
                            }
                            arrayList2 = parcel.createTypedArrayList(creator2);
                            parcel.setDataPosition(dataPosition2 + D10);
                        }
                    }
                    com.bumptech.glide.d.p(parcel, L12);
                    return new n(i13, arrayList2);
                    break;
                }
            case 11:
                int L13 = com.bumptech.glide.d.L(parcel);
                int i14 = 0;
                int i15 = 0;
                int i16 = 0;
                int i17 = 0;
                long j11 = 0;
                long j12 = 0;
                String str14 = null;
                String str15 = null;
                int i18 = -1;
                while (parcel.dataPosition() < L13) {
                    int readInt8 = parcel.readInt();
                    switch ((char) readInt8) {
                        case 1:
                            i14 = com.bumptech.glide.d.B(parcel, readInt8);
                            break;
                        case 2:
                            i15 = com.bumptech.glide.d.B(parcel, readInt8);
                            break;
                        case 3:
                            i16 = com.bumptech.glide.d.B(parcel, readInt8);
                            break;
                        case 4:
                            j11 = com.bumptech.glide.d.C(parcel, readInt8);
                            break;
                        case 5:
                            j12 = com.bumptech.glide.d.C(parcel, readInt8);
                            break;
                        case 6:
                            str14 = com.bumptech.glide.d.l(parcel, readInt8);
                            break;
                        case 7:
                            str15 = com.bumptech.glide.d.l(parcel, readInt8);
                            break;
                        case '\b':
                            i17 = com.bumptech.glide.d.B(parcel, readInt8);
                            break;
                        case '\t':
                            i18 = com.bumptech.glide.d.B(parcel, readInt8);
                            break;
                        default:
                            com.bumptech.glide.d.J(parcel, readInt8);
                            break;
                    }
                }
                com.bumptech.glide.d.p(parcel, L13);
                return new C0385k(i14, i15, i16, j11, j12, str14, str15, i17, i18);
            case 12:
                int L14 = com.bumptech.glide.d.L(parcel);
                int i19 = 0;
                Account account = null;
                GoogleSignInAccount googleSignInAccount = null;
                int i20 = 0;
                while (parcel.dataPosition() < L14) {
                    int readInt9 = parcel.readInt();
                    char c15 = (char) readInt9;
                    if (c15 == 1) {
                        i19 = com.bumptech.glide.d.B(parcel, readInt9);
                    } else if (c15 == 2) {
                        account = (Account) com.bumptech.glide.d.k(parcel, readInt9, Account.CREATOR);
                    } else if (c15 == 3) {
                        i20 = com.bumptech.glide.d.B(parcel, readInt9);
                    } else if (c15 != 4) {
                        com.bumptech.glide.d.J(parcel, readInt9);
                    } else {
                        googleSignInAccount = (GoogleSignInAccount) com.bumptech.glide.d.k(parcel, readInt9, GoogleSignInAccount.CREATOR);
                    }
                }
                com.bumptech.glide.d.p(parcel, L14);
                return new s(i19, account, i20, googleSignInAccount);
            case 13:
                int L15 = com.bumptech.glide.d.L(parcel);
                int i21 = 0;
                boolean z9 = false;
                boolean z10 = false;
                IBinder iBinder = null;
                O2.b bVar2 = null;
                while (parcel.dataPosition() < L15) {
                    int readInt10 = parcel.readInt();
                    char c16 = (char) readInt10;
                    if (c16 == 1) {
                        i21 = com.bumptech.glide.d.B(parcel, readInt10);
                    } else if (c16 == 2) {
                        iBinder = com.bumptech.glide.d.A(parcel, readInt10);
                    } else if (c16 == 3) {
                        bVar2 = (O2.b) com.bumptech.glide.d.k(parcel, readInt10, O2.b.CREATOR);
                    } else if (c16 == 4) {
                        z9 = com.bumptech.glide.d.z(parcel, readInt10);
                    } else if (c16 != 5) {
                        com.bumptech.glide.d.J(parcel, readInt10);
                    } else {
                        z10 = com.bumptech.glide.d.z(parcel, readInt10);
                    }
                }
                com.bumptech.glide.d.p(parcel, L15);
                return new t(i21, iBinder, bVar2, z9, z10);
            case 14:
                int L16 = com.bumptech.glide.d.L(parcel);
                int i22 = 0;
                boolean z11 = false;
                boolean z12 = false;
                int i23 = 0;
                int i24 = 0;
                while (parcel.dataPosition() < L16) {
                    int readInt11 = parcel.readInt();
                    char c17 = (char) readInt11;
                    if (c17 == 1) {
                        i22 = com.bumptech.glide.d.B(parcel, readInt11);
                    } else if (c17 == 2) {
                        z11 = com.bumptech.glide.d.z(parcel, readInt11);
                    } else if (c17 == 3) {
                        z12 = com.bumptech.glide.d.z(parcel, readInt11);
                    } else if (c17 == 4) {
                        i23 = com.bumptech.glide.d.B(parcel, readInt11);
                    } else if (c17 != 5) {
                        com.bumptech.glide.d.J(parcel, readInt11);
                    } else {
                        i24 = com.bumptech.glide.d.B(parcel, readInt11);
                    }
                }
                com.bumptech.glide.d.p(parcel, L16);
                return new m(i22, z11, z12, i23, i24);
            case 15:
                int L17 = com.bumptech.glide.d.L(parcel);
                Bundle bundle = null;
                C0381g c0381g = null;
                int i25 = 0;
                O2.d[] dVarArr = null;
                while (parcel.dataPosition() < L17) {
                    int readInt12 = parcel.readInt();
                    char c18 = (char) readInt12;
                    if (c18 == 1) {
                        bundle = com.bumptech.glide.d.i(parcel, readInt12);
                    } else if (c18 == 2) {
                        dVarArr = (O2.d[]) com.bumptech.glide.d.o(parcel, readInt12, O2.d.CREATOR);
                    } else if (c18 == 3) {
                        i25 = com.bumptech.glide.d.B(parcel, readInt12);
                    } else if (c18 != 4) {
                        com.bumptech.glide.d.J(parcel, readInt12);
                    } else {
                        c0381g = (C0381g) com.bumptech.glide.d.k(parcel, readInt12, C0381g.CREATOR);
                    }
                }
                com.bumptech.glide.d.p(parcel, L17);
                E e9 = new E();
                e9.f2747n = bundle;
                e9.f2748u = dVarArr;
                e9.f2749v = i25;
                e9.f2750w = c0381g;
                return e9;
            case 16:
                int L18 = com.bumptech.glide.d.L(parcel);
                m mVar = null;
                int[] iArr = null;
                int[] iArr2 = null;
                boolean z13 = false;
                boolean z14 = false;
                int i26 = 0;
                while (parcel.dataPosition() < L18) {
                    int readInt13 = parcel.readInt();
                    switch ((char) readInt13) {
                        case 1:
                            mVar = (m) com.bumptech.glide.d.k(parcel, readInt13, m.CREATOR);
                            break;
                        case 2:
                            z13 = com.bumptech.glide.d.z(parcel, readInt13);
                            break;
                        case 3:
                            z14 = com.bumptech.glide.d.z(parcel, readInt13);
                            break;
                        case 4:
                            int D11 = com.bumptech.glide.d.D(parcel, readInt13);
                            int dataPosition3 = parcel.dataPosition();
                            if (D11 != 0) {
                                iArr = parcel.createIntArray();
                                parcel.setDataPosition(dataPosition3 + D11);
                                break;
                            } else {
                                iArr = null;
                                break;
                            }
                        case 5:
                            i26 = com.bumptech.glide.d.B(parcel, readInt13);
                            break;
                        case 6:
                            int D12 = com.bumptech.glide.d.D(parcel, readInt13);
                            int dataPosition4 = parcel.dataPosition();
                            if (D12 != 0) {
                                iArr2 = parcel.createIntArray();
                                parcel.setDataPosition(dataPosition4 + D12);
                                break;
                            } else {
                                iArr2 = null;
                                break;
                            }
                        default:
                            com.bumptech.glide.d.J(parcel, readInt13);
                            break;
                    }
                }
                com.bumptech.glide.d.p(parcel, L18);
                return new C0381g(mVar, z13, z14, iArr, i26, iArr2);
            case 17:
                int L19 = com.bumptech.glide.d.L(parcel);
                Scope[] scopeArr = C0382h.f2808H;
                Bundle bundle2 = new Bundle();
                O2.d[] dVarArr2 = C0382h.f2809I;
                O2.d[] dVarArr3 = dVarArr2;
                String str16 = null;
                IBinder iBinder2 = null;
                Account account2 = null;
                String str17 = null;
                int i27 = 0;
                int i28 = 0;
                int i29 = 0;
                boolean z15 = false;
                int i30 = 0;
                boolean z16 = false;
                while (parcel.dataPosition() < L19) {
                    int readInt14 = parcel.readInt();
                    switch ((char) readInt14) {
                        case 1:
                            i27 = com.bumptech.glide.d.B(parcel, readInt14);
                            break;
                        case 2:
                            i28 = com.bumptech.glide.d.B(parcel, readInt14);
                            break;
                        case 3:
                            i29 = com.bumptech.glide.d.B(parcel, readInt14);
                            break;
                        case 4:
                            str16 = com.bumptech.glide.d.l(parcel, readInt14);
                            break;
                        case 5:
                            iBinder2 = com.bumptech.glide.d.A(parcel, readInt14);
                            break;
                        case 6:
                            scopeArr = (Scope[]) com.bumptech.glide.d.o(parcel, readInt14, Scope.CREATOR);
                            break;
                        case 7:
                            bundle2 = com.bumptech.glide.d.i(parcel, readInt14);
                            break;
                        case '\b':
                            account2 = (Account) com.bumptech.glide.d.k(parcel, readInt14, Account.CREATOR);
                            break;
                        case '\t':
                        default:
                            com.bumptech.glide.d.J(parcel, readInt14);
                            break;
                        case '\n':
                            dVarArr2 = (O2.d[]) com.bumptech.glide.d.o(parcel, readInt14, O2.d.CREATOR);
                            break;
                        case 11:
                            dVarArr3 = (O2.d[]) com.bumptech.glide.d.o(parcel, readInt14, O2.d.CREATOR);
                            break;
                        case '\f':
                            z15 = com.bumptech.glide.d.z(parcel, readInt14);
                            break;
                        case '\r':
                            i30 = com.bumptech.glide.d.B(parcel, readInt14);
                            break;
                        case 14:
                            z16 = com.bumptech.glide.d.z(parcel, readInt14);
                            break;
                        case 15:
                            str17 = com.bumptech.glide.d.l(parcel, readInt14);
                            break;
                    }
                }
                com.bumptech.glide.d.p(parcel, L19);
                return new C0382h(i27, i28, i29, str16, iBinder2, scopeArr, bundle2, account2, dVarArr2, dVarArr3, z15, i30, z16, str17);
            case 18:
                k kVar = new k(parcel);
                kVar.f3244n = parcel.readInt();
                return kVar;
            case 19:
                C0423f c0423f = new C0423f(parcel);
                c0423f.f3949n = parcel.readString();
                c0423f.f3951v = parcel.readFloat();
                c0423f.f3952w = parcel.readInt() == 1;
                c0423f.f3953x = parcel.readString();
                c0423f.f3954y = parcel.readInt();
                c0423f.f3955z = parcel.readInt();
                return c0423f;
            case 20:
                return new C0463b(parcel);
            case 21:
                return new C0464c(parcel);
            case 22:
                K k9 = new K();
                k9.f4802n = parcel.readString();
                k9.f4803u = parcel.readInt();
                return k9;
            case 23:
                P p9 = new P();
                p9.f4848x = null;
                p9.f4849y = new ArrayList();
                p9.f4850z = new ArrayList();
                p9.f4844n = parcel.createStringArrayList();
                p9.f4845u = parcel.createStringArrayList();
                p9.f4846v = (C0463b[]) parcel.createTypedArray(C0463b.CREATOR);
                p9.f4847w = parcel.readInt();
                p9.f4848x = parcel.readString();
                p9.f4849y = parcel.createStringArrayList();
                p9.f4850z = parcel.createTypedArrayList(C0464c.CREATOR);
                p9.f4843A = parcel.createTypedArrayList(K.CREATOR);
                return p9;
            case 24:
                return new U(parcel);
            case 25:
                return new com.google.android.material.datepicker.b((com.google.android.material.datepicker.n) parcel.readParcelable(com.google.android.material.datepicker.n.class.getClassLoader()), (com.google.android.material.datepicker.n) parcel.readParcelable(com.google.android.material.datepicker.n.class.getClassLoader()), (com.google.android.material.datepicker.d) parcel.readParcelable(com.google.android.material.datepicker.d.class.getClassLoader()), (com.google.android.material.datepicker.n) parcel.readParcelable(com.google.android.material.datepicker.n.class.getClassLoader()), parcel.readInt());
            case 26:
                return new com.google.android.material.datepicker.d(parcel.readLong());
            case 27:
                return com.google.android.material.datepicker.n.a(parcel.readInt(), parcel.readInt());
            case 28:
                kotlin.jvm.internal.h.e(parcel, "parcel");
                return new C4466a(parcel.readInt(), parcel.readInt() == 0 ? null : (Intent) Intent.CREATOR.createFromParcel(parcel));
            default:
                kotlin.jvm.internal.h.e(parcel, "inParcel");
                Parcelable readParcelable = parcel.readParcelable(IntentSender.class.getClassLoader());
                kotlin.jvm.internal.h.b(readParcelable);
                return new j((IntentSender) readParcelable, (Intent) parcel.readParcelable(Intent.class.getClassLoader()), parcel.readInt(), parcel.readInt());
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.f296a) {
            case 0:
                return new pl.droidsonroids.gif.d[i];
            case 1:
                return new ParcelImpl[i];
            case 2:
                return new K2.c[i];
            case 3:
                return new GoogleSignInAccount[i];
            case 4:
                return new M3.a[i];
            case 5:
                return new O2.b[i];
            case 6:
                return new O2.d[i];
            case 7:
                return new Scope[i];
            case 8:
                return new Status[i];
            case 9:
                return new WrappedParcelable[i];
            case 10:
                return new n[i];
            case 11:
                return new C0385k[i];
            case 12:
                return new s[i];
            case 13:
                return new t[i];
            case 14:
                return new m[i];
            case 15:
                return new E[i];
            case 16:
                return new C0381g[i];
            case 17:
                return new C0382h[i];
            case 18:
                return new k[i];
            case 19:
                return new C0423f[i];
            case 20:
                return new C0463b[i];
            case 21:
                return new C0464c[i];
            case 22:
                return new K[i];
            case 23:
                return new P[i];
            case 24:
                return new U[i];
            case 25:
                return new com.google.android.material.datepicker.b[i];
            case 26:
                return new com.google.android.material.datepicker.d[i];
            case 27:
                return new com.google.android.material.datepicker.n[i];
            case 28:
                return new C4466a[i];
            default:
                return new j[i];
        }
    }
}
