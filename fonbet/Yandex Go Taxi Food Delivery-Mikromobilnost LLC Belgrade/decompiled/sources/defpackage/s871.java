package defpackage;

import java.util.LinkedHashMap;

/* loaded from: classes7.dex */
public final class s871 {
    public static final s571 b = new s571();
    public static volatile s871 c;
    public final LinkedHashMap a = new LinkedHashMap();

    public s871() {
        a("window_type_browser", new qa81());
        a("window_type_activity_result", new di71());
    }

    public final synchronized void a(String str, m271 m271Var) {
        if (!this.a.containsKey(str)) {
            this.a.put(str, m271Var);
        }
    }
}
