package bo.app;

import com.braze.support.BrazeLogger;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final class gd implements dd {
    public static final String b(nb nbVar) {
        return "Shutdown sync got success response: " + nbVar;
    }

    @Override // bo.app.dd
    public final void a(j jVar) {
        jVar.getClass();
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new h$$ExternalSyntheticLambda0(jVar, 8), 7, (Object) null);
    }

    public static final String b(j jVar) {
        return "Shutdown sync got error response: " + jVar;
    }

    @Override // bo.app.dd
    public final void a(nb nbVar) {
        nbVar.getClass();
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new gd$$ExternalSyntheticLambda0(nbVar, 0), 7, (Object) null);
    }
}
