package defpackage;

import com.yandex.music.shared.utils.assertions.Assertions;
import com.yandex.music.shared.utils.assertions.FailedAssertionException;
import kotlin.coroutines.Continuation;

/* loaded from: classes4.dex */
public final class n4 implements tfg {
    public final vjg a;
    public final e4 b;
    public final c3 c;
    public final xdr d;
    public final fkn e;

    public n4(vjg vjgVar, e4 e4Var, c3 c3Var) {
        vjgVar.getClass();
        this.a = vjgVar;
        this.b = e4Var;
        this.c = c3Var;
        xdr a = ydr.a(f4.a);
        this.d = a;
        this.e = new fkn(a);
    }

    @Override // defpackage.rnq
    public final drf a() {
        return this.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    @Override // defpackage.tfg
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(Continuation continuation) {
        m4 m4Var;
        int i;
        nnk nnkVar;
        rj6 rj6Var;
        if (continuation instanceof m4) {
            m4Var = (m4) continuation;
            int i2 = m4Var.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                m4Var.m = i2 - Integer.MIN_VALUE;
                Object obj = m4Var.k;
                nm6 nm6Var = nm6.a;
                i = m4Var.m;
                f4 f4Var = f4.a;
                vjg vjgVar = this.a;
                xdr xdrVar = this.d;
                if (i != 0) {
                    qgg.h0(obj);
                    nnk nnkVar2 = (nnk) this.c.invoke();
                    if (nnkVar2 == null) {
                        Assertions.throwOrSkip("AboutPodcastEpisode", new FailedAssertionException(hrg.q("Block load[", vjgVar.a.a, "]: without playable")));
                        xdrVar.getClass();
                        xdrVar.m(null, f4Var);
                        return new c73(a());
                    }
                    rr5 d = ((mqs) nnkVar2.a).d();
                    m4Var.j = nnkVar2;
                    m4Var.m = 1;
                    Object a = this.b.a(d, m4Var);
                    if (a == nm6Var) {
                        return nm6Var;
                    }
                    nnkVar = nnkVar2;
                    obj = a;
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    nnkVar = m4Var.j;
                    qgg.h0(obj);
                }
                rj6Var = (rj6) obj;
                if (!(rj6Var instanceof pj6)) {
                    xdrVar.getClass();
                    xdrVar.m(null, f4Var);
                    return new c73(a());
                }
                if (!(rj6Var instanceof qj6)) {
                    b6e.s();
                    return null;
                }
                g4 g4Var = new g4(vjgVar.c, ((o4) ((qj6) rj6Var).a).a, (mqs) nnkVar.a, (mwk) nnkVar.b);
                xdrVar.getClass();
                xdrVar.m(null, g4Var);
                return new d73(a());
            }
        }
        m4Var = new m4(this, (cg6) continuation);
        Object obj2 = m4Var.k;
        nm6 nm6Var2 = nm6.a;
        i = m4Var.m;
        f4 f4Var2 = f4.a;
        vjg vjgVar2 = this.a;
        xdr xdrVar2 = this.d;
        if (i != 0) {
        }
        rj6Var = (rj6) obj2;
        if (!(rj6Var instanceof pj6)) {
        }
    }
}
