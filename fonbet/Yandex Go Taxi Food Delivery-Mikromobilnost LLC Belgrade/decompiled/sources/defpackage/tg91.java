package defpackage;

import java.lang.ref.PhantomReference;
import java.lang.ref.ReferenceQueue;
import java.util.Set;

/* loaded from: classes11.dex */
public final class tg91 extends PhantomReference {
    public final Set a;
    public final o391 b;

    public /* synthetic */ tg91(o0c o0cVar, ReferenceQueue referenceQueue, Set set, o391 o391Var) {
        super(o0cVar, referenceQueue);
        this.a = set;
        this.b = o391Var;
    }
}
