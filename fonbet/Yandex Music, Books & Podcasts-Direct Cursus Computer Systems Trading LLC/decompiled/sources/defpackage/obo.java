package defpackage;

import java.io.IOException;
import kotlin.jvm.functions.Function1;

/* loaded from: classes4.dex */
public final class obo extends mbo {
    public final lm4 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public obo(lm4 lm4Var, lbo lboVar, Function1 function1, Function1 function12) {
        super(lboVar, function1, false, (Function1) new dgh(2, function12));
        function12.getClass();
        this.e = lm4Var;
    }

    public obo(gbo gboVar, Function1 function1) {
        this(ern.a(IOException.class), gboVar, function1, h01.d);
    }

    public obo(hbo hboVar, Function1 function1, Function1 function12) {
        this(ern.a(IOException.class), hboVar, function1, function12);
    }
}
