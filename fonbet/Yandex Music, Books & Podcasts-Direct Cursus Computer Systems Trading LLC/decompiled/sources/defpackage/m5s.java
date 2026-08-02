package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class m5s extends BroadcastReceiver {
    public static final /* synthetic */ int f = 0;
    public final Context a;
    public final jyr b;
    public final jyr c;
    public final jyr d;
    public final jp0 e;

    public m5s(Context context) {
        this.a = context;
        bdt I = hag.I(o4s.class);
        l18 l18Var = l18.b;
        this.b = l18Var.b(I, true);
        this.c = l18Var.b(hag.I(g5s.class), true);
        this.d = btf.b(new eyq(23, this));
        this.e = new jp0(new vuq(0, this, m5s.class, "onDismiss", "onDismiss()V", 0, 23), ff7.i(context));
    }

    public final void a() {
        ((c5s) this.d.getValue()).getClass();
        int i = Build.VERSION.SDK_INT;
        Context context = this.a;
        if (i >= 34) {
            context.registerReceiver(this, new IntentFilter("TAKE_CHARGE_CLOSE_POPUP"), 2);
        } else {
            context.registerReceiver(this, new IntentFilter("TAKE_CHARGE_CLOSE_POPUP"));
        }
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        Continuation continuation = null;
        if (!Intrinsics.d(intent != null ? intent.getAction() : null, "TAKE_CHARGE_CLOSE_POPUP") || context == null) {
            return;
        }
        x97.y(wyf.F(((hn5) vq2.Q(context)).getLifecycle()), dm6.b(), null, new d7i(this, continuation, 26), 2);
    }
}
