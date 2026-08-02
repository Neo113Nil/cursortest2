package yads;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import defpackage.jy31;
import defpackage.t571;

/* loaded from: classes7.dex */
public final class e23 extends BroadcastReceiver {
    public final /* synthetic */ t571 a;

    public e23(t571 t571Var) {
        this.a = t571Var;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        t571 t571Var = this.a;
        t571Var.b.post(new jy31(20, t571Var));
    }
}
