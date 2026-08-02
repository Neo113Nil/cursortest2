package defpackage;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final class xxw extends fsn {
    public final Context a;
    public final /* synthetic */ pmd b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xxw(pmd pmdVar, Context context) {
        super(Looper.myLooper() == null ? Looper.getMainLooper() : Looper.myLooper(), 1);
        this.b = pmdVar;
        this.a = context.getApplicationContext();
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        int i = message.what;
        if (i != 1) {
            Log.w("GoogleApiAvailability", "Don't know how to handle this message: " + i);
            return;
        }
        int i2 = qmd.a;
        pmd pmdVar = this.b;
        Context context = this.a;
        int b = pmdVar.b(context, i2);
        AtomicBoolean atomicBoolean = rnd.a;
        if (b == 1 || b == 2 || b == 3 || b == 9) {
            Intent a = pmdVar.a(context, "n", b);
            pmdVar.h(context, b, a == null ? null : PendingIntent.getActivity(context, 0, a, 201326592));
        }
    }
}
