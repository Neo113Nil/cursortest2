package bo.app;

import com.braze.support.BrazeLogger;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final class s4 extends c7 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s4(c9 c9Var, q5 q5Var) {
        super(c9Var, q5Var);
        c9Var.getClass();
        q5Var.getClass();
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new h$$ExternalSyntheticLambda0(c9Var, 19), 7, (Object) null);
    }

    public static final String a(c9 c9Var) {
        return "Default queue created for dest " + c9Var;
    }

    @Override // bo.app.c7
    public final void a(long j) {
    }
}
