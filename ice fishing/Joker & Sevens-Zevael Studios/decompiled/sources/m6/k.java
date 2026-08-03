package m6;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Looper;
import android.os.Message;
import android.util.Log;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class k extends a7.c {

    /* renamed from: a, reason: collision with root package name */
    public final Context f4921a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e f4922b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(e eVar, Context context) {
        super(Looper.myLooper() == null ? Looper.getMainLooper() : Looper.myLooper(), 2);
        this.f4922b = eVar;
        this.f4921a = context.getApplicationContext();
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        int i10 = message.what;
        if (i10 != 1) {
            Log.w("GoogleApiAvailability", "Don't know how to handle this message: " + i10);
            return;
        }
        int i11 = f.f4914a;
        e eVar = this.f4922b;
        Context context = this.f4921a;
        int b2 = eVar.b(context, i11);
        int i12 = h.f4918c;
        if (b2 == 1 || b2 == 2 || b2 == 3 || b2 == 9) {
            Intent a6 = eVar.a(b2, context, ka.a.PUSH_MINIFIED_BUTTON_TEXT);
            eVar.f(context, b2, a6 == null ? null : PendingIntent.getActivity(context, 0, a6, 201326592));
        }
    }
}
