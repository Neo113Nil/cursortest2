package E0;

import java.io.Serializable;

/* loaded from: classes.dex */
public abstract class c implements I0.a, Serializable {

    /* renamed from: e, reason: collision with root package name */
    public transient I0.a f295e;

    /* renamed from: f, reason: collision with root package name */
    public final Object f296f;

    /* renamed from: g, reason: collision with root package name */
    public final Class f297g;

    /* renamed from: h, reason: collision with root package name */
    public final String f298h;

    /* renamed from: i, reason: collision with root package name */
    public final String f299i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f300j;

    public c(Object obj, Class cls, String str, String str2, boolean z2) {
        this.f296f = obj;
        this.f297g = cls;
        this.f298h = str;
        this.f299i = str2;
        this.f300j = z2;
    }

    public abstract I0.a b();

    public final d c() {
        Class cls = this.f297g;
        if (!this.f300j) {
            return q.a(cls);
        }
        q.f314a.getClass();
        return new k(cls);
    }
}
