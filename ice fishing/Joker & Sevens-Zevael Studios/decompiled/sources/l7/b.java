package l7;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final String f4213a;

    /* renamed from: b, reason: collision with root package name */
    public final Set f4214b;

    /* renamed from: c, reason: collision with root package name */
    public final Set f4215c;

    /* renamed from: d, reason: collision with root package name */
    public final int f4216d;

    /* renamed from: e, reason: collision with root package name */
    public final int f4217e;

    /* renamed from: f, reason: collision with root package name */
    public final e f4218f;

    /* renamed from: g, reason: collision with root package name */
    public final Set f4219g;

    public b(String str, Set set, Set set2, int i10, int i11, e eVar, Set set3) {
        this.f4213a = str;
        this.f4214b = Collections.unmodifiableSet(set);
        this.f4215c = Collections.unmodifiableSet(set2);
        this.f4216d = i10;
        this.f4217e = i11;
        this.f4218f = eVar;
        this.f4219g = Collections.unmodifiableSet(set3);
    }

    public static a a(r rVar) {
        return new a(rVar, new r[0]);
    }

    public static b b(Object obj, Class cls, Class... clsArr) {
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        hashSet.add(r.a(cls));
        for (Class cls2 : clsArr) {
            i7.b.p(cls2, "Null interface");
            hashSet.add(r.a(cls2));
        }
        return new b(null, new HashSet(hashSet), new HashSet(hashSet2), 0, 0, new c6.f(9, obj), hashSet3);
    }

    public final String toString() {
        return "Component<" + Arrays.toString(this.f4214b.toArray()) + ">{" + this.f4216d + ", type=" + this.f4217e + ", deps=" + Arrays.toString(this.f4215c.toArray()) + "}";
    }
}
