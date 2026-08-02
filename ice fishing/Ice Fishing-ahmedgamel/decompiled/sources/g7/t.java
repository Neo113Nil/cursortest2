package g7;

import D.x;
import h7.C4580a;
import i1.C4585b;
import i1.C4586c;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import n7.C4787b;

/* loaded from: classes2.dex */
public final class t implements m6.q {

    /* renamed from: f, reason: collision with root package name */
    public static final Logger f37712f = Logger.getLogger(t.class.getName());

    /* renamed from: g, reason: collision with root package name */
    public static final boolean f37713g = true;

    /* renamed from: h, reason: collision with root package name */
    public static final Pattern f37714h = Pattern.compile("([A-Za-z]){1}([A-Za-z0-9\\_\\-\\./]){0,254}");
    public static final m6.q i = m6.h.f39473n.a("noop").mo56build();

    /* renamed from: a, reason: collision with root package name */
    public final Object f37715a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f37716b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    public final C4787b f37717c;

    /* renamed from: d, reason: collision with root package name */
    public final Y6.a f37718d;

    /* renamed from: e, reason: collision with root package name */
    public final Map f37719e;

    public t(C4787b c4787b, Y6.a aVar, List list, C4580a c4580a) {
        this.f37718d = aVar;
        this.f37717c = c4787b;
        this.f37719e = (Map) list.stream().collect(Collectors.toMap(Function.identity(), new K6.b(23)));
    }

    public static boolean e(String str) {
        if (str != null && f37714h.matcher(str).matches()) {
            return true;
        }
        Level level = Level.WARNING;
        Logger logger = f37712f;
        if (!logger.isLoggable(level)) {
            return false;
        }
        logger.log(level, x.l("Instrument name \"", str, "\" is invalid, returning noop instrument. Instrument names must consist of 255 or fewer characters including alphanumeric, _, ., -, /, and start with a letter."), (Throwable) new AssertionError());
        return false;
    }

    @Override // m6.q
    public final m6.p a(String str) {
        return !e(str) ? i.a("noop") : f37713g ? new k(this, str, 1) : new o(this, str, 1);
    }

    @Override // m6.q
    public final m6.i b(String str) {
        return !e(str) ? i.b("noop") : f37713g ? new e(this, str, 0) : new o(this, str, 0);
    }

    @Override // m6.q
    public final m6.k c(String str) {
        return !e(str) ? i.c("noop") : f37713g ? new f(this, str) : new C4585b(this, str);
    }

    @Override // m6.q
    public final m6.m d(String str) {
        return !e(str) ? i.d("noop") : f37713g ? new h(this, str) : new C4586c(this, str);
    }

    public final String toString() {
        return "SdkMeter{instrumentationScopeInfo=" + this.f37718d + "}";
    }
}
