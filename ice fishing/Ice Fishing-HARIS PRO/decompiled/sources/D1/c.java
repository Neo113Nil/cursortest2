package D1;

import java.io.Serializable;

/* loaded from: classes.dex */
public abstract class c implements I1.a, Serializable {

    /* renamed from: a, reason: collision with root package name */
    public transient I1.a f153a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f154b;

    /* renamed from: c, reason: collision with root package name */
    public final Class f155c;

    /* renamed from: d, reason: collision with root package name */
    public final String f156d;
    public final String e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f157f;

    public c(Object obj, Class cls, String str, String str2, boolean z2) {
        this.f154b = obj;
        this.f155c = cls;
        this.f156d = str;
        this.e = str2;
        this.f157f = z2;
    }

    public final d a() {
        Class cls = this.f155c;
        if (!this.f157f) {
            return o.a(cls);
        }
        o.f171a.getClass();
        return new k(cls);
    }
}
