package defpackage;

import kotlin.Pair;

/* loaded from: classes10.dex */
public final class t5m {
    public final rx40 a;
    public final rx40 b;

    static {
        Float valueOf = Float.valueOf(0.0f);
        Pair pair = new Pair(valueOf, valueOf);
        Float valueOf2 = Float.valueOf(0.5f);
        new t5m(pair, new Pair(valueOf2, valueOf2));
    }

    public t5m(Pair... pairArr) {
        this.a = new rx40(pairArr.length);
        this.b = new rx40(pairArr.length);
        int length = pairArr.length;
        int i = 0;
        while (true) {
            rx40 rx40Var = this.a;
            if (i >= length) {
                ppa1.e(rx40Var);
                ppa1.e(this.b);
                return;
            } else {
                rx40Var.a(((Number) pairArr[i].c()).floatValue());
                this.b.a(((Number) pairArr[i].f()).floatValue());
                i++;
            }
        }
    }
}
