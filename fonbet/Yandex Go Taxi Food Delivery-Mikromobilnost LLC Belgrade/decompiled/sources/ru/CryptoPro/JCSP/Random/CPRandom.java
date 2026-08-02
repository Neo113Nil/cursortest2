package ru.CryptoPro.JCSP.Random;

import defpackage.ny61;
import java.util.Arrays;
import ru.CryptoPro.JCP.Random.RandomInterface;
import ru.CryptoPro.JCP.Util.GetProperty;
import ru.CryptoPro.JCSP.MSCAPI.CSPProv2012_256;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.CryptoPro.JCSP.MSCAPI.MSException;

/* loaded from: classes4.dex */
public abstract class CPRandom extends BaseRandom {
    public static final int RANDOM_CONTEXT_POOL_SIZE;
    public static final int RANDOM_CONTEXT_POOL_SIZE_DEFAULT = 8;
    public static final int RND_SEED_LEN = 44;
    public static final boolean USE_RANDOM_CONTEXT_POOL = GetProperty.getBooleanProperty("use_random_context_pool", false);
    static final /* synthetic */ boolean a = true;
    private static final int b = 11;
    private static final int c;
    private static ru.CryptoPro.JCSP.tools.cl_0 d;

    public static class cl_0 {
        private cl_0() {
            ru.CryptoPro.JCSP.tools.cl_0 unused = CPRandom.d = new ru.CryptoPro.JCSP.tools.cl_0(CPRandom.c);
        }
    }

    public static class cl_1 {
        private static final cl_0 a = new cl_0();

        private cl_1() {
        }
    }

    static {
        int integerProperty = GetProperty.getIntegerProperty("random_context_pool_size", 8);
        RANDOM_CONTEXT_POOL_SIZE = integerProperty;
        c = integerProperty > 0 ? integerProperty : 8;
    }

    private static void c() {
        cl_0 cl_0Var = cl_1.a;
        if (a || cl_0Var != null) {
            return;
        }
        ny61.w();
    }

    @Override // ru.CryptoPro.JCSP.Random.BaseRandom, ru.CryptoPro.JCP.Random.RandomInterface
    public boolean isReady() {
        return true;
    }

    @Override // ru.CryptoPro.JCSP.Random.BaseRandom, ru.CryptoPro.JCP.Random.RandomInterface
    public void makeRandom(byte[] bArr, int i, int i2) {
        HProv cSPProv2012_256;
        byte[] bArr2 = new byte[i2];
        HProv hProv = null;
        try {
            boolean z = USE_RANDOM_CONTEXT_POOL;
            if (z) {
                c();
                cSPProv2012_256 = d.a(80);
            } else {
                cSPProv2012_256 = new CSPProv2012_256();
                try {
                    cSPProv2012_256.createWithoutContainer();
                } catch (Throwable th) {
                    th = th;
                    hProv = cSPProv2012_256;
                    if (!USE_RANDOM_CONTEXT_POOL && hProv != null) {
                        hProv.releaseContext(5);
                    }
                    throw th;
                }
            }
            if (a()) {
                try {
                    cSPProv2012_256.setProvParam(38, null, 0);
                } catch (MSException e) {
                    throw new IllegalArgumentException("PP_USE_HARDWARE_RNG failed.", e);
                }
            }
            cSPProv2012_256.getRandom(bArr2);
            if (!z) {
                cSPProv2012_256.releaseContext(5);
            }
            System.arraycopy(bArr2, 0, bArr, i, i2);
            Arrays.fill(bArr2, (byte) 0);
        } catch (Throwable th2) {
            th = th2;
        }
    }

    @Override // ru.CryptoPro.JCSP.Random.BaseRandom, ru.CryptoPro.JCP.Random.RandomInterface
    public void setRandomSeed(RandomInterface randomInterface) {
    }

    @Override // ru.CryptoPro.JCSP.Random.BaseRandom, ru.CryptoPro.JCP.Random.RandomInterface
    public void setRandomSeed(byte[] bArr) {
    }

    public boolean a() {
        return false;
    }
}
