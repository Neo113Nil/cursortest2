package com.gamericefishpro.space.i9;

import com.android.installreferrer.api.InstallReferrerClient;
import com.appsflyer.attribution.RequestError;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class r1 implements j5 {
    public static final r1 b = new r1(0);
    public static final r1 c = new r1(1);
    public static final r1 d = new r1(2);
    public static final r1 e = new r1(3);
    public static final r1 f = new r1(4);
    public static final r1 g = new r1(5);
    public static final r1 h = new r1(6);
    public static final r1 i = new r1(7);
    public static final r1 j = new r1(8);
    public static final r1 k = new r1(9);
    public static final r1 l = new r1(10);
    public static final r1 m = new r1(11);
    public static final r1 n = new r1(12);
    public static final r1 o = new r1(13);
    public final /* synthetic */ int a;

    public /* synthetic */ r1(int i2) {
        this.a = i2;
    }

    @Override // com.gamericefishpro.space.i9.j5
    public final boolean a(int i2) {
        switch (this.a) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return i2 == 0 || i2 == 1 || i2 == 2 || i2 == 3 || i2 == 4;
            case 1:
                switch (i2) {
                    case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case com.gamericefishpro.space.o4.i.STRING_FIELD_NUMBER /* 5 */:
                    case com.gamericefishpro.space.o4.i.STRING_SET_FIELD_NUMBER /* 6 */:
                        return true;
                    default:
                        return false;
                }
            case 2:
                return i2 == 0 || i2 == 1 || i2 == 2;
            case 3:
                return y3.T(i2) != 0;
            case 4:
                return i2 == 0 || i2 == 1 || i2 == 2;
            case com.gamericefishpro.space.o4.i.STRING_FIELD_NUMBER /* 5 */:
                return i2 == 0 || i2 == 1 || i2 == 2 || i2 == 3 || i2 == 4 || i2 == 5;
            case com.gamericefishpro.space.o4.i.STRING_SET_FIELD_NUMBER /* 6 */:
                return i2 == 0 || i2 == 1 || i2 == 2 || i2 == 3 || i2 == 4;
            case com.gamericefishpro.space.o4.i.DOUBLE_FIELD_NUMBER /* 7 */:
                return i2 == 0 || i2 == 1 || i2 == 2;
            case com.gamericefishpro.space.o4.i.BYTES_FIELD_NUMBER /* 8 */:
                return i2 == 0 || i2 == 1;
            case 9:
                return i2 == 1 || i2 == 2;
            case 10:
                return com.gamericefishpro.space.m5.a.a(i2) != 0;
            case RequestError.STOP_TRACKING /* 11 */:
                return i2 == 0 || i2 == 1 || i2 == 2 || i2 == 3 || i2 == 4 || i2 == 5;
            case 12:
                return i2 == 0 || i2 == 1 || i2 == 2 || i2 == 3 || i2 == 4;
            default:
                return i2 == 0 || i2 == 1 || i2 == 2 || i2 == 3 || i2 == 4;
        }
    }
}
