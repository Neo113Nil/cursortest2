package g7;

import D.y;
import g1.C4523c;
import h7.C4575a;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import n7.C4771b;

/* loaded from: classes2.dex */
public final class t implements m6.q {

    /* renamed from: f, reason: collision with root package name */
    public static final Logger f37687f = Logger.getLogger(t.class.getName());

    /* renamed from: g, reason: collision with root package name */
    public static final boolean f37688g = true;

    /* renamed from: h, reason: collision with root package name */
    public static final Pattern f37689h = Pattern.compile("([A-Za-z]){1}([A-Za-z0-9\\_\\-\\./]){0,254}");
    public static final m6.q i = m6.h.f39314n.a("noop").mo5build();

    /* renamed from: a, reason: collision with root package name */
    public final Object f37690a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f37691b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    public final C4771b f37692c;

    /* renamed from: d, reason: collision with root package name */
    public final Y6.a f37693d;

    /* renamed from: e, reason: collision with root package name */
    public final Map f37694e;

    public t(C4771b c4771b, Y6.a aVar, List list, C4575a c4575a) {
        this.f37693d = aVar;
        this.f37692c = c4771b;
        this.f37694e = (Map) list.stream().collect(Collectors.toMap(Function.identity(), new K6.b(23)));
    }

    public static boolean e(String str) {
        if (str != null && f37689h.matcher(str).matches()) {
            return true;
        }
        Level level = Level.WARNING;
        Logger logger = f37687f;
        if (!logger.isLoggable(level)) {
            return false;
        }
        logger.log(level, y.o("Instrument name \"", str, "\" is invalid, returning noop instrument. Instrument names must consist of 255 or fewer characters including alphanumeric, _, ., -, /, and start with a letter."), (Throwable) new AssertionError());
        return false;
    }

    @Override // m6.q
    public final m6.p a(String str) {
        return !e(str) ? i.a("noop") : f37688g ? new k(this, str, 1) : new o(this, str, 1);
    }

    @Override // m6.q
    public final m6.i b(String str) {
        return !e(str) ? i.b("noop") : f37688g ? new e(this, str, 0) : new o(this, str, 0);
    }

    @Override // m6.q
    public final m6.k c(String str) {
        return !e(str) ? i.c("noop") : f37688g ? new f(this, str) : new C4523c(this, str);
    }

    @Override // m6.q
    public final m6.m d(String str) {
        return !e(str) ? i.d("noop") : f37688g ? new h(this, str) : new F1.a(this, str);
    }

    public final String toString() {
        return "SdkMeter{instrumentationScopeInfo=" + this.f37693d + "}";
    }
}
