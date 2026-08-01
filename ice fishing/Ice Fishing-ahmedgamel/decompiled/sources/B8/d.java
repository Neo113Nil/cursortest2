package B8;

import P2.C0377g;
import P2.C0378h;
import P2.C0381k;
import P2.E;
import P2.m;
import P2.n;
import P2.s;
import P2.t;
import U.k;
import X0.C0419f;
import android.accounts.Account;
import android.app.PendingIntent;
import android.content.Intent;
import android.content.IntentSender;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.fragment.app.C0459b;
import androidx.fragment.app.C0460c;
import androidx.fragment.app.K;
import androidx.fragment.app.P;
import androidx.fragment.app.U;
import androidx.versionedparcelable.ParcelImpl;
import com.facebook.ads.internal.util.parcelable.WrappedParcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.Status;
import e.C4455a;
import e.j;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class d implements Parcelable.Creator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f230a;

    public /* synthetic */ d(int i) {
        this.f230a = i;
    }

    public static void a(C0378h c0378h, Parcel parcel, int i) {
        int G7 = A8.b.G(parcel, 20293);
        A8.b.F(parcel, 1, 4);
        parcel.writeInt(c0378h.f2496n);
        A8.b.F(parcel, 2, 4);
        parcel.writeInt(c0378h.f2497u);
        A8.b.F(parcel, 3, 4);
        parcel.writeInt(c0378h.f2498v);
        A8.b.z(parcel, 4, c0378h.f2499w);
        A8.b.x(parcel, 5, c0378h.f2500x);
        A8.b.C(parcel, 6, c0378h.f2501y, i);
        A8.b.v(parcel, 7, c0378h.f2502z);
        A8.b.y(parcel, 8, c0378h.f2489A, i);
        A8.b.C(parcel, 10, c0378h.f2490B, i);
        A8.b.C(parcel, 11, c0378h.f2491C, i);
        A8.b.F(parcel, 12, 4);
        parcel.writeInt(c0378h.f2492D ? 1 : 0);
        A8.b.F(parcel, 13, 4);
        parcel.writeInt(c0378h.f2493E);
        boolean z3 = c0378h.f2494F;
        A8.b.F(parcel, 14, 4);
        parcel.writeInt(z3 ? 1 : 0);
        A8.b.z(parcel, 15, c0378h.f2495G);
        A8.b.I(parcel, G7);
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int readInt;
        switch (this.f230a) {
            case 0:
                return new pl.droidsonroids.gif.d(parcel);
            case 1:
                return new ParcelImpl(parcel);
            case 2:
                int H8 = t8.g.H(parcel);
                String str = null;
                int i = 0;
                while (parcel.dataPosition() < H8) {
                    int readInt2 = parcel.readInt();
                    char c9 = (char) readInt2;
                    if (c9 == 1) {
                        str = t8.g.i(parcel, readInt2);
                    } else if (c9 != 2) {
                        t8.g.G(parcel, readInt2);
                    } else {
                        i = t8.g.z(parcel, readInt2);
                    }
                }
                t8.g.n(parcel, H8);
                return new I2.c(str, i);
            case 3:
                int H9 = t8.g.H(parcel);
                long j6 = 0;
                int i6 = 0;
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
                    while (parcel.dataPosition() < H9) {
                        readInt = parcel.readInt();
                        switch ((char) readInt) {
                            case 1:
                                i6 = t8.g.z(parcel, readInt);
                                break;
                            case 2:
                                str2 = t8.g.i(parcel, readInt);
                                break;
                            case 3:
                                str3 = t8.g.i(parcel, readInt);
                                break;
                            case 4:
                                str4 = t8.g.i(parcel, readInt);
                                break;
                            case 5:
                                str5 = t8.g.i(parcel, readInt);
                                break;
                            case 6:
                                uri = (Uri) t8.g.h(parcel, readInt, Uri.CREATOR);
                                break;
                            case 7:
                                str6 = t8.g.i(parcel, readInt);
                                break;
                            case '\b':
                                break;
                            case '\t':
                                str7 = t8.g.i(parcel, readInt);
                                break;
                            case '\n':
                                Parcelable.Creator<Scope> creator = Scope.CREATOR;
                                int B9 = t8.g.B(parcel, readInt);
                                int dataPosition = parcel.dataPosition();
                                if (B9 != 0) {
                                    ArrayList createTypedArrayList = parcel.createTypedArrayList(creator);
                                    parcel.setDataPosition(dataPosition + B9);
                                    arrayList = createTypedArrayList;
                                    break;
                                } else {
                                    arrayList = null;
                                    break;
                                }
                            case 11:
                                str8 = t8.g.i(parcel, readInt);
                                break;
                            case '\f':
                                str9 = t8.g.i(parcel, readInt);
                                break;
                            default:
                                t8.g.G(parcel, readInt);
                                break;
                        }
                    }
                    t8.g.n(parcel, H9);
                    return new GoogleSignInAccount(i6, str2, str3, str4, str5, uri, str6, j9, str7, arrayList, str8, str9);
                    j6 = t8.g.A(parcel, readInt);
                    break;
                }
            case 4:
                return new K3.a(parcel);
            case 5:
                int H10 = t8.g.H(parcel);
                PendingIntent pendingIntent = null;
                String str10 = null;
                Integer num = null;
                int i9 = 0;
                int i10 = 0;
                while (parcel.dataPosition() < H10) {
                    int readInt3 = parcel.readInt();
                    char c10 = (char) readInt3;
                    if (c10 == 1) {
                        i9 = t8.g.z(parcel, readInt3);
                    } else if (c10 == 2) {
                        i10 = t8.g.z(parcel, readInt3);
                    } else if (c10 == 3) {
                        pendingIntent = (PendingIntent) t8.g.h(parcel, readInt3, PendingIntent.CREATOR);
                    } else if (c10 == 4) {
                        str10 = t8.g.i(parcel, readInt3);
                    } else if (c10 != 5) {
                        t8.g.G(parcel, readInt3);
                    } else {
                        int B10 = t8.g.B(parcel, readInt3);
                        if (B10 == 0) {
                            num = null;
                        } else {
                            if (B10 != 4) {
                                String hexString = Integer.toHexString(B10);
                                StringBuilder sb = new StringBuilder(String.valueOf(hexString).length() + String.valueOf(4).length() + 19 + String.valueOf(B10).length() + 4 + 1);
                                sb.append("Expected size 4 got ");
                                sb.append(B10);
                                sb.append(" (0x");
                                sb.append(hexString);
                                sb.append(")");
                                throw new B0.c(sb.toString(), parcel);
                            }
                            num = Integer.valueOf(parcel.readInt());
                        }
                    }
                }
                t8.g.n(parcel, H10);
                return new M2.b(i9, i10, pendingIntent, str10, num);
            case 6:
                int H11 = t8.g.H(parcel);
                boolean z3 = false;
                int i11 = 0;
                long j10 = -1;
                String str11 = null;
                while (parcel.dataPosition() < H11) {
                    int readInt4 = parcel.readInt();
                    char c11 = (char) readInt4;
                    if (c11 == 1) {
                        str11 = t8.g.i(parcel, readInt4);
                    } else if (c11 == 2) {
                        i11 = t8.g.z(parcel, readInt4);
                    } else if (c11 == 3) {
                        j10 = t8.g.A(parcel, readInt4);
                    } else if (c11 != 4) {
                        t8.g.G(parcel, readInt4);
                    } else {
                        z3 = t8.g.x(parcel, readInt4);
                    }
                }
                t8.g.n(parcel, H11);
                return new M2.d(str11, z3, i11, j10);
            case 7:
                int H12 = t8.g.H(parcel);
                String str12 = null;
                int i12 = 0;
                while (parcel.dataPosition() < H12) {
                    int readInt5 = parcel.readInt();
                    char c12 = (char) readInt5;
                    if (c12 == 1) {
                        i12 = t8.g.z(parcel, readInt5);
                    } else if (c12 != 2) {
                        t8.g.G(parcel, readInt5);
                    } else {
                        str12 = t8.g.i(parcel, readInt5);
                    }
                }
                t8.g.n(parcel, H12);
                return new Scope(i12, str12);
            case 8:
                int H13 = t8.g.H(parcel);
                String str13 = null;
                M2.b bVar = null;
                int i13 = 0;
                PendingIntent pendingIntent2 = null;
                while (parcel.dataPosition() < H13) {
                    int readInt6 = parcel.readInt();
                    char c13 = (char) readInt6;
                    if (c13 == 1) {
                        i13 = t8.g.z(parcel, readInt6);
                    } else if (c13 == 2) {
                        str13 = t8.g.i(parcel, readInt6);
                    } else if (c13 == 3) {
                        pendingIntent2 = (PendingIntent) t8.g.h(parcel, readInt6, PendingIntent.CREATOR);
                    } else if (c13 != 4) {
                        t8.g.G(parcel, readInt6);
                    } else {
                        bVar = (M2.b) t8.g.h(parcel, readInt6, M2.b.CREATOR);
                    }
                }
                t8.g.n(parcel, H13);
                return new Status(i13, str13, pendingIntent2, bVar);
            case 9:
                return new WrappedParcelable(parcel);
            case 10:
                int H14 = t8.g.H(parcel);
                int i14 = 0;
                while (true) {
                    ArrayList arrayList2 = null;
                    while (parcel.dataPosition() < H14) {
                        int readInt7 = parcel.readInt();
                        char c14 = (char) readInt7;
                        if (c14 == 1) {
                            i14 = t8.g.z(parcel, readInt7);
                        } else if (c14 != 2) {
                            t8.g.G(parcel, readInt7);
                        } else {
                            Parcelable.Creator<C0381k> creator2 = C0381k.CREATOR;
                            int B11 = t8.g.B(parcel, readInt7);
                            int dataPosition2 = parcel.dataPosition();
                            if (B11 == 0) {
                                break;
                            }
                            arrayList2 = parcel.createTypedArrayList(creator2);
                            parcel.setDataPosition(dataPosition2 + B11);
                        }
                    }
                    t8.g.n(parcel, H14);
                    return new n(i14, arrayList2);
                    break;
                }
            case 11:
                int H15 = t8.g.H(parcel);
                int i15 = 0;
                int i16 = 0;
                int i17 = 0;
                int i18 = 0;
                long j11 = 0;
                long j12 = 0;
                String str14 = null;
                String str15 = null;
                int i19 = -1;
                while (parcel.dataPosition() < H15) {
                    int readInt8 = parcel.readInt();
                    switch ((char) readInt8) {
                        case 1:
                            i15 = t8.g.z(parcel, readInt8);
                            break;
                        case 2:
                            i16 = t8.g.z(parcel, readInt8);
                            break;
                        case 3:
                            i17 = t8.g.z(parcel, readInt8);
                            break;
                        case 4:
                            j11 = t8.g.A(parcel, readInt8);
                            break;
                        case 5:
                            j12 = t8.g.A(parcel, readInt8);
                            break;
                        case 6:
                            str14 = t8.g.i(parcel, readInt8);
                            break;
                        case 7:
                            str15 = t8.g.i(parcel, readInt8);
                            break;
                        case '\b':
                            i18 = t8.g.z(parcel, readInt8);
                            break;
                        case '\t':
                            i19 = t8.g.z(parcel, readInt8);
                            break;
                        default:
                            t8.g.G(parcel, readInt8);
                            break;
                    }
                }
                t8.g.n(parcel, H15);
                return new C0381k(i15, i16, i17, j11, j12, str14, str15, i18, i19);
            case 12:
                int H16 = t8.g.H(parcel);
                int i20 = 0;
                Account account = null;
                GoogleSignInAccount googleSignInAccount = null;
                int i21 = 0;
                while (parcel.dataPosition() < H16) {
                    int readInt9 = parcel.readInt();
                    char c15 = (char) readInt9;
                    if (c15 == 1) {
                        i20 = t8.g.z(parcel, readInt9);
                    } else if (c15 == 2) {
                        account = (Account) t8.g.h(parcel, readInt9, Account.CREATOR);
                    } else if (c15 == 3) {
                        i21 = t8.g.z(parcel, readInt9);
                    } else if (c15 != 4) {
                        t8.g.G(parcel, readInt9);
                    } else {
                        googleSignInAccount = (GoogleSignInAccount) t8.g.h(parcel, readInt9, GoogleSignInAccount.CREATOR);
                    }
                }
                t8.g.n(parcel, H16);
                return new s(i20, account, i21, googleSignInAccount);
            case 13:
                int H17 = t8.g.H(parcel);
                int i22 = 0;
                boolean z6 = false;
                boolean z9 = false;
                IBinder iBinder = null;
                M2.b bVar2 = null;
                while (parcel.dataPosition() < H17) {
                    int readInt10 = parcel.readInt();
                    char c16 = (char) readInt10;
                    if (c16 == 1) {
                        i22 = t8.g.z(parcel, readInt10);
                    } else if (c16 == 2) {
                        iBinder = t8.g.y(parcel, readInt10);
                    } else if (c16 == 3) {
                        bVar2 = (M2.b) t8.g.h(parcel, readInt10, M2.b.CREATOR);
                    } else if (c16 == 4) {
                        z6 = t8.g.x(parcel, readInt10);
                    } else if (c16 != 5) {
                        t8.g.G(parcel, readInt10);
                    } else {
                        z9 = t8.g.x(parcel, readInt10);
                    }
                }
                t8.g.n(parcel, H17);
                return new t(i22, iBinder, bVar2, z6, z9);
            case 14:
                int H18 = t8.g.H(parcel);
                int i23 = 0;
                boolean z10 = false;
                boolean z11 = false;
                int i24 = 0;
                int i25 = 0;
                while (parcel.dataPosition() < H18) {
                    int readInt11 = parcel.readInt();
                    char c17 = (char) readInt11;
                    if (c17 == 1) {
                        i23 = t8.g.z(parcel, readInt11);
                    } else if (c17 == 2) {
                        z10 = t8.g.x(parcel, readInt11);
                    } else if (c17 == 3) {
                        z11 = t8.g.x(parcel, readInt11);
                    } else if (c17 == 4) {
                        i24 = t8.g.z(parcel, readInt11);
                    } else if (c17 != 5) {
                        t8.g.G(parcel, readInt11);
                    } else {
                        i25 = t8.g.z(parcel, readInt11);
                    }
                }
                t8.g.n(parcel, H18);
                return new m(i23, z10, z11, i24, i25);
            case 15:
                int H19 = t8.g.H(parcel);
                Bundle bundle = null;
                C0377g c0377g = null;
                int i26 = 0;
                M2.d[] dVarArr = null;
                while (parcel.dataPosition() < H19) {
                    int readInt12 = parcel.readInt();
                    char c18 = (char) readInt12;
                    if (c18 == 1) {
                        bundle = t8.g.f(parcel, readInt12);
                    } else if (c18 == 2) {
                        dVarArr = (M2.d[]) t8.g.l(parcel, readInt12, M2.d.CREATOR);
                    } else if (c18 == 3) {
                        i26 = t8.g.z(parcel, readInt12);
                    } else if (c18 != 4) {
                        t8.g.G(parcel, readInt12);
                    } else {
                        c0377g = (C0377g) t8.g.h(parcel, readInt12, C0377g.CREATOR);
                    }
                }
                t8.g.n(parcel, H19);
                E e9 = new E();
                e9.f2426n = bundle;
                e9.f2427u = dVarArr;
                e9.f2428v = i26;
                e9.f2429w = c0377g;
                return e9;
            case 16:
                int H20 = t8.g.H(parcel);
                m mVar = null;
                int[] iArr = null;
                int[] iArr2 = null;
                boolean z12 = false;
                boolean z13 = false;
                int i27 = 0;
                while (parcel.dataPosition() < H20) {
                    int readInt13 = parcel.readInt();
                    switch ((char) readInt13) {
                        case 1:
                            mVar = (m) t8.g.h(parcel, readInt13, m.CREATOR);
                            break;
                        case 2:
                            z12 = t8.g.x(parcel, readInt13);
                            break;
                        case 3:
                            z13 = t8.g.x(parcel, readInt13);
                            break;
                        case 4:
                            int B12 = t8.g.B(parcel, readInt13);
                            int dataPosition3 = parcel.dataPosition();
                            if (B12 != 0) {
                                iArr = parcel.createIntArray();
                                parcel.setDataPosition(dataPosition3 + B12);
                                break;
                            } else {
                                iArr = null;
                                break;
                            }
                        case 5:
                            i27 = t8.g.z(parcel, readInt13);
                            break;
                        case 6:
                            int B13 = t8.g.B(parcel, readInt13);
                            int dataPosition4 = parcel.dataPosition();
                            if (B13 != 0) {
                                iArr2 = parcel.createIntArray();
                                parcel.setDataPosition(dataPosition4 + B13);
                                break;
                            } else {
                                iArr2 = null;
                                break;
                            }
                        default:
                            t8.g.G(parcel, readInt13);
                            break;
                    }
                }
                t8.g.n(parcel, H20);
                return new C0377g(mVar, z12, z13, iArr, i27, iArr2);
            case 17:
                int H21 = t8.g.H(parcel);
                Scope[] scopeArr = C0378h.f2487H;
                Bundle bundle2 = new Bundle();
                M2.d[] dVarArr2 = C0378h.f2488I;
                M2.d[] dVarArr3 = dVarArr2;
                String str16 = null;
                IBinder iBinder2 = null;
                Account account2 = null;
                String str17 = null;
                int i28 = 0;
                int i29 = 0;
                int i30 = 0;
                boolean z14 = false;
                int i31 = 0;
                boolean z15 = false;
                while (parcel.dataPosition() < H21) {
                    int readInt14 = parcel.readInt();
                    switch ((char) readInt14) {
                        case 1:
                            i28 = t8.g.z(parcel, readInt14);
                            break;
                        case 2:
                            i29 = t8.g.z(parcel, readInt14);
                            break;
                        case 3:
                            i30 = t8.g.z(parcel, readInt14);
                            break;
                        case 4:
                            str16 = t8.g.i(parcel, readInt14);
                            break;
                        case 5:
                            iBinder2 = t8.g.y(parcel, readInt14);
                            break;
                        case 6:
                            scopeArr = (Scope[]) t8.g.l(parcel, readInt14, Scope.CREATOR);
                            break;
                        case 7:
                            bundle2 = t8.g.f(parcel, readInt14);
                            break;
                        case '\b':
                            account2 = (Account) t8.g.h(parcel, readInt14, Account.CREATOR);
                            break;
                        case '\t':
                        default:
                            t8.g.G(parcel, readInt14);
                            break;
                        case '\n':
                            dVarArr2 = (M2.d[]) t8.g.l(parcel, readInt14, M2.d.CREATOR);
                            break;
                        case 11:
                            dVarArr3 = (M2.d[]) t8.g.l(parcel, readInt14, M2.d.CREATOR);
                            break;
                        case '\f':
                            z14 = t8.g.x(parcel, readInt14);
                            break;
                        case '\r':
                            i31 = t8.g.z(parcel, readInt14);
                            break;
                        case 14:
                            z15 = t8.g.x(parcel, readInt14);
                            break;
                        case 15:
                            str17 = t8.g.i(parcel, readInt14);
                            break;
                    }
                }
                t8.g.n(parcel, H21);
                return new C0378h(i28, i29, i30, str16, iBinder2, scopeArr, bundle2, account2, dVarArr2, dVarArr3, z14, i31, z15, str17);
            case 18:
                k kVar = new k(parcel);
                kVar.f3127n = parcel.readInt();
                return kVar;
            case 19:
                C0419f c0419f = new C0419f(parcel);
                c0419f.f3597n = parcel.readString();
                c0419f.f3599v = parcel.readFloat();
                c0419f.f3600w = parcel.readInt() == 1;
                c0419f.f3601x = parcel.readString();
                c0419f.f3602y = parcel.readInt();
                c0419f.f3603z = parcel.readInt();
                return c0419f;
            case 20:
                return new C0459b(parcel);
            case 21:
                return new C0460c(parcel);
            case 22:
                K k9 = new K();
                k9.f4834n = parcel.readString();
                k9.f4835u = parcel.readInt();
                return k9;
            case 23:
                P p9 = new P();
                p9.f4880x = null;
                p9.f4881y = new ArrayList();
                p9.f4882z = new ArrayList();
                p9.f4876n = parcel.createStringArrayList();
                p9.f4877u = parcel.createStringArrayList();
                p9.f4878v = (C0459b[]) parcel.createTypedArray(C0459b.CREATOR);
                p9.f4879w = parcel.readInt();
                p9.f4880x = parcel.readString();
                p9.f4881y = parcel.createStringArrayList();
                p9.f4882z = parcel.createTypedArrayList(C0460c.CREATOR);
                p9.f4875A = parcel.createTypedArrayList(K.CREATOR);
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
                return new C4455a(parcel.readInt(), parcel.readInt() == 0 ? null : (Intent) Intent.CREATOR.createFromParcel(parcel));
            default:
                kotlin.jvm.internal.h.e(parcel, "inParcel");
                Parcelable readParcelable = parcel.readParcelable(IntentSender.class.getClassLoader());
                kotlin.jvm.internal.h.b(readParcelable);
                return new j((IntentSender) readParcelable, (Intent) parcel.readParcelable(Intent.class.getClassLoader()), parcel.readInt(), parcel.readInt());
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.f230a) {
            case 0:
                return new pl.droidsonroids.gif.d[i];
            case 1:
                return new ParcelImpl[i];
            case 2:
                return new I2.c[i];
            case 3:
                return new GoogleSignInAccount[i];
            case 4:
                return new K3.a[i];
            case 5:
                return new M2.b[i];
            case 6:
                return new M2.d[i];
            case 7:
                return new Scope[i];
            case 8:
                return new Status[i];
            case 9:
                return new WrappedParcelable[i];
            case 10:
                return new n[i];
            case 11:
                return new C0381k[i];
            case 12:
                return new s[i];
            case 13:
                return new t[i];
            case 14:
                return new m[i];
            case 15:
                return new E[i];
            case 16:
                return new C0377g[i];
            case 17:
                return new C0378h[i];
            case 18:
                return new k[i];
            case 19:
                return new C0419f[i];
            case 20:
                return new C0459b[i];
            case 21:
                return new C0460c[i];
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
                return new C4455a[i];
            default:
                return new j[i];
        }
    }
}
