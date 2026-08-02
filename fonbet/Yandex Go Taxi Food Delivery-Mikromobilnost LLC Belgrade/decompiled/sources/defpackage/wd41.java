package defpackage;

import android.content.Context;
import com.yandex.quark.lite.b;
import java.util.concurrent.CompletableFuture;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes8.dex */
public final class wd41 implements rig0 {
    public final xc41 a;

    public wd41(n1d n1dVar) {
        this.a = new xc41((Context) n1dVar.a, (tse) n1dVar.b, (wly0) n1dVar.c, (bst) n1dVar.d, (zc41) n1dVar.e, (zq6) n1dVar.f, (zwf0) n1dVar.g);
    }

    @Override // defpackage.rig0
    public final CompletableFuture a(b bVar) {
        r0 r0Var = this.a.A.a;
        Boolean bool = Boolean.TRUE;
        r0Var.getClass();
        r0Var.m(null, bool);
        return CompletableFuture.completedFuture(q5z.N());
    }

    @Override // defpackage.rig0
    public final CompletableFuture b(b bVar) {
        xc41 xc41Var = this.a;
        syj0 e = bVar.e(xc41Var);
        if (!(e instanceof lyj0)) {
            if (!(e instanceof jyj0)) {
                w511.b();
                return null;
            }
            e = new jyj0(new p530("Fail to register WebChatFeature"));
        }
        if (e instanceof lyj0) {
            r0 r0Var = xc41Var.A.b;
            Boolean bool = Boolean.TRUE;
            r0Var.getClass();
            r0Var.m(null, bool);
            e = new lyj0(zy11.a);
        } else if (!(e instanceof jyj0)) {
            w511.b();
            return null;
        }
        return CompletableFuture.completedFuture(e);
    }

    @Override // defpackage.rig0
    public final String getName() {
        return "WebChatModule";
    }

    @Override // defpackage.rig0
    public final CompletableFuture init() {
        return CompletableFuture.completedFuture(new lyj0(zy11.a));
    }

    @Override // defpackage.rig0
    public final CompletableFuture stop() {
        this.a.B.dispose();
        return CompletableFuture.completedFuture(new lyj0(zy11.a));
    }
}
