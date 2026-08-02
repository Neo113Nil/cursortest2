package defpackage;

import android.os.Handler;
import java.io.Closeable;
import java.util.List;

/* loaded from: classes15.dex */
public final /* synthetic */ class zn41 implements Closeable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ bo41 b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object w;

    public /* synthetic */ zn41(pw50 pw50Var, bo41 bo41Var, do41 do41Var) {
        this.c = pw50Var;
        this.b = bo41Var;
        this.w = do41Var;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        int i = this.a;
        Object obj = this.w;
        bo41 bo41Var = this.b;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                v221 v221Var = (v221) obj;
                jl40.m();
                List list = (List) bo41Var.b.get((String) obj2);
                if (list != null) {
                    list.remove(v221Var);
                    break;
                }
                break;
            default:
                jl40.m();
                ((pw50) obj2).close();
                ((Handler) vx21.a.getValue()).post(new bh11(14, new hh31(13, bo41Var, (do41) obj)));
                break;
        }
    }

    public /* synthetic */ zn41(bo41 bo41Var, String str, v221 v221Var) {
        this.b = bo41Var;
        this.c = str;
        this.w = v221Var;
    }
}
