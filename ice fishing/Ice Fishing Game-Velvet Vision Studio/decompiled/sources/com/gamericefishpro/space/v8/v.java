package com.gamericefishpro.space.v8;

import android.accounts.Account;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.android.installreferrer.api.InstallReferrerClient;
import com.appsflyer.attribution.RequestError;
import com.gamericefishpro.space.i9.y3;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Scope;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class v implements Parcelable.Creator {
    public final /* synthetic */ int a;

    public /* synthetic */ v(int i) {
        this.a = i;
    }

    public static void a(h hVar, Parcel parcel, int i) {
        int iV = y3.V(parcel, 20293);
        int i2 = hVar.d;
        y3.U(parcel, 1, 4);
        parcel.writeInt(i2);
        int i3 = hVar.e;
        y3.U(parcel, 2, 4);
        parcel.writeInt(i3);
        int i4 = hVar.i;
        y3.U(parcel, 3, 4);
        parcel.writeInt(i4);
        y3.Q(parcel, 4, hVar.v);
        y3.O(parcel, 5, hVar.w);
        y3.R(parcel, 6, hVar.y, i);
        y3.N(parcel, 7, hVar.z);
        y3.P(parcel, 8, hVar.A, i);
        y3.R(parcel, 10, hVar.B, i);
        y3.R(parcel, 11, hVar.C, i);
        boolean z = hVar.D;
        y3.U(parcel, 12, 4);
        parcel.writeInt(z ? 1 : 0);
        int i5 = hVar.E;
        y3.U(parcel, 13, 4);
        parcel.writeInt(i5);
        boolean z2 = hVar.F;
        y3.U(parcel, 14, 4);
        parcel.writeInt(z2 ? 1 : 0);
        y3.Q(parcel, 15, hVar.G);
        y3.W(parcel, iV);
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.a) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                int iX = com.gamericefishpro.space.hj.c.X(parcel);
                Account account = null;
                int iO = 0;
                int iO2 = 0;
                GoogleSignInAccount googleSignInAccount = null;
                while (parcel.dataPosition() < iX) {
                    int i = parcel.readInt();
                    char c = (char) i;
                    if (c == 1) {
                        iO = com.gamericefishpro.space.hj.c.O(parcel, i);
                    } else if (c == 2) {
                        account = (Account) com.gamericefishpro.space.hj.c.p(parcel, i, Account.CREATOR);
                    } else if (c == 3) {
                        iO2 = com.gamericefishpro.space.hj.c.O(parcel, i);
                    } else if (c != 4) {
                        com.gamericefishpro.space.hj.c.V(parcel, i);
                    } else {
                        googleSignInAccount = (GoogleSignInAccount) com.gamericefishpro.space.hj.c.p(parcel, i, GoogleSignInAccount.CREATOR);
                    }
                }
                com.gamericefishpro.space.hj.c.u(parcel, iX);
                return new u(iO, account, iO2, googleSignInAccount);
            case 1:
                int iX2 = com.gamericefishpro.space.hj.c.X(parcel);
                int iO3 = 0;
                boolean zM = false;
                boolean zM2 = false;
                IBinder iBinderN = null;
                com.gamericefishpro.space.s8.b bVar = null;
                while (parcel.dataPosition() < iX2) {
                    int i2 = parcel.readInt();
                    char c2 = (char) i2;
                    if (c2 == 1) {
                        iO3 = com.gamericefishpro.space.hj.c.O(parcel, i2);
                    } else if (c2 == 2) {
                        iBinderN = com.gamericefishpro.space.hj.c.N(parcel, i2);
                    } else if (c2 == 3) {
                        bVar = (com.gamericefishpro.space.s8.b) com.gamericefishpro.space.hj.c.p(parcel, i2, com.gamericefishpro.space.s8.b.CREATOR);
                    } else if (c2 == 4) {
                        zM = com.gamericefishpro.space.hj.c.M(parcel, i2);
                    } else if (c2 != 5) {
                        com.gamericefishpro.space.hj.c.V(parcel, i2);
                    } else {
                        zM2 = com.gamericefishpro.space.hj.c.M(parcel, i2);
                    }
                }
                com.gamericefishpro.space.hj.c.u(parcel, iX2);
                return new w(iO3, iBinderN, bVar, zM, zM2);
            case 2:
                int iX3 = com.gamericefishpro.space.hj.c.X(parcel);
                int iO4 = 0;
                boolean zM3 = false;
                boolean zM4 = false;
                int iO5 = 0;
                int iO6 = 0;
                while (parcel.dataPosition() < iX3) {
                    int i3 = parcel.readInt();
                    char c3 = (char) i3;
                    if (c3 == 1) {
                        iO4 = com.gamericefishpro.space.hj.c.O(parcel, i3);
                    } else if (c3 == 2) {
                        zM3 = com.gamericefishpro.space.hj.c.M(parcel, i3);
                    } else if (c3 == 3) {
                        zM4 = com.gamericefishpro.space.hj.c.M(parcel, i3);
                    } else if (c3 == 4) {
                        iO5 = com.gamericefishpro.space.hj.c.O(parcel, i3);
                    } else if (c3 != 5) {
                        com.gamericefishpro.space.hj.c.V(parcel, i3);
                    } else {
                        iO6 = com.gamericefishpro.space.hj.c.O(parcel, i3);
                    }
                }
                com.gamericefishpro.space.hj.c.u(parcel, iX3);
                return new m(iO4, zM3, zM4, iO5, iO6);
            case 3:
                int iX4 = com.gamericefishpro.space.hj.c.X(parcel);
                Bundle bundleN = null;
                g gVar = null;
                int iO7 = 0;
                com.gamericefishpro.space.s8.d[] dVarArr = null;
                while (parcel.dataPosition() < iX4) {
                    int i4 = parcel.readInt();
                    char c4 = (char) i4;
                    if (c4 == 1) {
                        bundleN = com.gamericefishpro.space.hj.c.n(parcel, i4);
                    } else if (c4 == 2) {
                        dVarArr = (com.gamericefishpro.space.s8.d[]) com.gamericefishpro.space.hj.c.r(parcel, i4, com.gamericefishpro.space.s8.d.CREATOR);
                    } else if (c4 == 3) {
                        iO7 = com.gamericefishpro.space.hj.c.O(parcel, i4);
                    } else if (c4 != 4) {
                        com.gamericefishpro.space.hj.c.V(parcel, i4);
                    } else {
                        gVar = (g) com.gamericefishpro.space.hj.c.p(parcel, i4, g.CREATOR);
                    }
                }
                com.gamericefishpro.space.hj.c.u(parcel, iX4);
                k0 k0Var = new k0();
                k0Var.d = bundleN;
                k0Var.e = dVarArr;
                k0Var.i = iO7;
                k0Var.v = gVar;
                return k0Var;
            case 4:
                int iX5 = com.gamericefishpro.space.hj.c.X(parcel);
                m mVar = null;
                int[] iArrCreateIntArray = null;
                int[] iArrCreateIntArray2 = null;
                boolean zM5 = false;
                boolean zM6 = false;
                int iO8 = 0;
                while (parcel.dataPosition() < iX5) {
                    int i5 = parcel.readInt();
                    switch ((char) i5) {
                        case 1:
                            mVar = (m) com.gamericefishpro.space.hj.c.p(parcel, i5, m.CREATOR);
                            break;
                        case 2:
                            zM5 = com.gamericefishpro.space.hj.c.M(parcel, i5);
                            break;
                        case 3:
                            zM6 = com.gamericefishpro.space.hj.c.M(parcel, i5);
                            break;
                        case 4:
                            int iQ = com.gamericefishpro.space.hj.c.Q(parcel, i5);
                            int iDataPosition = parcel.dataPosition();
                            if (iQ != 0) {
                                iArrCreateIntArray = parcel.createIntArray();
                                parcel.setDataPosition(iDataPosition + iQ);
                            } else {
                                iArrCreateIntArray = null;
                            }
                            break;
                        case com.gamericefishpro.space.o4.i.STRING_FIELD_NUMBER /* 5 */:
                            iO8 = com.gamericefishpro.space.hj.c.O(parcel, i5);
                            break;
                        case com.gamericefishpro.space.o4.i.STRING_SET_FIELD_NUMBER /* 6 */:
                            int iQ2 = com.gamericefishpro.space.hj.c.Q(parcel, i5);
                            int iDataPosition2 = parcel.dataPosition();
                            if (iQ2 != 0) {
                                iArrCreateIntArray2 = parcel.createIntArray();
                                parcel.setDataPosition(iDataPosition2 + iQ2);
                            } else {
                                iArrCreateIntArray2 = null;
                            }
                            break;
                        default:
                            com.gamericefishpro.space.hj.c.V(parcel, i5);
                            break;
                    }
                }
                com.gamericefishpro.space.hj.c.u(parcel, iX5);
                return new g(mVar, zM5, zM6, iArrCreateIntArray, iO8, iArrCreateIntArray2);
            default:
                int iX6 = com.gamericefishpro.space.hj.c.X(parcel);
                Bundle bundle = new Bundle();
                Scope[] scopeArr = h.H;
                String strQ = null;
                IBinder iBinderN2 = null;
                Account account2 = null;
                String strQ2 = null;
                int iO9 = 0;
                int iO10 = 0;
                int iO11 = 0;
                boolean zM7 = false;
                int iO12 = 0;
                boolean zM8 = false;
                com.gamericefishpro.space.s8.d[] dVarArr2 = h.I;
                com.gamericefishpro.space.s8.d[] dVarArr3 = dVarArr2;
                while (parcel.dataPosition() < iX6) {
                    int i6 = parcel.readInt();
                    switch ((char) i6) {
                        case 1:
                            iO9 = com.gamericefishpro.space.hj.c.O(parcel, i6);
                            break;
                        case 2:
                            iO10 = com.gamericefishpro.space.hj.c.O(parcel, i6);
                            break;
                        case 3:
                            iO11 = com.gamericefishpro.space.hj.c.O(parcel, i6);
                            break;
                        case 4:
                            strQ = com.gamericefishpro.space.hj.c.q(parcel, i6);
                            break;
                        case com.gamericefishpro.space.o4.i.STRING_FIELD_NUMBER /* 5 */:
                            iBinderN2 = com.gamericefishpro.space.hj.c.N(parcel, i6);
                            break;
                        case com.gamericefishpro.space.o4.i.STRING_SET_FIELD_NUMBER /* 6 */:
                            scopeArr = (Scope[]) com.gamericefishpro.space.hj.c.r(parcel, i6, Scope.CREATOR);
                            break;
                        case com.gamericefishpro.space.o4.i.DOUBLE_FIELD_NUMBER /* 7 */:
                            bundle = com.gamericefishpro.space.hj.c.n(parcel, i6);
                            break;
                        case com.gamericefishpro.space.o4.i.BYTES_FIELD_NUMBER /* 8 */:
                            account2 = (Account) com.gamericefishpro.space.hj.c.p(parcel, i6, Account.CREATOR);
                            break;
                        case '\t':
                        default:
                            com.gamericefishpro.space.hj.c.V(parcel, i6);
                            break;
                        case '\n':
                            dVarArr2 = (com.gamericefishpro.space.s8.d[]) com.gamericefishpro.space.hj.c.r(parcel, i6, com.gamericefishpro.space.s8.d.CREATOR);
                            break;
                        case RequestError.STOP_TRACKING /* 11 */:
                            dVarArr3 = (com.gamericefishpro.space.s8.d[]) com.gamericefishpro.space.hj.c.r(parcel, i6, com.gamericefishpro.space.s8.d.CREATOR);
                            break;
                        case '\f':
                            zM7 = com.gamericefishpro.space.hj.c.M(parcel, i6);
                            break;
                        case '\r':
                            iO12 = com.gamericefishpro.space.hj.c.O(parcel, i6);
                            break;
                        case 14:
                            zM8 = com.gamericefishpro.space.hj.c.M(parcel, i6);
                            break;
                        case 15:
                            strQ2 = com.gamericefishpro.space.hj.c.q(parcel, i6);
                            break;
                    }
                }
                com.gamericefishpro.space.hj.c.u(parcel, iX6);
                return new h(iO9, iO10, iO11, strQ, iBinderN2, scopeArr, bundle, account2, dVarArr2, dVarArr3, zM7, iO12, zM8, strQ2);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        switch (this.a) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return new u[i];
            case 1:
                return new w[i];
            case 2:
                return new m[i];
            case 3:
                return new k0[i];
            case 4:
                return new g[i];
            default:
                return new h[i];
        }
    }
}
