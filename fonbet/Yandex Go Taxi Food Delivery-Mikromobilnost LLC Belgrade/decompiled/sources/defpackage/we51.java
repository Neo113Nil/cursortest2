package defpackage;

import io.appmetrica.analytics.rtm.internal.Constants;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.b;
import ru.yandex.common.clid.ClidProvider;

/* loaded from: classes2.dex */
public final class we51 {
    public static final we51 a = new we51();

    public static void a(String str, String str2) {
        Pair pair = new Pair(Constants.KEY_MESSAGE, str2);
        jho.a.getClass();
        Map i = b.i(pair, new Pair(ClidProvider.TIMESTAMP, Long.valueOf(o450.a())));
        wb20 wb20Var = wb20.d;
        if (wb20Var != null) {
            wb20Var.b(str, i);
        }
    }
}
