package defpackage;

import com.yandex.android.common.assertion.AssertEnvironment;
import com.yandex.android.common.assertion.AssertionReporter;

/* loaded from: classes3.dex */
public abstract class uq1 {
    public static AssertEnvironment a;

    public static void a(String str, AssertionError assertionError) {
        AssertEnvironment b = b();
        if (b.throwErrors()) {
            throw assertionError;
        }
        AssertionReporter reportAsserts = b.reportAsserts();
        if (reportAsserts != null) {
            reportAsserts.a();
        }
    }

    public static AssertEnvironment b() {
        if (a == null) {
            a = new AssertEnvironment();
        }
        return a;
    }
}
