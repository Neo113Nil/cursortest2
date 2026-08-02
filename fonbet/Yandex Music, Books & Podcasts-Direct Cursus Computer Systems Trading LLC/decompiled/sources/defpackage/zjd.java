package defpackage;

import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.List;
import java.util.regex.Pattern;
import kotlin.collections.CollectionsKt;
import kotlin.text.StringsKt__StringsKt;

/* loaded from: classes5.dex */
public abstract class zjd {
    public static final Pattern a = Pattern.compile("\\[(.*?)]");

    public static String a(String str) {
        List split$default;
        split$default = StringsKt__StringsKt.split$default(str, new String[]{StringUtils.PROCESS_POSTFIX_DELIMITER}, false, 0, 6, null);
        return CollectionsKt.X(CollectionsKt.q0(split$default, 4), StringUtils.PROCESS_POSTFIX_DELIMITER, null, null, null, 62);
    }
}
