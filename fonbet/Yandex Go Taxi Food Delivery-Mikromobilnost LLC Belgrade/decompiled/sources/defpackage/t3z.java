package defpackage;

import com.yandex.messaging.internal.LocalMessageRef;

/* loaded from: classes15.dex */
public final class t3z {
    public static LocalMessageRef a(long j) {
        z83.h(null, j > 0);
        return new LocalMessageRef(j, null, null, Long.valueOf(j));
    }

    public static LocalMessageRef b(String str) {
        return new LocalMessageRef(0L, str, null, null);
    }
}
