package defpackage;

import androidx.lifecycle.Lifecycle;
import java.util.ArrayList;
import kotlin.jvm.internal.Ref$ObjectRef;
import ru.yandex.taxi.lifecycle.c;

/* loaded from: classes6.dex */
public final class sey {
    public final pey a;
    public final ArrayList b = new ArrayList();

    public sey(pey peyVar) {
        this.a = peyVar;
        c.a(peyVar.getLifecycle(), new dhv(20, this));
    }

    public final ebm a(sls slsVar) {
        ebm ebmVar = new ebm(slsVar, this);
        this.b.add(ebmVar);
        return ebmVar;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [T, dai] */
    /* JADX WARN: Type inference failed for: r6v3, types: [T, k20] */
    /* JADX WARN: Type inference failed for: r7v1, types: [T, k20] */
    public final rey b(sls slsVar) {
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        ?? r1 = g18.u1;
        ref$ObjectRef.element = r1;
        Ref$ObjectRef ref$ObjectRef2 = new Ref$ObjectRef();
        ref$ObjectRef2.element = r1;
        Ref$ObjectRef ref$ObjectRef3 = new Ref$ObjectRef();
        ref$ObjectRef3.element = r1;
        Lifecycle lifecycle = this.a.getLifecycle();
        ref$ObjectRef2.element = cey.a(lifecycle, Lifecycle.Event.ON_START, new r7v(19, ref$ObjectRef, slsVar));
        ref$ObjectRef3.element = cey.a(lifecycle, Lifecycle.Event.ON_STOP, new qkh(1, ref$ObjectRef));
        return new rey(0, ref$ObjectRef2, ref$ObjectRef3, ref$ObjectRef);
    }
}
