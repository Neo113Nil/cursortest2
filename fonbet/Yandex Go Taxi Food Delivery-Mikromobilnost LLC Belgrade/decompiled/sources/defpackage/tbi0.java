package defpackage;

import androidx.datastore.core.f;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.e;

/* loaded from: classes8.dex */
public final class tbi0 implements tpg {
    public final f a;
    public final al20 b;
    public final tpr c;

    public tbi0(f fVar, al20 al20Var) {
        this.a = fVar;
        this.b = al20Var;
        this.c = fVar.d;
    }

    @Override // defpackage.tpg
    public final Object a(wls wlsVar, Continuation continuation) {
        this.b.invoke();
        return e.y(this.a.d, continuation);
    }

    @Override // defpackage.tpg
    public final tpr getData() {
        return this.c;
    }
}
