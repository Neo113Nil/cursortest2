package na;

import android.content.Context;
import o4.u;
import p4.n;
import p6.i;
import pc.j;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class h {
    public static final h INSTANCE = new h();

    private h() {
    }

    private final void initializeWorkManager(Context context) {
        try {
            context.getApplicationContext();
            n.b(context, new o4.b(new i()));
        } catch (IllegalStateException e10) {
            com.onesignal.debug.internal.logging.b.error("OSWorkManagerHelper initializing WorkManager failed: ", e10);
        }
    }

    public final synchronized u getInstance(Context context) {
        n a6;
        j.e(context, "context");
        try {
            a6 = n.a(context);
        } catch (IllegalStateException e10) {
            com.onesignal.debug.internal.logging.b.error("OSWorkManagerHelper.getInstance failed, attempting to initialize: ", e10);
            initializeWorkManager(context);
            a6 = n.a(context);
        }
        return a6;
    }
}
