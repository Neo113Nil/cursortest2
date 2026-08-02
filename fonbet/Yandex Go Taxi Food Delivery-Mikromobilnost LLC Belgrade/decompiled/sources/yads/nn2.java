package yads;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import defpackage.a681;
import defpackage.jy31;

/* loaded from: classes7.dex */
public final class nn2 extends BroadcastReceiver {
    public final /* synthetic */ a681 a;

    public nn2(a681 a681Var) {
        this.a = a681Var;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (isInitialStickyBroadcast()) {
            return;
        }
        a681 a681Var = this.a;
        a681Var.g.post(new jy31(29, a681Var));
    }
}
