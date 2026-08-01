package k6;

import L3.v;
import com.anythink.core.common.d.j;
import java.util.Locale;
import java.util.Map;
import java.util.Properties;
import java.util.function.Predicate;

/* loaded from: classes2.dex */
public abstract class d {

    /* renamed from: a, reason: collision with root package name */
    public static final v f38684a = new v("suppress_instrumentation", 2);

    public static void a(String str, boolean z3) {
        if (!z3) {
            throw new IllegalArgumentException(str);
        }
    }

    public static String b(String str, String str2) {
        final String replace = str.toLowerCase(Locale.ROOT).replace("-", j.f12378z);
        final int i = 0;
        String str3 = (String) ((Properties) System.getProperties().clone()).entrySet().stream().filter(new Predicate() { // from class: k6.b
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                Map.Entry entry = (Map.Entry) obj;
                switch (i) {
                    case 0:
                        return replace.equals(entry.getKey().toString().toLowerCase(Locale.ROOT).replace("-", j.f12378z));
                    default:
                        return replace.equals(((String) entry.getKey()).toLowerCase(Locale.ROOT).replace("_", j.f12378z));
                }
            }
        }).map(new K6.b(25)).findFirst().orElse(null);
        if (str3 != null) {
            return str3;
        }
        final int i6 = 1;
        return (String) System.getenv().entrySet().stream().filter(new Predicate() { // from class: k6.b
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                Map.Entry entry = (Map.Entry) obj;
                switch (i6) {
                    case 0:
                        return replace.equals(entry.getKey().toString().toLowerCase(Locale.ROOT).replace("-", j.f12378z));
                    default:
                        return replace.equals(((String) entry.getKey()).toLowerCase(Locale.ROOT).replace("_", j.f12378z));
                }
            }
        }).map(new K6.b(26)).findFirst().orElse(str2);
    }

    public static Object c(Object obj, String str) {
        try {
            return Class.forName(str).getDeclaredMethod("getNoop", new Class[0]).invoke(null, new Object[0]);
        } catch (Exception unused) {
            return obj;
        }
    }
}
