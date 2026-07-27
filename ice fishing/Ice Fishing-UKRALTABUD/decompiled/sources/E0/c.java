package E0;

import java.io.Serializable;

/* loaded from: classes.dex */
public abstract class c implements H0.a, Serializable {

    /* renamed from: f, reason: collision with root package name */
    public transient H0.a f294f;

    /* renamed from: g, reason: collision with root package name */
    public final Object f295g;

    /* renamed from: h, reason: collision with root package name */
    public final Class f296h;

    /* renamed from: i, reason: collision with root package name */
    public final String f297i;

    /* renamed from: j, reason: collision with root package name */
    public final String f298j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f299k;

    public c(Object obj, Class cls, String str, String str2, boolean z2) {
        this.f295g = obj;
        this.f296h = cls;
        this.f297i = str;
        this.f298j = str2;
        this.f299k = z2;
    }

    public abstract H0.a b();

    public final d c() {
        Class cls = this.f296h;
        if (!this.f299k) {
            return q.a(cls);
        }
        q.f313a.getClass();
        return new k(cls);
    }
}
