package defpackage;

import kotlin.NotImplementedError;
import kotlin.Result;

/* loaded from: classes11.dex */
public abstract class un91 {
    public static final vzb0 a = new vzb0();

    public static final Result.Failure a(String str) {
        return new Result.Failure(new NotImplementedError(str));
    }

    public static final tls b(tls tlsVar, tls tlsVar2, fid fidVar) {
        bts btsVar = (bts) fidVar;
        Object Q = btsVar.Q();
        if (Q == did.a) {
            Q = new wnf0(tlsVar, tlsVar2, 10);
            btsVar.o0(Q);
        }
        return (tls) Q;
    }
}
