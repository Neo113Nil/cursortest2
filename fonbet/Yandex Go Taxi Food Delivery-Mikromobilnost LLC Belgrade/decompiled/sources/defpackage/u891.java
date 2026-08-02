package defpackage;

import java.util.HashMap;

/* loaded from: classes11.dex */
public final class u891 implements b991 {
    public final /* synthetic */ int a;
    public final cr71 b;
    public final String c;

    public /* synthetic */ u891(cr71 cr71Var, String str, int i) {
        this.a = i;
        this.b = cr71Var;
        this.c = str;
    }

    @Override // defpackage.b991
    public final cr71 a(r691 r691Var) {
        int i = this.a;
        String str = this.c;
        cr71 cr71Var = this.b;
        switch (i) {
            case 0:
                cr71 j = cr71Var.j();
                j.p(str, r691Var);
                ((HashMap) j.x).put(str, Boolean.TRUE);
                return j;
            default:
                cr71Var.p(str, r691Var);
                return cr71Var;
        }
    }
}
