package defpackage;

import com.yandex.messaging.domain.actions.a;
import com.yandex.messaging.domain.k;
import com.yandex.messaging.internal.storage.folders.d;
import kotlin.coroutines.Continuation;

/* loaded from: classes15.dex */
public final class twi0 extends k {
    public final a b;
    public final d c;
    public final k020 d;
    public final el21 e;
    public final xw50 f;
    public final zwr g;

    public twi0(a aVar, d dVar, k020 k020Var, el21 el21Var, xw50 xw50Var, zwr zwrVar, kse kseVar) {
        super(kseVar.e);
        this.b = aVar;
        this.c = dVar;
        this.d = k020Var;
        this.e = el21Var;
        this.f = xw50Var;
        this.g = zwrVar;
    }

    @Override // com.yandex.messaging.domain.k
    public final Object b(Object obj, Continuation continuation) {
        swi0 swi0Var = (swi0) obj;
        if (!this.f.a()) {
            return new iyj0(lwr.a);
        }
        this.g.a.f("delete_chat_from_folder", "folder_id", swi0Var.b, "chat_id", swi0Var.c);
        return this.b.a(new rwi0(swi0Var.a, swi0Var.b, swi0Var.c, this.c, this.d, this.e), continuation);
    }
}
