package defpackage;

import io.appmetrica.analytics.RtmErrorEvent;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* loaded from: classes15.dex */
public interface x22 {
    default void a(Set set) {
        i("experiments", Objects.toString(set, null));
    }

    void b(String str);

    void c(String str, String str2, Object obj);

    void d(String str, String str2, Integer num, Boolean bool, Boolean bool2);

    void e(String str, Throwable th);

    void f(String str, String str2, Object obj, String str3, Object obj2);

    void g(String str, String str2, Object obj, String str3, Object obj2, String str4, Object obj3, String str5, Object obj4);

    void h(String str, String str2, Object obj, String str3, Object obj2, String str4, Object obj3);

    void i(String str, String str2);

    void j(String str, RtmErrorEvent.ErrorLevel errorLevel, Map map);

    void pauseSession();

    void reportError(String str, Throwable th);

    void reportEvent(String str);

    void reportEvent(String str, Map map);

    void resumeSession();
}
