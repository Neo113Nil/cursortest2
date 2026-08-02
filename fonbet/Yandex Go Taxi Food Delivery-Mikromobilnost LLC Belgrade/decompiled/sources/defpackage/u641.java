package defpackage;

import java.util.List;

/* loaded from: classes9.dex */
public final class u641 {
    public zzs a;
    public List b;

    public u641(int i) {
        this.a = null;
        this.b = null;
    }

    public static void a(u641 u641Var, zzs zzsVar, List list, int i) {
        if ((i & 1) != 0) {
            zzsVar = null;
        }
        if ((i & 4) != 0) {
            list = null;
        }
        u641Var.a = zzsVar;
        u641Var.b = list;
    }

    public u641() {
        this(0);
    }
}
