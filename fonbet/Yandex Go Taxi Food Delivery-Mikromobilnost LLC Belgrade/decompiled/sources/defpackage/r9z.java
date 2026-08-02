package defpackage;

import kotlin.Pair;

/* loaded from: classes9.dex */
public final class r9z implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ s9z b;
    public final /* synthetic */ Pair c;

    public /* synthetic */ r9z(s9z s9zVar, Pair pair, int i) {
        this.a = i;
        this.b = s9zVar;
        this.c = pair;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        int i = this.a;
        Pair pair = this.c;
        s9z s9zVar = this.b;
        switch (i) {
            case 0:
                s9zVar.b.b("LocationManagerAdapter", (Throwable) obj, pair);
                return Boolean.FALSE;
            default:
                s9zVar.b.b("LocationManagerAdapter", (Throwable) obj, pair);
                return zy11.a;
        }
    }
}
