package R3;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes2.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final String f2714a;

    /* renamed from: b, reason: collision with root package name */
    public final Set f2715b;

    /* renamed from: c, reason: collision with root package name */
    public final Set f2716c;

    /* renamed from: d, reason: collision with root package name */
    public final int f2717d;

    /* renamed from: e, reason: collision with root package name */
    public final int f2718e;

    /* renamed from: f, reason: collision with root package name */
    public final e f2719f;

    /* renamed from: g, reason: collision with root package name */
    public final Set f2720g;

    public b(String str, Set set, Set set2, int i, int i6, e eVar, Set set3) {
        this.f2714a = str;
        this.f2715b = Collections.unmodifiableSet(set);
        this.f2716c = Collections.unmodifiableSet(set2);
        this.f2717d = i;
        this.f2718e = i6;
        this.f2719f = eVar;
        this.f2720g = Collections.unmodifiableSet(set3);
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
            X2.e.z(cls2, "Null interface");
            hashSet.add(r.a(cls2));
        }
        return new b(null, new HashSet(hashSet), new HashSet(hashSet2), 0, 0, new H3.l(1, obj), hashSet3);
    }

    public final String toString() {
        return "Component<" + Arrays.toString(this.f2715b.toArray()) + ">{" + this.f2717d + ", type=" + this.f2718e + ", deps=" + Arrays.toString(this.f2716c.toArray()) + "}";
    }
}
