package m0;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final class l extends A0.a {

    /* renamed from: a, reason: collision with root package name */
    public final Context f8183a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f f8184b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(f fVar, Context context) {
        super(Looper.myLooper() == null ? Looper.getMainLooper() : Looper.myLooper(), 1);
        this.f8184b = fVar;
        this.f8183a = context.getApplicationContext();
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        int i2 = message.what;
        if (i2 != 1) {
            Log.w("GoogleApiAvailability", "Don't know how to handle this message: " + i2);
            return;
        }
        int i3 = g.f8174a;
        f fVar = this.f8184b;
        Context context = this.f8183a;
        int b2 = fVar.b(context, i3);
        AtomicBoolean atomicBoolean = i.f8176a;
        if (b2 == 1 || b2 == 2 || b2 == 3 || b2 == 9) {
            Intent a2 = fVar.a(context, "n", b2);
            fVar.f(context, b2, a2 == null ? null : PendingIntent.getActivity(context, 0, a2, 201326592));
        }
    }
}
