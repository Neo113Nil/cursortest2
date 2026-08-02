package O2;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final class k extends c3.e {

    /* renamed from: b, reason: collision with root package name */
    public final Context f2279b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e f2280c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(e eVar, Context context) {
        super(Looper.myLooper() == null ? Looper.getMainLooper() : Looper.myLooper(), 0, false);
        this.f2280c = eVar;
        this.f2279b = context.getApplicationContext();
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        int i = message.what;
        if (i != 1) {
            StringBuilder sb = new StringBuilder(50);
            sb.append("Don't know how to handle this message: ");
            sb.append(i);
            Log.w("GoogleApiAvailability", sb.toString());
            return;
        }
        int i4 = f.f2269a;
        e eVar = this.f2280c;
        Context context = this.f2279b;
        int c9 = eVar.c(context, i4);
        AtomicBoolean atomicBoolean = h.f2271a;
        if (c9 == 1 || c9 == 2 || c9 == 3 || c9 == 9) {
            Intent b9 = eVar.b(context, "n", c9);
            eVar.g(context, c9, b9 == null ? null : PendingIntent.getActivity(context, 0, b9, 201326592));
        }
    }
}
