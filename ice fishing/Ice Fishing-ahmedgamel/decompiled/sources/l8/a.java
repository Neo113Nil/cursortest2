package l8;

import kotlin.jvm.internal.h;

/* loaded from: classes2.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f39002a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f39003b;

    /* renamed from: c, reason: collision with root package name */
    public c f39004c;

    /* renamed from: d, reason: collision with root package name */
    public long f39005d;

    public a(String name) {
        h.e(name, "name");
        this.f39002a = name;
        this.f39003b = true;
        this.f39005d = -1L;
    }

    public abstract long a();

    public final String toString() {
        return this.f39002a;
    }
}
