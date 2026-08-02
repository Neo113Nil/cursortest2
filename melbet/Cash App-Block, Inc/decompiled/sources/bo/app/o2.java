package bo.app;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.braze.coroutine.BrazeCoroutineScope;
import com.braze.support.BrazeLogger;
import kotlin.jvm.functions.Function0;
import kotlinx.coroutines.JobKt;

/* loaded from: classes3.dex */
public final class o2 extends BroadcastReceiver {
    public final /* synthetic */ q2 a;

    public o2(q2 q2Var) {
        this.a = q2Var;
    }

    public static final String a() {
        return "Session seal logic executing in broadcast";
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        context.getClass();
        intent.getClass();
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.V, (Throwable) null, false, (Function0) new n8$$ExternalSyntheticLambda1(11), 6, (Object) null);
        JobKt.launch$default(BrazeCoroutineScope.INSTANCE, null, null, new n2(this.a, goAsync(), null), 3);
    }
}
