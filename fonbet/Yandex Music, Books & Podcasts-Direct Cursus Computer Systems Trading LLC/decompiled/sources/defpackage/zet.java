package defpackage;

import java.util.Collections;
import java.util.Set;
import org.joda.time.DateTimeZone;

/* loaded from: classes5.dex */
public final class zet implements tzm {
    public static final Set a = Collections.singleton("UTC");

    @Override // defpackage.tzm
    public final DateTimeZone a(String str) {
        if ("UTC".equalsIgnoreCase(str)) {
            return DateTimeZone.a;
        }
        return null;
    }

    @Override // defpackage.tzm
    public final Set b() {
        return a;
    }
}
