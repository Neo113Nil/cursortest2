package defpackage;

import io.appmetrica.analytics.networkokhttp.impl.c;
import io.appmetrica.analytics.networkokhttp.impl.d;

/* loaded from: classes9.dex */
public final /* synthetic */ class zf61 implements yfo {
    public final /* synthetic */ int a;
    public final /* synthetic */ bgo b;

    public /* synthetic */ zf61(bgo bgoVar, int i) {
        this.a = i;
        this.b = bgoVar;
    }

    @Override // defpackage.yfo
    public final bgo create(yf7 yf7Var) {
        int i = this.a;
        bgo bgoVar = this.b;
        switch (i) {
            case 0:
                return bgoVar;
            default:
                return c.a((d) bgoVar, yf7Var);
        }
    }
}
