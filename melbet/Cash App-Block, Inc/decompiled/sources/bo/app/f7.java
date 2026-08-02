package bo.app;

import com.braze.support.BrazeLogger;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final class f7 {
    public final hf a;
    public final r7 b;

    public f7(hf hfVar, r7 r7Var) {
        hfVar.getClass();
        r7Var.getClass();
        this.a = hfVar;
        this.b = r7Var;
    }

    public static final String b() {
        return "Failed to delete the sealed session from the storage.";
    }

    public static final String d() {
        return "Error occured while publishing exception.";
    }

    public static final String e() {
        return "Failed to upsert active session in the storage.";
    }

    public final void a(r7 r7Var, Exception exc) {
        r7Var.getClass();
        exc.getClass();
        try {
            r7Var.b(new jf("A storage exception has occurred. Please view the stack trace for more details.", exc), jf.class);
        } catch (Exception e) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e, false, (Function0) new g$$ExternalSyntheticLambda0(5), 4, (Object) null);
        }
    }

    public final we c() {
        try {
            return this.a.c();
        } catch (Exception e) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e, false, (Function0) new g$$ExternalSyntheticLambda0(2), 4, (Object) null);
            this.a(this.b, e);
            return null;
        }
    }

    public final void a(we weVar) {
        weVar.getClass();
        try {
            this.a.a(weVar);
        } catch (Exception e) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e, false, (Function0) new g$$ExternalSyntheticLambda0(4), 4, (Object) null);
            a(this.b, e);
        }
    }

    public final void a(String str) {
        str.getClass();
        try {
            this.a.a(str);
        } catch (Exception e) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e, false, (Function0) new g$$ExternalSyntheticLambda0(3), 4, (Object) null);
            a(this.b, e);
        }
    }

    public static final String a() {
        return "Failed to get the active session from the storage.";
    }
}
