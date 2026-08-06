package C;

import P.C0066o;
import P.L;
import P.M;
import a.AbstractC0083a;
import android.accounts.Account;
import android.app.PendingIntent;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.versionedparcelable.ParcelImpl;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.Status;
import io.appmetrica.analytics.impl.C0376e9;
import java.util.ArrayList;
import p0.C1006c;
import p0.C1007d;
import p0.C1009f;
import p0.C1011h;
import p0.C1012i;
import p0.C1016m;
import p0.C1017n;
import p0.C1027x;

/* loaded from: classes.dex */
public final class l implements Parcelable.Creator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f125a;

    public /* synthetic */ l(int i2) {
        this.f125a = i2;
    }

    public static void a(C1007d c1007d, Parcel parcel, int i2) {
        int y2 = AbstractC0083a.y(parcel, 20293);
        int i3 = c1007d.f8351a;
        AbstractC0083a.A(parcel, 1, 4);
        parcel.writeInt(i3);
        AbstractC0083a.A(parcel, 2, 4);
        parcel.writeInt(c1007d.f8352b);
        AbstractC0083a.A(parcel, 3, 4);
        parcel.writeInt(c1007d.f8353c);
        AbstractC0083a.v(parcel, 4, c1007d.f8354d);
        IBinder iBinder = c1007d.f8355e;
        if (iBinder != null) {
            int y3 = AbstractC0083a.y(parcel, 5);
            parcel.writeStrongBinder(iBinder);
            AbstractC0083a.z(parcel, y3);
        }
        AbstractC0083a.w(parcel, 6, c1007d.f8356f, i2);
        Bundle bundle = c1007d.f8357g;
        if (bundle != null) {
            int y4 = AbstractC0083a.y(parcel, 7);
            parcel.writeBundle(bundle);
            AbstractC0083a.z(parcel, y4);
        }
        AbstractC0083a.u(parcel, 8, c1007d.f8358h, i2);
        AbstractC0083a.w(parcel, 10, c1007d.f8359i, i2);
        AbstractC0083a.w(parcel, 11, c1007d.f8360j, i2);
        AbstractC0083a.A(parcel, 12, 4);
        parcel.writeInt(c1007d.f8361k ? 1 : 0);
        AbstractC0083a.A(parcel, 13, 4);
        parcel.writeInt(c1007d.f8362l);
        boolean z2 = c1007d.f8363m;
        AbstractC0083a.A(parcel, 14, 4);
        parcel.writeInt(z2 ? 1 : 0);
        AbstractC0083a.v(parcel, 15, c1007d.f8364n);
        AbstractC0083a.z(parcel, y2);
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f125a) {
            case 0:
                m mVar = new m(parcel);
                mVar.f126a = parcel.readInt();
                return mVar;
            case 1:
                int H2 = R1.l.H(parcel);
                Intent intent = null;
                int i2 = 0;
                int i3 = 0;
                while (parcel.dataPosition() < H2) {
                    int readInt = parcel.readInt();
                    char c2 = (char) readInt;
                    if (c2 == 1) {
                        i2 = R1.l.x(parcel, readInt);
                    } else if (c2 == 2) {
                        i3 = R1.l.x(parcel, readInt);
                    } else if (c2 != 3) {
                        R1.l.E(parcel, readInt);
                    } else {
                        intent = (Intent) R1.l.i(parcel, readInt, Intent.CREATOR);
                    }
                }
                R1.l.m(parcel, H2);
                return new C0.b(i2, i3, intent);
            case 2:
                int H3 = R1.l.H(parcel);
                ArrayList<String> arrayList = null;
                String str = null;
                while (parcel.dataPosition() < H3) {
                    int readInt2 = parcel.readInt();
                    char c3 = (char) readInt2;
                    if (c3 == 1) {
                        int y2 = R1.l.y(parcel, readInt2);
                        int dataPosition = parcel.dataPosition();
                        if (y2 == 0) {
                            arrayList = null;
                        } else {
                            ArrayList<String> createStringArrayList = parcel.createStringArrayList();
                            parcel.setDataPosition(dataPosition + y2);
                            arrayList = createStringArrayList;
                        }
                    } else if (c3 != 2) {
                        R1.l.E(parcel, readInt2);
                    } else {
                        str = R1.l.j(parcel, readInt2);
                    }
                }
                R1.l.m(parcel, H3);
                return new C0.e(arrayList, str);
            case 3:
                int H4 = R1.l.H(parcel);
                m0.b bVar = null;
                int i4 = 0;
                C1017n c1017n = null;
                while (parcel.dataPosition() < H4) {
                    int readInt3 = parcel.readInt();
                    char c4 = (char) readInt3;
                    if (c4 == 1) {
                        i4 = R1.l.x(parcel, readInt3);
                    } else if (c4 == 2) {
                        bVar = (m0.b) R1.l.i(parcel, readInt3, m0.b.CREATOR);
                    } else if (c4 != 3) {
                        R1.l.E(parcel, readInt3);
                    } else {
                        c1017n = (C1017n) R1.l.i(parcel, readInt3, C1017n.CREATOR);
                    }
                }
                R1.l.m(parcel, H4);
                return new C0.f(i4, bVar, c1017n);
            case 4:
                C0066o c0066o = new C0066o();
                c0066o.f1362a = parcel.readInt();
                c0066o.f1363b = parcel.readInt();
                c0066o.f1364c = parcel.readInt() == 1;
                return c0066o;
            case 5:
                L l2 = new L();
                l2.f1274a = parcel.readInt();
                l2.f1275b = parcel.readInt();
                l2.f1277d = parcel.readInt() == 1;
                int readInt4 = parcel.readInt();
                if (readInt4 > 0) {
                    int[] iArr = new int[readInt4];
                    l2.f1276c = iArr;
                    parcel.readIntArray(iArr);
                }
                return l2;
            case 6:
                M m2 = new M();
                m2.f1278a = parcel.readInt();
                m2.f1279b = parcel.readInt();
                int readInt5 = parcel.readInt();
                m2.f1280c = readInt5;
                if (readInt5 > 0) {
                    int[] iArr2 = new int[readInt5];
                    m2.f1281d = iArr2;
                    parcel.readIntArray(iArr2);
                }
                int readInt6 = parcel.readInt();
                m2.f1282e = readInt6;
                if (readInt6 > 0) {
                    int[] iArr3 = new int[readInt6];
                    m2.f1283f = iArr3;
                    parcel.readIntArray(iArr3);
                }
                m2.f1285h = parcel.readInt() == 1;
                m2.f1286i = parcel.readInt() == 1;
                m2.f1287j = parcel.readInt() == 1;
                m2.f1284g = parcel.readArrayList(L.class.getClassLoader());
                return m2;
            case 7:
                return new ParcelImpl(parcel);
            case 8:
                int H5 = R1.l.H(parcel);
                String str2 = null;
                int i5 = 0;
                while (parcel.dataPosition() < H5) {
                    int readInt7 = parcel.readInt();
                    char c5 = (char) readInt7;
                    if (c5 == 1) {
                        str2 = R1.l.j(parcel, readInt7);
                    } else if (c5 != 2) {
                        R1.l.E(parcel, readInt7);
                    } else {
                        i5 = R1.l.x(parcel, readInt7);
                    }
                }
                R1.l.m(parcel, H5);
                return new j0.b(str2, i5);
            case 9:
                int H6 = R1.l.H(parcel);
                String str3 = null;
                String str4 = null;
                String str5 = null;
                String str6 = null;
                Uri uri = null;
                String str7 = null;
                String str8 = null;
                ArrayList arrayList2 = null;
                String str9 = null;
                String str10 = null;
                long j2 = 0;
                int i6 = 0;
                while (parcel.dataPosition() < H6) {
                    int readInt8 = parcel.readInt();
                    switch ((char) readInt8) {
                        case 1:
                            i6 = R1.l.x(parcel, readInt8);
                            break;
                        case 2:
                            str3 = R1.l.j(parcel, readInt8);
                            break;
                        case 3:
                            str4 = R1.l.j(parcel, readInt8);
                            break;
                        case 4:
                            str5 = R1.l.j(parcel, readInt8);
                            break;
                        case 5:
                            str6 = R1.l.j(parcel, readInt8);
                            break;
                        case 6:
                            uri = (Uri) R1.l.i(parcel, readInt8, Uri.CREATOR);
                            break;
                        case 7:
                            str7 = R1.l.j(parcel, readInt8);
                            break;
                        case '\b':
                            R1.l.K(parcel, readInt8, 8);
                            j2 = parcel.readLong();
                            break;
                        case '\t':
                            str8 = R1.l.j(parcel, readInt8);
                            break;
                        case '\n':
                            Parcelable.Creator<Scope> creator = Scope.CREATOR;
                            int y3 = R1.l.y(parcel, readInt8);
                            int dataPosition2 = parcel.dataPosition();
                            if (y3 != 0) {
                                ArrayList createTypedArrayList = parcel.createTypedArrayList(creator);
                                parcel.setDataPosition(dataPosition2 + y3);
                                arrayList2 = createTypedArrayList;
                                break;
                            } else {
                                arrayList2 = null;
                                break;
                            }
                        case 11:
                            str9 = R1.l.j(parcel, readInt8);
                            break;
                        case '\f':
                            str10 = R1.l.j(parcel, readInt8);
                            break;
                        default:
                            R1.l.E(parcel, readInt8);
                            break;
                    }
                }
                R1.l.m(parcel, H6);
                return new GoogleSignInAccount(i6, str3, str4, str5, str6, uri, str7, j2, str8, arrayList2, str9, str10);
            case 10:
                int H7 = R1.l.H(parcel);
                PendingIntent pendingIntent = null;
                int i7 = 0;
                int i8 = 0;
                String str11 = null;
                while (parcel.dataPosition() < H7) {
                    int readInt9 = parcel.readInt();
                    char c6 = (char) readInt9;
                    if (c6 == 1) {
                        i7 = R1.l.x(parcel, readInt9);
                    } else if (c6 == 2) {
                        i8 = R1.l.x(parcel, readInt9);
                    } else if (c6 == 3) {
                        pendingIntent = (PendingIntent) R1.l.i(parcel, readInt9, PendingIntent.CREATOR);
                    } else if (c6 != 4) {
                        R1.l.E(parcel, readInt9);
                    } else {
                        str11 = R1.l.j(parcel, readInt9);
                    }
                }
                R1.l.m(parcel, H7);
                return new m0.b(i7, i8, pendingIntent, str11);
            case 11:
                int H8 = R1.l.H(parcel);
                long j3 = -1;
                int i9 = 0;
                String str12 = null;
                while (parcel.dataPosition() < H8) {
                    int readInt10 = parcel.readInt();
                    char c7 = (char) readInt10;
                    if (c7 == 1) {
                        str12 = R1.l.j(parcel, readInt10);
                    } else if (c7 == 2) {
                        i9 = R1.l.x(parcel, readInt10);
                    } else if (c7 != 3) {
                        R1.l.E(parcel, readInt10);
                    } else {
                        R1.l.K(parcel, readInt10, 8);
                        j3 = parcel.readLong();
                    }
                }
                R1.l.m(parcel, H8);
                return new m0.d(str12, i9, j3);
            case 12:
                int H9 = R1.l.H(parcel);
                String str13 = null;
                int i10 = 0;
                while (parcel.dataPosition() < H9) {
                    int readInt11 = parcel.readInt();
                    char c8 = (char) readInt11;
                    if (c8 == 1) {
                        i10 = R1.l.x(parcel, readInt11);
                    } else if (c8 != 2) {
                        R1.l.E(parcel, readInt11);
                    } else {
                        str13 = R1.l.j(parcel, readInt11);
                    }
                }
                R1.l.m(parcel, H9);
                return new Scope(i10, str13);
            case 13:
                int H10 = R1.l.H(parcel);
                String str14 = null;
                m0.b bVar2 = null;
                int i11 = 0;
                PendingIntent pendingIntent2 = null;
                while (parcel.dataPosition() < H10) {
                    int readInt12 = parcel.readInt();
                    char c9 = (char) readInt12;
                    if (c9 == 1) {
                        i11 = R1.l.x(parcel, readInt12);
                    } else if (c9 == 2) {
                        str14 = R1.l.j(parcel, readInt12);
                    } else if (c9 == 3) {
                        pendingIntent2 = (PendingIntent) R1.l.i(parcel, readInt12, PendingIntent.CREATOR);
                    } else if (c9 != 4) {
                        R1.l.E(parcel, readInt12);
                    } else {
                        bVar2 = (m0.b) R1.l.i(parcel, readInt12, m0.b.CREATOR);
                    }
                }
                R1.l.m(parcel, H10);
                return new Status(i11, str14, pendingIntent2, bVar2);
            case 14:
                int H11 = R1.l.H(parcel);
                int i12 = 0;
                while (true) {
                    ArrayList arrayList3 = null;
                    while (parcel.dataPosition() < H11) {
                        int readInt13 = parcel.readInt();
                        char c10 = (char) readInt13;
                        if (c10 == 1) {
                            i12 = R1.l.x(parcel, readInt13);
                        } else if (c10 != 2) {
                            R1.l.E(parcel, readInt13);
                        } else {
                            Parcelable.Creator<C1009f> creator2 = C1009f.CREATOR;
                            int y4 = R1.l.y(parcel, readInt13);
                            int dataPosition3 = parcel.dataPosition();
                            if (y4 == 0) {
                                break;
                            }
                            arrayList3 = parcel.createTypedArrayList(creator2);
                            parcel.setDataPosition(dataPosition3 + y4);
                        }
                    }
                    R1.l.m(parcel, H11);
                    return new C1012i(i12, arrayList3);
                    break;
                }
            case 15:
                int H12 = R1.l.H(parcel);
                int i13 = -1;
                int i14 = 0;
                int i15 = 0;
                int i16 = 0;
                int i17 = 0;
                String str15 = null;
                String str16 = null;
                long j4 = 0;
                long j5 = 0;
                while (parcel.dataPosition() < H12) {
                    int readInt14 = parcel.readInt();
                    switch ((char) readInt14) {
                        case 1:
                            i14 = R1.l.x(parcel, readInt14);
                            break;
                        case 2:
                            i15 = R1.l.x(parcel, readInt14);
                            break;
                        case 3:
                            i16 = R1.l.x(parcel, readInt14);
                            break;
                        case 4:
                            R1.l.K(parcel, readInt14, 8);
                            j4 = parcel.readLong();
                            break;
                        case 5:
                            R1.l.K(parcel, readInt14, 8);
                            j5 = parcel.readLong();
                            break;
                        case 6:
                            str15 = R1.l.j(parcel, readInt14);
                            break;
                        case 7:
                            str16 = R1.l.j(parcel, readInt14);
                            break;
                        case '\b':
                            i17 = R1.l.x(parcel, readInt14);
                            break;
                        case '\t':
                            i13 = R1.l.x(parcel, readInt14);
                            break;
                        default:
                            R1.l.E(parcel, readInt14);
                            break;
                    }
                }
                R1.l.m(parcel, H12);
                return new C1009f(i14, i15, i16, j4, j5, str15, str16, i17, i13);
            case 16:
                int H13 = R1.l.H(parcel);
                Account account = null;
                int i18 = 0;
                int i19 = 0;
                GoogleSignInAccount googleSignInAccount = null;
                while (parcel.dataPosition() < H13) {
                    int readInt15 = parcel.readInt();
                    char c11 = (char) readInt15;
                    if (c11 == 1) {
                        i18 = R1.l.x(parcel, readInt15);
                    } else if (c11 == 2) {
                        account = (Account) R1.l.i(parcel, readInt15, Account.CREATOR);
                    } else if (c11 == 3) {
                        i19 = R1.l.x(parcel, readInt15);
                    } else if (c11 != 4) {
                        R1.l.E(parcel, readInt15);
                    } else {
                        googleSignInAccount = (GoogleSignInAccount) R1.l.i(parcel, readInt15, GoogleSignInAccount.CREATOR);
                    }
                }
                R1.l.m(parcel, H13);
                return new C1016m(i18, account, i19, googleSignInAccount);
            case 17:
                int H14 = R1.l.H(parcel);
                int i20 = 0;
                boolean z2 = false;
                boolean z3 = false;
                IBinder iBinder = null;
                m0.b bVar3 = null;
                while (parcel.dataPosition() < H14) {
                    int readInt16 = parcel.readInt();
                    char c12 = (char) readInt16;
                    if (c12 == 1) {
                        i20 = R1.l.x(parcel, readInt16);
                    } else if (c12 == 2) {
                        int y5 = R1.l.y(parcel, readInt16);
                        int dataPosition4 = parcel.dataPosition();
                        if (y5 == 0) {
                            iBinder = null;
                        } else {
                            iBinder = parcel.readStrongBinder();
                            parcel.setDataPosition(dataPosition4 + y5);
                        }
                    } else if (c12 == 3) {
                        bVar3 = (m0.b) R1.l.i(parcel, readInt16, m0.b.CREATOR);
                    } else if (c12 == 4) {
                        z2 = R1.l.v(parcel, readInt16);
                    } else if (c12 != 5) {
                        R1.l.E(parcel, readInt16);
                    } else {
                        z3 = R1.l.v(parcel, readInt16);
                    }
                }
                R1.l.m(parcel, H14);
                return new C1017n(i20, iBinder, bVar3, z2, z3);
            case 18:
                int H15 = R1.l.H(parcel);
                int i21 = 0;
                int i22 = 0;
                int i23 = 0;
                boolean z4 = false;
                boolean z5 = false;
                while (parcel.dataPosition() < H15) {
                    int readInt17 = parcel.readInt();
                    char c13 = (char) readInt17;
                    if (c13 == 1) {
                        i21 = R1.l.x(parcel, readInt17);
                    } else if (c13 == 2) {
                        z4 = R1.l.v(parcel, readInt17);
                    } else if (c13 == 3) {
                        z5 = R1.l.v(parcel, readInt17);
                    } else if (c13 == 4) {
                        i22 = R1.l.x(parcel, readInt17);
                    } else if (c13 != 5) {
                        R1.l.E(parcel, readInt17);
                    } else {
                        i23 = R1.l.x(parcel, readInt17);
                    }
                }
                R1.l.m(parcel, H15);
                return new C1011h(i21, i22, i23, z4, z5);
            case C0376e9.f5882C /* 19 */:
                int H16 = R1.l.H(parcel);
                int i24 = 0;
                Bundle bundle = null;
                m0.d[] dVarArr = null;
                C1006c c1006c = null;
                while (parcel.dataPosition() < H16) {
                    int readInt18 = parcel.readInt();
                    char c14 = (char) readInt18;
                    if (c14 == 1) {
                        int y6 = R1.l.y(parcel, readInt18);
                        int dataPosition5 = parcel.dataPosition();
                        if (y6 == 0) {
                            bundle = null;
                        } else {
                            Bundle readBundle = parcel.readBundle();
                            parcel.setDataPosition(dataPosition5 + y6);
                            bundle = readBundle;
                        }
                    } else if (c14 == 2) {
                        dVarArr = (m0.d[]) R1.l.k(parcel, readInt18, m0.d.CREATOR);
                    } else if (c14 == 3) {
                        i24 = R1.l.x(parcel, readInt18);
                    } else if (c14 != 4) {
                        R1.l.E(parcel, readInt18);
                    } else {
                        c1006c = (C1006c) R1.l.i(parcel, readInt18, C1006c.CREATOR);
                    }
                }
                R1.l.m(parcel, H16);
                C1027x c1027x = new C1027x();
                c1027x.f8417a = bundle;
                c1027x.f8418b = dVarArr;
                c1027x.f8419c = i24;
                c1027x.f8420d = c1006c;
                return c1027x;
            case C0376e9.f5883D /* 20 */:
                int H17 = R1.l.H(parcel);
                C1011h c1011h = null;
                int[] iArr4 = null;
                int[] iArr5 = null;
                boolean z6 = false;
                boolean z7 = false;
                int i25 = 0;
                while (parcel.dataPosition() < H17) {
                    int readInt19 = parcel.readInt();
                    switch ((char) readInt19) {
                        case 1:
                            c1011h = (C1011h) R1.l.i(parcel, readInt19, C1011h.CREATOR);
                            break;
                        case 2:
                            z6 = R1.l.v(parcel, readInt19);
                            break;
                        case 3:
                            z7 = R1.l.v(parcel, readInt19);
                            break;
                        case 4:
                            int y7 = R1.l.y(parcel, readInt19);
                            int dataPosition6 = parcel.dataPosition();
                            if (y7 != 0) {
                                iArr4 = parcel.createIntArray();
                                parcel.setDataPosition(dataPosition6 + y7);
                                break;
                            } else {
                                iArr4 = null;
                                break;
                            }
                        case 5:
                            i25 = R1.l.x(parcel, readInt19);
                            break;
                        case 6:
                            int y8 = R1.l.y(parcel, readInt19);
                            int dataPosition7 = parcel.dataPosition();
                            if (y8 != 0) {
                                iArr5 = parcel.createIntArray();
                                parcel.setDataPosition(dataPosition7 + y8);
                                break;
                            } else {
                                iArr5 = null;
                                break;
                            }
                        default:
                            R1.l.E(parcel, readInt19);
                            break;
                    }
                }
                R1.l.m(parcel, H17);
                return new C1006c(c1011h, z6, z7, iArr4, i25, iArr5);
            default:
                int H18 = R1.l.H(parcel);
                Scope[] scopeArr = C1007d.f8349o;
                Bundle bundle2 = new Bundle();
                m0.d[] dVarArr2 = C1007d.f8350p;
                m0.d[] dVarArr3 = dVarArr2;
                String str17 = null;
                IBinder iBinder2 = null;
                Account account2 = null;
                String str18 = null;
                int i26 = 0;
                int i27 = 0;
                int i28 = 0;
                boolean z8 = false;
                int i29 = 0;
                boolean z9 = false;
                while (parcel.dataPosition() < H18) {
                    int readInt20 = parcel.readInt();
                    switch ((char) readInt20) {
                        case 1:
                            i26 = R1.l.x(parcel, readInt20);
                            break;
                        case 2:
                            i27 = R1.l.x(parcel, readInt20);
                            break;
                        case 3:
                            i28 = R1.l.x(parcel, readInt20);
                            break;
                        case 4:
                            str17 = R1.l.j(parcel, readInt20);
                            break;
                        case 5:
                            int y9 = R1.l.y(parcel, readInt20);
                            int dataPosition8 = parcel.dataPosition();
                            if (y9 != 0) {
                                IBinder readStrongBinder = parcel.readStrongBinder();
                                parcel.setDataPosition(dataPosition8 + y9);
                                iBinder2 = readStrongBinder;
                                break;
                            } else {
                                iBinder2 = null;
                                break;
                            }
                        case 6:
                            scopeArr = (Scope[]) R1.l.k(parcel, readInt20, Scope.CREATOR);
                            break;
                        case 7:
                            int y10 = R1.l.y(parcel, readInt20);
                            int dataPosition9 = parcel.dataPosition();
                            if (y10 != 0) {
                                Bundle readBundle2 = parcel.readBundle();
                                parcel.setDataPosition(dataPosition9 + y10);
                                bundle2 = readBundle2;
                                break;
                            } else {
                                bundle2 = null;
                                break;
                            }
                        case '\b':
                            account2 = (Account) R1.l.i(parcel, readInt20, Account.CREATOR);
                            break;
                        case '\t':
                        default:
                            R1.l.E(parcel, readInt20);
                            break;
                        case '\n':
                            dVarArr2 = (m0.d[]) R1.l.k(parcel, readInt20, m0.d.CREATOR);
                            break;
                        case 11:
                            dVarArr3 = (m0.d[]) R1.l.k(parcel, readInt20, m0.d.CREATOR);
                            break;
                        case '\f':
                            z8 = R1.l.v(parcel, readInt20);
                            break;
                        case '\r':
                            i29 = R1.l.x(parcel, readInt20);
                            break;
                        case 14:
                            z9 = R1.l.v(parcel, readInt20);
                            break;
                        case 15:
                            str18 = R1.l.j(parcel, readInt20);
                            break;
                    }
                }
                R1.l.m(parcel, H18);
                return new C1007d(i26, i27, i28, str17, iBinder2, scopeArr, bundle2, account2, dVarArr2, dVarArr3, z8, i29, z9, str18);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i2) {
        switch (this.f125a) {
            case 0:
                return new m[i2];
            case 1:
                return new C0.b[i2];
            case 2:
                return new C0.e[i2];
            case 3:
                return new C0.f[i2];
            case 4:
                return new C0066o[i2];
            case 5:
                return new L[i2];
            case 6:
                return new M[i2];
            case 7:
                return new ParcelImpl[i2];
            case 8:
                return new j0.b[i2];
            case 9:
                return new GoogleSignInAccount[i2];
            case 10:
                return new m0.b[i2];
            case 11:
                return new m0.d[i2];
            case 12:
                return new Scope[i2];
            case 13:
                return new Status[i2];
            case 14:
                return new C1012i[i2];
            case 15:
                return new C1009f[i2];
            case 16:
                return new C1016m[i2];
            case 17:
                return new C1017n[i2];
            case 18:
                return new C1011h[i2];
            case C0376e9.f5882C /* 19 */:
                return new C1027x[i2];
            case C0376e9.f5883D /* 20 */:
                return new C1006c[i2];
            default:
                return new C1007d[i2];
        }
    }
}
