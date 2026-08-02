package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import kotlin.coroutines.Continuation;

/* loaded from: classes3.dex */
public final class vx2 extends BroadcastReceiver {
    public final t5s a;
    public final xdr b;
    public final xdr c;
    public final tf6 d;
    public final u21 e;

    public vx2(t5s t5sVar) {
        this.a = t5sVar;
        xdr a = ydr.a(Boolean.TRUE);
        this.b = a;
        xdr a2 = ydr.a(Float.valueOf(1.0f));
        this.c = a2;
        this.d = gld.e(dm6.b);
        this.e = new u21(10, a, a2, new tx2(3, null));
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        context.getClass();
        Continuation continuation = null;
        String action = intent != null ? intent.getAction() : null;
        if (action == null || action.hashCode() != -1538406691 || !action.equals("android.intent.action.BATTERY_CHANGED")) {
            v3w.l("Unsupported action type ", intent != null ? intent.getAction() : null, 5, null, null);
            return;
        }
        int intExtra = intent.getIntExtra("status", -1);
        v3w.n(intExtra == 2 || intExtra == 5, this.b, null);
        l18 l18Var = l18.b;
        bdt I = hag.I(m4s.class);
        qdc qdcVar = l18Var.a;
        qdcVar.getClass();
        int intExtra2 = intent.getIntExtra("level", -1);
        int intExtra3 = intent.getIntExtra("scale", -1);
        if (intExtra3 <= 0 || intExtra2 < 0) {
            return;
        }
        x97.y(this.d, null, null, new ux2(this, intExtra2, intExtra3, continuation, 0), 3);
    }
}
