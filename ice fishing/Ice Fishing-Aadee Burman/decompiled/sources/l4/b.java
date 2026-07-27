package l4;

import java.util.Collections;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes2.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final String f38916a;

    /* renamed from: b, reason: collision with root package name */
    public final c f38917b;

    public b(Set set, c cVar) {
        this.f38916a = b(set);
        this.f38917b = cVar;
    }

    public static String b(Set set) {
        StringBuilder sb = new StringBuilder();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            C4664a c4664a = (C4664a) it.next();
            sb.append(c4664a.f38914a);
            sb.append('/');
            sb.append(c4664a.f38915b);
            if (it.hasNext()) {
                sb.append(' ');
            }
        }
        return sb.toString();
    }

    public final String a() {
        Set unmodifiableSet;
        Set unmodifiableSet2;
        c cVar = this.f38917b;
        synchronized (cVar.f38919a) {
            unmodifiableSet = Collections.unmodifiableSet(cVar.f38919a);
        }
        boolean isEmpty = unmodifiableSet.isEmpty();
        String str = this.f38916a;
        if (isEmpty) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(' ');
        synchronized (cVar.f38919a) {
            unmodifiableSet2 = Collections.unmodifiableSet(cVar.f38919a);
        }
        sb.append(b(unmodifiableSet2));
        return sb.toString();
    }
}
