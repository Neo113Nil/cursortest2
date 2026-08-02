package defpackage;

import io.appmetrica.analytics.rtm.internal.Constants;
import kotlin.Pair;
import kotlin.collections.b;
import kotlinx.serialization.json.c;

/* loaded from: classes15.dex */
public final class qro {
    public final x22 a;
    public final rro b;

    public qro(x22 x22Var, rro rroVar) {
        this.a = x22Var;
        this.b = rroVar;
    }

    public final void a(String str, c cVar) {
        this.a.reportEvent("ab_experiment_parse_error", b.i(new Pair("name", str), new Pair(Constants.KEY_DATA, cVar != null ? cVar.toString() : null)));
    }
}
