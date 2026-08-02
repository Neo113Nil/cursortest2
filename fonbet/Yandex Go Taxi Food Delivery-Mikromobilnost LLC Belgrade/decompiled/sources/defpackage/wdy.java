package defpackage;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.l;
import androidx.lifecycle.q;
import java.io.Serializable;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.Ref$ObjectRef;

/* loaded from: classes10.dex */
public final /* synthetic */ class wdy implements q {
    public final /* synthetic */ int a;
    public final /* synthetic */ Serializable b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object w;

    public /* synthetic */ wdy(int i, Serializable serializable, Object obj, Object obj2) {
        this.a = i;
        this.w = obj;
        this.b = serializable;
        this.c = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v3, types: [T, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v8, types: [T, java.lang.Object] */
    @Override // androidx.lifecycle.q
    public final void M1(pey peyVar, Lifecycle.Event event) {
        int i = this.a;
        Object obj = this.c;
        Serializable serializable = this.b;
        Object obj2 = this.w;
        switch (i) {
            case 0:
                xey xeyVar = (xey) obj2;
                Ref$ObjectRef ref$ObjectRef = (Ref$ObjectRef) serializable;
                tls tlsVar = (tls) obj;
                int i2 = xdy.a[event.ordinal()];
                if (i2 == 3) {
                    ref$ObjectRef.element = tlsVar.invoke(xeyVar);
                    break;
                } else if (i2 == 4) {
                    ref$ObjectRef.element = null;
                    break;
                }
                break;
            case 1:
                bfy bfyVar = (bfy) obj2;
                Ref$ObjectRef ref$ObjectRef2 = (Ref$ObjectRef) serializable;
                tls tlsVar2 = (tls) obj;
                int i3 = xdy.a[event.ordinal()];
                if (i3 == 1) {
                    ref$ObjectRef2.element = tlsVar2.invoke(bfyVar);
                    break;
                } else if (i3 == 2) {
                    se4 se4Var = (se4) ref$ObjectRef2.element;
                    if (se4Var != null) {
                        se4Var.a();
                    }
                    ref$ObjectRef2.element = null;
                    break;
                }
                break;
            default:
                tk10 tk10Var = (tk10) obj2;
                Runnable runnable = tk10Var.a;
                CopyOnWriteArrayList copyOnWriteArrayList = tk10Var.b;
                Lifecycle.State state = (Lifecycle.State) serializable;
                an10 an10Var = (an10) obj;
                Lifecycle.Event.Companion.getClass();
                if (event != l.c(state)) {
                    if (event != Lifecycle.Event.ON_DESTROY) {
                        if (event == l.a(state)) {
                            copyOnWriteArrayList.remove(an10Var);
                            runnable.run();
                            break;
                        }
                    } else {
                        tk10Var.d(an10Var);
                        break;
                    }
                } else {
                    copyOnWriteArrayList.add(an10Var);
                    runnable.run();
                    break;
                }
                break;
        }
    }
}
