package defpackage;

import com.yandex.go.taxi.order.chat.data.db.b;
import java.util.ArrayList;
import java.util.HashSet;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes14.dex */
public final class x3y0 {
    public final String a;
    public final b b;
    public final x43 c = new x43();
    public final x43 d;
    public volatile HashSet e;
    public final r0 f;

    public x3y0(String str, b bVar) {
        this.a = str;
        this.b = bVar;
        x43 x43Var = new x43(bVar.b(str));
        this.d = x43Var;
        this.e = new HashSet(x43Var);
        this.f = bvf0.c(Integer.valueOf(this.e.size()));
    }

    public final synchronized void a() {
        ArrayList arrayList = new ArrayList(this.c);
        this.c.clear();
        if (!arrayList.isEmpty()) {
            this.d.addAll(arrayList);
            this.e.addAll(arrayList);
            r0 r0Var = this.f;
            Integer valueOf = Integer.valueOf(this.e.size());
            r0Var.getClass();
            r0Var.m(null, valueOf);
        }
    }
}
