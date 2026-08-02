package defpackage;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.TimeoutCancellationException;
import kotlinx.coroutines.a;

/* loaded from: classes9.dex */
public final class zdz0 extends fbp0 implements Runnable {
    public final long z;

    public zdz0(long j, ContinuationImpl continuationImpl) {
        super(continuationImpl.get_context(), continuationImpl);
        this.z = j;
    }

    @Override // kotlinx.coroutines.c
    public final String V() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.V());
        sb.append("(timeMillis=");
        return b64.o(sb, this.z, ')');
    }

    @Override // java.lang.Runnable
    public final void run() {
        fse fseVar = this.x;
        a.m(fseVar);
        pse pseVar = (pse) fseVar.get(pse.b);
        String str = pseVar != null ? pseVar.a : null;
        String k = qv10.k(this.z, "Timed out waiting for ", " ms");
        if (str != null) {
            StringBuilder x = unr0.x("Coroutine \"", str, "\" ");
            if (k.length() > 0) {
                k = Character.toLowerCase(k.charAt(0)) + k.substring(1);
            }
            x.append(k);
            k = x.toString();
        }
        t(new TimeoutCancellationException(k, this));
    }
}
