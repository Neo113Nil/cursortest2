package defpackage;

import com.yandex.messaging.domain.actions.a;
import com.yandex.messaging.domain.k;
import com.yandex.messaging.internal.storage.folders.d;
import kotlin.coroutines.Continuation;

/* loaded from: classes15.dex */
public final class vzi0 extends k {
    public final a b;
    public final d c;
    public final el21 d;
    public final xw50 e;
    public final zwr f;

    public vzi0(a aVar, d dVar, el21 el21Var, xw50 xw50Var, zwr zwrVar, kse kseVar) {
        super(kseVar.e);
        this.b = aVar;
        this.c = dVar;
        this.d = el21Var;
        this.e = xw50Var;
        this.f = zwrVar;
    }

    @Override // com.yandex.messaging.domain.k
    public final Object b(Object obj, Continuation continuation) {
        uzi0 uzi0Var = (uzi0) obj;
        if (!this.e.a()) {
            return new iyj0(lwr.a);
        }
        this.f.a.reportEvent("reorder_folders");
        uzi0Var.getClass();
        return this.b.a(new tzi0(0L, null, this.c, this.d), continuation);
    }
}
