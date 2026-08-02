package defpackage;

import java.util.Map;
import kotlin.Result;

/* loaded from: classes.dex */
public final /* synthetic */ class zk6 implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;

    public /* synthetic */ zk6(long j, int i) {
        this.a = i;
        this.b = j;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        j18 j18Var;
        Object failure;
        int i = this.a;
        long j = this.b;
        switch (i) {
            case 0:
                al6 al6Var = (al6) obj;
                tls tlsVar = al6Var.b;
                if (tlsVar != null && (j18Var = al6Var.a) != null) {
                    try {
                        failure = tlsVar.invoke(Long.valueOf(j));
                    } catch (Throwable th) {
                        failure = new Result.Failure(th);
                    }
                    j18Var.resumeWith(failure);
                }
                return zy11.a;
            case 1:
                return Boolean.valueOf(j - ((Long) obj).longValue() >= 300);
            case 2:
                return Boolean.valueOf(((Number) ((Map.Entry) obj).getValue()).longValue() >= j);
            case 3:
                return Long.valueOf(j);
            case 4:
                ((ez40) obj).g(xeu.b, Long.valueOf(j));
                return null;
            default:
                return Boolean.valueOf(((uku0) obj).d > j);
        }
    }
}
