package defpackage;

import java.util.List;

/* loaded from: classes10.dex */
public final class rme0 implements xbi0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ String b;
    public final /* synthetic */ cne0 c;
    public final /* synthetic */ cne0 w;

    public /* synthetic */ rme0(int i, cne0 cne0Var, cne0 cne0Var2, String str) {
        this.a = i;
        this.b = str;
        this.c = cne0Var;
        this.w = cne0Var2;
    }

    @Override // defpackage.vbi0
    public final Object getValue(Object obj, kgx kgxVar) {
        int i = this.a;
        cne0 cne0Var = this.c;
        String str = this.b;
        switch (i) {
            case 0:
                return Float.valueOf(cne0Var.h(str));
            default:
                return cne0Var.m(str, ";");
        }
    }

    @Override // defpackage.xbi0
    public final void setValue(Object obj, kgx kgxVar, Object obj2) {
        int i = this.a;
        cne0 cne0Var = this.w;
        String str = this.b;
        switch (i) {
            case 0:
                cne0Var.d().putFloat(str, ((Number) obj2).floatValue()).apply();
                break;
            default:
                cne0Var.s(str, ";", (List) obj2);
                break;
        }
    }
}
