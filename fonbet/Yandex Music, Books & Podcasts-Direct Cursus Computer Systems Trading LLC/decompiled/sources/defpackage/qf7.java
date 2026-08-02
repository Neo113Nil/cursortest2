package defpackage;

import android.view.View;
import java.util.Iterator;
import java.util.Set;
import java.util.WeakHashMap;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final /* synthetic */ class qf7 implements ja8 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ qf7(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // java.lang.AutoCloseable, java.io.Closeable
    public final void close() {
        switch (this.a) {
            case 0:
                ((sf7) this.b).g.remove((az6) this.c);
                return;
            case 1:
                dfb dfbVar = (dfb) this.b;
                Function2 function2 = (Function2) this.c;
                synchronized (dfbVar.c) {
                    dfbVar.d.g(function2);
                }
                return;
            case 2:
                ((f4e) this.b).f.g((rf7) this.c);
                return;
            case 3:
                tao taoVar = (tao) this.b;
                Set set = (Set) ((WeakHashMap) taoVar.c).remove((View) this.c);
                Iterator it = (set != null ? set : q5b.a).iterator();
                while (it.hasNext()) {
                    taoVar.b((wj9) it.next());
                }
                return;
            default:
                ((gc8) this.b).K((oat) this.c);
                return;
        }
    }
}
