package bo.app;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import com.braze.coroutine.BrazeCoroutineScope;
import com.braze.support.BrazeLogger;
import java.util.Collection;
import java.util.Set;
import kotlin.Unit;
import kotlin.collections.EmptySet;
import kotlin.jvm.functions.Function0;
import kotlinx.coroutines.JobKt;

/* loaded from: classes3.dex */
public final class t7 {
    public final q1 a;
    public final r7 b;
    public boolean c;

    public t7(q1 q1Var, r7 r7Var) {
        q1Var.getClass();
        r7Var.getClass();
        this.a = q1Var;
        this.b = r7Var;
    }

    public static final String b() {
        return "Failed to get all events from storage.";
    }

    public static final String d() {
        return "Failed to log storage exception";
    }

    public final void a(String str, Function0 function0) {
        if (this.c) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) null, false, (Function0) new o6$$ExternalSyntheticLambda2(str, 23), 6, (Object) null);
        } else {
            JobKt.launch$default(BrazeCoroutineScope.INSTANCE, null, null, new s7(function0, this, str, null), 3);
        }
    }

    public final Collection c() {
        if (this.c) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) null, false, (Function0) new w$$ExternalSyntheticLambda0(4), 6, (Object) null);
            return EmptySet.INSTANCE;
        }
        try {
            return this.a.b();
        } catch (Exception e) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e, false, (Function0) new w$$ExternalSyntheticLambda0(5), 4, (Object) null);
            a(e);
            return EmptySet.INSTANCE;
        }
    }

    public final void a(y8 y8Var) {
        y8Var.getClass();
        a("add event " + y8Var, new n$$ExternalSyntheticLambda0(29, this, y8Var));
    }

    public static final Unit a(t7 t7Var, y8 y8Var) {
        t7Var.a.a(y8Var);
        return Unit.INSTANCE;
    }

    public final void a(Set set) {
        set.getClass();
        a("delete events " + set, new t7$$ExternalSyntheticLambda4(0, this, set));
    }

    public static final Unit a(t7 t7Var, Set set) {
        t7Var.a.a(set);
        return Unit.INSTANCE;
    }

    public final void a(Exception exc) {
        try {
            this.b.b(new jf("A storage exception has occurred!", exc), jf.class);
        } catch (Exception e) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e, false, (Function0) new w$$ExternalSyntheticLambda0(6), 4, (Object) null);
        }
    }

    public static final String a() {
        return "Storage provider is closed. Not getting all events.";
    }

    public static final String a(String str) {
        return Recorder$$ExternalSyntheticOutline2.m("Storage provider is closed. Failed to ", str);
    }
}
