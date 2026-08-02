package bo.app;

import com.braze.support.BrazeLogger;
import kotlin.jvm.functions.Function0;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsJVMKt;

/* loaded from: classes3.dex */
public final class g2 {
    public static final String b() {
        return "The leading character in the key string may not be '$'. Not adding property.";
    }

    public final boolean a(String str) {
        str.getClass();
        if (StringsKt.isBlank(str)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) null, false, (Function0) new g$$ExternalSyntheticLambda0(7), 6, (Object) null);
            return false;
        }
        if (!StringsKt__StringsJVMKt.startsWith(str, "$", false)) {
            return true;
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) null, false, (Function0) new g$$ExternalSyntheticLambda0(8), 6, (Object) null);
        return false;
    }

    public static final String a() {
        return "The BrazeProperties key cannot be null or contain only whitespaces. Not adding property.";
    }
}
