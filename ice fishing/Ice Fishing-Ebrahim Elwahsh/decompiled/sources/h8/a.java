package h8;

import kotlin.jvm.internal.h;

/* loaded from: classes2.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f38248a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f38249b;

    /* renamed from: c, reason: collision with root package name */
    public c f38250c;

    /* renamed from: d, reason: collision with root package name */
    public long f38251d;

    public a(String name) {
        h.e(name, "name");
        this.f38248a = name;
        this.f38249b = true;
        this.f38251d = -1L;
    }

    public abstract long a();

    public final String toString() {
        return this.f38248a;
    }
}
