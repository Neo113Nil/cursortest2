package ru.CryptoPro.JCSP.tools;

import defpackage.b64;
import defpackage.ny61;
import ru.CryptoPro.JCSP.JCSPLogger;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes4.dex */
public class cl_0 {
    private final HProv[][] a;
    private final int b;
    private final boolean c;

    public cl_0(int i, boolean z) {
        this.a = new HProv[6][];
        JCSPLogger.fine("Initializing of the context pool with size = " + i + ", reserve = " + z + "...");
        this.b = i;
        this.c = z;
        int[] iArr = {75, 80, 81, 24, 16, 32};
        int i2 = 0;
        for (int i3 = 0; i3 < 6; i3++) {
            this.a[i3] = new HProv[this.b];
            for (int i4 = 0; i4 < this.b; i4++) {
                try {
                    this.a[i3][i4] = a(iArr[i3], false);
                } catch (Exception e) {
                    JCSPLogger.ignoredException(e);
                    i2++;
                }
            }
        }
        JCSPLogger.fine("Initializing of the context pool completed, errors: " + i2);
    }

    private static int[] b(int i, boolean z) {
        return i != 16 ? i != 24 ? i != 32 ? i != 80 ? i != 81 ? new int[]{0, z ? 1 : 0} : new int[]{2, 2} : new int[]{1, 1} : new int[]{5, 5} : new int[]{3, 3} : new int[]{4, 4};
    }

    public HProv a(int i) {
        int id = (int) (Thread.currentThread().getId() & (this.b - 1));
        int[] b = b(i, this.c);
        int i2 = b[0];
        int i3 = b[1];
        HProv hProv = this.a[i2][id];
        if (hProv != null) {
            return hProv;
        }
        if (JCSPLogger.isFinerEnabled()) {
            StringBuilder s = b64.s(i, i2, "Warning! Context has not been found for this object: provider type = ", ", index = ", ". Trying to use reserve index = ");
            s.append(i3);
            s.append("...");
            JCSPLogger.finer(s.toString());
        }
        HProv hProv2 = this.a[i3][id];
        if (hProv2 != null) {
            return hProv2;
        }
        ny61.r(b64.d(i, i, "Context pool is being used but required context of the provider with type ", " is undefined. The provider with such type might has not been found during the pool initiation. Try to install provider with type ", " or change default provider for this type (check 'Java CSP Settings'). If session key encryption is being used than check if CSP provider with 75 type has been installed."));
        return null;
    }

    public static HProv a(int i, boolean z) {
        HProv provider = HProv.getProvider(i);
        if (z) {
            provider.createWithoutContainer(null);
            return provider;
        }
        provider.createWithoutContainer();
        return provider;
    }

    public cl_0(int i) {
        this(i, true);
    }
}
