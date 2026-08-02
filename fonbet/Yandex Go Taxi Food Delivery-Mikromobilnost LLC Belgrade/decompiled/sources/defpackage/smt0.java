package defpackage;

import android.text.Editable;
import com.yandex.messaging.internal.c0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import kotlin.collections.EmptyList;
import kotlin.collections.builders.ListBuilder;

/* loaded from: classes15.dex */
public final class smt0 implements vmt0 {
    public final rmt0 a;
    public final Editable b;
    public final llt0 c;
    public final boolean w;
    public final HashMap x = new HashMap();
    public final LinkedHashSet y = new LinkedHashSet();
    public final /* synthetic */ tmt0 z;

    public smt0(tmt0 tmt0Var, rmt0 rmt0Var, Editable editable, llt0 llt0Var, boolean z) {
        List<za6> list;
        rmt0 rmt0Var2;
        this.z = tmt0Var;
        this.a = rmt0Var;
        this.b = editable;
        this.c = llt0Var;
        this.w = z;
        List<cj10> b = if90.b(editable);
        ArrayList arrayList = new ArrayList(b.size());
        for (cj10 cj10Var : b) {
            Object d = this.c.d(cj10Var.a);
            this.b.setSpan(d, cj10Var.b, cj10Var.c, 33);
            arrayList.add(d);
            this.y.add(d);
        }
        if (this.y.isEmpty() && (rmt0Var2 = this.a) != null) {
            rmt0Var2.o(this.b);
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            Object obj = arrayList.get(i);
            this.x.put(obj, new c0(this, obj, ((cj10) b.get(i)).a));
        }
        if (this.z.c.w && this.w) {
            Editable editable2 = this.b;
            if (editable2 == null || editable2.length() == 0) {
                list = EmptyList.a;
            } else {
                Matcher matcher = if90.c.matcher(editable2);
                ListBuilder a = rcc.a();
                while (matcher.find()) {
                    int start = matcher.start();
                    int end = matcher.end();
                    a.add(new za6(editable2.subSequence(start, end).toString(), start, end));
                }
                list = a.j();
            }
            for (za6 za6Var : list) {
                this.b.setSpan(this.c.f(za6Var.a), za6Var.b, za6Var.c, 33);
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        HashMap hashMap = this.x;
        Iterator it = hashMap.entrySet().iterator();
        while (it.hasNext()) {
            ((c0) ((Map.Entry) it.next()).getValue()).close();
        }
        hashMap.clear();
    }
}
