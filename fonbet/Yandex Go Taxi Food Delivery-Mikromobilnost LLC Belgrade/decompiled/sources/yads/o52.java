package yads;

import defpackage.i581;
import defpackage.tls;
import kotlin.Pair;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes7.dex */
public final class o52 extends Lambda implements tls {
    public static final o52 w = new o52();

    public o52() {
        super(1);
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        i581 i581Var = (i581) obj;
        return new Pair(i581Var.d.a, i581Var.e);
    }
}
