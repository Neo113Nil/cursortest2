package bo.app;

import com.braze.support.BrazeLogger;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final class u7 {
    public final t7 a;
    public boolean b;

    public u7(t7 t7Var) {
        t7Var.getClass();
        this.a = t7Var;
    }

    public static final String b(y8 y8Var) {
        return "Storage manager is closed. Not adding event: " + y8Var;
    }

    public final void a(r7 r7Var) {
        r7Var.getClass();
        if (this.b) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) null, false, (Function0) new w$$ExternalSyntheticLambda0(11), 6, (Object) null);
            return;
        }
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new w$$ExternalSyntheticLambda0(12), 7, (Object) null);
        List list = CollectionsKt.toList(this.a.c());
        BrazeLogger.brazelog$default(brazeLogger, (Object) this, BrazeLogger.Priority.V, (Throwable) null, false, (Function0) new h2$$ExternalSyntheticLambda0(list, 7), 6, (Object) null);
        list.getClass();
        r7Var.b(new o5(n5.ADD_BRAZE_EVENTS, list, null, null, 12), o5.class);
    }

    public static final String b() {
        return "Started offline event recovery task.";
    }

    public final void a(LinkedHashSet linkedHashSet) {
        linkedHashSet.getClass();
        if (this.b) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) null, false, (Function0) new h$$ExternalSyntheticLambda0(linkedHashSet, 22), 6, (Object) null);
        } else {
            this.a.a(linkedHashSet);
        }
    }

    public static final String a(Set set) {
        return "Storage manager is closed. Not deleting events: " + set;
    }

    public final void a(y8 y8Var) {
        y8Var.getClass();
        if (this.b) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) null, false, (Function0) new m7$$ExternalSyntheticLambda1(y8Var, 8), 6, (Object) null);
        } else {
            this.a.a(y8Var);
        }
    }

    public static final String a() {
        return "Storage manager is closed. Not starting offline recovery.";
    }

    public static final String a(List list) {
        return "Adding events to dispatch from storage: " + list;
    }
}
