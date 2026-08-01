package com.google.android.gms.internal.ads;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;

/* renamed from: com.google.android.gms.internal.ads.iD, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC3341iD {
    public static S0.l a(String str) {
        try {
            try {
                byte[] b9 = new C3502lE(new ByteArrayInputStream(str.getBytes(C3502lE.f31748b))).a().b();
                try {
                    PK pk = PK.f26757a;
                    int i = BK.f23877a;
                    C3506lI E8 = C3506lI.E(b9, PK.f26758b);
                    for (C3452kI c3452kI : E8.B()) {
                        if (c3452kI.B().G() == 2 || c3452kI.B().G() == 3 || c3452kI.B().G() == 4) {
                            int G7 = c3452kI.B().G();
                            throw new GeneralSecurityException("keyset contains key material of type " + (G7 != 2 ? G7 != 3 ? G7 != 4 ? G7 != 5 ? G7 != 6 ? "UNRECOGNIZED" : "REMOTE" : "ASYMMETRIC_PUBLIC" : "ASYMMETRIC_PRIVATE" : "SYMMETRIC" : "UNKNOWN_KEYMATERIAL") + " for type url " + c3452kI.B().A());
                        }
                    }
                    return S0.l.I(E8);
                } catch (C3295hL unused) {
                    throw new GeneralSecurityException("invalid keyset");
                }
            } catch (C3295hL unused2) {
                throw new GeneralSecurityException("invalid keyset");
            }
        } catch (IOException unused3) {
            throw new GeneralSecurityException("Parse keyset failed");
        }
    }

    public static String b(byte[] bArr) {
        StringBuilder sb = new StringBuilder(bArr.length);
        for (byte b9 : bArr) {
            if (b9 == 34) {
                sb.append("\\\"");
            } else if (b9 == 39) {
                sb.append("\\'");
            } else if (b9 != 92) {
                switch (b9) {
                    case 7:
                        sb.append("\\a");
                        break;
                    case 8:
                        sb.append("\\b");
                        break;
                    case 9:
                        sb.append("\\t");
                        break;
                    case 10:
                        sb.append("\\n");
                        break;
                    case 11:
                        sb.append("\\v");
                        break;
                    case 12:
                        sb.append("\\f");
                        break;
                    case 13:
                        sb.append("\\r");
                        break;
                    default:
                        if (b9 < 32 || b9 > 126) {
                            sb.append('\\');
                            sb.append((char) (((b9 >>> 6) & 3) + 48));
                            sb.append((char) (((b9 >>> 3) & 7) + 48));
                            sb.append((char) ((b9 & 7) + 48));
                            break;
                        } else {
                            sb.append((char) b9);
                            break;
                        }
                }
            } else {
                sb.append("\\\\");
            }
        }
        return sb.toString();
    }

    public static void c() {
        try {
            if (HF.a()) {
                throw new GeneralSecurityException("Cannot use non-FIPS-compliant AeadConfigurationV1 in FIPS mode");
            }
        } catch (GeneralSecurityException e9) {
            throw new IllegalStateException(e9);
        }
    }

    public static void d(int i) {
        if (i != 16 && i != 32) {
            throw new InvalidAlgorithmParameterException(String.format("invalid key size %d; only 128-bit and 256-bit AES keys are supported", Integer.valueOf(i * 8)));
        }
    }

    public static void f(Object obj, String str) {
        if (obj == null) {
            throw new NullPointerException(str);
        }
    }

    public static int g(int i) {
        if (i == 0) {
            return 2;
        }
        if (i == 1) {
            return 3;
        }
        if (i == 2) {
            return 4;
        }
        if (i == 3) {
            return 5;
        }
        if (i != 4) {
            return i != 5 ? 0 : 7;
        }
        return 6;
    }

    public static void i(ZJ zj) {
        int ordinal = zj.ordinal();
        if (ordinal != 2 && ordinal != 3 && ordinal != 4) {
            throw new GeneralSecurityException("Unsupported hash: ".concat(String.valueOf(zj.name())));
        }
    }

    public static void j(Object obj) {
        if (obj == null) {
            throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
        }
    }

    public static void k(int i) {
        if (i < 2048) {
            throw new GeneralSecurityException(String.format("Modulus size is %d; only modulus size >= 2048-bit is supported", Integer.valueOf(i)));
        }
        if (HF.a() && i != 2048 && i != 3072) {
            throw new GeneralSecurityException(String.format("Modulus size is %d; only modulus size of 2048- or 3072-bit is supported in FIPS mode.", Integer.valueOf(i)));
        }
    }

    public static void l(Class cls, Object obj) {
        if (obj == null) {
            throw new IllegalStateException(String.valueOf(cls.getCanonicalName()).concat(" must be set"));
        }
    }

    public static void n(BigInteger bigInteger) {
        if (!bigInteger.testBit(0)) {
            throw new GeneralSecurityException("Public exponent must be odd.");
        }
        if (bigInteger.compareTo(BigInteger.valueOf(65536L)) <= 0) {
            throw new GeneralSecurityException("Public exponent must be greater than 65536.");
        }
    }

    public abstract void e(C3717pD c3717pD, Thread thread);

    public abstract void h(C3717pD c3717pD, C3717pD c3717pD2);

    public abstract boolean m(AbstractC3771qD abstractC3771qD, C3717pD c3717pD, C3717pD c3717pD2);

    public abstract boolean o(AbstractC3287hD abstractC3287hD, C3125eD c3125eD, C3125eD c3125eD2);

    public abstract C3717pD p(AbstractC3287hD abstractC3287hD);

    public abstract C3125eD q(AbstractC3287hD abstractC3287hD);

    public abstract boolean r(AbstractC3771qD abstractC3771qD, Object obj, Object obj2);
}
