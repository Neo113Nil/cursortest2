package defpackage;

import io.appmetrica.analytics.coreutils.internal.StringUtils;

/* loaded from: classes4.dex */
public interface x9q extends z9q {
    String a();

    @Override // defpackage.z9q
    default String b() {
        return ouj.o(s(), StringUtils.PROCESS_POSTFIX_DELIMITER, a());
    }

    String s();
}
