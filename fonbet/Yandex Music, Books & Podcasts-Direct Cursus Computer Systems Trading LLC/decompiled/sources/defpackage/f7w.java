package defpackage;

import io.appmetrica.analytics.rtm.internal.Constants;
import java.util.Map;
import kotlin.Pair;

/* loaded from: classes4.dex */
public final class f7w {
    public static final f7w a = new f7w();

    public static void a(String str, String str2) {
        Pair pair = new Pair(Constants.KEY_MESSAGE, str2);
        ci0 ci0Var = qjb.a;
        Map e = uah.e(pair, new Pair("timestamp", Long.valueOf(qee.n())));
        z3i z3iVar = z3i.c;
        if (z3iVar != null) {
            z3iVar.b(str, e);
        }
    }
}
