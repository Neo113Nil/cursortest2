package n4;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes2.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final String f39654a;

    /* renamed from: b, reason: collision with root package name */
    public final c f39655b;

    public b(Set set, c cVar) {
        this.f39654a = b(set);
        this.f39655b = cVar;
    }

    public static String b(Set set) {
        StringBuilder sb = new StringBuilder();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            C4773a c4773a = (C4773a) it.next();
            sb.append(c4773a.f39652a);
            sb.append('/');
            sb.append(c4773a.f39653b);
            if (it.hasNext()) {
                sb.append(' ');
            }
        }
        return sb.toString();
    }

    public final String a() {
        Set unmodifiableSet;
        Set unmodifiableSet2;
        c cVar = this.f39655b;
        synchronized (((HashSet) cVar.f39658u)) {
            unmodifiableSet = Collections.unmodifiableSet((HashSet) cVar.f39658u);
        }
        boolean isEmpty = unmodifiableSet.isEmpty();
        String str = this.f39654a;
        if (isEmpty) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(' ');
        synchronized (((HashSet) cVar.f39658u)) {
            unmodifiableSet2 = Collections.unmodifiableSet((HashSet) cVar.f39658u);
        }
        sb.append(b(unmodifiableSet2));
        return sb.toString();
    }
}
