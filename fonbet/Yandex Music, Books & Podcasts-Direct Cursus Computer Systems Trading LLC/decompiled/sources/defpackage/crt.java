package defpackage;

import com.yandex.music.shared.utils.assertions.Assertions;
import com.yandex.music.shared.utils.assertions.FailedAssertionException;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.Continuation;

/* loaded from: classes3.dex */
public final class crt {
    public final jur a;
    public final raa b;
    public final uaa c;
    public final tka d;
    public final xka e;
    public rar f;
    public final tf6 g;
    public final x0q h;

    public crt(jur jurVar, taa taaVar, e6q e6qVar, tka tkaVar, xka xkaVar) {
        taaVar.getClass();
        e6qVar.getClass();
        xkaVar.getClass();
        this.a = jurVar;
        this.b = taaVar;
        this.c = e6qVar;
        this.d = tkaVar;
        this.e = xkaVar;
        this.g = gld.e(dm6.b);
        this.h = y0q.b(0, 0, null, 7);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(crt crtVar, cg6 cg6Var) {
        art artVar;
        int i;
        try {
            if (cg6Var instanceof art) {
                artVar = (art) cg6Var;
                int i2 = artVar.l;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    artVar.l = i2 - Integer.MIN_VALUE;
                    Object obj = artVar.j;
                    nm6 nm6Var = nm6.a;
                    i = artVar.l;
                    Continuation continuation = null;
                    if (i != 0) {
                        qgg.h0(obj);
                        xdr xdrVar = saa.a;
                        mn7 mn7Var = dm6.b;
                        brt brtVar = new brt(crtVar, continuation, 0);
                        artVar.l = 1;
                        obj = x97.V(mn7Var, brtVar, artVar);
                        if (obj == nm6Var) {
                            return nm6Var;
                        }
                    } else {
                        if (i != 1) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        qgg.h0(obj);
                    }
                    return new Long(((Number) obj).longValue());
                }
            }
            if (i != 0) {
            }
            return new Long(((Number) obj).longValue());
        } catch (CancellationException e) {
            throw e;
        } catch (Exception e2) {
            Assertions.throwOrSkip("UsedMemoryHelperImpl", new FailedAssertionException("Unexpected exception in cachedTracksSizeFlow()", e2));
            return null;
        }
        artVar = new art(crtVar, cg6Var);
        Object obj2 = artVar.j;
        nm6 nm6Var2 = nm6.a;
        i = artVar.l;
        Continuation continuation2 = null;
    }

    public final bca b() {
        return new bca(zsd.s0(zsd.u0(((e6q) this.c).e, this.h), new zts(this, null, 5)), 18);
    }
}
