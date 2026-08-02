package defpackage;

import com.yandex.quark.js.QuarkJsState;
import com.yandex.quark.js.implementation.webView.internal.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.collections.a;

/* loaded from: classes8.dex */
public final class qlw0 implements zhg0, yt1 {
    public final c a;
    public List b;
    public volatile boolean c;

    public qlw0(c cVar) {
        this.a = cVar;
    }

    public final void a(List list) {
        List list2 = list;
        ArrayList arrayList = new ArrayList(tcc.n(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(((jlw0) it.next()).a());
        }
        this.a.b(new ikc(arrayList));
    }

    @Override // defpackage.zhg0
    public final void d(QuarkJsState quarkJsState) {
        int i = plw0.a[quarkJsState.ordinal()];
        if (i == 1) {
            this.c = false;
            return;
        }
        if (i == 2) {
            this.c = true;
            List list = this.b;
            if (list != null) {
                a(list);
                return;
            }
            return;
        }
        if (i == 3) {
            this.c = false;
            this.b = null;
        } else {
            if (i == 4) {
                return;
            }
            w511.b();
        }
    }

    @Override // defpackage.yt1
    public final void k(Set set) {
        List J0 = a.J0(set);
        this.b = J0;
        if (this.c) {
            a(J0);
        }
    }
}
