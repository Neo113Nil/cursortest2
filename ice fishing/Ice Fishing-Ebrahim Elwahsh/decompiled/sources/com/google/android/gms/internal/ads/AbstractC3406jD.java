package com.google.android.gms.internal.ads;

import android.media.AudioDescriptor;
import android.os.Build;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.math.BigDecimal;
import java.security.GeneralSecurityException;
import java.security.NoSuchAlgorithmException;
import java.security.spec.ECParameterSpec;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;

/* renamed from: com.google.android.gms.internal.ads.jD, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC3406jD {
    public static C2593Hm a(String str) {
        String str2;
        try {
            try {
                byte[] b9 = new C3677oE(new ByteArrayInputStream(str.getBytes(C3677oE.f33118b))).a().b();
                try {
                    YK yk = YK.f28820a;
                    int i = KK.f25952a;
                    C3842rI E8 = C3842rI.E(b9, YK.f28821b);
                    for (C3789qI c3789qI : E8.B()) {
                        if (c3789qI.B().C() == 1 || c3789qI.B().C() == 2 || c3789qI.B().C() == 3) {
                            switch (c3789qI.B().C()) {
                                case 1:
                                    str2 = "UNKNOWN_KEYMATERIAL";
                                    break;
                                case 2:
                                    str2 = "SYMMETRIC";
                                    break;
                                case 3:
                                    str2 = "ASYMMETRIC_PRIVATE";
                                    break;
                                case 4:
                                    str2 = "ASYMMETRIC_PUBLIC";
                                    break;
                                case 5:
                                    str2 = "REMOTE";
                                    break;
                                case 6:
                                    str2 = "UNRECOGNIZED";
                                    break;
                                default:
                                    throw null;
                            }
                            throw new GeneralSecurityException("keyset contains key material of type " + str2 + " for type url " + c3789qI.B().A());
                        }
                    }
                    return C2593Hm.d(E8);
                } catch (C3845rL unused) {
                    throw new GeneralSecurityException("invalid keyset");
                }
            } catch (C3845rL unused2) {
                throw new GeneralSecurityException("invalid keyset");
            }
        } catch (IOException unused3) {
            throw new GeneralSecurityException("Parse keyset failed");
        }
    }

    public static UB b(List list) {
        int standard;
        byte[] descriptor;
        if (Build.VERSION.SDK_INT < 31 || list == null) {
            SB sb = UB.f27942u;
            return C3675oC.f33115x;
        }
        TreeSet treeSet = new TreeSet(Comparator.comparing(C2930aP.f29203b).reversed());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AudioDescriptor e6 = TO.e(it.next());
            standard = e6.getStandard();
            if (standard == 1) {
                descriptor = e6.getDescriptor();
                int length = descriptor.length;
                if (length != 3) {
                    com.anythink.basead.b.c.i.s(length, "Invalid SAD length: ", "AudioDescriptorUtil", new StringBuilder(String.valueOf(length).length() + 20));
                } else {
                    byte b9 = descriptor[0];
                    int i = (b9 & 7) + 1;
                    if (((b9 >> 3) & 15) == 1) {
                        treeSet.add(Integer.valueOf(AbstractC3548lu.e(i)));
                    }
                }
            }
        }
        return UB.n(treeSet);
    }

    public static BigDecimal c(String str) {
        h(str);
        BigDecimal bigDecimal = new BigDecimal(str);
        if (Math.abs(bigDecimal.scale()) < 10000) {
            return bigDecimal;
        }
        throw new NumberFormatException("Number has unsupported scale: ".concat(str));
    }

    public static void d() {
        try {
            if (JF.a()) {
                throw new GeneralSecurityException("Cannot use non-FIPS-compliant AeadConfigurationV1 in FIPS mode");
            }
        } catch (GeneralSecurityException e6) {
            throw new IllegalStateException(e6);
        }
    }

    public static ECParameterSpec f(EnumC3034cK enumC3034cK) {
        int ordinal = enumC3034cK.ordinal();
        if (ordinal == 0) {
            return PF.f26886a;
        }
        if (ordinal == 1) {
            return PF.f26887b;
        }
        if (ordinal == 2) {
            return PF.f26888c;
        }
        throw new NoSuchAlgorithmException("curve not implemented:".concat(enumC3034cK.toString()));
    }

    public static void h(String str) {
        if (str.length() <= 10000) {
            return;
        }
        String substring = str.substring(0, 30);
        throw new NumberFormatException(D.y.o(new StringBuilder(String.valueOf(substring).length() + 28), "Number string too large: ", substring, "..."));
    }

    public static byte[] j(byte[] bArr) {
        int length;
        int i = 0;
        while (true) {
            length = bArr.length;
            if (i >= length || bArr[i] != 0) {
                break;
            }
            i++;
        }
        if (i == length) {
            i = length - 1;
        }
        int i4 = (bArr[i] & com.anythink.core.common.s.a.c.f16474a) == 128 ? 1 : 0;
        int i9 = length - i;
        byte[] bArr2 = new byte[i9 + i4];
        System.arraycopy(bArr, i, bArr2, i4, i9);
        return bArr2;
    }

    public static boolean m(byte b9) {
        return b9 > -65;
    }

    public abstract void e(C3784qD c3784qD, Thread thread);

    public abstract void g(C3784qD c3784qD, C3784qD c3784qD2);

    public abstract boolean i(AbstractC3837rD abstractC3837rD, C3784qD c3784qD, C3784qD c3784qD2);

    public abstract boolean k(AbstractC3354iD abstractC3354iD, C3191fD c3191fD, C3191fD c3191fD2);

    public abstract C3784qD l(AbstractC3354iD abstractC3354iD);

    public abstract C3191fD n(AbstractC3354iD abstractC3354iD);

    public abstract boolean o(AbstractC3837rD abstractC3837rD, Object obj, Object obj2);
}
