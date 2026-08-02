package r6;

/* renamed from: r6.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4910a {

    /* renamed from: b, reason: collision with root package name */
    public static final C4910a f40221b = new C4910a(0);

    /* renamed from: c, reason: collision with root package name */
    public static final C4910a f40222c = new C4910a(1);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f40223a;

    public /* synthetic */ C4910a(int i) {
        this.f40223a = i;
    }

    public final String toString() {
        switch (this.f40223a) {
            case 0:
                return "DefaultContextPropagators{textMapPropagator=" + f40222c + "}";
            default:
                return "NoopTextMapPropagator";
        }
    }
}
