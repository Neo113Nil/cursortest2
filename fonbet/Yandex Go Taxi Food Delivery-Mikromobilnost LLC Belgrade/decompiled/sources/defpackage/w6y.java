package defpackage;

import androidx.compose.foundation.lazy.b;

/* loaded from: classes6.dex */
public final /* synthetic */ class w6y implements sls {
    public final /* synthetic */ int a;
    public final /* synthetic */ m3u0 b;
    public final /* synthetic */ b c;
    public final /* synthetic */ oz40 w;

    public /* synthetic */ w6y(int i, oz40 oz40Var, m3u0 m3u0Var, b bVar) {
        this.a = i;
        this.b = m3u0Var;
        this.c = bVar;
        this.w = oz40Var;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        int i = this.a;
        boolean z = true;
        oz40 oz40Var = this.w;
        b bVar = this.c;
        m3u0 m3u0Var = this.b;
        switch (i) {
            case 0:
                if (!((Boolean) m3u0Var.getValue()).booleanValue() && (!bVar.j.a() || ((Boolean) oz40Var.getValue()).booleanValue())) {
                    z = false;
                }
                return Boolean.valueOf(z);
            default:
                if (!((Boolean) m3u0Var.getValue()).booleanValue() && (!bVar.j.a() || ((Boolean) oz40Var.getValue()).booleanValue())) {
                    z = false;
                }
                return Boolean.valueOf(z);
        }
    }
}
