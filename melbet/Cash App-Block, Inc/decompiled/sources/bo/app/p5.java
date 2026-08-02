package bo.app;

import com.braze.configuration.BrazeConfigurationProvider;
import com.braze.enums.DataStoreKey;
import com.braze.support.BrazeLogger;
import com.braze.support.DateTimeUtils;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final class p5 {
    public final void a(BrazeConfigurationProvider brazeConfigurationProvider, qd qdVar, d9 d9Var, String str) {
        brazeConfigurationProvider.getClass();
        qdVar.getClass();
        d9Var.getClass();
        str.getClass();
        i2 i2Var = (i2) d9Var;
        i2Var.g = str;
        i2Var.h = brazeConfigurationProvider.getBrazeApiKey().a;
        i2Var.i = "42.2.0";
        long nowInMilliseconds = DateTimeUtils.nowInMilliseconds();
        i2Var.f = Long.valueOf(nowInMilliseconds);
        i2Var.e = Long.valueOf(nowInMilliseconds / 1000);
        if (!brazeConfigurationProvider.isSdkAuthenticationEnabled()) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.V, (Throwable) null, false, (Function0) new o8$$ExternalSyntheticLambda6(29), 6, (Object) null);
        } else {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.V, (Throwable) null, false, (Function0) new h$$ExternalSyntheticLambda0(qdVar, 17), 6, (Object) null);
            i2Var.k = String.valueOf(qdVar.d.readData(DataStoreKey.SDK_AUTH, ""));
        }
    }

    public static final String a(qd qdVar) {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Adding SDK Auth token to request '", String.valueOf(qdVar.d.readData(DataStoreKey.SDK_AUTH, "")), "'");
    }

    public static final String a() {
        return "SDK Auth is disabled, not adding signature to request";
    }
}
