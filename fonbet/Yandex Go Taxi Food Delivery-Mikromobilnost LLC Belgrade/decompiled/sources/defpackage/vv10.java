package defpackage;

import com.yandex.messaging.analytics.msgsent.MessageSentReporter$Source;
import kotlin.Pair;
import kotlin.collections.b;

/* loaded from: classes15.dex */
public final class vv10 {
    public final x22 a;

    public vv10(x22 x22Var) {
        this.a = x22Var;
    }

    public final void a(zoq0 zoq0Var, String str, boolean z, MessageSentReporter$Source messageSentReporter$Source) {
        zoq0Var.a.getClass();
        long currentTimeMillis = System.currentTimeMillis();
        long j = zoq0Var.d;
        this.a.reportEvent("msg time 2 backend", b.i(new Pair("time_diff", Long.valueOf(currentTimeMillis - j)), new Pair("time_diff_insert", Long.valueOf(zoq0Var.e - j)), new Pair("msg_type", zoq0Var.a()), new Pair("connection_status", Integer.valueOf(zoq0Var.c)), new Pair("chat_type", str), new Pair("is_predicted", Boolean.valueOf(z)), new Pair("source", Integer.valueOf(messageSentReporter$Source.ordinal()))));
    }
}
