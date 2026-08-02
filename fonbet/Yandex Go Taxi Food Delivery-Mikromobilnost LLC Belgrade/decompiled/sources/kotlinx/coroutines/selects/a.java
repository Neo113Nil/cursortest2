package kotlinx.coroutines.selects;

import defpackage.ecq0;
import defpackage.rzo;
import defpackage.tl7;
import defpackage.tls;
import defpackage.y070;
import defpackage.ym11;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* loaded from: classes9.dex */
public abstract class a {
    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(b bVar, long j, tls tlsVar) {
        y070 y070Var = new y070(j);
        OnTimeout$selectClause$1 onTimeout$selectClause$1 = OnTimeout$selectClause$1.b;
        ym11.e(3, onTimeout$selectClause$1);
        ecq0 ecq0Var = new ecq0(bVar, y070Var, onTimeout$selectClause$1, tl7.c, rzo.k, (SuspendLambda) tlsVar, null);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = b.y;
        bVar.j(ecq0Var, false);
    }
}
