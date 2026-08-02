package defpackage;

import android.content.Context;
import android.text.SpannableStringBuilder;
import java.nio.ByteBuffer;
import java.util.UUID;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.CryptoPro.JCSP.CSPVersionUtility;
import yads.aa2;

/* loaded from: classes11.dex */
public abstract class vaa1 {
    public static final int[] a = {96000, 88200, 64000, 48000, 44100, 32000, 24000, 22050, 16000, CSPVersionUtility.CSP_BUILD_R2, 11025, 8000, 7350};
    public static final int[] b = {0, 1, 2, 3, 4, 5, 6, 8, -1, -1, -1, 7, 8, -1, 8, -1};

    public static a4 a(uh81 uh81Var, boolean z) {
        int i;
        int i2;
        int a2 = uh81Var.a(5);
        if (a2 == 31) {
            a2 = uh81Var.a(6) + 32;
        }
        int a3 = uh81Var.a(4);
        int[] iArr = a;
        if (a3 == 15) {
            i = uh81Var.a(24);
        } else {
            if (a3 >= 13) {
                throw new aa2(null, null, true, 1);
            }
            i = iArr[a3];
        }
        int a4 = uh81Var.a(4);
        String c = q8a1.c(a2, "mp4a.40.");
        if (a2 == 5 || a2 == 29) {
            int a5 = uh81Var.a(4);
            if (a5 == 15) {
                i2 = uh81Var.a(24);
            } else {
                if (a5 >= 13) {
                    throw new aa2(null, null, true, 1);
                }
                i2 = iArr[a5];
            }
            i = i2;
            int a6 = uh81Var.a(5);
            if (a6 == 31) {
                a6 = uh81Var.a(6) + 32;
            }
            a2 = a6;
            if (a2 == 22) {
                a4 = uh81Var.a(4);
            }
        }
        if (z) {
            if (a2 != 6 && a2 != 7 && a2 != 17 && a2 != 1 && a2 != 2 && a2 != 3 && a2 != 4) {
                switch (a2) {
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                        break;
                    default:
                        throw aa2.a("Unsupported audio object type: " + a2);
                }
            }
            if (uh81Var.k()) {
                nba1.e();
            }
            if (uh81Var.k()) {
                uh81Var.h(14);
            }
            boolean k = uh81Var.k();
            if (a4 == 0) {
                w511.u();
                return null;
            }
            if (a2 == 6 || a2 == 20) {
                uh81Var.h(3);
            }
            if (k) {
                if (a2 == 22) {
                    uh81Var.h(16);
                }
                if (a2 == 17 || a2 == 19 || a2 == 20 || a2 == 23) {
                    uh81Var.h(3);
                }
                uh81Var.h(1);
            }
            switch (a2) {
                case 17:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                    int a7 = uh81Var.a(2);
                    if (a7 == 2 || a7 == 3) {
                        throw aa2.a("Unsupported epConfig: " + a7);
                    }
            }
        }
        int i3 = b[a4];
        if (i3 != -1) {
            return new a4(i, i3, c);
        }
        throw new aa2(null, null, true, 1);
    }

    public static void b(SpannableStringBuilder spannableStringBuilder, Object obj, int i, int i2) {
        for (Object obj2 : spannableStringBuilder.getSpans(i, i2, obj.getClass())) {
            if (spannableStringBuilder.getSpanStart(obj2) == i && spannableStringBuilder.getSpanEnd(obj2) == i2 && spannableStringBuilder.getSpanFlags(obj2) == 33) {
                spannableStringBuilder.removeSpan(obj2);
            }
        }
        spannableStringBuilder.setSpan(obj, i, i2, 33);
    }

    public static byte[] c(UUID uuid, UUID[] uuidArr, byte[] bArr) {
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
        if (bArr == null || bArr.length == 0) {
            allocate.putInt(0);
        } else {
            allocate.putInt(bArr.length);
            allocate.put(bArr);
        }
        return allocate.array();
    }

    public static String d(int i, Context context) {
        if (context == null) {
            return "";
        }
        if (i == 1) {
            return context.getString(pxh0.fingerprint_error_hw_not_available);
        }
        if (i != 7) {
            switch (i) {
                case 9:
                    break;
                case 10:
                    return context.getString(pxh0.fingerprint_error_user_canceled);
                case 11:
                    return context.getString(pxh0.fingerprint_error_no_fingerprints);
                case 12:
                    return context.getString(pxh0.fingerprint_error_hw_not_present);
                default:
                    nnm.q(i, "Unknown error code: ", "BiometricUtils");
                    return context.getString(pxh0.default_error_msg);
            }
        }
        return context.getString(pxh0.fingerprint_error_lockout);
    }

    public static lg e(byte[] bArr) {
        UUID[] uuidArr;
        ef90 ef90Var = new ef90(bArr);
        if (ef90Var.c < 32) {
            return null;
        }
        ef90Var.K(0);
        int a2 = ef90Var.a();
        int k = ef90Var.k();
        if (k != a2) {
            lk91.j("Advertised atom size (" + k + ") does not match buffer size: " + a2);
            return null;
        }
        int k2 = ef90Var.k();
        if (k2 != 1886614376) {
            xvz.v(k2, "Atom type is not pssh: ");
            return null;
        }
        int c = aj6.c(ef90Var.k());
        if (c > 1) {
            xvz.v(c, "Unsupported pssh version: ");
            return null;
        }
        UUID uuid = new UUID(ef90Var.s(), ef90Var.s());
        if (c == 1) {
            int C = ef90Var.C();
            uuidArr = new UUID[C];
            for (int i = 0; i < C; i++) {
                uuidArr[i] = new UUID(ef90Var.s(), ef90Var.s());
            }
        } else {
            uuidArr = null;
        }
        int C2 = ef90Var.C();
        int a3 = ef90Var.a();
        if (C2 == a3) {
            byte[] bArr2 = new byte[C2];
            ef90Var.i(0, C2, bArr2);
            return new lg(uuid, c, bArr2, uuidArr);
        }
        lk91.j("Atom data size (" + C2 + ") does not match the bytes left: " + a3);
        return null;
    }

    public static byte[] f(UUID uuid, byte[] bArr) {
        lg e = e(bArr);
        if (e == null) {
            return null;
        }
        UUID uuid2 = (UUID) e.b;
        if (uuid.equals(uuid2)) {
            return (byte[]) e.c;
        }
        lk91.j("UUID mismatch. Expected: " + uuid + ", got: " + uuid2 + Extension.DOT_CHAR);
        return null;
    }
}
