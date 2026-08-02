package T3;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes2.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final String f3169a;

    /* renamed from: b, reason: collision with root package name */
    public final Set f3170b;

    /* renamed from: c, reason: collision with root package name */
    public final Set f3171c;

    /* renamed from: d, reason: collision with root package name */
    public final int f3172d;

    /* renamed from: e, reason: collision with root package name */
    public final int f3173e;

    /* renamed from: f, reason: collision with root package name */
    public final e f3174f;

    /* renamed from: g, reason: collision with root package name */
    public final Set f3175g;

    public b(String str, Set set, Set set2, int i, int i4, e eVar, Set set3) {
        this.f3169a = str;
        this.f3170b = Collections.unmodifiableSet(set);
        this.f3171c = Collections.unmodifiableSet(set2);
        this.f3172d = i;
        this.f3173e = i4;
        this.f3174f = eVar;
        this.f3175g = Collections.unmodifiableSet(set3);
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
            com.bumptech.glide.g.g(cls2, "Null interface");
            hashSet.add(r.a(cls2));
        }
        return new b(null, new HashSet(hashSet), new HashSet(hashSet2), 0, 0, new J3.l(2, obj), hashSet3);
    }

    public final String toString() {
        return "Component<" + Arrays.toString(this.f3170b.toArray()) + ">{" + this.f3172d + ", type=" + this.f3173e + ", deps=" + Arrays.toString(this.f3171c.toArray()) + "}";
    }
}
