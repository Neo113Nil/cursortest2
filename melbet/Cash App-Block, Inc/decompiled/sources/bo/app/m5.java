package bo.app;

import com.braze.support.BrazeLogger;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final class m5 {
    public final o5 a(ye yeVar) {
        if (yeVar == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new l$$ExternalSyntheticLambda0(11), 7, (Object) null);
        }
        return new o5(n5.FLUSH_PENDING_BRAZE_EVENTS, null, yeVar, null, 10);
    }

    public static final String a() {
        return "There should be a session ID here";
    }
}
