package r6;

/* renamed from: r6.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4960a {

    /* renamed from: b, reason: collision with root package name */
    public static final C4960a f40385b = new C4960a(0);

    /* renamed from: c, reason: collision with root package name */
    public static final C4960a f40386c = new C4960a(1);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f40387a;

    public /* synthetic */ C4960a(int i) {
        this.f40387a = i;
    }

    public final String toString() {
        switch (this.f40387a) {
            case 0:
                return "DefaultContextPropagators{textMapPropagator=" + f40386c + "}";
            default:
                return "NoopTextMapPropagator";
        }
    }
}
