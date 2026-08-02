package defpackage;

import com.yandex.xplat.common.NetworkMethod;
import java.util.Collections;
import java.util.List;
import java.util.UUID;
import kotlin.Pair;

/* loaded from: classes2.dex */
public final class sih implements u870 {
    @Override // defpackage.u870
    public final void a() {
    }

    @Override // defpackage.u870
    public final void b() {
    }

    @Override // defpackage.qgo
    public final void c(c9v c9vVar) {
    }

    @Override // defpackage.vv50
    public final md51 d(hz50 hz50Var) {
        NetworkMethod method = hz50Var.method();
        String c = hz50Var.c();
        wj00 a = hz50Var.a();
        wj00 b = hz50Var.b();
        wj00 d = hz50Var.d();
        d.k("X-Request-ID", UUID.randomUUID().toString());
        return zmx.d(new tsp0(method, c, a, b, d, hz50Var.encoding()));
    }

    @Override // defpackage.u870
    public final void destroy() {
    }

    @Override // defpackage.u870
    public final List e(String str) {
        return Collections.singletonList(new Pair("X-Request-ID", UUID.randomUUID().toString()));
    }
}
