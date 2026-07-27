package u2;

import android.content.Context;
import android.os.Message;
import com.google.android.gms.internal.ads.AbstractC2865Ya;
import p2.C4835j;

/* renamed from: u2.A, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class HandlerC5068A extends a3.e {
    @Override // a3.e
    public final void a(Message message) {
        try {
            super.a(message);
        } catch (Throwable th) {
            C4835j c4835j = C4835j.f39730C;
            D d2 = c4835j.f39735c;
            Context context = c4835j.f39740h.f29521e;
            if (context != null) {
                try {
                    if (((Boolean) AbstractC2865Ya.f28684b.r()).booleanValue()) {
                        T2.b.a(context, th);
                    }
                } catch (IllegalStateException unused) {
                }
            }
            throw th;
        }
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        try {
            super.handleMessage(message);
        } catch (Exception e9) {
            C4835j.f39730C.f39740h.d("AdMobHandler.handleMessage", e9);
        }
    }
}
