package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;

/* loaded from: classes3.dex */
public final class llt {
    public final ArrayList a = new ArrayList();

    public final synchronized void a(Function1 function1) {
        Iterator it = CollectionsKt.w0(this.a).iterator();
        while (it.hasNext()) {
            function1.invoke(it.next());
        }
    }
}
