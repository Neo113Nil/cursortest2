package defpackage;

import com.yandex.fintechsdk.core.analytics.impl.internal.a;
import com.yandex.messaging.internal.authorized.sync.PushTokenValidationException;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.UUID;
import kotlin.Pair;
import kotlin.collections.b;
import ru.CryptoPro.reprov.x509.CRLReasonCodeExtension;
import ru.yandex.video.m3.player.utils.DRMInfoProvider;

/* loaded from: classes7.dex */
public abstract class sba1 {
    public static final byte[] a = {0, 0, 0, 1};
    public static final float[] b = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 2.1818182f, 1.8181819f, 2.909091f, 2.4242425f, 1.6363636f, 1.3636364f, 1.939394f, 1.6161616f, 1.3333334f, 1.5f, 2.0f};
    public static final Object c = new Object();
    public static int[] d = new int[10];

    public static int a(int i, byte[] bArr) {
        int i2;
        synchronized (c) {
            int i3 = 0;
            int i4 = 0;
            while (i3 < i) {
                while (true) {
                    if (i3 >= i - 2) {
                        i3 = i;
                        break;
                    }
                    try {
                        if (bArr[i3] == 0 && bArr[i3 + 1] == 0 && bArr[i3 + 2] == 3) {
                            break;
                        }
                        i3++;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (i3 < i) {
                    int[] iArr = d;
                    if (iArr.length <= i4) {
                        d = Arrays.copyOf(iArr, iArr.length * 2);
                    }
                    d[i4] = i3;
                    i3 += 3;
                    i4++;
                }
            }
            i2 = i - i4;
            int i5 = 0;
            int i6 = 0;
            for (int i7 = 0; i7 < i4; i7++) {
                int i8 = d[i7] - i6;
                System.arraycopy(bArr, i6, bArr, i5, i8);
                int i9 = i5 + i8;
                int i10 = i9 + 1;
                bArr[i9] = 0;
                i5 = i9 + 2;
                bArr[i10] = 0;
                i6 += i8 + 3;
            }
            System.arraycopy(bArr, i6, bArr, i5, i2 - i5);
        }
        return i2;
    }

    public static int b(byte[] bArr, int i, int i2, boolean[] zArr) {
        int i3 = i2 - i;
        if (i3 < 0) {
            ny61.k();
            return 0;
        }
        if (i3 == 0) {
            return i2;
        }
        if (zArr[0]) {
            e(zArr);
            return i - 3;
        }
        if (i3 > 1 && zArr[1] && bArr[i] == 1) {
            e(zArr);
            return i - 2;
        }
        if (i3 > 2 && zArr[2] && bArr[i] == 0 && bArr[i + 1] == 1) {
            e(zArr);
            return i - 1;
        }
        int i4 = i2 - 1;
        int i5 = i + 2;
        while (i5 < i4) {
            byte b2 = bArr[i5];
            if ((b2 & 254) == 0) {
                int i6 = i5 - 2;
                if (bArr[i6] == 0 && bArr[i5 - 1] == 0 && b2 == 1) {
                    e(zArr);
                    return i6;
                }
                i5 -= 2;
            }
            i5 += 3;
        }
        zArr[0] = i3 <= 2 ? !(i3 != 2 ? !(zArr[1] && bArr[i4] == 1) : !(zArr[2] && bArr[i2 + (-2)] == 0 && bArr[i4] == 1)) : bArr[i2 + (-3)] == 0 && bArr[i2 + (-2)] == 0 && bArr[i4] == 1;
        zArr[1] = i3 <= 1 ? zArr[2] && bArr[i4] == 0 : bArr[i2 + (-2)] == 0 && bArr[i4] == 0;
        zArr[2] = bArr[i4] == 0;
        return i2;
    }

    public static nr41 c(byte[] bArr) {
        dl81 dl81Var = new dl81(bArr);
        if (dl81Var.c >= 32) {
            dl81Var.m(0);
            if (dl81Var.a() == (dl81Var.c - dl81Var.b) + 4 && dl81Var.a() == 1886614376) {
                int a2 = (dl81Var.a() >> 24) & 255;
                if (a2 > 1) {
                    nba1.e();
                    return null;
                }
                UUID uuid = new UUID(dl81Var.o(), dl81Var.o());
                if (a2 == 1) {
                    dl81Var.m(dl81Var.b + (dl81Var.v() * 16));
                }
                int v = dl81Var.v();
                if (v == dl81Var.c - dl81Var.b) {
                    dl81Var.d(0, v, new byte[v]);
                    return new nr41(13, uuid);
                }
            }
        }
        return null;
    }

    public static xy61 d(int i, int i2, byte[] bArr) {
        int i3;
        int i4;
        a69 a69Var = new a69(i + 2, i2, 5, bArr);
        int i5 = 4;
        a69Var.l(4);
        int e = a69Var.e(3);
        a69Var.n();
        int e2 = a69Var.e(2);
        boolean g = a69Var.g();
        int e3 = a69Var.e(5);
        int i6 = 0;
        for (int i7 = 0; i7 < 32; i7++) {
            if (a69Var.g()) {
                i6 |= 1 << i7;
            }
        }
        int i8 = 6;
        int i9 = i6;
        int[] iArr = new int[6];
        for (int i10 = 0; i10 < 6; i10++) {
            iArr[i10] = a69Var.e(8);
        }
        int e4 = a69Var.e(8);
        int i11 = 0;
        for (int i12 = 0; i12 < e; i12++) {
            if (a69Var.g()) {
                i11 += 89;
            }
            if (a69Var.g()) {
                i11 += 8;
            }
        }
        a69Var.l(i11);
        if (e > 0) {
            a69Var.l((8 - e) * 2);
        }
        a69Var.k();
        if (a69Var.k() == 3) {
            a69Var.n();
        }
        a69Var.k();
        a69Var.k();
        if (a69Var.g()) {
            a69Var.k();
            a69Var.k();
            a69Var.k();
            a69Var.k();
        }
        a69Var.k();
        a69Var.k();
        int k = a69Var.k();
        for (int i13 = a69Var.g() ? 0 : e; i13 <= e; i13++) {
            a69Var.k();
            a69Var.k();
            a69Var.k();
        }
        a69Var.k();
        a69Var.k();
        a69Var.k();
        a69Var.k();
        a69Var.k();
        a69Var.k();
        if (a69Var.g() && a69Var.g()) {
            int i14 = 0;
            while (i14 < i5) {
                int i15 = 0;
                while (i15 < i8) {
                    if (a69Var.g()) {
                        int min = Math.min(64, 1 << ((i14 << 1) + 4));
                        if (i14 > 1) {
                            a69Var.m();
                        }
                        for (int i16 = 0; i16 < min; i16++) {
                            a69Var.m();
                        }
                    } else {
                        a69Var.k();
                    }
                    i15 += i14 == 3 ? 3 : 1;
                    i8 = 6;
                }
                i14++;
                i5 = 4;
                i8 = 6;
            }
        }
        a69Var.l(2);
        if (a69Var.g()) {
            a69Var.l(8);
            a69Var.k();
            a69Var.k();
            a69Var.n();
        }
        int k2 = a69Var.k();
        int[] iArr2 = new int[0];
        int[] iArr3 = new int[0];
        int i17 = -1;
        int i18 = 0;
        int i19 = -1;
        while (i18 < k2) {
            if (i18 == 0 || !a69Var.g()) {
                i3 = k2;
                i4 = k;
                int k3 = a69Var.k();
                int k4 = a69Var.k();
                int[] iArr4 = new int[k3];
                for (int i20 = 0; i20 < k3; i20++) {
                    iArr4[i20] = a69Var.k() + 1;
                    a69Var.n();
                }
                int[] iArr5 = new int[k4];
                for (int i21 = 0; i21 < k4; i21++) {
                    iArr5[i21] = a69Var.k() + 1;
                    a69Var.n();
                }
                i17 = k3;
                iArr2 = iArr4;
                iArr3 = iArr5;
                i19 = k4;
            } else {
                int i22 = i17 + i19;
                int k5 = (1 - ((a69Var.g() ? 1 : 0) * 2)) * (a69Var.k() + 1);
                int i23 = i22 + 1;
                i3 = k2;
                boolean[] zArr = new boolean[i23];
                for (int i24 = 0; i24 <= i22; i24++) {
                    if (a69Var.g()) {
                        zArr[i24] = true;
                    } else {
                        zArr[i24] = a69Var.g();
                    }
                }
                int[] iArr6 = new int[i23];
                int[] iArr7 = new int[i23];
                int i25 = 0;
                for (int i26 = i19 - 1; i26 >= 0; i26--) {
                    int i27 = iArr3[i26] + k5;
                    if (i27 < 0 && zArr[i17 + i26]) {
                        iArr6[i25] = i27;
                        i25++;
                    }
                }
                if (k5 < 0 && zArr[i22]) {
                    iArr6[i25] = k5;
                    i25++;
                }
                i4 = k;
                int i28 = i25;
                int[] iArr8 = iArr2;
                for (int i29 = 0; i29 < i17; i29++) {
                    int i30 = iArr8[i29] + k5;
                    if (i30 < 0 && zArr[i29]) {
                        iArr6[i28] = i30;
                        i28++;
                    }
                }
                int[] copyOf = Arrays.copyOf(iArr6, i28);
                int i31 = 0;
                for (int i32 = i17 - 1; i32 >= 0; i32--) {
                    int i33 = iArr8[i32] + k5;
                    if (i33 > 0 && zArr[i32]) {
                        iArr7[i31] = i33;
                        i31++;
                    }
                }
                if (k5 > 0 && zArr[i22]) {
                    iArr7[i31] = k5;
                    i31++;
                }
                int i34 = i31;
                for (int i35 = 0; i35 < i19; i35++) {
                    int i36 = iArr3[i35] + k5;
                    if (i36 > 0 && zArr[i17 + i35]) {
                        iArr7[i34] = i36;
                        i34++;
                    }
                }
                iArr3 = Arrays.copyOf(iArr7, i34);
                i17 = i28;
                i19 = i34;
                iArr2 = copyOf;
            }
            i18++;
            k2 = i3;
            k = i4;
        }
        int i37 = k;
        if (a69Var.g()) {
            for (int i38 = 0; i38 < a69Var.k(); i38++) {
                a69Var.l(i37 + 5);
            }
        }
        a69Var.l(2);
        float f = 1.0f;
        if (a69Var.g()) {
            if (a69Var.g()) {
                int e5 = a69Var.e(8);
                if (e5 == 255) {
                    int e6 = a69Var.e(16);
                    int e7 = a69Var.e(16);
                    if (e6 != 0 && e7 != 0) {
                        f = e6 / e7;
                    }
                } else if (e5 < 17) {
                    f = b[e5];
                } else {
                    nba1.e();
                }
            }
            if (a69Var.g()) {
                a69Var.n();
            }
            if (a69Var.g()) {
                a69Var.l(4);
                if (a69Var.g()) {
                    a69Var.l(24);
                }
            }
            if (a69Var.g()) {
                a69Var.k();
                a69Var.k();
            }
            a69Var.n();
            a69Var.g();
        }
        return new xy61(e2, g, e3, i9, iArr, e4, f);
    }

    public static void e(boolean[] zArr) {
        zArr[0] = false;
        zArr[1] = false;
        zArr[2] = false;
    }

    public static byte[] f(UUID uuid, UUID[] uuidArr, byte[] bArr) {
        int length = (bArr != null ? bArr.length : 0) + 32;
        if (uuidArr != null) {
            length = b64.b(uuidArr.length, 16, 4, length);
        }
        ByteBuffer allocate = ByteBuffer.allocate(length);
        allocate.putInt(length);
        allocate.putInt(1886614376);
        allocate.putInt(uuidArr != null ? 16777216 : 0);
        allocate.putLong(uuid.getMostSignificantBits());
        allocate.putLong(uuid.getLeastSignificantBits());
        if (uuidArr != null) {
            allocate.putInt(uuidArr.length);
            for (UUID uuid2 : uuidArr) {
                allocate.putLong(uuid2.getMostSignificantBits());
                allocate.putLong(uuid2.getLeastSignificantBits());
            }
        }
        if (bArr != null && bArr.length != 0) {
            allocate.putInt(bArr.length);
            allocate.put(bArr);
        }
        return allocate.array();
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0162  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static e571 g(int i, int i2, byte[] bArr) {
        int k;
        boolean g;
        a69 a69Var;
        int i3;
        int i4;
        boolean z;
        boolean g2;
        float f;
        int e;
        a69 a69Var2 = new a69(i + 1, i2, 5, bArr);
        int i5 = 8;
        int e2 = a69Var2.e(8);
        int e3 = a69Var2.e(8);
        int e4 = a69Var2.e(8);
        int k2 = a69Var2.k();
        if (e2 == 100 || e2 == 110 || e2 == 122 || e2 == 244 || e2 == 44 || e2 == 83 || e2 == 86 || e2 == 118 || e2 == 128 || e2 == 138) {
            k = a69Var2.k();
            g = k == 3 ? a69Var2.g() : false;
            a69Var2.k();
            a69Var2.k();
            a69Var2.n();
            if (a69Var2.g()) {
                int i6 = k != 3 ? 8 : 12;
                int i7 = 0;
                while (i7 < i6) {
                    if (a69Var2.g()) {
                        int i8 = i7 < 6 ? 16 : 64;
                        int i9 = 8;
                        int i10 = 8;
                        for (int i11 = 0; i11 < i8; i11++) {
                            if (i9 != 0) {
                                i9 = ((a69Var2.m() + i10) + 256) % 256;
                            }
                            if (i9 != 0) {
                                i10 = i9;
                            }
                        }
                    }
                    i7++;
                }
            }
        } else {
            k = 1;
            g = false;
        }
        int k3 = a69Var2.k() + 4;
        int k4 = a69Var2.k();
        if (k4 == 0) {
            i4 = a69Var2.k() + 4;
            a69Var = a69Var2;
            i3 = 16;
        } else {
            if (k4 == 1) {
                boolean g3 = a69Var2.g();
                a69Var2.m();
                a69Var2.m();
                i3 = 16;
                long k5 = a69Var2.k();
                a69Var = a69Var2;
                for (int i12 = 0; i12 < k5; i12++) {
                    a69Var.k();
                }
                z = g3;
                i5 = 8;
                i4 = 0;
                a69Var.k();
                a69Var.n();
                int k6 = a69Var.k() + 1;
                int k7 = a69Var.k() + 1;
                g2 = a69Var.g();
                int i13 = 2 - (g2 ? 1 : 0);
                int i14 = k7 * i13;
                if (!g2) {
                    a69Var.n();
                }
                a69Var.n();
                int i15 = k6 * 16;
                int i16 = i14 * 16;
                if (a69Var.g()) {
                    int k8 = a69Var.k();
                    int k9 = a69Var.k();
                    int k10 = a69Var.k();
                    int k11 = a69Var.k();
                    if (k != 0) {
                        int i17 = k == 3 ? 1 : 2;
                        i13 *= k == 1 ? 2 : 1;
                        r0 = i17;
                    }
                    i15 -= (k8 + k9) * r0;
                    i16 -= (k10 + k11) * i13;
                }
                int i18 = i15;
                if (a69Var.g() && a69Var.g()) {
                    e = a69Var.e(i5);
                    if (e != 255) {
                        int i19 = i3;
                        int e5 = a69Var.e(i19);
                        int e6 = a69Var.e(i19);
                        if (e5 != 0 && e6 != 0) {
                            f = e5 / e6;
                        }
                    } else if (e < 17) {
                        f = b[e];
                    } else {
                        nba1.e();
                    }
                    return new e571(e2, e3, e4, k2, i18, i16, f, g, g2, k3, k4, i4, z);
                }
                f = 1.0f;
                return new e571(e2, e3, e4, k2, i18, i16, f, g, g2, k3, k4, i4, z);
            }
            a69Var = a69Var2;
            i3 = 16;
            i4 = 0;
        }
        z = false;
        a69Var.k();
        a69Var.n();
        int k62 = a69Var.k() + 1;
        int k72 = a69Var.k() + 1;
        g2 = a69Var.g();
        int i132 = 2 - (g2 ? 1 : 0);
        int i142 = k72 * i132;
        if (!g2) {
        }
        a69Var.n();
        int i152 = k62 * 16;
        int i162 = i142 * 16;
        if (a69Var.g()) {
        }
        int i182 = i152;
        if (a69Var.g()) {
            e = a69Var.e(i5);
            if (e != 255) {
            }
            return new e571(e2, e3, e4, k2, i182, i162, f, g, g2, k3, k4, i4, z);
        }
        f = 1.0f;
        return new e571(e2, e3, e4, k2, i182, i162, f, g, g2, k3, k4, i4, z);
    }

    public static final void h(z22 z22Var, String str) {
        ((a) z22Var).a(new keo("nfc_close_error", b.i(new Pair(DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, "Ошибка закрытия потока чтения/записи NFC модуля: ".concat(str)), new Pair(CRLReasonCodeExtension.REASON, str))));
    }

    public static final void i(z22 z22Var, String str) {
        ((a) z22Var).a(new keo("nfc_read_blocks_error", b.i(new Pair(DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, "Ошибка чтения блоков карты: ".concat(str)), new Pair(CRLReasonCodeExtension.REASON, str))));
    }

    public static final void j(z22 z22Var, String str) {
        ((a) z22Var).a(new keo("nfc_read_card_number_error", b.i(new Pair(DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, "Ошибка чтения номера карты: ".concat(str)), new Pair(CRLReasonCodeExtension.REASON, str))));
    }

    public static final void k(z22 z22Var, String str) {
        ((a) z22Var).a(new keo("nfc_write_blocks_error", b.i(new Pair(DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, "Ошибка записи блоков на карту: ".concat(str)), new Pair(CRLReasonCodeExtension.REASON, str))));
    }

    public static void l(String str) {
        if (str == null || evu0.J(str)) {
            throw new PushTokenValidationException("empty_token");
        }
        if (!f5g0.a.h(str)) {
            throw new PushTokenValidationException("invalid_token");
        }
    }
}
