package defpackage;

import android.content.Context;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.coroutines.Continuation;

/* loaded from: classes4.dex */
public final class vxr {
    public final z66 a;
    public final jyr b = btf.b(new nrq(28));

    public vxr(Context context, z66 z66Var) {
        this.a = z66Var;
        btf.b(new eyq(21, this));
    }

    public final Object a(Continuation continuation) {
        if (!this.a.g()) {
            return rxr.a;
        }
        CopyOnWriteArrayList copyOnWriteArrayList = pxr.a;
        Continuation continuation2 = null;
        return zsd.g0(new clc(new yf1(zsd.K(new jud(2, 29, continuation2)), 1), new d7i(this, continuation2, 24)), continuation);
    }
}
