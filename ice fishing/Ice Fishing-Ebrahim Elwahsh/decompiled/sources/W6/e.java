package W6;

/* loaded from: classes2.dex */
public interface e {
    static {
        b6.b bVar = b6.b.f5560n;
        g6.e.a(bVar, "exception.type");
        g6.e.a(bVar, "exception.message");
        g6.e.a(bVar, "exception.stacktrace");
    }

    static L2.i h() {
        Boolean.parseBoolean(g6.d.b("otel.experimental.sdk.jvm_stacktrace", "false"));
        return new L2.i(9);
    }
}
