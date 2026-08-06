package M1;

import kotlin.jvm.internal.i;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f1084a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f1085b;

    /* renamed from: c, reason: collision with root package name */
    public c f1086c;

    /* renamed from: d, reason: collision with root package name */
    public long f1087d;

    public a(String name, boolean z2) {
        i.e(name, "name");
        this.f1084a = name;
        this.f1085b = z2;
        this.f1087d = -1L;
    }

    public abstract long a();

    public final String toString() {
        return this.f1084a;
    }
}
