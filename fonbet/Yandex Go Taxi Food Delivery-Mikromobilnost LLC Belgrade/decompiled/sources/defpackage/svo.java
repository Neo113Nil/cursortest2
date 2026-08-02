package defpackage;

import android.view.View;
import com.yandex.div.core.expression.variables.d;
import com.yandex.go.flex.common.extensions.shortcut_shimmer.ShortcutShimmerExtensionHandler$observeTheme$$inlined$addLifecycleListener$1;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Ref$ObjectRef;

/* loaded from: classes.dex */
public final /* synthetic */ class svo implements f1k {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object w;

    public /* synthetic */ svo(int i, Object obj, Object obj2, Object obj3) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.w = obj3;
    }

    @Override // java.lang.AutoCloseable, java.io.Closeable
    public final void close() {
        int i = this.a;
        Object obj = this.w;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (i) {
            case 0:
                sls slsVar = (sls) obj;
                br60 br60Var = (br60) ((tvo) obj3).j.get((String) obj2);
                if (br60Var != null) {
                    br60Var.b(slsVar);
                    break;
                }
                break;
            case 1:
                View view = (View) obj2;
                ShortcutShimmerExtensionHandler$observeTheme$$inlined$addLifecycleListener$1 shortcutShimmerExtensionHandler$observeTheme$$inlined$addLifecycleListener$1 = (ShortcutShimmerExtensionHandler$observeTheme$$inlined$addLifecycleListener$1) obj;
                l8x l8xVar = (l8x) ((Ref$ObjectRef) obj3).element;
                if (l8xVar != null) {
                    l8xVar.a(null);
                }
                view.removeOnAttachStateChangeListener(shortcutShimmerExtensionHandler$observeTheme$$inlined$addLifecycleListener$1);
                break;
            case 2:
                tls tlsVar = (tls) obj;
                br60 br60Var2 = (br60) ((d) obj3).y.get((String) obj2);
                if (br60Var2 != null) {
                    br60Var2.b(tlsVar);
                    break;
                }
                break;
            default:
                d dVar = (d) obj2;
                tls tlsVar2 = (tls) obj;
                Iterator it = ((List) obj3).iterator();
                while (it.hasNext()) {
                    br60 br60Var3 = (br60) dVar.z.get((String) it.next());
                    if (br60Var3 != null) {
                        br60Var3.b(tlsVar2);
                    }
                }
                break;
        }
    }
}
