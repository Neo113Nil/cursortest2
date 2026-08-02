package ru.CryptoPro.JCP.math;

import defpackage.iu61;
import defpackage.n;
import defpackage.ny61;
import defpackage.w511;
import java.util.Arrays;
import ru.CryptoPro.JCP.ASN.PKIXCMP.PKIBody;
import ru.CryptoPro.JCP.tools.Array;
import ru.CryptoPro.JCSP.CStructReader.BlobHeaderStructure;
import ru.CryptoPro.reprov.array.DerValue;
import ru.CryptoPro.ssl.Alerts;

/* loaded from: classes4.dex */
public final class a extends EllipticPoint {
    public BigIntr c;
    public BigIntr d;
    public BigIntr e;
    public a[] f;
    public boolean g;
    public boolean h;
    public BigIntr i;
    public BigIntr j;
    public BigIntr k;
    public iu61 l;
    public int m;
    public int n;
    public int o;
    public static final BigIntr p = new BigIntr(new byte[]{-86, 74, -95, -25, -36, 117, 48, -90, 126, -60, Alerts.alert_bad_certificate, 25, 92, -2, 68, -121, 88, -39, Alerts.alert_no_application_protocol, -44, 68, 75, -105, -114, 21, -1, -107, -11, 115, -2, 0, 1});
    public static final BigIntr q = new BigIntr(new byte[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0});
    public static final BigIntr r = new BigIntr(new byte[]{119, 89, Alerts.alert_illegal_parameter, -116, PKIBody._CANN, -59, -25, -84, DerValue.TAG_PRIVATE, -99, 106, -13, -47, DerValue.TAG_CONTEXT, 93, -68, 83, -109, -61, -107, 93, Alerts.alert_user_canceled, -76, 56, 117, 0, 53, 5, -58, DerValue.TAG_CONTEXT, Byte.MAX_VALUE, Byte.MAX_VALUE});
    public static final BigIntr s = new BigIntr(new byte[]{-51, PKIBody._CCR, -114, -92, 52, 79, -73, 6, 66, -39, 63, -38, 117, -126, 24, 53, -5, -71, 74, -63, 24, PKIBody._CCP, 29, -86, 95, 1, -97, PKIBody._CCP, 82, -126, 126, 126});
    public static final BigIntr t = new BigIntr(new byte[]{119, 89, Alerts.alert_illegal_parameter, -116, PKIBody._CANN, -59, -25, -84, DerValue.TAG_PRIVATE, -99, 106, -13, -47, DerValue.TAG_CONTEXT, 93, -68, 83, -109, -61, -107, 93, Alerts.alert_user_canceled, -76, 56, 117, 0, 53, 5, -58, DerValue.TAG_CONTEXT, Byte.MAX_VALUE, Byte.MAX_VALUE});
    public static final BigIntr u = new BigIntr(new byte[]{-54, -18, Alerts.alert_bad_certificate_status_response, 91, -53, -80, 72, -7, -67, 38, DerValue.TAG_PRIVATE, 37, -118, 125, -25, -54, 4, Alerts.alert_protocol_version, -75, 62, -25, -16, -30, 85, -96, -2, 96, -16, -83, 125, -127, -127});
    public static final BigIntr v = new BigIntr(new byte[]{Alerts.alert_bad_certificate_status_response, 18, -3, -35, 73, -78, -78, BlobHeaderStructure.KEXP15_BLOB_VERSION, 30, 91, 92, 31, 75, -51, -102, 109, 26, 9, 69, 81, PKIBody._KRP, -51, 37, -42, 29, 1, 58, -72, 1, 69, 115, -58, 68, PKIBody._KRP, -72, 2, -69, 26, 92, -6, 81, 8, -19, -82, 56, -78, -118, -100, -73, -1, 57, 37, -118, -94, -101, -40, -17, -20, -108, 85, -105, -113, 98, -102});
    public static final BigIntr w = new BigIntr(new byte[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0});
    public static final BigIntr x = new BigIntr(new byte[]{-113, 116, 1, PKIBody._CANN, -37, -90, 38, -17, Alerts.alert_unrecognized_name, -46, 81, Alerts.alert_unrecognized_name, Alerts.alert_user_canceled, -103, Alerts.alert_decode_error, -55, Alerts.alert_bad_certificate_hash_value, 123, 93, 87, 122, 25, -19, 20, Alerts.alert_bad_certificate_status_response, -1, -30, 35, Byte.MAX_VALUE, 93, -58, -100, 93, -6, -93, 126, -94, -14, -47, 2, -41, 123, -119, -88, -29, -90, -70, 49, 36, 0, 99, -19, -70, Alerts.alert_certificate_unknown, -78, 19, -120, -119, 53, 85, 52, -72, -50, -78});
    public static final BigIntr y = new BigIntr(new byte[]{30, 98, 4, Alerts.alert_decrypt_error, -111, -12, 115, -51, 82, 119, -11, Alerts.alert_internal_error, PKIBody._CCP, -52, -105, 91, 88, Alerts.alert_bad_certificate_hash_value, 24, 6, Alerts.alert_certificate_unobtainable, 76, -57, 62, 83, -2, -88, 107, 125, 24, 83, -42, 24, -17, -21, 123, -25, -41, 117, 8, -123, 115, -100, -7, -86, -12, Alerts.alert_illegal_parameter, -107, 108, 0, Alerts.alert_no_certificate, -56, 48, -116, 22, 59, -104, -100, -96, -1, -100, Alerts.alert_handshake_failure, 108, 24});
    public static final BigIntr z = new BigIntr(new byte[]{-113, 116, 1, PKIBody._CANN, -37, -90, 38, -17, Alerts.alert_unrecognized_name, -46, 81, Alerts.alert_unrecognized_name, Alerts.alert_user_canceled, -103, Alerts.alert_decode_error, -55, Alerts.alert_bad_certificate_hash_value, 123, 93, 87, 122, 25, -19, 20, Alerts.alert_bad_certificate_status_response, -1, -30, 35, Byte.MAX_VALUE, 93, -58, -100, 93, -6, -93, 126, -94, -14, -47, 2, -41, 123, -119, -88, -29, -90, -70, 49, 36, 0, 99, -19, -70, Alerts.alert_certificate_unknown, -78, 19, -120, -119, 53, 85, 52, -72, -50, -78});
    public static final BigIntr A = new BigIntr(new byte[]{-87, -101, -5, -52, Alerts.alert_unsupported_extension, PKIBody._KRP, -116, Alerts.alert_decode_error, -83, -120, 10, -81, -16, Alerts.alert_decrypt_error, 104, -92, -89, -115, -25, -7, -112, -77, 56, -63, -84, 1, 87, -108, -126, -25, -84, Alerts.alert_no_certificate, -25, PKIBody._CKUANN, 20, -124, 24, Alerts.alert_handshake_failure, -118, -9, 122, -116, 99, 6, 85, PKIBody._KRP, -48, 106, -109, -1, -42, 55, -49, 115, -23, -60, 103, 99, 95, 0, 99, -41, -109, -25});

    public a(iu61 iu61Var, BigIntr bigIntr, BigIntr bigIntr2, int i) {
        BigIntr bigIntr3;
        BigIntr bigIntr4;
        if (i == 1) {
            bigIntr3 = new BigIntr(bigIntr);
        } else {
            bigIntr3 = new BigIntr(bigIntr);
            bigIntr3 = bigIntr3.euclidInverse(iu61Var.getP());
        }
        if (i == 1) {
            bigIntr4 = new BigIntr(bigIntr2);
        } else {
            bigIntr4 = new BigIntr(bigIntr2);
            bigIntr4 = bigIntr4.euclidInverse(iu61Var.getP());
        }
        this.f = null;
        int intLength = iu61Var.getP().getIntLength();
        this.m = intLength;
        this.n = intLength == 8 ? 4 : 8;
        this.o = intLength != 8 ? 8 : 1;
        this.c = new BigIntr(bigIntr3, intLength);
        this.d = new BigIntr(bigIntr4, intLength);
        this.e = new BigIntr(BigIntr.ONE, intLength);
        BigIntr bigIntr5 = BigIntr.ZERO;
        this.i = new BigIntr(bigIntr5, intLength);
        this.j = new BigIntr(bigIntr5, intLength);
        this.k = new BigIntr(bigIntr5, intLength);
        this.l = iu61Var;
        this.h = false;
        this.g = false;
    }

    public static void b(iu61 iu61Var, BigIntr bigIntr, BigIntr bigIntr2, BigIntr bigIntr3, boolean[] zArr, BigIntr bigIntr4, BigIntr bigIntr5, BigIntr bigIntr6, boolean z2, BigIntr bigIntr7, BigIntr bigIntr8, BigIntr bigIntr9, boolean z3, BigIntr bigIntr10, BigIntr bigIntr11, BigIntr bigIntr12, BigIntr bigIntr13, BigIntr bigIntr14, BigIntr bigIntr15, BigIntr bigIntr16, BigIntr bigIntr17, long[] jArr) {
        if (z2) {
            bigIntr.setMag(bigIntr7);
            bigIntr2.setMag(bigIntr8);
            bigIntr3.setMag(bigIntr9);
            zArr[0] = z3;
            return;
        }
        if (z3) {
            bigIntr.setMag(bigIntr4);
            bigIntr2.setMag(bigIntr5);
            bigIntr3.setMag(bigIntr6);
            zArr[0] = z2;
            return;
        }
        BigIntr p2 = iu61Var.getP();
        int optFlag = iu61Var.getOptFlag();
        p2.getIntLength();
        zArr[0] = false;
        BigIntr.e(bigIntr11, bigIntr6, bigIntr9, p2, optFlag, jArr);
        BigIntr.c(bigIntr12, bigIntr11, p2, optFlag, jArr);
        BigIntr.e(bigIntr12, bigIntr12, iu61Var.f, p2, optFlag, jArr);
        BigIntr.e(bigIntr13, bigIntr4, bigIntr7, p2, optFlag, jArr);
        BigIntr.e(bigIntr14, bigIntr5, bigIntr8, p2, optFlag, jArr);
        BigIntr.e(bigIntr15, bigIntr13, bigIntr14, p2, optFlag, jArr);
        if (iu61Var.e > 0) {
            BigIntr.d(bigIntr16, bigIntr13, bigIntr14, p2);
        } else {
            BigIntr.i(bigIntr16, bigIntr13, bigIntr14, p2);
        }
        BigIntr.i(bigIntr17, bigIntr4, bigIntr5, p2);
        BigIntr.i(bigIntr10, bigIntr7, bigIntr8, p2);
        BigIntr.e(bigIntr17, bigIntr17, bigIntr10, p2, optFlag, jArr);
        BigIntr.d(bigIntr17, bigIntr17, bigIntr13, p2);
        BigIntr.d(bigIntr17, bigIntr17, bigIntr14, p2);
        bigIntr.setMag(bigIntr15);
        BigIntr.i(bigIntr, bigIntr, bigIntr12, p2);
        BigIntr.e(bigIntr, bigIntr, bigIntr16, p2, optFlag, jArr);
        bigIntr2.setMag(bigIntr15);
        BigIntr.d(bigIntr2, bigIntr2, bigIntr12, p2);
        BigIntr.e(bigIntr2, bigIntr2, bigIntr17, p2, optFlag, jArr);
        bigIntr3.setMag(bigIntr11);
        BigIntr.e(bigIntr3, bigIntr3, bigIntr16, p2, optFlag, jArr);
        BigIntr.e(bigIntr3, bigIntr3, bigIntr17, p2, optFlag, jArr);
        if (bigIntr3.isZero()) {
            zArr[0] = true;
        }
    }

    public static void c(iu61 iu61Var, BigIntr bigIntr, BigIntr bigIntr2, BigIntr bigIntr3, boolean[] zArr, BigIntr bigIntr4, BigIntr bigIntr5, BigIntr bigIntr6, boolean z2, long[] jArr, BigIntr bigIntr7, BigIntr bigIntr8, BigIntr bigIntr9, BigIntr bigIntr10, BigIntr bigIntr11) {
        if (z2) {
            zArr[0] = true;
            return;
        }
        zArr[0] = false;
        BigIntr p2 = iu61Var.getP();
        int i = iu61Var.e;
        int optFlag = iu61Var.getOptFlag();
        p2.getIntLength();
        BigIntr.c(bigIntr7, bigIntr4, p2, optFlag, jArr);
        BigIntr.c(bigIntr8, bigIntr5, p2, optFlag, jArr);
        if (i > 0) {
            BigIntr.i(bigIntr9, bigIntr7, bigIntr8, p2);
            BigIntr.d(bigIntr10, bigIntr7, bigIntr8, p2);
        } else {
            BigIntr.d(bigIntr9, bigIntr7, bigIntr8, p2);
            BigIntr.i(bigIntr10, bigIntr7, bigIntr8, p2);
        }
        BigIntr.i(bigIntr11, bigIntr4, bigIntr5, p2);
        BigIntr.c(bigIntr11, bigIntr11, p2, optFlag, jArr);
        if (i > 0) {
            BigIntr.d(bigIntr11, bigIntr11, bigIntr9, p2);
        } else {
            BigIntr.d(bigIntr11, bigIntr11, bigIntr10, p2);
        }
        BigIntr.e(bigIntr, bigIntr9, bigIntr10, p2, optFlag, jArr);
        BigIntr.c(bigIntr2, bigIntr6, p2, optFlag, jArr);
        BigIntr.b(bigIntr2, bigIntr2, p2);
        BigIntr.e(bigIntr2, bigIntr2, iu61Var.f, p2, optFlag, jArr);
        BigIntr.d(bigIntr2, bigIntr9, bigIntr2, p2);
        BigIntr.e(bigIntr2, bigIntr2, bigIntr11, p2, optFlag, jArr);
        BigIntr.e(bigIntr3, bigIntr10, bigIntr11, p2, optFlag, jArr);
    }

    public static void d(BigIntr bigIntr, BigIntr bigIntr2) {
        if ((bigIntr.equals(p) && bigIntr2.equals(q)) || ((bigIntr.equals(r) && bigIntr2.equals(s)) || ((bigIntr.equals(t) && bigIntr2.equals(u)) || ((bigIntr.equals(v) && bigIntr2.equals(w)) || ((bigIntr.equals(x) && bigIntr2.equals(y)) || (bigIntr.equals(z) && bigIntr2.equals(A))))))) {
            w511.w("Invalid point");
        }
    }

    public final void a() {
        int i = this.m;
        long[] jArr = new long[(i * 2) + 1];
        BigIntr bigIntr = new BigIntr(BigIntr.ZERO, i);
        iu61 iu61Var = this.l;
        BigIntr p2 = iu61Var.getP();
        int optFlag = iu61Var.getOptFlag();
        BigIntr.e(bigIntr, iu61Var.h, this.k, p2, optFlag, jArr);
        BigIntr bigIntr2 = this.e;
        BigIntr.d(bigIntr2, this.i, bigIntr, p2);
        BigIntr.e(bigIntr, iu61Var.g, this.k, p2, optFlag, jArr);
        BigIntr.i(this.d, bigIntr2, bigIntr, p2);
        BigIntr bigIntr3 = this.d;
        BigIntr.e(bigIntr3, this.e, bigIntr3, p2, optFlag, jArr);
        BigIntr.d(this.c, bigIntr2, bigIntr, p2);
        BigIntr bigIntr4 = this.e;
        BigIntr.e(bigIntr4, bigIntr4, this.c, p2, optFlag, jArr);
        BigIntr bigIntr5 = this.c;
        BigIntr.e(bigIntr5, bigIntr5, this.j, p2, optFlag, jArr);
        bigIntr.clear();
        Array.clear(jArr);
    }

    @Override // ru.CryptoPro.JCP.math.EllipticPoint
    public final EllipticPoint add(EllipticPoint ellipticPoint) {
        BigIntr bigIntr;
        a aVar;
        BigIntr bigIntr2;
        BigIntr bigIntr3 = this.d;
        BigIntr bigIntr4 = this.c;
        iu61 iu61Var = this.l;
        int i = this.m;
        if (!(ellipticPoint instanceof a)) {
            ny61.g("Wrong point type");
            return null;
        }
        a aVar2 = (a) ellipticPoint;
        if (this.g) {
            return new a(aVar2);
        }
        if (aVar2.g) {
            return new a(this);
        }
        long[] jArr = new long[(i * 2) + 1];
        BigIntr p2 = iu61Var.getP();
        int optFlag = iu61Var.getOptFlag();
        BigIntr bigIntr5 = new BigIntr(this.e, i);
        BigIntr.e(bigIntr5, bigIntr5, aVar2.e, p2, optFlag, jArr);
        BigIntr bigIntr6 = new BigIntr(bigIntr5, i);
        BigIntr.c(bigIntr6, bigIntr6, p2, optFlag, jArr);
        BigIntr.e(bigIntr6, bigIntr6, iu61Var.f, p2, optFlag, jArr);
        BigIntr bigIntr7 = new BigIntr(bigIntr4, i);
        BigIntr.e(bigIntr7, bigIntr7, aVar2.c, p2, optFlag, jArr);
        BigIntr bigIntr8 = new BigIntr(bigIntr3, i);
        BigIntr.e(bigIntr8, bigIntr8, aVar2.d, p2, optFlag, jArr);
        BigIntr bigIntr9 = new BigIntr(bigIntr7, i);
        BigIntr.e(bigIntr9, bigIntr9, bigIntr8, p2, optFlag, jArr);
        BigIntr bigIntr10 = new BigIntr(bigIntr8, i);
        if (iu61Var.e > 0) {
            BigIntr.d(bigIntr10, bigIntr7, bigIntr10, p2);
        } else {
            BigIntr.i(bigIntr10, bigIntr7, bigIntr10, p2);
        }
        BigIntr bigIntr11 = new BigIntr(bigIntr4, i);
        BigIntr.i(bigIntr11, bigIntr11, bigIntr3, p2);
        BigIntr bigIntr12 = new BigIntr(aVar2.c, i);
        BigIntr.i(bigIntr12, bigIntr12, aVar2.d, p2);
        BigIntr.e(bigIntr11, bigIntr11, bigIntr12, p2, optFlag, jArr);
        BigIntr.d(bigIntr11, bigIntr11, bigIntr7, p2);
        BigIntr.d(bigIntr11, bigIntr11, bigIntr8, p2);
        BigIntr.i(bigIntr7, bigIntr9, bigIntr6, p2);
        BigIntr.e(bigIntr7, bigIntr7, bigIntr10, p2, optFlag, jArr);
        BigIntr.d(bigIntr9, bigIntr9, bigIntr6, p2);
        BigIntr.e(bigIntr9, bigIntr9, bigIntr11, p2, optFlag, jArr);
        BigIntr.e(bigIntr5, bigIntr5, bigIntr10, p2, optFlag, jArr);
        BigIntr.e(bigIntr5, bigIntr5, bigIntr11, p2, optFlag, jArr);
        boolean isZero = bigIntr5.isZero();
        iu61 iu61Var2 = this.l;
        if (isZero) {
            aVar = new a(iu61Var2);
            bigIntr = bigIntr6;
            bigIntr2 = bigIntr8;
        } else {
            bigIntr = bigIntr6;
            bigIntr2 = bigIntr8;
            aVar = new a(iu61Var2, bigIntr7, bigIntr9, bigIntr5, true);
        }
        bigIntr.clear();
        bigIntr2.clear();
        bigIntr10.clear();
        bigIntr11.clear();
        bigIntr12.clear();
        Array.clear(jArr);
        return aVar;
    }

    @Override // ru.CryptoPro.JCP.math.EllipticPoint
    public final boolean equals(EllipticPoint ellipticPoint) {
        int i = this.m;
        iu61 iu61Var = this.l;
        if (!(ellipticPoint instanceof a)) {
            ny61.g("Wrong point type");
            return false;
        }
        a aVar = (a) ellipticPoint;
        long[] jArr = new long[(i * 2) + 1];
        BigIntr bigIntr = new BigIntr(i);
        BigIntr bigIntr2 = new BigIntr(i);
        BigIntr.e(bigIntr, aVar.c, this.e, iu61Var.getP(), iu61Var.getOptFlag(), jArr);
        BigIntr.e(bigIntr2, this.c, aVar.e, iu61Var.getP(), iu61Var.getOptFlag(), jArr);
        if (!bigIntr.equals(bigIntr2)) {
            return false;
        }
        BigIntr.e(bigIntr, aVar.d, this.e, iu61Var.getP(), iu61Var.getOptFlag(), jArr);
        BigIntr.e(bigIntr2, this.d, aVar.e, iu61Var.getP(), iu61Var.getOptFlag(), jArr);
        return bigIntr.equals(bigIntr2);
    }

    @Override // ru.CryptoPro.JCP.math.EllipticPoint
    public final EllipticPoint generateTable() {
        iu61 iu61Var;
        int i;
        a[] aVarArr;
        int i2;
        BigIntr bigIntr;
        int i3;
        BigIntr bigIntr2;
        BigIntr bigIntr3;
        a aVar;
        BigIntr bigIntr4 = BigIntr.ZERO;
        int i4 = this.m;
        BigIntr bigIntr5 = new BigIntr(bigIntr4, i4);
        BigIntr bigIntr6 = new BigIntr(bigIntr4, i4);
        BigIntr bigIntr7 = new BigIntr(bigIntr4, i4);
        BigIntr bigIntr8 = new BigIntr(bigIntr4, i4);
        BigIntr bigIntr9 = new BigIntr(bigIntr4, i4);
        long[] jArr = new long[(i4 * 2) + 1];
        int i5 = this.n;
        int i6 = ((i4 << 5) / i5) + 1;
        BigIntr bigIntr10 = new BigIntr(i4);
        a[] aVarArr2 = new a[i6 << 1];
        this.f = aVarArr2;
        aVarArr2[0] = new a(this.l, this.c, this.d, this.e, false);
        iu61 iu61Var2 = this.l;
        BigIntr.d(bigIntr10, iu61Var2.getP(), this.c, iu61Var2.getP());
        BigIntr bigIntr11 = bigIntr10;
        this.f[i6] = new a(this.l, bigIntr11, this.d, this.e, false);
        int i7 = 1;
        while (i7 < i6) {
            a[] aVarArr3 = this.f;
            iu61 iu61Var3 = this.l;
            a aVar2 = aVarArr3[i7 - 1];
            aVarArr3[i7] = new a(iu61Var3, aVar2.c, aVar2.d, aVar2.e, false);
            int i8 = 0;
            while (i8 < i5) {
                a[] aVarArr4 = this.f;
                a aVar3 = aVarArr4[i7];
                BigIntr bigIntr12 = aVar3.d;
                BigIntr bigIntr13 = aVar3.c;
                int i9 = i6;
                boolean z2 = aVar3.g;
                iu61 iu61Var4 = aVar3.l;
                if (z2) {
                    aVar = new a(iu61Var4);
                    bigIntr = bigIntr5;
                    iu61Var = iu61Var2;
                    i = i8;
                    aVarArr = aVarArr4;
                    bigIntr3 = bigIntr9;
                    i2 = i5;
                    i3 = i7;
                    bigIntr2 = bigIntr11;
                } else {
                    BigIntr p2 = iu61Var4.getP();
                    iu61Var = iu61Var2;
                    int i10 = iu61Var4.e;
                    int optFlag = iu61Var4.getOptFlag();
                    BigIntr.c(bigIntr5, bigIntr13, p2, optFlag, jArr);
                    BigIntr.c(bigIntr6, bigIntr12, p2, optFlag, jArr);
                    if (i10 > 0) {
                        BigIntr.i(bigIntr7, bigIntr5, bigIntr6, p2);
                    } else {
                        BigIntr.d(bigIntr7, bigIntr5, bigIntr6, p2);
                    }
                    if (i10 > 0) {
                        BigIntr.d(bigIntr8, bigIntr5, bigIntr6, p2);
                    } else {
                        BigIntr.i(bigIntr8, bigIntr5, bigIntr6, p2);
                    }
                    BigIntr.i(bigIntr9, bigIntr13, bigIntr12, p2);
                    BigIntr.c(bigIntr9, bigIntr9, p2, optFlag, jArr);
                    if (i10 > 0) {
                        BigIntr.d(bigIntr9, bigIntr9, bigIntr7, p2);
                    } else {
                        BigIntr.d(bigIntr9, bigIntr9, bigIntr8, p2);
                    }
                    int i11 = i8;
                    BigIntr bigIntr14 = new BigIntr(bigIntr7);
                    i = i11;
                    aVarArr = aVarArr4;
                    long[] jArr2 = jArr;
                    BigIntr.e(bigIntr14, bigIntr14, bigIntr8, p2, optFlag, jArr2);
                    i2 = i5;
                    bigIntr = bigIntr5;
                    BigIntr bigIntr15 = new BigIntr(aVar3.e);
                    BigIntr.c(bigIntr15, bigIntr15, p2, optFlag, jArr2);
                    BigIntr.b(bigIntr15, bigIntr15, p2);
                    BigIntr bigIntr16 = iu61Var4.f;
                    i3 = i7;
                    bigIntr2 = bigIntr11;
                    BigIntr.e(bigIntr15, bigIntr15, bigIntr16, p2, optFlag, jArr2);
                    BigIntr.d(bigIntr15, bigIntr7, bigIntr15, p2);
                    jArr = jArr2;
                    bigIntr3 = bigIntr9;
                    BigIntr.e(bigIntr15, bigIntr15, bigIntr3, p2, optFlag, jArr);
                    BigIntr bigIntr17 = new BigIntr(bigIntr8);
                    BigIntr.e(bigIntr17, bigIntr17, bigIntr3, p2, optFlag, jArr);
                    aVar = new a(aVar3.l, bigIntr14, bigIntr15, bigIntr17, false);
                }
                aVarArr[i3] = aVar;
                i8 = i + 1;
                bigIntr11 = bigIntr2;
                i7 = i3;
                i5 = i2;
                bigIntr9 = bigIntr3;
                i6 = i9;
                iu61Var2 = iu61Var;
                bigIntr5 = bigIntr;
            }
            int i12 = i6;
            iu61 iu61Var5 = iu61Var2;
            int i13 = i7;
            BigIntr.d(bigIntr11, iu61Var5.getP(), this.f[i13].c, iu61Var5.getP());
            a[] aVarArr5 = this.f;
            iu61 iu61Var6 = this.l;
            a aVar4 = aVarArr5[i13];
            aVarArr5[i13 + i12] = new a(iu61Var6, bigIntr11, aVar4.d, aVar4.e, false);
            i7 = i13 + 1;
            bigIntr9 = bigIntr9;
            i6 = i12;
            iu61Var2 = iu61Var5;
            bigIntr5 = bigIntr5;
        }
        bigIntr11.clear();
        return this;
    }

    @Override // ru.CryptoPro.JCP.math.EllipticPoint
    public final int getCurveType() {
        return 1;
    }

    @Override // ru.CryptoPro.JCP.math.EllipticPoint
    public final BigIntr getU() {
        return this.c;
    }

    @Override // ru.CryptoPro.JCP.math.EllipticPoint
    public final BigIntr getV() {
        return this.d;
    }

    @Override // ru.CryptoPro.JCP.math.EllipticPoint
    public final BigIntr getX() {
        if (this.h) {
            return this.i;
        }
        w511.w("Point wasn't transformed to Weierstrass");
        return null;
    }

    @Override // ru.CryptoPro.JCP.math.EllipticPoint
    public final BigIntr getY() {
        if (this.h) {
            return this.j;
        }
        w511.w("Point wasn't transformed to Weierstrass");
        return null;
    }

    @Override // ru.CryptoPro.JCP.math.EllipticPoint
    public final boolean isNull() {
        return this.g;
    }

    @Override // ru.CryptoPro.JCP.math.EllipticPoint
    public final boolean onCurve(EllipticCurve ellipticCurve) {
        int i = this.m;
        if (!(ellipticCurve instanceof iu61)) {
            ny61.g("Wrong curve type");
            return false;
        }
        if (this.g) {
            return true;
        }
        long[] jArr = new long[(i * 2) + 1];
        iu61 iu61Var = (iu61) ellipticCurve;
        BigIntr p2 = iu61Var.getP();
        int optFlag = iu61Var.getOptFlag();
        BigIntr bigIntr = BigIntr.ZERO;
        BigIntr bigIntr2 = new BigIntr(bigIntr, i);
        BigIntr bigIntr3 = new BigIntr(bigIntr, i);
        BigIntr bigIntr4 = new BigIntr(bigIntr, i);
        BigIntr bigIntr5 = new BigIntr(bigIntr, i);
        BigIntr.c(bigIntr3, this.c, p2, optFlag, jArr);
        BigIntr.c(bigIntr4, this.d, p2, optFlag, jArr);
        BigIntr.c(bigIntr5, this.e, p2, optFlag, jArr);
        BigIntr bigIntr6 = new BigIntr(bigIntr4, i);
        BigIntr bigIntr7 = new BigIntr(bigIntr3, i);
        if (iu61Var.e > 0) {
            BigIntr.i(bigIntr7, bigIntr7, bigIntr4, p2);
        } else {
            BigIntr.d(bigIntr7, bigIntr7, bigIntr4, p2);
        }
        BigIntr.e(bigIntr7, bigIntr7, bigIntr5, p2, optFlag, jArr);
        BigIntr.e(bigIntr6, bigIntr6, bigIntr3, p2, optFlag, jArr);
        BigIntr.c(bigIntr2, bigIntr5, p2, optFlag, jArr);
        BigIntr.e(bigIntr2, bigIntr2, this.l.f, p2, optFlag, jArr);
        BigIntr.i(bigIntr2, bigIntr2, bigIntr6, p2);
        return bigIntr7.equals(bigIntr2);
    }

    @Override // ru.CryptoPro.JCP.math.EllipticPoint
    public final EllipticPoint powerHEX(BigIntr bigIntr, boolean z2) {
        int i;
        int i2;
        BigIntr bigIntr2;
        BigIntr bigIntr3;
        int i3;
        int[] iArr;
        a[] aVarArr;
        BigIntr bigIntr4;
        iu61 iu61Var;
        int[] iArr2;
        BigIntr bigIntr5;
        boolean[] zArr;
        BigIntr bigIntr6;
        a aVar = this;
        iu61 iu61Var2 = aVar.l;
        int i4 = aVar.m;
        long[] jArr = new long[(i4 * 2) + 1];
        if (aVar.g) {
            return new a(iu61Var2);
        }
        BigIntr bigIntr7 = BigIntr.ZERO;
        BigIntr bigIntr8 = new BigIntr(bigIntr7, i4);
        BigIntr bigIntr9 = new BigIntr(bigIntr7, i4);
        BigIntr bigIntr10 = new BigIntr(bigIntr7, i4);
        BigIntr bigIntr11 = new BigIntr(bigIntr7, i4);
        BigIntr bigIntr12 = new BigIntr(bigIntr7, i4);
        BigIntr bigIntr13 = new BigIntr(bigIntr7, i4);
        BigIntr bigIntr14 = new BigIntr(bigIntr7, i4);
        BigIntr bigIntr15 = bigIntr10;
        BigIntr bigIntr16 = new BigIntr(bigIntr7, i4);
        BigIntr bigIntr17 = bigIntr11;
        BigIntr bigIntr18 = new BigIntr(bigIntr7, i4);
        BigIntr bigIntr19 = bigIntr12;
        BigIntr bigIntr20 = new BigIntr(bigIntr7, i4);
        BigIntr bigIntr21 = new BigIntr(bigIntr7, i4);
        BigIntr bigIntr22 = new BigIntr(bigIntr7, i4);
        BigIntr bigIntr23 = new BigIntr(bigIntr7, i4);
        iu61 iu61Var3 = iu61Var2;
        BigIntr bigIntr24 = bigIntr13;
        boolean[] zArr2 = new boolean[1];
        a[] aVarArr2 = new a[32];
        BigIntr bigIntr25 = new BigIntr(bigIntr7, i4);
        int i5 = 0;
        aVarArr2[0] = new a(aVar.l, aVar.c, aVar.d, aVar.e, false);
        BigIntr bigIntr26 = bigIntr9;
        BigIntr bigIntr27 = bigIntr14;
        BigIntr bigIntr28 = bigIntr21;
        BigIntr bigIntr29 = bigIntr22;
        BigIntr bigIntr30 = bigIntr23;
        c(aVar.l, bigIntr16, bigIntr18, bigIntr20, zArr2, aVar.c, aVar.d, aVar.e, aVar.g, jArr, bigIntr8, bigIntr26, bigIntr15, bigIntr17, bigIntr19);
        boolean z3 = zArr2[0];
        int i6 = 1;
        int i7 = 32;
        while (i6 < i7) {
            BigIntr bigIntr31 = bigIntr15;
            boolean z4 = z3;
            iu61 iu61Var4 = aVar.l;
            a aVar2 = aVarArr2[i6 - 1];
            int i8 = i6;
            int i9 = i7;
            int i10 = i5;
            BigIntr bigIntr32 = bigIntr8;
            BigIntr bigIntr33 = bigIntr18;
            BigIntr bigIntr34 = bigIntr30;
            BigIntr bigIntr35 = bigIntr19;
            BigIntr bigIntr36 = bigIntr26;
            BigIntr bigIntr37 = bigIntr20;
            BigIntr bigIntr38 = bigIntr25;
            long[] jArr2 = jArr;
            BigIntr bigIntr39 = bigIntr16;
            BigIntr bigIntr40 = bigIntr29;
            BigIntr bigIntr41 = bigIntr17;
            BigIntr bigIntr42 = bigIntr28;
            b(iu61Var4, bigIntr40, bigIntr34, bigIntr38, zArr2, aVar2.c, aVar2.d, aVar2.e, aVar2.g, bigIntr39, bigIntr33, bigIntr37, z4, bigIntr42, bigIntr32, bigIntr36, bigIntr31, bigIntr41, bigIntr35, bigIntr24, bigIntr27, jArr2);
            bigIntr30 = bigIntr34;
            bigIntr18 = bigIntr33;
            bigIntr8 = bigIntr32;
            bigIntr19 = bigIntr35;
            bigIntr25 = bigIntr38;
            bigIntr20 = bigIntr37;
            bigIntr26 = bigIntr36;
            boolean[] zArr3 = zArr2;
            bigIntr15 = bigIntr31;
            bigIntr17 = bigIntr41;
            BigIntr bigIntr43 = bigIntr24;
            BigIntr bigIntr44 = bigIntr27;
            bigIntr29 = bigIntr40;
            bigIntr16 = bigIntr39;
            jArr = jArr2;
            boolean z5 = zArr3[i10];
            iu61 iu61Var5 = aVar.l;
            if (z5) {
                aVarArr2[i8] = new a(iu61Var5);
            } else {
                a aVar3 = new a(iu61Var5, bigIntr29, bigIntr30, bigIntr25, false);
                bigIntr25 = bigIntr25;
                aVarArr2[i8] = aVar3;
            }
            bigIntr24 = bigIntr43;
            bigIntr27 = bigIntr44;
            bigIntr28 = bigIntr42;
            zArr2 = zArr3;
            z3 = z4;
            i7 = i9;
            i6 = i8 + 1;
            i5 = i10;
        }
        int i11 = i5;
        boolean[] zArr4 = zArr2;
        BigIntr bigIntr45 = bigIntr27;
        BigIntr bigIntr46 = bigIntr28;
        BigIntr bigIntr47 = bigIntr24;
        int[] iArr3 = new int[1];
        int[] iArr4 = new int[80];
        int[] iArr5 = new int[80];
        BigIntr.f(bigIntr, iArr4, iArr5, iArr3);
        int i12 = iArr3[i11];
        BigIntr bigIntr48 = bigIntr20;
        BigIntr bigIntr49 = bigIntr25;
        int i13 = i12;
        boolean z6 = true;
        while (i13 > 0) {
            int i14 = i13 - 1;
            int[] iArr6 = iArr5;
            int i15 = iArr4[i14];
            int i16 = iArr6[i14];
            int i17 = i13 - 1;
            if (i16 > 0) {
                i2 = (i16 - 1) / 2;
                i = i4;
            } else {
                i = i4;
                i2 = ((-i16) - 1) / 2;
            }
            a aVar4 = aVarArr2[i2];
            if (i16 > 0) {
                BigIntr bigIntr50 = bigIntr45;
                long[] jArr3 = jArr;
                BigIntr bigIntr51 = bigIntr49;
                BigIntr bigIntr52 = bigIntr48;
                BigIntr bigIntr53 = bigIntr30;
                BigIntr bigIntr54 = bigIntr19;
                BigIntr bigIntr55 = bigIntr8;
                BigIntr bigIntr56 = bigIntr47;
                int[] iArr7 = iArr4;
                BigIntr bigIntr57 = bigIntr17;
                BigIntr bigIntr58 = bigIntr46;
                boolean[] zArr5 = zArr4;
                BigIntr bigIntr59 = bigIntr29;
                BigIntr bigIntr60 = bigIntr26;
                BigIntr bigIntr61 = bigIntr15;
                b(aVar.l, bigIntr16, bigIntr18, bigIntr52, zArr5, bigIntr59, bigIntr53, bigIntr51, z6, aVar4.c, aVar4.d, aVar4.e, aVar4.g, bigIntr58, bigIntr55, bigIntr60, bigIntr61, bigIntr57, bigIntr54, bigIntr56, bigIntr50, jArr3);
                a[] aVarArr3 = aVarArr2;
                bigIntr2 = bigIntr52;
                bigIntr49 = bigIntr51;
                BigIntr bigIntr62 = bigIntr16;
                bigIntr16 = bigIntr59;
                bigIntr8 = bigIntr55;
                bigIntr26 = bigIntr60;
                bigIntr15 = bigIntr61;
                bigIntr19 = bigIntr54;
                jArr = jArr3;
                bigIntr17 = bigIntr57;
                z6 = zArr5[i11];
                bigIntr3 = bigIntr18;
                bigIntr18 = bigIntr53;
                i3 = i15;
                iArr = iArr7;
                bigIntr6 = bigIntr62;
                aVarArr = aVarArr3;
                bigIntr47 = bigIntr56;
                bigIntr4 = bigIntr50;
                iu61Var = iu61Var3;
                iArr2 = iArr6;
                bigIntr5 = bigIntr58;
                zArr = zArr5;
            } else {
                BigIntr bigIntr63 = bigIntr47;
                BigIntr bigIntr64 = bigIntr45;
                BigIntr bigIntr65 = bigIntr16;
                int[] iArr8 = iArr4;
                bigIntr16 = bigIntr29;
                a[] aVarArr4 = aVarArr2;
                bigIntr2 = bigIntr48;
                bigIntr3 = bigIntr30;
                if (i16 < 0) {
                    BigIntr bigIntr66 = aVar4.c;
                    BigIntr bigIntr67 = aVar4.d;
                    BigIntr bigIntr68 = aVar4.e;
                    boolean z7 = aVar4.g;
                    if (z7) {
                        bigIntr65.setMag(bigIntr16);
                        bigIntr18.setMag(bigIntr3);
                        bigIntr2.setMag(bigIntr49);
                        zArr4[i11] = z6;
                        i3 = i15;
                        bigIntr6 = bigIntr65;
                        iArr = iArr8;
                        aVarArr = aVarArr4;
                        bigIntr47 = bigIntr63;
                        bigIntr4 = bigIntr64;
                        iu61Var = iu61Var3;
                        iArr2 = iArr6;
                        bigIntr5 = bigIntr46;
                        zArr = zArr4;
                    } else {
                        BigIntr.d(bigIntr8, iu61Var3.getP(), bigIntr66, iu61Var3.getP());
                        if (z6) {
                            bigIntr65.setMag(bigIntr8);
                            bigIntr18.setMag(bigIntr67);
                            bigIntr2.setMag(bigIntr68);
                            zArr4[i11] = z7;
                            i3 = i15;
                            bigIntr6 = bigIntr65;
                            iArr = iArr8;
                            bigIntr16 = bigIntr16;
                            bigIntr47 = bigIntr63;
                            bigIntr4 = bigIntr64;
                            iu61Var = iu61Var3;
                            iArr2 = iArr6;
                            bigIntr5 = bigIntr46;
                            zArr = zArr4;
                            aVarArr = aVarArr4;
                        } else {
                            bigIntr6 = bigIntr65;
                            boolean[] zArr6 = zArr4;
                            BigIntr bigIntr69 = bigIntr18;
                            long[] jArr4 = jArr;
                            BigIntr bigIntr70 = bigIntr46;
                            i3 = i15;
                            iArr = iArr8;
                            bigIntr16 = bigIntr16;
                            iu61Var = iu61Var3;
                            iArr2 = iArr6;
                            aVarArr = aVarArr4;
                            b(iu61Var, bigIntr6, bigIntr69, bigIntr2, zArr6, bigIntr16, bigIntr3, bigIntr49, z6, new BigIntr(bigIntr8, iu61Var3.getP().getIntLength()), bigIntr67, bigIntr68, z7, bigIntr70, bigIntr8, bigIntr26, bigIntr15, bigIntr17, bigIntr19, bigIntr63, bigIntr64, jArr4);
                            zArr = zArr6;
                            bigIntr3 = bigIntr3;
                            bigIntr5 = bigIntr70;
                            bigIntr4 = bigIntr64;
                            jArr = jArr4;
                            bigIntr18 = bigIntr69;
                            bigIntr47 = bigIntr63;
                        }
                    }
                    z6 = zArr[i11];
                    BigIntr bigIntr71 = bigIntr3;
                    bigIntr3 = bigIntr18;
                    bigIntr18 = bigIntr71;
                } else {
                    i3 = i15;
                    iArr = iArr8;
                    aVarArr = aVarArr4;
                    bigIntr47 = bigIntr63;
                    bigIntr4 = bigIntr64;
                    iu61Var = iu61Var3;
                    iArr2 = iArr6;
                    bigIntr5 = bigIntr46;
                    zArr = zArr4;
                    bigIntr16 = bigIntr65;
                    bigIntr6 = bigIntr16;
                    BigIntr bigIntr72 = bigIntr49;
                    bigIntr49 = bigIntr2;
                    bigIntr2 = bigIntr72;
                }
            }
            BigIntr bigIntr73 = bigIntr6;
            BigIntr bigIntr74 = bigIntr2;
            int i18 = i11;
            while (i18 < i3) {
                c(this.l, bigIntr16, bigIntr18, bigIntr49, zArr, bigIntr73, bigIntr3, bigIntr74, z6, jArr, bigIntr8, bigIntr26, bigIntr15, bigIntr17, bigIntr19);
                z6 = zArr[i11];
                i18++;
                BigIntr bigIntr75 = bigIntr73;
                bigIntr73 = bigIntr16;
                bigIntr16 = bigIntr75;
                BigIntr bigIntr76 = bigIntr3;
                bigIntr3 = bigIntr18;
                bigIntr18 = bigIntr76;
                BigIntr bigIntr77 = bigIntr74;
                bigIntr74 = bigIntr49;
                bigIntr49 = bigIntr77;
            }
            aVar = this;
            bigIntr29 = bigIntr73;
            aVarArr2 = aVarArr;
            bigIntr45 = bigIntr4;
            i13 = i17;
            i4 = i;
            zArr4 = zArr;
            bigIntr30 = bigIntr3;
            bigIntr46 = bigIntr5;
            iu61Var3 = iu61Var;
            bigIntr48 = bigIntr49;
            bigIntr49 = bigIntr74;
            iArr4 = iArr;
            iArr5 = iArr2;
        }
        int[] iArr9 = iArr5;
        int i19 = i4;
        BigIntr bigIntr78 = bigIntr45;
        BigIntr bigIntr79 = bigIntr16;
        BigIntr bigIntr80 = bigIntr46;
        boolean[] zArr7 = zArr4;
        BigIntr bigIntr81 = bigIntr48;
        int[] iArr10 = iArr4;
        BigIntr bigIntr82 = bigIntr29;
        BigIntr bigIntr83 = bigIntr30;
        iu61 iu61Var6 = aVar.l;
        a aVar5 = z6 ? new a(iu61Var6) : new a(iu61Var6, bigIntr82, bigIntr83, bigIntr49, true);
        if (z2) {
            aVar5.toZ1();
        }
        Arrays.fill(jArr, i11, (i19 * 2) + 1, 0L);
        Arrays.fill(iArr9, i11);
        Arrays.fill(iArr10, i11);
        bigIntr8.clear();
        bigIntr26.clear();
        bigIntr15.clear();
        bigIntr17.clear();
        bigIntr19.clear();
        bigIntr47.clear();
        bigIntr78.clear();
        bigIntr79.clear();
        bigIntr18.clear();
        bigIntr81.clear();
        bigIntr80.clear();
        zArr7[0] = false;
        return aVar5;
    }

    @Override // ru.CryptoPro.JCP.math.EllipticPoint
    public final EllipticPoint powerTAB(BigIntr bigIntr, boolean z2) {
        int i;
        BigIntr bigIntr2;
        int[] iArr;
        int[] iArr2;
        BigIntr bigIntr3;
        BigIntr bigIntr4;
        BigIntr bigIntr5;
        BigIntr bigIntr6;
        long[] jArr;
        BigIntr bigIntr7;
        long j;
        BigIntr bigIntr8;
        BigIntr bigIntr9;
        BigIntr bigIntr10;
        BigIntr bigIntr11;
        BigIntr bigIntr12;
        BigIntr bigIntr13;
        BigIntr bigIntr14;
        BigIntr bigIntr15;
        BigIntr bigIntr16;
        BigIntr bigIntr17;
        BigIntr bigIntr18;
        int i2;
        boolean z3;
        BigIntr bigIntr19;
        BigIntr bigIntr20;
        BigIntr bigIntr21;
        BigIntr bigIntr22;
        boolean z4;
        iu61 iu61Var;
        BigIntr bigIntr23;
        a aVar;
        BigIntr bigIntr24;
        BigIntr bigIntr25;
        BigIntr bigIntr26;
        BigIntr bigIntr27;
        BigIntr bigIntr28;
        int i3;
        BigIntr bigIntr29;
        BigIntr bigIntr30;
        BigIntr bigIntr31;
        BigIntr bigIntr32;
        BigIntr bigIntr33;
        int i4;
        int i5;
        int i6;
        BigIntr bigIntr34;
        BigIntr bigIntr35;
        BigIntr bigIntr36;
        BigIntr bigIntr37;
        boolean[] zArr;
        BigIntr bigIntr38;
        int i7;
        BigIntr bigIntr39;
        BigIntr bigIntr40;
        boolean z5;
        BigIntr bigIntr41;
        BigIntr bigIntr42;
        BigIntr bigIntr43;
        int i8;
        int i9;
        BigIntr bigIntr44;
        BigIntr bigIntr45;
        BigIntr bigIntr46;
        BigIntr bigIntr47;
        BigIntr bigIntr48;
        boolean[] zArr2;
        BigIntr bigIntr49;
        BigIntr bigIntr50;
        BigIntr bigIntr51;
        int[] iArr3;
        BigIntr bigIntr52;
        BigIntr bigIntr53;
        BigIntr bigIntr54;
        BigIntr bigIntr55;
        iu61 iu61Var2 = this.l;
        int i10 = this.o;
        int i11 = this.m;
        long[] jArr2 = new long[(i11 * 2) + 1];
        if (this.g) {
            return new a(iu61Var2);
        }
        if (this.f == null) {
            return (a) powerHEX(bigIntr, z2);
        }
        BigIntr bigIntr56 = BigIntr.ZERO;
        BigIntr bigIntr57 = new BigIntr(bigIntr56, i11);
        BigIntr bigIntr58 = new BigIntr(bigIntr56, i11);
        BigIntr bigIntr59 = new BigIntr(bigIntr56, i11);
        BigIntr bigIntr60 = new BigIntr(bigIntr56, i11);
        BigIntr bigIntr61 = new BigIntr(bigIntr56, i11);
        BigIntr bigIntr62 = new BigIntr(bigIntr56, i11);
        BigIntr bigIntr63 = new BigIntr(bigIntr56, i11);
        BigIntr bigIntr64 = new BigIntr(bigIntr56, i11);
        BigIntr bigIntr65 = new BigIntr(bigIntr56, i11);
        BigIntr bigIntr66 = new BigIntr(bigIntr56, i11);
        BigIntr bigIntr67 = new BigIntr(bigIntr56, i11);
        BigIntr bigIntr68 = new BigIntr(bigIntr56, i11);
        BigIntr bigIntr69 = new BigIntr(bigIntr56, i11);
        BigIntr bigIntr70 = new BigIntr(bigIntr56, i11);
        BigIntr bigIntr71 = new BigIntr(bigIntr56, i11);
        BigIntr bigIntr72 = new BigIntr(bigIntr56, i11);
        long[] jArr3 = jArr2;
        BigIntr bigIntr73 = new BigIntr(i11);
        BigIntr bigIntr74 = new BigIntr(i11);
        BigIntr bigIntr75 = bigIntr57;
        BigIntr bigIntr76 = new BigIntr(i11);
        BigIntr bigIntr77 = new BigIntr(bigIntr56, i11);
        BigIntr bigIntr78 = bigIntr61;
        int i12 = ((i11 << 5) / this.n) + 1;
        boolean[] zArr3 = {false};
        BigIntr bigIntr79 = bigIntr77;
        int i13 = 0;
        int[] iArr4 = new int[1];
        int[] g = BigIntr.g(bigIntr, iArr4, i11);
        BigIntr bigIntr80 = bigIntr58;
        BigIntr bigIntr81 = bigIntr59;
        try {
            int i14 = iArr4[0];
            iArr = iArr4;
            bigIntr16 = bigIntr69;
            bigIntr17 = bigIntr71;
            bigIntr18 = bigIntr72;
            i2 = i14 - (i14 % i10);
            z3 = true;
            bigIntr19 = bigIntr67;
            bigIntr20 = bigIntr70;
            bigIntr21 = bigIntr65;
            bigIntr14 = bigIntr64;
            bigIntr15 = bigIntr66;
            bigIntr22 = bigIntr68;
            z4 = true;
        } catch (Throwable th) {
            th = th;
            i = i11;
            bigIntr2 = bigIntr76;
            iArr = iArr4;
            iArr2 = g;
            bigIntr3 = bigIntr60;
            bigIntr4 = bigIntr62;
            bigIntr5 = bigIntr73;
            bigIntr6 = bigIntr75;
            jArr = jArr3;
            bigIntr7 = bigIntr81;
            j = 0;
            bigIntr8 = bigIntr79;
            bigIntr9 = bigIntr63;
            bigIntr10 = bigIntr65;
            bigIntr11 = bigIntr67;
            bigIntr12 = bigIntr68;
            bigIntr13 = bigIntr66;
            bigIntr14 = bigIntr64;
            bigIntr15 = bigIntr69;
        }
        while (true) {
            iu61Var = iu61Var2;
            if (i2 <= 0) {
                break;
            }
            int i15 = i2 + i10;
            i = i11;
            boolean z6 = z4;
            int i16 = i13;
            BigIntr bigIntr82 = bigIntr16;
            int i17 = i16;
            while (i16 < g.length) {
                try {
                    try {
                        int i18 = g[i16];
                        if (i2 > i18 || i18 >= i15) {
                            bigIntr36 = bigIntr14;
                            bigIntr24 = bigIntr21;
                            bigIntr6 = bigIntr75;
                            bigIntr12 = bigIntr22;
                            bigIntr30 = bigIntr79;
                            bigIntr7 = bigIntr81;
                            bigIntr28 = bigIntr60;
                            bigIntr9 = bigIntr63;
                            bigIntr37 = bigIntr15;
                            bigIntr15 = bigIntr82;
                            zArr = zArr3;
                            bigIntr38 = bigIntr74;
                            i7 = i13;
                            bigIntr4 = bigIntr62;
                            bigIntr39 = bigIntr76;
                            iArr2 = g;
                            bigIntr40 = bigIntr73;
                            BigIntr bigIntr83 = bigIntr19;
                            bigIntr29 = bigIntr80;
                            z5 = z6;
                            bigIntr41 = bigIntr83;
                        } else {
                            try {
                                bigIntr73.setMag(this.f[i17].c);
                                bigIntr74.setMag(this.f[i17].d);
                                bigIntr76.setMag(this.f[i17].e);
                                iArr3 = g;
                            } catch (Throwable th2) {
                                th = th2;
                                bigIntr24 = bigIntr21;
                                bigIntr6 = bigIntr75;
                                bigIntr12 = bigIntr22;
                                bigIntr35 = bigIntr79;
                                bigIntr7 = bigIntr81;
                                bigIntr28 = bigIntr60;
                                bigIntr9 = bigIntr63;
                                bigIntr48 = bigIntr15;
                                bigIntr15 = bigIntr82;
                                zArr2 = zArr3;
                                bigIntr49 = bigIntr74;
                                bigIntr4 = bigIntr62;
                                bigIntr50 = bigIntr76;
                                iArr2 = g;
                                bigIntr51 = bigIntr73;
                                bigIntr11 = bigIntr19;
                            }
                            try {
                                bigIntr6 = bigIntr75;
                                bigIntr30 = bigIntr79;
                                bigIntr7 = bigIntr81;
                                bigIntr9 = bigIntr63;
                                bigIntr52 = bigIntr22;
                                bigIntr28 = bigIntr60;
                                bigIntr53 = bigIntr15;
                                bigIntr15 = bigIntr82;
                                BigIntr bigIntr84 = bigIntr76;
                                iArr2 = iArr3;
                                bigIntr54 = bigIntr14;
                                bigIntr24 = bigIntr21;
                                BigIntr bigIntr85 = bigIntr74;
                                i7 = i13;
                                bigIntr4 = bigIntr62;
                                bigIntr55 = bigIntr19;
                                bigIntr29 = bigIntr80;
                                try {
                                    b(this.l, bigIntr54, bigIntr24, bigIntr53, zArr3, bigIntr55, bigIntr52, bigIntr15, z6, bigIntr73, bigIntr85, bigIntr84, this.f[i17].g, bigIntr30, bigIntr6, bigIntr29, bigIntr7, bigIntr28, bigIntr78, bigIntr4, bigIntr9, jArr3);
                                    zArr = zArr3;
                                    bigIntr38 = bigIntr85;
                                    bigIntr40 = bigIntr73;
                                    bigIntr39 = bigIntr84;
                                } catch (Throwable th3) {
                                    th = th3;
                                    bigIntr12 = bigIntr52;
                                    BigIntr bigIntr86 = bigIntr73;
                                    bigIntr11 = bigIntr55;
                                    bigIntr5 = bigIntr86;
                                    bigIntr14 = bigIntr54;
                                    bigIntr13 = bigIntr53;
                                    bigIntr74 = bigIntr85;
                                    bigIntr2 = bigIntr84;
                                    zArr3 = zArr3;
                                    bigIntr8 = bigIntr30;
                                    bigIntr80 = bigIntr29;
                                    bigIntr3 = bigIntr28;
                                    jArr = jArr3;
                                    bigIntr10 = bigIntr24;
                                    j = 0;
                                    Arrays.fill(jArr, 0, (i * 2) + 1, j);
                                    bigIntr6.clear();
                                    bigIntr80.clear();
                                    bigIntr7.clear();
                                    bigIntr3.clear();
                                    bigIntr78.clear();
                                    bigIntr4.clear();
                                    bigIntr9.clear();
                                    bigIntr14.clear();
                                    bigIntr10.clear();
                                    bigIntr13.clear();
                                    bigIntr11.clear();
                                    bigIntr12.clear();
                                    bigIntr15.clear();
                                    bigIntr8.clear();
                                    bigIntr5.clear();
                                    bigIntr74.clear();
                                    bigIntr2.clear();
                                    zArr3[0] = false;
                                    iArr[0] = 0;
                                    Arrays.fill(iArr2, 0);
                                    throw th;
                                }
                            } catch (Throwable th4) {
                                th = th4;
                                bigIntr51 = bigIntr73;
                                bigIntr24 = bigIntr21;
                                bigIntr11 = bigIntr19;
                                bigIntr6 = bigIntr75;
                                bigIntr12 = bigIntr22;
                                bigIntr35 = bigIntr79;
                                bigIntr7 = bigIntr81;
                                bigIntr28 = bigIntr60;
                                bigIntr9 = bigIntr63;
                                bigIntr48 = bigIntr15;
                                bigIntr15 = bigIntr82;
                                zArr2 = zArr3;
                                bigIntr49 = bigIntr74;
                                bigIntr4 = bigIntr62;
                                bigIntr50 = bigIntr76;
                                iArr2 = iArr3;
                                bigIntr5 = bigIntr51;
                                bigIntr13 = bigIntr48;
                                bigIntr74 = bigIntr49;
                                bigIntr2 = bigIntr50;
                                zArr3 = zArr2;
                                bigIntr8 = bigIntr35;
                                bigIntr3 = bigIntr28;
                                jArr = jArr3;
                                bigIntr10 = bigIntr24;
                                j = 0;
                                Arrays.fill(jArr, 0, (i * 2) + 1, j);
                                bigIntr6.clear();
                                bigIntr80.clear();
                                bigIntr7.clear();
                                bigIntr3.clear();
                                bigIntr78.clear();
                                bigIntr4.clear();
                                bigIntr9.clear();
                                bigIntr14.clear();
                                bigIntr10.clear();
                                bigIntr13.clear();
                                bigIntr11.clear();
                                bigIntr12.clear();
                                bigIntr15.clear();
                                bigIntr8.clear();
                                bigIntr5.clear();
                                bigIntr74.clear();
                                bigIntr2.clear();
                                zArr3[0] = false;
                                iArr[0] = 0;
                                Arrays.fill(iArr2, 0);
                                throw th;
                            }
                            try {
                                z5 = zArr[i7];
                                bigIntr12 = bigIntr24;
                                bigIntr24 = bigIntr52;
                                bigIntr15 = bigIntr53;
                                bigIntr37 = bigIntr15;
                                bigIntr41 = bigIntr54;
                                bigIntr36 = bigIntr55;
                            } catch (Throwable th5) {
                                th = th5;
                                bigIntr5 = bigIntr40;
                                bigIntr14 = bigIntr54;
                                bigIntr11 = bigIntr14;
                                bigIntr12 = bigIntr24;
                                bigIntr13 = bigIntr53;
                                bigIntr15 = bigIntr13;
                                bigIntr74 = bigIntr38;
                                bigIntr2 = bigIntr39;
                                zArr3 = zArr;
                                bigIntr8 = bigIntr30;
                                bigIntr80 = bigIntr29;
                                bigIntr3 = bigIntr28;
                                jArr = jArr3;
                                bigIntr10 = bigIntr12;
                                j = 0;
                                Arrays.fill(jArr, 0, (i * 2) + 1, j);
                                bigIntr6.clear();
                                bigIntr80.clear();
                                bigIntr7.clear();
                                bigIntr3.clear();
                                bigIntr78.clear();
                                bigIntr4.clear();
                                bigIntr9.clear();
                                bigIntr14.clear();
                                bigIntr10.clear();
                                bigIntr13.clear();
                                bigIntr11.clear();
                                bigIntr12.clear();
                                bigIntr15.clear();
                                bigIntr8.clear();
                                bigIntr5.clear();
                                bigIntr74.clear();
                                bigIntr2.clear();
                                zArr3[0] = false;
                                iArr[0] = 0;
                                Arrays.fill(iArr2, 0);
                                throw th;
                            }
                        }
                        try {
                            int i19 = iArr2[i16];
                            int i20 = i7;
                            if (i2 > (-i19) || (-i19) >= i15) {
                                i8 = i15;
                                bigIntr5 = bigIntr40;
                                bigIntr74 = bigIntr38;
                                bigIntr42 = bigIntr39;
                                zArr3 = zArr;
                                BigIntr bigIntr87 = bigIntr41;
                                BigIntr bigIntr88 = bigIntr12;
                                BigIntr bigIntr89 = bigIntr15;
                                bigIntr15 = bigIntr37;
                                bigIntr37 = bigIntr89;
                                bigIntr21 = bigIntr24;
                                bigIntr24 = bigIntr88;
                                z6 = z5;
                                bigIntr14 = bigIntr36;
                                bigIntr36 = bigIntr87;
                            } else {
                                try {
                                    i9 = i17 + i12;
                                    bigIntr40.setMag(this.f[i9].c);
                                    bigIntr38.setMag(this.f[i9].d);
                                    bigIntr39.setMag(this.f[i9].e);
                                    bigIntr44 = bigIntr40;
                                    try {
                                        i8 = i15;
                                        bigIntr45 = bigIntr12;
                                        bigIntr46 = bigIntr38;
                                        zArr3 = zArr;
                                        bigIntr42 = bigIntr39;
                                        bigIntr47 = bigIntr41;
                                    } catch (Throwable th6) {
                                        th = th6;
                                        bigIntr74 = bigIntr38;
                                        bigIntr42 = bigIntr39;
                                        zArr3 = zArr;
                                        bigIntr43 = bigIntr41;
                                        bigIntr5 = bigIntr44;
                                        bigIntr14 = bigIntr36;
                                        bigIntr13 = bigIntr37;
                                        bigIntr11 = bigIntr43;
                                        bigIntr2 = bigIntr42;
                                        bigIntr8 = bigIntr30;
                                        bigIntr80 = bigIntr29;
                                        bigIntr3 = bigIntr28;
                                        jArr = jArr3;
                                        bigIntr10 = bigIntr24;
                                        j = 0;
                                        Arrays.fill(jArr, 0, (i * 2) + 1, j);
                                        bigIntr6.clear();
                                        bigIntr80.clear();
                                        bigIntr7.clear();
                                        bigIntr3.clear();
                                        bigIntr78.clear();
                                        bigIntr4.clear();
                                        bigIntr9.clear();
                                        bigIntr14.clear();
                                        bigIntr10.clear();
                                        bigIntr13.clear();
                                        bigIntr11.clear();
                                        bigIntr12.clear();
                                        bigIntr15.clear();
                                        bigIntr8.clear();
                                        bigIntr5.clear();
                                        bigIntr74.clear();
                                        bigIntr2.clear();
                                        zArr3[0] = false;
                                        iArr[0] = 0;
                                        Arrays.fill(iArr2, 0);
                                        throw th;
                                    }
                                } catch (Throwable th7) {
                                    th = th7;
                                    bigIntr5 = bigIntr40;
                                    bigIntr74 = bigIntr38;
                                    bigIntr42 = bigIntr39;
                                    zArr3 = zArr;
                                    bigIntr43 = bigIntr41;
                                    bigIntr14 = bigIntr36;
                                    bigIntr13 = bigIntr37;
                                    bigIntr11 = bigIntr43;
                                    bigIntr2 = bigIntr42;
                                    bigIntr8 = bigIntr30;
                                    bigIntr80 = bigIntr29;
                                    bigIntr3 = bigIntr28;
                                    jArr = jArr3;
                                    bigIntr10 = bigIntr24;
                                    j = 0;
                                    Arrays.fill(jArr, 0, (i * 2) + 1, j);
                                    bigIntr6.clear();
                                    bigIntr80.clear();
                                    bigIntr7.clear();
                                    bigIntr3.clear();
                                    bigIntr78.clear();
                                    bigIntr4.clear();
                                    bigIntr9.clear();
                                    bigIntr14.clear();
                                    bigIntr10.clear();
                                    bigIntr13.clear();
                                    bigIntr11.clear();
                                    bigIntr12.clear();
                                    bigIntr15.clear();
                                    bigIntr8.clear();
                                    bigIntr5.clear();
                                    bigIntr74.clear();
                                    bigIntr2.clear();
                                    zArr3[0] = false;
                                    iArr[0] = 0;
                                    Arrays.fill(iArr2, 0);
                                    throw th;
                                }
                                try {
                                    b(this.l, bigIntr36, bigIntr24, bigIntr37, zArr3, bigIntr47, bigIntr45, bigIntr15, z5, bigIntr44, bigIntr46, bigIntr42, this.f[i9].g, bigIntr30, bigIntr6, bigIntr29, bigIntr7, bigIntr28, bigIntr78, bigIntr4, bigIntr9, jArr3);
                                    bigIntr5 = bigIntr44;
                                    bigIntr74 = bigIntr46;
                                    try {
                                        z6 = zArr3[i20];
                                        bigIntr14 = bigIntr47;
                                        bigIntr21 = bigIntr45;
                                    } catch (Throwable th8) {
                                        th = th8;
                                        bigIntr14 = bigIntr36;
                                        bigIntr11 = bigIntr14;
                                        bigIntr12 = bigIntr24;
                                        bigIntr13 = bigIntr37;
                                        bigIntr15 = bigIntr13;
                                        bigIntr2 = bigIntr42;
                                        bigIntr8 = bigIntr30;
                                        bigIntr80 = bigIntr29;
                                        bigIntr3 = bigIntr28;
                                        jArr = jArr3;
                                        bigIntr10 = bigIntr12;
                                        j = 0;
                                        Arrays.fill(jArr, 0, (i * 2) + 1, j);
                                        bigIntr6.clear();
                                        bigIntr80.clear();
                                        bigIntr7.clear();
                                        bigIntr3.clear();
                                        bigIntr78.clear();
                                        bigIntr4.clear();
                                        bigIntr9.clear();
                                        bigIntr14.clear();
                                        bigIntr10.clear();
                                        bigIntr13.clear();
                                        bigIntr11.clear();
                                        bigIntr12.clear();
                                        bigIntr15.clear();
                                        bigIntr8.clear();
                                        bigIntr5.clear();
                                        bigIntr74.clear();
                                        bigIntr2.clear();
                                        zArr3[0] = false;
                                        iArr[0] = 0;
                                        Arrays.fill(iArr2, 0);
                                        throw th;
                                    }
                                } catch (Throwable th9) {
                                    th = th9;
                                    bigIntr5 = bigIntr44;
                                    bigIntr74 = bigIntr46;
                                    bigIntr14 = bigIntr36;
                                    bigIntr13 = bigIntr37;
                                    bigIntr11 = bigIntr47;
                                    bigIntr12 = bigIntr45;
                                    bigIntr2 = bigIntr42;
                                    bigIntr8 = bigIntr30;
                                    bigIntr80 = bigIntr29;
                                    bigIntr3 = bigIntr28;
                                    jArr = jArr3;
                                    bigIntr10 = bigIntr24;
                                    j = 0;
                                    Arrays.fill(jArr, 0, (i * 2) + 1, j);
                                    bigIntr6.clear();
                                    bigIntr80.clear();
                                    bigIntr7.clear();
                                    bigIntr3.clear();
                                    bigIntr78.clear();
                                    bigIntr4.clear();
                                    bigIntr9.clear();
                                    bigIntr14.clear();
                                    bigIntr10.clear();
                                    bigIntr13.clear();
                                    bigIntr11.clear();
                                    bigIntr12.clear();
                                    bigIntr15.clear();
                                    bigIntr8.clear();
                                    bigIntr5.clear();
                                    bigIntr74.clear();
                                    bigIntr2.clear();
                                    zArr3[0] = false;
                                    iArr[0] = 0;
                                    Arrays.fill(iArr2, 0);
                                    throw th;
                                }
                            }
                            i17++;
                            i16++;
                            bigIntr73 = bigIntr5;
                            g = iArr2;
                            bigIntr76 = bigIntr42;
                            bigIntr81 = bigIntr7;
                            bigIntr62 = bigIntr4;
                            bigIntr63 = bigIntr9;
                            i15 = i8;
                            i13 = i20;
                            bigIntr82 = bigIntr37;
                            bigIntr79 = bigIntr30;
                            bigIntr75 = bigIntr6;
                            bigIntr80 = bigIntr29;
                            bigIntr60 = bigIntr28;
                            bigIntr19 = bigIntr36;
                            bigIntr22 = bigIntr24;
                        } catch (Throwable th10) {
                            th = th10;
                        }
                    } catch (Throwable th11) {
                        th = th11;
                        bigIntr5 = bigIntr73;
                        bigIntr24 = bigIntr21;
                        bigIntr11 = bigIntr19;
                        bigIntr6 = bigIntr75;
                        bigIntr12 = bigIntr22;
                        bigIntr35 = bigIntr79;
                        bigIntr7 = bigIntr81;
                        bigIntr28 = bigIntr60;
                        bigIntr4 = bigIntr62;
                        bigIntr9 = bigIntr63;
                        BigIntr bigIntr90 = bigIntr15;
                        bigIntr15 = bigIntr82;
                        BigIntr bigIntr91 = bigIntr76;
                        iArr2 = g;
                        bigIntr13 = bigIntr90;
                        bigIntr2 = bigIntr91;
                    }
                } catch (Throwable th12) {
                    th = th12;
                    bigIntr2 = bigIntr76;
                    iArr2 = g;
                    bigIntr3 = bigIntr60;
                    bigIntr34 = bigIntr15;
                    bigIntr5 = bigIntr73;
                    bigIntr24 = bigIntr21;
                    bigIntr15 = bigIntr82;
                    bigIntr11 = bigIntr19;
                    bigIntr6 = bigIntr75;
                    bigIntr12 = bigIntr22;
                    bigIntr7 = bigIntr81;
                    bigIntr4 = bigIntr62;
                    bigIntr8 = bigIntr79;
                    bigIntr9 = bigIntr63;
                }
            }
            BigIntr bigIntr92 = bigIntr14;
            bigIntr5 = bigIntr73;
            bigIntr24 = bigIntr21;
            bigIntr11 = bigIntr19;
            bigIntr6 = bigIntr75;
            bigIntr12 = bigIntr22;
            int i21 = i13;
            BigIntr bigIntr93 = bigIntr79;
            BigIntr bigIntr94 = bigIntr80;
            bigIntr7 = bigIntr81;
            BigIntr bigIntr95 = bigIntr60;
            bigIntr4 = bigIntr62;
            bigIntr9 = bigIntr63;
            bigIntr34 = bigIntr15;
            bigIntr15 = bigIntr82;
            BigIntr bigIntr96 = bigIntr76;
            iArr2 = g;
            try {
                bigIntr2 = bigIntr96;
                BigIntr bigIntr97 = bigIntr20;
                BigIntr bigIntr98 = bigIntr17;
                BigIntr bigIntr99 = bigIntr18;
                try {
                    b(this.l, bigIntr92, bigIntr24, bigIntr34, zArr3, bigIntr97, bigIntr98, bigIntr99, z3, bigIntr11, bigIntr12, bigIntr15, z6, bigIntr93, bigIntr6, bigIntr94, bigIntr7, bigIntr95, bigIntr78, bigIntr4, bigIntr9, jArr3);
                    bigIntr15 = bigIntr15;
                    boolean z7 = z6;
                    bigIntr8 = bigIntr93;
                    bigIntr80 = bigIntr94;
                    bigIntr3 = bigIntr95;
                    try {
                        z3 = zArr3[i21];
                        i2 -= i10;
                        bigIntr20 = bigIntr92;
                        bigIntr17 = bigIntr24;
                        bigIntr18 = bigIntr34;
                        bigIntr16 = bigIntr15;
                        z4 = z7;
                        bigIntr19 = bigIntr11;
                        bigIntr22 = bigIntr12;
                        bigIntr60 = bigIntr3;
                        bigIntr73 = bigIntr5;
                        bigIntr15 = bigIntr99;
                        bigIntr14 = bigIntr97;
                        bigIntr21 = bigIntr98;
                        bigIntr62 = bigIntr4;
                        bigIntr63 = bigIntr9;
                        bigIntr79 = bigIntr8;
                        iu61Var2 = iu61Var;
                        i13 = i21;
                        g = iArr2;
                        bigIntr81 = bigIntr7;
                        bigIntr76 = bigIntr2;
                        bigIntr75 = bigIntr6;
                        i11 = i;
                    } catch (Throwable th13) {
                        th = th13;
                        bigIntr14 = bigIntr92;
                        bigIntr13 = bigIntr34;
                        jArr = jArr3;
                        bigIntr10 = bigIntr24;
                        j = 0;
                        Arrays.fill(jArr, 0, (i * 2) + 1, j);
                        bigIntr6.clear();
                        bigIntr80.clear();
                        bigIntr7.clear();
                        bigIntr3.clear();
                        bigIntr78.clear();
                        bigIntr4.clear();
                        bigIntr9.clear();
                        bigIntr14.clear();
                        bigIntr10.clear();
                        bigIntr13.clear();
                        bigIntr11.clear();
                        bigIntr12.clear();
                        bigIntr15.clear();
                        bigIntr8.clear();
                        bigIntr5.clear();
                        bigIntr74.clear();
                        bigIntr2.clear();
                        zArr3[0] = false;
                        iArr[0] = 0;
                        Arrays.fill(iArr2, 0);
                        throw th;
                    }
                } catch (Throwable th14) {
                    th = th14;
                    bigIntr15 = bigIntr15;
                    bigIntr8 = bigIntr93;
                    bigIntr80 = bigIntr94;
                    bigIntr3 = bigIntr95;
                    bigIntr14 = bigIntr92;
                    bigIntr13 = bigIntr34;
                    jArr = jArr3;
                    bigIntr10 = bigIntr24;
                    j = 0;
                    Arrays.fill(jArr, 0, (i * 2) + 1, j);
                    bigIntr6.clear();
                    bigIntr80.clear();
                    bigIntr7.clear();
                    bigIntr3.clear();
                    bigIntr78.clear();
                    bigIntr4.clear();
                    bigIntr9.clear();
                    bigIntr14.clear();
                    bigIntr10.clear();
                    bigIntr13.clear();
                    bigIntr11.clear();
                    bigIntr12.clear();
                    bigIntr15.clear();
                    bigIntr8.clear();
                    bigIntr5.clear();
                    bigIntr74.clear();
                    bigIntr2.clear();
                    zArr3[0] = false;
                    iArr[0] = 0;
                    Arrays.fill(iArr2, 0);
                    throw th;
                }
            } catch (Throwable th15) {
                th = th15;
                bigIntr2 = bigIntr96;
            }
            bigIntr3 = bigIntr28;
            jArr = jArr3;
            bigIntr10 = bigIntr24;
            j = 0;
            Arrays.fill(jArr, 0, (i * 2) + 1, j);
            bigIntr6.clear();
            bigIntr80.clear();
            bigIntr7.clear();
            bigIntr3.clear();
            bigIntr78.clear();
            bigIntr4.clear();
            bigIntr9.clear();
            bigIntr14.clear();
            bigIntr10.clear();
            bigIntr13.clear();
            bigIntr11.clear();
            bigIntr12.clear();
            bigIntr15.clear();
            bigIntr8.clear();
            bigIntr5.clear();
            bigIntr74.clear();
            bigIntr2.clear();
            zArr3[0] = false;
            iArr[0] = 0;
            Arrays.fill(iArr2, 0);
            throw th;
        }
        i = i11;
        bigIntr2 = bigIntr76;
        iArr2 = g;
        bigIntr3 = bigIntr60;
        bigIntr5 = bigIntr73;
        bigIntr6 = bigIntr75;
        int i22 = i13;
        bigIntr7 = bigIntr81;
        BigIntr bigIntr100 = bigIntr18;
        bigIntr4 = bigIntr62;
        bigIntr8 = bigIntr79;
        BigIntr bigIntr101 = bigIntr20;
        bigIntr9 = bigIntr63;
        BigIntr bigIntr102 = bigIntr17;
        if (z3) {
            bigIntr23 = bigIntr100;
        } else {
            int i23 = i22;
            BigIntr bigIntr103 = bigIntr15;
            BigIntr bigIntr104 = bigIntr14;
            bigIntr24 = bigIntr21;
            boolean z8 = z3;
            BigIntr bigIntr105 = bigIntr100;
            while (true) {
                i6 = i;
                if (i23 >= (i6 == 16 ? 3 : i22)) {
                    break;
                }
                try {
                    i = i6;
                    BigIntr bigIntr106 = bigIntr6;
                    BigIntr bigIntr107 = bigIntr7;
                    BigIntr bigIntr108 = bigIntr78;
                    long[] jArr4 = jArr3;
                    BigIntr bigIntr109 = bigIntr80;
                    try {
                        c(this.l, bigIntr104, bigIntr24, bigIntr103, zArr3, bigIntr101, bigIntr102, bigIntr105, z8, jArr4, bigIntr106, bigIntr109, bigIntr107, bigIntr3, bigIntr108);
                        jArr3 = jArr4;
                        bigIntr80 = bigIntr109;
                        bigIntr7 = bigIntr107;
                        bigIntr78 = bigIntr108;
                        bigIntr6 = bigIntr106;
                    } catch (Throwable th16) {
                        th = th16;
                        jArr3 = jArr4;
                        bigIntr80 = bigIntr109;
                        bigIntr7 = bigIntr107;
                        bigIntr78 = bigIntr108;
                        bigIntr6 = bigIntr106;
                    }
                } catch (Throwable th17) {
                    th = th17;
                    i = i6;
                }
                try {
                    z8 = zArr3[i22];
                    i23++;
                    BigIntr bigIntr110 = bigIntr101;
                    bigIntr101 = bigIntr104;
                    bigIntr104 = bigIntr110;
                    BigIntr bigIntr111 = bigIntr102;
                    bigIntr102 = bigIntr24;
                    bigIntr24 = bigIntr111;
                    BigIntr bigIntr112 = bigIntr105;
                    bigIntr105 = bigIntr103;
                    bigIntr103 = bigIntr112;
                } catch (Throwable th18) {
                    th = th18;
                    bigIntr14 = bigIntr104;
                    bigIntr13 = bigIntr103;
                    bigIntr11 = bigIntr19;
                    bigIntr12 = bigIntr22;
                    jArr = jArr3;
                    bigIntr15 = bigIntr16;
                    bigIntr10 = bigIntr24;
                    j = 0;
                    Arrays.fill(jArr, 0, (i * 2) + 1, j);
                    bigIntr6.clear();
                    bigIntr80.clear();
                    bigIntr7.clear();
                    bigIntr3.clear();
                    bigIntr78.clear();
                    bigIntr4.clear();
                    bigIntr9.clear();
                    bigIntr14.clear();
                    bigIntr10.clear();
                    bigIntr13.clear();
                    bigIntr11.clear();
                    bigIntr12.clear();
                    bigIntr15.clear();
                    bigIntr8.clear();
                    bigIntr5.clear();
                    bigIntr74.clear();
                    bigIntr2.clear();
                    zArr3[0] = false;
                    iArr[0] = 0;
                    Arrays.fill(iArr2, 0);
                    throw th;
                }
            }
            i = i6;
            bigIntr21 = bigIntr24;
            bigIntr23 = bigIntr105;
            z3 = z8;
            bigIntr14 = bigIntr104;
            bigIntr15 = bigIntr103;
        }
        int i24 = i10 - 1;
        BigIntr bigIntr113 = bigIntr101;
        BigIntr bigIntr114 = bigIntr102;
        BigIntr bigIntr115 = bigIntr23;
        boolean z9 = true;
        while (i24 > 0) {
            int i25 = i22;
            BigIntr bigIntr116 = bigIntr15;
            BigIntr bigIntr117 = bigIntr14;
            bigIntr24 = bigIntr21;
            bigIntr11 = bigIntr19;
            bigIntr12 = bigIntr22;
            bigIntr15 = bigIntr16;
            boolean z10 = z9;
            int i26 = i25;
            while (i26 < iArr2.length) {
                try {
                    try {
                        int i27 = iArr2[i26];
                        try {
                            if (i27 > 0) {
                                try {
                                    if (i24 == i27 % i10) {
                                        bigIntr5.setMag(this.f[i25].c);
                                        bigIntr74.setMag(this.f[i25].d);
                                        bigIntr2.setMag(this.f[i25].e);
                                        BigIntr bigIntr118 = bigIntr11;
                                        BigIntr bigIntr119 = bigIntr5;
                                        i3 = i26;
                                        BigIntr bigIntr120 = bigIntr2;
                                        BigIntr bigIntr121 = bigIntr12;
                                        bigIntr28 = bigIntr3;
                                        bigIntr29 = bigIntr80;
                                        bigIntr30 = bigIntr8;
                                        BigIntr bigIntr122 = bigIntr74;
                                        try {
                                            b(this.l, bigIntr117, bigIntr24, bigIntr116, zArr3, bigIntr118, bigIntr121, bigIntr15, z10, bigIntr119, bigIntr122, bigIntr120, this.f[i25].g, bigIntr30, bigIntr6, bigIntr29, bigIntr7, bigIntr28, bigIntr78, bigIntr4, bigIntr9, jArr3);
                                            bigIntr31 = bigIntr119;
                                            bigIntr74 = bigIntr122;
                                            bigIntr2 = bigIntr120;
                                            try {
                                                z10 = zArr3[i22];
                                                BigIntr bigIntr123 = bigIntr15;
                                                bigIntr15 = bigIntr116;
                                                bigIntr116 = bigIntr123;
                                                bigIntr32 = bigIntr117;
                                                bigIntr33 = bigIntr24;
                                                bigIntr117 = bigIntr118;
                                                bigIntr24 = bigIntr121;
                                                i4 = iArr2[i3];
                                                if (i4 < 0 || i24 != (-i4) % i10) {
                                                    i5 = i3;
                                                    bigIntr5 = bigIntr31;
                                                    bigIntr11 = bigIntr32;
                                                    bigIntr12 = bigIntr33;
                                                } else {
                                                    int i28 = i25 + i12;
                                                    bigIntr31.setMag(this.f[i28].c);
                                                    bigIntr74.setMag(this.f[i28].d);
                                                    bigIntr2.setMag(this.f[i28].e);
                                                    BigIntr bigIntr124 = bigIntr31;
                                                    try {
                                                        iu61 iu61Var3 = this.l;
                                                        i5 = i3;
                                                        boolean z11 = this.f[i28].g;
                                                        BigIntr bigIntr125 = bigIntr74;
                                                        BigIntr bigIntr126 = bigIntr2;
                                                        try {
                                                            b(iu61Var3, bigIntr117, bigIntr24, bigIntr116, zArr3, bigIntr32, bigIntr33, bigIntr15, z10, bigIntr124, bigIntr125, bigIntr126, z11, bigIntr30, bigIntr6, bigIntr29, bigIntr7, bigIntr28, bigIntr78, bigIntr4, bigIntr9, jArr3);
                                                            bigIntr5 = bigIntr124;
                                                            bigIntr74 = bigIntr125;
                                                            bigIntr2 = bigIntr126;
                                                            try {
                                                                BigIntr bigIntr127 = bigIntr15;
                                                                bigIntr15 = bigIntr116;
                                                                bigIntr116 = bigIntr127;
                                                                z10 = zArr3[i22];
                                                                bigIntr11 = bigIntr117;
                                                                bigIntr12 = bigIntr24;
                                                                bigIntr117 = bigIntr32;
                                                                bigIntr24 = bigIntr33;
                                                            } catch (Throwable th19) {
                                                                th = th19;
                                                                bigIntr14 = bigIntr117;
                                                                bigIntr11 = bigIntr14;
                                                                bigIntr12 = bigIntr24;
                                                                bigIntr13 = bigIntr116;
                                                                bigIntr15 = bigIntr13;
                                                                bigIntr8 = bigIntr30;
                                                                bigIntr80 = bigIntr29;
                                                                bigIntr3 = bigIntr28;
                                                                jArr = jArr3;
                                                                bigIntr10 = bigIntr12;
                                                                j = 0;
                                                                Arrays.fill(jArr, 0, (i * 2) + 1, j);
                                                                bigIntr6.clear();
                                                                bigIntr80.clear();
                                                                bigIntr7.clear();
                                                                bigIntr3.clear();
                                                                bigIntr78.clear();
                                                                bigIntr4.clear();
                                                                bigIntr9.clear();
                                                                bigIntr14.clear();
                                                                bigIntr10.clear();
                                                                bigIntr13.clear();
                                                                bigIntr11.clear();
                                                                bigIntr12.clear();
                                                                bigIntr15.clear();
                                                                bigIntr8.clear();
                                                                bigIntr5.clear();
                                                                bigIntr74.clear();
                                                                bigIntr2.clear();
                                                                zArr3[0] = false;
                                                                iArr[0] = 0;
                                                                Arrays.fill(iArr2, 0);
                                                                throw th;
                                                            }
                                                        } catch (Throwable th20) {
                                                            th = th20;
                                                            bigIntr5 = bigIntr124;
                                                            bigIntr74 = bigIntr125;
                                                            bigIntr2 = bigIntr126;
                                                            bigIntr14 = bigIntr117;
                                                            bigIntr13 = bigIntr116;
                                                            bigIntr11 = bigIntr32;
                                                            bigIntr12 = bigIntr33;
                                                            bigIntr8 = bigIntr30;
                                                            bigIntr80 = bigIntr29;
                                                            bigIntr3 = bigIntr28;
                                                            jArr = jArr3;
                                                            bigIntr10 = bigIntr24;
                                                            j = 0;
                                                            Arrays.fill(jArr, 0, (i * 2) + 1, j);
                                                            bigIntr6.clear();
                                                            bigIntr80.clear();
                                                            bigIntr7.clear();
                                                            bigIntr3.clear();
                                                            bigIntr78.clear();
                                                            bigIntr4.clear();
                                                            bigIntr9.clear();
                                                            bigIntr14.clear();
                                                            bigIntr10.clear();
                                                            bigIntr13.clear();
                                                            bigIntr11.clear();
                                                            bigIntr12.clear();
                                                            bigIntr15.clear();
                                                            bigIntr8.clear();
                                                            bigIntr5.clear();
                                                            bigIntr74.clear();
                                                            bigIntr2.clear();
                                                            zArr3[0] = false;
                                                            iArr[0] = 0;
                                                            Arrays.fill(iArr2, 0);
                                                            throw th;
                                                        }
                                                    } catch (Throwable th21) {
                                                        th = th21;
                                                        bigIntr5 = bigIntr124;
                                                    }
                                                }
                                                i25++;
                                                i26 = i5 + 1;
                                                bigIntr8 = bigIntr30;
                                                bigIntr80 = bigIntr29;
                                                bigIntr3 = bigIntr28;
                                            } catch (Throwable th22) {
                                                th = th22;
                                                bigIntr5 = bigIntr31;
                                                bigIntr14 = bigIntr117;
                                                bigIntr11 = bigIntr14;
                                                bigIntr12 = bigIntr24;
                                                bigIntr13 = bigIntr116;
                                                bigIntr15 = bigIntr13;
                                                bigIntr8 = bigIntr30;
                                                bigIntr80 = bigIntr29;
                                                bigIntr3 = bigIntr28;
                                                jArr = jArr3;
                                                bigIntr10 = bigIntr12;
                                                j = 0;
                                                Arrays.fill(jArr, 0, (i * 2) + 1, j);
                                                bigIntr6.clear();
                                                bigIntr80.clear();
                                                bigIntr7.clear();
                                                bigIntr3.clear();
                                                bigIntr78.clear();
                                                bigIntr4.clear();
                                                bigIntr9.clear();
                                                bigIntr14.clear();
                                                bigIntr10.clear();
                                                bigIntr13.clear();
                                                bigIntr11.clear();
                                                bigIntr12.clear();
                                                bigIntr15.clear();
                                                bigIntr8.clear();
                                                bigIntr5.clear();
                                                bigIntr74.clear();
                                                bigIntr2.clear();
                                                zArr3[0] = false;
                                                iArr[0] = 0;
                                                Arrays.fill(iArr2, 0);
                                                throw th;
                                            }
                                        } catch (Throwable th23) {
                                            th = th23;
                                            bigIntr74 = bigIntr122;
                                            bigIntr2 = bigIntr120;
                                            bigIntr11 = bigIntr118;
                                            bigIntr12 = bigIntr121;
                                            bigIntr5 = bigIntr119;
                                            bigIntr14 = bigIntr117;
                                            bigIntr13 = bigIntr116;
                                            bigIntr8 = bigIntr30;
                                            bigIntr80 = bigIntr29;
                                            bigIntr3 = bigIntr28;
                                            jArr = jArr3;
                                            bigIntr10 = bigIntr24;
                                            j = 0;
                                            Arrays.fill(jArr, 0, (i * 2) + 1, j);
                                            bigIntr6.clear();
                                            bigIntr80.clear();
                                            bigIntr7.clear();
                                            bigIntr3.clear();
                                            bigIntr78.clear();
                                            bigIntr4.clear();
                                            bigIntr9.clear();
                                            bigIntr14.clear();
                                            bigIntr10.clear();
                                            bigIntr13.clear();
                                            bigIntr11.clear();
                                            bigIntr12.clear();
                                            bigIntr15.clear();
                                            bigIntr8.clear();
                                            bigIntr5.clear();
                                            bigIntr74.clear();
                                            bigIntr2.clear();
                                            zArr3[0] = false;
                                            iArr[0] = 0;
                                            Arrays.fill(iArr2, 0);
                                            throw th;
                                        }
                                    }
                                } catch (Throwable th24) {
                                    th = th24;
                                    bigIntr28 = bigIntr3;
                                    bigIntr14 = bigIntr117;
                                    bigIntr13 = bigIntr116;
                                    bigIntr3 = bigIntr28;
                                    jArr = jArr3;
                                    bigIntr10 = bigIntr24;
                                    j = 0;
                                    Arrays.fill(jArr, 0, (i * 2) + 1, j);
                                    bigIntr6.clear();
                                    bigIntr80.clear();
                                    bigIntr7.clear();
                                    bigIntr3.clear();
                                    bigIntr78.clear();
                                    bigIntr4.clear();
                                    bigIntr9.clear();
                                    bigIntr14.clear();
                                    bigIntr10.clear();
                                    bigIntr13.clear();
                                    bigIntr11.clear();
                                    bigIntr12.clear();
                                    bigIntr15.clear();
                                    bigIntr8.clear();
                                    bigIntr5.clear();
                                    bigIntr74.clear();
                                    bigIntr2.clear();
                                    zArr3[0] = false;
                                    iArr[0] = 0;
                                    Arrays.fill(iArr2, 0);
                                    throw th;
                                }
                            }
                            i4 = iArr2[i3];
                            if (i4 < 0) {
                            }
                            i5 = i3;
                            bigIntr5 = bigIntr31;
                            bigIntr11 = bigIntr32;
                            bigIntr12 = bigIntr33;
                            i25++;
                            i26 = i5 + 1;
                            bigIntr8 = bigIntr30;
                            bigIntr80 = bigIntr29;
                            bigIntr3 = bigIntr28;
                        } catch (Throwable th25) {
                            th = th25;
                            bigIntr5 = bigIntr31;
                        }
                        int i29 = i26;
                        bigIntr31 = bigIntr5;
                        i3 = i29;
                        bigIntr28 = bigIntr3;
                        bigIntr29 = bigIntr80;
                        bigIntr30 = bigIntr8;
                        bigIntr32 = bigIntr11;
                        bigIntr33 = bigIntr12;
                    } catch (Throwable th26) {
                        th = th26;
                    }
                } catch (Throwable th27) {
                    th = th27;
                }
            }
            BigIntr bigIntr128 = bigIntr3;
            BigIntr bigIntr129 = bigIntr80;
            BigIntr bigIntr130 = bigIntr8;
            if (z10) {
                bigIntr8 = bigIntr130;
                bigIntr80 = bigIntr129;
                bigIntr3 = bigIntr128;
                jArr = jArr3;
                BigIntr bigIntr131 = bigIntr113;
                bigIntr25 = bigIntr117;
                bigIntr117 = bigIntr131;
                BigIntr bigIntr132 = bigIntr114;
                bigIntr26 = bigIntr24;
                bigIntr24 = bigIntr132;
                BigIntr bigIntr133 = bigIntr115;
                bigIntr27 = bigIntr116;
                bigIntr116 = bigIntr133;
            } else {
                try {
                    BigIntr bigIntr134 = bigIntr15;
                    boolean z12 = z10;
                    BigIntr bigIntr135 = bigIntr113;
                    BigIntr bigIntr136 = bigIntr114;
                    BigIntr bigIntr137 = bigIntr115;
                    try {
                        b(this.l, bigIntr117, bigIntr24, bigIntr116, zArr3, bigIntr135, bigIntr136, bigIntr137, z3, bigIntr11, bigIntr12, bigIntr134, z12, bigIntr130, bigIntr6, bigIntr129, bigIntr7, bigIntr128, bigIntr78, bigIntr4, bigIntr9, jArr3);
                        bigIntr25 = bigIntr135;
                        bigIntr26 = bigIntr136;
                        bigIntr27 = bigIntr137;
                        bigIntr15 = bigIntr134;
                        z10 = z12;
                        bigIntr8 = bigIntr130;
                        bigIntr80 = bigIntr129;
                        bigIntr3 = bigIntr128;
                        jArr = jArr3;
                        try {
                            z3 = zArr3[i22];
                        } catch (Throwable th28) {
                            th = th28;
                            bigIntr14 = bigIntr117;
                            bigIntr13 = bigIntr116;
                            bigIntr10 = bigIntr24;
                            j = 0;
                            Arrays.fill(jArr, 0, (i * 2) + 1, j);
                            bigIntr6.clear();
                            bigIntr80.clear();
                            bigIntr7.clear();
                            bigIntr3.clear();
                            bigIntr78.clear();
                            bigIntr4.clear();
                            bigIntr9.clear();
                            bigIntr14.clear();
                            bigIntr10.clear();
                            bigIntr13.clear();
                            bigIntr11.clear();
                            bigIntr12.clear();
                            bigIntr15.clear();
                            bigIntr8.clear();
                            bigIntr5.clear();
                            bigIntr74.clear();
                            bigIntr2.clear();
                            zArr3[0] = false;
                            iArr[0] = 0;
                            Arrays.fill(iArr2, 0);
                            throw th;
                        }
                    } catch (Throwable th29) {
                        th = th29;
                        bigIntr15 = bigIntr134;
                        bigIntr8 = bigIntr130;
                        bigIntr80 = bigIntr129;
                        bigIntr3 = bigIntr128;
                        jArr = jArr3;
                        bigIntr14 = bigIntr117;
                        bigIntr13 = bigIntr116;
                        bigIntr10 = bigIntr24;
                        j = 0;
                        Arrays.fill(jArr, 0, (i * 2) + 1, j);
                        bigIntr6.clear();
                        bigIntr80.clear();
                        bigIntr7.clear();
                        bigIntr3.clear();
                        bigIntr78.clear();
                        bigIntr4.clear();
                        bigIntr9.clear();
                        bigIntr14.clear();
                        bigIntr10.clear();
                        bigIntr13.clear();
                        bigIntr11.clear();
                        bigIntr12.clear();
                        bigIntr15.clear();
                        bigIntr8.clear();
                        bigIntr5.clear();
                        bigIntr74.clear();
                        bigIntr2.clear();
                        zArr3[0] = false;
                        iArr[0] = 0;
                        Arrays.fill(iArr2, 0);
                        throw th;
                    }
                } catch (Throwable th30) {
                    th = th30;
                }
            }
            i24--;
            jArr3 = jArr;
            bigIntr16 = bigIntr15;
            z9 = z10;
            bigIntr19 = bigIntr11;
            bigIntr22 = bigIntr12;
            bigIntr14 = bigIntr25;
            bigIntr21 = bigIntr26;
            bigIntr15 = bigIntr27;
            bigIntr113 = bigIntr117;
            bigIntr114 = bigIntr24;
            bigIntr115 = bigIntr116;
        }
        jArr = jArr3;
        if (z3) {
            try {
                aVar = new a(iu61Var);
            } catch (Throwable th31) {
                th = th31;
                bigIntr13 = bigIntr15;
                bigIntr10 = bigIntr21;
                bigIntr11 = bigIntr19;
                bigIntr12 = bigIntr22;
                bigIntr15 = bigIntr16;
            }
        } else {
            try {
                aVar = new a(this.l, bigIntr113, bigIntr114, bigIntr115, true);
            } catch (Throwable th32) {
                th = th32;
                j = 0;
                bigIntr13 = bigIntr15;
                bigIntr10 = bigIntr21;
                bigIntr11 = bigIntr19;
                bigIntr12 = bigIntr22;
                bigIntr15 = bigIntr16;
            }
        }
        if (z2) {
            aVar.toZ1();
        }
        Arrays.fill(jArr, i22, (i * 2) + 1, 0L);
        bigIntr6.clear();
        bigIntr80.clear();
        bigIntr7.clear();
        bigIntr3.clear();
        bigIntr78.clear();
        bigIntr4.clear();
        bigIntr9.clear();
        bigIntr14.clear();
        bigIntr21.clear();
        bigIntr15.clear();
        bigIntr19.clear();
        bigIntr22.clear();
        bigIntr16.clear();
        bigIntr8.clear();
        bigIntr5.clear();
        bigIntr74.clear();
        bigIntr2.clear();
        zArr3[0] = false;
        iArr[0] = 0;
        Arrays.fill(iArr2, 0);
        return aVar;
    }

    @Override // ru.CryptoPro.JCP.math.EllipticPoint
    public final String printTable() {
        StringBuilder sb = new StringBuilder("EDWARDS table. Length: ");
        sb.append(this.f.length);
        sb.append("\n");
        for (int i = 0; i < this.f.length; i++) {
            n.A(sb, "Index: ", i, "\nU: ");
            sb.append(Array.toHexString(this.f[i].c.toByteArray()));
            sb.append("\nV: ");
            sb.append(Array.toHexString(this.f[i].d.toByteArray()));
            sb.append("\nZ: ");
            sb.append(Array.toHexString(this.f[i].e.toByteArray()));
            sb.append("\n");
        }
        return sb.toString();
    }

    @Override // ru.CryptoPro.JCP.math.EllipticPoint
    public final void toZ1() {
        int i = this.m;
        BigIntr bigIntr = this.e;
        iu61 iu61Var = this.l;
        boolean z2 = this.g;
        if (z2) {
            return;
        }
        BigIntr bigIntr2 = EllipticPoint.b;
        BigIntr bigIntr3 = EllipticPoint.a;
        if (!bigIntr.equals(i == 8 ? bigIntr3 : bigIntr2)) {
            long[] jArr = new long[(i * 2) + 1];
            BigIntr euclidInverse = bigIntr.euclidInverse(iu61Var.getP());
            BigIntr bigIntr4 = this.c;
            BigIntr.e(bigIntr4, bigIntr4, euclidInverse, iu61Var.getP(), iu61Var.getOptFlag(), jArr);
            BigIntr bigIntr5 = this.d;
            BigIntr.e(bigIntr5, bigIntr5, euclidInverse, iu61Var.getP(), iu61Var.getOptFlag(), jArr);
            if (i == 8) {
                bigIntr2 = bigIntr3;
            }
            bigIntr.setMag(bigIntr2);
        }
        BigIntr bigIntr6 = this.d;
        BigIntr p2 = iu61Var.getP();
        long[] jArr2 = new long[(i * 2) + 1];
        if (z2) {
            BigIntr bigIntr7 = BigIntr.ZERO;
            this.i = new BigIntr(bigIntr7, i);
            this.j = new BigIntr(BigIntr.ONE, i);
            this.k = new BigIntr(bigIntr7, i);
            return;
        }
        this.k = new BigIntr(BigIntr.ONE, i);
        BigIntr bigIntr8 = new BigIntr(bigIntr6, i);
        BigIntr.d(bigIntr8, bigIntr8, bigIntr, p2);
        BigIntr.e(bigIntr8, bigIntr8, this.e, p2, iu61Var.getOptFlag(), jArr2);
        BigIntr euclidInverse2 = bigIntr8.euclidInverse(p2);
        BigIntr bigIntr9 = new BigIntr(bigIntr6, i);
        BigIntr.i(bigIntr9, bigIntr9, bigIntr, p2);
        BigIntr.e(bigIntr9, bigIntr9, euclidInverse2, p2, iu61Var.getOptFlag(), jArr2);
        BigIntr.e(bigIntr9, bigIntr9, iu61Var.g, p2, iu61Var.getOptFlag(), jArr2);
        BigIntr bigIntr10 = new BigIntr(this.c, i);
        this.j = bigIntr10;
        BigIntr.e(bigIntr10, bigIntr10, bigIntr9, p2, iu61Var.getOptFlag(), jArr2);
        BigIntr bigIntr11 = new BigIntr(bigIntr, i);
        this.i = bigIntr11;
        BigIntr.e(bigIntr11, bigIntr11, bigIntr9, p2, iu61Var.getOptFlag(), jArr2);
        BigIntr bigIntr12 = this.i;
        BigIntr.i(bigIntr12, bigIntr12, iu61Var.h, p2);
        bigIntr9.clear();
        euclidInverse2.clear();
        Array.clear(jArr2);
        this.h = true;
    }

    public a(iu61 iu61Var) {
        this.f = null;
        this.g = true;
        int intLength = iu61Var.getP().getIntLength();
        this.m = intLength;
        this.n = intLength == 8 ? 4 : 8;
        this.o = intLength == 8 ? 1 : 8;
        BigIntr bigIntr = BigIntr.ZERO;
        this.c = new BigIntr(bigIntr, intLength);
        this.d = new BigIntr(bigIntr, intLength);
        this.e = new BigIntr(bigIntr, intLength);
        this.i = new BigIntr(bigIntr, intLength);
        this.j = new BigIntr(BigIntr.ONE, intLength);
        this.k = new BigIntr(bigIntr, intLength);
        this.l = iu61Var;
        this.h = true;
    }

    public a(iu61 iu61Var, BigIntr bigIntr, BigIntr bigIntr2, BigIntr bigIntr3, boolean z2) {
        this.f = null;
        int intLength = iu61Var.getP().getIntLength();
        this.m = intLength;
        this.n = intLength == 8 ? 4 : 8;
        this.o = intLength == 8 ? 1 : 8;
        this.l = iu61Var;
        if (z2) {
            this.c = bigIntr;
            this.d = bigIntr2;
            this.e = bigIntr3;
        } else {
            this.c = new BigIntr(bigIntr, intLength);
            this.d = new BigIntr(bigIntr2, intLength);
            this.e = new BigIntr(bigIntr3, intLength);
        }
        BigIntr bigIntr4 = BigIntr.ZERO;
        this.i = new BigIntr(bigIntr4, intLength);
        this.j = new BigIntr(bigIntr4, intLength);
        this.k = new BigIntr(bigIntr4, intLength);
        this.h = false;
        this.g = false;
    }

    public a(BigIntr bigIntr, BigIntr bigIntr2, iu61 iu61Var) {
        this.f = null;
        d(bigIntr, bigIntr2);
        int intLength = bigIntr.getIntLength();
        this.m = intLength;
        this.n = intLength == 8 ? 4 : 8;
        this.o = intLength == 8 ? 1 : 8;
        BigIntr bigIntr3 = BigIntr.ZERO;
        this.c = new BigIntr(bigIntr3, intLength);
        this.d = new BigIntr(bigIntr3, intLength);
        this.e = new BigIntr(bigIntr3, intLength);
        this.l = iu61Var;
        this.i = new BigIntr(bigIntr, intLength);
        this.j = new BigIntr(bigIntr2, intLength);
        this.k = new BigIntr(BigIntr.ONE, intLength);
        this.h = true;
        this.g = false;
        a();
    }

    public a(a aVar) {
        this.f = null;
        this.l = aVar.l;
        int i = aVar.m;
        this.m = i;
        this.n = i == 8 ? 4 : 8;
        this.o = i == 8 ? 1 : 8;
        this.g = aVar.g;
        this.c = new BigIntr(aVar.c);
        this.d = new BigIntr(aVar.d);
        this.e = new BigIntr(aVar.e);
        this.i = new BigIntr(aVar.i);
        this.j = new BigIntr(aVar.j);
        this.k = new BigIntr(aVar.k);
        this.h = aVar.h;
    }
}
