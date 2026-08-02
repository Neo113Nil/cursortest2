package bo.app;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.braze.coroutine.BrazeCoroutineScope;
import kotlinx.coroutines.JobKt;

/* loaded from: classes3.dex */
public final class i4 extends BroadcastReceiver {
    public final /* synthetic */ k4 a;

    public i4(k4 k4Var) {
        this.a = k4Var;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        context.getClass();
        intent.getClass();
        JobKt.launch$default(BrazeCoroutineScope.INSTANCE, null, null, new h4(this.a, intent, goAsync(), null), 3);
    }
}
