package defpackage;

import com.yandex.music.shared.player.api.download.PlayerPlaybackException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class qzs implements mzs {
    public final f7l a;
    public final qqs b;
    public final p5q c;
    public final g8c d;
    public final mvt e;
    public final x3n f;
    public final AtomicBoolean g;
    public final x0q h;

    public qzs(p5q p5qVar, q3t q3tVar, f7l f7lVar, qqs qqsVar, p5q p5qVar2, g8c g8cVar, mvt mvtVar) {
        q3tVar.getClass();
        f7lVar.getClass();
        mvtVar.getClass();
        this.a = f7lVar;
        this.b = qqsVar;
        this.c = p5qVar2;
        this.d = g8cVar;
        this.e = mvtVar;
        x3n x3nVar = new x3n();
        x3nVar.a = p5qVar;
        x3nVar.d = new AtomicReference();
        this.f = x3nVar;
        this.g = new AtomicBoolean();
        x0q b = y0q.b(1, 0, oi3.b, 2);
        b.a(Unit.a);
        this.h = b;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(qzs qzsVar, bjm bjmVar, zvs zvsVar, mqs mqsVar, gy1 gy1Var, boolean z, cg6 cg6Var) {
        nzs nzsVar;
        int i;
        zvs zvsVar2;
        xim ximVar;
        if (cg6Var instanceof nzs) {
            nzsVar = (nzs) cg6Var;
            int i2 = nzsVar.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                nzsVar.m = i2 - Integer.MIN_VALUE;
                Object obj = nzsVar.k;
                nm6 nm6Var = nm6.a;
                i = nzsVar.m;
                boolean z2 = false;
                if (i != 0) {
                    qgg.h0(obj);
                    be6 q = ghh.q(gy1Var.a(), false, wyf.O(mqsVar));
                    String str = mqsVar.c;
                    nxs nxsVar = mqsVar.B;
                    uim uimVar = new uim(str, nxsVar != null ? new pxs(nxsVar.a, nxsVar.b) : null, gy1Var);
                    nzsVar.j = zvsVar;
                    nzsVar.m = 1;
                    bjmVar.getClass();
                    obj = x97.V(dm6.b, new zim(bjmVar, zvsVar, uimVar, q, z, null), nzsVar);
                    if (obj == nm6Var) {
                        return nm6Var;
                    }
                    zvsVar2 = zvsVar;
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    zvsVar2 = nzsVar.j;
                    qgg.h0(obj);
                }
                ximVar = (xim) obj;
                if (!(ximVar instanceof vim)) {
                    p5q p5qVar = qzsVar.c;
                    PlayerPlaybackException.TrackFetchException trackFetchException = ((vim) ximVar).a;
                    u5q u5qVar = p5qVar.a;
                    zvsVar2.getClass();
                    ((l6q) ((j6q) u5qVar.e.getValue())).getClass();
                    ssg.a(6, "SharedPlayerErrorHandler", "preFetch error", trackFetchException);
                } else {
                    if (!Intrinsics.d(ximVar, wim.a)) {
                        b6e.s();
                        return null;
                    }
                    z2 = true;
                }
                return Boolean.valueOf(z2);
            }
        }
        nzsVar = new nzs(qzsVar, cg6Var);
        Object obj2 = nzsVar.k;
        nm6 nm6Var2 = nm6.a;
        i = nzsVar.m;
        boolean z22 = false;
        if (i != 0) {
        }
        ximVar = (xim) obj2;
        if (!(ximVar instanceof vim)) {
        }
        return Boolean.valueOf(z22);
    }
}
