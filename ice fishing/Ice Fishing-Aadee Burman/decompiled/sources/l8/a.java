package l8;

import kotlin.jvm.internal.h;

/* loaded from: classes2.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f38934a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f38935b;

    /* renamed from: c, reason: collision with root package name */
    public c f38936c;

    /* renamed from: d, reason: collision with root package name */
    public long f38937d;

    public a(String name) {
        h.e(name, "name");
        this.f38934a = name;
        this.f38935b = true;
        this.f38937d = -1L;
    }

    public abstract long a();

    public final String toString() {
        return this.f38934a;
    }
}
