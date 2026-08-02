package defpackage;

import java.io.IOException;
import java.nio.charset.Charset;

/* loaded from: classes.dex */
public abstract class lax {
    protected int zza;

    public abstract int a(iex iexVar);

    public final byte[] b() {
        try {
            mcx mcxVar = (mcx) this;
            int e = mcxVar.e();
            byte[] bArr = new byte[e];
            kbx kbxVar = new kbx(bArr, e);
            iex a = fex.c.a(mcxVar.getClass());
            gao gaoVar = kbxVar.a;
            if (gaoVar == null) {
                gaoVar = new gao();
                Charset charset = xcx.a;
                gaoVar.a = kbxVar;
                kbxVar.a = gaoVar;
            }
            a.b(mcxVar, gaoVar);
            if (e - kbxVar.d == 0) {
                return bArr;
            }
            throw new IllegalStateException("Did not write as much data as expected.");
        } catch (IOException e2) {
            kac.k(hrg.q("Serializing ", getClass().getName(), " to a byte array threw an IOException (should never happen)."), e2);
            return null;
        }
    }
}
