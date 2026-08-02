package defpackage;

import com.yandex.go.taxi.tariffs.repository.g;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.a;

/* loaded from: classes8.dex */
public final class vo40 {
    public final g a;
    public final ijj0 b;
    public final i3y c;

    public vo40(rqo rqoVar, ijj0 ijj0Var, g gVar) {
        this.a = gVar;
        this.b = ijj0Var;
        this.c = a.a(new zf2(rqoVar, 7));
    }

    public final ArrayList a() {
        LinkedHashMap c = this.a.c();
        ArrayList arrayList = new ArrayList(c.size());
        for (Map.Entry entry : c.entrySet()) {
            arrayList.add(new gf31((String) entry.getKey(), (Set) entry.getValue()));
        }
        return arrayList;
    }
}
