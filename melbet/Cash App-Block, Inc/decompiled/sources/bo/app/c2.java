package bo.app;

import android.content.Context;
import com.braze.configuration.BrazeConfigurationProvider;
import com.braze.support.BrazeLogger;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final class c2 implements o9 {
    public static final b2 d = new b2();
    public final e2 a;
    public final BrazeConfigurationProvider b;
    public final a2 c;

    public c2(Context context, e2 e2Var, BrazeConfigurationProvider brazeConfigurationProvider) {
        context.getClass();
        e2Var.getClass();
        brazeConfigurationProvider.getClass();
        this.a = e2Var;
        this.b = brazeConfigurationProvider;
        this.c = new a2(context, d.a(brazeConfigurationProvider), brazeConfigurationProvider);
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.I, (Throwable) null, false, (Function0) new b$$ExternalSyntheticLambda3(23), 6, (Object) null);
    }

    public static final String a() {
        return "Automatic location collection enabled via sdk configuration.";
    }

    public static final String b() {
        return "Automatic location collection disabled via sdk configuration.";
    }

    public static final String c() {
        return "***Location API not found. Please include android-sdk-location module***";
    }

    public static final String g() {
        return "Automatic location collection is disabled. Not requesting location update.";
    }

    public final boolean d() {
        if (this.b.isAutomaticLocationCollectionEnabled()) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.I, (Throwable) null, false, (Function0) new b$$ExternalSyntheticLambda3(25), 6, (Object) null);
            return false;
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.I, (Throwable) null, false, (Function0) new b$$ExternalSyntheticLambda3(26), 6, (Object) null);
        return true;
    }

    public final boolean f() {
        if (d()) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.I, (Throwable) null, false, (Function0) new b$$ExternalSyntheticLambda3(24), 6, (Object) null);
            return false;
        }
        this.c.getClass();
        return false;
    }
}
