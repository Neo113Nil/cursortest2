package com.gamericefishpro.space.i9;

import com.android.installreferrer.api.InstallReferrerClient;
import com.appsflyer.attribution.RequestError;
import java.nio.charset.Charset;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class w5 {
    public final t a;

    public w5(w6 w6Var, w6 w6Var2) {
        this.a = new t(w6Var, w6Var2);
    }

    public static void a(x4 x4Var, t tVar, Object obj, Object obj2) throws y4 {
        b5.b(x4Var, (w6) tVar.a, 1, obj);
        b5.b(x4Var, (w6) tVar.b, 2, obj2);
    }

    /* JADX WARN: Code duplicated, block: B:41:0x011c  */
    /* JADX WARN: Code duplicated, block: B:44:0x0129  */
    /* JADX WARN: Code duplicated, block: B:46:0x012f  */
    /* JADX WARN: Code duplicated, block: B:47:0x013f  */
    /* JADX WARN: Code duplicated, block: B:48:0x0150  */
    /* JADX WARN: Code duplicated, block: B:49:0x0157  */
    /* JADX WARN: Code duplicated, block: B:51:0x015f  */
    /* JADX WARN: Code duplicated, block: B:53:0x0163  */
    /* JADX WARN: Code duplicated, block: B:54:0x0170  */
    /* JADX WARN: Code duplicated, block: B:55:0x017d  */
    /* JADX WARN: Code duplicated, block: B:56:0x0189  */
    /* JADX WARN: Code duplicated, block: B:58:0x018d  */
    /* JADX WARN: Code duplicated, block: B:60:0x019b  */
    /* JADX WARN: Code duplicated, block: B:61:0x01a3  */
    /* JADX WARN: Code duplicated, block: B:62:0x01b0  */
    /* JADX WARN: Code duplicated, block: B:63:0x01b9  */
    /* JADX WARN: Code duplicated, block: B:65:0x01bd  */
    /* JADX WARN: Code duplicated, block: B:66:0x01c8  */
    /* JADX WARN: Code duplicated, block: B:67:0x01cf  */
    /* JADX WARN: Code duplicated, block: B:68:0x01d6  */
    /* JADX WARN: Code duplicated, block: B:69:0x01dc  */
    /* JADX WARN: Code duplicated, block: B:70:0x01e2  */
    /* JADX WARN: Code duplicated, block: B:71:0x01ee  */
    /* JADX WARN: Code duplicated, block: B:72:0x01f9  */
    /* JADX WARN: Code duplicated, block: B:73:0x0204  */
    /* JADX WARN: Code duplicated, block: B:74:0x020b  */
    public static int b(t tVar, Object obj, Object obj2) {
        int iP;
        int iD;
        int iG0;
        int i;
        int iG1;
        int iD2;
        int iG2;
        w6 w6Var = (w6) tVar.a;
        w6 w6Var2 = (w6) tVar.b;
        int i2 = b5.c;
        int iP2 = 8;
        int iG3 = x4.g0(8);
        w6 w6Var3 = w6.v;
        if (w6Var == w6Var3) {
            Charset charset = n5.a;
            iG3 += iG3;
        }
        x6 x6Var = x6.d;
        switch (w6Var.ordinal()) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                ((Double) obj).getClass();
                iP = 8;
                i = iP + iG3;
                iG1 = x4.g0(16);
                if (w6Var2 == w6Var3) {
                    Charset charset2 = n5.a;
                    iG1 += iG1;
                }
                switch (w6Var2.ordinal()) {
                    case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                        ((Double) obj2).getClass();
                        return iP2 + iG1 + i;
                    case 1:
                        ((Float) obj2).getClass();
                        iP2 = 4;
                        return iP2 + iG1 + i;
                    case 2:
                        iP2 = x4.P(((Long) obj2).longValue());
                        return iP2 + iG1 + i;
                    case 3:
                        iP2 = x4.P(((Long) obj2).longValue());
                        return iP2 + iG1 + i;
                    case 4:
                        iP2 = x4.P(((Integer) obj2).intValue());
                        return iP2 + iG1 + i;
                    case com.gamericefishpro.space.o4.i.STRING_FIELD_NUMBER /* 5 */:
                        ((Long) obj2).getClass();
                        return iP2 + iG1 + i;
                    case com.gamericefishpro.space.o4.i.STRING_SET_FIELD_NUMBER /* 6 */:
                        ((Integer) obj2).getClass();
                        iP2 = 4;
                        return iP2 + iG1 + i;
                    case com.gamericefishpro.space.o4.i.DOUBLE_FIELD_NUMBER /* 7 */:
                        ((Boolean) obj2).getClass();
                        iP2 = 1;
                        return iP2 + iG1 + i;
                    case com.gamericefishpro.space.o4.i.BYTES_FIELD_NUMBER /* 8 */:
                        if (obj2 instanceof w4) {
                            iD2 = ((w4) obj2).d();
                            iG2 = x4.g0(iD2);
                            iP2 = iG2 + iD2;
                        } else {
                            iP2 = x4.Q((String) obj2);
                        }
                        return iP2 + iG1 + i;
                    case 9:
                        iP2 = ((g5) ((p4) obj2)).k();
                        return iP2 + iG1 + i;
                    case 10:
                        iD2 = ((g5) ((p4) obj2)).k();
                        iG2 = x4.g0(iD2);
                        iP2 = iG2 + iD2;
                        return iP2 + iG1 + i;
                    case RequestError.STOP_TRACKING /* 11 */:
                        if (obj2 instanceof w4) {
                            iD2 = ((w4) obj2).d();
                            iG2 = x4.g0(iD2);
                        } else {
                            iD2 = ((byte[]) obj2).length;
                            iG2 = x4.g0(iD2);
                        }
                        iP2 = iG2 + iD2;
                        return iP2 + iG1 + i;
                    case 12:
                        iP2 = x4.g0(((Integer) obj2).intValue());
                        return iP2 + iG1 + i;
                    case 13:
                        if (obj2 instanceof i5) {
                            iP2 = x4.P(((i5) obj2).a());
                        } else {
                            iP2 = x4.P(((Integer) obj2).intValue());
                        }
                        return iP2 + iG1 + i;
                    case 14:
                        ((Integer) obj2).getClass();
                        iP2 = 4;
                        return iP2 + iG1 + i;
                    case 15:
                        ((Long) obj2).getClass();
                        return iP2 + iG1 + i;
                    case 16:
                        int iIntValue = ((Integer) obj2).intValue();
                        iP2 = x4.g0((iIntValue >> 31) ^ (iIntValue + iIntValue));
                        return iP2 + iG1 + i;
                    case 17:
                        long jLongValue = ((Long) obj2).longValue();
                        iP2 = x4.P((jLongValue >> 63) ^ (jLongValue + jLongValue));
                        return iP2 + iG1 + i;
                    default:
                        throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                }
            case 1:
                ((Float) obj).getClass();
                iP = 4;
                i = iP + iG3;
                iG1 = x4.g0(16);
                if (w6Var2 == w6Var3) {
                    Charset charset3 = n5.a;
                    iG1 += iG1;
                }
                switch (w6Var2.ordinal()) {
                    case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                        ((Double) obj2).getClass();
                        return iP2 + iG1 + i;
                    case 1:
                        ((Float) obj2).getClass();
                        iP2 = 4;
                        return iP2 + iG1 + i;
                    case 2:
                        iP2 = x4.P(((Long) obj2).longValue());
                        return iP2 + iG1 + i;
                    case 3:
                        iP2 = x4.P(((Long) obj2).longValue());
                        return iP2 + iG1 + i;
                    case 4:
                        iP2 = x4.P(((Integer) obj2).intValue());
                        return iP2 + iG1 + i;
                    case com.gamericefishpro.space.o4.i.STRING_FIELD_NUMBER /* 5 */:
                        ((Long) obj2).getClass();
                        return iP2 + iG1 + i;
                    case com.gamericefishpro.space.o4.i.STRING_SET_FIELD_NUMBER /* 6 */:
                        ((Integer) obj2).getClass();
                        iP2 = 4;
                        return iP2 + iG1 + i;
                    case com.gamericefishpro.space.o4.i.DOUBLE_FIELD_NUMBER /* 7 */:
                        ((Boolean) obj2).getClass();
                        iP2 = 1;
                        return iP2 + iG1 + i;
                    case com.gamericefishpro.space.o4.i.BYTES_FIELD_NUMBER /* 8 */:
                        if (obj2 instanceof w4) {
                            iD2 = ((w4) obj2).d();
                            iG2 = x4.g0(iD2);
                            iP2 = iG2 + iD2;
                        } else {
                            iP2 = x4.Q((String) obj2);
                        }
                        return iP2 + iG1 + i;
                    case 9:
                        iP2 = ((g5) ((p4) obj2)).k();
                        return iP2 + iG1 + i;
                    case 10:
                        iD2 = ((g5) ((p4) obj2)).k();
                        iG2 = x4.g0(iD2);
                        iP2 = iG2 + iD2;
                        return iP2 + iG1 + i;
                    case RequestError.STOP_TRACKING /* 11 */:
                        if (obj2 instanceof w4) {
                            iD2 = ((w4) obj2).d();
                            iG2 = x4.g0(iD2);
                        } else {
                            iD2 = ((byte[]) obj2).length;
                            iG2 = x4.g0(iD2);
                        }
                        iP2 = iG2 + iD2;
                        return iP2 + iG1 + i;
                    case 12:
                        iP2 = x4.g0(((Integer) obj2).intValue());
                        return iP2 + iG1 + i;
                    case 13:
                        if (obj2 instanceof i5) {
                            iP2 = x4.P(((i5) obj2).a());
                        } else {
                            iP2 = x4.P(((Integer) obj2).intValue());
                        }
                        return iP2 + iG1 + i;
                    case 14:
                        ((Integer) obj2).getClass();
                        iP2 = 4;
                        return iP2 + iG1 + i;
                    case 15:
                        ((Long) obj2).getClass();
                        return iP2 + iG1 + i;
                    case 16:
                        int iIntValue2 = ((Integer) obj2).intValue();
                        iP2 = x4.g0((iIntValue2 >> 31) ^ (iIntValue2 + iIntValue2));
                        return iP2 + iG1 + i;
                    case 17:
                        long jLongValue2 = ((Long) obj2).longValue();
                        iP2 = x4.P((jLongValue2 >> 63) ^ (jLongValue2 + jLongValue2));
                        return iP2 + iG1 + i;
                    default:
                        throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                }
            case 2:
                iP = x4.P(((Long) obj).longValue());
                i = iP + iG3;
                iG1 = x4.g0(16);
                if (w6Var2 == w6Var3) {
                    Charset charset4 = n5.a;
                    iG1 += iG1;
                }
                switch (w6Var2.ordinal()) {
                    case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                        ((Double) obj2).getClass();
                        return iP2 + iG1 + i;
                    case 1:
                        ((Float) obj2).getClass();
                        iP2 = 4;
                        return iP2 + iG1 + i;
                    case 2:
                        iP2 = x4.P(((Long) obj2).longValue());
                        return iP2 + iG1 + i;
                    case 3:
                        iP2 = x4.P(((Long) obj2).longValue());
                        return iP2 + iG1 + i;
                    case 4:
                        iP2 = x4.P(((Integer) obj2).intValue());
                        return iP2 + iG1 + i;
                    case com.gamericefishpro.space.o4.i.STRING_FIELD_NUMBER /* 5 */:
                        ((Long) obj2).getClass();
                        return iP2 + iG1 + i;
                    case com.gamericefishpro.space.o4.i.STRING_SET_FIELD_NUMBER /* 6 */:
                        ((Integer) obj2).getClass();
                        iP2 = 4;
                        return iP2 + iG1 + i;
                    case com.gamericefishpro.space.o4.i.DOUBLE_FIELD_NUMBER /* 7 */:
                        ((Boolean) obj2).getClass();
                        iP2 = 1;
                        return iP2 + iG1 + i;
                    case com.gamericefishpro.space.o4.i.BYTES_FIELD_NUMBER /* 8 */:
                        if (obj2 instanceof w4) {
                            iD2 = ((w4) obj2).d();
                            iG2 = x4.g0(iD2);
                            iP2 = iG2 + iD2;
                        } else {
                            iP2 = x4.Q((String) obj2);
                        }
                        return iP2 + iG1 + i;
                    case 9:
                        iP2 = ((g5) ((p4) obj2)).k();
                        return iP2 + iG1 + i;
                    case 10:
                        iD2 = ((g5) ((p4) obj2)).k();
                        iG2 = x4.g0(iD2);
                        iP2 = iG2 + iD2;
                        return iP2 + iG1 + i;
                    case RequestError.STOP_TRACKING /* 11 */:
                        if (obj2 instanceof w4) {
                            iD2 = ((w4) obj2).d();
                            iG2 = x4.g0(iD2);
                        } else {
                            iD2 = ((byte[]) obj2).length;
                            iG2 = x4.g0(iD2);
                        }
                        iP2 = iG2 + iD2;
                        return iP2 + iG1 + i;
                    case 12:
                        iP2 = x4.g0(((Integer) obj2).intValue());
                        return iP2 + iG1 + i;
                    case 13:
                        if (obj2 instanceof i5) {
                            iP2 = x4.P(((i5) obj2).a());
                        } else {
                            iP2 = x4.P(((Integer) obj2).intValue());
                        }
                        return iP2 + iG1 + i;
                    case 14:
                        ((Integer) obj2).getClass();
                        iP2 = 4;
                        return iP2 + iG1 + i;
                    case 15:
                        ((Long) obj2).getClass();
                        return iP2 + iG1 + i;
                    case 16:
                        int iIntValue3 = ((Integer) obj2).intValue();
                        iP2 = x4.g0((iIntValue3 >> 31) ^ (iIntValue3 + iIntValue3));
                        return iP2 + iG1 + i;
                    case 17:
                        long jLongValue3 = ((Long) obj2).longValue();
                        iP2 = x4.P((jLongValue3 >> 63) ^ (jLongValue3 + jLongValue3));
                        return iP2 + iG1 + i;
                    default:
                        throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                }
            case 3:
                iP = x4.P(((Long) obj).longValue());
                i = iP + iG3;
                iG1 = x4.g0(16);
                if (w6Var2 == w6Var3) {
                    Charset charset5 = n5.a;
                    iG1 += iG1;
                }
                switch (w6Var2.ordinal()) {
                    case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                        ((Double) obj2).getClass();
                        return iP2 + iG1 + i;
                    case 1:
                        ((Float) obj2).getClass();
                        iP2 = 4;
                        return iP2 + iG1 + i;
                    case 2:
                        iP2 = x4.P(((Long) obj2).longValue());
                        return iP2 + iG1 + i;
                    case 3:
                        iP2 = x4.P(((Long) obj2).longValue());
                        return iP2 + iG1 + i;
                    case 4:
                        iP2 = x4.P(((Integer) obj2).intValue());
                        return iP2 + iG1 + i;
                    case com.gamericefishpro.space.o4.i.STRING_FIELD_NUMBER /* 5 */:
                        ((Long) obj2).getClass();
                        return iP2 + iG1 + i;
                    case com.gamericefishpro.space.o4.i.STRING_SET_FIELD_NUMBER /* 6 */:
                        ((Integer) obj2).getClass();
                        iP2 = 4;
                        return iP2 + iG1 + i;
                    case com.gamericefishpro.space.o4.i.DOUBLE_FIELD_NUMBER /* 7 */:
                        ((Boolean) obj2).getClass();
                        iP2 = 1;
                        return iP2 + iG1 + i;
                    case com.gamericefishpro.space.o4.i.BYTES_FIELD_NUMBER /* 8 */:
                        if (obj2 instanceof w4) {
                            iD2 = ((w4) obj2).d();
                            iG2 = x4.g0(iD2);
                            iP2 = iG2 + iD2;
                        } else {
                            iP2 = x4.Q((String) obj2);
                        }
                        return iP2 + iG1 + i;
                    case 9:
                        iP2 = ((g5) ((p4) obj2)).k();
                        return iP2 + iG1 + i;
                    case 10:
                        iD2 = ((g5) ((p4) obj2)).k();
                        iG2 = x4.g0(iD2);
                        iP2 = iG2 + iD2;
                        return iP2 + iG1 + i;
                    case RequestError.STOP_TRACKING /* 11 */:
                        if (obj2 instanceof w4) {
                            iD2 = ((w4) obj2).d();
                            iG2 = x4.g0(iD2);
                        } else {
                            iD2 = ((byte[]) obj2).length;
                            iG2 = x4.g0(iD2);
                        }
                        iP2 = iG2 + iD2;
                        return iP2 + iG1 + i;
                    case 12:
                        iP2 = x4.g0(((Integer) obj2).intValue());
                        return iP2 + iG1 + i;
                    case 13:
                        if (obj2 instanceof i5) {
                            iP2 = x4.P(((i5) obj2).a());
                        } else {
                            iP2 = x4.P(((Integer) obj2).intValue());
                        }
                        return iP2 + iG1 + i;
                    case 14:
                        ((Integer) obj2).getClass();
                        iP2 = 4;
                        return iP2 + iG1 + i;
                    case 15:
                        ((Long) obj2).getClass();
                        return iP2 + iG1 + i;
                    case 16:
                        int iIntValue4 = ((Integer) obj2).intValue();
                        iP2 = x4.g0((iIntValue4 >> 31) ^ (iIntValue4 + iIntValue4));
                        return iP2 + iG1 + i;
                    case 17:
                        long jLongValue4 = ((Long) obj2).longValue();
                        iP2 = x4.P((jLongValue4 >> 63) ^ (jLongValue4 + jLongValue4));
                        return iP2 + iG1 + i;
                    default:
                        throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                }
            case 4:
                iP = x4.P(((Integer) obj).intValue());
                i = iP + iG3;
                iG1 = x4.g0(16);
                if (w6Var2 == w6Var3) {
                    Charset charset6 = n5.a;
                    iG1 += iG1;
                }
                switch (w6Var2.ordinal()) {
                    case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                        ((Double) obj2).getClass();
                        return iP2 + iG1 + i;
                    case 1:
                        ((Float) obj2).getClass();
                        iP2 = 4;
                        return iP2 + iG1 + i;
                    case 2:
                        iP2 = x4.P(((Long) obj2).longValue());
                        return iP2 + iG1 + i;
                    case 3:
                        iP2 = x4.P(((Long) obj2).longValue());
                        return iP2 + iG1 + i;
                    case 4:
                        iP2 = x4.P(((Integer) obj2).intValue());
                        return iP2 + iG1 + i;
                    case com.gamericefishpro.space.o4.i.STRING_FIELD_NUMBER /* 5 */:
                        ((Long) obj2).getClass();
                        return iP2 + iG1 + i;
                    case com.gamericefishpro.space.o4.i.STRING_SET_FIELD_NUMBER /* 6 */:
                        ((Integer) obj2).getClass();
                        iP2 = 4;
                        return iP2 + iG1 + i;
                    case com.gamericefishpro.space.o4.i.DOUBLE_FIELD_NUMBER /* 7 */:
                        ((Boolean) obj2).getClass();
                        iP2 = 1;
                        return iP2 + iG1 + i;
                    case com.gamericefishpro.space.o4.i.BYTES_FIELD_NUMBER /* 8 */:
                        if (obj2 instanceof w4) {
                            iD2 = ((w4) obj2).d();
                            iG2 = x4.g0(iD2);
                            iP2 = iG2 + iD2;
                        } else {
                            iP2 = x4.Q((String) obj2);
                        }
                        return iP2 + iG1 + i;
                    case 9:
                        iP2 = ((g5) ((p4) obj2)).k();
                        return iP2 + iG1 + i;
                    case 10:
                        iD2 = ((g5) ((p4) obj2)).k();
                        iG2 = x4.g0(iD2);
                        iP2 = iG2 + iD2;
                        return iP2 + iG1 + i;
                    case RequestError.STOP_TRACKING /* 11 */:
                        if (obj2 instanceof w4) {
                            iD2 = ((w4) obj2).d();
                            iG2 = x4.g0(iD2);
                        } else {
                            iD2 = ((byte[]) obj2).length;
                            iG2 = x4.g0(iD2);
                        }
                        iP2 = iG2 + iD2;
                        return iP2 + iG1 + i;
                    case 12:
                        iP2 = x4.g0(((Integer) obj2).intValue());
                        return iP2 + iG1 + i;
                    case 13:
                        if (obj2 instanceof i5) {
                            iP2 = x4.P(((i5) obj2).a());
                        } else {
                            iP2 = x4.P(((Integer) obj2).intValue());
                        }
                        return iP2 + iG1 + i;
                    case 14:
                        ((Integer) obj2).getClass();
                        iP2 = 4;
                        return iP2 + iG1 + i;
                    case 15:
                        ((Long) obj2).getClass();
                        return iP2 + iG1 + i;
                    case 16:
                        int iIntValue5 = ((Integer) obj2).intValue();
                        iP2 = x4.g0((iIntValue5 >> 31) ^ (iIntValue5 + iIntValue5));
                        return iP2 + iG1 + i;
                    case 17:
                        long jLongValue5 = ((Long) obj2).longValue();
                        iP2 = x4.P((jLongValue5 >> 63) ^ (jLongValue5 + jLongValue5));
                        return iP2 + iG1 + i;
                    default:
                        throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                }
            case com.gamericefishpro.space.o4.i.STRING_FIELD_NUMBER /* 5 */:
                ((Long) obj).getClass();
                iP = 8;
                i = iP + iG3;
                iG1 = x4.g0(16);
                if (w6Var2 == w6Var3) {
                    Charset charset7 = n5.a;
                    iG1 += iG1;
                }
                switch (w6Var2.ordinal()) {
                    case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                        ((Double) obj2).getClass();
                        return iP2 + iG1 + i;
                    case 1:
                        ((Float) obj2).getClass();
                        iP2 = 4;
                        return iP2 + iG1 + i;
                    case 2:
                        iP2 = x4.P(((Long) obj2).longValue());
                        return iP2 + iG1 + i;
                    case 3:
                        iP2 = x4.P(((Long) obj2).longValue());
                        return iP2 + iG1 + i;
                    case 4:
                        iP2 = x4.P(((Integer) obj2).intValue());
                        return iP2 + iG1 + i;
                    case com.gamericefishpro.space.o4.i.STRING_FIELD_NUMBER /* 5 */:
                        ((Long) obj2).getClass();
                        return iP2 + iG1 + i;
                    case com.gamericefishpro.space.o4.i.STRING_SET_FIELD_NUMBER /* 6 */:
                        ((Integer) obj2).getClass();
                        iP2 = 4;
                        return iP2 + iG1 + i;
                    case com.gamericefishpro.space.o4.i.DOUBLE_FIELD_NUMBER /* 7 */:
                        ((Boolean) obj2).getClass();
                        iP2 = 1;
                        return iP2 + iG1 + i;
                    case com.gamericefishpro.space.o4.i.BYTES_FIELD_NUMBER /* 8 */:
                        if (obj2 instanceof w4) {
                            iD2 = ((w4) obj2).d();
                            iG2 = x4.g0(iD2);
                            iP2 = iG2 + iD2;
                        } else {
                            iP2 = x4.Q((String) obj2);
                        }
                        return iP2 + iG1 + i;
                    case 9:
                        iP2 = ((g5) ((p4) obj2)).k();
                        return iP2 + iG1 + i;
                    case 10:
                        iD2 = ((g5) ((p4) obj2)).k();
                        iG2 = x4.g0(iD2);
                        iP2 = iG2 + iD2;
                        return iP2 + iG1 + i;
                    case RequestError.STOP_TRACKING /* 11 */:
                        if (obj2 instanceof w4) {
                            iD2 = ((w4) obj2).d();
                            iG2 = x4.g0(iD2);
                        } else {
                            iD2 = ((byte[]) obj2).length;
                            iG2 = x4.g0(iD2);
                        }
                        iP2 = iG2 + iD2;
                        return iP2 + iG1 + i;
                    case 12:
                        iP2 = x4.g0(((Integer) obj2).intValue());
                        return iP2 + iG1 + i;
                    case 13:
                        if (obj2 instanceof i5) {
                            iP2 = x4.P(((i5) obj2).a());
                        } else {
                            iP2 = x4.P(((Integer) obj2).intValue());
                        }
                        return iP2 + iG1 + i;
                    case 14:
                        ((Integer) obj2).getClass();
                        iP2 = 4;
                        return iP2 + iG1 + i;
                    case 15:
                        ((Long) obj2).getClass();
                        return iP2 + iG1 + i;
                    case 16:
                        int iIntValue6 = ((Integer) obj2).intValue();
                        iP2 = x4.g0((iIntValue6 >> 31) ^ (iIntValue6 + iIntValue6));
                        return iP2 + iG1 + i;
                    case 17:
                        long jLongValue6 = ((Long) obj2).longValue();
                        iP2 = x4.P((jLongValue6 >> 63) ^ (jLongValue6 + jLongValue6));
                        return iP2 + iG1 + i;
                    default:
                        throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                }
            case com.gamericefishpro.space.o4.i.STRING_SET_FIELD_NUMBER /* 6 */:
                ((Integer) obj).getClass();
                iP = 4;
                i = iP + iG3;
                iG1 = x4.g0(16);
                if (w6Var2 == w6Var3) {
                    Charset charset8 = n5.a;
                    iG1 += iG1;
                }
                switch (w6Var2.ordinal()) {
                    case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                        ((Double) obj2).getClass();
                        return iP2 + iG1 + i;
                    case 1:
                        ((Float) obj2).getClass();
                        iP2 = 4;
                        return iP2 + iG1 + i;
                    case 2:
                        iP2 = x4.P(((Long) obj2).longValue());
                        return iP2 + iG1 + i;
                    case 3:
                        iP2 = x4.P(((Long) obj2).longValue());
                        return iP2 + iG1 + i;
                    case 4:
                        iP2 = x4.P(((Integer) obj2).intValue());
                        return iP2 + iG1 + i;
                    case com.gamericefishpro.space.o4.i.STRING_FIELD_NUMBER /* 5 */:
                        ((Long) obj2).getClass();
                        return iP2 + iG1 + i;
                    case com.gamericefishpro.space.o4.i.STRING_SET_FIELD_NUMBER /* 6 */:
                        ((Integer) obj2).getClass();
                        iP2 = 4;
                        return iP2 + iG1 + i;
                    case com.gamericefishpro.space.o4.i.DOUBLE_FIELD_NUMBER /* 7 */:
                        ((Boolean) obj2).getClass();
                        iP2 = 1;
                        return iP2 + iG1 + i;
                    case com.gamericefishpro.space.o4.i.BYTES_FIELD_NUMBER /* 8 */:
                        if (obj2 instanceof w4) {
                            iD2 = ((w4) obj2).d();
                            iG2 = x4.g0(iD2);
                            iP2 = iG2 + iD2;
                        } else {
                            iP2 = x4.Q((String) obj2);
                        }
                        return iP2 + iG1 + i;
                    case 9:
                        iP2 = ((g5) ((p4) obj2)).k();
                        return iP2 + iG1 + i;
                    case 10:
                        iD2 = ((g5) ((p4) obj2)).k();
                        iG2 = x4.g0(iD2);
                        iP2 = iG2 + iD2;
                        return iP2 + iG1 + i;
                    case RequestError.STOP_TRACKING /* 11 */:
                        if (obj2 instanceof w4) {
                            iD2 = ((w4) obj2).d();
                            iG2 = x4.g0(iD2);
                        } else {
                            iD2 = ((byte[]) obj2).length;
                            iG2 = x4.g0(iD2);
                        }
                        iP2 = iG2 + iD2;
                        return iP2 + iG1 + i;
                    case 12:
                        iP2 = x4.g0(((Integer) obj2).intValue());
                        return iP2 + iG1 + i;
                    case 13:
                        if (obj2 instanceof i5) {
                            iP2 = x4.P(((i5) obj2).a());
                        } else {
                            iP2 = x4.P(((Integer) obj2).intValue());
                        }
                        return iP2 + iG1 + i;
                    case 14:
                        ((Integer) obj2).getClass();
                        iP2 = 4;
                        return iP2 + iG1 + i;
                    case 15:
                        ((Long) obj2).getClass();
                        return iP2 + iG1 + i;
                    case 16:
                        int iIntValue7 = ((Integer) obj2).intValue();
                        iP2 = x4.g0((iIntValue7 >> 31) ^ (iIntValue7 + iIntValue7));
                        return iP2 + iG1 + i;
                    case 17:
                        long jLongValue7 = ((Long) obj2).longValue();
                        iP2 = x4.P((jLongValue7 >> 63) ^ (jLongValue7 + jLongValue7));
                        return iP2 + iG1 + i;
                    default:
                        throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                }
            case com.gamericefishpro.space.o4.i.DOUBLE_FIELD_NUMBER /* 7 */:
                ((Boolean) obj).getClass();
                iP = 1;
                i = iP + iG3;
                iG1 = x4.g0(16);
                if (w6Var2 == w6Var3) {
                    Charset charset9 = n5.a;
                    iG1 += iG1;
                }
                switch (w6Var2.ordinal()) {
                    case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                        ((Double) obj2).getClass();
                        return iP2 + iG1 + i;
                    case 1:
                        ((Float) obj2).getClass();
                        iP2 = 4;
                        return iP2 + iG1 + i;
                    case 2:
                        iP2 = x4.P(((Long) obj2).longValue());
                        return iP2 + iG1 + i;
                    case 3:
                        iP2 = x4.P(((Long) obj2).longValue());
                        return iP2 + iG1 + i;
                    case 4:
                        iP2 = x4.P(((Integer) obj2).intValue());
                        return iP2 + iG1 + i;
                    case com.gamericefishpro.space.o4.i.STRING_FIELD_NUMBER /* 5 */:
                        ((Long) obj2).getClass();
                        return iP2 + iG1 + i;
                    case com.gamericefishpro.space.o4.i.STRING_SET_FIELD_NUMBER /* 6 */:
                        ((Integer) obj2).getClass();
                        iP2 = 4;
                        return iP2 + iG1 + i;
                    case com.gamericefishpro.space.o4.i.DOUBLE_FIELD_NUMBER /* 7 */:
                        ((Boolean) obj2).getClass();
                        iP2 = 1;
                        return iP2 + iG1 + i;
                    case com.gamericefishpro.space.o4.i.BYTES_FIELD_NUMBER /* 8 */:
                        if (obj2 instanceof w4) {
                            iD2 = ((w4) obj2).d();
                            iG2 = x4.g0(iD2);
                            iP2 = iG2 + iD2;
                        } else {
                            iP2 = x4.Q((String) obj2);
                        }
                        return iP2 + iG1 + i;
                    case 9:
                        iP2 = ((g5) ((p4) obj2)).k();
                        return iP2 + iG1 + i;
                    case 10:
                        iD2 = ((g5) ((p4) obj2)).k();
                        iG2 = x4.g0(iD2);
                        iP2 = iG2 + iD2;
                        return iP2 + iG1 + i;
                    case RequestError.STOP_TRACKING /* 11 */:
                        if (obj2 instanceof w4) {
                            iD2 = ((w4) obj2).d();
                            iG2 = x4.g0(iD2);
                        } else {
                            iD2 = ((byte[]) obj2).length;
                            iG2 = x4.g0(iD2);
                        }
                        iP2 = iG2 + iD2;
                        return iP2 + iG1 + i;
                    case 12:
                        iP2 = x4.g0(((Integer) obj2).intValue());
                        return iP2 + iG1 + i;
                    case 13:
                        if (obj2 instanceof i5) {
                            iP2 = x4.P(((i5) obj2).a());
                        } else {
                            iP2 = x4.P(((Integer) obj2).intValue());
                        }
                        return iP2 + iG1 + i;
                    case 14:
                        ((Integer) obj2).getClass();
                        iP2 = 4;
                        return iP2 + iG1 + i;
                    case 15:
                        ((Long) obj2).getClass();
                        return iP2 + iG1 + i;
                    case 16:
                        int iIntValue8 = ((Integer) obj2).intValue();
                        iP2 = x4.g0((iIntValue8 >> 31) ^ (iIntValue8 + iIntValue8));
                        return iP2 + iG1 + i;
                    case 17:
                        long jLongValue8 = ((Long) obj2).longValue();
                        iP2 = x4.P((jLongValue8 >> 63) ^ (jLongValue8 + jLongValue8));
                        return iP2 + iG1 + i;
                    default:
                        throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                }
            case com.gamericefishpro.space.o4.i.BYTES_FIELD_NUMBER /* 8 */:
                if (obj instanceof w4) {
                    iD = ((w4) obj).d();
                    iG0 = x4.g0(iD);
                    iP = iD + iG0;
                } else {
                    iP = x4.Q((String) obj);
                }
                i = iP + iG3;
                iG1 = x4.g0(16);
                if (w6Var2 == w6Var3) {
                    Charset charset10 = n5.a;
                    iG1 += iG1;
                }
                switch (w6Var2.ordinal()) {
                    case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                        ((Double) obj2).getClass();
                        return iP2 + iG1 + i;
                    case 1:
                        ((Float) obj2).getClass();
                        iP2 = 4;
                        return iP2 + iG1 + i;
                    case 2:
                        iP2 = x4.P(((Long) obj2).longValue());
                        return iP2 + iG1 + i;
                    case 3:
                        iP2 = x4.P(((Long) obj2).longValue());
                        return iP2 + iG1 + i;
                    case 4:
                        iP2 = x4.P(((Integer) obj2).intValue());
                        return iP2 + iG1 + i;
                    case com.gamericefishpro.space.o4.i.STRING_FIELD_NUMBER /* 5 */:
                        ((Long) obj2).getClass();
                        return iP2 + iG1 + i;
                    case com.gamericefishpro.space.o4.i.STRING_SET_FIELD_NUMBER /* 6 */:
                        ((Integer) obj2).getClass();
                        iP2 = 4;
                        return iP2 + iG1 + i;
                    case com.gamericefishpro.space.o4.i.DOUBLE_FIELD_NUMBER /* 7 */:
                        ((Boolean) obj2).getClass();
                        iP2 = 1;
                        return iP2 + iG1 + i;
                    case com.gamericefishpro.space.o4.i.BYTES_FIELD_NUMBER /* 8 */:
                        if (obj2 instanceof w4) {
                            iD2 = ((w4) obj2).d();
                            iG2 = x4.g0(iD2);
                            iP2 = iG2 + iD2;
                        } else {
                            iP2 = x4.Q((String) obj2);
                        }
                        return iP2 + iG1 + i;
                    case 9:
                        iP2 = ((g5) ((p4) obj2)).k();
                        return iP2 + iG1 + i;
                    case 10:
                        iD2 = ((g5) ((p4) obj2)).k();
                        iG2 = x4.g0(iD2);
                        iP2 = iG2 + iD2;
                        return iP2 + iG1 + i;
                    case RequestError.STOP_TRACKING /* 11 */:
                        if (obj2 instanceof w4) {
                            iD2 = ((w4) obj2).d();
                            iG2 = x4.g0(iD2);
                        } else {
                            iD2 = ((byte[]) obj2).length;
                            iG2 = x4.g0(iD2);
                        }
                        iP2 = iG2 + iD2;
                        return iP2 + iG1 + i;
                    case 12:
                        iP2 = x4.g0(((Integer) obj2).intValue());
                        return iP2 + iG1 + i;
                    case 13:
                        if (obj2 instanceof i5) {
                            iP2 = x4.P(((i5) obj2).a());
                        } else {
                            iP2 = x4.P(((Integer) obj2).intValue());
                        }
                        return iP2 + iG1 + i;
                    case 14:
                        ((Integer) obj2).getClass();
                        iP2 = 4;
                        return iP2 + iG1 + i;
                    case 15:
                        ((Long) obj2).getClass();
                        return iP2 + iG1 + i;
                    case 16:
                        int iIntValue9 = ((Integer) obj2).intValue();
                        iP2 = x4.g0((iIntValue9 >> 31) ^ (iIntValue9 + iIntValue9));
                        return iP2 + iG1 + i;
                    case 17:
                        long jLongValue9 = ((Long) obj2).longValue();
                        iP2 = x4.P((jLongValue9 >> 63) ^ (jLongValue9 + jLongValue9));
                        return iP2 + iG1 + i;
                    default:
                        throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                }
            case 9:
                iP = ((g5) ((p4) obj)).k();
                i = iP + iG3;
                iG1 = x4.g0(16);
                if (w6Var2 == w6Var3) {
                    Charset charset11 = n5.a;
                    iG1 += iG1;
                }
                switch (w6Var2.ordinal()) {
                    case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                        ((Double) obj2).getClass();
                        return iP2 + iG1 + i;
                    case 1:
                        ((Float) obj2).getClass();
                        iP2 = 4;
                        return iP2 + iG1 + i;
                    case 2:
                        iP2 = x4.P(((Long) obj2).longValue());
                        return iP2 + iG1 + i;
                    case 3:
                        iP2 = x4.P(((Long) obj2).longValue());
                        return iP2 + iG1 + i;
                    case 4:
                        iP2 = x4.P(((Integer) obj2).intValue());
                        return iP2 + iG1 + i;
                    case com.gamericefishpro.space.o4.i.STRING_FIELD_NUMBER /* 5 */:
                        ((Long) obj2).getClass();
                        return iP2 + iG1 + i;
                    case com.gamericefishpro.space.o4.i.STRING_SET_FIELD_NUMBER /* 6 */:
                        ((Integer) obj2).getClass();
                        iP2 = 4;
                        return iP2 + iG1 + i;
                    case com.gamericefishpro.space.o4.i.DOUBLE_FIELD_NUMBER /* 7 */:
                        ((Boolean) obj2).getClass();
                        iP2 = 1;
                        return iP2 + iG1 + i;
                    case com.gamericefishpro.space.o4.i.BYTES_FIELD_NUMBER /* 8 */:
                        if (obj2 instanceof w4) {
                            iD2 = ((w4) obj2).d();
                            iG2 = x4.g0(iD2);
                            iP2 = iG2 + iD2;
                        } else {
                            iP2 = x4.Q((String) obj2);
                        }
                        return iP2 + iG1 + i;
                    case 9:
                        iP2 = ((g5) ((p4) obj2)).k();
                        return iP2 + iG1 + i;
                    case 10:
                        iD2 = ((g5) ((p4) obj2)).k();
                        iG2 = x4.g0(iD2);
                        iP2 = iG2 + iD2;
                        return iP2 + iG1 + i;
                    case RequestError.STOP_TRACKING /* 11 */:
                        if (obj2 instanceof w4) {
                            iD2 = ((w4) obj2).d();
                            iG2 = x4.g0(iD2);
                        } else {
                            iD2 = ((byte[]) obj2).length;
                            iG2 = x4.g0(iD2);
                        }
                        iP2 = iG2 + iD2;
                        return iP2 + iG1 + i;
                    case 12:
                        iP2 = x4.g0(((Integer) obj2).intValue());
                        return iP2 + iG1 + i;
                    case 13:
                        if (obj2 instanceof i5) {
                            iP2 = x4.P(((i5) obj2).a());
                        } else {
                            iP2 = x4.P(((Integer) obj2).intValue());
                        }
                        return iP2 + iG1 + i;
                    case 14:
                        ((Integer) obj2).getClass();
                        iP2 = 4;
                        return iP2 + iG1 + i;
                    case 15:
                        ((Long) obj2).getClass();
                        return iP2 + iG1 + i;
                    case 16:
                        int iIntValue10 = ((Integer) obj2).intValue();
                        iP2 = x4.g0((iIntValue10 >> 31) ^ (iIntValue10 + iIntValue10));
                        return iP2 + iG1 + i;
                    case 17:
                        long jLongValue10 = ((Long) obj2).longValue();
                        iP2 = x4.P((jLongValue10 >> 63) ^ (jLongValue10 + jLongValue10));
                        return iP2 + iG1 + i;
                    default:
                        throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                }
            case 10:
                iD = ((g5) ((p4) obj)).k();
                iG0 = x4.g0(iD);
                iP = iD + iG0;
                i = iP + iG3;
                iG1 = x4.g0(16);
                if (w6Var2 == w6Var3) {
                    Charset charset12 = n5.a;
                    iG1 += iG1;
                }
                switch (w6Var2.ordinal()) {
                    case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                        ((Double) obj2).getClass();
                        return iP2 + iG1 + i;
                    case 1:
                        ((Float) obj2).getClass();
                        iP2 = 4;
                        return iP2 + iG1 + i;
                    case 2:
                        iP2 = x4.P(((Long) obj2).longValue());
                        return iP2 + iG1 + i;
                    case 3:
                        iP2 = x4.P(((Long) obj2).longValue());
                        return iP2 + iG1 + i;
                    case 4:
                        iP2 = x4.P(((Integer) obj2).intValue());
                        return iP2 + iG1 + i;
                    case com.gamericefishpro.space.o4.i.STRING_FIELD_NUMBER /* 5 */:
                        ((Long) obj2).getClass();
                        return iP2 + iG1 + i;
                    case com.gamericefishpro.space.o4.i.STRING_SET_FIELD_NUMBER /* 6 */:
                        ((Integer) obj2).getClass();
                        iP2 = 4;
                        return iP2 + iG1 + i;
                    case com.gamericefishpro.space.o4.i.DOUBLE_FIELD_NUMBER /* 7 */:
                        ((Boolean) obj2).getClass();
                        iP2 = 1;
                        return iP2 + iG1 + i;
                    case com.gamericefishpro.space.o4.i.BYTES_FIELD_NUMBER /* 8 */:
                        if (obj2 instanceof w4) {
                            iD2 = ((w4) obj2).d();
                            iG2 = x4.g0(iD2);
                            iP2 = iG2 + iD2;
                        } else {
                            iP2 = x4.Q((String) obj2);
                        }
                        return iP2 + iG1 + i;
                    case 9:
                        iP2 = ((g5) ((p4) obj2)).k();
                        return iP2 + iG1 + i;
                    case 10:
                        iD2 = ((g5) ((p4) obj2)).k();
                        iG2 = x4.g0(iD2);
                        iP2 = iG2 + iD2;
                        return iP2 + iG1 + i;
                    case RequestError.STOP_TRACKING /* 11 */:
                        if (obj2 instanceof w4) {
                            iD2 = ((w4) obj2).d();
                            iG2 = x4.g0(iD2);
                        } else {
                            iD2 = ((byte[]) obj2).length;
                            iG2 = x4.g0(iD2);
                        }
                        iP2 = iG2 + iD2;
                        return iP2 + iG1 + i;
                    case 12:
                        iP2 = x4.g0(((Integer) obj2).intValue());
                        return iP2 + iG1 + i;
                    case 13:
                        if (obj2 instanceof i5) {
                            iP2 = x4.P(((i5) obj2).a());
                        } else {
                            iP2 = x4.P(((Integer) obj2).intValue());
                        }
                        return iP2 + iG1 + i;
                    case 14:
                        ((Integer) obj2).getClass();
                        iP2 = 4;
                        return iP2 + iG1 + i;
                    case 15:
                        ((Long) obj2).getClass();
                        return iP2 + iG1 + i;
                    case 16:
                        int iIntValue11 = ((Integer) obj2).intValue();
                        iP2 = x4.g0((iIntValue11 >> 31) ^ (iIntValue11 + iIntValue11));
                        return iP2 + iG1 + i;
                    case 17:
                        long jLongValue11 = ((Long) obj2).longValue();
                        iP2 = x4.P((jLongValue11 >> 63) ^ (jLongValue11 + jLongValue11));
                        return iP2 + iG1 + i;
                    default:
                        throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                }
            case RequestError.STOP_TRACKING /* 11 */:
                if (obj instanceof w4) {
                    iD = ((w4) obj).d();
                    iG0 = x4.g0(iD);
                } else {
                    iD = ((byte[]) obj).length;
                    iG0 = x4.g0(iD);
                }
                iP = iD + iG0;
                i = iP + iG3;
                iG1 = x4.g0(16);
                if (w6Var2 == w6Var3) {
                    Charset charset13 = n5.a;
                    iG1 += iG1;
                }
                switch (w6Var2.ordinal()) {
                    case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                        ((Double) obj2).getClass();
                        return iP2 + iG1 + i;
                    case 1:
                        ((Float) obj2).getClass();
                        iP2 = 4;
                        return iP2 + iG1 + i;
                    case 2:
                        iP2 = x4.P(((Long) obj2).longValue());
                        return iP2 + iG1 + i;
                    case 3:
                        iP2 = x4.P(((Long) obj2).longValue());
                        return iP2 + iG1 + i;
                    case 4:
                        iP2 = x4.P(((Integer) obj2).intValue());
                        return iP2 + iG1 + i;
                    case com.gamericefishpro.space.o4.i.STRING_FIELD_NUMBER /* 5 */:
                        ((Long) obj2).getClass();
                        return iP2 + iG1 + i;
                    case com.gamericefishpro.space.o4.i.STRING_SET_FIELD_NUMBER /* 6 */:
                        ((Integer) obj2).getClass();
                        iP2 = 4;
                        return iP2 + iG1 + i;
                    case com.gamericefishpro.space.o4.i.DOUBLE_FIELD_NUMBER /* 7 */:
                        ((Boolean) obj2).getClass();
                        iP2 = 1;
                        return iP2 + iG1 + i;
                    case com.gamericefishpro.space.o4.i.BYTES_FIELD_NUMBER /* 8 */:
                        if (obj2 instanceof w4) {
                            iD2 = ((w4) obj2).d();
                            iG2 = x4.g0(iD2);
                            iP2 = iG2 + iD2;
                        } else {
                            iP2 = x4.Q((String) obj2);
                        }
                        return iP2 + iG1 + i;
                    case 9:
                        iP2 = ((g5) ((p4) obj2)).k();
                        return iP2 + iG1 + i;
                    case 10:
                        iD2 = ((g5) ((p4) obj2)).k();
                        iG2 = x4.g0(iD2);
                        iP2 = iG2 + iD2;
                        return iP2 + iG1 + i;
                    case RequestError.STOP_TRACKING /* 11 */:
                        if (obj2 instanceof w4) {
                            iD2 = ((w4) obj2).d();
                            iG2 = x4.g0(iD2);
                        } else {
                            iD2 = ((byte[]) obj2).length;
                            iG2 = x4.g0(iD2);
                        }
                        iP2 = iG2 + iD2;
                        return iP2 + iG1 + i;
                    case 12:
                        iP2 = x4.g0(((Integer) obj2).intValue());
                        return iP2 + iG1 + i;
                    case 13:
                        if (obj2 instanceof i5) {
                            iP2 = x4.P(((i5) obj2).a());
                        } else {
                            iP2 = x4.P(((Integer) obj2).intValue());
                        }
                        return iP2 + iG1 + i;
                    case 14:
                        ((Integer) obj2).getClass();
                        iP2 = 4;
                        return iP2 + iG1 + i;
                    case 15:
                        ((Long) obj2).getClass();
                        return iP2 + iG1 + i;
                    case 16:
                        int iIntValue12 = ((Integer) obj2).intValue();
                        iP2 = x4.g0((iIntValue12 >> 31) ^ (iIntValue12 + iIntValue12));
                        return iP2 + iG1 + i;
                    case 17:
                        long jLongValue12 = ((Long) obj2).longValue();
                        iP2 = x4.P((jLongValue12 >> 63) ^ (jLongValue12 + jLongValue12));
                        return iP2 + iG1 + i;
                    default:
                        throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                }
            case 12:
                iP = x4.g0(((Integer) obj).intValue());
                i = iP + iG3;
                iG1 = x4.g0(16);
                if (w6Var2 == w6Var3) {
                    Charset charset14 = n5.a;
                    iG1 += iG1;
                }
                switch (w6Var2.ordinal()) {
                    case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                        ((Double) obj2).getClass();
                        return iP2 + iG1 + i;
                    case 1:
                        ((Float) obj2).getClass();
                        iP2 = 4;
                        return iP2 + iG1 + i;
                    case 2:
                        iP2 = x4.P(((Long) obj2).longValue());
                        return iP2 + iG1 + i;
                    case 3:
                        iP2 = x4.P(((Long) obj2).longValue());
                        return iP2 + iG1 + i;
                    case 4:
                        iP2 = x4.P(((Integer) obj2).intValue());
                        return iP2 + iG1 + i;
                    case com.gamericefishpro.space.o4.i.STRING_FIELD_NUMBER /* 5 */:
                        ((Long) obj2).getClass();
                        return iP2 + iG1 + i;
                    case com.gamericefishpro.space.o4.i.STRING_SET_FIELD_NUMBER /* 6 */:
                        ((Integer) obj2).getClass();
                        iP2 = 4;
                        return iP2 + iG1 + i;
                    case com.gamericefishpro.space.o4.i.DOUBLE_FIELD_NUMBER /* 7 */:
                        ((Boolean) obj2).getClass();
                        iP2 = 1;
                        return iP2 + iG1 + i;
                    case com.gamericefishpro.space.o4.i.BYTES_FIELD_NUMBER /* 8 */:
                        if (obj2 instanceof w4) {
                            iD2 = ((w4) obj2).d();
                            iG2 = x4.g0(iD2);
                            iP2 = iG2 + iD2;
                        } else {
                            iP2 = x4.Q((String) obj2);
                        }
                        return iP2 + iG1 + i;
                    case 9:
                        iP2 = ((g5) ((p4) obj2)).k();
                        return iP2 + iG1 + i;
                    case 10:
                        iD2 = ((g5) ((p4) obj2)).k();
                        iG2 = x4.g0(iD2);
                        iP2 = iG2 + iD2;
                        return iP2 + iG1 + i;
                    case RequestError.STOP_TRACKING /* 11 */:
                        if (obj2 instanceof w4) {
                            iD2 = ((w4) obj2).d();
                            iG2 = x4.g0(iD2);
                        } else {
                            iD2 = ((byte[]) obj2).length;
                            iG2 = x4.g0(iD2);
                        }
                        iP2 = iG2 + iD2;
                        return iP2 + iG1 + i;
                    case 12:
                        iP2 = x4.g0(((Integer) obj2).intValue());
                        return iP2 + iG1 + i;
                    case 13:
                        if (obj2 instanceof i5) {
                            iP2 = x4.P(((i5) obj2).a());
                        } else {
                            iP2 = x4.P(((Integer) obj2).intValue());
                        }
                        return iP2 + iG1 + i;
                    case 14:
                        ((Integer) obj2).getClass();
                        iP2 = 4;
                        return iP2 + iG1 + i;
                    case 15:
                        ((Long) obj2).getClass();
                        return iP2 + iG1 + i;
                    case 16:
                        int iIntValue13 = ((Integer) obj2).intValue();
                        iP2 = x4.g0((iIntValue13 >> 31) ^ (iIntValue13 + iIntValue13));
                        return iP2 + iG1 + i;
                    case 17:
                        long jLongValue13 = ((Long) obj2).longValue();
                        iP2 = x4.P((jLongValue13 >> 63) ^ (jLongValue13 + jLongValue13));
                        return iP2 + iG1 + i;
                    default:
                        throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                }
            case 13:
                iP = obj instanceof i5 ? x4.P(((i5) obj).a()) : x4.P(((Integer) obj).intValue());
                i = iP + iG3;
                iG1 = x4.g0(16);
                if (w6Var2 == w6Var3) {
                    Charset charset15 = n5.a;
                    iG1 += iG1;
                }
                switch (w6Var2.ordinal()) {
                    case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                        ((Double) obj2).getClass();
                        return iP2 + iG1 + i;
                    case 1:
                        ((Float) obj2).getClass();
                        iP2 = 4;
                        return iP2 + iG1 + i;
                    case 2:
                        iP2 = x4.P(((Long) obj2).longValue());
                        return iP2 + iG1 + i;
                    case 3:
                        iP2 = x4.P(((Long) obj2).longValue());
                        return iP2 + iG1 + i;
                    case 4:
                        iP2 = x4.P(((Integer) obj2).intValue());
                        return iP2 + iG1 + i;
                    case com.gamericefishpro.space.o4.i.STRING_FIELD_NUMBER /* 5 */:
                        ((Long) obj2).getClass();
                        return iP2 + iG1 + i;
                    case com.gamericefishpro.space.o4.i.STRING_SET_FIELD_NUMBER /* 6 */:
                        ((Integer) obj2).getClass();
                        iP2 = 4;
                        return iP2 + iG1 + i;
                    case com.gamericefishpro.space.o4.i.DOUBLE_FIELD_NUMBER /* 7 */:
                        ((Boolean) obj2).getClass();
                        iP2 = 1;
                        return iP2 + iG1 + i;
                    case com.gamericefishpro.space.o4.i.BYTES_FIELD_NUMBER /* 8 */:
                        if (obj2 instanceof w4) {
                            iD2 = ((w4) obj2).d();
                            iG2 = x4.g0(iD2);
                            iP2 = iG2 + iD2;
                        } else {
                            iP2 = x4.Q((String) obj2);
                        }
                        return iP2 + iG1 + i;
                    case 9:
                        iP2 = ((g5) ((p4) obj2)).k();
                        return iP2 + iG1 + i;
                    case 10:
                        iD2 = ((g5) ((p4) obj2)).k();
                        iG2 = x4.g0(iD2);
                        iP2 = iG2 + iD2;
                        return iP2 + iG1 + i;
                    case RequestError.STOP_TRACKING /* 11 */:
                        if (obj2 instanceof w4) {
                            iD2 = ((w4) obj2).d();
                            iG2 = x4.g0(iD2);
                        } else {
                            iD2 = ((byte[]) obj2).length;
                            iG2 = x4.g0(iD2);
                        }
                        iP2 = iG2 + iD2;
                        return iP2 + iG1 + i;
                    case 12:
                        iP2 = x4.g0(((Integer) obj2).intValue());
                        return iP2 + iG1 + i;
                    case 13:
                        if (obj2 instanceof i5) {
                            iP2 = x4.P(((i5) obj2).a());
                        } else {
                            iP2 = x4.P(((Integer) obj2).intValue());
                        }
                        return iP2 + iG1 + i;
                    case 14:
                        ((Integer) obj2).getClass();
                        iP2 = 4;
                        return iP2 + iG1 + i;
                    case 15:
                        ((Long) obj2).getClass();
                        return iP2 + iG1 + i;
                    case 16:
                        int iIntValue14 = ((Integer) obj2).intValue();
                        iP2 = x4.g0((iIntValue14 >> 31) ^ (iIntValue14 + iIntValue14));
                        return iP2 + iG1 + i;
                    case 17:
                        long jLongValue14 = ((Long) obj2).longValue();
                        iP2 = x4.P((jLongValue14 >> 63) ^ (jLongValue14 + jLongValue14));
                        return iP2 + iG1 + i;
                    default:
                        throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                }
            case 14:
                ((Integer) obj).getClass();
                iP = 4;
                i = iP + iG3;
                iG1 = x4.g0(16);
                if (w6Var2 == w6Var3) {
                    Charset charset16 = n5.a;
                    iG1 += iG1;
                }
                switch (w6Var2.ordinal()) {
                    case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                        ((Double) obj2).getClass();
                        return iP2 + iG1 + i;
                    case 1:
                        ((Float) obj2).getClass();
                        iP2 = 4;
                        return iP2 + iG1 + i;
                    case 2:
                        iP2 = x4.P(((Long) obj2).longValue());
                        return iP2 + iG1 + i;
                    case 3:
                        iP2 = x4.P(((Long) obj2).longValue());
                        return iP2 + iG1 + i;
                    case 4:
                        iP2 = x4.P(((Integer) obj2).intValue());
                        return iP2 + iG1 + i;
                    case com.gamericefishpro.space.o4.i.STRING_FIELD_NUMBER /* 5 */:
                        ((Long) obj2).getClass();
                        return iP2 + iG1 + i;
                    case com.gamericefishpro.space.o4.i.STRING_SET_FIELD_NUMBER /* 6 */:
                        ((Integer) obj2).getClass();
                        iP2 = 4;
                        return iP2 + iG1 + i;
                    case com.gamericefishpro.space.o4.i.DOUBLE_FIELD_NUMBER /* 7 */:
                        ((Boolean) obj2).getClass();
                        iP2 = 1;
                        return iP2 + iG1 + i;
                    case com.gamericefishpro.space.o4.i.BYTES_FIELD_NUMBER /* 8 */:
                        if (obj2 instanceof w4) {
                            iD2 = ((w4) obj2).d();
                            iG2 = x4.g0(iD2);
                            iP2 = iG2 + iD2;
                        } else {
                            iP2 = x4.Q((String) obj2);
                        }
                        return iP2 + iG1 + i;
                    case 9:
                        iP2 = ((g5) ((p4) obj2)).k();
                        return iP2 + iG1 + i;
                    case 10:
                        iD2 = ((g5) ((p4) obj2)).k();
                        iG2 = x4.g0(iD2);
                        iP2 = iG2 + iD2;
                        return iP2 + iG1 + i;
                    case RequestError.STOP_TRACKING /* 11 */:
                        if (obj2 instanceof w4) {
                            iD2 = ((w4) obj2).d();
                            iG2 = x4.g0(iD2);
                        } else {
                            iD2 = ((byte[]) obj2).length;
                            iG2 = x4.g0(iD2);
                        }
                        iP2 = iG2 + iD2;
                        return iP2 + iG1 + i;
                    case 12:
                        iP2 = x4.g0(((Integer) obj2).intValue());
                        return iP2 + iG1 + i;
                    case 13:
                        if (obj2 instanceof i5) {
                            iP2 = x4.P(((i5) obj2).a());
                        } else {
                            iP2 = x4.P(((Integer) obj2).intValue());
                        }
                        return iP2 + iG1 + i;
                    case 14:
                        ((Integer) obj2).getClass();
                        iP2 = 4;
                        return iP2 + iG1 + i;
                    case 15:
                        ((Long) obj2).getClass();
                        return iP2 + iG1 + i;
                    case 16:
                        int iIntValue15 = ((Integer) obj2).intValue();
                        iP2 = x4.g0((iIntValue15 >> 31) ^ (iIntValue15 + iIntValue15));
                        return iP2 + iG1 + i;
                    case 17:
                        long jLongValue15 = ((Long) obj2).longValue();
                        iP2 = x4.P((jLongValue15 >> 63) ^ (jLongValue15 + jLongValue15));
                        return iP2 + iG1 + i;
                    default:
                        throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                }
            case 15:
                ((Long) obj).getClass();
                iP = 8;
                i = iP + iG3;
                iG1 = x4.g0(16);
                if (w6Var2 == w6Var3) {
                    Charset charset17 = n5.a;
                    iG1 += iG1;
                }
                switch (w6Var2.ordinal()) {
                    case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                        ((Double) obj2).getClass();
                        return iP2 + iG1 + i;
                    case 1:
                        ((Float) obj2).getClass();
                        iP2 = 4;
                        return iP2 + iG1 + i;
                    case 2:
                        iP2 = x4.P(((Long) obj2).longValue());
                        return iP2 + iG1 + i;
                    case 3:
                        iP2 = x4.P(((Long) obj2).longValue());
                        return iP2 + iG1 + i;
                    case 4:
                        iP2 = x4.P(((Integer) obj2).intValue());
                        return iP2 + iG1 + i;
                    case com.gamericefishpro.space.o4.i.STRING_FIELD_NUMBER /* 5 */:
                        ((Long) obj2).getClass();
                        return iP2 + iG1 + i;
                    case com.gamericefishpro.space.o4.i.STRING_SET_FIELD_NUMBER /* 6 */:
                        ((Integer) obj2).getClass();
                        iP2 = 4;
                        return iP2 + iG1 + i;
                    case com.gamericefishpro.space.o4.i.DOUBLE_FIELD_NUMBER /* 7 */:
                        ((Boolean) obj2).getClass();
                        iP2 = 1;
                        return iP2 + iG1 + i;
                    case com.gamericefishpro.space.o4.i.BYTES_FIELD_NUMBER /* 8 */:
                        if (obj2 instanceof w4) {
                            iD2 = ((w4) obj2).d();
                            iG2 = x4.g0(iD2);
                            iP2 = iG2 + iD2;
                        } else {
                            iP2 = x4.Q((String) obj2);
                        }
                        return iP2 + iG1 + i;
                    case 9:
                        iP2 = ((g5) ((p4) obj2)).k();
                        return iP2 + iG1 + i;
                    case 10:
                        iD2 = ((g5) ((p4) obj2)).k();
                        iG2 = x4.g0(iD2);
                        iP2 = iG2 + iD2;
                        return iP2 + iG1 + i;
                    case RequestError.STOP_TRACKING /* 11 */:
                        if (obj2 instanceof w4) {
                            iD2 = ((w4) obj2).d();
                            iG2 = x4.g0(iD2);
                        } else {
                            iD2 = ((byte[]) obj2).length;
                            iG2 = x4.g0(iD2);
                        }
                        iP2 = iG2 + iD2;
                        return iP2 + iG1 + i;
                    case 12:
                        iP2 = x4.g0(((Integer) obj2).intValue());
                        return iP2 + iG1 + i;
                    case 13:
                        if (obj2 instanceof i5) {
                            iP2 = x4.P(((i5) obj2).a());
                        } else {
                            iP2 = x4.P(((Integer) obj2).intValue());
                        }
                        return iP2 + iG1 + i;
                    case 14:
                        ((Integer) obj2).getClass();
                        iP2 = 4;
                        return iP2 + iG1 + i;
                    case 15:
                        ((Long) obj2).getClass();
                        return iP2 + iG1 + i;
                    case 16:
                        int iIntValue16 = ((Integer) obj2).intValue();
                        iP2 = x4.g0((iIntValue16 >> 31) ^ (iIntValue16 + iIntValue16));
                        return iP2 + iG1 + i;
                    case 17:
                        long jLongValue16 = ((Long) obj2).longValue();
                        iP2 = x4.P((jLongValue16 >> 63) ^ (jLongValue16 + jLongValue16));
                        return iP2 + iG1 + i;
                    default:
                        throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                }
            case 16:
                int iIntValue17 = ((Integer) obj).intValue();
                iP = x4.g0((iIntValue17 >> 31) ^ (iIntValue17 + iIntValue17));
                i = iP + iG3;
                iG1 = x4.g0(16);
                if (w6Var2 == w6Var3) {
                    Charset charset18 = n5.a;
                    iG1 += iG1;
                }
                switch (w6Var2.ordinal()) {
                    case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                        ((Double) obj2).getClass();
                        return iP2 + iG1 + i;
                    case 1:
                        ((Float) obj2).getClass();
                        iP2 = 4;
                        return iP2 + iG1 + i;
                    case 2:
                        iP2 = x4.P(((Long) obj2).longValue());
                        return iP2 + iG1 + i;
                    case 3:
                        iP2 = x4.P(((Long) obj2).longValue());
                        return iP2 + iG1 + i;
                    case 4:
                        iP2 = x4.P(((Integer) obj2).intValue());
                        return iP2 + iG1 + i;
                    case com.gamericefishpro.space.o4.i.STRING_FIELD_NUMBER /* 5 */:
                        ((Long) obj2).getClass();
                        return iP2 + iG1 + i;
                    case com.gamericefishpro.space.o4.i.STRING_SET_FIELD_NUMBER /* 6 */:
                        ((Integer) obj2).getClass();
                        iP2 = 4;
                        return iP2 + iG1 + i;
                    case com.gamericefishpro.space.o4.i.DOUBLE_FIELD_NUMBER /* 7 */:
                        ((Boolean) obj2).getClass();
                        iP2 = 1;
                        return iP2 + iG1 + i;
                    case com.gamericefishpro.space.o4.i.BYTES_FIELD_NUMBER /* 8 */:
                        if (obj2 instanceof w4) {
                            iD2 = ((w4) obj2).d();
                            iG2 = x4.g0(iD2);
                            iP2 = iG2 + iD2;
                        } else {
                            iP2 = x4.Q((String) obj2);
                        }
                        return iP2 + iG1 + i;
                    case 9:
                        iP2 = ((g5) ((p4) obj2)).k();
                        return iP2 + iG1 + i;
                    case 10:
                        iD2 = ((g5) ((p4) obj2)).k();
                        iG2 = x4.g0(iD2);
                        iP2 = iG2 + iD2;
                        return iP2 + iG1 + i;
                    case RequestError.STOP_TRACKING /* 11 */:
                        if (obj2 instanceof w4) {
                            iD2 = ((w4) obj2).d();
                            iG2 = x4.g0(iD2);
                        } else {
                            iD2 = ((byte[]) obj2).length;
                            iG2 = x4.g0(iD2);
                        }
                        iP2 = iG2 + iD2;
                        return iP2 + iG1 + i;
                    case 12:
                        iP2 = x4.g0(((Integer) obj2).intValue());
                        return iP2 + iG1 + i;
                    case 13:
                        if (obj2 instanceof i5) {
                            iP2 = x4.P(((i5) obj2).a());
                        } else {
                            iP2 = x4.P(((Integer) obj2).intValue());
                        }
                        return iP2 + iG1 + i;
                    case 14:
                        ((Integer) obj2).getClass();
                        iP2 = 4;
                        return iP2 + iG1 + i;
                    case 15:
                        ((Long) obj2).getClass();
                        return iP2 + iG1 + i;
                    case 16:
                        int iIntValue18 = ((Integer) obj2).intValue();
                        iP2 = x4.g0((iIntValue18 >> 31) ^ (iIntValue18 + iIntValue18));
                        return iP2 + iG1 + i;
                    case 17:
                        long jLongValue17 = ((Long) obj2).longValue();
                        iP2 = x4.P((jLongValue17 >> 63) ^ (jLongValue17 + jLongValue17));
                        return iP2 + iG1 + i;
                    default:
                        throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                }
            case 17:
                long jLongValue18 = ((Long) obj).longValue();
                iP = x4.P((jLongValue18 >> 63) ^ (jLongValue18 + jLongValue18));
                i = iP + iG3;
                iG1 = x4.g0(16);
                if (w6Var2 == w6Var3) {
                    Charset charset19 = n5.a;
                    iG1 += iG1;
                }
                switch (w6Var2.ordinal()) {
                    case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                        ((Double) obj2).getClass();
                        return iP2 + iG1 + i;
                    case 1:
                        ((Float) obj2).getClass();
                        iP2 = 4;
                        return iP2 + iG1 + i;
                    case 2:
                        iP2 = x4.P(((Long) obj2).longValue());
                        return iP2 + iG1 + i;
                    case 3:
                        iP2 = x4.P(((Long) obj2).longValue());
                        return iP2 + iG1 + i;
                    case 4:
                        iP2 = x4.P(((Integer) obj2).intValue());
                        return iP2 + iG1 + i;
                    case com.gamericefishpro.space.o4.i.STRING_FIELD_NUMBER /* 5 */:
                        ((Long) obj2).getClass();
                        return iP2 + iG1 + i;
                    case com.gamericefishpro.space.o4.i.STRING_SET_FIELD_NUMBER /* 6 */:
                        ((Integer) obj2).getClass();
                        iP2 = 4;
                        return iP2 + iG1 + i;
                    case com.gamericefishpro.space.o4.i.DOUBLE_FIELD_NUMBER /* 7 */:
                        ((Boolean) obj2).getClass();
                        iP2 = 1;
                        return iP2 + iG1 + i;
                    case com.gamericefishpro.space.o4.i.BYTES_FIELD_NUMBER /* 8 */:
                        if (obj2 instanceof w4) {
                            iD2 = ((w4) obj2).d();
                            iG2 = x4.g0(iD2);
                            iP2 = iG2 + iD2;
                        } else {
                            iP2 = x4.Q((String) obj2);
                        }
                        return iP2 + iG1 + i;
                    case 9:
                        iP2 = ((g5) ((p4) obj2)).k();
                        return iP2 + iG1 + i;
                    case 10:
                        iD2 = ((g5) ((p4) obj2)).k();
                        iG2 = x4.g0(iD2);
                        iP2 = iG2 + iD2;
                        return iP2 + iG1 + i;
                    case RequestError.STOP_TRACKING /* 11 */:
                        if (obj2 instanceof w4) {
                            iD2 = ((w4) obj2).d();
                            iG2 = x4.g0(iD2);
                        } else {
                            iD2 = ((byte[]) obj2).length;
                            iG2 = x4.g0(iD2);
                        }
                        iP2 = iG2 + iD2;
                        return iP2 + iG1 + i;
                    case 12:
                        iP2 = x4.g0(((Integer) obj2).intValue());
                        return iP2 + iG1 + i;
                    case 13:
                        if (obj2 instanceof i5) {
                            iP2 = x4.P(((i5) obj2).a());
                        } else {
                            iP2 = x4.P(((Integer) obj2).intValue());
                        }
                        return iP2 + iG1 + i;
                    case 14:
                        ((Integer) obj2).getClass();
                        iP2 = 4;
                        return iP2 + iG1 + i;
                    case 15:
                        ((Long) obj2).getClass();
                        return iP2 + iG1 + i;
                    case 16:
                        int iIntValue19 = ((Integer) obj2).intValue();
                        iP2 = x4.g0((iIntValue19 >> 31) ^ (iIntValue19 + iIntValue19));
                        return iP2 + iG1 + i;
                    case 17:
                        long jLongValue19 = ((Long) obj2).longValue();
                        iP2 = x4.P((jLongValue19 >> 63) ^ (jLongValue19 + jLongValue19));
                        return iP2 + iG1 + i;
                    default:
                        throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                }
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }
}
