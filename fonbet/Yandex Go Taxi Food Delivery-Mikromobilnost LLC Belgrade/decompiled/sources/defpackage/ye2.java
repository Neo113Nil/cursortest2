package defpackage;

import androidx.compose.animation.e;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import java.util.Map;
import kotlin.jvm.internal.Ref$ObjectRef;

/* loaded from: classes10.dex */
public final class ye2 implements i1k {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ ye2(int i, Object obj, Object obj2, Object obj3) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.i1k
    public final void dispose() {
        int i = this.a;
        Object obj = this.d;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (i) {
            case 0:
                ((SnapshotStateList) obj3).remove(obj2);
                ((e) obj).e.m(obj2);
                break;
            case 1:
                ((pey) obj3).getLifecycle().d((wdy) obj2);
                break;
            case 2:
                ((pey) obj3).getLifecycle().d((wdy) obj2);
                se4 se4Var = (se4) ((Ref$ObjectRef) obj).element;
                if (se4Var != null) {
                    se4Var.a();
                    break;
                }
                break;
            case 3:
                j1m0 j1m0Var = (j1m0) obj3;
                o1m0 o1m0Var = (o1m0) obj;
                if (j1m0Var.b.m(obj2) == o1m0Var) {
                    Map map = j1m0Var.a;
                    Map a = o1m0Var.a();
                    if (!a.isEmpty()) {
                        map.put(obj2, a);
                        break;
                    } else {
                        map.remove(obj2);
                        break;
                    }
                }
                break;
            default:
                l8x l8xVar = (l8x) ((oz40) obj3).getValue();
                if (l8xVar != null) {
                    l8xVar.a(null);
                }
                ypv0 ypv0Var = (ypv0) obj2;
                if (ypv0Var != null) {
                    ypv0Var.a.remove((String) obj);
                    break;
                }
                break;
        }
    }
}
