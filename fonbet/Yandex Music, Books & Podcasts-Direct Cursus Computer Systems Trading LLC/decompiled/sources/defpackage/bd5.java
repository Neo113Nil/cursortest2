package defpackage;

import io.appmetrica.analytics.coreutils.internal.StringUtils;

/* loaded from: classes3.dex */
public interface bd5 extends dd5 {
    String a();

    default String getId() {
        return ouj.o(s(), StringUtils.PROCESS_POSTFIX_DELIMITER, a());
    }

    String s();
}
