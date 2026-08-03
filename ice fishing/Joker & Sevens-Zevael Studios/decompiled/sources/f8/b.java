package f8;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final String f2336a;

    /* renamed from: b, reason: collision with root package name */
    public final c f2337b;

    public b(Set set, c cVar) {
        this.f2336a = b(set);
        this.f2337b = cVar;
    }

    public static String b(Set set) {
        StringBuilder sb = new StringBuilder();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            a aVar = (a) it.next();
            sb.append(aVar.f2334a);
            sb.append('/');
            sb.append(aVar.f2335b);
            if (it.hasNext()) {
                sb.append(' ');
            }
        }
        return sb.toString();
    }

    public final String a() {
        Set unmodifiableSet;
        Set unmodifiableSet2;
        String str = this.f2336a;
        c cVar = this.f2337b;
        synchronized (((HashSet) cVar.f2340h)) {
            unmodifiableSet = Collections.unmodifiableSet((HashSet) cVar.f2340h);
        }
        if (unmodifiableSet.isEmpty()) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(' ');
        synchronized (((HashSet) cVar.f2340h)) {
            unmodifiableSet2 = Collections.unmodifiableSet((HashSet) cVar.f2340h);
        }
        sb.append(b(unmodifiableSet2));
        return sb.toString();
    }
}
