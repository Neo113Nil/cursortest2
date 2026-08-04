package com.gamericefishpro.space.h;

import android.app.PendingIntent;
import android.content.Intent;
import android.content.IntentSender;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.versionedparcelable.ParcelImpl;
import com.android.installreferrer.api.InstallReferrerClient;
import com.appsflyer.attribution.RequestError;
import com.gamericefishpro.space.h4.h;
import com.gamericefishpro.space.i9.y3;
import com.gamericefishpro.space.n9.a4;
import com.gamericefishpro.space.n9.d4;
import com.gamericefishpro.space.n9.e4;
import com.gamericefishpro.space.n9.f4;
import com.gamericefishpro.space.n9.o4;
import com.gamericefishpro.space.n9.t;
import com.gamericefishpro.space.n9.t4;
import com.gamericefishpro.space.n9.u;
import com.gamericefishpro.space.o4.i;
import com.gamericefishpro.space.p9.g;
import com.gamericefishpro.space.r5.q0;
import com.gamericefishpro.space.r5.r;
import com.gamericefishpro.space.r5.r0;
import com.gamericefishpro.space.s8.s;
import com.gamericefishpro.space.v8.k;
import com.gamericefishpro.space.v8.n;
import com.gamericefishpro.space.v8.w;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.Status;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class a implements Parcelable.Creator {
    public final /* synthetic */ int a;

    public /* synthetic */ a(int i) {
        this.a = i;
    }

    public static void a(u uVar, Parcel parcel, int i) {
        String str = uVar.d;
        int iV = y3.V(parcel, 20293);
        y3.Q(parcel, 2, str);
        y3.P(parcel, 3, uVar.e, i);
        y3.Q(parcel, 4, uVar.i);
        long j = uVar.v;
        y3.U(parcel, 5, 8);
        parcel.writeLong(j);
        y3.W(parcel, iV);
    }

    public static void b(o4 o4Var, Parcel parcel) {
        int i = o4Var.d;
        int iV = y3.V(parcel, 20293);
        y3.U(parcel, 1, 4);
        parcel.writeInt(i);
        y3.Q(parcel, 2, o4Var.e);
        long j = o4Var.i;
        y3.U(parcel, 3, 8);
        parcel.writeLong(j);
        Long l = o4Var.v;
        if (l != null) {
            y3.U(parcel, 4, 8);
            parcel.writeLong(l.longValue());
        }
        y3.Q(parcel, 6, o4Var.w);
        y3.Q(parcel, 7, o4Var.y);
        Double d = o4Var.z;
        if (d != null) {
            y3.U(parcel, 8, 8);
            parcel.writeDouble(d.doubleValue());
        }
        y3.W(parcel, iV);
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.a) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new b(parcel.readInt(), parcel.readInt() == 0 ? null : (Intent) Intent.CREATOR.createFromParcel(parcel));
            case 1:
                Intrinsics.checkNotNullParameter(parcel, "inParcel");
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                Parcelable parcelable = parcel.readParcelable(IntentSender.class.getClassLoader());
                Intrinsics.b(parcelable);
                return new f((IntentSender) parcelable, (Intent) parcel.readParcelable(Intent.class.getClassLoader()), parcel.readInt(), parcel.readInt());
            case 2:
                h hVar = new h(parcel);
                hVar.d = parcel.readInt();
                return hVar;
            case 3:
                return new ParcelImpl(parcel);
            case 4:
                int iX = com.gamericefishpro.space.hj.c.X(parcel);
                long jP = 0;
                long jP2 = 0;
                int iO = 0;
                while (parcel.dataPosition() < iX) {
                    int i = parcel.readInt();
                    char c = (char) i;
                    if (c == 1) {
                        jP = com.gamericefishpro.space.hj.c.P(parcel, i);
                    } else if (c == 2) {
                        iO = com.gamericefishpro.space.hj.c.O(parcel, i);
                    } else if (c != 3) {
                        com.gamericefishpro.space.hj.c.V(parcel, i);
                    } else {
                        jP2 = com.gamericefishpro.space.hj.c.P(parcel, i);
                    }
                }
                com.gamericefishpro.space.hj.c.u(parcel, iX);
                return new com.gamericefishpro.space.n9.d(iO, jP, jP2);
            case i.STRING_FIELD_NUMBER /* 5 */:
                int iX2 = com.gamericefishpro.space.hj.c.X(parcel);
                String strQ = null;
                String strQ2 = null;
                o4 o4Var = null;
                String strQ3 = null;
                u uVar = null;
                u uVar2 = null;
                u uVar3 = null;
                long jP3 = 0;
                long jP4 = 0;
                long jP5 = 0;
                boolean zM = false;
                while (parcel.dataPosition() < iX2) {
                    int i2 = parcel.readInt();
                    switch ((char) i2) {
                        case 2:
                            strQ = com.gamericefishpro.space.hj.c.q(parcel, i2);
                            break;
                        case 3:
                            strQ2 = com.gamericefishpro.space.hj.c.q(parcel, i2);
                            break;
                        case 4:
                            o4Var = (o4) com.gamericefishpro.space.hj.c.p(parcel, i2, o4.CREATOR);
                            break;
                        case i.STRING_FIELD_NUMBER /* 5 */:
                            jP3 = com.gamericefishpro.space.hj.c.P(parcel, i2);
                            break;
                        case i.STRING_SET_FIELD_NUMBER /* 6 */:
                            zM = com.gamericefishpro.space.hj.c.M(parcel, i2);
                            break;
                        case i.DOUBLE_FIELD_NUMBER /* 7 */:
                            strQ3 = com.gamericefishpro.space.hj.c.q(parcel, i2);
                            break;
                        case i.BYTES_FIELD_NUMBER /* 8 */:
                            uVar = (u) com.gamericefishpro.space.hj.c.p(parcel, i2, u.CREATOR);
                            break;
                        case '\t':
                            jP4 = com.gamericefishpro.space.hj.c.P(parcel, i2);
                            break;
                        case '\n':
                            uVar2 = (u) com.gamericefishpro.space.hj.c.p(parcel, i2, u.CREATOR);
                            break;
                        case RequestError.STOP_TRACKING /* 11 */:
                            jP5 = com.gamericefishpro.space.hj.c.P(parcel, i2);
                            break;
                        case '\f':
                            uVar3 = (u) com.gamericefishpro.space.hj.c.p(parcel, i2, u.CREATOR);
                            break;
                        default:
                            com.gamericefishpro.space.hj.c.V(parcel, i2);
                            break;
                    }
                }
                com.gamericefishpro.space.hj.c.u(parcel, iX2);
                return new com.gamericefishpro.space.n9.e(strQ, strQ2, o4Var, jP3, zM, strQ3, uVar, jP4, uVar2, jP5, uVar3);
            case i.STRING_SET_FIELD_NUMBER /* 6 */:
                int iX3 = com.gamericefishpro.space.hj.c.X(parcel);
                Bundle bundleN = null;
                while (parcel.dataPosition() < iX3) {
                    int i3 = parcel.readInt();
                    if (((char) i3) != 1) {
                        com.gamericefishpro.space.hj.c.V(parcel, i3);
                    } else {
                        bundleN = com.gamericefishpro.space.hj.c.n(parcel, i3);
                    }
                }
                com.gamericefishpro.space.hj.c.u(parcel, iX3);
                return new com.gamericefishpro.space.n9.i(bundleN);
            case i.DOUBLE_FIELD_NUMBER /* 7 */:
                int iX4 = com.gamericefishpro.space.hj.c.X(parcel);
                Bundle bundleN2 = null;
                while (parcel.dataPosition() < iX4) {
                    int i4 = parcel.readInt();
                    if (((char) i4) != 2) {
                        com.gamericefishpro.space.hj.c.V(parcel, i4);
                    } else {
                        bundleN2 = com.gamericefishpro.space.hj.c.n(parcel, i4);
                    }
                }
                com.gamericefishpro.space.hj.c.u(parcel, iX4);
                return new t(bundleN2);
            case i.BYTES_FIELD_NUMBER /* 8 */:
                int iX5 = com.gamericefishpro.space.hj.c.X(parcel);
                long jP6 = 0;
                String strQ4 = null;
                t tVar = null;
                String strQ5 = null;
                while (parcel.dataPosition() < iX5) {
                    int i5 = parcel.readInt();
                    char c2 = (char) i5;
                    if (c2 == 2) {
                        strQ4 = com.gamericefishpro.space.hj.c.q(parcel, i5);
                    } else if (c2 == 3) {
                        tVar = (t) com.gamericefishpro.space.hj.c.p(parcel, i5, t.CREATOR);
                    } else if (c2 == 4) {
                        strQ5 = com.gamericefishpro.space.hj.c.q(parcel, i5);
                    } else if (c2 != 5) {
                        com.gamericefishpro.space.hj.c.V(parcel, i5);
                    } else {
                        jP6 = com.gamericefishpro.space.hj.c.P(parcel, i5);
                    }
                }
                com.gamericefishpro.space.hj.c.u(parcel, iX5);
                return new u(strQ4, tVar, strQ5, jP6);
            case 9:
                int iX6 = com.gamericefishpro.space.hj.c.X(parcel);
                int iO2 = 0;
                long jP7 = 0;
                String strQ6 = null;
                while (parcel.dataPosition() < iX6) {
                    int i6 = parcel.readInt();
                    char c3 = (char) i6;
                    if (c3 == 1) {
                        strQ6 = com.gamericefishpro.space.hj.c.q(parcel, i6);
                    } else if (c3 == 2) {
                        jP7 = com.gamericefishpro.space.hj.c.P(parcel, i6);
                    } else if (c3 != 3) {
                        com.gamericefishpro.space.hj.c.V(parcel, i6);
                    } else {
                        iO2 = com.gamericefishpro.space.hj.c.O(parcel, i6);
                    }
                }
                com.gamericefishpro.space.hj.c.u(parcel, iX6);
                return new a4(strQ6, jP7, iO2);
            case 10:
                int iX7 = com.gamericefishpro.space.hj.c.X(parcel);
                byte[] bArr = null;
                String strQ7 = null;
                Bundle bundleN3 = null;
                String strQ8 = null;
                long jP8 = 0;
                long jP9 = 0;
                int iO3 = 0;
                while (parcel.dataPosition() < iX7) {
                    int i7 = parcel.readInt();
                    switch ((char) i7) {
                        case 1:
                            jP8 = com.gamericefishpro.space.hj.c.P(parcel, i7);
                            break;
                        case 2:
                            int iQ = com.gamericefishpro.space.hj.c.Q(parcel, i7);
                            int iDataPosition = parcel.dataPosition();
                            if (iQ == 0) {
                                bArr = null;
                            } else {
                                byte[] bArrCreateByteArray = parcel.createByteArray();
                                parcel.setDataPosition(iDataPosition + iQ);
                                bArr = bArrCreateByteArray;
                            }
                            break;
                        case 3:
                            strQ7 = com.gamericefishpro.space.hj.c.q(parcel, i7);
                            break;
                        case 4:
                            bundleN3 = com.gamericefishpro.space.hj.c.n(parcel, i7);
                            break;
                        case i.STRING_FIELD_NUMBER /* 5 */:
                            iO3 = com.gamericefishpro.space.hj.c.O(parcel, i7);
                            break;
                        case i.STRING_SET_FIELD_NUMBER /* 6 */:
                            jP9 = com.gamericefishpro.space.hj.c.P(parcel, i7);
                            break;
                        case i.DOUBLE_FIELD_NUMBER /* 7 */:
                            strQ8 = com.gamericefishpro.space.hj.c.q(parcel, i7);
                            break;
                        default:
                            com.gamericefishpro.space.hj.c.V(parcel, i7);
                            break;
                    }
                }
                com.gamericefishpro.space.hj.c.u(parcel, iX7);
                return new d4(jP8, bArr, strQ7, bundleN3, iO3, jP9, strQ8);
            case RequestError.STOP_TRACKING /* 11 */:
                int iX8 = com.gamericefishpro.space.hj.c.X(parcel);
                while (true) {
                    ArrayList arrayList = null;
                    while (true) {
                        if (parcel.dataPosition() >= iX8) {
                            com.gamericefishpro.space.hj.c.u(parcel, iX8);
                            return new e4(arrayList);
                        }
                        int i8 = parcel.readInt();
                        if (((char) i8) != 1) {
                            com.gamericefishpro.space.hj.c.V(parcel, i8);
                        } else {
                            int iQ2 = com.gamericefishpro.space.hj.c.Q(parcel, i8);
                            int iDataPosition2 = parcel.dataPosition();
                            if (iQ2 == 0) {
                            }
                            ArrayList arrayList2 = new ArrayList();
                            int i9 = parcel.readInt();
                            for (int i10 = 0; i10 < i9; i10++) {
                                arrayList2.add(Integer.valueOf(parcel.readInt()));
                            }
                            parcel.setDataPosition(iDataPosition2 + iQ2);
                            arrayList = arrayList2;
                        }
                        break;
                    }
                }
                break;
            case 12:
                int iX9 = com.gamericefishpro.space.hj.c.X(parcel);
                ArrayList arrayListS = null;
                while (parcel.dataPosition() < iX9) {
                    int i11 = parcel.readInt();
                    if (((char) i11) != 1) {
                        com.gamericefishpro.space.hj.c.V(parcel, i11);
                    } else {
                        arrayListS = com.gamericefishpro.space.hj.c.s(parcel, i11, d4.CREATOR);
                    }
                }
                com.gamericefishpro.space.hj.c.u(parcel, iX9);
                return new f4(arrayListS);
            case 13:
                int iX10 = com.gamericefishpro.space.hj.c.X(parcel);
                String strQ9 = null;
                Long lValueOf = null;
                Float fValueOf = null;
                String strQ10 = null;
                String strQ11 = null;
                Double dValueOf = null;
                long jP10 = 0;
                int iO4 = 0;
                while (parcel.dataPosition() < iX10) {
                    int i12 = parcel.readInt();
                    switch ((char) i12) {
                        case 1:
                            iO4 = com.gamericefishpro.space.hj.c.O(parcel, i12);
                            break;
                        case 2:
                            strQ9 = com.gamericefishpro.space.hj.c.q(parcel, i12);
                            break;
                        case 3:
                            jP10 = com.gamericefishpro.space.hj.c.P(parcel, i12);
                            break;
                        case 4:
                            int iQ3 = com.gamericefishpro.space.hj.c.Q(parcel, i12);
                            if (iQ3 == 0) {
                                lValueOf = null;
                            } else {
                                com.gamericefishpro.space.hj.c.b0(parcel, iQ3, 8);
                                lValueOf = Long.valueOf(parcel.readLong());
                            }
                            break;
                        case i.STRING_FIELD_NUMBER /* 5 */:
                            int iQ4 = com.gamericefishpro.space.hj.c.Q(parcel, i12);
                            if (iQ4 == 0) {
                                fValueOf = null;
                            } else {
                                com.gamericefishpro.space.hj.c.b0(parcel, iQ4, 4);
                                fValueOf = Float.valueOf(parcel.readFloat());
                            }
                            break;
                        case i.STRING_SET_FIELD_NUMBER /* 6 */:
                            strQ10 = com.gamericefishpro.space.hj.c.q(parcel, i12);
                            break;
                        case i.DOUBLE_FIELD_NUMBER /* 7 */:
                            strQ11 = com.gamericefishpro.space.hj.c.q(parcel, i12);
                            break;
                        case i.BYTES_FIELD_NUMBER /* 8 */:
                            int iQ5 = com.gamericefishpro.space.hj.c.Q(parcel, i12);
                            if (iQ5 == 0) {
                                dValueOf = null;
                            } else {
                                com.gamericefishpro.space.hj.c.b0(parcel, iQ5, 8);
                                dValueOf = Double.valueOf(parcel.readDouble());
                            }
                            break;
                        default:
                            com.gamericefishpro.space.hj.c.V(parcel, i12);
                            break;
                    }
                }
                com.gamericefishpro.space.hj.c.u(parcel, iX10);
                return new o4(iO4, strQ9, jP10, lValueOf, fValueOf, strQ10, strQ11, dValueOf);
            case 14:
                int iX11 = com.gamericefishpro.space.hj.c.X(parcel);
                boolean zM2 = false;
                int iO5 = 0;
                boolean zM3 = false;
                boolean zM4 = false;
                int iO6 = 0;
                int iO7 = 0;
                long jP11 = 0;
                long jP12 = 0;
                long jP13 = 0;
                long jP14 = 0;
                long jP15 = 0;
                long jP16 = 0;
                long jP17 = 0;
                String strQ12 = "";
                String strQ13 = strQ12;
                String strQ14 = strQ13;
                String strQ15 = strQ14;
                String strQ16 = null;
                String strQ17 = null;
                String strQ18 = null;
                String strQ19 = null;
                String strQ20 = null;
                String strQ21 = null;
                Boolean boolValueOf = null;
                ArrayList<String> arrayList3 = null;
                String strQ22 = null;
                String strQ23 = null;
                int iO8 = 100;
                boolean zM5 = true;
                boolean zM6 = true;
                long jP18 = -2147483648L;
                while (parcel.dataPosition() < iX11) {
                    int i13 = parcel.readInt();
                    switch ((char) i13) {
                        case 2:
                            strQ16 = com.gamericefishpro.space.hj.c.q(parcel, i13);
                            break;
                        case 3:
                            strQ17 = com.gamericefishpro.space.hj.c.q(parcel, i13);
                            break;
                        case 4:
                            strQ18 = com.gamericefishpro.space.hj.c.q(parcel, i13);
                            break;
                        case i.STRING_FIELD_NUMBER /* 5 */:
                            strQ19 = com.gamericefishpro.space.hj.c.q(parcel, i13);
                            break;
                        case i.STRING_SET_FIELD_NUMBER /* 6 */:
                            jP11 = com.gamericefishpro.space.hj.c.P(parcel, i13);
                            break;
                        case i.DOUBLE_FIELD_NUMBER /* 7 */:
                            jP12 = com.gamericefishpro.space.hj.c.P(parcel, i13);
                            break;
                        case i.BYTES_FIELD_NUMBER /* 8 */:
                            strQ20 = com.gamericefishpro.space.hj.c.q(parcel, i13);
                            break;
                        case '\t':
                            zM5 = com.gamericefishpro.space.hj.c.M(parcel, i13);
                            break;
                        case '\n':
                            zM2 = com.gamericefishpro.space.hj.c.M(parcel, i13);
                            break;
                        case RequestError.STOP_TRACKING /* 11 */:
                            jP18 = com.gamericefishpro.space.hj.c.P(parcel, i13);
                            break;
                        case '\f':
                            strQ21 = com.gamericefishpro.space.hj.c.q(parcel, i13);
                            break;
                        case '\r':
                        case 17:
                        case 19:
                        case 20:
                        case 24:
                        case '!':
                        default:
                            com.gamericefishpro.space.hj.c.V(parcel, i13);
                            break;
                        case 14:
                            jP13 = com.gamericefishpro.space.hj.c.P(parcel, i13);
                            break;
                        case 15:
                            iO5 = com.gamericefishpro.space.hj.c.O(parcel, i13);
                            break;
                        case 16:
                            zM6 = com.gamericefishpro.space.hj.c.M(parcel, i13);
                            break;
                        case 18:
                            zM3 = com.gamericefishpro.space.hj.c.M(parcel, i13);
                            break;
                        case 21:
                            int iQ6 = com.gamericefishpro.space.hj.c.Q(parcel, i13);
                            if (iQ6 == 0) {
                                boolValueOf = null;
                            } else {
                                com.gamericefishpro.space.hj.c.b0(parcel, iQ6, 4);
                                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
                            }
                            break;
                        case 22:
                            jP14 = com.gamericefishpro.space.hj.c.P(parcel, i13);
                            break;
                        case 23:
                            int iQ7 = com.gamericefishpro.space.hj.c.Q(parcel, i13);
                            int iDataPosition3 = parcel.dataPosition();
                            if (iQ7 == 0) {
                                arrayList3 = null;
                            } else {
                                ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
                                parcel.setDataPosition(iDataPosition3 + iQ7);
                                arrayList3 = arrayListCreateStringArrayList;
                            }
                            break;
                        case 25:
                            strQ12 = com.gamericefishpro.space.hj.c.q(parcel, i13);
                            break;
                        case 26:
                            strQ13 = com.gamericefishpro.space.hj.c.q(parcel, i13);
                            break;
                        case 27:
                            strQ22 = com.gamericefishpro.space.hj.c.q(parcel, i13);
                            break;
                        case 28:
                            zM4 = com.gamericefishpro.space.hj.c.M(parcel, i13);
                            break;
                        case 29:
                            jP15 = com.gamericefishpro.space.hj.c.P(parcel, i13);
                            break;
                        case 30:
                            iO8 = com.gamericefishpro.space.hj.c.O(parcel, i13);
                            break;
                        case 31:
                            strQ14 = com.gamericefishpro.space.hj.c.q(parcel, i13);
                            break;
                        case ' ':
                            iO6 = com.gamericefishpro.space.hj.c.O(parcel, i13);
                            break;
                        case '\"':
                            jP16 = com.gamericefishpro.space.hj.c.P(parcel, i13);
                            break;
                        case '#':
                            strQ23 = com.gamericefishpro.space.hj.c.q(parcel, i13);
                            break;
                        case '$':
                            strQ15 = com.gamericefishpro.space.hj.c.q(parcel, i13);
                            break;
                        case '%':
                            jP17 = com.gamericefishpro.space.hj.c.P(parcel, i13);
                            break;
                        case '&':
                            iO7 = com.gamericefishpro.space.hj.c.O(parcel, i13);
                            break;
                    }
                }
                com.gamericefishpro.space.hj.c.u(parcel, iX11);
                return new t4(strQ16, strQ17, strQ18, strQ19, jP11, jP12, strQ20, zM5, zM2, jP18, strQ21, jP13, iO5, zM6, zM3, boolValueOf, jP14, arrayList3, strQ12, strQ13, strQ22, zM4, jP15, iO8, strQ14, iO6, jP16, strQ23, strQ15, jP17, iO7);
            case 15:
                int iX12 = com.gamericefishpro.space.hj.c.X(parcel);
                String strQ24 = null;
                String strQ25 = null;
                String strQ26 = null;
                String strQ27 = null;
                Uri uri = null;
                String strQ28 = null;
                String strQ29 = null;
                ArrayList arrayListS2 = null;
                String strQ30 = null;
                String strQ31 = null;
                long jP19 = 0;
                int iO9 = 0;
                while (parcel.dataPosition() < iX12) {
                    int i14 = parcel.readInt();
                    switch ((char) i14) {
                        case 1:
                            iO9 = com.gamericefishpro.space.hj.c.O(parcel, i14);
                            break;
                        case 2:
                            strQ24 = com.gamericefishpro.space.hj.c.q(parcel, i14);
                            break;
                        case 3:
                            strQ25 = com.gamericefishpro.space.hj.c.q(parcel, i14);
                            break;
                        case 4:
                            strQ26 = com.gamericefishpro.space.hj.c.q(parcel, i14);
                            break;
                        case i.STRING_FIELD_NUMBER /* 5 */:
                            strQ27 = com.gamericefishpro.space.hj.c.q(parcel, i14);
                            break;
                        case i.STRING_SET_FIELD_NUMBER /* 6 */:
                            uri = (Uri) com.gamericefishpro.space.hj.c.p(parcel, i14, Uri.CREATOR);
                            break;
                        case i.DOUBLE_FIELD_NUMBER /* 7 */:
                            strQ28 = com.gamericefishpro.space.hj.c.q(parcel, i14);
                            break;
                        case i.BYTES_FIELD_NUMBER /* 8 */:
                            jP19 = com.gamericefishpro.space.hj.c.P(parcel, i14);
                            break;
                        case '\t':
                            strQ29 = com.gamericefishpro.space.hj.c.q(parcel, i14);
                            break;
                        case '\n':
                            arrayListS2 = com.gamericefishpro.space.hj.c.s(parcel, i14, Scope.CREATOR);
                            break;
                        case RequestError.STOP_TRACKING /* 11 */:
                            strQ30 = com.gamericefishpro.space.hj.c.q(parcel, i14);
                            break;
                        case '\f':
                            strQ31 = com.gamericefishpro.space.hj.c.q(parcel, i14);
                            break;
                        default:
                            com.gamericefishpro.space.hj.c.V(parcel, i14);
                            break;
                    }
                }
                com.gamericefishpro.space.hj.c.u(parcel, iX12);
                return new GoogleSignInAccount(iO9, strQ24, strQ25, strQ26, strQ27, uri, strQ28, jP19, strQ29, arrayListS2, strQ30, strQ31);
            case 16:
                int iX13 = com.gamericefishpro.space.hj.c.X(parcel);
                Intent intent = null;
                int iO10 = 0;
                int iO11 = 0;
                while (parcel.dataPosition() < iX13) {
                    int i15 = parcel.readInt();
                    char c4 = (char) i15;
                    if (c4 == 1) {
                        iO10 = com.gamericefishpro.space.hj.c.O(parcel, i15);
                    } else if (c4 == 2) {
                        iO11 = com.gamericefishpro.space.hj.c.O(parcel, i15);
                    } else if (c4 != 3) {
                        com.gamericefishpro.space.hj.c.V(parcel, i15);
                    } else {
                        intent = (Intent) com.gamericefishpro.space.hj.c.p(parcel, i15, Intent.CREATOR);
                    }
                }
                com.gamericefishpro.space.hj.c.u(parcel, iX13);
                return new com.gamericefishpro.space.p9.b(iO10, iO11, intent);
            case 17:
                int iX14 = com.gamericefishpro.space.hj.c.X(parcel);
                ArrayList<String> arrayList4 = null;
                String strQ32 = null;
                while (parcel.dataPosition() < iX14) {
                    int i16 = parcel.readInt();
                    char c5 = (char) i16;
                    if (c5 == 1) {
                        int iQ8 = com.gamericefishpro.space.hj.c.Q(parcel, i16);
                        int iDataPosition4 = parcel.dataPosition();
                        if (iQ8 == 0) {
                            arrayList4 = null;
                        } else {
                            ArrayList<String> arrayListCreateStringArrayList2 = parcel.createStringArrayList();
                            parcel.setDataPosition(iDataPosition4 + iQ8);
                            arrayList4 = arrayListCreateStringArrayList2;
                        }
                    } else if (c5 != 2) {
                        com.gamericefishpro.space.hj.c.V(parcel, i16);
                    } else {
                        strQ32 = com.gamericefishpro.space.hj.c.q(parcel, i16);
                    }
                }
                com.gamericefishpro.space.hj.c.u(parcel, iX14);
                return new com.gamericefishpro.space.p9.f(strQ32, arrayList4);
            case 18:
                int iX15 = com.gamericefishpro.space.hj.c.X(parcel);
                com.gamericefishpro.space.s8.b bVar = null;
                int iO12 = 0;
                w wVar = null;
                while (parcel.dataPosition() < iX15) {
                    int i17 = parcel.readInt();
                    char c6 = (char) i17;
                    if (c6 == 1) {
                        iO12 = com.gamericefishpro.space.hj.c.O(parcel, i17);
                    } else if (c6 == 2) {
                        bVar = (com.gamericefishpro.space.s8.b) com.gamericefishpro.space.hj.c.p(parcel, i17, com.gamericefishpro.space.s8.b.CREATOR);
                    } else if (c6 != 3) {
                        com.gamericefishpro.space.hj.c.V(parcel, i17);
                    } else {
                        wVar = (w) com.gamericefishpro.space.hj.c.p(parcel, i17, w.CREATOR);
                    }
                }
                com.gamericefishpro.space.hj.c.u(parcel, iX15);
                return new g(iO12, bVar, wVar);
            case 19:
                r rVar = new r();
                rVar.d = parcel.readInt();
                rVar.e = parcel.readInt();
                rVar.i = parcel.readInt() == 1;
                return rVar;
            case 20:
                q0 q0Var = new q0();
                q0Var.d = parcel.readInt();
                q0Var.e = parcel.readInt();
                q0Var.v = parcel.readInt() == 1;
                int i18 = parcel.readInt();
                if (i18 > 0) {
                    int[] iArr = new int[i18];
                    q0Var.i = iArr;
                    parcel.readIntArray(iArr);
                }
                return q0Var;
            case 21:
                r0 r0Var = new r0();
                r0Var.d = parcel.readInt();
                r0Var.e = parcel.readInt();
                int i19 = parcel.readInt();
                r0Var.i = i19;
                if (i19 > 0) {
                    int[] iArr2 = new int[i19];
                    r0Var.v = iArr2;
                    parcel.readIntArray(iArr2);
                }
                int i20 = parcel.readInt();
                r0Var.w = i20;
                if (i20 > 0) {
                    int[] iArr3 = new int[i20];
                    r0Var.y = iArr3;
                    parcel.readIntArray(iArr3);
                }
                r0Var.A = parcel.readInt() == 1;
                r0Var.B = parcel.readInt() == 1;
                r0Var.C = parcel.readInt() == 1;
                r0Var.z = parcel.readArrayList(q0.class.getClassLoader());
                return r0Var;
            case 22:
                int iX16 = com.gamericefishpro.space.hj.c.X(parcel);
                PendingIntent pendingIntent = null;
                String strQ33 = null;
                Integer numValueOf = null;
                int iO13 = 0;
                int iO14 = 0;
                while (parcel.dataPosition() < iX16) {
                    int i21 = parcel.readInt();
                    char c7 = (char) i21;
                    if (c7 == 1) {
                        iO13 = com.gamericefishpro.space.hj.c.O(parcel, i21);
                    } else if (c7 == 2) {
                        iO14 = com.gamericefishpro.space.hj.c.O(parcel, i21);
                    } else if (c7 == 3) {
                        pendingIntent = (PendingIntent) com.gamericefishpro.space.hj.c.p(parcel, i21, PendingIntent.CREATOR);
                    } else if (c7 == 4) {
                        strQ33 = com.gamericefishpro.space.hj.c.q(parcel, i21);
                    } else if (c7 != 5) {
                        com.gamericefishpro.space.hj.c.V(parcel, i21);
                    } else {
                        int iQ9 = com.gamericefishpro.space.hj.c.Q(parcel, i21);
                        if (iQ9 == 0) {
                            numValueOf = null;
                        } else {
                            com.gamericefishpro.space.hj.c.b0(parcel, iQ9, 4);
                            numValueOf = Integer.valueOf(parcel.readInt());
                        }
                    }
                }
                com.gamericefishpro.space.hj.c.u(parcel, iX16);
                return new com.gamericefishpro.space.s8.b(iO13, iO14, pendingIntent, strQ33, numValueOf);
            case 23:
                int iX17 = com.gamericefishpro.space.hj.c.X(parcel);
                int iO15 = 0;
                boolean zM7 = false;
                long jP20 = -1;
                String strQ34 = null;
                while (parcel.dataPosition() < iX17) {
                    int i22 = parcel.readInt();
                    char c8 = (char) i22;
                    if (c8 == 1) {
                        strQ34 = com.gamericefishpro.space.hj.c.q(parcel, i22);
                    } else if (c8 == 2) {
                        iO15 = com.gamericefishpro.space.hj.c.O(parcel, i22);
                    } else if (c8 == 3) {
                        jP20 = com.gamericefishpro.space.hj.c.P(parcel, i22);
                    } else if (c8 != 4) {
                        com.gamericefishpro.space.hj.c.V(parcel, i22);
                    } else {
                        zM7 = com.gamericefishpro.space.hj.c.M(parcel, i22);
                    }
                }
                com.gamericefishpro.space.hj.c.u(parcel, iX17);
                return new com.gamericefishpro.space.s8.d(strQ34, iO15, jP20, zM7);
            case 24:
                int iX18 = com.gamericefishpro.space.hj.c.X(parcel);
                long jP21 = -1;
                boolean zM8 = false;
                int iO16 = 0;
                int iO17 = 0;
                String strQ35 = null;
                while (parcel.dataPosition() < iX18) {
                    int i23 = parcel.readInt();
                    char c9 = (char) i23;
                    if (c9 == 1) {
                        zM8 = com.gamericefishpro.space.hj.c.M(parcel, i23);
                    } else if (c9 == 2) {
                        strQ35 = com.gamericefishpro.space.hj.c.q(parcel, i23);
                    } else if (c9 == 3) {
                        iO16 = com.gamericefishpro.space.hj.c.O(parcel, i23);
                    } else if (c9 == 4) {
                        iO17 = com.gamericefishpro.space.hj.c.O(parcel, i23);
                    } else if (c9 != 5) {
                        com.gamericefishpro.space.hj.c.V(parcel, i23);
                    } else {
                        jP21 = com.gamericefishpro.space.hj.c.P(parcel, i23);
                    }
                }
                com.gamericefishpro.space.hj.c.u(parcel, iX18);
                return new s(zM8, strQ35, iO16, iO17, jP21);
            case 25:
                int iX19 = com.gamericefishpro.space.hj.c.X(parcel);
                String strQ36 = null;
                int iO18 = 0;
                while (parcel.dataPosition() < iX19) {
                    int i24 = parcel.readInt();
                    char c10 = (char) i24;
                    if (c10 == 1) {
                        iO18 = com.gamericefishpro.space.hj.c.O(parcel, i24);
                    } else if (c10 != 2) {
                        com.gamericefishpro.space.hj.c.V(parcel, i24);
                    } else {
                        strQ36 = com.gamericefishpro.space.hj.c.q(parcel, i24);
                    }
                }
                com.gamericefishpro.space.hj.c.u(parcel, iX19);
                return new Scope(iO18, strQ36);
            case 26:
                int iX20 = com.gamericefishpro.space.hj.c.X(parcel);
                String strQ37 = null;
                com.gamericefishpro.space.s8.b bVar2 = null;
                int iO19 = 0;
                PendingIntent pendingIntent2 = null;
                while (parcel.dataPosition() < iX20) {
                    int i25 = parcel.readInt();
                    char c11 = (char) i25;
                    if (c11 == 1) {
                        iO19 = com.gamericefishpro.space.hj.c.O(parcel, i25);
                    } else if (c11 == 2) {
                        strQ37 = com.gamericefishpro.space.hj.c.q(parcel, i25);
                    } else if (c11 == 3) {
                        pendingIntent2 = (PendingIntent) com.gamericefishpro.space.hj.c.p(parcel, i25, PendingIntent.CREATOR);
                    } else if (c11 != 4) {
                        com.gamericefishpro.space.hj.c.V(parcel, i25);
                    } else {
                        bVar2 = (com.gamericefishpro.space.s8.b) com.gamericefishpro.space.hj.c.p(parcel, i25, com.gamericefishpro.space.s8.b.CREATOR);
                    }
                }
                com.gamericefishpro.space.hj.c.u(parcel, iX20);
                return new Status(iO19, strQ37, pendingIntent2, bVar2);
            case 27:
                int iX21 = com.gamericefishpro.space.hj.c.X(parcel);
                Bundle bundleN4 = null;
                while (parcel.dataPosition() < iX21) {
                    int i26 = parcel.readInt();
                    if (((char) i26) != 2) {
                        com.gamericefishpro.space.hj.c.V(parcel, i26);
                    } else {
                        bundleN4 = com.gamericefishpro.space.hj.c.n(parcel, i26);
                    }
                }
                com.gamericefishpro.space.hj.c.u(parcel, iX21);
                return new com.gamericefishpro.space.tb.r(bundleN4);
            case 28:
                int iX22 = com.gamericefishpro.space.hj.c.X(parcel);
                ArrayList arrayListS3 = null;
                int iO20 = 0;
                while (parcel.dataPosition() < iX22) {
                    int i27 = parcel.readInt();
                    char c12 = (char) i27;
                    if (c12 == 1) {
                        iO20 = com.gamericefishpro.space.hj.c.O(parcel, i27);
                    } else if (c12 != 2) {
                        com.gamericefishpro.space.hj.c.V(parcel, i27);
                    } else {
                        arrayListS3 = com.gamericefishpro.space.hj.c.s(parcel, i27, k.CREATOR);
                    }
                }
                com.gamericefishpro.space.hj.c.u(parcel, iX22);
                return new n(iO20, arrayListS3);
            default:
                int iX23 = com.gamericefishpro.space.hj.c.X(parcel);
                int iO21 = -1;
                int iO22 = 0;
                int iO23 = 0;
                int iO24 = 0;
                int iO25 = 0;
                String strQ38 = null;
                String strQ39 = null;
                long jP22 = 0;
                long jP23 = 0;
                while (parcel.dataPosition() < iX23) {
                    int i28 = parcel.readInt();
                    switch ((char) i28) {
                        case 1:
                            iO22 = com.gamericefishpro.space.hj.c.O(parcel, i28);
                            break;
                        case 2:
                            iO23 = com.gamericefishpro.space.hj.c.O(parcel, i28);
                            break;
                        case 3:
                            iO24 = com.gamericefishpro.space.hj.c.O(parcel, i28);
                            break;
                        case 4:
                            jP22 = com.gamericefishpro.space.hj.c.P(parcel, i28);
                            break;
                        case i.STRING_FIELD_NUMBER /* 5 */:
                            jP23 = com.gamericefishpro.space.hj.c.P(parcel, i28);
                            break;
                        case i.STRING_SET_FIELD_NUMBER /* 6 */:
                            strQ38 = com.gamericefishpro.space.hj.c.q(parcel, i28);
                            break;
                        case i.DOUBLE_FIELD_NUMBER /* 7 */:
                            strQ39 = com.gamericefishpro.space.hj.c.q(parcel, i28);
                            break;
                        case i.BYTES_FIELD_NUMBER /* 8 */:
                            iO25 = com.gamericefishpro.space.hj.c.O(parcel, i28);
                            break;
                        case '\t':
                            iO21 = com.gamericefishpro.space.hj.c.O(parcel, i28);
                            break;
                        default:
                            com.gamericefishpro.space.hj.c.V(parcel, i28);
                            break;
                    }
                }
                com.gamericefishpro.space.hj.c.u(parcel, iX23);
                return new k(iO22, iO23, iO24, jP22, jP23, strQ38, strQ39, iO25, iO21);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.a) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return new b[i];
            case 1:
                return new f[i];
            case 2:
                return new h[i];
            case 3:
                return new ParcelImpl[i];
            case 4:
                return new com.gamericefishpro.space.n9.d[i];
            case i.STRING_FIELD_NUMBER /* 5 */:
                return new com.gamericefishpro.space.n9.e[i];
            case i.STRING_SET_FIELD_NUMBER /* 6 */:
                return new com.gamericefishpro.space.n9.i[i];
            case i.DOUBLE_FIELD_NUMBER /* 7 */:
                return new t[i];
            case i.BYTES_FIELD_NUMBER /* 8 */:
                return new u[i];
            case 9:
                return new a4[i];
            case 10:
                return new d4[i];
            case RequestError.STOP_TRACKING /* 11 */:
                return new e4[i];
            case 12:
                return new f4[i];
            case 13:
                return new o4[i];
            case 14:
                return new t4[i];
            case 15:
                return new GoogleSignInAccount[i];
            case 16:
                return new com.gamericefishpro.space.p9.b[i];
            case 17:
                return new com.gamericefishpro.space.p9.f[i];
            case 18:
                return new g[i];
            case 19:
                return new r[i];
            case 20:
                return new q0[i];
            case 21:
                return new r0[i];
            case 22:
                return new com.gamericefishpro.space.s8.b[i];
            case 23:
                return new com.gamericefishpro.space.s8.d[i];
            case 24:
                return new s[i];
            case 25:
                return new Scope[i];
            case 26:
                return new Status[i];
            case 27:
                return new com.gamericefishpro.space.tb.r[i];
            case 28:
                return new n[i];
            default:
                return new k[i];
        }
    }
}
