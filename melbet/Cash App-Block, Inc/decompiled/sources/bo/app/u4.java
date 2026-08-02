package bo.app;

import android.content.Context;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import com.braze.enums.DataStoreKey;
import com.braze.enums.DelayedInitializationAnalyticsBehavior;
import com.braze.support.BrazeLogger;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class u4 {
    public final t4 a;
    public final CopyOnWriteArrayList b;

    public u4(Context context) {
        context.getClass();
        this.a = new t4(context);
        this.b = new CopyOnWriteArrayList();
    }

    public final void a(a9 a9Var) {
        a9Var.getClass();
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.V, (Throwable) null, false, (Function0) new h$$ExternalSyntheticLambda0(this, 21), 6, (Object) null);
        Iterator it = this.b.iterator();
        it.getClass();
        while (it.hasNext()) {
            y8 y8Var = (y8) it.next();
            y8Var.getClass();
            ((e2) a9Var).a(y8Var);
        }
        this.b.clear();
    }

    public final void b(DelayedInitializationAnalyticsBehavior delayedInitializationAnalyticsBehavior) {
        delayedInitializationAnalyticsBehavior.getClass();
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.V, (Throwable) null, false, (Function0) new u4$$ExternalSyntheticLambda0(0), 6, (Object) null);
        b(true);
        this.a.writeData(DataStoreKey.DELAYED_INIT_SET_DURING_RUNTIME_FLAG, Boolean.TRUE);
        c(delayedInitializationAnalyticsBehavior);
    }

    public final void c(DelayedInitializationAnalyticsBehavior delayedInitializationAnalyticsBehavior) {
        delayedInitializationAnalyticsBehavior.getClass();
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.I, (Throwable) null, false, (Function0) new u4$$ExternalSyntheticLambda2(delayedInitializationAnalyticsBehavior, 0), 6, (Object) null);
        this.a.writeData(DataStoreKey.DELAYED_INIT_ANALYTICS_BEHAVIOR_FLAG, delayedInitializationAnalyticsBehavior.getValue());
    }

    public final boolean c() {
        return Intrinsics.areEqual(this.a.readBoolean(DataStoreKey.DELAYED_INIT_ENABLED, Boolean.FALSE), Boolean.TRUE);
    }

    public static final String b() {
        return "Enqueuing push analytics event";
    }

    public final void b(boolean z) {
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.I, (Throwable) null, false, (Function0) new u4$$ExternalSyntheticLambda1(z, 0), 6, (Object) null);
        this.a.writeData(DataStoreKey.DELAYED_INIT_ENABLED, Boolean.valueOf(z));
    }

    public static final String a(DelayedInitializationAnalyticsBehavior delayedInitializationAnalyticsBehavior) {
        return Recorder$$ExternalSyntheticOutline2.m("Setting delayed initialization analytics behavior to: ", delayedInitializationAnalyticsBehavior.getValue());
    }

    public final void a(y8 y8Var) {
        y8Var.getClass();
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.V, (Throwable) null, false, (Function0) new w$$ExternalSyntheticLambda0(10), 6, (Object) null);
        if (DelayedInitializationAnalyticsBehavior.INSTANCE.fromString(this.a.readString(DataStoreKey.DELAYED_INIT_ANALYTICS_BEHAVIOR_FLAG, "")) == DelayedInitializationAnalyticsBehavior.QUEUE) {
            this.b.add(y8Var);
        }
    }

    public static final String a() {
        return "enableDelayedInitialization invoked";
    }

    public static final String a(boolean z) {
        return "Setting delayed initialization enabled to: " + z;
    }

    public static final String a(u4 u4Var) {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(u4Var.b.size(), "Flushing push analytics queue with ", " events");
    }
}
