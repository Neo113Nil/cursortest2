package e7;

import android.accounts.Account;
import android.app.PendingIntent;
import android.content.Intent;
import android.content.IntentSender;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.versionedparcelable.ParcelImpl;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.Status;
import com.onesignal.core.activities.PermissionsActivity;
import com.onesignal.inAppMessages.internal.display.impl.a;
import java.util.ArrayList;
import l3.i;
import p6.a0;
import p6.k;
import p6.p;
import p6.q;
import pc.j;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class c implements Parcelable.Creator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2125a;

    public /* synthetic */ c(int i10) {
        this.f2125a = i10;
    }

    public static void a(p6.f fVar, Parcel parcel, int i10) {
        int g02 = x4.f.g0(parcel, 20293);
        int i11 = fVar.f5580g;
        x4.f.i0(parcel, 1, 4);
        parcel.writeInt(i11);
        int i12 = fVar.f5581h;
        x4.f.i0(parcel, 2, 4);
        parcel.writeInt(i12);
        int i13 = fVar.f5582i;
        x4.f.i0(parcel, 3, 4);
        parcel.writeInt(i13);
        x4.f.c0(parcel, 4, fVar.f5583j);
        IBinder iBinder = fVar.f5584k;
        if (iBinder != null) {
            int g03 = x4.f.g0(parcel, 5);
            parcel.writeStrongBinder(iBinder);
            x4.f.h0(parcel, g03);
        }
        x4.f.d0(parcel, 6, fVar.f5585l, i10);
        x4.f.a0(parcel, 7, fVar.f5586m);
        x4.f.b0(parcel, 8, fVar.f5587n, i10);
        x4.f.d0(parcel, 10, fVar.f5588o, i10);
        x4.f.d0(parcel, 11, fVar.f5589p, i10);
        boolean z10 = fVar.f5590q;
        x4.f.i0(parcel, 12, 4);
        parcel.writeInt(z10 ? 1 : 0);
        int i14 = fVar.f5591r;
        x4.f.i0(parcel, 13, 4);
        parcel.writeInt(i14);
        boolean z11 = fVar.f5592s;
        x4.f.i0(parcel, 14, 4);
        parcel.writeInt(z11 ? 1 : 0);
        x4.f.c0(parcel, 15, fVar.f5593t);
        x4.f.h0(parcel, g02);
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f2125a) {
            case 0:
                int Y = v6.a.Y(parcel);
                Intent intent = null;
                int i10 = 0;
                int i11 = 0;
                while (parcel.dataPosition() < Y) {
                    int readInt = parcel.readInt();
                    char c3 = (char) readInt;
                    if (c3 == 1) {
                        i10 = v6.a.M(parcel, readInt);
                    } else if (c3 == 2) {
                        i11 = v6.a.M(parcel, readInt);
                    } else if (c3 != 3) {
                        v6.a.V(parcel, readInt);
                    } else {
                        intent = (Intent) v6.a.x(parcel, readInt, Intent.CREATOR);
                    }
                }
                v6.a.A(parcel, Y);
                return new b(i10, i11, intent);
            case a.b.DRAGGABLE_DIRECTION_DOWN /* 1 */:
                int Y2 = v6.a.Y(parcel);
                ArrayList<String> arrayList = null;
                String str = null;
                while (parcel.dataPosition() < Y2) {
                    int readInt2 = parcel.readInt();
                    char c7 = (char) readInt2;
                    if (c7 == 1) {
                        int N = v6.a.N(parcel, readInt2);
                        int dataPosition = parcel.dataPosition();
                        if (N == 0) {
                            arrayList = null;
                        } else {
                            ArrayList<String> createStringArrayList = parcel.createStringArrayList();
                            parcel.setDataPosition(dataPosition + N);
                            arrayList = createStringArrayList;
                        }
                    } else if (c7 != 2) {
                        v6.a.V(parcel, readInt2);
                    } else {
                        str = v6.a.y(parcel, readInt2);
                    }
                }
                v6.a.A(parcel, Y2);
                return new g(str, arrayList);
            case PermissionsActivity.ONESIGNAL_PERMISSION_REQUEST_CODE /* 2 */:
                int Y3 = v6.a.Y(parcel);
                m6.b bVar = null;
                int i12 = 0;
                q qVar = null;
                while (parcel.dataPosition() < Y3) {
                    int readInt3 = parcel.readInt();
                    char c10 = (char) readInt3;
                    if (c10 == 1) {
                        i12 = v6.a.M(parcel, readInt3);
                    } else if (c10 == 2) {
                        bVar = (m6.b) v6.a.x(parcel, readInt3, m6.b.CREATOR);
                    } else if (c10 != 3) {
                        v6.a.V(parcel, readInt3);
                    } else {
                        qVar = (q) v6.a.x(parcel, readInt3, q.CREATOR);
                    }
                }
                v6.a.A(parcel, Y3);
                return new h(i12, bVar, qVar);
            case 3:
                j.e(parcel, "parcel");
                return new g.a(parcel.readInt(), parcel.readInt() == 0 ? null : (Intent) Intent.CREATOR.createFromParcel(parcel));
            case 4:
                j.e(parcel, "inParcel");
                Parcelable readParcelable = parcel.readParcelable(IntentSender.class.getClassLoader());
                j.b(readParcelable);
                return new g.e((IntentSender) readParcelable, (Intent) parcel.readParcelable(Intent.class.getClassLoader()), parcel.readInt(), parcel.readInt());
            case 5:
                int Y4 = v6.a.Y(parcel);
                String str2 = null;
                String str3 = null;
                String str4 = null;
                String str5 = null;
                Uri uri = null;
                String str6 = null;
                String str7 = null;
                ArrayList arrayList2 = null;
                String str8 = null;
                String str9 = null;
                long j3 = 0;
                int i13 = 0;
                while (parcel.dataPosition() < Y4) {
                    int readInt4 = parcel.readInt();
                    switch ((char) readInt4) {
                        case a.b.DRAGGABLE_DIRECTION_DOWN /* 1 */:
                            i13 = v6.a.M(parcel, readInt4);
                            break;
                        case PermissionsActivity.ONESIGNAL_PERMISSION_REQUEST_CODE /* 2 */:
                            str2 = v6.a.y(parcel, readInt4);
                            break;
                        case 3:
                            str3 = v6.a.y(parcel, readInt4);
                            break;
                        case 4:
                            str4 = v6.a.y(parcel, readInt4);
                            break;
                        case 5:
                            str5 = v6.a.y(parcel, readInt4);
                            break;
                        case 6:
                            uri = (Uri) v6.a.x(parcel, readInt4, Uri.CREATOR);
                            break;
                        case 7:
                            str6 = v6.a.y(parcel, readInt4);
                            break;
                        case '\b':
                            v6.a.Z(parcel, readInt4, 8);
                            j3 = parcel.readLong();
                            break;
                        case '\t':
                            str7 = v6.a.y(parcel, readInt4);
                            break;
                        case com.onesignal.core.internal.config.d.DEFAULT_NOTIFICATION_LIMIT /* 10 */:
                            Parcelable.Creator<Scope> creator = Scope.CREATOR;
                            int N2 = v6.a.N(parcel, readInt4);
                            int dataPosition2 = parcel.dataPosition();
                            if (N2 != 0) {
                                ArrayList createTypedArrayList = parcel.createTypedArrayList(creator);
                                parcel.setDataPosition(dataPosition2 + N2);
                                arrayList2 = createTypedArrayList;
                                break;
                            } else {
                                arrayList2 = null;
                                break;
                            }
                        case 11:
                            str8 = v6.a.y(parcel, readInt4);
                            break;
                        case '\f':
                            str9 = v6.a.y(parcel, readInt4);
                            break;
                        default:
                            v6.a.V(parcel, readInt4);
                            break;
                    }
                }
                v6.a.A(parcel, Y4);
                return new GoogleSignInAccount(i13, str2, str3, str4, str5, uri, str6, j3, str7, arrayList2, str8, str9);
            case 6:
                i iVar = new i(parcel);
                iVar.f4150g = parcel.readInt();
                return iVar;
            case 7:
                int Y5 = v6.a.Y(parcel);
                PendingIntent pendingIntent = null;
                int i14 = 0;
                int i15 = 0;
                String str10 = null;
                while (parcel.dataPosition() < Y5) {
                    int readInt5 = parcel.readInt();
                    char c11 = (char) readInt5;
                    if (c11 == 1) {
                        i14 = v6.a.M(parcel, readInt5);
                    } else if (c11 == 2) {
                        i15 = v6.a.M(parcel, readInt5);
                    } else if (c11 == 3) {
                        pendingIntent = (PendingIntent) v6.a.x(parcel, readInt5, PendingIntent.CREATOR);
                    } else if (c11 != 4) {
                        v6.a.V(parcel, readInt5);
                    } else {
                        str10 = v6.a.y(parcel, readInt5);
                    }
                }
                v6.a.A(parcel, Y5);
                return new m6.b(i14, i15, pendingIntent, str10);
            case 8:
                int Y6 = v6.a.Y(parcel);
                long j6 = -1;
                int i16 = 0;
                String str11 = null;
                while (parcel.dataPosition() < Y6) {
                    int readInt6 = parcel.readInt();
                    char c12 = (char) readInt6;
                    if (c12 == 1) {
                        str11 = v6.a.y(parcel, readInt6);
                    } else if (c12 == 2) {
                        i16 = v6.a.M(parcel, readInt6);
                    } else if (c12 != 3) {
                        v6.a.V(parcel, readInt6);
                    } else {
                        v6.a.Z(parcel, readInt6, 8);
                        j6 = parcel.readLong();
                    }
                }
                v6.a.A(parcel, Y6);
                return new m6.d(i16, j6, str11);
            case 9:
                return new ParcelImpl(parcel);
            case com.onesignal.core.internal.config.d.DEFAULT_NOTIFICATION_LIMIT /* 10 */:
                int Y7 = v6.a.Y(parcel);
                String str12 = null;
                int i17 = 0;
                while (parcel.dataPosition() < Y7) {
                    int readInt7 = parcel.readInt();
                    char c13 = (char) readInt7;
                    if (c13 == 1) {
                        i17 = v6.a.M(parcel, readInt7);
                    } else if (c13 != 2) {
                        v6.a.V(parcel, readInt7);
                    } else {
                        str12 = v6.a.y(parcel, readInt7);
                    }
                }
                v6.a.A(parcel, Y7);
                return new Scope(str12, i17);
            case 11:
                int Y8 = v6.a.Y(parcel);
                String str13 = null;
                m6.b bVar2 = null;
                int i18 = 0;
                PendingIntent pendingIntent2 = null;
                while (parcel.dataPosition() < Y8) {
                    int readInt8 = parcel.readInt();
                    char c14 = (char) readInt8;
                    if (c14 == 1) {
                        i18 = v6.a.M(parcel, readInt8);
                    } else if (c14 == 2) {
                        str13 = v6.a.y(parcel, readInt8);
                    } else if (c14 == 3) {
                        pendingIntent2 = (PendingIntent) v6.a.x(parcel, readInt8, PendingIntent.CREATOR);
                    } else if (c14 != 4) {
                        v6.a.V(parcel, readInt8);
                    } else {
                        bVar2 = (m6.b) v6.a.x(parcel, readInt8, m6.b.CREATOR);
                    }
                }
                v6.a.A(parcel, Y8);
                return new Status(i18, str13, pendingIntent2, bVar2);
            case 12:
                int Y9 = v6.a.Y(parcel);
                int i19 = 0;
                while (true) {
                    ArrayList arrayList3 = null;
                    while (parcel.dataPosition() < Y9) {
                        int readInt9 = parcel.readInt();
                        char c15 = (char) readInt9;
                        if (c15 == 1) {
                            i19 = v6.a.M(parcel, readInt9);
                        } else if (c15 != 2) {
                            v6.a.V(parcel, readInt9);
                        } else {
                            Parcelable.Creator<p6.h> creator2 = p6.h.CREATOR;
                            int N3 = v6.a.N(parcel, readInt9);
                            int dataPosition3 = parcel.dataPosition();
                            if (N3 == 0) {
                                break;
                            }
                            arrayList3 = parcel.createTypedArrayList(creator2);
                            parcel.setDataPosition(dataPosition3 + N3);
                        }
                    }
                    v6.a.A(parcel, Y9);
                    return new k(i19, arrayList3);
                    break;
                }
            case 13:
                int Y10 = v6.a.Y(parcel);
                int i20 = -1;
                int i21 = 0;
                int i22 = 0;
                int i23 = 0;
                int i24 = 0;
                String str14 = null;
                String str15 = null;
                long j10 = 0;
                long j11 = 0;
                while (parcel.dataPosition() < Y10) {
                    int readInt10 = parcel.readInt();
                    switch ((char) readInt10) {
                        case a.b.DRAGGABLE_DIRECTION_DOWN /* 1 */:
                            i21 = v6.a.M(parcel, readInt10);
                            break;
                        case PermissionsActivity.ONESIGNAL_PERMISSION_REQUEST_CODE /* 2 */:
                            i22 = v6.a.M(parcel, readInt10);
                            break;
                        case 3:
                            i23 = v6.a.M(parcel, readInt10);
                            break;
                        case 4:
                            v6.a.Z(parcel, readInt10, 8);
                            j10 = parcel.readLong();
                            break;
                        case 5:
                            v6.a.Z(parcel, readInt10, 8);
                            j11 = parcel.readLong();
                            break;
                        case 6:
                            str14 = v6.a.y(parcel, readInt10);
                            break;
                        case 7:
                            str15 = v6.a.y(parcel, readInt10);
                            break;
                        case '\b':
                            i24 = v6.a.M(parcel, readInt10);
                            break;
                        case '\t':
                            i20 = v6.a.M(parcel, readInt10);
                            break;
                        default:
                            v6.a.V(parcel, readInt10);
                            break;
                    }
                }
                v6.a.A(parcel, Y10);
                return new p6.h(i21, i22, i23, j10, j11, str14, str15, i24, i20);
            case 14:
                int Y11 = v6.a.Y(parcel);
                Account account = null;
                int i25 = 0;
                int i26 = 0;
                GoogleSignInAccount googleSignInAccount = null;
                while (parcel.dataPosition() < Y11) {
                    int readInt11 = parcel.readInt();
                    char c16 = (char) readInt11;
                    if (c16 == 1) {
                        i25 = v6.a.M(parcel, readInt11);
                    } else if (c16 == 2) {
                        account = (Account) v6.a.x(parcel, readInt11, Account.CREATOR);
                    } else if (c16 == 3) {
                        i26 = v6.a.M(parcel, readInt11);
                    } else if (c16 != 4) {
                        v6.a.V(parcel, readInt11);
                    } else {
                        googleSignInAccount = (GoogleSignInAccount) v6.a.x(parcel, readInt11, GoogleSignInAccount.CREATOR);
                    }
                }
                v6.a.A(parcel, Y11);
                return new p(i25, account, i26, googleSignInAccount);
            case 15:
                int Y12 = v6.a.Y(parcel);
                int i27 = 0;
                boolean z10 = false;
                boolean z11 = false;
                IBinder iBinder = null;
                m6.b bVar3 = null;
                while (parcel.dataPosition() < Y12) {
                    int readInt12 = parcel.readInt();
                    char c17 = (char) readInt12;
                    if (c17 == 1) {
                        i27 = v6.a.M(parcel, readInt12);
                    } else if (c17 == 2) {
                        int N4 = v6.a.N(parcel, readInt12);
                        int dataPosition4 = parcel.dataPosition();
                        if (N4 == 0) {
                            iBinder = null;
                        } else {
                            iBinder = parcel.readStrongBinder();
                            parcel.setDataPosition(dataPosition4 + N4);
                        }
                    } else if (c17 == 3) {
                        bVar3 = (m6.b) v6.a.x(parcel, readInt12, m6.b.CREATOR);
                    } else if (c17 == 4) {
                        z10 = v6.a.L(parcel, readInt12);
                    } else if (c17 != 5) {
                        v6.a.V(parcel, readInt12);
                    } else {
                        z11 = v6.a.L(parcel, readInt12);
                    }
                }
                v6.a.A(parcel, Y12);
                return new q(i27, iBinder, bVar3, z10, z11);
            case 16:
                int Y13 = v6.a.Y(parcel);
                int i28 = 0;
                boolean z12 = false;
                boolean z13 = false;
                int i29 = 0;
                int i30 = 0;
                while (parcel.dataPosition() < Y13) {
                    int readInt13 = parcel.readInt();
                    char c18 = (char) readInt13;
                    if (c18 == 1) {
                        i28 = v6.a.M(parcel, readInt13);
                    } else if (c18 == 2) {
                        z12 = v6.a.L(parcel, readInt13);
                    } else if (c18 == 3) {
                        z13 = v6.a.L(parcel, readInt13);
                    } else if (c18 == 4) {
                        i29 = v6.a.M(parcel, readInt13);
                    } else if (c18 != 5) {
                        v6.a.V(parcel, readInt13);
                    } else {
                        i30 = v6.a.M(parcel, readInt13);
                    }
                }
                v6.a.A(parcel, Y13);
                return new p6.j(i28, z12, z13, i29, i30);
            case 17:
                int Y14 = v6.a.Y(parcel);
                Bundle bundle = null;
                p6.e eVar = null;
                int i31 = 0;
                m6.d[] dVarArr = null;
                while (parcel.dataPosition() < Y14) {
                    int readInt14 = parcel.readInt();
                    char c19 = (char) readInt14;
                    if (c19 == 1) {
                        bundle = v6.a.r(parcel, readInt14);
                    } else if (c19 == 2) {
                        dVarArr = (m6.d[]) v6.a.z(parcel, readInt14, m6.d.CREATOR);
                    } else if (c19 == 3) {
                        i31 = v6.a.M(parcel, readInt14);
                    } else if (c19 != 4) {
                        v6.a.V(parcel, readInt14);
                    } else {
                        eVar = (p6.e) v6.a.x(parcel, readInt14, p6.e.CREATOR);
                    }
                }
                v6.a.A(parcel, Y14);
                a0 a0Var = new a0();
                a0Var.f5539g = bundle;
                a0Var.f5540h = dVarArr;
                a0Var.f5541i = i31;
                a0Var.f5542j = eVar;
                return a0Var;
            case 18:
                int Y15 = v6.a.Y(parcel);
                p6.j jVar = null;
                int[] iArr = null;
                int[] iArr2 = null;
                boolean z14 = false;
                boolean z15 = false;
                int i32 = 0;
                while (parcel.dataPosition() < Y15) {
                    int readInt15 = parcel.readInt();
                    switch ((char) readInt15) {
                        case a.b.DRAGGABLE_DIRECTION_DOWN /* 1 */:
                            jVar = (p6.j) v6.a.x(parcel, readInt15, p6.j.CREATOR);
                            break;
                        case PermissionsActivity.ONESIGNAL_PERMISSION_REQUEST_CODE /* 2 */:
                            z14 = v6.a.L(parcel, readInt15);
                            break;
                        case 3:
                            z15 = v6.a.L(parcel, readInt15);
                            break;
                        case 4:
                            int N5 = v6.a.N(parcel, readInt15);
                            int dataPosition5 = parcel.dataPosition();
                            if (N5 != 0) {
                                iArr = parcel.createIntArray();
                                parcel.setDataPosition(dataPosition5 + N5);
                                break;
                            } else {
                                iArr = null;
                                break;
                            }
                        case 5:
                            i32 = v6.a.M(parcel, readInt15);
                            break;
                        case 6:
                            int N6 = v6.a.N(parcel, readInt15);
                            int dataPosition6 = parcel.dataPosition();
                            if (N6 != 0) {
                                iArr2 = parcel.createIntArray();
                                parcel.setDataPosition(dataPosition6 + N6);
                                break;
                            } else {
                                iArr2 = null;
                                break;
                            }
                        default:
                            v6.a.V(parcel, readInt15);
                            break;
                    }
                }
                v6.a.A(parcel, Y15);
                return new p6.e(jVar, z14, z15, iArr, i32, iArr2);
            default:
                int Y16 = v6.a.Y(parcel);
                Bundle bundle2 = new Bundle();
                Scope[] scopeArr = p6.f.f5578u;
                String str16 = null;
                IBinder iBinder2 = null;
                Account account2 = null;
                String str17 = null;
                int i33 = 0;
                int i34 = 0;
                int i35 = 0;
                boolean z16 = false;
                int i36 = 0;
                boolean z17 = false;
                m6.d[] dVarArr2 = p6.f.f5579v;
                m6.d[] dVarArr3 = dVarArr2;
                while (parcel.dataPosition() < Y16) {
                    int readInt16 = parcel.readInt();
                    switch ((char) readInt16) {
                        case a.b.DRAGGABLE_DIRECTION_DOWN /* 1 */:
                            i33 = v6.a.M(parcel, readInt16);
                            break;
                        case PermissionsActivity.ONESIGNAL_PERMISSION_REQUEST_CODE /* 2 */:
                            i34 = v6.a.M(parcel, readInt16);
                            break;
                        case 3:
                            i35 = v6.a.M(parcel, readInt16);
                            break;
                        case 4:
                            str16 = v6.a.y(parcel, readInt16);
                            break;
                        case 5:
                            int N7 = v6.a.N(parcel, readInt16);
                            int dataPosition7 = parcel.dataPosition();
                            if (N7 != 0) {
                                IBinder readStrongBinder = parcel.readStrongBinder();
                                parcel.setDataPosition(dataPosition7 + N7);
                                iBinder2 = readStrongBinder;
                                break;
                            } else {
                                iBinder2 = null;
                                break;
                            }
                        case 6:
                            scopeArr = (Scope[]) v6.a.z(parcel, readInt16, Scope.CREATOR);
                            break;
                        case 7:
                            bundle2 = v6.a.r(parcel, readInt16);
                            break;
                        case '\b':
                            account2 = (Account) v6.a.x(parcel, readInt16, Account.CREATOR);
                            break;
                        case '\t':
                        default:
                            v6.a.V(parcel, readInt16);
                            break;
                        case com.onesignal.core.internal.config.d.DEFAULT_NOTIFICATION_LIMIT /* 10 */:
                            dVarArr2 = (m6.d[]) v6.a.z(parcel, readInt16, m6.d.CREATOR);
                            break;
                        case 11:
                            dVarArr3 = (m6.d[]) v6.a.z(parcel, readInt16, m6.d.CREATOR);
                            break;
                        case '\f':
                            z16 = v6.a.L(parcel, readInt16);
                            break;
                        case '\r':
                            i36 = v6.a.M(parcel, readInt16);
                            break;
                        case 14:
                            z17 = v6.a.L(parcel, readInt16);
                            break;
                        case 15:
                            str17 = v6.a.y(parcel, readInt16);
                            break;
                    }
                }
                v6.a.A(parcel, Y16);
                return new p6.f(i33, i34, i35, str16, iBinder2, scopeArr, bundle2, account2, dVarArr2, dVarArr3, z16, i36, z17, str17);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i10) {
        switch (this.f2125a) {
            case 0:
                return new b[i10];
            case a.b.DRAGGABLE_DIRECTION_DOWN /* 1 */:
                return new g[i10];
            case PermissionsActivity.ONESIGNAL_PERMISSION_REQUEST_CODE /* 2 */:
                return new h[i10];
            case 3:
                return new g.a[i10];
            case 4:
                return new g.e[i10];
            case 5:
                return new GoogleSignInAccount[i10];
            case 6:
                return new i[i10];
            case 7:
                return new m6.b[i10];
            case 8:
                return new m6.d[i10];
            case 9:
                return new ParcelImpl[i10];
            case com.onesignal.core.internal.config.d.DEFAULT_NOTIFICATION_LIMIT /* 10 */:
                return new Scope[i10];
            case 11:
                return new Status[i10];
            case 12:
                return new k[i10];
            case 13:
                return new p6.h[i10];
            case 14:
                return new p[i10];
            case 15:
                return new q[i10];
            case 16:
                return new p6.j[i10];
            case 17:
                return new a0[i10];
            case 18:
                return new p6.e[i10];
            default:
                return new p6.f[i10];
        }
    }
}
