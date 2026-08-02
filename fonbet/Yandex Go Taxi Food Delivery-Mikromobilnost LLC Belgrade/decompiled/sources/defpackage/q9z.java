package defpackage;

import kotlin.Pair;

/* loaded from: classes9.dex */
public final class q9z implements sls {
    public final /* synthetic */ int a;
    public final /* synthetic */ s9z b;
    public final /* synthetic */ Pair c;

    public /* synthetic */ q9z(s9z s9zVar, Pair pair, int i) {
        this.a = i;
        this.b = s9zVar;
        this.c = pair;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        Pair pair = this.c;
        s9z s9zVar = this.b;
        switch (i) {
            case 0:
                rcz rczVar = s9zVar.b;
                igz.a(pair);
                break;
            default:
                rcz rczVar2 = s9zVar.b;
                igz.a(pair);
                break;
        }
        return zy11Var;
    }
}
