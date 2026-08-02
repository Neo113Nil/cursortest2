package defpackage;

import com.google.crypto.tink.shaded.protobuf.a;
import java.io.IOException;

/* loaded from: classes3.dex */
public abstract class d8 {
    protected int memoizedHashCode;

    public abstract int a();

    public final String b(String str) {
        return "Serializing " + getClass().getName() + " to a " + str + " threw an IOException (should never happen).";
    }

    public final byte[] c() {
        try {
            int a = a();
            byte[] bArr = new byte[a];
            a aVar = new a(bArr, a);
            d(aVar);
            if (a - aVar.d == 0) {
                return bArr;
            }
            throw new IllegalStateException("Did not write as much data as expected.");
        } catch (IOException e) {
            kac.k(b("byte array"), e);
            return null;
        }
    }

    public abstract void d(a aVar);
}
