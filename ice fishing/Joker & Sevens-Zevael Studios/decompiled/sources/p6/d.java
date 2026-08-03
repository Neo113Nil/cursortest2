package p6;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public Integer f5555a;

    /* renamed from: b, reason: collision with root package name */
    public String f5556b;

    /* renamed from: c, reason: collision with root package name */
    public Object f5557c;

    /* renamed from: d, reason: collision with root package name */
    public Object f5558d;

    /* renamed from: e, reason: collision with root package name */
    public Object f5559e;

    /* renamed from: f, reason: collision with root package name */
    public Object f5560f;

    /* renamed from: g, reason: collision with root package name */
    public Object f5561g;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.util.Map] */
    public d(Set set, s.f fVar, String str, String str2, d7.a aVar) {
        Set unmodifiableSet = set == null ? Collections.EMPTY_SET : Collections.unmodifiableSet(set);
        this.f5557c = unmodifiableSet;
        s.f fVar2 = fVar == null ? Collections.EMPTY_MAP : fVar;
        this.f5559e = fVar2;
        this.f5556b = str;
        this.f5560f = str2;
        this.f5561g = aVar == null ? d7.a.f1716a : aVar;
        HashSet hashSet = new HashSet(unmodifiableSet);
        Iterator it = fVar2.values().iterator();
        if (it.hasNext()) {
            it.next().getClass();
            throw new ClassCastException();
        }
        this.f5558d = Collections.unmodifiableSet(hashSet);
    }
}
